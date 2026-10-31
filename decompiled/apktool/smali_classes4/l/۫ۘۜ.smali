.class public final Ll/۫ۘۜ;
.super Ll/ۙۛ᩻;
.source "D6WS"


# instance fields
.field public final ֫:Ll/۬ۖۜ;


# direct methods
.method public constructor <init>(Ll/۬ۖۜ;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 31
    iput-object p1, p0, Ll/۫ۘۜ;->֫:Ll/۬ۖۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 47
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "destructiveHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 1

    const-string v0, "mt_file_append_text"

    .line 54
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 12

    const-string v0, "path"

    const-string v1, "targetVersion"

    const-string v2, "encoding"

    const-string v3, "writeText"

    .line 57
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    .line 26
    new-instance v4, Ll/ۤᩴۜ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const-string v5, "Invalid file tail argument"

    invoke-static {p1, v4, v5, v1}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    .line 58
    invoke-static {p1, v0}, Ll/ۛᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 59
    invoke-static {p1}, Ll/ۛᩴۜ;->֫(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    .line 60
    invoke-static {p1, v2}, Ll/ۛᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 61
    invoke-static {v5}, Ll/ܳۘۜ;->ܽ(Ljava/lang/String;)Ll/ܿۘۜ;

    move-result-object v2

    .line 62
    invoke-static {v5}, Ll/᩸ܺۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 63
    invoke-static {p1, v3}, Ll/ۛᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 64
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x0

    invoke-virtual {v6, v8, v7}, Ljava/lang/String;->codePointCount(II)I

    move-result v7

    const/high16 v9, 0x80000

    if-gt v7, v9, :cond_5

    const/4 p1, 0x0

    :goto_0
    const/4 v3, 0x0

    .line 71
    :try_start_0
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v10, 0x1

    if-ge p1, v7, :cond_3

    .line 72
    invoke-virtual {v6, p1}, Ljava/lang/String;->charAt(I)C

    move-result v7

    .line 73
    invoke-static {v7}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v11

    if-eqz v11, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 74
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-eq p1, v7, :cond_0

    invoke-virtual {v6, p1}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/nio/charset/CharacterCodingException;

    invoke-direct {p1}, Ljava/nio/charset/CharacterCodingException;-><init>()V

    throw p1

    .line 75
    :cond_1
    invoke-static {v7}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v7

    if-nez v7, :cond_2

    :goto_1
    add-int/2addr p1, v10

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/nio/charset/CharacterCodingException;

    invoke-direct {p1}, Ljava/nio/charset/CharacterCodingException;-><init>()V

    throw p1

    .line 77
    :cond_3
    invoke-static {v9, v6, v4}, Ll/۬ܺۜ;->֫(ILjava/lang/String;Ljava/lang/String;)Ll/ۙܺۜ;

    move-result-object p1

    iget-object p1, p1, Ll/ۙܺۜ;->֫:[B
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۗܺۜ; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    new-array v4, v10, [Ll/ܶܺۜ;

    aput-object v3, v4, v8

    .line 85
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 86
    new-instance v6, Ll/۬ۘۜ;

    invoke-direct {v6, p1, v3, v4, v2}, Ll/۬ۘۜ;-><init>([BLjava/io/ByteArrayOutputStream;[Ll/ܶܺۜ;Ll/ܿۘۜ;)V

    iget-object p1, p0, Ll/۫ۘۜ;->֫:Ll/۬ۖۜ;

    invoke-virtual {p1, v0, v1, v6}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢۖۜ;)Ll/۠ۖۜ;

    move-result-object p1

    .line 110
    iget-boolean v0, p1, Ll/۠ۖۜ;->֫:Z

    if-eqz v0, :cond_4

    .line 111
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 112
    array-length v1, v0

    iget-object v2, v2, Ll/ܿۘۜ;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {v2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1, v0}, Ll/ܽۘᩳ;->֫(Ljava/lang/String;I[B)V

    .line 114
    :cond_4
    aget-object v0, v4, v8

    invoke-virtual {v0}, Ll/ܶܺۜ;->ܽ()J

    move-result-wide v6

    aget-object v0, v4, v8

    invoke-virtual {v0}, Ll/ܶܺۜ;->֫()J

    move-result-wide v8

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Ll/ۛᩴۜ;->֫(Ll/۠ۖۜ;Ljava/lang/String;JJ)Ll/۬ۛ᩻;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    const-wide/32 v0, 0x80000

    .line 81
    iget-wide v2, p1, Ll/ۗܺۜ;->᩸:J

    const-string p1, "Appended text exceeds the 524288-byte limit."

    invoke-static {p1, v0, v1, v2, v3}, Ll/ۛᩴۜ;->֫(Ljava/lang/String;JJ)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_1
    const-string p1, "warning"

    .line 53
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "FILE_TEXT_ENCODE_FAILED"

    const-string v2, "The appended text cannot be represented as valid text in the selected encoding."

    .line 52
    invoke-static {v1, v2, p1, v3, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 79
    throw p1

    .line 66
    :cond_5
    invoke-virtual {p1, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    .line 48
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "writeText exceeds 524288 Unicode code points"

    invoke-static {v2, v3, p1, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 66
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Append literal text using the existing file\'s exact encoding from mt_file_read_text. Preserves every original byte and the physical BOM; never transcodes or inserts another BOM. No automatic newline or replacement-template expansion. A trailing CR followed by an appended LF forms CRLF. Validates the entire original text, including EOF: invalid text, incomplete characters, unencodable appended text or a change to the physical BOM rejects the operation before publication. Empty writeText is a no-op after validation. ISO-2022 encodings are not supported. Appended text is limited to 524288 Unicode code points and 524288 encoded bytes; the existing file has no text-size cap and the final file is limited to 9007199254740991 bytes. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Append File Text"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 49
    invoke-static {}, Ll/ۛᩴۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Copy the non-empty encoding returned by mt_file_read_text, including any BOM suffix. ISO-2022 is unsupported."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "encoding"

    .line 50
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "writeText"

    const-string v3, "Literal text to append; at most 524288 Unicode code points and encoded bytes. Include any desired newline explicitly. Empty is a no-op."

    const-string v4, "Arguments for mt_file_append_text."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "mt_file_append_text"

    const/4 v1, 0x1

    .line 53
    invoke-static {v0, v1}, Ll/ۛᩴۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_append_text"

    return-object v0
.end method
