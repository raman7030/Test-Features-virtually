.class public final Ll/֡ۡܺ;
.super Ll/ᩴᩴܺ;
.source "SBD8"


# instance fields
.field public final ۗ:I

.field public final ۙ:Ljava/util/HashMap;

.field public final ᩶:Ll/ۙۡܺ;

.field public final ᩹:[Ll/ۙۡܺ;


# direct methods
.method public constructor <init>(Ll/۬ۡܺ;)V
    .locals 3

    .line 59
    invoke-direct {p0}, Ll/ᩴᩴܺ;-><init>()V

    .line 64
    invoke-virtual {p1}, Ll/۬ۡܺ;->֫()Ll/ܿۡܺ;

    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ll/ܺᩴܺ;->֨()I

    move-result v0

    .line 67
    invoke-virtual {p1}, Ll/ܿۡܺ;->᩸()I

    move-result v1

    iput v1, p0, Ll/֡ۡܺ;->ۗ:I

    .line 68
    new-instance v2, Ll/ۙۡܺ;

    invoke-direct {v2, v1}, Ll/ۙۡܺ;-><init>(I)V

    iput-object v2, p0, Ll/֡ۡܺ;->᩶:Ll/ۙۡܺ;

    .line 69
    new-array v0, v0, [Ll/ۙۡܺ;

    iput-object v0, p0, Ll/֡ۡܺ;->᩹:[Ll/ۙۡܺ;

    .line 70
    new-instance v0, Ljava/util/HashMap;

    .line 71
    invoke-virtual {p1}, Ll/ܿۡܺ;->۠()I

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/֡ۡܺ;->ۙ:Ljava/util/HashMap;

    .line 73
    invoke-virtual {v2}, Ll/ᩴᩴܺ;->ܺ()V

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۙۡܺ;
    .locals 1

    .line 252
    :try_start_0
    iget-object v0, p0, Ll/֡ۡܺ;->᩹:[Ll/ۙۡܺ;

    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    .line 177
    invoke-virtual {p1}, Ll/ۙۡܺ;->֨()Ll/ۙۡܺ;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ll/ۙۡܺ;

    iget v0, p0, Ll/֡ۡܺ;->ۗ:I

    invoke-direct {p1, v0}, Ll/ۙۡܺ;-><init>(I)V

    return-object p1

    .line 255
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus label"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܽۡܺ;)Ll/ۙۡܺ;
    .locals 1

    .line 161
    invoke-virtual {p1}, Ll/ܽۡܺ;->֫()I

    move-result p1

    .line 252
    :try_start_0
    iget-object v0, p0, Ll/֡ۡܺ;->᩹:[Ll/ۙۡܺ;

    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    return-object p1

    .line 149
    :cond_0
    iget-object p1, p0, Ll/֡ۡܺ;->᩶:Ll/ۙۡܺ;

    return-object p1

    .line 255
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus label"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܺۡܺ;)Ll/᩸ۡܺ;
    .locals 1

    .line 216
    iget-object v0, p0, Ll/֡ۡܺ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸ۡܺ;

    return-object p1
.end method

.method public final ֫(Ll/ܺۡܺ;Ll/᩸ۡܺ;)V
    .locals 1

    .line 195
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 205
    iget-object v0, p0, Ll/֡ۡܺ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(ILl/ۙۡܺ;)Z
    .locals 6

    const-string v0, "bogus label"

    .line 113
    iget-object v1, p0, Ll/֡ۡܺ;->᩹:[Ll/ۙۡܺ;

    .line 252
    :try_start_0
    aget-object v2, v1, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    .line 84
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 91
    :try_start_1
    aput-object p2, v1, p1
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    return v3

    .line 94
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 121
    :cond_0
    invoke-virtual {v2}, Ll/ۙۡܺ;->֨()Ll/ۙۡܺ;

    move-result-object v4

    .line 122
    invoke-virtual {v2}, Ll/ۙۡܺ;->size()I

    move-result v5

    if-eqz v5, :cond_1

    .line 123
    invoke-virtual {v4, p2}, Ll/ۙۡܺ;->֫(Ll/ۙۡܺ;)V

    goto :goto_0

    .line 125
    :cond_1
    invoke-virtual {p2}, Ll/ۙۡܺ;->֨()Ll/ۙۡܺ;

    move-result-object v4

    .line 128
    :goto_0
    invoke-virtual {v2, v4}, Ll/ۙۡܺ;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p1, 0x0

    return p1

    .line 132
    :cond_2
    invoke-virtual {v4}, Ll/ᩴᩴܺ;->ܺ()V

    .line 84
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 91
    :try_start_2
    aput-object v4, v1, p1
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    return v3

    .line 94
    :catch_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 255
    :catch_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۚ()I
    .locals 1

    .line 225
    iget-object v0, p0, Ll/֡ۡܺ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method
