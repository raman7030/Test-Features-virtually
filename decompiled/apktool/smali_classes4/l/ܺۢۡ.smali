.class public final Ll/ܺۢۡ;
.super Ll/ۗۗۧ;
.source "I5UN"


# instance fields
.field public final synthetic ֫:Ll/ۖۢۡ;

.field public final synthetic ۧ:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/ۖۢۡ;Landroid/view/View;)V
    .locals 0

    .line 91
    iput-object p1, p0, Ll/ܺۢۡ;->֫:Ll/ۖۢۡ;

    iput-object p2, p0, Ll/ܺۢۡ;->ۧ:Landroid/view/View;

    invoke-direct {p0}, Ll/ۗۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 4

    .line 94
    iget-object v0, p0, Ll/ܺۢۡ;->֫:Ll/ۖۢۡ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 95
    invoke-virtual {v1}, Ll/᩶ۗۧ;->getItemCount()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 96
    :goto_1
    iget-object v3, p0, Ll/ܺۢۡ;->ۧ:Landroid/view/View;

    if-eqz v3, :cond_3

    if-eqz v1, :cond_2

    .line 98
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    const/4 v1, 0x4

    .line 99
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_2
    const/16 v1, 0x8

    .line 101
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 102
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 105
    :cond_3
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final onItemRangeChanged(II)V
    .locals 0

    .line 111
    invoke-virtual {p0}, Ll/ܺۢۡ;->onChanged()V

    return-void
.end method

.method public final onItemRangeChanged(IILjava/lang/Object;)V
    .locals 0

    .line 116
    invoke-virtual {p0}, Ll/ܺۢۡ;->onChanged()V

    return-void
.end method

.method public final onItemRangeInserted(II)V
    .locals 0

    .line 121
    invoke-virtual {p0}, Ll/ܺۢۡ;->onChanged()V

    return-void
.end method

.method public final onItemRangeMoved(III)V
    .locals 0

    .line 131
    invoke-virtual {p0}, Ll/ܺۢۡ;->onChanged()V

    return-void
.end method

.method public final onItemRangeRemoved(II)V
    .locals 0

    .line 126
    invoke-virtual {p0}, Ll/ܺۢۡ;->onChanged()V

    return-void
.end method
