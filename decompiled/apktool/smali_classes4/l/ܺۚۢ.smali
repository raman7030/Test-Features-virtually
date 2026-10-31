.class public final Ll/ܺۚۢ;
.super Ljava/lang/Object;
.source "F7BL"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;

.field public static final ۧ:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(?is)(<title\\b[^>]*>).*?(</title>)"

    .line 29
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܺۚۢ;->ۧ:Ljava/util/regex/Pattern;

    const-string v0, "(?is)(<html\\b[^>]*?\\blang\\s*=\\s*)([\"\'])(.*?)(\\2[^>]*>)"

    .line 30
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܺۚۢ;->֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 132
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Ll/ۢۤۡ;->֫(Landroid/app/Application;)Ljava/util/Locale;

    move-result-object v0

    .line 133
    invoke-static {v0}, Ll/ۖۚۢ;->֫(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 143
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v2

    .line 144
    new-instance v3, Landroid/content/res/Configuration;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 145
    invoke-virtual {v3, v0}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 146
    invoke-virtual {v3, v0}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 147
    invoke-virtual {v2, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f12084e

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "zh-"

    .line 154
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "MT"

    goto :goto_0

    :cond_0
    const-string v2, "MT "

    .line 0
    :goto_0
    invoke-static {v2, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 191
    sget-object v2, Ll/ܺۚۢ;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 192
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v3, :cond_1

    goto :goto_1

    .line 195
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->start()I

    move-result v7

    invoke-virtual {p0, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    invoke-virtual {v2, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "&"

    const-string v8, "&amp;"

    .line 180
    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v7, "<"

    const-string v8, "&lt;"

    .line 181
    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v7, ">"

    const-string v8, "&gt;"

    .line 182
    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v7, "\""

    const-string v8, "&quot;"

    .line 183
    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v7, "\'"

    const-string v8, "&#39;"

    .line 184
    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 197
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    invoke-virtual {v2, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_1
    const-string v0, "zh-rCN"

    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v1, "zh-CN"

    goto :goto_2

    :cond_2
    const-string v0, "zh-rTW"

    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v1, "zh-TW"

    goto :goto_2

    :cond_3
    const-string v0, "in"

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v1, "id"

    .line 206
    :cond_4
    :goto_2
    sget-object v0, Ll/ܺۚۢ;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 207
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-nez v2, :cond_5

    return-object p0

    .line 210
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x4

    .line 214
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    .line 0
    invoke-static {v0, p0, v2}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ljava/lang/String;Z)Ll/ۡۚۢ;
    .locals 6

    const-string v0, "web-manager/"

    .line 112
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-static {}, Ll/ۙ᩸᩷;->ۧ()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    :try_start_1
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v2, 0x2000

    new-array v2, v2, [B

    .line 225
    :goto_0
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    const/4 v4, 0x0

    .line 226
    invoke-virtual {v1, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 228
    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v2, "index.html"

    if-nez p2, :cond_2

    .line 114
    :try_start_2
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "assets/"

    .line 235
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x2f

    .line 238
    invoke-virtual {p1, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x2e

    .line 239
    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v4

    const/16 v5, 0x2d

    .line 240
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v3

    if-lez v4, :cond_2

    if-ltz v3, :cond_2

    sub-int/2addr v4, v3

    const/16 v3, 0x8

    if-le v4, v3, :cond_2

    const-string v3, "public, max-age=31536000, immutable"

    goto :goto_2

    :cond_2
    :goto_1
    const-string v3, "no-cache"

    :goto_2
    if-nez p2, :cond_3

    .line 117
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 119
    :cond_3
    new-instance p2, Ljava/lang/String;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p2, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 120
    invoke-static {p2}, Ll/ܺۚۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 122
    :cond_4
    new-instance p2, Ll/ۡۚۢ;

    invoke-static {p1}, Ll/ܺۚۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v1, v3}, Ll/ۡۚۢ;-><init>(Ljava/lang/String;[BLjava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    return-object p2

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_5

    .line 112
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    :try_start_5
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 248
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, ".html"

    .line 249
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "text/html; charset=UTF-8"

    return-object p0

    :cond_0
    const-string v0, ".js"

    .line 250
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, ".mjs"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v0, ".css"

    .line 251
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "text/css; charset=UTF-8"

    return-object p0

    :cond_2
    const-string v0, ".json"

    .line 252
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, ".map"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, ".svg"

    .line 253
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p0, "image/svg+xml"

    return-object p0

    :cond_4
    const-string v0, ".png"

    .line 254
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p0, "image/png"

    return-object p0

    :cond_5
    const-string v0, ".jpg"

    .line 255
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, ".jpeg"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    const-string v0, ".webp"

    .line 256
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string p0, "image/webp"

    return-object p0

    :cond_7
    const-string v0, ".ico"

    .line 257
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string p0, "image/x-icon"

    return-object p0

    :cond_8
    const-string v0, ".woff"

    .line 258
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string p0, "font/woff"

    return-object p0

    :cond_9
    const-string v0, ".woff2"

    .line 259
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string p0, "font/woff2"

    return-object p0

    :cond_a
    const-string v0, ".txt"

    .line 260
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_b

    const-string p0, "text/plain; charset=UTF-8"

    return-object p0

    :cond_b
    const-string p0, "application/octet-stream"

    return-object p0

    :cond_c
    :goto_0
    const-string p0, "image/jpeg"

    return-object p0

    :cond_d
    :goto_1
    const-string p0, "application/json; charset=UTF-8"

    return-object p0

    :cond_e
    :goto_2
    const-string p0, "application/javascript; charset=UTF-8"

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 10

    .line 53
    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v0

    .line 54
    sget-object v1, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    sget-object v1, Ll/ۘܳܳ;->۬:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 55
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v2, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 57
    :cond_0
    invoke-virtual {p1}, Ll/ܺܳܳ;->ۡ()Ljava/lang/String;

    move-result-object p1

    .line 89
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v3, "index.html"

    const-string v4, "/"

    if-nez v1, :cond_1

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    move-object p1, v3

    .line 90
    :cond_2
    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    .line 91
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 93
    :cond_3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    move-object p1, v3

    goto :goto_2

    .line 96
    :cond_4
    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v6, 0x0

    if-nez v1, :cond_7

    const-string v1, "\\"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ltz v1, :cond_5

    goto :goto_1

    .line 99
    :cond_5
    invoke-virtual {p1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 100
    array-length v4, v1

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v4, :cond_8

    aget-object v8, v1, v7

    .line 101
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_7

    const-string v9, "."

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    const-string v9, ".."

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    goto :goto_1

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_7
    :goto_1
    move-object p1, v6

    :cond_8
    :goto_2
    const-string v1, ""

    const-string v4, "text/plain"

    if-nez p1, :cond_9

    .line 59
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    .line 76
    invoke-static {p1, v4, v1}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 62
    :cond_9
    invoke-direct {p0, p1, v2}, Ll/ܺۚۢ;->֫(Ljava/lang/String;Z)Ll/ۡۚۢ;

    move-result-object v6

    if-nez v6, :cond_a

    .line 63
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 64
    invoke-direct {p0, v3, v5}, Ll/ܺۚۢ;->֫(Ljava/lang/String;Z)Ll/ۡۚۢ;

    move-result-object v6

    :cond_a
    if-nez v6, :cond_b

    .line 67
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    .line 76
    invoke-static {p1, v4, v1}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 70
    :cond_b
    sget-object p1, Ll/ۘܳܳ;->۬:Ll/ۘܳܳ;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 71
    new-instance p1, Ljava/io/ByteArrayInputStream;

    new-array v1, v2, [B

    invoke-direct {p1, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    goto :goto_3

    .line 72
    :cond_c
    new-instance p1, Ljava/io/ByteArrayInputStream;

    invoke-static {v6}, Ll/ۡۚۢ;->֫(Ll/ۡۚۢ;)[B

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 73
    :goto_3
    sget-object v1, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    invoke-static {v6}, Ll/ۡۚۢ;->ܽ(Ll/ۡۚۢ;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v6}, Ll/ۡۚۢ;->֫(Ll/ۡۚۢ;)[B

    move-result-object v3

    array-length v3, v3

    int-to-long v3, v3

    .line 83
    invoke-static {v1, v2, p1, v3, v4}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/io/InputStream;J)Ll/۠ܳܳ;

    move-result-object p1

    .line 79
    invoke-virtual {p1, v0}, Ll/۠ܳܳ;->֫(Ll/ۘܳܳ;)V

    const-string v0, "Cache-Control"

    .line 80
    invoke-static {v6}, Ll/ۡۚۢ;->ۧ(Ll/ۡۚۢ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Referrer-Policy"

    const-string v1, "no-referrer"

    .line 81
    invoke-virtual {p1, v0, v1}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method
