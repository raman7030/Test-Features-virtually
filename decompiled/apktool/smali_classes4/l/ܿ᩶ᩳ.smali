.class public final Ll/ܿ᩶ᩳ;
.super Ljava/lang/Object;
.source "V6SW"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/ۚ۬ᩳ;

.field public final ۙ:J

.field public final ᩶:[B

.field public ᩸:Z

.field public final ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;IILl/ۚ۬ᩳ;)V
    .locals 4

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/ܿ᩶ᩳ;->᩹:Ljava/util/ArrayList;

    .line 31
    iput-object p4, p0, Ll/ܿ᩶ᩳ;->ۗ:Ll/ۚ۬ᩳ;

    .line 32
    new-instance p4, Ll/ۤۜܽ;

    const/16 v0, 0x14

    invoke-direct {p4, v0}, Ll/ۤۜܽ;-><init>(I)V

    const v0, 0x4d324153    # 1.86914096E8f

    .line 33
    invoke-virtual {p4, v0}, Ll/ۤۜܽ;->writeInt(I)V

    if-gez p3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    invoke-virtual {p4, v0}, Ll/ۤۜܽ;->writeInt(I)V

    invoke-virtual {p4, p2}, Ll/ۤۜܽ;->writeInt(I)V

    if-ltz p3, :cond_1

    .line 34
    invoke-virtual {p4, p3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 35
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-virtual {p4, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 36
    invoke-virtual {p4}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p2

    iput-object p2, p0, Ll/ܿ᩶ᩳ;->᩶:[B

    .line 37
    array-length p2, p2

    int-to-long p2, p2

    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/ܽ᩶ᩳ;

    .line 176
    iget-object v0, p4, Ll/ܽ᩶ᩳ;->ۧ:Ll/ۢ᩶ᩳ;

    if-nez v0, :cond_2

    iget-object p4, p4, Ll/ܽ᩶ᩳ;->֫:[B

    array-length p4, p4

    int-to-long v0, p4

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ll/ۢ᩶ᩳ;->֫()J

    move-result-wide v0

    :goto_2
    const-wide/16 v2, 0xc

    add-long/2addr v0, v2

    add-long/2addr p2, v0

    goto :goto_1

    :cond_3
    const-wide/32 v0, 0x7fffffff

    cmp-long p1, p2, v0

    if-gtz p1, :cond_4

    .line 40
    iput-wide p2, p0, Ll/ܿ᩶ᩳ;->ۙ:J

    return-void

    .line 39
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Legacy app state exceeds size limit"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/ۡ᩶ᩳ;II[BLl/֨۬ᩳ;)Ll/ܿ᩶ᩳ;
    .locals 5

    if-ltz p2, :cond_2

    int-to-long v0, p1

    int-to-long v2, p2

    add-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    if-ltz p1, :cond_1

    if-nez p3, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 64
    :cond_0
    array-length v0, p3

    :goto_0
    int-to-long v0, v0

    const-wide/16 v2, 0x4000

    add-long/2addr v0, v2

    invoke-virtual {p4, v0, v1}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object p4

    .line 66
    :try_start_0
    invoke-static {p0, p1, p2, p3, p4}, Ll/ܿ᩶ᩳ;->֫(Ll/ۡ᩶ᩳ;II[BLl/ۚ۬ᩳ;)Ll/ܿ᩶ᩳ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    .line 67
    :goto_1
    invoke-virtual {p4}, Ll/ۚ۬ᩳ;->close()V

    throw p0

    .line 63
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid legacy page prefix"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 57
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid legacy page length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۡ᩶ᩳ;II[BLl/ۚ۬ᩳ;)Ll/ܿ᩶ᩳ;
    .locals 4

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    new-instance v1, Ll/ܽ᩶ᩳ;

    const/16 v2, 0x100

    invoke-virtual {p0}, Ll/ۡ᩶ᩳ;->ۜ()Ll/ۢ᩶ᩳ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/ܽ᩶ᩳ;-><init>(ILl/ۢ᩶ᩳ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0xff

    if-ge v1, v2, :cond_2

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_1

    .line 75
    :cond_0
    invoke-virtual {p0, v1}, Ll/ۡ᩶ᩳ;->֫(I)Ll/ۢ᩶ᩳ;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 76
    new-instance v3, Ll/ܽ᩶ᩳ;

    invoke-direct {v3, v1, v2}, Ll/ܽ᩶ᩳ;-><init>(ILl/ۢ᩶ᩳ;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {p0}, Ll/ۡ᩶ᩳ;->֫()Ll/ۢ᩶ᩳ;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v1, Ll/ܽ᩶ᩳ;

    const/16 v2, 0x103

    invoke-virtual {p0}, Ll/ۡ᩶ᩳ;->֫()Ll/ۢ᩶ᩳ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/ܽ᩶ᩳ;-><init>(ILl/ۢ᩶ᩳ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    :cond_3
    invoke-virtual {p0}, Ll/ۡ᩶ᩳ;->ܳ()Ll/ۢ᩶ᩳ;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v1, Ll/ܽ᩶ᩳ;

    const/16 v2, 0x104

    invoke-virtual {p0}, Ll/ۡ᩶ᩳ;->ܳ()Ll/ۢ᩶ᩳ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/ܽ᩶ᩳ;-><init>(ILl/ۢ᩶ᩳ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    :cond_4
    new-instance v1, Ll/ܽ᩶ᩳ;

    const/16 v2, 0x101

    invoke-virtual {p0}, Ll/ۡ᩶ᩳ;->ۘ()Ll/ۢ᩶ᩳ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/ܽ᩶ᩳ;-><init>(ILl/ۢ᩶ᩳ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    new-instance v1, Ll/ܽ᩶ᩳ;

    const/16 v2, 0x102

    invoke-virtual {p0}, Ll/ۡ᩶ᩳ;->ۖ()Ll/ۢ᩶ᩳ;

    move-result-object p0

    invoke-direct {v1, v2, p0}, Ll/ܽ᩶ᩳ;-><init>(ILl/ۢ᩶ᩳ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_5

    .line 82
    new-instance p0, Ll/ܽ᩶ᩳ;

    invoke-virtual {p3}, [B->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [B

    invoke-direct {p0, p3}, Ll/ܽ᩶ᩳ;-><init>([B)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    :cond_5
    new-instance p0, Ll/ܿ᩶ᩳ;

    invoke-direct {p0, v0, p1, p2, p4}, Ll/ܿ᩶ᩳ;-><init>(Ljava/util/ArrayList;IILl/ۚ۬ᩳ;)V

    return-object p0
.end method

.method public static ֫(Ljava/io/InputStream;JLl/֨۬ᩳ;Ll/ᩳ᩶ᩳ;)V
    .locals 18

    move-wide/from16 v0, p1

    move-object/from16 v2, p4

    const-wide/16 v3, 0x4000

    move-object/from16 v5, p3

    .line 127
    :try_start_0
    invoke-virtual {v5, v3, v4}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const-wide/16 v4, 0x10

    cmp-long v6, v0, v4

    if-ltz v6, :cond_b

    const-wide/32 v4, 0x7fffffff

    cmp-long v6, v0, v4

    if-gtz v6, :cond_b

    .line 130
    :try_start_1
    new-instance v6, Ll/ۧ᩶ᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v7, p0

    :try_start_2
    invoke-direct {v6, v0, v1, v7}, Ll/ۧ᩶ᩳ;-><init>(JLjava/io/InputStream;)V

    .line 131
    invoke-virtual {v6}, Ll/ۧ᩶ᩳ;->֫()I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const v1, 0x4d324153    # 1.86914096E8f

    const-string v8, "Unsupported legacy app state"

    if-ne v0, v1, :cond_a

    .line 132
    :try_start_3
    invoke-virtual {v6}, Ll/ۧ᩶ᩳ;->֫()I

    move-result v0

    const/4 v1, 0x2

    const/4 v9, 0x1

    if-eq v0, v9, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 133
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :cond_1
    :goto_0
    invoke-virtual {v6}, Ll/ۧ᩶ᩳ;->֫()I

    move-result v8

    if-ne v0, v1, :cond_2

    invoke-virtual {v6}, Ll/ۧ᩶ᩳ;->֫()I

    move-result v10

    goto :goto_1

    :cond_2
    const/4 v10, -0x1

    :goto_1
    invoke-virtual {v6}, Ll/ۧ᩶ᩳ;->֫()I

    move-result v11

    if-ltz v8, :cond_9

    const/4 v12, 0x3

    if-lt v11, v12, :cond_9

    const/16 v13, 0x103

    if-gt v11, v13, :cond_9

    int-to-long v13, v11

    const-wide/16 v15, 0xc

    mul-long v13, v13, v15

    .line 135
    iget-wide v4, v6, Ll/ۧ᩶ᩳ;->᩶:J

    cmp-long v17, v13, v4

    if-gtz v17, :cond_9

    if-ne v0, v1, :cond_4

    if-ltz v10, :cond_3

    int-to-long v0, v8

    int-to-long v4, v10

    add-long/2addr v0, v4

    const-wide/32 v4, 0x7fffffff

    cmp-long v13, v0, v4

    if-gtz v13, :cond_3

    goto :goto_2

    .line 136
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid legacy app page range"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 137
    :cond_4
    :goto_2
    invoke-interface {v2, v8, v10}, Ll/ᩳ᩶ᩳ;->֫(II)V

    const/16 v0, 0x106

    new-array v0, v0, [Z

    const/16 v1, 0x2000

    new-array v1, v1, [B

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v11, :cond_7

    .line 141
    invoke-virtual {v6}, Ll/ۧ᩶ᩳ;->֫()I

    move-result v8

    const-wide/16 v13, 0x0

    const/16 v10, 0x8

    .line 211
    invoke-virtual {v6, v10}, Ll/ۧ᩶ᩳ;->֫(I)Ll/۬ۜܽ;

    move-result-object v10

    move v15, v5

    invoke-virtual {v10}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v4

    if-lt v8, v9, :cond_6

    const/4 v9, 0x1

    const/16 v10, 0x105

    if-gt v8, v10, :cond_6

    if-eq v8, v12, :cond_6

    const/16 v10, 0xff

    if-eq v8, v10, :cond_6

    .line 143
    aget-boolean v10, v0, v8

    if-nez v10, :cond_6

    cmp-long v10, v4, v13

    if-ltz v10, :cond_6

    iget-wide v12, v6, Ll/ۧ᩶ᩳ;->᩶:J

    cmp-long v10, v4, v12

    if-gtz v10, :cond_6

    .line 145
    aput-boolean v9, v0, v8

    .line 146
    new-instance v9, Ll/ۧ᩶ᩳ;

    invoke-direct {v9, v4, v5, v6}, Ll/ۧ᩶ᩳ;-><init>(JLjava/io/InputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 147
    :try_start_4
    invoke-interface {v2, v8, v4, v5, v9}, Ll/ᩳ᩶ᩳ;->֫(IJLjava/io/InputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v4, 0x0

    .line 148
    :try_start_5
    iput-boolean v4, v9, Ll/ۧ᩶ᩳ;->᩸:Z

    .line 150
    iget-wide v4, v9, Ll/ۧ᩶ᩳ;->᩶:J

    const-wide/16 v8, 0x0

    :goto_4
    cmp-long v10, v4, v8

    if-eqz v10, :cond_5

    const/16 v10, 0x2000

    int-to-long v12, v10

    .line 151
    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    long-to-int v10, v12

    const/4 v12, 0x0

    invoke-virtual {v6, v1, v12, v10}, Ll/ۧ᩶ᩳ;->read([BII)I

    move-result v10

    int-to-long v12, v10

    sub-long/2addr v4, v12

    goto :goto_4

    :cond_5
    add-int/lit8 v5, v15, 0x1

    const/4 v9, 0x1

    const/4 v12, 0x3

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v1, v0

    const/4 v2, 0x0

    .line 148
    iput-boolean v2, v9, Ll/ۧ᩶ᩳ;->᩸:Z

    throw v1

    .line 144
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid legacy app state field"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const-wide/16 v1, 0x0

    const/16 v4, 0x100

    .line 153
    aget-boolean v4, v0, v4

    if-eqz v4, :cond_8

    const/16 v4, 0x101

    aget-boolean v4, v0, v4

    if-eqz v4, :cond_8

    const/16 v4, 0x102

    aget-boolean v0, v0, v4

    if-eqz v0, :cond_8

    iget-wide v4, v6, Ll/ۧ᩶ᩳ;->᩶:J

    cmp-long v0, v4, v1

    if-nez v0, :cond_8

    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->read()I

    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    .line 156
    :try_start_6
    invoke-virtual {v3}, Ll/ۚ۬ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->close()V

    return-void

    .line 154
    :cond_8
    :try_start_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete or trailing legacy app state fields"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 135
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid legacy app state header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 131
    :cond_a
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    move-object/from16 v7, p0

    goto :goto_5

    :cond_b
    move-object/from16 v7, p0

    .line 129
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid legacy app state length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    :goto_5
    move-object v1, v0

    .line 127
    :try_start_8
    invoke-virtual {v3}, Ll/ۚ۬ᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v2, v0

    :try_start_9
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_4
    move-exception v0

    goto :goto_7

    :catchall_5
    move-exception v0

    move-object/from16 v7, p0

    :goto_7
    move-object v1, v0

    :try_start_a
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    goto :goto_8

    :catchall_6
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1
.end method

.method public static bridge synthetic ֫(Ll/ܿ᩶ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܿ᩶ᩳ;->᩸:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ܿ᩶ᩳ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩶ᩳ;->᩹:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܿ᩶ᩳ;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩶ᩳ;->᩶:[B

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 168
    iget-boolean v0, p0, Ll/ܿ᩶ᩳ;->᩸:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll/ܿ᩶ᩳ;->᩸:Z

    iget-object v0, p0, Ll/ܿ᩶ᩳ;->ۗ:Ll/ۚ۬ᩳ;

    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    :cond_0
    return-void
.end method

.method public final length()J
    .locals 2

    .line 86
    iget-wide v0, p0, Ll/ܿ᩶ᩳ;->ۙ:J

    return-wide v0
.end method

.method public final ֫()Ljava/io/InputStream;
    .locals 2

    .line 90
    iget-boolean v0, p0, Ll/ܿ᩶ᩳ;->᩸:Z

    if-nez v0, :cond_0

    .line 91
    new-instance v0, Ll/֫᩶ᩳ;

    invoke-direct {v0, p0}, Ll/֫᩶ᩳ;-><init>(Ll/ܿ᩶ᩳ;)V

    return-object v0

    .line 90
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Legacy app state source is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
