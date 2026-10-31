.class public final Ll/֨ۛ᩷;
.super Ljava/lang/Object;
.source "T4ZG"


# instance fields
.field public final ֫:Ljava/util/HashSet;

.field public ۧ:I

.field public final ܽ:Ljava/util/HashMap;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/֨ۛ᩷;->֫:Ljava/util/HashSet;

    .line 20
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֨ۛ᩷;->ܽ:Ljava/util/HashMap;

    .line 26
    iput-object p1, p0, Ll/֨ۛ᩷;->ܿ:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Ll/֨ۛ᩷;->ᩳ:Ljava/lang/String;

    .line 28
    invoke-direct {p0, p3}, Ll/֨ۛ᩷;->֫(Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 4

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/֨ۛ᩷;->֫:Ljava/util/HashSet;

    .line 20
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֨ۛ᩷;->ܽ:Ljava/util/HashMap;

    .line 32
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۛ᩷;->ܿ:Ljava/lang/String;

    .line 33
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۛ᩷;->ᩳ:Ljava/lang/String;

    .line 34
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 35
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 37
    new-instance v3, Ll/ۚۛ᩷;

    invoke-direct {v3, p1}, Ll/ۚۛ᩷;-><init>(Ll/۬ۜܽ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 39
    :cond_0
    invoke-direct {p0, v1}, Ll/֨ۛ᩷;->֫(Ljava/util/List;)V

    return-void
.end method

.method private ֫(Ljava/util/List;)V
    .locals 4

    .line 44
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۛ᩷;

    .line 45
    iget-object v2, v1, Ll/ۚۛ᩷;->֫:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 48
    :cond_0
    iget-object v2, v1, Ll/ۚۛ᩷;->֫:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, v0

    move v0, v2

    .line 49
    :goto_1
    iget-object v2, p0, Ll/֨ۛ᩷;->ܽ:Ljava/util/HashMap;

    iget-object v3, v1, Ll/ۚۛ᩷;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 51
    :cond_1
    iput v0, p0, Ll/֨ۛ᩷;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/Runnable;)I
    .locals 5

    .line 103
    iget-object v0, p0, Ll/֨ۛ᩷;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 104
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 106
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ll/ܳۛۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    if-nez v2, :cond_1

    .line 108
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 110
    :cond_1
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚۛ᩷;

    .line 126
    iget-object v4, v3, Ll/ۚۛ᩷;->֫:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    .line 129
    :cond_2
    iget-object v3, v3, Ll/ۚۛ᩷;->֫:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    if-nez v2, :cond_4

    return v1

    .line 117
    :cond_4
    iget p2, p0, Ll/֨ۛ᩷;->ۧ:I

    sub-int/2addr p2, v2

    iput p2, p0, Ll/֨ۛ᩷;->ۧ:I

    .line 118
    new-instance p2, Ll/֡ۛ᩷;

    const/4 v0, 0x0

    invoke-direct {p2, v0, p1}, Ll/֡ۛ᩷;-><init>(ILjava/lang/Object;)V

    iget-object p1, p0, Ll/֨ۛ᩷;->֫:Ljava/util/HashSet;

    invoke-static {p1, p2}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return v2
.end method

.method public final ֫()Ljava/util/Set;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/֨ۛ᩷;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۚۛ᩷;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/֨ۛ᩷;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚۛ᩷;

    return-object p1
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 4

    .line 55
    iget-object v0, p0, Ll/֨ۛ᩷;->ܿ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 56
    iget-object v0, p0, Ll/֨ۛ᩷;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 57
    iget-object v0, p0, Ll/֨ۛ᩷;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    .line 58
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 59
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۛ᩷;

    .line 151
    iget-object v2, v1, Ll/ۚۛ᩷;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 152
    iget-object v1, v1, Ll/ۚۛ᩷;->֫:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 153
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵ۛ᩷;

    .line 122
    iget v3, v2, Ll/᩵ۛ᩷;->ۨ:I

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 123
    iget v3, v2, Ll/᩵ۛ᩷;->ۗ:I

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 124
    iget v3, v2, Ll/᩵ۛ᩷;->ۙ:I

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 125
    iget v3, v2, Ll/᩵ۛ᩷;->᩸:I

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 126
    iget v3, v2, Ll/᩵ۛ᩷;->᩹:I

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 127
    iget-object v3, v2, Ll/᩵ۛ᩷;->۬:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 128
    iget-object v3, v2, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 129
    iget-object v3, v2, Ll/᩵ۛ᩷;->ۤ:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 130
    iget-object v2, v2, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 73
    iget v0, p0, Ll/֨ۛ᩷;->ۧ:I

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 88
    iget-object v0, p0, Ll/֨ۛ᩷;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚۛ᩷;

    if-nez v0, :cond_0

    return-void

    .line 89
    :cond_0
    iget-object v0, v0, Ll/ۚۛ᩷;->֫:Ljava/util/List;

    .line 126
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    .line 129
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 93
    :goto_0
    iget v1, p0, Ll/֨ۛ᩷;->ۧ:I

    sub-int/2addr v1, v0

    iput v1, p0, Ll/֨ۛ᩷;->ۧ:I

    .line 94
    iget-object v0, p0, Ll/֨ۛ᩷;->֫:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/֨ۛ᩷;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/֨ۛ᩷;->ܿ:Ljava/lang/String;

    return-object v0
.end method
