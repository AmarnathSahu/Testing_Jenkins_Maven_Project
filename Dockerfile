FROM tomcat:9

# Take the war and copy to webapps of tomcat
COPY target/*.war /usr/local/tomcat/webapps/RestSpringWeb.war

EXPOSE 8082

CMD ["catalina.sh", "run"]
