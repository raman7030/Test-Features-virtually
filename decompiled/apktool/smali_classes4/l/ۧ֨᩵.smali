.class public final Ll/ۧ֨᩵;
.super Ljava/lang/Object;
.source "N9T0"

# interfaces
.implements Ll/۫ۡ᩵;


# static fields
.field public static final ܰ:Ll/֫᩻֨;


# instance fields
.field public ۗ:Z

.field public ۙ:Ll/۫ۚ᩵;

.field public ۛ:[B

.field public ۤ:I

.field public ۨ:I

.field public ۫:I

.field public ۬:I

.field public ᩶:J

.field public ᩸:I

.field public ᩹:Ll/۬ۚ᩵;

.field public ᩺:Ll/ۛۘ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 55
    const-class v0, Ll/ۧ֨᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۧ֨᩵;->ܰ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/۬ۚ᩵;)V
    .locals 3

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 60
    iput v0, p0, Ll/ۧ֨᩵;->᩸:I

    iput v0, p0, Ll/ۧ֨᩵;->۫:I

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 61
    iput-object v0, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v0, 0x0

    .line 62
    iput-object v0, p0, Ll/ۧ֨᩵;->᩺:Ll/ۛۘ᩵;

    .line 108
    iput-object p1, p0, Ll/ۧ֨᩵;->᩹:Ll/۬ۚ᩵;

    .line 112
    :try_start_0
    invoke-virtual {p1}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object p1
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x11

    .line 114
    :try_start_1
    iput v0, p0, Ll/ۧ֨᩵;->۬:I

    const/4 v0, 0x1

    .line 115
    iput v0, p0, Ll/ۧ֨᩵;->᩸:I

    .line 125
    invoke-virtual {p0}, Ll/ۧ֨᩵;->֫()Ll/۫ۚ᩵;

    move-result-object v1

    .line 227
    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۘ()V

    .line 127
    invoke-virtual {p1}, Ll/ۘ֨᩵;->ۖ()I

    move-result v1

    add-int/lit8 v1, v1, -0x46

    iput v1, p0, Ll/ۧ֨᩵;->ۤ:I

    .line 128
    invoke-virtual {p1}, Ll/ۘ֨᩵;->getSendBufferSize()I

    move-result v1

    add-int/lit8 v1, v1, -0x46

    iput v1, p0, Ll/ۧ֨᩵;->ۨ:I

    const/16 v1, 0x4000

    .line 130
    invoke-virtual {p1, v1}, Ll/ۘ֨᩵;->֫(I)Z

    move-result v1

    const v2, 0xffb9

    if-eqz v1, :cond_1

    .line 131
    iput-boolean v0, p0, Ll/ۧ֨᩵;->ۗ:Z

    .line 132
    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ۛ()I

    move-result v0

    add-int/lit8 v0, v0, -0x46

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0xffb9

    goto :goto_0

    :cond_0
    const v1, 0xffffb9

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/ۧ֨᩵;->ۤ:I

    :cond_1
    const v0, 0x8000

    .line 136
    invoke-virtual {p1, v0}, Ll/ۘ֨᩵;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܽ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 137
    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ܰ()I

    move-result v0

    add-int/lit8 v0, v0, -0x46

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/ۧ֨᩵;->ۨ:I

    :cond_2
    const-wide/16 v0, 0x0

    .line 140
    iput-wide v0, p0, Ll/ۧ֨᩵;->᩶:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    :try_start_2
    invoke-virtual {p1}, Ll/ۘ֨᩵;->close()V
    :try_end_2
    .catch Ll/᩵ۡ᩵; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception v0

    if-eqz p1, :cond_3

    .line 112
    :try_start_3
    invoke-virtual {p1}, Ll/ۘ֨᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v0
    :try_end_4
    .catch Ll/᩵ۡ᩵; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 142
    invoke-static {p1}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 176
    :try_start_0
    iget-object v1, p0, Ll/ۧ֨᩵;->ۙ:Ll/۫ۚ᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    .line 227
    :try_start_1
    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_1
    .catch Ll/᩵ۡ᩵; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v1, 0x0

    .line 182
    :try_start_2
    iput-object v1, p0, Ll/ۧ֨᩵;->ۙ:Ll/۫ۚ᩵;

    goto :goto_0

    :catch_0
    move-exception v1

    .line 180
    invoke-static {v1}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object v1

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 185
    :cond_0
    :goto_0
    :try_start_3
    iget-object v1, p0, Ll/ۧ֨᩵;->᩹:Ll/۬ۚ᩵;

    invoke-virtual {v1}, Ll/۬ۚ᩵;->ܽ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 190
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v1

    .line 185
    :try_start_4
    iget-object v2, p0, Ll/ۧ֨᩵;->᩹:Ll/۬ۚ᩵;

    invoke-virtual {v2}, Ll/۬ۚ᩵;->ܽ()V

    .line 189
    throw v1

    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method public final read([BII)I
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const/4 v3, 0x0

    if-gtz p3, :cond_0

    return v3

    .line 213
    :cond_0
    iget-wide v4, v1, Ll/ۧ֨᩵;->᩶:J

    .line 215
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ll/ۧ֨᩵;->֫()Ll/۫ۚ᩵;

    move-result-object v6
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_2

    .line 216
    :try_start_1
    invoke-virtual {v6}, Ll/۫ۚ᩵;->᩻()Ll/ۘ֨᩵;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 219
    :try_start_2
    new-instance v8, Ll/֡ۘ᩵;

    invoke-virtual {v7}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v0

    move/from16 v9, p2

    invoke-direct {v8, v9, v0, v2}, Ll/֡ۘ᩵;-><init>(ILl/֨ۡ᩵;[B)V

    move/from16 v10, p3

    .line 221
    :goto_0
    iget v0, v1, Ll/ۧ֨᩵;->ۤ:I

    if-le v10, v0, :cond_1

    move v14, v0

    goto :goto_1

    :cond_1
    move v14, v10

    .line 223
    :goto_1
    invoke-virtual {v7}, Ll/ۘ֨᩵;->᩸()Z

    move-result v0

    const/4 v11, 0x1

    if-eqz v0, :cond_3

    .line 224
    new-instance v0, Ll/᩷᩵᩵;

    invoke-virtual {v7}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v12

    invoke-virtual {v6}, Ll/۫ۚ᩵;->ܳ()[B

    move-result-object v13

    invoke-direct {v0, v12, v13, v2, v9}, Ll/᩷᩵᩵;-><init>(Ll/֨ۡ᩵;[B[BI)V

    .line 225
    iget-wide v12, v1, Ll/ۧ֨᩵;->᩶:J

    invoke-virtual {v0, v12, v13}, Ll/᩷᩵᩵;->ᩳ(J)V

    .line 226
    invoke-virtual {v0, v14}, Ll/᩷᩵᩵;->ܺ(I)V

    sub-int v12, v10, v9

    .line 227
    invoke-virtual {v0, v12}, Ll/᩷᩵᩵;->ۖ(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-array v11, v11, [Ll/֡ۚ᩵;

    .line 229
    sget-object v12, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v12, v11, v3

    const/4 v12, 0x0

    .line 115
    invoke-virtual {v7, v0, v12, v11}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object v0

    .line 229
    check-cast v0, Ll/ۢ᩵᩵;

    .line 230
    invoke-virtual {v0}, Ll/ۢ᩵᩵;->᩵֫()I

    move-result v0
    :try_end_3
    .catch Ll/ۗۚ᩵; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    move-wide/from16 v17, v4

    move v5, v14

    const/4 v4, 0x0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 232
    :try_start_4
    invoke-virtual {v0}, Ll/ۗۚ᩵;->֫()I

    move-result v11

    const v12, -0x3fffffef    # -2.000004f

    if-ne v11, v12, :cond_2

    .line 233
    sget-object v11, Ll/ۧ֨᩵;->ܰ:Ll/֫᩻֨;

    const-string v12, "Reached end of file"

    invoke-interface {v11, v12, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    const/4 v0, -0x1

    goto :goto_2

    .line 236
    :cond_2
    throw v0

    .line 240
    :cond_3
    new-instance v0, Ll/᩵ۘ᩵;

    const/4 v15, 0x1

    invoke-virtual {v7}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v12

    invoke-virtual {v6}, Ll/۫ۚ᩵;->ᩳ()I

    move-result v13

    move-wide/from16 v17, v4

    iget-wide v3, v1, Ll/ۧ֨᩵;->᩶:J

    move-object v11, v0

    move v5, v14

    const/4 v2, 0x1

    move-wide v14, v3

    move/from16 v16, v5

    invoke-direct/range {v11 .. v16}, Ll/᩵ۘ᩵;-><init>(Ll/֨ۡ᩵;IJI)V

    .line 241
    iget-boolean v3, v1, Ll/ۧ֨᩵;->ۗ:Z

    if-eqz v3, :cond_4

    const v3, 0xffff

    and-int v4, v5, v3

    .line 242
    invoke-virtual {v0, v4}, Ll/᩵ۘ᩵;->ۢ(I)V

    shr-int/lit8 v4, v5, 0x10

    and-int/2addr v3, v4

    .line 243
    invoke-virtual {v0, v3}, Ll/᩵ۘ᩵;->ۡ(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_4
    :try_start_5
    new-array v2, v2, [Ll/֡ۚ᩵;

    .line 247
    sget-object v3, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v7, v0, v8, v2}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 248
    invoke-virtual {v8}, Ll/֡ۘ᩵;->ۖ֫()I

    move-result v0
    :try_end_5
    .catch Ll/᩵ۡ᩵; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_3
    if-gtz v0, :cond_6

    .line 254
    :try_start_6
    iget-wide v2, v1, Ll/ۧ֨᩵;->᩶:J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    sub-long v2, v2, v17

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_5

    goto :goto_4

    :cond_5
    const-wide/16 v2, -0x1

    :goto_4
    long-to-int v0, v2

    .line 264
    :try_start_7
    invoke-virtual {v7}, Ll/ۘ֨᩵;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 227
    :try_start_8
    invoke-virtual {v6}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_8
    .catch Ll/᩵ۡ᩵; {:try_start_8 .. :try_end_8} :catch_2

    return v0

    .line 256
    :cond_6
    :try_start_9
    iget-wide v2, v1, Ll/ۧ֨᩵;->᩶:J

    int-to-long v11, v0

    add-long/2addr v2, v11

    iput-wide v2, v1, Ll/ۧ֨᩵;->᩶:J

    sub-int/2addr v10, v0

    add-int/2addr v9, v0

    .line 259
    invoke-virtual {v8, v0}, Ll/֡ۘ᩵;->ۢ(I)V

    if-lez v10, :cond_8

    if-eq v0, v5, :cond_7

    goto :goto_5

    :cond_7
    move-object/from16 v2, p1

    move-wide/from16 v4, v17

    const/4 v3, 0x0

    goto/16 :goto_0

    .line 263
    :cond_8
    :goto_5
    iget-wide v2, v1, Ll/ۧ֨᩵;->᩶:J
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    sub-long v2, v2, v17

    long-to-int v0, v2

    .line 264
    :try_start_a
    invoke-virtual {v7}, Ll/ۘ֨᩵;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 227
    :try_start_b
    invoke-virtual {v6}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_b
    .catch Ll/᩵ۡ᩵; {:try_start_b .. :try_end_b} :catch_2

    return v0

    :catch_1
    move-exception v0

    .line 250
    :try_start_c
    invoke-static {v0}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object v0

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 215
    :try_start_d
    invoke-virtual {v7}, Ll/ۘ֨᩵;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_e
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 227
    :try_start_f
    invoke-virtual {v6}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    move-object v3, v0

    .line 215
    :try_start_10
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v2
    :try_end_10
    .catch Ll/᩵ۡ᩵; {:try_start_10 .. :try_end_10} :catch_2

    :catch_2
    move-exception v0

    .line 265
    invoke-static {v0}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object v0

    throw v0
.end method

.method public final readBoolean()Z
    .locals 4

    .line 398
    iget-object v0, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Ll/ۧ֨᩵;->read([BII)I

    move-result v3

    if-ltz v3, :cond_1

    .line 401
    aget-byte v0, v0, v1

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1

    .line 399
    :cond_1
    new-instance v0, Ll/᩶ۚ᩵;

    invoke-direct {v0}, Ll/᩶ۚ᩵;-><init>()V

    throw v0
.end method

.method public final readByte()B
    .locals 3

    const/4 v0, 0x1

    .line 407
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۧ֨᩵;->read([BII)I

    move-result v0

    if-ltz v0, :cond_0

    .line 410
    aget-byte v0, v1, v2

    return v0

    .line 408
    :cond_0
    new-instance v0, Ll/᩶ۚ᩵;

    invoke-direct {v0}, Ll/᩶ۚ᩵;-><init>()V

    throw v0
.end method

.method public final readChar()C
    .locals 3

    const/4 v0, 0x2

    .line 443
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۧ֨᩵;->read([BII)I

    move-result v0

    if-ltz v0, :cond_0

    .line 446
    invoke-static {v2, v1}, Ll/ۗ֨᩵;->֫(I[B)S

    move-result v0

    int-to-char v0, v0

    return v0

    .line 444
    :cond_0
    new-instance v0, Ll/᩶ۚ᩵;

    invoke-direct {v0}, Ll/᩶ۚ᩵;-><init>()V

    throw v0
.end method

.method public final readDouble()D
    .locals 6

    const/16 v0, 0x8

    .line 479
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۧ֨᩵;->read([BII)I

    move-result v0

    if-ltz v0, :cond_0

    .line 134
    invoke-static {v2, v1}, Ll/ۗ֨᩵;->ܽ(I[B)I

    move-result v0

    int-to-long v2, v0

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    const/4 v0, 0x4

    .line 136
    invoke-static {v0, v1}, Ll/ۗ֨᩵;->ܽ(I[B)I

    move-result v0

    int-to-long v0, v0

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    .line 198
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0

    .line 480
    :cond_0
    new-instance v0, Ll/᩶ۚ᩵;

    invoke-direct {v0}, Ll/᩶ۚ᩵;-><init>()V

    throw v0
.end method

.method public final readFloat()F
    .locals 3

    const/4 v0, 0x4

    .line 470
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۧ֨᩵;->read([BII)I

    move-result v0

    if-ltz v0, :cond_0

    .line 174
    invoke-static {v2, v1}, Ll/ۗ֨᩵;->ܽ(I[B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0

    .line 471
    :cond_0
    new-instance v0, Ll/᩶ۚ᩵;

    invoke-direct {v0}, Ll/᩶ۚ᩵;-><init>()V

    throw v0
.end method

.method public final readFully([B)V
    .locals 2

    const/4 v0, 0x0

    .line 272
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۧ֨᩵;->readFully([BII)V

    return-void
.end method

.method public final readFully([BII)V
    .locals 3

    const/4 v0, 0x0

    :cond_0
    add-int v1, p2, v0

    sub-int v2, p3, v0

    .line 281
    invoke-virtual {p0, p1, v1, v2}, Ll/ۧ֨᩵;->read([BII)I

    move-result v1

    if-ltz v1, :cond_1

    add-int/2addr v0, v1

    if-lt v0, p3, :cond_0

    return-void

    .line 283
    :cond_1
    new-instance p1, Ll/᩶ۚ᩵;

    invoke-direct {p1}, Ll/᩶ۚ᩵;-><init>()V

    throw p1
.end method

.method public final readInt()I
    .locals 3

    const/4 v0, 0x4

    .line 452
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۧ֨᩵;->read([BII)I

    move-result v0

    if-ltz v0, :cond_0

    .line 455
    invoke-static {v2, v1}, Ll/ۗ֨᩵;->ܽ(I[B)I

    move-result v0

    return v0

    .line 453
    :cond_0
    new-instance v0, Ll/᩶ۚ᩵;

    invoke-direct {v0}, Ll/᩶ۚ᩵;-><init>()V

    throw v0
.end method

.method public final readLine()Ljava/lang/String;
    .locals 10

    .line 488
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    :goto_0
    if-nez v3, :cond_4

    .line 195
    iget-object v4, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v5, 0x1

    invoke-virtual {p0, v4, v2, v5}, Ll/ۧ֨᩵;->read([BII)I

    move-result v6

    if-ne v6, v1, :cond_0

    const/4 v6, -0x1

    goto :goto_1

    .line 198
    :cond_0
    aget-byte v6, v4, v2

    and-int/lit16 v6, v6, 0xff

    :goto_1
    if-eq v6, v1, :cond_3

    const/16 v7, 0xa

    if-eq v6, v7, :cond_3

    const/16 v8, 0xd

    if-eq v6, v8, :cond_1

    int-to-char v4, v6

    .line 506
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_3

    .line 500
    :cond_1
    iget-wide v8, p0, Ll/ۧ֨᩵;->᩶:J

    .line 195
    invoke-virtual {p0, v4, v2, v5}, Ll/ۧ֨᩵;->read([BII)I

    move-result v3

    if-ne v3, v1, :cond_2

    const/4 v3, -0x1

    goto :goto_2

    .line 198
    :cond_2
    aget-byte v3, v4, v2

    and-int/lit16 v3, v3, 0xff

    :goto_2
    if-eq v3, v7, :cond_3

    .line 502
    iput-wide v8, p0, Ll/ۧ֨᩵;->᩶:J

    :cond_3
    const/4 v3, 0x1

    :goto_3
    move v4, v6

    goto :goto_0

    :cond_4
    if-ne v4, v1, :cond_5

    .line 511
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    if-nez v1, :cond_5

    const/4 v0, 0x0

    return-object v0

    .line 515
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final readLong()J
    .locals 6

    const/16 v0, 0x8

    .line 461
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۧ֨᩵;->read([BII)I

    move-result v0

    if-ltz v0, :cond_0

    .line 134
    invoke-static {v2, v1}, Ll/ۗ֨᩵;->ܽ(I[B)I

    move-result v0

    int-to-long v2, v0

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    const/4 v0, 0x4

    .line 136
    invoke-static {v0, v1}, Ll/ۗ֨᩵;->ܽ(I[B)I

    move-result v0

    int-to-long v0, v0

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0

    .line 462
    :cond_0
    new-instance v0, Ll/᩶ۚ᩵;

    invoke-direct {v0}, Ll/᩶ۚ᩵;-><init>()V

    throw v0
.end method

.method public final readShort()S
    .locals 3

    const/4 v0, 0x2

    .line 425
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۧ֨᩵;->read([BII)I

    move-result v0

    if-ltz v0, :cond_0

    .line 428
    invoke-static {v2, v1}, Ll/ۗ֨᩵;->֫(I[B)S

    move-result v0

    return v0

    .line 426
    :cond_0
    new-instance v0, Ll/᩶ۚ᩵;

    invoke-direct {v0}, Ll/᩶ۚ᩵;-><init>()V

    throw v0
.end method

.method public final readUTF()Ljava/lang/String;
    .locals 3

    .line 521
    invoke-virtual {p0}, Ll/ۧ֨᩵;->readUnsignedShort()I

    move-result v0

    .line 522
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 523
    invoke-virtual {p0, v1, v2, v0}, Ll/ۧ֨᩵;->read([BII)I

    .line 525
    :try_start_0
    invoke-static {v0, v1}, Ll/ۗ֨᩵;->ܿ(I[B)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 527
    new-instance v1, Ll/ۗۚ᩵;

    const-string v2, ""

    invoke-direct {v1, v2, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public final readUnsignedByte()I
    .locals 3

    const/4 v0, 0x1

    .line 416
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۧ֨᩵;->read([BII)I

    move-result v0

    if-ltz v0, :cond_0

    .line 419
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0

    .line 417
    :cond_0
    new-instance v0, Ll/᩶ۚ᩵;

    invoke-direct {v0}, Ll/᩶ۚ᩵;-><init>()V

    throw v0
.end method

.method public final readUnsignedShort()I
    .locals 3

    const/4 v0, 0x2

    .line 434
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۧ֨᩵;->read([BII)I

    move-result v0

    if-ltz v0, :cond_0

    .line 437
    invoke-static {v2, v1}, Ll/ۗ֨᩵;->֫(I[B)S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    return v0

    .line 435
    :cond_0
    new-instance v0, Ll/᩶ۚ᩵;

    invoke-direct {v0}, Ll/᩶ۚ᩵;-><init>()V

    throw v0
.end method

.method public final seek(J)V
    .locals 0

    .line 359
    iput-wide p1, p0, Ll/ۧ֨᩵;->᩶:J

    return-void
.end method

.method public final skipBytes(I)I
    .locals 4

    if-lez p1, :cond_0

    .line 293
    iget-wide v0, p0, Ll/ۧ֨᩵;->᩶:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۧ֨᩵;->᩶:J

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final write(I)V
    .locals 2

    int-to-byte p1, p1

    .line 302
    iget-object v0, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 303
    invoke-virtual {p0, v0, v1, p1}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 309
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 18

    move-object/from16 v1, p0

    .line 315
    iget-object v0, v1, Ll/ۧ֨᩵;->᩺:Ll/ۛۘ᩵;

    if-gtz p3, :cond_0

    return-void

    .line 320
    :cond_0
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ll/ۧ֨᩵;->֫()Ll/۫ۚ᩵;

    move-result-object v2
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    :try_start_1
    invoke-virtual {v2}, Ll/۫ۚ᩵;->᩻()Ll/ۘ֨᩵;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move/from16 v13, p2

    move/from16 v14, p3

    .line 324
    :cond_1
    :try_start_2
    iget v4, v1, Ll/ۧ֨᩵;->ۨ:I

    if-le v14, v4, :cond_2

    move v12, v4

    goto :goto_0

    :cond_2
    move v12, v14

    .line 327
    :goto_0
    invoke-virtual {v3}, Ll/ۘ֨᩵;->᩸()Z

    move-result v4

    const/4 v15, 0x0

    const/4 v11, 0x1

    if-eqz v4, :cond_3

    .line 328
    new-instance v4, Ll/ۡ᩵᩵;

    invoke-virtual {v3}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v5

    invoke-virtual {v2}, Ll/۫ۚ᩵;->ܳ()[B

    move-result-object v6

    invoke-direct {v4, v5, v6}, Ll/ۡ᩵᩵;-><init>(Ll/֨ۡ᩵;[B)V

    .line 329
    iget-wide v5, v1, Ll/ۧ֨᩵;->᩶:J

    invoke-virtual {v4, v5, v6}, Ll/ۡ᩵᩵;->ᩳ(J)V

    sub-int v5, v14, v12

    sub-int/2addr v5, v13

    .line 330
    invoke-virtual {v4, v5}, Ll/ۡ᩵᩵;->ܺ(I)V

    move-object/from16 v10, p1

    .line 331
    invoke-virtual {v4, v13, v12, v10}, Ll/ۡ᩵᩵;->ۧ(II[B)V

    new-array v5, v11, [Ll/֡ۚ᩵;

    .line 332
    sget-object v6, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v6, v5, v15

    const/4 v6, 0x0

    .line 115
    invoke-virtual {v3, v4, v6, v5}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object v4

    .line 332
    check-cast v4, Ll/ܺ᩵᩵;

    .line 333
    invoke-virtual {v4}, Ll/ܺ᩵᩵;->᩵֫()I

    move-result v4

    int-to-long v4, v4

    goto :goto_1

    :cond_3
    move-object/from16 v10, p1

    .line 335
    new-instance v9, Ll/ۤۘ᩵;

    invoke-virtual {v3}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v5

    invoke-virtual {v2}, Ll/۫ۚ᩵;->ᩳ()I

    move-result v6

    iget-wide v7, v1, Ll/ۧ֨᩵;->᩶:J

    sub-int v4, v14, v12

    sub-int v16, v4, v13

    move-object v4, v9

    move-object/from16 v17, v9

    move/from16 v9, v16

    move-object/from16 v10, p1

    const/4 v15, 0x1

    move v11, v13

    invoke-direct/range {v4 .. v12}, Ll/ۤۘ᩵;-><init>(Ll/֨ۡ᩵;IJI[BII)V

    new-array v4, v15, [Ll/֡ۚ᩵;

    .line 336
    sget-object v5, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    move-object/from16 v5, v17

    invoke-virtual {v3, v5, v0, v4}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 337
    invoke-virtual {v0}, Ll/ۛۘ᩵;->ܺ֫()J

    move-result-wide v4

    .line 340
    :goto_1
    iget-wide v6, v1, Ll/ۧ֨᩵;->᩶:J

    add-long/2addr v6, v4

    iput-wide v6, v1, Ll/ۧ֨᩵;->᩶:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    int-to-long v6, v14

    sub-long/2addr v6, v4

    long-to-int v14, v6

    int-to-long v6, v13

    add-long/2addr v6, v4

    long-to-int v13, v6

    if-gtz v14, :cond_1

    .line 345
    :try_start_3
    invoke-virtual {v3}, Ll/ۘ֨᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 227
    :try_start_4
    invoke-virtual {v2}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_4
    .catch Ll/᩵ۡ᩵; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catchall_0
    move-exception v0

    move-object v4, v0

    .line 320
    :try_start_5
    invoke-virtual {v3}, Ll/ۘ֨᩵;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_6
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    move-object v3, v0

    .line 227
    :try_start_7
    invoke-virtual {v2}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v2, v0

    .line 320
    :try_start_8
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v3
    :try_end_8
    .catch Ll/᩵ۡ᩵; {:try_start_8 .. :try_end_8} :catch_0

    :catch_0
    move-exception v0

    .line 346
    invoke-static {v0}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object v0

    throw v0
.end method

.method public final writeBoolean(Z)V
    .locals 2

    int-to-byte p1, p1

    .line 534
    iget-object v0, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 535
    invoke-virtual {p0, v0, v1, p1}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final writeByte(I)V
    .locals 2

    int-to-byte p1, p1

    .line 541
    iget-object v0, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 542
    invoke-virtual {p0, v0, v1, p1}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final writeBytes(Ljava/lang/String;)V
    .locals 2

    .line 590
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    const/4 v0, 0x0

    .line 591
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final writeChar(I)V
    .locals 3

    int-to-short p1, p1

    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 59
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v0, 0x1

    .line 60
    aput-byte p1, v1, v0

    const/4 p1, 0x2

    .line 556
    invoke-virtual {p0, v1, v2, p1}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final writeChars(Ljava/lang/String;)V
    .locals 9

    .line 597
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v1, v0, 0x2

    .line 599
    new-array v2, v1, [B

    .line 600
    new-array v3, v0, [C

    const/4 v4, 0x0

    .line 601
    invoke-virtual {p1, v4, v0, v3, v4}, Ljava/lang/String;->getChars(II[CI)V

    const/4 p1, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge p1, v0, :cond_0

    add-int/lit8 v6, v5, 0x1

    .line 603
    aget-char v7, v3, p1

    ushr-int/lit8 v8, v7, 0x8

    int-to-byte v8, v8

    aput-byte v8, v2, v5

    add-int/lit8 v5, v5, 0x2

    int-to-byte v7, v7

    .line 604
    aput-byte v7, v2, v6

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 606
    :cond_0
    invoke-virtual {p0, v2, v4, v1}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final writeDouble(D)V
    .locals 5

    .line 188
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    const-wide v0, 0xffffffffL

    and-long v2, p1, v0

    long-to-int v3, v2

    const/4 v2, 0x4

    .line 119
    iget-object v4, p0, Ll/ۧ֨᩵;->ۛ:[B

    invoke-static {v3, v2, v4}, Ll/ۗ֨᩵;->֫(II[B)V

    const/16 v2, 0x20

    shr-long/2addr p1, v2

    and-long/2addr p1, v0

    long-to-int p2, p1

    const/4 p1, 0x0

    .line 120
    invoke-static {p2, p1, v4}, Ll/ۗ֨᩵;->֫(II[B)V

    const/16 p2, 0x8

    .line 584
    invoke-virtual {p0, v4, p1, p2}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final writeFloat(F)V
    .locals 2

    .line 160
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    const/4 v0, 0x0

    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    invoke-static {p1, v0, v1}, Ll/ۗ֨᩵;->֫(II[B)V

    const/4 p1, 0x4

    .line 577
    invoke-virtual {p0, v1, v0, p1}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final writeInt(I)V
    .locals 2

    const/4 v0, 0x0

    .line 562
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    invoke-static {p1, v0, v1}, Ll/ۗ֨᩵;->֫(II[B)V

    const/4 p1, 0x4

    .line 563
    invoke-virtual {p0, v1, v0, p1}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final writeLong(J)V
    .locals 5

    const-wide v0, 0xffffffffL

    and-long v2, p1, v0

    long-to-int v3, v2

    const/4 v2, 0x4

    .line 119
    iget-object v4, p0, Ll/ۧ֨᩵;->ۛ:[B

    invoke-static {v3, v2, v4}, Ll/ۗ֨᩵;->֫(II[B)V

    const/16 v2, 0x20

    shr-long/2addr p1, v2

    and-long/2addr p1, v0

    long-to-int p2, p1

    const/4 p1, 0x0

    .line 120
    invoke-static {p2, p1, v4}, Ll/ۗ֨᩵;->֫(II[B)V

    const/16 p2, 0x8

    .line 570
    invoke-virtual {p0, v4, p1, p2}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final writeShort(I)V
    .locals 3

    int-to-short p1, p1

    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 59
    iget-object v1, p0, Ll/ۧ֨᩵;->ۛ:[B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v0, 0x1

    .line 60
    aput-byte p1, v1, v0

    const/4 p1, 0x2

    .line 549
    invoke-virtual {p0, v1, v2, p1}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final writeUTF(Ljava/lang/String;)V
    .locals 14

    .line 612
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    const/4 v5, 0x3

    const/16 v6, 0x7ff

    const/16 v7, 0x7f

    const/4 v8, 0x1

    if-ge v2, v0, :cond_2

    .line 617
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-le v5, v7, :cond_0

    if-le v5, v6, :cond_1

    const/4 v4, 0x3

    goto :goto_1

    :cond_0
    const/4 v4, 0x1

    :cond_1
    :goto_1
    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 620
    :cond_2
    new-array v0, v3, [B

    .line 621
    invoke-virtual {p0, v3}, Ll/ۧ֨᩵;->writeShort(I)V

    .line 268
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_2
    if-ge v9, v3, :cond_7

    if-ge v10, v2, :cond_7

    .line 271
    invoke-virtual {p1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v8, :cond_3

    if-gt v11, v7, :cond_3

    add-int/lit8 v5, v9, 0x1

    int-to-byte v11, v11

    .line 273
    aput-byte v11, v0, v9

    move v9, v5

    goto :goto_3

    :cond_3
    if-le v11, v6, :cond_5

    sub-int v12, v3, v9

    if-ge v12, v5, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v5, v9, 0x1

    shr-int/lit8 v12, v11, 0xc

    and-int/lit8 v12, v12, 0xf

    or-int/lit16 v12, v12, 0xe0

    int-to-byte v12, v12

    .line 278
    aput-byte v12, v0, v9

    add-int/lit8 v12, v9, 0x2

    shr-int/lit8 v13, v11, 0x6

    and-int/lit8 v13, v13, 0x3f

    or-int/lit16 v13, v13, 0x80

    int-to-byte v13, v13

    .line 279
    aput-byte v13, v0, v5

    add-int/lit8 v9, v9, 0x3

    and-int/lit8 v5, v11, 0x3f

    or-int/lit16 v5, v5, 0x80

    int-to-byte v5, v5

    .line 280
    aput-byte v5, v0, v12

    goto :goto_3

    :cond_5
    sub-int v5, v3, v9

    if-ge v5, v4, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v5, v9, 0x1

    shr-int/lit8 v12, v11, 0x6

    and-int/lit8 v12, v12, 0x1f

    or-int/lit16 v12, v12, 0xc0

    int-to-byte v12, v12

    .line 285
    aput-byte v12, v0, v9

    add-int/lit8 v9, v9, 0x2

    and-int/lit8 v11, v11, 0x3f

    or-int/lit16 v11, v11, 0x80

    int-to-byte v11, v11

    .line 286
    aput-byte v11, v0, v5

    :goto_3
    add-int/lit8 v10, v10, 0x1

    const/4 v5, 0x3

    goto :goto_2

    .line 623
    :cond_7
    :goto_4
    invoke-virtual {p0, v0, v1, v3}, Ll/ۧ֨᩵;->write([BII)V

    return-void
.end method

.method public final declared-synchronized ֫()Ll/۫ۚ᩵;
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 153
    :try_start_0
    iget-object v1, p0, Ll/ۧ֨᩵;->ۙ:Ll/۫ۚ᩵;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۜ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 158
    :cond_0
    iget-object v1, p0, Ll/ۧ֨᩵;->ۙ:Ll/۫ۚ᩵;

    invoke-virtual {v1}, Ll/۫ۚ᩵;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 155
    :cond_1
    :goto_0
    :try_start_1
    iget-object v2, p0, Ll/ۧ֨᩵;->᩹:Ll/۬ۚ᩵;

    iget v3, p0, Ll/ۧ֨᩵;->۬:I

    iget v4, p0, Ll/ۧ֨᩵;->᩸:I

    iget v7, p0, Ll/ۧ֨᩵;->۫:I

    const/4 v5, 0x7

    const/16 v6, 0x80

    invoke-virtual/range {v2 .. v7}, Ll/۬ۚ᩵;->֫(IIIII)Ll/۫ۚ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۚ᩵;->֫()V

    iput-object v1, p0, Ll/ۧ֨᩵;->ۙ:Ll/۫ۚ᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 156
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
