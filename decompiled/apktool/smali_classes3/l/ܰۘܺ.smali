.class public final Ll/ܰۘܺ;
.super Ljava/lang/Object;
.source "W3YK"


# direct methods
.method public static ֫(C)I
    .locals 2

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x57

    return p0

    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    add-int/lit8 p0, p0, -0x37

    return p0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(I[B)I
    .locals 8

    const/4 v0, 0x3

    const/16 v1, 0xfe

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v5, 0xff

    const/4 v6, 0x4

    if-lt p0, v6, :cond_0

    .line 160
    aget-byte v7, p1, v4

    if-nez v7, :cond_0

    aget-byte v7, p1, v3

    if-nez v7, :cond_0

    aget-byte v7, p1, v2

    and-int/2addr v7, v5

    if-ne v7, v1, :cond_0

    aget-byte v7, p1, v0

    and-int/2addr v7, v5

    if-ne v7, v5, :cond_0

    goto :goto_0

    :cond_0
    if-lt p0, v6, :cond_1

    .line 164
    aget-byte v7, p1, v4

    and-int/2addr v7, v5

    if-ne v7, v5, :cond_1

    aget-byte v7, p1, v3

    and-int/2addr v7, v5

    if-ne v7, v1, :cond_1

    aget-byte v7, p1, v2

    if-nez v7, :cond_1

    aget-byte v7, p1, v0

    if-nez v7, :cond_1

    :goto_0
    return v6

    :cond_1
    if-lt p0, v0, :cond_2

    .line 168
    aget-byte v6, p1, v4

    and-int/2addr v6, v5

    const/16 v7, 0xef

    if-ne v6, v7, :cond_2

    aget-byte v6, p1, v3

    and-int/2addr v6, v5

    const/16 v7, 0xbb

    if-ne v6, v7, :cond_2

    aget-byte v6, p1, v2

    and-int/2addr v6, v5

    const/16 v7, 0xbf

    if-ne v6, v7, :cond_2

    return v0

    :cond_2
    if-lt p0, v2, :cond_5

    .line 172
    aget-byte p0, p1, v4

    and-int/2addr p0, v5

    if-ne p0, v1, :cond_3

    aget-byte v0, p1, v3

    and-int/2addr v0, v5

    if-eq v0, v5, :cond_4

    :cond_3
    if-ne p0, v5, :cond_5

    aget-byte p0, p1, v3

    and-int/2addr p0, v5

    if-ne p0, v1, :cond_5

    :cond_4
    return v2

    :cond_5
    return v4
.end method

.method public static ֫([BIZ)I
    .locals 2

    .line 132
    invoke-static {p1, p0}, Ll/ܰۘܺ;->֫(I[B)I

    move-result v0

    sub-int v0, p1, v0

    const/4 v1, 0x2

    if-gtz v0, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    rem-int/2addr v0, v1

    sub-int/2addr p1, v0

    .line 145
    :goto_0
    invoke-static {p1, p0}, Ll/ܰۘܺ;->֫(I[B)I

    move-result v0

    sub-int v0, p1, v0

    if-ge v0, v1, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v0, p1, -0x2

    if-eqz p2, :cond_2

    .line 151
    aget-byte p2, p0, v0

    and-int/lit16 p2, p2, 0xff

    add-int/lit8 v1, p1, -0x1

    aget-byte p0, p0, v1

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x8

    goto :goto_1

    .line 152
    :cond_2
    aget-byte p2, p0, v0

    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x8

    add-int/lit8 v1, p1, -0x1

    aget-byte p0, p0, v1

    and-int/lit16 p0, p0, 0xff

    :goto_1
    or-int/2addr p0, p2

    const p2, 0xd800

    if-lt p0, p2, :cond_3

    const p2, 0xdbff

    if-gt p0, p2, :cond_3

    return v0

    :cond_3
    :goto_2
    return p1
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 6

    const-string v0, "0123456789ABCDEF"

    .line 26
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 27
    array-length v1, p0

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [C

    const/4 v2, 0x0

    .line 28
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_0

    .line 29
    aget-byte v3, p0, v2

    and-int/lit16 v4, v3, 0xff

    mul-int/lit8 v5, v2, 0x2

    ushr-int/lit8 v4, v4, 0x4

    .line 30
    aget-char v4, v0, v4

    aput-char v4, v1, v5

    add-int/lit8 v5, v5, 0x1

    and-int/lit8 v3, v3, 0xf

    .line 31
    aget-char v3, v0, v3

    aput-char v3, v1, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 33
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static ֫([BZ)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x3

    const v1, 0x8000

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-nez p1, :cond_0

    .line 39
    array-length p1, p0

    goto/16 :goto_5

    .line 41
    :cond_0
    array-length p1, p0

    const/high16 v4, 0xa00000

    invoke-static {p1, v4}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 42
    array-length v4, p0

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v4, p0}, Ll/ܳ᩷ܽ;->֫(I[B)I

    move-result v4

    .line 43
    sget v5, Ll/ܳ᩷ܽ;->᩵:I

    const/4 v6, 0x1

    if-eq v4, v5, :cond_8

    sget v5, Ll/ܳ᩷ܽ;->֡:I

    if-ne v4, v5, :cond_1

    goto :goto_2

    .line 46
    :cond_1
    sget v5, Ll/ܳ᩷ܽ;->ܺ:I

    if-ne v4, v5, :cond_2

    .line 47
    invoke-static {p0, p1, v3}, Ll/ܰۘܺ;->֫([BIZ)I

    move-result p1

    goto/16 :goto_5

    .line 49
    :cond_2
    sget v5, Ll/ܳ᩷ܽ;->ۖ:I

    if-ne v4, v5, :cond_3

    .line 50
    invoke-static {p0, p1, v6}, Ll/ܰۘܺ;->֫([BIZ)I

    move-result p1

    goto/16 :goto_5

    .line 52
    :cond_3
    sget v5, Ll/ܳ᩷ܽ;->ۘ:I

    if-eq v4, v5, :cond_6

    sget v5, Ll/ܳ᩷ܽ;->ᩴ:I

    if-ne v4, v5, :cond_4

    goto :goto_1

    :cond_4
    if-ne v4, v2, :cond_5

    goto/16 :goto_5

    .line 103
    :cond_5
    invoke-static {v4}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v4

    add-int/lit8 v5, p1, -0x10

    .line 104
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    move v6, p1

    :goto_0
    if-lt v6, v5, :cond_11

    .line 118
    :try_start_0
    invoke-virtual {v4}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v7

    sget-object v8, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 119
    invoke-virtual {v7, v8}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v7

    .line 120
    invoke-virtual {v7, v8}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v7

    .line 121
    invoke-static {p0, v3, v6}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    move p1, v6

    goto :goto_5

    :catch_0
    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    .line 132
    :cond_6
    :goto_1
    invoke-static {p1, p0}, Ll/ܰۘܺ;->֫(I[B)I

    move-result v3

    sub-int v3, p1, v3

    if-gtz v3, :cond_7

    goto :goto_5

    .line 137
    :cond_7
    rem-int/lit8 v3, v3, 0x4

    sub-int/2addr p1, v3

    goto :goto_5

    :cond_8
    :goto_2
    if-gtz p1, :cond_9

    goto :goto_5

    :cond_9
    add-int/lit8 v3, p1, -0x1

    :goto_3
    const/16 v4, 0x80

    if-ltz v3, :cond_a

    .line 66
    aget-byte v5, p0, v3

    and-int/lit16 v5, v5, 0xc0

    if-ne v5, v4, :cond_a

    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    :cond_a
    if-gez v3, :cond_b

    const/4 p1, 0x0

    goto :goto_5

    .line 72
    :cond_b
    aget-byte v5, p0, v3

    and-int/lit16 v5, v5, 0xff

    if-ge v5, v4, :cond_c

    goto :goto_4

    :cond_c
    const/16 v4, 0xc2

    if-lt v5, v4, :cond_d

    const/16 v4, 0xdf

    if-gt v5, v4, :cond_d

    const/4 v6, 0x2

    goto :goto_4

    :cond_d
    const/16 v4, 0xe0

    if-lt v5, v4, :cond_e

    const/16 v4, 0xef

    if-gt v5, v4, :cond_e

    const/4 v6, 0x3

    goto :goto_4

    :cond_e
    const/16 v4, 0xf0

    if-lt v5, v4, :cond_f

    const/16 v4, 0xf4

    if-gt v5, v4, :cond_f

    const/4 v6, 0x4

    :cond_f
    :goto_4
    add-int/2addr v6, v3

    if-gt v6, p1, :cond_10

    goto :goto_5

    :cond_10
    move p1, v3

    .line 31
    :cond_11
    :goto_5
    sget v3, Ll/ܳ᩷ܽ;->᩵:I

    .line 147
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v1, p0}, Ll/ܳ᩷ܽ;->֫(I[B)I

    move-result v1

    if-ne v1, v2, :cond_12

    const/4 p0, 0x0

    goto :goto_a

    .line 160
    :cond_12
    sget v2, Ll/ܳ᩷ܽ;->᩵:I

    if-eq v1, v2, :cond_17

    sget v2, Ll/ܳ᩷ܽ;->֡:I

    if-ne v1, v2, :cond_13

    goto :goto_8

    .line 165
    :cond_13
    sget v0, Ll/ܳ᩷ܽ;->ܺ:I

    if-ne v1, v0, :cond_14

    .line 166
    invoke-static {p1, p0}, Ll/ۧ᩷ܽ;->֫(I[B)Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_6

    .line 170
    :cond_14
    sget v0, Ll/ܳ᩷ܽ;->ۖ:I

    if-ne v1, v0, :cond_15

    .line 171
    invoke-static {p1, p0}, Ll/ۧ᩷ܽ;->ۧ(I[B)Z

    move-result v0

    if-eqz v0, :cond_18

    :goto_6
    add-int/lit8 p1, p1, -0x2

    const/4 v0, 0x2

    goto :goto_9

    .line 175
    :cond_15
    sget v0, Ll/ܳ᩷ܽ;->ۘ:I

    if-ne v1, v0, :cond_16

    .line 176
    invoke-static {p1, p0}, Ll/ۧ᩷ܽ;->ܽ(I[B)Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_7

    .line 180
    :cond_16
    sget v0, Ll/ܳ᩷ܽ;->ᩴ:I

    if-ne v1, v0, :cond_18

    .line 181
    invoke-static {p1, p0}, Ll/ۧ᩷ܽ;->ᩳ(I[B)Z

    move-result v0

    if-eqz v0, :cond_18

    :goto_7
    add-int/lit8 p1, p1, -0x4

    const/4 v0, 0x4

    goto :goto_9

    .line 161
    :cond_17
    :goto_8
    invoke-static {p1, p0}, Ll/ۧ᩷ܽ;->ܿ(I[B)Z

    move-result v2

    if-eqz v2, :cond_18

    add-int/lit8 p1, p1, -0x3

    goto :goto_9

    :cond_18
    const/4 v0, 0x0

    .line 186
    :goto_9
    new-instance v2, Ljava/lang/String;

    invoke-static {v1}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v2, p0, v0, p1, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    move-object p0, v2

    :goto_a
    return-object p0
.end method

.method public static ֫(I[I)V
    .locals 2

    shr-int/lit8 v0, p0, 0x5

    and-int/lit8 p0, p0, 0x1f

    const/4 v1, 0x1

    shl-int p0, v1, p0

    .line 103
    aget v1, p1, v0

    not-int p0, p0

    and-int/2addr p0, v1

    aput p0, p1, v0

    return-void
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 5

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_2

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    mul-int/lit8 v3, v2, 0x2

    .line 14
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ll/ܰۘܺ;->֫(C)I

    move-result v4

    add-int/lit8 v3, v3, 0x1

    .line 15
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ll/ܰۘܺ;->֫(C)I

    move-result v3

    if-ltz v4, :cond_0

    if-ltz v3, :cond_0

    shl-int/lit8 v4, v4, 0x4

    or-int/2addr v3, v4

    int-to-byte v3, v3

    .line 19
    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 17
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Hex input contains a non-hexadecimal digit"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object v1

    .line 10
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Hex input must contain an even number of digits"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(I)[I
    .locals 0

    add-int/lit8 p0, p0, 0x1f

    shr-int/lit8 p0, p0, 0x5

    .line 38
    new-array p0, p0, [I

    return-object p0
.end method

.method public static ۧ(I[I)I
    .locals 5

    .line 167
    array-length v0, p1

    and-int/lit8 v1, p0, 0x1f

    shr-int/lit8 p0, p0, 0x5

    :goto_0
    const/4 v2, -0x1

    if-ge p0, v0, :cond_2

    .line 171
    aget v3, p1, p0

    if-eqz v3, :cond_1

    const/4 v4, 0x1

    shl-int v1, v4, v1

    sub-int/2addr v1, v4

    not-int v1, v1

    and-int/2addr v1, v3

    .line 195
    invoke-static {v1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v1

    const/16 v3, 0x20

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    move v2, v1

    :goto_1
    if-ltz v2, :cond_1

    shl-int/lit8 p0, p0, 0x5

    add-int/2addr p0, v2

    return p0

    :cond_1
    add-int/lit8 p0, p0, 0x1

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    return v2
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 4

    .line 747
    sget-object v0, Ll/ۢ֫ܽ;->֫:Ll/ۤ۟ۧ;

    .line 771
    invoke-static {}, Ll/ۛ۟ۧ;->ᩳ()Ljava/util/Set;

    move-result-object v0

    .line 795
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 796
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟۟ۧ;

    .line 797
    invoke-interface {v2}, Ll/۟۟ۧ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 798
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 801
    :cond_1
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 804
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟۟ۧ;

    .line 805
    invoke-interface {v0}, Ll/۟۟ۧ;->isSupported()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0

    .line 802
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown feature "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    if-nez p0, :cond_0

    const-string p0, "null"

    return-object p0

    .line 31
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    const-string p0, "\"\""

    return-object p0

    :cond_1
    const/16 v1, 0x2f

    const/4 v2, 0x0

    const/16 v3, 0x2f

    :goto_0
    if-ge v2, v0, :cond_4

    .line 39
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2d

    if-ne v3, v1, :cond_2

    .line 41
    invoke-static {v4}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    move-result v3

    if-nez v3, :cond_3

    if-eq v4, v5, :cond_3

    goto :goto_1

    :cond_2
    if-eq v4, v1, :cond_3

    .line 45
    invoke-static {v4}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    move-result v3

    if-nez v3, :cond_3

    if-eq v4, v5, :cond_3

    :goto_1
    const-string v0, "\""

    .line 0
    invoke-static {v0, p0, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    move v3, v4

    goto :goto_0

    :cond_4
    return-object p0
.end method

.method public static ܽ(I[I)Z
    .locals 2

    shr-int/lit8 v0, p0, 0x5

    and-int/lit8 p0, p0, 0x1f

    const/4 v1, 0x1

    shl-int p0, v1, p0

    .line 61
    aget p1, p1, v0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩳ(I[I)V
    .locals 2

    shr-int/lit8 v0, p0, 0x5

    and-int/lit8 p0, p0, 0x1f

    const/4 v1, 0x1

    shl-int p0, v1, p0

    .line 91
    aget v1, p1, v0

    or-int/2addr p0, v1

    aput p0, p1, v0

    return-void
.end method
