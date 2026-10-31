.class public final Lbin/mt/json/JSON;
.super Ljava/lang/Object;
.source "JSON.java"


# static fields
.field public static final FALSE:Lbin/mt/json/JSONValue;

.field public static final NULL:Lbin/mt/json/JSONValue;

.field public static final TRUE:Lbin/mt/json/JSONValue;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 67
    new-instance v0, Ll/ۛܳܳ;

    const-string v1, "null"

    invoke-direct {v0, v1}, Ll/ۛܳܳ;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 72
    new-instance v0, Ll/ۛܳܳ;

    const-string v1, "true"

    invoke-direct {v0, v1}, Ll/ۛܳܳ;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbin/mt/json/JSON;->TRUE:Lbin/mt/json/JSONValue;

    .line 77
    new-instance v0, Ll/ۛܳܳ;

    const-string v1, "false"

    invoke-direct {v0, v1}, Ll/ۛܳܳ;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbin/mt/json/JSON;->FALSE:Lbin/mt/json/JSONValue;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static array()Lbin/mt/json/JSONArray;
    .locals 1

    .line 151
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0}, Lbin/mt/json/JSONArray;-><init>()V

    return-object v0
.end method

.method public static varargs array([D)Lbin/mt/json/JSONArray;
    .locals 5

    if-eqz p0, :cond_1

    .line 215
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0}, Lbin/mt/json/JSONArray;-><init>()V

    .line 216
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-wide v3, p0, v2

    .line 217
    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONArray;->add(D)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 213
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "values is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static varargs array([F)Lbin/mt/json/JSONArray;
    .locals 4

    if-eqz p0, :cond_1

    .line 198
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0}, Lbin/mt/json/JSONArray;-><init>()V

    .line 199
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, p0, v2

    .line 200
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(F)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 196
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "values is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static varargs array([I)Lbin/mt/json/JSONArray;
    .locals 4

    if-eqz p0, :cond_1

    .line 164
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0}, Lbin/mt/json/JSONArray;-><init>()V

    .line 165
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, p0, v2

    .line 166
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(I)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 162
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "values is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static varargs array([J)Lbin/mt/json/JSONArray;
    .locals 5

    if-eqz p0, :cond_1

    .line 181
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0}, Lbin/mt/json/JSONArray;-><init>()V

    .line 182
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-wide v3, p0, v2

    .line 183
    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONArray;->add(J)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 179
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "values is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static varargs array([Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 4

    if-eqz p0, :cond_1

    .line 249
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0}, Lbin/mt/json/JSONArray;-><init>()V

    .line 250
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    .line 251
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 247
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "values is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static varargs array([Z)Lbin/mt/json/JSONArray;
    .locals 4

    if-eqz p0, :cond_1

    .line 232
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0}, Lbin/mt/json/JSONArray;-><init>()V

    .line 233
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-boolean v3, p0, v2

    .line 234
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(Z)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 230
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "values is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static cutOffPointZero(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, ".0"

    .line 304
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 0
    invoke-static {v1, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static object()Lbin/mt/json/JSONObject;
    .locals 1

    .line 262
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    return-object v0
.end method

.method public static parse(Ljava/io/Reader;)Lbin/mt/json/JSONValue;
    .locals 2

    if-eqz p0, :cond_0

    .line 298
    new-instance v0, Ll/۫ܳܳ;

    invoke-direct {v0}, Ll/۫ܳܳ;-><init>()V

    .line 299
    new-instance v1, Lbin/mt/json/JSONParser;

    invoke-direct {v1, v0}, Lbin/mt/json/JSONParser;-><init>(Lbin/mt/json/JSONHandler;)V

    invoke-virtual {v1, p0}, Lbin/mt/json/JSONParser;->parse(Ljava/io/Reader;)V

    .line 300
    invoke-virtual {v0}, Ll/۫ܳܳ;->֫()Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 296
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "reader is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static parse(Ljava/lang/String;)Lbin/mt/json/JSONValue;
    .locals 2

    if-eqz p0, :cond_0

    .line 276
    new-instance v0, Ll/۫ܳܳ;

    invoke-direct {v0}, Ll/۫ܳܳ;-><init>()V

    .line 277
    new-instance v1, Lbin/mt/json/JSONParser;

    invoke-direct {v1, v0}, Lbin/mt/json/JSONParser;-><init>(Lbin/mt/json/JSONHandler;)V

    invoke-virtual {v1, p0}, Lbin/mt/json/JSONParser;->parse(Ljava/lang/String;)V

    .line 278
    invoke-virtual {v0}, Ll/۫ܳܳ;->֫()Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 274
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "string is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static value(D)Lbin/mt/json/JSONValue;
    .locals 1

    .line 119
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    .line 122
    new-instance v0, Ll/ۨܳܳ;

    invoke-static {p0, p1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->cutOffPointZero(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۨܳܳ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 120
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Infinite and NaN values not permitted in JSON"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static value(F)Lbin/mt/json/JSONValue;
    .locals 1

    .line 106
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    new-instance v0, Ll/ۨܳܳ;

    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->cutOffPointZero(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۨܳܳ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 107
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Infinite and NaN values not permitted in JSON"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static value(I)Lbin/mt/json/JSONValue;
    .locals 2

    .line 86
    new-instance v0, Ll/ۨܳܳ;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۨܳܳ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static value(J)Lbin/mt/json/JSONValue;
    .locals 2

    .line 96
    new-instance v0, Ll/ۨܳܳ;

    const/16 v1, 0xa

    invoke-static {p0, p1, v1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۨܳܳ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static value(Ljava/lang/String;)Lbin/mt/json/JSONValue;
    .locals 1

    if-nez p0, :cond_0

    .line 132
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    :cond_0
    new-instance v0, Ll/۟ܳܳ;

    invoke-direct {v0, p0}, Ll/۟ܳܳ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static value(Z)Lbin/mt/json/JSONValue;
    .locals 0

    if-eqz p0, :cond_0

    .line 142
    sget-object p0, Lbin/mt/json/JSON;->TRUE:Lbin/mt/json/JSONValue;

    return-object p0

    :cond_0
    sget-object p0, Lbin/mt/json/JSON;->FALSE:Lbin/mt/json/JSONValue;

    return-object p0
.end method
