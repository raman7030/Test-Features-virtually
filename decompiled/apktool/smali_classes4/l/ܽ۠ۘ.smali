.class public final Ll/ܽ۠ۘ;
.super Ll/ܶܽ֫;
.source "27KL"


# instance fields
.field public final synthetic ֫:Ll/ᩳ۠ۘ;


# direct methods
.method public constructor <init>(Ll/ᩳ۠ۘ;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ll/ܽ۠ۘ;->֫:Ll/ᩳ۠ۘ;

    const-string p1, "DotsWidth"

    .line 105
    invoke-direct {p0, p1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getValue(Ljava/lang/Object;)F
    .locals 1

    .line 105
    check-cast p1, Landroid/view/View;

    const-string v0, "object"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    iget-object p1, p0, Ll/ܽ۠ۘ;->֫:Ll/ᩳ۠ۘ;

    invoke-static {p1}, Ll/ᩳ۠ۘ;->֫(Ll/ᩳ۠ۘ;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float p1, p1

    return p1
.end method

.method public final setValue(Ljava/lang/Object;F)V
    .locals 1

    .line 105
    check-cast p1, Landroid/view/View;

    const-string v0, "object"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    iget-object p1, p0, Ll/ܽ۠ۘ;->֫:Ll/ᩳ۠ۘ;

    invoke-static {p1}, Ll/ᩳ۠ۘ;->֫(Ll/ᩳ۠ۘ;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    float-to-int p2, p2

    .line 112
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 113
    invoke-static {p1}, Ll/ᩳ۠ۘ;->֫(Ll/ᩳ۠ۘ;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method
