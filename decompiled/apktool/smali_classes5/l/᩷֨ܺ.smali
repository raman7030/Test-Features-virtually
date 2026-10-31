.class public Ll/᩷֨ܺ;
.super Ll/ۖ֨ܺ;
.source "TB7B"


# instance fields
.field public final synthetic ֫:Ll/ᩴ֨ܺ;

.field public ۧ:F

.field public ܽ:F


# direct methods
.method public constructor <init>(Ll/ᩴ֨ܺ;FF)V
    .locals 0

    .line 1578
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1550
    iput-object p1, p0, Ll/᩷֨ܺ;->֫:Ll/ᩴ֨ܺ;

    .line 1551
    iput p2, p0, Ll/᩷֨ܺ;->ۧ:F

    .line 1552
    iput p3, p0, Ll/᩷֨ܺ;->ܽ:F

    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/String;)V
    .locals 5

    .line 1560
    iget-object v0, p0, Ll/᩷֨ܺ;->֫:Ll/ᩴ֨ܺ;

    invoke-static {v0}, Ll/ᩴ֨ܺ;->ܽ(Ll/ᩴ֨ܺ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1562
    invoke-static {v0}, Ll/ᩴ֨ܺ;->ۧ(Ll/ᩴ֨ܺ;)Ll/ۡ֨ܺ;

    move-result-object v1

    iget-boolean v1, v1, Ll/ۡ֨ܺ;->ۧ:Z

    if-eqz v1, :cond_0

    .line 1563
    invoke-static {v0}, Ll/ᩴ֨ܺ;->֫(Ll/ᩴ֨ܺ;)Landroid/graphics/Canvas;

    move-result-object v1

    iget v2, p0, Ll/᩷֨ܺ;->ۧ:F

    iget v3, p0, Ll/᩷֨ܺ;->ܽ:F

    invoke-static {v0}, Ll/ᩴ֨ܺ;->ۧ(Ll/ᩴ֨ܺ;)Ll/ۡ֨ܺ;

    move-result-object v4

    iget-object v4, v4, Ll/ۡ֨ܺ;->֫:Landroid/graphics/Paint;

    invoke-virtual {v1, p1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1564
    :cond_0
    invoke-static {v0}, Ll/ᩴ֨ܺ;->ۧ(Ll/ᩴ֨ܺ;)Ll/ۡ֨ܺ;

    move-result-object v1

    iget-boolean v1, v1, Ll/ۡ֨ܺ;->ܽ:Z

    if-eqz v1, :cond_1

    .line 1565
    invoke-static {v0}, Ll/ᩴ֨ܺ;->֫(Ll/ᩴ֨ܺ;)Landroid/graphics/Canvas;

    move-result-object v1

    iget v2, p0, Ll/᩷֨ܺ;->ۧ:F

    iget v3, p0, Ll/᩷֨ܺ;->ܽ:F

    invoke-static {v0}, Ll/ᩴ֨ܺ;->ۧ(Ll/ᩴ֨ܺ;)Ll/ۡ֨ܺ;

    move-result-object v4

    iget-object v4, v4, Ll/ۡ֨ܺ;->ܿ:Landroid/graphics/Paint;

    invoke-virtual {v1, p1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1569
    :cond_1
    iget v1, p0, Ll/᩷֨ܺ;->ۧ:F

    invoke-static {v0}, Ll/ᩴ֨ܺ;->ۧ(Ll/ᩴ֨ܺ;)Ll/ۡ֨ܺ;

    move-result-object v0

    iget-object v0, v0, Ll/ۡ֨ܺ;->֫:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    add-float/2addr p1, v1

    iput p1, p0, Ll/᩷֨ܺ;->ۧ:F

    return-void
.end method
