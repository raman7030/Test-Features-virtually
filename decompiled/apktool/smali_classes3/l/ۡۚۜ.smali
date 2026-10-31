.class public final Ll/ۡۚۜ;
.super Ljava/lang/Object;
.source "U73P"

# interfaces
.implements Ll/۟ܰۜ;


# instance fields
.field public final ۙ:J

.field public final ᩶:Ll/ۙ᩶ۜ;

.field public final ᩸:Ll/ۙ᩶ۜ;

.field public final ᩹:J


# direct methods
.method public constructor <init>(Ll/ۙ᩶ۜ;Ll/ۙ᩶ۜ;)V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ll/ۡۚۜ;->᩸:Ll/ۙ᩶ۜ;

    .line 22
    iput-object p2, p0, Ll/ۡۚۜ;->᩶:Ll/ۙ᩶ۜ;

    .line 23
    invoke-virtual {p1}, Ll/ۙ᩶ۜ;->length()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۡۚۜ;->᩹:J

    .line 24
    invoke-virtual {p2}, Ll/ۙ᩶ۜ;->length()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۡۚۜ;->ۙ:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 57
    :try_start_0
    iget-object v0, p0, Ll/ۡۚۜ;->᩸:Ll/ۙ᩶ۜ;

    invoke-virtual {v0}, Ll/ۙ᩶ۜ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 62
    :goto_0
    :try_start_1
    iget-object v1, p0, Ll/ۡۚۜ;->᩶:Ll/ۙ᩶ۜ;

    invoke-virtual {v1}, Ll/ۙ᩶ۜ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_1

    .line 67
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    if-nez v0, :cond_1

    return-void

    .line 71
    :cond_1
    throw v0
.end method

.method public final length()J
    .locals 4

    .line 33
    iget-wide v0, p0, Ll/ۡۚۜ;->᩹:J

    iget-wide v2, p0, Ll/ۡۚۜ;->ۙ:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ֫()J
    .locals 2

    .line 28
    iget-wide v0, p0, Ll/ۡۚۜ;->᩹:J

    return-wide v0
.end method

.method public final ۧ(J[BII)V
    .locals 13

    move-object v0, p0

    move/from16 v7, p5

    const-wide/16 v8, 0x0

    cmp-long v1, p1, v8

    if-ltz v1, :cond_2

    if-ltz v7, :cond_2

    .line 38
    invoke-virtual {p0}, Ll/ۡۚۜ;->length()J

    move-result-wide v1

    int-to-long v3, v7

    sub-long/2addr v1, v3

    cmp-long v5, p1, v1

    if-gtz v5, :cond_2

    .line 42
    iget-wide v10, v0, Ll/ۡۚۜ;->᩹:J

    cmp-long v1, p1, v10

    if-gez v1, :cond_0

    sub-long v1, v10, p1

    .line 43
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v12, v1

    .line 44
    iget-object v1, v0, Ll/ۡۚۜ;->᩸:Ll/ۙ᩶ۜ;

    move-wide v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p4

    move v6, v12

    invoke-virtual/range {v1 .. v6}, Ll/ۙ᩶ۜ;->ۧ(J[BII)V

    goto :goto_0

    :cond_0
    const/4 v12, 0x0

    :goto_0
    sub-int v6, v7, v12

    if-lez v6, :cond_1

    sub-long v1, p1, v10

    .line 48
    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 49
    iget-object v1, v0, Ll/ۡۚۜ;->᩶:Ll/ۙ᩶ۜ;

    add-int v5, p4, v12

    move-object/from16 v4, p3

    invoke-virtual/range {v1 .. v6}, Ll/ۙ᩶ۜ;->ۧ(J[BII)V

    :cond_1
    return-void

    .line 39
    :cond_2
    new-instance v1, Ljava/io/EOFException;

    const-string v2, "HLS fragment read exceeds virtual resource"

    invoke-direct {v1, v2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
