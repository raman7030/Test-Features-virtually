.class public final Ll/ۗ۠ۡ;
.super Ljava/lang/Object;
.source "86WH"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۛ۠ۡ;


# direct methods
.method public constructor <init>(Ll/ۛ۠ۡ;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ۠ۡ;->᩸:Ll/ۛ۠ۡ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 27

    move-object/from16 v0, p0

    .line 46
    iget-object v1, v0, Ll/ۗ۠ۡ;->᩸:Ll/ۛ۠ۡ;

    iget-object v8, v1, Ll/ۛ۠ۡ;->ۙ:[F

    invoke-static {v1}, Ll/ۛ۠ۡ;->᩷(Ll/ۛ۠ۡ;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v1}, Ll/ۛ۠ۡ;->ܽ(Ll/ۛ۠ۡ;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    .line 47
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-static {v1}, Ll/ۛ۠ۡ;->ܿ(Ll/ۛ۠ۡ;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v1, v2, v3}, Ll/ۛ۠ۡ;->֫(Ll/ۛ۠ۡ;J)V

    .line 48
    invoke-static {v1}, Ll/ۛ۠ۡ;->ۧ(Ll/ۛ۠ۡ;)J

    move-result-wide v2

    long-to-double v2, v2

    const-wide v4, 0x3e112e0be826d695L    # 1.0E-9

    mul-double v2, v2, v4

    const-wide/high16 v4, 0x403e000000000000L    # 30.0

    div-double/2addr v2, v4

    const/16 v9, 0x10

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    const/4 v10, 0x0

    cmpl-double v6, v2, v4

    if-ltz v6, :cond_1

    .line 50
    invoke-static {v1}, Ll/ۛ۠ۡ;->ᩴ(Ll/ۛ۠ۡ;)V

    .line 51
    invoke-static {v1}, Ll/ۛ۠ۡ;->ۚ(Ll/ۛ۠ۡ;)V

    .line 52
    invoke-static {v1}, Ll/ۛ۠ۡ;->ᩳ(Ll/ۛ۠ۡ;)[F

    move-result-object v2

    invoke-static {v2, v10, v8, v10, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    invoke-static {v1}, Ll/ۛ۠ۡ;->ܳ(Ll/ۛ۠ۡ;)Ljava/lang/Runnable;

    move-result-object v1

    check-cast v1, Ll/۠ۚۢ;

    invoke-virtual {v1}, Ll/۠ۚۢ;->run()V

    return-void

    :cond_1
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    rem-double v6, v2, v6

    const-wide v11, 0x4076800000000000L    # 360.0

    mul-double v6, v6, v11

    double-to-float v13, v6

    const-wide v6, 0x3ff921fb54442d18L    # 1.5707963267948966

    rem-double/2addr v2, v4

    mul-double v2, v2, v6

    .line 58
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    const/high16 v3, 0x41a00000    # 20.0f

    mul-float v3, v3, v2

    const/high16 v4, 0x41200000    # 10.0f

    mul-float v20, v2, v4

    .line 61
    invoke-static {v1}, Ll/ۛ۠ۡ;->ۜ(Ll/ۛ۠ۡ;)[F

    move-result-object v11

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    .line 62
    invoke-static {v1}, Ll/ۛ۠ۡ;->ۘ(Ll/ۛ۠ۡ;)[F

    move-result-object v21

    invoke-static {v1}, Ll/ۛ۠ۡ;->ۜ(Ll/ۛ۠ۡ;)[F

    move-result-object v23

    invoke-static {v1}, Ll/ۛ۠ۡ;->ᩳ(Ll/ۛ۠ۡ;)[F

    move-result-object v25

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 63
    invoke-static {v1}, Ll/ۛ۠ۡ;->ۜ(Ll/ۛ۠ۡ;)[F

    move-result-object v14

    const/4 v11, 0x0

    const/16 v19, 0x0

    const/high16 v17, 0x3f800000    # 1.0f

    move v15, v12

    move/from16 v16, v3

    move/from16 v18, v11

    invoke-static/range {v14 .. v19}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    .line 64
    invoke-static {v1}, Ll/ۛ۠ۡ;->ۜ(Ll/ۛ۠ۡ;)[F

    move-result-object v4

    invoke-static {v1}, Ll/ۛ۠ۡ;->ۘ(Ll/ۛ۠ۡ;)[F

    move-result-object v6

    const/4 v13, 0x0

    const/16 v21, 0x0

    move-object v2, v8

    move/from16 v3, v21

    move/from16 v5, v22

    move v7, v13

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 65
    invoke-static {v1}, Ll/ۛ۠ۡ;->ۜ(Ll/ۛ۠ۡ;)[F

    move-result-object v14

    const/high16 v19, 0x3f800000    # 1.0f

    const/16 v17, 0x0

    move/from16 v16, v20

    invoke-static/range {v14 .. v19}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    .line 66
    invoke-static {v1}, Ll/ۛ۠ۡ;->ۘ(Ll/ۛ۠ۡ;)[F

    move-result-object v2

    invoke-static {v1}, Ll/ۛ۠ۡ;->ۜ(Ll/ۛ۠ۡ;)[F

    move-result-object v4

    move-object v6, v8

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 67
    invoke-static {v1}, Ll/ۛ۠ۡ;->ۘ(Ll/ۛ۠ۡ;)[F

    move-result-object v2

    invoke-static {v2, v10, v8, v10, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    invoke-static {v1}, Ll/ۛ۠ۡ;->ܳ(Ll/ۛ۠ۡ;)Ljava/lang/Runnable;

    move-result-object v2

    check-cast v2, Ll/۠ۚۢ;

    invoke-virtual {v2}, Ll/۠ۚۢ;->run()V

    .line 69
    invoke-static {v1}, Ll/ۛ۠ۡ;->ۖ(Ll/ۛ۠ۡ;)Landroid/view/View;

    move-result-object v1

    const-wide/16 v2, 0x22

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    :goto_0
    return-void
.end method
