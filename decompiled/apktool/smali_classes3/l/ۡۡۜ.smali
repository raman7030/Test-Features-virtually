.class public final synthetic Ll/ۡۡۜ;
.super Ljava/lang/Object;
.source "46X2"

# interfaces
.implements Ll/ܽۖۜ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/String;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۡۜ;->᩸:Ljava/lang/String;

    iput-object p2, p0, Ll/ۡۡۜ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 4

    const-string v0, "path"

    const-string v1, "policyRevision"

    .line 0
    iget-object v2, p0, Ll/ۡۡۜ;->᩸:Ljava/lang/String;

    iget-object v3, p0, Ll/ۡۡۜ;->᩹:Ljava/lang/String;

    invoke-static {v0, v2, v1, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "operation"

    const-string v2, "check_parent_links"

    .line 485
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "backendReason"

    .line 486
    invoke-virtual {v0, v1, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v0, "changed"

    const/4 v1, 0x0

    .line 487
    invoke-virtual {p3, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v0, "stateKnown"

    const/4 v1, 0x1

    invoke-virtual {p3, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v0, "warnings"

    .line 488
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v0, "fatal"

    const/4 v1, 0x0

    .line 482
    invoke-static {p1, p2, v0, v1, p3}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    return-object p1
.end method
