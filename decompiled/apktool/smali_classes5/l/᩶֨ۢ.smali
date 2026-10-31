.class public final Ll/᩶֨ۢ;
.super Ljava/lang/Object;
.source "19AV"

# interfaces
.implements Ll/ۤۚۢ;


# static fields
.field public static final ۜ:Ljava/lang/Object;

.field public static volatile ۡ:Ll/ܶ֨ۢ;

.field public static final ۢ:Landroid/content/ServiceConnection;

.field public static final ᩷:Ll/ۨ᩶۠;

.field public static final ᩻:Ljava/util/ArrayList;


# instance fields
.field public volatile ֫:Z

.field public final ۧ:Ljava/util/concurrent/CountDownLatch;

.field public volatile ܳ:Z

.field public volatile ܽ:Ll/᩹֨ۢ;

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 47
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩶֨ۢ;->ۜ:Ljava/lang/Object;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/᩶֨ۢ;->᩻:Ljava/util/ArrayList;

    .line 49
    new-instance v0, Ll/ۨ᩶۠;

    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Ll/ܺ֨ۢ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "bin.mt.plus"

    invoke-direct {v1, v3, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ll/ۨ᩶۠;-><init>(Landroid/content/ComponentName;)V

    .line 52
    invoke-virtual {v0}, Ll/ۨ᩶۠;->֫()V

    .line 54
    invoke-virtual {v0}, Ll/ۨ᩶۠;->ۧ()V

    sput-object v0, Ll/᩶֨ۢ;->᩷:Ll/ۨ᩶۠;

    .line 62
    new-instance v0, Ll/۠֨ۢ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩶֨ۢ;->ۢ:Landroid/content/ServiceConnection;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Ll/᩶֨ۢ;->ۧ:Ljava/util/concurrent/CountDownLatch;

    .line 88
    iput-boolean v1, p0, Ll/᩶֨ۢ;->֫:Z

    const/4 v0, 0x0

    .line 90
    iput v0, p0, Ll/᩶֨ۢ;->ᩳ:I

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 6

    const-string v1, "Shizuku init error"

    const-string v2, "Shizuku init success, uid="

    const-string v0, "Shizuku reuse shared service after permission, uid="

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v3, Ljava/util/concurrent/CountDownLatch;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v3, p0, Ll/᩶֨ۢ;->ۧ:Ljava/util/concurrent/CountDownLatch;

    .line 88
    iput-boolean v4, p0, Ll/᩶֨ۢ;->֫:Z

    const/4 v3, 0x0

    .line 90
    iput v3, p0, Ll/᩶֨ۢ;->ᩳ:I

    .line 173
    invoke-static {}, Ll/ۧۨۡ;->֫()Z

    move-result v5

    if-nez v5, :cond_6

    .line 184
    invoke-virtual {p0}, Ll/᩶֨ۢ;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 185
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Shizuku reuse shared service, uid="

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Ll/᩶֨ۢ;->ܿ:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v5, 0x0

    if-eqz p2, :cond_1

    .line 152
    invoke-static {v4, v5}, Ll/ۤ֨ۢ;->֫(ZLl/ܳ֨ۢ;)Z

    move-result p2

    goto :goto_0

    .line 159
    :cond_1
    invoke-static {v3, v5}, Ll/ۤ֨ۢ;->֫(ZLl/ܳ֨ۢ;)Z

    move-result p2

    :goto_0
    if-eqz p2, :cond_5

    .line 192
    :try_start_0
    invoke-virtual {p0}, Ll/᩶֨ۢ;->ܿ()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 193
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Ll/᩶֨ۢ;->ܿ:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 713
    :cond_2
    sget-object p2, Ll/᩶֨ۢ;->ۜ:Ljava/lang/Object;

    move-object v0, p2

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 714
    :try_start_1
    sget-object p2, Ll/᩶֨ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 715
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 717
    :cond_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    :try_start_2
    sget-object p2, Ll/᩶֨ۢ;->᩷:Ll/ۨ᩶۠;

    sget-object v0, Ll/᩶֨ۢ;->ۢ:Landroid/content/ServiceConnection;

    invoke-static {p2, v0}, Ll/᩺᩶۠;->֫(Ll/ۨ᩶۠;Landroid/content/ServiceConnection;)V

    .line 199
    iput-boolean v4, p0, Ll/᩶֨ۢ;->ܳ:Z

    .line 200
    invoke-direct {p0, p1}, Ll/᩶֨ۢ;->֫(Z)V

    .line 201
    iget-object p1, p0, Ll/᩶֨ۢ;->ܽ:Ll/᩹֨ۢ;

    if-eqz p1, :cond_4

    .line 204
    iget-object p1, p0, Ll/᩶֨ۢ;->ܽ:Ll/᩹֨ۢ;

    check-cast p1, Ll/ܶ֨ۢ;

    .line 114
    iget-object p1, p1, Ll/ܶ֨ۢ;->֫:Ll/۟ۚۢ;

    invoke-interface {p1}, Ll/۟ۚۢ;->֫()I

    move-result p1

    .line 204
    iput p1, p0, Ll/᩶֨ۢ;->ܿ:I

    .line 205
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Ll/᩶֨ۢ;->ܿ:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 202
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Shizuku service unavailable"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catchall_0
    move-exception p1

    .line 717
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 553
    invoke-direct {p0, v4}, Ll/᩶֨ۢ;->ۧ(Z)V

    .line 212
    invoke-static {v1, p1}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 213
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_1

    :catch_3
    move-exception p1

    .line 553
    :goto_1
    invoke-direct {p0, v4}, Ll/᩶֨ۢ;->ۧ(Z)V

    .line 208
    invoke-static {v1, p1}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 209
    throw p1

    .line 189
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Shizuku permission denied"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 174
    :cond_6
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Ll/ۖ֨ۢ;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Ll/ۖ֨ۢ;-><init>(I)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 182
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Shizuku can not init in main thread"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 3

    .line 499
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_1

    .line 511
    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 512
    :try_start_0
    new-instance p1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {p1, p0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 513
    :try_start_1
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/16 v0, 0x400

    :try_start_2
    new-array v0, v0, [B

    .line 516
    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x0

    .line 517
    invoke-virtual {p2, v0, v2, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 519
    :cond_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 520
    :try_start_3
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {p1}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    .line 511
    :try_start_5
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    :try_start_6
    invoke-virtual {v0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p2

    :try_start_7
    invoke-virtual {p1}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p1

    :try_start_8
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception p1

    :try_start_9
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1

    .line 503
    :cond_1
    invoke-virtual {p2, p0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    const-string p0, ""

    return-object p0
.end method

.method private ֫(Ll/᩸֨ۢ;)Ll/۫ۚۢ;
    .locals 4

    .line 449
    iget-boolean v0, p1, Ll/᩸֨ۢ;->ܽ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 553
    invoke-direct {p0, v1}, Ll/᩶֨ۢ;->ۧ(Z)V

    .line 451
    iget-object p1, p1, Ll/᩸֨ۢ;->֫:Ll/۫ۚۢ;

    return-object p1

    .line 453
    :cond_0
    iget v0, p1, Ll/᩸֨ۢ;->ۧ:I

    if-ne v0, v1, :cond_2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 527
    :try_start_0
    iget v2, p0, Ll/᩶֨ۢ;->ᩳ:I

    add-int/2addr v2, v1

    iput v2, p0, Ll/᩶֨ۢ;->ᩳ:I

    const/4 v3, 0x3

    if-lt v2, v3, :cond_1

    .line 553
    invoke-direct {p0, v1}, Ll/᩶֨ۢ;->ۧ(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 530
    :cond_1
    monitor-exit v0

    .line 455
    iget-object p1, p1, Ll/᩸֨ۢ;->֫:Ll/۫ۚۢ;

    return-object p1

    :catchall_0
    move-exception p1

    .line 530
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 457
    :cond_2
    invoke-direct {p0}, Ll/᩶֨ۢ;->ܺ()V

    .line 458
    iget-object p1, p1, Ll/᩸֨ۢ;->֫:Ll/۫ۚۢ;

    return-object p1
.end method

.method public static ֫(Landroid/os/Bundle;)Ll/᩸֨ۢ;
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-nez p0, :cond_0

    .line 487
    new-instance p0, Ll/᩸֨ۢ;

    new-instance v2, Ll/۫ۚۢ;

    new-array v3, v1, [Ljava/lang/String;

    const-string v4, "Empty result"

    invoke-direct {v2, v4, v3}, Ll/۫ۚۢ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 136
    invoke-direct {p0, v0, v2, v1}, Ll/᩸֨ۢ;-><init>(ILl/۫ۚۢ;Z)V

    return-object p0

    :cond_0
    const-string v2, "status"

    .line 489
    invoke-virtual {p0, v2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "output"

    const-string v3, "output_gzip"

    .line 490
    invoke-static {v2, v3, p0}, Ll/᩶֨ۢ;->֫(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "error"

    const-string v4, "error_gzip"

    .line 491
    invoke-static {v3, v4, p0}, Ll/᩶֨ۢ;->֫(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p0

    .line 492
    new-instance v3, Ll/᩸֨ۢ;

    new-instance v4, Ll/۫ۚۢ;

    const-string v5, "\n"

    .line 53
    invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, p0, v2}, Ll/۫ۚۢ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 136
    invoke-direct {v3, v0, v4, v1}, Ll/᩸֨ۢ;-><init>(ILl/۫ۚۢ;Z)V

    return-object v3
.end method

.method public static ֫(Ll/᩹֨ۢ;Ljava/lang/String;J)Ll/᩸֨ۢ;
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "sh"

    .line 415
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\nexit\n"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-wide/32 v4, 0x7fffffff

    cmp-long v6, p2, v4

    if-lez v6, :cond_0

    const p2, 0x7fffffff

    goto :goto_0

    :cond_0
    long-to-int p2, p2

    :goto_0
    check-cast p0, Ll/ܶ֨ۢ;

    .line 119
    iget-object p0, p0, Ll/ܶ֨ۢ;->֫:Ll/۟ۚۢ;

    invoke-interface {p0, p2, v3, p1}, Ll/۟ۚۢ;->֫(ILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    .line 416
    invoke-static {p0}, Ll/᩶֨ۢ;->֫(Landroid/os/Bundle;)Ll/᩸֨ۢ;

    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 420
    new-instance p1, Ll/۫ۚۢ;

    new-array p2, v2, [Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, p2}, Ll/۫ۚۢ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 152
    new-instance p0, Ll/᩸֨ۢ;

    invoke-direct {p0, v1, p1, v0}, Ll/᩸֨ۢ;-><init>(ILl/۫ۚۢ;Z)V

    goto :goto_1

    :catch_1
    move-exception p0

    .line 418
    new-instance p1, Ll/۫ۚۢ;

    new-array p2, v2, [Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, p2}, Ll/۫ۚۢ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 152
    new-instance p0, Ll/᩸֨ۢ;

    invoke-direct {p0, v1, p1, v0}, Ll/᩸֨ۢ;-><init>(ILl/۫ۚۢ;Z)V

    :goto_1
    return-object p0
.end method

.method public static ֫(Ll/۬۬ܿ;)V
    .locals 3

    :try_start_0
    const-string v0, "Shell.create shizuku (try again)"

    .line 264
    invoke-static {v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 265
    new-instance v0, Ll/᩶֨ۢ;

    const/4 v1, 0x1

    .line 166
    invoke-direct {v0, v1, v1}, Ll/᩶֨ۢ;-><init>(ZZ)V

    .line 281
    invoke-static {v0}, Ll/ۢ֨ۢ;->֫(Ll/᩶֨ۢ;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 565
    invoke-direct {v0, v1}, Ll/᩶֨ۢ;->ۧ(Z)V

    :goto_0
    if-eqz v1, :cond_1

    .line 267
    new-instance v0, Ll/ܺ֨ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܺ֨ܿ;-><init>(I)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 272
    :cond_1
    new-instance v0, Ll/᩺ۤᩳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/᩺ۤᩳ;-><init>(ILjava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    const-string v1, "Shell.error"

    .line 270
    invoke-static {v1, v0}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 272
    new-instance v0, Ll/᩺ۤᩳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/᩺ۤᩳ;-><init>(ILjava/lang/Object;)V

    :goto_1
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    :catchall_1
    move-exception v0

    new-instance v1, Ll/᩺ۤᩳ;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/᩺ۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 273
    throw v0
.end method

.method public static ֫(Ll/ܳ֨ۢ;)V
    .locals 2

    .line 230
    invoke-static {}, Ll/ۧۨۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/֨֨ۢ;

    invoke-direct {v1, p0}, Ll/֨֨ۢ;-><init>(Ll/ܳ֨ۢ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 240
    :cond_0
    sget-object v0, Ll/᩶֨ۢ;->ۡ:Ll/ܶ֨ۢ;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 166
    invoke-static {v0, p0}, Ll/ۤ֨ۢ;->֫(ZLl/ܳ֨ۢ;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 246
    sget-object p0, Ll/᩶֨ۢ;->ۡ:Ll/ܶ֨ۢ;

    if-eqz p0, :cond_2

    goto :goto_0

    .line 249
    :cond_2
    sget-object p0, Ll/᩶֨ۢ;->᩷:Ll/ۨ᩶۠;

    sget-object v0, Ll/᩶֨ۢ;->ۢ:Landroid/content/ServiceConnection;

    invoke-static {p0, v0}, Ll/᩺᩶۠;->֫(Ll/ۨ᩶۠;Landroid/content/ServiceConnection;)V

    .line 251
    :try_start_0
    invoke-static {}, Ll/᩶֨ۢ;->ᩴ()Z

    move-result p0

    if-eqz p0, :cond_3

    :goto_0
    return-void

    .line 252
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Shizuku prewarm timeout"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 255
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 256
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Shizuku prewarm interrupted"

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 244
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Shizuku permission denied"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܶ֨ۢ;)V
    .locals 0

    .line 689
    sput-object p0, Ll/᩶֨ۢ;->ۡ:Ll/ܶ֨ۢ;

    return-void
.end method

.method public static ֫(Ll/᩶֨ۢ;Ll/ܶ֨ۢ;)V
    .locals 1

    .line 742
    iget-boolean v0, p0, Ll/᩶֨ۢ;->֫:Z

    if-nez v0, :cond_0

    return-void

    .line 745
    :cond_0
    iput-object p1, p0, Ll/᩶֨ۢ;->ܽ:Ll/᩹֨ۢ;

    const/4 p1, 0x1

    .line 746
    iput-boolean p1, p0, Ll/᩶֨ۢ;->ܳ:Z

    .line 747
    iget-object p0, p0, Ll/᩶֨ۢ;->ۧ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method private ֫(Z)V
    .locals 16

    move-object/from16 v0, p0

    .line 296
    iget-object v1, v0, Ll/᩶֨ۢ;->ۧ:Ljava/util/concurrent/CountDownLatch;

    const-wide/16 v2, 0x1388

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v2, "Shizuku bind callback timeout"

    .line 299
    invoke-static {v2}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 334
    invoke-static {}, Ll/᩶֨ۢ;->ۡ()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x2710

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    add-long/2addr v8, v2

    const/4 v2, 0x0

    .line 337
    :cond_1
    :goto_0
    invoke-static {}, Ll/᩶֨ۢ;->ۡ()J

    move-result-wide v10

    sub-long v10, v8, v10

    const-wide/16 v12, 0xc8

    const-wide/16 v14, 0x1

    cmp-long v3, v10, v4

    if-gtz v3, :cond_7

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const-string v2, "Shizuku callback still pending, request connected callback again"

    .line 318
    invoke-static {v2}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 610
    sget-object v2, Ll/᩶֨ۢ;->᩷:Ll/ۨ᩶۠;

    sget-object v3, Ll/᩶֨ۢ;->ۢ:Landroid/content/ServiceConnection;

    invoke-static {v2, v3}, Ll/᩺᩶۠;->֫(Ll/ۨ᩶۠;Landroid/content/ServiceConnection;)V

    const/4 v2, 0x1

    .line 611
    iput-boolean v2, v0, Ll/᩶֨ۢ;->ܳ:Z

    .line 353
    invoke-static {}, Ll/᩶֨ۢ;->ۡ()J

    move-result-wide v2

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    add-long/2addr v6, v2

    .line 354
    :cond_3
    invoke-static/range {p0 .. p0}, Ll/᩶֨ۢ;->֫(Ll/᩶֨ۢ;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 355
    invoke-static {}, Ll/᩶֨ۢ;->ۡ()J

    move-result-wide v2

    sub-long v2, v6, v2

    cmp-long v8, v2, v4

    if-gtz v8, :cond_4

    goto :goto_1

    .line 359
    :cond_4
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    .line 360
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v8}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_5
    :goto_1
    const-string v1, "Shizuku timeout"

    .line 303
    invoke-static {v1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    if-eqz p1, :cond_6

    .line 383
    new-instance v2, Ll/᩵֨ۢ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 307
    :cond_6
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 341
    :cond_7
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    .line 342
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v10, v11, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v3

    if-eqz v3, :cond_8

    :goto_2
    return-void

    :cond_8
    if-nez v2, :cond_1

    .line 345
    invoke-static/range {p0 .. p0}, Ll/᩶֨ۢ;->֫(Ll/᩶֨ۢ;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static ֫(Ll/᩶֨ۢ;)Z
    .locals 2

    const/4 p0, 0x0

    .line 372
    :try_start_0
    sget-object v0, Ll/᩶֨ۢ;->᩷:Ll/ۨ᩶۠;

    invoke-static {v0}, Ll/᩺᩶۠;->֫(Ll/ۨ᩶۠;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz v0, :cond_0

    const/4 p0, 0x1

    :cond_0
    return p0

    :catch_0
    move-exception v0

    const-string v1, "Shizuku peek user service error"

    .line 374
    invoke-static {v1, v0}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    return p0
.end method

.method public static ۖ()[Ll/᩶֨ۢ;
    .locals 3

    .line 733
    sget-object v0, Ll/᩶֨ۢ;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 734
    :try_start_0
    sget-object v1, Ll/᩶֨ۢ;->᩻:Ljava/util/ArrayList;

    const/4 v2, 0x0

    new-array v2, v2, [Ll/᩶֨ۢ;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/᩶֨ۢ;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 735
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private ۘ()V
    .locals 2

    .line 724
    sget-object v0, Ll/᩶֨ۢ;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 725
    :try_start_0
    sget-object v1, Ll/᩶֨ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 726
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static bridge synthetic ۜ()[Ll/᩶֨ۢ;
    .locals 1

    .line 0
    invoke-static {}, Ll/᩶֨ۢ;->ۖ()[Ll/᩶֨ۢ;

    move-result-object v0

    return-object v0
.end method

.method public static ۡ()J
    .locals 3

    .line 479
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static ۢ()Z
    .locals 2

    .line 593
    sget-object v0, Ll/᩶֨ۢ;->ۡ:Ll/ܶ֨ۢ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 114
    :cond_0
    :try_start_0
    iget-object v0, v0, Ll/ܶ֨ۢ;->֫:Ll/۟ۚۢ;

    invoke-interface {v0}, Ll/۟ۚۢ;->֫()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    .line 601
    :catch_0
    invoke-static {}, Ll/᩶֨ۢ;->᩷()V

    return v1
.end method

.method private declared-synchronized ۧ(Z)V
    .locals 2

    move-object v0, p0

    monitor-enter v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 664
    :try_start_0
    iget-boolean p1, p0, Ll/᩶֨ۢ;->ܳ:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 665
    :goto_0
    iput-boolean v1, p0, Ll/᩶֨ۢ;->֫:Z

    .line 666
    invoke-direct {p0}, Ll/᩶֨ۢ;->ۘ()V

    .line 667
    iput-boolean v1, p0, Ll/᩶֨ۢ;->ܳ:Z

    const/4 v1, 0x0

    .line 668
    iput-object v1, p0, Ll/᩶֨ۢ;->ܽ:Ll/᩹֨ۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 679
    :try_start_1
    sget-object p1, Ll/᩶֨ۢ;->᩷:Ll/ۨ᩶۠;

    invoke-static {p1}, Ll/᩺᩶۠;->ۧ(Ll/ۨ᩶۠;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 682
    :catch_0
    :try_start_2
    invoke-static {}, Ll/᩶֨ۢ;->᩷()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 672
    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public static ܳ()V
    .locals 3

    .line 176
    :try_start_0
    new-instance v0, Ll/᩶֨ۢ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 166
    invoke-direct {v0, v2, v1}, Ll/᩶֨ۢ;-><init>(ZZ)V

    .line 281
    invoke-static {v0}, Ll/ۢ֨ۢ;->֫(Ll/᩶֨ۢ;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 565
    :cond_0
    invoke-direct {v0, v2}, Ll/᩶֨ۢ;->ۧ(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private declared-synchronized ܺ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 536
    :try_start_0
    iput v1, p0, Ll/᩶֨ۢ;->ᩳ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 537
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

.method public static ᩴ()Z
    .locals 11

    const-string v0, "Shizuku peek shared user service error"

    .line 618
    invoke-static {}, Ll/᩶֨ۢ;->ۡ()J

    move-result-wide v1

    const-wide/16 v3, 0x1388

    add-long/2addr v1, v3

    .line 620
    :goto_0
    sget-object v3, Ll/᩶֨ۢ;->ۡ:Ll/ܶ֨ۢ;

    if-eqz v3, :cond_0

    goto :goto_3

    .line 623
    :cond_0
    invoke-static {}, Ll/᩶֨ۢ;->ۡ()J

    move-result-wide v3

    sub-long v3, v1, v3

    const-wide/16 v5, 0xc8

    const-wide/16 v7, 0x0

    cmp-long v9, v3, v7

    if-gtz v9, :cond_5

    const/4 v1, 0x0

    .line 653
    :try_start_0
    sget-object v2, Ll/᩶֨ۢ;->᩷:Ll/ۨ᩶۠;

    invoke-static {v2}, Ll/᩺᩶۠;->֫(Ll/ۨ᩶۠;)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    if-ltz v3, :cond_4

    const-string v3, "Shizuku shared callback still pending, request connected callback again"

    .line 632
    invoke-static {v3}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 633
    sget-object v3, Ll/᩶֨ۢ;->ۢ:Landroid/content/ServiceConnection;

    invoke-static {v2, v3}, Ll/᩺᩶۠;->֫(Ll/ۨ᩶۠;Landroid/content/ServiceConnection;)V

    .line 634
    invoke-static {}, Ll/᩶֨ۢ;->ۡ()J

    move-result-wide v2

    const-wide/16 v9, 0x2710

    add-long/2addr v2, v9

    .line 653
    :goto_1
    :try_start_1
    sget-object v4, Ll/᩶֨ۢ;->᩷:Ll/ۨ᩶۠;

    invoke-static {v4}, Ll/᩺᩶۠;->֫(Ll/ۨ᩶۠;)I

    move-result v4
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    if-ltz v4, :cond_3

    .line 636
    sget-object v4, Ll/᩶֨ۢ;->ۡ:Ll/ܶ֨ۢ;

    if-eqz v4, :cond_1

    goto :goto_3

    .line 639
    :cond_1
    invoke-static {}, Ll/᩶֨ۢ;->ۡ()J

    move-result-wide v9

    sub-long v9, v2, v9

    cmp-long v4, v9, v7

    if-gtz v4, :cond_2

    goto :goto_2

    .line 643
    :cond_2
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_1

    :catch_0
    move-exception v2

    .line 655
    invoke-static {v0, v2}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 645
    :cond_3
    :goto_2
    sget-object v0, Ll/᩶֨ۢ;->ۡ:Ll/ܶ֨ۢ;

    if-eqz v0, :cond_4

    :goto_3
    const/4 v0, 0x1

    return v0

    :cond_4
    return v1

    :catch_1
    move-exception v2

    .line 655
    invoke-static {v0, v2}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1

    .line 627
    :cond_5
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_0
.end method

.method public static ᩷()V
    .locals 7

    const/4 v0, 0x0

    .line 696
    sput-object v0, Ll/᩶֨ۢ;->ۡ:Ll/ܶ֨ۢ;

    .line 704
    invoke-static {}, Ll/᩶֨ۢ;->ۖ()[Ll/᩶֨ۢ;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    .line 754
    iget-boolean v6, v5, Ll/᩶֨ۢ;->֫:Z

    if-nez v6, :cond_0

    goto :goto_1

    .line 757
    :cond_0
    iput-boolean v3, v5, Ll/᩶֨ۢ;->ܳ:Z

    .line 758
    iput-object v0, v5, Ll/᩶֨ۢ;->ܽ:Ll/᩹֨ۢ;

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static bridge synthetic ᩻()V
    .locals 0

    .line 0
    invoke-static {}, Ll/᩶֨ۢ;->᩷()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 546
    invoke-direct {p0, v0}, Ll/᩶֨ۢ;->ۧ(Z)V

    return-void
.end method

.method public final getUid()I
    .locals 1

    .line 541
    iget v0, p0, Ll/᩶֨ۢ;->ܿ:I

    return v0
.end method

.method public final ֫(JLjava/lang/String;)Ll/۫ۚۢ;
    .locals 11

    .line 410
    iget-object v0, p0, Ll/᩶֨ۢ;->ܽ:Ll/᩹֨ۢ;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 413
    new-instance v2, Ll/ۘ֨ۢ;

    invoke-direct {v2, v0, p3, p1, p2}, Ll/ۘ֨ۢ;-><init>(Ll/᩹֨ۢ;Ljava/lang/String;J)V

    .line 423
    sget-object p3, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/ᩴ֨ۢ;

    invoke-direct {v0, v2}, Ll/ᩴ֨ۢ;-><init>(Ll/ۘ֨ۢ;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p3

    const-wide/16 v2, 0x0

    const/4 v0, 0x1

    cmp-long v4, p1, v2

    if-gtz v4, :cond_0

    move-wide v6, v2

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x4

    .line 468
    :try_start_0
    div-long v4, p1, v4

    const-wide/16 v6, 0x5dc

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-wide/16 v6, 0x12c

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    const-wide v6, 0x7fffffffffffffffL

    sub-long v8, v6, v4

    cmp-long v10, p1, v8

    if-ltz v10, :cond_1

    goto :goto_0

    :cond_1
    add-long v6, p1, v4

    :goto_0
    cmp-long p1, v6, v2

    if-lez p1, :cond_2

    .line 426
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p3, v6, v7, p1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-interface {p3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    :goto_1
    check-cast p1, Ll/᩸֨ۢ;

    .line 427
    invoke-direct {p0, p1}, Ll/᩶֨ۢ;->֫(Ll/᩸֨ۢ;)Ll/۫ۚۢ;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 436
    :catch_0
    invoke-interface {p3, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 553
    invoke-direct {p0, v0}, Ll/᩶֨ۢ;->ۧ(Z)V

    .line 439
    new-instance p1, Ll/۫ۚۢ;

    new-array p2, v1, [Ljava/lang/String;

    const-string p3, "Binder response timeout"

    invoke-direct {p1, p3, p2}, Ll/۫ۚۢ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-object p1

    :catch_1
    move-exception p1

    .line 432
    invoke-interface {p3, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 433
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 434
    new-instance p2, Ll/۫ۚۢ;

    new-array p3, v1, [Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p3}, Ll/۫ۚۢ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-object p2

    :catch_2
    move-exception p1

    .line 429
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 442
    :cond_3
    new-instance p1, Ll/۫ۚۢ;

    new-array p2, v1, [Ljava/lang/String;

    const-string p3, "Closed"

    invoke-direct {p1, p3, p2}, Ll/۫ۚۢ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/۫ۚۢ;
    .locals 1

    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, p1, v0}, Ll/᩶֨ۢ;->֫(Ljava/lang/String;Z)Ll/۫ۚۢ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Z)Ll/۫ۚۢ;
    .locals 2

    if-eqz p2, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1f40

    .line 15
    :goto_0
    invoke-virtual {p0, v0, v1, p1}, Ll/᩶֨ۢ;->֫(JLjava/lang/String;)Ll/۫ۚۢ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Z
    .locals 1

    .line 558
    iget-boolean v0, p0, Ll/᩶֨ۢ;->֫:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩶֨ۢ;->ܽ:Ll/᩹֨ۢ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 35
    invoke-virtual {p0}, Ll/᩶֨ۢ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0}, Ll/᩶֨ۢ;->getUid()I

    move-result v0

    if-eqz v0, :cond_2

    const/16 v1, 0x7d0

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 27
    invoke-virtual {p0}, Ll/᩶֨ۢ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩶֨ۢ;->getUid()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()Z
    .locals 4

    .line 572
    sget-object v0, Ll/᩶֨ۢ;->ۡ:Ll/ܶ֨ۢ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 114
    :cond_0
    :try_start_0
    iget-object v2, v0, Ll/ܶ֨ۢ;->֫:Ll/۟ۚۢ;

    invoke-interface {v2}, Ll/۟ۚۢ;->֫()I

    move-result v2

    .line 577
    iput v2, p0, Ll/᩶֨ۢ;->ܿ:I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 582
    iput-object v0, p0, Ll/᩶֨ۢ;->ܽ:Ll/᩹֨ۢ;

    const/4 v1, 0x1

    .line 583
    iput-boolean v1, p0, Ll/᩶֨ۢ;->ܳ:Z

    .line 713
    sget-object v0, Ll/᩶֨ۢ;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 714
    :try_start_1
    sget-object v2, Ll/᩶֨ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 715
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 717
    :cond_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 585
    iget-object v0, p0, Ll/᩶֨ۢ;->ۧ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return v1

    :catchall_0
    move-exception v1

    .line 717
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    .line 579
    :catch_0
    invoke-static {}, Ll/᩶֨ۢ;->᩷()V

    return v1
.end method

.method public final ᩳ()Z
    .locals 2

    .line 31
    invoke-virtual {p0}, Ll/᩶֨ۢ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩶֨ۢ;->getUid()I

    move-result v0

    const/16 v1, 0x7d0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
