.class public abstract Ll/᩺ۗܺ;
.super Ljava/util/AbstractCollection;
.source "C5UX"

# interfaces
.implements Ljava/io/Serializable;
.implements Ll/֨۬ᩴ;


# static fields
.field public static final serialVersionUID:J = 0xdecafL

.field public static final ᩸:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 197
    sput-object v0, Ll/᩺ۗܺ;->᩸:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 184
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 387
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 272
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 300
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 341
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public abstract contains(Ljava/lang/Object;)Z
.end method

.method public synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹֨ᩴ;->$default$forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 168
    invoke-virtual {p0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public abstract iterator()Ll/᩶ۨܺ;
.end method

.method public synthetic parallelStream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩺ۗܺ;->parallelStream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public synthetic parallelStream()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֡۬ᩴ;->$default$parallelStream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 286
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 314
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public synthetic removeIf(Ljava/util/function/Predicate;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֡۬ᩴ;->$default$removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 328
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩺ۗܺ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    const/16 v0, 0x510

    .line 194
    invoke-static {p0, v0}, Ll/᩹۫ᩴ;->spliterator(Ljava/util/Collection;I)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic stream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩺ۗܺ;->stream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public synthetic stream()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֡۬ᩴ;->$default$stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 202
    sget-object v0, Ll/᩺ۗܺ;->᩸:[Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ll/᩺ۗܺ;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֡۬ᩴ;->$default$toArray(Ljava/util/Collection;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    .line 224
    array-length v1, p1

    const/4 v2, 0x0

    if-ge v1, v0, :cond_2

    .line 225
    invoke-virtual {p0}, Ll/᩺ۗܺ;->ܽ()[Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 227
    invoke-virtual {p0}, Ll/᩺ۗܺ;->ܿ()I

    move-result v0

    invoke-virtual {p0}, Ll/᩺ۗܺ;->ᩳ()I

    move-result v2

    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {v1, v0, v2, p1}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 100
    :cond_0
    array-length v1, p1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    .line 101
    :goto_0
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    .line 230
    :cond_2
    array-length v1, p1

    if-le v1, v0, :cond_3

    const/4 v1, 0x0

    .line 231
    aput-object v1, p1, v0

    .line 233
    :cond_3
    :goto_1
    invoke-virtual {p0, v2, p1}, Ll/᩺ۗܺ;->֫(I[Ljava/lang/Object;)I

    return-object p1
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 382
    new-instance v0, Ll/ᩳ۬ܺ;

    .line 202
    sget-object v1, Ll/᩺ۗܺ;->᩸:[Ljava/lang/Object;

    invoke-virtual {p0, v1}, Ll/᩺ۗܺ;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    .line 382
    invoke-direct {v0, v1}, Ll/ᩳ۬ܺ;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public ֫(I[Ljava/lang/Object;)I
    .locals 3

    .line 372
    invoke-virtual {p0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, p1, 0x1

    .line 373
    aput-object v1, p2, p1

    move p1, v2

    goto :goto_0

    :cond_0
    return p1
.end method

.method public ۧ()Ll/ܳ۬ܺ;
    .locals 2

    .line 355
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 85
    sget-object v0, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    return-object v0

    .line 202
    :cond_0
    sget-object v0, Ll/᩺ۗܺ;->᩸:[Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ll/᩺ۗܺ;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    .line 355
    sget v1, Ll/ܳ۬ܺ;->᩹:I

    .line 353
    array-length v1, v0

    invoke-static {v1, v0}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public abstract ܳ()Z
.end method

.method public ܽ()[Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ܿ()I
    .locals 1

    .line 247
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public ᩳ()I
    .locals 1

    .line 255
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
