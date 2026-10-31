.class public final Ll/֨᩷֡;
.super Ljava/lang/Object;
.source "3AHN"


# static fields
.field public static final ۬:Ljava/util/regex/Pattern;


# instance fields
.field public ֡:Ljava/lang/String;

.field public ֨:Z

.field public ֫:Ll/ۙ۠ᩴ;

.field public ۖ:Ljava/lang/String;

.field public ۗ:Ljava/lang/String;

.field public ۘ:Ll/ۙ۠ᩴ;

.field public ۙ:Ljava/lang/String;

.field public ۚ:Z

.field public final ۜ:Ljava/util/HashMap;

.field public ۠:J

.field public ۡ:Z

.field public ۢ:Ljava/lang/String;

.field public ۧ:Ll/ۙ۠ᩴ;

.field public ܳ:I

.field public ܶ:J

.field public ܺ:B

.field public ܽ:Ll/ۙ۠ᩴ;

.field public ܿ:J

.field public ᩳ:Z

.field public ᩴ:Ljava/lang/String;

.field public ᩵:I

.field public ᩶:J

.field public ᩷:J

.field public ᩸:Ljava/util/List;

.field public ᩹:Z

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "-?\\d{1,19}(?:\\.\\d{1,19})?"

    .line 225
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/֨᩷֡;->۬:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 267
    iput-object v0, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    .line 333
    iput-object v0, p0, Ll/֨᩷֡;->ۖ:Ljava/lang/String;

    const-string v1, "ustar\u0000"

    .line 338
    iput-object v1, p0, Ll/֨᩷֡;->ᩴ:Ljava/lang/String;

    const-string v1, "00"

    .line 343
    iput-object v1, p0, Ll/֨᩷֡;->ۗ:Ljava/lang/String;

    .line 353
    iput-object v0, p0, Ll/֨᩷֡;->ۢ:Ljava/lang/String;

    .line 408
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/֨᩷֡;->ۜ:Ljava/util/HashMap;

    const-wide/16 v1, -0x1

    .line 410
    iput-wide v1, p0, Ll/֨᩷֡;->ܿ:J

    const-string v1, "user.name"

    .line 416
    invoke-static {v1, v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 417
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x1f

    if-le v1, v2, :cond_0

    const/4 v1, 0x0

    .line 418
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 420
    :cond_0
    iput-object v0, p0, Ll/֨᩷֡;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(BLjava/lang/String;)V
    .locals 0

    .line 676
    invoke-direct {p0, p2}, Ll/֨᩷֡;-><init>(Ljava/lang/String;)V

    .line 677
    iput-byte p1, p0, Ll/֨᩷֡;->ܺ:B

    const/16 p2, 0x4c

    if-ne p1, p2, :cond_0

    const-string p1, "ustar "

    .line 679
    iput-object p1, p0, Ll/֨᩷֡;->ᩴ:Ljava/lang/String;

    const-string p1, " \u0000"

    .line 680
    iput-object p1, p0, Ll/֨᩷֡;->ۗ:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 639
    invoke-direct {p0}, Ll/֨᩷֡;-><init>()V

    .line 235
    sget-char v0, Ljava/io/File;->separatorChar:C

    const/16 v1, 0x2f

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string v0, "/"

    .line 240
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 241
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 641
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    .line 642
    iput-object p1, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/16 p1, 0x41ed

    goto :goto_1

    :cond_1
    const p1, 0x81a4

    .line 643
    :goto_1
    iput p1, p0, Ll/֨᩷֡;->᩵:I

    if-eqz v0, :cond_2

    const/16 p1, 0x35

    goto :goto_2

    :cond_2
    const/16 p1, 0x30

    .line 644
    :goto_2
    iput-byte p1, p0, Ll/֨᩷֡;->ܺ:B

    .line 645
    invoke-static {}, Ll/ۘ᩹ᩴ;->now()Ll/ۘ᩹ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ۠ᩴ;->from(Ll/ۘ᩹ᩴ;)Ll/ۙ۠ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩷֡;->ۘ:Ll/ۙ۠ᩴ;

    const-string p1, ""

    .line 646
    iput-object p1, p0, Ll/֨᩷֡;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;[BLl/᩺᩷֡;)V
    .locals 0

    .line 552
    invoke-direct {p0}, Ll/֨᩷֡;-><init>()V

    .line 1481
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Ll/֨᩷֡;->֫(Ljava/util/Map;[BLl/᩺᩷֡;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 1483
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Corrupted TAR archive."

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static ֫(J[BIIZ)I
    .locals 20

    move-wide/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    const/16 v5, 0x20

    const-wide/16 v6, 0x1

    const-wide/16 v8, 0x0

    if-nez p5, :cond_1

    cmp-long v10, v0, v8

    if-ltz v10, :cond_0

    add-int/lit8 v10, v4, -0x1

    mul-int/lit8 v10, v10, 0x3

    shl-long v10, v6, v10

    cmp-long v12, v0, v10

    if-ltz v12, :cond_1

    :cond_0
    add-int/lit8 v0, v4, -0x1

    .line 154
    invoke-static {v8, v9, v2, v3, v0}, Ll/ۛ᩷֡;->֫(J[BII)V

    add-int/2addr v0, v3

    .line 155
    aput-byte v5, v2, v0

    goto/16 :goto_5

    .line 2041
    :cond_1
    sget v10, Ll/ۛ᩷֡;->֫:I

    const/16 v10, 0x8

    if-ne v4, v10, :cond_2

    const-wide/32 v11, 0x1fffff

    goto :goto_0

    :cond_2
    const-wide v11, 0x1ffffffffL

    :goto_0
    const/4 v13, 0x0

    cmp-long v14, v0, v8

    if-gez v14, :cond_3

    const/4 v14, 0x1

    goto :goto_1

    :cond_3
    const/4 v14, 0x0

    :goto_1
    if-nez v14, :cond_4

    cmp-long v15, v0, v11

    if-gtz v15, :cond_4

    add-int/lit8 v6, v4, -0x1

    .line 154
    invoke-static {v0, v1, v2, v3, v6}, Ll/ۛ᩷֡;->֫(J[BII)V

    add-int v0, v3, v6

    .line 155
    aput-byte v5, v2, v0

    goto/16 :goto_5

    :cond_4
    const/16 v5, 0x9

    const-string v12, " byte field."

    const-string v15, " is too large for "

    const-string v11, "Value "

    if-ge v4, v5, :cond_7

    add-int/lit8 v5, v4, -0x1

    mul-int/lit8 v5, v5, 0x8

    shl-long v16, v6, v5

    .line 125
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v18

    cmp-long v13, v18, v8

    if-ltz v13, :cond_6

    cmp-long v8, v18, v16

    if-gez v8, :cond_6

    if-eqz v14, :cond_5

    sub-long v16, v16, v6

    xor-long v0, v18, v16

    add-long/2addr v0, v6

    const-wide/16 v6, 0xff

    shl-long v5, v6, v5

    or-long v18, v0, v5

    :cond_5
    add-int v0, v3, v4

    add-int/lit8 v0, v0, -0x1

    move-wide/from16 v5, v18

    :goto_2
    if-lt v0, v3, :cond_9

    long-to-int v1, v5

    int-to-byte v1, v1

    .line 135
    aput-byte v1, v2, v0

    shr-long/2addr v5, v10

    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 127
    :cond_6
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 87
    :cond_7
    invoke-static/range {p0 .. p1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v5

    .line 88
    invoke-virtual {v5}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v5

    .line 89
    array-length v6, v5

    add-int/lit8 v7, v4, -0x1

    if-gt v6, v7, :cond_b

    add-int v0, v3, v4

    sub-int/2addr v0, v6

    .line 94
    invoke-static {v5, v13, v2, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz v14, :cond_8

    const/16 v13, 0xff

    :cond_8
    int-to-byte v1, v13

    add-int/lit8 v5, v3, 0x1

    :goto_3
    if-ge v5, v0, :cond_9

    .line 97
    aput-byte v1, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_9
    if-eqz v14, :cond_a

    const/16 v11, 0xff

    goto :goto_4

    :cond_a
    const/16 v11, 0x80

    :goto_4
    int-to-byte v0, v11

    .line 184
    aput-byte v0, v2, v3

    :goto_5
    add-int v0, v3, v4

    return v0

    .line 91
    :cond_b
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static ֫([BIBI)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    add-int v1, p1, v0

    .line 754
    aput-byte p2, p0, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr p1, p3

    return p1
.end method

.method private ֫(Ljava/util/Map;[BLl/᩺᩷֡;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v3, 0x0

    const/16 v4, 0x64

    .line 1490
    invoke-static {v1, v3, v4, v2}, Ll/ۛ᩷֡;->֫([BIILl/᩺᩷֡;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    const/16 v3, 0x8

    .line 1439
    invoke-static {v4, v3, v1}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v5

    long-to-int v6, v5

    .line 1492
    iput v6, v0, Ll/֨᩷֡;->᩵:I

    const/16 v5, 0x6c

    .line 1439
    invoke-static {v5, v3, v1}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v5

    long-to-int v6, v5

    int-to-long v5, v6

    .line 1494
    iput-wide v5, v0, Ll/֨᩷֡;->᩶:J

    const/16 v5, 0x74

    .line 1439
    invoke-static {v5, v3, v1}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v5

    long-to-int v6, v5

    int-to-long v5, v6

    .line 1496
    iput-wide v5, v0, Ll/֨᩷֡;->᩷:J

    const/16 v5, 0x7c

    const/16 v6, 0xc

    .line 1498
    invoke-static {v5, v6, v1}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v7

    iput-wide v7, v0, Ll/֨᩷֡;->ܶ:J

    const-wide/16 v9, 0x0

    cmp-long v5, v7, v9

    if-ltz v5, :cond_12

    const/16 v5, 0x88

    .line 1439
    invoke-static {v5, v6, v1}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v5

    .line 1503
    sget v7, Ll/ᩳۢ֡;->֫:I

    .line 72
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v5, v6, v7}, Ll/ۙ۠ᩴ;->from(JLjava/util/concurrent/TimeUnit;)Ll/ۙ۠ᩴ;

    move-result-object v5

    .line 1503
    iput-object v5, v0, Ll/֨᩷֡;->ۘ:Ll/ۙ۠ᩴ;

    const/16 v5, 0x94

    .line 774
    invoke-static {v5, v3, v1}, Ll/ۛ᩷֡;->֫(II[B)J

    move-result-wide v6

    const/4 v3, 0x0

    move-wide v11, v9

    .line 777
    :goto_0
    array-length v8, v1

    const/16 v13, 0x9c

    const/16 v14, 0x20

    if-ge v3, v8, :cond_1

    .line 778
    aget-byte v8, v1, v3

    if-gt v5, v3, :cond_0

    if-ge v3, v13, :cond_0

    goto :goto_1

    :cond_0
    move v14, v8

    :goto_1
    and-int/lit16 v5, v14, 0xff

    int-to-long v4, v5

    add-long/2addr v9, v4

    int-to-long v4, v14

    add-long/2addr v11, v4

    add-int/lit8 v3, v3, 0x1

    const/16 v5, 0x94

    const/16 v4, 0x64

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    cmp-long v4, v6, v9

    if-eqz v4, :cond_3

    cmp-long v4, v6, v11

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v4, 0x1

    .line 1505
    :goto_3
    iput-boolean v4, v0, Ll/֨᩷֡;->ᩳ:Z

    .line 1507
    aget-byte v4, v1, v13

    iput-byte v4, v0, Ll/֨᩷֡;->ܺ:B

    const/16 v4, 0x9d

    const/16 v5, 0x64

    .line 1508
    invoke-static {v1, v4, v5, v2}, Ll/ۛ᩷֡;->֫([BIILl/᩺᩷֡;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Ll/֨᩷֡;->ۖ:Ljava/lang/String;

    .line 360
    sget-object v4, Ll/ۛ᩷֡;->ۧ:Ll/᩺᩷֡;

    const/16 v5, 0x101

    const/4 v6, 0x6

    invoke-static {v1, v5, v6, v4}, Ll/ۛ᩷֡;->֫([BIILl/᩺᩷֡;)Ljava/lang/String;

    move-result-object v7

    .line 1510
    iput-object v7, v0, Ll/֨᩷֡;->ᩴ:Ljava/lang/String;

    const/16 v7, 0x107

    const/4 v8, 0x2

    .line 360
    invoke-static {v1, v7, v8, v4}, Ll/ۛ᩷֡;->֫([BIILl/᩺᩷֡;)Ljava/lang/String;

    move-result-object v4

    .line 1512
    iput-object v4, v0, Ll/֨᩷֡;->ۗ:Ljava/lang/String;

    const/16 v4, 0x109

    .line 1514
    invoke-static {v1, v4, v14, v2}, Ll/ۛ᩷֡;->֫([BIILl/᩺᩷֡;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Ll/֨᩷֡;->ۙ:Ljava/lang/String;

    const/16 v4, 0x129

    .line 1516
    invoke-static {v1, v4, v14, v2}, Ll/ۛ᩷֡;->֫([BIILl/᩺᩷֡;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Ll/֨᩷֡;->ۢ:Ljava/lang/String;

    .line 1518
    iget-byte v4, v0, Ll/֨᩷֡;->ܺ:B

    const/16 v7, 0x33

    if-eq v4, v7, :cond_4

    const/16 v7, 0x34

    if-ne v4, v7, :cond_5

    :cond_4
    const/16 v4, 0x149

    const/16 v7, 0x8

    .line 1439
    invoke-static {v4, v7, v1}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v8

    long-to-int v4, v8

    .line 1519
    iput v4, v0, Ll/֨᩷֡;->ܳ:I

    const/16 v4, 0x151

    .line 1439
    invoke-static {v4, v7, v1}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v7

    long-to-int v4, v7

    .line 1521
    iput v4, v0, Ll/֨᩷֡;->᩻:I

    :cond_5
    const-string v4, "ustar "

    .line 740
    invoke-static {v5, v6, v4, v1}, Ll/۟᩷֡;->֫(IILjava/lang/String;[B)Z

    move-result v4

    const/4 v7, 0x4

    const/16 v8, 0x159

    if-eqz v4, :cond_7

    const/16 v2, 0xc

    .line 1439
    invoke-static {v8, v2, v1}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v4

    .line 1529
    invoke-static {v4, v5}, Ll/֨᩷֡;->ܽ(J)Ll/ۙ۠ᩴ;

    move-result-object v4

    iput-object v4, v0, Ll/֨᩷֡;->֫:Ll/ۙ۠ᩴ;

    const/16 v4, 0x165

    .line 1439
    invoke-static {v4, v2, v1}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v4

    .line 1531
    invoke-static {v4, v5}, Ll/֨᩷֡;->ܽ(J)Ll/ۙ۠ᩴ;

    move-result-object v2

    iput-object v2, v0, Ll/֨᩷֡;->ܽ:Ll/ۙ۠ᩴ;

    .line 1536
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0x182

    invoke-static {v4, v7, v1}, Ll/ۛ᩷֡;->ܽ(II[B)Ljava/util/List;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, Ll/֨᩷֡;->᩸:Ljava/util/List;

    const/16 v2, 0x1e2

    .line 319
    aget-byte v2, v1, v2

    if-ne v2, v3, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    .line 1538
    :goto_4
    iput-boolean v2, v0, Ll/֨᩷֡;->ۡ:Z

    const/16 v2, 0x1e3

    const/16 v3, 0xc

    .line 1540
    invoke-static {v2, v3, v1}, Ll/ۛ᩷֡;->֫(II[B)J

    move-result-wide v1

    iput-wide v1, v0, Ll/֨᩷֡;->۠:J

    return-void

    :cond_7
    const-string v3, "ustar\u0000"

    .line 743
    invoke-static {v5, v6, v3, v1}, Ll/۟᩷֡;->֫(IILjava/lang/String;[B)Z

    move-result v3

    const-string v4, "/"

    if-eqz v3, :cond_f

    const-string v3, "tar\u0000"

    const/16 v5, 0x1fc

    .line 1405
    invoke-static {v5, v7, v3, v1}, Ll/۟᩷֡;->֫(IILjava/lang/String;[B)Z

    move-result v3

    const/16 v5, 0x1e8

    const/16 v6, 0x1dc

    if-eqz v3, :cond_8

    goto :goto_5

    :cond_8
    const-string v3, "SCHILY.archtype"

    move-object/from16 v7, p1

    .line 1414
    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_9

    const-string v7, "xustar"

    .line 1416
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    const-string v7, "exustar"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    goto :goto_5

    :cond_9
    const/16 v3, 0x1db

    .line 1274
    aget-byte v3, v1, v3

    if-eqz v3, :cond_b

    .line 1276
    aget-byte v7, v1, v13

    const/16 v9, 0x4d

    if-eq v7, v9, :cond_a

    goto :goto_6

    :cond_a
    const/16 v7, 0x1d0

    .line 1282
    aget-byte v7, v1, v7

    and-int/lit16 v7, v7, 0x80

    if-nez v7, :cond_b

    if-eq v3, v14, :cond_b

    goto :goto_6

    .line 1422
    :cond_b
    invoke-static {v6, v1}, Ll/֨᩷֡;->֫(I[B)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_6

    .line 1425
    :cond_c
    invoke-static {v5, v1}, Ll/֨᩷֡;->֫(I[B)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_6

    :cond_d
    :goto_5
    const/16 v3, 0x83

    .line 1546
    invoke-static {v1, v8, v3, v2}, Ll/ۛ᩷֡;->֫([BIILl/᩺᩷֡;)Ljava/lang/String;

    move-result-object v2

    .line 1548
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_e

    .line 0
    invoke-static {v2, v4}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1549
    iget-object v3, v0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    :cond_e
    const/16 v2, 0xc

    .line 1439
    invoke-static {v6, v2, v1}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v3

    .line 1551
    invoke-static {v3, v4}, Ll/֨᩷֡;->ܽ(J)Ll/ۙ۠ᩴ;

    move-result-object v3

    iput-object v3, v0, Ll/֨᩷֡;->֫:Ll/ۙ۠ᩴ;

    .line 1439
    invoke-static {v5, v2, v1}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v1

    .line 1553
    invoke-static {v1, v2}, Ll/֨᩷֡;->ܽ(J)Ll/ۙ۠ᩴ;

    move-result-object v1

    iput-object v1, v0, Ll/֨᩷֡;->ܽ:Ll/ۙ۠ᩴ;

    return-void

    :cond_f
    :goto_6
    const/16 v3, 0x9b

    .line 1559
    invoke-static {v1, v8, v3, v2}, Ll/ۛ᩷֡;->֫([BIILl/᩺᩷֡;)Ljava/lang/String;

    move-result-object v1

    .line 1563
    invoke-virtual {p0}, Ll/֨᩷֡;->᩸()Z

    move-result v2

    if-eqz v2, :cond_10

    iget-object v2, v0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_10

    .line 1564
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    .line 0
    invoke-static {v2, v3, v4}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1564
    iput-object v2, v0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    .line 1566
    :cond_10
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_11

    .line 0
    invoke-static {v1, v4}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1567
    iget-object v2, v0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    :cond_11
    return-void

    .line 1500
    :cond_12
    new-instance v1, Ljava/io/IOException;

    const-string v2, "broken archive, entry with negative size"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ֫(I[B)Z
    .locals 4

    .line 1291
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0x80

    const/4 v1, 0x0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    :goto_0
    const/16 v2, 0xb

    if-ge v0, v2, :cond_1

    add-int v2, p0, v0

    .line 1294
    aget-byte v2, p1, v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_2

    const/16 v3, 0x37

    if-le v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    add-int/2addr p0, v2

    .line 1300
    aget-byte p0, p1, p0

    const/16 p1, 0x20

    if-eq p0, p1, :cond_3

    if-eqz p0, :cond_3

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_3
    return v1
.end method

.method public static ܽ(J)Ll/ۙ۠ᩴ;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 228
    :cond_0
    sget v0, Ll/ᩳۢ֡;->֫:I

    .line 72
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, p1, v0}, Ll/ۙ۠ᩴ;->from(JLjava/util/concurrent/TimeUnit;)Ll/ۙ۠ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ(Ljava/lang/String;)Ll/ۘ᩹ᩴ;
    .locals 7

    .line 248
    sget-object v0, Ll/֨᩷֡;->۬:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    const-string v1, "\'"

    const-string v2, "Corrupted PAX header. Time field value is invalid \'"

    if-eqz v0, :cond_0

    .line 252
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 253
    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v3

    .line 254
    sget-object v5, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    invoke-virtual {v0, v5}, Ljava/math/BigDecimal;->remainder(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    const/16 v5, 0x9

    invoke-virtual {v0, v5}, Ljava/math/BigDecimal;->movePointRight(I)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v5

    .line 256
    :try_start_0
    invoke-static {v3, v4, v5, v6}, Ll/ۘ᩹ᩴ;->ofEpochSecond(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p0
    :try_end_0
    .catch Ll/ܺ᩹ᩴ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 260
    :goto_0
    new-instance v3, Ljava/io/IOException;

    .line 0
    invoke-static {v2, p0, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 260
    invoke-direct {v3, p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 249
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 0
    invoke-static {v2, p0, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 249
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 717
    const-class v1, Ll/֨᩷֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 720
    :cond_0
    check-cast p1, Ll/֨᩷֡;

    .line 1011
    iget-object v1, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    iget-object p1, p1, Ll/֨᩷֡;->֡:Ljava/lang/String;

    .line 730
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1011
    iget-object v0, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    .line 1140
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֡()J
    .locals 2

    .line 1090
    iget-wide v0, p0, Ll/֨᩷֡;->ܶ:J

    return-wide v0
.end method

.method public final ֨()Ll/ۙ۠ᩴ;
    .locals 1

    .line 1110
    iget-object v0, p0, Ll/֨᩷֡;->ܽ:Ll/ۙ۠ᩴ;

    return-object v0
.end method

.method public final ֫()Ll/ۙ۠ᩴ;
    .locals 1

    .line 797
    iget-object v0, p0, Ll/֨᩷֡;->ۧ:Ll/ۙ۠ᩴ;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 1851
    iput p1, p0, Ll/֨᩷֡;->᩵:I

    return-void
.end method

.method public final ֫(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 1745
    iput-wide p1, p0, Ll/֨᩷֡;->ܿ:J

    return-void

    .line 1743
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The offset can not be smaller than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 1801
    iput-object p1, p0, Ll/֨᩷֡;->ۢ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 0

    .line 1925
    iput-object p1, p0, Ll/֨᩷֡;->᩸:Ljava/util/List;

    return-void
.end method

.method public final ֫(Ljava/util/Map;)V
    .locals 8

    .line 1973
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1974
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1604
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const-string v4, "GNU.sparse.size"

    const-string v5, "GNU.sparse.realsize"

    const/4 v6, 0x1

    const/4 v7, -0x1

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v3, "linkpath"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v7, 0xf

    goto/16 :goto_1

    :sswitch_1
    const-string v3, "SCHILY.filetype"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v7, 0xe

    goto/16 :goto_1

    :sswitch_2
    const-string v3, "LIBARCHIVE.creationtime"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v7, 0xd

    goto/16 :goto_1

    :sswitch_3
    const-string v3, "uname"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v7, 0xc

    goto/16 :goto_1

    :sswitch_4
    const-string v3, "mtime"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v7, 0xb

    goto/16 :goto_1

    :sswitch_5
    const-string v3, "gname"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v7, 0xa

    goto/16 :goto_1

    :sswitch_6
    const-string v3, "ctime"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v7, 0x9

    goto/16 :goto_1

    :sswitch_7
    const-string v3, "atime"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v7, 0x8

    goto :goto_1

    :sswitch_8
    const-string v3, "size"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_1

    :cond_9
    const/4 v7, 0x7

    goto :goto_1

    :sswitch_9
    const-string v3, "path"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_1

    :cond_a
    const/4 v7, 0x6

    goto :goto_1

    :sswitch_a
    const-string v3, "uid"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_1

    :cond_b
    const/4 v7, 0x5

    goto :goto_1

    :sswitch_b
    const-string v3, "gid"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_1

    :cond_c
    const/4 v7, 0x4

    goto :goto_1

    :sswitch_c
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_1

    :cond_d
    const/4 v7, 0x3

    goto :goto_1

    :sswitch_d
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_1

    :cond_e
    const/4 v7, 0x2

    goto :goto_1

    :sswitch_e
    const-string v3, "SCHILY.devminor"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_1

    :cond_f
    const/4 v7, 0x1

    goto :goto_1

    :sswitch_f
    const-string v3, "SCHILY.devmajor"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    goto :goto_1

    :cond_10
    const/4 v7, 0x0

    :goto_1
    const-string v3, "GNU.sparse.name"

    packed-switch v7, :pswitch_data_0

    .line 1668
    iget-object v3, p0, Ll/֨᩷֡;->ۜ:Ljava/util/HashMap;

    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 1842
    :pswitch_0
    iput-object v1, p0, Ll/֨᩷֡;->ۖ:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_1
    const-string v2, "sparse"

    .line 1663
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 784
    iput-boolean v6, p0, Ll/֨᩷֡;->᩹:Z

    const-string v1, "SCHILY.realsize"

    .line 785
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 786
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ll/᩻ۢ֡;->ۧ(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, p0, Ll/֨᩷֡;->۠:J

    goto/16 :goto_0

    .line 1640
    :pswitch_2
    invoke-static {v1}, Ll/֨᩷֡;->ܿ(Ljava/lang/String;)Ll/ۘ᩹ᩴ;

    move-result-object v1

    invoke-static {v1}, Ll/ۙ۠ᩴ;->from(Ll/ۘ᩹ᩴ;)Ll/ۙ۠ᩴ;

    move-result-object v1

    .line 1732
    iput-object v1, p0, Ll/֨᩷֡;->ۧ:Ll/ۙ۠ᩴ;

    goto/16 :goto_0

    .line 1963
    :pswitch_3
    iput-object v1, p0, Ll/֨᩷֡;->ۙ:Ljava/lang/String;

    goto/16 :goto_0

    .line 1631
    :pswitch_4
    invoke-static {v1}, Ll/֨᩷֡;->ܿ(Ljava/lang/String;)Ll/ۘ᩹ᩴ;

    move-result-object v1

    invoke-static {v1}, Ll/ۙ۠ᩴ;->from(Ll/ۘ᩹ᩴ;)Ll/ۙ۠ᩴ;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/֨᩷֡;->֫(Ll/ۙ۠ᩴ;)V

    goto/16 :goto_0

    .line 1801
    :pswitch_5
    iput-object v1, p0, Ll/֨᩷֡;->ۢ:Ljava/lang/String;

    goto/16 :goto_0

    .line 1637
    :pswitch_6
    invoke-static {v1}, Ll/֨᩷֡;->ܿ(Ljava/lang/String;)Ll/ۘ᩹ᩴ;

    move-result-object v1

    invoke-static {v1}, Ll/ۙ۠ᩴ;->from(Ll/ۘ᩹ᩴ;)Ll/ۙ۠ᩴ;

    move-result-object v1

    .line 1935
    iput-object v1, p0, Ll/֨᩷֡;->ܽ:Ll/ۙ۠ᩴ;

    goto/16 :goto_0

    .line 1634
    :pswitch_7
    invoke-static {v1}, Ll/֨᩷֡;->ܿ(Ljava/lang/String;)Ll/ۘ᩹ᩴ;

    move-result-object v1

    invoke-static {v1}, Ll/ۙ۠ᩴ;->from(Ll/ۘ᩹ᩴ;)Ll/ۙ۠ᩴ;

    move-result-object v1

    .line 1822
    iput-object v1, p0, Ll/֨᩷֡;->֫:Ll/ۙ۠ᩴ;

    goto/16 :goto_0

    .line 1624
    :pswitch_8
    invoke-static {v1}, Ll/᩻ۢ֡;->ۧ(Ljava/lang/String;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_11

    .line 1628
    invoke-virtual {p0, v1, v2}, Ll/֨᩷֡;->ۧ(J)V

    goto/16 :goto_0

    .line 1626
    :cond_11
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Corrupted TAR archive. Entry size is negative"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1606
    :pswitch_9
    invoke-virtual {p0, v1}, Ll/֨᩷֡;->ܽ(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1618
    :pswitch_a
    invoke-static {v1}, Ll/᩻ۢ֡;->ۧ(Ljava/lang/String;)J

    move-result-wide v1

    .line 1954
    iput-wide v1, p0, Ll/֨᩷֡;->᩶:J

    goto/16 :goto_0

    .line 1612
    :pswitch_b
    invoke-static {v1}, Ll/᩻ۢ֡;->ۧ(Ljava/lang/String;)J

    move-result-wide v1

    .line 1792
    iput-wide v1, p0, Ll/֨᩷֡;->᩷:J

    goto/16 :goto_0

    .line 764
    :pswitch_c
    iput-boolean v6, p0, Ll/֨᩷֡;->֨:Z

    .line 765
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ll/᩻ۢ֡;->֫(Ljava/lang/String;)I

    move-result v1

    int-to-long v1, v1

    iput-wide v1, p0, Ll/֨᩷֡;->۠:J

    .line 766
    invoke-interface {p1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 768
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    goto/16 :goto_0

    .line 773
    :pswitch_d
    iput-boolean v6, p0, Ll/֨᩷֡;->֨:Z

    .line 774
    iput-boolean v6, p0, Ll/֨᩷֡;->ۚ:Z

    .line 775
    invoke-interface {p1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 776
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    .line 778
    :cond_12
    invoke-interface {p1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 779
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ll/᩻ۢ֡;->֫(Ljava/lang/String;)I

    move-result v1

    int-to-long v1, v1

    iput-wide v1, p0, Ll/֨᩷֡;->۠:J

    goto/16 :goto_0

    .line 1643
    :pswitch_e
    invoke-static {v1}, Ll/᩻ۢ֡;->֫(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_14

    if-ltz v1, :cond_13

    .line 1773
    iput v1, p0, Ll/֨᩷֡;->᩻:I

    goto/16 :goto_0

    .line 1771
    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Minor device number is out of range: "

    .line 0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1771
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1645
    :cond_14
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Corrupted TAR archive. Dev-Minor is negative"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1650
    :pswitch_f
    invoke-static {v1}, Ll/᩻ۢ֡;->֫(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_16

    if-ltz v1, :cond_15

    .line 1759
    iput v1, p0, Ll/֨᩷֡;->ܳ:I

    goto/16 :goto_0

    .line 1757
    :cond_15
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Major device number is out of range: "

    .line 0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1757
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1652
    :cond_16
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Corrupted TAR archive. Dev-Major is negative"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7240fdec -> :sswitch_f
        -0x723d4bf0 -> :sswitch_e
        -0x108a42f3 -> :sswitch_d
        -0x98f3691 -> :sswitch_c
        0x18fc2 -> :sswitch_b
        0x1c450 -> :sswitch_a
        0x346425 -> :sswitch_9
        0x35e001 -> :sswitch_8
        0x58d3aae -> :sswitch_7
        0x5a969b0 -> :sswitch_6
        0x5deef72 -> :sswitch_5
        0x63654ba -> :sswitch_4
        0x6a43880 -> :sswitch_3
        0x122211dd -> :sswitch_2
        0x1fa1f206 -> :sswitch_1
        0x473a871f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
.end method

.method public final ֫(Ll/ۙ۠ᩴ;)V
    .locals 1

    const-string v0, "time"

    .line 1832
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/֨᩷֡;->ۘ:Ll/ۙ۠ᩴ;

    return-void
.end method

.method public final ֫([BLl/᩺᩷֡;Z)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    .line 2002
    iget-object v1, v0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    const/4 v9, 0x0

    const/16 v10, 0x64

    invoke-static {v1, v7, v9, v10, v8}, Ll/ۛ᩷֡;->֫(Ljava/lang/String;[BIILl/᩺᩷֡;)I

    move-result v4

    .line 2003
    iget v1, v0, Ll/֨᩷֡;->᩵:I

    int-to-long v1, v1

    const/16 v11, 0x8

    move-object/from16 v3, p1

    move v5, v11

    move/from16 v6, p3

    invoke-static/range {v1 .. v6}, Ll/֨᩷֡;->֫(J[BIIZ)I

    move-result v4

    .line 2004
    iget-wide v1, v0, Ll/֨᩷֡;->᩶:J

    invoke-static/range {v1 .. v6}, Ll/֨᩷֡;->֫(J[BIIZ)I

    move-result v4

    .line 2005
    iget-wide v1, v0, Ll/֨᩷֡;->᩷:J

    invoke-static/range {v1 .. v6}, Ll/֨᩷֡;->֫(J[BIIZ)I

    move-result v4

    .line 2006
    iget-wide v1, v0, Ll/֨᩷֡;->ܶ:J

    const/16 v5, 0xc

    invoke-static/range {v1 .. v6}, Ll/֨᩷֡;->֫(J[BIIZ)I

    move-result v4

    .line 2007
    iget-object v1, v0, Ll/֨᩷֡;->ۘ:Ll/ۙ۠ᩴ;

    sget v2, Ll/ۜۢ֡;->֫:I

    .line 177
    sget v2, Ll/ᩳۢ֡;->֫:I

    const-wide/16 v11, 0x0

    if-eqz v1, :cond_0

    .line 282
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2}, Ll/ۙ۠ᩴ;->to(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide v1, v11

    :goto_0
    const/16 v5, 0xc

    move-object/from16 v3, p1

    move/from16 v6, p3

    .line 2007
    invoke-static/range {v1 .. v6}, Ll/֨᩷֡;->֫(J[BIIZ)I

    move-result v13

    const/16 v14, 0x20

    const/16 v15, 0x8

    .line 2009
    invoke-static {v7, v13, v14, v15}, Ll/֨᩷֡;->֫([BIBI)I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    .line 2010
    iget-byte v3, v0, Ll/֨᩷֡;->ܺ:B

    aput-byte v3, v7, v1

    .line 2011
    iget-object v1, v0, Ll/֨᩷֡;->ۖ:Ljava/lang/String;

    invoke-static {v1, v7, v2, v10, v8}, Ll/ۛ᩷֡;->֫(Ljava/lang/String;[BIILl/᩺᩷֡;)I

    move-result v1

    .line 2012
    iget-object v2, v0, Ll/֨᩷֡;->ᩴ:Ljava/lang/String;

    .line 199
    sget-object v3, Ll/ۛ᩷֡;->ۧ:Ll/᩺᩷֡;

    const/4 v10, 0x6

    invoke-static {v2, v7, v1, v10, v3}, Ll/ۛ᩷֡;->֫(Ljava/lang/String;[BIILl/᩺᩷֡;)I

    move-result v1

    .line 2013
    iget-object v2, v0, Ll/֨᩷֡;->ۗ:Ljava/lang/String;

    const/4 v4, 0x2

    .line 199
    invoke-static {v2, v7, v1, v4, v3}, Ll/ۛ᩷֡;->֫(Ljava/lang/String;[BIILl/᩺᩷֡;)I

    move-result v1

    .line 2014
    iget-object v2, v0, Ll/֨᩷֡;->ۙ:Ljava/lang/String;

    invoke-static {v2, v7, v1, v14, v8}, Ll/ۛ᩷֡;->֫(Ljava/lang/String;[BIILl/᩺᩷֡;)I

    move-result v1

    .line 2015
    iget-object v2, v0, Ll/֨᩷֡;->ۢ:Ljava/lang/String;

    invoke-static {v2, v7, v1, v14, v8}, Ll/ۛ᩷֡;->֫(Ljava/lang/String;[BIILl/᩺᩷֡;)I

    move-result v4

    .line 2016
    iget v1, v0, Ll/֨᩷֡;->ܳ:I

    int-to-long v1, v1

    const/16 v8, 0x8

    move-object/from16 v3, p1

    move v5, v8

    invoke-static/range {v1 .. v6}, Ll/֨᩷֡;->֫(J[BIIZ)I

    move-result v4

    .line 2017
    iget v1, v0, Ll/֨᩷֡;->᩻:I

    int-to-long v1, v1

    invoke-static/range {v1 .. v6}, Ll/֨᩷֡;->֫(J[BIIZ)I

    move-result v1

    if-eqz p3, :cond_3

    int-to-byte v8, v9

    const/16 v2, 0x83

    .line 760
    invoke-static {v7, v1, v8, v2}, Ll/֨᩷֡;->֫([BIBI)I

    move-result v4

    .line 2021
    iget-object v1, v0, Ll/֨᩷֡;->֫:Ll/ۙ۠ᩴ;

    const/16 v5, 0xc

    if-eqz v1, :cond_1

    .line 282
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2}, Ll/ۙ۠ᩴ;->to(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    const/4 v6, 0x1

    move-object/from16 v3, p1

    .line 2046
    invoke-static/range {v1 .. v6}, Ll/֨᩷֡;->֫(J[BIIZ)I

    move-result v1

    goto :goto_1

    .line 760
    :cond_1
    invoke-static {v7, v4, v8, v5}, Ll/֨᩷֡;->֫([BIBI)I

    move-result v1

    :goto_1
    move v4, v1

    .line 2022
    iget-object v1, v0, Ll/֨᩷֡;->ܽ:Ll/ۙ۠ᩴ;

    const/16 v5, 0xc

    if-eqz v1, :cond_2

    .line 282
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2}, Ll/ۙ۠ᩴ;->to(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    const/4 v6, 0x1

    move-object/from16 v3, p1

    .line 2046
    invoke-static/range {v1 .. v6}, Ll/֨᩷֡;->֫(J[BIIZ)I

    move-result v1

    goto :goto_2

    .line 760
    :cond_2
    invoke-static {v7, v4, v8, v5}, Ll/֨᩷֡;->֫([BIBI)I

    move-result v1

    :goto_2
    invoke-static {v7, v1, v8, v15}, Ll/֨᩷֡;->֫([BIBI)I

    move-result v1

    const/4 v2, 0x4

    invoke-static {v7, v1, v8, v2}, Ll/֨᩷֡;->֫([BIBI)I

    move-result v1

    .line 2029
    :cond_3
    array-length v2, v7

    sub-int/2addr v2, v1

    int-to-byte v3, v9

    .line 760
    invoke-static {v7, v1, v3, v2}, Ll/֨᩷֡;->֫([BIBI)I

    .line 65
    array-length v1, v7

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v1, :cond_4

    aget-byte v3, v7, v2

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    add-long/2addr v11, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 116
    :cond_4
    invoke-static {v11, v12, v7, v13, v10}, Ll/ۛ᩷֡;->֫(J[BII)V

    add-int/lit8 v1, v13, 0x6

    .line 117
    aput-byte v9, v7, v1

    add-int/lit8 v13, v13, 0x7

    .line 118
    aput-byte v14, v7, v13

    return-void
.end method

.method public final ۖ()I
    .locals 1

    .line 987
    iget v0, p0, Ll/֨᩷֡;->᩵:I

    return v0
.end method

.method public final ۗ()Z
    .locals 2

    .line 1260
    iget-byte v0, p0, Ll/֨᩷֡;->ܺ:B

    const/16 v1, 0x4c

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 1

    .line 1011
    iget-object v0, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ()Z
    .locals 2

    .line 1251
    iget-byte v0, p0, Ll/֨᩷֡;->ܺ:B

    const/16 v1, 0x4b

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۚ()Ljava/util/List;
    .locals 1

    .line 1100
    iget-object v0, p0, Ll/֨᩷֡;->᩸:Ljava/util/List;

    return-object v0
.end method

.method public final ۛ()Z
    .locals 2

    .line 1355
    iget-byte v0, p0, Ll/֨᩷֡;->ܺ:B

    const/16 v1, 0x78

    if-eq v0, v1, :cond_1

    const/16 v1, 0x58

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۜ()Ll/ۙ۠ᩴ;
    .locals 1

    .line 939
    iget-object v0, p0, Ll/֨᩷֡;->ۘ:Ll/ۙ۠ᩴ;

    return-object v0
.end method

.method public final ۠()Ljava/lang/String;
    .locals 1

    .line 1130
    iget-object v0, p0, Ll/֨᩷֡;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۡ()J
    .locals 2

    .line 978
    iget-wide v0, p0, Ll/֨᩷֡;->᩶:J

    return-wide v0
.end method

.method public final ۢ()J
    .locals 2

    .line 968
    iget-wide v0, p0, Ll/֨᩷֡;->᩷:J

    return-wide v0
.end method

.method public final ۤ()Z
    .locals 1

    .line 1335
    iget-boolean v0, p0, Ll/֨᩷֡;->ۚ:Z

    return v0
.end method

.method public final ۧ()J
    .locals 2

    .line 807
    iget-wide v0, p0, Ll/֨᩷֡;->ܿ:J

    return-wide v0
.end method

.method public final ۧ(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 1915
    iput-wide p1, p0, Ll/֨᩷֡;->ܶ:J

    return-void

    .line 1913
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Size is out of range: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1913
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 1842
    iput-object p1, p0, Ll/֨᩷֡;->ۖ:Ljava/lang/String;

    return-void
.end method

.method public final ۨ()Z
    .locals 1

    .line 1269
    invoke-virtual {p0}, Ll/֨᩷֡;->۫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1345
    iget-boolean v0, p0, Ll/֨᩷֡;->֨:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1375
    :cond_0
    iget-boolean v0, p0, Ll/֨᩷֡;->᩹:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۫()Z
    .locals 2

    .line 1325
    iget-byte v0, p0, Ll/֨᩷֡;->ܺ:B

    const/16 v1, 0x53

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۬()Z
    .locals 2

    .line 1242
    iget-byte v0, p0, Ll/֨᩷֡;->ܺ:B

    const/16 v1, 0x67

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 908
    iget-object v0, p0, Ll/֨᩷֡;->ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܶ()Z
    .locals 1

    .line 1171
    iget-boolean v0, p0, Ll/֨᩷֡;->ᩳ:Z

    return v0
.end method

.method public final ܺ()Ljava/util/Date;
    .locals 4

    .line 997
    iget-object v0, p0, Ll/֨᩷֡;->ۘ:Ll/ۙ۠ᩴ;

    .line 998
    sget v1, Ll/ᩳۢ֡;->֫:I

    if-eqz v0, :cond_0

    .line 220
    new-instance v1, Ljava/util/Date;

    invoke-virtual {v0}, Ll/ۙ۠ᩴ;->toMillis()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 817
    iget v0, p0, Ll/֨᩷֡;->ܳ:I

    return v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 2

    .line 235
    sget-char v0, Ljava/io/File;->separatorChar:C

    const/16 v1, 0x2f

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string v0, "/"

    .line 240
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 241
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 1891
    :cond_0
    iput-object p1, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    return-void
.end method

.method public final ܿ()Ljava/util/Map;
    .locals 1

    .line 872
    iget-object v0, p0, Ll/֨᩷֡;->ۜ:Ljava/util/HashMap;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 827
    iget v0, p0, Ll/֨᩷֡;->᩻:I

    return v0
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 1963
    iput-object p1, p0, Ll/֨᩷֡;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 9

    .line 1022
    iget-object v0, p0, Ll/֨᩷֡;->᩸:Ljava/util/List;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 1025
    :cond_0
    iget-object v0, p0, Ll/֨᩷֡;->᩸:Ljava/util/List;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۙۛܽ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ۙۛܽ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۚ᩷֡;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1026
    invoke-static {v1}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 1027
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    .line 1029
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ᩷֡;

    add-int/lit8 v2, v2, 0x1

    if-ge v2, v1, :cond_2

    .line 1030
    invoke-virtual {v3}, Ll/ۙ᩷֡;->ۧ()J

    move-result-wide v4

    invoke-virtual {v3}, Ll/ۙ᩷֡;->֫()J

    move-result-wide v6

    add-long/2addr v6, v4

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙ᩷֡;

    invoke-virtual {v4}, Ll/ۙ᩷֡;->ۧ()J

    move-result-wide v4

    cmp-long v8, v6, v4

    if-gtz v8, :cond_1

    goto :goto_1

    .line 1031
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Corrupted TAR archive. Sparse blocks for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1011
    iget-object v2, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    const-string v3, " overlap each other."

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1031
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1033
    :cond_2
    :goto_1
    invoke-virtual {v3}, Ll/ۙ᩷֡;->ۧ()J

    move-result-wide v4

    invoke-virtual {v3}, Ll/ۙ᩷֡;->֫()J

    move-result-wide v6

    add-long/2addr v6, v4

    const-wide/16 v3, 0x0

    cmp-long v5, v6, v3

    if-ltz v5, :cond_3

    goto :goto_0

    .line 1035
    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unreadable TAR archive. Offset and numbytes for sparse block in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1011
    iget-object v2, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    const-string v3, " too large."

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1035
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1038
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    add-int/lit8 v1, v1, -0x1

    .line 1039
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ᩷֡;

    .line 1040
    invoke-virtual {v1}, Ll/ۙ᩷֡;->ۧ()J

    move-result-wide v2

    invoke-virtual {v1}, Ll/ۙ᩷֡;->֫()J

    move-result-wide v4

    add-long/2addr v4, v2

    invoke-virtual {p0}, Ll/֨᩷֡;->᩵()J

    move-result-wide v1

    cmp-long v3, v4, v1

    if-gtz v3, :cond_5

    goto :goto_2

    .line 1041
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Corrupted TAR archive. Sparse block extends beyond real size of the entry"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_2
    return-object v0

    .line 1023
    :cond_7
    :goto_3
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public final ᩵()J
    .locals 2

    .line 1073
    invoke-virtual {p0}, Ll/֨᩷֡;->ۨ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1090
    iget-wide v0, p0, Ll/֨᩷֡;->ܶ:J

    return-wide v0

    .line 1076
    :cond_0
    iget-wide v0, p0, Ll/֨᩷֡;->۠:J

    return-wide v0
.end method

.method public final ᩶()Z
    .locals 3

    .line 1229
    iget-byte v0, p0, Ll/֨᩷֡;->ܺ:B

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const/16 v2, 0x30

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v2, 0x35

    if-eq v0, v2, :cond_1

    .line 1011
    iget-object v0, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    const-string v2, "/"

    .line 1232
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 958
    iget-object v0, p0, Ll/֨᩷֡;->ۖ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩸()Z
    .locals 3

    .line 1194
    iget-byte v0, p0, Ll/֨᩷֡;->ܺ:B

    const/16 v1, 0x35

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    return v2

    .line 1197
    :cond_0
    invoke-virtual {p0}, Ll/֨᩷֡;->ۛ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/֨᩷֡;->۬()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1011
    iget-object v0, p0, Ll/֨᩷֡;->֡:Ljava/lang/String;

    const-string v1, "/"

    .line 1197
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩹()Z
    .locals 1

    .line 1206
    iget-boolean v0, p0, Ll/֨᩷֡;->ۡ:Z

    return v0
.end method

.method public final ᩺()Z
    .locals 2

    .line 1395
    iget-byte v0, p0, Ll/֨᩷֡;->ܺ:B

    const/16 v1, 0x32

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Ll/ۙ۠ᩴ;
    .locals 1

    .line 918
    iget-object v0, p0, Ll/֨᩷֡;->֫:Ll/ۙ۠ᩴ;

    return-object v0
.end method
