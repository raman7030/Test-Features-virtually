.class public Ll/ۘܳ֨;
.super Ljava/lang/Object;
.source "2B5C"


# static fields
.field public static ֫:Z

.field public static ۧ:Z


# direct methods
.method public static ֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 20
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0, p0}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 21
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "type"

    const-string v2, "object"

    .line 22
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "additionalProperties"

    const/4 v2, 0x0

    .line 23
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "properties"

    .line 24
    invoke-virtual {p0, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 133
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 134
    invoke-virtual {v0}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 135
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_0
    const-string v0, "required"

    .line 25
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method
