.class public final Ll/ۘܽ֡;
.super Ljava/lang/Object;
.source "N4E9"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:[Ljava/lang/Class;

.field public final ܽ:Ljava/lang/Class;


# direct methods
.method public varargs constructor <init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Ll/ۘܽ֡;->ܽ:Ljava/lang/Class;

    .line 47
    iput-object p2, p0, Ll/ۘܽ֡;->֫:Ljava/lang/String;

    .line 48
    iput-object p3, p0, Ll/ۘܽ֡;->ۧ:[Ljava/lang/Class;

    return-void
.end method

.method private ֫(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3

    .line 148
    iget-object v0, p0, Ll/ۘܽ֡;->֫:Ljava/lang/String;

    .line 149
    iget-object v1, p0, Ll/ۘܽ֡;->ۧ:[Ljava/lang/Class;

    const/4 v2, 0x0

    .line 164
    :try_start_0
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    .line 165
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_1

    :catch_1
    :goto_0
    move-object p1, v2

    :cond_0
    :goto_1
    if-eqz p1, :cond_1

    .line 150
    iget-object v0, p0, Ll/ۘܽ֡;->ܽ:Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 152
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    move-object v2, p1

    :goto_2
    return-object v2
.end method


# virtual methods
.method public final varargs ֫(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۘܽ֡;->֫(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 111
    :try_start_0
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 114
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpectedly could not call: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 115
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 116
    throw p2

    .line 108
    :cond_0
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Method "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۘܽ֡;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " not supported for object "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method

.method public final varargs ֫(Ljavax/net/ssl/SSLSocket;[Ljava/lang/Object;)V
    .locals 1

    .line 66
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۘܽ֡;->֫(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v0, :cond_0

    return-void

    .line 71
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_0
    return-void

    :catch_1
    move-exception p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    .line 89
    instance-of p2, p1, Ljava/lang/RuntimeException;

    if-eqz p2, :cond_1

    .line 90
    check-cast p1, Ljava/lang/RuntimeException;

    throw p1

    .line 92
    :cond_1
    new-instance p2, Ljava/lang/AssertionError;

    const-string v0, "Unexpected exception"

    invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 93
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 94
    throw p2
.end method

.method public final ֫(Ljavax/net/ssl/SSLSocket;)Z
    .locals 0

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۘܽ֡;->֫(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
