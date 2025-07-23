# Use official Apache Tomcat image with Java 21
FROM tomcat:9-jdk21

# Optional: Clean default webapps (to avoid deploying examples/docs)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR to Tomcat's webapps folder as ROOT.war (so it loads at /)
COPY target/spring-mvc.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080 (Tomcat default)
EXPOSE 8080
