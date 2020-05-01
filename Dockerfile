FROM tomcat:9

# Take the war and copy to webapps of tomcat
COPY target/*.war C:/tomcat 9.0/webapps/RestSpringWeb.war