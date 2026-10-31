.class public abstract Ll/ܳ۬ܺ;
.super Ll/᩺ۗܺ;
.source "Y4VB"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Ll/ۨ۬ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x35014542L

.field public static final ᩶:Ll/ۙۨܺ;

.field public static final synthetic ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 392
    new-instance v0, Ll/ۧ۬ܺ;

    sget-object v1, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ll/ۧ۬ܺ;-><init>(ILl/ܳ۬ܺ;)V

    sput-object v0, Ll/ܳ۬ܺ;->᩶:Ll/ۙۨܺ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 364
    invoke-direct {p0}, Ll/᩺ۗܺ;-><init>()V

    return-void
.end method

.method public static copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;
    .locals 1

    .line 256
    instance-of v0, p0, Ll/᩺ۗܺ;

    if-eqz v0, :cond_1

    .line 258
    check-cast p0, Ll/᩺ۗܺ;

    invoke-virtual {p0}, Ll/᩺ۗܺ;->ۧ()Ll/ܳ۬ܺ;

    move-result-object p0

    .line 259
    invoke-virtual {p0}, Ll/᩺ۗܺ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩺ۗܺ;->toArray()[Ljava/lang/Object;

    move-result-object p0

    .line 353
    array-length v0, p0

    invoke-static {v0, p0}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    :cond_0
    return-object p0

    .line 261
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    .line 216
    array-length v0, p0

    invoke-static {v0, p0}, Ll/۫ۤܺ;->֫(I[Ljava/lang/Object;)V

    .line 353
    array-length v0, p0

    invoke-static {v0, p0}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static of()Ll/ܳ۬ܺ;
    .locals 1

    .line 85
    sget-object v0, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public static of(Ljava/lang/Object;)Ll/ܳ۬ܺ;
    .locals 3

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    .line 216
    invoke-static {v0, v1}, Ll/۫ۤܺ;->֫(I[Ljava/lang/Object;)V

    .line 353
    invoke-static {v0, v1}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;
    .locals 3

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    .line 216
    invoke-static {v0, v1}, Ll/۫ۤܺ;->֫(I[Ljava/lang/Object;)V

    .line 353
    invoke-static {v0, v1}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;
    .locals 3

    const/4 v0, 0x5

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p0, 0x2

    aput-object p2, v1, p0

    const/4 p0, 0x3

    aput-object p3, v1, p0

    const/4 p0, 0x4

    aput-object p4, v1, p0

    .line 216
    invoke-static {v0, v1}, Ll/۫ۤܺ;->֫(I[Ljava/lang/Object;)V

    .line 353
    invoke-static {v0, v1}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;
    .locals 3

    const/4 v0, 0x7

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p0, 0x2

    aput-object p2, v1, p0

    const/4 p0, 0x3

    aput-object p3, v1, p0

    const/4 p0, 0x4

    aput-object p4, v1, p0

    const/4 p0, 0x5

    aput-object p5, v1, p0

    const/4 p0, 0x6

    aput-object p6, v1, p0

    .line 216
    invoke-static {v0, v1}, Ll/۫ۤܺ;->֫(I[Ljava/lang/Object;)V

    .line 353
    invoke-static {v0, v1}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static varargs of([Ljava/lang/Object;)Ll/ܳ۬ܺ;
    .locals 6
    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 205
    array-length v0, p0

    const v1, 0x7ffffff3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "the total number of elements must fit in an int"

    invoke-static {v1, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/String;Z)V

    .line 207
    array-length v0, p0

    const/16 v1, 0xc

    add-int/2addr v0, v1

    new-array v4, v0, [Ljava/lang/Object;

    const-string v5, "Blues"

    .line 208
    aput-object v5, v4, v3

    const-string v5, "Classic Rock"

    .line 209
    aput-object v5, v4, v2

    const/4 v2, 0x2

    const-string v5, "Country"

    .line 210
    aput-object v5, v4, v2

    const/4 v2, 0x3

    const-string v5, "Dance"

    .line 211
    aput-object v5, v4, v2

    const/4 v2, 0x4

    const-string v5, "Disco"

    .line 212
    aput-object v5, v4, v2

    const/4 v2, 0x5

    const-string v5, "Funk"

    .line 213
    aput-object v5, v4, v2

    const/4 v2, 0x6

    const-string v5, "Grunge"

    .line 214
    aput-object v5, v4, v2

    const/4 v2, 0x7

    const-string v5, "Hip-Hop"

    .line 215
    aput-object v5, v4, v2

    const/16 v2, 0x8

    const-string v5, "Jazz"

    .line 216
    aput-object v5, v4, v2

    const/16 v2, 0x9

    const-string v5, "Metal"

    .line 217
    aput-object v5, v4, v2

    const/16 v2, 0xa

    const-string v5, "New Age"

    .line 218
    aput-object v5, v4, v2

    const/16 v2, 0xb

    const-string v5, "Oldies"

    .line 219
    aput-object v5, v4, v2

    .line 220
    array-length v2, p0

    invoke-static {p0, v3, v4, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 216
    invoke-static {v0, v4}, Ll/۫ۤܺ;->֫(I[Ljava/lang/Object;)V

    .line 353
    invoke-static {v0, v4}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 711
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(I)Ll/֫۬ܺ;
    .locals 1

    const-string v0, "expectedSize"

    .line 742
    invoke-static {p0, v0}, Ll/᩹ۙܺ;->֫(ILjava/lang/String;)V

    .line 743
    new-instance v0, Ll/֫۬ܺ;

    .line 776
    invoke-direct {v0, p0}, Ll/ۛۗܺ;-><init>(I)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Iterable;)Ll/ܳ۬ܺ;
    .locals 1

    .line 902
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    .line 234
    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0

    .line 235
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-static {p0}, Ll/ܳ۬ܺ;->֫(Ljava/util/Iterator;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/Comparator;Ljava/util/Collection;)Ll/ܳ۬ܺ;
    .locals 1

    .line 902
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    invoke-static {p1}, Ll/ۡ۫ܺ;->ܿ(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    .line 216
    array-length v0, p1

    invoke-static {v0, p1}, Ll/۫ۤܺ;->֫(I[Ljava/lang/Object;)V

    .line 338
    invoke-static {p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 353
    array-length p0, p1

    invoke-static {p0, p1}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/Iterator;)Ll/ܳ۬ܺ;
    .locals 2

    .line 271
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 85
    sget-object p0, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    return-object p0

    .line 274
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 275
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 276
    invoke-static {v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0

    .line 278
    :cond_1
    new-instance v1, Ll/֫۬ܺ;

    invoke-direct {v1}, Ll/֫۬ܺ;-><init>()V

    .line 789
    :goto_0
    invoke-virtual {v1, v0}, Ll/ۛۗܺ;->֫(Ljava/lang/Object;)V

    .line 479
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 480
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 278
    :cond_2
    invoke-virtual {v1}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([Ljava/lang/Object;)Ll/ܳ۬ܺ;
    .locals 1

    .line 289
    array-length v0, p0

    if-nez v0, :cond_0

    .line 85
    sget-object p0, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    return-object p0

    .line 291
    :cond_0
    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    .line 216
    array-length v0, p0

    invoke-static {v0, p0}, Ll/۫ۤܺ;->֫(I[Ljava/lang/Object;)V

    .line 353
    array-length v0, p0

    invoke-static {v0, p0}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ۜ()Ll/ܳ۬ܺ;
    .locals 7

    const/4 v0, 0x2

    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    .line 9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v2, v5, v1

    aput-object v3, v5, v0

    .line 216
    invoke-static {v4, v5}, Ll/۫ۤܺ;->֫(I[Ljava/lang/Object;)V

    .line 353
    invoke-static {v4, v5}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;
    .locals 1

    if-nez p0, :cond_0

    .line 85
    sget-object p0, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    return-object p0

    .line 361
    :cond_0
    new-instance v0, Ll/ܽۛܺ;

    invoke-direct {v0, p0, p1}, Ll/ܽۛܺ;-><init>(I[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ᩷()Ll/ۨۨᩴ;
    .locals 1

    .line 72
    invoke-static {}, Ll/᩸ۙܺ;->֫()Ll/ۨۨᩴ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 552
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 525
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    .line 421
    invoke-virtual {p0, p1}, Ll/ܳ۬ܺ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    goto :goto_1

    .line 1015
    :cond_0
    instance-of v1, p1, Ljava/util/List;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    goto :goto_2

    .line 1018
    :cond_1
    check-cast p1, Ljava/util/List;

    .line 1019
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    .line 1020
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    goto :goto_2

    .line 1023
    :cond_2
    instance-of v3, p1, Ljava/util/RandomAccess;

    if-eqz v3, :cond_5

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    .line 1026
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return v0

    .line 1032
    :cond_5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 273
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 274
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_2

    .line 277
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 278
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 279
    invoke-static {v3, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :goto_2
    return v2

    .line 283
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    xor-int/2addr p1, v0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 680
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    .line 682
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v1

    not-int v1, v3

    not-int v1, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 4

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    .line 1064
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 1073
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    .line 375
    invoke-virtual {p0, v0}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/᩶ۨܺ;
    .locals 1

    const/4 v0, 0x0

    .line 375
    invoke-virtual {p0, v0}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 3

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    .line 1104
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    .line 1105
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_2
    return v0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 375
    invoke-virtual {p0, v0}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 59
    invoke-virtual {p0, p1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object p1

    return-object p1
.end method

.method public final listIterator(I)Ll/ۙۨܺ;
    .locals 1

    .line 381
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-static {p1, v0}, Ll/ۘܶܺ;->ۧ(II)V

    .line 382
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 383
    sget-object p1, Ll/ܳ۬ܺ;->᩶:Ll/ۙۨܺ;

    return-object p1

    .line 385
    :cond_0
    new-instance v0, Ll/ۧ۬ܺ;

    invoke-direct {v0, p1, p0}, Ll/ۧ۬ܺ;-><init>(ILl/ܳ۬ܺ;)V

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 566
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public synthetic replaceAll(Ljava/util/function/UnaryOperator;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۤ۬ᩴ;->$default$replaceAll(Ljava/util/List;Ljava/util/function/UnaryOperator;)V

    return-void
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 539
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public synthetic sort(Ljava/util/Comparator;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۤ۬ᩴ;->$default$sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 59
    invoke-virtual {p0, p1, p2}, Ll/ܳ۬ܺ;->subList(II)Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public subList(II)Ll/ܳ۬ܺ;
    .locals 1

    .line 439
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Ll/ۘܶܺ;->֫(III)V

    sub-int/2addr p2, p1

    .line 441
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ne p2, v0, :cond_0

    return-object p0

    :cond_0
    if-nez p2, :cond_1

    .line 85
    sget-object p1, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    return-object p1

    .line 455
    :cond_1
    new-instance v0, Ll/ܿ۬ܺ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܿ۬ܺ;-><init>(Ll/ܳ۬ܺ;II)V

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 718
    new-instance v0, Ll/ᩳ۬ܺ;

    invoke-virtual {p0}, Ll/᩺ۗܺ;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ᩳ۬ܺ;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public ֫(I[Ljava/lang/Object;)I
    .locals 4

    .line 585
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int v2, p1, v1

    .line 587
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, p2, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr p1, v0

    return p1
.end method

.method public final ۧ()Ll/ܳ۬ܺ;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-object p0
.end method

.method public ᩻()Ll/ܳ۬ܺ;
    .locals 2

    .line 600
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ll/ܽ۬ܺ;

    invoke-direct {v0, p0}, Ll/ܽ۬ܺ;-><init>(Ll/ܳ۬ܺ;)V

    return-object v0
.end method
