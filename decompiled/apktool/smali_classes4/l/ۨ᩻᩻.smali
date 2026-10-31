.class public final Ll/ۨ᩻᩻;
.super Ljava/lang/Object;
.source "L8GV"

# interfaces
.implements Ll/ۖۖܽ;


# instance fields
.field public final synthetic ᩶:Ll/ܰ᩻᩻;

.field public ᩸:Z

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/ܰ᩻᩻;)V
    .locals 2

    .line 549
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ᩻᩻;->᩶:Ll/ܰ᩻᩻;

    const-wide/16 v0, 0x0

    .line 550
    iput-wide v0, p0, Ll/ۨ᩻᩻;->᩹:J

    const/4 p1, 0x0

    .line 551
    iput-boolean p1, p0, Ll/ۨ᩻᩻;->᩸:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 616
    iget-boolean v0, p0, Ll/ۨ᩻᩻;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 619
    iput-boolean v0, p0, Ll/ۨ᩻᩻;->᩸:Z

    .line 620
    iget-object v0, p0, Ll/ۨ᩻᩻;->᩶:Ll/ܰ᩻᩻;

    invoke-virtual {v0}, Ll/ܰ᩻᩻;->close()V

    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 596
    iget-object v0, p0, Ll/ۨ᩻᩻;->᩶:Ll/ܰ᩻᩻;

    invoke-static {v0}, Ll/ܰ᩻᩻;->ܽ(Ll/ܰ᩻᩻;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isClosed()Z
    .locals 1

    .line 611
    iget-boolean v0, p0, Ll/ۨ᩻᩻;->᩸:Z

    return v0
.end method

.method public final length()J
    .locals 2

    .line 577
    iget-object v0, p0, Ll/ۨ᩻᩻;->᩶:Ll/ܰ᩻᩻;

    invoke-virtual {v0}, Ll/ܰ᩻᩻;->ᩳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final position()J
    .locals 2

    .line 587
    iget-wide v0, p0, Ll/ۨ᩻᩻;->᩹:J

    return-wide v0
.end method

.method public final read([BII)I
    .locals 6

    .line 563
    iget-object v0, p0, Ll/ۨ᩻᩻;->᩶:Ll/ܰ᩻᩻;

    iget-wide v1, p0, Ll/ۨ᩻᩻;->᩹:J

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Ll/ܰ᩻᩻;->ܽ(J[BII)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    .line 565
    iget-wide p2, p0, Ll/ۨ᩻᩻;->᩹:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/ۨ᩻᩻;->᩹:J

    :cond_0
    return p1
.end method

.method public final seek(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 558
    iput-wide p1, p0, Ll/ۨ᩻᩻;->᩹:J

    return-void

    .line 556
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "offset < 0: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 556
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setLength(J)V
    .locals 0

    .line 582
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unsupported"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([BII)V
    .locals 0

    .line 572
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unsupported"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic ֫ܽ()Ljava/nio/channels/FileChannel;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۡ()Ll/ۖۖܽ;
    .locals 2

    .line 606
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final synthetic ۧ(JJ)Ll/ۖۖܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Ll/ܺۖܽ;->ۧ(Ll/ۖۖܽ;JJ)Ll/ۖۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ܺ()V
    .locals 0

    return-void
.end method

.method public final synthetic ܽ(JJ)Ll/ۖۖܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Ll/ܺۖܽ;->֫(Ll/ۖۖܽ;JJ)Ll/ۖۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic ᩻ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
