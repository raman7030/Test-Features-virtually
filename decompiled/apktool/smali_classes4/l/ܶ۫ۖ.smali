.class public final Ll/ܶ۫ۖ;
.super Ll/ᩴ۬ۖ;
.source "S9JY"


# direct methods
.method public static ֫(Ll/᩸۫ۖ;)V
    .locals 6

    .line 100
    invoke-static {p0}, Ll/᩸۫ۖ;->֫(Ll/᩸۫ۖ;)Ljava/lang/String;

    move-result-object v0

    .line 101
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 102
    new-instance v2, Ljava/util/StringTokenizer;

    const-string v3, "."

    invoke-direct {v2, v0, v3}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 104
    invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    mul-int/lit8 v0, v0, 0x28

    add-int/2addr v0, v3

    .line 105
    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 106
    :cond_0
    :goto_0
    invoke-virtual {v2}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 107
    new-instance v0, Ljava/math/BigInteger;

    invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 108
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v3

    const/16 v4, 0x7f

    if-lez v3, :cond_1

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v3

    if-ge v3, v4, :cond_1

    .line 109
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_0

    .line 111
    :cond_1
    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    div-int/lit8 v3, v3, 0x7

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v5

    rem-int/lit8 v5, v5, 0x7

    if-lez v5, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    add-int/2addr v3, v5

    add-int/lit8 v3, v3, -0x1

    :goto_2
    if-ltz v3, :cond_0

    mul-int/lit8 v5, v3, 0x7

    .line 113
    invoke-virtual {v0, v5}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Number;->byteValue()B

    move-result v5

    and-int/2addr v5, v4

    int-to-byte v5, v5

    if-lez v3, :cond_3

    or-int/lit16 v5, v5, 0x80

    int-to-byte v5, v5

    .line 118
    :cond_3
    invoke-virtual {v1, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    .line 122
    :cond_4
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Ll/᩹۫ۖ;->᩹:[B

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ۬ۖ;)I
    .locals 1

    .line 86
    check-cast p1, Ll/᩸۫ۖ;

    .line 93
    iget-object v0, p1, Ll/᩹۫ۖ;->᩹:[B

    if-nez v0, :cond_0

    .line 94
    invoke-static {p1}, Ll/ܶ۫ۖ;->֫(Ll/᩸۫ۖ;)V

    .line 96
    :cond_0
    iget-object p1, p1, Ll/᩹۫ۖ;->᩹:[B

    array-length p1, p1

    return p1
.end method

.method public final ֫(Ll/ۚ۬ۖ;Ll/ܺ۬ۖ;)V
    .locals 1

    .line 86
    check-cast p1, Ll/᩸۫ۖ;

    .line 127
    iget-object v0, p1, Ll/᩹۫ۖ;->᩹:[B

    if-nez v0, :cond_0

    .line 128
    invoke-static {p1}, Ll/ܶ۫ۖ;->֫(Ll/᩸۫ۖ;)V

    .line 130
    :cond_0
    iget-object p1, p1, Ll/᩹۫ۖ;->᩹:[B

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method
