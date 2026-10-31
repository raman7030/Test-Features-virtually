.class public final Ll/ۢۚۢ;
.super Ljava/lang/Object;
.source "M7AP"


# static fields
.field public static final ֫:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 55
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۢۚۢ;->֫:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/᩻ۚۢ;Ll/ۧ᩸ᩳ;)Ljava/util/HashMap;
    .locals 8

    .line 122
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 123
    iget-object v1, p0, Ll/᩻ۚۢ;->ܽ:Ljava/lang/String;

    const-string v2, "path"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    iget-object p0, p0, Ll/᩻ۚۢ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {p0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "name"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lineBreak"

    .line 125
    iget-object v4, p1, Ll/ۧ᩸ᩳ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    iget-object p1, p1, Ll/ۧ᩸ᩳ;->ܽ:Ll/᩺ܶᩳ;

    const-string v2, "?"

    if-nez p1, :cond_0

    goto :goto_0

    .line 283
    :cond_0
    invoke-virtual {p1}, Ll/᩺ܶᩳ;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v2, "AXML"

    goto :goto_0

    .line 286
    :cond_1
    invoke-virtual {p1}, Ll/᩺ܶᩳ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v2, "ABX"

    goto :goto_0

    .line 289
    :cond_2
    invoke-virtual {p1}, Ll/᩺ܶᩳ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v2, "Class"

    goto :goto_0

    .line 292
    :cond_3
    iget v4, p1, Ll/᩺ܶᩳ;->ܽ:I

    if-ltz v4, :cond_4

    .line 273
    sget v5, Ll/ܳ᩷ܽ;->ۡ:I

    if-ge v4, v5, :cond_4

    .line 294
    invoke-static {v4}, Ll/ܳ᩷ܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    :cond_4
    :goto_0
    const-string v4, "textFormatName"

    .line 126
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "unknown"

    if-nez p1, :cond_5

    goto :goto_1

    .line 116
    :cond_5
    iget v4, p1, Ll/᩺ܶᩳ;->᩻:I

    if-nez v4, :cond_6

    const-string v2, "text"

    goto :goto_1

    .line 309
    :cond_6
    invoke-virtual {p1}, Ll/᩺ܶᩳ;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_7

    const-string v2, "axml"

    goto :goto_1

    .line 312
    :cond_7
    invoke-virtual {p1}, Ll/᩺ܶᩳ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_8

    const-string v2, "abx"

    goto :goto_1

    .line 315
    :cond_8
    invoke-virtual {p1}, Ll/᩺ܶᩳ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_9

    const-string v2, "class"

    :cond_9
    :goto_1
    const-string v4, "textFormatType"

    .line 127
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_a

    .line 116
    iget v2, p1, Ll/᩺ܶᩳ;->᩻:I

    if-nez v2, :cond_a

    .line 325
    iget v2, p1, Ll/᩺ܶᩳ;->ܽ:I

    if-ltz v2, :cond_a

    .line 273
    sget v4, Ll/ܳ᩷ܽ;->ۡ:I

    if-ge v2, v4, :cond_a

    goto :goto_2

    :cond_a
    const/4 v2, -0x1

    .line 128
    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "charsetIndex"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_b

    .line 116
    iget v2, p1, Ll/᩺ܶᩳ;->᩻:I

    if-nez v2, :cond_b

    .line 338
    new-instance v2, Ljava/util/ArrayList;

    sget v4, Ll/ܳ᩷ܽ;->ۡ:I

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    .line 339
    :goto_3
    sget v5, Ll/ܳ᩷ܽ;->ۡ:I

    if-ge v4, v5, :cond_c

    .line 340
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v6, "index"

    .line 341
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    invoke-static {v4}, Ll/ܳ᩷ܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 336
    :cond_b
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_c
    const-string v3, "availableCharsets"

    .line 129
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    new-instance v2, Ll/ۤۜܽ;

    invoke-direct {v2}, Ll/ۤۜܽ;-><init>()V

    const v3, 0x4d545854    # 2.22659904E8f

    .line 390
    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v3, 0x1

    .line 391
    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 392
    invoke-virtual {v2, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 393
    invoke-virtual {p1, v2}, Ll/᩺ܶᩳ;->֫(Ll/ۤۜܽ;)V

    .line 394
    invoke-virtual {v2}, Ll/ۤۜܽ;->ۖ()[B

    move-result-object p1

    .line 395
    invoke-static {p1}, Ll/ۢۚۢ;->֫([B)[B

    move-result-object v1

    .line 396
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v3, 0xb

    .line 467
    invoke-static {p1, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    .line 396
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    invoke-static {v1, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    .line 396
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "parametersToken"

    .line 130
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    invoke-interface {p0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string v1, "size"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    invoke-interface {p0}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide p0

    invoke-static {p0, p1}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object p0

    const-string p1, "time"

    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static ֫(Ljava/util/HashMap;Ljava/lang/CharSequence;)Ll/۠ܳܳ;
    .locals 5

    .line 140
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/util/Map;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MTTEXTREAD/1\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v1, p0

    const-string v2, "\n"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 141
    sget-object v1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 157
    array-length v1, v0

    array-length v2, p0

    add-int/2addr v1, v2

    new-array v2, v1, [B

    .line 158
    array-length v3, v0

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 159
    array-length v0, v0

    array-length v3, p0

    invoke-static {p0, v4, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 143
    invoke-static {p1}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result p0

    int-to-long v3, p0

    int-to-long v0, v1

    add-long/2addr v0, v3

    .line 145
    sget-object p0, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    new-instance v3, Ll/ܳۚۢ;

    invoke-direct {v3, v2, p1}, Ll/ܳۚۢ;-><init>([BLjava/lang/CharSequence;)V

    const-string p1, "application/vnd.mt.text-file+raw; charset=UTF-8"

    invoke-static {p0, p1, v3, v0, v1}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/io/InputStream;J)Ll/۠ܳܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩷ۚۢ;
    .locals 6

    const/16 v0, 0x2e

    if-nez p0, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    .line 403
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    :goto_0
    if-lez v1, :cond_4

    .line 404
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-ne v1, v0, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    if-ge v1, v0, :cond_4

    const/4 v0, 0x0

    .line 407
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0xb

    .line 474
    invoke-static {v0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 408
    invoke-static {v0}, Ll/ۢۚۢ;->֫([B)[B

    move-result-object v4

    add-int/2addr v1, v2

    .line 409
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 474
    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    .line 410
    invoke-static {v4, p0}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 414
    invoke-static {v0}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object p0

    .line 415
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const v1, 0x4d545854    # 2.22659904E8f

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-ne v0, v2, :cond_2

    .line 418
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    .line 419
    new-instance v1, Ll/᩺ܶᩳ;

    invoke-direct {v1, p0}, Ll/᩺ܶᩳ;-><init>(Ll/۬ۜܽ;)V

    .line 420
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-nez p0, :cond_1

    .line 423
    new-instance p0, Ll/᩷ۚۢ;

    invoke-direct {p0, v0, v1}, Ll/᩷ۚۢ;-><init>(Ljava/lang/String;Ll/᩺ܶᩳ;)V

    return-object p0

    .line 421
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unexpected token tail"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 416
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid token version"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 411
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid token signature"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 405
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid token"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(Ljava/lang/String;Z)Ll/᩻ۚۢ;
    .locals 6

    .line 226
    invoke-static {p1}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 234
    invoke-static {p1}, Ll/ۜ᩵ۢ;->֫(Ljava/lang/String;)Ll/ۢۧ᩻;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 235
    invoke-virtual {v0}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 239
    :cond_0
    invoke-virtual {v0}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 240
    sget-object p2, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v0, 0x7f120828

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p2

    .line 240
    invoke-static {p1, p2}, Ll/᩻ۚۢ;->֫(Ljava/lang/String;Ll/۠ܳܳ;)Ll/᩻ۚۢ;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz p2, :cond_2

    .line 243
    invoke-virtual {v0}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v2

    const-wide/32 v4, 0x500000

    cmp-long p2, v2, v4

    if-lez p2, :cond_2

    .line 244
    sget-object p2, Ll/֨ܳܳ;->ۢ֫:Ll/֨ܳܳ;

    const v0, 0x7f12085e

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p2

    .line 244
    invoke-static {p1, p2}, Ll/᩻ۚۢ;->֫(Ljava/lang/String;Ll/۠ܳܳ;)Ll/᩻ۚۢ;

    move-result-object p1

    return-object p1

    .line 247
    :cond_2
    invoke-static {p1, v0}, Ll/᩻ۚۢ;->֫(Ljava/lang/String;Ll/ۢۧ᩻;)Ll/᩻ۚۢ;

    move-result-object p1

    return-object p1

    .line 236
    :cond_3
    :goto_0
    sget-object p2, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    const v0, 0x7f120822

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p2

    .line 236
    invoke-static {p1, p2}, Ll/᩻ۚۢ;->֫(Ljava/lang/String;Ll/۠ܳܳ;)Ll/᩻ۚۢ;

    move-result-object p1

    return-object p1
.end method

.method public static ֫(Ll/ۧ᩸ᩳ;)V
    .locals 1

    .line 254
    iget-object p0, p0, Ll/ۧ᩸ᩳ;->ۧ:Ljava/util/ArrayList;

    if-nez p0, :cond_0

    goto :goto_1

    .line 257
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 258
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static ֫()[B
    .locals 6

    .line 430
    sget-object v0, Ll/ۢۚۢ;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 431
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    const-string v2, "remote_text"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "parameters_hmac_key"

    const/4 v3, 0x0

    .line 432
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 433
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v4, 0x20

    const/16 v5, 0xb

    if-nez v3, :cond_0

    .line 474
    :try_start_1
    invoke-static {v2, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    .line 436
    array-length v3, v2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v3, v4, :cond_0

    .line 437
    :try_start_2
    monitor-exit v0

    return-object v2

    :catch_0
    :cond_0
    new-array v2, v4, [B

    .line 444
    new-instance v3, Ljava/security/SecureRandom;

    invoke-direct {v3}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v3, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 445
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "parameters_hmac_key"

    .line 467
    invoke-static {v2, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    .line 445
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 446
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 447
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public static ֫([B)[B
    .locals 4

    const-string v0, "HmacSHA256"

    .line 455
    :try_start_0
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v1

    .line 456
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    invoke-static {}, Ll/ۢۚۢ;->֫()[B

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v1, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 457
    invoke-virtual {v1, p0}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 459
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ۧ(Ll/ܺܳܳ;)Ll/ۜۚۢ;
    .locals 3

    .line 353
    new-instance v0, Ll/ۜۚۢ;

    .line 514
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "path"

    .line 40
    invoke-static {p0, v1}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 354
    invoke-static {v0, v1}, Ll/ۜۚۢ;->ܽ(Ll/ۜۚۢ;Ljava/lang/String;)V

    .line 375
    invoke-virtual {p0}, Ll/ܺܳܳ;->ܺ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 376
    invoke-virtual {p0}, Ll/ܺܳܳ;->ܽ()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 378
    :cond_0
    invoke-static {p0}, Ll/ܿۚۢ;->ۧ(Ll/ܺܳܳ;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 381
    invoke-static {p0}, Ll/ܿۚۢ;->ܳ(Ll/ܺܳܳ;)J

    move-result-wide v1

    .line 382
    invoke-static {p0, v1, v2}, Ll/ܿۚۢ;->֫(Ll/ܺܳܳ;J)Ll/ᩳۚۢ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳۚۢ;->ۧ:Ljava/lang/String;

    .line 355
    :goto_0
    invoke-static {v0, v1}, Ll/ۜۚۢ;->ᩳ(Ll/ۜۚۢ;Ljava/lang/String;)V

    const-string v1, "lineBreak"

    .line 356
    invoke-static {p0, v1}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۜۚۢ;->֫(Ll/ۜۚۢ;Ljava/lang/String;)V

    const-string v1, "X-MT-Text-Parameters-Token"

    .line 357
    invoke-static {p0, v1}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۜۚۢ;->ۧ(Ll/ۜۚۢ;Ljava/lang/String;)V

    const-string v1, "charsetIndex"

    .line 358
    invoke-static {p0, v1}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 359
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 360
    invoke-static {v0}, Ll/ۜۚۢ;->᩻(Ll/ۜۚۢ;)V

    .line 362
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {v0, p0}, Ll/ۜۚۢ;->֫(Ll/ۜۚۢ;I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 364
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "charsetIndex is invalid"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    return-object v0

    .line 379
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Transfer-Encoding is not supported"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 6

    .line 77
    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v0

    .line 78
    sget-object v1, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const v3, 0x7f12073e

    const/4 v4, 0x0

    if-eqz v1, :cond_5

    const-string v0, "path"

    .line 40
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 92
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v3, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 95
    :cond_0
    invoke-direct {p0, p1, v2}, Ll/ۢۚۢ;->֫(Ljava/lang/String;Z)Ll/᩻ۚۢ;

    move-result-object p1

    .line 96
    iget-object v0, p1, Ll/᩻ۚۢ;->֫:Ll/۠ܳܳ;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const v0, 0x7f120860

    .line 100
    :try_start_0
    new-instance v1, Ll/ۙܶᩳ;

    iget-object v2, p1, Ll/᩻ۚۢ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {v2}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/ۙܶᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    new-instance v2, Ll/ۨۘᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, -0x1

    invoke-static {v1, v3, v2}, Ll/ܿ᩸ᩳ;->֫(Ll/ۙܶᩳ;ILl/ܿۖ᩷;)Ll/ۧ᩸ᩳ;

    move-result-object v1

    if-nez v1, :cond_2

    .line 102
    sget-object p1, Ll/֨ܳܳ;->ܰ:Ll/֨ܳܳ;

    new-array v1, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 104
    :cond_2
    iget-object v2, v1, Ll/ۧ᩸ᩳ;->ۧ:Ljava/util/ArrayList;

    if-eqz v2, :cond_3

    .line 105
    invoke-static {v1}, Ll/ۢۚۢ;->֫(Ll/ۧ᩸ᩳ;)V

    .line 106
    sget-object p1, Ll/֨ܳܳ;->ۢ֫:Ll/֨ܳܳ;

    new-array v1, v4, [Ljava/lang/Object;

    const v2, 0x7f12085e

    .line 62
    invoke-static {v2, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 108
    :cond_3
    iget-object v2, v1, Ll/ۧ᩸ᩳ;->ᩳ:Ljava/lang/CharSequence;

    if-nez v2, :cond_4

    const-string v2, ""

    .line 109
    :cond_4
    invoke-static {p1, v1}, Ll/ۢۚۢ;->֫(Ll/᩻ۚۢ;Ll/ۧ᩸ᩳ;)Ljava/util/HashMap;

    move-result-object p1

    invoke-static {p1, v2}, Ll/ۢۚۢ;->֫(Ljava/util/HashMap;Ljava/lang/CharSequence;)Ll/۠ܳܳ;

    move-result-object p1
    :try_end_0
    .catch Ll/֫ۛۡ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/᩵ۤۡ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 114
    :catch_0
    sget-object p1, Ll/֨ܳܳ;->ܰ:Ll/֨ܳܳ;

    new-array v1, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    .line 112
    :goto_1
    sget-object v0, Ll/֨ܳܳ;->ܰ:Ll/֨ܳܳ;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    :goto_2
    return-object p1

    .line 81
    :cond_5
    sget-object v1, Ll/ۘܳܳ;->ۧ֫:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 169
    :try_start_1
    invoke-static {p1}, Ll/ۢۚۢ;->ۧ(Ll/ܺܳܳ;)Ll/ۜۚۢ;

    move-result-object p1
    :try_end_1
    .catch Ll/ۧۚۢ; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ll/ܽۚۢ; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_5

    .line 174
    invoke-static {p1}, Ll/ۜۚۢ;->ܿ(Ll/ۜۚۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 175
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v3, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 177
    :cond_6
    invoke-static {p1}, Ll/ۜۚۢ;->ܳ(Ll/ۜۚۢ;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120827

    if-nez v0, :cond_7

    .line 178
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "text"

    aput-object v2, v0, v4

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 180
    :cond_7
    invoke-static {p1}, Ll/ۜۚۢ;->ܽ(Ll/ۜۚۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 181
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "lineBreak"

    aput-object v2, v0, v4

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 183
    :cond_8
    invoke-static {p1}, Ll/ۜۚۢ;->ᩳ(Ll/ۜۚۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 184
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "parametersToken"

    aput-object v2, v0, v4

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 186
    :cond_9
    invoke-static {p1}, Ll/ۜۚۢ;->ܽ(Ll/ۜۚۢ;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    .line 266
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const v2, 0x7f12082e

    if-nez v1, :cond_b

    const-string v1, "\r\n"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    const-string v1, "\r"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_3

    .line 187
    :cond_a
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v2, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 190
    :cond_b
    :goto_3
    invoke-static {p1}, Ll/ۜۚۢ;->ܿ(Ll/ۜۚۢ;)Ljava/lang/String;

    move-result-object v0

    .line 226
    invoke-static {v0}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 193
    :try_start_2
    invoke-static {p1}, Ll/ۜۚۢ;->ᩳ(Ll/ۜۚۢ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۢۚۢ;->֫(Ljava/lang/String;)Ll/᩷ۚۢ;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_4

    .line 197
    invoke-static {v1}, Ll/᩷ۚۢ;->ۧ(Ll/᩷ۚۢ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    .line 198
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v2, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 200
    :cond_c
    invoke-static {p1}, Ll/ۜۚۢ;->ۧ(Ll/ۜۚۢ;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 201
    invoke-static {v1}, Ll/᩷ۚۢ;->֫(Ll/᩷ۚۢ;)Ll/᩺ܶᩳ;

    move-result-object v3

    .line 116
    iget v3, v3, Ll/᩺ܶᩳ;->᩻:I

    if-nez v3, :cond_d

    .line 201
    invoke-static {p1}, Ll/ۜۚۢ;->֫(Ll/ۜۚۢ;)I

    move-result v3

    if-ltz v3, :cond_d

    .line 273
    sget v5, Ll/ܳ᩷ܽ;->ۡ:I

    if-ge v3, v5, :cond_d

    .line 204
    invoke-static {v1}, Ll/᩷ۚۢ;->֫(Ll/᩷ۚۢ;)Ll/᩺ܶᩳ;

    move-result-object v2

    invoke-static {p1}, Ll/ۜۚۢ;->֫(Ll/ۜۚۢ;)I

    move-result v3

    iput v3, v2, Ll/᩺ܶᩳ;->ܽ:I

    goto :goto_4

    .line 202
    :cond_d
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v2, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 207
    :cond_e
    :goto_4
    invoke-direct {p0, v0, v4}, Ll/ۢۚۢ;->֫(Ljava/lang/String;Z)Ll/᩻ۚۢ;

    move-result-object v2

    .line 208
    iget-object v3, v2, Ll/᩻ۚۢ;->֫:Ll/۠ܳܳ;

    if-eqz v3, :cond_f

    return-object v3

    .line 212
    :cond_f
    :try_start_3
    new-instance v3, Ll/ۙܶᩳ;

    iget-object v2, v2, Ll/᩻ۚۢ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {v2}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-direct {v3, v2}, Ll/ۙܶᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-static {p1}, Ll/ۜۚۢ;->ܳ(Ll/ۜۚۢ;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Ll/ۜۚۢ;->ܽ(Ll/ۜۚۢ;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1}, Ll/᩷ۚۢ;->֫(Ll/᩷ۚۢ;)Ll/᩺ܶᩳ;

    move-result-object v1

    invoke-static {v3, v2, p1, v1}, Ll/֨᩸ᩳ;->֫(Ll/ۗܶᩳ;Ljava/lang/CharSequence;Ljava/lang/String;Ll/᩺ܶᩳ;)V

    new-array p1, v4, [Ljava/lang/String;

    .line 213
    invoke-static {v0, p1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 214
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "item"

    .line 215
    new-instance v2, Ll/ۢۧ᩻;

    invoke-direct {v2, p1}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-static {v2}, Ll/᩷᩵ۢ;->֫(Ll/ᩳۜܳ;)Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    invoke-static {v0}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    return-object p1

    .line 218
    :catch_3
    sget-object p1, Ll/֨ܳܳ;->ܰ:Ll/֨ܳܳ;

    const v0, 0x7f120861

    new-array v1, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    .line 195
    :catch_4
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v2, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    .line 172
    :catch_5
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v0, 0x7f12082b

    new-array v1, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 84
    :cond_10
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method
