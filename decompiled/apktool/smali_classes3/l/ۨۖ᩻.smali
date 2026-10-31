.class public final Ll/ۨۖ᩻;
.super Ljava/io/OutputStream;
.source "Q87M"


# instance fields
.field public final synthetic ᩶:Ll/ۤܽ֡;

.field public final synthetic ᩸:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic ᩹:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Ll/ۤܽ֡;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 316
    iput-object p1, p0, Ll/ۨۖ᩻;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Ll/ۨۖ᩻;->᩶:Ll/ۤܽ֡;

    iput-object p3, p0, Ll/ۨۖ᩻;->᩸:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method

.method private ֫()V
    .locals 3

    .line 319
    iget-object v0, p0, Ll/ۨۖ᩻;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    .line 321
    :cond_0
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 345
    invoke-direct {p0}, Ll/ۨۖ᩻;->֫()V

    .line 346
    iget-object v0, p0, Ll/ۨۖ᩻;->᩶:Ll/ۤܽ֡;

    invoke-interface {v0}, Ll/ۚᩳ֡;->close()V

    .line 348
    :try_start_0
    iget-object v0, p0, Ll/ۨۖ᩻;->᩸:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 352
    :catch_0
    invoke-direct {p0}, Ll/ۨۖ᩻;->֫()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 339
    invoke-direct {p0}, Ll/ۨۖ᩻;->֫()V

    .line 340
    iget-object v0, p0, Ll/ۨۖ᩻;->᩶:Ll/ۤܽ֡;

    invoke-interface {v0}, Ll/ۤܽ֡;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 1

    .line 327
    invoke-direct {p0}, Ll/ۨۖ᩻;->֫()V

    .line 328
    iget-object v0, p0, Ll/ۨۖ᩻;->᩶:Ll/ۤܽ֡;

    invoke-interface {v0, p1}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 333
    invoke-direct {p0}, Ll/ۨۖ᩻;->֫()V

    .line 334
    iget-object v0, p0, Ll/ۨۖ᩻;->᩶:Ll/ۤܽ֡;

    invoke-interface {v0, p2, p3, p1}, Ll/ۤܽ֡;->ᩳ(II[B)Ll/ۤܽ֡;

    return-void
.end method
