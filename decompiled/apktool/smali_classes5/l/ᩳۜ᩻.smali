.class public final Ll/ᩳۜ᩻;
.super Ll/ۘۘܳ;
.source "D9TI"


# static fields
.field public static ۖ:Z

.field public static final ۜ:Landroid/net/ConnectivityManager;

.field public static ۡ:I

.field public static ۢ:Z

.field public static ܺ:Z

.field public static ᩷:J


# instance fields
.field public final ܳ:Ll/۠ۢ᩻;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ll/ۗ᩻᩻;

.field public final ᩻:Ll/ۗۢ᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "connectivity"

    .line 41
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    sput-object v0, Ll/ᩳۜ᩻;->ۜ:Landroid/net/ConnectivityManager;

    const/4 v0, 0x1

    .line 42
    sput-boolean v0, Ll/ᩳۜ᩻;->ܺ:Z

    return-void
.end method

.method public constructor <init>(Ll/ۗۢ᩻;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Ll/ᩳۜ᩻;->᩻:Ll/ۗۢ᩻;

    .line 71
    new-instance v0, Ll/۠ۢ᩻;

    invoke-direct {v0, p1}, Ll/۠ۢ᩻;-><init>(Ll/ۗۢ᩻;)V

    iput-object v0, p0, Ll/ᩳۜ᩻;->ܳ:Ll/۠ۢ᩻;

    return-void
.end method

.method public static ֫(Ll/ᩳۜ᩻;Ll/ᩳۜܳ;)Landroid/graphics/Bitmap;
    .locals 4

    .line 319
    new-instance v0, Ll/ܰ᩻᩻;

    iget-object p0, p0, Ll/ᩳۜ᩻;->᩻:Ll/ۗۢ᩻;

    .line 73
    new-instance v1, Ll/᩵᩹ۢ;

    invoke-direct {v1, p0, p1}, Ll/᩵᩹ۢ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v2

    .line 73
    invoke-direct {v0, v1, p0, v2, v3}, Ll/ܰ᩻᩻;-><init>(Ll/᩺᩻᩻;Ljava/lang/String;J)V

    .line 524
    new-instance p0, Ll/ۛ᩻᩻;

    invoke-direct {p0, v0}, Ll/ۛ᩻᩻;-><init>(Ll/ܰ᩻᩻;)V

    .line 202
    invoke-static {p0}, Ll/ܿܺۡ;->ۧ(Landroid/media/MediaDataSource;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩳۜ᩻;Ll/ᩳۜܳ;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)Landroid/graphics/Bitmap;
    .locals 6

    .line 319
    new-instance v0, Ll/ܰ᩻᩻;

    iget-object v1, p0, Ll/ᩳۜ᩻;->᩻:Ll/ۗۢ᩻;

    .line 73
    new-instance v2, Ll/᩵᩹ۢ;

    invoke-direct {v2, v1, p1}, Ll/᩵᩹ۢ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    .line 73
    invoke-direct {v0, v2, v1, v3, v4}, Ll/ܰ᩻᩻;-><init>(Ll/᩺᩻᩻;Ljava/lang/String;J)V

    .line 524
    new-instance v1, Ll/ۛ᩻᩻;

    invoke-direct {v1, v0}, Ll/ۛ᩻᩻;-><init>(Ll/ܰ᩻᩻;)V

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 481
    :try_start_0
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷᩸ۜ;

    if-nez v3, :cond_0

    .line 483
    invoke-static {v1}, Ll/ᩴ᩸ۜ;->֫(Landroid/media/MediaDataSource;)Ll/᩷᩸ۜ;

    move-result-object v3

    .line 484
    invoke-virtual {p2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 330
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v4, "network:"

    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/ᩳۜ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 332
    invoke-interface {p1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v4

    .line 331
    invoke-static {p0, p1, v4, v5}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/ᩳۜܳ;J)Ljava/lang/String;

    move-result-object p0

    .line 379
    invoke-static {p0, v3}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/᩷᩸ۜ;)V

    .line 486
    sget-object p0, Ll/᩷᩸ۜ;->ۙ:Ll/᩷᩸ۜ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, p0, :cond_0

    .line 501
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-object v0

    .line 385
    :cond_0
    :try_start_1
    new-instance p0, Ll/۟᩻᩻;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, p0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v2, 0x1

    .line 494
    :try_start_2
    invoke-static {v1}, Ll/ܿܺۡ;->֫(Landroid/media/MediaDataSource;)Ll/ۢ᩸ۜ;

    move-result-object p0

    .line 495
    invoke-virtual {p3, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 496
    invoke-virtual {p0}, Ll/ۢ᩸ۜ;->֫()Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    if-nez v2, :cond_1

    .line 501
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 503
    :cond_1
    throw p0

    .line 501
    :catch_0
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    :catch_1
    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ᩳۜ᩻;)Ll/۠ۢ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۜ᩻;->ܳ:Ll/۠ۢ᩻;

    return-object p0
.end method

.method private ֫(Ljava/lang/String;Ll/᩶ۖܳ;Ll/᩶ۖܳ;Ll/ۙ۫ۡ;)Ll/ۨܺ᩷;
    .locals 4

    .line 283
    invoke-static {}, Ll/ᩳۜ᩻;->ᩳ()V

    .line 284
    invoke-direct {p0}, Ll/ᩳۜ᩻;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 285
    iget-object p1, p3, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 287
    :cond_0
    invoke-static {p1}, Ll/ۘۘܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 288
    iget-object p1, p2, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 290
    :cond_1
    invoke-static {p1}, Ll/ۘۘܳ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 291
    iget-object p1, p3, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 294
    :cond_2
    sget-object v0, Ll/ᩳۜ᩻;->ۜ:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_8

    .line 295
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 84
    iget-object v1, p0, Ll/ᩳۜ᩻;->᩻:Ll/ۗۢ᩻;

    iget-object v2, v1, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 85
    iget-boolean v3, v2, Ll/ۗ᩻᩻;->᩸:Z

    if-eqz v3, :cond_4

    .line 86
    sget-boolean v2, Ll/ᩳۜ᩻;->ۖ:Z

    goto :goto_1

    .line 88
    :cond_4
    iget-boolean v2, v2, Ll/ۗ᩻᩻;->ۨ:Z

    :goto_1
    if-eqz v2, :cond_5

    .line 296
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    and-int/lit8 v0, v0, 0x9

    if-nez v0, :cond_5

    goto :goto_3

    .line 102
    :cond_5
    :try_start_0
    iget-object v0, v1, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 103
    iget-boolean v1, v0, Ll/ۗ᩻᩻;->᩸:Z

    if-eqz v1, :cond_6

    .line 104
    sget v0, Ll/ᩳۜ᩻;->ۡ:I

    goto :goto_2

    .line 106
    :cond_6
    iget v0, v0, Ll/ۗ᩻᩻;->ۤ:I

    .line 305
    :goto_2
    invoke-static {p1, p4, v0}, Ll/۬۫ۡ;->֫(Ljava/lang/String;Ll/ۙ۫ۡ;I)Landroid/graphics/Bitmap;

    move-result-object p4

    invoke-static {p4}, Ll/ۨܺ᩷;->֫(Landroid/graphics/Bitmap;)Ll/ۨܺ᩷;

    move-result-object p3
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p3, :cond_7

    .line 311
    iget-object p2, p2, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    .line 312
    invoke-static {p1}, Ll/ۘۘܳ;->ᩳ(Ljava/lang/String;)V

    return-object p2

    :cond_7
    return-object p3

    .line 307
    :catch_0
    invoke-static {p1}, Ll/ۘۘܳ;->ܿ(Ljava/lang/String;)V

    .line 308
    iget-object p1, p3, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 297
    :cond_8
    :goto_3
    invoke-static {p1}, Ll/۬۫ۡ;->֫(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 299
    invoke-static {p1}, Ll/ۨܺ᩷;->֫(Landroid/graphics/Bitmap;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1

    .line 301
    :cond_9
    iget-object p1, p3, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1
.end method

.method private ۧ()Z
    .locals 2

    .line 75
    iget-object v0, p0, Ll/ᩳۜ᩻;->᩻:Ll/ۗۢ᩻;

    iget-object v0, v0, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 76
    iget-boolean v1, v0, Ll/ۗ᩻᩻;->᩸:Z

    if-eqz v1, :cond_0

    .line 77
    sget-boolean v0, Ll/ᩳۜ᩻;->ۢ:Z

    return v0

    .line 79
    :cond_0
    iget-boolean v0, v0, Ll/ۗ᩻᩻;->۫:Z

    return v0
.end method

.method private ܽ(Ll/ᩳۜܳ;)Ljava/lang/String;
    .locals 3

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ᩳۜ᩻;->᩻:Ll/ۗۢ᩻;

    invoke-virtual {v1}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 324
    invoke-static {p1}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static ܽ()V
    .locals 1

    const/4 v0, 0x1

    .line 55
    sput-boolean v0, Ll/ᩳۜ᩻;->ܺ:Z

    return-void
.end method

.method private ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;
    .locals 5

    .line 346
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 353
    :try_start_0
    iget-object v2, p0, Ll/ᩳۜ᩻;->᩻:Ll/ۗۢ᩻;

    iget-object v2, v2, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 354
    iget-object v3, p0, Ll/ᩳۜ᩻;->ܿ:Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v3, p0, Ll/ᩳۜ᩻;->ᩳ:Ll/ۗ᩻᩻;

    .line 355
    invoke-virtual {v2, v3}, Ll/ۗ᩻᩻;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 356
    iget-object v2, p0, Ll/ᩳۜ᩻;->ܿ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    .line 359
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ll/ۗ᩻᩻;->clone()Ll/ۗ᩻᩻;

    move-result-object v2

    .line 360
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v3

    const-string v4, "net"

    .line 361
    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/security/MessageDigest;->update([B)V

    .line 362
    invoke-virtual {v2}, Ll/ۗ᩻᩻;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 363
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    invoke-static {v3}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/ᩳۜ᩻;->ܿ:Ljava/lang/String;

    .line 364
    iput-object v2, p0, Ll/ᩳۜ᩻;->ᩳ:Ll/ۗ᩻᩻;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 365
    monitor-exit v0

    move-object v2, v3

    .line 346
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 347
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 365
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public static declared-synchronized ᩳ()V
    .locals 4

    .line 2
    const-class v0, Ll/ᩳۜ᩻;

    .line 3
    monitor-enter v0

    .line 59
    :try_start_0
    sget-boolean v1, Ll/ᩳۜ᩻;->ܺ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 60
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 62
    :try_start_1
    sput-boolean v1, Ll/ᩳۜ᩻;->ܺ:Z

    .line 63
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v2, "network_thumb_enable"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sput-boolean v1, Ll/ᩳۜ᩻;->ۢ:Z

    .line 64
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v2, "network_thumb_only_load_on_wifi"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sput-boolean v1, Ll/ᩳۜ᩻;->ۖ:Z

    .line 65
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v2, "network_thumb_time_limit"

    const/16 v3, 0xa

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    sput v1, Ll/ᩳۜ᩻;->ۡ:I

    .line 66
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v2, "network_thumb_image_file_size_limit"

    const-string v3, "10MB"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۗ᩻᩻;->֫(Ljava/lang/String;)J

    move-result-wide v1

    sput-wide v1, Ll/ᩳۜ᩻;->᩷:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫(Ll/ᩳۜܳ;I)Ljava/lang/String;
    .locals 0

    .line 218
    invoke-static {}, Ll/ᩳۜ᩻;->ᩳ()V

    .line 219
    invoke-direct {p0}, Ll/ᩳۜ᩻;->ۧ()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Ll/ᩳۜ᩻;->ܽ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;
    .locals 8

    const/16 p1, 0xc

    if-ne p3, p1, :cond_0

    .line 338
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 339
    invoke-direct {p0, p2}, Ll/ᩳۜ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 340
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 185
    :cond_0
    invoke-direct {p0, p2}, Ll/ᩳۜ᩻;->ܽ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-ne p3, p1, :cond_1

    .line 188
    invoke-interface {p2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v1

    .line 187
    invoke-static {v0, p2, v1, v2}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/ᩳۜܳ;J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    const/4 v1, 0x1

    if-eq p3, v1, :cond_1f

    const/4 v1, 0x2

    if-eq p3, v1, :cond_1f

    const/4 v2, 0x4

    .line 190
    iget-object v3, p0, Ll/ᩳۜ᩻;->᩻:Ll/ۗۢ᩻;

    sget-object v4, Ll/ᩳۜ᩻;->ۜ:Landroid/net/ConnectivityManager;

    const/4 v5, 0x0

    const/16 v6, 0x17

    if-eq p3, v2, :cond_12

    if-ne p3, p1, :cond_1e

    .line 207
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v6, :cond_1e

    .line 393
    invoke-static {v0}, Ll/۬۫ۡ;->֫(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 394
    invoke-static {p1}, Ll/ۨܺ᩷;->֫(Landroid/graphics/Bitmap;)Ll/ۨܺ᩷;

    move-result-object p1

    const-string p3, "network:"

    if-eqz p1, :cond_2

    .line 396
    sget-object v0, Ll/᩷᩸ۜ;->᩹:Ll/᩷᩸ۜ;

    .line 330
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ll/ᩳۜ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 332
    invoke-interface {p2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v1

    .line 331
    invoke-static {p3, p2, v1, v2}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/ᩳۜܳ;J)Ljava/lang/String;

    move-result-object p3

    .line 379
    invoke-static {p3, v0}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/᩷᩸ۜ;)V

    .line 385
    new-instance p3, Ll/۟᩻᩻;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, p3}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    return-object p1

    .line 330
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ll/ᩳۜ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 332
    invoke-interface {p2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v1

    .line 331
    invoke-static {p1, p2, v1, v2}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/ᩳۜܳ;J)Ljava/lang/String;

    move-result-object p1

    .line 371
    invoke-static {p1}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;)Ll/᩷᩸ۜ;

    move-result-object p1

    .line 403
    sget-object v1, Ll/᩷᩸ۜ;->ۙ:Ll/᩷᩸ۜ;

    if-ne p1, v1, :cond_3

    .line 404
    invoke-interface {p2, v5}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 33
    invoke-static {p2}, Ll/ۗ۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 407
    :cond_3
    sget-object v2, Ll/᩷᩸ۜ;->᩶:Ll/᩷᩸ۜ;

    if-ne p1, v2, :cond_4

    .line 385
    new-instance p1, Ll/۟᩻᩻;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, p1}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 410
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 412
    :cond_4
    invoke-static {v0}, Ll/ۘۘܳ;->ܽ(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 413
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    :cond_5
    if-eqz v4, :cond_6

    .line 416
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v4

    goto :goto_1

    :cond_6
    move-object v4, v5

    .line 417
    :goto_1
    invoke-direct {p0}, Ll/ᩳۜ᩻;->ۧ()Z

    move-result v6

    if-eqz v6, :cond_11

    if-eqz v4, :cond_11

    .line 419
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v6

    if-eqz v6, :cond_11

    .line 84
    iget-object v6, v3, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 85
    iget-boolean v7, v6, Ll/ۗ᩻᩻;->᩸:Z

    if-eqz v7, :cond_7

    .line 86
    sget-boolean v6, Ll/ᩳۜ᩻;->ۖ:Z

    goto :goto_2

    .line 88
    :cond_7
    iget-boolean v6, v6, Ll/ۗ᩻᩻;->ۨ:Z

    :goto_2
    if-eqz v6, :cond_8

    .line 421
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getType()I

    move-result v4

    and-int/lit8 v4, v4, 0x9

    if-nez v4, :cond_8

    goto/16 :goto_6

    .line 426
    :cond_8
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v4, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 428
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 432
    :try_start_0
    new-instance v6, Ll/᩺֡ܳ;

    invoke-direct {v6, p0, p2, v4, p1}, Ll/᩺֡ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    iget-object v3, v3, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 103
    iget-boolean v7, v3, Ll/ۗ᩻᩻;->᩸:Z

    if-eqz v7, :cond_9

    .line 104
    sget v3, Ll/ᩳۜ᩻;->ۡ:I

    goto :goto_3

    .line 106
    :cond_9
    iget v3, v3, Ll/ۗ᩻᩻;->ۤ:I

    .line 432
    :goto_3
    invoke-static {v0, v6, v3}, Ll/۬۫ۡ;->֫(Ljava/lang/String;Ll/ۙ۫ۡ;I)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 449
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷᩸ۜ;

    if-eqz v0, :cond_b

    .line 451
    sget-object p1, Ll/᩷᩸ۜ;->᩹:Ll/᩷᩸ۜ;

    .line 330
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ll/ᩳۜ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 332
    invoke-interface {p2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v1

    .line 331
    invoke-static {p3, p2, v1, v2}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/ᩳۜܳ;J)Ljava/lang/String;

    move-result-object p3

    .line 379
    invoke-static {p3, p1}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/᩷᩸ۜ;)V

    .line 385
    new-instance p1, Ll/۟᩻᩻;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, p1}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 453
    invoke-static {v0}, Ll/ۨܺ᩷;->֫(Landroid/graphics/Bitmap;)Ll/ۨܺ᩷;

    move-result-object p1

    if-eqz p1, :cond_a

    return-object p1

    .line 454
    :cond_a
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    :cond_b
    if-ne v3, v1, :cond_c

    .line 457
    invoke-interface {p2, v5}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 33
    invoke-static {p2}, Ll/ۗ۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 460
    :cond_c
    sget-object v0, Ll/᩷᩸ۜ;->᩹:Ll/᩷᩸ۜ;

    if-ne v3, v0, :cond_d

    .line 385
    new-instance v0, Ll/۟᩻᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 463
    :cond_d
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢ᩸ۜ;

    if-eqz p1, :cond_e

    .line 464
    invoke-virtual {p1}, Ll/ۢ᩸ۜ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 330
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ll/ᩳۜ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 332
    invoke-interface {p2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v0

    .line 331
    invoke-static {p1, p2, v0, v1}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/ᩳۜܳ;J)Ljava/lang/String;

    move-result-object p1

    .line 379
    invoke-static {p1, v2}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/᩷᩸ۜ;)V

    .line 469
    :cond_e
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    :catch_0
    nop

    .line 437
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷᩸ۜ;

    .line 438
    sget-object p3, Ll/᩷᩸ۜ;->ۙ:Ll/᩷᩸ۜ;

    if-ne p1, p3, :cond_f

    .line 439
    invoke-interface {p2, v5}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 33
    invoke-static {p2}, Ll/ۗ۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    :goto_4
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    goto :goto_5

    .line 442
    :cond_f
    sget-object p3, Ll/᩷᩸ۜ;->᩹:Ll/᩷᩸ۜ;

    if-ne p1, p3, :cond_10

    .line 385
    new-instance p1, Ll/۟᩻᩻;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, p1}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 445
    :cond_10
    invoke-static {v0}, Ll/ۘۘܳ;->ܿ(Ljava/lang/String;)V

    .line 446
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    goto :goto_4

    :goto_5
    return-object p1

    .line 423
    :cond_11
    :goto_6
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 197
    :cond_12
    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    sget p3, Ll/ۢ۠ۜ;->֫:I

    .line 78
    invoke-static {p1}, Ll/ۤۙۜ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1d

    .line 226
    invoke-static {}, Ll/ᩳۜ᩻;->ᩳ()V

    .line 227
    invoke-virtual {p0, p2}, Ll/ᩳۜ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 228
    invoke-direct {p0}, Ll/ᩳۜ᩻;->ۧ()Z

    move-result p3

    if-eqz p3, :cond_1c

    invoke-static {v0}, Ll/ۘۘܳ;->ܽ(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_13

    goto :goto_b

    :cond_13
    if-eqz v4, :cond_14

    .line 231
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v5

    :cond_14
    if-eqz v5, :cond_1b

    .line 232
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p3

    if-eqz p3, :cond_1b

    .line 84
    iget-object p3, v3, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 85
    iget-boolean v1, p3, Ll/ۗ᩻᩻;->᩸:Z

    if-eqz v1, :cond_15

    .line 86
    sget-boolean p3, Ll/ᩳۜ᩻;->ۖ:Z

    goto :goto_7

    .line 88
    :cond_15
    iget-boolean p3, p3, Ll/ۗ᩻᩻;->ۨ:Z

    :goto_7
    if-eqz p3, :cond_16

    .line 233
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getType()I

    move-result p3

    and-int/lit8 p3, p3, 0x9

    if-nez p3, :cond_16

    goto :goto_a

    .line 102
    :cond_16
    iget-object p3, v3, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 103
    iget-boolean v1, p3, Ll/ۗ᩻᩻;->᩸:Z

    if-eqz v1, :cond_17

    .line 104
    sget p3, Ll/ᩳۜ᩻;->ۡ:I

    goto :goto_8

    .line 106
    :cond_17
    iget p3, p3, Ll/ۗ᩻᩻;->ۤ:I

    .line 237
    :goto_8
    invoke-static {v3, p2, p3}, Ll/ۢ۠ۜ;->֫(Ll/ܰܺܳ;Ll/ᩳۜܳ;I)Ll/᩻۠ۜ;

    move-result-object p2

    .line 239
    invoke-virtual {p2}, Ll/᩻۠ۜ;->ܽ()Ll/ۜ۠ۜ;

    move-result-object p3

    sget-object v1, Ll/ۜ۠ۜ;->ۙ:Ll/ۜ۠ۜ;

    if-ne p3, v1, :cond_18

    .line 240
    invoke-virtual {p2}, Ll/᩻۠ۜ;->֫()Landroid/graphics/Bitmap;

    move-result-object p3

    invoke-static {p3}, Ll/ۨܺ᩷;->֫(Landroid/graphics/Bitmap;)Ll/ۨܺ᩷;

    move-result-object p3

    if-eqz p3, :cond_18

    return-object p3

    .line 245
    :cond_18
    invoke-virtual {p2}, Ll/᩻۠ۜ;->ܽ()Ll/ۜ۠ۜ;

    move-result-object p3

    sget-object v1, Ll/ۜ۠ۜ;->ۗ:Ll/ۜ۠ۜ;

    if-ne p3, v1, :cond_19

    .line 246
    invoke-static {v0}, Ll/ۘۘܳ;->ܿ(Ljava/lang/String;)V

    goto :goto_9

    .line 247
    :cond_19
    invoke-virtual {p2}, Ll/᩻۠ۜ;->ܽ()Ll/ۜ۠ۜ;

    move-result-object p2

    sget-object p3, Ll/ۜ۠ۜ;->᩶:Ll/ۜ۠ۜ;

    if-ne p2, p3, :cond_1a

    .line 248
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    :cond_1a
    :goto_9
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    :cond_1b
    :goto_a
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    :cond_1c
    :goto_b
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 200
    :cond_1d
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v6, :cond_1e

    .line 201
    sget-object p1, Ll/᩶ۖܳ;->ۙ֫:Ll/᩶ۖܳ;

    new-instance p3, Ll/ۡۡܳ;

    invoke-direct {p3, v1, p0, p2}, Ll/ۡۡܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0, v0, p1, p1, p3}, Ll/ᩳۜ᩻;->֫(Ljava/lang/String;Ll/᩶ۖܳ;Ll/᩶ۖܳ;Ll/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1

    .line 212
    :cond_1e
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 193
    :cond_1f
    sget-object p1, Ll/᩶ۖܳ;->ۗ:Ll/᩶ۖܳ;

    new-instance p3, Ll/֫ۜ᩻;

    invoke-direct {p3, p0, p2}, Ll/֫ۜ᩻;-><init>(Ll/ᩳۜ᩻;Ll/ᩳۜܳ;)V

    invoke-direct {p0, v0, p1, p1, p3}, Ll/ᩳۜ᩻;->֫(Ljava/lang/String;Ll/᩶ۖܳ;Ll/᩶ۖܳ;Ll/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;
    .locals 3

    .line 112
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 114
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    .line 113
    invoke-static {v1, v2, v0}, Ll/ᩴ᩸ۜ;->֫(JLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 330
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "network:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/ᩳۜ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 332
    invoke-interface {p1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v1

    .line 331
    invoke-static {v0, p1, v1, v2}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/ᩳۜܳ;J)Ljava/lang/String;

    move-result-object v0

    .line 371
    invoke-static {v0}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;)Ll/᩷᩸ۜ;

    move-result-object v0

    .line 117
    sget-object v1, Ll/᩷᩸ۜ;->ۙ:Ll/᩷᩸ۜ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 118
    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    goto :goto_0

    .line 120
    :cond_0
    sget-object v1, Ll/᩷᩸ۜ;->᩶:Ll/᩷᩸ۜ;

    if-ne v0, v1, :cond_1

    .line 385
    new-instance v0, Ll/۟᩻᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 123
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    return-object p1

    .line 125
    :cond_1
    sget-object v1, Ll/᩷᩸ۜ;->᩹:Ll/᩷᩸ۜ;

    if-ne v0, v1, :cond_2

    .line 385
    new-instance v0, Ll/۟᩻᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 128
    :cond_2
    sget-object p1, Ll/᩶ۖܳ;->ۙ֫:Ll/᩶ۖܳ;

    return-object p1

    .line 33
    :cond_3
    :goto_0
    invoke-static {p1}, Ll/ۗ۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ᩳۜܳ;)I
    .locals 9

    .line 136
    invoke-static {}, Ll/ᩳۜ᩻;->ᩳ()V

    .line 137
    invoke-direct {p0}, Ll/ᩳۜ᩻;->ۧ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 140
    :cond_0
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 141
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩸ۜ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    const/16 v2, 0x17

    if-eqz v0, :cond_6

    .line 143
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    .line 142
    invoke-static {v3, v4, v0}, Ll/ᩴ᩸ۜ;->֫(JLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v2, :cond_1

    goto :goto_0

    .line 330
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "network:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/ᩳۜ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 332
    invoke-interface {p1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v2

    .line 331
    invoke-static {v0, p1, v2, v3}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/ᩳۜܳ;J)Ljava/lang/String;

    move-result-object v0

    .line 371
    invoke-static {v0}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;)Ll/᩷᩸ۜ;

    move-result-object v0

    .line 150
    sget-object v2, Ll/᩷᩸ۜ;->ۙ:Ll/᩷᩸ۜ;

    if-ne v0, v2, :cond_2

    const/4 v0, 0x0

    .line 151
    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 152
    invoke-interface {p1, v1}, Ll/ᩳۜܳ;->ۧ(I)V

    return v1

    .line 155
    :cond_2
    sget-object v2, Ll/᩷᩸ۜ;->᩶:Ll/᩷᩸ۜ;

    if-ne v0, v2, :cond_3

    .line 385
    new-instance v0, Ll/۟᩻᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 158
    invoke-interface {p1, v1}, Ll/ᩳۜܳ;->ۧ(I)V

    return v1

    .line 161
    :cond_3
    sget-object v1, Ll/᩷᩸ۜ;->᩹:Ll/᩷᩸ۜ;

    if-ne v0, v1, :cond_4

    .line 385
    new-instance v0, Ll/۟᩻᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    :cond_4
    const/16 p1, 0xc

    return p1

    .line 145
    :cond_5
    :goto_0
    invoke-interface {p1, v1}, Ll/ᩳۜܳ;->ۧ(I)V

    return v1

    .line 166
    :cond_6
    invoke-interface {p1}, Ll/ᩳۜܳ;->۠֫()Ljava/lang/String;

    move-result-object v0

    const-string v3, "image/svg+xml"

    .line 167
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, p0, Ll/ᩳۜ᩻;->᩻:Ll/ۗۢ᩻;

    if-eqz v3, :cond_8

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v5

    .line 93
    iget-object v3, v4, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 94
    iget-boolean v7, v3, Ll/ۗ᩻᩻;->᩸:Z

    if-eqz v7, :cond_7

    .line 95
    sget-wide v7, Ll/ᩳۜ᩻;->᩷:J

    goto :goto_1

    .line 97
    :cond_7
    iget-wide v7, v3, Ll/ۗ᩻᩻;->ۗ:J

    :goto_1
    cmp-long v3, v5, v7

    if-gez v3, :cond_8

    const/4 p1, 0x2

    return p1

    :cond_8
    const-string v3, "image/"

    .line 169
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v5

    .line 93
    iget-object v3, v4, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 94
    iget-boolean v4, v3, Ll/ۗ᩻᩻;->᩸:Z

    if-eqz v4, :cond_9

    .line 95
    sget-wide v3, Ll/ᩳۜ᩻;->᩷:J

    goto :goto_2

    .line 97
    :cond_9
    iget-wide v3, v3, Ll/ۗ᩻᩻;->ۗ:J

    :goto_2
    cmp-long v7, v5, v3

    if-gez v7, :cond_a

    const/4 p1, 0x1

    return p1

    .line 171
    :cond_a
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    sget v3, Ll/ۢ۠ۜ;->֫:I

    .line 78
    invoke-static {p1}, Ll/ۤۙۜ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_3

    .line 173
    :cond_b
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v2, :cond_c

    const-string p1, "video/"

    .line 174
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_c

    :goto_3
    const/4 p1, 0x4

    return p1

    :cond_c
    :goto_4
    return v1
.end method
