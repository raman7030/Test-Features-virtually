.class public final Ll/۟ۢۜ;
.super Ljava/lang/Object;
.source "06Y2"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/util/List;

.field public final ܿ:Ljava/util/List;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "homePath"

    .line 26
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/۟ۢۜ;->ۧ:Ljava/lang/String;

    const-string v0, "policyRevision"

    .line 27
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 28
    invoke-static {p3}, Ll/ܰۢۜ;->֫(Ljava/util/List;)V

    .line 29
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 30
    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    iput-object p3, p0, Ll/۟ۢۜ;->ܿ:Ljava/util/List;

    .line 31
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 32
    invoke-static {p3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 33
    invoke-static {p3}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p4

    iput-object p4, p0, Ll/۟ۢۜ;->ܽ:Ljava/util/List;

    .line 34
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 35
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܰۢۜ;

    .line 37
    iget-boolean p3, p2, Ll/ܰۢۜ;->ۧ:Z

    if-eqz p3, :cond_0

    iget-object p3, p2, Ll/ܰۢۜ;->ᩳ:Ll/ۜܺۜ;

    sget-object v0, Ll/ۜܺۜ;->᩶:Ll/ۜܺۜ;

    if-ne p3, v0, :cond_0

    .line 38
    iget-object p2, p2, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 41
    :cond_1
    invoke-static {p4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 42
    invoke-static {p4}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/۟ۢۜ;->֫:Ljava/util/List;

    return-void
.end method

.method private ֫(Ljava/lang/String;Ll/ۨۢۜ;)Ll/᩺ۢۜ;
    .locals 5

    .line 112
    iget-object v0, p0, Ll/۟ۢۜ;->ܿ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۢۜ;

    .line 113
    invoke-virtual {v1}, Ll/ܰۢۜ;->֫()Z

    move-result v2

    iget-object v3, v1, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    iget-object v4, v1, Ll/ܰۢۜ;->֫:Ll/ۛۢۜ;

    if-eqz v2, :cond_1

    .line 114
    new-instance v0, Ll/᩺ۢۜ;

    invoke-direct {v0, p1, v4, p2}, Ll/᩺ۢۜ;-><init>(Ljava/lang/String;Ll/ۛۢۜ;Ll/ۨۢۜ;)V

    return-object v0

    .line 116
    :cond_1
    iget-boolean v2, v1, Ll/ܰۢۜ;->ۧ:Z

    if-nez v2, :cond_2

    goto :goto_0

    .line 117
    :cond_2
    iget-object v1, v1, Ll/ܰۢۜ;->ᩳ:Ll/ۜܺۜ;

    sget-object v2, Ll/ۜܺۜ;->᩶:Ll/ۜܺۜ;

    if-ne v1, v2, :cond_3

    .line 118
    invoke-static {p1, v3}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    goto :goto_1

    .line 119
    :cond_3
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_0

    .line 121
    new-instance p2, Ll/᩺ۢۜ;

    sget-object v0, Ll/ۨۢۜ;->۬:Ll/ۨۢۜ;

    invoke-direct {p2, p1, v4, v0}, Ll/᩺ۢۜ;-><init>(Ljava/lang/String;Ll/ۛۢۜ;Ll/ۨۢۜ;)V

    return-object p2

    .line 124
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Root rule is missing"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/᩺ۢۜ;
    .locals 3

    .line 49
    iget-object v0, p0, Ll/۟ۢۜ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 50
    invoke-static {p1, v1}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 51
    new-instance v0, Ll/᩺ۢۜ;

    sget-object v1, Ll/ۛۢۜ;->᩶:Ll/ۛۢۜ;

    sget-object v2, Ll/ۨۢۜ;->ۗ:Ll/ۨۢۜ;

    invoke-direct {v0, p1, v1, v2}, Ll/᩺ۢۜ;-><init>(Ljava/lang/String;Ll/ۛۢۜ;Ll/ۨۢۜ;)V

    return-object v0

    .line 55
    :cond_1
    invoke-static {p1}, Ll/۫ۡۜ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    sget-object v0, Ll/ۨۢۜ;->᩹:Ll/ۨۢۜ;

    invoke-direct {p0, p1, v0}, Ll/۟ۢۜ;->֫(Ljava/lang/String;Ll/ۨۢۜ;)Ll/᩺ۢۜ;

    move-result-object p1

    return-object p1

    .line 58
    :cond_2
    iget-object v0, p0, Ll/۟ۢۜ;->ۧ:Ljava/lang/String;

    invoke-static {p1, v0}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 59
    new-instance v0, Ll/᩺ۢۜ;

    sget-object v1, Ll/ۛۢۜ;->ۗ:Ll/ۛۢۜ;

    sget-object v2, Ll/ۨۢۜ;->ۙ:Ll/ۨۢۜ;

    invoke-direct {v0, p1, v1, v2}, Ll/᩺ۢۜ;-><init>(Ljava/lang/String;Ll/ۛۢۜ;Ll/ۨۢۜ;)V

    return-object v0

    .line 62
    :cond_3
    sget-object v0, Ll/ۨۢۜ;->᩶:Ll/ۨۢۜ;

    invoke-direct {p0, p1, v0}, Ll/۟ۢۜ;->֫(Ljava/lang/String;Ll/ۨۢۜ;)Ll/᩺ۢۜ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 4

    .line 89
    iget-object v0, p0, Ll/۟ۢۜ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 90
    invoke-static {v1, p1}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 105
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "path"

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "policyRevision"

    iget-object v1, p0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 106
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "FILE_ACCESS_ROOT_PROTECTED"

    const-string v1, "The operation would modify an MCP file access root."

    const-string v2, "fatal"

    const/4 v3, 0x0

    .line 102
    invoke-static {v0, v1, v2, v3, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_1
    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 4

    .line 69
    invoke-virtual {p0, p1}, Ll/۟ۢۜ;->֫(Ljava/lang/String;)Ll/᩺ۢۜ;

    move-result-object v0

    .line 70
    iget-object v0, v0, Ll/᩺ۢۜ;->֫:Ll/ۛۢۜ;

    invoke-virtual {v0}, Ll/ۛۢۜ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 130
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "path"

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "policyRevision"

    iget-object v1, p0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "FILE_ACCESS_DENIED"

    const-string v1, "Read access is denied by the MCP file policy."

    const-string v2, "fatal"

    const/4 v3, 0x0

    .line 128
    invoke-static {v0, v1, v2, v3, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 71
    throw p1
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 4

    .line 79
    invoke-virtual {p0, p1}, Ll/۟ۢۜ;->֫(Ljava/lang/String;)Ll/᩺ۢۜ;

    move-result-object v0

    .line 80
    iget-object v0, v0, Ll/᩺ۢۜ;->֫:Ll/ۛۢۜ;

    invoke-virtual {v0}, Ll/ۛۢۜ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 130
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "path"

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "policyRevision"

    iget-object v1, p0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "FILE_ACCESS_DENIED"

    const-string v1, "Write access is denied by the MCP file policy."

    const-string v2, "fatal"

    const/4 v3, 0x0

    .line 128
    invoke-static {v0, v1, v2, v3, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 81
    throw p1
.end method
