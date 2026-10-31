.class public final Ll/۠ܽ֡;
.super Ljava/lang/Object;
.source "Q4EB"

# interfaces
.implements Ljavax/net/ssl/HostnameVerifier;


# static fields
.field public static final ֫:Ll/۠ܽ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Ll/۠ܽ֡;

    .line 42
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    sput-object v0, Ll/۠ܽ֡;->֫:Ll/۠ܽ֡;

    return-void
.end method

.method public static ֫(Ljava/security/cert/X509Certificate;)Ljava/util/ArrayList;
    .locals 4

    const/4 v0, 0x7

    .line 85
    invoke-static {p0, v0}, Ll/۠ܽ֡;->֫(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    .line 86
    invoke-static {p0, v1}, Ll/۠ܽ֡;->֫(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p0

    .line 87
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v3, v2

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 89
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method public static ֫(Ljava/security/cert/X509Certificate;I)Ljava/util/List;
    .locals 4

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 96
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object p0

    if-nez p0, :cond_0

    .line 98
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 100
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 101
    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    .line 102
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-ge v2, v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 105
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_3

    goto :goto_0

    .line 109
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_1

    const/4 v2, 0x1

    .line 110
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 112
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_4
    return-object v0

    .line 118
    :catch_0
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0
.end method

.method public static ֫(Ljava/security/cert/X509Certificate;Ljava/lang/String;)Z
    .locals 8

    .line 56
    invoke-static {p1}, Ll/᩶۟᩵;->ۧ(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x7

    .line 63
    invoke-static {p0, v0}, Ll/۠ܽ֡;->֫(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p0

    .line 64
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_e

    .line 65
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 74
    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    .line 75
    invoke-static {p0, v0}, Ll/۠ܽ֡;->֫(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p0

    .line 76
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz p1, :cond_d

    .line 132
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_d

    const-string v3, "."

    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_d

    const-string v4, ".."

    .line 133
    invoke-virtual {p1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_2

    :cond_3
    if-eqz v0, :cond_d

    .line 137
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_d

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_d

    .line 138
    invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_2

    .line 152
    :cond_4
    invoke-virtual {p1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 153
    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_5
    move-object v4, p1

    .line 155
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_6

    .line 156
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 160
    :cond_6
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "*"

    .line 163
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    .line 165
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_3

    :cond_7
    const-string v3, "*."

    .line 179
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d

    const/16 v5, 0x2a

    invoke-virtual {v0, v5, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_8

    goto :goto_2

    .line 188
    :cond_8
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v5, v7, :cond_9

    goto :goto_2

    .line 193
    :cond_9
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_2

    .line 199
    :cond_a
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 200
    invoke-virtual {v4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_2

    .line 206
    :cond_b
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v3, v0

    if-lez v3, :cond_c

    add-int/lit8 v3, v3, -0x1

    const/16 v0, 0x2e

    .line 208
    invoke-virtual {v4, v0, v3}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v0

    if-eq v0, v6, :cond_c

    goto :goto_2

    :cond_c
    const/4 v0, 0x1

    goto :goto_3

    :cond_d
    :goto_2
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_2

    :goto_4
    return v2

    :cond_e
    return v1
.end method


# virtual methods
.method public final verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 1

    const/4 v0, 0x0

    .line 48
    :try_start_0
    invoke-interface {p2}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object p2

    .line 49
    aget-object p2, p2, v0

    check-cast p2, Ljava/security/cert/X509Certificate;

    invoke-static {p2, p1}, Ll/۠ܽ֡;->֫(Ljava/security/cert/X509Certificate;Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljavax/net/ssl/SSLException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return v0
.end method
