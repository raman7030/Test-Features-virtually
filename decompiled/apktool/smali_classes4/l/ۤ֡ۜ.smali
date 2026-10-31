.class public final Ll/ۤ֡ۜ;
.super Ll/ۖ۠֫;
.source "Q8FL"


# instance fields
.field public ۜ:J

.field public ۡ:Landroid/net/Uri;

.field public final synthetic ۢ:Ll/ܽۚۜ;

.field public ܳ:Ll/ܰ᩻᩻;

.field public ܿ:J

.field public ᩷:Ll/᩻ۖܽ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܽۚۜ;)V
    .locals 0

    .line 971
    iput-object p1, p0, Ll/ۤ֡ۜ;->ۢ:Ll/ܽۚۜ;

    .line 972
    invoke-static {p1}, Ll/ܽۚۜ;->ᩳ(Ll/ܽۚۜ;)Ll/ܰܺܳ;

    move-result-object p1

    instance-of p1, p1, Ll/ۗۢ᩻;

    invoke-direct {p0, p1}, Ll/ۖ۠֫;-><init>(Z)V

    return-void
.end method

.method private ֫(Ll/ۗ۠֫;Ll/ܶ᩵ܿ;)J
    .locals 4

    const-string v0, "r"

    .line 1013
    invoke-virtual {p2, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p2

    iput-object p2, p0, Ll/ۤ֡ۜ;->᩷:Ll/᩻ۖܽ;

    .line 1014
    iget-wide v0, p1, Ll/ۗ۠֫;->᩻:J

    invoke-virtual {p2, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    .line 1015
    iget-wide v0, p1, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v2, -0x1

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iget-object p2, p0, Ll/ۤ֡ۜ;->᩷:Ll/᩻ۖܽ;

    invoke-virtual {p2}, Ll/᩻ۖܽ;->length()J

    move-result-wide v0

    iget-wide v2, p1, Ll/ۗ۠֫;->᩻:J

    sub-long/2addr v0, v2

    :cond_0
    iput-wide v0, p0, Ll/ۤ֡ۜ;->ܿ:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-ltz p2, :cond_1

    const/4 p2, 0x1

    .line 1019
    iput-boolean p2, p0, Ll/ۤ֡ۜ;->᩻:Z

    .line 1020
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    .line 1021
    iget-wide p1, p0, Ll/ۤ֡ۜ;->ܿ:J

    return-wide p1

    .line 1017
    :cond_1
    new-instance p1, Ll/᩹۠֫;

    const/16 p2, 0x7d8

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0, p2}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 5

    const/4 v0, 0x0

    .line 1091
    iput-object v0, p0, Ll/ۤ֡ۜ;->ۡ:Landroid/net/Uri;

    const/4 v1, 0x0

    .line 1093
    :try_start_0
    iget-object v2, p0, Ll/ۤ֡ۜ;->᩷:Ll/᩻ۖܽ;

    if-eqz v2, :cond_0

    .line 1094
    invoke-virtual {v2}, Ll/᩻ۖܽ;->close()V

    .line 1096
    :cond_0
    iget-object v2, p0, Ll/ۤ֡ۜ;->ܳ:Ll/ܰ᩻᩻;

    if-eqz v2, :cond_1

    .line 1097
    invoke-virtual {v2}, Ll/ܰ᩻᩻;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1102
    :cond_1
    iput-object v0, p0, Ll/ۤ֡ۜ;->᩷:Ll/᩻ۖܽ;

    .line 1103
    iput-object v0, p0, Ll/ۤ֡ۜ;->ܳ:Ll/ܰ᩻᩻;

    .line 1104
    iget-boolean v0, p0, Ll/ۤ֡ۜ;->᩻:Z

    if-eqz v0, :cond_2

    .line 1105
    iput-boolean v1, p0, Ll/ۤ֡ۜ;->᩻:Z

    .line 1106
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    :cond_2
    return-void

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v2

    .line 1100
    :try_start_1
    new-instance v3, Ll/᩹۠֫;

    const/16 v4, 0x7d0

    invoke-direct {v3, v4, v2}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1102
    :goto_0
    iput-object v0, p0, Ll/ۤ֡ۜ;->᩷:Ll/᩻ۖܽ;

    .line 1103
    iput-object v0, p0, Ll/ۤ֡ۜ;->ܳ:Ll/ܰ᩻᩻;

    .line 1104
    iget-boolean v0, p0, Ll/ۤ֡ۜ;->᩻:Z

    if-eqz v0, :cond_3

    .line 1105
    iput-boolean v1, p0, Ll/ۤ֡ۜ;->᩻:Z

    .line 1106
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 1108
    :cond_3
    throw v2
.end method

.method public final read([BII)I
    .locals 7

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1059
    :cond_0
    iget-wide v0, p0, Ll/ۤ֡ۜ;->ܿ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const/4 p1, -0x1

    return p1

    .line 1064
    :cond_1
    :try_start_0
    iget-object v2, p0, Ll/ۤ֡ۜ;->᩷:Ll/᩻ۖܽ;

    if-eqz v2, :cond_2

    int-to-long v3, p3

    .line 1065
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    invoke-virtual {v2, p1, p2, p3}, Ll/᩻ۖܽ;->read([BII)I

    move-result p1

    goto :goto_0

    .line 1067
    :cond_2
    iget-object v2, p0, Ll/ۤ֡ۜ;->ܳ:Ll/ܰ᩻᩻;

    iget-wide v3, p0, Ll/ۤ֡ۜ;->ۜ:J

    int-to-long v5, p3

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v5, v0

    move-object v0, v2

    move-wide v1, v3

    move-object v3, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Ll/ܰ᩻᩻;->ܽ(J[BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    if-lez p1, :cond_3

    .line 1074
    iget-wide p2, p0, Ll/ۤ֡ۜ;->ۜ:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/ۤ֡ۜ;->ۜ:J

    .line 1075
    iget-wide p2, p0, Ll/ۤ֡ۜ;->ܿ:J

    sub-long/2addr p2, v0

    iput-wide p2, p0, Ll/ۤ֡ۜ;->ܿ:J

    .line 1076
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ᩳ(I)V

    :cond_3
    return p1

    :catch_0
    move-exception p1

    .line 1070
    new-instance p2, Ll/᩹۠֫;

    const/16 p3, 0x7d0

    invoke-direct {p2, p3, p1}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    throw p2
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 977
    iget-object v2, v1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iget-wide v3, v1, Ll/ۗ۠֫;->ܳ:J

    iput-object v2, v0, Ll/ۤ֡ۜ;->ۡ:Landroid/net/Uri;

    .line 978
    iget-wide v5, v1, Ll/ۗ۠֫;->᩻:J

    iput-wide v5, v0, Ll/ۤ֡ۜ;->ۜ:J

    .line 979
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ۧ(Ll/ۗ۠֫;)V

    .line 980
    iget-object v2, v0, Ll/ۤ֡ۜ;->ۡ:Landroid/net/Uri;

    iget-object v7, v0, Ll/ۤ֡ۜ;->ۢ:Ll/ܽۚۜ;

    invoke-virtual {v7, v2}, Ll/ܽۚۜ;->ۧ(Landroid/net/Uri;)Ll/ᩳۜܳ;

    move-result-object v2

    .line 1004
    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/ᩳۗۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_0

    .line 1005
    invoke-static {v7, v2}, Ll/ܽۚۜ;->ܽ(Ll/ܽۚۜ;Ll/ᩳۜܳ;)Z

    move-result v8

    goto :goto_0

    .line 1007
    :cond_0
    invoke-virtual {v7, v2}, Ll/ܽۚۜ;->ܽ(Ll/ᩳۜܳ;)V

    const/4 v8, 0x0

    .line 982
    :goto_0
    invoke-static {v7}, Ll/ܽۚۜ;->ܽ(Ll/ܽۚۜ;)Ll/ܶ᩵ܿ;

    move-result-object v9

    if-nez v9, :cond_1

    .line 983
    invoke-interface {v2}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ۤ֡ۜ;->֫(Ll/ۗ۠֫;Ll/ܶ᩵ܿ;)J

    move-result-wide v1

    return-wide v1

    .line 985
    :cond_1
    invoke-static {v2}, Ll/ܽۚۜ;->ܿ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v9

    .line 986
    invoke-static {v7, v9}, Ll/ܽۚۜ;->֫(Ll/ܽۚۜ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v10

    .line 987
    invoke-static {v7, v2, v10}, Ll/ܽۚۜ;->֫(Ll/ܽۚۜ;Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 988
    invoke-static {v7, v2, v9}, Ll/ܽۚۜ;->ۧ(Ll/ܽۚۜ;Ll/ᩳۜܳ;Ljava/lang/String;)V

    .line 989
    invoke-direct {v0, v1, v10}, Ll/ۤ֡ۜ;->֫(Ll/ۗ۠֫;Ll/ܶ᩵ܿ;)J

    move-result-wide v1

    return-wide v1

    :cond_2
    const-wide/16 v13, -0x1

    const-wide/16 v15, 0x0

    if-eqz v8, :cond_6

    .line 1039
    invoke-static {v7}, Ll/ܽۚۜ;->ᩳ(Ll/ܽۚۜ;)Ll/ܰܺܳ;

    move-result-object v7

    instance-of v8, v7, Ll/ۗۢ᩻;

    if-eqz v8, :cond_5

    check-cast v7, Ll/ۗۢ᩻;

    .line 1042
    new-instance v8, Ll/ܰ᩻᩻;

    new-instance v9, Ll/ܿۖۜ;

    invoke-direct {v9, v7, v2}, Ll/ܿۖۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1044
    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v7

    .line 1045
    invoke-interface {v2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v11

    invoke-direct {v8, v9, v7, v11, v12}, Ll/ܰ᩻᩻;-><init>(Ll/᩺᩻᩻;Ljava/lang/String;J)V

    iput-object v8, v0, Ll/ۤ֡ۜ;->ܳ:Ll/ܰ᩻᩻;

    cmp-long v2, v3, v13

    if-nez v2, :cond_3

    .line 1046
    invoke-virtual {v8}, Ll/ܰ᩻᩻;->ᩳ()J

    move-result-wide v2

    sub-long v3, v2, v5

    :cond_3
    iput-wide v3, v0, Ll/ۤ֡ۜ;->ܿ:J

    cmp-long v2, v3, v15

    if-ltz v2, :cond_4

    const/4 v2, 0x1

    .line 1050
    iput-boolean v2, v0, Ll/ۤ֡ۜ;->᩻:Z

    .line 1051
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    .line 1052
    iget-wide v1, v0, Ll/ۤ֡ۜ;->ܿ:J

    return-wide v1

    .line 1048
    :cond_4
    new-instance v1, Ll/᩹۠֫;

    const/4 v2, 0x0

    const/16 v3, 0x7d8

    invoke-direct {v1, v2, v2, v3}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    throw v1

    .line 1040
    :cond_5
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Network range cache is not available"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 994
    :cond_6
    invoke-static {v7, v2}, Ll/ܽۚۜ;->ۧ(Ll/ܽۚۜ;Ll/ᩳۜܳ;)Z

    move-result v8

    if-eqz v8, :cond_9

    .line 1025
    invoke-static {v7, v2, v9}, Ll/ܽۚۜ;->֫(Ll/ܽۚۜ;Ll/ᩳۜܳ;Ljava/lang/String;)Ll/ܰ᩻᩻;

    move-result-object v2

    iput-object v2, v0, Ll/ۤ֡ۜ;->ܳ:Ll/ܰ᩻᩻;

    cmp-long v7, v3, v13

    if-nez v7, :cond_7

    .line 1026
    invoke-virtual {v2}, Ll/ܰ᩻᩻;->ᩳ()J

    move-result-wide v2

    sub-long v3, v2, v5

    :cond_7
    iput-wide v3, v0, Ll/ۤ֡ۜ;->ܿ:J

    cmp-long v2, v3, v15

    if-ltz v2, :cond_8

    const/4 v2, 0x1

    .line 1030
    iput-boolean v2, v0, Ll/ۤ֡ۜ;->᩻:Z

    .line 1031
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    .line 1032
    iget-wide v1, v0, Ll/ۤ֡ۜ;->ܿ:J

    return-wide v1

    .line 1028
    :cond_8
    new-instance v1, Ll/᩹۠֫;

    const/4 v2, 0x0

    const/16 v3, 0x7d8

    invoke-direct {v1, v2, v2, v3}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    throw v1

    .line 997
    :cond_9
    invoke-direct {v0, v1, v10}, Ll/ۤ֡ۜ;->֫(Ll/ۗ۠֫;Ll/ܶ᩵ܿ;)J

    move-result-wide v1

    return-wide v1
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 1086
    iget-object v0, p0, Ll/ۤ֡ۜ;->ۡ:Landroid/net/Uri;

    return-object v0
.end method
