.class public final Ll/ۧ۠ۘ;
.super Ll/ۨ֨ۘ;
.source "27KL"


# instance fields
.field public final synthetic ܽ:Ll/ᩳ۠ۘ;


# direct methods
.method public constructor <init>(Ll/ᩳ۠ۘ;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ll/ۧ۠ۘ;->ܽ:Ll/ᩳ۠ۘ;

    .line 178
    invoke-direct {p0}, Ll/ۨ֨ۘ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ۧ۠ۘ;->ܽ:Ll/ᩳ۠ۘ;

    iget-object v0, v0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    return-void
.end method

.method public final ֫(IFI)V
    .locals 5

    .line 188
    iget-object v0, p0, Ll/ۧ۠ۘ;->ܽ:Ll/ᩳ۠ۘ;

    iget-object v1, v0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    int-to-float v2, v2

    const/4 v4, -0x1

    if-ne p3, v4, :cond_0

    goto :goto_0

    :cond_0
    move p1, p3

    .line 190
    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-static {p1, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p1

    int-to-float p1, p1

    const/4 p3, 0x0

    const v1, 0x3dcccccd    # 0.1f

    cmpg-float p3, p3, p2

    if-gtz p3, :cond_1

    cmpg-float p3, p2, v1

    if-gtz p3, :cond_1

    .line 198
    invoke-virtual {v0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result p1

    goto :goto_1

    :cond_1
    cmpg-float p3, v1, p2

    if-gtz p3, :cond_2

    const p3, 0x3f666666    # 0.9f

    cmpg-float p2, p2, p3

    if-gtz p2, :cond_2

    sub-float/2addr p1, v2

    .line 203
    invoke-virtual {v0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result p2

    add-float/2addr p1, p2

    goto :goto_1

    .line 208
    :cond_2
    invoke-virtual {v0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result p2

    move v2, p1

    move p1, p2

    .line 212
    :goto_1
    invoke-static {v0}, Ll/ᩳ۠ۘ;->ܽ(Ll/ᩳ۠ۘ;)Ll/᩸ܽ֫;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2, v2}, Ll/᩸ܽ֫;->ܽ(F)V

    .line 213
    :cond_3
    invoke-static {v0}, Ll/ᩳ۠ۘ;->ۧ(Ll/ᩳ۠ۘ;)Ll/᩸ܽ֫;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2, p1}, Ll/᩸ܽ֫;->ܽ(F)V

    :cond_4
    return-void
.end method
