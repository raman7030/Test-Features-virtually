.class public final Ll/ۛ᩷;
.super Ll/ᩳ᩷;
.source "P55W"


# instance fields
.field public final synthetic ܺ:Ll/ܿۢ;


# direct methods
.method public constructor <init>(Ll/ܿۢ;Landroid/content/Context;Ll/᩵᩷;Landroid/view/View;)V
    .locals 7

    .line 733
    iput-object p1, p0, Ll/ۛ᩷;->ܺ:Ll/ܿۢ;

    const v5, 0x7f040020

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    .line 78
    invoke-direct/range {v0 .. v6}, Ll/ᩳ᩷;-><init>(Landroid/content/Context;Ll/ۗۜ;Landroid/view/View;ZII)V

    .line 736
    invoke-virtual {p3}, Ll/᩵᩷;->getItem()Landroid/view/MenuItem;

    move-result-object p2

    check-cast p2, Ll/ۛۜ;

    .line 737
    invoke-virtual {p2}, Ll/ۛۜ;->᩷()Z

    move-result p2

    if-nez p2, :cond_1

    .line 739
    iget-object p2, p1, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    if-nez p2, :cond_0

    invoke-static {p1}, Ll/ܿۢ;->ܽ(Ll/ܿۢ;)Ll/ۜ᩷;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    :cond_0
    invoke-virtual {p0, p2}, Ll/ᩳ᩷;->֫(Landroid/view/View;)V

    .line 742
    :cond_1
    iget-object p1, p1, Ll/ܿۢ;->ۜ֫:Ll/ۧۢ;

    invoke-virtual {p0, p1}, Ll/ᩳ᩷;->֫(Ll/ܿ᩷;)V

    return-void
.end method


# virtual methods
.method public final ܿ()V
    .locals 2

    const/4 v0, 0x0

    .line 747
    iget-object v1, p0, Ll/ۛ᩷;->ܺ:Ll/ܿۢ;

    iput-object v0, v1, Ll/ܿۢ;->᩺:Ll/ۛ᩷;

    const/4 v0, 0x0

    .line 748
    iput v0, v1, Ll/ܿۢ;->ۧ֫:I

    .line 750
    invoke-super {p0}, Ll/ᩳ᩷;->ܿ()V

    return-void
.end method
