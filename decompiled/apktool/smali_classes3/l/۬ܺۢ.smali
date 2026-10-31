.class public final Ll/۬ܺۢ;
.super Ljava/lang/Object;
.source "J76B"


# instance fields
.field public final ֫:J

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 6

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "text"

    const-string v1, ""

    .line 17
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۬ܺۢ;->ᩳ:Ljava/lang/String;

    const-string v0, "size"

    const-wide/16 v2, 0x0

    .line 18
    invoke-static {p1, v0, v2, v3}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Ll/۬ܺۢ;->ܽ:J

    const-string v0, "paddr"

    const-wide/16 v2, -0x1

    .line 19
    invoke-static {p1, v0, v2, v3}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Ll/۬ܺۢ;->֫:J

    const-string v0, "vaddr"

    .line 20
    invoke-static {p1, v0, v2, v3}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Ll/۬ܺۢ;->ܿ:J

    const-string v0, "sectionName"

    .line 21
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۬ܺۢ;->ۧ:Ljava/lang/String;

    const-string v0, "type"

    .line 22
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/۬ܺۢ;
    .locals 1

    .line 29
    new-instance v0, Ll/۬ܺۢ;

    invoke-direct {v0, p0}, Ll/۬ܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
