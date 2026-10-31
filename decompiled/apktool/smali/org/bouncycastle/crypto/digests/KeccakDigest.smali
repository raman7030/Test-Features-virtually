.class public Lorg/bouncycastle/crypto/digests/KeccakDigest;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/ExtendedDigest;


# static fields
.field public static KeccakRoundConstants:[J


# instance fields
.field public bitsInQueue:I

.field public dataQueue:[B

.field public fixedOutputLength:I

.field public purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

.field public rate:I

.field public squeezing:Z

.field public state:[J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x18

    new-array v0, v0, [J

    .line 0
    fill-array-data v0, :array_0

    sput-object v0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->KeccakRoundConstants:[J

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

.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x120

    .line 0
    sget-object v1, Lorg/bouncycastle/crypto/CryptoServicePurpose;->ANY:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;-><init>(ILorg/bouncycastle/crypto/CryptoServicePurpose;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/crypto/CryptoServicePurpose;->ANY:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;-><init>(ILorg/bouncycastle/crypto/CryptoServicePurpose;)V

    return-void
.end method

.method public constructor <init>(ILorg/bouncycastle/crypto/CryptoServicePurpose;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x19

    new-array v0, v0, [J

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    const/16 v0, 0xc0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    iput-object p2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->init(I)V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->cryptoServiceProperties()Lorg/bouncycastle/crypto/CryptoServiceProperties;

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->checkConstraints(Lorg/bouncycastle/crypto/CryptoServiceProperties;)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/CryptoServicePurpose;)V
    .locals 1

    const/16 v0, 0x120

    .line 0
    invoke-direct {p0, v0, p1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;-><init>(ILorg/bouncycastle/crypto/CryptoServicePurpose;)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/digests/KeccakDigest;)V
    .locals 4

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x19

    new-array v0, v0, [J

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    const/16 v1, 0xc0

    new-array v1, v1, [B

    iput-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    iget-object v1, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    iput-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    iget-object v1, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    array-length v2, v0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    iget-boolean p1, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->cryptoServiceProperties()Lorg/bouncycastle/crypto/CryptoServiceProperties;

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->checkConstraints(Lorg/bouncycastle/crypto/CryptoServiceProperties;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 4

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x19

    new-array v0, v0, [J

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    const/16 v0, 0xc0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    const/4 v0, 0x0

    aget-byte v1, p1, v0

    invoke-static {v1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->getCryptoServicePurpose(B)Lorg/bouncycastle/crypto/CryptoServicePurpose;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    array-length v2, v1

    const/4 v3, 0x1

    invoke-static {p1, v3, v1, v0, v2}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI[JII)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x8

    add-int/2addr v1, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    array-length v3, v2

    invoke-static {p1, v1, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    array-length v2, v2

    add-int/2addr v1, v2

    invoke-static {p1, v1}, Lorg/bouncycastle/util/Pack;->bigEndianToInt([BI)I

    move-result v2

    iput v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    add-int/lit8 v2, v1, 0x4

    invoke-static {p1, v2}, Lorg/bouncycastle/util/Pack;->bigEndianToInt([BI)I

    move-result v2

    iput v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    add-int/lit8 v2, v1, 0x8

    invoke-static {p1, v2}, Lorg/bouncycastle/util/Pack;->bigEndianToInt([BI)I

    move-result v2

    iput v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    add-int/lit8 v1, v1, 0xc

    aget-byte p1, p1, v1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    return-void
.end method

.method public constructor <init>([BLorg/bouncycastle/crypto/CryptoServicePurpose;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;-><init>([B)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "digest encoded for a different purpose"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private KeccakAbsorb([BI)V
    .locals 7

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    ushr-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    aget-wide v3, v2, v1

    invoke-static {p1, p2}, Lorg/bouncycastle/util/Pack;->littleEndianToLong([BI)J

    move-result-wide v5

    xor-long/2addr v3, v5

    aput-wide v3, v2, v1

    add-int/lit8 p2, p2, 0x8

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->KeccakPermutation()V

    return-void
.end method

.method private KeccakExtract()V
    .locals 4

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->KeccakPermutation()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    iget v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    ushr-int/lit8 v1, v1, 0x6

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v3}, Lorg/bouncycastle/util/Pack;->longToLittleEndian([JII[BI)V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    return-void
.end method

.method private KeccakPermutation()V
    .locals 93

    move-object/from16 v0, p0

    .line 0
    iget-object v1, v0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

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

    aget-wide v36, v1, v36

    const/16 v38, 0xe

    aget-wide v39, v1, v38

    const/16 v41, 0xf

    aget-wide v42, v1, v41

    const/16 v44, 0x10

    aget-wide v44, v1, v44

    const/16 v46, 0x11

    aget-wide v46, v1, v46

    const/16 v48, 0x12

    aget-wide v49, v1, v48

    const/16 v51, 0x13

    aget-wide v52, v1, v51

    const/16 v54, 0x14

    aget-wide v55, v1, v54

    const/16 v57, 0x15

    aget-wide v58, v1, v57

    const/16 v60, 0x16

    aget-wide v60, v1, v60

    const/16 v62, 0x17

    aget-wide v63, v1, v62

    const/16 v65, 0x0

    const/16 v66, 0x18

    aget-wide v67, v1, v66

    const/16 v69, 0x0

    const/16 v70, 0x1

    const/16 v12, 0x18

    const/4 v15, 0x0

    :goto_0
    if-ge v15, v12, :cond_0

    xor-long v71, v2, v13

    xor-long v71, v71, v28

    xor-long v71, v71, v42

    xor-long v71, v71, v55

    xor-long v73, v4, v16

    xor-long v73, v73, v31

    xor-long v73, v73, v44

    xor-long v73, v73, v58

    xor-long v75, v6, v19

    xor-long v75, v75, v34

    xor-long v75, v75, v46

    xor-long v75, v75, v60

    xor-long v77, v8, v22

    xor-long v77, v77, v36

    xor-long v77, v77, v49

    xor-long v77, v77, v63

    xor-long v79, v10, v25

    xor-long v79, v79, v39

    xor-long v79, v79, v52

    xor-long v79, v79, v67

    shl-long v81, v73, v70

    const/4 v12, -0x1

    ushr-long v83, v73, v12

    or-long v81, v81, v83

    xor-long v81, v81, v79

    shl-long v83, v75, v70

    ushr-long v85, v75, v12

    or-long v83, v83, v85

    xor-long v83, v83, v71

    shl-long v85, v77, v70

    ushr-long v87, v77, v12

    or-long v85, v85, v87

    xor-long v73, v85, v73

    shl-long v85, v79, v70

    ushr-long v79, v79, v12

    or-long v79, v85, v79

    xor-long v75, v79, v75

    shl-long v79, v71, v70

    ushr-long v71, v71, v12

    or-long v71, v79, v71

    xor-long v71, v71, v77

    xor-long v2, v2, v81

    xor-long v12, v13, v81

    xor-long v28, v28, v81

    xor-long v42, v42, v81

    xor-long v55, v55, v81

    xor-long v4, v4, v83

    xor-long v16, v16, v83

    xor-long v31, v31, v83

    xor-long v44, v44, v83

    xor-long v58, v58, v83

    xor-long v6, v6, v73

    xor-long v19, v19, v73

    xor-long v34, v34, v73

    xor-long v46, v46, v73

    xor-long v60, v60, v73

    xor-long v8, v8, v75

    xor-long v22, v22, v75

    xor-long v36, v36, v75

    xor-long v49, v49, v75

    xor-long v63, v63, v75

    xor-long v10, v10, v71

    xor-long v25, v25, v71

    xor-long v39, v39, v71

    xor-long v52, v52, v71

    xor-long v67, v67, v71

    shl-long v71, v4, v70

    const/16 v14, 0x3f

    ushr-long/2addr v4, v14

    or-long v4, v71, v4

    const/16 v14, 0x2c

    shl-long v71, v16, v14

    ushr-long v16, v16, v54

    move/from16 v73, v15

    or-long v14, v71, v16

    shl-long v16, v25, v54

    const/16 v71, 0x2c

    ushr-long v25, v25, v71

    const/16 v71, 0x3

    move-object/from16 v72, v1

    or-long v0, v16, v25

    const/16 v16, 0x3d

    shl-long v16, v60, v16

    ushr-long v25, v60, v71

    move-wide/from16 v60, v4

    or-long v4, v16, v25

    const/16 v16, 0x27

    shl-long v16, v39, v16

    const/16 v25, 0x19

    ushr-long v25, v39, v25

    move-wide/from16 v39, v4

    or-long v4, v16, v25

    shl-long v16, v55, v48

    const/16 v25, 0x2e

    ushr-long v25, v55, v25

    move-wide/from16 v55, v4

    or-long v4, v16, v25

    const/16 v16, 0x3e

    shl-long v16, v6, v16

    const/16 v25, 0x2

    ushr-long v6, v6, v25

    or-long v6, v16, v6

    const/16 v16, 0x2b

    shl-long v16, v34, v16

    ushr-long v25, v34, v57

    move-wide/from16 v34, v6

    or-long v6, v16, v25

    const/16 v16, 0x19

    shl-long v16, v36, v16

    const/16 v25, 0x27

    ushr-long v25, v36, v25

    move-wide/from16 v36, v4

    or-long v4, v16, v25

    shl-long v16, v52, v21

    const/16 v25, 0x38

    ushr-long v52, v52, v25

    move-wide/from16 v75, v4

    or-long v4, v16, v52

    shl-long v16, v63, v25

    ushr-long v25, v63, v21

    move-wide/from16 v52, v4

    or-long v4, v16, v25

    const/16 v16, 0x29

    shl-long v16, v42, v16

    ushr-long v25, v42, v62

    move-wide/from16 v42, v4

    or-long v4, v16, v25

    const/16 v16, 0x1b

    shl-long v16, v10, v16

    const/16 v25, 0x25

    ushr-long v10, v10, v25

    or-long v10, v16, v10

    shl-long v16, v67, v38

    const/16 v25, 0x32

    ushr-long v25, v67, v25

    move-wide/from16 v63, v4

    or-long v4, v16, v25

    const/16 v16, 0x2

    shl-long v16, v58, v16

    const/16 v25, 0x3e

    ushr-long v25, v58, v25

    move-wide/from16 v58, v10

    or-long v10, v16, v25

    const/16 v16, 0x37

    shl-long v16, v22, v16

    ushr-long v22, v22, v24

    move-wide/from16 v25, v10

    or-long v10, v16, v22

    const/16 v16, 0x2d

    shl-long v16, v44, v16

    ushr-long v22, v44, v51

    move-wide/from16 v44, v10

    or-long v10, v16, v22

    const/16 v16, 0x24

    shl-long v16, v12, v16

    const/16 v22, 0x1c

    ushr-long v12, v12, v22

    or-long v12, v16, v12

    shl-long v16, v8, v22

    const/16 v22, 0x24

    ushr-long v8, v8, v22

    or-long v8, v16, v8

    shl-long v16, v49, v57

    const/16 v22, 0x2b

    ushr-long v22, v49, v22

    move-wide/from16 v49, v12

    or-long v12, v16, v22

    shl-long v16, v46, v41

    const/16 v22, 0x31

    ushr-long v22, v46, v22

    move-wide/from16 v46, v10

    or-long v10, v16, v22

    shl-long v16, v31, v27

    const/16 v22, 0x36

    ushr-long v22, v31, v22

    move-wide/from16 v31, v10

    or-long v10, v16, v22

    const/16 v16, 0x6

    shl-long v22, v19, v16

    const/16 v16, 0x3a

    ushr-long v16, v19, v16

    move-wide/from16 v19, v10

    or-long v10, v22, v16

    shl-long v16, v28, v71

    const/16 v22, 0x3d

    ushr-long v22, v28, v22

    move-wide/from16 v28, v10

    or-long v10, v16, v22

    move-wide/from16 v16, v8

    not-long v8, v14

    and-long/2addr v8, v6

    xor-long/2addr v8, v2

    move-wide/from16 v22, v8

    not-long v8, v6

    and-long/2addr v8, v12

    xor-long/2addr v8, v14

    move-wide/from16 v67, v8

    not-long v8, v12

    and-long/2addr v8, v4

    xor-long/2addr v6, v8

    not-long v8, v4

    and-long/2addr v8, v2

    xor-long/2addr v8, v12

    not-long v2, v2

    and-long/2addr v2, v14

    xor-long/2addr v2, v4

    not-long v4, v0

    and-long/2addr v4, v10

    xor-long v13, v16, v4

    not-long v4, v10

    and-long v4, v4, v46

    xor-long/2addr v4, v0

    move-wide/from16 v77, v2

    move-wide/from16 v2, v46

    move-wide/from16 v46, v4

    not-long v4, v2

    and-long v4, v4, v39

    xor-long/2addr v4, v10

    move-wide/from16 v10, v39

    move-wide/from16 v39, v4

    not-long v4, v10

    and-long v4, v4, v16

    xor-long/2addr v2, v4

    move-wide/from16 v4, v16

    not-long v4, v4

    and-long/2addr v0, v4

    xor-long/2addr v0, v10

    move-wide/from16 v4, v28

    not-long v10, v4

    and-long v10, v10, v75

    xor-long v28, v60, v10

    move-wide v15, v0

    move-wide/from16 v10, v75

    not-long v0, v10

    and-long v0, v0, v52

    xor-long/2addr v0, v4

    move-wide/from16 v74, v0

    move-wide/from16 v0, v52

    move-wide/from16 v52, v2

    not-long v2, v0

    and-long v2, v2, v36

    xor-long/2addr v2, v10

    move-wide/from16 v10, v36

    move-wide/from16 v36, v2

    not-long v2, v10

    and-long v2, v2, v60

    xor-long/2addr v0, v2

    move-wide/from16 v2, v60

    not-long v2, v2

    and-long/2addr v2, v4

    xor-long/2addr v2, v10

    move-wide/from16 v4, v49

    not-long v10, v4

    and-long v10, v10, v19

    xor-long v10, v58, v10

    move-wide/from16 v49, v0

    move-wide/from16 v0, v19

    move-wide/from16 v19, v2

    not-long v2, v0

    and-long v2, v2, v31

    xor-long/2addr v2, v4

    move-wide/from16 v60, v2

    move-wide/from16 v2, v31

    move-wide/from16 v31, v6

    not-long v6, v2

    and-long v6, v6, v42

    xor-long/2addr v0, v6

    move-wide/from16 v6, v42

    move-wide/from16 v42, v0

    not-long v0, v6

    and-long v0, v0, v58

    xor-long/2addr v0, v2

    move-wide/from16 v2, v58

    not-long v2, v2

    and-long/2addr v2, v4

    xor-long/2addr v2, v6

    move-wide/from16 v4, v44

    not-long v6, v4

    and-long v6, v6, v55

    xor-long v6, v34, v6

    move-wide/from16 v44, v0

    move-wide/from16 v0, v55

    move-wide/from16 v55, v2

    not-long v2, v0

    and-long v2, v2, v63

    xor-long v58, v2, v4

    move-wide/from16 v2, v63

    move-wide/from16 v63, v6

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

    sget-object v4, Lorg/bouncycastle/crypto/digests/KeccakDigest;->KeccakRoundConstants:[J

    aget-wide v5, v4, v73

    xor-long v4, v22, v5

    add-int/lit8 v6, v73, 0x1

    const/16 v12, 0x18

    move-wide/from16 v34, v36

    move-wide/from16 v36, v49

    move-wide/from16 v22, v52

    move-wide/from16 v52, v55

    move-wide/from16 v55, v63

    move-wide/from16 v63, v0

    move-wide/from16 v49, v44

    move-wide/from16 v44, v60

    move-object/from16 v1, v72

    move-object/from16 v0, p0

    move-wide/from16 v60, v25

    move-wide/from16 v25, v15

    move-wide/from16 v16, v46

    move v15, v6

    move-wide/from16 v6, v31

    move-wide/from16 v46, v42

    move-wide/from16 v31, v74

    move-wide/from16 v42, v10

    move-wide/from16 v10, v77

    move-wide/from16 v89, v4

    move-wide/from16 v4, v67

    move-wide/from16 v67, v2

    move-wide/from16 v2, v89

    move-wide/from16 v91, v19

    move-wide/from16 v19, v39

    move-wide/from16 v39, v91

    goto/16 :goto_0

    :cond_0
    move-object/from16 v72, v1

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v12, 0x2

    const/16 v15, 0x18

    aput-wide v2, v72, v65

    aput-wide v4, v72, v70

    aput-wide v6, v72, v12

    aput-wide v8, v72, v0

    aput-wide v10, v72, v1

    const/4 v0, 0x5

    aput-wide v13, v72, v0

    const/4 v0, 0x6

    aput-wide v16, v72, v0

    aput-wide v19, v72, v18

    aput-wide v22, v72, v21

    aput-wide v25, v72, v24

    aput-wide v28, v72, v27

    aput-wide v31, v72, v30

    aput-wide v34, v72, v33

    const/16 v0, 0xd

    aput-wide v36, v72, v0

    aput-wide v39, v72, v38

    aput-wide v42, v72, v41

    const/16 v0, 0x10

    aput-wide v44, v72, v0

    const/16 v0, 0x11

    aput-wide v46, v72, v0

    aput-wide v49, v72, v48

    aput-wide v52, v72, v51

    aput-wide v55, v72, v54

    aput-wide v58, v72, v57

    const/16 v0, 0x16

    aput-wide v60, v72, v0

    aput-wide v63, v72, v62

    aput-wide v67, v72, v15

    return-void
.end method

.method public static getCryptoServicePurpose(B)Lorg/bouncycastle/crypto/CryptoServicePurpose;
    .locals 1

    .line 0
    invoke-static {}, Lorg/bouncycastle/crypto/CryptoServicePurpose;->values()[Lorg/bouncycastle/crypto/CryptoServicePurpose;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0
.end method

.method private init(I)V
    .locals 1

    const/16 v0, 0x80

    if-eq p1, v0, :cond_1

    const/16 v0, 0xe0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x100

    if-eq p1, v0, :cond_1

    const/16 v0, 0x120

    if-eq p1, v0, :cond_1

    const/16 v0, 0x180

    if-eq p1, v0, :cond_1

    const/16 v0, 0x200

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bitLength must be one of 128, 224, 256, 288, 384, or 512."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    shl-int/lit8 p1, p1, 0x1

    rsub-int p1, p1, 0x640

    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->initSponge(I)V

    return-void
.end method

.method private initSponge(I)V
    .locals 6

    if-lez p1, :cond_1

    const/16 v0, 0x640

    if-ge p1, v0, :cond_1

    .line 0
    rem-int/lit8 v1, p1, 0x40

    if-nez v1, :cond_1

    iput p1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    array-length v4, v3

    if-ge v2, v4, :cond_0

    const-wide/16 v4, 0x0

    aput-wide v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    invoke-static {v2, v1}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    iput v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    iput-boolean v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    sub-int/2addr v0, p1

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "invalid rate value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private padAndSwitchToSqueezingPhase()V
    .locals 11

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    iget v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    ushr-int/lit8 v2, v1, 0x3

    aget-byte v3, v0, v2

    and-int/lit8 v4, v1, 0x7

    const/4 v5, 0x1

    shl-int v4, v5, v4

    int-to-byte v4, v4

    or-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/2addr v1, v5

    iput v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    iget v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    invoke-direct {p0, v0, v3}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->KeccakAbsorb([BI)V

    goto :goto_1

    :cond_0
    ushr-int/lit8 v0, v1, 0x6

    and-int/lit8 v1, v1, 0x3f

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v6, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    aget-wide v7, v6, v2

    iget-object v9, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    invoke-static {v9, v4}, Lorg/bouncycastle/util/Pack;->littleEndianToLong([BI)J

    move-result-wide v9

    xor-long/2addr v7, v9

    aput-wide v7, v6, v2

    add-int/lit8 v4, v4, 0x8

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-lez v1, :cond_2

    const-wide/16 v6, 0x1

    shl-long v1, v6, v1

    sub-long/2addr v1, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    aget-wide v7, v6, v0

    iget-object v9, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    invoke-static {v9, v4}, Lorg/bouncycastle/util/Pack;->littleEndianToLong([BI)J

    move-result-wide v9

    and-long/2addr v1, v9

    xor-long/2addr v1, v7

    aput-wide v1, v6, v0

    :cond_2
    :goto_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    iget v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    sub-int/2addr v1, v5

    ushr-int/lit8 v1, v1, 0x6

    aget-wide v6, v0, v1

    const-wide/high16 v8, -0x8000000000000000L

    xor-long/2addr v6, v8

    aput-wide v6, v0, v1

    iput v3, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    iput-boolean v5, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    return-void
.end method


# virtual methods
.method public absorb(B)V
    .locals 3

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    rem-int/lit8 v1, v0, 0x8

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    ushr-int/lit8 v2, v0, 0x3

    aput-byte p1, v1, v2

    add-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    iget p1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    invoke-direct {p0, v1, p1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->KeccakAbsorb([BI)V

    iput p1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "attempt to absorb while squeezing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "attempt to absorb with odd length queue"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public absorb([BII)V
    .locals 5

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    rem-int/lit8 v1, v0, 0x8

    if-nez v1, :cond_4

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    if-nez v1, :cond_3

    ushr-int/lit8 v0, v0, 0x3

    iget v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    ushr-int/lit8 v1, v1, 0x3

    sub-int v2, v1, v0

    if-ge p3, v2, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    invoke-static {p1, p2, v1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    shl-int/lit8 p2, p3, 0x3

    add-int/2addr p1, p2

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    if-lez v0, :cond_1

    iget-object v4, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    invoke-static {p1, p2, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    invoke-direct {p0, v0, v3}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->KeccakAbsorb([BI)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    sub-int v0, p3, v2

    if-lt v0, v1, :cond_2

    add-int v0, p2, v2

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->KeccakAbsorb([BI)V

    add-int/2addr v2, v1

    goto :goto_0

    :cond_2
    add-int/2addr p2, v2

    iget-object p3, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    invoke-static {p1, p2, p3, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    shl-int/lit8 p1, v0, 0x3

    :goto_1
    iput p1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "attempt to absorb while squeezing"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "attempt to absorb with odd length queue"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public absorbBits(II)V
    .locals 4

    const/4 v0, 0x1

    if-lt p2, v0, :cond_2

    const/4 v1, 0x7

    if-gt p2, v1, :cond_2

    .line 0
    iget v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    rem-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_1

    iget-boolean v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    if-nez v2, :cond_0

    shl-int v2, v0, p2

    sub-int/2addr v2, v0

    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    ushr-int/lit8 v3, v1, 0x3

    and-int/2addr p1, v2

    int-to-byte p1, p1

    aput-byte p1, v0, v3

    add-int/2addr v1, p2

    iput v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "attempt to absorb while squeezing"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "attempt to absorb with odd length queue"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'bits\' must be in the range 1 to 7"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public copyIn(Lorg/bouncycastle/crypto/digests/KeccakDigest;)V
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    iget-object v1, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    if-ne v0, v1, :cond_0

    iget-object v0, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    array-length v2, v0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    iget-boolean p1, p1, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->cryptoServiceProperties()Lorg/bouncycastle/crypto/CryptoServiceProperties;

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->checkConstraints(Lorg/bouncycastle/crypto/CryptoServiceProperties;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "attempt to copy digest of different purpose"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public cryptoServiceProperties()Lorg/bouncycastle/crypto/CryptoServiceProperties;
    .locals 2

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->getDigestSize()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    invoke-static {p0, v0, v1}, Lorg/bouncycastle/crypto/digests/Utils;->getDefaultProperties(Lorg/bouncycastle/crypto/Digest;ILorg/bouncycastle/crypto/CryptoServicePurpose;)Lorg/bouncycastle/crypto/CryptoServiceProperties;

    move-result-object v0

    return-object v0
.end method

.method public doFinal([BI)I
    .locals 2

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    int-to-long v0, v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeeze([BIJ)V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->reset()V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->getDigestSize()I

    move-result p1

    return p1
.end method

.method public doFinal([BIBI)I
    .locals 0

    if-lez p4, :cond_0

    .line 0
    invoke-virtual {p0, p3, p4}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->absorbBits(II)V

    :cond_0
    iget p3, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    int-to-long p3, p3

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeeze([BIJ)V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->reset()V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->getDigestSize()I

    move-result p1

    return p1
.end method

.method public getAlgorithmName()Ljava/lang/String;
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Keccak-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getByteLength()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    div-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public getDigestSize()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    div-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public getEncodedState([B)[B
    .locals 6

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, p1, v1

    const/4 v0, 0x1

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->state:[J

    array-length v4, v3

    if-eq v2, v4, :cond_0

    aget-wide v4, v3, v2

    invoke-static {v4, v5, p1, v0}, Lorg/bouncycastle/util/Pack;->longToBigEndian(J[BI)V

    add-int/lit8 v0, v0, 0x8

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    array-length v3, v2

    invoke-static {v2, v1, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    invoke-static {v1, p1, v0}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I[BI)V

    add-int/lit8 v1, v0, 0x4

    iget v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    invoke-static {v2, p1, v1}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I[BI)V

    add-int/lit8 v1, v0, 0x8

    iget v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    invoke-static {v2, p1, v1}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I[BI)V

    add-int/lit8 v0, v0, 0xc

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    aput-byte v1, p1, v0

    return-object p1
.end method

.method public reset()V
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->fixedOutputLength:I

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->init(I)V

    return-void
.end method

.method public squeeze([BIJ)V
    .locals 9

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->squeezing:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->padAndSwitchToSqueezingPhase()V

    :cond_0
    const-wide/16 v0, 0x8

    rem-long v2, p3, v0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_3

    :goto_0
    cmp-long v2, v4, p3

    if-gez v2, :cond_2

    iget v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    if-nez v2, :cond_1

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->KeccakExtract()V

    :cond_1
    iget v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    int-to-long v2, v2

    sub-long v6, p3, v4

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->dataQueue:[B

    iget v6, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->rate:I

    iget v7, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    sub-int/2addr v6, v7

    div-int/lit8 v6, v6, 0x8

    div-long v7, v4, v0

    long-to-int v8, v7

    add-int/2addr v8, p2

    div-int/lit8 v7, v3, 0x8

    invoke-static {v2, v6, p1, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    sub-int/2addr v2, v3

    iput v2, p0, Lorg/bouncycastle/crypto/digests/KeccakDigest;->bitsInQueue:I

    int-to-long v2, v3

    add-long/2addr v4, v2

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "outputLength not a multiple of 8"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public update(B)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->absorb(B)V

    return-void
.end method

.method public update([BII)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->absorb([BII)V

    return-void
.end method
