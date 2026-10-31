.class public final Ll/᩷֫ܿ;
.super Ljava/lang/Object;
.source "S708"


# instance fields
.field public ֫:[I

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    invoke-static {}, Ll/ۢ֫ܿ;->ܽ()[I

    move-result-object v0

    iput-object v0, p0, Ll/᩷֫ܿ;->֫:[I

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۢ֫ܿ;
    .locals 3

    .line 194
    iget-object v0, p0, Ll/᩷֫ܿ;->֫:[I

    if-eqz v0, :cond_3

    if-ltz p1, :cond_2

    .line 166
    iget v1, p0, Ll/᩷֫ܿ;->ۧ:I

    if-eqz v1, :cond_1

    add-int/lit8 v2, v1, -0x1

    shl-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, 0x1

    aget v2, v0, v2

    if-gt v2, p1, :cond_0

    goto :goto_0

    .line 167
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Search match is outside the text"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 170
    :cond_1
    :goto_0
    new-instance v2, Ll/ۢ֫ܿ;

    invoke-direct {v2, v1, p1, v0}, Ll/ۢ֫ܿ;-><init>(II[I)V

    const/4 p1, 0x0

    .line 171
    iput-object p1, p0, Ll/᩷֫ܿ;->֫:[I

    return-object v2

    .line 164
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Negative search text length"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 195
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Search match builder is already built"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(II)V
    .locals 8

    .line 194
    iget-object v0, p0, Ll/᩷֫ܿ;->֫:[I

    if-eqz v0, :cond_9

    if-ltz p1, :cond_8

    if-le p2, p1, :cond_8

    .line 147
    iget v1, p0, Ll/᩷֫ܿ;->ۧ:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    add-int/lit8 v3, v1, -0x1

    shl-int/2addr v3, v2

    add-int/2addr v3, v2

    aget v3, v0, v3

    if-lt p1, v3, :cond_0

    goto :goto_0

    .line 148
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Search matches overlap or are out of order"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    int-to-long v3, v1

    int-to-long v5, v2

    add-long/2addr v3, v5

    long-to-int v1, v3

    int-to-long v5, v1

    cmp-long v1, v3, v5

    if-nez v1, :cond_7

    const/4 v1, 0x2

    int-to-long v3, v1

    mul-long v5, v5, v3

    long-to-int v1, v5

    int-to-long v3, v1

    cmp-long v7, v5, v3

    if-nez v7, :cond_6

    .line 177
    array-length v3, v0

    if-lt v3, v1, :cond_2

    goto :goto_3

    .line 180
    :cond_2
    array-length v3, v0

    if-nez v3, :cond_3

    const/16 v0, 0x10

    goto :goto_1

    :cond_3
    array-length v0, v0

    :goto_1
    if-ge v0, v1, :cond_5

    shl-int/lit8 v3, v0, 0x1

    if-gt v3, v0, :cond_4

    goto :goto_2

    :cond_4
    move v0, v3

    goto :goto_1

    :cond_5
    move v1, v0

    .line 189
    :goto_2
    iget-object v0, p0, Ll/᩷֫ܿ;->֫:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/᩷֫ܿ;->֫:[I

    .line 151
    :goto_3
    iget-object v0, p0, Ll/᩷֫ܿ;->֫:[I

    iget v1, p0, Ll/᩷֫ܿ;->ۧ:I

    shl-int/lit8 v3, v1, 0x1

    aput p1, v0, v3

    add-int/2addr v3, v2

    .line 152
    aput p2, v0, v3

    add-int/2addr v1, v2

    .line 153
    iput v1, p0, Ll/᩷֫ܿ;->ۧ:I

    return-void

    .line 0
    :cond_6
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 145
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid search match range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 195
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Search match builder is already built"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
