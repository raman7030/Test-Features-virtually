.class public final Ll/ᩳᩳܿ;
.super Ljava/lang/Object;
.source "R16R"


# instance fields
.field public ֫:Ll/ۧᩳܿ;

.field public ۜ:Landroid/widget/PopupWindow;

.field public ۧ:I

.field public ܳ:Ll/ۨܽܿ;

.field public ܽ:Ll/ܽᩳܿ;

.field public ܿ:I

.field public ᩳ:Landroid/text/TextUtils$TruncateAt;

.field public ᩷:Landroid/graphics/RectF;

.field public ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ᩳᩳܿ;->᩷:Landroid/graphics/RectF;

    .line 67
    new-instance v0, Landroid/widget/PopupWindow;

    invoke-direct {v0, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/ᩳᩳܿ;->ۜ:Landroid/widget/PopupWindow;

    .line 68
    new-instance v1, Ll/ܽᩳܿ;

    invoke-direct {v1, v0}, Ll/ܽᩳܿ;-><init>(Landroid/widget/PopupWindow;)V

    iput-object v1, p0, Ll/ᩳᩳܿ;->ܽ:Ll/ܽᩳܿ;

    const v1, 0x7f080059

    .line 69
    invoke-static {p1, v1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 71
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 72
    invoke-virtual {v1, p2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 73
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 74
    invoke-virtual {v1, p2}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 75
    iget v2, p2, Landroid/graphics/Rect;->top:I

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, p2

    iput v2, p0, Ll/ᩳᩳܿ;->ۧ:I

    .line 77
    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 p2, 0x0

    .line 78
    invoke-virtual {v0, p2}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    const/4 v1, 0x1

    .line 79
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 80
    invoke-virtual {v0, p2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 81
    new-instance v1, Ll/ۧᩳܿ;

    invoke-direct {v1, p0, p1}, Ll/ۧᩳܿ;-><init>(Ll/ᩳᩳܿ;Landroid/content/Context;)V

    iput-object v1, p0, Ll/ᩳᩳܿ;->֫:Ll/ۧᩳܿ;

    .line 82
    new-instance v2, Ll/ۨܽܿ;

    .line 9
    invoke-direct {v2, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 82
    iput-object v2, p0, Ll/ᩳᩳܿ;->ܳ:Ll/ۨܽܿ;

    .line 83
    invoke-virtual {v2, v1}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 85
    new-instance p1, Ll/֫ᩳܿ;

    invoke-direct {p1, p0}, Ll/֫ᩳܿ;-><init>(Ll/ᩳᩳܿ;)V

    invoke-virtual {v2, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 86
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 95
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d014d

    invoke-virtual {p1, v0, v2, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 96
    invoke-virtual {p1, p2, p2}, Landroid/view/View;->measure(II)V

    .line 97
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    invoke-virtual {v2}, Landroid/widget/ListView;->getDividerHeight()I

    move-result p2

    add-int/2addr p2, p1

    .line 87
    iput p2, p0, Ll/ᩳᩳܿ;->ܿ:I

    return-void
.end method

.method private ֫(Ll/۫ۨᩳ;)V
    .locals 2

    .line 202
    invoke-static {p1}, Ll/ܿ᩺;->᩷(Landroid/view/View;)Ll/᩸ܰ;

    move-result-object p1

    .line 203
    iget-object v0, p0, Ll/ᩳᩳܿ;->ۜ:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/᩸ܰ;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    .line 204
    invoke-virtual {p1, v1}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object p1

    .line 205
    iget v1, p1, Ll/ۧ۬;->֫:I

    if-nez v1, :cond_0

    iget v1, p1, Ll/ۧ۬;->ᩳ:I

    if-nez v1, :cond_0

    iget v1, p1, Ll/ۧ۬;->ۧ:I

    if-nez v1, :cond_0

    iget p1, p1, Ll/ۧ۬;->ܽ:I

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 207
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void

    :cond_0
    const/4 p1, 0x2

    .line 212
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ᩳᩳܿ;)V
    .locals 1

    .line 85
    iget-object p0, p0, Ll/ᩳᩳܿ;->ܳ:Ll/ۨܽܿ;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ᩳᩳܿ;ILl/۫ۨᩳ;IIILandroid/view/View;)V
    .locals 4

    .line 170
    iget-object v0, p0, Ll/ᩳᩳܿ;->᩷:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    int-to-float v1, p1

    add-float/2addr v0, v1

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    int-to-float v1, p3

    sub-float/2addr v0, v1

    float-to-int v0, v0

    const/4 v1, -0x1

    .line 171
    invoke-virtual {p2, v1, v0}, Ll/۫ۨᩳ;->ۢ(II)V

    sub-int/2addr p3, p1

    .line 173
    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۤ()V

    .line 174
    iget-object p1, p0, Ll/ᩳᩳܿ;->ۜ:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, -0x2

    const/high16 v2, 0x42000000    # 32.0f

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    add-int/2addr p4, p5

    add-int/2addr p4, p3

    .line 175
    invoke-virtual {p6}, Landroid/view/View;->getWidth()I

    move-result p0

    invoke-static {v2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    sub-int/2addr p0, p2

    invoke-virtual {p1, v3, p4, p0, v1}, Landroid/widget/PopupWindow;->update(IIII)V

    return-void

    .line 177
    :cond_0
    invoke-direct {p0, p2}, Ll/ᩳᩳܿ;->֫(Ll/۫ۨᩳ;)V

    .line 178
    invoke-virtual {p6}, Landroid/view/View;->getWidth()I

    move-result p0

    invoke-static {v2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p6

    sub-int/2addr p0, p6

    invoke-virtual {p1, p0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 179
    invoke-virtual {p1, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    const p0, 0x7f130149

    .line 180
    invoke-virtual {p1, p0}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    add-int/2addr p4, p5

    add-int/2addr p4, p3

    const/16 p0, 0x31

    .line 181
    invoke-virtual {p1, p2, p0, v3, p4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ᩳᩳܿ;)Landroid/text/TextUtils$TruncateAt;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳᩳܿ;->ᩳ:Landroid/text/TextUtils$TruncateAt;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩳᩳܿ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳᩳܿ;->᩻:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/CharSequence;
    .locals 1

    .line 131
    iget-object v0, p0, Ll/ᩳᩳܿ;->᩻:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    return-object p1
.end method

.method public final ֫()V
    .locals 2

    .line 121
    iget-object v0, p0, Ll/ᩳᩳܿ;->ۜ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Ll/ᩳᩳܿ;->ܽ:Ll/ܽᩳܿ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ᩳᩳܿ;->ܳ:Ll/ۨܽܿ;

    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 1

    .line 135
    iput-object p1, p0, Ll/ᩳᩳܿ;->᩻:Ljava/util/List;

    .line 136
    iget-object p1, p0, Ll/ᩳᩳܿ;->֫:Ll/ۧᩳܿ;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 137
    iget-object p1, p0, Ll/ᩳᩳܿ;->ܳ:Ll/ۨܽܿ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void
.end method

.method public final ֫(Ll/ۚܽܿ;)V
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ᩳᩳܿ;->ܳ:Ll/ۨܽܿ;

    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void
.end method

.method public final ֫(Ll/۫ۨᩳ;I)V
    .locals 11

    .line 141
    iget-object v0, p0, Ll/ᩳᩳܿ;->ܽ:Ll/ܽᩳܿ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 142
    iget-object v0, p0, Ll/ᩳᩳܿ;->᩷:Landroid/graphics/RectF;

    invoke-virtual {p1, v0, p2}, Ll/۫ۨᩳ;->֫(Landroid/graphics/RectF;I)V

    const/4 p2, 0x2

    new-array p2, p2, [I

    .line 149
    invoke-virtual {p1, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v2, 0x1

    .line 150
    aget v9, p2, v2

    .line 151
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v8

    .line 153
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Landroid/view/View;

    .line 154
    invoke-virtual {v10, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 155
    aget p2, p2, v2

    .line 156
    invoke-virtual {v10}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 158
    iget-object v3, p0, Ll/ᩳᩳܿ;->ܳ:Ll/ۨܽܿ;

    invoke-virtual {v3}, Ll/ۨܽܿ;->֫()I

    move-result v3

    if-gtz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    .line 159
    :cond_0
    iget-object v4, p0, Ll/ᩳᩳܿ;->֫:Ll/ۧᩳܿ;

    invoke-virtual {v4}, Ll/ۧᩳܿ;->getCount()I

    move-result v4

    iget v5, p0, Ll/ᩳᩳܿ;->ܿ:I

    mul-int v5, v5, v4

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 161
    :goto_0
    iget v4, p0, Ll/ᩳᩳܿ;->ۧ:I

    add-int v5, v3, v4

    add-int/2addr p2, v2

    sub-int/2addr p2, v9

    sub-int v7, p2, v8

    .line 164
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p2

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v2

    add-int/2addr v2, p2

    int-to-float p2, v2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr p2, v0

    int-to-float v2, v7

    add-float/2addr p2, v2

    int-to-float v2, v5

    cmpg-float p2, p2, v2

    if-gtz p2, :cond_1

    .line 169
    new-instance p2, Ll/۟ܽܿ;

    move-object v3, p2

    move-object v4, p0

    move-object v6, p1

    invoke-direct/range {v3 .. v10}, Ll/۟ܽܿ;-><init>(Ll/ᩳᩳܿ;ILl/۫ۨᩳ;IIILandroid/view/View;)V

    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 185
    :cond_1
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr v0, p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr v0, p2

    float-to-int p2, v0

    .line 186
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۤ()V

    .line 187
    iget-object v0, p0, Ll/ᩳᩳܿ;->ۜ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v2

    const/4 v3, -0x2

    const/high16 v4, 0x42000000    # 32.0f

    if-eqz v2, :cond_2

    add-int/2addr v8, v9

    add-int/2addr v8, p2

    .line 188
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-static {v4}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {v0, v1, v8, p1, v3}, Landroid/widget/PopupWindow;->update(IIII)V

    return-void

    .line 190
    :cond_2
    invoke-direct {p0, p1}, Ll/ᩳᩳܿ;->֫(Ll/۫ۨᩳ;)V

    .line 191
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-static {v4}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v4

    sub-int/2addr v2, v4

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 192
    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setHeight(I)V

    const v2, 0x7f130149

    .line 193
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    add-int/2addr v8, v9

    add-int/2addr v8, p2

    const/16 p2, 0x31

    .line 194
    invoke-virtual {v0, p1, p2, v1, v8}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 91
    iget v0, p0, Ll/ᩳᩳܿ;->ܿ:I

    return v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ᩳᩳܿ;->ܳ:Ll/ۨܽܿ;

    invoke-virtual {v0, p1}, Ll/ۨܽܿ;->֫(I)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ᩳᩳܿ;->᩻:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ܿ()V
    .locals 1

    .line 2
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    .line 113
    iput-object v0, p0, Ll/ᩳᩳܿ;->ᩳ:Landroid/text/TextUtils$TruncateAt;

    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ᩳᩳܿ;->ۜ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    return v0
.end method
