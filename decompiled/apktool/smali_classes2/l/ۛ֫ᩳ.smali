.class public final Ll/ۛ֫ᩳ;
.super Landroid/widget/BaseAdapter;
.source "L58U"


# instance fields
.field public final synthetic ᩸:Ll/᩺֫ᩳ;


# direct methods
.method public constructor <init>(Ll/᩺֫ᩳ;)V
    .locals 0

    .line 163
    iput-object p1, p0, Ll/ۛ֫ᩳ;->᩸:Ll/᩺֫ᩳ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 167
    iget-object v0, p0, Ll/ۛ֫ᩳ;->᩸:Ll/᩺֫ᩳ;

    invoke-static {v0}, Ll/᩺֫ᩳ;->ᩳ(Ll/᩺֫ᩳ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    const/4 v0, 0x0

    .line 183
    iget-object v1, p0, Ll/ۛ֫ᩳ;->᩸:Ll/᩺֫ᩳ;

    if-nez p2, :cond_0

    .line 184
    invoke-static {v1}, Ll/᩺֫ᩳ;->֫(Ll/᩺֫ᩳ;)Ll/ۗܺ᩷;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p2

    const v2, 0x7f0d0151

    .line 185
    invoke-virtual {p2, v2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 186
    new-instance p3, Ll/ۨ֫ᩳ;

    invoke-direct {p3, p2}, Ll/ۨ֫ᩳ;-><init>(Landroid/view/View;)V

    .line 187
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 189
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۨ֫ᩳ;

    .line 190
    :goto_0
    iget-object v2, p3, Ll/ۨ֫ᩳ;->֫:Landroid/widget/RadioButton;

    invoke-static {v1}, Ll/᩺֫ᩳ;->ᩳ(Ll/᩺֫ᩳ;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶֫ᩳ;

    invoke-virtual {v3}, Ll/᩶֫ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    invoke-static {v1}, Ll/᩺֫ᩳ;->᩻(Ll/᩺֫ᩳ;)I

    move-result v1

    if-ne v1, p1, :cond_1

    const/4 v0, 0x1

    .line 204
    :cond_1
    iget-object p1, p3, Ll/ۨ֫ᩳ;->֫:Landroid/widget/RadioButton;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-object p2
.end method
