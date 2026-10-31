.class public final Ll/᩹ۚ;
.super Ljava/lang/Object;
.source "L1CU"


# instance fields
.field public ֫:Ll/ۘ᩸;

.field public ۧ:I

.field public ܳ:I

.field public ܽ:Ll/᩸۠;

.field public ܿ:Ll/ۘ᩸;

.field public ᩳ:Ll/᩸۠;

.field public final synthetic ᩻:Ll/ۤۚ;


# direct methods
.method public constructor <init>(Ll/ۤۚ;)V
    .locals 0

    .line 1994
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۚ;->᩻:Ll/ۤۚ;

    .line 1995
    new-instance p1, Ll/᩸۠;

    invoke-direct {p1}, Ll/᩸۠;-><init>()V

    iput-object p1, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    .line 1996
    new-instance p1, Ll/᩸۠;

    invoke-direct {p1}, Ll/᩸۠;-><init>()V

    iput-object p1, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    const/4 p1, 0x0

    .line 1997
    iput-object p1, p0, Ll/᩹ۚ;->ܿ:Ll/ۘ᩸;

    .line 1998
    iput-object p1, p0, Ll/᩹ۚ;->֫:Ll/ۘ᩸;

    return-void
.end method

.method public static ֫(Ll/᩸۠;Landroid/view/View;)Ll/ܶ۠;
    .locals 4

    .line 2143
    invoke-virtual {p0}, Ll/ܶ۠;->ܿ()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return-object p0

    .line 108
    :cond_0
    iget-object p0, p0, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    .line 2147
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 2149
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ۠;

    .line 2150
    invoke-virtual {v2}, Ll/ܶ۠;->ܿ()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p1, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private ֫(Ll/᩸۠;Ll/ۘ᩸;)V
    .locals 8

    .line 2087
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 2088
    new-instance v1, Ll/ᩴ᩸;

    invoke-direct {v1}, Ll/ᩴ᩸;-><init>()V

    .line 2090
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    const/4 v2, 0x0

    .line 2091
    invoke-virtual {v0, v2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 2092
    iget-object v2, p0, Ll/᩹ۚ;->᩻:Ll/ۤۚ;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {v0, v3, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 108
    iget-object v3, p1, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    .line 2095
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ۠;

    .line 2096
    invoke-virtual {v4}, Ll/ܶ۠;->ܿ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    .line 2097
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    .line 108
    :cond_0
    iget-object v3, p1, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    .line 2100
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ۠;

    .line 2101
    invoke-virtual {v4}, Ll/ܶ۠;->ܿ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    .line 2102
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {p2, v6, v1}, Ll/ۘ᩸;->֫(ILl/ᩴ᩸;)V

    .line 2104
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {p2, v6}, Ll/ۘ᩸;->ܳ(I)I

    move-result v6

    invoke-virtual {v4, v6}, Ll/ܶ۠;->᩵(I)V

    .line 2105
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {p2, v6}, Ll/ۘ᩸;->ۧ(I)I

    move-result v6

    invoke-virtual {v4, v6}, Ll/ܶ۠;->ۜ(I)V

    .line 2106
    instance-of v6, v5, Ll/۟ܶ;

    if-eqz v6, :cond_1

    .line 2107
    move-object v6, v5

    check-cast v6, Ll/۟ܶ;

    invoke-virtual {p2, v6, v4, v1, v0}, Ll/ۘ᩸;->֫(Ll/۟ܶ;Ll/ܶ۠;Ll/ᩴ᩸;Landroid/util/SparseArray;)V

    .line 2108
    instance-of v6, v5, Ll/ۛܶ;

    if-eqz v6, :cond_1

    .line 2109
    move-object v6, v5

    check-cast v6, Ll/ۛܶ;

    invoke-virtual {v6}, Ll/۟ܶ;->ܽ()V

    .line 2120
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    move-result v6

    invoke-virtual {v1, v6}, Ll/ܽ᩸;->resolveLayoutDirection(I)V

    .line 2124
    invoke-static {v2, v5, v4, v1, v0}, Ll/ۤۚ;->֫(Ll/ۤۚ;Landroid/view/View;Ll/ܶ۠;Ll/ᩴ᩸;Landroid/util/SparseArray;)V

    .line 2125
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {p2, v6}, Ll/ۘ᩸;->ܿ(I)I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_2

    .line 2126
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v5

    invoke-virtual {v4, v5}, Ll/ܶ۠;->ᩴ(I)V

    goto :goto_1

    .line 2128
    :cond_2
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {p2, v5}, Ll/ۘ᩸;->ᩳ(I)I

    move-result v5

    invoke-virtual {v4, v5}, Ll/ܶ۠;->ᩴ(I)V

    goto :goto_1

    .line 108
    :cond_3
    iget-object p1, p1, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    .line 2131
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܶ۠;

    .line 2132
    instance-of v1, p2, Ll/ۤ۠;

    if-eqz v1, :cond_4

    .line 2133
    invoke-virtual {p2}, Ll/ܶ۠;->ܿ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ܶ;

    .line 2134
    check-cast p2, Ll/۬۠;

    .line 2135
    invoke-virtual {v1, p2, v0}, Ll/۟ܶ;->֫(Ll/۬۠;Landroid/util/SparseArray;)V

    .line 2136
    check-cast p2, Ll/ۤ۠;

    const/4 v1, 0x0

    .line 130
    :goto_2
    iget v2, p2, Ll/۬۠;->ܰ֫:I

    if-ge v1, v2, :cond_4

    .line 131
    iget-object v2, p2, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    aget-object v2, v2, v1

    if-eqz v2, :cond_5

    .line 133
    invoke-virtual {v2}, Ll/ܶ۠;->ᩳ֫()V

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public static ֫(Ll/᩸۠;Ll/᩸۠;)V
    .locals 5

    .line 108
    iget-object v0, p0, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    .line 2004
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 2005
    invoke-virtual {v1, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    iget-object v2, p1, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    .line 2006
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 2007
    invoke-virtual {p1, p0, v1}, Ll/ܶ۠;->֫(Ll/ܶ۠;Ljava/util/HashMap;)V

    .line 2008
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ۠;

    .line 2010
    instance-of v3, v2, Ll/ۖ۠;

    if-eqz v3, :cond_0

    .line 2011
    new-instance v3, Ll/ۖ۠;

    invoke-direct {v3}, Ll/ۖ۠;-><init>()V

    goto :goto_1

    .line 2012
    :cond_0
    instance-of v3, v2, Ll/ۗ۠;

    if-eqz v3, :cond_1

    .line 2013
    new-instance v3, Ll/ۗ۠;

    invoke-direct {v3}, Ll/ۗ۠;-><init>()V

    goto :goto_1

    .line 2014
    :cond_1
    instance-of v3, v2, Ll/᩶۠;

    if-eqz v3, :cond_2

    .line 2015
    new-instance v3, Ll/᩶۠;

    invoke-direct {v3}, Ll/᩶۠;-><init>()V

    goto :goto_1

    .line 2016
    :cond_2
    instance-of v3, v2, Ll/۬۠;

    if-eqz v3, :cond_3

    .line 2017
    new-instance v3, Ll/۬۠;

    invoke-direct {v3}, Ll/۬۠;-><init>()V

    goto :goto_1

    .line 2019
    :cond_3
    new-instance v3, Ll/ܶ۠;

    invoke-direct {v3}, Ll/ܶ۠;-><init>()V

    .line 72
    :goto_1
    iget-object v4, p1, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 620
    iget-object v4, v3, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-eqz v4, :cond_4

    .line 74
    check-cast v4, Ll/ۛ۠;

    .line 98
    iget-object v4, v4, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 99
    invoke-virtual {v3}, Ll/ܶ۠;->᩺()V

    .line 629
    :cond_4
    iput-object p1, v3, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    .line 2022
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 2024
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶ۠;

    .line 2025
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ۠;

    invoke-virtual {v0, p1, v1}, Ll/ܶ۠;->֫(Ll/ܶ۠;Ljava/util/HashMap;)V

    goto :goto_2

    :cond_6
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 8

    .line 2288
    iget-object v0, p0, Ll/᩹ۚ;->᩻:Ll/ۤۚ;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 2289
    iget-object v2, v0, Ll/ۤۚ;->᩺:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 2292
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 2293
    new-instance v6, Ll/᩵ۚ;

    invoke-direct {v6, v5}, Ll/᩵ۚ;-><init>(Landroid/view/View;)V

    .line 2295
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v3, v1, :cond_6

    .line 2298
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 2299
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵ۚ;

    if-nez v5, :cond_1

    goto :goto_3

    .line 2303
    :cond_1
    iget-object v6, p0, Ll/᩹ۚ;->ܿ:Ll/ۘ᩸;

    if-eqz v6, :cond_3

    .line 2304
    iget-object v6, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-static {v6, v4}, Ll/᩹ۚ;->֫(Ll/᩸۠;Landroid/view/View;)Ll/ܶ۠;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 2306
    iget-object v7, p0, Ll/᩹ۚ;->ܿ:Ll/ۘ᩸;

    invoke-virtual {v5, v6, v7}, Ll/᩵ۚ;->ۧ(Ll/ܶ۠;Ll/ۘ᩸;)V

    goto :goto_2

    .line 2308
    :cond_2
    iget v6, v0, Ll/ۤۚ;->ۗ:I

    if-eqz v6, :cond_3

    .line 2309
    invoke-static {}, Ll/֡֡;->֫()V

    invoke-static {v4}, Ll/֡֡;->֫(Landroid/view/View;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2313
    :cond_3
    :goto_2
    iget-object v6, p0, Ll/᩹ۚ;->֫:Ll/ۘ᩸;

    if-eqz v6, :cond_5

    .line 2314
    iget-object v6, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-static {v6, v4}, Ll/᩹ۚ;->֫(Ll/᩸۠;Landroid/view/View;)Ll/ܶ۠;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 2316
    iget-object v4, p0, Ll/᩹ۚ;->֫:Ll/ۘ᩸;

    invoke-virtual {v5, v6, v4}, Ll/᩵ۚ;->֫(Ll/ܶ۠;Ll/ۘ᩸;)V

    goto :goto_3

    .line 2318
    :cond_4
    iget v5, v0, Ll/ۤۚ;->ۗ:I

    if-eqz v5, :cond_5

    .line 2319
    invoke-static {}, Ll/֡֡;->֫()V

    invoke-static {v4}, Ll/֡֡;->֫(Landroid/view/View;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    return-void
.end method

.method public final ֫(Ll/ۘ᩸;Ll/ۘ᩸;)V
    .locals 6

    .line 2030
    iput-object p1, p0, Ll/᩹ۚ;->ܿ:Ll/ۘ᩸;

    .line 2031
    iput-object p2, p0, Ll/᩹ۚ;->֫:Ll/ۘ᩸;

    .line 2032
    new-instance v0, Ll/᩸۠;

    invoke-direct {v0}, Ll/᩸۠;-><init>()V

    iput-object v0, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    .line 2033
    new-instance v0, Ll/᩸۠;

    invoke-direct {v0}, Ll/᩸۠;-><init>()V

    iput-object v0, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    .line 2034
    iget-object v0, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    iget-object v1, p0, Ll/᩹ۚ;->᩻:Ll/ۤۚ;

    invoke-static {v1}, Ll/ۤۚ;->ܽ(Ll/ۤۚ;)Ll/᩸۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸۠;->ۜ֫()Ll/ܰ۠;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩸۠;->֫(Ll/ܰ۠;)V

    .line 2035
    iget-object v0, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-static {v1}, Ll/ۤۚ;->ᩳ(Ll/ۤۚ;)Ll/᩸۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸۠;->ۜ֫()Ll/ܰ۠;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩸۠;->֫(Ll/ܰ۠;)V

    .line 2036
    iget-object v0, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    .line 181
    iget-object v0, v0, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2037
    iget-object v0, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    .line 181
    iget-object v0, v0, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2038
    invoke-static {v1}, Ll/ۤۚ;->ܿ(Ll/ۤۚ;)Ll/᩸۠;

    move-result-object v0

    iget-object v2, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-static {v0, v2}, Ll/᩹ۚ;->֫(Ll/᩸۠;Ll/᩸۠;)V

    .line 2039
    invoke-static {v1}, Ll/ۤۚ;->ܳ(Ll/ۤۚ;)Ll/᩸۠;

    move-result-object v0

    iget-object v2, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-static {v0, v2}, Ll/᩹ۚ;->֫(Ll/᩸۠;Ll/᩸۠;)V

    .line 2040
    iget v0, v1, Ll/ۤۚ;->ܽۧ:F

    float-to-double v2, v0

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v2, v4

    if-lez v0, :cond_1

    if-eqz p1, :cond_0

    .line 2042
    iget-object v0, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-direct {p0, v0, p1}, Ll/᩹ۚ;->֫(Ll/᩸۠;Ll/ۘ᩸;)V

    .line 2044
    :cond_0
    iget-object p1, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-direct {p0, p1, p2}, Ll/᩹ۚ;->֫(Ll/᩸۠;Ll/ۘ᩸;)V

    goto :goto_0

    .line 2046
    :cond_1
    iget-object v0, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-direct {p0, v0, p2}, Ll/᩹ۚ;->֫(Ll/᩸۠;Ll/ۘ᩸;)V

    if-eqz p1, :cond_2

    .line 2048
    iget-object p2, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-direct {p0, p2, p1}, Ll/᩹ۚ;->֫(Ll/᩸۠;Ll/ۘ᩸;)V

    .line 2055
    :cond_2
    :goto_0
    iget-object p1, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-static {v1}, Ll/ۤۚ;->᩻(Ll/ۤۚ;)Z

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩸۠;->ۧ(Z)V

    .line 2056
    iget-object p1, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-virtual {p1}, Ll/᩸۠;->ۘ֫()V

    .line 2065
    iget-object p1, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-static {v1}, Ll/ۤۚ;->ۜ(Ll/ۤۚ;)Z

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩸۠;->ۧ(Z)V

    .line 2066
    iget-object p1, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-virtual {p1}, Ll/᩸۠;->ۘ֫()V

    .line 2073
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 2075
    iget p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v0, -0x2

    if-ne p2, v0, :cond_3

    .line 2076
    iget-object p2, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    sget-object v1, Ll/۠۠;->ۗ:Ll/۠۠;

    invoke-virtual {p2, v1}, Ll/ܶ۠;->֫(Ll/۠۠;)V

    .line 2077
    iget-object p2, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-virtual {p2, v1}, Ll/ܶ۠;->֫(Ll/۠۠;)V

    .line 2079
    :cond_3
    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne p1, v0, :cond_4

    .line 2080
    iget-object p1, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    sget-object p2, Ll/۠۠;->ۗ:Ll/۠۠;

    invoke-virtual {p1, p2}, Ll/ܶ۠;->ۧ(Ll/۠۠;)V

    .line 2081
    iget-object p1, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-virtual {p1, p2}, Ll/ܶ۠;->ۧ(Ll/۠۠;)V

    :cond_4
    return-void
.end method

.method public final ۧ()V
    .locals 14

    .line 2208
    iget-object v7, p0, Ll/᩹ۚ;->᩻:Ll/ۤۚ;

    invoke-static {v7}, Ll/ۤۚ;->᩷(Ll/ۤۚ;)I

    move-result v1

    invoke-static {v7}, Ll/ۤۚ;->ۧ(Ll/ۤۚ;)I

    move-result v2

    .line 2213
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 2214
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 2216
    iput v0, v7, Ll/ۤۚ;->᩷ۧ:I

    .line 2217
    iput v3, v7, Ll/ۤۚ;->۟:I

    .line 2218
    invoke-virtual {v7}, Ll/ܿ᩸;->getOptimizationLevel()I

    move-result v4

    .line 2220
    iget v5, v7, Ll/ۤۚ;->ۙ:I

    invoke-virtual {v7}, Ll/ۤۚ;->ܽ()I

    move-result v6

    if-ne v5, v6, :cond_0

    .line 2221
    iget-object v5, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-static {v7, v5, v4, v1, v2}, Ll/ۤۚ;->֫(Ll/ۤۚ;Ll/᩸۠;III)V

    .line 2222
    iget-object v5, p0, Ll/᩹ۚ;->ܿ:Ll/ۘ᩸;

    if-eqz v5, :cond_2

    .line 2223
    iget-object v5, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-static {v7, v5, v4, v1, v2}, Ll/ۤۚ;->ۧ(Ll/ۤۚ;Ll/᩸۠;III)V

    goto :goto_0

    .line 2226
    :cond_0
    iget-object v5, p0, Ll/᩹ۚ;->ܿ:Ll/ۘ᩸;

    if-eqz v5, :cond_1

    .line 2227
    iget-object v5, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-static {v7, v5, v4, v1, v2}, Ll/ۤۚ;->ܽ(Ll/ۤۚ;Ll/᩸۠;III)V

    .line 2229
    :cond_1
    iget-object v5, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-static {v7, v5, v4, v1, v2}, Ll/ۤۚ;->ᩳ(Ll/ۤۚ;Ll/᩸۠;III)V

    .line 2238
    :cond_2
    :goto_0
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    instance-of v5, v5, Ll/ۤۚ;

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_3

    const/high16 v5, 0x40000000    # 2.0f

    if-ne v0, v5, :cond_3

    if-ne v3, v5, :cond_3

    goto :goto_4

    .line 2242
    :cond_3
    iput v0, v7, Ll/ۤۚ;->᩷ۧ:I

    .line 2243
    iput v3, v7, Ll/ۤۚ;->۟:I

    .line 2244
    iget v0, v7, Ll/ۤۚ;->ۙ:I

    invoke-virtual {v7}, Ll/ۤۚ;->ܽ()I

    move-result v3

    if-ne v0, v3, :cond_4

    .line 2245
    iget-object v0, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-static {v7, v0, v4, v1, v2}, Ll/ۤۚ;->ܿ(Ll/ۤۚ;Ll/᩸۠;III)V

    .line 2246
    iget-object v0, p0, Ll/᩹ۚ;->ܿ:Ll/ۘ᩸;

    if-eqz v0, :cond_6

    .line 2247
    iget-object v0, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-static {v7, v0, v4, v1, v2}, Ll/ۤۚ;->ܳ(Ll/ۤۚ;Ll/᩸۠;III)V

    goto :goto_1

    .line 2250
    :cond_4
    iget-object v0, p0, Ll/᩹ۚ;->ܿ:Ll/ۘ᩸;

    if-eqz v0, :cond_5

    .line 2251
    iget-object v0, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-static {v7, v0, v4, v1, v2}, Ll/ۤۚ;->᩻(Ll/ۤۚ;Ll/᩸۠;III)V

    .line 2253
    :cond_5
    iget-object v0, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-static {v7, v0, v4, v1, v2}, Ll/ۤۚ;->ۜ(Ll/ۤۚ;Ll/᩸۠;III)V

    .line 2256
    :cond_6
    :goto_1
    iget-object v0, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-virtual {v0}, Ll/ܶ۠;->ܶ()I

    move-result v0

    iput v0, v7, Ll/ۤۚ;->ۤ֫:I

    .line 2257
    iget-object v0, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-virtual {v0}, Ll/ܶ۠;->ۜ()I

    move-result v0

    iput v0, v7, Ll/ۤۚ;->۫֫:I

    .line 2258
    iget-object v0, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-virtual {v0}, Ll/ܶ۠;->ܶ()I

    move-result v0

    iput v0, v7, Ll/ۤۚ;->ۨ:I

    .line 2259
    iget-object v0, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    invoke-virtual {v0}, Ll/ܶ۠;->ۜ()I

    move-result v0

    iput v0, v7, Ll/ۤۚ;->ۛ:I

    .line 2260
    iget v3, v7, Ll/ۤۚ;->ۤ֫:I

    iget v4, v7, Ll/ۤۚ;->ۨ:I

    if-ne v3, v4, :cond_8

    iget v3, v7, Ll/ۤۚ;->۫֫:I

    if-eq v3, v0, :cond_7

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    goto :goto_3

    :cond_8
    :goto_2
    const/4 v0, 0x1

    :goto_3
    iput-boolean v0, v7, Ll/ۤۚ;->᩵֫:Z

    .line 2264
    :goto_4
    iget v0, v7, Ll/ۤۚ;->ۤ֫:I

    .line 2265
    iget v3, v7, Ll/ۤۚ;->۫֫:I

    .line 2266
    iget v4, v7, Ll/ۤۚ;->᩷ۧ:I

    const/high16 v5, -0x80000000

    if-eq v4, v5, :cond_9

    if-nez v4, :cond_a

    :cond_9
    int-to-float v4, v0

    .line 2267
    iget v6, v7, Ll/ۤۚ;->ܶ֫:F

    iget v10, v7, Ll/ۤۚ;->ۨ:I

    sub-int/2addr v10, v0

    int-to-float v0, v10

    mul-float v6, v6, v0

    add-float/2addr v6, v4

    float-to-int v0, v6

    :cond_a
    move v4, v0

    .line 2269
    iget v0, v7, Ll/ۤۚ;->۟:I

    if-eq v0, v5, :cond_c

    if-nez v0, :cond_b

    goto :goto_5

    :cond_b
    move v5, v3

    goto :goto_6

    :cond_c
    :goto_5
    int-to-float v0, v3

    .line 2270
    iget v5, v7, Ll/ۤۚ;->ܶ֫:F

    iget v6, v7, Ll/ۤۚ;->ۛ:I

    sub-int/2addr v6, v3

    int-to-float v3, v6

    mul-float v5, v5, v3

    add-float/2addr v5, v0

    float-to-int v0, v5

    move v5, v0

    .line 2273
    :goto_6
    iget-object v0, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-virtual {v0}, Ll/᩸۠;->ۖ֫()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    .line 2274
    invoke-virtual {v0}, Ll/᩸۠;->ۖ֫()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_7

    :cond_d
    const/4 v0, 0x0

    const/4 v6, 0x0

    goto :goto_8

    :cond_e
    :goto_7
    const/4 v0, 0x1

    const/4 v6, 0x1

    .line 2275
    :goto_8
    iget-object v0, p0, Ll/᩹ۚ;->ᩳ:Ll/᩸۠;

    invoke-virtual {v0}, Ll/᩸۠;->ۡ֫()Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, p0, Ll/᩹ۚ;->ܽ:Ll/᩸۠;

    .line 2276
    invoke-virtual {v0}, Ll/᩸۠;->ۡ֫()Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_9

    :cond_f
    const/4 v0, 0x0

    const/4 v10, 0x0

    goto :goto_a

    :cond_10
    :goto_9
    const/4 v0, 0x1

    const/4 v10, 0x1

    :goto_a
    move-object v0, v7

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v10

    .line 2277
    invoke-static/range {v0 .. v6}, Ll/ۤۚ;->֫(Ll/ۤۚ;IIIIZZ)V

    .line 1519
    iget-object v0, v7, Ll/ۤۚ;->᩺:Ljava/util/HashMap;

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 1521
    iget-object v2, v7, Ll/ۤۚ;->֡֫:Ll/᩹ۚ;

    invoke-virtual {v2}, Ll/᩹ۚ;->֫()V

    .line 1522
    iput-boolean v8, v7, Ll/ۤۚ;->ۧ֫:Z

    .line 1524
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 1525
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v3

    .line 1526
    iget-object v4, v7, Ll/ۤۚ;->᩹֫:Ll/۟ۚ;

    .line 1449
    iget-object v4, v4, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    const/4 v5, -0x1

    if-eqz v4, :cond_11

    invoke-static {v4}, Ll/ܰۚ;->᩷(Ll/ܰۚ;)I

    move-result v4

    goto :goto_b

    :cond_11
    const/4 v4, -0x1

    :goto_b
    if-eq v4, v5, :cond_13

    const/4 v5, 0x0

    :goto_c
    if-ge v5, v1, :cond_13

    .line 1529
    invoke-virtual {v7, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩵ۚ;

    if-eqz v6, :cond_12

    .line 1531
    invoke-virtual {v6, v4}, Ll/᩵ۚ;->ۧ(I)V

    :cond_12
    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    :cond_13
    const/4 v4, 0x0

    :goto_d
    if-ge v4, v1, :cond_15

    .line 1537
    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵ۚ;

    if-eqz v5, :cond_14

    .line 1539
    iget-object v6, v7, Ll/ۤۚ;->᩹֫:Ll/۟ۚ;

    invoke-virtual {v6, v5}, Ll/۟ۚ;->֫(Ll/᩵ۚ;)V

    .line 983
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v10

    .line 1540
    invoke-virtual {v5, v2, v3, v10, v11}, Ll/᩵ۚ;->֫(IIJ)V

    :cond_14
    add-int/lit8 v4, v4, 0x1

    goto :goto_d

    .line 1544
    :cond_15
    iget-object v2, v7, Ll/ۤۚ;->᩹֫:Ll/۟ۚ;

    .line 1459
    iget-object v2, v2, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    const/4 v3, 0x0

    if-eqz v2, :cond_16

    .line 1460
    invoke-static {v2}, Ll/ܰۚ;->ۢ(Ll/ܰۚ;)F

    move-result v2

    goto :goto_e

    :cond_16
    const/4 v2, 0x0

    :goto_e
    cmpl-float v3, v2, v3

    if-eqz v3, :cond_20

    float-to-double v3, v2

    const-wide/16 v5, 0x0

    cmpg-double v10, v3, v5

    if-gez v10, :cond_17

    goto :goto_f

    :cond_17
    const/4 v8, 0x0

    .line 1548
    :goto_f
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v3, -0x800001

    const v4, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v5, 0x0

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    const v10, -0x800001

    :goto_10
    const/high16 v11, 0x3f800000    # 1.0f

    if-ge v5, v1, :cond_1e

    .line 1551
    invoke-virtual {v7, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩵ۚ;

    .line 1552
    iget v13, v12, Ll/᩵ۚ;->᩵:F

    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    move-result v13

    if-nez v13, :cond_1c

    const/4 v5, 0x0

    :goto_11
    if-ge v5, v1, :cond_19

    .line 1567
    invoke-virtual {v7, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩵ۚ;

    .line 1568
    iget v10, v6, Ll/᩵ۚ;->᩵:F

    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    move-result v10

    if-nez v10, :cond_18

    .line 1569
    iget v10, v6, Ll/᩵ۚ;->᩵:F

    invoke-static {v4, v10}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 1570
    iget v6, v6, Ll/᩵ۚ;->᩵:F

    invoke-static {v3, v6}, Ljava/lang/Math;->max(FF)F

    move-result v3

    :cond_18
    add-int/lit8 v5, v5, 0x1

    goto :goto_11

    :cond_19
    :goto_12
    if-ge v9, v1, :cond_20

    .line 1574
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵ۚ;

    .line 1575
    iget v6, v5, Ll/᩵ۚ;->᩵:F

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_1b

    sub-float v6, v11, v2

    div-float v6, v11, v6

    .line 1577
    iput v6, v5, Ll/᩵ۚ;->۠:F

    if-eqz v8, :cond_1a

    .line 1579
    iget v6, v5, Ll/᩵ۚ;->᩵:F

    sub-float v6, v3, v6

    sub-float v10, v3, v4

    div-float/2addr v6, v10

    mul-float v6, v6, v2

    sub-float v6, v2, v6

    iput v6, v5, Ll/᩵ۚ;->֨:F

    goto :goto_13

    .line 1581
    :cond_1a
    iget v6, v5, Ll/᩵ۚ;->᩵:F

    sub-float/2addr v6, v4

    mul-float v6, v6, v2

    sub-float v10, v3, v4

    div-float/2addr v6, v10

    sub-float v6, v2, v6

    iput v6, v5, Ll/᩵ۚ;->֨:F

    :cond_1b
    :goto_13
    add-int/lit8 v9, v9, 0x1

    goto :goto_12

    .line 1556
    :cond_1c
    invoke-virtual {v12}, Ll/᩵ۚ;->ۧ()F

    move-result v11

    .line 1557
    invoke-virtual {v12}, Ll/᩵ۚ;->ܽ()F

    move-result v12

    if-eqz v8, :cond_1d

    sub-float/2addr v12, v11

    goto :goto_14

    :cond_1d
    add-float/2addr v12, v11

    .line 1559
    :goto_14
    invoke-static {v6, v12}, Ljava/lang/Math;->min(FF)F

    move-result v6

    .line 1560
    invoke-static {v10, v12}, Ljava/lang/Math;->max(FF)F

    move-result v10

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_10

    :cond_1e
    :goto_15
    if-ge v9, v1, :cond_20

    .line 1587
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵ۚ;

    .line 1588
    invoke-virtual {v3}, Ll/᩵ۚ;->ۧ()F

    move-result v4

    .line 1589
    invoke-virtual {v3}, Ll/᩵ۚ;->ܽ()F

    move-result v5

    if-eqz v8, :cond_1f

    sub-float/2addr v5, v4

    goto :goto_16

    :cond_1f
    add-float/2addr v5, v4

    :goto_16
    sub-float v4, v11, v2

    div-float v4, v11, v4

    .line 1591
    iput v4, v3, Ll/᩵ۚ;->۠:F

    sub-float/2addr v5, v6

    mul-float v5, v5, v2

    sub-float v4, v10, v6

    div-float/2addr v5, v4

    sub-float v4, v2, v5

    .line 1592
    iput v4, v3, Ll/᩵ۚ;->֨:F

    add-int/lit8 v9, v9, 0x1

    goto :goto_15

    :cond_20
    return-void
.end method
