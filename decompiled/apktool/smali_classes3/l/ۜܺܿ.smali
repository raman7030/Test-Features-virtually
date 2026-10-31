.class public final Ll/ۜܺܿ;
.super Ljava/lang/Object;
.source "U4S1"

# interfaces
.implements Ll/᩷᩷ܿ;


# instance fields
.field public final ֫:Ll/۟ۢܿ;

.field public final ۧ:Ll/᩷ۡܿ;

.field public final ܽ:Ll/᩻ܺܿ;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;)V
    .locals 2

    .line 40
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v1, Ll/۟ۢܿ;

    invoke-direct {v1}, Ll/۟ۢܿ;-><init>()V

    iput-object v1, p0, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;

    .line 45
    new-instance v1, Ll/᩷ۡܿ;

    invoke-direct {v1, p1, v0}, Ll/᩷ۡܿ;-><init>(Ll/۫ۨᩳ;Ll/᩶۫᩷;)V

    iput-object v1, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    .line 46
    iget-object p1, v1, Ll/᩷ۡܿ;->᩻:Ll/᩻ܺܿ;

    iput-object p1, p0, Ll/ۜܺܿ;->ܽ:Ll/᩻ܺܿ;

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/᩶᩸ᩳ;III)V
    .locals 8

    .line 555
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    .line 556
    invoke-static {p4, v2}, Ll/ۡۜܿ;->ۧ(ILjava/lang/String;)I

    move-result v0

    .line 557
    new-instance v7, Ll/ۘۗܿ;

    const/4 v1, 0x1

    if-eq p4, v1, :cond_0

    const/4 v3, 0x2

    if-eq p4, v3, :cond_0

    const/4 v3, 0x3

    if-eq p4, v3, :cond_0

    const/16 v3, 0xb

    if-eq p4, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v7, p0, v1}, Ll/ۘۗܿ;-><init>(Landroid/content/Context;Z)V

    new-instance p0, Ll/ܿܺܿ;

    move-object v1, p0

    move v3, p4

    move-object v4, p1

    move v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Ll/ܿܺܿ;-><init>(Ljava/lang/String;ILl/᩶᩸ᩳ;II)V

    .line 558
    invoke-virtual {v7, p0}, Ll/ۘۗܿ;->֫(Ll/ۖۗܿ;)V

    .line 565
    invoke-virtual {v7, v0}, Ll/ۘۗܿ;->֫(I)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/CharSequence;IIFLl/ۢ۫ۡ;)F
    .locals 8

    .line 289
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    .line 290
    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۡ()Ll/ۢۖܿ;

    move-result-object v2

    .line 289
    iget-object v1, p0, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Ll/۟ۢܿ;->֫(Ll/ۢۖܿ;Ljava/lang/CharSequence;IIFLl/ۢ۫ۡ;)F

    move-result p1

    return p1
.end method

.method public final ֫(II)J
    .locals 2

    .line 270
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    .line 271
    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۡ()Ll/ۢۖܿ;

    move-result-object v0

    .line 270
    iget-object v1, p0, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;

    invoke-virtual {v1, p1, p2, v0}, Ll/۟ۢܿ;->֫(IILl/ۢۖܿ;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ֫(Ljava/lang/CharSequence;IILl/ۢ۫ۡ;)Ll/ۜ۫ۡ;
    .locals 8

    .line 296
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۡ()Ll/ۢۖܿ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 297
    invoke-virtual {v0}, Ll/ۢۖܿ;->֫()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    new-instance v1, Ll/ᩳۖܿ;

    invoke-direct {v1}, Ll/ᩳۖܿ;-><init>()V

    invoke-virtual {v1, v0}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 301
    new-instance v7, Ll/ᩳܺܿ;

    invoke-direct {v7, v0, v1, p3}, Ll/ᩳܺܿ;-><init>(Ll/ۢۖܿ;Ll/ᩳۖܿ;I)V

    const/4 v6, 0x0

    move-object v2, p4

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-virtual/range {v2 .. v7}, Ll/ۢ۫ۡ;->֫(Ljava/lang/CharSequence;IIFLl/ᩳܺܿ;)Ll/ۜ۫ۡ;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p4

    move-object v1, p1

    move v2, p2

    move v3, p3

    .line 766
    invoke-virtual/range {v0 .. v5}, Ll/ۢ۫ۡ;->֫(Ljava/lang/CharSequence;IIFLl/ᩳܺܿ;)Ll/ۜ۫ۡ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Ll/᩸᩷ܿ;
    .locals 2

    .line 1955
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ܳ()Ll/ۜۢܿ;

    move-result-object v0

    if-eqz v0, :cond_2

    if-ltz p1, :cond_2

    .line 1956
    invoke-virtual {v0}, Ll/ۜۢܿ;->ۧ()I

    move-result v1

    if-ge p1, v1, :cond_2

    add-int/lit8 v1, p1, 0x1

    .line 1957
    invoke-virtual {v0, p1, v1}, Ll/ۜۢܿ;->ۧ(II)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 1960
    :cond_0
    invoke-virtual {v0, p1}, Ll/ۜۢܿ;->֫(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۜۢܿ;->ܽ(I)Ll/ܶۜܿ;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 1961
    :cond_1
    sget v0, Ll/ۙ᩷ܿ;->ۧ:I

    invoke-virtual {p1, v0}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(IILjava/lang/CharSequence;)Ll/᩸᩷ܿ;
    .locals 3

    .line 362
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->᩷()Ll/ۜۢܿ;

    move-result-object v1

    .line 363
    iget-object v2, p0, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;

    if-eqz v1, :cond_0

    .line 364
    invoke-virtual {v2, v1, p3, p1, p2}, Ll/۟ۢܿ;->֫(Ll/ۜۢܿ;Ljava/lang/CharSequence;II)Ll/᩸᩷ܿ;

    move-result-object p1

    return-object p1

    .line 367
    :cond_0
    invoke-virtual {v0}, Ll/᩷ۡܿ;->᩻()Ll/ۢۖܿ;

    move-result-object v0

    .line 366
    invoke-virtual {v2, v0, p3, p1, p2}, Ll/۟ۢܿ;->֫(Ll/ۢۖܿ;Ljava/lang/CharSequence;II)Ll/᩸᩷ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 155
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->֫()V

    return-void
.end method

.method public final ֫(FI)V
    .locals 1

    .line 345
    iget-object v0, p0, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;

    invoke-virtual {v0, p1, p2}, Ll/۟ۢܿ;->֫(FI)V

    return-void
.end method

.method public final ֫(IIILjava/lang/CharSequence;)V
    .locals 1

    .line 259
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/᩷ۡܿ;->֫(IIILjava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFILl/֫ۖܽ;Ll/᩺֫ܿ;[I)V
    .locals 14

    move-object v0, p0

    .line 327
    iget-object v1, v0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v1}, Ll/᩷ۡܿ;->ۡ()Ll/ۢۖܿ;

    move-result-object v3

    iget-object v2, v0, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;

    move-object v4, p1

    move-object/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    invoke-virtual/range {v2 .. v13}, Ll/۟ۢܿ;->֫(Ll/ۢۖܿ;Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFILandroid/graphics/Paint;Ll/᩺֫ܿ;[I)V

    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIILl/֫ۖܽ;Ll/᩺֫ܿ;)V
    .locals 16

    move-object/from16 v1, p0

    .line 310
    iget-object v0, v1, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    iget-object v2, v1, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;

    move/from16 v7, p3

    move/from16 v8, p4

    invoke-virtual {v0, v2, v7, v8}, Ll/᩷ۡܿ;->֫(Ll/۟ۢܿ;II)V

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v3, -0x1

    .line 312
    :try_start_0
    iget-object v3, v1, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۡ()Ll/ۢۖܿ;

    move-result-object v4

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    move/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    invoke-virtual/range {v3 .. v13}, Ll/۟ۢܿ;->֫(Ll/ۢۖܿ;Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIILandroid/graphics/Paint;Ll/᩺֫ܿ;)V

    .line 314
    invoke-virtual {v2}, Ll/۟ۢܿ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    const/high16 v3, 0x3f800000    # 1.0f

    .line 315
    invoke-virtual {v2, v3, v15}, Ll/۟ۢܿ;->֫(FI)V

    .line 316
    invoke-virtual {v0}, Ll/᩷ۡܿ;->᩵()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    const/4 v0, -0x1

    .line 319
    invoke-virtual {v2, v14, v0, v0, v15}, Ll/۟ۢܿ;->֫(Ll/۬ۢܿ;III)V

    return-void

    :catchall_0
    move-exception v0

    const/4 v3, -0x1

    goto :goto_0

    :catchall_1
    move-exception v0

    :goto_0
    invoke-virtual {v2, v14, v3, v3, v15}, Ll/۟ۢܿ;->֫(Ll/۬ۢܿ;III)V

    .line 320
    throw v0
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    .line 229
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->֫(Ll/ۤۜܽ;)V

    return-void
.end method

.method public final ֫(Ll/᩶᩸ᩳ;)V
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;)V

    return-void
.end method

.method public final ֫(Ll/᩶᩸ᩳ;II)V
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;II)V

    return-void
.end method

.method public final ֫(III)Z
    .locals 2

    .line 340
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۡ()Ll/ۢۖܿ;

    move-result-object v0

    iget-object v1, p0, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;

    invoke-virtual {v1, v0, p1, p2, p3}, Ll/۟ۢܿ;->֫(Ll/ۢۖܿ;III)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 240
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->֫(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 349
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->֫(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/۬ۜܽ;I)Z
    .locals 1

    .line 235
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1, p2}, Ll/᩷ۡܿ;->֫(Ll/۬ۜܽ;I)Z

    move-result p1

    return p1
.end method

.method public final ۖ()V
    .locals 1

    .line 160
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->֡()V

    return-void
.end method

.method public final ۘ()V
    .locals 1

    .line 170
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۚ()V

    return-void
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 209
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۡ()Z
    .locals 1

    .line 191
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۘ()Z

    move-result v0

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۖ()Z

    move-result v0

    return v0
.end method

.method public final ۧ()J
    .locals 2

    .line 118
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۧ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(II)Ljava/util/List;
    .locals 2

    .line 220
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    .line 1944
    invoke-virtual {v0}, Ll/᩷ۡܿ;->ܳ()Ll/ۜۢܿ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1945
    invoke-virtual {v0, p1, p2}, Ll/ۜۢܿ;->ۧ(II)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 1948
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ۜۢܿ;->ܽ(II)Ll/ܶۜܿ;

    move-result-object p1

    if-nez p1, :cond_1

    .line 1949
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ll/ܶۜܿ;->᩷()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 1946
    :cond_2
    :goto_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final ۧ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 245
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ(Ll/᩶᩸ᩳ;)V
    .locals 1

    .line 250
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->ۧ(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    invoke-virtual {p0, p1}, Ll/ۜܺܿ;->ۧ(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/᩶᩸ᩳ;II)V
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩷ۡܿ;->ۧ(Ll/᩶᩸ᩳ;II)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 353
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(I)[I
    .locals 2

    .line 283
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۡ()Ll/ۢۖܿ;

    move-result-object v0

    iget-object v1, p0, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;

    invoke-virtual {v1, p1, v0}, Ll/۟ۢܿ;->֫(ILl/ۢۖܿ;)[I

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()Ll/ۜۢܿ;
    .locals 1

    .line 373
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ܳ()Ll/ۜۢܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ(Ll/᩶᩸ᩳ;)V
    .locals 1

    .line 144
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->ܳ(Ll/᩶᩸ᩳ;)V

    return-void
.end method

.method public final ܳ(II)Z
    .locals 1

    .line 409
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1, p2}, Ll/᩷ۡܿ;->ۧ(II)Z

    move-result p1

    return p1
.end method

.method public final ܺ()V
    .locals 1

    .line 186
    invoke-virtual {p0}, Ll/ۜܺܿ;->ۖ()V

    .line 187
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ᩴ()V

    return-void
.end method

.method public final ܽ()Ljava/util/List;
    .locals 1

    .line 377
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ܽ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(II)Ll/ܳܺܿ;
    .locals 2

    .line 277
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    .line 278
    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۡ()Ll/ۢۖܿ;

    move-result-object v0

    .line 277
    iget-object v1, p0, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;

    invoke-virtual {v1, p1, p2, v0}, Ll/۟ۢܿ;->ۧ(IILl/ۢۖܿ;)Ll/ܳܺܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/᩶᩸ᩳ;)V
    .locals 1

    .line 165
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->ܽ(Ll/᩶᩸ᩳ;)V

    return-void
.end method

.method public final ܽ(Ll/᩶᩸ᩳ;II)V
    .locals 1

    .line 414
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩷ۡܿ;->ܽ(Ll/᩶᩸ᩳ;II)V

    return-void
.end method

.method public final ܽ(I)Z
    .locals 4

    .line 333
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۡ()Ll/ۢۖܿ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 334
    invoke-virtual {v0}, Ll/ۢۖܿ;->ۧ()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 335
    invoke-virtual {v0, v1}, Ll/ۢۖܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸᩷ܿ;->ۖ()I

    move-result v0

    if-ne v0, p1, :cond_0

    return v3

    :cond_0
    return v1
.end method

.method public final ܿ()Ll/ۜۜܿ;
    .locals 1

    .line 385
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ܿ()Ll/ۜۜܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ(Ll/᩶᩸ᩳ;)V
    .locals 1

    .line 180
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->ܿ(Ll/᩶᩸ᩳ;)V

    return-void
.end method

.method public final ܿ(II)Z
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1, p2}, Ll/᩷ۡܿ;->֫(II)Z

    move-result p1

    return p1
.end method

.method public final ᩳ(II)I
    .locals 2

    .line 264
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    .line 265
    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۡ()Ll/ۢۖܿ;

    move-result-object v0

    .line 264
    iget-object v1, p0, Ll/ۜܺܿ;->֫:Ll/۟ۢܿ;

    invoke-virtual {v1, p1, p2, v0}, Ll/۟ۢܿ;->ܽ(IILl/ۢۖܿ;)I

    move-result p1

    return p1
.end method

.method public final ᩳ()Ll/ܿۜܿ;
    .locals 1

    .line 381
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ᩳ()Ll/ܿۜܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Ll/᩶᩸ᩳ;)V
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->ᩳ(Ll/᩶᩸ᩳ;)V

    return-void
.end method

.method public final ᩳ(Ll/᩶᩸ᩳ;II)V
    .locals 1

    .line 404
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩷ۡܿ;->ᩳ(Ll/᩶᩸ᩳ;II)V

    return-void
.end method

.method public final ᩴ()V
    .locals 1

    .line 357
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->֨()V

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 200
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ܺ()Z

    move-result v0

    return v0
.end method

.method public final ᩻()Ll/ܶۜܿ;
    .locals 1

    .line 389
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0}, Ll/᩷ۡܿ;->ۜ()Ll/ܶۜܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻(Ll/᩶᩸ᩳ;)V
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۜܺܿ;->ۧ:Ll/᩷ۡܿ;

    invoke-virtual {v0, p1}, Ll/᩷ۡܿ;->᩻(Ll/᩶᩸ᩳ;)V

    return-void
.end method
