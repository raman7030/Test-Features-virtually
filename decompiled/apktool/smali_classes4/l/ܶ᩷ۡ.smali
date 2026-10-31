.class public final Ll/ܶ᩷ۡ;
.super Landroid/view/ViewOutlineProvider;
.source "E5ZZ"


# instance fields
.field public final synthetic ֫:Ll/᩸᩷ۡ;


# direct methods
.method public constructor <init>(Ll/᩸᩷ۡ;)V
    .locals 0

    .line 516
    iput-object p1, p0, Ll/ܶ᩷ۡ;->֫:Ll/᩸᩷ۡ;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 2

    .line 520
    sget p1, Ll/᩸᩷ۡ;->ᩳ֫:I

    .line 523
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 524
    iget-object v0, p0, Ll/ܶ᩷ۡ;->֫:Ll/᩸᩷ۡ;

    invoke-static {v0}, Ll/᩸᩷ۡ;->֫(Ll/᩸᩷ۡ;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->roundOut(Landroid/graphics/Rect;)V

    .line 525
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {p2, p1, v0}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    return-void
.end method
