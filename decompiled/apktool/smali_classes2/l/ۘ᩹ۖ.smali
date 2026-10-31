.class public final Ll/ۘ᩹ۖ;
.super Ljava/lang/Object;
.source "S5QZ"


# direct methods
.method public static ֫(Ljava/nio/ByteBuffer;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 5

    .line 38
    :goto_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-char v0, v0

    if-nez v0, :cond_0

    .line 40
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v1, 0x80

    if-ge v0, v1, :cond_1

    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    and-int/lit16 v2, v0, 0xe0

    const/16 v3, 0xc0

    if-ne v2, v3, :cond_3

    .line 46
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    and-int/lit16 v3, v2, 0xc0

    if-ne v3, v1, :cond_2

    and-int/lit8 v0, v0, 0x1f

    shl-int/lit8 v0, v0, 0x6

    and-int/lit8 v1, v2, 0x3f

    or-int/2addr v0, v1

    int-to-char v0, v0

    .line 50
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 48
    :cond_2
    new-instance p0, Ljava/io/UTFDataFormatException;

    const-string p1, "bad second byte"

    invoke-direct {p0, p1}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    and-int/lit16 v2, v0, 0xf0

    const/16 v3, 0xe0

    if-ne v2, v3, :cond_5

    .line 52
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    .line 53
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    and-int/lit16 v4, v2, 0xc0

    if-ne v4, v1, :cond_4

    and-int/lit16 v4, v3, 0xc0

    if-ne v4, v1, :cond_4

    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0xc

    and-int/lit8 v1, v2, 0x3f

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    and-int/lit8 v1, v3, 0x3f

    or-int/2addr v0, v1

    int-to-char v0, v0

    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 55
    :cond_4
    new-instance p0, Ljava/io/UTFDataFormatException;

    const-string p1, "bad second or third byte"

    invoke-direct {p0, p1}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 59
    :cond_5
    new-instance p0, Ljava/io/UTFDataFormatException;

    const-string p1, "bad byte"

    invoke-direct {p0, p1}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
