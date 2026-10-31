.class public final Ll/۫ۢܳ;
.super Ljava/lang/Object;
.source "I29D"


# static fields
.field public static ᩶:J

.field public static ᩹:I


# instance fields
.field public ֡:Ll/ܽ᩷ܳ;

.field public final ֨:Ll/ۢۢۡ;

.field public final ֫:Ll/۫᩵ۘ;

.field public ۖ:Ljava/lang/String;

.field public final ۘ:Ll/֡ۢܳ;

.field public ۚ:Z

.field public ۜ:I

.field public ۠:Ll/ۙۢܳ;

.field public ۡ:I

.field public ۢ:J

.field public ۧ:I

.field public ܳ:Ljava/util/List;

.field public final ܶ:Ll/ۙۡۡ;

.field public ܺ:I

.field public ܽ:[I

.field public ܿ:J

.field public ᩳ:Ljava/lang/String;

.field public final ᩴ:Ll/᩺᩻ܳ;

.field public final ᩵:Ll/ܰ᩻ܳ;

.field public final ᩷:Ll/᩵ۢܳ;

.field public final ᩸:Ll/ܽۢܳ;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ll/ۢۢۡ;)V
    .locals 5

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    new-instance v0, Ll/۫᩵ۘ;

    new-instance v1, Ll/᩶ۢܳ;

    invoke-direct {v1, p0}, Ll/᩶ۢܳ;-><init>(Ll/۫ۢܳ;)V

    invoke-direct {v0, v1}, Ll/۫᩵ۘ;-><init>(Landroid/widget/BaseAdapter;)V

    iput-object v0, p0, Ll/۫ۢܳ;->֫:Ll/۫᩵ۘ;

    .line 531
    new-instance v1, Ll/ܰ᩻ܳ;

    invoke-direct {v1}, Ll/ܰ᩻ܳ;-><init>()V

    iput-object v1, p0, Ll/۫ۢܳ;->᩵:Ll/ܰ᩻ܳ;

    .line 0
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 532
    iput-object v1, p0, Ll/۫ۢܳ;->ܳ:Ljava/util/List;

    const/4 v1, -0x1

    .line 533
    iput v1, p0, Ll/۫ۢܳ;->ۜ:I

    iput v1, p0, Ll/۫ۢܳ;->ۡ:I

    iput v1, p0, Ll/۫ۢܳ;->ܺ:I

    .line 534
    iput v1, p0, Ll/۫ۢܳ;->ۧ:I

    const/4 v1, 0x0

    new-array v1, v1, [I

    .line 535
    iput-object v1, p0, Ll/۫ۢܳ;->ܽ:[I

    const/4 v1, 0x1

    .line 536
    iput-boolean v1, p0, Ll/۫ۢܳ;->ۚ:Z

    const-wide v1, 0x7fffffffffffffffL

    .line 539
    iput-wide v1, p0, Ll/۫ۢܳ;->ۢ:J

    .line 540
    new-instance v1, Ll/᩵ۢܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/᩵ۢܳ;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, Ll/۫ۢܳ;->᩷:Ll/᩵ۢܳ;

    .line 541
    new-instance v1, Ll/֡ۢܳ;

    invoke-direct {v1, p0}, Ll/֡ۢܳ;-><init>(Ll/۫ۢܳ;)V

    iput-object v1, p0, Ll/۫ۢܳ;->ۘ:Ll/֡ۢܳ;

    .line 50
    iput-object p1, p0, Ll/۫ۢܳ;->᩸:Ll/ܽۢܳ;

    .line 51
    iput-object p2, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    .line 52
    new-instance v2, Ll/ۙۡۡ;

    invoke-direct {v2, p0, p2}, Ll/ۙۡۡ;-><init>(Ll/۫ۢܳ;Ll/ۢۢۡ;)V

    iput-object v2, p0, Ll/۫ۢܳ;->ܶ:Ll/ۙۡۡ;

    .line 53
    invoke-virtual {v0, p2}, Ll/ۙ᩵ۘ;->֫(Landroid/widget/AbsListView;)V

    .line 54
    invoke-virtual {p2, v0}, Ll/ۢۢۡ;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 55
    new-instance v0, Ll/᩺᩻ܳ;

    new-instance v2, Ll/ۚۢܳ;

    invoke-direct {v2, p0}, Ll/ۚۢܳ;-><init>(Ll/۫ۢܳ;)V

    new-instance v3, Ll/֨ۢܳ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0}, Ll/֨ۢܳ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v2, v3}, Ll/᩺᩻ܳ;-><init>(Ll/ۚۢܳ;Ll/֨ۢܳ;)V

    iput-object v0, p0, Ll/۫ۢܳ;->ᩴ:Ll/᩺᩻ܳ;

    .line 56
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 57
    new-instance v0, Ll/᩸ۢܳ;

    invoke-direct {v0, p0}, Ll/᩸ۢܳ;-><init>(Ll/۫ۢܳ;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 61
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    new-instance v0, Ll/۠ۢܳ;

    invoke-direct {v0, p0, p2}, Ll/۠ۢܳ;-><init>(Ll/۫ۢܳ;Ll/ۢۢۡ;)V

    invoke-virtual {p1, v0}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    return-void
.end method

.method public static ֫(Ll/۫ۢܳ;ILandroid/view/View;Landroid/view/ViewGroup;)Ll/ܿۜܳ;
    .locals 11

    .line 307
    iget-object v0, p0, Ll/۫ۢܳ;->᩸:Ll/ܽۢܳ;

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 309
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۢܳ;

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 312
    :goto_0
    instance-of v3, p2, Ll/ܿۜܳ;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    move-object p3, p2

    check-cast p3, Ll/ܿۜܳ;

    .line 313
    invoke-virtual {p3}, Ll/ܿۜܳ;->֫()V

    goto :goto_1

    .line 316
    :cond_1
    new-instance p2, Ll/ܿۜܳ;

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Ll/ܿۜܳ;-><init>(Landroid/content/Context;)V

    .line 318
    new-instance v2, Ll/۬ۢܳ;

    invoke-direct {v2, v4}, Ll/۬ۢܳ;-><init>(I)V

    .line 319
    invoke-virtual {p2}, Ll/ܿۜܳ;->ۧ()Landroid/view/View;

    move-result-object p3

    iput-object p3, v2, Ll/۬ۢܳ;->֫:Landroid/view/View;

    .line 320
    invoke-virtual {p2}, Ll/ܿۜܳ;->᩻()Ll/ܳܺ;

    move-result-object p3

    iput-object p3, v2, Ll/۬ۢܳ;->᩷:Ll/ܳܺ;

    .line 321
    invoke-virtual {p2}, Ll/ܿۜܳ;->ۜ()Ll/ܳܺ;

    move-result-object p3

    iput-object p3, v2, Ll/۬ۢܳ;->ۢ:Ll/ܳܺ;

    .line 322
    invoke-virtual {p2}, Ll/ܿۜܳ;->ܳ()Ll/ܳܺ;

    move-result-object p3

    iput-object p3, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    .line 323
    invoke-virtual {p2}, Ll/ܿۜܳ;->ܽ()Ll/ܳܺ;

    move-result-object p3

    iput-object p3, v2, Ll/۬ۢܳ;->ۧ:Ll/ܳܺ;

    .line 324
    invoke-virtual {p2}, Ll/ܿۜܳ;->ܿ()Ll/ᩳۡ;

    move-result-object p3

    iput-object p3, v2, Ll/۬ۢܳ;->ܿ:Ll/ᩳۡ;

    .line 325
    invoke-virtual {p2}, Ll/ܿۜܳ;->ᩳ()Landroid/widget/TextView;

    move-result-object p3

    iput-object p3, v2, Ll/۬ۢܳ;->ᩳ:Landroid/widget/TextView;

    .line 326
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object p3, p2

    .line 329
    :goto_1
    iget-object v3, p0, Ll/۫ۢܳ;->ᩳ:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 331
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, p0, Ll/۫ۢܳ;->ܿ:J

    sub-long/2addr v5, v7

    const-wide/16 v7, 0x320

    cmp-long v9, v5, v7

    if-lez v9, :cond_2

    move-object v3, v1

    .line 339
    :cond_2
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->֫(I)Ll/ᩳۜܳ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 343
    iput-object p1, v2, Ll/۬ۢܳ;->ܽ:Ll/ᩳۜܳ;

    .line 345
    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-interface {p1}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v5

    if-nez v5, :cond_3

    const v5, 0x3ecccccd    # 0.4f

    .line 346
    invoke-virtual {p2, v5}, Landroid/view/View;->setAlpha(F)V

    goto :goto_2

    :cond_3
    const/high16 v5, 0x3f800000    # 1.0f

    .line 348
    invoke-virtual {p2, v5}, Landroid/view/View;->setAlpha(F)V

    .line 351
    :goto_2
    iget-object v0, v0, Ll/ܽۢܳ;->ۢ֫:Ll/ܺۢܳ;

    invoke-virtual {v0}, Ll/ܺۢܳ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 352
    invoke-interface {p1}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_4

    sget v0, Ll/᩹֡᩷;->ܺ:I

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_4

    .line 354
    :cond_5
    invoke-virtual {p2, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 356
    :goto_4
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ()Z

    move-result v0

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eqz v0, :cond_6

    .line 357
    invoke-virtual {p3, v5}, Ll/ܿۜܳ;->֫(Z)V

    .line 358
    iget-object p0, v2, Ll/۬ۢܳ;->ᩳ:Landroid/widget/TextView;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_c

    .line 360
    :cond_6
    invoke-virtual {p3, v4}, Ll/ܿۜܳ;->֫(Z)V

    .line 361
    invoke-interface {p1}, Ll/ᩳۜܳ;->᩸ۧ()Z

    move-result p3

    if-eqz p3, :cond_7

    .line 362
    iget-object p3, v2, Ll/۬ۢܳ;->᩷:Ll/ܳܺ;

    sget v0, Ll/᩹֡᩷;->ܿ֫:I

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_5

    .line 364
    :cond_7
    iget-object p3, v2, Ll/۬ۢܳ;->᩷:Ll/ܳܺ;

    sget-object v0, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 366
    :goto_5
    iget-object p3, v2, Ll/۬ۢܳ;->᩷:Ll/ܳܺ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->᩺()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v3, :cond_8

    .line 367
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v3, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    .line 368
    new-instance p3, Landroid/graphics/drawable/ColorDrawable;

    sget v0, Ll/᩹֡᩷;->ܳ֫:I

    const v3, 0x20ffffff

    const v7, 0x24ffffff

    invoke-static {v3, v7}, Ll/᩹֡᩷;->֫(II)I

    move-result v3

    and-int/2addr v0, v3

    invoke-direct {p3, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 369
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 370
    new-instance v3, Landroid/graphics/drawable/TransitionDrawable;

    new-array v7, v6, [Landroid/graphics/drawable/Drawable;

    aput-object p3, v7, v4

    aput-object v0, v7, v5

    invoke-direct {v3, v7}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 371
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    .line 372
    iget-object p3, v2, Ll/۬ۢܳ;->֫:Landroid/view/View;

    invoke-virtual {p3, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 p3, 0x384

    .line 373
    invoke-virtual {v3, p3}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 374
    iput-object v1, p0, Ll/۫ۢܳ;->ᩳ:Ljava/lang/String;

    goto :goto_6

    .line 375
    :cond_8
    iget-object p0, v2, Ll/۬ۢܳ;->֫:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_9

    .line 376
    iget-object p0, v2, Ll/۬ۢܳ;->֫:Landroid/view/View;

    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 379
    :cond_9
    :goto_6
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۗ֫()Ljava/lang/CharSequence;

    move-result-object p0

    if-eqz p0, :cond_a

    .line 381
    iget-object p3, v2, Ll/۬ۢܳ;->ۢ:Ll/ܳܺ;

    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_7

    .line 382
    :cond_a
    invoke-interface {p1}, Ll/ᩳۜܳ;->᩸֫()Z

    move-result p0

    if-eqz p0, :cond_c

    .line 383
    invoke-interface {p1}, Ll/ᩳۜܳ;->ܳۧ()J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long p0, v7, v9

    if-nez p0, :cond_b

    .line 385
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v7

    .line 387
    :cond_b
    iget-object p0, v2, Ll/۬ۢܳ;->ۢ:Ll/ܳܺ;

    invoke-static {v7, v8}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_7

    .line 389
    :cond_c
    iget-object p0, v2, Ll/۬ۢܳ;->ۢ:Ll/ܳܺ;

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 391
    :goto_7
    invoke-interface {p1}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result p0

    const/4 p3, 0x4

    if-eqz p0, :cond_d

    .line 392
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    invoke-virtual {p0, p3}, Landroid/view/View;->setVisibility(I)V

    .line 393
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 394
    iget-object p0, v2, Ll/۬ۢܳ;->ۧ:Ll/ܳܺ;

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 395
    iget-object p0, v2, Ll/۬ۢܳ;->ۧ:Ll/ܳܺ;

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-eqz p0, :cond_14

    .line 396
    iget-object p0, v2, Ll/۬ۢܳ;->ۧ:Ll/ܳܺ;

    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_b

    .line 398
    :cond_d
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۡۧ()Z

    move-result p0

    if-eqz p0, :cond_e

    .line 399
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    invoke-virtual {p0, p3}, Landroid/view/View;->setVisibility(I)V

    .line 400
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    iget-object p0, v2, Ll/۬ۢܳ;->ۧ:Ll/ܳܺ;

    const/16 p3, 0x8

    invoke-virtual {p0, p3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_b

    .line 403
    :cond_e
    invoke-interface {p1}, Ll/ᩳۜܳ;->۬()Z

    move-result p0

    if-eqz p0, :cond_f

    .line 404
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 405
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    const-string p3, "->"

    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_8

    .line 406
    :cond_f
    invoke-interface {p1}, Ll/ᩳۜܳ;->ᩴ()Z

    move-result p0

    if-eqz p0, :cond_10

    .line 407
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 408
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    const-string p3, "* "

    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_8

    .line 410
    :cond_10
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    invoke-virtual {p0, p3}, Landroid/view/View;->setVisibility(I)V

    .line 411
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    const-string p3, " "

    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 413
    :goto_8
    invoke-interface {p1}, Ll/ᩳۜܳ;->᩸()Ljava/lang/CharSequence;

    move-result-object p0

    if-nez p0, :cond_13

    .line 415
    sget p0, Ll/᩶ۖ᩷;->᩻:I

    and-int/lit8 p3, p0, 0x1

    if-eqz p3, :cond_11

    const/4 p3, 0x1

    goto :goto_9

    :cond_11
    const/4 p3, 0x0

    :goto_9
    and-int/2addr p0, v6

    if-eqz p0, :cond_12

    const/4 p0, 0x1

    goto :goto_a

    :cond_12
    const/4 p0, 0x0

    .line 418
    :goto_a
    invoke-interface {p1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1, p3, p0}, Ll/ܿۤۡ;->֫(JZZ)Ljava/lang/String;

    move-result-object p0

    .line 420
    :cond_13
    iget-object p3, v2, Ll/۬ۢܳ;->ۧ:Ll/ܳܺ;

    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 421
    iget-object p0, v2, Ll/۬ۢܳ;->ۧ:Ll/ܳܺ;

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-eqz p0, :cond_14

    .line 422
    iget-object p0, v2, Ll/۬ۢܳ;->ۧ:Ll/ܳܺ;

    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 425
    :cond_14
    :goto_b
    invoke-interface {p1}, Ll/ᩳۜܳ;->getIcon()Ll/ۨܺ᩷;

    move-result-object p0

    if-eqz p0, :cond_15

    .line 427
    iget-object p1, v2, Ll/۬ۢܳ;->ܿ:Ll/ᩳۡ;

    invoke-virtual {p0}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 431
    :cond_15
    :goto_c
    iget p0, v2, Ll/۬ۢܳ;->ۜ:I

    sget p1, Ll/᩶ۖ᩷;->᩷:I

    if-eq p0, p1, :cond_17

    .line 432
    iput p1, v2, Ll/۬ۢܳ;->ۜ:I

    .line 433
    iget-object p0, v2, Ll/۬ۢܳ;->᩷:Ll/ܳܺ;

    if-ne p1, v5, :cond_16

    const/4 v4, 0x1

    :cond_16
    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 434
    iget-object p0, v2, Ll/۬ۢܳ;->᩷:Ll/ܳܺ;

    iget p1, v2, Ll/۬ۢܳ;->ۜ:I

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 436
    :cond_17
    iget p0, v2, Ll/۬ۢܳ;->᩻:I

    sget p1, Ll/᩶ۖ᩷;->ۜ:I

    if-eq p0, p1, :cond_1a

    .line 437
    iput p1, v2, Ll/۬ۢܳ;->᩻:I

    const/high16 p0, 0x41700000    # 15.0f

    if-ne p1, v5, :cond_18

    .line 439
    iget-object p1, v2, Ll/۬ۢܳ;->ᩳ:Landroid/widget/TextView;

    invoke-virtual {p1, v6, p0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 440
    iget-object p0, v2, Ll/۬ۢܳ;->᩷:Ll/ܳܺ;

    const/high16 p1, 0x41500000    # 13.0f

    invoke-virtual {p0, v6, p1}, Ll/ܳܺ;->setTextSize(IF)V

    .line 441
    iget-object p0, v2, Ll/۬ۢܳ;->ۢ:Ll/ܳܺ;

    const/high16 p1, 0x41200000    # 10.0f

    invoke-virtual {p0, v6, p1}, Ll/ܳܺ;->setTextSize(IF)V

    .line 442
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    invoke-virtual {p0, v6, p1}, Ll/ܳܺ;->setTextSize(IF)V

    .line 443
    iget-object p0, v2, Ll/۬ۢܳ;->ۧ:Ll/ܳܺ;

    invoke-virtual {p0, v6, p1}, Ll/ܳܺ;->setTextSize(IF)V

    goto :goto_d

    :cond_18
    const/high16 p3, 0x41880000    # 17.0f

    if-ne p1, v6, :cond_19

    .line 445
    iget-object p1, v2, Ll/۬ۢܳ;->ᩳ:Landroid/widget/TextView;

    invoke-virtual {p1, v6, p3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 446
    iget-object p1, v2, Ll/۬ۢܳ;->᩷:Ll/ܳܺ;

    invoke-virtual {p1, v6, p0}, Ll/ܳܺ;->setTextSize(IF)V

    .line 447
    iget-object p0, v2, Ll/۬ۢܳ;->ۢ:Ll/ܳܺ;

    const/high16 p1, 0x41300000    # 11.0f

    invoke-virtual {p0, v6, p1}, Ll/ܳܺ;->setTextSize(IF)V

    .line 448
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    invoke-virtual {p0, v6, p1}, Ll/ܳܺ;->setTextSize(IF)V

    .line 449
    iget-object p0, v2, Ll/۬ۢܳ;->ۧ:Ll/ܳܺ;

    invoke-virtual {p0, v6, p1}, Ll/ܳܺ;->setTextSize(IF)V

    goto :goto_d

    :cond_19
    const/4 p0, 0x3

    if-ne p1, p0, :cond_1a

    .line 451
    iget-object p0, v2, Ll/۬ۢܳ;->ᩳ:Landroid/widget/TextView;

    const/high16 p1, 0x41980000    # 19.0f

    invoke-virtual {p0, v6, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 452
    iget-object p0, v2, Ll/۬ۢܳ;->᩷:Ll/ܳܺ;

    invoke-virtual {p0, v6, p3}, Ll/ܳܺ;->setTextSize(IF)V

    .line 453
    iget-object p0, v2, Ll/۬ۢܳ;->ۢ:Ll/ܳܺ;

    const/high16 p1, 0x41400000    # 12.0f

    invoke-virtual {p0, v6, p1}, Ll/ܳܺ;->setTextSize(IF)V

    .line 454
    iget-object p0, v2, Ll/۬ۢܳ;->ܳ:Ll/ܳܺ;

    invoke-virtual {p0, v6, p1}, Ll/ܳܺ;->setTextSize(IF)V

    .line 455
    iget-object p0, v2, Ll/۬ۢܳ;->ۧ:Ll/ܳܺ;

    invoke-virtual {p0, v6, p1}, Ll/ܳܺ;->setTextSize(IF)V

    .line 0
    :catch_0
    :cond_1a
    :goto_d
    check-cast p2, Ll/ܿۜܳ;

    return-object p2
.end method

.method private ֫(J)V
    .locals 5

    .line 552
    iget-object v0, p0, Ll/۫ۢܳ;->᩸:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 553
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    add-long/2addr v0, p1

    .line 554
    iget-wide v2, p0, Ll/۫ۢܳ;->ۢ:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    :goto_0
    return-void

    .line 555
    :cond_1
    iget-object v2, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    iget-object v3, p0, Ll/۫ۢܳ;->᩷:Ll/᩵ۢܳ;

    invoke-virtual {v2, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 556
    iput-wide v0, p0, Ll/۫ۢܳ;->ۢ:J

    .line 557
    invoke-virtual {v2, v3, p1, p2}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    return-void
.end method

.method private ֫(Ljava/lang/String;Z)V
    .locals 7

    .line 81
    iget-object v0, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 83
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 84
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    .line 85
    instance-of v5, v4, Ll/۬ۢܳ;

    if-eqz v5, :cond_2

    .line 86
    check-cast v4, Ll/۬ۢܳ;

    .line 87
    iget-object v5, v4, Ll/۬ۢܳ;->ܽ:Ll/ᩳۜܳ;

    if-eqz v5, :cond_2

    .line 89
    invoke-interface {v5}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v6

    if-ne v6, p2, :cond_2

    invoke-interface {v5}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz p2, :cond_0

    const p1, 0x20ffffff

    const v0, 0x24ffffff

    .line 90
    invoke-static {p1, v0}, Ll/᩹֡᩷;->֫(II)I

    move-result p1

    goto :goto_1

    :cond_0
    const p1, 0x34ffffff

    const v0, 0x30ffffff

    .line 91
    invoke-static {p1, v0}, Ll/᩹֡᩷;->֫(II)I

    move-result p1

    .line 92
    :goto_1
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    sget v1, Ll/᩹֡᩷;->ܳ֫:I

    and-int/2addr p1, v1

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 93
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 94
    new-instance v1, Landroid/graphics/drawable/TransitionDrawable;

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    aput-object v0, v3, v2

    const/4 v0, 0x1

    aput-object p1, v3, v0

    invoke-direct {v1, v3}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 95
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    .line 96
    iget-object p1, v4, Ll/۬ۢܳ;->֫:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-eqz p2, :cond_1

    const/16 p1, 0x384

    .line 97
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    return-void

    .line 98
    :cond_1
    new-instance p1, Ll/ۘۢܳ;

    invoke-direct {p1, v2, v1}, Ll/ۘۢܳ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v0, 0xfa

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static ֫(Ll/۫ۢܳ;)V
    .locals 20

    move-object/from16 v0, p0

    .line 577
    iget-object v1, v0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    iget-object v2, v0, Ll/۫ۢܳ;->᩸:Ll/ܽۢܳ;

    invoke-virtual {v2}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v3

    invoke-virtual {v3}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v3

    sget-object v4, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {v3, v4}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 578
    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_5

    .line 582
    :cond_0
    invoke-virtual {v2}, Ll/ܽۢܳ;->ܰ()Z

    move-result v3

    const-wide/16 v4, 0x50

    if-eqz v3, :cond_1

    .line 583
    invoke-direct/range {p0 .. p0}, Ll/۫ۢܳ;->᩻()V

    .line 584
    invoke-direct {v0, v4, v5}, Ll/۫ۢܳ;->֫(J)V

    return-void

    :cond_1
    const/4 v3, 0x0

    .line 587
    iput-boolean v3, v0, Ll/۫ۢܳ;->ۚ:Z

    .line 588
    invoke-virtual {v2}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v9

    .line 589
    iget-object v6, v0, Ll/۫ۢܳ;->֡:Ll/ܽ᩷ܳ;

    if-ne v9, v6, :cond_2

    invoke-virtual {v9}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Ll/۫ۢܳ;->ۖ:Ljava/lang/String;

    invoke-static {v6, v7}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 590
    :cond_2
    invoke-direct/range {p0 .. p0}, Ll/۫ۢܳ;->ܳ()V

    .line 591
    iput-object v9, v0, Ll/۫ۢܳ;->֡:Ll/ܽ᩷ܳ;

    .line 592
    invoke-virtual {v9}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Ll/۫ۢܳ;->ۖ:Ljava/lang/String;

    .line 594
    :cond_3
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v6

    .line 595
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    add-int v7, v6, v8

    add-int/lit8 v7, v7, -0x1

    if-lez v8, :cond_6

    .line 599
    iget v10, v0, Ll/۫ۢܳ;->ۧ:I

    if-ltz v10, :cond_6

    if-lt v6, v10, :cond_4

    sub-int v11, v6, v10

    .line 600
    iget-object v12, v0, Ll/۫ۢܳ;->ܽ:[I

    array-length v13, v12

    if-ge v11, v13, :cond_4

    .line 601
    aget v10, v12, v11

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    move-result v11

    goto :goto_0

    :cond_4
    if-lt v10, v6, :cond_5

    sub-int v11, v10, v6

    if-ge v11, v8, :cond_5

    .line 603
    iget-object v10, v0, Ll/۫ۢܳ;->ܽ:[I

    aget v10, v10, v3

    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    move-result v11

    :goto_0
    sub-int/2addr v10, v11

    goto :goto_1

    .line 605
    :cond_5
    invoke-static {v6, v10}, Ljava/lang/Integer;->compare(II)I

    move-result v10

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v11

    mul-int v10, v10, v11

    :goto_1
    move v14, v10

    goto :goto_2

    :cond_6
    const/4 v10, 0x0

    const/4 v14, 0x0

    .line 608
    :goto_2
    iget-object v10, v0, Ll/۫ۢܳ;->ܽ:[I

    array-length v10, v10

    if-eq v10, v8, :cond_7

    new-array v10, v8, [I

    iput-object v10, v0, Ll/۫ۢܳ;->ܽ:[I

    :cond_7
    :goto_3
    if-ge v3, v8, :cond_8

    .line 609
    iget-object v10, v0, Ll/۫ۢܳ;->ܽ:[I

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    move-result v11

    aput v11, v10, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_8
    if-nez v8, :cond_9

    const/4 v3, -0x1

    goto :goto_4

    :cond_9
    move v3, v6

    .line 610
    :goto_4
    iput v3, v0, Ll/۫ۢܳ;->ۧ:I

    .line 611
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v18

    .line 612
    iget-object v11, v0, Ll/۫ۢܳ;->᩵:Ll/ܰ᩻ܳ;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v15

    .line 613
    invoke-virtual {v1}, Ll/ۢۢۡ;->ܽ()Z

    move-result v16

    invoke-virtual {v1}, Ll/ۢۢۡ;->ۧ()Z

    move-result v17

    move-wide/from16 v12, v18

    .line 612
    invoke-virtual/range {v11 .. v17}, Ll/ܰ᩻ܳ;->֫(JIIZZ)I

    move-result v11

    .line 614
    iget-object v3, v0, Ll/۫ۢܳ;->᩵:Ll/ܰ᩻ܳ;

    invoke-virtual {v3}, Ll/ܰ᩻ܳ;->֫()I

    move-result v3

    .line 615
    iget v10, v0, Ll/۫ۢܳ;->ۜ:I

    if-ne v6, v10, :cond_a

    iget v10, v0, Ll/۫ۢܳ;->ۡ:I

    if-ne v7, v10, :cond_a

    iget v10, v0, Ll/۫ۢܳ;->ܺ:I

    if-ne v11, v10, :cond_a

    iget v10, v0, Ll/۫ۢܳ;->᩻:I

    if-eq v3, v10, :cond_b

    .line 616
    :cond_a
    invoke-virtual {v2}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v6, v7, v11, v3}, Ll/ܰ᩻ܳ;->֫(Ljava/util/List;IIII)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v0, Ll/۫ۢܳ;->ܳ:Ljava/util/List;

    .line 617
    iput v6, v0, Ll/۫ۢܳ;->ۜ:I

    .line 618
    iput v7, v0, Ll/۫ۢܳ;->ۡ:I

    .line 619
    iput v11, v0, Ll/۫ۢܳ;->ܺ:I

    .line 620
    iput v3, v0, Ll/۫ۢܳ;->᩻:I

    .line 622
    :cond_b
    iget-object v6, v0, Ll/۫ۢܳ;->ᩴ:Ll/᩺᩻ܳ;

    iget-object v7, v0, Ll/۫ۢܳ;->ܳ:Ljava/util/List;

    invoke-virtual {v9}, Ll/ܽ᩷ܳ;->᩻()Ll/ۧۜܳ;

    move-result-object v10

    move-wide/from16 v12, v18

    invoke-virtual/range {v6 .. v13}, Ll/᩺᩻ܳ;->֫(Ljava/util/List;ILl/ܽ᩷ܳ;Ll/ۧۜܳ;IJ)V

    .line 624
    invoke-virtual {v1}, Ll/ۢۢۡ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-direct {v0, v4, v5}, Ll/۫ۢܳ;->֫(J)V

    :cond_c
    return-void

    .line 579
    :cond_d
    :goto_5
    invoke-direct/range {p0 .. p0}, Ll/۫ۢܳ;->᩻()V

    return-void
.end method

.method public static synthetic ֫(Ll/۫ۢܳ;I)V
    .locals 2

    .line 226
    iget-object p0, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v0

    .line 227
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    move-result v1

    if-lt p1, v0, :cond_1

    if-ge v1, p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 229
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ll/ۢۢۡ;->setSelection(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/۫ۢܳ;J)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/۫ۢܳ;->֫(J)V

    return-void
.end method

.method public static synthetic ֫(Ll/۫ۢܳ;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 239
    invoke-direct {p0, p1, v0}, Ll/۫ۢܳ;->֫(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/۫ۢܳ;Ll/ۢۢۡ;Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 1

    .line 62
    sget-object v0, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    if-ne p3, v0, :cond_0

    .line 63
    invoke-direct {p0}, Ll/۫ۢܳ;->᩻()V

    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object p0, p0, Ll/۫ۢܳ;->ۘ:Ll/֡ۢܳ;

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void

    .line 65
    :cond_0
    invoke-interface {p2}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object p1

    sget-object p2, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {p1, p2}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/16 p1, 0x0

    .line 66
    invoke-direct {p0, p1, p2}, Ll/۫ۢܳ;->֫(J)V

    return-void

    .line 67
    :cond_1
    invoke-direct {p0}, Ll/۫ۢܳ;->᩻()V

    return-void
.end method

.method public static ֫(Ll/۫ۢܳ;Ll/ᩳۜܳ;)V
    .locals 6

    .line 628
    iget-object p0, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 630
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 631
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    .line 632
    instance-of v4, v3, Ll/۬ۢܳ;

    if-eqz v4, :cond_2

    .line 633
    check-cast v3, Ll/۬ۢܳ;

    .line 634
    invoke-interface {p1}, Ll/ᩳۜܳ;->getIcon()Ll/ۨܺ᩷;

    move-result-object v4

    .line 635
    iget-object v5, v3, Ll/۬ۢܳ;->ܽ:Ll/ᩳۜܳ;

    if-ne v5, p1, :cond_2

    if-eqz v4, :cond_2

    .line 636
    iget-object p1, v3, Ll/۬ۢܳ;->ܿ:Ll/ᩳۡ;

    .line 637
    invoke-virtual {p0}, Ll/ۢۢۡ;->ܽ()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 638
    invoke-virtual {v4}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 641
    :cond_0
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-nez p0, :cond_1

    .line 643
    new-instance p0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 644
    :cond_1
    new-instance v0, Landroid/graphics/drawable/TransitionDrawable;

    .line 646
    invoke-virtual {v4}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    aput-object p0, v3, v1

    const/4 p0, 0x1

    aput-object v2, v3, p0

    invoke-direct {v0, v3}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 648
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    .line 649
    invoke-virtual {p1, v0}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 p0, 0x12c

    .line 650
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    return-void

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static bridge synthetic ۜ(Ll/۫ۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۫ۢܳ;->᩻()V

    return-void
.end method

.method public static ۧ(Ll/۫ۢܳ;)V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    .line 547
    iput-wide v0, p0, Ll/۫ۢܳ;->ۢ:J

    .line 548
    iget-object p0, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private ܳ()V
    .locals 1

    .line 561
    iget-object v0, p0, Ll/۫ۢܳ;->ᩴ:Ll/᩺᩻ܳ;

    invoke-virtual {v0}, Ll/᩺᩻ܳ;->֫()V

    .line 562
    iget-object v0, p0, Ll/۫ۢܳ;->᩵:Ll/ܰ᩻ܳ;

    invoke-virtual {v0}, Ll/ܰ᩻ܳ;->ۧ()V

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 563
    iput-object v0, p0, Ll/۫ۢܳ;->ܳ:Ljava/util/List;

    const/4 v0, -0x1

    .line 564
    iput v0, p0, Ll/۫ۢܳ;->ۧ:I

    iput v0, p0, Ll/۫ۢܳ;->ܺ:I

    iput v0, p0, Ll/۫ۢܳ;->ۡ:I

    iput v0, p0, Ll/۫ۢܳ;->ۜ:I

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 565
    iput-object v0, p0, Ll/۫ۢܳ;->ܽ:[I

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/۫ۢܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/۫ۢܳ;->۠:Ll/ۙۢܳ;

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    return-object p0
.end method

.method public static ܽ(I)V
    .locals 2

    .line 466
    sput p0, Ll/۫ۢܳ;->᩹:I

    .line 467
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sput-wide v0, Ll/۫ۢܳ;->᩶:J

    return-void
.end method

.method public static bridge synthetic ܿ(Ll/۫ۢܳ;)Ll/ܽۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۢܳ;->᩸:Ll/ܽۢܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/۫ۢܳ;)Ll/ۙۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۢܳ;->۠:Ll/ۙۢܳ;

    return-object p0
.end method

.method private ᩻()V
    .locals 2

    .line 569
    iget-boolean v0, p0, Ll/۫ۢܳ;->ۚ:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Ll/۫ۢܳ;->ܳ()V

    :cond_0
    const/4 v0, 0x1

    .line 570
    iput-boolean v0, p0, Ll/۫ۢܳ;->ۚ:Z

    .line 571
    iget-object v0, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    iget-object v1, p0, Ll/۫ۢܳ;->᩷:Ll/᩵ۢܳ;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const-wide v0, 0x7fffffffffffffffL

    .line 572
    iput-wide v0, p0, Ll/۫ۢܳ;->ۢ:J

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/۫ۢܳ;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 0
    invoke-direct {p0, v0, v1}, Ll/۫ۢܳ;->֫(J)V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 212
    iget-object v0, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v0

    return v0
.end method

.method public final ֫(IILjava/lang/String;Ll/᩻᩷ܳ;)V
    .locals 2

    const/4 v0, 0x0

    .line 236
    invoke-virtual {p0, v0}, Ll/۫ۢܳ;->֫(Ljava/lang/String;)V

    .line 238
    iget-object v0, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    invoke-virtual {v0, p1}, Ll/ۢۢۡ;->setSelection(I)V

    .line 239
    new-instance p1, Ll/ܶۢܳ;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p0, p3}, Ll/ܶۢܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 271
    new-instance p3, Ll/᩹ۢܳ;

    invoke-direct {p3, p0, p4, p2, p1}, Ll/᩹ۢܳ;-><init>(Ll/۫ۢܳ;Ljava/util/function/BooleanSupplier;ILjava/lang/Runnable;)V

    .line 272
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 273
    invoke-virtual {v0, p3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 274
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(ILandroid/view/View;)V
    .locals 1

    .line 661
    sget v0, Ll/᩹֡᩷;->ܺ:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 662
    iget-object p2, p0, Ll/۫ۢܳ;->᩸:Ll/ܽۢܳ;

    iget-object p2, p2, Ll/ܽۢܳ;->ۢ֫:Ll/ܺۢܳ;

    .line 663
    invoke-virtual {p2}, Ll/ܺۢܳ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 664
    invoke-virtual {p2, p1}, Ll/ܺۢܳ;->ܽ(I)V

    return-void

    .line 665
    :cond_0
    invoke-virtual {p2, p1}, Ll/ܺۢܳ;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 666
    invoke-virtual {p0}, Ll/۫ۢܳ;->ܿ()V

    :cond_1
    return-void
.end method

.method public final ֫(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 7

    .line 107
    iget-object v0, p0, Ll/۫ۢܳ;->۠:Ll/ۙۢܳ;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ll/ۙۢܳ;->֫(Ll/ۙۢܳ;)V

    .line 108
    :cond_0
    new-instance v0, Ll/ۙۢܳ;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Ll/ۙۢܳ;-><init>(Ll/۫ۢܳ;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Ll/۫ۢܳ;->۠:Ll/ۙۢܳ;

    .line 109
    iget-object p1, p0, Ll/۫ۢܳ;->᩸:Ll/ܽۢܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    iget-object p2, p0, Ll/۫ۢܳ;->۠:Ll/ۙۢܳ;

    invoke-virtual {p1, p2}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 110
    iget-object p1, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p2

    iget-object p3, p0, Ll/۫ۢܳ;->۠:Ll/ۙۢܳ;

    invoke-virtual {p2, p3}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 111
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(ILl/֨᩷ܳ;)V
    .locals 2

    .line 271
    new-instance v0, Ll/᩹ۢܳ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, p1, v1}, Ll/᩹ۢܳ;-><init>(Ll/۫ۢܳ;Ljava/util/function/BooleanSupplier;ILjava/lang/Runnable;)V

    .line 272
    iget-object p1, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 273
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 274
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 72
    iput-object p1, p0, Ll/۫ۢܳ;->ᩳ:Ljava/lang/String;

    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۫ۢܳ;->ܿ:J

    return-void
.end method

.method public final ֫(I)Z
    .locals 2

    .line 677
    iget-object v0, p0, Ll/۫ۢܳ;->᩸:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 679
    :cond_0
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ltz p1, :cond_3

    .line 682
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lt p1, v1, :cond_2

    goto :goto_0

    .line 684
    :cond_2
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۜܳ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()V
    .locals 6

    .line 471
    invoke-direct {p0}, Ll/۫ۢܳ;->ܳ()V

    .line 473
    iget-object v0, p0, Ll/۫ۢܳ;->᩸:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->᩻()Ll/ۧۜܳ;

    move-result-object v1

    .line 474
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۢ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 475
    invoke-interface {v2}, Ll/ᩳۜܳ;->getIcon()Ll/ۨܺ᩷;

    move-result-object v3

    if-nez v3, :cond_0

    .line 476
    invoke-interface {v1, v2}, Ll/ۧۜܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->֫(Ll/᩶ۖܳ;)V

    .line 477
    invoke-interface {v1, v2}, Ll/ۧۜܳ;->ۧ(Ll/ᩳۜܳ;)I

    move-result v3

    if-eqz v3, :cond_0

    .line 479
    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->ۧ(I)V

    goto :goto_0

    .line 483
    :cond_1
    sget-wide v0, Ll/۫ۢܳ;->᩶:J

    sget v2, Ll/۫ۢܳ;->᩹:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Ll/۫ۢܳ;->֫:Ll/۫᩵ۘ;

    cmp-long v5, v0, v2

    if-lez v5, :cond_2

    const/4 v0, 0x0

    .line 484
    invoke-virtual {v4, v0}, Ll/ۗ᩵ۘ;->֫(Z)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    .line 486
    invoke-virtual {v4, v0}, Ll/ۗ᩵ۘ;->֫(Z)V

    .line 487
    invoke-virtual {v4}, Ll/ۗ᩵ۘ;->ᩳ()V

    .line 489
    :goto_1
    invoke-virtual {v4}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    const-wide/16 v0, 0x0

    .line 490
    invoke-direct {p0, v0, v1}, Ll/۫ۢܳ;->֫(J)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 3

    .line 224
    iget-object v0, p0, Ll/۫ۢܳ;->֨:Ll/ۢۢۡ;

    invoke-virtual {v0, p1}, Ll/ۢۢۡ;->setSelection(I)V

    .line 225
    new-instance v0, Ll/ᩴۢܳ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p0}, Ll/ᩴۢܳ;-><init>(IILjava/lang/Object;)V

    const-wide/16 v1, 0x64

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 77
    invoke-direct {p0, p1, v0}, Ll/۫ۢܳ;->֫(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 672
    iget-object v0, p0, Ll/۫ۢܳ;->᩸:Ll/ܽۢܳ;

    iget-object v0, v0, Ll/ܽۢܳ;->ۢ֫:Ll/ܺۢܳ;

    invoke-virtual {v0}, Ll/ܺۢܳ;->ܳ()Z

    move-result v0

    invoke-static {v0}, Ll/᩶ۡ᩷;->֫(Z)V

    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 510
    invoke-direct {p0}, Ll/۫ۢܳ;->ܳ()V

    const/4 v0, 0x0

    .line 511
    iget-object v1, p0, Ll/۫ۢܳ;->֫:Ll/۫᩵ۘ;

    invoke-virtual {v1, v0}, Ll/ۗ᩵ۘ;->֫(Z)V

    .line 512
    invoke-virtual {v1}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ᩳ()V
    .locals 4

    .line 494
    invoke-direct {p0}, Ll/۫ۢܳ;->ܳ()V

    .line 496
    iget-object v0, p0, Ll/۫ۢܳ;->᩸:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->᩻()Ll/ۧۜܳ;

    move-result-object v1

    .line 497
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۢ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 498
    invoke-interface {v1, v2}, Ll/ۧۜܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->֫(Ll/᩶ۖܳ;)V

    .line 499
    invoke-interface {v1, v2}, Ll/ۧۜܳ;->ۧ(Ll/ᩳۜܳ;)I

    move-result v3

    if-eqz v3, :cond_0

    .line 501
    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->ۧ(I)V

    goto :goto_0

    .line 504
    :cond_1
    iget-object v0, p0, Ll/۫ۢܳ;->֫:Ll/۫᩵ۘ;

    invoke-virtual {v0}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    const-wide/16 v0, 0x0

    .line 505
    invoke-direct {p0, v0, v1}, Ll/۫ۢܳ;->֫(J)V

    return-void
.end method
