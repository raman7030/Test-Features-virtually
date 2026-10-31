.class public final Ll/۠ۜܺ;
.super Ll/ܿ᩷ܺ;
.source "QBEG"


# instance fields
.field public final ܳ:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Ll/֫ۜܺ;)V
    .locals 2

    const-string v0, "method_handles"

    const/16 v1, 0x8

    .line 40
    invoke-direct {p0, v0, p1, v1}, Ll/ۛۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;I)V

    .line 26
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Ll/۠ۜܺ;->ܳ:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩸ܺܺ;)I
    .locals 1

    .line 74
    iget-object v0, p0, Ll/۠ۜܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ۜܺ;

    invoke-virtual {p1}, Ll/ܺۜܺ;->ܿ()I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;
    .locals 1

    if-eqz p1, :cond_1

    .line 37
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 39
    iget-object v0, p0, Ll/۠ۜܺ;->ܳ:Ljava/util/TreeMap;

    check-cast p1, Ll/᩸ܺܺ;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۜܺ;

    if-eqz p1, :cond_0

    return-object p1

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 35
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cst == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۢ()V
    .locals 4

    .line 49
    iget-object v0, p0, Ll/۠ۜܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ۜܺ;

    add-int/lit8 v3, v1, 0x1

    .line 50
    invoke-virtual {v2, v1}, Ll/ܺۜܺ;->֫(I)V

    move v1, v3

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final declared-synchronized ۧ(Ll/᩸ܺܺ;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    if-eqz p1, :cond_1

    .line 64
    :try_start_0
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۜ()V

    .line 66
    iget-object v1, p0, Ll/۠ۜܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v1, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۜܺ;

    if-nez v1, :cond_0

    .line 68
    new-instance v1, Ll/֨ۜܺ;

    invoke-direct {v1, p1}, Ll/֨ۜܺ;-><init>(Ll/᩸ܺܺ;)V

    .line 69
    iget-object v2, p0, Ll/۠ۜܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    :cond_0
    monitor-exit v0

    return-void

    .line 61
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v1, "methodHandle == null"

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 71
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ᩳ()Ljava/util/Collection;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/۠ۜܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
