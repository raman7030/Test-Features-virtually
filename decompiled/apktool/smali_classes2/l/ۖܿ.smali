.class public Ll/ۖܿ;
.super Ll/ۢۢۡ;
.source "I67T"


# instance fields
.field public final ֡֫:I

.field public final ᩵֫:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 844
    invoke-direct {p0, p1, p2}, Ll/ۢۢۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 846
    sget-object v0, Ll/ۗᩳ;->᩸:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, -0x1

    .line 848
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    iput p2, p0, Ll/ۖܿ;->᩵֫:I

    const/4 p2, 0x1

    .line 850
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    iput p1, p0, Ll/ۖܿ;->֡֫:I

    .line 852
    invoke-virtual {p0, p2}, Ll/ۢۢۡ;->setFastScrollEnabled(Z)V

    return-void
.end method


# virtual methods
.method public final ֫(ZZ)V
    .locals 2

    if-eqz p2, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 856
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    if-eqz p1, :cond_2

    .line 857
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    goto :goto_1

    :cond_2
    iget p1, p0, Ll/ۖܿ;->֡֫:I

    .line 858
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    if-eqz p2, :cond_3

    .line 859
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p2

    goto :goto_2

    :cond_3
    iget p2, p0, Ll/ۖܿ;->᩵֫:I

    .line 860
    :goto_2
    invoke-virtual {p0, v0, p1, v1, p2}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method
