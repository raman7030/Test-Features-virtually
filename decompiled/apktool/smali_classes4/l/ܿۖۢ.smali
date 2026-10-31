.class public final Ll/ܿۖۢ;
.super Ljava/lang/Object;
.source "Q75G"


# instance fields
.field public final ֫:Ll/ܰܺۢ;

.field public final ۜ:Ll/ۘܺۢ;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/util/List;

.field public final ܽ:I

.field public final ܿ:Ljava/util/List;

.field public final ᩳ:Ljava/util/List;

.field public final ᩷:Ljava/util/List;

.field public final ᩻:Ll/ܽۖۢ;


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 5

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "arch"

    const-string v1, ""

    .line 22
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۖۢ;->ۧ:Ljava/lang/String;

    const-string v0, "bits"

    const/4 v1, 0x0

    .line 23
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܿۖۢ;->ܽ:I

    const-string v0, "mapping"

    .line 24
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ll/ۘܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۘܺۢ;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۖۢ;->ۜ:Ll/ۘܺۢ;

    const-string v0, "function"

    .line 25
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۖۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ܽۖۢ;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۖۢ;->᩻:Ll/ܽۖۢ;

    const-string v0, "blocks"

    .line 59
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 60
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 63
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    .line 64
    :goto_0
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 65
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Ll/۟ܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/۟ܺۢ;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 67
    :cond_1
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    .line 61
    :cond_2
    :goto_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 26
    :goto_2
    iput-object v0, p0, Ll/ܿۖۢ;->ᩳ:Ljava/util/List;

    const-string v0, "edges"

    .line 59
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 60
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_4

    .line 63
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    .line 64
    :goto_3
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 65
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Ll/֫ۖۢ;->֫(Lbin/mt/json/JSONObject;)Ll/֫ۖۢ;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 67
    :cond_4
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_5

    .line 61
    :cond_5
    :goto_4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 27
    :goto_5
    iput-object v0, p0, Ll/ܿۖۢ;->ܿ:Ljava/util/List;

    const-string v0, "externalFlows"

    .line 59
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 60
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_7

    .line 63
    :cond_6
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    .line 64
    :goto_6
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_7

    .line 65
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Ll/ۧۖۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۧۖۢ;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    .line 67
    :cond_7
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_8

    .line 61
    :cond_8
    :goto_7
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 28
    :goto_8
    iput-object v0, p0, Ll/ܿۖۢ;->ܳ:Ljava/util/List;

    const-string v0, "unresolvedFlows"

    .line 59
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 60
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_a

    .line 63
    :cond_9
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    :goto_9
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    if-ge v1, v3, :cond_a

    .line 65
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Ll/ᩳۖۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ᩳۖۢ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    .line 67
    :cond_a
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_b

    .line 61
    :cond_b
    :goto_a
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 29
    :goto_b
    iput-object v0, p0, Ll/ܿۖۢ;->᩷:Ljava/util/List;

    const-string v0, "analysisSummary"

    .line 30
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Ll/ܰܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ܰܺۢ;

    move-result-object p1

    iput-object p1, p0, Ll/ܿۖۢ;->֫:Ll/ܰܺۢ;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ܿۖۢ;
    .locals 1

    .line 37
    new-instance v0, Ll/ܿۖۢ;

    invoke-direct {v0, p0}, Ll/ܿۖۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
