.class public final Ll/᩻֨ܺ;
.super Ljava/lang/Object;
.source "TB7B"

# interfaces
.implements Ll/۬֡ܺ;


# instance fields
.field public ֫:F

.field public ۧ:F

.field public ܽ:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Ll/ۗ֡ܺ;)V
    .locals 1

    .line 2611
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2607
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll/᩻֨ܺ;->ܽ:Landroid/graphics/Path;

    if-nez p1, :cond_0

    return-void

    .line 2614
    :cond_0
    invoke-virtual {p1, p0}, Ll/ۗ֡ܺ;->֫(Ll/۬֡ܺ;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 2665
    iget-object v0, p0, Ll/᩻֨ܺ;->ܽ:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method public final ֫(FF)V
    .locals 1

    .line 2625
    iget-object v0, p0, Ll/᩻֨ܺ;->ܽ:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 2626
    iput p1, p0, Ll/᩻֨ܺ;->֫:F

    .line 2627
    iput p2, p0, Ll/᩻֨ܺ;->ۧ:F

    return-void
.end method

.method public final ֫(FFFF)V
    .locals 1

    .line 2649
    iget-object v0, p0, Ll/᩻֨ܺ;->ܽ:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 2650
    iput p3, p0, Ll/᩻֨ܺ;->֫:F

    .line 2651
    iput p4, p0, Ll/᩻֨ܺ;->ۧ:F

    return-void
.end method

.method public final ֫(FFFFFF)V
    .locals 7

    .line 2641
    iget-object v0, p0, Ll/᩻֨ܺ;->ܽ:Landroid/graphics/Path;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 2642
    iput p5, p0, Ll/᩻֨ܺ;->֫:F

    .line 2643
    iput p6, p0, Ll/᩻֨ܺ;->ۧ:F

    return-void
.end method

.method public final ֫(FFFZZFF)V
    .locals 11

    move-object v10, p0

    .line 2657
    iget v0, v10, Ll/᩻֨ܺ;->֫:F

    iget v1, v10, Ll/᩻֨ܺ;->ۧ:F

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Ll/ᩴ֨ܺ;->֫(FFFFFZZFFLl/۬֡ܺ;)V

    move/from16 v0, p6

    .line 2658
    iput v0, v10, Ll/᩻֨ܺ;->֫:F

    move/from16 v0, p7

    .line 2659
    iput v0, v10, Ll/᩻֨ܺ;->ۧ:F

    return-void
.end method

.method public final ۧ(FF)V
    .locals 1

    .line 2633
    iget-object v0, p0, Ll/᩻֨ܺ;->ܽ:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2634
    iput p1, p0, Ll/᩻֨ܺ;->֫:F

    .line 2635
    iput p2, p0, Ll/᩻֨ܺ;->ۧ:F

    return-void
.end method
