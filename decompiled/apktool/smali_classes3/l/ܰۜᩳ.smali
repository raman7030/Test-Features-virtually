.class public final Ll/ܰۜᩳ;
.super Ljava/lang/Object;
.source "N1MQ"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܳ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/lang/Boolean;

.field public ᩳ:Ll/ܶ᩵ܿ;

.field public ᩻:Z


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 350
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    .line 351
    iget-object v1, p0, Ll/ܰۜᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "2"

    .line 352
    iget-object v2, p0, Ll/ܰۜᩳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 353
    iget-object v1, p0, Ll/ܰۜᩳ;->ۧ:Ljava/lang/String;

    const/16 v2, 0x50

    invoke-static {v2, v1}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "3"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "4"

    .line 354
    iget-object v2, p0, Ll/ܰۜᩳ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 355
    iget-object v1, p0, Ll/ܰۜᩳ;->ܿ:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const-string v2, "5"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string v1, "6"

    .line 356
    iget-boolean v2, p0, Ll/ܰۜᩳ;->᩻:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string v1, "7"

    .line 357
    iget-object v2, p0, Ll/ܰۜᩳ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)V
    .locals 2

    const-string v0, "1"

    .line 362
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ܰۜᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    const-string v0, "2"

    .line 363
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܰۜᩳ;->ܽ:Ljava/lang/String;

    const-string v0, "3"

    .line 364
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܰۜᩳ;->ۧ:Ljava/lang/String;

    const-string v0, "4"

    .line 365
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܰۜᩳ;->ܳ:Ljava/lang/String;

    const-string v0, "5"

    .line 366
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ll/ܰۜᩳ;->ܿ:Ljava/lang/Boolean;

    const-string v0, "6"

    .line 367
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ܰۜᩳ;->᩻:Z

    const-string v0, "7"

    .line 368
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۜᩳ;->֫:Ljava/lang/String;

    return-void
.end method
