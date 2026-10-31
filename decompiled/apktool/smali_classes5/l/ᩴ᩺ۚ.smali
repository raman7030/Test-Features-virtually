.class public final Ll/ᩴ᩺ۚ;
.super Ljava/lang/Object;
.source "B7FA"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public final ᩸:Ljava/util/ArrayList;

.field public final ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/function/Function;Ljava/util/function/Function;)V
    .locals 1

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩺ۚ;->᩸:Ljava/util/ArrayList;

    .line 152
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩺ۚ;->᩹:Ljava/util/ArrayList;

    .line 157
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ۖ᩺ۚ;

    invoke-direct {v0, p0, p3, p2}, Ll/ۖ᩺ۚ;-><init>(Ll/ᩴ᩺ۚ;Ljava/util/function/Function;Ljava/util/function/Function;)V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ᩴ᩺ۚ;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/Map$Entry;)V
    .locals 3

    .line 160
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 161
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    new-instance v2, Ll/ۘ᩺ۚ;

    invoke-direct {v2, v0, p1}, Ll/ۘ᩺ۚ;-><init>(Ljava/util/ArrayList;Ljava/util/function/Function;)V

    invoke-static {v1, v2}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 162
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ᩳ֨;

    invoke-virtual {p1}, Ll/᩹ᩳ֨;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 163
    iget-object p0, p0, Ll/ᩴ᩺ۚ;->᩸:Ljava/util/ArrayList;

    new-instance p1, Ll/᩵ۗۚ;

    .line 164
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ᩳ֨;

    invoke-interface {p2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺۤۚ;

    .line 165
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֨ᩳ֨;

    invoke-virtual {p3}, Ll/֨ᩳ֨;->᩻()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3, v0}, Ll/᩵ۗۚ;-><init>(Ll/ܺۤۚ;Ljava/lang/Integer;Ljava/lang/Object;)V

    .line 163
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 168
    :cond_0
    iget-object p0, p0, Ll/ᩴ᩺ۚ;->᩹:Ljava/util/ArrayList;

    new-instance p1, Ll/ۜۗۚ;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩹ᩳ֨;

    invoke-interface {p2, p3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺۤۚ;

    invoke-direct {p1, p2, v0}, Ll/ۜۗۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 4

    .line 199
    iget-object v0, p0, Ll/ᩴ᩺ۚ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 201
    iget-object v0, p0, Ll/ᩴ᩺ۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x6

    add-int/lit8 v1, v1, 0x2

    .line 203
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ۢ᩺ۚ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ۡ᩺ۚ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v2}, Ll/ۧ᩺ᩴ;->filter(Ljava/util/function/IntPredicate;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۧ᩺ᩴ;->sum()I

    move-result v0

    goto :goto_0

    .line 206
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x4

    add-int/lit8 v1, v1, 0x2

    .line 208
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ۛ֨ۢ;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ll/ۛ֨ۢ;-><init>(I)V

    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ܺ᩺ۚ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v2}, Ll/ۧ᩺ᩴ;->filter(Ljava/util/function/IntPredicate;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۧ᩺ᩴ;->sum()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 4

    .line 177
    iget-object v0, p0, Ll/ᩴ᩺ۚ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 178
    iget-object v0, p0, Ll/ᩴ᩺ۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 179
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵ۗۚ;

    .line 180
    iget-object v2, v1, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    iget-object v3, v1, Ll/᩵ۗۚ;->᩶:Ljava/lang/Object;

    check-cast v2, Ll/ܺۤۚ;

    iget v2, v2, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 181
    iget-object v1, v1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 182
    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 183
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۤۚ;

    .line 184
    iget v2, v2, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_0

    .line 187
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 188
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۗۚ;

    .line 189
    iget-object v2, v1, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ܺۤۚ;

    iget v2, v2, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 190
    iget-object v2, v1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 191
    iget-object v1, v1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۤۚ;

    .line 192
    iget v2, v2, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
