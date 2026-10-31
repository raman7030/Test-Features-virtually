.class public final Ll/ᩳۗۘ;
.super Ljava/lang/Object;
.source "N90X"

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

    iput-object v0, p0, Ll/ᩳۗۘ;->᩹:Landroid/graphics/Rect;

    .line 17
    invoke-static {}, Ll/ܺۗۘ;->֫()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۗۘ;->᩸:Landroid/graphics/Paint;

    .line 20
    iput-object p1, p0, Ll/ᩳۗۘ;->᩶:Ll/۬ۙۘ;

    return-void
.end method


# virtual methods
.method public final drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 0

    .line 43
    iget-object p6, p0, Ll/ᩳۗۘ;->᩶:Ll/۬ۙۘ;

    invoke-virtual {p6}, Ll/۬ۙۘ;->ۧ()I

    move-result p6

    .line 45
    iget-object p8, p0, Ll/ᩳۗۘ;->᩸:Landroid/graphics/Paint;

    invoke-virtual {p8, p2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 253
    invoke-virtual {p8}, Landroid/graphics/Paint;->getColor()I

    move-result p2

    const/16 p9, 0x19

    invoke-static {p2, p9}, Ll/ۜ᩺ۘ;->֫(II)I

    move-result p2

    .line 257
    sget-object p9, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p8, p9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 258
    invoke-virtual {p8, p2}, Landroid/graphics/Paint;->setColor(I)V

    mul-int p4, p4, p6

    add-int/2addr p3, p4

    add-int/2addr p4, p3

    .line 54
    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 55
    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p3

    .line 58
    iget-object p4, p0, Ll/ᩳۗۘ;->᩹:Landroid/graphics/Rect;

    invoke-virtual {p4, p2, p5, p3, p7}, Landroid/graphics/Rect;->set(IIII)V

    .line 60
    invoke-virtual {p1, p4, p8}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final getLeadingMargin(Z)I
    .locals 0

    .line 25
    iget-object p1, p0, Ll/ᩳۗۘ;->᩶:Ll/۬ۙۘ;

    invoke-virtual {p1}, Ll/۬ۙۘ;->֫()I

    move-result p1

    return p1
.end method
