.class public Ll/ۤۜᩴ;
.super Ljava/lang/Object;
.source "PHN"

# interfaces
.implements Ll/۬ۜᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# instance fields
.field public final ᩸:Ll/ۖۜᩴ;

.field public final ᩹:Ll/ۤۜᩴ;


# direct methods
.method public constructor <init>(Ll/ۖۜᩴ;)V
    .locals 0

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    iput-object p1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    .line 197
    iput-object p0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 366
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 367
    :try_start_0
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 368
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
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(I)Ljava/lang/Object;
    .locals 2

    .line 202
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 203
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    .line 60
    invoke-virtual {v1, p1}, Ll/ۖۜᩴ;->get(I)Ljava/lang/Object;

    move-result-object p1

    .line 203
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 204
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 183
    check-cast p1, Ljava/lang/Integer;

    .line 215
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 216
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    .line 93
    invoke-virtual {v1, p1}, Ll/֨ܿᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 216
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 217
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final clear()V
    .locals 2

    .line 286
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 287
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    invoke-virtual {v1}, Ll/ۖۜᩴ;->clear()V

    .line 288
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 230
    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 251
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 252
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    .line 243
    invoke-static {v1, p1}, Ll/ۗۜᩴ;->֫(Ll/۬ۜᩴ;Ljava/lang/Object;)Z

    move-result p1

    .line 252
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 253
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

    .line 353
    :cond_0
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 354
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    invoke-virtual {v1, p1}, Ll/֨ܿᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 355
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 265
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 266
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    invoke-virtual {v1, p1}, Ll/ۖۜᩴ;->get(I)Ljava/lang/Object;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 267
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 312
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 313
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    .line 185
    invoke-static {v1, p1}, Ll/ۗۜᩴ;->ۧ(Ll/۬ۜᩴ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 313
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 314
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public hashCode()I
    .locals 2

    .line 345
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 346
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    invoke-virtual {v1}, Ll/֨ܿᩴ;->hashCode()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 347
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 183
    check-cast p1, Ljava/lang/Integer;

    .line 299
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 300
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    .line 171
    invoke-static {v1, p1, p2}, Ll/ۗۜᩴ;->֫(Ll/۬ۜᩴ;Ljava/lang/Integer;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 300
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 301
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 2

    .line 279
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 280
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    invoke-virtual {v1, p1}, Ll/ۖۜᩴ;->remove(I)Ljava/lang/Object;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 281
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 338
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 339
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    .line 199
    invoke-static {v1, p1}, Ll/ۗۜᩴ;->ܽ(Ll/۬ۜᩴ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 339
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 340
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final size()I
    .locals 2

    .line 222
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 223
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    .line 918
    iget v1, v1, Ll/ۖۜᩴ;->᩸:I

    .line 223
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 224
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 360
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 361
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    invoke-virtual {v1}, Ll/֨ܿᩴ;->toString()Ljava/lang/String;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 362
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 258
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 259
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    invoke-virtual {v1, p1, p2}, Ll/ۖۜᩴ;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 260
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(I)Z
    .locals 2

    .line 243
    iget-object v0, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    monitor-enter v0

    .line 244
    :try_start_0
    iget-object v1, p0, Ll/ۤۜᩴ;->᩸:Ll/ۖۜᩴ;

    invoke-virtual {v1, p1}, Ll/ۖۜᩴ;->֫(I)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 245
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 3

    .line 229
    iget-object v1, p0, Ll/ۤۜᩴ;->᩹:Ll/ۤۜᩴ;

    move-object v0, v1

    monitor-enter v0

    const/4 v2, 0x0

    .line 230
    :try_start_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v0

    .line 231
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
