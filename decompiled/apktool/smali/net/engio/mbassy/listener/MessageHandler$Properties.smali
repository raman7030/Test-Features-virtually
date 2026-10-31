.class public final Lnet/engio/mbassy/listener/MessageHandler$Properties;
.super Ljava/lang/Object;
.source "MessageHandler.java"


# static fields
.field public static final AcceptSubtypes:Ljava/lang/String; = "subtypes"

.field public static final Condition:Ljava/lang/String; = "condition"

.field public static final Enveloped:Ljava/lang/String; = "envelope"

.field public static final Filter:Ljava/lang/String; = "filter"

.field public static final HandledMessages:Ljava/lang/String; = "messages"

.field public static final HandlerMethod:Ljava/lang/String; = "handler"

.field public static final Invocation:Ljava/lang/String; = "invocation"

.field public static final InvocationMode:Ljava/lang/String; = "invocationMode"

.field public static final IsSynchronized:Ljava/lang/String; = "synchronized"

.field public static final Listener:Ljava/lang/String; = "listener"

.field public static final Priority:Ljava/lang/String; = "priority"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final Create(Ljava/lang/reflect/Method;Lnet/engio/mbassy/listener/Handler;[Lnet/engio/mbassy/listener/IMessageFilter;Lnet/engio/mbassy/listener/MessageListener;)Ljava/util/Map;
    .locals 8

    if-eqz p0, :cond_7

    const/4 v0, 0x0

    if-nez p2, :cond_0

    new-array p2, v0, [Lnet/engio/mbassy/listener/IMessageFilter;

    .line 56
    :cond_0
    const-class v1, Lnet/engio/mbassy/listener/Enveloped;

    invoke-static {p0, v1}, Lnet/engio/mbassy/common/ReflectionUtils;->getAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Lnet/engio/mbassy/listener/Enveloped;

    if-eqz v1, :cond_1

    .line 58
    invoke-interface {v1}, Lnet/engio/mbassy/listener/Enveloped;->messages()[Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    :goto_0
    const/4 v3, 0x1

    .line 60
    invoke-virtual {p0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 61
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "handler"

    .line 62
    invoke-virtual {v4, v5, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    invoke-interface {p1}, Lnet/engio/mbassy/listener/Handler;->condition()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_4

    .line 65
    invoke-static {}, Lnet/engio/mbassy/dispatch/el/ElFilter;->isELAvailable()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 69
    array-length v5, p2

    add-int/2addr v5, v3

    new-array v5, v5, [Lnet/engio/mbassy/listener/IMessageFilter;

    const/4 v6, 0x0

    .line 70
    :goto_1
    array-length v7, p2

    if-ge v6, v7, :cond_2

    .line 71
    aget-object v7, p2, v6

    aput-object v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 73
    :cond_2
    array-length p2, p2

    new-instance v6, Lnet/engio/mbassy/dispatch/el/ElFilter;

    invoke-direct {v6}, Lnet/engio/mbassy/dispatch/el/ElFilter;-><init>()V

    aput-object v6, v5, p2

    move-object p2, v5

    goto :goto_2

    .line 66
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "A handler uses an EL filter but no EL implementation is available."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_2
    const-string v5, "filter"

    .line 76
    invoke-virtual {v4, v5, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    invoke-interface {p1}, Lnet/engio/mbassy/listener/Handler;->condition()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lnet/engio/mbassy/listener/MessageHandler$Properties;->cleanEL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v5, "condition"

    invoke-virtual {v4, v5, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    invoke-interface {p1}, Lnet/engio/mbassy/listener/Handler;->priority()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v5, "priority"

    invoke-virtual {v4, v5, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "invocation"

    .line 79
    invoke-interface {p1}, Lnet/engio/mbassy/listener/Handler;->invocation()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, p2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "invocationMode"

    .line 80
    invoke-interface {p1}, Lnet/engio/mbassy/listener/Handler;->delivery()Lnet/engio/mbassy/listener/Invoke;

    move-result-object v5

    invoke-virtual {v4, p2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_5

    const/4 p2, 0x1

    goto :goto_3

    :cond_5
    const/4 p2, 0x0

    .line 81
    :goto_3
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    const-string v1, "envelope"

    invoke-virtual {v4, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    invoke-interface {p1}, Lnet/engio/mbassy/listener/Handler;->rejectSubtypes()Z

    move-result p1

    xor-int/2addr p1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string p2, "subtypes"

    invoke-virtual {v4, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "listener"

    .line 83
    invoke-virtual {v4, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    const-class p1, Lnet/engio/mbassy/listener/Synchronized;

    invoke-static {p0, p1}, Lnet/engio/mbassy/common/ReflectionUtils;->getAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    if-eqz p0, :cond_6

    const/4 v0, 0x1

    :cond_6
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string p1, "synchronized"

    invoke-virtual {v4, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "messages"

    .line 85
    invoke-virtual {v4, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v4

    .line 51
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The message handler configuration may not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static cleanEL(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 91
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "${"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v2, "#{"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "}"

    .line 0
    invoke-static {v1, p0, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method
