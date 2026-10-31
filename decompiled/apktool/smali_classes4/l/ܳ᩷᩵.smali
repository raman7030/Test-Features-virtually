.class public final Ll/ܳ᩷᩵;
.super Ll/ᩳ᩷᩵;
.source "6A0Y"


# instance fields
.field public ۖ:Ljava/util/HashMap;

.field public final ۘ:Ll/ܿ᩷᩵;

.field public final ۜ:Ll/ܿ᩷᩵;

.field public ۡ:Ljava/net/InetSocketAddress;

.field public final ۢ:Ll/ܿ᩷᩵;

.field public ܺ:I

.field public final ᩷:Ll/ܿ᩷᩵;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x5b4

    .line 213
    invoke-direct {p0, p1, v1, v0}, Ll/ܳ᩷᩵;-><init>(IIZ)V

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 1

    const/4 v0, 0x0

    .line 234
    invoke-direct {p0, p1, v0, p3}, Ll/ᩳ᩷᩵;-><init>(IIZ)V

    .line 235
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ܳ᩷᩵;->ۖ:Ljava/util/HashMap;

    if-lez p2, :cond_0

    move p1, p2

    goto :goto_0

    :cond_0
    const/16 p1, 0x5b4

    .line 236
    :goto_0
    iput p1, p0, Ll/ܳ᩷᩵;->ܺ:I

    .line 237
    new-instance p1, Ll/ܿ᩷᩵;

    .line 35
    invoke-direct {p1, p2, p0, v0}, Ll/ܿ᩷᩵;-><init>(ILl/ܳ᩷᩵;I)V

    .line 237
    iput-object p1, p0, Ll/ܳ᩷᩵;->ۘ:Ll/ܿ᩷᩵;

    .line 238
    new-instance p1, Ll/ܿ᩷᩵;

    .line 35
    invoke-direct {p1, p2, p0, v0}, Ll/ܿ᩷᩵;-><init>(ILl/ܳ᩷᩵;I)V

    .line 238
    iput-object p1, p0, Ll/ܳ᩷᩵;->᩷:Ll/ܿ᩷᩵;

    .line 239
    new-instance p1, Ll/ܿ᩷᩵;

    .line 35
    invoke-direct {p1, p2, p0, v0}, Ll/ܿ᩷᩵;-><init>(ILl/ܳ᩷᩵;I)V

    .line 239
    iput-object p1, p0, Ll/ܳ᩷᩵;->ۢ:Ll/ܿ᩷᩵;

    .line 240
    new-instance p1, Ll/ܿ᩷᩵;

    .line 35
    invoke-direct {p1, p2, p0, v0}, Ll/ܿ᩷᩵;-><init>(ILl/ܳ᩷᩵;I)V

    .line 240
    iput-object p1, p0, Ll/ܳ᩷᩵;->ۜ:Ll/ܿ᩷᩵;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 7

    .line 415
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 416
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ۢ()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "dns[query:"

    goto :goto_0

    :cond_0
    const-string v1, "dns[response:"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " id=0x"

    .line 417
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ᩳ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, ", flags=0x"

    .line 420
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ۡ()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, ":r"

    .line 423
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    :cond_1
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->᩻()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ":aa"

    .line 426
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    :cond_2
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ܺ()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, ":tc"

    .line 429
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    :cond_3
    iget-object v1, p0, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    if-lez v2, :cond_4

    const-string v2, ", questions="

    .line 433
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    .line 434
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    :cond_4
    iget-object v2, p0, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    if-lez v3, :cond_5

    const-string v3, ", answers="

    .line 437
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    .line 438
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    :cond_5
    iget-object v3, p0, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    if-lez v4, :cond_6

    const-string v4, ", authorities="

    .line 441
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    .line 442
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    :cond_6
    iget-object v4, p0, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v5

    if-lez v5, :cond_7

    const-string v5, ", additionals="

    .line 445
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v5

    .line 446
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    :cond_7
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v5

    const-string v6, "\n\t"

    if-lez v5, :cond_8

    const-string v5, "\nquestions:"

    .line 449
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩴ᩷᩵;

    .line 451
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 151
    :cond_8
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v1

    if-lez v1, :cond_9

    const-string v1, "\nanswers:"

    .line 456
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩷᩵;

    .line 458
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 165
    :cond_9
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v1

    if-lez v1, :cond_a

    const-string v1, "\nauthorities:"

    .line 463
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩷᩵;

    .line 465
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 179
    :cond_a
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v1

    if-lez v1, :cond_b

    const-string v1, "\nadditionals:"

    .line 470
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩷᩵;

    .line 472
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_b
    const-string v1, "\nnames="

    .line 476
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    iget-object v1, p0, Ll/ܳ᩷᩵;->ۖ:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    .line 478
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()I
    .locals 1

    .line 486
    iget v0, p0, Ll/ܳ᩷᩵;->ܺ:I

    return v0
.end method

.method public final ֫(Ljava/net/InetSocketAddress;)V
    .locals 0

    .line 258
    iput-object p1, p0, Ll/ܳ᩷᩵;->ۡ:Ljava/net/InetSocketAddress;

    return-void
.end method

.method public final ֫(Ll/ۧ᩷᩵;Ll/᩹᩷᩵;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 297
    invoke-virtual {p2, p1}, Ll/᩹᩷᩵;->֫(Ll/ۧ᩷᩵;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    .line 298
    invoke-virtual {p0, p2, v0, v1}, Ll/ܳ᩷᩵;->֫(Ll/᩹᩷᩵;J)V

    return-void
.end method

.method public final ֫(Ll/ᩴ᩷᩵;)V
    .locals 4

    .line 277
    new-instance v0, Ll/ܿ᩷᩵;

    const/16 v1, 0x200

    const/4 v2, 0x0

    .line 35
    invoke-direct {v0, v1, p0, v2}, Ll/ܿ᩷᩵;-><init>(ILl/ܳ᩷᩵;I)V

    .line 164
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܿ᩷᩵;->֫(Ljava/lang/String;)V

    .line 165
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۨۢ᩵;->ۧ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 166
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ܽ()Ll/ۛۢ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۢ᩵;->ۧ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 279
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 280
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 281
    array-length v0, v1

    invoke-virtual {p0}, Ll/ܳ᩷᩵;->ۘ()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 282
    iget-object v0, p0, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 283
    iget-object p1, p0, Ll/ܳ᩷᩵;->ۘ:Ll/ܿ᩷᩵;

    array-length v0, v1

    invoke-virtual {p1, v1, v2, v0}, Ljava/io/OutputStream;->write([BII)V

    return-void

    .line 285
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "message full"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩹᩷᩵;)V
    .locals 5

    .line 333
    new-instance v0, Ll/ܿ᩷᩵;

    const/16 v1, 0x200

    const/4 v2, 0x0

    .line 35
    invoke-direct {v0, v1, p0, v2}, Ll/ܿ᩷᩵;-><init>(ILl/ܳ᩷᩵;I)V

    const-wide/16 v3, 0x0

    .line 334
    invoke-virtual {v0, p1, v3, v4}, Ll/ܿ᩷᩵;->֫(Ll/᩹᩷᩵;J)V

    .line 335
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 336
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 337
    array-length v0, v1

    invoke-virtual {p0}, Ll/ܳ᩷᩵;->ۘ()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 338
    iget-object v0, p0, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 339
    iget-object p1, p0, Ll/ܳ᩷᩵;->ۢ:Ll/ܿ᩷᩵;

    array-length v0, v1

    invoke-virtual {p1, v1, v2, v0}, Ljava/io/OutputStream;->write([BII)V

    return-void

    .line 341
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "message full"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩹᩷᩵;J)V
    .locals 3

    if-eqz p1, :cond_2

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-eqz v2, :cond_0

    .line 311
    invoke-virtual {p1, p2, p3}, Ll/᩹᩷᩵;->֫(J)Z

    move-result v0

    if-nez v0, :cond_2

    .line 312
    :cond_0
    new-instance v0, Ll/ܿ᩷᩵;

    const/16 v1, 0x200

    const/4 v2, 0x0

    .line 35
    invoke-direct {v0, v1, p0, v2}, Ll/ܿ᩷᩵;-><init>(ILl/ܳ᩷᩵;I)V

    .line 313
    invoke-virtual {v0, p1, p2, p3}, Ll/ܿ᩷᩵;->֫(Ll/᩹᩷᩵;J)V

    .line 314
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    .line 315
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 316
    array-length p3, p2

    invoke-virtual {p0}, Ll/ܳ᩷᩵;->ۘ()I

    move-result v0

    if-ge p3, v0, :cond_1

    .line 317
    iget-object p3, p0, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 318
    iget-object p1, p0, Ll/ܳ᩷᩵;->᩷:Ll/ܿ᩷᩵;

    array-length p3, p2

    invoke-virtual {p1, p2, v2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void

    .line 320
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "message full"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final ۘ()I
    .locals 2

    .line 267
    iget v0, p0, Ll/ܳ᩷᩵;->ܺ:I

    add-int/lit8 v0, v0, -0xc

    iget-object v1, p0, Ll/ܳ᩷᩵;->ۘ:Ll/ܿ᩷᩵;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Ll/ܳ᩷᩵;->᩷:Ll/ܿ᩷᩵;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Ll/ܳ᩷᩵;->ۢ:Ll/ܿ᩷᩵;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Ll/ܳ᩷᩵;->ۜ:Ll/ܿ᩷᩵;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ᩴ()[B
    .locals 9

    .line 371
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 372
    iget-object v2, p0, Ll/ܳ᩷᩵;->ۖ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 374
    new-instance v2, Ll/ܿ᩷᩵;

    .line 35
    iget v3, p0, Ll/ܳ᩷᩵;->ܺ:I

    const/4 v4, 0x0

    invoke-direct {v2, v3, p0, v4}, Ll/ܿ᩷᩵;-><init>(ILl/ܳ᩷᩵;I)V

    .line 375
    iget-boolean v3, p0, Ll/ᩳ᩷᩵;->ܳ:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ᩳ()I

    move-result v4

    :goto_0
    invoke-virtual {v2, v4}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 376
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 129
    iget-object v3, p0, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    .line 377
    invoke-virtual {v2, v4}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 151
    iget-object v4, p0, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v5

    .line 378
    invoke-virtual {v2, v5}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 165
    iget-object v5, p0, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v6

    .line 379
    invoke-virtual {v2, v6}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 179
    iget-object v6, p0, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v7

    .line 380
    invoke-virtual {v2, v7}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 381
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ᩴ᩷᩵;

    .line 164
    invoke-virtual {v7}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ll/ܿ᩷᩵;->֫(Ljava/lang/String;)V

    .line 165
    invoke-virtual {v7}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v8

    invoke-virtual {v8}, Ll/ۨۢ᩵;->ۧ()I

    move-result v8

    invoke-virtual {v2, v8}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 166
    invoke-virtual {v7}, Ll/ܰۜ᩵;->ܽ()Ll/ۛۢ᩵;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۛۢ᩵;->ۧ()I

    move-result v7

    invoke-virtual {v2, v7}, Ll/ܿ᩷᩵;->writeShort(I)V

    goto :goto_1

    .line 384
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹᩷᩵;

    .line 385
    invoke-virtual {v2, v4, v0, v1}, Ll/ܿ᩷᩵;->֫(Ll/᩹᩷᩵;J)V

    goto :goto_2

    .line 387
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹᩷᩵;

    .line 388
    invoke-virtual {v2, v4, v0, v1}, Ll/ܿ᩷᩵;->֫(Ll/᩹᩷᩵;J)V

    goto :goto_3

    .line 390
    :cond_3
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹᩷᩵;

    .line 391
    invoke-virtual {v2, v4, v0, v1}, Ll/ܿ᩷᩵;->֫(Ll/᩹᩷᩵;J)V

    goto :goto_4

    .line 393
    :cond_4
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 395
    :try_start_0
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public final ᩵()Ljava/net/InetSocketAddress;
    .locals 1

    .line 249
    iget-object v0, p0, Ll/ܳ᩷᩵;->ۡ:Ljava/net/InetSocketAddress;

    return-object v0
.end method
