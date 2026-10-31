.class public final Ll/᩶᩷ۚ;
.super Ll/ܽ᩷ۚ;
.source "H5GB"

# interfaces
.implements Ll/ۙۜۚ;


# static fields
.field public static final ܿ:Ll/ܽܶܺ;

.field public static final ᩳ:Ll/ᩴܶܺ;


# instance fields
.field public final ۧ:Ll/ۧۤᩴ;

.field public ܽ:Ll/ܳ۬ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 102
    new-instance v0, Ll/ۚ᩷ۚ;

    .line 103
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 102
    sput-object v0, Ll/᩶᩷ۚ;->ᩳ:Ll/ᩴܶܺ;

    .line 109
    new-instance v0, Ll/֨᩷ۚ;

    .line 110
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 109
    sput-object v0, Ll/᩶᩷ۚ;->ܿ:Ll/ܽܶܺ;

    return-void
.end method

.method public constructor <init>(Ll/᩵ۡۚ;)V
    .locals 0

    .line 122
    invoke-direct {p0, p1}, Ll/ܽ᩷ۚ;-><init>(Ll/᩵ۡۚ;)V

    .line 368
    new-instance p1, Ll/ۧۤᩴ;

    invoke-direct {p1}, Ll/ۧۤᩴ;-><init>()V

    .line 118
    iput-object p1, p0, Ll/᩶᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    const/4 p1, 0x0

    .line 119
    iput-object p1, p0, Ll/᩶᩷ۚ;->ܽ:Ll/ܳ۬ܺ;

    return-void
.end method

.method public static bridge synthetic ܿ()Ll/ܽܶܺ;
    .locals 1

    .line 0
    sget-object v0, Ll/᩶᩷ۚ;->ܿ:Ll/ܽܶܺ;

    return-object v0
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 513
    iget-object v0, p0, Ll/᩶᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->size()I

    move-result v0

    return v0
.end method

.method public final ֡(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 103
    iget-object p1, p1, Ll/֨ۢۚ;->ۤ:Ljava/util/List;

    .line 298
    sget-object v0, Ll/᩶᩷ۚ;->ᩳ:Ll/ᩴܶܺ;

    invoke-static {p1, v0}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ll/ᩴܶܺ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 301
    new-instance v0, Ll/ܶ᩷ۚ;

    invoke-direct {v0, p1}, Ll/ܶ᩷ۚ;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֨(Ljava/lang/Object;)I
    .locals 0

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 134
    iget-object p1, p1, Ll/֨ۢۚ;->۬:Ll/᩵֫ۚ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 346
    :cond_0
    invoke-interface {p1}, Ll/᩵֫ۚ;->᩻()I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/Comparable;)I
    .locals 0

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 181
    iget p1, p1, Ll/֡᩷ۚ;->᩸:I

    return p1
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 2

    .line 496
    new-instance v0, Ll/᩹᩷ۚ;

    iget-object v1, p0, Ll/᩶᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۢۚ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/CharSequence;)Ljava/util/Map$Entry;
    .locals 1

    .line 81
    check-cast p1, Ll/᩻ۡۚ;

    if-nez p1, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    iget-object p1, p1, Ll/᩻ۡۚ;->᩹:Ll/۟ۢۚ;

    iget-object p1, p1, Ll/۟ۢۚ;->᩹:Ljava/lang/String;

    .line 150
    iget-object v0, p0, Ll/᩶᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡᩷ۚ;

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 155
    :cond_1
    new-instance v0, Ll/۠᩷ۚ;

    invoke-direct {v0, p1}, Ll/۠᩷ۚ;-><init>(Ll/֡᩷ۚ;)V

    return-object v0
.end method

.method public final ֫(ILjava/lang/Comparable;)V
    .locals 0

    .line 81
    check-cast p2, Ll/֡᩷ۚ;

    .line 387
    iput p1, p2, Ll/֡᩷ۚ;->᩹:I

    return-void
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 0

    .line 81
    check-cast p2, Ll/֨ۢۚ;

    .line 397
    iput p1, p2, Ll/֨ۢۚ;->᩹:I

    return-void
.end method

.method public final ֫(Ll/֡᩷ۚ;)V
    .locals 3

    .line 127
    iget-object v0, p0, Ll/᩶᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {p1}, Ll/֡᩷ۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩷ۚ;

    if-nez v0, :cond_0

    return-void

    .line 129
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-virtual {p1}, Ll/֡᩷ۚ;->getType()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f12030a

    invoke-static {p1, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 46
    invoke-direct {v0, v2, p1, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    throw v0
.end method

.method public final ۖ(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 134
    iget-object p1, p1, Ll/֨ۢۚ;->۬:Ll/᩵֫ۚ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 356
    :cond_0
    invoke-interface {p1}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method public final ۖ(Ljava/lang/Comparable;)Ll/᩻ۡۚ;
    .locals 0

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 187
    iget-object p1, p1, Ll/֡᩷ۚ;->᩺:Ll/᩻ۡۚ;

    return-object p1
.end method

.method public final ۘ(Ljava/lang/Object;)I
    .locals 0

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 251
    iget p1, p1, Ll/֨ۢۚ;->᩸:I

    return p1
.end method

.method public final ۘ(Ljava/lang/Comparable;)Ll/᩻ۡۚ;
    .locals 0

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 176
    iget-object p1, p1, Ll/֡᩷ۚ;->ܰ:Ll/᩻ۡۚ;

    return-object p1
.end method

.method public final ۚ(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 1

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 103
    iget-object p1, p1, Ll/֨ۢۚ;->ۤ:Ljava/util/List;

    .line 331
    new-instance v0, Ll/᩸᩷ۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ll/ܽܶܺ;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method public final ۜ(Ljava/lang/Object;)I
    .locals 0

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 412
    iget p1, p1, Ll/֨ۢۚ;->ۙ:I

    return p1
.end method

.method public final ۜ(Ljava/lang/Comparable;)Ljava/util/Collection;
    .locals 1

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 241
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    new-instance v0, Ll/᩵᩷ۚ;

    invoke-direct {v0, p1}, Ll/᩵᩷ۚ;-><init>(Ll/֡᩷ۚ;)V

    return-object v0
.end method

.method public final ۠(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 134
    iget-object p1, p1, Ll/֨ۢۚ;->۬:Ll/᩵֫ۚ;

    if-nez p1, :cond_0

    .line 364
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1

    .line 366
    :cond_0
    invoke-interface {p1}, Ll/᩵֫ۚ;->ۜ()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ۡ(Ljava/lang/Object;)Ll/ۜ᩷ۚ;
    .locals 1

    .line 81
    check-cast p1, Ll/ܺۢۚ;

    .line 278
    iget-object v0, p1, Ll/ܺۢۚ;->᩹:Ll/ۜ᩷ۚ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 281
    :cond_0
    iget-object p1, p1, Ll/ܺۢۚ;->᩹:Ll/ۜ᩷ۚ;

    return-object p1
.end method

.method public final ۡ(Ljava/lang/Comparable;)Ll/۟ۢۚ;
    .locals 0

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 199
    iget-object p1, p1, Ll/֡᩷ۚ;->ۤ:Ll/۟ۢۚ;

    return-object p1
.end method

.method public final ۢ(Ljava/lang/Object;)I
    .locals 0

    .line 81
    check-cast p1, Ll/ܺۢۚ;

    .line 246
    iget p1, p1, Ll/ܺۢۚ;->᩸:I

    return p1
.end method

.method public final ۢ(Ljava/lang/Comparable;)Ll/᩻۫ܺ;
    .locals 0

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 166
    iget-object p1, p1, Ll/֡᩷ۚ;->۟:Ll/᩻۫ܺ;

    return-object p1
.end method

.method public final ۧ(Ljava/lang/Comparable;)I
    .locals 0

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 392
    iget p1, p1, Ll/֡᩷ۚ;->᩹:I

    return p1
.end method

.method public final ۧ(ILjava/lang/Object;)V
    .locals 0

    .line 81
    check-cast p2, Ll/֨ۢۚ;

    .line 407
    iput p1, p2, Ll/֨ۢۚ;->ۙ:I

    return-void
.end method

.method public final ܳ(Ljava/lang/Comparable;)Ljava/util/Collection;
    .locals 1

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 223
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    new-instance v0, Ll/ᩴ᩷ۚ;

    invoke-direct {v0, p1}, Ll/ᩴ᩷ۚ;-><init>(Ll/֡᩷ۚ;)V

    return-object v0
.end method

.method public final ܶ(Ljava/lang/Object;)Ll/֨۫֡;
    .locals 1

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 134
    iget-object p1, p1, Ll/֨ۢۚ;->۬:Ll/᩵֫ۚ;

    .line 379
    instance-of v0, p1, Ll/֨۫֡;

    if-eqz v0, :cond_0

    .line 380
    check-cast p1, Ll/֨۫֡;

    return-object p1

    .line 382
    :cond_0
    new-instance v0, Ll/֨۫֡;

    invoke-direct {v0, p1}, Ll/֨۫֡;-><init>(Ll/᩵֫ۚ;)V

    return-object v0
.end method

.method public final ܺ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    .line 81
    check-cast p1, Ll/ܺۢۚ;

    .line 105
    iget-object p1, p1, Ll/ܺۢۚ;->ۙ:Ljava/util/Set;

    return-object p1
.end method

.method public final ܺ(Ljava/lang/Comparable;)Ll/۫᩷ۚ;
    .locals 0

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 205
    iget-object p1, p1, Ll/֡᩷ۚ;->ۨ:Ll/۫᩷ۚ;

    return-object p1
.end method

.method public final ܽ(Ljava/lang/Comparable;)Ll/ۜ᩷ۚ;
    .locals 1

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 269
    iget-object v0, p1, Ll/֡᩷ۚ;->᩶:Ll/ۜ᩷ۚ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 272
    :cond_0
    iget-object p1, p1, Ll/֡᩷ۚ;->᩶:Ll/ۜ᩷ۚ;

    return-object p1
.end method

.method public final ܽ()Ll/ۧۤᩴ;
    .locals 1

    .line 518
    iget-object v0, p0, Ll/᩶᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    return-object v0
.end method

.method public final ܿ(Ljava/lang/Comparable;)Ll/᩻۫ܺ;
    .locals 0

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 160
    iget-object p1, p1, Ll/֡᩷ۚ;->ۗ:Ll/᩻۫ܺ;

    return-object p1
.end method

.method public final ᩳ(Ljava/lang/Comparable;)Ll/֫ۡۚ;
    .locals 0

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 193
    iget-object p1, p1, Ll/֡᩷ۚ;->۫:Ll/֫ۡۚ;

    return-object p1
.end method

.method public final ᩳ()Ll/ܳ۬ܺ;
    .locals 2

    .line 137
    iget-object v0, p0, Ll/᩶᩷ۚ;->ܽ:Ll/ܳ۬ܺ;

    if-nez v0, :cond_0

    .line 138
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v0

    iget-object v1, p0, Ll/᩶᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 886
    invoke-static {v0, v1}, Ll/ܳ۬ܺ;->֫(Ljava/util/Comparator;Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v0

    .line 138
    iput-object v0, p0, Ll/᩶᩷ۚ;->ܽ:Ll/ܳ۬ܺ;

    .line 140
    :cond_0
    iget-object v0, p0, Ll/᩶᩷ۚ;->ܽ:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ᩴ(Ljava/lang/Object;)Ll/ۜ᩷ۚ;
    .locals 1

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 287
    iget-object v0, p1, Ll/֨ۢۚ;->᩶:Ll/ۜ᩷ۚ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 290
    :cond_0
    iget-object p1, p1, Ll/֨ۢۚ;->᩶:Ll/ۜ᩷ۚ;

    return-object p1
.end method

.method public final ᩵(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 128
    iget-object p1, p1, Ll/֨ۢۚ;->ۗ:Ljava/util/Set;

    return-object p1
.end method

.method public final ᩷(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 134
    iget-object p1, p1, Ll/֨ۢۚ;->۬:Ll/᩵֫ۚ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 325
    :cond_0
    invoke-interface {p1}, Ll/᩵֫ۚ;->ۢ()Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(Ljava/lang/Comparable;)Ljava/util/SortedSet;
    .locals 0

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 148
    iget-object p1, p1, Ll/֡᩷ۚ;->ۛ:Ljava/util/SortedSet;

    return-object p1
.end method

.method public final ᩻(Ljava/lang/Object;)I
    .locals 0

    .line 81
    check-cast p1, Ll/֨ۢۚ;

    .line 402
    iget p1, p1, Ll/֨ۢۚ;->᩹:I

    return p1
.end method

.method public final ᩻(Ljava/lang/Comparable;)Ljava/util/SortedSet;
    .locals 0

    .line 81
    check-cast p1, Ll/֡᩷ۚ;

    .line 154
    iget-object p1, p1, Ll/֡᩷ۚ;->۬:Ljava/util/SortedSet;

    return-object p1
.end method
