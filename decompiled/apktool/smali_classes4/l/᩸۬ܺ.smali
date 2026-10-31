.class public final Ll/᩸۬ܺ;
.super Ljava/lang/Object;
.source "V5XH"


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩸۬ܺ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩶۬ܺ;
    .locals 7

    .line 154
    sget v0, Ll/ܰۤܺ;->᩶:I

    .line 129
    sget-object v0, Ll/᩺ۤܺ;->᩸:Ll/ۤۤܺ;

    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    sget-object v1, Ll/᩻ۤܺ;->᩹:Ll/᩻ۤܺ;

    .line 460
    new-instance v2, Ll/ᩴۙܺ;

    invoke-direct {v2, v1, v0}, Ll/ᩴۙܺ;-><init>(Ll/ܽܶܺ;Ll/ۤۤܺ;)V

    .line 154
    iget-object v0, p0, Ll/᩸۬ܺ;->֫:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 155
    new-instance v1, Ll/֫۬ܺ;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 776
    invoke-direct {v1, v2}, Ll/ۛۗܺ;-><init>(I)V

    .line 156
    new-instance v2, Ll/֫۬ܺ;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 776
    invoke-direct {v2, v3}, Ll/ۛۗܺ;-><init>(I)V

    const/4 v3, 0x0

    .line 157
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 158
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۤܺ;

    if-lez v3, :cond_1

    add-int/lit8 v5, v3, -0x1

    .line 160
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۤܺ;

    .line 161
    invoke-virtual {v4, v5}, Ll/ܰۤܺ;->ܽ(Ll/ܰۤܺ;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v4, v5}, Ll/ܰۤܺ;->ۧ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܰۤܺ;->֫()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    .line 162
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Overlapping ranges: range "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " overlaps with entry "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 789
    :cond_1
    :goto_1
    invoke-virtual {v1, v4}, Ll/ۛۗܺ;->֫(Ljava/lang/Object;)V

    .line 167
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 789
    invoke-virtual {v2, v4}, Ll/ۛۗܺ;->֫(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 169
    :cond_2
    new-instance v0, Ll/᩶۬ܺ;

    invoke-virtual {v1}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-virtual {v2}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/᩶۬ܺ;-><init>(Ll/ܳ۬ܺ;Ll/ܳ۬ܺ;)V

    return-object v0
.end method

.method public final ֫(Ll/ܰۤܺ;Ljava/lang/Object;)V
    .locals 2

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    invoke-virtual {p1}, Ll/ܰۤܺ;->֫()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Range must not be empty, but was %s"

    invoke-static {p1, v1, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 1442
    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v0, p1, p2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    iget-object p1, p0, Ll/᩸۬ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
