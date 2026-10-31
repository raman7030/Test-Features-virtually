.class public final synthetic Ll/۫ܶۡ;
.super Ljava/lang/Object;
.source "V4WQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟ܶۡ;


# direct methods
.method public synthetic constructor <init>(Ll/۟ܶۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ܶۡ;->᩸:Ll/۟ܶۡ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget-object v0, p0, Ll/۫ܶۡ;->᩸:Ll/۟ܶۡ;

    .line 156
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    const-string v2, "power"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/PowerManager;

    .line 157
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v2

    const-string v3, ":AsyncTask"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    .line 158
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 160
    :try_start_0
    invoke-virtual {v0}, Ll/۟ܶۡ;->ܿ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 172
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 175
    :cond_0
    new-instance v1, Ll/ۤܶۡ;

    invoke-direct {v1, v0}, Ll/ۤܶۡ;-><init>(Ll/۟ܶۡ;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v2

    .line 168
    :try_start_1
    new-instance v3, Ljava/lang/Exception;

    invoke-direct {v3, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 221
    new-instance v2, Ll/ܰܶۡ;

    invoke-direct {v2, v0, v3}, Ll/ܰܶۡ;-><init>(Ll/۟ܶۡ;Ljava/lang/Exception;)V

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 171
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :catch_0
    move-exception v2

    .line 165
    :try_start_2
    new-instance v3, Ljava/lang/Exception;

    const v4, 0x7f12072a

    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 221
    new-instance v2, Ll/ܰܶۡ;

    invoke-direct {v2, v0, v3}, Ll/ܰܶۡ;-><init>(Ll/۟ܶۡ;Ljava/lang/Exception;)V

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 171
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :catch_1
    move-exception v2

    .line 221
    :try_start_3
    new-instance v3, Ll/ܰܶۡ;

    invoke-direct {v3, v0, v2}, Ll/ܰܶۡ;-><init>(Ll/۟ܶۡ;Ljava/lang/Exception;)V

    invoke-static {v3}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 171
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    :goto_0
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_1
    return-void

    :catchall_1
    move-exception v0

    .line 171
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 172
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 174
    :cond_2
    throw v0
.end method
