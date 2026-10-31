.class public final Ll/᩸ܺۢ;
.super Ljava/lang/Object;
.source "J766"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/util/List;

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 5

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "itemKind"

    const-string v1, ""

    .line 21
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܶܺۢ;->ۧ(Ljava/lang/String;)V

    iput-object v0, p0, Ll/᩸ܺۢ;->֫:Ljava/lang/String;

    const-string v1, "offset"

    const/4 v2, 0x0

    .line 22
    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Ll/᩸ܺۢ;->ᩳ:I

    const-string v1, "limit"

    .line 23
    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Ll/᩸ܺۢ;->ܽ:I

    const-string v1, "totalCount"

    .line 24
    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Ll/᩸ܺۢ;->ܿ:I

    const-string v1, "items"

    .line 25
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 36
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    .line 39
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    :goto_0
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    .line 41
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "neededLibraries"

    .line 42
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 43
    invoke-static {v3}, Ll/᩹ܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/᩹ܺۢ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_1
    const-string v4, "sections"

    .line 44
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "segments"

    .line 45
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    const-string v4, "imports"

    .line 47
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 48
    invoke-static {v3}, Ll/ۚܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۚܺۢ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    const-string v4, "symbols"

    .line 49
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v4, "entries"

    .line 50
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "initArray"

    .line 52
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    const-string v4, "finiArray"

    .line 53
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_1

    .line 56
    :cond_5
    invoke-static {v3}, Ll/᩶ܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/᩶ܺۢ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 54
    :cond_6
    :goto_1
    invoke-static {v3}, Ll/֨ܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/֨ܺۢ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 51
    :cond_7
    :goto_2
    invoke-static {v3}, Ll/ۨܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۨܺۢ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 46
    :cond_8
    :goto_3
    invoke-static {v3}, Ll/ۗܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۗܺۢ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 59
    :cond_9
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_6

    .line 37
    :cond_a
    :goto_5
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 25
    :goto_6
    iput-object p1, p0, Ll/᩸ܺۢ;->ۧ:Ljava/util/List;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/᩸ܺۢ;
    .locals 1

    .line 32
    new-instance v0, Ll/᩸ܺۢ;

    invoke-direct {v0, p0}, Ll/᩸ܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
