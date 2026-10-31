.class public final Ll/᩵ܺۧ;
.super Ljava/lang/Object;
.source "R8ON"

# interfaces
.implements Ll/ܳ᩵֫;


# instance fields
.field public final ֫:F

.field public final ۧ:I


# direct methods
.method public constructor <init>(FI)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput p1, p0, Ll/᩵ܺۧ;->֫:F

    .line 45
    iput p2, p0, Ll/᩵ܺۧ;->ۧ:I

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

    .line 53
    const-class v2, Ll/᩵ܺۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 56
    :cond_1
    check-cast p1, Ll/᩵ܺۧ;

    .line 57
    iget v2, p0, Ll/᩵ܺۧ;->֫:F

    iget v3, p1, Ll/᩵ܺۧ;->֫:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_2

    iget v2, p0, Ll/᩵ܺۧ;->ۧ:I

    iget p1, p1, Ll/᩵ܺۧ;->ۧ:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 64
    iget v0, p0, Ll/᩵ܺۧ;->֫:F

    .line 0
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 65
    iget v1, p0, Ll/᩵ܺۧ;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "smta: captureFrameRate="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩵ܺۧ;->֫:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", svcTemporalLayerCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ܺۧ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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
