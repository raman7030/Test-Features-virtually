.class public final Ll/ܿ᩹;
.super Ljava/lang/Object;
.source "C5QQ"


# instance fields
.field public final ֫:Ll/ۗ᩵;

.field public final ۧ:Ll/ۨۤ;

.field public final ܽ:Ljava/util/ArrayList;

.field public final ᩳ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ll/ۨۤ;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ll/ۨۤ;-><init>(I)V

    iput-object v0, p0, Ll/ܿ᩹;->ۧ:Ll/ۨۤ;

    .line 41
    new-instance v0, Ll/ۗ᩵;

    invoke-direct {v0}, Ll/ۗ᩵;-><init>()V

    iput-object v0, p0, Ll/ܿ᩹;->֫:Ll/ۗ᩵;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿ᩹;->ܽ:Ljava/util/ArrayList;

    .line 44
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܿ᩹;->ᩳ:Ljava/util/HashSet;

    return-void
.end method

.method private ֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 4

    .line 174
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 178
    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 182
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 184
    iget-object v0, p0, Ll/ܿ᩹;->֫:Ll/ۗ᩵;

    const/4 v1, 0x0

    .line 369
    invoke-virtual {v0, p1, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 184
    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 186
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 187
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, v3, p2, p3}, Ll/ܿ᩹;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 191
    :cond_1
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 193
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 179
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "This graph contains cyclic dependencies"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 143
    iget-object v0, p0, Ll/ܿ᩹;->֫:Ll/ۗ᩵;

    invoke-virtual {v0}, Ll/ۗ᩵;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 144
    invoke-virtual {v0, v2}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-eqz v3, :cond_0

    .line 213
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 214
    iget-object v4, p0, Ll/ܿ᩹;->ۧ:Ll/ۨۤ;

    invoke-virtual {v4, v3}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 149
    :cond_1
    invoke-virtual {v0}, Ll/ۗ᩵;->clear()V

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 2

    .line 54
    iget-object v0, p0, Ll/ܿ᩹;->֫:Ll/ۗ᩵;

    invoke-virtual {v0, p1}, Ll/ۗ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 55
    invoke-virtual {v0, p1, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    .line 76
    iget-object v0, p0, Ll/ܿ᩹;->֫:Ll/ۗ᩵;

    invoke-virtual {v0, p1}, Ll/ۗ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0, p2}, Ll/ۗ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    .line 369
    invoke-virtual {v0, p1, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 81
    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_1

    .line 205
    iget-object v1, p0, Ll/ܿ᩹;->ۧ:Ll/ۨۤ;

    invoke-virtual {v1}, Ll/ۨۤ;->֫()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 207
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 85
    :cond_0
    invoke-virtual {v0, p1, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    :cond_1
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 77
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "All nodes must be present in the graph before being added as an edge"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Ljava/util/ArrayList;
    .locals 6

    .line 162
    iget-object v0, p0, Ll/ܿ᩹;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 163
    iget-object v1, p0, Ll/ܿ᩹;->ᩳ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 166
    iget-object v2, p0, Ll/ܿ᩹;->֫:Ll/ۗ᩵;

    invoke-virtual {v2}, Ll/ۗ᩵;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 167
    invoke-virtual {v2, v4}, Ll/ۗ᩵;->ܽ(I)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {p0, v5, v0, v1}, Ll/ܿ᩹;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ۧ(Landroid/view/View;)Z
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ܿ᩹;->֫:Ll/ۗ᩵;

    invoke-virtual {v0, p1}, Ll/ۗ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ܽ(Landroid/view/View;)Ljava/util/List;
    .locals 2

    .line 98
    iget-object v0, p0, Ll/ܿ᩹;->֫:Ll/ۗ᩵;

    const/4 v1, 0x0

    .line 369
    invoke-virtual {v0, p1, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 98
    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final ܿ(Landroid/view/View;)Z
    .locals 5

    .line 130
    iget-object v0, p0, Ll/ܿ᩹;->֫:Ll/ۗ᩵;

    invoke-virtual {v0}, Ll/ۗ᩵;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 131
    invoke-virtual {v0, v3}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-eqz v4, :cond_0

    .line 132
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final ᩳ(Landroid/view/View;)Ljava/util/ArrayList;
    .locals 5

    .line 110
    iget-object v0, p0, Ll/ܿ᩹;->֫:Ll/ۗ᩵;

    invoke-virtual {v0}, Ll/ۗ᩵;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 111
    invoke-virtual {v0, v3}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-eqz v4, :cond_1

    .line 112
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    if-nez v2, :cond_0

    .line 114
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 116
    :cond_0
    invoke-virtual {v0, v3}, Ll/ۗ᩵;->ܽ(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method
