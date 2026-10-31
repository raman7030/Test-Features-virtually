.class public Ll/֨᩵;
.super Ljava/lang/Object;
.source "Q57Q"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/util/LinkedHashMap;

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    .line 55
    iput p1, p0, Ll/֨᩵;->ܽ:I

    .line 56
    new-instance p1, Ljava/util/LinkedHashMap;

    const/high16 v0, 0x3f400000    # 0.75f

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p1, v2, v0, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object p1, p0, Ll/֨᩵;->ۧ:Ljava/util/LinkedHashMap;

    return-void

    .line 53
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "maxSize <= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ܽ(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 259
    invoke-virtual {p0, p1, p2}, Ll/֨᩵;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    .line 261
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Negative size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 7

    const-string v1, "LruCache[maxSize="

    move-object v0, p0

    .line 3
    monitor-enter v0

    .line 348
    :try_start_0
    iget v2, p0, Ll/֨᩵;->֫:I

    iget v3, p0, Ll/֨᩵;->ᩳ:I

    add-int/2addr v3, v2

    if-eqz v3, :cond_0

    mul-int/lit8 v2, v2, 0x64

    .line 349
    div-int/2addr v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 350
    :goto_0
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget v3, p0, Ll/֨᩵;->ܽ:I

    .line 351
    iget v4, p0, Ll/֨᩵;->֫:I

    iget v5, p0, Ll/֨᩵;->ᩳ:I

    .line 350
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",hits="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",misses="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",hitRate="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "%]"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-eqz p1, :cond_1

    move-object v0, p0

    .line 88
    monitor-enter v0

    .line 89
    :try_start_0
    iget-object v1, p0, Ll/֨᩵;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 91
    iget v1, p0, Ll/֨᩵;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/֨᩵;->֫:I

    .line 92
    monitor-exit v0

    return-object p1

    .line 94
    :cond_0
    iget p1, p0, Ll/֨᩵;->ᩳ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֨᩵;->ᩳ:I

    .line 95
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 84
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "key == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    move-object v0, p0

    .line 143
    monitor-enter v0

    .line 145
    :try_start_0
    iget v1, p0, Ll/֨᩵;->ܿ:I

    invoke-direct {p0, p1, p2}, Ll/֨᩵;->ܽ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    iput v1, p0, Ll/֨᩵;->ܿ:I

    .line 146
    iget-object v1, p0, Ll/֨᩵;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 148
    iget v1, p0, Ll/֨᩵;->ܿ:I

    invoke-direct {p0, p1, p2}, Ll/֨᩵;->ܽ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    sub-int/2addr v1, p1

    iput v1, p0, Ll/֨᩵;->ܿ:I

    .line 150
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    iget p1, p0, Ll/֨᩵;->ܽ:I

    invoke-virtual {p0, p1}, Ll/֨᩵;->֫(I)V

    return-object p2

    :catchall_0
    move-exception p1

    .line 150
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 139
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "key == null || value == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized ֫()Ljava/util/LinkedHashMap;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 344
    :try_start_0
    new-instance v1, Ljava/util/LinkedHashMap;

    iget-object v2, p0, Ll/֨᩵;->ۧ:Ljava/util/LinkedHashMap;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(I)V
    .locals 4

    :goto_0
    move-object v0, p0

    .line 171
    monitor-enter v0

    .line 172
    :try_start_0
    iget v1, p0, Ll/֨᩵;->ܿ:I

    if-ltz v1, :cond_3

    iget-object v1, p0, Ll/֨᩵;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Ll/֨᩵;->ܿ:I

    if-nez v1, :cond_3

    .line 177
    :cond_0
    iget v1, p0, Ll/֨᩵;->ܿ:I

    if-le v1, p1, :cond_2

    iget-object v1, p0, Ll/֨᩵;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 181
    :cond_1
    iget-object v1, p0, Ll/֨᩵;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 182
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 183
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 184
    iget-object v3, p0, Ll/֨᩵;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    iget v3, p0, Ll/֨᩵;->ܿ:I

    invoke-direct {p0, v2, v1}, Ll/֨᩵;->ܽ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    sub-int/2addr v3, v1

    iput v3, p0, Ll/֨᩵;->ܿ:I

    .line 187
    monitor-exit v0

    goto :goto_0

    .line 178
    :cond_2
    :goto_1
    monitor-exit v0

    return-void

    .line 173
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".sizeOf() is reporting inconsistent results!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 187
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۧ(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)V
    .locals 3

    if-eqz p1, :cond_1

    move-object v0, p0

    .line 205
    monitor-enter v0

    .line 206
    :try_start_0
    iget-object v1, p0, Ll/֨᩵;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 208
    iget v2, p0, Ll/֨᩵;->ܿ:I

    invoke-direct {p0, p1, v1}, Ll/֨᩵;->ܽ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    sub-int/2addr v2, p1

    iput v2, p0, Ll/֨᩵;->ܿ:I

    .line 210
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 201
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "key == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
