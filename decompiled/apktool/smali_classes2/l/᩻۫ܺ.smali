.class public abstract Ll/᩻۫ܺ;
.super Ll/ۛ۬ܺ;
.source "95IB"

# interfaces
.implements Ljava/util/NavigableSet;
.implements Ll/᩹ۛܺ;
.implements Ll/ܺ۫ᩴ;


# static fields
.field public static final serialVersionUID:J = 0xdecafL


# instance fields
.field public transient ۗ:Ll/᩻۫ܺ;

.field public final transient ۙ:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 556
    invoke-direct {p0}, Ll/ۛ۬ܺ;-><init>()V

    .line 557
    iput-object p1, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    return-void
.end method

.method public static copyOf(Ljava/util/Collection;)Ll/᩻۫ܺ;
    .locals 1

    .line 172
    sget-object v0, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    .line 325
    invoke-static {p0, v0}, Ll/᩻۫ܺ;->֫(Ljava/lang/Iterable;Ljava/util/Comparator;)Ll/᩻۫ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static of()Ll/᩻۫ܺ;
    .locals 1

    .line 99
    sget-object v0, Ll/ۢۛܺ;->۫:Ll/ۢۛܺ;

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 797
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/util/Comparator;)Ll/ۢۛܺ;
    .locals 2

    .line 172
    sget-object v0, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    sget-object p0, Ll/ۢۛܺ;->۫:Ll/ۢۛܺ;

    return-object p0

    .line 88
    :cond_0
    new-instance v0, Ll/ۢۛܺ;

    .line 85
    sget-object v1, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    .line 88
    invoke-direct {v0, v1, p0}, Ll/ۢۛܺ;-><init>(Ll/ܳ۬ܺ;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Iterable;)Ll/᩻۫ܺ;
    .locals 1

    .line 172
    sget-object v0, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    .line 214
    invoke-static {p0, v0}, Ll/᩻۫ܺ;->֫(Ljava/lang/Iterable;Ljava/util/Comparator;)Ll/᩻۫ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/util/Comparator;)Ll/᩻۫ܺ;
    .locals 2

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    invoke-static {p0, p1}, Ll/᩶ۛܺ;->֫(Ljava/lang/Iterable;Ljava/util/Comparator;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 296
    instance-of v0, p0, Ll/᩻۫ܺ;

    if-eqz v0, :cond_0

    .line 298
    move-object v0, p0

    check-cast v0, Ll/᩻۫ܺ;

    .line 299
    invoke-virtual {v0}, Ll/᩺ۗܺ;->ܳ()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 304
    :cond_0
    invoke-static {p0}, Ll/ۡ۫ܺ;->ܿ(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p0

    .line 305
    array-length v0, p0

    invoke-static {p1, v0, p0}, Ll/᩻۫ܺ;->֫(Ljava/util/Comparator;I[Ljava/lang/Object;)Ll/᩻۫ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ֫(Ljava/util/Comparator;I[Ljava/lang/Object;)Ll/᩻۫ܺ;
    .locals 4

    if-nez p1, :cond_0

    .line 366
    invoke-static {p0}, Ll/᩻۫ܺ;->֫(Ljava/util/Comparator;)Ll/ۢۛܺ;

    move-result-object p0

    return-object p0

    .line 368
    :cond_0
    invoke-static {p1, p2}, Ll/۫ۤܺ;->֫(I[Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 369
    invoke-static {p2, v0, p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    const/4 v0, 0x1

    const/4 v1, 0x1

    :goto_0
    if-ge v0, p1, :cond_2

    .line 372
    aget-object v2, p2, v0

    add-int/lit8 v3, v1, -0x1

    .line 373
    aget-object v3, p2, v3

    .line 374
    invoke-interface {p0, v2, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v3, v1, 0x1

    .line 375
    aput-object v2, p2, v1

    move v1, v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 378
    invoke-static {p2, v1, p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 379
    array-length p1, p2

    div-int/lit8 p1, p1, 0x2

    if-ge v1, p1, :cond_3

    .line 382
    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    .line 384
    :cond_3
    new-instance p1, Ll/ۢۛܺ;

    .line 385
    invoke-static {v1, p2}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ll/ۢۛܺ;-><init>(Ll/ܳ۬ܺ;Ljava/util/Comparator;)V

    return-object p1
.end method


# virtual methods
.method public ceiling(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 646
    invoke-virtual {p0, p1, v0}, Ll/᩻۫ܺ;->ۧ(Ljava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    const/4 v0, 0x0

    .line 839
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-static {p1, v0}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 567
    iget-object v0, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    return-object v0
.end method

.method public bridge synthetic descendingIterator()Ljava/util/Iterator;
    .locals 1

    .line 62
    invoke-virtual {p0}, Ll/᩻۫ܺ;->descendingIterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public abstract descendingIterator()Ll/᩶ۨܺ;
.end method

.method public final descendingSet()Ljava/util/NavigableSet;
    .locals 1

    .line 747
    iget-object v0, p0, Ll/᩻۫ܺ;->ۗ:Ll/᩻۫ܺ;

    if-nez v0, :cond_0

    .line 749
    invoke-virtual {p0}, Ll/᩻۫ܺ;->ۢ()Ll/᩻۫ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩻۫ܺ;->ۗ:Ll/᩻۫ܺ;

    .line 750
    iput-object p0, v0, Ll/᩻۫ܺ;->ۗ:Ll/᩻۫ܺ;

    :cond_0
    return-object v0
.end method

.method public first()Ljava/lang/Object;
    .locals 1

    .line 696
    invoke-virtual {p0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public floor(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 593
    invoke-virtual {p0, p1, v0}, Ll/᩻۫ܺ;->֫(Ljava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    .line 674
    invoke-virtual {p1}, Ll/᩻۫ܺ;->descendingIterator()Ll/᩶ۨܺ;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    invoke-virtual {p0, p1, p2}, Ll/᩻۫ܺ;->֫(Ljava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 593
    invoke-virtual {p0, p1, v0}, Ll/᩻۫ܺ;->֫(Ljava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public higher(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 646
    invoke-virtual {p0, p1, v0}, Ll/᩻۫ܺ;->ۧ(Ljava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    const/4 v0, 0x0

    .line 839
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-static {p1, v0}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 62
    invoke-virtual {p0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public last()Ljava/lang/Object;
    .locals 1

    .line 701
    invoke-virtual {p0}, Ll/᩻۫ܺ;->descendingIterator()Ll/᩶ۨܺ;

    move-result-object v0

    check-cast v0, Ll/֡᩶ܺ;

    invoke-virtual {v0}, Ll/֡᩶ܺ;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public lower(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 593
    invoke-virtual {p0, p1, v0}, Ll/᩻۫ܺ;->֫(Ljava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    .line 666
    invoke-virtual {p1}, Ll/᩻۫ܺ;->descendingIterator()Ll/᩶ۨܺ;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 717
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 733
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    iget-object v0, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/ۘܶܺ;->֫(Z)V

    .line 623
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/᩻۫ܺ;->֫(Ljava/lang/Object;ZLjava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 3

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    iget-object v0, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/ۘܶܺ;->֫(Z)V

    .line 623
    invoke-virtual {p0, p1, v1, p2, v2}, Ll/᩻۫ܺ;->֫(Ljava/lang/Object;ZLjava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    invoke-virtual {p0, p1, p2}, Ll/᩻۫ܺ;->ۧ(Ljava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 646
    invoke-virtual {p0, p1, v0}, Ll/᩻۫ܺ;->ۧ(Ljava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 3

    .line 803
    new-instance v0, Ll/ܳ۫ܺ;

    iget-object v1, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    invoke-virtual {p0}, Ll/᩺ۗܺ;->toArray()[Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ܳ۫ܺ;-><init>(Ljava/util/Comparator;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public abstract ֫(Ljava/lang/Object;Z)Ll/᩻۫ܺ;
.end method

.method public abstract ֫(Ljava/lang/Object;ZLjava/lang/Object;Z)Ll/᩻۫ܺ;
.end method

.method public abstract ۢ()Ll/᩻۫ܺ;
.end method

.method public abstract ۧ(Ljava/lang/Object;Z)Ll/᩻۫ܺ;
.end method
