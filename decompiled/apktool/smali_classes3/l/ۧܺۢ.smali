.class public final Ll/ۧܺۢ;
.super Ljava/lang/Object;
.source "W1P7"


# instance fields
.field public ֫:Z

.field public ۧ:Ljava/lang/String;

.field public ܳ:Z

.field public ܽ:Z

.field public ܿ:Z

.field public ᩳ:Ljava/lang/String;


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 172
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "pattern"

    .line 173
    iget-object v2, p0, Ll/ۧܺۢ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "obf"

    .line 174
    iget-boolean v2, p0, Ll/ۧܺۢ;->ܽ:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "keep"

    .line 175
    iget-boolean v2, p0, Ll/ۧܺۢ;->֫:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "xp"

    .line 176
    iget-boolean v2, p0, Ll/ۧܺۢ;->ܳ:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "vfy"

    .line 177
    iget-boolean v2, p0, Ll/ۧܺۢ;->ܿ:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "map"

    .line 178
    iget-object v2, p0, Ll/ۧܺۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 179
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 181
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 7

    const-string v0, "map"

    const-string v1, "vfy"

    const-string v2, "xp"

    const-string v3, "keep"

    const-string v4, "obf"

    const-string v5, "pattern"

    .line 187
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 188
    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 189
    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۧܺۢ;->ᩳ:Ljava/lang/String;

    .line 190
    :cond_0
    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 191
    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۧܺۢ;->ܽ:Z

    .line 192
    :cond_1
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 193
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۧܺۢ;->֫:Z

    .line 194
    :cond_2
    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 195
    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۧܺۢ;->ܳ:Z

    .line 196
    :cond_3
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 197
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۧܺۢ;->ܿ:Z

    .line 198
    :cond_4
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 199
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۧܺۢ;->ۧ:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_5
    return-void
.end method
