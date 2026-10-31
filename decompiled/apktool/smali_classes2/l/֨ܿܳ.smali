.class public final Ll/֨ܿܳ;
.super Ljava/lang/Object;
.source "D6KU"


# static fields
.field public static final ۧ:Ll/ۧۤᩴ;


# instance fields
.field public final ֫:Ll/۫ۤۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 19
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/֨ܿܳ;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method

.method public constructor <init>(Ll/۫ۤۡ;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/֨ܿܳ;->֫:Ll/۫ۤۡ;

    return-void
.end method

.method private ֫()Ljava/util/ArrayList;
    .locals 8

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 75
    sget-object v1, Ll/֨ܿܳ;->ۧ:Ll/ۧۤᩴ;

    iget-object v2, p0, Ll/֨ܿܳ;->֫:Ll/۫ۤۡ;

    invoke-virtual {v1, v2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "hprt"

    const-string v3, ""

    .line 76
    invoke-interface {v2, v1, v3}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 77
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/high16 v3, 0x100000

    if-le v2, v3, :cond_1

    goto :goto_2

    .line 79
    :cond_1
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "version"

    .line 80
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "roots"

    .line 81
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 82
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v4, v5, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/16 v6, 0x40

    if-ge v5, v6, :cond_5

    .line 83
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optJSONArray(I)Lorg/json/JSONArray;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 84
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_4

    .line 85
    invoke-virtual {v5, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_4

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_4

    .line 86
    invoke-virtual {v5, v3}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/String;

    if-eqz v7, :cond_4

    check-cast v5, Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 88
    :try_start_1
    invoke-static {v5}, Ll/ᩴܿܳ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v7, :cond_3

    goto :goto_1

    .line 92
    :cond_3
    :try_start_2
    new-instance v7, Ll/ۚܿܳ;

    invoke-direct {v7, v6, v5}, Ll/ۚܿܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_0
    :cond_4
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_1
    :cond_5
    :goto_2
    return-object v0
.end method

.method public static synthetic ֫(Ll/֨ܿܳ;)V
    .locals 3

    .line 61
    iget-object v0, p0, Ll/֨ܿܳ;->֫:Ll/۫ۤۡ;

    monitor-enter v0

    .line 62
    :try_start_0
    sget-object v1, Ll/֨ܿܳ;->ۧ:Ll/ۧۤᩴ;

    iget-object v2, p0, Ll/֨ܿܳ;->֫:Ll/۫ۤۡ;

    invoke-virtual {v1, v2}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 64
    iget-object p0, p0, Ll/֨ܿܳ;->֫:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    const-string v2, "hprt"

    invoke-interface {p0, v2, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->commit()Z

    .line 65
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ֫(Ll/ᩴܿܳ;)Ljava/lang/String;
    .locals 6

    .line 28
    iget-object v0, p0, Ll/֨ܿܳ;->֫:Ll/۫ۤۡ;

    monitor-enter v0

    .line 30
    :try_start_0
    invoke-direct {p0}, Ll/֨ܿܳ;->֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, -0x1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚܿܳ;

    .line 31
    invoke-static {v3}, Ll/ۚܿܳ;->ۧ(Ll/ۚܿܳ;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p1, Ll/ᩴܿܳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 32
    invoke-static {v3}, Ll/ۚܿܳ;->֫(Ll/ۚܿܳ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/ᩴܿܳ;->֫(Ljava/lang/String;)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_0

    :cond_1
    if-gez v2, :cond_2

    .line 35
    invoke-virtual {p1}, Ll/ᩴܿܳ;->֫()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object p1, p1, Ll/ᩴܿܳ;->֫:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘܿܳ;

    invoke-virtual {p1}, Ll/ۘܿܳ;->ܽ()Ljava/lang/String;

    move-result-object p1

    :goto_1
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 36
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ᩴܿܳ;Ljava/lang/String;Z)V
    .locals 8

    .line 41
    iget-object v0, p1, Ll/ᩴܿܳ;->ܽ:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-virtual {p1, p2}, Ll/ᩴܿܳ;->֫(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_0

    goto/16 :goto_3

    .line 42
    :cond_0
    iget-object v0, p0, Ll/֨ܿܳ;->֫:Ll/۫ۤۡ;

    monitor-enter v0

    .line 43
    :try_start_0
    invoke-direct {p0}, Ll/֨ܿܳ;->֫()Ljava/util/ArrayList;

    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚܿܳ;

    .line 46
    invoke-static {v5}, Ll/ۚܿܳ;->ۧ(Ll/ۚܿܳ;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p1, Ll/ᩴܿܳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-static {v5}, Ll/ۚܿܳ;->֫(Ll/ۚܿܳ;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    if-nez v4, :cond_3

    if-nez p3, :cond_3

    .line 48
    monitor-exit v0

    return-void

    .line 50
    :cond_3
    new-instance v2, Ll/᩵ܿܳ;

    invoke-direct {v2, p1, p2, p3}, Ll/᩵ܿܳ;-><init>(Ll/ᩴܿܳ;Ljava/lang/String;Z)V

    invoke-static {v1, v2}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 53
    new-instance p3, Ll/ۚܿܳ;

    iget-object p1, p1, Ll/ᩴܿܳ;->ܽ:Ljava/lang/String;

    invoke-direct {p3, p1, p2}, Ll/ۚܿܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3, p3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 54
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/16 p2, 0x40

    if-le p1, p2, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v6

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 55
    :cond_4
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۚܿܳ;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    invoke-static {p3}, Ll/ۚܿܳ;->ۧ(Ll/ۚܿܳ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-static {p3}, Ll/ۚܿܳ;->֫(Ll/ۚܿܳ;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object p3

    invoke-virtual {p1, p3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 58
    :cond_5
    :try_start_1
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    const-string p3, "version"

    invoke-virtual {p2, p3, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object p2

    const-string p3, "roots"

    invoke-virtual {p2, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 59
    sget-object p2, Ll/֨ܿܳ;->ۧ:Ll/ۧۤᩴ;

    iget-object p3, p0, Ll/֨ܿܳ;->֫:Ll/۫ۤۡ;

    invoke-virtual {p2, p3, p1}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Ll/֡ܿܳ;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p0}, Ll/֡ܿܳ;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    :try_start_2
    monitor-exit v0

    return-void

    :catch_0
    move-exception p1

    .line 68
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catchall_0
    move-exception p1

    .line 70
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_6
    :goto_3
    return-void
.end method
