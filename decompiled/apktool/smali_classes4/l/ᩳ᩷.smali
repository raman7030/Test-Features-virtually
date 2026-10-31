.class public Ll/ᩳ᩷;
.super Ljava/lang/Object;
.source "85W1"


# instance fields
.field public ֫:Landroid/view/View;

.field public final ۜ:Z

.field public ۡ:Ll/ܿ᩷;

.field public final ۢ:I

.field public final ۧ:Landroid/content/Context;

.field public final ܳ:Ll/ۗۜ;

.field public ܽ:I

.field public final ܿ:Landroid/widget/PopupWindow$OnDismissListener;

.field public ᩳ:Z

.field public ᩷:Ll/ۧ᩷;

.field public ᩻:Landroid/widget/PopupWindow$OnDismissListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ۗۜ;Landroid/view/View;ZII)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const p6, 0x800003

    .line 59
    iput p6, p0, Ll/ᩳ᩷;->ܽ:I

    .line 333
    new-instance p6, Ll/ܽ᩷;

    invoke-direct {p6, p0}, Ll/ܽ᩷;-><init>(Ll/ᩳ᩷;)V

    iput-object p6, p0, Ll/ᩳ᩷;->ܿ:Landroid/widget/PopupWindow$OnDismissListener;

    .line 84
    iput-object p1, p0, Ll/ᩳ᩷;->ۧ:Landroid/content/Context;

    .line 85
    iput-object p2, p0, Ll/ᩳ᩷;->ܳ:Ll/ۗۜ;

    .line 86
    iput-object p3, p0, Ll/ᩳ᩷;->֫:Landroid/view/View;

    .line 87
    iput-boolean p4, p0, Ll/ᩳ᩷;->ۜ:Z

    .line 88
    iput p5, p0, Ll/ᩳ᩷;->ۢ:I

    return-void
.end method

.method private ֫(IIZZ)V
    .locals 3

    .line 262
    invoke-virtual {p0}, Ll/ᩳ᩷;->ܽ()Ll/ۧ᩷;

    move-result-object v0

    .line 263
    invoke-virtual {v0, p4}, Ll/ۧ᩷;->ۧ(Z)V

    if-eqz p3, :cond_1

    .line 269
    iget p3, p0, Ll/ᩳ᩷;->ܽ:I

    iget-object p4, p0, Ll/ᩳ᩷;->֫:Landroid/view/View;

    .line 270
    invoke-virtual {p4}, Landroid/view/View;->getLayoutDirection()I

    move-result p4

    .line 134
    invoke-static {p3, p4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p3

    and-int/lit8 p3, p3, 0x7

    const/4 p4, 0x5

    if-ne p3, p4, :cond_0

    .line 272
    iget-object p3, p0, Ll/ᩳ᩷;->֫:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    sub-int/2addr p1, p3

    .line 275
    :cond_0
    invoke-virtual {v0, p1}, Ll/ۧ᩷;->ۧ(I)V

    .line 276
    invoke-virtual {v0, p2}, Ll/ۧ᩷;->ܽ(I)V

    .line 282
    iget-object p3, p0, Ll/ᩳ᩷;->ۧ:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 p4, 0x42400000    # 48.0f

    mul-float p3, p3, p4

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p3, p4

    float-to-int p3, p3

    .line 284
    new-instance p4, Landroid/graphics/Rect;

    sub-int v1, p1, p3

    sub-int v2, p2, p3

    add-int/2addr p1, p3

    add-int/2addr p2, p3

    invoke-direct {p4, v1, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 286
    invoke-virtual {v0, p4}, Ll/ۧ᩷;->֫(Landroid/graphics/Rect;)V

    .line 289
    :cond_1
    invoke-interface {v0}, Ll/ۢ᩷;->show()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 297
    invoke-virtual {p0}, Ll/ᩳ᩷;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 298
    iget-object v0, p0, Ll/ᩳ᩷;->᩷:Ll/ۧ᩷;

    invoke-interface {v0}, Ll/ۢ᩷;->dismiss()V

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 131
    iput p1, p0, Ll/ᩳ᩷;->ܽ:I

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 0

    .line 104
    iput-object p1, p0, Ll/ᩳ᩷;->֫:Landroid/view/View;

    return-void
.end method

.method public final ֫(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 93
    iput-object p1, p0, Ll/ᩳ᩷;->᩻:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final ֫(Ll/ܿ᩷;)V
    .locals 1

    .line 324
    iput-object p1, p0, Ll/ᩳ᩷;->ۡ:Ll/ܿ᩷;

    .line 325
    iget-object v0, p0, Ll/ᩳ᩷;->᩷:Ll/ۧ᩷;

    if-eqz v0, :cond_0

    .line 326
    invoke-interface {v0, p1}, Ll/ܳ᩷;->setCallback(Ll/ܿ᩷;)V

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 117
    iput-boolean p1, p0, Ll/ᩳ᩷;->ᩳ:Z

    .line 118
    iget-object v0, p0, Ll/ᩳ᩷;->᩷:Ll/ۧ᩷;

    if-eqz v0, :cond_0

    .line 119
    invoke-virtual {v0, p1}, Ll/ۧ᩷;->֫(Z)V

    :cond_0
    return-void
.end method

.method public final ֫(II)Z
    .locals 2

    .line 207
    invoke-virtual {p0}, Ll/ᩳ᩷;->ᩳ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 211
    :cond_0
    iget-object v0, p0, Ll/ᩳ᩷;->֫:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 215
    :cond_1
    invoke-direct {p0, p1, p2, v1, v1}, Ll/ᩳ᩷;->֫(IIZZ)V

    return v1
.end method

.method public final ۧ()I
    .locals 1

    .line 138
    iget v0, p0, Ll/ᩳ᩷;->ܽ:I

    return v0
.end method

.method public final ܳ()V
    .locals 2

    const/4 v0, 0x0

    .line 148
    invoke-virtual {p0, v0, v0}, Ll/ᩳ᩷;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 149
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MenuPopupHelper cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()Ll/ۧ᩷;
    .locals 11

    .line 158
    iget-object v0, p0, Ll/ᩳ᩷;->᩷:Ll/ۧ᩷;

    if-nez v0, :cond_1

    const-string v0, "window"

    .line 227
    iget-object v1, p0, Ll/ᩳ᩷;->ۧ:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 229
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 230
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 232
    invoke-virtual {v0, v2}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 234
    iget v0, v2, Landroid/graphics/Point;->x:I

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 235
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070016

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    if-lt v0, v2, :cond_0

    .line 241
    new-instance v0, Ll/ۚۜ;

    iget-object v2, p0, Ll/ᩳ᩷;->֫:Landroid/view/View;

    iget v3, p0, Ll/ᩳ᩷;->ۢ:I

    iget-boolean v4, p0, Ll/ᩳ᩷;->ۜ:Z

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ۚۜ;-><init>(Landroid/content/Context;Landroid/view/View;IZ)V

    goto :goto_0

    .line 244
    :cond_0
    new-instance v0, Ll/ۖ᩷;

    iget-object v8, p0, Ll/ᩳ᩷;->֫:Landroid/view/View;

    iget v9, p0, Ll/ᩳ᩷;->ۢ:I

    iget-boolean v10, p0, Ll/ᩳ᩷;->ۜ:Z

    iget-object v6, p0, Ll/ᩳ᩷;->ۧ:Landroid/content/Context;

    iget-object v7, p0, Ll/ᩳ᩷;->ܳ:Ll/ۗۜ;

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Ll/ۖ᩷;-><init>(Landroid/content/Context;Ll/ۗۜ;Landroid/view/View;IZ)V

    .line 249
    :goto_0
    iget-object v1, p0, Ll/ᩳ᩷;->ܳ:Ll/ۗۜ;

    invoke-virtual {v0, v1}, Ll/ۧ᩷;->֫(Ll/ۗۜ;)V

    .line 250
    iget-object v1, p0, Ll/ᩳ᩷;->ܿ:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-virtual {v0, v1}, Ll/ۧ᩷;->֫(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 253
    iget-object v1, p0, Ll/ᩳ᩷;->֫:Landroid/view/View;

    invoke-virtual {v0, v1}, Ll/ۧ᩷;->֫(Landroid/view/View;)V

    .line 254
    iget-object v1, p0, Ll/ᩳ᩷;->ۡ:Ll/ܿ᩷;

    invoke-interface {v0, v1}, Ll/ܳ᩷;->setCallback(Ll/ܿ᩷;)V

    .line 255
    iget-boolean v1, p0, Ll/ᩳ᩷;->ᩳ:Z

    invoke-virtual {v0, v1}, Ll/ۧ᩷;->֫(Z)V

    .line 256
    iget v1, p0, Ll/ᩳ᩷;->ܽ:I

    invoke-virtual {v0, v1}, Ll/ۧ᩷;->֫(I)V

    .line 159
    iput-object v0, p0, Ll/ᩳ᩷;->᩷:Ll/ۧ᩷;

    .line 161
    :cond_1
    iget-object v0, p0, Ll/ᩳ᩷;->᩷:Ll/ۧ᩷;

    return-object v0
.end method

.method public ܿ()V
    .locals 1

    const/4 v0, 0x0

    .line 311
    iput-object v0, p0, Ll/ᩳ᩷;->᩷:Ll/ۧ᩷;

    .line 313
    iget-object v0, p0, Ll/ᩳ᩷;->᩻:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_0

    .line 314
    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_0
    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 319
    iget-object v0, p0, Ll/ᩳ᩷;->᩷:Ll/ۧ᩷;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۢ᩷;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Z
    .locals 3

    .line 171
    invoke-virtual {p0}, Ll/ᩳ᩷;->ᩳ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 175
    :cond_0
    iget-object v0, p0, Ll/ᩳ᩷;->֫:Landroid/view/View;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 179
    :cond_1
    invoke-direct {p0, v2, v2, v2, v2}, Ll/ᩳ᩷;->֫(IIZZ)V

    return v1
.end method
