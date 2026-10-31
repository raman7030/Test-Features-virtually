.class public final Ll/۫ۛܽ;
.super Ljava/lang/Object;
.source "H5BW"

# interfaces
.implements Ll/᩻ۨܽ;


# instance fields
.field public final synthetic ֫:Ll/ۗۘ;

.field public final synthetic ۧ:Landroid/widget/Spinner;

.field public final synthetic ܽ:Landroid/widget/Spinner;

.field public final synthetic ܿ:Ll/ۗۘ;

.field public final synthetic ᩳ:Ll/ۢۨܽ;


# direct methods
.method public constructor <init>(Landroid/widget/Spinner;Landroid/widget/Spinner;Ll/ۗۘ;Ll/ۗۘ;Ll/ۢۨܽ;)V
    .locals 0

    .line 439
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۛܽ;->ۧ:Landroid/widget/Spinner;

    iput-object p2, p0, Ll/۫ۛܽ;->ܽ:Landroid/widget/Spinner;

    iput-object p3, p0, Ll/۫ۛܽ;->ܿ:Ll/ۗۘ;

    iput-object p4, p0, Ll/۫ۛܽ;->֫:Ll/ۗۘ;

    iput-object p5, p0, Ll/۫ۛܽ;->ᩳ:Ll/ۢۨܽ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܽ᩺ܽ;
    .locals 5

    .line 442
    sget-object v0, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۫ۛܽ;->ۧ:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ܿᩳ;

    .line 443
    invoke-virtual {v0}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v0

    .line 444
    invoke-static {}, Ll/۠ۧᩳ;->values()[Ll/۠ۧᩳ;

    move-result-object v1

    iget-object v2, p0, Ll/۫ۛܽ;->ܽ:Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v2

    aget-object v1, v1, v2

    .line 445
    iget-object v2, p0, Ll/۫ۛܽ;->ܿ:Ll/ۗۘ;

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    if-eqz v2, :cond_1

    .line 446
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v2

    .line 449
    :goto_1
    iget-object v2, p0, Ll/۫ۛܽ;->֫:Ll/ۗۘ;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    .line 450
    :goto_2
    new-instance v3, Ll/ܽ᩺ܽ;

    invoke-direct {v3, v0, v1, v4, v2}, Ll/ܽ᩺ܽ;-><init>(Ljava/lang/String;Ll/۠ۧᩳ;Ljava/lang/String;Z)V

    return-object v3
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 1

    .line 476
    iget-object v0, p0, Ll/۫ۛܽ;->ᩳ:Ll/ۢۨܽ;

    invoke-static {v0, p1}, Ll/ۢۨܽ;->֫(Ll/ۢۨܽ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 455
    iget-object v0, p0, Ll/۫ۛܽ;->ᩳ:Ll/ۢۨܽ;

    invoke-static {v0}, Ll/ۢۨܽ;->֫(Ll/ۢۨܽ;)Z

    move-result v0

    return v0
.end method

.method public final ܿ()Ll/᩸ܿᩳ;
    .locals 1

    .line 466
    iget-object v0, p0, Ll/۫ۛܽ;->ᩳ:Ll/ۢۨܽ;

    invoke-static {v0}, Ll/ۢۨܽ;->ۧ(Ll/ۢۨܽ;)Ll/᩸ܿᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 460
    iget-object v0, p0, Ll/۫ۛܽ;->ᩳ:Ll/ۢۨܽ;

    invoke-static {v0}, Ll/ۢۨܽ;->ܽ(Ll/ۢۨܽ;)Z

    move-result v0

    return v0
.end method
