.class public Ll/֫ۤᩴ;
.super Ll/۟۫ᩴ;
.source "N673"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/io/Serializable;
.implements Ll/ۡ۫ᩴ;


# static fields
.field public static final serialVersionUID:J = 0x6499de129d87293dL


# instance fields
.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۧۤᩴ;Ljava/lang/Object;)V
    .locals 0

    .line 4593
    invoke-direct {p0, p1}, Ll/۟۫ᩴ;-><init>(Ll/ۧۤᩴ;)V

    .line 4594
    iput-object p2, p0, Ll/֫ۤᩴ;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 3

    .line 4645
    iget-object v0, p0, Ll/֫ۤᩴ;->b:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 4647
    iget-object v1, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Ll/ۧۤᩴ;->f(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 4646
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 5

    .line 4664
    iget-object v0, p0, Ll/֫ۤᩴ;->b:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 4666
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 4667
    iget-object v3, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v0, v4}, Ll/ۧۤᩴ;->f(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    return v1

    .line 4665
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 4610
    iget-object v0, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 4682
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/util/Set;

    if-eq p1, p0, :cond_0

    .line 4684
    invoke-virtual {p0, p1}, Ll/۟۫ᩴ;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1, p0}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 5

    .line 4696
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4698
    iget-object v0, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    iget-object v0, v0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-eqz v0, :cond_0

    .line 4699
    new-instance v1, Ll/ܶۤᩴ;

    array-length v2, v0

    const/4 v3, 0x0

    array-length v4, v0

    invoke-direct {v1, v0, v2, v3, v4}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 4700
    :goto_0
    invoke-virtual {v1}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4701
    iget-object v0, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 4675
    invoke-virtual {p0}, Ll/֫ۤᩴ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    move-object v2, v0

    check-cast v2, Ll/᩻ۤᩴ;

    invoke-virtual {v2}, Ll/᩻ۤᩴ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ll/ۘۤᩴ;

    invoke-virtual {v2}, Ll/ۘۤᩴ;->next()Ljava/lang/Object;

    move-result-object v2

    .line 4676
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 7

    .line 4628
    iget-object v4, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    .line 4629
    iget-object v1, v4, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    array-length v0, v1

    move v3, v0

    .line 4630
    :goto_0
    new-instance v6, Ll/ۘۤᩴ;

    const/4 v5, 0x0

    move-object v0, v6

    move v2, v3

    .line 3450
    invoke-direct/range {v0 .. v5}, Ll/ۘۤᩴ;-><init>([Ll/֡ۤᩴ;IILl/ۧۤᩴ;I)V

    return-object v6
.end method

.method public final synthetic parallelStream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֡۬ᩴ;->$default$parallelStream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic parallelStream()Ll/ܿ᩺ᩴ;
    .locals 1

    invoke-static {p0}, Ll/֡۬ᩴ;->$default$parallelStream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .line 4621
    iget-object v0, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic removeIf(Ljava/util/function/Predicate;)Z
    .locals 0

    invoke-static {p0, p1}, Ll/֡۬ᩴ;->$default$removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Ll/֫ۤᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 11

    .line 4689
    iget-object v0, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    .line 4690
    invoke-virtual {v0}, Ll/ۧۤᩴ;->j()J

    move-result-wide v1

    .line 4691
    iget-object v4, v0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-nez v4, :cond_0

    const/4 v0, 0x0

    const/4 v7, 0x0

    goto :goto_0

    :cond_0
    array-length v0, v4

    move v7, v0

    .line 4692
    :goto_0
    new-instance v0, Ll/ᩴۤᩴ;

    const-wide/16 v5, 0x0

    cmp-long v3, v1, v5

    if-gez v3, :cond_1

    move-wide v8, v5

    goto :goto_1

    :cond_1
    move-wide v8, v1

    :goto_1
    const/4 v10, 0x0

    const/4 v6, 0x0

    move-object v3, v0

    move v5, v7

    invoke-direct/range {v3 .. v10}, Ll/ᩴۤᩴ;-><init>([Ll/֡ۤᩴ;IIIJI)V

    return-object v0
.end method

.method public final synthetic stream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֡۬ᩴ;->$default$stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic stream()Ll/ܿ᩺ᩴ;
    .locals 1

    invoke-static {p0}, Ll/֡۬ᩴ;->$default$stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Ll/֡۬ᩴ;->$default$toArray(Ljava/util/Collection;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
