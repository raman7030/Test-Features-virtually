.class public final Ll/ᩴۤۧ;
.super Ljava/lang/Object;
.source "D5XC"


# instance fields
.field public ֡:F

.field public ֨:F

.field public ֫:I

.field public ۖ:F

.field public ۘ:F

.field public ۚ:F

.field public ۜ:I

.field public ۠:F

.field public ۡ:F

.field public ۢ:I

.field public ۧ:Landroid/graphics/Path;

.field public ܳ:I

.field public final ܶ:Landroid/graphics/RectF;

.field public final ܺ:Landroid/graphics/Paint;

.field public ܽ:I

.field public ܿ:F

.field public final ᩳ:Landroid/graphics/Paint;

.field public ᩴ:Z

.field public ᩵:F

.field public ᩷:[I

.field public final ᩻:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 651
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 624
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ᩴۤۧ;->ܶ:Landroid/graphics/RectF;

    .line 625
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/ᩴۤۧ;->ܺ:Landroid/graphics/Paint;

    .line 626
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Ll/ᩴۤۧ;->ᩳ:Landroid/graphics/Paint;

    .line 627
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Ll/ᩴۤۧ;->᩻:Landroid/graphics/Paint;

    const/4 v3, 0x0

    .line 629
    iput v3, p0, Ll/ᩴۤۧ;->᩵:F

    .line 630
    iput v3, p0, Ll/ᩴۤۧ;->ۡ:F

    .line 631
    iput v3, p0, Ll/ᩴۤۧ;->ۘ:F

    const/high16 v3, 0x40a00000    # 5.0f

    .line 632
    iput v3, p0, Ll/ᩴۤۧ;->۠:F

    const/high16 v3, 0x3f800000    # 1.0f

    .line 644
    iput v3, p0, Ll/ᩴۤۧ;->ܿ:F

    const/16 v3, 0xff

    .line 648
    iput v3, p0, Ll/ᩴۤۧ;->֫:I

    .line 652
    sget-object v3, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    const/4 v3, 0x1

    .line 653
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 654
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 656
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 657
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 v0, 0x0

    .line 659
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 798
    iput p1, p0, Ll/ᩴۤۧ;->ۜ:I

    .line 799
    iget-object v0, p0, Ll/ᩴۤۧ;->᩷:[I

    aget p1, v0, p1

    iput p1, p0, Ll/ᩴۤۧ;->ۢ:I

    return-void
.end method
