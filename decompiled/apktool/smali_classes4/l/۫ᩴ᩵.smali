.class public abstract Ll/۫ᩴ᩵;
.super Ll/ۗᩴ᩵;
.source "LA24"

# interfaces
.implements Ll/֫ۖ᩵;


# instance fields
.field public ۖ֫:Z

.field public ۘ֫:Z

.field public ۡ֫:Ljava/lang/Exception;

.field public ۢ֫:Z

.field public ܺ֫:Ljava/lang/Long;

.field public ᩷֫:Z


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Ll/ۗᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    return-void
.end method


# virtual methods
.method public final getException()Ljava/lang/Exception;
    .locals 1

    .line 232
    iget-object v0, p0, Ll/۫ᩴ᩵;->ۡ֫:Ljava/lang/Exception;

    return-object v0
.end method

.method public final reset()V
    .locals 1

    .line 91
    invoke-super {p0}, Ll/ۗᩴ᩵;->reset()V

    const/4 v0, 0x0

    .line 92
    iput-boolean v0, p0, Ll/۫ᩴ᩵;->ۖ֫:Z

    return-void
.end method

.method public final ֫(II[B)V
    .locals 2

    .line 273
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۖ֫()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 274
    new-array v0, p2, [B

    .line 275
    invoke-static {p3, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 276
    invoke-virtual {p0, v0}, Ll/ۗᩴ᩵;->ۧ([B)V

    .line 279
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ll/۫ᩴ᩵;->ۧ(II[B)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 221
    iput-boolean v1, p0, Ll/۫ᩴ᩵;->᩷֫:Z

    .line 284
    invoke-virtual {p0}, Ll/۫ᩴ᩵;->᩷()V

    return-void

    .line 280
    :cond_1
    new-instance p1, Ll/ᩳۖ᩵;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Signature verification failed for "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 280
    throw p1
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x1

    .line 123
    iput-boolean v0, p0, Ll/۫ᩴ᩵;->ۢ֫:Z

    .line 124
    iput-object p1, p0, Ll/۫ᩴ᩵;->ۡ֫:Ljava/lang/Exception;

    .line 125
    iput-boolean v0, p0, Ll/۫ᩴ᩵;->ۖ֫:Z

    move-object v0, p0

    .line 126
    monitor-enter v0

    .line 127
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 128
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/Long;)V
    .locals 0

    .line 205
    iput-object p1, p0, Ll/۫ᩴ᩵;->ܺ֫:Ljava/lang/Long;

    return-void
.end method

.method public ֫(Ll/۟ܺ᩵;)V
    .locals 1

    .line 66
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->getNext()Ll/ۗᩴ᩵;

    move-result-object v0

    check-cast v0, Ll/֫ۖ᩵;

    if-eqz v0, :cond_0

    .line 79
    invoke-interface {v0, p1}, Ll/֫ۖ᩵;->֫(Ll/۟ܺ᩵;)V

    :cond_0
    return-void
.end method

.method public final ۗ()V
    .locals 2

    const/4 v0, 0x1

    .line 139
    iput-boolean v0, p0, Ll/۫ᩴ᩵;->ۢ֫:Z

    move-object v0, p0

    .line 140
    monitor-enter v0

    .line 141
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 142
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۘ()Z
    .locals 1

    .line 175
    iget-boolean v0, p0, Ll/۫ᩴ᩵;->ۢ֫:Z

    return v0
.end method

.method public final ۘ֫()Z
    .locals 1

    .line 213
    iget-boolean v0, p0, Ll/۫ᩴ᩵;->᩷֫:Z

    return v0
.end method

.method public final ۟()Z
    .locals 1

    .line 164
    iget-boolean v0, p0, Ll/۫ᩴ᩵;->ۖ֫:Z

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 250
    iget-boolean v0, p0, Ll/۫ᩴ᩵;->ۘ֫:Z

    return v0
.end method

.method public final ۤ()V
    .locals 1

    const/4 v0, 0x0

    .line 153
    iput-boolean v0, p0, Ll/۫ᩴ᩵;->ۖ֫:Z

    return-void
.end method

.method public final ۧ(II[B)Z
    .locals 3

    .line 300
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->getDigest()Ll/ۛᩴ᩵;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 301
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۨ()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܽ֫()Ll/֨ۡ᩵;

    move-result-object v2

    check-cast v2, Ll/ܰۡ᩵;

    invoke-virtual {v2}, Ll/ܰۡ᩵;->᩷֫()Z

    move-result v2

    if-nez v2, :cond_0

    .line 241
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result v2

    if-nez v2, :cond_1

    .line 304
    :cond_0
    invoke-virtual {v0, p3, p1, p2, p0}, Ll/ۛᩴ᩵;->֫([BIILl/ܰܺ᩵;)Z

    move-result p1

    .line 305
    iput-boolean p1, p0, Ll/۫ᩴ᩵;->ۘ֫:Z

    xor-int/2addr p1, v1

    return p1

    :cond_1
    return v1
.end method

.method public final ᩳ()Ljava/lang/Long;
    .locals 1

    .line 194
    iget-object v0, p0, Ll/۫ᩴ᩵;->ܺ֫:Ljava/lang/Long;

    return-object v0
.end method

.method public final ᩴ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 221
    iput-boolean v0, p0, Ll/۫ᩴ᩵;->᩷֫:Z

    return-void
.end method

.method public final ᩷()V
    .locals 2

    .line 103
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result v0

    const/16 v1, 0x103

    if-ne v0, v1, :cond_0

    move-object v0, p0

    .line 104
    monitor-enter v0

    .line 105
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 106
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    const/4 v0, 0x1

    .line 109
    iput-boolean v0, p0, Ll/۫ᩴ᩵;->ۖ֫:Z

    move-object v0, p0

    .line 110
    monitor-enter v0

    .line 111
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 112
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v1
.end method
