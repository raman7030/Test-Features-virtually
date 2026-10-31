.class public Lcom/amazonaws/util/HttpUtils;
.super Ljava/lang/Object;
.source "HttpUtils.java"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "+"

    .line 56
    invoke-static {v1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "|"

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "*"

    .line 58
    invoke-static {v2}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "%7E"

    .line 60
    invoke-static {v2}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "%2F"

    .line 62
    invoke-static {v2}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/util/HttpUtils;->֫:Ljava/util/regex/Pattern;

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "%2A"

    .line 71
    invoke-static {v2}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "%2B"

    .line 73
    invoke-static {v2}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Lcom/amazonaws/Request;)Ljava/lang/String;
    .locals 6

    const-string v0, "UTF-8"

    .line 191
    check-cast p0, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->ܳ()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 194
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    :try_start_0
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->ܳ()Ljava/util/LinkedHashMap;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v2, 0x1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 198
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4, v0}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 199
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_1

    const-string v3, ""

    goto :goto_1

    .line 200
    :cond_1
    invoke-static {v3, v0}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_1
    if-nez v2, :cond_2

    const-string v5, "&"

    .line 203
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    .line 207
    :goto_2
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 212
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    .line 210
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    const-string v0, "/"

    if-eqz p1, :cond_3

    .line 241
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    .line 242
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 245
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 0
    invoke-static {v2, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 248
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 249
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 251
    :cond_1
    :goto_0
    invoke-static {p1, v2}, Lcom/amazonaws/util/HttpUtils;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_2

    const-string p2, "//"

    const-string v0, "/%2F"

    .line 253
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 0
    :cond_2
    invoke-static {p0, p1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 256
    :cond_3
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 257
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_4
    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    :try_start_0
    const-string v0, "UTF-8"

    .line 97
    invoke-static {p0, v0}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 99
    sget-object v0, Lcom/amazonaws/util/HttpUtils;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 100
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-direct {v1, p0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 102
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result p0

    if-eqz p0, :cond_5

    const/4 p0, 0x0

    .line 103
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-string v2, "+"

    .line 105
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p0, "%20"

    goto :goto_1

    :cond_1
    const-string v2, "*"

    .line 107
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string p0, "%2A"

    goto :goto_1

    :cond_2
    const-string v2, "%7E"

    .line 109
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string p0, "~"

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    const-string v2, "%2F"

    .line 111
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string p0, "/"

    .line 114
    :cond_4
    :goto_1
    invoke-virtual {v0, v1, p0}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    goto :goto_0

    .line 117
    :cond_5
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 118
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 121
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ֫(Ljava/net/URI;)Z
    .locals 3

    .line 155
    invoke-virtual {p0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/util/StringUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-virtual {p0}, Ljava/net/URI;->getPort()I

    move-result p0

    const/4 v1, 0x0

    if-gtz p0, :cond_0

    return v1

    :cond_0
    const-string v2, "http"

    .line 161
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x50

    if-ne p0, v2, :cond_1

    return v1

    :cond_1
    const-string v2, "https"

    .line 164
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x1bb

    if-ne p0, v0, :cond_2

    return v1

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Lcom/amazonaws/Request;)Z
    .locals 3

    .line 176
    sget-object v0, Lcom/amazonaws/http/HttpMethodName;->۬:Lcom/amazonaws/http/HttpMethodName;

    check-cast p0, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->ᩳ()Lcom/amazonaws/http/HttpMethodName;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 177
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->֫()Ljava/io/InputStream;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    if-eqz p0, :cond_1

    return v2

    :cond_1
    return v1
.end method
