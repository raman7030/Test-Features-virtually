.class public final Ll/᩶ۖܺ;
.super Ll/ᩴᩴܺ;
.source "SBD8"


# instance fields
.field public final ۗ:I

.field public final ۙ:Ljava/util/HashMap;

.field public final ᩶:Ll/ۙۡܺ;

.field public final ᩹:[Ll/ۙۡܺ;


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;)V
    .locals 2

    .line 61
    invoke-direct {p0}, Ll/ᩴᩴܺ;-><init>()V

    .line 66
    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    .line 68
    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۜ()I

    move-result p1

    iput p1, p0, Ll/᩶ۖܺ;->ۗ:I

    .line 69
    new-instance v1, Ll/ۙۡܺ;

    invoke-direct {v1, p1}, Ll/ۙۡܺ;-><init>(I)V

    iput-object v1, p0, Ll/᩶ۖܺ;->᩶:Ll/ۙۡܺ;

    .line 70
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ll/ۙۡܺ;

    iput-object p1, p0, Ll/᩶ۖܺ;->᩹:[Ll/ۙۡܺ;

    .line 71
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/᩶ۖܺ;->ۙ:Ljava/util/HashMap;

    .line 74
    invoke-virtual {v1}, Ll/ᩴᩴܺ;->ܺ()V

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۙۡܺ;
    .locals 1

    .line 249
    :try_start_0
    iget-object v0, p0, Ll/᩶ۖܺ;->᩹:[Ll/ۙۡܺ;

    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    return-object p1

    .line 146
    :cond_0
    iget-object p1, p0, Ll/᩶ۖܺ;->᩶:Ll/ۙۡܺ;

    return-object p1

    .line 252
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus index"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;)V
    .locals 1

    .line 192
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 202
    iget-object v0, p0, Ll/᩶ۖܺ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(ILl/ۙۡܺ;)Z
    .locals 5

    const-string v0, "bogus index"

    .line 114
    iget-object v1, p0, Ll/᩶ۖܺ;->᩹:[Ll/ۙۡܺ;

    .line 249
    :try_start_0
    aget-object v2, v1, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    .line 85
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 92
    :try_start_1
    aput-object p2, v1, p1
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    return v3

    .line 95
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 122
    :cond_0
    invoke-virtual {v2}, Ll/ۙۡܺ;->֨()Ll/ۙۡܺ;

    move-result-object v4

    .line 123
    invoke-virtual {v4, p2}, Ll/ۙۡܺ;->֫(Ll/ۙۡܺ;)V

    .line 125
    invoke-virtual {v2, v4}, Ll/ۙۡܺ;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    return p1

    .line 129
    :cond_1
    invoke-virtual {v4}, Ll/ᩴᩴܺ;->ܺ()V

    .line 85
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 92
    :try_start_2
    aput-object v4, v1, p1
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    return v3

    .line 95
    :catch_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 252
    :catch_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(I)Ll/ۙۡܺ;
    .locals 1

    .line 249
    :try_start_0
    iget-object v0, p0, Ll/᩶ۖܺ;->᩹:[Ll/ۙۡܺ;

    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    .line 174
    invoke-virtual {p1}, Ll/ۙۡܺ;->֨()Ll/ۙۡܺ;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ll/ۙۡܺ;

    iget v0, p0, Ll/᩶ۖܺ;->ۗ:I

    invoke-direct {p1, v0}, Ll/ۙۡܺ;-><init>(I)V

    return-object p1

    .line 252
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus index"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
