.class public final Ll/֡ۖۢ;
.super Ljava/lang/Object;
.source "P6KF"


# instance fields
.field public ֫:Z

.field public final ۜ:Ll/᩷ۛ᩻;

.field public final ۧ:Landroid/net/ConnectivityManager;

.field public final ܳ:Landroid/net/ConnectivityManager$NetworkCallback;

.field public final ܽ:Landroid/content/ContextWrapper;

.field public final ܿ:Landroid/os/Handler;

.field public final ᩳ:Ll/۠ۚۢ;

.field public final ᩷:Landroid/content/BroadcastReceiver;

.field public final ᩻:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;Ljava/lang/Runnable;)V
    .locals 3

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/֡ۖۢ;->ܿ:Landroid/os/Handler;

    .line 23
    new-instance v0, Ll/᩷ۛ᩻;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0}, Ll/᩷ۛ᩻;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/֡ۖۢ;->ۜ:Ll/᩷ۛ᩻;

    .line 24
    new-instance v0, Ll/۠ۚۢ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/۠ۚۢ;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/֡ۖۢ;->ᩳ:Ll/۠ۚۢ;

    .line 33
    new-instance v0, Ll/ᩴۖۢ;

    invoke-direct {v0, p0}, Ll/ᩴۖۢ;-><init>(Ll/֡ۖۢ;)V

    iput-object v0, p0, Ll/֡ۖۢ;->ܳ:Landroid/net/ConnectivityManager$NetworkCallback;

    .line 49
    new-instance v1, Ll/᩵ۖۢ;

    invoke-direct {v1, p0}, Ll/᩵ۖۢ;-><init>(Ll/֡ۖۢ;)V

    iput-object v1, p0, Ll/֡ۖۢ;->᩷:Landroid/content/BroadcastReceiver;

    .line 58
    iput-object p1, p0, Ll/֡ۖۢ;->ܽ:Landroid/content/ContextWrapper;

    .line 59
    iput-object p2, p0, Ll/֡ۖۢ;->᩻:Ljava/lang/Runnable;

    const-string p2, "connectivity"

    .line 60
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/net/ConnectivityManager;

    iput-object p2, p0, Ll/֡ۖۢ;->ۧ:Landroid/net/ConnectivityManager;

    .line 61
    new-instance v2, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v2}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v2}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v2

    invoke-virtual {p2, v2, v0}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 63
    new-instance p2, Landroid/content/IntentFilter;

    const-string v0, "android.net.wifi.WIFI_AP_STATE_CHANGED"

    invoke-direct {p2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v0, "android.net.conn.TETHER_STATE_CHANGED"

    .line 64
    invoke-virtual {p2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p1, v1, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public static ֫(Ll/֡ۖۢ;)V
    .locals 1

    .line 69
    iget-boolean v0, p0, Ll/֡ۖۢ;->֫:Z

    if-nez v0, :cond_0

    .line 70
    iget-object p0, p0, Ll/֡ۖۢ;->᩻:Ljava/lang/Runnable;

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public static ۧ(Ll/֡ۖۢ;)V
    .locals 4

    .line 25
    iget-object v0, p0, Ll/֡ۖۢ;->ۜ:Ll/᩷ۛ᩻;

    iget-object v1, p0, Ll/֡ۖۢ;->ܿ:Landroid/os/Handler;

    iget-boolean v2, p0, Ll/֡ۖۢ;->֫:Z

    if-eqz v2, :cond_0

    return-void

    :cond_0
    if-nez v2, :cond_1

    .line 70
    iget-object p0, p0, Ll/֡ۖۢ;->᩻:Ljava/lang/Runnable;

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 30
    :cond_1
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-wide/16 v2, 0x1f4

    .line 31
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/֡ۖۢ;)Ll/۠ۚۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ۖۢ;->ᩳ:Ll/۠ۚۢ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/֡ۖۢ;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ۖۢ;->ܿ:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 76
    iget-boolean v0, p0, Ll/֡ۖۢ;->֫:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 79
    iput-boolean v0, p0, Ll/֡ۖۢ;->֫:Z

    .line 80
    iget-object v0, p0, Ll/֡ۖۢ;->ۧ:Landroid/net/ConnectivityManager;

    iget-object v1, p0, Ll/֡ۖۢ;->ܳ:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 81
    iget-object v0, p0, Ll/֡ۖۢ;->ܽ:Landroid/content/ContextWrapper;

    iget-object v1, p0, Ll/֡ۖۢ;->᩷:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 82
    iget-object v0, p0, Ll/֡ۖۢ;->ܿ:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method
