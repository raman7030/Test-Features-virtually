.class public final Ll/᩺ܳ֨;
.super Ljava/lang/Object;
.source "8BM6"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic ᩸:Ll/ܰܳ֨;


# direct methods
.method public constructor <init>(Ll/ܰܳ֨;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ܳ֨;->᩸:Ll/ܰܳ֨;

    return-void
.end method


# virtual methods
.method public final declared-synchronized onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 36
    :try_start_0
    iget-object p1, p0, Ll/᩺ܳ֨;->᩸:Ll/ܰܳ֨;

    invoke-static {p2}, Ll/ۛܳ֨;->֫(Landroid/os/IBinder;)Ll/ۨܳ֨;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ܰܳ֨;->֫(Ll/ܰܳ֨;Ll/ۨܳ֨;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 43
    iget-object p1, p0, Ll/᩺ܳ֨;->᩸:Ll/ܰܳ֨;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/ܰܳ֨;->֫(Ll/ܰܳ֨;Ll/ۨܳ֨;)V

    return-void
.end method
