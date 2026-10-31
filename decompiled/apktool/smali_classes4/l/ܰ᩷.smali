.class public final Ll/ܰ᩷;
.super Ll/ܰܺ;
.source "P55W"


# instance fields
.field public final synthetic ۨ:Ll/۟᩷;


# direct methods
.method public constructor <init>(Ll/۟᩷;Landroid/view/View;)V
    .locals 0

    .line 638
    iput-object p1, p0, Ll/ܰ᩷;->ۨ:Ll/۟᩷;

    invoke-direct {p0, p2}, Ll/ܰܺ;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۢ᩷;
    .locals 1

    .line 641
    iget-object v0, p0, Ll/ܰ᩷;->ۨ:Ll/۟᩷;

    iget-object v0, v0, Ll/۟᩷;->᩸:Ll/ܿۢ;

    iget-object v0, v0, Ll/ܿۢ;->ᩳ֫:Ll/֫ۢ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 645
    :cond_0
    invoke-virtual {v0}, Ll/ᩳ᩷;->ܽ()Ll/ۧ᩷;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 650
    iget-object v0, p0, Ll/ܰ᩷;->ۨ:Ll/۟᩷;

    iget-object v0, v0, Ll/۟᩷;->᩸:Ll/ܿۢ;

    invoke-virtual {v0}, Ll/ܿۢ;->ۜ()Z

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 659
    iget-object v0, p0, Ll/ܰ᩷;->ۨ:Ll/۟᩷;

    iget-object v0, v0, Ll/۟᩷;->᩸:Ll/ܿۢ;

    iget-object v1, v0, Ll/ܿۢ;->᩷֫:Ll/᩺᩷;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 663
    :cond_0
    invoke-virtual {v0}, Ll/ܿۢ;->ܽ()Z

    const/4 v0, 0x1

    return v0
.end method
