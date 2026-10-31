.class public final Ll/ܽᩳܿ;
.super Landroid/os/Handler;
.source "R16R"


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/widget/PopupWindow;)V
    .locals 1

    .line 52
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 53
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ܽᩳܿ;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 0

    .line 58
    iget-object p1, p0, Ll/ܽᩳܿ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/PopupWindow;

    if-eqz p1, :cond_0

    .line 60
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method
