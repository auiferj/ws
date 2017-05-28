set Axis_Lib=D:\axis-1_4\lib
set Java_Cmd=Java -Djava.ext.dirs=%Axis_Lib%  
set Axis_Servlet=http://localhost:8080/ws-axis/services/HelloWSDD?wsdl
%Java_Cmd% org.apache.axis.wsdl.WSDL2Java -u %Axis_Servlet%