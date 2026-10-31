.class public final Ll/ᩳ֨ܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ll/ۛ᩶۠;


# instance fields
.field public ֫:Z

.field public final ۜ:Ljava/util/List;

.field public final ۧ:Ljava/lang/ref/WeakReference;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ll/ܶ᩵ܿ;

.field public final ܿ:Z

.field public final ᩳ:Ljava/lang/String;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ۧ֨ܿ;)V
    .locals 2

    .line 1282
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1283
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-static {p1}, Ll/ۧ֨ܿ;->֫(Ll/ۧ֨ܿ;)Ll/ۗܺ᩷;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ᩳ֨ܿ;->ۧ:Ljava/lang/ref/WeakReference;

    .line 1284
    invoke-static {p1}, Ll/ۧ֨ܿ;->ۧ(Ll/ۧ֨ܿ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ֨ܿ;->ܽ:Ll/ܶ᩵ܿ;

    .line 1285
    invoke-static {p1}, Ll/ۧ֨ܿ;->ᩳ(Ll/ۧ֨ܿ;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ᩳ֨ܿ;->ܿ:Z

    .line 1286
    invoke-static {p1}, Ll/ۧ֨ܿ;->ܿ(Ll/ۧ֨ܿ;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ֨ܿ;->ܳ:Ljava/lang/String;

    .line 1287
    invoke-static {p1}, Ll/ۧ֨ܿ;->ܳ(Ll/ۧ֨ܿ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ֨ܿ;->ۜ:Ljava/util/List;

    .line 1288
    invoke-static {p1}, Ll/ۧ֨ܿ;->ܽ(Ll/ۧ֨ܿ;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ֨ܿ;->ᩳ:Ljava/lang/String;

    .line 1289
    invoke-static {}, Ll/᩷֨ܿ;->᩻()I

    move-result p1

    iput p1, p0, Ll/ᩳ֨ܿ;->᩻:I

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 7

    .line 1310
    iget v0, p0, Ll/ᩳ֨ܿ;->᩻:I

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 1331
    :try_start_0
    iget-boolean p1, p0, Ll/ᩳ֨ܿ;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_1

    .line 1332
    monitor-exit v0

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 1334
    :try_start_1
    iput-boolean p1, p0, Ll/ᩳ֨ܿ;->֫:Z

    .line 1335
    invoke-static {}, Ll/᩷֨ܿ;->ܽ()Ll/ܽ֨ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    invoke-static {p0}, Ll/᩺᩶۠;->ۧ(Ll/ۛ᩶۠;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1336
    monitor-exit v0

    .line 1316
    iget-object p1, p0, Ll/ᩳ֨ܿ;->ۧ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ll/ۗܺ᩷;

    if-eqz v1, :cond_3

    .line 1318
    new-instance p1, Ll/ۧ֨ܿ;

    iget-object v2, p0, Ll/ᩳ֨ܿ;->ܽ:Ll/ܶ᩵ܿ;

    iget-boolean v3, p0, Ll/ᩳ֨ܿ;->ܿ:Z

    iget-object v4, p0, Ll/ᩳ֨ܿ;->ܳ:Ljava/lang/String;

    iget-object v5, p0, Ll/ᩳ֨ܿ;->ۜ:Ljava/util/List;

    iget-object v6, p0, Ll/ᩳ֨ܿ;->ᩳ:Ljava/lang/String;

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Ll/ۧ֨ܿ;-><init>(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    if-nez p2, :cond_2

    .line 1320
    sget-object p2, Ll/ۛۚܿ;->ۙ:Ll/ۛۚܿ;

    invoke-virtual {p1, p2}, Ll/ۧ֨ܿ;->֫(Ll/ۛۚܿ;)V

    return-void

    .line 1322
    :cond_2
    sget-object p2, Ll/ۛۚܿ;->ۙ:Ll/ۛۚܿ;

    invoke-virtual {p1, p2}, Ll/ۧ֨ܿ;->ۧ(Ll/ۛۚܿ;)V

    :cond_3
    :goto_0
    return-void

    :catchall_0
    move-exception p1

    .line 1336
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()Z
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1296
    :try_start_0
    iget-boolean v1, p0, Ll/ᩳ֨ܿ;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 1297
    monitor-exit v0

    return v2

    .line 1299
    :cond_0
    :try_start_1
    iput-boolean v2, p0, Ll/ᩳ֨ܿ;->֫:Z

    .line 1300
    invoke-static {}, Ll/᩷֨ܿ;->ܽ()Ll/ܽ֨ܿ;

    move-result-object v1

    iget v3, p0, Ll/ᩳ֨ܿ;->᩻:I

    .line 1413
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    invoke-static {p0}, Ll/᩺᩶۠;->֫(Ll/ۛ᩶۠;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    :try_start_2
    invoke-static {v3}, Ll/᩺᩶۠;->ܽ(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1301
    monitor-exit v0

    return v2

    .line 164
    :catchall_0
    :try_start_3
    invoke-static {p0}, Ll/᩺᩶۠;->ۧ(Ll/ۛ᩶۠;)V

    const/4 v1, 0x0

    .line 1303
    iput-boolean v1, p0, Ll/ᩳ֨ܿ;->֫:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1304
    monitor-exit v0

    return v1

    :catchall_1
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method
