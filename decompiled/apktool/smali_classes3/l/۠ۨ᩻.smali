.class public final Ll/۠ۨ᩻;
.super Ljava/lang/Object;
.source "L79Z"


# direct methods
.method public static ֫(ILjava/lang/CharSequence;)I
    .locals 1

    if-lez p0, :cond_0

    .line 332
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p0, v0, :cond_0

    .line 333
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, p0, -0x1

    .line 334
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result p1

    if-eqz p1, :cond_0

    return v0

    :cond_0
    return p0
.end method

.method public static ֫(IIILjava/lang/CharSequence;)Ljava/lang/String;
    .locals 5

    .line 226
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 v0, 0x0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, p3}, Ll/۠ۨ᩻;->֫(ILjava/lang/CharSequence;)I

    move-result p0

    .line 227
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, p3}, Ll/۠ۨ᩻;->֫(ILjava/lang/CharSequence;)I

    move-result p1

    if-lez p2, :cond_3

    if-lt p0, p1, :cond_0

    goto :goto_2

    .line 231
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    mul-int/lit8 v2, p2, 0x2

    sub-int v3, p1, p0

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_0
    if-ge p0, p1, :cond_2

    if-ge v0, p2, :cond_2

    add-int/lit8 v2, p0, 0x1

    .line 235
    invoke-interface {p3, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 236
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 237
    invoke-static {v3}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_1

    if-ge v2, p1, :cond_1

    .line 238
    invoke-interface {p3, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 239
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 240
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p0, p0, 0x2

    goto :goto_1

    :cond_1
    move p0, v2

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 246
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_2
    const-string p0, ""

    return-object p0
.end method

.method public static ֫(IILjava/lang/CharSequence;)Ljava/lang/String;
    .locals 1

    .line 219
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p0, v0, p1, p2}, Ll/۠ۨ᩻;->֫(IIILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(IILjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 119
    invoke-static {p2}, Ll/۠ۨ᩻;->֫(Ljava/lang/CharSequence;)[Ll/᩵ۨ᩻;

    move-result-object p2

    const/4 v0, 0x1

    .line 120
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 121
    array-length v1, p2

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-le p0, p1, :cond_0

    const-string p0, ""

    return-object p0

    .line 125
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sub-int/2addr p0, v0

    :goto_0
    if-ge p0, p1, :cond_2

    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/16 v0, 0xa

    .line 128
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 130
    :cond_1
    aget-object v0, p2, p0

    .line 395
    iget-object v2, v0, Ll/᩵ۨ᩻;->ۧ:Ljava/lang/CharSequence;

    iget v3, v0, Ll/᩵ۨ᩻;->ܿ:I

    iget v0, v0, Ll/᩵ۨ᩻;->ᩳ:I

    invoke-virtual {v1, v2, v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 132
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\r\n"

    const-string v1, "\n"

    .line 20
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0xd

    const/16 v1, 0xa

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;IIII)Ll/֨ۨ᩻;
    .locals 16

    move/from16 v3, p2

    move/from16 v0, p3

    move/from16 v1, p4

    .line 28
    invoke-static/range {p0 .. p0}, Ll/۠ۨ᩻;->֫(Ljava/lang/CharSequence;)[Ll/᩵ۨ᩻;

    move-result-object v2

    .line 29
    array-length v10, v2

    const/4 v7, 0x0

    move/from16 v4, p1

    .line 30
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v8

    if-ltz v3, :cond_12

    if-ge v8, v10, :cond_10

    if-lez v0, :cond_10

    if-gtz v1, :cond_0

    goto/16 :goto_8

    .line 41
    :cond_0
    aget-object v4, v2, v8

    .line 42
    iget v4, v4, Ll/᩵ۨ᩻;->֫:I

    if-gt v3, v4, :cond_f

    .line 45
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    if-nez v8, :cond_1

    if-nez v3, :cond_1

    .line 324
    new-instance v0, Ll/֨ۨ᩻;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-string v4, ""

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v3, v0

    move v5, v7

    move v6, v8

    invoke-direct/range {v3 .. v14}, Ll/֨ۨ᩻;-><init>(Ljava/lang/String;IIIIIIZLjava/lang/Integer;Ljava/lang/Integer;Z)V

    return-object v0

    .line 49
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    mul-int/lit8 v5, v1, 0x2

    const/16 v6, 0x1000

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v9, v3

    move v5, v8

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v5, v10, :cond_9

    if-ge v6, v0, :cond_9

    if-ge v7, v1, :cond_9

    .line 57
    aget-object v11, v2, v5

    .line 58
    iget v12, v11, Ll/᩵ۨ᩻;->֫:I

    iget-boolean v13, v11, Ll/᩵ۨ᩻;->ܽ:Z

    if-gt v9, v12, :cond_8

    sub-int v14, v1, v7

    if-gtz v14, :cond_2

    goto :goto_2

    :cond_2
    const/16 v15, 0xa

    if-ne v9, v12, :cond_4

    if-nez v13, :cond_3

    goto :goto_2

    .line 70
    :cond_3
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v5, v5, 0x1

    const/4 v9, 0x0

    goto :goto_0

    :cond_4
    sub-int/2addr v12, v9

    .line 79
    invoke-static {v12, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    if-gtz v14, :cond_5

    goto :goto_2

    :cond_5
    add-int v15, v9, v14

    .line 386
    iget-object v0, v11, Ll/᩵ۨ᩻;->ۧ:Ljava/lang/CharSequence;

    iget v11, v11, Ll/᩵ۨ᩻;->ܿ:I

    invoke-static {v0, v11, v9}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    move-result v9

    .line 387
    invoke-static {v0, v11, v15}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    move-result v11

    .line 388
    invoke-virtual {v4, v0, v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    add-int/2addr v7, v14

    add-int/lit8 v6, v6, 0x1

    if-ge v14, v12, :cond_6

    const/4 v0, 0x1

    const/4 v11, 0x1

    goto :goto_3

    :cond_6
    if-eqz v13, :cond_7

    if-ge v7, v1, :cond_7

    const/16 v0, 0xa

    .line 92
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v5, v5, 0x1

    const/4 v0, 0x0

    const/4 v9, 0x0

    goto :goto_1

    :cond_7
    move v9, v15

    :goto_1
    move/from16 v0, p3

    goto :goto_0

    .line 59
    :cond_8
    invoke-static {v9}, Ll/۠ۨ᩻;->֫(I)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_9
    :goto_2
    const/4 v0, 0x0

    move v15, v9

    const/4 v11, 0x0

    .line 313
    :goto_3
    array-length v0, v2

    if-lt v5, v0, :cond_a

    goto :goto_4

    .line 316
    :cond_a
    aget-object v0, v2, v5

    .line 317
    iget v1, v0, Ll/᩵ۨ᩻;->֫:I

    if-lt v15, v1, :cond_c

    iget-boolean v0, v0, Ll/᩵ۨ᩻;->ܽ:Z

    if-eqz v0, :cond_b

    goto :goto_5

    :cond_b
    :goto_4
    const/4 v0, 0x0

    const/4 v9, 0x0

    goto :goto_6

    :cond_c
    :goto_5
    const/4 v0, 0x1

    const/4 v9, 0x1

    :goto_6
    const/4 v0, 0x0

    if-eqz v9, :cond_d

    .line 100
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v12, v1

    goto :goto_7

    :cond_d
    move-object v12, v0

    :goto_7
    if-eqz v9, :cond_e

    .line 101
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_e
    move-object v13, v0

    .line 102
    new-instance v14, Ll/֨ۨ᩻;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v0, v14

    move v2, v8

    move/from16 v3, p2

    move v4, v5

    move v5, v15

    move v7, v10

    move v8, v9

    move-object v9, v12

    move-object v10, v13

    invoke-direct/range {v0 .. v11}, Ll/֨ۨ᩻;-><init>(Ljava/lang/String;IIIIIIZLjava/lang/Integer;Ljava/lang/Integer;Z)V

    return-object v14

    .line 43
    :cond_f
    invoke-static/range {p2 .. p2}, Ll/۠ۨ᩻;->֫(I)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_10
    :goto_8
    if-nez v3, :cond_11

    .line 324
    new-instance v0, Ll/֨ۨ᩻;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-string v4, ""

    const/4 v1, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v3, v0

    move v5, v8

    move v6, v1

    move v7, v8

    move v8, v1

    invoke-direct/range {v3 .. v14}, Ll/֨ۨ᩻;-><init>(Ljava/lang/String;IIIIIIZLjava/lang/Integer;Ljava/lang/Integer;Z)V

    return-object v0

    .line 36
    :cond_11
    invoke-static/range {p2 .. p2}, Ll/۠ۨ᩻;->֫(I)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 32
    :cond_12
    invoke-static/range {p2 .. p2}, Ll/۠ۨ᩻;->֫(I)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(I)Ll/ۗۛ᩻;
    .locals 4

    .line 112
    invoke-static {p0}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p0

    const/4 v0, 0x0

    const v1, 0x7fffffff

    filled-new-array {v0, v1}, [I

    move-result-object v0

    invoke-static {v0}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid lineCharOffset"

    const-string v3, "lineCharOffset"

    .line 111
    invoke-static {v2, v3, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;)[Ll/᩵ۨ᩻;
    .locals 7

    .line 344
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 345
    new-instance v0, Ll/᩵ۨ᩻;

    invoke-direct {v0, p0, v2, v2, v2}, Ll/᩵ۨ᩻;-><init>(Ljava/lang/CharSequence;IIZ)V

    new-array p0, v1, [Ll/᩵ۨ᩻;

    aput-object v0, p0, v2

    return-object p0

    .line 348
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 349
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v3, v5, :cond_2

    .line 350
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0xa

    if-ne v5, v6, :cond_1

    .line 351
    new-instance v5, Ll/᩵ۨ᩻;

    invoke-direct {v5, p0, v4, v3, v1}, Ll/᩵ۨ᩻;-><init>(Ljava/lang/CharSequence;IIZ)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v3, 0x1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 355
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v4, v1, :cond_3

    .line 356
    new-instance v1, Ll/᩵ۨ᩻;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-direct {v1, p0, v4, v3, v2}, Ll/᩵ۨ᩻;-><init>(Ljava/lang/CharSequence;IIZ)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    new-array p0, v2, [Ll/᩵ۨ᩻;

    .line 358
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/᩵ۨ᩻;

    return-object p0
.end method

.method public static ۧ(IILjava/lang/CharSequence;)I
    .locals 2

    .line 253
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 v0, 0x0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, p2}, Ll/۠ۨ᩻;->֫(ILjava/lang/CharSequence;)I

    move-result p0

    if-gez p1, :cond_2

    neg-int p1, p1

    :goto_0
    if-lez p0, :cond_1

    if-lez p1, :cond_1

    add-int/lit8 v0, p0, -0x1

    if-lez v0, :cond_0

    .line 259
    invoke-interface {p2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v1, p0, -0x2

    .line 260
    invoke-interface {p2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 p0, p0, -0x2

    goto :goto_1

    :cond_0
    move p0, v0

    :goto_1
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    return p0

    :cond_2
    if-lez p1, :cond_4

    .line 270
    :goto_2
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p0, v0, :cond_4

    if-lez p1, :cond_4

    add-int/lit8 v0, p0, 0x1

    .line 271
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    .line 272
    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 273
    invoke-interface {p2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_3

    add-int/lit8 p0, p0, 0x2

    goto :goto_3

    :cond_3
    move p0, v0

    :goto_3
    add-int/lit8 p1, p1, -0x1

    goto :goto_2

    :cond_4
    return p0
.end method

.method public static ۧ(ILjava/lang/CharSequence;)I
    .locals 2

    .line 300
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 v0, 0x0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, p1}, Ll/۠ۨ᩻;->֫(ILjava/lang/CharSequence;)I

    move-result p0

    .line 301
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p0, v0, :cond_1

    .line 302
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    return p0

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 306
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    return p0
.end method

.method public static ܽ(ILjava/lang/CharSequence;)I
    .locals 3

    .line 287
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 v0, 0x0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, p1}, Ll/۠ۨ᩻;->֫(ILjava/lang/CharSequence;)I

    move-result p0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    if-ltz p0, :cond_1

    .line 289
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_1
    return v0
.end method
