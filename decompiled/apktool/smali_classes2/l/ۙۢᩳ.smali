.class public final Ll/ۙۢᩳ;
.super Ljava/lang/Object;
.source "G4YY"


# direct methods
.method public static ֫(Ll/ܶۢᩳ;II)I
    .locals 3

    .line 198
    iget-object v0, p0, Ll/ܶۢᩳ;->ۧ:Ljava/util/List;

    .line 199
    iget-object p0, p0, Ll/ܶۢᩳ;->ᩳ:Ljava/util/Set;

    :goto_0
    if-ltz p2, :cond_2

    .line 201
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟۬֡;

    .line 202
    invoke-static {v1}, Ll/ۙۢᩳ;->ܽ(Ll/۟۬֡;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 182
    move-object v2, v1

    check-cast v2, Ll/֫ۧۚ;

    invoke-interface {v2}, Ll/֫ۧۚ;->֫()I

    move-result v2

    if-ne v2, p1, :cond_0

    .line 186
    check-cast v1, Ll/᩻ۧۚ;

    invoke-interface {v1}, Ll/᩻ۧۚ;->ܶ()I

    move-result p0

    return p0

    .line 206
    :cond_0
    invoke-static {v1}, Ll/ۙۢᩳ;->֫(Ll/۟۬֡;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v1, p0}, Ll/ۙۢᩳ;->֫(Ll/۟۬֡;Ljava/util/Set;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ll/ۚܽۚ;)Ljava/lang/String;
    .locals 2

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    invoke-interface {p0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 217
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/util/Set;)Z
    .locals 2

    .line 221
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺֫ۚ;

    .line 222
    invoke-interface {v0}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget v1, v1, Ll/֨ۗ֡;->۬:I

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 164
    :pswitch_0
    check-cast v0, Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    .line 230
    check-cast v0, Ll/ۚܽۚ;

    .line 231
    invoke-interface {v0}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 164
    :pswitch_1
    check-cast v0, Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    .line 224
    check-cast v0, Ll/ᩴܽۚ;

    .line 225
    invoke-interface {v0}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 164
    :pswitch_2
    check-cast v0, Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    .line 236
    check-cast v0, Ll/᩸ܽۚ;

    .line 237
    invoke-interface {v0}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    :pswitch_3
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public static ֫(Ljava/util/List;Ljava/util/LinkedList;IILjava/util/HashSet;)Z
    .locals 8

    .line 263
    new-instance v0, Ll/᩶ۢᩳ;

    invoke-direct {v0, p2}, Ll/᩶ۢᩳ;-><init>(I)V

    .line 264
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ge p3, v1, :cond_10

    .line 265
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_5

    .line 269
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 270
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ۢᩳ;

    .line 271
    iget v5, v4, Ll/᩹ۢᩳ;->ܽ:I

    if-lt p3, v5, :cond_1

    iget v5, v4, Ll/᩹ۢᩳ;->֫:I

    if-ge p3, v5, :cond_1

    .line 272
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    if-nez v3, :cond_2

    .line 274
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 275
    :cond_2
    iget-object v4, v4, Ll/᩹ۢᩳ;->ۧ:[I

    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_1

    aget v7, v4, v6

    .line 276
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x1

    if-eqz v3, :cond_5

    .line 281
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 282
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {p0, p1, p2, v4, p4}, Ll/ۙۢᩳ;->֫(Ljava/util/List;Ljava/util/LinkedList;IILjava/util/HashSet;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_4

    .line 288
    :cond_5
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟۬֡;

    .line 289
    invoke-virtual {v0, v3}, Ll/᩶ۢᩳ;->֫(Ll/۟۬֡;)V

    .line 290
    iget-boolean v4, v0, Ll/᩶ۢᩳ;->֫:Z

    if-eqz v4, :cond_6

    goto/16 :goto_4

    .line 293
    :cond_6
    iget-boolean v4, v0, Ll/᩶ۢᩳ;->ܽ:Z

    if-eqz v4, :cond_7

    goto/16 :goto_5

    .line 296
    :cond_7
    invoke-static {v3}, Ll/ۙۢᩳ;->֫(Ll/۟۬֡;)Z

    move-result v4

    if-nez v4, :cond_8

    .line 297
    instance-of p3, v3, Ll/֫۫֡;

    if-eqz p3, :cond_10

    .line 251
    check-cast v3, Ll/֫۫֡;

    invoke-virtual {v3}, Ll/֫۫֡;->ۛ()Ll/ܿ۫֡;

    move-result-object p3

    invoke-virtual {p3}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object p3

    .line 298
    invoke-virtual {p3}, Ll/ܺ۫֡;->ܽ()I

    move-result p3

    .line 299
    invoke-static {p0, p1, p2, p3, p4}, Ll/ۙۢᩳ;->֫(Ljava/util/List;Ljava/util/LinkedList;IILjava/util/HashSet;)Z

    move-result p0

    return p0

    .line 303
    :cond_8
    sget-object v4, Ll/᩸ۢᩳ;->֫:[I

    invoke-virtual {v3}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v5

    iget-object v5, v5, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    if-eq v4, v1, :cond_e

    const/4 v5, 0x2

    if-eq v4, v5, :cond_e

    const/4 v5, 0x3

    if-eq v4, v5, :cond_9

    goto :goto_2

    .line 312
    :cond_9
    invoke-virtual {v3}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v4

    sget-object v5, Ll/֨ۗ֡;->᩹ܳ:Ll/֨ۗ֡;

    if-eq v4, v5, :cond_b

    invoke-virtual {v3}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v4

    sget-object v5, Ll/֨ۗ֡;->ܰ᩻:Ll/֨ۗ֡;

    if-ne v4, v5, :cond_a

    goto :goto_3

    :cond_a
    :goto_2
    add-int/lit8 p3, p3, 0x1

    goto/16 :goto_0

    :cond_b
    :goto_3
    add-int/2addr p3, v1

    .line 313
    invoke-static {p0, p1, p2, p3, p4}, Ll/ۙۢᩳ;->֫(Ljava/util/List;Ljava/util/LinkedList;IILjava/util/HashSet;)Z

    move-result p3

    if-eqz p3, :cond_c

    goto :goto_4

    .line 251
    :cond_c
    check-cast v3, Ll/֫۫֡;

    invoke-virtual {v3}, Ll/֫۫֡;->ۛ()Ll/ܿ۫֡;

    move-result-object p3

    invoke-virtual {p3}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object p3

    .line 315
    invoke-virtual {p3}, Ll/ܺ۫֡;->ᩳ()Ll/۟۬֡;

    move-result-object p3

    check-cast p3, Ll/ۧ۫֡;

    .line 317
    invoke-interface {p3}, Ll/ܿۧۚ;->ۙ()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_d
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۤ֡;

    .line 318
    invoke-virtual {v0}, Ll/ۨۤ֡;->ۧ()Ll/ܿ۫֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺ۫֡;->ܽ()I

    move-result v0

    .line 319
    invoke-static {p0, p1, p2, v0, p4}, Ll/ۙۢᩳ;->֫(Ljava/util/List;Ljava/util/LinkedList;IILjava/util/HashSet;)Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_4

    .line 251
    :cond_e
    check-cast v3, Ll/֫۫֡;

    invoke-virtual {v3}, Ll/֫۫֡;->ۛ()Ll/ܿ۫֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v0

    .line 307
    invoke-virtual {v0}, Ll/ܺ۫֡;->ܽ()I

    move-result v0

    add-int/2addr p3, v1

    .line 308
    invoke-static {p0, p1, p2, p3, p4}, Ll/ۙۢᩳ;->֫(Ljava/util/List;Ljava/util/LinkedList;IILjava/util/HashSet;)Z

    move-result p3

    if-nez p3, :cond_f

    .line 309
    :try_start_0
    invoke-static {p0, p1, p2, v0, p4}, Ll/ۙۢᩳ;->֫(Ljava/util/List;Ljava/util/LinkedList;IILjava/util/HashSet;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_10

    goto :goto_4

    :catchall_0
    move-exception p0

    throw p0

    :cond_f
    :goto_4
    return v1

    :cond_10
    :goto_5
    return v2
.end method

.method public static ֫(Ll/۟۬֡;)Z
    .locals 0

    .line 169
    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object p0

    iget p0, p0, Ll/֨ۗ֡;->᩶:I

    and-int/lit8 p0, p0, 0x4

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/۟۬֡;Ljava/util/Set;)Z
    .locals 1

    .line 173
    invoke-virtual {p0}, Ll/۟۬֡;->ۤ()Ll/ܺ۫֡;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܺ۫֡;->ܿ()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ۫֡;

    .line 174
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ll/۟۬֡;)Z
    .locals 1

    .line 156
    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object p0

    .line 157
    sget-object v0, Ll/֨ۗ֡;->ۚܿ:Ll/֨ۗ֡;

    if-eq p0, v0, :cond_1

    sget-object v0, Ll/֨ۗ֡;->֨ܿ:Ll/֨ۗ֡;

    if-eq p0, v0, :cond_1

    sget-object v0, Ll/֨ۗ֡;->ܶܿ:Ll/֨ۗ֡;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Ll/ܶۢᩳ;II)Z
    .locals 7

    .line 255
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 256
    iget-object v1, p0, Ll/ܶۢᩳ;->ܽ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ۫֡;

    .line 257
    new-instance v3, Ll/᩹ۢᩳ;

    .line 336
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 337
    iget-object v4, v2, Ll/ܽ۫֡;->ܽ:Ll/ܿ۫֡;

    invoke-virtual {v4}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܺ۫֡;->ܽ()I

    move-result v4

    iput v4, v3, Ll/᩹ۢᩳ;->ܽ:I

    .line 338
    iget-object v4, v2, Ll/ܽ۫֡;->֫:Ll/ܿ۫֡;

    invoke-virtual {v4}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܺ۫֡;->ܽ()I

    move-result v4

    iput v4, v3, Ll/᩹ۢᩳ;->֫:I

    .line 94
    iget-object v2, v2, Ll/ܽ۫֡;->ۧ:Ll/ܰ۬֡;

    invoke-static {v2}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v2

    .line 340
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [I

    iput-object v4, v3, Ll/᩹ۢᩳ;->ۧ:[I

    const/4 v4, 0x0

    .line 341
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_0

    .line 342
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰ۬֡;

    .line 343
    iget-object v6, v3, Ll/᩹ۢᩳ;->ۧ:[I

    invoke-virtual {v5}, Ll/ܰ۬֡;->֫()Ll/ܿ۫֡;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܺ۫֡;->ܽ()I

    move-result v5

    aput v5, v6, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 257
    :cond_0
    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 259
    :cond_1
    iget-object p0, p0, Ll/ܶۢᩳ;->ۧ:Ljava/util/List;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-static {p0, v0, p1, p2, v1}, Ll/ۙۢᩳ;->֫(Ljava/util/List;Ljava/util/LinkedList;IILjava/util/HashSet;)Z

    move-result p0

    return p0
.end method

.method public static ܽ(Ll/۟۬֡;)Z
    .locals 1

    .line 149
    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object p0

    .line 150
    sget-object v0, Ll/֨ۗ֡;->᩸ܿ:Ll/֨ۗ֡;

    if-eq p0, v0, :cond_1

    sget-object v0, Ll/֨ۗ֡;->᩹ܿ:Ll/֨ۗ֡;

    if-eq p0, v0, :cond_1

    sget-object v0, Ll/֨ۗ֡;->᩶ܿ:Ll/֨ۗ֡;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ᩳ(Ll/۟۬֡;)Z
    .locals 1

    .line 93
    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object p0

    .line 94
    sget-object v0, Ll/֨ۗ֡;->ۗܿ:Ll/֨ۗ֡;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
