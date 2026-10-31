.class public final Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;
.super Lcom/amazonaws/internal/SdkInputStream;
.source "AwsChunkedEncodingInputStream.java"


# static fields
.field public static final ֫֫:Lcom/amazonaws/logging/Log;

.field public static final ۟:[B


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public ۙ:Lcom/amazonaws/auth/DecodedStreamBuffer;

.field public final ۛ:[B

.field public ۤ:Z

.field public final ۨ:Ljava/lang/String;

.field public ۫:Z

.field public ۬:Ljava/io/InputStream;

.field public ܰ:Ljava/lang/String;

.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Lcom/amazonaws/services/s3/internal/AWSS3V4Signer;

.field public ᩹:Lcom/amazonaws/auth/ChunkContentIterator;

.field public final ᩺:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 45
    sput-object v0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۟:[B

    .line 69
    const-class v0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->֫֫:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/services/s3/internal/AWSS3V4Signer;)V
    .locals 3

    .line 116
    invoke-direct {p0}, Lcom/amazonaws/internal/SdkInputStream;-><init>()V

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۬:Ljava/io/InputStream;

    const/4 v1, 0x1

    .line 66
    iput-boolean v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۫:Z

    const/4 v1, 0x0

    .line 67
    iput-boolean v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۤ:Z

    .line 117
    instance-of v1, p1, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;

    const/high16 v2, 0x40000

    if-eqz v1, :cond_0

    .line 120
    check-cast p1, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;

    .line 121
    iget v0, p1, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩺:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 122
    iget-object v0, p1, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۬:Ljava/io/InputStream;

    iput-object v0, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۬:Ljava/io/InputStream;

    .line 123
    iget-object p1, p1, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۙ:Lcom/amazonaws/auth/DecodedStreamBuffer;

    iput-object p1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۙ:Lcom/amazonaws/auth/DecodedStreamBuffer;

    goto :goto_0

    .line 125
    :cond_0
    iput-object p1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۬:Ljava/io/InputStream;

    .line 126
    iput-object v0, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۙ:Lcom/amazonaws/auth/DecodedStreamBuffer;

    :goto_0
    const/high16 p1, 0x20000

    if-lt v2, p1, :cond_1

    .line 133
    iput v2, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩺:I

    .line 134
    iput-object p2, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۛ:[B

    .line 135
    iput-object p3, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩶:Ljava/lang/String;

    .line 136
    iput-object p4, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۨ:Ljava/lang/String;

    .line 137
    iput-object p5, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۗ:Ljava/lang/String;

    .line 138
    iput-object p5, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ܰ:Ljava/lang/String;

    .line 139
    iput-object p6, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩸:Lcom/amazonaws/services/s3/internal/AWSS3V4Signer;

    return-void

    .line 130
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Max buffer size should not be less than chunk size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۧ(J)J
    .locals 2

    .line 293
    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x53

    int-to-long v0, v0

    add-long/2addr v0, p0

    const/4 p0, 0x2

    int-to-long p0, p0

    add-long/2addr v0, p0

    return-wide v0
.end method

.method private ۧ([B)[B
    .locals 6

    .line 347
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 349
    array-length v1, p1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AWS4-HMAC-SHA256-PAYLOAD\n"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩶:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۨ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ܰ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ""

    .line 357
    iget-object v4, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩸:Lcom/amazonaws/services/s3/internal/AWSS3V4Signer;

    invoke-virtual {v4, v3}, Lcom/amazonaws/auth/AbstractAWSSigner;->hash(Ljava/lang/String;)[B

    move-result-object v3

    invoke-static {v3}, Lcom/amazonaws/util/BinaryUtils;->֫([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    invoke-virtual {v4, p1}, Lcom/amazonaws/auth/AbstractAWSSigner;->hash([B)[B

    move-result-object v2

    invoke-static {v2}, Lcom/amazonaws/util/BinaryUtils;->֫([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 359
    iget-object v2, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۛ:[B

    sget-object v3, Lcom/amazonaws/auth/SigningAlgorithm;->᩶:Lcom/amazonaws/auth/SigningAlgorithm;

    invoke-virtual {v4, v1, v2, v3}, Lcom/amazonaws/auth/AbstractAWSSigner;->sign(Ljava/lang/String;[BLcom/amazonaws/auth/SigningAlgorithm;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/amazonaws/util/BinaryUtils;->֫([B)Ljava/lang/String;

    move-result-object v1

    .line 361
    iput-object v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ܰ:Ljava/lang/String;

    .line 362
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, ";chunk-signature="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\r\n"

    .line 363
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/amazonaws/util/StringUtils;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 367
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 368
    array-length v2, v0

    array-length v3, p1

    add-int/2addr v2, v3

    array-length v3, v1

    add-int/2addr v2, v3

    new-array v2, v2, [B

    .line 369
    array-length v3, v0

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 370
    array-length v3, v0

    array-length v5, p1

    invoke-static {p1, v4, v2, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 371
    array-length v0, v0

    array-length p1, p1

    add-int/2addr v0, p1

    array-length p1, v1

    invoke-static {v1, v4, v2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    .line 376
    new-instance v0, Lcom/amazonaws/AmazonClientException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to sign the chunked data. "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 376
    throw v0
.end method

.method public static ᩳ(J)J
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_1

    const-wide/32 v2, 0x20000

    .line 285
    div-long v4, p0, v2

    .line 286
    rem-long/2addr p0, v2

    .line 287
    invoke-static {v2, v3}, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۧ(J)J

    move-result-wide v2

    mul-long v4, v4, v2

    cmp-long v2, p0, v0

    if-lez v2, :cond_0

    .line 288
    invoke-static {p0, p1}, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۧ(J)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    move-wide p0, v0

    :goto_0
    add-long/2addr v4, p0

    .line 289
    invoke-static {v0, v1}, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۧ(J)J

    move-result-wide p0

    add-long/2addr v4, p0

    return-wide v4

    .line 282
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Nonnegative content length expected."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final declared-synchronized mark(I)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 220
    :try_start_0
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkInputStream;->ܽ()V

    .line 221
    iget-boolean p1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۫:Z

    if-eqz p1, :cond_3

    .line 225
    iget-object p1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۬:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 226
    sget-object p1, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->֫֫:Lcom/amazonaws/logging/Log;

    invoke-interface {p1}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it\'s mark-supported)."

    .line 227
    invoke-interface {p1, v1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 230
    :cond_0
    iget-object p1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۬:Ljava/io/InputStream;

    const v1, 0x7fffffff

    invoke-virtual {p1, v1}, Ljava/io/InputStream;->mark(I)V

    goto :goto_0

    .line 232
    :cond_1
    sget-object p1, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->֫֫:Lcom/amazonaws/logging/Log;

    invoke-interface {p1}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported)."

    .line 233
    invoke-interface {p1, v1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 236
    :cond_2
    new-instance p1, Lcom/amazonaws/auth/DecodedStreamBuffer;

    iget v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩺:I

    invoke-direct {p1, v1}, Lcom/amazonaws/auth/DecodedStreamBuffer;-><init>(I)V

    iput-object p1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۙ:Lcom/amazonaws/auth/DecodedStreamBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    :goto_0
    monitor-exit v0

    return-void

    .line 222
    :cond_3
    :try_start_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Chunk-encoded stream only supports mark() at the start of the stream."

    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 238
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 145
    invoke-virtual {p0, v1, v2, v0}, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    .line 147
    sget-object v0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->֫֫:Lcom/amazonaws/logging/Log;

    invoke-interface {v0}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "One byte read from the stream."

    .line 148
    invoke-interface {v0, v3}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 150
    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    :cond_1
    return v0
.end method

.method public final read([BII)I
    .locals 7

    .line 159
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkInputStream;->ܽ()V

    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p2, :cond_a

    if-ltz p3, :cond_a

    .line 162
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_a

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 168
    :cond_0
    iget-object v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩹:Lcom/amazonaws/auth/ChunkContentIterator;

    if-eqz v1, :cond_1

    .line 169
    invoke-virtual {v1}, Lcom/amazonaws/auth/ChunkContentIterator;->֫()Z

    move-result v1

    if-nez v1, :cond_8

    .line 170
    :cond_1
    iget-boolean v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۤ:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    const/high16 v1, 0x20000

    new-array v3, v1, [B

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_5

    .line 312
    iget-object v5, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۙ:Lcom/amazonaws/auth/DecodedStreamBuffer;

    if-eqz v5, :cond_3

    .line 313
    invoke-virtual {v5}, Lcom/amazonaws/auth/DecodedStreamBuffer;->֫()Z

    move-result v5

    if-eqz v5, :cond_3

    add-int/lit8 v5, v4, 0x1

    .line 314
    iget-object v6, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۙ:Lcom/amazonaws/auth/DecodedStreamBuffer;

    invoke-virtual {v6}, Lcom/amazonaws/auth/DecodedStreamBuffer;->ۧ()B

    move-result v6

    aput-byte v6, v3, v4

    move v4, v5

    goto :goto_0

    :cond_3
    sub-int v5, v1, v4

    .line 319
    iget-object v6, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۬:Ljava/io/InputStream;

    invoke-virtual {v6, v3, v4, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-eq v5, v2, :cond_5

    .line 321
    iget-object v6, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۙ:Lcom/amazonaws/auth/DecodedStreamBuffer;

    if-eqz v6, :cond_4

    .line 322
    invoke-virtual {v6, v4, v5, v3}, Lcom/amazonaws/auth/DecodedStreamBuffer;->֫(II[B)V

    :cond_4
    add-int/2addr v4, v5

    goto :goto_0

    :cond_5
    if-nez v4, :cond_6

    .line 331
    sget-object v1, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۟:[B

    invoke-direct {p0, v1}, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۧ([B)[B

    move-result-object v1

    .line 332
    new-instance v2, Lcom/amazonaws/auth/ChunkContentIterator;

    invoke-direct {v2, v1}, Lcom/amazonaws/auth/ChunkContentIterator;-><init>([B)V

    iput-object v2, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩹:Lcom/amazonaws/auth/ChunkContentIterator;

    const/4 v1, 0x1

    goto :goto_1

    :cond_6
    if-ge v4, v1, :cond_7

    .line 336
    new-array v1, v4, [B

    .line 337
    invoke-static {v3, v0, v1, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v3, v1

    .line 340
    :cond_7
    invoke-direct {p0, v3}, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۧ([B)[B

    move-result-object v1

    .line 341
    new-instance v2, Lcom/amazonaws/auth/ChunkContentIterator;

    invoke-direct {v2, v1}, Lcom/amazonaws/auth/ChunkContentIterator;-><init>([B)V

    iput-object v2, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩹:Lcom/amazonaws/auth/ChunkContentIterator;

    const/4 v1, 0x0

    .line 173
    :goto_1
    iput-boolean v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۤ:Z

    .line 177
    :cond_8
    iget-object v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩹:Lcom/amazonaws/auth/ChunkContentIterator;

    invoke-virtual {v1, p1, p2, p3}, Lcom/amazonaws/auth/ChunkContentIterator;->֫([BII)I

    move-result p1

    if-lez p1, :cond_9

    .line 179
    iput-boolean v0, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۫:Z

    .line 180
    sget-object p2, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->֫֫:Lcom/amazonaws/logging/Log;

    invoke-interface {p2}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result p3

    if-eqz p3, :cond_9

    .line 181
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " byte read from the stream."

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    :cond_9
    return p1

    .line 163
    :cond_a
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final declared-synchronized reset()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 246
    :try_start_0
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkInputStream;->ܽ()V

    const/4 v1, 0x0

    .line 248
    iput-object v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩹:Lcom/amazonaws/auth/ChunkContentIterator;

    .line 249
    iget-object v2, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۗ:Ljava/lang/String;

    iput-object v2, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ܰ:Ljava/lang/String;

    .line 252
    iget-object v2, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۬:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->markSupported()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 253
    sget-object v2, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->֫֫:Lcom/amazonaws/logging/Log;

    invoke-interface {v2}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported)."

    .line 254
    invoke-interface {v2, v3}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 257
    :cond_0
    iget-object v2, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۬:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->reset()V

    goto :goto_0

    .line 259
    :cond_1
    sget-object v2, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->֫֫:Lcom/amazonaws/logging/Log;

    invoke-interface {v2}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream)."

    .line 260
    invoke-interface {v2, v3}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 263
    :cond_2
    iget-object v2, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۙ:Lcom/amazonaws/auth/DecodedStreamBuffer;

    if-eqz v2, :cond_3

    .line 266
    invoke-virtual {v2}, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܽ()V

    .line 269
    :goto_0
    iput-object v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->᩹:Lcom/amazonaws/auth/ChunkContentIterator;

    const/4 v1, 0x1

    .line 270
    iput-boolean v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۫:Z

    const/4 v1, 0x0

    .line 271
    iput-boolean v1, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ۤ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 272
    monitor-exit v0

    return-void

    .line 264
    :cond_3
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Cannot reset the stream because the mark is not set."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 272
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final skip(J)J
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    return-wide v0

    :cond_0
    const-wide/32 v2, 0x40000

    .line 193
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    .line 194
    new-array v2, v3, [B

    move-wide v4, p1

    :goto_0
    cmp-long v6, v4, v0

    if-lez v6, :cond_2

    const/4 v6, 0x0

    .line 196
    invoke-virtual {p0, v2, v6, v3}, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->read([BII)I

    move-result v6

    if-gez v6, :cond_1

    goto :goto_1

    :cond_1
    int-to-long v6, v6

    sub-long/2addr v4, v6

    goto :goto_0

    :cond_2
    :goto_1
    sub-long/2addr p1, v4

    return-wide p1
.end method

.method public final ᩳ()Ljava/io/InputStream;
    .locals 1

    .line 383
    iget-object v0, p0, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->۬:Ljava/io/InputStream;

    return-object v0
.end method
