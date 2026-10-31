.class public final Ll/ۚܺۢ;
.super Ljava/lang/Object;
.source "K75F"

# interfaces
.implements Ll/۠ܺۢ;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:J

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Z

.field public final ᩳ:Ljava/lang/String;

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 3

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "name"

    const-string v1, ""

    .line 21
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܺۢ;->᩻:Ljava/lang/String;

    const-string v0, "demangledName"

    .line 22
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܺۢ;->ܽ:Ljava/lang/String;

    const-string v0, "library"

    .line 23
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܺۢ;->ܳ:Ljava/lang/String;

    const-string v0, "bind"

    .line 24
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܺۢ;->֫:Ljava/lang/String;

    const-string v0, "type"

    .line 25
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܺۢ;->᩷:Ljava/lang/String;

    const-string v0, "className"

    .line 26
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܺۢ;->ۧ:Ljava/lang/String;

    const-string v0, "descriptor"

    .line 27
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܺۢ;->ᩳ:Ljava/lang/String;

    const-string v0, "ordinal"

    const-wide/16 v1, 0x0

    .line 28
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۚܺۢ;->ۜ:J

    const-string v0, "inSectionHeader"

    const/4 v1, 0x0

    .line 29
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۚܺۢ;->ܿ:Z

    const-string v0, "imported"

    .line 30
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۚܺۢ;
    .locals 1

    .line 37
    new-instance v0, Ll/ۚܺۢ;

    invoke-direct {v0, p0}, Ll/ۚܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
