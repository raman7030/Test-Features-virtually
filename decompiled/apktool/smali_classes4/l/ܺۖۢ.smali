.class public final Ll/ܺۖۢ;
.super Ljava/lang/Object;
.source "N75N"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:Z

.field public final ۧ:Ljava/util/List;

.field public final ܳ:I

.field public final ܽ:J

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 4

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 42
    iput v1, p0, Ll/ܺۖۢ;->᩻:I

    .line 43
    iput v1, p0, Ll/ܺۖۢ;->ᩳ:I

    .line 44
    iput v1, p0, Ll/ܺۖۢ;->ܿ:I

    const-wide/16 v2, 0x0

    .line 45
    iput-wide v2, p0, Ll/ܺۖۢ;->ܽ:J

    .line 46
    iput v1, p0, Ll/ܺۖۢ;->ܳ:I

    .line 47
    iput v1, p0, Ll/ܺۖۢ;->᩷:I

    const/4 v1, 0x1

    .line 48
    iput-boolean v1, p0, Ll/ܺۖۢ;->ۜ:Z

    const-string v1, "target_not_mapped"

    .line 33
    invoke-static {v1}, Ll/ۛ᩸ۘ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 49
    iput-object v1, p0, Ll/ܺۖۢ;->֫:Ljava/lang/String;

    .line 50
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۖۢ;->ۧ:Ljava/util/List;

    return-void

    .line 34
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid native xref completion reason"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 4

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rangeCount"

    const/4 v1, 0x0

    .line 25
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܺۖۢ;->᩻:I

    const-string v0, "nextPhaseIndex"

    .line 26
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܺۖۢ;->ᩳ:I

    const-string v0, "nextRangeIndex"

    .line 27
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܺۖۢ;->ܿ:I

    const-string v0, "nextByteOffsetInRange"

    const-wide/16 v2, 0x0

    .line 28
    invoke-static {p1, v0, v2, v3}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Ll/ܺۖۢ;->ܽ:J

    const-string v0, "nextRelocationIndex"

    .line 29
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܺۖۢ;->ܳ:I

    const-string v0, "scannedBytes"

    .line 30
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܺۖۢ;->᩷:I

    const-string v0, "scanComplete"

    .line 31
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ܺۖۢ;->ۜ:Z

    const-string v2, "completionReason"

    const-string v3, ""

    .line 32
    invoke-virtual {p1, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v0, :cond_0

    const-string v0, "scan_space_exhausted"

    goto :goto_0

    :cond_0
    const-string v0, "scan_budget_exhausted"

    :goto_0
    move-object v2, v0

    :cond_1
    invoke-static {v2}, Ll/ۛ᩸ۘ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iput-object v2, p0, Ll/ܺۖۢ;->֫:Ljava/lang/String;

    const-string v0, "items"

    .line 35
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 97
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    .line 100
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    :goto_1
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 102
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/ۡۖۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۡۖۢ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 104
    :cond_3
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_3

    .line 98
    :cond_4
    :goto_2
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 35
    :goto_3
    iput-object p1, p0, Ll/ܺۖۢ;->ۧ:Ljava/util/List;

    return-void

    .line 34
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid native xref completion reason"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫()Ll/ܺۖۢ;
    .locals 1

    .line 2
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 91
    new-instance v0, Ll/ܺۖۢ;

    invoke-direct {v0}, Ll/ܺۖۢ;-><init>()V

    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ܺۖۢ;
    .locals 1

    .line 57
    new-instance v0, Ll/ܺۖۢ;

    invoke-direct {v0, p0}, Ll/ܺۖۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
