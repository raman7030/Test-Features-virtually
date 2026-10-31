.class public final Ll/᩸ۡ;
.super Ll/ۢۖ;
.source "N5WL"

# interfaces
.implements Ll/ۙۡ;


# instance fields
.field public ֡֫:Landroid/widget/ListAdapter;

.field public ֨֫:I

.field public ۚ֫:Ljava/lang/CharSequence;

.field public final ۠֫:Landroid/graphics/Rect;

.field public final synthetic ܶ֫:Ll/ۗۡ;


# direct methods
.method public constructor <init>(Ll/ۗۡ;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 954
    iput-object p1, p0, Ll/᩸ۡ;->ܶ֫:Ll/ۗۡ;

    .line 955
    invoke-direct {p0, p2, p3, p4}, Ll/ۢۖ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 951
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Ll/᩸ۡ;->۠֫:Landroid/graphics/Rect;

    .line 957
    invoke-virtual {p0, p1}, Ll/ۢۖ;->֫(Landroid/view/View;)V

    .line 958
    invoke-virtual {p0}, Ll/ۢۖ;->ۖ()V

    .line 961
    new-instance p1, Ll/֨ۡ;

    invoke-direct {p1, p0}, Ll/֨ۡ;-><init>(Ll/᩸ۡ;)V

    invoke-virtual {p0, p1}, Ll/ۢۖ;->֫(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 4

    .line 859
    iget-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    .line 1033
    invoke-virtual {p0}, Ll/᩸ۡ;->ᩴ()V

    .line 1035
    invoke-virtual {p0}, Ll/ۢۖ;->ܺ()V

    .line 1036
    invoke-virtual {p0}, Ll/ۢۖ;->show()V

    .line 945
    iget-object v2, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    const/4 v3, 0x1

    .line 1038
    invoke-virtual {v2, v3}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 1039
    invoke-virtual {v2, p1}, Landroid/view/View;->setTextDirection(I)V

    .line 1040
    invoke-virtual {v2, p2}, Landroid/view/View;->setTextAlignment(I)V

    .line 1041
    iget-object p1, p0, Ll/᩸ۡ;->ܶ֫:Ll/ۗۡ;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p2

    .line 829
    iget-object v2, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    .line 859
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    .line 831
    invoke-virtual {v2, v0}, Ll/۫ܺ;->֫(Z)V

    .line 832
    invoke-virtual {v2, p2}, Ll/ۢۢۡ;->setSelection(I)V

    .line 834
    invoke-virtual {v2}, Landroid/widget/AbsListView;->getChoiceMode()I

    move-result v0

    if-eqz v0, :cond_0

    .line 835
    invoke-virtual {v2, p2, v3}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    :cond_0
    if-eqz v1, :cond_1

    goto :goto_0

    .line 1052
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 1054
    new-instance p2, Ll/۠ۡ;

    invoke-direct {p2, p0}, Ll/۠ۡ;-><init>(Ll/᩸ۡ;)V

    .line 1069
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 1070
    new-instance p1, Ll/ܶۡ;

    invoke-direct {p1, p0, p2}, Ll/ܶۡ;-><init>(Ll/᩸ۡ;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0, p1}, Ll/ۢۖ;->֫(Landroid/widget/PopupWindow$OnDismissListener;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(Landroid/widget/ListAdapter;)V
    .locals 0

    .line 976
    invoke-super {p0, p1}, Ll/ۢۖ;->֫(Landroid/widget/ListAdapter;)V

    .line 977
    iput-object p1, p0, Ll/᩸ۡ;->֡֫:Landroid/widget/ListAdapter;

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 0

    .line 988
    iput-object p1, p0, Ll/᩸ۡ;->ۚ֫:Ljava/lang/CharSequence;

    return-void
.end method

.method public final ۧ()Ljava/lang/CharSequence;
    .locals 1

    .line 982
    iget-object v0, p0, Ll/᩸ۡ;->ۚ֫:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ۧ(Landroid/view/View;)Z
    .locals 1

    .line 1086
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩸ۡ;->۠֫:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(I)V
    .locals 0

    .line 1091
    iput p1, p0, Ll/᩸ۡ;->֨֫:I

    return-void
.end method

.method public final ᩴ()V
    .locals 10

    .line 992
    iget-object v0, p0, Ll/᩸ۡ;->ܶ֫:Ll/ۗۡ;

    iget-object v1, v0, Ll/ۗۡ;->ۤ:Landroid/graphics/Rect;

    .line 422
    iget-object v2, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    .line 995
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 996
    sget v3, Ll/᩹ᩴ;->֫:I

    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    if-ne v3, v4, :cond_0

    .line 996
    iget v3, v1, Landroid/graphics/Rect;->right:I

    goto :goto_0

    .line 997
    :cond_0
    iget v3, v1, Landroid/graphics/Rect;->left:I

    neg-int v3, v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 999
    iput v3, v1, Landroid/graphics/Rect;->right:I

    iput v3, v1, Landroid/graphics/Rect;->left:I

    .line 1002
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    .line 1003
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    .line 1004
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v7

    .line 1005
    iget v8, v0, Ll/ۗۡ;->᩹:I

    const/4 v9, -0x2

    if-ne v8, v9, :cond_3

    .line 1006
    iget-object v8, p0, Ll/᩸ۡ;->֡֫:Landroid/widget/ListAdapter;

    check-cast v8, Landroid/widget/SpinnerAdapter;

    .line 422
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1006
    invoke-virtual {v0, v8, v2}, Ll/ۗۡ;->֫(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v2

    .line 1008
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    .line 1009
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v9, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v8, v9

    iget v1, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v8, v1

    if-le v2, v8, :cond_2

    move v2, v8

    :cond_2
    sub-int v1, v7, v5

    sub-int/2addr v1, v6

    .line 1013
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {p0, v1}, Ll/ۢۖ;->ᩳ(I)V

    goto :goto_1

    :cond_3
    const/4 v1, -0x1

    if-ne v8, v1, :cond_4

    sub-int v1, v7, v5

    sub-int/2addr v1, v6

    .line 1016
    invoke-virtual {p0, v1}, Ll/ۢۖ;->ᩳ(I)V

    goto :goto_1

    .line 1018
    :cond_4
    invoke-virtual {p0, v8}, Ll/ۢۖ;->ᩳ(I)V

    .line 1020
    :goto_1
    sget v1, Ll/᩹ᩴ;->֫:I

    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    if-ne v0, v4, :cond_5

    sub-int/2addr v7, v6

    .line 1021
    invoke-virtual {p0}, Ll/ۢۖ;->᩷()I

    move-result v0

    sub-int/2addr v7, v0

    .line 1096
    iget v0, p0, Ll/᩸ۡ;->֨֫:I

    sub-int/2addr v7, v0

    add-int/2addr v7, v3

    goto :goto_2

    :cond_5
    iget v0, p0, Ll/᩸ۡ;->֨֫:I

    add-int/2addr v5, v0

    add-int v7, v5, v3

    .line 1026
    :goto_2
    invoke-virtual {p0, v7}, Ll/ۢۖ;->֫(I)V

    return-void
.end method
