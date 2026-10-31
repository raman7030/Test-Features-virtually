.class public Ll/۫ܳܳ;
.super Lbin/mt/json/JSONHandler;
.source "5AV2"


# instance fields
.field public ֫:Lbin/mt/json/JSONValue;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 310
    invoke-direct {p0}, Lbin/mt/json/JSONHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic endArray(Ljava/lang/Object;)V
    .locals 0

    .line 310
    check-cast p1, Lbin/mt/json/JSONArray;

    invoke-virtual {p0, p1}, Ll/۫ܳܳ;->֫(Lbin/mt/json/JSONArray;)V

    return-void
.end method

.method public bridge synthetic endArrayValue(Ljava/lang/Object;)V
    .locals 0

    .line 310
    check-cast p1, Lbin/mt/json/JSONArray;

    invoke-virtual {p0, p1}, Ll/۫ܳܳ;->ۧ(Lbin/mt/json/JSONArray;)V

    return-void
.end method

.method public endBoolean(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 331
    sget-object p1, Lbin/mt/json/JSON;->TRUE:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    sget-object p1, Lbin/mt/json/JSON;->FALSE:Lbin/mt/json/JSONValue;

    :goto_0
    iput-object p1, p0, Ll/۫ܳܳ;->֫:Lbin/mt/json/JSONValue;

    return-void
.end method

.method public endNull()V
    .locals 1

    .line 326
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    iput-object v0, p0, Ll/۫ܳܳ;->֫:Lbin/mt/json/JSONValue;

    return-void
.end method

.method public endNumber(Ljava/lang/String;)V
    .locals 1

    .line 341
    new-instance v0, Ll/ۨܳܳ;

    invoke-direct {v0, p1}, Ll/ۨܳܳ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/۫ܳܳ;->֫:Lbin/mt/json/JSONValue;

    return-void
.end method

.method public bridge synthetic endObject(Ljava/lang/Object;)V
    .locals 0

    .line 310
    check-cast p1, Lbin/mt/json/JSONObject;

    invoke-virtual {p0, p1}, Ll/۫ܳܳ;->֫(Lbin/mt/json/JSONObject;)V

    return-void
.end method

.method public bridge synthetic endObjectValue(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 310
    check-cast p1, Lbin/mt/json/JSONObject;

    invoke-virtual {p0, p1, p2}, Ll/۫ܳܳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)V

    return-void
.end method

.method public endString(Ljava/lang/String;)V
    .locals 1

    .line 336
    new-instance v0, Ll/۟ܳܳ;

    invoke-direct {v0, p1}, Ll/۟ܳܳ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/۫ܳܳ;->֫:Lbin/mt/json/JSONValue;

    return-void
.end method

.method public startArray()Lbin/mt/json/JSONArray;
    .locals 1

    .line 316
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0}, Lbin/mt/json/JSONArray;-><init>()V

    return-object v0
.end method

.method public bridge synthetic startArray()Ljava/lang/Object;
    .locals 1

    .line 310
    invoke-virtual {p0}, Ll/۫ܳܳ;->startArray()Lbin/mt/json/JSONArray;

    move-result-object v0

    return-object v0
.end method

.method public startObject()Lbin/mt/json/JSONObject;
    .locals 1

    .line 321
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    return-object v0
.end method

.method public bridge synthetic startObject()Ljava/lang/Object;
    .locals 1

    .line 310
    invoke-virtual {p0}, Ll/۫ܳܳ;->startObject()Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public ֫()Lbin/mt/json/JSONValue;
    .locals 1

    .line 365
    iget-object v0, p0, Ll/۫ܳܳ;->֫:Lbin/mt/json/JSONValue;

    return-object v0
.end method

.method public ֫(Lbin/mt/json/JSONArray;)V
    .locals 0

    .line 346
    iput-object p1, p0, Ll/۫ܳܳ;->֫:Lbin/mt/json/JSONValue;

    return-void
.end method

.method public ֫(Lbin/mt/json/JSONObject;)V
    .locals 0

    .line 351
    iput-object p1, p0, Ll/۫ܳܳ;->֫:Lbin/mt/json/JSONValue;

    return-void
.end method

.method public ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)V
    .locals 1

    .line 361
    iget-object v0, p0, Ll/۫ܳܳ;->֫:Lbin/mt/json/JSONValue;

    invoke-virtual {p1, p2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-void
.end method

.method public ۧ(Lbin/mt/json/JSONArray;)V
    .locals 1

    .line 356
    iget-object v0, p0, Ll/۫ܳܳ;->֫:Lbin/mt/json/JSONValue;

    invoke-virtual {p1, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    return-void
.end method
