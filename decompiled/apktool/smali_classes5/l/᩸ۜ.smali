.class public final Ll/᩸ۜ;
.super Ljava/lang/Object;
.source "85OU"

# interfaces
.implements Ll/ܳ᩷;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public ۗ:Ll/ۗۜ;

.field public ۙ:Landroid/view/LayoutInflater;

.field public ۬:Ll/֨ۜ;

.field public ᩶:Landroid/content/Context;

.field public ᩸:Ll/ܶۜ;

.field public ᩹:Ll/ܿ᩷;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Ll/᩸ۜ;->᩶:Landroid/content/Context;

    .line 72
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ۜ;->ۙ:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public final collapseItemActionView(Ll/ۗۜ;Ll/ۛۜ;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final expandItemActionView(Ll/ۗۜ;Ll/ۛۜ;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final flagActionItems()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final initForMenu(Landroid/content/Context;Ll/ۗۜ;)V
    .locals 1

    .line 90
    iget-object v0, p0, Ll/᩸ۜ;->᩶:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 91
    iput-object p1, p0, Ll/᩸ۜ;->᩶:Landroid/content/Context;

    .line 92
    iget-object v0, p0, Ll/᩸ۜ;->ۙ:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    .line 93
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ۜ;->ۙ:Landroid/view/LayoutInflater;

    .line 96
    :cond_0
    iput-object p2, p0, Ll/᩸ۜ;->ۗ:Ll/ۗۜ;

    .line 97
    iget-object p1, p0, Ll/᩸ۜ;->᩸:Ll/ܶۜ;

    if-eqz p1, :cond_1

    .line 98
    invoke-virtual {p1}, Ll/ܶۜ;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public final onCloseMenu(Ll/ۗۜ;Z)V
    .locals 1

    .line 154
    iget-object v0, p0, Ll/᩸ۜ;->᩹:Ll/ܿ᩷;

    if-eqz v0, :cond_0

    .line 155
    invoke-interface {v0, p1, p2}, Ll/ܿ᩷;->onCloseMenu(Ll/ۗۜ;Z)V

    :cond_0
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 172
    iget-object p1, p0, Ll/᩸ۜ;->ۗ:Ll/ۗۜ;

    iget-object p2, p0, Ll/᩸ۜ;->᩸:Ll/ܶۜ;

    invoke-virtual {p2, p3}, Ll/ܶۜ;->getItem(I)Ll/ۛۜ;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Ll/ۗۜ;->performItemAction(Landroid/view/MenuItem;Ll/ܳ᩷;I)Z

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 228
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "android:menu:list"

    .line 200
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 202
    iget-object v0, p0, Ll/᩸ۜ;->۬:Ll/֨ۜ;

    invoke-virtual {v0, p1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :cond_0
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 217
    iget-object v0, p0, Ll/᩸ۜ;->۬:Ll/֨ۜ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 221
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 191
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 192
    iget-object v2, p0, Ll/᩸ۜ;->۬:Ll/֨ۜ;

    if-eqz v2, :cond_1

    .line 193
    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    :cond_1
    const-string v2, "android:menu:list"

    .line 195
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    return-object v0
.end method

.method public final onSubMenuSelected(Ll/᩵᩷;)Z
    .locals 1

    .line 142
    invoke-virtual {p1}, Ll/ۗۜ;->hasVisibleItems()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 145
    :cond_0
    new-instance v0, Ll/۫ۜ;

    invoke-direct {v0, p1}, Ll/۫ۜ;-><init>(Ll/᩵᩷;)V

    invoke-virtual {v0}, Ll/۫ۜ;->֫()V

    .line 146
    iget-object v0, p0, Ll/᩸ۜ;->᩹:Ll/ܿ᩷;

    if-eqz v0, :cond_1

    .line 147
    invoke-interface {v0, p1}, Ll/ܿ᩷;->֫(Ll/ۗۜ;)Z

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final setCallback(Ll/ܿ᩷;)V
    .locals 0

    .line 137
    iput-object p1, p0, Ll/᩸ۜ;->᩹:Ll/ܿ᩷;

    return-void
.end method

.method public final updateMenuView(Z)V
    .locals 0

    .line 132
    iget-object p1, p0, Ll/᩸ۜ;->᩸:Ll/ܶۜ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/ܶۜ;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final ֫()Landroid/widget/ListAdapter;
    .locals 1

    .line 124
    iget-object v0, p0, Ll/᩸ۜ;->᩸:Ll/ܶۜ;

    if-nez v0, :cond_0

    .line 125
    new-instance v0, Ll/ܶۜ;

    invoke-direct {v0, p0}, Ll/ܶۜ;-><init>(Ll/᩸ۜ;)V

    iput-object v0, p0, Ll/᩸ۜ;->᩸:Ll/ܶۜ;

    .line 127
    :cond_0
    iget-object v0, p0, Ll/᩸ۜ;->᩸:Ll/ܶۜ;

    return-object v0
.end method

.method public final ֫(Landroid/view/ViewGroup;)Ll/ۜ᩷;
    .locals 3

    .line 104
    iget-object v0, p0, Ll/᩸ۜ;->۬:Ll/֨ۜ;

    if-nez v0, :cond_1

    .line 105
    iget-object v0, p0, Ll/᩸ۜ;->ۙ:Landroid/view/LayoutInflater;

    const v1, 0x7f0d000d

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/֨ۜ;

    iput-object p1, p0, Ll/᩸ۜ;->۬:Ll/֨ۜ;

    .line 107
    iget-object p1, p0, Ll/᩸ۜ;->᩸:Ll/ܶۜ;

    if-nez p1, :cond_0

    .line 108
    new-instance p1, Ll/ܶۜ;

    invoke-direct {p1, p0}, Ll/ܶۜ;-><init>(Ll/᩸ۜ;)V

    iput-object p1, p0, Ll/᩸ۜ;->᩸:Ll/ܶۜ;

    .line 110
    :cond_0
    iget-object p1, p0, Ll/᩸ۜ;->۬:Ll/֨ۜ;

    iget-object v0, p0, Ll/᩸ۜ;->᩸:Ll/ܶۜ;

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 111
    iget-object p1, p0, Ll/᩸ۜ;->۬:Ll/֨ۜ;

    invoke-virtual {p1, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 113
    :cond_1
    iget-object p1, p0, Ll/᩸ۜ;->۬:Ll/֨ۜ;

    return-object p1
.end method
