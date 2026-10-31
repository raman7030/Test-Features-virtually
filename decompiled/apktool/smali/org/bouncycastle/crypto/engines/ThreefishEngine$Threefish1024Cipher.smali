.class public final Lorg/bouncycastle/crypto/engines/ThreefishEngine$Threefish1024Cipher;
.super Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;


# static fields
.field public static final ROTATION_0_0:I = 0x18

.field public static final ROTATION_0_1:I = 0xd

.field public static final ROTATION_0_2:I = 0x8

.field public static final ROTATION_0_3:I = 0x2f

.field public static final ROTATION_0_4:I = 0x8

.field public static final ROTATION_0_5:I = 0x11

.field public static final ROTATION_0_6:I = 0x16

.field public static final ROTATION_0_7:I = 0x25

.field public static final ROTATION_1_0:I = 0x26

.field public static final ROTATION_1_1:I = 0x13

.field public static final ROTATION_1_2:I = 0xa

.field public static final ROTATION_1_3:I = 0x37

.field public static final ROTATION_1_4:I = 0x31

.field public static final ROTATION_1_5:I = 0x12

.field public static final ROTATION_1_6:I = 0x17

.field public static final ROTATION_1_7:I = 0x34

.field public static final ROTATION_2_0:I = 0x21

.field public static final ROTATION_2_1:I = 0x4

.field public static final ROTATION_2_2:I = 0x33

.field public static final ROTATION_2_3:I = 0xd

.field public static final ROTATION_2_4:I = 0x22

.field public static final ROTATION_2_5:I = 0x29

.field public static final ROTATION_2_6:I = 0x3b

.field public static final ROTATION_2_7:I = 0x11

.field public static final ROTATION_3_0:I = 0x5

.field public static final ROTATION_3_1:I = 0x14

.field public static final ROTATION_3_2:I = 0x30

.field public static final ROTATION_3_3:I = 0x29

.field public static final ROTATION_3_4:I = 0x2f

.field public static final ROTATION_3_5:I = 0x1c

.field public static final ROTATION_3_6:I = 0x10

.field public static final ROTATION_3_7:I = 0x19

.field public static final ROTATION_4_0:I = 0x29

.field public static final ROTATION_4_1:I = 0x9

.field public static final ROTATION_4_2:I = 0x25

.field public static final ROTATION_4_3:I = 0x1f

.field public static final ROTATION_4_4:I = 0xc

.field public static final ROTATION_4_5:I = 0x2f

.field public static final ROTATION_4_6:I = 0x2c

.field public static final ROTATION_4_7:I = 0x1e

.field public static final ROTATION_5_0:I = 0x10

.field public static final ROTATION_5_1:I = 0x22

.field public static final ROTATION_5_2:I = 0x38

.field public static final ROTATION_5_3:I = 0x33

.field public static final ROTATION_5_4:I = 0x4

.field public static final ROTATION_5_5:I = 0x35

.field public static final ROTATION_5_6:I = 0x2a

.field public static final ROTATION_5_7:I = 0x29

.field public static final ROTATION_6_0:I = 0x1f

.field public static final ROTATION_6_1:I = 0x2c

.field public static final ROTATION_6_2:I = 0x2f

.field public static final ROTATION_6_3:I = 0x2e

.field public static final ROTATION_6_4:I = 0x13

.field public static final ROTATION_6_5:I = 0x2a

.field public static final ROTATION_6_6:I = 0x2c

.field public static final ROTATION_6_7:I = 0x19

.field public static final ROTATION_7_0:I = 0x9

.field public static final ROTATION_7_1:I = 0x30

.field public static final ROTATION_7_2:I = 0x23

.field public static final ROTATION_7_3:I = 0x34

.field public static final ROTATION_7_4:I = 0x17

.field public static final ROTATION_7_5:I = 0x1f

.field public static final ROTATION_7_6:I = 0x25

.field public static final ROTATION_7_7:I = 0x14


# direct methods
.method public constructor <init>([J[J)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;-><init>([J[J)V

    return-void
.end method


# virtual methods
.method public decryptBlock([J[J)V
    .locals 74

    move-object/from16 v0, p0

    .line 0
    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->kw:[J

    iget-object v2, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->t:[J

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$300()[I

    move-result-object v3

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$100()[I

    move-result-object v4

    array-length v5, v1

    const/16 v6, 0x21

    if-ne v5, v6, :cond_2

    array-length v5, v2

    const/4 v6, 0x5

    if-ne v5, v6, :cond_1

    const/4 v5, 0x0

    aget-wide v7, p1, v5

    const/4 v5, 0x1

    aget-wide v9, p1, v5

    const/4 v11, 0x2

    aget-wide v11, p1, v11

    const/4 v13, 0x3

    aget-wide v13, p1, v13

    const/16 v16, 0x4

    aget-wide v16, p1, v16

    aget-wide v18, p1, v6

    const/4 v6, 0x6

    aget-wide v20, p1, v6

    const/16 v22, 0x7

    aget-wide v23, p1, v22

    const/16 v25, 0x2

    const/16 v26, 0x8

    aget-wide v26, p1, v26

    const/16 v28, 0x3

    const/16 v29, 0x9

    aget-wide v30, p1, v29

    const/16 v32, 0xa

    aget-wide v32, p1, v32

    const/16 v34, 0xb

    aget-wide v35, p1, v34

    const/16 v37, 0xc

    aget-wide v37, p1, v37

    const/16 v39, 0xd

    aget-wide v39, p1, v39

    const/16 v41, 0xe

    aget-wide v42, p1, v41

    const/16 v44, 0xf

    aget-wide v45, p1, v44

    const/16 v47, 0x13

    const/16 v6, 0x9

    const/16 v15, 0x13

    :goto_0
    if-lt v15, v5, :cond_0

    aget v5, v3, v15

    aget v48, v4, v15

    add-int/lit8 v49, v5, 0x1

    aget-wide v50, v1, v49

    sub-long v7, v7, v50

    add-int/lit8 v50, v5, 0x2

    aget-wide v51, v1, v50

    sub-long v9, v9, v51

    add-int/lit8 v51, v5, 0x3

    aget-wide v52, v1, v51

    sub-long v11, v11, v52

    add-int/lit8 v52, v5, 0x4

    aget-wide v53, v1, v52

    sub-long v13, v13, v53

    add-int/lit8 v53, v5, 0x5

    aget-wide v54, v1, v53

    move-object/from16 v56, v3

    move-object/from16 v57, v4

    sub-long v3, v16, v54

    add-int/lit8 v16, v5, 0x6

    aget-wide v54, v1, v16

    move-wide/from16 v58, v13

    sub-long v13, v18, v54

    add-int/lit8 v17, v5, 0x7

    aget-wide v18, v1, v17

    move-wide/from16 v54, v13

    sub-long v13, v20, v18

    add-int/lit8 v18, v5, 0x8

    aget-wide v19, v1, v18

    move-wide/from16 v60, v9

    sub-long v9, v23, v19

    add-int/lit8 v19, v5, 0x9

    aget-wide v20, v1, v19

    move-wide/from16 v23, v9

    sub-long v9, v26, v20

    add-int/lit8 v20, v5, 0xa

    aget-wide v26, v1, v20

    move-wide/from16 v62, v9

    sub-long v9, v30, v26

    add-int/lit8 v21, v5, 0xb

    aget-wide v26, v1, v21

    move-wide/from16 v64, v3

    sub-long v3, v32, v26

    add-int/lit8 v26, v5, 0xc

    aget-wide v30, v1, v26

    move-wide/from16 v32, v3

    sub-long v3, v35, v30

    add-int/lit8 v27, v5, 0xd

    aget-wide v30, v1, v27

    move-wide/from16 v66, v9

    sub-long v9, v37, v30

    add-int/lit8 v30, v5, 0xe

    aget-wide v35, v1, v30

    add-int/lit8 v31, v48, 0x1

    aget-wide v37, v2, v31

    add-long v35, v35, v37

    move-wide/from16 v37, v9

    sub-long v9, v39, v35

    add-int/lit8 v35, v5, 0xf

    aget-wide v39, v1, v35

    add-int/lit8 v36, v48, 0x2

    aget-wide v68, v2, v36

    add-long v39, v39, v68

    move-wide/from16 v68, v9

    sub-long v9, v42, v39

    add-int/lit8 v36, v5, 0x10

    aget-wide v39, v1, v36

    move-object/from16 v70, v1

    int-to-long v0, v15

    add-long v39, v39, v0

    const-wide/16 v42, 0x1

    add-long v39, v39, v42

    move-wide/from16 v42, v0

    sub-long v0, v45, v39

    invoke-static {v0, v1, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v7, v0

    const/16 v6, 0x30

    invoke-static {v3, v4, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v11, v3

    const/16 v6, 0x23

    move-object/from16 v71, v2

    move-wide/from16 v39, v3

    move-wide/from16 v2, v68

    invoke-static {v2, v3, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v13, v2

    const/16 v4, 0x34

    move-wide/from16 v45, v2

    move/from16 p1, v5

    move-wide/from16 v5, v64

    move-wide/from16 v2, v66

    invoke-static {v2, v3, v4, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long v4, v5, v2

    const/16 v6, 0x17

    move-wide/from16 v64, v2

    move-wide/from16 v2, v60

    invoke-static {v2, v3, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v9, v2

    const/16 v6, 0x1f

    move-wide/from16 v60, v9

    move-wide/from16 v9, v54

    move-wide/from16 v54, v0

    move-wide/from16 v0, v62

    invoke-static {v9, v10, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v9

    sub-long/2addr v0, v9

    const/16 v6, 0x25

    move-wide/from16 v62, v0

    move-wide/from16 v0, v58

    move-wide/from16 v72, v2

    move-wide/from16 v2, v32

    move-wide/from16 v32, v72

    invoke-static {v0, v1, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v2, v0

    const/16 v6, 0x14

    move-wide/from16 v58, v2

    move-wide/from16 v2, v23

    move-wide/from16 v23, v13

    move-wide/from16 v13, v37

    invoke-static {v2, v3, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v13, v2

    const/16 v6, 0x1f

    invoke-static {v2, v3, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v7, v2

    const/16 v6, 0x2c

    invoke-static {v9, v10, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v9

    sub-long/2addr v11, v9

    const/16 v6, 0x2f

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v4, v0

    const/16 v6, 0x2e

    move-wide/from16 v36, v9

    move-wide/from16 v9, v23

    move-wide/from16 v23, v0

    move-wide/from16 v0, v32

    invoke-static {v0, v1, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v9, v0

    const/16 v6, 0x13

    move-wide/from16 v32, v0

    move-wide/from16 v0, v54

    invoke-static {v0, v1, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v13, v0

    const/16 v6, 0x2a

    move-wide/from16 v54, v13

    move-wide/from16 v13, v45

    move-wide/from16 v45, v2

    move-wide/from16 v2, v60

    invoke-static {v13, v14, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v2, v13

    const/16 v6, 0x2c

    move-wide/from16 v60, v2

    move-wide/from16 v2, v39

    move-wide/from16 v38, v0

    move-wide/from16 v0, v62

    invoke-static {v2, v3, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const/16 v6, 0x19

    move-wide/from16 v62, v0

    move-wide/from16 v0, v64

    move-wide/from16 v72, v4

    move-wide/from16 v4, v58

    move-wide/from16 v58, v72

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v4, v0

    const/16 v6, 0x10

    invoke-static {v0, v1, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v7, v0

    const/16 v6, 0x22

    invoke-static {v13, v14, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v11, v13

    const/16 v6, 0x38

    invoke-static {v2, v3, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v9, v2

    const/16 v6, 0x33

    move-wide/from16 v64, v13

    move-wide/from16 v13, v58

    move-wide/from16 v72, v2

    move-wide/from16 v2, v38

    move-wide/from16 v38, v72

    invoke-static {v2, v3, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v13, v2

    const/4 v6, 0x4

    move-wide/from16 v58, v2

    move-wide/from16 v2, v45

    invoke-static {v2, v3, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v4, v2

    const/16 v6, 0x35

    move-wide/from16 v45, v4

    move-wide/from16 v4, v23

    move-wide/from16 v23, v0

    move-wide/from16 v0, v54

    invoke-static {v4, v5, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v4

    sub-long/2addr v0, v4

    const/16 v6, 0x2a

    move-wide/from16 v54, v0

    move-wide/from16 v0, v36

    move-wide/from16 v36, v2

    move-wide/from16 v2, v60

    invoke-static {v0, v1, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v2, v0

    const/16 v6, 0x29

    move-wide/from16 v60, v2

    move-wide/from16 v2, v32

    move-wide/from16 v32, v9

    move-wide/from16 v9, v62

    invoke-static {v2, v3, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v9, v2

    invoke-static {v2, v3, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v7, v2

    const/16 v6, 0x9

    invoke-static {v4, v5, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v4

    sub-long/2addr v11, v4

    const/16 v6, 0x25

    invoke-static {v0, v1, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v13, v0

    const/16 v6, 0x1f

    move-wide/from16 v62, v0

    move-wide/from16 v0, v32

    move-wide/from16 v32, v13

    move-wide/from16 v13, v36

    invoke-static {v13, v14, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v0, v13

    const/16 v6, 0xc

    move-wide/from16 v36, v13

    move-wide/from16 v13, v23

    invoke-static {v13, v14, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v9, v13

    const/16 v6, 0x2f

    move-wide/from16 v23, v13

    move-wide/from16 v13, v38

    move-wide/from16 v38, v9

    move-wide/from16 v9, v45

    invoke-static {v13, v14, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v9, v13

    const/16 v6, 0x2c

    move-wide/from16 v45, v13

    move-wide/from16 v13, v64

    move-wide/from16 v72, v9

    move-wide/from16 v9, v54

    move-wide/from16 v54, v72

    invoke-static {v13, v14, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v9, v13

    const/16 v6, 0x1e

    move-wide/from16 v64, v13

    move-wide/from16 v13, v58

    move-wide/from16 v58, v9

    move-wide/from16 v9, v60

    invoke-static {v13, v14, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v9, v13

    aget-wide v60, v70, p1

    sub-long v7, v7, v60

    aget-wide v60, v70, v49

    sub-long v2, v2, v60

    aget-wide v49, v70, v50

    sub-long v11, v11, v49

    aget-wide v49, v70, v51

    sub-long v4, v4, v49

    aget-wide v49, v70, v52

    move-wide/from16 v51, v4

    sub-long v4, v32, v49

    aget-wide v32, v70, v53

    move-wide/from16 v49, v2

    sub-long v2, v62, v32

    aget-wide v32, v70, v16

    sub-long v0, v0, v32

    aget-wide v16, v70, v17

    move-wide/from16 v32, v2

    sub-long v2, v36, v16

    aget-wide v16, v70, v18

    move-wide/from16 v36, v2

    sub-long v2, v38, v16

    aget-wide v16, v70, v19

    move-wide/from16 v18, v2

    sub-long v2, v23, v16

    aget-wide v16, v70, v20

    move-wide/from16 v23, v2

    sub-long v2, v54, v16

    aget-wide v16, v70, v21

    move-wide/from16 v20, v2

    sub-long v2, v45, v16

    aget-wide v16, v70, v26

    move-wide/from16 v38, v4

    sub-long v4, v58, v16

    aget-wide v16, v70, v27

    aget-wide v26, v71, v48

    add-long v16, v16, v26

    move-wide/from16 v26, v4

    sub-long v4, v64, v16

    aget-wide v16, v70, v30

    aget-wide v30, v71, v31

    add-long v16, v16, v30

    sub-long v9, v9, v16

    aget-wide v16, v70, v35

    add-long v16, v16, v42

    sub-long v13, v13, v16

    const/4 v6, 0x5

    invoke-static {v13, v14, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v7, v13

    const/16 v6, 0x14

    invoke-static {v2, v3, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v11, v2

    const/16 v6, 0x30

    invoke-static {v4, v5, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v4

    sub-long/2addr v0, v4

    const/16 v6, 0x29

    move-wide/from16 v16, v2

    move-wide/from16 v2, v38

    move-wide/from16 v72, v4

    move-wide/from16 v4, v23

    move-wide/from16 v23, v72

    invoke-static {v4, v5, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v4

    sub-long/2addr v2, v4

    const/16 v6, 0x2f

    move-wide/from16 v30, v4

    move-wide/from16 v4, v49

    invoke-static {v4, v5, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v4

    sub-long/2addr v9, v4

    const/16 v6, 0x1c

    move-wide/from16 v38, v9

    move-wide/from16 v9, v32

    move-wide/from16 v72, v13

    move-wide/from16 v13, v18

    move-wide/from16 v18, v72

    invoke-static {v9, v10, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v9

    sub-long/2addr v13, v9

    const/16 v6, 0x10

    move-wide/from16 v32, v13

    move-wide/from16 v13, v51

    move-wide/from16 v72, v0

    move-wide/from16 v0, v20

    move-wide/from16 v20, v72

    invoke-static {v13, v14, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v0, v13

    const/16 v6, 0x19

    move-wide/from16 v42, v0

    move-wide/from16 v0, v36

    move-wide/from16 v72, v4

    move-wide/from16 v4, v26

    move-wide/from16 v26, v72

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v4, v0

    const/16 v6, 0x21

    invoke-static {v0, v1, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v7, v0

    const/4 v6, 0x4

    invoke-static {v9, v10, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v9

    sub-long/2addr v11, v9

    const/16 v6, 0x33

    invoke-static {v13, v14, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v2, v13

    const/16 v6, 0xd

    move-wide/from16 v35, v9

    move-wide/from16 v9, v20

    move-wide/from16 v20, v13

    move-wide/from16 v13, v26

    invoke-static {v13, v14, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v9, v13

    const/16 v6, 0x22

    move-wide/from16 v26, v13

    move-wide/from16 v13, v18

    invoke-static {v13, v14, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v4, v13

    const/16 v6, 0x29

    move-wide/from16 v18, v4

    move-wide/from16 v4, v23

    move-wide/from16 v23, v0

    move-wide/from16 v0, v38

    invoke-static {v4, v5, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v4

    sub-long/2addr v0, v4

    const/16 v6, 0x3b

    move-wide/from16 v37, v0

    move-wide/from16 v0, v16

    move-wide/from16 v16, v2

    move-wide/from16 v2, v32

    invoke-static {v0, v1, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v2, v0

    const/16 v6, 0x11

    move-wide/from16 v32, v2

    move-wide/from16 v2, v30

    move-wide/from16 v30, v13

    move-wide/from16 v13, v42

    invoke-static {v2, v3, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v13, v2

    const/16 v6, 0x26

    invoke-static {v2, v3, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v7, v2

    const/16 v6, 0x13

    invoke-static {v4, v5, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v4

    sub-long/2addr v11, v4

    const/16 v6, 0xa

    invoke-static {v0, v1, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v9, v0

    const/16 v6, 0x37

    move-wide/from16 v39, v4

    move-wide/from16 v4, v16

    move-wide/from16 v16, v0

    move-wide/from16 v0, v30

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v4, v0

    const/16 v6, 0x31

    move-wide/from16 v30, v0

    move-wide/from16 v0, v23

    invoke-static {v0, v1, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v13, v0

    const/16 v6, 0x12

    move-wide/from16 v23, v13

    move-wide/from16 v13, v20

    move-wide/from16 v72, v2

    move-wide/from16 v2, v18

    move-wide/from16 v18, v72

    invoke-static {v13, v14, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v2, v13

    const/16 v6, 0x17

    move-wide/from16 v20, v2

    move-wide/from16 v2, v35

    move-wide/from16 v35, v0

    move-wide/from16 v0, v37

    invoke-static {v2, v3, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const/16 v6, 0x34

    move-wide/from16 v37, v0

    move-wide/from16 v0, v26

    move-wide/from16 v26, v9

    move-wide/from16 v9, v32

    invoke-static {v0, v1, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v9, v0

    const/16 v6, 0x18

    invoke-static {v0, v1, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v7, v0

    const/16 v6, 0xd

    invoke-static {v13, v14, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v13

    sub-long/2addr v11, v13

    const/16 v6, 0x8

    invoke-static {v2, v3, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v4, v2

    const/16 v6, 0x2f

    move-wide/from16 v32, v0

    move-wide/from16 v0, v26

    move-wide/from16 v26, v2

    move-wide/from16 v2, v35

    invoke-static {v2, v3, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const/16 v6, 0x8

    move-wide/from16 v35, v0

    move-wide/from16 v0, v18

    invoke-static {v0, v1, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v9, v0

    const/16 v6, 0x11

    move-wide/from16 v18, v0

    move-wide/from16 v0, v16

    move-wide/from16 v16, v2

    move-wide/from16 v2, v23

    invoke-static {v0, v1, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v2, v0

    const/16 v6, 0x16

    move-wide/from16 v23, v0

    move-wide/from16 v0, v39

    move-wide/from16 v72, v2

    move-wide/from16 v2, v20

    move-wide/from16 v20, v72

    invoke-static {v0, v1, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v39

    sub-long v0, v2, v39

    const/16 v2, 0x25

    move-wide/from16 v42, v0

    move-wide/from16 v0, v30

    move-wide/from16 v30, v4

    move-wide/from16 v3, v37

    invoke-static {v0, v1, v2, v3, v4}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v45

    sub-long v0, v3, v45

    add-int/lit8 v15, v15, -0x2

    const/16 v6, 0x9

    const/4 v5, 0x1

    move-wide/from16 v37, v42

    move-object/from16 v3, v56

    move-object/from16 v4, v57

    move-object/from16 v2, v71

    move-wide/from16 v42, v0

    move-object/from16 v1, v70

    move-object/from16 v0, p0

    move-wide/from16 v20, v35

    move-wide/from16 v35, v23

    move-wide/from16 v23, v16

    move-wide/from16 v16, v30

    move-wide/from16 v30, v18

    move-wide/from16 v18, v26

    move-wide/from16 v26, v9

    move-wide/from16 v9, v32

    move-wide/from16 v32, v72

    goto/16 :goto_0

    :cond_0
    move-object/from16 v70, v1

    move-object/from16 v71, v2

    const/4 v0, 0x1

    const/4 v1, 0x0

    aget-wide v2, v70, v1

    sub-long/2addr v7, v2

    aget-wide v1, v70, v0

    sub-long/2addr v9, v1

    aget-wide v1, v70, v25

    sub-long/2addr v11, v1

    aget-wide v1, v70, v28

    sub-long/2addr v13, v1

    const/4 v1, 0x4

    aget-wide v1, v70, v1

    sub-long v16, v16, v1

    const/4 v1, 0x5

    aget-wide v1, v70, v1

    sub-long v18, v18, v1

    const/4 v1, 0x6

    aget-wide v2, v70, v1

    sub-long v20, v20, v2

    aget-wide v1, v70, v22

    sub-long v23, v23, v1

    const/16 v1, 0x8

    aget-wide v1, v70, v1

    sub-long v26, v26, v1

    const/16 v1, 0x9

    aget-wide v1, v70, v1

    sub-long v30, v30, v1

    const/16 v1, 0xa

    aget-wide v1, v70, v1

    sub-long v32, v32, v1

    aget-wide v1, v70, v34

    sub-long v35, v35, v1

    const/16 v1, 0xc

    aget-wide v1, v70, v1

    sub-long v37, v37, v1

    const/16 v1, 0xd

    aget-wide v1, v70, v1

    const/4 v3, 0x0

    aget-wide v4, v71, v3

    add-long/2addr v1, v4

    sub-long v39, v39, v1

    aget-wide v1, v70, v41

    aget-wide v4, v71, v0

    add-long/2addr v1, v4

    sub-long v42, v42, v1

    aget-wide v1, v70, v44

    sub-long v45, v45, v1

    aput-wide v7, p2, v3

    aput-wide v9, p2, v0

    aput-wide v11, p2, v25

    aput-wide v13, p2, v28

    const/4 v0, 0x4

    aput-wide v16, p2, v0

    const/4 v0, 0x5

    aput-wide v18, p2, v0

    const/4 v0, 0x6

    aput-wide v20, p2, v0

    aput-wide v23, p2, v22

    const/16 v0, 0x8

    aput-wide v26, p2, v0

    const/16 v0, 0x9

    aput-wide v30, p2, v0

    const/16 v0, 0xa

    aput-wide v32, p2, v0

    aput-wide v35, p2, v34

    const/16 v0, 0xc

    aput-wide v37, p2, v0

    const/16 v0, 0xd

    aput-wide v39, p2, v0

    aput-wide v42, p2, v41

    aput-wide v45, p2, v44

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method public encryptBlock([J[J)V
    .locals 70

    move-object/from16 v0, p0

    .line 0
    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->kw:[J

    iget-object v2, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->t:[J

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$300()[I

    move-result-object v3

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$100()[I

    move-result-object v4

    array-length v5, v1

    const/16 v6, 0x21

    if-ne v5, v6, :cond_2

    array-length v5, v2

    const/4 v6, 0x5

    if-ne v5, v6, :cond_1

    const/4 v5, 0x0

    aget-wide v7, p1, v5

    const/4 v5, 0x1

    aget-wide v9, p1, v5

    const/4 v5, 0x2

    aget-wide v11, p1, v5

    const/4 v5, 0x3

    aget-wide v13, p1, v5

    const/4 v5, 0x0

    const/4 v15, 0x4

    aget-wide v16, p1, v15

    aget-wide v18, p1, v6

    const/16 v20, 0x6

    aget-wide v21, p1, v20

    const/16 v23, 0x7

    aget-wide v24, p1, v23

    const/16 v26, 0x1

    const/16 v27, 0x8

    aget-wide v28, p1, v27

    const/16 v30, 0x2

    const/16 v31, 0x9

    aget-wide v31, p1, v31

    const/16 v33, 0x3

    const/16 v34, 0xa

    aget-wide v35, p1, v34

    const/16 v37, 0xb

    aget-wide v38, p1, v37

    const/16 v40, 0x9

    const/16 v41, 0xc

    aget-wide v41, p1, v41

    const/16 v43, 0xc

    const/16 v44, 0xd

    aget-wide v45, p1, v44

    const/16 v47, 0xe

    aget-wide v48, p1, v47

    const/16 v50, 0xf

    aget-wide v51, p1, v50

    aget-wide v53, v1, v5

    add-long v7, v7, v53

    aget-wide v53, v1, v26

    add-long v9, v9, v53

    aget-wide v53, v1, v30

    add-long v11, v11, v53

    aget-wide v53, v1, v33

    add-long v13, v13, v53

    aget-wide v53, v1, v15

    add-long v16, v16, v53

    aget-wide v53, v1, v6

    add-long v18, v18, v53

    aget-wide v53, v1, v20

    add-long v21, v21, v53

    aget-wide v53, v1, v23

    add-long v24, v24, v53

    aget-wide v53, v1, v27

    add-long v28, v28, v53

    aget-wide v53, v1, v40

    add-long v31, v31, v53

    aget-wide v53, v1, v34

    add-long v35, v35, v53

    aget-wide v53, v1, v37

    add-long v38, v38, v53

    aget-wide v53, v1, v43

    add-long v41, v41, v53

    aget-wide v53, v1, v44

    aget-wide v55, v2, v5

    add-long v53, v53, v55

    add-long v53, v53, v45

    aget-wide v45, v1, v47

    aget-wide v55, v2, v26

    add-long v45, v45, v55

    add-long v45, v45, v48

    aget-wide v48, v1, v50

    add-long v51, v51, v48

    const/4 v6, 0x1

    move-object v15, v1

    move-wide/from16 v0, v18

    move-wide/from16 v57, v24

    move-wide/from16 v59, v31

    move-wide/from16 v61, v38

    move-wide/from16 v63, v51

    move-wide/from16 v65, v53

    const/16 v5, 0xd

    move-object/from16 v19, v2

    :goto_0
    const/16 v2, 0x14

    if-ge v6, v2, :cond_0

    aget v2, v3, v6

    aget v24, v4, v6

    add-long/2addr v7, v9

    move-object/from16 v25, v3

    const/16 v3, 0x18

    invoke-static {v9, v10, v3, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long/2addr v11, v13

    invoke-static {v13, v14, v5, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    move-object v5, v4

    add-long v3, v16, v0

    move-object/from16 p1, v5

    const/16 v5, 0x8

    invoke-static {v0, v1, v5, v3, v4}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    move/from16 v27, v6

    move-wide/from16 v31, v9

    move-wide/from16 v5, v57

    add-long v9, v21, v5

    move/from16 v34, v2

    const/16 v2, 0x2f

    invoke-static {v5, v6, v2, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v5

    move-wide/from16 v16, v0

    move-wide/from16 v38, v13

    move-wide/from16 v0, v59

    add-long v13, v28, v0

    const/16 v2, 0x8

    invoke-static {v0, v1, v2, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    move-wide/from16 v43, v5

    move-wide/from16 v21, v13

    move-wide/from16 v13, v61

    add-long v5, v35, v13

    const/16 v2, 0x11

    invoke-static {v13, v14, v2, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    move-wide/from16 v48, v3

    move-wide/from16 v28, v5

    move-wide/from16 v5, v65

    add-long v2, v41, v5

    const/16 v4, 0x16

    invoke-static {v5, v6, v4, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    move-wide/from16 v35, v2

    move-wide/from16 v51, v9

    move-wide/from16 v2, v63

    add-long v9, v45, v2

    const/16 v6, 0x25

    invoke-static {v2, v3, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v7, v0

    const/16 v6, 0x26

    invoke-static {v0, v1, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    add-long/2addr v11, v4

    const/16 v6, 0x13

    invoke-static {v4, v5, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    move-wide/from16 v40, v0

    add-long v0, v51, v13

    const/16 v6, 0xa

    invoke-static {v13, v14, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    move-wide/from16 v45, v13

    add-long v13, v48, v2

    const/16 v6, 0x37

    invoke-static {v2, v3, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    move-wide/from16 v48, v4

    add-long v4, v28, v43

    const/16 v6, 0x31

    move-wide/from16 v28, v2

    move-wide/from16 v2, v43

    invoke-static {v2, v3, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    move-wide/from16 v42, v4

    add-long v4, v35, v38

    const/16 v6, 0x12

    move-wide/from16 v35, v0

    move-wide/from16 v0, v38

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    add-long v9, v9, v16

    const/16 v6, 0x17

    move-wide/from16 v38, v4

    move-wide/from16 v4, v16

    invoke-static {v4, v5, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    move-wide/from16 v16, v9

    add-long v9, v21, v31

    const/16 v6, 0x34

    move-wide/from16 v21, v0

    move-wide/from16 v0, v31

    invoke-static {v0, v1, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    add-long/2addr v7, v2

    const/16 v6, 0x21

    invoke-static {v2, v3, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v11, v4

    const/4 v6, 0x4

    invoke-static {v4, v5, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    add-long v13, v13, v21

    const/16 v6, 0x33

    move-wide/from16 v31, v2

    move-wide/from16 v2, v21

    invoke-static {v2, v3, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    move-wide/from16 v21, v2

    add-long v2, v35, v0

    const/16 v6, 0xd

    invoke-static {v0, v1, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    move-wide/from16 v35, v4

    add-long v4, v38, v28

    const/16 v6, 0x22

    move-wide/from16 v38, v0

    move-wide/from16 v0, v28

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    move-wide/from16 v28, v4

    add-long v4, v16, v48

    const/16 v6, 0x29

    move-wide/from16 v16, v13

    move-wide/from16 v13, v48

    invoke-static {v13, v14, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    add-long v9, v9, v45

    const/16 v6, 0x3b

    move-wide/from16 v48, v4

    move-wide/from16 v4, v45

    invoke-static {v4, v5, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    move-wide/from16 v44, v9

    add-long v9, v42, v40

    const/16 v6, 0x11

    move-wide/from16 v42, v2

    move-wide/from16 v2, v40

    invoke-static {v2, v3, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v7, v0

    const/4 v6, 0x5

    invoke-static {v0, v1, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    add-long/2addr v11, v4

    const/16 v6, 0x14

    invoke-static {v4, v5, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    move-wide/from16 v40, v0

    add-long v0, v42, v13

    const/16 v6, 0x30

    invoke-static {v13, v14, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    move-wide/from16 v42, v13

    add-long v13, v16, v2

    const/16 v6, 0x29

    invoke-static {v2, v3, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    move-wide/from16 v16, v4

    add-long v4, v48, v38

    const/16 v6, 0x2f

    move-wide/from16 v48, v2

    move-wide/from16 v2, v38

    invoke-static {v2, v3, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    move-wide/from16 v38, v4

    add-long v4, v44, v35

    const/16 v6, 0x1c

    move-wide/from16 v44, v0

    move-wide/from16 v0, v35

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    add-long v9, v9, v21

    const/16 v6, 0x10

    move-wide/from16 v35, v4

    move-wide/from16 v4, v21

    invoke-static {v4, v5, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    move-wide/from16 v21, v9

    add-long v9, v28, v31

    const/16 v6, 0x19

    move-wide/from16 v28, v0

    move-wide/from16 v0, v31

    invoke-static {v0, v1, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    aget-wide v31, v15, v34

    add-long v7, v7, v31

    add-int/lit8 v6, v34, 0x1

    aget-wide v31, v15, v6

    add-long v2, v2, v31

    add-int/lit8 v31, v34, 0x2

    aget-wide v51, v15, v31

    add-long v11, v11, v51

    add-int/lit8 v32, v34, 0x3

    aget-wide v51, v15, v32

    add-long v4, v4, v51

    add-int/lit8 v46, v34, 0x4

    aget-wide v51, v15, v46

    add-long v13, v13, v51

    add-int/lit8 v51, v34, 0x5

    aget-wide v52, v15, v51

    move-wide/from16 v54, v13

    add-long v13, v28, v52

    add-int/lit8 v28, v34, 0x6

    aget-wide v52, v15, v28

    add-long v44, v44, v52

    add-int/lit8 v29, v34, 0x7

    aget-wide v52, v15, v29

    add-long v0, v0, v52

    add-int/lit8 v52, v34, 0x8

    aget-wide v56, v15, v52

    add-long v35, v35, v56

    add-int/lit8 v53, v34, 0x9

    aget-wide v56, v15, v53

    move-wide/from16 v58, v0

    add-long v0, v48, v56

    add-int/lit8 v48, v34, 0xa

    aget-wide v56, v15, v48

    add-long v21, v21, v56

    add-int/lit8 v49, v34, 0xb

    aget-wide v56, v15, v49

    move-wide/from16 v60, v0

    add-long v0, v16, v56

    add-int/lit8 v16, v34, 0xc

    aget-wide v56, v15, v16

    add-long v9, v9, v56

    add-int/lit8 v17, v34, 0xd

    aget-wide v56, v15, v17

    aget-wide v62, v19, v24

    add-long v56, v56, v62

    move-wide/from16 v62, v9

    add-long v9, v56, v42

    add-int/lit8 v42, v34, 0xe

    aget-wide v56, v15, v42

    add-int/lit8 v43, v24, 0x1

    aget-wide v64, v19, v43

    add-long v56, v56, v64

    add-long v56, v56, v38

    add-int/lit8 v38, v34, 0xf

    aget-wide v64, v15, v38

    move/from16 v39, v6

    move-wide/from16 v66, v9

    move/from16 v6, v27

    int-to-long v9, v6

    add-long v64, v64, v9

    move-wide/from16 v68, v9

    add-long v9, v64, v40

    add-long/2addr v7, v2

    const/16 v6, 0x29

    invoke-static {v2, v3, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v11, v4

    const/16 v6, 0x9

    invoke-static {v4, v5, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    move-wide/from16 v40, v2

    add-long v2, v54, v13

    const/16 v6, 0x25

    invoke-static {v13, v14, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    move-wide/from16 v54, v13

    add-long v13, v44, v58

    const/16 v6, 0x1f

    move-wide/from16 v44, v4

    move-wide/from16 v4, v58

    invoke-static {v4, v5, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    move-wide/from16 v58, v4

    add-long v4, v35, v60

    const/16 v6, 0xc

    move-wide/from16 v35, v2

    move-wide/from16 v2, v60

    invoke-static {v2, v3, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    move-wide/from16 v60, v4

    add-long v4, v21, v0

    const/16 v6, 0x2f

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    move-wide/from16 v21, v4

    add-long v4, v62, v66

    const/16 v6, 0x2c

    move-wide/from16 v62, v0

    move-wide/from16 v0, v66

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    move-wide/from16 v64, v4

    add-long v4, v56, v9

    const/16 v6, 0x1e

    invoke-static {v9, v10, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long/2addr v7, v2

    const/16 v6, 0x10

    invoke-static {v2, v3, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v11, v0

    const/16 v6, 0x22

    invoke-static {v0, v1, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    add-long v13, v13, v62

    const/16 v6, 0x38

    move-wide/from16 v56, v2

    move-wide/from16 v2, v62

    invoke-static {v2, v3, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    move-wide/from16 v62, v2

    add-long v2, v35, v9

    const/16 v6, 0x33

    invoke-static {v9, v10, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    move-wide/from16 v35, v0

    add-long v0, v21, v58

    const/4 v6, 0x4

    move-wide/from16 v21, v9

    move-wide/from16 v9, v58

    invoke-static {v9, v10, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    move-wide/from16 v58, v0

    add-long v0, v64, v44

    const/16 v6, 0x35

    move-wide/from16 v64, v13

    move-wide/from16 v13, v44

    invoke-static {v13, v14, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    add-long v4, v4, v54

    const/16 v6, 0x2a

    move-wide/from16 v44, v0

    move-wide/from16 v0, v54

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    move-wide/from16 v54, v4

    add-long v4, v60, v40

    const/16 v6, 0x29

    move-wide/from16 v60, v2

    move-wide/from16 v2, v40

    invoke-static {v2, v3, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v7, v9

    const/16 v6, 0x1f

    invoke-static {v9, v10, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long/2addr v11, v0

    const/16 v6, 0x2c

    invoke-static {v0, v1, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    move-wide/from16 v40, v9

    add-long v9, v60, v13

    const/16 v6, 0x2f

    invoke-static {v13, v14, v6, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    move-wide/from16 v60, v13

    add-long v13, v64, v2

    const/16 v6, 0x2e

    invoke-static {v2, v3, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    move-wide/from16 v64, v0

    add-long v0, v44, v21

    const/16 v6, 0x13

    move-wide/from16 v44, v2

    move-wide/from16 v2, v21

    invoke-static {v2, v3, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    move-wide/from16 v21, v0

    add-long v0, v54, v35

    const/16 v6, 0x2a

    move-wide/from16 v54, v9

    move-wide/from16 v9, v35

    invoke-static {v9, v10, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long v4, v4, v62

    const/16 v6, 0x2c

    move-wide/from16 v35, v0

    move-wide/from16 v0, v62

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    move-wide/from16 v62, v4

    add-long v4, v58, v56

    const/16 v6, 0x19

    move-wide/from16 v58, v9

    move-wide/from16 v9, v56

    invoke-static {v9, v10, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long/2addr v7, v2

    const/16 v6, 0x9

    invoke-static {v2, v3, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v11, v0

    const/16 v6, 0x30

    invoke-static {v0, v1, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    add-long v13, v13, v58

    const/16 v6, 0x23

    move-wide/from16 v56, v2

    move-wide/from16 v2, v58

    invoke-static {v2, v3, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    move-wide/from16 v58, v2

    add-long v2, v54, v9

    const/16 v6, 0x34

    invoke-static {v9, v10, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    move-wide/from16 v54, v0

    add-long v0, v35, v44

    const/16 v6, 0x17

    move-wide/from16 v35, v9

    move-wide/from16 v9, v44

    invoke-static {v9, v10, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    move-wide/from16 v44, v0

    add-long v0, v62, v64

    const/16 v6, 0x1f

    move-wide/from16 v62, v13

    move-wide/from16 v13, v64

    invoke-static {v13, v14, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    add-long v4, v4, v60

    const/16 v6, 0x25

    move-wide/from16 v64, v0

    move-wide/from16 v0, v60

    invoke-static {v0, v1, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    move-wide/from16 v60, v4

    add-long v4, v21, v40

    const/16 v6, 0x14

    move-wide/from16 v21, v13

    move-wide/from16 v13, v40

    invoke-static {v13, v14, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    aget-wide v39, v15, v39

    add-long v7, v39, v7

    aget-wide v39, v15, v31

    add-long v9, v9, v39

    aget-wide v31, v15, v32

    add-long v11, v11, v31

    aget-wide v31, v15, v46

    add-long v0, v0, v31

    aget-wide v31, v15, v51

    add-long v2, v2, v31

    aget-wide v31, v15, v28

    add-long v21, v21, v31

    aget-wide v28, v15, v29

    add-long v28, v62, v28

    aget-wide v31, v15, v52

    add-long v13, v13, v31

    aget-wide v31, v15, v53

    add-long v31, v64, v31

    aget-wide v39, v15, v48

    add-long v35, v35, v39

    aget-wide v39, v15, v49

    add-long v39, v60, v39

    aget-wide v48, v15, v16

    add-long v61, v54, v48

    aget-wide v16, v15, v17

    add-long v4, v4, v16

    aget-wide v16, v15, v42

    aget-wide v41, v19, v43

    add-long v16, v16, v41

    add-long v65, v16, v58

    aget-wide v16, v15, v38

    add-int/lit8 v24, v24, 0x2

    aget-wide v41, v19, v24

    add-long v16, v16, v41

    add-long v45, v16, v44

    add-int/lit8 v6, v34, 0x10

    aget-wide v16, v15, v6

    add-long v16, v16, v68

    const-wide/16 v41, 0x1

    add-long v16, v16, v41

    add-long v63, v16, v56

    add-int/lit8 v6, v27, 0x2

    const/16 v16, 0xd

    move-wide/from16 v16, v2

    move-wide/from16 v41, v4

    move-wide/from16 v57, v13

    move-object/from16 v3, v25

    move-wide/from16 v59, v35

    move-wide/from16 v35, v39

    const/16 v5, 0xd

    move-object/from16 v4, p1

    move-wide v13, v0

    move-wide/from16 v0, v21

    move-wide/from16 v21, v28

    move-wide/from16 v28, v31

    goto/16 :goto_0

    :cond_0
    move-wide/from16 v43, v0

    move-wide/from16 v38, v13

    move-wide/from16 v31, v57

    move-wide/from16 v0, v59

    move-wide/from16 v13, v61

    move-wide/from16 v2, v63

    move-wide/from16 v5, v65

    const/4 v4, 0x0

    aput-wide v7, p2, v4

    aput-wide v9, p2, v26

    aput-wide v11, p2, v30

    aput-wide v38, p2, v33

    const/4 v4, 0x4

    aput-wide v16, p2, v4

    const/4 v4, 0x5

    aput-wide v43, p2, v4

    aput-wide v21, p2, v20

    aput-wide v31, p2, v23

    const/16 v4, 0x8

    aput-wide v28, p2, v4

    const/16 v4, 0x9

    aput-wide v0, p2, v4

    const/16 v0, 0xa

    aput-wide v35, p2, v0

    aput-wide v13, p2, v37

    const/16 v0, 0xc

    aput-wide v41, p2, v0

    const/16 v0, 0xd

    aput-wide v5, p2, v0

    aput-wide v45, p2, v47

    aput-wide v2, p2, v50

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method
