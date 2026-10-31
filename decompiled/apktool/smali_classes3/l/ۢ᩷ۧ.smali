.class public final Ll/ۢ᩷ۧ;
.super Ljava/lang/Object;
.source "T7TA"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۢ᩷ۧ;->֫:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩷᩷ۧ;
    .locals 12

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 62
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 64
    iget-object v4, p0, Ll/ۢ᩷ۧ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷᩷ۧ;

    .line 65
    iget-object v6, v5, Ll/᩷᩷ۧ;->ܿ:[I

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    iget-object v6, v5, Ll/᩷᩷ۧ;->ᩳ:[J

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    iget-object v6, v5, Ll/᩷᩷ۧ;->ۧ:[J

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    iget-object v5, v5, Ll/᩷᩷ۧ;->ܳ:[J

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 71
    :cond_0
    new-instance v4, Ll/᩷᩷ۧ;

    .line 72
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    new-array v5, v5, [[I

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    .line 301
    array-length v5, v0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v5, :cond_1

    aget-object v10, v0, v9

    .line 302
    array-length v10, v10

    int-to-long v10, v10

    add-long/2addr v6, v10

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    long-to-int v5, v6

    int-to-long v9, v5

    cmp-long v11, v6, v9

    if-nez v11, :cond_2

    const/4 v9, 0x1

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    :goto_2
    const-string v10, "the total number of elements (%s) in the arrays must fit in an int"

    .line 314
    invoke-static {v6, v7, v10, v9}, Ll/ۘܶܺ;->֫(JLjava/lang/String;Z)V

    .line 304
    new-array v5, v5, [I

    .line 306
    array-length v6, v0

    const/4 v7, 0x0

    const/4 v9, 0x0

    :goto_3
    if-ge v7, v6, :cond_3

    aget-object v10, v0, v7

    .line 307
    array-length v11, v10

    invoke-static {v10, v8, v5, v9, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 308
    array-length v10, v10

    add-int/2addr v9, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 73
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [[J

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[J

    invoke-static {v0}, Ll/ۛ᩺ܺ;->֫([[J)[J

    move-result-object v0

    .line 74
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [[J

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[J

    invoke-static {v1}, Ll/ۛ᩺ܺ;->֫([[J)[J

    move-result-object v1

    .line 75
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [[J

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[J

    invoke-static {v2}, Ll/ۛ᩺ܺ;->֫([[J)[J

    move-result-object v2

    invoke-direct {v4, v5, v0, v1, v2}, Ll/᩷᩷ۧ;-><init>([I[J[J[J)V

    return-object v4
.end method

.method public final ֫(Ll/᩷᩷ۧ;)V
    .locals 5

    .line 52
    iget-object v0, p1, Ll/᩷᩷ۧ;->ܳ:[J

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-wide v2, v0, v1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v2, p0, Ll/ۢ᩷ۧ;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 53
    iget-object v0, p1, Ll/᩷᩷ۧ;->ܳ:[J

    aget-wide v3, v0, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ۢ᩷ۧ;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
