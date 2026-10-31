.class public final Ll/۫᩻ۡ;
.super Ll/۟ܶۡ;
.source "88W8"


# instance fields
.field public final synthetic ܳ:Ll/ۛ᩻ۡ;

.field public final synthetic ᩻:Z


# direct methods
.method public constructor <init>(Ll/ۛ᩻ۡ;Z)V
    .locals 0

    .line 59
    iput-object p1, p0, Ll/۫᩻ۡ;->ܳ:Ll/ۛ᩻ۡ;

    iput-boolean p2, p0, Ll/۫᩻ۡ;->᩻:Z

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 78
    iget-object v0, p0, Ll/۫᩻ۡ;->ܳ:Ll/ۛ᩻ۡ;

    invoke-static {v0}, Ll/ۛ᩻ۡ;->ܿ(Ll/ۛ᩻ۡ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 79
    invoke-static {v0}, Ll/ۛ᩻ۡ;->֫(Ll/ۛ᩻ۡ;)Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f120a9c

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 81
    :cond_0
    invoke-static {v0}, Ll/ۛ᩻ۡ;->ܽ(Ll/ۛ᩻ۡ;)Ll/۬۬ۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 3

    .line 86
    iget-object v0, p0, Ll/۫᩻ۡ;->ܳ:Ll/ۛ᩻ۡ;

    invoke-static {v0}, Ll/ۛ᩻ۡ;->֫(Ll/ۛ᩻ۡ;)Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f12051e

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 63
    iget-object v0, p0, Ll/۫᩻ۡ;->ܳ:Ll/ۛ᩻ۡ;

    invoke-static {v0}, Ll/ۛ᩻ۡ;->֫(Ll/ۛ᩻ۡ;)Landroid/widget/TextView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 64
    invoke-static {v0}, Ll/ۛ᩻ۡ;->ᩳ(Ll/ۛ᩻ۡ;)Ll/۫ۤۧ;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/۫ۤۧ;->֫(Z)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 69
    iget-boolean v0, p0, Ll/۫᩻ۡ;->᩻:Z

    invoke-static {v0}, Ll/ܰۜۡ;->֫(Z)Ljava/util/ArrayList;

    move-result-object v0

    .line 70
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/֡֡ܿ;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ll/֡֡ܿ;-><init>(I)V

    .line 71
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 72
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Ll/۫᩻ۡ;->ܳ:Ll/ۛ᩻ۡ;

    invoke-static {v1, v0}, Ll/ۛ᩻ۡ;->֫(Ll/ۛ᩻ۡ;Ljava/util/List;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 3

    .line 92
    iget-object v0, p0, Ll/۫᩻ۡ;->ܳ:Ll/ۛ᩻ۡ;

    invoke-static {v0}, Ll/ۛ᩻ۡ;->ᩳ(Ll/ۛ᩻ۡ;)Ll/۫ۤۧ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/۫ۤۧ;->֫(Z)V

    .line 93
    invoke-static {v0}, Ll/ۛ᩻ۡ;->ܿ(Ll/ۛ᩻ۡ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 94
    invoke-static {v0}, Ll/ۛ᩻ۡ;->֫(Ll/ۛ᩻ۡ;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
