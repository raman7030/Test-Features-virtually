.class public final Ll/ܶᩳᩳ;
.super Ljava/lang/Object;
.source "MB8H"


# direct methods
.method public static ֫(Ljava/nio/ByteBuffer;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .line 65
    :try_start_0
    new-instance v0, Ll/᩷ܿᩳ;

    invoke-direct {v0, p0}, Ll/᩷ܿᩳ;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0}, Ll/᩷ܿᩳ;->֫()Ll/ܿܿᩳ;

    move-result-object p0
    :try_end_0
    .catch Ll/ܳܿᩳ; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    .line 72
    invoke-static {p0, p1}, Ll/ܶᩳᩳ;->ᩳ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 70
    :cond_0
    new-instance p0, Ll/᩹ᩳᩳ;

    const-string p1, "Empty input"

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 70
    throw p0

    :catch_0
    move-exception p0

    .line 67
    new-instance p1, Ll/᩹ᩳᩳ;

    const-string v0, "Failed to decode top-level data value"

    .line 30
    invoke-direct {p1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܶᩳᩳ;->ܿ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܿܿᩳ;Ljava/lang/Class;Z)Ljava/lang/Object;
    .locals 9

    .line 201
    invoke-static {p1}, Ll/ܶᩳᩳ;->֫(Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v0

    .line 202
    new-instance v1, Ll/᩵ᩳᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 205
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    const-string v3, "."

    const/4 v4, 0x0

    if-le v1, v2, :cond_2

    .line 207
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v4

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚᩳᩳ;

    if-eqz v2, :cond_1

    .line 209
    invoke-virtual {v2}, Ll/ۚᩳᩳ;->֫()Ll/ۨᩳᩳ;

    move-result-object v6

    invoke-interface {v6}, Ll/ۨᩳᩳ;->index()I

    move-result v6

    invoke-virtual {v5}, Ll/ۚᩳᩳ;->֫()Ll/ۨᩳᩳ;

    move-result-object v7

    invoke-interface {v7}, Ll/ۨᩳᩳ;->index()I

    move-result v7

    if-eq v6, v7, :cond_0

    goto :goto_1

    .line 210
    :cond_0
    new-instance p0, Ll/᩹ᩳᩳ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Fields have the same index: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    invoke-virtual {v2}, Ll/ۚᩳᩳ;->ᩳ()Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " and ."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    invoke-virtual {v5}, Ll/ۚᩳᩳ;->ᩳ()Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 213
    throw p0

    :cond_1
    :goto_1
    move-object v2, v5

    goto :goto_0

    .line 222
    :cond_2
    :try_start_0
    invoke-virtual {p1, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 229
    invoke-virtual {p0}, Ll/ܿܿᩳ;->֫()Ll/᩷ܿᩳ;

    move-result-object v2

    const/4 v4, 0x0

    .line 230
    :cond_3
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_7

    if-eqz p2, :cond_4

    if-nez v4, :cond_4

    move-object v5, p0

    goto :goto_3

    .line 238
    :cond_4
    :try_start_1
    invoke-virtual {v2}, Ll/᩷ܿᩳ;->֫()Ll/ܿܿᩳ;

    move-result-object v5
    :try_end_1
    .catch Ll/ܳܿᩳ; {:try_start_1 .. :try_end_1} :catch_2

    :goto_3
    if-nez v5, :cond_5

    goto :goto_6

    :cond_5
    move v6, v4

    .line 247
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v6, v7, :cond_3

    .line 248
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۚᩳᩳ;

    .line 250
    :try_start_2
    invoke-virtual {v7}, Ll/ۚᩳᩳ;->ܿ()Z

    move-result v8
    :try_end_2
    .catch Ll/᩹ᩳᩳ; {:try_start_2 .. :try_end_2} :catch_1

    if-eqz v8, :cond_6

    .line 254
    :try_start_3
    invoke-virtual {v7, v5, v1}, Ll/ۚᩳᩳ;->֫(Ll/ܿܿᩳ;Ljava/lang/Object;)V
    :try_end_3
    .catch Ll/֨ᩳᩳ; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ll/᩹ᩳᩳ; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_5

    :catch_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 265
    :cond_6
    :try_start_4
    invoke-virtual {v7, v5, v1}, Ll/ۚᩳᩳ;->֫(Ll/ܿܿᩳ;Ljava/lang/Object;)V
    :try_end_4
    .catch Ll/᩹ᩳᩳ; {:try_start_4 .. :try_end_4} :catch_1

    :goto_5
    add-int/lit8 v4, v6, 0x1

    goto :goto_2

    :catch_1
    move-exception p0

    .line 270
    new-instance p2, Ll/᩹ᩳᩳ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to parse "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    invoke-virtual {v7}, Ll/ۚᩳᩳ;->ᩳ()Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-direct {p2, p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 272
    throw p2

    :catch_2
    move-exception p0

    .line 241
    new-instance p1, Ll/᩹ᩳᩳ;

    const-string p2, "Malformed data value"

    .line 30
    invoke-direct {p1, p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 241
    throw p1

    :cond_7
    :goto_6
    return-object v1

    :catch_3
    move-exception p0

    .line 224
    new-instance p2, Ll/᩹ᩳᩳ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Failed to instantiate "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-direct {p2, p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 224
    throw p2
.end method

.method public static bridge synthetic ֫(Ljava/nio/ByteBuffer;)Ljava/math/BigInteger;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ܶᩳᩳ;->ܳ(Ljava/nio/ByteBuffer;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 9

    .line 512
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .line 513
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 514
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    .line 515
    const-class v5, Ll/ۨᩳᩳ;

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    check-cast v6, Ll/ۨᩳᩳ;

    if-nez v6, :cond_0

    goto :goto_1

    .line 519
    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v7

    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v7

    const-string v8, "."

    if-nez v7, :cond_1

    .line 527
    :try_start_0
    new-instance v5, Ll/ۚᩳᩳ;

    invoke-direct {v5, v4, v6}, Ll/ۚᩳᩳ;-><init>(Ljava/lang/reflect/Field;Ll/ۨᩳᩳ;)V
    :try_end_0
    .catch Ll/᩹ᩳᩳ; {:try_start_0 .. :try_end_0} :catch_0

    .line 534
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 529
    new-instance v1, Ll/᩹ᩳᩳ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid ASN.1 annotation on "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 531
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 30
    invoke-direct {v1, p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 531
    throw v1

    .line 520
    :cond_1
    new-instance v0, Ll/᩹ᩳᩳ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 521
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " used on a static field: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 522
    throw v0

    :cond_2
    return-object v1
.end method

.method public static ۧ(Ljava/nio/ByteBuffer;)I
    .locals 3

    .line 491
    invoke-static {p0}, Ll/ܶᩳᩳ;->ܳ(Ljava/nio/ByteBuffer;)Ljava/math/BigInteger;

    move-result-object p0

    .line 492
    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    const/16 v1, 0x1f

    if-gt v0, v1, :cond_0

    .line 493
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    move-result p0

    return p0

    .line 495
    :cond_0
    new-instance v0, Ll/᩹ᩳᩳ;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "INTEGER cannot be represented as int: %1$d (0x%1$x)"

    .line 496
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 496
    throw v0
.end method

.method public static ۧ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 196
    invoke-static {p0, p1, v0}, Ll/ܶᩳᩳ;->֫(Ll/ܿܿᩳ;Ljava/lang/Class;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ܳ(Ljava/nio/ByteBuffer;)Ljava/math/BigInteger;
    .locals 2

    .line 484
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    .line 485
    sget-object p0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    return-object p0

    .line 487
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    .line 30
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    new-array v1, v1, [B

    .line 31
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 487
    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>([B)V

    return-object v0
.end method

.method public static ܳ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 3

    .line 286
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 287
    invoke-virtual {p0}, Ll/ܿܿᩳ;->֫()Ll/᩷ܿᩳ;

    move-result-object p0

    .line 291
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ll/᩷ܿᩳ;->֫()Ll/ܿܿᩳ;

    move-result-object v1
    :try_end_0
    .catch Ll/ܳܿᩳ; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_0

    return-object v0

    .line 299
    :cond_0
    const-class v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 300
    invoke-virtual {v1}, Ll/ܿܿᩳ;->ܽ()Ljava/nio/ByteBuffer;

    move-result-object v1

    goto :goto_1

    .line 301
    :cond_1
    const-class v2, Ll/᩺ᩳᩳ;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 302
    new-instance v2, Ll/᩺ᩳᩳ;

    invoke-virtual {v1}, Ll/ܿܿᩳ;->ۧ()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-direct {v2, v1}, Ll/᩺ᩳᩳ;-><init>(Ljava/nio/ByteBuffer;)V

    move-object v1, v2

    goto :goto_1

    .line 304
    :cond_2
    invoke-static {v1, p1}, Ll/ܶᩳᩳ;->ᩳ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    .line 306
    :goto_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p0

    .line 293
    new-instance p1, Ll/᩹ᩳᩳ;

    const-string v0, "Malformed data value"

    .line 30
    invoke-direct {p1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 293
    throw p1
.end method

.method public static ܽ(Ljava/nio/ByteBuffer;)J
    .locals 3

    .line 501
    invoke-static {p0}, Ll/ܶᩳᩳ;->ܳ(Ljava/nio/ByteBuffer;)Ljava/math/BigInteger;

    move-result-object p0

    .line 502
    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    const/16 v1, 0x3f

    if-gt v0, v1, :cond_0

    .line 503
    invoke-virtual {p0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 505
    :cond_0
    new-instance v0, Ll/᩹ᩳᩳ;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "INTEGER cannot be represented as long: %1$d (0x%1$x)"

    .line 506
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 506
    throw v0
.end method

.method public static bridge synthetic ܽ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܶᩳᩳ;->ܳ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ(Ljava/nio/ByteBuffer;)J
    .locals 5

    .line 463
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    .line 467
    :cond_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_2

    const-wide v3, 0xffffffffffffffL

    cmp-long v0, v1, v3

    if-gtz v0, :cond_1

    .line 471
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    const/4 v3, 0x7

    shl-long/2addr v1, v3

    and-int/lit8 v3, v0, 0x7f

    int-to-long v3, v3

    or-long/2addr v1, v3

    and-int/lit16 v0, v0, 0x80

    if-nez v0, :cond_0

    return-wide v1

    .line 469
    :cond_1
    new-instance p0, Ll/᩹ᩳᩳ;

    const-string v0, "Base-128 number too large"

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 469
    throw p0

    .line 478
    :cond_2
    new-instance p0, Ll/᩹ᩳᩳ;

    const-string v0, "Truncated base-128 encoded input: missing terminating byte, with highest bit not set"

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 478
    throw p0
.end method

.method public static ܿ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 9

    .line 147
    invoke-static {p1}, Ll/ܶᩳᩳ;->֫(Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v0

    .line 148
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x0

    .line 155
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_3

    .line 156
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚᩳᩳ;

    .line 157
    invoke-virtual {v2}, Ll/ۚᩳᩳ;->ܽ()I

    move-result v3

    .line 158
    invoke-virtual {v2}, Ll/ۚᩳᩳ;->ۧ()I

    move-result v4

    add-int/lit8 v1, v1, 0x1

    move v5, v1

    .line 159
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_0

    .line 160
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۚᩳᩳ;

    .line 161
    invoke-virtual {v6}, Ll/ۚᩳᩳ;->ܽ()I

    move-result v7

    .line 162
    invoke-virtual {v6}, Ll/ۚᩳᩳ;->ۧ()I

    move-result v8

    if-ne v3, v7, :cond_2

    if-eq v4, v8, :cond_1

    goto :goto_1

    .line 164
    :cond_1
    new-instance p0, Ll/᩹ᩳᩳ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CHOICE fields are indistinguishable because they have the same tag class and number: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    invoke-virtual {v2}, Ll/ۚᩳᩳ;->ᩳ()Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " and ."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    invoke-virtual {v6}, Ll/ۚᩳᩳ;->ᩳ()Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 168
    throw p0

    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    .line 176
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 181
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚᩳᩳ;

    .line 183
    :try_start_1
    invoke-virtual {v2, p0, v1}, Ll/ۚᩳᩳ;->֫(Ll/ܿܿᩳ;Ljava/lang/Object;)V
    :try_end_1
    .catch Ll/֨ᩳᩳ; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :catch_0
    nop

    goto :goto_2

    .line 190
    :cond_4
    new-instance p0, Ll/᩹ᩳᩳ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No options of CHOICE "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " matched"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 191
    throw p0

    :catch_1
    move-exception p0

    .line 178
    new-instance v0, Ll/᩹ᩳᩳ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Failed to instantiate "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-direct {v0, p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 178
    throw v0

    .line 149
    :cond_5
    new-instance p0, Ll/᩹ᩳᩳ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No fields annotated with "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Ll/ۨᩳᩳ;

    .line 150
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in CHOICE class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 151
    throw p0
.end method

.method public static ᩳ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 6

    if-eqz p1, :cond_7

    .line 313
    invoke-static {p1}, Ll/ᩳܿᩳ;->֫(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ll/᩸ᩳᩳ;

    if-eqz v0, :cond_6

    .line 320
    sget-object v1, Ll/֡ᩳᩳ;->֫:[I

    invoke-interface {v0}, Ll/᩸ᩳᩳ;->type()Ll/֫ܿᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v1, v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 326
    :cond_0
    new-instance p0, Ll/᩹ᩳᩳ;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported ASN.1 container annotation type: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 328
    invoke-interface {v0}, Ll/᩸ᩳᩳ;->type()Ll/֫ܿᩳ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 328
    throw p0

    .line 324
    :cond_1
    :goto_0
    invoke-interface {v0}, Ll/᩸ᩳᩳ;->type()Ll/֫ܿᩳ;

    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    if-eq v1, v5, :cond_5

    if-eq v1, v4, :cond_3

    if-ne v1, v3, :cond_2

    .line 139
    invoke-static {p0, p1, v5}, Ll/ܶᩳᩳ;->֫(Ll/ܿܿᩳ;Ljava/lang/Class;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 141
    :cond_2
    new-instance p0, Ll/᩹ᩳᩳ;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Parsing container "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " not supported"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 141
    throw p0

    .line 126
    :cond_3
    invoke-static {v0}, Ll/ۜܿᩳ;->֫(Ll/֫ܿᩳ;)I

    move-result v0

    .line 127
    invoke-virtual {p0}, Ll/ܿܿᩳ;->ᩳ()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_4

    .line 128
    invoke-virtual {p0}, Ll/ܿܿᩳ;->ܿ()I

    move-result v1

    if-ne v1, v0, :cond_4

    .line 196
    invoke-static {p0, p1, v2}, Ll/ܶᩳᩳ;->֫(Ll/ܿܿᩳ;Ljava/lang/Class;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 129
    :cond_4
    new-instance v1, Ll/֨ᩳᩳ;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unexpected data value read as "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Expected "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    invoke-static {v2, v0}, Ll/ۜܿᩳ;->֫(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", but read: "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    invoke-virtual {p0}, Ll/ܿܿᩳ;->ᩳ()I

    move-result p1

    invoke-virtual {p0}, Ll/ܿܿᩳ;->ܿ()I

    move-result p0

    .line 133
    invoke-static {p1, p0}, Ll/ۜܿᩳ;->֫(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 26
    invoke-direct {v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 133
    throw v1

    .line 122
    :cond_5
    invoke-static {p0, p1}, Ll/ܶᩳᩳ;->ܿ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 315
    :cond_6
    new-instance p0, Ll/᩹ᩳᩳ;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is not annotated with "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    const-class p1, Ll/᩸ᩳᩳ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 317
    throw p0

    .line 116
    :cond_7
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "containerClass == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ᩳ(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 6

    .line 441
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 446
    invoke-static {p0}, Ll/ܶᩳᩳ;->ܿ(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    const-wide/16 v2, 0x28

    .line 447
    div-long v2, v0, v2

    const-wide/16 v4, 0x2

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    mul-int/lit8 v2, v3, 0x28

    int-to-long v4, v2

    sub-long/2addr v0, v4

    .line 449
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v3, v3

    .line 450
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 451
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    :goto_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 455
    invoke-static {p0}, Ll/ܶᩳᩳ;->ܿ(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    .line 456
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 459
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 442
    :cond_1
    new-instance p0, Ll/᩹ᩳᩳ;

    const-string v0, "Empty OBJECT IDENTIFIER"

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 442
    throw p0
.end method

.method public static ᩻(Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;
    .locals 2

    .line 100
    :try_start_0
    new-instance v0, Ll/᩷ܿᩳ;

    invoke-direct {v0, p0}, Ll/᩷ܿᩳ;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0}, Ll/᩷ܿᩳ;->֫()Ll/ܿܿᩳ;

    move-result-object p0
    :try_end_0
    .catch Ll/ܳܿᩳ; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    .line 107
    const-class v0, Ll/ۨܿᩳ;

    invoke-static {p0, v0}, Ll/ܶᩳᩳ;->ܳ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0

    .line 105
    :cond_0
    new-instance p0, Ll/᩹ᩳᩳ;

    const-string v0, "Empty input"

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 105
    throw p0

    :catch_0
    move-exception p0

    .line 102
    new-instance v0, Ll/᩹ᩳᩳ;

    const-string v1, "Failed to decode top-level data value"

    .line 30
    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    throw v0
.end method
