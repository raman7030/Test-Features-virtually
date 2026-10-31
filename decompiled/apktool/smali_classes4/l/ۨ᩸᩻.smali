.class public final Ll/ۨ᩸᩻;
.super Ll/ܰܺܳ;
.source "S97P"


# static fields
.field public static final ᩹:Ll/ۨ᩸᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Ll/ۨ᩸᩻;

    .line 25
    invoke-direct {v0}, Ll/ܰܺܳ;-><init>()V

    .line 23
    sput-object v0, Ll/ۨ᩸᩻;->᩹:Ll/ۨ᩸᩻;

    return-void
.end method

.method public static ᩳ(Ljava/lang/String;)Ll/ۛ᩸᩻;
    .locals 3

    const-string v0, "/"

    .line 107
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x2f

    .line 108
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 112
    :cond_0
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 113
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 116
    new-instance v1, Ll/ۛ᩸᩻;

    invoke-direct {v1, v0, p0}, Ll/ۛ᩸᩻;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;
    .locals 0

    .line 53
    invoke-interface {p2}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 5

    .line 78
    invoke-static {p1}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "/"

    .line 79
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 90
    :cond_0
    invoke-static {p1}, Ll/ۨ᩸᩻;->ᩳ(Ljava/lang/String;)Ll/ۛ᩸᩻;

    move-result-object p1

    if-nez p1, :cond_1

    .line 92
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 94
    :cond_1
    invoke-virtual {p1}, Ll/ۛ᩸᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    const/4 v0, 0x1

    .line 413
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object p1

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_2

    .line 97
    new-instance v3, Ll/۫᩸᩻;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ᩵ܿ;

    invoke-direct {v3, v4, p2}, Ll/۫᩸᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 99
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0

    .line 80
    :cond_3
    :goto_1
    invoke-static {}, Ll/᩹֡ܿ;->᩻()Ljava/util/List;

    move-result-object p1

    .line 81
    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :goto_2
    if-ge v1, v0, :cond_4

    .line 83
    new-instance v2, Ll/۫᩸᩻;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸֡ܿ;

    invoke-direct {v2, v3}, Ll/۫᩸᩻;-><init>(Ll/᩸֡ܿ;)V

    .line 85
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    return-object p2
.end method

.method public final ֫(Ljava/lang/String;)Ll/ᩳۜܳ;
    .locals 3

    .line 59
    invoke-static {p1}, Ll/ۨ᩸᩻;->ᩳ(Ljava/lang/String;)Ll/ۛ᩸᩻;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "/"

    .line 63
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    .line 64
    new-instance v2, Ll/۫᩸᩻;

    invoke-static {p1}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ll/ۛ᩸᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-direct {v2, v0, p1}, Ll/۫᩸᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 65
    invoke-virtual {v2}, Ll/ܺۘܳ;->isDirectory()Z

    move-result p1

    if-eq p1, v1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v2
.end method

.method public final ֫(Ljava/security/MessageDigest;)V
    .locals 1

    const-string v0, "trash"

    .line 73
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 46
    invoke-static {}, Ll/᩹֡ܿ;->ۜ()V

    :cond_0
    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    const-string v0, "trash"

    return-object v0
.end method
