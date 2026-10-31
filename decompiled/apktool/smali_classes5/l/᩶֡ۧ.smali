.class public final Ll/᩶֡ۧ;
.super Ljava/lang/Object;
.source "C8LE"

# interfaces
.implements Ll/ܺ֡ۧ;


# instance fields
.field public ֡:I

.field public ֨:I

.field public ֫:I

.field public final ۖ:I

.field public final ۘ:Ll/ܽ֨֫;

.field public ۚ:I

.field public final ۜ:Ljava/lang/String;

.field public ۠:I

.field public ۡ:Z

.field public ۢ:J

.field public ۧ:I

.field public ܳ:Ljava/lang/String;

.field public ܶ:Z

.field public ܺ:Ll/᩵ۢۧ;

.field public ܽ:I

.field public ܿ:Ll/۠ᩴ֫;

.field public ᩳ:Ljava/lang/String;

.field public final ᩴ:Ll/ᩳ֨֫;

.field public ᩵:J

.field public ᩷:I

.field public ᩸:J

.field public ᩻:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Ll/᩶֡ۧ;->ۜ:Ljava/lang/String;

    .line 89
    iput p2, p0, Ll/᩶֡ۧ;->ۖ:I

    .line 91
    new-instance p1, Ll/ᩳ֨֫;

    const/16 p2, 0x400

    invoke-direct {p1, p2}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/᩶֡ۧ;->ᩴ:Ll/ᩳ֨֫;

    .line 92
    new-instance p2, Ll/ܽ֨֫;

    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p1

    .line 48
    array-length v0, p1

    invoke-direct {p2, p1, v0}, Ll/ܽ֨֫;-><init>([BI)V

    .line 92
    iput-object p2, p0, Ll/᩶֡ۧ;->ۘ:Ll/ܽ֨֫;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 93
    iput-wide p1, p0, Ll/᩶֡ۧ;->᩸:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    const/4 v0, 0x0

    .line 98
    iput v0, p0, Ll/᩶֡ۧ;->۠:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 99
    iput-wide v1, p0, Ll/᩶֡ۧ;->᩸:J

    .line 100
    iput-boolean v0, p0, Ll/᩶֡ۧ;->ܶ:Z

    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    .line 112
    iput-wide p2, p0, Ll/᩶֡ۧ;->᩸:J

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 19

    move-object/from16 v0, p0

    .line 117
    iget-object v1, v0, Ll/᩶֡ۧ;->ܺ:Ll/᩵ۢۧ;

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 119
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    if-lez v1, :cond_1e

    .line 120
    iget v1, v0, Ll/᩶֡ۧ;->۠:I

    const/16 v2, 0x56

    const/4 v3, 0x1

    if-eqz v1, :cond_1d

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eq v1, v3, :cond_1b

    const/16 v2, 0x8

    iget-object v6, v0, Ll/᩶֡ۧ;->ᩴ:Ll/ᩳ֨֫;

    const/4 v7, 0x3

    iget-object v8, v0, Ll/᩶֡ۧ;->ۘ:Ll/ܽ֨֫;

    if-eq v1, v4, :cond_19

    if-ne v1, v7, :cond_18

    .line 144
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    iget v9, v0, Ll/᩶֡ۧ;->ۚ:I

    iget v10, v0, Ll/᩶֡ۧ;->ۧ:I

    sub-int/2addr v9, v10

    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 145
    iget-object v9, v8, Ll/ܽ֨֫;->ᩳ:[B

    iget v10, v0, Ll/᩶֡ۧ;->ۧ:I

    move-object/from16 v11, p1

    invoke-virtual {v11, v10, v1, v9}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 146
    iget v9, v0, Ll/᩶֡ۧ;->ۧ:I

    add-int/2addr v9, v1

    iput v9, v0, Ll/᩶֡ۧ;->ۧ:I

    .line 147
    iget v1, v0, Ll/᩶֡ۧ;->ۚ:I

    if-ne v9, v1, :cond_0

    .line 148
    invoke-virtual {v8, v5}, Ll/ܽ֨֫;->ᩳ(I)V

    .line 171
    invoke-virtual {v8}, Ll/ܽ֨֫;->ܿ()Z

    move-result v1

    const/4 v5, 0x0

    if-nez v1, :cond_f

    .line 173
    iput-boolean v3, v0, Ll/᩶֡ۧ;->ܶ:Z

    .line 197
    invoke-virtual {v8, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    if-ne v1, v3, :cond_1

    .line 198
    invoke-virtual {v8, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    iput v9, v0, Ll/᩶֡ۧ;->֫:I

    if-nez v9, :cond_e

    if-ne v1, v3, :cond_2

    .line 337
    invoke-virtual {v8, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    add-int/2addr v9, v3

    mul-int/lit8 v9, v9, 0x8

    .line 338
    invoke-virtual {v8, v9}, Ll/ܽ֨֫;->ۧ(I)I

    .line 203
    :cond_2
    invoke-virtual {v8}, Ll/ܽ֨֫;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_d

    const/4 v9, 0x6

    .line 206
    invoke-virtual {v8, v9}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    iput v10, v0, Ll/᩶֡ۧ;->᩷:I

    const/4 v10, 0x4

    .line 207
    invoke-virtual {v8, v10}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    .line 208
    invoke-virtual {v8, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v13

    if-nez v12, :cond_c

    if-nez v13, :cond_c

    if-nez v1, :cond_3

    .line 213
    invoke-virtual {v8}, Ll/ܽ֨֫;->ᩳ()I

    move-result v12

    .line 288
    invoke-virtual {v8}, Ll/ܽ֨֫;->֫()I

    move-result v13

    .line 289
    invoke-static {v8, v3}, Ll/۫ۜۧ;->֫(Ll/ܽ֨֫;Z)Ll/۬ۜۧ;

    move-result-object v14

    .line 290
    iget-object v15, v14, Ll/۬ۜۧ;->ۧ:Ljava/lang/String;

    iput-object v15, v0, Ll/᩶֡ۧ;->ᩳ:Ljava/lang/String;

    .line 291
    iget v15, v14, Ll/۬ۜۧ;->ܽ:I

    iput v15, v0, Ll/᩶֡ۧ;->֡:I

    .line 292
    iget v14, v14, Ll/۬ۜۧ;->֫:I

    iput v14, v0, Ll/᩶֡ۧ;->ܽ:I

    .line 293
    invoke-virtual {v8}, Ll/ܽ֨֫;->֫()I

    move-result v14

    sub-int/2addr v13, v14

    .line 215
    invoke-virtual {v8, v12}, Ll/ܽ֨֫;->ᩳ(I)V

    add-int/lit8 v12, v13, 0x7

    .line 216
    div-int/2addr v12, v2

    new-array v12, v12, [B

    .line 217
    invoke-virtual {v8, v13, v12}, Ll/ܽ֨֫;->֫(I[B)V

    .line 218
    new-instance v13, Ll/֨ᩴ֫;

    invoke-direct {v13}, Ll/֨ᩴ֫;-><init>()V

    iget-object v14, v0, Ll/᩶֡ۧ;->ܳ:Ljava/lang/String;

    .line 220
    invoke-virtual {v13, v14}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string v14, "video/mp2t"

    .line 221
    invoke-virtual {v13, v14}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v14, "audio/mp4a-latm"

    .line 222
    invoke-virtual {v13, v14}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget-object v14, v0, Ll/᩶֡ۧ;->ᩳ:Ljava/lang/String;

    .line 223
    invoke-virtual {v13, v14}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    iget v14, v0, Ll/᩶֡ۧ;->ܽ:I

    .line 224
    invoke-virtual {v13, v14}, Ll/֨ᩴ֫;->ᩳ(I)V

    iget v14, v0, Ll/᩶֡ۧ;->֡:I

    .line 225
    invoke-virtual {v13, v14}, Ll/֨ᩴ֫;->۠(I)V

    .line 226
    invoke-static {v12}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-virtual {v13, v12}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    iget-object v12, v0, Ll/᩶֡ۧ;->ۜ:Ljava/lang/String;

    .line 227
    invoke-virtual {v13, v12}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    iget v12, v0, Ll/᩶֡ۧ;->ۖ:I

    .line 228
    invoke-virtual {v13, v12}, Ll/֨ᩴ֫;->ۚ(I)V

    .line 229
    invoke-virtual {v13}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v12

    .line 230
    iget-object v13, v0, Ll/᩶֡ۧ;->ܿ:Ll/۠ᩴ֫;

    invoke-virtual {v12, v13}, Ll/۠ᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    .line 231
    iput-object v12, v0, Ll/᩶֡ۧ;->ܿ:Ll/۠ᩴ֫;

    .line 232
    iget v13, v12, Ll/۠ᩴ֫;->ܽ֫:I

    int-to-long v13, v13

    const-wide/32 v15, 0x3d090000

    div-long v13, v15, v13

    iput-wide v13, v0, Ll/᩶֡ۧ;->᩵:J

    .line 233
    iget-object v13, v0, Ll/᩶֡ۧ;->ܺ:Ll/᩵ۢۧ;

    invoke-interface {v13, v12}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    goto :goto_2

    .line 337
    :cond_3
    invoke-virtual {v8, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    add-int/2addr v12, v3

    mul-int/lit8 v12, v12, 0x8

    .line 338
    invoke-virtual {v8, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    int-to-long v12, v12

    long-to-int v13, v12

    .line 288
    invoke-virtual {v8}, Ll/ܽ֨֫;->֫()I

    move-result v12

    .line 289
    invoke-static {v8, v3}, Ll/۫ۜۧ;->֫(Ll/ܽ֨֫;Z)Ll/۬ۜۧ;

    move-result-object v14

    .line 290
    iget-object v15, v14, Ll/۬ۜۧ;->ۧ:Ljava/lang/String;

    iput-object v15, v0, Ll/᩶֡ۧ;->ᩳ:Ljava/lang/String;

    .line 291
    iget v15, v14, Ll/۬ۜۧ;->ܽ:I

    iput v15, v0, Ll/᩶֡ۧ;->֡:I

    .line 292
    iget v14, v14, Ll/۬ۜۧ;->֫:I

    iput v14, v0, Ll/᩶֡ۧ;->ܽ:I

    .line 293
    invoke-virtual {v8}, Ll/ܽ֨֫;->֫()I

    move-result v14

    sub-int/2addr v12, v14

    sub-int/2addr v13, v12

    .line 238
    invoke-virtual {v8, v13}, Ll/ܽ֨֫;->ܿ(I)V

    .line 265
    :cond_4
    :goto_2
    invoke-virtual {v8, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    iput v12, v0, Ll/᩶֡ۧ;->᩻:I

    if-eqz v12, :cond_9

    if-eq v12, v3, :cond_8

    if-eq v12, v7, :cond_7

    if-eq v12, v10, :cond_7

    const/4 v7, 0x5

    if-eq v12, v7, :cond_7

    if-eq v12, v9, :cond_6

    const/4 v7, 0x7

    if-ne v12, v7, :cond_5

    goto :goto_3

    .line 283
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    .line 280
    :cond_6
    :goto_3
    invoke-virtual {v8, v3}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_4

    .line 276
    :cond_7
    invoke-virtual {v8, v9}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_4

    :cond_8
    const/16 v7, 0x9

    .line 271
    invoke-virtual {v8, v7}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_4

    .line 268
    :cond_9
    invoke-virtual {v8, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 241
    :goto_4
    invoke-virtual {v8}, Ll/ܽ֨֫;->ܿ()Z

    move-result v7

    iput-boolean v7, v0, Ll/᩶֡ۧ;->ۡ:Z

    const-wide/16 v9, 0x0

    .line 242
    iput-wide v9, v0, Ll/᩶֡ۧ;->ۢ:J

    if-eqz v7, :cond_b

    if-ne v1, v3, :cond_a

    .line 337
    invoke-virtual {v8, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x8

    .line 338
    invoke-virtual {v8, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    int-to-long v9, v1

    .line 245
    iput-wide v9, v0, Ll/᩶֡ۧ;->ۢ:J

    goto :goto_5

    .line 249
    :cond_a
    invoke-virtual {v8}, Ll/ܽ֨֫;->ܿ()Z

    move-result v1

    .line 250
    iget-wide v9, v0, Ll/᩶֡ۧ;->ۢ:J

    shl-long/2addr v9, v2

    invoke-virtual {v8, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    int-to-long v12, v4

    add-long/2addr v9, v12

    iput-wide v9, v0, Ll/᩶֡ۧ;->ۢ:J

    if-nez v1, :cond_a

    .line 254
    :cond_b
    :goto_5
    invoke-virtual {v8}, Ll/ܽ֨֫;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 256
    invoke-virtual {v8, v2}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_6

    .line 210
    :cond_c
    invoke-static {v5, v5}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 204
    :cond_d
    invoke-static {v5, v5}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 260
    :cond_e
    invoke-static {v5, v5}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 175
    :cond_f
    iget-boolean v1, v0, Ll/᩶֡ۧ;->ܶ:Z

    if-nez v1, :cond_10

    goto :goto_9

    .line 179
    :cond_10
    :goto_6
    iget v1, v0, Ll/᩶֡ۧ;->֫:I

    if-nez v1, :cond_17

    .line 180
    iget v1, v0, Ll/᩶֡ۧ;->᩷:I

    if-nez v1, :cond_16

    .line 299
    iget v1, v0, Ll/᩶֡ۧ;->᩻:I

    if-nez v1, :cond_15

    const/4 v1, 0x0

    .line 302
    :cond_11
    invoke-virtual {v8, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    add-int/2addr v1, v4

    const/16 v5, 0xff

    if-eq v4, v5, :cond_11

    .line 314
    invoke-virtual {v8}, Ll/ܽ֨֫;->ᩳ()I

    move-result v2

    and-int/lit8 v4, v2, 0x7

    if-nez v4, :cond_12

    shr-int/lit8 v2, v2, 0x3

    .line 317
    invoke-virtual {v6, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_7

    .line 321
    :cond_12
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    mul-int/lit8 v4, v1, 0x8

    invoke-virtual {v8, v4, v2}, Ll/ܽ֨֫;->֫(I[B)V

    const/4 v2, 0x0

    .line 322
    invoke-virtual {v6, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 324
    :goto_7
    iget-object v2, v0, Ll/᩶֡ۧ;->ܺ:Ll/᩵ۢۧ;

    invoke-interface {v2, v1, v6}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 326
    iget-wide v4, v0, Ll/᩶֡ۧ;->᩸:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v4, v6

    if-eqz v2, :cond_13

    goto :goto_8

    :cond_13
    const/4 v3, 0x0

    :goto_8
    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Z)V

    .line 327
    iget-object v12, v0, Ll/᩶֡ۧ;->ܺ:Ll/᩵ۢۧ;

    iget-wide v13, v0, Ll/᩶֡ۧ;->᩸:J

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/4 v15, 0x1

    move/from16 v16, v1

    invoke-interface/range {v12 .. v18}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 328
    iget-wide v1, v0, Ll/᩶֡ۧ;->᩸:J

    iget-wide v3, v0, Ll/᩶֡ۧ;->᩵:J

    add-long/2addr v1, v3

    iput-wide v1, v0, Ll/᩶֡ۧ;->᩸:J

    .line 185
    iget-boolean v1, v0, Ll/᩶֡ۧ;->ۡ:Z

    if-eqz v1, :cond_14

    .line 186
    iget-wide v1, v0, Ll/᩶֡ۧ;->ۢ:J

    long-to-int v2, v1

    invoke-virtual {v8, v2}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_14
    :goto_9
    const/4 v1, 0x0

    .line 150
    iput v1, v0, Ll/᩶֡ۧ;->۠:I

    goto/16 :goto_0

    .line 307
    :cond_15
    invoke-static {v5, v5}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 181
    :cond_16
    invoke-static {v5, v5}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 190
    :cond_17
    invoke-static {v5, v5}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 154
    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_19
    move-object/from16 v11, p1

    .line 136
    iget v1, v0, Ll/᩶֡ۧ;->֨:I

    and-int/lit16 v1, v1, -0xe1

    shl-int/2addr v1, v2

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    or-int/2addr v1, v2

    iput v1, v0, Ll/᩶֡ۧ;->ۚ:I

    .line 137
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    array-length v2, v2

    if-le v1, v2, :cond_1a

    .line 138
    iget v1, v0, Ll/᩶֡ۧ;->ۚ:I

    .line 332
    invoke-virtual {v6, v1}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 333
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    array-length v2, v1

    invoke-virtual {v8, v2, v1}, Ll/ܽ֨֫;->ܽ(I[B)V

    :cond_1a
    const/4 v1, 0x0

    .line 140
    iput v1, v0, Ll/᩶֡ۧ;->ۧ:I

    .line 141
    iput v7, v0, Ll/᩶֡ۧ;->۠:I

    goto/16 :goto_0

    :cond_1b
    move-object/from16 v11, p1

    .line 127
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    and-int/lit16 v3, v1, 0xe0

    const/16 v5, 0xe0

    if-ne v3, v5, :cond_1c

    .line 129
    iput v1, v0, Ll/᩶֡ۧ;->֨:I

    .line 130
    iput v4, v0, Ll/᩶֡ۧ;->۠:I

    goto/16 :goto_0

    :cond_1c
    if-eq v1, v2, :cond_0

    const/4 v1, 0x0

    .line 132
    iput v1, v0, Ll/᩶֡ۧ;->۠:I

    goto/16 :goto_0

    :cond_1d
    move-object/from16 v11, p1

    .line 122
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    if-ne v1, v2, :cond_0

    .line 123
    iput v3, v0, Ll/᩶֡ۧ;->۠:I

    goto/16 :goto_0

    :cond_1e
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 2

    .line 105
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 106
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    iput-object p1, p0, Ll/᩶֡ۧ;->ܺ:Ll/᩵ۢۧ;

    .line 107
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩶֡ۧ;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method
