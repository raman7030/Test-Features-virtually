.class public final Ll/᩸ۜۧ;
.super Ljava/lang/Object;
.source "M8S0"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;
.implements Ll/ۙۜۧ;
.implements Ll/ܺۜۧ;


# instance fields
.field public final ۗ:[F

.field public final ۙ:Ll/ܶۜۧ;

.field public final ۛ:[F

.field public final ۤ:[F

.field public final ۨ:[F

.field public ۫:F

.field public final synthetic ۬:Ll/᩶ۜۧ;

.field public final ᩶:[F

.field public final ᩸:[F

.field public ᩹:F

.field public final ᩺:[F


# direct methods
.method public constructor <init>(Ll/᩶ۜۧ;Ll/ܶۜۧ;)V
    .locals 4

    .line 285
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۜۧ;->۬:Ll/᩶ۜۧ;

    const/16 p1, 0x10

    new-array v0, p1, [F

    .line 265
    iput-object v0, p0, Ll/᩸ۜۧ;->᩶:[F

    new-array v0, p1, [F

    .line 268
    iput-object v0, p0, Ll/᩸ۜۧ;->᩺:[F

    new-array v0, p1, [F

    .line 272
    iput-object v0, p0, Ll/᩸ۜۧ;->᩸:[F

    new-array v1, p1, [F

    .line 276
    iput-object v1, p0, Ll/᩸ۜۧ;->ۤ:[F

    new-array v2, p1, [F

    .line 277
    iput-object v2, p0, Ll/᩸ۜۧ;->ۛ:[F

    new-array v3, p1, [F

    .line 282
    iput-object v3, p0, Ll/᩸ۜۧ;->ۨ:[F

    new-array p1, p1, [F

    .line 283
    iput-object p1, p0, Ll/᩸ۜۧ;->ۗ:[F

    .line 286
    iput-object p2, p0, Ll/᩸ۜۧ;->ۙ:Ll/ܶۜۧ;

    const/4 p1, 0x0

    .line 163
    invoke-static {v0, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    invoke-static {v1, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    invoke-static {v2, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    const p1, 0x40490fdb    # (float)Math.PI

    .line 290
    iput p1, p0, Ll/᩸ۜۧ;->᩹:F

    return-void
.end method


# virtual methods
.method public final onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 13

    move-object v0, p0

    .line 311
    monitor-enter v0

    .line 312
    :try_start_0
    iget-object v1, p0, Ll/᩸ۜۧ;->ۗ:[F

    iget-object v3, p0, Ll/᩸ۜۧ;->᩸:[F

    iget-object v5, p0, Ll/᩸ۜۧ;->ۛ:[F

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 313
    iget-object v7, p0, Ll/᩸ۜۧ;->ۨ:[F

    iget-object v9, p0, Ll/᩸ۜۧ;->ۤ:[F

    iget-object v11, p0, Ll/᩸ۜۧ;->ۗ:[F

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 314
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 316
    iget-object v0, p0, Ll/᩸ۜۧ;->᩺:[F

    iget-object v2, p0, Ll/᩸ۜۧ;->᩶:[F

    iget-object v4, p0, Ll/᩸ۜۧ;->ۨ:[F

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 317
    iget-object p1, p0, Ll/᩸ۜۧ;->ۙ:Ll/ܶۜۧ;

    iget-object v0, p0, Ll/᩸ۜۧ;->᩺:[F

    invoke-virtual {p1, v0}, Ll/ܶۜۧ;->֫([F)V

    return-void

    :catchall_0
    move-exception p1

    .line 314
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 6

    const/4 p1, 0x0

    .line 300
    invoke-static {p1, p1, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    int-to-float p1, p2

    int-to-float p2, p3

    div-float v3, p1, p2

    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float p1, v3, p1

    if-lez p1, :cond_0

    const-wide p1, 0x4046800000000000L    # 45.0

    .line 365
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    move-result-wide p1

    float-to-double v0, v3

    div-double/2addr p1, v0

    .line 366
    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p1

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double p1, p1, v0

    double-to-float p1, p1

    move v2, p1

    goto :goto_0

    :cond_0
    const/high16 p1, 0x42b40000    # 90.0f

    const/high16 v2, 0x42b40000    # 90.0f

    :goto_0
    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x42c80000    # 100.0f

    .line 303
    iget-object v0, p0, Ll/᩸ۜۧ;->᩶:[F

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->perspectiveM([FIFFFF)V

    return-void
.end method

.method public final declared-synchronized onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 295
    :try_start_0
    iget-object p1, p0, Ll/᩸ۜۧ;->۬:Ll/᩶ۜۧ;

    iget-object p2, p0, Ll/᩸ۜۧ;->ۙ:Ll/ܶۜۧ;

    invoke-virtual {p2}, Ll/ܶۜۧ;->֫()Landroid/graphics/SurfaceTexture;

    move-result-object p2

    invoke-static {p1, p2}, Ll/᩶ۜۧ;->ۧ(Ll/᩶ۜۧ;Landroid/graphics/SurfaceTexture;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 296
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(F[F)V
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 324
    :try_start_0
    iget-object v1, p0, Ll/᩸ۜۧ;->᩸:[F

    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {p2, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    neg-float p1, p1

    .line 325
    iput p1, p0, Ll/᩸ۜۧ;->᩹:F

    .line 338
    iget-object v1, p0, Ll/᩸ۜۧ;->ۤ:[F

    iget p2, p0, Ll/᩸ۜۧ;->۫:F

    neg-float v3, p2

    float-to-double p1, p1

    .line 342
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    double-to-float v4, p1

    iget p1, p0, Ll/᩸ۜۧ;->᩹:F

    float-to-double p1, p1

    .line 343
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide p1

    double-to-float v5, p1

    const/4 v6, 0x0

    const/4 v2, 0x0

    .line 338
    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 327
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Landroid/graphics/PointF;)V
    .locals 14

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 350
    :try_start_0
    iget v1, p1, Landroid/graphics/PointF;->y:F

    iput v1, p0, Ll/᩸ۜۧ;->۫:F

    .line 338
    iget-object v2, p0, Ll/᩸ۜۧ;->ۤ:[F

    neg-float v4, v1

    iget v1, p0, Ll/᩸ۜۧ;->᩹:F

    float-to-double v5, v1

    .line 342
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    double-to-float v5, v5

    iget v1, p0, Ll/᩸ۜۧ;->᩹:F

    float-to-double v6, v1

    .line 343
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v6, v6

    const/4 v7, 0x0

    const/4 v3, 0x0

    .line 338
    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    .line 352
    iget-object v8, p0, Ll/᩸ۜۧ;->ۛ:[F

    iget p1, p1, Landroid/graphics/PointF;->x:F

    neg-float v10, p1

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 353
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
