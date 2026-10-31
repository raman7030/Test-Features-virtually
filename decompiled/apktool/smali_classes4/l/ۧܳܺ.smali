.class public final Ll/ۧܳܺ;
.super Ll/۠ܳܺ;
.source "4BF0"


# instance fields
.field public final ܿ:Ll/ۙۡܺ;


# direct methods
.method public constructor <init>(Ll/ۤۡܺ;Ll/ۙۡܺ;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Ll/۠ܳܺ;-><init>(Ll/ۤۡܺ;)V

    if-eqz p2, :cond_0

    .line 50
    iput-object p2, p0, Ll/ۧܳܺ;->ܿ:Ll/ۙۡܺ;

    return-void

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "locals == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ۧܳܺ;->ܿ:Ll/ۙۡܺ;

    invoke-virtual {v0}, Ll/ۙۡܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܽۖܺ;)Ll/ۙܿܺ;
    .locals 7

    .line 113
    new-instance v0, Ll/ۧܳܺ;

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v1

    .line 67
    iget-object v2, p0, Ll/ۧܳܺ;->ܿ:Ll/ۙۡܺ;

    invoke-virtual {v2}, Ll/ۙۡܺ;->ۚ()I

    move-result v3

    .line 68
    new-instance v4, Ll/ۙۡܺ;

    invoke-virtual {p1}, Ll/ܽۖܺ;->֫()I

    move-result v5

    invoke-direct {v4, v5}, Ll/ۙۡܺ;-><init>(I)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 71
    invoke-virtual {v2, v5}, Ll/ۙۡܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 73
    invoke-virtual {p1, v6}, Ll/ܽۖܺ;->֫(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;

    move-result-object v6

    invoke-virtual {v4, v6}, Ll/ۙۡܺ;->ۧ(Ll/᩸ۡܺ;)V

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {v4}, Ll/ᩴᩴܺ;->ܺ()V

    .line 80
    invoke-virtual {v4, v2}, Ll/ۙۡܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v4

    .line 113
    :goto_1
    invoke-direct {v0, v1, v2}, Ll/ۧܳܺ;-><init>(Ll/ۤۡܺ;Ll/ۙۡܺ;)V

    return-object v0
.end method

.method public final ֫(Ll/᩶ۡܺ;)Ll/ۙܿܺ;
    .locals 2

    .line 66
    new-instance p1, Ll/ۧܳܺ;

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧܳܺ;->ܿ:Ll/ۙۡܺ;

    invoke-direct {p1, v0, v1}, Ll/ۧܳܺ;-><init>(Ll/ۤۡܺ;Ll/ۙۡܺ;)V

    return-object p1
.end method

.method public final ۖ()Ll/ۙۡܺ;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ۧܳܺ;->ܿ:Ll/ۙۡܺ;

    return-object v0
.end method

.method public final ۧ(I)Ll/ۙܿܺ;
    .locals 3

    .line 58
    new-instance v0, Ll/ۧܳܺ;

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v1

    iget-object v2, p0, Ll/ۧܳܺ;->ܿ:Ll/ۙۡܺ;

    invoke-virtual {v2, p1}, Ll/ۙۡܺ;->֫(I)Ll/ۙۡܺ;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll/ۧܳܺ;-><init>(Ll/ۤۡܺ;Ll/ۙۡܺ;)V

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 6

    .line 91
    iget-object v0, p0, Ll/ۧܳܺ;->ܿ:Ll/ۙۡܺ;

    invoke-virtual {v0}, Ll/ۙۡܺ;->size()I

    move-result v1

    .line 92
    invoke-virtual {v0}, Ll/ۙۡܺ;->ۚ()I

    move-result v2

    .line 93
    new-instance v3, Ljava/lang/StringBuilder;

    mul-int/lit8 v1, v1, 0x28

    add-int/lit8 v1, v1, 0x64

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "local-snapshot"

    .line 95
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 98
    invoke-virtual {v0, v1}, Ll/ۙۡܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v4

    if-eqz v4, :cond_0

    const-string v5, "\n  "

    .line 100
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    invoke-static {v4}, Ll/ܽܳܺ;->֫(Ll/᩸ۡܺ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 105
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
