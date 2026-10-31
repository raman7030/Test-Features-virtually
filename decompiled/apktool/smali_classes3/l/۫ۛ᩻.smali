.class public final Ll/۫ۛ᩻;
.super Ljava/lang/Object;
.source "E79L"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 3

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/۫ۛ᩻;->֫:Ljava/util/LinkedHashMap;

    .line 20
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙۛ᩻;

    .line 29
    iget-object v1, p0, Ll/۫ۛ᩻;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ll/ۙۛ᩻;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 32
    invoke-virtual {v0}, Ll/ۙۛ᩻;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ll/ۙۛ᩻;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Duplicate MCP tool: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONArray;
    .locals 6

    .line 39
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 40
    iget-object v1, p0, Ll/۫ۛ᩻;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙۛ᩻;

    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "name"

    .line 17
    invoke-virtual {v2}, Ll/ۙۛ᩻;->ᩳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "title"

    .line 18
    invoke-virtual {v2}, Ll/ۙۛ᩻;->ܳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "description"

    .line 19
    invoke-virtual {v2}, Ll/ۙۛ᩻;->ۧ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "annotations"

    .line 20
    invoke-virtual {v2}, Ll/ۙۛ᩻;->֫()Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "inputSchema"

    .line 21
    invoke-virtual {v2}, Ll/ۙۛ᩻;->ܽ()Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 22
    invoke-virtual {v2}, Ll/ۙۛ᩻;->ܿ()Lbin/mt/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v4, "outputSchema"

    .line 24
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 41
    :cond_0
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/۫ۛ᩻;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۙۛ᩻;

    if-eqz p2, :cond_0

    .line 55
    :try_start_0
    invoke-virtual {p2, p1}, Ll/ۙۛ᩻;->֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;

    move-result-object p1

    invoke-static {p1}, Ll/ۤۛ᩻;->֫(Ll/۬ۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 57
    invoke-virtual {p2, p1}, Ll/ۙۛ᩻;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Unknown tool"

    const/4 p2, 0x0

    .line 48
    invoke-static {p1, p2, p2, p2, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 52
    throw p1
.end method
