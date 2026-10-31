.class public final Ll/᩹᩸ۡ;
.super Landroid/widget/BaseAdapter;
.source "X53D"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final ᩸:Landroid/content/Context;

.field public final ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ljava/util/ArrayList;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 77
    iput-object p1, p0, Ll/᩹᩸ۡ;->᩸:Landroid/content/Context;

    .line 78
    iput-object p2, p0, Ll/᩹᩸ۡ;->᩹:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 83
    iget-object v0, p0, Ll/᩹᩸ۡ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 88
    iget-object v0, p0, Ll/᩹᩸ۡ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    if-nez p2, :cond_0

    .line 99
    iget-object p2, p0, Ll/᩹᩸ۡ;->᩸:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d01c7

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 100
    :cond_0
    iget-object p3, p0, Ll/᩹᩸ۡ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸᩸ۡ;

    .line 101
    invoke-interface {p1}, Ll/᩸᩸ۡ;->isChecked()Z

    move-result p3

    .line 102
    invoke-interface {p1}, Ll/᩸᩸ۡ;->getName()Ljava/lang/String;

    move-result-object p1

    .line 104
    move-object v0, p2

    check-cast v0, Landroid/widget/CheckedTextView;

    .line 105
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    invoke-virtual {v0}, Landroid/widget/CheckedTextView;->isChecked()Z

    move-result p1

    if-eq p1, p3, :cond_1

    .line 107
    invoke-virtual {v0, p3}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    return-object p2

    .line 110
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->refreshDrawableState()V

    return-object p2
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 116
    check-cast p2, Landroid/widget/CheckedTextView;

    .line 117
    iget-object p1, p0, Ll/᩹᩸ۡ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸᩸ۡ;

    .line 118
    invoke-interface {p1}, Ll/᩸᩸ۡ;->isChecked()Z

    move-result p3

    xor-int/lit8 p3, p3, 0x1

    .line 119
    invoke-virtual {p2, p3}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 120
    invoke-interface {p1, p3}, Ll/᩸᩸ۡ;->setChecked(Z)V

    return-void
.end method
