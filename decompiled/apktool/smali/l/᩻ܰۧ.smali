.class public final Ll/᩻ܰۧ;
.super Ljava/lang/Object;
.source "Q69A"

# interfaces
.implements Ll/ܽۨ;


# instance fields
.field public final ᩸:Landroid/graphics/Rect;

.field public final synthetic ᩹:Ll/֡ܰۧ;


# direct methods
.method public constructor <init>(Ll/֡ܰۧ;)V
    .locals 0

    .line 428
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ܰۧ;->᩹:Ll/֡ܰۧ;

    .line 429
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll/᩻ܰۧ;->᩸:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 6

    .line 436
    invoke-static {p1, p2}, Ll/ܿ᩺;->ۧ(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object p1

    .line 437
    invoke-virtual {p1}, Ll/᩸ܰ;->ܺ()Z

    move-result p2

    if-eqz p2, :cond_0

    return-object p1

    .line 450
    :cond_0
    invoke-virtual {p1}, Ll/᩸ܰ;->ۜ()I

    move-result p2

    iget-object v0, p0, Ll/᩻ܰۧ;->᩸:Landroid/graphics/Rect;

    iput p2, v0, Landroid/graphics/Rect;->left:I

    .line 451
    invoke-virtual {p1}, Ll/᩸ܰ;->ۢ()I

    move-result p2

    iput p2, v0, Landroid/graphics/Rect;->top:I

    .line 452
    invoke-virtual {p1}, Ll/᩸ܰ;->᩷()I

    move-result p2

    iput p2, v0, Landroid/graphics/Rect;->right:I

    .line 453
    invoke-virtual {p1}, Ll/᩸ܰ;->᩻()I

    move-result p2

    iput p2, v0, Landroid/graphics/Rect;->bottom:I

    .line 455
    iget-object p2, p0, Ll/᩻ܰۧ;->᩹:Ll/֡ܰۧ;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 457
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, p1}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object v3

    .line 460
    invoke-virtual {v3}, Ll/᩸ܰ;->ۜ()I

    move-result v4

    iget v5, v0, Landroid/graphics/Rect;->left:I

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 462
    invoke-virtual {v3}, Ll/᩸ܰ;->ۢ()I

    move-result v4

    iget v5, v0, Landroid/graphics/Rect;->top:I

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    iput v4, v0, Landroid/graphics/Rect;->top:I

    .line 464
    invoke-virtual {v3}, Ll/᩸ܰ;->᩷()I

    move-result v4

    iget v5, v0, Landroid/graphics/Rect;->right:I

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    iput v4, v0, Landroid/graphics/Rect;->right:I

    .line 466
    invoke-virtual {v3}, Ll/᩸ܰ;->᩻()I

    move-result v3

    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v0, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 471
    :cond_1
    iget p2, v0, Landroid/graphics/Rect;->left:I

    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget v2, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 339
    new-instance v3, Ll/᩻ܰ;

    invoke-direct {v3, p1}, Ll/᩻ܰ;-><init>(Ll/᩸ܰ;)V

    .line 340
    invoke-static {p2, v1, v2, v0}, Ll/ۧ۬;->֫(IIII)Ll/ۧ۬;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/᩻ܰ;->ۧ(Ll/ۧ۬;)V

    .line 341
    invoke-virtual {v3}, Ll/᩻ܰ;->֫()Ll/᩸ܰ;

    move-result-object p1

    return-object p1
.end method
