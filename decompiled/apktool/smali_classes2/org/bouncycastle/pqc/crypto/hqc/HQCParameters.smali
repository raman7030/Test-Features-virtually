.class public Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/pqc/crypto/KEMParameters;


# static fields
.field public static final GF_MUL_ORDER:I = 0xff

.field public static final PARAM_M:I = 0x8

.field public static final hqc128:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

.field public static final hqc192:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

.field public static final hqc256:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;


# instance fields
.field public final hqcEngine:Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;

.field public final n:I

.field public final n1:I

.field public final n2:I

.field public final name:Ljava/lang/String;

.field public final publicKeyBytes:I

.field public final secretKeyBytes:I


# direct methods
.method public static constructor <clinit>()V
    .locals 31

    .line 0
    new-instance v15, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    const/16 v0, 0x1f

    new-array v14, v0, [I

    fill-array-data v14, :array_0

    const-string v1, "hqc-128"

    const/16 v2, 0x4505

    const/16 v3, 0x2e

    const/16 v4, 0x180

    const/16 v5, 0x10

    const/16 v6, 0x1f

    const/16 v7, 0xf

    const/16 v8, 0x42

    const/16 v9, 0x4b

    const/4 v10, 0x4

    const v11, 0x3b587

    const/16 v12, 0x8c1

    const/16 v13, 0x911

    move-object v0, v15

    invoke-direct/range {v0 .. v14}, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;-><init>(Ljava/lang/String;IIIIIIIIIIII[I)V

    sput-object v15, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqc128:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    new-instance v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    const/16 v1, 0x21

    new-array v1, v1, [I

    fill-array-data v1, :array_1

    const-string v17, "hqc-192"

    const v18, 0x8c0b

    const/16 v19, 0x38

    const/16 v20, 0x280

    const/16 v21, 0x18

    const/16 v22, 0x21

    const/16 v23, 0x10

    const/16 v24, 0x64

    const/16 v25, 0x72

    const/16 v26, 0x5

    const v27, 0x1d3f8

    const/16 v28, 0x11a2

    const/16 v29, 0x11fa

    move-object/from16 v16, v0

    move-object/from16 v30, v1

    invoke-direct/range {v16 .. v30}, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;-><init>(Ljava/lang/String;IIIIIIIIIIII[I)V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqc192:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    new-instance v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    const/16 v1, 0x3b

    new-array v1, v1, [I

    fill-array-data v1, :array_2

    const-string v3, "hqc-256"

    const v4, 0xe125

    const/16 v5, 0x5a

    const/16 v6, 0x280

    const/16 v7, 0x20

    const/16 v8, 0x3b

    const/16 v9, 0x1d

    const/16 v10, 0x83

    const/16 v11, 0x95

    const/4 v12, 0x5

    const v13, 0x12315

    const/16 v14, 0x1c45

    const/16 v15, 0x1ca5

    move-object v2, v0

    move-object/from16 v16, v1

    invoke-direct/range {v2 .. v16}, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;-><init>(Ljava/lang/String;IIIIIIIIIIII[I)V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqc256:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    return-void

    :array_0
    .array-data 4
        0x59
        0x45
        0x99
        0x74
        0xb0
        0x75
        0x6f
        0x4b
        0x49
        0xe9
        0xf2
        0xe9
        0x41
        0xd2
        0x15
        0x8b
        0x67
        0xad
        0x43
        0x76
        0x69
        0xd2
        0xae
        0x6e
        0x4a
        0x45
        0xe4
        0x52
        0xff
        0xb5
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x2d
        0xd8
        0xef
        0x18
        0xfd
        0x68
        0x1b
        0x28
        0x6b
        0x32
        0xa3
        0xd2
        0xe3
        0x86
        0xe0
        0x9e
        0x77
        0xd
        0x9e
        0x1
        0xee
        0xa4
        0x52
        0x2b
        0xf
        0xe8
        0xf6
        0x8e
        0x32
        0xbd
        0x1d
        0xe8
        0x1
    .end array-data

    :array_2
    .array-data 4
        0x31
        0xa7
        0x31
        0x27
        0xc8
        0x79
        0x7c
        0x5b
        0xf0
        0x3f
        0x94
        0x47
        0x96
        0x7b
        0x57
        0x65
        0x20
        0xd7
        0x9f
        0x47
        0xc9
        0x73
        0x61
        0xd2
        0xba
        0xb7
        0x8d
        0xd9
        0x7b
        0xc
        0x1f
        0xf3
        0xb4
        0xdb
        0x98
        0xef
        0x63
        0x8d
        0x4
        0xf6
        0xbf
        0x90
        0x8
        0xe8
        0x2f
        0x1b
        0x8d
        0xb2
        0x82
        0x40
        0x7c
        0x2f
        0x27
        0xbc
        0xd8
        0x30
        0xc7
        0xbb
        0x1
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;IIIIIIIIIIII[I)V
    .locals 15

    move-object v0, p0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p1

    iput-object v1, v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->name:Ljava/lang/String;

    move/from16 v2, p2

    iput v2, v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->n:I

    move/from16 v3, p3

    iput v3, v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->n1:I

    move/from16 v4, p4

    iput v4, v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->n2:I

    move/from16 v12, p12

    iput v12, v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->publicKeyBytes:I

    move/from16 v1, p13

    iput v1, v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->secretKeyBytes:I

    new-instance v14, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;

    move-object v1, v14

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v13, p14

    invoke-direct/range {v1 .. v13}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;-><init>(IIIIIIIIIII[I)V

    iput-object v14, v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqcEngine:Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;

    return-void
.end method


# virtual methods
.method public getEngine()Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqcEngine:Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;

    return-object v0
.end method

.method public getN1N2_BYTES()I
    .locals 2

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->n1:I

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->n2:I

    mul-int v0, v0, v1

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public getN_BYTES()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->n:I

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPublicKeyBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->publicKeyBytes:I

    return v0
.end method

.method public getSALT_SIZE_BYTES()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public getSHA512_BYTES()I
    .locals 1

    const/16 v0, 0x40

    return v0
.end method

.method public getSecretKeyBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->secretKeyBytes:I

    return v0
.end method

.method public getSessionKeySize()I
    .locals 1

    const/16 v0, 0x100

    return v0
.end method
