.class public Ll/᩷ۧ᩻;
.super Ll/ۘۘܳ;
.source "I23M"


# static fields
.field public static final ܿ:Ll/᩷ۧ᩻;

.field public static final ᩳ:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Ll/᩷ۧ᩻;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    sput-object v0, Ll/᩷ۧ᩻;->ܿ:Ll/᩷ۧ᩻;

    const-string v0, "/data/user(_de)?/\\d+/"

    .line 40
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩷ۧ᩻;->ᩳ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ۧ()Z
    .locals 3

    .line 458
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "external_storage_thumb_enable"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;
    .locals 4

    .line 361
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "local:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 362
    invoke-interface {p0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 364
    invoke-interface {p0}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v1

    .line 363
    invoke-static {v0, p0, v1, v2}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/ᩳۜܳ;J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ᩳۜܳ;I)Ljava/lang/String;
    .locals 4

    .line 47
    invoke-virtual {p0, p1}, Ll/᩷ۧ᩻;->ܽ(Ll/ᩳۜܳ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, v0, Ll/ۜܶܿ;

    if-eqz v0, :cond_0

    .line 47
    invoke-static {}, Ll/᩷ۧ᩻;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 48
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v0

    const-wide/32 v2, 0x10000000

    cmp-long p2, v0, v2

    if-lez p2, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 353
    :cond_1
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v0

    invoke-interface {p1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v2

    sget p1, Ll/۬۫ۡ;->֫:I

    .line 51
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-static {p1}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;
    .locals 7

    .line 353
    invoke-interface {p2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    invoke-interface {p2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v3

    sget v5, Ll/۬۫ۡ;->֫:I

    .line 51
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-static {v0}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-ne p3, v1, :cond_0

    .line 195
    invoke-interface {p2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v1

    .line 194
    invoke-static {v0, p2, v1, v2}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/ᩳۜܳ;J)Ljava/lang/String;

    move-result-object v0

    .line 197
    :cond_0
    invoke-virtual {p0, p2}, Ll/᩷ۧ᩻;->ܽ(Ll/ᩳۜܳ;)Ll/ܶ᩵ܿ;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch p3, :pswitch_data_0

    .line 318
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 401
    :pswitch_0
    invoke-static {v0}, Ll/۬۫ۡ;->֫(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 402
    invoke-static {p1}, Ll/ۨܺ᩷;->֫(Landroid/graphics/Bitmap;)Ll/ۨܺ᩷;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 404
    sget-object p3, Ll/᩷᩸ۜ;->᩹:Ll/᩷᩸ۜ;

    .line 384
    invoke-static {p2}, Ll/᩷ۧ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v0

    .line 383
    invoke-static {v0, p3}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/᩷᩸ۜ;)V

    .line 391
    new-instance p3, Ll/ۛ۠ۢ;

    invoke-direct {p3, v4}, Ll/ۛ۠ۢ;-><init>(I)V

    invoke-interface {p2, p3}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    return-object p1

    .line 374
    :cond_1
    invoke-static {p2}, Ll/᩷ۧ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object p1

    .line 373
    invoke-static {p1}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;)Ll/᩷᩸ۜ;

    move-result-object p1

    .line 411
    sget-object p3, Ll/᩷᩸ۜ;->ۙ:Ll/᩷᩸ۜ;

    if-ne p1, p3, :cond_2

    .line 412
    invoke-interface {p2, v2}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 33
    invoke-static {p2}, Ll/ۗ۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 415
    :cond_2
    sget-object v5, Ll/᩷᩸ۜ;->᩶:Ll/᩷᩸ۜ;

    if-ne p1, v5, :cond_3

    .line 391
    new-instance p1, Ll/ۛ۠ۢ;

    invoke-direct {p1, v4}, Ll/ۛ۠ۢ;-><init>(I)V

    invoke-interface {p2, p1}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 418
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    :cond_3
    if-nez p1, :cond_6

    .line 422
    :try_start_0
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 423
    :try_start_1
    invoke-static {p1}, Ll/ᩴ᩸ۜ;->֫(Ljava/io/InputStream;)Ll/᩷᩸ۜ;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_4

    .line 424
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 384
    :cond_4
    invoke-static {p2}, Ll/᩷ۧ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object p1

    .line 383
    invoke-static {p1, v6}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/᩷᩸ۜ;)V

    if-ne v6, p3, :cond_6

    .line 430
    invoke-interface {p2, v2}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 33
    invoke-static {p2}, Ll/ۗ۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_5

    .line 422
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_0
    throw p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 426
    :catch_0
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 391
    :cond_6
    new-instance p1, Ll/ۛ۠ۢ;

    invoke-direct {p1, v4}, Ll/ۛ۠ۢ;-><init>(I)V

    invoke-interface {p2, p1}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 436
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 438
    sget-object p3, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    new-instance v2, Ll/ۜۧ᩻;

    invoke-direct {v2, v1, p1}, Ll/ۜۧ᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-static {v0, p3, v3, v2}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p3

    .line 448
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢ᩸ۜ;

    if-eqz p1, :cond_7

    .line 449
    invoke-virtual {p1}, Ll/ۢ᩸ۜ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 384
    invoke-static {p2}, Ll/᩷ۧ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object p1

    .line 383
    invoke-static {p1, v5}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;Ll/᩷᩸ۜ;)V

    :cond_7
    return-object p3

    .line 251
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ۜܶܿ;

    if-eqz p1, :cond_8

    .line 251
    invoke-static {}, Ll/᩷ۧ᩻;->ۧ()Z

    move-result p1

    if-nez p1, :cond_8

    .line 252
    invoke-virtual {p0, p2}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 254
    :cond_8
    sget-object p1, Ll/᩶ۖܳ;->᩷:Ll/᩶ۖܳ;

    new-instance p2, Ll/᩻ۧ᩻;

    invoke-direct {p2, v1}, Ll/᩻ۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-static {v0, p1, v4, p2}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p2

    .line 257
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    if-ne p2, p1, :cond_9

    return-object p2

    .line 260
    :cond_9
    invoke-static {p2, v0}, Ll/ۛۢۡ;->֫(Ll/ۨܺ᩷;Ljava/lang/String;)Ll/֫ۛ;

    move-result-object p1

    invoke-static {p1}, Ll/ۨܺ᩷;->֫(Ll/֫ۛ;)Ll/ۨܺ᩷;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    .line 301
    :pswitch_2
    :try_start_5
    check-cast p2, Ll/ۢۧ᩻;

    invoke-virtual {p2}, Ll/ۢۧ᩻;->ܽ()Ll/ۘܶܿ;

    move-result-object p1

    .line 302
    iget-object p1, p1, Ll/ۘܶܿ;->ܳ:Landroid/net/Uri;

    .line 303
    sget p2, Ll/ᩴܶܿ;->֫:I

    .line 131
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p2

    const-string p3, ".MTDataFilesProvider"

    invoke-virtual {p2, p3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    .line 304
    invoke-static {p1}, Ll/ᩴܶܿ;->ۧ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    .line 305
    invoke-static {p1}, Ll/ۛۢۡ;->֫(Ljava/lang/String;)Ll/֫ۛ;

    move-result-object p1

    invoke-static {p1}, Ll/ۨܺ᩷;->֫(Ll/֫ۛ;)Ll/ۨܺ᩷;

    move-result-object v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_1

    :catch_1
    nop

    :cond_a
    :goto_1
    if-nez v2, :cond_b

    .line 311
    sget-object p1, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    .line 244
    iget-object v2, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    :cond_b
    return-object v2

    :pswitch_3
    :try_start_6
    const-string p1, "r"

    .line 287
    invoke-virtual {v1, p1}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 288
    :try_start_7
    sget p2, Ll/ۛ᩷֡;->֫:I

    .line 54
    invoke-virtual {p1}, Ll/᩻ۖܽ;->length()J

    move-result-wide p2

    const-wide/16 v0, 0x28

    cmp-long v2, p2, v0

    if-lez v2, :cond_c

    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result p2

    const p3, 0x4955494d

    if-ne p2, p3, :cond_c

    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result p2

    const p3, 0x43414220

    if-ne p2, p3, :cond_c

    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result p2

    const p3, 0xa50554b

    if-ne p2, p3, :cond_c

    .line 289
    sget-object p2, Ll/᩶ۖܳ;->᩵:Ll/᩶ۖܳ;

    .line 244
    :goto_2
    iget-object p2, p2, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    goto :goto_3

    .line 291
    :cond_c
    sget-object p2, Ll/᩶ۖܳ;->ۚ:Ll/᩶ۖܳ;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_2

    .line 293
    :goto_3
    :try_start_8
    invoke-virtual {p1}, Ll/᩻ۖܽ;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    return-object p2

    :catchall_2
    move-exception p2

    .line 287
    :try_start_9
    invoke-virtual {p1}, Ll/᩻ۖܽ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p1

    :try_start_a
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p2
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2

    .line 294
    :catch_2
    sget-object p1, Ll/᩶ۖܳ;->ۚ:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 280
    :pswitch_4
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۛۢۡ;->ۧ(Ljava/lang/String;)Ll/֫ۛ;

    move-result-object p1

    invoke-static {p1}, Ll/ۨܺ᩷;->֫(Ll/֫ۛ;)Ll/ۨܺ᩷;

    move-result-object p1

    if-nez p1, :cond_d

    .line 282
    sget-object p1, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    :cond_d
    return-object p1

    .line 273
    :pswitch_5
    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۛۢۡ;->֫(Ljava/lang/String;)Ll/֫ۛ;

    move-result-object p1

    invoke-static {p1}, Ll/ۨܺ᩷;->֫(Ll/֫ۛ;)Ll/ۨܺ᩷;

    move-result-object p1

    if-nez p1, :cond_e

    .line 275
    sget-object p1, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    :cond_e
    return-object p1

    .line 264
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ۜܶܿ;

    if-eqz p1, :cond_f

    .line 264
    invoke-static {}, Ll/᩷ۧ᩻;->ۧ()Z

    move-result p1

    if-nez p1, :cond_f

    .line 265
    invoke-virtual {p0, p2}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 267
    :cond_f
    sget-object p1, Ll/᩶ۖܳ;->ᩳ֫:Ll/᩶ۖܳ;

    new-instance p2, Ll/۟ۢۡ;

    const/4 p3, 0x3

    invoke-direct {p2, p3, v1}, Ll/۟ۢۡ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, p1, v4, p2}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1

    .line 243
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ۜܶܿ;

    if-eqz p1, :cond_10

    .line 243
    invoke-static {}, Ll/᩷ۧ᩻;->ۧ()Z

    move-result p1

    if-nez p1, :cond_10

    .line 244
    invoke-virtual {p0, p2}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 246
    :cond_10
    sget-object p1, Ll/᩶ۖܳ;->ۢ:Ll/᩶ۖܳ;

    new-instance p2, Ll/ۙ۟ܳ;

    invoke-direct {p2, v1}, Ll/ۙ۟ܳ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v3, p2}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1

    .line 232
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p3, v1, Ll/ۜܶܿ;

    if-eqz p3, :cond_11

    .line 232
    invoke-static {}, Ll/᩷ۧ᩻;->ۧ()Z

    move-result p3

    if-nez p3, :cond_11

    .line 233
    invoke-virtual {p0, p2}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 235
    :cond_11
    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p3

    sget v2, Ll/ۢ۠ۜ;->֫:I

    .line 78
    invoke-static {p3}, Ll/ۤۙۜ;->ۧ(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_15

    if-nez p1, :cond_12

    .line 337
    sget-object p1, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    goto :goto_5

    :cond_12
    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object p1

    :goto_5
    const/4 p3, 0x5

    .line 338
    invoke-static {p1, p2, p3}, Ll/ۢ۠ۜ;->֫(Ll/ܰܺܳ;Ll/ᩳۜܳ;I)Ll/᩻۠ۜ;

    move-result-object p1

    .line 340
    invoke-virtual {p1}, Ll/᩻۠ۜ;->ܽ()Ll/ۜ۠ۜ;

    move-result-object p3

    sget-object v0, Ll/ۜ۠ۜ;->ۙ:Ll/ۜ۠ۜ;

    if-ne p3, v0, :cond_13

    .line 341
    invoke-virtual {p1}, Ll/᩻۠ۜ;->֫()Landroid/graphics/Bitmap;

    move-result-object p3

    invoke-static {p3}, Ll/ۨܺ᩷;->֫(Landroid/graphics/Bitmap;)Ll/ۨܺ᩷;

    move-result-object p3

    if-eqz p3, :cond_13

    return-object p3

    .line 346
    :cond_13
    invoke-virtual {p1}, Ll/᩻۠ۜ;->ܽ()Ll/ۜ۠ۜ;

    move-result-object p1

    sget-object p3, Ll/ۜ۠ۜ;->᩶:Ll/ۜ۠ۜ;

    if-ne p1, p3, :cond_14

    .line 347
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 349
    :cond_14
    invoke-virtual {p0, p2}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 238
    :cond_15
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    new-instance p2, Ll/ܳۧ᩻;

    invoke-direct {p2, v1, v3}, Ll/ܳۧ᩻;-><init>(Ll/ܶ᩵ܿ;I)V

    invoke-static {v0, p1, v4, p2}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1

    .line 220
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ۜܶܿ;

    if-eqz p1, :cond_16

    .line 220
    invoke-static {}, Ll/᩷ۧ᩻;->ۧ()Z

    move-result p1

    if-nez p1, :cond_16

    .line 221
    invoke-virtual {p0, p2}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 223
    :cond_16
    sget-object p1, Ll/᩶ۖܳ;->ۛ֫:Ll/᩶ۖܳ;

    new-instance p3, Ll/ᩳۜۢ;

    invoke-direct {p3, v1}, Ll/ᩳۜۢ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v4, p3}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p3

    .line 226
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    if-eq p3, p1, :cond_17

    const p1, 0x7f0a02a4

    .line 227
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1, v0}, Ll/ᩳۜܳ;->ۧ(ILjava/lang/Object;)V

    :cond_17
    return-object p3

    .line 212
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ۜܶܿ;

    if-eqz p1, :cond_18

    .line 212
    invoke-static {}, Ll/᩷ۧ᩻;->ۧ()Z

    move-result p1

    if-nez p1, :cond_18

    .line 213
    invoke-virtual {p0, p2}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 215
    :cond_18
    sget-object p1, Ll/᩶ۖܳ;->۬:Ll/᩶ۖܳ;

    new-instance p2, Ll/ۨۚ᩷;

    invoke-direct {p2, v1}, Ll/ۨۚ᩷;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v4, p2}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1

    .line 200
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, v1, Ll/ۜܶܿ;

    if-eqz p1, :cond_19

    .line 200
    invoke-static {}, Ll/᩷ۧ᩻;->ۧ()Z

    move-result p1

    if-nez p1, :cond_19

    .line 201
    invoke-virtual {p0, p2}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 204
    :cond_19
    invoke-interface {p2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v2

    const-wide/32 v5, 0x10000000

    cmp-long p1, v2, v5

    if-lez p1, :cond_1a

    .line 205
    invoke-virtual {p0, p2}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    .line 244
    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p1

    .line 207
    :cond_1a
    sget-object p1, Ll/᩶ۖܳ;->۬:Ll/᩶ۖܳ;

    new-instance p2, Ll/ܰܿ᩷;

    invoke-direct {p2, v1}, Ll/ܰܿ᩷;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v4, p2}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;
    .locals 3

    .line 54
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 55
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    .line 54
    invoke-static {v1, v2, v0}, Ll/ᩴ᩸ۜ;->֫(JLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 374
    invoke-static {p1}, Ll/᩷ۧ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v0

    .line 373
    invoke-static {v0}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;)Ll/᩷᩸ۜ;

    move-result-object v0

    .line 58
    sget-object v1, Ll/᩷᩸ۜ;->ۙ:Ll/᩷᩸ۜ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 59
    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    goto :goto_0

    .line 61
    :cond_0
    sget-object v1, Ll/᩷᩸ۜ;->᩶:Ll/᩷᩸ۜ;

    if-ne v0, v1, :cond_1

    .line 391
    new-instance v0, Ll/ۛ۠ۢ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۛ۠ۢ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 64
    sget-object p1, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    return-object p1

    .line 66
    :cond_1
    sget-object v1, Ll/᩷᩸ۜ;->᩹:Ll/᩷᩸ۜ;

    if-ne v0, v1, :cond_2

    .line 391
    new-instance v0, Ll/ۛ۠ۢ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۛ۠ۢ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 69
    :cond_2
    sget-object p1, Ll/᩶ۖܳ;->ۙ֫:Ll/᩶ۖܳ;

    return-object p1

    .line 33
    :cond_3
    :goto_0
    invoke-static {p1}, Ll/ۗ۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object v0

    .line 73
    sget-object v1, Ll/᩶ۖܳ;->ۚ:Ll/᩶ۖܳ;

    if-ne v0, v1, :cond_6

    .line 74
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mapping"

    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, ".bin"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 76
    sget-object p1, Ll/᩶ۖܳ;->᩸֫:Ll/᩶ۖܳ;

    return-object p1

    .line 77
    :cond_4
    instance-of v2, p1, Ll/ۢۧ᩻;

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object p1

    const-string v2, "/keys/"

    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    const-string p1, ".aes"

    .line 78
    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, ".key"

    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, ".enc"

    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, ".pk8"

    .line 79
    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, ".x509.pem"

    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 80
    :cond_5
    sget-object p1, Ll/᩶ۖܳ;->ۨ:Ll/᩶ۖܳ;

    return-object p1

    :cond_6
    return-object v0
.end method

.method public final ۧ(Ll/ᩳۜܳ;)I
    .locals 11

    .line 90
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    const/16 v1, 0x9

    const/4 v2, 0x6

    const/16 v3, 0xb

    const/4 v4, 0x5

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/16 v7, 0xc

    const/4 v8, 0x1

    const/4 v9, 0x4

    const/4 v10, 0x0

    if-eqz v0, :cond_c

    .line 91
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩸ۜ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 93
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    .line 92
    invoke-static {v1, v2, v0}, Ll/ᩴ᩸ۜ;->֫(JLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    invoke-interface {p1, v10}, Ll/ᩳۜܳ;->ۧ(I)V

    return v10

    .line 374
    :cond_0
    invoke-static {p1}, Ll/᩷ۧ᩻;->ᩳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v0

    .line 373
    invoke-static {v0}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/String;)Ll/᩷᩸ۜ;

    move-result-object v0

    .line 99
    sget-object v1, Ll/᩷᩸ۜ;->ۙ:Ll/᩷᩸ۜ;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 100
    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 101
    invoke-interface {p1, v10}, Ll/ᩳۜܳ;->ۧ(I)V

    return v10

    .line 104
    :cond_1
    sget-object v1, Ll/᩷᩸ۜ;->᩶:Ll/᩷᩸ۜ;

    if-ne v0, v1, :cond_2

    .line 391
    new-instance v0, Ll/ۛ۠ۢ;

    invoke-direct {v0, v8}, Ll/ۛ۠ۢ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    .line 107
    invoke-interface {p1, v10}, Ll/ᩳۜܳ;->ۧ(I)V

    return v10

    .line 110
    :cond_2
    sget-object v1, Ll/᩷᩸ۜ;->᩹:Ll/᩷᩸ۜ;

    if-ne v0, v1, :cond_3

    .line 391
    new-instance v0, Ll/ۛ۠ۢ;

    invoke-direct {v0, v8}, Ll/ۛ۠ۢ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ᩳۜܳ;->֫(Ll/֫ۛ;)V

    :cond_3
    return v7

    .line 115
    :cond_4
    invoke-interface {p1}, Ll/ᩳۜܳ;->۠֫()Ljava/lang/String;

    move-result-object v0

    const-string v7, "image/svg+xml"

    .line 116
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    return v6

    :cond_5
    const-string v6, "text/xml"

    .line 118
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    return v5

    :cond_6
    const-string v5, "image/"

    .line 120
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    return v8

    :cond_7
    const-string v5, "video/"

    .line 122
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    return v9

    :cond_8
    const-string v5, "application/vnd.android.package-archive"

    .line 124
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    return v4

    :cond_9
    const-string v4, "application/vnd.android.package-archives"

    .line 126
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    return v3

    :cond_a
    const-string v3, "application/mt-plugin"

    .line 128
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    return v2

    .line 130
    :cond_b
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, ".bak"

    .line 131
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    const-string v2, ".bak.bak"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    return v1

    .line 135
    :cond_c
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_27

    instance-of v0, p1, Ll/ۢۧ᩻;

    if-eqz v0, :cond_27

    move-object v0, p1

    check-cast v0, Ll/ۢۧ᩻;

    .line 136
    invoke-virtual {v0}, Ll/ۢۧ᩻;->ܿ()Z

    move-result v0

    const/16 v2, 0xa

    if-eqz v0, :cond_d

    return v2

    .line 139
    :cond_d
    invoke-interface {p1}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v2, 0x8

    const-string v3, "/data/app/"

    const/4 v4, 0x7

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "/data/data/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v1, 0x15

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "/system/product/overlay/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v1, 0x14

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "/cust/app/customized/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v1, 0x13

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "/system/data-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v1, 0x12

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "/product/data-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v1, 0x11

    goto/16 :goto_1

    :sswitch_5
    const-string v0, "/system_ext/priv-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v1, 0x10

    goto/16 :goto_1

    :sswitch_6
    const-string v0, "/data/user/0/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v1, 0xf

    goto/16 :goto_1

    :sswitch_7
    const-string v0, "/system/priv-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v1, 0xe

    goto/16 :goto_1

    :sswitch_8
    const-string v0, "/system/app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v1, 0xd

    goto/16 :goto_1

    :sswitch_9
    const-string v0, "/product/app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v1, 0xc

    goto/16 :goto_1

    :sswitch_a
    const-string v0, "/product/priv-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v1, 0xb

    goto/16 :goto_1

    :sswitch_b
    const-string v0, "/data/user/999/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v1, 0xa

    goto/16 :goto_1

    :sswitch_c
    const-string v0, "/system/product/app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "/data/user_de/0/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v1, 0x8

    goto/16 :goto_1

    :sswitch_e
    const-string v0, "/system/product/data-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_0

    :cond_1b
    const/4 v1, 0x7

    goto :goto_1

    :sswitch_f
    const-string v0, "/data/user_de/999/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_0

    :cond_1c
    const/4 v1, 0x6

    goto :goto_1

    :sswitch_10
    const-string v0, "/odm/priv-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_0

    :cond_1d
    const/4 v1, 0x5

    goto :goto_1

    :sswitch_11
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_0

    :cond_1e
    const/4 v1, 0x4

    goto :goto_1

    :sswitch_12
    const-string v0, "/product/overlay/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_0

    :cond_1f
    const/4 v1, 0x3

    goto :goto_1

    :sswitch_13
    const-string v0, "/system/product/priv-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_0

    :cond_20
    const/4 v1, 0x2

    goto :goto_1

    :sswitch_14
    const-string v0, "/cust/data-app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_0

    :cond_21
    const/4 v1, 0x1

    goto :goto_1

    :sswitch_15
    const-string v0, "/system_ext/app/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto :goto_0

    :cond_22
    const/4 v1, 0x0

    goto :goto_1

    :goto_0
    const/4 v1, -0x1

    :cond_23
    :goto_1
    packed-switch v1, :pswitch_data_0

    const-string v0, "/data/user"

    .line 172
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_24

    const/16 v0, 0x2f

    invoke-static {p1, v0}, Ll/ۢܺ֡;->֫(Ljava/lang/String;C)I

    move-result v0

    if-ne v0, v9, :cond_24

    .line 173
    sget-object v0, Ll/᩷ۧ᩻;->ᩳ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_24

    goto :goto_2

    :cond_24
    const-string v0, "/android/data/"

    .line 177
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_26

    const-string v0, "/android/obb/"

    .line 178
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_26

    const-string v0, "/android/media/"

    .line 179
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_25

    goto :goto_2

    .line 182
    :cond_25
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-static {p1}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_27

    :pswitch_0
    return v2

    :cond_26
    :goto_2
    :pswitch_1
    return v4

    :cond_27
    return v10

    :sswitch_data_0
    .sparse-switch
        -0x7e1ac2a3 -> :sswitch_15
        -0x7898485c -> :sswitch_14
        -0x6d076345 -> :sswitch_13
        -0x40e346d2 -> :sswitch_12
        -0x3ed9d5dc -> :sswitch_11
        -0x3e8f115a -> :sswitch_10
        -0x242aab7a -> :sswitch_f
        -0x2421cb60 -> :sswitch_e
        -0x215617b1 -> :sswitch_d
        -0x178a9561 -> :sswitch_c
        -0x1450043c -> :sswitch_b
        -0xfd16ae3 -> :sswitch_a
        0x3da3cfd -> :sswitch_9
        0xb700a7f -> :sswitch_8
        0xd06e8db -> :sswitch_7
        0x1ee1470d -> :sswitch_6
        0x24d4d0bd -> :sswitch_5
        0x39142d02 -> :sswitch_4
        0x55ec80c0 -> :sswitch_3
        0x5d8acfd3 -> :sswitch_2
        0x614445d0 -> :sswitch_1
        0x63c2a48f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public ܽ(Ll/ᩳۜܳ;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 322
    invoke-interface {p1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1
.end method
