.class public final Ll/ۚۗۚ;
.super Ll/ܰۗۚ;
.source "M7EX"


# instance fields
.field public final ܳ:Ljava/util/ArrayList;

.field public final ܿ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/᩸۬ۚ;)V
    .locals 1

    const-string v0, "jasm"

    .line 54
    invoke-direct {p0, v0, p1}, Ll/ܰۗۚ;-><init>(Ljava/lang/String;Ll/᩸۬ۚ;)V

    .line 45
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۚۗۚ;->ܿ:Ljava/util/HashMap;

    .line 46
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۚۗۚ;->ܳ:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(JLl/᩺ۗۚ;)V
    .locals 3

    .line 198
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Ll/ۚۗۚ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 200
    invoke-interface {v0, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    .line 202
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 203
    invoke-virtual {v0, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 204
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private ֫(Ll/֨۬ۚ;Ll/ۜۗۚ;)V
    .locals 10

    .line 170
    iget-object v0, p2, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    long-to-int v1, v0

    .line 171
    iget-object v0, p2, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v0, p0, Ll/ۚۗۚ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    int-to-long v6, v6

    const/4 v8, 0x0

    cmp-long v9, v4, v6

    if-lez v9, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 172
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-wide/16 v5, 0x0

    .line 63
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v8, v1, :cond_2

    .line 64
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v7, 0x9

    if-ne v1, v7, :cond_1

    add-long/2addr v5, v2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    const-string v1, "\t"

    .line 174
    sget-object v2, Ll/ۗۗۚ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    if-eqz v4, :cond_3

    .line 175
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p2

    int-to-long v1, p2

    goto :goto_2

    .line 176
    :cond_3
    iget-object p2, p2, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result p2

    int-to-long v1, p2

    mul-long v1, v1, v5

    add-long/2addr v1, v3

    sub-long/2addr v1, v5

    .line 177
    :goto_2
    invoke-interface {p1, v0}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    .line 178
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    long-to-int v0, v1

    if-gtz v0, :cond_4

    const-string v0, ""

    goto :goto_3

    .line 330
    :cond_4
    new-instance v1, Ljava/lang/String;

    new-array v0, v0, [C

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    const-string v0, "\u0000"

    const-string v2, " "

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 178
    :goto_3
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "^"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method private ۧ(JLl/᩺ۗۚ;)V
    .locals 7

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    .line 185
    iget-object v2, p0, Ll/ۚۗۚ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 186
    new-instance p1, Ll/᩺ۗۚ;

    sget-object p2, Ll/᩸ۗۚ;->᩶:Ll/᩸ۗۚ;

    sget-object v2, Ll/ۨۗۚ;->᩶:Ll/ۨۗۚ;

    .line 187
    invoke-virtual {p0}, Ll/ܰۗۚ;->֫()Ljava/lang/String;

    move-result-object v3

    .line 188
    invoke-virtual {p0}, Ll/ܰۗۚ;->ۧ()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    const-string v4, "Content of the file %s not found"

    .line 187
    invoke-virtual {v2, p2, v3, v4, v5}, Ll/ۨۗۚ;->֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, p2, v2}, Ll/᩺ۗۚ;-><init>(Ll/᩸ۗۚ;Ljava/lang/String;)V

    .line 186
    invoke-direct {p0, v0, v1, p1}, Ll/ۚۗۚ;->֫(JLl/᩺ۗۚ;)V

    move-wide p1, v0

    .line 192
    :cond_0
    new-instance v2, Ll/᩺ۗۚ;

    invoke-virtual {p3}, Ll/᩺ۗۚ;->֫()Ll/᩸ۗۚ;

    move-result-object v3

    cmp-long v4, p1, v0

    if-nez v4, :cond_1

    .line 193
    sget-object v0, Ll/ۨۗۚ;->ۗ:Ll/ۨۗۚ;

    invoke-virtual {p0}, Ll/ܰۗۚ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Ll/ۨۗۚ;->֫(Ljava/lang/String;Ll/᩺ۗۚ;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    .line 194
    :cond_1
    sget-object v0, Ll/ۨۗۚ;->᩶:Ll/ۨۗۚ;

    invoke-virtual {p0}, Ll/ܰۗۚ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Ll/ۨۗۚ;->֫(Ljava/lang/String;Ll/᩺ۗۚ;)Ljava/lang/String;

    move-result-object p3

    :goto_0
    invoke-direct {v2, v3, p3}, Ll/᩺ۗۚ;-><init>(Ll/᩸ۗۚ;Ljava/lang/String;)V

    .line 192
    invoke-direct {p0, p1, p2, v2}, Ll/ۚۗۚ;->֫(JLl/᩺ۗۚ;)V

    return-void
.end method


# virtual methods
.method public final ֫(JJ)J
    .locals 3

    const-wide v0, 0xffffffffL

    and-long/2addr p3, v0

    long-to-int v0, p1

    add-int/lit8 v0, v0, -0x1

    .line 102
    iget-object v1, p0, Ll/ۚۗۚ;->ܳ:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 103
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܶܶ᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۧ᩺ᩴ;->sum()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v0, p1

    const-wide/16 p1, 0x1

    sub-long/2addr v0, p1

    sub-long/2addr p3, v0

    return-wide p3
.end method

.method public final ֫(Ll/᩸ۗۚ;)J
    .locals 3

    .line 113
    iget-object v0, p0, Ll/ۚۗۚ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 108
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۗ᩵֡;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ll/ۗ᩵֡;-><init>(I)V

    .line 109
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->flatMap(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/֡ۛ᩷;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, Ll/֡ۛ᩷;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-interface {p1}, Ll/ܿ᩺ᩴ;->count()J

    move-result-wide v0

    return-wide v0
.end method

.method public final varargs ֫(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 65
    sget-object v0, Ll/᩸ۗۚ;->᩶:Ll/᩸ۗۚ;

    .line 69
    invoke-static {p3, p4}, Ll/ܰۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_0

    .line 70
    new-instance p3, Ll/᩺ۗۚ;

    const/4 p4, 0x0

    invoke-direct {p3, v0, p4}, Ll/᩺ۗۚ;-><init>(Ll/᩸ۗۚ;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p4, Ll/᩺ۗۚ;

    invoke-direct {p4, v0, p3}, Ll/᩺ۗۚ;-><init>(Ll/᩸ۗۚ;Ljava/lang/String;)V

    move-object p3, p4

    .line 65
    :goto_0
    invoke-direct {p0, p1, p2, p3}, Ll/ۚۗۚ;->ۧ(JLl/᩺ۗۚ;)V

    return-void
.end method

.method public final ֫(Ll/᩻۬ۚ;)V
    .locals 1

    .line 75
    invoke-super {p0, p1}, Ll/ܰۗۚ;->֫(Ll/᩻۬ۚ;)V

    .line 76
    iget-object v0, p0, Ll/ۚۗۚ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 77
    invoke-interface {p1}, Ll/᩻۬ۚ;->֫()Ljava/util/Collection;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final varargs ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 70
    invoke-static {p1, p2}, Ll/ܰۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ۧ(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 59
    sget-object v0, Ll/᩸ۗۚ;->ۗ:Ll/᩸ۗۚ;

    .line 69
    invoke-static {p3, p4}, Ll/ܰۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_0

    .line 70
    new-instance p3, Ll/᩺ۗۚ;

    sget-object p4, Ll/᩸ۗۚ;->᩶:Ll/᩸ۗۚ;

    const/4 v0, 0x0

    invoke-direct {p3, p4, v0}, Ll/᩺ۗۚ;-><init>(Ll/᩸ۗۚ;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p4, Ll/᩺ۗۚ;

    invoke-direct {p4, v0, p3}, Ll/᩺ۗۚ;-><init>(Ll/᩸ۗۚ;Ljava/lang/String;)V

    move-object p3, p4

    .line 60
    :goto_0
    invoke-direct {p0, p1, p2, p3}, Ll/ۚۗۚ;->ۧ(JLl/᩺ۗۚ;)V

    return-void
.end method

.method public final declared-synchronized ܽ()I
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v16, p0

    .line 3
    monitor-enter v16

    .line 113
    :try_start_0
    iget-object v0, v1, Ll/ۚۗۚ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 121
    monitor-exit v16

    return v2

    .line 123
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, v1, Ll/ۚۗۚ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 124
    invoke-static {}, Ll/۟۬ᩴ;->comparingByKey()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 75
    iget-object v2, v1, Ll/ܰۗۚ;->ۧ:Ll/ܶ۬ۚ;

    .line 125
    invoke-virtual {v2}, Ll/ܶ۬ۚ;->ܽ()Ll/֨۬ۚ;

    move-result-object v2

    .line 126
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v7, 0x1

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 127
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const-wide/32 v10, 0x7fffffff

    cmp-long v12, v8, v10

    if-eqz v12, :cond_3

    .line 88
    iget-object v10, v1, Ll/ۚۗۚ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_2

    goto :goto_0

    :cond_2
    const/16 v10, 0x20

    shr-long v10, v8, v10

    .line 92
    new-instance v13, Ll/ۜۗۚ;

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-virtual {v1, v10, v11, v8, v9}, Ll/ۚۗۚ;->֫(JJ)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-direct {v13, v14, v8}, Ll/ۜۗۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v13, 0x0

    .line 129
    :goto_1
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩺ۗۚ;

    .line 130
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Ll/᩸ۗۚ;->ۗ:Ll/᩸ۗۚ;

    .line 133
    invoke-virtual {v8}, Ll/᩺ۗۚ;->֫()Ll/᩸ۗۚ;

    move-result-object v10

    sget-object v11, Ll/᩸ۗۚ;->᩶:Ll/᩸ۗۚ;

    if-ne v10, v11, :cond_4

    .line 75
    iget-object v2, v1, Ll/ܰۗۚ;->ۧ:Ll/ܶ۬ۚ;

    .line 134
    invoke-virtual {v2}, Ll/ܶ۬ۚ;->ۧ()Ll/֨۬ۚ;

    move-result-object v2

    add-int/lit8 v4, v4, 0x1

    .line 137
    :cond_4
    invoke-virtual {v8}, Ll/᩺ۗۚ;->֫()Ll/᩸ۗۚ;

    move-result-object v10

    if-ne v10, v9, :cond_5

    const/4 v9, 0x1

    goto :goto_3

    :cond_5
    const/4 v9, 0x0

    :goto_3
    add-int/2addr v3, v9

    if-nez v12, :cond_6

    .line 140
    invoke-virtual {v8}, Ll/᩺ۗۚ;->ᩳ()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v2, v8}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    const-string v9, "%s (%d:%d) %s"

    .line 142
    invoke-virtual/range {p0 .. p0}, Ll/ܰۗۚ;->ۧ()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v13, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    iget-object v14, v13, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    .line 144
    invoke-virtual {v8}, Ll/᩺ۗۚ;->ᩳ()Ljava/lang/String;

    move-result-object v8

    const/4 v15, 0x0

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v10, v6, v15

    aput-object v11, v6, v7

    const/4 v10, 0x2

    aput-object v14, v6, v10

    const/4 v10, 0x3

    aput-object v8, v6, v10

    .line 142
    invoke-static {v9, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    .line 145
    invoke-direct {v1, v2, v13}, Ll/ۚۗۚ;->֫(Ll/֨۬ۚ;Ll/ۜۗۚ;)V

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    .line 75
    iget-object v5, v1, Ll/ܰۗۚ;->ۧ:Ll/ܶ۬ۚ;

    if-eqz v3, :cond_9

    const-string v6, "%d warning(s)%s"

    .line 152
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v4, :cond_8

    const-string v8, ", "

    goto :goto_4

    :cond_8
    const-string v8, "\n"

    :goto_4
    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v3, v9, v0

    aput-object v8, v9, v7

    invoke-static {v6, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ll/ܶ۬ۚ;->ᩳ(Ljava/lang/String;)V

    :cond_9
    if-eqz v4, :cond_a

    const-string v3, "%d error(s)"

    .line 154
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v6, v7, v0

    invoke-static {v3, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ll/ܶ۬ۚ;->ܿ(Ljava/lang/String;)V

    :cond_a
    move-object/from16 v17, v2

    .line 157
    monitor-enter v17
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 158
    :try_start_2
    invoke-interface {v2}, Ll/֨۬ۚ;->flush()V

    .line 160
    invoke-interface {v5}, Ll/֨۬ۚ;->flush()V

    .line 162
    iget-object v0, v1, Ll/ۚۗۚ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 163
    monitor-exit v17
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 165
    monitor-exit v16

    return v4

    :catchall_0
    move-exception v0

    .line 163
    :try_start_3
    monitor-exit v17
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 113
    iget-object v0, p0, Ll/ۚۗۚ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    return v0
.end method
