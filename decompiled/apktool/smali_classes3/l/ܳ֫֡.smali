.class public final Ll/ܳ֫֡;
.super Ljava/lang/Object;
.source "I4D7"


# instance fields
.field public final ֫:Ljava/util/List;

.field public ۧ:Z

.field public ܽ:Z

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput v0, p0, Ll/ܳ֫֡;->ᩳ:I

    .line 47
    iput-object p1, p0, Ll/ܳ֫֡;->֫:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫(Ljavax/net/ssl/SSLSocket;)Ll/ۖܰ᩵;
    .locals 6

    .line 58
    iget v0, p0, Ll/ܳ֫֡;->ᩳ:I

    iget-object v1, p0, Ll/ܳ֫֡;->֫:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    const/4 v3, 0x1

    if-ge v0, v2, :cond_1

    .line 59
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖܰ᩵;

    .line 60
    invoke-virtual {v4, p1}, Ll/ۖܰ᩵;->֫(Ljavax/net/ssl/SSLSocket;)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/2addr v0, v3

    .line 62
    iput v0, p0, Ll/ܳ֫֡;->ᩳ:I

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_4

    .line 138
    iget v0, p0, Ll/ܳ֫֡;->ᩳ:I

    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 139
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܰ᩵;

    invoke-virtual {v2, p1}, Ll/ۖܰ᩵;->֫(Ljavax/net/ssl/SSLSocket;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    .line 77
    :goto_3
    iput-boolean v3, p0, Ll/ܳ֫֡;->ܽ:Z

    .line 79
    sget-object v0, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-boolean v1, p0, Ll/ܳ֫֡;->ۧ:Z

    invoke-virtual {v0, v4, p1, v1}, Ll/۠۟᩵;->֫(Ll/ۖܰ᩵;Ljavax/net/ssl/SSLSocket;Z)V

    return-object v4

    .line 71
    :cond_4
    new-instance v0, Ljava/net/UnknownServiceException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to find acceptable protocols. isFallback="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Ll/ܳ֫֡;->ۧ:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", modes="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", supported protocols="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/io/IOException;)Z
    .locals 3

    const/4 v0, 0x1

    .line 93
    iput-boolean v0, p0, Ll/ܳ֫֡;->ۧ:Z

    .line 95
    iget-boolean v1, p0, Ll/ܳ֫֡;->ܽ:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 100
    :cond_0
    instance-of v1, p1, Ljava/net/ProtocolException;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 107
    :cond_1
    instance-of v1, p1, Ljava/io/InterruptedIOException;

    if-eqz v1, :cond_2

    goto :goto_0

    .line 113
    :cond_2
    instance-of v1, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v1, :cond_3

    .line 116
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Ljava/security/cert/CertificateException;

    if-eqz v2, :cond_3

    goto :goto_0

    .line 120
    :cond_3
    instance-of v2, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    if-nez v1, :cond_6

    .line 127
    instance-of v1, p1, Ljavax/net/ssl/SSLProtocolException;

    if-nez v1, :cond_6

    instance-of p1, p1, Ljavax/net/ssl/SSLException;

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_1
    return v0
.end method
