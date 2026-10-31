.class public final Ll/ۖܽ֡;
.super Ll/ᩴܽ֡;
.source "J4EF"


# instance fields
.field public final ܳ:Ljava/lang/reflect/Method;

.field public final ܽ:Ljava/lang/Class;

.field public final ܿ:Ljava/lang/reflect/Method;

.field public final ᩳ:Ljava/lang/reflect/Method;

.field public final ᩻:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ll/ᩴܽ֡;-><init>()V

    .line 42
    iput-object p1, p0, Ll/ۖܽ֡;->ܿ:Ljava/lang/reflect/Method;

    .line 43
    iput-object p2, p0, Ll/ۖܽ֡;->ᩳ:Ljava/lang/reflect/Method;

    .line 44
    iput-object p3, p0, Ll/ۖܽ֡;->ܳ:Ljava/lang/reflect/Method;

    .line 45
    iput-object p4, p0, Ll/ۖܽ֡;->ܽ:Ljava/lang/Class;

    .line 46
    iput-object p5, p0, Ll/ۖܽ֡;->᩻:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final ֫(Ljavax/net/ssl/SSLSocket;)V
    .locals 3

    .line 64
    :try_start_0
    iget-object v0, p0, Ll/ۖܽ֡;->ܳ:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    const-string v0, "unable to remove alpn"

    .line 66
    invoke-static {v0, p1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public final ֫(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 5

    .line 51
    invoke-static {p3}, Ll/ᩴܽ֡;->֫(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p2

    .line 54
    :try_start_0
    const-class p3, Ll/ᩴܽ֡;

    invoke-virtual {p3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p3

    iget-object v0, p0, Ll/ۖܽ֡;->ܽ:Ljava/lang/Class;

    iget-object v1, p0, Ll/ۖܽ֡;->᩻:Ljava/lang/Class;

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    new-instance v1, Ll/ܺܽ֡;

    invoke-direct {v1, p2}, Ll/ܺܽ֡;-><init>(Ljava/util/ArrayList;)V

    invoke-static {p3, v3, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p2

    .line 56
    iget-object p3, p0, Ll/ۖܽ֡;->ܿ:Ljava/lang/reflect/Method;

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p1, v1, v4

    aput-object p2, v1, v0

    const/4 p1, 0x0

    invoke-virtual {p3, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    const-string p2, "unable to set alpn"

    .line 58
    invoke-static {p2, p1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public final ۧ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 3

    .line 72
    :try_start_0
    iget-object v0, p0, Ll/ۖܽ֡;->ᩳ:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    .line 73
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v0

    check-cast v0, Ll/ܺܽ֡;

    .line 74
    iget-boolean v1, v0, Ll/ܺܽ֡;->᩶:Z

    if-nez v1, :cond_0

    iget-object v2, v0, Ll/ܺܽ֡;->᩹:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 75
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v0

    const-string v1, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?"

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1, p1}, Ll/ᩴܽ֡;->֫(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-object p1

    :cond_0
    if-eqz v1, :cond_1

    return-object p1

    .line 79
    :cond_1
    iget-object p1, v0, Ll/ܺܽ֡;->᩹:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    const-string v0, "unable to get selected protocol"

    .line 81
    invoke-static {v0, p1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method
