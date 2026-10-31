.class public final Ll/ۡ֨ۧ;
.super Ll/ۗ۬ۧ;
.source "28G3"


# instance fields
.field public final ֫:Landroid/widget/ImageView;

.field public final ۧ:Landroid/widget/TextView;

.field public final ܽ:Landroid/widget/TextView;

.field public final synthetic ᩳ:Ll/۠֨ۧ;


# direct methods
.method public constructor <init>(Ll/۠֨ۧ;Landroid/view/View;)V
    .locals 1

    .line 2155
    iput-object p1, p0, Ll/ۡ֨ۧ;->ᩳ:Ll/۠֨ۧ;

    .line 2156
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 2157
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    .line 2159
    invoke-virtual {p2, p1}, Landroid/view/View;->setFocusable(Z)V

    :cond_0
    const p1, 0x7f0a01b8

    .line 2161
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۡ֨ۧ;->ۧ:Landroid/widget/TextView;

    const p1, 0x7f0a01ce

    .line 2162
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۡ֨ۧ;->ܽ:Landroid/widget/TextView;

    const p1, 0x7f0a01b6

    .line 2163
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ۡ֨ۧ;->֫:Landroid/widget/ImageView;

    .line 2164
    new-instance p1, Ll/ۢ֨ۧ;

    invoke-direct {p1, p0}, Ll/ۢ֨ۧ;-><init>(Ll/ۡ֨ۧ;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡ֨ۧ;)Landroid/widget/ImageView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ֨ۧ;->֫:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۡ֨ۧ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ֨ۧ;->ۧ:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۡ֨ۧ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ֨ۧ;->ܽ:Landroid/widget/TextView;

    return-object p0
.end method
