.class public final Ll/ۤܺ᩻;
.super Ll/ܰܺ֡;
.source "AAGH"

# interfaces
.implements Ll/۬ܺ᩻;


# instance fields
.field public ۖ֫:Ljava/lang/String;

.field public final ۘ֫:Ll/ۗܺ᩻;

.field public ᩴ֫:Ljava/lang/String;

.field public ᩵֫:Z


# direct methods
.method public constructor <init>(ZLl/ۗܺ᩻;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Ll/ܰܺ֡;-><init>(Z)V

    .line 36
    iput-object p2, p0, Ll/ۤܺ᩻;->ۘ֫:Ll/ۗܺ᩻;

    .line 37
    invoke-virtual {p0}, Ll/ۚܺ֡;->᩹()V

    .line 38
    invoke-virtual {p0}, Ll/ۚܺ֡;->᩶()V

    .line 39
    invoke-virtual {p0}, Ll/ۙܺ֡;->᩺()V

    return-void
.end method

.method public static ֫(Ljava/lang/Object;)I
    .locals 2

    .line 401
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "port"
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    if-eqz v0, :cond_0

    .line 416
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v1, 0x1

    .line 402
    :try_start_2
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 403
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 418
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    .line 421
    :cond_0
    new-instance p0, Ljava/lang/NoSuchFieldException;

    invoke-direct {p0, v1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    const/4 p0, -0x1

    return p0
.end method

.method private ֫(Ljavax/net/ssl/SSLSession;)Ljava/util/HashSet;
    .locals 2

    .line 324
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 325
    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getPeerHost()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 337
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 338
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 326
    :cond_0
    iget-object p1, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 327
    iget-object p1, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 337
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 338
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 328
    :cond_1
    iget-object p1, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 337
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 338
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v0
.end method

.method private ֫(Ljavax/net/ssl/SSLSession;Ljava/net/Socket;)Z
    .locals 16

    .line 223
    invoke-interface/range {p1 .. p1}, Ljavax/net/ssl/SSLSession;->getSessionContext()Ljavax/net/ssl/SSLSessionContext;

    move-result-object v0

    .line 224
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getSession"

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v7, 0x1

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v8, v4, v7

    :goto_0
    const/4 v9, 0x0

    if-eqz v1, :cond_0

    .line 431
    :try_start_0
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 433
    :catch_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v9

    .line 225
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    :goto_2
    if-eqz v2, :cond_3

    .line 445
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    array-length v10, v4

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v10, :cond_2

    aget-object v12, v4, v11

    .line 446
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v13

    const-string v14, "putSession"

    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v13

    array-length v13, v13

    if-ne v13, v3, :cond_1

    goto :goto_4

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 450
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v12, v9

    :goto_4
    if-eqz v1, :cond_e

    if-nez v12, :cond_4

    goto/16 :goto_b

    .line 229
    :cond_4
    invoke-virtual {v1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 230
    invoke-virtual {v12, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 252
    invoke-interface/range {p1 .. p1}, Ljavax/net/ssl/SSLSession;->getSessionContext()Ljavax/net/ssl/SSLSessionContext;

    move-result-object v2

    .line 253
    invoke-interface/range {p1 .. p1}, Ljavax/net/ssl/SSLSession;->getPeerHost()Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {p1 .. p1}, Ljavax/net/ssl/SSLSession;->getPeerPort()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    new-array v11, v3, [Ljava/lang/Object;

    aput-object v4, v11, v5

    aput-object v10, v11, v7

    invoke-virtual {v1, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_5

    move-object v9, v4

    goto/16 :goto_a

    .line 359
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    :goto_5
    const-string v10, "sessionsByHostAndPort"

    if-eqz v4, :cond_d

    .line 416
    :try_start_1
    invoke-virtual {v4, v10}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_3

    .line 360
    invoke-virtual {v4, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 361
    invoke-virtual {v4, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 362
    instance-of v10, v4, Ljava/util/Map;

    if-eqz v10, :cond_6

    check-cast v4, Ljava/util/Map;

    goto :goto_6

    .line 365
    :cond_6
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 258
    :goto_6
    invoke-direct/range {p0 .. p1}, Ll/ۤܺ᩻;->֫(Ljavax/net/ssl/SSLSession;)Ljava/util/HashSet;

    move-result-object v10

    .line 259
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    .line 260
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    .line 387
    :try_start_2
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    const-string v15, "host"
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    :goto_7
    if-eqz v14, :cond_9

    .line 416
    :try_start_3
    invoke-virtual {v14, v15}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v14
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_1

    .line 388
    :try_start_4
    invoke-virtual {v14, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 389
    invoke-virtual {v14, v13}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_8

    goto :goto_8

    .line 390
    :cond_8
    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    goto :goto_9

    .line 418
    :catch_1
    invoke-virtual {v14}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v14

    goto :goto_7

    .line 421
    :cond_9
    new-instance v13, Ljava/lang/NoSuchFieldException;

    invoke-direct {v13, v15}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw v13
    :try_end_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    :goto_8
    move-object v13, v9

    .line 261
    :goto_9
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, Ll/ۤܺ᩻;->֫(Ljava/lang/Object;)I

    move-result v11

    if-eqz v13, :cond_7

    if-ltz v11, :cond_7

    .line 346
    invoke-virtual {v10}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 347
    invoke-virtual {v15, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_a

    .line 265
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    new-array v14, v3, [Ljava/lang/Object;

    aput-object v13, v14, v5

    aput-object v11, v14, v7

    invoke-virtual {v1, v2, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_7

    move-object v9, v11

    :cond_b
    :goto_a
    if-nez v9, :cond_c

    goto :goto_b

    .line 235
    :cond_c
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    aget-object v1, v1, v5

    new-array v2, v3, [Ljava/lang/Class;

    aput-object v6, v2, v5

    aput-object v8, v2, v7

    .line 236
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 237
    invoke-virtual {v1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 239
    invoke-virtual/range {p2 .. p2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/net/Socket;->getPort()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v6, v3, [Ljava/lang/Object;

    aput-object v2, v6, v5

    aput-object v4, v6, v7

    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-array v4, v3, [Ljava/lang/Object;

    aput-object v2, v4, v5

    aput-object v9, v4, v7

    .line 238
    invoke-virtual {v12, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    invoke-virtual/range {p2 .. p2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/net/Socket;->getPort()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v6, v3, [Ljava/lang/Object;

    aput-object v2, v6, v5

    aput-object v4, v6, v7

    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    aput-object v1, v2, v5

    aput-object v9, v2, v7

    .line 241
    invoke-virtual {v12, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return v7

    .line 418
    :catch_3
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4

    goto/16 :goto_5

    .line 421
    :cond_d
    new-instance v0, Ljava/lang/NoSuchFieldException;

    invoke-direct {v0, v10}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_b
    return v5
.end method

.method private ۧ(Ljavax/net/ssl/SSLSession;Ljava/net/Socket;)Z
    .locals 12

    .line 278
    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getSessionContext()Ljavax/net/ssl/SSLSessionContext;

    move-result-object v0

    .line 359
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    :goto_0
    const-string v2, "sessionsByHostAndPort"

    if-eqz v1, :cond_a

    .line 416
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v2, 0x1

    .line 360
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 361
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 362
    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/Map;

    goto :goto_1

    .line 365
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 279
    :goto_1
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto/16 :goto_7

    .line 282
    :cond_1
    invoke-direct {p0, p1}, Ll/ۤܺ᩻;->֫(Ljavax/net/ssl/SSLSession;)Ljava/util/HashSet;

    move-result-object v1

    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getPeerPort()I

    move-result p1

    .line 304
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    move-object v6, v5

    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 387
    :try_start_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    const-string v9, "host"
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_3
    if-eqz v8, :cond_4

    .line 416
    :try_start_2
    invoke-virtual {v8, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_0

    .line 388
    :try_start_3
    invoke-virtual {v8, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 389
    invoke-virtual {v8, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_3

    goto :goto_4

    .line 390
    :cond_3
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    .line 418
    :catch_0
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v8

    goto :goto_3

    .line 421
    :cond_4
    new-instance v8, Ljava/lang/NoSuchFieldException;

    invoke-direct {v8, v9}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :goto_4
    move-object v8, v5

    .line 306
    :goto_5
    invoke-static {v7}, Ll/ۤܺ᩻;->֫(Ljava/lang/Object;)I

    move-result v9

    if-eqz v8, :cond_2

    if-ltz v9, :cond_2

    .line 346
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 347
    invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_5

    if-ne p1, v9, :cond_6

    move-object v6, v7

    goto :goto_6

    :cond_6
    if-nez v6, :cond_2

    move-object v6, v7

    goto :goto_2

    :cond_7
    :goto_6
    if-nez v6, :cond_8

    goto :goto_7

    .line 286
    :cond_8
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_9

    :goto_7
    return v3

    .line 290
    :cond_9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Class;

    const-class v6, Ljava/lang/String;

    aput-object v6, v5, v3

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v2

    invoke-virtual {v1, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 291
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 292
    invoke-virtual {p2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Ljava/net/Socket;->getPort()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v7, v4, [Ljava/lang/Object;

    aput-object v5, v7, v3

    aput-object v6, v7, v2

    invoke-virtual {v1, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v5, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    invoke-virtual {p2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Ljava/net/Socket;->getPort()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v5, v4, v3

    aput-object p2, v4, v2

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2

    .line 418
    :catch_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto/16 :goto_0

    .line 421
    :cond_a
    new-instance p1, Ljava/lang/NoSuchFieldException;

    invoke-direct {p1, v2}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getKey()Ll/ۗܺ᩻;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۤܺ᩻;->ۘ֫:Ll/ۗܺ᩻;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ۤܺ᩻;->ᩴ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/net/Socket;)V
    .locals 3

    .line 174
    iget-boolean v0, p0, Ll/ۤܺ᩻;->᩵֫:Z

    if-nez v0, :cond_0

    goto :goto_3

    .line 177
    :cond_0
    instance-of v0, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_5

    .line 178
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v0

    .line 179
    invoke-interface {v0}, Ljavax/net/ssl/SSLSession;->isValid()Z

    move-result v1

    const-string v2, "Invalid SSL Session"

    if-eqz v1, :cond_4

    .line 201
    :try_start_0
    invoke-direct {p0, v0, p1}, Ll/ۤܺ᩻;->֫(Ljavax/net/ssl/SSLSession;Ljava/net/Socket;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 210
    :goto_0
    :try_start_1
    invoke-direct {p0, v0, p1}, Ll/ۤܺ᩻;->ۧ(Ljavax/net/ssl/SSLSession;Ljava/net/Socket;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_3

    .line 184
    :cond_2
    :try_start_2
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_2
    move-exception p1

    if-eqz v1, :cond_3

    .line 213
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 215
    :cond_3
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 187
    :goto_2
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 190
    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_3
    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 132
    iput-boolean p1, p0, Ll/ۤܺ᩻;->᩵֫:Z

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 2

    .line 112
    invoke-static {p1}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۤܺ᩻;->ᩴ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 471
    :cond_0
    sget-object v0, Ll/۬ܺ֡;->۟:Ll/۬ܺ֡;

    invoke-virtual {p0, v0, p1}, Ll/ܶܺ֡;->֫(Ll/۬ܺ֡;Ljava/lang/String;)I

    move-result p1

    .line 1172
    invoke-static {p1}, Ll/ۧ᩷ܽ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 116
    invoke-virtual {p0}, Ll/ۤܺ᩻;->ܳ()Ljava/lang/String;

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 3

    .line 1090
    sget-object v0, Ll/۬ܺ֡;->ۨ֫:Ll/۬ܺ֡;

    const/4 v1, 0x0

    .line 1217
    invoke-virtual {p0, v0, v1}, Ll/ܶܺ֡;->֫(Ll/۬ܺ֡;Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x101

    if-eq v0, v2, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 107
    :cond_0
    iget-object v0, p0, Ll/ܶܺ֡;->֡:Ljava/util/ArrayList;

    const/4 v2, 0x1

    .line 0
    invoke-static {v0, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 107
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ll/۫ܺ᩻;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 96
    invoke-static {v0}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۤܺ᩻;->ᩴ֫:Ljava/lang/String;

    .line 97
    iget-object v2, p0, Ll/ۤܺ᩻;->ۖ֫:Ljava/lang/String;

    if-nez v2, :cond_1

    .line 98
    iput-object v1, p0, Ll/ۤܺ᩻;->ۖ֫:Ljava/lang/String;

    :cond_1
    return-object v0

    .line 94
    :cond_2
    invoke-virtual {p0}, Ll/ۤܺ᩻;->᩻()Ljava/io/IOException;

    throw v1
.end method

.method public final ܽ(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 50
    :try_start_0
    invoke-super {p0, p1, p2}, Ll/ܰܺ֡;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 63
    :try_start_1
    invoke-virtual {p0}, Ll/ܰܺ֡;->ۡ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 67
    :catch_1
    throw p1

    :catch_2
    move-exception p1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Broken pipe"

    .line 53
    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Software caused connection abort"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 55
    :cond_0
    :try_start_2
    invoke-virtual {p0}, Ll/ܰܺ֡;->ۡ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 60
    :catch_3
    :cond_1
    throw p1
.end method

.method public final ܽ(Ljava/lang/String;)Ljava/io/OutputStream;
    .locals 2

    .line 374
    :try_start_0
    const-class v0, Ll/ۙܺ֡;

    const-string v1, "\u06d7"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 375
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 376
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 148
    sget-object v0, Ll/۬ܺ֡;->֨ۧ:Ll/۬ܺ֡;

    invoke-virtual {p0, v0, p1}, Ll/ۙܺ֡;->ۧ(Ll/۬ܺ֡;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 152
    :cond_0
    new-instance v0, Ll/ۧܺ᩻;

    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ۧܺ᩻;-><init>(Ljava/net/Socket;Ljava/io/OutputStream;)V

    return-object v0

    .line 146
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "FTPS storeFileStream only supports binary file type"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    .line 378
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to read FTP file type reflectively"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ܿ(Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
    .locals 3

    .line 157
    iget-boolean v0, p0, Ll/ۤܺ᩻;->᩵֫:Z

    if-eqz v0, :cond_1

    .line 599
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    instance-of v1, v0, Ljavax/net/ssl/SSLSocket;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 600
    check-cast v0, Ljavax/net/ssl/SSLSocket;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->getEnableSessionCreation()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 159
    :try_start_0
    invoke-virtual {p0, v2}, Ll/ܰܺ֡;->֫(Z)V

    .line 160
    invoke-super {p0, p1, p2}, Ll/ܰܺ֡;->ܿ(Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    invoke-virtual {p0, v0}, Ll/ܰܺ֡;->֫(Z)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, Ll/ܰܺ֡;->֫(Z)V

    .line 163
    throw p1

    .line 165
    :cond_1
    invoke-super {p0, p1, p2}, Ll/ܰܺ֡;->ܿ(Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۤܺ᩻;->ۖ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Ljava/io/IOException;
    .locals 4

    .line 72
    invoke-virtual {p0}, Ll/ܶܺ֡;->ۖ()Ljava/lang/String;

    move-result-object v0

    .line 73
    invoke-virtual {p0}, Ll/ܶܺ֡;->ۧ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v1, "FTP reply: "

    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v2, "FTP reply "

    const-string v3, ": "

    .line 0
    invoke-static {v2, v1, v3, v0}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 79
    :goto_0
    new-instance v1, Ljava/net/SocketException;

    invoke-direct {v1, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
