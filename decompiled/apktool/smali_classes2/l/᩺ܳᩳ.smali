.class public final Ll/᩺ܳᩳ;
.super Ll/ᩴܳᩳ;
.source "8B3M"


# instance fields
.field public final synthetic ֫֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ۟:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ۧ֫:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ܰ:Ll/ܰܳᩳ;

.field public ᩺:I


# direct methods
.method public constructor <init>(Ll/ܰܳᩳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    .line 239
    iput-object p1, p0, Ll/᩺ܳᩳ;->ܰ:Ll/ܰܳᩳ;

    iput-object p2, p0, Ll/᩺ܳᩳ;->֫֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Ll/᩺ܳᩳ;->۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p4, p0, Ll/᩺ܳᩳ;->ۧ֫:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p1, 0x0

    .line 18
    invoke-direct {p0, p1}, Ll/֨ܳᩳ;-><init>(Ll/ۗܺ᩷;)V

    const/4 p1, -0x1

    .line 240
    iput p1, p0, Ll/᩺ܳᩳ;->᩺:I

    return-void
.end method


# virtual methods
.method public final getStream(I)Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 1

    .line 244
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Extraction stream requested in test mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setOperationResult(Lnet/sf/sevenzipjbinding/ExtractOperationResult;)V
    .locals 3

    .line 275
    iget-object v0, p0, Ll/᩺ܳᩳ;->֫֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    .line 276
    iget-object v2, p0, Ll/᩺ܳᩳ;->۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v1

    .line 277
    sget-object v2, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->OK:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    if-eq p1, v2, :cond_1

    .line 278
    new-instance v0, Ll/ܽ᩻ᩳ;

    invoke-direct {v0, p1, v1}, Ll/ܽ᩻ᩳ;-><init>(Lnet/sf/sevenzipjbinding/ExtractOperationResult;Z)V

    .line 0
    :goto_0
    iget-object v1, p0, Ll/᩺ܳᩳ;->ۧ֫:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 280
    :cond_0
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    if-eqz v0, :cond_2

    .line 282
    iget-object p1, p0, Ll/᩺ܳᩳ;->ܰ:Ll/ܰܳᩳ;

    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_2

    .line 283
    invoke-interface {p1}, Ll/ܰܳᩳ;->᩹()V

    :cond_2
    return-void
.end method

.method public final ۢ(I)Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 5

    .line 249
    iget-object v0, p0, Ll/᩺ܳᩳ;->ܰ:Ll/ܰܳᩳ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    const-string v2, "Canceled"

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 252
    iget-object v3, p0, Ll/᩺ܳᩳ;->֫֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 253
    iget-object v1, p0, Ll/᩺ܳᩳ;->۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-interface {v0, p1}, Ll/ܰܳᩳ;->ۜ(I)Z

    move-result v4

    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 254
    invoke-interface {v0, p1}, Ll/ܰܳᩳ;->᩷(I)V

    .line 255
    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 258
    invoke-virtual {v3, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 259
    new-instance p1, Ll/ۜ᩸ܽ;

    invoke-direct {p1, v0}, Ll/ۜ᩸ܽ;-><init>(Ljava/lang/Object;)V

    return-object p1

    .line 256
    :cond_0
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {p1, v2}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 250
    :cond_1
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {p1, v2}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized ᩳ(JJ)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 289
    :try_start_0
    iget-object v1, p0, Ll/᩺ܳᩳ;->ܰ:Ll/ܰܳᩳ;

    invoke-interface {v1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-nez v1, :cond_1

    .line 292
    invoke-static {p1, p2, p3, p4}, Ll/᩵ۛۡ;->֫(JJ)I

    move-result p1

    .line 293
    iget p2, p0, Ll/᩺ܳᩳ;->᩺:I

    if-eq p1, p2, :cond_0

    .line 294
    iput p1, p0, Ll/᩺ܳᩳ;->᩺:I

    .line 295
    iget-object p2, p0, Ll/᩺ܳᩳ;->ܰ:Ll/ܰܳᩳ;

    invoke-interface {p2, p1}, Ll/ܰܳᩳ;->֫(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 297
    :cond_0
    monitor-exit v0

    return-void

    .line 290
    :cond_1
    :try_start_1
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string p2, "Canceled"

    invoke-direct {p1, p2}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 297
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ᩶֫()V
    .locals 2

    .line 269
    iget-object v0, p0, Ll/᩺ܳᩳ;->֫֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 270
    iget-object v0, p0, Ll/᩺ܳᩳ;->۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
