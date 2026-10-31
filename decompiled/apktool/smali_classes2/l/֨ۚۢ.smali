.class public final Ll/֨ۚۢ;
.super Landroid/os/Handler;
.source "A151"


# instance fields
.field public ֫:Ll/ۚۚۢ;

.field public final ۧ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ll/ۚۚۢ;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 16
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/֨ۚۢ;->ۧ:Ljava/lang/ref/WeakReference;

    .line 17
    iput-object p2, p0, Ll/֨ۚۢ;->֫:Ll/ۚۚۢ;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 22
    iget-object v0, p0, Ll/֨ۚۢ;->ۧ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 24
    iget-object v1, p0, Ll/֨ۚۢ;->֫:Ll/ۚۚۢ;

    invoke-interface {v1, v0, p1}, Ll/ۚۚۢ;->֫(Ljava/lang/Object;Landroid/os/Message;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Ll/֨ۚۢ;->֫:Ll/ۚۚۢ;

    return-void
.end method
