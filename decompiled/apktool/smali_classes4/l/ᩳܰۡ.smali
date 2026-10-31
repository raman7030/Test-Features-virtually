.class public final Ll/ᩳܰۡ;
.super Ljava/lang/Object;
.source "A5XF"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ܳ֫:Ll/۫᩺ۡ;


# instance fields
.field public ֫֫:Ljava/lang/String;

.field public final ۗ:Z

.field public ۙ:Ll/۠ۖܽ;

.field public ۛ:Ljava/lang/String;

.field public ۟:Z

.field public ۤ:Z

.field public ۧ֫:[B

.field public ۨ:Ljava/util/LinkedHashMap;

.field public ۫:Ljava/util/List;

.field public ۬:Ljava/nio/charset/Charset;

.field public ܰ:Z

.field public final ܽ֫:Z

.field public ܿ֫:Ljava/lang/String;

.field public ᩳ֫:Ljava/util/List;

.field public ᩶:J

.field public ᩸:Ljava/util/List;

.field public ᩹:Z

.field public ᩺:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 416
    new-instance v0, Ll/۫᩺ۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ᩳܰۡ;->ܳ֫:Ll/۫᩺ۡ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 223
    invoke-direct {p0, p1, v0, v1}, Ll/ᩳܰۡ;-><init>(Ljava/lang/String;Ll/ܺܶۡ;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ܺܶۡ;)V
    .locals 1

    const/4 v0, 0x0

    .line 239
    invoke-direct {p0, p1, p2, v0}, Ll/ᩳܰۡ;-><init>(Ljava/lang/String;Ll/ܺܶۡ;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ܺܶۡ;I)V
    .locals 0

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/String;

    .line 247
    invoke-static {p1, p3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    const/4 p3, 0x0

    invoke-direct {p0, p1, p3, p2}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;Ljava/nio/charset/Charset;Ll/۬᩺ۡ;)V

    return-void
.end method

.method public constructor <init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;)V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 262
    invoke-direct/range {v0 .. v7}, Ll/ᩳܰۡ;-><init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;ZZ)V

    return-void
.end method

.method public constructor <init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;ZZ)V
    .locals 2

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ᩳܰۡ;->ۨ:Ljava/util/LinkedHashMap;

    .line 101
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ᩳܰۡ;->᩸:Ljava/util/List;

    .line 102
    iput-object v0, p0, Ll/ᩳܰۡ;->ᩳ֫:Ljava/util/List;

    const-string v0, ""

    .line 106
    iput-object v0, p0, Ll/ᩳܰۡ;->֫֫:Ljava/lang/String;

    const/4 v0, 0x0

    .line 1877
    iput-boolean v0, p0, Ll/ᩳܰۡ;->ۤ:Z

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v1

    .line 1899
    iput-object v1, p0, Ll/ᩳܰۡ;->۫:Ljava/util/List;

    .line 269
    iput-boolean p6, p0, Ll/ᩳܰۡ;->ܽ֫:Z

    .line 270
    iput-boolean p7, p0, Ll/ᩳܰۡ;->ۗ:Z

    .line 271
    iput-object p1, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    .line 272
    iput-object p4, p0, Ll/ᩳܰۡ;->۬:Ljava/nio/charset/Charset;

    .line 273
    invoke-interface {p1}, Ll/۠ۖܽ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܺܰۡ;->֫(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ᩳܰۡ;->᩹:Z

    if-eqz p3, :cond_1

    .line 286
    iget-object p1, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {p1}, Ll/۠ۖܽ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܽܰۡ;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 290
    :cond_0
    iget-object p3, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {p3}, Ll/۠ۖܽ;->ۜ֫()Ll/ۖۖܽ;

    move-result-object p3

    .line 291
    invoke-static {p1}, Ll/ܽܰۡ;->֫(Ll/ܽܰۡ;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p1}, Ll/ܽܰۡ;->ܿ(Ll/ܽܰۡ;)Ll/ۙۖᩴ;

    move-result-object p6

    .line 292
    invoke-virtual {p6}, Ll/ۛܺᩴ;->ܿ()[J

    move-result-object p6

    new-instance p7, Ll/ۤ᩺ۡ;

    invoke-direct {p7, p1}, Ll/ۤ᩺ۡ;-><init>(Ll/ܽܰۡ;)V

    .line 291
    invoke-static {p4, p6, p7}, Ll/᩶ۖܽ;->֫(Ljava/lang/String;[JLl/᩹ۖܽ;)Ll/᩶ۖܽ;

    move-result-object p4

    invoke-static {p1}, Ll/ܽܰۡ;->ۧ(Ll/ܽܰۡ;)I

    move-result p6

    .line 294
    invoke-virtual {p4, p6, p3}, Ll/᩶ۖܽ;->֫(ILl/ۖۖܽ;)V

    .line 291
    invoke-static {p4}, Ll/֡ۖܽ;->֫(Ll/ۖۖܽ;)Ll/᩻ۖܽ;

    move-result-object p3

    iput-object p3, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    .line 295
    invoke-static {p1}, Ll/ܽܰۡ;->ܽ(Ll/ܽܰۡ;)[B

    move-result-object p1

    iput-object p1, p0, Ll/ᩳܰۡ;->ۧ֫:[B

    .line 276
    :goto_0
    invoke-direct {p0, p2, p5, v0}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;Ll/۬᩺ۡ;Z)V

    :cond_1
    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 227
    invoke-direct {p0, p1, v0, v0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;Ljava/nio/charset/Charset;Ll/۬᩺ۡ;)V

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;Ljava/nio/charset/Charset;)V
    .locals 1

    const/4 v0, 0x0

    .line 235
    invoke-direct {p0, p1, p2, v0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;Ljava/nio/charset/Charset;Ll/۬᩺ۡ;)V

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;Ljava/nio/charset/Charset;Ll/۬᩺ۡ;)V
    .locals 7

    const-string v0, "r"

    .line 251
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v2

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v3

    const/4 v4, 0x1

    move-object v1, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Ll/ᩳܰۡ;-><init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;)V

    return-void
.end method

.method private ֫(Ll/ۗ᩺ۡ;ZZ)Ljava/io/InputStream;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move/from16 v9, p3

    if-nez v9, :cond_1

    .line 1660
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    .line 1661
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ܰ()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->֨()I

    move-result v1

    if-eqz v1, :cond_1

    .line 1662
    :cond_0
    new-instance v1, Ll/۟᩺ۡ;

    invoke-direct {v1}, Ljava/io/InputStream;-><init>()V

    return-object v1

    .line 1669
    :cond_1
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v3

    .line 1670
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->֨()I

    move-result v10

    .line 1671
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v1

    const/4 v11, 0x2

    const/16 v12, 0x63

    const/4 v2, 0x1

    const-string v13, ")"

    const-string v14, " ("

    if-eqz v1, :cond_4

    .line 1673
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ۢ()I

    move-result v5

    if-ne v5, v12, :cond_4

    .line 1674
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ܽ()I

    move-result v5

    if-ne v5, v11, :cond_2

    const/4 v2, 0x0

    const/4 v15, 0x0

    goto :goto_1

    :cond_2
    if-ne v5, v2, :cond_3

    goto :goto_0

    .line 1679
    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Unsupported AES version "

    .line 0
    invoke-static {v5, v2, v14}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1679
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_0
    const/4 v2, 0x1

    const/4 v15, 0x1

    :goto_1
    const/16 v16, 0x0

    if-eqz v1, :cond_7

    .line 1686
    new-instance v7, Ll/۫ܰۡ;

    iget-object v2, v0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v5

    move-object v1, v7

    move-object v11, v7

    move/from16 v7, p3

    invoke-direct/range {v1 .. v7}, Ll/۫ܰۡ;-><init>(Ll/۠ۖܽ;JJZ)V

    .line 1687
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ۢ()I

    move-result v1

    if-eqz v1, :cond_6

    if-ne v1, v12, :cond_5

    .line 1692
    new-instance v1, Ll/᩵ܰۡ;

    iget-object v2, v0, Ll/ᩳܰۡ;->֫֫:Ljava/lang/String;

    invoke-direct {v1, v0, v8, v11, v2}, Ll/᩵ܰۡ;-><init>(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ll/۫ܰۡ;Ljava/lang/String;)V

    move-object v3, v1

    move-object v11, v3

    goto :goto_4

    .line 1695
    :cond_5
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported encryption method "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ۢ()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1689
    :cond_6
    new-instance v1, Ll/᩶ܰۡ;

    iget-object v2, v0, Ll/ᩳܰۡ;->֫֫:Ljava/lang/String;

    invoke-direct {v1, v0, v8, v11, v2}, Ll/᩶ܰۡ;-><init>(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ll/۫ܰۡ;Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    if-nez v10, :cond_8

    if-nez v9, :cond_8

    .line 1698
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v1

    goto :goto_2

    :cond_8
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v1

    :goto_2
    move-wide v5, v1

    .line 1699
    new-instance v11, Ll/۫ܰۡ;

    iget-object v2, v0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    move-object v1, v11

    move/from16 v7, p3

    invoke-direct/range {v1 .. v7}, Ll/۫ܰۡ;-><init>(Ll/۠ۖܽ;JJZ)V

    :goto_3
    move-object v3, v1

    move-object/from16 v11, v16

    :goto_4
    if-eqz v10, :cond_12

    const/16 v1, 0xc

    if-eq v10, v1, :cond_11

    const/16 v1, 0xe

    const/16 v2, 0x9

    if-eq v10, v1, :cond_e

    const/16 v1, 0x24

    if-eq v10, v1, :cond_d

    const/16 v1, 0x5d

    if-eq v10, v1, :cond_c

    const/16 v1, 0x5f

    if-eq v10, v1, :cond_b

    const/16 v1, 0x8

    if-eq v10, v1, :cond_a

    if-ne v10, v2, :cond_9

    .line 1716
    new-instance v1, Ll/ܽ۟ۡ;

    invoke-direct {v1, v8, v3}, Ll/ܽ۟ۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;)V

    goto/16 :goto_6

    .line 1727
    :cond_9
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported compression method "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->֨()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1704
    :cond_a
    new-instance v1, Ll/ۧ۟ۡ;

    invoke-direct {v1, v8, v3, v9}, Ll/ۧ۟ۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;Z)V

    goto/16 :goto_6

    .line 1710
    :cond_b
    new-instance v1, Ll/᩵۟ۡ;

    invoke-direct {v1, v8, v3}, Ll/᩵۟ۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;)V

    goto :goto_6

    .line 1722
    :cond_c
    new-instance v1, Ll/֡۟ۡ;

    invoke-direct {v1, v8, v3}, Ll/֡۟ۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;)V

    goto :goto_6

    .line 1719
    :cond_d
    new-instance v1, Ll/ۖ۟ۡ;

    invoke-direct {v1, v8, v3}, Ll/ۖ۟ۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;)V

    goto :goto_6

    .line 1713
    :cond_e
    sget v1, Ll/ᩴ۟ۡ;->᩺:I

    new-array v1, v2, [B

    .line 2064
    invoke-static {v3, v1, v2}, Ll/᩹ۢ֡;->ۧ(Ljava/io/InputStream;[BI)V

    .line 18
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 20
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 21
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    const v4, 0xffff

    and-int/2addr v2, v4

    const/4 v4, 0x5

    if-ne v2, v4, :cond_10

    .line 25
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ܺ()I

    move-result v2

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eqz v2, :cond_f

    const-wide/16 v4, -0x1

    goto :goto_5

    .line 26
    :cond_f
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v4

    .line 27
    :goto_5
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    move-result v6

    .line 28
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v7

    .line 29
    new-instance v12, Ll/ᩴ۟ۡ;

    move-object v1, v12

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v7}, Ll/ᩴ۟ۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;JBI)V

    move-object v3, v12

    goto :goto_7

    .line 23
    :cond_10
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ZipEntry LZMA should have size 5 in header: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1707
    :cond_11
    new-instance v1, Ll/۟ܰۡ;

    invoke-direct {v1, v8, v3}, Ll/۟ܰۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;)V

    :goto_6
    move-object v3, v1

    :cond_12
    :goto_7
    if-eqz p2, :cond_13

    if-eqz v10, :cond_13

    .line 1730
    new-instance v1, Ljava/io/BufferedInputStream;

    const/high16 v2, 0x10000

    invoke-direct {v1, v3, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v3, v1

    :cond_13
    if-eqz v9, :cond_14

    .line 1733
    new-instance v1, Ll/᩺ܰۡ;

    invoke-direct {v1, v8, v3, v11, v15}, Ll/᩺ܰۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;Ll/᩵ܰۡ;Z)V

    return-object v1

    .line 1735
    :cond_14
    iget-boolean v1, v0, Ll/ᩳܰۡ;->᩹:Z

    if-nez v1, :cond_15

    if-eqz v15, :cond_15

    .line 1736
    new-instance v1, Ll/ۛܰۡ;

    invoke-direct {v1, v8, v3}, Ll/ۛܰۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;)V

    return-object v1

    :cond_15
    return-object v3
.end method

.method private ֫(JIJ)Ll/ۧܰۡ;
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v12, p1

    .line 1586
    invoke-direct/range {p0 .. p2}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 1587
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v1

    const v2, 0x6064b50

    if-ne v1, v2, :cond_2

    .line 1602
    iget-boolean v1, v0, Ll/ᩳܰۡ;->ۗ:Z

    const-wide/16 v2, 0xc

    if-eqz v1, :cond_1

    .line 1603
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v4

    const-wide/16 v6, 0x14

    sub-long v6, p4, v6

    const-wide/16 v8, 0x2c

    cmp-long v1, v4, v8

    if-ltz v1, :cond_0

    const-wide v8, 0x7ffffffffffffff3L

    cmp-long v1, v12, v8

    if-gtz v1, :cond_0

    sub-long/2addr v8, v12

    cmp-long v1, v4, v8

    if-gtz v1, :cond_0

    add-long v1, v12, v2

    add-long/2addr v1, v4

    cmp-long v3, v1, v6

    if-nez v3, :cond_0

    const-wide/16 v1, 0x4

    .line 1610
    invoke-direct {v0, v1, v2}, Ll/ᩳܰۡ;->ᩳ(J)V

    goto :goto_0

    .line 1608
    :cond_0
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid zip64 eocd record size: "

    .line 0
    invoke-static {v4, v5, v2}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1608
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1612
    :cond_1
    invoke-direct {v0, v2, v3}, Ll/ᩳܰۡ;->ᩳ(J)V

    .line 1615
    :goto_0
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v2

    .line 1616
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v3

    .line 1617
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v4

    .line 1618
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v8

    .line 1619
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v10

    .line 1620
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v6

    .line 1629
    new-instance v16, Ll/ۧܰۡ;

    const/4 v15, 0x1

    move-object/from16 v1, v16

    move-wide/from16 v12, p1

    move/from16 v14, p3

    invoke-direct/range {v1 .. v15}, Ll/ۧܰۡ;-><init>(IIJJJJJIZ)V

    return-object v16

    .line 1589
    :cond_2
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid zip64 eocd record offset, sig="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1590
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " offset="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܽܰۡ;
    .locals 10

    if-eqz p0, :cond_5

    const-string v0, "(?i)(?s).*\\.zip\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})"

    .line 302
    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 306
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 307
    new-instance v5, Ll/ۙۖᩴ;

    invoke-direct {v5}, Ll/ۙۖᩴ;-><init>()V

    .line 309
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    sub-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    .line 0
    invoke-static {v1, v2, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v6, 0x1

    :goto_0
    const/16 v7, 0x3e7

    if-gt v6, v7, :cond_2

    .line 313
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v1, v9, v2

    aput-object v8, v9, v3

    const-string v8, "%s%03d"

    invoke-static {v7, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 314
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 315
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Ll/ۙۖᩴ;->add(J)Z

    .line 316
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    if-ge v6, v0, :cond_2

    .line 319
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 320
    invoke-virtual {v5}, Ll/ۙۖᩴ;->clear()V

    .line 326
    :cond_2
    invoke-virtual {v5}, Ll/ۙۖᩴ;->size()I

    move-result p0

    if-gt p0, v3, :cond_3

    goto :goto_2

    .line 330
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->trimToSize()V

    .line 331
    invoke-virtual {v5}, Ll/ۙۖᩴ;->᩷()V

    .line 332
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    .line 333
    invoke-virtual {v1, p0}, Ll/ۤۜܽ;->writeInt(I)V

    :goto_1
    if-ge v2, p0, :cond_4

    .line 335
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 336
    invoke-virtual {v5, v2}, Ll/ۙۖᩴ;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v1, v6, v7}, Ll/ۤۜܽ;->ۧ(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 338
    :cond_4
    new-instance p0, Ll/ܽܰۡ;

    add-int/lit8 v3, v0, -0x1

    .line 339
    invoke-virtual {v1}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Ll/ܽܰۡ;-><init>(Ljava/lang/String;ILjava/util/ArrayList;Ll/ۙۖᩴ;[B)V

    return-object p0

    :cond_5
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/nio/charset/Charset;)Ll/ᩳܰۡ;
    .locals 9

    .line 185
    new-instance v8, Ll/ᩳܰۡ;

    const-string v0, "r"

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object v0, v8

    move-object v4, p1

    .line 262
    invoke-direct/range {v0 .. v7}, Ll/ᩳܰۡ;-><init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;ZZ)V

    return-object v8
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Z)Ll/ᩳܰۡ;
    .locals 9

    const-string v0, "r"

    .line 193
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p0

    .line 195
    :try_start_0
    new-instance v0, Ll/ᩳܰۡ;

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    move-object v2, p0

    move v7, p1

    .line 262
    invoke-direct/range {v1 .. v8}, Ll/ᩳܰۡ;-><init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;ZZ)V

    .line 196
    invoke-direct {v0}, Ll/ᩳܰۡ;->ܰ()Ll/ۧܰۡ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 197
    iget v1, p1, Ll/ۧܰۡ;->ᩳ:I

    if-nez v1, :cond_0

    iget v1, p1, Ll/ۧܰۡ;->ܿ:I

    if-nez v1, :cond_0

    iget-wide v1, p1, Ll/ۧܰۡ;->ܳ:J

    iget-wide v3, p1, Ll/ۧܰۡ;->᩻:J

    cmp-long p1, v1, v3

    if-nez p1, :cond_0

    goto :goto_0

    .line 199
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Split ZIP archives are not supported"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 201
    invoke-direct {v0, v1, v1, p1}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;Ll/۬᩺ۡ;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 204
    :goto_1
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 205
    throw p1
.end method

.method public static ֫(Ll/ܶ᩵ܿ;[B)Ll/ᩳܰۡ;
    .locals 12

    if-eqz p1, :cond_2

    .line 118
    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_1

    .line 121
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 122
    new-instance v1, Ll/۬ۜܽ;

    invoke-direct {v1, p1}, Ll/۬ۜܽ;-><init>([B)V

    .line 123
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    .line 124
    new-array v2, p1, [Ll/ܶ᩵ܿ;

    .line 125
    new-array v3, p1, [J

    const/4 v4, 0x0

    :goto_0
    if-ge v4, p1, :cond_1

    .line 127
    invoke-virtual {v1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    aput-object v5, v2, v4

    .line 128
    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v5

    aput-wide v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 130
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ll/ܰ᩺ۡ;

    invoke-direct {p1, v2}, Ll/ܰ᩺ۡ;-><init>(Ljava/lang/Object;)V

    invoke-static {p0, v3, p1}, Ll/᩶ۖܽ;->֫(Ljava/lang/String;[JLl/᩹ۖܽ;)Ll/᩶ۖܽ;

    move-result-object p0

    .line 132
    new-instance p1, Ll/ᩳܰۡ;

    invoke-static {p0}, Ll/֡ۖܽ;->֫(Ll/ۖۖܽ;)Ll/᩻ۖܽ;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ll/ᩳܰۡ;-><init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;)V

    return-object p1

    .line 119
    :cond_2
    :goto_1
    new-instance p1, Ll/ᩳܰۡ;

    const-string v0, "r"

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v7

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, p1

    invoke-direct/range {v6 .. v11}, Ll/ᩳܰۡ;-><init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;)V

    return-object p1
.end method

.method public static ֫(Ll/᩻ۖܽ;Ll/۠ۢ֡;)Ll/ᩳܰۡ;
    .locals 9

    .line 215
    :try_start_0
    new-instance v8, Ll/ᩳܰۡ;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v7}, Ll/ᩳܰۡ;-><init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;ZZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v8

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 217
    :goto_0
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 218
    throw p1
.end method

.method private ֫(Ll/ۗ᩺ۡ;[BIIIJJ[B[B)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    move/from16 v3, p5

    move-object/from16 v4, p11

    .line 1004
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ܺ()I

    move-result v5

    xor-int v6, v5, v1

    and-int/lit16 v6, v6, 0x287f

    if-eqz v6, :cond_0

    const-string v6, "ZIP local file header flags do not match central directory"

    .line 1006
    invoke-direct {v0, v6}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    .line 1008
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->֨()I

    move-result v6

    if-eq v6, v2, :cond_1

    const-string v6, "ZIP local file header method does not match central directory"

    .line 1009
    invoke-direct {v0, v6}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    :cond_1
    and-int/lit16 v6, v5, 0x2000

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_2

    and-int/lit16 v1, v1, 0x2000

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_3

    move-object/from16 v6, p2

    move-object/from16 v9, p10

    .line 1014
    invoke-static {v6, v9}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "ZIP local file header name does not match central directory"

    .line 1015
    invoke-direct {v0, v6}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    :cond_3
    const/4 v6, 0x2

    const-wide/16 v9, 0x0

    const-wide v11, 0xffffffffL

    cmp-long v13, p6, v11

    if-eqz v13, :cond_4

    cmp-long v14, p8, v11

    if-eqz v14, :cond_4

    :try_start_0
    new-array v6, v6, [J

    aput-wide p6, v6, v7

    aput-wide p8, v6, v8

    :goto_1
    const/4 v7, 0x0

    goto :goto_4

    .line 1052
    :cond_4
    invoke-static {v8, v4}, Ll/۠᩺ۡ;->֫(I[B)Ll/۠᩺ۡ;

    move-result-object v14

    if-eqz v14, :cond_e

    cmp-long v15, p8, v11

    if-nez v15, :cond_5

    .line 1058
    invoke-virtual {v14, v7}, Ll/۠᩺ۡ;->֫(I)J

    move-result-wide v11

    const/16 v7, 0x8

    goto :goto_2

    :cond_5
    move-wide/from16 v11, p8

    :goto_2
    const/4 v15, 0x0

    if-nez v13, :cond_6

    .line 1062
    invoke-virtual {v14, v7}, Ll/۠᩺ۡ;->֫(I)J

    move-result-wide v13

    goto :goto_3

    :cond_6
    move-wide/from16 v13, p6

    :goto_3
    cmp-long v7, v13, v9

    if-ltz v7, :cond_d

    cmp-long v7, v11, v9

    if-ltz v7, :cond_d

    new-array v6, v6, [J

    aput-wide v13, v6, v15

    aput-wide v11, v6, v8
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_4
    and-int/lit8 v5, v5, 0x8

    const-string v11, "ZIP local file header CRC or size does not match central directory"

    const-string v12, "ZIP local file header compressed size does not match central directory"

    if-nez v5, :cond_9

    .line 1021
    :try_start_1
    aget-wide v9, v6, v7

    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v13

    cmp-long v5, v9, v13

    if-eqz v5, :cond_7

    .line 1022
    invoke-direct {v0, v12}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    :cond_7
    if-nez v1, :cond_f

    .line 1025
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ۜ()I

    move-result v1

    if-ne v3, v1, :cond_8

    aget-wide v5, v6, v8

    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v7

    cmp-long v1, v5, v7

    if-eqz v1, :cond_f

    .line 1026
    :cond_8
    invoke-direct {v0, v11}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    goto :goto_5

    .line 1030
    :cond_9
    aget-wide v13, v6, v7

    cmp-long v5, v13, v9

    if-eqz v5, :cond_a

    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v15

    cmp-long v5, v13, v15

    if-eqz v5, :cond_a

    .line 1031
    invoke-direct {v0, v12}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    :cond_a
    if-nez v1, :cond_f

    if-eqz v3, :cond_b

    .line 1033
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ۜ()I

    move-result v1

    if-ne v3, v1, :cond_c

    :cond_b
    aget-wide v5, v6, v8

    cmp-long v1, v5, v9

    if-eqz v1, :cond_f

    .line 1034
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v7

    cmp-long v1, v5, v7

    if-eqz v1, :cond_f

    .line 1035
    :cond_c
    invoke-direct {v0, v11}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    goto :goto_5

    .line 1065
    :cond_d
    new-instance v1, Ljava/io/IOException;

    const-string v3, "Unsupported unsigned ZIP64 size"

    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1054
    :cond_e
    new-instance v1, Ljava/io/IOException;

    const-string v3, "Missing ZIP64 local extra data"

    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    const-string v1, "ZIP local file header contains invalid ZIP64 sizes"

    .line 1039
    invoke-direct {v0, v1}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    .line 1042
    :cond_f
    :goto_5
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->֨()I

    move-result v1

    const/16 v3, 0x63

    if-eq v1, v3, :cond_10

    if-ne v2, v3, :cond_14

    .line 1043
    :cond_10
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩺ۡ;->ᩳ()[B

    move-result-object v1

    const v2, 0x9901

    .line 1072
    invoke-static {v2, v1}, Ll/۠᩺ۡ;->֫(I[B)Ll/۠᩺ۡ;

    move-result-object v1

    .line 1073
    invoke-static {v2, v4}, Ll/۠᩺ۡ;->֫(I[B)Ll/۠᩺ۡ;

    move-result-object v2

    if-eqz v1, :cond_13

    if-eqz v2, :cond_13

    .line 1075
    invoke-virtual {v1}, Ll/۠᩺ۡ;->֫()[B

    move-result-object v3

    array-length v3, v3

    const/4 v4, 0x7

    if-lt v3, v4, :cond_13

    invoke-virtual {v2}, Ll/۠᩺ۡ;->֫()[B

    move-result-object v3

    array-length v3, v3

    if-ge v3, v4, :cond_11

    goto :goto_7

    :cond_11
    const/4 v3, 0x0

    :goto_6
    if-ge v3, v4, :cond_14

    .line 1080
    invoke-virtual {v1}, Ll/۠᩺ۡ;->֫()[B

    move-result-object v5

    aget-byte v5, v5, v3

    invoke-virtual {v2}, Ll/۠᩺ۡ;->֫()[B

    move-result-object v6

    aget-byte v6, v6, v3

    if-eq v5, v6, :cond_12

    const-string v1, "ZIP AES extra data does not match between file headers"

    .line 1081
    invoke-direct {v0, v1}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    goto :goto_8

    :cond_12
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_13
    :goto_7
    const-string v1, "ZIP AES extra data is missing from a file header"

    .line 1076
    invoke-direct {v0, v1}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    :cond_14
    :goto_8
    return-void
.end method

.method private ֫(Ll/۬᩺ۡ;Z)V
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 1129
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1130
    sget v3, Ll/ܳ᩷ܽ;->ۡ:I

    new-array v4, v3, [I

    .line 1823
    iget-object v5, v1, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v5}, Ll/۠ۖܽ;->length()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    .line 1133
    invoke-direct {v1, v7, v8}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 1135
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v9

    const v10, 0x4034b50

    if-eq v9, v10, :cond_f

    .line 1136
    iget-object v7, v1, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    const/4 v8, 0x4

    new-array v9, v8, [B

    .line 1267
    fill-array-data v9, :array_0

    .line 1272
    invoke-interface {v7}, Ll/۠ۖܽ;->length()J

    move-result-wide v10

    const-wide/32 v12, 0x3200000

    .line 1273
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    int-to-long v12, v8

    cmp-long v16, v10, v12

    if-gez v16, :cond_0

    move/from16 v19, v3

    move-wide/from16 v20, v5

    goto/16 :goto_9

    :cond_0
    new-array v14, v8, [I

    const/4 v15, 0x1

    const/16 v18, 0x0

    :goto_0
    if-ge v15, v8, :cond_4

    :goto_1
    if-lez v18, :cond_1

    .line 1388
    aget-byte v8, v9, v18

    move/from16 v19, v3

    aget-byte v3, v9, v15

    if-eq v8, v3, :cond_2

    add-int/lit8 v18, v18, -0x1

    .line 1389
    aget v18, v14, v18

    move/from16 v3, v19

    goto :goto_1

    :cond_1
    move/from16 v19, v3

    .line 1392
    :cond_2
    aget-byte v3, v9, v18

    aget-byte v8, v9, v15

    if-ne v3, v8, :cond_3

    add-int/lit8 v18, v18, 0x1

    .line 1396
    :cond_3
    aput v18, v14, v15

    add-int/lit8 v15, v15, 0x1

    const/4 v8, 0x4

    move/from16 v3, v19

    goto :goto_0

    :cond_4
    move/from16 v19, v3

    const/high16 v3, 0x10000

    new-array v3, v3, [B

    move-wide/from16 v20, v5

    const-wide/16 v5, 0x0

    .line 1286
    invoke-interface {v7, v5, v6}, Ll/۠ۖܽ;->seek(J)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v22, 0x0

    const/4 v8, 0x0

    :goto_2
    cmp-long v15, v22, v10

    if-gez v15, :cond_e

    if-lt v5, v6, :cond_6

    sub-long v5, v10, v22

    const/high16 v15, 0x10000

    move-wide/from16 v24, v10

    int-to-long v10, v15

    .line 1297
    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v6, v5

    const/4 v5, 0x0

    .line 1299
    invoke-interface {v7, v5, v6, v3}, Ll/۠ۖܽ;->ۧ(II[B)I

    move-result v5

    if-nez v5, :cond_5

    goto/16 :goto_9

    :cond_5
    const/4 v6, 0x0

    move v6, v5

    const/4 v5, 0x0

    goto :goto_3

    :cond_6
    move-wide/from16 v24, v10

    .line 1306
    :goto_3
    aget-byte v10, v3, v5

    add-int/lit8 v11, v5, 0x1

    .line 1310
    aget-byte v15, v9, v8

    const-wide/16 v26, 0x1

    if-ne v10, v15, :cond_c

    add-int/lit8 v8, v8, 0x1

    const/4 v5, 0x4

    if-ne v8, v5, :cond_b

    sub-long v28, v22, v12

    add-long v30, v28, v26

    move v10, v6

    .line 1342
    invoke-interface {v7}, Ll/۠ۖܽ;->getFilePointer()J

    move-result-wide v5

    const-wide/16 v32, 0x5

    move-object v15, v9

    add-long v8, v28, v32

    .line 1344
    :try_start_0
    invoke-interface {v7, v8, v9}, Ll/۠ۖܽ;->seek(J)V

    .line 1345
    invoke-interface {v7}, Ll/۠ۖܽ;->ۛۧ()I

    move-result v8

    const/16 v9, 0x2d

    if-eq v8, v9, :cond_7

    const/16 v9, 0x14

    if-eq v8, v9, :cond_7

    const/16 v9, 0xa

    if-eq v8, v9, :cond_7

    :goto_4
    move-object/from16 v18, v3

    goto :goto_5

    .line 1349
    :cond_7
    invoke-interface {v7}, Ll/۠ۖܽ;->ۛۧ()I

    .line 1350
    invoke-interface {v7}, Ll/۠ۖܽ;->ۛۧ()I

    move-result v8

    if-eqz v8, :cond_8

    const/16 v9, 0x8

    if-eq v8, v9, :cond_8

    const/16 v9, 0x9

    if-eq v8, v9, :cond_8

    const/16 v9, 0xc

    if-eq v8, v9, :cond_8

    const/16 v9, 0xe

    if-eq v8, v9, :cond_8

    const/16 v9, 0x5f

    if-eq v8, v9, :cond_8

    goto :goto_4

    .line 1359
    :cond_8
    invoke-interface {v7}, Ll/۠ۖܽ;->readInt()I

    .line 1360
    invoke-interface {v7}, Ll/۠ۖܽ;->readInt()I

    .line 1361
    invoke-interface {v7}, Ll/۠ۖܽ;->readInt()I

    move-result v8

    int-to-long v8, v8

    const-wide v28, 0xffffffffL

    and-long v8, v8, v28

    .line 1362
    invoke-interface {v7}, Ll/۠ۖܽ;->readInt()I

    move-object/from16 v18, v3

    .line 1363
    invoke-interface {v7}, Ll/۠ۖܽ;->ۛۧ()I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_9

    .line 1373
    :goto_5
    invoke-interface {v7, v5, v6}, Ll/۠ۖܽ;->seek(J)V

    move/from16 v28, v10

    move-wide/from16 v34, v12

    move v13, v11

    goto :goto_6

    :cond_9
    move/from16 v28, v10

    .line 1367
    :try_start_1
    invoke-interface {v7}, Ll/۠ۖܽ;->ۛۧ()I

    move-result v10

    .line 1368
    invoke-interface {v7}, Ll/۠ۖܽ;->getFilePointer()J

    move-result-wide v32

    move-wide/from16 v34, v12

    move v13, v11

    int-to-long v11, v3

    add-long v32, v32, v11

    int-to-long v10, v10

    add-long v32, v32, v10

    add-long v32, v32, v8

    invoke-interface {v7}, Ll/۠ۖܽ;->length()J

    move-result-wide v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v3, v32, v8

    if-lez v3, :cond_a

    .line 1373
    invoke-interface {v7, v5, v6}, Ll/۠ۖܽ;->seek(J)V

    :goto_6
    const/4 v8, 0x0

    goto :goto_7

    :cond_a
    invoke-interface {v7, v5, v6}, Ll/۠ۖܽ;->seek(J)V

    move-wide/from16 v5, v30

    goto :goto_a

    :catchall_0
    move-exception v0

    invoke-interface {v7, v5, v6}, Ll/۠ۖܽ;->seek(J)V

    .line 1374
    throw v0

    :cond_b
    move-object/from16 v18, v3

    move/from16 v28, v6

    move-object v15, v9

    move-wide/from16 v34, v12

    move v13, v11

    goto :goto_7

    :cond_c
    move-object/from16 v18, v3

    move/from16 v28, v6

    move-object v15, v9

    move-wide/from16 v34, v12

    move v13, v11

    if-lez v8, :cond_d

    add-int/lit8 v8, v8, -0x1

    .line 1326
    aget v3, v14, v8

    move v8, v3

    goto :goto_8

    :cond_d
    :goto_7
    add-long v22, v22, v26

    move v5, v13

    :goto_8
    move-object v9, v15

    move-object/from16 v3, v18

    move-wide/from16 v10, v24

    move/from16 v6, v28

    move-wide/from16 v12, v34

    goto/16 :goto_2

    :cond_e
    :goto_9
    const-wide/16 v5, -0x1

    :goto_a
    const-wide/16 v7, -0x1

    cmp-long v3, v5, v7

    if-eqz v3, :cond_10

    .line 1138
    invoke-direct {v1, v5, v6}, Ll/ᩳܰۡ;->ۧ(J)V

    goto :goto_b

    :cond_f
    move/from16 v19, v3

    move-wide/from16 v20, v5

    .line 1141
    invoke-direct {v1, v7, v8}, Ll/ᩳܰۡ;->ۧ(J)V

    :cond_10
    :goto_b
    const v3, 0xc350

    .line 1145
    :cond_11
    :goto_c
    iget-object v5, v1, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v5}, Ll/۠ۖܽ;->available()I

    move-result v5

    const/16 v6, 0x1e

    iget-object v7, v1, Ll/ᩳܰۡ;->۬:Ljava/nio/charset/Charset;

    if-le v5, v6, :cond_1b

    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v5

    const v6, 0x4034b50

    if-ne v5, v6, :cond_1b

    .line 1146
    new-instance v5, Ll/ۗ᩺ۡ;

    invoke-direct {v5}, Ll/ۗ᩺ۡ;-><init>()V

    .line 1147
    iget-object v6, v1, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v6}, Ll/۠ۖܽ;->getFilePointer()J

    move-result-wide v8

    const-wide/16 v10, 0x4

    sub-long/2addr v8, v10

    invoke-virtual {v5, v8, v9}, Ll/ۗ᩺ۡ;->ܽ(J)V

    .line 1149
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    .line 1151
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v6

    invoke-virtual {v5, v6}, Ll/ۗ᩺ۡ;->ܿ(I)V

    .line 1152
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v6

    invoke-virtual {v5, v6}, Ll/ۗ᩺ۡ;->᩻(I)V

    .line 1153
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v8

    invoke-static {v8, v9}, Ll/ۖܰۡ;->֫(J)J

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 1154
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v6

    invoke-virtual {v5, v6}, Ll/ۗ᩺ۡ;->֫(I)V

    .line 1156
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Ll/ۗ᩺ۡ;->֫(J)V

    .line 1157
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Ll/ۗ᩺ۡ;->ᩳ(J)V

    .line 1159
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v6

    .line 1160
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v8

    .line 1162
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->ۤ()Z

    move-result v9

    .line 1164
    invoke-direct {v1, v6}, Ll/ᩳܰۡ;->֫(I)[B

    move-result-object v6

    if-eqz v0, :cond_12

    .line 1165
    invoke-interface {v0, v6}, Ll/۬᩺ۡ;->֫([B)Z

    move-result v12

    if-nez v12, :cond_12

    const/4 v12, 0x1

    goto :goto_d

    :cond_12
    const/4 v12, 0x0

    :goto_d
    if-nez v12, :cond_13

    if-nez v9, :cond_13

    if-lez v3, :cond_13

    if-nez v7, :cond_13

    .line 1167
    invoke-static {v6, v4}, Ll/ᩳܰۡ;->֫([B[I)V

    add-int/lit8 v3, v3, -0x1

    .line 1170
    :cond_13
    invoke-virtual {v5, v6}, Ll/ۗ᩺ۡ;->ᩳ([B)V

    if-lez v8, :cond_15

    .line 1174
    invoke-direct {v1, v8}, Ll/ᩳܰۡ;->֫(I)[B

    move-result-object v6

    .line 1175
    invoke-virtual {v5, v6}, Ll/ۗ᩺ۡ;->ܿ([B)Z

    move-result v8

    if-eqz v8, :cond_14

    const/4 v9, 0x1

    .line 1177
    invoke-static {v9, v6}, Ll/۠᩺ۡ;->ۧ(I[B)[B

    move-result-object v6

    .line 1179
    :cond_14
    invoke-virtual {v5, v6}, Ll/ۗ᩺ۡ;->ܽ([B)V

    goto :goto_e

    :cond_15
    const/4 v8, 0x0

    .line 1181
    :goto_e
    iget-object v6, v1, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v6}, Ll/۠ۖܽ;->getFilePointer()J

    move-result-wide v13

    invoke-virtual {v5, v13, v14}, Ll/ۗ᩺ۡ;->ۧ(J)V

    .line 1182
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->ܺ()I

    move-result v6

    const/16 v9, 0x8

    and-int/2addr v6, v9

    if-ne v6, v9, :cond_19

    const/4 v6, 0x0

    .line 1186
    :goto_f
    iget-object v13, v1, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v13}, Ll/۠ۖܽ;->read()I

    move-result v13

    const/4 v14, -0x1

    if-eq v13, v14, :cond_1b

    ushr-int/2addr v6, v9

    shl-int/lit8 v13, v13, 0x18

    or-int/2addr v6, v13

    const v13, 0x8074b50

    if-eq v6, v13, :cond_16

    move v15, v12

    goto :goto_11

    .line 1191
    :cond_16
    iget-object v13, v1, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v13}, Ll/۠ۖܽ;->getFilePointer()J

    move-result-wide v13

    .line 1192
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v15

    sub-long/2addr v13, v15

    sub-long/2addr v13, v10

    .line 1193
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v10

    if-eqz v8, :cond_17

    .line 1196
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v15

    .line 1197
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v17

    goto :goto_10

    .line 1199
    :cond_17
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v15

    .line 1200
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v17

    :goto_10
    move/from16 v22, v10

    move-wide v9, v15

    move v15, v12

    move-wide/from16 v11, v17

    cmp-long v17, v9, v13

    if-nez v17, :cond_18

    move/from16 v13, v22

    .line 1204
    invoke-virtual {v5, v13}, Ll/ۗ᩺ۡ;->֫(I)V

    .line 1205
    invoke-virtual {v5, v9, v10}, Ll/ۗ᩺ۡ;->֫(J)V

    .line 1206
    invoke-virtual {v5, v11, v12}, Ll/ۗ᩺ۡ;->ᩳ(J)V

    goto :goto_12

    :cond_18
    :goto_11
    const-wide/16 v10, 0x4

    move v12, v15

    const/16 v9, 0x8

    goto :goto_f

    :cond_19
    move v15, v12

    .line 1214
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v8

    sub-long v8, v20, v8

    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v10

    cmp-long v6, v8, v10

    if-gez v6, :cond_1a

    goto :goto_13

    .line 1217
    :cond_1a
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v6

    invoke-direct {v1, v6, v7}, Ll/ᩳܰۡ;->ᩳ(J)V

    :goto_12
    if-nez v15, :cond_11

    .line 1220
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_c

    .line 1223
    :cond_1b
    :goto_13
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1d

    if-eqz p2, :cond_1c

    goto/16 :goto_18

    .line 1228
    :cond_1c
    new-instance v0, Ljava/util/zip/ZipException;

    const-string v2, "Archive is not a ZIP archive"

    invoke-direct {v0, v2}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1230
    :cond_1d
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    if-nez v7, :cond_20

    .line 1232
    sget v3, Ll/ܳ᩷ܽ;->᩵:I

    const/4 v5, 0x0

    move/from16 v6, v19

    :goto_14
    if-ge v5, v6, :cond_1f

    if-eq v5, v3, :cond_1e

    .line 1234
    aget v7, v4, v5

    aget v8, v4, v3

    if-le v7, v8, :cond_1e

    move v3, v5

    :cond_1e
    add-int/lit8 v5, v5, 0x1

    goto :goto_14

    .line 1238
    :cond_1f
    invoke-static {v3}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v7

    .line 1242
    :cond_20
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_21
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_23

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗ᩺ۡ;

    .line 1243
    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_22

    .line 1244
    iget-boolean v5, v1, Ll/ᩳܰۡ;->᩹:Z

    const/4 v6, 0x0

    invoke-virtual {v4, v0, v6, v5}, Ll/ۗ᩺ۡ;->֫(Ljava/nio/charset/Charset;ZZ)V

    goto :goto_16

    .line 1246
    :cond_22
    iget-boolean v5, v1, Ll/ᩳܰۡ;->᩹:Z

    const/4 v6, 0x1

    invoke-virtual {v4, v7, v6, v5}, Ll/ۗ᩺ۡ;->֫(Ljava/nio/charset/Charset;ZZ)V

    :goto_16
    const/4 v5, 0x1

    .line 1248
    iget-boolean v6, v1, Ll/ᩳܰۡ;->᩹:Z

    if-nez v6, :cond_21

    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v6, "AndroidManifest.xml"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_21

    iget-object v4, v1, Ll/ᩳܰۡ;->ۧ֫:[B

    if-nez v4, :cond_21

    .line 1249
    iput-boolean v5, v1, Ll/ᩳܰۡ;->᩹:Z

    goto :goto_15

    .line 1252
    :cond_23
    iget-object v0, v1, Ll/ᩳܰۡ;->ۨ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 1253
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_24

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗ᩺ۡ;

    .line 1254
    invoke-direct {v1, v4}, Ll/ᩳܰۡ;->᩻(Ll/ۗ᩺ۡ;)V

    .line 1255
    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_17

    .line 1257
    :cond_24
    iget-boolean v0, v1, Ll/ᩳܰۡ;->ܽ֫:Z

    if-eqz v0, :cond_25

    .line 1258
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Ll/ᩳܰۡ;->᩸:Ljava/util/List;

    :cond_25
    :goto_18
    return-void

    nop

    :array_0
    .array-data 1
        0x50t
        0x4bt
        0x3t
        0x4t
    .end array-data
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ll/۬᩺ۡ;Z)V
    .locals 58

    move-object/from16 v13, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 488
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ܰ()Ll/ۧܰۡ;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    if-eqz v0, :cond_1

    .line 490
    iget-object v4, v13, Ll/ᩳܰۡ;->ۧ֫:[B

    if-nez v4, :cond_1

    iget-object v4, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    .line 491
    invoke-interface {v4}, Ll/۠ۖܽ;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "(?i)(?s).*\\.z(?:0[1-9]|[1-9][0-9]+)"

    invoke-virtual {v4, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 492
    iget-object v4, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v4}, Ll/۠ۖܽ;->getName()Ljava/lang/String;

    move-result-object v4

    .line 493
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x3

    invoke-virtual {v4, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "zip"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 494
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 495
    iget-object v5, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    :try_start_0
    const-string v6, "r"

    .line 497
    invoke-virtual {v4, v6}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v4

    iput-object v4, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    .line 498
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ܰ()Ll/ۧܰۡ;

    move-result-object v2

    if-nez v2, :cond_0

    .line 500
    iget-object v4, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    .line 524
    invoke-static {v4}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    .line 501
    iput-object v5, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    .line 524
    invoke-static {v5}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 507
    :catch_0
    iget-object v4, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    if-eq v4, v5, :cond_1

    .line 524
    invoke-static {v4}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    .line 509
    iput-object v5, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    .line 515
    :cond_1
    :goto_0
    iget-boolean v14, v13, Ll/ᩳܰۡ;->ۗ:Z

    if-nez v2, :cond_4

    if-eqz p3, :cond_2

    :goto_1
    move-object v10, v13

    goto/16 :goto_3d

    :cond_2
    const-string v0, "ZIP end of central directory is missing or unreadable"

    if-nez v14, :cond_3

    .line 522
    invoke-direct {v13, v0}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    .line 523
    invoke-direct {v13, v1, v3}, Ll/ᩳܰۡ;->֫(Ll/۬᩺ۡ;Z)V

    return-void

    .line 520
    :cond_3
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 515
    :cond_4
    iget-boolean v3, v2, Ll/ۧܰۡ;->ۜ:Z

    iget-wide v4, v2, Ll/ۧܰۡ;->ܽ:J

    iget v6, v2, Ll/ۧܰۡ;->ܿ:I

    iget v7, v2, Ll/ۧܰۡ;->ᩳ:I

    iget-wide v8, v2, Ll/ۧܰۡ;->ۧ:J

    iget-wide v10, v2, Ll/ۧܰۡ;->֫:J

    move-wide v15, v8

    iget-wide v8, v2, Ll/ۧܰۡ;->᩻:J

    if-eqz v14, :cond_6

    if-nez v7, :cond_5

    if-nez v6, :cond_5

    .line 527
    iget-wide v1, v2, Ll/ۧܰۡ;->ܳ:J

    cmp-long v12, v1, v8

    if-nez v12, :cond_5

    goto :goto_2

    .line 530
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Split ZIP archives are not supported"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_2
    if-eqz v0, :cond_7

    if-lez v7, :cond_7

    .line 533
    iget-object v1, v13, Ll/ᩳܰۡ;->ۧ֫:[B

    if-nez v1, :cond_7

    iget-object v1, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    .line 536
    invoke-interface {v1}, Ll/۠ۖܽ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, ".zip"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    const/16 v17, 0x1

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    const/16 v17, 0x0

    :goto_3
    if-eqz p3, :cond_8

    if-nez v17, :cond_8

    goto :goto_1

    :cond_8
    if-nez v14, :cond_9

    if-nez v17, :cond_9

    const-wide/16 v1, 0x20

    cmp-long v12, v10, v1

    if-ltz v12, :cond_9

    const-wide/16 v1, 0x10

    sub-long v1, v10, v1

    .line 543
    invoke-direct {v13, v1, v2}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 1827
    iget-object v1, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v1}, Ll/۠ۖܽ;->available()I

    move-result v1

    const/16 v2, 0x10

    if-lt v1, v2, :cond_9

    .line 544
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v1

    const-wide v18, 0x20676953204b5041L

    cmp-long v12, v1, v18

    if-nez v12, :cond_9

    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v1

    const-wide v18, 0x3234206b636f6c42L    # 7.465385175170059E-67

    cmp-long v12, v1, v18

    if-nez v12, :cond_9

    const-wide/16 v1, 0x18

    sub-long v1, v10, v1

    .line 545
    invoke-direct {v13, v1, v2}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 546
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v1

    sub-long v18, v10, v1

    const-wide/16 v20, 0x8

    move-wide/from16 v22, v8

    sub-long v8, v18, v20

    .line 548
    invoke-direct {v13, v8, v9}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 549
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v18

    cmp-long v12, v18, v1

    if-nez v12, :cond_a

    const/4 v1, 0x1

    .line 550
    iput-boolean v1, v13, Ll/ᩳܰۡ;->᩺:Z

    .line 551
    iput-wide v8, v13, Ll/ᩳܰۡ;->᩶:J

    goto :goto_4

    :cond_9
    move-wide/from16 v22, v8

    :cond_a
    :goto_4
    const-wide v18, 0x7fffffffffffffffL

    const-wide v20, 0xffffffffL

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    if-eqz v17, :cond_10

    .line 563
    iget-object v1, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v1}, Ll/۠ۖܽ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۖۢ֡;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v7, 0x1

    .line 564
    new-array v9, v2, [Ll/ܶ᩵ܿ;

    .line 565
    new-array v12, v2, [J

    const/16 v27, 0x0

    const/4 v8, 0x0

    :goto_5
    if-ge v8, v7, :cond_d

    move/from16 v27, v3

    .line 567
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    add-int/lit8 v29, v8, 0x1

    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v30

    move-wide/from16 v31, v15

    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v1, v15, v16

    const/16 v16, 0x1

    aput-object v30, v15, v16

    move/from16 v16, v14

    const-string v14, "%s.z%02d"

    invoke-static {v3, v14, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v14}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v14

    .line 568
    invoke-virtual {v14}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v15

    if-eqz v15, :cond_b

    .line 569
    aput-object v14, v9, v8

    .line 570
    invoke-virtual {v14}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v14

    aput-wide v14, v12, v8

    move-wide/from16 v33, v4

    const/4 v5, 0x0

    goto :goto_6

    .line 573
    :cond_b
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move-wide/from16 v33, v4

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/16 v28, 0x1

    aput-object v15, v4, v28

    const-string v15, "%s.Z%02d"

    invoke-static {v3, v15, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 574
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 575
    aput-object v3, v9, v8

    .line 576
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    aput-wide v3, v12, v8

    :goto_6
    move/from16 v14, v16

    move/from16 v3, v27

    move/from16 v8, v29

    move-wide/from16 v15, v31

    move-wide/from16 v4, v33

    goto :goto_5

    .line 579
    :cond_c
    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-virtual {v14}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    move/from16 v27, v3

    move-wide/from16 v33, v4

    move-wide/from16 v31, v15

    move/from16 v16, v14

    .line 581
    iget-object v1, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v1}, Ll/۠ۖܽ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    aput-object v0, v9, v7

    .line 582
    iget-object v0, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->length()J

    move-result-wide v0

    aput-wide v0, v12, v7

    .line 0
    invoke-static {v2}, Ll/ᩴۘܿ;->֫(I)Ll/ۤۜܽ;

    move-result-object v0

    const/4 v1, 0x0

    :goto_7
    if-gt v1, v7, :cond_e

    .line 587
    aget-object v2, v9, v1

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 588
    aget-wide v2, v12, v1

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 590
    :cond_e
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v0

    iput-object v0, v13, Ll/ᩳܰۡ;->ۧ֫:[B

    if-eqz p3, :cond_f

    goto/16 :goto_1

    .line 594
    :cond_f
    iget-object v0, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->ۜ֫()Ll/ۖۖܽ;

    move-result-object v0

    .line 595
    invoke-interface {v0}, Ll/ۖۖܽ;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll/ۛ᩺ۡ;

    invoke-direct {v2, v9}, Ll/ۛ᩺ۡ;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v12, v2}, Ll/᩶ۖܽ;->֫(Ljava/lang/String;[JLl/᩹ۖܽ;)Ll/᩶ۖܽ;

    move-result-object v1

    .line 597
    invoke-virtual {v1, v7, v0}, Ll/᩶ۖܽ;->֫(ILl/ۖۖܽ;)V

    .line 595
    invoke-static {v1}, Ll/֡ۖܽ;->֫(Ll/ۖۖܽ;)Ll/᩻ۖܽ;

    move-result-object v0

    iput-object v0, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    .line 598
    invoke-virtual {v1, v6}, Ll/᩶ۖܽ;->ۧ(I)J

    move-result-wide v2

    add-long/2addr v2, v10

    .line 600
    invoke-virtual {v1, v7}, Ll/᩶ۖܽ;->ۧ(I)J

    move-result-wide v4

    add-long v4, v4, v33

    .line 602
    invoke-direct {v13, v2, v3}, Ll/ᩳܰۡ;->ۧ(J)V

    move-object v14, v1

    move-wide v10, v2

    move-wide/from16 v1, v25

    goto/16 :goto_b

    :cond_10
    move/from16 v27, v3

    move-wide/from16 v33, v4

    move-wide/from16 v31, v15

    move/from16 v16, v14

    if-nez v16, :cond_17

    cmp-long v0, v22, v25

    if-ltz v0, :cond_16

    cmp-long v1, v31, v25

    if-ltz v1, :cond_16

    cmp-long v2, v33, v10

    if-ltz v2, :cond_16

    sub-long v4, v33, v10

    cmp-long v2, v4, v31

    if-eqz v2, :cond_16

    cmp-long v2, v31, v33

    if-lez v2, :cond_11

    goto :goto_8

    :cond_11
    sub-long v4, v33, v31

    cmp-long v2, v4, v10

    if-gtz v2, :cond_12

    goto :goto_8

    :cond_12
    if-nez v0, :cond_13

    if-nez v1, :cond_16

    goto :goto_9

    .line 932
    :cond_13
    invoke-direct {v13, v4, v5}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 1827
    iget-object v0, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->available()I

    move-result v0

    const/16 v1, 0x2e

    if-lt v0, v1, :cond_16

    .line 933
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v0

    const v1, 0x2014b50

    if-eq v0, v1, :cond_14

    goto :goto_8

    :cond_14
    const-wide/16 v0, 0x2a

    add-long/2addr v0, v4

    .line 936
    invoke-direct {v13, v0, v1}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 937
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v0

    sub-long v2, v4, v10

    cmp-long v6, v0, v20

    if-eqz v6, :cond_16

    sub-long v6, v18, v2

    cmp-long v8, v0, v6

    if-lez v8, :cond_15

    goto :goto_8

    :cond_15
    add-long/2addr v0, v2

    .line 943
    invoke-direct {v13, v0, v1}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 1827
    iget-object v0, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->available()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_16

    .line 944
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v0

    const v1, 0x4034b50

    if-ne v0, v1, :cond_16

    goto :goto_9

    :cond_16
    :goto_8
    move-wide v4, v10

    :goto_9
    sub-long v0, v4, v10

    move-wide v10, v4

    goto :goto_a

    :cond_17
    move-wide/from16 v0, v25

    .line 612
    :goto_a
    invoke-direct {v13, v10, v11}, Ll/ᩳܰۡ;->ۧ(J)V

    move-wide v1, v0

    move-object/from16 v14, v24

    move-wide/from16 v4, v33

    :goto_b
    const-string v3, "ZIP central directory size does not match EOCD"

    .line 616
    iget-boolean v15, v13, Ll/ᩳܰۡ;->ܽ֫:Z

    if-nez v15, :cond_18

    if-eqz v16, :cond_1a

    :cond_18
    cmp-long v0, v22, v25

    if-ltz v0, :cond_19

    cmp-long v0, v31, v25

    if-ltz v0, :cond_19

    cmp-long v0, v4, v10

    if-ltz v0, :cond_19

    sub-long/2addr v4, v10

    cmp-long v0, v4, v31

    if-eqz v0, :cond_1a

    .line 951
    :cond_19
    invoke-direct {v13, v3}, Ll/ᩳܰۡ;->ᩳ(Ljava/lang/String;)V

    :cond_1a
    if-eqz v16, :cond_1b

    cmp-long v0, v22, v25

    if-nez v0, :cond_1b

    cmp-long v0, v31, v25

    if-nez v0, :cond_1b

    move/from16 v0, v27

    .line 622
    iput-boolean v0, v13, Ll/ᩳܰۡ;->۟:Z

    return-void

    :cond_1b
    move/from16 v0, v27

    .line 1827
    iget-object v4, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v4}, Ll/۠ۖܽ;->available()I

    move-result v4

    const/16 v5, 0x32

    const-string v6, "ZIP central directory entry count does not match EOCD"

    if-le v4, v5, :cond_66

    .line 626
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v4

    const v5, 0x2014b50

    if-eq v4, v5, :cond_1c

    goto/16 :goto_3c

    .line 639
    :cond_1c
    iput-boolean v0, v13, Ll/ᩳܰۡ;->۟:Z

    .line 641
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    if-nez v15, :cond_1e

    if-eqz v16, :cond_1d

    goto :goto_c

    :cond_1d
    move-object/from16 v9, v24

    goto :goto_d

    .line 643
    :cond_1e
    :goto_c
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    move-object v9, v0

    :goto_d
    if-eqz v15, :cond_1f

    .line 645
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    move-object v7, v0

    goto :goto_e

    :cond_1f
    move-object/from16 v7, v24

    :goto_e
    if-eqz v15, :cond_20

    .line 646
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v8, v0

    goto :goto_f

    :cond_20
    move-object/from16 v8, v24

    .line 647
    :goto_f
    sget v4, Ll/ܳ᩷ܽ;->ۡ:I

    new-array v5, v4, [I

    const v0, 0xc350

    move-object/from16 p1, v8

    move-wide/from16 v27, v25

    move-wide/from16 v29, v27

    .line 651
    :goto_10
    new-instance v8, Ll/ۗ᩺ۡ;

    invoke-direct {v8}, Ll/ۗ᩺ۡ;-><init>()V

    .line 652
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v33

    shr-int/lit8 v33, v33, 0x8

    move/from16 p3, v4

    and-int/lit8 v4, v33, 0xf

    .line 653
    invoke-virtual {v8, v4}, Ll/ۗ᩺ۡ;->᩷(I)V

    .line 655
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    .line 657
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v4

    invoke-virtual {v8, v4}, Ll/ۗ᩺ۡ;->ܿ(I)V

    .line 658
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v4

    invoke-virtual {v8, v4}, Ll/ۗ᩺ۡ;->᩻(I)V

    .line 659
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v33

    move-object/from16 v35, v3

    invoke-static/range {v33 .. v34}, Ll/ۖܰۡ;->֫(J)J

    move-result-wide v3

    invoke-virtual {v8, v3, v4}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 660
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v3

    invoke-virtual {v8, v3}, Ll/ۗ᩺ۡ;->֫(I)V

    .line 662
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v3

    invoke-virtual {v8, v3, v4}, Ll/ۗ᩺ۡ;->֫(J)V

    .line 663
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v3

    invoke-virtual {v8, v3, v4}, Ll/ۗ᩺ۡ;->ᩳ(J)V

    .line 665
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v3

    .line 666
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v4

    move-wide/from16 v33, v10

    .line 667
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v10

    .line 669
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v11

    move-object/from16 v36, v6

    .line 671
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v6

    invoke-virtual {v8, v6}, Ll/ۗ᩺ۡ;->ܳ(I)V

    .line 672
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v6

    invoke-virtual {v8, v6}, Ll/ۗ᩺ۡ;->ᩳ(I)V

    if-eqz v17, :cond_21

    .line 675
    invoke-virtual {v14, v11}, Ll/᩶ۖܽ;->ۧ(I)J

    move-result-wide v37

    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v39

    move-object/from16 v41, v12

    add-long v11, v37, v39

    invoke-virtual {v8, v11, v12}, Ll/ۗ᩺ۡ;->ܽ(J)V

    goto :goto_11

    :cond_21
    move-object/from16 v41, v12

    .line 677
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v11

    invoke-virtual {v8, v11, v12}, Ll/ۗ᩺ۡ;->ܽ(J)V

    .line 680
    :goto_11
    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->ۤ()Z

    move-result v6

    .line 682
    invoke-direct {v13, v3}, Ll/ᩳܰۡ;->֫(I)[B

    move-result-object v3

    .line 683
    iget-object v11, v13, Ll/ᩳܰۡ;->۬:Ljava/nio/charset/Charset;

    move-object/from16 v12, p2

    if-eqz v12, :cond_23

    invoke-interface {v12, v3}, Ll/۬᩺ۡ;->֫([B)Z

    move-result v37

    if-eqz v37, :cond_22

    goto :goto_12

    :cond_22
    add-int/2addr v4, v10

    int-to-long v3, v4

    .line 685
    invoke-direct {v13, v3, v4}, Ll/ᩳܰۡ;->ᩳ(J)V

    move-object/from16 v10, v41

    goto/16 :goto_16

    :cond_23
    :goto_12
    if-nez v6, :cond_24

    if-lez v0, :cond_24

    if-nez v11, :cond_24

    .line 688
    invoke-static {v3, v5}, Ll/ᩳܰۡ;->֫([B[I)V

    add-int/lit8 v0, v0, -0x1

    :cond_24
    move/from16 v37, v0

    .line 691
    invoke-virtual {v8, v3}, Ll/ۗ᩺ۡ;->ᩳ([B)V

    if-nez v15, :cond_25

    if-eqz v16, :cond_26

    .line 693
    :cond_25
    invoke-interface {v9, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_26
    if-lez v4, :cond_28

    .line 697
    invoke-direct {v13, v4}, Ll/ᩳܰۡ;->֫(I)[B

    move-result-object v0

    .line 698
    invoke-virtual {v8, v0}, Ll/ۗ᩺ۡ;->ܿ([B)Z

    move-result v3

    if-eqz v3, :cond_27

    const/4 v3, 0x1

    .line 700
    invoke-static {v3, v0}, Ll/۠᩺ۡ;->ۧ(I[B)[B

    move-result-object v0

    if-eqz v15, :cond_27

    .line 703
    invoke-interface {v7, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 706
    :cond_27
    invoke-virtual {v8, v0}, Ll/ۗ᩺ۡ;->֫([B)V

    :cond_28
    cmp-long v0, v1, v25

    if-eqz v0, :cond_2b

    .line 709
    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->ۖ()J

    move-result-wide v3

    cmp-long v0, v3, v25

    if-ltz v0, :cond_2a

    sub-long v38, v18, v1

    cmp-long v0, v3, v38

    if-lez v0, :cond_29

    goto :goto_13

    :cond_29
    add-long/2addr v3, v1

    .line 714
    invoke-virtual {v8, v3, v4}, Ll/ۗ᩺ۡ;->ܽ(J)V

    goto :goto_14

    :cond_2a
    :goto_13
    const-string v0, "ZIP local file header offset overflows archive bounds"

    .line 711
    invoke-direct {v13, v0}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    .line 1823
    iget-object v0, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->length()J

    move-result-wide v3

    .line 712
    invoke-virtual {v8, v3, v4}, Ll/ۗ᩺ۡ;->ܽ(J)V

    :cond_2b
    :goto_14
    if-lez v10, :cond_2e

    .line 720
    :try_start_1
    invoke-direct {v13, v10}, Ll/ᩳܰۡ;->֫(I)[B

    move-result-object v0

    if-nez v6, :cond_2c

    if-lez v37, :cond_2c

    if-nez v11, :cond_2c

    .line 722
    invoke-static {v0, v5}, Ll/ᩳܰۡ;->֫([B[I)V

    add-int/lit8 v37, v37, -0x1

    .line 725
    :cond_2c
    invoke-virtual {v8, v0}, Ll/ۗ᩺ۡ;->ۧ([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_15

    :catch_1
    move-exception v0

    if-nez v16, :cond_2d

    goto :goto_15

    .line 728
    :cond_2d
    throw v0

    :cond_2e
    :goto_15
    move-object/from16 v10, v41

    .line 733
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, v37

    :goto_16
    if-nez v15, :cond_2f

    if-eqz v16, :cond_30

    :cond_2f
    const-wide/16 v3, 0x1

    add-long v27, v27, v3

    .line 738
    iget-object v3, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v3}, Ll/۠ۖܽ;->getFilePointer()J

    move-result-wide v29

    :cond_30
    move-wide/from16 v3, v29

    .line 740
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v6

    const v8, 0x2014b50

    if-eq v6, v8, :cond_65

    if-nez v15, :cond_31

    if-eqz v16, :cond_3a

    :cond_31
    cmp-long v0, v27, v22

    if-eqz v0, :cond_32

    move-object/from16 v6, v36

    .line 959
    invoke-direct {v13, v6}, Ll/ᩳܰۡ;->ᩳ(Ljava/lang/String;)V

    :cond_32
    cmp-long v0, v3, v33

    if-ltz v0, :cond_39

    cmp-long v0, v31, v25

    if-gez v0, :cond_33

    goto :goto_17

    :cond_33
    sub-long v0, v3, v33

    sub-long v0, v31, v0

    cmp-long v2, v0, v25

    if-nez v2, :cond_34

    goto :goto_18

    :cond_34
    const-string v2, "ZIP central directory size does not match parsed records"

    const-wide/16 v22, 0x6

    cmp-long v6, v0, v22

    if-gez v6, :cond_35

    .line 971
    invoke-direct {v13, v2}, Ll/ᩳܰۡ;->ᩳ(Ljava/lang/String;)V

    goto :goto_18

    .line 975
    :cond_35
    :try_start_2
    invoke-direct {v13, v3, v4}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 976
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v3

    const v4, 0x5054b50

    if-eq v3, v4, :cond_36

    .line 977
    invoke-direct {v13, v2}, Ll/ᩳܰۡ;->ᩳ(Ljava/lang/String;)V

    goto :goto_18

    .line 980
    :cond_36
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v2

    int-to-long v3, v2

    add-long v3, v3, v22

    cmp-long v6, v0, v3

    if-nez v6, :cond_37

    .line 1827
    iget-object v0, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->available()I

    move-result v0

    if-ge v0, v2, :cond_3a

    :cond_37
    const-string v0, "ZIP central directory digital signature is truncated"

    .line 982
    invoke-direct {v13, v0}, Ll/ᩳܰۡ;->ᩳ(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_18

    :catch_2
    move-exception v0

    if-nez v16, :cond_38

    const-string v0, "ZIP central directory is truncated"

    .line 988
    invoke-direct {v13, v0}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    goto :goto_18

    .line 986
    :cond_38
    throw v0

    :cond_39
    :goto_17
    move-object/from16 v8, v35

    .line 962
    invoke-direct {v13, v8}, Ll/ᩳܰۡ;->ᩳ(Ljava/lang/String;)V

    .line 748
    :cond_3a
    :goto_18
    sget-object v12, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    if-nez v11, :cond_3d

    .line 750
    sget v0, Ll/ܳ᩷ܽ;->᩵:I

    const/4 v1, 0x0

    move/from16 v11, p3

    :goto_19
    if-ge v1, v11, :cond_3c

    if-eq v1, v0, :cond_3b

    .line 752
    aget v2, v5, v1

    aget v3, v5, v0

    if-le v2, v3, :cond_3b

    move v0, v1

    :cond_3b
    add-int/lit8 v1, v1, 0x1

    goto :goto_19

    .line 756
    :cond_3c
    invoke-static {v0}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v11

    .line 762
    :cond_3d
    new-instance v0, Ll/ۨ᩺ۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v10, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    if-eqz v15, :cond_3e

    .line 764
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    move-object v8, v0

    goto :goto_1a

    :cond_3e
    move-object/from16 v8, v24

    :goto_1a
    if-eqz v15, :cond_3f

    move-object/from16 v6, v24

    goto :goto_1b

    .line 765
    :cond_3f
    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    move-object v6, v0

    .line 767
    :goto_1b
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :goto_1c
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_55

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩺ۡ;

    .line 769
    :try_start_3
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->ۖ()J

    move-result-wide v4

    .line 770
    invoke-direct {v13, v4, v5}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 1827
    iget-object v1, v13, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v1}, Ll/۠ۖܽ;->available()I

    move-result v1

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_52

    .line 771
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v1

    const v2, 0x4034b50

    if-eq v1, v2, :cond_40

    goto/16 :goto_2f

    :cond_40
    if-eqz v15, :cond_41

    .line 783
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    .line 784
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v1

    .line 785
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v2

    move/from16 p2, v1

    move/from16 p3, v2

    const-wide/16 v1, 0x4

    .line 786
    invoke-direct {v13, v1, v2}, Ll/ᩳܰۡ;->ᩳ(J)V

    .line 787
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v1

    .line 788
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v2

    .line 789
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v27

    move/from16 v23, p2

    move/from16 v29, p3

    move/from16 v30, v1

    move-wide/from16 v31, v27

    move-wide/from16 v27, v2

    goto :goto_1d

    :cond_41
    const-wide/16 v1, 0x1a

    add-long/2addr v1, v4

    .line 792
    invoke-direct {v13, v1, v2}, Ll/ᩳܰۡ;->ۧ(J)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-wide/from16 v27, v25

    move-wide/from16 v31, v27

    const/16 v23, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    .line 794
    :goto_1d
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v3

    .line 795
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v2

    if-nez v15, :cond_43

    if-eqz v16, :cond_42

    goto :goto_1e

    :cond_42
    move-wide/from16 p2, v4

    int-to-long v4, v3

    .line 800
    invoke-direct {v13, v4, v5}, Ll/ᩳܰۡ;->ᩳ(J)V

    move-object/from16 v5, v24

    goto :goto_1f

    :cond_43
    :goto_1e
    move-wide/from16 p2, v4

    .line 798
    invoke-direct {v13, v3}, Ll/ᩳܰۡ;->֫(I)[B

    move-result-object v1

    move-object v5, v1

    .line 802
    :goto_1f
    invoke-direct {v13, v2}, Ll/ᩳܰۡ;->֫(I)[B

    move-result-object v4
    :try_end_3
    .catch Ljava/io/EOFException; {:try_start_3 .. :try_end_3} :catch_d

    if-eqz v15, :cond_44

    .line 804
    :try_start_4
    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v33, v1

    check-cast v33, [B
    :try_end_4
    .catch Ljava/io/EOFException; {:try_start_4 .. :try_end_4} :catch_3

    move-object/from16 v1, p0

    move-object/from16 v35, v14

    move v14, v2

    move-object v2, v0

    move v13, v3

    move-object/from16 v3, v33

    move-wide/from16 v33, p2

    move-object/from16 p2, v4

    move/from16 v4, v23

    move-object/from16 p3, v5

    move/from16 v5, v29

    move-object/from16 v42, v6

    move/from16 v6, v30

    move-object/from16 v43, p1

    move-object/from16 v44, v7

    move-object/from16 v45, v8

    move-wide/from16 v7, v27

    move-object/from16 v23, v10

    move/from16 v29, v15

    move-object v15, v9

    move-wide/from16 v9, v31

    move-object/from16 v46, v11

    move-object/from16 v11, p3

    move-object/from16 v47, v12

    move-object/from16 v30, v23

    move-object/from16 v12, p2

    :try_start_5
    invoke-direct/range {v1 .. v12}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;[BIIIJJ[B[B)V

    goto/16 :goto_21

    :catch_3
    move-exception v0

    move-object/from16 v43, p1

    move-object/from16 v42, v6

    move-object/from16 v44, v7

    move-object/from16 v45, v8

    move-object/from16 v30, v10

    move-object/from16 v46, v11

    move-object/from16 v47, v12

    move-object/from16 v35, v14

    move/from16 v29, v15

    move-object v15, v9

    goto :goto_20

    :cond_44
    move-object/from16 v43, p1

    move-wide/from16 v33, p2

    move v13, v3

    move-object/from16 p2, v4

    move-object/from16 p3, v5

    move-object/from16 v42, v6

    move-object/from16 v44, v7

    move-object/from16 v45, v8

    move-object/from16 v30, v10

    move-object/from16 v46, v11

    move-object/from16 v47, v12

    move-object/from16 v35, v14

    move/from16 v29, v15

    move v14, v2

    move-object v15, v9

    if-eqz v16, :cond_46

    .line 807
    invoke-interface {v15, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    move-object/from16 v2, p3

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_45

    goto :goto_21

    .line 808
    :cond_45
    new-instance v0, Ljava/io/IOException;

    const-string v1, "ZIP local file header name does not match central directory"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_4
    move-exception v0

    :goto_20
    move-object/from16 v10, p0

    move-object/from16 v2, v42

    move-object/from16 v9, v43

    move-object/from16 v7, v44

    goto/16 :goto_2e

    :cond_46
    :goto_21
    const/4 v1, 0x1

    move-object/from16 v2, p2

    .line 812
    invoke-static {v1, v2}, Ll/۠᩺ۡ;->ۧ(I[B)[B

    move-result-object v1

    .line 813
    invoke-virtual {v0, v1}, Ll/ۗ᩺ۡ;->ܽ([B)V

    const-wide/16 v3, 0x1e

    add-long v4, v33, v3

    int-to-long v6, v13

    add-long/2addr v4, v6

    int-to-long v6, v14

    add-long/2addr v4, v6

    .line 814
    invoke-virtual {v0, v4, v5}, Ll/ۗ᩺ۡ;->ۧ(J)V
    :try_end_5
    .catch Ljava/io/EOFException; {:try_start_5 .. :try_end_5} :catch_4

    if-eqz v29, :cond_4e

    .line 816
    :try_start_6
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->ܺ()I

    move-result v1
    :try_end_6
    .catch Ljava/io/EOFException; {:try_start_6 .. :try_end_6} :catch_7

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4e

    cmp-long v1, v27, v20

    if-eqz v1, :cond_48

    cmp-long v1, v31, v20

    if-nez v1, :cond_47

    goto :goto_22

    :cond_47
    const/4 v1, 0x0

    goto :goto_23

    :cond_48
    :goto_22
    const/4 v1, 0x1

    :goto_23
    if-nez v1, :cond_4a

    move-object/from16 v7, v44

    .line 819
    :try_start_7
    invoke-interface {v7, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_49

    goto :goto_24

    :cond_49
    const/4 v3, 0x0

    const/16 v56, 0x0

    goto :goto_25

    :catch_5
    move-exception v0

    goto :goto_26

    :cond_4a
    move-object/from16 v7, v44

    :goto_24
    const/4 v3, 0x1

    const/16 v56, 0x1

    :goto_25
    if-eqz v56, :cond_4b

    if-nez v1, :cond_4b

    const/4 v1, 0x1

    .line 821
    invoke-static {v1, v2}, Ll/۠᩺ۡ;->֫(I[B)Ll/۠᩺ۡ;

    move-result-object v1
    :try_end_7
    .catch Ljava/io/EOFException; {:try_start_7 .. :try_end_7} :catch_5

    if-nez v1, :cond_4b

    const/4 v1, 0x1

    const/16 v57, 0x1

    goto :goto_27

    :goto_26
    move-object/from16 v10, p0

    move-object/from16 v2, v42

    move-object/from16 v9, v43

    goto/16 :goto_2e

    :cond_4b
    const/4 v1, 0x0

    const/16 v57, 0x0

    .line 822
    :goto_27
    :try_start_8
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v1

    .line 823
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v52

    cmp-long v3, v52, v25

    if-ltz v3, :cond_4d

    cmp-long v3, v1, v25

    if-ltz v3, :cond_4d

    sub-long v3, v18, v52

    cmp-long v5, v1, v3

    if-lez v5, :cond_4c

    goto :goto_28

    :cond_4c
    add-long v1, v1, v52

    goto :goto_29

    :cond_4d
    :goto_28
    const-wide/16 v1, -0x1

    :goto_29
    move-wide/from16 v49, v1

    .line 827
    new-instance v1, Ll/֫ܰۡ;

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->ۜ()I

    move-result v51

    .line 828
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v54

    move-object/from16 v48, v1

    invoke-direct/range {v48 .. v57}, Ll/֫ܰۡ;-><init>(JIJJZZ)V
    :try_end_8
    .catch Ljava/io/EOFException; {:try_start_8 .. :try_end_8} :catch_6

    move-object/from16 v9, v43

    .line 827
    :try_start_9
    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2a

    :catch_6
    move-exception v0

    move-object/from16 v9, v43

    goto/16 :goto_2d

    :catch_7
    move-exception v0

    move-object/from16 v9, v43

    move-object/from16 v7, v44

    goto/16 :goto_2d

    :cond_4e
    move-object/from16 v9, v43

    move-object/from16 v7, v44

    .line 831
    :goto_2a
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->ۤ()Z

    move-result v1
    :try_end_9
    .catch Ljava/io/EOFException; {:try_start_9 .. :try_end_9} :catch_c

    if-eqz v1, :cond_4f

    move-object/from16 v10, p0

    .line 832
    :try_start_a
    iget-boolean v1, v10, Ll/ᩳܰۡ;->᩹:Z
    :try_end_a
    .catch Ljava/io/EOFException; {:try_start_a .. :try_end_a} :catch_8

    const/4 v2, 0x0

    move-object/from16 v3, v47

    :try_start_b
    invoke-virtual {v0, v3, v2, v1}, Ll/ۗ᩺ۡ;->֫(Ljava/nio/charset/Charset;ZZ)V

    move-object/from16 v11, v46

    goto :goto_2b

    :catch_8
    move-exception v0

    move-object/from16 v3, v47

    goto :goto_2c

    :cond_4f
    move-object/from16 v10, p0

    move-object/from16 v3, v47

    .line 834
    iget-boolean v1, v10, Ll/ᩳܰۡ;->᩹:Z
    :try_end_b
    .catch Ljava/io/EOFException; {:try_start_b .. :try_end_b} :catch_b

    const/4 v2, 0x1

    move-object/from16 v11, v46

    :try_start_c
    invoke-virtual {v0, v11, v2, v1}, Ll/ۗ᩺ۡ;->֫(Ljava/nio/charset/Charset;ZZ)V

    :goto_2b
    if-nez v17, :cond_50

    .line 836
    iget-boolean v1, v10, Ll/ᩳܰۡ;->᩹:Z

    if-nez v1, :cond_50

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AndroidManifest.xml"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_50

    const/4 v1, 0x1

    .line 837
    iput-boolean v1, v10, Ll/ᩳܰۡ;->᩹:Z
    :try_end_c
    .catch Ljava/io/EOFException; {:try_start_c .. :try_end_c} :catch_a

    :cond_50
    if-eqz v29, :cond_51

    move-object/from16 v1, v45

    .line 840
    :try_start_d
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v42

    goto/16 :goto_31

    :cond_51
    move-object/from16 v1, v45

    .line 842
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0
    :try_end_d
    .catch Ljava/io/EOFException; {:try_start_d .. :try_end_d} :catch_9

    move-object/from16 v2, v42

    :try_start_e
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_31

    :catch_9
    move-exception v0

    move-object/from16 v2, v42

    goto :goto_30

    :catch_a
    move-exception v0

    move-object/from16 v2, v42

    move-object/from16 v1, v45

    goto :goto_30

    :catch_b
    move-exception v0

    :goto_2c
    move-object/from16 v2, v42

    move-object/from16 v1, v45

    move-object/from16 v11, v46

    goto :goto_30

    :catch_c
    move-exception v0

    :goto_2d
    move-object/from16 v10, p0

    move-object/from16 v2, v42

    :goto_2e
    move-object/from16 v1, v45

    move-object/from16 v11, v46

    move-object/from16 v3, v47

    goto :goto_30

    :catch_d
    move-exception v0

    move-object v2, v6

    move-object v1, v8

    move-object/from16 v30, v10

    move-object v3, v12

    move-object v10, v13

    move-object/from16 v35, v14

    move/from16 v29, v15

    move-object v15, v9

    move-object/from16 v9, p1

    goto :goto_30

    :cond_52
    :goto_2f
    move-object v2, v6

    move-object v1, v8

    move-object/from16 v30, v10

    move-object v3, v12

    move-object v10, v13

    move-object/from16 v35, v14

    move/from16 v29, v15

    move-object v15, v9

    move-object/from16 v9, p1

    if-nez v16, :cond_53

    goto :goto_31

    .line 773
    :cond_53
    new-instance v0, Ljava/io/IOException;

    const-string v4, "ZIP central directory entry has an unreadable local file header"

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_e
    .catch Ljava/io/EOFException; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    move-exception v0

    :goto_30
    if-nez v16, :cond_54

    :goto_31
    move-object v8, v1

    move-object v6, v2

    move-object v12, v3

    move-object/from16 p1, v9

    move-object v13, v10

    move-object v9, v15

    move/from16 v15, v29

    move-object/from16 v10, v30

    move-object/from16 v14, v35

    goto/16 :goto_1c

    .line 846
    :cond_54
    new-instance v1, Ljava/io/IOException;

    const-string v2, "ZIP central directory entry local file header is truncated"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_55
    move-object/from16 v9, p1

    move-object v2, v6

    move-object v1, v8

    move-object/from16 v30, v10

    move-object v10, v13

    move-object/from16 v35, v14

    move/from16 v29, v15

    .line 851
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 852
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_56
    :goto_32
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_58

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗ᩺ۡ;

    if-eqz v29, :cond_57

    .line 853
    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_56

    goto :goto_33

    :cond_57
    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_56

    .line 854
    :goto_33
    invoke-direct {v10, v4}, Ll/ᩳܰۡ;->᩻(Ll/ۗ᩺ۡ;)V

    .line 855
    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_32

    :cond_58
    if-eqz v29, :cond_5a

    .line 859
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v1

    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-eq v1, v2, :cond_59

    const/4 v1, 0x1

    goto :goto_34

    :cond_59
    const/4 v1, 0x0

    :goto_34
    iput-boolean v1, v10, Ll/ᩳܰۡ;->ܰ:Z

    .line 860
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v10, Ll/ᩳܰۡ;->᩸:Ljava/util/List;

    .line 861
    invoke-static {v9}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v10, Ll/ᩳܰۡ;->ᩳ֫:Ljava/util/List;

    .line 863
    :cond_5a
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-nez v35, :cond_5c

    .line 1823
    iget-object v2, v10, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v2}, Ll/۠ۖܽ;->length()J

    move-result-wide v2

    const-wide/16 v4, 0xc8

    .line 865
    div-long/2addr v2, v4

    .line 866
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5b
    :goto_35
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ᩺ۡ;

    .line 867
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->֨()I

    move-result v6

    if-nez v6, :cond_5b

    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v6

    if-nez v6, :cond_5b

    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v6

    if-nez v6, :cond_5b

    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v6

    cmp-long v8, v6, v2

    if-lez v8, :cond_5b

    .line 868
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_35

    .line 872
    :cond_5c
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    iget-object v3, v10, Ll/ᩳܰۡ;->ۨ:Ljava/util/LinkedHashMap;

    if-eqz v2, :cond_5d

    .line 874
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_69

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩺ۡ;

    .line 875
    invoke-virtual {v1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_36

    .line 880
    :cond_5d
    new-instance v2, Ll/᩺᩺ۡ;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Ll/᩺᩺ۡ;-><init>(I)V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 882
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v4, 0xa

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v4, 0x0

    :goto_37
    if-ge v4, v2, :cond_62

    .line 883
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ᩺ۡ;

    .line 884
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->ۨ()Z

    move-result v6

    if-eqz v6, :cond_5e

    goto :goto_39

    .line 887
    :cond_5e
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v6

    .line 888
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v8

    add-long/2addr v8, v6

    .line 889
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_5f
    :goto_38
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_61

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۗ᩺ۡ;

    if-eq v12, v5, :cond_5f

    .line 890
    invoke-virtual {v12}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v13

    if-nez v13, :cond_5f

    invoke-virtual {v12}, Ll/ۗ᩺ۡ;->ۨ()Z

    move-result v13

    if-eqz v13, :cond_60

    goto :goto_38

    .line 893
    :cond_60
    invoke-virtual {v12}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v13

    .line 894
    invoke-virtual {v12}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v15

    add-long/2addr v15, v13

    cmp-long v17, v6, v13

    if-gtz v17, :cond_5f

    cmp-long v13, v15, v8

    if-gtz v13, :cond_5f

    .line 896
    invoke-virtual {v12, v5}, Ll/ۗ᩺ۡ;->֫(Ll/ۗ᩺ۡ;)V

    goto :goto_38

    :cond_61
    :goto_39
    add-int/lit8 v4, v4, 0x1

    goto :goto_37

    .line 902
    :cond_62
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 903
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_64

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩺ۡ;

    .line 904
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->ۨ()Z

    move-result v4

    if-eqz v4, :cond_63

    .line 905
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3a

    .line 907
    :cond_63
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3a

    .line 910
    :cond_64
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_69

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩺ۡ;

    .line 911
    invoke-virtual {v1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3b

    :cond_65
    move/from16 v29, v15

    move-object v12, v10

    move-wide/from16 v10, v33

    move-object/from16 v6, v36

    move-wide/from16 v29, v3

    move-object/from16 v3, v35

    move/from16 v4, p3

    goto/16 :goto_10

    :cond_66
    :goto_3c
    move-object/from16 v12, p2

    move-object v10, v13

    move/from16 v29, v15

    const-string v0, "ZIP central directory could not be parsed"

    if-nez v16, :cond_6a

    if-eqz v29, :cond_68

    cmp-long v1, v22, v25

    if-nez v1, :cond_67

    cmp-long v1, v31, v25

    if-eqz v1, :cond_68

    .line 631
    :cond_67
    invoke-direct {v10, v0}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    :cond_68
    const/4 v0, 0x1

    .line 633
    invoke-direct {v10, v12, v0}, Ll/ᩳܰۡ;->֫(Ll/۬᩺ۡ;Z)V

    if-eqz v29, :cond_69

    if-nez v12, :cond_69

    .line 634
    iget-object v0, v10, Ll/ᩳܰۡ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    cmp-long v2, v0, v22

    if-eqz v2, :cond_69

    .line 635
    invoke-direct {v10, v6}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    :cond_69
    :goto_3d
    return-void

    .line 628
    :cond_6a
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ֫([B[I)V
    .locals 4

    .line 192
    array-length v0, p0

    invoke-static {v0, p0}, Ll/ܳ᩷ܽ;->ۧ(I[B)I

    move-result v0

    .line 1438
    sget v1, Ll/ܳ᩷ܽ;->᩵:I

    if-ne v0, v1, :cond_2

    .line 1440
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-byte v3, p0, v2

    if-gtz v3, :cond_0

    .line 1452
    aget p0, p1, v0

    add-int/lit8 p0, p0, 0x1

    aput p0, p1, v0

    return-void

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1447
    :cond_1
    sget p0, Ll/ܳ᩷ܽ;->᩵:I

    aget v0, p1, p0

    add-int/lit8 v0, v0, 0x1

    aput v0, p1, p0

    .line 1448
    sget p0, Ll/ܳ᩷ܽ;->ܿ:I

    aget v0, p1, p0

    add-int/lit8 v0, v0, 0x1

    aput v0, p1, p0

    .line 1449
    sget p0, Ll/ܳ᩷ܽ;->ᩳ:I

    aget v0, p1, p0

    add-int/lit8 v0, v0, 0x1

    aput v0, p1, p0

    .line 1450
    sget p0, Ll/ܳ᩷ܽ;->ܳ:I

    aget v0, p1, p0

    add-int/lit8 v0, v0, 0x1

    aput v0, p1, p0

    return-void

    .line 1455
    :cond_2
    aget p0, p1, v0

    add-int/lit8 p0, p0, 0x1

    aput p0, p1, v0

    return-void
.end method

.method private ֫(Ll/֫ܰۡ;ZZ)Z
    .locals 5

    .line 1108
    :try_start_0
    invoke-static {p1}, Ll/֫ܰۡ;->ᩳ(Ll/֫ܰۡ;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Ll/ᩳܰۡ;->ۧ(J)V

    if-eqz p2, :cond_0

    .line 1109
    invoke-direct {p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result p2

    const v0, 0x8074b50

    if-eq p2, v0, :cond_0

    goto :goto_2

    .line 1112
    :cond_0
    invoke-direct {p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result p2

    if-eqz p3, :cond_1

    .line 1113
    invoke-direct {p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v0

    :goto_0
    if-eqz p3, :cond_2

    .line 1114
    invoke-direct {p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v2

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v2

    .line 1115
    :goto_1
    invoke-static {p1}, Ll/֫ܰۡ;->ܽ(Ll/֫ܰۡ;)I

    move-result p3

    if-ne p2, p3, :cond_3

    invoke-static {p1}, Ll/֫ܰۡ;->ۧ(Ll/֫ܰۡ;)J

    move-result-wide p2

    cmp-long v4, v0, p2

    if-nez v4, :cond_3

    invoke-static {p1}, Ll/֫ܰۡ;->ܿ(Ll/֫ܰۡ;)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long p3, v2, p1

    if-nez p3, :cond_3

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    .line 1124
    new-instance p2, Ll/ܰܰۡ;

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1124
    throw p2

    :catch_1
    move-exception p1

    .line 1121
    throw p1

    :catch_2
    :cond_3
    :goto_2
    const/4 p1, 0x0

    return p1
.end method

.method private ֫(I)[B
    .locals 1

    .line 1845
    new-array p1, p1, [B

    .line 1846
    iget-object v0, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0, p1}, Ll/۠ۖܽ;->readFully([B)V

    return-object p1
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)[B
    .locals 8

    .line 141
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 142
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܽܰۡ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 144
    invoke-static {v1}, Ll/ܽܰۡ;->ܽ(Ll/ܽܰۡ;)[B

    move-result-object p0

    return-object p0

    :cond_0
    const-string v1, "r"

    .line 146
    invoke-virtual {p0, v1}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p0

    .line 164
    :try_start_0
    new-instance v1, Ll/ᩳܰۡ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Ll/ᩳܰۡ;-><init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x0

    const/4 v2, 0x1

    .line 178
    :try_start_1
    invoke-direct {v1, v0, p0, v2}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;Ll/۬᩺ۡ;Z)V

    .line 179
    iget-object p0, v1, Ll/ᩳܰۡ;->ۧ֫:[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 180
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 169
    :try_start_2
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    .line 166
    :goto_1
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 167
    throw v0
.end method

.method private ۗ()I
    .locals 5

    .line 1851
    iget-object v0, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->read()I

    move-result v0

    .line 1852
    iget-object v1, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v1}, Ll/۠ۖܽ;->read()I

    move-result v1

    .line 1853
    iget-object v2, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v2}, Ll/۠ۖܽ;->read()I

    move-result v2

    .line 1854
    iget-object v3, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v3}, Ll/۠ۖܽ;->read()I

    move-result v3

    or-int v4, v0, v1

    or-int/2addr v4, v2

    or-int/2addr v4, v3

    if-ltz v4, :cond_0

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    shl-int/lit8 v1, v2, 0x10

    or-int/2addr v0, v1

    shl-int/lit8 v1, v3, 0x18

    or-int/2addr v0, v1

    return v0

    .line 1856
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method private ۤ()J
    .locals 4

    .line 1869
    invoke-direct {p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public static ۧ(I)Ljava/lang/String;
    .locals 2

    if-lez p0, :cond_1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string p0, "classes.dex"

    return-object p0

    :cond_0
    const-string v0, "classes"

    const-string v1, ".dex"

    .line 0
    invoke-static {p0, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1815
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method private ۧ(J)V
    .locals 1

    .line 1831
    iget-object v0, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0, p1, p2}, Ll/۠ۖܽ;->seek(J)V

    return-void
.end method

.method private ۧ(Ljava/lang/String;)V
    .locals 1

    .line 406
    iget-boolean v0, p0, Ll/ᩳܰۡ;->ܽ֫:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩳܰۡ;->ܿ֫:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 407
    iput-object p1, p0, Ll/ᩳܰۡ;->ܿ֫:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private ۬()J
    .locals 5

    .line 1874
    invoke-direct {p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v0

    invoke-direct {p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v2

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method private ܰ()Ll/ۧܰۡ;
    .locals 34

    move-object/from16 v6, p0

    .line 1823
    iget-object v0, v6, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->length()J

    move-result-wide v7

    const-wide/16 v9, 0x16

    sub-long v0, v7, v9

    const-wide/32 v2, 0x10015

    sub-long v2, v7, v2

    const-wide/16 v4, 0x0

    .line 1464
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v28, v4

    move-wide v4, v0

    move-object v1, v3

    move-object v3, v2

    .line 1468
    :goto_0
    iget-boolean v0, v6, Ll/ᩳܰۡ;->ۗ:Z

    cmp-long v2, v4, v11

    if-ltz v2, :cond_b

    .line 1469
    invoke-direct {v6, v4, v5}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 1470
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v2

    const v13, 0x6054b50

    const-wide/16 v29, 0x1

    if-eq v2, v13, :cond_0

    sub-long v4, v4, v29

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    const-wide/16 v13, -0x1

    const-wide/16 v15, 0x14

    cmp-long v17, v4, v15

    if-lez v17, :cond_3

    sub-long v9, v4, v15

    .line 1525
    :try_start_0
    invoke-direct {v6, v9, v10}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 1526
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v9

    const v10, 0x7064b50

    if-ne v9, v10, :cond_3

    .line 1527
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v9

    .line 1528
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v15

    .line 1529
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v10

    if-eqz v0, :cond_2

    if-nez v9, :cond_1

    if-ne v10, v2, :cond_1

    goto :goto_1

    .line 1532
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Split ZIP archives are not supported"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    move-wide v9, v15

    goto :goto_3

    :catch_0
    move-object v13, v1

    :goto_2
    move-object v9, v3

    move-wide/from16 v18, v4

    goto/16 :goto_a

    :cond_3
    move-wide v9, v13

    :goto_3
    const-wide/16 v15, 0x4

    move-object v2, v1

    add-long v0, v4, v15

    cmp-long v31, v9, v13

    if-eqz v31, :cond_4

    const/4 v15, 0x1

    goto :goto_4

    :cond_4
    const/4 v15, 0x0

    .line 1541
    :goto_4
    :try_start_1
    invoke-direct {v6, v0, v1}, Ll/ᩳܰۡ;->ۧ(J)V

    if-eqz v15, :cond_5

    const-wide/16 v0, 0x10

    .line 1561
    invoke-direct {v6, v0, v1}, Ll/ᩳܰۡ;->ᩳ(J)V

    const/4 v0, -0x1

    const/4 v1, -0x1

    move-wide/from16 v16, v13

    move-wide/from16 v18, v16

    move-wide/from16 v20, v18

    move-wide/from16 v22, v20

    const/4 v14, -0x1

    const/4 v15, -0x1

    goto :goto_5

    .line 1565
    :cond_5
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v0

    .line 1566
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v1

    .line 1567
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v13

    int-to-long v13, v13

    .line 1568
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v15

    move/from16 v16, v0

    move/from16 v17, v1

    int-to-long v0, v15

    .line 1569
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v18

    .line 1571
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->ۤ()J

    move-result-wide v20

    move/from16 v15, v17

    move-wide/from16 v22, v18

    move-wide/from16 v18, v20

    move-wide/from16 v20, v0

    move-wide/from16 v32, v13

    move/from16 v14, v16

    move-wide/from16 v16, v32

    .line 1579
    :goto_5
    invoke-direct/range {p0 .. p0}, Ll/ᩳܰۡ;->᩺()I

    move-result v1

    .line 1580
    new-instance v0, Ll/ۧܰۡ;

    const/16 v27, 0x0

    move-object v13, v0

    move-wide/from16 v24, v4

    move/from16 v26, v1

    invoke-direct/range {v13 .. v27}, Ll/ۧܰۡ;-><init>(IIJJJJJIZ)V

    const-wide/16 v13, 0x16

    add-long v15, v4, v13

    int-to-long v13, v1

    add-long/2addr v15, v13

    if-lez v1, :cond_6

    cmp-long v13, v15, v7

    if-gtz v13, :cond_6

    .line 1481
    invoke-direct {v6, v1}, Ll/ᩳܰۡ;->֫(I)[B

    move-result-object v13

    .line 1482
    new-instance v14, Ljava/lang/String;

    move-object/from16 v17, v0

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v14, v13, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_6

    :cond_6
    move-object/from16 v17, v0

    const/4 v14, 0x0

    :goto_6
    if-eqz v31, :cond_7

    move-object/from16 v0, p0

    move/from16 v17, v1

    move-object v13, v2

    move-wide v1, v9

    move-object v9, v3

    move/from16 v3, v17

    move-wide/from16 v18, v4

    .line 1486
    :try_start_2
    invoke-direct/range {v0 .. v5}, Ll/ᩳܰۡ;->֫(JIJ)Ll/ۧܰۡ;

    move-result-object v0

    goto :goto_7

    :cond_7
    move-object v13, v2

    move-object v9, v3

    move-wide/from16 v18, v4

    move-object/from16 v0, v17

    :goto_7
    cmp-long v1, v15, v7

    if-nez v1, :cond_8

    .line 1490
    iput-object v14, v6, Ll/ᩳܰۡ;->ۛ:Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    return-object v0

    :cond_8
    if-nez v28, :cond_a

    if-lez v1, :cond_9

    :try_start_3
    const-string v1, "ZIP end of central directory comment is truncated"

    goto :goto_8

    :cond_9
    const-string v1, "ZIP end of central directory does not terminate the archive"
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :goto_8
    move-object v3, v1

    move-object/from16 v28, v0

    move-object v1, v14

    goto :goto_9

    :catch_1
    move-object/from16 v28, v0

    move-object v1, v14

    goto :goto_b

    :cond_a
    move-object v3, v9

    move-object v1, v13

    :goto_9
    sub-long v4, v18, v29

    goto :goto_c

    :catch_2
    move-object v13, v2

    goto/16 :goto_2

    :catch_3
    :goto_a
    move-object v1, v13

    :goto_b
    sub-long v4, v18, v29

    move-object v3, v9

    :goto_c
    const-wide/16 v9, 0x16

    goto/16 :goto_0

    :cond_b
    move-object v13, v1

    move-object v9, v3

    const/4 v1, 0x0

    if-eqz v28, :cond_d

    if-nez v0, :cond_c

    .line 1511
    invoke-direct {v6, v9}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    .line 1512
    iput-object v13, v6, Ll/ᩳܰۡ;->ۛ:Ljava/lang/String;

    return-object v28

    .line 1509
    :cond_c
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v9}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    return-object v1
.end method

.method private ᩳ(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 1837
    iget-object v0, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->getFilePointer()J

    move-result-wide v0

    add-long/2addr v0, p1

    .line 1838
    iget-object p1, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {p1}, Ll/۠ۖܽ;->length()J

    move-result-wide p1

    cmp-long v2, v0, p1

    if-gtz v2, :cond_0

    .line 1841
    iget-object p1, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {p1, v0, v1}, Ll/۠ۖܽ;->seek(J)V

    return-void

    .line 1840
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 1836
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Skip "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1836
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ᩳ(Ljava/lang/String;)V
    .locals 1

    .line 994
    iget-boolean v0, p0, Ll/ᩳܰۡ;->ۗ:Z

    if-nez v0, :cond_0

    .line 997
    invoke-direct {p0, p1}, Ll/ᩳܰۡ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 995
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ᩺()I
    .locals 3

    .line 1861
    iget-object v0, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->read()I

    move-result v0

    .line 1862
    iget-object v1, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v1}, Ll/۠ۖܽ;->read()I

    move-result v1

    or-int v2, v0, v1

    if-ltz v2, :cond_0

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    return v0

    .line 1864
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method private ᩻(Ll/ۗ᩺ۡ;)V
    .locals 5

    .line 1403
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 1404
    iget-boolean v0, p0, Ll/ᩳܰۡ;->᩹:Z

    if-eqz v0, :cond_0

    .line 1405
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܺ()I

    move-result v0

    and-int/lit8 v0, v0, -0x2

    invoke-virtual {p1, v0}, Ll/ۗ᩺ۡ;->ܿ(I)V

    goto :goto_0

    .line 1407
    :cond_0
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->֡()[B

    move-result-object v0

    const v2, 0x9901

    invoke-static {v2, v0}, Ll/۠᩺ۡ;->֫(I[B)Ll/۠᩺ۡ;

    move-result-object v0

    if-eqz v0, :cond_3

    const/16 v2, 0x63

    .line 1409
    invoke-virtual {p1, v2}, Ll/ۗ᩺ۡ;->ܽ(I)V

    .line 1410
    invoke-virtual {p1, v0}, Ll/ۗ᩺ۡ;->֫(Ll/۠᩺ۡ;)V

    .line 1411
    invoke-virtual {v0}, Ll/۠᩺ۡ;->֫()[B

    move-result-object v0

    .line 1412
    array-length v2, v0

    const/4 v3, 0x7

    if-lt v2, v3, :cond_2

    .line 1415
    sget-boolean v2, Ll/ۖܰۡ;->֫:Z

    .line 86
    array-length v2, v0

    if-gt v3, v2, :cond_1

    const/4 v2, 0x5

    .line 89
    invoke-static {v2, v0}, Ll/ܺܰۡ;->ܽ(I[B)I

    move-result v0

    .line 1415
    invoke-virtual {p1, v0}, Ll/ۗ᩺ۡ;->᩻(I)V

    goto :goto_0

    .line 87
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 1413
    :cond_2
    new-instance v0, Ljava/util/zip/ZipException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid aes extra data record. ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1416
    :cond_3
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܺ()I

    move-result v0

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    .line 1417
    invoke-virtual {p1, v0}, Ll/ۗ᩺ۡ;->ܽ(I)V

    goto :goto_0

    .line 1419
    :cond_4
    invoke-virtual {p1, v1}, Ll/ۗ᩺ۡ;->ܽ(I)V

    .line 1423
    :cond_5
    :goto_0
    iget-boolean v0, p0, Ll/ᩳܰۡ;->᩹:Z

    if-eqz v0, :cond_6

    .line 1424
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->֨()I

    move-result v0

    const/16 v2, 0x8

    if-eq v0, v2, :cond_6

    if-eqz v0, :cond_6

    .line 1426
    invoke-virtual {p1, v1}, Ll/ۗ᩺ۡ;->᩻(I)V

    .line 1429
    :cond_6
    iget-boolean v0, p0, Ll/ᩳܰۡ;->᩹:Z

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->֨()I

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-eqz v4, :cond_7

    .line 1430
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/ۗ᩺ۡ;->֫(J)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1881
    invoke-virtual {p0}, Ll/ᩳܰۡ;->֫()V

    .line 1882
    iget-boolean v0, p0, Ll/ᩳܰۡ;->ۤ:Z

    if-eqz v0, :cond_0

    return-void

    .line 1884
    :cond_0
    iget-object v0, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ljava/nio/channels/Channel;->close()V

    const/4 v0, 0x1

    .line 1885
    iput-boolean v0, p0, Ll/ᩳܰۡ;->ۤ:Z

    return-void
.end method

.method public final getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;
    .locals 1

    .line 361
    iget-object v0, p0, Ll/ᩳܰۡ;->ۨ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗ᩺ۡ;

    return-object p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1786
    iget-object v0, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/۠ۖܽ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()[B
    .locals 1

    .line 413
    iget-object v0, p0, Ll/ᩳܰۡ;->ۧ֫:[B

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1642
    invoke-direct {p0, p1, v0, v1}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;ZZ)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Z)Ljava/util/List;
    .locals 3

    const/4 v0, 0x1

    .line 1795
    invoke-static {v0}, Ll/ᩳܰۡ;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 1796
    invoke-virtual {p0, v1}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v2

    if-nez v2, :cond_1

    if-eqz p1, :cond_0

    .line 1799
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 1801
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Entry not found: "

    const-string v2, "\n("

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1801
    iget-object v1, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v1}, Ll/۠ۖܽ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1804
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    :goto_0
    if-eqz v2, :cond_2

    .line 1806
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v0

    .line 1807
    invoke-static {v1}, Ll/ᩳܰۡ;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    .line 1808
    invoke-virtual {p0, v2}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v2

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public final ֫()V
    .locals 3

    .line 1889
    iget-object v0, p0, Ll/ᩳܰۡ;->۫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳܰۡ;

    .line 524
    invoke-static {v2}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    goto :goto_0

    .line 1892
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    .line 435
    :cond_0
    iput-object p1, p0, Ll/ᩳܰۡ;->֫֫:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B
    .locals 6

    .line 1761
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    long-to-int v1, v0

    new-array v0, v1, [B

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 1642
    invoke-direct {p0, p1, v2, v3}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;ZZ)Ljava/io/InputStream;

    move-result-object v2

    :cond_0
    :goto_0
    const/4 v4, -0x1

    if-ge v3, v1, :cond_1

    sub-int v5, v1, v3

    .line 1765
    :try_start_0
    invoke-virtual {v2, v0, v3, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-eq v5, v4, :cond_1

    add-int/2addr v3, v5

    if-eqz p2, :cond_0

    .line 1768
    invoke-virtual {p2, v5}, Ll/᩵ۛۡ;->֫(I)Z

    goto :goto_0

    :cond_1
    if-ne v3, v1, :cond_2

    .line 1772
    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p2, v4, :cond_2

    .line 1774
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return-object v0

    .line 1773
    :cond_2
    :try_start_1
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The length of data has been read is incorrect. ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 1762
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public final ۖ()Ljava/util/ArrayList;
    .locals 2

    .line 419
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ᩳܰۡ;->ۨ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 420
    sget-object v1, Ll/ᩳܰۡ;->ܳ֫:Ll/۫᩺ۡ;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public final ۘ()Ljava/util/Map;
    .locals 1

    .line 374
    iget-object v0, p0, Ll/ᩳܰۡ;->ۨ:Ljava/util/LinkedHashMap;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/ܳܰۡ;
    .locals 1

    .line 1916
    new-instance v0, Ll/ܳܰۡ;

    invoke-direct {v0, p0}, Ll/ܳܰۡ;-><init>(Ll/ᩳܰۡ;)V

    return-object v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 439
    iget-object v0, p0, Ll/ᩳܰۡ;->ۛ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;
    .locals 1

    const/4 v0, 0x0

    .line 1642
    invoke-direct {p0, p1, v0, v0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;ZZ)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()[B
    .locals 9

    .line 455
    iget-boolean v0, p0, Ll/ᩳܰۡ;->᩺:Z

    if-eqz v0, :cond_3

    .line 458
    iget-wide v0, p0, Ll/ᩳܰۡ;->᩶:J

    invoke-direct {p0, v0, v1}, Ll/ᩳܰۡ;->ۧ(J)V

    .line 459
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 460
    invoke-direct {p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v1

    const-wide/16 v3, 0x18

    sub-long/2addr v1, v3

    :cond_0
    :goto_0
    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_2

    .line 462
    invoke-direct {p0}, Ll/ᩳܰۡ;->۬()J

    move-result-wide v5

    long-to-int v6, v5

    add-int/lit8 v5, v6, 0x8

    int-to-long v7, v5

    sub-long/2addr v1, v7

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    .line 466
    invoke-direct {p0}, Ll/ᩳܰۡ;->ۗ()I

    move-result v3

    const v4, 0x42726577

    if-eq v3, v4, :cond_1

    int-to-long v4, v6

    .line 468
    invoke-virtual {v0, v4, v5}, Ll/ۤۜܽ;->ۧ(J)V

    .line 469
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeInt(I)V

    add-int/lit8 v6, v6, -0x4

    .line 470
    invoke-direct {p0, v6}, Ll/ᩳܰۡ;->֫(I)[B

    move-result-object v3

    const/4 v4, 0x0

    .line 44
    array-length v5, v3

    invoke-virtual {v0, v3, v4, v5}, Ll/ۤۜܽ;->write([BII)V

    goto :goto_0

    :cond_1
    add-int/lit8 v6, v6, -0x4

    int-to-long v3, v6

    .line 472
    invoke-direct {p0, v3, v4}, Ll/ᩳܰۡ;->ᩳ(J)V

    goto :goto_0

    .line 476
    :cond_2
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v0

    return-object v0

    .line 456
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ܳ(Ll/ۗ᩺ۡ;)[B
    .locals 6

    .line 1745
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    const-wide/32 v2, 0x1400000

    const/4 v4, 0x0

    cmp-long v5, v0, v2

    if-gtz v5, :cond_0

    .line 1757
    invoke-virtual {p0, p1, v4}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1642
    :try_start_0
    invoke-direct {p0, p1, v0, v1}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;ZZ)Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1750
    :try_start_1
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v1

    invoke-static {v1, v2, v0}, Ll/֡ۤۡ;->֫(JLjava/io/InputStream;)[B

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1751
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    :catchall_0
    move-exception v1

    .line 1749
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 1757
    :catch_0
    invoke-virtual {p0, p1, v4}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object p1

    return-object p1
.end method

.method public final ܶ()Z
    .locals 1

    .line 451
    iget-boolean v0, p0, Ll/ᩳܰۡ;->᩺:Z

    return v0
.end method

.method public final ܽ(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;
    .locals 6

    .line 1649
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    const-string v2, ")"

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-ltz v5, :cond_1

    .line 1652
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v0

    cmp-long v5, v0, v3

    if-ltz v5, :cond_0

    const/4 v0, 0x1

    .line 1655
    invoke-direct {p0, p1, v0, v0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;ZZ)Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 1653
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Unknown compressed size ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1650
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Unknown uncompressed size ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final declared-synchronized ܽ()Ll/ᩳܰۡ;
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1902
    :try_start_0
    iget-boolean v1, p0, Ll/ᩳܰۡ;->ۤ:Z

    if-nez v1, :cond_0

    .line 1905
    new-instance v1, Ll/ᩳܰۡ;

    iget-object v2, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v2}, Ll/۠ۖܽ;->ۡ()Ll/᩻ۖܽ;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Ll/ᩳܰۡ;-><init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;)V

    .line 1906
    iget-object v2, p0, Ll/ᩳܰۡ;->ۧ֫:[B

    iput-object v2, v1, Ll/ᩳܰۡ;->ۧ֫:[B

    .line 1907
    iget-boolean v2, p0, Ll/ᩳܰۡ;->᩹:Z

    iput-boolean v2, v1, Ll/ᩳܰۡ;->᩹:Z

    .line 1908
    iget-object v2, p0, Ll/ᩳܰۡ;->֫֫:Ljava/lang/String;

    iput-object v2, v1, Ll/ᩳܰۡ;->֫֫:Ljava/lang/String;

    .line 1909
    iget-boolean v2, p0, Ll/ᩳܰۡ;->᩺:Z

    iput-boolean v2, v1, Ll/ᩳܰۡ;->᩺:Z

    .line 1910
    iget-wide v2, p0, Ll/ᩳܰۡ;->᩶:J

    iput-wide v2, v1, Ll/ᩳܰۡ;->᩶:J

    .line 1911
    iget-object v2, p0, Ll/ᩳܰۡ;->۫:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1912
    monitor-exit v0

    return-object v1

    .line 1903
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 1912
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܿ(Ll/ۗ᩺ۡ;)Ll/ᩳܰۡ;
    .locals 7

    .line 1779
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->֨()I

    move-result v0

    if-nez v0, :cond_0

    .line 1782
    new-instance v0, Ll/ᩳܰۡ;

    iget-object v1, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v2

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v4

    invoke-interface {v1, v2, v3, v4, v5}, Ll/۠ۖܽ;->ۧ(JJ)Ll/᩻ۖܽ;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/ᩳܰۡ;-><init>(Ll/۠ۖܽ;Ll/ܶ᩵ܿ;ZLjava/nio/charset/Charset;Ll/۬᩺ۡ;)V

    return-object v0

    .line 1780
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Entry is not stored: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()Ljava/util/List;
    .locals 9

    .line 391
    iget-boolean v0, p0, Ll/ᩳܰۡ;->ܽ֫:Z

    if-eqz v0, :cond_9

    .line 394
    iget-object v0, p0, Ll/ᩳܰۡ;->ܿ֫:Ljava/lang/String;

    if-nez v0, :cond_8

    .line 397
    iget-boolean v0, p0, Ll/ᩳܰۡ;->ܰ:Z

    if-nez v0, :cond_7

    .line 1089
    iget-object v0, p0, Ll/ᩳܰۡ;->ᩳ֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ܰۡ;

    .line 1090
    invoke-static {v1}, Ll/֫ܰۡ;->ᩳ(Ll/֫ܰۡ;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    cmp-long v8, v2, v4

    if-ltz v8, :cond_1

    invoke-static {v1}, Ll/֫ܰۡ;->ܳ(Ll/֫ܰۡ;)Z

    move-result v2

    .line 1091
    invoke-direct {p0, v1, v6, v2}, Ll/ᩳܰۡ;->֫(Ll/֫ܰۡ;ZZ)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Ll/֫ܰۡ;->ܳ(Ll/֫ܰۡ;)Z

    move-result v2

    .line 1092
    invoke-direct {p0, v1, v7, v2}, Ll/ᩳܰۡ;->֫(Ll/֫ܰۡ;ZZ)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_4

    .line 1093
    invoke-static {v1}, Ll/֫ܰۡ;->֫(Ll/֫ܰۡ;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1095
    invoke-direct {p0, v1, v6, v7}, Ll/ᩳܰۡ;->֫(Ll/֫ܰۡ;ZZ)Z

    move-result v2

    if-nez v2, :cond_3

    .line 1096
    invoke-direct {p0, v1, v7, v7}, Ll/ᩳܰۡ;->֫(Ll/֫ܰۡ;ZZ)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :cond_3
    :goto_2
    move v2, v6

    :cond_4
    if-eqz v2, :cond_5

    goto :goto_0

    .line 1099
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "ZIP data descriptor does not match central directory"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 401
    :cond_6
    iget-object v0, p0, Ll/ᩳܰۡ;->᩸:Ljava/util/List;

    return-object v0

    .line 398
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "ZIP central directory contains an unreadable local file header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 395
    :cond_8
    new-instance v0, Ljava/io/IOException;

    iget-object v1, p0, Ll/ᩳܰۡ;->ܿ֫:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 392
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ZIP was not opened for testing"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ(Ll/ۗ᩺ۡ;)Ll/۫ܰۡ;
    .locals 8

    .line 1634
    new-instance v7, Ll/۫ܰۡ;

    iget-object v1, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v2

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v4

    const/4 v6, 0x0

    move-object v0, v7

    .line 17
    invoke-direct/range {v0 .. v6}, Ll/۫ܰۡ;-><init>(Ll/۠ۖܽ;JJZ)V

    return-object v7
.end method

.method public final ᩴ()I
    .locals 1

    .line 425
    iget-object v0, p0, Ll/ᩳܰۡ;->ۨ:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public final ᩵()Ljava/lang/String;
    .locals 1

    .line 429
    iget-object v0, p0, Ll/ᩳܰۡ;->֫֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩶()Z
    .locals 1

    .line 480
    iget-boolean v0, p0, Ll/ᩳܰۡ;->۟:Z

    return v0
.end method

.method public final ᩶ۧ()Ljava/util/Collection;
    .locals 1

    .line 378
    iget-object v0, p0, Ll/ᩳܰۡ;->ۨ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ljava/lang/String;)Ll/ۗ᩺ۡ;
    .locals 3

    .line 366
    iget-object v0, p0, Ll/ᩳܰۡ;->ۨ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩺ۡ;

    if-eqz v0, :cond_0

    return-object v0

    .line 368
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Entry not found: "

    const-string v2, "\n("

    .line 0
    invoke-static {v1, p1, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 368
    iget-object v1, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    invoke-interface {v1}, Ll/۠ۖܽ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 447
    iget-boolean v0, p0, Ll/ᩳܰۡ;->᩹:Z

    return v0
.end method

.method public final ᩹()Z
    .locals 1

    .line 443
    iget-object v0, p0, Ll/ᩳܰۡ;->֫֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ᩻()Ll/۠ۖܽ;
    .locals 1

    .line 1896
    iget-object v0, p0, Ll/ᩳܰۡ;->ۙ:Ll/۠ۖܽ;

    return-object v0
.end method
