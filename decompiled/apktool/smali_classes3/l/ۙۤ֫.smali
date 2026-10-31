.class public final Ll/ۙۤ֫;
.super Ll/ܺ۟֫;
.source "P8OZ"

# interfaces
.implements Ll/᩺ۙ֫;


# instance fields
.field public ֡ܽ:Ll/۠ᩴ֫;

.field public final ֨ܽ:Ll/ۨܰ֫;

.field public ۖܽ:J

.field public ۘܽ:Ll/۠ᩴ֫;

.field public ۚܽ:Z

.field public ۜܽ:Z

.field public ۠ܽ:J

.field public ۡܽ:Z

.field public ۢܽ:Z

.field public ܳܽ:Z

.field public ܶܽ:I

.field public final ܺܽ:Landroid/content/Context;

.field public final ᩴܽ:Ll/֡۫֫;

.field public ᩵ܽ:Z

.field public ᩷ܽ:I

.field public final ᩻ܽ:Ll/۠ۤ֫;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;Ll/ܰܰ֫;Landroid/os/Handler;Ll/ۚ۫֫;Ll/۠ۤ֫;)V
    .locals 7

    .line 269
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    new-instance v0, Ll/ۨܰ֫;

    invoke-direct {v0}, Ll/ۨܰ֫;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v2, 0x1

    const v6, 0x472c4400    # 44100.0f

    .line 298
    sget-object v4, Ll/ۖ۟֫;->ᩳ:Ll/ᩴۖܽ;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Ll/ܺ۟֫;-><init>(ILl/ܰܰ֫;Ll/ۖ۟֫;ZF)V

    .line 304
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 305
    iput-object p1, p0, Ll/ۙۤ֫;->ܺܽ:Landroid/content/Context;

    .line 306
    iput-object p5, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    .line 307
    iput-object v0, p0, Ll/ۙۤ֫;->֨ܽ:Ll/ۨܰ֫;

    const/16 p1, -0x3e8

    .line 308
    iput p1, p0, Ll/ۙۤ֫;->ܶܽ:I

    .line 309
    new-instance p1, Ll/֡۫֫;

    invoke-direct {p1, p3, p4}, Ll/֡۫֫;-><init>(Landroid/os/Handler;Ll/ۚ۫֫;)V

    iput-object p1, p0, Ll/ۙۤ֫;->ᩴܽ:Ll/֡۫֫;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 310
    iput-wide p1, p0, Ll/ۙۤ֫;->۠ܽ:J

    .line 311
    new-instance p1, Ll/᩶ۤ֫;

    invoke-direct {p1, p0}, Ll/᩶ۤ֫;-><init>(Ll/ۙۤ֫;)V

    invoke-virtual {p5, p1}, Ll/۠ۤ֫;->֫(Ll/᩸۫֫;)V

    return-void
.end method

.method private ֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I
    .locals 1

    const-string v0, "OMX.google.raw.decoder"

    .line 977
    iget-object p1, p1, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 982
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x18

    if-ge p1, v0, :cond_1

    const/16 v0, 0x17

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ll/ۙۤ֫;->ܺܽ:Landroid/content/Context;

    invoke-static {p1}, Ll/ۘ֨֫;->ܽ(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, -0x1

    return p1

    .line 986
    :cond_1
    iget p1, p2, Ll/۠ᩴ֫;->ۗ:I

    return p1
.end method

.method public static bridge synthetic ֫(Ll/ۙۤ֫;)Ll/֡۫֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙۤ֫;->ᩴܽ:Ll/֡۫֫;

    return-object p0
.end method

.method private ۗ֫()V
    .locals 5

    .line 1066
    invoke-virtual {p0}, Ll/ۙۤ֫;->ۧ()Z

    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0}, Ll/۠ۤ֫;->᩻()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 1069
    iget-boolean v2, p0, Ll/ۙۤ֫;->ܳܽ:Z

    if-eqz v2, :cond_0

    goto :goto_0

    .line 1071
    :cond_0
    iget-wide v2, p0, Ll/ۙۤ֫;->ۖܽ:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Ll/ۙۤ֫;->ۖܽ:J

    const/4 v0, 0x0

    .line 1072
    iput-boolean v0, p0, Ll/ۙۤ֫;->ܳܽ:Z

    :cond_1
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۙۤ֫;)Ll/ۨܰ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙۤ֫;->֨ܽ:Ll/ۨܰ֫;

    return-object p0
.end method

.method public static synthetic ܳ(Ll/ۙۤ֫;)V
    .locals 0

    .line 102
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ۨ()V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۙۤ֫;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۙۤ֫;->᩵ܽ:Z

    return-void
.end method

.method private ܿ(Ll/۠ᩴ֫;)I
    .locals 1

    .line 398
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    .line 399
    invoke-virtual {v0, p1}, Ll/۠ۤ֫;->ܽ(Ll/۠ᩴ֫;)Ll/ܺ۫֫;

    move-result-object p1

    .line 400
    iget-boolean v0, p1, Ll/ܺ۫֫;->֫:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 404
    :cond_0
    iget-boolean v0, p1, Ll/ܺ۫֫;->ۧ:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x600

    goto :goto_0

    :cond_1
    const/16 v0, 0x200

    .line 407
    :goto_0
    iget-boolean p1, p1, Ll/ܺ۫֫;->ܽ:Z

    if-eqz p1, :cond_2

    or-int/lit16 p1, v0, 0x800

    return p1

    :cond_2
    return v0
.end method

.method public static synthetic ܿ(Ll/ۙۤ֫;)Ll/۟ۗ֫;
    .locals 0

    .line 102
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܺ֫()Ll/۟ۗ֫;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/ۙۤ֫;)Ll/۟ۗ֫;
    .locals 0

    .line 102
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܺ֫()Ll/۟ۗ֫;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecAudioRenderer"

    return-object v0
.end method

.method public final ֫(FLl/۠ᩴ֫;[Ll/۠ᩴ֫;)F
    .locals 4

    .line 558
    array-length p2, p3

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v3, p3, v1

    .line 559
    iget v3, v3, Ll/۠ᩴ֫;->ܽ֫:I

    if-eq v3, v0, :cond_0

    .line 561
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-ne v2, v0, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    return p1

    :cond_2
    int-to-float p2, v2

    mul-float p2, p2, p1

    return p2
.end method

.method public final ֫(Ll/ۖ۟֫;Ll/۠ᩴ֫;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 245
    invoke-static {v2, v3, v3, v3}, Ll/ۧ۬֫;->֫(IIII)I

    move-result v2

    .line 322
    iget-object v4, v1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget-object v5, v1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v4}, Ll/ۢ᩵֫;->᩻(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 245
    invoke-static {v3, v3, v3, v3}, Ll/ۧ۬֫;->֫(IIII)I

    move-result v1

    return v1

    .line 325
    :cond_0
    iget v4, v1, Ll/۠ᩴ֫;->᩷:I

    if-eqz v4, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    const/4 v7, 0x2

    if-eqz v4, :cond_3

    if-ne v4, v7, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v4, 0x1

    :goto_2
    const/16 v8, 0x20

    const/4 v9, 0x0

    const-string v10, "audio/raw"

    const/16 v11, 0x8

    const/4 v12, 0x4

    .line 331
    iget-object v13, v0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    if-eqz v4, :cond_6

    if-eqz v6, :cond_5

    .line 131
    invoke-static {v10, v3, v3}, Ll/᩹۟֫;->֫(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v6

    .line 132
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_4

    move-object v6, v9

    goto :goto_3

    :cond_4
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܿ۟֫;

    :goto_3
    if-eqz v6, :cond_6

    .line 333
    :cond_5
    invoke-direct {v0, v1}, Ll/ۙۤ֫;->ܿ(Ll/۠ᩴ֫;)I

    move-result v6

    .line 334
    invoke-virtual {v13, v1}, Ll/۠ۤ֫;->֫(Ll/۠ᩴ֫;)Z

    move-result v14

    if-eqz v14, :cond_7

    .line 335
    invoke-static {v12, v11, v8, v6}, Ll/ۧ۬֫;->֫(IIII)I

    move-result v1

    return v1

    :cond_6
    const/4 v6, 0x0

    .line 341
    :cond_7
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-virtual {v13, v1}, Ll/۠ۤ֫;->֫(Ll/۠ᩴ֫;)Z

    move-result v14

    if-nez v14, :cond_8

    goto :goto_6

    .line 345
    :cond_8
    iget v14, v1, Ll/۠ᩴ֫;->ܿ:I

    iget v15, v1, Ll/۠ᩴ֫;->ܽ֫:I

    .line 346
    invoke-static {v7, v14, v15}, Ll/ۘ֨֫;->ܽ(III)Ll/۠ᩴ֫;

    move-result-object v14

    .line 345
    invoke-virtual {v13, v14}, Ll/۠ۤ֫;->֫(Ll/۠ᩴ֫;)Z

    move-result v14

    if-nez v14, :cond_9

    goto :goto_6

    :cond_9
    if-nez v5, :cond_a

    .line 444
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v5

    goto :goto_5

    .line 446
    :cond_a
    invoke-virtual {v13, v1}, Ll/۠ۤ֫;->֫(Ll/۠ᩴ֫;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 131
    invoke-static {v10, v3, v3}, Ll/᩹۟֫;->֫(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v5

    .line 132
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_b

    goto :goto_4

    :cond_b
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ll/ܿ۟֫;

    :goto_4
    if-eqz v9, :cond_c

    .line 450
    invoke-static {v9}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    goto :goto_5

    :cond_c
    move-object/from16 v5, p1

    .line 453
    invoke-static {v5, v1, v3, v3}, Ll/᩹۟֫;->֫(Ll/ۖ۟֫;Ll/۠ᩴ֫;ZZ)Ljava/util/List;

    move-result-object v5

    .line 351
    :goto_5
    move-object v9, v5

    check-cast v9, Ljava/util/AbstractCollection;

    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_d

    :goto_6
    return v2

    :cond_d
    if-nez v4, :cond_e

    .line 245
    invoke-static {v7, v3, v3, v3}, Ll/ۧ۬֫;->֫(IIII)I

    move-result v1

    return v1

    .line 359
    :cond_e
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ۟֫;

    .line 360
    invoke-virtual {v2, v1}, Ll/ܿ۟֫;->ۧ(Ll/۠ᩴ֫;)Z

    move-result v4

    if-nez v4, :cond_10

    const/4 v7, 0x1

    .line 364
    :goto_7
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    if-ge v7, v9, :cond_10

    .line 365
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܿ۟֫;

    .line 366
    invoke-virtual {v9, v1}, Ll/ܿ۟֫;->ۧ(Ll/۠ᩴ֫;)Z

    move-result v10

    if-eqz v10, :cond_f

    const/4 v4, 0x1

    const/4 v2, 0x0

    move-object v2, v9

    const/4 v5, 0x0

    goto :goto_8

    :cond_f
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_10
    const/4 v5, 0x1

    :goto_8
    if-eqz v4, :cond_11

    goto :goto_9

    :cond_11
    const/4 v12, 0x3

    :goto_9
    if-eqz v4, :cond_12

    .line 378
    invoke-virtual {v2, v1}, Ll/ܿ۟֫;->ܽ(Ll/۠ᩴ֫;)Z

    move-result v1

    if-eqz v1, :cond_12

    const/16 v11, 0x10

    .line 383
    :cond_12
    iget-boolean v1, v2, Ll/ܿ۟֫;->ܿ:Z

    if-eqz v1, :cond_13

    const/16 v1, 0x40

    goto :goto_a

    :cond_13
    const/4 v1, 0x0

    :goto_a
    if-eqz v5, :cond_14

    const/16 v3, 0x80

    :cond_14
    or-int v2, v12, v11

    or-int/2addr v2, v8

    or-int/2addr v1, v2

    or-int/2addr v1, v3

    or-int/2addr v1, v6

    return v1
.end method

.method public final ֫(Ll/ۖ۟֫;Ll/۠ᩴ֫;Z)Ljava/util/ArrayList;
    .locals 3

    .line 443
    iget-object v0, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 444
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    goto :goto_1

    .line 446
    :cond_0
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0, p2}, Ll/۠ۤ֫;->֫(Ll/۠ᩴ֫;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const-string v0, "audio/raw"

    .line 131
    invoke-static {v0, v1, v1}, Ll/᩹۟֫;->֫(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v0

    .line 132
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ۟֫;

    :goto_0
    if-eqz v0, :cond_2

    .line 450
    invoke-static {v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p1

    goto :goto_1

    .line 453
    :cond_2
    invoke-static {p1, p2, p3, v1}, Ll/᩹۟֫;->֫(Ll/ۖ۟֫;Ll/۠ᩴ֫;ZZ)Ljava/util/List;

    move-result-object p1

    .line 417
    :goto_1
    invoke-static {p1, p2}, Ll/᩹۟֫;->֫(Ljava/util/List;Ll/۠ᩴ֫;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۗۙ֫;)Ll/۬᩹֫;
    .locals 2

    .line 591
    iget-object v0, p1, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    iput-object v0, p0, Ll/ۙۤ֫;->֡ܽ:Ll/۠ᩴ֫;

    .line 593
    invoke-super {p0, p1}, Ll/ܺ۟֫;->֫(Ll/ۗۙ֫;)Ll/۬᩹֫;

    move-result-object p1

    .line 594
    iget-object v1, p0, Ll/ۙۤ֫;->ᩴܽ:Ll/֡۫֫;

    invoke-virtual {v1, v0, p1}, Ll/֡۫֫;->֫(Ll/۠ᩴ֫;Ll/۬᩹֫;)V

    return-object p1
.end method

.method public final ֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;Ll/۠ᩴ֫;)Ll/۬᩹֫;
    .locals 8

    .line 496
    invoke-virtual {p1, p2, p3}, Ll/ܿ۟֫;->֫(Ll/۠ᩴ֫;Ll/۠ᩴ֫;)Ll/۬᩹֫;

    move-result-object v0

    .line 498
    iget v1, v0, Ll/۬᩹֫;->ۧ:I

    .line 499
    invoke-virtual {p0, p3}, Ll/ܺ۟֫;->ۧ(Ll/۠ᩴ֫;)Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x8000

    or-int/2addr v1, v2

    .line 504
    :cond_0
    invoke-direct {p0, p1, p3}, Ll/ۙۤ֫;->֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I

    move-result v2

    iget v3, p0, Ll/ۙۤ֫;->᩷ܽ:I

    if-le v2, v3, :cond_1

    or-int/lit8 v1, v1, 0x40

    :cond_1
    move v7, v1

    .line 508
    new-instance v1, Ll/۬᩹֫;

    iget-object v3, p1, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    if-eqz v7, :cond_2

    const/4 p1, 0x0

    const/4 v6, 0x0

    goto :goto_0

    .line 512
    :cond_2
    iget p1, v0, Ll/۬᩹֫;->ܿ:I

    move v6, p1

    :goto_0
    move-object v2, v1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Ll/۬᩹֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V

    return-object v1
.end method

.method public final ֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;Landroid/media/MediaCrypto;F)Ll/᩺ܰ֫;
    .locals 9

    .line 478
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ۙ()[Ll/۠ᩴ֫;

    move-result-object v0

    .line 954
    invoke-direct {p0, p1, p2}, Ll/ۙۤ֫;->֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I

    move-result v1

    iget-object v2, p1, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    .line 955
    array-length v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v3, v5, :cond_0

    goto :goto_1

    .line 960
    :cond_0
    array-length v3, v0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_2

    aget-object v7, v0, v6

    .line 961
    invoke-virtual {p1, p2, v7}, Ll/ܿ۟֫;->֫(Ll/۠ᩴ֫;Ll/۠ᩴ֫;)Ll/۬᩹֫;

    move-result-object v8

    iget v8, v8, Ll/۬᩹֫;->ܿ:I

    if-eqz v8, :cond_1

    .line 962
    invoke-direct {p0, p1, v7}, Ll/ۙۤ֫;->֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I

    move-result v7

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 478
    :cond_2
    :goto_1
    iput v1, p0, Ll/ۙۤ֫;->᩷ܽ:I

    .line 1094
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_4

    const-string v3, "OMX.SEC.aac.dec"

    .line 1095
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "samsung"

    sget-object v6, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 1096
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v6, "zeroflte"

    .line 1097
    invoke-virtual {v3, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "herolte"

    .line 1098
    invoke-virtual {v3, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "heroqlte"

    .line 1099
    invoke-virtual {v3, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    .line 479
    :goto_2
    iput-boolean v3, p0, Ll/ۙۤ֫;->ۢܽ:Z

    const-string v3, "OMX.google.opus.decoder"

    .line 1109
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "c2.android.opus.decoder"

    .line 1110
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "OMX.google.vorbis.decoder"

    .line 1111
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "c2.android.vorbis.decoder"

    .line 1112
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v2, 0x1

    .line 481
    :goto_4
    iput-boolean v2, p0, Ll/ۙۤ֫;->ۡܽ:Z

    .line 482
    iget-object v2, p1, Ll/ܿ۟֫;->ܽ:Ljava/lang/String;

    iget v3, p0, Ll/ۙۤ֫;->᩷ܽ:I

    .line 1003
    new-instance v6, Landroid/media/MediaFormat;

    invoke-direct {v6}, Landroid/media/MediaFormat;-><init>()V

    const-string v7, "mime"

    .line 1005
    invoke-virtual {v6, v7, v2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1006
    iget v2, p2, Ll/۠ᩴ֫;->ܿ:I

    iget-object v7, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v8, "channel-count"

    invoke-virtual {v6, v8, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 1007
    iget v2, p2, Ll/۠ᩴ֫;->ܽ֫:I

    const-string v8, "sample-rate"

    invoke-virtual {v6, v8, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 1008
    iget-object v8, p2, Ll/۠ᩴ֫;->᩸:Ljava/util/List;

    invoke-static {v6, v8}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/util/List;)V

    const-string v8, "max-input-size"

    .line 1010
    invoke-static {v6, v8, v3}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const/16 v3, 0x17

    if-lt v0, v3, :cond_8

    const-string v8, "priority"

    .line 1013
    invoke-virtual {v6, v8, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const/high16 v8, -0x40800000    # -1.0f

    cmpl-float v8, p4, v8

    if-eqz v8, :cond_8

    if-ne v0, v3, :cond_7

    .line 1083
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v8, "ZTE B2017G"

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    const-string v8, "AXON 7 mini"

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_5

    :cond_7
    const-string v3, "operating-rate"

    .line 1015
    invoke-virtual {v6, v3, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_8
    :goto_5
    const-string p4, "audio/ac4"

    .line 1018
    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_a

    .line 1019
    invoke-static {p2}, Ll/ᩳۚ֫;->֫(Ll/۠ᩴ֫;)Landroid/util/Pair;

    move-result-object p4

    if-eqz p4, :cond_9

    .line 1021
    iget-object v3, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v8, "profile"

    invoke-static {v6, v8, v3}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 1022
    iget-object p4, p4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    const-string v3, "level"

    invoke-static {v6, v3, p4}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    :cond_9
    const/16 p4, 0x1c

    if-gt v0, p4, :cond_a

    const-string p4, "ac4-is-sync"

    .line 1027
    invoke-virtual {v6, p4, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_a
    if-lt v0, v1, :cond_b

    .line 1030
    iget p4, p2, Ll/۠ᩴ֫;->ܿ:I

    const/4 v1, 0x4

    .line 1032
    invoke-static {v1, p4, v2}, Ll/ۘ֨֫;->ܽ(III)Ll/۠ᩴ֫;

    move-result-object p4

    .line 1031
    iget-object v2, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v2, p4}, Ll/۠ۤ֫;->ۧ(Ll/۠ᩴ֫;)I

    move-result p4

    const/4 v2, 0x2

    if-ne p4, v2, :cond_b

    const-string p4, "pcm-encoding"

    .line 1034
    invoke-virtual {v6, p4, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_b
    const/16 p4, 0x20

    if-lt v0, p4, :cond_c

    const-string p4, "max-output-channel-count"

    const/16 v1, 0x63

    .line 1037
    invoke-virtual {v6, p4, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_c
    const/16 p4, 0x23

    if-lt v0, p4, :cond_d

    .line 1040
    iget p4, p0, Ll/ۙۤ֫;->ܶܽ:I

    neg-int p4, p4

    invoke-static {v4, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    const-string v0, "importance"

    invoke-virtual {v6, v0, p4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 485
    :cond_d
    iget-object p4, p1, Ll/ܿ۟֫;->ۢ:Ljava/lang/String;

    const-string v0, "audio/raw"

    .line 486
    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_e

    .line 487
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_e

    move-object p4, p2

    goto :goto_6

    :cond_e
    const/4 p4, 0x0

    .line 488
    :goto_6
    iput-object p4, p0, Ll/ۙۤ֫;->ۘܽ:Ll/۠ᩴ֫;

    .line 489
    iget-object p4, p0, Ll/ۙۤ֫;->֨ܽ:Ll/ۨܰ֫;

    invoke-static {p1, v6, p2, p3, p4}, Ll/᩺ܰ֫;->֫(Ll/ܿ۟֫;Landroid/media/MediaFormat;Ll/۠ᩴ֫;Landroid/media/MediaCrypto;Ll/ۨܰ֫;)Ll/᩺ܰ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 3

    const/4 v0, 0x2

    .line 894
    iget-object v1, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    if-eq p1, v0, :cond_8

    const/4 v0, 0x3

    if-eq p1, v0, :cond_7

    const/4 v0, 0x6

    if-eq p1, v0, :cond_6

    const/16 v0, 0xc

    if-eq p1, v0, :cond_4

    const/16 v0, 0x10

    const/16 v2, 0x23

    if-eq p1, v0, :cond_2

    const/16 v0, 0x9

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    .line 922
    invoke-super {p0, p1, p2}, Ll/ܺ۟֫;->֫(ILjava/lang/Object;)V

    return-void

    .line 155
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 915
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 1046
    invoke-virtual {v1, p1}, Ll/۠ۤ֫;->֫(I)V

    .line 1047
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v2, :cond_5

    iget-object p2, p0, Ll/ۙۤ֫;->֨ܽ:Ll/ۨܰ֫;

    if-eqz p2, :cond_5

    .line 1048
    invoke-virtual {p2, p1}, Ll/ۨܰ֫;->֫(I)V

    return-void

    .line 155
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 912
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v1, p1}, Ll/۠ۤ֫;->֫(Z)V

    return-void

    .line 155
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ll/ۙۤ֫;->ܶܽ:I

    .line 1053
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܽ֫()Ll/ۧ۟֫;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 1058
    :cond_3
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v2, :cond_5

    .line 1059
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 1060
    iget v0, p0, Ll/ۙۤ֫;->ܶܽ:I

    neg-int v0, v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const-string v1, "importance"

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 1061
    invoke-interface {p1, p2}, Ll/ۧ۟֫;->֫(Landroid/os/Bundle;)V

    return-void

    .line 907
    :cond_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p1, v0, :cond_5

    .line 908
    invoke-static {v1, p2}, Ll/᩹ۤ֫;->֫(Ll/۠ۤ֫;Ljava/lang/Object;)V

    :cond_5
    :goto_0
    return-void

    .line 903
    :cond_6
    check-cast p2, Ll/ܿᩴ֫;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 904
    invoke-virtual {v1, p2}, Ll/۠ۤ֫;->֫(Ll/ܿᩴ֫;)V

    return-void

    .line 899
    :cond_7
    check-cast p2, Ll/ᩳᩴ֫;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    invoke-virtual {v1, p2}, Ll/۠ۤ֫;->֫(Ll/ᩳᩴ֫;)V

    return-void

    .line 155
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v1, p1}, Ll/۠ۤ֫;->֫(F)V

    return-void
.end method

.method public final ֫(JZ)V
    .locals 0

    .line 692
    invoke-super {p0, p1, p2, p3}, Ll/ܺ۟֫;->֫(JZ)V

    .line 693
    iget-object p3, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {p3}, Ll/۠ۤ֫;->flush()V

    .line 695
    iput-wide p1, p0, Ll/ۙۤ֫;->ۖܽ:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 696
    iput-wide p1, p0, Ll/ۙۤ֫;->۠ܽ:J

    const/4 p1, 0x0

    .line 697
    iput-boolean p1, p0, Ll/ۙۤ֫;->᩵ܽ:Z

    const/4 p1, 0x1

    .line 698
    iput-boolean p1, p0, Ll/ۙۤ֫;->ܳܽ:Z

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "Audio codec error"

    .line 583
    invoke-static {v0, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 584
    iget-object v0, p0, Ll/ۙۤ֫;->ᩴܽ:Ll/֡۫֫;

    invoke-virtual {v0, p1}, Ll/֡۫֫;->֫(Ljava/lang/Exception;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 578
    iget-object v0, p0, Ll/ۙۤ֫;->ᩴܽ:Ll/֡۫֫;

    invoke-virtual {v0, p1}, Ll/֡۫֫;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;JJ)V
    .locals 6

    .line 573
    iget-object v0, p0, Ll/ۙۤ֫;->ᩴܽ:Ll/֡۫֫;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Ll/֡۫֫;->֫(Ljava/lang/String;JJ)V

    return-void
.end method

.method public final ֫(Ll/ۖ᩵֫;)V
    .locals 1

    .line 781
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0, p1}, Ll/۠ۤ֫;->֫(Ll/ۖ᩵֫;)V

    return-void
.end method

.method public final ֫(Ll/۠ᩴ֫;Landroid/media/MediaFormat;)V
    .locals 7

    .line 603
    iget-object v0, p0, Ll/ۙۤ֫;->ۘܽ:Ll/۠ᩴ֫;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object p1, v0

    goto/16 :goto_2

    .line 605
    :cond_0
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܽ֫()Ll/ۧ۟֫;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    .line 155
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget v3, p1, Ll/۠ᩴ֫;->ܿ:I

    const-string v4, "audio/raw"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v5, 0x2

    if-eqz v0, :cond_2

    .line 612
    iget v0, p1, Ll/۠ᩴ֫;->ۛ:I

    goto :goto_0

    .line 613
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x18

    if-lt v0, v6, :cond_3

    const-string v0, "pcm-encoding"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 614
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "v-bits-per-sample"

    .line 615
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 616
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    .line 2233
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v0, v6}, Ll/ۘ֨֫;->֫(ILjava/nio/ByteOrder;)I

    move-result v0

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    .line 622
    :goto_0
    new-instance v6, Ll/֨ᩴ֫;

    invoke-direct {v6}, Ll/֨ᩴ֫;-><init>()V

    .line 624
    invoke-virtual {v6, v4}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 625
    invoke-virtual {v6, v0}, Ll/֨ᩴ֫;->᩵(I)V

    iget v0, p1, Ll/۠ᩴ֫;->ᩴ:I

    .line 626
    invoke-virtual {v6, v0}, Ll/֨ᩴ֫;->᩷(I)V

    iget v0, p1, Ll/۠ᩴ֫;->᩵:I

    .line 627
    invoke-virtual {v6, v0}, Ll/֨ᩴ֫;->ۢ(I)V

    iget-object v0, p1, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    .line 628
    invoke-virtual {v6, v0}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    iget-object v0, p1, Ll/۠ᩴ֫;->ۡ:Ljava/lang/Object;

    .line 629
    invoke-virtual {v6, v0}, Ll/֨ᩴ֫;->֫(Ljava/lang/Object;)V

    iget-object v0, p1, Ll/۠ᩴ֫;->ܶ:Ljava/lang/String;

    .line 630
    invoke-virtual {v6, v0}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    iget-object v0, p1, Ll/۠ᩴ֫;->᩹:Ljava/lang/String;

    .line 631
    invoke-virtual {v6, v0}, Ll/֨ᩴ֫;->ᩳ(Ljava/lang/String;)V

    iget-object v0, p1, Ll/۠ᩴ֫;->᩶:Ljava/util/List;

    .line 632
    invoke-virtual {v6, v0}, Ll/֨ᩴ֫;->ۧ(Ljava/util/List;)V

    iget-object v0, p1, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    .line 633
    invoke-virtual {v6, v0}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    iget v0, p1, Ll/۠ᩴ֫;->ᩳ֫:I

    .line 634
    invoke-virtual {v6, v0}, Ll/֨ᩴ֫;->ܶ(I)V

    iget p1, p1, Ll/۠ᩴ֫;->۟:I

    .line 635
    invoke-virtual {v6, p1}, Ll/֨ᩴ֫;->ۚ(I)V

    const-string p1, "channel-count"

    .line 636
    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v6, p1}, Ll/֨ᩴ֫;->ᩳ(I)V

    const-string p1, "sample-rate"

    .line 637
    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v6, p1}, Ll/֨ᩴ֫;->۠(I)V

    .line 638
    invoke-virtual {v6}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    iget p2, p1, Ll/۠ᩴ֫;->ܿ:I

    .line 639
    iget-boolean v0, p0, Ll/ۙۤ֫;->ۢܽ:Z

    const/4 v4, 0x6

    if-eqz v0, :cond_5

    if-ne p2, v4, :cond_5

    if-ge v3, v4, :cond_5

    .line 642
    new-array v2, v3, [I

    const/4 p2, 0x0

    :goto_1
    if-ge p2, v3, :cond_b

    .line 644
    aput p2, v2, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 646
    :cond_5
    iget-boolean v0, p0, Ll/ۙۤ֫;->ۡܽ:Z

    if-eqz v0, :cond_b

    const/4 v0, 0x3

    const/4 v3, 0x1

    if-eq p2, v0, :cond_a

    const/4 v6, 0x5

    if-eq p2, v6, :cond_9

    if-eq p2, v4, :cond_8

    const/4 v0, 0x7

    if-eq p2, v0, :cond_7

    const/16 v0, 0x8

    if-eq p2, v0, :cond_6

    goto :goto_2

    :cond_6
    new-array v2, v0, [I

    .line 164
    fill-array-data v2, :array_0

    goto :goto_2

    :cond_7
    new-array v2, v0, [I

    .line 162
    fill-array-data v2, :array_1

    goto :goto_2

    :cond_8
    new-array v2, v4, [I

    .line 160
    fill-array-data v2, :array_2

    goto :goto_2

    :cond_9
    const/4 p2, 0x4

    .line 158
    filled-new-array {v1, v5, v3, v0, p2}, [I

    move-result-object v2

    goto :goto_2

    .line 156
    :cond_a
    filled-new-array {v1, v5, v3}, [I

    move-result-object v2

    .line 652
    :cond_b
    :goto_2
    :try_start_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ll/۠۫֫; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x1d

    iget-object v3, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    if-lt p2, v0, :cond_d

    .line 653
    :try_start_1
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۘ֫()Z

    move-result p2

    if-eqz p2, :cond_c

    .line 654
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ܶ()Ll/ܿ۬֫;

    move-result-object p2

    iget p2, p2, Ll/ܿ۬֫;->֫:I

    if-eqz p2, :cond_c

    .line 657
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ܶ()Ll/ܿ۬֫;

    move-result-object p2

    iget p2, p2, Ll/ܿ۬֫;->֫:I

    invoke-virtual {v3, p2}, Ll/۠ۤ֫;->ۧ(I)V

    goto :goto_3

    .line 659
    :cond_c
    invoke-virtual {v3, v1}, Ll/۠ۤ֫;->ۧ(I)V

    .line 662
    :cond_d
    :goto_3
    invoke-virtual {v3, p1, v2}, Ll/۠ۤ֫;->֫(Ll/۠ᩴ֫;[I)V
    :try_end_1
    .catch Ll/۠۫֫; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 664
    iget-object p2, p1, Ll/۠۫֫;->᩸:Ll/۠ᩴ֫;

    const/16 v0, 0x1389

    invoke-virtual {p0, p1, p2, v0}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    nop

    :array_0
    .array-data 4
        0x0
        0x2
        0x1
        0x7
        0x5
        0x6
        0x3
        0x4
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x2
        0x1
        0x6
        0x5
        0x3
        0x4
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x2
        0x1
        0x5
        0x3
        0x4
    .end array-data
.end method

.method public final ֫(ZZ)V
    .locals 0

    .line 679
    invoke-super {p0, p1, p2}, Ll/ܺ۟֫;->֫(ZZ)V

    .line 680
    iget-object p1, p0, Ll/ۙۤ֫;->ᩴܽ:Ll/֡۫֫;

    iget-object p2, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    invoke-virtual {p1, p2}, Ll/֡۫֫;->ۧ(Ll/ۗ᩹֫;)V

    .line 681
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ܶ()Ll/ܿ۬֫;

    move-result-object p1

    iget-boolean p1, p1, Ll/ܿ۬֫;->ۧ:Z

    iget-object p2, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    if-eqz p1, :cond_0

    .line 682
    invoke-virtual {p2}, Ll/۠ۤ֫;->ۢ()V

    goto :goto_0

    .line 684
    :cond_0
    invoke-virtual {p2}, Ll/۠ۤ֫;->ܳ()V

    .line 686
    :goto_0
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩶()Ll/ܰ۬֫;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/۠ۤ֫;->֫(Ll/ܰ۬֫;)V

    .line 687
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۠()Ll/ܽۚ֫;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/۠ۤ֫;->֫(Ll/ܽۚ֫;)V

    return-void
.end method

.method public final ֫(JJLl/ۧ۟֫;Ljava/nio/ByteBuffer;IIIJZZLl/۠ᩴ֫;)Z
    .locals 0

    .line 155
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 812
    iput-wide p1, p0, Ll/ۙۤ֫;->۠ܽ:J

    .line 814
    iget-object p1, p0, Ll/ۙۤ֫;->ۘܽ:Ll/۠ᩴ֫;

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_0

    .line 155
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 817
    invoke-interface {p5, p7}, Ll/ۧ۟֫;->ܽ(I)V

    return p2

    .line 821
    :cond_0
    iget-object p1, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    if-eqz p12, :cond_2

    if-eqz p5, :cond_1

    .line 823
    invoke-interface {p5, p7}, Ll/ۧ۟֫;->ܽ(I)V

    .line 825
    :cond_1
    iget-object p3, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    iget p4, p3, Ll/ۗ᩹֫;->ۢ:I

    add-int/2addr p4, p9

    iput p4, p3, Ll/ۗ᩹֫;->ۢ:I

    .line 826
    invoke-virtual {p1}, Ll/۠ۤ֫;->᩷()V

    return p2

    .line 832
    :cond_2
    :try_start_0
    invoke-virtual {p1, p9, p10, p11, p6}, Ll/۠ۤ֫;->֫(IJLjava/nio/ByteBuffer;)Z

    move-result p1
    :try_end_0
    .catch Ll/ܶ۫֫; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/᩶۫֫; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    if-eqz p5, :cond_3

    .line 855
    invoke-interface {p5, p7}, Ll/ۧ۟֫;->ܽ(I)V

    .line 857
    :cond_3
    iget-object p1, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    iget p3, p1, Ll/ۗ᩹֫;->ۜ:I

    add-int/2addr p3, p9

    iput p3, p1, Ll/ۗ᩹֫;->ۜ:I

    return p2

    .line 862
    :cond_4
    iput-wide p10, p0, Ll/ۙۤ֫;->۠ܽ:J

    const/4 p1, 0x0

    return p1

    :catch_0
    move-exception p1

    .line 847
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۘ֫()Z

    move-result p2

    if-eqz p2, :cond_5

    .line 848
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ܶ()Ll/ܿ۬֫;

    move-result-object p2

    iget p2, p2, Ll/ܿ۬֫;->֫:I

    if-eqz p2, :cond_5

    const/16 p2, 0x138b

    goto :goto_0

    :cond_5
    const/16 p2, 0x138a

    .line 843
    :goto_0
    iget-boolean p3, p1, Ll/᩶۫֫;->᩶:Z

    invoke-virtual {p0, p1, p14, p3, p2}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;ZI)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 834
    iget-object p2, p0, Ll/ۙۤ֫;->֡ܽ:Ll/۠ᩴ֫;

    .line 838
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۘ֫()Z

    move-result p3

    if-eqz p3, :cond_6

    .line 839
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ܶ()Ll/ܿ۬֫;

    move-result-object p3

    iget p3, p3, Ll/ܿ۬֫;->֫:I

    if-eqz p3, :cond_6

    const/16 p3, 0x138c

    goto :goto_1

    :cond_6
    const/16 p3, 0x1389

    .line 834
    :goto_1
    iget-boolean p4, p1, Ll/ܶ۫֫;->᩶:Z

    invoke-virtual {p0, p1, p2, p4, p3}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;ZI)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1
.end method

.method public final ۙ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 673
    iput-boolean v0, p0, Ll/ۙۤ֫;->ܳܽ:Z

    return-void
.end method

.method public final ۚ()Ll/᩺ۙ֫;
    .locals 0

    return-object p0
.end method

.method public final ۚ֫()V
    .locals 5

    .line 871
    :try_start_0
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0}, Ll/۠ۤ֫;->ۜ()V

    .line 872
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۜ֫()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 873
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۜ֫()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۙۤ֫;->۠ܽ:J
    :try_end_0
    .catch Ll/᩶۫֫; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    .line 880
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۘ֫()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x138b

    goto :goto_0

    :cond_1
    const/16 v1, 0x138a

    .line 876
    :goto_0
    iget-object v2, v0, Ll/᩶۫֫;->᩹:Ll/۠ᩴ֫;

    iget-boolean v3, v0, Ll/᩶۫֫;->᩶:Z

    invoke-virtual {p0, v0, v2, v3, v1}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;ZI)Ll/ᩳ᩶֫;

    move-result-object v0

    throw v0
.end method

.method public final ۛ()V
    .locals 2

    .line 748
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0}, Ll/۠ۤ֫;->ۡ()V

    .line 749
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Ll/ۙۤ֫;->֨ܽ:Ll/ۨܰ֫;

    if-eqz v0, :cond_0

    .line 750
    invoke-virtual {v0}, Ll/ۨܰ֫;->֫()V

    :cond_0
    return-void
.end method

.method public final ۟()V
    .locals 1

    .line 710
    invoke-direct {p0}, Ll/ۙۤ֫;->ۗ֫()V

    const/4 v0, 0x0

    .line 711
    iput-boolean v0, p0, Ll/ۙۤ֫;->ۚܽ:Z

    .line 712
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0}, Ll/۠ۤ֫;->pause()V

    return-void
.end method

.method public final ۢ()Z
    .locals 2

    .line 774
    iget-boolean v0, p0, Ll/ۙۤ֫;->᩵ܽ:Z

    const/4 v1, 0x0

    .line 775
    iput-boolean v1, p0, Ll/ۙۤ֫;->᩵ܽ:Z

    return v0
.end method

.method public final ۤ()V
    .locals 3

    .line 718
    iget-object v0, p0, Ll/ۙۤ֫;->ᩴܽ:Ll/֡۫֫;

    const/4 v1, 0x1

    iput-boolean v1, p0, Ll/ۙۤ֫;->ۜܽ:Z

    const/4 v1, 0x0

    .line 719
    iput-object v1, p0, Ll/ۙۤ֫;->֡ܽ:Ll/۠ᩴ֫;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 720
    iput-wide v1, p0, Ll/ۙۤ֫;->۠ܽ:J

    .line 722
    :try_start_0
    iget-object v1, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v1}, Ll/۠ۤ֫;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 725
    :try_start_1
    invoke-super {p0}, Ll/ܺ۟֫;->ۤ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 727
    iget-object v1, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    invoke-virtual {v0, v1}, Ll/֡۫֫;->֫(Ll/ۗ᩹֫;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    invoke-virtual {v0, v2}, Ll/֡۫֫;->֫(Ll/ۗ᩹֫;)V

    .line 728
    throw v1

    :catchall_1
    move-exception v1

    .line 725
    :try_start_2
    invoke-super {p0}, Ll/ܺ۟֫;->ۤ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 727
    iget-object v2, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    invoke-virtual {v0, v2}, Ll/֡۫֫;->֫(Ll/ۗ᩹֫;)V

    .line 729
    throw v1

    :catchall_2
    move-exception v1

    .line 727
    iget-object v2, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    invoke-virtual {v0, v2}, Ll/֡۫֫;->֫(Ll/ۗ᩹֫;)V

    .line 728
    throw v1
.end method

.method public final ۧ(Ll/᩸᩸֫;)V
    .locals 4

    .line 929
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p1, Ll/᩸᩸֫;->ۗ:Ll/۠ᩴ֫;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v1, "audio/opus"

    .line 931
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 932
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۘ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 933
    iget-object v0, p1, Ll/᩸᩸֫;->۫:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    iget-object p1, p1, Ll/᩸᩸֫;->ۗ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    iget p1, p1, Ll/۠ᩴ֫;->ᩴ:I

    .line 935
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    .line 936
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 937
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v0

    const-wide/32 v2, 0xbb80

    mul-long v0, v0, v2

    const-wide/32 v2, 0x3b9aca00

    div-long/2addr v0, v2

    long-to-int v1, v0

    .line 938
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0, p1, v1}, Ll/۠ۤ֫;->֫(II)V

    :cond_0
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 756
    invoke-super {p0}, Ll/ܺ۟֫;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0}, Ll/۠ۤ֫;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܰ()V
    .locals 1

    .line 704
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0}, Ll/۠ۤ֫;->ܿ()V

    const/4 v0, 0x1

    .line 705
    iput-boolean v0, p0, Ll/ۙۤ֫;->ۚܽ:Z

    return-void
.end method

.method public final ܽ(JJ)J
    .locals 8

    .line 525
    iget-wide v0, p0, Ll/ۙۤ֫;->۠ܽ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 526
    :goto_0
    iget-boolean v1, p0, Ll/ۙۤ֫;->ۚܽ:Z

    const-wide/16 v4, 0x2710

    if-nez v1, :cond_2

    if-nez v0, :cond_1

    .line 529
    invoke-super {p0}, Ll/ܺ۟֫;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_1
    const-wide/32 p1, 0xf4240

    return-wide p1

    .line 533
    :cond_2
    iget-object v1, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v1}, Ll/۠ۤ֫;->ᩳ()J

    move-result-wide v6

    if-eqz v0, :cond_5

    cmp-long v0, v6, v2

    if-nez v0, :cond_3

    goto :goto_2

    .line 540
    :cond_3
    iget-wide v2, p0, Ll/ۙۤ֫;->۠ܽ:J

    sub-long/2addr v2, p1

    .line 541
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-float p1, p1

    .line 786
    invoke-virtual {v1}, Ll/۠ۤ֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {v1}, Ll/۠ۤ֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object p2

    .line 545
    iget p2, p2, Ll/ۖ᩵֫;->ܽ:F

    goto :goto_1

    :cond_4
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_1
    div-float/2addr p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    float-to-long p1, p1

    .line 548
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۠()Ll/ܽۚ֫;

    move-result-object v0

    invoke-interface {v0}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    sub-long/2addr v0, p3

    sub-long/2addr p1, v0

    .line 549
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1

    :cond_5
    :goto_2
    return-wide v4
.end method

.method public final ܽ()Ll/ۖ᩵֫;
    .locals 1

    .line 786
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0}, Ll/۠ۤ֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(J)V
    .locals 0

    .line 888
    iget-object p1, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ܿ()Z
    .locals 1

    .line 761
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0}, Ll/۠ۤ֫;->֫()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Ll/ܺ۟֫;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ(Ll/۠ᩴ֫;)Z
    .locals 3

    .line 459
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ܶ()Ll/ܿ۬֫;

    move-result-object v0

    iget v0, v0, Ll/ܿ۬֫;->֫:I

    if-eqz v0, :cond_1

    .line 460
    invoke-direct {p0, p1}, Ll/ۙۤ֫;->ܿ(Ll/۠ᩴ֫;)I

    move-result v0

    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_1

    .line 462
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ܶ()Ll/ܿ۬֫;

    move-result-object v1

    iget v1, v1, Ll/ܿ۬֫;->֫:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    and-int/lit16 v0, v0, 0x400

    if-nez v0, :cond_0

    iget v0, p1, Ll/۠ᩴ֫;->ᩴ:I

    if-nez v0, :cond_1

    iget v0, p1, Ll/۠ᩴ֫;->᩵:I

    if-nez v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    .line 469
    :cond_1
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0, p1}, Ll/۠ۤ֫;->֫(Ll/۠ᩴ֫;)Z

    move-result p1

    return p1
.end method

.method public final ᩴ()J
    .locals 2

    .line 766
    invoke-virtual {p0}, Ll/ۙ᩹֫;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 767
    invoke-direct {p0}, Ll/ۙۤ֫;->ۗ֫()V

    .line 769
    :cond_0
    iget-wide v0, p0, Ll/ۙۤ֫;->ۖܽ:J

    return-wide v0
.end method

.method public final ᩵֫()V
    .locals 1

    .line 792
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    invoke-virtual {v0}, Ll/۠ۤ֫;->᩷()V

    return-void
.end method

.method public final ᩺()V
    .locals 4

    .line 734
    iget-object v0, p0, Ll/ۙۤ֫;->᩻ܽ:Ll/۠ۤ֫;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ll/ۙۤ֫;->᩵ܽ:Z

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 735
    iput-wide v2, p0, Ll/ۙۤ֫;->۠ܽ:J

    .line 737
    :try_start_0
    invoke-super {p0}, Ll/ܺ۟֫;->᩺()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 739
    iget-boolean v2, p0, Ll/ۙۤ֫;->ۜܽ:Z

    if-eqz v2, :cond_0

    .line 740
    iput-boolean v1, p0, Ll/ۙۤ֫;->ۜܽ:Z

    .line 741
    invoke-virtual {v0}, Ll/۠ۤ֫;->reset()V

    :cond_0
    return-void

    :catchall_0
    move-exception v2

    .line 739
    iget-boolean v3, p0, Ll/ۙۤ֫;->ۜܽ:Z

    if-eqz v3, :cond_1

    .line 740
    iput-boolean v1, p0, Ll/ۙۤ֫;->ۜܽ:Z

    .line 741
    invoke-virtual {v0}, Ll/۠ۤ֫;->reset()V

    .line 743
    :cond_1
    throw v2
.end method
