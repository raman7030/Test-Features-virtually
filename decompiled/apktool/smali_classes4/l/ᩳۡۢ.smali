.class public final synthetic Ll/ᩳۡۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Landroid/widget/CheckBox;

.field public final synthetic ۙ:Landroid/widget/CheckBox;

.field public final synthetic ۛ:Ll/֡ۚۢ;

.field public final synthetic ۤ:Ljava/lang/String;

.field public final synthetic ۫:Ll/ۤۤᩳ;

.field public final synthetic ۬:Landroid/widget/CheckBox;

.field public final synthetic ᩶:Landroid/widget/CheckBox;

.field public final synthetic ᩸:Ll/ۜۡۢ;

.field public final synthetic ᩹:Ll/ۤۤᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۜۡۢ;Ll/ۤۤᩳ;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/ۤۤᩳ;Ljava/lang/String;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۡۢ;->᩸:Ll/ۜۡۢ;

    iput-object p2, p0, Ll/ᩳۡۢ;->᩹:Ll/ۤۤᩳ;

    iput-object p3, p0, Ll/ᩳۡۢ;->᩶:Landroid/widget/CheckBox;

    iput-object p4, p0, Ll/ᩳۡۢ;->ۙ:Landroid/widget/CheckBox;

    iput-object p5, p0, Ll/ᩳۡۢ;->ۗ:Landroid/widget/CheckBox;

    iput-object p6, p0, Ll/ᩳۡۢ;->۬:Landroid/widget/CheckBox;

    iput-object p7, p0, Ll/ᩳۡۢ;->۫:Ll/ۤۤᩳ;

    iput-object p8, p0, Ll/ᩳۡۢ;->ۤ:Ljava/lang/String;

    iput-object p9, p0, Ll/ᩳۡۢ;->ۛ:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 17

    move-object/from16 v1, p0

    .line 485
    iget-object v2, v1, Ll/ᩳۡۢ;->᩸:Ll/ۜۡۢ;

    iget-object v0, v2, Ll/ۜۡۢ;->᩷:Ll/ܽܺۢ;

    iget-object v0, v0, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;

    iget-object v3, v1, Ll/ᩳۡۢ;->᩹:Ll/ۤۤᩳ;

    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Ll/ۧܺۢ;->ᩳ:Ljava/lang/String;

    .line 486
    iget-object v0, v2, Ll/ۜۡۢ;->᩷:Ll/ܽܺۢ;

    iget-object v0, v0, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;

    iget-object v4, v1, Ll/ᩳۡۢ;->᩶:Landroid/widget/CheckBox;

    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    iput-boolean v4, v0, Ll/ۧܺۢ;->ܽ:Z

    .line 487
    iget-object v0, v2, Ll/ۜۡۢ;->᩷:Ll/ܽܺۢ;

    iget-object v0, v0, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;

    iget-object v4, v1, Ll/ᩳۡۢ;->ۙ:Landroid/widget/CheckBox;

    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    iput-boolean v4, v0, Ll/ۧܺۢ;->֫:Z

    .line 488
    iget-object v0, v2, Ll/ۜۡۢ;->᩷:Ll/ܽܺۢ;

    iget-object v0, v0, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;

    iget-object v4, v1, Ll/ᩳۡۢ;->ۗ:Landroid/widget/CheckBox;

    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    iput-boolean v4, v0, Ll/ۧܺۢ;->ܳ:Z

    .line 489
    iget-object v0, v2, Ll/ۜۡۢ;->᩷:Ll/ܽܺۢ;

    iget-object v0, v0, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;

    iget-object v4, v1, Ll/ᩳۡۢ;->۬:Landroid/widget/CheckBox;

    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    iput-boolean v4, v0, Ll/ۧܺۢ;->ܿ:Z

    .line 490
    iget-object v0, v2, Ll/ۜۡۢ;->᩷:Ll/ܽܺۢ;

    iget-object v0, v0, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;

    iget-object v4, v1, Ll/ᩳۡۢ;->۫:Ll/ۤۤᩳ;

    invoke-virtual {v4}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Ll/ۧܺۢ;->ۧ:Ljava/lang/String;

    .line 491
    iget-object v0, v2, Ll/ۜۡۢ;->᩷:Ll/ܽܺۢ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, v0, Ll/ܽܺۢ;->ۛ:J

    .line 492
    iget-object v4, v2, Ll/ۜۡۢ;->ۢ:Ll/۟ۡۢ;

    iget-object v0, v2, Ll/ۜۡۢ;->᩷:Ll/ܽܺۢ;

    iget-object v0, v0, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;

    iget-object v0, v0, Ll/ۧܺۢ;->ۧ:Ljava/lang/String;

    iget-object v5, v2, Ll/ۜۡۢ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v5

    iget-object v6, v2, Ll/ۜۡۢ;->᩷:Ll/ܽܺۢ;

    sget v7, Ll/۟ۡۢ;->ᩴۧ:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 612
    :try_start_0
    invoke-static {v0}, Ll/᩹ۢۢ;->ۧ(Ljava/lang/String;)Ll/᩹ۢۢ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 617
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 618
    iget-object v6, v6, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;

    iget-object v6, v6, Ll/ۧܺۢ;->ᩳ:Ljava/lang/String;

    const-string v10, "\n"

    invoke-virtual {v6, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v10, v6

    const/4 v11, 0x0

    :goto_0
    const/4 v12, 0x1

    if-ge v11, v10, :cond_1

    aget-object v13, v6, v11

    .line 619
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_0

    .line 620
    new-instance v14, Ll/ۗۢۢ;

    invoke-direct {v14, v13, v12}, Ll/ۗۢۢ;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 623
    :cond_1
    invoke-static {v9}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 626
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v10, 0x0

    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۖۡۢ;

    .line 627
    iget-object v13, v11, Ll/ۖۡۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v13}, Ll/᩹ۢۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 629
    iget-boolean v14, v11, Ll/ۖۡۢ;->֫:Z

    if-eqz v14, :cond_3

    const/4 v13, 0x1

    goto :goto_2

    .line 632
    :cond_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_5

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ۗۢۢ;

    .line 633
    invoke-virtual {v15, v13}, Ll/ۗۢۢ;->֫(Ljava/lang/String;)Z

    move-result v16

    if-eqz v16, :cond_4

    .line 634
    iget-boolean v13, v15, Ll/ۗۢۢ;->᩸:Z

    xor-int/2addr v13, v12

    goto :goto_2

    :cond_5
    const/4 v13, 0x0

    :goto_2
    if-eqz v13, :cond_2

    add-int/lit8 v6, v6, 0x1

    .line 641
    iget v11, v11, Ll/ۖۡۢ;->ܽ:I

    add-int/2addr v10, v11

    goto :goto_1

    :cond_6
    const/4 v0, 0x2

    if-nez v6, :cond_7

    const v5, 0x7f1200a7

    .line 645
    invoke-static {v5}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    const/high16 v5, 0x40c00000    # 6.0f

    .line 646
    invoke-static {v5}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v5

    const/high16 v6, 0x40400000    # 3.0f

    .line 647
    invoke-static {v6}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v6

    neg-int v9, v5

    int-to-float v9, v9

    int-to-float v5, v5

    neg-int v10, v6

    int-to-float v10, v10

    int-to-float v6, v6

    const/16 v11, 0xf

    new-array v11, v11, [F

    const/4 v13, 0x0

    aput v13, v11, v8

    aput v9, v11, v12

    aput v13, v11, v0

    const/4 v0, 0x3

    aput v5, v11, v0

    const/4 v0, 0x4

    aput v13, v11, v0

    const/4 v0, 0x5

    aput v9, v11, v0

    const/4 v0, 0x6

    aput v13, v11, v0

    const/4 v0, 0x7

    aput v5, v11, v0

    const/16 v0, 0x8

    aput v13, v11, v0

    const/16 v0, 0x9

    aput v10, v11, v0

    const/16 v0, 0xa

    aput v13, v11, v0

    const/16 v0, 0xb

    aput v6, v11, v0

    const/16 v0, 0xc

    aput v13, v11, v0

    const/16 v0, 0xd

    aput v10, v11, v0

    const/16 v0, 0xe

    aput v13, v11, v0

    const-string v0, "translationX"

    .line 648
    invoke-static {v3, v0, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v5, 0x3e8

    .line 650
    invoke-virtual {v0, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 651
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v3}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 652
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_4

    .line 655
    :cond_7
    invoke-static {}, Ll/ܺܰۡ;->֫()I

    move-result v3

    if-gt v6, v3, :cond_9

    invoke-static {}, Ll/ܺܰۡ;->ܽ()I

    move-result v3

    if-le v10, v3, :cond_8

    goto :goto_3

    :cond_8
    const/4 v8, 0x1

    goto :goto_4

    .line 656
    :cond_9
    :goto_3
    invoke-virtual {v4}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    const v5, 0x7f120307

    invoke-virtual {v3, v5}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 657
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v5, v0, v8

    aput-object v6, v0, v12

    const v5, 0x7f1200af

    invoke-virtual {v4, v5, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const v0, 0x7f120189

    .line 658
    invoke-virtual {v3, v0, v7}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 659
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    goto :goto_4

    :catch_0
    move-exception v0

    move-object v3, v0

    .line 614
    new-instance v0, Ljava/lang/Exception;

    const v5, 0x7f1200a6

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 546
    invoke-virtual {v4, v0, v7}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :goto_4
    if-eqz v8, :cond_a

    .line 493
    invoke-virtual {v4}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v3, 0x7f120491

    invoke-virtual {v0, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    const v3, 0x7f1200c6

    .line 494
    invoke-virtual {v0, v3}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v3, Ll/ܳۡۢ;

    iget-object v4, v1, Ll/ᩳۡۢ;->ۤ:Ljava/lang/String;

    iget-object v5, v1, Ll/ᩳۡۢ;->ۛ:Ll/֡ۚۢ;

    invoke-direct {v3, v2, v4, v5}, Ll/ܳۡۢ;-><init>(Ll/ۜۡۢ;Ljava/lang/String;Ll/֡ۚۢ;)V

    const v4, 0x7f12070a

    .line 495
    invoke-virtual {v0, v4, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v3, 0x7f12015e

    .line 500
    invoke-virtual {v0, v3, v7}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v3, Ll/᩻ۡۢ;

    invoke-direct {v3, v2}, Ll/᩻ۡۢ;-><init>(Ll/ۜۡۢ;)V

    const v2, 0x7f12079c

    .line 501
    invoke-virtual {v0, v2, v3}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 503
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    :cond_a
    return-void
.end method
