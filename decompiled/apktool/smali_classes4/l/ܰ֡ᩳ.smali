.class public Ll/ܰ֡ᩳ;
.super Ll/ܳܺ;
.source "RAP3"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Ll/ܳܺ;-><init>(Landroid/content/Context;)V

    .line 25
    invoke-direct {p0, p1}, Ll/ܰ֡ᩳ;->֫(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Ll/ܳܺ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    invoke-direct {p0, p1}, Ll/ܰ֡ᩳ;->֫(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Ll/ܳܺ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    invoke-direct {p0, p1}, Ll/ܰ֡ᩳ;->֫(Landroid/content/Context;)V

    return-void
.end method

.method private ֫(Landroid/content/Context;)V
    .locals 6

    .line 39
    invoke-static {p0}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    const/16 v0, 0x11

    .line 40
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 42
    iget v0, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x41000000    # 8.0f

    mul-float v1, v1, v0

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    const/high16 v3, 0x40c00000    # 6.0f

    mul-float v3, v3, v0

    add-float/2addr v3, v2

    float-to-int v3, v3

    const/high16 v4, 0x42400000    # 48.0f

    mul-float v0, v0, v4

    add-float/2addr v0, v2

    float-to-int v0, v0

    mul-int/lit8 v4, v3, 0x2

    .line 46
    iget p1, p1, Landroid/util/DisplayMetrics;->scaledDensity:F

    const/high16 v5, 0x43340000    # 180.0f

    mul-float p1, p1, v5

    add-float/2addr p1, v2

    float-to-int p1, p1

    add-int/2addr v4, p1

    .line 47
    invoke-virtual {p0, v3, v1, v3, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 48
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 49
    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 50
    sget-object p1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 51
    invoke-virtual {p0}, Landroid/widget/TextView;->setSingleLine()V

    const/high16 p1, 0x41800000    # 16.0f

    .line 52
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    return-void
.end method
