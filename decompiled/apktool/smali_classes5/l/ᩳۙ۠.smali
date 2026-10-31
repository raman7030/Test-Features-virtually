.class public final Ll/ᩳۙ۠;
.super Lmoe/shizuku/server/IShizukuServiceConnection$Stub;
.source "M98V"


# static fields
.field public static final ۜ:Landroid/os/Handler;


# instance fields
.field public final ܳ:Ljava/util/HashSet;

.field public final ܿ:Landroid/content/ComponentName;

.field public ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 19
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ll/ᩳۙ۠;->ۜ:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Ll/ۨ᩶۠;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Lmoe/shizuku/server/IShizukuServiceConnection$Stub;-><init>()V

    .line 21
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ᩳۙ۠;->ܳ:Ljava/util/HashSet;

    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Ll/ᩳۙ۠;->᩻:Z

    .line 26
    iget-object p1, p1, Ll/ۨ᩶۠;->֫:Landroid/content/ComponentName;

    iput-object p1, p0, Ll/ᩳۙ۠;->ܿ:Landroid/content/ComponentName;

    return-void
.end method

.method public static synthetic ֫(Ll/ᩳۙ۠;)V
    .locals 4

    .line 74
    iget-object v0, p0, Ll/ᩳۙ۠;->ܳ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ServiceConnection;

    .line 75
    iget-object v3, p0, Ll/ᩳۙ۠;->ܿ:Landroid/content/ComponentName;

    invoke-interface {v2, v3}, Landroid/content/ServiceConnection;->onServiceDisconnected(Landroid/content/ComponentName;)V

    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 79
    invoke-static {p0}, Ll/ܿۙ۠;->֫(Ll/ᩳۙ۠;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ᩳۙ۠;Landroid/os/IBinder;)V
    .locals 3

    .line 50
    iget-object v0, p0, Ll/ᩳۙ۠;->ܳ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ServiceConnection;

    .line 51
    iget-object v2, p0, Ll/ᩳۙ۠;->ܿ:Landroid/content/ComponentName;

    invoke-interface {v1, v2, p1}, Landroid/content/ServiceConnection;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final connected(Landroid/os/IBinder;)V
    .locals 2

    .line 49
    new-instance v0, Ll/֫ۙ۠;

    invoke-direct {v0, p0, p1}, Ll/֫ۙ۠;-><init>(Ll/ᩳۙ۠;Landroid/os/IBinder;)V

    sget-object v1, Ll/ᩳۙ۠;->ۜ:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 61
    :try_start_0
    new-instance v0, Ll/ۧۙ۠;

    invoke-direct {v0, p0}, Ll/ۧۙ۠;-><init>(Ll/ᩳۙ۠;)V

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final died()V
    .locals 2

    .line 70
    iget-boolean v0, p0, Ll/ᩳۙ۠;->᩻:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 71
    iput-boolean v0, p0, Ll/ᩳۙ۠;->᩻:Z

    .line 73
    new-instance v0, Ll/ܽۙ۠;

    invoke-direct {v0, p0}, Ll/ܽۙ۠;-><init>(Ll/ᩳۙ۠;)V

    sget-object v1, Ll/ᩳۙ۠;->ۜ:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ֫(Landroid/content/ServiceConnection;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 33
    iget-object v0, p0, Ll/ᩳۙ۠;->ܳ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
