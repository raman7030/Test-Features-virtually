.class public final Ll/֡ܽ֡;
.super Ll/֨ܽ֡;
.source "64DG"


# instance fields
.field public final ֫:Ll/ܶܽ֡;


# direct methods
.method public constructor <init>(Ll/ܶܽ֡;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/֡ܽ֡;->֫:Ll/ܶܽ֡;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 121
    :cond_0
    instance-of v1, p1, Ll/֡ܽ֡;

    if-eqz v1, :cond_1

    check-cast p1, Ll/֡ܽ֡;

    iget-object p1, p1, Ll/֡ܽ֡;->֫:Ll/ܶܽ֡;

    iget-object v1, p0, Ll/֡ܽ֡;->֫:Ll/ܶܽ֡;

    .line 122
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 116
    iget-object v0, p0, Ll/֡ܽ֡;->֫:Ll/ܶܽ֡;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 7

    .line 56
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1, p2}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 57
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 58
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x9

    if-ge v0, v2, :cond_7

    const/4 v2, 0x1

    .line 0
    invoke-static {p2, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v3

    .line 63
    check-cast v3, Ljava/security/cert/X509Certificate;

    .line 68
    iget-object v4, p0, Ll/֡ܽ֡;->֫:Ll/ܶܽ֡;

    invoke-interface {v4, v3}, Ll/ܶܽ֡;->֫(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 70
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, v2, :cond_0

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 71
    :cond_0
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    :cond_1
    invoke-virtual {v4}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v1

    invoke-virtual {v4}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/security/Principal;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 108
    :cond_2
    :try_start_0
    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/security/cert/Certificate;->verify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    :goto_1
    const/4 v1, 0x1

    goto :goto_3

    .line 82
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 83
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/cert/X509Certificate;

    .line 106
    invoke-virtual {v3}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v5

    invoke-virtual {v4}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/security/Principal;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    .line 108
    :cond_4
    :try_start_1
    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/security/cert/Certificate;->verify(Ljava/security/PublicKey;)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 85
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 86
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_1
    nop

    goto :goto_2

    :cond_5
    if-eqz v1, :cond_6

    :goto_4
    return-object p2

    .line 97
    :cond_6
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Failed to find a trusted cert that signed "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 101
    :cond_7
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Certificate chain too long: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
