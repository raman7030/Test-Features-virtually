.class public final Ll/ܳۤ᩻;
.super Ljava/lang/Object;
.source "M6X3"


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Z)V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {p1}, Ll/ܰۢۜ;->֫(Ljava/util/List;)V

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 29
    iput-object p1, p0, Ll/ܳۤ᩻;->ۧ:Ljava/util/List;

    .line 30
    iput-boolean p2, p0, Ll/ܳۤ᩻;->֫:Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ܳۤ᩻;
    .locals 13

    const-string v0, "access"

    const-string v1, "targetType"

    const-string v2, "rules"

    const-string v3, "version"

    const-string v4, "path"

    const-string v5, "/"

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez p0, :cond_0

    .line 36
    new-instance p0, Ll/ܳۤ᩻;

    sget-object v0, Ll/ۛۢۜ;->᩶:Ll/ۛۢۜ;

    .line 29
    new-instance v1, Ll/ܰۢۜ;

    sget-object v2, Ll/ۜܺۜ;->᩶:Ll/ۜܺۜ;

    invoke-direct {v1, v5, v2, v0, v6}, Ll/ܰۢۜ;-><init>(Ljava/lang/String;Ll/ۜܺۜ;Ll/ۛۢۜ;Z)V

    new-array v0, v6, [Ljava/lang/Object;

    aput-object v1, v0, v7

    .line 0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v0, v0, v7

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 36
    invoke-direct {p0, v0, v7}, Ll/ܳۤ᩻;-><init>(Ljava/util/List;Z)V

    return-object p0

    .line 39
    :cond_0
    :try_start_0
    invoke-static {p0}, Lbin/mt/json/JSON;->parse(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 40
    filled-new-array {v3, v2}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {p0, v8}, Ll/ܳۤ᩻;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    const-string v8, "2"

    .line 41
    invoke-virtual {p0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 44
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 45
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 46
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbin/mt/json/JSONValue;

    .line 47
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 48
    filled-new-array {v4, v1, v0}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v2, v9}, Ll/ܳۤ᩻;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 49
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-virtual {v9}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v4}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 50
    invoke-virtual {v8, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 53
    invoke-virtual {v2, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    invoke-virtual {v10}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    const v12, -0x395fe193

    if-eq v11, v12, :cond_1

    const v12, 0x2ff57c

    if-ne v11, v12, :cond_2

    const-string v11, "file"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 54
    sget-object v10, Ll/ۜܺۜ;->ۙ:Ll/ۜܺۜ;

    goto :goto_1

    :cond_1
    const-string v11, "directory"

    .line 53
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 55
    sget-object v10, Ll/ۜܺۜ;->᩶:Ll/ۜܺۜ;

    .line 58
    :goto_1
    new-instance v11, Ll/ܰۢۜ;

    .line 59
    invoke-virtual {v2, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ܳۤ᩻;->ۧ(Ljava/lang/String;)Ll/ۛۢۜ;

    move-result-object v2

    invoke-direct {v11, v9, v10, v2, v7}, Ll/ܰۢۜ;-><init>(Ljava/lang/String;Ll/ۜܺۜ;Ll/ۛۢۜ;Z)V

    .line 58
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 56
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid file access rule type"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 51
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Duplicate file access rule path"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 61
    :cond_4
    new-instance p0, Ll/ܳۤ᩻;

    invoke-direct {p0, v3, v7}, Ll/ܳۤ᩻;-><init>(Ljava/util/List;Z)V

    return-object p0

    .line 42
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported file access policy version"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :catch_0
    new-instance p0, Ll/ܳۤ᩻;

    sget-object v0, Ll/ۛۢۜ;->᩶:Ll/ۛۢۜ;

    .line 29
    new-instance v1, Ll/ܰۢۜ;

    sget-object v2, Ll/ۜܺۜ;->᩶:Ll/ۜܺۜ;

    invoke-direct {v1, v5, v2, v0, v6}, Ll/ܰۢۜ;-><init>(Ljava/lang/String;Ll/ۜܺۜ;Ll/ۛۢۜ;Z)V

    new-array v0, v6, [Ljava/lang/Object;

    aput-object v1, v0, v7

    .line 0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v0, v0, v7

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 64
    invoke-direct {p0, v0, v6}, Ll/ܳۤ᩻;-><init>(Ljava/util/List;Z)V

    return-object p0
.end method

.method public static varargs ֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V
    .locals 5

    .line 112
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->size()I

    move-result v0

    array-length v1, p1

    if-ne v0, v1, :cond_2

    new-instance v0, Ljava/util/HashSet;

    .line 113
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 0
    new-instance p0, Ljava/util/HashSet;

    array-length v1, p1

    invoke-direct {p0, v1}, Ljava/util/HashSet;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "duplicate element: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    .line 113
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return-void

    .line 114
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid file access policy fields"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z
    .locals 2

    .line 101
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 102
    invoke-static {p0, v0}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 106
    :cond_1
    invoke-static {p0}, Ll/۫ۡۜ;->֫(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 107
    invoke-static {p0, p1}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ۛۢۜ;
    .locals 2

    .line 120
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "deny"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "read_write"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "read_only"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 124
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid file access level"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 123
    :pswitch_0
    sget-object p0, Ll/ۛۢۜ;->᩶:Ll/ۛۢۜ;

    return-object p0

    .line 122
    :pswitch_1
    sget-object p0, Ll/ۛۢۜ;->ۗ:Ll/ۛۢۜ;

    return-object p0

    .line 121
    :pswitch_2
    sget-object p0, Ll/ۛۢۜ;->ۙ:Ll/ۛۢۜ;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x425ff34b -> :sswitch_2
        -0x92bf40a -> :sswitch_1
        0x2efe0c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 6

    .line 70
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 71
    iget-object v1, p0, Ll/ܳۤ᩻;->ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۢۜ;

    .line 72
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "path"

    iget-object v5, v2, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v2, Ll/ܰۢۜ;->ᩳ:Ll/ۜܺۜ;

    .line 73
    invoke-virtual {v4}, Ll/ۜܺۜ;->֫()Ljava/lang/String;

    move-result-object v4

    const-string v5, "targetType"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v2, v2, Ll/ܰۢۜ;->֫:Ll/ۛۢۜ;

    invoke-virtual {v2}, Ll/ۛۢۜ;->ܿ()Ljava/lang/String;

    move-result-object v2

    const-string v4, "access"

    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 72
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    .line 75
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "version"

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "rules"

    .line 76
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/List;)Ll/۟ۢۜ;
    .locals 8

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 82
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 83
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 84
    iget-object v1, p0, Ll/ܳۤ᩻;->ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۢۜ;

    .line 85
    new-instance v3, Ll/ܰۢۜ;

    iget-object v4, v2, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    iget-object v5, v2, Ll/ܰۢۜ;->ᩳ:Ll/ۜܺۜ;

    iget-object v6, v2, Ll/ܰۢۜ;->֫:Ll/ۛۢۜ;

    .line 86
    invoke-virtual {v2}, Ll/ܰۢۜ;->֫()Z

    move-result v7

    if-nez v7, :cond_1

    iget-object v2, v2, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-static {v2, p1, v0}, Ll/ܳۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v2, 0x1

    :goto_2
    invoke-direct {v3, v4, v5, v6, v2}, Ll/ܰۢۜ;-><init>(Ljava/lang/String;Ll/ۜܺۜ;Ll/ۛۢۜ;Z)V

    .line 85
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 88
    :cond_2
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 89
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 90
    invoke-virtual {v1, v3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_3

    .line 92
    :cond_3
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "home"

    invoke-virtual {v2, v3, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "config"

    invoke-virtual {p0}, Ll/ܳۤ᩻;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "managed"

    .line 93
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v1

    .line 94
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v2

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 95
    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    .line 94
    invoke-static {v1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v1

    const-string v2, "acl-v2-"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 96
    new-instance v2, Ll/۟ۢۜ;

    invoke-direct {v2, p1, v1, p2, v0}, Ll/۟ۢۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v2
.end method
