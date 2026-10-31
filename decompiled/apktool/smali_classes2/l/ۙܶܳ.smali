.class public final Ll/ۙܶܳ;
.super Ljava/util/AbstractList;
.source "C1ZO"


# instance fields
.field public final synthetic ᩶:Ll/ۗܶܳ;

.field public ᩸:Ljava/util/ArrayList;

.field public ᩹:[Ll/۫ܶܳ;


# direct methods
.method public constructor <init>(Ll/ۗܶܳ;)V
    .locals 7

    .line 228
    iput-object p1, p0, Ll/ۙܶܳ;->᩶:Ll/ۗܶܳ;

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 217
    invoke-static {p1}, Ll/ۗܶܳ;->ۜ(Ll/ۗܶܳ;)Ll/ۙ᩸ܳ;

    move-result-object v0

    .line 218
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ll/ۗܶܳ;->ᩳ(Ll/ۗܶܳ;)Ll/᩻᩸ܳ;

    move-result-object v1

    .line 219
    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ll/ۗܶܳ;->ۧ(Ll/ۗܶܳ;)Ll/ۛ۠ܳ;

    move-result-object v2

    .line 221
    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ll/ۗܶܳ;->ܽ(Ll/ۗܶܳ;)Ll/᩵ܶܳ;

    move-result-object v3

    .line 222
    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ll/ۗܶܳ;->᩻(Ll/ۗܶܳ;)Ll/֡᩸ܳ;

    move-result-object v4

    .line 223
    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ll/ۗܶܳ;->᩷(Ll/ۗܶܳ;)Ll/ܽ᩶ܳ;

    move-result-object p1

    .line 224
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x6

    new-array v5, v5, [Ll/۫ܶܳ;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v3, v5, v0

    const/4 v0, 0x4

    aput-object v4, v5, v0

    const/4 v0, 0x5

    aput-object p1, v5, v0

    iput-object v5, p0, Ll/ۙܶܳ;->᩹:[Ll/۫ܶܳ;

    .line 226
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    .line 229
    invoke-virtual {p0}, Ll/ۙܶܳ;->ܽ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۙܶܳ;Ll/ܰܶܳ;)V
    .locals 3

    .line 236
    new-instance v0, Ll/ۚܶܳ;

    iget-object v1, p0, Ll/ۙܶܳ;->᩶:Ll/ۗܶܳ;

    invoke-static {v1}, Ll/ۗܶܳ;->֫(Ll/ۗܶܳ;)Lbin/mt/plus/Main;

    move-result-object v2

    invoke-direct {v0, v2, v1, p1}, Ll/ۚܶܳ;-><init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;Ll/ܰܶܳ;)V

    .line 237
    invoke-virtual {v0}, Ll/ܿܶܳ;->ܿ()V

    .line 238
    iget-object p0, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 216
    invoke-virtual {p0, p1}, Ll/ۙܶܳ;->get(I)Ll/۫ܶܳ;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized get(I)Ll/۫ܶܳ;
    .locals 3

    move-object v0, p0

    monitor-enter v0

    const/4 v1, 0x2

    if-lt p1, v1, :cond_1

    add-int/lit8 v1, p1, -0x2

    .line 245
    :try_start_0
    iget-object v2, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 246
    iget-object p1, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫ܶܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 248
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr p1, v1

    .line 250
    :cond_1
    iget-object v1, p0, Ll/ۙܶܳ;->᩹:[Ll/۫ܶܳ;

    aget-object p1, v1, p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final size()I
    .locals 2

    .line 255
    iget-object v0, p0, Ll/ۙܶܳ;->᩹:[Ll/۫ܶܳ;

    array-length v0, v0

    iget-object v1, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final declared-synchronized ֫(Ll/۫ܶܳ;)I
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 260
    :goto_0
    :try_start_0
    iget-object v3, p0, Ll/ۙܶܳ;->᩹:[Ll/۫ܶܳ;

    array-length v3, v3

    if-ge v1, v3, :cond_5

    const/4 v3, 0x2

    if-ne v1, v3, :cond_2

    .line 261
    iget-object v3, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 262
    iget-object v3, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_2

    .line 263
    iget-object v5, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۫ܶܳ;

    .line 264
    invoke-virtual {v5}, Ll/۫ܶܳ;->ܽ()I

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_1

    if-ne v5, p1, :cond_0

    .line 267
    monitor-exit v0

    return v2

    :cond_0
    add-int/2addr v2, v6

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 273
    :cond_2
    :try_start_1
    iget-object v3, p0, Ll/ۙܶܳ;->᩹:[Ll/۫ܶܳ;

    aget-object v3, v3, v1

    .line 274
    invoke-virtual {v3}, Ll/۫ܶܳ;->ܽ()I

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_4

    if-ne v3, p1, :cond_3

    .line 277
    monitor-exit v0

    return v2

    :cond_3
    add-int/2addr v2, v4

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 282
    :cond_5
    monitor-exit v0

    const/4 p1, -0x1

    return p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(I)Ll/ܿܶܳ;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 289
    :try_start_0
    iget-object v1, p0, Ll/ۙܶܳ;->᩶:Ll/ۗܶܳ;

    invoke-static {v1}, Ll/ۗܶܳ;->ᩳ(Ll/ۗܶܳ;)Ll/᩻᩸ܳ;

    move-result-object v1

    iget v1, v1, Ll/ܿܶܳ;->ۤ:I

    if-ne v1, p1, :cond_0

    .line 290
    iget-object p1, p0, Ll/ۙܶܳ;->᩶:Ll/ۗܶܳ;

    invoke-static {p1}, Ll/ۗܶܳ;->ᩳ(Ll/ۗܶܳ;)Ll/᩻᩸ܳ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 292
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 293
    iget-object v3, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚܶܳ;

    .line 294
    iget v4, v3, Ll/ܿܶܳ;->ۤ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v4, p1, :cond_1

    .line 295
    monitor-exit v0

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 298
    :cond_2
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()I
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 303
    :try_start_0
    iget-object v1, p0, Ll/ۙܶܳ;->᩹:[Ll/۫ܶܳ;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v6, v1, v4

    .line 304
    invoke-virtual {v6}, Ll/۫ܶܳ;->ܽ()I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 306
    :cond_0
    iget-object v1, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_1
    if-ge v3, v1, :cond_1

    .line 307
    iget-object v2, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚܶܳ;

    invoke-virtual {v2}, Ll/ۚܶܳ;->ܽ()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v5, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 309
    :cond_1
    monitor-exit v0

    return v5

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 233
    :try_start_0
    iget-object v1, p0, Ll/ۙܶܳ;->᩶:Ll/ۗܶܳ;

    invoke-static {v1}, Ll/ۗܶܳ;->ᩳ(Ll/ۗܶܳ;)Ll/᩻᩸ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܿܶܳ;->ܿ()V

    .line 234
    iget-object v1, p0, Ll/ۙܶܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 235
    new-instance v1, Ll/᩶ܶܳ;

    invoke-direct {v1, p0}, Ll/᩶ܶܳ;-><init>(Ll/ۙܶܳ;)V

    invoke-static {v1}, Ll/֫᩸ܳ;->֫(Ll/᩶ܶܳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
