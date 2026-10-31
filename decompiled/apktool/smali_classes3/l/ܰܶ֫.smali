.class public final Ll/ܰܶ֫;
.super Ljava/lang/Object;
.source "D739"


# instance fields
.field public final ֫:Ll/᩸ܶ֫;

.field public final ۜ:[B

.field public final ۧ:Ljava/lang/String;

.field public volatile ܳ:Z

.field public final ܽ:Ll/۬ܶ֫;

.field public ܿ:J

.field public final ᩳ:Ll/ۗ۠֫;

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/۬ܶ֫;Ll/ۗ۠֫;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Ll/ܰܶ֫;->ܽ:Ll/۬ܶ֫;

    .line 77
    invoke-virtual {p1}, Ll/۬ܶ֫;->ܳ()Ll/᩸ܶ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ܰܶ֫;->֫:Ll/᩸ܶ֫;

    .line 78
    iput-object p2, p0, Ll/ܰܶ֫;->ᩳ:Ll/ۗ۠֫;

    const/high16 v0, 0x20000

    new-array v0, v0, [B

    .line 80
    iput-object v0, p0, Ll/ܰܶ֫;->ۜ:[B

    .line 82
    invoke-virtual {p1}, Ll/۬ܶ֫;->᩻()Ll/ۨܶ֫;

    move-result-object p1

    invoke-interface {p1, p2}, Ll/ۨܶ֫;->֫(Ll/ۗ۠֫;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܰܶ֫;->ۧ:Ljava/lang/String;

    .line 83
    iget-wide p1, p2, Ll/ۗ۠֫;->᩻:J

    iput-wide p1, p0, Ll/ܰܶ֫;->᩻:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 15

    .line 232
    iget-boolean v0, p0, Ll/ܰܶ֫;->ܳ:Z

    if-nez v0, :cond_14

    .line 114
    iget-object v1, p0, Ll/ܰܶ֫;->֫:Ll/᩸ܶ֫;

    iget-object v2, p0, Ll/ܰܶ֫;->ۧ:Ljava/lang/String;

    iget-object v0, p0, Ll/ܰܶ֫;->ᩳ:Ll/ۗ۠֫;

    iget-wide v3, v0, Ll/ۗ۠֫;->᩻:J

    iget-wide v5, v0, Ll/ۗ۠֫;->ܳ:J

    invoke-interface/range {v1 .. v6}, Ll/᩸ܶ֫;->ۧ(Ljava/lang/String;JJ)J

    .line 115
    iget-wide v1, v0, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    .line 116
    iget-wide v5, v0, Ll/ۗ۠֫;->᩻:J

    add-long/2addr v5, v1

    iput-wide v5, p0, Ll/ܰܶ֫;->ܿ:J

    goto :goto_0

    .line 118
    :cond_0
    iget-object v1, p0, Ll/ܰܶ֫;->֫:Ll/᩸ܶ֫;

    iget-object v2, p0, Ll/ܰܶ֫;->ۧ:Ljava/lang/String;

    invoke-interface {v1, v2}, Ll/᩸ܶ֫;->֫(Ljava/lang/String;)Ll/ۜ᩸֫;

    move-result-object v1

    invoke-static {v1}, Ll/۬᩵ᩳ;->֫(Ll/ܳ᩸֫;)J

    move-result-wide v1

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    move-wide v1, v3

    .line 119
    :cond_1
    iput-wide v1, p0, Ll/ܰܶ֫;->ܿ:J

    .line 125
    :goto_0
    iget-wide v1, p0, Ll/ܰܶ֫;->ܿ:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_3

    iget-wide v5, p0, Ll/ܰܶ֫;->᩻:J

    cmp-long v7, v5, v1

    if-gez v7, :cond_2

    goto :goto_1

    :cond_2
    return-void

    .line 232
    :cond_3
    :goto_1
    iget-boolean v1, p0, Ll/ܰܶ֫;->ܳ:Z

    if-nez v1, :cond_13

    .line 128
    iget-wide v1, p0, Ll/ܰܶ֫;->ܿ:J

    const-wide v5, 0x7fffffffffffffffL

    cmp-long v7, v1, v3

    if-nez v7, :cond_4

    move-wide v11, v5

    goto :goto_2

    :cond_4
    iget-wide v7, p0, Ll/ܰܶ֫;->᩻:J

    sub-long/2addr v1, v7

    move-wide v11, v1

    .line 129
    :goto_2
    iget-object v7, p0, Ll/ܰܶ֫;->֫:Ll/᩸ܶ֫;

    iget-object v8, p0, Ll/ܰܶ֫;->ۧ:Ljava/lang/String;

    iget-wide v9, p0, Ll/ܰܶ֫;->᩻:J

    invoke-interface/range {v7 .. v12}, Ll/᩸ܶ֫;->ᩳ(Ljava/lang/String;JJ)J

    move-result-wide v1

    const-wide/16 v7, 0x0

    cmp-long v9, v1, v7

    if-lez v9, :cond_5

    .line 131
    iget-wide v5, p0, Ll/ܰܶ֫;->᩻:J

    add-long/2addr v5, v1

    iput-wide v5, p0, Ll/ܰܶ֫;->᩻:J

    goto :goto_0

    :cond_5
    neg-long v1, v1

    cmp-long v7, v1, v5

    if-nez v7, :cond_6

    move-wide v1, v3

    .line 136
    :cond_6
    iget-wide v5, p0, Ll/ܰܶ֫;->᩻:J

    .line 150
    iget-object v7, p0, Ll/ܰܶ֫;->ܽ:Ll/۬ܶ֫;

    add-long v8, v5, v1

    iget-wide v10, p0, Ll/ܰܶ֫;->ܿ:J

    const/4 v12, 0x1

    const/4 v13, 0x0

    cmp-long v14, v8, v10

    if-eqz v14, :cond_8

    cmp-long v8, v1, v3

    if-nez v8, :cond_7

    goto :goto_3

    :cond_7
    const/4 v8, 0x0

    goto :goto_4

    :cond_8
    :goto_3
    const/4 v8, 0x1

    :goto_4
    cmp-long v9, v1, v3

    if-eqz v9, :cond_9

    .line 158
    invoke-virtual {v0}, Ll/ۗ۠֫;->֫()Ll/ۙ۠֫;

    move-result-object v9

    invoke-virtual {v9, v5, v6}, Ll/ۙ۠֫;->ۧ(J)V

    invoke-virtual {v9, v1, v2}, Ll/ۙ۠֫;->֫(J)V

    invoke-virtual {v9}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v1

    .line 160
    :try_start_0
    invoke-virtual {v7, v1}, Ll/۬ܶ֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 163
    :catch_0
    invoke-static {v7}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    :cond_9
    const/4 v12, 0x0

    move-wide v1, v3

    :goto_5
    if-nez v12, :cond_b

    .line 232
    iget-boolean v1, p0, Ll/ܰܶ֫;->ܳ:Z

    if-nez v1, :cond_a

    .line 172
    invoke-virtual {v0}, Ll/ۗ۠֫;->֫()Ll/ۙ۠֫;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ll/ۙ۠֫;->ۧ(J)V

    invoke-virtual {v1, v3, v4}, Ll/ۙ۠֫;->֫(J)V

    invoke-virtual {v1}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v1

    .line 174
    :try_start_1
    invoke-virtual {v7, v1}, Ll/۬ܶ֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    .line 176
    invoke-static {v7}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 177
    throw v0

    .line 233
    :cond_a
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0

    :cond_b
    :goto_6
    if-eqz v8, :cond_d

    cmp-long v9, v1, v3

    if-eqz v9, :cond_d

    add-long/2addr v1, v5

    .line 211
    :try_start_2
    iget-wide v9, p0, Ll/ܰܶ֫;->ܿ:J

    cmp-long v11, v9, v1

    if-nez v11, :cond_c

    goto :goto_7

    .line 214
    :cond_c
    iput-wide v1, p0, Ll/ܰܶ֫;->ܿ:J

    :cond_d
    :goto_7
    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_e
    :goto_8
    const/4 v9, -0x1

    if-eq v1, v9, :cond_10

    .line 232
    iget-boolean v1, p0, Ll/ܰܶ֫;->ܳ:Z

    if-nez v1, :cond_f

    .line 189
    iget-object v1, p0, Ll/ܰܶ֫;->ۜ:[B

    array-length v10, v1

    invoke-virtual {v7, v1, v13, v10}, Ll/۬ܶ֫;->read([BII)I

    move-result v1

    if-eq v1, v9, :cond_e

    add-int/2addr v2, v1

    goto :goto_8

    .line 233
    :cond_f
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0

    :catch_2
    move-exception v0

    goto :goto_9

    :cond_10
    if-eqz v8, :cond_12

    int-to-long v8, v2

    add-long/2addr v8, v5

    .line 211
    iget-wide v10, p0, Ll/ܰܶ֫;->ܿ:J

    cmp-long v1, v10, v8

    if-nez v1, :cond_11

    goto :goto_a

    .line 214
    :cond_11
    iput-wide v8, p0, Ll/ܰܶ֫;->ܿ:J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_a

    .line 199
    :goto_9
    invoke-static {v7}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 200
    throw v0

    .line 206
    :cond_12
    :goto_a
    invoke-virtual {v7}, Ll/۬ܶ֫;->close()V

    int-to-long v1, v2

    add-long/2addr v5, v1

    .line 136
    iput-wide v5, p0, Ll/ܰܶ֫;->᩻:J

    goto/16 :goto_0

    .line 233
    :cond_13
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0

    :cond_14
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 92
    iput-boolean v0, p0, Ll/ܰܶ֫;->ܳ:Z

    return-void
.end method
