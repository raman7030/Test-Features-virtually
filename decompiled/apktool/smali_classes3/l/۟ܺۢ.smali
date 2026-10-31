.class public final Ll/۟ܺۢ;
.super Ljava/lang/Object;
.source "Q75G"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:I

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 5

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "startVirtualAddress"

    const-wide/16 v1, -0x1

    .line 85
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/۟ܺۢ;->ܿ:J

    const-string v0, "startPhysicalAddress"

    .line 86
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/۟ܺۢ;->ᩳ:J

    const-string v0, "size"

    const-wide/16 v1, 0x0

    .line 87
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/۟ܺۢ;->ܽ:J

    const-string v0, "instructionCount"

    const/4 v1, 0x0

    .line 88
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/۟ܺۢ;->ۧ:I

    const-string v0, "terminator"

    const-string v1, ""

    .line 89
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۟ܺۢ;->ܳ:Ljava/lang/String;

    const-string v0, "assemblyText"

    .line 90
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܺۢ;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/۟ܺۢ;
    .locals 1

    .line 94
    new-instance v0, Ll/۟ܺۢ;

    invoke-direct {v0, p0}, Ll/۟ܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
