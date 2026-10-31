.class public final Ll/ܶۜۧ;
.super Ljava/lang/Object;
.source "D8NK"

# interfaces
.implements Ll/᩹᩻ۧ;
.implements Ll/᩷ۜۧ;


# instance fields
.field public final ۗ:Ll/᩷֨֫;

.field public ۙ:I

.field public final ۛ:Ll/᩷֨֫;

.field public final ۤ:[F

.field public ۨ:Landroid/graphics/SurfaceTexture;

.field public final ۫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ۬:Ll/֨ۜۧ;

.field public ܰ:I

.field public ᩶:[B

.field public final ᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᩹:Ll/ۡۜۧ;

.field public final ᩺:[F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ܶۜۧ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 64
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/ܶۜۧ;->۫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 65
    new-instance v0, Ll/֨ۜۧ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object v0, p0, Ll/ܶۜۧ;->۬:Ll/֨ۜۧ;

    .line 66
    new-instance v0, Ll/ۡۜۧ;

    invoke-direct {v0}, Ll/ۡۜۧ;-><init>()V

    iput-object v0, p0, Ll/ܶۜۧ;->᩹:Ll/ۡۜۧ;

    .line 67
    new-instance v0, Ll/᩷֨֫;

    invoke-direct {v0}, Ll/᩷֨֫;-><init>()V

    iput-object v0, p0, Ll/ܶۜۧ;->ۛ:Ll/᩷֨֫;

    .line 68
    new-instance v0, Ll/᩷֨֫;

    invoke-direct {v0}, Ll/᩷֨֫;-><init>()V

    iput-object v0, p0, Ll/ܶۜۧ;->ۗ:Ll/᩷֨֫;

    const/16 v0, 0x10

    new-array v1, v0, [F

    .line 69
    iput-object v1, p0, Ll/ܶۜۧ;->ۤ:[F

    new-array v0, v0, [F

    .line 70
    iput-object v0, p0, Ll/ܶۜۧ;->᩺:[F

    const/4 v0, -0x1

    .line 72
    iput v0, p0, Ll/ܶۜۧ;->ۙ:I

    return-void
.end method

.method public static synthetic ֫(Ll/ܶۜۧ;)V
    .locals 1

    .line 103
    iget-object p0, p0, Ll/ܶۜۧ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/graphics/SurfaceTexture;
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, 0x3f000000    # 0.5f

    .line 92
    :try_start_0
    invoke-static {v1, v1, v1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 93
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    .line 95
    iget-object v0, p0, Ll/ܶۜۧ;->۬:Ll/֨ۜۧ;

    invoke-virtual {v0}, Ll/֨ۜۧ;->֫()V

    .line 96
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    .line 763
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 764
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    .line 765
    aget v0, v1, v2

    const v1, 0x8d65

    .line 662
    invoke-static {v1, v0}, Ll/ۘۚ֫;->֫(II)V

    .line 98
    iput v0, p0, Ll/ܶۜۧ;->ܰ:I
    :try_end_0
    .catch Ll/ۖۚ֫; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to initialize the renderer"

    .line 100
    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    :goto_0
    new-instance v0, Landroid/graphics/SurfaceTexture;

    iget v1, p0, Ll/ܶۜۧ;->ܰ:I

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v0, p0, Ll/ܶۜۧ;->ۨ:Landroid/graphics/SurfaceTexture;

    .line 103
    new-instance v1, Ll/۠ۜۧ;

    invoke-direct {v1, p0}, Ll/۠ۜۧ;-><init>(Ll/ܶۜۧ;)V

    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 104
    iget-object v0, p0, Ll/ܶۜۧ;->ۨ:Landroid/graphics/SurfaceTexture;

    return-object v0
.end method

.method public final ֫(JJLl/۠ᩴ֫;Landroid/media/MediaFormat;)V
    .locals 27

    move-object/from16 v0, p0

    move-wide/from16 v1, p3

    move-object/from16 v3, p5

    .line 163
    iget-object v4, v0, Ll/ܶۜۧ;->ۛ:Ll/᩷֨֫;

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v1, v2, v5}, Ll/᩷֨֫;->֫(JLjava/lang/Object;)V

    .line 164
    iget-object v4, v3, Ll/۠ᩴ֫;->ܰ:[B

    iget v3, v3, Ll/۠ᩴ֫;->ܿ֫:I

    .line 190
    iget-object v5, v0, Ll/ܶۜۧ;->᩶:[B

    .line 191
    iget v6, v0, Ll/ܶۜۧ;->ۙ:I

    .line 192
    iput-object v4, v0, Ll/ܶۜۧ;->᩶:[B

    const/4 v7, -0x1

    if-ne v3, v7, :cond_0

    const/4 v3, 0x0

    .line 193
    :cond_0
    iput v3, v0, Ll/ܶۜۧ;->ۙ:I

    if-ne v6, v3, :cond_1

    .line 194
    invoke-static {v5, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_1

    return-void

    .line 199
    :cond_1
    iget-object v3, v0, Ll/ܶۜۧ;->᩶:[B

    if-eqz v3, :cond_2

    .line 200
    iget v4, v0, Ll/ܶۜۧ;->ۙ:I

    invoke-static {v4, v3}, Ll/֡ۜۧ;->֫(I[B)Ll/᩵ۜۧ;

    move-result-object v3

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_3

    .line 203
    invoke-static {v3}, Ll/֨ۜۧ;->ۧ(Ll/᩵ۜۧ;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_6

    .line 205
    :cond_3
    iget v3, v0, Ll/ܶۜۧ;->ۙ:I

    const/high16 v4, 0x43340000    # 180.0f

    float-to-double v4, v4

    .line 96
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    double-to-float v4, v4

    const/high16 v5, 0x43b40000    # 360.0f

    float-to-double v5, v5

    .line 97
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    double-to-float v5, v5

    const/16 v6, 0x24

    int-to-float v7, v6

    div-float v7, v4, v7

    const/16 v8, 0x48

    int-to-float v8, v8

    div-float v8, v5, v8

    const/16 v9, 0x3e70

    new-array v9, v9, [F

    const/16 v10, 0x29a0

    new-array v10, v10, [F

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_1
    if-ge v11, v6, :cond_a

    int-to-float v6, v11

    mul-float v6, v6, v7

    const/high16 v14, 0x40000000    # 2.0f

    div-float v15, v4, v14

    sub-float/2addr v6, v15

    add-int/lit8 v14, v11, 0x1

    move/from16 p2, v6

    int-to-float v6, v14

    mul-float v6, v6, v7

    sub-float/2addr v6, v15

    const/4 v15, 0x0

    move/from16 p5, v6

    :goto_2
    const/16 v6, 0x49

    if-ge v15, v6, :cond_9

    const/4 v6, 0x0

    move/from16 p6, v14

    :goto_3
    const/4 v14, 0x2

    if-ge v6, v14, :cond_8

    if-nez v6, :cond_4

    move/from16 v14, p2

    goto :goto_4

    :cond_4
    move/from16 v14, p5

    :goto_4
    int-to-float v1, v15

    mul-float v1, v1, v8

    const v2, 0x40490fdb    # (float)Math.PI

    add-float/2addr v2, v1

    const/high16 v16, 0x40000000    # 2.0f

    div-float v17, v5, v16

    sub-float v2, v2, v17

    add-int/lit8 v17, v12, 0x1

    move/from16 p1, v8

    const/high16 v8, 0x42480000    # 50.0f

    move/from16 v18, v3

    move/from16 v19, v4

    float-to-double v3, v8

    move/from16 v20, v7

    float-to-double v7, v2

    .line 125
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v21

    mul-double v21, v21, v3

    move v2, v15

    float-to-double v14, v14

    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    move-result-wide v23

    move-object/from16 v25, v10

    move/from16 v26, v11

    mul-double v10, v23, v21

    double-to-float v10, v10

    neg-float v10, v10

    aput v10, v9, v12

    add-int/lit8 v10, v12, 0x2

    .line 126
    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    move-result-wide v21

    move v11, v1

    mul-double v0, v21, v3

    double-to-float v0, v0

    aput v0, v9, v17

    add-int/lit8 v0, v12, 0x3

    .line 127
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    mul-double v7, v7, v3

    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    mul-double v3, v3, v7

    double-to-float v1, v3

    aput v1, v9, v10

    add-int/lit8 v1, v13, 0x1

    div-float v3, v11, v5

    .line 129
    aput v3, v25, v13

    add-int/lit8 v3, v13, 0x2

    add-int v11, v26, v6

    int-to-float v4, v11

    mul-float v4, v4, v20

    div-float v4, v4, v19

    .line 130
    aput v4, v25, v1

    if-nez v2, :cond_5

    if-eqz v6, :cond_6

    :cond_5
    const/16 v1, 0x48

    if-ne v2, v1, :cond_7

    const/4 v1, 0x1

    if-ne v6, v1, :cond_7

    :cond_6
    const/4 v1, 0x3

    .line 134
    invoke-static {v9, v12, v9, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v12, v12, 0x6

    const/4 v0, 0x2

    move-object/from16 v1, v25

    .line 141
    invoke-static {v1, v13, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v13, v13, 0x4

    goto :goto_5

    :cond_7
    move-object/from16 v1, v25

    move v12, v0

    move v13, v3

    :goto_5
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p0

    move/from16 v8, p1

    move-object v10, v1

    move v15, v2

    move/from16 v3, v18

    move/from16 v4, v19

    move/from16 v7, v20

    move/from16 v11, v26

    move-wide/from16 v1, p3

    goto/16 :goto_3

    :cond_8
    move/from16 v18, v3

    move/from16 v19, v4

    move/from16 v20, v7

    move/from16 p1, v8

    move-object v1, v10

    move/from16 v26, v11

    move v2, v15

    const/high16 v16, 0x40000000    # 2.0f

    add-int/lit8 v15, v2, 0x1

    move-object/from16 v0, p0

    move/from16 v14, p6

    move-wide/from16 v1, p3

    goto/16 :goto_2

    :cond_9
    move/from16 v18, v3

    move/from16 v19, v4

    move/from16 v20, v7

    move/from16 p1, v8

    move-object v1, v10

    move/from16 p6, v14

    const/16 v6, 0x24

    move-object/from16 v0, p0

    move/from16 v11, p6

    move-wide/from16 v1, p3

    goto/16 :goto_1

    :cond_a
    move/from16 v18, v3

    move-object v1, v10

    .line 154
    new-instance v0, Ll/ᩴۜۧ;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v9, v1}, Ll/ᩴۜۧ;-><init>(II[F[F)V

    .line 156
    new-instance v1, Ll/᩵ۜۧ;

    new-instance v4, Ll/ۘۜۧ;

    new-array v3, v3, [Ll/ᩴۜۧ;

    aput-object v0, v3, v2

    invoke-direct {v4, v3}, Ll/ۘۜۧ;-><init>([Ll/ᩴۜۧ;)V

    move/from16 v0, v18

    .line 181
    invoke-direct {v1, v4, v4, v0}, Ll/᩵ۜۧ;-><init>(Ll/ۘۜۧ;Ll/ۘۜۧ;I)V

    move-object/from16 v0, p0

    move-object v3, v1

    .line 206
    :goto_6
    iget-object v1, v0, Ll/ܶۜۧ;->ۗ:Ll/᩷֨֫;

    move-wide/from16 v4, p3

    invoke-virtual {v1, v4, v5, v3}, Ll/᩷֨֫;->֫(JLjava/lang/Object;)V

    return-void
.end method

.method public final ֫(J[F)V
    .locals 1

    .line 171
    iget-object v0, p0, Ll/ܶۜۧ;->᩹:Ll/ۡۜۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۡۜۧ;->ۧ(J[F)V

    return-void
.end method

.method public final ֫([F)V
    .locals 11

    const-string v0, "Failed to draw a frame"

    const/16 v1, 0x4000

    .line 117
    invoke-static {v1}, Landroid/opengl/GLES20;->glClear(I)V

    .line 119
    :try_start_0
    invoke-static {}, Ll/ۘۚ֫;->֫()V
    :try_end_0
    .catch Ll/ۖۚ֫; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 121
    invoke-static {v0, v1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    :goto_0
    iget-object v1, p0, Ll/ܶۜۧ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    iget-object v4, p0, Ll/ܶۜۧ;->۬:Ll/֨ۜۧ;

    if-eqz v1, :cond_2

    .line 125
    iget-object v1, p0, Ll/ܶۜۧ;->ۨ:Landroid/graphics/SurfaceTexture;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    invoke-virtual {v1}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 127
    :try_start_1
    invoke-static {}, Ll/ۘۚ֫;->֫()V
    :try_end_1
    .catch Ll/ۖۚ֫; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 129
    invoke-static {v0, v1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 131
    :goto_1
    iget-object v0, p0, Ll/ܶۜۧ;->۫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    iget-object v1, p0, Ll/ܶۜۧ;->ۤ:[F

    if-eqz v0, :cond_0

    .line 163
    invoke-static {v1, v3}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 134
    :cond_0
    iget-object v0, p0, Ll/ܶۜۧ;->ۨ:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    move-result-wide v2

    .line 135
    iget-object v0, p0, Ll/ܶۜۧ;->ۛ:Ll/᩷֨֫;

    invoke-virtual {v0, v2, v3}, Ll/᩷֨֫;->֫(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 137
    iget-object v5, p0, Ll/ܶۜۧ;->᩹:Ll/ۡۜۧ;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7, v1}, Ll/ۡۜۧ;->֫(J[F)V

    .line 139
    :cond_1
    iget-object v0, p0, Ll/ܶۜۧ;->ۗ:Ll/᩷֨֫;

    invoke-virtual {v0, v2, v3}, Ll/᩷֨֫;->ۧ(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ۜۧ;

    if-eqz v0, :cond_2

    .line 141
    invoke-virtual {v4, v0}, Ll/֨ۜۧ;->֫(Ll/᩵ۜۧ;)V

    .line 144
    :cond_2
    iget-object v9, p0, Ll/ܶۜۧ;->ۤ:[F

    const/4 v10, 0x0

    iget-object v5, p0, Ll/ܶۜۧ;->᩺:[F

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v7, p1

    invoke-static/range {v5 .. v10}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 145
    iget p1, p0, Ll/ܶۜۧ;->ܰ:I

    iget-object v0, p0, Ll/ܶۜۧ;->᩺:[F

    invoke-virtual {v4, p1, v0}, Ll/֨ۜۧ;->֫(I[F)V

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 176
    iget-object v0, p0, Ll/ܶۜۧ;->ۛ:Ll/᩷֨֫;

    invoke-virtual {v0}, Ll/᩷֨֫;->֫()V

    .line 177
    iget-object v0, p0, Ll/ܶۜۧ;->᩹:Ll/ۡۜۧ;

    invoke-virtual {v0}, Ll/ۡۜۧ;->֫()V

    .line 178
    iget-object v0, p0, Ll/ܶۜۧ;->۫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
