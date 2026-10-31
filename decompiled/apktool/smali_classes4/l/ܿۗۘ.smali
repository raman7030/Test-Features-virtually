.class public final Ll/ܿۗۘ;
.super Ljava/lang/Object;
.source "Z90A"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# static fields
.field public static final ۬:Z


# instance fields
.field public ۗ:Ll/۬ۙۘ;

.field public final ۙ:Landroid/graphics/Rect;

.field public final ᩶:Landroid/graphics/Paint;

.field public final ᩸:Landroid/graphics/RectF;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 22
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-eq v1, v0, :cond_1

    const/16 v1, 0x19

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 23
    :goto_1
    sput-boolean v0, Ll/ܿۗۘ;->۬:Z

    return-void
.end method

.method public constructor <init>(Ll/۬ۙۘ;I)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {}, Ll/ܺۗۘ;->֫()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۗۘ;->᩶:Landroid/graphics/Paint;

    .line 29
    invoke-static {}, Ll/ܺۗۘ;->ܽ()Landroid/graphics/RectF;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۗۘ;->᩸:Landroid/graphics/RectF;

    .line 30
    invoke-static {}, Ll/ܺۗۘ;->ۧ()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۗۘ;->ۙ:Landroid/graphics/Rect;

    .line 37
    iput-object p1, p0, Ll/ܿۗۘ;->ۗ:Ll/۬ۙۘ;

    .line 38
    iput p2, p0, Ll/ܿۗۘ;->᩹:I

    return-void
.end method


# virtual methods
.method public final drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 3

    .line 50
    iget-object p5, p0, Ll/ܿۗۘ;->᩸:Landroid/graphics/RectF;

    iget-object p7, p0, Ll/ܿۗۘ;->ۙ:Landroid/graphics/Rect;

    if-eqz p11, :cond_6

    .line 8
    instance-of p10, p8, Landroid/text/Spanned;

    if-eqz p10, :cond_6

    check-cast p8, Landroid/text/Spanned;

    invoke-interface {p8, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p8

    if-ne p8, p9, :cond_6

    .line 55
    iget-object p8, p0, Ll/ܿۗۘ;->᩶:Landroid/graphics/Paint;

    invoke-virtual {p8, p2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 57
    iget-object p2, p0, Ll/ܿۗۘ;->ۗ:Ll/۬ۙۘ;

    invoke-virtual {p2, p8}, Ll/۬ۙۘ;->ܽ(Landroid/graphics/Paint;)V

    .line 59
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result p9

    .line 62
    :try_start_0
    invoke-virtual {p2}, Ll/۬ۙۘ;->֫()I

    move-result p10

    .line 67
    invoke-virtual {p8}, Landroid/graphics/Paint;->descent()F

    move-result p11

    invoke-virtual {p8}, Landroid/graphics/Paint;->ascent()F

    move-result v0

    sub-float/2addr p11, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p11, v0

    float-to-int p11, p11

    .line 69
    invoke-virtual {p2, p11}, Ll/۬ۙۘ;->֫(I)I

    move-result p11

    sub-int v1, p10, p11

    .line 71
    invoke-virtual {p2}, Ll/۬ۙۘ;->ܽ()I

    move-result p2

    div-int/2addr v1, p2

    .line 79
    sget-boolean p2, Ll/ܿۗۘ;->۬:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget v2, p0, Ll/ܿۗۘ;->᩹:I

    if-eqz p2, :cond_1

    if-gez p4, :cond_0

    .line 90
    :try_start_1
    invoke-virtual {p12}, Landroid/text/Layout;->getWidth()I

    move-result p2

    mul-int p10, p10, v2

    sub-int/2addr p2, p10

    sub-int p2, p3, p2

    goto :goto_0

    :cond_0
    mul-int p10, p10, v2

    sub-int p2, p10, p3

    :goto_0
    mul-int v1, v1, p4

    add-int/2addr v1, p3

    mul-int p3, p4, p11

    add-int/2addr p3, v1

    .line 97
    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    move-result p10

    mul-int p4, p4, p2

    add-int/2addr p10, p4

    .line 98
    invoke-static {v1, p3}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/2addr p2, p4

    goto :goto_2

    :cond_1
    if-lez p4, :cond_2

    goto :goto_1

    :cond_2
    sub-int/2addr p3, p10

    :goto_1
    add-int p10, p3, v1

    add-int p2, p10, p11

    .line 110
    :goto_2
    invoke-virtual {p8}, Landroid/graphics/Paint;->descent()F

    move-result p3

    invoke-virtual {p8}, Landroid/graphics/Paint;->ascent()F

    move-result p4

    add-float/2addr p3, p4

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p3, p4

    add-float/2addr p3, v0

    float-to-int p3, p3

    add-int/2addr p6, p3

    div-int/lit8 p3, p11, 0x2

    sub-int/2addr p6, p3

    add-int/2addr p11, p6

    if-eqz v2, :cond_4

    const/4 p3, 0x1

    if-ne v2, p3, :cond_3

    goto :goto_3

    .line 126
    :cond_3
    invoke-virtual {p7, p10, p6, p2, p11}, Landroid/graphics/Rect;->set(IIII)V

    .line 128
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p8, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 130
    invoke-virtual {p1, p7, p8}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_5

    :cond_4
    :goto_3
    int-to-float p3, p10

    int-to-float p4, p6

    int-to-float p2, p2

    int-to-float p6, p11

    .line 116
    invoke-virtual {p5, p3, p4, p2, p6}, Landroid/graphics/RectF;->set(FFFF)V

    if-nez v2, :cond_5

    .line 119
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    goto :goto_4

    .line 120
    :cond_5
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 121
    :goto_4
    invoke-virtual {p8, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 123
    invoke-virtual {p1, p5, p8}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    :goto_5
    invoke-virtual {p1, p9}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1, p9}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 135
    throw p2

    :cond_6
    return-void
.end method

.method public final getLeadingMargin(Z)I
    .locals 0

    .line 43
    iget-object p1, p0, Ll/ܿۗۘ;->ۗ:Ll/۬ۙۘ;

    invoke-virtual {p1}, Ll/۬ۙۘ;->֫()I

    move-result p1

    return p1
.end method
