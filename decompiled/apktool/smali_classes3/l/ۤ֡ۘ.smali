.class public final Ll/ۤ֡ۘ;
.super Landroid/os/Handler;
.source "21WX"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 569
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۤ֡ۘ;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 14

    .line 585
    invoke-static {}, Ll/ۨ֡ۘ;->ۜ()Ljava/lang/ThreadLocal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 586
    invoke-static {}, Ll/ۨ֡ۘ;->᩷()Ljava/lang/ThreadLocal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 587
    iget p1, p1, Landroid/os/Message;->what:I

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz p1, :cond_1

    if-eq p1, v5, :cond_0

    goto/16 :goto_9

    :cond_0
    const/4 p1, 0x1

    goto :goto_4

    .line 591
    :cond_1
    invoke-static {}, Ll/ۨ֡ۘ;->ܺ()Ljava/lang/ThreadLocal;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 592
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-gtz v6, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x1

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v6, 0x0

    .line 600
    :cond_4
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-lez v7, :cond_6

    .line 602
    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    .line 603
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 604
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v8, :cond_4

    .line 606
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۨ֡ۘ;

    .line 608
    invoke-static {v10}, Ll/ۨ֡ۘ;->֫(Ll/ۨ֡ۘ;)J

    move-result-wide v11

    cmp-long v13, v11, v2

    if-nez v13, :cond_5

    .line 609
    invoke-static {v10}, Ll/ۨ֡ۘ;->ᩳ(Ll/ۨ֡ۘ;)V

    goto :goto_3

    .line 611
    :cond_5
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_6
    move p1, v6

    .line 619
    :goto_4
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v6

    .line 620
    invoke-static {}, Ll/ۨ֡ۘ;->ۖ()Ljava/lang/ThreadLocal;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/ArrayList;

    .line 621
    invoke-static {}, Ll/ۨ֡ۘ;->ۢ()Ljava/lang/ThreadLocal;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/ArrayList;

    .line 625
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_5
    if-ge v11, v10, :cond_8

    .line 627
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۨ֡ۘ;

    .line 628
    invoke-static {v12, v6, v7}, Ll/ۨ֡ۘ;->֫(Ll/ۨ֡ۘ;J)Z

    move-result v13

    if-eqz v13, :cond_7

    .line 629
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    .line 632
    :cond_8
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-lez v10, :cond_a

    const/4 v11, 0x0

    :goto_6
    if-ge v11, v10, :cond_9

    .line 635
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۨ֡ۘ;

    .line 636
    invoke-static {v12}, Ll/ۨ֡ۘ;->ᩳ(Ll/ۨ֡ۘ;)V

    .line 637
    invoke-static {v12}, Ll/ۨ֡ۘ;->ۧ(Ll/ۨ֡ۘ;)V

    .line 638
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    .line 640
    :cond_9
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 645
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v10, 0x0

    :goto_7
    if-ge v10, v8, :cond_d

    .line 648
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۨ֡ۘ;

    .line 649
    invoke-virtual {v11, v6, v7}, Ll/ۨ֡ۘ;->֫(J)Z

    move-result v12

    if-eqz v12, :cond_b

    .line 650
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 652
    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ne v12, v8, :cond_c

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_c
    add-int/lit8 v8, v8, -0x1

    .line 663
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_7

    .line 666
    :cond_d
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-lez v8, :cond_f

    .line 667
    :goto_8
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v4, v8, :cond_e

    .line 668
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۨ֡ۘ;

    invoke-static {v8}, Ll/ۨ֡ۘ;->ܽ(Ll/ۨ֡ۘ;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    .line 670
    :cond_e
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    :cond_f
    if-eqz p1, :cond_11

    .line 675
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_11

    .line 676
    :cond_10
    invoke-static {}, Ll/ۨ֡ۘ;->ۡ()J

    move-result-wide v0

    .line 677
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v6

    sub-long/2addr v0, v8

    .line 676
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    invoke-virtual {p0, v5, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_11
    :goto_9
    return-void
.end method
