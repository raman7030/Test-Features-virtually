.class public final Ll/ܳۛۧ;
.super Ljava/lang/Object;
.source "A65W"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public final ᩻:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 366
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 367
    iput-object p1, p0, Ll/ܳۛۧ;->᩻:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/graphics/PointF;)V
    .locals 4

    .line 380
    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Ll/ܳۛۧ;->ᩳ:I

    .line 381
    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Ll/ܳۛۧ;->֫:I

    .line 382
    iget v0, p0, Ll/ܳۛۧ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܳۛۧ;->ۧ:I

    .line 383
    iget v1, p0, Ll/ܳۛۧ;->ܳ:I

    if-ne v1, v0, :cond_0

    .line 389
    iget v0, p0, Ll/ܳۛۧ;->ܽ:I

    iget v1, p0, Ll/ܳۛۧ;->ܿ:I

    iget v2, p0, Ll/ܳۛۧ;->ᩳ:I

    iget-object v3, p0, Ll/ܳۛۧ;->᩻:Landroid/view/View;

    invoke-static {v3, v0, v1, v2, p1}, Ll/᩸ۨۧ;->֫(Landroid/view/View;IIII)V

    const/4 p1, 0x0

    .line 390
    iput p1, p0, Ll/ܳۛۧ;->ܳ:I

    .line 391
    iput p1, p0, Ll/ܳۛۧ;->ۧ:I

    :cond_0
    return-void
.end method

.method public final ۧ(Landroid/graphics/PointF;)V
    .locals 4

    .line 371
    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Ll/ܳۛۧ;->ܽ:I

    .line 372
    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Ll/ܳۛۧ;->ܿ:I

    .line 373
    iget v0, p0, Ll/ܳۛۧ;->ܳ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܳۛۧ;->ܳ:I

    .line 374
    iget v1, p0, Ll/ܳۛۧ;->ۧ:I

    if-ne v0, v1, :cond_0

    .line 389
    iget v0, p0, Ll/ܳۛۧ;->ܽ:I

    iget v1, p0, Ll/ܳۛۧ;->ᩳ:I

    iget v2, p0, Ll/ܳۛۧ;->֫:I

    iget-object v3, p0, Ll/ܳۛۧ;->᩻:Landroid/view/View;

    invoke-static {v3, v0, p1, v1, v2}, Ll/᩸ۨۧ;->֫(Landroid/view/View;IIII)V

    const/4 p1, 0x0

    .line 390
    iput p1, p0, Ll/ܳۛۧ;->ܳ:I

    .line 391
    iput p1, p0, Ll/ܳۛۧ;->ۧ:I

    :cond_0
    return-void
.end method
