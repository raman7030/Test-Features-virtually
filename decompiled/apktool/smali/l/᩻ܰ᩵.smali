.class public final Ll/᩻ܰ᩵;
.super Ljava/lang/Object;
.source "U4EH"


# static fields
.field public static final ܽ:Ll/᩻ܰ᩵;


# instance fields
.field public final ֫:Ll/֨ܽ֡;

.field public final ۧ:Ljava/util/LinkedHashSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 129
    new-instance v0, Ll/ܿܰ᩵;

    invoke-direct {v0}, Ll/ܿܰ᩵;-><init>()V

    invoke-virtual {v0}, Ll/ܿܰ᩵;->֫()Ll/᩻ܰ᩵;

    move-result-object v0

    sput-object v0, Ll/᩻ܰ᩵;->ܽ:Ll/᩻ܰ᩵;

    return-void
.end method

.method public constructor <init>(Ljava/util/LinkedHashSet;Ll/֨ܽ֡;)V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    iput-object p1, p0, Ll/᩻ܰ᩵;->ۧ:Ljava/util/LinkedHashSet;

    .line 136
    iput-object p2, p0, Ll/᩻ܰ᩵;->֫:Ll/֨ܽ֡;

    return-void
.end method

.method public static ֫(Ljava/security/cert/X509Certificate;)Ljava/lang/String;
    .locals 1

    .line 243
    invoke-static {p0}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p0

    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0

    invoke-static {p0}, Ll/ۨܽ֡;->֫([B)Ll/ۨܽ֡;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۨܽ֡;->᩻()Ll/ۨܽ֡;

    move-result-object p0

    .line 246
    invoke-virtual {p0}, Ll/ۨܽ֡;->֫()Ljava/lang/String;

    move-result-object p0

    const-string v0, "sha256/"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 244
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Certificate pinning requires X509 certificates"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    .line 141
    :cond_0
    instance-of v0, p1, Ll/᩻ܰ᩵;

    if-eqz v0, :cond_1

    check-cast p1, Ll/᩻ܰ᩵;

    iget-object v0, p1, Ll/᩻ܰ᩵;->֫:Ll/֨ܽ֡;

    .line 142
    iget-object v1, p0, Ll/᩻ܰ᩵;->֫:Ll/֨ܽ֡;

    invoke-static {v1, v0}, Ll/᩶۟᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩻ܰ᩵;->ۧ:Ljava/util/LinkedHashSet;

    iget-object p1, p1, Ll/᩻ܰ᩵;->ۧ:Ljava/util/LinkedHashSet;

    .line 143
    invoke-interface {v0, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 147
    iget-object v0, p0, Ll/᩻ܰ᩵;->֫:Ll/֨ܽ֡;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 148
    iget-object v1, p0, Ll/᩻ܰ᩵;->ۧ:Ljava/util/LinkedHashSet;

    invoke-interface {v1}, Ljava/util/Set;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫(Ll/֨ܽ֡;)Ll/᩻ܰ᩵;
    .locals 2

    .line 231
    iget-object v0, p0, Ll/᩻ܰ᩵;->֫:Ll/֨ܽ֡;

    invoke-static {v0, p1}, Ll/᩶۟᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 233
    :cond_0
    new-instance v0, Ll/᩻ܰ᩵;

    iget-object v1, p0, Ll/᩻ܰ᩵;->ۧ:Ljava/util/LinkedHashSet;

    invoke-direct {v0, v1, p1}, Ll/᩻ܰ᩵;-><init>(Ljava/util/LinkedHashSet;Ll/֨ܽ֡;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/List;)V
    .locals 7

    .line 218
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 219
    iget-object v1, p0, Ll/᩻ܰ᩵;->ۧ:Ljava/util/LinkedHashSet;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_6

    .line 163
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 165
    :cond_0
    iget-object v1, p0, Ll/᩻ܰ᩵;->֫:Ll/֨ܽ֡;

    if-eqz v1, :cond_1

    .line 166
    invoke-virtual {v1, p1, p2}, Ll/֨ܽ֡;->֫(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 169
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_3

    .line 170
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/security/cert/X509Certificate;

    .line 176
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-gtz v5, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 177
    :cond_2
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳܰ᩵;

    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v3

    .line 191
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Certificate pinning failure!\n  Peer certificate chain:"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    const-string v5, "\n    "

    if-ge v4, v3, :cond_4

    .line 195
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/security/cert/X509Certificate;

    .line 196
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Ll/᩻ܰ᩵;->֫(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    .line 197
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v5

    invoke-interface {v5}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    const-string p2, "\n  Pinned certificates for "

    .line 199
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    :goto_2
    if-ge v2, p1, :cond_5

    .line 201
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܳܰ᩵;

    .line 202
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 204
    :cond_5
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 219
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳܰ᩵;

    .line 220
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    throw v3
.end method
