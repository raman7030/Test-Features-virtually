.class public final Ll/ܰܺ᩻;
.super Ljava/lang/Object;
.source "I81B"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Ll/ܰܺ᩻;->֫:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Ll/ܰܺ᩻;->ۧ:Ljava/lang/String;

    return-void
.end method

.method private ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "\nHost: uc.qiniuapi.com"

    const-string v1, "\n\n"

    const-string v2, "GET "

    .line 0
    invoke-static {v2, p1, v0, v1}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 160
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    iget-object v1, p0, Ll/ܰܺ᩻;->ۧ:Ljava/lang/String;

    const-string v2, "HmacSHA1"

    .line 178
    :try_start_0
    invoke-static {v2}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v3

    .line 179
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-direct {v4, v0, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 180
    invoke-virtual {v3, v4}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 181
    invoke-virtual {v3, p1}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    invoke-static {}, Ll/᩵۬ᩴ;->getEncoder()Ll/ᩴ۬ᩴ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ᩴ۬ᩴ;->encodeToString([B)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x2b

    const/16 v1, 0x2d

    .line 196
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x2f

    const/16 v1, 0x5f

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܰܺ᩻;->֫:Ljava/lang/String;

    const-string v2, ":"

    .line 0
    invoke-static {v0, v1, v2, p1}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 183
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to generate HMAC signature"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 10

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "/buckets"

    .line 66
    invoke-direct {p0, v1}, Ll/ܰܺ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 69
    new-instance v2, Ll/ۢ۟᩵;

    invoke-direct {v2}, Ll/ۢ۟᩵;-><init>()V

    const-string v3, "https://uc.qiniuapi.com/buckets"

    .line 70
    invoke-virtual {v2, v3}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Qiniu "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "Authorization"

    .line 71
    invoke-virtual {v2, v3, v1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    invoke-virtual {v2}, Ll/ۢ۟᩵;->ۧ()V

    .line 73
    invoke-virtual {v2}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v1

    .line 76
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۡ()Ll/ܿ۟᩵;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v1

    invoke-interface {v1}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 77
    :try_start_1
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const-string v5, " "

    const-string v6, "Request failed: "

    if-nez v2, :cond_2

    .line 78
    :try_start_2
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    const/16 v2, 0x191

    if-eq v0, v2, :cond_1

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    const/16 v2, 0x193

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 81
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ۖ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_1
    :goto_0
    new-instance v0, Ll/᩵ۤۡ;

    const v2, 0x7f120703

    invoke-direct {v0, v2}, Ll/᩵ۤۡ;-><init>(I)V

    throw v0

    .line 83
    :cond_2
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ll/֡۟᩵;->ۜ()Ljava/lang/String;

    move-result-object v2

    .line 84
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 85
    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 86
    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-ge v2, v9, :cond_3

    .line 87
    invoke-virtual {v8, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 90
    :cond_3
    :try_start_3
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->close()V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 39
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v7, "/v2/bucketInfo?bucket="

    .line 0
    invoke-static {v7, v2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "https://uc.qiniuapi.com"

    invoke-static {v8, v7}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 101
    invoke-direct {p0, v7}, Ll/ܰܺ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 104
    new-instance v9, Ll/ۢ۟᩵;

    invoke-direct {v9}, Ll/ۢ۟᩵;-><init>()V

    .line 105
    invoke-virtual {v9, v8}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 106
    invoke-virtual {v9, v3, v7}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    invoke-virtual {v9}, Ll/ۢ۟᩵;->ۧ()V

    .line 108
    invoke-virtual {v9}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v7

    .line 111
    :try_start_4
    invoke-static {}, Ll/ۙ᩸᩷;->ۡ()Ll/ܿ۟᩵;

    move-result-object v8

    invoke-virtual {v8, v7}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v7

    invoke-interface {v7}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v7
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 112
    :try_start_5
    invoke-virtual {v7}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v8

    if-eqz v8, :cond_9

    .line 115
    invoke-virtual {v7}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v8

    invoke-static {v8}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Ll/֡۟᩵;->ۜ()Ljava/lang/String;

    move-result-object v8

    .line 116
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v8, "region"

    .line 117
    invoke-virtual {v9, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 118
    :try_start_6
    invoke-virtual {v7}, Ll/ᩴ۟᩵;->close()V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    .line 41
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v7

    const/4 v9, -0x1

    sparse-switch v7, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v7, "na0"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_3

    :cond_4
    const/4 v9, 0x4

    goto :goto_3

    :sswitch_1
    const-string v7, "as0"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_3

    :cond_5
    const/4 v9, 0x3

    goto :goto_3

    :sswitch_2
    const-string v7, "z2"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_3

    :cond_6
    const/4 v9, 0x2

    goto :goto_3

    :sswitch_3
    const-string v7, "z1"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_3

    :cond_7
    const/4 v9, 0x1

    goto :goto_3

    :sswitch_4
    const-string v7, "z0"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_3

    :cond_8
    const/4 v9, 0x0

    :goto_3
    packed-switch v9, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    const-string v8, "us-north-1"

    goto :goto_4

    :pswitch_1
    const-string v8, "ap-southeast-1"

    goto :goto_4

    :pswitch_2
    const-string v8, "cn-south-1"

    goto :goto_4

    :pswitch_3
    const-string v8, "cn-north-1"

    goto :goto_4

    :pswitch_4
    const-string v8, "cn-east-1"

    :goto_4
    const-string v7, "s3."

    const-string v9, ".qiniucs.com"

    .line 0
    invoke-static {v7, v8, v9}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 49
    new-instance v9, Ll/ۛܺ᩻;

    invoke-direct {v9, v2, v8, v7}, Ll/ۛܺ᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 113
    :cond_9
    :try_start_7
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ll/ᩴ۟᩵;->ۖ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_0
    move-exception v0

    .line 111
    :try_start_8
    invoke-virtual {v7}, Ll/ᩴ۟᩵;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v1

    :try_start_9
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v0
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_0

    :catch_0
    move-exception v0

    .line 119
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_a
    return-object v0

    :catchall_2
    move-exception v0

    .line 76
    :try_start_a
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v1

    :try_start_b
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v0
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_1

    :catch_1
    move-exception v0

    .line 91
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :sswitch_data_0
    .sparse-switch
        0xef6 -> :sswitch_4
        0xef7 -> :sswitch_3
        0xef8 -> :sswitch_2
        0x17a3e -> :sswitch_1
        0x1a8dd -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
