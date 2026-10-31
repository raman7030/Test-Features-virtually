.class public final synthetic Ll/᩷᩷ᩳ;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic ᩸:Landroid/widget/TextView;

.field public final synthetic ᩹:F


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;F)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷᩷ᩳ;->᩸:Landroid/widget/TextView;

    iput p2, p0, Ll/᩷᩷ᩳ;->᩹:F

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 2
    sget p1, Ll/֫ۢᩳ;->ۗۧ:I

    sub-int/2addr p4, p2

    .line 226
    iget-object p1, p0, Ll/᩷᩷ᩳ;->᩸:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 227
    new-instance p3, Landroid/text/TextPaint;

    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p5

    invoke-direct {p3, p5}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    const/high16 p5, 0x41700000    # 15.0f

    .line 229
    invoke-static {p5}, Ll/ۧ᩸ۡ;->ܽ(F)I

    move-result p5

    int-to-float p5, p5

    .line 230
    iget p6, p0, Ll/᩷᩷ᩳ;->᩹:F

    invoke-virtual {p3, p6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 231
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p7

    int-to-float p4, p4

    cmpl-float p7, p7, p4

    if-lez p7, :cond_3

    :cond_0
    const/high16 p7, 0x3f800000    # 1.0f

    sub-float/2addr p6, p7

    .line 234
    invoke-virtual {p3, p6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 235
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p7

    cmpl-float p7, p7, p4

    if-lez p7, :cond_1

    cmpl-float p7, p6, p5

    if-gtz p7, :cond_0

    :cond_1
    cmpg-float p2, p6, p5

    if-gez p2, :cond_2

    goto :goto_0

    :cond_2
    move p5, p6

    :goto_0
    const/4 p2, 0x0

    .line 239
    invoke-virtual {p1, p2, p5}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_3
    return-void
.end method
