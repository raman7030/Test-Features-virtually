.class public final Lcom/amazonaws/auth/SignerFactory;
.super Ljava/lang/Object;
.source "SignerFactory.java"


# static fields
.field public static final ֫:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 31
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Lcom/amazonaws/auth/SignerFactory;->֫:Ll/ۧۤᩴ;

    const-string v1, "QueryStringSignerType"

    .line 35
    const-class v2, Lcom/amazonaws/auth/QueryStringSigner;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AWS4SignerType"

    .line 36
    const-class v2, Lcom/amazonaws/auth/AWS4Signer;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "NoOpSignerType"

    .line 37
    const-class v2, Lcom/amazonaws/auth/NoOpSigner;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Lcom/amazonaws/auth/Signer;
    .locals 2

    const-string v0, "Cannot create an instance of "

    .line 111
    sget-object v1, Lcom/amazonaws/auth/SignerFactory;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v1, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Class;

    if-eqz p0, :cond_1

    .line 116
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazonaws/auth/Signer;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    instance-of p0, v1, Lcom/amazonaws/auth/ServiceAwareSigner;

    if-eqz p0, :cond_0

    .line 128
    move-object p0, v1

    check-cast p0, Lcom/amazonaws/auth/ServiceAwareSigner;

    invoke-interface {p0, p1}, Lcom/amazonaws/auth/ServiceAwareSigner;->setServiceName(Ljava/lang/String;)V

    :cond_0
    return-object v1

    :catch_0
    move-exception p1

    .line 122
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 123
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception p1

    .line 118
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 119
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 113
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1

    .line 63
    sget-object v0, Lcom/amazonaws/auth/SignerFactory;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1, p0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Lcom/amazonaws/auth/Signer;
    .locals 1

    .line 98
    invoke-static {}, Lcom/amazonaws/internal/config/InternalConfig$Factory;->֫()Lcom/amazonaws/internal/config/InternalConfig;

    move-result-object v0

    .line 100
    invoke-virtual {v0, p0, p1}, Lcom/amazonaws/internal/config/InternalConfig;->֫(Ljava/lang/String;Ljava/lang/String;)Lcom/amazonaws/internal/config/SignerConfig;

    move-result-object p1

    .line 101
    invoke-virtual {p1}, Lcom/amazonaws/internal/config/SignerConfig;->֫()Ljava/lang/String;

    move-result-object p1

    .line 102
    invoke-static {p1, p0}, Lcom/amazonaws/auth/SignerFactory;->֫(Ljava/lang/String;Ljava/lang/String;)Lcom/amazonaws/auth/Signer;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;Ljava/lang/String;)Lcom/amazonaws/auth/Signer;
    .locals 0

    .line 90
    invoke-static {p0, p1}, Lcom/amazonaws/auth/SignerFactory;->֫(Ljava/lang/String;Ljava/lang/String;)Lcom/amazonaws/auth/Signer;

    move-result-object p0

    return-object p0
.end method
