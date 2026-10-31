.class public final Ll/ۤ᩺᩻;
.super Ljava/lang/Object;
.source "Q77S"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(IIIIIII)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput p1, p0, Ll/ۤ᩺᩻;->֫:I

    .line 32
    iput p2, p0, Ll/ۤ᩺᩻;->᩻:I

    .line 33
    iput p3, p0, Ll/ۤ᩺᩻;->ܳ:I

    .line 34
    iput p4, p0, Ll/ۤ᩺᩻;->ܽ:I

    .line 35
    iput p5, p0, Ll/ۤ᩺᩻;->ᩳ:I

    .line 36
    iput p6, p0, Ll/ۤ᩺᩻;->ۧ:I

    .line 37
    iput p7, p0, Ll/ۤ᩺᩻;->ܿ:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/nio/ByteBuffer;I)Ll/ۤ᩺᩻;
    .locals 10

    const/4 v0, 0x0

    .line 78
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const-string v1, "Invalid dex header: "

    const/16 v2, 0x64

    if-ne v0, v2, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/16 v2, 0x65

    if-ne v0, v2, :cond_2

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/16 v2, 0x78

    if-ne v0, v2, :cond_2

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/16 v2, 0xa

    if-ne v0, v2, :cond_2

    const/4 v0, 0x7

    .line 79
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x4

    .line 104
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    add-int/lit8 v0, v0, -0x30

    mul-int/lit8 v0, v0, 0x64

    const/4 v2, 0x5

    .line 105
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    add-int/lit8 v2, v2, -0x30

    mul-int/lit8 v2, v2, 0xa

    add-int/2addr v2, v0

    const/4 v0, 0x6

    .line 106
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x30

    .line 83
    invoke-static {v0}, Ll/᩶ۗ֡;->֫(I)I

    move-result v3

    const/4 v2, -0x1

    if-eq v3, v2, :cond_1

    const/16 v0, 0x20

    .line 87
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    const/16 v2, 0x24

    .line 88
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    const/16 v4, 0x28

    .line 89
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v4

    const/16 v5, 0x70

    if-lt v0, v5, :cond_0

    if-gt v0, p2, :cond_0

    if-ne v2, v5, :cond_0

    const p2, 0x12345678

    if-ne v4, p2, :cond_0

    .line 94
    new-instance p0, Ll/ۤ᩺᩻;

    const/16 p2, 0x40

    .line 95
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v4

    const/16 p2, 0x48

    .line 96
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    const/16 p2, 0x50

    .line 97
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v6

    const/16 p2, 0x58

    .line 98
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v9}, Ll/ۤ᩺᩻;-><init>(IIIIIII)V

    return-object p0

    .line 92
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 0
    invoke-static {v1, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 92
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 85
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unsupported dex version: "

    .line 0
    invoke-static {v0, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 85
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 80
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 0
    invoke-static {v1, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 80
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/String;Ll/᩻ۖܽ;JLl/ۤ᩺᩻;)Ll/ۤ᩺᩻;
    .locals 9

    const-wide/16 v0, 0x34

    .line 145
    invoke-virtual {p1, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    .line 146
    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result v0

    if-nez v0, :cond_0

    return-object p4

    :cond_0
    const/16 v1, 0x70

    if-lt v0, v1, :cond_6

    int-to-long v0, v0

    const-wide/16 v2, 0x4

    add-long/2addr v2, v0

    cmp-long v4, v2, p2

    if-gtz v4, :cond_6

    .line 153
    invoke-virtual {p1, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    .line 154
    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result v0

    int-to-long v4, v0

    const-wide/16 v6, 0xc

    mul-long v4, v4, v6

    add-long/2addr v4, v2

    if-ltz v0, :cond_5

    cmp-long v1, v4, p2

    if-gtz v1, :cond_5

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge p2, v0, :cond_4

    .line 162
    invoke-virtual {p1}, Ll/᩻ۖܽ;->ۛۧ()I

    move-result p3

    .line 163
    invoke-virtual {p1}, Ll/᩻ۖܽ;->ۛۧ()I

    .line 164
    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result v1

    .line 165
    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    if-ltz v1, :cond_3

    const/4 v2, 0x7

    if-ne p3, v2, :cond_1

    move v7, v1

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    if-ne p3, v2, :cond_2

    move v8, v1

    :cond_2
    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 167
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid dex map item: "

    .line 0
    invoke-static {p2, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 167
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 179
    :cond_4
    new-instance p0, Ll/ۤ᩺᩻;

    iget v2, p4, Ll/ۤ᩺᩻;->֫:I

    iget v3, p4, Ll/ۤ᩺᩻;->᩻:I

    iget v4, p4, Ll/ۤ᩺᩻;->ܳ:I

    iget v5, p4, Ll/ۤ᩺᩻;->ܽ:I

    iget v6, p4, Ll/ۤ᩺᩻;->ᩳ:I

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, Ll/ۤ᩺᩻;-><init>(IIIIIII)V

    return-object p0

    .line 157
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid dex map_list: "

    .line 0
    invoke-static {p2, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 157
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 151
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid dex map_off: "

    .line 0
    invoke-static {p2, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 151
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/String;[B)Ll/ۤ᩺᩻;
    .locals 13

    .line 51
    array-length v0, p1

    const/16 v1, 0x70

    if-lt v0, v1, :cond_7

    .line 54
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 55
    array-length v2, p1

    invoke-static {p0, v0, v2}, Ll/ۤ᩺᩻;->֫(Ljava/lang/String;Ljava/nio/ByteBuffer;I)Ll/ۤ᩺᩻;

    move-result-object v2

    .line 56
    array-length p1, p1

    const/16 v3, 0x34

    .line 111
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    if-nez v3, :cond_0

    return-object v2

    :cond_0
    if-lt v3, v1, :cond_6

    add-int/lit8 v1, v3, 0x4

    if-gt v1, p1, :cond_6

    .line 118
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v4

    int-to-long v5, v3

    const-wide/16 v7, 0x4

    add-long/2addr v5, v7

    int-to-long v7, v4

    const-wide/16 v9, 0xc

    mul-long v7, v7, v9

    add-long/2addr v7, v5

    if-ltz v4, :cond_5

    int-to-long v5, p1

    cmp-long p1, v7, v5

    if-gtz p1, :cond_5

    const/4 p1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_0
    if-ge p1, v4, :cond_4

    .line 127
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v3

    const v5, 0xffff

    and-int/2addr v3, v5

    add-int/lit8 v5, v1, 0x4

    .line 128
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    if-ltz v5, :cond_3

    const/4 v6, 0x7

    if-ne v3, v6, :cond_1

    move v11, v5

    goto :goto_1

    :cond_1
    const/16 v6, 0x8

    if-ne v3, v6, :cond_2

    move v12, v5

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0xc

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 130
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid dex map item: "

    .line 0
    invoke-static {v0, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 130
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 179
    :cond_4
    new-instance p0, Ll/ۤ᩺᩻;

    iget v6, v2, Ll/ۤ᩺᩻;->֫:I

    iget v7, v2, Ll/ۤ᩺᩻;->᩻:I

    iget v8, v2, Ll/ۤ᩺᩻;->ܳ:I

    iget v9, v2, Ll/ۤ᩺᩻;->ܽ:I

    iget v10, v2, Ll/ۤ᩺᩻;->ᩳ:I

    move-object v5, p0

    invoke-direct/range {v5 .. v12}, Ll/ۤ᩺᩻;-><init>(IIIIIII)V

    return-object p0

    .line 121
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid dex map_list: "

    .line 0
    invoke-static {v0, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 121
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 116
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid dex map_off: "

    .line 0
    invoke-static {v0, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 116
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 52
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid dex header: "

    .line 0
    invoke-static {v0, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 52
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۤ᩺᩻;
    .locals 6

    const-string v0, "Invalid dex header: "

    const-string v1, "r"

    .line 63
    invoke-virtual {p0, v1}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p0

    .line 64
    :try_start_0
    invoke-virtual {p0}, Ll/᩻ۖܽ;->length()J

    move-result-wide v1

    const-wide/16 v3, 0x70

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    const-wide/32 v3, 0x7fffffff

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    const/16 v0, 0x70

    new-array v3, v0, [B

    const-wide/16 v4, 0x0

    .line 69
    invoke-virtual {p0, v4, v5}, Ll/᩻ۖܽ;->seek(J)V

    const/4 v4, 0x0

    .line 187
    invoke-virtual {p0, v3, v4, v0}, Ll/᩻ۖܽ;->֫([BII)V

    .line 71
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    long-to-int v3, v1

    .line 72
    invoke-static {p1, v0, v3}, Ll/ۤ᩺᩻;->֫(Ljava/lang/String;Ljava/nio/ByteBuffer;I)Ll/ۤ᩺᩻;

    move-result-object v0

    .line 73
    invoke-static {p1, p0, v1, v2, v0}, Ll/ۤ᩺᩻;->֫(Ljava/lang/String;Ll/᩻ۖܽ;JLl/ۤ᩺᩻;)Ll/ۤ᩺᩻;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    invoke-virtual {p0}, Ll/᩻ۖܽ;->close()V

    return-object p1

    .line 66
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 63
    :try_start_2
    invoke-virtual {p0}, Ll/᩻ۖܽ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public static ۧ(I)Ll/ۤ᩺᩻;
    .locals 9

    .line 44
    new-instance v8, Ll/ۤ᩺᩻;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move v1, p0

    invoke-direct/range {v0 .. v7}, Ll/ۤ᩺᩻;-><init>(IIIIIII)V

    return-object v8
.end method


# virtual methods
.method public final ֫(I)Z
    .locals 1

    .line 187
    iget v0, p0, Ll/ۤ᩺᩻;->᩻:I

    if-gt v0, p1, :cond_0

    iget v0, p0, Ll/ۤ᩺᩻;->ܳ:I

    if-gt v0, p1, :cond_0

    iget v0, p0, Ll/ۤ᩺᩻;->ܽ:I

    if-gt v0, p1, :cond_0

    iget v0, p0, Ll/ۤ᩺᩻;->ᩳ:I

    if-gt v0, p1, :cond_0

    iget v0, p0, Ll/ۤ᩺᩻;->ۧ:I

    if-gt v0, p1, :cond_0

    iget v0, p0, Ll/ۤ᩺᩻;->ܿ:I

    if-gt v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
