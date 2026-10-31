.class public final Ll/֡ۗۘ;
.super Ljava/lang/Object;
.source "I8YA"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# instance fields
.field public final ᩶:Ll/۬ۙۘ;

.field public final ᩸:Landroid/graphics/Paint;

.field public final ᩹:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Ll/۬ۙۘ;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-static {}, Ll/ܺۗۘ;->ۧ()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۗۘ;->᩹:Landroid/graphics/Rect;

    .line 17
    invoke-static {}, Ll/ܺۗۘ;->֫()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۗۘ;->᩸:Landroid/graphics/Paint;

    .line 20
    iput-object p1, p0, Ll/֡ۗۘ;->᩶:Ll/۬ۙۘ;

    return-void
.end method


# virtual methods
.method public final drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 1

    const/4 p6, 0x2

    .line 31
    invoke-static {p7, p5, p6, p5}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result p5

    .line 33
    iget-object p6, p0, Ll/֡ۗۘ;->᩸:Landroid/graphics/Paint;

    invoke-virtual {p6, p2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 34
    iget-object p2, p0, Ll/֡ۗۘ;->᩶:Ll/۬ۙۘ;

    invoke-virtual {p2, p6}, Ll/۬ۙۘ;->ᩳ(Landroid/graphics/Paint;)V

    .line 36
    invoke-virtual {p6}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result p2

    const/high16 p7, 0x3f000000    # 0.5f

    add-float/2addr p2, p7

    float-to-int p2, p2

    int-to-float p2, p2

    const/high16 p8, 0x40000000    # 2.0f

    div-float/2addr p2, p8

    add-float/2addr p2, p7

    float-to-int p2, p2

    if-lez p4, :cond_0

    .line 43
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result p4

    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result p4

    sub-int p4, p3, p4

    move v0, p4

    move p4, p3

    move p3, v0

    :goto_0
    sub-int p7, p5, p2

    add-int/2addr p5, p2

    .line 49
    iget-object p2, p0, Ll/֡ۗۘ;->᩹:Landroid/graphics/Rect;

    invoke-virtual {p2, p3, p7, p4, p5}, Landroid/graphics/Rect;->set(IIII)V

    .line 50
    invoke-virtual {p1, p2, p6}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final getLeadingMargin(Z)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
