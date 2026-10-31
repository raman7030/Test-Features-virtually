.class public final Ll/᩷᩸ۡ;
.super Ljava/lang/Object;
.source "O5NZ"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;

.field public static final ۧ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/᩷᩸ۡ;->ۧ:Ljava/util/ArrayList;

    const-string v0, "png"

    const-string v1, "89 50 4E 47"

    .line 25
    invoke-static {v0, v1}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "jpg"

    const-string v1, "FF D8 FF"

    .line 26
    invoke-static {v0, v1}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "gif"

    const-string v1, "47 49 46 38"

    .line 27
    invoke-static {v0, v1}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "webp"

    const-string v1, "52 49 46 46 ?? ?? ?? ?? 57 45 42 50 56 50 38"

    .line 28
    invoke-static {v0, v1}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "42 4D"

    const-string v1, "bmp"

    .line 30
    invoke-static {v1, v0}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "42 41"

    .line 31
    invoke-static {v1, v0}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "43 49"

    .line 32
    invoke-static {v1, v0}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "43 50"

    .line 33
    invoke-static {v1, v0}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "49 43"

    .line 34
    invoke-static {v1, v0}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "50 54"

    .line 35
    invoke-static {v1, v0}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "00 00 00 ?? 66 74 79 70 69 73 6F 36"

    const-string v1, "mp4"

    .line 37
    invoke-static {v1, v0}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "00 00 00 ?? 66 74 79 70 6D 70 34 32"

    .line 38
    invoke-static {v1, v0}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "m4a"

    const-string v1, "00 00 00 ?? 66 74 79 70 4D 34 41 20"

    .line 40
    invoke-static {v0, v1}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mp3"

    const-string v1, "49 44 33"

    .line 41
    invoke-static {v0, v1}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ogg"

    const-string v1, "4F 67 67 53"

    .line 42
    invoke-static {v0, v1}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "wav"

    const-string v1, "52 49 46 46 ?? ?? ?? ?? 57 41 56 45"

    .line 43
    invoke-static {v0, v1}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ttf"

    const-string v1, "00 01 00 00"

    .line 45
    invoke-static {v0, v1}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ttc"

    const-string v1, "74 74 63 66"

    .line 46
    invoke-static {v0, v1}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "otf"

    const-string v1, "4F 54 54 4F"

    .line 47
    invoke-static {v0, v1}, Ll/᩷᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "\\s*<!doctype *(\\w+)[ >]"

    const/4 v1, 0x2

    .line 76
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩷᩸ۡ;->֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(I[B)I
    .locals 2

    .line 73
    aget-byte v0, p1, p0

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 12

    const-string v0, "Placemark"

    const-string v1, "plist"

    const-string v2, "svg"

    const-string v3, "kml"

    .line 80
    sget-object v4, Ll/᩷᩸ۡ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩻᩸ۡ;

    .line 81
    invoke-static {v5, p0}, Ll/᩻᩸ۡ;->֫(Ll/᩻᩸ۡ;[B)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 82
    invoke-static {v5}, Ll/᩻᩸ۡ;->֫(Ll/᩻᩸ۡ;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_4

    .line 84
    :cond_1
    new-instance v4, Ljava/lang/String;

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, p0, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string v5, "-----BEGIN CERTIFICATE-----"

    .line 87
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v1, "cer"

    goto/16 :goto_4

    :cond_2
    const-string v5, "-----BEGIN PRIVATE KEY-----"

    .line 91
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v1, "key"

    goto/16 :goto_4

    :cond_3
    const-string v5, "<html>"

    .line 95
    invoke-static {v5, v4}, Ll/ۢܺ֡;->ۧ(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    const-string v1, "html"

    goto/16 :goto_4

    .line 99
    :cond_4
    sget-object v5, Ll/᩷᩸ۡ;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 100
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_5

    .line 102
    invoke-virtual {v5, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_4

    .line 107
    :cond_5
    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v5

    .line 108
    new-instance v7, Ljava/io/StringReader;

    invoke-direct {v7, v4}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 111
    new-instance v7, Ljava/util/Stack;

    invoke-direct {v7}, Ljava/util/Stack;-><init>()V

    move-object v9, v6

    .line 112
    :cond_6
    :goto_0
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v10

    if-eq v10, v8, :cond_9

    const/4 v11, 0x2

    if-ne v10, v11, :cond_8

    .line 114
    new-instance v10, Ll/ۜ᩸ۡ;

    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ll/ۜ᩸ۡ;-><init>(Ljava/lang/String;)V

    if-nez v9, :cond_7

    move-object v9, v10

    goto :goto_1

    .line 118
    :cond_7
    invoke-virtual {v7}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۜ᩸ۡ;

    iget-object v11, v11, Ll/ۜ᩸ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    :goto_1
    invoke-virtual {v7, v10}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_8
    const/4 v11, 0x3

    if-ne v10, v11, :cond_6

    .line 122
    invoke-virtual {v7}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    goto :goto_0

    :cond_9
    if-eqz v9, :cond_12

    .line 125
    iget-object v5, v9, Ll/ۜ᩸ۡ;->ۧ:Ljava/lang/String;

    .line 126
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    move-object v1, v2

    goto/16 :goto_4

    .line 129
    :cond_a
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto/16 :goto_4

    .line 132
    :cond_b
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_2

    .line 135
    :cond_c
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-virtual {v9}, Ll/ۜ᩸ۡ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_2

    :cond_d
    const-string v1, "Folder"

    .line 138
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {v9}, Ll/ۜ᩸ۡ;->֫()Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_2

    :cond_e
    const-string v1, "Document"

    .line 141
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    const-string v1, "name"

    .line 252
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ll/ۜ᩸ۡ;->֫([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_3

    .line 255
    :cond_f
    iget-object v1, v9, Ll/ۜ᩸ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ᩸ۡ;

    .line 256
    iget-object v5, v2, Ll/ۜ᩸ۡ;->ۧ:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-virtual {v2}, Ll/ۜ᩸ۡ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_10

    :goto_2
    move-object v1, v3

    goto :goto_4

    :cond_11
    :goto_3
    const-string v1, "xml"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 159
    :catch_0
    :cond_12
    :try_start_1
    new-instance v0, Lorg/json/JSONTokener;

    invoke-direct {v0, v4}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 160
    invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v0

    .line 161
    instance-of v1, v0, Lorg/json/JSONObject;

    if-nez v1, :cond_13

    instance-of v0, v0, Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_14

    :cond_13
    const-string v1, "json"

    goto :goto_4

    :catchall_0
    :cond_14
    move-object v1, v6

    :goto_4
    if-eqz v1, :cond_16

    const-string v0, "png"

    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/16 v0, 0x8

    const/16 v2, 0x8

    .line 55
    :goto_5
    array-length v3, p0

    sub-int/2addr v3, v2

    if-lt v3, v0, :cond_16

    .line 56
    invoke-static {v2, p0}, Ll/᩷᩸ۡ;->֫(I[B)I

    move-result v3

    add-int/lit8 v4, v2, 0x4

    .line 58
    invoke-static {v4, p0}, Ll/᩷᩸ۡ;->֫(I[B)I

    move-result v4

    add-int/lit8 v2, v2, 0x8

    const v5, 0x6e705463

    if-ne v4, v5, :cond_15

    const-string p0, ".9.png"

    return-object p0

    :cond_15
    add-int/lit8 v3, v3, 0x4

    add-int/2addr v2, v3

    goto :goto_5

    :cond_16
    if-eqz v1, :cond_17

    const-string p0, "."

    .line 67
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_17
    return-object v6
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 169
    new-instance v0, Ll/᩻᩸ۡ;

    invoke-direct {v0, p0, p1}, Ll/᩻᩸ۡ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Ll/᩷᩸ۡ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
