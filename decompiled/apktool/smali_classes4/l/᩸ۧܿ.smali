.class public final Ll/᩸ۧܿ;
.super Landroid/os/Handler;
.source "N988"


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/᩹ۧܿ;)V
    .locals 1

    .line 121
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 122
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩸ۧܿ;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 0

    .line 127
    iget-object p1, p0, Ll/᩸ۧܿ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ۧܿ;

    if-eqz p1, :cond_0

    .line 129
    invoke-static {p1}, Ll/᩹ۧܿ;->֫(Ll/᩹ۧܿ;)V

    :cond_0
    return-void
.end method
