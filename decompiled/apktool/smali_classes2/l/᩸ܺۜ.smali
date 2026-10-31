.class public final Ll/᩸ܺۜ;
.super Ljava/lang/Object;
.source "16WT"


# static fields
.field public static final ֫:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 40

    const-string v38, "windows-1257"

    const-string v39, "windows-1258"

    const-string v0, "utf-8"

    const-string v1, "utf-16be"

    const-string v2, "utf-16le"

    const-string v3, "utf-32be"

    const-string v4, "utf-32le"

    const-string v5, "gb2312"

    const-string v6, "gb18030"

    const-string v7, "gbk"

    const-string v8, "big5"

    const-string v9, "big5-hkscs"

    const-string v10, "cesu-8"

    const-string v11, "euc-jp"

    const-string v12, "euc-kr"

    const-string v13, "ibm866"

    const-string v14, "ibm850"

    const-string v15, "iso-8859-1"

    const-string v16, "iso-8859-2"

    const-string v17, "iso-8859-3"

    const-string v18, "iso-8859-4"

    const-string v19, "iso-8859-5"

    const-string v20, "iso-8859-6"

    const-string v21, "iso-8859-7"

    const-string v22, "iso-8859-8"

    const-string v23, "iso-8859-9"

    const-string v24, "iso-8859-10"

    const-string v25, "iso-8859-13"

    const-string v26, "iso-8859-14"

    const-string v27, "iso-8859-15"

    const-string v28, "koi8-r"

    const-string v29, "koi8-u"

    const-string v30, "shiftjis"

    const-string v31, "windows-1250"

    const-string v32, "windows-1251"

    const-string v33, "windows-1252"

    const-string v34, "windows-1253"

    const-string v35, "windows-1254"

    const-string v36, "windows-1255"

    const-string v37, "windows-1256"

    .line 21
    filled-new-array/range {v0 .. v39}, [Ljava/lang/String;

    move-result-object v0

    .line 0
    new-instance v1, Ljava/util/HashSet;

    const/16 v2, 0x28

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "duplicate element: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 21
    sput-object v0, Ll/᩸ܺۜ;->֫:Ljava/util/Set;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "-bom"

    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x4

    .line 0
    invoke-static {v1, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 36
    :cond_0
    sget-object v0, Ll/᩸ܺۜ;->֫:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    const/4 p0, 0x0

    .line 39
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "FILE_APPEND_ENCODING_UNSUPPORTED"

    const-string v2, "This encoding does not support independent text append. ISO-2022 encodings are not supported."

    const-string v3, "warning"

    .line 37
    invoke-static {v1, v2, v3, p0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/ܿۘۜ;[B)Ll/ܶܺۜ;
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    .line 65
    new-instance v3, Ll/۠ܺۜ;

    move-object/from16 v4, p0

    move-wide/from16 v5, p2

    invoke-direct {v3, v4, v5, v6, v0}, Ll/۠ܺۜ;-><init>(Ljava/io/InputStream;JLjava/io/OutputStream;)V

    .line 66
    new-instance v4, Ljava/io/PushbackInputStream;

    const/4 v5, 0x4

    invoke-direct {v4, v3, v5}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;I)V

    new-array v3, v5, [B

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_1

    rsub-int/lit8 v8, v7, 0x4

    .line 70
    invoke-virtual {v4, v3, v7, v8}, Ljava/io/PushbackInputStream;->read([BII)I

    move-result v8

    if-gez v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v7, v8

    goto :goto_0

    .line 74
    :cond_1
    :goto_1
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    .line 75
    invoke-virtual {v1, v5}, Ll/ܿۘۜ;->֫([B)Z

    move-result v8

    const/4 v9, 0x0

    const-string v10, "warning"

    const-string v11, "FILE_TEXT_ENCODING_MISMATCH"

    if-eqz v8, :cond_d

    .line 76
    array-length v8, v2

    rsub-int/lit8 v12, v7, 0x4

    invoke-static {v8, v12}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 77
    invoke-static {v2, v6, v3, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v8, v7

    .line 78
    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ܿۘۜ;->֫([B)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 81
    iget v3, v1, Ll/ܿۘۜ;->ۧ:I

    sub-int/2addr v7, v3

    invoke-virtual {v4, v5, v3, v7}, Ljava/io/PushbackInputStream;->unread([BII)V

    .line 82
    new-instance v3, Ljava/io/InputStreamReader;

    iget-object v1, v1, Ll/ܿۘۜ;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v1

    sget-object v5, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 83
    invoke-virtual {v1, v5}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/CharsetDecoder;)V

    const/16 v1, 0x2000

    new-array v1, v1, [C

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    .line 87
    :cond_2
    invoke-virtual {v3, v1}, Ljava/io/Reader;->read([C)I

    move-result v14

    const/4 v15, -0x1

    if-eq v14, v15, :cond_a

    .line 88
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v14, :cond_2

    move-object/from16 p0, v3

    .line 89
    aget-char v3, v1, v15

    if-eqz v8, :cond_4

    .line 185
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x0

    move-object/from16 p2, v1

    const/4 v8, 0x0

    goto :goto_5

    :cond_3
    new-instance v0, Ljava/nio/charset/CharacterCodingException;

    invoke-direct {v0}, Ljava/nio/charset/CharacterCodingException;-><init>()V

    throw v0

    .line 189
    :cond_4
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v8

    if-nez v8, :cond_9

    .line 190
    invoke-static {v3}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v8

    move-object/from16 p2, v1

    const/16 v1, 0xa

    if-ne v3, v1, :cond_5

    if-eqz v9, :cond_5

    const/4 v9, 0x0

    goto :goto_5

    :cond_5
    const/16 v4, 0xd

    if-ne v3, v4, :cond_6

    const/4 v4, 0x1

    const/4 v9, 0x1

    goto :goto_3

    :cond_6
    const/4 v4, 0x0

    const/4 v9, 0x0

    :goto_3
    const-wide/16 v4, 0x1

    if-nez v9, :cond_8

    if-ne v3, v1, :cond_7

    goto :goto_4

    :cond_7
    add-long/2addr v4, v12

    move-wide v6, v12

    move-wide v12, v4

    move-wide v4, v10

    goto :goto_5

    :cond_8
    :goto_4
    add-long/2addr v4, v10

    const-wide/16 v6, 0x0

    move-wide/from16 v16, v6

    move-wide v6, v12

    move-wide/from16 v12, v16

    move-wide/from16 v18, v4

    move-wide v4, v10

    move-wide/from16 v10, v18

    :goto_5
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v3, p0

    move-object/from16 v1, p2

    goto :goto_2

    .line 189
    :cond_9
    new-instance v0, Ljava/nio/charset/CharacterCodingException;

    invoke-direct {v0}, Ljava/nio/charset/CharacterCodingException;-><init>()V

    throw v0

    :cond_a
    if-nez v8, :cond_b

    .line 92
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    .line 93
    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V

    .line 94
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    .line 95
    new-instance v0, Ll/ܶܺۜ;

    invoke-direct {v0, v4, v5, v6, v7}, Ll/ܶܺۜ;-><init>(JJ)V

    return-object v0

    .line 207
    :cond_b
    new-instance v0, Ljava/nio/charset/CharacterCodingException;

    invoke-direct {v0}, Ljava/nio/charset/CharacterCodingException;-><init>()V

    throw v0

    :cond_c
    const-string v0, "Appending this text would change the physical BOM. Adjust writeText to preserve it."

    .line 102
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 99
    invoke-static {v11, v0, v10, v9, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 79
    throw v0

    :cond_d
    const-string v0, "Copy the current file\'s encoding including its physical BOM."

    .line 102
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 99
    invoke-static {v11, v0, v10, v9, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 75
    throw v0
.end method

.method public static ֫()V
    .locals 5

    .line 107
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 110
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "FILE_WRITE_CANCELED"

    const-string v3, "The file operation was canceled before publication."

    const-string v4, "warning"

    .line 108
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/io/BufferedOutputStream;JZ)V
    .locals 6

    const/high16 v0, 0x10000

    new-array v1, v0, [B

    :goto_0
    const-wide/16 v2, 0x0

    const/4 v4, -0x1

    cmp-long v5, p2, v2

    if-lez v5, :cond_3

    .line 50
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    int-to-long v2, v0

    .line 51
    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    const/4 v2, 0x0

    .line 115
    invoke-virtual {p0, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-eqz v3, :cond_0

    move v4, v3

    goto :goto_1

    .line 117
    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v3

    if-gez v3, :cond_1

    goto :goto_1

    :cond_1
    int-to-byte v3, v3

    aput-byte v3, v1, v2

    const/4 v4, 0x1

    :goto_1
    if-ltz v4, :cond_2

    .line 53
    invoke-virtual {p1, v1, v2, v4}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v2, v4

    sub-long/2addr p2, v2

    goto :goto_0

    .line 52
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Source ended before its expected size"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 56
    :cond_3
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    if-eqz p4, :cond_5

    .line 57
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-ne p0, v4, :cond_4

    goto :goto_2

    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Source grew during append"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 58
    :cond_5
    :goto_2
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    return-void
.end method
