.class public final Ll/ᩴܳ֨;
.super Ljava/lang/Object;
.source "0BLU"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic ᩸:Ll/֡ܳ֨;


# direct methods
.method public constructor <init>(Ll/֡ܳ֨;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴܳ֨;->᩸:Ll/֡ܳ֨;

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ll/ᩴܳ֨;->᩸:Ll/֡ܳ֨;

    sget v0, Ll/ۖܳ֨;->ܿ:I

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.heytap.openid.IOpenID"

    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    instance-of v1, v0, Ll/ۚܳ֨;

    if-eqz v1, :cond_1

    .line 3
    move-object p2, v0

    check-cast p2, Ll/ۚܳ֨;

    goto :goto_0

    .line 4
    :cond_1
    new-instance v0, Ll/ܺܳ֨;

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, v0, Ll/ܺܳ֨;->ܿ:Landroid/os/IBinder;

    move-object p2, v0

    :goto_0
    iput-object p2, p1, Ll/֡ܳ֨;->֫:Ll/ۚܳ֨;

    .line 3
    iget-object p1, p0, Ll/ᩴܳ֨;->᩸:Ll/֡ܳ֨;

    .line 4
    iget-object p1, p1, Ll/֡ܳ֨;->ᩳ:Ljava/lang/Object;

    move-object v0, p1

    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object p1, p0, Ll/ᩴܳ֨;->᩸:Ll/֡ܳ֨;

    .line 7
    iget-object p1, p1, Ll/֡ܳ֨;->ᩳ:Ljava/lang/Object;

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 9
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ll/ᩴܳ֨;->᩸:Ll/֡ܳ֨;

    const/4 v0, 0x0

    .line 2
    iput-object v0, p1, Ll/֡ܳ֨;->֫:Ll/ۚܳ֨;

    return-void
.end method
