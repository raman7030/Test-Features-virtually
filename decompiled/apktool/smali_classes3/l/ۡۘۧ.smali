.class public final Ll/ۡۘۧ;
.super Ljava/lang/Object;
.source "E8PN"

# interfaces
.implements Ll/֡ۘۧ;


# instance fields
.field public ֫:J

.field public ۜ:J

.field public ۡ:J

.field public final ۢ:Ll/ܶۘۧ;

.field public ۧ:J

.field public ܳ:J

.field public ܺ:J

.field public final ܽ:Ll/᩵ۘۧ;

.field public final ܿ:J

.field public final ᩳ:J

.field public ᩷:I

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/ܶۘۧ;JJJJZ)V
    .locals 4

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    cmp-long v3, p2, v0

    if-ltz v3, :cond_0

    cmp-long v0, p4, p2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 78
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 80
    iput-object p1, p0, Ll/ۡۘۧ;->ۢ:Ll/ܶۘۧ;

    .line 81
    iput-wide p2, p0, Ll/ۡۘۧ;->ܿ:J

    .line 82
    iput-wide p4, p0, Ll/ۡۘۧ;->ᩳ:J

    sub-long/2addr p4, p2

    cmp-long p1, p6, p4

    if-eqz p1, :cond_2

    if-eqz p10, :cond_1

    goto :goto_1

    .line 88
    :cond_1
    iput v2, p0, Ll/ۡۘۧ;->᩷:I

    goto :goto_2

    .line 85
    :cond_2
    :goto_1
    iput-wide p8, p0, Ll/ۡۘۧ;->ܺ:J

    const/4 p1, 0x4

    .line 86
    iput p1, p0, Ll/ۡۘۧ;->᩷:I

    .line 90
    :goto_2
    new-instance p1, Ll/᩵ۘۧ;

    invoke-direct {p1}, Ll/᩵ۘۧ;-><init>()V

    iput-object p1, p0, Ll/ۡۘۧ;->ܽ:Ll/᩵ۘۧ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡۘۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡۘۧ;->ᩳ:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/ۡۘۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡۘۧ;->ܿ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ۡۘۧ;)Ll/ܶۘۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡۘۧ;->ۢ:Ll/ܶۘۧ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۡۘۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡۘۧ;->ܺ:J

    return-wide v0
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;)J
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 95
    iget v2, v0, Ll/ۡۘۧ;->᩷:I

    iget-wide v3, v0, Ll/ۡۘۧ;->ᩳ:J

    const/4 v5, 0x0

    iget-object v6, v0, Ll/ۡۘۧ;->ܽ:Ll/᩵ۘۧ;

    const/4 v7, 0x1

    const-wide/16 v8, -0x1

    const/4 v10, 0x4

    if-eqz v2, :cond_d

    if-eq v2, v7, :cond_c

    const/4 v3, 0x2

    const/4 v4, 0x3

    if-eq v2, v3, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v10, :cond_0

    return-wide v8

    .line 124
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_1
    const-wide/16 v2, 0x2

    move-wide/from16 v16, v2

    move-wide v2, v8

    goto/16 :goto_4

    .line 156
    :cond_2
    iget-wide v10, v0, Ll/ۡۘۧ;->᩻:J

    const-wide/16 v12, 0x0

    iget-wide v14, v0, Ll/ۡۘۧ;->֫:J

    cmp-long v7, v10, v14

    if-nez v7, :cond_3

    move-wide v12, v8

    goto :goto_0

    .line 160
    :cond_3
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v10

    .line 161
    iget-wide v14, v0, Ll/ۡۘۧ;->֫:J

    invoke-virtual {v6, v1, v14, v15}, Ll/᩵ۘۧ;->֫(Ll/۠᩷ۧ;J)Z

    move-result v7

    if-nez v7, :cond_5

    .line 162
    iget-wide v12, v0, Ll/ۡۘۧ;->᩻:J

    cmp-long v7, v12, v10

    if-eqz v7, :cond_4

    :goto_0
    move-wide v2, v8

    goto/16 :goto_3

    .line 163
    :cond_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "No ogg page can be found."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 168
    :cond_5
    invoke-virtual {v6, v1, v5}, Ll/᩵ۘۧ;->֫(Ll/۠᩷ۧ;Z)Z

    .line 169
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 171
    iget-wide v14, v0, Ll/ۡۘۧ;->ۡ:J

    iget-wide v2, v6, Ll/᩵ۘۧ;->ۧ:J

    sub-long/2addr v14, v2

    .line 172
    iget v7, v6, Ll/᩵ۘۧ;->ܽ:I

    iget v5, v6, Ll/᩵ۘۧ;->֫:I

    add-int/2addr v7, v5

    cmp-long v5, v12, v14

    if-gtz v5, :cond_6

    const-wide/32 v18, 0x11940

    cmp-long v5, v14, v18

    if-gez v5, :cond_6

    move-wide v2, v8

    move-wide v12, v2

    goto :goto_3

    :cond_6
    cmp-long v5, v14, v12

    if-gez v5, :cond_7

    .line 178
    iput-wide v10, v0, Ll/ۡۘۧ;->֫:J

    .line 179
    iput-wide v2, v0, Ll/ۡۘۧ;->ۧ:J

    goto :goto_1

    .line 181
    :cond_7
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    int-to-long v10, v7

    add-long/2addr v2, v10

    iput-wide v2, v0, Ll/ۡۘۧ;->᩻:J

    .line 182
    iget-wide v2, v6, Ll/᩵ۘۧ;->ۧ:J

    iput-wide v2, v0, Ll/ۡۘۧ;->ۜ:J

    .line 185
    :goto_1
    iget-wide v2, v0, Ll/ۡۘۧ;->֫:J

    iget-wide v12, v0, Ll/ۡۘۧ;->᩻:J

    sub-long/2addr v2, v12

    const-wide/32 v10, 0x186a0

    cmp-long v18, v2, v10

    if-gez v18, :cond_8

    .line 186
    iput-wide v12, v0, Ll/ۡۘۧ;->֫:J

    goto :goto_0

    :cond_8
    int-to-long v2, v7

    if-gtz v5, :cond_9

    const-wide/16 v10, 0x2

    goto :goto_2

    :cond_9
    const-wide/16 v10, 0x1

    :goto_2
    mul-long v2, v2, v10

    .line 192
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v10

    sub-long/2addr v10, v2

    iget-wide v2, v0, Ll/ۡۘۧ;->֫:J

    const-wide/16 v12, 0x1

    iget-wide v4, v0, Ll/ۡۘۧ;->᩻:J

    sub-long v18, v2, v4

    mul-long v18, v18, v14

    iget-wide v14, v0, Ll/ۡۘۧ;->ۧ:J

    iget-wide v7, v0, Ll/ۡۘۧ;->ۜ:J

    sub-long/2addr v14, v7

    div-long v18, v18, v14

    add-long v18, v18, v10

    sub-long v22, v2, v12

    move-wide/from16 v20, v4

    .line 195
    invoke-static/range {v18 .. v23}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v12

    const-wide/16 v2, -0x1

    :goto_3
    cmp-long v4, v12, v2

    if-eqz v4, :cond_a

    return-wide v12

    :cond_a
    const/4 v4, 0x3

    .line 116
    iput v4, v0, Ll/ۡۘۧ;->᩷:I

    const-wide/16 v16, 0x2

    .line 84
    :goto_4
    invoke-virtual {v6, v1, v2, v3}, Ll/᩵ۘۧ;->֫(Ll/۠᩷ۧ;J)Z

    const/4 v2, 0x0

    .line 210
    invoke-virtual {v6, v1, v2}, Ll/᩵ۘۧ;->֫(Ll/۠᩷ۧ;Z)Z

    .line 211
    iget-wide v2, v6, Ll/᩵ۘۧ;->ۧ:J

    iget-wide v4, v0, Ll/ۡۘۧ;->ۡ:J

    cmp-long v7, v2, v4

    if-lez v7, :cond_b

    .line 218
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    const/4 v1, 0x4

    .line 120
    iput v1, v0, Ll/ۡۘۧ;->᩷:I

    .line 121
    iget-wide v1, v0, Ll/ۡۘۧ;->ۜ:J

    add-long v1, v1, v16

    neg-long v1, v1

    return-wide v1

    .line 214
    :cond_b
    iget v2, v6, Ll/᩵ۘۧ;->ܽ:I

    iget v3, v6, Ll/᩵ۘۧ;->֫:I

    add-int/2addr v2, v3

    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 215
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    iput-wide v2, v0, Ll/ۡۘۧ;->᩻:J

    .line 216
    iget-wide v2, v6, Ll/᩵ۘۧ;->ۧ:J

    iput-wide v2, v0, Ll/ۡۘۧ;->ۜ:J

    const-wide/16 v2, -0x1

    goto :goto_4

    :cond_c
    const-wide/16 v8, 0x0

    goto :goto_5

    :cond_d
    const-wide/16 v8, 0x0

    .line 99
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v10

    iput-wide v10, v0, Ll/ۡۘۧ;->ܳ:J

    .line 100
    iput v7, v0, Ll/ۡۘۧ;->᩷:I

    const-wide/32 v12, 0xff1b

    sub-long v12, v3, v12

    cmp-long v2, v12, v10

    if-lez v2, :cond_e

    return-wide v12

    :cond_e
    :goto_5
    const/4 v2, 0x0

    .line 67
    iput v2, v6, Ll/᩵ۘۧ;->᩻:I

    .line 68
    iput-wide v8, v6, Ll/᩵ۘۧ;->ۧ:J

    .line 72
    iput v2, v6, Ll/᩵ۘۧ;->ܿ:I

    .line 73
    iput v2, v6, Ll/᩵ۘۧ;->ܽ:I

    .line 74
    iput v2, v6, Ll/᩵ۘۧ;->֫:I

    const-wide/16 v8, -0x1

    .line 84
    invoke-virtual {v6, v1, v8, v9}, Ll/᩵ۘۧ;->֫(Ll/۠᩷ۧ;J)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 235
    invoke-virtual {v6, v1, v2}, Ll/᩵ۘۧ;->֫(Ll/۠᩷ۧ;Z)Z

    .line 236
    iget v2, v6, Ll/᩵ۘۧ;->ܽ:I

    iget v5, v6, Ll/᩵ۘۧ;->֫:I

    add-int/2addr v2, v5

    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 237
    iget-wide v8, v6, Ll/᩵ۘۧ;->ۧ:J

    .line 238
    :goto_6
    iget v2, v6, Ll/᩵ۘۧ;->᩻:I

    const/4 v5, 0x4

    and-int/2addr v2, v5

    if-eq v2, v5, :cond_f

    const-wide/16 v10, -0x1

    .line 84
    invoke-virtual {v6, v1, v10, v11}, Ll/᩵ۘۧ;->֫(Ll/۠᩷ۧ;J)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 240
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v12

    cmp-long v2, v12, v3

    if-gez v2, :cond_f

    .line 241
    invoke-virtual {v6, v1, v7}, Ll/᩵ۘۧ;->֫(Ll/۠᩷ۧ;Z)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 242
    iget v2, v6, Ll/᩵ۘۧ;->ܽ:I

    iget v5, v6, Ll/᩵ۘۧ;->֫:I

    add-int/2addr v2, v5

    .line 91
    :try_start_0
    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 247
    iget-wide v8, v6, Ll/᩵ۘۧ;->ۧ:J

    goto :goto_6

    .line 108
    :catch_0
    :cond_f
    iput-wide v8, v0, Ll/ۡۘۧ;->ܺ:J

    const/4 v1, 0x4

    .line 109
    iput v1, v0, Ll/ۡۘۧ;->᩷:I

    .line 110
    iget-wide v1, v0, Ll/ۡۘۧ;->ܳ:J

    return-wide v1

    .line 233
    :cond_10
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1
.end method

.method public final ֫()Ll/ۢۢۧ;
    .locals 5

    .line 131
    iget-wide v0, p0, Ll/ۡۘۧ;->ܺ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    new-instance v0, Ll/ۢۘۧ;

    invoke-direct {v0, p0}, Ll/ۢۘۧ;-><init>(Ll/ۡۘۧ;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(J)V
    .locals 10

    .line 136
    iget-wide v0, p0, Ll/ۡۘۧ;->ܺ:J

    const-wide/16 v2, 0x1

    sub-long v8, v0, v2

    const-wide/16 v6, 0x0

    move-wide v4, p1

    invoke-static/range {v4 .. v9}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۡۘۧ;->ۡ:J

    const/4 p1, 0x2

    .line 137
    iput p1, p0, Ll/ۡۘۧ;->᩷:I

    .line 138
    iget-wide p1, p0, Ll/ۡۘۧ;->ܿ:J

    iput-wide p1, p0, Ll/ۡۘۧ;->᩻:J

    .line 139
    iget-wide p1, p0, Ll/ۡۘۧ;->ᩳ:J

    iput-wide p1, p0, Ll/ۡۘۧ;->֫:J

    const-wide/16 p1, 0x0

    .line 140
    iput-wide p1, p0, Ll/ۡۘۧ;->ۜ:J

    .line 141
    iget-wide p1, p0, Ll/ۡۘۧ;->ܺ:J

    iput-wide p1, p0, Ll/ۡۘۧ;->ۧ:J

    return-void
.end method
