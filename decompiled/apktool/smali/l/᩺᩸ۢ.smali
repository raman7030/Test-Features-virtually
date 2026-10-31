.class public final Ll/᩺᩸ۢ;
.super Ljava/lang/Object;
.source "N1TT"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic ᩸:Ll/۟᩸ۢ;


# direct methods
.method public constructor <init>(Ll/۟᩸ۢ;)V
    .locals 0

    .line 351
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩸ۢ;->᩸:Ll/۟᩸ۢ;

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 354
    new-instance p1, Ll/ۨ᩸ۢ;

    invoke-direct {p1, p0, p2}, Ll/ۨ᩸ۢ;-><init>(Ll/᩺᩸ۢ;Landroid/os/IBinder;)V

    iget-object p2, p0, Ll/᩺᩸ۢ;->᩸:Ll/۟᩸ۢ;

    invoke-virtual {p2, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 365
    iget-object p1, p0, Ll/᩺᩸ۢ;->᩸:Ll/۟᩸ۢ;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 366
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method
