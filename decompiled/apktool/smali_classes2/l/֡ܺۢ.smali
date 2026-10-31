.class public final Ll/֡ܺۢ;
.super Ljava/lang/Object;
.source "V75L"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:I

.field public final ܽ:I

.field public final ܿ:Ljava/util/List;

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 6

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "arch"

    const-string v1, ""

    .line 20
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֡ܺۢ;->֫:Ljava/lang/String;

    const-string v0, "bits"

    const/4 v1, 0x0

    .line 21
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/֡ܺۢ;->ۧ:I

    const-string v0, "address"

    const-wide/16 v2, 0x0

    .line 22
    invoke-static {p1, v0, v2, v3}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    const-string v0, "instructions"

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

    new-instance v5, Ll/᩵ܺۢ;

    invoke-direct {v5, v4}, Ll/᩵ܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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

    .line 23
    :goto_2
    iput-object v0, p0, Ll/֡ܺۢ;->ܿ:Ljava/util/List;

    const-string v0, "bytesConsumed"

    .line 24
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/֡ܺۢ;->ܽ:I

    const-string v0, "incompleteInstructionAtEnd"

    .line 25
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Ll/֡ܺۢ;->ᩳ:Z

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/֡ܺۢ;
    .locals 1

    .line 32
    new-instance v0, Ll/֡ܺۢ;

    invoke-direct {v0, p0}, Ll/֡ܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
