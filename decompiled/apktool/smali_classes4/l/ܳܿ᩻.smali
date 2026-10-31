.class public final Ll/ܳܿ᩻;
.super Ljava/lang/Object;
.source "195F"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1355
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 1356
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_6

    .line 1357
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5c

    if-ne v2, v3, :cond_5

    add-int/lit8 v4, v1, 0x1

    .line 1358
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v4, v5, :cond_0

    goto :goto_2

    .line 1362
    :cond_0
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x6e

    if-ne v1, v2, :cond_1

    const/16 v1, 0xa

    .line 1364
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/16 v2, 0x72

    if-ne v1, v2, :cond_2

    const/16 v1, 0xd

    .line 1366
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const/16 v2, 0x74

    if-ne v1, v2, :cond_3

    const/16 v1, 0x9

    .line 1368
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    if-ne v1, v3, :cond_4

    .line 1370
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1372
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    move v1, v4

    goto :goto_3

    .line 1359
    :cond_5
    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1375
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫ᩳ᩻;Ll/᩶ᩳ᩻;Ll/ۛᩳ᩻;Ll/ۧܿ᩻;Ll/᩵ۛۡ;Ll/᩻ۨۡ;Ljava/lang/String;)Ll/᩺ᩳ᩻;
    .locals 4

    const/4 v0, 0x0

    .line 918
    :try_start_0
    invoke-virtual {p0}, Ll/۫ᩳ᩻;->֫()Ljava/io/InputStream;

    move-result-object p0

    .line 919
    new-instance v1, Ll/ۗᩳ᩻;

    invoke-direct {v1, p0, p4}, Ll/ۗᩳ᩻;-><init>(Ljava/io/InputStream;Ll/᩵ۛۡ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 920
    :try_start_1
    iget p0, p2, Ll/ۛᩳ᩻;->ܽ:I

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p0, :cond_1

    .line 1455
    invoke-virtual {v1}, Ll/ۗᩳ᩻;->read()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    .line 1456
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unexpected end of file while skipping BOM"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 921
    :cond_1
    iget-object p0, p2, Ll/ۛᩳ᩻;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object p0

    sget-object p2, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 922
    invoke-virtual {p0, p2}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object p0

    .line 923
    invoke-virtual {p0, p2}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object p0

    if-nez p3, :cond_2

    .line 924
    new-instance p2, Ll/۬ᩳ᩻;

    .line 1729
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    goto :goto_1

    :cond_2
    move-object p2, v0

    .line 925
    :goto_1
    :try_start_2
    new-instance p4, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, v1, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/CharsetDecoder;)V

    invoke-direct {p4, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 926
    :try_start_3
    new-instance p0, Ll/ۤᩳ᩻;

    invoke-direct {p0, p4, p2}, Ll/ۤᩳ᩻;-><init>(Ljava/io/BufferedReader;Ll/۬ᩳ᩻;)V

    if-nez p3, :cond_3

    .line 927
    new-instance v0, Ll/ۙᩳ᩻;

    .line 1489
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_3
    if-nez p3, :cond_4

    move-object p3, v0

    .line 929
    :cond_4
    iget v0, p1, Ll/᩶ᩳ᩻;->۫:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_5

    .line 930
    invoke-static {p0, p1, p3, p5}, Ll/ܳܿ᩻;->֫(Ll/ۤᩳ᩻;Ll/᩶ᩳ᩻;Ll/֫ܿ᩻;Ll/᩻ۨۡ;)V

    goto :goto_2

    .line 932
    :cond_5
    invoke-static {p0, p1, p3, p5}, Ll/ܳܿ᩻;->ۧ(Ll/ۤᩳ᩻;Ll/᩶ᩳ᩻;Ll/֫ܿ᩻;Ll/᩻ۨۡ;)V

    :goto_2
    if-nez p2, :cond_6

    goto :goto_3

    .line 934
    :cond_6
    invoke-virtual {p2}, Ll/۬ᩳ᩻;->֫()Ljava/lang/String;

    move-result-object p6

    .line 935
    :goto_3
    new-instance p0, Ll/᩺ᩳ᩻;

    invoke-interface {p3}, Ll/֫ܿ᩻;->ۧ()I

    move-result p1

    invoke-direct {p0, p1, p6}, Ll/᩺ᩳ᩻;-><init>(ILjava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 936
    :try_start_4
    invoke-virtual {p4}, Ljava/io/Reader;->close()V
    :try_end_4
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 941
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 925
    :try_start_5
    invoke-virtual {p4}, Ljava/io/Reader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    :try_start_6
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0
    :try_end_6
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catch_0
    move-exception p0

    .line 937
    :try_start_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid text encoding"

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p0

    move-object v0, v1

    goto :goto_5

    :catchall_3
    move-exception p0

    :goto_5
    if-eqz v0, :cond_7

    .line 941
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 943
    :cond_7
    throw p0
.end method

.method public static ֫(Ll/ۤᩳ᩻;ILl/֫ܿ᩻;Ll/᩻ۨۡ;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    .line 975
    :cond_0
    invoke-virtual {p0}, Ll/ۤᩳ᩻;->ۧ()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    .line 1465
    iget-object v0, p3, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/۟ᩳ᩻;

    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    .line 978
    invoke-interface {p2, v2}, Ll/֫ܿ᩻;->֫(I)V

    add-int/lit8 v1, v1, 0x1

    const/4 v0, 0x1

    if-ne v1, p1, :cond_0

    .line 981
    invoke-interface {p2}, Ll/֫ܿ᩻;->֫()V

    goto :goto_0

    .line 1466
    :cond_1
    new-instance p0, Ll/ۨᩳ᩻;

    .line 1812
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 1466
    throw p0

    :cond_2
    if-eqz v0, :cond_4

    if-lez v1, :cond_3

    goto :goto_1

    :cond_3
    return-void

    .line 986
    :cond_4
    :goto_1
    invoke-interface {p2}, Ll/֫ܿ᩻;->֫()V

    return-void
.end method

.method public static ֫(Ll/ۤᩳ᩻;Ll/᩶ᩳ᩻;Ll/֫ܿ᩻;Ll/᩻ۨۡ;)V
    .locals 6

    .line 951
    iget v0, p1, Ll/᩶ᩳ᩻;->ۛ:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_9

    const v1, 0x3b9ac9ff

    if-gt v0, v1, :cond_9

    .line 955
    iget-boolean p1, p1, Ll/᩶ᩳ᩻;->ۨ:Z

    if-nez p1, :cond_0

    .line 956
    invoke-static {p0, v0, p2, p3}, Ll/ܳܿ᩻;->֫(Ll/ۤᩳ᩻;ILl/֫ܿ᩻;Ll/᩻ۨۡ;)V

    return-void

    .line 959
    :cond_0
    div-int/lit8 p1, v0, 0xa

    const/16 v1, 0x1000

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-gtz p1, :cond_1

    .line 961
    invoke-static {p0, v0, p2, p3}, Ll/ܳܿ᩻;->֫(Ll/ۤᩳ᩻;ILl/֫ܿ᩻;Ll/᩻ۨۡ;)V

    return-void

    .line 995
    :cond_1
    new-instance v1, Ll/ܽܿ᩻;

    add-int/lit8 v2, p1, 0x1

    invoke-direct {v1, v2}, Ll/ܽܿ᩻;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    .line 999
    :goto_1
    invoke-virtual {p0}, Ll/ۤᩳ᩻;->ۧ()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_6

    .line 1465
    iget-object v2, p3, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/۟ᩳ᩻;

    invoke-virtual {v2}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-nez v2, :cond_5

    .line 1002
    invoke-virtual {v1, v4}, Ll/ܽܿ᩻;->֫(I)V

    .line 1003
    :goto_2
    invoke-virtual {v1}, Ll/ܽܿ᩻;->ۧ()I

    move-result v2

    if-le v2, p1, :cond_2

    .line 1004
    invoke-virtual {v1, p2}, Ll/ܽܿ᩻;->֫(Ll/֫ܿ᩻;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 1007
    :cond_2
    invoke-virtual {v1}, Ll/ܽܿ᩻;->ۧ()I

    move-result v2

    add-int/2addr v2, v3

    if-ne v2, v0, :cond_4

    .line 1008
    invoke-virtual {v1}, Ll/ܽܿ᩻;->֫()I

    move-result v2

    if-eq v2, v5, :cond_3

    add-int/lit8 v2, v2, 0x1

    .line 1010
    invoke-virtual {v1, v2, p2}, Ll/ܽܿ᩻;->֫(ILl/֫ܿ᩻;)V

    .line 1011
    invoke-interface {p2}, Ll/֫ܿ᩻;->֫()V

    goto :goto_3

    .line 1013
    :cond_3
    invoke-virtual {v1, p2}, Ll/ܽܿ᩻;->ۧ(Ll/֫ܿ᩻;)V

    .line 1014
    invoke-interface {p2}, Ll/֫ܿ᩻;->֫()V

    :goto_3
    const/4 v2, 0x1

    goto :goto_0

    :cond_4
    const/4 v2, 0x1

    goto :goto_1

    .line 1466
    :cond_5
    new-instance p0, Ll/ۨᩳ᩻;

    .line 1812
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 1466
    throw p0

    :cond_6
    if-eqz v2, :cond_8

    if-gtz v3, :cond_8

    .line 1019
    invoke-virtual {v1}, Ll/ܽܿ᩻;->ۧ()I

    move-result p0

    if-lez p0, :cond_7

    goto :goto_4

    :cond_7
    return-void

    .line 1020
    :cond_8
    :goto_4
    invoke-virtual {v1, p2}, Ll/ܽܿ᩻;->ۧ(Ll/֫ܿ᩻;)V

    .line 1021
    invoke-interface {p2}, Ll/֫ܿ᩻;->֫()V

    return-void

    .line 953
    :cond_9
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Text length is invalid"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/۫ᩳ᩻;Ll/ܰᩳ᩻;Ll/᩶ᩳ᩻;Ll/᩵ۛۡ;Ll/᩻ۨۡ;)V
    .locals 16

    move-object/from16 v0, p2

    .line 893
    iget-object v1, v0, Ll/᩶ᩳ᩻;->᩸:Ljava/lang/String;

    const v2, 0x8000

    new-array v3, v2, [B

    .line 1423
    new-instance v4, Ljava/io/BufferedInputStream;

    invoke-virtual/range {p0 .. p0}, Ll/۫ᩳ᩻;->֫()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v2, :cond_0

    sub-int v7, v2, v6

    .line 1425
    :try_start_0
    invoke-virtual {v4, v3, v6, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v8, -0x1

    if-eq v7, v8, :cond_0

    add-int/2addr v6, v7

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 1423
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1

    .line 1428
    :cond_0
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 1429
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    if-nez v1, :cond_1

    const-string v1, ""

    goto :goto_2

    .line 1402
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 1403
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_9

    .line 1404
    array-length v1, v2

    invoke-static {v1, v2}, Ll/ܳ᩷ܽ;->ۧ(I[B)I

    move-result v1

    .line 1405
    invoke-static {v1}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v3

    .line 1436
    sget v6, Ll/ܳ᩷ܽ;->᩵:I

    if-eq v1, v6, :cond_2

    sget v6, Ll/ܳ᩷ܽ;->֡:I

    if-ne v1, v6, :cond_3

    .line 6
    :cond_2
    array-length v6, v2

    invoke-static {v6, v2}, Ll/ۧ᩷ܽ;->ܿ(I[B)Z

    move-result v6

    if-eqz v6, :cond_3

    const/4 v5, 0x3

    goto :goto_5

    .line 1438
    :cond_3
    sget v6, Ll/ܳ᩷ܽ;->ܺ:I

    if-ne v1, v6, :cond_4

    .line 20
    array-length v6, v2

    invoke-static {v6, v2}, Ll/ۧ᩷ܽ;->֫(I[B)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_3

    .line 1440
    :cond_4
    sget v6, Ll/ܳ᩷ܽ;->ۖ:I

    if-ne v1, v6, :cond_5

    .line 33
    array-length v6, v2

    invoke-static {v6, v2}, Ll/ۧ᩷ܽ;->ۧ(I[B)Z

    move-result v6

    if-eqz v6, :cond_5

    :goto_3
    const/4 v5, 0x2

    goto :goto_5

    .line 1442
    :cond_5
    sget v6, Ll/ܳ᩷ܽ;->ۘ:I

    if-ne v1, v6, :cond_6

    .line 46
    array-length v6, v2

    invoke-static {v6, v2}, Ll/ۧ᩷ܽ;->ܽ(I[B)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_4

    .line 1444
    :cond_6
    sget v6, Ll/ܳ᩷ܽ;->ᩴ:I

    if-ne v1, v6, :cond_7

    .line 61
    array-length v1, v2

    invoke-static {v1, v2}, Ll/ۧ᩷ܽ;->ᩳ(I[B)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_4
    const/4 v5, 0x4

    :cond_7
    :goto_5
    if-nez v5, :cond_8

    goto :goto_6

    .line 1407
    :cond_8
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v4

    .line 1408
    :goto_6
    new-instance v1, Ll/ۛᩳ᩻;

    invoke-direct {v1, v3, v5, v4}, Ll/ۛᩳ᩻;-><init>(Ljava/nio/charset/Charset;I[B)V

    goto :goto_7

    :cond_9
    const-string v3, "UTF-8-BOM"

    .line 1410
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 6
    array-length v1, v2

    invoke-static {v1, v2}, Ll/ۧ᩷ܽ;->ܿ(I[B)Z

    move-result v1

    if-eqz v1, :cond_a

    const/4 v5, 0x3

    .line 1412
    :cond_a
    new-instance v1, Ll/ۛᩳ᩻;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {}, Ll/᩻ܿ᩻;->᩻()[B

    move-result-object v3

    invoke-direct {v1, v2, v5, v3}, Ll/ۛᩳ᩻;-><init>(Ljava/nio/charset/Charset;I[B)V

    :goto_7
    move-object v8, v1

    goto :goto_8

    .line 1414
    :cond_b
    new-instance v2, Ll/ۛᩳ᩻;

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v2, v1, v5, v4}, Ll/ۛᩳ᩻;-><init>(Ljava/nio/charset/Charset;I[B)V

    move-object v8, v2

    :goto_8
    const/4 v4, 0x0

    const-string v7, "\n"

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object v3, v8

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    .line 894
    invoke-static/range {v1 .. v7}, Ll/ܳܿ᩻;->֫(Ll/۫ᩳ᩻;Ll/᩶ᩳ᩻;Ll/ۛᩳ᩻;Ll/ۧܿ᩻;Ll/᩵ۛۡ;Ll/᩻ۨۡ;Ljava/lang/String;)Ll/᩺ᩳ᩻;

    move-result-object v1

    .line 895
    iget v2, v1, Ll/᩺ᩳ᩻;->ۧ:I

    if-eqz v2, :cond_c

    .line 898
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v11

    .line 899
    new-instance v15, Ll/ۧܿ᩻;

    iget-object v7, v1, Ll/᩺ᩳ᩻;->֫:Ljava/lang/String;

    iget-object v12, v8, Ll/ۛᩳ᩻;->֫:Ljava/nio/charset/Charset;

    iget-object v13, v8, Ll/ۛᩳ᩻;->ۧ:[B

    move-object v9, v15

    move-object/from16 v10, p1

    move-object v14, v7

    invoke-direct/range {v9 .. v14}, Ll/ۧܿ᩻;-><init>(Ll/ܰᩳ᩻;ILjava/nio/charset/Charset;[BLjava/lang/String;)V

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object v3, v8

    move-object v4, v15

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    .line 901
    :try_start_2
    invoke-static/range {v1 .. v7}, Ll/ܳܿ᩻;->֫(Ll/۫ᩳ᩻;Ll/᩶ᩳ᩻;Ll/ۛᩳ᩻;Ll/ۧܿ᩻;Ll/᩵ۛۡ;Ll/᩻ۨۡ;Ljava/lang/String;)Ll/᩺ᩳ᩻;
    :try_end_2
    .catch Ll/ۨᩳ᩻; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 906
    invoke-virtual {v15}, Ll/ۧܿ᩻;->ᩳ()V

    return-void

    :catchall_2
    move-exception v0

    goto :goto_9

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 903
    :try_start_3
    invoke-virtual {v15}, Ll/ۧܿ᩻;->ܽ()V

    .line 904
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 906
    :goto_9
    invoke-virtual {v15}, Ll/ۧܿ᩻;->ᩳ()V

    .line 907
    throw v0

    .line 896
    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "No content to output"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ(Ll/ۤᩳ᩻;Ll/᩶ᩳ᩻;Ll/֫ܿ᩻;Ll/᩻ۨۡ;)V
    .locals 7

    .line 1126
    iget-object v0, p1, Ll/᩶ᩳ᩻;->᩺:Ljava/lang/String;

    invoke-static {v0}, Ll/ܳܿ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1382
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1383
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 1384
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0xd

    if-ne v4, v5, :cond_1

    add-int/lit8 v4, v3, 0x1

    .line 1386
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v6, 0xa

    if-ge v4, v5, :cond_0

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v6, :cond_0

    move v3, v4

    .line 1389
    :cond_0
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1391
    :cond_1
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1394
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1127
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 1130
    new-instance v1, Ll/ܿܿ᩻;

    invoke-direct {v1, p2, p1}, Ll/ܿܿ᩻;-><init>(Ll/֫ܿ᩻;Ll/᩶ᩳ᩻;)V

    .line 1131
    new-instance p1, Ll/ᩳܿ᩻;

    invoke-direct {p1, v0, v1}, Ll/ᩳܿ᩻;-><init>(Ljava/lang/String;Ll/ܿܿ᩻;)V

    .line 1134
    :goto_2
    invoke-virtual {p0}, Ll/ۤᩳ᩻;->֫()I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_4

    .line 1465
    iget-object v2, p3, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/۟ᩳ᩻;

    invoke-virtual {v2}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-nez v2, :cond_3

    int-to-char v0, v0

    .line 1137
    invoke-virtual {p1, v0}, Ll/ᩳܿ᩻;->֫(C)V

    const/4 v2, 0x1

    goto :goto_2

    .line 1466
    :cond_3
    new-instance p0, Ll/ۨᩳ᩻;

    .line 1812
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 1466
    throw p0

    .line 1139
    :cond_4
    invoke-virtual {p1}, Ll/ᩳܿ᩻;->֫()V

    if-nez v2, :cond_5

    .line 1141
    invoke-interface {p2}, Ll/֫ܿ᩻;->֫()V

    return-void

    .line 1143
    :cond_5
    invoke-virtual {v1}, Ll/ܿܿ᩻;->֫()V

    return-void

    .line 1128
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Separator is empty"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
