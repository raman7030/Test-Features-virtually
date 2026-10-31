.class public final Ll/ۨۚ᩻;
.super Ljava/lang/Object;
.source "S737"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:J

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 493
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 494
    iput-wide p1, p0, Ll/ۨۚ᩻;->ܽ:J

    .line 495
    iput-object p3, p0, Ll/ۨۚ᩻;->֫:Ljava/lang/String;

    .line 496
    iput-object p4, p0, Ll/ۨۚ᩻;->ۧ:Ljava/lang/String;

    .line 497
    iput-object p5, p0, Ll/ۨۚ᩻;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ۨۚ᩻;Ll/ۨۚ᩻;)V
    .locals 7

    .line 537
    iget-object v0, p0, Ll/ۨۚ᩻;->ۧ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۨۚ᩻;->֫:Ljava/lang/String;

    iget-wide v2, p0, Ll/ۨۚ᩻;->ܽ:J

    iget-wide v4, p1, Ll/ۨۚ᩻;->ܽ:J

    iget-object p0, p1, Ll/ۨۚ᩻;->֫:Ljava/lang/String;

    cmp-long v6, v2, v4

    if-nez v6, :cond_6

    .line 540
    invoke-static {v1}, Ll/᩺ۚ᩻;->֫(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "Remote resource ETag changed since it was opened"

    if-eqz v2, :cond_1

    .line 541
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_1

    .line 542
    :cond_0
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-eqz v0, :cond_3

    .line 544
    iget-object p1, p1, Ll/ۨۚ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    .line 545
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Remote resource Last-Modified changed since it was opened"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_0
    if-nez v0, :cond_5

    if-eqz v1, :cond_5

    .line 546
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    .line 547
    :cond_4
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_1
    return-void

    .line 538
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Remote resource length changed since it was opened"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 508
    iget-object v0, p0, Ll/ۨۚ᩻;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 530
    iget-object v0, p0, Ll/ۨۚ᩻;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 531
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Remote payload metadata changed since it was opened"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 514
    iget-object v0, p0, Ll/ۨۚ᩻;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ۨۚ᩻;
    .locals 7

    .line 525
    new-instance v6, Ll/ۨۚ᩻;

    iget-object v3, p0, Ll/ۨۚ᩻;->֫:Ljava/lang/String;

    iget-object v4, p0, Ll/ۨۚ᩻;->ۧ:Ljava/lang/String;

    iget-wide v1, p0, Ll/ۨۚ᩻;->ܽ:J

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ll/ۨۚ᩻;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method public final ܽ()J
    .locals 2

    .line 502
    iget-wide v0, p0, Ll/ۨۚ᩻;->ܽ:J

    return-wide v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 520
    iget-object v0, p0, Ll/ۨۚ᩻;->ᩳ:Ljava/lang/String;

    return-object v0
.end method
