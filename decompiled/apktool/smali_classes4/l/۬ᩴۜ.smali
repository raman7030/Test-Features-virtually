.class public final Ll/۬ᩴۜ;
.super Ll/ۙۛ᩻;
.source "06WR"


# static fields
.field public static final ᩳ:[Ljava/lang/String;


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/ۖܺۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    const-string v13, "cursor"

    const-string v14, "limit"

    const-string v0, "path"

    const-string v1, "recursive"

    const-string v2, "namePattern"

    const-string v3, "namePatternType"

    const-string v4, "nameMatchMode"

    const-string v5, "nameCaseSensitive"

    const-string v6, "minSize"

    const-string v7, "maxSize"

    const-string v8, "minModifiedAt"

    const-string v9, "maxModifiedAt"

    const-string v10, "contentPattern"

    const-string v11, "contentPatternType"

    const-string v12, "contentCaseSensitive"

    .line 26
    filled-new-array/range {v0 .. v14}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۬ᩴۜ;->ᩳ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ۖܺۜ;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 35
    iput-object p1, p0, Ll/۬ᩴۜ;->ܽ:Ll/ۖܺۜ;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 171
    invoke-static {p0, p1}, Ll/۬ᩴۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 172
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Expected "

    const-string v1, " or "

    .line 0
    invoke-static {v0, p2, v1, p3}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 173
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {p0, p2, p1}, Ll/۬ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static synthetic ֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/۬ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "Invalid "

    .line 166
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 51
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 52
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 55
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p0

    return p0

    .line 53
    :cond_0
    invoke-static {p0, v0, p1}, Ll/۬ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)J
    .locals 5

    .line 179
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 180
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValueExact()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const-wide v2, 0x1fffffffffffffL

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-wide v0

    :catch_0
    :cond_0
    const-string v0, "Expected -1 or a non-negative safe integer byte count"

    .line 189
    invoke-static {p0, v0, p1}, Ll/۬ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 7

    .line 209
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "path"

    const-string v3, "."

    .line 210
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "recursive"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "namePattern"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "namePatternType"

    const-string v4, "literal"

    .line 211
    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "nameMatchMode"

    const-string v5, "contains"

    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "nameCaseSensitive"

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "minSize"

    const/4 v6, -0x1

    .line 212
    invoke-virtual {v1, v2, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "maxSize"

    invoke-virtual {v1, v2, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "minModifiedAt"

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "maxModifiedAt"

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "contentPattern"

    .line 213
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "contentPatternType"

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "contentCaseSensitive"

    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "cursor"

    .line 214
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "limit"

    const/16 v3, 0xc8

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 209
    invoke-static {p1, p2, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "Invalid "

    .line 162
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

    .line 44
    :cond_0
    invoke-static {p0, v0, p1}, Ll/۬ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ᩳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;
    .locals 3

    .line 193
    invoke-static {p0, p1}, Ll/۬ᩴۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 194
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 198
    :cond_0
    :try_start_0
    invoke-static {v0}, Ll/᩵᩹ᩴ;->parse(Ljava/lang/CharSequence;)Ll/᩵᩹ᩴ;

    move-result-object v0

    .line 199
    invoke-virtual {v0}, Ll/᩵᩹ᩴ;->getNano()I

    move-result v1

    const v2, 0xf4240

    rem-int/2addr v1, v2

    if-nez v1, :cond_1

    .line 202
    invoke-virtual {v0}, Ll/᩵᩹ᩴ;->toInstant()Ll/ۘ᩹ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۘ᩹ᩴ;->toEpochMilli()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 200
    :cond_1
    new-instance v0, Ll/ܺ᩹ᩴ;

    const-string v1, "Sub-millisecond precision"

    invoke-direct {v0, v1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ll/ܺ᩹ᩴ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v0, "Expected ISO-8601 with Z or an explicit UTC offset, at most millisecond precision"

    .line 204
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {p0, v0, p1}, Ll/۬ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ᩻()Lbin/mt/json/JSONObject;
    .locals 8

    .line 218
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Absolute or Home-relative directory. Use . for Home; empty is invalid."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 219
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v3, "Search readable subdirectories without following recognized links; recommended true."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "recursive"

    .line 220
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Expression matched against basename including extension, never the parent path. Empty disables name filtering. Literal * is not a wildcard."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "namePattern"

    .line 221
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "literal"

    const-string v4, "regex"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "Expression syntax; recommended literal. Ignored when namePattern is empty."

    .line 222
    invoke-static {v6, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "namePatternType"

    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "exact"

    const-string v6, "contains"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "exact matches the whole basename; contains finds a substring or a regex match. Recommended contains; ignored when namePattern is empty."

    .line 223
    invoke-static {v6, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "nameMatchMode"

    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Use true for case-sensitive names; recommended false uses Unicode case-insensitive matching. Ignored when namePattern is empty."

    .line 124
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "nameCaseSensitive"

    .line 224
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "integer"

    const-string v6, "Inclusive minimum bytes; -1 disables. Otherwise 0..9007199254740991. Unknown size cannot satisfy an enabled size filter."

    .line 110
    invoke-static {v5, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "minSize"

    .line 225
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "Exclusive maximum bytes; -1 disables. Otherwise 0..9007199254740991 and greater than an enabled minSize."

    .line 110
    invoke-static {v5, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "maxSize"

    .line 226
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "Inclusive modification time, ISO-8601 with Z or UTC offset, at most millisecond precision. Empty disables. Unknown time cannot satisfy an enabled time filter."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "minModifiedAt"

    .line 227
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "Exclusive modification time, ISO-8601 with Z or UTC offset, at most millisecond precision. Empty disables. Must be after an enabled minModifiedAt."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "maxModifiedAt"

    .line 228
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "Require at least one match in decoded file content; empty disables. Literal and regex content matching both use streaming windows, not a file prefix."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "contentPattern"

    .line 229
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "Content syntax; recommended literal. Ignored when contentPattern is empty."

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    .line 230
    invoke-static {v6, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "contentPatternType"

    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Use true for case-sensitive content; recommended false uses Unicode case-insensitive matching. Ignored when contentPattern is empty."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "contentCaseSensitive"

    .line 231
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Empty for a new search. For continuation copy the returned action unchanged; changing filters or access policy invalidates the cursor."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "cursor"

    .line 232
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "limit"

    const-string v2, "Maximum matches per page, 1..1000; recommended 200. A scan budget can yield fewer or zero matches; keep unchanged for continuation."

    const-string v3, "Arguments for mt_file_search; every field is required."

    .line 0
    invoke-static {v0, v5, v2, v1, v3}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 55
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 1

    const-string v0, "mt_file_search"

    .line 102
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 32

    move-object/from16 v6, p1

    .line 107
    new-instance v0, Ll/ۗᩴۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "Invalid mt_file_search argument"

    sget-object v7, Ll/۬ᩴۜ;->ᩳ:[Ljava/lang/String;

    invoke-static {v6, v0, v1, v7}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v8, "path"

    .line 109
    invoke-static {v6, v8}, Ll/۬ᩴۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v0, "recursive"

    .line 110
    invoke-static {v6, v0}, Ll/۬ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v11

    const-string v0, "namePattern"

    .line 111
    invoke-static {v6, v0}, Ll/۬ᩴۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v0, "namePatternType"

    const-string v1, "literal"

    const-string v9, "regex"

    .line 112
    invoke-static {v6, v0, v1, v9}, Ll/۬ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v0, "contains"

    const-string v2, "nameMatchMode"

    const-string v14, "exact"

    .line 113
    invoke-static {v6, v2, v14, v0}, Ll/۬ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v0, "nameCaseSensitive"

    .line 114
    invoke-static {v6, v0}, Ll/۬ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v16

    const-string v4, "minSize"

    .line 115
    invoke-static {v6, v4}, Ll/۬ᩴۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v2

    const-string v5, "maxSize"

    move-object/from16 v26, v10

    move/from16 v27, v11

    .line 116
    invoke-static {v6, v5}, Ll/۬ᩴۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v10

    const-string v0, "minModifiedAt"

    .line 117
    invoke-static {v6, v0}, Ll/۬ᩴۜ;->ᩳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v21

    const-string v0, "maxModifiedAt"

    .line 118
    invoke-static {v6, v0}, Ll/۬ᩴۜ;->ᩳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v22

    const-wide/16 v17, -0x1

    cmp-long v19, v2, v17

    if-eqz v19, :cond_1

    cmp-long v19, v10, v17

    if-eqz v19, :cond_1

    cmp-long v17, v2, v10

    if-gez v17, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "minSize must be less than maxSize"

    .line 120
    invoke-virtual {v6, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v1, v0, v5}, Ll/۬ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    if-eqz v21, :cond_3

    if-eqz v22, :cond_3

    .line 122
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Long;->longValue()J

    move-result-wide v19

    cmp-long v23, v17, v19

    if-gez v23, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "minModifiedAt must be before maxModifiedAt"

    .line 123
    invoke-virtual {v6, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-static {v2, v1, v0}, Ll/۬ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_3
    :goto_1
    const-string v0, "contentPattern"

    .line 125
    invoke-static {v6, v0}, Ll/۬ᩴۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    const-string v0, "contentPatternType"

    .line 126
    invoke-static {v6, v0, v1, v9}, Ll/۬ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "contentCaseSensitive"

    .line 127
    invoke-static {v6, v0}, Ll/۬ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v25

    const-string v0, "cursor"

    .line 128
    invoke-static {v6, v0}, Ll/۬ᩴۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    const-wide/16 v17, 0x1

    const-wide/16 v19, 0x3e8

    const-string v24, "limit"

    move-object/from16 v29, v0

    move-object/from16 v0, p1

    move-object/from16 v30, v1

    move-object/from16 v1, v24

    move-object/from16 v24, v13

    move-object/from16 v31, v14

    move-wide v13, v2

    move-wide/from16 v2, v17

    move-object/from16 v18, v9

    move-object/from16 v17, v15

    move-object v15, v4

    move-object v9, v5

    move-wide/from16 v4, v19

    .line 129
    invoke-static/range {v0 .. v5}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v0

    long-to-int v1, v0

    .line 131
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const/4 v2, 0x0

    :goto_2
    const/16 v3, 0xf

    if-ge v2, v3, :cond_6

    .line 132
    aget-object v3, v7, v2

    .line 133
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    move-object/from16 v4, v29

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    const-string v5, "limit"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 134
    invoke-virtual {v6, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-virtual {v0, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_3

    :cond_4
    move-object/from16 v4, v29

    :cond_5
    :goto_3
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v29, v4

    goto :goto_2

    :cond_6
    move-object/from16 v4, v29

    .line 137
    invoke-virtual {v0, v15, v13, v14}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v9, v10, v11}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    .line 138
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v2

    .line 139
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 138
    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v0

    .line 140
    new-instance v2, Ll/ۡܺۜ;

    move-object/from16 v3, v18

    .line 141
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    move-object/from16 v9, v17

    move-object/from16 v7, v31

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    move-object/from16 v7, v30

    .line 142
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    move-object v12, v2

    move-wide/from16 v17, v13

    move-object/from16 v13, v24

    move v14, v5

    move-wide/from16 v19, v10

    move/from16 v24, v3

    invoke-direct/range {v12 .. v25}, Ll/ۡܺۜ;-><init>(Ljava/lang/String;ZZZJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZZ)V

    move-object/from16 v3, p0

    .line 143
    iget-object v9, v3, Ll/۬ᩴۜ;->ܽ:Ll/ۖܺۜ;

    move-object/from16 v10, v26

    move/from16 v11, v27

    move-object/from16 v12, v28

    move v13, v1

    move-object v14, v0

    move-object v15, v2

    invoke-virtual/range {v9 .. v15}, Ll/ۖܺۜ;->֫(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ll/ۡܺۜ;)Ll/ܺܺۜ;

    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ll/ܺܺۜ;->ܽ()Ll/ᩳܺۜ;

    move-result-object v1

    .line 145
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 146
    iget-object v5, v1, Ll/ᩳܺۜ;->ᩳ:Ljava/util/ArrayList;

    iget-object v7, v1, Ll/ᩳܺۜ;->ܿ:Ljava/lang/String;

    iget-boolean v9, v1, Ll/ᩳܺۜ;->ۧ:Z

    iget-object v1, v1, Ll/ᩳܺۜ;->֫:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 147
    invoke-virtual {v2, v10}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_4

    .line 149
    :cond_7
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "directoryPath"

    invoke-virtual {v5, v10, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "listing"

    invoke-virtual {v5, v10, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 150
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "hasMore"

    invoke-virtual {v5, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "nextCursor"

    invoke-virtual {v5, v10, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "pagination"

    invoke-virtual {v2, v10, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "warnings"

    .line 151
    invoke-virtual {v0}, Ll/ܺܺۜ;->ᩳ()Lbin/mt/json/JSONArray;

    move-result-object v10

    invoke-virtual {v2, v5, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "failedFiles"

    invoke-virtual {v0}, Ll/ܺܺۜ;->֫()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v2, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 152
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    if-eqz v9, :cond_8

    .line 154
    new-instance v5, Lbin/mt/json/JSONObject;

    invoke-direct {v5, v6}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    .line 156
    invoke-virtual {v5, v8, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v4, v7}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "mt_file_search"

    const-string v5, "continue"

    const-string v6, "Continue the same file search, even when this page has no matches."

    .line 154
    invoke-static {v1, v4, v5, v6}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v2, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 158
    :cond_8
    new-instance v1, Ll/۬ۛ᩻;

    invoke-static {v0, v2}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Find regular files under an allowed directory. All enabled filters are ANDed; each file appears at most once. Includes hidden files, does not enter archives or follow recognized links. Directory names and metadata never prune recursion. Start with path=\".\", recursive=true, cursor=\"\", limit=200; use empty patterns and times and size=-1 to disable filters. Content is automatically decoded using BOM, editor encoding records and detection, then searched as text with no file-size cap. Streaming matching uses sliding windows: very long matches and regex anchors/lookarounds near window boundaries may differ from whole-file regex matching. Content regex uses multiline ^/$; dot does not match newlines unless enabled in the expression. Empty files participate in enabled content matching. Search is not a filesystem snapshot; continuation may reuse directory metadata for up to 30 seconds. An empty page can still have more search work. A page completes its current file before yielding; large files may take longer than a client timeout. Copy the purpose=continue action unchanged. Keep warnings from all pages to identify incomplete searches."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Search Local Files"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/۬ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 61
    invoke-static {}, Ll/۬ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/۬ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    .line 63
    :cond_0
    iget-object v0, p0, Ll/۬ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 13

    .line 68
    iget-object v0, p0, Ll/۬ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    const-string v0, "Reasons and counts of items not evaluated on this page. Empty means no observed search failures, not a filesystem snapshot. Permission-excluded paths are outside the search scope and are not disclosed."

    const-string v1, "type"

    const-string v2, "array"

    const-string v3, "description"

    .line 0
    invoke-static {v1, v2, v3, v0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 71
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "name_match_failed"

    const-string v6, "directory_unreadable"

    const-string v7, "metadata_unavailable"

    const-string v8, "file_unreadable"

    const-string v9, "content_search_failed"

    filled-new-array {v7, v8, v9, v5, v6}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "metadata_unavailable: required size/time unknown; file_unreadable: disappeared or changed type before opening; content_search_failed: read/decode failure or regex timeout/stack limit; name_match_failed: filename regex timeout/stack limit; directory_unreadable: subtree could not be traversed."

    .line 72
    invoke-static {v6, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "reason"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Number of affected files or directories on this page; one unreadable directory can hide many files."

    const-string v7, "integer"

    const-string v8, "count"

    const-string v9, "One aggregated reason."

    .line 0
    invoke-static {v4, v7, v5, v8, v9}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "items"

    .line 71
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 77
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "Normalized absolute root, fixed for continuation and the base of every relative path."

    const-string v8, "string"

    .line 96
    invoke-static {v8, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "directoryPath"

    .line 78
    invoke-virtual {v4, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "One matching regular file per element: f size modifiedAt relativePath. Split only at the first three ASCII spaces. Size is bytes or - when unknown; modifiedAt is ISO-8601 or -. Preserve the remaining raw path without trimming, unquoting or splitting on newlines."

    .line 79
    invoke-static {v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "listing"

    invoke-virtual {v4, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 80
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "Whether more traversal remains, not whether another match is guaranteed. Can be true with an empty listing."

    const-string v10, "boolean"

    .line 124
    invoke-static {v10, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "hasMore"

    .line 81
    invoke-virtual {v7, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "nextCursor"

    const-string v10, "Opaque continuation cursor; empty on the final page. Bound to this root, filters, page size and access policy."

    const-string v11, "Remaining search work."

    .line 0
    invoke-static {v7, v8, v10, v9, v11}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "pagination"

    .line 80
    invoke-virtual {v4, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "warnings"

    .line 83
    invoke-virtual {v4, v7, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "First 20 failed files on this page, in traversal order. Warnings count all failures, including omitted files and unreadable directories. These files were not determined to be non-matches; narrow the name filter to inspect omitted failures. Permission-excluded paths are not disclosed."

    .line 0
    invoke-static {v1, v2, v3, v4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 86
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Absolute path usable with file tools."

    .line 96
    invoke-static {v8, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "path"

    .line 87
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "file_unreadable"

    const-string v12, "name_match_failed"

    const-string v7, "invalid_encoding"

    const-string v8, "read_timeout"

    const-string v9, "content_search_failed"

    const-string v10, "metadata_unavailable"

    filled-new-array/range {v7 .. v12}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "invalid_encoding: strict decoding failed; read_timeout: file read timed out; content_search_failed: another read failure or incomplete regex matching; other reasons match the aggregated warning."

    .line 88
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "One file whose search could not complete."

    .line 86
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "failedFiles"

    .line 84
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "One file search page."

    .line 77
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_search"

    .line 92
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "continue"

    .line 95
    invoke-static {}, Ll/۬ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 94
    invoke-static {v4, v1, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Lbin/mt/json/JSONObject;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const-string v1, "One directly executable search continuation when hasMore=true, otherwise empty."

    .line 92
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Result for mt_file_search."

    .line 91
    invoke-static {v3, v0, v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/۬ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 97
    :cond_0
    iget-object v0, p0, Ll/۬ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_search"

    return-object v0
.end method
