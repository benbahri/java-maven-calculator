FROM tomcat:8-jre8

# Copier le fichier WAR généré
COPY target/*.war /usr/local/tomcat/webapps/
