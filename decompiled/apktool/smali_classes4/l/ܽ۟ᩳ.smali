.class public final Ll/ܽ۟ᩳ;
.super Ljava/lang/Object;
.source "96NV"


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public ܳ:[I

.field public ܽ:I

.field public final ܿ:Ll/ۤܽᩴ;

.field public ᩳ:[F


# direct methods
.method public constructor <init>(Ll/ۤܽᩴ;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 13
    iput v0, p0, Ll/ܽ۟ᩳ;->ܽ:I

    const/4 v0, -0x1

    .line 14
    filled-new-array {v0, v0}, [I

    move-result-object v0

    iput-object v0, p0, Ll/ܽ۟ᩳ;->ܳ:[I

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 15
    iput-object v0, p0, Ll/ܽ۟ᩳ;->ᩳ:[F

    .line 18
    iput-object p1, p0, Ll/ܽ۟ᩳ;->ܿ:Ll/ۤܽᩴ;

    return-void
.end method

.method public static ֫(Ll/ۤܽᩴ;)Ll/ܽ۟ᩳ;
    .locals 1

    .line 29
    new-instance v0, Ll/ܽ۟ᩳ;

    invoke-direct {v0, p0}, Ll/ܽ۟ᩳ;-><init>(Ll/ۤܽᩴ;)V

    const/4 p0, 0x1

    .line 30
    iput-boolean p0, v0, Ll/ܽ۟ᩳ;->֫:Z

    const/4 p0, 0x0

    .line 31
    invoke-virtual {v0, p0}, Ll/ܽ۟ᩳ;->ۧ(I)Z

    return-object v0
.end method

.method private ֫(II)V
    .locals 1

    .line 107
    iget v0, p0, Ll/ܽ۟ᩳ;->ܽ:I

    add-int/2addr p1, v0

    shr-int/lit8 p1, p1, 0x1

    add-int/2addr v0, p2

    add-int/lit8 v0, v0, -0x1

    shr-int/lit8 p2, v0, 0x1

    :goto_0
    if-lez p1, :cond_1

    move v0, p1

    :goto_1
    if-gt v0, p2, :cond_0

    .line 110
    invoke-direct {p0, v0}, Ll/ܽ۟ᩳ;->ܽ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    shr-int/lit8 p1, p1, 0x1

    shr-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ܽ(I)V
    .locals 5

    mul-int/lit8 v0, p1, 0x2

    add-int/lit8 v1, v0, 0x1

    .line 115
    iget-object v2, p0, Ll/ܽ۟ᩳ;->ܳ:[I

    aget v3, v2, v0

    if-gez v3, :cond_0

    goto :goto_0

    :cond_0
    aget v3, v2, v1

    if-gez v3, :cond_1

    goto :goto_1

    .line 116
    :cond_1
    iget-object v3, p0, Ll/ܽ۟ᩳ;->ᩳ:[F

    aget v4, v3, v0

    aget v3, v3, v1

    cmpl-float v3, v4, v3

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v1

    .line 117
    :goto_1
    aget v1, v2, v0

    aput v1, v2, p1

    .line 118
    iget-object v1, p0, Ll/ܽ۟ᩳ;->ᩳ:[F

    aget v0, v1, v0

    aput v0, v1, p1

    return-void
.end method

.method private ᩳ(I)Z
    .locals 7

    mul-int/lit8 v0, p1, 0x40

    .line 73
    iget-object v1, p0, Ll/ܽ۟ᩳ;->ܿ:Ll/ۤܽᩴ;

    invoke-virtual {v1}, Ll/ۤܽᩴ;->size()I

    move-result v2

    sub-int/2addr v2, v0

    const/16 v3, 0x40

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/2addr v2, v0

    const/high16 v3, -0x40800000    # -1.0f

    move v3, v0

    const/high16 v4, -0x40800000    # -1.0f

    :goto_0
    if-ge v0, v2, :cond_2

    .line 74
    invoke-virtual {v1, v0}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v5

    const/4 v6, 0x0

    cmpg-float v6, v5, v6

    if-gez v6, :cond_0

    .line 76
    iget-boolean v5, p0, Ll/ܽ۟ᩳ;->֫:Z

    if-nez v5, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_0
    cmpl-float v6, v5, v4

    if-lez v6, :cond_1

    move v3, v0

    move v4, v5

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 84
    :cond_2
    iget-object v0, p0, Ll/ܽ۟ᩳ;->ܳ:[I

    iget v1, p0, Ll/ܽ۟ᩳ;->ܽ:I

    add-int/2addr v1, p1

    aput v3, v0, v1

    .line 85
    iget-object p1, p0, Ll/ܽ۟ᩳ;->ᩳ:[F

    aput v4, p1, v1

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 67
    iget-object v0, p0, Ll/ܽ۟ᩳ;->ܳ:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 37
    div-int/lit8 p1, p1, 0x40

    .line 38
    invoke-direct {p0, p1}, Ll/ܽ۟ᩳ;->ᩳ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, p1, 0x1

    .line 39
    invoke-direct {p0, p1, v0}, Ll/ܽ۟ᩳ;->֫(II)V

    return-void

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unmeasured line width"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(I)Z
    .locals 10

    .line 44
    iget-object v0, p0, Ll/ܽ۟ᩳ;->ܿ:Ll/ۤܽᩴ;

    invoke-virtual {v0}, Ll/ۤܽᩴ;->size()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3f

    add-long/2addr v0, v2

    const-wide/16 v2, 0x40

    div-long/2addr v0, v2

    long-to-int v1, v0

    .line 91
    iget v0, p0, Ll/ܽ۟ᩳ;->ܽ:I

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-gt v1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    :goto_0
    if-ge v0, v1, :cond_1

    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    mul-int/lit8 v5, v0, 0x2

    .line 94
    new-array v6, v5, [I

    .line 95
    new-array v5, v5, [F

    .line 96
    invoke-static {v6, v3}, Ljava/util/Arrays;->fill([II)V

    .line 97
    iget-object v7, p0, Ll/ܽ۟ᩳ;->ܳ:[I

    iget v8, p0, Ll/ܽ۟ᩳ;->ܽ:I

    iget v9, p0, Ll/ܽ۟ᩳ;->ۧ:I

    invoke-static {v7, v8, v6, v0, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 98
    iget-object v7, p0, Ll/ܽ۟ᩳ;->ᩳ:[F

    iget v8, p0, Ll/ܽ۟ᩳ;->ܽ:I

    iget v9, p0, Ll/ܽ۟ᩳ;->ۧ:I

    invoke-static {v7, v8, v5, v0, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 99
    iput-object v6, p0, Ll/ܽ۟ᩳ;->ܳ:[I

    .line 100
    iput-object v5, p0, Ll/ܽ۟ᩳ;->ᩳ:[F

    .line 101
    iput v0, p0, Ll/ܽ۟ᩳ;->ܽ:I

    const/4 v0, 0x1

    .line 46
    :goto_1
    div-int/lit8 p1, p1, 0x40

    .line 47
    iget v5, p0, Ll/ܽ۟ᩳ;->ۧ:I

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v5

    move v6, p1

    :goto_2
    if-ge v6, v5, :cond_4

    if-ge v6, v1, :cond_2

    .line 50
    invoke-direct {p0, v6}, Ll/ܽ۟ᩳ;->ᩳ(I)Z

    move-result v7

    if-nez v7, :cond_3

    return v2

    .line 53
    :cond_2
    iget-object v7, p0, Ll/ܽ۟ᩳ;->ܳ:[I

    iget v8, p0, Ll/ܽ۟ᩳ;->ܽ:I

    add-int v9, v8, v6

    aput v3, v7, v9

    .line 54
    iget-object v7, p0, Ll/ܽ۟ᩳ;->ᩳ:[F

    add-int/2addr v8, v6

    const/4 v9, 0x0

    aput v9, v7, v8

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 57
    :cond_4
    iput v1, p0, Ll/ܽ۟ᩳ;->ۧ:I

    if-eqz v0, :cond_5

    .line 60
    iget p1, p0, Ll/ܽ۟ᩳ;->ܽ:I

    sub-int/2addr p1, v4

    :goto_3
    if-lez p1, :cond_6

    invoke-direct {p0, p1}, Ll/ܽ۟ᩳ;->ܽ(I)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_3

    :cond_5
    if-ge p1, v5, :cond_6

    .line 62
    invoke-direct {p0, p1, v5}, Ll/ܽ۟ᩳ;->֫(II)V

    :cond_6
    return v4
.end method
