.class public final Ll/᩵ۢᩳ;
.super Ljava/lang/Object;
.source "C1Y4"


# instance fields
.field public ֫:Ljava/util/HashSet;

.field public ۧ:Ll/ܿۡᩳ;

.field public ܽ:I

.field public ܿ:Ljava/util/ArrayList;

.field public ᩳ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ll/ܿۡᩳ;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩵ۢᩳ;->ᩳ:Ljava/util/HashSet;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ۢᩳ;->ܿ:Ljava/util/ArrayList;

    .line 27
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩵ۢᩳ;->֫:Ljava/util/HashSet;

    const/4 v0, 0x0

    .line 29
    iput v0, p0, Ll/᩵ۢᩳ;->ܽ:I

    .line 32
    iput-object p1, p0, Ll/᩵ۢᩳ;->ۧ:Ll/ܿۡᩳ;

    return-void
.end method

.method private ֫(ILjava/lang/String;)V
    .locals 2

    .line 146
    iget-object v0, p0, Ll/᩵ۢᩳ;->֫:Ljava/util/HashSet;

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 148
    :cond_0
    iget-object v1, p0, Ll/᩵ۢᩳ;->ۧ:Ll/ܿۡᩳ;

    iget-object v1, v1, Ll/ܿۡᩳ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1, p2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩷ۚ;

    if-eqz v1, :cond_1

    .line 150
    invoke-direct {p0, v1, p1}, Ll/᩵ۢᩳ;->֫(Ll/֡᩷ۚ;I)V

    return-void

    .line 152
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ֫(Ll/֡᩷ۚ;I)V
    .locals 4

    .line 131
    iget-object v0, p0, Ll/᩵ۢᩳ;->֫:Ljava/util/HashSet;

    invoke-virtual {p1}, Ll/֡᩷ۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 133
    :cond_0
    invoke-virtual {p1}, Ll/֡᩷ۚ;->ۧܽ()Ll/᩻۫ܺ;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۢۚ;

    .line 134
    invoke-virtual {v1}, Ll/֨ۢۚ;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "<clinit>"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 135
    invoke-direct {p0, v1, p2}, Ll/᩵ۢᩳ;->֫(Ll/ۚܽۚ;I)V

    .line 139
    :cond_2
    invoke-virtual {p1}, Ll/֡᩷ۚ;->ۜܽ()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 141
    invoke-direct {p0, p2, p1}, Ll/᩵ۢᩳ;->֫(ILjava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private ֫(Ll/֡᩷ۚ;Ljava/lang/String;I)V
    .locals 3

    .line 102
    invoke-virtual {p1}, Ll/֡᩷ۚ;->getType()Ljava/lang/String;

    move-result-object p1

    .line 103
    iget-object v0, p0, Ll/᩵ۢᩳ;->ۧ:Ll/ܿۡᩳ;

    .line 228
    iget-object v0, v0, Ll/ܿۡᩳ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v0

    .line 103
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩷ۚ;

    .line 104
    invoke-virtual {v1}, Ll/֡᩷ۚ;->ۜܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 105
    invoke-virtual {v1}, Ll/֡᩷ۚ;->getMethods()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ۢۚ;

    const/4 v2, 0x1

    .line 106
    invoke-static {v0, v2}, Ll/ܳۜۚ;->֫(Ll/ۚܽۚ;Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 107
    invoke-direct {p0, v0, p3}, Ll/᩵ۢᩳ;->֫(Ll/ۚܽۚ;I)V

    .line 111
    :cond_2
    invoke-direct {p0, v1, p2, p3}, Ll/᩵ۢᩳ;->֫(Ll/֡᩷ۚ;Ljava/lang/String;I)V

    :cond_3
    return-void
.end method

.method private ֫(Ll/ۚܽۚ;I)V
    .locals 7

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 41
    iget-object v1, p0, Ll/᩵ۢᩳ;->ᩳ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_3

    .line 43
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    iget-object v0, p0, Ll/᩵ۢᩳ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    invoke-interface {p1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<clinit>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    iget-object v0, p0, Ll/᩵ۢᩳ;->֫:Ljava/util/HashSet;

    invoke-interface {p1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 49
    :cond_1
    iget-object v0, p0, Ll/᩵ۢᩳ;->ۧ:Ll/ܿۡᩳ;

    iget-object v0, v0, Ll/ܿۡᩳ;->ۧ:Ll/ۧۤᩴ;

    invoke-interface {p1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩷ۚ;

    if-nez v0, :cond_2

    goto/16 :goto_3

    .line 53
    :cond_2
    iget v2, p0, Ll/᩵ۢᩳ;->ܽ:I

    if-le p2, v2, :cond_3

    .line 54
    iput p2, p0, Ll/᩵ۢᩳ;->ܽ:I

    .line 57
    :cond_3
    invoke-interface {p1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 58
    invoke-direct {p0, v0, p2}, Ll/᩵ۢᩳ;->֫(Ll/֡᩷ۚ;I)V

    .line 63
    :cond_4
    invoke-virtual {v0}, Ll/֡᩷ۚ;->getMethods()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ۢۚ;

    .line 64
    invoke-virtual {v2, p1}, Ll/ᩴ۬֡;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_0

    .line 69
    :cond_5
    invoke-virtual {v2}, Ll/֨ۢۚ;->᩷ۧ()Ll/᩵֫ۚ;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_2

    .line 73
    :cond_6
    invoke-interface {v1}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺֫ۚ;

    .line 74
    invoke-interface {v4}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v5

    iget v5, v5, Ll/֨ۗ֡;->۬:I

    if-eq v5, v3, :cond_9

    const/4 v6, 0x2

    if-eq v5, v6, :cond_8

    const/4 v6, 0x3

    if-eq v5, v6, :cond_7

    goto :goto_1

    .line 164
    :cond_7
    check-cast v4, Ll/ۧۧۚ;

    invoke-interface {v4}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v4

    .line 81
    check-cast v4, Ll/ۚܽۚ;

    add-int/lit8 v5, p2, 0x1

    .line 82
    invoke-direct {p0, v4, v5}, Ll/᩵ۢᩳ;->֫(Ll/ۚܽۚ;I)V

    goto :goto_1

    .line 164
    :cond_8
    check-cast v4, Ll/ۧۧۚ;

    invoke-interface {v4}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v4

    .line 76
    check-cast v4, Ll/ᩴܽۚ;

    .line 77
    invoke-interface {v4}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, p2, 0x1

    invoke-direct {p0, v5, v4}, Ll/᩵ۢᩳ;->֫(ILjava/lang/String;)V

    goto :goto_1

    .line 164
    :cond_9
    check-cast v4, Ll/ۧۧۚ;

    invoke-interface {v4}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v4

    .line 86
    check-cast v4, Ll/᩸ܽۚ;

    .line 87
    invoke-interface {v4}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, p2, 0x1

    invoke-direct {p0, v5, v4}, Ll/᩵ۢᩳ;->֫(ILjava/lang/String;)V

    goto :goto_1

    :cond_a
    const/4 v2, 0x0

    :cond_b
    :goto_2
    if-eqz v2, :cond_d

    .line 104
    sget-object v1, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {v2}, Ll/֨ۢۚ;->ܽ()I

    move-result v4

    invoke-virtual {v1, v4}, Ll/ܺۗ֡;->֫(I)Z

    move-result v1

    if-nez v1, :cond_c

    .line 112
    sget-object v1, Ll/ܺۗ֡;->ܽ֫:Ll/ܺۗ֡;

    invoke-virtual {v2}, Ll/֨ۢۚ;->ܽ()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ܺۗ֡;->֫(I)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_4

    :cond_c
    :goto_3
    return-void

    .line 95
    :cond_d
    :goto_4
    invoke-static {p1, v3}, Ll/ܳۜۚ;->֫(Ll/ۚܽۚ;Z)Ljava/lang/String;

    move-result-object p1

    .line 96
    invoke-direct {p0, v0, p1, p2}, Ll/᩵ۢᩳ;->֫(Ll/֡᩷ۚ;Ljava/lang/String;I)V

    .line 97
    invoke-direct {p0, v0, p1, p2}, Ll/᩵ۢᩳ;->ۧ(Ll/֡᩷ۚ;Ljava/lang/String;I)V

    return-void
.end method

.method private ۧ(Ll/֡᩷ۚ;Ljava/lang/String;I)V
    .locals 3

    .line 118
    iget-object v0, p0, Ll/᩵ۢᩳ;->ۧ:Ll/ܿۡᩳ;

    iget-object v0, v0, Ll/ܿۡᩳ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {p1}, Ll/֡᩷ۚ;->ۜܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡᩷ۚ;

    if-eqz p1, :cond_2

    .line 120
    invoke-virtual {p1}, Ll/֡᩷ۚ;->getMethods()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۢۚ;

    const/4 v2, 0x1

    .line 121
    invoke-static {v1, v2}, Ll/ܳۜۚ;->֫(Ll/ۚܽۚ;Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 122
    invoke-direct {p0, v1, p3}, Ll/᩵ۢᩳ;->֫(Ll/ۚܽۚ;I)V

    .line 126
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ll/᩵ۢᩳ;->ۧ(Ll/֡᩷ۚ;Ljava/lang/String;I)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/᩵ۢᩳ;->ܿ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(Ll/֨ۢۚ;)V
    .locals 1

    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, p1, v0}, Ll/᩵ۢᩳ;->֫(Ll/ۚܽۚ;I)V

    return-void
.end method
