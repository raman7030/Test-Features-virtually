.class public final Ll/ۘ۫ۡ;
.super Ljava/lang/Object;
.source "F9T9"

# interfaces
.implements Ll/֡ۤۖ;


# direct methods
.method public static ֫(IILjava/lang/CharSequence;Ljava/lang/CharSequence;)I
    .locals 9

    if-gez p0, :cond_0

    const/4 p0, 0x0

    .line 47
    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 48
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 p1, p1, -0x1

    if-le p1, v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, p1

    :goto_0
    const/4 p1, -0x1

    if-ge v0, p0, :cond_2

    return p1

    :cond_2
    if-nez v1, :cond_3

    return v0

    :cond_3
    add-int/lit8 v2, v1, -0x1

    .line 63
    invoke-interface {p3, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    add-int/2addr p0, v2

    add-int/2addr v0, v2

    :goto_1
    if-lt v0, p0, :cond_4

    .line 69
    invoke-interface {p2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-eq v4, v3, :cond_4

    goto :goto_3

    :cond_4
    if-ge v0, p0, :cond_5

    return p1

    :cond_5
    add-int/lit8 v4, v0, -0x1

    sub-int v5, v0, v2

    add-int/lit8 v6, v1, -0x2

    :goto_2
    if-lt v4, v5, :cond_7

    add-int/lit8 v7, v4, -0x1

    .line 80
    invoke-interface {p2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    add-int/lit8 v8, v6, -0x1

    invoke-interface {p3, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    if-eq v4, v6, :cond_6

    :goto_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_6
    move v4, v7

    move v6, v8

    goto :goto_2

    :cond_7
    return v5
.end method

.method public static ֫(Ljava/nio/ByteBuffer;)I
    .locals 6

    const/4 v0, 0x5

    .line 98
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_2

    :cond_0
    const/16 v0, 0x1a

    .line 104
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/16 v2, 0x1c

    const/4 v3, 0x0

    const/16 v4, 0x1c

    :goto_0
    if-ge v3, v0, :cond_1

    add-int/lit8 v5, v3, 0x1b

    .line 106
    invoke-virtual {p0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v4, 0x1a

    .line 111
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_2

    add-int/lit8 v5, v4, 0x1b

    add-int/2addr v5, v3

    .line 113
    invoke-virtual {p0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    add-int/2addr v2, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    add-int v0, v4, v2

    :goto_2
    add-int/lit8 v2, v0, 0x1a

    .line 80
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    add-int/lit8 v2, v2, 0x1b

    add-int/2addr v2, v0

    .line 85
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    .line 86
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result v3

    sub-int/2addr v3, v2

    const/4 v4, 0x1

    if-le v3, v4, :cond_3

    add-int/2addr v2, v4

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    .line 84
    :cond_3
    invoke-static {v0, v1}, Ll/ۘ۫ۡ;->֫(BB)J

    move-result-wide v0

    const-wide/32 v2, 0xbb80

    mul-long v0, v0, v2

    const-wide/32 v2, 0xf4240

    .line 87
    div-long/2addr v0, v2

    long-to-int p0, v0

    return p0
.end method

.method public static ֫(BB)J
    .locals 5

    and-int/lit16 v0, p0, 0xff

    const/4 v1, 0x3

    and-int/2addr p0, v1

    const/4 v2, 0x1

    if-eqz p0, :cond_0

    const/4 v3, 0x2

    if-eq p0, v2, :cond_1

    if-eq p0, v3, :cond_1

    and-int/lit8 v3, p1, 0x3f

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    :cond_1
    :goto_0
    shr-int/lit8 p0, v0, 0x3

    and-int/lit8 p1, p0, 0x3

    const/16 v0, 0x10

    if-lt p0, v0, :cond_2

    const/16 p0, 0x9c4

    shl-int/2addr p0, p1

    goto :goto_1

    :cond_2
    const/16 v0, 0xc

    const/16 v4, 0x2710

    if-lt p0, v0, :cond_3

    and-int/2addr p0, v2

    shl-int p0, v4, p0

    goto :goto_1

    :cond_3
    if-ne p1, v1, :cond_4

    const p0, 0xea60

    goto :goto_1

    :cond_4
    shl-int p0, v4, p1

    :goto_1
    int-to-long v0, v3

    int-to-long p0, p0

    mul-long v0, v0, p0

    return-wide v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 19
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const-string v4, ".^$[]*+?|(){}\\"

    .line 20
    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_0

    const/16 v4, 0x5c

    .line 21
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ֫(Ljava/lang/String;[Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 5

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_0

    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 51
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 3

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    new-instance v1, Ljava/io/PrintWriter;

    new-instance v2, Ll/ܽܺ֡;

    invoke-direct {v2, v0}, Ll/ܽܺ֡;-><init>(Ljava/lang/StringBuilder;)V

    invoke-direct {v1, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 111
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 112
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([B)Ljava/util/ArrayList;
    .locals 6

    const/16 v0, 0xb

    .line 149
    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x8

    shl-int/2addr v0, v1

    const/16 v2, 0xa

    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v0, v2

    int-to-long v2, v0

    const-wide/32 v4, 0x3b9aca00

    mul-long v2, v2, v4

    const-wide/32 v4, 0xbb80

    .line 206
    div-long/2addr v2, v4

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    const/4 v4, 0x3

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0, v2, v3}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    .line 64
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p0

    const-wide/32 v1, 0x4c4b400

    invoke-virtual {p0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    .line 65
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static ֫(Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V
    .locals 2

    .line 103
    new-instance v0, Ljava/io/PrintWriter;

    new-instance v1, Ll/ܽܺ֡;

    invoke-direct {v1, p0}, Ll/ܽܺ֡;-><init>(Ljava/lang/StringBuilder;)V

    invoke-direct {v0, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 105
    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method

.method public static ֫(JJ)Z
    .locals 1

    sub-long/2addr p0, p2

    const-wide/32 p2, 0x13880

    cmp-long v0, p0, p2

    if-gtz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/nio/ByteBuffer;)I
    .locals 4

    const/4 v0, 0x0

    .line 128
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    :cond_0
    invoke-static {v1, v0}, Ll/ۘ۫ۡ;->֫(BB)J

    move-result-wide v0

    const-wide/32 v2, 0xbb80

    mul-long v0, v0, v2

    const-wide/32 v2, 0xf4240

    .line 129
    div-long/2addr v0, v2

    long-to-int p0, v0

    return p0
.end method

.method public static ۧ([B)J
    .locals 4

    const/4 v0, 0x0

    .line 139
    aget-byte v1, p0, v0

    array-length v2, p0

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    aget-byte v0, p0, v3

    :cond_0
    invoke-static {v1, v0}, Ll/ۘ۫ۡ;->֫(BB)J

    move-result-wide v0

    return-wide v0
.end method
