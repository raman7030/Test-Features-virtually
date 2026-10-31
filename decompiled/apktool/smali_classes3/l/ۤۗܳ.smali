.class public final Ll/ۤۗܳ;
.super Ljava/lang/Object;
.source "X4HD"


# direct methods
.method public static ֫(Ll/ܽ᩺ܽ;Z)Ll/ۨۧᩳ;
    .locals 3

    .line 155
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ܽ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 163
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 166
    :cond_0
    invoke-static {v0}, Ll/ۡۨܽ;->֫(Ljava/lang/String;)Ll/۬ܿᩳ;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    .line 173
    invoke-static {}, Ll/ܶܿᩳ;->ۚ()Ll/ܶܿᩳ;

    move-result-object v1

    goto :goto_1

    .line 171
    :cond_2
    new-instance p0, Ll/۫ۗܳ;

    invoke-direct {p0, v0}, Ll/۫ۗܳ;-><init>(Ljava/lang/String;)V

    throw p0

    .line 164
    :cond_3
    :goto_0
    invoke-static {}, Ll/ܶܿᩳ;->ۚ()Ll/ܶܿᩳ;

    move-result-object v1

    .line 156
    :goto_1
    new-instance p1, Ll/ۨۧᩳ;

    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ᩳ()Ll/۠ۧᩳ;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->֫()Z

    move-result p0

    invoke-direct {p1, v1, v0, v2, p0}, Ll/ۨۧᩳ;-><init>(Ll/۬ܿᩳ;Ll/۠ۧᩳ;Ljava/lang/String;Z)V

    return-object p1
.end method

.method public static ֫(Ll/ۗܺ᩷;Landroid/view/View;)Ll/᩸ۖ;
    .locals 4

    .line 418
    new-instance v0, Ll/᩸ۖ;

    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, p0, p1, v1}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 419
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v2, 0x7f12098a

    invoke-interface {p1, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 421
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v2, 0x7f1204cc

    invoke-interface {p1, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const/4 v1, 0x1

    .line 423
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 424
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "kasb"

    invoke-interface {v2, v3, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 425
    new-instance p1, Ll/ܺ᩵ܿ;

    const/4 v1, 0x4

    invoke-direct {p1, v1, p0}, Ll/ܺ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 436
    invoke-static {v0}, Ll/᩶ۖ;->ܽ(Ll/᩸ۖ;)V

    return-object v0
.end method

.method public static ֫(Lbin/mt/plus/Main;Ll/᩸᩶᩻;Ll/ۨۧᩳ;Ll/᩹ۗܿ;)V
    .locals 2

    .line 312
    invoke-virtual {p1}, Ll/᩸᩶᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 314
    :try_start_0
    invoke-static {p1}, Ll/᩹᩶᩻;->֫(Ll/᩸᩶᩻;)V

    .line 315
    invoke-virtual {p1}, Ll/᩸᩶᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    const v1, 0x7f1209a7

    .line 316
    invoke-virtual {p3, v1}, Ll/᩹ۗܿ;->᩻(I)V

    const/4 v1, 0x0

    .line 317
    invoke-virtual {p3, v1}, Ll/᩹ۗܿ;->ܿ(I)V

    .line 318
    invoke-virtual {p3, v1}, Ll/᩹ۗܿ;->ܳ(I)V

    .line 320
    new-instance v1, Ll/ۙۗܳ;

    invoke-direct {v1, p3}, Ll/ۙۗܳ;-><init>(Ll/᩹ۗܿ;)V

    invoke-static {v0, p1, p2, v1}, Ll/ۛۧᩳ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;Ll/۬ۧᩳ;)V

    .line 342
    invoke-virtual {p2}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object p1

    invoke-static {}, Ll/ܶܿᩳ;->ۚ()Ll/ܶܿᩳ;

    move-result-object p2

    if-ne p1, p2, :cond_0

    .line 343
    new-instance p1, Ll/ۛ᩷ᩳ;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p0}, Ll/ۛ᩷ᩳ;-><init>(ILjava/lang/Object;)V

    const-wide/16 p2, 0x1f4

    invoke-static {p1, p2, p3}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 346
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 347
    throw p0
.end method

.method public static ֫(Ll/ۗܺ᩷;Landroid/widget/CompoundButton;Ljava/lang/String;)V
    .locals 3

    .line 400
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "enable_auto_signature"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 401
    new-instance v0, Ll/ۢۗܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 407
    new-instance v0, Ll/ۖۗܳ;

    invoke-direct {v0, p0, p2}, Ll/ۖۗܳ;-><init>(Ll/ۗܺ᩷;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;Ll/᩺ۤܿ;)V
    .locals 0

    .line 291
    invoke-virtual {p4}, Ll/᩺ۤܿ;->֫()Ll/۬ۧᩳ;

    move-result-object p4

    invoke-static {p1, p2, p3, p4}, Ll/ۛۧᩳ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;Ll/۬ۧᩳ;)V

    .line 292
    invoke-virtual {p3}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object p1

    invoke-static {}, Ll/ܶܿᩳ;->ۚ()Ll/ܶܿᩳ;

    move-result-object p2

    if-ne p1, p2, :cond_0

    .line 293
    new-instance p1, Ll/᩸ۛᩳ;

    const/4 p2, 0x4

    invoke-direct {p1, p2, p0}, Ll/᩸ۛᩳ;-><init>(ILjava/lang/Object;)V

    const-wide/16 p2, 0x1f4

    invoke-static {p1, p2, p3}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ܽ᩺ܽ;ZLl/۬ۗܳ;)V
    .locals 1

    .line 115
    :try_start_0
    invoke-static {p1, p2}, Ll/ۤۗܳ;->֫(Ll/ܽ᩺ܽ;Z)Ll/ۨۧᩳ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    invoke-virtual {p1}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۬ܿᩳ;->ᩴ()Z

    move-result p2

    if-eqz p2, :cond_1

    if-nez p0, :cond_0

    .line 126
    new-instance p0, Ll/֫ۛۡ;

    const-string p1, "Signing key requires interactive verification."

    .line 16
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 126
    invoke-interface {p3, p0}, Ll/۬ۗܳ;->֫(Ljava/lang/Exception;)Z

    return-void

    .line 129
    :cond_0
    invoke-virtual {p1}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object p2

    new-instance v0, Ll/᩸ۗܳ;

    invoke-direct {v0, p3, p1}, Ll/᩸ۗܳ;-><init>(Ll/۬ۗܳ;Ll/ۨۧᩳ;)V

    invoke-static {v0, p2, p0}, Ll/ۡۨܽ;->֫(Ll/᩷ۨܽ;Ll/۬ܿᩳ;Ll/ۗܺ᩷;)V

    return-void

    :cond_1
    const/4 p0, 0x0

    .line 146
    invoke-interface {p3, p1, p0}, Ll/۬ۗܳ;->֫(Ll/ۨۧᩳ;Z)V

    return-void

    :catch_0
    move-exception p1

    .line 117
    invoke-interface {p3, p1}, Ll/۬ۗܳ;->֫(Ljava/lang/Exception;)Z

    move-result p2

    if-nez p2, :cond_2

    if-eqz p0, :cond_2

    const/4 p2, 0x0

    .line 546
    invoke-virtual {p0, p1, p2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_2
    return-void
.end method

.method public static ֫(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V
    .locals 6

    .line 69
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "enable_auto_signature"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 70
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string p2, "kasb"

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-interface {p0, v1, p1}, Ll/۬ۗܳ;->֫(Ll/ۨۧᩳ;Z)V

    return-void

    .line 73
    :cond_0
    new-instance v0, Ll/ܶۗܳ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܶۗܳ;-><init>(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V

    .line 97
    invoke-static {p2}, Ll/ᩳ᩺ܽ;->֫(Ljava/lang/String;)Ll/ܽ᩺ܽ;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 98
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ܽ()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/ۡۨܽ;->֫(Ljava/lang/String;)Ll/۬ܿᩳ;

    move-result-object p2

    if-nez p2, :cond_1

    move-object p0, v1

    :cond_1
    if-nez p0, :cond_2

    .line 180
    new-instance p0, Ll/ܽ᩺ܽ;

    .line 181
    sget-object p2, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    .line 618
    sget-object p2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "auto_signature_key"

    const-string v4, ""

    invoke-interface {p2, v3, v4}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 182
    invoke-static {}, Ll/ۡۨܽ;->֫()Ll/۠ۧᩳ;

    move-result-object v3

    .line 642
    sget-object v4, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v5, "v1_signature_filename"

    invoke-interface {v4, v5, v1}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 646
    sget-object v4, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v5, "kv1sd"

    invoke-interface {v4, v5, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 184
    invoke-direct {p0, p2, v3, v1, v4}, Ll/ܽ᩺ܽ;-><init>(Ljava/lang/String;Ll/۠ۧᩳ;Ljava/lang/String;Z)V

    .line 104
    :cond_2
    invoke-static {p1, p0, v2, v0}, Ll/ۤۗܳ;->֫(Ll/ۗܺ᩷;Ll/ܽ᩺ܽ;ZLl/۬ۗܳ;)V

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;Ll/ۘ۠ۢ;)V
    .locals 1

    .line 298
    invoke-virtual {p3}, Ll/ۘ۠ۢ;->ۧ()Ll/۬ۧᩳ;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Ll/ۛۧᩳ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;Ll/۬ۧᩳ;)V

    .line 299
    invoke-virtual {p2}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object p0

    invoke-static {}, Ll/ܶܿᩳ;->ۚ()Ll/ܶܿᩳ;

    move-result-object p1

    if-ne p0, p1, :cond_0

    .line 300
    new-instance p0, Ll/᩶ۗܳ;

    .line 753
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 300
    invoke-virtual {p3, p0}, Ll/ۘ۠ۢ;->֫(Ll/ۖ۠ۢ;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܽۢܳ;Ll/֡ۚۢ;Ljava/lang/String;)V
    .locals 2

    .line 376
    invoke-virtual {p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p0

    invoke-virtual {p1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    .line 384
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 385
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    const v1, 0x7f0d01cf

    .line 386
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    .line 387
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 388
    invoke-virtual {v0, v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 389
    invoke-static {p0, v1, p2}, Ll/ۤۗܳ;->֫(Ll/ۗܺ᩷;Landroid/widget/CompoundButton;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/᩸᩶᩻;Ll/ۨۧᩳ;Ll/ۘ۠ۢ;)V
    .locals 2

    .line 351
    invoke-virtual {p0}, Ll/᩸᩶᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 353
    :try_start_0
    invoke-static {p0}, Ll/᩹᩶᩻;->֫(Ll/᩸᩶᩻;)V

    .line 354
    invoke-virtual {p0}, Ll/᩸᩶᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 355
    invoke-virtual {p2}, Ll/ۘ۠ۢ;->ۧ()Ll/۬ۧᩳ;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Ll/ۛۧᩳ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;Ll/۬ۧᩳ;)V

    .line 356
    invoke-virtual {p1}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object p0

    invoke-static {}, Ll/ܶܿᩳ;->ۚ()Ll/ܶܿᩳ;

    move-result-object p1

    if-ne p0, p1, :cond_0

    .line 357
    new-instance p0, Ll/ۗۗܳ;

    .line 753
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 357
    invoke-virtual {p2, p0}, Ll/ۘ۠ۢ;->֫(Ll/ۖ۠ۢ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 367
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 368
    throw p0
.end method
