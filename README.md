# spring-boot-soap-learning

This Project's Goal,Soap Service learn in Spring Boot

## Installation

- Define this dependencies

```java

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web-services</artifactId>
        </dependency>

<dependency>
            <groupId>wsdl4j</groupId>
            <artifactId>wsdl4j</artifactId>
        </dependency>
```

- Writing your .xsd files and define plugin

```java

      <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>jaxb2-maven-plugin</artifactId>
                <version>1.6</version>
                <executions>
                    <execution>
                        <id>xjc</id>
                        <goals>
                            <goal>xjc</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <schemaDirectory>${project.basedir}/src/main/resources/</schemaDirectory>
                    <outputDirectory>${project.basedir}/src/main/java</outputDirectory>
                    <clearOutputDir>false</clearOutputDir>
                </configuration>
            </plugin>
```


## Technologies

- Spring Boot
- Spring Boot Web Service
- Lombok
- WSDLJ
- MYSQL
- Spring Boot Starter JDBC

## Document

## `                    `**Web Servis**
Web servisler, farklı cihazlar ve platformlar arasındaki iletişimi belirli bir standart haline getirmiş ve bir takım veri formatları ve protokollere göre yapabilmeyi sağlayan yapıdaki yazılımlara denir..

**SOAP**

SOAP(en: Simple Access Protocol) İstekleri veya mesajları internet üzerinden aktarma protokolü.

![Aspose Words 7d4d71d3-6256-4cce-a0a8-0a8500299eff 001](https://user-images.githubusercontent.com/80245013/163422629-4ae7b3e0-0955-4be4-b3b0-e440088c1257.png)

- **Envelope:**Bir Soap mesajının tamamını içerisinde bulunduran kısımdır.Mesajın root elemanıdır.

- **Header:** Klasik html’de bulunan <head></head> etiketine benzetilebilir. Bu bölümde mesajın meta-data bilgileri gönderilir.

- **Body:** Soap mesajının ana içeriğini barındıran kısımdır. Bu bölümde metotlarla ilgili bilgiler veya metodun sonucu yer alır.

|SOAP|REST|
| :- | :- |
|SOAP(en: Simple Access Protocol) İstekleri veya mesajları internet üzerinden aktarma protokolü.|REST( Representational State Transfer)İstemci ile Sunucu arasında iletişimi sağlayan servisdir.|
|Mesajları yalnızca XML formatında gönderilmektedir.|İstekler,JSON,XML.. hatta TEXT formatında da gönderilmektedir.|
|Mesajlar HTTP ve TCP/IP protokolleriyle iletilebilir.|İstekler yalnızca HTTP prokolüyle iletilebilir.|
|XSD adı verilen Producing yapısı ve WSDL adı verilen Consuming yapılarıyla çalışır.|İstekleri yerine getirmek için xsd ve wsdl yapılarına ihtiyaç duyulmaz.|
|Güvenlik açıkları daha azdır ve Projeye optimizasyonu daha kolaydır.|Güvenlik açığı SOAP’a göre daha fazladır ve Optimizasyonu zordur.|

[Muharrem Koç](https://github.com/muharremkoc)
