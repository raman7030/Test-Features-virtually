.class public final Ll/᩵ۙ᩻;
.super Ll/ܰܺܳ;
.source "9AHU"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ۗ:Ljava/util/List;

.field public ۙ:Ljava/nio/charset/Charset;

.field public ۛ:Z

.field public ۟:[B

.field public ۤ:Ll/᩻ܰۡ;

.field public ۨ:Ljava/lang/String;

.field public ۫:J

.field public ۬:Ljava/util/Map;

.field public final ܰ:Ll/ܶ᩵ܿ;

.field public ᩶:Ll/۫ܽܽ;

.field public ᩹:Z

.field public final ᩺:Ll/֡ۛۡ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 58
    invoke-direct {p0}, Ll/ܰܺܳ;-><init>()V

    .line 50
    sget-object v0, Ll/ۚ᩺ۘ;->֫:[B

    iput-object v0, p0, Ll/᩵ۙ᩻;->۟:[B

    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Ll/᩵ۙ᩻;->ۛ:Z

    .line 136
    new-instance v1, Ll/֡ۛۡ;

    invoke-direct {v1, v0}, Ll/֡ۛۡ;-><init>(I)V

    iput-object v1, p0, Ll/᩵ۙ᩻;->᩺:Ll/֡ۛۡ;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 59
    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩵ۙ᩻;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/᩵ۙ᩻;
    .locals 3

    .line 80
    new-instance v0, Ll/᩵ۙ᩻;

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩵ۙ᩻;-><init>(Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۜۧ()[B

    move-result-object v1

    iput-object v1, v0, Ll/᩵ۙ᩻;->۟:[B

    .line 82
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v1

    .line 412
    iput-boolean v1, v0, Ll/᩵ۙ᩻;->᩹:Z

    .line 83
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩵()Ljava/lang/String;

    move-result-object v1

    .line 416
    iput-object v1, v0, Ll/᩵ۙ᩻;->ۨ:Ljava/lang/String;

    .line 84
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    .line 85
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 86
    invoke-virtual {v0, v1}, Ll/᩵ۙ᩻;->ᩳ(Ljava/lang/String;)V

    .line 88
    :cond_0
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    .line 89
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 90
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    .line 436
    iput-object v1, v0, Ll/᩵ۙ᩻;->ۙ:Ljava/nio/charset/Charset;

    .line 92
    :cond_1
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۗۤܳ;->ۧ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩴۙ᩻;

    if-eqz p0, :cond_2

    .line 94
    invoke-static {p0}, Ll/ᩴۙ᩻;->֫(Ll/ᩴۙ᩻;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Ll/᩵ۙ᩻;->ۗ:Ljava/util/List;

    .line 95
    invoke-static {p0}, Ll/ᩴۙ᩻;->ۧ(Ll/ᩴۙ᩻;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Ll/᩵ۙ᩻;->۬:Ljava/util/Map;

    .line 96
    invoke-static {p0}, Ll/ᩴۙ᩻;->ᩳ(Ll/ᩴۙ᩻;)Ll/᩻ܰۡ;

    move-result-object v1

    iput-object v1, v0, Ll/᩵ۙ᩻;->ۤ:Ll/᩻ܰۡ;

    .line 97
    invoke-static {p0}, Ll/ᩴۙ᩻;->ܽ(Ll/ᩴۙ᩻;)J

    move-result-wide v1

    iput-wide v1, v0, Ll/᩵ۙ᩻;->۫:J

    :cond_2
    return-object v0
.end method

.method private ֫(Ll/ᩳܰۡ;)V
    .locals 2

    .line 123
    invoke-virtual {p1}, Ll/ᩳܰۡ;->֡()[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 125
    sget-object v0, Ll/ۚ᩺ۘ;->֫:[B

    .line 127
    :cond_0
    iput-object v0, p0, Ll/᩵ۙ᩻;->۟:[B

    .line 128
    invoke-virtual {p1}, Ll/ᩳܰۡ;->ۖ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ۙ᩻;->ۗ:Ljava/util/List;

    .line 129
    invoke-virtual {p1}, Ll/ᩳܰۡ;->ۘ()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ۙ᩻;->۬:Ljava/util/Map;

    .line 130
    new-instance v0, Ll/᩻ܰۡ;

    iget-object v1, p0, Ll/᩵ۙ᩻;->ۗ:Ljava/util/List;

    .line 13
    invoke-direct {v0, v1}, Ll/֨᩺ۡ;-><init>(Ljava/util/Collection;)V

    .line 130
    iput-object v0, p0, Ll/᩵ۙ᩻;->ۤ:Ll/᩻ܰۡ;

    .line 131
    invoke-virtual {p1}, Ll/ᩳܰۡ;->᩸()Z

    move-result v0

    iput-boolean v0, p0, Ll/᩵ۙ᩻;->᩹:Z

    if-eqz v0, :cond_1

    .line 132
    invoke-static {p1}, Ll/᩹ۨۡ;->֫(Ll/ᩳܰۡ;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/᩵ۙ᩻;->ۨ:Ljava/lang/String;

    .line 133
    iget-object p1, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩵ۙ᩻;->۫:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 140
    invoke-virtual {p0}, Ll/ܰܺܳ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Ll/᩵ۙ᩻;->᩺:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->close()V

    .line 143
    :goto_0
    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳܰۡ;

    if-eqz v1, :cond_0

    .line 144
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;
    .locals 2

    .line 372
    iget-object v0, p0, Ll/᩵ۙ᩻;->۬:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 376
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩺ۡ;

    if-nez v0, :cond_1

    const-string v1, "/"

    .line 377
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 378
    iget-object v0, p0, Ll/᩵ۙ᩻;->ۤ:Ll/᩻ܰۡ;

    invoke-virtual {v0, p1}, Ll/֨᩺ۡ;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗ᩺ۡ;

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final ֡()Ll/ܶ᩵ܿ;
    .locals 1

    .line 400
    iget-object v0, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;Ll/ܿۖ᩷;)Ljava/io/FilterInputStream;
    .locals 10

    .line 161
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_8

    .line 162
    :cond_0
    check-cast p2, Ll/۫᩶᩻;

    invoke-virtual {p2}, Ll/۫᩶᩻;->ܽ()Ll/ۗ᩺ۡ;

    move-result-object p2

    .line 163
    invoke-static {p2}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;)Z

    move-result v0

    iget-object v2, p0, Ll/᩵ۙ᩻;->᩺:Ll/֡ۛۡ;

    iget-object v3, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_9

    .line 230
    invoke-virtual {p0}, Ll/᩵ۙ᩻;->ᩴ()Ljava/lang/String;

    move-result-object v0

    move-object v4, v1

    .line 232
    :goto_0
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v5

    if-eqz v5, :cond_1

    goto/16 :goto_6

    :cond_1
    if-eqz v0, :cond_3

    .line 234
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    goto :goto_4

    :cond_3
    :goto_1
    if-nez v4, :cond_4

    .line 236
    iget-object v0, p0, Ll/᩵ۙ᩻;->۟:[B

    invoke-static {v3, v0}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;[B)Ll/ᩳܰۡ;

    move-result-object v0

    .line 237
    :try_start_0
    invoke-static {v0, p2, p3}, Ll/᩹᩶᩻;->֫(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ll/ܿۖ᩷;)Ljava/util/List;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V

    goto :goto_3

    :catchall_0
    move-exception p1

    .line 236
    :try_start_1
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    .line 240
    :cond_4
    :goto_3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 241
    new-instance v5, Ll/۫֨ܳ;

    new-instance v6, Ll/᩶᩵ܳ;

    invoke-direct {v6, v0}, Ll/᩶᩵ܳ;-><init>(Ljava/lang/Object;)V

    invoke-direct {v5, p1, v6}, Ll/۫֨ܳ;-><init>(Ll/ۗܺ᩷;Ll/۬֨ܳ;)V

    new-instance v6, Ll/ۖۙ᩻;

    invoke-direct {v6, p3}, Ll/ۖۙ᩻;-><init>(Ll/ܿۖ᩷;)V

    invoke-virtual {v5, v6}, Ll/۫֨ܳ;->֫(Ljava/util/function/BooleanSupplier;)V

    invoke-virtual {v5, v4}, Ll/۫֨ܳ;->֫(Ljava/util/List;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_6

    .line 244
    :cond_5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v5, 0x1

    .line 249
    :goto_4
    :try_start_2
    new-instance v6, Ljava/io/BufferedInputStream;

    iget-object v7, p0, Ll/᩵ۙ᩻;->۟:[B

    .line 251
    invoke-virtual {p0}, Ll/ܰܺܳ;->᩻()Z

    move-result v8

    if-eqz v8, :cond_6

    move-object v8, v2

    goto :goto_5

    :cond_6
    move-object v8, v1

    .line 250
    :goto_5
    invoke-static {p2, v3, v7, v0, v8}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/ܶ᩵ܿ;[BLjava/lang/String;Ll/֡ۛۡ;)Ljava/io/InputStream;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 252
    invoke-static {p2, v6}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ljava/io/BufferedInputStream;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 269
    new-instance v7, Ll/ۘۙ᩻;

    invoke-direct {v7, p0, v6, v0, v5}, Ll/ۘۙ᩻;-><init>(Ll/᩵ۙ᩻;Ljava/io/BufferedInputStream;Ljava/lang/String;Z)V

    move-object v1, v7

    :goto_6
    return-object v1

    .line 253
    :cond_7
    invoke-static {v6}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 254
    new-instance v6, Ll/ۘܰۡ;

    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ll/ۘܰۡ;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_2
    .catch Ll/ۘܰۡ; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    nop

    .line 258
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Ll/ۤܺܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v5, :cond_8

    .line 260
    invoke-static {}, Ll/᩹᩶᩻;->֫()V

    :cond_8
    move-object v0, v1

    goto/16 :goto_0

    :cond_9
    move-object v0, v1

    .line 171
    :cond_a
    :goto_7
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_8

    .line 172
    :cond_b
    invoke-virtual {p0}, Ll/᩵ۙ᩻;->ᩴ()Ljava/lang/String;

    move-result-object v4

    .line 173
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v5

    if-eqz v5, :cond_f

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_f

    :cond_c
    if-nez v0, :cond_d

    .line 175
    invoke-static {}, Ll/ۤܺܳ;->ۧ()Ljava/util/Iterator;

    move-result-object v0

    .line 177
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    .line 178
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p0, v4}, Ll/᩵ۙ᩻;->ᩳ(Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    goto :goto_9

    .line 183
    :cond_e
    new-instance v4, Ll/۫֨ܳ;

    new-instance v5, Ll/۟ۢۡ;

    const/4 v6, 0x1

    invoke-direct {v5, v6, p0}, Ll/۟ۢۡ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v4, p1, v5}, Ll/۫֨ܳ;-><init>(Ll/ۗܺ᩷;Ll/۬֨ܳ;)V

    .line 184
    new-instance v5, Ll/ۖۙ᩻;

    invoke-direct {v5, p3}, Ll/ۖۙ᩻;-><init>(Ll/ܿۖ᩷;)V

    invoke-virtual {v4, v5}, Ll/۫֨ܳ;->֫(Ljava/util/function/BooleanSupplier;)V

    invoke-virtual {v4}, Ll/۫֨ܳ;->֫()Z

    move-result v4

    if-nez v4, :cond_10

    :goto_8
    return-object v1

    :cond_f
    const/4 v4, 0x0

    :cond_10
    const/4 v5, 0x0

    .line 194
    :goto_9
    :try_start_3
    new-instance v6, Ljava/io/BufferedInputStream;

    iget-object v7, p0, Ll/᩵ۙ᩻;->۟:[B

    .line 195
    invoke-virtual {p0}, Ll/᩵ۙ᩻;->ᩴ()Ljava/lang/String;

    move-result-object v8

    .line 196
    invoke-virtual {p0}, Ll/ܰܺܳ;->᩻()Z

    move-result v9

    if-eqz v9, :cond_11

    move-object v9, v2

    goto :goto_a

    :cond_11
    move-object v9, v1

    .line 195
    :goto_a
    invoke-static {p2, v3, v7, v8, v9}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/ܶ᩵ܿ;[BLjava/lang/String;Ll/֡ۛۡ;)Ljava/io/InputStream;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 198
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-static {p2, v6}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ljava/io/BufferedInputStream;)Z

    move-result v7

    if-nez v7, :cond_12

    .line 199
    invoke-static {v6}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 200
    invoke-virtual {p0, v1}, Ll/᩵ۙ᩻;->ᩳ(Ljava/lang/String;)V

    if-eqz v4, :cond_a

    .line 202
    invoke-static {}, Ll/᩹᩶᩻;->֫()V

    goto :goto_7

    :cond_12
    if-eqz v5, :cond_13

    .line 207
    invoke-virtual {p0}, Ll/᩵ۙ᩻;->ᩴ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Ll/᩹᩶᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ll/ۘܰۡ; {:try_start_3 .. :try_end_3} :catch_1

    :cond_13
    return-object v6

    :catch_1
    move-exception v5

    .line 211
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v6

    if-eqz v6, :cond_14

    .line 212
    invoke-virtual {p0, v1}, Ll/᩵ۙ᩻;->ᩳ(Ljava/lang/String;)V

    if-eqz v4, :cond_a

    .line 214
    invoke-static {}, Ll/᩹᩶᩻;->֫()V

    goto/16 :goto_7

    .line 218
    :cond_14
    throw v5
.end method

.method public final ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;
    .locals 1

    .line 154
    new-instance v0, Ll/ۨۘᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Ll/᩵ۙ᩻;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;Ll/ܿۖ᩷;)Ljava/io/FilterInputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 2

    .line 357
    iget-object p2, p0, Ll/᩵ۙ᩻;->ۗ:Ljava/util/List;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 358
    invoke-virtual {p0, p2}, Ll/᩵ۙ᩻;->֫(Z)V

    .line 360
    :cond_0
    sget-boolean p2, Ll/ۖܰۡ;->֫:Z

    if-eqz p2, :cond_1

    const-string p2, "/zip/"

    .line 0
    invoke-static {p1, p2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 363
    :cond_1
    iget-object p2, p0, Ll/᩵ۙ᩻;->ۤ:Ll/᩻ܰۡ;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/֨᩺ۡ;->ۧ(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 364
    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 365
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩺ۡ;

    .line 366
    new-instance v1, Ll/۫᩶᩻;

    invoke-direct {v1, v0}, Ll/۫᩶᩻;-><init>(Ll/ۗ᩺ۡ;)V

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p2
.end method

.method public final ֫(Ljava/lang/String;)Ll/ᩳۜܳ;
    .locals 1

    .line 315
    iget-object v0, p0, Ll/᩵ۙ᩻;->۬:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 316
    invoke-virtual {p0, v0}, Ll/᩵ۙ᩻;->֫(Z)V

    :cond_0
    const/4 v0, 0x1

    .line 318
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩵ۙ᩻;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 319
    :cond_1
    new-instance v0, Ll/۫᩶᩻;

    invoke-direct {v0, p1}, Ll/۫᩶᩻;-><init>(Ll/ۗ᩺ۡ;)V

    return-object v0
.end method

.method public final ֫(Ljava/security/MessageDigest;)V
    .locals 2

    const-string v0, "zip"

    .line 324
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 396
    iget-object v0, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    .line 325
    invoke-static {p1, v0}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 326
    iget-wide v0, p0, Ll/᩵ۙ᩻;->۫:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 7

    .line 396
    iget-object v0, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    .line 69
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Ll/᩵ۙ᩻;->۟:[B

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۧ([B)V

    .line 404
    iget-boolean v0, p0, Ll/᩵ۙ᩻;->᩹:Z

    .line 71
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    .line 408
    iget-object v0, p0, Ll/᩵ۙ᩻;->ۨ:Ljava/lang/String;

    .line 72
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/String;)V

    .line 73
    invoke-virtual {p0}, Ll/᩵ۙ᩻;->ᩴ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 74
    invoke-virtual {p0}, Ll/᩵ۙ᩻;->ۖ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 75
    new-instance v0, Ll/ᩴۙ᩻;

    iget-object v2, p0, Ll/᩵ۙ᩻;->ۗ:Ljava/util/List;

    iget-object v3, p0, Ll/᩵ۙ᩻;->۬:Ljava/util/Map;

    iget-object v4, p0, Ll/᩵ۙ᩻;->ۤ:Ll/᩻ܰۡ;

    iget-wide v5, p0, Ll/᩵ۙ᩻;->۫:J

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/ᩴۙ᩻;-><init>(Ljava/util/List;Ljava/util/Map;Ll/᩻ܰۡ;J)V

    .line 76
    invoke-static {v0}, Ll/ۗۤܳ;->֫(Ll/۬ᩴܺ;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    .line 108
    new-instance p1, Ll/ᩳܰۡ;

    iget-object v0, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    iget-object v1, p0, Ll/᩵ۙ᩻;->ۙ:Ljava/nio/charset/Charset;

    invoke-direct {p1, v0, v1}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;Ljava/nio/charset/Charset;)V

    .line 109
    :try_start_0
    invoke-direct {p0, p1}, Ll/᩵ۙ᩻;->֫(Ll/ᩳܰۡ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    invoke-virtual {p1}, Ll/ᩳܰۡ;->close()V

    return-void

    :catchall_0
    move-exception v0

    .line 108
    :try_start_1
    invoke-virtual {p1}, Ll/ᩳܰۡ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 1

    .line 440
    iget-object v0, p0, Ll/᩵ۙ᩻;->ۙ:Ljava/nio/charset/Charset;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۗ()Ljava/util/List;
    .locals 3

    .line 115
    iget-object v0, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    iget-object v1, p0, Ll/᩵ۙ᩻;->ۙ:Ljava/nio/charset/Charset;

    invoke-static {v0, v1}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;Ljava/nio/charset/Charset;)Ll/ᩳܰۡ;

    move-result-object v0

    .line 116
    :try_start_0
    invoke-direct {p0, v0}, Ll/᩵ۙ᩻;->֫(Ll/ᩳܰۡ;)V

    .line 117
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ll/ᩳܰۡ;->ᩳ()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V

    return-object v1

    :catchall_0
    move-exception v1

    .line 115
    :try_start_1
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 1

    .line 408
    iget-object v0, p0, Ll/᩵ۙ᩻;->ۨ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ()Z
    .locals 5

    .line 420
    iget-wide v0, p0, Ll/᩵ۙ᩻;->۫:J

    iget-object v2, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Ll/۫ܽܽ;
    .locals 7

    .line 330
    iget-object v0, p0, Ll/᩵ۙ᩻;->᩶:Ll/۫ܽܽ;

    if-eqz v0, :cond_0

    return-object v0

    .line 333
    :cond_0
    iget-boolean v0, p0, Ll/᩵ۙ᩻;->ۛ:Z

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    .line 336
    iput-boolean v0, p0, Ll/᩵ۙ᩻;->ۛ:Z

    .line 338
    :try_start_0
    iget-object v1, p0, Ll/᩵ۙ᩻;->ۗ:Ljava/util/List;

    if-nez v1, :cond_2

    .line 339
    invoke-virtual {p0, v0}, Ll/᩵ۙ᩻;->֫(Z)V

    .line 341
    :cond_2
    iget-object v1, p0, Ll/᩵ۙ᩻;->۬:Ljava/util/Map;

    const-string v2, "resources.arsc"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩺ۡ;

    if-eqz v1, :cond_3

    .line 342
    invoke-virtual {v1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v2

    const-wide/32 v4, 0xf00000

    cmp-long v6, v2, v4

    if-gez v6, :cond_3

    .line 343
    iget-object v2, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    iget-object v3, p0, Ll/᩵ۙ᩻;->۟:[B

    invoke-static {v2, v3}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;[B)Ll/ᩳܰۡ;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 344
    :try_start_1
    new-instance v3, Ll/᩺᩻ܽ;

    invoke-virtual {v2, v1}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v3, v1}, Ll/᩺᩻ܽ;-><init>(Ljava/io/InputStream;)V

    .line 345
    new-instance v1, Ll/۫ܽܽ;

    .line 90
    invoke-direct {v1, v0, v3}, Ll/۫ܽܽ;-><init>(ILl/ۢ᩻ܽ;)V

    .line 345
    iput-object v1, p0, Ll/᩵ۙ᩻;->᩶:Ll/۫ܽܽ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 346
    :try_start_2
    invoke-virtual {v2}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 343
    :try_start_3
    invoke-virtual {v2}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0

    .line 348
    :cond_3
    :goto_1
    iget-object v0, p0, Ll/᩵ۙ᩻;->᩶:Ll/۫ܽܽ;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object v0

    :catch_0
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ(Ljava/nio/charset/Charset;)V
    .locals 0

    .line 436
    iput-object p1, p0, Ll/᩵ۙ᩻;->ۙ:Ljava/nio/charset/Charset;

    return-void
.end method

.method public final ܶ()[B
    .locals 1

    .line 384
    iget-object v0, p0, Ll/᩵ۙ᩻;->۟:[B

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    const-string v0, "zip"

    return-object v0
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 1

    .line 428
    iget-object v0, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۤܺܳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 432
    iget-object v0, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۤܺܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵()Ljava/lang/String;
    .locals 1

    .line 396
    iget-object v0, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩶()Z
    .locals 1

    .line 424
    iget-object v0, p0, Ll/᩵ۙ᩻;->ܰ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    return v0
.end method

.method public final ᩶ۧ()Ljava/util/List;
    .locals 1

    .line 392
    iget-object v0, p0, Ll/᩵ۙ᩻;->ۗ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 404
    iget-boolean v0, p0, Ll/᩵ۙ᩻;->᩹:Z

    return v0
.end method

.method public final ᩹()Z
    .locals 1

    .line 388
    iget-object v0, p0, Ll/᩵ۙ᩻;->۟:[B

    array-length v0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
