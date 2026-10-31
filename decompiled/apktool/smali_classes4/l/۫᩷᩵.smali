.class public final Ll/۫᩷᩵;
.super Ljava/lang/Object;
.source "XA2E"

# interfaces
.implements Ll/ۨ᩷᩵;


# instance fields
.field public final ᩶:Ll/۬᩷᩵;

.field public final ᩸:Ll/ۡۢ᩵;

.field public final ᩹:Ll/۬᩷᩵;


# direct methods
.method public constructor <init>(Ll/ۡۢ᩵;)V
    .locals 4

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 271
    iput-object p1, p0, Ll/۫᩷᩵;->᩸:Ll/ۡۢ᩵;

    .line 272
    new-instance v0, Ll/۬᩷᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JmDNS("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۡۢ᩵;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ").Timer"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Ll/۬᩷᩵;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Ll/۫᩷᩵;->᩶:Ll/۬᩷᩵;

    .line 273
    new-instance v0, Ll/۬᩷᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۡۢ᩵;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ").State.Timer"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/۬᩷᩵;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Ll/۫᩷᩵;->᩹:Ll/۬᩷᩵;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 309
    iget-object v0, p0, Ll/۫᩷᩵;->᩹:Ll/۬᩷᩵;

    invoke-virtual {v0}, Ll/۬᩷᩵;->cancel()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 6

    .line 381
    new-instance v1, Ll/ܳۡ᩵;

    iget-object v0, p0, Ll/۫᩷᩵;->᩸:Ll/ۡۢ᩵;

    invoke-direct {v1, v0, p1}, Ll/ܳۡ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;)V

    .line 50
    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۧ֫()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۡۢ᩵;->۟()Z

    move-result p1

    if-nez p1, :cond_0

    const-wide/16 v2, 0xe1

    const-wide/16 v4, 0xe1

    .line 51
    iget-object v0, p0, Ll/۫᩷᩵;->᩶:Ll/۬᩷᩵;

    invoke-virtual/range {v0 .. v5}, Ll/۬᩷᩵;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۧ᩷᩵;Ljava/net/InetAddress;I)V
    .locals 2

    .line 390
    new-instance v0, Ll/ܽۡ᩵;

    iget-object v1, p0, Ll/۫᩷᩵;->᩸:Ll/ۡۢ᩵;

    invoke-direct {v0, v1, p1, p2, p3}, Ll/ܽۡ᩵;-><init>(Ll/ۡۢ᩵;Ll/ۧ᩷᩵;Ljava/net/InetAddress;I)V

    iget-object p1, p0, Ll/۫᩷᩵;->᩶:Ll/۬᩷᩵;

    invoke-virtual {v0, p1}, Ll/ܽۡ᩵;->֫(Ljava/util/Timer;)V

    return-void
.end method

.method public final ֫(Ll/᩶ۢ᩵;)V
    .locals 6

    .line 363
    new-instance v1, Ll/ܿۡ᩵;

    iget-object v0, p0, Ll/۫᩷᩵;->᩸:Ll/ۡۢ᩵;

    invoke-direct {v1, v0, p1}, Ll/ܿۡ᩵;-><init>(Ll/ۡۢ᩵;Ll/᩶ۢ᩵;)V

    .line 50
    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۧ֫()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۡۢ᩵;->۟()Z

    move-result p1

    if-nez p1, :cond_0

    const-wide/16 v2, 0xe1

    const-wide/16 v4, 0xe1

    .line 51
    iget-object v0, p0, Ll/۫᩷᩵;->᩶:Ll/۬᩷᩵;

    invoke-virtual/range {v0 .. v5}, Ll/۬᩷᩵;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_0
    return-void
.end method

.method public final ۖ()V
    .locals 6

    .line 354
    new-instance v1, Ll/ۧۡ᩵;

    iget-object v0, p0, Ll/۫᩷᩵;->᩸:Ll/ۡۢ᩵;

    invoke-direct {v1, v0}, Ll/ۧۡ᩵;-><init>(Ll/ۡۢ᩵;)V

    .line 43
    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->ۧ֫()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->۟()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v2, 0x2710

    const-wide/16 v4, 0x2710

    .line 44
    iget-object v0, p0, Ll/۫᩷᩵;->᩶:Ll/۬᩷᩵;

    invoke-virtual/range {v0 .. v5}, Ll/۬᩷᩵;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_0
    return-void
.end method

.method public final ۘ()V
    .locals 6

    .line 327
    new-instance v1, Ll/᩻ۡ᩵;

    iget-object v0, p0, Ll/۫᩷᩵;->᩸:Ll/ۡۢ᩵;

    invoke-direct {v1, v0}, Ll/᩻ۡ᩵;-><init>(Ll/ۡۢ᩵;)V

    .line 56
    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->ۧ֫()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->۟()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v2, 0x3e8

    const-wide/16 v4, 0x3e8

    .line 57
    iget-object v0, p0, Ll/۫᩷᩵;->᩹:Ll/۬᩷᩵;

    invoke-virtual/range {v0 .. v5}, Ll/۬᩷᩵;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_0
    return-void
.end method

.method public final ۜ()V
    .locals 6

    .line 345
    new-instance v1, Ll/ۜۡ᩵;

    iget-object v0, p0, Ll/۫᩷᩵;->᩸:Ll/ۡۢ᩵;

    invoke-direct {v1, v0}, Ll/ۜۡ᩵;-><init>(Ll/ۡۢ᩵;)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x3e8

    .line 54
    iget-object v0, p0, Ll/۫᩷᩵;->᩹:Ll/۬᩷᩵;

    invoke-virtual/range {v0 .. v5}, Ll/۬᩷᩵;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public final ܳ()V
    .locals 6

    .line 336
    new-instance v1, Ll/ۡۡ᩵;

    iget-object v0, p0, Ll/۫᩷᩵;->᩸:Ll/ۡۢ᩵;

    invoke-direct {v1, v0}, Ll/ۡۡ᩵;-><init>(Ll/ۡۢ᩵;)V

    .line 54
    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->ۧ֫()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->۟()Z

    move-result v0

    if-nez v0, :cond_0

    .line 55
    sget v0, Ll/۬ۢ᩵;->֫:I

    int-to-long v4, v0

    iget-object v0, p0, Ll/۫᩷᩵;->᩹:Ll/۬᩷᩵;

    move-wide v2, v4

    invoke-virtual/range {v0 .. v5}, Ll/۬᩷᩵;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 300
    iget-object v0, p0, Ll/۫᩷᩵;->᩶:Ll/۬᩷᩵;

    invoke-virtual {v0}, Ll/۬᩷᩵;->cancel()V

    return-void
.end method

.method public final ᩳ()V
    .locals 9

    .line 318
    new-instance v1, Ll/ۢۡ᩵;

    iget-object v0, p0, Ll/۫᩷᩵;->᩸:Ll/ۡۢ᩵;

    invoke-direct {v1, v0}, Ll/ۢۡ᩵;-><init>(Ll/ۡۢ᩵;)V

    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 60
    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->᩶()J

    move-result-wide v4

    sub-long v4, v2, v4

    const-wide/16 v6, 0x1388

    const/4 v0, 0x1

    cmp-long v8, v4, v6

    if-gez v8, :cond_0

    .line 61
    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v4

    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۡۢ᩵;->᩺()I

    move-result v5

    add-int/2addr v5, v0

    invoke-virtual {v4, v5}, Ll/ۡۢ᩵;->֫(I)V

    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v4

    invoke-virtual {v4, v0}, Ll/ۡۢ᩵;->֫(I)V

    .line 65
    :goto_0
    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ll/ۡۢ᩵;->ۧ(J)V

    .line 67
    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->ܰ()Z

    move-result v0

    iget-object v2, p0, Ll/۫᩷᩵;->᩹:Ll/۬᩷᩵;

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->᩺()I

    move-result v0

    const/16 v3, 0xa

    if-ge v0, v3, :cond_1

    .line 68
    invoke-static {}, Ll/ۡۢ᩵;->᩵֫()Ljava/util/Random;

    move-result-object v0

    const/16 v3, 0xfb

    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-long v3, v0

    const-wide/16 v5, 0xfa

    move-object v0, v2

    move-wide v2, v3

    move-wide v4, v5

    invoke-virtual/range {v0 .. v5}, Ll/۬᩷᩵;->schedule(Ljava/util/TimerTask;JJ)V

    return-void

    .line 69
    :cond_1
    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->ۧ֫()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v1}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->۟()Z

    move-result v0

    if-nez v0, :cond_2

    const-wide/16 v3, 0x3e8

    const-wide/16 v5, 0x3e8

    move-object v0, v2

    move-wide v2, v3

    move-wide v4, v5

    .line 70
    invoke-virtual/range {v0 .. v5}, Ll/۬᩷᩵;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_2
    return-void
.end method

.method public final ᩴ()V
    .locals 1

    .line 291
    iget-object v0, p0, Ll/۫᩷᩵;->᩹:Ll/۬᩷᩵;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    return-void
.end method

.method public final ᩻()V
    .locals 1

    .line 282
    iget-object v0, p0, Ll/۫᩷᩵;->᩶:Ll/۬᩷᩵;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    return-void
.end method
