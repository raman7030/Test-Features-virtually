.class public final Ll/᩺ۖ᩻;
.super Ljava/io/OutputStream;
.source "Q87M"


# instance fields
.field public final synthetic ۗ:Ljava/util/ArrayList;

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ۫:Ljava/lang/String;

.field public final synthetic ۬:Ll/ۤܽ֡;

.field public final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ᩸:Ll/۟ۖ᩻;

.field public final synthetic ᩹:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public constructor <init>(Ll/۟ۖ᩻;Ljava/util/concurrent/atomic/AtomicReference;Ll/ۤܽ֡;Ljava/util/concurrent/CountDownLatch;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .line 414
    iput-object p1, p0, Ll/᩺ۖ᩻;->᩸:Ll/۟ۖ᩻;

    iput-object p2, p0, Ll/᩺ۖ᩻;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Ll/᩺ۖ᩻;->۬:Ll/ۤܽ֡;

    iput-object p4, p0, Ll/᩺ۖ᩻;->᩹:Ljava/util/concurrent/CountDownLatch;

    iput-object p5, p0, Ll/᩺ۖ᩻;->ۙ:Ljava/lang/String;

    iput-object p6, p0, Ll/᩺ۖ᩻;->۫:Ljava/lang/String;

    iput-object p7, p0, Ll/᩺ۖ᩻;->ۗ:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method

.method private ֫()V
    .locals 3

    .line 417
    iget-object v0, p0, Ll/᩺ۖ᩻;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    .line 419
    :cond_0
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 443
    invoke-direct {p0}, Ll/᩺ۖ᩻;->֫()V

    .line 444
    iget-object v0, p0, Ll/᩺ۖ᩻;->۬:Ll/ۤܽ֡;

    invoke-interface {v0}, Ll/ۚᩳ֡;->close()V

    .line 446
    :try_start_0
    iget-object v0, p0, Ll/᩺ۖ᩻;->᩹:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 450
    :catch_0
    invoke-direct {p0}, Ll/᩺ۖ᩻;->֫()V

    .line 452
    new-instance v0, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;

    iget-object v1, p0, Ll/᩺ۖ᩻;->᩸:Ll/۟ۖ᩻;

    invoke-static {v1}, Ll/۟ۖ᩻;->ۧ(Ll/۟ۖ᩻;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ll/᩺ۖ᩻;->ۗ:Ljava/util/ArrayList;

    iget-object v4, p0, Ll/᩺ۖ᩻;->ۙ:Ljava/lang/String;

    iget-object v5, p0, Ll/᩺ۖ᩻;->۫:Ljava/lang/String;

    invoke-direct {v0, v2, v4, v5, v3}, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 454
    :try_start_1
    invoke-static {v1}, Ll/۟ۖ᩻;->֫(Ll/۟ۖ᩻;)Ll/֫ۖ᩻;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;)Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;
    :try_end_1
    .catch Lcom/amazonaws/AmazonClientException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    .line 457
    :try_start_2
    new-instance v2, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;

    invoke-static {v1}, Ll/۟ۖ᩻;->ۧ(Ll/۟ۖ᩻;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v4, v5}, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 458
    invoke-static {v1}, Ll/۟ۖ᩻;->֫(Ll/۟ۖ᩻;)Ll/֫ۖ᩻;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 461
    :catchall_0
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final flush()V
    .locals 1

    .line 437
    invoke-direct {p0}, Ll/᩺ۖ᩻;->֫()V

    .line 438
    iget-object v0, p0, Ll/᩺ۖ᩻;->۬:Ll/ۤܽ֡;

    invoke-interface {v0}, Ll/ۤܽ֡;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 1

    .line 425
    invoke-direct {p0}, Ll/᩺ۖ᩻;->֫()V

    .line 426
    iget-object v0, p0, Ll/᩺ۖ᩻;->۬:Ll/ۤܽ֡;

    invoke-interface {v0, p1}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 431
    invoke-direct {p0}, Ll/᩺ۖ᩻;->֫()V

    .line 432
    iget-object v0, p0, Ll/᩺ۖ᩻;->۬:Ll/ۤܽ֡;

    invoke-interface {v0, p2, p3, p1}, Ll/ۤܽ֡;->ᩳ(II[B)Ll/ۤܽ֡;

    return-void
.end method
