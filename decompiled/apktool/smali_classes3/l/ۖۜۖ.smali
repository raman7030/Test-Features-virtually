.class public abstract Ll/ۖۜۖ;
.super Ljava/lang/Object;
.source "V9OM"

# interfaces
.implements Ll/ۢ֡ۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 333
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Reading "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " from a "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " threw an IOException (should never happen)."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static ֫(Ll/ۡ֡ۖ;)Ll/ᩳ֨ۖ;
    .locals 0

    .line 362
    new-instance p0, Ll/ᩳ֨ۖ;

    invoke-direct {p0}, Ll/ᩳ֨ۖ;-><init>()V

    return-object p0
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/util/Collection;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 368
    check-cast p1, Ljava/util/List;

    invoke-static {p0, p1}, Ll/ۖۜۖ;->֫(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/util/List;)V
    .locals 3

    .line 379
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    instance-of v0, p0, Ll/ۘ᩵ۖ;

    if-eqz v0, :cond_4

    .line 386
    check-cast p0, Ll/ۘ᩵ۖ;

    invoke-interface {p0}, Ll/ۘ᩵ۖ;->ܰ()Ljava/util/List;

    move-result-object p0

    .line 387
    move-object v0, p1

    check-cast v0, Ll/ۘ᩵ۖ;

    .line 388
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    .line 389
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 392
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "Element at index "

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, p1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " is null."

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 393
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    add-int/lit8 v1, v1, -0x1

    if-lt v1, p1, :cond_0

    .line 394
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 396
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 398
    :cond_1
    instance-of v2, v1, Ll/ۛۜۖ;

    if-eqz v2, :cond_2

    .line 399
    check-cast v1, Ll/ۛۜۖ;

    invoke-interface {v0, v1}, Ll/ۘ᩵ۖ;->֫(Ll/ۛۜۖ;)V

    goto :goto_0

    .line 401
    :cond_2
    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-void

    .line 405
    :cond_4
    instance-of v0, p0, Ll/ۤ֡ۖ;

    if-eqz v0, :cond_5

    .line 406
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void

    .line 408
    :cond_5
    invoke-static {p0, p1}, Ll/ۖۜۖ;->ۧ(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static ۧ(Ljava/lang/Iterable;Ljava/util/List;)V
    .locals 3

    .line 342
    instance-of v0, p1, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    .line 343
    move-object v0, p1

    check-cast v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    move-object v2, p0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 345
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    .line 346
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    .line 349
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "Element at index "

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " is null."

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 350
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    add-int/lit8 v1, v1, -0x1

    if-lt v1, v0, :cond_1

    .line 351
    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 353
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 355
    :cond_2
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 133
    invoke-virtual {p0}, Ll/ۖۜۖ;->clone()Ll/ۖۜۖ;

    move-result-object v0

    return-object v0
.end method

.method public abstract clone()Ll/ۖۜۖ;
.end method

.method public bridge synthetic clone()Ll/ۢ֡ۖ;
    .locals 1

    .line 133
    invoke-virtual {p0}, Ll/ۖۜۖ;->clone()Ll/ۖۜۖ;

    move-result-object v0

    return-object v0
.end method

.method public abstract internalMergeFrom(Ll/ۘۜۖ;)Ll/ۖۜۖ;
.end method

.method public mergeDelimitedFrom(Ljava/io/InputStream;)Z
    .locals 1

    .line 316
    invoke-static {}, Ll/ᩳۘۖ;->֫()Ll/ᩳۘۖ;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll/ۖۜۖ;->mergeDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Z

    move-result p1

    return p1
.end method

.method public mergeDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Z
    .locals 2

    .line 304
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 308
    :cond_0
    invoke-static {p1, v0}, Ll/۟ۜۖ;->֫(Ljava/io/InputStream;I)I

    move-result v0

    .line 309
    new-instance v1, Ll/ܺۜۖ;

    invoke-direct {v1, p1, v0}, Ll/ܺۜۖ;-><init>(Ljava/io/InputStream;I)V

    .line 310
    invoke-virtual {p0, v1, p2}, Ll/ۖۜۖ;->mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۖۜۖ;

    const/4 p1, 0x1

    return p1
.end method

.method public mergeFrom(Ljava/io/InputStream;)Ll/ۖۜۖ;
    .locals 1

    .line 230
    invoke-static {p1}, Ll/۟ۜۖ;->֫(Ljava/io/InputStream;)Ll/۟ۜۖ;

    move-result-object p1

    .line 231
    invoke-virtual {p0, p1}, Ll/ۖۜۖ;->mergeFrom(Ll/۟ۜۖ;)Ll/ۖۜۖ;

    const/4 v0, 0x0

    .line 232
    invoke-virtual {p1, v0}, Ll/۟ۜۖ;->֫(I)V

    return-object p0
.end method

.method public mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 239
    invoke-static {p1}, Ll/۟ۜۖ;->֫(Ljava/io/InputStream;)Ll/۟ۜۖ;

    move-result-object p1

    .line 240
    invoke-virtual {p0, p1, p2}, Ll/ۖۜۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;

    const/4 p2, 0x0

    .line 241
    invoke-virtual {p1, p2}, Ll/۟ۜۖ;->֫(I)V

    return-object p0
.end method

.method public mergeFrom(Ll/ۛۜۖ;)Ll/ۖۜۖ;
    .locals 2

    .line 156
    :try_start_0
    invoke-virtual {p1}, Ll/ۛۜۖ;->ܽ()Ll/۟ۜۖ;

    move-result-object p1

    .line 157
    invoke-virtual {p0, p1}, Ll/ۖۜۖ;->mergeFrom(Ll/۟ۜۖ;)Ll/ۖۜۖ;

    const/4 v0, 0x0

    .line 158
    invoke-virtual {p1, v0}, Ll/۟ۜۖ;->֫(I)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 163
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "ByteString"

    invoke-direct {p0, v1}, Ll/ۖۜۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 161
    throw p1
.end method

.method public mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 1

    .line 172
    :try_start_0
    invoke-virtual {p1}, Ll/ۛۜۖ;->ܽ()Ll/۟ۜۖ;

    move-result-object p1

    .line 173
    invoke-virtual {p0, p1, p2}, Ll/ۖۜۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;

    const/4 p2, 0x0

    .line 174
    invoke-virtual {p1, p2}, Ll/۟ۜۖ;->֫(I)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 179
    new-instance p2, Ljava/lang/RuntimeException;

    const-string v0, "ByteString"

    invoke-direct {p0, v0}, Ll/ۖۜۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 177
    throw p1
.end method

.method public mergeFrom(Ll/۟ۜۖ;)Ll/ۖۜۖ;
    .locals 1

    .line 144
    invoke-static {}, Ll/ᩳۘۖ;->֫()Ll/ᩳۘۖ;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll/ۖۜۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public abstract mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
.end method

.method public mergeFrom(Ll/ۡ֡ۖ;)Ll/ۖۜۖ;
    .locals 1

    .line 322
    invoke-interface {p0}, Ll/ܺ֡ۖ;->getDefaultInstanceForType()Ll/ۡ֡ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 327
    check-cast p1, Ll/ۘۜۖ;

    invoke-virtual {p0, p1}, Ll/ۖۜۖ;->internalMergeFrom(Ll/ۘۜۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1

    .line 323
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "mergeFrom(MessageLite) can only merge messages of the same type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public mergeFrom([B)Ll/ۖۜۖ;
    .locals 2

    const/4 v0, 0x0

    .line 185
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۖۜۖ;->mergeFrom([BII)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom([BII)Ll/ۖۜۖ;
    .locals 1

    const/4 v0, 0x0

    .line 117
    :try_start_0
    invoke-static {v0, p2, p3, p1}, Ll/۟ۜۖ;->֫(ZII[B)Ll/۟ۜۖ;

    move-result-object p1

    .line 193
    invoke-virtual {p0, p1}, Ll/ۖۜۖ;->mergeFrom(Ll/۟ۜۖ;)Ll/ۖۜۖ;

    .line 194
    invoke-virtual {p1, v0}, Ll/۟ۜۖ;->֫(I)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 199
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "byte array"

    invoke-direct {p0, p3}, Ll/ۖۜۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 197
    throw p1
.end method

.method public mergeFrom([BIILl/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 1

    const/4 v0, 0x0

    .line 117
    :try_start_0
    invoke-static {v0, p2, p3, p1}, Ll/۟ۜۖ;->֫(ZII[B)Ll/۟ۜۖ;

    move-result-object p1

    .line 218
    invoke-virtual {p0, p1, p4}, Ll/ۖۜۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;

    .line 219
    invoke-virtual {p1, v0}, Ll/۟ۜۖ;->֫(I)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 224
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "byte array"

    invoke-direct {p0, p3}, Ll/ۖۜۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 222
    throw p1
.end method

.method public mergeFrom([BLl/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 2

    const/4 v0, 0x0

    .line 206
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1, p2}, Ll/ۖۜۖ;->mergeFrom([BIILl/ᩳۘۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ljava/io/InputStream;)Ll/ۢ֡ۖ;
    .locals 0

    .line 133
    invoke-virtual {p0, p1}, Ll/ۖۜۖ;->mergeFrom(Ljava/io/InputStream;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 133
    invoke-virtual {p0, p1, p2}, Ll/ۖۜۖ;->mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/ۛۜۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 133
    invoke-virtual {p0, p1}, Ll/ۖۜۖ;->mergeFrom(Ll/ۛۜۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 133
    invoke-virtual {p0, p1, p2}, Ll/ۖۜۖ;->mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 133
    invoke-virtual {p0, p1}, Ll/ۖۜۖ;->mergeFrom(Ll/۟ۜۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 133
    invoke-virtual {p0, p1, p2}, Ll/ۖۜۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/ۡ֡ۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 133
    invoke-virtual {p0, p1}, Ll/ۖۜۖ;->mergeFrom(Ll/ۡ֡ۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([B)Ll/ۢ֡ۖ;
    .locals 0

    .line 133
    invoke-virtual {p0, p1}, Ll/ۖۜۖ;->mergeFrom([B)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BII)Ll/ۢ֡ۖ;
    .locals 0

    .line 133
    invoke-virtual {p0, p1, p2, p3}, Ll/ۖۜۖ;->mergeFrom([BII)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BIILl/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 133
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۖۜۖ;->mergeFrom([BIILl/ᩳۘۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BLl/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 133
    invoke-virtual {p0, p1, p2}, Ll/ۖۜۖ;->mergeFrom([BLl/ᩳۘۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method
