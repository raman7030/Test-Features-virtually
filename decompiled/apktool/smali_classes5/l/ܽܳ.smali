.class public final Ll/ܽܳ;
.super Ll/֨ۧܺ;
.source "422Y"


# instance fields
.field public final synthetic ֫:Ll/ᩳܳ;


# direct methods
.method public constructor <init>(Ll/ᩳܳ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3019
    iput-object p1, p0, Ll/ܽܳ;->֫:Ll/ᩳܳ;

    return-void
.end method


# virtual methods
.method public final onAnimationEnd()V
    .locals 3

    .line 3022
    iget-object v0, p0, Ll/ܽܳ;->֫:Ll/ᩳܳ;

    iget-object v0, v0, Ll/ᩳܳ;->ۧ:Ll/ۚܳ;

    iget-object v1, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Ll/֨᩷;->setVisibility(I)V

    .line 3023
    iget-object v1, v0, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_0

    .line 3024
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    .line 3025
    :cond_0
    iget-object v1, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/View;

    if-eqz v1, :cond_1

    .line 3026
    iget-object v1, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    .line 3028
    :cond_1
    :goto_0
    iget-object v1, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v1}, Ll/᩹᩷;->ܿ()V

    .line 3029
    iget-object v1, v0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/ܶ᩺;->֫(Ll/᩸᩺;)V

    .line 3030
    iput-object v2, v0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    .line 3031
    iget-object v0, v0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    invoke-static {v0}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    return-void
.end method
