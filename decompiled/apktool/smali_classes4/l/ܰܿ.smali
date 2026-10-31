.class public final Ll/ܰܿ;
.super Ll/֨ۧܺ;
.source "422Y"


# instance fields
.field public final synthetic ֫:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1393
    iput-object p1, p0, Ll/ܰܿ;->֫:Ll/ۚܳ;

    return-void
.end method


# virtual methods
.method public final onAnimationEnd()V
    .locals 3

    .line 1404
    iget-object v0, p0, Ll/ܰܿ;->֫:Ll/ۚܳ;

    iget-object v1, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 1405
    iget-object v1, v0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/ܶ᩺;->֫(Ll/᩸᩺;)V

    .line 1406
    iput-object v2, v0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 1396
    iget-object v0, p0, Ll/ܰܿ;->֫:Ll/ۚܳ;

    iget-object v1, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/֨᩷;->setVisibility(I)V

    .line 1397
    iget-object v1, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/View;

    if-eqz v1, :cond_0

    .line 1398
    iget-object v0, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    :cond_0
    return-void
.end method
