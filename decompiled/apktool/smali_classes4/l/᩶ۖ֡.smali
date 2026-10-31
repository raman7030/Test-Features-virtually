.class public final Ll/᩶ۖ֡;
.super Ljava/lang/Object;
.source "63TE"

# interfaces
.implements Ljavax/net/ssl/X509TrustManager;


# virtual methods
.method public final checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 2

    .line 54
    array-length p2, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    aget-object v1, p1, v0

    .line 55
    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->checkValidity()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
    .locals 1

    .line 65
    sget-object v0, Ll/᩹ۖ֡;->֫:[Ljava/security/cert/X509Certificate;

    return-object v0
.end method
