.class public final Ll/᩵ܳۡ;
.super Ljava/lang/Object;
.source "YBJ2"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 339
    iget-object v0, p0, Ll/᩵ܳۡ;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵ܳۡ;->֫:Ljava/lang/String;

    if-nez v0, :cond_3

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 371
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 372
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 373
    invoke-static {v2}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v3

    if-nez v3, :cond_1

    const/16 v3, 0x3a

    if-eq v2, v3, :cond_1

    const/16 v3, 0x2e

    if-eq v2, v3, :cond_1

    const/16 v3, 0x2d

    if-eq v2, v3, :cond_1

    const/16 v3, 0x5f

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, -0x1

    .line 341
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x2

    if-le v2, v3, :cond_4

    if-le v1, v0, :cond_4

    .line 342
    iput-object p1, p0, Ll/᩵ܳۡ;->ۧ:Ljava/lang/String;

    .line 343
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ܳۡ;->֫:Ljava/lang/String;

    .line 349
    :cond_3
    iget-object p1, p0, Ll/᩵ܳۡ;->֫:Ljava/lang/String;

    return-object p1

    .line 345
    :cond_4
    new-instance v0, Ll/ܺܳۡ;

    const-string v1, "No element name for the tag:\n\t"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 73
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 345
    throw v0
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ۖܳۡ;
    .locals 14

    .line 360
    new-instance v0, Ll/ۖܳۡ;

    invoke-direct {v0}, Ll/ۖܳۡ;-><init>()V

    .line 361
    invoke-virtual {p0, p1}, Ll/᩵ܳۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۖܳۡ;->֫(Ljava/lang/String;)V

    .line 215
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 217
    new-instance v2, Ljava/text/StringCharacterIterator;

    .line 218
    invoke-virtual {p0, p1}, Ll/᩵ܳۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x2

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/text/StringCharacterIterator;-><init>(Ljava/lang/String;)V

    .line 221
    new-instance v3, Ll/ᩴܳۡ;

    .line 171
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 222
    invoke-virtual {v3}, Ll/ᩴܳۡ;->᩻()V

    .line 227
    invoke-virtual {v2}, Ljava/text/StringCharacterIterator;->first()C

    move-result v4

    const/16 v5, 0x22

    const/4 v6, 0x0

    const/16 v7, 0x22

    move-object v7, v6

    const/16 v8, 0x22

    .line 228
    :goto_0
    invoke-virtual {v2}, Ljava/text/StringCharacterIterator;->getIndex()I

    move-result v9

    invoke-virtual {v2}, Ljava/text/StringCharacterIterator;->getEndIndex()I

    move-result v10

    const/16 v11, 0x3e

    const/16 v12, 0x2f

    if-ge v9, v10, :cond_10

    const-string v9, "\' when parsing:\n\t"

    const-string v10, "Unexpected \'"

    if-eq v4, v5, :cond_b

    const/16 v13, 0x27

    if-eq v4, v13, :cond_b

    if-eq v4, v12, :cond_7

    const/16 v12, 0x3d

    if-eq v4, v12, :cond_4

    if-eq v4, v11, :cond_7

    .line 302
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ܽ()Z

    move-result v11

    if-eqz v11, :cond_0

    .line 304
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 306
    :cond_0
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ܿ()Z

    move-result v11

    if-eqz v11, :cond_2

    .line 307
    invoke-static {v4}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v11

    if-eqz v11, :cond_1

    goto/16 :goto_1

    .line 308
    :cond_1
    new-instance v0, Ll/ܺܳۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 73
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 308
    throw v0

    .line 312
    :cond_2
    invoke-static {v4}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v9

    if-nez v9, :cond_e

    .line 313
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ۧ()Z

    move-result v9

    if-eqz v9, :cond_3

    .line 315
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ܳ()V

    .line 316
    new-instance v6, Ljava/lang/StringBuilder;

    const/16 v9, 0xff

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 317
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 318
    :cond_3
    invoke-virtual {v3}, Ll/ᩴܳۡ;->֫()Z

    move-result v9

    if-eqz v9, :cond_e

    .line 319
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 267
    :cond_4
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ܽ()Z

    move-result v11

    if-eqz v11, :cond_5

    .line 270
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 272
    :cond_5
    invoke-virtual {v3}, Ll/ᩴܳۡ;->֫()Z

    move-result v11

    if-eqz v11, :cond_6

    .line 275
    invoke-virtual {v3}, Ll/ᩴܳۡ;->᩷()V

    goto/16 :goto_1

    .line 279
    :cond_6
    new-instance v0, Ll/ܺܳۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 73
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 279
    throw v0

    .line 286
    :cond_7
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ܽ()Z

    move-result v11

    if-eqz v11, :cond_8

    .line 288
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 289
    :cond_8
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ۧ()Z

    move-result v11

    if-eqz v11, :cond_9

    .line 290
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ۢ()V

    goto :goto_1

    .line 291
    :cond_9
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ܿ()Z

    move-result v11

    if-eqz v11, :cond_a

    goto :goto_1

    .line 295
    :cond_a
    new-instance v0, Ll/ܺܳۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 73
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 295
    throw v0

    .line 235
    :cond_b
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ᩳ()Z

    move-result v11

    if-eqz v11, :cond_c

    .line 239
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ۜ()V

    .line 240
    new-instance v7, Ljava/lang/StringBuilder;

    const/16 v8, 0x400

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    move v8, v4

    goto :goto_1

    .line 242
    :cond_c
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ܽ()Z

    move-result v11

    if-eqz v11, :cond_d

    if-ne v8, v4, :cond_d

    .line 245
    new-instance v4, Ll/ۡܳۡ;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 246
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v4, v9, v10, v8}, Ll/ۡܳۡ;-><init>(Ljava/lang/String;Ljava/lang/String;C)V

    .line 248
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    invoke-virtual {v3}, Ll/ᩴܳۡ;->᩻()V

    goto :goto_1

    .line 253
    :cond_d
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ܽ()Z

    move-result v11

    if-eqz v11, :cond_f

    if-eq v8, v4, :cond_f

    .line 256
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 326
    :cond_e
    :goto_1
    invoke-virtual {v2}, Ljava/text/StringCharacterIterator;->next()C

    move-result v4

    goto/16 :goto_0

    .line 260
    :cond_f
    new-instance v0, Ll/ܺܳۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 73
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 260
    throw v0

    .line 328
    :cond_10
    invoke-virtual {v3}, Ll/ᩴܳۡ;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_12

    .line 362
    invoke-virtual {v0, v1}, Ll/ۖܳۡ;->֫(Ljava/util/ArrayList;)V

    .line 353
    invoke-virtual {p1, v11}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    if-ne p1, v12, :cond_11

    goto :goto_2

    :cond_11
    const/4 v2, 0x0

    .line 363
    :goto_2
    invoke-virtual {v0, v2}, Ll/ۖܳۡ;->֫(Z)V

    return-object v0

    .line 329
    :cond_12
    new-instance p1, Ll/ܺܳۡ;

    const-string v0, "Element did not complete normally."

    .line 73
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 329
    throw p1
.end method
