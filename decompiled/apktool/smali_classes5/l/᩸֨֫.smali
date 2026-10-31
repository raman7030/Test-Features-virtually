.class public final Ll/᩸֨֫;
.super Ljava/lang/Object;
.source "B8U7"

# interfaces
.implements Ll/ܳ᩵֫;


# instance fields
.field public final ֫:F

.field public final ۧ:F


# direct methods
.method public constructor <init>(FF)V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x3d4c0000    # -90.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42b40000    # 90.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/high16 v0, -0x3ccc0000    # -180.0f

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x43340000    # 180.0f

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Invalid latitude or longitude"

    .line 50
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 53
    iput p1, p0, Ll/᩸֨֫;->֫:F

    .line 54
    iput p2, p0, Ll/᩸֨֫;->ۧ:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 62
    const-class v2, Ll/᩸֨֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 65
    :cond_1
    check-cast p1, Ll/᩸֨֫;

    .line 66
    iget v2, p0, Ll/᩸֨֫;->֫:F

    iget v3, p1, Ll/᩸֨֫;->֫:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_2

    iget v2, p0, Ll/᩸֨֫;->ۧ:F

    iget p1, p1, Ll/᩸֨֫;->ۧ:F

    cmpl-float p1, v2, p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 72
    iget v0, p0, Ll/᩸֨֫;->֫:F

    .line 0
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 73
    iget v1, p0, Ll/᩸֨֫;->ۧ:F

    .line 0
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "xyz: latitude="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩸֨֫;->֫:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩸֨֫;->ۧ:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫()Ll/۠ᩴ֫;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ᩳ᩵֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ۧ()[B
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
