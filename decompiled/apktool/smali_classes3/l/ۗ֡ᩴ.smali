.class public Ll/ۗ֡ᩴ;
.super Ljava/lang/Object;
.source "W1F5"

# interfaces
.implements Ll/᩶֡ᩴ;
.implements Ljava/io/Serializable;
.implements Ll/֨۬ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# instance fields
.field public final ᩸:Ll/᩶֡ᩴ;

.field public final ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/᩶֡ᩴ;Ljava/lang/Object;)V
    .locals 0

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    .line 134
    iput-object p2, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 283
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 284
    :try_start_0
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 285
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
.method public add(Ljava/lang/Object;)Z
    .locals 2

    .line 144
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 145
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 146
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 2

    .line 220
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 221
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 222
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public clear()V
    .locals 2

    .line 255
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 256
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    .line 257
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

    .line 151
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 152
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 153
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 227
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 228
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 229
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

    .line 277
    :cond_0
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 278
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 279
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public forEach(Ljava/util/function/Consumer;)V
    .locals 2

    .line 213
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 214
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-static {v1, p1}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 215
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

    .line 269
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 270
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 271
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isEmpty()Z
    .locals 2

    .line 172
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 173
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 174
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 127
    invoke-virtual {p0}, Ll/ۗ֡ᩴ;->iterator()Ll/۫֡ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ll/۫֡ᩴ;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v0}, Ll/᩶֡ᩴ;->iterator()Ll/۫֡ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic parallelStream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۗ֡ᩴ;->parallelStream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public parallelStream()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 208
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->parallelStream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .line 158
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 159
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 160
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 2

    .line 234
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 235
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 236
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public removeIf(Ljava/util/function/Predicate;)Z
    .locals 2

    .line 248
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 249
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-static {v1, p1}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 250
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 2

    .line 241
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 242
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 243
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public size()I
    .locals 2

    .line 165
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 166
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 167
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۗ֡ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Ll/۠ۚᩴ;
    .locals 1

    .line 198
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v0}, Ll/᩶֡ᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 127
    invoke-virtual {p0}, Ll/ۗ֡ᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic stream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۗ֡ᩴ;->stream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public stream()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 203
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 2

    .line 179
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 180
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 181
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

    .line 186
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 187
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 188
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 262
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 263
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 264
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
