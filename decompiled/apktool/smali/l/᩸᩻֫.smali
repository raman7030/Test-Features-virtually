.class public final Ll/᩸᩻֫;
.super Landroid/widget/FrameLayout;
.source "C1GQ"


# instance fields
.field public final ۙ:Ljava/util/ArrayList;

.field public ᩶:Z

.field public ᩸:Landroid/view/View$OnApplyWindowInsetsListener;

.field public final ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 90
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩸᩻֫;->᩹:Ljava/util/ArrayList;

    .line 91
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩸᩻֫;->ۙ:Ljava/util/ArrayList;

    const/4 p1, 0x1

    .line 96
    iput-boolean p1, p0, Ll/᩸᩻֫;->᩶:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 105
    invoke-direct {p0, p1, p2, v0}, Ll/᩸᩻֫;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 90
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Ll/᩸᩻֫;->᩹:Ljava/util/ArrayList;

    .line 91
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Ll/᩸᩻֫;->ۙ:Ljava/util/ArrayList;

    const/4 p3, 0x1

    .line 96
    iput-boolean p3, p0, Ll/᩸᩻֫;->᩶:Z

    if-eqz p2, :cond_2

    .line 111
    invoke-interface {p2}, Landroid/util/AttributeSet;->getClassAttribute()Ljava/lang/String;

    move-result-object p3

    .line 113
    sget-object v0, Ll/ܽܳ֫;->ۧ:[I

    const/4 v1, 0x0

    .line 59
    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    if-nez p3, :cond_0

    .line 115
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string p2, "android:name"

    goto :goto_0

    :cond_0
    const-string p2, "class"

    .line 59
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p3, :cond_2

    .line 119
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    .line 120
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FragmentContainerView must be within a FragmentActivity to use "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "=\""

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x22

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 120
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Ll/ۚۜ֫;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩸᩻֫;->᩹:Ljava/util/ArrayList;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩸᩻֫;->ۙ:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 96
    iput-boolean v0, p0, Ll/᩸᩻֫;->᩶:Z

    .line 133
    invoke-interface {p2}, Landroid/util/AttributeSet;->getClassAttribute()Ljava/lang/String;

    move-result-object v1

    .line 59
    sget-object v2, Ll/ܽܳ֫;->ۧ:[I

    const/4 v3, 0x0

    invoke-virtual {p1, p2, v2, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    if-nez v1, :cond_0

    .line 137
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 139
    :cond_0
    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 59
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    .line 142
    invoke-virtual {p3, v2}, Ll/ۚۜ֫;->֫(I)Ll/ۡ᩻֫;

    move-result-object v5

    if-eqz v1, :cond_4

    if-nez v5, :cond_4

    const/4 v5, -0x1

    if-ne v2, v5, :cond_2

    if-eqz v4, :cond_1

    const-string p1, " with tag "

    .line 147
    invoke-virtual {p1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string p1, ""

    .line 148
    :goto_0
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "FragmentContainerView must have an android:id to add Fragment "

    .line 0
    invoke-static {p3, v1, p1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 148
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 153
    :cond_2
    invoke-virtual {p3}, Ll/ۚۜ֫;->ۚ()Ll/᩶᩻֫;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    invoke-virtual {v2, v1}, Ll/᩶᩻֫;->֫(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v1

    const-string v2, "fm.fragmentFactory.insta\u2026ontext.classLoader, name)"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 154
    invoke-virtual {v1, p1, p2, v2}, Ll/ۡ᩻֫;->onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 598
    new-instance p1, Ll/ᩳܳ֫;

    invoke-direct {p1, p3}, Ll/ᩳܳ֫;-><init>(Ll/ۚۜ֫;)V

    .line 855
    iput-boolean v0, p1, Ll/ܽ᩷֫;->ۖ:Z

    .line 293
    iput-object p0, v1, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    .line 294
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p2

    .line 287
    invoke-virtual {p1, p2, v1, v4, v0}, Ll/ᩳܳ֫;->֫(ILl/ۡ᩻֫;Ljava/lang/String;I)V

    .line 755
    iget-boolean p2, p1, Ll/ܽ᩷֫;->֫:Z

    if-nez p2, :cond_3

    .line 759
    iput-boolean v3, p1, Ll/ܽ᩷֫;->ۧ:Z

    .line 323
    iget-object p2, p1, Ll/ᩳܳ֫;->֨:Ll/ۚۜ֫;

    invoke-virtual {p2, p1, v0}, Ll/ۚۜ֫;->֫(Ll/ᩳܳ֫;Z)V

    goto :goto_1

    .line 756
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This transaction is already being added to the back stack"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 160
    :cond_4
    :goto_1
    invoke-virtual {p3, p0}, Ll/ۚۜ֫;->֫(Ll/᩸᩻֫;)V

    return-void
.end method

.method private final ֫(Landroid/view/View;)V
    .locals 1

    .line 322
    iget-object v0, p0, Ll/᩸᩻֫;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Ll/᩸᩻֫;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    const-string v0, "child"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0221

    .line 1087
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    .line 1088
    instance-of v1, v0, Ll/ۡ᩻֫;

    if-eqz v1, :cond_0

    .line 1089
    check-cast v0, Ll/ۡ᩻֫;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 272
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 268
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Views added to a FragmentContainerView must be associated with a Fragment. View "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not associated with a Fragment."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 266
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    const-string v0, "insets"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 148
    invoke-static {v0, p1}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object v1

    .line 204
    iget-object v2, p0, Ll/᩸᩻֫;->᩸:Landroid/view/View$OnApplyWindowInsetsListener;

    if-eqz v2, :cond_0

    .line 206
    invoke-static {v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 345
    invoke-interface {v2, p0, p1}, Landroid/view/View$OnApplyWindowInsetsListener;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    const-string v2, "onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    invoke-static {v0, v1}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object v0

    goto :goto_0

    .line 209
    :cond_0
    invoke-static {p0, v1}, Ll/ܿ᩺;->ۧ(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object v0

    :goto_0
    const-string v1, "if (applyWindowInsetsLis\u2026, insetsCompat)\n        }"

    .line 204
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    invoke-virtual {v0}, Ll/᩸ܰ;->ܺ()Z

    move-result v1

    if-nez v1, :cond_1

    .line 212
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    .line 213
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v0}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object p1
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 4

    const-string v0, "canvas"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    iget-boolean v0, p0, Ll/᩸᩻֫;->᩶:Z

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Ll/᩸᩻֫;->᩹:Ljava/util/ArrayList;

    .line 1849
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 222
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v2

    invoke-super {p0, p1, v1, v2, v3}, Landroid/widget/FrameLayout;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    goto :goto_0

    .line 225
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 2

    const-string v0, "canvas"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    .line 10
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    iget-boolean v0, p0, Ll/᩸᩻֫;->᩶:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩸᩻֫;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 231
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 235
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p1

    return p1
.end method

.method public final endViewTransition(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    iget-object v0, p0, Ll/᩸᩻֫;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 247
    iget-object v0, p0, Ll/᩸᩻֫;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 248
    iput-boolean v0, p0, Ll/᩸᩻֫;->᩶:Z

    .line 250
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->endViewTransition(Landroid/view/View;)V

    return-void
.end method

.method public final onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    const-string v0, "insets"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final removeAllViewsInLayout()V
    .locals 3

    .line 308
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    .line 309
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "view"

    .line 310
    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Ll/᩸᩻֫;->֫(Landroid/view/View;)V

    goto :goto_0

    .line 312
    :cond_0
    invoke-super {p0}, Landroid/widget/FrameLayout;->removeAllViewsInLayout()V

    return-void
.end method

.method public final removeView(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    invoke-direct {p0, p1}, Ll/᩸᩻֫;->֫(Landroid/view/View;)V

    .line 288
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public final removeViewAt(I)V
    .locals 2

    .line 276
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "view"

    .line 277
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ll/᩸᩻֫;->֫(Landroid/view/View;)V

    .line 278
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->removeViewAt(I)V

    return-void
.end method

.method public final removeViewInLayout(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    invoke-direct {p0, p1}, Ll/᩸᩻֫;->֫(Landroid/view/View;)V

    .line 283
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->removeViewInLayout(Landroid/view/View;)V

    return-void
.end method

.method public final removeViews(II)V
    .locals 4

    add-int v0, p1, p2

    move v1, p1

    :goto_0
    if-ge v1, v0, :cond_0

    .line 293
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "view"

    .line 294
    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2}, Ll/᩸᩻֫;->֫(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 296
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->removeViews(II)V

    return-void
.end method

.method public final removeViewsInLayout(II)V
    .locals 4

    add-int v0, p1, p2

    move v1, p1

    :goto_0
    if-ge v1, v0, :cond_0

    .line 301
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "view"

    .line 302
    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2}, Ll/᩸᩻֫;->֫(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 304
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->removeViewsInLayout(II)V

    return-void
.end method

.method public final setLayoutTransition(Landroid/animation/LayoutTransition;)V
    .locals 1

    .line 183
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V
    .locals 1

    const-string v0, "listener"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    iput-object p1, p0, Ll/᩸᩻֫;->᩸:Landroid/view/View$OnApplyWindowInsetsListener;

    return-void
.end method

.method public final startViewTransition(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 240
    iget-object v0, p0, Ll/᩸᩻֫;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->startViewTransition(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 256
    iput-boolean p1, p0, Ll/᩸᩻֫;->᩶:Z

    return-void
.end method
