.class public final synthetic Ll/ܽ۠ۜ;
.super Ljava/lang/Object;
.source "K74T"


# instance fields
.field public final synthetic ֫:Ll/ܽۚۜ;

.field public final synthetic ۧ:Ll/ܰܺܳ;

.field public final synthetic ܽ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۚۜ;Ll/ܰܺܳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ۠ۜ;->֫:Ll/ܽۚۜ;

    iput-object p2, p0, Ll/ܽ۠ۜ;->ۧ:Ll/ܰܺܳ;

    iput-object p3, p0, Ll/ܽ۠ۜ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۙ᩺֫;Ll/᩸᩺֫;)Ll/ܳ۠ۜ;
    .locals 12

    .line 829
    iget-object p1, p1, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    iget-object v0, p2, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 830
    invoke-static {v2}, Ll/ۢ۠ۜ;->֫(Landroid/net/Uri;)V

    .line 831
    iget-object p1, p0, Ll/ܽ۠ۜ;->֫:Ll/ܽۚۜ;

    invoke-virtual {p1, v2}, Ll/ܽۚۜ;->ۧ(Landroid/net/Uri;)Ll/ᩳۜܳ;

    move-result-object p1

    .line 832
    iget-wide v4, p2, Ll/᩹᩺֫;->᩹:J

    .line 833
    iget-wide v0, p2, Ll/᩹᩺֫;->᩸:J

    .line 834
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long p2, v4, v8

    if-ltz p2, :cond_4

    const-wide/16 v10, -0x1

    cmp-long p2, v0, v10

    if-nez p2, :cond_1

    cmp-long p2, v6, v4

    if-ltz p2, :cond_0

    sub-long v0, v6, v4

    goto :goto_0

    .line 840
    :cond_0
    new-instance p1, Ll/᩷۠ۜ;

    const-string p2, "HLS resource length is unknown"

    .line 1027
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 840
    throw p1

    :cond_1
    :goto_0
    move-wide v10, v0

    cmp-long p2, v10, v8

    if-lez p2, :cond_3

    const-wide v0, 0x7fffffffffffffffL

    sub-long/2addr v0, v10

    cmp-long p2, v4, v0

    if-gtz p2, :cond_3

    cmp-long p2, v6, v8

    if-ltz p2, :cond_2

    cmp-long p2, v4, v6

    if-gtz p2, :cond_3

    sub-long/2addr v6, v4

    cmp-long p2, v10, v6

    if-gtz p2, :cond_3

    .line 848
    :cond_2
    iget-object p2, p0, Ll/ܽ۠ۜ;->ۧ:Ll/ܰܺܳ;

    iget-object v0, p0, Ll/ܽ۠ۜ;->ܽ:Ljava/lang/String;

    invoke-static {p2, p1, v0}, Ll/᩷۬ۜ;->֫(Ll/ܰܺܳ;Ll/ᩳۜܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 849
    new-instance p1, Ll/ܳ۠ۜ;

    move-object v1, p1

    move-wide v6, v10

    invoke-direct/range {v1 .. v7}, Ll/ܳ۠ۜ;-><init>(Landroid/net/Uri;Ljava/lang/String;JJ)V

    return-object p1

    .line 846
    :cond_3
    new-instance p1, Ll/᩷۠ۜ;

    const-string p2, "HLS resource range is invalid"

    .line 1027
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 846
    throw p1

    .line 836
    :cond_4
    new-instance p1, Ll/᩷۠ۜ;

    const-string p2, "HLS resource offset is invalid"

    .line 1027
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 836
    throw p1
.end method
