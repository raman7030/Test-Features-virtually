.class public final Ll/ۘܺۢ;
.super Ljava/lang/Object;
.source "C755"


# instance fields
.field public final ֫:Ll/ۖܺۢ;

.field public final ۜ:J

.field public final ۡ:J

.field public final ۢ:Z

.field public final ۧ:Z

.field public final ܳ:Z

.field public final ܺ:J

.field public final ܽ:J

.field public final ܿ:Z

.field public final ᩳ:Z

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:J


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 6

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "found"

    const/4 v1, 0x0

    .line 24
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۘܺۢ;->ۧ:Z

    const-string v0, "inputVirtual"

    .line 25
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۘܺۢ;->ᩳ:Z

    const-string v0, "inputAddress"

    const-wide/16 v2, 0x0

    .line 26
    invoke-static {p1, v0, v2, v3}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Ll/ۘܺۢ;->ܽ:J

    const-string v0, "sectionName"

    const-string v4, ""

    .line 27
    invoke-virtual {p1, v0, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘܺۢ;->᩷:Ljava/lang/String;

    const-string v0, "virtualAddress"

    .line 28
    invoke-static {p1, v0, v2, v3}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Ll/ۘܺۢ;->ܺ:J

    const-string v0, "physicalAddress"

    .line 29
    invoke-static {p1, v0, v2, v3}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Ll/ۘܺۢ;->ۜ:J

    const-string v0, "offset"

    .line 30
    invoke-static {p1, v0, v2, v3}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Ll/ۘܺۢ;->᩻:J

    const-string v0, "size"

    .line 31
    invoke-static {p1, v0, v2, v3}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Ll/ۘܺۢ;->ۡ:J

    const-string v0, "isLoaded"

    .line 32
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۘܺۢ;->ܳ:Z

    const-string v0, "isExecutable"

    .line 33
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۘܺۢ;->ܿ:Z

    const-string v0, "segment"

    .line 34
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۘܺۢ;->ۢ:Z

    const-string v0, "enclosingSymbol"

    .line 35
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Ll/ۖܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۖܺۢ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘܺۢ;->֫:Ll/ۖܺۢ;

    return-void
.end method

.method public constructor <init>(ZZJLjava/lang/String;JJJJZZZLl/ۖܺۢ;)V
    .locals 3

    move-object v0, p0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    .line 42
    iput-boolean v1, v0, Ll/ۘܺۢ;->ۧ:Z

    move v1, p2

    .line 43
    iput-boolean v1, v0, Ll/ۘܺۢ;->ᩳ:Z

    move-wide v1, p3

    .line 44
    iput-wide v1, v0, Ll/ۘܺۢ;->ܽ:J

    move-object v1, p5

    .line 45
    iput-object v1, v0, Ll/ۘܺۢ;->᩷:Ljava/lang/String;

    move-wide v1, p6

    .line 46
    iput-wide v1, v0, Ll/ۘܺۢ;->ܺ:J

    move-wide v1, p8

    .line 47
    iput-wide v1, v0, Ll/ۘܺۢ;->ۜ:J

    move-wide v1, p10

    .line 48
    iput-wide v1, v0, Ll/ۘܺۢ;->᩻:J

    move-wide v1, p12

    .line 49
    iput-wide v1, v0, Ll/ۘܺۢ;->ۡ:J

    move/from16 v1, p14

    .line 50
    iput-boolean v1, v0, Ll/ۘܺۢ;->ܳ:Z

    move/from16 v1, p15

    .line 51
    iput-boolean v1, v0, Ll/ۘܺۢ;->ܿ:Z

    move/from16 v1, p16

    .line 52
    iput-boolean v1, v0, Ll/ۘܺۢ;->ۢ:Z

    move-object/from16 v1, p17

    .line 53
    iput-object v1, v0, Ll/ۘܺۢ;->֫:Ll/ۖܺۢ;

    return-void
.end method

.method public static ֫(J)Ll/ۘܺۢ;
    .locals 17

    move-wide/from16 v2, p0

    const/4 v15, 0x0

    .line 65
    invoke-static {}, Ll/ۖܺۢ;->֫()Ll/ۖܺۢ;

    move-result-object v16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v4, ""

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 63
    invoke-static/range {v0 .. v16}, Ll/ۘܺۢ;->֫(ZZJLjava/lang/String;JJJJZZZLl/ۖܺۢ;)Ll/ۘܺۢ;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۘܺۢ;
    .locals 1

    .line 85
    new-instance v0, Ll/ۘܺۢ;

    invoke-direct {v0, p0}, Ll/ۘܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method

.method public static ֫(ZZJLjava/lang/String;JJJJZZZLl/ۖܺۢ;)Ll/ۘܺۢ;
    .locals 19

    .line 76
    new-instance v18, Ll/ۘܺۢ;

    if-eqz p16, :cond_0

    move-object/from16 v17, p16

    goto :goto_0

    .line 78
    :cond_0
    invoke-static {}, Ll/ۖܺۢ;->֫()Ll/ۖܺۢ;

    move-result-object v0

    move-object/from16 v17, v0

    :goto_0
    move-object/from16 v0, v18

    move/from16 v1, p0

    move/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move-wide/from16 v12, p11

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p13

    invoke-direct/range {v0 .. v17}, Ll/ۘܺۢ;-><init>(ZZJLjava/lang/String;JJJJZZZLl/ۖܺۢ;)V

    return-object v18
.end method
