.class public abstract Ll/ۙ֫;
.super Ljava/lang/Object;
.source "U6BF"


# instance fields
.field public final ֫:Landroid/media/session/MediaSession$Callback;

.field public ۧ:Ll/᩹֫;

.field public final ܽ:Ljava/lang/Object;

.field public ܿ:Ljava/lang/ref/WeakReference;

.field public ᩳ:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1109
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۙ֫;->ܽ:Ljava/lang/Object;

    .line 1121
    new-instance v0, Ll/᩶֫;

    invoke-direct {v0, p0}, Ll/᩶֫;-><init>(Ll/ۙ֫;)V

    iput-object v0, p0, Ll/ۙ֫;->֫:Landroid/media/session/MediaSession$Callback;

    .line 1125
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۙ֫;->ܿ:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public ֫()V
    .locals 0

    return-void
.end method

.method public ֫(J)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۗ֫;Landroid/os/Handler;)V
    .locals 7

    .line 1223
    iget-boolean v0, p0, Ll/ۙ֫;->ᩳ:Z

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    const/4 v0, 0x0

    .line 1226
    iput-boolean v0, p0, Ll/ۙ֫;->ᩳ:Z

    const/4 v1, 0x1

    .line 1227
    invoke-virtual {p2, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1229
    invoke-interface {p1}, Ll/ۗ֫;->ᩳ()Ll/᩵ۧ;

    move-result-object p1

    const-wide/16 v1, 0x0

    if-nez p1, :cond_1

    move-wide v3, v1

    goto :goto_0

    .line 729
    :cond_1
    iget-wide v3, p1, Ll/᩵ۧ;->᩸:J

    :goto_0
    if-eqz p1, :cond_2

    .line 646
    iget p1, p1, Ll/᩵ۧ;->ۨ:I

    const/4 p2, 0x3

    if-ne p1, p2, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    const-wide/16 v5, 0x204

    and-long/2addr v5, v3

    cmp-long p2, v5, v1

    if-eqz p2, :cond_3

    const/4 p2, 0x1

    goto :goto_2

    :cond_3
    const/4 p2, 0x0

    :goto_2
    const-wide/16 v5, 0x202

    and-long/2addr v3, v5

    cmp-long v5, v3, v1

    if-eqz v5, :cond_4

    const/4 v0, 0x1

    :cond_4
    if-eqz p1, :cond_5

    if-eqz v0, :cond_5

    .line 1238
    invoke-virtual {p0}, Ll/ۙ֫;->֫()V

    return-void

    :cond_5
    if-nez p1, :cond_6

    if-eqz p2, :cond_6

    .line 1240
    invoke-virtual {p0}, Ll/ۙ֫;->ۧ()V

    :cond_6
    :goto_3
    return-void
.end method

.method public ֫(Landroid/content/Intent;)Z
    .locals 7

    .line 1164
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    goto/16 :goto_1

    .line 1173
    :cond_0
    iget-object v0, p0, Ll/ۙ֫;->ܽ:Ljava/lang/Object;

    monitor-enter v0

    .line 1174
    :try_start_0
    iget-object v1, p0, Ll/ۙ֫;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ֫;

    .line 1175
    iget-object v3, p0, Ll/ۙ֫;->ۧ:Ll/᩹֫;

    .line 1176
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_8

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "android.intent.extra.KEY_EVENT"

    .line 1180
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/view/KeyEvent;

    if-eqz p1, :cond_8

    .line 1181
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 1184
    :cond_2
    invoke-interface {v1}, Ll/ۗ֫;->ۧ()Ll/᩸ۘ֫;

    move-result-object v0

    .line 1185
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    const/16 v5, 0x4f

    if-eq v4, v5, :cond_3

    const/16 v5, 0x55

    if-eq v4, v5, :cond_3

    .line 1215
    invoke-virtual {p0, v1, v3}, Ll/ۙ֫;->֫(Ll/ۗ֫;Landroid/os/Handler;)V

    return v2

    .line 1189
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    const/4 v4, 0x1

    if-nez p1, :cond_7

    .line 1190
    iget-boolean p1, p0, Ll/ۙ֫;->ᩳ:Z

    if-eqz p1, :cond_6

    .line 1191
    invoke-virtual {v3, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 1193
    iput-boolean v2, p0, Ll/ۙ֫;->ᩳ:Z

    .line 1194
    invoke-interface {v1}, Ll/ۗ֫;->ᩳ()Ll/᩵ۧ;

    move-result-object p1

    const-wide/16 v0, 0x0

    if-nez p1, :cond_4

    move-wide v2, v0

    goto :goto_0

    .line 729
    :cond_4
    iget-wide v2, p1, Ll/᩵ۧ;->᩸:J

    :goto_0
    const-wide/16 v5, 0x20

    and-long/2addr v2, v5

    cmp-long p1, v2, v0

    if-eqz p1, :cond_5

    .line 1198
    invoke-virtual {p0}, Ll/ۙ֫;->ܽ()V

    :cond_5
    return v4

    .line 1201
    :cond_6
    iput-boolean v4, p0, Ll/ۙ֫;->ᩳ:Z

    .line 1202
    invoke-virtual {v3, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 1205
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v0

    int-to-long v0, v0

    .line 1202
    invoke-virtual {v3, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return v4

    .line 1209
    :cond_7
    invoke-virtual {p0, v1, v3}, Ll/ۙ֫;->֫(Ll/ۗ֫;Landroid/os/Handler;)V

    return v4

    :cond_8
    :goto_1
    return v2

    :catchall_0
    move-exception p1

    .line 1176
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public ۧ()V
    .locals 0

    return-void
.end method

.method public final ۧ(Ll/ۗ֫;Landroid/os/Handler;)V
    .locals 3

    .line 1129
    iget-object v0, p0, Ll/ۙ֫;->ܽ:Ljava/lang/Object;

    monitor-enter v0

    .line 1130
    :try_start_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Ll/ۙ֫;->ܿ:Ljava/lang/ref/WeakReference;

    .line 1131
    iget-object v1, p0, Ll/ۙ֫;->ۧ:Ll/᩹֫;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 1132
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    .line 1135
    :cond_1
    new-instance v2, Ll/᩹֫;

    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v2, p0, p1}, Ll/᩹֫;-><init>(Ll/ۙ֫;Landroid/os/Looper;)V

    :cond_2
    :goto_0
    iput-object v2, p0, Ll/ۙ֫;->ۧ:Ll/᩹֫;

    .line 1136
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ܽ()V
    .locals 0

    return-void
.end method

.method public ᩳ()V
    .locals 0

    return-void
.end method
