.class public final Ll/ܽۖۢ;
.super Ljava/lang/Object;
.source "Q75G"


# instance fields
.field public final ֫:J

.field public final ۜ:J

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:J

.field public final ᩳ:Ljava/lang/String;

.field public final ᩻:J


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 6

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 55
    new-instance p1, Lbin/mt/json/JSONObject;

    invoke-direct {p1}, Lbin/mt/json/JSONObject;-><init>()V

    :cond_0
    const-string v0, "startVirtualAddress"

    const-wide/16 v1, -0x1

    .line 57
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ܽۖۢ;->᩻:J

    const-string v0, "startPhysicalAddress"

    .line 58
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ܽۖۢ;->ܿ:J

    const-string v0, "name"

    const-string v3, ""

    .line 59
    invoke-virtual {p1, v0, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۖۢ;->ᩳ:Ljava/lang/String;

    const-string v0, "demangledName"

    .line 60
    invoke-virtual {p1, v0, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۖۢ;->ܽ:Ljava/lang/String;

    const-string v0, "symbolSize"

    const-wide/16 v4, 0x0

    .line 61
    invoke-static {p1, v0, v4, v5}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Ll/ܽۖۢ;->ۜ:J

    const-string v0, "startSource"

    .line 62
    invoke-virtual {p1, v0, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۖۢ;->ܳ:Ljava/lang/String;

    const-string v0, "boundarySource"

    .line 63
    invoke-virtual {p1, v0, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۖۢ;->ۧ:Ljava/lang/String;

    const-string v0, "boundaryEndVirtualAddress"

    .line 64
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܽۖۢ;->֫:J

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ܽۖۢ;
    .locals 1

    .line 69
    new-instance v0, Ll/ܽۖۢ;

    invoke-direct {v0, p0}, Ll/ܽۖۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
