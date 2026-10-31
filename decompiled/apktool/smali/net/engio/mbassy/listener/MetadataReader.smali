.class public Lnet/engio/mbassy/listener/MetadataReader;
.super Ljava/lang/Object;
.source "MetadataReader.java"


# static fields
.field public static final AllMessageHandlers:Lnet/engio/mbassy/common/IPredicate;


# instance fields
.field public final filterCache:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lnet/engio/mbassy/listener/MetadataReader$1;

    invoke-direct {v0}, Lnet/engio/mbassy/listener/MetadataReader$1;-><init>()V

    sput-object v0, Lnet/engio/mbassy/listener/MetadataReader;->AllMessageHandlers:Lnet/engio/mbassy/common/IPredicate;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/engio/mbassy/listener/MetadataReader;->filterCache:Ljava/util/Map;

    return-void
.end method

.method private getFilter(Lnet/engio/mbassy/listener/Handler;)[Lnet/engio/mbassy/listener/IMessageFilter;
    .locals 7

    .line 36
    invoke-interface {p1}, Lnet/engio/mbassy/listener/Handler;->filters()[Lnet/engio/mbassy/listener/Filter;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 39
    :cond_0
    invoke-interface {p1}, Lnet/engio/mbassy/listener/Handler;->filters()[Lnet/engio/mbassy/listener/Filter;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [Lnet/engio/mbassy/listener/IMessageFilter;

    .line 41
    invoke-interface {p1}, Lnet/engio/mbassy/listener/Handler;->filters()[Lnet/engio/mbassy/listener/Filter;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v4, p1, v2

    .line 42
    iget-object v5, p0, Lnet/engio/mbassy/listener/MetadataReader;->filterCache:Ljava/util/Map;

    invoke-interface {v4}, Lnet/engio/mbassy/listener/Filter;->value()Ljava/lang/Class;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/engio/mbassy/listener/IMessageFilter;

    if-nez v5, :cond_1

    .line 45
    :try_start_0
    invoke-interface {v4}, Lnet/engio/mbassy/listener/Filter;->value()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/engio/mbassy/listener/IMessageFilter;

    .line 46
    iget-object v6, p0, Lnet/engio/mbassy/listener/MetadataReader;->filterCache:Ljava/util/Map;

    invoke-interface {v4}, Lnet/engio/mbassy/listener/Filter;->value()Ljava/lang/Class;

    move-result-object v4

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 48
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 51
    :cond_1
    :goto_1
    aput-object v5, v0, v3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private isValidMessageHandler(Ljava/lang/reflect/Method;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 94
    const-class v1, Lnet/engio/mbassy/listener/Handler;

    invoke-static {p1, v1}, Lnet/engio/mbassy/common/ReflectionUtils;->getAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 97
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v1, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    .line 99
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Found no or more than one parameter in messageHandler ["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]. A messageHandler must define exactly one parameter"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return v0

    .line 103
    :cond_1
    const-class v1, Lnet/engio/mbassy/listener/Enveloped;

    invoke-static {p1, v1}, Lnet/engio/mbassy/common/ReflectionUtils;->getAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Lnet/engio/mbassy/listener/Enveloped;

    if-eqz v1, :cond_2

    .line 104
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    aget-object p1, p1, v0

    const-class v3, Lnet/engio/mbassy/subscription/MessageEnvelope;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 105
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Message envelope configured but no subclass of MessageEnvelope found as parameter"

    invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return v0

    :cond_2
    if-eqz v1, :cond_3

    .line 108
    invoke-interface {v1}, Lnet/engio/mbassy/listener/Enveloped;->messages()[Ljava/lang/Class;

    move-result-object p1

    array-length p1, p1

    if-nez p1, :cond_3

    .line 109
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Message envelope configured but message types defined for handler"

    invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return v0

    :cond_3
    return v2

    :cond_4
    :goto_0
    return v0
.end method


# virtual methods
.method public getMessageListener(Ljava/lang/Class;)Lnet/engio/mbassy/listener/MessageListener;
    .locals 7

    .line 60
    new-instance v0, Lnet/engio/mbassy/listener/MessageListener;

    invoke-direct {v0, p1}, Lnet/engio/mbassy/listener/MessageListener;-><init>(Ljava/lang/Class;)V

    .line 62
    sget-object v1, Lnet/engio/mbassy/listener/MetadataReader;->AllMessageHandlers:Lnet/engio/mbassy/common/IPredicate;

    invoke-static {v1, p1}, Lnet/engio/mbassy/common/ReflectionUtils;->getMethods(Lnet/engio/mbassy/common/IPredicate;Ljava/lang/Class;)[Ljava/lang/reflect/Method;

    move-result-object v1

    .line 63
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    .line 67
    aget-object v4, v1, v3

    .line 70
    invoke-static {v1, v4}, Lnet/engio/mbassy/common/ReflectionUtils;->containsOverridingMethod([Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 75
    const-class v5, Lnet/engio/mbassy/listener/Handler;

    invoke-static {v4, v5}, Lnet/engio/mbassy/common/ReflectionUtils;->getAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    check-cast v5, Lnet/engio/mbassy/listener/Handler;

    .line 76
    invoke-interface {v5}, Lnet/engio/mbassy/listener/Handler;->enabled()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-direct {p0, v4}, Lnet/engio/mbassy/listener/MetadataReader;->isValidMessageHandler(Ljava/lang/reflect/Method;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_2

    .line 79
    :cond_0
    invoke-static {v4, p1}, Lnet/engio/mbassy/common/ReflectionUtils;->getOverridingMethod(Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v6

    .line 83
    :goto_1
    invoke-direct {p0, v5}, Lnet/engio/mbassy/listener/MetadataReader;->getFilter(Lnet/engio/mbassy/listener/Handler;)[Lnet/engio/mbassy/listener/IMessageFilter;

    move-result-object v6

    .line 81
    invoke-static {v4, v5, v6, v0}, Lnet/engio/mbassy/listener/MessageHandler$Properties;->Create(Ljava/lang/reflect/Method;Lnet/engio/mbassy/listener/Handler;[Lnet/engio/mbassy/listener/IMessageFilter;Lnet/engio/mbassy/listener/MessageListener;)Ljava/util/Map;

    move-result-object v4

    .line 85
    new-instance v5, Lnet/engio/mbassy/listener/MessageHandler;

    invoke-direct {v5, v4}, Lnet/engio/mbassy/listener/MessageHandler;-><init>(Ljava/util/Map;)V

    .line 86
    invoke-virtual {v0, v5}, Lnet/engio/mbassy/listener/MessageListener;->addHandler(Lnet/engio/mbassy/listener/MessageHandler;)Z

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method
