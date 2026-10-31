.class public final Ll/ᩴۙۜ;
.super Ljava/lang/Object;
.source "P6YZ"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public ۧ:Ll/ܳۙۜ;

.field public ܽ:Z

.field public final ᩳ:Ll/۫ۤۡ;


# direct methods
.method public constructor <init>(Ll/۫ۤۡ;)V
    .locals 9

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ᩴۙۜ;->֫:Ljava/util/LinkedHashMap;

    .line 16
    sget-object v0, Ll/ܳۙۜ;->ܽ:Ll/ܳۙۜ;

    iput-object v0, p0, Ll/ᩴۙۜ;->ۧ:Ll/ܳۙۜ;

    .line 21
    iput-object p1, p0, Ll/ᩴۙۜ;->ᩳ:Ll/۫ۤۡ;

    const-string v0, "smdh"

    const/4 v1, 0x0

    .line 22
    invoke-interface {p1, v0, v1}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "crossOrigin"

    const-string v3, ""

    const-string v4, "headers"

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v0, :cond_0

    .line 25
    :try_start_0
    new-instance v7, Lbin/mt/json/JSONObject;

    invoke-direct {v7, v0}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 111
    invoke-virtual {v7, v4, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 112
    invoke-virtual {v7, v2, v5}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    .line 111
    invoke-static {v0, v7}, Ll/ܳۙۜ;->֫(Ljava/lang/String;Z)Ll/ܳۙۜ;

    move-result-object v0

    .line 25
    iput-object v0, p0, Ll/ᩴۙۜ;->ۧ:Ll/ܳۙۜ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 28
    :catch_0
    iput-boolean v6, p0, Ll/ᩴۙۜ;->ܽ:Z

    :cond_0
    :goto_0
    const-string v0, "smhc"

    .line 31
    invoke-interface {p1, v0, v1}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_3

    .line 36
    :cond_1
    :try_start_1
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0, p1}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbin/mt/json/JSONObject$Member;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 38
    :try_start_2
    invoke-virtual {v0}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 111
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 112
    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 111
    invoke-static {v7, v1}, Ll/ܳۙۜ;->֫(Ljava/lang/String;Z)Ll/ܳۙۜ;

    move-result-object v1

    .line 40
    iget-boolean v7, p0, Ll/ᩴۙۜ;->ܽ:Z

    iget-object v8, p0, Ll/ᩴۙۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    or-int/2addr v0, v7

    iput-boolean v0, p0, Ll/ᩴۙۜ;->ܽ:Z
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 43
    :catch_1
    :try_start_3
    iput-boolean v6, p0, Ll/ᩴۙۜ;->ܽ:Z
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    .line 48
    :catch_2
    iput-boolean v6, p0, Ll/ᩴۙۜ;->ܽ:Z

    :cond_3
    :goto_3
    return-void
.end method

.method private ۧ()V
    .locals 10

    const/4 v0, 0x0

    .line 90
    iput-boolean v0, p0, Ll/ᩴۙۜ;->ܽ:Z

    .line 91
    iget-object v0, p0, Ll/ᩴۙۜ;->ᩳ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    .line 92
    iget-object v1, p0, Ll/ᩴۙۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    const-string v3, "crossOrigin"

    const-string v4, "headers"

    const-string v5, "smhc"

    if-eqz v2, :cond_0

    .line 93
    invoke-interface {v0, v5}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    goto :goto_1

    .line 95
    :cond_0
    new-instance v2, Lbin/mt/json/JSONObject;

    invoke-direct {v2}, Lbin/mt/json/JSONObject;-><init>()V

    .line 96
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 97
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܳۙۜ;

    .line 117
    new-instance v8, Lbin/mt/json/JSONObject;

    invoke-direct {v8}, Lbin/mt/json/JSONObject;-><init>()V

    invoke-virtual {v6}, Ll/ܳۙۜ;->ۧ()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v4, v9}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    invoke-virtual {v6}, Ll/ܳۙۜ;->֫()Z

    move-result v6

    invoke-virtual {v8, v3, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 97
    invoke-virtual {v2, v7, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    .line 101
    :goto_1
    iget-object v1, p0, Ll/ᩴۙۜ;->ۧ:Ll/ܳۙۜ;

    invoke-virtual {v1}, Ll/ܳۙۜ;->ܽ()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const-string v2, "smdh"

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ᩴۙۜ;->ۧ:Ll/ܳۙۜ;

    invoke-virtual {v1}, Ll/ܳۙۜ;->֫()Z

    move-result v1

    if-nez v1, :cond_2

    .line 102
    invoke-interface {v0, v2}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    goto :goto_2

    .line 104
    :cond_2
    iget-object v1, p0, Ll/ᩴۙۜ;->ۧ:Ll/ܳۙۜ;

    .line 117
    new-instance v5, Lbin/mt/json/JSONObject;

    invoke-direct {v5}, Lbin/mt/json/JSONObject;-><init>()V

    invoke-virtual {v1}, Ll/ܳۙۜ;->ۧ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v1}, Ll/ܳۙۜ;->֫()Z

    move-result v1

    invoke-virtual {v4, v3, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 104
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    .line 106
    :goto_2
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method private ܽ()Z
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 84
    iget-object v1, p0, Ll/ᩴۙۜ;->ᩳ:Ll/۫ۤۡ;

    const-string v2, "smur"

    invoke-interface {v1, v2, v0}, Ll/۫ۤۡ;->֫(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 85
    iget-object v1, p0, Ll/ᩴۙۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, v2}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 77
    invoke-direct {p0}, Ll/ᩴۙۜ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ᩴۙۜ;->ܽ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 78
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/ᩴۙۜ;->ۧ()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ll/ܳۙۜ;Z)V
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ᩴۙۜ;->֫:Ljava/util/LinkedHashMap;

    if-eqz p3, :cond_0

    .line 66
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 68
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    iput-object p2, p0, Ll/ᩴۙۜ;->ۧ:Ll/ܳۙۜ;

    .line 71
    :goto_0
    invoke-direct {p0}, Ll/ᩴۙۜ;->ܽ()Z

    .line 72
    invoke-direct {p0}, Ll/ᩴۙۜ;->ۧ()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ᩴۙۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ܳۙۜ;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ᩴۙۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳۙۜ;

    if-nez p1, :cond_0

    .line 55
    iget-object p1, p0, Ll/ᩴۙۜ;->ۧ:Ll/ܳۙۜ;

    :cond_0
    return-object p1
.end method
