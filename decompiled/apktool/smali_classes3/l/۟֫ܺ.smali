.class public final Ll/۟֫ܺ;
.super Ljava/lang/Object;
.source "TAVX"

# interfaces
.implements Ll/ܽۧܺ;
.implements Ll/᩵֫ܺ;


# static fields
.field public static final ֫:Ll/۟֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 26
    new-instance v0, Ll/۟֫ܺ;

    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    sput-object v0, Ll/۟֫ܺ;->֫:Ll/۟֫ܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 142
    iget-object p3, p1, Ll/ۨ۟ۡ;->ۛ:Ll/۟۟ۡ;

    const-class v0, Ljava/lang/StackTraceElement;

    const/16 v1, 0x10

    const/4 v2, 0x4

    const/16 v3, 0xd

    const-string v4, "syntax error"

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-ne p2, v0, :cond_1a

    .line 265
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result p2

    const/16 v0, 0x8

    if-ne p2, v0, :cond_0

    .line 266
    invoke-virtual {p3}, Ll/۟۟ۡ;->ۢ()V

    return-object v6

    .line 270
    :cond_0
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result p2

    const/16 v7, 0xc

    if-eq p2, v7, :cond_2

    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result p2

    if-ne p2, v1, :cond_1

    goto :goto_0

    .line 271
    :cond_1
    new-instance p1, Ll/ܶ۟ۡ;

    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result p2

    invoke-static {p2}, Ll/᩶ۛ᩻;->ۧ(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "syntax error: "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 271
    throw p1

    :cond_2
    :goto_0
    const/4 p2, 0x0

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    .line 281
    :goto_1
    iget-object v10, p1, Ll/ۨ۟ۡ;->ܰ:Ll/ۢ֫ܺ;

    invoke-virtual {p3, v10}, Ll/۟۟ۡ;->֫(Ll/ۢ֫ܺ;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_4

    .line 284
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v11

    if-ne v11, v3, :cond_3

    .line 285
    invoke-virtual {p3, v1}, Ll/۟۟ۡ;->ۧ(I)V

    goto/16 :goto_6

    .line 288
    :cond_3
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v11

    if-ne v11, v1, :cond_4

    goto :goto_1

    .line 293
    :cond_4
    invoke-virtual {p3}, Ll/۟۟ۡ;->ۡ()V

    const-string v11, "className"

    .line 294
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    .line 295
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v7

    if-ne v7, v0, :cond_5

    :goto_2
    move-object v7, v6

    goto/16 :goto_5

    .line 297
    :cond_5
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v6

    if-ne v6, v2, :cond_6

    .line 298
    invoke-virtual {p3}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    .line 300
    :cond_6
    new-instance p1, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {p1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 300
    throw p1

    :cond_7
    const-string v11, "methodName"

    .line 302
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    .line 303
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v8

    if-ne v8, v0, :cond_8

    :goto_3
    move-object v8, v6

    goto/16 :goto_5

    .line 305
    :cond_8
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v6

    if-ne v6, v2, :cond_9

    .line 306
    invoke-virtual {p3}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    .line 308
    :cond_9
    new-instance p1, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {p1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 308
    throw p1

    :cond_a
    const-string v11, "fileName"

    .line 310
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    .line 311
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v9

    if-ne v9, v0, :cond_b

    :goto_4
    move-object v9, v6

    goto/16 :goto_5

    .line 313
    :cond_b
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v6

    if-ne v6, v2, :cond_c

    .line 314
    invoke-virtual {p3}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    .line 316
    :cond_c
    new-instance p1, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {p1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 316
    throw p1

    :cond_d
    const-string v6, "lineNumber"

    .line 318
    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    .line 319
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result p2

    if-ne p2, v0, :cond_e

    const/4 p2, 0x0

    goto :goto_5

    .line 321
    :cond_e
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result p2

    if-ne p2, v5, :cond_f

    .line 322
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܿ()I

    move-result p2

    goto :goto_5

    .line 324
    :cond_f
    new-instance p1, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {p1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 324
    throw p1

    :cond_10
    const-string v6, "nativeMethod"

    .line 326
    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    .line 327
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v6

    if-ne v6, v0, :cond_11

    .line 328
    invoke-virtual {p3, v1}, Ll/۟۟ۡ;->ۧ(I)V

    goto :goto_5

    .line 329
    :cond_11
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v6

    const/4 v10, 0x6

    if-ne v6, v10, :cond_12

    .line 330
    invoke-virtual {p3, v1}, Ll/۟۟ۡ;->ۧ(I)V

    goto :goto_5

    .line 331
    :cond_12
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v6

    const/4 v10, 0x7

    if-ne v6, v10, :cond_13

    .line 332
    invoke-virtual {p3, v1}, Ll/۟۟ۡ;->ۧ(I)V

    goto :goto_5

    .line 334
    :cond_13
    new-instance p1, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {p1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 334
    throw p1

    :cond_14
    const-string v6, "@type"

    const-string v11, "syntax error : "

    if-ne v10, v6, :cond_19

    .line 337
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v6

    if-ne v6, v2, :cond_16

    .line 338
    invoke-virtual {p3}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v6

    const-string v10, "java.lang.StackTraceElement"

    .line 339
    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_15

    goto :goto_5

    .line 340
    :cond_15
    new-instance p1, Ll/ܶ۟ۡ;

    invoke-virtual {v11, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 340
    throw p1

    .line 343
    :cond_16
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v6

    if-ne v6, v0, :cond_18

    .line 351
    :goto_5
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v6

    if-ne v6, v3, :cond_17

    .line 352
    invoke-virtual {p3, v1}, Ll/۟۟ۡ;->ۧ(I)V

    .line 356
    :goto_6
    new-instance p1, Ljava/lang/StackTraceElement;

    invoke-direct {p1, v7, v8, v9, p2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object p1

    :cond_17
    const/4 v6, 0x0

    goto/16 :goto_1

    .line 344
    :cond_18
    new-instance p1, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {p1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 344
    throw p1

    .line 348
    :cond_19
    new-instance p1, Ll/ܶ۟ۡ;

    .line 0
    invoke-static {v11, v10}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 348
    throw p1

    .line 150
    :cond_1a
    iget v0, p1, Ll/ۨ۟ۡ;->ۨ:I

    if-ne v0, v5, :cond_1d

    .line 151
    iput v7, p1, Ll/ۨ۟ۡ;->ۨ:I

    .line 152
    invoke-virtual {p1, v1}, Ll/ۨ۟ۡ;->֫(I)V

    .line 154
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v0

    if-ne v0, v2, :cond_1c

    const-string v0, "val"

    .line 155
    invoke-virtual {p3}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 158
    invoke-virtual {p3}, Ll/۟۟ۡ;->ۢ()V

    const/16 v0, 0x11

    .line 163
    invoke-virtual {p1, v0}, Ll/ۨ۟ۡ;->֫(I)V

    const/4 v0, 0x0

    .line 1380
    invoke-virtual {p1, v0}, Ll/ۨ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 167
    invoke-virtual {p1, v3}, Ll/ۨ۟ۡ;->֫(I)V

    goto :goto_7

    .line 156
    :cond_1b
    new-instance p1, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {p1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 156
    throw p1

    .line 160
    :cond_1c
    new-instance p1, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {p1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 160
    throw p1

    :cond_1d
    const/4 v0, 0x0

    .line 1380
    invoke-virtual {p1, v0}, Ll/ۨ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_7
    if-nez v0, :cond_1e

    goto/16 :goto_9

    .line 177
    :cond_1e
    instance-of v1, v0, Ljava/lang/String;

    const-class v2, Ljava/util/Currency;

    if-eqz v1, :cond_30

    .line 178
    check-cast v0, Ljava/lang/String;

    .line 202
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1f

    goto/16 :goto_9

    .line 206
    :cond_1f
    const-class v1, Ljava/util/UUID;

    if-ne p2, v1, :cond_20

    .line 207
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    return-object p1

    .line 208
    :cond_20
    const-class v1, Ljava/lang/Class;

    if-ne p2, v1, :cond_21

    .line 209
    iget-object p1, p1, Ll/ۨ۟ۡ;->᩸:Ll/᩻֫ܺ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ll/᩵ۧܺ;->ᩳ(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    .line 210
    :cond_21
    const-class p1, Ljava/util/Locale;

    const/4 v1, 0x1

    if-ne p2, p1, :cond_24

    const-string p1, "_"

    .line 211
    invoke-virtual {v0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 213
    array-length p2, p1

    if-ne p2, v1, :cond_22

    .line 214
    new-instance p2, Ljava/util/Locale;

    aget-object p1, p1, v7

    invoke-direct {p2, p1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    return-object p2

    .line 217
    :cond_22
    array-length p2, p1

    if-ne p2, v5, :cond_23

    .line 218
    new-instance p2, Ljava/util/Locale;

    aget-object p3, p1, v7

    aget-object p1, p1, v1

    invoke-direct {p2, p3, p1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    .line 221
    :cond_23
    new-instance p2, Ljava/util/Locale;

    aget-object p3, p1, v7

    aget-object v0, p1, v1

    aget-object p1, p1, v5

    invoke-direct {p2, p3, v0, p1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    .line 222
    :cond_24
    const-class p1, Ljava/net/URI;

    if-ne p2, p1, :cond_25

    .line 223
    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p1

    return-object p1

    .line 224
    :cond_25
    const-class p1, Ljava/net/URL;

    if-ne p2, p1, :cond_26

    .line 226
    :try_start_0
    new-instance p1, Ljava/net/URL;

    invoke-direct {p1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 228
    new-instance p2, Ll/ܶ۟ۡ;

    const-string p3, "create url error"

    .line 29
    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 228
    throw p2

    .line 230
    :cond_26
    const-class p1, Ljava/util/regex/Pattern;

    if-ne p2, p1, :cond_27

    .line 231
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    return-object p1

    .line 232
    :cond_27
    const-class p1, Ljava/nio/charset/Charset;

    if-ne p2, p1, :cond_28

    .line 233
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    return-object p1

    :cond_28
    if-ne p2, v2, :cond_29

    .line 235
    invoke-static {v0}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p1

    return-object p1

    .line 236
    :cond_29
    const-class p1, Ljava/text/SimpleDateFormat;

    if-ne p2, p1, :cond_2a

    .line 237
    new-instance p1, Ljava/text/SimpleDateFormat;

    iget-object p2, p3, Ll/۟۟ۡ;->ۡ:Ljava/util/Locale;

    invoke-direct {p1, v0, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 238
    iget-object p2, p3, Ll/۟۟ۡ;->֨:Ljava/util/TimeZone;

    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    return-object p1

    .line 240
    :cond_2a
    sget-object p1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-eq p2, p1, :cond_2d

    const-class p1, Ljava/lang/Character;

    if-ne p2, p1, :cond_2b

    goto :goto_8

    .line 243
    :cond_2b
    instance-of p1, p2, Ljava/lang/Class;

    if-eqz p1, :cond_2c

    .line 244
    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.net.Uri"

    const-string p3, "android.net.Uri"

    .line 245
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2c

    .line 247
    :try_start_1
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string p2, "parse"

    new-array p3, v1, [Ljava/lang/Class;

    .line 248
    const-class v2, Ljava/lang/String;

    aput-object v2, p3, v7

    invoke-virtual {p1, p2, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    aput-object v0, p2, v7

    const/4 p3, 0x0

    .line 249
    invoke-virtual {p1, p3, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    .line 252
    new-instance p2, Ll/ܶ۟ۡ;

    const-string p3, "parse android.net.Uri error."

    .line 29
    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 252
    throw p2

    .line 257
    :cond_2c
    invoke-static {v0}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p1

    return-object p1

    .line 241
    :cond_2d
    :goto_8
    sget p1, Ll/᩵ۧܺ;->֫:I

    .line 211
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_2e

    :goto_9
    const/4 p1, 0x0

    return-object p1

    .line 215
    :cond_2e
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    if-ne p1, v1, :cond_2f

    .line 219
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    return-object p1

    .line 216
    :cond_2f
    new-instance p1, Ll/ܶ۟ۡ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "can not cast to byte, value : "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 216
    throw p1

    .line 180
    :cond_30
    instance-of p1, v0, Ll/᩸۟ۡ;

    if-eqz p1, :cond_33

    .line 181
    check-cast v0, Ll/᩸۟ۡ;

    if-ne p2, v2, :cond_32

    const-string p1, "currency"

    .line 184
    invoke-virtual {v0, p1}, Ll/᩸۟ۡ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_31

    .line 186
    invoke-static {p1}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p1

    return-object p1

    :cond_31
    const-string p1, "currencyCode"

    .line 189
    invoke-virtual {v0, p1}, Ll/᩸۟ۡ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_32

    .line 191
    invoke-static {p1}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p1

    return-object p1

    .line 195
    :cond_32
    const-class p1, Ljava/util/Map$Entry;

    if-ne p2, p1, :cond_33

    .line 196
    invoke-virtual {v0}, Ll/᩸۟ۡ;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 199
    :cond_33
    new-instance p1, Ll/ܶ۟ۡ;

    const-string p2, "except string value"

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 199
    throw p1
.end method

.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 7

    .line 33
    iget-object v0, p1, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    if-nez p2, :cond_3

    .line 36
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-eq p4, p2, :cond_2

    const-class p2, Ljava/lang/Character;

    if-ne p4, p2, :cond_0

    goto :goto_0

    .line 39
    :cond_0
    iget p1, v0, Ll/ۜۧܺ;->᩶:I

    sget-object p2, Ll/᩷ۧܺ;->ۜ֫:Ll/᩷ۧܺ;

    iget p2, p2, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p1, p2

    if-eqz p1, :cond_1

    .line 40
    invoke-static {p4}, Ll/᩵ۧܺ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    .line 41
    const-class p2, Ljava/util/Enumeration;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "[]"

    .line 42
    invoke-virtual {v0, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 46
    :cond_1
    invoke-virtual {v0}, Ll/ۜۧܺ;->֫()V

    return-void

    :cond_2
    :goto_0
    const-string p2, ""

    .line 37
    invoke-virtual {p1, p2}, Ll/ۛ֫ܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 51
    :cond_3
    instance-of v1, p2, Ljava/util/regex/Pattern;

    if-eqz v1, :cond_4

    .line 52
    check-cast p2, Ljava/util/regex/Pattern;

    .line 53
    invoke-virtual {p2}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۛ֫ܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 54
    :cond_4
    instance-of v1, p2, Ljava/util/TimeZone;

    if-eqz v1, :cond_5

    .line 55
    check-cast p2, Ljava/util/TimeZone;

    .line 56
    invoke-virtual {p2}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۛ֫ܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 57
    :cond_5
    instance-of v1, p2, Ljava/util/Currency;

    if-eqz v1, :cond_6

    .line 58
    check-cast p2, Ljava/util/Currency;

    .line 59
    invoke-virtual {p2}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۛ֫ܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 60
    :cond_6
    instance-of v1, p2, Ljava/lang/Class;

    if-eqz v1, :cond_7

    .line 61
    check-cast p2, Ljava/lang/Class;

    .line 62
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۛ֫ܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 63
    :cond_7
    instance-of v1, p2, Ljava/lang/Character;

    if-eqz v1, :cond_9

    .line 64
    check-cast p2, Ljava/lang/Character;

    .line 66
    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result p3

    if-nez p3, :cond_8

    const-string p2, "\u0000"

    .line 68
    invoke-virtual {p1, p2}, Ll/ۛ֫ܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 70
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Character;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۛ֫ܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 72
    :cond_9
    instance-of v1, p2, Ljava/text/SimpleDateFormat;

    const/16 v2, 0x2c

    const/4 v3, 0x0

    if-eqz v1, :cond_b

    .line 73
    move-object p3, p2

    check-cast p3, Ljava/text/SimpleDateFormat;

    invoke-virtual {p3}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    move-result-object p3

    .line 75
    iget v1, v0, Ll/ۜۧܺ;->᩶:I

    sget-object v4, Ll/᩷ۧܺ;->ۧ֫:Ll/᩷ۧܺ;

    iget v4, v4, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v1, v4

    if-eqz v1, :cond_a

    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v1, p4, :cond_a

    const/16 p4, 0x7b

    .line 77
    invoke-virtual {v0, p4}, Ll/ۜۧܺ;->write(I)V

    const-string p4, "@type"

    .line 78
    invoke-virtual {v0, p4, v3}, Ll/ۜۧܺ;->֫(Ljava/lang/String;Z)V

    .line 79
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۛ֫ܺ;->֫(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v0, v2}, Ll/ۜۧܺ;->write(I)V

    const-string p1, "val"

    .line 81
    invoke-virtual {v0, p1, v3}, Ll/ۜۧܺ;->֫(Ljava/lang/String;Z)V

    .line 82
    invoke-virtual {v0, p3}, Ll/ۜۧܺ;->֫(Ljava/lang/String;)V

    const/16 p1, 0x7d

    .line 83
    invoke-virtual {v0, p1}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 88
    :cond_a
    invoke-virtual {v0, p3}, Ll/ۜۧܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 89
    :cond_b
    instance-of v1, p2, Ll/᩹۟ۡ;

    if-eqz v1, :cond_c

    .line 90
    check-cast p2, Ll/᩹۟ۡ;

    .line 91
    invoke-interface {p2, v0}, Ll/᩹۟ۡ;->֫(Ljava/lang/Appendable;)V

    return-void

    .line 92
    :cond_c
    instance-of v1, p2, Ll/۠۟ۡ;

    if-eqz v1, :cond_d

    .line 93
    check-cast p2, Ll/۠۟ۡ;

    .line 94
    invoke-interface {p2}, Ll/۠۟ۡ;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 95
    :cond_d
    instance-of v1, p2, Ll/ۤ֫ܺ;

    if-eqz v1, :cond_e

    .line 96
    check-cast p2, Ll/ۤ֫ܺ;

    .line 97
    invoke-interface {p2}, Ll/ۤ֫ܺ;->֫()V

    return-void

    .line 98
    :cond_e
    instance-of v1, p2, Ljava/util/Enumeration;

    if-eqz v1, :cond_13

    .line 100
    iget v1, v0, Ll/ۜۧܺ;->᩶:I

    sget-object v4, Ll/᩷ۧܺ;->ۧ֫:Ll/᩷ۧܺ;

    iget v4, v4, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v1, v4

    if-eqz v1, :cond_f

    .line 101
    instance-of v1, p4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_f

    .line 102
    check-cast p4, Ljava/lang/reflect/ParameterizedType;

    .line 103
    invoke-interface {p4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p4

    aget-object p4, p4, v3

    goto :goto_1

    :cond_f
    const/4 p4, 0x0

    .line 107
    :goto_1
    move-object v1, p2

    check-cast v1, Ljava/util/Enumeration;

    .line 109
    iget-object v4, p1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 110
    invoke-virtual {p1, v4, p2, p3}, Ll/ۛ֫ܺ;->֫(Ll/ܳۧܺ;Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p2, 0x5b

    .line 114
    :try_start_0
    invoke-virtual {v0, p2}, Ll/ۜۧܺ;->write(I)V

    .line 115
    :goto_2
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result p2

    if-eqz p2, :cond_12

    .line 116
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object p2

    add-int/lit8 p3, v3, 0x1

    if-eqz v3, :cond_10

    .line 118
    invoke-virtual {v0, v2}, Ll/ۜۧܺ;->write(I)V

    :cond_10
    if-nez p2, :cond_11

    .line 122
    invoke-virtual {v0}, Ll/ۜۧܺ;->֫()V

    goto :goto_3

    .line 126
    :cond_11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    .line 128
    iget-object v6, p1, Ll/ۛ֫ܺ;->ܽ:Ll/᩻ۧܺ;

    invoke-virtual {v6, v5}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v5

    .line 129
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, p1, p2, v3, p4}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    :goto_3
    move v3, p3

    goto :goto_2

    :cond_12
    const/16 p2, 0x5d

    .line 131
    invoke-virtual {v0, p2}, Ll/ۜۧܺ;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    iput-object v4, p1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    return-void

    :catchall_0
    move-exception p2

    iput-object v4, p1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 134
    throw p2

    .line 136
    :cond_13
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۛ֫ܺ;->֫(Ljava/lang/String;)V

    return-void
.end method
