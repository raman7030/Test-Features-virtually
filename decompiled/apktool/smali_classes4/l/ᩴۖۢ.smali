.class public final Ll/ᩴۖۢ;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "P6KF"


# instance fields
.field public final synthetic ֫:Ll/֡ۖۢ;


# direct methods
.method public constructor <init>(Ll/֡ۖۢ;)V
    .locals 0

    .line 33
    iput-object p1, p0, Ll/ᩴۖۢ;->֫:Ll/֡ۖۢ;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 1

    .line 36
    iget-object p1, p0, Ll/ᩴۖۢ;->֫:Ll/֡ۖۢ;

    invoke-static {p1}, Ll/֡ۖۢ;->ᩳ(Ll/֡ۖۢ;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Ll/֡ۖۢ;->ܽ(Ll/֡ۖۢ;)Ll/۠ۚۢ;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onLinkPropertiesChanged(Landroid/net/Network;Landroid/net/LinkProperties;)V
    .locals 0

    .line 46
    iget-object p1, p0, Ll/ᩴۖۢ;->֫:Ll/֡ۖۢ;

    invoke-static {p1}, Ll/֡ۖۢ;->ᩳ(Ll/֡ۖۢ;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p1}, Ll/֡ۖۢ;->ܽ(Ll/֡ۖۢ;)Ll/۠ۚۢ;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 1

    .line 41
    iget-object p1, p0, Ll/ᩴۖۢ;->֫:Ll/֡ۖۢ;

    invoke-static {p1}, Ll/֡ۖۢ;->ᩳ(Ll/֡ۖۢ;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Ll/֡ۖۢ;->ܽ(Ll/֡ۖۢ;)Ll/۠ۚۢ;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
