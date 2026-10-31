.class public final Ll/֨ۙ᩵;
.super Ljava/lang/Object;


# direct methods
.method public static ֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;
    .locals 1

    if-nez p0, :cond_0

    .line 46
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0, p0}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;
    .locals 2

    .line 24
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 26
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;
    .locals 4

    if-nez p0, :cond_0

    .line 68
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    .line 70
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "hasMore"

    const/4 v2, 0x0

    .line 71
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    const-string v3, "nextCursor"

    .line 72
    invoke-virtual {p0, v3, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "returnedCount"

    .line 73
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "limitMax"

    .line 74
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "totalAvailableCount"

    .line 75
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {p0}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 1
    sget-boolean v0, Ll/ۘܳ֨;->֫:Z

    if-eqz v0, :cond_4

    .line 2
    sget-object v2, Ll/᩵ܳ֨;->֫:Ll/֡ܳ֨;

    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    move-object v0, v2

    .line 0
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v1, v3, :cond_3

    .line 7
    iget-object v1, v2, Ll/֡ܳ֨;->֫:Ll/ۚܳ֨;

    if-nez v1, :cond_2

    .line 8
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 9
    new-instance v3, Landroid/content/ComponentName;

    const-string v4, "com.heytap.openid"

    const-string v5, "com.heytap.openid.IdentifyService"

    invoke-direct {v3, v4, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v3, "action.com.heytap.openid.OPEN_ID_SERVICE"

    .line 10
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    iget-object v3, v2, Ll/֡ܳ֨;->ܿ:Ll/ᩴܳ֨;

    const/4 v4, 0x1

    invoke-virtual {p0, v1, v3, v4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 12
    iget-object v1, v2, Ll/֡ܳ֨;->ᩳ:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    :try_start_1
    iget-object v3, v2, Ll/֡ܳ֨;->ᩳ:Ljava/lang/Object;

    const-wide/16 v4, 0xbb8

    invoke-virtual {v3, v4, v5}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 15
    :catch_0
    :goto_0
    :try_start_2
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p0

    .line 16
    :cond_0
    :goto_2
    iget-object v1, v2, Ll/֡ܳ֨;->֫:Ll/ۚܳ֨;

    if-nez v1, :cond_1

    const-string p0, ""
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v0

    goto :goto_3

    .line 17
    :cond_1
    :try_start_4
    invoke-virtual {v2, p0}, Ll/֡ܳ֨;->֫(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v0

    goto :goto_3

    :catch_1
    :try_start_5
    const-string p0, ""
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 18
    monitor-exit v0

    goto :goto_3

    .line 19
    :cond_2
    :try_start_6
    invoke-virtual {v2, p0}, Ll/֡ܳ֨;->֫(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    monitor-exit v0

    return-object p0

    :catch_2
    :try_start_7
    const-string p0, ""
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 20
    monitor-exit v0

    :goto_3
    return-object p0

    .line 21
    :cond_3
    :try_start_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot run on MainThread"

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    throw p0

    .line 4
    :cond_4
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "SDK Need Init First!"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_2

    .line 82
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final ֫(C)Z
    .locals 1

    .line 103
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Ljava/lang/Character;->isSpaceChar(C)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final ֫(CCZ)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p2, :cond_1

    return v1

    .line 227
    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p0

    .line 228
    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p1

    if-eq p0, p1, :cond_3

    .line 230
    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p0

    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    if-ne p0, p1, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    return v0
.end method

.method public static ۧ(Lbin/mt/json/JSONValue;)I
    .locals 1

    .line 60
    new-instance v0, Ljava/math/BigDecimal;

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValueExact()I

    move-result p0

    return p0
.end method

.method public static ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;
    .locals 3

    if-eqz p0, :cond_5

    .line 114
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 117
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 120
    :cond_1
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 121
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "kind"

    const/4 v1, 0x0

    .line 122
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "target"

    .line 123
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz v0, :cond_3

    if-nez p0, :cond_2

    goto :goto_0

    .line 124
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3a

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    .line 126
    :cond_4
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    .line 115
    :cond_5
    :goto_1
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0
.end method

.method public static ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;
    .locals 1

    if-eqz p0, :cond_1

    .line 53
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0
.end method
