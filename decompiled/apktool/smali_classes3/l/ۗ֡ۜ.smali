.class public final Ll/ۗ֡ۜ;
.super Ll/ۖ۠֫;
.source "Q8FL"


# instance fields
.field public final synthetic ۜ:Ll/ܽۚۜ;

.field public ܳ:Ljava/io/InputStream;

.field public ܿ:J

.field public ᩷:Landroid/net/Uri;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܽۚۜ;)V
    .locals 0

    .line 1123
    iput-object p1, p0, Ll/ۗ֡ۜ;->ۜ:Ll/ܽۚۜ;

    .line 1124
    invoke-static {p1}, Ll/ܽۚۜ;->ᩳ(Ll/ܽۚۜ;)Ll/ܰܺܳ;

    move-result-object p1

    instance-of p1, p1, Ll/ۗۢ᩻;

    invoke-direct {p0, p1}, Ll/ۖ۠֫;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    const/4 v0, 0x0

    .line 1239
    iput-object v0, p0, Ll/ۗ֡ۜ;->᩷:Landroid/net/Uri;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    .line 1241
    :try_start_0
    iget-object v4, p0, Ll/ۗ֡ۜ;->ܳ:Ljava/io/InputStream;

    if-eqz v4, :cond_0

    .line 1242
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1245
    :cond_0
    iput-object v0, p0, Ll/ۗ֡ۜ;->ܳ:Ljava/io/InputStream;

    .line 1246
    iput-wide v2, p0, Ll/ۗ֡ۜ;->ܿ:J

    .line 1247
    iget-boolean v0, p0, Ll/ۗ֡ۜ;->᩻:Z

    if-eqz v0, :cond_1

    .line 1248
    iput-boolean v1, p0, Ll/ۗ֡ۜ;->᩻:Z

    .line 1249
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    :cond_1
    return-void

    :catchall_0
    move-exception v4

    .line 1245
    iput-object v0, p0, Ll/ۗ֡ۜ;->ܳ:Ljava/io/InputStream;

    .line 1246
    iput-wide v2, p0, Ll/ۗ֡ۜ;->ܿ:J

    .line 1247
    iget-boolean v0, p0, Ll/ۗ֡ۜ;->᩻:Z

    if-eqz v0, :cond_2

    .line 1248
    iput-boolean v1, p0, Ll/ۗ֡ۜ;->᩻:Z

    .line 1249
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 1251
    :cond_2
    throw v4
.end method

.method public final read([BII)I
    .locals 10

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1205
    :cond_0
    iget-wide v0, p0, Ll/ۗ֡ۜ;->ܿ:J

    const-wide/16 v2, 0x0

    const/4 v4, -0x1

    cmp-long v5, v0, v2

    if-nez v5, :cond_1

    return v4

    .line 1208
    :cond_1
    iget-object v5, p0, Ll/ۗ֡ۜ;->ܳ:Ljava/io/InputStream;

    if-eqz v5, :cond_5

    const-wide/16 v6, -0x1

    cmp-long v8, v0, v6

    if-nez v8, :cond_2

    goto :goto_0

    :cond_2
    int-to-long v8, p3

    .line 1214
    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    .line 1216
    :goto_0
    :try_start_0
    invoke-virtual {v5, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-ne p1, v4, :cond_3

    .line 1218
    iput-wide v2, p0, Ll/ۗ֡ۜ;->ܿ:J

    return v4

    .line 1221
    :cond_3
    iget-wide p2, p0, Ll/ۗ֡ۜ;->ܿ:J

    cmp-long v0, p2, v6

    if-eqz v0, :cond_4

    int-to-long v0, p1

    sub-long/2addr p2, v0

    .line 1222
    iput-wide p2, p0, Ll/ۗ֡ۜ;->ܿ:J

    .line 1224
    :cond_4
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ᩳ(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 1227
    iget-object p2, p0, Ll/ۗ֡ۜ;->ۜ:Ll/ܽۚۜ;

    invoke-static {p2, p1}, Ll/ܽۚۜ;->֫(Ll/ܽۚۜ;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 1210
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Data source is not open"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 1129
    iget-object v2, v0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iget-wide v3, v0, Ll/ۗ۠֫;->᩻:J

    iput-object v2, v1, Ll/ۗ֡ۜ;->᩷:Landroid/net/Uri;

    .line 1130
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ۧ(Ll/ۗ۠֫;)V

    .line 1131
    iget-object v2, v1, Ll/ۗ֡ۜ;->᩷:Landroid/net/Uri;

    iget-object v5, v1, Ll/ۗ֡ۜ;->ۜ:Ll/ܽۚۜ;

    invoke-virtual {v5, v2}, Ll/ܽۚۜ;->ۧ(Landroid/net/Uri;)Ll/ᩳۜܳ;

    move-result-object v2

    .line 1132
    invoke-interface {v2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v6

    const/16 v8, 0x7d8

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    cmp-long v12, v6, v10

    if-ltz v12, :cond_1

    cmp-long v13, v3, v6

    if-gtz v13, :cond_0

    goto :goto_0

    .line 1134
    :cond_0
    new-instance v0, Ll/᩹۠֫;

    invoke-direct {v0, v9, v9, v8}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    throw v0

    .line 1136
    :cond_1
    :goto_0
    iget-wide v13, v0, Ll/ۗ۠֫;->ܳ:J

    iput-wide v13, v1, Ll/ۗ֡ۜ;->ܿ:J

    const-wide/16 v15, -0x1

    cmp-long v17, v13, v15

    if-nez v17, :cond_2

    if-ltz v12, :cond_2

    sub-long v13, v6, v3

    .line 1138
    iput-wide v13, v1, Ll/ۗ֡ۜ;->ܿ:J

    :cond_2
    const/4 v13, 0x1

    if-ltz v12, :cond_3

    cmp-long v12, v3, v6

    if-nez v12, :cond_3

    .line 1142
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayInputStream;

    const/4 v3, 0x0

    new-array v3, v3, [B

    invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object v2, v1, Ll/ۗ֡ۜ;->ܳ:Ljava/io/InputStream;

    .line 1143
    iput-boolean v13, v1, Ll/ۗ֡ۜ;->᩻:Z

    .line 1144
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    .line 1145
    iget-wide v2, v1, Ll/ۗ֡ۜ;->ܿ:J

    return-wide v2

    .line 1147
    :cond_3
    invoke-static {v5}, Ll/ܽۚۜ;->ᩳ(Ll/ܽۚۜ;)Ll/ܰܺܳ;

    move-result-object v6

    instance-of v7, v6, Ll/ۗۢ᩻;

    if-eqz v7, :cond_6

    check-cast v6, Ll/ۗۢ᩻;

    .line 1148
    invoke-static {v5, v2}, Ll/ܽۚۜ;->֫(Ll/ܽۚۜ;Ll/ᩳۜܳ;)V

    .line 1179
    invoke-static {v5}, Ll/ܽۚۜ;->ۧ(Ll/ܽۚۜ;)Z

    move-result v7

    if-nez v7, :cond_5

    .line 1150
    iget-wide v7, v0, Ll/ۗ۠֫;->ܳ:J

    cmp-long v10, v7, v15

    if-nez v10, :cond_4

    .line 1152
    invoke-interface {v2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v3, v4, v7}, Ll/ۗۢ᩻;->֫(JLjava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    goto :goto_1

    .line 1153
    :cond_4
    invoke-interface {v2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v18

    iget-wide v3, v0, Ll/ۗ۠֫;->᩻:J

    move-object/from16 v17, v6

    move-wide/from16 v19, v3

    move-wide/from16 v21, v7

    invoke-virtual/range {v17 .. v22}, Ll/ۗۢ᩻;->֫(Ljava/lang/String;JJ)Ljava/io/InputStream;

    move-result-object v3

    :goto_1
    iput-object v3, v1, Ll/ۗ֡ۜ;->ܳ:Ljava/io/InputStream;

    goto :goto_4

    .line 1180
    :cond_5
    new-instance v0, Ll/ۘ֡ۜ;

    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-direct {v0, v2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 1180
    throw v0

    .line 1154
    :cond_6
    invoke-static {v5}, Ll/ܽۚۜ;->ᩳ(Ll/ܽۚۜ;)Ll/ܰܺܳ;

    move-result-object v6

    instance-of v6, v6, Ll/ۖۧ᩻;

    if-eqz v6, :cond_d

    .line 1179
    invoke-static {v5}, Ll/ܽۚۜ;->ۧ(Ll/ܽۚۜ;)Z

    move-result v6

    if-nez v6, :cond_c

    .line 1156
    invoke-interface {v2}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v6

    iput-object v6, v1, Ll/ۗ֡ۜ;->ܳ:Ljava/io/InputStream;

    :goto_2
    cmp-long v7, v3, v10

    if-lez v7, :cond_9

    .line 1188
    invoke-virtual {v6, v3, v4}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v14

    cmp-long v7, v14, v10

    if-lez v7, :cond_7

    goto :goto_3

    .line 1193
    :cond_7
    invoke-virtual {v6}, Ljava/io/InputStream;->read()I

    move-result v7

    const/4 v12, -0x1

    if-eq v7, v12, :cond_8

    const-wide/16 v14, 0x1

    :goto_3
    sub-long/2addr v3, v14

    goto :goto_2

    .line 1194
    :cond_8
    new-instance v0, Ll/᩹۠֫;

    invoke-direct {v0, v9, v9, v8}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    throw v0

    .line 1161
    :cond_9
    :goto_4
    invoke-static {v5}, Ll/ܽۚۜ;->ۧ(Ll/ܽۚۜ;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 1162
    iget-object v0, v1, Ll/ۗ֡ۜ;->ܳ:Ljava/io/InputStream;

    .line 1163
    iput-object v9, v1, Ll/ۗ֡ۜ;->ܳ:Ljava/io/InputStream;

    if-eqz v0, :cond_a

    .line 1165
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 1167
    :cond_a
    new-instance v0, Ll/ۘ֡ۜ;

    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-direct {v0, v2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 1167
    throw v0

    .line 1169
    :cond_b
    iput-boolean v13, v1, Ll/ۗ֡ۜ;->᩻:Z

    .line 1170
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    .line 1171
    iget-wide v2, v1, Ll/ۗ֡ۜ;->ܿ:J

    return-wide v2

    .line 1180
    :cond_c
    new-instance v0, Ll/ۘ֡ۜ;

    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-direct {v0, v2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 1180
    throw v0

    .line 1159
    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HLS direct reading requires a local or network visitor"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 1173
    invoke-static {v5, v0}, Ll/ܽۚۜ;->֫(Ll/ܽۚۜ;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 1234
    iget-object v0, p0, Ll/ۗ֡ۜ;->᩷:Landroid/net/Uri;

    return-object v0
.end method
