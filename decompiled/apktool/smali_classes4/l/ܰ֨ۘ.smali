.class public final Ll/ܰ֨ۘ;
.super Ll/ۨ֨ۘ;
.source "Y7LE"


# instance fields
.field public final synthetic ܽ:Ll/۟֨ۘ;


# direct methods
.method public constructor <init>(Ll/۟֨ۘ;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ll/ܰ֨ۘ;->ܽ:Ll/۟֨ۘ;

    .line 176
    invoke-direct {p0}, Ll/ۨ֨ۘ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 179
    iget-object v0, p0, Ll/ܰ֨ۘ;->ܽ:Ll/۟֨ۘ;

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
    .locals 3

    .line 186
    iget-object p3, p0, Ll/ܰ֨ۘ;->ܽ:Ll/۟֨ۘ;

    invoke-virtual {p3}, Ll/ۙ֨ۘ;->ܿ()F

    move-result v0

    invoke-virtual {p3}, Ll/ۙ֨ۘ;->ܳ()F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float v1, v1, v2

    add-float/2addr v1, v0

    .line 187
    iget-object v0, p3, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p1

    int-to-float p1, p1

    mul-float v1, v1, p2

    add-float/2addr v1, p1

    .line 189
    invoke-static {p3}, Ll/۟֨ۘ;->֫(Ll/۟֨ۘ;)Ll/᩸ܽ֫;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v1}, Ll/᩸ܽ֫;->ܽ(F)V

    :cond_0
    return-void
.end method
