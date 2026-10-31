.class public final Ll/ᩴۢۜ;
.super Ljava/lang/Object;
.source "D6W4"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:J

.field public final ܳ:J

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V
    .locals 0

    .line 329
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 330
    iput-object p1, p0, Ll/ᩴۢۜ;->ܽ:Ljava/lang/String;

    .line 331
    iput-object p2, p0, Ll/ᩴۢۜ;->֫:Ljava/lang/String;

    .line 332
    iput-object p3, p0, Ll/ᩴۢۜ;->ᩳ:Ljava/lang/String;

    .line 333
    iput-object p4, p0, Ll/ᩴۢۜ;->᩻:Ljava/lang/String;

    .line 334
    iput-wide p5, p0, Ll/ᩴۢۜ;->ۧ:J

    .line 335
    iput-wide p7, p0, Ll/ᩴۢۜ;->ܳ:J

    .line 336
    iput-object p9, p0, Ll/ᩴۢۜ;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴۢۜ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۢۜ;->ᩳ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴۢۜ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۢۜ;->᩻:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 4

    .line 341
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "credentialId"

    iget-object v2, p0, Ll/ᩴۢۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "clientName"

    iget-object v2, p0, Ll/ᩴۢۜ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "digest"

    iget-object v2, p0, Ll/ᩴۢۜ;->ᩳ:Ljava/lang/String;

    .line 342
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "token"

    iget-object v2, p0, Ll/ᩴۢۜ;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "createdAt"

    iget-wide v2, p0, Ll/ᩴۢۜ;->ۧ:J

    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "lastUsedAt"

    iget-wide v2, p0, Ll/ᩴۢۜ;->ܳ:J

    .line 343
    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "lastIp"

    iget-object v2, p0, Ll/ᩴۢۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
