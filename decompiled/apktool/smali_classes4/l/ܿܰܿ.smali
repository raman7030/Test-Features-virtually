.class public final Ll/ܿܰܿ;
.super Landroid/os/Handler;
.source "D5GW"


# instance fields
.field public ֫:Z

.field public final ۧ:Ljava/lang/ref/WeakReference;

.field public ܽ:Z


# direct methods
.method public constructor <init>(Ll/ۜܰܿ;)V
    .locals 1

    .line 853
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    const/4 v0, 0x0

    .line 878
    iput-boolean v0, p0, Ll/ܿܰܿ;->ܽ:Z

    .line 854
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ܿܰܿ;->ۧ:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 882
    iget-object v0, p0, Ll/ܿܰܿ;->ۧ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜܰܿ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 885
    :cond_0
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    const/4 v2, 0x2

    if-eq p1, v2, :cond_5

    const/4 v2, 0x3

    if-eq p1, v2, :cond_1

    goto :goto_0

    .line 898
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    invoke-static {v0}, Ll/ۜܰܿ;->ۧ(Ll/ۜܰܿ;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x5dc

    sub-long/2addr v3, v5

    long-to-int p1, v3

    const/4 v3, 0x1

    if-ltz p1, :cond_3

    const/16 v4, 0x12c

    if-ge p1, v4, :cond_2

    .line 901
    iput-boolean v3, p0, Ll/ܿܰܿ;->ܽ:Z

    .line 902
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 903
    invoke-virtual {p0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 904
    invoke-virtual {p0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    .line 905
    :cond_2
    iget-boolean p1, p0, Ll/ܿܰܿ;->ܽ:Z

    if-eqz p1, :cond_8

    .line 906
    iput-boolean v1, p0, Ll/ܿܰܿ;->ܽ:Z

    .line 907
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_3
    neg-int p1, p1

    const/16 v0, 0x5dc

    if-ge p1, v0, :cond_4

    .line 911
    invoke-virtual {p0, v2}, Landroid/os/Handler;->removeMessages(I)V

    int-to-long v0, p1

    .line 912
    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 914
    :cond_4
    iput-boolean v3, p0, Ll/ܿܰܿ;->ܽ:Z

    return-void

    .line 895
    :cond_5
    invoke-static {v0}, Ll/ۜܰܿ;->ܳ(Ll/ۜܰܿ;)V

    return-void

    .line 888
    :cond_6
    iget-boolean p1, p0, Ll/ܿܰܿ;->֫:Z

    if-nez p1, :cond_8

    .line 889
    iget-object p1, v0, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    invoke-virtual {p1}, Ll/ۙܰܿ;->ۢ()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 890
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_7
    const-wide/16 v2, 0x1f4

    .line 891
    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_8
    :goto_0
    return-void
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 864
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x1

    .line 865
    iput-boolean v0, p0, Ll/ܿܰܿ;->֫:Z

    return-void
.end method

.method public final ۧ()V
    .locals 3

    const/4 v0, 0x0

    .line 858
    iput-boolean v0, p0, Ll/ܿܰܿ;->֫:Z

    .line 859
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    const-wide/16 v1, 0x1f4

    .line 860
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method
