.class public final Ll/ᩴ۟᩵;
.super Ljava/lang/Object;
.source "O5QJ"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ۗ:Ll/۬ܰ᩵;

.field public final ۙ:I

.field public final ۛ:Ll/ᩴ۟᩵;

.field public final ۟:J

.field public final ۤ:Ll/ᩴ۟᩵;

.field public final ۨ:Ll/ܳ۟᩵;

.field public final ۫:Ljava/lang/String;

.field public final ۬:Ll/ۤܰ᩵;

.field public final ܰ:Ll/ۡ۟᩵;

.field public final ᩶:Ll/ᩴ۟᩵;

.field public final ᩸:Ll/֡۟᩵;

.field public volatile ᩹:Ll/ۧܰ᩵;

.field public final ᩺:J


# direct methods
.method public constructor <init>(Ll/ۘ۟᩵;)V
    .locals 2

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iget-object v0, p1, Ll/ۘ۟᩵;->ۡ:Ll/ۡ۟᩵;

    iput-object v0, p0, Ll/ᩴ۟᩵;->ܰ:Ll/ۡ۟᩵;

    .line 61
    iget-object v0, p1, Ll/ۘ۟᩵;->᩷:Ll/ܳ۟᩵;

    iput-object v0, p0, Ll/ᩴ۟᩵;->ۨ:Ll/ܳ۟᩵;

    .line 62
    iget v0, p1, Ll/ۘ۟᩵;->ܽ:I

    iput v0, p0, Ll/ᩴ۟᩵;->ۙ:I

    .line 63
    iget-object v0, p1, Ll/ۘ۟᩵;->ܳ:Ljava/lang/String;

    iput-object v0, p0, Ll/ᩴ۟᩵;->۫:Ljava/lang/String;

    .line 64
    iget-object v0, p1, Ll/ۘ۟᩵;->ᩳ:Ll/۬ܰ᩵;

    iput-object v0, p0, Ll/ᩴ۟᩵;->ۗ:Ll/۬ܰ᩵;

    .line 65
    iget-object v0, p1, Ll/ۘ۟᩵;->ܿ:Ll/۫ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    new-instance v1, Ll/ۤܰ᩵;

    invoke-direct {v1, v0}, Ll/ۤܰ᩵;-><init>(Ll/۫ܰ᩵;)V

    .line 65
    iput-object v1, p0, Ll/ᩴ۟᩵;->۬:Ll/ۤܰ᩵;

    .line 66
    iget-object v0, p1, Ll/ۘ۟᩵;->֫:Ll/֡۟᩵;

    iput-object v0, p0, Ll/ᩴ۟᩵;->᩸:Ll/֡۟᩵;

    .line 67
    iget-object v0, p1, Ll/ۘ۟᩵;->᩻:Ll/ᩴ۟᩵;

    iput-object v0, p0, Ll/ᩴ۟᩵;->ۤ:Ll/ᩴ۟᩵;

    .line 68
    iget-object v0, p1, Ll/ۘ۟᩵;->ۧ:Ll/ᩴ۟᩵;

    iput-object v0, p0, Ll/ᩴ۟᩵;->᩶:Ll/ᩴ۟᩵;

    .line 69
    iget-object v0, p1, Ll/ۘ۟᩵;->ۜ:Ll/ᩴ۟᩵;

    iput-object v0, p0, Ll/ᩴ۟᩵;->ۛ:Ll/ᩴ۟᩵;

    .line 70
    iget-wide v0, p1, Ll/ۘ۟᩵;->ܺ:J

    iput-wide v0, p0, Ll/ᩴ۟᩵;->۟:J

    .line 71
    iget-wide v0, p1, Ll/ۘ۟᩵;->ۢ:J

    iput-wide v0, p0, Ll/ᩴ۟᩵;->᩺:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 285
    iget-object v0, p0, Ll/ᩴ۟᩵;->᩸:Ll/֡۟᩵;

    if-eqz v0, :cond_0

    .line 288
    invoke-virtual {v0}, Ll/֡۟᩵;->close()V

    return-void

    .line 286
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 292
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Response{protocol="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ᩴ۟᩵;->ۨ:Ll/ܳ۟᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩴ۟᩵;->ۙ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩴ۟᩵;->۫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩴ۟᩵;->ܰ:Ll/ۡ۟᩵;

    .line 49
    iget-object v1, v1, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    .line 299
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ll/ۡ۟᩵;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ᩴ۟᩵;->ܰ:Ll/ۡ۟᩵;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Ll/ᩴ۟᩵;->۬:Ll/ۤܰ᩵;

    invoke-virtual {v0, p1}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()Ll/֡۟᩵;
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ᩴ۟᩵;->᩸:Ll/֡۟᩵;

    return-object v0
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ᩴ۟᩵;->۫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۘ()Ll/ۘ۟᩵;
    .locals 3

    .line 181
    new-instance v0, Ll/ۘ۟᩵;

    .line 321
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 322
    iget-object v1, p0, Ll/ᩴ۟᩵;->ܰ:Ll/ۡ۟᩵;

    iput-object v1, v0, Ll/ۘ۟᩵;->ۡ:Ll/ۡ۟᩵;

    .line 323
    iget-object v1, p0, Ll/ᩴ۟᩵;->ۨ:Ll/ܳ۟᩵;

    iput-object v1, v0, Ll/ۘ۟᩵;->᩷:Ll/ܳ۟᩵;

    .line 324
    iget v1, p0, Ll/ᩴ۟᩵;->ۙ:I

    iput v1, v0, Ll/ۘ۟᩵;->ܽ:I

    .line 325
    iget-object v1, p0, Ll/ᩴ۟᩵;->۫:Ljava/lang/String;

    iput-object v1, v0, Ll/ۘ۟᩵;->ܳ:Ljava/lang/String;

    .line 326
    iget-object v1, p0, Ll/ᩴ۟᩵;->ۗ:Ll/۬ܰ᩵;

    iput-object v1, v0, Ll/ۘ۟᩵;->ᩳ:Ll/۬ܰ᩵;

    .line 327
    iget-object v1, p0, Ll/ᩴ۟᩵;->۬:Ll/ۤܰ᩵;

    invoke-virtual {v1}, Ll/ۤܰ᩵;->֫()Ll/۫ܰ᩵;

    move-result-object v1

    iput-object v1, v0, Ll/ۘ۟᩵;->ܿ:Ll/۫ܰ᩵;

    .line 328
    iget-object v1, p0, Ll/ᩴ۟᩵;->᩸:Ll/֡۟᩵;

    iput-object v1, v0, Ll/ۘ۟᩵;->֫:Ll/֡۟᩵;

    .line 329
    iget-object v1, p0, Ll/ᩴ۟᩵;->ۤ:Ll/ᩴ۟᩵;

    iput-object v1, v0, Ll/ۘ۟᩵;->᩻:Ll/ᩴ۟᩵;

    .line 330
    iget-object v1, p0, Ll/ᩴ۟᩵;->᩶:Ll/ᩴ۟᩵;

    iput-object v1, v0, Ll/ۘ۟᩵;->ۧ:Ll/ᩴ۟᩵;

    .line 331
    iget-object v1, p0, Ll/ᩴ۟᩵;->ۛ:Ll/ᩴ۟᩵;

    iput-object v1, v0, Ll/ۘ۟᩵;->ۜ:Ll/ᩴ۟᩵;

    .line 332
    iget-wide v1, p0, Ll/ᩴ۟᩵;->۟:J

    iput-wide v1, v0, Ll/ۘ۟᩵;->ܺ:J

    .line 333
    iget-wide v1, p0, Ll/ᩴ۟᩵;->᩺:J

    iput-wide v1, v0, Ll/ۘ۟᩵;->ۢ:J

    return-object v0
.end method

.method public final ۜ()Z
    .locals 2

    const/16 v0, 0xc8

    .line 106
    iget v1, p0, Ll/ᩴ۟᩵;->ۙ:I

    if-lt v1, v0, :cond_0

    const/16 v0, 0x12c

    if-ge v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Ll/۬ܰ᩵;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ᩴ۟᩵;->ۗ:Ll/۬ܰ᩵;

    return-object v0
.end method

.method public final ܶ()J
    .locals 2

    .line 265
    iget-wide v0, p0, Ll/ᩴ۟᩵;->۟:J

    return-wide v0
.end method

.method public final ܽ()Ll/ۧܰ᩵;
    .locals 1

    .line 255
    iget-object v0, p0, Ll/ᩴ۟᩵;->᩹:Ll/ۧܰ᩵;

    if-eqz v0, :cond_0

    return-object v0

    .line 256
    :cond_0
    iget-object v0, p0, Ll/ᩴ۟᩵;->۬:Ll/ۤܰ᩵;

    invoke-static {v0}, Ll/ۧܰ᩵;->֫(Ll/ۤܰ᩵;)Ll/ۧܰ᩵;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ۟᩵;->᩹:Ll/ۧܰ᩵;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 98
    iget v0, p0, Ll/ᩴ۟᩵;->ۙ:I

    return v0
.end method

.method public final ᩴ()Ll/ᩴ۟᩵;
    .locals 1

    .line 224
    iget-object v0, p0, Ll/ᩴ۟᩵;->ۛ:Ll/ᩴ۟᩵;

    return-object v0
.end method

.method public final ᩵()J
    .locals 2

    .line 274
    iget-wide v0, p0, Ll/ᩴ۟᩵;->᩺:J

    return-wide v0
.end method

.method public final ᩻()Ll/ۤܰ᩵;
    .locals 1

    .line 136
    iget-object v0, p0, Ll/ᩴ۟᩵;->۬:Ll/ۤܰ᩵;

    return-object v0
.end method
