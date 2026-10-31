.class public final Ll/ۗ۠ۜ;
.super Ljava/lang/Object;
.source "B74J"


# static fields
.field public static final ֫:Ljava/util/HashMap;

.field public static final ۧ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۗ۠ۜ;->ۧ:Ljava/lang/Object;

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۗ۠ۜ;->֫:Ljava/util/HashMap;

    return-void
.end method

.method public static bridge synthetic ֫()Ljava/lang/Object;
    .locals 1

    .line 0
    sget-object v0, Ll/ۗ۠ۜ;->ۧ:Ljava/lang/Object;

    return-object v0
.end method

.method public static bridge synthetic ֫(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۗ۠ۜ;->ۧ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۗ۠ۜ;->ۧ(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܺ᩸֫;Ljava/lang/String;Landroid/net/Uri;Ll/ܶ۠֫;Ll/ܶ۠ۜ;)Ll/ۙ۠ۜ;
    .locals 26

    move-object/from16 v1, p1

    .line 143
    invoke-virtual/range {p0 .. p1}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;)Ll/ۜ᩸֫;

    move-result-object v0

    .line 322
    new-instance v8, Ll/᩹۠ۜ;

    .line 396
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    const-wide/16 v9, -0x1

    .line 399
    iput-wide v9, v8, Ll/᩹۠ۜ;->ܿ:J

    const-string v11, "custom_mt.video.etag"

    .line 323
    invoke-virtual {v0, v11}, Ll/ۜ᩸֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v8, Ll/᩹۠ۜ;->֫:Ljava/lang/String;

    const-string v12, "custom_mt.video.last_modified"

    .line 324
    invoke-virtual {v0, v12}, Ll/ۜ᩸֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v8, Ll/᩹۠ۜ;->ᩳ:Ljava/lang/String;

    const-string v13, "custom_mt.video.length"

    .line 325
    invoke-virtual {v0, v9, v10, v13}, Ll/ۜ᩸֫;->֫(JLjava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v8, Ll/᩹۠ۜ;->ܿ:J

    const-wide/16 v14, 0x0

    const-string v7, "custom_mt.video.generation"

    .line 326
    invoke-virtual {v0, v14, v15, v7}, Ll/ۜ᩸֫;->֫(JLjava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v8, Ll/᩹۠ۜ;->ܽ:J

    const-string v6, "custom_mt.video.final_uri_digest"

    .line 327
    invoke-virtual {v0, v6}, Ll/ۜ᩸֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v8, Ll/᩹۠ۜ;->ۧ:Ljava/lang/String;

    const/4 v5, 0x1

    const/4 v0, 0x0

    move-object/from16 v2, p3

    move-object/from16 v3, p2

    move-object v4, v8

    move-object/from16 v16, v6

    move v6, v0

    move-object/from16 v17, v7

    move-object/from16 v7, p4

    .line 146
    :try_start_0
    invoke-static/range {v2 .. v7}, Ll/ۗ۠ۜ;->֫(Ll/ܶ۠֫;Landroid/net/Uri;Ll/᩹۠ۜ;ZZLl/ܶ۠ۜ;)Ll/᩶۠ۜ;

    move-result-object v0
    :try_end_0
    .catch Ll/᩻ܶ֫; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 148
    iget v0, v2, Ll/᩻ܶ֫;->۬:I

    const/16 v7, 0x130

    if-ne v0, v7, :cond_0

    .line 149
    invoke-static {v2}, Ll/᩶۠ۜ;->֫(Ll/᩻ܶ֫;)Ll/᩶۠ۜ;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object/from16 v2, p3

    move-object/from16 v3, p2

    move-object v4, v8

    const/16 v14, 0x130

    move-object/from16 v7, p4

    .line 187
    :try_start_1
    invoke-static/range {v2 .. v7}, Ll/ۗ۠ۜ;->֫(Ll/ܶ۠֫;Landroid/net/Uri;Ll/᩹۠ۜ;ZZLl/ܶ۠ۜ;)Ll/᩶۠ۜ;

    move-result-object v0
    :try_end_1
    .catch Ll/᩻ܶ֫; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v2, v0

    .line 189
    iget v0, v2, Ll/᩻ܶ֫;->۬:I

    if-ne v0, v14, :cond_1b

    .line 190
    invoke-static {v2}, Ll/᩶۠ۜ;->֫(Ll/᩻ܶ֫;)Ll/᩶۠ۜ;

    move-result-object v0

    .line 155
    :goto_0
    iget-boolean v2, v0, Ll/᩶۠ۜ;->ܿ:Z

    if-eqz v2, :cond_4

    invoke-virtual {v8}, Ll/᩹۠ۜ;->֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 313
    iget-object v2, v0, Ll/᩶۠ۜ;->֫:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v3, v8, Ll/᩹۠ۜ;->֫:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_1
    iget-object v2, v0, Ll/᩶۠ۜ;->ܽ:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, v8, Ll/᩹۠ۜ;->ᩳ:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 315
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    iget-object v2, v0, Ll/᩶۠ۜ;->ۧ:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v3, v8, Ll/᩹۠ۜ;->ۧ:Ljava/lang/String;

    if-eqz v3, :cond_4

    .line 317
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v22, 0x0

    move-object/from16 v20, p3

    move-object/from16 v21, p2

    move-object/from16 v25, p4

    .line 158
    invoke-static/range {v20 .. v25}, Ll/ۗ۠ۜ;->֫(Ll/ܶ۠֫;Landroid/net/Uri;Ll/᩹۠ۜ;ZZLl/ܶ۠ۜ;)Ll/᩶۠ۜ;

    move-result-object v0

    .line 456
    :cond_4
    iget-boolean v2, v0, Ll/᩶۠ۜ;->ܿ:Z

    .line 457
    iget-object v3, v0, Ll/᩶۠ۜ;->֫:Ljava/lang/String;

    if-eqz v3, :cond_5

    goto :goto_1

    :cond_5
    if-eqz v2, :cond_6

    iget-object v3, v8, Ll/᩹۠ۜ;->֫:Ljava/lang/String;

    goto :goto_1

    :cond_6
    const/4 v3, 0x0

    .line 458
    :goto_1
    iget-object v4, v0, Ll/᩶۠ۜ;->ܽ:Ljava/lang/String;

    if-eqz v4, :cond_7

    goto :goto_2

    :cond_7
    if-eqz v2, :cond_8

    .line 459
    iget-object v4, v8, Ll/᩹۠ۜ;->ᩳ:Ljava/lang/String;

    goto :goto_2

    :cond_8
    const/4 v4, 0x0

    .line 460
    :goto_2
    iget-wide v5, v0, Ll/᩶۠ۜ;->ᩳ:J

    cmp-long v7, v5, v9

    if-eqz v7, :cond_9

    goto :goto_3

    :cond_9
    if-eqz v2, :cond_a

    .line 461
    iget-wide v5, v8, Ll/᩹۠ۜ;->ܿ:J

    goto :goto_3

    :cond_a
    move-wide v5, v9

    .line 462
    :goto_3
    iget-object v7, v0, Ll/᩶۠ۜ;->ۧ:Ljava/lang/String;

    if-eqz v7, :cond_b

    goto :goto_4

    :cond_b
    if-eqz v2, :cond_c

    .line 463
    iget-object v7, v8, Ll/᩹۠ۜ;->ۧ:Ljava/lang/String;

    goto :goto_4

    :cond_c
    const/4 v7, 0x0

    .line 464
    :goto_4
    iget-wide v14, v8, Ll/᩹۠ۜ;->ܽ:J

    const-wide/16 v18, 0x0

    cmp-long v2, v14, v18

    if-gtz v2, :cond_e

    if-nez v3, :cond_e

    if-nez v4, :cond_e

    cmp-long v2, v5, v9

    if-eqz v2, :cond_d

    goto :goto_5

    .line 162
    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v1, "HTTP validation returned incomplete metadata"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 166
    :cond_e
    :goto_5
    invoke-virtual {v8}, Ll/᩹۠ۜ;->֫()Z

    move-result v2

    if-eqz v2, :cond_15

    .line 412
    iget-object v2, v8, Ll/᩹۠ۜ;->֫:Ljava/lang/String;

    if-nez v2, :cond_10

    if-nez v3, :cond_f

    const/4 v2, 0x1

    goto :goto_6

    :cond_f
    const/4 v2, 0x0

    goto :goto_6

    .line 470
    :cond_10
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    :goto_6
    if-eqz v2, :cond_15

    .line 412
    iget-object v2, v8, Ll/᩹۠ۜ;->ᩳ:Ljava/lang/String;

    if-nez v2, :cond_12

    if-nez v4, :cond_11

    const/4 v2, 0x1

    goto :goto_7

    :cond_11
    const/4 v2, 0x0

    goto :goto_7

    .line 470
    :cond_12
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    :goto_7
    if-eqz v2, :cond_15

    .line 413
    iget-wide v9, v8, Ll/᩹۠ۜ;->ܿ:J

    cmp-long v2, v9, v5

    if-nez v2, :cond_15

    iget-object v2, v8, Ll/᩹۠ۜ;->ۧ:Ljava/lang/String;

    if-nez v2, :cond_14

    if-nez v7, :cond_13

    const/4 v2, 0x1

    goto :goto_8

    :cond_13
    const/4 v2, 0x0

    goto :goto_8

    .line 470
    :cond_14
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    :goto_8
    if-eqz v2, :cond_15

    const/4 v9, 0x1

    goto :goto_9

    :cond_15
    const/4 v9, 0x0

    :goto_9
    const-string v2, ":g"

    if-eqz v9, :cond_16

    if-nez v3, :cond_17

    if-eqz v4, :cond_16

    goto :goto_a

    .line 169
    :cond_16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iget-wide v14, v8, Ll/᩹۠ۜ;->ܽ:J

    const-wide/16 v20, 0x1

    add-long v14, v14, v20

    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    .line 170
    iget-wide v8, v8, Ll/᩹۠ۜ;->ܽ:J

    const-wide/16 v18, 0x0

    cmp-long v10, v8, v18

    if-lez v10, :cond_17

    .line 355
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_b

    :cond_17
    :goto_a
    const/4 v8, 0x0

    :goto_b
    move-object/from16 v25, v8

    .line 334
    new-instance v8, Ll/᩻᩸֫;

    invoke-direct {v8}, Ll/᩻᩸֫;-><init>()V

    if-nez v3, :cond_18

    .line 347
    invoke-virtual {v8, v11}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    goto :goto_c

    .line 349
    :cond_18
    invoke-virtual {v8, v11, v3}, Ll/᩻᩸֫;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :goto_c
    if-nez v4, :cond_19

    .line 347
    invoke-virtual {v8, v12}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    goto :goto_d

    .line 349
    :cond_19
    invoke-virtual {v8, v12, v4}, Ll/᩻᩸֫;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    :goto_d
    invoke-virtual {v8, v5, v6, v13}, Ll/᩻᩸֫;->֫(JLjava/lang/String;)V

    move-object/from16 v3, v17

    .line 338
    invoke-virtual {v8, v14, v15, v3}, Ll/᩻᩸֫;->֫(JLjava/lang/String;)V

    if-nez v7, :cond_1a

    move-object/from16 v3, v16

    .line 347
    invoke-virtual {v8, v3}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    goto :goto_e

    :cond_1a
    move-object/from16 v3, v16

    .line 349
    invoke-virtual {v8, v3, v7}, Ll/᩻᩸֫;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :goto_e
    move-object/from16 v3, p0

    .line 340
    invoke-virtual {v3, v1, v8}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;Ll/᩻᩸֫;)V

    .line 176
    new-instance v3, Ll/ۙ۠ۜ;

    .line 355
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    .line 177
    iget-object v0, v0, Ll/᩶۠ۜ;->ܳ:Ljava/lang/Boolean;

    move-object/from16 v20, v3

    move-wide/from16 v22, v5

    move-object/from16 v24, v0

    invoke-direct/range {v20 .. v25}, Ll/ۙ۠ۜ;-><init>(Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;)V

    return-object v3

    .line 192
    :cond_1b
    throw v2
.end method

.method public static ֫(Ll/ܶ۠֫;Landroid/net/Uri;Ll/᩹۠ۜ;ZZLl/ܶ۠ۜ;)Ll/᩶۠ۜ;
    .locals 16

    move-object/from16 v0, p2

    move-object/from16 v1, p5

    const-string v2, "Unexpected HTTP validation status: "

    const-string v3, "Unexpected HTTP range probe status: "

    .line 203
    invoke-interface/range {p0 .. p0}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v4

    .line 204
    new-instance v5, Ll/ۙ۠֫;

    invoke-direct {v5}, Ll/ۙ۠֫;-><init>()V

    move-object/from16 v6, p1

    invoke-virtual {v5, v6}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    const-wide/16 v7, 0x0

    if-eqz p4, :cond_0

    .line 206
    invoke-virtual {v5, v7, v8}, Ll/ۙ۠֫;->ۧ(J)V

    const-wide/16 v9, 0x1

    invoke-virtual {v5, v9, v10}, Ll/ۙ۠֫;->֫(J)V

    goto :goto_0

    :cond_0
    const/4 v9, 0x3

    .line 208
    invoke-virtual {v5, v9}, Ll/ۙ۠֫;->ۧ(I)V

    :goto_0
    if-eqz p3, :cond_3

    if-eqz v0, :cond_3

    .line 211
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 212
    iget-object v10, v0, Ll/᩹۠ۜ;->֫:Ljava/lang/String;

    if-eqz v10, :cond_1

    const-string v11, "If-None-Match"

    .line 213
    invoke-virtual {v9, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    :cond_1
    iget-object v0, v0, Ll/᩹۠ۜ;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v10, "If-Modified-Since"

    .line 216
    invoke-virtual {v9, v10, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    :cond_2
    invoke-virtual {v5, v9}, Ll/ۙ۠֫;->֫(Ljava/util/Map;)V

    .line 221
    :cond_3
    :try_start_0
    invoke-static {v1, v4}, Ll/ۗ۠ۜ;->֫(Ll/ܶ۠ۜ;Ll/᩸۠֫;)V

    .line 222
    invoke-virtual {v5}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v0

    invoke-interface {v4, v0}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v9

    .line 223
    invoke-interface {v4}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    .line 224
    invoke-interface {v4}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v5

    .line 225
    instance-of v11, v4, Ll/᩷ܶ֫;

    if-eqz v11, :cond_4

    .line 226
    move-object v11, v4

    check-cast v11, Ll/᩷ܶ֫;

    invoke-interface {v11}, Ll/᩷ܶ֫;->ᩳ()I

    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_4
    const/4 v11, -0x1

    :goto_1
    const-wide/16 v12, -0x1

    const-string v14, "Content-Length"

    const/16 v15, 0xc8

    if-eqz p4, :cond_a

    const/16 v2, 0xce

    if-ne v11, v2, :cond_6

    :try_start_1
    const-string v2, "Content-Range"

    .line 232
    invoke-static {v2, v0}, Ll/ۗ۠ۜ;->ۧ(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    .line 231
    invoke-static {v2}, Ll/֨۠ۜ;->֫(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v7, v2, v12

    if-eqz v7, :cond_5

    .line 236
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_2
    move-wide v12, v2

    move-object v15, v7

    goto :goto_7

    .line 234
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid HTTP range probe response"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    if-ne v11, v15, :cond_9

    .line 238
    invoke-static {v14, v0}, Ll/ۗ۠ۜ;->ۧ(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_7

    .line 291
    :try_start_2
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    cmp-long v11, v2, v7

    if-ltz v11, :cond_7

    goto :goto_4

    :catch_0
    nop

    :cond_7
    cmp-long v2, v9, v7

    if-ltz v2, :cond_8

    goto :goto_3

    :cond_8
    move-wide v9, v12

    :goto_3
    move-wide v2, v9

    .line 239
    :goto_4
    :try_start_3
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2

    .line 241
    :cond_9
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    if-lt v11, v15, :cond_e

    const/16 v3, 0x12c

    if-ge v11, v3, :cond_e

    .line 247
    invoke-static {v14, v0}, Ll/ۗ۠ۜ;->ۧ(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v2, :cond_b

    .line 291
    :try_start_4
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    cmp-long v11, v2, v7

    if-ltz v11, :cond_b

    goto :goto_6

    :catch_1
    nop

    :cond_b
    cmp-long v2, v9, v7

    if-ltz v2, :cond_c

    goto :goto_5

    :cond_c
    move-wide v9, v12

    :goto_5
    move-wide v2, v9

    :goto_6
    const/4 v7, 0x0

    goto :goto_2

    .line 249
    :goto_7
    :try_start_5
    new-instance v2, Ll/᩶۠ۜ;

    const-string v3, "ETag"

    .line 251
    invoke-static {v3, v0}, Ll/ۗ۠ۜ;->ۧ(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    const-string v3, "Last-Modified"

    .line 252
    invoke-static {v3, v0}, Ll/ۗ۠ۜ;->ۧ(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v11

    if-nez v5, :cond_d

    move-object v5, v6

    .line 254
    :cond_d
    invoke-static {v5}, Ll/ۗ۠ۜ;->ۧ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v14

    const/4 v9, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v15}, Ll/᩶۠ۜ;-><init>(ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 258
    :try_start_6
    invoke-interface {v4}, Ll/᩸۠֫;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 260
    invoke-static {v1, v4}, Ll/ۗ۠ۜ;->ۧ(Ll/ܶ۠ۜ;Ll/᩸۠֫;)V

    return-object v2

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-static {v1, v4}, Ll/ۗ۠ۜ;->ۧ(Ll/ܶ۠ۜ;Ll/᩸۠֫;)V

    .line 261
    throw v2

    .line 245
    :cond_e
    :try_start_7
    new-instance v0, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v0

    .line 258
    :try_start_8
    invoke-interface {v4}, Ll/᩸۠֫;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 260
    invoke-static {v1, v4}, Ll/ۗ۠ۜ;->ۧ(Ll/ܶ۠ۜ;Ll/᩸۠֫;)V

    .line 262
    throw v0

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 260
    invoke-static {v1, v4}, Ll/ۗ۠ۜ;->ۧ(Ll/ܶ۠ۜ;Ll/᩸۠֫;)V

    .line 261
    throw v2
.end method

.method public static ֫(Ll/᩻۬ۜ;Landroid/net/Uri;Ll/ܶ۠֫;Ll/ܺۗۜ;)Ll/᩸۠ۜ;
    .locals 8

    .line 56
    invoke-virtual {p0}, Ll/᩻۬ۜ;->֫()Ll/ܺ᩸֫;

    move-result-object v1

    if-nez v1, :cond_0

    .line 58
    invoke-static {}, Ll/᩸۠ۜ;->ܳ()Ll/᩸۠ۜ;

    move-result-object p0

    return-object p0

    .line 60
    :cond_0
    invoke-static {p1, p2}, Ll/᩷۬ۜ;->֫(Landroid/net/Uri;Ll/ܶ۠֫;)Ljava/lang/String;

    move-result-object v2

    .line 63
    sget-object v0, Ll/ۗ۠ۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 64
    :try_start_0
    sget-object v3, Ll/ۗ۠ۜ;->֫:Ljava/util/HashMap;

    new-instance v4, Ll/۠۠ۜ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v3, v2, v4}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ۠ۜ;

    .line 65
    new-instance v4, Ll/᩸۠ۜ;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5}, Ll/᩸۠ۜ;-><init>(Ll/ܶ۠ۜ;I)V

    .line 66
    iget v6, v3, Ll/ܶ۠ۜ;->᩷:I

    const/4 v7, 0x1

    add-int/2addr v6, v7

    iput v6, v3, Ll/ܶ۠ۜ;->᩷:I

    if-eqz p3, :cond_1

    .line 68
    iget-object p3, p3, Ll/ܺۗۜ;->֫:Ll/ۖۗۜ;

    invoke-static {p3, v4}, Ll/ۖۗۜ;->֫(Ll/ۖۗۜ;Ll/᩸۠ۜ;)V

    .line 70
    :cond_1
    :goto_0
    iget-boolean p3, v3, Ll/ܶ۠ۜ;->ܳ:Z

    if-eqz p3, :cond_2

    invoke-static {v4}, Ll/᩸۠ۜ;->֫(Ll/᩸۠ۜ;)Z

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez p3, :cond_2

    .line 72
    :try_start_1
    sget-object p3, Ll/ۗ۠ۜ;->ۧ:Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 74
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 75
    invoke-static {v4}, Ll/᩸۠ۜ;->ۧ(Ll/᩸۠ۜ;)V

    .line 76
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string p1, "Interrupted while waiting for HTTP validation"

    invoke-direct {p0, p1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 79
    :cond_2
    invoke-static {v4}, Ll/᩸۠ۜ;->֫(Ll/᩸۠ۜ;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 80
    invoke-static {}, Ll/᩸۠ۜ;->ܳ()Ll/᩸۠ۜ;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 82
    :cond_3
    invoke-virtual {p0}, Ll/᩻۬ۜ;->ܳ()Ljava/lang/String;

    move-result-object p3

    iget-object v6, v3, Ll/ܶ۠ۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {p3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    iget-object p3, v3, Ll/ܶ۠ۜ;->ۧ:Ljava/lang/String;

    if-eqz p3, :cond_4

    .line 83
    iget-wide p0, v3, Ll/ܶ۠ۜ;->ܽ:J

    iget-object p2, v3, Ll/ܶ۠ۜ;->ᩳ:Ljava/lang/Boolean;

    invoke-static {v4, p3, p0, p1, p2}, Ll/᩸۠ۜ;->֫(Ll/᩸۠ۜ;Ljava/lang/String;JLjava/lang/Boolean;)V

    .line 85
    monitor-exit v0

    return-object v4

    .line 87
    :cond_4
    iput-boolean v7, v3, Ll/ܶ۠ۜ;->ܳ:Z

    .line 88
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 p3, 0x0

    .line 92
    :try_start_3
    invoke-static {v1, v2, p1, p2, v3}, Ll/ۗ۠ۜ;->֫(Ll/ܺ᩸֫;Ljava/lang/String;Landroid/net/Uri;Ll/ܶ۠֫;Ll/ܶ۠ۜ;)Ll/ۙ۠ۜ;

    move-result-object p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-object p1, p3

    .line 97
    :goto_1
    sget-object p2, Ll/ۗ۠ۜ;->ۧ:Ljava/lang/Object;

    move-object v0, p2

    monitor-enter v0

    if-eqz p1, :cond_6

    .line 98
    :try_start_4
    iget-object p2, p1, Ll/ۙ۠ۜ;->ܽ:Ljava/lang/String;

    if-eqz p2, :cond_6

    .line 99
    :goto_2
    iget p2, v3, Ll/ܶ۠ۜ;->֫:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-lez p2, :cond_5

    .line 101
    :try_start_5
    sget-object p2, Ll/ۗ۠ۜ;->ۧ:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->wait()V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    .line 103
    :catch_2
    :try_start_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 104
    iput-boolean v5, v3, Ll/ܶ۠ۜ;->ܳ:Z

    .line 105
    invoke-static {v4}, Ll/᩸۠ۜ;->ۧ(Ll/᩸۠ۜ;)V

    .line 106
    sget-object p0, Ll/ۗ۠ۜ;->ۧ:Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 107
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string p1, "Interrupted while waiting to replace HTTP cache generation"

    invoke-direct {p0, p1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 112
    :cond_5
    :try_start_7
    iget-object p2, p1, Ll/ۙ۠ۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ll/ܺ᩸֫;->ܽ(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p0

    goto :goto_4

    :cond_6
    :goto_3
    move-object p3, p1

    .line 117
    :catch_3
    :try_start_8
    iput-boolean v5, v3, Ll/ܶ۠ۜ;->ܳ:Z

    if-nez p3, :cond_7

    .line 119
    invoke-static {v4}, Ll/᩸۠ۜ;->ۧ(Ll/᩸۠ۜ;)V

    .line 120
    invoke-virtual {p0}, Ll/᩻۬ۜ;->ܽ()V

    .line 121
    sget-object p0, Ll/ۗ۠ۜ;->ۧ:Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 122
    invoke-static {}, Ll/᩸۠ۜ;->ܳ()Ll/᩸۠ۜ;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 124
    :cond_7
    invoke-virtual {p0}, Ll/᩻۬ۜ;->ܳ()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v3, Ll/ܶ۠ۜ;->ܿ:Ljava/lang/String;

    .line 125
    iget-object p0, p3, Ll/ۙ۠ۜ;->֫:Ljava/lang/String;

    iput-object p0, v3, Ll/ܶ۠ۜ;->ۧ:Ljava/lang/String;

    .line 126
    iget-wide p0, p3, Ll/ۙ۠ۜ;->ۧ:J

    iput-wide p0, v3, Ll/ܶ۠ۜ;->ܽ:J

    .line 127
    iget-object p0, p3, Ll/ۙ۠ۜ;->ᩳ:Ljava/lang/Boolean;

    iput-object p0, v3, Ll/ܶ۠ۜ;->ᩳ:Ljava/lang/Boolean;

    .line 128
    invoke-static {v4}, Ll/᩸۠ۜ;->֫(Ll/᩸۠ۜ;)Z

    move-result p0

    if-nez p0, :cond_8

    .line 129
    iget-object p0, p3, Ll/ۙ۠ۜ;->֫:Ljava/lang/String;

    iget-wide p1, p3, Ll/ۙ۠ۜ;->ۧ:J

    iget-object p3, p3, Ll/ۙ۠ۜ;->ᩳ:Ljava/lang/Boolean;

    invoke-static {v4, p0, p1, p2, p3}, Ll/᩸۠ۜ;->֫(Ll/᩸۠ۜ;Ljava/lang/String;JLjava/lang/Boolean;)V

    .line 132
    :cond_8
    sget-object p0, Ll/ۗ۠ۜ;->ۧ:Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 133
    invoke-static {v4}, Ll/᩸۠ۜ;->֫(Ll/᩸۠ۜ;)Z

    move-result p0

    if-eqz p0, :cond_9

    invoke-static {}, Ll/᩸۠ۜ;->ܳ()Ll/᩸۠ۜ;

    move-result-object v4

    :cond_9
    monitor-exit v0

    return-object v4

    .line 134
    :goto_4
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw p0

    :catchall_1
    move-exception p0

    .line 88
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw p0
.end method

.method public static ֫(Ll/ܶ۠ۜ;Ll/᩸۠֫;)V
    .locals 3

    .line 269
    sget-object v0, Ll/ۗ۠ۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 270
    :try_start_0
    iget-boolean v1, p0, Ll/ܶ۠ۜ;->ܳ:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ܶ۠ۜ;->᩷:I

    iget v2, p0, Ll/ܶ۠ۜ;->֫:I

    add-int/2addr v1, v2

    if-eqz v1, :cond_0

    .line 273
    iput-object p1, p0, Ll/ܶ۠ۜ;->᩻:Ll/᩸۠֫;

    .line 274
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iput-object p1, p0, Ll/ܶ۠ۜ;->ۜ:Ljava/lang/Thread;

    .line 275
    monitor-exit v0

    return-void

    .line 271
    :cond_0
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string p1, "HTTP validation was canceled"

    invoke-direct {p0, p1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 275
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۧ(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    .line 360
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 362
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    .line 363
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 364
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 2

    .line 303
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 304
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 305
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 306
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ll/ܶ۠ۜ;Ll/᩸۠֫;)V
    .locals 2

    .line 280
    sget-object v0, Ll/ۗ۠ۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 281
    :try_start_0
    iget-object v1, p0, Ll/ܶ۠ۜ;->᩻:Ll/᩸۠֫;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 282
    iput-object p1, p0, Ll/ܶ۠ۜ;->᩻:Ll/᩸۠֫;

    .line 283
    iput-object p1, p0, Ll/ܶ۠ۜ;->ۜ:Ljava/lang/Thread;

    .line 285
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
