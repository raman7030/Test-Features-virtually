.class public final synthetic Ll/۠ۚۢ;
.super Ljava/lang/Object;
.source "Z1XI"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠ۚۢ;->᩸:I

    iput-object p2, p0, Ll/۠ۚۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 2
    iget v0, p0, Ll/۠ۚۢ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/۠ۚۢ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Landroid/content/Context;

    const-string v0, "com.huawei.systemmanager"

    const/high16 v2, 0x10000000

    goto/16 :goto_2

    .line 0
    :pswitch_0
    check-cast v1, Ll/᩹۠ۡ;

    invoke-static {v1}, Ll/᩹۠ۡ;->֫(Ll/᩹۠ۡ;)V

    return-void

    :pswitch_1
    check-cast v1, Ll/ۡܶۢ;

    invoke-static {v1}, Ll/ۡܶۢ;->֫(Ll/ۡܶۢ;)V

    return-void

    :pswitch_2
    check-cast v1, Ll/֡ۖۢ;

    invoke-static {v1}, Ll/֡ۖۢ;->ۧ(Ll/֡ۖۢ;)V

    return-void

    :pswitch_3
    check-cast v1, Landroid/widget/TextView;

    const v0, 0x7f1206f3

    .line 225
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void

    .line 0
    :pswitch_4
    check-cast v1, Ll/᩷۠ᩴ;

    .line 55
    :try_start_0
    sget-object v0, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v2, 0x1

    new-array v3, v2, [Ll/ܳ۠ᩴ;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v3}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "session.lock"

    .line 56
    invoke-interface {v1, v3}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    new-array v2, v2, [Ll/ܳ۠ᩴ;

    aput-object v0, v2, v4

    invoke-static {v3, v2}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v1}, Ll/᩻۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    goto :goto_0

    .line 59
    :cond_1
    invoke-static {v1}, Ll/ܿ۠ᩴ;->list(Ll/᩷۠ᩴ;)Ll/ܿ᩺ᩴ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->findAny()Ll/ܽ۫ᩴ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    :try_start_2
    invoke-interface {v0}, Ll/۫ۨᩴ;->close()V

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ll/۫ۨᩴ;->close()V

    .line 60
    invoke-static {v1}, Ll/ܿ۠ᩴ;->deleteIfExists(Ll/᩷۠ᩴ;)Z

    .line 61
    invoke-interface {v1}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v0

    .line 212
    sget-object v1, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-interface {v1, v0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_3

    .line 59
    :try_start_3
    invoke-interface {v0}, Ll/۫ۨᩴ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    .line 63
    new-instance v1, Ll/۬᩻᩵;

    .line 66
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 63
    throw v1

    .line 0
    :pswitch_5
    check-cast v1, Ll/᩸ۚۢ;

    invoke-static {v1}, Ll/᩸ۚۢ;->֫(Ll/᩸ۚۢ;)V

    return-void

    .line 37
    :goto_2
    :try_start_5
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 38
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 42
    new-instance v4, Landroid/content/ComponentName;

    const-string v5, "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"

    invoke-direct {v4, v0, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 44
    invoke-static {}, Ll/ۗᩴܺ;->ۜ()D

    move-result-wide v4

    const-wide v6, 0x4008cccccccccccdL    # 3.1

    cmpl-double v8, v4, v6

    if-nez v8, :cond_4

    .line 46
    invoke-virtual {v1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_3

    .line 49
    :cond_4
    new-instance v4, Landroid/content/ComponentName;

    const-string v5, "com.huawei.notificationmanager.ui.NotificationManagmentActivity"

    invoke-direct {v4, v0, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 51
    invoke-virtual {v1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_3

    .line 70
    :catch_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "intent is not available!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :catch_2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 65
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 66
    new-instance v2, Landroid/content/ComponentName;

    const-string v3, "com.Android.settings"

    const-string v4, "com.android.settings.permission.TabItem"

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 68
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_3

    .line 54
    :catch_3
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 55
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 56
    new-instance v2, Landroid/content/ComponentName;

    const-string v4, "com.huawei.permissionmanager.ui.MainActivity"

    invoke-direct {v2, v0, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 59
    invoke-virtual {v1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
