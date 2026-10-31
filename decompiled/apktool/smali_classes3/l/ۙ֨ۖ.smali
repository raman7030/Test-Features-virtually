.class public final Ll/ۙ֨ۖ;
.super Ll/᩶֨ۖ;
.source "Y3NK"


# virtual methods
.method public final ֫(IILjava/lang/String;[B)I
    .locals 7

    .line 1017
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p2, p1

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x80

    if-ge v1, v0, :cond_0

    add-int v3, v1, p1

    if-ge v3, p2, :cond_0

    .line 1023
    invoke-virtual {p3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ge v4, v2, :cond_0

    int-to-byte v2, v4

    .line 1024
    aput-byte v2, p4, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-ne v1, v0, :cond_1

    add-int/2addr p1, v0

    return p1

    :cond_1
    add-int/2addr p1, v1

    :goto_1
    if-ge v1, v0, :cond_b

    .line 1031
    invoke-virtual {p3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ge v3, v2, :cond_2

    if-ge p1, p2, :cond_2

    add-int/lit8 v4, p1, 0x1

    int-to-byte v3, v3

    .line 1033
    aput-byte v3, p4, p1

    move p1, v4

    goto/16 :goto_2

    :cond_2
    const/16 v4, 0x800

    if-ge v3, v4, :cond_3

    add-int/lit8 v4, p2, -0x2

    if-gt p1, v4, :cond_3

    add-int/lit8 v4, p1, 0x1

    ushr-int/lit8 v5, v3, 0x6

    or-int/lit16 v5, v5, 0x3c0

    int-to-byte v5, v5

    .line 1035
    aput-byte v5, p4, p1

    add-int/lit8 p1, p1, 0x2

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v2

    int-to-byte v3, v3

    .line 1036
    aput-byte v3, p4, v4

    goto :goto_2

    :cond_3
    const v4, 0xdfff

    const v5, 0xd800

    if-lt v3, v5, :cond_4

    if-ge v4, v3, :cond_5

    :cond_4
    add-int/lit8 v6, p2, -0x3

    if-gt p1, v6, :cond_5

    add-int/lit8 v4, p1, 0x1

    ushr-int/lit8 v5, v3, 0xc

    or-int/lit16 v5, v5, 0x1e0

    int-to-byte v5, v5

    .line 1039
    aput-byte v5, p4, p1

    add-int/lit8 v5, p1, 0x2

    ushr-int/lit8 v6, v3, 0x6

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v2

    int-to-byte v6, v6

    .line 1040
    aput-byte v6, p4, v4

    add-int/lit8 p1, p1, 0x3

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v2

    int-to-byte v3, v3

    .line 1041
    aput-byte v3, p4, v5

    goto :goto_2

    :cond_5
    add-int/lit8 v6, p2, -0x4

    if-gt p1, v6, :cond_8

    add-int/lit8 v4, v1, 0x1

    .line 1046
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v5

    if-eq v4, v5, :cond_7

    invoke-virtual {p3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 1049
    invoke-static {v3, v1}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v1

    add-int/lit8 v3, p1, 0x1

    ushr-int/lit8 v5, v1, 0x12

    or-int/lit16 v5, v5, 0xf0

    int-to-byte v5, v5

    .line 1050
    aput-byte v5, p4, p1

    add-int/lit8 v5, p1, 0x2

    ushr-int/lit8 v6, v1, 0xc

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v2

    int-to-byte v6, v6

    .line 1051
    aput-byte v6, p4, v3

    add-int/lit8 v3, p1, 0x3

    ushr-int/lit8 v6, v1, 0x6

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v2

    int-to-byte v6, v6

    .line 1052
    aput-byte v6, p4, v5

    add-int/lit8 p1, p1, 0x4

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v1, v2

    int-to-byte v1, v1

    .line 1053
    aput-byte v1, p4, v3

    move v1, v4

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_6
    move v1, v4

    .line 1047
    :cond_7
    new-instance p1, Ll/ۗ֨ۖ;

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p1, v1, v0}, Ll/ۗ֨ۖ;-><init>(II)V

    throw p1

    :cond_8
    if-gt v5, v3, :cond_a

    if-gt v3, v4, :cond_a

    add-int/lit8 p2, v1, 0x1

    .line 1058
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p4

    if-eq p2, p4, :cond_9

    invoke-virtual {p3, p2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    invoke-static {v3, p2}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result p2

    if-nez p2, :cond_a

    .line 1059
    :cond_9
    new-instance p1, Ll/ۗ֨ۖ;

    invoke-direct {p1, v1, v0}, Ll/ۗ֨ۖ;-><init>(II)V

    throw p1

    .line 1061
    :cond_a
    new-instance p2, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Failed writing "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p4, " at index "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    return p1
.end method

.method public final ֫(I[BII)I
    .locals 11

    const/4 v0, 0x0

    const/16 v1, -0x13

    const/16 v2, -0x10

    const/16 v3, -0x3e

    const/16 v4, -0x60

    const/16 v5, -0x20

    const/4 v6, -0x1

    const/16 v7, -0x41

    if-eqz p1, :cond_f

    if-lt p3, p4, :cond_0

    return p1

    :cond_0
    int-to-byte v8, p1

    if-ge v8, v5, :cond_3

    if-lt v8, v3, :cond_2

    add-int/lit8 p1, p3, 0x1

    .line 859
    aget-byte p3, p2, p3

    if-le p3, v7, :cond_1

    goto :goto_0

    :cond_1
    move p3, p1

    goto/16 :goto_2

    :cond_2
    :goto_0
    return v6

    :cond_3
    if-ge v8, v2, :cond_9

    shr-int/lit8 p1, p1, 0x8

    not-int p1, p1

    int-to-byte p1, p1

    if-nez p1, :cond_5

    add-int/lit8 p1, p3, 0x1

    .line 870
    aget-byte p3, p2, p3

    if-lt p1, p4, :cond_4

    .line 872
    invoke-static {v8, p3}, Ll/۫֨ۖ;->֫(II)I

    move-result p1

    return p1

    :cond_4
    move v10, p3

    move p3, p1

    move p1, v10

    :cond_5
    if-gt p1, v7, :cond_8

    if-ne v8, v5, :cond_6

    if-lt p1, v4, :cond_8

    :cond_6
    if-ne v8, v1, :cond_7

    if-ge p1, v4, :cond_8

    :cond_7
    add-int/lit8 p1, p3, 0x1

    .line 875
    aget-byte p3, p2, p3

    if-le p3, v7, :cond_1

    :cond_8
    return v6

    :cond_9
    shr-int/lit8 v9, p1, 0x8

    not-int v9, v9

    int-to-byte v9, v9

    if-nez v9, :cond_b

    add-int/lit8 p1, p3, 0x1

    .line 891
    aget-byte v9, p2, p3

    if-lt p1, p4, :cond_a

    .line 893
    invoke-static {v8, v9}, Ll/۫֨ۖ;->֫(II)I

    move-result p1

    return p1

    :cond_a
    const/4 p3, 0x0

    goto :goto_1

    :cond_b
    shr-int/lit8 p1, p1, 0x10

    int-to-byte p1, p1

    move v10, p3

    move p3, p1

    move p1, v10

    :goto_1
    if-nez p3, :cond_d

    add-int/lit8 p3, p1, 0x1

    .line 899
    aget-byte p1, p2, p1

    if-lt p3, p4, :cond_c

    .line 901
    invoke-static {v8, v9, p1}, Ll/۫֨ۖ;->֫(III)I

    move-result p1

    return p1

    :cond_c
    move v10, p3

    move p3, p1

    move p1, v10

    :cond_d
    if-gt v9, v7, :cond_e

    shl-int/lit8 v8, v8, 0x1c

    add-int/lit8 v9, v9, 0x70

    add-int/2addr v9, v8

    shr-int/lit8 v8, v9, 0x1e

    if-nez v8, :cond_e

    if-gt p3, v7, :cond_e

    add-int/lit8 p3, p1, 0x1

    .line 909
    aget-byte p1, p2, p1

    if-le p1, v7, :cond_f

    :cond_e
    return v6

    :cond_f
    :goto_2
    if-ge p3, p4, :cond_10

    .line 1076
    aget-byte p1, p2, p3

    if-ltz p1, :cond_10

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_10
    if-lt p3, p4, :cond_11

    goto :goto_4

    :cond_11
    :goto_3
    if-lt p3, p4, :cond_12

    :goto_4
    return v0

    :cond_12
    add-int/lit8 p1, p3, 0x1

    .line 1093
    aget-byte v8, p2, p3

    if-gez v8, :cond_1b

    if-ge v8, v5, :cond_14

    if-lt p1, p4, :cond_13

    return v8

    :cond_13
    if-lt v8, v3, :cond_1a

    add-int/lit8 p3, p3, 0x2

    .line 1105
    aget-byte p1, p2, p1

    if-le p1, v7, :cond_11

    goto :goto_5

    :cond_14
    if-ge v8, v2, :cond_18

    add-int/lit8 v9, p4, -0x1

    if-lt p1, v9, :cond_15

    .line 1112
    invoke-static {p1, p4, p2}, Ll/۫֨ۖ;->֫(II[B)I

    move-result p1

    return p1

    :cond_15
    add-int/lit8 v9, p3, 0x2

    .line 1114
    aget-byte p1, p2, p1

    if-gt p1, v7, :cond_1a

    if-ne v8, v5, :cond_16

    if-lt p1, v4, :cond_1a

    :cond_16
    if-ne v8, v1, :cond_17

    if-ge p1, v4, :cond_1a

    :cond_17
    add-int/lit8 p3, p3, 0x3

    aget-byte p1, p2, v9

    if-le p1, v7, :cond_11

    goto :goto_5

    :cond_18
    add-int/lit8 v9, p4, -0x2

    if-lt p1, v9, :cond_19

    .line 1127
    invoke-static {p1, p4, p2}, Ll/۫֨ۖ;->֫(II[B)I

    move-result p1

    return p1

    :cond_19
    add-int/lit8 v9, p3, 0x2

    .line 1129
    aget-byte p1, p2, p1

    if-gt p1, v7, :cond_1a

    shl-int/lit8 v8, v8, 0x1c

    add-int/lit8 p1, p1, 0x70

    add-int/2addr p1, v8

    shr-int/lit8 p1, p1, 0x1e

    if-nez p1, :cond_1a

    add-int/lit8 p1, p3, 0x3

    aget-byte v8, p2, v9

    if-gt v8, v7, :cond_1a

    add-int/lit8 p3, p3, 0x4

    aget-byte p1, p2, p1

    if-le p1, v7, :cond_11

    :cond_1a
    :goto_5
    return v6

    :cond_1b
    move p3, p1

    goto :goto_3
.end method

.method public final ֫(II[B)Ljava/lang/String;
    .locals 9

    or-int v0, p1, p2

    .line 936
    array-length v1, p3

    sub-int/2addr v1, p1

    sub-int/2addr v1, p2

    or-int/2addr v0, v1

    const/4 v1, 0x0

    if-ltz v0, :cond_9

    add-int v0, p1, p2

    .line 946
    new-array p2, p2, [C

    const/4 v2, 0x0

    :goto_0
    if-ge p1, v0, :cond_0

    .line 952
    aget-byte v3, p3, p1

    if-ltz v3, :cond_0

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v4, v2, 0x1

    int-to-char v3, v3

    .line 1861
    aput-char v3, p2, v2

    move v2, v4

    goto :goto_0

    :cond_0
    move v8, v2

    :cond_1
    :goto_1
    if-ge p1, v0, :cond_8

    add-int/lit8 v2, p1, 0x1

    .line 961
    aget-byte v3, p3, p1

    if-ltz v3, :cond_2

    add-int/lit8 p1, v8, 0x1

    int-to-char v3, v3

    .line 1861
    aput-char v3, p2, v8

    move v8, p1

    move p1, v2

    :goto_2
    if-ge p1, v0, :cond_1

    .line 967
    aget-byte v2, p3, p1

    if-ltz v2, :cond_1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v3, v8, 0x1

    int-to-char v2, v2

    .line 1861
    aput-char v2, p2, v8

    move v8, v3

    goto :goto_2

    :cond_2
    const/16 v4, -0x20

    if-ge v3, v4, :cond_4

    if-ge v2, v0, :cond_3

    add-int/lit8 p1, p1, 0x2

    .line 978
    aget-byte v2, p3, v2

    add-int/lit8 v4, v8, 0x1

    invoke-static {v3, v2, p2, v8}, Ll/᩹֨ۖ;->֫(BB[CI)V

    move v8, v4

    goto :goto_1

    .line 976
    :cond_3
    invoke-static {}, Ll/֫᩵ۖ;->ᩳ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    :cond_4
    const/16 v4, -0x10

    if-ge v3, v4, :cond_6

    add-int/lit8 v4, v0, -0x1

    if-ge v2, v4, :cond_5

    add-int/lit8 v4, p1, 0x2

    .line 983
    aget-byte v2, p3, v2

    add-int/lit8 p1, p1, 0x3

    aget-byte v4, p3, v4

    add-int/lit8 v5, v8, 0x1

    invoke-static {v3, v2, v4, p2, v8}, Ll/᩹֨ۖ;->֫(BBB[CI)V

    move v8, v5

    goto :goto_1

    .line 981
    :cond_5
    invoke-static {}, Ll/֫᩵ۖ;->ᩳ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    :cond_6
    add-int/lit8 v4, v0, -0x2

    if-ge v2, v4, :cond_7

    add-int/lit8 v4, p1, 0x2

    .line 993
    aget-byte v5, p3, v2

    add-int/lit8 v2, p1, 0x3

    aget-byte v4, p3, v4

    add-int/lit8 p1, p1, 0x4

    aget-byte v6, p3, v2

    move v2, v3

    move v3, v5

    move v5, v6

    move-object v6, p2

    move v7, v8

    invoke-static/range {v2 .. v7}, Ll/᩹֨ۖ;->֫(BBBB[CI)V

    add-int/lit8 v8, v8, 0x2

    goto :goto_1

    .line 991
    :cond_7
    invoke-static {}, Ll/֫᩵ۖ;->ᩳ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 1005
    :cond_8
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p2, v1, v8}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    .line 937
    :cond_9
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    array-length p3, p3

    .line 938
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p3, v2, v1

    const/4 p3, 0x1

    aput-object p1, v2, p3

    const/4 p1, 0x2

    aput-object p2, v2, p1

    const-string p1, "buffer length=%d, index=%d, size=%d"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
    .locals 0

    .line 1012
    invoke-static {p1, p2, p3}, Ll/᩶֨ۖ;->ۧ(Ljava/nio/ByteBuffer;II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
