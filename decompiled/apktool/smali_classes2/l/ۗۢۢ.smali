.class public final Ll/ۗۢۢ;
.super Ljava/lang/Object;
.source "T1PJ"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ۙ:Z

.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Z

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 3

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "!"

    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    const-string v0, "\uff01"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    iput-boolean v2, p0, Ll/ۗۢۢ;->᩸:Z

    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 28
    iput-boolean v1, p0, Ll/ۗۢۢ;->᩸:Z

    :goto_1
    const-string v0, "**"

    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    .line 33
    iput v0, p0, Ll/ۗۢۢ;->᩹:I

    .line 0
    invoke-static {v0, v2, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 34
    iput-object p1, p0, Ll/ۗۢۢ;->᩶:Ljava/lang/String;

    goto :goto_2

    :cond_2
    const-string v0, "*"

    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 36
    iput v1, p0, Ll/ۗۢۢ;->᩹:I

    .line 0
    invoke-static {v1, v2, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 37
    iput-object p1, p0, Ll/ۗۢۢ;->᩶:Ljava/lang/String;

    goto :goto_2

    .line 39
    :cond_3
    iput v2, p0, Ll/ۗۢۢ;->᩹:I

    .line 40
    iput-object p1, p0, Ll/ۗۢۢ;->᩶:Ljava/lang/String;

    .line 42
    :goto_2
    iput-boolean p2, p0, Ll/ۗۢۢ;->ۙ:Z

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Ll/۟ۤ;
    .locals 7

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 75
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "\n"

    .line 76
    invoke-virtual {p0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v2, p0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, p0, v4

    .line 77
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    .line 78
    new-instance v6, Ll/ۗۢۢ;

    invoke-direct {v6, v5, v3}, Ll/ۗۢۢ;-><init>(Ljava/lang/String;Z)V

    .line 63
    iget-boolean v5, v6, Ll/ۗۢۢ;->᩸:Z

    if-eqz v5, :cond_0

    .line 80
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 82
    :cond_0
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 87
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 88
    new-instance p0, Ll/᩶ۢۢ;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll/᩶ۢۢ;-><init>(I)V

    return-object p0

    .line 90
    :cond_3
    new-instance p0, Ll/ۙۢۢ;

    invoke-direct {p0, v1, v0}, Ll/ۙۢۢ;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 8
    check-cast p1, Ll/ۗۢۢ;

    .line 69
    iget-boolean v0, p0, Ll/ۗۢۢ;->᩸:Z

    xor-int/lit8 v0, v0, 0x1

    iget-boolean p1, p1, Ll/ۗۢۢ;->᩸:Z

    xor-int/lit8 p1, p1, 0x1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 6

    const/4 v0, -0x1

    const/16 v1, 0x2e

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 46
    iget-object v4, p0, Ll/ۗۢۢ;->᩶:Ljava/lang/String;

    iget v5, p0, Ll/ۗۢۢ;->᩹:I

    if-nez v5, :cond_0

    .line 47
    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 48
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    iget-boolean v4, p0, Ll/ۗۢۢ;->ۙ:Z

    if-eqz v4, :cond_2

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x24

    if-ne v4, v5, :cond_2

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_0
    if-ne v5, v2, :cond_3

    .line 53
    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 54
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p1, v1, v4}, Ljava/lang/String;->indexOf(II)I

    move-result p1

    if-ne p1, v0, :cond_2

    :cond_1
    :goto_0
    return v2

    :cond_2
    return v3

    .line 58
    :cond_3
    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
