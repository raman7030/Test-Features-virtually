.class public final Ll/ܰܺۧ;
.super Ljava/lang/Object;
.source "P8R9"

# interfaces
.implements Ll/֨᩷ۧ;


# static fields
.field public static final ۗ֫:[B

.field public static final ۙ֫:[B

.field public static final ۤ֫:Ljava/util/UUID;

.field public static final ۫֫:[B

.field public static final ۬֫:Ljava/util/Map;

.field public static final ᩶֫:[B


# instance fields
.field public ֡:Ll/᩺ܺۧ;

.field public final ֡֫:Ll/ۜᩴۧ;

.field public ֨:J

.field public final ֨֫:Ll/ᩳ֨֫;

.field public ֫:I

.field public ֫֫:I

.field public ۖ:J

.field public ۖ֫:Z

.field public final ۗ:Ll/ᩳ֨֫;

.field public ۘ:Ll/ۙۚ֫;

.field public ۘ֫:J

.field public ۙ:Z

.field public ۚ:J

.field public final ۚ֫:Ll/ᩳ֨֫;

.field public ۛ:I

.field public ۜ:[I

.field public final ۜ֫:Ll/ᩳ֨֫;

.field public ۟:Z

.field public final ۠:Ll/ᩳ֨֫;

.field public ۠֫:J

.field public ۡ:I

.field public final ۡ֫:Z

.field public ۢ:J

.field public ۢ֫:Z

.field public final ۤ:Ll/ۤܺۧ;

.field public ۧ:J

.field public ۧ֫:Z

.field public ۨ:I

.field public final ۫:Z

.field public final ۬:Ll/ᩳ֨֫;

.field public ܰ:Z

.field public ܳ:I

.field public final ܳ֫:Ll/ᩳ֨֫;

.field public final ܶ:Ll/ᩳ֨֫;

.field public final ܶ֫:Landroid/util/SparseArray;

.field public ܺ:I

.field public ܺ֫:J

.field public ܽ:I

.field public ܽ֫:B

.field public ܿ:Z

.field public final ܿ֫:Ll/ᩳ֨֫;

.field public ᩳ:J

.field public ᩳ֫:Z

.field public ᩴ:Ll/ۙۚ֫;

.field public ᩴ֫:J

.field public ᩵:J

.field public ᩵֫:Z

.field public ᩶:Z

.field public ᩷:I

.field public ᩷֫:J

.field public ᩸:Ljava/nio/ByteBuffer;

.field public final ᩸֫:Ll/֫ۖۧ;

.field public ᩹:Ll/᩸᩷ۧ;

.field public final ᩹֫:Ll/ᩳ֨֫;

.field public ᩺:I

.field public ᩻:I

.field public ᩻֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x20

    new-array v1, v0, [B

    .line 315
    fill-array-data v1, :array_0

    sput-object v1, Ll/ܰܺۧ;->ۗ֫:[B

    .line 335
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1076
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v2, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 335
    sput-object v1, Ll/ܰܺۧ;->᩶֫:[B

    new-array v0, v0, [B

    .line 350
    fill-array-data v0, :array_1

    sput-object v0, Ll/ܰܺۧ;->ۙ֫:[B

    const/16 v0, 0x26

    new-array v0, v0, [B

    .line 379
    fill-array-data v0, :array_2

    sput-object v0, Ll/ܰܺۧ;->۫֫:[B

    .line 407
    new-instance v0, Ljava/util/UUID;

    const-wide v1, 0x100000000001000L

    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    sput-object v0, Ll/ܰܺۧ;->ۤ֫:Ljava/util/UUID;

    .line 413
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "htc_video_rotA-090"

    const/16 v2, 0x5a

    const/4 v3, 0x0

    const-string v4, "htc_video_rotA-000"

    .line 0
    invoke-static {v3, v0, v4, v2, v1}, Ll/۫ۤ᩷;->֫(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    const-string v1, "htc_video_rotA-270"

    const/16 v2, 0x10e

    const/16 v3, 0xb4

    const-string v4, "htc_video_rotA-180"

    invoke-static {v3, v0, v4, v2, v1}, Ll/۫ۤ᩷;->֫(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 418
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ll/ܰܺۧ;->۬֫:Ljava/util/Map;

    return-void

    nop

    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>(Ll/ۜᩴۧ;I)V
    .locals 5

    .line 535
    new-instance v0, Ll/ۤܺۧ;

    invoke-direct {v0}, Ll/ۤܺۧ;-><init>()V

    .line 539
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, -0x1

    .line 442
    iput-wide v1, p0, Ll/ܰܺۧ;->ۘ֫:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 443
    iput-wide v3, p0, Ll/ܰܺۧ;->۠֫:J

    .line 444
    iput-wide v3, p0, Ll/ܰܺۧ;->ۚ:J

    .line 445
    iput-wide v3, p0, Ll/ܰܺۧ;->֨:J

    .line 460
    iput-wide v1, p0, Ll/ܰܺۧ;->᩵:J

    .line 461
    iput-wide v1, p0, Ll/ܰܺۧ;->ܺ֫:J

    .line 462
    iput-wide v3, p0, Ll/ܰܺۧ;->ۖ:J

    .line 540
    iput-object v0, p0, Ll/ܰܺۧ;->ۤ:Ll/ۤܺۧ;

    .line 541
    new-instance v1, Ll/ۨܺۧ;

    invoke-direct {v1, p0}, Ll/ۨܺۧ;-><init>(Ll/ܰܺۧ;)V

    invoke-virtual {v0, v1}, Ll/ۤܺۧ;->֫(Ll/ۛܺۧ;)V

    .line 542
    iput-object p1, p0, Ll/ܰܺۧ;->֡֫:Ll/ۜᩴۧ;

    and-int/lit8 p1, p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 543
    :goto_0
    iput-boolean p1, p0, Ll/ܰܺۧ;->ۡ֫:Z

    and-int/lit8 p1, p2, 0x2

    if-nez p1, :cond_1

    const/4 v0, 0x1

    .line 544
    :cond_1
    iput-boolean v0, p0, Ll/ܰܺۧ;->۫:Z

    .line 545
    new-instance p1, Ll/֫ۖۧ;

    invoke-direct {p1}, Ll/֫ۖۧ;-><init>()V

    iput-object p1, p0, Ll/ܰܺۧ;->᩸֫:Ll/֫ۖۧ;

    .line 546
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/ܰܺۧ;->ܶ֫:Landroid/util/SparseArray;

    .line 547
    new-instance p1, Ll/ᩳ֨֫;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/ܰܺۧ;->ܳ֫:Ll/ᩳ֨֫;

    .line 548
    new-instance p1, Ll/ᩳ֨֫;

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ᩳ֨֫;-><init>([B)V

    iput-object p1, p0, Ll/ܰܺۧ;->᩹֫:Ll/ᩳ֨֫;

    .line 549
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1, p2}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/ܰܺۧ;->ۜ֫:Ll/ᩳ֨֫;

    .line 550
    new-instance p1, Ll/ᩳ֨֫;

    sget-object v0, Ll/ܽ۠֫;->ۧ:[B

    invoke-direct {p1, v0}, Ll/ᩳ֨֫;-><init>([B)V

    iput-object p1, p0, Ll/ܰܺۧ;->۬:Ll/ᩳ֨֫;

    .line 551
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1, p2}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/ܰܺۧ;->ۗ:Ll/ᩳ֨֫;

    .line 552
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ܰܺۧ;->ܿ֫:Ll/ᩳ֨֫;

    .line 553
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ܰܺۧ;->ۚ֫:Ll/ᩳ֨֫;

    .line 554
    new-instance p1, Ll/ᩳ֨֫;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/ܰܺۧ;->۠:Ll/ᩳ֨֫;

    .line 555
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ܰܺۧ;->ܶ:Ll/ᩳ֨֫;

    .line 556
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ܰܺۧ;->֨֫:Ll/ᩳ֨֫;

    new-array p1, v1, [I

    .line 557
    iput-object p1, p0, Ll/ܰܺۧ;->ۜ:[I

    return-void
.end method

.method private ֫(Ll/۠᩷ۧ;Ll/᩺ܺۧ;IZ)I
    .locals 16
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "#2.output"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    const-string v4, "S_TEXT/UTF8"

    .line 1556
    iget-object v5, v2, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1557
    sget-object v2, Ll/ܰܺۧ;->ۗ֫:[B

    invoke-direct {v0, v1, v2, v3}, Ll/ܰܺۧ;->֫(Ll/۠᩷ۧ;[BI)V

    .line 1749
    :cond_0
    :goto_0
    iget v1, v0, Ll/ܰܺۧ;->ۨ:I

    .line 1750
    invoke-direct/range {p0 .. p0}, Ll/ܰܺۧ;->᩻()V

    return v1

    :cond_1
    const-string v4, "S_TEXT/ASS"

    .line 1559
    iget-object v5, v2, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    const-string v4, "S_TEXT/SSA"

    iget-object v5, v2, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_f

    :cond_2
    const-string v4, "S_TEXT/WEBVTT"

    .line 1562
    iget-object v5, v2, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 1563
    sget-object v2, Ll/ܰܺۧ;->۫֫:[B

    invoke-direct {v0, v1, v2, v3}, Ll/ܰܺۧ;->֫(Ll/۠᩷ۧ;[BI)V

    goto :goto_0

    .line 1567
    :cond_3
    iget-object v4, v2, Ll/᩺ܺۧ;->ܰ:Ll/᩵ۢۧ;

    .line 1568
    iget-boolean v5, v0, Ll/ܰܺۧ;->ܰ:Z

    iget-object v6, v0, Ll/ܰܺۧ;->ܿ֫:Ll/ᩳ֨֫;

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v5, :cond_14

    .line 1569
    iget-boolean v5, v2, Ll/᩺ܺۧ;->ܶ:Z

    iget-object v11, v0, Ll/ܰܺۧ;->ܳ֫:Ll/ᩳ֨֫;

    if-eqz v5, :cond_f

    .line 1572
    iget v5, v0, Ll/ܰܺۧ;->ܽ:I

    const v12, -0x40000001    # -1.9999999f

    and-int/2addr v5, v12

    iput v5, v0, Ll/ܰܺۧ;->ܽ:I

    .line 1573
    iget-boolean v5, v0, Ll/ܰܺۧ;->ᩳ֫:Z

    const/16 v12, 0x80

    if-nez v5, :cond_5

    .line 1574
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    invoke-interface {v1, v5, v10, v9}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 1575
    iget v5, v0, Ll/ܰܺۧ;->ۛ:I

    add-int/2addr v5, v9

    iput v5, v0, Ll/ܰܺۧ;->ۛ:I

    .line 1576
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    aget-byte v5, v5, v10

    and-int/2addr v5, v12

    if-eq v5, v12, :cond_4

    .line 1580
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    aget-byte v5, v5, v10

    iput-byte v5, v0, Ll/ܰܺۧ;->ܽ֫:B

    .line 1581
    iput-boolean v9, v0, Ll/ܰܺۧ;->ᩳ֫:Z

    goto :goto_1

    :cond_4
    const-string v1, "Extension bit is set in signal byte"

    const/4 v2, 0x0

    .line 1577
    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 1583
    :cond_5
    :goto_1
    iget-byte v5, v0, Ll/ܰܺۧ;->ܽ֫:B

    and-int/lit8 v13, v5, 0x1

    if-ne v13, v9, :cond_10

    and-int/2addr v5, v8

    if-ne v5, v8, :cond_6

    const/4 v5, 0x1

    goto :goto_2

    :cond_6
    const/4 v5, 0x0

    .line 1586
    :goto_2
    iget v13, v0, Ll/ܰܺۧ;->ܽ:I

    const/high16 v14, 0x40000000    # 2.0f

    or-int/2addr v13, v14

    iput v13, v0, Ll/ܰܺۧ;->ܽ:I

    .line 1587
    iget-boolean v13, v0, Ll/ܰܺۧ;->۟:Z

    if-nez v13, :cond_8

    .line 1588
    iget-object v13, v0, Ll/ܰܺۧ;->۠:Ll/ᩳ֨֫;

    invoke-virtual {v13}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v14

    const/16 v15, 0x8

    invoke-interface {v1, v14, v10, v15}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 1589
    iget v14, v0, Ll/ܰܺۧ;->ۛ:I

    add-int/2addr v14, v15

    iput v14, v0, Ll/ܰܺۧ;->ۛ:I

    .line 1590
    iput-boolean v9, v0, Ll/ܰܺۧ;->۟:Z

    .line 1592
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v14

    if-eqz v5, :cond_7

    goto :goto_3

    :cond_7
    const/4 v12, 0x0

    :goto_3
    or-int/2addr v12, v15

    int-to-byte v12, v12

    .line 1593
    aput-byte v12, v14, v10

    .line 1594
    invoke-virtual {v11, v10}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1595
    invoke-interface {v4, v11, v9, v9}, Ll/᩵ۢۧ;->֫(Ll/ᩳ֨֫;II)V

    .line 1596
    iget v12, v0, Ll/ܰܺۧ;->ۨ:I

    add-int/2addr v12, v9

    iput v12, v0, Ll/ܰܺۧ;->ۨ:I

    .line 1598
    invoke-virtual {v13, v10}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1599
    invoke-interface {v4, v13, v15, v9}, Ll/᩵ۢۧ;->֫(Ll/ᩳ֨֫;II)V

    .line 1603
    iget v12, v0, Ll/ܰܺۧ;->ۨ:I

    add-int/2addr v12, v15

    iput v12, v0, Ll/ܰܺۧ;->ۨ:I

    :cond_8
    if-eqz v5, :cond_10

    .line 1606
    iget-boolean v5, v0, Ll/ܰܺۧ;->ۧ֫:Z

    if-nez v5, :cond_9

    .line 1607
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    invoke-interface {v1, v5, v10, v9}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 1608
    iget v5, v0, Ll/ܰܺۧ;->ۛ:I

    add-int/2addr v5, v9

    iput v5, v0, Ll/ܰܺۧ;->ۛ:I

    .line 1609
    invoke-virtual {v11, v10}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1610
    invoke-virtual {v11}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    iput v5, v0, Ll/ܰܺۧ;->֫֫:I

    .line 1611
    iput-boolean v9, v0, Ll/ܰܺۧ;->ۧ֫:Z

    .line 1613
    :cond_9
    iget v5, v0, Ll/ܰܺۧ;->֫֫:I

    mul-int/lit8 v5, v5, 0x4

    .line 1614
    invoke-virtual {v11, v5}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 1615
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    invoke-interface {v1, v12, v10, v5}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 1616
    iget v12, v0, Ll/ܰܺۧ;->ۛ:I

    add-int/2addr v12, v5

    iput v12, v0, Ll/ܰܺۧ;->ۛ:I

    .line 1617
    iget v5, v0, Ll/ܰܺۧ;->֫֫:I

    div-int/2addr v5, v8

    add-int/2addr v5, v9

    int-to-short v5, v5

    mul-int/lit8 v12, v5, 0x6

    add-int/2addr v12, v8

    .line 1619
    iget-object v13, v0, Ll/ܰܺۧ;->᩸:Ljava/nio/ByteBuffer;

    if-eqz v13, :cond_a

    .line 1620
    invoke-virtual {v13}, Ljava/nio/Buffer;->capacity()I

    move-result v13

    if-ge v13, v12, :cond_b

    .line 1621
    :cond_a
    invoke-static {v12}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v13

    iput-object v13, v0, Ll/ܰܺۧ;->᩸:Ljava/nio/ByteBuffer;

    .line 1623
    :cond_b
    iget-object v13, v0, Ll/ܰܺۧ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v13, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1624
    iget-object v13, v0, Ll/ܰܺۧ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const/4 v5, 0x0

    const/4 v13, 0x0

    .line 1632
    :goto_4
    iget v14, v0, Ll/ܰܺۧ;->֫֫:I

    if-ge v5, v14, :cond_d

    .line 1634
    invoke-virtual {v11}, Ll/ᩳ֨֫;->᩹()I

    move-result v14

    .line 1635
    rem-int/lit8 v15, v5, 0x2

    if-nez v15, :cond_c

    .line 1636
    iget-object v15, v0, Ll/ܰܺۧ;->᩸:Ljava/nio/ByteBuffer;

    sub-int v13, v14, v13

    int-to-short v13, v13

    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto :goto_5

    .line 1639
    :cond_c
    iget-object v15, v0, Ll/ܰܺۧ;->᩸:Ljava/nio/ByteBuffer;

    sub-int v13, v14, v13

    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :goto_5
    add-int/lit8 v5, v5, 0x1

    move v13, v14

    goto :goto_4

    .line 1642
    :cond_d
    iget v5, v0, Ll/ܰܺۧ;->ۛ:I

    sub-int v5, v3, v5

    sub-int/2addr v5, v13

    .line 1643
    rem-int/2addr v14, v8

    if-ne v14, v9, :cond_e

    .line 1644
    iget-object v13, v0, Ll/ܰܺۧ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_6

    .line 1646
    :cond_e
    iget-object v13, v0, Ll/ܰܺۧ;->᩸:Ljava/nio/ByteBuffer;

    int-to-short v5, v5

    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1647
    iget-object v5, v0, Ll/ܰܺۧ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v10}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1649
    :goto_6
    iget-object v5, v0, Ll/ܰܺۧ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    iget-object v13, v0, Ll/ܰܺۧ;->ܶ:Ll/ᩳ֨֫;

    invoke-virtual {v13, v12, v5}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 1650
    invoke-interface {v4, v13, v12, v9}, Ll/᩵ۢۧ;->֫(Ll/ᩳ֨֫;II)V

    .line 1654
    iget v5, v0, Ll/ܰܺۧ;->ۨ:I

    add-int/2addr v5, v12

    iput v5, v0, Ll/ܰܺۧ;->ۨ:I

    goto :goto_7

    .line 1657
    :cond_f
    iget-object v5, v2, Ll/᩺ܺۧ;->ܺ֫:[B

    if-eqz v5, :cond_10

    .line 1659
    array-length v12, v5

    invoke-virtual {v6, v12, v5}, Ll/ᩳ֨֫;->֫(I[B)V

    :cond_10
    :goto_7
    const-string v5, "A_OPUS"

    .line 2486
    iget-object v12, v2, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    move/from16 v5, p4

    goto :goto_8

    .line 2492
    :cond_11
    iget v5, v2, Ll/᩺ܺۧ;->ۙ:I

    if-lez v5, :cond_12

    const/4 v5, 0x1

    goto :goto_8

    :cond_12
    const/4 v5, 0x0

    :goto_8
    if-eqz v5, :cond_13

    .line 1663
    iget v5, v0, Ll/ܰܺۧ;->ܽ:I

    const/high16 v12, 0x10000000

    or-int/2addr v5, v12

    iput v5, v0, Ll/ܰܺۧ;->ܽ:I

    .line 1664
    iget-object v5, v0, Ll/ܰܺۧ;->֨֫:Ll/ᩳ֨֫;

    invoke-virtual {v5, v10}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 1667
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܿ()I

    move-result v5

    add-int/2addr v5, v3

    iget v12, v0, Ll/ܰܺۧ;->ۛ:I

    sub-int/2addr v5, v12

    .line 1668
    invoke-virtual {v11, v7}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 1669
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    shr-int/lit8 v13, v5, 0x18

    and-int/lit16 v13, v13, 0xff

    int-to-byte v13, v13

    aput-byte v13, v12, v10

    .line 1670
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    shr-int/lit8 v13, v5, 0x10

    and-int/lit16 v13, v13, 0xff

    int-to-byte v13, v13

    aput-byte v13, v12, v9

    .line 1671
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    shr-int/lit8 v13, v5, 0x8

    and-int/lit16 v13, v13, 0xff

    int-to-byte v13, v13

    aput-byte v13, v12, v8

    .line 1672
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    const/4 v13, 0x3

    aput-byte v5, v12, v13

    .line 1673
    invoke-interface {v4, v11, v7, v8}, Ll/᩵ۢۧ;->֫(Ll/ᩳ֨֫;II)V

    .line 1674
    iget v5, v0, Ll/ܰܺۧ;->ۨ:I

    add-int/2addr v5, v7

    iput v5, v0, Ll/ܰܺۧ;->ۨ:I

    .line 1677
    :cond_13
    iput-boolean v9, v0, Ll/ܰܺۧ;->ܰ:Z

    .line 1679
    :cond_14
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܿ()I

    move-result v5

    add-int/2addr v5, v3

    const-string v3, "V_MPEG4/ISO/AVC"

    .line 1681
    iget-object v11, v2, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    const-string v3, "V_MPEGH/ISO/HEVC"

    iget-object v11, v2, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    goto :goto_c

    .line 1716
    :cond_15
    iget-object v3, v2, Ll/᩺ܺۧ;->ᩴ֫:Ll/֡ۢۧ;

    if-eqz v3, :cond_17

    .line 1717
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܿ()I

    move-result v3

    if-nez v3, :cond_16

    goto :goto_9

    :cond_16
    const/4 v9, 0x0

    :goto_9
    invoke-static {v9}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1718
    iget-object v3, v2, Ll/᩺ܺۧ;->ᩴ֫:Ll/֡ۢۧ;

    invoke-virtual {v3, v1}, Ll/֡ۢۧ;->֫(Ll/۠᩷ۧ;)V

    .line 1720
    :cond_17
    :goto_a
    iget v3, v0, Ll/ܰܺۧ;->ۛ:I

    if-ge v3, v5, :cond_1d

    sub-int v3, v5, v3

    .line 1868
    invoke-virtual {v6}, Ll/ᩳ֨֫;->֫()I

    move-result v8

    if-lez v8, :cond_18

    .line 1870
    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1871
    invoke-interface {v4, v3, v6}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    goto :goto_b

    .line 1873
    :cond_18
    invoke-interface {v4, v1, v3, v10}, Ll/᩵ۢۧ;->֫(Ll/ۢᩴ֫;IZ)I

    move-result v3

    .line 1722
    :goto_b
    iget v8, v0, Ll/ܰܺۧ;->ۛ:I

    add-int/2addr v8, v3

    iput v8, v0, Ll/ܰܺۧ;->ۛ:I

    .line 1723
    iget v8, v0, Ll/ܰܺۧ;->ۨ:I

    add-int/2addr v8, v3

    iput v8, v0, Ll/ܰܺۧ;->ۨ:I

    goto :goto_a

    .line 1686
    :cond_19
    :goto_c
    iget-object v3, v0, Ll/ܰܺۧ;->ۗ:Ll/ᩳ֨֫;

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v11

    .line 1687
    aput-byte v10, v11, v10

    .line 1688
    aput-byte v10, v11, v9

    .line 1689
    aput-byte v10, v11, v8

    .line 1690
    iget v8, v2, Ll/᩺ܺۧ;->ۛ:I

    rsub-int/lit8 v9, v8, 0x4

    .line 1695
    :goto_d
    iget v12, v0, Ll/ܰܺۧ;->ۛ:I

    if-ge v12, v5, :cond_1d

    .line 1696
    iget v12, v0, Ll/ܰܺۧ;->᩺:I

    if-nez v12, :cond_1b

    .line 1854
    invoke-virtual {v6}, Ll/ᩳ֨֫;->֫()I

    move-result v12

    invoke-static {v8, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    add-int v13, v9, v12

    sub-int v14, v8, v12

    .line 1855
    invoke-interface {v1, v11, v13, v14}, Ll/۠᩷ۧ;->readFully([BII)V

    if-lez v12, :cond_1a

    .line 1857
    invoke-virtual {v6, v9, v12, v11}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 1700
    :cond_1a
    iget v12, v0, Ll/ܰܺۧ;->ۛ:I

    add-int/2addr v12, v8

    iput v12, v0, Ll/ܰܺۧ;->ۛ:I

    .line 1701
    invoke-virtual {v3, v10}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1702
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩹()I

    move-result v12

    iput v12, v0, Ll/ܰܺۧ;->᩺:I

    .line 1704
    iget-object v12, v0, Ll/ܰܺۧ;->۬:Ll/ᩳ֨֫;

    invoke-virtual {v12, v10}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1705
    invoke-interface {v4, v7, v12}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 1706
    iget v12, v0, Ll/ܰܺۧ;->ۨ:I

    add-int/2addr v12, v7

    iput v12, v0, Ll/ܰܺۧ;->ۨ:I

    goto :goto_d

    .line 1868
    :cond_1b
    invoke-virtual {v6}, Ll/ᩳ֨֫;->֫()I

    move-result v13

    if-lez v13, :cond_1c

    .line 1870
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    move-result v12

    .line 1871
    invoke-interface {v4, v12, v6}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    goto :goto_e

    .line 1873
    :cond_1c
    invoke-interface {v4, v1, v12, v10}, Ll/᩵ۢۧ;->֫(Ll/ۢᩴ֫;IZ)I

    move-result v12

    .line 1710
    :goto_e
    iget v13, v0, Ll/ܰܺۧ;->ۛ:I

    add-int/2addr v13, v12

    iput v13, v0, Ll/ܰܺۧ;->ۛ:I

    .line 1711
    iget v13, v0, Ll/ܰܺۧ;->ۨ:I

    add-int/2addr v13, v12

    iput v13, v0, Ll/ܰܺۧ;->ۨ:I

    .line 1712
    iget v13, v0, Ll/ܰܺۧ;->᩺:I

    sub-int/2addr v13, v12

    iput v13, v0, Ll/ܰܺۧ;->᩺:I

    goto :goto_d

    :cond_1d
    const-string v1, "A_VORBIS"

    .line 1727
    iget-object v2, v2, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1736
    iget-object v1, v0, Ll/ܰܺۧ;->᩹֫:Ll/ᩳ֨֫;

    invoke-virtual {v1, v10}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1737
    invoke-interface {v4, v7, v1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 1738
    iget v1, v0, Ll/ܰܺۧ;->ۨ:I

    add-int/2addr v1, v7

    iput v1, v0, Ll/ܰܺۧ;->ۨ:I

    goto/16 :goto_0

    .line 1560
    :cond_1e
    :goto_f
    sget-object v2, Ll/ܰܺۧ;->ۙ֫:[B

    invoke-direct {v0, v1, v2, v3}, Ll/ܰܺۧ;->֫(Ll/۠᩷ۧ;[BI)V

    goto/16 :goto_0
.end method

.method private ֫(J)J
    .locals 7

    .line 1959
    iget-wide v2, p0, Ll/ܰܺۧ;->۠֫:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v0

    if-eqz v4, :cond_0

    .line 1963
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/16 v4, 0x3e8

    move-wide v0, p1

    invoke-static/range {v0 .. v6}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    const-string p1, "Can\'t scale timecode prior to timecodeScale being set."

    const/4 p2, 0x0

    .line 1960
    invoke-static {p1, p2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1
.end method

.method private ֫(Ll/۠᩷ۧ;I)V
    .locals 4

    .line 1533
    iget-object v0, p0, Ll/ܰܺۧ;->ܳ֫:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v1

    if-lt v1, p2, :cond_0

    return-void

    .line 1536
    :cond_0
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۧ()I

    move-result v1

    if-ge v1, p2, :cond_1

    .line 1537
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۧ()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->֫(I)V

    .line 1539
    :cond_1
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v3

    sub-int v3, p2, v3

    invoke-interface {p1, v1, v2, v3}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 1540
    invoke-virtual {v0, p2}, Ll/ᩳ֨֫;->ᩳ(I)V

    return-void
.end method

.method private ֫(Ll/۠᩷ۧ;[BI)V
    .locals 5

    .line 1770
    array-length v0, p2

    add-int/2addr v0, p3

    .line 1771
    iget-object v1, p0, Ll/ܰܺۧ;->ۚ֫:Ll/ᩳ֨֫;

    invoke-virtual {v1}, Ll/ᩳ֨֫;->ۧ()I

    move-result v2

    const/4 v3, 0x0

    if-ge v2, v0, :cond_0

    add-int v2, v0, p3

    .line 1774
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    array-length v4, v2

    invoke-virtual {v1, v4, v2}, Ll/ᩳ֨֫;->֫(I[B)V

    goto :goto_0

    .line 1776
    :cond_0
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    array-length v4, p2

    invoke-static {p2, v3, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1778
    :goto_0
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    array-length p2, p2

    invoke-interface {p1, v2, p2, p3}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 1779
    invoke-virtual {v1, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1780
    invoke-virtual {v1, v0}, Ll/ᩳ֨֫;->ᩳ(I)V

    return-void
.end method

.method private ֫(Ll/᩺ܺۧ;JIII)V
    .locals 17
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "#1.output"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1480
    iget-object v2, v1, Ll/᩺ܺۧ;->ᩴ֫:Ll/֡ۢۧ;

    const/4 v9, 0x1

    if-eqz v2, :cond_0

    .line 1481
    iget-object v3, v1, Ll/᩺ܺۧ;->ܰ:Ll/᩵ۢۧ;

    iget-object v8, v1, Ll/᩺ܺۧ;->ۡ:Ll/ᩴۢۧ;

    move-object v1, v2

    move-object v2, v3

    move-wide/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    invoke-virtual/range {v1 .. v8}, Ll/֡ۢۧ;->֫(Ll/᩵ۢۧ;JIIILl/ᩴۢۧ;)V

    goto/16 :goto_7

    .line 1484
    :cond_0
    iget-object v2, v1, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    const-string v3, "S_TEXT/UTF8"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x2

    const-string v5, "S_TEXT/WEBVTT"

    const-string v6, "S_TEXT/SSA"

    const-string v7, "S_TEXT/ASS"

    const/4 v8, 0x0

    if-nez v2, :cond_1

    iget-object v2, v1, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    .line 1485
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v1, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    .line 1486
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v1, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    .line 1487
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1488
    :cond_1
    iget v2, v0, Ll/ܰܺۧ;->ܳ:I

    if-le v2, v9, :cond_2

    const-string v2, "Skipping subtitle sample in laced block."

    .line 1489
    invoke-static {v2}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_0

    .line 1490
    :cond_2
    iget-wide v10, v0, Ll/ܰܺۧ;->ۧ:J

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v10, v12

    if-nez v2, :cond_4

    const-string v2, "Skipping subtitle sample with no duration."

    .line 1491
    invoke-static {v2}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :cond_3
    :goto_0
    move/from16 v2, p5

    goto/16 :goto_5

    .line 1493
    :cond_4
    iget-object v2, v1, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    iget-object v12, v0, Ll/ܰܺۧ;->ۚ֫:Ll/ᩳ֨֫;

    invoke-virtual {v12}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v13

    .line 1801
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v14

    const/4 v15, -0x1

    sparse-switch v14, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    const/4 v15, 0x3

    goto :goto_1

    :sswitch_1
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    const/4 v15, 0x2

    goto :goto_1

    :sswitch_2
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_1

    :cond_7
    const/4 v15, 0x1

    goto :goto_1

    :sswitch_3
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_1

    :cond_8
    const/4 v15, 0x0

    :goto_1
    const-wide/16 v2, 0x3e8

    packed-switch v15, :pswitch_data_0

    .line 1822
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    :pswitch_0
    const-string v5, "%02d:%02d:%02d,%03d"

    .line 1804
    invoke-static {v5, v10, v11, v2, v3}, Ll/ܰܺۧ;->֫(Ljava/lang/String;JJ)[B

    move-result-object v2

    const/16 v3, 0x13

    goto :goto_2

    :pswitch_1
    const-string v5, "%02d:%02d:%02d.%03d"

    .line 1817
    invoke-static {v5, v10, v11, v2, v3}, Ll/ܰܺۧ;->֫(Ljava/lang/String;JJ)[B

    move-result-object v2

    const/16 v3, 0x19

    goto :goto_2

    :pswitch_2
    const-string v2, "%01d:%02d:%02d:%02d"

    const-wide/16 v5, 0x2710

    .line 1811
    invoke-static {v2, v10, v11, v5, v6}, Ll/ܰܺۧ;->֫(Ljava/lang/String;JJ)[B

    move-result-object v2

    const/16 v3, 0x15

    .line 1824
    :goto_2
    array-length v5, v2

    invoke-static {v2, v8, v13, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1497
    invoke-virtual {v12}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v2

    :goto_3
    invoke-virtual {v12}, Ll/ᩳ֨֫;->ܿ()I

    move-result v3

    if-ge v2, v3, :cond_a

    .line 1498
    invoke-virtual {v12}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    aget-byte v3, v3, v2

    if-nez v3, :cond_9

    .line 1499
    invoke-virtual {v12, v2}, Ll/ᩳ֨֫;->ᩳ(I)V

    goto :goto_4

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 1505
    :cond_a
    :goto_4
    iget-object v2, v1, Ll/᩺ܺۧ;->ܰ:Ll/᩵ۢۧ;

    invoke-virtual {v12}, Ll/ᩳ֨֫;->ܿ()I

    move-result v3

    invoke-interface {v2, v3, v12}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 1506
    invoke-virtual {v12}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    add-int v2, v2, p5

    :goto_5
    const/high16 v3, 0x10000000

    and-int v3, p4, v3

    if-eqz v3, :cond_c

    .line 1511
    iget v3, v0, Ll/ܰܺۧ;->ܳ:I

    iget-object v5, v0, Ll/ܰܺۧ;->֨֫:Ll/ᩳ֨֫;

    if-le v3, v9, :cond_b

    .line 1514
    invoke-virtual {v5, v8}, Ll/ᩳ֨֫;->ܽ(I)V

    goto :goto_6

    .line 1517
    :cond_b
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܿ()I

    move-result v3

    .line 1518
    iget-object v6, v1, Ll/᩺ܺۧ;->ܰ:Ll/᩵ۢۧ;

    invoke-interface {v6, v5, v3, v4}, Ll/᩵ۢۧ;->֫(Ll/ᩳ֨֫;II)V

    add-int/2addr v2, v3

    :cond_c
    :goto_6
    move v14, v2

    .line 1523
    iget-object v10, v1, Ll/᩺ܺۧ;->ܰ:Ll/᩵ۢۧ;

    iget-object v1, v1, Ll/᩺ܺۧ;->ۡ:Ll/ᩴۢۧ;

    move-wide/from16 v11, p2

    move/from16 v13, p4

    move/from16 v15, p6

    move-object/from16 v16, v1

    invoke-interface/range {v10 .. v16}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 1525
    :goto_7
    iput-boolean v9, v0, Ll/ܰܺۧ;->᩶:Z

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_3
        0x2c065c6b -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;JJ)[B
    .locals 10

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x0

    const/4 v3, 0x1

    cmp-long v4, p1, v0

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1833
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    const-wide v0, 0xd693a400L

    .line 1835
    div-long v4, p1, v0

    long-to-int v5, v4

    int-to-long v6, v5

    mul-long v6, v6, v0

    sub-long/2addr p1, v6

    const-wide/32 v0, 0x3938700

    .line 1837
    div-long v6, p1, v0

    long-to-int v4, v6

    int-to-long v6, v4

    mul-long v6, v6, v0

    sub-long/2addr p1, v6

    const-wide/32 v0, 0xf4240

    .line 1839
    div-long v6, p1, v0

    long-to-int v7, v6

    int-to-long v8, v7

    mul-long v8, v8, v0

    sub-long/2addr p1, v8

    .line 1841
    div-long/2addr p1, p3

    long-to-int p2, p1

    .line 1842
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1844
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p3, v1, v2

    aput-object p4, v1, v3

    const/4 p3, 0x2

    aput-object v0, v1, p3

    const/4 p3, 0x3

    aput-object p2, v1, p3

    invoke-static {p1, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 1843
    sget-object p1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1076
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method

.method private ۧ(I)V
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "cueTimesUs",
            "cueClusterPositions"
        }
    .end annotation

    .line 1461
    iget-object v0, p0, Ll/ܰܺۧ;->ᩴ:Ll/ۙۚ֫;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܰܺۧ;->ۘ:Ll/ۙۚ֫;

    if-eqz v0, :cond_0

    return-void

    .line 1462
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Element "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in a Cues"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1
.end method

.method public static bridge synthetic ۧ()[B
    .locals 1

    .line 0
    sget-object v0, Ll/ܰܺۧ;->᩶֫:[B

    return-object v0
.end method

.method private ܽ(I)V
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "currentTrack"
        }
    .end annotation

    .line 1453
    iget-object v0, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    if-eqz v0, :cond_0

    return-void

    .line 1454
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Element "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in a TrackEntry"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1
.end method

.method public static bridge synthetic ܿ()Ljava/util/UUID;
    .locals 1

    .line 0
    sget-object v0, Ll/ܰܺۧ;->ۤ֫:Ljava/util/UUID;

    return-object v0
.end method

.method public static bridge synthetic ᩳ()Ljava/util/Map;
    .locals 1

    .line 0
    sget-object v0, Ll/ܰܺۧ;->۬֫:Ljava/util/Map;

    return-object v0
.end method

.method private ᩻()V
    .locals 2

    const/4 v0, 0x0

    .line 1756
    iput v0, p0, Ll/ܰܺۧ;->ۛ:I

    .line 1757
    iput v0, p0, Ll/ܰܺۧ;->ۨ:I

    .line 1758
    iput v0, p0, Ll/ܰܺۧ;->᩺:I

    .line 1759
    iput-boolean v0, p0, Ll/ܰܺۧ;->ܰ:Z

    .line 1760
    iput-boolean v0, p0, Ll/ܰܺۧ;->ᩳ֫:Z

    .line 1761
    iput-boolean v0, p0, Ll/ܰܺۧ;->ۧ֫:Z

    .line 1762
    iput v0, p0, Ll/ܰܺۧ;->֫֫:I

    .line 1763
    iput-byte v0, p0, Ll/ܰܺۧ;->ܽ֫:B

    .line 1764
    iput-boolean v0, p0, Ll/ܰܺۧ;->۟:Z

    .line 1765
    iget-object v1, p0, Ll/ܰܺۧ;->ܿ֫:Ll/ᩳ֨֫;

    invoke-virtual {v1, v0}, Ll/ᩳ֨֫;->ܽ(I)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 8

    const/4 v0, 0x0

    .line 593
    iput-boolean v0, p0, Ll/ܰܺۧ;->᩶:Z

    const/4 v1, 0x1

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_2

    .line 595
    iget-boolean v3, p0, Ll/ܰܺۧ;->᩶:Z

    if-nez v3, :cond_2

    .line 596
    iget-object v2, p0, Ll/ܰܺۧ;->ۤ:Ll/ۤܺۧ;

    invoke-virtual {v2, p1}, Ll/ۤܺۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 597
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v3

    .line 1942
    iget-boolean v5, p0, Ll/ܰܺۧ;->ۢ֫:Z

    if-eqz v5, :cond_1

    .line 1943
    iput-wide v3, p0, Ll/ܰܺۧ;->ܺ֫:J

    .line 1944
    iget-wide v2, p0, Ll/ܰܺۧ;->᩵:J

    iput-wide v2, p2, Ll/᩻ۢۧ;->֫:J

    .line 1945
    iput-boolean v0, p0, Ll/ܰܺۧ;->ۢ֫:Z

    return v1

    .line 1950
    :cond_1
    iget-boolean v3, p0, Ll/ܰܺۧ;->᩵֫:Z

    if-eqz v3, :cond_0

    iget-wide v3, p0, Ll/ܰܺۧ;->ܺ֫:J

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-eqz v7, :cond_0

    .line 1951
    iput-wide v3, p2, Ll/᩻ۢۧ;->֫:J

    .line 1952
    iput-wide v5, p0, Ll/ܰܺۧ;->ܺ֫:J

    return v1

    :cond_2
    if-nez v2, :cond_5

    .line 602
    :goto_0
    iget-object p1, p0, Ll/ܰܺۧ;->ܶ֫:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p2

    if-ge v0, p2, :cond_4

    .line 603
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ܺۧ;

    .line 2663
    iget-object p2, p1, Ll/᩺ܺۧ;->ܰ:Ll/᩵ۢۧ;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2468
    iget-object p2, p1, Ll/᩺ܺۧ;->ᩴ֫:Ll/֡ۢۧ;

    if-eqz p2, :cond_3

    .line 2469
    iget-object v1, p1, Ll/᩺ܺۧ;->ܰ:Ll/᩵ۢۧ;

    iget-object p1, p1, Ll/᩺ܺۧ;->ۡ:Ll/ᩴۢۧ;

    invoke-virtual {p2, v1, p1}, Ll/֡ۢۧ;->֫(Ll/᩵ۢۧ;Ll/ᩴۢۧ;)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, -0x1

    return p1

    :cond_5
    return v0
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(I)V
    .locals 17

    move-object/from16 v7, p0

    move/from16 v0, p1

    .line 2025
    iget-object v1, v7, Ll/ܰܺۧ;->᩹:Ll/᩸᩷ۧ;

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    const/16 v1, 0xa0

    const-string v2, "A_OPUS"

    const/16 v3, 0x8

    const/4 v4, 0x2

    .line 806
    iget-object v5, v7, Ll/ܰܺۧ;->ܶ֫:Landroid/util/SparseArray;

    const/4 v8, 0x0

    if-eq v0, v1, :cond_36

    const/16 v1, 0xae

    const/4 v4, -0x1

    const/4 v6, 0x1

    const/4 v9, 0x0

    if-eq v0, v1, :cond_12

    const/16 v1, 0x4dbb

    const-wide/16 v2, -0x1

    const v10, 0x1c53bb6b

    if-eq v0, v1, :cond_10

    const/16 v1, 0x6240

    if-eq v0, v1, :cond_e

    const/16 v1, 0x6d80

    if-eq v0, v1, :cond_c

    const v1, 0x1549a966

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v0, v1, :cond_a

    const v1, 0x1654ae6b

    if-eq v0, v1, :cond_8

    if-eq v0, v10, :cond_0

    goto/16 :goto_8

    .line 826
    :cond_0
    iget-boolean v0, v7, Ll/ܰܺۧ;->᩵֫:Z

    if-nez v0, :cond_7

    .line 827
    iget-object v0, v7, Ll/ܰܺۧ;->᩹:Ll/᩸᩷ۧ;

    iget-object v1, v7, Ll/ܰܺۧ;->ᩴ:Ll/ۙۚ֫;

    iget-object v4, v7, Ll/ܰܺۧ;->ۘ:Ll/ۙۚ֫;

    .line 1886
    iget-wide v13, v7, Ll/ܰܺۧ;->ۘ֫:J

    cmp-long v5, v13, v2

    if-eqz v5, :cond_6

    iget-wide v2, v7, Ll/ܰܺۧ;->֨:J

    cmp-long v5, v2, v11

    if-eqz v5, :cond_6

    if-eqz v1, :cond_6

    .line 1889
    invoke-virtual {v1}, Ll/ۙۚ֫;->֫()I

    move-result v2

    if-eqz v2, :cond_6

    if-eqz v4, :cond_6

    .line 1891
    invoke-virtual {v4}, Ll/ۙۚ֫;->֫()I

    move-result v2

    invoke-virtual {v1}, Ll/ۙۚ֫;->֫()I

    move-result v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_3

    .line 1895
    :cond_1
    invoke-virtual {v1}, Ll/ۙۚ֫;->֫()I

    move-result v2

    .line 1896
    new-array v3, v2, [I

    .line 1897
    new-array v5, v2, [J

    .line 1898
    new-array v10, v2, [J

    .line 1899
    new-array v11, v2, [J

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v2, :cond_2

    .line 1901
    invoke-virtual {v1, v12}, Ll/ۙۚ֫;->֫(I)J

    move-result-wide v13

    aput-wide v13, v11, v12

    .line 1902
    iget-wide v13, v7, Ll/ܰܺۧ;->ۘ֫:J

    invoke-virtual {v4, v12}, Ll/ۙۚ֫;->֫(I)J

    move-result-wide v15

    add-long/2addr v15, v13

    aput-wide v15, v5, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    add-int/lit8 v1, v2, -0x1

    if-ge v8, v1, :cond_3

    add-int/lit8 v1, v8, 0x1

    .line 1905
    aget-wide v12, v5, v1

    aget-wide v14, v5, v8

    sub-long/2addr v12, v14

    long-to-int v4, v12

    aput v4, v3, v8

    .line 1906
    aget-wide v12, v11, v1

    aget-wide v14, v11, v8

    sub-long/2addr v12, v14

    aput-wide v12, v10, v8

    move v8, v1

    goto :goto_1

    :cond_3
    move v2, v1

    :goto_2
    if-lez v2, :cond_4

    .line 1911
    aget-wide v12, v11, v2

    iget-wide v14, v7, Ll/ܰܺۧ;->֨:J

    cmp-long v4, v12, v14

    if-lez v4, :cond_4

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    .line 1916
    :cond_4
    iget-wide v12, v7, Ll/ܰܺۧ;->ۘ֫:J

    iget-wide v14, v7, Ll/ܰܺۧ;->ᩴ֫:J

    add-long/2addr v12, v14

    aget-wide v14, v5, v2

    sub-long/2addr v12, v14

    long-to-int v4, v12

    aput v4, v3, v2

    .line 1918
    iget-wide v12, v7, Ll/ܰܺۧ;->֨:J

    aget-wide v14, v11, v2

    sub-long/2addr v12, v14

    aput-wide v12, v10, v2

    if-ge v2, v1, :cond_5

    const-string v1, "Discarding trailing cue points with timestamps greater than total duration"

    .line 1922
    invoke-static {v1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    add-int/2addr v2, v6

    .line 1923
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    .line 1924
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v5

    .line 1925
    invoke-static {v10, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v10

    .line 1926
    invoke-static {v11, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v11

    .line 1929
    :cond_5
    new-instance v1, Ll/᩷᩷ۧ;

    invoke-direct {v1, v3, v5, v10, v11}, Ll/᩷᩷ۧ;-><init>([I[J[J[J)V

    goto :goto_4

    .line 1893
    :cond_6
    :goto_3
    new-instance v1, Ll/᩷ۢۧ;

    iget-wide v2, v7, Ll/ܰܺۧ;->֨:J

    invoke-direct {v1, v2, v3}, Ll/᩷ۢۧ;-><init>(J)V

    .line 827
    :goto_4
    invoke-interface {v0, v1}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 828
    iput-boolean v6, v7, Ll/ܰܺۧ;->᩵֫:Z

    .line 832
    :cond_7
    iput-object v9, v7, Ll/ܰܺۧ;->ᩴ:Ll/ۙۚ֫;

    .line 833
    iput-object v9, v7, Ll/ܰܺۧ;->ۘ:Ll/ۙۚ֫;

    return-void

    .line 904
    :cond_8
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-eqz v0, :cond_9

    .line 908
    iget-object v0, v7, Ll/ܰܺۧ;->᩹:Ll/᩸᩷ۧ;

    invoke-interface {v0}, Ll/᩸᩷ۧ;->ܳ()V

    return-void

    :cond_9
    const-string v0, "No valid tracks were found"

    .line 905
    invoke-static {v0, v9}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 808
    :cond_a
    iget-wide v0, v7, Ll/ܰܺۧ;->۠֫:J

    cmp-long v2, v0, v11

    if-nez v2, :cond_b

    const-wide/32 v0, 0xf4240

    .line 810
    iput-wide v0, v7, Ll/ܰܺۧ;->۠֫:J

    .line 812
    :cond_b
    iget-wide v0, v7, Ll/ܰܺۧ;->ۚ:J

    cmp-long v2, v0, v11

    if-eqz v2, :cond_37

    .line 813
    invoke-direct {v7, v0, v1}, Ll/ܰܺۧ;->֫(J)J

    move-result-wide v0

    iput-wide v0, v7, Ll/ܰܺۧ;->֨:J

    return-void

    .line 884
    :cond_c
    invoke-direct/range {p0 .. p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 885
    iget-object v0, v7, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iget-boolean v1, v0, Ll/᩺ܺۧ;->ܶ:Z

    if-eqz v1, :cond_37

    iget-object v0, v0, Ll/᩺ܺۧ;->ܺ֫:[B

    if-nez v0, :cond_d

    goto/16 :goto_8

    :cond_d
    const-string v0, "Combining encryption and compression is not supported"

    .line 886
    invoke-static {v0, v9}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 871
    :cond_e
    invoke-direct/range {p0 .. p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 872
    iget-object v0, v7, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iget-boolean v1, v0, Ll/᩺ܺۧ;->ܶ:Z

    if-eqz v1, :cond_37

    .line 873
    iget-object v1, v0, Ll/᩺ܺۧ;->ۡ:Ll/ᩴۢۧ;

    if-eqz v1, :cond_f

    .line 877
    new-instance v2, Ll/᩵ᩴ֫;

    new-instance v3, Ll/ᩴᩴ֫;

    sget-object v4, Ll/᩻ᩴ֫;->ᩳ:Ljava/util/UUID;

    const-string v5, "video/webm"

    iget-object v1, v1, Ll/ᩴۢۧ;->ᩳ:[B

    .line 286
    invoke-direct {v3, v4, v9, v5, v1}, Ll/ᩴᩴ֫;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    new-array v1, v6, [Ll/ᩴᩴ֫;

    aput-object v3, v1, v8

    .line 877
    invoke-direct {v2, v1}, Ll/᩵ᩴ֫;-><init>([Ll/ᩴᩴ֫;)V

    iput-object v2, v0, Ll/᩺ܺۧ;->֡:Ll/᩵ᩴ֫;

    return-void

    :cond_f
    const-string v0, "Encrypted Track found but ContentEncKeyID was not found"

    .line 874
    invoke-static {v0, v9}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 817
    :cond_10
    iget v0, v7, Ll/ܰܺۧ;->᩻֫:I

    if-eq v0, v4, :cond_11

    iget-wide v4, v7, Ll/ܰܺۧ;->᩷֫:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_11

    if-ne v0, v10, :cond_37

    .line 822
    iput-wide v4, v7, Ll/ܰܺۧ;->᩵:J

    return-void

    :cond_11
    const-string v0, "Mandatory element SeekID or SeekPosition not found"

    .line 818
    invoke-static {v0, v9}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 891
    :cond_12
    iget-object v0, v7, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 892
    iget-object v1, v0, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    if-eqz v1, :cond_35

    .line 1967
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_5

    :sswitch_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_5

    :cond_13
    const/16 v3, 0x21

    goto/16 :goto_6

    :sswitch_1
    const-string v2, "A_FLAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    goto/16 :goto_5

    :cond_14
    const/16 v3, 0x20

    goto/16 :goto_6

    :sswitch_2
    const-string v2, "A_EAC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto/16 :goto_5

    :cond_15
    const/16 v3, 0x1f

    goto/16 :goto_6

    :sswitch_3
    const-string v2, "V_MPEG2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    goto/16 :goto_5

    :cond_16
    const/16 v3, 0x1e

    goto/16 :goto_6

    :sswitch_4
    const-string v2, "S_TEXT/UTF8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto/16 :goto_5

    :cond_17
    const/16 v3, 0x1d

    goto/16 :goto_6

    :sswitch_5
    const-string v2, "S_TEXT/WEBVTT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto/16 :goto_5

    :cond_18
    const/16 v3, 0x1c

    goto/16 :goto_6

    :sswitch_6
    const-string v2, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto/16 :goto_5

    :cond_19
    const/16 v3, 0x1b

    goto/16 :goto_6

    :sswitch_7
    const-string v2, "S_TEXT/SSA"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto/16 :goto_5

    :cond_1a
    const/16 v3, 0x1a

    goto/16 :goto_6

    :sswitch_8
    const-string v2, "S_TEXT/ASS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    goto/16 :goto_5

    :cond_1b
    const/16 v3, 0x19

    goto/16 :goto_6

    :sswitch_9
    const-string v2, "A_PCM/INT/LIT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    goto/16 :goto_5

    :cond_1c
    const/16 v3, 0x18

    goto/16 :goto_6

    :sswitch_a
    const-string v2, "A_PCM/INT/BIG"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    goto/16 :goto_5

    :cond_1d
    const/16 v3, 0x17

    goto/16 :goto_6

    :sswitch_b
    const-string v2, "A_PCM/FLOAT/IEEE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    goto/16 :goto_5

    :cond_1e
    const/16 v3, 0x16

    goto/16 :goto_6

    :sswitch_c
    const-string v2, "A_DTS/EXPRESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    goto/16 :goto_5

    :cond_1f
    const/16 v3, 0x15

    goto/16 :goto_6

    :sswitch_d
    const-string v2, "V_THEORA"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    goto/16 :goto_5

    :cond_20
    const/16 v3, 0x14

    goto/16 :goto_6

    :sswitch_e
    const-string v2, "S_HDMV/PGS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    goto/16 :goto_5

    :cond_21
    const/16 v3, 0x13

    goto/16 :goto_6

    :sswitch_f
    const-string v2, "V_VP9"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    goto/16 :goto_5

    :cond_22
    const/16 v3, 0x12

    goto/16 :goto_6

    :sswitch_10
    const-string v2, "V_VP8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    goto/16 :goto_5

    :cond_23
    const/16 v3, 0x11

    goto/16 :goto_6

    :sswitch_11
    const-string v2, "V_AV1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    goto/16 :goto_5

    :cond_24
    const/16 v3, 0x10

    goto/16 :goto_6

    :sswitch_12
    const-string v2, "A_DTS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    goto/16 :goto_5

    :cond_25
    const/16 v3, 0xf

    goto/16 :goto_6

    :sswitch_13
    const-string v2, "A_AC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    goto/16 :goto_5

    :cond_26
    const/16 v3, 0xe

    goto/16 :goto_6

    :sswitch_14
    const-string v2, "A_AAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    goto/16 :goto_5

    :cond_27
    const/16 v3, 0xd

    goto/16 :goto_6

    :sswitch_15
    const-string v2, "A_DTS/LOSSLESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    goto/16 :goto_5

    :cond_28
    const/16 v3, 0xc

    goto/16 :goto_6

    :sswitch_16
    const-string v2, "S_VOBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    goto/16 :goto_5

    :cond_29
    const/16 v3, 0xb

    goto/16 :goto_6

    :sswitch_17
    const-string v2, "V_MPEG4/ISO/AVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    goto/16 :goto_5

    :cond_2a
    const/16 v3, 0xa

    goto/16 :goto_6

    :sswitch_18
    const-string v2, "V_MPEG4/ISO/ASP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    goto/16 :goto_5

    :cond_2b
    const/16 v3, 0x9

    goto/16 :goto_6

    :sswitch_19
    const-string v2, "S_DVBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_34

    goto/16 :goto_5

    :sswitch_1a
    const-string v2, "V_MS/VFW/FOURCC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    goto :goto_5

    :cond_2c
    const/4 v3, 0x7

    goto :goto_6

    :sswitch_1b
    const-string v2, "A_MPEG/L3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    goto :goto_5

    :cond_2d
    const/4 v3, 0x6

    goto :goto_6

    :sswitch_1c
    const-string v2, "A_MPEG/L2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    goto :goto_5

    :cond_2e
    const/4 v3, 0x5

    goto :goto_6

    :sswitch_1d
    const-string v2, "A_VORBIS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    goto :goto_5

    :cond_2f
    const/4 v3, 0x4

    goto :goto_6

    :sswitch_1e
    const-string v2, "A_TRUEHD"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    goto :goto_5

    :cond_30
    const/4 v3, 0x3

    goto :goto_6

    :sswitch_1f
    const-string v2, "A_MS/ACM"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    goto :goto_5

    :cond_31
    const/4 v3, 0x2

    goto :goto_6

    :sswitch_20
    const-string v2, "V_MPEG4/ISO/SP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    goto :goto_5

    :cond_32
    const/4 v3, 0x1

    goto :goto_6

    :sswitch_21
    const-string v2, "V_MPEG4/ISO/AP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    goto :goto_5

    :cond_33
    const/4 v3, 0x0

    goto :goto_6

    :goto_5
    const/4 v3, -0x1

    :cond_34
    :goto_6
    packed-switch v3, :pswitch_data_0

    goto :goto_7

    .line 897
    :pswitch_0
    iget-object v1, v7, Ll/ܰܺۧ;->᩹:Ll/᩸᩷ۧ;

    iget v2, v0, Ll/᩺ܺۧ;->᩺:I

    invoke-virtual {v0, v1, v2}, Ll/᩺ܺۧ;->֫(Ll/᩸᩷ۧ;I)V

    .line 898
    iget v1, v0, Ll/᩺ܺۧ;->᩺:I

    invoke-virtual {v5, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 901
    :goto_7
    iput-object v9, v7, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    return-void

    :cond_35
    const-string v0, "CodecId is missing in TrackEntry element"

    .line 893
    invoke-static {v0, v9}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 836
    :cond_36
    iget v0, v7, Ll/ܰܺۧ;->᩷:I

    if-eq v0, v4, :cond_38

    :cond_37
    :goto_8
    return-void

    .line 840
    :cond_38
    iget v0, v7, Ll/ܰܺۧ;->ۡ:I

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ll/᩺ܺۧ;

    .line 2663
    iget-object v0, v9, Ll/᩺ܺۧ;->ܰ:Ll/᩵ۢۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    iget-wide v0, v7, Ll/ܰܺۧ;->ᩳ:J

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-lez v6, :cond_39

    iget-object v0, v9, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_39

    .line 845
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 846
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-wide v1, v7, Ll/ܰܺۧ;->ᩳ:J

    .line 847
    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 848
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    .line 844
    iget-object v1, v7, Ll/ܰܺۧ;->֨֫:Ll/ᩳ֨֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    array-length v2, v0

    invoke-virtual {v1, v2, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    :cond_39
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 853
    :goto_9
    iget v2, v7, Ll/ܰܺۧ;->ܳ:I

    if-ge v0, v2, :cond_3a

    .line 854
    iget-object v2, v7, Ll/ܰܺۧ;->ۜ:[I

    aget v2, v2, v0

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_3a
    const/4 v0, 0x0

    const/4 v10, 0x0

    .line 856
    :goto_a
    iget v0, v7, Ll/ܰܺۧ;->ܳ:I

    if-ge v10, v0, :cond_3c

    .line 857
    iget-wide v2, v7, Ll/ܰܺۧ;->ۢ:J

    iget v0, v9, Ll/᩺ܺۧ;->ܺ:I

    mul-int v0, v0, v10

    div-int/lit16 v0, v0, 0x3e8

    int-to-long v4, v0

    add-long/2addr v2, v4

    .line 858
    iget v0, v7, Ll/ܰܺۧ;->ܽ:I

    if-nez v10, :cond_3b

    .line 859
    iget-boolean v4, v7, Ll/ܰܺۧ;->ܿ:Z

    if-nez v4, :cond_3b

    or-int/lit8 v0, v0, 0x1

    :cond_3b
    move v4, v0

    .line 864
    iget-object v0, v7, Ll/ܰܺۧ;->ۜ:[I

    aget v5, v0, v10

    sub-int v11, v1, v5

    move-object/from16 v0, p0

    move-object v1, v9

    move v6, v11

    .line 866
    invoke-direct/range {v0 .. v6}, Ll/ܰܺۧ;->֫(Ll/᩺ܺۧ;JIII)V

    add-int/lit8 v10, v10, 0x1

    move v1, v11

    goto :goto_a

    .line 868
    :cond_3c
    iput v8, v7, Ll/ܰܺۧ;->᩷:I

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_21
        -0x7ce7f3b0 -> :sswitch_20
        -0x76567dc0 -> :sswitch_1f
        -0x6a615338 -> :sswitch_1e
        -0x672350af -> :sswitch_1d
        -0x585f4fce -> :sswitch_1c
        -0x585f4fcd -> :sswitch_1b
        -0x51dc40b2 -> :sswitch_1a
        -0x37a9c464 -> :sswitch_19
        -0x2016c535 -> :sswitch_18
        -0x2016c4e5 -> :sswitch_17
        -0x19552dbd -> :sswitch_16
        -0x1538b2ba -> :sswitch_15
        0x3c02325 -> :sswitch_14
        0x3c02353 -> :sswitch_13
        0x3c030c5 -> :sswitch_12
        0x4e81333 -> :sswitch_11
        0x4e86155 -> :sswitch_10
        0x4e86156 -> :sswitch_f
        0x5e8da3e -> :sswitch_e
        0x1a8350d6 -> :sswitch_d
        0x2056f406 -> :sswitch_c
        0x25e26ee2 -> :sswitch_b
        0x2b45174d -> :sswitch_a
        0x2b453ce4 -> :sswitch_9
        0x2c0618eb -> :sswitch_8
        0x2c065c6b -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(ID)V
    .locals 1

    const/16 v0, 0xb5

    if-eq p1, v0, :cond_1

    const/16 v0, 0x4489

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    return-void

    .line 1473
    :pswitch_0
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1182
    iput p2, p1, Ll/᩺ܺۧ;->ۤ:F

    return-void

    .line 1473
    :pswitch_1
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1179
    iput p2, p1, Ll/᩺ܺۧ;->۫:F

    return-void

    .line 1473
    :pswitch_2
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1176
    iput p2, p1, Ll/᩺ܺۧ;->ۚ֫:F

    return-void

    .line 1473
    :pswitch_3
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1173
    iput p2, p1, Ll/᩺ܺۧ;->֡֫:F

    return-void

    .line 1473
    :pswitch_4
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1170
    iput p2, p1, Ll/᩺ܺۧ;->֫֫:F

    return-void

    .line 1473
    :pswitch_5
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1167
    iput p2, p1, Ll/᩺ܺۧ;->۟:F

    return-void

    .line 1473
    :pswitch_6
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1164
    iput p2, p1, Ll/᩺ܺۧ;->ܽ֫:F

    return-void

    .line 1473
    :pswitch_7
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1161
    iput p2, p1, Ll/᩺ܺۧ;->ۧ֫:F

    return-void

    .line 1473
    :pswitch_8
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1158
    iput p2, p1, Ll/᩺ܺۧ;->ܿ֫:F

    return-void

    .line 1473
    :pswitch_9
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1155
    iput p2, p1, Ll/᩺ܺۧ;->ᩳ֫:F

    return-void

    .line 1473
    :pswitch_a
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1191
    iput p2, p1, Ll/᩺ܺۧ;->ۜ֫:F

    return-void

    .line 1473
    :pswitch_b
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1188
    iput p2, p1, Ll/᩺ܺۧ;->᩻֫:F

    return-void

    .line 1473
    :pswitch_c
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-float p2, p2

    .line 1185
    iput p2, p1, Ll/᩺ܺۧ;->᩷֫:F

    return-void

    :cond_0
    double-to-long p1, p2

    .line 1149
    iput-wide p1, p0, Ll/ܰܺۧ;->ۚ:J

    return-void

    .line 1473
    :cond_1
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    double-to-int p2, p2

    .line 1152
    iput p2, p1, Ll/᩺ܺۧ;->ۡ֫:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x55d1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7673
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public final ֫(IILl/۠᩷ۧ;)V
    .locals 20

    move-object/from16 v7, p0

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v8, p3

    const/16 v2, 0xa1

    .line 1235
    iget-object v3, v7, Ll/ܰܺۧ;->ܶ֫:Landroid/util/SparseArray;

    const/16 v4, 0xa3

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v9, 0x4

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eq v0, v2, :cond_b

    if-eq v0, v4, :cond_b

    const/16 v2, 0xa5

    if-eq v0, v2, :cond_8

    const/16 v2, 0x41ed

    if-eq v0, v2, :cond_5

    const/16 v2, 0x4255

    if-eq v0, v2, :cond_4

    const/16 v2, 0x47e2

    if-eq v0, v2, :cond_3

    const/16 v2, 0x53ab

    if-eq v0, v2, :cond_2

    const/16 v2, 0x63a2

    if-eq v0, v2, :cond_1

    const/16 v2, 0x7672

    if-ne v0, v2, :cond_0

    .line 1251
    invoke-direct/range {p0 .. p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1252
    iget-object v0, v7, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    new-array v2, v1, [B

    iput-object v2, v0, Ll/᩺ܺۧ;->ܳ֫:[B

    .line 1253
    invoke-interface {v8, v2, v11, v1}, Ll/۠᩷ۧ;->readFully([BII)V

    return-void

    .line 1421
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected id: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 1246
    :cond_1
    invoke-direct/range {p0 .. p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1247
    iget-object v0, v7, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    new-array v2, v1, [B

    iput-object v2, v0, Ll/᩺ܺۧ;->᩻:[B

    .line 1248
    invoke-interface {v8, v2, v11, v1}, Ll/۠᩷ۧ;->readFully([BII)V

    return-void

    .line 1237
    :cond_2
    iget-object v0, v7, Ll/ܰܺۧ;->ۜ֫:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-static {v2, v11}, Ljava/util/Arrays;->fill([BB)V

    .line 1238
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    rsub-int/lit8 v3, v1, 0x4

    invoke-interface {v8, v2, v3, v1}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 1239
    invoke-virtual {v0, v11}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1240
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v0

    long-to-int v1, v0

    iput v1, v7, Ll/ܰܺۧ;->᩻֫:I

    return-void

    .line 1262
    :cond_3
    new-array v2, v1, [B

    .line 1263
    invoke-interface {v8, v2, v11, v1}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 1473
    invoke-direct/range {p0 .. p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object v0, v7, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    .line 1264
    new-instance v1, Ll/ᩴۢۧ;

    invoke-direct {v1, v10, v2, v11, v11}, Ll/ᩴۢۧ;-><init>(I[BII)V

    iput-object v1, v0, Ll/᩺ܺۧ;->ۡ:Ll/ᩴۢۧ;

    return-void

    .line 1256
    :cond_4
    invoke-direct/range {p0 .. p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1258
    iget-object v0, v7, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    new-array v2, v1, [B

    iput-object v2, v0, Ll/᩺ܺۧ;->ܺ֫:[B

    .line 1259
    invoke-interface {v8, v2, v11, v1}, Ll/۠᩷ۧ;->readFully([BII)V

    return-void

    .line 1473
    :cond_5
    invoke-direct/range {p0 .. p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object v0, v7, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    .line 1428
    invoke-static {v0}, Ll/᩺ܺۧ;->֫(Ll/᩺ܺۧ;)I

    move-result v2

    const v3, 0x64767643

    if-eq v2, v3, :cond_7

    invoke-static {v0}, Ll/᩺ܺۧ;->֫(Ll/᩺ܺۧ;)I

    move-result v2

    const v3, 0x64766343

    if-ne v2, v3, :cond_6

    goto :goto_0

    .line 1434
    :cond_6
    invoke-interface {v8, v1}, Ll/۠᩷ۧ;->ܽ(I)V

    return-void

    .line 1430
    :cond_7
    :goto_0
    new-array v2, v1, [B

    iput-object v2, v0, Ll/᩺ܺۧ;->᩵:[B

    .line 1431
    invoke-interface {v8, v2, v11, v1}, Ll/۠᩷ۧ;->readFully([BII)V

    return-void

    .line 1414
    :cond_8
    iget v0, v7, Ll/ܰܺۧ;->᩷:I

    if-eq v0, v6, :cond_9

    goto/16 :goto_11

    .line 1417
    :cond_9
    iget v0, v7, Ll/ܰܺۧ;->ۡ:I

    .line 1418
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܺۧ;

    iget v2, v7, Ll/ܰܺۧ;->֫:I

    if-ne v2, v9, :cond_a

    const-string v2, "V_VP9"

    .line 1441
    iget-object v0, v0, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    .line 1442
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1443
    iget-object v0, v7, Ll/ܰܺۧ;->֨֫:Ll/ᩳ֨֫;

    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 1444
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    invoke-interface {v8, v0, v11, v1}, Ll/۠᩷ۧ;->readFully([BII)V

    return-void

    .line 1447
    :cond_a
    invoke-interface {v8, v1}, Ll/۠᩷ۧ;->ܽ(I)V

    return-void

    .line 1275
    :cond_b
    iget v2, v7, Ll/ܰܺۧ;->᩷:I

    const/16 v4, 0x8

    iget-object v5, v7, Ll/ܰܺۧ;->ܳ֫:Ll/ᩳ֨֫;

    if-nez v2, :cond_c

    .line 1276
    iget-object v2, v7, Ll/ܰܺۧ;->᩸֫:Ll/֫ۖۧ;

    invoke-virtual {v2, v8, v11, v10, v4}, Ll/֫ۖۧ;->֫(Ll/۠᩷ۧ;ZZI)J

    move-result-wide v12

    long-to-int v13, v12

    iput v13, v7, Ll/ܰܺۧ;->ۡ:I

    .line 1277
    invoke-virtual {v2}, Ll/֫ۖۧ;->֫()I

    move-result v2

    iput v2, v7, Ll/ܰܺۧ;->ܺ:I

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 1278
    iput-wide v12, v7, Ll/ܰܺۧ;->ۧ:J

    .line 1279
    iput v10, v7, Ll/ܰܺۧ;->᩷:I

    .line 1280
    invoke-virtual {v5, v11}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 1283
    :cond_c
    iget v2, v7, Ll/ܰܺۧ;->ۡ:I

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ll/᩺ܺۧ;

    if-nez v12, :cond_d

    .line 1287
    iget v0, v7, Ll/ܰܺۧ;->ܺ:I

    sub-int v0, v1, v0

    invoke-interface {v8, v0}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 1288
    iput v11, v7, Ll/ܰܺۧ;->᩷:I

    return-void

    .line 2663
    :cond_d
    iget-object v2, v12, Ll/᩺ܺۧ;->ܰ:Ll/᩵ۢۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1294
    iget v2, v7, Ll/ܰܺۧ;->᩷:I

    if-ne v2, v10, :cond_22

    const/4 v2, 0x3

    .line 1296
    invoke-direct {v7, v8, v2}, Ll/ܰܺۧ;->֫(Ll/۠᩷ۧ;I)V

    .line 1297
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    aget-byte v3, v3, v6

    and-int/lit8 v3, v3, 0x6

    shr-int/2addr v3, v10

    const/16 v13, 0xff

    if-nez v3, :cond_10

    .line 1299
    iput v10, v7, Ll/ܰܺۧ;->ܳ:I

    .line 1300
    iget-object v3, v7, Ll/ܰܺۧ;->ۜ:[I

    if-nez v3, :cond_e

    new-array v3, v10, [I

    goto :goto_1

    .line 2015
    :cond_e
    array-length v4, v3

    if-lt v4, v10, :cond_f

    goto :goto_1

    .line 2019
    :cond_f
    array-length v3, v3

    mul-int/lit8 v3, v3, 0x2

    invoke-static {v3, v10}, Ljava/lang/Math;->max(II)I

    move-result v3

    new-array v3, v3, [I

    .line 1300
    :goto_1
    iput-object v3, v7, Ll/ܰܺۧ;->ۜ:[I

    .line 1301
    iget v4, v7, Ll/ܰܺۧ;->ܺ:I

    sub-int/2addr v1, v4

    sub-int/2addr v1, v2

    aput v1, v3, v11

    goto :goto_5

    .line 1304
    :cond_10
    invoke-direct {v7, v8, v9}, Ll/ܰܺۧ;->֫(Ll/۠᩷ۧ;I)V

    .line 1305
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v9

    aget-byte v9, v9, v2

    and-int/2addr v9, v13

    add-int/2addr v9, v10

    iput v9, v7, Ll/ܰܺۧ;->ܳ:I

    .line 1306
    iget-object v14, v7, Ll/ܰܺۧ;->ۜ:[I

    if-nez v14, :cond_11

    .line 2014
    new-array v14, v9, [I

    goto :goto_2

    .line 2015
    :cond_11
    array-length v15, v14

    if-lt v15, v9, :cond_12

    goto :goto_2

    .line 2019
    :cond_12
    array-length v14, v14

    mul-int/lit8 v14, v14, 0x2

    invoke-static {v14, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    new-array v14, v9, [I

    .line 1306
    :goto_2
    iput-object v14, v7, Ll/ܰܺۧ;->ۜ:[I

    if-ne v3, v6, :cond_13

    .line 1308
    iget v2, v7, Ll/ܰܺۧ;->ܺ:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x4

    iget v2, v7, Ll/ܰܺۧ;->ܳ:I

    div-int/2addr v1, v2

    .line 1310
    invoke-static {v14, v11, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    goto :goto_5

    :cond_13
    if-ne v3, v10, :cond_16

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    .line 1314
    :goto_3
    iget v6, v7, Ll/ܰܺۧ;->ܳ:I

    sub-int/2addr v6, v10

    if-ge v2, v6, :cond_15

    .line 1315
    iget-object v6, v7, Ll/ܰܺۧ;->ۜ:[I

    aput v11, v6, v2

    :goto_4
    add-int/lit8 v6, v4, 0x1

    .line 1318
    invoke-direct {v7, v8, v6}, Ll/ܰܺۧ;->֫(Ll/۠᩷ۧ;I)V

    .line 1319
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v9

    aget-byte v4, v9, v4

    and-int/2addr v4, v13

    .line 1320
    iget-object v9, v7, Ll/ܰܺۧ;->ۜ:[I

    aget v14, v9, v2

    add-int/2addr v14, v4

    aput v14, v9, v2

    if-eq v4, v13, :cond_14

    add-int/2addr v3, v14

    add-int/lit8 v2, v2, 0x1

    move v4, v6

    goto :goto_3

    :cond_14
    move v4, v6

    goto :goto_4

    .line 1324
    :cond_15
    iget-object v2, v7, Ll/ܰܺۧ;->ۜ:[I

    iget v9, v7, Ll/ܰܺۧ;->ܺ:I

    sub-int/2addr v1, v9

    sub-int/2addr v1, v4

    sub-int/2addr v1, v3

    aput v1, v2, v6

    :goto_5
    const/4 v1, 0x1

    const/4 v2, 0x0

    move-object/from16 v17, v5

    goto/16 :goto_b

    :cond_16
    if-ne v3, v2, :cond_21

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x4

    .line 1329
    :goto_6
    iget v9, v7, Ll/ܰܺۧ;->ܳ:I

    sub-int/2addr v9, v10

    if-ge v2, v9, :cond_1e

    .line 1330
    iget-object v9, v7, Ll/ܰܺۧ;->ۜ:[I

    aput v11, v9, v2

    add-int/lit8 v9, v6, 0x1

    .line 1331
    invoke-direct {v7, v8, v9}, Ll/ܰܺۧ;->֫(Ll/۠᩷ۧ;I)V

    .line 1332
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v11

    aget-byte v11, v11, v6

    if-eqz v11, :cond_1d

    const/4 v11, 0x0

    :goto_7
    if-ge v11, v4, :cond_1a

    rsub-int/lit8 v4, v11, 0x7

    shl-int v4, v10, v4

    .line 1339
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v10

    aget-byte v10, v10, v6

    and-int/2addr v10, v4

    if-eqz v10, :cond_19

    add-int v10, v9, v11

    .line 1342
    invoke-direct {v7, v8, v10}, Ll/ܰܺۧ;->֫(Ll/۠᩷ۧ;I)V

    .line 1343
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v15

    aget-byte v6, v15, v6

    and-int/2addr v6, v13

    not-int v4, v4

    and-int/2addr v4, v6

    int-to-long v13, v4

    :goto_8
    if-ge v9, v10, :cond_17

    const/16 v4, 0x8

    shl-long/2addr v13, v4

    .line 1346
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    add-int/lit8 v16, v9, 0x1

    aget-byte v6, v6, v9

    const/16 v9, 0xff

    and-int/2addr v6, v9

    move-object/from16 v17, v5

    int-to-long v4, v6

    or-long/2addr v13, v4

    move/from16 v9, v16

    move-object/from16 v5, v17

    goto :goto_8

    :cond_17
    move-object/from16 v17, v5

    if-lez v2, :cond_18

    mul-int/lit8 v11, v11, 0x7

    add-int/lit8 v11, v11, 0x6

    const-wide/16 v4, 0x1

    shl-long v18, v4, v11

    sub-long v18, v18, v4

    sub-long v13, v13, v18

    :cond_18
    move v6, v10

    goto :goto_9

    :cond_19
    move-object/from16 v17, v5

    add-int/lit8 v11, v11, 0x1

    const/4 v10, 0x1

    const/16 v4, 0x8

    const/16 v13, 0xff

    goto :goto_7

    :cond_1a
    move-object/from16 v17, v5

    const-wide/16 v13, 0x0

    move v6, v9

    :goto_9
    const-wide/32 v4, -0x80000000

    cmp-long v9, v13, v4

    if-ltz v9, :cond_1c

    const-wide/32 v4, 0x7fffffff

    cmp-long v9, v13, v4

    if-gtz v9, :cond_1c

    long-to-int v4, v13

    .line 1360
    iget-object v5, v7, Ll/ܰܺۧ;->ۜ:[I

    if-nez v2, :cond_1b

    goto :goto_a

    :cond_1b
    add-int/lit8 v9, v2, -0x1

    .line 1363
    aget v9, v5, v9

    add-int/2addr v4, v9

    :goto_a
    aput v4, v5, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/16 v4, 0x8

    move-object/from16 v5, v17

    const/16 v13, 0xff

    goto/16 :goto_6

    :cond_1c
    const-string v0, "EBML lacing sample size out of range."

    const/4 v1, 0x0

    .line 1356
    invoke-static {v0, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_1d
    const/4 v0, 0x0

    const-string v1, "No valid varint length mask found"

    .line 1333
    invoke-static {v1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_1e
    move-object/from16 v17, v5

    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 1366
    iget-object v5, v7, Ll/ܰܺۧ;->ۜ:[I

    iget v10, v7, Ll/ܰܺۧ;->ܺ:I

    sub-int/2addr v1, v10

    sub-int/2addr v1, v6

    sub-int/2addr v1, v3

    aput v1, v5, v9

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1375
    :goto_b
    invoke-virtual/range {v17 .. v17}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    aget-byte v2, v3, v2

    shl-int/lit8 v2, v2, 0x8

    invoke-virtual/range {v17 .. v17}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    aget-byte v1, v3, v1

    const/16 v3, 0xff

    and-int/2addr v1, v3

    or-int/2addr v1, v2

    .line 1376
    iget-wide v2, v7, Ll/ܰܺۧ;->ۖ:J

    int-to-long v4, v1

    invoke-direct {v7, v4, v5}, Ll/ܰܺۧ;->֫(J)J

    move-result-wide v4

    add-long/2addr v2, v4

    iput-wide v2, v7, Ll/ܰܺۧ;->ۢ:J

    .line 1377
    iget v1, v12, Ll/᩺ܺۧ;->᩵֫:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_20

    const/16 v1, 0xa3

    if-ne v0, v1, :cond_1f

    .line 1379
    invoke-virtual/range {v17 .. v17}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    aget-byte v1, v1, v2

    const/16 v3, 0x80

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_1f

    goto :goto_c

    :cond_1f
    const/4 v1, 0x0

    goto :goto_d

    :cond_20
    :goto_c
    const/4 v1, 0x1

    .line 1380
    :goto_d
    iput v1, v7, Ll/ܰܺۧ;->ܽ:I

    .line 1381
    iput v2, v7, Ll/ܰܺۧ;->᩷:I

    const/4 v1, 0x0

    .line 1382
    iput v1, v7, Ll/ܰܺۧ;->᩻:I

    goto :goto_e

    .line 1370
    :cond_21
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected lacing value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_22
    :goto_e
    const/16 v1, 0xa3

    if-ne v0, v1, :cond_24

    .line 1388
    :goto_f
    iget v0, v7, Ll/ܰܺۧ;->᩻:I

    iget v1, v7, Ll/ܰܺۧ;->ܳ:I

    if-ge v0, v1, :cond_23

    .line 1389
    iget-object v1, v7, Ll/ܰܺۧ;->ۜ:[I

    aget v0, v1, v0

    const/4 v1, 0x0

    .line 1390
    invoke-direct {v7, v8, v12, v0, v1}, Ll/ܰܺۧ;->֫(Ll/۠᩷ۧ;Ll/᩺ܺۧ;IZ)I

    move-result v5

    .line 1392
    iget-wide v0, v7, Ll/ܰܺۧ;->ۢ:J

    iget v2, v7, Ll/ܰܺۧ;->᩻:I

    iget v3, v12, Ll/᩺ܺۧ;->ܺ:I

    mul-int v2, v2, v3

    div-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    add-long/2addr v2, v0

    .line 1394
    iget v4, v7, Ll/ܰܺۧ;->ܽ:I

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object v1, v12

    invoke-direct/range {v0 .. v6}, Ll/ܰܺۧ;->֫(Ll/᩺ܺۧ;JIII)V

    .line 1395
    iget v0, v7, Ll/ܰܺۧ;->᩻:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v7, Ll/ܰܺۧ;->᩻:I

    goto :goto_f

    :cond_23
    const/4 v0, 0x0

    .line 1397
    iput v0, v7, Ll/ܰܺۧ;->᩷:I

    return-void

    .line 1404
    :cond_24
    :goto_10
    iget v0, v7, Ll/ܰܺۧ;->᩻:I

    iget v1, v7, Ll/ܰܺۧ;->ܳ:I

    if-ge v0, v1, :cond_25

    .line 1405
    iget-object v1, v7, Ll/ܰܺۧ;->ۜ:[I

    aget v2, v1, v0

    const/4 v3, 0x1

    .line 1406
    invoke-direct {v7, v8, v12, v2, v3}, Ll/ܰܺۧ;->֫(Ll/۠᩷ۧ;Ll/᩺ܺۧ;IZ)I

    move-result v2

    aput v2, v1, v0

    .line 1408
    iget v0, v7, Ll/ܰܺۧ;->᩻:I

    add-int/2addr v0, v3

    iput v0, v7, Ll/ܰܺۧ;->᩻:I

    goto :goto_10

    :cond_25
    :goto_11
    return-void
.end method

.method public final ֫(IJ)V
    .locals 8

    const/16 v0, 0x5031

    const/4 v1, 0x0

    const-string v2, " not supported"

    if-eq p1, v0, :cond_13

    const/16 v0, 0x5032

    const-wide/16 v3, 0x1

    if-eq p1, v0, :cond_11

    const/4 v0, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    sparse-switch p1, :sswitch_data_0

    const/4 v0, -0x1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 943
    :sswitch_0
    iput-wide p2, p0, Ll/ܰܺۧ;->۠֫:J

    return-void

    .line 1473
    :sswitch_1
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 973
    iput p3, p1, Ll/᩺ܺۧ;->ܺ:I

    return-void

    .line 1114
    :sswitch_2
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    long-to-int p1, p2

    if-eqz p1, :cond_3

    if-eq p1, v7, :cond_2

    if-eq p1, v6, :cond_1

    if-eq p1, v5, :cond_0

    goto/16 :goto_0

    .line 1126
    :cond_0
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput v5, p1, Ll/᩺ܺۧ;->ۢ֫:I

    return-void

    .line 1123
    :cond_1
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput v6, p1, Ll/᩺ܺۧ;->ۢ֫:I

    return-void

    .line 1120
    :cond_2
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput v7, p1, Ll/᩺ܺۧ;->ۢ֫:I

    return-void

    .line 1117
    :cond_3
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput v0, p1, Ll/᩺ܺۧ;->ۢ֫:I

    return-void

    .line 988
    :sswitch_3
    iput-wide p2, p0, Ll/ܰܺۧ;->ᩳ:J

    return-void

    .line 1473
    :sswitch_4
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 994
    iput p3, p1, Ll/᩺ܺۧ;->֫:I

    return-void

    .line 1473
    :sswitch_5
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    .line 985
    iput-wide p2, p1, Ll/᩺ܺۧ;->ۖ֫:J

    return-void

    .line 1473
    :sswitch_6
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    .line 982
    iput-wide p2, p1, Ll/᩺ܺۧ;->ܿ:J

    return-void

    .line 1473
    :sswitch_7
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 976
    iput p3, p1, Ll/᩺ܺۧ;->ۙ:I

    return-void

    .line 1090
    :sswitch_8
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1091
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput-boolean v7, p1, Ll/᩺ܺۧ;->۠:Z

    long-to-int p3, p2

    .line 1092
    iput p3, p1, Ll/᩺ܺۧ;->ۧ:I

    return-void

    .line 1473
    :sswitch_9
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    cmp-long v1, p2, v3

    if-nez v1, :cond_4

    const/4 v0, 0x1

    .line 967
    :cond_4
    iput-boolean v0, p1, Ll/᩺ܺۧ;->֨:Z

    return-void

    .line 1473
    :sswitch_a
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 955
    iput p3, p1, Ll/᩺ܺۧ;->ۖ:I

    return-void

    .line 1473
    :sswitch_b
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 958
    iput p3, p1, Ll/᩺ܺۧ;->ۘ:I

    return-void

    .line 1473
    :sswitch_c
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 952
    iput p3, p1, Ll/᩺ܺۧ;->ᩴ:I

    return-void

    :sswitch_d
    long-to-int p3, p2

    .line 1056
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    if-eqz p3, :cond_8

    if-eq p3, v7, :cond_7

    if-eq p3, v5, :cond_6

    const/16 p1, 0xf

    if-eq p3, p1, :cond_5

    goto/16 :goto_0

    .line 1068
    :cond_5
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput v5, p1, Ll/᩺ܺۧ;->ۘ֫:I

    return-void

    .line 1065
    :cond_6
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput v7, p1, Ll/᩺ܺۧ;->ۘ֫:I

    return-void

    .line 1062
    :cond_7
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput v6, p1, Ll/᩺ܺۧ;->ۘ֫:I

    return-void

    .line 1059
    :cond_8
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput v0, p1, Ll/᩺ܺۧ;->ۘ֫:I

    return-void

    .line 940
    :sswitch_e
    iget-wide v0, p0, Ll/ܰܺۧ;->ۘ֫:J

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/ܰܺۧ;->᩷֫:J

    return-void

    :sswitch_f
    cmp-long p1, p2, v3

    if-nez p1, :cond_9

    goto/16 :goto_0

    .line 1030
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "AESSettingsCipherMode "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    :sswitch_10
    const-wide/16 v3, 0x5

    cmp-long p1, p2, v3

    if-nez p1, :cond_a

    goto/16 :goto_0

    .line 1023
    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "ContentEncAlgo "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    :sswitch_11
    cmp-long p1, p2, v3

    if-nez p1, :cond_b

    goto/16 :goto_0

    .line 926
    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "EBMLReadVersion "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    :sswitch_12
    cmp-long p1, p2, v3

    if-ltz p1, :cond_c

    const-wide/16 v3, 0x2

    cmp-long p1, p2, v3

    if-gtz p1, :cond_c

    goto/16 :goto_0

    .line 933
    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "DocTypeReadVersion "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    :sswitch_13
    const-wide/16 v3, 0x3

    cmp-long p1, p2, v3

    if-nez p1, :cond_d

    goto/16 :goto_0

    .line 1016
    :cond_d
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "ContentCompAlgo "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 1473
    :sswitch_14
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 979
    invoke-static {p1, p3}, Ll/᩺ܺۧ;->֫(Ll/᩺ܺۧ;I)V

    return-void

    .line 997
    :sswitch_15
    iput-boolean v7, p0, Ll/ܰܺۧ;->ܿ:Z

    return-void

    .line 1039
    :sswitch_16
    iget-boolean v0, p0, Ll/ܰܺۧ;->ۖ֫:Z

    if-nez v0, :cond_14

    .line 1040
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ۧ(I)V

    .line 1044
    iget-object p1, p0, Ll/ܰܺۧ;->ۘ:Ll/ۙۚ֫;

    invoke-virtual {p1, p2, p3}, Ll/ۙۚ֫;->֫(J)V

    .line 1045
    iput-boolean v7, p0, Ll/ܰܺۧ;->ۖ֫:Z

    return-void

    :sswitch_17
    long-to-int p1, p2

    .line 1133
    iput p1, p0, Ll/ܰܺۧ;->֫:I

    return-void

    .line 1049
    :sswitch_18
    invoke-direct {p0, p2, p3}, Ll/ܰܺۧ;->֫(J)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ܰܺۧ;->ۖ:J

    return-void

    .line 1473
    :sswitch_19
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 961
    iput p3, p1, Ll/᩺ܺۧ;->᩺:I

    return-void

    .line 1473
    :sswitch_1a
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 949
    iput p3, p1, Ll/᩺ܺۧ;->᩸:I

    return-void

    .line 1035
    :sswitch_1b
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ۧ(I)V

    .line 1036
    iget-object p1, p0, Ll/ܰܺۧ;->ᩴ:Ll/ۙۚ֫;

    invoke-direct {p0, p2, p3}, Ll/ܰܺۧ;->֫(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ll/ۙۚ֫;->֫(J)V

    return-void

    .line 1473
    :sswitch_1c
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 946
    iput p3, p1, Ll/᩺ܺۧ;->֨֫:I

    return-void

    .line 1473
    :sswitch_1d
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 991
    iput p3, p1, Ll/᩺ܺۧ;->ᩳ:I

    return-void

    .line 1052
    :sswitch_1e
    invoke-direct {p0, p2, p3}, Ll/ܰܺۧ;->֫(J)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ܰܺۧ;->ۧ:J

    return-void

    .line 1473
    :sswitch_1f
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    cmp-long v1, p2, v3

    if-nez v1, :cond_e

    const/4 v0, 0x1

    .line 964
    :cond_e
    iput-boolean v0, p1, Ll/᩺ܺۧ;->ۚ:Z

    return-void

    .line 1473
    :sswitch_20
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 970
    iput p3, p1, Ll/᩺ܺۧ;->᩵֫:I

    return-void

    .line 1473
    :pswitch_0
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 1111
    iput p3, p1, Ll/᩺ܺۧ;->۬:I

    return-void

    .line 1473
    :pswitch_1
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    long-to-int p3, p2

    .line 1108
    iput p3, p1, Ll/᩺ܺۧ;->ۗ:I

    return-void

    .line 1075
    :pswitch_2
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1076
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput-boolean v7, p1, Ll/᩺ܺۧ;->۠:Z

    long-to-int p1, p2

    .line 1077
    invoke-static {p1}, Ll/᩷ᩴ֫;->ᩳ(I)I

    move-result p1

    if-eq p1, v0, :cond_14

    .line 1079
    iget-object p2, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput p1, p2, Ll/᩺ܺۧ;->᩷:I

    return-void

    .line 1083
    :pswitch_3
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    long-to-int p1, p2

    .line 1084
    invoke-static {p1}, Ll/᩷ᩴ֫;->ܿ(I)I

    move-result p1

    if-eq p1, v0, :cond_14

    .line 1086
    iget-object p2, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput p1, p2, Ll/᩺ܺۧ;->ۢ:I

    return-void

    .line 1095
    :pswitch_4
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    long-to-int p1, p2

    if-eq p1, v7, :cond_10

    if-eq p1, v6, :cond_f

    goto :goto_0

    .line 1101
    :cond_f
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput v7, p1, Ll/᩺ܺۧ;->ۜ:I

    return-void

    .line 1098
    :cond_10
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    iput v6, p1, Ll/᩺ܺۧ;->ۜ:I

    return-void

    :cond_11
    cmp-long p1, p2, v3

    if-nez p1, :cond_12

    goto :goto_0

    .line 1009
    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "ContentEncodingScope "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    :cond_13
    const-wide/16 v3, 0x0

    cmp-long p1, p2, v3

    if-nez p1, :cond_15

    :cond_14
    :goto_0
    return-void

    .line 1002
    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "ContentEncodingOrder "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_20
        0x88 -> :sswitch_1f
        0x9b -> :sswitch_1e
        0x9f -> :sswitch_1d
        0xb0 -> :sswitch_1c
        0xb3 -> :sswitch_1b
        0xba -> :sswitch_1a
        0xd7 -> :sswitch_19
        0xe7 -> :sswitch_18
        0xee -> :sswitch_17
        0xf1 -> :sswitch_16
        0xfb -> :sswitch_15
        0x41e7 -> :sswitch_14
        0x4254 -> :sswitch_13
        0x4285 -> :sswitch_12
        0x42f7 -> :sswitch_11
        0x47e1 -> :sswitch_10
        0x47e8 -> :sswitch_f
        0x53ac -> :sswitch_e
        0x53b8 -> :sswitch_d
        0x54b0 -> :sswitch_c
        0x54b2 -> :sswitch_b
        0x54ba -> :sswitch_a
        0x55aa -> :sswitch_9
        0x55b2 -> :sswitch_8
        0x55ee -> :sswitch_7
        0x56aa -> :sswitch_6
        0x56bb -> :sswitch_5
        0x6264 -> :sswitch_4
        0x75a2 -> :sswitch_3
        0x7671 -> :sswitch_2
        0x23e383 -> :sswitch_1
        0x2ad7b1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x55b9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 1

    const/16 v0, 0x86

    if-eq p1, v0, :cond_5

    const/16 v0, 0x4282

    if-eq p1, v0, :cond_2

    const/16 v0, 0x536e

    if-eq p1, v0, :cond_1

    const v0, 0x22b59c

    if-eq p1, v0, :cond_0

    return-void

    .line 1473
    :cond_0
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    .line 1221
    invoke-static {p1, p2}, Ll/᩺ܺۧ;->֫(Ll/᩺ܺۧ;Ljava/lang/String;)V

    return-void

    .line 1473
    :cond_1
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    .line 1215
    iput-object p2, p1, Ll/᩺ܺۧ;->ۨ:Ljava/lang/String;

    return-void

    :cond_2
    const-string p1, "webm"

    .line 1208
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "matroska"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 1209
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "DocType "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " not supported"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 1212
    :cond_4
    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܰܺۧ;->ۙ:Z

    return-void

    .line 1473
    :cond_5
    invoke-direct {p0, p1}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    .line 1218
    iput-object p2, p1, Ll/᩺ܺۧ;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(JIJ)V
    .locals 5

    .line 2025
    iget-object v0, p0, Ll/ܰܺۧ;->᩹:Ll/᩸᩷ۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    const/4 v1, 0x0

    if-eq p3, v0, :cond_c

    const/16 v0, 0xae

    if-eq p3, v0, :cond_b

    const/16 v0, 0xbb

    if-eq p3, v0, :cond_a

    const/16 v0, 0x4dbb

    const-wide/16 v1, -0x1

    if-eq p3, v0, :cond_9

    const/16 v0, 0x5035

    const/4 v3, 0x1

    if-eq p3, v0, :cond_8

    const/16 v0, 0x55d0

    if-eq p3, v0, :cond_7

    const v0, 0x18538067

    if-eq p3, v0, :cond_4

    const p1, 0x1c53bb6b

    if-eq p3, p1, :cond_3

    const p1, 0x1f43b675

    if-eq p3, p1, :cond_0

    goto :goto_0

    .line 763
    :cond_0
    iget-boolean p1, p0, Ll/ܰܺۧ;->᩵֫:Z

    if-nez p1, :cond_2

    .line 765
    iget-boolean p1, p0, Ll/ܰܺۧ;->ۡ֫:Z

    if-eqz p1, :cond_1

    iget-wide p1, p0, Ll/ܰܺۧ;->᩵:J

    cmp-long p3, p1, v1

    if-eqz p3, :cond_1

    .line 767
    iput-boolean v3, p0, Ll/ܰܺۧ;->ۢ֫:Z

    return-void

    .line 771
    :cond_1
    iget-object p1, p0, Ll/ܰܺۧ;->᩹:Ll/᩸᩷ۧ;

    new-instance p2, Ll/᩷ۢۧ;

    iget-wide p3, p0, Ll/ܰܺۧ;->֨:J

    invoke-direct {p2, p3, p4}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {p1, p2}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 772
    iput-boolean v3, p0, Ll/ܰܺۧ;->᩵֫:Z

    :cond_2
    :goto_0
    return-void

    .line 756
    :cond_3
    new-instance p1, Ll/ۙۚ֫;

    invoke-direct {p1}, Ll/ۙۚ֫;-><init>()V

    iput-object p1, p0, Ll/ܰܺۧ;->ᩴ:Ll/ۙۚ֫;

    .line 757
    new-instance p1, Ll/ۙۚ֫;

    invoke-direct {p1}, Ll/ۙۚ֫;-><init>()V

    iput-object p1, p0, Ll/ܰܺۧ;->ۘ:Ll/ۙۚ֫;

    return-void

    .line 744
    :cond_4
    iget-wide v3, p0, Ll/ܰܺۧ;->ۘ֫:J

    cmp-long p3, v3, v1

    if-eqz p3, :cond_6

    cmp-long p3, v3, p1

    if-nez p3, :cond_5

    goto :goto_1

    :cond_5
    const-string p1, "Multiple Segment elements not supported"

    const/4 p2, 0x0

    .line 745
    invoke-static {p1, p2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 748
    :cond_6
    :goto_1
    iput-wide p1, p0, Ll/ܰܺۧ;->ۘ֫:J

    .line 749
    iput-wide p4, p0, Ll/ܰܺۧ;->ᩴ֫:J

    return-void

    .line 1473
    :cond_7
    invoke-direct {p0, p3}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    .line 791
    iput-boolean v3, p1, Ll/᩺ܺۧ;->۠:Z

    return-void

    .line 1473
    :cond_8
    invoke-direct {p0, p3}, Ll/ܰܺۧ;->ܽ(I)V

    .line 1474
    iget-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    .line 784
    iput-boolean v3, p1, Ll/᩺ܺۧ;->ܶ:Z

    return-void

    :cond_9
    const/4 p1, -0x1

    .line 752
    iput p1, p0, Ll/ܰܺۧ;->᩻֫:I

    .line 753
    iput-wide v1, p0, Ll/ܰܺۧ;->᩷֫:J

    return-void

    .line 760
    :cond_a
    iput-boolean v1, p0, Ll/ܰܺۧ;->ۖ֫:Z

    return-void

    .line 787
    :cond_b
    new-instance p1, Ll/᩺ܺۧ;

    invoke-direct {p1}, Ll/᩺ܺۧ;-><init>()V

    iput-object p1, p0, Ll/ܰܺۧ;->֡:Ll/᩺ܺۧ;

    .line 788
    iget-boolean p2, p0, Ll/ܰܺۧ;->ۙ:Z

    iput-boolean p2, p1, Ll/᩺ܺۧ;->᩹:Z

    return-void

    .line 777
    :cond_c
    iput-boolean v1, p0, Ll/ܰܺۧ;->ܿ:Z

    const-wide/16 p1, 0x0

    .line 778
    iput-wide p1, p0, Ll/ܰܺۧ;->ᩳ:J

    return-void
.end method

.method public final ֫(JJ)V
    .locals 0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 576
    iput-wide p1, p0, Ll/ܰܺۧ;->ۖ:J

    const/4 p1, 0x0

    .line 577
    iput p1, p0, Ll/ܰܺۧ;->᩷:I

    .line 578
    iget-object p2, p0, Ll/ܰܺۧ;->ۤ:Ll/ۤܺۧ;

    invoke-virtual {p2}, Ll/ۤܺۧ;->֫()V

    .line 579
    iget-object p2, p0, Ll/ܰܺۧ;->᩸֫:Ll/֫ۖۧ;

    invoke-virtual {p2}, Ll/֫ۖۧ;->ۧ()V

    .line 580
    invoke-direct {p0}, Ll/ܰܺۧ;->᩻()V

    .line 581
    :goto_0
    iget-object p2, p0, Ll/ܰܺۧ;->ܶ֫:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result p3

    if-ge p1, p3, :cond_1

    .line 582
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩺ܺۧ;

    .line 2475
    iget-object p2, p2, Ll/᩺ܺۧ;->ᩴ֫:Ll/֡ۢۧ;

    if-eqz p2, :cond_0

    .line 2476
    invoke-virtual {p2}, Ll/֡ۢۧ;->֫()V

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 2

    .line 568
    iget-boolean v0, p0, Ll/ܰܺۧ;->۫:Z

    if-eqz v0, :cond_0

    .line 569
    new-instance v0, Ll/ۡᩴۧ;

    iget-object v1, p0, Ll/ܰܺۧ;->֡֫:Ll/ۜᩴۧ;

    invoke-direct {v0, p1, v1}, Ll/ۡᩴۧ;-><init>(Ll/᩸᩷ۧ;Ll/ۜᩴۧ;)V

    move-object p1, v0

    .line 570
    :cond_0
    iput-object p1, p0, Ll/ܰܺۧ;->᩹:Ll/᩸᩷ۧ;

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 1

    .line 562
    new-instance v0, Ll/۟ܺۧ;

    invoke-direct {v0}, Ll/۟ܺۧ;-><init>()V

    check-cast p1, Ll/ܺ᩷ۧ;

    invoke-virtual {v0, p1}, Ll/۟ܺۧ;->֫(Ll/ܺ᩷ۧ;)Z

    move-result p1

    return p1
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
