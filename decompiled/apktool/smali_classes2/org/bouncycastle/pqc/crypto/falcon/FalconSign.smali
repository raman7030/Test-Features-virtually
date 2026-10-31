.class public Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public do_sign_dyn(Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;[S[B[B[B[B[SI[DI)I
    .locals 25

    move-object/from16 v15, p0

    move-object/from16 v14, p3

    move-object/from16 v13, p4

    move-object/from16 v12, p5

    move-object/from16 v11, p6

    move/from16 v10, p8

    move-object/from16 v9, p9

    move/from16 v8, p10

    const/16 v16, 0x1

    shl-int v7, v16, v10

    add-int v6, v8, v7

    add-int v5, v6, v7

    add-int v4, v5, v7

    .line 0
    invoke-virtual {v15, v9, v6, v14, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->smallints_to_fpr([DI[BI)V

    invoke-virtual {v15, v9, v8, v13, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->smallints_to_fpr([DI[BI)V

    invoke-virtual {v15, v9, v4, v12, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->smallints_to_fpr([DI[BI)V

    invoke-virtual {v15, v9, v5, v11, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->smallints_to_fpr([DI[BI)V

    invoke-static {v9, v6, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->FFT([DII)V

    invoke-static {v9, v8, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->FFT([DII)V

    invoke-static {v9, v4, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->FFT([DII)V

    invoke-static {v9, v5, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->FFT([DII)V

    invoke-static {v9, v6, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_neg([DII)V

    invoke-static {v9, v4, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_neg([DII)V

    add-int v3, v4, v7

    add-int v2, v3, v7

    invoke-static {v9, v6, v9, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v9, v3, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mulselfadj_fft([DII)V

    invoke-static {v9, v8, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v9, v2, v9, v5, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_muladj_fft([DI[DII)V

    invoke-static {v9, v8, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mulselfadj_fft([DII)V

    invoke-static {v9, v8, v9, v3, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_add([DI[DII)V

    invoke-static {v9, v6, v9, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v9, v6, v9, v4, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_muladj_fft([DI[DII)V

    invoke-static {v9, v6, v9, v2, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_add([DI[DII)V

    invoke-static {v9, v5, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mulselfadj_fft([DII)V

    invoke-static {v9, v4, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v9, v2, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mulselfadj_fft([DII)V

    invoke-static {v9, v5, v9, v2, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_add([DI[DII)V

    add-int v1, v2, v7

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v7, :cond_0

    add-int v17, v2, v0

    move/from16 v18, v5

    aget-short v5, p7, v0

    move/from16 v19, v6

    int-to-double v5, v5

    aput-wide v5, v9, v17

    add-int/lit8 v0, v0, 0x1

    move/from16 v5, v18

    move/from16 v6, v19

    goto :goto_0

    :cond_0
    move/from16 v18, v5

    move/from16 v19, v6

    invoke-static {v9, v2, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->FFT([DII)V

    invoke-static {v9, v2, v9, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v9, v1, v9, v3, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mul_fft([DI[DII)V

    const-wide v5, -0x40eaab1c6f68587eL    # -8.137358613394092E-5

    invoke-static {v9, v1, v5, v6, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mulconst([DIDI)V

    invoke-static {v9, v2, v9, v4, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mul_fft([DI[DII)V

    const-wide v5, 0x3f1554e39097a782L    # 8.137358613394092E-5

    invoke-static {v9, v2, v5, v6, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mulconst([DIDI)V

    mul-int/lit8 v6, v7, 0x2

    invoke-static {v9, v2, v9, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v0, p0

    move v5, v1

    move-object/from16 v1, p1

    move/from16 p1, v2

    move-object/from16 v2, p9

    move/from16 v17, v3

    move v3, v4

    move/from16 v20, v4

    move-object/from16 v4, p9

    move/from16 v22, v5

    move/from16 v21, v18

    move/from16 v5, v17

    move/from16 v23, v6

    move/from16 v18, v19

    move-object/from16 v6, p9

    move/from16 v24, v7

    move/from16 v7, p10

    move-object/from16 v8, p9

    move/from16 v9, v18

    move-object/from16 v10, p9

    move/from16 v11, v21

    move/from16 v12, p8

    move/from16 v13, p8

    move-object/from16 v14, p9

    move/from16 v15, p1

    invoke-virtual/range {v0 .. v15}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->ffSampling_fft_dyntree(Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;[DI[DI[DI[DI[DIII[DI)V

    move-object/from16 v0, p9

    move/from16 v4, v17

    move/from16 v5, v20

    move/from16 v7, v23

    invoke-static {v0, v5, v0, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move/from16 v3, p8

    move/from16 v6, v18

    invoke-virtual {v1, v0, v6, v2, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->smallints_to_fpr([DI[BI)V

    move-object/from16 v2, p4

    move/from16 v7, p10

    invoke-virtual {v1, v0, v7, v2, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->smallints_to_fpr([DI[BI)V

    move-object/from16 v2, p5

    invoke-virtual {v1, v0, v5, v2, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->smallints_to_fpr([DI[BI)V

    move-object/from16 v2, p6

    move/from16 v8, v21

    invoke-virtual {v1, v0, v8, v2, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->smallints_to_fpr([DI[BI)V

    invoke-static {v0, v6, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->FFT([DII)V

    invoke-static {v0, v7, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->FFT([DII)V

    invoke-static {v0, v5, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->FFT([DII)V

    invoke-static {v0, v8, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->FFT([DII)V

    invoke-static {v0, v6, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_neg([DII)V

    invoke-static {v0, v5, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_neg([DII)V

    move/from16 v9, v22

    move/from16 v2, v24

    add-int v10, v9, v2

    invoke-static {v0, v4, v0, v9, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move/from16 v11, p1

    invoke-static {v0, v11, v0, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0, v9, v0, v7, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mul_fft([DI[DII)V

    invoke-static {v0, v10, v0, v8, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mul_fft([DI[DII)V

    invoke-static {v0, v9, v0, v10, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_add([DI[DII)V

    invoke-static {v0, v4, v0, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0, v10, v0, v6, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mul_fft([DI[DII)V

    invoke-static {v0, v9, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0, v11, v0, v5, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mul_fft([DI[DII)V

    invoke-static {v0, v11, v0, v10, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_add([DI[DII)V

    invoke-static {v0, v4, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->iFFT([DII)V

    invoke-static {v0, v11, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->iFFT([DII)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v2, :cond_1

    aget-short v8, p7, v7

    const v9, 0xffff

    and-int/2addr v8, v9

    add-int v9, v4, v7

    aget-wide v9, v0, v9

    invoke-static {v9, v10}, Lorg/bouncycastle/pqc/crypto/falcon/FPREngine;->fpr_rint(D)J

    move-result-wide v9

    long-to-int v10, v9

    sub-int/2addr v8, v10

    mul-int v8, v8, v8

    add-int/2addr v5, v8

    or-int/2addr v6, v5

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v4, v6, 0x1f

    neg-int v4, v4

    or-int/2addr v4, v5

    new-array v5, v2, [S

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v2, :cond_2

    add-int v7, v11, v6

    aget-wide v7, v0, v7

    invoke-static {v7, v8}, Lorg/bouncycastle/pqc/crypto/falcon/FPREngine;->fpr_rint(D)J

    move-result-wide v7

    neg-long v7, v7

    long-to-int v8, v7

    int-to-short v7, v8

    aput-short v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    invoke-static {v4, v5, v3}, Lorg/bouncycastle/pqc/crypto/falcon/FalconCommon;->is_short_half(I[SI)I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    move-object/from16 v3, p2

    invoke-static {v5, v0, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v16

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public ffSampling_fft_dyntree(Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;[DI[DI[DI[DI[DIII[DI)V
    .locals 23

    move-object/from16 v15, p1

    move-object/from16 v14, p2

    move/from16 v13, p3

    move-object/from16 v12, p4

    move/from16 v11, p5

    move-object/from16 v10, p6

    move/from16 v9, p7

    move-object/from16 v8, p8

    move/from16 v7, p9

    move-object/from16 v6, p10

    move/from16 v5, p11

    move/from16 v4, p13

    move-object/from16 v3, p14

    move/from16 v2, p15

    if-nez v4, :cond_0

    .line 0
    aget-wide v0, v10, v9

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    sget-object v2, Lorg/bouncycastle/pqc/crypto/falcon/FPREngine;->fpr_inv_sigma:[D

    aget-wide v3, v2, p12

    mul-double v0, v0, v3

    aget-wide v2, v14, v13

    invoke-static {v15, v2, v3, v0, v1}, Lorg/bouncycastle/pqc/crypto/falcon/SamplerZ;->sample(Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;DD)I

    move-result v2

    int-to-double v2, v2

    aput-wide v2, v14, v13

    aget-wide v2, v12, v11

    invoke-static {v15, v2, v3, v0, v1}, Lorg/bouncycastle/pqc/crypto/falcon/SamplerZ;->sample(Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;DD)I

    move-result v0

    int-to-double v0, v0

    aput-wide v0, v12, v11

    return-void

    :cond_0
    const/4 v0, 0x1

    shl-int v1, v0, v4

    shr-int/lit8 v0, v1, 0x1

    move v15, v0

    move-object/from16 v0, p6

    move v14, v1

    move/from16 v1, p7

    move v13, v2

    move-object/from16 v2, p8

    move-object v12, v3

    move/from16 v3, p9

    move v11, v4

    move-object/from16 v4, p10

    move v11, v5

    move/from16 v5, p11

    move-object v7, v6

    move/from16 v6, p13

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_LDL_fft([DI[DI[DII)V

    add-int v16, v13, v15

    move-object/from16 v0, p14

    move/from16 v1, p15

    move-object/from16 v2, p14

    move/from16 v3, v16

    move-object/from16 v4, p6

    move/from16 v5, p7

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_split_fft([DI[DI[DII)V

    invoke-static {v12, v13, v10, v9, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v4, p10

    move/from16 v5, p11

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_split_fft([DI[DI[DII)V

    invoke-static {v12, v13, v7, v11, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v6, v7

    move/from16 v7, p9

    invoke-static {v8, v7, v12, v13, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v10, v9, v8, v7, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int v5, v7, v15

    invoke-static {v6, v11, v8, v5, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int v4, v13, v14

    add-int v17, v4, v15

    move v1, v4

    move/from16 v3, v17

    move v13, v4

    move-object/from16 v4, p4

    move/from16 v18, v5

    move/from16 v5, p5

    move/from16 v6, p13

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_split_fft([DI[DI[DII)V

    add-int v19, v11, v15

    add-int/lit8 v20, p13, -0x1

    add-int v21, v13, v14

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v3, v13

    move-object/from16 v4, p14

    move/from16 v5, v17

    move-object/from16 v6, p10

    move/from16 v7, p11

    move-object/from16 v8, p10

    move/from16 v9, v19

    move-object/from16 v10, p8

    move/from16 v11, v18

    move/from16 v12, p12

    move/from16 p10, v13

    move/from16 v13, v20

    move/from16 v22, v14

    move-object/from16 v14, p14

    move/from16 v18, v15

    move/from16 v15, v21

    invoke-virtual/range {v0 .. v15}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->ffSampling_fft_dyntree(Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;[DI[DI[DI[DI[DIII[DI)V

    move/from16 v7, v22

    shl-int/lit8 v0, v7, 0x1

    move/from16 v15, p15

    add-int v8, v15, v0

    move-object/from16 v0, p14

    move v1, v8

    move/from16 v3, p10

    move/from16 v6, p13

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_merge_fft([DI[DI[DII)V

    move-object/from16 v0, p4

    move/from16 v1, p5

    move/from16 v13, p10

    invoke-static {v0, v1, v14, v13, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move/from16 v12, p13

    invoke-static {v14, v13, v14, v8, v12}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_sub([DI[DII)V

    invoke-static {v14, v8, v0, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v14, v15, v14, v13, v12}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_mul_fft([DI[DII)V

    move-object/from16 v11, p2

    move/from16 v10, p3

    invoke-static {v11, v10, v14, v15, v12}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_add([DI[DII)V

    move-object/from16 v0, p14

    move/from16 v1, p15

    move/from16 v3, v16

    move-object/from16 v4, p2

    move/from16 v5, p3

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_split_fft([DI[DI[DII)V

    add-int v9, p7, v18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v3, p15

    move-object/from16 v4, p14

    move/from16 v5, v16

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p6

    move-object/from16 v10, p8

    move/from16 v11, p9

    move/from16 v12, p12

    move/from16 v17, v13

    move/from16 v13, v20

    move/from16 v15, v17

    invoke-virtual/range {v0 .. v15}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->ffSampling_fft_dyntree(Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;[DI[DI[DI[DI[DIII[DI)V

    move-object/from16 p4, p2

    move/from16 p5, p3

    move-object/from16 p6, p14

    move/from16 p7, p15

    move-object/from16 p8, p14

    move/from16 p9, v16

    move/from16 p10, p13

    invoke-static/range {p4 .. p10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconFFT;->poly_merge_fft([DI[DI[DII)V

    return-void
.end method

.method public sign_dyn([SLorg/bouncycastle/crypto/digests/SHAKEDigest;[B[B[B[B[SI[D)V
    .locals 12

    .line 0
    :cond_0
    new-instance v1, Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;

    invoke-direct {v1}, Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;-><init>()V

    sget-object v0, Lorg/bouncycastle/pqc/crypto/falcon/FPREngine;->fpr_sigma_min:[D

    aget-wide v2, v0, p8

    iput-wide v2, v1, Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;->sigma_min:D

    iget-object v0, v1, Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;->p:Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;

    move-object v11, p2

    invoke-virtual {v0, p2}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->prng_init(Lorg/bouncycastle/crypto/digests/SHAKEDigest;)V

    const/4 v10, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    invoke-virtual/range {v0 .. v10}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSign;->do_sign_dyn(Lorg/bouncycastle/pqc/crypto/falcon/SamplerCtx;[S[B[B[B[B[SI[DI)I

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public smallints_to_fpr([DI[BI)V
    .locals 4

    const/4 v0, 0x1

    shl-int p4, v0, p4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_0

    add-int v1, p2, v0

    .line 0
    aget-byte v2, p3, v0

    int-to-double v2, v2

    aput-wide v2, p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
