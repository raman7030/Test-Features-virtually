.class public final Ll/᩺ۘᩳ;
.super Ljava/lang/Object;
.source "36NN"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic ۗ:Ll/ܰۘᩳ;

.field public final ۙ:Ljava/lang/CharSequence;

.field public final ᩶:Ll/ۜ֡ᩳ;

.field public final ᩸:I

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ܰۘᩳ;ILjava/lang/CharSequence;Ll/ۜ֡ᩳ;)V
    .locals 0

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    iput p2, p0, Ll/᩺ۘᩳ;->᩸:I

    iput-object p3, p0, Ll/᩺ۘᩳ;->ۙ:Ljava/lang/CharSequence;

    iput-object p4, p0, Ll/᩺ۘᩳ;->᩶:Ll/ۜ֡ᩳ;

    return-void
.end method

.method public static ֫(Ljava/io/Writer;Ljava/lang/CharSequence;)V
    .locals 7

    const v0, 0x8000

    new-array v1, v0, [C

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 214
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 215
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_0

    add-int v6, v3, v5

    .line 216
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    aput-char v6, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 217
    :cond_0
    invoke-virtual {p0, v1, v2, v4}, Ljava/io/Writer;->write([CII)V

    add-int/2addr v3, v4

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 248
    iget-object v0, p0, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    monitor-enter v0

    .line 249
    :try_start_0
    iget-boolean v1, p0, Ll/᩺ۘᩳ;->᩹:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 250
    iput-boolean v1, p0, Ll/᩺ۘᩳ;->᩹:Z

    iget-object v2, p0, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-static {v2}, Ll/ܰۘᩳ;->ᩳ(Ll/ܰۘᩳ;)I

    move-result v3

    sub-int/2addr v3, v1

    invoke-static {v2, v3}, Ll/ܰۘᩳ;->֫(Ll/ܰۘᩳ;I)V

    .line 251
    iget-object v1, p0, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-static {v1}, Ll/ܰۘᩳ;->ᩳ(Ll/ܰۘᩳ;)I

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-static {v1}, Ll/ܰۘᩳ;->ܽ(Ll/ܰۘᩳ;)Ll/ۗ᩻᩵;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    .line 252
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫()I
    .locals 1

    .line 199
    iget v0, p0, Ll/᩺ۘᩳ;->᩸:I

    return v0
.end method

.method public final ֫(I)Ll/۟᩸ᩳ;
    .locals 2

    .line 201
    iget v0, p0, Ll/᩺ۘᩳ;->᩸:I

    if-eq p1, v0, :cond_0

    .line 202
    iget-object v0, p0, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    iget-object v1, p0, Ll/᩺ۘᩳ;->᩶:Ll/ۜ֡ᩳ;

    invoke-virtual {v0, p1, v1}, Ll/ܰۘᩳ;->֫(ILl/ۜ֡ᩳ;)Ll/۟᩸ᩳ;

    move-result-object p1

    return-object p1

    .line 201
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Active page already has a captured read"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/io/Writer;)V
    .locals 3

    const/4 v0, 0x0

    .line 198
    :goto_0
    iget-object v1, p0, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-virtual {v1}, Ll/ܰۘᩳ;->ܽ()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 207
    iget v2, p0, Ll/᩺ۘᩳ;->᩸:I

    if-ne v0, v2, :cond_0

    iget-object v1, p0, Ll/᩺ۘᩳ;->ۙ:Ljava/lang/CharSequence;

    invoke-static {p1, v1}, Ll/᩺ۘᩳ;->֫(Ljava/io/Writer;Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 208
    :cond_0
    iget-object v2, p0, Ll/᩺ۘᩳ;->᩶:Ll/ۜ֡ᩳ;

    invoke-virtual {v1, v0, v2}, Ll/ܰۘᩳ;->֫(ILl/ۜ֡ᩳ;)Ll/۟᩸ᩳ;

    move-result-object v1

    :try_start_0
    invoke-static {p1, v1}, Ll/᩺ۘᩳ;->֫(Ljava/io/Writer;Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    :cond_1
    return-void
.end method

.method public final ܽ()V
    .locals 18

    move-object/from16 v1, p0

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 198
    :goto_0
    iget-object v3, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-virtual {v3}, Ll/ܰۘᩳ;->ܽ()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 224
    iget v3, v1, Ll/᩺ۘᩳ;->᩸:I

    if-ne v2, v3, :cond_0

    goto/16 :goto_1

    .line 225
    :cond_0
    iget-object v3, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    move-object/from16 v16, v3

    monitor-enter v16

    :try_start_0
    iget-object v3, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-static {v3}, Ll/ܰۘᩳ;->֫(Ll/ܰۘᩳ;)[Z

    move-result-object v3

    aget-boolean v3, v3, v2

    if-nez v3, :cond_1

    monitor-exit v16

    goto/16 :goto_1

    :cond_1
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 226
    iget-object v3, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-virtual {v3, v2}, Ll/ܰۘᩳ;->ۧ(I)Ll/᩷۠ᩴ;

    move-result-object v4

    iget-object v3, v1, Ll/᩺ۘᩳ;->᩶:Ll/ۜ֡ᩳ;

    iget-object v5, v3, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    iget-object v6, v3, Ll/ۜ֡ᩳ;->ܽ:Ll/ۙ۬ᩳ;

    iget-object v7, v3, Ll/ۜ֡ᩳ;->ۧ:Ljava/util/concurrent/Executor;

    new-instance v9, Ll/ۨۘᩳ;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    const/4 v10, 0x0

    const/high16 v8, 0x800000

    .line 72
    invoke-static/range {v4 .. v10}, Ll/ۨ᩵ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ljava/util/concurrent/Executor;ILl/ܿۖ᩷;Ljava/lang/String;)Ll/ۨ᩵ᩳ;

    move-result-object v3

    const/high16 v10, 0x800000

    .line 228
    :try_start_1
    iget-object v4, v3, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v4, v0}, Ll/ۙ֫ܿ;->ۧ(Z)V

    .line 229
    iget-object v4, v3, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v4, v4, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v4, v4, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    invoke-virtual {v4}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v12

    const-string v4, "changed"

    invoke-virtual {v12, v4, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 231
    iget-object v4, v3, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v4}, Ll/ۙ֫ܿ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 232
    :try_start_2
    iget-object v4, v3, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v5, v4, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v7, v4, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    iget-object v4, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-virtual {v4}, Ll/ܰۘᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    move-object v4, v5

    move-object v5, v11

    move-object v6, v12

    invoke-virtual/range {v4 .. v10}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;ZI)Ll/۫ᩴᩳ;

    move-result-object v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 233
    :try_start_3
    invoke-virtual {v11}, Ll/۬᩹ᩳ;->close()V

    .line 234
    iget-object v4, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-virtual {v4, v2}, Ll/ܰۘᩳ;->ۧ(I)Ll/᩷۠ᩴ;

    iget-object v4, v3, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v13, v4, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    iget-object v15, v1, Ll/᩺ۘᩳ;->᩶:Ll/ۜ֡ᩳ;

    new-instance v16, Ll/ۨۘᩳ;

    invoke-direct/range {v16 .. v16}, Ljava/lang/Object;-><init>()V

    move-object v11, v3

    invoke-virtual/range {v11 .. v16}, Ll/ۨ᩵ᩳ;->֫(Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/۫ᩴᩳ;Ll/ۜ֡ᩳ;Ll/ۨۘᩳ;)V

    .line 235
    iget-object v4, v3, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v4}, Ll/ۙ֫ܿ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ll/ۨ᩵ᩳ;->֫(J)Ll/ۗ᩻᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 236
    invoke-virtual {v3}, Ll/ۨ᩵ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 231
    :try_start_4
    invoke-virtual {v11}, Ll/۬᩹ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v4, v0

    :try_start_5
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    .line 236
    invoke-virtual {v3}, Ll/ۨ᩵ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    throw v0

    :catchall_3
    move-exception v0

    .line 225
    :try_start_6
    monitor-exit v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v0

    .line 238
    :cond_2
    iget-object v2, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-static {v2}, Ll/ܰۘᩳ;->ܿ(Ll/ܰۘᩳ;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    monitor-enter v16

    .line 239
    :try_start_7
    iget-object v2, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    move-object/from16 v17, v2

    monitor-enter v17
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    const/4 v2, 0x0

    .line 198
    :goto_3
    :try_start_8
    iget-object v3, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-virtual {v3}, Ll/ܰۘᩳ;->ܽ()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 240
    iget v3, v1, Ll/᩺ۘᩳ;->᩸:I

    if-eq v2, v3, :cond_3

    iget-object v3, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-static {v3}, Ll/ܰۘᩳ;->֫(Ll/ܰۘᩳ;)[Z

    move-result-object v3

    aput-boolean v0, v3, v2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 241
    :cond_4
    iget-object v0, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-static {v0}, Ll/ܰۘᩳ;->ۧ(Ll/ܰۘᩳ;)Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "changed"

    iget-object v3, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-static {v3}, Ll/ܰۘᩳ;->֫(Ll/ܰۘᩳ;)[Z

    move-result-object v3

    iget v4, v1, Ll/᩺ۘᩳ;->᩸:I

    aget-boolean v3, v3, v4

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 242
    monitor-exit v17
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 243
    :try_start_9
    iget-object v0, v1, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-static {v0}, Ll/ܰۘᩳ;->ܳ(Ll/ܰۘᩳ;)V

    .line 244
    monitor-exit v16
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    return-void

    :catchall_4
    move-exception v0

    .line 242
    :try_start_a
    monitor-exit v17
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :try_start_b
    throw v0

    :catchall_5
    move-exception v0

    .line 244
    monitor-exit v16
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    throw v0
.end method
