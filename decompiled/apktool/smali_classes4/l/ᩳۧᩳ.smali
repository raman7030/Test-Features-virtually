.class public final Ll/ᩳۧᩳ;
.super Ljava/lang/Object;
.source "P3YK"


# static fields
.field public static ֫:[B

.field public static ۧ:[B

.field public static ܽ:Ljava/lang/String;

.field public static ᩳ:Ljava/lang/String;


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 16

    const-string v0, "webfanyi"

    const-string v1, "0"

    const-string v2, "1"

    const-string v3, "zh"

    move-object/from16 v4, p1

    .line 89
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "zh-CHS"

    if-eqz v5, :cond_0

    move-object/from16 v5, p2

    move-object v4, v6

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    .line 92
    :goto_0
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v5, v6

    .line 95
    :cond_1
    sget-object v3, Ll/ᩳۧᩳ;->ܽ:Ljava/lang/String;

    const-string v6, "client=fanyideskweb&mysticTime="

    const-string v7, "code"

    const-string v8, "Referer"

    const-string v9, "Cookie"

    const-string v10, "https://fanyi.youdao.com/"

    const/4 v11, 0x0

    if-nez v3, :cond_5

    .line 23
    new-instance v3, Ll/ܳۧᩳ;

    invoke-direct {v3, v10, v11}, Ll/ܳۧᩳ;-><init>(Ljava/lang/String;Z)V

    .line 97
    invoke-virtual {v3}, Ll/ܳۧᩳ;->֫()Ljava/net/HttpURLConnection;

    move-result-object v3

    const-string v12, "Set-Cookie"

    .line 98
    invoke-virtual {v3, v12}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    const/16 v12, 0x3b

    .line 102
    invoke-virtual {v3, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    const/4 v13, -0x1

    if-ne v12, v13, :cond_2

    goto :goto_1

    .line 103
    :cond_2
    invoke-virtual {v3, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    :goto_1
    sput-object v3, Ll/ᩳۧᩳ;->ܽ:Ljava/lang/String;

    .line 105
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 106
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v14, "https://dict.youdao.com/webtranslate/key?keyid=webfanyi-key-getter-2025&sign="

    invoke-direct {v3, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v15, "&product=webfanyi&key=yU5nT5dK3eZ1pI4j"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ll/ܳۤۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 106
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "&client=fanyideskweb&product=webfanyi&appVersion=1.0.0&vendor=web&pointParam=client,mysticTime,product&mysticTime="

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v12, "&keyfrom=fanyi.web&mid=1&screen=1&model=1&network=wifi&abtest=0&yduuid=abcdefg"

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 23
    new-instance v12, Ll/ܳۧᩳ;

    invoke-direct {v12, v3, v11}, Ll/ܳۧᩳ;-><init>(Ljava/lang/String;Z)V

    .line 110
    sget-object v3, Ll/ᩳۧᩳ;->ܽ:Ljava/lang/String;

    .line 111
    invoke-virtual {v12, v9, v3}, Ll/ܳۧᩳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    invoke-virtual {v12, v8, v10}, Ll/ܳۧᩳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    new-instance v3, Lbin/mt/json/JSONObject;

    invoke-virtual {v12}, Ll/ܳۧᩳ;->ۧ()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v3, v12}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v3, v7}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    if-nez v12, :cond_3

    const-string v12, "data"

    .line 118
    invoke-virtual {v3, v12}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v12, "secretKey"

    .line 119
    invoke-virtual {v3, v12}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    sput-object v12, Ll/ᩳۧᩳ;->ᩳ:Ljava/lang/String;

    .line 120
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object v12

    const-string v13, "aesKey"

    invoke-virtual {v3, v13}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->getBytes()[B

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v12

    sput-object v12, Ll/ᩳۧᩳ;->ۧ:[B

    .line 121
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object v12

    const-string v13, "aesIv"

    invoke-virtual {v3, v13}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v12, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v3

    sput-object v3, Ll/ᩳۧᩳ;->֫:[B

    goto :goto_2

    .line 116
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "msg"

    invoke-virtual {v3, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Can not get cookie"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 125
    :cond_5
    :goto_2
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    const-string v3, "https://dict.youdao.com/webtranslate"

    .line 19
    new-instance v14, Ll/ܳۧᩳ;

    const/4 v15, 0x1

    invoke-direct {v14, v3, v15}, Ll/ܳۧᩳ;-><init>(Ljava/lang/String;Z)V

    .line 126
    sget-object v3, Ll/ᩳۧᩳ;->ܽ:Ljava/lang/String;

    .line 127
    invoke-virtual {v14, v9, v3}, Ll/ܳۧᩳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    invoke-virtual {v14, v8, v10}, Ll/ܳۧᩳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "i"

    move-object/from16 v8, p0

    .line 129
    invoke-virtual {v14, v3, v8}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "from"

    .line 130
    invoke-virtual {v14, v3, v4}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "to"

    .line 131
    invoke-virtual {v14, v3, v5}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "useTerm"

    const-string v4, "false"

    .line 132
    invoke-virtual {v14, v3, v4}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "domain"

    .line 133
    invoke-virtual {v14, v3, v1}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "dictResult"

    const-string v4, "true"

    .line 134
    invoke-virtual {v14, v3, v4}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "keyid"

    .line 135
    invoke-virtual {v14, v3, v0}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "sign"

    sget-object v4, Ll/ᩳۧᩳ;->ᩳ:Ljava/lang/String;

    .line 183
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, "&product=webfanyi&key="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ܳۤۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 136
    invoke-virtual {v14, v3, v4}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "client"

    const-string v4, "fanyideskweb"

    .line 137
    invoke-virtual {v14, v3, v4}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "product"

    .line 138
    invoke-virtual {v14, v3, v0}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "appVersion"

    const-string v3, "1.0.0"

    .line 139
    invoke-virtual {v14, v0, v3}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "vendor"

    const-string v3, "web"

    .line 140
    invoke-virtual {v14, v0, v3}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pointParam"

    const-string v3, "client,mysticTime,product"

    .line 141
    invoke-virtual {v14, v0, v3}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mysticTime"

    .line 142
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v0, v3}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "keyfrom"

    const-string v3, "fanyi.web"

    .line 143
    invoke-virtual {v14, v0, v3}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mid"

    .line 144
    invoke-virtual {v14, v0, v2}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "screen"

    .line 145
    invoke-virtual {v14, v0, v2}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "model"

    .line 146
    invoke-virtual {v14, v0, v2}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "network"

    const-string v2, "wifi"

    .line 147
    invoke-virtual {v14, v0, v2}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "abtest"

    .line 148
    invoke-virtual {v14, v0, v1}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "yduuid"

    const-string v1, "abcdefg"

    .line 149
    invoke-virtual {v14, v0, v1}, Ll/ܳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    invoke-virtual {v14}, Ll/ܳۧᩳ;->ۧ()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x5f

    const/16 v2, 0x2f

    .line 151
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2d

    const/16 v2, 0x2b

    .line 152
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 153
    invoke-static {v0, v11}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 154
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    sget-object v2, Ll/ᩳۧᩳ;->ۧ:[B

    const-string v3, "AES"

    invoke-direct {v1, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 155
    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    sget-object v3, Ll/ᩳۧᩳ;->֫:[B

    invoke-direct {v2, v3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const-string v3, "AES/CBC/PKCS5Padding"

    .line 156
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    const/4 v4, 0x2

    .line 157
    invoke-virtual {v3, v4, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 158
    invoke-virtual {v3, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    .line 159
    new-instance v1, Lbin/mt/json/JSONObject;

    new-instance v2, Ljava/lang/String;

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 160
    invoke-virtual {v1, v7}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_7

    const/16 v2, 0x32

    if-eq v0, v2, :cond_6

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    .line 170
    sput-object v0, Ll/ᩳۧᩳ;->ܽ:Ljava/lang/String;

    .line 173
    :goto_3
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const-string v0, "translateResult"

    .line 162
    invoke-virtual {v1, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 163
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v2, :cond_8

    .line 166
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->getJSONArray(I)Lbin/mt/json/JSONArray;

    move-result-object v4

    invoke-virtual {v4, v11}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "tgt"

    invoke-virtual {v4, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 168
    :cond_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 175
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_9

    check-cast v0, Ljava/io/IOException;

    .line 176
    throw v0

    .line 178
    :cond_9
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
