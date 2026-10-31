.class public final Ll/ۖۜۧ;
.super Ljava/lang/Object;
.source "N8JK"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final ֫:[F

.field public final ۧ:[F

.field public ܳ:Z

.field public final ܽ:Landroid/view/Display;

.field public final ܿ:[F

.field public final ᩳ:[Ll/ܺۜۧ;

.field public final ᩻:[F


# direct methods
.method public varargs constructor <init>(Landroid/view/Display;[Ll/ܺۜۧ;)V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [F

    .line 43
    iput-object v1, p0, Ll/ۖۜۧ;->ۧ:[F

    new-array v1, v0, [F

    .line 44
    iput-object v1, p0, Ll/ۖۜۧ;->᩻:[F

    new-array v0, v0, [F

    .line 45
    iput-object v0, p0, Ll/ۖۜۧ;->ܿ:[F

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 46
    iput-object v0, p0, Ll/ۖۜۧ;->֫:[F

    .line 52
    iput-object p1, p0, Ll/ۖۜۧ;->ܽ:Landroid/view/Display;

    .line 53
    iput-object p2, p0, Ll/ۖۜۧ;->ᩳ:[Ll/ܺۜۧ;

    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 11

    .line 59
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    iget-object v6, p0, Ll/ۖۜۧ;->ۧ:[F

    invoke-static {v6, p1}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    .line 60
    iget-object p1, p0, Ll/ۖۜۧ;->ܽ:Landroid/view/Display;

    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    move-result p1

    .line 100
    iget-object v7, p0, Ll/ۖۜۧ;->᩻:[F

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz p1, :cond_3

    const/16 v0, 0x81

    if-eq p1, v10, :cond_1

    const/16 v1, 0x82

    if-eq p1, v9, :cond_2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/16 v0, 0x82

    const/4 v1, 0x1

    goto :goto_0

    .line 116
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    const/4 v0, 0x2

    const/16 v1, 0x81

    .line 118
    :cond_2
    :goto_0
    array-length p1, v7

    invoke-static {v6, v8, v7, v8, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 119
    invoke-static {v7, v0, v1, v6}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    :cond_3
    const/16 p1, 0x83

    .line 91
    invoke-static {v6, v10, p1, v7}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    .line 93
    iget-object p1, p0, Ll/ۖۜۧ;->֫:[F

    invoke-static {v7, p1}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    .line 94
    aget p1, p1, v9

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x42b40000    # 90.0f

    const/high16 v3, 0x3f800000    # 1.0f

    move-object v0, v6

    .line 123
    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 80
    iget-boolean v0, p0, Ll/ۖۜۧ;->ܳ:Z

    iget-object v4, p0, Ll/ۖۜۧ;->ܿ:[F

    if-nez v0, :cond_4

    .line 81
    invoke-static {v4, v6}, Ll/ۡۜۧ;->֫([F[F)V

    .line 82
    iput-boolean v10, p0, Ll/ۖۜۧ;->ܳ:Z

    .line 84
    :cond_4
    array-length v0, v7

    invoke-static {v6, v8, v7, v8, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, v6

    move-object v2, v7

    .line 85
    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    :goto_1
    if-ge v8, v9, :cond_5

    .line 74
    iget-object v0, p0, Ll/ۖۜۧ;->ᩳ:[Ll/ܺۜۧ;

    aget-object v0, v0, v8

    .line 75
    invoke-interface {v0, p1, v6}, Ll/ܺۜۧ;->֫(F[F)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method
