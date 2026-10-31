.class public final Ll/ۖܺۢ;
.super Ljava/lang/Object;
.source "C755"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:J

.field public final ۧ:Z

.field public final ܳ:J

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:J

.field public final ᩳ:Ljava/lang/String;

.field public final ᩻:J


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 5

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 103
    new-instance p1, Lbin/mt/json/JSONObject;

    invoke-direct {p1}, Lbin/mt/json/JSONObject;-><init>()V

    :cond_0
    const-string v0, "found"

    const/4 v1, 0x0

    .line 105
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۖܺۢ;->ۧ:Z

    const-string v0, "name"

    const-string v1, ""

    .line 106
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۖܺۢ;->ᩳ:Ljava/lang/String;

    const-string v0, "demangledName"

    .line 107
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۖܺۢ;->֫:Ljava/lang/String;

    const-string v0, "instructionMode"

    .line 108
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۖܺۢ;->ܽ:Ljava/lang/String;

    const-string v0, "startVirtualAddress"

    const-wide/16 v1, 0x0

    .line 109
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ۖܺۢ;->ۜ:J

    const-string v0, "startPhysicalAddress"

    .line 110
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ۖܺۢ;->᩻:J

    const-string v0, "offset"

    .line 111
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ۖܺۢ;->ܿ:J

    const-string v0, "size"

    .line 112
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۖܺۢ;->ܳ:J

    return-void
.end method

.method public static ֫()Ll/ۖܺۢ;
    .locals 2

    .line 119
    new-instance v0, Ll/ۖܺۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۖܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۖܺۢ;
    .locals 1

    .line 163
    new-instance v0, Ll/ۖܺۢ;

    invoke-direct {v0, p0}, Ll/ۖܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJ)Ll/ۖܺۢ;
    .locals 3

    .line 136
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v1, "found"

    const/4 v2, 0x1

    .line 137
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "name"

    .line 138
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "demangledName"

    .line 139
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "instructionMode"

    .line 140
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "startVirtualAddress"

    .line 141
    invoke-virtual {p0, p1, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "startPhysicalAddress"

    .line 142
    invoke-virtual {p0, p1, p5, p6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "offset"

    .line 143
    invoke-virtual {p0, p1, p7, p8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "size"

    .line 144
    invoke-virtual {p0, p1, p9, p10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 145
    new-instance p1, Ll/ۖܺۢ;

    invoke-direct {p1, p0}, Ll/ۖܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object p1
.end method


# virtual methods
.method public final ֫(J)Ll/ۖܺۢ;
    .locals 11

    .line 152
    iget-boolean v0, p0, Ll/ۖܺۢ;->ۧ:Z

    if-nez v0, :cond_0

    .line 153
    invoke-static {}, Ll/ۖܺۢ;->֫()Ll/ۖܺۢ;

    move-result-object p1

    return-object p1

    .line 155
    :cond_0
    iget-wide v5, p0, Ll/ۖܺۢ;->᩻:J

    iget-wide v9, p0, Ll/ۖܺۢ;->ܳ:J

    iget-object v0, p0, Ll/ۖܺۢ;->ᩳ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۖܺۢ;->֫:Ljava/lang/String;

    iget-object v2, p0, Ll/ۖܺۢ;->ܽ:Ljava/lang/String;

    iget-wide v3, p0, Ll/ۖܺۢ;->ۜ:J

    move-wide v7, p1

    invoke-static/range {v0 .. v10}, Ll/ۖܺۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJ)Ll/ۖܺۢ;

    move-result-object p1

    return-object p1
.end method
