.class public final Ll/ۡۖۢ;
.super Ljava/lang/Object;
.source "O75H"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ll/ۘۖۢ;

.field public final ܽ:J

.field public final ܿ:I

.field public final ᩳ:Ljava/lang/String;

.field public final ᩻:J


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 5

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "sourceVirtualAddress"

    const-wide/16 v1, -0x1

    .line 23
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ۡۖۢ;->᩻:J

    const-string v0, "sourceFileOffset"

    .line 24
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۡۖۢ;->ܽ:J

    const-string v0, "sourceKind"

    const-string v1, ""

    .line 25
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۖۢ;->ᩳ:Ljava/lang/String;

    const-string v0, "sourceSize"

    const/4 v2, 0x0

    .line 26
    invoke-virtual {p1, v0, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ۡۖۢ;->ܿ:I

    const-string v0, "sourceSymbol"

    .line 27
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ll/ۘۖۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۘۖۢ;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۖۢ;->ܳ:Ll/ۘۖۢ;

    const-string v0, "bytes"

    .line 28
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۖۢ;->֫:Ljava/lang/String;

    const-string v0, "text"

    .line 29
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۖۢ;->ۜ:Ljava/lang/String;

    const-string v0, "referenceKind"

    .line 30
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۡۖۢ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۡۖۢ;
    .locals 1

    .line 37
    new-instance v0, Ll/ۡۖۢ;

    invoke-direct {v0, p0}, Ll/ۡۖۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
