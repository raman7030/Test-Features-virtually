.class public final Ll/᩵᩻ܳ;
.super Ll/ۗۗۧ;
.source "K7HV"


# instance fields
.field public final synthetic ֫:Ll/ۙ᩻ܳ;

.field public final synthetic ۧ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/ۙ᩻ܳ;Landroid/widget/TextView;)V
    .locals 0

    .line 77
    iput-object p1, p0, Ll/᩵᩻ܳ;->֫:Ll/ۙ᩻ܳ;

    iput-object p2, p0, Ll/᩵᩻ܳ;->ۧ:Landroid/widget/TextView;

    invoke-direct {p0}, Ll/ۗۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    .line 80
    iget-object v0, p0, Ll/᩵᩻ܳ;->֫:Ll/ۙ᩻ܳ;

    invoke-static {v0}, Ll/ۙ᩻ܳ;->ܽ(Ll/ۙ᩻ܳ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    iget-object v1, p0, Ll/᩵᩻ܳ;->ۧ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final onItemRangeChanged(II)V
    .locals 0

    .line 85
    invoke-virtual {p0}, Ll/᩵᩻ܳ;->onChanged()V

    return-void
.end method

.method public final onItemRangeChanged(IILjava/lang/Object;)V
    .locals 0

    .line 90
    invoke-virtual {p0}, Ll/᩵᩻ܳ;->onChanged()V

    return-void
.end method

.method public final onItemRangeInserted(II)V
    .locals 0

    .line 95
    invoke-virtual {p0}, Ll/᩵᩻ܳ;->onChanged()V

    return-void
.end method

.method public final onItemRangeMoved(III)V
    .locals 0

    .line 105
    invoke-virtual {p0}, Ll/᩵᩻ܳ;->onChanged()V

    return-void
.end method

.method public final onItemRangeRemoved(II)V
    .locals 0

    .line 100
    invoke-virtual {p0}, Ll/᩵᩻ܳ;->onChanged()V

    return-void
.end method
