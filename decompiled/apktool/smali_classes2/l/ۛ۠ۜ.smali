.class public final Ll/ۛ۠ۜ;
.super Ljava/lang/Object;
.source "Y6LM"


# direct methods
.method public static ֫(Ljava/io/InputStream;Ll/۬۠ۜ;)Ll/ۤ۠ۜ;
    .locals 9

    const/16 v0, 0x200

    new-array v1, v0, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    rsub-int v4, v3, 0x200

    .line 44
    invoke-virtual {p0, v1, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-gez v4, :cond_0

    goto :goto_1

    :cond_0
    if-nez v4, :cond_2

    .line 47
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v4

    if-gez v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v3, 0x1

    int-to-byte v4, v4

    .line 49
    aput-byte v4, v1, v3

    move v3, v5

    goto :goto_0

    :cond_2
    add-int/2addr v3, v4

    goto :goto_0

    :cond_3
    :goto_1
    const-string p0, "\u0089PNG\r\n\u001a\n"

    .line 85
    invoke-static {v3, v2, p0, v1}, Ll/ۛ۠ۜ;->֫(IILjava/lang/String;[B)Z

    move-result p0

    const/4 v4, -0x1

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez p0, :cond_a

    const/4 p0, 0x3

    if-lt v3, p0, :cond_4

    aget-byte p0, v1, v2

    if-ne p0, v4, :cond_4

    aget-byte p0, v1, v6

    const/16 v8, -0x28

    if-ne p0, v8, :cond_4

    aget-byte p0, v1, v5

    if-eq p0, v4, :cond_a

    :cond_4
    const-string p0, "BM"

    .line 87
    invoke-static {v3, v2, p0, v1}, Ll/ۛ۠ۜ;->֫(IILjava/lang/String;[B)Z

    move-result p0

    if-nez p0, :cond_a

    const-string p0, "\u0000\u0000\u0001\u0000"

    invoke-static {v3, v2, p0, v1}, Ll/ۛ۠ۜ;->֫(IILjava/lang/String;[B)Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_3

    :cond_5
    const-string p0, "GIF87a"

    .line 89
    invoke-static {v3, v2, p0, v1}, Ll/ۛ۠ۜ;->֫(IILjava/lang/String;[B)Z

    move-result p0

    if-nez p0, :cond_9

    const-string p0, "GIF89a"

    invoke-static {v3, v2, p0, v1}, Ll/ۛ۠ۜ;->֫(IILjava/lang/String;[B)Z

    move-result p0

    if-eqz p0, :cond_6

    goto :goto_2

    :cond_6
    const-string p0, "RIFF"

    .line 90
    invoke-static {v3, v2, p0, v1}, Ll/ۛ۠ۜ;->֫(IILjava/lang/String;[B)Z

    move-result p0

    if-eqz p0, :cond_8

    const/16 p0, 0x8

    const-string v8, "WEBP"

    invoke-static {v3, p0, v8, v1}, Ll/ۛ۠ۜ;->֫(IILjava/lang/String;[B)Z

    move-result p0

    if-eqz p0, :cond_8

    const/16 p0, 0x1e

    if-lt v3, p0, :cond_7

    const/16 p0, 0xc

    const-string v8, "VP8X"

    .line 91
    invoke-static {v3, p0, v8, v1}, Ll/ۛ۠ۜ;->֫(IILjava/lang/String;[B)Z

    move-result p0

    if-eqz p0, :cond_7

    const/16 p0, 0x14

    aget-byte p0, v1, p0

    and-int/2addr p0, v5

    if-eqz p0, :cond_7

    .line 92
    sget-object p0, Ll/۫۠ۜ;->᩹:Ll/۫۠ۜ;

    goto :goto_4

    :cond_7
    sget-object p0, Ll/۫۠ۜ;->᩶:Ll/۫۠ۜ;

    goto :goto_4

    :cond_8
    move-object p0, v7

    goto :goto_4

    .line 89
    :cond_9
    :goto_2
    sget-object p0, Ll/۫۠ۜ;->ۙ:Ll/۫۠ۜ;

    goto :goto_4

    .line 88
    :cond_a
    :goto_3
    sget-object p0, Ll/۫۠ۜ;->᩶:Ll/۫۠ۜ;

    :goto_4
    if-eqz p0, :cond_b

    .line 53
    new-instance p1, Ll/ۤ۠ۜ;

    invoke-direct {p1, p0, v7}, Ll/ۤ۠ۜ;-><init>(Ll/۫۠ۜ;Landroid/graphics/BitmapFactory$Options;)V

    return-object p1

    .line 54
    :cond_b
    invoke-interface {p1}, Ll/۬۠ۜ;->read()Landroid/graphics/BitmapFactory$Options;

    move-result-object p0

    .line 55
    iget p1, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez p1, :cond_c

    iget p1, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lez p1, :cond_c

    new-instance p1, Ll/ۤ۠ۜ;

    sget-object v0, Ll/۫۠ۜ;->᩶:Ll/۫۠ۜ;

    invoke-direct {p1, v0, p0}, Ll/ۤ۠ۜ;-><init>(Ll/۫۠ۜ;Landroid/graphics/BitmapFactory$Options;)V

    return-object p1

    :cond_c
    const/4 p1, -0x2

    if-lt v3, v5, :cond_d

    .line 59
    aget-byte v8, v1, v2

    if-ne v8, v4, :cond_d

    aget-byte v8, v1, v6

    if-ne v8, p1, :cond_d

    .line 60
    new-instance p1, Ljava/lang/String;

    add-int/lit8 v4, v3, -0x2

    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-direct {p1, v1, v5, v4, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_5

    :cond_d
    if-lt v3, v5, :cond_e

    .line 61
    aget-byte v8, v1, v2

    if-ne v8, p1, :cond_e

    aget-byte p1, v1, v6

    if-ne p1, v4, :cond_e

    .line 62
    new-instance p1, Ljava/lang/String;

    add-int/lit8 v4, v3, -0x2

    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    invoke-direct {p1, v1, v5, v4, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_5

    :cond_e
    const-string p1, "<\u0000?\u0000"

    .line 64
    invoke-static {v3, v2, p1, v1}, Ll/ۛ۠ۜ;->֫(IILjava/lang/String;[B)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 65
    new-instance p1, Ljava/lang/String;

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-direct {p1, v1, v2, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_5

    :cond_f
    const-string p1, "\u0000<\u0000?"

    .line 66
    invoke-static {v3, v2, p1, v1}, Ll/ۛ۠ۜ;->֫(IILjava/lang/String;[B)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 67
    new-instance p1, Ljava/lang/String;

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    invoke-direct {p1, v1, v2, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_5

    .line 68
    :cond_10
    new-instance p1, Ljava/lang/String;

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p1, v1, v2, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_5
    const-string v4, "\ufeff"

    .line 69
    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 71
    :cond_11
    :goto_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_13

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x20

    if-eq v4, v5, :cond_12

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x9

    if-eq v4, v5, :cond_12

    .line 72
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0xd

    if-eq v4, v5, :cond_12

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0xa

    if-ne v4, v5, :cond_13

    :cond_12
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_13
    add-int/lit8 v4, v2, 0x1

    .line 74
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_14

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x3c

    if-ne v5, v6, :cond_14

    .line 75
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isLetter(C)Z

    move-result v5

    if-nez v5, :cond_15

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x5f

    if-eq v5, v6, :cond_15

    .line 76
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x3a

    if-eq v5, v6, :cond_15

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x3f

    if-eq v5, v6, :cond_15

    .line 77
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x21

    if-ne v4, v5, :cond_14

    goto :goto_7

    :cond_14
    if-ne v3, v0, :cond_16

    .line 78
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-ne v2, p1, :cond_16

    .line 79
    :cond_15
    :goto_7
    new-instance p0, Ll/ۤ۠ۜ;

    sget-object p1, Ll/۫۠ۜ;->ۗ:Ll/۫۠ۜ;

    invoke-direct {p0, p1, v7}, Ll/ۤ۠ۜ;-><init>(Ll/۫۠ۜ;Landroid/graphics/BitmapFactory$Options;)V

    return-object p0

    :cond_16
    const/16 p1, 0x12

    if-lt v3, p1, :cond_17

    .line 80
    invoke-static {v1}, Ll/ܰۛۡ;->֫([B)Z

    move-result p1

    if-eqz p1, :cond_17

    new-instance p0, Ll/ۤ۠ۜ;

    sget-object p1, Ll/۫۠ۜ;->۬:Ll/۫۠ۜ;

    invoke-direct {p0, p1, v7}, Ll/ۤ۠ۜ;-><init>(Ll/۫۠ۜ;Landroid/graphics/BitmapFactory$Options;)V

    return-object p0

    .line 81
    :cond_17
    new-instance p1, Ll/ۤ۠ۜ;

    sget-object v0, Ll/۫۠ۜ;->۫:Ll/۫۠ۜ;

    invoke-direct {p1, v0, p0}, Ll/ۤ۠ۜ;-><init>(Ll/۫۠ۜ;Landroid/graphics/BitmapFactory$Options;)V

    return-object p1
.end method

.method public static ֫(IILjava/lang/String;[B)Z
    .locals 3

    sub-int/2addr p0, p1

    .line 98
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge p0, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    .line 99
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p0, v0, :cond_2

    add-int v0, p1, p0

    .line 100
    aget-byte v0, p3, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v0, v2, :cond_1

    :goto_1
    return v1

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method
