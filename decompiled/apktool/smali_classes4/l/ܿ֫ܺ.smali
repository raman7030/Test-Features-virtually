.class public final Ll/ܿ֫ܺ;
.super Ljava/lang/Object;
.source "KAVD"

# interfaces
.implements Ll/᩵֫ܺ;


# static fields
.field public static ֫:Ll/ܿ֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Ll/ܿ֫ܺ;

    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    sput-object v0, Ll/ܿ֫ܺ;->֫:Ll/ܿ֫ܺ;

    return-void
.end method

.method public static ֫(Ll/ۨ۟ۡ;Ljava/util/Map;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 12

    .line 171
    iget-object v0, p0, Ll/ۨ۟ۡ;->ۛ:Ll/۟۟ۡ;

    iget-object v1, p0, Ll/ۨ۟ۡ;->᩸:Ll/᩻֫ܺ;

    .line 173
    iget v2, v0, Ll/۟۟ۡ;->۠:I

    const/16 v3, 0xc

    const/16 v4, 0x10

    if-eq v2, v3, :cond_1

    if-ne v2, v4, :cond_0

    goto :goto_0

    .line 175
    :cond_0
    new-instance p0, Ll/ܶ۟ۡ;

    invoke-static {v2}, Ll/᩶ۛ᩻;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "syntax error, expect {, actual "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 175
    throw p0

    .line 178
    :cond_1
    :goto_0
    invoke-virtual {v1, p2}, Ll/᩻֫ܺ;->֫(Ljava/lang/reflect/Type;)Ll/᩵֫ܺ;

    move-result-object v2

    .line 179
    invoke-virtual {v1, p3}, Ll/᩻֫ܺ;->֫(Ljava/lang/reflect/Type;)Ll/᩵֫ܺ;

    move-result-object v1

    .line 180
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V

    .line 182
    iget-object v3, p0, Ll/ۨ۟ۡ;->᩹:Ll/ܳ֫ܺ;

    .line 185
    :cond_2
    :goto_1
    :try_start_0
    iget v5, v0, Ll/۟۟ۡ;->۠:I

    const/16 v6, 0xd

    if-ne v5, v6, :cond_3

    .line 187
    invoke-virtual {v0, v4}, Ll/۟۟ۡ;->ۧ(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    invoke-virtual {p0, v3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    return-object p1

    :cond_3
    const/4 v7, 0x1

    const/4 v8, 0x4

    if-ne v5, v8, :cond_9

    .line 191
    :try_start_1
    iget v9, v0, Ll/۟۟ۡ;->᩵:I

    if-ne v9, v8, :cond_9

    iget-object v9, v0, Ll/۟۟ۡ;->ۚ:Ljava/lang/String;

    const-string v10, "$ref"

    iget v11, v0, Ll/۟۟ۡ;->ۖ:I

    add-int/2addr v11, v7

    .line 192
    invoke-virtual {v9, v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_9

    sget-object v9, Ll/ܰ۟ۡ;->᩺:Ll/ܰ۟ۡ;

    .line 193
    invoke-virtual {v0, v9}, Ll/۟۟ۡ;->֫(Ll/ܰ۟ۡ;)Z

    move-result v9

    if-nez v9, :cond_9

    .line 196
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۡ()V

    .line 197
    iget p1, v0, Ll/۟۟ۡ;->۠:I

    if-ne p1, v8, :cond_8

    .line 198
    invoke-virtual {v0}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object p1

    const-string p2, ".."

    .line 199
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 200
    iget-object p1, v3, Ll/ܳ֫ܺ;->ܽ:Ll/ܳ֫ܺ;

    .line 201
    iget-object p1, p1, Ll/ܳ֫ܺ;->ۧ:Ljava/lang/Object;

    goto :goto_3

    :cond_4
    const-string p2, "$"

    .line 202
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    move-object p1, v3

    .line 204
    :goto_2
    iget-object p2, p1, Ll/ܳ֫ܺ;->ܽ:Ll/ܳ֫ܺ;

    if-eqz p2, :cond_5

    move-object p1, p2

    goto :goto_2

    .line 208
    :cond_5
    iget-object p1, p1, Ll/ܳ֫ܺ;->ۧ:Ljava/lang/Object;

    goto :goto_3

    .line 210
    :cond_6
    new-instance p2, Ll/ۛ۟ۡ;

    invoke-direct {p2, v3, p1}, Ll/ۛ۟ۡ;-><init>(Ll/ܳ֫ܺ;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ll/ۨ۟ۡ;->֫(Ll/ۛ۟ۡ;)V

    .line 211
    iput v7, p0, Ll/ۨ۟ۡ;->ۨ:I

    const/4 p1, 0x0

    .line 217
    :goto_3
    invoke-virtual {v0, v6}, Ll/۟۟ۡ;->ۧ(I)V

    .line 218
    iget p2, v0, Ll/۟۟ۡ;->۠:I

    if-ne p2, v6, :cond_7

    .line 221
    invoke-virtual {v0, v4}, Ll/۟۟ۡ;->ۧ(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 262
    invoke-virtual {p0, v3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    return-object p1

    .line 219
    :cond_7
    :try_start_2
    new-instance p1, Ll/ܶ۟ۡ;

    const-string p2, "illegal ref"

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 219
    throw p1

    .line 214
    :cond_8
    new-instance p1, Ll/ܶ۟ۡ;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "illegal ref, "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ll/᩶ۛ᩻;->ۧ(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 214
    throw p1

    .line 229
    :cond_9
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v9

    if-nez v9, :cond_b

    if-ne v5, v8, :cond_b

    const-string v5, "@type"

    .line 231
    invoke-virtual {v0}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    sget-object v5, Ll/ܰ۟ۡ;->᩺:Ll/ܰ۟ۡ;

    .line 232
    invoke-virtual {v0, v5}, Ll/۟۟ۡ;->֫(Ll/ܰ۟ۡ;)Z

    move-result v5

    if-nez v5, :cond_b

    .line 233
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۡ()V

    .line 234
    invoke-virtual {v0, v4}, Ll/۟۟ۡ;->ۧ(I)V

    .line 235
    iget v5, v0, Ll/۟۟ۡ;->۠:I

    if-ne v5, v6, :cond_a

    .line 236
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 262
    invoke-virtual {p0, v3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    return-object p1

    .line 239
    :cond_a
    :try_start_3
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V

    :cond_b
    const/4 v5, 0x0

    .line 242
    invoke-interface {v2, p0, p2, v5}, Ll/᩵֫ܺ;->֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 244
    iget v6, v0, Ll/۟۟ۡ;->۠:I

    const/16 v8, 0x11

    if-ne v6, v8, :cond_d

    .line 248
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V

    .line 250
    invoke-interface {v1, p0, p3, v5}, Ll/᩵֫ܺ;->֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 251
    iget v8, p0, Ll/ۨ۟ۡ;->ۨ:I

    if-ne v8, v7, :cond_c

    .line 252
    invoke-virtual {p0, p1, v5}, Ll/ۨ۟ۡ;->֫(Ljava/util/Map;Ljava/lang/Object;)V

    .line 255
    :cond_c
    invoke-interface {p1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    iget v5, v0, Ll/۟۟ۡ;->۠:I

    if-ne v5, v4, :cond_2

    .line 258
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V

    goto/16 :goto_1

    .line 245
    :cond_d
    new-instance p1, Ll/ܶ۟ۡ;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "syntax error, expect :, actual "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, v0, Ll/۟۟ۡ;->۠:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 245
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    .line 262
    invoke-virtual {p0, v3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    .line 263
    throw p1
.end method

.method public static ֫(Ljava/lang/reflect/Type;)Ljava/util/Map;
    .locals 4

    .line 270
    const-class v0, Ljava/util/Properties;

    if-ne p0, v0, :cond_0

    .line 271
    new-instance p0, Ljava/util/Properties;

    invoke-direct {p0}, Ljava/util/Properties;-><init>()V

    return-object p0

    .line 274
    :cond_0
    const-class v0, Ljava/util/Hashtable;

    if-ne p0, v0, :cond_1

    .line 275
    new-instance p0, Ljava/util/Hashtable;

    invoke-direct {p0}, Ljava/util/Hashtable;-><init>()V

    return-object p0

    .line 278
    :cond_1
    const-class v0, Ljava/util/IdentityHashMap;

    if-ne p0, v0, :cond_2

    .line 279
    new-instance p0, Ljava/util/IdentityHashMap;

    invoke-direct {p0}, Ljava/util/IdentityHashMap;-><init>()V

    return-object p0

    .line 282
    :cond_2
    const-class v0, Ljava/util/SortedMap;

    if-eq p0, v0, :cond_d

    const-class v0, Ljava/util/TreeMap;

    if-ne p0, v0, :cond_3

    goto/16 :goto_2

    .line 286
    :cond_3
    const-class v0, Ljava/util/concurrent/ConcurrentMap;

    if-eq p0, v0, :cond_c

    const-class v0, Ll/ۧۤᩴ;

    if-ne p0, v0, :cond_4

    goto/16 :goto_1

    .line 290
    :cond_4
    const-class v0, Ljava/util/Map;

    if-eq p0, v0, :cond_b

    const-class v0, Ljava/util/HashMap;

    if-ne p0, v0, :cond_5

    goto :goto_0

    .line 294
    :cond_5
    const-class v0, Ljava/util/LinkedHashMap;

    if-ne p0, v0, :cond_6

    .line 295
    new-instance p0, Ljava/util/LinkedHashMap;

    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object p0

    .line 298
    :cond_6
    const-class v0, Ll/᩸۟ۡ;

    if-ne p0, v0, :cond_7

    .line 299
    new-instance p0, Ll/᩸۟ۡ;

    invoke-direct {p0}, Ll/᩸۟ۡ;-><init>()V

    return-object p0

    .line 302
    :cond_7
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_9

    .line 303
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 305
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 306
    const-class v1, Ljava/util/EnumMap;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 307
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    .line 309
    new-instance v0, Ljava/util/EnumMap;

    const/4 v1, 0x0

    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/Class;

    invoke-direct {v0, p0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    return-object v0

    .line 312
    :cond_8
    invoke-static {v0}, Ll/ܿ֫ܺ;->֫(Ljava/lang/reflect/Type;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    .line 315
    :cond_9
    move-object v0, p0

    check-cast v0, Ljava/lang/Class;

    .line 316
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    const-string v2, "unsupport type "

    if-nez v1, :cond_a

    .line 321
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 323
    new-instance v1, Ll/ܶ۟ۡ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 29
    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 323
    throw v1

    .line 317
    :cond_a
    new-instance v0, Ll/ܶ۟ۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 317
    throw v0

    .line 291
    :cond_b
    :goto_0
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    return-object p0

    .line 287
    :cond_c
    :goto_1
    new-instance p0, Ll/ۧۤᩴ;

    invoke-direct {p0}, Ll/ۧۤᩴ;-><init>()V

    return-object p0

    .line 283
    :cond_d
    :goto_2
    new-instance p0, Ljava/util/TreeMap;

    invoke-direct {p0}, Ljava/util/TreeMap;-><init>()V

    return-object p0
.end method

.method public static ֫(Ll/ۨ۟ۡ;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/util/Map;
    .locals 11

    .line 58
    iget-object v0, p0, Ll/ۨ۟ۡ;->ۛ:Ll/۟۟ۡ;

    iget-object v1, p0, Ll/ۨ۟ۡ;->᩸:Ll/᩻֫ܺ;

    iget-object v2, p0, Ll/ۨ۟ۡ;->ܰ:Ll/ۢ֫ܺ;

    .line 60
    iget v3, v0, Ll/۟۟ۡ;->۠:I

    const/16 v4, 0xc

    if-ne v3, v4, :cond_f

    .line 64
    iget-object v3, p0, Ll/ۨ۟ۡ;->᩹:Ll/ܳ֫ܺ;

    .line 67
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll/۟۟ۡ;->֨()V

    .line 68
    iget-char v4, v0, Ll/۟۟ۡ;->ܽ:C

    :goto_0
    const/16 v5, 0x2c

    if-ne v4, v5, :cond_1

    .line 70
    invoke-virtual {v0}, Ll/۟۟ۡ;->᩷()C

    .line 71
    invoke-virtual {v0}, Ll/۟۟ۡ;->֨()V

    .line 72
    iget-char v4, v0, Ll/۟۟ۡ;->ܽ:C
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    const-string v6, "syntax error, "

    const/16 v7, 0x3a

    const/16 v8, 0x22

    const/16 v9, 0x10

    if-ne v4, v8, :cond_3

    .line 77
    :try_start_1
    invoke-virtual {v0, v2, v8}, Ll/۟۟ۡ;->֫(Ll/ۢ֫ܺ;C)Ljava/lang/String;

    move-result-object v4

    .line 78
    invoke-virtual {v0}, Ll/۟۟ۡ;->֨()V

    .line 79
    iget-char v10, v0, Ll/۟۟ۡ;->ܽ:C

    if-ne v10, v7, :cond_2

    goto :goto_1

    .line 81
    :cond_2
    new-instance p1, Ll/ܶ۟ۡ;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/۟۟ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 81
    throw p1

    :cond_3
    const/16 v10, 0x7d

    if-ne v4, v10, :cond_4

    .line 84
    invoke-virtual {v0}, Ll/۟۟ۡ;->᩷()C

    .line 85
    iput v5, v0, Ll/۟۟ۡ;->᩵:I

    .line 86
    invoke-virtual {v0, v9}, Ll/۟۟ۡ;->ۧ(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    invoke-virtual {p0, v3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    return-object p3

    :cond_4
    const/16 v10, 0x27

    if-ne v4, v10, :cond_6

    .line 89
    :try_start_2
    invoke-virtual {v0, v2, v10}, Ll/۟۟ۡ;->֫(Ll/ۢ֫ܺ;C)Ljava/lang/String;

    move-result-object v4

    .line 90
    invoke-virtual {v0}, Ll/۟۟ۡ;->֨()V

    .line 91
    iget-char v10, v0, Ll/۟۟ۡ;->ܽ:C

    if-ne v10, v7, :cond_5

    goto :goto_1

    .line 93
    :cond_5
    new-instance p1, Ll/ܶ۟ۡ;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/۟۟ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 93
    throw p1

    .line 96
    :cond_6
    invoke-virtual {v0, v2}, Ll/۟۟ۡ;->ۧ(Ll/ۢ֫ܺ;)Ljava/lang/String;

    move-result-object v4

    .line 97
    invoke-virtual {v0}, Ll/۟۟ۡ;->֨()V

    .line 98
    iget-char v6, v0, Ll/۟۟ۡ;->ܽ:C

    if-ne v6, v7, :cond_e

    .line 104
    :goto_1
    invoke-virtual {v0}, Ll/۟۟ۡ;->᩷()C

    .line 105
    invoke-virtual {v0}, Ll/۟۟ۡ;->֨()V

    .line 108
    iput v5, v0, Ll/۟۟ۡ;->᩵:I

    const-string v5, "@type"

    const/16 v6, 0xd

    const/4 v7, 0x0

    if-ne v4, v5, :cond_9

    .line 110
    sget-object v5, Ll/ܰ۟ۡ;->᩺:Ll/ܰ۟ۡ;

    invoke-virtual {v0, v5}, Ll/۟۟ۡ;->֫(Ll/ܰ۟ۡ;)Z

    move-result v5

    if-nez v5, :cond_9

    .line 111
    invoke-virtual {v0, v2, v8}, Ll/۟۟ۡ;->֫(Ll/ۢ֫ܺ;C)Ljava/lang/String;

    move-result-object v4

    .line 112
    iget v5, v0, Ll/۟۟ۡ;->ܳ:I

    invoke-virtual {v1, v4, v5, v7}, Ll/᩻֫ܺ;->֫(Ljava/lang/String;ILjava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 114
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    if-ne v4, v5, :cond_7

    .line 115
    invoke-virtual {v0, v9}, Ll/۟۟ۡ;->ۧ(I)V

    .line 116
    iget v4, v0, Ll/۟۟ۡ;->۠:I

    if-ne v4, v6, :cond_0

    .line 117
    invoke-virtual {v0, v9}, Ll/۟۟ۡ;->ۧ(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 164
    invoke-virtual {p0, v3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    return-object p3

    .line 123
    :cond_7
    :try_start_3
    invoke-virtual {v1, v4}, Ll/᩻֫ܺ;->֫(Ljava/lang/reflect/Type;)Ll/᩵֫ܺ;

    move-result-object p2

    .line 125
    invoke-virtual {v0, v9}, Ll/۟۟ۡ;->ۧ(I)V

    const/4 p3, 0x2

    .line 127
    iput p3, p0, Ll/ۨ۟ۡ;->ۨ:I

    if-eqz v3, :cond_8

    .line 129
    instance-of p3, p1, Ljava/lang/Integer;

    if-nez p3, :cond_8

    .line 130
    invoke-virtual {p0}, Ll/ۨ۟ۡ;->ۜ()V

    .line 133
    :cond_8
    invoke-interface {p2, p0, v4, p1}, Ll/᩵֫ܺ;->֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 164
    invoke-virtual {p0, v3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    return-object p1

    .line 137
    :cond_9
    :try_start_4
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V

    .line 139
    invoke-virtual {p0, v3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    .line 140
    iget v5, v0, Ll/۟۟ۡ;->۠:I

    const/16 v8, 0x8

    if-ne v5, v8, :cond_a

    .line 142
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V

    goto :goto_2

    .line 144
    :cond_a
    invoke-virtual {p0, v4, p2}, Ll/ۨ۟ۡ;->֫(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v7

    .line 147
    :goto_2
    invoke-interface {p3, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    iget v5, p0, Ll/ۨ۟ۡ;->ۨ:I

    const/4 v8, 0x1

    if-ne v5, v8, :cond_b

    .line 149
    invoke-virtual {p0, p3, v4}, Ll/ۨ۟ۡ;->֫(Ljava/util/Map;Ljava/lang/Object;)V

    .line 151
    :cond_b
    invoke-virtual {p0, v3, v7, v4}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ֫ܺ;

    .line 153
    iget v4, v0, Ll/۟۟ۡ;->۠:I

    const/16 v5, 0x14

    if-eq v4, v5, :cond_d

    const/16 v5, 0xf

    if-ne v4, v5, :cond_c

    goto :goto_3

    :cond_c
    if-ne v4, v6, :cond_0

    .line 159
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 164
    invoke-virtual {p0, v3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    return-object p3

    :cond_d
    :goto_3
    invoke-virtual {p0, v3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    return-object p3

    .line 100
    :cond_e
    :try_start_5
    new-instance p1, Ll/ܶ۟ۡ;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "expect \':\' at "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, v0, Ll/۟۟ۡ;->ۘ:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", actual "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 100
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception p1

    .line 164
    invoke-virtual {p0, v3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    .line 165
    throw p1

    .line 61
    :cond_f
    new-instance p0, Ll/ܶ۟ۡ;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "syntax error, expect {, actual "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, v0, Ll/۟۟ۡ;->۠:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p0
.end method


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 22
    iget-object v0, p1, Ll/ۨ۟ۡ;->ۛ:Ll/۟۟ۡ;

    const-class v1, Ll/᩸۟ۡ;

    const/4 v2, 0x0

    if-ne p2, v1, :cond_1

    .line 1102
    iget p2, v0, Ll/۟۟ۡ;->ܳ:I

    sget-object p3, Ll/ܰ۟ۡ;->ۧ֫:Ll/ܰ۟ۡ;

    iget p3, p3, Ll/ܰ۟ۡ;->᩸:I

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    new-instance p2, Ll/᩸۟ۡ;

    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {p2, p3}, Ll/᩸۟ۡ;-><init>(Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    new-instance p2, Ll/᩸۟ۡ;

    invoke-direct {p2}, Ll/᩸۟ۡ;-><init>()V

    .line 1105
    :goto_0
    invoke-virtual {p1, p2, v2}, Ll/ۨ۟ۡ;->ۧ(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸۟ۡ;

    return-object p1

    .line 27
    :cond_1
    iget v1, v0, Ll/۟۟ۡ;->۠:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_2

    const/16 p1, 0x10

    .line 28
    invoke-virtual {v0, p1}, Ll/۟۟ۡ;->ۧ(I)V

    return-object v2

    .line 32
    :cond_2
    invoke-static {p2}, Ll/ܿ֫ܺ;->֫(Ljava/lang/reflect/Type;)Ljava/util/Map;

    move-result-object v0

    .line 34
    iget-object v1, p1, Ll/ۨ۟ۡ;->᩹:Ll/ܳ֫ܺ;

    .line 37
    :try_start_0
    invoke-virtual {p1, v1, v0, p3}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ֫ܺ;

    .line 38
    instance-of v2, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_4

    .line 39
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 40
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v2, v2, v3

    .line 41
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p2

    const/4 v3, 0x1

    aget-object p2, p2, v3

    .line 43
    const-class v3, Ljava/lang/String;

    if-ne v3, v2, :cond_3

    .line 44
    invoke-static {p1, p3, p2, v0}, Ll/ܿ֫ܺ;->֫(Ll/ۨ۟ۡ;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    invoke-virtual {p1, v1}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    return-object p2

    .line 46
    :cond_3
    :try_start_1
    invoke-static {p1, v0, v2, p2}, Ll/ܿ֫ܺ;->֫(Ll/ۨ۟ۡ;Ljava/util/Map;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    invoke-virtual {p1, v1}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    return-object p2

    .line 49
    :cond_4
    :try_start_2
    invoke-virtual {p1, v0, p3}, Ll/ۨ۟ۡ;->ۧ(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    invoke-virtual {p1, v1}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1, v1}, Ll/ۨ۟ۡ;->֫(Ll/ܳ֫ܺ;)V

    .line 53
    throw p2
.end method
