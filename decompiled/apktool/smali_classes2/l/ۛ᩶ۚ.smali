.class public final Ll/ۛ᩶ۚ;
.super Ljava/lang/Object;
.source "DAUC"


# instance fields
.field public ֫:I

.field public ۖ:I

.field public ۘ:[Ll/۫᩶ۚ;

.field public ۜ:I

.field public ۡ:[Ll/ۤ᩶ۚ;

.field public ۢ:[Ll/ۤ᩶ۚ;

.field public ۧ:Ll/ᩳ᩶ۚ;

.field public ܳ:I

.field public ܺ:I

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ll/ᩳ᩶ۚ;

.field public final ᩳ:Ll/ۜ᩶ۚ;

.field public ᩷:I

.field public ᩻:[Ll/۫᩶ۚ;


# direct methods
.method public constructor <init>(Ll/ۜ᩶ۚ;)V
    .locals 0

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    iput-object p1, p0, Ll/ۛ᩶ۚ;->ᩳ:Ll/ۜ᩶ۚ;

    const/16 p1, 0x100

    new-array p1, p1, [Ll/۫᩶ۚ;

    .line 148
    iput-object p1, p0, Ll/ۛ᩶ۚ;->᩻:[Ll/۫᩶ۚ;

    const/4 p1, 0x1

    .line 149
    iput p1, p0, Ll/ۛ᩶ۚ;->ܳ:I

    .line 150
    new-instance p1, Ll/ᩳ᩶ۚ;

    invoke-direct {p1}, Ll/ᩳ᩶ۚ;-><init>()V

    iput-object p1, p0, Ll/ۛ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    return-void
.end method

.method private ֫(Ll/۫᩶ۚ;)I
    .locals 4

    .line 1300
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۘ:[Ll/۫᩶ۚ;

    if-nez v0, :cond_0

    const/16 v0, 0x10

    new-array v0, v0, [Ll/۫᩶ۚ;

    .line 1301
    iput-object v0, p0, Ll/ۛ᩶ۚ;->ۘ:[Ll/۫᩶ۚ;

    .line 1303
    :cond_0
    iget v0, p0, Ll/ۛ᩶ۚ;->ۖ:I

    iget-object v1, p0, Ll/ۛ᩶ۚ;->ۘ:[Ll/۫᩶ۚ;

    array-length v2, v1

    if-ne v0, v2, :cond_1

    .line 1304
    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Ll/۫᩶ۚ;

    .line 1305
    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1306
    iput-object v0, p0, Ll/ۛ᩶ۚ;->ۘ:[Ll/۫᩶ۚ;

    .line 1308
    :cond_1
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۘ:[Ll/۫᩶ۚ;

    iget v1, p0, Ll/ۛ᩶ۚ;->ۖ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۛ᩶ۚ;->ۖ:I

    aput-object p1, v0, v1

    .line 1309
    invoke-direct {p0, p1}, Ll/ۛ᩶ۚ;->ۧ(Ll/۫᩶ۚ;)V

    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    return p1
.end method

.method private ֫(IJ)Ll/۫᩶ۚ;
    .locals 8

    long-to-int v0, p2

    add-int/2addr v0, p1

    const/16 v1, 0x20

    ushr-long v1, p2, v1

    long-to-int v2, v1

    add-int/2addr v0, v2

    const v1, 0x7fffffff

    and-int v5, v0, v1

    .line 720
    invoke-direct {p0, v5}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 722
    iget v1, v0, Ll/۬᩶ۚ;->ܳ:I

    if-ne v1, p1, :cond_0

    iget v1, v0, Ll/۫᩶ۚ;->ۜ:I

    if-ne v1, v5, :cond_0

    iget-wide v1, v0, Ll/۬᩶ۚ;->֫:J

    cmp-long v3, v1, p2

    if-nez v3, :cond_0

    return-object v0

    .line 725
    :cond_0
    iget-object v0, v0, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_0

    .line 727
    :cond_1
    iget v3, p0, Ll/ۛ᩶ۚ;->ܳ:I

    .line 728
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    invoke-virtual {v0, p1}, Ll/ᩳ᩶ۚ;->֫(I)V

    invoke-virtual {v0, p2, p3}, Ll/ᩳ᩶ۚ;->֫(J)V

    .line 729
    iget v0, p0, Ll/ۛ᩶ۚ;->ܳ:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/ۛ᩶ۚ;->ܳ:I

    .line 730
    new-instance v0, Ll/۫᩶ۚ;

    move-object v2, v0

    move v4, p1

    move-wide v6, p2

    invoke-direct/range {v2 .. v7}, Ll/۫᩶ۚ;-><init>(IIIJ)V

    invoke-direct {p0, v0}, Ll/ۛ᩶ۚ;->ۧ(Ll/۫᩶ۚ;)V

    return-object v0
.end method

.method private ֫(Ljava/lang/String;IILjava/lang/String;)Ll/۫᩶ۚ;
    .locals 11

    .line 1391
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int v1, v1, v0

    const/4 v0, 0x1

    invoke-static {p3, v0, v1, p2}, Ll/᩶ۢᩴ;->֫(IIII)I

    move-result v0

    const v1, 0x7fffffff

    and-int v10, v0, v1

    .line 971
    invoke-direct {p0, v10}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 973
    iget v1, v0, Ll/۬᩶ۚ;->ܳ:I

    if-ne v1, p2, :cond_0

    iget v1, v0, Ll/۫᩶ۚ;->ۜ:I

    if-ne v1, v10, :cond_0

    iget-wide v1, v0, Ll/۬᩶ۚ;->֫:J

    int-to-long v3, p3

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    iget-object v1, v0, Ll/۬᩶ۚ;->ᩳ:Ljava/lang/String;

    .line 976
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/۬᩶ۚ;->᩻:Ljava/lang/String;

    .line 977
    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 980
    :cond_0
    iget-object v0, v0, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_0

    .line 982
    :cond_1
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    invoke-virtual {p0, p1, p4}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, p2, p3, v1}, Ll/ᩳ᩶ۚ;->֫(III)V

    .line 983
    new-instance v0, Ll/۫᩶ۚ;

    iget v3, p0, Ll/ۛ᩶ۚ;->ܳ:I

    add-int/lit8 v1, v3, 0x1

    iput v1, p0, Ll/ۛ᩶ۚ;->ܳ:I

    const/4 v5, 0x0

    int-to-long v8, p3

    move-object v2, v0

    move v4, p2

    move-object v6, p1

    move-object v7, p4

    invoke-direct/range {v2 .. v10}, Ll/۫᩶ۚ;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    invoke-direct {p0, v0}, Ll/ۛ᩶ۚ;->ۧ(Ll/۫᩶ۚ;)V

    return-object v0
.end method

.method private ֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/۫᩶ۚ;
    .locals 11

    .line 1396
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int v1, v1, v0

    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int v0, v0, v1

    add-int/2addr v0, p2

    const v1, 0x7fffffff

    and-int v10, v0, v1

    .line 586
    invoke-direct {p0, v10}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 588
    iget v1, v0, Ll/۬᩶ۚ;->ܳ:I

    if-ne v1, p2, :cond_0

    iget v1, v0, Ll/۫᩶ۚ;->ۜ:I

    if-ne v1, v10, :cond_0

    iget-object v1, v0, Ll/۬᩶ۚ;->ܿ:Ljava/lang/String;

    .line 590
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/۬᩶ۚ;->ᩳ:Ljava/lang/String;

    .line 591
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/۬᩶ۚ;->᩻:Ljava/lang/String;

    .line 592
    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 595
    :cond_0
    iget-object v0, v0, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_0

    :cond_1
    const/4 v0, 0x7

    .line 539
    invoke-direct {p0, v0, p1}, Ll/ۛ᩶ۚ;->ܽ(ILjava/lang/String;)Ll/۫᩶ۚ;

    move-result-object v0

    .line 598
    iget v0, v0, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {p0, p3, p4}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 597
    iget-object v2, p0, Ll/ۛ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    invoke-virtual {v2, p2, v0, v1}, Ll/ᩳ᩶ۚ;->֫(III)V

    .line 599
    new-instance v0, Ll/۫᩶ۚ;

    iget v3, p0, Ll/ۛ᩶ۚ;->ܳ:I

    add-int/lit8 v1, v3, 0x1

    iput v1, p0, Ll/ۛ᩶ۚ;->ܳ:I

    const-wide/16 v8, 0x0

    move-object v2, v0

    move v4, p2

    move-object v5, p1

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v10}, Ll/۫᩶ۚ;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    invoke-direct {p0, v0}, Ll/ۛ᩶ۚ;->ۧ(Ll/۫᩶ۚ;)V

    return-object v0
.end method

.method private ۧ(II)Ll/۫᩶ۚ;
    .locals 8

    const v0, 0x7fffffff

    add-int v1, p1, p2

    and-int v5, v1, v0

    .line 665
    invoke-direct {p0, v5}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 667
    iget v1, v0, Ll/۬᩶ۚ;->ܳ:I

    if-ne v1, p1, :cond_0

    iget v1, v0, Ll/۫᩶ۚ;->ۜ:I

    if-ne v1, v5, :cond_0

    iget-wide v1, v0, Ll/۬᩶ۚ;->֫:J

    int-to-long v3, p2

    cmp-long v6, v1, v3

    if-nez v6, :cond_0

    return-object v0

    .line 670
    :cond_0
    iget-object v0, v0, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_0

    .line 672
    :cond_1
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    invoke-virtual {v0, p1}, Ll/ᩳ᩶ۚ;->֫(I)V

    invoke-virtual {v0, p2}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    .line 673
    new-instance v0, Ll/۫᩶ۚ;

    iget v3, p0, Ll/ۛ᩶ۚ;->ܳ:I

    add-int/lit8 v1, v3, 0x1

    iput v1, p0, Ll/ۛ᩶ۚ;->ܳ:I

    int-to-long v6, p2

    move-object v2, v0

    move v4, p1

    invoke-direct/range {v2 .. v7}, Ll/۫᩶ۚ;-><init>(IIIJ)V

    invoke-direct {p0, v0}, Ll/ۛ᩶ۚ;->ۧ(Ll/۫᩶ۚ;)V

    return-object v0
.end method

.method private ۧ(Ll/۫᩶ۚ;)V
    .locals 7

    .line 433
    iget v0, p0, Ll/ۛ᩶ۚ;->ۜ:I

    iget-object v1, p0, Ll/ۛ᩶ۚ;->᩻:[Ll/۫᩶ۚ;

    array-length v2, v1

    mul-int/lit8 v2, v2, 0x3

    div-int/lit8 v2, v2, 0x4

    if-le v0, v2, :cond_2

    .line 434
    array-length v0, v1

    mul-int/lit8 v1, v0, 0x2

    add-int/lit8 v1, v1, 0x1

    .line 436
    new-array v2, v1, [Ll/۫᩶ۚ;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 438
    iget-object v3, p0, Ll/ۛ᩶ۚ;->᩻:[Ll/۫᩶ۚ;

    aget-object v3, v3, v0

    :goto_0
    if-eqz v3, :cond_0

    .line 440
    iget v4, v3, Ll/۫᩶ۚ;->ۜ:I

    rem-int/2addr v4, v1

    .line 441
    iget-object v5, v3, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    .line 442
    aget-object v6, v2, v4

    iput-object v6, v3, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    .line 443
    aput-object v3, v2, v4

    move-object v3, v5

    goto :goto_0

    .line 447
    :cond_1
    iput-object v2, p0, Ll/ۛ᩶ۚ;->᩻:[Ll/۫᩶ۚ;

    .line 449
    :cond_2
    iget v0, p0, Ll/ۛ᩶ۚ;->ۜ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۛ᩶ۚ;->ۜ:I

    .line 450
    iget v0, p1, Ll/۫᩶ۚ;->ۜ:I

    iget-object v1, p0, Ll/ۛ᩶ۚ;->᩻:[Ll/۫᩶ۚ;

    array-length v2, v1

    rem-int/2addr v0, v2

    .line 451
    aget-object v2, v1, v0

    iput-object v2, p1, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    .line 452
    aput-object p1, v1, v0

    return-void
.end method

.method private ܽ(ILjava/lang/String;)Ll/۫᩶ۚ;
    .locals 4

    .line 1378
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, p1

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    .line 1046
    invoke-direct {p0, v0}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    .line 1048
    iget v2, v1, Ll/۬᩶ۚ;->ܳ:I

    if-ne v2, p1, :cond_0

    iget v2, v1, Ll/۫᩶ۚ;->ۜ:I

    if-ne v2, v0, :cond_0

    iget-object v2, v1, Ll/۬᩶ۚ;->᩻:Ljava/lang/String;

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 1051
    :cond_0
    iget-object v1, v1, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_0

    .line 1053
    :cond_1
    iget-object v1, p0, Ll/ۛ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    invoke-virtual {p0, p2}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, p1, v2}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    .line 1054
    new-instance v1, Ll/۫᩶ۚ;

    iget v2, p0, Ll/ۛ᩶ۚ;->ܳ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۛ᩶ۚ;->ܳ:I

    invoke-direct {v1, v2, p1, v0, p2}, Ll/۫᩶ۚ;-><init>(IIILjava/lang/String;)V

    invoke-direct {p0, v1}, Ll/ۛ᩶ۚ;->ۧ(Ll/۫᩶ۚ;)V

    return-object v1
.end method

.method private ᩳ(I)Ll/۫᩶ۚ;
    .locals 2

    .line 420
    iget-object v0, p0, Ll/ۛ᩶ۚ;->᩻:[Ll/۫᩶ۚ;

    array-length v1, v0

    rem-int/2addr p1, v1

    aget-object p1, v0, p1

    return-object p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 384
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۧ:Ll/ᩳ᩶ۚ;

    if-eqz v0, :cond_0

    const-string v0, "BootstrapMethods"

    .line 385
    invoke-virtual {p0, v0}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    .line 386
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۧ:Ll/ᩳ᩶ۚ;

    iget v0, v0, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/lit8 v0, v0, 0x8

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(II)I
    .locals 11

    const/16 v0, 0x20

    if-ge p1, p2, :cond_0

    int-to-long v1, p1

    int-to-long v3, p2

    goto :goto_0

    :cond_0
    int-to-long v1, p2

    int-to-long v3, p1

    :goto_0
    shl-long/2addr v3, v0

    or-long v9, v1, v3

    add-int v0, p1, p2

    const v1, 0x7fffffff

    const/16 v2, 0x83

    add-int/2addr v0, v2

    and-int v8, v0, v1

    .line 1277
    invoke-direct {p0, v8}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_2

    .line 1279
    iget v1, v0, Ll/۬᩶ۚ;->ܳ:I

    if-ne v1, v2, :cond_1

    iget v1, v0, Ll/۫᩶ۚ;->ۜ:I

    if-ne v1, v8, :cond_1

    iget-wide v3, v0, Ll/۬᩶ۚ;->֫:J

    cmp-long v1, v3, v9

    if-nez v1, :cond_1

    .line 1280
    iget p1, v0, Ll/۬᩶ۚ;->ܽ:I

    return p1

    .line 1282
    :cond_1
    iget-object v0, v0, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_1

    .line 1284
    :cond_2
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۘ:[Ll/۫᩶ۚ;

    aget-object p1, v0, p1

    iget-object p1, p1, Ll/۬᩶ۚ;->᩻:Ljava/lang/String;

    .line 1285
    aget-object p2, v0, p2

    iget-object p2, p2, Ll/۬᩶ۚ;->᩻:Ljava/lang/String;

    .line 1094
    const-class v0, Ll/ۜ᩶ۚ;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    .line 1060
    :try_start_0
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1066
    :try_start_1
    invoke-virtual {p2, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1070
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    .line 1073
    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_4

    move-object p1, p2

    goto :goto_3

    .line 1076
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Class;->isInterface()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    .line 1080
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v3

    .line 1081
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 1082
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_6
    :goto_2
    const-string p1, "java/lang/Object"

    .line 1286
    :goto_3
    invoke-virtual {p0, p1}, Ll/ۛ᩶ۚ;->ܿ(Ljava/lang/String;)I

    move-result p1

    .line 1287
    new-instance p2, Ll/۫᩶ۚ;

    iget v6, p0, Ll/ۛ᩶ۚ;->ۖ:I

    const/16 v7, 0x83

    move-object v5, p2

    invoke-direct/range {v5 .. v10}, Ll/۫᩶ۚ;-><init>(IIIJ)V

    invoke-direct {p0, p2}, Ll/ۛ᩶ۚ;->ۧ(Ll/۫᩶ۚ;)V

    iput p1, p2, Ll/۬᩶ۚ;->ܽ:I

    return p1

    :catch_0
    move-exception p1

    .line 1068
    new-instance v0, Ljava/lang/TypeNotPresentException;

    invoke-direct {v0, p2, p1}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p2

    .line 1062
    new-instance v0, Ljava/lang/TypeNotPresentException;

    invoke-direct {v0, p1, p2}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫(ILjava/lang/String;)I
    .locals 10

    .line 1382
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x81

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    const v2, 0x7fffffff

    and-int v6, v0, v2

    .line 1220
    invoke-direct {p0, v6}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 1222
    iget v2, v0, Ll/۬᩶ۚ;->ܳ:I

    if-ne v2, v1, :cond_0

    iget v2, v0, Ll/۫᩶ۚ;->ۜ:I

    if-ne v2, v6, :cond_0

    iget-wide v2, v0, Ll/۬᩶ۚ;->֫:J

    int-to-long v4, p1

    cmp-long v7, v2, v4

    if-nez v7, :cond_0

    iget-object v2, v0, Ll/۬᩶ۚ;->᩻:Ljava/lang/String;

    .line 1225
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1226
    iget p1, v0, Ll/۬᩶ۚ;->ۧ:I

    return p1

    .line 1228
    :cond_0
    iget-object v0, v0, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_0

    .line 1230
    :cond_1
    new-instance v0, Ll/۫᩶ۚ;

    iget v4, p0, Ll/ۛ᩶ۚ;->ۖ:I

    const/16 v5, 0x81

    int-to-long v7, p1

    move-object v3, v0

    move-object v9, p2

    invoke-direct/range {v3 .. v9}, Ll/۫᩶ۚ;-><init>(IIIJLjava/lang/String;)V

    invoke-direct {p0, v0}, Ll/ۛ᩶ۚ;->֫(Ll/۫᩶ۚ;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 1386
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int v1, v1, v0

    const/16 v0, 0xc

    add-int/2addr v1, v0

    const v2, 0x7fffffff

    and-int/2addr v1, v2

    .line 756
    invoke-direct {p0, v1}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_1

    .line 758
    iget v3, v2, Ll/۬᩶ۚ;->ܳ:I

    if-ne v3, v0, :cond_0

    iget v3, v2, Ll/۫᩶ۚ;->ۜ:I

    if-ne v3, v1, :cond_0

    iget-object v3, v2, Ll/۬᩶ۚ;->ᩳ:Ljava/lang/String;

    .line 760
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v2, Ll/۬᩶ۚ;->᩻:Ljava/lang/String;

    .line 761
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 762
    iget p1, v2, Ll/۬᩶ۚ;->ۧ:I

    return p1

    .line 764
    :cond_0
    iget-object v2, v2, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_0

    .line 766
    :cond_1
    invoke-virtual {p0, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p0, p2}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v3

    iget-object v4, p0, Ll/ۛ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    invoke-virtual {v4, v0, v2, v3}, Ll/ᩳ᩶ۚ;->֫(III)V

    .line 767
    new-instance v0, Ll/۫᩶ۚ;

    iget v2, p0, Ll/ۛ᩶ۚ;->ܳ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۛ᩶ۚ;->ܳ:I

    invoke-direct {v0, p1, v2, v1, p2}, Ll/۫᩶ۚ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    invoke-direct {p0, v0}, Ll/ۛ᩶ۚ;->ۧ(Ll/۫᩶ۚ;)V

    return v2
.end method

.method public final ֫(Ll/֨᩶ۚ;)I
    .locals 10

    .line 1322
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۢ:[Ll/ۤ᩶ۚ;

    if-nez v0, :cond_0

    const/16 v0, 0x10

    new-array v1, v0, [Ll/ۤ᩶ۚ;

    .line 1323
    iput-object v1, p0, Ll/ۛ᩶ۚ;->ۢ:[Ll/ۤ᩶ۚ;

    new-array v0, v0, [Ll/ۤ᩶ۚ;

    .line 1324
    iput-object v0, p0, Ll/ۛ᩶ۚ;->ۡ:[Ll/ۤ᩶ۚ;

    .line 1326
    :cond_0
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    .line 1327
    iget-object v1, p0, Ll/ۛ᩶ۚ;->ۢ:[Ll/ۤ᩶ۚ;

    array-length v2, v1

    rem-int v2, v0, v2

    aget-object v1, v1, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 1328
    iget-object v2, v1, Ll/ۤ᩶ۚ;->ۧ:Ll/֨᩶ۚ;

    if-eq v2, p1, :cond_1

    .line 1329
    iget-object v1, v1, Ll/ۤ᩶ۚ;->ܽ:Ll/ۤ᩶ۚ;

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    goto :goto_2

    .line 1335
    :cond_2
    iget v1, p0, Ll/ۛ᩶ۚ;->᩷:I

    iget-object v2, p0, Ll/ۛ᩶ۚ;->ۢ:[Ll/ۤ᩶ۚ;

    array-length v3, v2

    mul-int/lit8 v3, v3, 0x3

    div-int/lit8 v3, v3, 0x4

    if-le v1, v3, :cond_5

    .line 1336
    array-length v1, v2

    mul-int/lit8 v2, v1, 0x2

    add-int/lit8 v2, v2, 0x1

    .line 1338
    new-array v3, v2, [Ll/ۤ᩶ۚ;

    :cond_3
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_4

    .line 1340
    iget-object v4, p0, Ll/ۛ᩶ۚ;->ۢ:[Ll/ۤ᩶ۚ;

    aget-object v4, v4, v1

    :goto_1
    if-eqz v4, :cond_3

    .line 1342
    iget-object v5, v4, Ll/ۤ᩶ۚ;->ۧ:Ll/֨᩶ۚ;

    invoke-static {v5}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v5

    rem-int/2addr v5, v2

    .line 1343
    iget-object v6, v4, Ll/ۤ᩶ۚ;->ܽ:Ll/ۤ᩶ۚ;

    .line 1344
    aget-object v7, v3, v5

    iput-object v7, v4, Ll/ۤ᩶ۚ;->ܽ:Ll/ۤ᩶ۚ;

    .line 1345
    aput-object v4, v3, v5

    move-object v4, v6

    goto :goto_1

    .line 1349
    :cond_4
    iput-object v3, p0, Ll/ۛ᩶ۚ;->ۢ:[Ll/ۤ᩶ۚ;

    .line 1351
    :cond_5
    iget v1, p0, Ll/ۛ᩶ۚ;->᩷:I

    iget-object v2, p0, Ll/ۛ᩶ۚ;->ۡ:[Ll/ۤ᩶ۚ;

    array-length v3, v2

    if-ne v1, v3, :cond_6

    .line 1352
    array-length v1, v2

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [Ll/ۤ᩶ۚ;

    .line 1353
    array-length v3, v2

    const/4 v4, 0x0

    invoke-static {v2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1354
    iput-object v1, p0, Ll/ۛ᩶ۚ;->ۡ:[Ll/ۤ᩶ۚ;

    .line 1357
    :cond_6
    new-instance v1, Ll/ۤ᩶ۚ;

    iget v2, p0, Ll/ۛ᩶ۚ;->᩷:I

    invoke-direct {v1, v2, p1}, Ll/ۤ᩶ۚ;-><init>(ILl/֨᩶ۚ;)V

    .line 1358
    iget-object p1, p0, Ll/ۛ᩶ۚ;->ۢ:[Ll/ۤ᩶ۚ;

    array-length v3, p1

    rem-int/2addr v0, v3

    .line 1359
    aget-object v3, p1, v0

    iput-object v3, v1, Ll/ۤ᩶ۚ;->ܽ:Ll/ۤ᩶ۚ;

    .line 1360
    aput-object v1, p1, v0

    .line 1361
    iget-object p1, p0, Ll/ۛ᩶ۚ;->ۡ:[Ll/ۤ᩶ۚ;

    add-int/lit8 v0, v2, 0x1

    iput v0, p0, Ll/ۛ᩶ۚ;->᩷:I

    aput-object v1, p1, v2

    .line 1244
    :goto_2
    iget p1, v1, Ll/ۤ᩶ۚ;->֫:I

    const v0, 0x7fffffff

    const/16 v1, 0x82

    add-int/lit16 v2, p1, 0x82

    and-int v6, v2, v0

    .line 1246
    invoke-direct {p0, v6}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v0

    :goto_3
    const-string v9, ""

    if-eqz v0, :cond_8

    .line 1248
    iget v2, v0, Ll/۬᩶ۚ;->ܳ:I

    if-ne v2, v1, :cond_7

    iget v2, v0, Ll/۫᩶ۚ;->ۜ:I

    if-ne v2, v6, :cond_7

    iget-wide v2, v0, Ll/۬᩶ۚ;->֫:J

    int-to-long v4, p1

    cmp-long v7, v2, v4

    if-nez v7, :cond_7

    iget-object v2, v0, Ll/۬᩶ۚ;->᩻:Ljava/lang/String;

    .line 1251
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1252
    iget p1, v0, Ll/۬᩶ۚ;->ۧ:I

    return p1

    .line 1254
    :cond_7
    iget-object v0, v0, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_3

    .line 1256
    :cond_8
    new-instance v0, Ll/۫᩶ۚ;

    iget v4, p0, Ll/ۛ᩶ۚ;->ۖ:I

    const/16 v5, 0x82

    int-to-long v7, p1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Ll/۫᩶ۚ;-><init>(IIIJLjava/lang/String;)V

    invoke-direct {p0, v0}, Ll/ۛ᩶ۚ;->֫(Ll/۫᩶ۚ;)I

    move-result p1

    return p1
.end method

.method public final ֫(D)Ll/۫᩶ۚ;
    .locals 1

    const/4 v0, 0x6

    .line 707
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    invoke-direct {p0, v0, p1, p2}, Ll/ۛ᩶ۚ;->֫(IJ)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(F)Ll/۫᩶ۚ;
    .locals 1

    const/4 v0, 0x4

    .line 652
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-direct {p0, v0, p1}, Ll/ۛ᩶ۚ;->ۧ(II)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Ll/۫᩶ۚ;
    .locals 1

    const/4 v0, 0x3

    .line 641
    invoke-direct {p0, v0, p1}, Ll/ۛ᩶ۚ;->ۧ(II)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/۫᩶ۚ;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v2, p5

    const/4 v3, 0x4

    if-le v1, v3, :cond_0

    if-eqz v2, :cond_0

    shl-int/lit8 v7, v1, 0x8

    goto :goto_0

    :cond_0
    move v7, v1

    .line 1405
    :goto_0
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v8

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->hashCode()I

    move-result v9

    mul-int v9, v9, v8

    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->hashCode()I

    move-result v8

    mul-int v8, v8, v9

    mul-int v8, v8, v7

    const/16 v9, 0xf

    add-int/2addr v8, v9

    const v10, 0x7fffffff

    and-int/2addr v10, v8

    .line 839
    invoke-direct {v0, v10}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v8

    :goto_1
    if-eqz v8, :cond_2

    .line 841
    iget v11, v8, Ll/۬᩶ۚ;->ܳ:I

    if-ne v11, v9, :cond_1

    iget v11, v8, Ll/۫᩶ۚ;->ۜ:I

    if-ne v11, v10, :cond_1

    iget-wide v11, v8, Ll/۬᩶ۚ;->֫:J

    int-to-long v13, v7

    cmp-long v15, v11, v13

    if-nez v15, :cond_1

    iget-object v11, v8, Ll/۬᩶ۚ;->ܿ:Ljava/lang/String;

    .line 844
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    iget-object v11, v8, Ll/۬᩶ۚ;->ᩳ:Ljava/lang/String;

    .line 845
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    iget-object v11, v8, Ll/۬᩶ۚ;->᩻:Ljava/lang/String;

    .line 846
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    return-object v8

    .line 849
    :cond_1
    iget-object v8, v8, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_1

    .line 851
    :cond_2
    iget-object v8, v0, Ll/ۛ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    if-gt v1, v3, :cond_3

    const/16 v2, 0x9

    .line 552
    invoke-direct {v0, v4, v2, v5, v6}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object v2

    .line 852
    iget v2, v2, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v8, v1, v2}, Ll/ᩳ᩶ۚ;->ۧ(II)V

    goto :goto_2

    .line 855
    :cond_3
    invoke-virtual {v0, v4, v5, v6, v2}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/۫᩶ۚ;

    move-result-object v2

    iget v2, v2, Ll/۬᩶ۚ;->ۧ:I

    .line 854
    invoke-virtual {v8, v1, v2}, Ll/ᩳ᩶ۚ;->ۧ(II)V

    .line 857
    :goto_2
    new-instance v11, Ll/۫᩶ۚ;

    iget v2, v0, Ll/ۛ᩶ۚ;->ܳ:I

    add-int/lit8 v1, v2, 0x1

    iput v1, v0, Ll/ۛ᩶ۚ;->ܳ:I

    const/16 v3, 0xf

    int-to-long v7, v7

    move-object v1, v11

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move v9, v10

    invoke-direct/range {v1 .. v9}, Ll/۫᩶ۚ;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    invoke-direct {v0, v11}, Ll/ۛ᩶ۚ;->ۧ(Ll/۫᩶ۚ;)V

    return-object v11
.end method

.method public final ֫(J)Ll/۫᩶ۚ;
    .locals 1

    const/4 v0, 0x5

    .line 696
    invoke-direct {p0, v0, p1, p2}, Ll/ۛ᩶ۚ;->֫(IJ)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;)Ll/۫᩶ۚ;
    .locals 6

    .line 483
    instance-of v0, p1, Ljava/lang/Integer;

    const/4 v1, 0x3

    if-eqz v0, :cond_0

    .line 484
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 641
    invoke-direct {p0, v1, p1}, Ll/ۛ᩶ۚ;->ۧ(II)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 485
    :cond_0
    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_1

    .line 486
    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->intValue()I

    move-result p1

    .line 641
    invoke-direct {p0, v1, p1}, Ll/ۛ᩶ۚ;->ۧ(II)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 487
    :cond_1
    instance-of v0, p1, Ljava/lang/Character;

    if-eqz v0, :cond_2

    .line 488
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    .line 641
    invoke-direct {p0, v1, p1}, Ll/ۛ᩶ۚ;->ۧ(II)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 489
    :cond_2
    instance-of v0, p1, Ljava/lang/Short;

    if-eqz v0, :cond_3

    .line 490
    check-cast p1, Ljava/lang/Short;

    invoke-virtual {p1}, Ljava/lang/Short;->intValue()I

    move-result p1

    .line 641
    invoke-direct {p0, v1, p1}, Ll/ۛ᩶ۚ;->ۧ(II)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 491
    :cond_3
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    .line 492
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 641
    invoke-direct {p0, v1, p1}, Ll/ۛ᩶ۚ;->ۧ(II)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 493
    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_5

    .line 494
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۛ᩶ۚ;->֫(F)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 495
    :cond_5
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_6

    .line 496
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const/4 p1, 0x5

    .line 696
    invoke-direct {p0, p1, v0, v1}, Ll/ۛ᩶ۚ;->֫(IJ)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 497
    :cond_6
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_7

    .line 498
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ۛ᩶ۚ;->֫(D)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 499
    :cond_7
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_8

    .line 500
    check-cast p1, Ljava/lang/String;

    const/16 v0, 0x8

    .line 630
    invoke-direct {p0, v0, p1}, Ll/ۛ᩶ۚ;->ܽ(ILjava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 501
    :cond_8
    instance-of v0, p1, Ll/ۨ᩶ۚ;

    if-eqz v0, :cond_b

    .line 502
    check-cast p1, Ll/ۨ᩶ۚ;

    .line 503
    invoke-virtual {p1}, Ll/ۨ᩶ۚ;->ܿ()I

    move-result v0

    const/16 v1, 0xa

    const/4 v2, 0x7

    if-ne v0, v1, :cond_9

    .line 505
    invoke-virtual {p1}, Ll/ۨ᩶ۚ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    .line 539
    invoke-direct {p0, v2, p1}, Ll/ۛ᩶ۚ;->ܽ(ILjava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    :cond_9
    const/16 v1, 0xb

    if-ne v0, v1, :cond_a

    .line 507
    invoke-virtual {p1}, Ll/ۨ᩶ۚ;->֫()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x10

    .line 911
    invoke-direct {p0, v0, p1}, Ll/ۛ᩶ۚ;->ܽ(ILjava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 509
    :cond_a
    invoke-virtual {p1}, Ll/ۨ᩶ۚ;->֫()Ljava/lang/String;

    move-result-object p1

    .line 539
    invoke-direct {p0, v2, p1}, Ll/ۛ᩶ۚ;->ܽ(ILjava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 511
    :cond_b
    instance-of v0, p1, Ll/֡᩶ۚ;

    if-eqz v0, :cond_c

    .line 512
    check-cast p1, Ll/֡᩶ۚ;

    .line 514
    invoke-virtual {p1}, Ll/֡᩶ۚ;->ᩳ()I

    move-result v1

    .line 515
    invoke-virtual {p1}, Ll/֡᩶ۚ;->ܽ()Ljava/lang/String;

    move-result-object v2

    .line 516
    invoke-virtual {p1}, Ll/֡᩶ۚ;->ۧ()Ljava/lang/String;

    move-result-object v3

    .line 517
    invoke-virtual {p1}, Ll/֡᩶ۚ;->֫()Ljava/lang/String;

    move-result-object v4

    .line 518
    invoke-virtual {p1}, Ll/֡᩶ۚ;->ܿ()Z

    move-result v5

    move-object v0, p0

    .line 513
    invoke-virtual/range {v0 .. v5}, Ll/ۛ᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 519
    :cond_c
    instance-of v0, p1, Ll/᩷᩶ۚ;

    if-eqz v0, :cond_d

    .line 520
    check-cast p1, Ll/᩷᩶ۚ;

    .line 522
    invoke-virtual {p1}, Ll/᩷᩶ۚ;->ܿ()Ljava/lang/String;

    move-result-object v0

    .line 523
    invoke-virtual {p1}, Ll/᩷᩶ۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    .line 524
    invoke-virtual {p1}, Ll/᩷᩶ۚ;->֫()Ll/֡᩶ۚ;

    move-result-object v2

    .line 525
    invoke-virtual {p1}, Ll/᩷᩶ۚ;->ܽ()[Ljava/lang/Object;

    move-result-object p1

    .line 930
    invoke-virtual {p0, v2, p1}, Ll/ۛ᩶ۚ;->֫(Ll/֡᩶ۚ;[Ljava/lang/Object;)Ll/۫᩶ۚ;

    move-result-object p1

    const/16 v2, 0x11

    .line 931
    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    invoke-direct {p0, v0, v2, p1, v1}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;IILjava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1

    .line 527
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "value "

    .line 0
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 527
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/۫᩶ۚ;
    .locals 1

    const/4 v0, 0x7

    .line 539
    invoke-direct {p0, v0, p1}, Ll/ۛ᩶ۚ;->ܽ(ILjava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/۫᩶ۚ;
    .locals 1

    const/16 v0, 0x9

    .line 552
    invoke-direct {p0, p1, v0, p2, p3}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/۫᩶ۚ;
    .locals 0

    if-eqz p4, :cond_0

    const/16 p4, 0xb

    goto :goto_0

    :cond_0
    const/16 p4, 0xa

    .line 568
    :goto_0
    invoke-direct {p0, p1, p4, p2, p3}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ֫(Ljava/lang/String;Ljava/lang/String;Ll/֡᩶ۚ;[Ljava/lang/Object;)Ll/۫᩶ۚ;
    .locals 0

    .line 951
    invoke-virtual {p0, p3, p4}, Ll/ۛ᩶ۚ;->֫(Ll/֡᩶ۚ;[Ljava/lang/Object;)Ll/۫᩶ۚ;

    move-result-object p3

    const/16 p4, 0x12

    .line 952
    iget p3, p3, Ll/۬᩶ۚ;->ۧ:I

    invoke-direct {p0, p1, p4, p3, p2}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;IILjava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ֫(Ll/֡᩶ۚ;[Ljava/lang/Object;)Ll/۫᩶ۚ;
    .locals 10

    .line 1086
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۧ:Ll/ᩳ᩶ۚ;

    if-nez v0, :cond_0

    .line 1088
    new-instance v0, Ll/ᩳ᩶ۚ;

    invoke-direct {v0}, Ll/ᩳ᩶ۚ;-><init>()V

    iput-object v0, p0, Ll/ۛ᩶ۚ;->ۧ:Ll/ᩳ᩶ۚ;

    .line 1095
    :cond_0
    array-length v1, p2

    .line 1096
    new-array v2, v1, [I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 1098
    aget-object v4, p2, v3

    invoke-virtual {p0, v4}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/Object;)Ll/۫᩶ۚ;

    move-result-object v4

    iget v4, v4, Ll/۬᩶ۚ;->ۧ:I

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1104
    :cond_1
    iget v3, v0, Ll/ᩳ᩶ۚ;->ۧ:I

    .line 1107
    invoke-virtual {p1}, Ll/֡᩶ۚ;->ᩳ()I

    move-result v5

    .line 1108
    invoke-virtual {p1}, Ll/֡᩶ۚ;->ܽ()Ljava/lang/String;

    move-result-object v6

    .line 1109
    invoke-virtual {p1}, Ll/֡᩶ۚ;->ۧ()Ljava/lang/String;

    move-result-object v7

    .line 1110
    invoke-virtual {p1}, Ll/֡᩶ۚ;->֫()Ljava/lang/String;

    move-result-object v8

    .line 1111
    invoke-virtual {p1}, Ll/֡᩶ۚ;->ܿ()Z

    move-result v9

    move-object v4, p0

    .line 1106
    invoke-virtual/range {v4 .. v9}, Ll/ۛ᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/۫᩶ۚ;

    move-result-object v4

    iget v4, v4, Ll/۬᩶ۚ;->ۧ:I

    .line 1105
    invoke-virtual {v0, v4}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 1114
    invoke-virtual {v0, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_2

    .line 1116
    aget v5, v2, v4

    invoke-virtual {v0, v5}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 1120
    :cond_2
    iget v0, v0, Ll/ᩳ᩶ۚ;->ۧ:I

    sub-int/2addr v0, v3

    .line 1121
    invoke-virtual {p1}, Ll/֡᩶ۚ;->hashCode()I

    move-result p1

    .line 1122
    array-length v1, p2

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v1, :cond_3

    aget-object v4, p2, v2

    .line 1123
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    xor-int/2addr p1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    const p2, 0x7fffffff

    and-int v7, p1, p2

    .line 1142
    iget-object p1, p0, Ll/ۛ᩶ۚ;->ۧ:Ll/ᩳ᩶ۚ;

    iget-object p1, p1, Ll/ᩳ᩶ۚ;->֫:[B

    .line 1143
    invoke-direct {p0, v7}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object p2

    :goto_3
    if-eqz p2, :cond_7

    .line 1145
    iget v1, p2, Ll/۬᩶ۚ;->ܳ:I

    const/16 v2, 0x40

    if-ne v1, v2, :cond_6

    iget v1, p2, Ll/۫᩶ۚ;->ۜ:I

    if-ne v1, v7, :cond_6

    .line 1146
    iget-wide v1, p2, Ll/۬᩶ۚ;->֫:J

    long-to-int v2, v1

    const/4 v1, 0x0

    :goto_4
    if-ge v1, v0, :cond_5

    add-int v4, v3, v1

    .line 1149
    aget-byte v4, p1, v4

    add-int v5, v2, v1

    aget-byte v5, p1, v5

    if-eq v4, v5, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 1155
    :cond_5
    iget-object p1, p0, Ll/ۛ᩶ۚ;->ۧ:Ll/ᩳ᩶ۚ;

    iput v3, p1, Ll/ᩳ᩶ۚ;->ۧ:I

    return-object p2

    .line 1159
    :cond_6
    :goto_5
    iget-object p2, p2, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_3

    .line 1161
    :cond_7
    new-instance p1, Ll/۫᩶ۚ;

    iget v5, p0, Ll/ۛ᩶ۚ;->֫:I

    add-int/lit8 p2, v5, 0x1

    iput p2, p0, Ll/ۛ᩶ۚ;->֫:I

    const/16 v6, 0x40

    int-to-long v8, v3

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Ll/۫᩶ۚ;-><init>(IIIJ)V

    invoke-direct {p0, p1}, Ll/ۛ᩶ۚ;->ۧ(Ll/۫᩶ۚ;)V

    return-object p1
.end method

.method public final ֫(Ll/ᩳ᩶ۚ;)V
    .locals 3

    .line 399
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۧ:Ll/ᩳ᩶ۚ;

    if-eqz v0, :cond_0

    const-string v0, "BootstrapMethods"

    .line 401
    invoke-virtual {p0, v0}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۧ:Ll/ᩳ᩶ۚ;

    iget v0, v0, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/lit8 v0, v0, 0x2

    .line 402
    invoke-virtual {p1, v0}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    iget v0, p0, Ll/ۛ᩶ۚ;->֫:I

    .line 403
    invoke-virtual {p1, v0}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۧ:Ll/ᩳ᩶ۚ;

    iget-object v1, v0, Ll/ᩳ᩶ۚ;->֫:[B

    const/4 v2, 0x0

    iget v0, v0, Ll/ᩳ᩶ۚ;->ۧ:I

    .line 404
    invoke-virtual {p1, v2, v0, v1}, Ll/ᩳ᩶ۚ;->֫(II[B)V

    :cond_0
    return-void
.end method

.method public final ۧ(ILjava/lang/String;)I
    .locals 0

    .line 344
    iput p1, p0, Ll/ۛ᩶ۚ;->ܺ:I

    .line 345
    iput-object p2, p0, Ll/ۛ᩶ۚ;->ܽ:Ljava/lang/String;

    const/4 p1, 0x7

    .line 539
    invoke-direct {p0, p1, p2}, Ll/ۛ᩶ۚ;->ܽ(ILjava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    .line 346
    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    return p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 332
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(I)Ll/֨᩶ۚ;
    .locals 3

    .line 1187
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۡ:[Ll/ۤ᩶ۚ;

    iget-object v1, p0, Ll/ۛ᩶ۚ;->ۘ:[Ll/۫᩶ۚ;

    aget-object p1, v1, p1

    iget-wide v1, p1, Ll/۬᩶ۚ;->֫:J

    long-to-int p1, v1

    aget-object p1, v0, p1

    iget-object p1, p1, Ll/ۤ᩶ۚ;->ۧ:Ll/֨᩶ۚ;

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;)Ll/۫᩶ۚ;
    .locals 1

    const/16 v0, 0x13

    .line 1018
    invoke-direct {p0, v0, p1}, Ll/ۛ᩶ۚ;->ܽ(ILjava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ᩳ᩶ۚ;)V
    .locals 3

    .line 374
    iget v0, p0, Ll/ۛ᩶ۚ;->ܳ:I

    invoke-virtual {p1, v0}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget-object v0, p0, Ll/ۛ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    iget-object v1, v0, Ll/ᩳ᩶ۚ;->֫:[B

    const/4 v2, 0x0

    iget v0, v0, Ll/ᩳ᩶ۚ;->ۧ:I

    invoke-virtual {p1, v2, v0, v1}, Ll/ᩳ᩶ۚ;->֫(II[B)V

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 355
    iget v0, p0, Ll/ۛ᩶ۚ;->ܳ:I

    return v0
.end method

.method public final ܽ(I)Ll/۫᩶ۚ;
    .locals 1

    .line 1175
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ۘ:[Ll/۫᩶ۚ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ܽ(Ljava/lang/String;)Ll/۫᩶ۚ;
    .locals 1

    const/16 v0, 0x14

    .line 1029
    invoke-direct {p0, v0, p1}, Ll/ۛ᩶ۚ;->ܽ(ILjava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ()I
    .locals 1

    .line 323
    iget v0, p0, Ll/ۛ᩶ۚ;->ܺ:I

    return v0
.end method

.method public final ܿ(Ljava/lang/String;)I
    .locals 4

    .line 1378
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x80

    add-int/2addr v0, v1

    const v2, 0x7fffffff

    and-int/2addr v0, v2

    .line 1199
    invoke-direct {p0, v0}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_1

    .line 1201
    iget v3, v2, Ll/۬᩶ۚ;->ܳ:I

    if-ne v3, v1, :cond_0

    iget v3, v2, Ll/۫᩶ۚ;->ۜ:I

    if-ne v3, v0, :cond_0

    iget-object v3, v2, Ll/۬᩶ۚ;->᩻:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1202
    iget p1, v2, Ll/۬᩶ۚ;->ۧ:I

    return p1

    .line 1204
    :cond_0
    iget-object v2, v2, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_0

    .line 1206
    :cond_1
    new-instance v2, Ll/۫᩶ۚ;

    iget v3, p0, Ll/ۛ᩶ۚ;->ۖ:I

    invoke-direct {v2, v3, v1, v0, p1}, Ll/۫᩶ۚ;-><init>(IIILjava/lang/String;)V

    invoke-direct {p0, v2}, Ll/ۛ᩶ۚ;->֫(Ll/۫᩶ۚ;)I

    move-result p1

    return p1
.end method

.method public final ᩳ()I
    .locals 1

    .line 364
    iget-object v0, p0, Ll/ۛ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    iget v0, v0, Ll/ᩳ᩶ۚ;->ۧ:I

    return v0
.end method

.method public final ᩳ(Ljava/lang/String;)I
    .locals 5

    .line 1378
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    const v2, 0x7fffffff

    and-int/2addr v0, v2

    .line 791
    invoke-direct {p0, v0}, Ll/ۛ᩶ۚ;->ᩳ(I)Ll/۫᩶ۚ;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_1

    .line 793
    iget v3, v2, Ll/۬᩶ۚ;->ܳ:I

    if-ne v3, v1, :cond_0

    iget v3, v2, Ll/۫᩶ۚ;->ۜ:I

    if-ne v3, v0, :cond_0

    iget-object v3, v2, Ll/۬᩶ۚ;->᩻:Ljava/lang/String;

    .line 795
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 796
    iget p1, v2, Ll/۬᩶ۚ;->ۧ:I

    return p1

    .line 798
    :cond_0
    iget-object v2, v2, Ll/۫᩶ۚ;->᩷:Ll/۫᩶ۚ;

    goto :goto_0

    .line 800
    :cond_1
    iget-object v2, p0, Ll/ۛ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    invoke-virtual {v2, v1}, Ll/ᩳ᩶ۚ;->֫(I)V

    invoke-virtual {v2, p1}, Ll/ᩳ᩶ۚ;->֫(Ljava/lang/String;)V

    .line 801
    new-instance v2, Ll/۫᩶ۚ;

    iget v3, p0, Ll/ۛ᩶ۚ;->ܳ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/ۛ᩶ۚ;->ܳ:I

    invoke-direct {v2, v3, v1, v0, p1}, Ll/۫᩶ۚ;-><init>(IIILjava/lang/String;)V

    invoke-direct {p0, v2}, Ll/ۛ᩶ۚ;->ۧ(Ll/۫᩶ۚ;)V

    return v3
.end method
