.class public final Ll/ۨ᩹֫;
.super Ljava/lang/Object;
.source "38TF"

# interfaces
.implements Ll/ۤۙ֫;


# instance fields
.field public final ֫:Ll/۫ܿۧ;

.field public final ۜ:I

.field public final ۧ:J

.field public final ܳ:J

.field public final ܽ:J

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:J

.field public ᩷:J

.field public final ᩻:J


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 279
    new-instance v0, Ll/۫ܿۧ;

    invoke-direct {v0}, Ll/۫ܿۧ;-><init>()V

    .line 300
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "bufferForPlaybackMs"

    const/16 v2, 0x3e8

    const/4 v3, 0x0

    const-string v4, "0"

    .line 301
    invoke-static {v1, v2, v3, v4}, Ll/ۨ᩹֫;->֫(Ljava/lang/String;IILjava/lang/String;)V

    const-string v5, "bufferForPlaybackAfterRebufferMs"

    const/16 v6, 0x7d0

    .line 302
    invoke-static {v5, v6, v3, v4}, Ll/ۨ᩹֫;->֫(Ljava/lang/String;IILjava/lang/String;)V

    const-string v7, "minBufferMs"

    const v8, 0xc350

    .line 304
    invoke-static {v7, v8, v2, v1}, Ll/ۨ᩹֫;->֫(Ljava/lang/String;IILjava/lang/String;)V

    .line 305
    invoke-static {v7, v8, v6, v5}, Ll/ۨ᩹֫;->֫(Ljava/lang/String;IILjava/lang/String;)V

    const-string v1, "maxBufferMs"

    .line 310
    invoke-static {v1, v8, v8, v7}, Ll/ۨ᩹֫;->֫(Ljava/lang/String;IILjava/lang/String;)V

    const-string v1, "backBufferDurationMs"

    .line 311
    invoke-static {v1, v3, v3, v4}, Ll/ۨ᩹֫;->֫(Ljava/lang/String;IILjava/lang/String;)V

    .line 313
    iput-object v0, p0, Ll/ۨ᩹֫;->֫:Ll/۫ܿۧ;

    int-to-long v0, v8

    .line 314
    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v4

    iput-wide v4, p0, Ll/ۨ᩹֫;->᩻:J

    .line 315
    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨ᩹֫;->ܳ:J

    int-to-long v0, v2

    .line 316
    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨ᩹֫;->ᩳ:J

    int-to-long v0, v6

    .line 317
    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨ᩹֫;->ܽ:J

    const/4 v0, -0x1

    .line 318
    iput v0, p0, Ll/ۨ᩹֫;->ۜ:I

    int-to-long v0, v3

    .line 320
    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨ᩹֫;->ۧ:J

    .line 322
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۨ᩹֫;->ܿ:Ljava/util/HashMap;

    const-wide/16 v0, -0x1

    .line 323
    iput-wide v0, p0, Ll/ۨ᩹֫;->᩷:J

    return-void
.end method

.method public static ֫(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    if-lt p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 520
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " cannot be less than "

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۙ֫;[Ll/ۢܿۧ;)V
    .locals 6

    .line 345
    iget-object p1, p1, Ll/۫ۙ֫;->ܽ:Ll/ܰ۬֫;

    iget-object v0, p0, Ll/ۨ᩹֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ᩹֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, -0x1

    .line 346
    iget v2, p0, Ll/ۨ᩹֫;->ۜ:I

    if-ne v2, v1, :cond_2

    .line 444
    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/high16 v4, 0xc80000

    if-ge v2, v1, :cond_1

    aget-object v5, p2, v2

    if-eqz v5, :cond_0

    .line 446
    invoke-interface {v5}, Ll/ᩴܿۧ;->ܿ()Ll/۬᩵֫;

    move-result-object v5

    iget v5, v5, Ll/۬᩵֫;->ܿ:I

    packed-switch v5, :pswitch_data_0

    .line 515
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    const/high16 v4, 0x1900000

    goto :goto_1

    :pswitch_1
    const/high16 v4, 0x20000

    goto :goto_1

    :pswitch_2
    const/high16 v4, 0x7d00000

    goto :goto_1

    :pswitch_3
    const/high16 v4, 0x89a0000

    goto :goto_1

    :pswitch_4
    const/4 v4, 0x0

    :goto_1
    :pswitch_5
    add-int/2addr v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 449
    :cond_1
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 348
    :cond_2
    iput v2, p1, Ll/ۛ᩹֫;->ۧ:I

    .line 487
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p1

    iget-object p2, p0, Ll/ۨ᩹֫;->֫:Ll/۫ܿۧ;

    if-eqz p1, :cond_3

    .line 488
    invoke-virtual {p2}, Ll/۫ܿۧ;->ᩳ()V

    return-void

    .line 490
    :cond_3
    invoke-virtual {p0}, Ll/ۨ᩹֫;->ܿ()I

    move-result p1

    invoke-virtual {p2, p1}, Ll/۫ܿۧ;->֫(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final ֫(Ll/ܰ۬֫;)V
    .locals 8

    .line 328
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    .line 329
    iget-wide v2, p0, Ll/ۨ᩹֫;->᩷:J

    const-wide/16 v4, -0x1

    const/4 v6, 0x0

    cmp-long v7, v2, v4

    if-eqz v7, :cond_1

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    const-string v3, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper)."

    invoke-static {v3, v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/String;Z)V

    .line 333
    iput-wide v0, p0, Ll/ۨ᩹֫;->᩷:J

    .line 334
    iget-object v0, p0, Ll/ۨ᩹֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 335
    new-instance v1, Ll/ۛ᩹֫;

    invoke-direct {v1, v6}, Ll/ۛ᩹֫;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    :cond_2
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ᩹֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, -0x1

    .line 474
    iget v1, p0, Ll/ۨ᩹֫;->ۜ:I

    if-ne v1, v0, :cond_3

    const/high16 v1, 0xc80000

    .line 476
    :cond_3
    iput v1, p1, Ll/ۛ᩹֫;->ۧ:I

    .line 477
    iput-boolean v6, p1, Ll/ۛ᩹֫;->֫:Z

    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ll/۫ۙ֫;)Z
    .locals 8

    .line 410
    iget-wide v0, p1, Ll/۫ۙ֫;->֫:J

    iget v2, p1, Ll/۫ۙ֫;->ۧ:F

    .line 411
    invoke-static {v0, v1, v2}, Ll/ۘ֨֫;->ۧ(JF)J

    move-result-wide v0

    .line 414
    iget-boolean v2, p1, Ll/۫ۙ֫;->ᩳ:Z

    if-eqz v2, :cond_0

    iget-wide v2, p0, Ll/ۨ᩹֫;->ܽ:J

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Ll/ۨ᩹֫;->ᩳ:J

    .line 415
    :goto_0
    iget-wide v4, p1, Ll/۫ۙ֫;->ܿ:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v4, v6

    if-eqz p1, :cond_1

    const-wide/16 v6, 0x2

    .line 416
    div-long/2addr v4, v6

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    :cond_1
    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-lez p1, :cond_3

    cmp-long p1, v0, v2

    if-gez p1, :cond_3

    .line 418
    iget-object p1, p0, Ll/ۨ᩹֫;->֫:Ll/۫ܿۧ;

    .line 421
    invoke-virtual {p1}, Ll/۫ܿۧ;->ܽ()I

    move-result p1

    invoke-virtual {p0}, Ll/ۨ᩹֫;->ܿ()I

    move-result v0

    if-lt p1, v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()J
    .locals 2

    .line 372
    iget-wide v0, p0, Ll/ۨ᩹֫;->ۧ:J

    return-wide v0
.end method

.method public final ۧ(Ll/ܰ۬֫;)V
    .locals 2

    .line 481
    iget-object v0, p0, Ll/ۨ᩹֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 487
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p1

    iget-object v1, p0, Ll/ۨ᩹֫;->֫:Ll/۫ܿۧ;

    if-eqz p1, :cond_0

    .line 488
    invoke-virtual {v1}, Ll/۫ܿۧ;->ᩳ()V

    goto :goto_0

    .line 490
    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩹֫;->ܿ()I

    move-result p1

    invoke-virtual {v1, p1}, Ll/۫ܿۧ;->֫(I)V

    .line 360
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    const-wide/16 v0, -0x1

    .line 361
    iput-wide v0, p0, Ll/ۨ᩹֫;->᩷:J

    :cond_2
    return-void
.end method

.method public final ۧ(Ll/۫ۙ֫;)Z
    .locals 13

    .line 382
    iget-object v0, p0, Ll/ۨ᩹֫;->ܿ:Ljava/util/HashMap;

    iget-object v1, p1, Ll/۫ۙ֫;->ܽ:Ll/ܰ۬֫;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩹֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    iget-object v1, p0, Ll/ۨ᩹֫;->֫:Ll/۫ܿۧ;

    .line 384
    invoke-virtual {v1}, Ll/۫ܿۧ;->ܽ()I

    move-result v1

    invoke-virtual {p0}, Ll/ۨ᩹֫;->ܿ()I

    move-result v2

    const/4 v3, 0x0

    if-lt v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 386
    :goto_0
    iget v2, p1, Ll/۫ۙ֫;->ۧ:F

    const/high16 v4, 0x3f800000    # 1.0f

    iget-wide v5, p0, Ll/ۨ᩹֫;->ܳ:J

    iget-wide v7, p0, Ll/ۨ᩹֫;->᩻:J

    cmpl-float v4, v2, v4

    if-lez v4, :cond_1

    .line 390
    invoke-static {v7, v8, v2}, Ll/ۘ֨֫;->֫(JF)J

    move-result-wide v7

    .line 391
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    :cond_1
    const-wide/32 v9, 0x7a120

    .line 394
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    .line 395
    iget-wide v11, p1, Ll/۫ۙ֫;->֫:J

    cmp-long p1, v11, v7

    if-gez p1, :cond_2

    xor-int/lit8 p1, v1, 0x1

    .line 396
    iput-boolean p1, v0, Ll/ۛ᩹֫;->֫:Z

    if-eqz v1, :cond_4

    cmp-long p1, v11, v9

    if-gez p1, :cond_4

    const-string p1, "Target buffer size reached with less than 500ms of buffered media data."

    .line 398
    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    cmp-long p1, v11, v5

    if-gez p1, :cond_3

    if-eqz v1, :cond_4

    .line 403
    :cond_3
    iput-boolean v3, v0, Ll/ۛ᩹֫;->֫:Z

    .line 405
    :cond_4
    :goto_1
    iget-boolean p1, v0, Ll/ۛ᩹֫;->֫:Z

    return p1
.end method

.method public final ܽ()Ll/۫ܿۧ;
    .locals 1

    .line 367
    iget-object v0, p0, Ll/ۨ᩹֫;->֫:Ll/۫ܿۧ;

    return-object v0
.end method

.method public final ܽ(Ll/ܰ۬֫;)V
    .locals 1

    .line 481
    iget-object v0, p0, Ll/ۨ᩹֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 487
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p1

    iget-object v0, p0, Ll/ۨ᩹֫;->֫:Ll/۫ܿۧ;

    if-eqz p1, :cond_0

    .line 488
    invoke-virtual {v0}, Ll/۫ܿۧ;->ᩳ()V

    return-void

    .line 490
    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩹֫;->ܿ()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/۫ܿۧ;->֫(I)V

    :cond_1
    return-void
.end method

.method public final ܿ()I
    .locals 3

    .line 465
    iget-object v0, p0, Ll/ۨ᩹֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ᩹֫;

    .line 466
    iget v2, v2, Ll/ۛ᩹֫;->ۧ:I

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final ᩳ()Z
    .locals 2

    .line 427
    iget-object v0, p0, Ll/ۨ᩹֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩹֫;

    .line 428
    iget-boolean v1, v1, Ll/ۛ᩹֫;->֫:Z

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method
