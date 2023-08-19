# reggie_take_out
本项目（瑞吉外卖）是专门为餐饮企业（餐厅、饭店）定制的一款软件产品，包括系统管理后台和移动端应用两部分。其中系统管理后台主要提供给餐饮企业内部员工使用，可以对餐厅的菜品、套餐、订单等进行管理维护。移动端应用主要提供给消费者使用，可以在线浏览菜品、添加购物车、下单等。
## 介绍

### 前置知识

Java基础知识
Java Web
MySQL
Spring Boot
SSM（Spring、Spring MVC、MyBatis）
Maven

### 效果展示

移动端
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690717950273-c71ca55c-2cce-4754-b8c3-dc5350ebc4ba.png#averageHue=%23afb3bd&clientId=uf7495d85-8916-4&from=paste&height=448&id=u6e26a918&originHeight=448&originWidth=238&originalType=binary&ratio=1&rotation=0&showTitle=false&size=113299&status=done&style=none&taskId=u36b132b4-9bbc-4037-949a-be559c3feac&title=&width=238)
管理端
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690717995078-08db4cbc-66e3-44b4-b9b5-4c3609682566.png#averageHue=%23e6e4e9&clientId=uf7495d85-8916-4&from=paste&height=447&id=ua897c347&originHeight=447&originWidth=786&originalType=binary&ratio=1&rotation=0&showTitle=false&size=86091&status=done&style=none&taskId=u143805fe-f7a4-46c4-97b8-ed24aac851d&title=&width=786)
管理后台登录
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690718017023-b071aecc-4aeb-404f-b53e-34115b7a222c.png#averageHue=%23474a5b&clientId=uf7495d85-8916-4&from=paste&height=333&id=u3d8a662c&originHeight=333&originWidth=684&originalType=binary&ratio=1&rotation=0&showTitle=false&size=227584&status=done&style=none&taskId=u0dcf9acf-ce3d-4025-8909-defde469731&title=&width=684)

### 软件开发整体介绍

软件开发流程
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690718255143-6b41042c-e019-48a3-a243-b2d37baf9659.png#averageHue=%23faf8fa&clientId=uf7495d85-8916-4&from=paste&height=367&id=uccfed792&originHeight=367&originWidth=563&originalType=binary&ratio=1&rotation=0&showTitle=false&size=58219&status=done&style=none&taskId=u87de52c9-4924-4ba9-a6f0-e680b808dc7&title=&width=563)
角色分工
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690718324451-9413b46c-71b7-4d24-ab09-347bf45e8d1f.png#averageHue=%23ebe9eb&clientId=uf7495d85-8916-4&from=paste&height=248&id=ub0bffe64&originHeight=248&originWidth=523&originalType=binary&ratio=1&rotation=0&showTitle=false&size=93595&status=done&style=none&taskId=u96c61968-bfc6-405a-8f9c-781f6be2f14&title=&width=523)
软件环境
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690718401285-aa3fe4f3-aed2-4a92-8bc7-2875c46d08e8.png#averageHue=%23e9e7ea&clientId=uf7495d85-8916-4&from=paste&height=111&id=u129df1ad&originHeight=111&originWidth=785&originalType=binary&ratio=1&rotation=0&showTitle=false&size=70339&status=done&style=none&taskId=u8fd116d6-f529-4330-86db-c72e64cafc1&title=&width=785)

### 项目整体介绍

#### 项目介绍

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690718492053-6d4e9616-21a5-481f-abd7-7058e4c0991f.png#averageHue=%23eeecef&clientId=uf7495d85-8916-4&from=paste&height=284&id=u67c5564a&originHeight=284&originWidth=1001&originalType=binary&ratio=1&rotation=0&showTitle=false&size=173182&status=done&style=none&taskId=u2e97c2b3-81b1-4054-842a-03604df28ec&title=&width=1001)

#### 产品原型展示

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690718636564-aba7c71d-dd97-4458-9c8f-d9b2a956c3e8.png#averageHue=%23f8f6f8&clientId=uf7495d85-8916-4&from=paste&height=409&id=uaa514280&originHeight=409&originWidth=982&originalType=binary&ratio=1&rotation=0&showTitle=false&size=117458&status=done&style=none&taskId=u0fdbd3c6-e3d5-48c2-8734-4ca0a663faa&title=&width=982)
管理端：员工管理
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690718734268-471c990c-da1f-4ab8-aaa8-c5548552ff7c.png#averageHue=%23dfdde0&clientId=uf7495d85-8916-4&from=paste&height=405&id=u3d9941e8&originHeight=405&originWidth=1115&originalType=binary&ratio=1&rotation=0&showTitle=false&size=154466&status=done&style=none&taskId=u0ba38d96-93e7-4f00-8588-35c95e1bd2e&title=&width=1115)
管理端：订单明细
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690718767438-1d56f08d-3167-441e-bc01-9d585cbbaf13.png#averageHue=%23dcdadd&clientId=uf7495d85-8916-4&from=paste&height=426&id=u0004600e&originHeight=426&originWidth=1131&originalType=binary&ratio=1&rotation=0&showTitle=false&size=197422&status=done&style=none&taskId=u4ccce8b9-cce6-4bc2-837f-2ee7fd14d6e&title=&width=1131)
客户端：地址管理
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690718862488-6b20d9a7-91ad-4175-bd94-774a8104269d.png#averageHue=%23f5f3f6&clientId=uf7495d85-8916-4&from=paste&height=345&id=u72fcbecb&originHeight=345&originWidth=765&originalType=binary&ratio=1&rotation=0&showTitle=false&size=72315&status=done&style=none&taskId=u2bbae51f-1e29-4520-a87d-d79cff834c2&title=&width=765)
客户端：点餐
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690718918410-965fe8c7-bb72-4653-8528-de766e5bb19d.png#averageHue=%23f1efee&clientId=uf7495d85-8916-4&from=paste&height=810&id=u484edabf&originHeight=810&originWidth=1297&originalType=binary&ratio=1&rotation=0&showTitle=false&size=85764&status=done&style=none&taskId=uc019a516-139d-47d3-bc8e-4177497d493&title=&width=1297)

#### 技术选型

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690719232086-c18f4932-aa39-4e6b-8268-3dd20300201f.png#averageHue=%23f4f4fc&clientId=uf7495d85-8916-4&from=paste&height=330&id=u8a8b8f18&originHeight=330&originWidth=975&originalType=binary&ratio=1&rotation=0&showTitle=false&size=80180&status=done&style=none&taskId=u39c4d68a-1d5a-4ca5-a9d2-0dc982da820&title=&width=975)

#### 功能架构

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690719857891-a637473b-7c3b-4dde-be92-9618d4e09edb.png#averageHue=%2399d1df&clientId=uf7495d85-8916-4&from=paste&height=303&id=u0fac83dc&originHeight=303&originWidth=686&originalType=binary&ratio=1&rotation=0&showTitle=false&size=82753&status=done&style=none&taskId=ue9c9f2b9-6c65-492c-9a2b-52caec145f6&title=&width=686)

#### 角色

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690719949788-ffb69dd5-8e3d-413b-b544-d91b9ce01020.png#averageHue=%23e7e5e7&clientId=uf7495d85-8916-4&from=paste&height=110&id=u6fa35a4e&originHeight=110&originWidth=716&originalType=binary&ratio=1&rotation=0&showTitle=false&size=69835&status=done&style=none&taskId=ua40fd7c0-de5b-4bf1-9fd7-f61a83fb1b5&title=&width=716)

## 开发环境搭建

### 数据库环境搭建

#### 新建数据库

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690721773669-8ad885b0-eca2-4c0b-a7e9-710ac3f6f824.png#averageHue=%23f6f6f5&clientId=uf7495d85-8916-4&from=paste&height=399&id=u0ce4ed07&originHeight=399&originWidth=456&originalType=binary&ratio=1&rotation=0&showTitle=false&size=12913&status=done&style=none&taskId=u75f45b7f-096a-4be4-b61e-2061e779fff&title=&width=456)

#### 导入表结构

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690721829594-91539d8b-6785-4b6a-956a-ab538dc35622.png#averageHue=%23f3f1f4&clientId=uf7495d85-8916-4&from=paste&height=236&id=u67c05c53&originHeight=236&originWidth=771&originalType=binary&ratio=1&rotation=0&showTitle=false&size=80010&status=done&style=none&taskId=ucff089d9-95d3-40d5-8b00-fe9408723c0&title=&width=771)
[db_reggie.sql](https://www.yuque.com/attachments/yuque/0/2023/sql/38624107/1690721886502-64840d3b-4358-4b3a-b95f-6146898d888d.sql?_lake_card=%7B%22src%22%3A%22https%3A%2F%2Fwww.yuque.com%2Fattachments%2Fyuque%2F0%2F2023%2Fsql%2F38624107%2F1690721886502-64840d3b-4358-4b3a-b95f-6146898d888d.sql%22%2C%22name%22%3A%22db_reggie.sql%22%2C%22size%22%3A37441%2C%22ext%22%3A%22sql%22%2C%22source%22%3A%22%22%2C%22status%22%3A%22done%22%2C%22download%22%3Atrue%2C%22taskId%22%3A%22ua1087e49-2036-4ee5-867e-e8214488831%22%2C%22taskType%22%3A%22upload%22%2C%22type%22%3A%22%22%2C%22__spacing%22%3A%22both%22%2C%22mode%22%3A%22title%22%2C%22id%22%3A%22ue77b2163%22%2C%22margin%22%3A%7B%22top%22%3Atrue%2C%22bottom%22%3Atrue%7D%2C%22card%22%3A%22file%22%7D)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690721975970-c920c591-e112-48d6-92fc-f7462cba5be9.png#averageHue=%23f7f6f5&clientId=uf7495d85-8916-4&from=paste&height=666&id=u67e537e2&originHeight=666&originWidth=974&originalType=binary&ratio=1&rotation=0&showTitle=false&size=77220&status=done&style=none&taskId=ufbaf7919-5cbe-457f-bc1c-81a56501fb5&title=&width=974)

#### 数据表

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690722043319-2a4c5a5a-44fc-45c8-83fd-d2cbd66fb6b8.png#averageHue=%23ced5eb&clientId=uf7495d85-8916-4&from=paste&height=332&id=u647a4a81&originHeight=332&originWidth=446&originalType=binary&ratio=1&rotation=0&showTitle=false&size=82518&status=done&style=none&taskId=ua2fc8997-e4c0-4131-857c-04a6e971e7f&title=&width=446)

### maven项目搭建

#### 1.创建maven项目

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690739215137-d4e96249-17d5-4607-96cd-b31aeba605f2.png#averageHue=%233e4245&clientId=u096c0fb7-547a-4&from=paste&height=777&id=u52c750e7&originHeight=777&originWidth=800&originalType=binary&ratio=1&rotation=0&showTitle=false&size=63722&status=done&style=none&taskId=u394d437b-1122-4ad5-8076-a6e4b574d9a&title=&width=800)

#### 2.导入pom.xml文件

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690740890717-ab1c54ee-c107-42c8-ab53-652588fa3c40.png#averageHue=%23302e2c&clientId=u096c0fb7-547a-4&from=paste&height=309&id=u51a2b09e&originHeight=309&originWidth=487&originalType=binary&ratio=1&rotation=0&showTitle=false&size=33406&status=done&style=none&taskId=u9bd2197d-4691-4ba6-80da-199b3555c8d&title=&width=487)

#### 3.导入Spring Boot配置文件application.yml

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690740929720-5c435f4a-cfcb-47bd-b44b-b1ffd1e8b8a3.png#averageHue=%23fcf9fc&clientId=u096c0fb7-547a-4&from=paste&height=325&id=ud5fc5ce5&originHeight=325&originWidth=707&originalType=binary&ratio=1&rotation=0&showTitle=false&size=86196&status=done&style=none&taskId=u02bc4227-b12a-4ef8-83b1-1dda9355f3c&title=&width=707)

#### 4.编写启动类

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690742283566-226119c9-0cec-4e10-8072-eff98e5b490d.png#averageHue=%23fcfafc&clientId=u096c0fb7-547a-4&from=paste&height=223&id=uaaf33e8d&originHeight=223&originWidth=478&originalType=binary&ratio=1&rotation=0&showTitle=false&size=45142&status=done&style=none&taskId=u13a96ada-af22-41fe-8ce3-c6aaae9fa58&title=&width=478)

## 后台系统登录功能

### 需求分析

#### 1.页面原型展示

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690821895815-f6f42ad0-4be8-4ba8-8e06-40b8d69c6a1c.png#averageHue=%23fdfafd&clientId=u9e481ac4-522f-4&from=paste&height=213&id=ud96300a8&originHeight=213&originWidth=413&originalType=binary&ratio=1&rotation=0&showTitle=false&size=13316&status=done&style=none&taskId=ufda57f61-76d9-4525-a906-11064d96933&title=&width=413)

#### 2.登录页面展示

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690822011462-65ff2728-c2bb-403a-bc1a-4eb6d601e792.png#averageHue=%236f6d74&clientId=u9e481ac4-522f-4&from=paste&height=379&id=u9c588c18&originHeight=379&originWidth=735&originalType=binary&ratio=1&rotation=0&showTitle=false&size=166512&status=done&style=none&taskId=ufa0ee8d8-9a84-46fb-b3f1-3c2e0e36796&title=&width=735)

#### 3.查看登录请求信息

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690822151567-978650a8-2035-4b73-8c87-cf2e50bb596e.png#averageHue=%23faf8fa&clientId=u4a4edd70-65ae-4&from=paste&height=368&id=u7612b8e5&originHeight=368&originWidth=946&originalType=binary&ratio=1&rotation=0&showTitle=false&size=178276&status=done&style=none&taskId=uf59cb9dd-dc74-46da-91c2-00c930f350f&title=&width=946)

#### 4.数据模型（employee表）

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690822194895-7405d47a-f761-45cf-b89f-71e7d6a8ea7a.png#averageHue=%23f8f5f8&clientId=u4a4edd70-65ae-4&from=paste&height=359&id=u8e74a3bf&originHeight=359&originWidth=670&originalType=binary&ratio=1&rotation=0&showTitle=false&size=123441&status=done&style=none&taskId=u36301bf7-8d90-43be-abd0-06ca178c7be&title=&width=670)

### 代码开发

#### 1.创建实体类Employee，和employee表进行映射

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690822957525-3f4c1dd4-a271-4612-aab2-fded824a67b6.png#averageHue=%232d2c2b&clientId=u4a4edd70-65ae-4&from=paste&height=356&id=ub620b9ed&originHeight=356&originWidth=423&originalType=binary&ratio=1&rotation=0&showTitle=false&size=27339&status=done&style=none&taskId=u4f6c4132-7c09-4848-b617-91f6f978fc3&title=&width=423)

#### 2.创建Controller、Service、Mapper

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690822938433-fa4a73a4-d8ce-4a58-ab58-782a02e41545.png#averageHue=%23fbf9fc&clientId=u4a4edd70-65ae-4&from=paste&height=402&id=uec9f0413&originHeight=402&originWidth=565&originalType=binary&ratio=1&rotation=0&showTitle=false&size=90198&status=done&style=none&taskId=uf8629cfd-dc00-497c-bf28-076b2ff542c&title=&width=565)

#### 3.导入返回结果类R

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690823616974-cc9871b3-3c65-4dfe-82de-5836b8883977.png#averageHue=%23fbf8fb&clientId=u4a4edd70-65ae-4&from=paste&height=375&id=u7a8991d2&originHeight=375&originWidth=718&originalType=binary&ratio=1&rotation=0&showTitle=false&size=90546&status=done&style=none&taskId=ubd0739e8-0a26-4af1-a710-0c111c48e25&title=&width=718)

#### 4.在Controller中创建登录方法

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690824141487-28d6a867-2728-4725-aca0-a79f9e2db629.png#averageHue=%23f1eff1&clientId=u4a4edd70-65ae-4&from=paste&height=218&id=u96a99bd8&originHeight=218&originWidth=507&originalType=binary&ratio=1&rotation=0&showTitle=false&size=108438&status=done&style=none&taskId=u007280eb-befc-424c-b09c-c9f58a61580&title=&width=507)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690824148065-666e8c8b-4fbe-4d4e-807e-36d22ba5d689.png#averageHue=%23fbf9fb&clientId=u4a4edd70-65ae-4&from=paste&height=518&id=u2ad3bb74&originHeight=518&originWidth=409&originalType=binary&ratio=1&rotation=0&showTitle=false&size=111134&status=done&style=none&taskId=uebb5d7c2-0839-4532-a257-f004cbcef4b&title=&width=409)

## 后台系统退出功能

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690825464818-0e976f33-a446-4742-81bf-7d7a0eb97fe3.png#averageHue=%23efedf0&clientId=u4a4edd70-65ae-4&from=paste&height=76&id=uf280b808&originHeight=76&originWidth=938&originalType=binary&ratio=1&rotation=0&showTitle=false&size=73626&status=done&style=none&taskId=u5354d7a8-2acf-4994-9e4f-84d7e665fc6&title=&width=938)

### 代码开发

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690825734414-729cb894-0022-4773-9d91-9e6a5e164534.png#averageHue=%23f6f4f6&clientId=u4a4edd70-65ae-4&from=paste&height=132&id=u79897baf&originHeight=132&originWidth=730&originalType=binary&ratio=1&rotation=0&showTitle=false&size=66849&status=done&style=none&taskId=uba9a5924-0f27-475a-a49a-e03180b0342&title=&width=730)

## 完善登录功能

### 问题分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690857660191-5cec051c-e8ed-4dc8-842d-cf369a4d9ad4.png#averageHue=%23f5f3f5&clientId=uc5f1ea10-ee92-4&from=paste&height=226&id=u33ef616d&originHeight=226&originWidth=963&originalType=binary&ratio=1&rotation=0&showTitle=false&size=141416&status=done&style=none&taskId=ua01ef535-899e-4599-a06a-b3232f5e500&title=&width=963)

### 代码实现

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690857844664-0f042f36-61b2-48e9-ac47-110b572ae44d.png#averageHue=%23f6f4f6&clientId=uc5f1ea10-ee92-4&from=paste&height=135&id=ube32e8a8&originHeight=135&originWidth=424&originalType=binary&ratio=1&rotation=0&showTitle=false&size=42842&status=done&style=none&taskId=u6bd94c77-daab-42e2-9874-c93670f1fd2&title=&width=424)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690857947829-69c2a7b5-98b9-4fa2-8e0f-c39f1bfeacf1.png#averageHue=%23fbf9fb&clientId=uc5f1ea10-ee92-4&from=paste&height=427&id=ue0dc911b&originHeight=427&originWidth=802&originalType=binary&ratio=1&rotation=0&showTitle=false&size=149813&status=done&style=none&taskId=u91d7c870-405c-4787-940f-eb2b7c989ad&title=&width=802)

## 新增员工

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690861921442-ef659669-37b4-4997-b69b-9b9b07f64531.png#averageHue=%23fbf9fb&clientId=uc5f1ea10-ee92-4&from=paste&height=410&id=ubff9bf66&originHeight=410&originWidth=893&originalType=binary&ratio=1&rotation=0&showTitle=false&size=74081&status=done&style=none&taskId=ub7e9bbfd-bde1-4a23-9a7e-3dbf9f3b56d&title=&width=893)

### 数据模型

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690861994557-44d265a2-e864-431b-8952-3ba1705d7559.png#averageHue=%23f5f2f5&clientId=uc5f1ea10-ee92-4&from=paste&height=275&id=u0b818680&originHeight=275&originWidth=941&originalType=binary&ratio=1&rotation=0&showTitle=false&size=149351&status=done&style=none&taskId=uee167faa-95ff-4ad6-92fc-50911a645fe&title=&width=941)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690862079349-9fee459c-949c-4e57-9981-cb4e34834e73.png#averageHue=%23f7f5f7&clientId=uc5f1ea10-ee92-4&from=paste&height=437&id=u576195e4&originHeight=437&originWidth=526&originalType=binary&ratio=1&rotation=0&showTitle=false&size=125461&status=done&style=none&taskId=u209d4868-fa7b-424c-a19e-0dcb28f4c99&title=&width=526)

### 代码开发

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690862116799-c48b16a8-9cc8-459f-b601-5cf41618b81d.png#averageHue=%23f4f2f4&clientId=uc5f1ea10-ee92-4&from=paste&height=412&id=u6be27a28&originHeight=412&originWidth=728&originalType=binary&ratio=1&rotation=0&showTitle=false&size=183636&status=done&style=none&taskId=u0681a3ae-fe61-4760-80db-29aba7b8e27&title=&width=728)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690890098452-7b4eff25-6df8-4da9-b0c9-feb36f2c7515.png#averageHue=%23f6f4f6&clientId=u2e719145-fcb5-4&from=paste&height=323&id=uf61bb64c&originHeight=323&originWidth=940&originalType=binary&ratio=1&rotation=0&showTitle=false&size=183069&status=done&style=none&taskId=u20af9b4f-8645-45c3-a5a6-c320e1ee4cb&title=&width=940)

### 总结

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690891126131-300df0c2-de55-4f45-8e9d-1bf535fb2f7b.png#averageHue=%23e8e6e8&clientId=u2e719145-fcb5-4&from=paste&height=141&id=u15d25787&originHeight=141&originWidth=492&originalType=binary&ratio=1&rotation=0&showTitle=false&size=55400&status=done&style=none&taskId=u12c3f6ff-be41-4646-b044-baeb0ff2c57&title=&width=492)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690891194111-3767fb14-ea4b-437c-bdc3-11dbf5726ef3.png#averageHue=%23dee4f1&clientId=u2e719145-fcb5-4&from=paste&height=230&id=u9754c7dc&originHeight=230&originWidth=888&originalType=binary&ratio=1&rotation=0&showTitle=false&size=99539&status=done&style=none&taskId=u04f50893-4dd3-41ad-9ccc-3b86ced4ee0&title=&width=888)

## 员工信息分页查询

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690891339931-0d0949f1-347b-4a3f-bd47-7b870e1e212a.png#averageHue=%23fbf8fb&clientId=u2e719145-fcb5-4&from=paste&height=530&id=ue6fc9274&originHeight=530&originWidth=1207&originalType=binary&ratio=1&rotation=0&showTitle=false&size=134011&status=done&style=none&taskId=u292caaea-a967-46fc-a67e-9dfe0c5a8cc&title=&width=1207)

### 代码开发

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690895245114-33e7e09b-405f-4916-acc6-687eaccf2e8e.png#averageHue=%23f7f5f7&clientId=u2e719145-fcb5-4&from=paste&height=447&id=u17507ddb&originHeight=447&originWidth=944&originalType=binary&ratio=1&rotation=0&showTitle=false&size=247758&status=done&style=none&taskId=u7cacb942-7709-418a-ba54-7134f915f75&title=&width=944)

## 启用/禁用员工账号

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690968837473-e2784df2-5025-4cbd-90d8-1e9f096fa221.png#averageHue=%23f1eff1&clientId=u6268d0e9-c059-4&from=paste&height=153&id=u36be4a2c&originHeight=153&originWidth=969&originalType=binary&ratio=1&rotation=0&showTitle=false&size=76498&status=done&style=none&taskId=u3295d901-f43b-47f7-96d0-d62fd377533&title=&width=969)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690968877820-a3dff026-a547-418a-baec-a0e15acf061b.png#averageHue=%23faf7fa&clientId=u6268d0e9-c059-4&from=paste&height=370&id=u7fc3bfff&originHeight=370&originWidth=1006&originalType=binary&ratio=1&rotation=0&showTitle=false&size=85678&status=done&style=none&taskId=u5c7cf36d-7f76-4af8-8b08-28809ee04af&title=&width=1006)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690968951100-1d098cdc-0a9e-4a57-9364-7121145a8f15.png#averageHue=%23fcfafd&clientId=u6268d0e9-c059-4&from=paste&height=332&id=u42c917e5&originHeight=332&originWidth=1005&originalType=binary&ratio=1&rotation=0&showTitle=false&size=46394&status=done&style=none&taskId=u6feb67d2-e458-48e6-bcbf-9138feb529c&title=&width=1005)

### 代码开发

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690968986919-e35b91d2-b82c-496b-877f-c5328a47db18.png#averageHue=%23f6f3f7&clientId=u6268d0e9-c059-4&from=paste&height=355&id=u0a9662f6&originHeight=355&originWidth=481&originalType=binary&ratio=1&rotation=0&showTitle=false&size=110720&status=done&style=none&taskId=u967dcf4e-2431-4798-80cc-2758ba2cfbf&title=&width=481)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690970471967-856e38dc-946d-41ed-9a1d-68a90dd94ac6.png#averageHue=%23faf8fb&clientId=u6268d0e9-c059-4&from=paste&height=342&id=u10d82003&originHeight=342&originWidth=745&originalType=binary&ratio=1&rotation=0&showTitle=false&size=136190&status=done&style=none&taskId=ubef5b333-8613-41ee-9add-e0d973920ea&title=&width=745)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690970670863-aec143bf-bc9f-4259-8657-31bdc6b92a6a.png#averageHue=%23faf8fa&clientId=u6268d0e9-c059-4&from=paste&height=357&id=uc454147f&originHeight=357&originWidth=597&originalType=binary&ratio=1&rotation=0&showTitle=false&size=113569&status=done&style=none&taskId=ucb7e2cef-6da4-4059-9956-2e1f9c21557&title=&width=597)

### 功能测试

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690972011097-ed7abdf4-aaf3-43bc-98d8-a369164f9c7d.png#averageHue=%23f6f3f6&clientId=u6268d0e9-c059-4&from=paste&height=347&id=u8480db43&originHeight=347&originWidth=802&originalType=binary&ratio=1&rotation=0&showTitle=false&size=211136&status=done&style=none&taskId=u5f19276e-b020-4688-9b9e-f6bed920661&title=&width=802)

### 代码修复

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690972043427-3e885e09-0fda-4a38-8f41-9923907ad8e5.png#averageHue=%23f7f5f8&clientId=u6268d0e9-c059-4&from=paste&height=443&id=u926516f1&originHeight=443&originWidth=835&originalType=binary&ratio=1&rotation=0&showTitle=false&size=205988&status=done&style=none&taskId=u6109c639-fb58-4bc0-8cc3-09fbb96d735&title=&width=835)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690972053376-2f2d93d4-af18-4910-a55b-cf5162fb66d7.png#averageHue=%23f8f6f9&clientId=u6268d0e9-c059-4&from=paste&height=255&id=u4bfcea44&originHeight=255&originWidth=957&originalType=binary&ratio=1&rotation=0&showTitle=false&size=128209&status=done&style=none&taskId=ucaad97cb-9981-4565-ba6f-93bf302cb1a&title=&width=957)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690972197021-4c3ba9ca-a245-4c2f-b112-8440b32efafd.png#averageHue=%23faf8fa&clientId=u6268d0e9-c059-4&from=paste&height=451&id=u1e5382e3&originHeight=451&originWidth=991&originalType=binary&ratio=1&rotation=0&showTitle=false&size=219394&status=done&style=none&taskId=u789337e7-89ec-417a-8ad1-d46ab5cd4fb&title=&width=991)

## 编辑员工信息

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690973003990-f75c2284-5173-4765-a457-f0b182ee6cfc.png#averageHue=%23fbf9fb&clientId=u6268d0e9-c059-4&from=paste&height=556&id=ucccd59d7&originHeight=556&originWidth=1170&originalType=binary&ratio=1&rotation=0&showTitle=false&size=97860&status=done&style=none&taskId=u92d31d1d-3a13-4542-8601-1f90504f00a&title=&width=1170)

### 代码开发

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1690973070312-69d1727e-f6c0-44d9-a6e2-1b0fdc5d0a85.png#averageHue=%23f3f1f4&clientId=u6268d0e9-c059-4&from=paste&height=395&id=u7177cd66&originHeight=395&originWidth=676&originalType=binary&ratio=1&rotation=0&showTitle=false&size=231288&status=done&style=none&taskId=ub3d2b486-cccd-41a1-855f-bb22b25ebe8&title=&width=676)

## 公共字段自动填充

### 问题分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691023661637-9a7776a9-9321-4fbe-9ec5-e4a8dd7e4133.png#averageHue=%23f8f6f9&clientId=u13cfae38-bdf0-4&from=paste&height=334&id=u61978403&originHeight=334&originWidth=774&originalType=binary&ratio=1&rotation=0&showTitle=false&size=168766&status=done&style=none&taskId=uf25f5880-fae0-4fa4-bd99-f1781c1da07&title=&width=774)

### 代码实现

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691023810471-fa351758-f134-4e29-ab5c-0e0d5a4df0af.png#averageHue=%23f7f5f8&clientId=u13cfae38-bdf0-4&from=paste&height=164&id=u69669759&originHeight=164&originWidth=728&originalType=binary&ratio=1&rotation=0&showTitle=false&size=81106&status=done&style=none&taskId=ucf894cf3-4724-48bc-861a-642d9e818aa&title=&width=728)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691024004376-bfcf61cf-81de-46c3-b631-9a315b0ef888.png#averageHue=%23fbf9fb&clientId=u13cfae38-bdf0-4&from=paste&height=354&id=u700c1ddc&originHeight=354&originWidth=741&originalType=binary&ratio=1&rotation=0&showTitle=false&size=132719&status=done&style=none&taskId=ufe0c0818-bd23-45ed-b7b2-c2eb957eb88&title=&width=741)

### 功能测试

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691025086292-2356e987-efa6-4892-97f7-40742bcce64b.png#averageHue=%23faf8fa&clientId=u13cfae38-bdf0-4&from=paste&height=347&id=u5908eff7&originHeight=347&originWidth=759&originalType=binary&ratio=1&rotation=0&showTitle=false&size=113264&status=done&style=none&taskId=u9ce1dbb3-ac74-4c90-9041-b4c6eca7138&title=&width=759)

### 功能完善

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691025103885-ea3989b7-252a-45e0-8d79-302de2e99f6c.png#averageHue=%23f3f1f3&clientId=u13cfae38-bdf0-4&from=paste&height=162&id=uab1a96ac&originHeight=162&originWidth=770&originalType=binary&ratio=1&rotation=0&showTitle=false&size=114836&status=done&style=none&taskId=u6b3d9959-b600-4577-8748-7dce5aebf25&title=&width=770)![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691025140960-b142d066-5a9f-49e2-96b8-088c9d06809b.png#averageHue=%23f7f5f7&clientId=u13cfae38-bdf0-4&from=paste&height=346&id=u4331b848&originHeight=346&originWidth=761&originalType=binary&ratio=1&rotation=0&showTitle=false&size=201054&status=done&style=none&taskId=uaa6730e0-c0cc-4177-87de-28b1ba5d075&title=&width=761)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691026126319-03902377-cb0e-4a26-aa21-86dced21d011.png#averageHue=%23f4f1f4&clientId=u13cfae38-bdf0-4&from=paste&height=338&id=uaade4d40&originHeight=338&originWidth=767&originalType=binary&ratio=1&rotation=0&showTitle=false&size=185731&status=done&style=none&taskId=uf7b3df91-db76-49a2-b091-cdcc5b464f2&title=&width=767)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691034248612-6c6b23a5-0d8d-4688-9c9b-d774e2ce7549.png#averageHue=%23f6f4f6&clientId=u13cfae38-bdf0-4&from=paste&height=116&id=u90c77a54&originHeight=116&originWidth=556&originalType=binary&ratio=1&rotation=0&showTitle=false&size=49459&status=done&style=none&taskId=u03531546-b8ed-4866-8ced-a8252990e26&title=&width=556)

## 新增分类

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691800904983-73948286-afeb-459f-8481-9ea7562158aa.png#averageHue=%23f4f2f5&clientId=u110e8ae3-b8da-4&from=paste&height=261&id=uf94e31a1&originHeight=522&originWidth=1615&originalType=binary&ratio=2&rotation=0&showTitle=false&size=370068&status=done&style=none&taskId=u72bd9995-706b-4293-9eda-3a4bede11fd&title=&width=807.5)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691800961520-8bbfb5e3-9712-4e07-8591-a271c47498bc.png#averageHue=%23f6f3f6&clientId=u110e8ae3-b8da-4&from=paste&height=310&id=u3bf933da&originHeight=620&originWidth=1674&originalType=binary&ratio=2&rotation=0&showTitle=false&size=161030&status=done&style=none&taskId=u3c2d6ba4-7dc8-43d0-8331-b55706756b2&title=&width=837)

### 数据模型

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691801064483-7daa9a63-fff8-4701-b71f-ca9e9016ed5c.png#averageHue=%23f5f3f6&clientId=u110e8ae3-b8da-4&from=paste&height=283&id=u2b48a87a&originHeight=565&originWidth=879&originalType=binary&ratio=2&rotation=0&showTitle=false&size=226496&status=done&style=none&taskId=u111fb2a6-7660-4ee1-a912-9e8d03ed55f&title=&width=439.5)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691801165892-862417f5-38e2-4814-ba3b-179e9cd60f6f.png#averageHue=%23f4f1f5&clientId=u110e8ae3-b8da-4&from=paste&height=144&id=uaba5b5a3&originHeight=288&originWidth=961&originalType=binary&ratio=2&rotation=0&showTitle=false&size=135597&status=done&style=none&taskId=u181db889-60b8-43a6-9556-395c33019b8&title=&width=480.5)

### 代码开发

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691801190367-df5ce968-050b-4e45-ab80-cb5b756f77ef.png#averageHue=%23f3f0f3&clientId=u110e8ae3-b8da-4&from=paste&height=135&id=u4c54fdf8&originHeight=269&originWidth=685&originalType=binary&ratio=2&rotation=0&showTitle=false&size=123684&status=done&style=none&taskId=ua168e984-b8d9-42a4-848e-e666ac21b0d&title=&width=342.5)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691801635109-9f971324-2a0c-4fdb-af66-c26e8e47482a.png#averageHue=%23f4f2f4&clientId=u110e8ae3-b8da-4&from=paste&height=275&id=u5db3d4e6&originHeight=550&originWidth=1234&originalType=binary&ratio=2&rotation=0&showTitle=false&size=391399&status=done&style=none&taskId=u290e68f0-a311-4e32-971c-aae78dbf852&title=&width=617)

## 分类信息分页查询

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691802293652-97c11c0f-8c21-4829-a0f2-188b0f5b5f70.png#averageHue=%23fbf8fb&clientId=u110e8ae3-b8da-4&from=paste&height=284&id=u8dd41f2e&originHeight=568&originWidth=1159&originalType=binary&ratio=2&rotation=0&showTitle=false&size=147861&status=done&style=none&taskId=uc9139fbe-fd3f-4b1d-90ff-4011390e731&title=&width=579.5)

## 删除分类

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691805414871-3cae2495-39ff-47a5-b8be-fe70bf18902c.png#averageHue=%23fbf7fb&clientId=u110e8ae3-b8da-4&from=paste&height=277&id=u893942a3&originHeight=553&originWidth=1222&originalType=binary&ratio=2&rotation=0&showTitle=false&size=194249&status=done&style=none&taskId=ue5d51b10-b614-4e02-bfd5-e74a9b641d4&title=&width=611)

### 代码开发

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691805472972-5661a187-b03e-4f85-a13a-2143a3dd9268.png#averageHue=%23faf8fa&clientId=u110e8ae3-b8da-4&from=paste&height=259&id=ud38cd469&originHeight=517&originWidth=1174&originalType=binary&ratio=2&rotation=0&showTitle=false&size=242856&status=done&style=none&taskId=ude498ba7-178f-4c43-9a96-2c40d43b461&title=&width=587)

### 功能完善

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691807364514-a3ba250b-ff52-4e17-a71b-7ddbefdb81c6.png#averageHue=%23f9f7f9&clientId=u110e8ae3-b8da-4&from=paste&height=183&id=ubc52531d&originHeight=365&originWidth=1232&originalType=binary&ratio=2&rotation=0&showTitle=false&size=209345&status=done&style=none&taskId=u114d60f7-253e-41ad-a370-0474ca32c15&title=&width=616)

## 修改分类

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691813180927-36395332-ab02-4b99-bf2f-9bb8caea399d.png#averageHue=%23c9c7cb&clientId=u110e8ae3-b8da-4&from=paste&height=277&id=u91cd4c8b&originHeight=553&originWidth=1106&originalType=binary&ratio=2&rotation=0&showTitle=false&size=132648&status=done&style=none&taskId=u023f3bc6-5bac-4185-aaf4-364ed4b16bc&title=&width=553)

## 文件上传下载

### 文件上传介绍

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691831756598-2cbf743e-75af-44fa-9c27-0dd5d46f45d9.png#averageHue=%23faf8fa&clientId=u110e8ae3-b8da-4&from=paste&height=271&id=u7e9b5828&originHeight=541&originWidth=1199&originalType=binary&ratio=2&rotation=0&showTitle=false&size=286121&status=done&style=none&taskId=u94481a9a-8af9-429a-8089-8fd2f4bf741&title=&width=599.5)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691831823735-d1e089c4-b5d5-4098-b682-9f7e1d31cc51.png#averageHue=%23faf8fb&clientId=u110e8ae3-b8da-4&from=paste&height=150&id=u4623e3ec&originHeight=299&originWidth=966&originalType=binary&ratio=2&rotation=0&showTitle=false&size=106839&status=done&style=none&taskId=uabb3d791-e504-414d-afb2-073807067d7&title=&width=483)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691831863907-8cd83ea0-dd86-4910-a16c-6ea280dfa671.png#averageHue=%23fcfafc&clientId=u110e8ae3-b8da-4&from=paste&height=280&id=uc1695823&originHeight=559&originWidth=1207&originalType=binary&ratio=2&rotation=0&showTitle=false&size=209184&status=done&style=none&taskId=ud83d5302-cdec-413c-9761-3e0065838fe&title=&width=603.5)

### 文件下载介绍

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691831964553-fbcf3f2a-3bd6-4ad8-8a8f-793af6b4e44e.png#averageHue=%23f6f4f6&clientId=u110e8ae3-b8da-4&from=paste&height=154&id=u01fd29a0&originHeight=308&originWidth=856&originalType=binary&ratio=2&rotation=0&showTitle=false&size=168319&status=done&style=none&taskId=u35b8f2ca-442d-4e77-83a6-3cfad196467&title=&width=428)

### 文件上传代码实现

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691832039910-cc59b5ab-0fd3-4910-813e-a82eafe89452.png#averageHue=%23e6e3ec&clientId=u110e8ae3-b8da-4&from=paste&height=229&id=u6b407cf6&originHeight=458&originWidth=871&originalType=binary&ratio=2&rotation=0&showTitle=false&size=290863&status=done&style=none&taskId=u8d686da4-c712-49cc-9afa-c5d3170e992&title=&width=435.5)

### 文件下载代码实现

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691855301378-9865d51d-8d7b-4ed2-843f-4562fc2370db.png#averageHue=%23dadae4&clientId=u110e8ae3-b8da-4&from=paste&height=145&id=ud17968c0&originHeight=289&originWidth=890&originalType=binary&ratio=2&rotation=0&showTitle=false&size=133818&status=done&style=none&taskId=u96356272-169a-4c9f-a3a4-7459102f479&title=&width=445)

## 新增菜品

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691857381619-b8a6d21c-34d7-464d-af75-cacc1af81b32.png#averageHue=%23f6f4f6&clientId=u110e8ae3-b8da-4&from=paste&height=360&id=ua3f5a90a&originHeight=720&originWidth=1599&originalType=binary&ratio=2&rotation=0&showTitle=false&size=394104&status=done&style=none&taskId=ufab82001-0007-4982-9ff1-ef6d26c33fd&title=&width=799.5)

### 数据模型

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691857410905-3fbf80ad-7543-4103-b723-008d35041255.png#averageHue=%23f9f7f9&clientId=u110e8ae3-b8da-4&from=paste&height=92&id=u6799a855&originHeight=183&originWidth=1223&originalType=binary&ratio=2&rotation=0&showTitle=false&size=102239&status=done&style=none&taskId=u1261540d-2cc3-4eb8-8c55-a7f30f96ab7&title=&width=611.5)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691857509183-5f962cf2-0e02-4f42-901d-3381ba836119.png#averageHue=%23f9f7f9&clientId=u110e8ae3-b8da-4&from=paste&height=287&id=ue9ef7581&originHeight=573&originWidth=911&originalType=binary&ratio=2&rotation=0&showTitle=false&size=205048&status=done&style=none&taskId=u6ebd57f0-7ae6-4800-8a76-b636939dd98&title=&width=455.5)

### 代码开发——准备工作

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691858109470-f90a5191-2a96-43bf-8c54-2c52c88a0f8b.png#averageHue=%23f5f3f5&clientId=u110e8ae3-b8da-4&from=paste&height=136&id=u12f939d8&originHeight=272&originWidth=920&originalType=binary&ratio=2&rotation=0&showTitle=false&size=151387&status=done&style=none&taskId=ua9335e52-3a89-4083-9078-0ebd47864b5&title=&width=460)

### 代码开发——梳理交互过程

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691859152752-b1f5828d-e8f0-4c83-9a80-2186b21ccae7.png#averageHue=%23f3f1f4&clientId=u110e8ae3-b8da-4&from=paste&height=149&id=u1d59f984&originHeight=297&originWidth=1108&originalType=binary&ratio=2&rotation=0&showTitle=false&size=248202&status=done&style=none&taskId=u339be9a1-59fd-4eaf-85dd-b480959bb7d&title=&width=554)

### 代码开发——导入DTO

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691890298917-7e10ec42-1ec3-410c-8ea5-80c1b7c29b65.png#averageHue=%23fcfafc&clientId=udde37669-03d8-4&from=paste&height=273&id=u595ac4e6&originHeight=545&originWidth=1181&originalType=binary&ratio=2&rotation=0&showTitle=false&size=161495&status=done&style=none&taskId=ufdb86dad-d131-433c-8a9e-c66c28470cc&title=&width=590.5)

## 菜品信息分类查询

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691892492107-a6b81e41-f364-4e2f-9e17-2f963026a9cd.png#averageHue=%23faf8fb&clientId=udde37669-03d8-4&from=paste&height=363&id=u2b6aa5b5&originHeight=726&originWidth=1475&originalType=binary&ratio=2&rotation=0&showTitle=false&size=253400&status=done&style=none&taskId=u7349985c-bd0f-42a7-86e0-23445fa7709&title=&width=737.5)

### 代码开发——梳理交互过程

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691892899877-7a9e54ea-0bed-4f0f-b31e-32389d3d3ba3.png#averageHue=%23f4f2f4&clientId=udde37669-03d8-4&from=paste&height=208&id=u5dadc4b0&originHeight=416&originWidth=1446&originalType=binary&ratio=2&rotation=0&showTitle=false&size=351499&status=done&style=none&taskId=uaee6a6fd-6749-4770-b06f-e97053788dc&title=&width=723)

## 修改菜品

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691933868308-835f23ef-80af-46e6-8513-f03782828074.png#averageHue=%23fbf9fb&clientId=udde37669-03d8-4&from=paste&height=382&id=u4f97eaa8&originHeight=763&originWidth=1476&originalType=binary&ratio=2&rotation=0&showTitle=false&size=227028&status=done&style=none&taskId=u3785e668-81ba-4f79-8a31-0f0062c79be&title=&width=738)

### 代码开发——梳理交互过程

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1691933926605-035838ce-cfda-453a-afa3-1f8995a9753a.png#averageHue=%23f3f1f3&clientId=udde37669-03d8-4&from=paste&height=172&id=ufad802de&originHeight=344&originWidth=929&originalType=binary&ratio=2&rotation=0&showTitle=false&size=262809&status=done&style=none&taskId=ud91114d4-1abd-44b8-973c-fbad56d7072&title=&width=464.5)

## 新增套餐

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692020430362-985637c8-72b4-41a1-9998-6ba8db7c9d36.png#averageHue=%23f8f6f8&clientId=u9a6d64c4-d3f2-4&from=paste&height=311&id=u45c07558&originHeight=622&originWidth=1297&originalType=binary&ratio=2&rotation=0&showTitle=false&size=299063&status=done&style=none&taskId=ua0b8bc1d-9b92-47dd-96ae-6a8649b69db&title=&width=648.5)

### 数据模型

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692020533268-ad019278-72c6-41d0-92b0-9d90604309a5.png#averageHue=%23f9f6f9&clientId=u9a6d64c4-d3f2-4&from=paste&height=106&id=u0e7006d4&originHeight=212&originWidth=1345&originalType=binary&ratio=2&rotation=0&showTitle=false&size=130220&status=done&style=none&taskId=uc1e85e8a-e4b3-4838-a353-0c7047cc5f8&title=&width=672.5)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692020555400-e9ac746c-5b2c-4eb9-805f-b01e4afa7bed.png#averageHue=%23f8f5f8&clientId=u9a6d64c4-d3f2-4&from=paste&height=304&id=u06be3d1d&originHeight=607&originWidth=927&originalType=binary&ratio=2&rotation=0&showTitle=false&size=249818&status=done&style=none&taskId=u19297acb-ebf3-4e3f-b9ed-95f1c462cb7&title=&width=463.5)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692020586384-6fea9791-1c8d-4424-9933-bf49054f027e.png#averageHue=%23f8f6f9&clientId=u9a6d64c4-d3f2-4&from=paste&height=308&id=u745f3bda&originHeight=616&originWidth=983&originalType=binary&ratio=2&rotation=0&showTitle=false&size=262850&status=done&style=none&taskId=uebab2143-8f00-4252-bd83-458ae60f473&title=&width=491.5)

### 代码开发——准备工作

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692020622648-7d3a3afa-ca18-4b57-88d1-5fbb3eb8fcc4.png#averageHue=%23f6f4f6&clientId=u9a6d64c4-d3f2-4&from=paste&height=160&id=u896e769d&originHeight=319&originWidth=1090&originalType=binary&ratio=2&rotation=0&showTitle=false&size=211634&status=done&style=none&taskId=uddc68f8a-37ba-45d5-a63a-2638de02463&title=&width=545)

### 代码开发——梳理交互过程

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692023652897-e24448dd-9913-4621-95c2-0f8fef60d736.png#averageHue=%23f0eef0&clientId=u9a6d64c4-d3f2-4&from=paste&height=207&id=u6731ea11&originHeight=413&originWidth=1233&originalType=binary&ratio=2&rotation=0&showTitle=false&size=433011&status=done&style=none&taskId=u73b87790-9a18-47c9-8454-2387de36e7c&title=&width=616.5)

## 套餐信息分页查询

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692103599746-68d726d9-b26c-43cc-a9eb-55775727521a.png#averageHue=%23f9f7fa&clientId=u033beac7-4c90-4&from=paste&height=326&id=u01f01ba2&originHeight=651&originWidth=1679&originalType=binary&ratio=2&rotation=0&showTitle=false&size=246878&status=done&style=none&taskId=u15007485-046e-4d6a-86d3-9750dd2d557&title=&width=839.5)

### 代码开发——梳理交互过程

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692103641113-135a9547-1814-468e-85ef-ec61d2b94f6f.png#averageHue=%23f0eef0&clientId=u033beac7-4c90-4&from=paste&height=215&id=u6a335236&originHeight=429&originWidth=1460&originalType=binary&ratio=2&rotation=0&showTitle=false&size=295206&status=done&style=none&taskId=ua3925f7f-4eba-4a57-b471-51ea6698c98&title=&width=730)

## 删除套餐

### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692106220831-16721bae-b5d9-4233-a77d-55b87884966c.png#averageHue=%23f6f4f6&clientId=u033beac7-4c90-4&from=paste&height=259&id=u26530875&originHeight=517&originWidth=1666&originalType=binary&ratio=2&rotation=0&showTitle=false&size=285149&status=done&style=none&taskId=ue9d7641b-7f4a-4bcd-9973-bb75cb75d53&title=&width=833)

### 代码开发——梳理交互过程

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692108446491-49266950-a55d-496d-b5f8-8617e68f4502.png#averageHue=%23f4f2f5&clientId=u033beac7-4c90-4&from=paste&height=305&id=u7c69591a&originHeight=610&originWidth=1235&originalType=binary&ratio=2&rotation=0&showTitle=false&size=403240&status=done&style=none&taskId=u6cedf980-18e5-428e-855b-3f02a4410f3&title=&width=617.5)

## 手机验证码登录

### 效果展示

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692189631063-a7d3921b-6204-45e1-b365-493d20a02c1e.png#averageHue=%23eae7ec&clientId=u77fb1d65-4e1d-4&from=paste&height=368&id=uba384580&originHeight=736&originWidth=1048&originalType=binary&ratio=2&rotation=0&showTitle=false&size=278631&status=done&style=none&taskId=uffa9f425-9cae-4e28-9c79-c52a9c33691&title=&width=524)

### 短信发送

#### 代码开发

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692192131659-a1aacad6-6d3e-4300-906b-49422c64d188.png#averageHue=%23fbf9fb&clientId=u77fb1d65-4e1d-4&from=paste&height=137&id=ub7e93ba8&originHeight=273&originWidth=751&originalType=binary&ratio=2&rotation=0&showTitle=false&size=68613&status=done&style=none&taskId=u96491c03-0369-482a-bed7-c178acac8a3&title=&width=375.5)

#### 代码开发——导入Maven坐标

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692192446173-fe889bad-056c-4d4a-9bd3-67006ef8c59f.png#averageHue=%23faf7fa&clientId=u77fb1d65-4e1d-4&from=paste&height=228&id=ub3c0f998&originHeight=456&originWidth=771&originalType=binary&ratio=2&rotation=0&showTitle=false&size=155590&status=done&style=none&taskId=ua8fa6970-1510-46e5-9cec-0fdea6e4c81&title=&width=385.5)

#### 代码开发——调用API

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692192720717-b071dec9-abd7-4a81-887a-dff905c1192a.png#averageHue=%23fbf8fb&clientId=u77fb1d65-4e1d-4&from=paste&height=274&id=u8a4ccf94&originHeight=548&originWidth=1291&originalType=binary&ratio=2&rotation=0&showTitle=false&size=270819&status=done&style=none&taskId=u90a69422-fa2b-4d34-b1ff-4ce6672643f&title=&width=645.5)

### 手机验证码登录

#### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692192879902-5075ae1e-14b9-43c2-b07f-f1400ac5e5dc.png#averageHue=%23f0edf1&clientId=u77fb1d65-4e1d-4&from=paste&height=412&id=uf2e91b23&originHeight=824&originWidth=1547&originalType=binary&ratio=2&rotation=0&showTitle=false&size=293040&status=done&style=none&taskId=u3e0b42a4-ca98-4e5f-82c3-725840005e9&title=&width=773.5)

#### 数据模型

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692193136272-405d8ddc-6489-488c-b586-bdc7d7684a7b.png#averageHue=%23f8f5f8&clientId=u77fb1d65-4e1d-4&from=paste&height=266&id=u0370aeb2&originHeight=532&originWidth=1141&originalType=binary&ratio=2&rotation=0&showTitle=false&size=249344&status=done&style=none&taskId=u381bcc8e-6f3e-4a9d-9898-15c132a880f&title=&width=570.5)

#### 代码开发——梳理交互过程

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692193247405-9ee5d6ea-cec4-45cb-a656-bb4a94aa69ce.png#averageHue=%23f6f3f6&clientId=u77fb1d65-4e1d-4&from=paste&height=142&id=uae01d36c&originHeight=284&originWidth=1302&originalType=binary&ratio=2&rotation=0&showTitle=false&size=251016&status=done&style=none&taskId=ubd6d7ada-dad5-43b9-ae7f-aca97d6b21a&title=&width=651)

#### 代码开发——准备工作

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692193311355-81b91938-51cc-47a7-8378-06f66067a007.png#averageHue=%23f6f4f7&clientId=u77fb1d65-4e1d-4&from=paste&height=165&id=u19697e99&originHeight=329&originWidth=830&originalType=binary&ratio=2&rotation=0&showTitle=false&size=173510&status=done&style=none&taskId=u96426415-dc27-4d00-972b-4f9ce180cc3&title=&width=415)

#### 代码开发——修改LoginCheckFilter

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692193927855-240f4d88-8071-4a11-aaf2-a2b61ab9f808.png#averageHue=%23fbf9fb&clientId=u77fb1d65-4e1d-4&from=paste&height=245&id=ue3be4072&originHeight=490&originWidth=1278&originalType=binary&ratio=2&rotation=0&showTitle=false&size=246131&status=done&style=none&taskId=u99768c85-acba-4916-bd77-6f7baac48ad&title=&width=639)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692194235685-721c3247-7be6-495f-bba6-b08af2cdce2f.png#averageHue=%23faf8fa&clientId=u77fb1d65-4e1d-4&from=paste&height=222&id=u7fa4be4a&originHeight=443&originWidth=1102&originalType=binary&ratio=2&rotation=0&showTitle=false&size=220041&status=done&style=none&taskId=ueafbba81-bb29-449a-9d08-64b69fc0764&title=&width=551)

## 菜品展示、购物车、下单

### 效果展示

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692278659574-0b8a36f8-9841-4cd4-8a89-2cc766a7af63.png#averageHue=%23e3e1e5&clientId=u1628c6dd-d3fd-4&from=paste&height=374&id=u594c278d&originHeight=748&originWidth=1369&originalType=binary&ratio=2&rotation=0&showTitle=false&size=509550&status=done&style=none&taskId=u2ad8531c-eaa5-4c66-84a4-1e13a259b41&title=&width=684.5)

### 导入用户地址簿相关功能代码

#### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692278824675-2fdbc46f-c1a7-41fc-a6c6-ae9d9ad08055.png#averageHue=%23eae7eb&clientId=u1628c6dd-d3fd-4&from=paste&height=408&id=udfc1af0a&originHeight=815&originWidth=1730&originalType=binary&ratio=2&rotation=0&showTitle=false&size=277109&status=done&style=none&taskId=u0e5baba8-8a1c-4267-8fea-1917ded33a4&title=&width=865)

#### 数据模型

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692278948049-2064ff2a-3060-498b-8f2a-da2be9c825e8.png#averageHue=%23f8f6f8&clientId=u1628c6dd-d3fd-4&from=paste&height=413&id=u49b3056d&originHeight=826&originWidth=1171&originalType=binary&ratio=2&rotation=0&showTitle=false&size=385399&status=done&style=none&taskId=u3b13302c-d80f-4a4d-9a0c-7af956726a6&title=&width=585.5)

#### 导入功能代码

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692279557364-cc6b8f50-f712-46f3-b334-9c40b009b259.png#averageHue=%23f4f2f5&clientId=u1628c6dd-d3fd-4&from=paste&height=141&id=ue601b407&originHeight=282&originWidth=771&originalType=binary&ratio=2&rotation=0&showTitle=false&size=153221&status=done&style=none&taskId=u88d03b0b-8690-4a5e-bcd1-05311ba27ef&title=&width=385.5)

### 菜品展示

#### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692281051467-057c4b99-413c-415e-83f8-84876f32a1e9.png#averageHue=%23eceaed&clientId=u1628c6dd-d3fd-4&from=paste&height=408&id=ud0e43387&originHeight=816&originWidth=1648&originalType=binary&ratio=2&rotation=0&showTitle=false&size=554088&status=done&style=none&taskId=uff9bb82e-b33f-4841-a628-826674f8148&title=&width=824)

#### 代码开发——梳理交互过程

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692281154736-31b44f01-22bc-4cff-bf30-939fe5a0d52a.png#averageHue=%23f6f4f6&clientId=u1628c6dd-d3fd-4&from=paste&height=315&id=ud2c88e7f&originHeight=629&originWidth=1322&originalType=binary&ratio=2&rotation=0&showTitle=false&size=460767&status=done&style=none&taskId=u9d75303b-9edf-4185-8de7-d7376cfad6b&title=&width=661)

### 购物车

#### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692365824192-c8041217-cb86-4e29-b14f-6a7b5b6e84c5.png#averageHue=%23e2e0e4&clientId=uf787dfc7-87e8-4&from=paste&height=415&id=u9dd86911&originHeight=830&originWidth=1663&originalType=binary&ratio=2&rotation=0&showTitle=false&size=814133&status=done&style=none&taskId=u3146044c-bc1d-4876-b1c7-6d0a6f0cb9d&title=&width=831.5)

#### 数据模型

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692365935839-0edc1c3c-e670-4e71-836e-9f459eb35b81.png#averageHue=%23f8f6f9&clientId=uf787dfc7-87e8-4&from=paste&height=418&id=u5935a672&originHeight=836&originWidth=1530&originalType=binary&ratio=2&rotation=0&showTitle=false&size=449925&status=done&style=none&taskId=u31c14b8f-90d2-444a-8928-420e0fd1ea4&title=&width=765)

#### 代码开发——梳理交互过程

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692366221171-20831b54-f868-4171-80f4-1230436111eb.png#averageHue=%23f2f0f2&clientId=u26168984-6fee-4&from=paste&height=135&id=u2bd277dd&originHeight=270&originWidth=1115&originalType=binary&ratio=2&rotation=0&showTitle=false&size=262780&status=done&style=none&taskId=u3d238609-aacf-4780-b3ef-cf7741671aa&title=&width=557.5)

#### 代码开发——准备工作

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692367467585-28aa6cca-0a48-4f41-b571-6e29d3b99bd6.png#averageHue=%23f4f2f5&clientId=u26168984-6fee-4&from=paste&height=134&id=ue2c6739e&originHeight=267&originWidth=673&originalType=binary&ratio=2&rotation=0&showTitle=false&size=137672&status=done&style=none&taskId=u002d8af8-82a0-4aa5-95fc-8d90b11b426&title=&width=336.5)

### 用户下单

#### 需求分析

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692372507279-fa36b22f-4280-460a-b5b2-51445fce20e8.png#averageHue=%23efedef&clientId=u26168984-6fee-4&from=paste&height=380&id=ub5c2e197&originHeight=760&originWidth=1487&originalType=binary&ratio=2&rotation=0&showTitle=false&size=327493&status=done&style=none&taskId=u9dfac885-6cee-4e06-9c0e-3a437023c10&title=&width=743.5)

#### 数据模型

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692372605108-62d326f8-5e86-43de-928a-04bca16a3cb4.png#averageHue=%23f2f0f2&clientId=u26168984-6fee-4&from=paste&height=97&id=u24d55d7d&originHeight=193&originWidth=817&originalType=binary&ratio=2&rotation=0&showTitle=false&size=68637&status=done&style=none&taskId=ucaa4b5a4-c289-4ac3-903a-51f40029618&title=&width=408.5)

#### 数据模型——订单表

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692372586627-077ae313-3fac-4f78-b92e-f9a3e2db2605.png#averageHue=%23f8f6f9&clientId=u26168984-6fee-4&from=paste&height=369&id=u53cbb18f&originHeight=738&originWidth=1097&originalType=binary&ratio=2&rotation=0&showTitle=false&size=318458&status=done&style=none&taskId=uec832971-af32-4195-a6e2-95a8420206c&title=&width=548.5)

#### 数据模型——订单明细表

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692372684330-f9a567f4-e685-4f85-aa2f-60f6f853b6a5.png#averageHue=%23f8f6f9&clientId=u26168984-6fee-4&from=paste&height=321&id=u476f941d&originHeight=642&originWidth=1194&originalType=binary&ratio=2&rotation=0&showTitle=false&size=278137&status=done&style=none&taskId=u102b9cc4-5ff4-4b26-9b5d-21e157a162f&title=&width=597)

#### 代码开发——梳理交互过程

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692372747053-98dda753-71b6-4f92-95f4-38b704130d0e.png#averageHue=%23f0eef0&clientId=u26168984-6fee-4&from=paste&height=149&id=u6e18a39c&originHeight=298&originWidth=862&originalType=binary&ratio=2&rotation=0&showTitle=false&size=244222&status=done&style=none&taskId=uf975ad03-1af5-4c0c-8d12-240dd16156b&title=&width=431)

#### 代码开发——准备工作

![image.png](https://cdn.nlark.com/yuque/0/2023/png/38624107/1692373014405-b9591955-b0b6-4846-a05f-9b79cbfbfa3c.png#averageHue=%23f2f0f3&clientId=u26168984-6fee-4&from=paste&height=136&id=ua4388301&originHeight=272&originWidth=670&originalType=binary&ratio=2&rotation=0&showTitle=false&size=165660&status=done&style=none&taskId=uce444944-2629-483c-a311-cce21b4b565&title=&width=335)
