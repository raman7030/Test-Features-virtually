.class public final Ll/ۤᩳᩳ;
.super Ljava/lang/Object;
.source "8B7K"


# direct methods
.method public static bridge synthetic ֫(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۤᩳᩳ;->ۧ(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(I)[B
    .locals 2

    int-to-long v0, p0

    .line 246
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p0

    .line 252
    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [[B

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x2

    .line 250
    invoke-static {v1, v1, p0, v0}, Ll/ۤᩳᩳ;->ۧ(IZI[[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(IZI[[B)[B
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/ۤᩳᩳ;->ۧ(IZI[[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫(J)[B
    .locals 1

    .line 246
    invoke-static {p0, p1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p0

    .line 252
    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    const/4 p1, 0x1

    new-array p1, p1, [[B

    const/4 v0, 0x0

    aput-object p0, p1, v0

    const/4 p0, 0x2

    .line 250
    invoke-static {v0, v0, p0, p1}, Ll/ۤᩳᩳ;->ۧ(IZI[[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ljava/lang/Object;)[B
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۤᩳᩳ;->ܿ(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Object;Z)[B
    .locals 8

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 111
    invoke-static {p0}, Ll/ۤᩳᩳ;->ᩳ(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    .line 112
    new-instance v1, Ll/᩶ᩳᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 114
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const-string v2, "."

    const/4 v3, 0x1

    if-le v1, v3, :cond_2

    .line 116
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗᩳᩳ;

    if-eqz v4, :cond_1

    .line 118
    invoke-virtual {v4}, Ll/ۗᩳᩳ;->֫()Ll/ۨᩳᩳ;

    move-result-object v6

    invoke-interface {v6}, Ll/ۨᩳᩳ;->index()I

    move-result v6

    invoke-virtual {v5}, Ll/ۗᩳᩳ;->֫()Ll/ۨᩳᩳ;

    move-result-object v7

    invoke-interface {v7}, Ll/ۨᩳᩳ;->index()I

    move-result v7

    if-eq v6, v7, :cond_0

    goto :goto_1

    .line 119
    :cond_0
    new-instance p0, Ll/ۛᩳᩳ;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Fields have the same index: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    invoke-virtual {v4}, Ll/ۗᩳᩳ;->ۧ()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " and ."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    invoke-virtual {v5}, Ll/ۗᩳᩳ;->ۧ()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 122
    throw p0

    :cond_1
    :goto_1
    move-object v4, v5

    goto :goto_0

    .line 128
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗᩳᩳ;

    .line 133
    :try_start_0
    invoke-virtual {v6}, Ll/ۗᩳᩳ;->ܽ()[B

    move-result-object v6
    :try_end_0
    .catch Ll/ۛᩳᩳ; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v6, :cond_3

    .line 141
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    array-length v6, v6

    add-int/2addr v5, v6

    goto :goto_2

    :catch_0
    move-exception p0

    .line 135
    new-instance p1, Ll/ۛᩳᩳ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Failed to encode "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    invoke-virtual {v6}, Ll/ۗᩳᩳ;->ۧ()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-direct {p1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 137
    throw p1

    :cond_4
    if-eqz p1, :cond_6

    .line 147
    new-array p0, v5, [B

    .line 149
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 150
    array-length v2, v1

    invoke-static {v1, v4, p0, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 151
    array-length v1, v1

    add-int/2addr v0, v1

    goto :goto_3

    :cond_5
    return-object p0

    :cond_6
    new-array p0, v4, [[B

    .line 157
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [[B

    const/16 p1, 0x10

    .line 155
    invoke-static {v4, v3, p1, p0}, Ll/ۤᩳᩳ;->ۧ(IZI[[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 10

    const-string v0, "Node #"

    .line 268
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const-string v2, "\\."

    .line 269
    invoke-virtual {p0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 270
    array-length v3, v2

    const/4 v4, 0x2

    if-lt v3, v4, :cond_8

    const/4 p0, 0x0

    .line 276
    :try_start_0
    aget-object v3, v2, p0

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v5, 0x6

    if-gt v3, v5, :cond_7

    if-ltz v3, :cond_7

    const/4 v6, 0x1

    .line 286
    :try_start_1
    aget-object v7, v2, v6

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    const/16 v8, 0x28

    if-ge v7, v8, :cond_6

    if-ltz v7, :cond_6

    mul-int/lit8 v8, v3, 0x28

    add-int/2addr v8, v7

    const/16 v9, 0xff

    if-gt v8, v9, :cond_5

    .line 299
    invoke-virtual {v1, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 300
    :goto_0
    array-length v3, v2

    if-ge v4, v3, :cond_4

    .line 301
    aget-object v3, v2, v4

    .line 304
    :try_start_2
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    if-ltz v3, :cond_3

    const/16 v7, 0x7f

    if-gt v3, v7, :cond_0

    .line 312
    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_0
    const/16 v8, 0x4000

    if-ge v3, v8, :cond_1

    shr-int/lit8 v7, v3, 0x7

    or-int/lit16 v7, v7, 0x80

    .line 316
    invoke-virtual {v1, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V

    and-int/lit8 v3, v3, 0x7f

    .line 317
    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_1
    const/high16 v8, 0x200000

    if-ge v3, v8, :cond_2

    shr-int/lit8 v8, v3, 0xe

    or-int/lit16 v8, v8, 0x80

    .line 321
    invoke-virtual {v1, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    shr-int/lit8 v8, v3, 0x7

    and-int/2addr v7, v8

    or-int/lit16 v7, v7, 0x80

    .line 322
    invoke-virtual {v1, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V

    and-int/lit8 v3, v3, 0x7f

    .line 323
    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 326
    :cond_2
    new-instance p0, Ll/ۛᩳᩳ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/2addr v4, v6

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " too large: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 326
    throw p0

    .line 309
    :cond_3
    new-instance p0, Ll/ۛᩳᩳ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid value for node #"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/2addr v4, v6

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 309
    throw p0

    .line 306
    :catch_0
    new-instance p0, Ll/ۛᩳᩳ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/2addr v4, v6

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " not numeric: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 306
    throw p0

    .line 331
    :cond_4
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    new-array v1, v6, [[B

    aput-object v0, v1, p0

    .line 329
    invoke-static {p0, p0, v5, v1}, Ll/ۤᩳᩳ;->ۧ(IZI[[B)[B

    move-result-object p0

    return-object p0

    .line 295
    :cond_5
    new-instance p0, Ll/ۛᩳᩳ;

    const-string v0, "First two nodes out of range: "

    const-string v1, "."

    .line 0
    invoke-static {v0, v3, v7, v1}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 295
    throw p0

    .line 291
    :cond_6
    new-instance p0, Ll/ۛᩳᩳ;

    const-string v0, "Invalid value for node #2: "

    .line 0
    invoke-static {v7, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 291
    throw p0

    .line 288
    :catch_1
    new-instance p0, Ll/ۛᩳᩳ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Node #2 not numeric: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v1, v2, v6

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 288
    throw p0

    .line 281
    :cond_7
    new-instance p0, Ll/ۛᩳᩳ;

    const-string v0, "Invalid value for node #1: "

    .line 0
    invoke-static {v3, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 281
    throw p0

    .line 278
    :catch_2
    new-instance v0, Ll/ۛᩳᩳ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Node #1 not numeric: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object p0, v2, p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 278
    throw v0

    .line 271
    :cond_8
    new-instance v0, Ll/ۛᩳᩳ;

    const-string v1, "OBJECT IDENTIFIER must contain at least two nodes: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 271
    throw v0
.end method

.method public static ֫(Ljava/math/BigInteger;)[B
    .locals 2

    .line 252
    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [[B

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x2

    .line 250
    invoke-static {v1, v1, p0, v0}, Ll/ۤᩳᩳ;->ۧ(IZI[[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/Collection;Ll/֫ܿᩳ;)[B
    .locals 1

    const/4 v0, 0x0

    .line 166
    invoke-static {p0, p1, v0}, Ll/ۤᩳᩳ;->֫(Ljava/util/Collection;Ll/֫ܿᩳ;Z)[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/Collection;Ll/֫ܿᩳ;Z)[B
    .locals 3

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 172
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    .line 173
    invoke-static {v1, p1, v2}, Ll/۫ᩳᩳ;->֫(Ljava/lang/Object;Ll/֫ܿᩳ;Ll/֫ܿᩳ;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    if-eqz p2, :cond_2

    .line 177
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-le p1, p0, :cond_1

    .line 178
    invoke-static {}, Ll/۬ᩳᩳ;->֫()Ll/۬ᩳᩳ;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    const/16 p1, 0x11

    goto :goto_1

    :cond_2
    const/16 p1, 0x10

    :goto_1
    const/4 p2, 0x0

    new-array v1, p2, [[B

    .line 186
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[B

    .line 184
    invoke-static {p2, p0, p1, v0}, Ll/ۤᩳᩳ;->ۧ(IZI[[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Z)[B
    .locals 3

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    if-nez p0, :cond_0

    aput-byte v2, v1, v2

    goto :goto_0

    :cond_0
    aput-byte v0, v1, v2

    :goto_0
    new-array p0, v0, [[B

    aput-object v1, p0, v2

    .line 264
    invoke-static {v2, v2, v0, p0}, Ll/ۤᩳᩳ;->ۧ(IZI[[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 337
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 339
    new-instance v1, Ll/ۛᩳᩳ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to read "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 30
    invoke-direct {v1, p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 340
    throw v1
.end method

.method public static varargs ۧ(IZI[[B)[B
    .locals 9

    const/16 v0, 0x1f

    if-ge p2, v0, :cond_7

    const/4 v0, 0x6

    shl-int/2addr p0, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/16 p1, 0x20

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p0, p1

    or-int/2addr p0, p2

    int-to-byte p0, p0

    .line 446
    array-length p1, p3

    const/4 p2, 0x0

    const/4 v2, 0x0

    :goto_1
    if-ge p2, p1, :cond_1

    aget-object v3, p3, p2

    .line 447
    array-length v3, v3

    add-int/2addr v2, v3

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    const/16 p1, 0x80

    const/4 p2, 0x2

    const/4 v3, 0x1

    if-ge v2, p1, :cond_2

    add-int/lit8 p1, v2, 0x2

    .line 454
    new-array p1, p1, [B

    .line 455
    aput-byte p0, p1, v1

    int-to-byte p0, v2

    .line 456
    aput-byte p0, p1, v3

    goto/16 :goto_3

    :cond_2
    const/4 p1, 0x3

    const/16 v4, 0xff

    if-gt v2, v4, :cond_3

    add-int/lit8 p1, v2, 0x3

    .line 463
    new-array p1, p1, [B

    const/16 v0, -0x7f

    .line 464
    aput-byte v0, p1, v3

    int-to-byte v0, v2

    .line 465
    aput-byte v0, p1, p2

    const/4 v0, 0x3

    goto :goto_2

    :cond_3
    const v5, 0xffff

    const/4 v6, 0x4

    if-gt v2, v5, :cond_4

    add-int/lit8 v0, v2, 0x4

    .line 468
    new-array v0, v0, [B

    const/16 v4, -0x7e

    .line 469
    aput-byte v4, v0, v3

    shr-int/lit8 v3, v2, 0x8

    int-to-byte v3, v3

    .line 470
    aput-byte v3, v0, p2

    and-int/lit16 p2, v2, 0xff

    int-to-byte p2, p2

    .line 471
    aput-byte p2, v0, p1

    const/4 p1, 0x4

    move-object p1, v0

    const/4 v0, 0x4

    goto :goto_2

    :cond_4
    const v5, 0xffffff

    const/4 v7, 0x5

    if-gt v2, v5, :cond_5

    add-int/lit8 v0, v2, 0x5

    .line 474
    new-array v0, v0, [B

    const/16 v5, -0x7d

    .line 475
    aput-byte v5, v0, v3

    shr-int/lit8 v3, v2, 0x10

    int-to-byte v3, v3

    .line 476
    aput-byte v3, v0, p2

    shr-int/lit8 p2, v2, 0x8

    and-int/2addr p2, v4

    int-to-byte p2, p2

    .line 477
    aput-byte p2, v0, p1

    and-int/lit16 p1, v2, 0xff

    int-to-byte p1, p1

    .line 478
    aput-byte p1, v0, v6

    const/4 p1, 0x5

    move-object p1, v0

    const/4 v0, 0x5

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v2, 0x6

    .line 481
    new-array v5, v5, [B

    const/16 v8, -0x7c

    .line 482
    aput-byte v8, v5, v3

    shr-int/lit8 v3, v2, 0x18

    int-to-byte v3, v3

    .line 483
    aput-byte v3, v5, p2

    shr-int/lit8 p2, v2, 0x10

    and-int/2addr p2, v4

    int-to-byte p2, p2

    .line 484
    aput-byte p2, v5, p1

    shr-int/lit8 p1, v2, 0x8

    and-int/2addr p1, v4

    int-to-byte p1, p1

    .line 485
    aput-byte p1, v5, v6

    and-int/lit16 p1, v2, 0xff

    int-to-byte p1, p1

    .line 486
    aput-byte p1, v5, v7

    move-object p1, v5

    .line 488
    :goto_2
    aput-byte p0, p1, v1

    move p2, v0

    .line 490
    :goto_3
    array-length p0, p3

    const/4 v0, 0x0

    :goto_4
    if-ge v0, p0, :cond_6

    aget-object v2, p3, v0

    .line 491
    array-length v3, v2

    invoke-static {v2, v1, p1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 492
    array-length v2, v2

    add-int/2addr p2, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_6
    return-object p1

    .line 439
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "High tag numbers not supported: "

    .line 0
    invoke-static {p2, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 439
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ljava/lang/Object;)[B
    .locals 1

    const/4 v0, 0x0

    .line 105
    invoke-static {p0, v0}, Ll/ۤᩳᩳ;->֫(Ljava/lang/Object;Z)[B

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/util/Collection;Ll/֫ܿᩳ;)[B
    .locals 1

    const/4 v0, 0x1

    .line 162
    invoke-static {p0, p1, v0}, Ll/ۤᩳᩳ;->֫(Ljava/util/Collection;Ll/֫ܿᩳ;Z)[B

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/Object;)[B
    .locals 4

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 54
    invoke-static {v0}, Ll/ᩳܿᩳ;->֫(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Ll/᩸ᩳᩳ;

    if-eqz v1, :cond_3

    .line 60
    invoke-interface {v1}, Ll/᩸ᩳᩳ;->type()Ll/֫ܿᩳ;

    move-result-object v0

    .line 61
    sget-object v1, Ll/ۙᩳᩳ;->ۧ:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    const/4 v3, 0x3

    if-ne v1, v3, :cond_0

    .line 67
    invoke-static {p0, v2}, Ll/ۤᩳᩳ;->֫(Ljava/lang/Object;Z)[B

    move-result-object p0

    return-object p0

    .line 69
    :cond_0
    new-instance p0, Ll/ۛᩳᩳ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported container type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 69
    throw p0

    :cond_1
    const/4 v0, 0x0

    .line 105
    invoke-static {p0, v0}, Ll/ۤᩳᩳ;->֫(Ljava/lang/Object;Z)[B

    move-result-object p0

    return-object p0

    .line 63
    :cond_2
    invoke-static {p0}, Ll/ۤᩳᩳ;->ܿ(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0

    .line 56
    :cond_3
    new-instance p0, Ll/ۛᩳᩳ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not annotated with "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v0, Ll/᩸ᩳᩳ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 57
    throw p0
.end method

.method public static ܿ(Ljava/lang/Object;)[B
    .locals 5

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 75
    invoke-static {p0}, Ll/ۤᩳᩳ;->ᩳ(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 83
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗᩳᩳ;

    .line 84
    invoke-virtual {v3}, Ll/ۗᩳᩳ;->ۧ()Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-static {v4, p0}, Ll/ۤᩳᩳ;->ۧ(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    if-nez v2, :cond_1

    move-object v2, v3

    goto :goto_0

    .line 87
    :cond_1
    new-instance p0, Ll/ۛᩳᩳ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Multiple non-null fields in CHOICE class "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    invoke-virtual {v2}, Ll/ۗᩳᩳ;->ۧ()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    invoke-virtual {v3}, Ll/ۗᩳᩳ;->ۧ()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 90
    throw p0

    :cond_2
    if-eqz v2, :cond_3

    .line 101
    invoke-virtual {v2}, Ll/ۗᩳᩳ;->ܽ()[B

    move-result-object p0

    return-object p0

    .line 97
    :cond_3
    new-instance p0, Ll/ۛᩳᩳ;

    .line 98
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "No non-null fields in CHOICE class "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 98
    throw p0

    .line 77
    :cond_4
    new-instance p0, Ll/ۛᩳᩳ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No fields annotated with "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Ll/ۨᩳᩳ;

    .line 78
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " in CHOICE class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 79
    throw p0
.end method

.method public static ᩳ(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 10

    .line 213
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 214
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    .line 215
    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v1, v4

    .line 217
    const-class v6, Ll/ۨᩳᩳ;

    invoke-virtual {v5, v6}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v7

    check-cast v7, Ll/ۨᩳᩳ;

    if-nez v7, :cond_0

    goto :goto_1

    .line 221
    :cond_0
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v8

    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v8

    const-string v9, "."

    if-nez v8, :cond_1

    .line 229
    :try_start_0
    new-instance v6, Ll/ۗᩳᩳ;

    invoke-direct {v6, p0, v5, v7}, Ll/ۗᩳᩳ;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Field;Ll/ۨᩳᩳ;)V
    :try_end_0
    .catch Ll/ۛᩳᩳ; {:try_start_0 .. :try_end_0} :catch_0

    .line 236
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    .line 231
    new-instance v1, Ll/ۛᩳᩳ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid ASN.1 annotation on "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-direct {v1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 233
    throw v1

    .line 222
    :cond_1
    new-instance p0, Ll/ۛᩳᩳ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " used on a static field: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 224
    throw p0

    :cond_2
    return-object v2
.end method
