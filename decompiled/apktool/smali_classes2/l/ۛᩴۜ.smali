.class public final Ll/ۛᩴۜ;
.super Ljava/lang/Object;
.source "M6W0"


# direct methods
.method public static ֫()Lbin/mt/json/JSONObject;
    .locals 4

    .line 67
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Existing regular file; absolute or Home-relative path. Empty is invalid."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 67
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Copy the existing file\'s current targetVersion. Empty and missing are invalid."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetVersion"

    .line 68
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;
    .locals 10

    .line 72
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Normalized absolute file path."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 72
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "integer"

    const-string v4, "Final raw file size in bytes."

    .line 110
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "size"

    .line 73
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "Final whole-file version; copy unchanged for subsequent operations."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "targetVersion"

    .line 74
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "Whether the final bytes differ from the original file."

    const-string v6, "boolean"

    .line 124
    invoke-static {v6, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "changed"

    .line 75
    invoke-virtual {v0, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "Metadata or publication limitations; empty when none."

    .line 76
    invoke-static {v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "warnings"

    invoke-virtual {v0, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "encoding"

    if-eqz p1, :cond_0

    const-string v6, "Actual unchanged encoding token including its physical BOM."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 77
    invoke-virtual {v0, v4, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_0
    const-string v6, "Result for "

    const-string v7, "."

    .line 0
    invoke-static {v6, p0, v7}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Final file state."

    .line 79
    invoke-static {v0, v7}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {p0}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 84
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "See the target read tool."

    .line 96
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 85
    invoke-virtual {v7, v3, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 96
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 86
    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    if-eqz p1, :cond_1

    const-string v5, "See mt_file_read_text."

    .line 96
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 88
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "startLine"

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 89
    invoke-virtual {v1, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "startColumn"

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 90
    invoke-virtual {v1, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "limit"

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 91
    invoke-virtual {v1, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "maxChars"

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 92
    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_1
    const-string v1, "byteOffset"

    const-string v4, "See mt_file_read_bytes."

    .line 110
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 94
    invoke-virtual {v3, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "maxBytes"

    .line 110
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 95
    invoke-virtual {v1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :goto_0
    if-eqz p1, :cond_2

    const-string p1, "mt_file_read_text"

    goto :goto_1

    :cond_2
    const-string p1, "mt_file_read_bytes"

    :goto_1
    const-string v1, "Arguments for the read tool."

    .line 99
    invoke-static {v3, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "inspect"

    .line 98
    invoke-static {v1, p1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Lbin/mt/json/JSONObject;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Success provides an inspection near the affected file tail."

    .line 97
    invoke-static {p1, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 78
    invoke-static {v6, v0, p0, p1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ljava/lang/String;
    .locals 6

    const-string v0, "targetVersion"

    .line 34
    invoke-static {p0, v0}, Ll/ۛᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x10

    if-ne v2, v3, :cond_4

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 37
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 38
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    if-lt v4, v5, :cond_0

    const/16 v5, 0x39

    if-le v4, v5, :cond_2

    :cond_0
    const/16 v5, 0x61

    if-lt v4, v5, :cond_1

    const/16 v5, 0x66

    if-le v4, v5, :cond_2

    :cond_1
    const/4 v2, 0x0

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    return-object v1

    .line 44
    :cond_4
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    .line 48
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Copy an existing file\'s 16 lowercase hex targetVersion; empty and missing are invalid"

    invoke-static {v3, v0, p0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 43
    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "Invalid "

    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 43
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 46
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 48
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v0, p1, p0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 44
    throw p0
.end method

.method public static ֫(Ljava/lang/String;JJ)Ll/ۗۛ᩻;
    .locals 2

    .line 58
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "limit"

    invoke-virtual {v0, v1, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "actual"

    invoke-virtual {p1, p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "FILE_SIZE_OUT_OF_RANGE"

    const-string p3, "warning"

    const/4 p4, 0x0

    .line 57
    invoke-static {p2, p0, p3, p4, p1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۠ۖۜ;Ljava/lang/String;JJ)Ll/۬ۛ᩻;
    .locals 7

    .line 103
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/۠ۖۜ;->ۧ:Ljava/lang/String;

    const-string v2, "path"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "size"

    iget-wide v4, p0, Ll/۠ۖۜ;->ܽ:J

    invoke-virtual {v0, v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v3, p0, Ll/۠ۖۜ;->ᩳ:Ljava/lang/String;

    const-string v4, "targetVersion"

    .line 104
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "changed"

    iget-boolean v6, p0, Ll/۠ۖۜ;->֫:Z

    invoke-virtual {v0, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "warnings"

    iget-object p0, p0, Ll/۠ۖۜ;->ܿ:Lbin/mt/json/JSONArray;

    invoke-virtual {v0, v5, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 105
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const-string v2, "encoding"

    .line 108
    invoke-virtual {p0, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 109
    invoke-virtual {v0, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v2, "startLine"

    invoke-virtual {p1, v2, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "startColumn"

    invoke-virtual {p1, p2, p4, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "limit"

    const/16 p3, 0x1f4

    .line 110
    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "maxChars"

    const p3, 0xc000

    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    goto :goto_1

    :cond_1
    const-string p1, "byteOffset"

    .line 112
    invoke-virtual {v0, p1, p4, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "maxBytes"

    const/16 p3, 0x100

    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 114
    :goto_1
    new-instance p1, Ll/۬ۛ᩻;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p2

    if-eqz v1, :cond_2

    const-string p3, "mt_file_read_text"

    goto :goto_2

    :cond_2
    const-string p3, "mt_file_read_bytes"

    :goto_2
    const-string p4, "inspect"

    const-string p5, "Inspect the final file near the affected tail."

    .line 115
    invoke-static {v0, p3, p4, p5}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    .line 114
    invoke-virtual {p2, p3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p2

    invoke-static {p0, p2}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-direct {p1, p0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object p1
.end method
