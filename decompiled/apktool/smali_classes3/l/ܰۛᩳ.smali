.class public final Ll/ܰۛᩳ;
.super Landroid/os/Handler;
.source "X68P"


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;

.field public ۧ:Z

.field public ܽ:Z

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;)V
    .locals 1

    .line 6324
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/4 v0, 0x0

    .line 6328
    iput-boolean v0, p0, Ll/ܰۛᩳ;->ᩳ:Z

    .line 6329
    iput-boolean v0, p0, Ll/ܰۛᩳ;->ܽ:Z

    .line 6325
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ܰۛᩳ;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 6333
    iget-object v0, p0, Ll/ܰۛᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۨᩳ;

    if-eqz v0, :cond_9

    .line 6335
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x5dc

    const/16 v2, 0x12c

    const-wide/16 v3, 0x5dc

    const/4 v5, 0x0

    const/4 v6, 0x1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 6409
    :pswitch_0
    invoke-static {v0}, Ll/۫ۨᩳ;->ۧۧ(Ll/۫ۨᩳ;)V

    return-void

    .line 6405
    :pswitch_1
    iget-object p1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {p1}, Ll/ۗۤᩳ;->᩸()V

    .line 6406
    invoke-static {v0}, Ll/۫ۨᩳ;->ᩳۧ(Ll/۫ۨᩳ;)V

    return-void

    .line 6402
    :pswitch_2
    sget-object p1, Ll/۫ۨᩳ;->᩻ܿ:Landroid/text/method/TextKeyListener;

    .line 6065
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 6066
    iget-object p1, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-object p1, p1, Ll/᩺֫ܿ;->ۢ֫:Ll/ᩴۤᩳ;

    if-eqz p1, :cond_9

    .line 6067
    invoke-interface {p1}, Ll/ᩴۤᩳ;->֫()V

    return-void

    .line 6376
    :pswitch_3
    invoke-static {v0}, Ll/۫ۨᩳ;->۫(Ll/۫ۨᩳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6377
    invoke-static {v0}, Ll/۫ۨᩳ;->ۤ֫(Ll/۫ۨᩳ;)V

    .line 6378
    iput-boolean v6, p0, Ll/ܰۛᩳ;->ܽ:Z

    return-void

    .line 6381
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v7

    invoke-static {v0}, Ll/۫ۨᩳ;->ۢ֫(Ll/۫ۨᩳ;)J

    move-result-wide v9

    sub-long/2addr v7, v9

    sub-long/2addr v7, v3

    long-to-int p1, v7

    const/4 v3, 0x5

    if-ltz p1, :cond_2

    if-ge p1, v2, :cond_1

    .line 6384
    iput-boolean v6, p0, Ll/ܰۛᩳ;->ܽ:Z

    .line 6385
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 6386
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 6387
    invoke-virtual {p0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    .line 6388
    :cond_1
    iget-boolean p1, p0, Ll/ܰۛᩳ;->ܽ:Z

    if-eqz p1, :cond_9

    .line 6389
    iput-boolean v5, p0, Ll/ܰۛᩳ;->ܽ:Z

    .line 6390
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_2
    neg-int p1, p1

    if-ge p1, v1, :cond_3

    .line 6394
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    int-to-long v0, p1

    .line 6395
    invoke-virtual {p0, v3, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 6397
    :cond_3
    iput-boolean v6, p0, Ll/ܰۛᩳ;->ܽ:Z

    return-void

    .line 6416
    :pswitch_4
    iget-boolean p1, p0, Ll/ܰۛᩳ;->ۧ:Z

    if-eqz p1, :cond_4

    goto :goto_0

    .line 6418
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 6419
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x1f4

    add-long/2addr v0, v2

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    return-void

    .line 6346
    :pswitch_5
    invoke-static {v0}, Ll/۫ۨᩳ;->ۤ(Ll/۫ۨᩳ;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 6347
    invoke-static {v0}, Ll/۫ۨᩳ;->ۛ֫(Ll/۫ۨᩳ;)V

    .line 6348
    iput-boolean v6, p0, Ll/ܰۛᩳ;->ᩳ:Z

    return-void

    .line 6351
    :cond_5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v7

    invoke-static {v0}, Ll/۫ۨᩳ;->ۡ֫(Ll/۫ۨᩳ;)J

    move-result-wide v9

    sub-long/2addr v7, v9

    sub-long/2addr v7, v3

    long-to-int p1, v7

    const/4 v3, 0x3

    if-ltz p1, :cond_7

    if-ge p1, v2, :cond_6

    .line 6354
    iput-boolean v6, p0, Ll/ܰۛᩳ;->ᩳ:Z

    .line 6355
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 6356
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 6357
    invoke-virtual {p0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    .line 6358
    :cond_6
    iget-boolean p1, p0, Ll/ܰۛᩳ;->ᩳ:Z

    if-eqz p1, :cond_9

    .line 6359
    iput-boolean v5, p0, Ll/ܰۛᩳ;->ᩳ:Z

    .line 6360
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_7
    neg-int p1, p1

    if-ge p1, v1, :cond_8

    .line 6364
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    int-to-long v0, p1

    .line 6365
    invoke-virtual {p0, v3, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 6367
    :cond_8
    iput-boolean v6, p0, Ll/ܰۛᩳ;->ᩳ:Z

    return-void

    :pswitch_6
    const/4 p1, -0x1

    .line 2448
    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->֨(I)V

    return-void

    .line 6337
    :pswitch_7
    invoke-static {v0}, Ll/۫ۨᩳ;->ᩳ֫(Ll/۫ۨᩳ;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 6338
    invoke-static {v0}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-static {v0, p1}, Ll/۫ۨᩳ;->ܳ(Ll/۫ۨᩳ;I)V

    :cond_9
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫()V
    .locals 1

    .line 6423
    iget-boolean v0, p0, Ll/ܰۛᩳ;->ۧ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x4

    .line 6424
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x1

    .line 6425
    iput-boolean v0, p0, Ll/ܰۛᩳ;->ۧ:Z

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 4

    const/4 v0, 0x0

    .line 6430
    iput-boolean v0, p0, Ll/ܰۛᩳ;->ۧ:Z

    .line 6431
    iget-object v0, p0, Ll/ܰۛᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۨᩳ;

    if-eqz v0, :cond_1

    .line 6416
    iget-boolean v1, p0, Ll/ܰۛᩳ;->ۧ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 6418
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 6419
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x1f4

    add-long/2addr v0, v2

    const/4 v2, 0x4

    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    :cond_1
    :goto_0
    return-void
.end method
