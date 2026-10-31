.class public final Ll/ۡۛۜ;
.super Ljava/lang/Object;
.source "B6JQ"


# instance fields
.field public final ֫:[D

.field public final ۜ:[I

.field public ۧ:D

.field public final ܳ:[D

.field public ܽ:I

.field public ܿ:D

.field public final ᩳ:[I

.field public ᩻:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-array v0, p1, [I

    iput-object v0, p0, Ll/ۡۛۜ;->ۜ:[I

    .line 14
    new-array v0, p1, [I

    iput-object v0, p0, Ll/ۡۛۜ;->ᩳ:[I

    .line 15
    new-array v0, p1, [D

    iput-object v0, p0, Ll/ۡۛۜ;->֫:[D

    add-int/lit8 p1, p1, 0x1

    .line 16
    new-array p1, p1, [D

    iput-object p1, p0, Ll/ۡۛۜ;->ܳ:[D

    return-void
.end method

.method private ۜ(I)D
    .locals 6

    .line 48
    invoke-virtual {p0, p1}, Ll/ۡۛۜ;->ᩳ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/ۡۛۜ;->ܿ:D

    iget-object v2, p0, Ll/ۡۛۜ;->ᩳ:[I

    aget v2, v2, p1

    int-to-double v2, v2

    invoke-virtual {p0, p1}, Ll/ۡۛۜ;->ܿ(I)D

    move-result-wide v4

    mul-double v2, v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iget v0, p0, Ll/ۡۛۜ;->ܽ:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-double v0, p1

    :goto_0
    iget-wide v2, p0, Ll/ۡۛۜ;->ۧ:D

    add-double/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 19
    iget-object v0, p0, Ll/ۡۛۜ;->ۜ:[I

    array-length v0, v0

    return v0
.end method

.method public final ֫(D)I
    .locals 11

    .line 19
    iget-object v0, p0, Ll/ۡۛۜ;->ۜ:[I

    array-length v1, v0

    .line 66
    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    :goto_0
    if-eqz v1, :cond_1

    add-int v5, v2, v1

    .line 19
    array-length v6, v0

    if-gt v5, v6, :cond_0

    .line 68
    iget-object v6, p0, Ll/ۡۛۜ;->ܳ:[D

    aget-wide v7, v6, v5

    add-double v9, v3, v7

    cmpg-double v6, v9, p1

    if-gtz v6, :cond_0

    add-double/2addr v3, v7

    move v2, v5

    :cond_0
    shr-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 19
    :cond_1
    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    .line 73
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public final ֫(I)I
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ۡۛۜ;->ᩳ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(IFI)V
    .locals 5

    .line 25
    iput p1, p0, Ll/ۡۛۜ;->᩻:I

    .line 26
    iput p3, p0, Ll/ۡۛۜ;->ܽ:I

    const/high16 p1, 0x40000000    # 2.0f

    mul-float p1, p1, p2

    float-to-double v0, p1

    .line 27
    iput-wide v0, p0, Ll/ۡۛۜ;->ۧ:D

    const/high16 p1, 0x42400000    # 48.0f

    mul-float p2, p2, p1

    float-to-double p1, p2

    int-to-double v0, p3

    const-wide/high16 v2, 0x4038000000000000L    # 24.0

    div-double/2addr v0, v2

    .line 29
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    iput-wide p1, p0, Ll/ۡۛۜ;->ܿ:D

    const-wide/16 p1, 0x0

    .line 30
    iget-object p3, p0, Ll/ۡۛۜ;->ܳ:[D

    invoke-static {p3, p1, p2}, Ljava/util/Arrays;->fill([DD)V

    const/4 p1, 0x0

    .line 19
    :goto_0
    iget-object p2, p0, Ll/ۡۛۜ;->ۜ:[I

    array-length p2, p2

    if-ge p1, p2, :cond_1

    .line 32
    invoke-direct {p0, p1}, Ll/ۡۛۜ;->ۜ(I)D

    move-result-wide v0

    iget-object p2, p0, Ll/ۡۛۜ;->֫:[D

    aput-wide v0, p2, p1

    add-int/lit8 v0, p1, 0x1

    .line 33
    aget-wide v1, p3, v0

    aget-wide p1, p2, p1

    add-double/2addr v1, p1

    aput-wide v1, p3, v0

    neg-int p1, v0

    and-int/2addr p1, v0

    add-int/2addr p1, v0

    .line 35
    array-length p2, p3

    if-ge p1, p2, :cond_0

    aget-wide v3, p3, p1

    add-double/2addr v3, v1

    aput-wide v3, p3, p1

    :cond_0
    move p1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(III)V
    .locals 5

    .line 40
    iget-object v0, p0, Ll/ۡۛۜ;->ۜ:[I

    aput p2, v0, p1

    .line 41
    iget-object p2, p0, Ll/ۡۛۜ;->ᩳ:[I

    aput p3, p2, p1

    .line 42
    invoke-direct {p0, p1}, Ll/ۡۛۜ;->ۜ(I)D

    move-result-wide p2

    iget-object v0, p0, Ll/ۡۛۜ;->֫:[D

    aget-wide v1, v0, p1

    sub-double v1, p2, v1

    .line 43
    aput-wide p2, v0, p1

    add-int/lit8 p1, p1, 0x1

    .line 44
    :goto_0
    iget-object p2, p0, Ll/ۡۛۜ;->ܳ:[D

    array-length p3, p2

    if-ge p1, p3, :cond_0

    aget-wide v3, p2, p1

    add-double/2addr v3, v1

    aput-wide v3, p2, p1

    neg-int p2, p1

    and-int/2addr p2, p1

    add-int/2addr p1, p2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()D
    .locals 4

    .line 19
    iget-object v0, p0, Ll/ۡۛۜ;->ۜ:[I

    array-length v0, v0

    .line 61
    invoke-virtual {p0, v0}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v0

    iget-wide v2, p0, Ll/ۡۛۜ;->ۧ:D

    sub-double/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(I)D
    .locals 6

    .line 53
    invoke-virtual {p0, p1}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v0

    iget-object v2, p0, Ll/ۡۛۜ;->ᩳ:[I

    aget v2, v2, p1

    int-to-double v2, v2

    invoke-virtual {p0, p1}, Ll/ۡۛۜ;->ܿ(I)D

    move-result-wide v4

    mul-double v2, v2, v4

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public final ܳ(I)D
    .locals 5

    const-wide/16 v0, 0x0

    :goto_0
    if-lez p1, :cond_0

    .line 57
    iget-object v2, p0, Ll/ۡۛۜ;->ܳ:[D

    aget-wide v3, v2, p1

    add-double/2addr v0, v3

    neg-int v2, p1

    and-int/2addr v2, p1

    sub-int/2addr p1, v2

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public final ܽ(I)D
    .locals 5

    .line 52
    iget-object v0, p0, Ll/ۡۛۜ;->֫:[D

    aget-wide v1, v0, p1

    iget-wide v3, p0, Ll/ۡۛۜ;->ۧ:D

    sub-double/2addr v1, v3

    return-wide v1
.end method

.method public final ܿ(I)D
    .locals 4

    .line 51
    invoke-virtual {p0, p1}, Ll/ۡۛۜ;->ᩳ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۡۛۜ;->᩻:I

    int-to-double v0, v0

    iget-object v2, p0, Ll/ۡۛۜ;->ۜ:[I

    aget p1, v2, p1

    int-to-double v2, p1

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0
.end method

.method public final ᩳ(I)Z
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ۡۛۜ;->ۜ:[I

    aget p1, v0, p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩻(I)I
    .locals 1

    .line 21
    iget-object v0, p0, Ll/ۡۛۜ;->ۜ:[I

    aget p1, v0, p1

    return p1
.end method
