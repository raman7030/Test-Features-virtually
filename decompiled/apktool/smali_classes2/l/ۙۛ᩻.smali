.class public abstract Ll/ۙۛ᩻;
.super Ljava/lang/Object;
.source "P7A5"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫()Lbin/mt/json/JSONObject;
    .locals 1

    .line 59
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 10

    .line 48
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p1, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    const-string v2, "errorCode"

    .line 49
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 50
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v3, "message"

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-boolean v1, p1, Ll/ۗۛ᩻;->۫:Z

    const-string v4, "recoverable"

    .line 51
    invoke-virtual {v0, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-boolean v1, p1, Ll/ۗۛ᩻;->ۤ:Z

    const-string v5, "retrySameArguments"

    .line 52
    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p1, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    const-string v6, "errorSeverity"

    .line 53
    invoke-virtual {v0, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    const-string v7, "nextActions"

    .line 54
    invoke-virtual {v0, v7, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 55
    iget-object p1, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    .line 63
    invoke-virtual {p1}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONObject$Member;

    .line 64
    invoke-virtual {v1}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v8

    .line 76
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 77
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 78
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 79
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 80
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 81
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v1}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v1

    .line 67
    invoke-virtual {v0, v8, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public abstract ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
.end method

.method public abstract ۧ()Ljava/lang/String;
.end method

.method public abstract ܳ()Ljava/lang/String;
.end method

.method public abstract ܽ()Lbin/mt/json/JSONObject;
.end method

.method public abstract ܿ()Lbin/mt/json/JSONObject;
.end method

.method public abstract ᩳ()Ljava/lang/String;
.end method
