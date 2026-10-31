.class public final Ll/ۖ᩷;
.super Ll/ۧ᩷;
.source "C4MC"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final ֫֫:I

.field public ۗ:I

.field public final ۙ:Landroid/view/View$OnAttachStateChangeListener;

.field public ۛ:Z

.field public final ۟:Ll/֡ۖ;

.field public final ۤ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public final ۧ֫:I

.field public final ۨ:Ll/ۗۜ;

.field public ۫:I

.field public final ۬:Landroid/content/Context;

.field public final ܰ:Z

.field public ܳ֫:Landroid/view/ViewTreeObserver;

.field public ܽ֫:Ll/ܿ᩷;

.field public ܿ֫:Landroid/view/View;

.field public ᩳ֫:Z

.field public ᩶:Landroid/view/View;

.field public final ᩹:Ll/᩹ۜ;

.field public ᩺:Landroid/widget/PopupWindow$OnDismissListener;

.field public ᩻֫:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ۗۜ;Landroid/view/View;IZ)V
    .locals 4

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ll/ۡ᩷;

    invoke-direct {v0, p0}, Ll/ۡ᩷;-><init>(Ll/ۖ᩷;)V

    iput-object v0, p0, Ll/ۖ᩷;->ۤ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 78
    new-instance v0, Ll/ܺ᩷;

    invoke-direct {v0, p0}, Ll/ܺ᩷;-><init>(Ll/ۖ᩷;)V

    iput-object v0, p0, Ll/ۖ᩷;->ۙ:Landroid/view/View$OnAttachStateChangeListener;

    const/4 v0, 0x0

    .line 111
    iput v0, p0, Ll/ۖ᩷;->۫:I

    .line 117
    iput-object p1, p0, Ll/ۖ᩷;->۬:Landroid/content/Context;

    .line 118
    iput-object p2, p0, Ll/ۖ᩷;->ۨ:Ll/ۗۜ;

    .line 119
    iput-boolean p5, p0, Ll/ۖ᩷;->ܰ:Z

    .line 120
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 121
    new-instance v2, Ll/᩹ۜ;

    const v3, 0x7f0d0013

    invoke-direct {v2, p2, v1, p5, v3}, Ll/᩹ۜ;-><init>(Ll/ۗۜ;Landroid/view/LayoutInflater;ZI)V

    iput-object v2, p0, Ll/ۖ᩷;->᩹:Ll/᩹ۜ;

    .line 122
    iput p4, p0, Ll/ۖ᩷;->ۧ֫:I

    .line 125
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p5

    .line 126
    invoke-virtual {p5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    const v2, 0x7f070017

    .line 127
    invoke-virtual {p5, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p5

    .line 126
    invoke-static {v1, p5}, Ljava/lang/Math;->max(II)I

    move-result p5

    iput p5, p0, Ll/ۖ᩷;->֫֫:I

    .line 129
    iput-object p3, p0, Ll/ۖ᩷;->᩶:Landroid/view/View;

    .line 131
    new-instance p3, Ll/֡ۖ;

    const/4 p5, 0x0

    .line 75
    invoke-direct {p3, p1, p5, p4, v0}, Ll/ۢۖ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 131
    iput-object p3, p0, Ll/ۖ᩷;->۟:Ll/֡ۖ;

    .line 134
    invoke-virtual {p2, p0, p1}, Ll/ۗۜ;->addMenuPresenter(Ll/ܳ᩷;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final dismiss()V
    .locals 1

    .line 214
    invoke-virtual {p0}, Ll/ۖ᩷;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    iget-object v0, p0, Ll/ۖ᩷;->۟:Ll/֡ۖ;

    invoke-virtual {v0}, Ll/ۢۖ;->dismiss()V

    :cond_0
    return-void
.end method

.method public final flagActionItems()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isShowing()Z
    .locals 1

    .line 226
    iget-boolean v0, p0, Ll/ۖ᩷;->᩻֫:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۖ᩷;->۟:Ll/֡ۖ;

    invoke-virtual {v0}, Ll/ۢۖ;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onCloseMenu(Ll/ۗۜ;Z)V
    .locals 1

    .line 300
    iget-object v0, p0, Ll/ۖ᩷;->ۨ:Ll/ۗۜ;

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 302
    :cond_0
    invoke-virtual {p0}, Ll/ۖ᩷;->dismiss()V

    .line 303
    iget-object v0, p0, Ll/ۖ᩷;->ܽ֫:Ll/ܿ᩷;

    if-eqz v0, :cond_1

    .line 304
    invoke-interface {v0, p1, p2}, Ll/ܿ᩷;->onCloseMenu(Ll/ۗۜ;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onDismiss()V
    .locals 2

    const/4 v0, 0x1

    .line 231
    iput-boolean v0, p0, Ll/ۖ᩷;->᩻֫:Z

    .line 232
    iget-object v0, p0, Ll/ۖ᩷;->ۨ:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->close()V

    .line 234
    iget-object v0, p0, Ll/ۖ᩷;->ܳ֫:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    .line 235
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۖ᩷;->ܿ֫:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Ll/ۖ᩷;->ܳ֫:Landroid/view/ViewTreeObserver;

    .line 236
    :cond_0
    iget-object v0, p0, Ll/ۖ᩷;->ܳ֫:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Ll/ۖ᩷;->ۤ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    .line 237
    iput-object v0, p0, Ll/ۖ᩷;->ܳ֫:Landroid/view/ViewTreeObserver;

    .line 239
    :cond_1
    iget-object v0, p0, Ll/ۖ᩷;->ܿ֫:Landroid/view/View;

    iget-object v1, p0, Ll/ۖ᩷;->ۙ:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 241
    iget-object v0, p0, Ll/ۖ᩷;->᩺:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_2

    .line 242
    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 329
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/16 p1, 0x52

    if-ne p2, p1, :cond_0

    .line 330
    invoke-virtual {p0}, Ll/ۖ᩷;->dismiss()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 0

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final onSubMenuSelected(Ll/᩵᩷;)Z
    .locals 9

    .line 262
    invoke-virtual {p1}, Ll/ۗۜ;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 263
    new-instance v0, Ll/ᩳ᩷;

    iget-object v5, p0, Ll/ۖ᩷;->ܿ֫:Landroid/view/View;

    iget v7, p0, Ll/ۖ᩷;->ۧ֫:I

    const/4 v8, 0x0

    iget-object v3, p0, Ll/ۖ᩷;->۬:Landroid/content/Context;

    iget-boolean v6, p0, Ll/ۖ᩷;->ܰ:Z

    move-object v2, v0

    move-object v4, p1

    invoke-direct/range {v2 .. v8}, Ll/ᩳ᩷;-><init>(Landroid/content/Context;Ll/ۗۜ;Landroid/view/View;ZII)V

    .line 265
    iget-object v2, p0, Ll/ۖ᩷;->ܽ֫:Ll/ܿ᩷;

    invoke-virtual {v0, v2}, Ll/ᩳ᩷;->֫(Ll/ܿ᩷;)V

    .line 203
    invoke-virtual {p1}, Ll/ۗۜ;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v2, :cond_1

    .line 206
    invoke-virtual {p1, v3}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    .line 207
    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 266
    :goto_1
    invoke-virtual {v0, v2}, Ll/ᩳ᩷;->֫(Z)V

    .line 269
    iget-object v2, p0, Ll/ۖ᩷;->᩺:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-virtual {v0, v2}, Ll/ᩳ᩷;->֫(Landroid/widget/PopupWindow$OnDismissListener;)V

    const/4 v2, 0x0

    .line 270
    iput-object v2, p0, Ll/ۖ᩷;->᩺:Landroid/widget/PopupWindow$OnDismissListener;

    .line 273
    iget-object v2, p0, Ll/ۖ᩷;->ۨ:Ll/ۗۜ;

    invoke-virtual {v2, v1}, Ll/ۗۜ;->close(Z)V

    .line 276
    iget-object v2, p0, Ll/ۖ᩷;->۟:Ll/֡ۖ;

    invoke-virtual {v2}, Ll/ۢۖ;->֫()I

    move-result v3

    .line 277
    invoke-virtual {v2}, Ll/ۢۖ;->ܽ()I

    move-result v2

    .line 281
    iget v5, p0, Ll/ۖ᩷;->۫:I

    iget-object v6, p0, Ll/ۖ᩷;->᩶:Landroid/view/View;

    .line 282
    invoke-virtual {v6}, Landroid/view/View;->getLayoutDirection()I

    move-result v6

    .line 281
    invoke-static {v5, v6}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v5

    and-int/lit8 v5, v5, 0x7

    const/4 v6, 0x5

    if-ne v5, v6, :cond_2

    .line 284
    iget-object v5, p0, Ll/ۖ᩷;->᩶:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v5

    add-int/2addr v3, v5

    .line 287
    :cond_2
    invoke-virtual {v0, v3, v2}, Ll/ᩳ᩷;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 288
    iget-object v0, p0, Ll/ۖ᩷;->ܽ֫:Ll/ܿ᩷;

    if-eqz v0, :cond_3

    .line 289
    invoke-interface {v0, p1}, Ll/ܿ᩷;->֫(Ll/ۗۜ;)Z

    :cond_3
    return v4

    :cond_4
    return v1
.end method

.method public final setCallback(Ll/ܿ᩷;)V
    .locals 0

    .line 257
    iput-object p1, p0, Ll/ۖ᩷;->ܽ֫:Ll/ܿ᩷;

    return-void
.end method

.method public final show()V
    .locals 7

    .line 148
    invoke-virtual {p0}, Ll/ۖ᩷;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 152
    :cond_0
    iget-boolean v0, p0, Ll/ۖ᩷;->᩻֫:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/ۖ᩷;->᩶:Landroid/view/View;

    if-eqz v0, :cond_6

    .line 156
    iput-object v0, p0, Ll/ۖ᩷;->ܿ֫:Landroid/view/View;

    .line 158
    iget-object v0, p0, Ll/ۖ᩷;->۟:Ll/֡ۖ;

    invoke-virtual {v0, p0}, Ll/ۢۖ;->֫(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 159
    invoke-virtual {v0, p0}, Ll/ۢۖ;->֫(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 160
    invoke-virtual {v0}, Ll/ۢۖ;->ۖ()V

    .line 162
    iget-object v1, p0, Ll/ۖ᩷;->ܿ֫:Landroid/view/View;

    .line 163
    iget-object v2, p0, Ll/ۖ᩷;->ܳ֫:Landroid/view/ViewTreeObserver;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 164
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v5

    iput-object v5, p0, Ll/ۖ᩷;->ܳ֫:Landroid/view/ViewTreeObserver;

    if-eqz v2, :cond_2

    .line 166
    iget-object v2, p0, Ll/ۖ᩷;->ۤ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v5, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 168
    :cond_2
    iget-object v2, p0, Ll/ۖ᩷;->ۙ:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v1, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 169
    invoke-virtual {v0, v1}, Ll/ۢۖ;->֫(Landroid/view/View;)V

    .line 170
    iget v1, p0, Ll/ۖ᩷;->۫:I

    invoke-virtual {v0, v1}, Ll/ۢۖ;->ܿ(I)V

    .line 172
    iget-boolean v1, p0, Ll/ۖ᩷;->ۛ:Z

    iget-object v2, p0, Ll/ۖ᩷;->۬:Landroid/content/Context;

    iget-object v5, p0, Ll/ۖ᩷;->᩹:Ll/᩹ۜ;

    if-nez v1, :cond_3

    .line 173
    iget v1, p0, Ll/ۖ᩷;->֫֫:I

    invoke-static {v5, v2, v1}, Ll/ۧ᩷;->֫(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Ll/ۖ᩷;->ۗ:I

    .line 174
    iput-boolean v4, p0, Ll/ۖ᩷;->ۛ:Z

    .line 177
    :cond_3
    iget v1, p0, Ll/ۖ᩷;->ۗ:I

    invoke-virtual {v0, v1}, Ll/ۢۖ;->ᩳ(I)V

    .line 178
    invoke-virtual {v0}, Ll/ۢۖ;->ܺ()V

    .line 179
    invoke-virtual {p0}, Ll/ۧ᩷;->֫()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢۖ;->֫(Landroid/graphics/Rect;)V

    .line 180
    invoke-virtual {v0}, Ll/ۢۖ;->show()V

    .line 182
    invoke-virtual {v0}, Ll/ۢۖ;->ᩳ()Landroid/widget/ListView;

    move-result-object v1

    .line 183
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 185
    iget-boolean v4, p0, Ll/ۖ᩷;->ᩳ֫:Z

    if-eqz v4, :cond_5

    iget-object v4, p0, Ll/ۖ᩷;->ۨ:Ll/ۗۜ;

    invoke-virtual {v4}, Ll/ۗۜ;->getHeaderTitle()Ljava/lang/CharSequence;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 187
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v6, 0x7f0d0012

    invoke-virtual {v2, v6, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    const v6, 0x1020016

    .line 189
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_4

    .line 191
    invoke-virtual {v4}, Ll/ۗۜ;->getHeaderTitle()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 193
    :cond_4
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    const/4 v4, 0x0

    .line 194
    invoke-virtual {v1, v2, v4, v3}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 199
    :cond_5
    invoke-virtual {v0, v5}, Ll/ۢۖ;->֫(Landroid/widget/ListAdapter;)V

    .line 200
    invoke-virtual {v0}, Ll/ۢۖ;->show()V

    return-void

    .line 208
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "StandardMenuPopup cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final updateMenuView(Z)V
    .locals 0

    const/4 p1, 0x0

    .line 248
    iput-boolean p1, p0, Ll/ۖ᩷;->ۛ:Z

    .line 250
    iget-object p1, p0, Ll/ۖ᩷;->᩹:Ll/᩹ۜ;

    if-eqz p1, :cond_0

    .line 251
    invoke-virtual {p1}, Ll/᩹ۜ;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 144
    iput p1, p0, Ll/ۖ᩷;->۫:I

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 0

    .line 324
    iput-object p1, p0, Ll/ۖ᩷;->᩶:Landroid/view/View;

    return-void
.end method

.method public final ֫(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 338
    iput-object p1, p0, Ll/ۖ᩷;->᩺:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final ֫(Ll/ۗۜ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۖ᩷;->᩹:Ll/᩹ۜ;

    invoke-virtual {v0, p1}, Ll/᩹ۜ;->֫(Z)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 349
    iget-object v0, p0, Ll/ۖ᩷;->۟:Ll/֡ۖ;

    invoke-virtual {v0, p1}, Ll/ۢۖ;->֫(I)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 359
    iput-boolean p1, p0, Ll/ۖ᩷;->ᩳ֫:Z

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    .line 354
    iget-object v0, p0, Ll/ۖ᩷;->۟:Ll/֡ۖ;

    invoke-virtual {v0, p1}, Ll/ۢۖ;->ۧ(I)V

    return-void
.end method

.method public final ᩳ()Landroid/widget/ListView;
    .locals 1

    .line 343
    iget-object v0, p0, Ll/ۖ᩷;->۟:Ll/֡ۖ;

    invoke-virtual {v0}, Ll/ۢۖ;->ᩳ()Landroid/widget/ListView;

    move-result-object v0

    return-object v0
.end method
