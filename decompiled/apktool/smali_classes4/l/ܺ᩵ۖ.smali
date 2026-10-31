.class public Ll/ܺ᩵ۖ;
.super Ljava/lang/Object;
.source "N9OB"


# instance fields
.field public ֫:Ll/ۛۜۖ;

.field public ۧ:Ll/ᩳۘۖ;

.field public volatile ܽ:Ll/ۛۜۖ;

.field public volatile ᩳ:Ll/ۡ֡ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 35
    invoke-static {}, Ll/ᩳۘۖ;->֫()Ll/ᩳۘۖ;

    return-void
.end method

.method public constructor <init>(Ll/ۛۜۖ;Ll/ᩳۘۖ;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    .line 97
    iput-object p2, p0, Ll/ܺ᩵ۖ;->ۧ:Ll/ᩳۘۖ;

    .line 98
    iput-object p1, p0, Ll/ܺ᩵ۖ;->֫:Ll/ۛۜۖ;

    return-void

    .line 415
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "found null ByteString"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 412
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "found null ExtensionRegistry"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 334
    iget-object v0, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    if-eqz v0, :cond_0

    .line 335
    iget-object v0, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    invoke-virtual {v0}, Ll/ۛۜۖ;->size()I

    move-result v0

    return v0

    .line 336
    :cond_0
    iget-object v0, p0, Ll/ܺ᩵ۖ;->֫:Ll/ۛۜۖ;

    if-eqz v0, :cond_1

    .line 337
    invoke-virtual {v0}, Ll/ۛۜۖ;->size()I

    move-result v0

    return v0

    .line 338
    :cond_1
    iget-object v0, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    if-eqz v0, :cond_2

    .line 339
    iget-object v0, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    invoke-interface {v0}, Ll/ۡ֡ۖ;->getSerializedSize()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ll/ۡ֡ۖ;)Ll/ۡ֡ۖ;
    .locals 4

    .line 383
    iget-object v0, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, p0

    .line 386
    monitor-enter v0

    .line 387
    :try_start_0
    iget-object v1, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    if-eqz v1, :cond_1

    .line 388
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 391
    :cond_1
    :try_start_1
    iget-object v1, p0, Ll/ܺ᩵ۖ;->֫:Ll/ۛۜۖ;

    if-eqz v1, :cond_2

    .line 394
    invoke-interface {p1}, Ll/ۡ֡ۖ;->getParserForType()Ll/۫֡ۖ;

    move-result-object v1

    iget-object v2, p0, Ll/ܺ᩵ۖ;->֫:Ll/ۛۜۖ;

    iget-object v3, p0, Ll/ܺ᩵ۖ;->ۧ:Ll/ᩳۘۖ;

    invoke-interface {v1, v2, v3}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    .line 395
    iput-object v1, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    .line 396
    iget-object v1, p0, Ll/ܺ᩵ۖ;->֫:Ll/ۛۜۖ;

    iput-object v1, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    goto :goto_0

    .line 398
    :cond_2
    iput-object p1, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    .line 399
    sget-object v1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v1, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;
    :try_end_1
    .catch Ll/֫᩵ۖ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 404
    :catch_0
    :try_start_2
    iput-object p1, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    .line 405
    sget-object p1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object p1, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    .line 407
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 201
    :goto_1
    iget-object p1, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    return-object p1

    :catchall_0
    move-exception p1

    .line 407
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final ۧ()Ll/ۛۜۖ;
    .locals 2

    .line 347
    iget-object v0, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    if-eqz v0, :cond_0

    .line 348
    iget-object v0, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    return-object v0

    .line 352
    :cond_0
    iget-object v0, p0, Ll/ܺ᩵ۖ;->֫:Ll/ۛۜۖ;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    move-object v0, p0

    .line 355
    monitor-enter v0

    .line 356
    :try_start_0
    iget-object v1, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    if-eqz v1, :cond_2

    .line 357
    iget-object v1, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    monitor-exit v0

    return-object v1

    .line 359
    :cond_2
    iget-object v1, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    if-nez v1, :cond_3

    .line 360
    sget-object v1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v1, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    goto :goto_0

    .line 362
    :cond_3
    iget-object v1, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    invoke-interface {v1}, Ll/ۡ֡ۖ;->toByteString()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    .line 364
    :goto_0
    iget-object v1, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 365
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ(Ll/ۡ֡ۖ;)Ll/ۡ֡ۖ;
    .locals 2

    .line 211
    iget-object v0, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    const/4 v1, 0x0

    .line 212
    iput-object v1, p0, Ll/ܺ᩵ۖ;->֫:Ll/ۛۜۖ;

    .line 213
    iput-object v1, p0, Ll/ܺ᩵ۖ;->ܽ:Ll/ۛۜۖ;

    .line 214
    iput-object p1, p0, Ll/ܺ᩵ۖ;->ᩳ:Ll/ۡ֡ۖ;

    return-object v0
.end method
