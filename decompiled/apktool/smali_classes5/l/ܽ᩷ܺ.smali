.class public final Ll/ܽ᩷ܺ;
.super Ll/ܿ᩷ܺ;
.source "EBAY"


# instance fields
.field public final ܳ:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Ll/֫ۜܺ;)V
    .locals 2

    const-string v0, "type_ids"

    const/4 v1, 0x4

    .line 40
    invoke-direct {p0, v0, p1, v1}, Ll/ۛۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;I)V

    .line 47
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Ll/ܽ᩷ܺ;->ܳ:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟ܺܺ;)I
    .locals 3

    if-eqz p1, :cond_1

    .line 166
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 168
    iget-object v0, p0, Ll/ܽ᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ᩷ܺ;

    if-eqz v0, :cond_0

    .line 174
    invoke-virtual {v0}, Ll/ܺۜܺ;->ܿ()I

    move-result p1

    return p1

    .line 171
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "not found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 163
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "type == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/۫ܺܺ;)I
    .locals 1

    if-eqz p1, :cond_0

    .line 189
    invoke-virtual {p1}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܽ᩷ܺ;->֫(Ll/۟ܺܺ;)I

    move-result p1

    return p1

    .line 186
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "type == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;
    .locals 3

    if-eqz p1, :cond_1

    .line 67
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 69
    move-object v0, p1

    check-cast v0, Ll/۫ܺܺ;

    invoke-virtual {v0}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object v0

    .line 70
    iget-object v1, p0, Ll/ܽ᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۜܺ;

    if-eqz v0, :cond_0

    return-object v0

    .line 73
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "not found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cst == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۢ()V
    .locals 3

    .line 55
    iget-object v0, p0, Ll/ܽ᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    .line 199
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 200
    check-cast v2, Ll/ۧ᩷ܺ;

    invoke-virtual {v2, v1}, Ll/ܺۜܺ;->֫(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final declared-synchronized ۧ(Ll/۫ܺܺ;)Ll/ۧ᩷ܺ;
    .locals 3

    move-object v0, p0

    monitor-enter v0

    if-eqz p1, :cond_1

    .line 141
    :try_start_0
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۜ()V

    .line 143
    invoke-virtual {p1}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object v1

    .line 144
    iget-object v2, p0, Ll/ܽ᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v2, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ᩷ܺ;

    if-nez v2, :cond_0

    .line 147
    new-instance v2, Ll/ۧ᩷ܺ;

    .line 35
    invoke-direct {v2, p1}, Ll/ۡۜܺ;-><init>(Ll/۫ܺܺ;)V

    .line 148
    iget-object p1, p0, Ll/ܽ᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {p1, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    :cond_0
    monitor-exit v0

    return-object v2

    .line 138
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v1, "type == null"

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 151
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Ll/۟ܺܺ;)V
    .locals 3

    move-object v0, p0

    monitor-enter v0

    if-eqz p1, :cond_1

    .line 118
    :try_start_0
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۜ()V

    .line 120
    iget-object v1, p0, Ll/ܽ᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v1, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ᩷ܺ;

    if-nez v1, :cond_0

    .line 123
    new-instance v1, Ll/ۧ᩷ܺ;

    new-instance v2, Ll/۫ܺܺ;

    invoke-direct {v2, p1}, Ll/۫ܺܺ;-><init>(Ll/۟ܺܺ;)V

    .line 35
    invoke-direct {v1, v2}, Ll/ۡۜܺ;-><init>(Ll/۫ܺܺ;)V

    .line 124
    iget-object v2, p0, Ll/ܽ᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    :cond_0
    monitor-exit v0

    return-void

    .line 115
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v1, "type == null"

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 127
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ܽ(Ll/ᩳᩴܺ;)V
    .locals 5

    .line 85
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 87
    iget-object v0, p0, Ll/ܽ᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p0}, Ll/ۛۜܺ;->ܽ()I

    move-result v3

    :goto_0
    const/high16 v4, 0x10000

    if-gt v1, v4, :cond_2

    .line 98
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "type_ids_size:   "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {p1, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 100
    invoke-static {v3}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    const-string v4, "type_ids_off:    "

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 103
    :cond_1
    invoke-virtual {p1, v1}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 104
    invoke-virtual {p1, v3}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void

    .line 91
    :cond_2
    new-instance p1, Ll/ۚۧܺ;

    .line 55
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    .line 95
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const-string v0, "Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large."

    .line 92
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 60
    invoke-direct {p1, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 92
    throw p1
.end method

.method public final ᩳ()Ljava/util/Collection;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ܽ᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
