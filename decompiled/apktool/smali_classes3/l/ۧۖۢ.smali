.class public final Ll/ۧۖۢ;
.super Ljava/lang/Object;
.source "Q75G"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:J

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 5

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "sourceVirtualAddress"

    const-wide/16 v1, -0x1

    .line 127
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ۧۖۢ;->ܽ:J

    const-string v0, "flowKind"

    const-string v3, ""

    .line 128
    invoke-virtual {p1, v0, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۧۖۢ;->֫:Ljava/lang/String;

    const-string v0, "targetVirtualAddress"

    .line 129
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۧۖۢ;->ᩳ:J

    const-string v0, "reason"

    .line 130
    invoke-virtual {p1, v0, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۧۖۢ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۧۖۢ;
    .locals 1

    .line 134
    new-instance v0, Ll/ۧۖۢ;

    invoke-direct {v0, p0}, Ll/ۧۖۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
