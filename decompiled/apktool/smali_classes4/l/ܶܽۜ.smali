.class public final Ll/ܶܽۜ;
.super Ljava/lang/Object;
.source "G7AI"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۖ:Ljava/util/ArrayList;

.field public final ۘ:Ljava/util/LinkedHashSet;

.field public final ۜ:Ljava/util/HashMap;

.field public final ۡ:I

.field public ۢ:I

.field public final ۧ:Ll/ᩴܽۜ;

.field public final ܳ:Ljava/lang/String;

.field public final ܺ:I

.field public ܽ:Ll/۬ܽۜ;

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩴ:Ljava/util/HashSet;

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ᩴܽۜ;ILjava/lang/String;IIIIILjava/util/HashSet;)V
    .locals 1

    .line 1816
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1803
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܶܽۜ;->ۜ:Ljava/util/HashMap;

    .line 1804
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ܶܽۜ;->ۘ:Ljava/util/LinkedHashSet;

    .line 1805
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶܽۜ;->֫:Ljava/util/ArrayList;

    .line 1806
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶܽۜ;->ۖ:Ljava/util/ArrayList;

    .line 1817
    iput-object p1, p0, Ll/ܶܽۜ;->ۧ:Ll/ᩴܽۜ;

    .line 1818
    iput p2, p0, Ll/ܶܽۜ;->᩷:I

    .line 1819
    iput-object p3, p0, Ll/ܶܽۜ;->ܳ:Ljava/lang/String;

    .line 1821
    iput p4, p0, Ll/ܶܽۜ;->ۡ:I

    .line 1822
    iput p5, p0, Ll/ܶܽۜ;->ܺ:I

    .line 1823
    iput p6, p0, Ll/ܶܽۜ;->ܿ:I

    .line 1824
    iput p7, p0, Ll/ܶܽۜ;->ᩳ:I

    .line 1825
    iput p8, p0, Ll/ܶܽۜ;->᩻:I

    .line 1826
    iput-object p9, p0, Ll/ܶܽۜ;->ᩴ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 2

    .line 1876
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܶܽۜ;->ۘ:Ljava/util/LinkedHashSet;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1877
    new-instance v1, Ll/۠ܽۜ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public final ۧ()V
    .locals 13

    .line 1854
    new-instance v0, Ll/֨ܽۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Ll/ܶܽۜ;->֫:Ljava/util/ArrayList;

    invoke-static {v1, v0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1856
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Ll/ܶܽۜ;->ۢ:I

    const/4 v0, 0x0

    .line 1857
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Ll/ܶܽۜ;->ۖ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget v4, p0, Ll/ܶܽۜ;->ۡ:I

    if-ge v3, v4, :cond_0

    .line 1858
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚܽۜ;

    .line 1859
    iget-object v5, v3, Ll/ۚܽۜ;->֫:Ll/ۜ᩻ܽ;

    iget-object v6, v3, Ll/ۚܽۜ;->ۧ:Ll/᩷᩻ܽ;

    iget-object v11, p0, Ll/ܶܽۜ;->ᩴ:Ljava/util/HashSet;

    iget-object v12, p0, Ll/ܶܽۜ;->ۜ:Ljava/util/HashMap;

    iget-object v4, p0, Ll/ܶܽۜ;->ۧ:Ll/ᩴܽۜ;

    iget v7, p0, Ll/ܶܽۜ;->ܺ:I

    iget v8, p0, Ll/ܶܽۜ;->ܿ:I

    iget v9, p0, Ll/ܶܽۜ;->ᩳ:I

    iget v10, p0, Ll/ܶܽۜ;->᩻:I

    invoke-static/range {v4 .. v12}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;IIIILjava/util/Set;Ljava/util/HashMap;)Ll/ۧᩳۜ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
