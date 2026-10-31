.class public final Ll/۟ۧۧ;
.super Ljava/lang/Object;
.source "L8S9"

# interfaces
.implements Ll/᩻ܳۧ;
.implements Ll/۟֫ۧ;


# instance fields
.field public final ֫:Ll/ᩴܶ֫;

.field public final synthetic ۖ:Ll/ᩳܽۧ;

.field public final ۘ:Landroid/net/Uri;

.field public ۜ:Z

.field public ۡ:J

.field public final ۢ:Ll/۫ۧۧ;

.field public ۧ:Ll/ۗ۠֫;

.field public final ܳ:Ll/ܳۚ֫;

.field public ܺ:Z

.field public final ܽ:Ll/᩸᩷ۧ;

.field public volatile ܿ:Z

.field public ᩳ:Ll/᩵ۢۧ;

.field public final ᩷:Ll/᩻ۢۧ;

.field public final ᩻:J


# direct methods
.method public constructor <init>(Ll/ᩳܽۧ;Landroid/net/Uri;Ll/᩸۠֫;Ll/ܺ֫ۧ;Ll/᩸᩷ۧ;Ll/ܳۚ֫;)V
    .locals 0

    .line 1083
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    .line 1084
    iput-object p2, p0, Ll/۟ۧۧ;->ۘ:Landroid/net/Uri;

    .line 1085
    new-instance p1, Ll/ᩴܶ֫;

    invoke-direct {p1, p3}, Ll/ᩴܶ֫;-><init>(Ll/᩸۠֫;)V

    iput-object p1, p0, Ll/۟ۧۧ;->֫:Ll/ᩴܶ֫;

    .line 1086
    iput-object p4, p0, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    .line 1087
    iput-object p5, p0, Ll/۟ۧۧ;->ܽ:Ll/᩸᩷ۧ;

    .line 1088
    iput-object p6, p0, Ll/۟ۧۧ;->ܳ:Ll/ܳۚ֫;

    .line 1089
    new-instance p1, Ll/᩻ۢۧ;

    .line 22
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 1089
    iput-object p1, p0, Ll/۟ۧۧ;->᩷:Ll/᩻ۢۧ;

    const/4 p1, 0x1

    .line 1090
    iput-boolean p1, p0, Ll/۟ۧۧ;->ۜ:Z

    .line 1091
    invoke-static {}, Ll/ۧۧۧ;->֫()J

    move-result-wide p1

    iput-wide p1, p0, Ll/۟ۧۧ;->᩻:J

    const-wide/16 p1, 0x0

    .line 1092
    invoke-direct {p0, p1, p2}, Ll/۟ۧۧ;->֫(J)Ll/ۗ۠֫;

    move-result-object p1

    iput-object p1, p0, Ll/۟ۧۧ;->ۧ:Ll/ۗ۠֫;

    return-void
.end method

.method private ֫(J)Ll/ۗ۠֫;
    .locals 2

    .line 1188
    new-instance v0, Ll/ۙ۠֫;

    invoke-direct {v0}, Ll/ۙ۠֫;-><init>()V

    iget-object v1, p0, Ll/۟ۧۧ;->ۘ:Landroid/net/Uri;

    .line 1189
    invoke-virtual {v0, v1}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    .line 1190
    invoke-virtual {v0, p1, p2}, Ll/ۙ۠֫;->ۧ(J)V

    sget p1, Ll/ᩳܽۧ;->ۤ֫:I

    const/4 p1, 0x0

    .line 1191
    invoke-virtual {v0, p1}, Ll/ۙ۠֫;->֫(Ljava/lang/String;)V

    const/4 p1, 0x6

    .line 1192
    invoke-virtual {v0, p1}, Ll/ۙ۠֫;->֫(I)V

    invoke-static {}, Ll/ᩳܽۧ;->ۖ()Ljava/util/Map;

    move-result-object p1

    .line 1194
    invoke-virtual {v0, p1}, Ll/ۙ۠֫;->֫(Ljava/util/Map;)V

    .line 1195
    invoke-virtual {v0}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object p1

    return-object p1
.end method

.method public static bridge synthetic ֫(Ll/۟ۧۧ;)Ll/ᩴܶ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ۧۧ;->֫:Ll/ᩴܶ֫;

    return-object p0
.end method

.method public static ֫(Ll/۟ۧۧ;JJ)V
    .locals 1

    .line 1199
    iget-object v0, p0, Ll/۟ۧۧ;->᩷:Ll/᩻ۢۧ;

    iput-wide p1, v0, Ll/᩻ۢۧ;->֫:J

    .line 1200
    iput-wide p3, p0, Ll/۟ۧۧ;->ۡ:J

    const/4 p1, 0x1

    .line 1201
    iput-boolean p1, p0, Ll/۟ۧۧ;->ۜ:Z

    const/4 p1, 0x0

    .line 1202
    iput-boolean p1, p0, Ll/۟ۧۧ;->ܺ:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۟ۧۧ;)Ll/ۗ۠֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ۧۧ;->ۧ:Ll/ۗ۠֫;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/۟ۧۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/۟ۧۧ;->᩻:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/۟ۧۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/۟ۧۧ;->ۡ:J

    return-wide v0
.end method


# virtual methods
.method public final ֫()V
    .locals 17

    move-object/from16 v1, p0

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_c

    .line 1105
    iget-boolean v3, v1, Ll/۟ۧۧ;->ܿ:Z

    if-nez v3, :cond_c

    const/4 v3, 0x1

    const-wide/16 v4, -0x1

    .line 1107
    :try_start_0
    iget-object v6, v1, Ll/۟ۧۧ;->᩷:Ll/᩻ۢۧ;

    iget-wide v13, v6, Ll/᩻ۢۧ;->֫:J

    .line 1108
    invoke-direct {v1, v13, v14}, Ll/۟ۧۧ;->֫(J)Ll/ۗ۠֫;

    move-result-object v6

    iput-object v6, v1, Ll/۟ۧۧ;->ۧ:Ll/ۗ۠֫;

    .line 1109
    iget-object v7, v1, Ll/۟ۧۧ;->֫:Ll/ᩴܶ֫;

    invoke-virtual {v7, v6}, Ll/ᩴܶ֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v6

    .line 1110
    iget-boolean v8, v1, Ll/۟ۧۧ;->ܿ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v8, :cond_2

    if-ne v2, v3, :cond_0

    goto :goto_1

    .line 1157
    :cond_0
    iget-object v0, v1, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    check-cast v0, Ll/ܺ֫ۧ;

    invoke-virtual {v0}, Ll/ܺ֫ۧ;->ۧ()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1

    .line 1158
    iget-object v0, v1, Ll/۟ۧۧ;->᩷:Ll/᩻ۢۧ;

    iget-object v2, v1, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    check-cast v2, Ll/ܺ֫ۧ;

    invoke-virtual {v2}, Ll/ܺ֫ۧ;->ۧ()J

    move-result-wide v2

    iput-wide v2, v0, Ll/᩻ۢۧ;->֫:J

    .line 1160
    :cond_1
    :goto_1
    iget-object v0, v1, Ll/۟ۧۧ;->֫:Ll/ᩴܶ֫;

    invoke-static {v0}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    return-void

    :cond_2
    cmp-long v8, v6, v4

    if-eqz v8, :cond_3

    add-long/2addr v6, v13

    .line 1115
    :try_start_1
    iget-object v8, v1, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    invoke-static {v8}, Ll/ᩳܽۧ;->ۢ(Ll/ᩳܽۧ;)V

    :cond_3
    move-wide v15, v6

    .line 1117
    iget-object v6, v1, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    iget-object v7, v1, Ll/۟ۧۧ;->֫:Ll/ᩴܶ֫;

    invoke-virtual {v7}, Ll/ᩴܶ֫;->֫()Ljava/util/Map;

    move-result-object v7

    invoke-static {v7}, Ll/ۤۡۧ;->֫(Ljava/util/Map;)Ll/ۤۡۧ;

    move-result-object v7

    invoke-static {v6, v7}, Ll/ᩳܽۧ;->֫(Ll/ᩳܽۧ;Ll/ۤۡۧ;)V

    .line 1118
    iget-object v6, v1, Ll/۟ۧۧ;->֫:Ll/ᩴܶ֫;

    .line 1119
    iget-object v7, v1, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    invoke-static {v7}, Ll/ᩳܽۧ;->᩻(Ll/ᩳܽۧ;)Ll/ۤۡۧ;

    move-result-object v7

    if-eqz v7, :cond_4

    iget-object v7, v1, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    invoke-static {v7}, Ll/ᩳܽۧ;->᩻(Ll/ᩳܽۧ;)Ll/ۤۡۧ;

    move-result-object v7

    iget v7, v7, Ll/ۤۡۧ;->ᩳ:I

    const/4 v8, -0x1

    if-eq v7, v8, :cond_4

    .line 1120
    new-instance v6, Ll/֫ۧۧ;

    iget-object v7, v1, Ll/۟ۧۧ;->֫:Ll/ᩴܶ֫;

    iget-object v8, v1, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    invoke-static {v8}, Ll/ᩳܽۧ;->᩻(Ll/ᩳܽۧ;)Ll/ۤۡۧ;

    move-result-object v8

    iget v8, v8, Ll/ۤۡۧ;->ᩳ:I

    invoke-direct {v6, v7, v8, v1}, Ll/֫ۧۧ;-><init>(Ll/᩸۠֫;ILl/۟֫ۧ;)V

    .line 1121
    iget-object v7, v1, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    invoke-virtual {v7}, Ll/ᩳܽۧ;->ۢ()Ll/᩵ۢۧ;

    move-result-object v7

    iput-object v7, v1, Ll/۟ۧۧ;->ᩳ:Ll/᩵ۢۧ;

    .line 1122
    invoke-static {}, Ll/ᩳܽۧ;->ܺ()Ll/۠ᩴ֫;

    move-result-object v8

    invoke-interface {v7, v8}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    :cond_4
    move-object v8, v6

    .line 1124
    iget-object v6, v1, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    iget-object v9, v1, Ll/۟ۧۧ;->ۘ:Landroid/net/Uri;

    iget-object v7, v1, Ll/۟ۧۧ;->֫:Ll/ᩴܶ֫;

    .line 1127
    invoke-virtual {v7}, Ll/ᩴܶ֫;->֫()Ljava/util/Map;

    move-result-object v10

    iget-object v11, v1, Ll/۟ۧۧ;->ܽ:Ll/᩸᩷ۧ;

    .line 1124
    move-object v7, v6

    check-cast v7, Ll/ܺ֫ۧ;

    move-object v6, v11

    move-wide v11, v13

    move-wide v4, v13

    move-wide v13, v15

    move-object v15, v6

    invoke-virtual/range {v7 .. v15}, Ll/ܺ֫ۧ;->֫(Ll/᩸۠֫;Landroid/net/Uri;Ljava/util/Map;JJLl/᩸᩷ۧ;)V

    .line 1132
    iget-object v6, v1, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    invoke-static {v6}, Ll/ᩳܽۧ;->᩻(Ll/ᩳܽۧ;)Ll/ۤۡۧ;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 1133
    iget-object v6, v1, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    check-cast v6, Ll/ܺ֫ۧ;

    invoke-virtual {v6}, Ll/ܺ֫ۧ;->֫()V

    .line 1136
    :cond_5
    iget-boolean v6, v1, Ll/۟ۧۧ;->ۜ:Z

    if-eqz v6, :cond_6

    .line 1137
    iget-object v6, v1, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    iget-wide v7, v1, Ll/۟ۧۧ;->ۡ:J

    check-cast v6, Ll/ܺ֫ۧ;

    invoke-virtual {v6, v4, v5, v7, v8}, Ll/ܺ֫ۧ;->֫(JJ)V

    .line 1138
    iput-boolean v0, v1, Ll/۟ۧۧ;->ۜ:Z

    :cond_6
    :goto_2
    move-wide v13, v4

    :cond_7
    if-nez v2, :cond_8

    .line 1140
    iget-boolean v4, v1, Ll/۟ۧۧ;->ܿ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v4, :cond_8

    .line 1142
    :try_start_2
    iget-object v4, v1, Ll/۟ۧۧ;->ܳ:Ll/ܳۚ֫;

    invoke-virtual {v4}, Ll/ܳۚ֫;->֫()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1146
    :try_start_3
    iget-object v4, v1, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    iget-object v5, v1, Ll/۟ۧۧ;->᩷:Ll/᩻ۢۧ;

    check-cast v4, Ll/ܺ֫ۧ;

    invoke-virtual {v4, v5}, Ll/ܺ֫ۧ;->֫(Ll/᩻ۢۧ;)I

    move-result v2

    .line 1147
    iget-object v4, v1, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    check-cast v4, Ll/ܺ֫ۧ;

    invoke-virtual {v4}, Ll/ܺ֫ۧ;->ۧ()J

    move-result-wide v4

    .line 1148
    iget-object v6, v1, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    invoke-static {v6}, Ll/ᩳܽۧ;->ᩳ(Ll/ᩳܽۧ;)J

    move-result-wide v6

    add-long/2addr v6, v13

    cmp-long v8, v4, v6

    if-lez v8, :cond_7

    .line 1150
    iget-object v6, v1, Ll/۟ۧۧ;->ܳ:Ll/ܳۚ֫;

    invoke-virtual {v6}, Ll/ܳۚ֫;->ܽ()V

    .line 1151
    iget-object v6, v1, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    invoke-static {v6}, Ll/ᩳܽۧ;->ܳ(Ll/ᩳܽۧ;)Landroid/os/Handler;

    move-result-object v6

    iget-object v7, v1, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    invoke-static {v7}, Ll/ᩳܽۧ;->ۜ(Ll/ᩳܽۧ;)Ll/ۛۧۧ;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    .line 1144
    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_8
    if-ne v2, v3, :cond_9

    const/4 v2, 0x0

    goto :goto_3

    .line 1157
    :cond_9
    iget-object v3, v1, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    check-cast v3, Ll/ܺ֫ۧ;

    invoke-virtual {v3}, Ll/ܺ֫ۧ;->ۧ()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-eqz v7, :cond_a

    .line 1158
    iget-object v3, v1, Ll/۟ۧۧ;->᩷:Ll/᩻ۢۧ;

    iget-object v4, v1, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    check-cast v4, Ll/ܺ֫ۧ;

    invoke-virtual {v4}, Ll/ܺ֫ۧ;->ۧ()J

    move-result-wide v4

    iput-wide v4, v3, Ll/᩻ۢۧ;->֫:J

    .line 1160
    :cond_a
    :goto_3
    iget-object v3, v1, Ll/۟ۧۧ;->֫:Ll/ᩴܶ֫;

    invoke-static {v3}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    if-eq v2, v3, :cond_b

    .line 1157
    iget-object v2, v1, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    check-cast v2, Ll/ܺ֫ۧ;

    invoke-virtual {v2}, Ll/ܺ֫ۧ;->ۧ()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_b

    .line 1158
    iget-object v2, v1, Ll/۟ۧۧ;->᩷:Ll/᩻ۢۧ;

    iget-object v3, v1, Ll/۟ۧۧ;->ۢ:Ll/۫ۧۧ;

    check-cast v3, Ll/ܺ֫ۧ;

    invoke-virtual {v3}, Ll/ܺ֫ۧ;->ۧ()J

    move-result-wide v3

    iput-wide v3, v2, Ll/᩻ۢۧ;->֫:J

    .line 1160
    :cond_b
    iget-object v2, v1, Ll/۟ۧۧ;->֫:Ll/ᩴܶ֫;

    invoke-static {v2}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 1161
    throw v0

    :cond_c
    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 9

    .line 1172
    iget-boolean v0, p0, Ll/۟ۧۧ;->ܺ:Z

    if-nez v0, :cond_0

    .line 1173
    iget-wide v0, p0, Ll/۟ۧۧ;->ۡ:J

    goto :goto_0

    .line 1174
    :cond_0
    iget-object v0, p0, Ll/۟ۧۧ;->ۖ:Ll/ᩳܽۧ;

    invoke-static {v0}, Ll/ᩳܽۧ;->᩷(Ll/ᩳܽۧ;)J

    move-result-wide v0

    iget-wide v2, p0, Ll/۟ۧۧ;->ۡ:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    move-wide v3, v0

    .line 1175
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v6

    .line 1176
    iget-object v2, p0, Ll/۟ۧۧ;->ᩳ:Ll/᩵ۢۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1177
    invoke-interface {v2, v6, p1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x1

    .line 1178
    invoke-interface/range {v2 .. v8}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    const/4 p1, 0x1

    .line 1180
    iput-boolean p1, p0, Ll/۟ۧۧ;->ܺ:Z

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 1099
    iput-boolean v0, p0, Ll/۟ۧۧ;->ܿ:Z

    return-void
.end method
