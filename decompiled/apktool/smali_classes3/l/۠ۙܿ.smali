.class public final Ll/۠ۙܿ;
.super Landroid/os/Handler;
.source "L9CC"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܽ:J

.field public final ᩳ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;)V
    .locals 1

    .line 442
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 443
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/۠ۙܿ;->ᩳ:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 0

    .line 448
    iget-object p1, p0, Ll/۠ۙܿ;->ᩳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗۙܿ;

    if-eqz p1, :cond_0

    .line 450
    invoke-virtual {p1}, Ll/ۗۙܿ;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 493
    iput-boolean v0, p0, Ll/۠ۙܿ;->֫:Z

    .line 494
    iput-boolean v0, p0, Ll/۠ۙܿ;->ۧ:Z

    .line 495
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public final ֫(J)V
    .locals 2

    .line 455
    iput-wide p1, p0, Ll/۠ۙܿ;->ܽ:J

    const/4 v0, 0x1

    .line 456
    iput-boolean v0, p0, Ll/۠ۙܿ;->֫:Z

    const/4 v0, 0x0

    .line 457
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 458
    iget-boolean v1, p0, Ll/۠ۙܿ;->ۧ:Z

    if-nez v1, :cond_0

    .line 459
    invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 474
    iput-boolean v0, p0, Ll/۠ۙܿ;->ۧ:Z

    const/4 v0, 0x0

    .line 475
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public final ܽ()V
    .locals 3

    .line 464
    iget-boolean v0, p0, Ll/۠ۙܿ;->֫:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/۠ۙܿ;->ۧ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 465
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 466
    iget-wide v1, p0, Ll/۠ۙܿ;->ܽ:J

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 3

    .line 482
    iget-boolean v0, p0, Ll/۠ۙܿ;->ۧ:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 485
    iput-boolean v0, p0, Ll/۠ۙܿ;->ۧ:Z

    .line 486
    iget-boolean v1, p0, Ll/۠ۙܿ;->֫:Z

    if-eqz v1, :cond_1

    .line 487
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 488
    iget-wide v1, p0, Ll/۠ۙܿ;->ܽ:J

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_1
    :goto_0
    return-void
.end method
