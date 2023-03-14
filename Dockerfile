FROM openjdk:11
ADD ./src/calculator/target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
ENTRYPOINT [ "java","-jar","/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar" ]

# FROM ubuntu:latest

# # Install OpenSSH server and Java
# RUN apt-get update && \
#     apt-get install -y openssh-server && \
#     apt-get install -y default-jdk

# # Create a new user with passwordless sudo access
# RUN useradd -ms /bin/bash archit_sangal && \
#     echo "archit_sangal:password" | chpasswd && \
#     usermod -aG sudo archit_sangal && \
#     mkdir -p /etc/sudoers.d && \
#     echo "archit_sangal ALL=(ALL) NOPASSWD:ALL" > /etc/sudoers.d/nopasswd && \
#     chmod 0440 /etc/sudoers.d/nopasswd && \
#     echo "root:1234" | chpasswd
# RUN echo "1234" | su -c "service ssh start"

# # Expose port 22 for SSH
# EXPOSE 22

# Start the SSH server
# CMD ["/usr/sbin/sshd", "-D"]

# FROM ubuntu:latest
# EXPOSE 22

# RUN apt-get update && \
#     apt-get install -y openssh-server && \
#     apt-get install -y default-jdk

# WORKDIR ./
# ADD ./src/calculator/target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./

# RUN useradd -ms /bin/bash archit
# RUN echo "archit:1234" | chpasswd
# RUN usermod -aG sudo archit
# RUN service ssh start

# # ENTRYPOINT [ "java","-jar","/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar" ]

# # FROM ubuntu:18.04
# # # https://stackoverflow.com/questions/27701930/how-to-add-users-to-docker-container
# # # RUN useradd --create-home --shell /bin/bash archit
# # # RUN echo 'archit:1234' | chpasswd
# # # RUN adduser archit sudo
# # RUN apt-get install -y openjdk-11-jdk
# # RUN useradd -rm -d /home/archit -s /bin/bash -g root -G sudo -u 1001 archit
# # WORKDIR /home/archit
# # ADD ./src/calculator/target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
# # SHELL ["/bin/bash", "-o", "pipefail", "-c"]
# # RUN echo 'archit:1234' | chpasswd
# # USER archit
# # # ENTRYPOINT [ "java","-jar","/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar" ]

# # # Use an Ubuntu base image
# # FROM ubuntu:18.04

# # # Install OpenSSH server and Java
# # RUN apt-get update && \
# #     apt-get install -y openssh-server && \
# #     apt-get install -y default-jdk

# # # Create a new user with passwordless sudo access
# # RUN useradd -ms /bin/bash dockeruser
# # RUN echo "dockeruser:password" | chpasswd
# # RUN usermod -aG sudo dockeruser
# # RUN mkdir -p /etc/sudoers.d
# # RUN echo "dockeruser ALL=(ALL) NOPASSWD:ALL" >> /etc/sudoers.d/nopasswd

# # # Copy the JAR file into the container
# # ADD ./src/calculator/target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./

# # # Expose port 22 for SSH
# # EXPOSE 22

# # # Start the SSH server
# # CMD ["/usr/sbin/sshd", "-D"]