.class public Ll/ۨܽܿ;
.super Landroid/widget/ListView;
.source "N5UC"


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 2

    .line 32
    iget v0, p0, Ll/ۨܽܿ;->᩸:I

    if-lez v0, :cond_0

    .line 33
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iget v1, p0, Ll/ۨܽܿ;->᩸:I

    if-le v0, v1, :cond_0

    .line 34
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 37
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/ListView;->onMeasure(II)V

    return-void
.end method

.method public final ֫()I
    .locals 1

    .line 27
    iget v0, p0, Ll/ۨܽܿ;->᩸:I

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 23
    iput p1, p0, Ll/ۨܽܿ;->᩸:I

    return-void
.end method
