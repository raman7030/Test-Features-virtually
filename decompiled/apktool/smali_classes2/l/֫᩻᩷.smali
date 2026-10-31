.class public Ll/֫᩻᩷;
.super Landroid/os/Handler;
.source "87OT"


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 0

    .line 39
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 40
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbin/mt/plugin/api/util/UIUpdaterGroup;

    if-eqz p1, :cond_0

    .line 42
    invoke-static {p1}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->access$000(Lbin/mt/plugin/api/util/UIUpdaterGroup;)V

    :cond_0
    return-void
.end method
