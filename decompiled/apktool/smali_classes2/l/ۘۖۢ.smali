.class public final Ll/ۘۖۢ;
.super Ljava/lang/Object;
.source "N75J"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:J

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 5

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "name"

    const-string v1, ""

    .line 19
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۖۢ;->ۧ:Ljava/lang/String;

    const-string v0, "demangledName"

    .line 20
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۖۢ;->֫:Ljava/lang/String;

    const-string v0, "startVirtualAddress"

    const-wide/16 v1, -0x1

    .line 21
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ۘۖۢ;->ܳ:J

    const-string v0, "startPhysicalAddress"

    .line 22
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ۘۖۢ;->ܿ:J

    const-string v0, "offset"

    .line 23
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۘۖۢ;->ܽ:J

    const-string v0, "size"

    const-wide/16 v1, 0x0

    .line 24
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۘۖۢ;->ᩳ:J

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۘۖۢ;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 31
    :cond_0
    new-instance v0, Ll/ۘۖۢ;

    invoke-direct {v0, p0}, Ll/ۘۖۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
