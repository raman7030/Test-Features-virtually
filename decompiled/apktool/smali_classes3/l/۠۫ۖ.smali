.class public final Ll/۠۫ۖ;
.super Ll/ۘ۬ۖ;
.source "S9JY"


# virtual methods
.method public final ֫(Ll/ۨ۬ۖ;[B)Ll/ۚ۬ۖ;
    .locals 7

    .line 63
    array-length p1, p2

    if-lez p1, :cond_3

    .line 64
    new-instance p1, Ljava/io/ByteArrayInputStream;

    invoke-direct {p1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    invoke-virtual {p1}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v1

    .line 67
    div-int/lit8 v2, v1, 0x28

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    rem-int/lit8 v1, v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    :goto_0
    invoke-virtual {p1}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v1

    if-lez v1, :cond_2

    .line 70
    invoke-virtual {p1}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v1

    const/16 v3, 0x7f

    if-ge v1, v3, :cond_0

    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    and-int/lit8 v1, v1, 0x7f

    int-to-long v4, v1

    .line 74
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    .line 76
    :cond_1
    invoke-virtual {p1}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v4

    const/4 v5, 0x7

    .line 77
    invoke-virtual {v1, v5}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v1

    and-int/lit8 v5, v4, 0x7f

    int-to-long v5, v5

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    if-gt v4, v3, :cond_1

    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 82
    :cond_2
    new-instance p1, Ll/᩸۫ۖ;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Ll/᩸۫ۖ;-><init>([BLjava/lang/String;)V

    return-object p1

    .line 31
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "An ASN.1 OBJECT IDENTIFIER should have at least a one byte value"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
