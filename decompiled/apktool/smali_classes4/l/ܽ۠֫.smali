.class public final Ll/ܽ۠֫;
.super Ljava/lang/Object;
.source "S8SC"


# static fields
.field public static final ֫:[F

.field public static final ۧ:[B

.field public static ܽ:[I

.field public static final ᩳ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 497
    fill-array-data v0, :array_0

    sput-object v0, Ll/ܽ۠֫;->ۧ:[B

    const/16 v0, 0x11

    new-array v0, v0, [F

    .line 503
    fill-array-data v0, :array_1

    sput-object v0, Ll/ܽ۠֫;->֫:[F

    .line 526
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܽ۠֫;->ᩳ:Ljava/lang/Object;

    const/16 v0, 0xa

    new-array v0, v0, [I

    .line 532
    sput-object v0, Ll/ܽ۠֫;->ܽ:[I

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x400ba2e9
        0x3fe8ba2f
        0x403a2e8c
        0x401b26ca
        0x3fd1745d
        0x3fae8ba3
        0x3ff83e10
        0x3fcede62
        0x3faaaaab
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public static ֫(II[B[Z)I
    .locals 8

    sub-int v0, p1, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 1903
    :goto_0
    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Z)V

    if-nez v0, :cond_1

    return p1

    .line 1908
    :cond_1
    aget-boolean v3, p3, v1

    if-eqz v3, :cond_2

    .line 1909
    invoke-static {p3}, Ll/ܽ۠֫;->֫([Z)V

    add-int/lit8 p0, p0, -0x3

    return p0

    :cond_2
    const/4 v3, 0x2

    if-le v0, v2, :cond_3

    .line 1911
    aget-boolean v4, p3, v2

    if-eqz v4, :cond_3

    aget-byte v4, p2, p0

    if-ne v4, v2, :cond_3

    .line 1912
    invoke-static {p3}, Ll/ܽ۠֫;->֫([Z)V

    sub-int/2addr p0, v3

    return p0

    :cond_3
    if-le v0, v3, :cond_4

    .line 1914
    aget-boolean v4, p3, v3

    if-eqz v4, :cond_4

    aget-byte v4, p2, p0

    if-nez v4, :cond_4

    add-int/lit8 v4, p0, 0x1

    aget-byte v4, p2, v4

    if-ne v4, v2, :cond_4

    .line 1918
    invoke-static {p3}, Ll/ܽ۠֫;->֫([Z)V

    sub-int/2addr p0, v2

    return p0

    :cond_4
    add-int/lit8 v4, p1, -0x1

    add-int/2addr p0, v3

    :goto_1
    if-ge p0, v4, :cond_7

    .line 1926
    aget-byte v5, p2, p0

    and-int/lit16 v6, v5, 0xfe

    if-eqz v6, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v6, p0, -0x2

    .line 1929
    aget-byte v7, p2, v6

    if-nez v7, :cond_6

    add-int/lit8 v7, p0, -0x1

    aget-byte v7, p2, v7

    if-nez v7, :cond_6

    if-ne v5, v2, :cond_6

    .line 1930
    invoke-static {p3}, Ll/ܽ۠֫;->֫([Z)V

    return v6

    :cond_6
    add-int/lit8 p0, p0, -0x2

    :goto_2
    add-int/lit8 p0, p0, 0x3

    goto :goto_1

    :cond_7
    if-le v0, v3, :cond_8

    add-int/lit8 p0, p1, -0x3

    .line 1942
    aget-byte p0, p2, p0

    if-nez p0, :cond_a

    add-int/lit8 p0, p1, -0x2

    aget-byte p0, p2, p0

    if-nez p0, :cond_a

    aget-byte p0, p2, v4

    if-ne p0, v2, :cond_a

    goto :goto_3

    :cond_8
    if-ne v0, v3, :cond_9

    .line 1944
    aget-boolean p0, p3, v3

    if-eqz p0, :cond_a

    add-int/lit8 p0, p1, -0x2

    aget-byte p0, p2, p0

    if-nez p0, :cond_a

    aget-byte p0, p2, v4

    if-ne p0, v2, :cond_a

    goto :goto_3

    .line 1945
    :cond_9
    aget-boolean p0, p3, v2

    if-eqz p0, :cond_a

    aget-byte p0, p2, v4

    if-ne p0, v2, :cond_a

    :goto_3
    const/4 p0, 0x1

    goto :goto_4

    :cond_a
    const/4 p0, 0x0

    :goto_4
    aput-boolean p0, p3, v1

    if-le v0, v2, :cond_b

    add-int/lit8 p0, p1, -0x2

    .line 1949
    aget-byte p0, p2, p0

    if-nez p0, :cond_c

    aget-byte p0, p2, v4

    if-nez p0, :cond_c

    goto :goto_5

    .line 1950
    :cond_b
    aget-boolean p0, p3, v3

    if-eqz p0, :cond_c

    aget-byte p0, p2, v4

    if-nez p0, :cond_c

    :goto_5
    const/4 p0, 0x1

    goto :goto_6

    :cond_c
    const/4 p0, 0x0

    :goto_6
    aput-boolean p0, p3, v2

    .line 1952
    aget-byte p0, p2, v4

    if-nez p0, :cond_d

    const/4 v1, 0x1

    :cond_d
    aput-boolean v1, p3, v3

    return p1
.end method

.method public static ֫(I[B)I
    .locals 8

    .line 546
    sget-object v0, Ll/ܽ۠֫;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-ge v2, p0, :cond_4

    :goto_1
    add-int/lit8 v4, p0, -0x2

    if-ge v2, v4, :cond_2

    .line 2040
    :try_start_0
    aget-byte v4, p1, v2

    if-nez v4, :cond_1

    add-int/lit8 v4, v2, 0x1

    aget-byte v4, p1, v4

    if-nez v4, :cond_1

    add-int/lit8 v4, v2, 0x2

    aget-byte v4, p1, v4

    const/4 v5, 0x3

    if-ne v4, v5, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_4

    :cond_2
    move v2, p0

    :goto_2
    if-ge v2, p0, :cond_0

    .line 552
    sget-object v4, Ll/ܽ۠֫;->ܽ:[I

    array-length v5, v4

    if-gt v5, v3, :cond_3

    .line 554
    array-length v5, v4

    mul-int/lit8 v5, v5, 0x2

    .line 555
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    sput-object v4, Ll/ܽ۠֫;->ܽ:[I

    .line 557
    :cond_3
    sget-object v4, Ll/ܽ۠֫;->ܽ:[I

    add-int/lit8 v5, v3, 0x1

    aput v2, v4, v3

    add-int/lit8 v2, v2, 0x3

    move v3, v5

    goto :goto_0

    :cond_4
    sub-int/2addr p0, v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_3
    if-ge v2, v3, :cond_5

    .line 566
    sget-object v6, Ll/ܽ۠֫;->ܽ:[I

    aget v6, v6, v2

    sub-int/2addr v6, v5

    .line 568
    invoke-static {p1, v5, p1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v4, v6

    add-int/lit8 v7, v4, 0x1

    .line 570
    aput-byte v1, p1, v4

    add-int/lit8 v4, v4, 0x2

    .line 571
    aput-byte v1, p1, v7

    add-int/lit8 v6, v6, 0x3

    add-int/2addr v5, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    sub-int v1, p0, v4

    .line 576
    invoke-static {p1, v5, p1, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 577
    monitor-exit v0

    return p0

    .line 578
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/۠ᩴ֫;)I
    .locals 2

    .line 708
    iget-object v0, p0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v1, "video/avc"

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 711
    :cond_0
    iget-object v0, p0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v1, "video/hevc"

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p0, p0, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    .line 344
    invoke-static {p0, v1}, Ll/ۢ᩵֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x2

    return p0
.end method

.method public static ֫(Ljava/util/List;)Ljava/lang/String;
    .locals 11

    const/4 v0, 0x0

    .line 1980
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_4

    .line 1981
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 1982
    array-length v3, v1

    const/4 v4, 0x3

    if-le v3, v4, :cond_3

    new-array v5, v4, [Z

    .line 2006
    sget v6, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v6, Ll/֫۬ܺ;

    invoke-direct {v6}, Ll/֫۬ܺ;-><init>()V

    const/4 v7, 0x0

    .line 2007
    :goto_1
    array-length v8, v1

    if-ge v7, v8, :cond_1

    .line 2008
    array-length v8, v1

    invoke-static {v7, v8, v1, v5}, Ll/ܽ۠֫;->֫(II[B[Z)I

    move-result v7

    .line 2009
    array-length v8, v1

    if-eq v7, v8, :cond_0

    .line 2010
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v8}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    :cond_0
    add-int/lit8 v7, v7, 0x3

    goto :goto_1

    .line 2014
    :cond_1
    invoke-virtual {v6}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v5

    const/4 v6, 0x0

    .line 1985
    :goto_2
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v7

    if-ge v6, v7, :cond_3

    .line 1987
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    add-int/2addr v7, v4

    if-ge v7, v3, :cond_2

    .line 1989
    new-instance v7, Ll/ᩳ۠֫;

    .line 1990
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int/2addr v8, v4

    invoke-direct {v7, v1, v8, v3}, Ll/ᩳ۠֫;-><init>([BII)V

    .line 1991
    invoke-static {v7}, Ll/ܽ۠֫;->֫(Ll/ᩳ۠֫;)Ll/ۙ֨֫;

    move-result-object v8

    .line 1992
    iget v9, v8, Ll/ۙ֨֫;->ۧ:I

    const/16 v10, 0x21

    if-ne v9, v10, :cond_2

    iget v8, v8, Ll/ۙ֨֫;->֫:I

    if-nez v8, :cond_2

    const/4 p0, 0x4

    .line 2020
    invoke-virtual {v7, p0}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 2021
    invoke-virtual {v7, v4}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result p0

    .line 2022
    invoke-virtual {v7}, Ll/ᩳ۠֫;->ܳ()V

    const/4 v0, 0x1

    .line 2024
    invoke-static {v7, v0, p0, v2}, Ll/ܽ۠֫;->֫(Ll/ᩳ۠֫;ZILl/ۗ֨֫;)Ll/ۗ֨֫;

    move-result-object p0

    .line 2029
    iget v0, p0, Ll/ۗ֨֫;->ܿ:I

    iget-boolean v4, p0, Ll/ۗ֨֫;->ܳ:Z

    iget v1, p0, Ll/ۗ֨֫;->ᩳ:I

    iget v2, p0, Ll/ۗ֨֫;->ܽ:I

    iget-object v3, p0, Ll/ۗ֨֫;->֫:[I

    iget v5, p0, Ll/ۗ֨֫;->ۧ:I

    invoke-static/range {v0 .. v5}, Ll/ᩳۚ֫;->֫(III[IZI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_4
    return-object v2
.end method

.method public static ֫(Ll/ᩳ۠֫;ZILl/ۗ֨֫;)Ll/ۗ֨֫;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v3, 0x6

    new-array v4, v3, [I

    const/4 v5, 0x2

    const/16 v6, 0x8

    const/4 v7, 0x0

    if-eqz p1, :cond_2

    .line 2125
    invoke-virtual {v0, v5}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v2

    .line 2126
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v5

    const/4 v8, 0x5

    .line 2127
    invoke-virtual {v0, v8}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    const/16 v11, 0x20

    if-ge v9, v11, :cond_1

    .line 2130
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v11

    if-eqz v11, :cond_0

    const/4 v11, 0x1

    shl-int/2addr v11, v9

    or-int/2addr v10, v11

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    :goto_1
    if-ge v9, v3, :cond_3

    .line 2135
    invoke-virtual {v0, v6}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v11

    aput v11, v4, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_4

    .line 2138
    iget v3, v2, Ll/ۗ֨֫;->ܿ:I

    .line 2139
    iget-boolean v5, v2, Ll/ۗ֨֫;->ܳ:Z

    .line 2140
    iget v8, v2, Ll/ۗ֨֫;->ᩳ:I

    .line 2141
    iget v10, v2, Ll/ۗ֨֫;->ܽ:I

    .line 2142
    iget-object v4, v2, Ll/ۗ֨֫;->֫:[I

    move v2, v3

    :cond_3
    move v12, v2

    move-object v15, v4

    move/from16 v16, v5

    move v13, v8

    move v14, v10

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    move-object v15, v4

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    .line 2144
    :goto_2
    invoke-virtual {v0, v6}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v17

    const/4 v2, 0x0

    :goto_3
    if-ge v7, v1, :cond_7

    .line 2149
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_5

    add-int/lit8 v2, v2, 0x58

    .line 2152
    :cond_5
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_6

    add-int/lit8 v2, v2, 0x8

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 2156
    :cond_7
    invoke-virtual {v0, v2}, Ll/ᩳ۠֫;->ܽ(I)V

    if-lez v1, :cond_8

    sub-int/2addr v6, v1

    mul-int/lit8 v6, v6, 0x2

    .line 2158
    invoke-virtual {v0, v6}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 2161
    :cond_8
    new-instance v0, Ll/ۗ֨֫;

    move-object v11, v0

    invoke-direct/range {v11 .. v17}, Ll/ۗ֨֫;-><init>(III[IZI)V

    return-object v0
.end method

.method public static ֫(Ll/ᩳ۠֫;)Ll/ۙ֨֫;
    .locals 3

    .line 1007
    invoke-virtual {p0}, Ll/ᩳ۠֫;->ܳ()V

    const/4 v0, 0x6

    .line 1008
    invoke-virtual {p0, v0}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v1

    .line 1009
    invoke-virtual {p0, v0}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v0

    const/4 v2, 0x3

    .line 1010
    invoke-virtual {p0, v2}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    .line 1011
    new-instance v2, Ll/ۙ֨֫;

    invoke-direct {v2, v1, v0, p0}, Ll/ۙ֨֫;-><init>(III)V

    return-object v2
.end method

.method public static ֫(II[B)Ll/ۛ֨֫;
    .locals 8

    add-int/lit8 p0, p0, 0x2

    :goto_0
    add-int/lit8 p1, p1, -0x1

    .line 1786
    aget-byte v0, p2, p1

    if-nez v0, :cond_0

    if-le p1, p0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_e

    if-gt p1, p0, :cond_1

    goto/16 :goto_8

    .line 1793
    :cond_1
    new-instance v0, Ll/ᩳ۠֫;

    add-int/lit8 p1, p1, 0x1

    invoke-direct {v0, p2, p0, p1}, Ll/ᩳ۠֫;-><init>([BII)V

    :goto_1
    const/16 p0, 0x10

    .line 1796
    invoke-virtual {v0, p0}, Ll/ᩳ۠֫;->֫(I)Z

    move-result p0

    if-eqz p0, :cond_e

    const/16 p0, 0x8

    .line 1799
    invoke-virtual {v0, p0}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result p1

    const/4 p2, 0x0

    const/4 v1, 0x0

    :goto_2
    const/16 v2, 0xff

    if-ne p1, v2, :cond_2

    add-int/lit16 v1, v1, 0xff

    .line 1802
    invoke-virtual {v0, p0}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result p1

    goto :goto_2

    :cond_2
    add-int/2addr v1, p1

    .line 1807
    invoke-virtual {v0, p0}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result p1

    const/4 v3, 0x0

    :goto_3
    if-ne p1, v2, :cond_3

    add-int/lit16 v3, v3, 0xff

    .line 1810
    invoke-virtual {v0, p0}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result p1

    goto :goto_3

    :cond_3
    add-int/2addr v3, p1

    if-eqz v3, :cond_e

    .line 1813
    invoke-virtual {v0, v3}, Ll/ᩳ۠֫;->֫(I)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_8

    :cond_4
    const/16 p0, 0xb0

    if-ne v1, p0, :cond_d

    .line 1818
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result p0

    .line 1819
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 1822
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    .line 1824
    :goto_4
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    :goto_5
    if-gt v4, v2, :cond_c

    .line 1832
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v3

    .line 1833
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    const/4 v5, 0x6

    .line 1834
    invoke-virtual {v0, v5}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v6

    const/16 v7, 0x3f

    if-ne v6, v7, :cond_6

    goto :goto_8

    :cond_6
    if-nez v6, :cond_7

    add-int/lit8 v6, p0, -0x1e

    .line 1840
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    goto :goto_6

    :cond_7
    add-int/2addr v6, p0

    add-int/lit8 v6, v6, -0x1f

    .line 1841
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 1843
    :goto_6
    invoke-virtual {v0, v6}, Ll/ᩳ۠֫;->ۧ(I)I

    if-eqz p1, :cond_a

    .line 1845
    invoke-virtual {v0, v5}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v5

    if-ne v5, v7, :cond_8

    goto :goto_8

    :cond_8
    if-nez v5, :cond_9

    add-int/lit8 v5, v1, -0x1e

    .line 1851
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    goto :goto_7

    :cond_9
    add-int/2addr v5, v1

    add-int/lit8 v5, v5, -0x1f

    .line 1852
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 1854
    :goto_7
    invoke-virtual {v0, v5}, Ll/ᩳ۠֫;->ۧ(I)I

    .line 1856
    :cond_a
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_b

    const/16 v5, 0xa

    .line 1857
    invoke-virtual {v0, v5}, Ll/ᩳ۠֫;->ܽ(I)V

    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 1861
    :cond_c
    new-instance p0, Ll/ۛ֨֫;

    invoke-direct {p0, v3}, Ll/ۛ֨֫;-><init>(I)V

    return-object p0

    :cond_d
    mul-int/lit8 v3, v3, 0x8

    .line 1872
    invoke-virtual {v0, v3}, Ll/ᩳ۠֫;->ܽ(I)V

    goto/16 :goto_1

    :cond_e
    :goto_8
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫([BIILl/۟֨֫;)Ll/ۨ֨֫;
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    .line 1511
    new-instance v4, Ll/ᩳ۠֫;

    invoke-direct {v4, v0, v1, v2}, Ll/ᩳ۠֫;-><init>([BII)V

    .line 1512
    invoke-static {v4}, Ll/ܽ۠֫;->֫(Ll/ᩳ۠֫;)Ll/ۙ֨֫;

    move-result-object v4

    const/4 v5, 0x2

    add-int/2addr v1, v5

    .line 1534
    new-instance v6, Ll/ᩳ۠֫;

    invoke-direct {v6, v0, v1, v2}, Ll/ᩳ۠֫;-><init>([BII)V

    const/4 v0, 0x4

    .line 1535
    invoke-virtual {v6, v0}, Ll/ᩳ۠֫;->ܽ(I)V

    const/4 v1, 0x3

    .line 1538
    invoke-virtual {v6, v1}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v8

    .line 1539
    iget v2, v4, Ll/ۙ֨֫;->֫:I

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    const/4 v7, 0x7

    if-ne v8, v7, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    if-eqz v3, :cond_1

    .line 1542
    iget-object v9, v3, Ll/۟֨֫;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_1

    .line 1543
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->size()I

    move-result v10

    sub-int/2addr v10, v4

    invoke-static {v2, v10}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 1544
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶֨֫;

    iget v2, v2, Ll/᩶֨֫;->֫:I

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    const/4 v9, 0x0

    if-nez v7, :cond_2

    .line 1548
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܳ()V

    .line 1550
    invoke-static {v6, v4, v8, v9}, Ll/ܽ۠֫;->֫(Ll/ᩳ۠֫;ZILl/ۗ֨֫;)Ll/ۗ֨֫;

    move-result-object v9

    goto :goto_2

    :cond_2
    if-eqz v3, :cond_3

    .line 1555
    iget-object v10, v3, Ll/۟֨֫;->ۧ:Ll/۬֨֫;

    .line 1556
    iget-object v11, v10, Ll/۬֨֫;->֫:[I

    iget-object v10, v10, Ll/۬֨֫;->ۧ:Ll/ܳ۬ܺ;

    aget v11, v11, v2

    .line 1557
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->size()I

    move-result v12

    if-le v12, v11, :cond_3

    .line 1559
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۗ֨֫;

    .line 1563
    :cond_3
    :goto_2
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    const/16 v10, 0x8

    const/4 v11, -0x1

    if-eqz v7, :cond_7

    .line 1573
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 1574
    invoke-virtual {v6, v10}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v5

    goto :goto_3

    :cond_4
    const/4 v5, -0x1

    :goto_3
    if-eqz v3, :cond_6

    .line 1576
    iget-object v10, v3, Ll/۟֨֫;->ܽ:Ll/ۤ֨֫;

    if-eqz v10, :cond_6

    iget-object v12, v10, Ll/ۤ֨֫;->ۧ:Ll/ܳ۬ܺ;

    if-ne v5, v11, :cond_5

    .line 1578
    iget-object v5, v10, Ll/ۤ֨֫;->֫:[I

    aget v5, v5, v2

    :cond_5
    if-eq v5, v11, :cond_6

    .line 1581
    invoke-virtual {v12}, Ljava/util/AbstractCollection;->size()I

    move-result v10

    if-le v10, v5, :cond_6

    .line 1582
    invoke-interface {v12, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۫֨֫;

    .line 1583
    iget v10, v5, Ll/۫֨֫;->ܽ:I

    .line 1584
    iget v10, v5, Ll/۫֨֫;->ܿ:I

    .line 1585
    iget v11, v5, Ll/۫֨֫;->ᩳ:I

    .line 1588
    iget v12, v5, Ll/۫֨֫;->ۧ:I

    .line 1589
    iget v5, v5, Ll/۫֨֫;->֫:I

    move v14, v10

    move v13, v11

    move v15, v13

    move v11, v5

    move v10, v12

    move v12, v14

    goto/16 :goto_8

    :cond_6
    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    goto :goto_8

    .line 1593
    :cond_7
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v10

    if-ne v10, v1, :cond_8

    .line 1595
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܳ()V

    .line 1597
    :cond_8
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v11

    .line 1598
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v12

    .line 1599
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v13

    if-eqz v13, :cond_c

    .line 1600
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v13

    .line 1601
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v14

    .line 1602
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v15

    .line 1603
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v16

    if-eq v10, v4, :cond_a

    if-ne v10, v5, :cond_9

    goto :goto_4

    :cond_9
    const/4 v5, 0x1

    goto :goto_5

    :cond_a
    :goto_4
    const/4 v5, 0x2

    :goto_5
    add-int/2addr v13, v14

    mul-int v13, v13, v5

    sub-int v5, v11, v13

    if-ne v10, v4, :cond_b

    const/4 v10, 0x2

    goto :goto_6

    :cond_b
    const/4 v10, 0x1

    :goto_6
    add-int v15, v15, v16

    mul-int v15, v15, v10

    sub-int v10, v12, v15

    goto :goto_7

    :cond_c
    move v5, v11

    move v10, v12

    .line 1614
    :goto_7
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v13

    .line 1615
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v14

    move v15, v12

    move v12, v5

    move/from16 v26, v13

    move v13, v10

    move/from16 v10, v26

    move/from16 v27, v14

    move v14, v11

    move/from16 v11, v27

    .line 1617
    :goto_8
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v5

    if-nez v7, :cond_f

    .line 1621
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x0

    goto :goto_9

    :cond_d
    move/from16 v16, v8

    :goto_9
    const/16 v17, -0x1

    move/from16 v0, v16

    const/4 v1, -0x1

    :goto_a
    if-gt v0, v8, :cond_e

    .line 1622
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    .line 1624
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v4

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1625
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    add-int/lit8 v0, v0, 0x1

    const/4 v4, 0x1

    goto :goto_a

    :cond_e
    move/from16 v17, v1

    goto :goto_b

    :cond_f
    const/4 v0, -0x1

    const/16 v17, -0x1

    .line 1628
    :goto_b
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    .line 1629
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    .line 1630
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    .line 1631
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    .line 1632
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    .line 1633
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    .line 1634
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_17

    if-eqz v7, :cond_10

    .line 1637
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    goto :goto_c

    :cond_10
    const/4 v0, 0x0

    :goto_c
    const/4 v1, 0x6

    if-eqz v0, :cond_11

    .line 1640
    invoke-virtual {v6, v1}, Ll/ᩳ۠֫;->ܽ(I)V

    goto :goto_12

    .line 1641
    :cond_11
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_17

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v4, 0x6

    :goto_d
    if-ge v0, v1, :cond_17

    const/4 v1, 0x0

    :goto_e
    if-ge v1, v4, :cond_16

    .line 2425
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v4

    if-nez v4, :cond_12

    .line 2427
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move/from16 p0, v15

    const/4 v4, 0x3

    const/4 v7, 0x1

    goto :goto_10

    :cond_12
    shl-int/lit8 v4, v0, 0x1

    add-int/lit8 v4, v4, 0x4

    const/4 v7, 0x1

    shl-int v4, v7, v4

    move/from16 p0, v15

    const/16 v15, 0x40

    .line 2429
    invoke-static {v15, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-le v0, v7, :cond_13

    .line 2432
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ᩳ()I

    :cond_13
    const/4 v15, 0x0

    :goto_f
    if-ge v15, v4, :cond_14

    .line 2435
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ᩳ()I

    add-int/lit8 v15, v15, 0x1

    goto :goto_f

    :cond_14
    const/4 v4, 0x3

    :goto_10
    if-ne v0, v4, :cond_15

    const/4 v15, 0x3

    goto :goto_11

    :cond_15
    const/4 v15, 0x1

    :goto_11
    add-int/2addr v1, v15

    const/4 v15, 0x6

    const/4 v4, 0x6

    move/from16 v15, p0

    goto :goto_e

    :cond_16
    move/from16 p0, v15

    const/4 v4, 0x3

    const/4 v7, 0x1

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x4

    const/4 v15, 0x6

    const/4 v4, 0x6

    move/from16 v15, p0

    goto :goto_d

    :cond_17
    :goto_12
    move/from16 p0, v15

    const/4 v0, 0x2

    .line 1645
    invoke-virtual {v6, v0}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 1646
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_18

    const/16 v0, 0x8

    .line 1648
    invoke-virtual {v6, v0}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 1649
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    .line 1650
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    .line 1651
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܳ()V

    .line 2449
    :cond_18
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v0

    const/4 v1, 0x0

    new-array v4, v1, [I

    new-array v7, v1, [I

    const/4 v15, -0x1

    const/16 v16, -0x1

    move/from16 p1, v14

    const/4 v14, -0x1

    :goto_13
    if-ge v1, v0, :cond_2a

    if-eqz v1, :cond_25

    .line 2464
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v16

    if-eqz v16, :cond_25

    move/from16 p2, v0

    add-int v0, v15, v14

    move/from16 v16, v12

    .line 2468
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v12

    .line 2469
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v18

    move/from16 v19, v11

    add-int/lit8 v11, v18, 0x1

    move/from16 v18, v10

    const/4 v10, 0x2

    move-object/from16 v20, v9

    const/4 v9, 0x1

    invoke-static {v12, v10, v9, v11}, Ll/᩸ܳۡ;->֫(IIII)I

    move-result v9

    add-int/lit8 v10, v0, 0x1

    .line 2472
    new-array v11, v10, [Z

    const/4 v12, 0x0

    :goto_14
    const/16 v21, 0x1

    if-gt v12, v0, :cond_1a

    .line 2474
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v22

    if-nez v22, :cond_19

    .line 2475
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v21

    aput-boolean v21, v11, v12

    goto :goto_15

    .line 2478
    :cond_19
    aput-boolean v21, v11, v12

    :goto_15
    add-int/lit8 v12, v12, 0x1

    goto :goto_14

    .line 2485
    :cond_1a
    new-array v12, v10, [I

    .line 2486
    new-array v10, v10, [I

    add-int/lit8 v21, v14, -0x1

    const/16 v22, 0x0

    :goto_16
    if-ltz v21, :cond_1c

    .line 2488
    aget v23, v7, v21

    add-int v23, v23, v9

    if-gez v23, :cond_1b

    add-int v24, v15, v21

    .line 2489
    aget-boolean v24, v11, v24

    if-eqz v24, :cond_1b

    add-int/lit8 v24, v22, 0x1

    .line 2490
    aput v23, v12, v22

    move/from16 v22, v24

    :cond_1b
    add-int/lit8 v21, v21, -0x1

    goto :goto_16

    :cond_1c
    if-gez v9, :cond_1d

    .line 2493
    aget-boolean v21, v11, v0

    if-eqz v21, :cond_1d

    add-int/lit8 v21, v22, 0x1

    .line 2494
    aput v9, v12, v22

    move/from16 v22, v21

    :cond_1d
    const/16 v21, 0x0

    move/from16 v23, v8

    move/from16 v21, v13

    move/from16 v13, v22

    const/4 v8, 0x0

    :goto_17
    if-ge v8, v15, :cond_1f

    .line 2497
    aget v22, v4, v8

    add-int v22, v22, v9

    if-gez v22, :cond_1e

    .line 2498
    aget-boolean v24, v11, v8

    if-eqz v24, :cond_1e

    add-int/lit8 v24, v13, 0x1

    .line 2499
    aput v22, v12, v13

    move/from16 v13, v24

    :cond_1e
    add-int/lit8 v8, v8, 0x1

    goto :goto_17

    .line 2503
    :cond_1f
    invoke-static {v12, v13}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v8

    add-int/lit8 v12, v15, -0x1

    const/16 v22, 0x0

    :goto_18
    if-ltz v12, :cond_21

    .line 2507
    aget v24, v4, v12

    add-int v24, v24, v9

    if-lez v24, :cond_20

    .line 2508
    aget-boolean v25, v11, v12

    if-eqz v25, :cond_20

    add-int/lit8 v25, v22, 0x1

    .line 2509
    aput v24, v10, v22

    move/from16 v22, v25

    :cond_20
    add-int/lit8 v12, v12, -0x1

    goto :goto_18

    :cond_21
    if-lez v9, :cond_22

    .line 2512
    aget-boolean v0, v11, v0

    if-eqz v0, :cond_22

    add-int/lit8 v0, v22, 0x1

    .line 2513
    aput v9, v10, v22

    move/from16 v22, v0

    :cond_22
    const/4 v0, 0x0

    move/from16 v4, v22

    :goto_19
    if-ge v0, v14, :cond_24

    .line 2516
    aget v12, v7, v0

    add-int/2addr v12, v9

    if-lez v12, :cond_23

    add-int v22, v15, v0

    .line 2517
    aget-boolean v22, v11, v22

    if-eqz v22, :cond_23

    add-int/lit8 v22, v4, 0x1

    .line 2518
    aput v12, v10, v4

    move/from16 v4, v22

    :cond_23
    add-int/lit8 v0, v0, 0x1

    goto :goto_19

    .line 2522
    :cond_24
    invoke-static {v10, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    move-object v7, v0

    move v14, v4

    move-object v4, v8

    move v15, v13

    goto :goto_1e

    :cond_25
    move/from16 p2, v0

    move/from16 v23, v8

    move-object/from16 v20, v9

    move/from16 v18, v10

    move/from16 v19, v11

    move/from16 v16, v12

    move/from16 v21, v13

    .line 2524
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v0

    .line 2525
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v4

    .line 2526
    new-array v7, v0, [I

    const/4 v8, 0x0

    :goto_1a
    if-ge v8, v0, :cond_27

    if-lez v8, :cond_26

    add-int/lit8 v9, v8, -0x1

    .line 2529
    aget v9, v7, v9

    goto :goto_1b

    :cond_26
    const/4 v9, 0x0

    :goto_1b
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v10

    add-int/lit8 v10, v10, 0x1

    sub-int/2addr v9, v10

    aput v9, v7, v8

    .line 2530
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܳ()V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1a

    .line 2532
    :cond_27
    new-array v8, v4, [I

    const/4 v9, 0x0

    :goto_1c
    if-ge v9, v4, :cond_29

    if-lez v9, :cond_28

    add-int/lit8 v10, v9, -0x1

    .line 2535
    aget v10, v8, v10

    goto :goto_1d

    :cond_28
    const/4 v10, 0x0

    :goto_1d
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v11

    add-int/lit8 v11, v11, 0x1

    add-int/2addr v11, v10

    aput v11, v8, v9

    .line 2536
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܳ()V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1c

    :cond_29
    move v15, v0

    move v14, v4

    move-object v4, v7

    move-object v7, v8

    :goto_1e
    add-int/lit8 v1, v1, 0x1

    move/from16 v0, p2

    move/from16 v12, v16

    move/from16 v10, v18

    move/from16 v11, v19

    move-object/from16 v9, v20

    move/from16 v13, v21

    move/from16 v8, v23

    goto/16 :goto_13

    :cond_2a
    move/from16 v23, v8

    move-object/from16 v20, v9

    move/from16 v18, v10

    move/from16 v19, v11

    move/from16 v16, v12

    move/from16 v21, v13

    .line 1654
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 1655
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    move-result v0

    const/4 v1, 0x0

    :goto_1f
    if-ge v1, v0, :cond_2b

    add-int/lit8 v4, v5, 0x5

    .line 1659
    invoke-virtual {v6, v4}, Ll/ᩳ۠֫;->ܽ(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1f

    :cond_2b
    const/4 v0, 0x2

    .line 1662
    invoke-virtual {v6, v0}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 1667
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_36

    .line 1668
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2e

    const/16 v0, 0x8

    .line 1669
    invoke-virtual {v6, v0}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v0

    const/16 v4, 0xff

    if-ne v0, v4, :cond_2c

    const/16 v0, 0x10

    .line 1671
    invoke-virtual {v6, v0}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v4

    .line 1672
    invoke-virtual {v6, v0}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v0

    if-eqz v4, :cond_2e

    if-eqz v0, :cond_2e

    int-to-float v1, v4

    int-to-float v0, v0

    div-float/2addr v1, v0

    goto :goto_20

    :cond_2c
    const/16 v4, 0x11

    if-ge v0, v4, :cond_2d

    .line 1677
    sget-object v1, Ll/ܽ۠֫;->֫:[F

    aget v1, v1, v0

    goto :goto_20

    :cond_2d
    const-string v4, "Unexpected aspect_ratio_idc value: "

    .line 0
    invoke-static {v0, v4}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    .line 1682
    :cond_2e
    :goto_20
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 1683
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܳ()V

    .line 1685
    :cond_2f
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_32

    const/4 v0, 0x3

    .line 1686
    invoke-virtual {v6, v0}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 1688
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_30

    const/4 v0, 0x1

    goto :goto_21

    :cond_30
    const/4 v0, 0x2

    .line 1689
    :goto_21
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_31

    const/16 v2, 0x8

    .line 1690
    invoke-virtual {v6, v2}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v3

    .line 1691
    invoke-virtual {v6, v2}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v4

    .line 1692
    invoke-virtual {v6, v2}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 1694
    invoke-static {v3}, Ll/᩷ᩴ֫;->ᩳ(I)I

    move-result v2

    .line 1696
    invoke-static {v4}, Ll/᩷ᩴ֫;->ܿ(I)I

    move-result v3

    goto :goto_22

    :cond_31
    const/4 v2, -0x1

    const/4 v3, -0x1

    goto :goto_22

    :cond_32
    if-eqz v3, :cond_33

    .line 1698
    iget-object v0, v3, Ll/۟֨֫;->ᩳ:Ll/ܰ֨֫;

    if-eqz v0, :cond_33

    iget-object v3, v0, Ll/ܰ֨֫;->ۧ:Ll/ܳ۬ܺ;

    .line 1699
    iget-object v0, v0, Ll/ܰ֨֫;->֫:[I

    aget v0, v0, v2

    .line 1700
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-le v2, v0, :cond_33

    .line 1702
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺֨֫;

    .line 1703
    iget v2, v0, Ll/᩺֨֫;->ۧ:I

    .line 1704
    iget v3, v0, Ll/᩺֨֫;->֫:I

    .line 1705
    iget v0, v0, Ll/᩺֨֫;->ܽ:I

    move/from16 v26, v3

    move v3, v0

    move/from16 v0, v26

    goto :goto_22

    :cond_33
    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v0, -0x1

    .line 1708
    :goto_22
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_34

    .line 1709
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    .line 1710
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܿ()I

    .line 1712
    :cond_34
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܳ()V

    .line 1713
    invoke-virtual {v6}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_35

    mul-int/lit8 v13, v21, 0x2

    goto :goto_23

    :cond_35
    move/from16 v13, v21

    :goto_23
    move/from16 v26, v2

    move v2, v0

    move/from16 v0, v26

    goto :goto_24

    :cond_36
    const/4 v0, -0x1

    const/4 v1, -0x1

    const/4 v2, -0x1

    const/high16 v3, 0x3f800000    # 1.0f

    move/from16 v13, v21

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, -0x1

    const/4 v3, -0x1

    .line 1720
    :goto_24
    new-instance v4, Ll/ۨ֨֫;

    move-object v7, v4

    move/from16 v8, v23

    move-object/from16 v9, v20

    move/from16 v10, v18

    move/from16 v11, v19

    move/from16 v12, v16

    move/from16 v14, p1

    move/from16 v15, p0

    move/from16 v16, v1

    move/from16 v18, v0

    move/from16 v19, v2

    move/from16 v20, v3

    invoke-direct/range {v7 .. v20}, Ll/ۨ֨֫;-><init>(ILl/ۗ֨֫;IIIIIIFIIII)V

    return-object v4
.end method

.method public static ֫([Z)V
    .locals 2

    const/4 v0, 0x0

    .line 1963
    aput-boolean v0, p0, v0

    const/4 v1, 0x1

    .line 1964
    aput-boolean v0, p0, v1

    const/4 v1, 0x2

    .line 1965
    aput-boolean v0, p0, v1

    return-void
.end method

.method public static ֫([BILl/۠ᩴ֫;)Z
    .locals 5

    .line 728
    iget-object v0, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v1, "video/avc"

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x4

    const/16 v2, 0xe

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    .line 729
    aget-byte p0, p0, v1

    and-int/lit8 p1, p0, 0x60

    shr-int/lit8 p1, p1, 0x5

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    and-int/lit8 p0, p0, 0x1f

    if-ne p0, v3, :cond_1

    goto :goto_0

    :cond_1
    const/16 p1, 0x9

    if-ne p0, p1, :cond_2

    goto :goto_0

    :cond_2
    if-ne p0, v2, :cond_5

    goto :goto_0

    .line 731
    :cond_3
    iget-object v0, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v4, "video/hevc"

    invoke-static {v0, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 739
    new-instance v0, Ll/ᩳ۠֫;

    add-int/2addr p1, v1

    invoke-direct {v0, p0, v1, p1}, Ll/ᩳ۠֫;-><init>([BII)V

    .line 740
    invoke-static {v0}, Ll/ܽ۠֫;->֫(Ll/ᩳ۠֫;)Ll/ۙ֨֫;

    move-result-object p0

    .line 741
    iget p1, p0, Ll/ۙ֨֫;->ۧ:I

    const/16 v0, 0x23

    if-ne p1, v0, :cond_4

    goto :goto_0

    :cond_4
    if-gt p1, v2, :cond_5

    .line 745
    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_5

    .line 746
    iget p0, p0, Ll/ۙ֨֫;->ܽ:I

    iget p1, p2, Ll/۠ᩴ֫;->۫:I

    sub-int/2addr p1, v3

    if-ne p0, p1, :cond_5

    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_5
    :goto_1
    return v3
.end method

.method public static ۧ(II[B)Ll/۟֨֫;
    .locals 31

    .line 994
    new-instance v0, Ll/ᩳ۠֫;

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct {v0, v3, v1, v2}, Ll/ᩳ۠֫;-><init>([BII)V

    .line 995
    invoke-static {v0}, Ll/ܽ۠֫;->֫(Ll/ᩳ۠֫;)Ll/ۙ֨֫;

    const/4 v1, 0x4

    .line 1020
    invoke-virtual {v0, v1}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 1021
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v1

    .line 1022
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v2

    const/4 v3, 0x6

    .line 1023
    invoke-virtual {v0, v3}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v4

    add-int/lit8 v5, v4, 0x1

    const/4 v6, 0x3

    .line 1025
    invoke-virtual {v0, v6}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v6

    const/16 v7, 0x11

    .line 1026
    invoke-virtual {v0, v7}, Ll/ᩳ۠֫;->ܽ(I)V

    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 1029
    invoke-static {v0, v7, v6, v8}, Ll/ܽ۠֫;->֫(Ll/ᩳ۠֫;ZILl/ۗ֨֫;)Ll/ۗ֨֫;

    move-result-object v9

    .line 1036
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_0

    const/4 v10, 0x0

    goto :goto_0

    :cond_0
    move v10, v6

    :goto_0
    if-gt v10, v6, :cond_1

    .line 1037
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    .line 1038
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    .line 1039
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 1042
    :cond_1
    invoke-virtual {v0, v3}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v3

    .line 1043
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v10

    add-int/2addr v10, v7

    .line 1045
    invoke-static {v9}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v12

    .line 1046
    new-instance v14, Ll/۬֨֫;

    new-array v15, v7, [I

    invoke-direct {v14, v12, v15}, Ll/۬֨֫;-><init>(Ljava/util/List;[I)V

    const/4 v12, 0x2

    if-lt v5, v12, :cond_2

    if-lt v10, v12, :cond_2

    const/4 v15, 0x1

    goto :goto_1

    :cond_2
    const/4 v15, 0x0

    :goto_1
    if-eqz v1, :cond_3

    if-eqz v2, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    add-int/lit8 v2, v3, 0x1

    if-lt v2, v5, :cond_4

    const/16 v16, 0x1

    goto :goto_3

    :cond_4
    const/16 v16, 0x0

    :goto_3
    if-eqz v15, :cond_83

    if-eqz v1, :cond_83

    if-nez v16, :cond_5

    goto/16 :goto_5d

    :cond_5
    new-array v1, v12, [I

    aput v2, v1, v7

    aput v10, v1, v11

    .line 1069
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v7, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[I

    const/4 v8, 0x1

    .line 1070
    new-array v12, v10, [I

    .line 1071
    new-array v15, v10, [I

    .line 1073
    aget-object v16, v1, v11

    aput v11, v16, v11

    .line 1074
    aput v8, v12, v11

    .line 1075
    aput v11, v15, v11

    const/4 v11, 0x1

    :goto_4
    if-ge v11, v10, :cond_8

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v13, 0x0

    :goto_5
    if-gt v13, v3, :cond_7

    .line 1080
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v16

    if-eqz v16, :cond_6

    .line 1081
    aget-object v16, v1, v11

    add-int/lit8 v18, v17, 0x1

    aput v13, v16, v17

    .line 1082
    aput v13, v15, v11

    move/from16 v17, v18

    .line 1084
    :cond_6
    aput v17, v12, v11

    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_7
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 1088
    :cond_8
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v11

    if-eqz v11, :cond_17

    const/16 v11, 0x40

    .line 1089
    invoke-virtual {v0, v11}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 1090
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v11

    if-eqz v11, :cond_9

    .line 1091
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    .line 1093
    :cond_9
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v11

    const/4 v13, 0x0

    :goto_6
    if-ge v13, v11, :cond_17

    .line 1095
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    if-eqz v13, :cond_b

    .line 1097
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v16

    if-eqz v16, :cond_a

    goto :goto_7

    :cond_a
    const/16 v16, 0x0

    const/16 v17, 0x0

    goto :goto_8

    .line 2058
    :cond_b
    :goto_7
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v16

    .line 2059
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v17

    if-nez v16, :cond_d

    if-eqz v17, :cond_c

    goto :goto_9

    :cond_c
    :goto_8
    const/16 v18, 0x0

    goto :goto_a

    .line 2061
    :cond_d
    :goto_9
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v18

    if-eqz v18, :cond_e

    const/16 v8, 0x13

    .line 2065
    invoke-virtual {v0, v8}, Ll/ᩳ۠֫;->ܽ(I)V

    :cond_e
    const/16 v8, 0x8

    .line 2067
    invoke-virtual {v0, v8}, Ll/ᩳ۠֫;->ܽ(I)V

    if-eqz v18, :cond_f

    const/4 v8, 0x4

    .line 2069
    invoke-virtual {v0, v8}, Ll/ᩳ۠֫;->ܽ(I)V

    :cond_f
    const/16 v8, 0xf

    .line 2073
    invoke-virtual {v0, v8}, Ll/ᩳ۠֫;->ܽ(I)V

    :goto_a
    const/4 v8, 0x0

    :goto_b
    if-gt v8, v6, :cond_16

    .line 2077
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v19

    if-nez v19, :cond_10

    .line 2082
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v19

    :cond_10
    if-eqz v19, :cond_11

    .line 2085
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    const/16 v19, 0x0

    goto :goto_c

    .line 2087
    :cond_11
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v19

    :goto_c
    if-nez v19, :cond_12

    .line 2090
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v19

    move/from16 p2, v11

    move/from16 v11, v19

    goto :goto_d

    :cond_12
    const/16 v19, 0x0

    move/from16 p2, v11

    const/4 v11, 0x0

    :goto_d
    move-object/from16 v19, v15

    add-int v15, v16, v17

    const/16 v20, 0x0

    move-object/from16 v21, v1

    const/4 v1, 0x0

    :goto_e
    if-ge v1, v15, :cond_15

    const/16 v20, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    :goto_f
    if-gt v15, v11, :cond_14

    .line 2097
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    .line 2098
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    if-eqz v18, :cond_13

    .line 2100
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    .line 2101
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    .line 2103
    :cond_13
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܳ()V

    add-int/lit8 v15, v15, 0x1

    goto :goto_f

    :cond_14
    add-int/lit8 v1, v1, 0x1

    move/from16 v15, v22

    goto :goto_e

    :cond_15
    add-int/lit8 v8, v8, 0x1

    move/from16 v11, p2

    move-object/from16 v15, v19

    move-object/from16 v1, v21

    goto :goto_b

    :cond_16
    move-object/from16 v21, v1

    move/from16 p2, v11

    move-object/from16 v19, v15

    add-int/lit8 v13, v13, 0x1

    const/4 v8, 0x1

    goto/16 :goto_6

    :cond_17
    move-object/from16 v21, v1

    move-object/from16 v19, v15

    .line 1102
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v1

    if-nez v1, :cond_18

    .line 1104
    new-instance v0, Ll/۟֨֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v14, v1, v1}, Ll/۟֨֫;-><init>(Ljava/util/List;Ll/۬֨֫;Ll/ۤ֨֫;Ll/ܰ֨֫;)V

    return-object v0

    .line 1112
    :cond_18
    invoke-virtual {v0}, Ll/ᩳ۠֫;->֫()V

    const/4 v1, 0x0

    .line 1116
    invoke-static {v0, v1, v6, v9}, Ll/ܽ۠֫;->֫(Ll/ᩳ۠֫;ZILl/ۗ֨֫;)Ll/ۗ֨֫;

    move-result-object v1

    .line 1119
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v8

    const/16 v11, 0x10

    new-array v13, v11, [Z

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 p2, v1

    const/4 v1, 0x0

    :goto_10
    if-ge v1, v11, :cond_1a

    .line 1123
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v16

    aput-boolean v16, v13, v1

    if-eqz v16, :cond_19

    add-int/lit8 v15, v15, 0x1

    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_1a
    if-eqz v15, :cond_82

    const/4 v1, 0x1

    .line 1132
    aget-boolean v11, v13, v1

    if-nez v11, :cond_1b

    goto/16 :goto_5c

    .line 1141
    :cond_1b
    new-array v1, v15, [I

    const/4 v11, 0x0

    move-object/from16 v16, v9

    :goto_11
    sub-int v9, v15, v8

    if-ge v11, v9, :cond_1c

    const/4 v9, 0x3

    .line 1143
    invoke-virtual {v0, v9}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v9

    aput v9, v1, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_11

    :cond_1c
    add-int/lit8 v9, v15, 0x1

    .line 1145
    new-array v9, v9, [I

    if-eqz v8, :cond_1f

    const/4 v11, 0x1

    :goto_12
    if-ge v11, v15, :cond_1e

    const/16 v17, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    :goto_13
    if-ge v12, v11, :cond_1d

    .line 1149
    aget v17, v9, v11

    aget v20, v1, v12

    add-int/lit8 v20, v20, 0x1

    add-int v20, v20, v17

    aput v20, v9, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_13

    :cond_1d
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v12, v18

    goto :goto_12

    :cond_1e
    move-object/from16 v18, v12

    const/4 v11, 0x6

    .line 1152
    aput v11, v9, v15

    goto :goto_14

    :cond_1f
    move-object/from16 v18, v12

    :goto_14
    const/4 v11, 0x2

    new-array v11, v11, [I

    const/4 v12, 0x1

    aput v15, v11, v12

    const/4 v12, 0x0

    aput v5, v11, v12

    .line 1155
    invoke-static {v7, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [[I

    .line 1158
    new-array v11, v5, [I

    .line 1159
    aput v12, v11, v12

    .line 1160
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v12

    const/16 v17, 0x1

    move/from16 p0, v6

    const/4 v6, 0x1

    :goto_15
    if-ge v6, v5, :cond_24

    if-eqz v12, :cond_20

    move/from16 v17, v12

    const/4 v12, 0x6

    .line 1163
    invoke-virtual {v0, v12}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v12

    aput v12, v11, v6

    goto :goto_16

    :cond_20
    move/from16 v17, v12

    .line 1165
    aput v6, v11, v6

    :goto_16
    if-nez v8, :cond_22

    const/4 v12, 0x0

    :goto_17
    if-ge v12, v15, :cond_21

    .line 1169
    aget-object v20, v7, v6

    aget v22, v1, v12

    move-object/from16 v23, v1

    add-int/lit8 v1, v22, 0x1

    invoke-virtual {v0, v1}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v1

    aput v1, v20, v12

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, v23

    goto :goto_17

    :cond_21
    move-object/from16 v23, v1

    goto :goto_19

    :cond_22
    move-object/from16 v23, v1

    const/4 v1, 0x0

    :goto_18
    if-ge v1, v15, :cond_23

    .line 1173
    aget-object v12, v7, v6

    aget v20, v11, v6

    add-int/lit8 v22, v1, 0x1

    aget v24, v9, v22

    const/16 v25, 0x1

    shl-int v24, v25, v24

    add-int/lit8 v24, v24, -0x1

    and-int v20, v20, v24

    aget v24, v9, v1

    shr-int v20, v20, v24

    aput v20, v12, v1

    move/from16 v1, v22

    goto :goto_18

    :cond_23
    :goto_19
    const/16 v25, 0x1

    add-int/lit8 v6, v6, 0x1

    move/from16 v12, v17

    move-object/from16 v1, v23

    goto :goto_15

    .line 1180
    :cond_24
    new-array v1, v2, [I

    const/4 v6, 0x1

    const/4 v8, 0x0

    :goto_1a
    const/4 v9, -0x1

    if-ge v8, v5, :cond_2b

    .line 1183
    aget v12, v11, v8

    aput v9, v1, v12

    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_1b
    const/16 v15, 0x10

    if-ge v9, v15, :cond_27

    .line 1188
    aget-boolean v15, v13, v9

    if-eqz v15, :cond_26

    const/4 v15, 0x1

    if-ne v9, v15, :cond_25

    .line 1194
    aget v15, v11, v8

    aget-object v17, v7, v8

    aget v17, v17, v12

    aput v17, v1, v15

    :cond_25
    add-int/lit8 v12, v12, 0x1

    :cond_26
    add-int/lit8 v9, v9, 0x1

    goto :goto_1b

    :cond_27
    if-lez v8, :cond_2a

    const/4 v9, 0x0

    :goto_1c
    if-ge v9, v8, :cond_29

    .line 1202
    aget v12, v11, v8

    aget v12, v1, v12

    aget v15, v11, v9

    aget v15, v1, v15

    if-ne v12, v15, :cond_28

    const/4 v9, 0x0

    goto :goto_1d

    :cond_28
    add-int/lit8 v9, v9, 0x1

    goto :goto_1c

    :cond_29
    const/4 v9, 0x1

    :goto_1d
    if-eqz v9, :cond_2a

    add-int/lit8 v6, v6, 0x1

    :cond_2a
    add-int/lit8 v8, v8, 0x1

    goto :goto_1a

    :cond_2b
    const/4 v7, 0x4

    .line 1213
    invoke-virtual {v0, v7}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v7

    const/4 v8, 0x2

    if-lt v6, v8, :cond_81

    if-nez v7, :cond_2c

    goto/16 :goto_5b

    .line 1223
    :cond_2c
    new-array v8, v6, [I

    const/4 v9, 0x0

    :goto_1e
    if-ge v9, v6, :cond_2d

    .line 1225
    invoke-virtual {v0, v7}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v12

    aput v12, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_1e

    .line 1228
    :cond_2d
    new-array v7, v2, [I

    const/4 v9, 0x0

    :goto_1f
    if-ge v9, v5, :cond_2e

    .line 1230
    aget v12, v11, v9

    invoke-static {v12, v3}, Ljava/lang/Math;->min(II)I

    move-result v12

    aput v9, v7, v12

    add-int/lit8 v9, v9, 0x1

    goto :goto_1f

    .line 726
    :cond_2e
    new-instance v9, Ll/֫۬ܺ;

    invoke-direct {v9}, Ll/֫۬ܺ;-><init>()V

    const/4 v12, 0x0

    :goto_20
    if-gt v12, v3, :cond_30

    .line 1234
    aget v13, v1, v12

    add-int/lit8 v15, v6, -0x1

    invoke-static {v13, v15}, Ljava/lang/Math;->min(II)I

    move-result v13

    if-ltz v13, :cond_2f

    .line 1235
    aget v13, v8, v13

    goto :goto_21

    :cond_2f
    const/4 v13, -0x1

    .line 1236
    :goto_21
    new-instance v15, Ll/᩶֨֫;

    move-object/from16 v17, v1

    aget v1, v7, v12

    invoke-direct {v15, v1, v13}, Ll/᩶֨֫;-><init>(II)V

    invoke-virtual {v9, v15}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, v17

    goto :goto_20

    .line 1238
    :cond_30
    invoke-virtual {v9}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v1

    const/4 v6, 0x0

    .line 1240
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩶֨֫;

    iget v6, v6, Ll/᩶֨֫;->ۧ:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_31

    .line 1242
    new-instance v0, Ll/۟֨֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v14, v1, v1}, Ll/۟֨֫;-><init>(Ljava/util/List;Ll/۬֨֫;Ll/ۤ֨֫;Ll/ܰ֨֫;)V

    return-object v0

    :cond_31
    const/4 v6, 0x1

    :goto_22
    if-gt v6, v3, :cond_33

    .line 1251
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩶֨֫;

    iget v8, v8, Ll/᩶֨֫;->ۧ:I

    if-eq v8, v7, :cond_32

    goto :goto_23

    :cond_32
    add-int/lit8 v6, v6, 0x1

    goto :goto_22

    :cond_33
    const/4 v6, -0x1

    :goto_23
    if-ne v6, v7, :cond_34

    .line 1258
    new-instance v0, Ll/۟֨֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v14, v1, v1}, Ll/۟֨֫;-><init>(Ljava/util/List;Ll/۬֨֫;Ll/ۤ֨֫;Ll/ܰ֨֫;)V

    return-object v0

    :cond_34
    const/4 v3, 0x2

    new-array v7, v3, [I

    const/4 v8, 0x1

    aput v5, v7, v8

    const/4 v9, 0x0

    aput v5, v7, v9

    .line 1267
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v12, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [[Z

    new-array v3, v3, [I

    aput v5, v3, v8

    aput v5, v3, v9

    .line 1268
    invoke-static {v12, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[Z

    :goto_24
    if-ge v8, v5, :cond_36

    const/4 v9, 0x0

    :goto_25
    if-ge v9, v8, :cond_35

    .line 1271
    aget-object v13, v7, v8

    aget-object v15, v3, v8

    .line 1272
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v17

    aput-boolean v17, v15, v9

    aput-boolean v17, v13, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_25

    :cond_35
    add-int/lit8 v8, v8, 0x1

    goto :goto_24

    :cond_36
    const/4 v8, 0x1

    :goto_26
    if-ge v8, v5, :cond_3a

    const/4 v9, 0x0

    :goto_27
    if-ge v9, v4, :cond_39

    const/4 v13, 0x0

    :goto_28
    if-ge v13, v8, :cond_38

    .line 1278
    aget-object v15, v3, v8

    aget-boolean v17, v15, v13

    if-eqz v17, :cond_37

    aget-object v17, v3, v13

    aget-boolean v17, v17, v9

    if-eqz v17, :cond_37

    const/4 v13, 0x1

    .line 1279
    aput-boolean v13, v15, v9

    goto :goto_29

    :cond_37
    add-int/lit8 v13, v13, 0x1

    goto :goto_28

    :cond_38
    :goto_29
    add-int/lit8 v9, v9, 0x1

    goto :goto_27

    :cond_39
    add-int/lit8 v8, v8, 0x1

    goto :goto_26

    .line 1287
    :cond_3a
    new-array v8, v2, [I

    const/4 v9, 0x0

    :goto_2a
    if-ge v9, v5, :cond_3c

    const/4 v13, 0x0

    const/4 v15, 0x0

    :goto_2b
    if-ge v13, v9, :cond_3b

    .line 1291
    aget-object v17, v7, v9

    aget-boolean v17, v17, v13

    add-int v15, v15, v17

    add-int/lit8 v13, v13, 0x1

    goto :goto_2b

    .line 1293
    :cond_3b
    aget v13, v11, v9

    aput v15, v8, v13

    add-int/lit8 v9, v9, 0x1

    goto :goto_2a

    :cond_3c
    const/4 v9, 0x0

    const/4 v13, 0x0

    :goto_2c
    if-ge v9, v5, :cond_3e

    .line 1298
    aget v15, v11, v9

    aget v15, v8, v15

    if-nez v15, :cond_3d

    add-int/lit8 v13, v13, 0x1

    :cond_3d
    add-int/lit8 v9, v9, 0x1

    goto :goto_2c

    :cond_3e
    const/4 v9, 0x1

    if-le v13, v9, :cond_3f

    .line 1304
    new-instance v0, Ll/۟֨֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v14, v1, v1}, Ll/۟֨֫;-><init>(Ljava/util/List;Ll/۬֨֫;Ll/ۤ֨֫;Ll/ܰ֨֫;)V

    return-object v0

    .line 1314
    :cond_3f
    new-array v9, v5, [I

    .line 1315
    new-array v13, v10, [I

    .line 1316
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v15

    if-eqz v15, :cond_41

    const/4 v15, 0x0

    :goto_2d
    move-object/from16 v17, v11

    if-ge v15, v5, :cond_40

    const/4 v11, 0x3

    .line 1318
    invoke-virtual {v0, v11}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v11

    aput v11, v9, v15

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v11, v17

    goto :goto_2d

    :cond_40
    move/from16 v15, p0

    goto :goto_2e

    :cond_41
    move-object/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v15, p0

    .line 1321
    invoke-static {v9, v11, v5, v15}, Ljava/util/Arrays;->fill([IIII)V

    :goto_2e
    const/4 v11, 0x0

    :goto_2f
    if-ge v11, v10, :cond_43

    const/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 p0, v3

    move/from16 v20, v6

    move-object/from16 v23, v8

    const/4 v3, 0x0

    const/4 v8, 0x0

    .line 1325
    :goto_30
    aget v6, v18, v11

    if-ge v8, v6, :cond_42

    .line 1326
    aget-object v6, v21, v11

    aget v6, v6, v8

    .line 1330
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩶֨֫;

    iget v6, v6, Ll/᩶֨֫;->֫:I

    aget v6, v9, v6

    .line 1328
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v8, v8, 0x1

    goto :goto_30

    :cond_42
    add-int/lit8 v3, v3, 0x1

    .line 1332
    aput v3, v13, v11

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v3, p0

    move/from16 v6, v20

    move-object/from16 v8, v23

    goto :goto_2f

    :cond_43
    move-object/from16 p0, v3

    move/from16 v20, v6

    move-object/from16 v23, v8

    .line 1335
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_46

    const/4 v3, 0x0

    :goto_31
    if-ge v3, v4, :cond_46

    add-int/lit8 v6, v3, 0x1

    move v8, v6

    :goto_32
    if-ge v8, v5, :cond_45

    .line 1338
    aget-object v9, v7, v8

    aget-boolean v9, v9, v3

    if-eqz v9, :cond_44

    const/4 v9, 0x3

    .line 1339
    invoke-virtual {v0, v9}, Ll/ᩳ۠֫;->ܽ(I)V

    :cond_44
    add-int/lit8 v8, v8, 0x1

    goto :goto_32

    :cond_45
    move v3, v6

    goto :goto_31

    .line 1344
    :cond_46
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܳ()V

    .line 1347
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    .line 726
    new-instance v6, Ll/֫۬ܺ;

    invoke-direct {v6}, Ll/֫۬ܺ;-><init>()V

    move-object/from16 v8, v16

    .line 1349
    invoke-virtual {v6, v8}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    if-le v3, v4, :cond_47

    move-object/from16 v4, p2

    .line 1351
    invoke-virtual {v6, v4}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    const/4 v8, 0x2

    :goto_33
    if-ge v8, v3, :cond_47

    .line 1357
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v9

    .line 1355
    invoke-static {v0, v9, v15, v4}, Ll/ܽ۠֫;->֫(Ll/ᩳ۠֫;ZILl/ۗ֨֫;)Ll/ۗ֨֫;

    move-result-object v4

    .line 1360
    invoke-virtual {v6, v4}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_33

    .line 1364
    :cond_47
    invoke-virtual {v6}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v4

    .line 1368
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v6

    add-int/2addr v6, v10

    if-le v6, v10, :cond_48

    .line 1372
    new-instance v0, Ll/۟֨֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v14, v1, v1}, Ll/۟֨֫;-><init>(Ljava/util/List;Ll/۬֨֫;Ll/ۤ֨֫;Ll/ܰ֨֫;)V

    return-object v0

    :cond_48
    const/4 v8, 0x2

    .line 1380
    invoke-virtual {v0, v8}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v9

    new-array v8, v8, [I

    const/4 v11, 0x1

    aput v2, v8, v11

    const/4 v11, 0x0

    aput v6, v8, v11

    .line 1382
    invoke-static {v12, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [[Z

    .line 1383
    new-array v11, v6, [I

    .line 1384
    new-array v15, v6, [I

    const/16 v16, 0x0

    move-object/from16 p1, v4

    const/4 v4, 0x0

    const/16 v16, 0x0

    :goto_34
    if-ge v4, v10, :cond_4d

    .line 1386
    aput v16, v11, v4

    .line 1387
    aget v16, v19, v4

    aput v16, v15, v4

    if-nez v9, :cond_49

    move/from16 p2, v10

    .line 1389
    aget-object v10, v8, v4

    move-object/from16 v22, v7

    aget v7, v18, v4

    move-object/from16 v24, v13

    const/4 v13, 0x0

    move/from16 v25, v5

    const/4 v5, 0x1

    invoke-static {v10, v13, v7, v5}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1390
    aget v5, v18, v4

    aput v5, v11, v4

    goto :goto_37

    :cond_49
    move/from16 v25, v5

    move-object/from16 v22, v7

    move/from16 p2, v10

    move-object/from16 v24, v13

    const/4 v5, 0x1

    if-ne v9, v5, :cond_4c

    .line 1392
    aget v5, v19, v4

    const/4 v7, 0x0

    .line 1393
    :goto_35
    aget v10, v18, v4

    if-ge v7, v10, :cond_4b

    .line 1394
    aget-object v10, v8, v4

    aget-object v13, v21, v4

    aget v13, v13, v7

    if-ne v13, v5, :cond_4a

    const/4 v13, 0x1

    goto :goto_36

    :cond_4a
    const/4 v13, 0x0

    :goto_36
    aput-boolean v13, v10, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_35

    :cond_4b
    const/4 v5, 0x1

    .line 1396
    aput v5, v11, v4

    :goto_37
    const/4 v5, 0x0

    goto :goto_38

    :cond_4c
    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 1398
    aget-object v10, v8, v7

    aput-boolean v5, v10, v7

    .line 1399
    aput v5, v11, v7

    :goto_38
    const/16 v16, 0x0

    add-int/lit8 v4, v4, 0x1

    move/from16 v10, p2

    move-object/from16 v7, v22

    move-object/from16 v13, v24

    move/from16 v5, v25

    goto :goto_34

    :cond_4d
    move/from16 v25, v5

    move-object/from16 v22, v7

    move/from16 p2, v10

    move-object/from16 v24, v13

    const/4 v4, 0x1

    .line 1403
    new-array v5, v2, [I

    const/4 v7, 0x2

    new-array v10, v7, [I

    aput v2, v10, v4

    .line 1404
    aput v6, v10, v16

    invoke-static {v12, v10}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[Z

    const/4 v10, 0x0

    :goto_39
    if-ge v4, v6, :cond_5a

    if-ne v9, v7, :cond_4f

    const/4 v7, 0x0

    .line 1409
    :goto_3a
    aget v12, v18, v4

    if-ge v7, v12, :cond_4f

    .line 1410
    aget-object v12, v8, v4

    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v13

    aput-boolean v13, v12, v7

    .line 1411
    aget v12, v11, v4

    aget-object v13, v8, v4

    aget-boolean v13, v13, v7

    add-int/2addr v12, v13

    aput v12, v11, v4

    if-eqz v13, :cond_4e

    .line 1413
    aget-object v12, v21, v4

    aget v12, v12, v7

    aput v12, v15, v4

    :cond_4e
    add-int/lit8 v7, v7, 0x1

    goto :goto_3a

    :cond_4f
    if-nez v10, :cond_51

    .line 1420
    aget-object v7, v21, v4

    const/4 v12, 0x0

    aget v7, v7, v12

    if-nez v7, :cond_51

    aget-object v7, v8, v4

    aget-boolean v7, v7, v12

    if-eqz v7, :cond_51

    const/4 v7, 0x1

    .line 1421
    :goto_3b
    aget v12, v18, v4

    if-ge v7, v12, :cond_51

    .line 1422
    aget-object v12, v21, v4

    aget v12, v12, v7

    move/from16 v13, v20

    if-ne v12, v13, :cond_50

    aget-object v12, v8, v4

    aget-boolean v12, v12, v13

    if-eqz v12, :cond_50

    move v10, v4

    :cond_50
    add-int/lit8 v7, v7, 0x1

    move/from16 v20, v13

    goto :goto_3b

    :cond_51
    move/from16 v13, v20

    const/4 v7, 0x0

    .line 1429
    :goto_3c
    aget v12, v18, v4

    if-ge v7, v12, :cond_58

    const/4 v12, 0x1

    if-le v3, v12, :cond_56

    .line 1431
    aget-object v12, v2, v4

    aget-object v16, v8, v4

    aget-boolean v16, v16, v7

    aput-boolean v16, v12, v7

    move-object/from16 v16, v8

    move v12, v9

    int-to-double v8, v3

    .line 1432
    sget-object v19, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {v8, v9}, Ll/ᩴ᩺ܺ;->ܽ(D)I

    move-result v8

    .line 1433
    aget-object v9, v2, v4

    aget-boolean v9, v9, v7

    if-nez v9, :cond_53

    .line 1434
    aget-object v9, v21, v4

    aget v9, v9, v7

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩶֨֫;

    iget v9, v9, Ll/᩶֨֫;->֫:I

    const/16 v19, 0x0

    move/from16 v20, v3

    const/4 v3, 0x0

    :goto_3d
    if-ge v3, v7, :cond_54

    .line 1436
    aget-object v19, v21, v4

    move/from16 v26, v12

    aget v12, v19, v3

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩶֨֫;

    iget v12, v12, Ll/᩶֨֫;->֫:I

    .line 1437
    aget-object v19, p0, v9

    aget-boolean v12, v19, v12

    if-eqz v12, :cond_52

    .line 1438
    aget-object v3, v2, v4

    const/4 v9, 0x1

    aput-boolean v9, v3, v7

    goto :goto_3e

    :cond_52
    add-int/lit8 v3, v3, 0x1

    move/from16 v12, v26

    goto :goto_3d

    :cond_53
    move/from16 v20, v3

    :cond_54
    move/from16 v26, v12

    .line 1443
    :goto_3e
    aget-object v3, v2, v4

    aget-boolean v3, v3, v7

    if-eqz v3, :cond_57

    if-lez v10, :cond_55

    if-ne v4, v10, :cond_55

    .line 1446
    invoke-virtual {v0, v8}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v3

    aput v3, v5, v7

    goto :goto_3f

    .line 1448
    :cond_55
    invoke-virtual {v0, v8}, Ll/ᩳ۠֫;->ܽ(I)V

    goto :goto_3f

    :cond_56
    move/from16 v20, v3

    move-object/from16 v16, v8

    move/from16 v26, v9

    :cond_57
    :goto_3f
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v8, v16

    move/from16 v3, v20

    move/from16 v9, v26

    goto :goto_3c

    :cond_58
    move/from16 v20, v3

    move-object/from16 v16, v8

    move/from16 v26, v9

    .line 1453
    aget v3, v11, v4

    const/4 v7, 0x1

    if-ne v3, v7, :cond_59

    aget v3, v15, v4

    aget v3, v23, v3

    if-lez v3, :cond_59

    .line 1455
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܳ()V

    :cond_59
    add-int/lit8 v4, v4, 0x1

    const/4 v7, 0x2

    move-object/from16 v8, v16

    move/from16 v3, v20

    move/from16 v9, v26

    move/from16 v20, v13

    goto/16 :goto_39

    :cond_5a
    if-nez v10, :cond_5b

    .line 1461
    new-instance v0, Ll/۟֨֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v14, v1, v1}, Ll/۟֨֫;-><init>(Ljava/util/List;Ll/۬֨֫;Ll/ۤ֨֫;Ll/ܰ֨֫;)V

    return-object v0

    .line 2191
    :cond_5b
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v3

    add-int/lit8 v4, v3, 0x1

    .line 2193
    invoke-static {v4}, Ll/ܳ۬ܺ;->֫(I)Ll/֫۬ܺ;

    move-result-object v7

    move/from16 v8, v25

    .line 2194
    new-array v9, v8, [I

    const/4 v10, 0x0

    :goto_40
    if-ge v10, v4, :cond_62

    const/16 v11, 0x10

    .line 2220
    invoke-virtual {v0, v11}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v12

    .line 2221
    invoke-virtual {v0, v11}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v11

    .line 2225
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v13

    if-eqz v13, :cond_5d

    const/4 v13, 0x2

    .line 2226
    invoke-virtual {v0, v13}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v13

    const/4 v14, 0x3

    if-ne v13, v14, :cond_5c

    .line 2228
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܳ()V

    :cond_5c
    const/4 v14, 0x4

    .line 2230
    invoke-virtual {v0, v14}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v15

    .line 2231
    invoke-virtual {v0, v14}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v14

    move/from16 v28, v14

    move/from16 v27, v15

    goto :goto_41

    :cond_5d
    const/4 v13, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    .line 2233
    :goto_41
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v14

    if-eqz v14, :cond_61

    .line 2234
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v14

    .line 2235
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v15

    .line 2236
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v16

    .line 2237
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v19

    move-object/from16 p0, v1

    const/4 v1, 0x1

    if-eq v13, v1, :cond_5f

    const/4 v1, 0x2

    if-ne v13, v1, :cond_5e

    goto :goto_42

    :cond_5e
    const/4 v1, 0x1

    goto :goto_43

    :cond_5f
    :goto_42
    const/4 v1, 0x2

    :goto_43
    add-int/2addr v14, v15

    mul-int v14, v14, v1

    sub-int/2addr v12, v14

    const/4 v1, 0x1

    if-ne v13, v1, :cond_60

    const/4 v1, 0x2

    goto :goto_44

    :cond_60
    const/4 v1, 0x1

    :goto_44
    add-int v16, v16, v19

    mul-int v16, v16, v1

    sub-int v11, v11, v16

    goto :goto_45

    :cond_61
    move-object/from16 p0, v1

    :goto_45
    move/from16 v30, v11

    move/from16 v29, v12

    .line 2245
    new-instance v1, Ll/۫֨֫;

    move-object/from16 v25, v1

    move/from16 v26, v13

    invoke-direct/range {v25 .. v30}, Ll/۫֨֫;-><init>(IIIII)V

    .line 2197
    invoke-virtual {v7, v1}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p0

    goto :goto_40

    :cond_62
    move-object/from16 p0, v1

    const/4 v1, 0x1

    if-le v4, v1, :cond_63

    .line 2199
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_63

    int-to-double v3, v4

    .line 2200
    sget-object v1, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {v3, v4}, Ll/ᩴ᩺ܺ;->ܽ(D)I

    move-result v1

    const/4 v3, 0x1

    :goto_46
    if-ge v3, v8, :cond_64

    .line 2204
    invoke-virtual {v0, v1}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v4

    aput v4, v9, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_46

    :cond_63
    const/4 v1, 0x1

    :goto_47
    if-ge v1, v8, :cond_64

    .line 2208
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    aput v4, v9, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_47

    .line 2211
    :cond_64
    new-instance v1, Ll/ۤ֨֫;

    invoke-virtual {v7}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v3

    invoke-direct {v1, v3, v9}, Ll/ۤ֨֫;-><init>(Ljava/util/List;[I)V

    const/4 v3, 0x2

    .line 1471
    invoke-virtual {v0, v3}, Ll/ᩳ۠֫;->ܽ(I)V

    const/4 v3, 0x1

    :goto_48
    if-ge v3, v8, :cond_66

    .line 1473
    aget v4, v17, v3

    aget v4, v23, v4

    if-nez v4, :cond_65

    .line 1474
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܳ()V

    :cond_65
    add-int/lit8 v3, v3, 0x1

    goto :goto_48

    :cond_66
    const/4 v3, 0x1

    :goto_49
    if-ge v3, v6, :cond_6d

    .line 2261
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v4

    const/4 v7, 0x0

    .line 2262
    :goto_4a
    aget v9, v24, v3

    if-ge v7, v9, :cond_6c

    if-lez v7, :cond_67

    if-eqz v4, :cond_67

    .line 2265
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v9

    goto :goto_4b

    :cond_67
    if-nez v7, :cond_68

    const/4 v9, 0x1

    goto :goto_4b

    :cond_68
    const/4 v9, 0x0

    :goto_4b
    if-eqz v9, :cond_6b

    const/4 v9, 0x0

    .line 2270
    :goto_4c
    aget v10, v18, v3

    if-ge v9, v10, :cond_6a

    .line 2272
    aget-object v10, v2, v3

    aget-boolean v10, v10, v9

    if-eqz v10, :cond_69

    .line 2273
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    :cond_69
    add-int/lit8 v9, v9, 0x1

    goto :goto_4c

    .line 2276
    :cond_6a
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    .line 2277
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    :cond_6b
    add-int/lit8 v7, v7, 0x1

    goto :goto_4a

    :cond_6c
    add-int/lit8 v3, v3, 0x1

    goto :goto_49

    .line 2290
    :cond_6d
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    .line 2291
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_6e

    .line 2292
    invoke-virtual {v0, v2}, Ll/ᩳ۠֫;->ܽ(I)V

    goto :goto_4f

    :cond_6e
    const/4 v3, 0x1

    :goto_4d
    if-ge v3, v8, :cond_71

    const/4 v4, 0x0

    :goto_4e
    if-ge v4, v3, :cond_70

    .line 2298
    aget-object v6, v22, v3

    aget-boolean v6, v6, v4

    if-eqz v6, :cond_6f

    .line 2299
    invoke-virtual {v0, v2}, Ll/ᩳ۠֫;->ܽ(I)V

    :cond_6f
    add-int/lit8 v4, v4, 0x1

    goto :goto_4e

    :cond_70
    add-int/lit8 v3, v3, 0x1

    goto :goto_4d

    .line 2304
    :cond_71
    :goto_4f
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v2

    const/4 v3, 0x1

    :goto_50
    if-gt v3, v2, :cond_72

    const/16 v4, 0x8

    .line 2306
    invoke-virtual {v0, v4}, Ll/ᩳ۠֫;->ܽ(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_50

    .line 1484
    :cond_72
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_80

    .line 1485
    invoke-virtual {v0}, Ll/ᩳ۠֫;->֫()V

    .line 2319
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v2

    if-nez v2, :cond_73

    .line 2320
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v2

    goto :goto_51

    :cond_73
    const/4 v2, 0x1

    :goto_51
    if-eqz v2, :cond_74

    .line 2323
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܳ()V

    .line 2326
    :cond_74
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v2

    .line 2327
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v3

    if-nez v2, :cond_75

    if-eqz v3, :cond_7b

    :cond_75
    const/4 v4, 0x0

    move/from16 v10, p2

    :goto_52
    if-ge v4, v10, :cond_7b

    const/4 v6, 0x0

    .line 2332
    :goto_53
    aget v7, v24, v4

    if-ge v6, v7, :cond_7a

    if-eqz v2, :cond_76

    .line 2336
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v7

    goto :goto_54

    :cond_76
    const/4 v7, 0x0

    :goto_54
    if-eqz v3, :cond_77

    .line 2339
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v9

    goto :goto_55

    :cond_77
    const/4 v9, 0x0

    :goto_55
    if-eqz v7, :cond_78

    const/16 v7, 0x20

    .line 2342
    invoke-virtual {v0, v7}, Ll/ᩳ۠֫;->ܽ(I)V

    :cond_78
    if-eqz v9, :cond_79

    const/16 v7, 0x12

    .line 2345
    invoke-virtual {v0, v7}, Ll/ᩳ۠֫;->ܽ(I)V

    :cond_79
    add-int/lit8 v6, v6, 0x1

    goto :goto_53

    :cond_7a
    add-int/lit8 v4, v4, 0x1

    goto :goto_52

    .line 2351
    :cond_7b
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_7c

    const/4 v3, 0x4

    .line 2353
    invoke-virtual {v0, v3}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_56

    :cond_7c
    move v3, v8

    .line 2356
    :goto_56
    invoke-static {v3}, Ll/ܳ۬ܺ;->֫(I)Ll/֫۬ܺ;

    move-result-object v4

    .line 2357
    new-array v6, v8, [I

    const/4 v7, 0x0

    :goto_57
    if-ge v7, v3, :cond_7e

    const/4 v9, 0x3

    .line 2378
    invoke-virtual {v0, v9}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 2381
    invoke-virtual {v0}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v9

    if-eqz v9, :cond_7d

    const/4 v9, 0x1

    goto :goto_58

    :cond_7d
    const/4 v9, 0x2

    :goto_58
    const/16 v10, 0x8

    .line 2384
    invoke-virtual {v0, v10}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v11

    invoke-static {v11}, Ll/᩷ᩴ֫;->ᩳ(I)I

    move-result v11

    .line 2388
    invoke-virtual {v0, v10}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v12

    .line 2387
    invoke-static {v12}, Ll/᩷ᩴ֫;->ܿ(I)I

    move-result v12

    .line 2389
    invoke-virtual {v0, v10}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 2391
    new-instance v10, Ll/᩺֨֫;

    invoke-direct {v10, v11, v9, v12}, Ll/᩺֨֫;-><init>(III)V

    .line 2360
    invoke-virtual {v4, v10}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_57

    :cond_7e
    if-eqz v2, :cond_7f

    const/4 v2, 0x1

    if-le v3, v2, :cond_7f

    const/4 v2, 0x0

    :goto_59
    if-ge v2, v8, :cond_7f

    const/4 v3, 0x4

    .line 2366
    invoke-virtual {v0, v3}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v3

    aput v3, v6, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_59

    .line 2369
    :cond_7f
    new-instance v0, Ll/ܰ֨֫;

    invoke-virtual {v4}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v2

    invoke-direct {v0, v2, v6}, Ll/ܰ֨֫;-><init>(Ljava/util/List;[I)V

    goto :goto_5a

    :cond_80
    const/4 v0, 0x0

    .line 1491
    :goto_5a
    new-instance v2, Ll/۟֨֫;

    new-instance v3, Ll/۬֨֫;

    move-object/from16 v4, p1

    invoke-direct {v3, v4, v5}, Ll/۬֨֫;-><init>(Ljava/util/List;[I)V

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v3, v1, v0}, Ll/۟֨֫;-><init>(Ljava/util/List;Ll/۬֨֫;Ll/ۤ֨֫;Ll/ܰ֨֫;)V

    return-object v2

    .line 1216
    :cond_81
    :goto_5b
    new-instance v0, Ll/۟֨֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v14, v1, v1}, Ll/۟֨֫;-><init>(Ljava/util/List;Ll/۬֨֫;Ll/ۤ֨֫;Ll/ܰ֨֫;)V

    return-object v0

    :cond_82
    :goto_5c
    const/4 v0, 0x0

    .line 1133
    new-instance v1, Ll/۟֨֫;

    invoke-direct {v1, v0, v14, v0, v0}, Ll/۟֨֫;-><init>(Ljava/util/List;Ll/۬֨֫;Ll/ۤ֨֫;Ll/ܰ֨֫;)V

    return-object v1

    .line 1060
    :cond_83
    :goto_5d
    new-instance v0, Ll/۟֨֫;

    invoke-direct {v0, v8, v14, v8, v8}, Ll/۟֨֫;-><init>(Ljava/util/List;Ll/۬֨֫;Ll/ۤ֨֫;Ll/ܰ֨֫;)V

    return-object v0
.end method

.method public static ۧ(Ll/ᩳ۠֫;)V
    .locals 2

    .line 2408
    invoke-virtual {p0}, Ll/ᩳ۠֫;->ܿ()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x8

    .line 2409
    invoke-virtual {p0, v1}, Ll/ᩳ۠֫;->ܽ(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2411
    invoke-virtual {p0}, Ll/ᩳ۠֫;->ܿ()I

    .line 2412
    invoke-virtual {p0}, Ll/ᩳ۠֫;->ܿ()I

    .line 2413
    invoke-virtual {p0}, Ll/ᩳ۠֫;->ܳ()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x14

    .line 2419
    invoke-virtual {p0, v0}, Ll/ᩳ۠֫;->ܽ(I)V

    return-void
.end method

.method public static ܽ(II[B)Ll/ۧ۠֫;
    .locals 23

    const/4 v0, 0x1

    add-int/lit8 v1, p0, 0x1

    .line 790
    new-instance v2, Ll/ᩳ۠֫;

    move/from16 v3, p1

    move-object/from16 v4, p2

    invoke-direct {v2, v4, v1, v3}, Ll/ᩳ۠֫;-><init>([BII)V

    const/16 v1, 0x8

    .line 791
    invoke-virtual {v2, v1}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v4

    .line 792
    invoke-virtual {v2, v1}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v5

    .line 793
    invoke-virtual {v2, v1}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v6

    .line 794
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v7

    const/16 v1, 0x56

    const/16 v3, 0x2c

    const/16 v8, 0xf4

    const/16 v9, 0x7a

    const/16 v10, 0x6e

    const/4 v11, 0x3

    const/16 v12, 0x64

    if-eq v4, v12, :cond_1

    if-eq v4, v10, :cond_1

    if-eq v4, v9, :cond_1

    if-eq v4, v8, :cond_1

    if-eq v4, v3, :cond_1

    const/16 v3, 0x53

    if-eq v4, v3, :cond_1

    if-eq v4, v1, :cond_1

    const/16 v1, 0x76

    if-eq v4, v1, :cond_1

    const/16 v1, 0x80

    if-eq v4, v1, :cond_1

    const/16 v1, 0x8a

    if-ne v4, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    goto :goto_7

    .line 810
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v8

    if-ne v8, v11, :cond_2

    .line 812
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 814
    :goto_1
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v3

    .line 815
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v9

    .line 816
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܳ()V

    .line 817
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v10

    if-eqz v10, :cond_8

    if-eq v8, v11, :cond_3

    const/16 v10, 0x8

    goto :goto_2

    :cond_3
    const/16 v10, 0xc

    :goto_2
    const/4 v12, 0x0

    :goto_3
    if-ge v12, v10, :cond_8

    .line 821
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v13

    if-eqz v13, :cond_7

    const/4 v13, 0x6

    if-ge v12, v13, :cond_4

    const/16 v13, 0x10

    goto :goto_4

    :cond_4
    const/16 v13, 0x40

    :goto_4
    const/4 v14, 0x0

    const/16 v15, 0x8

    const/16 v16, 0x8

    :goto_5
    if-ge v14, v13, :cond_7

    if-eqz v15, :cond_5

    .line 2399
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ᩳ()I

    move-result v15

    add-int v15, v15, v16

    add-int/lit16 v15, v15, 0x100

    .line 2400
    rem-int/lit16 v15, v15, 0x100

    :cond_5
    if-nez v15, :cond_6

    goto :goto_6

    :cond_6
    move/from16 v16, v15

    :goto_6
    add-int/lit8 v14, v14, 0x1

    goto :goto_5

    :cond_7
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_8
    move v13, v1

    move v1, v3

    move v12, v9

    .line 829
    :goto_7
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v3

    add-int/lit8 v15, v3, 0x4

    .line 830
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v14

    if-nez v14, :cond_9

    .line 835
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v3

    add-int/lit8 v3, v3, 0x4

    move/from16 p1, v1

    goto :goto_9

    :cond_9
    if-ne v14, v0, :cond_b

    .line 837
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v3

    .line 838
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ᩳ()I

    .line 839
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ᩳ()I

    .line 840
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v9

    int-to-long v9, v9

    const/16 v16, 0x0

    move/from16 p1, v1

    const/4 v11, 0x0

    :goto_8
    int-to-long v0, v11

    cmp-long v17, v0, v9

    if-gez v17, :cond_a

    .line 842
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_a
    const/4 v0, 0x0

    move/from16 v18, v3

    const/16 v17, 0x0

    goto :goto_a

    :cond_b
    move/from16 p1, v1

    const/4 v3, 0x0

    :goto_9
    const/4 v0, 0x0

    move/from16 v17, v3

    const/16 v18, 0x0

    .line 845
    :goto_a
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    .line 846
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܳ()V

    .line 848
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 849
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v3

    add-int/2addr v3, v1

    .line 850
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v1

    rsub-int/lit8 v9, v1, 0x2

    mul-int v3, v3, v9

    if-nez v1, :cond_c

    .line 853
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܳ()V

    .line 856
    :cond_c
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܳ()V

    mul-int/lit8 v0, v0, 0x10

    mul-int/lit8 v3, v3, 0x10

    .line 859
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v10

    if-eqz v10, :cond_10

    .line 861
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v10

    .line 862
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v11

    .line 863
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v19

    .line 864
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v20

    if-nez v8, :cond_d

    const/4 v8, 0x1

    move/from16 p0, v14

    goto :goto_d

    :cond_d
    move/from16 p0, v14

    const/4 v14, 0x3

    if-ne v8, v14, :cond_e

    const/4 v14, 0x1

    const/16 p2, 0x1

    goto :goto_b

    :cond_e
    const/4 v14, 0x2

    const/16 p2, 0x2

    :goto_b
    const/4 v14, 0x1

    if-ne v8, v14, :cond_f

    const/4 v8, 0x2

    goto :goto_c

    :cond_f
    const/4 v8, 0x1

    :goto_c
    mul-int v9, v9, v8

    move/from16 v8, p2

    :goto_d
    add-int/2addr v10, v11

    mul-int v10, v10, v8

    sub-int/2addr v0, v10

    add-int v19, v19, v20

    mul-int v19, v19, v9

    sub-int v3, v3, v19

    goto :goto_e

    :cond_10
    move/from16 p0, v14

    :goto_e
    move v8, v0

    move v9, v3

    const/16 v0, 0x2c

    if-eq v4, v0, :cond_11

    const/16 v0, 0x56

    if-eq v4, v0, :cond_11

    const/16 v0, 0x64

    if-eq v4, v0, :cond_11

    const/16 v0, 0x6e

    if-eq v4, v0, :cond_11

    const/16 v0, 0x7a

    if-eq v4, v0, :cond_11

    const/16 v0, 0xf4

    if-ne v4, v0, :cond_12

    :cond_11
    and-int/lit8 v0, v5, 0x10

    if-eqz v0, :cond_12

    const/4 v0, 0x0

    goto :goto_f

    :cond_12
    const/16 v0, 0x10

    .line 897
    :goto_f
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v3

    const/4 v10, -0x1

    const/high16 v11, 0x3f800000    # 1.0f

    if-eqz v3, :cond_21

    .line 899
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_15

    const/16 v3, 0x8

    .line 901
    invoke-virtual {v2, v3}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v3

    const/16 v14, 0xff

    if-ne v3, v14, :cond_13

    const/16 v3, 0x10

    .line 903
    invoke-virtual {v2, v3}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v14

    .line 904
    invoke-virtual {v2, v3}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v3

    if-eqz v14, :cond_15

    if-eqz v3, :cond_15

    int-to-float v11, v14

    int-to-float v3, v3

    div-float/2addr v11, v3

    goto :goto_10

    :cond_13
    const/16 v14, 0x11

    if-ge v3, v14, :cond_14

    .line 909
    sget-object v11, Ll/ܽ۠֫;->֫:[F

    aget v11, v11, v3

    goto :goto_10

    :cond_14
    const-string v14, "Unexpected aspect_ratio_idc value: "

    .line 0
    invoke-static {v3, v14}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    .line 914
    :cond_15
    :goto_10
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_16

    .line 915
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܳ()V

    .line 917
    :cond_16
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_18

    const/4 v3, 0x3

    .line 918
    invoke-virtual {v2, v3}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 920
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_17

    const/4 v3, 0x1

    goto :goto_11

    :cond_17
    const/4 v3, 0x2

    .line 921
    :goto_11
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v14

    if-eqz v14, :cond_19

    const/16 v10, 0x8

    .line 922
    invoke-virtual {v2, v10}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v14

    .line 923
    invoke-virtual {v2, v10}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v16

    .line 924
    invoke-virtual {v2, v10}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 926
    invoke-static {v14}, Ll/᩷ᩴ֫;->ᩳ(I)I

    move-result v10

    .line 928
    invoke-static/range {v16 .. v16}, Ll/᩷ᩴ֫;->ܿ(I)I

    move-result v14

    goto :goto_12

    :cond_18
    const/4 v3, -0x1

    :cond_19
    const/4 v14, -0x1

    .line 931
    :goto_12
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v16

    if-eqz v16, :cond_1a

    .line 932
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    .line 933
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    .line 935
    :cond_1a
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v16

    move/from16 p2, v0

    if-eqz v16, :cond_1b

    const/16 v0, 0x41

    .line 936
    invoke-virtual {v2, v0}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 938
    :cond_1b
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 940
    invoke-static {v2}, Ll/ܽ۠֫;->ۧ(Ll/ᩳ۠֫;)V

    .line 942
    :cond_1c
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v16

    if-eqz v16, :cond_1d

    .line 944
    invoke-static {v2}, Ll/ܽ۠֫;->ۧ(Ll/ᩳ۠֫;)V

    :cond_1d
    if-nez v0, :cond_1e

    if-eqz v16, :cond_1f

    .line 947
    :cond_1e
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܳ()V

    .line 949
    :cond_1f
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܳ()V

    .line 950
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_20

    .line 951
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܳ()V

    .line 952
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    .line 953
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    .line 954
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    .line 955
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    .line 956
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    move-result v0

    .line 957
    invoke-virtual {v2}, Ll/ᩳ۠֫;->ܿ()I

    goto :goto_13

    :cond_20
    move/from16 v0, p2

    :goto_13
    move/from16 v22, v0

    move/from16 v20, v3

    move/from16 v19, v10

    move v10, v11

    move/from16 v21, v14

    goto :goto_14

    :cond_21
    move/from16 p2, v0

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v10, -0x1

    move/from16 v22, p2

    const/high16 v10, 0x3f800000    # 1.0f

    const/16 v19, -0x1

    const/16 v20, -0x1

    const/16 v21, -0x1

    .line 961
    :goto_14
    new-instance v0, Ll/ۧ۠֫;

    move-object v3, v0

    move/from16 v11, p1

    move/from16 v2, p0

    move v14, v1

    move/from16 v16, v2

    invoke-direct/range {v3 .. v22}, Ll/ۧ۠֫;-><init>(IIIIIIFIIZZIIIZIIII)V

    return-object v0
.end method
