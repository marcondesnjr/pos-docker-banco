# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM payara/server-full

ADD target/pos-docker-banco.war $DEPLOY_DIR
