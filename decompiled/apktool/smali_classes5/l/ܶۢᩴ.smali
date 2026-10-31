.class public Ll/ܶۢᩴ;
.super Ljava/lang/Object;
.source "J1FL"

# interfaces
.implements Ll/֨ۢᩴ;
.implements Ljava/io/Serializable;
.implements Ll/֨۬ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# instance fields
.field public final ᩸:Ll/֨ۢᩴ;

.field public final ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۨۡᩴ;Ljava/lang/Object;)V
    .locals 0

    .line 184
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 185
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    .line 186
    iput-object p2, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 432
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 433
    :try_start_0
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 434
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
.method public add(I)Z
    .locals 2

    .line 196
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 197
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ll/֨ۢᩴ;->add(I)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 198
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 179
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Ll/ܶۢᩴ;->֫(Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 2

    .line 369
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 370
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 371
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public clear()V
    .locals 2

    .line 404
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 405
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    .line 406
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public contains(I)Z
    .locals 2

    .line 203
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 204
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ll/֨ۢᩴ;->contains(I)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 205
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 298
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 299
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ll/֨ۢᩴ;->contains(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 300
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 376
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 377
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 378
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

    .line 426
    :cond_0
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 427
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 428
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۡᩴ;->֫(Ll/֨ۢᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public forEach(Ljava/util/function/IntConsumer;)V
    .locals 2

    .line 362
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 363
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ll/ܳۡᩴ;->forEach(Ljava/util/function/IntConsumer;)V

    .line 364
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public hashCode()I
    .locals 2

    .line 418
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 419
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 420
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isEmpty()Z
    .locals 2

    .line 224
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 225
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 226
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 179
    invoke-virtual {p0}, Ll/ܶۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ll/ۜۡᩴ;
    .locals 1

    .line 340
    iget-object v0, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0}, Ll/֨ۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic parallelStream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܶۢᩴ;->parallelStream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public parallelStream()Ll/ܿ᩺ᩴ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 357
    iget-object v0, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0}, Ll/֨ۢᩴ;->parallelStream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 306
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 307
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ll/֨ۢᩴ;->remove(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 308
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 2

    .line 383
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 384
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 385
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final synthetic removeIf(Ljava/util/function/Predicate;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۚۢᩴ;->֫(Ll/֨ۢᩴ;Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 2

    .line 390
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 391
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 392
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public size()I
    .locals 2

    .line 217
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 218
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 219
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܶۢᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 179
    invoke-virtual {p0}, Ll/ܶۢᩴ;->spliterator()Ll/ܽܺᩴ;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Ll/ܽܺᩴ;
    .locals 1

    .line 345
    iget-object v0, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0}, Ll/֨ۢᩴ;->spliterator()Ll/ܽܺᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic stream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܶۢᩴ;->stream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public stream()Ll/ܿ᩺ᩴ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 351
    iget-object v0, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0}, Ll/֨ۢᩴ;->stream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 2

    .line 238
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 239
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 240
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

    .line 333
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 334
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 335
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 411
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 412
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 413
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ֫(Ljava/lang/Integer;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 290
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 291
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ll/֨ۢᩴ;->֫(Ljava/lang/Integer;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 292
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ֫(Ljava/util/function/IntPredicate;)Z
    .locals 2

    .line 397
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 398
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ll/֨ۢᩴ;->֫(Ljava/util/function/IntPredicate;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 399
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۖ(I)Z
    .locals 2

    .line 210
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 211
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1, p1}, Ll/֨ۢᩴ;->ۖ(I)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 212
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ܶ()[I
    .locals 2

    .line 231
    iget-object v0, p0, Ll/ܶۢᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 232
    :try_start_0
    iget-object v1, p0, Ll/ܶۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v1}, Ll/֨ۢᩴ;->ܶ()[I

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 233
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
