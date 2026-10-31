.class public final Ll/᩹ۜ;
.super Landroid/widget/BaseAdapter;
.source "85LT"


# instance fields
.field public final ۗ:I

.field public final ۙ:Landroid/view/LayoutInflater;

.field public final ۬:Z

.field public ᩶:Z

.field public ᩸:Ll/ۗۜ;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۗۜ;Landroid/view/LayoutInflater;ZI)V
    .locals 1

    .line 43
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, -0x1

    .line 35
    iput v0, p0, Ll/᩹ۜ;->᩹:I

    .line 44
    iput-boolean p3, p0, Ll/᩹ۜ;->۬:Z

    .line 45
    iput-object p2, p0, Ll/᩹ۜ;->ۙ:Landroid/view/LayoutInflater;

    .line 46
    iput-object p1, p0, Ll/᩹ۜ;->᩸:Ll/ۗۜ;

    .line 47
    iput p4, p0, Ll/᩹ۜ;->ۗ:I

    .line 48
    invoke-virtual {p0}, Ll/᩹ۜ;->֫()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 2

    .line 61
    iget-boolean v0, p0, Ll/᩹ۜ;->۬:Z

    iget-object v1, p0, Ll/᩹ۜ;->᩸:Ll/ۗۜ;

    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {v1}, Ll/ۗۜ;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/ۗۜ;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v0

    .line 63
    :goto_0
    iget v1, p0, Ll/᩹ۜ;->᩹:I

    if-gez v1, :cond_1

    .line 64
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    .line 66
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Ll/᩹ۜ;->getItem(I)Ll/ۛۜ;

    move-result-object p1

    return-object p1
.end method

.method public final getItem(I)Ll/ۛۜ;
    .locals 2

    .line 75
    iget-boolean v0, p0, Ll/᩹ۜ;->۬:Z

    iget-object v1, p0, Ll/᩹ۜ;->᩸:Ll/ۗۜ;

    if-eqz v0, :cond_0

    .line 76
    invoke-virtual {v1}, Ll/ۗۜ;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/ۗۜ;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v0

    .line 77
    :goto_0
    iget v1, p0, Ll/᩹ۜ;->᩹:I

    if-ltz v1, :cond_1

    if-lt p1, v1, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 80
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛۜ;

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 93
    iget-object p2, p0, Ll/᩹ۜ;->ۙ:Landroid/view/LayoutInflater;

    iget v1, p0, Ll/᩹ۜ;->ۗ:I

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 96
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩹ۜ;->getItem(I)Ll/ۛۜ;

    move-result-object p3

    invoke-virtual {p3}, Ll/ۛۜ;->getGroupId()I

    move-result p3

    add-int/lit8 v1, p1, -0x1

    if-ltz v1, :cond_1

    .line 98
    invoke-virtual {p0, v1}, Ll/᩹ۜ;->getItem(I)Ll/ۛۜ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۜ;->getGroupId()I

    move-result v1

    goto :goto_0

    :cond_1
    move v1, p3

    .line 100
    :goto_0
    move-object v2, p2

    check-cast v2, Ll/۠ۜ;

    iget-object v3, p0, Ll/᩹ۜ;->᩸:Ll/ۗۜ;

    .line 101
    invoke-virtual {v3}, Ll/ۗۜ;->isGroupDividerEnabled()Z

    move-result v3

    if-eqz v3, :cond_2

    if-eq p3, v1, :cond_2

    const/4 p3, 0x1

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    :goto_1
    invoke-virtual {v2, p3}, Ll/۠ۜ;->֫(Z)V

    .line 104
    move-object p3, p2

    check-cast p3, Ll/᩻᩷;

    .line 105
    iget-boolean v1, p0, Ll/᩹ۜ;->᩶:Z

    if-eqz v1, :cond_3

    .line 106
    invoke-virtual {v2}, Ll/۠ۜ;->֫()V

    .line 108
    :cond_3
    invoke-virtual {p0, p1}, Ll/᩹ۜ;->getItem(I)Ll/ۛۜ;

    move-result-object p1

    invoke-interface {p3, p1, v0}, Ll/᩻᩷;->initialize(Ll/ۛۜ;I)V

    return-object p2
.end method

.method public final notifyDataSetChanged()V
    .locals 0

    .line 130
    invoke-virtual {p0}, Ll/᩹ۜ;->֫()V

    .line 131
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final ֫()V
    .locals 5

    .line 113
    iget-object v0, p0, Ll/᩹ۜ;->᩸:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->getExpandedItem()Ll/ۛۜ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 115
    invoke-virtual {v0}, Ll/ۗۜ;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 118
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۜ;

    if-ne v4, v1, :cond_0

    .line 120
    iput v3, p0, Ll/᩹ۜ;->᩹:I

    return-void

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    .line 125
    iput v0, p0, Ll/᩹ۜ;->᩹:I

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 56
    iput-boolean p1, p0, Ll/᩹ۜ;->᩶:Z

    return-void
.end method

.method public final ۧ()Ll/ۗۜ;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/᩹ۜ;->᩸:Ll/ۗۜ;

    return-object v0
.end method
