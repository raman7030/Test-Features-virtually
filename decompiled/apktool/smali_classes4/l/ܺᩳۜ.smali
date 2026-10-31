.class public final Ll/ܺᩳۜ;
.super Ljava/lang/Object;
.source "K77A"


# instance fields
.field public final ֫:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p1, p0, Ll/ܺᩳۜ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 4

    .line 23
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "confused"

    .line 24
    iget-boolean v2, p0, Ll/ܺᩳۜ;->֫:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-eqz v2, :cond_0

    const-string v1, "hex8_upper_no_0x"

    goto :goto_0

    :cond_0
    const-string v1, "names_or_hex"

    :goto_0
    const-string v3, "appReferenceOutput"

    .line 25
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "appNameReferencesAccepted"

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    .line 26
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "systemNameReferencesAccepted"

    .line 27
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "hexPrefixAccepted"

    .line 28
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
