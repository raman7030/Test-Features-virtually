.class public final Ll/ۚ۠ܽ;
.super Ljava/lang/Object;
.source "X6W3"


# static fields
.field public static final ۗ:Ll/᩺ۤۡ;

.field public static final ۙ:[J

.field public static final ᩶:[I


# instance fields
.field public ֡:I

.field public final ֨:Ll/ܶ۠ܽ;

.field public ֫:Z

.field public ۖ:[I

.field public ۘ:[J

.field public ۚ:[I

.field public ۜ:I

.field public ۠:I

.field public ۡ:Ll/֫֡ܽ;

.field public final ۢ:Ll/۠۠ܽ;

.field public ۧ:I

.field public ܳ:Ljava/lang/Thread;

.field public ܶ:I

.field public ܺ:Ll/ۢ۠ܽ;

.field public ܽ:[I

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:[I

.field public ᩵:Z

.field public ᩷:[J

.field public ᩸:[I

.field public ᩹:I

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [I

    .line 85
    sput-object v1, Ll/ۚ۠ܽ;->᩶:[I

    new-array v0, v0, [J

    .line 86
    sput-object v0, Ll/ۚ۠ܽ;->ۙ:[J

    .line 88
    new-instance v0, Ll/᩵۠ܽ;

    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/16 v1, 0x20

    new-array v1, v1, [I

    const/16 v2, 0x9

    new-array v2, v2, [I

    const/4 v3, -0x1

    .line 43
    invoke-static {v1, v3}, Ljava/util/Arrays;->fill([II)V

    .line 44
    invoke-static {v2, v3}, Ljava/util/Arrays;->fill([II)V

    .line 88
    sput-object v0, Ll/ۚ۠ܽ;->ۗ:Ll/᩺ۤۡ;

    return-void
.end method

.method public constructor <init>(Ll/۠۠ܽ;)V
    .locals 2

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    new-instance v0, Ll/ܶ۠ܽ;

    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 116
    iput-object v0, p0, Ll/ۚ۠ܽ;->֨:Ll/ܶ۠ܽ;

    .line 119
    sget-object v0, Ll/ۚ۠ܽ;->᩶:[I

    iput-object v0, p0, Ll/ۚ۠ܽ;->ۖ:[I

    .line 120
    iput-object v0, p0, Ll/ۚ۠ܽ;->ܽ:[I

    .line 121
    iput-object v0, p0, Ll/ۚ۠ܽ;->᩸:[I

    .line 122
    sget-object v1, Ll/ۚ۠ܽ;->ۙ:[J

    iput-object v1, p0, Ll/ۚ۠ܽ;->ۘ:[J

    .line 123
    iput-object v0, p0, Ll/ۚ۠ܽ;->ᩴ:[I

    .line 125
    iput-object v1, p0, Ll/ۚ۠ܽ;->᩷:[J

    .line 129
    iput-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    const/4 v0, -0x1

    .line 130
    iput v0, p0, Ll/ۚ۠ܽ;->ᩳ:I

    .line 140
    iput-object p1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    return-void
.end method

.method private ֫(II)I
    .locals 6

    :cond_0
    if-ltz p1, :cond_2

    .line 2706
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v1, p1, 0xd

    aget v2, v0, v1

    if-eqz v2, :cond_2

    add-int/lit8 v3, p1, 0x5

    aget v3, v0, v3

    if-lt v3, p2, :cond_2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    .line 2708
    aget v2, v0, p1

    const/4 v4, 0x6

    if-ne v2, v4, :cond_1

    add-int/lit8 v2, p1, 0x11

    aget v2, v0, v2

    const/16 v4, 0x8

    if-ne v2, v4, :cond_1

    add-int/lit8 v2, p1, 0x2

    .line 2710
    aget v0, v0, v2

    .line 2711
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۢ(I)Ll/ۡ۠ܽ;

    move-result-object v2

    iget-object v4, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v5, p1, 0x13

    aget v4, v4, v5

    sub-int v4, v0, v4

    invoke-direct {p0, v2, v4, v0}, Ll/ۚ۠ܽ;->֫(Ll/ۡ۠ܽ;II)V

    .line 2713
    :cond_1
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    aput v3, v0, v1

    add-int/lit8 p1, p1, -0x20

    .line 2792
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p0, Ll/ۚ۠ܽ;->֫:Z

    :cond_2
    return p1
.end method

.method private ֫(IIIIIZ)I
    .locals 8

    .line 2009
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ܿ()V

    .line 2010
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-object v0, v0, Ll/ۢ۠ܽ;->ܺ:[Ljava/lang/Object;

    aget-object v0, v0, p1

    check-cast v0, Ll/ۡ۠ܽ;

    .line 2011
    iget v7, p0, Ll/ۚ۠ܽ;->֡:I

    .line 2012
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    if-eqz p6, :cond_0

    const/4 v2, 0x6

    goto :goto_0

    :cond_0
    const/4 v2, 0x5

    :goto_0
    aput v2, v1, v7

    add-int/lit8 v2, v7, 0x1

    .line 2013
    aput p3, v1, v2

    add-int/lit8 p3, v7, 0x2

    .line 2014
    aput p4, v1, p3

    add-int/lit8 p3, v7, 0x3

    .line 2015
    aput p2, v1, p3

    add-int/lit8 p2, v7, 0x4

    .line 2016
    iget p3, p0, Ll/ۚ۠ܽ;->ۧ:I

    aput p3, v1, p2

    add-int/lit8 p2, v7, 0x5

    .line 2017
    iget p3, p0, Ll/ۚ۠ܽ;->᩹:I

    aput p3, v1, p2

    add-int/lit8 p2, v7, 0x6

    .line 2019
    iget-object p3, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-boolean v2, p3, Ll/۠۠ܽ;->۫:Z

    const/4 v3, -0x1

    if-eqz v2, :cond_2

    iget-boolean v2, v0, Ll/ۡ۠ܽ;->֫:Z

    if-nez v2, :cond_1

    if-nez p6, :cond_2

    iget v2, v0, Ll/ۡ۠ܽ;->ܽ:I

    if-gez v2, :cond_2

    :cond_1
    iget-object v2, p3, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    .line 43
    iget-object v2, v2, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    goto :goto_1

    :cond_2
    const/4 v2, -0x1

    .line 2019
    :goto_1
    aput v2, v1, p2

    .line 2020
    iget-object p2, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v1, v7, 0xc

    iget v2, p0, Ll/ۚ۠ܽ;->ᩳ:I

    aput v2, p2, v1

    add-int/lit8 v1, v7, 0xd

    const/4 v2, 0x0

    .line 2021
    aput v2, p2, v1

    add-int/lit8 v1, v7, 0x10

    .line 2022
    aput p1, p2, v1

    add-int/lit8 p1, v7, 0x11

    .line 2023
    aput v2, p2, p1

    add-int/lit8 p1, v7, 0x12

    .line 2024
    aput p5, p2, p1

    add-int/lit8 p1, v7, 0x13

    .line 2025
    aput v2, p2, p1

    add-int/lit8 p1, v7, 0x14

    .line 2026
    aput p5, p2, p1

    add-int/lit8 p1, v7, 0x15

    .line 2027
    iget p5, p0, Ll/ۚ۠ܽ;->᩹:I

    aput p5, p2, p1

    add-int/lit8 p1, v7, 0x16

    .line 2028
    iget p5, v0, Ll/ۡ۠ܽ;->ܽ:I

    iget v1, v0, Ll/ۡ۠ܽ;->ۧ:I

    if-ltz p5, :cond_3

    invoke-direct {p0, p5}, Ll/ۚ۠ܽ;->ܿ(I)I

    move-result p5

    goto :goto_2

    :cond_3
    const/4 p5, 0x0

    :goto_2
    aput p5, p2, p1

    .line 2029
    iget-object p1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 p2, v7, 0x17

    iget-boolean p5, v0, Ll/ۡ۠ܽ;->֫:Z

    if-eqz p5, :cond_4

    iget-object v4, p3, Ll/۠۠ܽ;->ۢ:[I

    aget v4, v4, v1

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    aput v4, p1, p2

    add-int/lit8 p2, v7, 0x18

    if-eqz p5, :cond_5

    .line 2030
    iget-object p3, p3, Ll/۠۠ܽ;->ۢ:[I

    add-int/lit8 v1, v1, 0x1

    aget v2, p3, v1

    :cond_5
    aput v2, p1, p2

    .line 2031
    iget p1, p0, Ll/ۚ۠ܽ;->֡:I

    add-int/lit8 p1, p1, 0x20

    iput p1, p0, Ll/ۚ۠ܽ;->֡:I

    if-nez p6, :cond_6

    .line 2032
    iget p1, v0, Ll/ۡ۠ܽ;->ܽ:I

    if-ltz p1, :cond_6

    invoke-direct {p0, p1, v3}, Ll/ۚ۠ܽ;->᩻(II)V

    :cond_6
    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x7

    move-object v1, p0

    move v4, p4

    move v5, v7

    .line 2033
    invoke-direct/range {v1 .. v6}, Ll/ۚ۠ܽ;->֫(IIIII)V

    return v7
.end method

.method private ֫(IIILjava/lang/CharSequence;)I
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-lt p2, p3, :cond_0

    .line 1172
    iget-object p1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iput-boolean v1, p1, Ll/۠۠ܽ;->ܺ:Z

    return v0

    .line 1175
    :cond_0
    invoke-interface {p4, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    if-ne p3, p1, :cond_1

    add-int/2addr p2, v1

    return p2

    :cond_1
    return v0
.end method

.method private ֫(IIILl/ۧۚܽ;Ljava/lang/CharSequence;)I
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-lt p2, p3, :cond_0

    .line 1181
    iget-object p1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iput-boolean v1, p1, Ll/۠۠ܽ;->ܺ:Z

    return v0

    .line 1184
    :cond_0
    invoke-interface {p5, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    const/16 p5, 0x80

    if-ge p3, p5, :cond_1

    if-ne p3, p1, :cond_2

    goto :goto_0

    :cond_1
    if-eqz p4, :cond_2

    .line 1185
    invoke-interface {p4, p3}, Ll/ۧۚܽ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    add-int/2addr p2, v1

    return p2

    :cond_2
    return v0
.end method

.method private ֫(IILjava/lang/CharSequence;)I
    .locals 7

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    if-ltz p1, :cond_0

    .line 2376
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 2377
    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-nez v1, :cond_0

    return v0

    .line 2378
    :cond_0
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 2380
    iget-object v2, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    const/4 v3, 0x0

    if-ltz p2, :cond_4

    move v4, p1

    :goto_0
    if-ge v4, v1, :cond_3

    if-ge v3, p2, :cond_3

    add-int/lit8 v5, v4, 0x1

    .line 2382
    invoke-interface {p3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_1

    if-ge v5, v1, :cond_1

    .line 2383
    invoke-interface {p3, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_1

    add-int/lit8 v4, v4, 0x2

    goto :goto_1

    :cond_1
    move v4, v5

    .line 2792
    :goto_1
    invoke-virtual {v2}, Ll/۠۠ܽ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_2

    iput-boolean v0, p0, Ll/ۚ۠ܽ;->֫:Z

    sub-int/2addr v4, p1

    return v4

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    sub-int/2addr v4, p1

    return v4

    :cond_4
    neg-int p2, p2

    move v1, p1

    :goto_2
    if-lez v1, :cond_7

    if-ge v3, p2, :cond_7

    add-int/lit8 v4, v1, -0x1

    .line 2389
    invoke-interface {p3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v5

    if-eqz v5, :cond_5

    if-lez v4, :cond_5

    add-int/lit8 v5, v1, -0x2

    .line 2390
    invoke-interface {p3, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v5

    if-eqz v5, :cond_5

    add-int/lit8 v1, v1, -0x2

    goto :goto_3

    :cond_5
    move v1, v4

    .line 2792
    :goto_3
    invoke-virtual {v2}, Ll/۠۠ܽ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_6

    iput-boolean v0, p0, Ll/ۚ۠ܽ;->֫:Z

    sub-int/2addr p1, v1

    return p1

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_7
    sub-int/2addr p1, v1

    return p1
.end method

.method private ֫(IILjava/lang/CharSequence;II)I
    .locals 4

    .line 777
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-lt p4, p5, :cond_0

    .line 778
    iput-boolean v1, v0, Ll/۠۠ܽ;->ܺ:Z

    return v2

    .line 781
    :cond_0
    invoke-interface {p3, p4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v3, p1, :cond_1

    return v2

    :cond_1
    add-int/lit8 p1, p4, 0x1

    if-lt p1, p5, :cond_2

    .line 783
    iput-boolean v1, v0, Ll/۠۠ܽ;->ܺ:Z

    return v2

    .line 786
    :cond_2
    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    if-ne p1, p2, :cond_3

    add-int/lit8 p4, p4, 0x2

    return p4

    :cond_3
    return v2
.end method

.method private ֫(IILjava/lang/CharSequence;Ljava/lang/Object;)I
    .locals 6

    .line 2566
    instance-of v0, p4, Ll/ۧۚܽ;

    iget-object v1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    check-cast p4, Ll/ۧۚܽ;

    if-lt p1, p2, :cond_0

    .line 2568
    iput-boolean v3, v1, Ll/۠۠ܽ;->ܺ:Z

    return v2

    .line 2571
    :cond_0
    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p2

    invoke-interface {p4, p2}, Ll/ۧۚܽ;->֫(I)Z

    move-result p2

    if-eqz p2, :cond_1

    add-int/2addr p1, v3

    return p1

    :cond_1
    return v2

    .line 2573
    :cond_2
    check-cast p4, [I

    const/4 v0, 0x0

    .line 2574
    :goto_0
    array-length v4, p4

    if-ge v0, v4, :cond_6

    add-int v4, p1, v0

    if-lt v4, p2, :cond_3

    .line 2576
    iput-boolean v3, v1, Ll/۠۠ܽ;->ܺ:Z

    return v2

    .line 2579
    :cond_3
    aget v5, p4, v0

    invoke-interface {p3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-eq v5, v4, :cond_4

    return v2

    .line 2792
    :cond_4
    invoke-virtual {v1}, Ll/۠۠ܽ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_5

    iput-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    return v2

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2582
    :cond_6
    array-length p2, p4

    add-int/2addr p1, p2

    return p1
.end method

.method public static ֫(IJ)I
    .locals 6

    const-wide/32 v0, 0x7ffffff7

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    int-to-long v2, p0

    const-wide/16 v4, 0x2

    mul-long v2, v2, v4

    const-wide/16 v4, 0x40

    .line 2832
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    long-to-int p1, p0

    return p1

    .line 2831
    :cond_0
    new-instance p0, Ll/֡۠ܽ;

    invoke-direct {p0}, Ll/֡۠ܽ;-><init>()V

    throw p0
.end method

.method private ֫(Ll/ۘ۠ܽ;Ljava/lang/CharSequence;II)I
    .locals 9

    const/4 v0, 0x0

    .line 2430
    :cond_0
    iget v1, p1, Ll/ۘ۠ܽ;->֫:I

    iget-object v2, p1, Ll/ۘ۠ܽ;->᩷:Ll/ۧۚܽ;

    iget-boolean v3, p1, Ll/ۘ۠ܽ;->ᩳ:Z

    iget-boolean v4, p1, Ll/ۘ۠ܽ;->ܳ:Z

    const/4 v5, -0x1

    iget-object v6, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    const/4 v7, 0x1

    if-ge v0, v1, :cond_c

    if-lt p3, p4, :cond_1

    .line 2432
    iput-boolean v7, v6, Ll/۠۠ܽ;->ܺ:Z

    goto/16 :goto_5

    :cond_1
    if-eqz v4, :cond_2

    .line 2435
    invoke-interface {p2, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {p2, p3}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    :goto_0
    if-eqz v4, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    .line 2436
    :cond_3
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    :goto_1
    add-int/2addr v4, p3

    if-le v4, p4, :cond_4

    .line 2437
    iput-boolean v7, v6, Ll/۠۠ܽ;->ܺ:Z

    :cond_4
    if-gt v4, p4, :cond_5

    .line 2438
    iget-object v8, p1, Ll/ۘ۠ܽ;->᩻:Ll/ۧۚܽ;

    invoke-interface {v8, v1}, Ll/ۧۚܽ;->֫(I)Z

    move-result v8

    if-eqz v8, :cond_5

    move p3, v4

    goto :goto_4

    .line 2442
    :cond_5
    iget v4, p1, Ll/ۘ۠ܽ;->ܽ:I

    if-eq v1, v4, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v1, p3, 0x1

    if-lt v1, p4, :cond_7

    .line 2445
    iput-boolean v7, v6, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_5

    :cond_7
    if-eqz v3, :cond_8

    .line 2448
    invoke-interface {p2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    goto :goto_2

    :cond_8
    invoke-static {p2, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v4

    :goto_2
    if-eqz v3, :cond_9

    const/4 v3, 0x1

    goto :goto_3

    .line 2449
    :cond_9
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    :goto_3
    add-int/2addr v1, v3

    if-le v1, p4, :cond_a

    .line 2451
    iput-boolean v7, v6, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_5

    .line 2454
    :cond_a
    iget-object v3, p1, Ll/ۘ۠ܽ;->ܿ:Ll/ۧۚܽ;

    invoke-interface {v3, v4}, Ll/ۧۚܽ;->֫(I)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_5

    :cond_b
    move p3, v1

    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 2459
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_6

    .line 2461
    :cond_c
    :goto_5
    iget v1, p1, Ll/ۘ۠ܽ;->ۧ:I

    if-ge v0, v1, :cond_d

    goto :goto_6

    :cond_d
    if-eqz v2, :cond_12

    move v0, p3

    :cond_e
    if-ge v0, p4, :cond_f

    .line 2464
    invoke-interface {p2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-interface {v2, v1}, Ll/ۧۚܽ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_f

    add-int/lit8 v0, v0, 0x1

    .line 2792
    invoke-virtual {v6}, Ll/۠۠ܽ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_e

    iput-boolean v7, p0, Ll/ۚ۠ܽ;->֫:Z

    return v5

    :cond_f
    if-lt v0, p4, :cond_10

    .line 2468
    iput-boolean v7, v6, Ll/۠۠ܽ;->ܺ:Z

    :cond_10
    sub-int p3, v0, p3

    .line 2469
    iget v1, p1, Ll/ۘ۠ܽ;->ۜ:I

    if-ge p3, v1, :cond_11

    goto :goto_6

    :cond_11
    move p3, v0

    :cond_12
    if-lt p3, p4, :cond_13

    .line 2472
    iput-boolean v7, v6, Ll/۠۠ܽ;->ܺ:Z

    return v5

    .line 2475
    :cond_13
    iget-object p1, p1, Ll/ۘ۠ܽ;->ۢ:Ll/ۧۚܽ;

    invoke-interface {p2, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p2

    invoke-interface {p1, p2}, Ll/ۧۚܽ;->֫(I)Z

    move-result p1

    if-nez p1, :cond_14

    goto :goto_6

    :cond_14
    add-int/2addr p3, v7

    .line 2477
    iget p1, v6, Ll/۠۠ܽ;->֫:I

    if-ne p1, v7, :cond_16

    if-ne p3, p4, :cond_15

    goto :goto_7

    :cond_15
    :goto_6
    return v5

    :cond_16
    :goto_7
    return p3
.end method

.method private ֫(Ll/ۤ᩵ܽ;Ljava/lang/CharSequence;II)I
    .locals 8

    const/4 v0, 0x0

    .line 2399
    :cond_0
    iget v1, p1, Ll/ۤ᩵ܽ;->ۧ:I

    iget-object v2, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-ge v0, v1, :cond_7

    if-lt p3, p4, :cond_1

    .line 2401
    iput-boolean v4, v2, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_2

    .line 2404
    :cond_1
    invoke-interface {p2, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    .line 2406
    iget-object v5, p1, Ll/ۤ᩵ܽ;->֫:[I

    array-length v6, v5

    if-ge v1, v6, :cond_2

    .line 2407
    aget v1, v5, v1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 2409
    :goto_0
    iget-object v6, p1, Ll/ۤ᩵ܽ;->ܿ:[Ll/ۧۚܽ;

    array-length v7, v6

    if-ge v5, v7, :cond_5

    .line 2410
    aget-object v6, v6, v5

    invoke-interface {v6, v1}, Ll/ۧۚܽ;->֫(I)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 2411
    iget-object v1, p1, Ll/ۤ᩵ܽ;->ᩳ:[I

    aget v1, v1, v5

    goto :goto_1

    .line 2792
    :cond_3
    invoke-virtual {v2}, Ll/۠۠ܽ;->ۤ()Z

    move-result v6

    if-eqz v6, :cond_4

    iput-boolean v4, p0, Ll/ۚ۠ܽ;->֫:Z

    return v3

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_6

    goto :goto_2

    .line 2418
    :cond_6
    invoke-direct {p0, v1, p3}, Ll/ۚ۠ܽ;->ܿ(II)V

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p3, p3, 0x1

    .line 2419
    invoke-direct {p0, v1, p3}, Ll/ۚ۠ܽ;->ܿ(II)V

    add-int/lit8 v0, v0, 0x1

    .line 2421
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    .line 2423
    :cond_7
    :goto_2
    iget p1, p1, Ll/ۤ᩵ܽ;->ܽ:I

    if-ge v0, p1, :cond_8

    goto :goto_3

    .line 2424
    :cond_8
    iget p1, v2, Ll/۠۠ܽ;->֫:I

    if-ne p1, v4, :cond_a

    if-ne p3, p4, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    return v3

    :cond_a
    :goto_4
    return p3
.end method

.method private ֫(Ll/۬᩵ܽ;Ljava/lang/CharSequence;II)I
    .locals 9

    .line 2482
    iget-object v0, p1, Ll/۬᩵ܽ;->ܽ:Ll/ۗ᩵ܽ;

    iget-object v1, p1, Ll/۬᩵ܽ;->ᩳ:[[I

    iget-object v2, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    invoke-static {v0, v2, p3, p2}, Ll/᩸۠ܽ;->֫(Ll/ۗ᩵ܽ;Ll/۠۠ܽ;ILjava/lang/CharSequence;)Z

    move-result v0

    const/4 v3, -0x1

    if-nez v0, :cond_0

    goto :goto_4

    :cond_0
    if-ge p3, p4, :cond_1

    .line 2485
    invoke-interface {p2, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v4, 0x80

    if-ge v0, v4, :cond_1

    .line 2486
    iget-object v4, p1, Ll/۬᩵ܽ;->ۧ:[[I

    aget-object v0, v4, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    .line 2488
    array-length v4, v1

    goto :goto_1

    :cond_2
    array-length v4, v0

    :goto_1
    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_8

    .line 2792
    invoke-virtual {v2}, Ll/۠۠ܽ;->ۤ()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_3

    iput-boolean v7, p0, Ll/ۚ۠ܽ;->֫:Z

    return v3

    :cond_3
    if-nez v0, :cond_4

    move v6, v5

    goto :goto_3

    .line 2491
    :cond_4
    aget v6, v0, v5

    :goto_3
    aget-object v6, v1, v6

    .line 2492
    invoke-direct {p0, p3, p4, p2, v6}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;Ljava/lang/Object;)I

    move-result v6

    .line 2493
    iget-boolean v8, p0, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v8, :cond_5

    goto :goto_4

    :cond_5
    if-ltz v6, :cond_7

    .line 2494
    iget-object v8, p1, Ll/۬᩵ܽ;->֫:Ll/ۗ᩵ܽ;

    invoke-static {v8, v2, v6, p2}, Ll/᩸۠ܽ;->֫(Ll/ۗ᩵ܽ;Ll/۠۠ܽ;ILjava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_7

    iget v8, v2, Ll/۠۠ܽ;->֫:I

    if-ne v8, v7, :cond_6

    if-ne v6, p4, :cond_7

    :cond_6
    return v6

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_8
    :goto_4
    return v3
.end method

.method private ֫([JJ)I
    .locals 8

    const/16 v0, 0x21

    ushr-long v1, p2, v0

    xor-long/2addr v1, p2

    const-wide v3, -0xae502812aa7333L

    mul-long v1, v1, v3

    ushr-long v3, v1, v0

    xor-long v0, v1, v3

    .line 2780
    array-length v2, p1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    long-to-int v1, v0

    and-int v0, v1, v2

    .line 2782
    :goto_0
    aget-wide v4, p1, v0

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-eqz v1, :cond_1

    cmp-long v1, v4, p2

    if-eqz v1, :cond_1

    .line 2792
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    invoke-virtual {v1}, Ll/۠۠ܽ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    iput-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    and-int/2addr v0, v2

    goto :goto_0

    :cond_1
    return v0
.end method

.method private ֫(I)V
    .locals 4

    .line 2354
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v1, p1, 0xd

    aget v1, v0, v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    goto :goto_1

    .line 2355
    :cond_0
    aget v0, v0, p1

    const/4 v1, 0x5

    if-lt v0, v1, :cond_2

    .line 2356
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۢ(I)Ll/ۡ۠ܽ;

    move-result-object v0

    .line 2357
    iget-object v2, p0, Ll/ۚ۠ܽ;->ۚ:[I

    aget v3, v2, p1

    if-ne v3, v1, :cond_1

    iget v0, v0, Ll/ۡ۠ܽ;->ܽ:I

    if-ltz v0, :cond_1

    add-int/lit8 v1, p1, 0x16

    .line 2358
    aget v1, v2, v1

    invoke-direct {p0, v0, v1}, Ll/ۚ۠ܽ;->᩻(II)V

    .line 2360
    :cond_1
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۡ(I)V

    goto :goto_0

    .line 2362
    :cond_2
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ܺ(I)V

    .line 2364
    :goto_0
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 p1, p1, 0x6

    aget p1, v0, p1

    if-ltz p1, :cond_3

    .line 2365
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object v0, v0, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    invoke-virtual {v0, p1}, Ll/ᩴ۠ܽ;->֫(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method private ֫(III)V
    .locals 3

    .line 791
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-boolean v1, v0, Ll/۠۠ܽ;->۫:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    iget-object v2, v0, Ll/۠۠ܽ;->ۢ:[I

    invoke-virtual {v1, p1, p2, p3, v2}, Ll/ᩴ۠ܽ;->֫(III[I)V

    .line 792
    :cond_0
    iget-object v0, v0, Ll/۠۠ܽ;->ۢ:[I

    aput p2, v0, p1

    add-int/lit8 p1, p1, 0x1

    .line 793
    aput p3, v0, p1

    return-void
.end method

.method private ֫(IIIII)V
    .locals 6

    .line 2586
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܽ:[I

    array-length v1, v0

    iget v2, p0, Ll/ۚ۠ܽ;->ۧ:I

    sub-int/2addr v1, v2

    const/4 v3, 0x6

    if-ge v1, v3, :cond_0

    .line 2587
    array-length v0, v0

    int-to-long v1, v2

    const-wide/16 v4, 0x6

    add-long/2addr v1, v4

    invoke-static {v0, v1, v2}, Ll/ۚ۠ܽ;->֫(IJ)I

    move-result v0

    .line 2588
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۖ:[I

    array-length v1, v1

    iget-object v2, p0, Ll/ۚ۠ܽ;->᩸:[I

    array-length v2, v2

    invoke-direct {p0, v1, v0, v2}, Ll/ۚ۠ܽ;->ܽ(III)V

    .line 2589
    iget-object v1, p0, Ll/ۚ۠ܽ;->ܽ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۚ۠ܽ;->ܽ:[I

    .line 2591
    :cond_0
    iget v0, p0, Ll/ۚ۠ܽ;->ۧ:I

    .line 2592
    iget-object v1, p0, Ll/ۚ۠ܽ;->ܽ:[I

    aput p1, v1, v0

    add-int/lit8 p1, v0, 0x1

    .line 2593
    aput p2, v1, p1

    add-int/lit8 p1, v0, 0x2

    .line 2594
    aput p3, v1, p1

    add-int/lit8 p1, v0, 0x3

    .line 2595
    iget p2, p0, Ll/ۚ۠ܽ;->᩹:I

    aput p2, v1, p1

    add-int/lit8 p1, v0, 0x4

    .line 2596
    aput p4, v1, p1

    add-int/lit8 p1, v0, 0x5

    .line 2597
    aput p5, v1, p1

    add-int/2addr v0, v3

    .line 2598
    iput v0, p0, Ll/ۚ۠ܽ;->ۧ:I

    return-void
.end method

.method private ֫(IIIIII)V
    .locals 1

    .line 711
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۖ:[I

    aput p3, v0, p1

    .line 712
    iget-object p1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object p3, p1, Ll/۠۠ܽ;->ۢ:[I

    aput p4, p3, p2

    add-int/lit8 p2, p2, 0x1

    .line 713
    aput p5, p3, p2

    if-ltz p6, :cond_0

    .line 714
    iget-object p1, p1, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    invoke-virtual {p1, p6}, Ll/ᩴ۠ܽ;->֫(I)V

    :cond_0
    return-void
.end method

.method private ֫(IIIZ)V
    .locals 1

    .line 248
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iput p1, v0, Ll/۠۠ܽ;->ۜ:I

    .line 249
    iput p2, v0, Ll/۠۠ܽ;->ܽ֫:I

    .line 250
    iput p3, v0, Ll/۠۠ܽ;->۠:I

    const/4 p1, 0x0

    .line 251
    iput-object p1, p0, Ll/ۚ۠ܽ;->ܳ:Ljava/lang/Thread;

    const/4 p1, 0x0

    .line 252
    iput-boolean p1, p0, Ll/ۚ۠ܽ;->᩵:Z

    if-eqz p4, :cond_0

    .line 2841
    sget-object p2, Ll/ۚ۠ܽ;->᩶:[I

    iput-object p2, p0, Ll/ۚ۠ܽ;->ۚ:[I

    iput-object p2, p0, Ll/ۚ۠ܽ;->ᩴ:[I

    iput-object p2, p0, Ll/ۚ۠ܽ;->᩸:[I

    iput-object p2, p0, Ll/ۚ۠ܽ;->ܽ:[I

    iput-object p2, p0, Ll/ۚ۠ܽ;->ۖ:[I

    .line 2842
    sget-object p2, Ll/ۚ۠ܽ;->ۙ:[J

    iput-object p2, p0, Ll/ۚ۠ܽ;->ۘ:[J

    .line 2843
    iput-object p2, p0, Ll/ۚ۠ܽ;->᩷:[J

    .line 2844
    iput p1, p0, Ll/ۚ۠ܽ;->᩻:I

    .line 2845
    iput p1, p0, Ll/ۚ۠ܽ;->֡:I

    const/4 p1, -0x1

    .line 2846
    iput p1, p0, Ll/ۚ۠ܽ;->ᩳ:I

    :cond_0
    return-void
.end method

.method private ֫(IIZ)V
    .locals 4

    .line 2039
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v1, p1, 0x11

    aput p2, v0, v1

    add-int/lit8 p2, p1, 0xd

    xor-int/lit8 v1, p3, 0x1

    .line 2040
    aput v1, v0, p2

    add-int/lit8 p2, p1, 0x15

    .line 2041
    iget v1, p0, Ll/ۚ۠ܽ;->᩹:I

    aput v1, v0, p2

    .line 2042
    iget-object p2, p0, Ll/ۚ۠ܽ;->ܽ:[I

    add-int/lit8 v2, p1, 0x4

    aget v2, v0, v2

    const/4 v3, 0x3

    add-int/2addr v2, v3

    aput v1, p2, v2

    if-eqz p3, :cond_0

    move p2, p1

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p1, 0xc

    .line 2043
    aget p2, v0, p2

    :goto_0
    iput p2, p0, Ll/ۚ۠ܽ;->ᩳ:I

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x1

    :goto_1
    add-int/2addr v3, p1

    .line 2044
    aget p2, v0, v3

    iput p2, p0, Ll/ۚ۠ܽ;->۠:I

    add-int/lit8 p1, p1, 0x2

    .line 2045
    aget p1, v0, p1

    iput p1, p0, Ll/ۚ۠ܽ;->ܶ:I

    return-void
.end method

.method private ֫(Ll/ۡ۠ܽ;II)V
    .locals 3

    .line 2185
    iget-boolean v0, p1, Ll/ۡ۠ܽ;->֫:Z

    iget p1, p1, Ll/ۡ۠ܽ;->ۧ:I

    if-nez v0, :cond_0

    return-void

    .line 2186
    :cond_0
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-boolean v1, v0, Ll/۠۠ܽ;->۫:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    iget-object v2, v0, Ll/۠۠ܽ;->ۢ:[I

    invoke-virtual {v1, p1, p2, p3, v2}, Ll/ᩴ۠ܽ;->֫(III[I)V

    .line 2187
    :cond_1
    iget-object v0, v0, Ll/۠۠ܽ;->ۢ:[I

    aput p2, v0, p1

    add-int/lit8 p1, p1, 0x1

    .line 2188
    aput p3, v0, p1

    return-void
.end method

.method private ֫(Ll/ܽ֡ܽ;II)V
    .locals 6

    .line 1103
    iget-boolean v0, p1, Ll/ܽ֡ܽ;->ܳ:Z

    iget-object v1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    if-eqz v0, :cond_0

    .line 1104
    iget-object v0, v1, Ll/۠۠ܽ;->ۢ:[I

    iget v2, p1, Ll/ܽ֡ܽ;->ۖ:I

    aget v3, v0, v2

    add-int/lit8 v4, v2, 0x1

    aget v5, v0, v4

    .line 1105
    aput p2, v0, v2

    .line 1106
    aput p3, v0, v4

    .line 1107
    iget-boolean p2, v1, Ll/۠۠ܽ;->۫:Z

    if-eqz p2, :cond_0

    const/4 p2, -0x1

    if-eq v3, p2, :cond_0

    if-eq v5, p2, :cond_0

    .line 1108
    iget-object p2, v1, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    new-instance v0, Ll/ۗۘܽ;

    div-int/lit8 v2, v2, 0x2

    invoke-direct {v0, v2, v3, v5}, Ll/ۗۘܽ;-><init>(III)V

    .line 13
    iget-object p2, p2, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1111
    :cond_0
    invoke-virtual {v1, p3}, Ll/۠۠ܽ;->ܳ(I)V

    .line 1112
    iget-object p1, p1, Ll/ܽ֡ܽ;->֡:Ll/ۡ۠ܽ;

    iget p1, p1, Ll/ۡ۠ܽ;->ܽ:I

    if-gez p1, :cond_1

    .line 1113
    iget-object p1, v1, Ll/۠۠ܽ;->ۢ:[I

    const/4 p2, 0x0

    iget v0, v1, Ll/۠۠ܽ;->᩻:I

    aput v0, p1, p2

    const/4 p2, 0x1

    .line 1114
    aput p3, p1, p2

    :cond_1
    return-void
.end method

.method private ֫(Ll/ܽ֡ܽ;IZ)V
    .locals 0

    if-eqz p3, :cond_0

    .line 1075
    iget-boolean p1, p1, Ll/ܽ֡ܽ;->ᩴ:Z

    if-eqz p1, :cond_0

    iput p2, p0, Ll/ۚ۠ܽ;->ܿ:I

    :cond_0
    return-void
.end method

.method private ֫(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z
    .locals 22

    move-object/from16 v8, p0

    move/from16 v0, p1

    move-object/from16 v7, p2

    move-object/from16 v9, p3

    .line 542
    iget v1, v7, Ll/ܽ֡ܽ;->ۡ:I

    iget v2, v7, Ll/ܽ֡ܽ;->ۢ:I

    iget v3, v7, Ll/ܽ֡ܽ;->ܿ:I

    iget v4, v7, Ll/ܽ֡ܽ;->᩻:I

    iget v5, v7, Ll/ܽ֡ܽ;->۠:I

    iget-object v10, v7, Ll/ܽ֡ܽ;->֡:Ll/ۡ۠ܽ;

    const/4 v6, 0x1

    iget-object v11, v8, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    const/4 v12, 0x0

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    move v4, v0

    .line 554
    invoke-direct/range {p0 .. p3}, Ll/ۚ۠ܽ;->ܽ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z

    move-result v0

    return v0

    .line 943
    :pswitch_1
    invoke-direct/range {p0 .. p3}, Ll/ۚ۠ܽ;->ܿ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_10

    .line 944
    :cond_0
    iget v1, v11, Ll/۠۠ܽ;->ܽ֫:I

    .line 945
    iget v2, v10, Ll/ۡ۠ܽ;->ܿ:I

    iget v3, v10, Ll/ۡ۠ܽ;->ᩳ:I

    add-int/2addr v0, v2

    move v5, v2

    :goto_0
    if-ge v5, v3, :cond_3

    if-lt v0, v1, :cond_1

    .line 949
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_1

    .line 952
    :cond_1
    invoke-interface {v9, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-eq v10, v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 953
    invoke-direct {v8, v0}, Ll/ۚ۠ܽ;->ܽ(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    if-ne v5, v3, :cond_6

    if-lt v0, v1, :cond_4

    .line 958
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_2

    .line 959
    :cond_4
    invoke-interface {v9, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-ne v9, v4, :cond_6

    iget v4, v11, Ll/۠۠ܽ;->֫:I

    if-ne v4, v6, :cond_5

    add-int/lit8 v4, v0, 0x1

    if-ne v4, v1, :cond_6

    :cond_5
    add-int/2addr v0, v6

    .line 961
    invoke-direct {v8, v0}, Ll/ۚ۠ܽ;->ܽ(I)V

    return v6

    :cond_6
    :goto_2
    if-le v5, v2, :cond_8

    .line 965
    iget v2, v11, Ll/۠۠ܽ;->֫:I

    if-ne v2, v6, :cond_7

    if-ne v0, v1, :cond_8

    .line 966
    :cond_7
    invoke-direct {v8, v0}, Ll/ۚ۠ܽ;->ܽ(I)V

    return v6

    :cond_8
    if-ge v5, v3, :cond_9

    goto :goto_3

    :cond_9
    const/4 v6, 0x0

    .line 969
    :goto_3
    invoke-direct {v8, v7, v0, v6}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V

    return v12

    .line 995
    :pswitch_2
    invoke-direct/range {p0 .. p3}, Ll/ۚ۠ܽ;->ܿ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_10

    .line 996
    :cond_a
    iget v1, v11, Ll/۠۠ܽ;->ܽ֫:I

    .line 997
    iget v2, v10, Ll/ۡ۠ܽ;->ᩳ:I

    iget v3, v10, Ll/ۡ۠ܽ;->ܿ:I

    add-int/2addr v0, v3

    :cond_b
    if-ge v3, v2, :cond_e

    if-lt v0, v1, :cond_c

    .line 1001
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_4

    .line 1004
    :cond_c
    invoke-interface {v9, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-eq v10, v4, :cond_d

    goto :goto_4

    :cond_d
    add-int/lit8 v0, v0, 0x1

    .line 1005
    invoke-direct {v8, v0}, Ll/ۚ۠ܽ;->ܽ(I)V

    add-int/lit8 v3, v3, 0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v10

    if-eqz v10, :cond_b

    iput-boolean v6, v8, Ll/ۚ۠ܽ;->֫:Z

    return v12

    :cond_e
    :goto_4
    if-lt v0, v1, :cond_f

    .line 1009
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_5

    .line 1010
    :cond_f
    invoke-interface {v9, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-ne v4, v5, :cond_11

    iget v4, v11, Ll/۠۠ܽ;->֫:I

    if-ne v4, v6, :cond_10

    add-int/lit8 v4, v0, 0x1

    if-ne v4, v1, :cond_11

    :cond_10
    add-int/2addr v0, v6

    .line 1012
    invoke-direct {v8, v0}, Ll/ۚ۠ܽ;->ܽ(I)V

    return v6

    :cond_11
    :goto_5
    if-ge v3, v2, :cond_12

    goto :goto_6

    :cond_12
    const/4 v6, 0x0

    .line 1014
    :goto_6
    invoke-direct {v8, v7, v0, v6}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V

    return v12

    .line 974
    :pswitch_3
    invoke-direct/range {p0 .. p3}, Ll/ۚ۠ܽ;->ܿ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_10

    .line 975
    :cond_13
    iget v1, v10, Ll/ۡ۠ܽ;->ᩳ:I

    .line 976
    iget v2, v11, Ll/۠۠ܽ;->ܽ֫:I

    iget v3, v10, Ll/ۡ۠ܽ;->ܿ:I

    add-int/2addr v0, v3

    :cond_14
    if-ge v0, v2, :cond_15

    .line 979
    invoke-interface {v9, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    goto :goto_7

    :cond_15
    const/4 v10, -0x1

    :goto_7
    if-gez v10, :cond_16

    .line 980
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_8

    :cond_16
    if-ne v10, v5, :cond_18

    .line 981
    iget v13, v11, Ll/۠۠ܽ;->֫:I

    if-ne v13, v6, :cond_17

    add-int/lit8 v13, v0, 0x1

    if-ne v13, v2, :cond_18

    :cond_17
    add-int/2addr v0, v6

    .line 983
    invoke-direct {v8, v0}, Ll/ۚ۠ܽ;->ܽ(I)V

    return v6

    :cond_18
    :goto_8
    if-lt v3, v1, :cond_19

    goto/16 :goto_10

    :cond_19
    if-ltz v10, :cond_1b

    if-eq v10, v4, :cond_1a

    goto :goto_9

    :cond_1a
    add-int/lit8 v0, v0, 0x1

    .line 987
    invoke-direct {v8, v0}, Ll/ۚ۠ܽ;->ܽ(I)V

    add-int/lit8 v3, v3, 0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v10

    if-eqz v10, :cond_14

    iput-boolean v6, v8, Ll/ۚ۠ܽ;->֫:Z

    return v12

    .line 986
    :cond_1b
    :goto_9
    invoke-direct {v8, v7, v0, v6}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V

    return v12

    .line 552
    :pswitch_4
    iget-boolean v1, v11, Ll/۠۠ܽ;->۫:Z

    if-eqz v1, :cond_1c

    .line 553
    invoke-direct/range {p0 .. p3}, Ll/ۚ۠ܽ;->ܽ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z

    move-result v0

    return v0

    .line 663
    :cond_1c
    iget v1, v7, Ll/ܽ֡ܽ;->ۖ:I

    .line 664
    iget v4, v10, Ll/ۡ۠ܽ;->ܿ:I

    iget v10, v10, Ll/ۡ۠ܽ;->ᩳ:I

    .line 666
    iget v13, v11, Ll/۠۠ܽ;->ܽ֫:I

    const/4 v14, 0x0

    move v12, v0

    const/4 v0, 0x0

    :goto_a
    if-ge v14, v4, :cond_22

    if-lt v12, v13, :cond_1d

    .line 670
    :try_start_0
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    .line 671
    invoke-direct {v8, v7, v12, v6}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-lez v14, :cond_30

    .line 703
    iget-object v2, v11, Ll/۠۠ܽ;->ۢ:[I

    add-int/lit8 v3, v12, -0x2

    aput v3, v2, v1

    add-int/2addr v1, v6

    .line 704
    aput v12, v2, v1

    return v0

    .line 673
    :cond_1d
    :try_start_1
    invoke-interface {v9, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15

    if-eq v15, v3, :cond_1e

    invoke-direct {v8, v7, v12, v6}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-lez v14, :cond_30

    .line 703
    iget-object v2, v11, Ll/۠۠ܽ;->ۢ:[I

    add-int/lit8 v3, v12, -0x2

    aput v3, v2, v1

    add-int/2addr v1, v6

    .line 704
    aput v12, v2, v1

    return v0

    :cond_1e
    add-int/lit8 v15, v12, 0x1

    if-lt v15, v13, :cond_1f

    .line 675
    :try_start_2
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    .line 676
    invoke-direct {v8, v7, v12, v6}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-lez v14, :cond_30

    .line 703
    iget-object v2, v11, Ll/۠۠ܽ;->ۢ:[I

    add-int/lit8 v3, v12, -0x2

    aput v3, v2, v1

    add-int/2addr v1, v6

    .line 704
    aput v12, v2, v1

    return v0

    .line 678
    :cond_1f
    :try_start_3
    invoke-interface {v9, v15}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15

    if-eq v15, v2, :cond_20

    invoke-direct {v8, v7, v12, v6}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-lez v14, :cond_30

    .line 703
    iget-object v2, v11, Ll/۠۠ܽ;->ۢ:[I

    add-int/lit8 v3, v12, -0x2

    aput v3, v2, v1

    add-int/2addr v1, v6

    .line 704
    aput v12, v2, v1

    return v0

    :cond_20
    const/4 v0, 0x0

    add-int/lit8 v15, v12, 0x2

    .line 680
    :try_start_4
    invoke-direct {v8, v15}, Ll/ۚ۠ܽ;->ܽ(I)V

    add-int/lit8 v14, v14, 0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v16

    if-eqz v16, :cond_21

    iput-boolean v6, v8, Ll/ۚ۠ܽ;->֫:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-lez v14, :cond_8e

    .line 703
    iget-object v2, v11, Ll/۠۠ܽ;->ۢ:[I

    aput v12, v2, v1

    add-int/2addr v1, v6

    .line 704
    aput v15, v2, v1

    return v0

    :cond_21
    const/4 v0, 0x0

    move v12, v15

    goto :goto_a

    :catchall_0
    move-exception v0

    goto/16 :goto_f

    :cond_22
    const/4 v0, 0x0

    .line 684
    :try_start_5
    iget-boolean v4, v11, Ll/۠۠ܽ;->ۡ:Z

    if-eqz v4, :cond_23

    iput-boolean v6, v8, Ll/ۚ۠ܽ;->֫:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-lez v14, :cond_8e

    .line 703
    iget-object v2, v11, Ll/۠۠ܽ;->ۢ:[I

    add-int/lit8 v3, v12, -0x2

    aput v3, v2, v1

    add-int/2addr v1, v6

    .line 704
    aput v12, v2, v1

    return v0

    :cond_23
    :goto_b
    if-ge v14, v10, :cond_29

    if-lt v12, v13, :cond_24

    .line 686
    :try_start_6
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_c

    .line 687
    :cond_24
    invoke-interface {v9, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-eq v4, v3, :cond_25

    goto :goto_c

    :cond_25
    add-int/lit8 v4, v12, 0x1

    if-lt v4, v13, :cond_26

    .line 688
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_c

    .line 689
    :cond_26
    invoke-interface {v9, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eq v4, v2, :cond_27

    goto :goto_c

    :cond_27
    add-int/lit8 v15, v12, 0x2

    .line 691
    :try_start_7
    invoke-direct {v8, v15}, Ll/ۚ۠ܽ;->ܽ(I)V

    add-int/lit8 v14, v14, 0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_28

    iput-boolean v6, v8, Ll/ۚ۠ܽ;->֫:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-lez v14, :cond_8e

    .line 703
    iget-object v2, v11, Ll/۠۠ܽ;->ۢ:[I

    aput v12, v2, v1

    add-int/2addr v1, v6

    .line 704
    aput v15, v2, v1

    return v0

    :cond_28
    move v12, v15

    goto :goto_b

    :cond_29
    :goto_c
    if-lt v12, v13, :cond_2a

    .line 695
    :try_start_8
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_d

    .line 696
    :cond_2a
    invoke-interface {v9, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-ne v2, v5, :cond_2d

    iget v2, v11, Ll/۠۠ܽ;->֫:I

    if-ne v2, v6, :cond_2b

    add-int/lit8 v2, v12, 0x1

    if-ne v2, v13, :cond_2d

    :cond_2b
    add-int/lit8 v0, v12, 0x1

    .line 698
    invoke-direct {v8, v0}, Ll/ۚ۠ܽ;->ܽ(I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    if-lez v14, :cond_2c

    .line 703
    iget-object v0, v11, Ll/۠۠ܽ;->ۢ:[I

    add-int/lit8 v2, v12, -0x2

    aput v2, v0, v1

    add-int/2addr v1, v6

    .line 704
    aput v12, v0, v1

    :cond_2c
    return v6

    :cond_2d
    :goto_d
    if-ge v14, v10, :cond_2e

    const/4 v2, 0x1

    goto :goto_e

    :cond_2e
    const/4 v2, 0x0

    .line 700
    :goto_e
    :try_start_9
    invoke-direct {v8, v7, v12, v2}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-lez v14, :cond_8e

    .line 703
    iget-object v2, v11, Ll/۠۠ܽ;->ۢ:[I

    add-int/lit8 v3, v12, -0x2

    aput v3, v2, v1

    add-int/2addr v1, v6

    .line 704
    aput v12, v2, v1

    return v0

    :catchall_1
    move-exception v0

    move v15, v12

    :goto_f
    if-lez v14, :cond_2f

    .line 703
    iget-object v2, v11, Ll/۠۠ܽ;->ۢ:[I

    add-int/lit8 v3, v15, -0x2

    aput v3, v2, v1

    add-int/2addr v1, v6

    .line 704
    aput v15, v2, v1

    .line 706
    :cond_2f
    throw v0

    :pswitch_5
    const/4 v1, 0x0

    .line 911
    invoke-direct/range {p0 .. p3}, Ll/ۚ۠ܽ;->ܿ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_31

    :cond_30
    :goto_10
    const/4 v0, 0x0

    goto/16 :goto_31

    .line 912
    :cond_31
    iget v12, v11, Ll/۠۠ܽ;->ܽ֫:I

    .line 913
    iget v13, v10, Ll/ۡ۠ܽ;->ܿ:I

    iget v2, v10, Ll/ۡ۠ܽ;->ᩳ:I

    add-int/2addr v0, v13

    move v14, v0

    move v0, v13

    :cond_32
    if-ge v0, v2, :cond_35

    if-lt v14, v12, :cond_33

    .line 917
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_11

    .line 920
    :cond_33
    invoke-interface {v9, v14}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v3, v4, :cond_34

    goto :goto_11

    :cond_34
    add-int/lit8 v14, v14, 0x1

    .line 921
    invoke-direct {v8, v14}, Ll/ۚ۠ܽ;->ܽ(I)V

    add-int/lit8 v0, v0, 0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_32

    iput-boolean v6, v8, Ll/ۚ۠ܽ;->֫:Z

    return v1

    :cond_35
    :goto_11
    if-ge v0, v2, :cond_36

    const/4 v2, 0x1

    const/4 v4, 0x1

    goto :goto_12

    :cond_36
    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_12
    move v2, v14

    :cond_37
    if-lt v2, v12, :cond_38

    .line 928
    iput-boolean v6, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_13

    .line 929
    :cond_38
    invoke-interface {v9, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-ne v3, v5, :cond_3a

    iget v3, v11, Ll/۠۠ܽ;->֫:I

    if-ne v3, v6, :cond_39

    add-int/lit8 v3, v2, 0x1

    if-ne v3, v12, :cond_3a

    :cond_39
    add-int/2addr v2, v6

    .line 931
    invoke-direct {v8, v2}, Ll/ۚ۠ܽ;->ܽ(I)V

    return v6

    :cond_3a
    :goto_13
    if-gt v0, v13, :cond_3b

    .line 933
    invoke-direct {v8, v7, v14, v4}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V

    return v1

    :cond_3b
    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v0, v0, -0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_37

    iput-boolean v6, v8, Ll/ۚ۠ܽ;->֫:Z

    return v1

    .line 560
    :pswitch_6
    iget-boolean v1, v11, Ll/۠۠ܽ;->۫:Z

    if-nez v1, :cond_60

    .line 596
    iget v1, v10, Ll/ۡ۠ܽ;->ܿ:I

    iget v4, v10, Ll/ۡ۠ܽ;->ᩳ:I

    .line 598
    iget v6, v11, Ll/۠۠ܽ;->ܽ֫:I

    iget v13, v10, Ll/ۡ۠ܽ;->ܽ:I

    iget-object v14, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aget v15, v14, v13

    const/16 v16, -0x1

    .line 600
    iget-object v12, v10, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    sget-object v0, Ll/֫֨ܽ;->ۙ:Ll/֫֨ܽ;

    if-ne v12, v0, :cond_3c

    const/4 v0, 0x1

    goto :goto_14

    :cond_3c
    const/4 v0, 0x0

    .line 601
    :goto_14
    aput v16, v14, v13

    if-eqz v0, :cond_3d

    move v12, v1

    goto :goto_15

    :cond_3d
    move v12, v4

    :goto_15
    const/4 v14, -0x1

    const/16 v16, 0x0

    move/from16 v14, p1

    move/from16 v17, v0

    move-object/from16 v16, v10

    const/4 v0, 0x0

    const/4 v10, -0x1

    :goto_16
    if-ge v0, v12, :cond_44

    if-lt v14, v6, :cond_3e

    const/4 v12, 0x1

    .line 605
    :try_start_a
    iput-boolean v12, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_17

    :cond_3e
    move/from16 v18, v12

    .line 606
    invoke-interface {v9, v14}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-eq v12, v3, :cond_3f

    goto :goto_17

    :cond_3f
    add-int/lit8 v12, v14, 0x1

    if-lt v12, v6, :cond_40

    const/4 v12, 0x1

    .line 607
    iput-boolean v12, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_17

    .line 608
    :cond_40
    invoke-interface {v9, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-eq v12, v2, :cond_41

    goto :goto_17

    :cond_41
    add-int/lit8 v10, v14, 0x2

    add-int/lit8 v0, v0, 0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v12

    if-eqz v12, :cond_43

    const/4 v0, 0x1

    iput-boolean v0, v8, Ll/ۚ۠ܽ;->֫:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    if-ltz v10, :cond_42

    .line 655
    invoke-virtual {v11, v10}, Ll/۠۠ܽ;->ܳ(I)V

    .line 656
    :cond_42
    iget-object v0, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v15, v0, v13

    const/4 v0, 0x0

    return v0

    :cond_43
    move v14, v10

    move/from16 v12, v18

    goto :goto_16

    :catchall_2
    move-exception v0

    goto/16 :goto_20

    :cond_44
    :goto_17
    if-ge v0, v1, :cond_46

    const/4 v0, 0x1

    .line 614
    :try_start_b
    invoke-direct {v8, v7, v14, v0}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    if-ltz v10, :cond_45

    .line 655
    invoke-virtual {v11, v10}, Ll/۠۠ܽ;->ܳ(I)V

    .line 656
    :cond_45
    iget-object v0, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v15, v0, v13

    const/4 v0, 0x0

    return v0

    :cond_46
    if-ge v0, v4, :cond_47

    const/4 v12, 0x1

    goto :goto_18

    :cond_47
    const/4 v12, 0x0

    :goto_18
    move/from16 v18, v12

    move v12, v14

    :goto_19
    if-ge v12, v6, :cond_48

    .line 618
    :try_start_c
    invoke-interface {v9, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v19

    move/from16 p1, v14

    move/from16 v14, v19

    goto :goto_1a

    :cond_48
    const/16 v19, -0x1

    move/from16 p1, v14

    const/4 v14, -0x1

    :goto_1a
    if-gez v14, :cond_49

    move/from16 v19, v1

    const/4 v1, 0x1

    .line 619
    iput-boolean v1, v11, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_1d

    :cond_49
    move/from16 v19, v1

    const/4 v1, 0x1

    if-ne v14, v5, :cond_4d

    move/from16 v20, v5

    .line 620
    iget v5, v11, Ll/۠۠ܽ;->֫:I

    if-ne v5, v1, :cond_4b

    add-int/lit8 v1, v12, 0x1

    if-ne v1, v6, :cond_4a

    goto :goto_1c

    :cond_4a
    :goto_1b
    move-object/from16 v5, v16

    goto :goto_1e

    :cond_4b
    :goto_1c
    if-lez v0, :cond_4c

    .line 623
    iget-object v0, v11, Ll/۠۠ܽ;->ۢ:[I

    move-object/from16 v5, v16

    iget v1, v5, Ll/ۡ۠ܽ;->ۧ:I

    add-int/lit8 v2, v12, -0x2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 624
    aput v12, v0, v1

    :cond_4c
    const/4 v0, 0x1

    add-int/lit8 v12, v12, 0x1

    .line 626
    invoke-direct {v8, v12}, Ll/ۚ۠ܽ;->ܽ(I)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    return v0

    :cond_4d
    :goto_1d
    move/from16 v20, v5

    goto :goto_1b

    :goto_1e
    if-eqz v17, :cond_5a

    if-lt v0, v4, :cond_4f

    if-ltz v10, :cond_4e

    .line 655
    invoke-virtual {v11, v10}, Ll/۠۠ܽ;->ܳ(I)V

    .line 656
    :cond_4e
    iget-object v0, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v15, v0, v13

    const/4 v0, 0x0

    return v0

    :cond_4f
    if-lt v12, v6, :cond_51

    const/4 v0, 0x1

    .line 631
    :try_start_d
    iput-boolean v0, v11, Ll/۠۠ܽ;->ܺ:Z

    .line 632
    invoke-direct {v8, v7, v12, v0}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    if-ltz v10, :cond_50

    .line 655
    invoke-virtual {v11, v10}, Ll/۠۠ܽ;->ܳ(I)V

    .line 656
    :cond_50
    iget-object v0, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v15, v0, v13

    const/4 v0, 0x0

    return v0

    :cond_51
    if-eq v14, v3, :cond_53

    const/4 v0, 0x1

    .line 635
    :try_start_e
    invoke-direct {v8, v7, v12, v0}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    if-ltz v10, :cond_52

    .line 655
    invoke-virtual {v11, v10}, Ll/۠۠ܽ;->ܳ(I)V

    .line 656
    :cond_52
    iget-object v0, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v15, v0, v13

    const/4 v0, 0x0

    return v0

    :cond_53
    add-int/lit8 v1, v12, 0x1

    if-lt v1, v6, :cond_55

    const/4 v0, 0x1

    .line 637
    :try_start_f
    iput-boolean v0, v11, Ll/۠۠ܽ;->ܺ:Z

    .line 638
    invoke-direct {v8, v7, v12, v0}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    if-ltz v10, :cond_54

    .line 655
    invoke-virtual {v11, v10}, Ll/۠۠ܽ;->ܳ(I)V

    .line 656
    :cond_54
    iget-object v0, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v15, v0, v13

    const/4 v0, 0x0

    return v0

    .line 640
    :cond_55
    :try_start_10
    invoke-interface {v9, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-eq v1, v2, :cond_57

    const/4 v0, 0x1

    invoke-direct {v8, v7, v12, v0}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    if-ltz v10, :cond_56

    .line 655
    invoke-virtual {v11, v10}, Ll/۠۠ܽ;->ܳ(I)V

    .line 656
    :cond_56
    iget-object v0, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v15, v0, v13

    const/4 v0, 0x0

    return v0

    :cond_57
    add-int/lit8 v12, v12, 0x2

    add-int/lit8 v0, v0, 0x1

    .line 2792
    :try_start_11
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_59

    const/4 v0, 0x1

    iput-boolean v0, v8, Ll/ۚ۠ܽ;->֫:Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    if-ltz v12, :cond_58

    .line 655
    invoke-virtual {v11, v12}, Ll/۠۠ܽ;->ܳ(I)V

    .line 656
    :cond_58
    iget-object v0, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v15, v0, v13

    const/4 v0, 0x0

    return v0

    :cond_59
    move/from16 v14, p1

    move v10, v12

    move/from16 v16, v18

    move/from16 v1, v19

    goto :goto_1f

    :catchall_3
    move-exception v0

    move v10, v12

    goto :goto_20

    :cond_5a
    move/from16 v1, v19

    move/from16 v14, p1

    if-gt v0, v1, :cond_5c

    move/from16 v0, v18

    .line 646
    :try_start_12
    invoke-direct {v8, v7, v14, v0}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    if-ltz v10, :cond_5b

    .line 655
    invoke-virtual {v11, v10}, Ll/۠۠ܽ;->ܳ(I)V

    .line 656
    :cond_5b
    iget-object v0, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v15, v0, v13

    const/4 v0, 0x0

    return v0

    :cond_5c
    move/from16 v16, v18

    add-int/lit8 v12, v12, -0x2

    add-int/lit8 v0, v0, -0x1

    .line 2792
    :try_start_13
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v18

    if-eqz v18, :cond_5e

    const/4 v0, 0x1

    iput-boolean v0, v8, Ll/ۚ۠ܽ;->֫:Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    if-ltz v10, :cond_5d

    .line 655
    invoke-virtual {v11, v10}, Ll/۠۠ܽ;->ܳ(I)V

    .line 656
    :cond_5d
    iget-object v0, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v15, v0, v13

    const/4 v0, 0x0

    return v0

    :cond_5e
    :goto_1f
    move/from16 v18, v16

    move-object/from16 v16, v5

    move/from16 v5, v20

    goto/16 :goto_19

    :goto_20
    if-ltz v10, :cond_5f

    .line 655
    invoke-virtual {v11, v10}, Ll/۠۠ܽ;->ܳ(I)V

    .line 656
    :cond_5f
    iget-object v1, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v15, v1, v13

    .line 658
    throw v0

    :cond_60
    move-object v5, v10

    const/4 v0, -0x1

    .line 562
    iget v10, v5, Ll/ۡ۠ܽ;->ܿ:I

    iget v12, v5, Ll/ۡ۠ܽ;->ۧ:I

    iget v13, v5, Ll/ۡ۠ܽ;->ܽ:I

    .line 563
    iget-object v2, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aget v14, v2, v13

    .line 564
    iget-object v2, v11, Ll/۠۠ܽ;->ۢ:[I

    aget v15, v2, v12

    add-int/lit8 v3, v12, 0x1

    aget v16, v2, v3

    if-eqz v1, :cond_61

    .line 565
    iget-object v1, v11, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    .line 43
    iget-object v1, v1, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move/from16 v17, v1

    goto :goto_21

    :cond_61
    const/4 v1, -0x1

    const/16 v17, -0x1

    .line 566
    :goto_21
    iget-object v1, v8, Ll/ۚ۠ܽ;->ۖ:[I

    aput v0, v1, v13

    .line 569
    :try_start_14
    iget v0, v7, Ll/ܽ֡ܽ;->ܿ:I

    iget v6, v7, Ll/ܽ֡ܽ;->ۢ:I

    const/4 v1, 0x0

    move/from16 v4, p1

    const/4 v3, 0x0

    :goto_22
    if-ge v3, v10, :cond_64

    .line 571
    iget v2, v11, Ll/۠۠ܽ;->ܽ֫:I

    move-object/from16 v1, p0

    move/from16 v18, v2

    move v2, v0

    move/from16 v19, v3

    move v3, v6

    move/from16 p1, v4

    move-object/from16 v4, p3

    move/from16 v20, v0

    move-object v0, v5

    move/from16 v5, p1

    move/from16 v21, v6

    move/from16 v6, v18

    invoke-direct/range {v1 .. v6}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;II)I

    move-result v4

    if-gez v4, :cond_62

    const/4 v0, 0x1

    move/from16 v1, p1

    .line 573
    invoke-direct {v8, v7, v1, v0}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    move-object/from16 v1, p0

    move v2, v13

    move v3, v12

    move v4, v14

    move v5, v15

    move/from16 v6, v16

    move/from16 v7, v17

    .line 588
    invoke-direct/range {v1 .. v7}, Ll/ۚ۠ܽ;->֫(IIIIII)V

    const/4 v0, 0x0

    return v0

    :cond_62
    move/from16 v1, p1

    .line 576
    :try_start_15
    invoke-virtual {v11, v4}, Ll/۠۠ܽ;->ܳ(I)V

    .line 577
    invoke-direct {v8, v12, v1, v4}, Ll/ۚ۠ܽ;->֫(III)V

    add-int/lit8 v3, v19, 0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_63

    const/4 v0, 0x1

    iput-boolean v0, v8, Ll/ۚ۠ܽ;->֫:Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    move-object/from16 v1, p0

    move v2, v13

    move v3, v12

    move v4, v14

    move v5, v15

    move/from16 v6, v16

    move/from16 v7, v17

    .line 588
    invoke-direct/range {v1 .. v7}, Ll/ۚ۠ܽ;->֫(IIIIII)V

    const/4 v1, 0x0

    return v1

    :cond_63
    move-object v5, v0

    move/from16 v0, v20

    move/from16 v6, v21

    goto :goto_22

    :catchall_4
    move-exception v0

    goto :goto_24

    :cond_64
    move v1, v4

    move-object v0, v5

    .line 583
    :try_start_16
    iget-object v0, v0, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    sget-object v2, Ll/֫֨ܽ;->ۙ:Ll/֫֨ܽ;

    if-ne v0, v2, :cond_65

    .line 584
    invoke-direct {v8, v7, v1, v10, v9}, Ll/ۚ۠ܽ;->ۧ(Ll/ܽ֡ܽ;IILjava/lang/CharSequence;)Z

    move-result v0

    goto :goto_23

    .line 585
    :cond_65
    invoke-direct {v8, v7, v1, v10, v9}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IILjava/lang/CharSequence;)Z

    move-result v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    :goto_23
    if-nez v0, :cond_66

    move-object/from16 v1, p0

    move v2, v13

    move v3, v12

    move v4, v14

    move v5, v15

    move/from16 v6, v16

    move/from16 v7, v17

    .line 588
    invoke-direct/range {v1 .. v7}, Ll/ۚ۠ܽ;->֫(IIIIII)V

    :cond_66
    return v0

    :goto_24
    move-object/from16 v1, p0

    move v2, v13

    move v3, v12

    move v4, v14

    move v5, v15

    move/from16 v6, v16

    move/from16 v7, v17

    invoke-direct/range {v1 .. v7}, Ll/ۚ۠ܽ;->֫(IIIIII)V

    .line 590
    throw v0

    :pswitch_7
    move-object v0, v10

    const/4 v1, 0x0

    const/4 v2, 0x0

    move/from16 v2, p1

    const/4 v3, 0x0

    .line 1021
    :goto_25
    iget v4, v0, Ll/ۡ۠ܽ;->ܿ:I

    iget-object v5, v0, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    iget v6, v0, Ll/ۡ۠ܽ;->ᩳ:I

    if-ge v3, v4, :cond_6a

    .line 1022
    invoke-direct {v8, v2, v7, v9}, Ll/ۚ۠ܽ;->ᩳ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v4

    .line 1023
    iget-boolean v5, v8, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v5, :cond_67

    goto/16 :goto_2a

    :cond_67
    if-gez v4, :cond_68

    const/4 v0, 0x1

    .line 1024
    invoke-direct {v8, v7, v2, v0}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V

    return v1

    :cond_68
    const/4 v2, 0x1

    .line 1025
    invoke-direct {v8, v4}, Ll/ۚ۠ܽ;->ܽ(I)V

    add-int/lit8 v3, v3, 0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_69

    iput-boolean v2, v8, Ll/ۚ۠ܽ;->֫:Z

    return v1

    :cond_69
    move v2, v4

    goto :goto_25

    :cond_6a
    const/4 v4, 0x1

    .line 1030
    iget-boolean v10, v11, Ll/۠۠ܽ;->ۡ:Z

    if-eqz v10, :cond_6b

    .line 1031
    iput-boolean v4, v8, Ll/ۚ۠ܽ;->֫:Z

    return v1

    .line 1034
    :cond_6b
    sget-object v10, Ll/֫֨ܽ;->ۙ:Ll/֫֨ܽ;

    if-ne v5, v10, :cond_72

    .line 1036
    :goto_26
    invoke-direct {v8, v2, v7, v9}, Ll/ۚ۠ܽ;->ۧ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v0

    .line 1037
    iget-boolean v5, v8, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v5, :cond_6c

    goto :goto_2a

    :cond_6c
    if-ltz v0, :cond_6d

    .line 1038
    invoke-direct {v8, v0}, Ll/ۚ۠ܽ;->ܽ(I)V

    return v4

    :cond_6d
    if-lt v3, v6, :cond_6e

    goto :goto_2a

    .line 1040
    :cond_6e
    invoke-direct {v8, v2, v7, v9}, Ll/ۚ۠ܽ;->ᩳ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v0

    .line 1041
    iget-boolean v5, v8, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v5, :cond_6f

    goto :goto_2a

    :cond_6f
    if-gez v0, :cond_70

    .line 1042
    invoke-direct {v8, v7, v2, v4}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V

    return v1

    .line 1043
    :cond_70
    invoke-direct {v8, v0}, Ll/ۚ۠ܽ;->ܽ(I)V

    add-int/lit8 v3, v3, 0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_71

    iput-boolean v4, v8, Ll/ۚ۠ܽ;->֫:Z

    return v1

    :cond_71
    move v2, v0

    goto :goto_26

    :cond_72
    :goto_27
    if-ge v3, v6, :cond_76

    .line 1050
    invoke-direct {v8, v2, v7, v9}, Ll/ۚ۠ܽ;->ᩳ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v4

    .line 1051
    iget-boolean v10, v8, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v10, :cond_73

    goto :goto_2a

    :cond_73
    if-gez v4, :cond_74

    goto :goto_28

    .line 1053
    :cond_74
    invoke-direct {v8, v4}, Ll/ۚ۠ܽ;->ܽ(I)V

    add-int/lit8 v3, v3, 0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_75

    const/4 v0, 0x1

    iput-boolean v0, v8, Ll/ۚ۠ܽ;->֫:Z

    return v1

    :cond_75
    move v2, v4

    goto :goto_27

    :cond_76
    :goto_28
    if-ge v3, v6, :cond_77

    const/4 v4, 0x1

    goto :goto_29

    :cond_77
    const/4 v4, 0x0

    :goto_29
    move v6, v2

    .line 1061
    :cond_78
    invoke-direct {v8, v6, v7, v9}, Ll/ۚ۠ܽ;->ۧ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v10

    .line 1062
    iget-boolean v12, v8, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v12, :cond_79

    :goto_2a
    goto/16 :goto_10

    :cond_79
    if-ltz v10, :cond_7a

    .line 1063
    invoke-direct {v8, v10}, Ll/ۚ۠ܽ;->ܽ(I)V

    goto/16 :goto_30

    .line 1064
    :cond_7a
    sget-object v10, Ll/֫֨ܽ;->ۗ:Ll/֫֨ܽ;

    if-eq v5, v10, :cond_7c

    iget v10, v0, Ll/ۡ۠ܽ;->ܿ:I

    if-gt v3, v10, :cond_7b

    goto :goto_2b

    .line 1067
    :cond_7b
    iget v10, v7, Ll/ܽ֡ܽ;->᩹:I

    sub-int/2addr v6, v10

    add-int/lit8 v3, v3, -0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v10

    if-eqz v10, :cond_78

    const/4 v0, 0x1

    iput-boolean v0, v8, Ll/ۚ۠ܽ;->֫:Z

    return v1

    .line 1065
    :cond_7c
    :goto_2b
    invoke-direct {v8, v7, v2, v4}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V

    return v1

    :pswitch_8
    move-object v0, v10

    const/4 v1, 0x0

    .line 1081
    iget-object v0, v0, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    .line 1082
    sget-object v2, Ll/֫֨ܽ;->ۙ:Ll/֫֨ܽ;

    if-ne v0, v2, :cond_7e

    .line 1083
    invoke-direct/range {p0 .. p3}, Ll/ۚ۠ܽ;->ۧ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v3

    .line 1084
    iget-boolean v4, v8, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v4, :cond_7d

    goto/16 :goto_10

    :cond_7d
    if-ltz v3, :cond_7e

    .line 1085
    invoke-direct {v8, v3}, Ll/ۚ۠ܽ;->ܽ(I)V

    goto/16 :goto_30

    .line 1087
    :cond_7e
    invoke-direct/range {p0 .. p3}, Ll/ۚ۠ܽ;->ᩳ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v3

    .line 1088
    iget-boolean v4, v8, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v4, :cond_7f

    goto/16 :goto_10

    :cond_7f
    if-ltz v3, :cond_82

    .line 1090
    iget-object v2, v11, Ll/۠۠ܽ;->ۢ:[I

    iget v4, v11, Ll/۠۠ܽ;->᩻:I

    aput v4, v2, v1

    .line 1091
    invoke-virtual {v11, v3}, Ll/۠۠ܽ;->ܳ(I)V

    const/4 v4, 0x1

    aput v3, v2, v4

    .line 1092
    invoke-direct {v8, v3, v7, v9}, Ll/ۚ۠ܽ;->ۧ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v2

    .line 1093
    iget-boolean v3, v8, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v3, :cond_80

    goto/16 :goto_10

    :cond_80
    if-ltz v2, :cond_81

    .line 1094
    invoke-direct {v8, v2}, Ll/ۚ۠ܽ;->ܽ(I)V

    return v4

    .line 1095
    :cond_81
    sget-object v2, Ll/֫֨ܽ;->᩹:Ll/֫֨ܽ;

    if-eq v0, v2, :cond_83

    goto/16 :goto_10

    :cond_82
    if-ne v0, v2, :cond_83

    goto/16 :goto_10

    .line 1097
    :cond_83
    invoke-direct/range {p0 .. p3}, Ll/ۚ۠ܽ;->ۧ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v0

    .line 1098
    iget-boolean v2, v8, Ll/ۚ۠ܽ;->֫:Z

    if-nez v2, :cond_30

    if-ltz v0, :cond_30

    invoke-direct {v8, v0}, Ll/ۚ۠ܽ;->ܽ(I)V

    goto :goto_30

    :pswitch_9
    const/4 v0, 0x0

    .line 1120
    iget-object v1, v7, Ll/ܽ֡ܽ;->ܽ:Ljava/lang/Object;

    iget v2, v7, Ll/ܽ֡ܽ;->ۘ:I

    iget-boolean v3, v7, Ll/ܽ֡ܽ;->ܺ:Z

    check-cast v1, Ll/ۧۚܽ;

    .line 1121
    iget v4, v11, Ll/۠۠ܽ;->ܽ֫:I

    const/4 v5, 0x0

    move/from16 v6, p1

    :cond_84
    if-ge v6, v4, :cond_89

    if-eqz v3, :cond_85

    .line 1123
    invoke-static {v9, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v10

    goto :goto_2c

    :cond_85
    invoke-interface {v9, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    :goto_2c
    if-eqz v3, :cond_86

    .line 1124
    invoke-static {v10}, Ljava/lang/Character;->charCount(I)I

    move-result v12

    goto :goto_2d

    :cond_86
    const/4 v12, 0x1

    :goto_2d
    add-int v13, v6, v12

    if-le v13, v4, :cond_87

    const/4 v10, 0x1

    .line 1126
    iput-boolean v10, v11, Ll/۠۠ܽ;->ܺ:Z

    .line 1127
    invoke-interface {v9, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    const/4 v12, 0x1

    .line 1130
    :cond_87
    invoke-interface {v1, v10}, Ll/ۧۚܽ;->֫(I)Z

    move-result v10

    if-nez v10, :cond_88

    goto :goto_2e

    :cond_88
    add-int/2addr v6, v12

    add-int/lit8 v5, v5, 0x1

    .line 2792
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v10

    if-eqz v10, :cond_84

    const/4 v1, 0x1

    iput-boolean v1, v8, Ll/ۚ۠ܽ;->֫:Z

    return v0

    :cond_89
    :goto_2e
    const/4 v1, 0x1

    if-lt v6, v4, :cond_8a

    .line 1135
    iput-boolean v1, v11, Ll/۠۠ܽ;->ܺ:Z

    .line 1137
    :cond_8a
    iput v6, v8, Ll/ۚ۠ܽ;->ܿ:I

    if-ge v5, v2, :cond_8b

    goto :goto_31

    .line 1140
    :cond_8b
    :goto_2f
    invoke-direct {v8, v6, v7, v9}, Ll/ۚ۠ܽ;->ۧ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v1

    .line 1141
    iget-boolean v4, v8, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v4, :cond_8c

    goto :goto_31

    :cond_8c
    if-ltz v1, :cond_8d

    .line 1142
    invoke-direct {v8, v1}, Ll/ۚ۠ܽ;->ܽ(I)V

    :goto_30
    const/4 v0, 0x1

    return v0

    :cond_8d
    add-int/lit8 v1, v5, -0x1

    if-gt v5, v2, :cond_8f

    :cond_8e
    :goto_31
    return v0

    :cond_8f
    if-eqz v3, :cond_90

    .line 1144
    invoke-static {v9, v6}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    sub-int/2addr v6, v4

    move/from16 v4, p1

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    move v6, v5

    goto :goto_32

    :cond_90
    move/from16 v4, p1

    add-int/lit8 v6, v6, -0x1

    .line 2792
    :goto_32
    invoke-virtual {v11}, Ll/۠۠ܽ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_91

    const/4 v1, 0x1

    iput-boolean v1, v8, Ll/ۚ۠ܽ;->֫:Z

    return v0

    :cond_91
    move v5, v1

    goto :goto_2f

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private ֫(IZ)Z
    .locals 12

    .line 2080
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۢ(I)Ll/ۡ۠ܽ;

    move-result-object v0

    .line 2081
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v2, p1, 0x11

    aget v3, v1, v2

    add-int/lit8 v4, p1, 0x2

    .line 2082
    aget v5, v1, v4

    add-int/lit8 v6, p1, 0x12

    .line 2083
    aget v7, v1, v6

    const/16 v8, 0xd

    .line 2084
    iget-object v9, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    const/4 v10, 0x0

    const/4 v11, 0x1

    packed-switch v3, :pswitch_data_0

    .line 2154
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid quantifier continuation"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const/16 p2, 0xa

    .line 2101
    invoke-direct {p0, p1, p2, v11}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v11

    .line 2095
    :pswitch_1
    iget-object p2, v0, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    sget-object v0, Ll/֫֨ܽ;->᩹:Ll/֫֨ܽ;

    if-ne p2, v0, :cond_0

    add-int/lit8 p2, p1, 0x14

    .line 2096
    aget p2, v1, p2

    aput p2, v1, v4

    .line 2097
    invoke-direct {p0, p1, v8, v10}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v11

    .line 2099
    :cond_0
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ᩳ(I)V

    return v10

    :pswitch_2
    if-eqz p2, :cond_1

    .line 2087
    iget p2, v9, Ll/۠۠ܽ;->ۖ:I

    aput p2, v1, v4

    add-int/lit8 p2, p1, 0x14

    .line 2089
    aput v5, v1, p2

    const/16 p2, 0xb

    .line 2090
    invoke-direct {p0, p1, p2, v10}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v11

    .line 2092
    :cond_1
    iget-object p2, v0, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    sget-object v0, Ll/֫֨ܽ;->ۙ:Ll/֫֨ܽ;

    if-eq p2, v0, :cond_2

    invoke-direct {p0, p1, v8, v10}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v11

    .line 2093
    :cond_2
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ᩳ(I)V

    return v10

    :pswitch_3
    add-int/lit8 p2, p1, 0x13

    .line 2144
    aget p2, v1, p2

    sub-int/2addr v5, p2

    sub-int p2, v5, p2

    .line 2145
    invoke-direct {p0, v0, p2, v5}, Ll/ۚ۠ܽ;->֫(Ll/ۡ۠ܽ;II)V

    .line 2146
    iget-object p2, p0, Ll/ۚ۠ܽ;->ۚ:[I

    aput v5, p2, v4

    sub-int/2addr v7, v11

    .line 2147
    aput v7, p2, v6

    .line 2148
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->᩻(I)Z

    move-result p1

    return p1

    .line 2142
    :pswitch_4
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->᩻(I)Z

    move-result p1

    return p1

    :pswitch_5
    if-nez p2, :cond_3

    .line 2134
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->᩻(I)Z

    move-result p1

    return p1

    :cond_3
    add-int/lit8 p2, p1, 0x13

    .line 2135
    aget p2, v1, p2

    add-int/2addr p2, v5

    iget v3, v9, Ll/۠۠ܽ;->ۖ:I

    if-eq p2, v3, :cond_6

    const/4 p2, 0x7

    .line 2136
    aput p2, v1, v2

    .line 2137
    iget p2, v0, Ll/ۡ۠ܽ;->ܽ:I

    if-ltz p2, :cond_4

    goto :goto_0

    :cond_4
    move v5, v3

    :goto_0
    if-ltz p2, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v7, v7, 0x1

    :goto_1
    invoke-direct {p0, p1, v5, v7}, Ll/ۚ۠ܽ;->ۧ(III)V

    return v11

    .line 2140
    :cond_6
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۜ(I)Z

    move-result p1

    return p1

    :pswitch_6
    if-eqz p2, :cond_8

    .line 2127
    iget v2, v9, Ll/۠۠ܽ;->ۖ:I

    if-eq v2, v5, :cond_8

    iget v3, v0, Ll/ۡ۠ܽ;->ܽ:I

    if-ltz v3, :cond_7

    if-ge v2, v5, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 p2, p1, 0x13

    sub-int/2addr v2, v5

    .line 2131
    aput v2, v1, p2

    .line 2132
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۜ(I)Z

    move-result p1

    return p1

    :cond_8
    :goto_2
    if-eqz p2, :cond_9

    .line 2128
    iget p2, v0, Ll/ۡ۠ܽ;->ܽ:I

    if-ltz p2, :cond_9

    iget p2, v9, Ll/۠۠ܽ;->ۖ:I

    aput p2, v1, v4

    .line 2179
    :cond_9
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۡ(I)V

    const/16 p2, 0x9

    .line 2180
    invoke-direct {p0, p1, p2, v10}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v11

    :pswitch_7
    if-eqz p2, :cond_a

    .line 2118
    iget p2, v9, Ll/۠۠ܽ;->ۖ:I

    invoke-direct {p0, v0, v5, p2}, Ll/ۚ۠ܽ;->֫(Ll/ۡ۠ܽ;II)V

    .line 2119
    iget p2, v9, Ll/۠۠ܽ;->ۖ:I

    if-eq v5, p2, :cond_a

    .line 2120
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    aput p2, v1, v4

    add-int/2addr v7, v11

    .line 2121
    aput v7, v1, v6

    .line 2122
    iget p2, v0, Ll/ۡ۠ܽ;->ᩳ:I

    if-ge v7, p2, :cond_a

    const/4 p2, 0x4

    invoke-direct {p0, p1, p2, v11}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v11

    .line 2125
    :cond_a
    invoke-direct {p0, p1, v11, v10}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v11

    :pswitch_8
    if-eqz p2, :cond_c

    .line 2111
    iget p2, v9, Ll/۠۠ܽ;->ۖ:I

    if-ne v5, p2, :cond_b

    goto :goto_3

    .line 2112
    :cond_b
    invoke-direct {p0, v0, v5, p2}, Ll/ۚ۠ܽ;->֫(Ll/ۡ۠ܽ;II)V

    .line 2113
    iget-object p2, p0, Ll/ۚ۠ܽ;->ۚ:[I

    iget v0, v9, Ll/۠۠ܽ;->ۖ:I

    aput v0, p2, v4

    add-int/2addr v7, v11

    .line 2114
    aput v7, p2, v6

    const/4 p2, 0x2

    .line 2115
    invoke-direct {p0, p1, p2, v10}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v11

    .line 2111
    :cond_c
    :goto_3
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ᩳ(I)V

    return v10

    .line 2109
    :pswitch_9
    iget p2, v0, Ll/ۡ۠ܽ;->ᩳ:I

    if-ge v7, p2, :cond_d

    const/4 p2, 0x3

    invoke-direct {p0, p1, p2, v11}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v11

    :cond_d
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ᩳ(I)V

    return v10

    .line 2152
    :pswitch_a
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ᩳ(I)V

    return v10

    :pswitch_b
    if-nez p2, :cond_e

    .line 2103
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ᩳ(I)V

    return v10

    .line 2104
    :cond_e
    iget p2, v9, Ll/۠۠ܽ;->ۖ:I

    invoke-direct {p0, v0, v5, p2}, Ll/ۚ۠ܽ;->֫(Ll/ۡ۠ܽ;II)V

    .line 2105
    iget-object p2, p0, Ll/ۚ۠ܽ;->ۚ:[I

    iget v1, v9, Ll/۠۠ܽ;->ۖ:I

    aput v1, p2, v4

    add-int/2addr v7, v11

    .line 2106
    aput v7, p2, v6

    .line 2107
    iget p2, v0, Ll/ۡ۠ܽ;->ܿ:I

    if-ge v7, p2, :cond_f

    invoke-direct {p0, p1, v10, v11}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v11

    :cond_f
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->᩷(I)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_a
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_a
    .end packed-switch
.end method

.method private ֫(Ll/ۖ۠ܽ;ILjava/lang/CharSequence;)Z
    .locals 3

    .line 477
    iget-object v0, p0, Ll/ۚ۠ܽ;->֨:Ll/ܶ۠ܽ;

    const/4 v1, 0x0

    .line 479
    :try_start_0
    iget-object v2, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    invoke-virtual {v0, p1, v2, p3, p2}, Ll/ܶ۠ܽ;->֫(Ll/ۖ۠ܽ;Ll/۠۠ܽ;Ljava/lang/CharSequence;I)V

    .line 480
    :cond_0
    invoke-virtual {v0}, Ll/ܶ۠ܽ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 481
    iget p1, v0, Ll/ܶ۠ܽ;->ᩳ:I

    iget p2, v0, Ll/ܶ۠ܽ;->ܿ:I

    invoke-direct {p0, p1, p2, p3}, Ll/ۚ۠ܽ;->ۧ(IILjava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 482
    iget p1, v0, Ll/ܶ۠ܽ;->ܳ:I

    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۧ(I)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 489
    invoke-virtual {v0}, Ll/ܶ۠ܽ;->֫()V

    .line 490
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۧ(Z)V

    return p1

    .line 484
    :cond_1
    :try_start_1
    iget-boolean p1, p0, Ll/ۚ۠ܽ;->֫:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 486
    :cond_2
    iget-boolean p1, p0, Ll/ۚ۠ܽ;->֫:Z

    iget-boolean p2, v0, Ll/ܶ۠ܽ;->֫:Z

    or-int/2addr p1, p2

    iput-boolean p1, p0, Ll/ۚ۠ܽ;->֫:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 489
    :goto_0
    invoke-virtual {v0}, Ll/ܶ۠ܽ;->֫()V

    .line 490
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ۧ(Z)V

    return v1

    :catchall_0
    move-exception p1

    .line 489
    invoke-virtual {v0}, Ll/ܶ۠ܽ;->֫()V

    .line 490
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ۧ(Z)V

    .line 491
    throw p1
.end method

.method private ֫(Ll/ۛۚܽ;ILjava/lang/CharSequence;)Z
    .locals 6

    .line 447
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-object v0, v0, Ll/ۢ۠ܽ;->ܳ:Ll/ܽ֡ܽ;

    .line 448
    instance-of v1, p1, Ll/֡֨ܽ;

    if-nez v1, :cond_1

    .line 449
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/ۚ֡ܽ;

    if-ne v1, v2, :cond_0

    .line 452
    invoke-direct {p0, p2, v0, p3}, Ll/ۚ۠ܽ;->֫(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    .line 450
    :cond_0
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p3, "Regex program does not support search root: "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 454
    :cond_1
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v2, v1, Ll/۠۠ܽ;->ܽ֫:I

    move-object v3, p1

    check-cast v3, Ll/֡֨ܽ;

    iget v3, v3, Ll/֡֨ܽ;->ۧ:I

    sub-int/2addr v2, v3

    .line 455
    instance-of p1, p1, Ll/᩹֨ܽ;

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gt p2, v2, :cond_b

    .line 2792
    invoke-virtual {v1}, Ll/۠۠ܽ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_2

    iput-boolean v4, p0, Ll/ۚ۠ܽ;->֫:Z

    return v3

    .line 459
    :cond_2
    iput p2, p0, Ll/ۚ۠ܽ;->ܿ:I

    .line 460
    iget v5, v1, Ll/۠۠ܽ;->ܽ֫:I

    if-ge p2, v5, :cond_3

    invoke-interface {p3, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-virtual {v0, v5}, Ll/ܽ֡ܽ;->֫(I)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 461
    :cond_3
    invoke-direct {p0, p2, v0, p3}, Ll/ۚ۠ܽ;->֫(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 462
    iget-object p1, v1, Ll/۠۠ܽ;->ۢ:[I

    aput p2, p1, v3

    iput p2, v1, Ll/۠۠ܽ;->᩻:I

    return v4

    .line 465
    :cond_4
    iget-boolean v4, p0, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v4, :cond_5

    return v3

    .line 466
    :cond_5
    iget v3, p0, Ll/ۚ۠ܽ;->ܿ:I

    if-le v3, p2, :cond_7

    iget-boolean v4, v0, Ll/ܽ֡ܽ;->ܺ:Z

    if-eqz v4, :cond_6

    if-nez p1, :cond_6

    iget-boolean v4, v0, Ll/ܽ֡ܽ;->᩸:Z

    if-eqz v4, :cond_7

    :cond_6
    move p2, v3

    :cond_7
    if-eqz p1, :cond_a

    if-lt p2, v2, :cond_8

    goto :goto_1

    :cond_8
    add-int/lit8 v3, p2, 0x1

    .line 468
    invoke-interface {p3, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 469
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v3, v4, :cond_9

    invoke-interface {p3, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_9

    add-int/lit8 p2, p2, 0x2

    goto :goto_0

    :cond_9
    move p2, v3

    goto :goto_0

    :cond_a
    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 471
    :cond_b
    iput-boolean v4, v1, Ll/۠۠ܽ;->ܺ:Z

    return v3
.end method

.method private ֫(Ll/ۜ۠ܽ;IILjava/lang/CharSequence;)Z
    .locals 1

    .line 1965
    iget-object p1, p1, Ll/ۜ۠ܽ;->ۧ:[I

    if-eqz p1, :cond_1

    .line 1966
    aget v0, p1, p2

    if-ltz v0, :cond_1

    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v0, v0, Ll/۠۠ܽ;->ܽ֫:I

    if-ge p3, v0, :cond_1

    .line 1967
    invoke-interface {p4, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    const/16 p4, 0x80

    if-ge p3, p4, :cond_1

    .line 1968
    aget p1, p1, p2

    if-ne p3, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private ֫(Ll/ۤ᩵ܽ;ILjava/lang/CharSequence;)Z
    .locals 4

    .line 2792
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۤ()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iput-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    return v2

    .line 1215
    :cond_0
    iget v1, v0, Ll/۠۠ܽ;->ܽ֫:I

    invoke-direct {p0, p1, p3, p2, v1}, Ll/ۚ۠ܽ;->֫(Ll/ۤ᩵ܽ;Ljava/lang/CharSequence;II)I

    move-result p1

    .line 1216
    iget-boolean p2, p0, Ll/ۚ۠ܽ;->֫:Z

    if-nez p2, :cond_2

    if-gez p1, :cond_1

    goto :goto_0

    .line 1221
    :cond_1
    iget-object p2, v0, Ll/۠۠ܽ;->ۢ:[I

    iget p3, v0, Ll/۠۠ܽ;->᩻:I

    aput p3, p2, v2

    .line 1222
    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ܳ(I)V

    aput p1, p2, v3

    return v3

    .line 1218
    :cond_2
    :goto_0
    invoke-direct {p0, v2}, Ll/ۚ۠ܽ;->ۖ(I)V

    return v2
.end method

.method private ֫(Ll/۫᩵ܽ;ILjava/lang/CharSequence;)Z
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 348
    iget-object v3, v1, Ll/۫᩵ܽ;->ᩳ:[I

    iget-object v4, v1, Ll/۫᩵ܽ;->ܽ:[I

    .line 349
    array-length v5, v3

    .line 350
    iget-object v6, v0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v7, v6, Ll/۠۠ܽ;->ܽ֫:I

    sub-int/2addr v7, v5

    add-int/lit8 v8, v5, -0x1

    .line 351
    aget v9, v3, v8

    int-to-char v9, v9

    .line 797
    instance-of v10, v2, Ll/᩺۬ۡ;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v11, v10

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v10, p2

    :goto_0
    const/4 v15, 0x1

    if-gt v10, v7, :cond_f

    .line 2792
    invoke-virtual {v6}, Ll/۠۠ܽ;->ۤ()Z

    move-result v16

    if-eqz v16, :cond_0

    iput-boolean v15, v0, Ll/ۚ۠ܽ;->֫:Z

    return v12

    :cond_0
    if-eqz v11, :cond_9

    add-int v15, v10, v5

    add-int/lit8 v12, v15, -0x1

    .line 359
    invoke-interface {v2, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-eq v12, v9, :cond_8

    and-int/lit8 v12, v12, 0x7f

    .line 361
    aget v12, v4, v12

    sub-int v12, v5, v12

    move/from16 v16, v7

    const/4 v7, 0x2

    if-le v12, v7, :cond_1

    add-int/2addr v10, v12

    move/from16 v17, v8

    goto/16 :goto_5

    .line 368
    :cond_1
    invoke-virtual {v6}, Ll/۠۠ܽ;->۫()V

    .line 369
    iget v7, v6, Ll/۠۠ܽ;->ܽ֫:I

    add-int/lit8 v12, v7, -0x1

    move/from16 v17, v8

    .line 784
    instance-of v8, v2, Ll/᩺۬ۡ;

    if-eqz v8, :cond_2

    move-object v8, v2

    check-cast v8, Ll/᩺۬ۡ;

    .line 785
    invoke-interface {v8, v9, v15, v7}, Ll/᩺۬ۡ;->indexOf(CII)I

    move-result v7

    goto :goto_2

    :cond_2
    :goto_1
    if-gt v15, v12, :cond_4

    .line 788
    invoke-interface {v2, v15}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-ne v7, v9, :cond_3

    move v7, v15

    goto :goto_2

    :cond_3
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    :cond_4
    const/4 v7, -0x1

    .line 371
    :goto_2
    invoke-virtual {v6}, Ll/۠۠ܽ;->ۧ()Z

    move-result v8

    if-eqz v8, :cond_5

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ۚ۠ܽ;->֫:Z

    const/4 v8, 0x0

    return v8

    :cond_5
    const/4 v8, 0x0

    const/4 v12, 0x1

    if-gez v7, :cond_6

    .line 373
    iput-boolean v12, v6, Ll/۠۠ܽ;->ܺ:Z

    return v8

    :cond_6
    sub-int/2addr v7, v5

    add-int/2addr v7, v12

    const/16 v12, 0x40

    if-ge v13, v12, :cond_7

    add-int/lit8 v13, v13, 0x1

    sub-int v10, v7, v10

    add-int/2addr v14, v10

    if-ne v13, v12, :cond_7

    const/16 v10, 0x80

    if-ge v14, v10, :cond_7

    const/4 v10, 0x0

    move v10, v7

    const/4 v11, 0x0

    goto :goto_3

    :cond_7
    move v10, v7

    goto :goto_3

    :cond_8
    move/from16 v16, v7

    move/from16 v17, v8

    const/4 v8, 0x0

    :goto_3
    add-int/lit8 v7, v5, -0x2

    const/4 v12, 0x0

    goto :goto_4

    :cond_9
    move/from16 v16, v7

    move/from16 v17, v8

    const/4 v12, 0x0

    move/from16 v7, v17

    :goto_4
    if-ltz v7, :cond_c

    .line 2792
    invoke-virtual {v6}, Ll/۠۠ܽ;->ۤ()Z

    move-result v8

    if-eqz v8, :cond_a

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ۚ۠ܽ;->֫:Z

    return v12

    :cond_a
    add-int v8, v10, v7

    .line 387
    invoke-interface {v2, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    .line 388
    aget v15, v3, v7

    if-eq v8, v15, :cond_b

    add-int/lit8 v12, v7, 0x1

    and-int/lit8 v8, v8, 0x7f

    .line 389
    aget v8, v4, v8

    sub-int/2addr v12, v8

    iget-object v8, v1, Ll/۫᩵ܽ;->ۧ:[I

    aget v7, v8, v7

    invoke-static {v12, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    add-int/2addr v10, v7

    goto :goto_5

    :cond_b
    add-int/lit8 v7, v7, -0x1

    goto :goto_4

    .line 393
    :cond_c
    iput v10, v6, Ll/۠۠ܽ;->᩻:I

    .line 394
    iget v7, v1, Ll/۫᩵ܽ;->ܿ:I

    add-int v8, v10, v5

    invoke-direct {v0, v7, v8, v2}, Ll/ۚ۠ܽ;->ۧ(IILjava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_d

    .line 395
    invoke-direct {v0, v10}, Ll/ۚ۠ܽ;->ۧ(I)Z

    move-result v1

    return v1

    .line 397
    :cond_d
    iget-boolean v7, v0, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v7, :cond_e

    return v12

    :cond_e
    add-int/lit8 v10, v10, 0x1

    :goto_5
    const/4 v12, 0x0

    move/from16 v7, v16

    move/from16 v8, v17

    goto/16 :goto_0

    :cond_f
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 400
    iput-boolean v1, v6, Ll/۠۠ܽ;->ܺ:Z

    return v2
.end method

.method private ֫(Ll/۬᩵ܽ;ILjava/lang/CharSequence;)Z
    .locals 4

    .line 2792
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۤ()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iput-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    return v2

    .line 1205
    :cond_0
    iget v1, v0, Ll/۠۠ܽ;->ܽ֫:I

    invoke-direct {p0, p1, p3, p2, v1}, Ll/ۚ۠ܽ;->֫(Ll/۬᩵ܽ;Ljava/lang/CharSequence;II)I

    move-result p1

    .line 1206
    iget-boolean p2, p0, Ll/ۚ۠ܽ;->֫:Z

    if-nez p2, :cond_2

    if-gez p1, :cond_1

    goto :goto_0

    .line 1207
    :cond_1
    iget-object p2, v0, Ll/۠۠ܽ;->ۢ:[I

    iget p3, v0, Ll/۠۠ܽ;->᩻:I

    aput p3, p2, v2

    .line 1208
    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ܳ(I)V

    aput p1, p2, v3

    return v3

    :cond_2
    :goto_0
    return v2
.end method

.method private ֫(Ll/ܽ֡ܽ;IILjava/lang/CharSequence;)Z
    .locals 23

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move/from16 v8, p3

    .line 738
    iget-object v0, v7, Ll/ܽ֡ܽ;->֡:Ll/ۡ۠ܽ;

    iget v9, v0, Ll/ۡ۠ܽ;->ᩳ:I

    iget v10, v0, Ll/ۡ۠ܽ;->ۧ:I

    .line 739
    iget v11, v7, Ll/ܽ֡ܽ;->ܿ:I

    iget v12, v7, Ll/ܽ֡ܽ;->ۢ:I

    iget v13, v7, Ll/ܽ֡ܽ;->۠:I

    .line 741
    iget-object v14, v6, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object v15, v14, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    iget-object v0, v14, Ll/۠۠ܽ;->ۢ:[I

    aget v16, v0, v10

    add-int/lit8 v17, v10, 0x1

    aget v18, v0, v17

    .line 742
    iget-boolean v0, v14, Ll/۠۠ܽ;->۫:Z

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, v15, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    const/4 v5, -0x1

    :goto_0
    move/from16 v4, p2

    move v3, v8

    :goto_1
    const/16 v19, 0x0

    if-ge v3, v9, :cond_3

    .line 744
    iget v2, v14, Ll/۠۠ܽ;->ܽ֫:I

    move-object/from16 v0, p0

    move v1, v11

    move/from16 v20, v2

    move v2, v12

    move/from16 v21, v11

    move v11, v3

    move-object/from16 v3, p4

    move/from16 p2, v4

    move/from16 v22, v12

    move v12, v5

    move/from16 v5, v20

    invoke-direct/range {v0 .. v5}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;II)I

    move-result v4

    if-gez v4, :cond_1

    move/from16 v0, p2

    goto :goto_3

    .line 746
    :cond_1
    invoke-virtual {v14, v4}, Ll/۠۠ܽ;->ܳ(I)V

    move/from16 v0, p2

    .line 747
    invoke-direct {v6, v10, v0, v4}, Ll/ۚ۠ܽ;->֫(III)V

    add-int/lit8 v3, v11, 0x1

    .line 2792
    invoke-virtual {v14}, Ll/۠۠ܽ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_2
    const/4 v0, 0x1

    iput-boolean v0, v6, Ll/ۚ۠ܽ;->֫:Z

    return v19

    :cond_2
    move v5, v12

    move/from16 v11, v21

    move/from16 v12, v22

    goto :goto_1

    :cond_3
    move v11, v3

    move v0, v4

    move v12, v5

    :goto_3
    if-ge v11, v9, :cond_4

    const/4 v1, 0x1

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    move v4, v0

    move v3, v11

    :goto_5
    if-ne v3, v8, :cond_6

    if-ltz v12, :cond_5

    .line 756
    invoke-virtual {v15, v12}, Ll/ᩴ۠ܽ;->֫(I)V

    .line 757
    :cond_5
    iget-object v2, v14, Ll/۠۠ܽ;->ۢ:[I

    aput v16, v2, v10

    .line 758
    aput v18, v2, v17

    .line 760
    :cond_6
    iget v2, v14, Ll/۠۠ܽ;->ܽ֫:I

    move-object/from16 v5, p4

    invoke-direct {v6, v13, v4, v2, v5}, Ll/ۚ۠ܽ;->֫(IIILjava/lang/CharSequence;)I

    move-result v2

    if-ltz v2, :cond_7

    .line 761
    iget v9, v14, Ll/۠۠ܽ;->֫:I

    const/4 v11, 0x1

    if-ne v9, v11, :cond_7

    iget v9, v14, Ll/۠۠ܽ;->ܽ֫:I

    if-eq v2, v9, :cond_7

    const/4 v2, -0x1

    :cond_7
    if-ltz v2, :cond_9

    if-le v3, v8, :cond_8

    add-int/lit8 v0, v4, -0x2

    .line 764
    invoke-direct {v6, v10, v0, v4}, Ll/ۚ۠ܽ;->֫(III)V

    .line 765
    :cond_8
    invoke-direct {v6, v2}, Ll/ۚ۠ܽ;->ܽ(I)V

    const/4 v0, 0x1

    return v0

    :cond_9
    if-gt v3, v8, :cond_a

    .line 767
    invoke-direct {v6, v7, v0, v1}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V

    return v19

    :cond_a
    add-int/lit8 v2, v4, -0x2

    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v4, v4, -0x4

    .line 770
    invoke-direct {v6, v10, v4, v2}, Ll/ۚ۠ܽ;->֫(III)V

    .line 2792
    invoke-virtual {v14}, Ll/۠۠ܽ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_2

    :cond_b
    move v4, v2

    goto :goto_5
.end method

.method private ֫(Ll/᩷۠ܽ;ILjava/lang/CharSequence;)Z
    .locals 11

    .line 2792
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۤ()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iput-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    return v2

    .line 332
    :cond_0
    iget v0, v0, Ll/۠۠ܽ;->ܽ֫:I

    .line 333
    iget-object v1, p1, Ll/᩷۠ܽ;->֫:Ll/ۜ۠ܽ;

    iget-object v4, v1, Ll/ۜ۠ܽ;->ܽ:[I

    if-ge p2, v0, :cond_2

    .line 335
    invoke-interface {p3, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v5, 0x80

    if-ge v0, v5, :cond_2

    .line 337
    iget-object p1, v1, Ll/ۜ۠ܽ;->֫:[I

    aget p1, p1, v0

    if-eqz p1, :cond_1

    .line 338
    invoke-static {p1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result p1

    aget p1, v4, p1

    invoke-direct {p0, p1, p2, p3}, Ll/ۚ۠ܽ;->ۧ(IILjava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v3

    :cond_1
    return v2

    .line 342
    :cond_2
    iget v7, p1, Ll/᩷۠ܽ;->ۧ:I

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v6, 0x3

    move-object v5, p0

    move v8, p2

    invoke-direct/range {v5 .. v10}, Ll/ۚ۠ܽ;->֫(IIIII)V

    .line 343
    aget p1, v4, v2

    invoke-direct {p0, p1, p2, p3}, Ll/ۚ۠ܽ;->ۧ(IILjava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public static ֫(Ll/᩻۠ܽ;Ll/۠۠ܽ;ILjava/lang/CharSequence;)Z
    .locals 5

    .line 2864
    iget v0, p0, Ll/᩻۠ܽ;->ۧ:I

    iget-object v1, p0, Ll/᩻۠ܽ;->ᩳ:Ljava/lang/Object;

    const/16 v2, 0x10

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v2, :cond_1

    .line 2865
    iget-boolean v0, p1, Ll/۠۠ܽ;->ܺ:Z

    iget-boolean v1, p1, Ll/۠۠ܽ;->ۤ:Z

    .line 2866
    iget v2, p0, Ll/᩻۠ܽ;->֫:I

    iget-boolean p0, p0, Ll/᩻۠ܽ;->ܽ:Z

    invoke-static {v2, p0, p1, p2, p3}, Ll/᩸۠ܽ;->֫(IZLl/۠۠ܽ;ILjava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 2868
    :cond_0
    iput-boolean v0, p1, Ll/۠۠ܽ;->ܺ:Z

    .line 2869
    iput-boolean v1, p1, Ll/۠۠ܽ;->ۤ:Z

    return v3

    :cond_1
    if-ne v0, v4, :cond_3

    .line 2873
    iget p0, p1, Ll/۠۠ܽ;->ܽ֫:I

    if-lt p2, p0, :cond_2

    .line 2874
    iput-boolean v4, p1, Ll/۠۠ܽ;->ܺ:Z

    return v4

    .line 2877
    :cond_2
    check-cast v1, Ll/ۧۚܽ;

    invoke-interface {p3, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    invoke-interface {v1, p0}, Ll/ۧۚܽ;->֫(I)Z

    move-result p0

    xor-int/2addr p0, v4

    return p0

    .line 2879
    :cond_3
    check-cast v1, Ll/᩻֨ܽ;

    .line 2880
    iget p0, v1, Ll/᩻֨ܽ;->ܽ:I

    add-int/2addr p0, p2

    if-lt p0, p2, :cond_7

    .line 2882
    iget p1, p1, Ll/۠۠ܽ;->ܽ֫:I

    if-lt p0, p1, :cond_4

    goto :goto_1

    .line 2883
    :cond_4
    invoke-interface {p3, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    .line 2884
    iget-boolean p1, v1, Ll/᩻֨ܽ;->ۧ:Z

    if-eqz p1, :cond_5

    iget-char p1, v1, Ll/᩻֨ܽ;->֫:C

    if-ne p0, p1, :cond_6

    goto :goto_1

    :cond_5
    iget-object p1, v1, Ll/᩻֨ܽ;->ᩳ:Ll/ۧۚܽ;

    invoke-interface {p1, p0}, Ll/ۧۚܽ;->֫(I)Z

    move-result p0

    if-nez p0, :cond_7

    :cond_6
    :goto_0
    return v4

    :cond_7
    :goto_1
    return v3
.end method

.method private ֫(Z)Z
    .locals 12

    .line 2265
    iget v0, p0, Ll/ۚ۠ܽ;->ᩳ:I

    if-ltz v0, :cond_c

    .line 2267
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    aget v2, v1, v0

    const/4 v3, 0x5

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-lt v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const/16 v3, 0x15

    :cond_1
    add-int/2addr v3, v0

    .line 2268
    aget v1, v1, v3

    .line 2269
    iget-object v3, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    const/4 v6, 0x2

    if-eqz p1, :cond_6

    .line 2270
    iget-boolean v7, v3, Ll/۠۠ܽ;->۫:Z

    if-nez v7, :cond_2

    iget-object v7, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v8, v7, Ll/ۢ۠ܽ;->᩷:Z

    if-nez v8, :cond_2

    iget-boolean v8, v7, Ll/ۢ۠ܽ;->ۜ:Z

    if-nez v8, :cond_2

    iget-boolean v7, v7, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v7, :cond_3

    .line 2271
    :cond_2
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ܳ(I)Z

    move-result v7

    if-nez v7, :cond_3

    return v4

    .line 2332
    :cond_3
    iget-object v7, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v7, v7, Ll/ۢ۠ܽ;->ܽ:Z

    if-nez v7, :cond_5

    .line 2333
    iget v7, p0, Ll/ۚ۠ܽ;->᩹:I

    sub-int/2addr v7, v6

    :goto_1
    if-lt v7, v1, :cond_5

    .line 2334
    iget-object v8, p0, Ll/ۚ۠ܽ;->᩸:[I

    aget v9, v8, v7

    if-gez v9, :cond_4

    const/high16 v10, -0x80000000

    if-eq v9, v10, :cond_4

    .line 2335
    iget-object v10, p0, Ll/ۚ۠ܽ;->ۖ:[I

    not-int v9, v9

    add-int/lit8 v11, v7, 0x1

    aget v8, v8, v11

    aput v8, v10, v9

    :cond_4
    add-int/lit8 v7, v7, -0x2

    goto :goto_1

    .line 2339
    :cond_5
    iput v1, p0, Ll/ۚ۠ܽ;->᩹:I

    goto :goto_2

    .line 2274
    :cond_6
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ۖ(I)V

    :goto_2
    add-int/lit8 v1, v0, 0x20

    .line 2277
    iput v1, p0, Ll/ۚ۠ܽ;->֡:I

    .line 2278
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v7, v0, 0x4

    aget v8, v1, v7

    add-int/lit8 v8, v8, 0x6

    iput v8, p0, Ll/ۚ۠ܽ;->ۧ:I

    add-int/lit8 v8, v0, 0xc

    .line 2279
    aget v1, v1, v8

    iput v1, p0, Ll/ۚ۠ܽ;->ᩳ:I

    if-eqz v2, :cond_7

    .line 2280
    invoke-direct {p0, v0, p1}, Ll/ۚ۠ܽ;->֫(IZ)Z

    move-result p1

    return p1

    .line 2281
    :cond_7
    invoke-direct {p0, v0}, Ll/ۚ۠ܽ;->ܺ(I)V

    .line 2282
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    aget v2, v1, v0

    const/4 v8, 0x4

    if-eqz v2, :cond_9

    if-eq v2, v6, :cond_9

    if-ne v2, v8, :cond_8

    goto :goto_3

    :cond_8
    const/4 v9, 0x0

    goto :goto_4

    :cond_9
    :goto_3
    const/4 v9, 0x1

    :goto_4
    if-eq p1, v9, :cond_a

    .line 2285
    invoke-direct {p0, v0}, Ll/ۚ۠ܽ;->֫(I)V

    .line 2286
    iget-object p1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    aget p1, p1, v7

    iput p1, p0, Ll/ۚ۠ܽ;->ۧ:I

    .line 2287
    iput v0, p0, Ll/ۚ۠ܽ;->֡:I

    return v4

    :cond_a
    add-int/lit8 p1, v0, 0xd

    .line 2290
    aput v5, v1, p1

    add-int/lit8 p1, v0, 0x1

    .line 2291
    aget p1, v1, p1

    iput p1, p0, Ll/ۚ۠ܽ;->۠:I

    if-ne v2, v8, :cond_b

    .line 2292
    iget p1, v3, Ll/۠۠ܽ;->ۖ:I

    goto :goto_5

    :cond_b
    add-int/2addr v0, v6

    aget p1, v1, v0

    :goto_5
    iput p1, p0, Ll/ۚ۠ܽ;->ܶ:I

    return v5

    .line 2266
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Regex condition returned without a control scope"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۖ(I)V
    .locals 3

    .line 2643
    :cond_0
    :goto_0
    iget v0, p0, Ll/ۚ۠ܽ;->᩹:I

    if-le v0, p1, :cond_3

    .line 2644
    iget-object v1, p0, Ll/ۚ۠ܽ;->᩸:[I

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Ll/ۚ۠ܽ;->᩹:I

    aget v2, v1, v2

    add-int/lit8 v0, v0, -0x2

    .line 2645
    iput v0, p0, Ll/ۚ۠ܽ;->᩹:I

    aget v0, v1, v0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    const v1, -0x7fffffff

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    if-gez v0, :cond_2

    not-int v0, v0

    const v1, -0x40000001    # -1.9999999f

    and-int/2addr v0, v1

    .line 2647
    invoke-direct {p0, v0, v2}, Ll/ۚ۠ܽ;->᩻(II)V

    goto :goto_0

    .line 2648
    :cond_2
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object v1, v1, Ll/۠۠ܽ;->ۢ:[I

    aput v2, v1, v0

    goto :goto_0

    :cond_3
    return-void
.end method

.method private ۘ(I)V
    .locals 2

    const/high16 v0, 0x40000000    # 2.0f

    and-int v1, p1, v0

    if-nez v1, :cond_0

    or-int/2addr v0, p1

    not-int v0, v0

    .line 2619
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ܿ(I)I

    move-result p1

    invoke-direct {p0, v0, p1}, Ll/ۚ۠ܽ;->ᩳ(II)V

    return-void

    .line 2618
    :cond_0
    new-instance p1, Ll/֡۠ܽ;

    invoke-direct {p1}, Ll/֡۠ܽ;-><init>()V

    throw p1
.end method

.method private ۜ(I)Z
    .locals 5

    .line 2159
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v1, p1, 0x2

    aget v2, v0, v1

    add-int/lit8 v3, p1, 0x13

    .line 2160
    aget v0, v0, v3

    add-int/2addr v0, v2

    .line 2161
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۢ(I)Ll/ۡ۠ܽ;

    move-result-object v3

    .line 2162
    invoke-direct {p0, v3, v2, v0}, Ll/ۚ۠ܽ;->֫(Ll/ۡ۠ܽ;II)V

    .line 2163
    iget-object v2, p0, Ll/ۚ۠ܽ;->ۚ:[I

    aput v0, v2, v1

    add-int/lit8 v0, p1, 0x12

    .line 2164
    aget v1, v2, v0

    const/4 v4, 0x1

    add-int/2addr v1, v4

    aput v1, v2, v0

    .line 2165
    iget v0, v3, Ll/ۡ۠ܽ;->ᩳ:I

    if-ge v1, v0, :cond_0

    const/4 v0, 0x6

    invoke-direct {p0, p1, v0, v4}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v4

    :cond_0
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->᩻(I)Z

    move-result p1

    return p1
.end method

.method private ۡ(I)V
    .locals 4

    .line 2192
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۢ(I)Ll/ۡ۠ܽ;

    move-result-object v0

    .line 2193
    iget-boolean v1, v0, Ll/ۡ۠ܽ;->֫:Z

    if-nez v1, :cond_0

    return-void

    .line 2194
    :cond_0
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v2, p1, 0x6

    aget v1, v1, v2

    .line 2195
    iget-object v2, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    if-ltz v1, :cond_1

    iget-object v3, v2, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    invoke-virtual {v3, v1}, Ll/ᩴ۠ܽ;->֫(I)V

    .line 2196
    :cond_1
    iget-object v1, v2, Ll/۠۠ܽ;->ۢ:[I

    iget v0, v0, Ll/ۡ۠ܽ;->ۧ:I

    iget-object v2, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v3, p1, 0x17

    aget v3, v2, v3

    aput v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x18

    .line 2197
    aget p1, v2, p1

    aput p1, v1, v0

    return-void
.end method

.method private ۢ(I)Ll/ۡ۠ܽ;
    .locals 2

    .line 2004
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-object v0, v0, Ll/ۢ۠ܽ;->ܺ:[Ljava/lang/Object;

    iget-object v1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 p1, p1, 0x10

    aget p1, v1, p1

    aget-object p1, v0, p1

    check-cast p1, Ll/ۡ۠ܽ;

    return-object p1
.end method

.method private ۧ(IIILl/ۧۚܽ;Ljava/lang/CharSequence;)I
    .locals 5

    :goto_0
    const/4 v0, -0x1

    if-ge p2, p3, :cond_5

    .line 2792
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    invoke-virtual {v1}, Ll/۠۠ܽ;->ۤ()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iput-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    return v0

    .line 1979
    :cond_0
    invoke-virtual {v1}, Ll/۠۠ܽ;->۫()V

    .line 1980
    invoke-static {p5, p1, p3}, Landroid/text/TextUtils;->substring(Ljava/lang/CharSequence;II)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Ljava/text/Normalizer$Form;->NFC:Ljava/text/Normalizer$Form;

    invoke-static {v2, v4}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v2

    .line 2802
    invoke-virtual {v1}, Ll/۠۠ܽ;->ۧ()Z

    move-result v4

    if-nez v4, :cond_4

    .line 2806
    iget-object v4, p0, Ll/ۚ۠ܽ;->ܳ:Ljava/lang/Thread;

    if-nez v4, :cond_1

    .line 2807
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    iput-object v4, p0, Ll/ۚ۠ܽ;->ܳ:Ljava/lang/Thread;

    .line 2808
    :cond_1
    invoke-virtual {v1, v4}, Ll/۠۠ܽ;->֫(Ljava/lang/Thread;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 1983
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->codePointCount(II)I

    move-result v0

    if-ne v0, v3, :cond_3

    invoke-virtual {v2, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v0

    invoke-interface {p4, v0}, Ll/ۧۚܽ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_3

    return p3

    .line 1986
    :cond_3
    invoke-static {p5, p3}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v0

    sub-int/2addr p3, v0

    goto :goto_0

    .line 2802
    :cond_4
    :goto_1
    iput-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    :cond_5
    return v0
.end method

.method private ۧ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I
    .locals 7

    .line 1189
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v4, v0, Ll/۠۠ܽ;->ܽ֫:I

    .line 1190
    iget v1, p2, Ll/ܽ֡ܽ;->۠:I

    if-ltz v1, :cond_0

    invoke-direct {p0, v1, p1, v4, p3}, Ll/ۚ۠ܽ;->֫(IIILjava/lang/CharSequence;)I

    move-result p1

    goto :goto_0

    .line 1191
    :cond_0
    iget v2, p2, Ll/ܽ֡ܽ;->֨:I

    if-ltz v2, :cond_1

    iget-object v5, p2, Ll/ܽ֡ܽ;->ܶ:Ll/ۧۚܽ;

    move-object v1, p0

    move v3, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Ll/ۚ۠ܽ;->֫(IIILl/ۧۚܽ;Ljava/lang/CharSequence;)I

    move-result p1

    goto :goto_0

    .line 1192
    :cond_1
    iget-object p2, p2, Ll/ܽ֡ܽ;->ۚ:Ljava/lang/Object;

    invoke-direct {p0, p1, v4, p3, p2}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;Ljava/lang/Object;)I

    move-result p1

    :goto_0
    if-ltz p1, :cond_3

    .line 1193
    iget p2, v0, Ll/۠۠ܽ;->֫:I

    const/4 p3, 0x1

    if-ne p2, p3, :cond_2

    iget p2, v0, Ll/۠۠ܽ;->ܽ֫:I

    if-ne p1, p2, :cond_3

    :cond_2
    return p1

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method private ۧ()V
    .locals 2

    .line 149
    iget-boolean v0, p0, Ll/ۚ۠ܽ;->᩵:Z

    if-nez v0, :cond_1

    .line 150
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object v0, v0, Ll/۠۠ܽ;->ܿ:Ll/֫֡ܽ;

    .line 151
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۡ:Ll/֫֡ܽ;

    if-eq v1, v0, :cond_0

    .line 152
    invoke-virtual {v0}, Ll/֫֡ܽ;->֫()Ll/ۢ۠ܽ;

    move-result-object v1

    .line 153
    iput-object v1, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    .line 154
    iput-object v0, p0, Ll/ۚ۠ܽ;->ۡ:Ll/֫֡ܽ;

    .line 155
    sget-object v0, Ll/ۚ۠ܽ;->᩶:[I

    iput-object v0, p0, Ll/ۚ۠ܽ;->ۖ:[I

    :cond_0
    const/4 v0, 0x1

    .line 234
    iput-boolean v0, p0, Ll/ۚ۠ܽ;->᩵:Z

    const/4 v0, 0x0

    .line 235
    iput-boolean v0, p0, Ll/ۚ۠ܽ;->֫:Z

    return-void

    .line 149
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Regex matcher is already executing"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ۧ(III)V
    .locals 12

    .line 2066
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۢ(I)Ll/ۡ۠ܽ;

    move-result-object v0

    .line 2067
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v2, p1, 0xd

    const/4 v3, 0x1

    aput v3, v1, v2

    add-int/lit8 v2, p1, 0xc

    .line 2068
    aget v2, v1, v2

    iput v2, p0, Ll/ۚ۠ܽ;->ᩳ:I

    .line 2069
    iget v2, v0, Ll/ۡ۠ܽ;->ܽ:I

    iget v0, v0, Ll/ۡ۠ܽ;->ᩳ:I

    const/4 v4, 0x0

    if-gez v2, :cond_0

    if-lt p3, v0, :cond_0

    add-int/lit8 p3, p1, 0x11

    .line 2070
    aget p3, v1, p3

    invoke-direct {p0, p1, p3, v4}, Ll/ۚ۠ܽ;->֫(IIZ)V

    .line 2071
    iput p2, p0, Ll/ۚ۠ܽ;->ܶ:I

    return-void

    :cond_0
    add-int/lit8 v2, p1, 0x10

    .line 2074
    aget v6, v1, v2

    add-int/lit8 v2, p1, 0x3

    aget v7, v1, v2

    add-int/2addr p1, v3

    aget v8, v1, p1

    const/4 v11, 0x1

    move-object v5, p0

    move v9, p2

    move v10, p3

    invoke-direct/range {v5 .. v11}, Ll/ۚ۠ܽ;->֫(IIIIIZ)I

    move-result p1

    if-ge p3, v0, :cond_1

    const/4 p2, 0x5

    .line 2076
    invoke-direct {p0, p1, p2, v3}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return-void

    .line 2179
    :cond_1
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۡ(I)V

    const/16 p2, 0x9

    .line 2180
    invoke-direct {p0, p1, p2, v4}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return-void
.end method

.method private ۧ(Z)V
    .locals 6

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    .line 319
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ۖ(I)V

    .line 2369
    iget p1, p0, Ll/ۚ۠ܽ;->֡:I

    :goto_0
    add-int/lit8 p1, p1, -0x20

    if-ltz p1, :cond_0

    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->֫(I)V

    goto :goto_0

    .line 2370
    :cond_0
    iput v1, p0, Ll/ۚ۠ܽ;->֡:I

    .line 2371
    iput v0, p0, Ll/ۚ۠ܽ;->ᩳ:I

    .line 322
    :cond_1
    iput v1, p0, Ll/ۚ۠ܽ;->᩹:I

    iput v1, p0, Ll/ۚ۠ܽ;->ۧ:I

    .line 323
    iput v1, p0, Ll/ۚ۠ܽ;->֡:I

    .line 324
    iput v0, p0, Ll/ۚ۠ܽ;->ᩳ:I

    .line 325
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ܽ()J

    move-result-wide v2

    const-wide/32 v4, 0x10000

    cmp-long p1, v2, v4

    if-lez p1, :cond_2

    .line 2841
    sget-object p1, Ll/ۚ۠ܽ;->᩶:[I

    iput-object p1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    iput-object p1, p0, Ll/ۚ۠ܽ;->ᩴ:[I

    iput-object p1, p0, Ll/ۚ۠ܽ;->᩸:[I

    iput-object p1, p0, Ll/ۚ۠ܽ;->ܽ:[I

    iput-object p1, p0, Ll/ۚ۠ܽ;->ۖ:[I

    .line 2842
    sget-object p1, Ll/ۚ۠ܽ;->ۙ:[J

    iput-object p1, p0, Ll/ۚ۠ܽ;->ۘ:[J

    .line 2843
    iput-object p1, p0, Ll/ۚ۠ܽ;->᩷:[J

    .line 2844
    iput v1, p0, Ll/ۚ۠ܽ;->᩻:I

    .line 2845
    iput v1, p0, Ll/ۚ۠ܽ;->֡:I

    .line 2846
    iput v0, p0, Ll/ۚ۠ܽ;->ᩳ:I

    :cond_2
    return-void
.end method

.method private ۧ(I)Z
    .locals 4

    .line 438
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-boolean v1, v0, Ll/۠۠ܽ;->۫:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v3, v1, Ll/ۢ۠ܽ;->᩷:Z

    if-nez v3, :cond_0

    iget-boolean v3, v1, Ll/ۢ۠ܽ;->ۜ:Z

    if-nez v3, :cond_0

    iget-boolean v1, v1, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v1, :cond_1

    .line 2654
    :cond_0
    invoke-direct {p0, v2}, Ll/ۚ۠ܽ;->ܳ(I)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    .line 440
    :cond_1
    iget-object v1, v0, Ll/۠۠ܽ;->ۢ:[I

    aput p1, v1, v2

    iput p1, v0, Ll/۠۠ܽ;->᩻:I

    .line 441
    iget p1, v0, Ll/۠۠ܽ;->ۖ:I

    const/4 v0, 0x1

    aput p1, v1, v0

    return v0
.end method

.method private ۧ(II)Z
    .locals 7

    .line 2733
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v0, v0, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object v0, v0, Ll/۠۠ܽ;->֨:[Ll/᩺ۤۡ;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2734
    :cond_0
    iget-object v0, p0, Ll/ۚ۠ܽ;->᩷:[J

    array-length v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2735
    :cond_1
    iget v1, p0, Ll/ۚ۠ܽ;->ۜ:I

    int-to-long v3, p1

    const/16 p1, 0x20

    shl-long/2addr v3, p1

    int-to-long p1, p2

    const-wide/16 v5, 0x1

    add-long/2addr p1, v5

    or-long/2addr p1, v3

    .line 2737
    invoke-direct {p0, v0, p1, p2}, Ll/ۚ۠ܽ;->֫([JJ)I

    move-result v0

    .line 2738
    iget-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    if-nez v3, :cond_2

    iget v3, p0, Ll/ۚ۠ܽ;->ۜ:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/ۚ۠ܽ;->᩷:[J

    aget-wide v0, v1, v0

    cmp-long v3, v0, p1

    if-nez v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v2
.end method

.method private ۧ(IILjava/lang/CharSequence;)Z
    .locals 26

    move-object/from16 v6, p0

    .line 1376
    iget-object v0, v6, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-object v7, v0, Ll/ۢ۠ܽ;->ܿ:[I

    .line 1377
    iget-object v8, v0, Ll/ۢ۠ܽ;->ܺ:[Ljava/lang/Object;

    const/4 v0, 0x0

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v4, p3

    move-object v3, v6

    const/4 v2, 0x0

    :goto_0
    const/4 v5, 0x0

    const/4 v9, 0x0

    move/from16 v16, v0

    move v9, v1

    move-object v5, v4

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 2792
    :goto_1
    iget-object v4, v3, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    invoke-virtual {v4}, Ll/۠۠ܽ;->ۤ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, v3, Ll/ۚ۠ܽ;->֫:Z

    return v2

    .line 1381
    :cond_0
    iget v0, v4, Ll/۠۠ܽ;->ܽ֫:I

    add-int/lit8 v2, v16, 0x1

    .line 1382
    aget v19, v7, v2

    .line 1383
    aget v10, v7, v16

    const/16 v11, 0x2a

    const/16 v20, 0x0

    if-eq v10, v11, :cond_b0

    const/16 v11, 0xa

    const/16 v12, 0xc

    const/4 v13, -0x1

    const/4 v14, -0x2

    packed-switch v10, :pswitch_data_0

    move-object v1, v6

    .line 1880
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Invalid regex opcode"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1394
    :pswitch_0
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 707
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ne v9, v0, :cond_1

    goto/16 :goto_12

    :cond_1
    if-eqz v9, :cond_32

    add-int/lit8 v0, v9, -0x1

    .line 713
    invoke-interface {v5, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    move-result v2

    if-eqz v2, :cond_3

    if-le v9, v1, :cond_2

    add-int/lit8 v1, v9, -0x2

    .line 714
    invoke-interface {v5, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x5c

    if-eq v1, v2, :cond_3

    :cond_2
    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    .line 715
    :goto_2
    invoke-interface {v5, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-interface {v5, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-ne v0, v2, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    .line 717
    :goto_3
    invoke-interface {v5, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    move-result v2

    if-eqz v2, :cond_5

    if-nez v1, :cond_52

    goto/16 :goto_12

    :cond_5
    if-nez v0, :cond_52

    goto/16 :goto_12

    :pswitch_1
    if-lt v9, v0, :cond_6

    .line 1568
    iput-boolean v1, v4, Ll/۠۠ܽ;->ܺ:Z

    goto/16 :goto_26

    :cond_6
    add-int/lit8 v0, v16, 0x2

    .line 1571
    aget v0, v7, v0

    aget-object v0, v8, v0

    check-cast v0, Ll/ۧۚܽ;

    .line 1572
    invoke-static {v5, v9}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    .line 1573
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v10

    add-int v15, v10, v9

    .line 1575
    iget v10, v4, Ll/۠۠ܽ;->ܽ֫:I

    invoke-static {v5, v9, v10, v4}, Ll/ۗ۠ܽ;->֫(Ljava/lang/CharSequence;IILl/ۙ۠ܽ;)I

    move-result v13

    if-ne v13, v14, :cond_7

    .line 1577
    iput-boolean v1, v3, Ll/ۚ۠ܽ;->֫:Z

    return v20

    :cond_7
    if-ne v15, v13, :cond_8

    .line 1581
    invoke-interface {v0, v2}, Ll/ۧۚܽ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_2c

    goto/16 :goto_26

    :cond_8
    move-object v10, v3

    move v11, v9

    move v12, v15

    move-object v14, v0

    move v0, v15

    move-object v15, v5

    .line 1584
    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->ۧ(IIILl/ۧۚܽ;Ljava/lang/CharSequence;)I

    move-result v1

    .line 1585
    iget-boolean v2, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v2, :cond_9

    goto/16 :goto_10

    :cond_9
    if-gez v1, :cond_a

    goto/16 :goto_26

    :cond_a
    const/16 v11, 0x9

    move-object v10, v3

    move/from16 v12, v16

    move v13, v9

    move v14, v0

    move v15, v1

    .line 1588
    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    move v13, v1

    goto/16 :goto_f

    :pswitch_2
    const/16 v2, 0x24

    if-ne v10, v2, :cond_c

    if-ge v9, v0, :cond_b

    .line 15
    invoke-static {v5, v9, v0, v4}, Ll/ۗ۠ܽ;->֫(Ljava/lang/CharSequence;IILl/ۙ۠ܽ;)I

    move-result v0

    move v9, v0

    goto :goto_6

    .line 17
    :cond_b
    iput-boolean v1, v4, Ll/۠۠ܽ;->ܺ:Z

    const/4 v0, -0x1

    goto :goto_4

    .line 22
    :cond_c
    iget v2, v4, Ll/۠۠ܽ;->ۜ:I

    .line 24
    iget-boolean v10, v4, Ll/۠۠ܽ;->ᩳ֫:Z

    if-eqz v10, :cond_d

    .line 961
    iget-object v0, v4, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x0

    :cond_d
    if-ne v9, v2, :cond_e

    goto :goto_6

    :cond_e
    if-ge v9, v0, :cond_13

    add-int/lit8 v2, v9, -0x1

    .line 31
    invoke-interface {v5, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-interface {v5, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    invoke-static {v2, v10}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v2

    .line 33
    invoke-virtual {v4}, Ll/۠۠ܽ;->ۤ()Z

    move-result v10

    if-nez v10, :cond_12

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v10

    if-eqz v10, :cond_f

    goto :goto_5

    :cond_f
    if-eqz v2, :cond_10

    goto :goto_4

    .line 36
    :cond_10
    invoke-virtual {v4}, Ll/۠۠ܽ;->ۚ()I

    move-result v2

    invoke-static {v5, v2, v0, v4}, Ll/ۗ۠ܽ;->֫(Ljava/lang/CharSequence;IILl/ۙ۠ܽ;)I

    move-result v0

    if-ne v0, v14, :cond_11

    goto :goto_5

    :cond_11
    if-le v0, v9, :cond_14

    :goto_4
    const/4 v9, -0x1

    goto :goto_6

    :cond_12
    :goto_5
    const/4 v9, -0x2

    goto :goto_6

    .line 40
    :cond_13
    iput-boolean v1, v4, Ll/۠۠ܽ;->ܺ:Z

    .line 41
    iput-boolean v1, v4, Ll/۠۠ܽ;->ۤ:Z

    :cond_14
    :goto_6
    if-ne v9, v14, :cond_15

    .line 1486
    iput-boolean v1, v3, Ll/ۚ۠ܽ;->֫:Z

    return v20

    :cond_15
    if-ne v9, v13, :cond_16

    goto/16 :goto_26

    :cond_16
    :goto_7
    move v13, v9

    goto/16 :goto_f

    :pswitch_3
    if-lt v9, v0, :cond_17

    .line 1454
    iput-boolean v1, v4, Ll/۠۠ܽ;->ܺ:Z

    goto/16 :goto_26

    .line 1457
    :cond_17
    invoke-interface {v5, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-eq v0, v11, :cond_1b

    const/16 v2, 0xb

    if-eq v0, v2, :cond_1b

    if-eq v0, v12, :cond_1b

    const/16 v2, 0x85

    if-eq v0, v2, :cond_1b

    const/16 v2, 0x2028

    if-eq v0, v2, :cond_1b

    const/16 v2, 0x2029

    if-ne v0, v2, :cond_18

    goto :goto_8

    :cond_18
    const/16 v2, 0xd

    if-eq v0, v2, :cond_19

    goto/16 :goto_26

    :cond_19
    add-int/lit8 v13, v9, 0x1

    .line 1466
    iget v0, v4, Ll/۠۠ܽ;->ܽ֫:I

    if-ge v13, v0, :cond_1a

    .line 1467
    invoke-interface {v5, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-ne v0, v11, :cond_2c

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v11, 0x0

    move-object v10, v3

    move/from16 v12, v19

    .line 1468
    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    add-int/lit8 v9, v9, 0x2

    goto :goto_7

    .line 1474
    :cond_1a
    iput-boolean v1, v4, Ll/۠۠ܽ;->ܺ:Z

    goto/16 :goto_f

    :cond_1b
    :goto_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :pswitch_4
    add-int/lit8 v2, v16, 0x2

    .line 1495
    aget v2, v7, v2

    add-int/lit8 v16, v16, 0x3

    aget v10, v7, v16

    .line 18
    iget-object v11, v4, Ll/۠۠ܽ;->ۢ:[I

    aget v12, v11, v2

    add-int/2addr v2, v1

    .line 19
    aget v2, v11, v2

    sub-int/2addr v2, v12

    if-gez v12, :cond_1c

    goto/16 :goto_c

    :cond_1c
    add-int v11, v9, v2

    if-le v11, v0, :cond_1d

    .line 23
    iput-boolean v1, v4, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_c

    :cond_1d
    if-nez v10, :cond_20

    const/4 v0, 0x0

    :goto_9
    if-ge v0, v2, :cond_27

    add-int v1, v9, v0

    .line 29
    invoke-interface {v5, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    add-int v10, v12, v0

    invoke-interface {v5, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-eq v1, v10, :cond_1e

    goto :goto_c

    .line 30
    :cond_1e
    invoke-virtual {v4}, Ll/۠۠ܽ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_d

    :cond_1f
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_20
    if-eq v10, v1, :cond_22

    const/4 v0, 0x2

    if-ne v10, v0, :cond_21

    goto :goto_a

    .line 35
    :cond_21
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown regex back-reference mode: "

    .line 0
    invoke-static {v10, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    :goto_a
    const/4 v0, 0x0

    :goto_b
    if-ge v0, v2, :cond_27

    .line 41
    invoke-static {v5, v9}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    .line 42
    invoke-static {v5, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v13

    if-eq v1, v13, :cond_24

    const/4 v14, 0x2

    if-ne v10, v14, :cond_23

    .line 45
    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v14

    .line 46
    invoke-static {v13}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v15

    if-eq v14, v15, :cond_24

    .line 48
    invoke-static {v14}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v14

    invoke-static {v15}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v15

    if-eq v14, v15, :cond_24

    goto :goto_c

    .line 49
    :cond_23
    invoke-static {v1}, Ll/᩹۠ܽ;->ᩳ(I)I

    move-result v14

    invoke-static {v13}, Ll/᩹۠ܽ;->ᩳ(I)I

    move-result v15

    if-eq v14, v15, :cond_24

    :goto_c
    const/4 v0, -0x2

    const/4 v11, -0x1

    goto :goto_e

    .line 51
    :cond_24
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v14

    add-int/2addr v9, v14

    .line 52
    invoke-static {v13}, Ljava/lang/Character;->charCount(I)I

    move-result v13

    add-int/2addr v12, v13

    const/high16 v13, 0x10000

    if-lt v1, v13, :cond_25

    add-int/lit8 v2, v2, -0x1

    .line 54
    :cond_25
    invoke-virtual {v4}, Ll/۠۠ܽ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_26

    :goto_d
    const/4 v0, -0x2

    const/4 v11, -0x2

    goto :goto_e

    :cond_26
    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_27
    const/4 v0, -0x2

    :goto_e
    if-ne v11, v0, :cond_28

    const/4 v0, 0x1

    .line 1497
    iput-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    return v20

    :cond_28
    if-gez v11, :cond_29

    goto/16 :goto_26

    :cond_29
    move v13, v11

    goto :goto_f

    :pswitch_5
    add-int/lit8 v0, v16, 0x2

    .line 1599
    aget v0, v7, v0

    aget-object v0, v8, v0

    check-cast v0, [I

    add-int/lit8 v16, v16, 0x3

    aget v1, v7, v16

    invoke-static {v0, v1, v4, v5, v9}, Ll/֨۠ܽ;->֫([IILl/۠۠ܽ;Ljava/lang/CharSequence;I)I

    move-result v0

    const/4 v1, -0x2

    if-ne v0, v1, :cond_2a

    const/4 v0, 0x1

    .line 1601
    iput-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    return v20

    :cond_2a
    const/4 v1, -0x1

    if-ne v0, v1, :cond_2b

    goto/16 :goto_26

    :cond_2b
    move v13, v0

    :cond_2c
    :goto_f
    move-object v1, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move v9, v13

    goto/16 :goto_51

    :pswitch_6
    add-int/lit8 v0, v16, 0x3

    .line 1733
    aget v0, v7, v0

    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->ܿ(I)I

    move-result v0

    if-le v9, v0, :cond_32

    .line 1734
    invoke-direct {v3}, Ll/ۚ۠ܽ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_2d

    :goto_10
    move-object v1, v6

    goto/16 :goto_50

    :cond_2d
    add-int/lit8 v0, v16, 0x2

    .line 1736
    aget v1, v7, v0

    invoke-direct {v3, v1}, Ll/ۚ۠ܽ;->ܿ(I)I

    move-result v1

    add-int/lit8 v2, v16, 0x4

    .line 1737
    aget v2, v7, v2

    if-ge v1, v2, :cond_2e

    .line 1738
    aget v0, v7, v0

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v3, v0, v1}, Ll/ۚ۠ܽ;->ܳ(II)V

    add-int/lit8 v16, v16, 0x6

    .line 1739
    aget v16, v7, v16

    const/4 v2, 0x0

    goto/16 :goto_1

    :cond_2e
    add-int/lit8 v2, v16, 0x5

    .line 1742
    aget v2, v7, v2

    if-ge v1, v2, :cond_32

    add-int/lit8 v16, v16, 0x6

    .line 1743
    aget v12, v7, v16

    aget v14, v7, v0

    add-int/lit8 v15, v1, 0x1

    const/16 v11, 0x8

    move-object v10, v3

    move v13, v9

    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    move-object/from16 v5, p3

    goto :goto_12

    .line 1723
    :pswitch_7
    iget-object v0, v3, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v0, v0, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v0, :cond_2f

    add-int/lit8 v0, v16, 0x2

    aget v0, v7, v0

    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->ۘ(I)V

    :cond_2f
    add-int/lit8 v0, v16, 0x4

    .line 1724
    aget v0, v7, v0

    if-lez v0, :cond_31

    add-int/lit8 v0, v16, 0x2

    .line 1725
    aget v0, v7, v0

    .line 2613
    iget-object v1, v3, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v1, v1, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v1, :cond_30

    const/4 v1, 0x1

    invoke-direct {v3, v0, v1}, Ll/ۚ۠ܽ;->᩻(II)V

    goto :goto_11

    :cond_30
    const/4 v1, 0x1

    .line 2614
    invoke-direct {v3, v0, v1}, Ll/ۚ۠ܽ;->ܳ(II)V

    :goto_11
    add-int/lit8 v16, v16, 0x6

    .line 1726
    aget v0, v7, v16

    goto/16 :goto_23

    :cond_31
    add-int/lit8 v0, v16, 0x5

    .line 1728
    aget v0, v7, v0

    if-lez v0, :cond_32

    add-int/lit8 v0, v16, 0x6

    aget v12, v7, v0

    add-int/lit8 v16, v16, 0x2

    aget v14, v7, v16

    const/4 v15, 0x1

    const/16 v11, 0x8

    move-object v10, v3

    move v13, v9

    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    :cond_32
    :goto_12
    move-object v1, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    goto/16 :goto_51

    .line 1993
    :pswitch_8
    iget-object v0, v3, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-object v0, v0, Ll/ۢ۠ܽ;->ܿ:[I

    add-int/lit8 v1, v16, 0x2

    .line 1994
    aget v11, v0, v1

    add-int/lit8 v16, v16, 0x3

    aget v12, v0, v16

    aget v13, v0, v2

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v10, v3

    move v14, v9

    invoke-direct/range {v10 .. v16}, Ll/ۚ۠ܽ;->֫(IIIIIZ)I

    move-result v0

    .line 1995
    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->ۢ(I)Ll/ۡ۠ܽ;

    move-result-object v1

    .line 1996
    iget-boolean v2, v1, Ll/ۡ۠ܽ;->ܳ:Z

    if-eqz v2, :cond_35

    .line 1997
    iget-object v1, v1, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    sget-object v2, Ll/֫֨ܽ;->ۙ:Ll/֫֨ܽ;

    if-ne v1, v2, :cond_33

    const/16 v9, 0xc

    goto :goto_13

    :cond_33
    const/16 v9, 0xa

    :goto_13
    if-eq v1, v2, :cond_34

    const/4 v1, 0x1

    goto :goto_14

    :cond_34
    const/4 v1, 0x0

    :goto_14
    invoke-direct {v3, v0, v9, v1}, Ll/ۚ۠ܽ;->֫(IIZ)V

    goto :goto_15

    .line 2000
    :cond_35
    iget v1, v1, Ll/ۡ۠ܽ;->ܿ:I

    if-lez v1, :cond_36

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v3, v0, v2, v1}, Ll/ۚ۠ܽ;->֫(IIZ)V

    :goto_15
    const/4 v0, 0x1

    goto :goto_16

    :cond_36
    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->᩷(I)Z

    move-result v0

    :goto_16
    if-nez v0, :cond_37

    .line 1410
    iget-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v0, :cond_52

    goto :goto_17

    .line 1413
    :cond_37
    iget v0, v3, Ll/ۚ۠ܽ;->۠:I

    .line 1414
    iget v9, v3, Ll/ۚ۠ܽ;->ܶ:I

    goto/16 :goto_23

    .line 1439
    :pswitch_9
    iget v0, v4, Ll/۠۠ܽ;->۠:I

    if-eq v9, v0, :cond_38

    goto/16 :goto_26

    :cond_38
    const/4 v0, 0x1

    .line 1440
    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->֫(Z)Z

    move-result v0

    if-nez v0, :cond_39

    .line 1441
    iget-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v0, :cond_52

    :goto_17
    goto :goto_18

    .line 1445
    :cond_39
    iget v0, v3, Ll/ۚ۠ܽ;->۠:I

    .line 1446
    iget v9, v3, Ll/ۚ۠ܽ;->ܶ:I

    goto/16 :goto_23

    .line 1427
    :pswitch_a
    iget-object v0, v4, Ll/۠۠ܽ;->ۢ:[I

    iget v1, v4, Ll/۠۠ܽ;->᩻:I

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 1428
    invoke-virtual {v4, v9}, Ll/۠۠ܽ;->ܳ(I)V

    const/4 v1, 0x1

    aput v9, v0, v1

    .line 1429
    invoke-direct {v3, v1}, Ll/ۚ۠ܽ;->֫(Z)Z

    move-result v0

    if-nez v0, :cond_3a

    .line 1430
    iget-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v0, :cond_52

    :goto_18
    move-object v1, v6

    goto/16 :goto_4f

    .line 1434
    :cond_3a
    iget v0, v3, Ll/ۚ۠ܽ;->۠:I

    .line 1435
    iget v9, v3, Ll/ۚ۠ܽ;->ܶ:I

    goto/16 :goto_23

    .line 2217
    :pswitch_b
    iget-object v0, v3, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-object v0, v0, Ll/ۢ۠ܽ;->ܿ:[I

    add-int/lit8 v1, v16, 0x2

    .line 2218
    aget v1, v0, v1

    const/4 v10, 0x2

    if-eq v1, v10, :cond_3c

    const/4 v10, 0x3

    if-ne v1, v10, :cond_3b

    goto :goto_19

    :cond_3b
    const/4 v10, 0x0

    const/16 v19, 0x0

    goto :goto_1a

    :cond_3c
    :goto_19
    const/4 v10, 0x1

    const/16 v19, 0x1

    :goto_1a
    add-int/lit8 v10, v16, 0x6

    .line 2220
    aget v10, v0, v10

    if-eqz v10, :cond_3d

    const/4 v10, 0x1

    goto :goto_1b

    :cond_3d
    const/4 v10, 0x0

    :goto_1b
    if-eqz v19, :cond_43

    add-int/lit8 v11, v16, 0x5

    if-eqz v10, :cond_3e

    .line 2223
    aget v11, v0, v11

    neg-int v11, v11

    invoke-direct {v3, v9, v11, v5}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v11

    goto :goto_1c

    :cond_3e
    aget v11, v0, v11

    .line 2224
    :goto_1c
    iget-boolean v12, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v12, :cond_3f

    goto :goto_1e

    :cond_3f
    add-int/lit8 v12, v16, 0x4

    if-eqz v10, :cond_40

    .line 2225
    aget v12, v0, v12

    neg-int v12, v12

    invoke-direct {v3, v9, v12, v5}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v12

    goto :goto_1d

    :cond_40
    aget v12, v0, v12

    .line 2226
    :goto_1d
    iget-boolean v13, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v13, :cond_41

    :goto_1e
    const/4 v0, 0x0

    goto/16 :goto_22

    :cond_41
    sub-int v11, v9, v11

    .line 2227
    iget-boolean v13, v4, Ll/۠۠ܽ;->ᩳ֫:Z

    if-eqz v13, :cond_42

    const/4 v13, 0x0

    goto :goto_1f

    :cond_42
    iget v13, v4, Ll/۠۠ܽ;->ۜ:I

    :goto_1f
    invoke-static {v11, v13}, Ljava/lang/Math;->max(II)I

    move-result v11

    sub-int v12, v9, v12

    move v15, v11

    move v14, v12

    goto :goto_20

    :cond_43
    move v14, v9

    move v15, v14

    .line 2230
    :goto_20
    invoke-direct {v3}, Ll/ۚ۠ܽ;->ܿ()V

    .line 2231
    iget v13, v3, Ll/ۚ۠ܽ;->֡:I

    .line 2232
    iget-object v11, v3, Ll/ۚ۠ܽ;->ۚ:[I

    aput v1, v11, v13

    add-int/lit8 v12, v13, 0x1

    .line 2233
    aget v2, v0, v2

    aput v2, v11, v12

    add-int/lit8 v2, v13, 0x2

    .line 2234
    aput v9, v11, v2

    add-int/lit8 v2, v13, 0x3

    add-int/lit8 v16, v16, 0x3

    .line 2235
    aget v0, v0, v16

    aput v0, v11, v2

    add-int/lit8 v0, v13, 0x4

    .line 2236
    iget v12, v3, Ll/ۚ۠ܽ;->ۧ:I

    aput v12, v11, v0

    add-int/lit8 v0, v13, 0x5

    .line 2237
    iget v12, v3, Ll/ۚ۠ܽ;->᩹:I

    aput v12, v11, v0

    add-int/lit8 v0, v13, 0x6

    .line 2238
    iget-boolean v12, v4, Ll/۠۠ܽ;->۫:Z

    if-eqz v12, :cond_44

    iget-object v12, v4, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    .line 43
    iget-object v12, v12, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    goto :goto_21

    :cond_44
    const/4 v12, -0x1

    .line 2238
    :goto_21
    aput v12, v11, v0

    .line 2239
    iget-object v0, v3, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v11, v13, 0x7

    iget v12, v4, Ll/۠۠ܽ;->ܽ֫:I

    aput v12, v0, v11

    add-int/lit8 v11, v13, 0x8

    .line 2240
    iget v12, v4, Ll/۠۠ܽ;->ۜ:I

    aput v12, v0, v11

    add-int/lit8 v11, v13, 0x9

    .line 2241
    iget v12, v4, Ll/۠۠ܽ;->۠:I

    aput v12, v0, v11

    add-int/lit8 v11, v13, 0xa

    .line 2242
    aput v14, v0, v11

    add-int/lit8 v11, v13, 0xb

    .line 2243
    aput v15, v0, v11

    add-int/lit8 v11, v13, 0xc

    .line 2244
    iget v12, v3, Ll/ۚ۠ܽ;->ᩳ:I

    aput v12, v0, v11

    add-int/lit8 v11, v13, 0xd

    const/4 v12, 0x0

    .line 2245
    aput v12, v0, v11

    add-int/lit8 v11, v13, 0xe

    .line 2246
    aput v10, v0, v11

    .line 2247
    iget v0, v3, Ll/ۚ۠ܽ;->֡:I

    add-int/lit8 v0, v0, 0x20

    iput v0, v3, Ll/ۚ۠ܽ;->֡:I

    const/4 v0, 0x0

    const/4 v11, 0x7

    move-object v10, v3

    move/from16 p1, v13

    move v13, v9

    move/from16 v21, v14

    move/from16 v14, p1

    move v6, v15

    move v15, v0

    .line 2248
    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    move/from16 v0, p1

    .line 2249
    iput v0, v3, Ll/ۚ۠ܽ;->ᩳ:I

    if-eqz v19, :cond_46

    .line 2251
    iput v9, v4, Ll/۠۠ܽ;->۠:I

    .line 2252
    iget-boolean v0, v4, Ll/۠۠ܽ;->ᩳ֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_45

    iput v1, v4, Ll/۠۠ܽ;->ۜ:I

    :cond_45
    move/from16 v12, v21

    if-ge v12, v6, :cond_48

    .line 2253
    invoke-direct {v3, v1}, Ll/ۚ۠ܽ;->֫(Z)Z

    move-result v0

    goto :goto_22

    :cond_46
    move/from16 v12, v21

    const/4 v0, 0x4

    if-eq v1, v0, :cond_48

    .line 2255
    iget-boolean v0, v4, Ll/۠۠ܽ;->ᩳ֫:Z

    if-eqz v0, :cond_47

    .line 961
    iget-object v0, v4, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 2255
    iput v0, v4, Ll/۠۠ܽ;->ܽ֫:I

    :cond_47
    const/4 v0, 0x1

    if-ne v1, v0, :cond_48

    .line 2256
    iget v1, v4, Ll/۠۠ܽ;->ܽ֫:I

    if-lt v9, v1, :cond_48

    iput-boolean v0, v4, Ll/۠۠ܽ;->ۤ:Z

    .line 2258
    :cond_48
    iget-object v0, v3, Ll/ۚ۠ܽ;->ۚ:[I

    aget v0, v0, v2

    iput v0, v3, Ll/ۚ۠ܽ;->۠:I

    .line 2259
    iput v12, v3, Ll/ۚ۠ܽ;->ܶ:I

    const/4 v0, 0x1

    :goto_22
    if-nez v0, :cond_49

    .line 1418
    iget-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v0, :cond_52

    goto :goto_24

    .line 1422
    :cond_49
    iget v0, v3, Ll/ۚ۠ܽ;->۠:I

    .line 1423
    iget v9, v3, Ll/ۚ۠ܽ;->ܶ:I

    :goto_23
    move-object/from16 v1, p0

    move/from16 v16, v0

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    goto/16 :goto_52

    :pswitch_c
    add-int/lit8 v16, v16, 0x2

    .line 1533
    aget v1, v7, v16

    aget-object v1, v8, v1

    check-cast v1, Ll/ۤ᩵ܽ;

    invoke-direct {v3, v1, v5, v9, v0}, Ll/ۚ۠ܽ;->֫(Ll/ۤ᩵ܽ;Ljava/lang/CharSequence;II)I

    move-result v0

    .line 1534
    iget-boolean v1, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v1, :cond_4a

    goto :goto_24

    :cond_4a
    if-gez v0, :cond_4b

    goto/16 :goto_26

    .line 1536
    :cond_4b
    iget-object v1, v4, Ll/۠۠ܽ;->ۢ:[I

    iget v2, v4, Ll/۠۠ܽ;->᩻:I

    const/4 v3, 0x0

    aput v2, v1, v3

    .line 1537
    invoke-virtual {v4, v0}, Ll/۠۠ܽ;->ܳ(I)V

    const/4 v2, 0x1

    aput v0, v1, v2

    return v2

    :pswitch_d
    add-int/lit8 v16, v16, 0x2

    .line 1525
    aget v1, v7, v16

    aget-object v1, v8, v1

    check-cast v1, Ll/ۘ۠ܽ;

    invoke-direct {v3, v1, v5, v9, v0}, Ll/ۚ۠ܽ;->֫(Ll/ۘ۠ܽ;Ljava/lang/CharSequence;II)I

    move-result v0

    .line 1526
    iget-boolean v1, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v1, :cond_4c

    goto :goto_24

    :cond_4c
    if-gez v0, :cond_4d

    goto :goto_26

    .line 1528
    :cond_4d
    iget-object v1, v4, Ll/۠۠ܽ;->ۢ:[I

    iget v2, v4, Ll/۠۠ܽ;->᩻:I

    const/4 v3, 0x0

    aput v2, v1, v3

    .line 1529
    invoke-virtual {v4, v0}, Ll/۠۠ܽ;->ܳ(I)V

    const/4 v2, 0x1

    aput v0, v1, v2

    return v2

    :pswitch_e
    add-int/lit8 v16, v16, 0x2

    .line 1516
    aget v1, v7, v16

    aget-object v1, v8, v1

    check-cast v1, Ll/۬᩵ܽ;

    .line 1517
    invoke-direct {v3, v1, v5, v9, v0}, Ll/ۚ۠ܽ;->֫(Ll/۬᩵ܽ;Ljava/lang/CharSequence;II)I

    move-result v0

    .line 1518
    iget-boolean v1, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v1, :cond_4e

    :goto_24
    move-object/from16 v1, p0

    goto/16 :goto_4f

    :cond_4e
    if-gez v0, :cond_4f

    goto :goto_26

    .line 1520
    :cond_4f
    iget-object v1, v4, Ll/۠۠ܽ;->ۢ:[I

    iget v2, v4, Ll/۠۠ܽ;->᩻:I

    const/4 v3, 0x0

    aput v2, v1, v3

    .line 1521
    invoke-virtual {v4, v0}, Ll/۠۠ܽ;->ܳ(I)V

    const/4 v2, 0x1

    aput v0, v1, v2

    return v2

    :pswitch_f
    add-int/lit8 v0, v16, 0x2

    .line 1510
    aget v1, v7, v0

    add-int/lit8 v16, v16, 0x3

    aget v2, v7, v16

    if-eqz v2, :cond_50

    const/4 v2, 0x1

    goto :goto_25

    :cond_50
    const/4 v2, 0x0

    :goto_25
    invoke-static {v1, v2, v4, v9, v5}, Ll/᩸۠ܽ;->֫(IZLl/۠۠ܽ;ILjava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_51

    goto :goto_26

    .line 1512
    :cond_51
    aget v0, v7, v0

    if-nez v0, :cond_53

    const/high16 v0, -0x80000000

    invoke-direct {v3, v0, v9}, Ll/ۚ۠ܽ;->ᩳ(II)V

    goto :goto_27

    :pswitch_10
    add-int/lit8 v16, v16, 0x2

    .line 1506
    aget v0, v7, v16

    aget-object v0, v8, v0

    check-cast v0, Ll/ۗ᩵ܽ;

    invoke-static {v0, v4, v9, v5}, Ll/᩸۠ܽ;->֫(Ll/ۗ᩵ܽ;Ll/۠۠ܽ;ILjava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_53

    :cond_52
    :goto_26
    move-object/from16 v1, p0

    move-object v15, v4

    move-object v6, v5

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    goto/16 :goto_4a

    :cond_53
    :goto_27
    move-object v6, v5

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    goto/16 :goto_41

    :pswitch_11
    add-int/lit8 v1, v16, 0x2

    .line 1836
    aget v1, v7, v1

    aget-object v1, v8, v1

    check-cast v1, Ll/ᩳ֡ܽ;

    add-int/lit8 v2, v16, 0x3

    .line 1839
    aget v2, v7, v2

    if-eqz v2, :cond_68

    add-int/lit8 v19, v19, 0x2

    .line 1840
    aget v2, v7, v19

    aget-object v2, v8, v2

    .line 2506
    iget v6, v1, Ll/ᩳ֡ܽ;->ᩳ:I

    iget v10, v1, Ll/ᩳ֡ܽ;->ۧ:I

    if-eqz v6, :cond_56

    add-int/lit8 v11, v10, 0x1

    mul-int v11, v11, v6

    .line 2509
    iget-object v12, v3, Ll/ۚ۠ܽ;->ۘ:[J

    array-length v13, v12

    if-ge v13, v11, :cond_55

    .line 2510
    invoke-direct {v3}, Ll/ۚ۠ܽ;->ܽ()J

    move-result-wide v12

    iget-object v14, v3, Ll/ۚ۠ܽ;->ۘ:[J

    array-length v14, v14

    sub-int v14, v11, v14

    int-to-long v14, v14

    const-wide/16 v16, 0x8

    mul-long v14, v14, v16

    add-long/2addr v14, v12

    const/high16 v12, 0x2000000

    int-to-long v12, v12

    cmp-long v16, v14, v12

    if-gtz v16, :cond_54

    .line 2513
    new-array v11, v11, [J

    iput-object v11, v3, Ll/ۚ۠ܽ;->ۘ:[J

    goto :goto_28

    .line 2511
    :cond_54
    new-instance v0, Ll/֡۠ܽ;

    invoke-direct {v0}, Ll/֡۠ܽ;-><init>()V

    throw v0

    :cond_55
    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    .line 2515
    invoke-static {v12, v13, v11, v14, v15}, Ljava/util/Arrays;->fill([JIIJ)V

    :cond_56
    :goto_28
    const/4 v11, 0x0

    const/4 v12, 0x0

    move v13, v9

    .line 2792
    :goto_29
    invoke-virtual {v4}, Ll/۠۠ܽ;->ۤ()Z

    move-result v14

    if-eqz v14, :cond_57

    const/4 v0, 0x1

    iput-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    :goto_2a
    move-object/from16 v23, v7

    move-object/from16 v22, v8

    goto/16 :goto_2f

    :cond_57
    ushr-int/lit8 v14, v11, 0x1

    if-nez v12, :cond_59

    if-eqz v6, :cond_59

    sub-int v15, v13, v9

    mul-int v16, v14, v6

    ushr-int/lit8 v17, v15, 0x6

    add-int v16, v16, v17

    const-wide/16 v17, 0x1

    shl-long v17, v17, v15

    .line 2528
    iget-object v15, v3, Ll/ۚ۠ܽ;->ۘ:[J

    aget-wide v19, v15, v16

    and-long v21, v19, v17

    const-wide/16 v23, 0x0

    cmp-long v25, v21, v23

    if-eqz v25, :cond_58

    const/16 v21, 0x1

    goto :goto_2b

    :cond_58
    const/16 v21, 0x0

    :goto_2b
    or-long v17, v19, v17

    .line 2529
    aput-wide v17, v15, v16

    goto :goto_2c

    :cond_59
    const/16 v21, 0x0

    :goto_2c
    if-nez v21, :cond_62

    if-ge v14, v10, :cond_5f

    .line 2532
    iget-object v15, v1, Ll/ᩳ֡ܽ;->֫:[Ljava/lang/Object;

    move/from16 v20, v6

    array-length v6, v15

    if-ge v12, v6, :cond_60

    add-int/lit8 v6, v12, 0x1

    .line 2533
    aget-object v12, v15, v12

    invoke-direct {v3, v13, v0, v5, v12}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;Ljava/lang/Object;)I

    move-result v12

    .line 2534
    iget-boolean v14, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v14, :cond_5a

    goto :goto_2d

    :cond_5a
    if-gez v12, :cond_5b

    move v12, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move/from16 v21, v10

    goto/16 :goto_31

    .line 2536
    :cond_5b
    invoke-direct {v3}, Ll/ۚ۠ܽ;->ܳ()Z

    move-result v14

    if-eqz v14, :cond_5c

    :goto_2d
    goto :goto_2a

    .line 2537
    :cond_5c
    iget-object v14, v3, Ll/ۚ۠ܽ;->ᩴ:[I

    array-length v15, v14

    sub-int/2addr v15, v11

    move/from16 v21, v10

    const/4 v10, 0x2

    if-ge v15, v10, :cond_5e

    .line 2538
    array-length v10, v14

    int-to-long v14, v11

    const-wide/16 v16, 0x2

    add-long v14, v14, v16

    invoke-static {v10, v14, v15}, Ll/ۚ۠ܽ;->֫(IJ)I

    move-result v10

    .line 2539
    invoke-direct {v3}, Ll/ۚ۠ܽ;->ܽ()J

    move-result-wide v14

    move/from16 p1, v12

    iget-object v12, v3, Ll/ۚ۠ܽ;->ᩴ:[I

    move-object/from16 v22, v8

    array-length v8, v12

    sub-int v8, v10, v8

    move-object/from16 v23, v7

    int-to-long v7, v8

    const-wide/16 v16, 0x4

    mul-long v7, v7, v16

    add-long/2addr v7, v14

    const/high16 v14, 0x2000000

    int-to-long v14, v14

    cmp-long v16, v7, v14

    if-gtz v16, :cond_5d

    .line 2542
    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v7

    iput-object v7, v3, Ll/ۚ۠ܽ;->ᩴ:[I

    goto :goto_2e

    .line 2540
    :cond_5d
    new-instance v0, Ll/֡۠ܽ;

    invoke-direct {v0}, Ll/֡۠ܽ;-><init>()V

    throw v0

    :cond_5e
    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move/from16 p1, v12

    .line 2544
    :goto_2e
    iget-object v7, v3, Ll/ۚ۠ܽ;->ᩴ:[I

    add-int/lit8 v8, v11, 0x1

    aput v13, v7, v11

    add-int/lit8 v11, v11, 0x2

    .line 2545
    aput v6, v7, v8

    const/4 v6, 0x0

    move/from16 v13, p1

    const/4 v12, 0x0

    goto :goto_31

    :cond_5f
    move/from16 v20, v6

    :cond_60
    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move/from16 v21, v10

    .line 2550
    iget v6, v1, Ll/ᩳ֡ܽ;->ܽ:I

    if-lt v14, v6, :cond_63

    .line 2551
    invoke-direct {v3, v13, v0, v5, v2}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;Ljava/lang/Object;)I

    move-result v6

    .line 2552
    iget-boolean v7, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v7, :cond_61

    goto :goto_2f

    :cond_61
    if-ltz v6, :cond_63

    .line 2553
    iget v7, v4, Ll/۠۠ܽ;->֫:I

    const/4 v8, 0x1

    if-ne v7, v8, :cond_64

    if-ne v6, v0, :cond_63

    goto :goto_30

    :cond_62
    move/from16 v20, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move/from16 v21, v10

    :cond_63
    if-nez v11, :cond_67

    :goto_2f
    const/4 v6, -0x1

    .line 1841
    :cond_64
    :goto_30
    iget-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v0, :cond_65

    goto/16 :goto_24

    :cond_65
    if-gez v6, :cond_66

    goto/16 :goto_35

    .line 1843
    :cond_66
    iget-object v0, v4, Ll/۠۠ܽ;->ۢ:[I

    iget v1, v4, Ll/۠۠ܽ;->᩻:I

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 1844
    invoke-virtual {v4, v6}, Ll/۠۠ܽ;->ܳ(I)V

    const/4 v1, 0x1

    aput v6, v0, v1

    return v1

    .line 2559
    :cond_67
    iget-object v6, v3, Ll/ۚ۠ܽ;->ᩴ:[I

    add-int/lit8 v7, v11, -0x1

    aget v7, v6, v7

    add-int/lit8 v11, v11, -0x2

    .line 2560
    aget v13, v6, v11

    move v12, v7

    :goto_31
    move/from16 v6, v20

    move/from16 v10, v21

    move-object/from16 v8, v22

    move-object/from16 v7, v23

    goto/16 :goto_29

    :cond_68
    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move/from16 v2, v17

    :goto_32
    if-nez v18, :cond_6a

    .line 1850
    iget v6, v1, Ll/ᩳ֡ܽ;->ۧ:I

    if-ne v2, v6, :cond_69

    const/4 v2, 0x0

    move-object/from16 v6, p0

    move-object v4, v5

    move v1, v9

    move/from16 v0, v19

    move-object/from16 v8, v22

    move-object/from16 v7, v23

    goto/16 :goto_0

    .line 1854
    :cond_69
    iget v6, v1, Ll/ᩳ֡ܽ;->ܽ:I

    if-lt v2, v6, :cond_6a

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v11, 0x0

    move-object v10, v3

    move/from16 v12, v19

    move v13, v9

    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    :cond_6a
    const/4 v6, -0x1

    move/from16 v7, v18

    .line 1857
    :goto_33
    iget-object v8, v1, Ll/ᩳ֡ܽ;->֫:[Ljava/lang/Object;

    array-length v10, v8

    if-ge v7, v10, :cond_6e

    .line 2792
    invoke-virtual {v4}, Ll/۠۠ܽ;->ۤ()Z

    move-result v6

    if-eqz v6, :cond_6b

    const/4 v0, 0x1

    iput-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    const/4 v0, 0x0

    return v0

    .line 1859
    :cond_6b
    aget-object v6, v8, v7

    invoke-direct {v3, v9, v0, v5, v6}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;Ljava/lang/Object;)I

    move-result v6

    .line 1860
    iget-boolean v10, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v10, :cond_6c

    goto/16 :goto_24

    :cond_6c
    if-ltz v6, :cond_6d

    goto :goto_34

    :cond_6d
    add-int/lit8 v7, v7, 0x1

    goto :goto_33

    :cond_6e
    :goto_34
    if-gez v6, :cond_6f

    :goto_35
    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object/from16 v1, p0

    move-object v15, v4

    move-object v6, v5

    const/16 v17, 0x0

    const/16 v18, 0x0

    goto/16 :goto_4a

    :cond_6f
    add-int/lit8 v15, v7, 0x1

    .line 1864
    array-length v7, v8

    if-ge v15, v7, :cond_70

    const/4 v11, 0x5

    move-object v10, v3

    move/from16 v12, v16

    move v13, v9

    move v14, v2

    .line 1865
    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    :cond_70
    add-int/lit8 v2, v2, 0x1

    .line 1871
    invoke-direct {v3}, Ll/ۚ۠ܽ;->ܳ()Z

    move-result v7

    if-eqz v7, :cond_71

    goto/16 :goto_24

    :cond_71
    const/16 v18, 0x0

    move v9, v6

    goto :goto_32

    :pswitch_12
    move-object/from16 v23, v7

    move-object/from16 v22, v8

    const/16 v1, 0xc

    if-ne v10, v1, :cond_75

    if-lt v9, v0, :cond_73

    const/4 v0, 0x1

    .line 1805
    iput-boolean v0, v4, Ll/۠۠ܽ;->ܺ:Z

    :cond_72
    :goto_36
    move-object/from16 v1, p0

    move-object v15, v4

    move-object v6, v5

    goto/16 :goto_4a

    :cond_73
    add-int/lit8 v2, v16, 0x2

    .line 1808
    aget v2, v23, v2

    aget-object v2, v22, v2

    check-cast v2, Ll/ۧۚܽ;

    invoke-interface {v5, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-interface {v2, v6}, Ll/ۧۚܽ;->֫(I)Z

    move-result v2

    if-nez v2, :cond_74

    :goto_37
    goto :goto_36

    :cond_74
    add-int/lit8 v2, v9, 0x1

    goto :goto_38

    :cond_75
    move v2, v9

    :goto_38
    if-ne v10, v1, :cond_76

    const/4 v6, 0x3

    goto :goto_39

    :cond_76
    const/4 v6, 0x2

    :goto_39
    add-int v6, v16, v6

    .line 1813
    aget v6, v23, v6

    aget-object v6, v22, v6

    check-cast v6, Ll/ۧۚܽ;

    move v7, v2

    :cond_77
    if-ge v7, v0, :cond_78

    .line 1814
    invoke-interface {v5, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-interface {v6, v8}, Ll/ۧۚܽ;->֫(I)Z

    move-result v8

    if-eqz v8, :cond_78

    add-int/lit8 v7, v7, 0x1

    .line 2792
    invoke-virtual {v4}, Ll/۠۠ܽ;->ۤ()Z

    move-result v8

    if-eqz v8, :cond_77

    const/4 v0, 0x1

    iput-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    const/4 v0, 0x0

    return v0

    :cond_78
    const/4 v6, 0x1

    if-lt v7, v0, :cond_79

    .line 1818
    iput-boolean v6, v4, Ll/۠۠ܽ;->ܺ:Z

    :cond_79
    if-ne v10, v1, :cond_7a

    const/4 v1, 0x5

    goto :goto_3a

    :cond_7a
    const/4 v1, 0x3

    :goto_3a
    add-int v1, v16, v1

    .line 1819
    aget v1, v23, v1

    sub-int v2, v7, v2

    if-lt v2, v1, :cond_72

    .line 1820
    iget v1, v4, Ll/۠۠ܽ;->֫:I

    if-ne v1, v6, :cond_7b

    if-eq v7, v0, :cond_7b

    goto :goto_37

    :cond_7b
    add-int/lit8 v16, v16, 0x4

    .line 1823
    aget v0, v23, v16

    .line 1824
    iget-boolean v1, v4, Ll/۠۠ܽ;->۫:Z

    if-eqz v1, :cond_7c

    .line 1825
    invoke-direct {v3, v0, v9}, Ll/ۚ۠ܽ;->ܿ(II)V

    add-int/2addr v0, v6

    .line 1826
    invoke-direct {v3, v0, v7}, Ll/ۚ۠ܽ;->ܿ(II)V

    goto :goto_3b

    .line 1828
    :cond_7c
    iget-object v1, v4, Ll/۠۠ܽ;->ۢ:[I

    aput v9, v1, v0

    add-int/2addr v0, v6

    .line 1829
    aput v7, v1, v0

    .line 1831
    :goto_3b
    iget-object v0, v4, Ll/۠۠ܽ;->ۢ:[I

    iget v1, v4, Ll/۠۠ܽ;->᩻:I

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 1832
    invoke-virtual {v4, v7}, Ll/۠۠ܽ;->ܳ(I)V

    aput v7, v0, v6

    return v6

    :pswitch_13
    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move-object v6, v5

    goto/16 :goto_41

    :pswitch_14
    move-object/from16 v23, v7

    move-object/from16 v22, v8

    const/16 v6, 0xa

    add-int/lit8 v7, v16, 0x3

    .line 1772
    aget v0, v23, v7

    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->ܿ(I)I

    move-result v0

    if-le v9, v0, :cond_83

    .line 1773
    invoke-direct {v3}, Ll/ۚ۠ܽ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_7d

    goto/16 :goto_24

    :cond_7d
    add-int/lit8 v8, v16, 0x2

    .line 1774
    aget v0, v23, v8

    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->ܿ(I)I

    move-result v4

    add-int/lit8 v0, v16, 0x5

    .line 1775
    aget v0, v23, v0

    if-ge v4, v0, :cond_83

    add-int/lit8 v0, v16, 0x4

    .line 1776
    aget v0, v23, v0

    if-lt v4, v0, :cond_81

    .line 1777
    aget v0, v23, v16

    const/16 v1, 0x13

    if-ne v0, v1, :cond_80

    add-int/lit8 v0, v16, 0x7

    .line 1778
    aget v1, v23, v0

    invoke-direct {v3, v1, v9}, Ll/ۚ۠ܽ;->ۧ(II)Z

    move-result v1

    .line 1779
    iget-boolean v2, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v2, :cond_7e

    goto/16 :goto_24

    :cond_7e
    if-eqz v1, :cond_7f

    move-object/from16 v1, p0

    move-object v6, v5

    goto/16 :goto_43

    .line 1785
    :cond_7f
    aget v14, v23, v0

    const/4 v15, 0x0

    const/4 v11, 0x6

    move-object v10, v3

    move/from16 v12, v19

    move v13, v9

    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    move v12, v4

    move-object v15, v5

    goto :goto_3c

    :cond_80
    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move/from16 v2, v19

    move v3, v9

    move v12, v4

    move v4, v10

    move-object v15, v5

    move v5, v11

    .line 1787
    invoke-direct/range {v0 .. v5}, Ll/ۚ۠ܽ;->֫(IIIII)V

    :goto_3c
    move-object/from16 v3, p0

    goto :goto_3d

    :cond_81
    move v12, v4

    move-object v15, v5

    .line 1790
    :goto_3d
    aget v0, v23, v8

    add-int/lit8 v4, v12, 0x1

    invoke-direct {v3, v0, v4}, Ll/ۚ۠ܽ;->ܳ(II)V

    .line 1791
    aget v0, v23, v16

    if-ne v0, v6, :cond_82

    add-int/lit8 v0, v16, 0x7

    aget v0, v23, v0

    if-eqz v0, :cond_82

    aget v0, v23, v7

    invoke-direct {v3, v0, v9}, Ll/ۚ۠ܽ;->ܳ(II)V

    :cond_82
    add-int/lit8 v16, v16, 0x6

    .line 1792
    aget v19, v23, v16

    move-object/from16 v1, p0

    move-object v5, v15

    goto/16 :goto_51

    :cond_83
    move-object v15, v5

    :goto_3e
    move-object v6, v15

    goto/16 :goto_41

    :pswitch_15
    move-object v15, v5

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    .line 1751
    iget-object v0, v3, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v0, v0, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v0, :cond_85

    const/16 v0, 0x12

    if-ne v10, v0, :cond_84

    add-int/lit8 v0, v16, 0x7

    .line 1753
    aget v0, v23, v0

    .line 1754
    iget-object v1, v4, Ll/۠۠ܽ;->֨:[Ll/᩺ۤۡ;

    aget-object v2, v1, v0

    if-nez v2, :cond_84

    sget-object v2, Ll/ۚ۠ܽ;->ۗ:Ll/᩺ۤۡ;

    aput-object v2, v1, v0

    :cond_84
    add-int/lit8 v0, v16, 0x2

    .line 1757
    aget v0, v23, v0

    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->ۘ(I)V

    :cond_85
    add-int/lit8 v0, v16, 0x4

    .line 1759
    aget v0, v23, v0

    if-nez v0, :cond_87

    add-int/lit8 v0, v16, 0x5

    .line 1760
    aget v0, v23, v0

    if-nez v0, :cond_86

    goto :goto_3e

    :cond_86
    const/4 v14, 0x0

    const/4 v0, 0x0

    const/4 v11, 0x0

    move-object v10, v3

    move/from16 v12, v19

    move v13, v9

    move-object v6, v15

    move v15, v0

    .line 1764
    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    goto :goto_3f

    :cond_87
    move-object v6, v15

    :goto_3f
    add-int/lit8 v0, v16, 0x2

    .line 1766
    aget v0, v23, v0

    .line 2613
    iget-object v1, v3, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v1, v1, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v1, :cond_88

    const/4 v1, 0x1

    invoke-direct {v3, v0, v1}, Ll/ۚ۠ܽ;->᩻(II)V

    goto :goto_40

    :cond_88
    const/4 v1, 0x1

    .line 2614
    invoke-direct {v3, v0, v1}, Ll/ۚ۠ܽ;->ܳ(II)V

    .line 1767
    :goto_40
    aget v0, v23, v16

    const/16 v1, 0x9

    if-ne v0, v1, :cond_89

    add-int/lit8 v0, v16, 0x7

    aget v0, v23, v0

    if-eqz v0, :cond_89

    add-int/lit8 v0, v16, 0x3

    aget v0, v23, v0

    invoke-direct {v3, v0, v9}, Ll/ۚ۠ܽ;->ܳ(II)V

    :cond_89
    add-int/lit8 v16, v16, 0x6

    .line 1768
    aget v19, v23, v16

    :cond_8a
    :goto_41
    move-object/from16 v1, p0

    goto :goto_43

    :pswitch_16
    move-object v6, v5

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    add-int/lit8 v0, v16, 0x2

    .line 1698
    aget v0, v23, v0

    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->ܿ(I)I

    move-result v0

    if-gez v0, :cond_8f

    .line 1700
    invoke-virtual {v4, v9}, Ll/۠۠ܽ;->ܳ(I)V

    .line 1702
    iget v0, v3, Ll/ۚ۠ܽ;->ᩳ:I

    if-gez v0, :cond_8b

    const/4 v0, 0x1

    return v0

    :cond_8b
    const/4 v0, 0x1

    .line 1703
    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->֫(Z)Z

    move-result v0

    if-nez v0, :cond_8d

    .line 1704
    iget-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v0, :cond_8c

    goto/16 :goto_24

    :cond_8c
    :goto_42
    move-object/from16 v1, p0

    move-object v15, v4

    goto/16 :goto_4a

    .line 1708
    :cond_8d
    iget v0, v3, Ll/ۚ۠ܽ;->۠:I

    .line 1709
    iget v9, v3, Ll/ۚ۠ܽ;->ܶ:I

    move-object/from16 v1, p0

    move/from16 v19, v0

    :cond_8e
    :goto_43
    move-object v5, v6

    goto/16 :goto_51

    :cond_8f
    add-int/lit8 v16, v16, 0x3

    .line 1713
    aget v1, v23, v16

    if-nez v1, :cond_90

    .line 1715
    iget-object v2, v3, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v2, v2, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v2, :cond_8a

    .line 1716
    :cond_90
    invoke-direct {v3, v1, v0}, Ll/ۚ۠ܽ;->ܿ(II)V

    add-int/lit8 v1, v1, 0x1

    .line 1717
    invoke-direct {v3, v1, v9}, Ll/ۚ۠ܽ;->ܿ(II)V

    goto :goto_41

    :pswitch_17
    move-object v6, v5

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    .line 1689
    iget-object v0, v3, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v0, v0, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v0, :cond_91

    add-int/lit8 v16, v16, 0x2

    .line 1690
    aget v0, v23, v16

    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->ۘ(I)V

    .line 1691
    aget v0, v23, v16

    invoke-direct {v3, v0, v9}, Ll/ۚ۠ܽ;->᩻(II)V

    goto :goto_41

    :cond_91
    add-int/lit8 v16, v16, 0x2

    .line 1693
    aget v0, v23, v16

    invoke-direct {v3, v0, v9}, Ll/ۚ۠ܽ;->ܳ(II)V

    goto :goto_41

    :pswitch_18
    move-object v6, v5

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    add-int/lit8 v1, v16, 0x2

    .line 1670
    aget v1, v23, v1

    aget-object v1, v22, v1

    move-object v7, v1

    check-cast v7, Ll/ۜ۠ܽ;

    if-ge v9, v0, :cond_94

    .line 1671
    iget-object v0, v7, Ll/ۜ۠ܽ;->֫:[I

    if-eqz v0, :cond_94

    .line 1672
    invoke-interface {v6, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_94

    .line 1674
    iget-object v1, v7, Ll/ۜ۠ܽ;->֫:[I

    aget v0, v1, v0

    if-nez v0, :cond_92

    goto :goto_42

    .line 1676
    :cond_92
    invoke-static {v0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v1

    add-int/lit8 v2, v0, -0x1

    and-int v14, v0, v2

    if-eqz v14, :cond_93

    const/4 v11, 0x4

    const/4 v15, 0x0

    move-object v10, v3

    move/from16 v12, v16

    move v13, v9

    .line 1678
    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    .line 1679
    :cond_93
    iget-object v0, v7, Ll/ۜ۠ܽ;->ܽ:[I

    aget v19, v0, v1

    move-object/from16 v1, p0

    goto :goto_45

    .line 1683
    :cond_94
    iget-object v0, v7, Ll/ۜ۠ܽ;->ܽ:[I

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_95

    const/4 v5, 0x1

    const/4 v8, 0x0

    const/4 v1, 0x3

    move-object/from16 v0, p0

    move/from16 v2, v16

    move v3, v9

    move-object v15, v4

    move v4, v5

    move v5, v8

    invoke-direct/range {v0 .. v5}, Ll/ۚ۠ܽ;->֫(IIIII)V

    goto :goto_44

    :cond_95
    move-object v15, v4

    :goto_44
    const/4 v0, 0x0

    move-object/from16 v1, p0

    .line 1684
    invoke-direct {v1, v7, v0, v9, v6}, Ll/ۚ۠ܽ;->֫(Ll/ۜ۠ܽ;IILjava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_96

    move-object v3, v1

    goto/16 :goto_4a

    .line 1685
    :cond_96
    iget-object v2, v7, Ll/ۜ۠ܽ;->ܽ:[I

    aget v19, v2, v0

    :goto_45
    move-object v3, v1

    goto/16 :goto_43

    :pswitch_19
    move-object v15, v4

    move-object v1, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move-object v6, v5

    add-int/lit8 v2, v16, 0x2

    .line 1643
    aget v2, v23, v2

    aget-object v2, v22, v2

    check-cast v2, Ll/ۧۚܽ;

    const/16 v4, 0x21

    if-ne v10, v4, :cond_97

    const/4 v4, 0x1

    goto :goto_46

    :cond_97
    const/4 v4, 0x0

    :goto_46
    const/4 v5, 0x0

    move v7, v9

    :cond_98
    if-ge v7, v0, :cond_9c

    .line 1647
    invoke-static {v6, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v8

    .line 1648
    invoke-static {v8}, Ljava/lang/Character;->charCount(I)I

    move-result v10

    add-int v11, v7, v10

    if-le v11, v0, :cond_9a

    const/4 v10, 0x1

    .line 1650
    iput-boolean v10, v15, Ll/۠۠ܽ;->ܺ:Z

    if-nez v4, :cond_99

    .line 1651
    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    :cond_99
    const/4 v10, 0x1

    .line 1654
    :cond_9a
    invoke-interface {v2, v8}, Ll/ۧۚܽ;->֫(I)Z

    move-result v8

    if-nez v8, :cond_9b

    goto :goto_47

    :cond_9b
    add-int/2addr v7, v10

    add-int/lit8 v5, v5, 0x1

    .line 2792
    invoke-virtual {v15}, Ll/۠۠ܽ;->ۤ()Z

    move-result v8

    if-eqz v8, :cond_98

    const/4 v0, 0x1

    iput-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    const/4 v0, 0x0

    return v0

    :cond_9c
    :goto_47
    const/4 v2, 0x1

    if-lt v7, v0, :cond_9d

    .line 1659
    iput-boolean v2, v15, Ll/۠۠ܽ;->ܺ:Z

    :cond_9d
    add-int/lit8 v16, v16, 0x3

    .line 1660
    aget v0, v23, v16

    if-ge v5, v0, :cond_9e

    goto/16 :goto_4a

    :cond_9e
    if-le v5, v0, :cond_9f

    const/4 v11, 0x2

    sub-int v15, v5, v0

    move-object v10, v3

    move/from16 v12, v19

    move v13, v7

    move v14, v9

    .line 1664
    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    :cond_9f
    move-object v5, v6

    move v9, v7

    goto/16 :goto_51

    :pswitch_1a
    move-object v15, v4

    move-object v1, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move-object v6, v5

    add-int/lit8 v2, v16, 0x2

    .line 1626
    aget v2, v23, v2

    aget-object v2, v22, v2

    check-cast v2, Ll/ۧۚܽ;

    move v4, v9

    :cond_a0
    if-ge v4, v0, :cond_a1

    .line 1628
    invoke-interface {v6, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-interface {v2, v5}, Ll/ۧۚܽ;->֫(I)Z

    move-result v5

    if-eqz v5, :cond_a1

    add-int/lit8 v4, v4, 0x1

    .line 2792
    invoke-virtual {v15}, Ll/۠۠ܽ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_a0

    const/4 v0, 0x1

    iput-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    const/4 v0, 0x0

    return v0

    :cond_a1
    const/4 v2, 0x1

    if-lt v4, v0, :cond_a2

    .line 1632
    iput-boolean v2, v15, Ll/۠۠ܽ;->ܺ:Z

    :cond_a2
    add-int/lit8 v16, v16, 0x3

    .line 1633
    aget v0, v23, v16

    sub-int v2, v4, v9

    if-ge v2, v0, :cond_a3

    goto/16 :goto_4a

    :cond_a3
    add-int v14, v9, v0

    if-le v4, v14, :cond_a4

    add-int/lit8 v13, v4, -0x1

    const/4 v15, 0x0

    const/4 v11, 0x1

    move-object v10, v3

    move/from16 v12, v19

    .line 1637
    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->֫(IIIII)V

    :cond_a4
    const/4 v2, 0x0

    move v9, v4

    move-object v5, v6

    move/from16 v16, v19

    move-object/from16 v8, v22

    move-object/from16 v7, v23

    move-object v6, v1

    goto/16 :goto_1

    :pswitch_1b
    move-object v15, v4

    move-object v1, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move-object v6, v5

    add-int/lit8 v16, v16, 0x2

    .line 1610
    aget v2, v23, v16

    aget-object v2, v22, v2

    check-cast v2, [I

    const/4 v4, 0x0

    .line 1612
    :cond_a5
    array-length v5, v2

    if-ge v4, v5, :cond_a6

    add-int v5, v9, v4

    if-ge v5, v0, :cond_a6

    aget v7, v2, v4

    .line 1613
    invoke-interface {v6, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-ne v7, v5, :cond_a6

    add-int/lit8 v4, v4, 0x1

    .line 2792
    invoke-virtual {v15}, Ll/۠۠ܽ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_a5

    const/4 v0, 0x1

    iput-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    const/4 v0, 0x0

    return v0

    :cond_a6
    const/4 v5, 0x1

    .line 1617
    array-length v2, v2

    if-eq v4, v2, :cond_a7

    add-int/2addr v9, v4

    if-lt v9, v0, :cond_b2

    .line 1618
    iput-boolean v5, v15, Ll/۠۠ܽ;->ܺ:Z

    goto/16 :goto_4a

    :cond_a7
    add-int/2addr v9, v4

    goto/16 :goto_43

    :pswitch_1c
    move-object v15, v4

    move-object v1, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move-object v6, v5

    const/4 v2, 0x1

    if-lt v9, v0, :cond_a8

    .line 1551
    iput-boolean v2, v15, Ll/۠۠ܽ;->ܺ:Z

    goto/16 :goto_4a

    .line 1554
    :cond_a8
    invoke-static {v6, v9}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 1555
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    add-int/2addr v9, v4

    .line 1557
    iget v4, v15, Ll/۠۠ܽ;->ܽ֫:I

    if-le v9, v4, :cond_a9

    .line 1558
    iput-boolean v2, v15, Ll/۠۠ܽ;->ܺ:Z

    goto/16 :goto_4a

    :cond_a9
    add-int/lit8 v16, v16, 0x2

    .line 1561
    aget v2, v23, v16

    aget-object v2, v22, v2

    check-cast v2, Ll/ۧۚܽ;

    invoke-interface {v2, v0}, Ll/ۧۚܽ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_8e

    goto/16 :goto_4a

    :pswitch_1d
    move-object v15, v4

    move-object v1, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move-object v6, v5

    if-lt v9, v0, :cond_aa

    const/4 v0, 0x1

    .line 1542
    iput-boolean v0, v15, Ll/۠۠ܽ;->ܺ:Z

    goto/16 :goto_4a

    :cond_aa
    add-int/lit8 v16, v16, 0x2

    .line 1545
    aget v0, v23, v16

    aget-object v0, v22, v0

    check-cast v0, Ll/ۧۚܽ;

    invoke-interface {v6, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-interface {v0, v2}, Ll/ۧۚܽ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_ab

    goto/16 :goto_4a

    :cond_ab
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_43

    :pswitch_1e
    move-object v15, v4

    move-object v1, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move-object v6, v5

    .line 1385
    iget v2, v15, Ll/۠۠ܽ;->֫:I

    const/4 v4, 0x1

    if-ne v2, v4, :cond_ac

    if-eq v9, v0, :cond_ac

    goto/16 :goto_4a

    .line 1387
    :cond_ac
    invoke-virtual {v15}, Ll/۠۠ܽ;->pattern()Ll/ۨۘܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨۘܽ;->flags()I

    move-result v0

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_af

    .line 1388
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 729
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-eq v9, v0, :cond_af

    .line 730
    invoke-interface {v6, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    move-result v0

    if-lez v9, :cond_ad

    .line 731
    invoke-interface {v6, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    add-int/lit8 v4, v9, -0x1

    invoke-interface {v6, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-ne v2, v4, :cond_ad

    const/4 v2, 0x1

    goto :goto_48

    :cond_ad
    const/4 v2, 0x0

    :goto_48
    if-lez v9, :cond_ae

    add-int/lit8 v4, v9, -0x1

    .line 732
    invoke-interface {v6, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    move-result v4

    if-eqz v4, :cond_ae

    if-nez v0, :cond_b2

    goto :goto_49

    :cond_ae
    if-nez v2, :cond_b2

    .line 1389
    :cond_af
    :goto_49
    invoke-virtual {v15, v9}, Ll/۠۠ܽ;->ܳ(I)V

    .line 1390
    iget-object v0, v15, Ll/۠۠ܽ;->ۢ:[I

    iget v2, v15, Ll/۠۠ܽ;->᩻:I

    const/4 v3, 0x0

    aput v2, v0, v3

    const/4 v2, 0x1

    .line 1391
    aput v9, v0, v2

    return v2

    :cond_b0
    move-object v15, v4

    move-object v1, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move-object v6, v5

    add-int/lit8 v16, v16, 0x2

    .line 1398
    aget v2, v23, v16

    aget-object v2, v22, v2

    check-cast v2, Ll/᩻֨ܽ;

    .line 1399
    iget v4, v2, Ll/᩻֨ܽ;->ܽ:I

    add-int/2addr v4, v9

    if-lt v4, v9, :cond_8e

    if-ge v4, v0, :cond_8e

    .line 1402
    invoke-interface {v6, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 1403
    iget-boolean v4, v2, Ll/᩻֨ܽ;->ۧ:Z

    if-eqz v4, :cond_b1

    iget-char v2, v2, Ll/᩻֨ܽ;->֫:C

    if-ne v0, v2, :cond_b2

    goto/16 :goto_43

    :cond_b1
    iget-object v2, v2, Ll/᩻֨ܽ;->ᩳ:Ll/ۧۚܽ;

    invoke-interface {v2, v0}, Ll/ۧۚܽ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_8e

    .line 1883
    :cond_b2
    :goto_4a
    iget v0, v3, Ll/ۚ۠ܽ;->ۧ:I

    if-nez v0, :cond_b3

    const/4 v0, 0x0

    .line 1884
    invoke-direct {v3, v0}, Ll/ۚ۠ܽ;->ۖ(I)V

    return v0

    :cond_b3
    add-int/lit8 v2, v0, -0x6

    .line 1888
    iget-object v4, v3, Ll/ۚ۠ܽ;->ܽ:[I

    add-int/lit8 v5, v0, -0x3

    aget v4, v4, v5

    invoke-direct {v3, v4}, Ll/ۚ۠ܽ;->ۖ(I)V

    .line 1889
    iget-object v4, v3, Ll/ۚ۠ܽ;->ܽ:[I

    add-int/lit8 v5, v0, -0x5

    aget v19, v4, v5

    add-int/lit8 v5, v0, -0x4

    .line 1890
    aget v11, v4, v5

    .line 1891
    aget v7, v4, v2

    const/4 v8, 0x7

    if-ne v7, v8, :cond_b6

    add-int/lit8 v0, v0, -0x2

    .line 1893
    aget v0, v4, v0

    invoke-direct {v3, v0, v6}, Ll/ۚ۠ܽ;->ܽ(ILjava/lang/CharSequence;)Z

    move-result v0

    .line 1894
    iget-boolean v2, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v2, :cond_b4

    goto/16 :goto_4f

    :cond_b4
    if-nez v0, :cond_b5

    move-object v8, v15

    goto/16 :goto_4b

    .line 1897
    :cond_b5
    iget v0, v3, Ll/ۚ۠ܽ;->۠:I

    .line 1898
    iget v2, v3, Ll/ۚ۠ܽ;->ܶ:I

    move/from16 v19, v0

    move v9, v2

    goto/16 :goto_43

    :cond_b6
    const/16 v8, 0x9

    if-ne v7, v8, :cond_ba

    .line 2792
    invoke-virtual {v15}, Ll/۠۠ܽ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_b7

    const/4 v0, 0x1

    iput-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    const/4 v0, 0x0

    return v0

    .line 1904
    :cond_b7
    iget-object v4, v3, Ll/ۚ۠ܽ;->ܽ:[I

    add-int/lit8 v5, v0, -0x1

    aget v4, v4, v5

    .line 1905
    invoke-static {v6, v4}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    move-result v7

    sub-int v13, v4, v7

    add-int/lit8 v4, v19, 0x2

    .line 1906
    aget v4, v23, v4

    aget-object v4, v22, v4

    move-object v14, v4

    check-cast v14, Ll/ۧۚܽ;

    iget-object v4, v3, Ll/ۚ۠ܽ;->ܽ:[I

    add-int/lit8 v0, v0, -0x2

    aget v12, v4, v0

    move-object v10, v3

    move-object v8, v15

    move-object v15, v6

    invoke-direct/range {v10 .. v15}, Ll/ۚ۠ܽ;->ۧ(IIILl/ۧۚܽ;Ljava/lang/CharSequence;)I

    move-result v11

    .line 1908
    iget-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v0, :cond_b8

    goto/16 :goto_4f

    :cond_b8
    if-gez v11, :cond_b9

    .line 1910
    iput v2, v3, Ll/ۚ۠ܽ;->ۧ:I

    goto :goto_4b

    .line 1913
    :cond_b9
    iget-object v0, v3, Ll/ۚ۠ܽ;->ܽ:[I

    aput v11, v0, v5

    add-int/lit8 v19, v19, 0x1

    .line 1915
    aget v0, v23, v19

    goto :goto_4c

    :cond_ba
    move-object v8, v15

    const/16 v9, 0x8

    if-ne v7, v9, :cond_bc

    .line 1917
    iput v2, v3, Ll/ۚ۠ܽ;->ۧ:I

    add-int/lit8 v2, v0, -0x2

    .line 1918
    aget v2, v4, v2

    add-int/lit8 v0, v0, -0x1

    aget v0, v4, v0

    .line 1919
    iget-object v4, v3, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v4, v4, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v4, :cond_bb

    not-int v4, v2

    add-int/lit8 v5, v0, -0x1

    .line 1921
    invoke-direct {v3, v4, v5}, Ll/ۚ۠ܽ;->ᩳ(II)V

    .line 1922
    invoke-direct {v3, v2, v0}, Ll/ۚ۠ܽ;->᩻(II)V

    goto :goto_4d

    .line 1924
    :cond_bb
    invoke-direct {v3, v2, v0}, Ll/ۚ۠ܽ;->ܳ(II)V

    goto :goto_4d

    :cond_bc
    const/4 v9, 0x3

    if-ne v7, v9, :cond_c0

    add-int/lit8 v19, v19, 0x2

    .line 1927
    aget v5, v23, v19

    aget-object v5, v22, v5

    check-cast v5, Ll/ۜ۠ܽ;

    .line 1928
    iget-object v7, v5, Ll/ۜ۠ܽ;->ܽ:[I

    add-int/lit8 v0, v0, -0x2

    .line 1929
    aget v9, v4, v0

    add-int/lit8 v10, v9, 0x1

    aput v10, v4, v0

    .line 1930
    aget v0, v7, v9

    .line 1931
    array-length v4, v7

    const/4 v7, 0x1

    sub-int/2addr v4, v7

    if-ne v9, v4, :cond_bd

    iput v2, v3, Ll/ۚ۠ܽ;->ۧ:I

    .line 2792
    :cond_bd
    invoke-virtual {v8}, Ll/۠۠ܽ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_be

    iput-boolean v7, v3, Ll/ۚ۠ܽ;->֫:Z

    const/4 v0, 0x0

    return v0

    .line 1933
    :cond_be
    invoke-direct {v3, v5, v9, v11, v6}, Ll/ۚ۠ܽ;->֫(Ll/ۜ۠ܽ;IILjava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_bf

    :goto_4b
    move-object v15, v8

    goto/16 :goto_4a

    :cond_bf
    :goto_4c
    move/from16 v19, v0

    :goto_4d
    move v9, v11

    goto/16 :goto_43

    :cond_c0
    const/4 v8, 0x4

    if-ne v7, v8, :cond_c2

    add-int/lit8 v0, v0, -0x2

    .line 1935
    aget v4, v4, v0

    add-int/lit8 v19, v19, 0x2

    .line 1936
    aget v5, v23, v19

    aget-object v5, v22, v5

    check-cast v5, Ll/ۜ۠ܽ;

    iget-object v5, v5, Ll/ۜ۠ܽ;->ܽ:[I

    invoke-static {v4}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v7

    aget v5, v5, v7

    add-int/lit8 v7, v4, -0x1

    and-int/2addr v4, v7

    if-nez v4, :cond_c1

    .line 1938
    iput v2, v3, Ll/ۚ۠ܽ;->ۧ:I

    goto :goto_4e

    .line 1939
    :cond_c1
    iget-object v2, v3, Ll/ۚ۠ܽ;->ܽ:[I

    aput v4, v2, v0

    :goto_4e
    move/from16 v19, v5

    goto :goto_4d

    :cond_c2
    const/4 v8, 0x6

    if-ne v7, v8, :cond_c4

    add-int/lit8 v0, v0, -0x2

    .line 1941
    aget v0, v4, v0

    invoke-direct {v3, v0, v11}, Ll/ۚ۠ܽ;->ܽ(II)V

    .line 1942
    iget-boolean v0, v3, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v0, :cond_c3

    :goto_4f
    const/16 v20, 0x0

    :goto_50
    return v20

    .line 1943
    :cond_c3
    iput v2, v3, Ll/ۚ۠ܽ;->ۧ:I

    goto :goto_4d

    :cond_c4
    const/4 v8, 0x5

    if-ne v7, v8, :cond_c5

    add-int/lit8 v5, v0, -0x2

    .line 1945
    aget v17, v4, v5

    add-int/lit8 v0, v0, -0x1

    .line 1946
    aget v18, v4, v0

    .line 1947
    iput v2, v3, Ll/ۚ۠ܽ;->ۧ:I

    move-object v5, v6

    move v9, v11

    goto :goto_51

    :cond_c5
    const/4 v8, 0x1

    if-ne v7, v8, :cond_c6

    add-int/lit8 v8, v0, -0x2

    .line 1948
    aget v8, v4, v8

    if-le v11, v8, :cond_c6

    add-int/lit8 v0, v11, -0x1

    .line 1949
    aput v0, v4, v5

    goto :goto_4d

    :cond_c6
    const/4 v8, 0x2

    if-ne v7, v8, :cond_c8

    add-int/lit8 v7, v0, -0x2

    .line 1951
    aget v4, v4, v7

    .line 1952
    invoke-static {v6, v11}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    move-result v7

    sub-int/2addr v11, v7

    .line 1951
    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1953
    iget-object v7, v3, Ll/ۚ۠ܽ;->ܽ:[I

    aput v4, v7, v5

    add-int/lit8 v0, v0, -0x1

    .line 1954
    aget v5, v7, v0

    add-int/lit8 v5, v5, -0x1

    aput v5, v7, v0

    if-nez v5, :cond_c7

    iput v2, v3, Ll/ۚ۠ܽ;->ۧ:I

    :cond_c7
    move v9, v4

    goto/16 :goto_43

    .line 1956
    :cond_c8
    iput v2, v3, Ll/ۚ۠ܽ;->ۧ:I

    goto/16 :goto_4d

    :goto_51
    move/from16 v16, v19

    :goto_52
    const/4 v2, 0x0

    move-object v6, v1

    move-object/from16 v8, v22

    move-object/from16 v7, v23

    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_15
        :pswitch_14
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_19
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ۧ(Ll/ۛۚܽ;ILjava/lang/CharSequence;)Z
    .locals 6

    .line 268
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-object v0, v0, Ll/ۢ۠ܽ;->֡:Ll/۫᩵ܽ;

    .line 269
    instance-of v1, p1, Ll/֡֨ܽ;

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/ۚ֡ܽ;

    if-eq v1, v2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/ᩳ۠ܽ;

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 271
    :cond_0
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p3, "Regex program does not support search root: "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 277
    :try_start_0
    iget-boolean p1, v0, Ll/۫᩵ܽ;->ܳ:Z

    if-eqz p1, :cond_2

    invoke-direct {p0, v0, p2, p3}, Ll/ۚ۠ܽ;->ۧ(Ll/۫᩵ܽ;ILjava/lang/CharSequence;)Z

    move-result p1

    goto :goto_1

    .line 278
    :cond_2
    invoke-direct {p0, v0, p2, p3}, Ll/ۚ۠ܽ;->֫(Ll/۫᩵ܽ;ILjava/lang/CharSequence;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 312
    :goto_1
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۧ(Z)V

    return p1

    .line 280
    :cond_3
    :try_start_1
    instance-of v0, p1, Ll/֡֨ܽ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v2, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    if-nez v0, :cond_6

    .line 281
    :try_start_2
    iget-object p1, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget p1, p1, Ll/ۢ۠ܽ;->ᩴ:I

    invoke-direct {p0, p1, p2, p3}, Ll/ۚ۠ܽ;->ܽ(IILjava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 282
    iget-boolean p2, v2, Ll/۠۠ܽ;->۫:Z

    if-nez p2, :cond_4

    iget-object p2, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean p3, p2, Ll/ۢ۠ܽ;->᩷:Z

    if-nez p3, :cond_4

    iget-boolean p3, p2, Ll/ۢ۠ܽ;->ۜ:Z

    if-nez p3, :cond_4

    iget-boolean p2, p2, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz p2, :cond_5

    .line 2654
    :cond_4
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ܳ(I)Z

    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p2, :cond_5

    .line 312
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ۧ(Z)V

    return v1

    :cond_5
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۧ(Z)V

    return p1

    .line 286
    :cond_6
    :try_start_3
    iget v0, v2, Ll/۠۠ܽ;->ܽ֫:I

    move-object v3, p1

    check-cast v3, Ll/֡֨ܽ;

    iget v3, v3, Ll/֡֨ܽ;->ۧ:I

    sub-int/2addr v0, v3

    .line 287
    instance-of p1, p1, Ll/᩹֨ܽ;

    .line 288
    iget-boolean v3, v2, Ll/۠۠ܽ;->۫:Z

    if-eqz v3, :cond_7

    const/4 v3, 0x0

    goto :goto_2

    :cond_7
    iget-object v3, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-object v3, v3, Ll/ۢ۠ܽ;->ۘ:Ll/᩷۠ܽ;

    :goto_2
    const/4 v4, 0x1

    if-gt p2, v0, :cond_11

    .line 2792
    invoke-virtual {v2}, Ll/۠۠ܽ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_8

    iput-boolean v4, p0, Ll/ۚ۠ܽ;->֫:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 312
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ۧ(Z)V

    return v1

    :cond_8
    if-eqz v3, :cond_9

    .line 291
    :try_start_4
    invoke-direct {p0, v3, p2, p3}, Ll/ۚ۠ܽ;->֫(Ll/᩷۠ܽ;ILjava/lang/CharSequence;)Z

    move-result v5

    goto :goto_3

    .line 292
    :cond_9
    iget-object v5, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget v5, v5, Ll/ۢ۠ܽ;->ᩴ:I

    invoke-direct {p0, v5, p2, p3}, Ll/ۚ۠ܽ;->ܽ(IILjava/lang/CharSequence;)Z

    move-result v5

    :goto_3
    if-eqz v5, :cond_c

    .line 294
    iget-boolean p1, v2, Ll/۠۠ܽ;->۫:Z

    if-nez p1, :cond_a

    iget-object p1, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean p3, p1, Ll/ۢ۠ܽ;->᩷:Z

    if-nez p3, :cond_a

    iget-boolean p3, p1, Ll/ۢ۠ܽ;->ۜ:Z

    if-nez p3, :cond_a

    iget-boolean p1, p1, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz p1, :cond_b

    .line 2654
    :cond_a
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ܳ(I)Z

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_b

    .line 312
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ۧ(Z)V

    return v1

    .line 296
    :cond_b
    :try_start_5
    iput p2, v2, Ll/۠۠ܽ;->᩻:I

    .line 297
    iget-object p1, v2, Ll/۠۠ܽ;->ۢ:[I

    aput p2, p1, v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 312
    invoke-direct {p0, v4}, Ll/ۚ۠ܽ;->ۧ(Z)V

    return v4

    .line 300
    :cond_c
    :try_start_6
    iget-boolean v4, p0, Ll/ۚ۠ܽ;->֫:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v4, :cond_d

    .line 312
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ۧ(Z)V

    return v1

    :cond_d
    if-eqz p1, :cond_10

    if-ne p2, v0, :cond_e

    goto :goto_4

    :cond_e
    add-int/lit8 v4, p2, 0x1

    .line 303
    :try_start_7
    invoke-interface {p3, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 304
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v4, v5, :cond_f

    invoke-interface {p3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v5

    if-eqz v5, :cond_f

    add-int/lit8 p2, p2, 0x2

    goto :goto_2

    :cond_f
    move p2, v4

    goto :goto_2

    :cond_10
    :goto_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 309
    :cond_11
    iput-boolean v4, v2, Ll/۠۠ܽ;->ܺ:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 312
    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ۧ(Z)V

    return v1

    :catchall_0
    move-exception p1

    invoke-direct {p0, v1}, Ll/ۚ۠ܽ;->ۧ(Z)V

    .line 313
    throw p1
.end method

.method private ۧ(Ll/۫᩵ܽ;ILjava/lang/CharSequence;)Z
    .locals 9

    .line 406
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v1, v0, Ll/۠۠ܽ;->ܽ֫:I

    iget v2, p1, Ll/۫᩵ܽ;->֫:I

    sub-int/2addr v1, v2

    .line 407
    iget-object v2, p1, Ll/۫᩵ܽ;->ᩳ:[I

    :cond_0
    const/4 v3, 0x1

    const/4 v4, 0x0

    if-gt p2, v1, :cond_8

    .line 2792
    invoke-virtual {v0}, Ll/۠۠ܽ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_1

    iput-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    return v4

    .line 411
    :cond_1
    array-length v5, v2

    invoke-direct {p0, p2, v5, p3}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v5

    .line 412
    iget-boolean v6, p0, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v6, :cond_2

    return v4

    .line 413
    :cond_2
    array-length v6, v2

    sub-int/2addr v6, v3

    :goto_0
    if-lez v5, :cond_5

    .line 2792
    invoke-virtual {v0}, Ll/۠۠ܽ;->ۤ()Z

    move-result v7

    if-eqz v7, :cond_3

    iput-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    return v4

    :cond_3
    add-int v7, p2, v5

    .line 415
    invoke-static {p3, v7}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v7

    .line 416
    aget v8, v2, v6

    if-eq v7, v8, :cond_4

    add-int/lit8 v3, v6, 0x1

    .line 417
    iget-object v5, p1, Ll/۫᩵ܽ;->ܽ:[I

    and-int/lit8 v7, v7, 0x7f

    aget v5, v5, v7

    sub-int/2addr v3, v5

    iget-object v5, p1, Ll/۫᩵ܽ;->ۧ:[I

    aget v5, v5, v6

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 418
    invoke-direct {p0, p2, v3, p3}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v3

    add-int/2addr p2, v3

    .line 419
    iget-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v3, :cond_0

    return v4

    .line 422
    :cond_4
    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    move-result v7

    sub-int/2addr v5, v7

    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    .line 424
    :cond_5
    iput p2, v0, Ll/۠۠ܽ;->᩻:I

    .line 425
    iget v5, p1, Ll/۫᩵ܽ;->ܿ:I

    iget v6, p1, Ll/۫᩵ܽ;->֫:I

    add-int/2addr v6, p2

    invoke-direct {p0, v5, v6, p3}, Ll/ۚ۠ܽ;->ۧ(IILjava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 426
    invoke-direct {p0, p2}, Ll/ۚ۠ܽ;->ۧ(I)Z

    move-result p1

    return p1

    .line 428
    :cond_6
    iget-boolean v5, p0, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v5, :cond_7

    return v4

    .line 429
    :cond_7
    invoke-direct {p0, p2, v3, p3}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v3

    add-int/2addr p2, v3

    .line 430
    iget-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    if-eqz v3, :cond_0

    return v4

    .line 432
    :cond_8
    iput-boolean v3, v0, Ll/۠۠ܽ;->ܺ:Z

    return v4
.end method

.method private ۧ(Ll/ܽ֡ܽ;IILjava/lang/CharSequence;)Z
    .locals 19

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    .line 719
    iget-object v0, v7, Ll/ܽ֡ܽ;->֡:Ll/ۡ۠ܽ;

    iget v8, v0, Ll/ۡ۠ܽ;->ᩳ:I

    iget v9, v0, Ll/ۡ۠ܽ;->ۧ:I

    .line 720
    iget v10, v7, Ll/ܽ֡ܽ;->ܿ:I

    iget v11, v7, Ll/ܽ֡ܽ;->ۢ:I

    iget v12, v7, Ll/ܽ֡ܽ;->۠:I

    move/from16 v13, p2

    move/from16 v14, p3

    .line 722
    :goto_0
    iget-object v15, v6, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v0, v15, Ll/۠۠ܽ;->ܽ֫:I

    move-object/from16 v5, p4

    invoke-direct {v6, v12, v13, v0, v5}, Ll/ۚ۠ܽ;->֫(IIILjava/lang/CharSequence;)I

    move-result v0

    const/4 v4, 0x1

    if-ltz v0, :cond_0

    .line 723
    iget v1, v15, Ll/۠۠ܽ;->֫:I

    if-ne v1, v4, :cond_0

    iget v1, v15, Ll/۠۠ܽ;->ܽ֫:I

    if-eq v0, v1, :cond_0

    const/4 v0, -0x1

    :cond_0
    if-ltz v0, :cond_1

    .line 724
    invoke-direct {v6, v0}, Ll/ۚ۠ܽ;->ܽ(I)V

    return v4

    :cond_1
    const/16 v16, 0x0

    if-lt v14, v8, :cond_2

    return v16

    .line 726
    :cond_2
    iget v3, v15, Ll/۠۠ܽ;->ܽ֫:I

    move-object/from16 v0, p0

    move v1, v10

    move v2, v11

    move/from16 v17, v3

    move-object/from16 v3, p4

    move/from16 v18, v8

    const/4 v8, 0x1

    move v4, v13

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;II)I

    move-result v0

    if-gez v0, :cond_3

    .line 727
    invoke-direct {v6, v7, v13, v8}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V

    return v16

    .line 728
    :cond_3
    invoke-virtual {v15, v0}, Ll/۠۠ܽ;->ܳ(I)V

    .line 729
    invoke-direct {v6, v9, v13, v0}, Ll/ۚ۠ܽ;->֫(III)V

    add-int/lit8 v14, v14, 0x1

    .line 2792
    invoke-virtual {v15}, Ll/۠۠ܽ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_4

    iput-boolean v8, v6, Ll/ۚ۠ܽ;->֫:Z

    return v16

    :cond_4
    move v13, v0

    move/from16 v8, v18

    goto :goto_0
.end method

.method private ܳ(II)V
    .locals 2

    .line 2623
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v0, v0, Ll/ۢ۠ܽ;->ܽ:Z

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۚ۠ܽ;->ۧ:I

    if-eqz v0, :cond_1

    :cond_0
    not-int v0, p1

    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ܿ(I)I

    move-result v1

    invoke-direct {p0, v0, v1}, Ll/ۚ۠ܽ;->ᩳ(II)V

    .line 2624
    :cond_1
    invoke-direct {p0, p1, p2}, Ll/ۚ۠ܽ;->᩻(II)V

    return-void
.end method

.method private ܳ()Z
    .locals 2

    .line 2797
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_2

    iget-boolean v1, v0, Ll/۠۠ܽ;->ۛ:Z

    if-nez v1, :cond_1

    .line 2806
    iget-object v1, p0, Ll/ۚ۠ܽ;->ܳ:Ljava/lang/Thread;

    if-nez v1, :cond_0

    .line 2807
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iput-object v1, p0, Ll/ۚ۠ܽ;->ܳ:Ljava/lang/Thread;

    .line 2808
    :cond_0
    invoke-virtual {v0, v1}, Ll/۠۠ܽ;->֫(Ljava/lang/Thread;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 2797
    iput-boolean v0, p0, Ll/ۚ۠ܽ;->֫:Z

    return v0
.end method

.method private ܳ(I)Z
    .locals 10

    .line 2659
    iget v0, p0, Ll/ۚ۠ܽ;->֡:I

    add-int/lit8 v0, v0, -0x20

    .line 2660
    iget v1, p0, Ll/ۚ۠ܽ;->᩹:I

    add-int/lit8 v1, v1, -0x2

    const/4 v2, 0x1

    const/4 v3, 0x1

    :goto_0
    if-lt v1, p1, :cond_a

    add-int/lit8 v4, v1, 0x2

    .line 2661
    invoke-direct {p0, v0, v4}, Ll/ۚ۠ܽ;->֫(II)I

    move-result v0

    .line 2662
    iget-boolean v4, p0, Ll/ۚ۠ܽ;->֫:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    goto :goto_2

    .line 2663
    :cond_0
    iget-object v4, p0, Ll/ۚ۠ܽ;->᩸:[I

    aget v4, v4, v1

    const v6, -0x7fffffff

    if-ne v4, v6, :cond_1

    goto/16 :goto_4

    :cond_1
    const/high16 v7, -0x80000000

    if-gez v4, :cond_2

    if-eq v4, v7, :cond_2

    not-int v8, v4

    const/high16 v9, 0x40000000    # 2.0f

    and-int/2addr v8, v9

    if-eqz v8, :cond_2

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    .line 2668
    :goto_1
    iget-object v9, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    if-eqz v3, :cond_3

    if-eq v4, v7, :cond_3

    if-nez v8, :cond_3

    .line 2670
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ܳ()Z

    move-result v3

    if-eqz v3, :cond_4

    :goto_2
    return v5

    .line 2792
    :cond_3
    invoke-virtual {v9}, Ll/۠۠ܽ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_4

    iput-boolean v2, p0, Ll/ۚ۠ܽ;->֫:Z

    return v5

    :cond_4
    if-eqz v8, :cond_5

    not-int v3, v4

    const v4, -0x40000001    # -1.9999999f

    and-int/2addr v3, v4

    .line 2675
    iget-object v4, p0, Ll/ۚ۠ܽ;->᩸:[I

    add-int/lit8 v5, v1, 0x1

    aget v4, v4, v5

    invoke-direct {p0, v3, v4}, Ll/ۚ۠ܽ;->᩻(II)V

    .line 2677
    iget-object v3, p0, Ll/ۚ۠ܽ;->᩸:[I

    aput v6, v3, v1

    goto :goto_3

    .line 2680
    :cond_5
    iget-object v3, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v3, v3, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v3, :cond_6

    if-gez v4, :cond_6

    if-eq v4, v7, :cond_6

    .line 2682
    iget-object v3, p0, Ll/ۚ۠ܽ;->᩸:[I

    aput v6, v3, v1

    goto :goto_3

    :cond_6
    if-ne v4, v7, :cond_7

    .line 2686
    iget-object v3, v9, Ll/۠۠ܽ;->ۢ:[I

    iget-object v4, p0, Ll/ۚ۠ܽ;->᩸:[I

    add-int/lit8 v6, v1, 0x1

    aget v4, v4, v6

    aput v4, v3, v5

    iput v4, v9, Ll/۠۠ܽ;->᩻:I

    .line 2687
    iget v4, v9, Ll/۠۠ܽ;->ۖ:I

    aput v4, v3, v2

    goto :goto_3

    :cond_7
    if-le v4, v2, :cond_9

    and-int/lit8 v3, v4, 0x1

    if-eqz v3, :cond_9

    .line 2692
    iget-object v3, p0, Ll/ۚ۠ܽ;->᩸:[I

    add-int/lit8 v5, v1, 0x1

    aget v5, v3, v5

    add-int/lit8 v6, v1, -0x1

    .line 2693
    aget v3, v3, v6

    .line 2694
    iget-boolean v6, v9, Ll/۠۠ܽ;->۫:Z

    if-eqz v6, :cond_8

    const/4 v6, -0x1

    if-eq v3, v6, :cond_8

    if-eq v5, v6, :cond_8

    .line 2695
    iget-object v6, v9, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    new-instance v7, Ll/ۗۘܽ;

    div-int/lit8 v4, v4, 0x2

    invoke-direct {v7, v4, v3, v5}, Ll/ۗۘܽ;-><init>(III)V

    .line 13
    iget-object v3, v6, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v1, v1, -0x2

    :cond_9
    :goto_3
    const/4 v3, 0x0

    :goto_4
    add-int/lit8 v1, v1, -0x2

    goto/16 :goto_0

    .line 2700
    :cond_a
    invoke-direct {p0, v0, p1}, Ll/ۚ۠ܽ;->֫(II)I

    .line 2701
    iget-boolean p1, p0, Ll/ۚ۠ܽ;->֫:Z

    xor-int/2addr p1, v2

    return p1
.end method

.method private ܳ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z
    .locals 10

    .line 496
    iget v0, p2, Ll/ܽ֡ܽ;->᩻:I

    iget v1, p2, Ll/ܽ֡ܽ;->۠:I

    iget-object v2, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v3, v2, Ll/۠۠ܽ;->ܽ֫:I

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    .line 497
    iget-object v5, p2, Ll/ܽ֡ܽ;->֡:Ll/ۡ۠ܽ;

    iget-object v5, v5, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    sget-object v6, Ll/֫֨ܽ;->ۙ:Ll/֫֨ܽ;

    const/4 v7, 0x0

    if-ne v5, v6, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 498
    :goto_0
    sget-object v8, Ll/֫֨ܽ;->᩹:Ll/֫֨ܽ;

    if-ne v5, v8, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-gt p1, v3, :cond_f

    .line 2792
    invoke-virtual {v2}, Ll/۠۠ܽ;->ۤ()Z

    move-result v8

    if-eqz v8, :cond_2

    iput-boolean v4, p0, Ll/ۚ۠ܽ;->֫:Z

    return v7

    .line 501
    :cond_2
    iget v8, v2, Ll/۠۠ܽ;->ܽ֫:I

    if-ge p1, v8, :cond_3

    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-virtual {p2, v8}, Ll/ܽ֡ܽ;->֫(I)Z

    move-result v8

    if-nez v8, :cond_3

    goto/16 :goto_4

    .line 503
    :cond_3
    iget v8, v2, Ll/۠۠ܽ;->ܽ֫:I

    if-lt p1, v8, :cond_4

    .line 505
    iput-boolean v4, v2, Ll/۠۠ܽ;->ܺ:Z

    goto/16 :goto_4

    :cond_4
    if-eqz v6, :cond_6

    .line 508
    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    if-ne v8, v1, :cond_6

    iget v8, v2, Ll/۠۠ܽ;->֫:I

    if-ne v8, v4, :cond_5

    add-int/lit8 v8, p1, 0x1

    iget v9, v2, Ll/۠۠ܽ;->ܽ֫:I

    if-ne v8, v9, :cond_6

    :cond_5
    add-int/lit8 p2, p1, 0x1

    .line 510
    invoke-direct {p0, p2}, Ll/ۚ۠ܽ;->ܽ(I)V

    .line 511
    iget-object p2, v2, Ll/۠۠ܽ;->ۢ:[I

    aput p1, p2, v7

    iput p1, v2, Ll/۠۠ܽ;->᩻:I

    return v4

    .line 514
    :cond_6
    iget v8, v2, Ll/۠۠ܽ;->ܽ֫:I

    if-lt p1, v8, :cond_7

    .line 515
    iput-boolean v4, v2, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_3

    .line 516
    :cond_7
    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    if-ne v8, v0, :cond_b

    add-int/lit8 v8, p1, 0x1

    .line 517
    invoke-direct {p0, v8}, Ll/ۚ۠ܽ;->ܽ(I)V

    .line 518
    iget v9, v2, Ll/۠۠ܽ;->ܽ֫:I

    if-lt v8, v9, :cond_8

    iput-boolean v4, v2, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_2

    .line 519
    :cond_8
    invoke-interface {p3, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    if-ne v8, v1, :cond_a

    iget v8, v2, Ll/۠۠ܽ;->֫:I

    if-ne v8, v4, :cond_9

    add-int/lit8 v8, p1, 0x2

    iget v9, v2, Ll/۠۠ܽ;->ܽ֫:I

    if-ne v8, v9, :cond_a

    :cond_9
    add-int/lit8 p2, p1, 0x2

    .line 521
    invoke-direct {p0, p2}, Ll/ۚ۠ܽ;->ܽ(I)V

    .line 522
    iget-object p2, v2, Ll/۠۠ܽ;->ۢ:[I

    aput p1, p2, v7

    iput p1, v2, Ll/۠۠ܽ;->᩻:I

    return v4

    :cond_a
    :goto_2
    if-nez v5, :cond_b

    goto :goto_4

    :cond_b
    :goto_3
    if-nez v6, :cond_e

    .line 528
    iget v8, v2, Ll/۠۠ܽ;->ܽ֫:I

    if-lt p1, v8, :cond_c

    iput-boolean v4, v2, Ll/۠۠ܽ;->ܺ:Z

    goto :goto_4

    .line 529
    :cond_c
    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    if-ne v8, v1, :cond_e

    iget v8, v2, Ll/۠۠ܽ;->֫:I

    if-ne v8, v4, :cond_d

    add-int/lit8 v8, p1, 0x1

    iget v9, v2, Ll/۠۠ܽ;->ܽ֫:I

    if-ne v8, v9, :cond_e

    :cond_d
    add-int/lit8 p2, p1, 0x1

    .line 531
    invoke-direct {p0, p2}, Ll/ۚ۠ܽ;->ܽ(I)V

    .line 532
    iget-object p2, v2, Ll/۠۠ܽ;->ۢ:[I

    aput p1, p2, v7

    iput p1, v2, Ll/۠۠ܽ;->᩻:I

    return v4

    :cond_e
    :goto_4
    add-int/lit8 p1, p1, 0x1

    goto/16 :goto_1

    .line 537
    :cond_f
    iput-boolean v4, v2, Ll/۠۠ܽ;->ܺ:Z

    return v7
.end method

.method private ܺ(I)V
    .locals 4

    .line 2343
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    aget v1, v0, p1

    .line 2344
    iget-object v2, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    if-eqz v1, :cond_3

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    const/4 v3, 0x3

    if-ne v1, v3, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    add-int/lit8 v1, p1, 0x8

    .line 2347
    aget v1, v0, v1

    iput v1, v2, Ll/۠۠ܽ;->ۜ:I

    add-int/lit8 p1, p1, 0x9

    .line 2348
    aget p1, v0, p1

    iput p1, v2, Ll/۠۠ܽ;->۠:I

    return-void

    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x7

    .line 2345
    aget p1, v0, p1

    iput p1, v2, Ll/۠۠ܽ;->ܽ֫:I

    return-void
.end method

.method private ܽ()J
    .locals 6

    .line 2836
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۖ:[I

    array-length v0, v0

    int-to-long v0, v0

    iget-object v2, p0, Ll/ۚ۠ܽ;->ܽ:[I

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-object v2, p0, Ll/ۚ۠ܽ;->᩸:[I

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-object v2, p0, Ll/ۚ۠ܽ;->ᩴ:[I

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-object v2, p0, Ll/ۚ۠ܽ;->ۚ:[I

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x4

    mul-long v0, v0, v2

    iget-object v2, p0, Ll/ۚ۠ܽ;->ۘ:[J

    array-length v2, v2

    int-to-long v2, v2

    iget-object v4, p0, Ll/ۚ۠ܽ;->᩷:[J

    array-length v4, v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    const-wide/16 v4, 0x8

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    return-wide v2
.end method

.method private ܽ(I)V
    .locals 4

    .line 1197
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object v1, v0, Ll/۠۠ܽ;->ۢ:[I

    const/4 v2, 0x0

    iget v3, v0, Ll/۠۠ܽ;->᩻:I

    aput v3, v1, v2

    .line 1198
    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ܳ(I)V

    const/4 v0, 0x1

    aput p1, v1, v0

    return-void
.end method

.method private ܽ(II)V
    .locals 10

    .line 2742
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v0, v0, Ll/ۢ۠ܽ;->ܽ:Z

    iget-object v1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    if-eqz v0, :cond_0

    iget-object v0, v1, Ll/۠۠ܽ;->֨:[Ll/᩺ۤۡ;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2743
    :cond_0
    iget v0, p0, Ll/ۚ۠ܽ;->ۜ:I

    int-to-long v2, p1

    const/16 p1, 0x20

    shl-long/2addr v2, p1

    int-to-long p1, p2

    const-wide/16 v4, 0x1

    add-long/2addr p1, v4

    or-long/2addr p1, v2

    .line 2745
    iget-object v2, p0, Ll/ۚ۠ܽ;->᩷:[J

    array-length v3, v2

    if-eqz v3, :cond_1

    .line 2746
    invoke-direct {p0, v2, p1, p2}, Ll/ۚ۠ܽ;->֫([JJ)I

    move-result v2

    .line 2747
    iget-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    if-nez v3, :cond_b

    iget v3, p0, Ll/ۚ۠ܽ;->ۜ:I

    if-ne v0, v3, :cond_b

    iget-object v3, p0, Ll/ۚ۠ܽ;->᩷:[J

    aget-wide v2, v3, v2

    cmp-long v6, v2, p1

    if-nez v6, :cond_1

    goto/16 :goto_3

    .line 2749
    :cond_1
    iget v2, p0, Ll/ۚ۠ܽ;->᩻:I

    iget-object v3, p0, Ll/ۚ۠ܽ;->᩷:[J

    array-length v6, v3

    div-int/lit8 v6, v6, 0x2

    const/4 v7, 0x1

    if-lt v2, v6, :cond_9

    .line 2750
    array-length v2, v3

    array-length v3, v3

    int-to-long v8, v3

    add-long/2addr v8, v4

    invoke-static {v2, v8, v9}, Ll/ۚ۠ܽ;->֫(IJ)I

    move-result v2

    add-int/lit8 v3, v2, -0x1

    and-int/2addr v3, v2

    if-nez v3, :cond_8

    .line 2753
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ܽ()J

    move-result-wide v3

    iget-object v5, p0, Ll/ۚ۠ܽ;->᩷:[J

    array-length v5, v5

    sub-int v5, v2, v5

    int-to-long v5, v5

    const-wide/16 v8, 0x8

    mul-long v5, v5, v8

    add-long/2addr v5, v3

    const/high16 v3, 0x2000000

    int-to-long v3, v3

    cmp-long v8, v5, v3

    if-gtz v8, :cond_8

    .line 2756
    new-array v2, v2, [J

    const/4 v3, 0x0

    .line 2757
    :goto_0
    iget-object v4, p0, Ll/ۚ۠ܽ;->᩷:[J

    array-length v4, v4

    if-ge v3, v4, :cond_6

    .line 2792
    invoke-virtual {v1}, Ll/۠۠ܽ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_2

    iput-boolean v7, p0, Ll/ۚ۠ܽ;->֫:Z

    return-void

    .line 2759
    :cond_2
    iget v4, p0, Ll/ۚ۠ܽ;->ۜ:I

    if-eq v0, v4, :cond_3

    goto :goto_3

    .line 2760
    :cond_3
    iget-object v4, p0, Ll/ۚ۠ܽ;->᩷:[J

    aget-wide v5, v4, v3

    const-wide/16 v8, 0x0

    cmp-long v4, v5, v8

    if-nez v4, :cond_4

    goto :goto_1

    .line 2762
    :cond_4
    invoke-direct {p0, v2, v5, v6}, Ll/ۚ۠ܽ;->֫([JJ)I

    move-result v4

    .line 2763
    iget-boolean v8, p0, Ll/ۚ۠ܽ;->֫:Z

    if-nez v8, :cond_b

    iget v8, p0, Ll/ۚ۠ܽ;->ۜ:I

    if-eq v0, v8, :cond_5

    goto :goto_3

    .line 2764
    :cond_5
    aput-wide v5, v2, v4

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 2766
    :cond_6
    iget v1, p0, Ll/ۚ۠ܽ;->ۜ:I

    if-eq v0, v1, :cond_7

    goto :goto_3

    .line 2767
    :cond_7
    iput-object v2, p0, Ll/ۚ۠ܽ;->᩷:[J

    goto :goto_2

    .line 2754
    :cond_8
    new-instance p1, Ll/֡۠ܽ;

    invoke-direct {p1}, Ll/֡۠ܽ;-><init>()V

    throw p1

    .line 2769
    :cond_9
    :goto_2
    iget-object v1, p0, Ll/ۚ۠ܽ;->᩷:[J

    invoke-direct {p0, v1, p1, p2}, Ll/ۚ۠ܽ;->֫([JJ)I

    move-result v1

    .line 2770
    iget-boolean v2, p0, Ll/ۚ۠ܽ;->֫:Z

    if-nez v2, :cond_b

    iget v2, p0, Ll/ۚ۠ܽ;->ۜ:I

    if-eq v0, v2, :cond_a

    goto :goto_3

    .line 2771
    :cond_a
    iget-object v0, p0, Ll/ۚ۠ܽ;->᩷:[J

    aput-wide p1, v0, v1

    .line 2772
    iget p1, p0, Ll/ۚ۠ܽ;->᩻:I

    add-int/2addr p1, v7

    iput p1, p0, Ll/ۚ۠ܽ;->᩻:I

    :cond_b
    :goto_3
    return-void
.end method

.method private ܽ(III)V
    .locals 6

    int-to-long v0, p1

    int-to-long p1, p2

    add-long/2addr v0, p1

    int-to-long p1, p3

    add-long/2addr v0, p1

    const-wide/16 p1, 0x4

    mul-long v0, v0, p1

    .line 2823
    iget-object p3, p0, Ll/ۚ۠ܽ;->ۘ:[J

    array-length p3, p3

    int-to-long v2, p3

    iget-object p3, p0, Ll/ۚ۠ܽ;->᩷:[J

    array-length p3, p3

    int-to-long v4, p3

    add-long/2addr v2, v4

    const-wide/16 v4, 0x8

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    iget-object p3, p0, Ll/ۚ۠ܽ;->ᩴ:[I

    array-length p3, p3

    int-to-long v0, p3

    iget-object p3, p0, Ll/ۚ۠ܽ;->ۚ:[I

    array-length p3, p3

    int-to-long v4, p3

    add-long/2addr v0, v4

    mul-long v0, v0, p1

    add-long/2addr v0, v2

    const/high16 p1, 0x2000000

    int-to-long p1, p1

    cmp-long p3, v0, p1

    if-gtz p3, :cond_0

    return-void

    .line 2826
    :cond_0
    new-instance p1, Ll/֡۠ܽ;

    invoke-direct {p1}, Ll/֡۠ܽ;-><init>()V

    throw p1
.end method

.method private ܽ(IILjava/lang/CharSequence;)Z
    .locals 3

    .line 258
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget v1, v0, Ll/ۢ۠ܽ;->ۢ:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    .line 262
    invoke-direct {p0, p1, p2, p3}, Ll/ۚ۠ܽ;->ۧ(IILjava/lang/CharSequence;)Z

    move-result p1

    return p1

    .line 261
    :cond_0
    iget-object p1, v0, Ll/ۢ۠ܽ;->ᩳ:Ll/ۤ᩵ܽ;

    invoke-direct {p0, p1, p2, p3}, Ll/ۚ۠ܽ;->֫(Ll/ۤ᩵ܽ;ILjava/lang/CharSequence;)Z

    move-result p1

    return p1

    .line 260
    :cond_1
    invoke-direct {p0, p2, p3}, Ll/ۚ۠ܽ;->ܿ(ILjava/lang/CharSequence;)Z

    move-result p1

    return p1

    .line 259
    :cond_2
    iget-object p1, v0, Ll/ۢ۠ܽ;->ۧ:Ll/۬᩵ܽ;

    invoke-direct {p0, p1, p2, p3}, Ll/ۚ۠ܽ;->֫(Ll/۬᩵ܽ;ILjava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method private ܽ(ILjava/lang/CharSequence;)Z
    .locals 7

    .line 2298
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    aget v1, v0, p1

    const/4 v2, 0x5

    const/4 v3, 0x0

    if-lt v1, v2, :cond_1

    add-int/lit8 p2, p1, 0xd

    .line 2299
    aget p2, v0, p2

    if-nez p2, :cond_0

    .line 2300
    iput p1, p0, Ll/ۚ۠ܽ;->ᩳ:I

    .line 2301
    invoke-direct {p0, v3}, Ll/ۚ۠ܽ;->֫(Z)Z

    move-result p1

    return p1

    .line 2303
    :cond_0
    invoke-direct {p0, p1, v3}, Ll/ۚ۠ܽ;->֫(IZ)Z

    move-result p1

    return p1

    :cond_1
    add-int/lit8 v2, p1, 0xd

    .line 2305
    aget v2, v0, v2

    if-nez v2, :cond_6

    .line 2306
    iput p1, p0, Ll/ۚ۠ܽ;->ᩳ:I

    const/4 v2, 0x2

    const/4 v4, 0x3

    if-eq v1, v2, :cond_2

    if-ne v1, v4, :cond_5

    :cond_2
    add-int/lit8 v1, p1, 0xa

    .line 2309
    aget v2, v0, v1

    add-int/lit8 v5, p1, 0xb

    .line 2310
    aget v5, v0, v5

    add-int/lit8 v6, p1, 0xe

    .line 2311
    aget v0, v0, v6

    const/4 v6, 0x1

    if-eqz v0, :cond_3

    if-le v2, v5, :cond_3

    const/4 v0, -0x1

    .line 2312
    invoke-direct {p0, v2, v0, p2}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;)I

    move-result p2

    goto :goto_0

    :cond_3
    const/4 p2, 0x1

    :goto_0
    sub-int/2addr v2, p2

    .line 2313
    iget-boolean p2, p0, Ll/ۚ۠ܽ;->֫:Z

    if-eqz p2, :cond_4

    return v3

    :cond_4
    if-lt v2, v5, :cond_5

    .line 2315
    iget-object p2, p0, Ll/ۚ۠ܽ;->ۚ:[I

    aput v2, p2, v1

    add-int/2addr p1, v4

    .line 2316
    aget p1, p2, p1

    iput p1, p0, Ll/ۚ۠ܽ;->۠:I

    .line 2317
    iput v2, p0, Ll/ۚ۠ܽ;->ܶ:I

    return v6

    .line 2321
    :cond_5
    invoke-direct {p0, v3}, Ll/ۚ۠ܽ;->֫(Z)Z

    move-result p1

    return p1

    .line 2323
    :cond_6
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->֫(I)V

    .line 2324
    iget-object p2, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v0, p1, 0x4

    aget v0, p2, v0

    iput v0, p0, Ll/ۚ۠ܽ;->ۧ:I

    .line 2325
    iput p1, p0, Ll/ۚ۠ܽ;->֡:I

    add-int/lit8 p1, p1, 0xc

    .line 2326
    aget p1, p2, p1

    iput p1, p0, Ll/ۚ۠ܽ;->ᩳ:I

    return v3
.end method

.method private ܽ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    .line 798
    iget-object v3, v1, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object v4, v3, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    iget-object v5, v0, Ll/ܽ֡ܽ;->֡:Ll/ۡ۠ܽ;

    iget v6, v0, Ll/ܽ֡ܽ;->᩹:I

    .line 800
    iget v7, v5, Ll/ۡ۠ܽ;->ܽ:I

    iget-object v8, v5, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    iget v9, v5, Ll/ۡ۠ܽ;->ᩳ:I

    iget v10, v5, Ll/ۡ۠ܽ;->ܿ:I

    iget-boolean v11, v5, Ll/ۡ۠ܽ;->֫:Z

    iget v12, v5, Ll/ۡ۠ܽ;->ۧ:I

    if-ltz v7, :cond_0

    iget-object v13, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aget v13, v13, v7

    goto :goto_0

    :cond_0
    const/4 v13, 0x0

    :goto_0
    if-eqz v11, :cond_1

    .line 801
    iget-object v14, v3, Ll/۠۠ܽ;->ۢ:[I

    aget v14, v14, v12

    goto :goto_1

    :cond_1
    const/4 v14, 0x0

    :goto_1
    if-eqz v11, :cond_2

    .line 802
    iget-object v15, v3, Ll/۠۠ܽ;->ۢ:[I

    add-int/lit8 v16, v12, 0x1

    aget v15, v15, v16

    goto :goto_2

    :cond_2
    const/4 v15, 0x0

    :goto_2
    move/from16 v16, v6

    .line 803
    iget-boolean v6, v3, Ll/۠۠ܽ;->۫:Z

    const/16 v17, -0x1

    if-eqz v6, :cond_4

    if-ltz v7, :cond_3

    if-eqz v11, :cond_4

    .line 43
    :cond_3
    iget-object v6, v4, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    goto :goto_3

    :cond_4
    const/4 v6, -0x1

    :goto_3
    move/from16 v18, v9

    if-ltz v7, :cond_5

    .line 804
    iget-object v9, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v17, v9, v7

    :cond_5
    const/4 v9, 0x0

    move/from16 v9, p1

    move-object/from16 v17, v8

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v10, :cond_10

    move/from16 v19, v10

    .line 808
    :try_start_0
    invoke-direct {v1, v9, v0, v2}, Ll/ۚ۠ܽ;->ᩳ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v10

    .line 809
    iget-boolean v2, v1, Ll/ۚ۠ܽ;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_9

    if-ltz v7, :cond_6

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_6
    if-eqz v11, :cond_7

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_7
    if-ltz v6, :cond_8

    .line 884
    :goto_5
    invoke-virtual {v4, v6}, Ll/ᩴ۠ܽ;->֫(I)V

    const/4 v0, 0x0

    return v0

    :cond_8
    :goto_6
    const/4 v0, 0x0

    goto/16 :goto_11

    :cond_9
    if-gez v10, :cond_c

    const/4 v2, 0x1

    .line 810
    :try_start_1
    invoke-direct {v1, v0, v9, v2}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ltz v7, :cond_a

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_a
    if-eqz v11, :cond_b

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_b
    if-ltz v6, :cond_8

    goto :goto_5

    .line 811
    :cond_c
    :try_start_2
    invoke-direct {v1, v0, v9, v10}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;II)V

    .line 812
    invoke-direct {v1, v5, v9, v10}, Ll/ۚ۠ܽ;->֫(Ll/ۡ۠ܽ;II)V

    add-int/lit8 v8, v8, 0x1

    .line 2792
    invoke-virtual {v3}, Ll/۠۠ܽ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_f

    const/4 v0, 0x1

    iput-boolean v0, v1, Ll/ۚ۠ܽ;->֫:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ltz v7, :cond_d

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_d
    if-eqz v11, :cond_e

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_e
    if-ltz v6, :cond_8

    goto :goto_5

    :cond_f
    move-object/from16 v2, p3

    move v9, v10

    move/from16 v10, v19

    goto :goto_4

    :cond_10
    move/from16 v19, v10

    .line 817
    :try_start_3
    iget-boolean v2, v5, Ll/ۡ۠ܽ;->ܳ:Z

    if-nez v2, :cond_13

    if-gez v7, :cond_13

    iget-boolean v2, v3, Ll/۠۠ܽ;->ۡ:Z

    if-eqz v2, :cond_13

    const/4 v0, 0x1

    .line 818
    iput-boolean v0, v1, Ll/ۚ۠ܽ;->֫:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ltz v7, :cond_11

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_11
    if-eqz v11, :cond_12

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_12
    if-ltz v6, :cond_8

    goto :goto_5

    .line 821
    :cond_13
    :try_start_4
    sget-object v2, Ll/֫֨ܽ;->ۙ:Ll/֫֨ܽ;

    move-object/from16 v10, v17

    if-ne v10, v2, :cond_24

    :goto_7
    move-object/from16 v2, p3

    .line 823
    invoke-direct {v1, v9, v0, v2}, Ll/ۚ۠ܽ;->ۧ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v10

    move-object/from16 v17, v5

    .line 824
    iget-boolean v5, v1, Ll/ۚ۠ܽ;->֫:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v5, :cond_16

    if-ltz v7, :cond_14

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_14
    if-eqz v11, :cond_15

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_15
    if-ltz v6, :cond_8

    goto/16 :goto_5

    :cond_16
    const/4 v5, 0x1

    if-ltz v10, :cond_17

    .line 825
    :try_start_5
    invoke-direct {v1, v10}, Ll/ۚ۠ܽ;->ܽ(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    return v5

    :cond_17
    move/from16 v5, v18

    if-lt v8, v5, :cond_1a

    if-ltz v7, :cond_18

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_18
    if-eqz v11, :cond_19

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_19
    if-ltz v6, :cond_8

    goto/16 :goto_5

    .line 827
    :cond_1a
    :try_start_6
    invoke-direct {v1, v9, v0, v2}, Ll/ۚ۠ܽ;->ᩳ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v10

    .line 828
    iget-boolean v2, v1, Ll/ۚ۠ܽ;->֫:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v2, :cond_1d

    if-ltz v7, :cond_1b

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_1b
    if-eqz v11, :cond_1c

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_1c
    if-ltz v6, :cond_8

    goto/16 :goto_5

    :cond_1d
    const/4 v2, 0x1

    if-gez v10, :cond_20

    .line 829
    :try_start_7
    invoke-direct {v1, v0, v9, v2}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-ltz v7, :cond_1e

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_1e
    if-eqz v11, :cond_1f

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_1f
    if-ltz v6, :cond_8

    goto/16 :goto_5

    .line 830
    :cond_20
    :try_start_8
    invoke-direct {v1, v0, v9, v10}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;II)V

    move-object/from16 v2, v17

    .line 831
    invoke-direct {v1, v2, v9, v10}, Ll/ۚ۠ܽ;->֫(Ll/ۡ۠ܽ;II)V

    add-int/lit8 v8, v8, 0x1

    .line 2792
    invoke-virtual {v3}, Ll/۠۠ܽ;->ۤ()Z

    move-result v9

    if-eqz v9, :cond_23

    const/4 v0, 0x1

    iput-boolean v0, v1, Ll/ۚ۠ܽ;->֫:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-ltz v7, :cond_21

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_21
    if-eqz v11, :cond_22

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_22
    if-ltz v6, :cond_8

    goto/16 :goto_5

    :cond_23
    move/from16 v18, v5

    move v9, v10

    move-object v5, v2

    goto/16 :goto_7

    :cond_24
    move-object v2, v5

    move/from16 v5, v18

    if-eqz v11, :cond_25

    move/from16 v17, v8

    .line 838
    :try_start_9
    iget-object v8, v3, Ll/۠۠ܽ;->ۢ:[I

    aget v8, v8, v12

    goto :goto_8

    :cond_25
    move/from16 v17, v8

    const/4 v8, 0x0

    :goto_8
    if-eqz v11, :cond_26

    move/from16 v18, v9

    .line 839
    iget-object v9, v3, Ll/۠۠ܽ;->ۢ:[I

    add-int/lit8 v20, v12, 0x1

    aget v9, v9, v20

    goto :goto_9

    :cond_26
    move/from16 v18, v9

    const/4 v9, 0x0

    :goto_9
    if-eqz v11, :cond_27

    move/from16 p1, v9

    .line 840
    iget-boolean v9, v3, Ll/۠۠ܽ;->۫:Z

    if-eqz v9, :cond_28

    .line 43
    iget-object v9, v4, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    goto :goto_a

    :cond_27
    move/from16 p1, v9

    :cond_28
    const/4 v9, -0x1

    :goto_a
    move/from16 v20, v8

    move/from16 v8, v17

    move/from16 v17, v9

    move/from16 v9, v18

    :goto_b
    if-ge v8, v5, :cond_30

    move/from16 v21, v5

    move-object/from16 v18, v10

    move-object/from16 v10, p3

    .line 842
    invoke-direct {v1, v9, v0, v10}, Ll/ۚ۠ܽ;->ᩳ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v5

    .line 843
    iget-boolean v10, v1, Ll/ۚ۠ܽ;->֫:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-eqz v10, :cond_2b

    if-ltz v7, :cond_29

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_29
    if-eqz v11, :cond_2a

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_2a
    if-ltz v6, :cond_8

    goto/16 :goto_5

    :cond_2b
    if-gez v5, :cond_2c

    move/from16 v5, v21

    goto :goto_c

    .line 845
    :cond_2c
    :try_start_a
    invoke-direct {v1, v0, v9, v5}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;II)V

    .line 846
    invoke-direct {v1, v2, v9, v5}, Ll/ۚ۠ܽ;->֫(Ll/ۡ۠ܽ;II)V

    add-int/lit8 v8, v8, 0x1

    .line 2792
    invoke-virtual {v3}, Ll/۠۠ܽ;->ۤ()Z

    move-result v9

    if-eqz v9, :cond_2f

    const/4 v0, 0x1

    iput-boolean v0, v1, Ll/ۚ۠ܽ;->֫:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-ltz v7, :cond_2d

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_2d
    if-eqz v11, :cond_2e

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_2e
    if-ltz v6, :cond_8

    goto/16 :goto_5

    :cond_2f
    move v9, v5

    move-object/from16 v10, v18

    move/from16 v5, v21

    goto :goto_b

    :catchall_0
    move-exception v0

    goto/16 :goto_12

    :cond_30
    move-object/from16 v18, v10

    :goto_c
    if-ge v8, v5, :cond_31

    const/4 v5, 0x1

    goto :goto_d

    :cond_31
    const/4 v5, 0x0

    .line 853
    :goto_d
    :try_start_b
    sget-object v10, Ll/֫֨ܽ;->ۗ:Ll/֫֨ܽ;

    move/from16 v21, v8

    move-object/from16 v8, v18

    if-ne v8, v10, :cond_38

    move-object/from16 v8, p3

    .line 854
    invoke-direct {v1, v9, v0, v8}, Ll/ۚ۠ܽ;->ۧ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v2

    .line 855
    iget-boolean v8, v1, Ll/ۚ۠ܽ;->֫:Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    if-eqz v8, :cond_34

    if-ltz v7, :cond_32

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_32
    if-eqz v11, :cond_33

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_33
    if-ltz v6, :cond_8

    goto/16 :goto_5

    :cond_34
    const/4 v8, 0x1

    if-ltz v2, :cond_35

    .line 856
    :try_start_c
    invoke-direct {v1, v2}, Ll/ۚ۠ܽ;->ܽ(I)V

    return v8

    .line 857
    :cond_35
    invoke-direct {v1, v0, v9, v5}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    if-ltz v7, :cond_36

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_36
    if-eqz v11, :cond_37

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_37
    if-ltz v6, :cond_8

    goto/16 :goto_5

    :cond_38
    move-object/from16 v8, p3

    move/from16 v18, v5

    move v5, v9

    move/from16 v10, v21

    :goto_e
    move/from16 v21, v9

    move/from16 v9, v19

    if-ltz v7, :cond_3a

    if-ne v10, v9, :cond_3a

    if-eqz v11, :cond_3a

    if-ltz v17, :cond_39

    move-object/from16 v19, v2

    move/from16 v2, v17

    .line 861
    :try_start_d
    invoke-virtual {v4, v2}, Ll/ᩴ۠ܽ;->֫(I)V

    move/from16 v17, v2

    goto :goto_f

    :cond_39
    move-object/from16 v19, v2

    .line 862
    :goto_f
    iget-object v2, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v20, v2, v12

    add-int/lit8 v22, v12, 0x1

    .line 863
    aput p1, v2, v22

    goto :goto_10

    :cond_3a
    move-object/from16 v19, v2

    .line 865
    :goto_10
    invoke-direct {v1, v5, v0, v8}, Ll/ۚ۠ܽ;->ۧ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I

    move-result v2

    .line 866
    iget-boolean v8, v1, Ll/ۚ۠ܽ;->֫:Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    if-eqz v8, :cond_3d

    if-ltz v7, :cond_3b

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_3b
    if-eqz v11, :cond_3c

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_3c
    if-ltz v6, :cond_8

    goto/16 :goto_5

    :cond_3d
    if-ltz v2, :cond_3f

    if-ltz v7, :cond_3e

    if-le v10, v9, :cond_3e

    sub-int v0, v5, v16

    move-object/from16 v8, v19

    .line 868
    :try_start_e
    invoke-direct {v1, v8, v0, v5}, Ll/ۚ۠ܽ;->֫(Ll/ۡ۠ܽ;II)V

    .line 869
    :cond_3e
    invoke-direct {v1, v2}, Ll/ۚ۠ܽ;->ܽ(I)V

    const/4 v0, 0x1

    return v0

    :cond_3f
    move-object/from16 v8, v19

    if-gt v10, v9, :cond_42

    move/from16 v9, v18

    move/from16 v2, v21

    .line 871
    invoke-direct {v1, v0, v2, v9}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    if-ltz v7, :cond_40

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_40
    if-eqz v11, :cond_41

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_41
    if-ltz v6, :cond_8

    goto/16 :goto_5

    :cond_42
    move/from16 v19, v9

    move/from16 v9, v18

    move/from16 v2, v21

    sub-int v5, v5, v16

    add-int/lit8 v10, v10, -0x1

    sub-int v0, v5, v16

    .line 874
    :try_start_f
    invoke-direct {v1, v8, v0, v5}, Ll/ۚ۠ܽ;->֫(Ll/ۡ۠ܽ;II)V

    .line 2792
    invoke-virtual {v3}, Ll/۠۠ܽ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_45

    const/4 v0, 0x1

    iput-boolean v0, v1, Ll/ۚ۠ܽ;->֫:Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    if-ltz v7, :cond_43

    .line 879
    iget-object v0, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v0, v7

    :cond_43
    if-eqz v11, :cond_44

    .line 881
    iget-object v0, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v0, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v0, v12

    :cond_44
    if-ltz v6, :cond_8

    .line 884
    invoke-virtual {v4, v6}, Ll/ᩴ۠ܽ;->֫(I)V

    goto/16 :goto_6

    :goto_11
    return v0

    :cond_45
    move-object/from16 v0, p2

    move/from16 v18, v9

    move v9, v2

    move-object v2, v8

    move-object/from16 v8, p3

    goto/16 :goto_e

    :goto_12
    if-ltz v7, :cond_46

    .line 879
    iget-object v2, v1, Ll/ۚ۠ܽ;->ۖ:[I

    aput v13, v2, v7

    :cond_46
    if-eqz v11, :cond_47

    .line 881
    iget-object v2, v3, Ll/۠۠ܽ;->ۢ:[I

    aput v14, v2, v12

    add-int/lit8 v12, v12, 0x1

    .line 882
    aput v15, v2, v12

    :cond_47
    if-ltz v6, :cond_48

    .line 884
    invoke-virtual {v4, v6}, Ll/ᩴ۠ܽ;->֫(I)V

    .line 886
    :cond_48
    throw v0
.end method

.method private ܿ(I)I
    .locals 1

    .line 2603
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v0, v0, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object v0, v0, Ll/۠۠ܽ;->ۚ:[I

    aget p1, v0, p1

    return p1

    :cond_0
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۖ:[I

    aget p1, v0, p1

    return p1
.end method

.method private ܿ()V
    .locals 8

    .line 2209
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    array-length v1, v0

    iget v2, p0, Ll/ۚ۠ܽ;->֡:I

    sub-int/2addr v1, v2

    const/16 v3, 0x20

    if-lt v1, v3, :cond_0

    return-void

    .line 2210
    :cond_0
    array-length v0, v0

    int-to-long v1, v2

    const-wide/16 v3, 0x20

    add-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Ll/ۚ۠ܽ;->֫(IJ)I

    move-result v0

    .line 2211
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ܽ()J

    move-result-wide v1

    iget-object v3, p0, Ll/ۚ۠ܽ;->ۚ:[I

    array-length v4, v3

    sub-int v4, v0, v4

    int-to-long v4, v4

    const-wide/16 v6, 0x4

    mul-long v4, v4, v6

    add-long/2addr v4, v1

    const/high16 v1, 0x2000000

    int-to-long v1, v1

    cmp-long v6, v4, v1

    if-gtz v6, :cond_1

    .line 2212
    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    return-void

    .line 2211
    :cond_1
    new-instance v0, Ll/֡۠ܽ;

    invoke-direct {v0}, Ll/֡۠ܽ;-><init>()V

    throw v0
.end method

.method private ܿ(II)V
    .locals 2

    .line 2628
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object v1, v0, Ll/۠۠ܽ;->ۢ:[I

    aget v1, v1, p1

    invoke-direct {p0, p1, v1}, Ll/ۚ۠ܽ;->ᩳ(II)V

    .line 2629
    iget-object v0, v0, Ll/۠۠ܽ;->ۢ:[I

    aput p2, v0, p1

    return-void
.end method

.method private ܿ(ILjava/lang/CharSequence;)Z
    .locals 11

    .line 1312
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget v1, v0, Ll/ۢ۠ܽ;->᩻:I

    .line 1313
    iget-object v2, v0, Ll/ۢ۠ܽ;->ܿ:[I

    .line 1314
    iget-object v0, v0, Ll/ۢ۠ܽ;->ܺ:[Ljava/lang/Object;

    .line 1315
    iget-object v3, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v4, v3, Ll/۠۠ܽ;->ܽ֫:I

    .line 2792
    :goto_0
    invoke-virtual {v3}, Ll/۠۠ܽ;->ۤ()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_0

    iput-boolean v7, p0, Ll/ۚ۠ܽ;->֫:Z

    return v6

    .line 1318
    :cond_0
    aget v5, v2, v1

    if-eq v5, v7, :cond_e

    const/16 v8, 0x10

    if-eq v5, v8, :cond_c

    const/16 v8, 0x14

    if-eq v5, v8, :cond_a

    const/4 v8, 0x3

    if-eq v5, v8, :cond_6

    const/4 v8, 0x4

    if-ne v5, v8, :cond_5

    add-int/lit8 v5, v1, 0x2

    .line 1342
    aget v5, v2, v5

    aget-object v5, v0, v5

    check-cast v5, Ll/ۧۚܽ;

    move v8, p1

    :cond_1
    if-ge v8, v4, :cond_2

    .line 1344
    invoke-interface {p2, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    invoke-interface {v5, v9}, Ll/ۧۚܽ;->֫(I)Z

    move-result v9

    if-eqz v9, :cond_2

    add-int/lit8 v8, v8, 0x1

    .line 2792
    invoke-virtual {v3}, Ll/۠۠ܽ;->ۤ()Z

    move-result v9

    if-eqz v9, :cond_1

    iput-boolean v7, p0, Ll/ۚ۠ܽ;->֫:Z

    return v6

    :cond_2
    if-lt v8, v4, :cond_3

    .line 1348
    iput-boolean v7, v3, Ll/۠۠ܽ;->ܺ:Z

    :cond_3
    sub-int p1, v8, p1

    add-int/lit8 v5, v1, 0x3

    .line 1349
    aget v5, v2, v5

    if-ge p1, v5, :cond_4

    goto/16 :goto_3

    :cond_4
    move p1, v8

    goto/16 :goto_4

    .line 1360
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid terminal regex prefix opcode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    add-int/lit8 v5, v1, 0x2

    .line 1327
    aget v5, v2, v5

    aget-object v5, v0, v5

    check-cast v5, [I

    const/4 v8, 0x0

    .line 1328
    :goto_1
    array-length v9, v5

    if-ge v8, v9, :cond_12

    if-lt p1, v4, :cond_7

    .line 1330
    iput-boolean v7, v3, Ll/۠۠ܽ;->ܺ:Z

    return v6

    .line 1333
    :cond_7
    aget v9, v5, v8

    add-int/lit8 v10, p1, 0x1

    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    if-eq v9, p1, :cond_8

    goto :goto_3

    .line 2792
    :cond_8
    invoke-virtual {v3}, Ll/۠۠ܽ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_9

    iput-boolean v7, p0, Ll/ۚ۠ܽ;->֫:Z

    return v6

    :cond_9
    add-int/lit8 v8, v8, 0x1

    move p1, v10

    goto :goto_1

    :cond_a
    add-int/lit8 v1, v1, 0x2

    .line 1353
    aget v1, v2, v1

    aget-object v0, v0, v1

    check-cast v0, Ll/ۘ۠ܽ;

    invoke-direct {p0, v0, p2, p1, v4}, Ll/ۚ۠ܽ;->֫(Ll/ۘ۠ܽ;Ljava/lang/CharSequence;II)I

    move-result p1

    .line 1354
    iget-boolean p2, p0, Ll/ۚ۠ܽ;->֫:Z

    if-nez p2, :cond_10

    if-gez p1, :cond_b

    goto :goto_3

    .line 1355
    :cond_b
    iget-object p2, v3, Ll/۠۠ܽ;->ۢ:[I

    iget v0, v3, Ll/۠۠ܽ;->᩻:I

    aput v0, p2, v6

    .line 1356
    invoke-virtual {v3, p1}, Ll/۠۠ܽ;->ܳ(I)V

    aput p1, p2, v7

    return v7

    :cond_c
    add-int/lit8 v5, v1, 0x2

    .line 1339
    aget v5, v2, v5

    add-int/lit8 v8, v1, 0x3

    aget v8, v2, v8

    if-eqz v8, :cond_d

    goto :goto_2

    :cond_d
    const/4 v7, 0x0

    :goto_2
    invoke-static {v5, v7, v3, p1, p2}, Ll/᩸۠ܽ;->֫(IZLl/۠۠ܽ;ILjava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_3

    :cond_e
    if-lt p1, v4, :cond_f

    .line 1321
    iput-boolean v7, v3, Ll/۠۠ܽ;->ܺ:Z

    return v6

    :cond_f
    add-int/lit8 v5, v1, 0x2

    .line 1324
    aget v5, v2, v5

    aget-object v5, v0, v5

    check-cast v5, Ll/ۧۚܽ;

    add-int/lit8 v7, p1, 0x1

    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    invoke-interface {v5, p1}, Ll/ۧۚܽ;->֫(I)Z

    move-result p1

    if-nez p1, :cond_11

    :cond_10
    :goto_3
    return v6

    :cond_11
    move p1, v7

    :cond_12
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 1362
    aget v1, v2, v1

    goto/16 :goto_0
.end method

.method private ܿ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z
    .locals 8

    .line 891
    iget v0, p2, Ll/ܽ֡ܽ;->᩻:I

    iget-object v1, p2, Ll/ܽ֡ܽ;->֡:Ll/ۡ۠ܽ;

    iget v1, v1, Ll/ۡ۠ܽ;->ܿ:I

    iget-object v2, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v3, v2, Ll/۠۠ܽ;->ܽ֫:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_0
    const/4 v6, 0x1

    if-ge v5, v1, :cond_3

    if-lt p1, v3, :cond_1

    .line 894
    iput-boolean v6, v2, Ll/۠۠ܽ;->ܺ:Z

    .line 895
    invoke-direct {p0, p2, p1, v6}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V

    return v4

    .line 897
    :cond_1
    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-eq v7, v0, :cond_2

    invoke-direct {p0, p2, p1, v6}, Ll/ۚ۠ܽ;->֫(Ll/ܽ֡ܽ;IZ)V

    return v4

    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 898
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ܽ(I)V

    add-int/lit8 v5, v5, 0x1

    .line 2792
    invoke-virtual {v2}, Ll/۠۠ܽ;->ۤ()Z

    move-result v7

    if-eqz v7, :cond_0

    iput-boolean v6, p0, Ll/ۚ۠ܽ;->֫:Z

    return v4

    .line 902
    :cond_3
    iget-boolean p1, v2, Ll/۠۠ܽ;->ۡ:Z

    if-eqz p1, :cond_4

    .line 903
    iput-boolean v6, p0, Ll/ۚ۠ܽ;->֫:Z

    return v4

    :cond_4
    return v6
.end method

.method private ᩳ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)I
    .locals 7

    .line 1151
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v4, v0, Ll/۠۠ܽ;->ܽ֫:I

    .line 1152
    iget-boolean v1, p2, Ll/ܽ֡ܽ;->ۜ:Z

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-lt p1, v4, :cond_0

    .line 1154
    iput-boolean v1, v0, Ll/۠۠ܽ;->ܺ:Z

    return v2

    .line 1157
    :cond_0
    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    iget v5, p2, Ll/ܽ֡ܽ;->ܿ:I

    if-eq v3, v5, :cond_1

    return v2

    :cond_1
    add-int/lit8 v3, p1, 0x1

    if-lt v3, v4, :cond_2

    .line 1159
    iput-boolean v1, v0, Ll/۠۠ܽ;->ܺ:Z

    return v2

    .line 1162
    :cond_2
    invoke-interface {p3, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    iget p2, p2, Ll/ܽ֡ܽ;->ۢ:I

    if-ne p3, p2, :cond_3

    add-int/lit8 p1, p1, 0x2

    return p1

    :cond_3
    return v2

    .line 1164
    :cond_4
    iget v0, p2, Ll/ܽ֡ܽ;->᩻:I

    if-ltz v0, :cond_5

    invoke-direct {p0, v0, p1, v4, p3}, Ll/ۚ۠ܽ;->֫(IIILjava/lang/CharSequence;)I

    move-result p1

    return p1

    .line 1165
    :cond_5
    iget v2, p2, Ll/ܽ֡ܽ;->ᩳ:I

    if-ltz v2, :cond_6

    iget-object v5, p2, Ll/ܽ֡ܽ;->᩷:Ll/ۧۚܽ;

    move-object v1, p0

    move v3, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Ll/ۚ۠ܽ;->֫(IIILl/ۧۚܽ;Ljava/lang/CharSequence;)I

    move-result p1

    return p1

    .line 1166
    :cond_6
    iget-object p2, p2, Ll/ܽ֡ܽ;->ܽ:Ljava/lang/Object;

    invoke-direct {p0, p1, v4, p3, p2}, Ll/ۚ۠ܽ;->֫(IILjava/lang/CharSequence;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method private ᩳ(I)V
    .locals 2

    .line 2201
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->֫(I)V

    .line 2202
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v1, p1, 0x4

    aget v1, v0, v1

    iput v1, p0, Ll/ۚ۠ܽ;->ۧ:I

    .line 2203
    iput p1, p0, Ll/ۚ۠ܽ;->֡:I

    add-int/lit8 p1, p1, 0xc

    .line 2204
    aget p1, v0, p1

    iput p1, p0, Ll/ۚ۠ܽ;->ᩳ:I

    return-void
.end method

.method private ᩳ(II)V
    .locals 6

    .line 2633
    iget-object v0, p0, Ll/ۚ۠ܽ;->᩸:[I

    array-length v1, v0

    iget v2, p0, Ll/ۚ۠ܽ;->᩹:I

    sub-int/2addr v1, v2

    const/4 v3, 0x2

    if-ge v1, v3, :cond_0

    .line 2634
    array-length v0, v0

    int-to-long v1, v2

    const-wide/16 v4, 0x2

    add-long/2addr v1, v4

    invoke-static {v0, v1, v2}, Ll/ۚ۠ܽ;->֫(IJ)I

    move-result v0

    .line 2635
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۖ:[I

    array-length v1, v1

    iget-object v2, p0, Ll/ۚ۠ܽ;->ܽ:[I

    array-length v2, v2

    invoke-direct {p0, v1, v2, v0}, Ll/ۚ۠ܽ;->ܽ(III)V

    .line 2636
    iget-object v1, p0, Ll/ۚ۠ܽ;->᩸:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۚ۠ܽ;->᩸:[I

    .line 2638
    :cond_0
    iget-object v0, p0, Ll/ۚ۠ܽ;->᩸:[I

    iget v1, p0, Ll/ۚ۠ܽ;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۚ۠ܽ;->᩹:I

    aput p1, v0, v1

    add-int/2addr v1, v3

    .line 2639
    iput v1, p0, Ll/ۚ۠ܽ;->᩹:I

    aput p2, v0, v2

    return-void
.end method

.method private ᩳ()Z
    .locals 6

    .line 240
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۖ:[I

    array-length v0, v0

    iget-object v1, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget v1, v1, Ll/ۢ۠ܽ;->ۖ:I

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    return v2

    .line 241
    :cond_0
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܽ:[I

    array-length v0, v0

    iget-object v3, p0, Ll/ۚ۠ܽ;->᩸:[I

    array-length v3, v3

    invoke-direct {p0, v1, v0, v3}, Ll/ۚ۠ܽ;->ܽ(III)V

    .line 242
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget v0, v0, Ll/ۢ۠ܽ;->ۖ:I

    new-array v0, v0, [I

    iput-object v0, p0, Ll/ۚ۠ܽ;->ۖ:[I

    .line 243
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ܽ()J

    move-result-wide v0

    const-wide/32 v3, 0x10000

    cmp-long v5, v0, v3

    if-lez v5, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v2
.end method

.method private ᩳ(ILjava/lang/CharSequence;)Z
    .locals 11

    .line 1228
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget v1, v0, Ll/ۢ۠ܽ;->᩻:I

    .line 1229
    iget-object v2, v0, Ll/ۢ۠ܽ;->ܿ:[I

    .line 1230
    iget-object v0, v0, Ll/ۢ۠ܽ;->ܺ:[Ljava/lang/Object;

    .line 1231
    iget-object v3, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v4, v3, Ll/۠۠ܽ;->ܽ֫:I

    .line 2792
    :goto_0
    invoke-virtual {v3}, Ll/۠۠ܽ;->ۤ()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_0

    iput-boolean v7, p0, Ll/ۚ۠ܽ;->֫:Z

    return v6

    .line 1234
    :cond_0
    aget v5, v2, v1

    if-eqz v5, :cond_17

    if-eq v5, v7, :cond_13

    const/4 v8, 0x3

    if-eq v5, v8, :cond_f

    const/4 v8, 0x4

    if-eq v5, v8, :cond_a

    const/4 v8, 0x7

    if-eq v5, v8, :cond_9

    const/16 v8, 0x8

    if-eq v5, v8, :cond_7

    const/16 v8, 0xb

    if-eq v5, v8, :cond_16

    const/16 v8, 0x10

    if-eq v5, v8, :cond_4

    const/16 v8, 0x1c

    if-eq v5, v8, :cond_2

    const/16 v8, 0x1d

    if-ne v5, v8, :cond_1

    goto :goto_1

    .line 1304
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid linear regex scan opcode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    add-int/lit8 v5, v1, 0x2

    .line 1261
    aget v5, v2, v5

    aget-object v5, v0, v5

    check-cast v5, [I

    add-int/lit8 v8, v1, 0x3

    aget v8, v2, v8

    invoke-static {v5, v8, v3, p2, p1}, Ll/֨۠ܽ;->֫([IILl/۠۠ܽ;Ljava/lang/CharSequence;I)I

    move-result p1

    const/4 v5, -0x2

    if-ne p1, v5, :cond_3

    .line 1263
    iput-boolean v7, p0, Ll/ۚ۠ܽ;->֫:Z

    return v6

    :cond_3
    const/4 v5, -0x1

    if-ne p1, v5, :cond_16

    goto/16 :goto_5

    :cond_4
    add-int/lit8 v5, v1, 0x2

    .line 1282
    aget v8, v2, v5

    add-int/lit8 v9, v1, 0x3

    aget v9, v2, v9

    if-eqz v9, :cond_5

    goto :goto_2

    :cond_5
    const/4 v7, 0x0

    :goto_2
    invoke-static {v8, v7, v3, p1, p2}, Ll/᩸۠ܽ;->֫(IZLl/۠۠ܽ;ILjava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_6

    goto/16 :goto_5

    .line 1283
    :cond_6
    aget v5, v2, v5

    if-nez v5, :cond_16

    const/high16 v5, -0x80000000

    invoke-direct {p0, v5, p1}, Ll/ۚ۠ܽ;->ᩳ(II)V

    goto/16 :goto_4

    :cond_7
    add-int/lit8 v5, v1, 0x2

    .line 1289
    aget v5, v2, v5

    invoke-direct {p0, v5}, Ll/ۚ۠ܽ;->ܿ(I)I

    move-result v5

    if-gez v5, :cond_8

    .line 1291
    invoke-virtual {v3, p1}, Ll/۠۠ܽ;->ܳ(I)V

    return v7

    :cond_8
    add-int/lit8 v6, v1, 0x3

    .line 1294
    aget v6, v2, v6

    if-eqz v6, :cond_16

    .line 1296
    invoke-direct {p0, v6, v5}, Ll/ۚ۠ܽ;->ܿ(II)V

    add-int/lit8 v6, v6, 0x1

    .line 1297
    invoke-direct {p0, v6, p1}, Ll/ۚ۠ܽ;->ܿ(II)V

    goto/16 :goto_4

    :cond_9
    add-int/lit8 v5, v1, 0x2

    .line 1286
    aget v5, v2, v5

    invoke-direct {p0, v5, p1}, Ll/ۚ۠ܽ;->ܳ(II)V

    goto/16 :goto_4

    :cond_a
    add-int/lit8 v5, v1, 0x2

    .line 1271
    aget v5, v2, v5

    aget-object v5, v0, v5

    check-cast v5, Ll/ۧۚܽ;

    move v8, p1

    :cond_b
    if-ge v8, v4, :cond_c

    .line 1273
    invoke-interface {p2, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    invoke-interface {v5, v9}, Ll/ۧۚܽ;->֫(I)Z

    move-result v9

    if-eqz v9, :cond_c

    add-int/lit8 v8, v8, 0x1

    .line 2792
    invoke-virtual {v3}, Ll/۠۠ܽ;->ۤ()Z

    move-result v9

    if-eqz v9, :cond_b

    iput-boolean v7, p0, Ll/ۚ۠ܽ;->֫:Z

    return v6

    :cond_c
    if-lt v8, v4, :cond_d

    .line 1277
    iput-boolean v7, v3, Ll/۠۠ܽ;->ܺ:Z

    :cond_d
    sub-int p1, v8, p1

    add-int/lit8 v5, v1, 0x3

    .line 1278
    aget v5, v2, v5

    if-ge p1, v5, :cond_e

    goto :goto_5

    :cond_e
    move p1, v8

    goto :goto_4

    :cond_f
    add-int/lit8 v5, v1, 0x2

    .line 1248
    aget v5, v2, v5

    aget-object v5, v0, v5

    check-cast v5, [I

    const/4 v8, 0x0

    .line 1249
    :goto_3
    array-length v9, v5

    if-ge v8, v9, :cond_16

    if-lt p1, v4, :cond_10

    .line 1251
    iput-boolean v7, v3, Ll/۠۠ܽ;->ܺ:Z

    return v6

    .line 1254
    :cond_10
    aget v9, v5, v8

    add-int/lit8 v10, p1, 0x1

    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    if-eq v9, p1, :cond_11

    goto :goto_5

    .line 2792
    :cond_11
    invoke-virtual {v3}, Ll/۠۠ܽ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_12

    iput-boolean v7, p0, Ll/ۚ۠ܽ;->֫:Z

    return v6

    :cond_12
    add-int/lit8 v8, v8, 0x1

    move p1, v10

    goto :goto_3

    :cond_13
    if-lt p1, v4, :cond_14

    .line 1242
    iput-boolean v7, v3, Ll/۠۠ܽ;->ܺ:Z

    return v6

    :cond_14
    add-int/lit8 v5, v1, 0x2

    .line 1245
    aget v5, v2, v5

    aget-object v5, v0, v5

    check-cast v5, Ll/ۧۚܽ;

    add-int/lit8 v7, p1, 0x1

    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    invoke-interface {v5, p1}, Ll/ۧۚܽ;->֫(I)Z

    move-result p1

    if-nez p1, :cond_15

    goto :goto_5

    :cond_15
    move p1, v7

    :cond_16
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 1306
    aget v1, v2, v1

    goto/16 :goto_0

    .line 1236
    :cond_17
    iget p2, v3, Ll/۠۠ܽ;->֫:I

    if-ne p2, v7, :cond_18

    if-eq p1, v4, :cond_18

    :goto_5
    return v6

    .line 1237
    :cond_18
    iget-object p2, v3, Ll/۠۠ܽ;->ۢ:[I

    iget v0, v3, Ll/۠۠ܽ;->᩻:I

    aput v0, p2, v6

    .line 1238
    invoke-virtual {v3, p1}, Ll/۠۠ܽ;->ܳ(I)V

    aput p1, p2, v7

    return v7
.end method

.method private ᩷(I)Z
    .locals 5

    .line 2050
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۢ(I)Ll/ۡ۠ܽ;

    move-result-object v0

    .line 2051
    iget v1, v0, Ll/ۡ۠ܽ;->ܽ:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-gez v1, :cond_0

    iget-object v1, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-boolean v1, v1, Ll/۠۠ܽ;->ۡ:Z

    if-eqz v1, :cond_0

    .line 2052
    iput-boolean v3, p0, Ll/ۚ۠ܽ;->֫:Z

    return v2

    .line 2055
    :cond_0
    iget-object v1, v0, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    sget-object v4, Ll/֫֨ܽ;->᩹:Ll/֫֨ܽ;

    if-ne v1, v4, :cond_1

    .line 2056
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v1, p1, 0x11

    aput v3, v0, v1

    add-int/lit8 v1, p1, 0x2

    .line 2057
    aget v1, v0, v1

    add-int/lit8 v2, p1, 0x12

    aget v0, v0, v2

    invoke-direct {p0, p1, v1, v0}, Ll/ۚ۠ܽ;->ۧ(III)V

    return v3

    .line 2059
    :cond_1
    sget-object v4, Ll/֫֨ܽ;->ۙ:Ll/֫֨ܽ;

    if-ne v1, v4, :cond_2

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0, v2}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v3

    .line 2060
    :cond_2
    iget-object v1, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v4, p1, 0x12

    aget v1, v1, v4

    iget v0, v0, Ll/ۡ۠ܽ;->ᩳ:I

    if-ge v1, v0, :cond_3

    const/4 v0, 0x4

    .line 2061
    invoke-direct {p0, p1, v0, v3}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v3

    :cond_3
    invoke-direct {p0, p1, v3, v2}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v3
.end method

.method private ᩻(II)V
    .locals 1

    .line 2607
    iget-object v0, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v0, v0, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object v0, v0, Ll/۠۠ܽ;->ۚ:[I

    aput p2, v0, p1

    return-void

    .line 2608
    :cond_0
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۖ:[I

    aput p2, v0, p1

    return-void
.end method

.method private ᩻(I)Z
    .locals 5

    .line 2169
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۚ:[I

    add-int/lit8 v1, p1, 0x12

    aget v1, v0, v1

    add-int/lit8 v2, p1, 0x14

    aget v0, v0, v2

    .line 2170
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۢ(I)Ll/ۡ۠ܽ;

    move-result-object v2

    iget v2, v2, Ll/ۡ۠ܽ;->ܽ:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ltz v2, :cond_0

    if-gt v1, v0, :cond_1

    .line 2179
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۡ(I)V

    const/16 v0, 0x9

    .line 2180
    invoke-direct {p0, p1, v0, v3}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v4

    :cond_0
    if-ge v1, v0, :cond_1

    .line 2173
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ᩳ(I)V

    return v3

    :cond_1
    const/16 v0, 0x8

    .line 2175
    invoke-direct {p0, p1, v0, v3}, Ll/ۚ۠ܽ;->֫(IIZ)V

    return v4
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 2723
    iget v0, p0, Ll/ۚ۠ܽ;->᩻:I

    if-eqz v0, :cond_0

    .line 2724
    iget v0, p0, Ll/ۚ۠ܽ;->ۜ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۚ۠ܽ;->ۜ:I

    .line 2725
    iget-object v0, p0, Ll/ۚ۠ܽ;->᩷:[J

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->fill([JJ)V

    const/4 v0, 0x0

    .line 2726
    iput v0, p0, Ll/ۚ۠ܽ;->᩻:I

    :cond_0
    return-void
.end method

.method public final ֫(ILjava/lang/CharSequence;)Z
    .locals 11

    .line 161
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget v1, v0, Ll/۠۠ܽ;->ۜ:I

    iget v2, v0, Ll/۠۠ܽ;->ܽ֫:I

    iget v3, v0, Ll/۠۠ܽ;->۠:I

    .line 162
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ۧ()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 165
    :try_start_0
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ᩳ()Z

    move-result v6
    :try_end_0
    .catch Ll/֡۠ܽ; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 166
    :try_start_1
    iget-object v7, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-object v7, v7, Ll/ۢ۠ܽ;->֫:Ll/᩻۠ܽ;

    if-eqz v7, :cond_0

    .line 167
    invoke-static {v7, v0, p1, p2}, Ll/ۚ۠ܽ;->֫(Ll/᩻۠ܽ;Ll/۠۠ܽ;ILjava/lang/CharSequence;)Z

    move-result v7
    :try_end_1
    .catch Ll/֡۠ܽ; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    if-eqz v7, :cond_0

    .line 201
    invoke-direct {p0, v1, v2, v3, v6}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    return v5

    .line 169
    :cond_0
    :try_start_2
    iget-object v7, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget v8, v7, Ll/ۢ۠ܽ;->ۢ:I
    :try_end_2
    .catch Ll/֡۠ܽ; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    iget-boolean v9, v7, Ll/ۢ۠ܽ;->ۡ:Z

    if-eq v8, v4, :cond_9

    const/4 v10, 0x2

    if-eq v8, v10, :cond_8

    const/4 v10, 0x3

    if-eq v8, v10, :cond_3

    const/4 v10, 0x4

    if-eq v8, v10, :cond_2

    const/4 v4, 0x5

    if-eq v8, v4, :cond_1

    .line 188
    :try_start_3
    iget v4, v7, Ll/ۢ۠ܽ;->᩻:I

    invoke-direct {p0, v4, p1, p2}, Ll/ۚ۠ܽ;->ۧ(IILjava/lang/CharSequence;)Z

    move-result p1

    goto :goto_0

    .line 180
    :cond_1
    invoke-direct {p0, p1, p2}, Ll/ۚ۠ܽ;->ᩳ(ILjava/lang/CharSequence;)Z

    move-result p1
    :try_end_3
    .catch Ll/֡۠ܽ; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_0

    .line 184
    :cond_2
    :try_start_4
    iget-object v7, v7, Ll/ۢ۠ܽ;->ᩳ:Ll/ۤ᩵ܽ;

    invoke-direct {p0, v7, p1, p2}, Ll/ۚ۠ܽ;->֫(Ll/ۤ᩵ܽ;ILjava/lang/CharSequence;)Z

    move-result p1
    :try_end_4
    .catch Ll/֡۠ܽ; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v9, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    const/4 v4, 0x1

    goto :goto_3

    .line 176
    :cond_3
    :try_start_5
    invoke-direct {p0, p1, p2}, Ll/ۚ۠ܽ;->ܿ(ILjava/lang/CharSequence;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_6

    .line 191
    iget-boolean p2, v0, Ll/۠۠ܽ;->۫:Z

    if-nez p2, :cond_4

    iget-object p2, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-boolean v0, p2, Ll/ۢ۠ܽ;->᩷:Z

    if-nez v0, :cond_4

    iget-boolean v0, p2, Ll/ۢ۠ܽ;->ۜ:Z

    if-nez v0, :cond_4

    iget-boolean p2, p2, Ll/ۢ۠ܽ;->ܽ:Z

    if-eqz p2, :cond_6

    .line 2654
    :cond_4
    invoke-direct {p0, v5}, Ll/ۚ۠ܽ;->ܳ(I)Z

    move-result p2
    :try_end_5
    .catch Ll/֡۠ܽ; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-nez p2, :cond_6

    if-eqz v9, :cond_5

    .line 199
    :try_start_6
    invoke-direct {p0, v5}, Ll/ۚ۠ܽ;->ۧ(Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    .line 201
    invoke-direct {p0, v1, v2, v3, v6}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    .line 202
    throw p1

    .line 201
    :cond_5
    :goto_1
    invoke-direct {p0, v1, v2, v3, v6}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    return v5

    :cond_6
    if-eqz v9, :cond_7

    .line 199
    :try_start_7
    invoke-direct {p0, p1}, Ll/ۚ۠ܽ;->ۧ(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    .line 201
    invoke-direct {p0, v1, v2, v3, v6}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    .line 202
    throw p1

    .line 201
    :cond_7
    :goto_2
    invoke-direct {p0, v1, v2, v3, v6}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    return p1

    :catchall_3
    move-exception p1

    move v4, v9

    goto :goto_4

    :catch_1
    move-exception p1

    move v4, v9

    goto :goto_3

    .line 173
    :cond_8
    :try_start_8
    iget-object v0, v7, Ll/ۢ۠ܽ;->ܳ:Ll/ܽ֡ܽ;

    invoke-direct {p0, p1, v0, p2}, Ll/ۚ۠ܽ;->֫(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_8
    .catch Ll/֡۠ܽ; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 201
    invoke-direct {p0, v1, v2, v3, v6}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    return p1

    .line 171
    :cond_9
    :try_start_9
    iget-object v0, v7, Ll/ۢ۠ܽ;->ۧ:Ll/۬᩵ܽ;

    invoke-direct {p0, v0, p1, p2}, Ll/ۚ۠ܽ;->֫(Ll/۬᩵ܽ;ILjava/lang/CharSequence;)Z

    move-result p1
    :try_end_9
    .catch Ll/֡۠ܽ; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 201
    invoke-direct {p0, v1, v2, v3, v6}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    return p1

    :catchall_4
    move-exception p1

    const/4 v4, 0x0

    goto :goto_4

    :catchall_5
    move-exception p1

    const/4 v4, 0x0

    const/4 v6, 0x0

    goto :goto_4

    :catch_2
    move-exception p1

    const/4 p2, 0x0

    const/4 v4, 0x0

    .line 196
    :goto_3
    :try_start_a
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :catchall_6
    move-exception p1

    const/4 v6, 0x1

    :goto_4
    if-eqz v4, :cond_a

    .line 199
    :try_start_b
    invoke-direct {p0, v5}, Ll/ۚ۠ܽ;->ۧ(Z)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    goto :goto_5

    :catchall_7
    move-exception p1

    .line 201
    invoke-direct {p0, v1, v2, v3, v6}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    .line 202
    throw p1

    .line 201
    :cond_a
    :goto_5
    invoke-direct {p0, v1, v2, v3, v6}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    .line 203
    throw p1
.end method

.method public final ۧ(ILjava/lang/CharSequence;)Z
    .locals 7

    .line 208
    iget-object v0, p0, Ll/ۚ۠ܽ;->ۢ:Ll/۠۠ܽ;

    iget-object v1, v0, Ll/۠۠ܽ;->ܿ:Ll/֫֡ܽ;

    iget-object v2, v1, Ll/֫֡ܽ;->ۡ:Ll/ۛۚܽ;

    iget-object v1, v1, Ll/֫֡ܽ;->᩻:Ll/ۛۚܽ;

    if-ne v2, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Ll/ۚ۠ܽ;->֫(ILjava/lang/CharSequence;)Z

    move-result p1

    return p1

    .line 209
    :cond_0
    iget v1, v0, Ll/۠۠ܽ;->ۜ:I

    iget v2, v0, Ll/۠۠ܽ;->ܽ֫:I

    iget v0, v0, Ll/۠۠ܽ;->۠:I

    .line 210
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ۧ()V

    .line 213
    :try_start_0
    invoke-direct {p0}, Ll/ۚ۠ܽ;->ᩳ()Z

    move-result v3
    :try_end_0
    .catch Ll/֡۠ܽ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 214
    :try_start_1
    iget-object v4, p0, Ll/ۚ۠ܽ;->ۡ:Ll/֫֡ܽ;

    iget-object v4, v4, Ll/֫֡ܽ;->ۡ:Ll/ۛۚܽ;

    .line 215
    iget-object v5, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-object v6, v5, Ll/ۢ۠ܽ;->᩵:Ll/ۖ۠ܽ;

    if-eqz v6, :cond_1

    invoke-direct {p0, v6, p1, p2}, Ll/ۚ۠ܽ;->֫(Ll/ۖ۠ܽ;ILjava/lang/CharSequence;)Z

    move-result p1
    :try_end_1
    .catch Ll/֡۠ܽ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 227
    invoke-direct {p0, v1, v2, v0, v3}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    return p1

    .line 216
    :cond_1
    :try_start_2
    iget-object v5, v5, Ll/ۢ۠ܽ;->ܳ:Ll/ܽ֡ܽ;

    if-eqz v5, :cond_3

    .line 217
    iget-boolean v5, v5, Ll/ܽ֡ܽ;->᩵:Z

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-class v6, Ll/֡֨ܽ;

    if-ne v5, v6, :cond_2

    .line 218
    iget-object v4, p0, Ll/ۚ۠ܽ;->ܺ:Ll/ۢ۠ܽ;

    iget-object v4, v4, Ll/ۢ۠ܽ;->ܳ:Ll/ܽ֡ܽ;

    invoke-direct {p0, p1, v4, p2}, Ll/ۚ۠ܽ;->ܳ(ILl/ܽ֡ܽ;Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_2
    .catch Ll/֡۠ܽ; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 227
    invoke-direct {p0, v1, v2, v0, v3}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    return p1

    .line 220
    :cond_2
    :try_start_3
    invoke-direct {p0, v4, p1, p2}, Ll/ۚ۠ܽ;->֫(Ll/ۛۚܽ;ILjava/lang/CharSequence;)Z

    move-result p1
    :try_end_3
    .catch Ll/֡۠ܽ; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 227
    invoke-direct {p0, v1, v2, v0, v3}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    return p1

    .line 222
    :cond_3
    :try_start_4
    invoke-direct {p0, v4, p1, p2}, Ll/ۚ۠ܽ;->ۧ(Ll/ۛۚܽ;ILjava/lang/CharSequence;)Z

    move-result p1
    :try_end_4
    .catch Ll/֡۠ܽ; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 227
    invoke-direct {p0, v1, v2, v0, v3}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    const/4 v3, 0x0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 225
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p1

    const/4 v3, 0x1

    .line 227
    :goto_0
    invoke-direct {p0, v1, v2, v0, v3}, Ll/ۚ۠ܽ;->֫(IIIZ)V

    .line 228
    throw p1
.end method
