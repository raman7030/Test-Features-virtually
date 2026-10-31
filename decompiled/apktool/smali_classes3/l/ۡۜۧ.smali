.class public final Ll/ۡۜۧ;
.super Ljava/lang/Object;
.source "Y8N5"


# instance fields
.field public final ֫:[F

.field public ۧ:Z

.field public final ܽ:[F

.field public final ᩳ:Ll/᩷֨֫;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [F

    .line 38
    iput-object v1, p0, Ll/ۡۜۧ;->֫:[F

    new-array v0, v0, [F

    .line 39
    iput-object v0, p0, Ll/ۡۜۧ;->ܽ:[F

    .line 40
    new-instance v0, Ll/᩷֨֫;

    invoke-direct {v0}, Ll/᩷֨֫;-><init>()V

    iput-object v0, p0, Ll/ۡۜۧ;->ᩳ:Ll/᩷֨֫;

    return-void
.end method

.method public static ֫([F[F)V
    .locals 6

    const/4 v0, 0x0

    .line 163
    invoke-static {p0, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    const/16 v1, 0xa

    .line 101
    aget v2, p1, v1

    mul-float v2, v2, v2

    const/16 v3, 0x8

    aget v4, p1, v3

    mul-float v4, v4, v4

    add-float/2addr v4, v2

    float-to-double v4, v4

    .line 103
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v2, v4

    .line 104
    aget v4, p1, v1

    div-float/2addr v4, v2

    aput v4, p0, v0

    .line 105
    aget p1, p1, v3

    div-float v0, p1, v2

    const/4 v5, 0x2

    aput v0, p0, v5

    neg-float p1, p1

    div-float/2addr p1, v2

    .line 106
    aput p1, p0, v3

    .line 107
    aput v4, p0, v1

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۡۜۧ;->ᩳ:Ll/᩷֨֫;

    invoke-virtual {v0}, Ll/᩷֨֫;->֫()V

    const/4 v0, 0x0

    .line 57
    iput-boolean v0, p0, Ll/ۡۜۧ;->ۧ:Z

    return-void
.end method

.method public final ֫(J[F)V
    .locals 12

    .line 70
    iget-object v0, p0, Ll/ۡۜۧ;->ᩳ:Ll/᩷֨֫;

    invoke-virtual {v0, p1, p2}, Ll/᩷֨֫;->ۧ(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [F

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x0

    .line 114
    aget v0, p1, p2

    const/4 v1, 0x1

    .line 115
    aget v2, p1, v1

    neg-float v2, v2

    const/4 v3, 0x2

    .line 116
    aget p1, p1, v3

    neg-float p1, p1

    .line 117
    invoke-static {v0, v2, p1}, Landroid/opengl/Matrix;->length(FFF)F

    move-result v3

    const/4 v4, 0x0

    .line 118
    iget-object v11, p0, Ll/ۡۜۧ;->ܽ:[F

    cmpl-float v4, v3, v4

    if-eqz v4, :cond_1

    float-to-double v4, v3

    .line 119
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v4

    double-to-float v7, v4

    div-float v8, v0, v3

    div-float v9, v2, v3

    div-float v10, p1, v3

    const/4 v6, 0x0

    move-object v5, v11

    .line 120
    invoke-static/range {v5 .. v10}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    goto :goto_0

    .line 163
    :cond_1
    invoke-static {v11, p2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 76
    :goto_0
    iget-boolean p1, p0, Ll/ۡۜۧ;->ۧ:Z

    iget-object v7, p0, Ll/ۡۜۧ;->֫:[F

    if-nez p1, :cond_2

    .line 77
    invoke-static {v7, v11}, Ll/ۡۜۧ;->֫([F[F)V

    .line 78
    iput-boolean v1, p0, Ll/ۡۜۧ;->ۧ:Z

    :cond_2
    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v6, 0x0

    move-object v5, p3

    move-object v9, v11

    .line 80
    invoke-static/range {v5 .. v10}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method public final ۧ(J[F)V
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ۡۜۧ;->ᩳ:Ll/᩷֨֫;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩷֨֫;->֫(JLjava/lang/Object;)V

    return-void
.end method
