<!-- sort.jsp-->
<%@ page language="java" session="true"  import="java.util.*"
contentType="text/html; charset=GBK" %>
<html>
    <head><title>sort array</title></head>
    <body>
        <% String arr="";
           try{arr=request.getParameter("text");
			 String[] strarr=arr.split(" ");
			 int[] intarr=new int[strarr.length];
			 for (int i=0;i<strarr.length;i++){
				 intarr[i]=Integer.parseInt(strarr[i]);
			}
			int min=intarr[0];
			Arrays.sort(intarr);

			for (int i=0; i<intarr.length; i++) {%>
				<%= "" + intarr[i] + '\t' %>
				<% }
           }catch(Exception e){
             arr="";
           }
        %>
        <br>
        <jsp:include page="index.jsp" flush="true" />
    </body>
</html>
