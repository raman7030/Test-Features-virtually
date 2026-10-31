.class public final Ll/ۖ᩵֫;
.super Ljava/lang/Object;
.source "Q8MB"


# static fields
.field public static final ᩳ:Ll/ۖ᩵֫;


# instance fields
.field public final ֫:F

.field public final ۧ:I

.field public final ܽ:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 30
    new-instance v0, Ll/ۖ᩵֫;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Ll/ۖ᩵֫;-><init>(F)V

    sput-object v0, Ll/ۖ᩵֫;->ᩳ:Ll/ۖ᩵֫;

    const/4 v0, 0x0

    .line 128
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x1

    .line 129
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 47
    invoke-direct {p0, p1, v0}, Ll/ۖ᩵֫;-><init>(FF)V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 3

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    cmpl-float v2, p1, v1

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 61
    :goto_0
    invoke-static {v2}, Ll/᩺֡֫;->֫(Z)V

    cmpl-float v1, p2, v1

    if-lez v1, :cond_1

    const/4 v0, 0x1

    .line 62
    :cond_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 63
    iput p1, p0, Ll/ۖ᩵֫;->ܽ:F

    .line 64
    iput p2, p0, Ll/ۖ᩵֫;->֫:F

    const/high16 p2, 0x447a0000    # 1000.0f

    mul-float p1, p1, p2

    .line 65
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Ll/ۖ᩵֫;->ۧ:I

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

    .line 108
    const-class v2, Ll/ۖ᩵֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 111
    :cond_1
    check-cast p1, Ll/ۖ᩵֫;

    .line 112
    iget v2, p0, Ll/ۖ᩵֫;->ܽ:F

    iget v3, p1, Ll/ۖ᩵֫;->ܽ:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_2

    iget v2, p0, Ll/ۖ᩵֫;->֫:F

    iget p1, p1, Ll/ۖ᩵֫;->֫:F

    cmpl-float p1, v2, p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 118
    iget v0, p0, Ll/ۖ᩵֫;->ܽ:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 119
    iget v1, p0, Ll/ۖ᩵֫;->֫:F

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 125
    iget v0, p0, Ll/ۖ᩵֫;->ܽ:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget v1, p0, Ll/ۖ᩵֫;->֫:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "PlaybackParameters(speed=%.2f, pitch=%.2f)"

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(J)J
    .locals 2

    .line 77
    iget v0, p0, Ll/ۖ᩵֫;->ۧ:I

    int-to-long v0, v0

    mul-long p1, p1, v0

    return-wide p1
.end method
