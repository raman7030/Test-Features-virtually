.class public final Ll/᩶᩸ۡ;
.super Landroid/widget/BaseAdapter;
.source "X53D"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final ᩶:[Ljava/lang/CharSequence;

.field public final ᩸:[Z

.field public final ᩹:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;[Z[Ljava/lang/CharSequence;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 31
    iput-object p1, p0, Ll/᩶᩸ۡ;->᩹:Landroid/content/Context;

    .line 32
    iput-object p2, p0, Ll/᩶᩸ۡ;->᩸:[Z

    .line 33
    iput-object p3, p0, Ll/᩶᩸ۡ;->᩶:[Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 38
    iget-object v0, p0, Ll/᩶᩸ۡ;->᩸:[Z

    array-length v0, v0

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
    .locals 2

    if-nez p2, :cond_0

    .line 54
    iget-object p2, p0, Ll/᩶᩸ۡ;->᩹:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d01c7

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 55
    :cond_0
    move-object p3, p2

    check-cast p3, Landroid/widget/CheckedTextView;

    .line 56
    iget-object v0, p0, Ll/᩶᩸ۡ;->᩶:[Ljava/lang/CharSequence;

    aget-object v0, v0, p1

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    invoke-virtual {p3}, Landroid/widget/CheckedTextView;->isChecked()Z

    move-result v0

    iget-object v1, p0, Ll/᩶᩸ۡ;->᩸:[Z

    aget-boolean p1, v1, p1

    if-eq v0, p1, :cond_1

    .line 58
    invoke-virtual {p3, p1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    return-object p2

    .line 61
    :cond_1
    invoke-virtual {p3}, Landroid/view/View;->refreshDrawableState()V

    return-object p2
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 67
    check-cast p2, Landroid/widget/CheckedTextView;

    .line 68
    iget-object p1, p0, Ll/᩶᩸ۡ;->᩸:[Z

    aget-boolean p4, p1, p3

    xor-int/lit8 p4, p4, 0x1

    aput-boolean p4, p1, p3

    invoke-virtual {p2, p4}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    return-void
.end method
