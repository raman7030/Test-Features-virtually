.class public final synthetic Ll/ܿᩴᩳ;
.super Ljava/lang/Object;
.source "Y6SG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܿᩴᩳ;->᩸:I

    iput-object p2, p0, Ll/ܿᩴᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 2
    iget v0, p0, Ll/ܿᩴᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܿᩴᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۘܶᩳ;

    .line 2250
    iget-object v1, v0, Ll/ۘܶᩳ;->ܳ:Ll/ۢۘᩳ;

    iget-object v2, v0, Ll/ۘܶᩳ;->ۘ:Ll/۫ۨᩳ;

    iget-object v3, v0, Ll/ۘܶᩳ;->ۖ:Ll/᩹ܶᩳ;

    const/4 v4, 0x0

    iput-boolean v4, v0, Ll/ۘܶᩳ;->ۡ:Z

    .line 2251
    iget-object v4, v0, Ll/ۘܶᩳ;->ܽ:Ll/ۗ᩻᩵;

    invoke-virtual {v4}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_2

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܿᩴᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܳᩴᩳ;

    .line 202
    iget-object v0, v0, Ll/ܳᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Checkpoint was superseded or discarded"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void

    .line 2253
    :cond_0
    :try_start_0
    iget-boolean v5, v3, Ll/᩹ܶᩳ;->۬֫:Z

    if-eqz v5, :cond_10

    if-eqz v2, :cond_10

    iget-object v5, v3, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    if-ne v5, v2, :cond_10

    iget-object v5, v3, Ll/֫ۘᩳ;->᩹:Ll/ۢۘᩳ;

    if-ne v5, v1, :cond_10

    iget-object v5, v0, Ll/ۘܶᩳ;->ۢ:Ljava/lang/String;

    .line 2254
    invoke-virtual {v3}, Ll/֫ۘᩳ;->ܽ()Ll/ۙܶᩳ;

    move-result-object v6

    .line 63
    iget-object v6, v6, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    .line 2254
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    iget-object v5, v0, Ll/ۘܶᩳ;->᩷:Ll/۟᩺ᩳ;

    if-eqz v5, :cond_1

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v5

    iget-object v6, v0, Ll/ۘܶᩳ;->᩷:Ll/۟᩺ᩳ;

    if-ne v5, v6, :cond_10

    .line 2257
    :cond_1
    iget-object v5, v0, Ll/ۘܶᩳ;->ۧ:Ll/ۗ᩻᩵;

    if-eqz v5, :cond_3

    .line 2258
    invoke-virtual {v5}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_2

    .line 2259
    :cond_2
    iget-object v5, v0, Ll/ۘܶᩳ;->ۧ:Ll/ۗ᩻᩵;

    invoke-virtual {v5}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    .line 2261
    :cond_3
    iget-object v5, v0, Ll/ۘܶᩳ;->ᩳ:Ll/ۗ᩻᩵;

    if-eqz v5, :cond_6

    .line 2262
    invoke-virtual {v5}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v5

    if-nez v5, :cond_4

    goto/16 :goto_2

    .line 2263
    :cond_4
    iget-object v5, v0, Ll/ۘܶᩳ;->ᩳ:Ll/ۗ᩻᩵;

    invoke-virtual {v5}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۨ᩵ᩳ;

    iget-object v5, v5, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v6

    if-ne v5, v6, :cond_5

    goto :goto_0

    .line 2264
    :cond_5
    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Saving loaded content was replaced"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 2266
    :cond_6
    :goto_0
    invoke-static {v3}, Ll/᩹ܶᩳ;->ܺ(Ll/᩹ܶᩳ;)Ll/᩵ᩴᩳ;

    move-result-object v5

    if-nez v5, :cond_11

    invoke-static {v3}, Ll/᩹ܶᩳ;->ۜ(Ll/᩹ܶᩳ;)Ljava/lang/Runnable;

    move-result-object v5

    if-eqz v5, :cond_7

    goto/16 :goto_2

    .line 2267
    :cond_7
    invoke-static {v3}, Ll/᩹ܶᩳ;->ۘ(Ll/᩹ܶᩳ;)Ll/᩵᩵ᩳ;

    move-result-object v5

    if-eqz v5, :cond_9

    invoke-static {v3}, Ll/᩹ܶᩳ;->ۘ(Ll/᩹ܶᩳ;)Ll/᩵᩵ᩳ;

    move-result-object v5

    iget-object v6, v0, Ll/ۘܶᩳ;->᩻:Ll/᩵᩵ᩳ;

    if-eq v5, v6, :cond_9

    if-nez v6, :cond_8

    .line 2268
    iget-object v5, v0, Ll/ۘܶᩳ;->᩷:Ll/۟᩺ᩳ;

    if-nez v5, :cond_8

    .line 2269
    invoke-static {v3}, Ll/᩹ܶᩳ;->ۘ(Ll/᩹ܶᩳ;)Ll/᩵᩵ᩳ;

    move-result-object v5

    .line 2292
    iput-object v5, v0, Ll/ۘܶᩳ;->᩻:Ll/᩵᩵ᩳ;

    .line 2293
    invoke-virtual {v5}, Ll/᩵᩵ᩳ;->ᩳ()Ll/ۗ᩻᩵;

    move-result-object v5

    iput-object v5, v0, Ll/ۘܶᩳ;->ᩳ:Ll/ۗ᩻᩵;

    .line 2294
    new-instance v6, Ll/ۜᩴᩳ;

    const/4 v7, 0x1

    invoke-direct {v6, v7, v0}, Ll/ۜᩴᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v5, v6}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    goto :goto_1

    .line 2268
    :cond_8
    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Saving preparation was superseded"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 2271
    :cond_9
    :goto_1
    invoke-virtual {v1}, Ll/ۢۘᩳ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_2

    .line 2272
    :cond_a
    invoke-static {v3}, Ll/᩹ܶᩳ;->ۖ(Ll/᩹ܶᩳ;)Ll/ۗ᩻᩵;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-static {v3}, Ll/᩹ܶᩳ;->ۖ(Ll/᩹ܶᩳ;)Ll/ۗ᩻᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_2

    .line 2273
    :cond_b
    invoke-virtual {v3}, Ll/֫ۘᩳ;->ۢ()Z

    move-result v1

    if-nez v1, :cond_f

    .line 2274
    iget-object v1, v0, Ll/ۘܶᩳ;->᩷:Ll/۟᩺ᩳ;

    if-nez v1, :cond_c

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    iput-object v1, v0, Ll/ۘܶᩳ;->᩷:Ll/۟᩺ᩳ;

    .line 2275
    :cond_c
    iget-object v1, v0, Ll/ۘܶᩳ;->ۜ:Ll/᩺ܶᩳ;

    invoke-static {v3, v1}, Ll/᩹ܶᩳ;->ۧ(Ll/᩹ܶᩳ;Ll/᩺ܶᩳ;)Ll/ۡܶᩳ;

    move-result-object v1

    iput-object v1, v0, Ll/ۘܶᩳ;->֫:Ll/ۡܶᩳ;

    if-eqz v1, :cond_d

    .line 2277
    invoke-virtual {v0}, Ll/ۘܶᩳ;->֫()V

    .line 2278
    iget-object v1, v0, Ll/ۘܶᩳ;->֫:Ll/ۡܶᩳ;

    invoke-virtual {v4, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    goto :goto_2

    .line 2279
    :cond_d
    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩺ۧ()Z

    move-result v1

    if-nez v1, :cond_e

    goto :goto_2

    .line 2281
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Editor content is not available for saving"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 2273
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot save failed editor content"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 2255
    :cond_10
    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Saving owner changed before capture"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v1

    .line 2283
    invoke-virtual {v0, v1}, Ll/ۘܶᩳ;->֫(Ljava/lang/Throwable;)V

    :cond_11
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
