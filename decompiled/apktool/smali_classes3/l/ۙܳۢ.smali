.class public final Ll/ۙܳۢ;
.super Ll/۬ۗܿ;
.source "I1KV"


# instance fields
.field public ֫֫:Landroid/widget/CheckBox;

.field public ۟:Landroid/widget/CheckBox;

.field public ۧ֫:Landroid/widget/CheckBox;

.field public final synthetic ܽ֫:Ll/۟ܳۢ;

.field public final synthetic ܿ֫:Ll/ܽ᩻ۡ;

.field public final synthetic ᩳ֫:Ll/ۗܺ᩷;


# direct methods
.method public constructor <init>(Ll/۟ܳۢ;Ll/ۗܺ᩷;Ll/ۗܺ᩷;Ll/ܽ᩻ۡ;)V
    .locals 6

    .line 407
    iput-object p1, p0, Ll/ۙܳۢ;->ܽ֫:Ll/۟ܳۢ;

    iput-object p3, p0, Ll/ۙܳۢ;->ᩳ֫:Ll/ۗܺ᩷;

    iput-object p4, p0, Ll/ۙܳۢ;->ܿ֫:Ll/ܽ᩻ۡ;

    const/4 v0, -0x1

    .line 40
    invoke-direct {p0, p2, v0}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    .line 413
    invoke-virtual {p0}, Ll/۬ۗܿ;->᩻()Landroid/widget/FrameLayout;

    move-result-object p2

    const/4 v0, 0x0

    .line 414
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 415
    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0133

    invoke-virtual {v0, v1, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v0, 0x7f0a00d9

    .line 416
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Ll/ۙܳۢ;->֫֫:Landroid/widget/CheckBox;

    .line 417
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "dex_plus_rename_not_exists"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const v1, 0x7f0a00de

    .line 418
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/ۙܳۢ;->۟:Landroid/widget/CheckBox;

    .line 419
    invoke-virtual {p4}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    const-string v4, "[a-zA-Z]{1,5}"

    invoke-virtual {v2, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    xor-int/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const v1, 0x7f0a00df

    .line 420
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/ۙܳۢ;->ۧ֫:Landroid/widget/CheckBox;

    .line 421
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "dprs"

    invoke-interface {v2, v4, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const v2, 0x7f0a0257

    .line 422
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    new-instance v4, Ll/᩸ܳۢ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p3}, Ll/᩸ܳۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f0a0259

    .line 425
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    new-instance v4, Ll/᩹ܳۢ;

    invoke-direct {v4, p3}, Ll/᩹ܳۢ;-><init>(Ll/ۗܺ᩷;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 428
    invoke-virtual {p4}, Ll/ܽ᩻ۡ;->᩻()Z

    move-result p3

    const/16 v3, 0x8

    if-eqz p3, :cond_2

    .line 429
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 430
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 432
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "$"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 433
    invoke-static {p1}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۫ۧۢ;->ܺ()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ᩳۧۢ;

    .line 434
    iget-object p3, p3, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    return-void

    .line 440
    :cond_1
    iget-object p1, p0, Ll/ۙܳۢ;->ۧ֫:Landroid/widget/CheckBox;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 443
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 13

    .line 449
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 771
    invoke-static {v0}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 774
    :cond_0
    invoke-static {v0}, Ll/ۢܺ֡;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 775
    invoke-static {v0}, Ll/ۢܺ֡;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 450
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 451
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 454
    :cond_1
    iget-object v1, p0, Ll/ۙܳۢ;->ܿ֫:Ll/ܽ᩻ۡ;

    invoke-virtual {v1}, Ll/ܽ᩻ۡ;->᩻()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, p0, Ll/ۙܳۢ;->۟:Landroid/widget/CheckBox;

    const/4 v6, 0x0

    const v7, 0x7f12016e

    iget-object v8, p0, Ll/ۙܳۢ;->ܽ֫:Ll/۟ܳۢ;

    if-eqz v2, :cond_6

    .line 455
    invoke-static {v8}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/۫ۧۢ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-array v1, v4, [Ljava/lang/Object;

    aput-object v0, v1, v3

    .line 456
    invoke-virtual {v8, v7, v1}, Ll/ۡ᩻֫;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/String;)V

    return-void

    .line 459
    :cond_2
    invoke-virtual {v1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    .line 466
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 467
    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    iget-object v3, p0, Ll/ۙܳۢ;->ۧ֫:Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_5

    .line 469
    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_4

    const-string v4, "$"

    .line 0
    invoke-static {v1, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 471
    invoke-static {v8}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v7

    invoke-virtual {v7}, Ll/۫ۧۢ;->ܺ()Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩳۧۢ;

    .line 472
    iget-object v8, v8, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v8, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 0
    invoke-static {v0, v4}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 473
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 474
    invoke-virtual {v2, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 478
    :cond_4
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v4, "dprs"

    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v3

    invoke-interface {v1, v4, v3}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v1

    invoke-interface {v1}, Ll/۬ۤۡ;->apply()V

    .line 480
    :cond_5
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    .line 505
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    .line 506
    new-instance v8, Ll/᩶ܳۢ;

    move-object v0, v8

    move-object v1, p0

    move-object v3, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Ll/᩶ܳۢ;-><init>(Ll/ۙܳۢ;Ljava/util/HashMap;Ll/ۤۤ;ZLjava/util/Collection;)V

    .line 551
    invoke-virtual {v8}, Ll/۟ܶۡ;->᩻()V

    return-void

    .line 461
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 484
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 485
    invoke-static {v8}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۧۢ;->ܺ()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩳۧۢ;

    .line 486
    iget-object v10, v10, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    .line 487
    invoke-virtual {v10, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_7

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    .line 488
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v12

    invoke-virtual {v10, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 489
    invoke-static {v8}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v12

    invoke-virtual {v12, v11}, Ll/۫ۧۢ;->ۧ(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_8

    new-array v0, v4, [Ljava/lang/Object;

    aput-object v11, v0, v3

    .line 490
    invoke-virtual {v8, v7, v0}, Ll/ۡ᩻֫;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/String;)V

    return-void

    .line 493
    :cond_8
    invoke-virtual {v9, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 496
    :cond_9
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v3, "dex_plus_rename_not_exists"

    iget-object v4, p0, Ll/ۙܳۢ;->֫֫:Landroid/widget/CheckBox;

    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v7

    invoke-interface {v1, v3, v7}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v1

    invoke-interface {v1}, Ll/۬ۤۡ;->apply()V

    .line 497
    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 498
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    .line 84
    new-instance v3, Ll/ۤۤ;

    invoke-direct {v3, v2, v0}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 498
    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    .line 505
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    .line 506
    new-instance v7, Ll/᩶ܳۢ;

    move-object v0, v7

    move-object v1, p0

    move-object v2, v9

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Ll/᩶ܳۢ;-><init>(Ll/ۙܳۢ;Ljava/util/HashMap;Ll/ۤۤ;ZLjava/util/Collection;)V

    .line 551
    invoke-virtual {v7}, Ll/۟ܶۡ;->᩻()V

    return-void

    .line 500
    :cond_a
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    .line 505
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    .line 506
    new-instance v8, Ll/᩶ܳۢ;

    move-object v0, v8

    move-object v1, p0

    move-object v2, v9

    move-object v3, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Ll/᩶ܳۢ;-><init>(Ll/ۙܳۢ;Ljava/util/HashMap;Ll/ۤۤ;ZLjava/util/Collection;)V

    .line 551
    invoke-virtual {v8}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
