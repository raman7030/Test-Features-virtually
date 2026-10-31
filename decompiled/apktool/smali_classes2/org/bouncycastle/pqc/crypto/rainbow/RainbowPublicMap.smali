.class public Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;
.super Ljava/lang/Object;


# instance fields
.field public cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

.field public final num_gf_elements:I

.field public params:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->num_gf_elements:I

    new-instance v0, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->params:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    return-void
.end method

.method private add_and_reduce([[S)[S
    .locals 9

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->params:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->getM()I

    move-result v0

    new-array v1, v0, [S

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_2

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    int-to-double v5, v2

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    double-to-int v3, v3

    new-array v4, v0, [S

    move v5, v3

    :goto_1
    const/16 v6, 0x100

    if-ge v5, v6, :cond_1

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v3, :cond_0

    iget-object v7, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    add-int v8, v5, v6

    aget-object v8, p1, v8

    invoke-virtual {v7, v4, v8}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addVect([S[S)[S

    move-result-object v4

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_0
    mul-int/lit8 v6, v3, 0x2

    add-int/2addr v5, v6

    goto :goto_1

    :cond_1
    iget-object v5, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    int-to-short v3, v3

    invoke-virtual {v5, v3, v4}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->multVect(S[S)[S

    move-result-object v3

    invoke-virtual {v5, v1, v3}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addVect([S[S)[S

    move-result-object v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private compute_accumulator([S[S[[[SI)[[S
    .locals 7

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x1

    aput p4, v0, v1

    const/4 v1, 0x0

    const/16 v2, 0x100

    aput v2, v0, v1

    .line 0
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {v2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[S

    array-length v2, p2

    aget-object v3, p3, v1

    array-length v4, v3

    if-ne v2, v4, :cond_4

    array-length v2, p1

    aget-object v1, v3, v1

    array-length v1, v1

    if-ne v2, v1, :cond_4

    array-length v1, p3

    if-ne v1, p4, :cond_4

    const/4 p4, 0x0

    :goto_0
    array-length v1, p2

    if-ge p4, v1, :cond_3

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    aget-short v2, p2, p4

    invoke-virtual {v1, v2, p1}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->multVect(S[S)[S

    move-result-object v1

    const/4 v2, 0x0

    :goto_1
    array-length v3, p1

    if-ge v2, v3, :cond_2

    const/4 v3, 0x0

    :goto_2
    array-length v4, p3

    if-ge v3, v4, :cond_1

    aget-short v4, v1, v2

    if-eqz v4, :cond_0

    aget-object v4, v0, v4

    aget-short v5, v4, v3

    aget-object v6, p3, v3

    aget-object v6, v6, p4

    aget-short v6, v6, v2

    invoke-static {v5, v6}, Lorg/bouncycastle/pqc/crypto/rainbow/GF2Field;->addElem(SS)S

    move-result v5

    aput-short v5, v4, v3

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Accumulator calculation not possible!"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public publicMap(Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicKeyParameters;[S)[S
    .locals 1

    .line 0
    iget-object p1, p1, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicKeyParameters;->pk:[[[S

    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->params:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->getM()I

    move-result v0

    invoke-direct {p0, p2, p2, p1, v0}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->add_and_reduce([[S)[S

    move-result-object p1

    return-object p1
.end method

.method public publicMap_cyclic(Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicKeyParameters;[S)[S
    .locals 13

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->params:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->getV1()I

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->params:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->getO1()I

    move-result v1

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->params:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->getO2()I

    move-result v2

    add-int v3, v1, v2

    const/4 v4, 0x2

    new-array v4, v4, [I

    const/4 v5, 0x1

    aput v3, v4, v5

    const/4 v3, 0x0

    const/16 v6, 0x100

    aput v6, v4, v3

    sget-object v6, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[S

    invoke-static {p2, v3, v0}, Lorg/bouncycastle/util/Arrays;->copyOfRange([SII)[S

    move-result-object v6

    add-int v7, v0, v1

    invoke-static {p2, v0, v7}, Lorg/bouncycastle/util/Arrays;->copyOfRange([SII)[S

    move-result-object v8

    array-length v9, p2

    invoke-static {p2, v7, v9}, Lorg/bouncycastle/util/Arrays;->copyOfRange([SII)[S

    move-result-object p2

    new-instance v7, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowDRBG;

    iget-object v9, p1, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicKeyParameters;->pk_seed:[B

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowKeyParameters;->getParameters()Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    move-result-object v10

    invoke-virtual {v10}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->getHash_algo()Lorg/bouncycastle/crypto/Digest;

    move-result-object v10

    invoke-direct {v7, v9, v10}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowDRBG;-><init>([BLorg/bouncycastle/crypto/Digest;)V

    invoke-static {v7, v1, v0, v0, v5}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowUtil;->generate_random(Ljava/security/SecureRandom;IIIZ)[[[S

    move-result-object v9

    invoke-direct {p0, v6, v6, v9, v1}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object v9

    invoke-static {v7, v1, v0, v1, v3}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowUtil;->generate_random(Ljava/security/SecureRandom;IIIZ)[[[S

    move-result-object v10

    iget-object v11, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    invoke-direct {p0, v8, v6, v10, v1}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object v10

    invoke-virtual {v11, v9, v10}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addMatrix([[S[[S)[[S

    move-result-object v9

    iget-object v10, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    iget-object v11, p1, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicKeyParameters;->l1_Q3:[[[S

    invoke-direct {p0, p2, v6, v11, v1}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object v11

    invoke-virtual {v10, v9, v11}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addMatrix([[S[[S)[[S

    move-result-object v9

    iget-object v10, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    iget-object v11, p1, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicKeyParameters;->l1_Q5:[[[S

    invoke-direct {p0, v8, v8, v11, v1}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object v11

    invoke-virtual {v10, v9, v11}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addMatrix([[S[[S)[[S

    move-result-object v9

    iget-object v10, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    iget-object v11, p1, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicKeyParameters;->l1_Q6:[[[S

    invoke-direct {p0, p2, v8, v11, v1}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object v11

    invoke-virtual {v10, v9, v11}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addMatrix([[S[[S)[[S

    move-result-object v9

    iget-object v10, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    iget-object v11, p1, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicKeyParameters;->l1_Q9:[[[S

    invoke-direct {p0, p2, p2, v11, v1}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object v11

    invoke-virtual {v10, v9, v11}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addMatrix([[S[[S)[[S

    move-result-object v9

    invoke-static {v7, v2, v0, v0, v5}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowUtil;->generate_random(Ljava/security/SecureRandom;IIIZ)[[[S

    move-result-object v10

    invoke-direct {p0, v6, v6, v10, v2}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object v10

    invoke-static {v7, v2, v0, v1, v3}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowUtil;->generate_random(Ljava/security/SecureRandom;IIIZ)[[[S

    move-result-object v11

    iget-object v12, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    invoke-direct {p0, v8, v6, v11, v2}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object v11

    invoke-virtual {v12, v10, v11}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addMatrix([[S[[S)[[S

    move-result-object v10

    invoke-static {v7, v2, v0, v2, v3}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowUtil;->generate_random(Ljava/security/SecureRandom;IIIZ)[[[S

    move-result-object v0

    iget-object v11, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    invoke-direct {p0, p2, v6, v0, v2}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object v0

    invoke-virtual {v11, v10, v0}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addMatrix([[S[[S)[[S

    move-result-object v0

    invoke-static {v7, v2, v1, v1, v5}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowUtil;->generate_random(Ljava/security/SecureRandom;IIIZ)[[[S

    move-result-object v5

    iget-object v6, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    invoke-direct {p0, v8, v8, v5, v2}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object v5

    invoke-virtual {v6, v0, v5}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addMatrix([[S[[S)[[S

    move-result-object v0

    invoke-static {v7, v2, v1, v2, v3}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowUtil;->generate_random(Ljava/security/SecureRandom;IIIZ)[[[S

    move-result-object v1

    iget-object v5, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    invoke-direct {p0, p2, v8, v1, v2}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addMatrix([[S[[S)[[S

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->cf:Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;

    iget-object p1, p1, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicKeyParameters;->l2_Q9:[[[S

    invoke-direct {p0, p2, p2, p1, v2}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->compute_accumulator([S[S[[[SI)[[S

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lorg/bouncycastle/pqc/crypto/rainbow/ComputeInField;->addMatrix([[S[[S)[[S

    move-result-object p1

    const/16 p2, 0x100

    :goto_0
    if-ge v3, p2, :cond_0

    aget-object v0, v9, v3

    aget-object v1, p1, v3

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Arrays;->concatenate([S[S)[S

    move-result-object v0

    aput-object v0, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, v4}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowPublicMap;->add_and_reduce([[S)[S

    move-result-object p1

    return-object p1
.end method
