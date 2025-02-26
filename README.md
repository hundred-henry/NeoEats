# NeoEats

**🏗️ Modular Architecture & Project Management**
Constructed a multi-module project using Maven to clearly separate common utilities, data models, and business logic, thereby achieving high cohesion and low coupling.

**💾 Data Persistence & Dynamic SQL Development**
Expertly employed MyBatis with both annotations and XML-based dynamic SQL tags (e.g., if, foreach, where, set) to handle complex database interactions efficiently, including implementing primary key auto-retrieval.

**🔒 Security Authentication & User Management**
Implemented secure user authentication with JWT and utilized ThreadLocal in interceptors to propagate current user information across layers, while enhancing password security via MD5 encryption.

**⚡ Distributed Caching & Performance Optimization**
Leveraged Redis to implement distributed caching and session management (augmented with Spring Cache annotations), significantly reducing database query latency during peak loads and supporting horizontal scalability.

**📬 Asynchronous Messaging & Task Scheduling**
Integrated RabbitMQ for asynchronous message processing and adopted Spring Task with AOP for scheduled task automation, which streamlined order processing and improved fault tolerance.

**☁️ Third-Party Service Integration**
Seamlessly integrated Aliyun OSS for cloud-based file uploads and storage, and utilized HttpClient to interact with WeChat and Baidu APIs for payment processing and map address resolution.

**📡 Real-Time Communication & Data Visualization**
Enabled real-time notifications by implementing WebSocket for features such as new order alerts and customer order reminders, and provided intuitive business data visualization using Apache ECharts and Apache POI for generating graphical reports.

**🔥 Adopted Redis for Distributed Caching & Session Management**
Stored frequently accessed data and user sessions in Redis, drastically reducing database load during high traffic periods and enhancing system responsiveness.

**🚀 Integrated RabbitMQ for Asynchronous Messaging**
Decoupled business processes by employing RabbitMQ for reliable inter-service communication, ensuring resilient order processing under high load conditions.

# 数智外卖

**🏗️ 模块化架构与项目管理**
构建基于 Maven 的多模块项目，清晰分离公共工具、数据模型和业务逻辑，实现了高内聚低耦合的系统设计。

**💾 数据持久层开发与动态 SQL**
熟练使用 MyBatis 结合注解与 XML 动态 SQL 标签（如 if、foreach、where、set）实现复杂业务场景下的高效数据库交互及主键回显技术。

**🔒 安全认证与用户信息管理**
通过 JWT 实现用户认证，并利用 ThreadLocal 在拦截器中传递当前用户信息，确保安全性与数据一致性，同时采用 MD5 加密提高密码安全性。

**⚡ 分布式缓存与性能优化**
利用 Redis 实现分布式缓存和会话管理，结合 Spring Cache 注解降低数据库访问频率，显著提升了系统响应速度和并发处理能力。

**📬 异步消息与任务调度**
集成 RabbitMQ 实现异步消息处理，以及使用 Spring Task 配合 AOP 进行定时任务调度，自动处理订单超时、状态更新等关键业务流程。

**☁️ 第三方服务集成**
成功整合阿里云 OSS 实现文件上传与云端存储，并通过 HttpClient 与微信、百度 API 实现支付、地图地址解析等外部服务调用。

**📡 实时通信与数据可视化**
采用 WebSocket 实现实时消息推送（如来单提醒和催单通知），并利用 Apache ECharts 与 Apache POI 生成图形报表，为业务数据统计提供了直观展示。

**🔥 利用 Redis 实现分布式缓存与会话管理**
通过将热点数据和用户会话信息存储在 Redis 内存中，大幅降低了数据库在高峰期的查询压力，显著提高了系统响应速度和整体性能，同时支持系统的横向扩展。

**🚀 整合 RabbitMQ 实现异步消息传递**
利用 RabbitMQ 实现业务流程的异步解耦，确保订单处理和各服务之间的通信在高负载和异常情况下依然稳定运行，有效增强了系统的容错能力和可靠性。
