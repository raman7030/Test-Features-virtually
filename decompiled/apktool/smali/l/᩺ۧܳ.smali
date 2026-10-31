.class public final Ll/᩺ۧܳ;
.super Ljava/lang/Object;
.source "D70T"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/nio/channels/FileChannel;

.field public volatile ܳ:Z

.field public final ܽ:Ll/ܿܽܳ;

.field public final ܿ:Ljava/util/TreeMap;

.field public final ᩳ:Ljava/io/RandomAccessFile;

.field public ᩻:J


# direct methods
.method public constructor <init>(Ljava/io/RandomAccessFile;Ll/ܿܽܳ;)V
    .locals 1

    .line 5955
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5949
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Ll/᩺ۧܳ;->ܿ:Ljava/util/TreeMap;

    const/4 v0, 0x1

    .line 5952
    iput-boolean v0, p0, Ll/᩺ۧܳ;->ܳ:Z

    .line 5956
    iput-object p1, p0, Ll/᩺ۧܳ;->ᩳ:Ljava/io/RandomAccessFile;

    .line 5957
    invoke-static {p1}, Ll/ᩴۖܽ;->֫(Ljava/io/RandomAccessFile;)Ljava/nio/channels/FileChannel;

    move-result-object p1

    iput-object p1, p0, Ll/᩺ۧܳ;->ۧ:Ljava/nio/channels/FileChannel;

    .line 5958
    iput-object p2, p0, Ll/᩺ۧܳ;->ܽ:Ll/ܿܽܳ;

    return-void
.end method

.method private ֫(Ljava/util/Map$Entry;I)Ll/ۖۧܳ;
    .locals 9

    .line 6077
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 6078
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 6079
    iget-object p1, p0, Ll/᩺ۧܳ;->ܿ:Ljava/util/TreeMap;

    invoke-virtual {p1, v0}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    int-to-long v5, p2

    cmp-long v0, v3, v5

    if-lez v0, :cond_0

    add-long v7, v1, v5

    .line 6081
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6083
    :cond_0
    iget p1, p0, Ll/᩺ۧܳ;->֫:I

    const v0, 0x7fffffff

    if-eq p1, v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/᩺ۧܳ;->֫:I

    .line 6084
    new-instance p1, Ll/ۖۧܳ;

    invoke-direct {p1, p2, v1, v2, p0}, Ll/ۖۧܳ;-><init>(IJLl/᩺ۧܳ;)V

    return-object p1

    .line 0
    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public static ֫(Ljava/io/File;)Ll/᩺ۧܳ;
    .locals 5

    .line 5963
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "hex-clipboard-arena-"

    const-string v1, ".tmp"

    .line 5966
    invoke-static {v0, v1, p0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x0

    .line 5971
    :try_start_0
    invoke-static {}, Ll/ܳܽܳ;->ۧ()Ll/ܿܽܳ;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_6

    .line 5972
    :try_start_1
    new-instance v2, Ljava/io/RandomAccessFile;

    const-string v3, "rw"

    invoke-direct {v2, p0, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3

    .line 5973
    :try_start_2
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5976
    new-instance v0, Ll/᩺ۧܳ;

    invoke-direct {v0, v2, v1}, Ll/᩺ۧܳ;-><init>(Ljava/io/RandomAccessFile;Ll/ܿܽܳ;)V

    return-object v0

    .line 5974
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Could not unlink hex clipboard arena file"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    move-object v4, v1

    move-object v1, v0

    move-object v0, v2

    move-object v2, v4

    goto :goto_3

    :catch_3
    move-exception v2

    goto :goto_1

    :catch_4
    move-exception v2

    goto :goto_1

    :catch_5
    move-exception v2

    :goto_1
    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    goto :goto_3

    :catch_6
    move-exception v1

    goto :goto_2

    :catch_7
    move-exception v1

    goto :goto_2

    :catch_8
    move-exception v1

    :goto_2
    move-object v2, v0

    :goto_3
    if-eqz v0, :cond_1

    .line 5980
    :try_start_3
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_9

    goto :goto_4

    :catch_9
    move-exception v0

    .line 5982
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_4
    if-eqz v2, :cond_2

    .line 5986
    invoke-virtual {v2}, Ll/ܿܽܳ;->close()V

    .line 5988
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    if-nez p0, :cond_3

    .line 5989
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Could not delete hex clipboard arena file"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 5992
    :cond_3
    throw v1

    .line 5964
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Hex clipboard cache directory is unavailable"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(JJ)V
    .locals 16

    add-long v0, p1, p3

    xor-long v2, p1, p3

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    cmp-long v7, v2, v5

    if-gez v7, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    xor-long v7, p1, v0

    cmp-long v3, v7, v5

    if-ltz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    or-int/2addr v2, v3

    if-eqz v2, :cond_c

    .line 6147
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v7, v3, Ll/᩺ۧܳ;->ܿ:Ljava/util/TreeMap;

    invoke-virtual {v7, v2}, Ljava/util/TreeMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const-string v8, "Overlapping hex clipboard free block"

    if-eqz v2, :cond_6

    .line 6149
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Long;

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    add-long v13, v9, v11

    xor-long/2addr v11, v9

    cmp-long v15, v11, v5

    if-gez v15, :cond_2

    const/4 v11, 0x1

    goto :goto_2

    :cond_2
    const/4 v11, 0x0

    :goto_2
    xor-long/2addr v9, v13

    cmp-long v12, v9, v5

    if-ltz v12, :cond_3

    const/4 v9, 0x1

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    :goto_3
    or-int/2addr v9, v11

    if-eqz v9, :cond_5

    cmp-long v9, v13, p1

    if-gtz v9, :cond_4

    if-nez v9, :cond_6

    .line 6154
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 6155
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 6151
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 0
    :cond_5
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_6
    move-wide/from16 v9, p1

    .line 6158
    :goto_4
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/util/TreeMap;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 6160
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Long;

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    cmp-long v13, v11, v0

    if-ltz v13, :cond_a

    .line 6163
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    cmp-long v8, v11, v0

    if-nez v8, :cond_b

    .line 6164
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    add-long v13, v0, v11

    xor-long/2addr v11, v0

    cmp-long v8, v11, v5

    if-gez v8, :cond_7

    const/4 v8, 0x1

    goto :goto_5

    :cond_7
    const/4 v8, 0x0

    :goto_5
    xor-long/2addr v0, v13

    cmp-long v11, v0, v5

    if-ltz v11, :cond_8

    const/4 v4, 0x1

    :cond_8
    or-int v0, v8, v4

    if-eqz v0, :cond_9

    .line 6165
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-wide v0, v13

    goto :goto_6

    .line 0
    :cond_9
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 6161
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6168
    :cond_b
    :goto_6
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sub-long/2addr v0, v9

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v2, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_c
    move-object/from16 v3, p0

    .line 0
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0
.end method

.method public static bridge synthetic ֫(Ll/᩺ۧܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩺ۧܳ;->ܳ:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩺ۧܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩺ۧܳ;->᩻:J

    return-wide v0
.end method

.method private ۧ()V
    .locals 1

    .line 6202
    iget-boolean v0, p0, Ll/᩺ۧܳ;->ܳ:Z

    if-eqz v0, :cond_0

    return-void

    .line 6203
    :cond_0
    new-instance v0, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {v0}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw v0
.end method

.method public static ܽ()V
    .locals 2

    .line 6208
    invoke-static {}, Ll/ᩳܽܳ;->ۙ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 6209
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Hex clipboard arena lock is not held"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ᩳ()V
    .locals 9

    .line 6173
    iget-wide v0, p0, Ll/᩺ۧܳ;->᩻:J

    .line 6174
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    const-wide/16 v3, 0x1

    add-long/2addr v3, v0

    .line 6176
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v4, p0, Ll/᩺ۧܳ;->ܿ:Ljava/util/TreeMap;

    invoke-virtual {v4, v3}, Ljava/util/TreeMap;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 6177
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    add-long/2addr v7, v5

    cmp-long v5, v7, v0

    if-eqz v5, :cond_0

    goto :goto_1

    .line 6180
    :cond_0
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6181
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    .line 6183
    :cond_1
    :goto_1
    iget-wide v5, p0, Ll/᩺ۧܳ;->᩻:J

    cmp-long v3, v0, v5

    if-nez v3, :cond_2

    return-void

    .line 6186
    :cond_2
    iget-object v3, p0, Ll/᩺ۧܳ;->ۧ:Ljava/nio/channels/FileChannel;

    invoke-virtual {v3, v0, v1}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 6187
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    .line 6188
    invoke-virtual {v4, v3}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 6190
    :cond_3
    iput-wide v0, p0, Ll/᩺ۧܳ;->᩻:J

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۖۧܳ;
    .locals 11

    .line 5998
    invoke-static {}, Ll/᩺ۧܳ;->ܽ()V

    .line 5999
    invoke-direct {p0}, Ll/᩺ۧܳ;->ۧ()V

    .line 6001
    iget-object v0, p0, Ll/᩺ۧܳ;->ܿ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 6002
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    int-to-long v4, p1

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 6010
    invoke-direct {p0, v1, p1}, Ll/᩺ۧܳ;->֫(Ljava/util/Map$Entry;I)Ll/ۖۧܳ;

    move-result-object p1

    return-object p1

    .line 6012
    :cond_2
    iget-wide v0, p0, Ll/᩺ۧܳ;->᩻:J

    int-to-long v2, p1

    add-long v4, v0, v2

    xor-long/2addr v2, v0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    cmp-long v9, v2, v7

    if-gez v9, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    xor-long v9, v0, v4

    cmp-long v3, v9, v7

    if-ltz v3, :cond_4

    const/4 v6, 0x1

    :cond_4
    or-int/2addr v2, v6

    if-eqz v2, :cond_7

    const-wide v2, 0x8bffffffL

    cmp-long v6, v4, v2

    if-gtz v6, :cond_6

    .line 6022
    iput-wide v4, p0, Ll/᩺ۧܳ;->᩻:J

    .line 6024
    iget v2, p0, Ll/᩺ۧܳ;->֫:I

    const v3, 0x7fffffff

    if-eq v2, v3, :cond_5

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/᩺ۧܳ;->֫:I

    .line 6025
    new-instance v2, Ll/ۖۧܳ;

    invoke-direct {v2, p1, v0, v1, p0}, Ll/ۖۧܳ;-><init>(IJLl/᩺ۧܳ;)V

    return-object v2

    .line 0
    :cond_5
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 6020
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Hex clipboard shared arena exceeds storage limit"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 0
    :cond_7
    :try_start_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 6017
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Hex clipboard arena offset overflow"

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫(IJ)Ll/ۖۧܳ;
    .locals 7

    .line 6031
    invoke-static {}, Ll/᩺ۧܳ;->ܽ()V

    .line 6032
    invoke-direct {p0}, Ll/᩺ۧܳ;->ۧ()V

    .line 6033
    iget-object v0, p0, Ll/᩺ۧܳ;->ܿ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 6034
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v4, v2, p2

    if-ltz v4, :cond_1

    goto :goto_0

    .line 6037
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    int-to-long v4, p1

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    .line 6038
    invoke-direct {p0, v1, p1}, Ll/᩺ۧܳ;->֫(Ljava/util/Map$Entry;I)Ll/ۖۧܳ;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(J[BII)V
    .locals 0

    .line 6127
    invoke-direct {p0}, Ll/᩺ۧܳ;->ۧ()V

    .line 6128
    invoke-static {p3, p4, p5}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 6130
    :goto_0
    invoke-virtual {p3}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p4

    if-eqz p4, :cond_2

    .line 6131
    iget-object p4, p0, Ll/᩺ۧܳ;->ۧ:Ljava/nio/channels/FileChannel;

    invoke-virtual {p4, p3, p1, p2}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I

    move-result p4

    if-ltz p4, :cond_1

    if-nez p4, :cond_0

    .line 6136
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    :cond_0
    int-to-long p4, p4

    add-long/2addr p1, p4

    goto :goto_0

    .line 6133
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Unexpected end of hex clipboard arena"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final ֫()Z
    .locals 6

    .line 6063
    invoke-static {}, Ll/᩺ۧܳ;->ܽ()V

    .line 6065
    iget-object v0, p0, Ll/᩺ۧܳ;->ܿ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 6066
    invoke-static {v1, v2, v3, v4}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    const-wide/32 v3, 0x2000000

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(J[BII)V
    .locals 0

    .line 6112
    invoke-direct {p0}, Ll/᩺ۧܳ;->ۧ()V

    .line 6113
    invoke-static {p3, p4, p5}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 6115
    :goto_0
    invoke-virtual {p3}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p4

    if-eqz p4, :cond_1

    .line 6116
    iget-object p4, p0, Ll/᩺ۧܳ;->ۧ:Ljava/nio/channels/FileChannel;

    invoke-virtual {p4, p3, p1, p2}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;J)I

    move-result p4

    if-nez p4, :cond_0

    .line 6118
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    :cond_0
    int-to-long p4, p4

    add-long/2addr p1, p4

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ(IJ)Z
    .locals 6

    .line 6046
    invoke-static {}, Ll/᩺ۧܳ;->ܽ()V

    .line 6047
    iget-boolean v0, p0, Ll/᩺ۧܳ;->ܳ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 6050
    :cond_0
    iget-object v0, p0, Ll/᩺ۧܳ;->ܿ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 6051
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v4, v2, p2

    if-ltz v4, :cond_2

    goto :goto_0

    .line 6054
    :cond_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    int-to-long v3, p1

    cmp-long v5, v1, v3

    if-ltz v5, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(IJ)V
    .locals 3

    .line 6089
    invoke-static {}, Ll/ᩳܽܳ;->ۙ()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 6090
    :try_start_0
    invoke-direct {p0}, Ll/᩺ۧܳ;->ۧ()V

    .line 6091
    iget v1, p0, Ll/᩺ۧܳ;->֫:I

    if-lez v1, :cond_2

    add-int/lit8 v1, v1, -0x1

    .line 6094
    iput v1, p0, Ll/᩺ۧܳ;->֫:I

    if-nez v1, :cond_1

    const/4 p1, 0x0

    .line 6096
    iput-boolean p1, p0, Ll/᩺ۧܳ;->ܳ:Z

    .line 6097
    iget-object p1, p0, Ll/᩺ۧܳ;->ܿ:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ljava/util/TreeMap;->clear()V

    const-wide/16 p1, 0x0

    .line 6098
    iput-wide p1, p0, Ll/᩺ۧܳ;->᩻:J

    .line 6099
    invoke-static {}, Ll/ᩳܽܳ;->ۗ()Ll/᩺ۧܳ;

    move-result-object p1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x0

    .line 6100
    invoke-static {p1}, Ll/ᩳܽܳ;->֫(Ll/᩺ۧܳ;)V

    .line 6195
    :cond_0
    iget-object p1, p0, Ll/᩺ۧܳ;->ܽ:Ll/ܿܽܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p2, p0, Ll/᩺ۧܳ;->ᩳ:Ljava/io/RandomAccessFile;

    invoke-virtual {p2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6197
    :try_start_2
    invoke-virtual {p1}, Ll/ܿܽܳ;->close()V

    .line 6103
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p2

    .line 6197
    invoke-virtual {p1}, Ll/ܿܽܳ;->close()V

    .line 6198
    throw p2

    :cond_1
    int-to-long v1, p1

    .line 6105
    invoke-direct {p0, p2, p3, v1, v2}, Ll/᩺ۧܳ;->֫(JJ)V

    .line 6106
    invoke-direct {p0}, Ll/᩺ۧܳ;->ᩳ()V

    .line 6107
    monitor-exit v0

    return-void

    .line 6092
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Hex clipboard arena allocation underflow"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 6107
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method
