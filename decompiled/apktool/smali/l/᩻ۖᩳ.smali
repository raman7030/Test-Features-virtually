.class public final Ll/᩻ۖᩳ;
.super Landroid/widget/BaseAdapter;
.source "U5MD"


# instance fields
.field public final synthetic ᩸:Ll/ۡۖᩳ;

.field public final synthetic ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۡۖᩳ;Ljava/util/ArrayList;)V
    .locals 0

    .line 120
    iput-object p1, p0, Ll/᩻ۖᩳ;->᩸:Ll/ۡۖᩳ;

    iput-object p2, p0, Ll/᩻ۖᩳ;->᩹:Ljava/util/ArrayList;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 123
    iget-object v0, p0, Ll/᩻ۖᩳ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

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

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    if-nez p2, :cond_0

    .line 140
    iget-object p2, p0, Ll/᩻ۖᩳ;->᩸:Ll/ۡۖᩳ;

    invoke-static {p2}, Ll/ۡۖᩳ;->ۧ(Ll/ۡۖᩳ;)Ll/ۗܺ᩷;

    move-result-object p2

    const p3, 0x7f0d0146

    invoke-virtual {p2, p3}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p2

    .line 141
    new-instance p3, Ll/᩸ۜᩳ;

    invoke-direct {p3, p2}, Ll/᩸ۜᩳ;-><init>(Landroid/view/View;)V

    .line 142
    iget-object v0, p3, Ll/᩸ۜᩳ;->ܽ:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    const/4 v0, 0x4

    .line 143
    iget-object v2, p3, Ll/᩸ۜᩳ;->֫:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x0

    .line 144
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    iget-object v0, p3, Ll/᩸ۜᩳ;->ۧ:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 146
    sget-object v2, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 147
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    const/4 v1, 0x3

    .line 148
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 149
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 151
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩸ۜᩳ;

    .line 152
    :goto_0
    iget-object v0, p0, Ll/᩻ۖᩳ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤۤ;

    .line 153
    iget-object v0, p3, Ll/᩸ۜᩳ;->ܽ:Landroid/widget/TextView;

    iget-object v1, p1, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v1, Ll/᩷᩻ܽ;

    invoke-interface {v1}, Ll/᩷᩻ܽ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    iget-object p3, p3, Ll/᩸ۜᩳ;->ۧ:Landroid/widget/TextView;

    iget-object p1, p1, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method
