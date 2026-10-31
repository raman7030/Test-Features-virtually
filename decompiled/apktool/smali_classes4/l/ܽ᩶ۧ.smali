.class public final Ll/ܽ᩶ۧ;
.super Ljava/lang/Object;
.source "19NA"


# static fields
.field public static final ֫:Ll/ۧ᩶ۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 109
    new-instance v0, Ll/֫᩶ۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܽ᩶ۧ;->֫:Ll/ۧ᩶ۧ;

    return-void
.end method

.method public static ֫(Landroid/content/Context;)V
    .locals 3

    .line 479
    new-instance v0, Ll/᩺᩹ۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ll/ܽ᩶ۧ;->֫:Ll/ۧ᩶ۧ;

    const/4 v2, 0x0

    .line 515
    invoke-static {p0, v0, v1, v2}, Ll/ܽ᩶ۧ;->֫(Landroid/content/Context;Ljava/util/concurrent/Executor;Ll/ۧ᩶ۧ;Z)V

    return-void
.end method

.method public static ֫(Landroid/content/Context;Ljava/util/concurrent/Executor;Ll/ۧ᩶ۧ;Z)V
    .locals 12

    .line 554
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 555
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 556
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 557
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    .line 558
    new-instance v0, Ljava/io/File;

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    .line 559
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v2, 0x0

    .line 562
    :try_start_0
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 571
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v9

    if-nez p3, :cond_4

    .line 367
    new-instance v3, Ljava/io/File;

    const-string v5, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    invoke-direct {v3, v9, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 368
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_2

    .line 374
    :cond_0
    :try_start_1
    new-instance v5, Ljava/io/DataInputStream;

    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v5, v6}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 375
    :try_start_2
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 376
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 382
    iget-wide v5, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v3, v10, v5

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    const/4 v5, 0x2

    const/4 v6, 0x0

    .line 384
    invoke-interface {p2, v5, v6}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v3

    .line 374
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v5

    :try_start_5
    invoke-virtual {v3, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v3
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    :goto_2
    const/4 v3, 0x0

    :cond_2
    :goto_3
    if-nez v3, :cond_3

    goto :goto_4

    .line 580
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 581
    invoke-static {p0, v2}, Ll/ۘ᩶ۧ;->֫(Landroid/content/Context;Z)V

    goto :goto_6

    .line 574
    :cond_4
    :goto_4
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 435
    new-instance v8, Ljava/io/File;

    new-instance v3, Ljava/io/File;

    const-string v5, "/data/misc/profiles/cur/0"

    invoke-direct {v3, v5, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "primary.prof"

    invoke-direct {v8, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 437
    new-instance v1, Ll/۫᩹ۧ;

    move-object v3, v1

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v3 .. v8}, Ll/۫᩹ۧ;-><init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Ll/ۧ᩶ۧ;Ljava/lang/String;Ljava/io/File;)V

    .line 440
    invoke-virtual {v1}, Ll/۫᩹ۧ;->֫()Z

    move-result p1

    if-nez p1, :cond_5

    const/4 p1, 0x0

    goto :goto_5

    .line 444
    :cond_5
    invoke-virtual {v1}, Ll/۫᩹ۧ;->ۧ()Ll/۫᩹ۧ;

    move-result-object p1

    .line 445
    invoke-virtual {p1}, Ll/۫᩹ۧ;->ܽ()V

    .line 446
    invoke-virtual {p1}, Ll/۫᩹ۧ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 449
    invoke-static {v0, v9}, Ll/ܽ᩶ۧ;->֫(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    :cond_6
    :goto_5
    if-eqz p1, :cond_7

    if-eqz p3, :cond_7

    const/4 v2, 0x1

    .line 577
    :cond_7
    invoke-static {p0, v2}, Ll/ۘ᩶ۧ;->֫(Landroid/content/Context;Z)V

    :goto_6
    return-void

    :catch_1
    move-exception p1

    const/4 p3, 0x7

    .line 564
    invoke-interface {p2, p3, p1}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    .line 568
    invoke-static {p0, v2}, Ll/ۘ᩶ۧ;->֫(Landroid/content/Context;Z)V

    return-void
.end method

.method public static ֫(Landroid/content/pm/PackageInfo;Ljava/io/File;)V
    .locals 2

    .line 394
    new-instance v0, Ljava/io/File;

    const-string v1, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 395
    :try_start_0
    new-instance p1, Ljava/io/DataOutputStream;

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p1, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 396
    :try_start_1
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 397
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p0

    .line 395
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    return-void
.end method
