.class public Ll/֡᩷ۡ;
.super Landroid/view/View;
.source "X16C"


# instance fields
.field public ᩶:Landroid/view/WindowManager;

.field public ᩸:Ll/᩵᩷ۡ;

.field public ᩹:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, p2, v0}, Ll/֡᩷ۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2}, Landroid/graphics/Point;-><init>()V

    iput-object p2, p0, Ll/֡᩷ۡ;->᩹:Landroid/graphics/Point;

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 25
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 27
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    iput-object p1, p0, Ll/֡᩷ۡ;->᩶:Landroid/view/WindowManager;

    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 0

    .line 41
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 42
    iget-object p2, p0, Ll/֡᩷ۡ;->᩸:Ll/᩵᩷ۡ;

    if-eqz p2, :cond_2

    .line 43
    invoke-virtual {p2}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_2

    .line 47
    iget-object p1, p0, Ll/֡᩷ۡ;->᩶:Landroid/view/WindowManager;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    iget-object p3, p0, Ll/֡᩷ۡ;->᩹:Landroid/graphics/Point;

    invoke-virtual {p1, p3}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    int-to-float p1, p5

    .line 48
    iget p3, p3, Landroid/graphics/Point;->y:I

    int-to-float p3, p3

    const p4, 0x3f4ccccd    # 0.8f

    mul-float p3, p3, p4

    cmpl-float p1, p1, p3

    if-lez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 49
    :goto_0
    invoke-virtual {p2, p1}, Ll/᩵᩷ۡ;->֫(Z)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    const/4 p1, 0x1

    .line 36
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final ֫(Ll/᩵᩷ۡ;)V
    .locals 0

    .line 31
    iput-object p1, p0, Ll/֡᩷ۡ;->᩸:Ll/᩵᩷ۡ;

    return-void
.end method
