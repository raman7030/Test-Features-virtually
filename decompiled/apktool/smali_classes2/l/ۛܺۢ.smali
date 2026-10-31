.class public final Ll/ۛܺۢ;
.super Ljava/lang/Object;
.source "V75S"


# instance fields
.field public final ֡:Z

.field public final ֨:Ljava/lang/String;

.field public final ֫:Ljava/lang/String;

.field public final ۖ:Ljava/lang/String;

.field public final ۘ:Ljava/lang/String;

.field public final ۚ:Ljava/lang/String;

.field public final ۜ:J

.field public final ۡ:Z

.field public final ۢ:J

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ll/ۤܺۢ;

.field public final ܺ:J

.field public final ܽ:J

.field public final ܿ:Z

.field public final ᩳ:I

.field public final ᩴ:Z

.field public final ᩵:Ljava/lang/String;

.field public final ᩷:J

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 5

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "path"

    const-string v1, ""

    .line 33
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "type"

    .line 34
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛܺۢ;->֨:Ljava/lang/String;

    const-string v0, "className"

    .line 35
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "realClassName"

    .line 36
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "arch"

    .line 37
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛܺۢ;->ۧ:Ljava/lang/String;

    const-string v0, "cpu"

    .line 38
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛܺۢ;->᩻:Ljava/lang/String;

    const-string v0, "machine"

    .line 39
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛܺۢ;->ۘ:Ljava/lang/String;

    const-string v0, "abi"

    .line 40
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛܺۢ;->֫:Ljava/lang/String;

    const-string v0, "os"

    .line 41
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛܺۢ;->᩵:Ljava/lang/String;

    const-string v0, "subsystem"

    .line 42
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛܺۢ;->ۚ:Ljava/lang/String;

    const-string v0, "interpreter"

    .line 43
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛܺۢ;->ۖ:Ljava/lang/String;

    const-string v0, "bits"

    const/4 v1, 0x0

    .line 44
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ۛܺۢ;->ᩳ:I

    const-string v0, "hasVirtualAddress"

    .line 45
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛܺۢ;->ۡ:Z

    const-string v0, "positionIndependent"

    .line 46
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛܺۢ;->֡:Z

    const-string v0, "nx"

    .line 47
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛܺۢ;->ᩴ:Z

    const-string v0, "canary"

    .line 48
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛܺۢ;->ܿ:Z

    const-string v0, "baseAddress"

    const-wide/16 v1, 0x0

    .line 49
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ۛܺۢ;->ܽ:J

    const-string v0, "entryVirtualAddress"

    .line 50
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ۛܺۢ;->᩷:J

    const-string v0, "entryPhysicalAddress"

    .line 51
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ۛܺۢ;->ۜ:J

    const-string v0, "initVirtualAddress"

    .line 52
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ۛܺۢ;->ܺ:J

    const-string v0, "finiVirtualAddress"

    .line 53
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۛܺۢ;->ۢ:J

    const-string v0, "counts"

    .line 54
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Ll/ۤܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۤܺۢ;

    move-result-object p1

    iput-object p1, p0, Ll/ۛܺۢ;->ܳ:Ll/ۤܺۢ;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۛܺۢ;
    .locals 1

    .line 61
    new-instance v0, Ll/ۛܺۢ;

    invoke-direct {v0, p0}, Ll/ۛܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
