.class public final Ll/ۙ᩷ۢ;
.super Ll/᩸ܳܿ;
.source "O1K3"


# instance fields
.field public final synthetic ۜ:Ll/֫ܰᩳ;

.field public final synthetic ᩻:Ll/ۗ᩷ۢ;


# direct methods
.method public constructor <init>(Ll/ۗ᩷ۢ;Ll/᩶᩷ۢ;Ll/֫ܰᩳ;)V
    .locals 0

    .line 1588
    iput-object p1, p0, Ll/ۙ᩷ۢ;->᩻:Ll/ۗ᩷ۢ;

    iput-object p3, p0, Ll/ۙ᩷ۢ;->ۜ:Ll/֫ܰᩳ;

    const p1, 0x7f1205dc

    const p3, 0x7f080201

    invoke-direct {p0, p1, p3, p2}, Ll/᩸ܳܿ;-><init>(IILl/۬ۤ;)V

    return-void
.end method


# virtual methods
.method public final ܽ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 1597
    iget-object v0, p0, Ll/ۙ᩷ۢ;->ۜ:Ll/֫ܰᩳ;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll/֫ܰᩳ;->֫:Z

    .line 1598
    iget-object v0, p0, Ll/ۙ᩷ۢ;->᩻:Ll/ۗ᩷ۢ;

    iget-object v0, v0, Ll/ۗ᩷ۢ;->֫֫:Ll/ۛ᩷ۢ;

    invoke-static {v0}, Ll/ۛ᩷ۢ;->ۚ(Ll/ۛ᩷ۢ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1599
    invoke-static {v0}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method
