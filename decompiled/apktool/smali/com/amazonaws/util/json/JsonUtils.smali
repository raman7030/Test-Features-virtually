.class public Lcom/amazonaws/util/json/JsonUtils;
.super Ljava/lang/Object;
.source "JsonUtils.java"


# static fields
.field public static final ֫:Lcom/amazonaws/util/json/AwsJsonFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Lcom/amazonaws/util/json/GsonFactory;

    invoke-direct {v0}, Lcom/amazonaws/util/json/GsonFactory;-><init>()V

    sput-object v0, Lcom/amazonaws/util/json/JsonUtils;->֫:Lcom/amazonaws/util/json/AwsJsonFactory;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/util/Map;
    .locals 3

    if-eqz p0, :cond_4

    .line 138
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 141
    :cond_0
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 79
    sget-object p0, Lcom/amazonaws/util/json/JsonUtils;->֫:Lcom/amazonaws/util/json/AwsJsonFactory;

    check-cast p0, Lcom/amazonaws/util/json/GsonFactory;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    new-instance p0, Lcom/amazonaws/util/json/GsonFactory$GsonReader;

    invoke-direct {p0, v0}, Lcom/amazonaws/util/json/GsonFactory$GsonReader;-><init>(Ljava/io/StringReader;)V

    .line 105
    :try_start_0
    invoke-virtual {p0}, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->ۜ()Lcom/amazonaws/util/json/AwsJsonToken;

    move-result-object v0

    if-nez v0, :cond_1

    .line 106
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p0

    .line 109
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 110
    invoke-virtual {p0}, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->֫()V

    .line 111
    :goto_0
    invoke-virtual {p0}, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 112
    invoke-virtual {p0}, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 113
    invoke-virtual {p0}, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 115
    invoke-virtual {p0}, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->᩷()V

    goto :goto_0

    .line 117
    :cond_2
    invoke-virtual {p0}, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->᩻()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 120
    :cond_3
    invoke-virtual {p0}, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->ܽ()V

    .line 121
    invoke-virtual {p0}, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->ۧ()V

    .line 123
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 125
    new-instance v0, Lcom/amazonaws/AmazonClientException;

    const-string v1, "Unable to parse JSON String."

    .line 50
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    throw v0

    .line 139
    :cond_4
    :goto_1
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p0
.end method
