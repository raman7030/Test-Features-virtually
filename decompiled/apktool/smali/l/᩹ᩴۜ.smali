.class public final Ll/᩹ᩴۜ;
.super Ll/ۙۛ᩻;
.source "N6WI"


# static fields
.field public static final ᩳ:[Ljava/lang/String;


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/۬ۖۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    const-string v8, "replaceMode"

    const-string v9, "expectedReplacements"

    const-string v0, "path"

    const-string v1, "targetVersion"

    const-string v2, "encoding"

    const-string v3, "contentPattern"

    const-string v4, "contentPatternType"

    const-string v5, "contentCaseSensitive"

    const-string v6, "writeText"

    const-string v7, "replacementMode"

    .line 30
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩹ᩴۜ;->ᩳ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/۬ۖۜ;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 39
    iput-object p1, p0, Ll/᩹ᩴۜ;->ܽ:Ll/۬ۖۜ;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "Invalid "

    .line 233
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
    invoke-static {p0, v0, p1}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 237
    invoke-static {p0, p1}, Ll/᩹ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 238
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

    .line 238
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {p0, p2, p1}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static synthetic ֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹ᩴۜ;->ۧ(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    .line 198
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "path"

    invoke-virtual {v0, v1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string v0, "warning"

    const/4 v1, 0x0

    .line 197
    invoke-static {p0, p1, v0, v1, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/᩻ۘۜ;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹ᩴۜ;->ۧ(Ll/᩻ۘۜ;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 1

    .line 217
    :try_start_0
    invoke-static {}, Ll/ۡۘۜ;->֫()V
    :try_end_0
    .catch Ll/᩻ۘۜ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 219
    invoke-static {v0, p0}, Ll/᩹ᩴۜ;->ۧ(Ll/᩻ۘۜ;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    .line 255
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {p1, p2, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;
    .locals 3

    .line 212
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "path"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "limit"

    const/high16 v1, 0xa00000

    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "actual"

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_TEXT_RESULT_TOO_LARGE"

    const-string v0, "The replacement result exceeds the 10485760-byte text limit."

    const-string v1, "warning"

    const/4 v2, 0x0

    .line 210
    invoke-static {p1, v0, v1, v2, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/᩻ۘۜ;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 4

    .line 202
    sget-object v0, Ll/᩸ᩴۜ;->֫:[I

    iget-object p0, p0, Ll/᩻ۘۜ;->᩸:Ll/᩷ۘۜ;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const-string v1, "path"

    const/4 v2, 0x0

    const-string v3, "warning"

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    .line 205
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-static {p1, p0}, Ll/᩹ᩴۜ;->ۧ(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    .line 202
    :cond_0
    new-instance p0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {p0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw p0

    .line 198
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_TEXT_REPLACE_FAILED"

    const-string v0, "Regex matching did not complete. Simplify the expression before retrying."

    .line 197
    invoke-static {p1, v0, v3, v2, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    .line 198
    :cond_2
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_TEXT_REPLACE_CANCELED"

    const-string v0, "Text replacement was canceled before publication."

    .line 197
    invoke-static {p1, v0, v3, v2, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 55
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

    const-string v0, "mt_file_replace_text"

    .line 83
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 25

    move-object/from16 v1, p1

    .line 88
    new-instance v0, Ll/۠ᩴۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v2, "Invalid mt_file_replace_text argument"

    sget-object v3, Ll/᩹ᩴۜ;->ᩳ:[Ljava/lang/String;

    invoke-static {v1, v0, v2, v3}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v0, "path"

    .line 90
    invoke-static {v1, v0}, Ll/᩹ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "targetVersion"

    .line 91
    invoke-static {v1, v13}, Ll/᩹ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 224
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x10

    if-ne v2, v3, :cond_e

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 225
    :goto_0
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 226
    invoke-virtual {v14, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    if-lt v4, v5, :cond_0

    const/16 v5, 0x39

    if-le v4, v5, :cond_1

    :cond_0
    const/16 v5, 0x61

    if-lt v4, v5, :cond_e

    const/16 v5, 0x66

    if-gt v4, v5, :cond_e

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const-string v15, "encoding"

    .line 93
    invoke-static {v1, v15}, Ll/᩹ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 94
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_d

    .line 96
    invoke-static {v3}, Ll/ܳۘۜ;->ܽ(Ljava/lang/String;)Ll/ܿۘۜ;

    move-result-object v11

    const-string v4, "contentPattern"

    .line 97
    invoke-static {v1, v4}, Ll/᩹ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 98
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_c

    const-string v6, "writeText"

    .line 99
    invoke-static {v1, v6}, Ll/᩹ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 100
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v5, v2, v8}, Ljava/lang/String;->codePointCount(II)I

    move-result v8

    int-to-long v8, v8

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v10

    invoke-virtual {v7, v2, v10}, Ljava/lang/String;->codePointCount(II)I

    move-result v2

    const/16 v16, 0x0

    move-object/from16 v17, v13

    move-object/from16 v18, v14

    int-to-long v13, v2

    add-long/2addr v8, v13

    const-wide/32 v13, 0x80000

    cmp-long v2, v8, v13

    if-gtz v2, :cond_b

    const-string v2, "contentPatternType"

    const-string v8, "literal"

    const-string v9, "regex"

    .line 103
    invoke-static {v1, v2, v8, v9}, Ll/᩹ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v9, "contentCaseSensitive"

    .line 51
    invoke-virtual {v1, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    if-eqz v10, :cond_a

    .line 52
    invoke-virtual {v10}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v13

    if-eqz v13, :cond_a

    .line 55
    invoke-virtual {v10}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v9

    const-string v10, "replacementMode"

    const-string v13, "template"

    .line 106
    invoke-static {v1, v10, v8, v13}, Ll/᩹ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "template requires contentPatternType=regex"

    .line 107
    invoke-virtual {v1, v10}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v1, v0, v10}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_4
    :goto_1
    const-string v10, "replaceMode"

    const-string v13, "all"

    const-string v14, "first"

    .line 108
    invoke-static {v1, v10, v14, v13}, Ll/᩹ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    const-string v13, "expectedReplacements"

    .line 243
    invoke-virtual {v1, v13}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v14

    if-eqz v14, :cond_9

    .line 244
    invoke-virtual {v14}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v19

    if-eqz v19, :cond_9

    move-object/from16 v19, v13

    .line 246
    :try_start_0
    new-instance v13, Ljava/math/BigDecimal;

    move-object/from16 v20, v4

    invoke-virtual {v14}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v13, v4}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13}, Ljava/math/BigDecimal;->longValueExact()J

    move-result-wide v21
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_3

    const-wide/16 v23, -0x1

    cmp-long v4, v21, v23

    if-ltz v4, :cond_8

    const-wide v23, 0x1fffffffffffffL

    cmp-long v4, v21, v23

    if-gtz v4, :cond_8

    if-eqz v2, :cond_5

    const/16 v2, 0x8

    goto :goto_2

    :cond_5
    const/16 v2, 0x10

    :goto_2
    if-nez v9, :cond_6

    or-int/lit8 v2, v2, 0x42

    .line 114
    :cond_6
    :try_start_1
    invoke-static {v2, v5}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v2
    :try_end_1
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_1 .. :try_end_1} :catch_2

    .line 120
    :try_start_2
    new-instance v5, Ll/ۡۘۜ;

    invoke-direct {v5, v2, v7, v8}, Ll/ۡۘۜ;-><init>(Ll/ۨۘܽ;Ljava/lang/String;Z)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    const/4 v1, 0x0

    .line 217
    :try_start_3
    invoke-static {}, Ll/ۡۘۜ;->֫()V
    :try_end_3
    .catch Ll/᩻ۘۜ; {:try_start_3 .. :try_end_3} :catch_0

    .line 125
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v13

    .line 126
    filled-new-array/range {v16 .. v16}, [I

    move-result-object v14

    const/4 v2, 0x1

    new-array v8, v2, [Ll/ۙܺۜ;

    aput-object v1, v8, v16

    .line 128
    new-instance v9, Ll/ܶᩴۜ;

    move-object v1, v9

    move-object v2, v12

    move-object v4, v13

    move v6, v10

    move-object v7, v14

    move-object/from16 v19, v8

    move-object v10, v9

    move-wide/from16 v8, v21

    move-object/from16 p1, v14

    move-object v14, v10

    move-object/from16 v10, v19

    invoke-direct/range {v1 .. v11}, Ll/ܶᩴۜ;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ll/ۡۘۜ;Z[IJ[Ll/ۙܺۜ;Ll/ܿۘۜ;)V

    move-object/from16 v2, p0

    iget-object v1, v2, Ll/᩹ᩴۜ;->ܽ:Ll/۬ۖۜ;

    move-object/from16 v3, v18

    invoke-virtual {v1, v12, v3, v14}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢۖۜ;)Ll/۠ۖۜ;

    move-result-object v1

    iget-object v3, v1, Ll/۠ۖۜ;->ᩳ:Ljava/lang/String;

    iget-object v4, v1, Ll/۠ۖۜ;->ۧ:Ljava/lang/String;

    .line 187
    aget-object v5, v19, v16

    if-eqz v5, :cond_7

    invoke-static {v5}, Ll/۬ܺۜ;->֫(Ll/ۙܺۜ;)V

    .line 188
    :cond_7
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5, v0, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    aget-object v5, v13, v16

    invoke-virtual {v0, v15, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "size"

    iget-wide v6, v1, Ll/۠ۖۜ;->ܽ:J

    .line 189
    invoke-virtual {v0, v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v5, v17

    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "replacements"

    aget v6, p1, v16

    invoke-virtual {v0, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "changed"

    iget-boolean v6, v1, Ll/۠ۖۜ;->֫:Z

    .line 190
    invoke-virtual {v0, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "warnings"

    iget-object v1, v1, Ll/۠ۖۜ;->ܿ:Lbin/mt/json/JSONArray;

    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 191
    new-instance v1, Ll/۬ۛ᩻;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    const-string v6, "Read text from the final file version."

    aget-object v7, v13, v16

    const-string v8, "inspect"

    .line 192
    invoke-static {v8, v6, v4, v7, v3}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 191
    invoke-virtual {v5, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v3

    invoke-static {v0, v3}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1

    :catch_0
    move-exception v0

    move-object/from16 v2, p0

    move-object v3, v0

    .line 219
    invoke-static {v3, v1}, Ll/᩹ᩴۜ;->ۧ(Ll/᩻ۘۜ;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    move-object/from16 v2, p0

    .line 122
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v1, v0, v6}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    move-object/from16 v2, p0

    move-object v3, v0

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Invalid regular expression: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/regex/PatternSyntaxException;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v3, v20

    invoke-virtual {v1, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v1, v0, v3}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_3
    :cond_8
    move-object/from16 v2, p0

    goto :goto_3

    :cond_9
    move-object/from16 v2, p0

    move-object/from16 v19, v13

    :goto_3
    const-string v0, "Expected -1 or a non-negative safe integer"

    move-object/from16 v1, v19

    .line 251
    invoke-static {v14, v0, v1}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_a
    move-object/from16 v2, p0

    const-string v0, "Invalid contentCaseSensitive"

    .line 53
    invoke-static {v10, v0, v9}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_b
    move-object/from16 v2, p0

    const-string v0, "contentPattern plus writeText exceed 524288 Unicode code points"

    .line 101
    invoke-virtual {v1, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v1, v0, v6}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_c
    move-object/from16 v2, p0

    move-object v3, v4

    const-string v0, "contentPattern must not be empty"

    .line 98
    invoke-virtual {v1, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v1, v0, v3}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_d
    move-object/from16 v2, p0

    const-string v0, "Copy the encoding returned by mt_file_read_text"

    .line 94
    invoke-virtual {v1, v15}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v1, v0, v15}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_e
    move-object/from16 v2, p0

    move-object v5, v13

    const-string v0, "Copy an existing file\'s 16 lowercase hex targetVersion"

    .line 92
    invoke-virtual {v1, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v1, v0, v5}, Ll/᩹ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Replace text in one existing regular file. First call mt_file_read_text and copy path, encoding and targetVersion. Matches are non-overlapping and evaluated against the whole original text; inserted text is never searched again. Regex uses multiline ^/$; dot excludes newlines unless enabled in the expression. Zero-width regex matches use the regex engine\'s UTF-16 position advancement, including EOF once. Zero matches are a successful no-op unless expectedReplacements disagrees. A timeout, stack limit, cancellation, invalid encoding or replacement count mismatch aborts preparation without changing the file. Original raw bytes are limited to 524288 bytes; encoded output is limited to 10485760 bytes (10 MiB); contentPattern plus writeText are limited to 524288 Unicode code points. Preserves encoding, BOM and original newline characters, with no automatic backup or transcoding. Rejects replacements that change the physical BOM, including exposing a leading U+FEFF. Publication guarantees depend on the file backend; inspect error state before retrying a failed write."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Replace File Text"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 60
    iget-object v0, p0, Ll/᩹ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 259
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Existing regular file; absolute or Home-relative path. Empty is invalid."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 260
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Copy the existing file\'s version from mt_file_read_text or mt_file_stat. Empty and missing are invalid."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "targetVersion"

    .line 261
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Copy the non-empty exact token from mt_file_read_text, including its BOM suffix."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "encoding"

    .line 262
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Non-empty literal or regex to find in the original whole-file text."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "contentPattern"

    .line 263
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "regex"

    const-string v3, "literal"

    filled-new-array {v3, v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, "Pattern syntax; recommended literal."

    .line 264
    invoke-static {v4, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "contentPatternType"

    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Recommended true; false uses Unicode case-insensitive matching."

    const-string v4, "boolean"

    .line 124
    invoke-static {v4, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "contentCaseSensitive"

    .line 265
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Replacement text. Empty deletes selected matches. No automatic newline."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "writeText"

    .line 266
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "template"

    filled-new-array {v3, v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "literal preserves writeText exactly. template requires regex and supports $0..$9, ${number}, ${name}, and escapes \\n, \\r, \\t, \\\\, \\$. Other escapes or unknown groups are invalid; unmatched optional groups expand to empty. Use ${12} for group 12; $12 means group 1 followed by 2. Recommended literal."

    .line 267
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "replacementMode"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "first"

    const-string v2, "all"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "first selects the first non-overlapping match; all selects every non-overlapping match. Recommended all."

    .line 268
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "replaceMode"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Expected selected count after applying replaceMode, 0..9007199254740991; -1 disables the check. A mismatch rejects the entire operation before publication."

    const-string v2, "integer"

    const-string v3, "expectedReplacements"

    const-string v4, "Arguments for mt_file_replace_text; all fields are required."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 60
    iput-object v0, p0, Ll/᩹ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    .line 61
    :cond_0
    iget-object v0, p0, Ll/᩹ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 66
    iget-object v0, p0, Ll/᩹ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 67
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Normalized absolute file path."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "path"

    .line 68
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Actual encoding token, including any physical BOM."

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "encoding"

    .line 69
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Final raw file size in bytes."

    const-string v3, "integer"

    .line 110
    invoke-static {v3, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "size"

    .line 70
    invoke-virtual {v0, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Final raw-byte version; copy unchanged for subsequent operations."

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetVersion"

    .line 71
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Number of original matches selected for replacement, even when writeText leaves their content unchanged."

    .line 110
    invoke-static {v3, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "replacements"

    .line 72
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether final bytes differ from the pre-operation file."

    const-string v2, "boolean"

    .line 124
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "changed"

    .line 73
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Metadata or publication guarantee limitations; empty when none."

    .line 74
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "warnings"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Final file state after text replacement."

    .line 67
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_replace_text"

    .line 76
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {}, Ll/᩻ᩴۜ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_file_replace_text."

    .line 75
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩹ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 78
    :cond_0
    iget-object v0, p0, Ll/᩹ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_replace_text"

    return-object v0
.end method
