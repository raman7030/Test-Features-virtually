.class public final Ll/۬ܿܽ;
.super Ll/᩷ܿܽ;
.source "45YI"


# static fields
.field public static final synthetic ᩻:I


# instance fields
.field public ܳ:Z

.field public ܽ:Ljava/util/ArrayList;

.field public ܿ:Ljava/util/HashMap;

.field public ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۬ܿܽ;->ᩳ:Ljava/util/HashMap;

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۬ܿܽ;->ܿ:Ljava/util/HashMap;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(JLjava/lang/String;)I
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_0

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    long-to-int p1, p0

    return p1

    .line 398
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is too large: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/ۙۜܽ;I)I
    .locals 1

    if-ltz p1, :cond_1

    const/16 v0, 0x7fff

    if-gt p1, v0, :cond_1

    const/16 v0, 0x7f

    if-gt p1, v0, :cond_0

    .line 358
    invoke-interface {p0, p1}, Ll/ۙۜܽ;->writeByte(I)V

    const/4 p0, 0x1

    return p0

    :cond_0
    ushr-int/lit8 v0, p1, 0x8

    or-int/lit16 v0, v0, 0x80

    .line 361
    invoke-interface {p0, v0}, Ll/ۙۜܽ;->writeByte(I)V

    and-int/lit16 p1, p1, 0xff

    .line 362
    invoke-interface {p0, p1}, Ll/ۙۜܽ;->writeByte(I)V

    const/4 p0, 0x2

    return p0

    .line 355
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "UTF-8 string length is out of range: "

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 355
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/۫᩻ܽ;)Ll/۬ܿܽ;
    .locals 5

    .line 32
    new-instance v0, Ll/۬ܿܽ;

    invoke-direct {v0}, Ll/۬ܿܽ;-><init>()V

    .line 33
    invoke-interface {p0}, Ll/۫᩻ܽ;->֫()Z

    move-result v1

    .line 78
    iput-boolean v1, v0, Ll/۬ܿܽ;->ܳ:Z

    .line 34
    check-cast p0, Ll/᩷ܿܽ;

    invoke-virtual {p0}, Ll/᩷ܿܽ;->ۧ()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩻ܽ;

    .line 36
    invoke-interface {v1}, Ll/ۗ᩻ܽ;->᩺֫()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 38
    instance-of v2, v1, Ll/ۗܿܽ;

    if-eqz v2, :cond_0

    .line 39
    invoke-interface {v1}, Ll/ۗ᩻ܽ;->᩶֫()[Ll/᩸᩻ܽ;

    move-result-object v2

    goto :goto_1

    .line 41
    :cond_0
    invoke-interface {v1}, Ll/ۗ᩻ܽ;->ܰ֫()[Ll/᩸᩻ܽ;

    move-result-object v2

    .line 43
    :goto_1
    new-instance v3, Ll/ۗܿܽ;

    invoke-interface {v1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v2, v4}, Ll/ۗܿܽ;-><init>(Ll/۬ܿܽ;Ljava/lang/String;[Ll/᩸᩻ܽ;Z)V

    goto :goto_2

    .line 45
    :cond_1
    new-instance v3, Ll/ۗܿܽ;

    invoke-interface {v1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Ll/ۗܿܽ;-><init>(Ll/۬ܿܽ;Ljava/lang/String;)V

    .line 47
    :goto_2
    iget-object v1, v0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    invoke-virtual {v3}, Ll/ۗܿܽ;->᩺֫()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 49
    iget-object v1, v0, Ll/۬ܿܽ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v1, v3, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 51
    :cond_2
    iget-object v1, v0, Ll/۬ܿܽ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v3}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static ܽ(I)I
    .locals 2

    if-ltz p0, :cond_1

    const/16 v0, 0x7fff

    if-gt p0, v0, :cond_1

    const/16 v0, 0x7f

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0

    .line 368
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "UTF-8 string length is out of range: "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 368
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getItem(I)Ll/ۗܿܽ;
    .locals 1

    if-ltz p1, :cond_1

    .line 63
    iget-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 66
    :cond_0
    iget-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗܿܽ;

    return-object p1

    .line 64
    :cond_1
    :goto_0
    new-instance p1, Ll/ۗܿܽ;

    const-string v0, "Error!!"

    invoke-direct {p1, p0, v0}, Ll/ۗܿܽ;-><init>(Ll/۬ܿܽ;Ljava/lang/String;)V

    return-object p1
.end method

.method public final bridge synthetic getItem(I)Ll/ۗ᩻ܽ;
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Ll/۬ܿܽ;->getItem(I)Ll/ۗܿܽ;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 58
    iget-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۗܿܽ;)I
    .locals 2

    const/4 v0, 0x0

    .line 197
    :goto_0
    iget-object v1, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 198
    iget-object v1, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final declared-synchronized ֫(Ljava/lang/String;[Ll/᩸᩻ܽ;)Ll/ۗܿܽ;
    .locals 3

    move-object v0, p0

    monitor-enter v0

    if-nez p2, :cond_0

    .line 117
    :try_start_0
    invoke-virtual {p0, p1}, Ll/۬ܿܽ;->ᩳ(Ljava/lang/String;)Ll/ۗܿܽ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 118
    :cond_0
    :try_start_1
    new-instance v1, Ll/ۗܿܽ;

    const/4 v2, 0x1

    .line 22
    invoke-direct {v1, p0, p1, p2, v2}, Ll/ۗܿܽ;-><init>(Ll/۬ܿܽ;Ljava/lang/String;[Ll/᩸᩻ܽ;Z)V

    .line 119
    iget-object p1, p0, Ll/۬ܿܽ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗܿܽ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    .line 121
    monitor-exit v0

    return-object p1

    .line 123
    :cond_1
    :try_start_2
    iget-object p1, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    iget-object p1, p0, Ll/۬ܿܽ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {p1, v1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final ֫(I)Ll/ۗ᩻ܽ;
    .locals 1

    if-ltz p1, :cond_0

    .line 71
    iget-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 74
    iget-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗ᩻ܽ;

    return-object p1

    .line 72
    :cond_0
    iget-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {p1, v0}, Ll/᩹ܽܽ;->ۧ(II)Ljava/lang/IndexOutOfBoundsException;

    move-result-object p1

    throw p1
.end method

.method public final ֫(Ll/ۙۜܽ;ZLl/᩵ۛۡ;)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    if-eqz p2, :cond_0

    .line 214
    invoke-virtual/range {p0 .. p0}, Ll/۬ܿܽ;->ᩳ()V

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    .line 215
    :goto_0
    iget-object v4, v0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 216
    iget-object v4, v0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗܿܽ;

    iput v3, v4, Ll/ۗܿܽ;->᩸:I

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v3, 0x1

    .line 218
    invoke-interface {v1, v3}, Ll/ۙۜܽ;->֫(S)V

    const/16 v4, 0x1c

    .line 219
    invoke-interface {v1, v4}, Ll/ۙۜܽ;->֫(S)V

    .line 220
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v4

    .line 221
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->᩷ܽ()V

    .line 58
    iget-object v6, v0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 225
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 226
    invoke-virtual/range {p0 .. p0}, Ll/᩷ܿܽ;->ۧ()Ljava/lang/Iterable;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۗ᩻ܽ;

    .line 227
    invoke-interface {v9}, Ll/ۗ᩻ܽ;->᩺֫()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 228
    invoke-interface {v9}, Ll/ۗ᩻ܽ;->getStyle()[I

    move-result-object v9

    .line 229
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 83
    :cond_2
    iget-boolean v8, v0, Ll/۬ܿܽ;->ܳ:Z

    const/16 v9, 0x7fff

    if-eqz v8, :cond_5

    .line 237
    new-array v10, v6, [I

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v6, :cond_6

    .line 239
    invoke-virtual {v0, v11}, Ll/۬ܿܽ;->getItem(I)Ll/ۗܿܽ;

    move-result-object v12

    invoke-virtual {v12}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v12

    .line 240
    invoke-static {v12, v3}, Ll/ۛۖܽ;->֫(Ljava/lang/String;Z)J

    move-result-wide v13

    .line 241
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    if-gt v12, v9, :cond_4

    const-wide/16 v15, 0x7fff

    cmp-long v12, v13, v15

    if-lez v12, :cond_3

    goto :goto_4

    :cond_3
    long-to-int v12, v13

    .line 246
    aput v12, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    const/4 v8, 0x0

    :cond_5
    const/4 v10, 0x0

    .line 250
    :cond_6
    invoke-interface {v1, v6}, Ll/ۙۜܽ;->writeInt(I)V

    .line 251
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-interface {v1, v9}, Ll/ۙۜܽ;->writeInt(I)V

    if-eqz v8, :cond_7

    const/16 v9, 0x100

    goto :goto_5

    :cond_7
    const/4 v9, 0x0

    .line 252
    :goto_5
    invoke-interface {v1, v9}, Ll/ۙۜܽ;->writeInt(I)V

    int-to-long v11, v6

    .line 253
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v9

    int-to-long v13, v9

    add-long/2addr v13, v11

    const-wide/16 v23, 0x4

    mul-long v13, v13, v23

    const-wide/16 v15, 0x1c

    add-long/2addr v13, v15

    const-string v9, "strings offset"

    invoke-static {v13, v14, v9}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    move-result v9

    .line 255
    invoke-interface {v1, v9}, Ll/ۙۜܽ;->writeInt(I)V

    .line 257
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v13

    .line 258
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->᩷ܽ()V

    const-string v15, "string offset array size"

    mul-long v11, v11, v23

    .line 260
    invoke-static {v11, v12, v15}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    move-result v11

    invoke-interface {v1, v11}, Ll/ۙۜܽ;->skipBytes(I)V

    .line 263
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v11

    int-to-long v11, v11

    mul-long v11, v11, v23

    const-string v15, "style offset array size"

    invoke-static {v11, v12, v15}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    move-result v11

    invoke-interface {v1, v11}, Ll/ۙۜܽ;->skipBytes(I)V

    .line 266
    new-array v11, v6, [I

    const-string v12, "string offset"

    const-string v15, "string data size"

    const-wide/16 v16, 0x1

    const-wide/16 v18, 0x0

    if-eqz v8, :cond_a

    .line 269
    new-instance v3, Ll/᩸ۜۢ;

    invoke-direct {v3, v1}, Ll/᩸ۜۢ;-><init>(Ljava/lang/Object;)V

    const/4 v8, 0x0

    move-wide/from16 v25, v13

    move-wide/from16 v13, v18

    :goto_6
    if-ge v8, v6, :cond_9

    move/from16 p2, v9

    if-eqz v2, :cond_8

    const/4 v9, 0x1

    .line 41
    invoke-virtual {v2, v9}, Ll/᩵ۛۡ;->֫(I)Z

    .line 274
    :cond_8
    invoke-static {v13, v14, v12}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    move-result v9

    aput v9, v11, v8

    .line 275
    invoke-virtual {v0, v8}, Ll/۬ܿܽ;->getItem(I)Ll/ۗܿܽ;

    move-result-object v9

    .line 276
    invoke-virtual {v9}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v9

    move-wide/from16 v27, v4

    .line 277
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v4

    .line 278
    aget v5, v10, v8

    .line 279
    invoke-static {v4}, Ll/۬ܿܽ;->ܽ(I)I

    move-result v20

    invoke-static {v5}, Ll/۬ܿܽ;->ܽ(I)I

    move-result v21

    move-object/from16 v22, v10

    add-int v10, v20, v21

    move-object/from16 v29, v11

    int-to-long v10, v10

    move/from16 v20, v6

    move-object/from16 v30, v7

    int-to-long v6, v5

    add-long/2addr v10, v6

    add-long v10, v10, v16

    add-long/2addr v10, v13

    .line 280
    invoke-static {v10, v11, v15}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    .line 281
    invoke-static {v1, v4}, Ll/۬ܿܽ;->֫(Ll/ۙۜܽ;I)I

    move-result v4

    int-to-long v10, v4

    add-long/2addr v13, v10

    .line 282
    invoke-static {v1, v5}, Ll/۬ܿܽ;->֫(Ll/ۙۜܽ;I)I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v13, v4

    const/4 v4, 0x1

    .line 283
    invoke-static {v3, v9, v4}, Ll/ۛۖܽ;->֫(Ll/֫᩷ܽ;Ljava/lang/CharSequence;Z)V

    add-long/2addr v13, v6

    const/4 v4, 0x0

    .line 285
    invoke-interface {v1, v4}, Ll/ۙۜܽ;->writeByte(I)V

    add-long v13, v13, v16

    add-int/lit8 v8, v8, 0x1

    move/from16 v9, p2

    move/from16 v6, v20

    move-object/from16 v10, v22

    move-wide/from16 v4, v27

    move-object/from16 v11, v29

    move-object/from16 v7, v30

    goto :goto_6

    :cond_9
    move-wide/from16 v27, v4

    move-object/from16 v30, v7

    move/from16 p2, v9

    move-object/from16 v29, v11

    goto/16 :goto_b

    :cond_a
    move-wide/from16 v27, v4

    move/from16 v20, v6

    move-object/from16 v30, v7

    move/from16 p2, v9

    move-object/from16 v29, v11

    move-wide/from16 v25, v13

    const/4 v4, 0x0

    move-wide/from16 v13, v18

    move/from16 v5, v20

    :goto_7
    if-ge v4, v5, :cond_11

    if-eqz v2, :cond_b

    .line 41
    invoke-virtual {v2, v3}, Ll/᩵ۛۡ;->֫(I)Z

    .line 293
    :cond_b
    invoke-static {v13, v14, v12}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    move-result v3

    aput v3, v29, v4

    .line 294
    invoke-virtual {v0, v4}, Ll/۬ܿܽ;->getItem(I)Ll/ۗܿܽ;

    move-result-object v3

    .line 295
    invoke-virtual {v3}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v3

    .line 296
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    const-string v7, "UTF-16 string length is out of range: "

    if-ltz v6, :cond_10

    const/16 v8, 0x7fff

    if-gt v6, v8, :cond_c

    const/4 v8, 0x2

    goto :goto_8

    :cond_c
    const/4 v8, 0x4

    :goto_8
    int-to-long v8, v8

    int-to-long v10, v6

    const-wide/16 v20, 0x2

    mul-long v10, v10, v20

    add-long/2addr v8, v10

    add-long v8, v8, v20

    add-long/2addr v8, v13

    .line 298
    invoke-static {v8, v9, v15}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    if-ltz v6, :cond_f

    const/16 v7, 0x7fff

    if-gt v6, v7, :cond_d

    int-to-short v7, v6

    .line 381
    invoke-interface {v1, v7}, Ll/ۙۜܽ;->֫(S)V

    const/4 v7, 0x2

    goto :goto_9

    :cond_d
    ushr-int/lit8 v7, v6, 0x10

    const v8, 0x8000

    or-int/2addr v7, v8

    int-to-short v7, v7

    .line 384
    invoke-interface {v1, v7}, Ll/ۙۜܽ;->֫(S)V

    const v7, 0xffff

    and-int/2addr v7, v6

    int-to-short v7, v7

    .line 385
    invoke-interface {v1, v7}, Ll/ۙۜܽ;->֫(S)V

    const/4 v7, 0x4

    :goto_9
    int-to-long v7, v7

    add-long/2addr v13, v7

    const/4 v7, 0x0

    :goto_a
    if-ge v7, v6, :cond_e

    .line 301
    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    invoke-interface {v1, v8}, Ll/ۙۜܽ;->֫(C)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_e
    const/4 v3, 0x0

    .line 303
    invoke-interface {v1, v3}, Ll/ۙۜܽ;->֫(S)V

    add-long v10, v10, v20

    add-long/2addr v13, v10

    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x1

    goto :goto_7

    .line 378
    :cond_f
    new-instance v1, Ljava/io/IOException;

    .line 0
    invoke-static {v6, v7}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 378
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 391
    :cond_10
    new-instance v1, Ljava/io/IOException;

    .line 0
    invoke-static {v6, v7}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 391
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 307
    :cond_11
    :goto_b
    rem-long v2, v13, v23

    long-to-int v3, v2

    if-eqz v3, :cond_12

    rsub-int/lit8 v2, v3, 0x4

    const/4 v3, 0x0

    :goto_c
    if-ge v3, v2, :cond_12

    const/4 v4, 0x0

    .line 312
    invoke-interface {v1, v4}, Ll/ۙۜܽ;->writeByte(I)V

    add-long v13, v13, v16

    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    .line 316
    :cond_12
    invoke-static {v13, v14, v15}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    move-result v2

    .line 319
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v4, v3, [I

    const-string v5, "style offset"

    const-string v6, "style data size"

    if-lez v3, :cond_14

    const/4 v7, 0x0

    move-wide/from16 v8, v18

    :goto_d
    if-ge v7, v3, :cond_13

    .line 324
    invoke-static {v8, v9, v5}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    move-result v10

    aput v10, v4, v7

    move-object/from16 v10, v30

    .line 325
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [I

    .line 326
    array-length v12, v11

    int-to-long v12, v12

    move-wide v15, v12

    move-wide/from16 v17, v23

    move-wide/from16 v19, v23

    move-wide/from16 v21, v8

    invoke-static/range {v15 .. v22}, Ll/۠ۢ֡;->֫(JJJJ)J

    move-result-wide v8

    .line 327
    invoke-static {v8, v9, v6}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    .line 328
    invoke-interface {v1, v11}, Ll/ۙۜܽ;->֫([I)V

    const/4 v11, -0x1

    .line 329
    invoke-interface {v1, v11}, Ll/ۙۜܽ;->writeInt(I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_d

    :cond_13
    move-object/from16 v10, v30

    const/4 v3, -0x1

    const-wide/16 v11, 0x8

    add-long v7, v8, v11

    .line 332
    invoke-static {v7, v8, v6}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    .line 333
    invoke-interface {v1, v3}, Ll/ۙۜܽ;->writeInt(I)V

    .line 334
    invoke-interface {v1, v3}, Ll/ۙۜܽ;->writeInt(I)V

    goto :goto_e

    :cond_14
    move-object/from16 v10, v30

    move-wide/from16 v7, v18

    .line 338
    :goto_e
    invoke-static {v7, v8, v6}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    .line 339
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v6

    move-wide/from16 v8, v27

    .line 340
    invoke-interface {v1, v8, v9}, Ll/ۙۜܽ;->seek(J)V

    sub-long v8, v6, v8

    add-long v8, v8, v23

    const-string v3, "string pool chunk size"

    .line 341
    invoke-static {v8, v9, v3}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    move-result v3

    invoke-interface {v1, v3}, Ll/ۙۜܽ;->writeInt(I)V

    move-wide/from16 v8, v25

    .line 343
    invoke-interface {v1, v8, v9}, Ll/ۙۜܽ;->seek(J)V

    .line 344
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_15

    const/4 v2, 0x0

    goto :goto_f

    :cond_15
    move/from16 v3, p2

    int-to-long v8, v3

    int-to-long v2, v2

    add-long/2addr v8, v2

    invoke-static {v8, v9, v5}, Ll/۬ܿܽ;->֫(JLjava/lang/String;)I

    move-result v2

    :goto_f
    invoke-interface {v1, v2}, Ll/ۙۜܽ;->writeInt(I)V

    move-object/from16 v2, v29

    .line 345
    invoke-interface {v1, v2}, Ll/ۙۜܽ;->֫([I)V

    .line 346
    invoke-interface {v1, v4}, Ll/ۙۜܽ;->֫([I)V

    .line 347
    invoke-interface {v1, v6, v7}, Ll/ۙۜܽ;->seek(J)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 78
    iput-boolean p1, p0, Ll/۬ܿܽ;->ܳ:Z

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Ll/۬ܿܽ;->ܳ:Z

    return v0
.end method

.method public final declared-synchronized ۧ(Ljava/lang/String;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 143
    :try_start_0
    new-instance v1, Ll/ۗܿܽ;

    invoke-direct {v1, p0, p1}, Ll/ۗܿܽ;-><init>(Ll/۬ܿܽ;Ljava/lang/String;)V

    .line 144
    iget-object v2, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    iget-object v2, p0, Ll/۬ܿܽ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ܳ()V
    .locals 3

    .line 87
    iget-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗܿܽ;

    const/4 v2, 0x0

    .line 88
    iput-boolean v2, v1, Ll/ۗܿܽ;->ۙ:Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    .line 185
    :goto_0
    iget-object v1, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 186
    iget-object v1, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗܿܽ;

    .line 187
    invoke-virtual {v1}, Ll/ۗܿܽ;->᩺֫()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 190
    :cond_1
    new-instance v0, Ll/ۗܿܽ;

    invoke-direct {v0, p0, p1}, Ll/ۗܿܽ;-><init>(Ll/۬ܿܽ;Ljava/lang/String;)V

    .line 191
    iget-object v1, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    iget-object v1, p0, Ll/۬ܿܽ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    iget-object p1, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public final ܿ()I
    .locals 1

    .line 58
    iget-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final declared-synchronized ᩳ(Ljava/lang/String;)Ll/ۗܿܽ;
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 129
    :try_start_0
    iget-object v1, p0, Ll/۬ܿܽ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗܿܽ;

    if-eqz v1, :cond_1

    .line 131
    invoke-virtual {v1}, Ll/ۗܿܽ;->᩺֫()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 132
    monitor-exit v0

    return-object v1

    .line 134
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v1, "No-Style item from map has been modified."

    invoke-direct {p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 136
    :cond_1
    new-instance v1, Ll/ۗܿܽ;

    invoke-direct {v1, p0, p1}, Ll/ۗܿܽ;-><init>(Ll/۬ܿܽ;Ljava/lang/String;)V

    .line 137
    iget-object v2, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    iget-object v2, p0, Ll/۬ܿܽ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ᩳ()V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 151
    :goto_0
    iget-object v3, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 152
    iget-object v3, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗܿܽ;

    .line 153
    invoke-virtual {v3}, Ll/ۗܿܽ;->᩺֫()Z

    move-result v4

    if-eqz v4, :cond_2

    if-nez v0, :cond_3

    .line 168
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 169
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 170
    iget-object v3, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗܿܽ;

    .line 171
    invoke-virtual {v4}, Ll/ۗܿܽ;->᩺֫()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 172
    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 174
    :cond_0
    invoke-virtual {v2, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 176
    :cond_1
    iget-object v3, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 177
    iget-object v3, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 178
    iget-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 179
    :goto_2
    iget-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 180
    iget-object v0, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗܿܽ;

    iput v1, v0, Ll/ۗܿܽ;->᩸:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 160
    :cond_3
    iput v2, v3, Ll/ۗܿܽ;->᩸:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ᩻()V
    .locals 6

    .line 93
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 94
    iget-object v1, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗܿܽ;

    .line 95
    iget-boolean v3, v2, Ll/ۗܿܽ;->ۙ:Z

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ll/ۗܿܽ;->᩺֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 97
    invoke-virtual {v2}, Ll/ۗܿܽ;->᩶֫()[Ll/᩸᩻ܽ;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 98
    iget-object v5, v5, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 102
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    iget-object v2, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗܿܽ;

    .line 104
    iget-boolean v4, v3, Ll/ۗܿܽ;->ۙ:Z

    if-nez v4, :cond_4

    invoke-virtual {v3}, Ll/ۗܿܽ;->᩺֫()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    .line 106
    :cond_2
    invoke-virtual {v3}, Ll/ۗܿܽ;->᩺֫()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 107
    iget-object v4, p0, Ll/۬ܿܽ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 109
    :cond_3
    iget-object v4, p0, Ll/۬ܿܽ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v3}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 105
    :cond_4
    :goto_2
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 112
    :cond_5
    iput-object v1, p0, Ll/۬ܿܽ;->ܽ:Ljava/util/ArrayList;

    return-void
.end method
