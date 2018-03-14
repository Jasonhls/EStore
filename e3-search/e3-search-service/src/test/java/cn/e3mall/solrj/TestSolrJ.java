package cn.e3mall.solrj;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class TestSolrJ {
	@Test
	public void addDocument() throws Exception {
		// 1、把solrJ的jar包添加到工程。
		// 2、创建一个SolrServer对象。创建一个和sorl服务的连接。HttpSolrServer。
		//如果不带Collection默认连接Collection1
		SolrServer solrServer = new HttpSolrServer("http://192.168.1.126:8080/solr/collection1");
		// 3、创建一个文档对象。SolrInputDocument。
		SolrInputDocument document = new SolrInputDocument();
		// 4、向文档对象中添加域。必须有一个id域。而且文档中使用的域必须在schema.xml中定义。
		document.addField("id", "test001");
		document.addField("item_title", "测试商品");
		// 5、把文档添加到索引库
		solrServer.add(document);
		// 6、Commit。
		solrServer.commit();
	}
	
	@Test
	public void deleteDocument() throws Exception{
		SolrServer solrServer = new HttpSolrServer("http://192.168.1.126:8080/solr/collection1");
		//solrServer.deleteById("test001");
		solrServer.deleteByQuery("id:test001");
		solrServer.commit();
	}
}
