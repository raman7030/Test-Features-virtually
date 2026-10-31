.class public final Ll/۬ܰ᩵;
.super Ljava/lang/Object;
.source "H4CZ"


# instance fields
.field public final ֫:Ll/᩷ܰ᩵;

.field public final ۧ:Ljava/util/List;

.field public final ܽ:Ljava/util/List;

.field public final ᩳ:Ll/֨۟᩵;


# direct methods
.method public constructor <init>(Ll/֨۟᩵;Ll/᩷ܰ᩵;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/۬ܰ᩵;->ᩳ:Ll/֨۟᩵;

    .line 45
    iput-object p2, p0, Ll/۬ܰ᩵;->֫:Ll/᩷ܰ᩵;

    .line 46
    iput-object p3, p0, Ll/۬ܰ᩵;->ܽ:Ljava/util/List;

    .line 47
    iput-object p4, p0, Ll/۬ܰ᩵;->ۧ:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ljavax/net/ssl/SSLSession;)Ll/۬ܰ᩵;
    .locals 4

    .line 51
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v1, "SSL_NULL_WITH_NULL_NULL"

    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 56
    invoke-static {v0}, Ll/᩷ܰ᩵;->֫(Ljava/lang/String;)Ll/᩷ܰ᩵;

    move-result-object v0

    .line 58
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "NONE"

    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 61
    invoke-static {v1}, Ll/֨۟᩵;->֫(Ljava/lang/String;)Ll/֨۟᩵;

    move-result-object v1

    .line 65
    :try_start_0
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v2
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_0

    .line 70
    invoke-static {v2}, Ll/᩶۟᩵;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_1

    .line 71
    :cond_0
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 73
    :goto_1
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 75
    invoke-static {p0}, Ll/᩶۟᩵;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_2

    .line 76
    :cond_1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 78
    :goto_2
    new-instance v3, Ll/۬ܰ᩵;

    invoke-direct {v3, v1, v0, v2, p0}, Ll/۬ܰ᩵;-><init>(Ll/֨۟᩵;Ll/᩷ܰ᩵;Ljava/util/List;Ljava/util/List;)V

    return-object v3

    .line 60
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v0, "tlsVersion == NONE"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 59
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "tlsVersion == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 54
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string v0, "cipherSuite == SSL_NULL_WITH_NULL_NULL"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 52
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "cipherSuite == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/֨۟᩵;Ll/᩷ܰ᩵;Ljava/util/List;Ljava/util/List;)Ll/۬ܰ᩵;
    .locals 1

    if-eqz p0, :cond_0

    .line 85
    new-instance v0, Ll/۬ܰ᩵;

    invoke-static {p2}, Ll/᩶۟᩵;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 86
    invoke-static {p3}, Ll/᩶۟᩵;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, Ll/۬ܰ᩵;-><init>(Ll/֨۟᩵;Ll/᩷ܰ᩵;Ljava/util/List;Ljava/util/List;)V

    return-object v0

    .line 83
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "tlsVersion == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 127
    instance-of v0, p1, Ll/۬ܰ᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 128
    :cond_0
    check-cast p1, Ll/۬ܰ᩵;

    .line 129
    iget-object v0, p0, Ll/۬ܰ᩵;->ᩳ:Ll/֨۟᩵;

    iget-object v2, p1, Ll/۬ܰ᩵;->ᩳ:Ll/֨۟᩵;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/۬ܰ᩵;->֫:Ll/᩷ܰ᩵;

    iget-object v2, p1, Ll/۬ܰ᩵;->֫:Ll/᩷ܰ᩵;

    .line 130
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/۬ܰ᩵;->ܽ:Ljava/util/List;

    iget-object v2, p1, Ll/۬ܰ᩵;->ܽ:Ljava/util/List;

    .line 131
    invoke-interface {v0, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/۬ܰ᩵;->ۧ:Ljava/util/List;

    iget-object p1, p1, Ll/۬ܰ᩵;->ۧ:Ljava/util/List;

    .line 132
    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 137
    iget-object v0, p0, Ll/۬ܰ᩵;->ᩳ:Ll/֨۟᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 138
    iget-object v1, p0, Ll/۬ܰ᩵;->֫:Ll/᩷ܰ᩵;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 139
    iget-object v0, p0, Ll/۬ܰ᩵;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 140
    iget-object v1, p0, Ll/۬ܰ᩵;->ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫()Ll/᩷ܰ᩵;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/۬ܰ᩵;->֫:Ll/᩷ܰ᩵;

    return-object v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/۬ܰ᩵;->ۧ:Ljava/util/List;

    return-object v0
.end method

.method public final ܽ()Ljava/util/List;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/۬ܰ᩵;->ܽ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩳ()Ll/֨۟᩵;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/۬ܰ᩵;->ᩳ:Ll/֨۟᩵;

    return-object v0
.end method
