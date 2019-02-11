FROM airhacks/glassfish
COPY ./target/megaretail.war ${DEPLOYMENT_DIR}
