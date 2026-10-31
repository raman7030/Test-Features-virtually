.class public final Ll/֫᩹ܿ;
.super Ll/᩷᩵ܿ;
.source "O17J"


# instance fields
.field public ܽ:Ll/ܿ᩹ܿ;

.field public final synthetic ᩳ:Ll/ۧ᩹ܿ;


# direct methods
.method public constructor <init>(Ll/ۧ᩹ܿ;Ll/ۧ᩹ܿ;Ll/ۜ᩵ܿ;)V
    .locals 0

    .line 546
    iput-object p1, p0, Ll/֫᩹ܿ;->ᩳ:Ll/ۧ᩹ܿ;

    invoke-direct {p0, p2, p3}, Ll/᩷᩵ܿ;-><init>(Ll/ܶ᩵ܿ;Ll/ۜ᩵ܿ;)V

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 5

    .line 577
    iget-object v0, p0, Ll/֫᩹ܿ;->ܽ:Ll/ܿ᩹ܿ;

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 580
    :cond_0
    invoke-virtual {v0}, Ll/ܿ᩹ܿ;->ۡ()I

    move-result v0

    int-to-long v0, v0

    iget-object v2, p0, Ll/֫᩹ܿ;->ܽ:Ll/ܿ᩹ܿ;

    invoke-virtual {v2}, Ll/ܿ᩹ܿ;->֫()I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ֫(I)V
    .locals 5

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 564
    :try_start_0
    iget-object v3, p0, Ll/֫᩹ܿ;->ᩳ:Ll/ۧ᩹ܿ;

    invoke-virtual {v3}, Ll/ۧ᩹ܿ;->᩶ۧ()Ll/᩵᩶ܿ;

    move-result-object v2

    .line 565
    iget-object v3, p0, Ll/᩷᩵ܿ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, p1, v4, v4}, Ll/᩵᩶ܿ;->֫(Ljava/lang/String;IZZ)V

    .line 566
    iget-object p1, p0, Ll/֫᩹ܿ;->ᩳ:Ll/ۧ᩹ܿ;

    invoke-virtual {p1}, Ll/ۧ᩹ܿ;->۬ۧ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 442
    iput-wide v0, v2, Ll/᩵᩶ܿ;->۬:J

    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_0

    iput-wide v0, v2, Ll/᩵᩶ܿ;->۬:J

    .line 572
    :cond_0
    throw p1

    :catch_0
    if-eqz v2, :cond_1

    .line 442
    iput-wide v0, v2, Ll/᩵᩶ܿ;->۬:J

    :cond_1
    return-void
.end method

.method public final ֫(J)V
    .locals 8

    const-wide v0, 0xffffffffL

    and-long/2addr v0, p1

    long-to-int v4, v0

    const/16 v0, 0x20

    shr-long/2addr p1, v0

    long-to-int v5, p1

    const-wide/16 p1, 0x0

    const/4 v0, 0x0

    .line 589
    :try_start_0
    iget-object v1, p0, Ll/֫᩹ܿ;->ᩳ:Ll/ۧ᩹ܿ;

    invoke-virtual {v1}, Ll/ۧ᩹ܿ;->᩶ۧ()Ll/᩵᩶ܿ;

    move-result-object v0

    .line 590
    iget-object v1, p0, Ll/᩷᩵ܿ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-virtual/range {v2 .. v7}, Ll/᩵᩶ܿ;->֫(Ljava/lang/String;IIZZ)V

    .line 591
    iget-object v1, p0, Ll/֫᩹ܿ;->ᩳ:Ll/ۧ᩹ܿ;

    invoke-virtual {v1}, Ll/ۧ᩹ܿ;->۬ۧ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 442
    iput-wide p1, v0, Ll/᩵᩶ܿ;->۬:J

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    nop

    goto :goto_1

    :goto_0
    if-eqz v0, :cond_0

    iput-wide p1, v0, Ll/᩵᩶ܿ;->۬:J

    .line 597
    :cond_0
    throw v1

    :goto_1
    if-eqz v0, :cond_1

    .line 442
    iput-wide p1, v0, Ll/᩵᩶ܿ;->۬:J

    :cond_1
    return-void
.end method

.method public final ۧ()I
    .locals 4

    .line 551
    iget-object v0, p0, Ll/֫᩹ܿ;->ᩳ:Ll/ۧ᩹ܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->᩶ۧ()Ll/᩵᩶ܿ;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 553
    :try_start_0
    iget-object v3, p0, Ll/᩷᩵ܿ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/᩵᩶ܿ;->ۜ(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v3

    iput-object v3, p0, Ll/֫᩹ܿ;->ܽ:Ll/ܿ᩹ܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 442
    iput-wide v1, v0, Ll/᩵᩶ܿ;->۬:J

    .line 557
    iget-object v0, p0, Ll/֫᩹ܿ;->ܽ:Ll/ܿ᩹ܿ;

    invoke-virtual {v0}, Ll/ܿ᩹ܿ;->᩻()I

    move-result v0

    return v0

    :catchall_0
    move-exception v3

    .line 442
    iput-wide v1, v0, Ll/᩵᩶ܿ;->۬:J

    .line 556
    throw v3
.end method
