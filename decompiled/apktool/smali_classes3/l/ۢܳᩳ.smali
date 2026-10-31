.class public final Ll/ۢܳᩳ;
.super Ljava/lang/Object;
.source "KAZL"


# direct methods
.method public static ֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 4

    .line 15
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_4

    .line 20
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    if-ltz v0, :cond_3

    .line 23
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    if-gt v0, v1, :cond_2

    if-ltz v0, :cond_1

    .line 58
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result v1

    .line 59
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v0, v2

    if-lt v0, v2, :cond_0

    if-gt v0, v1, :cond_0

    .line 64
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 66
    :try_start_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 67
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 68
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    return-object v2

    :catchall_0
    move-exception v0

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 72
    throw v0

    .line 62
    :cond_0
    new-instance p0, Ljava/nio/BufferUnderflowException;

    invoke-direct {p0}, Ljava/nio/BufferUnderflowException;-><init>()V

    throw p0

    .line 56
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v1, "size: "

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 24
    :cond_2
    new-instance v1, Ll/᩷ܳᩳ;

    const-string v2, "Length-prefixed field longer than remaining buffer. Field length: "

    const-string v3, ", remaining: "

    .line 0
    invoke-static {v0, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 26
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 23
    invoke-direct {v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 26
    throw v1

    .line 22
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Negative length"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 16
    :cond_4
    new-instance v0, Ll/᩷ܳᩳ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Remaining buffer too short to contain length of length-prefixed field. Remaining: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 23
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 18
    throw v0
.end method

.method public static ۧ(Ljava/nio/ByteBuffer;)[B
    .locals 4

    .line 32
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    if-ltz v0, :cond_1

    .line 35
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 40
    new-array v0, v0, [B

    .line 41
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    return-object v0

    .line 36
    :cond_0
    new-instance v1, Ll/᩷ܳᩳ;

    const-string v2, "Underflow while reading length-prefixed value. Length: "

    const-string v3, ", available: "

    .line 0
    invoke-static {v0, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 38
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 23
    invoke-direct {v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 38
    throw v1

    .line 34
    :cond_1
    new-instance p0, Ll/᩷ܳᩳ;

    const-string v0, "Negative length"

    .line 23
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 34
    throw p0
.end method
