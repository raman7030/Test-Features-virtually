.class public final Ll/ܺ᩶ۡ;
.super Ljava/lang/Object;
.source "RBJM"


# static fields
.field public static final ֫:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "VdNodeRender"

    .line 32
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ܺ᩶ۡ;->֫:Ljava/util/logging/Logger;

    return-void
.end method

.method public static ֫(Landroid/graphics/Path;DDDDDDDZZ)V
    .locals 51

    move-wide/from16 v1, p1

    move-wide/from16 v13, p3

    move-wide/from16 v11, p5

    move-wide/from16 v9, p9

    move-wide/from16 v7, p11

    move/from16 v15, p16

    .line 274
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v5, ","

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v6, ")-("

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v13, p7

    invoke-virtual {v3, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, ") {"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, "}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ll/ܺ᩶ۡ;->֫:Ljava/util/logging/Logger;

    invoke-virtual {v4, v0, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    const-wide v16, 0x400921fb54442d18L    # Math.PI

    mul-double v18, p13, v16

    const-wide v20, 0x4066800000000000L    # 180.0

    div-double v18, v18, v20

    .line 279
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    move-result-wide v20

    .line 280
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sin(D)D

    move-result-wide v22

    mul-double v24, v1, v20

    move-object v13, v4

    move-wide/from16 v3, p3

    move-object v14, v5

    move-object v15, v6

    move-wide/from16 v5, v22

    move-wide/from16 v7, v24

    .line 283
    invoke-static/range {v3 .. v10}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v9

    neg-double v3, v1

    mul-double v7, v3, v22

    move-wide/from16 v3, p3

    move-wide/from16 v5, v20

    move-wide v1, v9

    move-wide/from16 v9, p11

    .line 284
    invoke-static/range {v3 .. v10}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v9

    mul-double v7, v11, v20

    move-wide/from16 v3, p7

    move-wide/from16 v5, v22

    move-wide/from16 v26, v9

    move-wide/from16 v9, p9

    .line 285
    invoke-static/range {v3 .. v10}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v9

    neg-double v3, v11

    mul-double v7, v3, v22

    move-wide/from16 v3, p7

    move-wide/from16 v5, v20

    move-wide v11, v9

    move-wide/from16 v9, p11

    .line 286
    invoke-static/range {v3 .. v10}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v3

    .line 287
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "unit space ("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v6, v26

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v8, ")"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v0, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    sub-double v9, v1, v11

    sub-double v14, v6, v3

    add-double v24, v1, v11

    const-wide/high16 v26, 0x4000000000000000L    # 2.0

    div-double v24, v24, v26

    add-double v28, v6, v3

    div-double v28, v28, v26

    mul-double v30, v9, v9

    mul-double v32, v14, v14

    move-wide/from16 v34, v11

    add-double v11, v32, v30

    const-wide/16 v30, 0x0

    cmpl-double v5, v11, v30

    if-nez v5, :cond_0

    const-string v1, " Points are coincident"

    .line 297
    invoke-virtual {v13, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    return-void

    :cond_0
    const-wide/high16 v32, 0x3ff0000000000000L    # 1.0

    div-double v36, v32, v11

    const-wide/high16 v38, 0x3fd0000000000000L    # 0.25

    sub-double v36, v36, v38

    cmpg-double v5, v36, v30

    if-gez v5, :cond_1

    .line 302
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Points are too far apart "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 303
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide v2, 0x3ffffff583a53b8eL    # 1.99999

    div-double/2addr v0, v2

    move-wide/from16 v11, p9

    mul-double v9, v11, v0

    move-wide/from16 v2, p11

    mul-double v11, v2, v0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v13, p13

    move/from16 v15, p15

    move/from16 v16, p16

    .line 304
    invoke-static/range {v0 .. v16}, Ll/ܺ᩶ۡ;->֫(Landroid/graphics/Path;DDDDDDDZZ)V

    return-void

    :cond_1
    move-wide/from16 v11, p9

    .line 308
    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v36

    mul-double v9, v9, v36

    mul-double v36, v36, v14

    move/from16 v5, p15

    move/from16 v8, p16

    if-ne v5, v8, :cond_2

    sub-double v24, v24, v36

    add-double v28, v28, v9

    goto :goto_0

    :cond_2
    add-double v24, v24, v36

    sub-double v28, v28, v9

    :goto_0
    sub-double v9, v6, v28

    sub-double v1, v1, v24

    .line 321
    invoke-static {v9, v10, v1, v2}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v5

    .line 322
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v14, "eta0 = Math.atan2("

    invoke-direct {v7, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v9, ", "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ") = "

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    invoke-static {v5, v6}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v14

    invoke-virtual {v7, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 322
    invoke-virtual {v13, v0, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    sub-double v3, v3, v28

    sub-double v14, v34, v24

    .line 325
    invoke-static {v3, v4, v14, v15}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v34

    .line 326
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v7, "eta1 = Math.atan2("

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    invoke-static/range {v34 .. v35}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 326
    invoke-virtual {v13, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    sub-double v34, v34, v5

    cmpl-double v1, v34, v30

    if-ltz v1, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eq v8, v2, :cond_5

    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    if-lez v1, :cond_4

    sub-double v34, v34, v2

    goto :goto_2

    :cond_4
    add-double v34, v34, v2

    :cond_5
    :goto_2
    mul-double v24, v24, v11

    move-wide/from16 v1, p11

    mul-double v28, v28, v1

    mul-double v3, v24, v20

    mul-double v7, v28, v22

    sub-double/2addr v3, v7

    mul-double v24, v24, v22

    mul-double v28, v28, v20

    add-double v7, v28, v24

    .line 342
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "cx = "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v10, ", cy = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v10, ", a = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v10, ", b = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v10, ", x0 = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v14, p1

    invoke-virtual {v9, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v10, ", y0 = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v14, p3

    invoke-virtual {v9, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v10, ", thetaD = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v14

    invoke-virtual {v9, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v10, ", eta0 = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    invoke-static {v5, v6}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v14

    invoke-virtual {v9, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v10, ", sweep = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v34 .. v35}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v14

    invoke-virtual {v9, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 342
    invoke-virtual {v13, v0, v9}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    const-wide/high16 v9, 0x4010000000000000L    # 4.0

    mul-double v13, v34, v9

    div-double v13, v13, v16

    .line 369
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v13

    double-to-int v0, v13

    .line 372
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    .line 373
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    .line 374
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v17

    .line 375
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v19

    neg-double v9, v11

    mul-double v21, v9, v13

    mul-double v23, v21, v19

    mul-double v28, v1, v15

    mul-double v30, v28, v17

    sub-double v23, v23, v30

    mul-double v9, v9, v15

    mul-double v19, v19, v9

    mul-double v1, v1, v13

    mul-double v17, v17, v1

    add-double v17, v17, v19

    move-wide/from16 p7, v5

    int-to-double v5, v0

    div-double v34, v34, v5

    const/4 v5, 0x0

    move-wide/from16 v19, p7

    move-wide/from16 v30, v23

    move-wide/from16 v23, v17

    move-wide/from16 v17, p3

    :goto_3
    if-ge v5, v0, :cond_6

    add-double v36, v19, v34

    .line 382
    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->sin(D)D

    move-result-wide v38

    .line 383
    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->cos(D)D

    move-result-wide v40

    mul-double v42, v11, v13

    mul-double v42, v42, v40

    add-double v42, v42, v3

    mul-double v44, v28, v38

    move-wide/from16 p7, v3

    sub-double v3, v42, v44

    mul-double v42, v11, v15

    mul-double v42, v42, v40

    add-double v42, v42, v7

    mul-double v44, v1, v38

    move-wide/from16 p13, v7

    add-double v6, v44, v42

    mul-double v42, v21, v38

    mul-double v44, v28, v40

    sub-double v42, v42, v44

    mul-double v38, v38, v9

    mul-double v40, v40, v1

    add-double v38, v40, v38

    sub-double v19, v36, v19

    div-double v40, v19, v26

    .line 388
    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->tan(D)D

    move-result-wide v40

    .line 389
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->sin(D)D

    move-result-wide v19

    const-wide/high16 v44, 0x4008000000000000L    # 3.0

    mul-double v46, v40, v44

    mul-double v46, v46, v40

    const-wide/high16 v40, 0x4010000000000000L    # 4.0

    add-double v46, v46, v40

    .line 390
    invoke-static/range {v46 .. v47}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v46

    sub-double v46, v46, v32

    mul-double v46, v46, v19

    div-double v46, v46, v44

    mul-double v30, v30, v46

    move v8, v0

    move-wide/from16 p5, v1

    add-double v0, v30, p1

    mul-double v23, v23, v46

    move/from16 p1, v8

    move-wide/from16 p15, v9

    add-double v8, v23, v17

    mul-double v17, v46, v42

    sub-double v10, v3, v17

    mul-double v46, v46, v38

    move-wide/from16 v17, v13

    sub-double v12, v6, v46

    double-to-float v0, v0

    double-to-float v1, v8

    double-to-float v2, v10

    double-to-float v8, v12

    double-to-float v9, v3

    double-to-float v10, v6

    move-object/from16 v44, p0

    move/from16 v45, v0

    move/from16 v46, v1

    move/from16 v47, v2

    move/from16 v48, v8

    move/from16 v49, v9

    move/from16 v50, v10

    .line 396
    invoke-virtual/range {v44 .. v50}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-int/lit8 v5, v5, 0x1

    move/from16 v0, p1

    move-wide/from16 v1, p5

    move-wide/from16 v11, p9

    move-wide/from16 v9, p15

    move-wide/from16 p1, v3

    move-wide/from16 v13, v17

    move-wide/from16 v19, v36

    move-wide/from16 v23, v38

    move-wide/from16 v30, v42

    move-wide/from16 v3, p7

    move-wide/from16 v17, v6

    move-wide/from16 v7, p13

    goto/16 :goto_3

    :cond_6
    return-void
.end method

.method public static ֫([Ll/ۖ᩶ۡ;Landroid/graphics/Path;)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    const/4 v1, 0x6

    new-array v15, v1, [F

    .line 37
    array-length v12, v0

    const/16 v1, 0x20

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v12, :cond_17

    aget-object v19, v0, v13

    .line 38
    invoke-virtual/range {v19 .. v19}, Ll/ۖ᩶ۡ;->ۧ()C

    move-result v20

    invoke-virtual/range {v19 .. v19}, Ll/ۖ᩶ۡ;->֫()[F

    move-result-object v10

    .line 47
    aget v2, v15, v18

    const/16 v21, 0x1

    .line 48
    aget v3, v15, v21

    const/16 v22, 0x2

    .line 49
    aget v4, v15, v22

    const/16 v23, 0x3

    .line 50
    aget v5, v15, v23

    const/16 v24, 0x4

    .line 51
    aget v6, v15, v24

    const/16 v25, 0x5

    .line 52
    aget v7, v15, v25

    sparse-switch v20, :sswitch_data_0

    goto :goto_1

    .line 57
    :sswitch_0
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Path;->close()V

    move v2, v6

    move v3, v7

    goto :goto_1

    :sswitch_1
    const/4 v8, 0x4

    const/16 v26, 0x4

    goto :goto_2

    :sswitch_2
    const/4 v8, 0x1

    const/16 v26, 0x1

    goto :goto_2

    :sswitch_3
    const/4 v8, 0x6

    const/16 v26, 0x6

    goto :goto_2

    :sswitch_4
    const/4 v8, 0x7

    const/16 v26, 0x7

    goto :goto_2

    :goto_1
    const/4 v8, 0x2

    const/16 v26, 0x2

    :goto_2
    const/4 v8, 0x0

    move v11, v2

    move v8, v3

    move/from16 v27, v6

    move/from16 v28, v7

    const/4 v9, 0x0

    .line 90
    :goto_3
    array-length v2, v10

    if-ge v9, v2, :cond_16

    const/16 v2, 0x54

    const/16 v3, 0x51

    const/16 v6, 0x74

    const/16 v7, 0x71

    const/16 v16, 0x0

    const/high16 v17, 0x40000000    # 2.0f

    sparse-switch v20, :sswitch_data_1

    move v3, v8

    move/from16 v39, v9

    move-object/from16 v32, v10

    move v0, v11

    :goto_4
    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    goto/16 :goto_1e

    .line 153
    :sswitch_5
    aget v1, v10, v9

    add-float/2addr v8, v1

    .line 154
    invoke-virtual {v14, v11, v8}, Landroid/graphics/Path;->lineTo(FF)V

    goto/16 :goto_e

    :sswitch_6
    if-eq v1, v7, :cond_1

    if-eq v1, v6, :cond_1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_5

    :cond_0
    const/4 v1, 0x0

    goto :goto_6

    :cond_1
    :goto_5
    const/4 v1, 0x1

    :goto_6
    if-eqz v1, :cond_2

    mul-float v2, v11, v17

    sub-float/2addr v2, v4

    goto :goto_7

    :cond_2
    move v2, v11

    :goto_7
    if-eqz v1, :cond_3

    mul-float v17, v17, v8

    sub-float v17, v17, v5

    move/from16 v1, v17

    goto :goto_8

    :cond_3
    move v1, v8

    .line 222
    :goto_8
    aget v3, v10, v9

    add-float/2addr v3, v11

    add-int/lit8 v4, v9, 0x1

    aget v5, v10, v4

    add-float/2addr v5, v8

    invoke-virtual {v14, v2, v1, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 225
    aget v3, v10, v9

    add-float/2addr v11, v3

    .line 226
    aget v3, v10, v4

    add-float/2addr v8, v3

    move v5, v1

    move v4, v2

    goto/16 :goto_e

    :sswitch_7
    const/16 v2, 0x63

    if-eq v1, v2, :cond_5

    const/16 v2, 0x73

    if-eq v1, v2, :cond_5

    const/16 v2, 0x43

    if-eq v1, v2, :cond_5

    const/16 v2, 0x53

    if-ne v1, v2, :cond_4

    goto :goto_9

    :cond_4
    const/4 v1, 0x0

    goto :goto_a

    :cond_5
    :goto_9
    const/4 v1, 0x1

    :goto_a
    if-eqz v1, :cond_6

    mul-float v2, v11, v17

    sub-float/2addr v2, v4

    goto :goto_b

    :cond_6
    move v2, v11

    :goto_b
    if-eqz v1, :cond_7

    mul-float v17, v17, v8

    sub-float v17, v17, v5

    move/from16 v3, v17

    goto :goto_c

    :cond_7
    move v3, v8

    .line 182
    :goto_c
    aget v1, v10, v9

    add-float v4, v11, v1

    add-int/lit8 v16, v9, 0x1

    aget v1, v10, v16

    add-float v5, v8, v1

    add-int/lit8 v17, v9, 0x2

    aget v1, v10, v17

    add-float v6, v11, v1

    add-int/lit8 v29, v9, 0x3

    aget v1, v10, v29

    add-float v7, v8, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 184
    aget v1, v10, v9

    add-float/2addr v1, v11

    .line 185
    aget v2, v10, v16

    add-float/2addr v2, v8

    .line 186
    aget v3, v10, v17

    add-float/2addr v11, v3

    .line 187
    aget v3, v10, v29

    goto/16 :goto_d

    .line 201
    :sswitch_8
    aget v1, v10, v9

    add-float/2addr v1, v11

    add-int/lit8 v2, v9, 0x1

    aget v3, v10, v2

    add-float/2addr v3, v8

    add-int/lit8 v4, v9, 0x2

    aget v5, v10, v4

    add-float/2addr v5, v11

    add-int/lit8 v6, v9, 0x3

    aget v7, v10, v6

    add-float/2addr v7, v8

    invoke-virtual {v14, v1, v3, v5, v7}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 203
    aget v1, v10, v9

    add-float/2addr v1, v11

    .line 204
    aget v2, v10, v2

    add-float/2addr v2, v8

    .line 206
    aget v3, v10, v4

    add-float/2addr v11, v3

    .line 207
    aget v3, v10, v6

    goto :goto_d

    .line 96
    :sswitch_9
    aget v1, v10, v9

    add-float/2addr v11, v1

    add-int/lit8 v1, v9, 0x1

    .line 97
    aget v1, v10, v1

    add-float/2addr v8, v1

    if-lez v9, :cond_8

    .line 101
    invoke-virtual {v14, v11, v8}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_e

    .line 103
    :cond_8
    invoke-virtual {v14, v11, v8}, Landroid/graphics/Path;->moveTo(FF)V

    move/from16 v28, v8

    move/from16 v39, v9

    move-object/from16 v32, v10

    move/from16 v27, v11

    goto/16 :goto_4

    .line 124
    :sswitch_a
    aget v1, v10, v9

    add-float/2addr v11, v1

    add-int/lit8 v1, v9, 0x1

    .line 125
    aget v1, v10, v1

    add-float/2addr v8, v1

    .line 126
    invoke-virtual {v14, v11, v8}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_e

    .line 143
    :sswitch_b
    aget v1, v10, v9

    add-float/2addr v11, v1

    .line 144
    invoke-virtual {v14, v11, v8}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_e

    .line 163
    :sswitch_c
    aget v1, v10, v9

    add-float v2, v1, v11

    add-int/lit8 v1, v9, 0x1

    aget v1, v10, v1

    add-float v3, v1, v8

    add-int/lit8 v16, v9, 0x2

    aget v1, v10, v16

    add-float v4, v1, v11

    add-int/lit8 v17, v9, 0x3

    aget v1, v10, v17

    add-float v5, v1, v8

    add-int/lit8 v29, v9, 0x4

    aget v1, v10, v29

    add-float v6, v1, v11

    add-int/lit8 v30, v9, 0x5

    aget v1, v10, v30

    add-float v7, v1, v8

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 165
    aget v1, v10, v16

    add-float/2addr v1, v11

    .line 166
    aget v2, v10, v17

    add-float/2addr v2, v8

    .line 167
    aget v3, v10, v29

    add-float/2addr v11, v3

    .line 168
    aget v3, v10, v30

    :goto_d
    add-float/2addr v8, v3

    move v4, v1

    move v5, v2

    :goto_e
    move/from16 v39, v9

    move-object/from16 v32, v10

    goto/16 :goto_4

    :sswitch_d
    float-to-double v2, v11

    float-to-double v4, v8

    add-int/lit8 v29, v9, 0x5

    .line 242
    aget v1, v10, v29

    add-float/2addr v1, v11

    float-to-double v6, v1

    add-int/lit8 v30, v9, 0x6

    aget v1, v10, v30

    add-float/2addr v1, v8

    move/from16 v32, v11

    move/from16 v31, v12

    float-to-double v11, v1

    aget v1, v10, v9

    .line 243
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    move/from16 v33, v13

    float-to-double v13, v1

    add-int/lit8 v1, v9, 0x1

    aget v1, v10, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    move-wide/from16 v34, v13

    float-to-double v13, v1

    add-int/lit8 v1, v9, 0x2

    aget v1, v10, v1

    move-wide/from16 v36, v13

    float-to-double v13, v1

    add-int/lit8 v1, v9, 0x3

    aget v1, v10, v1

    cmpl-float v1, v1, v16

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    const/16 v17, 0x1

    goto :goto_f

    :cond_9
    const/4 v1, 0x0

    const/16 v17, 0x0

    :goto_f
    add-int/lit8 v1, v9, 0x4

    aget v1, v10, v1

    cmpl-float v1, v1, v16

    if-eqz v1, :cond_a

    const/4 v1, 0x1

    const/16 v38, 0x1

    goto :goto_10

    :cond_a
    const/4 v1, 0x0

    const/16 v38, 0x0

    :goto_10
    move-object/from16 v1, p1

    move v0, v8

    move/from16 v39, v9

    move-wide v8, v11

    move/from16 v12, v32

    move-object/from16 v32, v10

    move-wide/from16 v10, v34

    move-wide/from16 v34, v13

    move v14, v12

    move-wide/from16 v12, v36

    move/from16 v37, v0

    move v0, v14

    move-object/from16 v36, v15

    move-wide/from16 v14, v34

    move/from16 v16, v17

    move/from16 v17, v38

    .line 242
    invoke-static/range {v1 .. v17}, Ll/ܺ᩶ۡ;->֫(Landroid/graphics/Path;DDDDDDDZZ)V

    .line 245
    aget v1, v32, v29

    add-float v11, v0, v1

    .line 246
    aget v0, v32, v30

    add-float v8, v37, v0

    move v5, v8

    move v4, v11

    goto/16 :goto_1e

    :sswitch_e
    move/from16 v39, v9

    move-object/from16 v32, v10

    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    .line 137
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Path;->close()V

    move/from16 v11, v27

    move/from16 v8, v28

    goto/16 :goto_1e

    :sswitch_f
    move/from16 v39, v9

    move-object/from16 v32, v10

    move v0, v11

    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    .line 158
    aget v1, v32, v39

    move-object/from16 v14, p1

    invoke-virtual {v14, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 159
    aget v1, v32, v39

    :goto_11
    move v8, v1

    goto/16 :goto_1e

    :sswitch_10
    move/from16 v37, v8

    move/from16 v39, v9

    move-object/from16 v32, v10

    move v0, v11

    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    if-eq v1, v7, :cond_c

    if-eq v1, v6, :cond_c

    if-eq v1, v3, :cond_c

    if-ne v1, v2, :cond_b

    goto :goto_12

    :cond_b
    const/4 v1, 0x0

    goto :goto_13

    :cond_c
    :goto_12
    const/4 v1, 0x1

    :goto_13
    if-eqz v1, :cond_d

    mul-float v11, v0, v17

    sub-float/2addr v11, v4

    goto :goto_14

    :cond_d
    move v11, v0

    :goto_14
    if-eqz v1, :cond_e

    mul-float v8, v37, v17

    sub-float/2addr v8, v5

    goto :goto_15

    :cond_e
    move/from16 v8, v37

    .line 233
    :goto_15
    aget v0, v32, v39

    add-int/lit8 v9, v39, 0x1

    aget v1, v32, v9

    invoke-virtual {v14, v11, v8, v0, v1}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 234
    aget v0, v32, v39

    .line 235
    aget v1, v32, v9

    move v5, v8

    move v4, v11

    goto/16 :goto_1a

    :sswitch_11
    move/from16 v37, v8

    move/from16 v39, v9

    move-object/from16 v32, v10

    move v0, v11

    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    const/16 v2, 0x63

    if-eq v1, v2, :cond_10

    const/16 v2, 0x73

    if-eq v1, v2, :cond_10

    const/16 v2, 0x43

    if-eq v1, v2, :cond_10

    const/16 v2, 0x53

    if-ne v1, v2, :cond_f

    goto :goto_16

    :cond_f
    const/4 v1, 0x0

    goto :goto_17

    :cond_10
    :goto_16
    const/4 v1, 0x1

    :goto_17
    if-eqz v1, :cond_11

    mul-float v11, v0, v17

    sub-float/2addr v11, v4

    move v2, v11

    goto :goto_18

    :cond_11
    move v2, v0

    :goto_18
    if-eqz v1, :cond_12

    mul-float v8, v37, v17

    sub-float/2addr v8, v5

    move v3, v8

    goto :goto_19

    :cond_12
    move/from16 v3, v37

    .line 192
    :goto_19
    aget v4, v32, v39

    add-int/lit8 v9, v39, 0x1

    aget v5, v32, v9

    add-int/lit8 v0, v39, 0x2

    aget v6, v32, v0

    add-int/lit8 v8, v39, 0x3

    aget v7, v32, v8

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 194
    aget v1, v32, v39

    .line 195
    aget v2, v32, v9

    .line 196
    aget v0, v32, v0

    .line 197
    aget v3, v32, v8

    move v11, v0

    move v4, v1

    move v5, v2

    goto/16 :goto_1b

    :sswitch_12
    move/from16 v39, v9

    move-object/from16 v32, v10

    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    .line 211
    aget v0, v32, v39

    add-int/lit8 v9, v39, 0x1

    aget v1, v32, v9

    add-int/lit8 v2, v39, 0x2

    aget v3, v32, v2

    add-int/lit8 v4, v39, 0x3

    aget v5, v32, v4

    invoke-virtual {v14, v0, v1, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 212
    aget v0, v32, v2

    .line 213
    aget v1, v32, v4

    .line 214
    aget v2, v32, v39

    .line 215
    aget v3, v32, v9

    move v11, v0

    move v8, v1

    move v4, v2

    move v5, v3

    goto/16 :goto_1e

    :sswitch_13
    move/from16 v39, v9

    move-object/from16 v32, v10

    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    .line 110
    aget v0, v32, v39

    add-int/lit8 v9, v39, 0x1

    .line 111
    aget v1, v32, v9

    if-lez v39, :cond_13

    .line 115
    invoke-virtual {v14, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_1a

    .line 117
    :cond_13
    invoke-virtual {v14, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    move v11, v0

    move/from16 v27, v11

    move v8, v1

    move/from16 v28, v8

    goto/16 :goto_1e

    :sswitch_14
    move/from16 v39, v9

    move-object/from16 v32, v10

    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    .line 130
    aget v0, v32, v39

    add-int/lit8 v9, v39, 0x1

    .line 131
    aget v1, v32, v9

    .line 132
    invoke-virtual {v14, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    :goto_1a
    move v11, v0

    goto/16 :goto_11

    :sswitch_15
    move/from16 v37, v8

    move/from16 v39, v9

    move-object/from16 v32, v10

    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    .line 148
    aget v0, v32, v39

    move/from16 v3, v37

    invoke-virtual {v14, v0, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 149
    aget v0, v32, v39

    move v11, v0

    :goto_1b
    move v8, v3

    goto/16 :goto_1e

    :sswitch_16
    move/from16 v39, v9

    move-object/from16 v32, v10

    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    .line 172
    aget v2, v32, v39

    add-int/lit8 v9, v39, 0x1

    aget v3, v32, v9

    add-int/lit8 v9, v39, 0x2

    aget v4, v32, v9

    add-int/lit8 v0, v39, 0x3

    aget v5, v32, v0

    add-int/lit8 v8, v39, 0x4

    aget v6, v32, v8

    add-int/lit8 v10, v39, 0x5

    aget v7, v32, v10

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 174
    aget v1, v32, v8

    .line 175
    aget v2, v32, v10

    .line 176
    aget v3, v32, v9

    .line 177
    aget v0, v32, v0

    move v5, v0

    move v11, v1

    move v8, v2

    move v4, v3

    goto/16 :goto_1e

    :sswitch_17
    move v3, v8

    move/from16 v39, v9

    move-object/from16 v32, v10

    move v0, v11

    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    float-to-double v4, v0

    float-to-double v6, v3

    add-int/lit8 v0, v39, 0x5

    .line 252
    aget v1, v32, v0

    float-to-double v8, v1

    add-int/lit8 v29, v39, 0x6

    aget v1, v32, v29

    float-to-double v10, v1

    aget v1, v32, v39

    .line 253
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v12, v1

    add-int/lit8 v1, v39, 0x1

    aget v1, v32, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v2, v1

    add-int/lit8 v1, v39, 0x2

    aget v1, v32, v1

    float-to-double v14, v1

    add-int/lit8 v1, v39, 0x3

    aget v1, v32, v1

    cmpl-float v1, v1, v16

    if-eqz v1, :cond_14

    const/4 v1, 0x1

    const/16 v17, 0x1

    goto :goto_1c

    :cond_14
    const/4 v1, 0x0

    const/16 v17, 0x0

    :goto_1c
    add-int/lit8 v1, v39, 0x4

    aget v1, v32, v1

    cmpl-float v1, v1, v16

    if-eqz v1, :cond_15

    const/4 v1, 0x1

    const/16 v30, 0x1

    goto :goto_1d

    :cond_15
    const/4 v1, 0x0

    const/16 v30, 0x0

    :goto_1d
    move-object/from16 v1, p1

    move-wide/from16 v34, v2

    move-wide v2, v4

    move-wide v4, v6

    move-wide v6, v8

    move-wide v8, v10

    move-wide v10, v12

    move-wide/from16 v12, v34

    move/from16 v16, v17

    move/from16 v17, v30

    .line 252
    invoke-static/range {v1 .. v17}, Ll/ܺ᩶ۡ;->֫(Landroid/graphics/Path;DDDDDDDZZ)V

    .line 255
    aget v0, v32, v0

    .line 256
    aget v1, v32, v29

    move v4, v0

    move v11, v4

    move v5, v1

    move v8, v5

    :goto_1e
    add-int v9, v39, v26

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move/from16 v1, v20

    move/from16 v12, v31

    move-object/from16 v10, v32

    move/from16 v13, v33

    move-object/from16 v15, v36

    goto/16 :goto_3

    :cond_16
    move v3, v8

    move v0, v11

    move/from16 v31, v12

    move/from16 v33, v13

    move-object/from16 v36, v15

    aput v0, v36, v18

    aput v3, v36, v21

    aput v4, v36, v22

    aput v5, v36, v23

    aput v27, v36, v24

    aput v28, v36, v25

    .line 39
    invoke-virtual/range {v19 .. v19}, Ll/ۖ᩶ۡ;->ۧ()C

    move-result v1

    add-int/lit8 v13, v33, 0x1

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    goto/16 :goto_0

    :cond_17
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_4
        0x43 -> :sswitch_3
        0x48 -> :sswitch_2
        0x51 -> :sswitch_1
        0x53 -> :sswitch_1
        0x56 -> :sswitch_2
        0x5a -> :sswitch_0
        0x61 -> :sswitch_4
        0x63 -> :sswitch_3
        0x68 -> :sswitch_2
        0x71 -> :sswitch_1
        0x73 -> :sswitch_1
        0x76 -> :sswitch_2
        0x7a -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x41 -> :sswitch_17
        0x43 -> :sswitch_16
        0x48 -> :sswitch_15
        0x4c -> :sswitch_14
        0x4d -> :sswitch_13
        0x51 -> :sswitch_12
        0x53 -> :sswitch_11
        0x54 -> :sswitch_10
        0x56 -> :sswitch_f
        0x5a -> :sswitch_e
        0x61 -> :sswitch_d
        0x63 -> :sswitch_c
        0x68 -> :sswitch_b
        0x6c -> :sswitch_a
        0x6d -> :sswitch_9
        0x71 -> :sswitch_8
        0x73 -> :sswitch_7
        0x74 -> :sswitch_6
        0x76 -> :sswitch_5
        0x7a -> :sswitch_e
    .end sparse-switch
.end method
