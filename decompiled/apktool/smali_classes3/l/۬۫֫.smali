.class public final Ll/۬۫֫;
.super Ljava/lang/Object;
.source "W8Q1"


# instance fields
.field public final ֫:Ll/ۗ۫֫;

.field public final ۜ:I

.field public final ۧ:Ll/۫۫֫;

.field public ܳ:J

.field public ܽ:J

.field public ܿ:J

.field public ᩳ:J

.field public ᩷:I

.field public ᩻:J


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;Ll/۫۫֫;)V
    .locals 1

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    new-instance v0, Ll/ۗ۫֫;

    invoke-direct {v0, p1}, Ll/ۗ۫֫;-><init>(Landroid/media/AudioTrack;)V

    iput-object v0, p0, Ll/۬۫֫;->֫:Ll/ۗ۫֫;

    .line 130
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    move-result p1

    iput p1, p0, Ll/۬۫֫;->ۜ:I

    .line 131
    iput-object p2, p0, Ll/۬۫֫;->ۧ:Ll/۫۫֫;

    const/4 p1, 0x0

    .line 229
    invoke-direct {p0, p1}, Ll/۬۫֫;->֫(I)V

    return-void
.end method

.method private ֫(I)V
    .locals 6

    .line 252
    iput p1, p0, Ll/۬۫֫;->᩷:I

    const-wide/16 v0, 0x2710

    if-eqz p1, :cond_3

    const/4 v2, 0x1

    if-eq p1, v2, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const-wide/32 v0, 0x7a120

    .line 270
    iput-wide v0, p0, Ll/۬۫֫;->᩻:J

    return-void

    .line 273
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    const-wide/32 v0, 0x989680

    .line 267
    iput-wide v0, p0, Ll/۬۫֫;->᩻:J

    return-void

    .line 263
    :cond_2
    iput-wide v0, p0, Ll/۬۫֫;->᩻:J

    return-void

    :cond_3
    const-wide/16 v2, 0x0

    .line 256
    iput-wide v2, p0, Ll/۬۫֫;->ܳ:J

    const-wide/16 v2, -0x1

    .line 257
    iput-wide v2, p0, Ll/۬۫֫;->ܽ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 258
    iput-wide v2, p0, Ll/۬۫֫;->ᩳ:J

    .line 259
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    iput-wide v2, p0, Ll/۬۫֫;->ܿ:J

    .line 260
    iput-wide v0, p0, Ll/۬۫֫;->᩻:J

    return-void
.end method


# virtual methods
.method public final ֫(JF)J
    .locals 5

    .line 298
    iget-object v0, p0, Ll/۬۫֫;->֫:Ll/ۗ۫֫;

    invoke-virtual {v0}, Ll/ۗ۫֫;->ۧ()J

    move-result-wide v1

    .line 299
    invoke-virtual {v0}, Ll/ۗ۫֫;->ܽ()J

    move-result-wide v3

    .line 309
    iget v0, p0, Ll/۬۫֫;->ۜ:I

    invoke-static {v0, v1, v2}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v0

    sub-long/2addr p1, v3

    .line 312
    invoke-static {p1, p2, p3}, Ll/ۘ֨֫;->֫(JF)J

    move-result-wide p1

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final ֫()V
    .locals 1

    .line 248
    iget-object v0, p0, Ll/۬۫֫;->֫:Ll/ۗ۫֫;

    invoke-virtual {v0}, Ll/ۗ۫֫;->֫()V

    return-void
.end method

.method public final ֫(FJJ)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-wide/from16 v2, p2

    move-wide/from16 v4, p4

    .line 147
    iget-wide v6, v0, Ll/۬۫֫;->ܳ:J

    sub-long v6, v2, v6

    iget-wide v8, v0, Ll/۬۫֫;->᩻:J

    cmp-long v10, v6, v8

    if-gez v10, :cond_0

    goto/16 :goto_2

    .line 150
    :cond_0
    iput-wide v2, v0, Ll/۬۫֫;->ܳ:J

    .line 151
    iget-object v6, v0, Ll/۬۫֫;->֫:Ll/ۗ۫֫;

    invoke-virtual {v6}, Ll/ۗ۫֫;->ᩳ()Z

    move-result v7

    .line 152
    iget v8, v0, Ll/۬۫֫;->ۜ:I

    if-eqz v7, :cond_3

    .line 318
    invoke-virtual {v6}, Ll/ۗ۫֫;->ܽ()J

    move-result-wide v9

    .line 298
    invoke-virtual {v6}, Ll/ۗ۫֫;->ۧ()J

    move-result-wide v11

    .line 299
    invoke-virtual {v6}, Ll/ۗ۫֫;->ܽ()J

    move-result-wide v13

    .line 309
    invoke-static {v8, v11, v12}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v11

    sub-long v13, v2, v13

    .line 312
    invoke-static {v13, v14, v1}, Ll/ۘ֨֫;->֫(JF)J

    move-result-wide v13

    add-long/2addr v13, v11

    sub-long v11, v9, v2

    .line 320
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    move-result-wide v11

    const-string v15, ", "

    iget-object v1, v0, Ll/۬۫֫;->ۧ:Ll/۫۫֫;

    const-wide/32 v16, 0x4c4b40

    cmp-long v18, v11, v16

    if-lez v18, :cond_1

    .line 322
    invoke-virtual {v6}, Ll/ۗ۫֫;->ۧ()J

    move-result-wide v11

    .line 321
    check-cast v1, Ll/᩵ۤ֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2259
    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Spurious audio timestamp (system clock mismatch): "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll/᩵ۤ֫;->֫:Ll/۠ۤ֫;

    .line 2269
    invoke-static {v1}, Ll/۠ۤ֫;->᩻(Ll/۠ۤ֫;)J

    move-result-wide v4

    invoke-virtual {v13, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2271
    invoke-static {v1}, Ll/۠ۤ֫;->ۜ(Ll/۠ۤ֫;)J

    move-result-wide v4

    invoke-virtual {v13, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2275
    invoke-static {v1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/4 v1, 0x4

    .line 326
    invoke-direct {v0, v1}, Ll/۬۫֫;->֫(I)V

    goto :goto_0

    :cond_1
    sub-long/2addr v13, v4

    .line 327
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    move-result-wide v11

    cmp-long v13, v11, v16

    if-lez v13, :cond_2

    .line 330
    invoke-virtual {v6}, Ll/ۗ۫֫;->ۧ()J

    move-result-wide v11

    .line 329
    check-cast v1, Ll/᩵ۤ֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2234
    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Spurious audio timestamp (frame position mismatch): "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll/᩵ۤ֫;->֫:Ll/۠ۤ֫;

    .line 2244
    invoke-static {v1}, Ll/۠ۤ֫;->᩻(Ll/۠ۤ֫;)J

    move-result-wide v4

    invoke-virtual {v13, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2246
    invoke-static {v1}, Ll/۠ۤ֫;->ۜ(Ll/۠ۤ֫;)J

    move-result-wide v4

    invoke-virtual {v13, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2250
    invoke-static {v1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/4 v1, 0x4

    .line 334
    invoke-direct {v0, v1}, Ll/۬۫֫;->֫(I)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x4

    .line 335
    iget v4, v0, Ll/۬۫֫;->᩷:I

    if-ne v4, v1, :cond_3

    const/4 v1, 0x0

    .line 229
    invoke-direct {v0, v1}, Ll/۬۫֫;->֫(I)V

    .line 156
    :cond_3
    :goto_0
    iget v1, v0, Ll/۬۫֫;->᩷:I

    const/4 v4, 0x1

    const/4 v5, 0x3

    if-eqz v1, :cond_c

    const/4 v9, 0x2

    if-eq v1, v4, :cond_7

    if-eq v1, v9, :cond_6

    if-eq v1, v5, :cond_5

    const/4 v2, 0x4

    if-ne v1, v2, :cond_4

    goto/16 :goto_2

    .line 206
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_5
    if-eqz v7, :cond_e

    const/4 v1, 0x0

    .line 229
    invoke-direct {v0, v1}, Ll/۬۫֫;->֫(I)V

    return-void

    :cond_6
    const/4 v1, 0x0

    if-nez v7, :cond_e

    invoke-direct {v0, v1}, Ll/۬۫֫;->֫(I)V

    return-void

    :cond_7
    if-eqz v7, :cond_b

    .line 279
    invoke-virtual {v6}, Ll/ۗ۫֫;->ۧ()J

    move-result-wide v10

    iget-wide v12, v0, Ll/۬۫֫;->ܽ:J

    cmp-long v1, v10, v12

    if-gtz v1, :cond_8

    goto :goto_1

    .line 283
    :cond_8
    iget-wide v10, v0, Ll/۬۫֫;->ᩳ:J

    .line 309
    invoke-static {v8, v12, v13}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v12

    sub-long v10, v2, v10

    move/from16 v1, p1

    .line 312
    invoke-static {v10, v11, v1}, Ll/ۘ֨֫;->֫(JF)J

    move-result-wide v10

    add-long/2addr v10, v12

    .line 298
    invoke-virtual {v6}, Ll/ۗ۫֫;->ۧ()J

    move-result-wide v12

    .line 299
    invoke-virtual {v6}, Ll/ۗ۫֫;->ܽ()J

    move-result-wide v14

    .line 309
    invoke-static {v8, v12, v13}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v7

    sub-long v12, v2, v14

    .line 312
    invoke-static {v12, v13, v1}, Ll/ۘ֨֫;->֫(JF)J

    move-result-wide v12

    add-long/2addr v12, v7

    sub-long/2addr v12, v10

    .line 292
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    const-wide/16 v10, 0x3e8

    cmp-long v1, v7, v10

    if-gez v1, :cond_9

    .line 176
    invoke-direct {v0, v9}, Ll/۬۫֫;->֫(I)V

    return-void

    .line 177
    :cond_9
    :goto_1
    iget-wide v7, v0, Ll/۬۫֫;->ܿ:J

    sub-long v1, v2, v7

    const-wide/32 v3, 0x1e8480

    cmp-long v7, v1, v3

    if-lez v7, :cond_a

    .line 180
    invoke-direct {v0, v5}, Ll/۬۫֫;->֫(I)V

    return-void

    .line 183
    :cond_a
    invoke-virtual {v6}, Ll/ۗ۫֫;->ۧ()J

    move-result-wide v1

    iput-wide v1, v0, Ll/۬۫֫;->ܽ:J

    .line 184
    invoke-virtual {v6}, Ll/ۗ۫֫;->ܽ()J

    move-result-wide v1

    iput-wide v1, v0, Ll/۬۫֫;->ᩳ:J

    return-void

    :cond_b
    const/4 v1, 0x0

    .line 229
    invoke-direct {v0, v1}, Ll/۬۫֫;->֫(I)V

    return-void

    :cond_c
    if-eqz v7, :cond_d

    .line 159
    invoke-virtual {v6}, Ll/ۗ۫֫;->ܽ()J

    move-result-wide v1

    iget-wide v7, v0, Ll/۬۫֫;->ܿ:J

    cmp-long v3, v1, v7

    if-ltz v3, :cond_e

    .line 161
    invoke-virtual {v6}, Ll/ۗ۫֫;->ۧ()J

    move-result-wide v1

    iput-wide v1, v0, Ll/۬۫֫;->ܽ:J

    .line 162
    invoke-virtual {v6}, Ll/ۗ۫֫;->ܽ()J

    move-result-wide v1

    iput-wide v1, v0, Ll/۬۫֫;->ᩳ:J

    .line 163
    invoke-direct {v0, v4}, Ll/۬۫֫;->֫(I)V

    return-void

    .line 165
    :cond_d
    iget-wide v6, v0, Ll/۬۫֫;->ܿ:J

    sub-long v1, v2, v6

    const-wide/32 v3, 0x7a120

    cmp-long v6, v1, v3

    if-lez v6, :cond_e

    .line 170
    invoke-direct {v0, v5}, Ll/۬۫֫;->֫(I)V

    :cond_e
    :goto_2
    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 215
    iget v0, p0, Ll/۬۫֫;->᩷:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 224
    iget v0, p0, Ll/۬۫֫;->᩷:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 229
    invoke-direct {p0, v0}, Ll/۬۫֫;->֫(I)V

    return-void
.end method
