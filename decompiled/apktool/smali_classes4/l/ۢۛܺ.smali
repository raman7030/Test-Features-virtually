.class public final Ll/ۢۛܺ;
.super Ll/᩻۫ܺ;
.source "V578"


# static fields
.field public static final ۫:Ll/ۢۛܺ;


# instance fields
.field public final transient ۬:Ll/ܳ۬ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 43
    new-instance v0, Ll/ۢۛܺ;

    .line 44
    sget v1, Ll/ܳ۬ܺ;->᩹:I

    .line 85
    sget-object v1, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    .line 172
    sget-object v2, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    .line 44
    invoke-direct {v0, v1, v2}, Ll/ۢۛܺ;-><init>(Ll/ܳ۬ܺ;Ljava/util/Comparator;)V

    sput-object v0, Ll/ۢۛܺ;->۫:Ll/ۢۛܺ;

    return-void
.end method

.method public constructor <init>(Ll/ܳ۬ܺ;Ljava/util/Comparator;)V
    .locals 0

    .line 49
    invoke-direct {p0, p2}, Ll/᩻۫ܺ;-><init>(Ljava/util/Comparator;)V

    .line 50
    iput-object p1, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    return-void
.end method


# virtual methods
.method public final ceiling(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x1

    .line 226
    invoke-virtual {p0, p1, v0}, Ll/ۢۛܺ;->ᩳ(Ljava/lang/Object;Z)I

    move-result p1

    .line 81
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 227
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 146
    :try_start_0
    iget-object v1, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    .line 275
    iget-object v2, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    .line 146
    invoke-static {v1, p1, v2}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_0
    return v0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 7

    .line 99
    instance-of v0, p1, Ll/ۗۤܺ;

    if-eqz v0, :cond_0

    .line 100
    check-cast p1, Ll/ۗۤܺ;

    invoke-interface {p1}, Ll/ۗۤܺ;->ۧۧ()Ljava/util/Set;

    move-result-object p1

    .line 102
    :cond_0
    iget-object v0, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    invoke-static {p1, v0}, Ll/᩶ۛܺ;->֫(Ljava/lang/Iterable;Ljava/util/Comparator;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    goto :goto_1

    .line 110
    :cond_1
    invoke-virtual {p0}, Ll/ۢۛܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v1

    .line 112
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 115
    check-cast v1, Ll/֡᩶ܺ;

    invoke-virtual {v1}, Ll/֡᩶ܺ;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_2

    return v4

    .line 119
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 120
    invoke-virtual {v1}, Ll/֡᩶ܺ;->next()Ljava/lang/Object;

    move-result-object v5

    .line 551
    :cond_3
    :goto_0
    :try_start_0
    invoke-interface {v0, v5, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    if-gez v6, :cond_5

    .line 126
    invoke-virtual {v1}, Ll/֡᩶ܺ;->hasNext()Z

    move-result v5

    if-nez v5, :cond_4

    return v4

    .line 129
    :cond_4
    invoke-virtual {v1}, Ll/֡᩶ܺ;->next()Ljava/lang/Object;

    move-result-object v5

    goto :goto_0

    :cond_5
    if-nez v6, :cond_7

    .line 131
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_6

    return v2

    .line 134
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_7
    if-lez v6, :cond_3

    :catch_0
    return v4

    .line 103
    :cond_8
    :goto_1
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic descendingIterator()Ljava/util/Iterator;
    .locals 1

    .line 40
    invoke-virtual {p0}, Ll/ۢۛܺ;->descendingIterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final descendingIterator()Ll/᩶ۨܺ;
    .locals 2

    .line 76
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/ܳ۬ܺ;->᩻()Ll/ܳ۬ܺ;

    move-result-object v0

    const/4 v1, 0x0

    .line 375
    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 164
    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 168
    :cond_1
    check-cast p1, Ljava/util/Set;

    .line 81
    iget-object v1, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    .line 169
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    .line 171
    :cond_2
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    return v0

    .line 175
    :cond_3
    iget-object v1, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    invoke-static {p1, v1}, Ll/᩶ۛܺ;->֫(Ljava/lang/Iterable;Ljava/util/Comparator;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 176
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 178
    :try_start_0
    invoke-virtual {p0}, Ll/ۢۛܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v3

    .line 179
    :cond_4
    move-object v4, v3

    check-cast v4, Ll/֡᩶ܺ;

    invoke-virtual {v4}, Ll/֡᩶ܺ;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 180
    invoke-virtual {v4}, Ll/֡᩶ܺ;->next()Ljava/lang/Object;

    move-result-object v4

    .line 181
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 551
    invoke-interface {v1, v4, v5}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_4

    :cond_5
    return v2

    :cond_6
    return v0

    :catch_0
    return v2

    .line 193
    :cond_7
    invoke-virtual {p0, p1}, Ll/ۢۛܺ;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final first()Ljava/lang/Object;
    .locals 2

    .line 198
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 201
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 199
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final floor(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    .line 220
    invoke-virtual {p0, p1, v0}, Ll/ۢۛܺ;->ܽ(Ljava/lang/Object;Z)I

    move-result p1

    sub-int/2addr p1, v0

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 221
    :cond_0
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final higher(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    .line 232
    invoke-virtual {p0, p1, v0}, Ll/ۢۛܺ;->ᩳ(Ljava/lang/Object;Z)I

    move-result p1

    .line 81
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 233
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 40
    invoke-virtual {p0}, Ll/ۢۛܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/᩶ۨܺ;
    .locals 2

    .line 70
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    const/4 v1, 0x0

    .line 375
    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 2

    .line 206
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 209
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 207
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final lower(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 214
    invoke-virtual {p0, p1, v0}, Ll/ۢۛܺ;->ܽ(Ljava/lang/Object;Z)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 215
    :cond_0
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 322
    invoke-super {p0}, Ll/᩻۫ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I[Ljava/lang/Object;)I
    .locals 1

    .line 156
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v0, p1, p2}, Ll/ܳ۬ܺ;->֫(I[Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/Object;Z)Ll/᩻۫ܺ;
    .locals 1

    const/4 v0, 0x0

    .line 238
    invoke-virtual {p0, p1, p2}, Ll/ۢۛܺ;->ܽ(Ljava/lang/Object;Z)I

    move-result p1

    invoke-virtual {p0, v0, p1}, Ll/ۢۛܺ;->ۧ(II)Ll/ۢۛܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;ZLjava/lang/Object;Z)Ll/᩻۫ܺ;
    .locals 0

    .line 253
    invoke-virtual {p0, p1, p2}, Ll/ۢۛܺ;->ۧ(Ljava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Ll/᩻۫ܺ;->֫(Ljava/lang/Object;Z)Ll/᩻۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ۢ()Ll/᩻۫ܺ;
    .locals 3

    .line 310
    iget-object v0, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    invoke-static {v0}, Ljava/util/Collections;->reverseOrder(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v0

    .line 311
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 312
    invoke-static {v0}, Ll/᩻۫ܺ;->֫(Ljava/util/Comparator;)Ll/ۢۛܺ;

    move-result-object v0

    return-object v0

    .line 313
    :cond_0
    new-instance v1, Ll/ۢۛܺ;

    iget-object v2, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v2}, Ll/ܳ۬ܺ;->᩻()Ll/ܳ۬ܺ;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ۢۛܺ;-><init>(Ll/ܳ۬ܺ;Ljava/util/Comparator;)V

    return-object v1
.end method

.method public final ۧ(II)Ll/ۢۛܺ;
    .locals 3

    .line 279
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    if-nez p1, :cond_0

    .line 81
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne p2, v1, :cond_0

    return-object p0

    .line 281
    :cond_0
    iget-object v1, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    if-ge p1, p2, :cond_1

    .line 282
    new-instance v2, Ll/ۢۛܺ;

    .line 283
    invoke-virtual {v0, p1, p2}, Ll/ܳ۬ܺ;->subList(II)Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Ll/ۢۛܺ;-><init>(Ll/ܳ۬ܺ;Ljava/util/Comparator;)V

    return-object v2

    .line 285
    :cond_1
    invoke-static {v1}, Ll/᩻۫ܺ;->֫(Ljava/util/Comparator;)Ll/ۢۛܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ll/ܳ۬ܺ;
    .locals 1

    .line 305
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/Object;Z)Ll/᩻۫ܺ;
    .locals 0

    .line 258
    invoke-virtual {p0, p1, p2}, Ll/ۢۛܺ;->ᩳ(Ljava/lang/Object;Z)I

    move-result p1

    .line 81
    iget-object p2, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    .line 258
    invoke-virtual {p0, p1, p2}, Ll/ۢۛܺ;->ۧ(II)Ll/ۢۛܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()Z
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/᩺ۗܺ;->ܳ()Z

    move-result v0

    return v0
.end method

.method public final ܽ(Ljava/lang/Object;Z)I
    .locals 2

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    iget-object v0, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    .line 242
    iget-object v1, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-static {v1, p1, v0}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    add-int/lit8 p1, p1, 0x1

    :cond_0
    return p1

    :cond_1
    not-int p1, p1

    return p1
.end method

.method public final ܽ()[Ljava/lang/Object;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/᩺ۗܺ;->ܽ()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/᩺ۗܺ;->ܿ()I

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/᩺ۗܺ;->ᩳ()I

    move-result v0

    return v0
.end method

.method public final ᩳ(Ljava/lang/Object;Z)I
    .locals 2

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    iget-object v0, p0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    .line 262
    iget-object v1, p0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-static {v1, p1, v0}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    not-int p1, p1

    return p1
.end method
