.class public final Ll/᩵᩺ۧ;
.super Ll/֨᩺ۧ;
.source "G5V7"


# instance fields
.field public ۖ:F

.field public ۘ:F

.field public ۜ:Landroid/graphics/Paint$Cap;

.field public ۡ:F

.field public ۢ:F

.field public ܳ:F

.field public ܺ:F

.field public ܿ:Ll/᩻ۗ;

.field public ᩳ:F

.field public ᩷:Landroid/graphics/Paint$Join;

.field public ᩻:Ll/᩻ۗ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1835
    invoke-direct {p0}, Ll/֨᩺ۧ;-><init>()V

    const/4 v0, 0x0

    .line 1822
    iput v0, p0, Ll/᩵᩺ۧ;->ۡ:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 1825
    iput v1, p0, Ll/᩵᩺ۧ;->ܳ:F

    .line 1826
    iput v1, p0, Ll/᩵᩺ۧ;->ᩳ:F

    .line 1827
    iput v0, p0, Ll/᩵᩺ۧ;->ۘ:F

    .line 1828
    iput v1, p0, Ll/᩵᩺ۧ;->ܺ:F

    .line 1829
    iput v0, p0, Ll/᩵᩺ۧ;->ۖ:F

    .line 1831
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Ll/᩵᩺ۧ;->ۜ:Landroid/graphics/Paint$Cap;

    .line 1832
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    iput-object v0, p0, Ll/᩵᩺ۧ;->᩷:Landroid/graphics/Paint$Join;

    const/high16 v0, 0x40800000    # 4.0f

    .line 1833
    iput v0, p0, Ll/᩵᩺ۧ;->ۢ:F

    return-void
.end method


# virtual methods
.method public getFillAlpha()F
    .locals 1

    .line 2028
    iget v0, p0, Ll/᩵᩺ۧ;->ᩳ:F

    return v0
.end method

.method public getFillColor()I
    .locals 1

    .line 2018
    iget-object v0, p0, Ll/᩵᩺ۧ;->ܿ:Ll/᩻ۗ;

    invoke-virtual {v0}, Ll/᩻ۗ;->֫()I

    move-result v0

    return v0
.end method

.method public getStrokeAlpha()F
    .locals 1

    .line 2007
    iget v0, p0, Ll/᩵᩺ۧ;->ܳ:F

    return v0
.end method

.method public getStrokeColor()I
    .locals 1

    .line 1987
    iget-object v0, p0, Ll/᩵᩺ۧ;->᩻:Ll/᩻ۗ;

    invoke-virtual {v0}, Ll/᩻ۗ;->֫()I

    move-result v0

    return v0
.end method

.method public getStrokeWidth()F
    .locals 1

    .line 1997
    iget v0, p0, Ll/᩵᩺ۧ;->ۡ:F

    return v0
.end method

.method public getTrimPathEnd()F
    .locals 1

    .line 2048
    iget v0, p0, Ll/᩵᩺ۧ;->ܺ:F

    return v0
.end method

.method public getTrimPathOffset()F
    .locals 1

    .line 2058
    iget v0, p0, Ll/᩵᩺ۧ;->ۖ:F

    return v0
.end method

.method public getTrimPathStart()F
    .locals 1

    .line 2038
    iget v0, p0, Ll/᩵᩺ۧ;->ۘ:F

    return v0
.end method

.method public setFillAlpha(F)V
    .locals 0

    .line 2033
    iput p1, p0, Ll/᩵᩺ۧ;->ᩳ:F

    return-void
.end method

.method public setFillColor(I)V
    .locals 1

    .line 2023
    iget-object v0, p0, Ll/᩵᩺ۧ;->ܿ:Ll/᩻ۗ;

    invoke-virtual {v0, p1}, Ll/᩻ۗ;->֫(I)V

    return-void
.end method

.method public setStrokeAlpha(F)V
    .locals 0

    .line 2012
    iput p1, p0, Ll/᩵᩺ۧ;->ܳ:F

    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1

    .line 1992
    iget-object v0, p0, Ll/᩵᩺ۧ;->᩻:Ll/᩻ۗ;

    invoke-virtual {v0, p1}, Ll/᩻ۗ;->֫(I)V

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 0

    .line 2002
    iput p1, p0, Ll/᩵᩺ۧ;->ۡ:F

    return-void
.end method

.method public setTrimPathEnd(F)V
    .locals 0

    .line 2053
    iput p1, p0, Ll/᩵᩺ۧ;->ܺ:F

    return-void
.end method

.method public setTrimPathOffset(F)V
    .locals 0

    .line 2063
    iput p1, p0, Ll/᩵᩺ۧ;->ۖ:F

    return-void
.end method

.method public setTrimPathStart(F)V
    .locals 0

    .line 2043
    iput p1, p0, Ll/᩵᩺ۧ;->ۘ:F

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 1960
    iget-object v0, p0, Ll/᩵᩺ۧ;->ܿ:Ll/᩻ۗ;

    invoke-virtual {v0}, Ll/᩻ۗ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩵᩺ۧ;->᩻:Ll/᩻ۗ;

    invoke-virtual {v0}, Ll/᩻ۗ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ֫([I)Z
    .locals 2

    .line 1965
    iget-object v0, p0, Ll/᩵᩺ۧ;->ܿ:Ll/᩻ۗ;

    invoke-virtual {v0, p1}, Ll/᩻ۗ;->֫([I)Z

    move-result v0

    .line 1966
    iget-object v1, p0, Ll/᩵᩺ۧ;->᩻:Ll/᩻ۗ;

    invoke-virtual {v1, p1}, Ll/᩻ۗ;->֫([I)Z

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method
