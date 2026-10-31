.class public final Ll/ۤ֡ܳ;
.super Ll/֫ۜܳ;
.source "XAJ9"


# instance fields
.field public ۗ:Ll/ᩳۜܳ;

.field public ۫:Ll/ܽ᩷ܳ;

.field public ۬:Ll/ܽ᩷ܳ;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f1205ba

    const v1, 0x7f0801e2

    .line 63
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Ll/ۙ֡ܳ;
    .locals 9

    .line 368
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v0

    const-wide/16 v1, 0x0

    const/16 v3, 0x63

    const/16 v4, 0x62

    const/16 v5, 0x6c

    const-string v6, "Unable to resolve special link target: "

    if-eqz v0, :cond_3

    .line 369
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ()Ll/ۧ᩹ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->ۨۧ()Ll/ܿ᩹ܿ;

    move-result-object v0

    .line 370
    invoke-virtual {v0}, Ll/ܿ᩹ܿ;->ᩳ()I

    move-result v7

    .line 371
    invoke-static {v7}, Ll/ۧ۠᩵;->֫(I)C

    move-result v7

    if-eq v7, v5, :cond_2

    if-eq v7, v4, :cond_0

    if-ne v7, v3, :cond_1

    .line 375
    :cond_0
    invoke-virtual {v0}, Ll/ܿ᩹ܿ;->ۜ()J

    move-result-wide v1

    .line 376
    :cond_1
    new-instance p0, Ll/ۙ֡ܳ;

    invoke-direct {p0, v1, v2, v7}, Ll/ۙ֡ܳ;-><init>(JC)V

    return-object p0

    .line 373
    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 373
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 378
    :cond_3
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v0

    const-string v7, "Unable to inspect special file: "

    if-eqz v0, :cond_7

    .line 380
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩷()Ll/ܺ֡ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺ֡ܿ;->֫֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/system/Os;->lstat(Ljava/lang/String;)Landroid/system/StructStat;

    move-result-object v0

    .line 381
    iget v8, v0, Landroid/system/StructStat;->st_mode:I

    invoke-static {v8}, Ll/ۧ۠᩵;->֫(I)C

    move-result v8

    if-eq v8, v5, :cond_6

    if-eq v8, v4, :cond_4

    if-ne v8, v3, :cond_5

    .line 385
    :cond_4
    iget-wide v1, v0, Landroid/system/StructStat;->st_rdev:J

    .line 386
    :cond_5
    new-instance v0, Ll/ۙ֡ܳ;

    invoke-direct {v0, v1, v2, v8}, Ll/ۙ֡ܳ;-><init>(JC)V

    return-object v0

    .line 383
    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 388
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v2}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 388
    invoke-direct {v1, p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 391
    :cond_7
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 391
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/util/HashMap;Ll/ۗۢ᩻;Ljava/lang/String;ZLjava/lang/String;Ll/۫֡ܳ;)V
    .locals 9

    .line 455
    invoke-virtual {p5}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x1

    .line 199
    invoke-virtual {p1, p2, v0}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object p2

    .line 458
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    .line 459
    invoke-interface {v0}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 0
    invoke-static {p4}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 460
    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    if-eqz p3, :cond_1

    .line 462
    new-instance v8, Ll/ۗ֡ܳ;

    const-wide/16 v5, 0x0

    move-object v1, v8

    move-object v2, p1

    move-object v3, v0

    move-object v4, v7

    invoke-direct/range {v1 .. v6}, Ll/ۗ֡ܳ;-><init>(Ll/ۗۢ᩻;Ll/ᩳۜܳ;Ljava/lang/String;J)V

    .line 463
    invoke-virtual {p0, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    :cond_1
    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v5

    move-object v3, p0

    move-object v4, p1

    move v6, p3

    move-object v8, p5

    invoke-static/range {v3 .. v8}, Ll/ۤ֡ܳ;->֫(Ljava/util/HashMap;Ll/ۗۢ᩻;Ljava/lang/String;ZLjava/lang/String;Ll/۫֡ܳ;)V

    goto :goto_0

    .line 0
    :cond_2
    invoke-static {p4}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 467
    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 468
    new-instance v8, Ll/ۗ֡ܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v5

    move-object v1, v8

    move-object v2, p1

    move-object v3, v0

    move-object v4, v7

    invoke-direct/range {v1 .. v6}, Ll/ۗ֡ܳ;-><init>(Ll/ۗۢ᩻;Ll/ᩳۜܳ;Ljava/lang/String;J)V

    .line 469
    invoke-virtual {p0, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public static bridge synthetic ֫(Ljava/util/HashMap;Ll/ۗۢ᩻;Ljava/lang/String;ZLl/۫֡ܳ;)V
    .locals 6

    const-string v4, ""

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p4

    .line 0
    invoke-static/range {v0 .. v5}, Ll/ۤ֡ܳ;->֫(Ljava/util/HashMap;Ll/ۗۢ᩻;Ljava/lang/String;ZLjava/lang/String;Ll/۫֡ܳ;)V

    return-void
.end method

.method public static ֫(Ljava/util/HashMap;Ll/ܶ᩵ܿ;ZLjava/lang/String;Ll/۫֡ܳ;)V
    .locals 5

    .line 306
    invoke-virtual {p4}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v0, 0x1

    .line 413
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object p1

    .line 309
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 310
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 0
    invoke-static {p3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 311
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_1

    .line 313
    new-instance v2, Ll/᩸֡ܳ;

    const-wide/16 v3, 0x0

    invoke-direct {v2, v3, v4, v0, v1}, Ll/᩸֡ܳ;-><init>(JLl/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 314
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    :cond_1
    invoke-static {p0, v0, p2, v1, p4}, Ll/ۤ֡ܳ;->֫(Ljava/util/HashMap;Ll/ܶ᩵ܿ;ZLjava/lang/String;Ll/۫֡ܳ;)V

    goto :goto_0

    .line 0
    :cond_2
    invoke-static {p3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 318
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 331
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֡֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 332
    new-instance v2, Ll/᩸֡ܳ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    invoke-direct {v2, v3, v4, v0, v1}, Ll/᩸֡ܳ;-><init>(JLl/ܶ᩵ܿ;Ljava/lang/String;)V

    goto :goto_3

    .line 334
    :cond_3
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܰ()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 336
    new-instance v0, Ll/᩹֡ܳ;

    invoke-direct {v0, v1, v2}, Ll/᩹֡ܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    move-object v2, v0

    goto :goto_3

    .line 340
    :cond_4
    :try_start_0
    invoke-static {v0}, Ll/ۤ֡ܳ;->֫(Ll/ܶ᩵ܿ;)Ll/ۙ֡ܳ;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 344
    iget-char v3, v2, Ll/ۙ֡ܳ;->֫:C

    const/16 v4, 0x2d

    if-eq v3, v4, :cond_6

    const/16 v4, 0x64

    if-ne v3, v4, :cond_5

    goto :goto_2

    .line 347
    :cond_5
    new-instance v0, Ll/᩶֡ܳ;

    invoke-direct {v0, v1, v2}, Ll/᩶֡ܳ;-><init>(Ljava/lang/String;Ll/ۙ֡ܳ;)V

    goto :goto_1

    .line 345
    :cond_6
    :goto_2
    new-instance v2, Ll/᩸֡ܳ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    invoke-direct {v2, v3, v4, v0, v1}, Ll/᩸֡ܳ;-><init>(JLl/ܶ᩵ܿ;Ljava/lang/String;)V

    goto :goto_3

    :catch_0
    move-exception v0

    .line 342
    new-instance v2, Ll/۠֡ܳ;

    invoke-direct {v2, v1, v0}, Ll/۠֡ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    .line 321
    :goto_3
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    :goto_4
    return-void
.end method

.method public static bridge synthetic ֫(Ljava/util/HashMap;Ll/ܶ᩵ܿ;ZLl/۫֡ܳ;)V
    .locals 1

    const-string v0, ""

    .line 0
    invoke-static {p0, p1, p2, v0, p3}, Ll/ۤ֡ܳ;->֫(Ljava/util/HashMap;Ll/ܶ᩵ܿ;ZLjava/lang/String;Ll/۫֡ܳ;)V

    return-void
.end method

.method public static ֫(Ljava/util/HashMap;Ll/ᩳܰۡ;Ljava/lang/String;Z)V
    .locals 10

    .line 283
    invoke-virtual {p1}, Ll/ᩳܰۡ;->ۙ()Ll/ܳܰۡ;

    move-result-object v7

    .line 284
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 285
    invoke-virtual {p1}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ll/ۗ᩺ۡ;

    .line 286
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 289
    :cond_1
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_3

    .line 292
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    .line 294
    new-instance v9, Ll/֨֡ܳ;

    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v2

    if-eqz p3, :cond_2

    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_1

    :cond_2
    new-instance v0, Ll/᩻ۚܳ;

    invoke-direct {v0, v6}, Ll/᩻ۚܳ;-><init>(Ll/ۗ᩺ۡ;)V

    :goto_1
    move-object v4, v0

    move-object v0, v9

    move-object v1, v8

    move-object v5, v7

    invoke-direct/range {v0 .. v6}, Ll/֨֡ܳ;-><init>(Ljava/lang/String;JLjava/lang/Object;Ll/ܳܰۡ;Ll/ۗ᩺ۡ;)V

    .line 300
    invoke-virtual {p0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 290
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Comparing encrypted files is not supported"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return-void
.end method

.method public static ֫(Ll/ۤ֡ܳ;Ll/ܽۢܳ;Ll/ܶ֡ܳ;)V
    .locals 4

    .line 128
    iget-object v0, p2, Ll/ܶ֡ܳ;->֫:Ll/ᩳۜܳ;

    iget-object p2, p2, Ll/ܶ֡ܳ;->ۧ:Ll/ᩳۜܳ;

    .line 141
    iget-object v1, p0, Ll/ۤ֡ܳ;->ۗ:Ll/ᩳۜܳ;

    if-ne v0, v1, :cond_0

    .line 142
    iget-object v1, p0, Ll/ۤ֡ܳ;->۬:Ll/ܽ᩷ܳ;

    .line 143
    iget-object v2, p0, Ll/ۤ֡ܳ;->۫:Ll/ܽ᩷ܳ;

    goto :goto_0

    .line 145
    :cond_0
    iget-object v1, p0, Ll/ۤ֡ܳ;->۫:Ll/ܽ᩷ܳ;

    .line 146
    iget-object v2, p0, Ll/ۤ֡ܳ;->۬:Ll/ܽ᩷ܳ;

    .line 148
    :goto_0
    invoke-virtual {v1, v0}, Ll/ܽ᩷ܳ;->֫(Ll/ᩳۜܳ;)V

    .line 149
    invoke-virtual {v2, p2}, Ll/ܽ᩷ܳ;->֫(Ll/ᩳۜܳ;)V

    .line 150
    invoke-virtual {p0}, Ll/֫ۜܳ;->ᩳ()I

    move-result p0

    const-string v3, "txt"

    invoke-static {p1, p0, v3}, Ll/᩻֡ܳ;->֫(Ll/ܽۢܳ;ILjava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 151
    sget p1, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance p1, Ll/֨۠ۢ;

    const-class v3, Ll/۫֡ܳ;

    invoke-direct {p1, v3}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    const-string v3, "saveAsPath"

    .line 152
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v3, p0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "inputPath1"

    .line 153
    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, p0, v3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "inputPath2"

    .line 154
    invoke-interface {p2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, p0, v3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    instance-of p0, v0, Ll/۫᩶᩻;

    if-eqz p0, :cond_1

    .line 156
    check-cast v1, Ll/ۧۗ᩻;

    invoke-virtual {v1}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object p0

    const-string v0, "zipPath1"

    invoke-virtual {p1, v0, p0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 157
    :cond_1
    instance-of p0, v0, Ll/ܿۜ᩻;

    if-eqz p0, :cond_2

    .line 158
    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object p0

    const-string v0, "statelessVisitor1"

    .line 159
    invoke-virtual {p0}, Ll/ܰܺܳ;->֫()[B

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[B)V

    goto :goto_1

    .line 160
    :cond_2
    instance-of p0, v0, Ll/ۢۧ᩻;

    if-eqz p0, :cond_6

    .line 163
    :goto_1
    instance-of p0, p2, Ll/۫᩶᩻;

    if-eqz p0, :cond_3

    .line 164
    check-cast v2, Ll/ۧۗ᩻;

    invoke-virtual {v2}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object p0

    const-string p2, "zipPath2"

    invoke-virtual {p1, p2, p0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 165
    :cond_3
    instance-of p0, p2, Ll/ܿۜ᩻;

    if-eqz p0, :cond_4

    .line 166
    invoke-virtual {v2}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object p0

    const-string p2, "statelessVisitor2"

    .line 167
    invoke-virtual {p0}, Ll/ܰܺܳ;->֫()[B

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[B)V

    goto :goto_2

    .line 168
    :cond_4
    instance-of p0, p2, Ll/ۢۧ᩻;

    if-eqz p0, :cond_5

    .line 171
    :goto_2
    invoke-virtual {p1}, Ll/֨۠ۢ;->֫()I

    return-void

    .line 169
    :cond_5
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    .line 161
    :cond_6
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method

.method private ֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/ᩳۜܳ;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    .line 114
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f0d00a9

    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a017d

    .line 115
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    const v2, 0x7f0a017e

    .line 116
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    const v3, 0x7f0a0631

    .line 117
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {p0}, Ll/֫ۜܳ;->ᩳ()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V

    .line 118
    new-instance v3, Ll/ܶ֡ܳ;

    .line 478
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 479
    iput-object p2, v3, Ll/ܶ֡ܳ;->֫:Ll/ᩳۜܳ;

    .line 480
    iput-object p3, v3, Ll/ܶ֡ܳ;->ۧ:Ll/ᩳۜܳ;

    .line 481
    iput-object p4, v3, Ll/ܶ֡ܳ;->ܽ:Ljava/lang/String;

    .line 482
    iput-object p5, v3, Ll/ܶ֡ܳ;->ᩳ:Ljava/lang/String;

    if-eqz p6, :cond_0

    .line 119
    invoke-interface {p2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide p4

    invoke-interface {p3}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide p2

    cmp-long p6, p4, p2

    if-lez p6, :cond_0

    .line 486
    iget-object p2, v3, Ll/ܶ֡ܳ;->֫:Ll/ᩳۜܳ;

    .line 487
    iget-object p3, v3, Ll/ܶ֡ܳ;->ۧ:Ll/ᩳۜܳ;

    iput-object p3, v3, Ll/ܶ֡ܳ;->֫:Ll/ᩳۜܳ;

    .line 488
    iput-object p2, v3, Ll/ܶ֡ܳ;->ۧ:Ll/ᩳۜܳ;

    .line 490
    iget-object p2, v3, Ll/ܶ֡ܳ;->ܽ:Ljava/lang/String;

    .line 491
    iget-object p3, v3, Ll/ܶ֡ܳ;->ᩳ:Ljava/lang/String;

    iput-object p3, v3, Ll/ܶ֡ܳ;->ܽ:Ljava/lang/String;

    .line 492
    iput-object p2, v3, Ll/ܶ֡ܳ;->ᩳ:Ljava/lang/String;

    :cond_0
    const/4 p2, 0x0

    .line 122
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 123
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 124
    iget-object p3, v3, Ll/ܶ֡ܳ;->ܽ:Ljava/lang/String;

    iget-object p4, v3, Ll/ܶ֡ܳ;->ᩳ:Ljava/lang/String;

    invoke-static {p3, p4, v1, v2}, Ll/֫᩷ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 125
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p3

    sget p4, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p4, Ll/᩵ۚۢ;

    invoke-direct {p4, p3}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 126
    invoke-virtual {p4, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance p3, Ll/֡֡ܳ;

    invoke-direct {p3, p0, p1, v3}, Ll/֡֡ܳ;-><init>(Ll/ۤ֡ܳ;Ll/ܽۢܳ;Ll/ܶ֡ܳ;)V

    const p1, 0x7f12070a

    .line 127
    invoke-virtual {p4, p1, p3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    .line 129
    invoke-virtual {p4, p1, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12030f

    .line 130
    invoke-virtual {p4, p1, p2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 131
    invoke-virtual {p4}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 132
    invoke-virtual {p1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    new-instance p2, Ll/ۚ֡ܳ;

    invoke-direct {p2, v3, v1, v2}, Ll/ۚ֡ܳ;-><init>(Ll/ܶ֡ܳ;Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 133
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 5

    .line 398
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    const/16 v1, 0x4d

    .line 399
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v1, 0x54

    .line 400
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/4 v2, 0x0

    .line 401
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v2, 0x4c

    .line 402
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v2, 0x49

    .line 403
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v3, 0x4e

    .line 404
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v4, 0x4b

    .line 405
    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->writeByte(I)V

    const/4 v4, 0x1

    .line 406
    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->writeByte(I)V

    .line 407
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v3, 0x4f

    .line 408
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    .line 409
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/4 v3, 0x2

    .line 410
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v3, 0x45

    .line 411
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v3, 0x58

    .line 412
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    .line 413
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v2, 0x53

    .line 414
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeByte(I)V

    .line 415
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 416
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeByte(I)V

    const/4 v1, 0x3

    .line 417
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 418
    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 419
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 11

    .line 82
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    .line 85
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    .line 86
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    iput-object v1, p0, Ll/ۤ֡ܳ;->ۗ:Ll/ᩳۜܳ;

    .line 87
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ll/ᩳۜܳ;

    .line 88
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ֡ܳ;->۫:Ll/ܽ᩷ܳ;

    iput-object v0, p0, Ll/ۤ֡ܳ;->۬:Ll/ܽ᩷ܳ;

    .line 89
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    iget-object v3, p0, Ll/ۤ֡ܳ;->ۗ:Ll/ᩳۜܳ;

    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ll/ۤ֡ܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/ᩳۜܳ;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    .line 91
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    .line 92
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v1

    iput-object v1, p0, Ll/ۤ֡ܳ;->ۗ:Ll/ᩳۜܳ;

    .line 93
    invoke-virtual {v0}, Ll/ܽۢܳ;->۠()Ll/ᩳۜܳ;

    move-result-object v1

    .line 94
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v4

    iput-object v4, p0, Ll/ۤ֡ܳ;->۬:Ll/ܽ᩷ܳ;

    .line 95
    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ֡ܳ;->۫:Ll/ܽ᩷ܳ;

    .line 97
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->᩺()Z

    move-result v0

    .line 98
    iget-object v4, p0, Ll/ۤ֡ܳ;->ۗ:Ll/ᩳۜܳ;

    invoke-interface {v4}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const v4, 0x7f1201c0

    if-eqz v0, :cond_1

    const v5, 0x7f1201bf

    goto :goto_0

    :cond_1
    const v5, 0x7f1201c0

    .line 99
    :goto_0
    iget-object v6, p0, Ll/ۤ֡ܳ;->ۗ:Ll/ᩳۜܳ;

    invoke-interface {v6}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v6

    new-array v7, v2, [Ljava/lang/Object;

    aput-object v6, v7, v3

    invoke-static {v5, v7}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const v4, 0x7f1201bf

    .line 100
    :goto_1
    invoke-interface {v1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v6

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v6, v2, v3

    invoke-static {v4, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object v9, v5

    goto :goto_2

    .line 102
    :cond_3
    iget-object v2, p0, Ll/ۤ֡ܳ;->ۗ:Ll/ᩳۜܳ;

    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 103
    invoke-interface {v1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    move-object v9, v2

    move-object v2, v3

    :goto_2
    if-eqz v0, :cond_4

    .line 106
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v5

    iget-object v6, p0, Ll/ۤ֡ܳ;->ۗ:Ll/ᩳۜܳ;

    const/4 v10, 0x0

    move-object v4, p0

    move-object v7, v1

    move-object v8, v9

    move-object v9, v2

    invoke-direct/range {v4 .. v10}, Ll/ۤ֡ܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/ᩳۜܳ;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    .line 108
    :cond_4
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v5

    iget-object v7, p0, Ll/ۤ֡ܳ;->ۗ:Ll/ᩳۜܳ;

    const/4 v10, 0x0

    move-object v4, p0

    move-object v6, v1

    move-object v8, v2

    invoke-direct/range {v4 .. v10}, Ll/ۤ֡ܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/ᩳۜܳ;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 5

    const-string v0, "local"

    .line 68
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "net"

    const-string v3, "zip"

    if-nez v1, :cond_0

    invoke-virtual {p1, v3}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1, v2}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_2

    .line 73
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object p1

    .line 74
    invoke-virtual {p1, v0}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1, v3}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method
