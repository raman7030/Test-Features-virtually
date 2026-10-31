.class public final Ll/ۜ֨ܺ;
.super Ll/᩷֨ܺ;
.source "TB7B"


# instance fields
.field public final synthetic ܿ:Ll/ᩴ֨ܺ;

.field public ᩳ:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Ll/ᩴ֨ܺ;Landroid/graphics/Path;F)V
    .locals 1

    .line 1778
    iput-object p1, p0, Ll/ۜ֨ܺ;->ܿ:Ll/ᩴ֨ܺ;

    const/4 v0, 0x0

    .line 1779
    invoke-direct {p0, p1, p3, v0}, Ll/᩷֨ܺ;-><init>(Ll/ᩴ֨ܺ;FF)V

    .line 1780
    iput-object p2, p0, Ll/ۜ֨ܺ;->ᩳ:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 8

    .line 1786
    iget-object v0, p0, Ll/ۜ֨ܺ;->ܿ:Ll/ᩴ֨ܺ;

    invoke-static {v0}, Ll/ᩴ֨ܺ;->ܽ(Ll/ᩴ֨ܺ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1788
    invoke-static {v0}, Ll/ᩴ֨ܺ;->ۧ(Ll/ᩴ֨ܺ;)Ll/ۡ֨ܺ;

    move-result-object v1

    iget-boolean v1, v1, Ll/ۡ֨ܺ;->ۧ:Z

    if-eqz v1, :cond_0

    .line 1789
    invoke-static {v0}, Ll/ᩴ֨ܺ;->֫(Ll/ᩴ֨ܺ;)Landroid/graphics/Canvas;

    move-result-object v2

    iget v5, p0, Ll/᩷֨ܺ;->ۧ:F

    iget v6, p0, Ll/᩷֨ܺ;->ܽ:F

    invoke-static {v0}, Ll/ᩴ֨ܺ;->ۧ(Ll/ᩴ֨ܺ;)Ll/ۡ֨ܺ;

    move-result-object v1

    iget-object v7, v1, Ll/ۡ֨ܺ;->֫:Landroid/graphics/Paint;

    iget-object v4, p0, Ll/ۜ֨ܺ;->ᩳ:Landroid/graphics/Path;

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 1790
    :cond_0
    invoke-static {v0}, Ll/ᩴ֨ܺ;->ۧ(Ll/ᩴ֨ܺ;)Ll/ۡ֨ܺ;

    move-result-object v1

    iget-boolean v1, v1, Ll/ۡ֨ܺ;->ܽ:Z

    if-eqz v1, :cond_1

    .line 1791
    invoke-static {v0}, Ll/ᩴ֨ܺ;->֫(Ll/ᩴ֨ܺ;)Landroid/graphics/Canvas;

    move-result-object v2

    iget v5, p0, Ll/᩷֨ܺ;->ۧ:F

    iget v6, p0, Ll/᩷֨ܺ;->ܽ:F

    invoke-static {v0}, Ll/ᩴ֨ܺ;->ۧ(Ll/ᩴ֨ܺ;)Ll/ۡ֨ܺ;

    move-result-object v1

    iget-object v7, v1, Ll/ۡ֨ܺ;->ܿ:Landroid/graphics/Paint;

    iget-object v4, p0, Ll/ۜ֨ܺ;->ᩳ:Landroid/graphics/Path;

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 1795
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
