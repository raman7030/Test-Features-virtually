.class public Ll/֡֫;
.super Landroid/os/ResultReceiver;
.source "N5R1"


# instance fields
.field public ᩸:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/֨֫;)V
    .locals 1

    const/4 v0, 0x0

    .line 2317
    invoke-direct {p0, v0}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    .line 2318
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/֡֫;->᩸:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 4

    .line 2323
    iget-object p1, p0, Ll/֡֫;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨֫;

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 2327
    :cond_0
    iget-object v0, p1, Ll/֨֫;->ܽ:Ljava/lang/Object;

    monitor-enter v0

    .line 2328
    :try_start_0
    iget-object v1, p1, Ll/֨֫;->ܿ:Ll/ܳۧ;

    const-string v2, "android.support.v4.media.session.EXTRA_BINDER"

    .line 44
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v2

    .line 2329
    invoke-static {v2}, Ll/ۡ֫;->֫(Landroid/os/IBinder;)Ll/ۖ֫;

    move-result-object v2

    .line 2328
    invoke-virtual {v1, v2}, Ll/ܳۧ;->֫(Ll/ۖ֫;)V

    .line 2332
    iget-object v1, p1, Ll/֨֫;->ܿ:Ll/ܳۧ;

    const-string v2, "android.support.v4.media.session.SESSION_TOKEN2"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    .line 109
    :try_start_1
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    if-nez p2, :cond_1

    goto :goto_0

    .line 113
    :cond_1
    const-class v2, Ll/۬᩺ۧ;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v2, "a"

    .line 114
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    .line 58
    instance-of v2, p2, Ll/ۗ᩺ۧ;

    if-eqz v2, :cond_2

    .line 61
    check-cast p2, Ll/ۗ᩺ۧ;

    invoke-virtual {p2}, Ll/ۗ᩺ۧ;->֫()Ll/ۛ᩺ۧ;

    move-result-object v3

    goto :goto_0

    .line 59
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid parcel"

    invoke-direct {p2, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2332
    :catch_0
    :goto_0
    :try_start_2
    invoke-virtual {v1, v3}, Ll/ܳۧ;->֫(Ll/ۛ᩺ۧ;)V

    .line 2335
    invoke-virtual {p1}, Ll/֨֫;->֫()V

    .line 2336
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_3
    :goto_1
    return-void
.end method
