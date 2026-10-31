.class public Ll/ۢܺۡ;
.super Ll/֡ܺۡ;
.source "G696"


# instance fields
.field public ܳ֫:I

.field public ܿ֫:Ll/ۡܺۡ;

.field public ᩻֫:Ll/᩷ܺۡ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Ll/֡ܺۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    sget p1, Ll/᩹֡᩷;->ۢ:I

    iput p1, p0, Ll/ۢܺۡ;->ܳ֫:I

    .line 29
    invoke-direct {p0}, Ll/ۢܺۡ;->ܽ()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3}, Ll/֡ܺۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 15
    sget p1, Ll/᩹֡᩷;->ۢ:I

    iput p1, p0, Ll/ۢܺۡ;->ܳ֫:I

    .line 34
    invoke-direct {p0}, Ll/ۢܺۡ;->ܽ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۢܺۡ;)V
    .locals 2

    .line 66
    iget-object v0, p0, Ll/ۢܺۡ;->ܿ֫:Ll/ۡܺۡ;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll/ۡܺۡ;->۬:Z

    .line 67
    iget-object v0, p0, Ll/ۢܺۡ;->᩻֫:Ll/᩷ܺۡ;

    if-eqz v0, :cond_0

    .line 68
    invoke-interface {v0, p0}, Ll/᩷ܺۡ;->֫(Ll/ۢܺۡ;)V

    .line 11
    :cond_0
    invoke-super {p0}, Ll/֡ܺۡ;->ۧ()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۢܺۡ;)Ll/ۡܺۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢܺۡ;->ܿ֫:Ll/ۡܺۡ;

    return-object p0
.end method

.method private ܽ()V
    .locals 3

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 58
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d01e1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۡܺۡ;

    iput-object v0, p0, Ll/ۢܺۡ;->ܿ֫:Ll/ۡܺۡ;

    .line 59
    iget v1, p0, Ll/ۢܺۡ;->ܳ֫:I

    .line 63
    iget-object v0, v0, Ll/ۡܺۡ;->ۙ:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x42a00000    # 80.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    .line 61
    iget-object v1, p0, Ll/ۢܺۡ;->ܿ֫:Ll/ۡܺۡ;

    float-to-int v2, v0

    invoke-virtual {v1, v2}, Ll/ۡܺۡ;->ۧ(I)V

    .line 11
    invoke-super {p0, v0}, Ll/֡ܺۡ;->֫(F)V

    .line 63
    iget-object v0, p0, Ll/ۢܺۡ;->ܿ֫:Ll/ۡܺۡ;

    .line 95
    new-instance v1, Ll/ۘܺۡ;

    invoke-direct {v1, p0, v0}, Ll/ۘܺۡ;-><init>(Ll/ۢܺۡ;Landroid/view/View;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 64
    new-instance v0, Ll/᩻ܺۡ;

    invoke-direct {v0, p0}, Ll/᩻ܺۡ;-><init>(Ll/ۢܺۡ;)V

    .line 11
    invoke-super {p0, v0}, Ll/֡ܺۡ;->֫(Ll/ᩴܺۡ;)V

    .line 73
    new-instance v0, Ll/ۜܺۡ;

    invoke-direct {v0, p0}, Ll/ۜܺۡ;-><init>(Ll/ۢܺۡ;)V

    .line 11
    invoke-super {p0, v0}, Ll/֡ܺۡ;->֫(Ll/᩵ܺۡ;)V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 18
    iput p1, p0, Ll/ۢܺۡ;->ܳ֫:I

    .line 19
    iget-object v0, p0, Ll/ۢܺۡ;->ܿ֫:Ll/ۡܺۡ;

    .line 63
    iget-object v0, v0, Ll/ۡܺۡ;->ۙ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public final ֫(Ll/᩷ܺۡ;)V
    .locals 0

    .line 43
    iput-object p1, p0, Ll/ۢܺۡ;->᩻֫:Ll/᩷ܺۡ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۢܺۡ;->ܿ֫:Ll/ۡܺۡ;

    invoke-virtual {v0, p1}, Ll/ۡܺۡ;->֫(Z)V

    return-void
.end method
