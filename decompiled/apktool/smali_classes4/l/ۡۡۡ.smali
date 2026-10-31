.class public Ll/ۡۡۡ;
.super Ll/۬۬ۧ;
.source "8AK7"


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2}, Ll/۬۬ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Ll/۬۬ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 3

    .line 31
    iget v0, p0, Ll/ۡۡۡ;->᩸:I

    if-lez v0, :cond_3

    .line 32
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 33
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    const/high16 v2, -0x80000000

    if-eq v0, v2, :cond_2

    if-eqz v0, :cond_1

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    iget v0, p0, Ll/ۡۡۡ;->᩸:I

    if-le v1, v0, :cond_3

    .line 42
    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    goto :goto_0

    .line 46
    :cond_1
    iget p2, p0, Ll/ۡۡۡ;->᩸:I

    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    goto :goto_0

    .line 36
    :cond_2
    iget v0, p0, Ll/ۡۡۡ;->᩸:I

    if-le v1, v0, :cond_3

    .line 37
    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 50
    :cond_3
    :goto_0
    invoke-super {p0, p1, p2}, Ll/۬۬ۧ;->onMeasure(II)V

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 26
    iput p1, p0, Ll/ۡۡۡ;->᩸:I

    return-void
.end method
