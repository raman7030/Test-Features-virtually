.class public Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;
.super Ljava/lang/Object;


# instance fields
.field public final buffer:[B

.field public haraka256_rc:[[I

.field public haraka512_rc:[[J

.field public off:I


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v1, v0, [J

    fill-array-data v1, :array_0

    new-array v2, v0, [J

    fill-array-data v2, :array_1

    new-array v3, v0, [J

    fill-array-data v3, :array_2

    new-array v4, v0, [J

    fill-array-data v4, :array_3

    new-array v5, v0, [J

    fill-array-data v5, :array_4

    new-array v6, v0, [J

    fill-array-data v6, :array_5

    new-array v7, v0, [J

    fill-array-data v7, :array_6

    new-array v8, v0, [J

    fill-array-data v8, :array_7

    new-array v9, v0, [J

    fill-array-data v9, :array_8

    new-array v10, v0, [J

    fill-array-data v10, :array_9

    const/16 v11, 0xa

    new-array v12, v11, [[J

    const/4 v13, 0x0

    aput-object v1, v12, v13

    const/4 v1, 0x1

    aput-object v2, v12, v1

    const/4 v2, 0x2

    aput-object v3, v12, v2

    const/4 v3, 0x3

    aput-object v4, v12, v3

    const/4 v3, 0x4

    aput-object v5, v12, v3

    const/4 v3, 0x5

    aput-object v6, v12, v3

    const/4 v3, 0x6

    aput-object v7, v12, v3

    const/4 v3, 0x7

    aput-object v8, v12, v3

    aput-object v9, v12, v0

    const/16 v3, 0x9

    aput-object v10, v12, v3

    iput-object v12, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->haraka512_rc:[[J

    new-array v2, v2, [I

    aput v0, v2, v1

    aput v11, v2, v13

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->haraka256_rc:[[I

    const/16 v0, 0x40

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->buffer:[B

    iput v13, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->off:I

    return-void

    :array_0
    .array-data 8
        0x24cf0ab9086f628bL
        -0x4229111337c47c7eL    # -8.34308612284233E-11
        -0x26904fcf93252f59L    # -6.546156084996416E122
        -0x5531f7d53706a077L    # -1.676078432208414E-102
        0x449d8e8870d7041fL    # 3.489447431402143E22
        0x49bb2f80b2b3e2f8L    # 1.5520209701854548E47
        0x569ae98d93bb258L
        0x23dc9691e7d6a4b1L    # 6.145655770896743E-136
    .end array-data

    :array_1
    .array-data 8
        -0x2745ef121f01a492L    # -2.6292679825308743E119
        0x7ecf7dbe424c7b8eL    # 6.748615020939513E302
        0x6ea9949c6df62a31L    # 1.1835756175030821E225
        -0x40c0c3681363cec2L    # -4.766341122468715E-4
        0x241d03a196a1861eL    # 9.979581241169313E-135
        -0x152c5aeee91a5d16L    # -3.941889791574587E206
        0x77d479fcad9574e3L    # 1.6902545635337163E269
        0x18657a1af894b7a0L    # 3.765874600035735E-191
    .end array-data

    :array_2
    .array-data 8
        0x10671e1a7f595522L
        -0x265ff0098a2d7385L    # -5.309057635999325E123
        0x2f1edf0d2b9ba661L    # 1.0170353113546807E-81
        -0x4700a7471c21ba07L    # -3.773206257899628E-34
        -0x11d6d9e25679a3feL    # -4.545332269748838E222
        -0x2eacd55b4af420bdL    # -5.817861007223787E83
        -0x7407a7ea64dce44fL    # -5.312720711737885E-251
        -0x20e8bc62dd2b0a67L    # -1.1898834423148703E150
    .end array-data

    :array_3
    .array-data 8
        -0x22b4d0f78f46e740L    # -2.58974445888421E141
        0x757a81f3b39b1bb6L    # 7.960257583444253E257
        0x7a5c556898952e3fL    # 2.5715687751585318E281
        0x7dd70a16d915d87aL    # 1.5067704671106849E298
        0x3ae61971982b8301L    # 5.712558311230167E-25
        -0x3c54ce61fcfbed42L    # -9.7976052433665203E17
        0x17c0033ac094a8cbL    # 2.741921857949429E-194
        0x5a0630fc1a8dc4efL    # 4.694311121929546E125
    .end array-data

    :array_4
    .array-data 8
        0x17708988c1632f73L    # 8.849239197528661E-196
        -0x6d2251f6f4bb0b1L
        0x11ac0285c43aa314L
        0x509059941936b8baL    # 1.2116422007715244E80
        -0x2fc1ead05d316497L    # -3.483345412404803E78
        0x3fbcbcb63a32998bL    # 0.11225451393929668
        0x6204696d692254f7L    # 1.469296709179446E164
        -0x6eaabd126c13a64cL
    .end array-data

    :array_5
    .array-data 8
        -0xb126b557786dc92L
        -0x934be32c71fc40L    # -6.29885272061005E305
        0x69b38602368aeabL
        0x669495b820f0ddbaL    # 1.3994740532770079E186
        -0xbdfec4e474061c3L
        -0x306ca1019bc68cb3L    # -2.1904458731970534E75
        -0x43e230bd35d61c08L    # -4.0399558806768864E-19
        0x7e6d3ed29f78ad67L    # 9.792718521296269E300
    .end array-data

    :array_6
    .array-data 8
        -0xc4f097c80032256L    # -1.89765673535373E249
        0x3a76faef934ddf41L    # 4.6408180932303894E-27
        -0x313851a7c56371cbL    # -3.2688097657865015E71
        -0x1b22e73970fd9f51L    # -7.3692346579630015E177
        0x2c0e5df1ad398eaaL    # 1.777104005811316E-96
        0x478df5236ae22e8cL    # 4.977555370078104E36
        -0x46bb3b90179a0c7L
        -0x55b707d0fd7ecd46L
    .end array-data

    :array_7
    .array-data 8
        0x231b9ae2b76aca77L
        0x292a76a712db0b40L
        0x5850625dc8134491L    # 2.582288254505837E117
        0x73137dd469810fb5L    # 2.129424428140561E246
        -0x75ed595dfd5b8b03L    # -3.790738024500112E-260
        -0x2c90262558742480L    # -8.304847093147992E93
        -0x4cb3a18ccafa8f91L    # -1.3792217247815056E-61
        -0x450e32357e72626aL    # -9.204385702630212E-25
    .end array-data

    :array_8
    .array-data 8
        0x2e99781335e8c641L    # 3.2775841565382925E-84
        -0x42201a331b82a9f2L    # -1.1604300257025845E-10
        -0x8b1640cd1a1fbf4L    # -4.934894433373285E266
        0x1d7a709d65996be9L
        0x670df36a9cf66cddL    # 2.606371959909268E188
        -0x2fa107b5e895d78bL    # -1.4344268687412442E79
        0xf888e828cb1c44eL    # 7.723302057184993E-234
        0x1a79e9c9727b052cL
    .end array-data

    :array_9
    .array-data 8
        -0x7cb68cb79d727b22L    # -7.969801972455513E-293
        0x2e9387d51f22a754L    # 2.513371656647365E-84
        -0x4ffff9725d07ad2aL    # -1.7299971449456164E-77
        0x378c9e1190fd6fe5L    # 4.1064034819251023E-41
        -0x78ffd83ce9218d6dL    # -5.832698769165024E-275
        -0x1ae562bb9d1fb845L    # -1.0784819811384435E179
        -0x6f13080739daee6bL
        0x655953bfbed90a9cL    # 1.6421153225414198E180
    .end array-data
.end method

.method private Swapn([JIII)V
    .locals 10

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    return-void

    :cond_0
    const-wide v0, 0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236

    const-wide v2, -0xf0f0f0f0f0f0f10L    # -1.0773087426743214E236

    goto :goto_0

    :cond_1
    const-wide v0, 0x3333333333333333L    # 4.667261458395856E-62

    const-wide v2, -0x3333333333333334L    # -9.255963134931783E61

    goto :goto_0

    :cond_2
    const-wide v0, 0x5555555555555555L    # 1.1945305291614955E103

    const-wide v2, -0x5555555555555556L

    .line 0
    :goto_0
    aget-wide v4, p1, p3

    aget-wide v6, p1, p4

    and-long v8, v4, v0

    and-long/2addr v0, v6

    shl-long/2addr v0, p2

    or-long/2addr v0, v8

    aput-wide v0, p1, p3

    and-long v0, v4, v2

    ushr-long p2, v0, p2

    and-long v0, v6, v2

    or-long/2addr p2, v0

    aput-wide p2, p1, p4

    return-void
.end method

.method private Swapn32([IIII)V
    .locals 5

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const v0, 0xf0f0f0f

    const v1, -0xf0f0f10

    goto :goto_0

    :cond_1
    const v0, 0x33333333

    const v1, -0x33333334

    goto :goto_0

    :cond_2
    const v0, 0x55555555

    const v1, -0x55555556

    .line 0
    :goto_0
    aget v2, p1, p3

    aget v3, p1, p4

    and-int v4, v2, v0

    and-int/2addr v0, v3

    shl-int/2addr v0, p2

    or-int/2addr v0, v4

    aput v0, p1, p3

    and-int p3, v2, v1

    ushr-int p2, p3, p2

    and-int p3, v3, v1

    or-int/2addr p2, p3

    aput p2, p1, p4

    return-void
.end method

.method private addRoundKey([J[J)V
    .locals 5

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x1

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x2

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x3

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x4

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x5

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x6

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x7

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    return-void
.end method

.method private addRoundKey32([I[I)V
    .locals 3

    const/4 v0, 0x0

    .line 0
    aget v1, p1, v0

    aget v2, p2, v0

    xor-int/2addr v1, v2

    aput v1, p1, v0

    const/4 v0, 0x1

    aget v1, p1, v0

    aget v2, p2, v0

    xor-int/2addr v1, v2

    aput v1, p1, v0

    const/4 v0, 0x2

    aget v1, p1, v0

    aget v2, p2, v0

    xor-int/2addr v1, v2

    aput v1, p1, v0

    const/4 v0, 0x3

    aget v1, p1, v0

    aget v2, p2, v0

    xor-int/2addr v1, v2

    aput v1, p1, v0

    const/4 v0, 0x4

    aget v1, p1, v0

    aget v2, p2, v0

    xor-int/2addr v1, v2

    aput v1, p1, v0

    const/4 v0, 0x5

    aget v1, p1, v0

    aget v2, p2, v0

    xor-int/2addr v1, v2

    aput v1, p1, v0

    const/4 v0, 0x6

    aget v1, p1, v0

    aget v2, p2, v0

    xor-int/2addr v1, v2

    aput v1, p1, v0

    const/4 v0, 0x7

    aget v1, p1, v0

    aget p2, p2, v0

    xor-int/2addr p2, v1

    aput p2, p1, v0

    return-void
.end method

.method private brAesCt64BitsliceSbox([J)V
    .locals 63

    const/4 v0, 0x7

    .line 0
    aget-wide v0, p1, v0

    const/4 v2, 0x6

    aget-wide v2, p1, v2

    const/4 v4, 0x5

    aget-wide v4, p1, v4

    const/4 v6, 0x4

    aget-wide v7, p1, v6

    const/4 v9, 0x3

    aget-wide v10, p1, v9

    const/4 v12, 0x2

    aget-wide v13, p1, v12

    const/4 v15, 0x1

    aget-wide v16, p1, v15

    const/16 v18, 0x0

    aget-wide v19, p1, v18

    xor-long v21, v7, v13

    xor-long v23, v0, v16

    xor-long v25, v0, v7

    xor-long v27, v0, v13

    xor-long/2addr v4, v2

    xor-long v29, v4, v19

    xor-long v7, v29, v7

    xor-long v31, v23, v21

    xor-long v33, v29, v0

    xor-long v16, v29, v16

    xor-long v35, v16, v27

    xor-long v10, v10, v31

    xor-long/2addr v13, v10

    xor-long/2addr v2, v10

    xor-long v10, v13, v19

    xor-long v37, v13, v4

    xor-long v39, v2, v25

    xor-long v41, v19, v39

    xor-long v43, v37, v39

    xor-long v45, v37, v27

    xor-long v4, v4, v39

    xor-long v47, v23, v4

    xor-long/2addr v0, v4

    and-long v49, v31, v13

    and-long v51, v35, v10

    xor-long v51, v51, v49

    and-long v53, v7, v19

    xor-long v49, v53, v49

    and-long v53, v23, v4

    and-long v55, v16, v29

    xor-long v55, v55, v53

    and-long v57, v33, v41

    xor-long v53, v57, v53

    and-long v57, v25, v39

    and-long v59, v21, v43

    xor-long v59, v59, v57

    and-long v61, v27, v37

    xor-long v57, v61, v57

    xor-long v51, v51, v59

    xor-long v49, v49, v57

    xor-long v55, v55, v59

    xor-long v53, v53, v57

    xor-long v2, v51, v2

    xor-long v45, v49, v45

    xor-long v47, v55, v47

    xor-long v0, v53, v0

    xor-long v49, v2, v45

    and-long v2, v2, v47

    xor-long v51, v0, v2

    and-long v53, v49, v51

    xor-long v53, v53, v45

    xor-long v55, v47, v0

    xor-long v2, v45, v2

    and-long v2, v2, v55

    xor-long/2addr v2, v0

    xor-long v45, v47, v2

    xor-long v47, v51, v2

    and-long v0, v0, v47

    xor-long v45, v0, v45

    xor-long v0, v51, v0

    and-long v0, v53, v0

    xor-long v0, v49, v0

    xor-long v47, v0, v45

    xor-long v49, v53, v2

    xor-long v51, v53, v0

    xor-long v55, v2, v45

    xor-long v57, v49, v47

    and-long v13, v55, v13

    and-long v10, v45, v10

    and-long v19, v2, v19

    and-long v4, v51, v4

    and-long v29, v0, v29

    and-long v41, v53, v41

    and-long v39, v49, v39

    and-long v43, v57, v43

    and-long v37, v47, v37

    and-long v31, v55, v31

    and-long v35, v45, v35

    and-long/2addr v2, v7

    and-long v7, v51, v23

    and-long v0, v0, v16

    and-long v16, v53, v33

    and-long v23, v49, v25

    and-long v21, v57, v21

    and-long v25, v47, v27

    xor-long v23, v23, v21

    xor-long v2, v35, v2

    xor-long v0, v41, v0

    xor-long v27, v31, v35

    xor-long v31, v19, v7

    xor-long v19, v19, v41

    xor-long v33, v43, v37

    xor-long/2addr v13, v4

    xor-long v35, v39, v43

    xor-long v21, v21, v25

    xor-long/2addr v7, v0

    xor-long v25, v31, v13

    xor-long v31, v29, v23

    xor-long v4, v4, v35

    const/16 v35, 0x7

    move-wide/from16 v37, v13

    xor-long v12, v23, v25

    xor-long v16, v16, v25

    move-wide/from16 v23, v7

    xor-long v6, v33, v31

    xor-long v25, v27, v31

    xor-long v27, v29, v4

    xor-long v16, v16, v6

    xor-long v10, v10, v25

    xor-long v4, v4, v25

    not-long v6, v6

    xor-long v6, v6, v23

    not-long v12, v12

    xor-long/2addr v0, v12

    xor-long v12, v27, v16

    xor-long v14, v37, v10

    xor-long v10, v19, v10

    xor-long v2, v2, v16

    const/16 v16, 0x5

    const/16 v17, 0x6

    not-long v8, v14

    xor-long v8, v27, v8

    not-long v12, v12

    xor-long v12, v21, v12

    aput-wide v4, p1, v35

    aput-wide v8, p1, v17

    aput-wide v12, p1, v16

    const/4 v4, 0x4

    aput-wide v14, p1, v4

    const/4 v4, 0x3

    aput-wide v10, p1, v4

    const/4 v4, 0x2

    aput-wide v2, p1, v4

    const/4 v2, 0x1

    aput-wide v6, p1, v2

    aput-wide v0, p1, v18

    return-void
.end method

.method private brAesCt64InterleaveIn([JI[II)V
    .locals 10

    .line 0
    aget v0, p3, p4

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    add-int/lit8 v4, p4, 0x1

    aget v4, p3, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    add-int/lit8 v6, p4, 0x2

    aget v6, p3, v6

    int-to-long v6, v6

    and-long/2addr v6, v2

    add-int/lit8 p4, p4, 0x3

    aget p3, p3, p4

    int-to-long p3, p3

    and-long/2addr p3, v2

    const/16 v2, 0x10

    shl-long v8, v0, v2

    or-long/2addr v0, v8

    shl-long v8, v4, v2

    or-long v3, v4, v8

    shl-long v8, v6, v2

    or-long v5, v6, v8

    shl-long v7, p3, v2

    or-long/2addr p3, v7

    const-wide v7, 0xffff0000ffffL

    and-long/2addr v0, v7

    and-long v2, v3, v7

    and-long v4, v5, v7

    and-long/2addr p3, v7

    const/16 v6, 0x8

    shl-long v7, v0, v6

    or-long/2addr v0, v7

    shl-long v7, v2, v6

    or-long/2addr v2, v7

    shl-long v7, v4, v6

    or-long/2addr v4, v7

    shl-long v7, p3, v6

    or-long/2addr p3, v7

    const-wide v7, 0xff00ff00ff00ffL

    and-long/2addr v0, v7

    and-long/2addr v2, v7

    and-long/2addr v4, v7

    and-long/2addr p3, v7

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    aput-wide v0, p1, p2

    add-int/lit8 p2, p2, 0x4

    shl-long/2addr p3, v6

    or-long/2addr p3, v2

    aput-wide p3, p1, p2

    return-void
.end method

.method private brAesCt64InterleaveOut([I[JI)V
    .locals 10

    .line 0
    aget-wide v0, p2, p3

    const-wide v2, 0xff00ff00ff00ffL

    and-long v4, v0, v2

    add-int/lit8 v6, p3, 0x4

    aget-wide v6, p2, v6

    and-long v8, v6, v2

    const/16 p2, 0x8

    ushr-long/2addr v0, p2

    and-long/2addr v0, v2

    ushr-long/2addr v6, p2

    and-long/2addr v2, v6

    ushr-long v6, v4, p2

    or-long/2addr v4, v6

    ushr-long v6, v8, p2

    or-long/2addr v6, v8

    ushr-long v8, v0, p2

    or-long/2addr v0, v8

    ushr-long v8, v2, p2

    or-long/2addr v2, v8

    const-wide v8, 0xffff0000ffffL

    and-long/2addr v4, v8

    and-long/2addr v6, v8

    and-long/2addr v0, v8

    and-long/2addr v2, v8

    shl-int/lit8 p2, p3, 0x2

    const/16 p3, 0x10

    ushr-long v8, v4, p3

    or-long/2addr v4, v8

    long-to-int v5, v4

    aput v5, p1, p2

    add-int/lit8 v4, p2, 0x1

    ushr-long v8, v6, p3

    or-long v5, v6, v8

    long-to-int v6, v5

    aput v6, p1, v4

    add-int/lit8 v4, p2, 0x2

    ushr-long v5, v0, p3

    or-long/2addr v0, v5

    long-to-int v1, v0

    aput v1, p1, v4

    add-int/lit8 p2, p2, 0x3

    ushr-long v0, v2, p3

    or-long/2addr v0, v2

    long-to-int p3, v0

    aput p3, p1, p2

    return-void
.end method

.method private brAesCt64Ortho([J)V
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 0
    invoke-direct {p0, p1, v0, v1, v0}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {p0, p1, v0, v2, v3}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    const/4 v4, 0x4

    const/4 v5, 0x5

    invoke-direct {p0, p1, v0, v4, v5}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    const/4 v6, 0x6

    const/4 v7, 0x7

    invoke-direct {p0, p1, v0, v6, v7}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    invoke-direct {p0, p1, v2, v1, v2}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    invoke-direct {p0, p1, v2, v0, v3}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    invoke-direct {p0, p1, v2, v4, v6}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    invoke-direct {p0, p1, v2, v5, v7}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    invoke-direct {p0, p1, v4, v1, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    invoke-direct {p0, p1, v4, v0, v5}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    invoke-direct {p0, p1, v4, v2, v6}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    invoke-direct {p0, p1, v4, v3, v7}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn([JIII)V

    return-void
.end method

.method public static brAesCtBitsliceSbox([I)V
    .locals 35

    const/4 v0, 0x7

    .line 0
    aget v0, p0, v0

    const/4 v1, 0x6

    aget v1, p0, v1

    const/4 v2, 0x5

    aget v3, p0, v2

    const/4 v4, 0x4

    aget v5, p0, v4

    const/4 v6, 0x3

    aget v7, p0, v6

    const/4 v8, 0x2

    aget v9, p0, v8

    const/4 v10, 0x1

    aget v11, p0, v10

    const/4 v12, 0x0

    aget v13, p0, v12

    xor-int v14, v5, v9

    xor-int v15, v0, v11

    xor-int v16, v0, v5

    xor-int v17, v0, v9

    xor-int/2addr v3, v1

    xor-int v18, v3, v13

    xor-int v5, v18, v5

    xor-int v19, v15, v14

    xor-int v20, v18, v0

    xor-int v11, v18, v11

    xor-int v21, v11, v17

    xor-int v7, v7, v19

    xor-int/2addr v9, v7

    xor-int/2addr v1, v7

    xor-int v7, v9, v13

    xor-int v22, v9, v3

    xor-int v23, v1, v16

    xor-int v24, v13, v23

    xor-int v25, v22, v23

    xor-int v26, v22, v17

    xor-int v3, v3, v23

    xor-int v27, v15, v3

    xor-int/2addr v0, v3

    and-int v28, v19, v9

    and-int v29, v21, v7

    xor-int v29, v29, v28

    and-int v30, v5, v13

    xor-int v28, v30, v28

    and-int v30, v15, v3

    and-int v31, v11, v18

    xor-int v31, v31, v30

    and-int v32, v20, v24

    xor-int v30, v32, v30

    and-int v32, v16, v23

    and-int v33, v14, v25

    xor-int v33, v33, v32

    and-int v34, v17, v22

    xor-int v32, v34, v32

    xor-int v29, v29, v33

    xor-int v28, v28, v32

    xor-int v31, v31, v33

    xor-int v30, v30, v32

    xor-int v1, v29, v1

    xor-int v26, v28, v26

    xor-int v27, v31, v27

    xor-int v0, v30, v0

    xor-int v28, v1, v26

    and-int v1, v1, v27

    xor-int v29, v0, v1

    and-int v30, v28, v29

    xor-int v30, v30, v26

    xor-int v31, v27, v0

    xor-int v1, v26, v1

    and-int v1, v1, v31

    xor-int/2addr v1, v0

    xor-int v26, v27, v1

    xor-int v27, v29, v1

    and-int v0, v0, v27

    xor-int v26, v0, v26

    xor-int v0, v29, v0

    and-int v0, v30, v0

    xor-int v0, v28, v0

    xor-int v27, v0, v26

    xor-int v28, v30, v1

    xor-int v29, v30, v0

    xor-int v31, v1, v26

    xor-int v32, v28, v27

    and-int v9, v31, v9

    and-int v7, v26, v7

    and-int/2addr v13, v1

    and-int v3, v29, v3

    and-int v18, v0, v18

    and-int v24, v30, v24

    and-int v23, v28, v23

    and-int v25, v32, v25

    and-int v22, v27, v22

    and-int v19, v31, v19

    and-int v21, v26, v21

    and-int/2addr v1, v5

    and-int v5, v29, v15

    and-int/2addr v0, v11

    and-int v11, v30, v20

    and-int v15, v28, v16

    and-int v14, v32, v14

    and-int v16, v27, v17

    xor-int/2addr v15, v14

    xor-int v1, v21, v1

    xor-int v0, v24, v0

    xor-int v17, v19, v21

    xor-int v19, v13, v5

    xor-int v13, v13, v24

    xor-int v20, v25, v22

    xor-int/2addr v9, v3

    xor-int v21, v23, v25

    xor-int v14, v14, v16

    xor-int/2addr v5, v0

    xor-int v16, v19, v9

    xor-int v19, v18, v15

    xor-int v3, v3, v21

    const/16 v21, 0x7

    xor-int v15, v15, v16

    xor-int v11, v11, v16

    const/16 v16, 0x6

    xor-int v12, v20, v19

    xor-int v17, v17, v19

    xor-int v18, v18, v3

    xor-int/2addr v11, v12

    xor-int v7, v7, v17

    xor-int v3, v3, v17

    not-int v12, v12

    xor-int/2addr v5, v12

    not-int v12, v15

    xor-int/2addr v0, v12

    xor-int v12, v18, v11

    xor-int/2addr v9, v7

    xor-int/2addr v7, v13

    xor-int/2addr v1, v11

    not-int v11, v9

    xor-int v11, v18, v11

    not-int v12, v12

    xor-int/2addr v12, v14

    aput v3, p0, v21

    aput v11, p0, v16

    aput v12, p0, v2

    aput v9, p0, v4

    aput v7, p0, v6

    aput v1, p0, v8

    aput v5, p0, v10

    const/4 v1, 0x0

    aput v0, p0, v1

    return-void
.end method

.method private brAesCtOrtho([I)V
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 0
    invoke-direct {p0, p1, v0, v1, v0}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {p0, p1, v0, v2, v3}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    const/4 v4, 0x4

    const/4 v5, 0x5

    invoke-direct {p0, p1, v0, v4, v5}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    const/4 v6, 0x6

    const/4 v7, 0x7

    invoke-direct {p0, p1, v0, v6, v7}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    invoke-direct {p0, p1, v2, v1, v2}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    invoke-direct {p0, p1, v2, v0, v3}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    invoke-direct {p0, p1, v2, v4, v6}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    invoke-direct {p0, p1, v2, v5, v7}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    invoke-direct {p0, p1, v4, v1, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    invoke-direct {p0, p1, v4, v0, v5}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    invoke-direct {p0, p1, v4, v2, v6}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    invoke-direct {p0, p1, v4, v3, v7}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->Swapn32([IIII)V

    return-void
.end method

.method private brDec32Le([BI)I
    .locals 3

    .line 0
    aget-byte v0, p1, p2

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p2, 0x1

    aget-byte v1, p1, v1

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    add-int/lit8 v1, p2, 0x2

    aget-byte v1, p1, v1

    shl-int/lit8 v1, v1, 0x10

    const/high16 v2, 0xff0000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    add-int/lit8 p2, p2, 0x3

    aget-byte p1, p1, p2

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p1, v0

    return p1
.end method

.method private brEnc32Le([BII)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    add-int v1, p3, v0

    shl-int/lit8 v2, v0, 0x3

    shr-int v2, p2, v2

    int-to-byte v2, v2

    .line 0
    aput-byte v2, p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private brRangeDec32Le([B[II)V
    .locals 5

    const/4 v0, 0x0

    .line 0
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_0

    shl-int/lit8 v1, v0, 0x2

    add-int/2addr v1, p3

    aget-byte v2, p1, v1

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, p1, v3

    shl-int/lit8 v3, v3, 0x8

    const v4, 0xff00

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    add-int/lit8 v3, v1, 0x2

    aget-byte v3, p1, v3

    shl-int/lit8 v3, v3, 0x10

    const/high16 v4, 0xff0000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x3

    aget-byte v1, p1, v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    aput v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private mixColumns([J)V
    .locals 45

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 0
    aget-wide v1, p1, v1

    const/4 v3, 0x1

    aget-wide v3, p1, v3

    const/4 v5, 0x2

    aget-wide v6, p1, v5

    const/4 v8, 0x3

    aget-wide v9, p1, v8

    const/4 v11, 0x4

    aget-wide v12, p1, v11

    const/4 v14, 0x5

    aget-wide v15, p1, v14

    const/16 v17, 0x6

    aget-wide v18, p1, v17

    const/16 v20, 0x7

    aget-wide v21, p1, v20

    const/16 v23, 0x10

    ushr-long v24, v1, v23

    const/16 v26, 0x30

    shl-long v27, v1, v26

    or-long v24, v24, v27

    ushr-long v27, v3, v23

    shl-long v29, v3, v26

    or-long v27, v27, v29

    ushr-long v29, v6, v23

    shl-long v31, v6, v26

    or-long v29, v29, v31

    ushr-long v31, v9, v23

    shl-long v33, v9, v26

    or-long v31, v31, v33

    ushr-long v33, v12, v23

    shl-long v35, v12, v26

    or-long v33, v33, v35

    ushr-long v35, v15, v23

    shl-long v37, v15, v26

    or-long v35, v35, v37

    ushr-long v37, v18, v23

    shl-long v39, v18, v26

    or-long v37, v37, v39

    ushr-long v39, v21, v23

    shl-long v41, v21, v26

    or-long v39, v39, v41

    const/16 v23, 0x0

    move-wide/from16 v41, v15

    xor-long v14, v21, v39

    xor-long v43, v14, v24

    xor-long v1, v1, v24

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr32(J)J

    move-result-wide v24

    xor-long v24, v43, v24

    aput-wide v24, p1, v23

    xor-long v1, v1, v21

    xor-long v1, v1, v39

    xor-long v1, v1, v27

    const/16 v16, 0x1

    xor-long v3, v3, v27

    invoke-direct {v0, v3, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr32(J)J

    move-result-wide v23

    xor-long v1, v1, v23

    aput-wide v1, p1, v16

    xor-long v1, v3, v29

    xor-long v3, v6, v29

    invoke-direct {v0, v3, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr32(J)J

    move-result-wide v6

    xor-long/2addr v1, v6

    aput-wide v1, p1, v5

    xor-long v1, v3, v21

    xor-long v1, v1, v39

    xor-long v1, v1, v31

    xor-long v3, v9, v31

    invoke-direct {v0, v3, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr32(J)J

    move-result-wide v5

    xor-long/2addr v1, v5

    aput-wide v1, p1, v8

    xor-long v1, v3, v21

    xor-long v1, v1, v39

    xor-long v1, v1, v33

    xor-long v3, v12, v33

    invoke-direct {v0, v3, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr32(J)J

    move-result-wide v5

    xor-long/2addr v1, v5

    aput-wide v1, p1, v11

    xor-long v1, v3, v35

    xor-long v3, v41, v35

    invoke-direct {v0, v3, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr32(J)J

    move-result-wide v5

    xor-long/2addr v1, v5

    const/4 v5, 0x5

    aput-wide v1, p1, v5

    xor-long v1, v3, v37

    xor-long v3, v18, v37

    invoke-direct {v0, v3, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr32(J)J

    move-result-wide v5

    xor-long/2addr v1, v5

    aput-wide v1, p1, v17

    xor-long v1, v3, v39

    invoke-direct {v0, v14, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr32(J)J

    move-result-wide v3

    xor-long/2addr v1, v3

    aput-wide v1, p1, v20

    return-void
.end method

.method private mixColumns32([I)V
    .locals 26

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 0
    aget v1, p1, v1

    const/4 v2, 0x1

    aget v3, p1, v2

    const/4 v4, 0x2

    aget v5, p1, v4

    const/4 v6, 0x3

    aget v7, p1, v6

    const/4 v8, 0x4

    aget v9, p1, v8

    const/4 v10, 0x5

    aget v11, p1, v10

    const/4 v12, 0x6

    aget v13, p1, v12

    const/4 v14, 0x7

    aget v15, p1, v14

    ushr-int/lit8 v16, v1, 0x8

    shl-int/lit8 v17, v1, 0x18

    or-int v16, v16, v17

    ushr-int/lit8 v17, v3, 0x8

    shl-int/lit8 v18, v3, 0x18

    or-int v17, v17, v18

    ushr-int/lit8 v18, v5, 0x8

    shl-int/lit8 v19, v5, 0x18

    or-int v18, v18, v19

    ushr-int/lit8 v19, v7, 0x8

    shl-int/lit8 v20, v7, 0x18

    or-int v19, v19, v20

    ushr-int/lit8 v20, v9, 0x8

    shl-int/lit8 v21, v9, 0x18

    or-int v20, v20, v21

    ushr-int/lit8 v21, v11, 0x8

    shl-int/lit8 v22, v11, 0x18

    or-int v21, v21, v22

    ushr-int/lit8 v22, v13, 0x8

    shl-int/lit8 v23, v13, 0x18

    or-int v22, v22, v23

    ushr-int/lit8 v23, v15, 0x8

    shl-int/lit8 v24, v15, 0x18

    or-int v23, v23, v24

    const/16 v24, 0x0

    xor-int v14, v15, v23

    xor-int v25, v14, v16

    xor-int v1, v1, v16

    invoke-direct {v0, v1}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr16(I)I

    move-result v16

    xor-int v16, v25, v16

    aput v16, p1, v24

    xor-int/2addr v1, v15

    xor-int v1, v1, v23

    xor-int v1, v1, v17

    xor-int v3, v3, v17

    invoke-direct {v0, v3}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr16(I)I

    move-result v16

    xor-int v1, v1, v16

    aput v1, p1, v2

    xor-int v1, v3, v18

    xor-int v2, v5, v18

    invoke-direct {v0, v2}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr16(I)I

    move-result v3

    xor-int/2addr v1, v3

    aput v1, p1, v4

    xor-int v1, v2, v15

    xor-int v1, v1, v23

    xor-int v1, v1, v19

    xor-int v2, v7, v19

    invoke-direct {v0, v2}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr16(I)I

    move-result v3

    xor-int/2addr v1, v3

    aput v1, p1, v6

    xor-int v1, v2, v15

    xor-int v1, v1, v23

    xor-int v1, v1, v20

    xor-int v2, v9, v20

    invoke-direct {v0, v2}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr16(I)I

    move-result v3

    xor-int/2addr v1, v3

    aput v1, p1, v8

    xor-int v1, v2, v21

    xor-int v2, v11, v21

    invoke-direct {v0, v2}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr16(I)I

    move-result v3

    xor-int/2addr v1, v3

    aput v1, p1, v10

    xor-int v1, v2, v22

    xor-int v2, v13, v22

    invoke-direct {v0, v2}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr16(I)I

    move-result v3

    xor-int/2addr v1, v3

    aput v1, p1, v12

    xor-int v1, v2, v23

    invoke-direct {v0, v14}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->rotr16(I)I

    move-result v2

    xor-int/2addr v1, v2

    const/4 v2, 0x7

    aput v1, p1, v2

    return-void
.end method

.method private rotr16(I)I
    .locals 1

    shl-int/lit8 v0, p1, 0x10

    ushr-int/lit8 p1, p1, 0x10

    or-int/2addr p1, v0

    return p1
.end method

.method private rotr32(J)J
    .locals 3

    const/16 v0, 0x20

    shl-long v1, p1, v0

    ushr-long/2addr p1, v0

    or-long/2addr p1, v1

    return-wide p1
.end method

.method private shiftRows([J)V
    .locals 10

    const/4 v0, 0x0

    .line 0
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    aget-wide v1, p1, v0

    const-wide/32 v3, 0xffff

    and-long/2addr v3, v1

    const-wide v5, 0xfff00000L

    and-long/2addr v5, v1

    const/4 v7, 0x4

    ushr-long/2addr v5, v7

    or-long/2addr v3, v5

    const-wide/32 v5, 0xf0000

    and-long/2addr v5, v1

    const/16 v8, 0xc

    shl-long/2addr v5, v8

    or-long/2addr v3, v5

    const-wide v5, 0xff0000000000L

    and-long/2addr v5, v1

    const/16 v9, 0x8

    ushr-long/2addr v5, v9

    or-long/2addr v3, v5

    const-wide v5, 0xff00000000L

    and-long/2addr v5, v1

    shl-long/2addr v5, v9

    or-long/2addr v3, v5

    const-wide/high16 v5, -0x1000000000000000L    # -3.105036184601418E231

    and-long/2addr v5, v1

    ushr-long/2addr v5, v8

    or-long/2addr v3, v5

    const-wide/high16 v5, 0xfff000000000000L

    and-long/2addr v1, v5

    shl-long/2addr v1, v7

    or-long/2addr v1, v3

    aput-wide v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private shiftRows32([I)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    .line 0
    aget v1, p1, v0

    and-int/lit16 v2, v1, 0xff

    const v3, 0xfc00

    and-int/2addr v3, v1

    ushr-int/lit8 v3, v3, 0x2

    or-int/2addr v2, v3

    and-int/lit16 v3, v1, 0x300

    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v2, v3

    const/high16 v3, 0xf00000

    and-int/2addr v3, v1

    ushr-int/lit8 v3, v3, 0x4

    or-int/2addr v2, v3

    const/high16 v3, 0xf0000

    and-int/2addr v3, v1

    shl-int/lit8 v3, v3, 0x4

    or-int/2addr v2, v3

    const/high16 v3, -0x40000000    # -2.0f

    and-int/2addr v3, v1

    ushr-int/lit8 v3, v3, 0x6

    or-int/2addr v2, v3

    const/high16 v3, 0x3f000000    # 0.5f

    and-int/2addr v1, v3

    shl-int/lit8 v1, v1, 0x2

    or-int/2addr v1, v2

    aput v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static xor([BI[BI[BII)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p6, :cond_0

    add-int v1, p5, v0

    add-int v2, p1, v0

    .line 0
    aget-byte v2, p0, v2

    add-int v3, p3, v0

    aget-byte v3, p2, v3

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p4, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public haraka256Perm([B)V
    .locals 9

    const/16 v0, 0x8

    new-array v1, v0, [I

    .line 0
    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->buffer:[B

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v2, v3}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->interleaveConstant32([I[BI)V

    const/4 v2, 0x0

    :goto_0
    const/4 v4, 0x5

    if-ge v2, v4, :cond_2

    const/4 v4, 0x0

    :goto_1
    const/4 v5, 0x2

    if-ge v4, v5, :cond_0

    invoke-static {v1}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brAesCtBitsliceSbox([I)V

    invoke-direct {p0, v1}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->shiftRows32([I)V

    invoke-direct {p0, v1}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->mixColumns32([I)V

    iget-object v5, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->haraka256_rc:[[I

    shl-int/lit8 v6, v2, 0x1

    add-int/2addr v6, v4

    aget-object v5, v5, v6

    invoke-direct {p0, v1, v5}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->addRoundKey32([I[I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_2
    if-ge v4, v0, :cond_1

    aget v6, v1, v4

    const v7, -0x7e7e7e7f

    and-int/2addr v7, v6

    const v8, 0x2020202

    and-int/2addr v8, v6

    shl-int/lit8 v8, v8, 0x1

    or-int/2addr v7, v8

    const v8, 0x4040404

    and-int/2addr v8, v6

    shl-int/2addr v8, v5

    or-int/2addr v7, v8

    const v8, 0x8080808

    and-int/2addr v8, v6

    shl-int/lit8 v8, v8, 0x3

    or-int/2addr v7, v8

    const v8, 0x10101010

    and-int/2addr v8, v6

    ushr-int/lit8 v8, v8, 0x3

    or-int/2addr v7, v8

    const v8, 0x20202020

    and-int/2addr v8, v6

    ushr-int/2addr v8, v5

    or-int/2addr v7, v8

    const v8, 0x40404040

    and-int/2addr v6, v8

    ushr-int/lit8 v6, v6, 0x1

    or-int/2addr v6, v7

    aput v6, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-direct {p0, v1}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brAesCtOrtho([I)V

    :goto_3
    const/4 v0, 0x4

    if-ge v3, v0, :cond_3

    shl-int/lit8 v0, v3, 0x1

    aget v2, v1, v0

    shl-int/lit8 v4, v3, 0x2

    invoke-direct {p0, p1, v2, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brEnc32Le([BII)V

    add-int/lit8 v0, v0, 0x1

    aget v0, v1, v0

    add-int/lit8 v4, v4, 0x10

    invoke-direct {p0, p1, v0, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brEnc32Le([BII)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_3
    return-void
.end method

.method public haraka512Perm([B)V
    .locals 18

    move-object/from16 v0, p0

    const/16 v1, 0x10

    new-array v2, v1, [I

    const/16 v3, 0x8

    new-array v4, v3, [J

    .line 0
    iget-object v5, v0, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->buffer:[B

    const/4 v6, 0x0

    invoke-direct {v0, v5, v2, v6}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brRangeDec32Le([B[II)V

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x4

    if-ge v5, v6, :cond_0

    shl-int/lit8 v6, v5, 0x2

    invoke-direct {v0, v4, v5, v2, v6}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brAesCt64InterleaveIn([JI[II)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {v0, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brAesCt64Ortho([J)V

    const/4 v5, 0x0

    :goto_1
    const/4 v7, 0x5

    if-ge v5, v7, :cond_3

    const/4 v8, 0x0

    :goto_2
    const/4 v9, 0x2

    if-ge v8, v9, :cond_1

    invoke-direct {v0, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brAesCt64BitsliceSbox([J)V

    invoke-direct {v0, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->shiftRows([J)V

    invoke-direct {v0, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->mixColumns([J)V

    iget-object v9, v0, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->haraka512_rc:[[J

    shl-int/lit8 v10, v5, 0x1

    add-int/2addr v10, v8

    aget-object v9, v9, v10

    invoke-direct {v0, v4, v9}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->addRoundKey([J[J)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    :goto_3
    if-ge v8, v3, :cond_2

    aget-wide v10, v4, v8

    const-wide v12, 0x1000100010001L

    and-long/2addr v12, v10

    shl-long/2addr v12, v7

    const-wide v14, 0x2000200020002L

    and-long/2addr v14, v10

    const/16 v16, 0xc

    shl-long v14, v14, v16

    or-long/2addr v12, v14

    const-wide v14, 0x4000400040004L

    and-long/2addr v14, v10

    const/16 v17, 0x1

    ushr-long v14, v14, v17

    or-long/2addr v12, v14

    const-wide v14, 0x8000800080008L

    and-long/2addr v14, v10

    const/16 v17, 0x6

    shl-long v14, v14, v17

    or-long/2addr v12, v14

    const-wide v14, 0x20002000200020L

    and-long/2addr v14, v10

    const/16 v17, 0x9

    shl-long v14, v14, v17

    or-long/2addr v12, v14

    const-wide v14, 0x40004000400040L

    and-long/2addr v14, v10

    ushr-long/2addr v14, v6

    or-long/2addr v12, v14

    const-wide v14, 0x80008000800080L

    and-long/2addr v14, v10

    const/16 v17, 0x3

    shl-long v14, v14, v17

    or-long/2addr v12, v14

    const-wide v14, 0x2100210021002100L    # 9.854557643121966E-150

    and-long/2addr v14, v10

    ushr-long/2addr v14, v7

    or-long/2addr v12, v14

    const-wide v14, 0x210021002100210L

    and-long/2addr v14, v10

    shl-long/2addr v14, v9

    or-long/2addr v12, v14

    const-wide v14, 0x800080008000800L

    and-long/2addr v14, v10

    shl-long/2addr v14, v6

    or-long/2addr v12, v14

    const-wide v14, 0x1000100010001000L    # 1.293261978181323E-231

    and-long/2addr v14, v10

    ushr-long v14, v14, v16

    or-long/2addr v12, v14

    const-wide v14, 0x4000400040004000L    # 2.031250476844434

    and-long/2addr v14, v10

    const/16 v16, 0xa

    ushr-long v14, v14, v16

    or-long/2addr v12, v14

    const-wide v14, -0x7bff7bff7bff7c00L

    and-long/2addr v10, v14

    ushr-long v10, v10, v17

    or-long/2addr v10, v12

    aput-wide v10, v4, v8

    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_3

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_3
    invoke-direct {v0, v4}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brAesCt64Ortho([J)V

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v6, :cond_4

    invoke-direct {v0, v2, v4, v3}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brAesCt64InterleaveOut([I[JI)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_4
    const/4 v3, 0x0

    :goto_5
    if-ge v3, v1, :cond_6

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v6, :cond_5

    shl-int/lit8 v5, v3, 0x2

    add-int/2addr v5, v4

    aget v7, v2, v3

    shl-int/lit8 v8, v4, 0x3

    ushr-int/2addr v7, v8

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    aput-byte v7, p1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_6
    return-void
.end method

.method public interleaveConstant([J[BI)V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [I

    .line 0
    invoke-direct {p0, p2, v0, p3}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brRangeDec32Le([B[II)V

    const/4 p2, 0x0

    :goto_0
    const/4 p3, 0x4

    if-ge p2, p3, :cond_0

    shl-int/lit8 p3, p2, 0x2

    invoke-direct {p0, p1, p2, v0, p3}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brAesCt64InterleaveIn([JI[II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brAesCt64Ortho([J)V

    return-void
.end method

.method public interleaveConstant32([I[BI)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    shl-int/lit8 v1, v0, 0x1

    shl-int/lit8 v2, v0, 0x2

    add-int/2addr v2, p3

    .line 0
    invoke-direct {p0, p2, v2}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brDec32Le([BI)I

    move-result v3

    aput v3, p1, v1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v2, 0x10

    invoke-direct {p0, p2, v2}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brDec32Le([BI)I

    move-result v2

    aput v2, p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->brAesCtOrtho([I)V

    return-void
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->off:I

    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/HarakaSBase;->buffer:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    return-void
.end method
