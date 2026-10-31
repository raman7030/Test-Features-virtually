.class public final Ll/ܶۚ;
.super Ll/ۚۚ;
.source "L1CU"


# instance fields
.field public ֫:F

.field public ۧ:F

.field public ܽ:F

.field public final synthetic ᩳ:Ll/ۤۚ;


# direct methods
.method public constructor <init>(Ll/ۤۚ;)V
    .locals 0

    .line 1695
    iput-object p1, p0, Ll/ܶۚ;->ᩳ:Ll/ۤۚ;

    invoke-direct {p0}, Ll/ۚۚ;-><init>()V

    const/4 p1, 0x0

    .line 1696
    iput p1, p0, Ll/ܶۚ;->ۧ:F

    .line 1697
    iput p1, p0, Ll/ܶۚ;->֫:F

    return-void
.end method


# virtual methods
.method public final getInterpolation(F)F
    .locals 5

    .line 1708
    iget v0, p0, Ll/ܶۚ;->ۧ:F

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    iget-object v3, p0, Ll/ܶۚ;->ᩳ:Ll/ۤۚ;

    cmpl-float v1, v0, v1

    if-lez v1, :cond_1

    .line 1709
    iget v1, p0, Ll/ܶۚ;->ܽ:F

    div-float v4, v0, v1

    cmpg-float v4, v4, p1

    if-gez v4, :cond_0

    div-float p1, v0, v1

    :cond_0
    mul-float v4, v1, p1

    sub-float v4, v0, v4

    .line 1712
    iput v4, v3, Ll/ۤۚ;->ܺ֫:F

    mul-float v0, v0, p1

    mul-float v1, v1, p1

    mul-float v1, v1, p1

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    .line 1714
    iget p1, p0, Ll/ܶۚ;->֫:F

    add-float/2addr v0, p1

    return v0

    :cond_1
    neg-float v1, v0

    .line 1717
    iget v4, p0, Ll/ܶۚ;->ܽ:F

    div-float/2addr v1, v4

    cmpg-float v1, v1, p1

    if-gez v1, :cond_2

    neg-float p1, v0

    div-float/2addr p1, v4

    :cond_2
    mul-float v1, v4, p1

    add-float/2addr v1, v0

    .line 1720
    iput v1, v3, Ll/ۤۚ;->ܺ֫:F

    mul-float v0, v0, p1

    mul-float v4, v4, p1

    mul-float v4, v4, p1

    div-float/2addr v4, v2

    add-float/2addr v4, v0

    .line 1722
    iget p1, p0, Ll/ܶۚ;->֫:F

    add-float/2addr v4, p1

    return v4
.end method

.method public final ֫()F
    .locals 1

    .line 1728
    iget-object v0, p0, Ll/ܶۚ;->ᩳ:Ll/ۤۚ;

    iget v0, v0, Ll/ۤۚ;->ܺ֫:F

    return v0
.end method
