.class public Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;
.super Ljava/lang/Object;


# static fields
.field public static final KeccakRoundConstants:[J


# instance fields
.field public bytesInQueue:I

.field public squeezing:Z

.field public final theQueue:[B

.field public final theRateBytes:I

.field public final theRounds:I

.field public final theState:[J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x18

    new-array v0, v0, [J

    .line 0
    fill-array-data v0, :array_0

    sput-object v0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->KeccakRoundConstants:[J

    return-void

    :array_0
    .array-data 8
        0x1
        0x8082
        -0x7fffffffffff7f76L    # -1.62577E-319
        -0x7fffffff7fff8000L    # -1.061014085E-314
        0x808b
        0x80000001L
        -0x7fffffff7fff7f7fL    # -1.061014149E-314
        -0x7fffffffffff7ff7L    # -1.6194E-319
        0x8a
        0x88
        0x80008009L
        0x8000000aL
        0x8000808bL
        -0x7fffffffffffff75L    # -6.87E-322
        -0x7fffffffffff7f77L    # -1.6257E-319
        -0x7fffffffffff7ffdL    # -1.6191E-319
        -0x7fffffffffff7ffeL    # -1.61905E-319
        -0x7fffffffffffff80L    # -6.32E-322
        0x800a
        -0x7fffffff7ffffff6L    # -1.0609979004E-314
        -0x7fffffff7fff7f7fL    # -1.061014149E-314
        -0x7fffffffffff7f80L    # -1.6253E-319
        0x80000001L
        -0x7fffffff7fff7ff8L    # -1.061014089E-314
    .end array-data
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x19

    new-array v0, v0, [J

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theState:[J

    shl-int/lit8 p1, p1, 0x1

    rsub-int p1, p1, 0x640

    shr-int/lit8 p1, p1, 0x3

    iput p1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    iput p2, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRounds:I

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theQueue:[B

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->initSponge()V

    return-void
.end method

.method private KangarooAbsorb([BI)V
    .locals 7

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    shr-int/lit8 v0, v0, 0x3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theState:[J

    aget-wide v3, v2, v1

    invoke-static {p1, p2}, Lorg/bouncycastle/util/Pack;->littleEndianToLong([BI)J

    move-result-wide v5

    xor-long/2addr v3, v5

    aput-wide v3, v2, v1

    add-int/lit8 p2, p2, 0x8

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->KangarooPermutation()V

    return-void
.end method

.method private KangarooExtract()V
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theState:[J

    iget v1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    shr-int/lit8 v1, v1, 0x3

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theQueue:[B

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v3}, Lorg/bouncycastle/util/Pack;->longToLittleEndian([JII[BI)V

    return-void
.end method

.method private KangarooPermutation()V
    .locals 98

    move-object/from16 v0, p0

    .line 0
    iget-object v1, v0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theState:[J

    const/4 v2, 0x0

    aget-wide v2, v1, v2

    const/4 v4, 0x1

    aget-wide v4, v1, v4

    const/4 v6, 0x2

    aget-wide v6, v1, v6

    const/4 v8, 0x3

    aget-wide v8, v1, v8

    const/4 v10, 0x4

    aget-wide v10, v1, v10

    const/4 v12, 0x5

    aget-wide v13, v1, v12

    const/4 v15, 0x6

    aget-wide v16, v1, v15

    const/16 v18, 0x7

    aget-wide v19, v1, v18

    const/16 v21, 0x8

    aget-wide v22, v1, v21

    const/16 v24, 0x9

    aget-wide v25, v1, v24

    const/16 v27, 0xa

    aget-wide v28, v1, v27

    const/16 v30, 0xb

    aget-wide v31, v1, v30

    const/16 v33, 0xc

    aget-wide v34, v1, v33

    const/16 v36, 0xd

    aget-wide v37, v1, v36

    const/16 v39, 0xe

    aget-wide v40, v1, v39

    const/16 v42, 0xf

    aget-wide v43, v1, v42

    const/16 v45, 0x10

    aget-wide v45, v1, v45

    const/16 v47, 0x11

    aget-wide v47, v1, v47

    const/16 v49, 0x12

    aget-wide v50, v1, v49

    const/16 v52, 0x13

    aget-wide v53, v1, v52

    const/16 v55, 0x14

    aget-wide v56, v1, v55

    const/16 v58, 0x15

    aget-wide v59, v1, v58

    const/16 v61, 0x16

    aget-wide v61, v1, v61

    const/16 v63, 0x17

    aget-wide v64, v1, v63

    const/16 v66, 0x18

    aget-wide v66, v1, v66

    const/16 v68, 0x0

    sget-object v12, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->KeccakRoundConstants:[J

    array-length v12, v12

    const/16 v69, 0x1

    iget v15, v0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRounds:I

    sub-int/2addr v12, v15

    const/4 v15, 0x0

    const/16 v70, 0x2

    move-object/from16 v71, v1

    :goto_0
    iget v1, v0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRounds:I

    if-ge v15, v1, :cond_0

    xor-long v72, v2, v13

    xor-long v72, v72, v28

    xor-long v72, v72, v43

    xor-long v72, v72, v56

    xor-long v74, v4, v16

    xor-long v74, v74, v31

    xor-long v74, v74, v45

    xor-long v74, v74, v59

    xor-long v76, v6, v19

    xor-long v76, v76, v34

    xor-long v76, v76, v47

    xor-long v76, v76, v61

    xor-long v78, v8, v22

    xor-long v78, v78, v37

    xor-long v78, v78, v50

    xor-long v78, v78, v64

    xor-long v80, v10, v25

    xor-long v80, v80, v40

    xor-long v80, v80, v53

    xor-long v80, v80, v66

    shl-long v82, v74, v69

    const/4 v1, -0x1

    ushr-long v84, v74, v1

    or-long v82, v82, v84

    xor-long v82, v82, v80

    shl-long v84, v76, v69

    ushr-long v86, v76, v1

    or-long v84, v84, v86

    xor-long v84, v84, v72

    shl-long v86, v78, v69

    ushr-long v88, v78, v1

    or-long v86, v86, v88

    xor-long v74, v86, v74

    shl-long v86, v80, v69

    ushr-long v80, v80, v1

    or-long v80, v86, v80

    xor-long v76, v80, v76

    shl-long v80, v72, v69

    ushr-long v72, v72, v1

    or-long v72, v80, v72

    xor-long v72, v72, v78

    xor-long v1, v2, v82

    xor-long v13, v13, v82

    xor-long v28, v28, v82

    xor-long v43, v43, v82

    xor-long v56, v56, v82

    xor-long v3, v4, v84

    xor-long v16, v16, v84

    xor-long v31, v31, v84

    xor-long v45, v45, v84

    xor-long v59, v59, v84

    xor-long v5, v6, v74

    xor-long v19, v19, v74

    xor-long v34, v34, v74

    xor-long v47, v47, v74

    xor-long v61, v61, v74

    xor-long v7, v8, v76

    xor-long v22, v22, v76

    xor-long v37, v37, v76

    xor-long v50, v50, v76

    xor-long v64, v64, v76

    xor-long v9, v10, v72

    xor-long v25, v25, v72

    xor-long v40, v40, v72

    xor-long v53, v53, v72

    xor-long v66, v66, v72

    shl-long v72, v3, v69

    const/16 v11, 0x3f

    ushr-long/2addr v3, v11

    or-long v3, v72, v3

    const/16 v11, 0x2c

    shl-long v72, v16, v11

    ushr-long v16, v16, v55

    move/from16 v74, v12

    or-long v11, v72, v16

    shl-long v16, v25, v55

    const/16 v72, 0x2c

    ushr-long v25, v25, v72

    const/16 v72, 0x3

    move-wide/from16 v75, v3

    or-long v3, v16, v25

    const/16 v16, 0x3d

    shl-long v16, v61, v16

    ushr-long v25, v61, v72

    move-wide/from16 v61, v3

    or-long v3, v16, v25

    const/16 v16, 0x27

    shl-long v16, v40, v16

    const/16 v25, 0x19

    ushr-long v25, v40, v25

    move-wide/from16 v40, v3

    or-long v3, v16, v25

    shl-long v16, v56, v49

    const/16 v25, 0x2e

    ushr-long v25, v56, v25

    move-wide/from16 v56, v3

    or-long v3, v16, v25

    const/16 v16, 0x3e

    shl-long v16, v5, v16

    ushr-long v5, v5, v70

    or-long v5, v16, v5

    const/16 v16, 0x2b

    shl-long v16, v34, v16

    ushr-long v25, v34, v58

    move-wide/from16 v34, v5

    or-long v5, v16, v25

    const/16 v16, 0x19

    shl-long v16, v37, v16

    const/16 v25, 0x27

    ushr-long v25, v37, v25

    move-wide/from16 v37, v3

    or-long v3, v16, v25

    shl-long v16, v53, v21

    const/16 v25, 0x38

    ushr-long v53, v53, v25

    move-wide/from16 v77, v3

    or-long v3, v16, v53

    shl-long v16, v64, v25

    ushr-long v25, v64, v21

    move-wide/from16 v53, v3

    or-long v3, v16, v25

    const/16 v16, 0x29

    shl-long v16, v43, v16

    ushr-long v25, v43, v63

    move-wide/from16 v43, v3

    or-long v3, v16, v25

    const/16 v16, 0x1b

    shl-long v16, v9, v16

    const/16 v25, 0x25

    ushr-long v9, v9, v25

    or-long v9, v16, v9

    shl-long v16, v66, v39

    const/16 v25, 0x32

    ushr-long v25, v66, v25

    move-wide/from16 v64, v3

    or-long v3, v16, v25

    shl-long v16, v59, v70

    const/16 v25, 0x3e

    ushr-long v25, v59, v25

    move-wide/from16 v59, v9

    or-long v9, v16, v25

    const/16 v16, 0x37

    shl-long v16, v22, v16

    ushr-long v22, v22, v24

    move-wide/from16 v25, v9

    or-long v9, v16, v22

    const/16 v16, 0x2d

    shl-long v16, v45, v16

    ushr-long v22, v45, v52

    move-wide/from16 v45, v9

    or-long v9, v16, v22

    const/16 v16, 0x24

    shl-long v16, v13, v16

    const/16 v22, 0x1c

    ushr-long v13, v13, v22

    or-long v13, v16, v13

    shl-long v16, v7, v22

    const/16 v22, 0x24

    ushr-long v7, v7, v22

    or-long v7, v16, v7

    shl-long v16, v50, v58

    const/16 v22, 0x2b

    ushr-long v22, v50, v22

    move-wide/from16 v50, v13

    or-long v13, v16, v22

    shl-long v16, v47, v42

    const/16 v22, 0x31

    ushr-long v22, v47, v22

    move-wide/from16 v47, v9

    or-long v9, v16, v22

    shl-long v16, v31, v27

    const/16 v22, 0x36

    ushr-long v22, v31, v22

    move-wide/from16 v31, v9

    or-long v9, v16, v22

    const/16 v16, 0x6

    shl-long v22, v19, v16

    const/16 v16, 0x3a

    ushr-long v16, v19, v16

    move-wide/from16 v19, v9

    or-long v9, v22, v16

    shl-long v16, v28, v72

    const/16 v22, 0x3d

    ushr-long v22, v28, v22

    move-wide/from16 v28, v9

    or-long v9, v16, v22

    move-wide/from16 v16, v7

    not-long v7, v11

    and-long/2addr v7, v5

    xor-long/2addr v7, v1

    move-wide/from16 v22, v7

    not-long v7, v5

    and-long/2addr v7, v13

    xor-long/2addr v7, v11

    move-wide/from16 v66, v7

    not-long v7, v13

    and-long/2addr v7, v3

    xor-long v6, v5, v7

    move-wide/from16 v72, v6

    not-long v5, v3

    and-long/2addr v5, v1

    xor-long/2addr v5, v13

    not-long v1, v1

    and-long/2addr v1, v11

    xor-long/2addr v1, v3

    move-wide/from16 v3, v61

    not-long v7, v3

    and-long/2addr v7, v9

    xor-long v13, v16, v7

    not-long v7, v9

    and-long v7, v7, v47

    xor-long/2addr v7, v3

    move-wide/from16 v11, v47

    move-wide/from16 v47, v1

    not-long v0, v11

    and-long v0, v0, v40

    xor-long/2addr v0, v9

    move-wide/from16 v9, v40

    move-wide/from16 v40, v0

    not-long v0, v9

    and-long v0, v0, v16

    xor-long/2addr v0, v11

    move-wide/from16 v11, v16

    not-long v11, v11

    and-long v2, v11, v3

    xor-long/2addr v2, v9

    move-wide/from16 v9, v28

    not-long v11, v9

    and-long v11, v11, v77

    xor-long v28, v75, v11

    move-wide/from16 v16, v0

    move-wide/from16 v11, v77

    not-long v0, v11

    and-long v0, v0, v53

    xor-long/2addr v0, v9

    move-wide/from16 v61, v0

    move-wide/from16 v0, v53

    move-wide/from16 v53, v2

    not-long v2, v0

    and-long v2, v2, v37

    xor-long/2addr v2, v11

    move-wide/from16 v11, v37

    move-wide/from16 v37, v2

    not-long v2, v11

    and-long v2, v2, v75

    xor-long/2addr v0, v2

    move-wide/from16 v2, v75

    not-long v2, v2

    and-long/2addr v2, v9

    xor-long/2addr v2, v11

    move-wide/from16 v9, v50

    not-long v11, v9

    and-long v11, v11, v19

    xor-long v11, v59, v11

    move-wide/from16 v50, v0

    move-wide/from16 v0, v19

    move-wide/from16 v19, v2

    not-long v2, v0

    and-long v2, v2, v31

    xor-long/2addr v2, v9

    move-wide/from16 v75, v2

    move-wide/from16 v2, v31

    move-wide/from16 v31, v5

    not-long v4, v2

    and-long v4, v4, v43

    xor-long/2addr v0, v4

    move-wide/from16 v4, v43

    move-wide/from16 v43, v0

    not-long v0, v4

    and-long v0, v0, v59

    xor-long/2addr v0, v2

    move-wide/from16 v2, v59

    not-long v2, v2

    and-long/2addr v2, v9

    xor-long/2addr v2, v4

    move-wide/from16 v4, v45

    not-long v9, v4

    and-long v9, v9, v56

    xor-long v9, v34, v9

    move-wide/from16 v45, v0

    move-wide/from16 v0, v56

    move-wide/from16 v56, v2

    not-long v2, v0

    and-long v2, v2, v64

    xor-long v59, v2, v4

    move-wide/from16 v2, v64

    move-wide/from16 v64, v7

    not-long v6, v2

    and-long v6, v6, v25

    xor-long/2addr v0, v6

    move-wide/from16 v6, v25

    move-wide/from16 v25, v0

    not-long v0, v6

    and-long v0, v0, v34

    xor-long/2addr v0, v2

    move-wide/from16 v2, v34

    not-long v2, v2

    and-long/2addr v2, v4

    xor-long/2addr v2, v6

    sget-object v4, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->KeccakRoundConstants:[J

    add-int v5, v74, v15

    aget-wide v5, v4, v5

    xor-long v4, v22, v5

    add-int/lit8 v15, v15, 0x1

    move-wide/from16 v22, v16

    move-wide/from16 v34, v37

    move-wide/from16 v37, v50

    move-wide/from16 v16, v64

    move-wide/from16 v6, v72

    move-wide/from16 v64, v0

    move-wide/from16 v50, v45

    move-wide/from16 v45, v75

    move-object/from16 v0, p0

    move-wide/from16 v90, v11

    move/from16 v12, v74

    move-wide/from16 v92, v4

    move-wide/from16 v4, v66

    move-wide/from16 v66, v2

    move-wide/from16 v2, v92

    move-wide/from16 v94, v31

    move-wide/from16 v31, v61

    move-wide/from16 v61, v25

    move-wide/from16 v25, v53

    move-wide/from16 v53, v56

    move-wide/from16 v56, v9

    move-wide/from16 v8, v94

    move-wide/from16 v10, v47

    move-wide/from16 v47, v43

    move-wide/from16 v43, v90

    move-wide/from16 v96, v19

    move-wide/from16 v19, v40

    move-wide/from16 v40, v96

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x3

    const/4 v1, 0x4

    aput-wide v2, v71, v68

    aput-wide v4, v71, v69

    aput-wide v6, v71, v70

    aput-wide v8, v71, v0

    aput-wide v10, v71, v1

    const/4 v0, 0x5

    aput-wide v13, v71, v0

    const/4 v0, 0x6

    aput-wide v16, v71, v0

    aput-wide v19, v71, v18

    aput-wide v22, v71, v21

    aput-wide v25, v71, v24

    aput-wide v28, v71, v27

    aput-wide v31, v71, v30

    aput-wide v34, v71, v33

    aput-wide v37, v71, v36

    aput-wide v40, v71, v39

    aput-wide v43, v71, v42

    const/16 v0, 0x10

    aput-wide v45, v71, v0

    const/16 v0, 0x11

    aput-wide v47, v71, v0

    aput-wide v50, v71, v49

    aput-wide v53, v71, v52

    aput-wide v56, v71, v55

    aput-wide v59, v71, v58

    const/16 v0, 0x16

    aput-wide v61, v71, v0

    aput-wide v64, v71, v63

    const/16 v0, 0x18

    aput-wide v66, v71, v0

    return-void
.end method

.method private absorb([BII)V
    .locals 6

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->squeezing:Z

    if-nez v0, :cond_4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_3

    iget v2, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    iget v3, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theQueue:[B

    invoke-direct {p0, v2, v0}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->KangarooAbsorb([BI)V

    iput v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    :cond_0
    iget v2, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    if-nez v2, :cond_2

    iget v3, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    sub-int v3, p3, v3

    if-gt v1, v3, :cond_2

    :cond_1
    add-int v2, p2, v1

    invoke-direct {p0, p1, v2}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->KangarooAbsorb([BI)V

    iget v2, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    add-int/2addr v1, v2

    sub-int v2, p3, v2

    if-le v1, v2, :cond_1

    goto :goto_0

    :cond_2
    iget v3, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    sub-int/2addr v3, v2

    sub-int v2, p3, v1

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int v3, p2, v1

    iget-object v4, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theQueue:[B

    iget v5, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    invoke-static {p1, v3, v4, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v3, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    add-int/2addr v3, v2

    iput v3, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    add-int/2addr v1, v2

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "attempt to absorb while squeezing"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic access$100(Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;)I
    .locals 0

    .line 0
    iget p0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    return p0
.end method

.method public static synthetic access$200(Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;[BII)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->squeeze([BII)V

    return-void
.end method

.method public static synthetic access$300(Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;[BII)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->absorb([BII)V

    return-void
.end method

.method public static synthetic access$400(Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->initSponge()V

    return-void
.end method

.method public static synthetic access$500(Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->padAndSwitchToSqueezingPhase()V

    return-void
.end method

.method private initSponge()V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theState:[J

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/util/Arrays;->fill([JJ)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theQueue:[B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    iput v1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    iput-boolean v1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->squeezing:Z

    return-void
.end method

.method private padAndSwitchToSqueezingPhase()V
    .locals 5

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    :goto_0
    iget v1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theQueue:[B

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theQueue:[B

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    aget-byte v4, v0, v1

    xor-int/lit16 v4, v4, 0x80

    int-to-byte v4, v4

    aput-byte v4, v0, v1

    invoke-direct {p0, v0, v2}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->KangarooAbsorb([BI)V

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->KangarooExtract()V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    iput-boolean v3, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->squeezing:Z

    return-void
.end method

.method private squeeze([BII)V
    .locals 5

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->squeezing:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->padAndSwitchToSqueezingPhase()V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_2

    iget v1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    if-nez v1, :cond_1

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->KangarooPermutation()V

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->KangarooExtract()V

    iget v1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    iput v1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    :cond_1
    iget v1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    sub-int v2, p3, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theQueue:[B

    iget v3, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->theRateBytes:I

    iget v4, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    sub-int/2addr v3, v4

    add-int v4, p2, v0

    invoke-static {v2, v3, p1, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v2, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    sub-int/2addr v2, v1

    iput v2, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooSponge;->bytesInQueue:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    return-void
.end method
