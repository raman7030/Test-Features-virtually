.class public final Ll/ۡܽ֡;
.super Ll/ᩴܽ֡;
.source "Z4CG"


# instance fields
.field public final ܽ:Ljava/lang/reflect/Method;

.field public final ᩳ:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ll/ᩴܽ֡;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ۡܽ֡;->ᩳ:Ljava/lang/reflect/Method;

    .line 39
    iput-object p2, p0, Ll/ۡܽ֡;->ܽ:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final ֫(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    .line 46
    :try_start_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSSLParameters()Ljavax/net/ssl/SSLParameters;

    move-result-object p2

    .line 48
    invoke-static {p3}, Ll/ᩴܽ֡;->֫(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p3

    .line 50
    iget-object v0, p0, Ll/ۡܽ֡;->ᩳ:Ljava/lang/reflect/Method;

    .line 51
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p3, v1, v2

    .line 50
    invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setSSLParameters(Ljavax/net/ssl/SSLParameters;)V
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
    const-string p2, "unable to set ssl parameters"

    .line 55
    invoke-static {p2, p1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public final ۧ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 3

    const-string v0, "failed to get ALPN selected protocol"

    const/4 v1, 0x0

    .line 62
    :try_start_0
    iget-object v2, p0, Ll/ۡܽ֡;->ܽ:Ljava/lang/reflect/Method;

    invoke-virtual {v2, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    const-string v2, ""

    .line 66
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    .line 80
    invoke-static {v0, p1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Ljava/lang/UnsupportedOperationException;

    if-eqz v2, :cond_2

    :cond_1
    :goto_0
    return-object v1

    .line 78
    :cond_2
    invoke-static {v0, p1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method
