.class public final Ll/۫۟᩵;
.super Ljava/lang/Object;
.source "54FE"


# instance fields
.field public ֫:I

.field public ۜ:J

.field public ۡ:Ljava/util/Date;

.field public ۢ:J

.field public final ۧ:Ll/ᩴ۟᩵;

.field public ܳ:Ljava/lang/String;

.field public ܺ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/util/Date;

.field public ᩳ:Ljava/util/Date;

.field public final ᩷:Ll/ۡ۟᩵;

.field public final ᩻:J


# direct methods
.method public constructor <init>(JLl/ۡ۟᩵;Ll/ᩴ۟᩵;)V
    .locals 3

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 138
    iput v0, p0, Ll/۫۟᩵;->֫:I

    .line 141
    iput-wide p1, p0, Ll/۫۟᩵;->᩻:J

    .line 142
    iput-object p3, p0, Ll/۫۟᩵;->᩷:Ll/ۡ۟᩵;

    .line 143
    iput-object p4, p0, Ll/۫۟᩵;->ۧ:Ll/ᩴ۟᩵;

    if-eqz p4, :cond_5

    .line 146
    invoke-virtual {p4}, Ll/ᩴ۟᩵;->ܶ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/۫۟᩵;->ۢ:J

    .line 147
    invoke-virtual {p4}, Ll/ᩴ۟᩵;->᩵()J

    move-result-wide p1

    iput-wide p1, p0, Ll/۫۟᩵;->ۜ:J

    .line 148
    invoke-virtual {p4}, Ll/ᩴ۟᩵;->᩻()Ll/ۤܰ᩵;

    move-result-object p1

    .line 149
    invoke-virtual {p1}, Ll/ۤܰ᩵;->ۧ()I

    move-result p2

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_5

    .line 150
    invoke-virtual {p1, p3}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object p4

    .line 151
    invoke-virtual {p1, p3}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Date"

    .line 152
    invoke-virtual {v2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 153
    invoke-static {v1}, Ll/ۚ֫֡;->֫(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p4

    iput-object p4, p0, Ll/۫۟᩵;->ۡ:Ljava/util/Date;

    .line 154
    iput-object v1, p0, Ll/۫۟᩵;->ܺ:Ljava/lang/String;

    goto :goto_1

    :cond_0
    const-string v2, "Expires"

    .line 155
    invoke-virtual {v2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 156
    invoke-static {v1}, Ll/ۚ֫֡;->֫(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p4

    iput-object p4, p0, Ll/۫۟᩵;->ᩳ:Ljava/util/Date;

    goto :goto_1

    :cond_1
    const-string v2, "Last-Modified"

    .line 157
    invoke-virtual {v2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 158
    invoke-static {v1}, Ll/ۚ֫֡;->֫(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p4

    iput-object p4, p0, Ll/۫۟᩵;->ܿ:Ljava/util/Date;

    .line 159
    iput-object v1, p0, Ll/۫۟᩵;->ܳ:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const-string v2, "ETag"

    .line 160
    invoke-virtual {v2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 161
    iput-object v1, p0, Ll/۫۟᩵;->ܽ:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const-string v2, "Age"

    .line 162
    invoke-virtual {v2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_4

    .line 163
    invoke-static {v0, v1}, Ll/֨֫֡;->֫(ILjava/lang/String;)I

    move-result p4

    iput p4, p0, Ll/۫۟᩵;->֫:I

    :cond_4
    :goto_1
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۤ۟᩵;
    .locals 23

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 186
    iget-object v2, v0, Ll/۫۟᩵;->᩷:Ll/ۡ۟᩵;

    iget-object v3, v0, Ll/۫۟᩵;->ۧ:Ll/ᩴ۟᩵;

    if-nez v3, :cond_0

    .line 187
    new-instance v3, Ll/ۤ۟᩵;

    invoke-direct {v3, v2, v1}, Ll/ۤ۟᩵;-><init>(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)V

    goto/16 :goto_8

    .line 191
    :cond_0
    invoke-virtual {v2}, Ll/ۡ۟᩵;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Ll/ᩴ۟᩵;->ܳ()Ll/۬ܰ᩵;

    move-result-object v4

    if-nez v4, :cond_1

    .line 192
    new-instance v3, Ll/ۤ۟᩵;

    invoke-direct {v3, v2, v1}, Ll/ۤ۟᩵;-><init>(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)V

    goto/16 :goto_8

    .line 198
    :cond_1
    invoke-static {v2, v3}, Ll/ۤ۟᩵;->֫(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 199
    new-instance v3, Ll/ۤ۟᩵;

    invoke-direct {v3, v2, v1}, Ll/ۤ۟᩵;-><init>(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)V

    goto/16 :goto_8

    .line 202
    :cond_2
    invoke-virtual {v2}, Ll/ۡ۟᩵;->ۧ()Ll/ۧܰ᩵;

    move-result-object v4

    .line 203
    invoke-virtual {v4}, Ll/ۧܰ᩵;->᩻()Z

    move-result v5

    if-nez v5, :cond_15

    const-string v5, "If-Modified-Since"

    .line 323
    invoke-virtual {v2, v5}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_15

    const-string v6, "If-None-Match"

    invoke-virtual {v2, v6}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    goto/16 :goto_7

    .line 207
    :cond_3
    invoke-virtual {v3}, Ll/ᩴ۟᩵;->ܽ()Ll/ۧܰ᩵;

    move-result-object v1

    .line 298
    iget-wide v7, v0, Ll/۫۟᩵;->ۜ:J

    iget-object v9, v0, Ll/۫۟᩵;->ۡ:Ljava/util/Date;

    const-wide/16 v10, 0x0

    if-eqz v9, :cond_4

    .line 299
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    sub-long v12, v7, v12

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    goto :goto_0

    :cond_4
    move-wide v12, v10

    :goto_0
    const/4 v14, -0x1

    .line 301
    iget v15, v0, Ll/۫۟᩵;->֫:I

    if-eq v15, v14, :cond_5

    .line 302
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v14, v15

    invoke-virtual {v10, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v14

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    .line 304
    :cond_5
    iget-wide v14, v0, Ll/۫۟᩵;->ۢ:J

    sub-long v18, v7, v14

    move-object v10, v5

    move-object/from16 v20, v6

    .line 305
    iget-wide v5, v0, Ll/۫۟᩵;->᩻:J

    sub-long/2addr v5, v7

    add-long v12, v12, v18

    add-long/2addr v12, v5

    .line 269
    invoke-virtual {v3}, Ll/ᩴ۟᩵;->ܽ()Ll/ۧܰ᩵;

    move-result-object v5

    .line 270
    invoke-virtual {v5}, Ll/ۧܰ᩵;->ܽ()I

    move-result v6

    iget-object v11, v0, Ll/۫۟᩵;->ᩳ:Ljava/util/Date;

    move-wide/from16 v21, v7

    iget-object v7, v0, Ll/۫۟᩵;->ܿ:Ljava/util/Date;

    const/4 v8, -0x1

    if-eq v6, v8, :cond_6

    .line 271
    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5}, Ll/ۧܰ᩵;->ܽ()I

    move-result v5

    int-to-long v14, v5

    invoke-virtual {v8, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v14

    :goto_1
    const-wide/16 v16, 0x0

    goto :goto_2

    :cond_6
    if-eqz v11, :cond_8

    if-eqz v9, :cond_7

    .line 274
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    move-wide/from16 v21, v14

    .line 276
    :cond_7
    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    sub-long v14, v14, v21

    const-wide/16 v16, 0x0

    cmp-long v5, v14, v16

    if-lez v5, :cond_a

    goto :goto_1

    :cond_8
    if-eqz v7, :cond_a

    .line 279
    invoke-virtual {v3}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۨܰ᩵;->ۡ()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_a

    if-eqz v9, :cond_9

    .line 285
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    .line 287
    :cond_9
    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v18

    sub-long v14, v14, v18

    const-wide/16 v16, 0x0

    cmp-long v5, v14, v16

    if-lez v5, :cond_b

    const-wide/16 v18, 0xa

    .line 288
    div-long v14, v14, v18

    goto :goto_2

    :cond_a
    const-wide/16 v16, 0x0

    :cond_b
    move-wide/from16 v14, v16

    .line 212
    :goto_2
    invoke-virtual {v4}, Ll/ۧܰ᩵;->ܽ()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_c

    .line 213
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4}, Ll/ۧܰ᩵;->ܽ()I

    move-result v8

    move-object/from16 v18, v7

    int-to-long v6, v8

    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    invoke-static {v14, v15, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    goto :goto_3

    :cond_c
    move-object/from16 v18, v7

    .line 217
    :goto_3
    invoke-virtual {v4}, Ll/ۧܰ᩵;->ܿ()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_d

    .line 218
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4}, Ll/ۧܰ᩵;->ܿ()I

    move-result v7

    int-to-long v7, v7

    invoke-virtual {v5, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    goto :goto_4

    :cond_d
    move-wide/from16 v7, v16

    .line 222
    :goto_4
    invoke-virtual {v1}, Ll/ۧܰ᩵;->ܳ()Z

    move-result v5

    if-nez v5, :cond_e

    invoke-virtual {v4}, Ll/ۧܰ᩵;->ᩳ()I

    move-result v5

    if-eq v5, v6, :cond_e

    .line 223
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4}, Ll/ۧܰ᩵;->ᩳ()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {v6, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    move-wide/from16 v16, v4

    .line 226
    :cond_e
    invoke-virtual {v1}, Ll/ۧܰ᩵;->᩻()Z

    move-result v1

    if-nez v1, :cond_11

    add-long/2addr v7, v12

    add-long v16, v14, v16

    cmp-long v1, v7, v16

    if-gez v1, :cond_11

    .line 227
    invoke-virtual {v3}, Ll/ᩴ۟᩵;->ۘ()Ll/ۘ۟᩵;

    move-result-object v1

    cmp-long v4, v7, v14

    if-ltz v4, :cond_f

    const-string v4, "110 HttpURLConnection \"Response is stale\""

    .line 229
    invoke-virtual {v1, v4}, Ll/ۘ۟᩵;->֫(Ljava/lang/String;)V

    :cond_f
    const-wide/32 v4, 0x5265c00

    cmp-long v6, v12, v4

    if-lez v6, :cond_10

    .line 314
    invoke-virtual {v3}, Ll/ᩴ۟᩵;->ܽ()Ll/ۧܰ᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۧܰ᩵;->ܽ()I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_10

    if-nez v11, :cond_10

    const-string v3, "113 HttpURLConnection \"Heuristic expiration\""

    .line 233
    invoke-virtual {v1, v3}, Ll/ۘ۟᩵;->֫(Ljava/lang/String;)V

    .line 235
    :cond_10
    new-instance v3, Ll/ۤ۟᩵;

    invoke-virtual {v1}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object v1

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1}, Ll/ۤ۟᩵;-><init>(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)V

    move-object v1, v4

    goto :goto_8

    .line 242
    :cond_11
    iget-object v1, v0, Ll/۫۟᩵;->ܽ:Ljava/lang/String;

    if-eqz v1, :cond_12

    move-object/from16 v5, v20

    goto :goto_6

    :cond_12
    if-eqz v18, :cond_13

    .line 247
    iget-object v1, v0, Ll/۫۟᩵;->ܳ:Ljava/lang/String;

    goto :goto_5

    :cond_13
    if-eqz v9, :cond_14

    .line 250
    iget-object v1, v0, Ll/۫۟᩵;->ܺ:Ljava/lang/String;

    :goto_5
    move-object v5, v10

    .line 255
    :goto_6
    invoke-virtual {v2}, Ll/ۡ۟᩵;->ܽ()Ll/ۤܰ᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۤܰ᩵;->֫()Ll/۫ܰ᩵;

    move-result-object v4

    .line 256
    sget-object v6, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    invoke-virtual {v6, v4, v5, v1}, Ll/۠۟᩵;->֫(Ll/۫ܰ᩵;Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    invoke-virtual {v2}, Ll/ۡ۟᩵;->ܳ()Ll/ۢ۟᩵;

    move-result-object v1

    .line 259
    invoke-virtual {v4}, Ll/۫ܰ᩵;->֫()Ll/ۤܰ᩵;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/ۢ۟᩵;->֫(Ll/ۤܰ᩵;)V

    .line 260
    invoke-virtual {v1}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v1

    .line 261
    new-instance v4, Ll/ۤ۟᩵;

    invoke-direct {v4, v1, v3}, Ll/ۤ۟᩵;-><init>(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)V

    const/4 v1, 0x0

    move-object v3, v4

    goto :goto_8

    .line 252
    :cond_14
    new-instance v3, Ll/ۤ۟᩵;

    const/4 v1, 0x0

    invoke-direct {v3, v2, v1}, Ll/ۤ۟᩵;-><init>(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)V

    goto :goto_8

    .line 204
    :cond_15
    :goto_7
    new-instance v3, Ll/ۤ۟᩵;

    invoke-direct {v3, v2, v1}, Ll/ۤ۟᩵;-><init>(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)V

    .line 175
    :goto_8
    iget-object v4, v3, Ll/ۤ۟᩵;->ۧ:Ll/ۡ۟᩵;

    if-eqz v4, :cond_16

    invoke-virtual {v2}, Ll/ۡ۟᩵;->ۧ()Ll/ۧܰ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۧܰ᩵;->᩷()Z

    move-result v2

    if-eqz v2, :cond_16

    .line 177
    new-instance v2, Ll/ۤ۟᩵;

    invoke-direct {v2, v1, v1}, Ll/ۤ۟᩵;-><init>(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)V

    return-object v2

    :cond_16
    return-object v3
.end method
