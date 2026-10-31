.class public final Ll/ۤۜۡ;
.super Ll/۟ܶۡ;
.source "08W3"


# instance fields
.field public final synthetic ܳ:Ll/ۨۜۡ;

.field public final synthetic ᩻:Z


# direct methods
.method public constructor <init>(Ll/ۨۜۡ;Z)V
    .locals 0

    .line 140
    iput-object p1, p0, Ll/ۤۜۡ;->ܳ:Ll/ۨۜۡ;

    iput-boolean p2, p0, Ll/ۤۜۡ;->᩻:Z

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 156
    iget-object v0, p0, Ll/ۤۜۡ;->ܳ:Ll/ۨۜۡ;

    invoke-static {v0}, Ll/ۨۜۡ;->ᩳ(Ll/ۨۜۡ;)Ll/۬۬ۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 161
    iget-object v0, p0, Ll/ۤۜۡ;->ܳ:Ll/ۨۜۡ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 144
    iget-object v0, p0, Ll/ۤۜۡ;->ܳ:Ll/ۨۜۡ;

    invoke-static {v0}, Ll/ۨۜۡ;->֫(Ll/ۨۜۡ;)Landroid/widget/TextView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 145
    invoke-static {v0}, Ll/ۨۜۡ;->ܿ(Ll/ۨۜۡ;)Ll/۫ۤۧ;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/۫ۤۧ;->֫(Z)V

    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 150
    iget-boolean v0, p0, Ll/ۤۜۡ;->᩻:Z

    invoke-static {v0}, Ll/ܰۜۡ;->ۧ(Z)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Ll/ۤۜۡ;->ܳ:Ll/ۨۜۡ;

    invoke-static {v1, v0}, Ll/ۨۜۡ;->֫(Ll/ۨۜۡ;Ljava/util/ArrayList;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 3

    .line 166
    iget-object v0, p0, Ll/ۤۜۡ;->ܳ:Ll/ۨۜۡ;

    invoke-static {v0}, Ll/ۨۜۡ;->ܿ(Ll/ۨۜۡ;)Ll/۫ۤۧ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/۫ۤۧ;->֫(Z)V

    .line 167
    invoke-static {v0}, Ll/ۨۜۡ;->ܽ(Ll/ۨۜۡ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 168
    invoke-static {v0}, Ll/ۨۜۡ;->֫(Ll/ۨۜۡ;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
