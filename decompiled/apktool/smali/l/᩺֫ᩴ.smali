.class public Ll/᩺֫ᩴ;
.super Ljava/lang/Object;
.source "D26"

# interfaces
.implements Ll/ۛ֫ᩴ;
.implements Ljava/io/Serializable;
.implements Ll/֨۬ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# instance fields
.field public final ᩸:Ll/ۛ֫ᩴ;

.field public final ᩹:Ll/ۤ۟ۘ;


# direct methods
.method public constructor <init>(Ll/ۨۧᩴ;Ll/ۤ۟ۘ;)V
    .locals 0

    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    .line 197
    iput-object p2, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 443
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 444
    :try_start_0
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 445
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public final bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 190
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p0, p1}, Ll/᩺֫ᩴ;->֫(Ljava/lang/Character;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 2

    .line 380
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 381
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 382
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public clear()V
    .locals 2

    .line 415
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 416
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    .line 417
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 309
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 310
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ll/ۛ֫ᩴ;->contains(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 311
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 387
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 388
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 389
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 437
    :cond_0
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 438
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 439
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۧᩴ;->֫(Ll/ۛ֫ᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public hashCode()I
    .locals 2

    .line 429
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 430
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 431
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isEmpty()Z
    .locals 2

    .line 235
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 236
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 237
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 190
    invoke-virtual {p0}, Ll/᩺֫ᩴ;->iterator()Ll/ܺۧᩴ;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ll/ܺۧᩴ;
    .locals 1

    .line 351
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v0}, Ll/ۛ֫ᩴ;->iterator()Ll/ܺۧᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic parallelStream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩺֫ᩴ;->parallelStream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public parallelStream()Ll/ܿ᩺ᩴ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 368
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v0}, Ll/ۛ֫ᩴ;->parallelStream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 317
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 318
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ll/ۛ֫ᩴ;->remove(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 319
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 2

    .line 394
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 395
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 396
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final synthetic removeIf(Ljava/util/function/Predicate;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۤ֫ᩴ;->֫(Ll/ۛ֫ᩴ;Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 2

    .line 401
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 402
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 403
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public size()I
    .locals 2

    .line 228
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 229
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 230
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩺֫ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 190
    invoke-virtual {p0}, Ll/᩺֫ᩴ;->spliterator()Ll/ܽܽᩴ;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Ll/ܽܽᩴ;
    .locals 1

    .line 356
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v0}, Ll/ۛ֫ᩴ;->spliterator()Ll/ܽܽᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic stream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩺֫ᩴ;->stream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public stream()Ll/ܿ᩺ᩴ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 362
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v0}, Ll/ۛ֫ᩴ;->stream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 2

    .line 249
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 250
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 251
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public synthetic toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֡۬ᩴ;->$default$toArray(Ljava/util/Collection;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    .line 344
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 345
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 346
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 422
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 423
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 424
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ֫(Ll/᩻ۧᩴ;)V
    .locals 2

    .line 373
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 374
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ll/ۢۧᩴ;->֫(Ll/᩻ۧᩴ;)V

    .line 375
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ֫(Ljava/lang/Character;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 301
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 302
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ll/ۛ֫ᩴ;->֫(Ljava/lang/Character;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 303
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ֫(Ll/ۛۧᩴ;)Z
    .locals 2

    .line 408
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 409
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ll/ۛ֫ᩴ;->֫(Ll/ۛۧᩴ;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 410
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۧ(C)Z
    .locals 2

    .line 207
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 208
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ll/ۛ֫ᩴ;->ۧ(C)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 209
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ܿ(C)Z
    .locals 2

    .line 221
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 222
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ll/ۛ֫ᩴ;->ܿ(C)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 223
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ᩻(C)Z
    .locals 2

    .line 214
    iget-object v0, p0, Ll/᩺֫ᩴ;->᩹:Ll/ۤ۟ۘ;

    monitor-enter v0

    .line 215
    :try_start_0
    iget-object v1, p0, Ll/᩺֫ᩴ;->᩸:Ll/ۛ֫ᩴ;

    invoke-interface {v1, p1}, Ll/ۛ֫ᩴ;->᩻(C)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 216
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
