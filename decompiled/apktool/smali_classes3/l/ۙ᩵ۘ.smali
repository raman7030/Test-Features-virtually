.class public abstract Ll/ۙ᩵ۘ;
.super Landroid/widget/BaseAdapter;
.source "64UN"

# interfaces
.implements Landroid/widget/SectionIndexer;
.implements Ll/ۛ᩵ۘ;


# instance fields
.field public final ᩸:Landroid/widget/BaseAdapter;

.field public ᩹:Ll/ۤ᩵ۘ;


# direct methods
.method public constructor <init>(Landroid/widget/BaseAdapter;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 61
    iput-object p1, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    return-void
.end method


# virtual methods
.method public final areAllItemsEnabled()Z
    .locals 1

    .line 132
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->areAllItemsEnabled()Z

    move-result v0

    return v0
.end method

.method public final getCount()I
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    return v0
.end method

.method public final getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, p1, p2, p3}, Landroid/widget/BaseAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    .line 121
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    .line 143
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/BaseAdapter;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public final getPositionForSection(I)I
    .locals 2

    .line 198
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    instance-of v1, v0, Landroid/widget/SectionIndexer;

    if-eqz v1, :cond_0

    .line 199
    check-cast v0, Landroid/widget/SectionIndexer;

    invoke-interface {v0, p1}, Landroid/widget/SectionIndexer;->getPositionForSection(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getSectionForPosition(I)I
    .locals 2

    .line 207
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    instance-of v1, v0, Landroid/widget/SectionIndexer;

    if-eqz v1, :cond_0

    .line 208
    check-cast v0, Landroid/widget/SectionIndexer;

    invoke-interface {v0, p1}, Landroid/widget/SectionIndexer;->getSectionForPosition(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getSections()[Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 217
    iget-object v1, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    instance-of v2, v1, Landroid/widget/SectionIndexer;

    if-eqz v2, :cond_0

    .line 218
    check-cast v1, Landroid/widget/SectionIndexer;

    invoke-interface {v1}, Landroid/widget/SectionIndexer;->getSections()[Ljava/lang/Object;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-interface {v0, p1, p2, p3}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final getViewTypeCount()I
    .locals 1

    .line 148
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->getViewTypeCount()I

    move-result v0

    return v0
.end method

.method public final hasStableIds()Z
    .locals 1

    .line 153
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->hasStableIds()Z

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 158
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final isEnabled(I)Z
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/BaseAdapter;->isEnabled(I)Z

    move-result p1

    return p1
.end method

.method public final notifyDataSetChanged()V
    .locals 1

    .line 168
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final notifyDataSetInvalidated()V
    .locals 1

    .line 182
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void
.end method

.method public final registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .line 187
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/BaseAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    return-void
.end method

.method public final unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .line 192
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/BaseAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    return-void
.end method

.method public final ֫()Landroid/widget/BaseAdapter;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    return-object v0
.end method

.method public final ֫(Landroid/widget/AbsListView;)V
    .locals 1

    .line 85
    new-instance v0, Ll/ۤ᩵ۘ;

    invoke-direct {v0, p1}, Ll/ۤ᩵ۘ;-><init>(Landroid/widget/AbsListView;)V

    invoke-virtual {p0, v0}, Ll/ۙ᩵ۘ;->֫(Ll/ۤ᩵ۘ;)V

    return-void
.end method

.method public ֫(Ll/ۤ᩵ۘ;)V
    .locals 2

    .line 102
    iput-object p1, p0, Ll/ۙ᩵ۘ;->᩹:Ll/ۤ᩵ۘ;

    .line 104
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩸:Landroid/widget/BaseAdapter;

    instance-of v1, v0, Ll/ۛ᩵ۘ;

    if-eqz v1, :cond_0

    .line 105
    check-cast v0, Ll/ۛ᩵ۘ;

    invoke-interface {v0, p1}, Ll/ۛ᩵ۘ;->֫(Ll/ۤ᩵ۘ;)V

    :cond_0
    return-void
.end method

.method public final ۧ()Ll/ۤ᩵ۘ;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ۙ᩵ۘ;->᩹:Ll/ۤ᩵ۘ;

    return-object v0
.end method
