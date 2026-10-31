.class public final Ll/ܰܺۢ;
.super Ljava/lang/Object;
.source "Q75G"


# instance fields
.field public final ֫:I

.field public final ۜ:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:I

.field public final ᩳ:Z

.field public final ᩻:I


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 3

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 177
    new-instance p1, Lbin/mt/json/JSONObject;

    invoke-direct {p1}, Lbin/mt/json/JSONObject;-><init>()V

    :cond_0
    const-string v0, "controlFlowComplete"

    const/4 v1, 0x0

    .line 179
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ܰܺۢ;->ᩳ:Z

    const-string v0, "completionReason"

    const-string v2, ""

    .line 180
    invoke-virtual {p1, v0, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܰܺۢ;->ܽ:Ljava/lang/String;

    const-string v0, "bytesAnalyzed"

    .line 181
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܰܺۢ;->ۧ:I

    const-string v0, "instructionsAnalyzed"

    .line 182
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܰܺۢ;->᩻:I

    const-string v0, "blockCount"

    .line 183
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܰܺۢ;->֫:I

    const-string v0, "edgeCount"

    .line 184
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܰܺۢ;->ܿ:I

    const-string v0, "externalFlowCount"

    .line 185
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܰܺۢ;->ܳ:I

    const-string v0, "unresolvedFlowCount"

    .line 186
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Ll/ܰܺۢ;->ۜ:I

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ܰܺۢ;
    .locals 1

    .line 190
    new-instance v0, Ll/ܰܺۢ;

    invoke-direct {v0, p0}, Ll/ܰܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
