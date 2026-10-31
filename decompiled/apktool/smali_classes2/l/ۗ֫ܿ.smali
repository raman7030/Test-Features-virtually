.class public final Ll/ۗ֫ܿ;
.super Ljava/lang/Object;
.source "16QU"


# instance fields
.field public final ֫:Z

.field public final ۖ:I

.field public final ۜ:I

.field public final ۡ:I

.field public final ۢ:I

.field public final ۧ:[B

.field public final ܳ:Z

.field public final ܺ:Z

.field public final ܽ:Ll/۬ܰᩳ;

.field public final ܿ:[B

.field public final ᩳ:[B

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(IIIZZZII[B[B[BI)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p12, :cond_8

    and-int/lit8 v0, p12, -0x20

    if-nez v0, :cond_8

    .line 30
    iput p12, p0, Ll/ۗ֫ܿ;->᩻:I

    if-ltz p3, :cond_7

    const/16 v0, 0xff

    if-gt p3, v0, :cond_7

    const/4 v0, -0x1

    if-lt p7, v0, :cond_7

    if-lt p8, v0, :cond_7

    .line 34
    iput p1, p0, Ll/ۗ֫ܿ;->ۢ:I

    iput p2, p0, Ll/ۗ֫ܿ;->ۡ:I

    iput p3, p0, Ll/ۗ֫ܿ;->ۖ:I

    .line 35
    iput-boolean p4, p0, Ll/ۗ֫ܿ;->ܺ:Z

    iput-boolean p5, p0, Ll/ۗ֫ܿ;->֫:Z

    iput-boolean p6, p0, Ll/ۗ֫ܿ;->ܳ:Z

    .line 36
    iput p7, p0, Ll/ۗ֫ܿ;->᩷:I

    iput p8, p0, Ll/ۗ֫ܿ;->ۜ:I

    and-int/lit8 p1, p12, 0x2

    if-eqz p1, :cond_0

    .line 38
    new-instance p2, Ljava/io/ByteArrayInputStream;

    invoke-direct {p2, p9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length p3, p9

    int-to-long p3, p3

    array-length p5, p9

    invoke-static {p2, p3, p4, p5}, Ll/۬ܰᩳ;->֫(Ljava/io/ByteArrayInputStream;JI)Ll/۬ܰᩳ;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-object p2, p0, Ll/ۗ֫ܿ;->ܽ:Ll/۬ܰᩳ;

    if-nez p1, :cond_2

    .line 39
    array-length p1, p9

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unexpected session text config"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    and-int/lit8 p1, p12, 0x8

    if-eqz p1, :cond_3

    .line 40
    invoke-static {p10}, Ll/ۗ֫ܿ;->֫([B)V

    goto :goto_2

    .line 41
    :cond_3
    array-length p1, p10

    if-nez p1, :cond_6

    :goto_2
    and-int/lit8 p1, p12, 0x10

    if-eqz p1, :cond_4

    .line 42
    invoke-static {p11}, Ll/ۗ֫ܿ;->֫([B)V

    goto :goto_3

    .line 43
    :cond_4
    array-length p1, p11

    if-nez p1, :cond_5

    .line 44
    :goto_3
    iput-object p9, p0, Ll/ۗ֫ܿ;->ᩳ:[B

    iput-object p10, p0, Ll/ۗ֫ܿ;->ۧ:[B

    iput-object p11, p0, Ll/ۗ֫ܿ;->ܿ:[B

    return-void

    .line 43
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unexpected forward navigation stack"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 41
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unexpected backward navigation stack"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 32
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid session view coordinates or wrap mode"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 29
    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid session view field mask"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(IIIZZZLl/᩺֫ܿ;Ll/᩹۟ᩳ;Ll/᩹۟ᩳ;)Ll/ۗ֫ܿ;
    .locals 18

    move-object/from16 v0, p6

    .line 51
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    invoke-virtual {v0, v1}, Ll/᩺֫ܿ;->֫(Ll/ۤۜܽ;)V

    .line 52
    new-instance v2, Ll/ۤۜܽ;

    invoke-direct {v2}, Ll/ۤۜܽ;-><init>()V

    move-object/from16 v3, p7

    invoke-virtual {v3, v2}, Ll/᩹۟ᩳ;->֫(Ll/ۤۜܽ;)V

    .line 53
    new-instance v3, Ll/ۤۜܽ;

    invoke-direct {v3}, Ll/ۤۜܽ;-><init>()V

    move-object/from16 v4, p8

    invoke-virtual {v4, v3}, Ll/᩹۟ᩳ;->֫(Ll/ۤۜܽ;)V

    .line 54
    new-instance v17, Ll/ۗ֫ܿ;

    iget v11, v0, Ll/᩺֫ܿ;->۠ۧ:I

    iget v12, v0, Ll/᩺֫ܿ;->֨ۧ:I

    .line 55
    invoke-virtual {v1}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v13

    invoke-virtual {v2}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v14

    invoke-virtual {v3}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v15

    const/16 v16, 0x1f

    move-object/from16 v4, v17

    move/from16 v5, p0

    move/from16 v6, p1

    move/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p4

    move/from16 v10, p5

    .line 22
    invoke-direct/range {v4 .. v16}, Ll/ۗ֫ܿ;-><init>(IIIZZZII[B[B[BI)V

    return-object v17
.end method

.method public static ֫(I[B)Ll/ۗ֫ܿ;
    .locals 19

    move/from16 v0, p0

    move-object/from16 v1, p1

    if-ltz v0, :cond_5

    .line 137
    array-length v2, v1

    if-gt v2, v0, :cond_5

    array-length v0, v1

    const/16 v2, 0x2f

    if-lt v0, v2, :cond_5

    .line 141
    :try_start_0
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, v1}, Ll/۬ۜܽ;-><init>([B)V

    .line 142
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Unsupported session view state"

    const v3, 0x32565745

    if-ne v1, v3, :cond_4

    .line 143
    :try_start_1
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eq v1, v4, :cond_1

    if-ne v1, v5, :cond_0

    goto :goto_0

    .line 144
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-ne v1, v5, :cond_2

    .line 145
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    move/from16 v16, v1

    goto :goto_1

    :cond_2
    const/16 v1, 0x1f

    const/16 v16, 0x1f

    .line 146
    :goto_1
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v7

    .line 147
    invoke-static {v0}, Ll/ۗ֫ܿ;->ۧ(Ll/۬ۜܽ;)Z

    move-result v8

    invoke-static {v0}, Ll/ۗ֫ܿ;->ۧ(Ll/۬ۜܽ;)Z

    move-result v9

    invoke-static {v0}, Ll/ۗ֫ܿ;->ۧ(Ll/۬ۜܽ;)Z

    move-result v10

    .line 148
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v11

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v12

    .line 149
    invoke-static {v0}, Ll/ۗ֫ܿ;->֫(Ll/۬ۜܽ;)[B

    move-result-object v13

    invoke-static {v0}, Ll/ۗ֫ܿ;->֫(Ll/۬ۜܽ;)[B

    move-result-object v14

    invoke-static {v0}, Ll/ۗ֫ܿ;->֫(Ll/۬ۜܽ;)[B

    move-result-object v15

    .line 150
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    const-wide/16 v17, 0x4

    cmp-long v4, v1, v17

    if-nez v4, :cond_3

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-ne v0, v3, :cond_3

    .line 151
    new-instance v0, Ll/ۗ֫ܿ;

    move-object v4, v0

    invoke-direct/range {v4 .. v16}, Ll/ۗ֫ܿ;-><init>(IIIZZZII[B[B[BI)V

    return-object v0

    .line 150
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing or truncated session view state"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 142
    :cond_4
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    .line 153
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Truncated session view state"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 138
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid session view state length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/ۛܰᩳ;)Ll/ۗ֫ܿ;
    .locals 18

    move-object/from16 v0, p0

    .line 60
    iget-boolean v1, v0, Ll/ۛܰᩳ;->ۜ:Z

    iget-object v2, v0, Ll/ۛܰᩳ;->ܽ:Ll/۬ܰᩳ;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    or-int/2addr v1, v2

    .line 61
    iget-boolean v2, v0, Ll/ۛܰᩳ;->᩷:Z

    if-eqz v2, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    or-int/2addr v1, v4

    iget-object v4, v0, Ll/ۛܰᩳ;->ۧ:Ljava/util/ArrayList;

    if-eqz v4, :cond_2

    const/16 v4, 0x8

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    or-int/2addr v1, v4

    .line 62
    iget-object v4, v0, Ll/ۛܰᩳ;->ܳ:Ljava/util/ArrayList;

    if-eqz v4, :cond_3

    const/16 v4, 0x10

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    or-int v17, v1, v4

    .line 63
    new-instance v1, Ll/ۗ֫ܿ;

    iget v6, v0, Ll/ۛܰᩳ;->ᩴ:I

    iget v7, v0, Ll/ۛܰᩳ;->᩵:I

    iget v8, v0, Ll/ۛܰᩳ;->ۚ:I

    iget-boolean v9, v0, Ll/ۛܰᩳ;->֡:Z

    iget-boolean v10, v0, Ll/ۛܰᩳ;->֫:Z

    iget-boolean v11, v0, Ll/ۛܰᩳ;->ۢ:Z

    if-eqz v2, :cond_4

    .line 64
    iget v4, v0, Ll/ۛܰᩳ;->ۖ:I

    move v12, v4

    goto :goto_4

    :cond_4
    const/4 v4, -0x1

    const/4 v12, -0x1

    :goto_4
    if-eqz v2, :cond_5

    .line 65
    iget v2, v0, Ll/ۛܰᩳ;->ܺ:I

    move v13, v2

    goto :goto_5

    :cond_5
    const/4 v2, -0x1

    const/4 v13, -0x1

    .line 66
    :goto_5
    iget-object v2, v0, Ll/ۛܰᩳ;->ܿ:[B

    if-nez v2, :cond_6

    new-array v2, v3, [B

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, [B->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    :goto_6
    move-object v14, v2

    iget-object v2, v0, Ll/ۛܰᩳ;->ۧ:Ljava/util/ArrayList;

    .line 67
    invoke-static {v2}, Ll/ۗ֫ܿ;->֫(Ljava/util/ArrayList;)[B

    move-result-object v15

    iget-object v0, v0, Ll/ۛܰᩳ;->ܳ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۗ֫ܿ;->֫(Ljava/util/ArrayList;)[B

    move-result-object v16

    move-object v5, v1

    invoke-direct/range {v5 .. v17}, Ll/ۗ֫ܿ;-><init>(IIIZZZII[B[B[BI)V

    return-object v1
.end method

.method public static ֫([B)V
    .locals 5

    .line 192
    array-length v0, p0

    const/4 v1, 0x6

    if-lt v0, v1, :cond_1

    .line 193
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p0}, Ll/۬ۜܽ;-><init>([B)V

    .line 194
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result p0

    const v1, -0x5d7d9e7d

    if-ne p0, v1, :cond_0

    invoke-virtual {v0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p0

    int-to-long v1, p0

    const-wide/16 v3, 0x8

    mul-long v1, v1, v3

    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v3

    cmp-long p0, v1, v3

    if-nez p0, :cond_0

    return-void

    .line 195
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid session navigation stack"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 192
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Truncated session navigation stack"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/util/ArrayList;)[B
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [B

    return-object p0

    .line 119
    :cond_0
    new-instance v0, Ll/ۤۜܽ;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    add-int/lit8 v1, v1, 0x6

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const v1, -0x5d7d9e7d

    .line 120
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ۡ(I)V

    .line 121
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸۟ᩳ;

    iget v2, v1, Ll/᩸۟ᩳ;->ۧ:I

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    iget v1, v1, Ll/᩸۟ᩳ;->֫:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    goto :goto_0

    .line 122
    :cond_1
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۬ۜܽ;)[B
    .locals 6

    .line 179
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 180
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-ltz v0, :cond_0

    int-to-long v1, v0

    .line 181
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    .line 211
    new-array v1, v0, [B

    .line 212
    invoke-virtual {p0, v0, v1}, Ll/۬ۜܽ;->֫(I[B)V

    return-object v1

    .line 181
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid session view field length"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 179
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Missing session view field"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/۬ۜܽ;)Z
    .locals 1

    .line 186
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result p0

    const/16 v0, 0xff

    and-int/2addr p0, v0

    if-eqz p0, :cond_1

    if-ne p0, v0, :cond_0

    goto :goto_0

    .line 187
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid session view flag"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    if-eqz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫()J
    .locals 4

    .line 170
    iget v0, p0, Ll/ۗ֫ܿ;->᩻:I

    const/16 v1, 0x1f

    if-ne v0, v1, :cond_0

    const-wide/16 v0, 0x2f

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x33

    :goto_0
    iget-object v2, p0, Ll/ۗ֫ܿ;->ᩳ:[B

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-object v2, p0, Ll/ۗ֫ܿ;->ۧ:[B

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-object v2, p0, Ll/ۗ֫ܿ;->ܿ:[B

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 72
    iget v0, p0, Ll/ۗ֫ܿ;->᩻:I

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ll/۬ۜܽ;

    iget-object v0, p0, Ll/ۗ֫ܿ;->ᩳ:[B

    invoke-direct {p1, v0}, Ll/۬ۜܽ;-><init>([B)V

    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(II)Ll/ۗ֫ܿ;
    .locals 15

    move-object v0, p0

    .line 130
    iget-boolean v1, v0, Ll/ۗ֫ܿ;->ܺ:Z

    if-nez v1, :cond_1

    move/from16 v1, p1

    move/from16 v2, p2

    if-gt v1, v2, :cond_0

    goto :goto_0

    .line 131
    :cond_0
    new-instance v14, Ll/ۗ֫ܿ;

    iget-object v12, v0, Ll/ۗ֫ܿ;->ܿ:[B

    iget v13, v0, Ll/ۗ֫ܿ;->᩻:I

    iget v2, v0, Ll/ۗ֫ܿ;->ۢ:I

    iget v3, v0, Ll/ۗ֫ܿ;->ۡ:I

    iget v4, v0, Ll/ۗ֫ܿ;->ۖ:I

    const/4 v5, 0x1

    iget-boolean v6, v0, Ll/ۗ֫ܿ;->֫:Z

    iget-boolean v7, v0, Ll/ۗ֫ܿ;->ܳ:Z

    iget v8, v0, Ll/ۗ֫ܿ;->᩷:I

    iget v9, v0, Ll/ۗ֫ܿ;->ۜ:I

    iget-object v10, v0, Ll/ۗ֫ܿ;->ᩳ:[B

    iget-object v11, v0, Ll/ۗ֫ܿ;->ۧ:[B

    move-object v1, v14

    invoke-direct/range {v1 .. v13}, Ll/ۗ֫ܿ;-><init>(IIIZZZII[B[B[BI)V

    return-object v14

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final ֫(IILjava/lang/String;)Ll/ۗ֫ܿ;
    .locals 17

    move-object/from16 v0, p0

    .line 100
    iget v1, v0, Ll/ۗ֫ܿ;->᩻:I

    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_1

    .line 102
    iget-object v3, v0, Ll/ۗ֫ܿ;->ᩳ:[B

    if-eqz v2, :cond_0

    .line 103
    new-instance v2, Ll/۬ۜܽ;

    invoke-direct {v2, v3}, Ll/۬ۜܽ;-><init>([B)V

    .line 104
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    .line 105
    new-instance v4, Ll/ۤۜܽ;

    array-length v3, v3

    add-int/lit8 v3, v3, 0x8

    invoke-direct {v4, v3}, Ll/ۤۜܽ;-><init>(I)V

    move-object/from16 v3, p3

    .line 106
    invoke-virtual {v4, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    const/16 v3, 0xb

    new-array v5, v3, [B

    .line 212
    invoke-virtual {v2, v3, v5}, Ll/۬ۜܽ;->֫(I[B)V

    const/4 v6, 0x0

    .line 44
    invoke-virtual {v4, v5, v6, v3}, Ll/ۤۜܽ;->write([BII)V

    .line 109
    invoke-virtual {v2}, Ll/۬ۜܽ;->ܳ()Z

    .line 91
    invoke-virtual {v4, v6}, Ll/ۤۜܽ;->writeByte(I)V

    .line 110
    invoke-virtual {v2}, Ll/۬ۜܽ;->available()J

    move-result-wide v7

    long-to-int v3, v7

    .line 211
    new-array v5, v3, [B

    .line 212
    invoke-virtual {v2, v3, v5}, Ll/۬ۜܽ;->֫(I[B)V

    .line 44
    invoke-virtual {v4, v5, v6, v3}, Ll/ۤۜܽ;->write([BII)V

    .line 111
    invoke-virtual {v4}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v3

    :cond_0
    move-object v13, v3

    .line 113
    new-instance v2, Ll/ۗ֫ܿ;

    or-int/lit8 v16, v1, 0x5

    iget v7, v0, Ll/ۗ֫ܿ;->ۖ:I

    iget-boolean v8, v0, Ll/ۗ֫ܿ;->ܺ:Z

    iget-boolean v9, v0, Ll/ۗ֫ܿ;->֫:Z

    iget-boolean v10, v0, Ll/ۗ֫ܿ;->ܳ:Z

    const/4 v11, -0x1

    const/4 v12, -0x1

    iget-object v14, v0, Ll/ۗ֫ܿ;->ۧ:[B

    iget-object v15, v0, Ll/ۗ֫ܿ;->ܿ:[B

    move-object v4, v2

    move/from16 v5, p1

    move/from16 v6, p2

    invoke-direct/range {v4 .. v16}, Ll/ۗ֫ܿ;-><init>(IIIZZZII[B[B[BI)V

    return-object v2

    .line 100
    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Reload requires a captured current view config"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫(Ll/ۗ֫ܿ;)Ll/ۗ֫ܿ;
    .locals 14

    .line 87
    iget v0, p1, Ll/ۗ֫ܿ;->᩻:I

    const/4 v1, 0x3

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    .line 91
    iget v0, p0, Ll/ۗ֫ܿ;->ۡ:I

    iget-object v1, p0, Ll/ۗ֫ܿ;->ܽ:Ll/۬ܰᩳ;

    if-eqz v1, :cond_0

    iget v1, v1, Ll/۬ܰᩳ;->ۖ:F

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    if-lez v3, :cond_0

    iget-object v3, p1, Ll/ۗ֫ܿ;->ܽ:Ll/۬ܰᩳ;

    iget v3, v3, Ll/۬ܰᩳ;->ۖ:F

    cmpl-float v2, v3, v2

    if-lez v2, :cond_0

    int-to-double v4, v0

    float-to-double v0, v1

    div-double/2addr v4, v0

    float-to-double v0, v3

    mul-double v4, v4, v0

    .line 92
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    :cond_0
    move v3, v0

    .line 93
    new-instance v0, Ll/ۗ֫ܿ;

    iget v4, p1, Ll/ۗ֫ܿ;->ۖ:I

    iget-boolean v5, p1, Ll/ۗ֫ܿ;->ܺ:Z

    iget-boolean v6, p1, Ll/ۗ֫ܿ;->֫:Z

    iget-boolean v7, p1, Ll/ۗ֫ܿ;->ܳ:Z

    iget-object v10, p1, Ll/ۗ֫ܿ;->ᩳ:[B

    iget p1, p0, Ll/ۗ֫ܿ;->᩻:I

    or-int/lit8 v13, p1, 0x3

    iget v2, p0, Ll/ۗ֫ܿ;->ۢ:I

    iget v8, p0, Ll/ۗ֫ܿ;->᩷:I

    iget v9, p0, Ll/ۗ֫ܿ;->ۜ:I

    iget-object v11, p0, Ll/ۗ֫ܿ;->ۧ:[B

    iget-object v12, p0, Ll/ۗ֫ܿ;->ܿ:[B

    move-object v1, v0

    invoke-direct/range {v1 .. v13}, Ll/ۗ֫ܿ;-><init>(IIIZZZII[B[B[BI)V

    return-object v0

    .line 88
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Page switch requires captured current view settings"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 4

    const v0, 0x32565745

    .line 159
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    iget v1, p0, Ll/ۗ֫ܿ;->᩻:I

    const/16 v2, 0x1f

    if-ne v1, v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    if-eq v1, v2, :cond_1

    .line 160
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 161
    :cond_1
    iget v1, p0, Ll/ۗ֫ܿ;->ۢ:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    iget v1, p0, Ll/ۗ֫ܿ;->ۡ:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    iget v1, p0, Ll/ۗ֫ܿ;->ۖ:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 162
    iget-boolean v1, p0, Ll/ۗ֫ܿ;->ܺ:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    iget-boolean v1, p0, Ll/ۗ֫ܿ;->֫:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    iget-boolean v1, p0, Ll/ۗ֫ܿ;->ܳ:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 163
    iget v1, p0, Ll/ۗ֫ܿ;->᩷:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    iget v1, p0, Ll/ۗ֫ܿ;->ۜ:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 164
    iget-object v1, p0, Ll/ۗ֫ܿ;->ᩳ:[B

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ۧ([B)V

    iget-object v1, p0, Ll/ۗ֫ܿ;->ۧ:[B

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ۧ([B)V

    iget-object v1, p0, Ll/ۗ֫ܿ;->ܿ:[B

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ۧ([B)V

    .line 165
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method public final ֫(Ll/᩹۟ᩳ;Ll/᩹۟ᩳ;)V
    .locals 3

    .line 174
    iget v0, p0, Ll/ۗ֫ܿ;->᩻:I

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    new-instance v1, Ll/۬ۜܽ;

    iget-object v2, p0, Ll/ۗ֫ܿ;->ۧ:[B

    invoke-direct {v1, v2}, Ll/۬ۜܽ;-><init>([B)V

    invoke-virtual {p1, v1}, Ll/᩹۟ᩳ;->֫(Ll/۬ۜܽ;)V

    :cond_0
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_1

    .line 175
    new-instance p1, Ll/۬ۜܽ;

    iget-object v0, p0, Ll/ۗ֫ܿ;->ܿ:[B

    invoke-direct {p1, v0}, Ll/۬ۜܽ;-><init>([B)V

    invoke-virtual {p2, p1}, Ll/᩹۟ᩳ;->֫(Ll/۬ۜܽ;)V

    :cond_1
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ۗ֫ܿ;
    .locals 18

    move-object/from16 v0, p0

    .line 77
    iget v1, v0, Ll/ۗ֫ܿ;->᩻:I

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    return-object v0

    .line 78
    :cond_0
    new-instance v1, Ll/۬ۜܽ;

    iget-object v2, v0, Ll/ۗ֫ܿ;->ᩳ:[B

    invoke-direct {v1, v2}, Ll/۬ۜܽ;-><init>([B)V

    invoke-virtual {v1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    .line 79
    new-instance v3, Ll/ۤۜܽ;

    array-length v2, v2

    add-int/lit8 v2, v2, 0x8

    invoke-direct {v3, v2}, Ll/ۤۜܽ;-><init>(I)V

    move-object/from16 v2, p1

    .line 80
    invoke-virtual {v3, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Ll/۬ۜܽ;->available()J

    move-result-wide v4

    long-to-int v2, v4

    .line 211
    new-array v4, v2, [B

    .line 212
    invoke-virtual {v1, v2, v4}, Ll/۬ۜܽ;->֫(I[B)V

    const/4 v1, 0x0

    .line 44
    invoke-virtual {v3, v4, v1, v2}, Ll/ۤۜܽ;->write([BII)V

    .line 81
    new-instance v1, Ll/ۗ֫ܿ;

    .line 82
    invoke-virtual {v3}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v14

    iget-object v2, v0, Ll/ۗ֫ܿ;->ܿ:[B

    iget v3, v0, Ll/ۗ֫ܿ;->᩻:I

    iget v6, v0, Ll/ۗ֫ܿ;->ۢ:I

    iget v7, v0, Ll/ۗ֫ܿ;->ۡ:I

    iget v8, v0, Ll/ۗ֫ܿ;->ۖ:I

    iget-boolean v9, v0, Ll/ۗ֫ܿ;->ܺ:Z

    iget-boolean v10, v0, Ll/ۗ֫ܿ;->֫:Z

    iget-boolean v11, v0, Ll/ۗ֫ܿ;->ܳ:Z

    iget v12, v0, Ll/ۗ֫ܿ;->᩷:I

    iget v13, v0, Ll/ۗ֫ܿ;->ۜ:I

    iget-object v15, v0, Ll/ۗ֫ܿ;->ۧ:[B

    move-object v5, v1

    move-object/from16 v16, v2

    move/from16 v17, v3

    invoke-direct/range {v5 .. v17}, Ll/ۗ֫ܿ;-><init>(IIIZZZII[B[B[BI)V

    return-object v1
.end method

.method public final ۧ()Z
    .locals 2

    .line 125
    iget v0, p0, Ll/ۗ֫ܿ;->᩻:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 126
    iget v0, p0, Ll/ۗ֫ܿ;->᩻:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
