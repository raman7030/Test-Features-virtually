.class public final Ll/۬ܺۜ;
.super Ljava/lang/Object;
.source "T6Y0"


# direct methods
.method public static ֫(ILjava/lang/String;Ljava/lang/String;)Ll/ۙܺۜ;
    .locals 5

    .line 48
    invoke-static {p2}, Ll/ܳۘۜ;->ܽ(Ljava/lang/String;)Ll/ܿۘۜ;

    move-result-object p2

    .line 49
    iget-object v0, p2, Ll/ܿۘۜ;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v1

    sget-object v2, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 50
    invoke-virtual {v1, v2}, Ljava/nio/charset/CharsetEncoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetEncoder;

    move-result-object v1

    .line 51
    invoke-virtual {v1, v2}, Ljava/nio/charset/CharsetEncoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetEncoder;

    move-result-object v1

    .line 52
    invoke-static {p1}, Ljava/nio/CharBuffer;->wrap(Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/nio/charset/CharsetEncoder;->encode(Ljava/nio/CharBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 53
    invoke-virtual {p2}, Ll/ܿۘۜ;->֫()[B

    move-result-object p2

    .line 54
    array-length v1, p2

    int-to-long v1, v1

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    int-to-long v3, p0

    cmp-long p0, v1, v3

    if-gtz p0, :cond_0

    long-to-int p0, v1

    .line 58
    new-array v1, p0, [B

    .line 59
    array-length v2, p2

    const/4 v3, 0x0

    invoke-static {p2, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    array-length v2, p2

    array-length p2, p2

    sub-int/2addr p0, p2

    invoke-virtual {p1, v1, v2, p0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 61
    new-instance p0, Ll/ۙܺۜ;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Ll/ۙܺۜ;-><init>([BLjava/lang/String;)V

    return-object p0

    .line 56
    :cond_0
    new-instance p0, Ll/ۗܺۜ;

    invoke-direct {p0, v1, v2}, Ll/ۗܺۜ;-><init>(J)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;[B)Ll/᩶ܺۜ;
    .locals 3

    .line 25
    array-length v0, p1

    const v1, 0x8000

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 25
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    .line 28
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p0, ""

    .line 29
    invoke-static {p0, v0}, Ll/ܳۘۜ;->֫(Ljava/lang/String;[B)Ll/ܿۘۜ;

    move-result-object p0

    goto :goto_0

    .line 31
    :cond_0
    invoke-static {p0}, Ll/ܳۘۜ;->ܽ(Ljava/lang/String;)Ll/ܿۘۜ;

    move-result-object p0

    .line 32
    invoke-virtual {p0, v0}, Ll/ܿۘۜ;->֫([B)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 36
    :goto_0
    iget-object v0, p0, Ll/ܿۘۜ;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 37
    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    .line 38
    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    iget v1, p0, Ll/ܿۘۜ;->ۧ:I

    array-length v2, p1

    sub-int/2addr v2, v1

    .line 39
    invoke-static {p1, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p1

    .line 41
    new-instance v0, Ll/᩶ܺۜ;

    invoke-virtual {p1}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Ll/ܿۘۜ;->ᩳ:Ljava/lang/String;

    invoke-direct {v0, p1, p0}, Ll/᩶ܺۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 33
    :cond_1
    new-instance p0, Ll/᩹ܺۜ;

    const-string p1, "Encoding token BOM does not match the current file"

    .line 97
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 33
    throw p0
.end method

.method public static ֫(Ll/ۙܺۜ;)V
    .locals 2

    .line 66
    iget-object v0, p0, Ll/ۙܺۜ;->֫:[B

    array-length v0, v0

    const v1, 0x8000

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 68
    iget-object v1, p0, Ll/ۙܺۜ;->֫:[B

    invoke-static {p0}, Ll/ۙܺۜ;->֫(Ll/ۙܺۜ;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0, v1}, Ll/ܽۘᩳ;->֫(Ljava/lang/String;I[B)V

    return-void
.end method
