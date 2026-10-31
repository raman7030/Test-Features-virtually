.class public Ll/֫ۢۡ;
.super Landroid/widget/FrameLayout;
.source "KAKB"


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    sget-object p1, Ll/ۧ᩸ۡ;->ܿ:Landroid/graphics/Point;

    iget p2, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/high16 p2, 0x42800000    # 64.0f

    invoke-static {p2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    sub-int/2addr p1, p2

    const/high16 p2, 0x43a50000    # 330.0f

    .line 32
    invoke-static {p2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 33
    iput p1, p0, Ll/֫ۢۡ;->᩸:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    sget-object p1, Ll/ۧ᩸ۡ;->ܿ:Landroid/graphics/Point;

    iget p2, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/high16 p2, 0x42800000    # 64.0f

    invoke-static {p2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    sub-int/2addr p1, p2

    const/high16 p2, 0x43a50000    # 330.0f

    .line 32
    invoke-static {p2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 33
    iput p1, p0, Ll/֫ۢۡ;->᩸:I

    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 1

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    iget p1, p0, Ll/֫ۢۡ;->᩸:I

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 41
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method
