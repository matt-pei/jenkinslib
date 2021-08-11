package org.devops

// ansible
def AnsibleDeploy(host,command){
    sh "ansible ${command} ${host}"
}

// saltstack
def SaltDeploy(host,command){
    sh "salt \"${host}\" ${command}"
}

