.class public abstract Ll/ᩴܳᩳ;
.super Ll/֨ܳᩳ;
.source "VB6Q"

# interfaces
.implements Lnet/sf/sevenzipjbinding/IArchiveExtractCallback;


# instance fields
.field public ۛ:J

.field public ۨ:J


# virtual methods
.method public abstract getStream(I)Lnet/sf/sevenzipjbinding/ISequentialOutStream;
.end method

.method public final getStream(ILnet/sf/sevenzipjbinding/ExtractAskMode;)Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 1

    .line 33
    sget-object v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->TEST:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    if-ne p2, v0, :cond_0

    .line 34
    invoke-virtual {p0, p1}, Ll/ᩴܳᩳ;->ۢ(I)Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    move-result-object p1

    return-object p1

    .line 36
    :cond_0
    sget-object v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->EXTRACT:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    if-eq p2, v0, :cond_1

    .line 37
    invoke-virtual {p0}, Ll/ᩴܳᩳ;->᩶֫()V

    const/4 p1, 0x0

    return-object p1

    .line 40
    :cond_1
    invoke-virtual {p0, p1}, Ll/ᩴܳᩳ;->getStream(I)Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    move-result-object p1

    return-object p1
.end method

.method public final prepareOperation(Lnet/sf/sevenzipjbinding/ExtractAskMode;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized setCompleted(J)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 56
    :try_start_0
    iput-wide p1, p0, Ll/ᩴܳᩳ;->ۛ:J

    .line 57
    iget-wide v1, p0, Ll/ᩴܳᩳ;->ۨ:J

    invoke-virtual {p0, p1, p2, v1, v2}, Ll/ᩴܳᩳ;->ᩳ(JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized setTotal(J)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 50
    :try_start_0
    iput-wide p1, p0, Ll/ᩴܳᩳ;->ۨ:J

    .line 51
    iget-wide v1, p0, Ll/ᩴܳᩳ;->ۛ:J

    invoke-virtual {p0, v1, v2, p1, p2}, Ll/ᩴܳᩳ;->ᩳ(JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public abstract ۢ(I)Lnet/sf/sevenzipjbinding/ISequentialOutStream;
.end method

.method public abstract ᩳ(JJ)V
.end method

.method public abstract ᩶֫()V
.end method
