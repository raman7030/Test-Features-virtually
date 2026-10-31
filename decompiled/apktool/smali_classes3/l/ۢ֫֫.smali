.class public final Ll/ۢ֫֫;
.super Ll/۟۟;
.source "O5GK"


# instance fields
.field public final ܿ֫:Landroid/widget/ListView;


# direct methods
.method public constructor <init>(Landroid/widget/ListView;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Ll/۟۟;-><init>(Landroid/view/View;)V

    .line 35
    iput-object p1, p0, Ll/ۢ֫֫;->ܿ֫:Landroid/widget/ListView;

    return-void
.end method


# virtual methods
.method public final ֫(I)Z
    .locals 7

    .line 52
    iget-object v0, p0, Ll/ۢ֫֫;->ܿ֫:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 57
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    .line 58
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v4

    add-int v5, v4, v3

    const/4 v6, 0x1

    if-lez p1, :cond_1

    if-lt v5, v1, :cond_2

    sub-int/2addr v3, v6

    .line 64
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    .line 65
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-gt p1, v0, :cond_2

    return v2

    :cond_1
    if-gez p1, :cond_3

    if-gtz v4, :cond_2

    .line 72
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    if-ltz p1, :cond_2

    return v2

    :cond_2
    return v6

    :cond_3
    return v2
.end method

.method public final ۧ(I)V
    .locals 1

    .line 40
    iget-object v0, p0, Ll/ۢ֫֫;->ܿ֫:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/AbsListView;->scrollListBy(I)V

    return-void
.end method
