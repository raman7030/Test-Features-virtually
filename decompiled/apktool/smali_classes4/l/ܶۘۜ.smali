.class public final Ll/ܶۘۜ;
.super Ljava/lang/Object;
.source "S6V6"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public ۧ:J

.field public ܳ:I

.field public ܽ:J

.field public ܿ:Ljava/lang/String;

.field public final ᩳ:Lbin/mt/json/JSONArray;

.field public final ᩻:Lbin/mt/json/JSONArray;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 225
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Ll/ܶۘۜ;->ᩳ:Lbin/mt/json/JSONArray;

    .line 226
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Ll/ܶۘۜ;->᩻:Lbin/mt/json/JSONArray;

    .line 227
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶۘۜ;->֫:Ljava/util/ArrayList;

    const-wide/16 v0, -0x1

    .line 229
    iput-wide v0, p0, Ll/ܶۘۜ;->ܽ:J

    .line 233
    iput p1, p0, Ll/ܶۘۜ;->ܳ:I

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONArray;
    .locals 7

    .line 260
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 261
    iget-object v1, p0, Ll/ܶۘۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ۘۜ;

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "startLine"

    iget-wide v5, v2, Ll/۠ۘۜ;->ۧ:J

    invoke-virtual {v3, v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "startColumn"

    iget-wide v5, v2, Ll/۠ۘۜ;->֫:J

    .line 262
    invoke-virtual {v3, v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v2, v2, Ll/۠ۘۜ;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "text"

    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 261
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ֫(JLjava/lang/String;)V
    .locals 4

    .line 236
    iget-object v0, p0, Ll/ܶۘۜ;->᩻:Lbin/mt/json/JSONArray;

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "reason"

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbin/mt/json/JSONValue;

    .line 237
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 239
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v3, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v1, "line"

    invoke-virtual {p3, v1, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    return-void
.end method
