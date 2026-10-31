.class public final Ll/ۚۙۧ;
.super Ljava/lang/Object;
.source "R5DS"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final ۗ:Ljava/lang/ThreadLocal;

.field public static ۬:Ljava/util/Comparator;


# instance fields
.field public ۙ:Ljava/util/ArrayList;

.field public ᩶:Ljava/util/ArrayList;

.field public ᩸:J

.field public ᩹:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ۚۙۧ;->ۗ:Ljava/lang/ThreadLocal;

    .line 190
    new-instance v0, Ll/ᩴۙۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۚۙۧ;->۬:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚۙۧ;->᩶:Ljava/util/ArrayList;

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚۙۧ;->ۙ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ll/۬۬ۧ;IJ)Ll/ۗ۬ۧ;
    .locals 5

    .line 265
    iget-object v0, p0, Ll/۬۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {v0}, Ll/᩹᩶ۧ;->ۧ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 267
    iget-object v3, p0, Ll/۬۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {v3, v2}, Ll/᩹᩶ۧ;->ܽ(I)Landroid/view/View;

    move-result-object v3

    .line 268
    invoke-static {v3}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v3

    .line 270
    iget v4, v3, Ll/ۗ۬ۧ;->mPosition:I

    if-ne v4, p1, :cond_0

    invoke-virtual {v3}, Ll/ۗ۬ۧ;->isInvalid()Z

    move-result v3

    if-nez v3, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 284
    :cond_1
    iget-object v0, p0, Ll/۬۬ۧ;->mRecycler:Ll/ۖ۬ۧ;

    .line 287
    :try_start_0
    invoke-virtual {p0}, Ll/۬۬ۧ;->onEnterLayoutOrScroll()V

    .line 288
    invoke-virtual {v0, p1, p2, p3}, Ll/ۖ۬ۧ;->֫(IJ)Ll/ۗ۬ۧ;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 292
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->isBound()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->isInvalid()Z

    move-result p2

    if-nez p2, :cond_2

    .line 295
    iget-object p2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0, p2}, Ll/ۖ۬ۧ;->֫(Landroid/view/View;)V

    goto :goto_1

    .line 301
    :cond_2
    invoke-virtual {v0, p1, v1}, Ll/ۖ۬ۧ;->֫(Ll/ۗ۬ۧ;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 305
    :cond_3
    :goto_1
    invoke-virtual {p0, v1}, Ll/۬۬ۧ;->onExitLayoutOrScroll(Z)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v1}, Ll/۬۬ۧ;->onExitLayoutOrScroll(Z)V

    .line 306
    throw p1
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 374
    iget-object v0, p0, Ll/ۚۙۧ;->᩶:Ljava/util/ArrayList;

    const-wide/16 v1, 0x0

    :try_start_0
    const-string v3, "RV Prefetch"

    sget v4, Ll/ۚ۫;->֫:I

    .line 108
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 376
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 383
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    move-wide v5, v1

    :goto_0
    if-ge v4, v3, :cond_2

    .line 386
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۬۬ۧ;

    .line 387
    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    move-result v8

    if-nez v8, :cond_1

    .line 388
    invoke-virtual {v7}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v7

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    cmp-long v0, v5, v1

    if-nez v0, :cond_3

    goto :goto_1

    .line 397
    :cond_3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۚۙۧ;->᩸:J

    add-long/2addr v3, v5

    .line 399
    invoke-virtual {p0, v3, v4}, Ll/ۚۙۧ;->֫(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 403
    :goto_1
    iput-wide v1, p0, Ll/ۚۙۧ;->᩹:J

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_0
    move-exception v0

    .line 403
    iput-wide v1, p0, Ll/ۚۙۧ;->᩹:J

    .line 404
    sget v1, Ll/ۚ۫;->֫:I

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 405
    throw v0
.end method

.method public final ֫(J)V
    .locals 15

    move-object v1, p0

    .line 217
    iget-object v0, v1, Ll/ۚۙۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    .line 220
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۬۬ۧ;

    .line 221
    invoke-virtual {v6}, Landroid/view/View;->getWindowVisibility()I

    move-result v7

    if-nez v7, :cond_0

    .line 222
    iget-object v7, v6, Ll/۬۬ۧ;->mPrefetchRegistry:Ll/᩵ۙۧ;

    invoke-virtual {v7, v6, v3}, Ll/᩵ۙۧ;->֫(Ll/۬۬ۧ;Z)V

    .line 223
    iget-object v6, v6, Ll/۬۬ۧ;->mPrefetchRegistry:Ll/᩵ۙۧ;

    iget v6, v6, Ll/᩵ۙۧ;->֫:I

    add-int/2addr v5, v6

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 228
    :cond_1
    iget-object v4, v1, Ll/ۚۙۧ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->ensureCapacity(I)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x1

    if-ge v5, v2, :cond_6

    .line 231
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۬۬ۧ;

    .line 232
    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_5

    .line 237
    :cond_2
    iget-object v8, v7, Ll/۬۬ۧ;->mPrefetchRegistry:Ll/᩵ۙۧ;

    .line 238
    iget v9, v8, Ll/᩵ۙۧ;->ܽ:I

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    iget v10, v8, Ll/᩵ۙۧ;->ᩳ:I

    .line 239
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v10

    add-int/2addr v10, v9

    const/4 v9, 0x0

    .line 240
    :goto_2
    iget v11, v8, Ll/᩵ۙۧ;->֫:I

    mul-int/lit8 v11, v11, 0x2

    if-ge v9, v11, :cond_5

    .line 242
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-lt v6, v11, :cond_3

    .line 243
    new-instance v11, Ll/֡ۙۧ;

    invoke-direct {v11}, Ll/֡ۙۧ;-><init>()V

    .line 244
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 246
    :cond_3
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/֡ۙۧ;

    .line 248
    :goto_3
    iget-object v12, v8, Ll/᩵ۙۧ;->ۧ:[I

    add-int/lit8 v13, v9, 0x1

    aget v13, v12, v13

    if-gt v13, v10, :cond_4

    const/4 v14, 0x1

    goto :goto_4

    :cond_4
    const/4 v14, 0x0

    .line 250
    :goto_4
    iput-boolean v14, v11, Ll/֡ۙۧ;->ۧ:Z

    .line 251
    iput v10, v11, Ll/֡ۙۧ;->ܿ:I

    .line 252
    iput v13, v11, Ll/֡ۙۧ;->֫:I

    .line 253
    iput-object v7, v11, Ll/֡ۙۧ;->ᩳ:Ll/۬۬ۧ;

    .line 254
    aget v12, v12, v9

    iput v12, v11, Ll/֡ۙۧ;->ܽ:I

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v9, v9, 0x2

    goto :goto_2

    :cond_5
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 261
    :cond_6
    sget-object v0, Ll/ۚۙۧ;->۬:Ljava/util/Comparator;

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v0, 0x0

    .line 356
    :goto_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_d

    .line 357
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ۙۧ;

    .line 358
    iget-object v5, v2, Ll/֡ۙۧ;->ᩳ:Ll/۬۬ۧ;

    if-nez v5, :cond_7

    goto/16 :goto_b

    .line 344
    :cond_7
    iget-boolean v6, v2, Ll/֡ۙۧ;->ۧ:Z

    if-eqz v6, :cond_8

    const-wide v8, 0x7fffffffffffffffL

    goto :goto_7

    :cond_8
    move-wide/from16 v8, p1

    .line 345
    :goto_7
    iget v6, v2, Ll/֡ۙۧ;->ܽ:I

    invoke-static {v5, v6, v8, v9}, Ll/ۚۙۧ;->֫(Ll/۬۬ۧ;IJ)Ll/ۗ۬ۧ;

    move-result-object v5

    if-eqz v5, :cond_c

    .line 347
    iget-object v6, v5, Ll/ۗ۬ۧ;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    if-eqz v6, :cond_c

    .line 349
    invoke-virtual {v5}, Ll/ۗ۬ۧ;->isBound()Z

    move-result v6

    if-eqz v6, :cond_c

    .line 350
    invoke-virtual {v5}, Ll/ۗ۬ۧ;->isInvalid()Z

    move-result v6

    if-nez v6, :cond_c

    .line 351
    iget-object v5, v5, Ll/ۗ۬ۧ;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۬۬ۧ;

    if-nez v5, :cond_9

    goto :goto_9

    .line 316
    :cond_9
    iget-boolean v6, v5, Ll/۬۬ۧ;->mDataSetHasChangedAfterLayout:Z

    if-eqz v6, :cond_a

    iget-object v6, v5, Ll/۬۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    .line 317
    invoke-virtual {v6}, Ll/᩹᩶ۧ;->ۧ()I

    move-result v6

    if-eqz v6, :cond_a

    .line 320
    invoke-virtual {v5}, Ll/۬۬ۧ;->removeAndRecycleViews()V

    .line 324
    :cond_a
    iget-object v6, v5, Ll/۬۬ۧ;->mPrefetchRegistry:Ll/᩵ۙۧ;

    .line 325
    invoke-virtual {v6, v5, v7}, Ll/᩵ۙۧ;->֫(Ll/۬۬ۧ;Z)V

    .line 327
    iget v8, v6, Ll/᩵ۙۧ;->֫:I

    if-eqz v8, :cond_c

    :try_start_0
    const-string v8, "RV Nested Prefetch"

    .line 329
    sget v9, Ll/ۚ۫;->֫:I

    .line 108
    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 330
    iget-object v8, v5, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    iget-object v9, v5, Ll/۬۬ۧ;->mAdapter:Ll/᩶ۗۧ;

    .line 13413
    iput v7, v8, Ll/᩸۬ۧ;->ۜ:I

    .line 13414
    invoke-virtual {v9}, Ll/᩶ۗۧ;->getItemCount()I

    move-result v9

    iput v9, v8, Ll/᩸۬ۧ;->᩻:I

    .line 13415
    iput-boolean v3, v8, Ll/᩸۬ۧ;->ܿ:Z

    .line 13416
    iput-boolean v3, v8, Ll/᩸۬ۧ;->ۘ:Z

    .line 13417
    iput-boolean v3, v8, Ll/᩸۬ۧ;->ܳ:Z

    const/4 v8, 0x0

    .line 331
    :goto_8
    iget v9, v6, Ll/᩵ۙۧ;->֫:I

    mul-int/lit8 v9, v9, 0x2

    if-ge v8, v9, :cond_b

    .line 334
    iget-object v9, v6, Ll/᩵ۙۧ;->ۧ:[I

    aget v9, v9, v8

    move-wide/from16 v10, p1

    .line 335
    invoke-static {v5, v9, v10, v11}, Ll/ۚۙۧ;->֫(Ll/۬۬ۧ;IJ)Ll/ۗ۬ۧ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v8, v8, 0x2

    goto :goto_8

    :cond_b
    move-wide/from16 v10, p1

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_a

    :catchall_0
    move-exception v0

    .line 338
    sget v2, Ll/ۚ۫;->֫:I

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 339
    throw v0

    :cond_c
    :goto_9
    move-wide/from16 v10, p1

    .line 46
    :goto_a
    iput-boolean v3, v2, Ll/֡ۙۧ;->ۧ:Z

    .line 47
    iput v3, v2, Ll/֡ۙۧ;->ܿ:I

    .line 48
    iput v3, v2, Ll/֡ۙۧ;->֫:I

    const/4 v5, 0x0

    .line 49
    iput-object v5, v2, Ll/֡ۙۧ;->ᩳ:Ll/۬۬ۧ;

    .line 50
    iput v3, v2, Ll/֡ۙۧ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_6

    :cond_d
    :goto_b
    return-void
.end method

.method public final ֫(Ll/۬۬ۧ;II)V
    .locals 5

    .line 177
    invoke-virtual {p1}, Ll/۬۬ۧ;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 178
    sget-boolean v0, Ll/۬۬ۧ;->sDebugAssertionsEnabled:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۚۙۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 179
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "attempting to post unregistered view!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 181
    :cond_1
    :goto_0
    iget-wide v0, p0, Ll/ۚۙۧ;->᩹:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    .line 182
    invoke-virtual {p1}, Ll/۬۬ۧ;->getNanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۚۙۧ;->᩹:J

    .line 183
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 187
    :cond_2
    iget-object p1, p1, Ll/۬۬ۧ;->mPrefetchRegistry:Ll/᩵ۙۧ;

    .line 74
    iput p2, p1, Ll/᩵ۙۧ;->ܽ:I

    .line 75
    iput p3, p1, Ll/᩵ۙۧ;->ᩳ:I

    return-void
.end method
