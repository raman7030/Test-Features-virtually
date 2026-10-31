.class public final Ll/ۢۨܽ;
.super Ljava/lang/Object;
.source "H5BW"


# instance fields
.field public final ֫:Landroid/widget/Spinner;

.field public ۧ:Ljava/lang/Runnable;

.field public ܽ:Ll/᩸ܿᩳ;


# direct methods
.method public constructor <init>(Landroid/widget/Spinner;)V
    .locals 0

    .line 489
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 490
    iput-object p1, p0, Ll/ۢۨܽ;->֫:Landroid/widget/Spinner;

    return-void
.end method

.method public static ֫(Ll/ۢۨܽ;I)V
    .locals 2

    if-ltz p1, :cond_1

    .line 494
    sget-object v0, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_0

    .line 497
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ܿᩳ;

    invoke-direct {p0, p1}, Ll/ۢۨܽ;->֫(Ll/۬ܿᩳ;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ۢۨܽ;Ljava/lang/Runnable;)V
    .locals 0

    .line 532
    iput-object p1, p0, Ll/ۢۨܽ;->ۧ:Ljava/lang/Runnable;

    .line 534
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static ֫(Ll/ۢۨܽ;)Z
    .locals 3

    .line 504
    iget-object v0, p0, Ll/ۢۨܽ;->֫:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    if-ltz v0, :cond_1

    .line 505
    sget-object v1, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v0, v2, :cond_0

    goto :goto_0

    .line 508
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ܿᩳ;

    invoke-direct {p0, v0}, Ll/ۢۨܽ;->֫(Ll/۬ܿᩳ;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private ֫(Ll/۬ܿᩳ;)Z
    .locals 1

    .line 539
    invoke-virtual {p1}, Ll/۬ܿᩳ;->᩵()V

    .line 540
    instance-of v0, p1, Ll/᩹ܿᩳ;

    if-eqz v0, :cond_0

    .line 541
    check-cast p1, Ll/᩹ܿᩳ;

    invoke-virtual {p1}, Ll/᩹ܿᩳ;->ۚ()Ll/᩸ܿᩳ;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/ۢۨܽ;->ܽ:Ll/᩸ܿᩳ;

    .line 543
    iget-object p1, p0, Ll/ۢۨܽ;->ۧ:Ljava/lang/Runnable;

    if-eqz p1, :cond_1

    .line 544
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 523
    :cond_1
    iget-object p1, p0, Ll/ۢۨܽ;->ܽ:Ll/᩸ܿᩳ;

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public static ۧ(Ll/ۢۨܽ;)Ll/᩸ܿᩳ;
    .locals 0

    .line 528
    iget-object p0, p0, Ll/ۢۨܽ;->ܽ:Ll/᩸ܿᩳ;

    return-object p0
.end method

.method public static ܽ(Ll/ۢۨܽ;)Z
    .locals 0

    .line 523
    iget-object p0, p0, Ll/ۢۨܽ;->ܽ:Ll/᩸ܿᩳ;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩳ(Ll/ۢۨܽ;)V
    .locals 3

    .line 515
    iget-object v0, p0, Ll/ۢۨܽ;->֫:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    if-ltz v0, :cond_0

    .line 516
    sget-object v1, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 517
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ܿᩳ;

    invoke-direct {p0, v0}, Ll/ۢۨܽ;->֫(Ll/۬ܿᩳ;)Z

    :cond_0
    return-void
.end method
