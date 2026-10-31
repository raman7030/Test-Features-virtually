.class public final Ll/ۘ۟᩵;
.super Ljava/lang/Object;
.source "O5QJ"


# instance fields
.field public ֫:Ll/֡۟᩵;

.field public ۜ:Ll/ᩴ۟᩵;

.field public ۡ:Ll/ۡ۟᩵;

.field public ۢ:J

.field public ۧ:Ll/ᩴ۟᩵;

.field public ܳ:Ljava/lang/String;

.field public ܺ:J

.field public ܽ:I

.field public ܿ:Ll/۫ܰ᩵;

.field public ᩳ:Ll/۬ܰ᩵;

.field public ᩷:Ll/ܳ۟᩵;

.field public ᩻:Ll/ᩴ۟᩵;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 317
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 306
    iput v0, p0, Ll/ۘ۟᩵;->ܽ:I

    .line 318
    new-instance v0, Ll/۫ܰ᩵;

    invoke-direct {v0}, Ll/۫ܰ᩵;-><init>()V

    iput-object v0, p0, Ll/ۘ۟᩵;->ܿ:Ll/۫ܰ᩵;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ᩴ۟᩵;)V
    .locals 1

    .line 408
    iget-object v0, p1, Ll/ᩴ۟᩵;->᩸:Ll/֡۟᩵;

    if-nez v0, :cond_3

    .line 410
    iget-object v0, p1, Ll/ᩴ۟᩵;->ۤ:Ll/ᩴ۟᩵;

    if-nez v0, :cond_2

    .line 412
    iget-object v0, p1, Ll/ᩴ۟᩵;->᩶:Ll/ᩴ۟᩵;

    if-nez v0, :cond_1

    .line 414
    iget-object p1, p1, Ll/ᩴ۟᩵;->ۛ:Ll/ᩴ۟᩵;

    if-nez p1, :cond_0

    return-void

    .line 415
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, ".priorResponse != null"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 413
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, ".cacheResponse != null"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 411
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, ".networkResponse != null"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 409
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, ".body != null"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/ᩴ۟᩵;
    .locals 3

    .line 442
    iget-object v0, p0, Ll/ۘ۟᩵;->ۡ:Ll/ۡ۟᩵;

    if-eqz v0, :cond_3

    .line 443
    iget-object v0, p0, Ll/ۘ۟᩵;->᩷:Ll/ܳ۟᩵;

    if-eqz v0, :cond_2

    .line 444
    iget v0, p0, Ll/ۘ۟᩵;->ܽ:I

    if-ltz v0, :cond_1

    .line 445
    iget-object v0, p0, Ll/ۘ۟᩵;->ܳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 446
    new-instance v0, Ll/ᩴ۟᩵;

    invoke-direct {v0, p0}, Ll/ᩴ۟᩵;-><init>(Ll/ۘ۟᩵;)V

    return-object v0

    .line 445
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "message == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 444
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "code < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ۘ۟᩵;->ܽ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 443
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 442
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "request == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 347
    iput p1, p0, Ll/ۘ۟᩵;->ܽ:I

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 437
    iput-wide p1, p0, Ll/ۘ۟᩵;->ۢ:J

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    const-string v0, "Warning"

    .line 375
    iget-object v1, p0, Ll/ۘ۟᩵;->ܿ:Ll/۫ܰ᩵;

    invoke-virtual {v1, v0, p1}, Ll/۫ܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/֡۟᩵;)V
    .locals 0

    .line 391
    iput-object p1, p0, Ll/ۘ۟᩵;->֫:Ll/֡۟᩵;

    return-void
.end method

.method public final ֫(Ll/ۡ۟᩵;)V
    .locals 0

    .line 337
    iput-object p1, p0, Ll/ۘ۟᩵;->ۡ:Ll/ۡ۟᩵;

    return-void
.end method

.method public final ֫(Ll/ۤܰ᩵;)V
    .locals 0

    .line 386
    invoke-virtual {p1}, Ll/ۤܰ᩵;->֫()Ll/۫ܰ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ۟᩵;->ܿ:Ll/۫ܰ᩵;

    return-void
.end method

.method public final ֫(Ll/۬ܰ᩵;)V
    .locals 0

    .line 357
    iput-object p1, p0, Ll/ۘ۟᩵;->ᩳ:Ll/۬ܰ᩵;

    return-void
.end method

.method public final ֫(Ll/ܳ۟᩵;)V
    .locals 0

    .line 342
    iput-object p1, p0, Ll/ۘ۟᩵;->᩷:Ll/ܳ۟᩵;

    return-void
.end method

.method public final ֫(Ll/ᩴ۟᩵;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "cacheResponse"

    .line 402
    invoke-static {v0, p1}, Ll/ۘ۟᩵;->֫(Ljava/lang/String;Ll/ᩴ۟᩵;)V

    .line 403
    :cond_0
    iput-object p1, p0, Ll/ۘ۟᩵;->ۧ:Ll/ᩴ۟᩵;

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 366
    iget-object v0, p0, Ll/ۘ۟᩵;->ܿ:Ll/۫ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "Proxy-Authenticate"

    .line 383
    invoke-static {v1}, Ll/ۤܰ᩵;->ܽ(Ljava/lang/String;)V

    const-string v2, "OkHttp-Preemptive"

    .line 384
    invoke-static {v2, v1}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    invoke-virtual {v0, v1}, Ll/۫ܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 386
    invoke-virtual {v0, v1, v2}, Ll/۫ܰ᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(J)V
    .locals 0

    .line 432
    iput-wide p1, p0, Ll/ۘ۟᩵;->ܺ:J

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 352
    iput-object p1, p0, Ll/ۘ۟᩵;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ(Ll/ᩴ۟᩵;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "networkResponse"

    .line 396
    invoke-static {v0, p1}, Ll/ۘ۟᩵;->֫(Ljava/lang/String;Ll/ᩴ۟᩵;)V

    .line 397
    :cond_0
    iput-object p1, p0, Ll/ۘ۟᩵;->᩻:Ll/ᩴ۟᩵;

    return-void
.end method

.method public final ܽ(Ll/ᩴ۟᩵;)V
    .locals 1

    .line 426
    iget-object v0, p1, Ll/ᩴ۟᩵;->᩸:Ll/֡۟᩵;

    if-nez v0, :cond_0

    .line 421
    iput-object p1, p0, Ll/ۘ۟᩵;->ۜ:Ll/ᩴ۟᩵;

    return-void

    .line 427
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "priorResponse.body != null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
