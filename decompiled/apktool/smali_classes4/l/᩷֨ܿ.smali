.class public final Ll/᩷֨ܿ;
.super Ljava/lang/Object;
.source "LAQJ"


# static fields
.field public static final ֫:Ll/ۚۡ֫;

.field public static final ۧ:Ll/ۚۡ֫;

.field public static final ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final ܿ:Ll/ܽ֨ܿ;

.field public static final ᩳ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 85
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩷֨ܿ;->ᩳ:Ljava/lang/Object;

    .line 86
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    sput-object v0, Ll/᩷֨ܿ;->ۧ:Ll/ۚۡ֫;

    .line 87
    sput-object v0, Ll/᩷֨ܿ;->֫:Ll/ۚۡ֫;

    .line 90
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/16 v1, 0x5349

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Ll/᩷֨ܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 91
    new-instance v0, Ll/ܽ֨ܿ;

    .line 126
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 91
    sput-object v0, Ll/᩷֨ܿ;->ܿ:Ll/ܽ֨ܿ;

    return-void
.end method

.method public static bridge synthetic ֫()Ll/ۚۡ֫;
    .locals 1

    .line 0
    sget-object v0, Ll/᩷֨ܿ;->ۧ:Ll/ۚۡ֫;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 2

    const-string v0, "Success"

    .line 1489
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "Completed with warning(s)"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "INSTALL_FAILED_VERSION_DOWNGRADE"

    .line 1490
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "INSTALL_FAILED_UPDATE_INCOMPATIBLE"

    .line 1492
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "INSTALL_FAILED_OLDER_SDK"

    .line 1494
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "INSTALL_FAILED_USER_RESTRICTED"

    .line 1496
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1497
    new-instance p0, Ljava/util/concurrent/CancellationException;

    invoke-direct {p0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw p0

    .line 1499
    :cond_0
    new-instance v0, Ll/֡֨ܿ;

    const v1, 0x7f120050

    invoke-direct {v0, v1, p0}, Ll/֡֨ܿ;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0}, Ll/֡֨ܿ;->ܿ()V

    throw v0

    .line 1495
    :cond_1
    new-instance v0, Ll/֡֨ܿ;

    const v1, 0x7f120051

    invoke-direct {v0, v1, p0}, Ll/֡֨ܿ;-><init>(ILjava/lang/String;)V

    throw v0

    .line 1493
    :cond_2
    new-instance v0, Ll/֡֨ܿ;

    const v1, 0x7f120052

    invoke-direct {v0, v1, p0}, Ll/֡֨ܿ;-><init>(ILjava/lang/String;)V

    throw v0

    .line 1491
    :cond_3
    new-instance v0, Ll/֡֨ܿ;

    const v1, 0x7f120053

    invoke-direct {v0, v1, p0}, Ll/֡֨ܿ;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0}, Ll/֡֨ܿ;->ᩳ()V

    throw v0

    :cond_4
    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1457
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const v1, 0x7f1204ba

    if-nez v0, :cond_3

    .line 1458
    invoke-virtual {p0}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    .line 1459
    sget-object v2, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-eq v0, v2, :cond_1

    .line 1460
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, p2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 1461
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    .line 1462
    invoke-virtual {v3, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 1463
    invoke-virtual {v3, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    if-eqz v2, :cond_0

    .line 1465
    new-instance v4, Ll/ᩳۚܿ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0, v2}, Ll/ᩳۚܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x7f120510

    invoke-virtual {v3, v2, v4}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f120189

    .line 1471
    invoke-virtual {v3, v2, p1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0

    :cond_0
    const v2, 0x7f12070a

    .line 1473
    invoke-virtual {v3, v2, p1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    :goto_0
    const v2, 0x7f12008f

    .line 1475
    invoke-virtual {v3, v2, p1}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1476
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 1477
    invoke-virtual {p1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    new-instance v2, Ll/᩹֡ۡ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0, p2}, Ll/᩹֡ۡ;-><init>(ILl/ۗܺ᩷;Ljava/lang/Object;)V

    .line 1478
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1480
    :cond_1
    sget-object p0, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    if-eq v0, p0, :cond_2

    .line 1481
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_2
    return-void

    .line 1484
    :cond_3
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 8

    .line 244
    new-instance v7, Ll/ۧ֨ܿ;

    .line 21
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "ais"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    .line 244
    invoke-direct/range {v0 .. v6}, Ll/ۧ֨ܿ;-><init>(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 1535
    sget-object p0, Ll/ۛۚܿ;->ۙ:Ll/ۛۚܿ;

    .line 1538
    invoke-virtual {v7, p0}, Ll/ۧ֨ܿ;->֫(Ll/ۛۚܿ;)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/util/List;)V
    .locals 10

    if-eqz p2, :cond_0

    .line 180
    new-instance v7, Ll/ۧ֨ܿ;

    .line 21
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "ais"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    .line 180
    invoke-direct/range {v0 .. v6}, Ll/ۧ֨ܿ;-><init>(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 1535
    sget-object p0, Ll/ۛۚܿ;->ۙ:Ll/ۛۚܿ;

    .line 1538
    invoke-virtual {v7, p0}, Ll/ۧ֨ܿ;->֫(Ll/ۛۚܿ;)V

    return-void

    .line 183
    :cond_0
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result p2

    if-nez p2, :cond_1

    .line 185
    new-instance p2, Ll/᩵۫᩻;

    const/4 v0, 0x3

    invoke-direct {p2, v0, p0, p1}, Ll/᩵۫᩻;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    const/4 p2, 0x0

    .line 45
    :try_start_0
    new-instance v0, Ll/ᩳܰۡ;

    invoke-direct {v0, p1}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :try_start_1
    invoke-static {v0}, Ll/ܶܶۡ;->ܽ(Ll/ᩳܰۡ;)Ljava/util/ArrayList;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 197
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/CharSequence;

    .line 198
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v8, v1, [Z

    const/4 v1, 0x0

    .line 199
    :goto_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 200
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ܶۡ;

    .line 201
    invoke-virtual {v2}, Ll/۠ܶۡ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    .line 202
    invoke-virtual {v2}, Ll/۠ܶۡ;->֫()Z

    move-result v2

    aput-boolean v2, v8, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 205
    :cond_2
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    const v2, 0x7f1204b2

    .line 206
    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v2, Ll/᩺֡ܿ;

    invoke-direct {v2, v7, v8}, Ll/᩺֡ܿ;-><init>(Ljava/util/ArrayList;[Z)V

    .line 207
    invoke-virtual {v1, v0, v8, v2}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)V

    const v0, 0x7f12070a

    .line 220
    invoke-virtual {v1, v0, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const v2, 0x7f120918

    .line 0
    invoke-static {v1, v0, p2, v2, p2}, Ll/ۛۙܽ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object p2

    .line 224
    invoke-virtual {p2}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v9, Ll/ܰ֡ܿ;

    move-object v1, v9

    move-object v2, v7

    move-object v3, v8

    move-object v4, p2

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Ll/ܰ֡ܿ;-><init>(Ljava/util/ArrayList;[ZLl/֡ۚۢ;Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;)V

    invoke-virtual {v0, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 233
    invoke-virtual {p2}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p0

    new-instance p1, Ll/۟֡ܿ;

    invoke-direct {p1, v8, v7, p2}, Ll/۟֡ܿ;-><init>([ZLjava/util/ArrayList;Ll/֡ۚۢ;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :catchall_0
    move-exception p1

    .line 45
    :try_start_3
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 546
    invoke-virtual {p0, p1, p2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/util/List;)V
    .locals 1

    .line 775
    new-instance v0, Ll/ᩳܰۡ;

    invoke-direct {v0, p0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 776
    :try_start_0
    new-instance p0, Ll/᩺ۚܿ;

    invoke-direct {p0}, Ll/᩺ۚܿ;-><init>()V

    invoke-virtual {p0, v0, p1}, Ll/᩺ۚܿ;->֫(Ll/ᩳܰۡ;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 777
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V

    return-void

    :catchall_0
    move-exception p0

    .line 775
    :try_start_1
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method

.method public static bridge synthetic ۧ()Ljava/lang/Object;
    .locals 1

    .line 0
    sget-object v0, Ll/᩷֨ܿ;->ᩳ:Ljava/lang/Object;

    return-object v0
.end method

.method public static ܳ()Z
    .locals 3

    .line 1349
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "apk_installation_shizuku"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ܽ()Ll/ܽ֨ܿ;
    .locals 1

    .line 0
    sget-object v0, Ll/᩷֨ܿ;->ܿ:Ll/ܽ֨ܿ;

    return-object v0
.end method

.method public static ܿ()Z
    .locals 3

    .line 1345
    invoke-static {}, Ll/ۢ֨ۢ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "apk_installation_root"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ᩳ()I
    .locals 2

    .line 1391
    sget-object v0, Ll/᩷֨ܿ;->ܿ:Ll/ܽ֨ܿ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    invoke-static {}, Ll/᩺᩶۠;->ܳ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 140
    :cond_0
    :try_start_0
    invoke-static {}, Ll/᩺᩶۠;->ۧ()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0

    :catchall_0
    return v1
.end method

.method public static ᩻()I
    .locals 1

    .line 1427
    sget-object v0, Ll/᩷֨ܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    return v0
.end method
