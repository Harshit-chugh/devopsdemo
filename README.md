# Dev-ops Demo @ BRUDITE
DevOps Demonstration to Deploy a Java Based Application on AWS

Build the project by running-
```bash
> ./mvnw clean install
```

Run Spring-boot server-
```bash
> ./mvnw spring-boot:run
```
You can check the Application on [http://localhost:8080](http://localhost:8080)

To Stop the Application **Ctrl+C**

## Run The Application through Docker Locally

1. Check Docker version
```bash
> docker --version
```
2. Build Docker Image 
```bash
> docker build -t image_name . 
```
**Note: Don't forget the (.) Full-stop in the end.**

3. Run Docker Container
```bash
> docker run -p 8080:8080 iamge_name
```

4. Stop Docker Container
```bash
> docker container ps
CONTAINER ID   IMAGE            COMMAND                CREATED          STATUS          PORTS                    NAMES
2d4d9f42c8ad   brudite-devops   "java -jar /app.jar"   21 seconds ago   Up 16 seconds   0.0.0.0:8080->8080/tcp   sad_williams

> docker container stop 2d4d9f42c8ad
2d4d9f42c8ad 
```

## Push the docker image into ECR

1. Login to ECR
```bash
aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/x1y2z3a4
```

2. Change the docker tag
```bash
docker tag local_image_name:latest public.ecr.aws/x1y2z3a4/local_image_name:latest
```

3. Push the image to ECR
```bash
docker push public.ecr.aws/x1y2z3a4/local_image_name:latest 
```

## Push new changes to GIT
1. Create a new branch from existing branch and switch to new branch.
```bash
git checkout -b feature/firstname_lastname_brudite
```
2. Push your changes to remote repository with new branch
```bash
git add .
git commit -m "message"
git push origin feature/firstname_lastname_brudite
``` 
3. Create a Pull Request through Github-UI and Merge if Correctly deployed.






