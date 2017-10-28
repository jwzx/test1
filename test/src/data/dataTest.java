package data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;






public class dataTest {
	private static Logger logger = LoggerFactory
			.getLogger(dataTest.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String outJson =  "[{'pageInfo':{'pageTemplateId':1,'commPageId':1,'pageTemplateCname':'µÇÂ½Ò³ÃæÄ£°å','templatePic':'qwqewqew.png','pageTemplateEname':'loginPortal1','pageTemplateBgpic':'/FileManage/TemplateforUse/2016080111/201608011144224245.jpg','templateId':null,'templateUrl':'LoginPortalTemplate/jsp/loginPortal.jsp','booleanUp':2,'startTime':'2016-05-17 11:59:41','endTime':'2099-06-30 11:59:45','booleanTimeperiod':0,'timeperiodStartTime':'2016-05-31 12:40:30.0','timeperiodStartWeek':'2','timeperiodEndTime':'2016-05-31 20:40:34.0','timeperiodEndWeek':'4','commPageCname':'µÇÂ½Ò³Ãæ','commPageEname':'loginPortal','nextCommPageUrl':null,'prevCommPageUrl':null,'createTime':'2016-06-14 14:00:00','filemTime':'2016-06-14 14:00:00','more1':null,'more2':null}},{'recommend_1':[{'recommendId':54,'recommendTypeId':5,'recommendDisplayType':5,'gameId':0,'cartoonId':0,'ipId':0,'otherUrl':null,'commpageId':141,'activityId':14,'recommendPic':null,'recommendLabelpic':null,'rankId':1,'createTime':'2016-06-17 11:22:30','filemTime':'2017-08-15 15:55:56','more1':null,'more2':null,'recommendTypeCname':'µÇÂ½µØÖ·ÀàÐÍ','recommendTypeEname':'loginRecommend','pageTemplateId':null,'rightLabel':'','cname':''}]}]";
		
		
		/*String jspUrl = "";
		String MapJson = "{\"map\":"+outJson+"}";
		Map<String,List<Map<String,Map<String,Object>>>> JsonMap = 
				new HashMap<String,List<Map<String,Map<String,Object>>>>();
		try{
			JsonMap =  mapper.readValue(MapJson, Map.class);
			List<Map<String,Map<String,Object>>> list = JsonMap.get("map");
			Map<String,Map<String,Object>> pageinfo = list.get(0);
			Map<String,Object> jspUrlMap = pageinfo.get("pageInfo");
			jspUrl = jspUrlMap.get("templateUrl")+"";
		System.out.println(jspUrl);
		*/
		
		
	}	
}
