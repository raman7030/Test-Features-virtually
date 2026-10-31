.class public final synthetic Ll/ۡۖۡ;
.super Ljava/lang/Object;
.source "W5L3"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1

    .line 2
    sget p1, Ll/ۚۖۡ;->᩺:I

    .line 126
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۖۡ;

    .line 496
    iget-object p2, p1, Ll/᩵ۖۡ;->ۤ:Ll/ۚۖۡ;

    iget p3, p1, Ll/᩵ۖۡ;->ۙ:I

    if-eqz p3, :cond_5

    const/4 p4, 0x1

    if-eq p3, p4, :cond_4

    const/4 p5, 0x3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_3

    if-eq p3, p5, :cond_2

    const/4 p5, 0x4

    if-eq p3, p5, :cond_1

    const/4 p5, 0x5

    if-ne p3, p5, :cond_0

    .line 518
    new-instance p3, Ll/ᩴۖۡ;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p2

    check-cast p2, Ll/ۗܺ᩷;

    invoke-direct {p3, p1, p2}, Ll/ᩴۖۡ;-><init>(Ll/᩵ۖۡ;Ll/ۗܺ᩷;)V

    const p1, 0x7f1205b2

    .line 574
    invoke-virtual {p3, p1}, Ll/۬ۗܿ;->ۡ(I)V

    const p1, 0x7f1204ab

    .line 575
    invoke-virtual {p3, p1}, Ll/۬ۗܿ;->ۢ(I)V

    const p1, 0x7f1204ac

    .line 576
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/۬ۗܿ;->ۧ(Ljava/lang/String;)V

    .line 577
    invoke-virtual {p3, v0}, Ll/۬ۗܿ;->ܿ(I)V

    .line 578
    invoke-virtual {p3, v0}, Ll/۬ۗܿ;->ܳ(I)V

    .line 579
    invoke-virtual {p3}, Ll/۬ۗܿ;->֫()V

    .line 205
    invoke-virtual {p3, p4}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    .line 583
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    return-void

    .line 515
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance p3, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    const-class p5, Ll/ۢۖۡ;

    invoke-direct {p3, p4, p5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 516
    invoke-static {p2}, Ll/ۚۖۡ;->ܿ(Ll/ۚۖۡ;)Ll/ܺۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۢۖ;->dismiss()V

    return-void

    .line 508
    :cond_3
    invoke-static {p2}, Ll/ۚۖۡ;->ۜ(Ll/ۚۖۡ;)V

    .line 509
    invoke-static {p2}, Ll/ۚۖۡ;->ܿ(Ll/ۚۖۡ;)Ll/ܺۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۢۖ;->ᩳ()Landroid/widget/ListView;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    new-instance p3, Landroid/graphics/drawable/ColorDrawable;

    const/4 p4, 0x0

    invoke-direct {p3, p4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, p3}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 511
    invoke-virtual {p2}, Ll/ۚۖۡ;->ܿ()V

    .line 512
    new-instance p2, Ll/֨۠ᩳ;

    invoke-direct {p2, p5, p1}, Ll/֨۠ᩳ;-><init>(ILjava/lang/Object;)V

    const-wide/16 p3, 0x1f4

    invoke-static {p3, p4, p2}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    return-void

    .line 503
    :cond_4
    invoke-static {p2}, Ll/ۚۖۡ;->ۧ(Ll/ۚۖۡ;)Ll/ۤۤᩳ;

    move-result-object p3

    iget-object p1, p1, Ll/᩵ۖۡ;->᩹:Ll/۟ܺۡ;

    invoke-virtual {p1}, Ll/۟ܺۡ;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    .line 504
    invoke-static {p2}, Ll/ۚۖۡ;->ۧ(Ll/ۚۖۡ;)Ll/ۤۤᩳ;

    move-result-object p1

    invoke-static {p2}, Ll/ۚۖۡ;->ۧ(Ll/ۚۖۡ;)Ll/ۤۤᩳ;

    move-result-object p3

    invoke-virtual {p3}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result p3

    invoke-virtual {p1, p3}, Ll/ۤۤᩳ;->ᩴ(I)V

    .line 505
    invoke-static {p2}, Ll/ۚۖۡ;->ܿ(Ll/ۚۖۡ;)Ll/ܺۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۢۖ;->dismiss()V

    return-void

    .line 498
    :cond_5
    invoke-static {p2}, Ll/ۚۖۡ;->ۧ(Ll/ۚۖۡ;)Ll/ۤۤᩳ;

    move-result-object p3

    iget-object p1, p1, Ll/᩵ۖۡ;->۬:Ljava/lang/String;

    invoke-virtual {p3, p1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    .line 499
    invoke-static {p2}, Ll/ۚۖۡ;->ۧ(Ll/ۚۖۡ;)Ll/ۤۤᩳ;

    move-result-object p1

    invoke-static {p2}, Ll/ۚۖۡ;->ۧ(Ll/ۚۖۡ;)Ll/ۤۤᩳ;

    move-result-object p3

    invoke-virtual {p3}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result p3

    invoke-virtual {p1, p3}, Ll/ۤۤᩳ;->ᩴ(I)V

    .line 500
    invoke-static {p2}, Ll/ۚۖۡ;->ܿ(Ll/ۚۖۡ;)Ll/ܺۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۢۖ;->dismiss()V

    return-void
.end method
