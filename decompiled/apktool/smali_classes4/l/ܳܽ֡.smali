.class public final Ll/ܳܽ֡;
.super Ll/֨ܽ֡;
.source "I4F2"


# instance fields
.field public final ֫:Ljava/lang/reflect/Method;

.field public final ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 303
    iput-object p1, p0, Ll/ܳܽ֡;->ۧ:Ljava/lang/Object;

    .line 304
    iput-object p2, p0, Ll/ܳܽ֡;->֫:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 324
    instance-of p1, p1, Ll/ܳܽ֡;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 4

    .line 311
    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/security/cert/X509Certificate;

    invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/security/cert/X509Certificate;

    .line 312
    iget-object v0, p0, Ll/ܳܽ֡;->֫:Ljava/lang/reflect/Method;

    iget-object v1, p0, Ll/ܳܽ֡;->ۧ:Ljava/lang/Object;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const-string p2, "RSA"

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 p2, 0x2

    aput-object p1, v2, p2

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 319
    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :catch_1
    move-exception p1

    .line 315
    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 316
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 317
    throw p2
.end method
