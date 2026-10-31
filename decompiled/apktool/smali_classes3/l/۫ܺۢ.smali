.class public final Ll/۫ܺۢ;
.super Ljava/lang/Object;
.source "X74A"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:I

.field public final ܽ:J

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 4

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "offset"

    const/4 v1, 0x0

    .line 21
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/۫ܺۢ;->ᩳ:I

    const-string v0, "limit"

    .line 22
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/۫ܺۢ;->ۧ:I

    const-string v0, "totalCount"

    .line 23
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/۫ܺۢ;->ܿ:I

    const-string v0, "nextScanOffset"

    const-wide/16 v2, -0x1

    .line 24
    invoke-static {p1, v0, v2, v3}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Ll/۫ܺۢ;->ܽ:J

    const-string v0, "items"

    .line 25
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 36
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 39
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    :goto_0
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 41
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/۬ܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/۬ܺۢ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 43
    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_2

    .line 37
    :cond_2
    :goto_1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 25
    :goto_2
    iput-object p1, p0, Ll/۫ܺۢ;->֫:Ljava/util/List;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/۫ܺۢ;
    .locals 1

    .line 32
    new-instance v0, Ll/۫ܺۢ;

    invoke-direct {v0, p0}, Ll/۫ܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
