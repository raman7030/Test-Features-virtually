.class public final Ll/ۙ۟᩻;
.super Ljava/lang/Object;
.source "E762"


# direct methods
.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I
    .locals 2

    .line 319
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 320
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_2

    .line 323
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 328
    :try_start_0
    invoke-static {p0}, Ll/֨ۙ᩵;->ۧ(Lbin/mt/json/JSONValue;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-lt p0, p2, :cond_0

    if-gt p0, p3, :cond_0

    return p0

    :cond_0
    const-string v0, "Invalid "

    .line 333
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 334
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ".."

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p2

    const/4 p3, 0x0

    .line 333
    invoke-static {v0, p1, p0, p2, p3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 330
    :catch_0
    invoke-static {p1, p0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 324
    :cond_1
    invoke-static {p1, p0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 321
    :cond_2
    invoke-static {p1}, Ll/ۙ۟᩻;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static varargs ֫([Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 4

    .line 577
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 578
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    .line 579
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫(J)Ljava/lang/String;
    .locals 2

    .line 386
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 269
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 270
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_1

    .line 273
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 274
    :cond_0
    invoke-static {p1, p0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 271
    :cond_1
    invoke-static {p1}, Ll/ۙ۟᩻;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static varargs ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 304
    invoke-static {p0, p1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 305
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p2, v1

    .line 306
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string v0, "Invalid "

    .line 310
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    .line 311
    invoke-static {p2}, Ll/ۙ۟᩻;->֫([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p2

    const/4 v1, 0x0

    .line 310
    invoke-static {v0, p1, p0, p2, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 5

    .line 393
    new-instance v0, Ljava/lang/StringBuilder;

    array-length v1, p0

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 394
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    const/16 v4, 0x10

    if-ge v3, v4, :cond_0

    const/16 v4, 0x30

    .line 397
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 399
    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 401
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;
    .locals 6

    .line 595
    sget-object v0, Ll/ۖۖۢ;->֫:[Ljava/lang/String;

    .line 596
    invoke-static {v0}, Ll/ۙ۟᩻;->֫([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 597
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "data"

    const-string v3, "unknown"

    const-string v4, "call"

    const-string v5, "jump"

    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "referenceKinds"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid referenceKinds"

    .line 595
    invoke-static {v2, v3, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 4

    .line 585
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const-string v0, "0..9223372036854775807"

    const-string v1, "0x0..0x7fffffffffffffff"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    .line 586
    invoke-static {v0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 587
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "0x1000"

    const-string v3, "address"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid address"

    .line 585
    invoke-static {v2, v3, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "Invalid "

    .line 591
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, p1, v1, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ᩴ۟᩻;
    .locals 14

    const-string v7, "maxBytes"

    const-string v8, "maxInstructions"

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    const-string v2, "locator"

    const-string v3, "addressKind"

    const-string v4, "address"

    const-string v5, "instructionMode"

    const-string v6, "stopAtSymbolBoundary"

    .line 104
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    const-string v0, "workspaceId"

    .line 106
    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "editSessionId"

    .line 107
    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 108
    invoke-static {p0}, Ll/ۙ۟᩻;->ۢ(Lbin/mt/json/JSONObject;)Ll/᩶۟᩻;

    move-result-object v0

    const-string v1, "virtual"

    const-string v4, "file_offset"

    .line 109
    filled-new-array {v1, v4}, [Ljava/lang/String;

    move-result-object v1

    const-string v4, "addressKind"

    invoke-static {p0, v4, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 111
    invoke-static {p0}, Ll/ۙ۟᩻;->᩷(Lbin/mt/json/JSONObject;)Ll/֨۟᩻;

    move-result-object v1

    const-string v4, "arm"

    const-string v5, "thumb"

    const-string v7, "auto"

    .line 112
    filled-new-array {v7, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "instructionMode"

    invoke-static {p0, v5, v4}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v4, "stopAtSymbolBoundary"

    .line 343
    invoke-virtual {p0, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 344
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v7

    if-nez v7, :cond_1

    .line 347
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 350
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v11

    const/16 v4, 0x1000

    const-string v5, "maxBytes"

    const/4 v7, 0x1

    .line 115
    invoke-static {p0, v5, v7, v4}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v12

    const-string v4, "maxInstructions"

    const/16 v5, 0xc8

    .line 116
    invoke-static {p0, v4, v7, v5}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v13

    .line 118
    new-instance p0, Ll/ᩴ۟᩻;

    invoke-static {v0}, Ll/᩶۟᩻;->ۧ(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Ll/᩶۟᩻;->֫(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Ll/֨۟᩻;->ۧ(Ll/֨۟᩻;)J

    move-result-wide v7

    invoke-static {v1}, Ll/֨۟᩻;->֫(Ll/֨۟᩻;)Ljava/lang/String;

    move-result-object v9

    move-object v1, p0

    invoke-direct/range {v1 .. v13}, Ll/ᩴ۟᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZII)V

    return-object p0

    .line 348
    :cond_0
    invoke-static {v4, v5}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 345
    :cond_1
    invoke-static {v4}, Ll/ۙ۟᩻;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static varargs ֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V
    .locals 6

    .line 244
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONObject$Member;

    .line 245
    invoke-virtual {v1}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v3

    .line 247
    array-length v4, p1

    :goto_1
    if-ge v2, v4, :cond_1

    aget-object v5, p1, v2

    .line 248
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    const-string p0, "Invalid native tool argument"

    .line 255
    invoke-virtual {v1}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object p1

    const/4 v0, 0x0

    .line 254
    invoke-static {p0, v3, p1, v0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 258
    :cond_2
    array-length v0, p1

    :goto_2
    if-ge v2, v0, :cond_4

    aget-object v1, p1, v2

    .line 259
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 260
    :cond_3
    invoke-static {v1}, Ll/ۙ۟᩻;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_4
    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)[B
    .locals 2

    const/4 v0, 0x0

    .line 487
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_0

    .line 491
    :try_start_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 492
    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetEncoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    .line 493
    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetEncoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    .line 494
    invoke-static {p2}, Ljava/nio/CharBuffer;->wrap(Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/nio/charset/CharsetEncoder;->encode(Ljava/nio/CharBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 495
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-array v0, v0, [B

    .line 496
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 499
    :catch_0
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 488
    :cond_0
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۜ(Lbin/mt/json/JSONObject;)Ll/᩹۟᩻;
    .locals 33

    move-object/from16 v0, p0

    const-string v1, "data"

    const-string v10, "maxScanBytes"

    const-string v11, "limit"

    const-string v2, "workspaceId"

    const-string v3, "editSessionId"

    const-string v4, "locator"

    const-string v5, "addressKind"

    const-string v6, "address"

    const-string v7, "instructionMode"

    const-string v8, "scanKind"

    const-string v9, "referenceKinds"

    .line 217
    filled-new-array/range {v2 .. v11}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    const-string v2, "workspaceId"

    .line 219
    invoke-static {v0, v2}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v2, "editSessionId"

    .line 220
    invoke-static {v0, v2}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 221
    invoke-static/range {p0 .. p0}, Ll/ۙ۟᩻;->ۢ(Lbin/mt/json/JSONObject;)Ll/᩶۟᩻;

    move-result-object v2

    const-string v3, "virtual"

    const-string v6, "file_offset"

    .line 222
    filled-new-array {v3, v6}, [Ljava/lang/String;

    move-result-object v3

    const-string v6, "addressKind"

    invoke-static {v0, v6, v3}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 224
    invoke-static/range {p0 .. p0}, Ll/ۙ۟᩻;->᩷(Lbin/mt/json/JSONObject;)Ll/֨۟᩻;

    move-result-object v11

    const-string v3, "arm"

    const-string v6, "thumb"

    const-string v14, "auto"

    .line 225
    filled-new-array {v14, v3, v6}, [Ljava/lang/String;

    move-result-object v3

    const-string v6, "instructionMode"

    invoke-static {v0, v6, v3}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v3, "scanKind"

    .line 545
    invoke-static {v0, v3}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    .line 547
    :try_start_0
    invoke-static/range {v31 .. v31}, Ll/ۘۢܽ;->֫(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    const-string v3, "referenceKinds"

    .line 520
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 521
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v7

    if-nez v7, :cond_6

    .line 524
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 527
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v7

    invoke-virtual {v7}, Lbin/mt/json/JSONArray;->size()I

    move-result v7

    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 528
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v7

    invoke-virtual {v7}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lbin/mt/json/JSONValue;

    .line 529
    invoke-virtual {v9}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v10

    if-eqz v10, :cond_0

    .line 532
    invoke-virtual {v9}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 530
    :cond_0
    invoke-static {v9}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 43
    :cond_1
    :try_start_1
    invoke-static {v3}, Ll/ۖۖۢ;->֫(Ljava/lang/Iterable;)I

    move-result v3

    invoke-static {v3}, Ll/ۖۖۢ;->֫(I)Ljava/util/List;

    move-result-object v32
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    const/16 v3, 0x10

    const/high16 v6, 0x400000

    const-string v7, "maxScanBytes"

    .line 229
    invoke-static {v0, v7, v3, v6}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v15

    const/4 v3, 0x1

    const/16 v6, 0xc8

    const-string v7, "limit"

    .line 231
    invoke-static {v0, v7, v3, v6}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v16

    .line 232
    new-instance v0, Ll/᩹۟᩻;

    move-object v3, v0

    invoke-static {v2}, Ll/᩶۟᩻;->ۧ(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2}, Ll/᩶۟᩻;->֫(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v11}, Ll/֨۟᩻;->ۧ(Ll/֨۟᩻;)J

    move-result-wide v9

    invoke-static {v11}, Ll/֨۟᩻;->֫(Ll/֨۟᩻;)Ljava/lang/String;

    move-result-object v11

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    move-object v12, v13

    move-object v2, v13

    move-object/from16 v13, v31

    move-object/from16 p0, v2

    move-object v2, v14

    move-object/from16 v14, v32

    invoke-direct/range {v3 .. v30}, Ll/᩹۟᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIIIJIJJJLjava/lang/String;ILjava/lang/String;)V

    iget-object v3, v0, Ll/᩹۟᩻;->ۚ:Ljava/util/List;

    .line 561
    :try_start_2
    iget-object v4, v0, Ll/᩹۟᩻;->ܶ:Ljava/lang/String;

    invoke-static {v3}, Ll/ۖۖۢ;->֫(Ljava/lang/Iterable;)I

    move-result v5

    .line 562
    invoke-static {v5, v4}, Ll/ۘۢܽ;->֫(ILjava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 570
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    move-object/from16 v1, p0

    .line 571
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 572
    :cond_2
    invoke-static {v0}, Ll/ۜ֫ۜ;->֫(Ll/᩹۟᩻;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_3
    :goto_1
    return-object v0

    .line 564
    :catch_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 565
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 566
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_2

    .line 568
    :cond_4
    invoke-static {v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 537
    :catch_1
    invoke-static {v6}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 525
    :cond_5
    invoke-static {v6}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 522
    :cond_6
    invoke-static {v3}, Ll/ۙ۟᩻;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 549
    :catch_2
    invoke-static/range {v31 .. v31}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v2, "code"

    const-string v4, "both"

    filled-new-array {v2, v1, v4}, [Ljava/lang/String;

    move-result-object v1

    .line 550
    invoke-static {v1}, Ll/ۙ۟᩻;->֫([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 552
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Invalid scanKind"

    .line 549
    invoke-static {v4, v3, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ۢ(Lbin/mt/json/JSONObject;)Ll/᩶۟᩻;
    .locals 4

    const-string v0, "locator"

    .line 283
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 284
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v1

    if-nez v1, :cond_2

    .line 287
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 290
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "zip_entry:"

    .line 291
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xa

    if-eq v2, v3, :cond_0

    .line 296
    new-instance p0, Ll/᩶۟᩻;

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Ll/᩶۟᩻;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const-string v1, "zip_entry:<entryName>"

    .line 292
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 293
    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 294
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "zip_entry:lib/arm64-v8a/libexample.so"

    invoke-virtual {v2, v0, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "native tools accept only zip_entry locators"

    .line 292
    invoke-static {v3, v0, p0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 288
    :cond_1
    invoke-static {v0, p0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 285
    :cond_2
    invoke-static {v0}, Ll/ۙ۟᩻;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "Missing "

    .line 0
    invoke-static {v0, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 605
    invoke-static {v0, p0, v1, v1, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;)Ll/᩵۟᩻;
    .locals 15

    const-string v8, "maxBlocks"

    const-string v9, "maxInstructions"

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    const-string v2, "locator"

    const-string v3, "addressKind"

    const-string v4, "address"

    const-string v5, "instructionMode"

    const-string v6, "outputMode"

    const-string v7, "maxAnalysisBytes"

    .line 127
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    const-string v0, "workspaceId"

    .line 129
    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "editSessionId"

    .line 130
    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 131
    invoke-static {p0}, Ll/ۙ۟᩻;->ۢ(Lbin/mt/json/JSONObject;)Ll/᩶۟᩻;

    move-result-object v0

    const-string v1, "virtual"

    const-string v4, "file_offset"

    .line 132
    filled-new-array {v1, v4}, [Ljava/lang/String;

    move-result-object v1

    const-string v4, "addressKind"

    invoke-static {p0, v4, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 134
    invoke-static {p0}, Ll/ۙ۟᩻;->᩷(Lbin/mt/json/JSONObject;)Ll/֨۟᩻;

    move-result-object v1

    const-string v4, "arm"

    const-string v5, "thumb"

    const-string v7, "auto"

    .line 135
    filled-new-array {v7, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "instructionMode"

    invoke-static {p0, v5, v4}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v4, "full"

    const-string v5, "summary"

    .line 137
    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "outputMode"

    invoke-static {p0, v5, v4}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/16 v4, 0x10

    const/high16 v5, 0x10000

    const-string v7, "maxAnalysisBytes"

    .line 138
    invoke-static {p0, v7, v4, v5}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v12

    const/16 v4, 0x1000

    const-string v5, "maxBlocks"

    const/4 v7, 0x1

    .line 140
    invoke-static {p0, v5, v7, v4}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v13

    const-string v4, "maxInstructions"

    const/16 v5, 0x2710

    .line 141
    invoke-static {p0, v4, v7, v5}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v14

    .line 143
    new-instance p0, Ll/᩵۟᩻;

    invoke-static {v0}, Ll/᩶۟᩻;->ۧ(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Ll/᩶۟᩻;->֫(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Ll/֨۟᩻;->ۧ(Ll/֨۟᩻;)J

    move-result-wide v7

    invoke-static {v1}, Ll/֨۟᩻;->֫(Ll/֨۟᩻;)Ljava/lang/String;

    move-result-object v9

    move-object v1, p0

    invoke-direct/range {v1 .. v14}, Ll/᩵۟᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    return-object p0
.end method

.method public static ܳ(Lbin/mt/json/JSONObject;)Ll/ܶ۟᩻;
    .locals 14

    const-string v6, "replacementText"

    const-string v7, "paddingMode"

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    const-string v2, "locator"

    const-string v3, "addressKind"

    const-string v4, "address"

    const-string v5, "expectedText"

    .line 187
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    const-string v0, "workspaceId"

    .line 189
    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "editSessionId"

    .line 190
    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 191
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 195
    invoke-static {p0}, Ll/ۙ۟᩻;->ۢ(Lbin/mt/json/JSONObject;)Ll/᩶۟᩻;

    move-result-object v0

    const-string v1, "virtual"

    const-string v4, "file_offset"

    .line 196
    filled-new-array {v1, v4}, [Ljava/lang/String;

    move-result-object v1

    const-string v4, "addressKind"

    invoke-static {p0, v4, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 198
    invoke-static {p0}, Ll/ۙ۟᩻;->᩷(Lbin/mt/json/JSONObject;)Ll/֨۟᩻;

    move-result-object v1

    const-string v4, "expectedText"

    .line 199
    invoke-static {p0, v4}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 200
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "replacementText"

    .line 203
    invoke-static {p0, v5}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 204
    invoke-static {p0, v4, v10}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v11

    .line 205
    invoke-static {p0, v5, v7}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v12

    const-string v4, "null_pad"

    const-string v5, "space_pad"

    const-string v7, "none"

    .line 206
    filled-new-array {v7, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "paddingMode"

    invoke-static {p0, v5, v4}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 208
    new-instance p0, Ll/ܶ۟᩻;

    invoke-static {v0}, Ll/᩶۟᩻;->ۧ(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Ll/᩶۟᩻;->֫(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Ll/֨۟᩻;->ۧ(Ll/֨۟᩻;)J

    move-result-wide v7

    invoke-static {v1}, Ll/֨۟᩻;->֫(Ll/֨۟᩻;)Ljava/lang/String;

    move-result-object v9

    move-object v1, p0

    invoke-direct/range {v1 .. v13}, Ll/ܶ۟᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;[B[BLjava/lang/String;)V

    return-object p0

    .line 201
    :cond_0
    invoke-static {v10}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {v4, p0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_1
    const-string p0, "editSessionId must not be empty for native string patch"

    .line 193
    invoke-static {v3}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    const/4 v2, 0x0

    .line 192
    invoke-static {p0, v0, v1, v2, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ܽ(Lbin/mt/json/JSONObject;)Ll/֡۟᩻;
    .locals 4

    const-string v0, "locator"

    const-string v1, "workspaceId"

    const-string v2, "editSessionId"

    .line 61
    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 62
    invoke-static {p0, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-static {p0, v2}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 64
    invoke-static {p0}, Ll/ۙ۟᩻;->ۢ(Lbin/mt/json/JSONObject;)Ll/᩶۟᩻;

    move-result-object p0

    .line 65
    new-instance v2, Ll/֡۟᩻;

    invoke-static {p0}, Ll/᩶۟᩻;->ۧ(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Ll/᩶۟᩻;->֫(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, v0, v1, v3, p0}, Ll/֡۟᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public static ܿ(Lbin/mt/json/JSONObject;)Ll/۠۟᩻;
    .locals 19

    move-object/from16 v0, p0

    const-string v8, "replacementAssembly"

    const-string v9, "paddingMode"

    const-string v1, "workspaceId"

    const-string v2, "editSessionId"

    const-string v3, "locator"

    const-string v4, "addressKind"

    const-string v5, "address"

    const-string v6, "instructionMode"

    const-string v7, "expectedHex"

    .line 152
    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    const-string v1, "workspaceId"

    .line 154
    invoke-static {v0, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "editSessionId"

    .line 155
    invoke-static {v0, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 156
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_c

    .line 160
    invoke-static/range {p0 .. p0}, Ll/ۙ۟᩻;->ۢ(Lbin/mt/json/JSONObject;)Ll/᩶۟᩻;

    move-result-object v1

    const-string v2, "virtual"

    const-string v5, "file_offset"

    .line 161
    filled-new-array {v2, v5}, [Ljava/lang/String;

    move-result-object v2

    const-string v5, "addressKind"

    invoke-static {v0, v5, v2}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 163
    invoke-static/range {p0 .. p0}, Ll/ۙ۟᩻;->᩷(Lbin/mt/json/JSONObject;)Ll/֨۟᩻;

    move-result-object v2

    const-string v5, "arm"

    const-string v6, "thumb"

    const-string v8, "auto"

    .line 164
    filled-new-array {v8, v5, v6}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "instructionMode"

    invoke-static {v0, v6, v5}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v5, "expectedHex"

    .line 408
    invoke-static {v0, v5}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 409
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_b

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    and-int/lit8 v8, v8, 0x1

    if-nez v8, :cond_b

    .line 412
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    div-int/lit8 v8, v8, 0x2

    const/16 v9, 0x100

    if-gt v8, v9, :cond_a

    .line 419
    new-array v12, v8, [B

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_1

    mul-int/lit8 v10, v9, 0x2

    .line 421
    invoke-virtual {v6, v10}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v14, 0x10

    invoke-static {v13, v14}, Ljava/lang/Character;->digit(CI)I

    move-result v13

    add-int/lit8 v10, v10, 0x1

    .line 422
    invoke-virtual {v6, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    invoke-static {v10, v14}, Ljava/lang/Character;->digit(CI)I

    move-result v10

    if-ltz v13, :cond_0

    if-ltz v10, :cond_0

    shl-int/lit8 v13, v13, 0x4

    or-int/2addr v10, v13

    int-to-byte v10, v10

    .line 426
    aput-byte v10, v12, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 424
    :cond_0
    invoke-static {v6}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {v5, v0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1
    const-string v5, "replacementAssembly"

    .line 167
    invoke-static {v0, v5}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 168
    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_9

    .line 171
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v6

    const/16 v8, 0x1000

    if-gt v6, v8, :cond_8

    const-string v6, ",,"

    const-string v8, "\n"

    .line 435
    invoke-virtual {v14, v6, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "[;\\r\\n]"

    const/4 v9, -0x1

    .line 436
    invoke-virtual {v6, v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    array-length v8, v6

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_7

    aget-object v10, v6, v9

    const/4 v13, 0x0

    .line 460
    :goto_2
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v15

    move-object/from16 v16, v6

    const/16 v6, 0x20

    if-ge v13, v15, :cond_3

    .line 461
    invoke-virtual {v10, v13}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-eq v15, v6, :cond_2

    const/16 v6, 0x9

    if-eq v15, v6, :cond_2

    const/16 v6, 0xa

    if-eq v15, v6, :cond_2

    const/16 v6, 0xd

    if-eq v15, v6, :cond_2

    const/16 v6, 0x2c

    if-eq v15, v6, :cond_2

    const/16 v6, 0x3b

    if-eq v15, v6, :cond_2

    const/16 v6, 0x3a

    if-eq v15, v6, :cond_2

    const/16 v6, 0x5b

    if-eq v15, v6, :cond_2

    const/16 v6, 0x5d

    if-eq v15, v6, :cond_2

    const/16 v6, 0x28

    if-eq v15, v6, :cond_2

    const/16 v6, 0x29

    if-eq v15, v6, :cond_2

    const/16 v6, 0x7b

    if-eq v15, v6, :cond_2

    const/16 v6, 0x7d

    if-eq v15, v6, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v6, v16

    goto :goto_2

    .line 469
    :cond_3
    :goto_3
    invoke-virtual {v10, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0x3a

    .line 438
    invoke-virtual {v6, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    const-string v13, "assembly instructions without assembler directives"

    const-string v15, "replacementAssembly must contain instruction statements only"

    move/from16 v17, v8

    const-string v8, "."

    if-ltz v10, :cond_5

    add-int/lit8 v10, v10, 0x1

    .line 440
    invoke-virtual {v6, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 442
    invoke-virtual {v10, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v18

    if-nez v18, :cond_4

    move-object/from16 v18, v10

    const/16 v10, 0x20

    .line 445
    invoke-virtual {v6, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    if-gez v10, :cond_5

    move-object/from16 v6, v18

    goto :goto_4

    .line 478
    :cond_4
    invoke-static {v14}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v1

    .line 479
    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const/4 v2, 0x0

    .line 476
    invoke-static {v15, v5, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 443
    throw v0

    .line 449
    :cond_5
    :goto_4
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_6

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v6, v16

    move/from16 v8, v17

    goto/16 :goto_1

    .line 478
    :cond_6
    invoke-static {v14}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v1

    .line 479
    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const/4 v2, 0x0

    .line 476
    invoke-static {v15, v5, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 450
    throw v0

    :cond_7
    const-string v5, "none"

    const-string v6, "nop"

    .line 177
    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "paddingMode"

    invoke-static {v0, v6, v5}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 178
    new-instance v0, Ll/۠۟᩻;

    invoke-static {v1}, Ll/᩶۟᩻;->ۧ(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Ll/᩶۟᩻;->֫(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2}, Ll/֨۟᩻;->ۧ(Ll/֨۟᩻;)J

    move-result-wide v8

    invoke-static {v2}, Ll/֨۟᩻;->֫(Ll/֨۟᩻;)Ljava/lang/String;

    move-result-object v10

    .line 180
    invoke-static {v12}, Ll/ۙ۟᩻;->֫([B)Ljava/lang/String;

    move-result-object v13

    move-object v2, v0

    invoke-direct/range {v2 .. v15}, Ll/۠۟᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 173
    :cond_8
    invoke-static {v14}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v1, "1..4096"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "Invalid replacementAssembly"

    const/4 v3, 0x0

    .line 172
    invoke-static {v2, v5, v0, v1, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 169
    :cond_9
    invoke-static {v14}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {v5, v0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 416
    :cond_a
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 417
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "expectedBytes"

    invoke-virtual {v1, v2, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "NATIVE_PATCH_TOO_LARGE"

    const-string v3, "Native instruction patch window is too large."

    const-string v4, "fatal"

    .line 414
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 410
    :cond_b
    invoke-static {v6}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {v5, v0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_c
    const-string v0, "editSessionId must not be empty for native patch"

    .line 158
    invoke-static {v4}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    const/4 v3, 0x0

    .line 157
    invoke-static {v0, v1, v2, v3, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ᩳ(Lbin/mt/json/JSONObject;)Ll/ۚ۟᩻;
    .locals 14

    const-string v0, "address"

    const-string v1, "workspaceId"

    const-string v2, "editSessionId"

    const-string v3, "locator"

    const-string v4, "addressKind"

    .line 89
    filled-new-array {v1, v2, v3, v4, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 90
    invoke-static {p0, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 91
    invoke-static {p0, v2}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 92
    invoke-static {p0}, Ll/ۙ۟᩻;->ۢ(Lbin/mt/json/JSONObject;)Ll/᩶۟᩻;

    move-result-object v0

    const-string v1, "virtual"

    const-string v2, "file_offset"

    .line 93
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v4, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 95
    invoke-static {p0}, Ll/ۙ۟᩻;->᩷(Lbin/mt/json/JSONObject;)Ll/֨۟᩻;

    move-result-object p0

    .line 96
    new-instance v1, Ll/ۚ۟᩻;

    invoke-static {v0}, Ll/᩶۟᩻;->ۧ(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v0}, Ll/᩶۟᩻;->֫(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v9

    invoke-static {p0}, Ll/֨۟᩻;->ۧ(Ll/֨۟᩻;)J

    move-result-wide v11

    invoke-static {p0}, Ll/֨۟᩻;->֫(Ll/֨۟᩻;)Ljava/lang/String;

    move-result-object v13

    move-object v5, v1

    invoke-direct/range {v5 .. v13}, Ll/ۚ۟᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-object v1
.end method

.method public static ᩷(Lbin/mt/json/JSONObject;)Ll/֨۟᩻;
    .locals 5

    const-string v0, "address"

    .line 357
    invoke-static {p0, v0}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 358
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 359
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2d

    if-eq v2, v3, :cond_4

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2b

    if-eq v1, v2, :cond_4

    :try_start_0
    const-string v1, "0x"

    .line 364
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "0X"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0xa

    .line 374
    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x2

    .line 365
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 366
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 369
    invoke-static {v0}, Ll/ᩴ᩸ܿ;->֫(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_2

    .line 379
    :goto_1
    new-instance p0, Ll/֨۟᩻;

    invoke-static {v0, v1}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Ll/֨۟᩻;-><init>(JLjava/lang/String;)V

    return-object p0

    .line 371
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "address overflow"

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 367
    :cond_3
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "empty hex"

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 377
    :catch_0
    invoke-static {p0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 360
    :cond_4
    invoke-static {p0}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ᩻(Lbin/mt/json/JSONObject;)Ll/᩸۟᩻;
    .locals 17

    move-object/from16 v0, p0

    const-string v6, "demangle"

    const-string v7, "limit"

    const-string v1, "workspaceId"

    const-string v2, "editSessionId"

    const-string v3, "locator"

    const-string v4, "itemKind"

    const-string v5, "namePrefix"

    .line 72
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    const-string v1, "workspaceId"

    .line 74
    invoke-static {v0, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "editSessionId"

    .line 75
    invoke-static {v0, v1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 76
    invoke-static/range {p0 .. p0}, Ll/ۙ۟᩻;->ۢ(Lbin/mt/json/JSONObject;)Ll/᩶۟᩻;

    move-result-object v1

    const-string v2, "itemKind"

    .line 507
    invoke-static {v0, v2}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 508
    invoke-static {v7}, Ll/ܶܺۢ;->֫(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v2, "namePrefix"

    .line 78
    invoke-static {v0, v2}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v2, "demangle"

    .line 343
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 344
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v6

    if-nez v6, :cond_1

    .line 347
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 350
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v9

    const/4 v2, 0x1

    const/16 v5, 0x1f4

    const-string v6, "limit"

    .line 80
    invoke-static {v0, v6, v2, v5}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v10

    .line 81
    new-instance v0, Ll/᩸۟᩻;

    invoke-static {v1}, Ll/᩶۟᩻;->ۧ(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Ll/᩶۟᩻;->֫(Ll/᩶۟᩻;)Ljava/lang/String;

    move-result-object v6

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, -0x1

    move-object v2, v0

    .line 645
    invoke-direct/range {v2 .. v16}, Ll/᩸۟᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIIJJ)V

    return-object v0

    .line 348
    :cond_0
    invoke-static {v2, v5}, Ll/ۙ۟᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 345
    :cond_1
    invoke-static {v2}, Ll/ۙ۟᩻;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 511
    :cond_2
    invoke-static {v7}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    sget-object v1, Ll/ܶܺۢ;->֫:[Ljava/lang/String;

    .line 512
    invoke-static {v1}, Ll/ۙ۟᩻;->֫([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 513
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "sections"

    invoke-virtual {v3, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Invalid itemKind"

    .line 511
    invoke-static {v4, v2, v0, v1, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method
