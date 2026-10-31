.class public final Ll/ᩴ᩹ۡ;
.super Ll/ۚ᩹ۡ;
.source "UBKO"


# instance fields
.field public ۖ:F

.field public ۘ:F

.field public ۜ:Ll/᩻ۗ;

.field public ۡ:F

.field public ۢ:Landroid/graphics/Paint$Join;

.field public ܳ:Ll/᩻ۗ;

.field public ܺ:F

.field public ܿ:F

.field public ᩴ:F

.field public ᩷:Landroid/graphics/Paint$Cap;

.field public ᩻:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1431
    invoke-direct {p0}, Ll/ۚ᩹ۡ;-><init>()V

    const/4 v0, 0x0

    .line 1418
    iput v0, p0, Ll/ᩴ᩹ۡ;->ܺ:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 1421
    iput v1, p0, Ll/ᩴ᩹ۡ;->᩻:F

    .line 1422
    iput v1, p0, Ll/ᩴ᩹ۡ;->ܿ:F

    .line 1423
    iput v0, p0, Ll/ᩴ᩹ۡ;->ᩴ:F

    .line 1424
    iput v1, p0, Ll/ᩴ᩹ۡ;->ۖ:F

    .line 1425
    iput v0, p0, Ll/ᩴ᩹ۡ;->ۘ:F

    .line 1427
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Ll/ᩴ᩹ۡ;->᩷:Landroid/graphics/Paint$Cap;

    .line 1428
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    iput-object v0, p0, Ll/ᩴ᩹ۡ;->ۢ:Landroid/graphics/Paint$Join;

    const/high16 v0, 0x40800000    # 4.0f

    .line 1429
    iput v0, p0, Ll/ᩴ᩹ۡ;->ۡ:F

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 1561
    iget-object v0, p0, Ll/ᩴ᩹ۡ;->ܳ:Ll/᩻ۗ;

    invoke-virtual {v0}, Ll/᩻ۗ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ᩴ᩹ۡ;->ۜ:Ll/᩻ۗ;

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

    .line 1566
    iget-object v0, p0, Ll/ᩴ᩹ۡ;->ܳ:Ll/᩻ۗ;

    invoke-virtual {v0, p1}, Ll/᩻ۗ;->֫([I)Z

    move-result v0

    .line 1567
    iget-object v1, p0, Ll/ᩴ᩹ۡ;->ۜ:Ll/᩻ۗ;

    invoke-virtual {v1, p1}, Ll/᩻ۗ;->֫([I)Z

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method
