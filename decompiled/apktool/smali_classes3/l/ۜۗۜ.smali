.class public final Ll/ۜۗۜ;
.super Ljava/lang/Object;
.source "274A"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/util/ArrayList;

.field public final ܽ:Ll/ۢۗۜ;

.field public final ܿ:Ll/᩻۬ۜ;

.field public ᩳ:Ll/᩸۠֫;


# direct methods
.method public constructor <init>(Ll/᩻۬ۜ;Ll/ۢۗۜ;Ljava/lang/String;Z)V
    .locals 1

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜۗۜ;->ܳ:Ljava/util/ArrayList;

    .line 146
    iput-object p1, p0, Ll/ۜۗۜ;->ܿ:Ll/᩻۬ۜ;

    .line 147
    iput-object p2, p0, Ll/ۜۗۜ;->ܽ:Ll/ۢۗۜ;

    .line 148
    iput-object p3, p0, Ll/ۜۗۜ;->ۧ:Ljava/lang/String;

    .line 149
    iput-boolean p4, p0, Ll/ۜۗۜ;->֫:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 213
    iget-object v0, p0, Ll/ۜۗۜ;->ᩳ:Ll/᩸۠֫;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 216
    :try_start_0
    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 219
    iput-object v1, p0, Ll/ۜۗۜ;->ᩳ:Ll/᩸۠֫;

    .line 220
    throw v0

    .line 219
    :cond_0
    :goto_0
    iput-object v1, p0, Ll/ۜۗۜ;->ᩳ:Ll/᩸۠֫;

    return-void
.end method

.method public final read([BII)I
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ۜۗۜ;->ᩳ:Ll/᩸۠֫;

    if-eqz v0, :cond_0

    .line 196
    invoke-interface {v0, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    return p1

    .line 194
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Data source is not open"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 161
    iget-object v2, v0, Ll/ۜۗۜ;->ᩳ:Ll/᩸۠֫;

    if-nez v2, :cond_6

    .line 164
    invoke-virtual/range {p1 .. p1}, Ll/ۗ۠֫;->֫()Ll/ۙ۠֫;

    move-result-object v2

    iget-object v3, v0, Ll/ۜۗۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ll/ۙ۠֫;->֫(Ljava/lang/String;)V

    invoke-virtual {v2}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v2

    .line 165
    iget-wide v3, v1, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    const-wide v3, 0x7fffffffffffffffL

    :cond_0
    const-wide/32 v13, 0x8000

    .line 167
    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v15

    .line 168
    iget-object v7, v0, Ll/ۜۗۜ;->ܿ:Ll/᩻۬ۜ;

    invoke-virtual {v7}, Ll/᩻۬ۜ;->֫()Ll/ܺ᩸֫;

    move-result-object v8

    .line 170
    invoke-static {v7}, Ll/ۢۗۜ;->֫(Ll/᩻۬ۜ;)Ll/ܶ۠֫;

    move-result-object v17

    if-nez v8, :cond_1

    goto :goto_0

    .line 172
    :cond_1
    iget-object v5, v0, Ll/ۜۗۜ;->ۧ:Ljava/lang/String;

    iget-wide v9, v1, Ll/ۗ۠֫;->᩻:J

    move-object v7, v8

    move-object v8, v5

    move-wide v11, v3

    invoke-virtual/range {v7 .. v12}, Ll/ܺ᩸֫;->ᩳ(Ljava/lang/String;JJ)J

    move-result-wide v5

    :goto_0
    cmp-long v1, v5, v15

    if-ltz v1, :cond_3

    cmp-long v1, v5, v3

    if-ltz v1, :cond_2

    goto :goto_1

    .line 178
    :cond_2
    div-long/2addr v5, v13

    mul-long v3, v5, v13

    :goto_1
    const-wide/16 v5, 0x0

    .line 179
    invoke-virtual {v2, v5, v6, v3, v4}, Ll/ۗ۠֫;->֫(JJ)Ll/ۗ۠֫;

    move-result-object v2

    .line 180
    invoke-interface/range {v17 .. v17}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v1

    iput-object v1, v0, Ll/ۜۗۜ;->ᩳ:Ll/᩸۠֫;

    goto :goto_2

    .line 182
    :cond_3
    iget-boolean v1, v0, Ll/ۜۗۜ;->֫:Z

    if-eqz v1, :cond_4

    iget-object v1, v0, Ll/ۜۗۜ;->ܽ:Ll/ۢۗۜ;

    move-object/from16 v17, v1

    .line 183
    :cond_4
    invoke-interface/range {v17 .. v17}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v1

    iput-object v1, v0, Ll/ۜۗۜ;->ᩳ:Ll/᩸۠֫;

    .line 185
    :goto_2
    iget-object v1, v0, Ll/ۜۗۜ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܶ֫;

    .line 186
    iget-object v4, v0, Ll/ۜۗۜ;->ᩳ:Ll/᩸۠֫;

    invoke-interface {v4, v3}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    goto :goto_3

    .line 188
    :cond_5
    iget-object v1, v0, Ll/ۜۗۜ;->ᩳ:Ll/᩸۠֫;

    invoke-interface {v1, v2}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v1

    return-wide v1

    .line 162
    :cond_6
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Data source is already open"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 208
    iget-object v0, p0, Ll/ۜۗۜ;->ᩳ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 2

    .line 154
    iget-object v0, p0, Ll/ۜۗۜ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 155
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ۜۗۜ;->ᩳ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
