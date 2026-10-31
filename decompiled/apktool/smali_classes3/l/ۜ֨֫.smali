.class public final Ll/ۜ֨֫;
.super Ljava/lang/Object;
.source "78OY"

# interfaces
.implements Ll/᩵ۚ֫;


# static fields
.field public static final ۧ:Ljava/util/ArrayList;


# instance fields
.field public final ֫:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Ll/ۜ֨֫;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    return-void
.end method

.method public static ֫(Ll/᩻֨֫;)V
    .locals 4

    .line 133
    sget-object v1, Ll/ۜ֨֫;->ۧ:Ljava/util/ArrayList;

    move-object v0, v1

    monitor-enter v0

    .line 134
    :try_start_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x32

    if-ge v2, v3, :cond_0

    .line 135
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ᩳ()Ll/᩻֨֫;
    .locals 3

    .line 125
    sget-object v1, Ll/ۜ֨֫;->ۧ:Ljava/util/ArrayList;

    move-object v0, v1

    monitor-enter v0

    .line 126
    :try_start_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 127
    new-instance v1, Ll/᩻֨֫;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/᩻֨֫;-><init>(I)V

    goto :goto_0

    .line 128
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻֨֫;

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 129
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫(I)Ll/ᩴۚ֫;
    .locals 2

    .line 57
    invoke-static {}, Ll/ۜ֨֫;->ᩳ()Ll/᩻֨֫;

    move-result-object v0

    iget-object v1, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    invoke-virtual {v1, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩻֨֫;->֫(Landroid/os/Message;)V

    return-object v0
.end method

.method public final ֫(III)Ll/ᩴۚ֫;
    .locals 2

    .line 67
    invoke-static {}, Ll/ۜ֨֫;->ᩳ()Ll/᩻֨֫;

    move-result-object v0

    iget-object v1, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    .line 68
    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩻֨֫;->֫(Landroid/os/Message;)V

    return-object v0
.end method

.method public final ֫(IILjava/lang/Object;)Ll/ᩴۚ֫;
    .locals 3

    .line 73
    invoke-static {}, Ll/ۜ֨֫;->ᩳ()Ll/᩻֨֫;

    move-result-object v0

    iget-object v1, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    const/4 v2, 0x0

    .line 74
    invoke-virtual {v1, p1, v2, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩻֨֫;->֫(Landroid/os/Message;)V

    return-object v0
.end method

.method public final ֫(ILjava/lang/Object;)Ll/ᩴۚ֫;
    .locals 2

    .line 62
    invoke-static {}, Ll/ۜ֨֫;->ᩳ()Ll/᩻֨֫;

    move-result-object v0

    iget-object v1, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩻֨֫;->֫(Landroid/os/Message;)V

    return-object v0
.end method

.method public final ֫()Z
    .locals 2

    const/4 v0, 0x1

    .line 52
    iget-object v1, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    return v0
.end method

.method public final ֫(J)Z
    .locals 2

    const/4 v0, 0x2

    .line 94
    iget-object v1, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/Runnable;)Z
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ᩴۚ֫;)Z
    .locals 1

    .line 79
    check-cast p1, Ll/᩻֨֫;

    iget-object v0, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Ll/᩻֨֫;->֫(Landroid/os/Handler;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()V
    .locals 2

    const/4 v0, 0x0

    .line 106
    iget-object v1, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(I)Z
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    move-result p1

    return p1
.end method

.method public final ܽ()Landroid/os/Looper;
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 100
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 101
    iget-object v0, p0, Ll/ۜ֨֫;->֫:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method
