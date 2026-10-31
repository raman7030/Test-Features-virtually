.class public final Ll/ۢᩴۖ;
.super Ljava/lang/Object;
.source "X93U"


# instance fields
.field public ֫:[Ljava/lang/String;

.field public final ۧ:Ll/ᩳۖۖ;

.field public final ܽ:[Ll/ۛۘۖ;

.field public final ܿ:[Ll/᩺ۘۖ;

.field public volatile ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ᩳۖۖ;[Ljava/lang/String;)V
    .locals 0

    .line 1967
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1968
    iput-object p1, p0, Ll/ۢᩴۖ;->ۧ:Ll/ᩳۖۖ;

    .line 1969
    iput-object p2, p0, Ll/ۢᩴۖ;->֫:[Ljava/lang/String;

    .line 1970
    invoke-virtual {p1}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    new-array p2, p2, [Ll/ۛۘۖ;

    iput-object p2, p0, Ll/ۢᩴۖ;->ܽ:[Ll/ۛۘۖ;

    .line 1971
    invoke-virtual {p1}, Ll/ᩳۖۖ;->֨()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ll/᩺ۘۖ;

    iput-object p1, p0, Ll/ۢᩴۖ;->ܿ:[Ll/᩺ۘۖ;

    const/4 p1, 0x0

    .line 1972
    iput-boolean p1, p0, Ll/ۢᩴۖ;->ᩳ:Z

    return-void
.end method

.method public static ֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;
    .locals 2

    .line 1942
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2078
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object v0

    iget-object v1, p0, Ll/ۢᩴۖ;->ۧ:Ll/ᩳۖۖ;

    if-ne v0, v1, :cond_1

    .line 2080
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2085
    iget-object p0, p0, Ll/ۢᩴۖ;->ܽ:[Ll/ۛۘۖ;

    invoke-virtual {p1}, Ll/֡ۖۖ;->۠()I

    move-result p1

    aget-object p0, p0, p1

    return-object p0

    .line 2083
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "This type does not have extensions."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 2079
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "FieldDescriptor does not match message type."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ֫(Ll/ۢᩴۖ;)Ll/ᩳۖۖ;
    .locals 0

    .line 1942
    iget-object p0, p0, Ll/ۢᩴۖ;->ۧ:Ll/ᩳۖۖ;

    return-object p0
.end method

.method public static ֫(Ll/ۢᩴۖ;Ll/ܶۖۖ;)Ll/᩺ۘۖ;
    .locals 2

    .line 1942
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2090
    invoke-virtual {p1}, Ll/ܶۖۖ;->ܺ()Ll/ᩳۖۖ;

    move-result-object v0

    iget-object v1, p0, Ll/ۢᩴۖ;->ۧ:Ll/ᩳۖۖ;

    if-ne v0, v1, :cond_0

    .line 2093
    iget-object p0, p0, Ll/ۢᩴۖ;->ܿ:[Ll/᩺ۘۖ;

    invoke-virtual {p1}, Ll/ܶۖۖ;->֡()I

    move-result p1

    aget-object p0, p0, p1

    return-object p0

    .line 2091
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "OneofDescriptor does not match message type."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 12

    .line 1984
    iget-boolean v0, p0, Ll/ۢᩴۖ;->ᩳ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    move-object v0, p0

    .line 1987
    monitor-enter v0

    .line 1988
    :try_start_0
    iget-boolean v1, p0, Ll/ۢᩴۖ;->ᩳ:Z

    if-eqz v1, :cond_1

    .line 1989
    monitor-exit v0

    return-void

    .line 1991
    :cond_1
    iget-object v1, p0, Ll/ۢᩴۖ;->ܽ:[Ll/ۛۘۖ;

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x0

    if-ge v3, v1, :cond_a

    .line 1993
    iget-object v5, p0, Ll/ۢᩴۖ;->ۧ:Ll/ᩳۖۖ;

    invoke-virtual {v5}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ll/֡ۖۖ;

    .line 1995
    invoke-virtual {v7}, Ll/֡ۖۖ;->ܺ()Ll/ܶۖۖ;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 1996
    invoke-virtual {v7}, Ll/֡ۖۖ;->ܺ()Ll/ܶۖۖ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܶۖۖ;->֡()I

    move-result v5

    add-int/2addr v5, v1

    .line 1997
    iget-object v6, p0, Ll/ۢᩴۖ;->֫:[Ljava/lang/String;

    array-length v8, v6

    if-ge v5, v8, :cond_2

    .line 1998
    aget-object v4, v6, v5

    :cond_2
    move-object v11, v4

    .line 2001
    invoke-virtual {v7}, Ll/֡ۖۖ;->۟֫()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 2002
    invoke-virtual {v7}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v4

    sget-object v5, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v4, v5, :cond_4

    .line 2003
    invoke-virtual {v7}, Ll/֡ۖۖ;->۬()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 2004
    iget-object v4, p0, Ll/ۢᩴۖ;->ܽ:[Ll/ۛۘۖ;

    new-instance v5, Ll/ۨۘۖ;

    invoke-direct {v5, v7, p1}, Ll/ۨۘۖ;-><init>(Ll/֡ۖۖ;Ljava/lang/Class;)V

    aput-object v5, v4, v3

    goto/16 :goto_1

    .line 2006
    :cond_3
    iget-object v4, p0, Ll/ۢᩴۖ;->ܽ:[Ll/ۛۘۖ;

    new-instance v5, Ll/ܽᩴۖ;

    iget-object v6, p0, Ll/ۢᩴۖ;->֫:[Ljava/lang/String;

    aget-object v6, v6, v3

    invoke-direct {v5, p1, p2, v6}, Ll/ܽᩴۖ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v5, v4, v3

    goto/16 :goto_1

    .line 2010
    :cond_4
    invoke-virtual {v7}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v4

    sget-object v5, Ll/ᩴۖۖ;->۬:Ll/ᩴۖۖ;

    if-ne v4, v5, :cond_5

    .line 2011
    iget-object v4, p0, Ll/ۢᩴۖ;->ܽ:[Ll/ۛۘۖ;

    new-instance v5, Ll/۟ۘۖ;

    iget-object v6, p0, Ll/ۢᩴۖ;->֫:[Ljava/lang/String;

    aget-object v6, v6, v3

    invoke-direct {v5, v7, v6, p1, p2}, Ll/۟ۘۖ;-><init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    aput-object v5, v4, v3

    goto/16 :goto_1

    .line 2015
    :cond_5
    iget-object v4, p0, Ll/ۢᩴۖ;->ܽ:[Ll/ۛۘۖ;

    new-instance v5, Ll/ۧᩴۖ;

    iget-object v6, p0, Ll/ۢᩴۖ;->֫:[Ljava/lang/String;

    aget-object v6, v6, v3

    invoke-direct {v5, p1, p2, v6}, Ll/ۧᩴۖ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v5, v4, v3

    goto :goto_1

    .line 2019
    :cond_6
    invoke-virtual {v7}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v4

    sget-object v5, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v4, v5, :cond_7

    .line 2020
    iget-object v4, p0, Ll/ۢᩴۖ;->ܽ:[Ll/ۛۘۖ;

    new-instance v5, Ll/᩻ᩴۖ;

    iget-object v6, p0, Ll/ۢᩴۖ;->֫:[Ljava/lang/String;

    aget-object v8, v6, v3

    move-object v6, v5

    move-object v9, p1

    move-object v10, p2

    invoke-direct/range {v6 .. v11}, Ll/᩻ᩴۖ;-><init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v5, v4, v3

    goto :goto_1

    .line 2027
    :cond_7
    invoke-virtual {v7}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v4

    sget-object v5, Ll/ᩴۖۖ;->۬:Ll/ᩴۖۖ;

    if-ne v4, v5, :cond_8

    .line 2028
    iget-object v4, p0, Ll/ۢᩴۖ;->ܽ:[Ll/ۛۘۖ;

    new-instance v5, Ll/ᩳᩴۖ;

    iget-object v6, p0, Ll/ۢᩴۖ;->֫:[Ljava/lang/String;

    aget-object v8, v6, v3

    move-object v6, v5

    move-object v9, p1

    move-object v10, p2

    invoke-direct/range {v6 .. v11}, Ll/ᩳᩴۖ;-><init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v5, v4, v3

    goto :goto_1

    .line 2035
    :cond_8
    invoke-virtual {v7}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v4

    sget-object v5, Ll/ᩴۖۖ;->᩺:Ll/ᩴۖۖ;

    if-ne v4, v5, :cond_9

    .line 2036
    iget-object v4, p0, Ll/ۢᩴۖ;->ܽ:[Ll/ۛۘۖ;

    new-instance v5, Ll/ۜᩴۖ;

    iget-object v6, p0, Ll/ۢᩴۖ;->֫:[Ljava/lang/String;

    aget-object v8, v6, v3

    move-object v6, v5

    move-object v9, p1

    move-object v10, p2

    invoke-direct/range {v6 .. v11}, Ll/ۜᩴۖ;-><init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v5, v4, v3

    goto :goto_1

    .line 2044
    :cond_9
    iget-object v4, p0, Ll/ۢᩴۖ;->ܽ:[Ll/ۛۘۖ;

    new-instance v5, Ll/ܳᩴۖ;

    iget-object v6, p0, Ll/ۢᩴۖ;->֫:[Ljava/lang/String;

    aget-object v8, v6, v3

    move-object v6, v5

    move-object v9, p1

    move-object v10, p2

    invoke-direct/range {v6 .. v11}, Ll/ܳᩴۖ;-><init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v5, v4, v3

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 2055
    :cond_a
    :goto_2
    iget-object v3, p0, Ll/ۢᩴۖ;->ۧ:Ll/ᩳۖۖ;

    invoke-virtual {v3}, Ll/ᩳۖۖ;->֨()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_c

    .line 2056
    iget-object v3, p0, Ll/ۢᩴۖ;->ۧ:Ll/ᩳۖۖ;

    invoke-virtual {v3}, Ll/ᩳۖۖ;->ܶ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    .line 2057
    iget-object v3, p0, Ll/ۢᩴۖ;->ܿ:[Ll/᩺ۘۖ;

    new-instance v5, Ll/ܰۘۖ;

    iget-object v6, p0, Ll/ۢᩴۖ;->ۧ:Ll/ᩳۖۖ;

    iget-object v7, p0, Ll/ۢᩴۖ;->֫:[Ljava/lang/String;

    add-int v8, v2, v1

    aget-object v7, v7, v8

    invoke-direct {v5, v6, v7, p1, p2}, Ll/ܰۘۖ;-><init>(Ll/ᩳۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    aput-object v5, v3, v2

    goto :goto_3

    .line 2061
    :cond_b
    iget-object v3, p0, Ll/ۢᩴۖ;->ܿ:[Ll/᩺ۘۖ;

    new-instance v5, Ll/᩷ᩴۖ;

    iget-object v6, p0, Ll/ۢᩴۖ;->ۧ:Ll/ᩳۖۖ;

    invoke-direct {v5, v6, v2}, Ll/᩷ᩴۖ;-><init>(Ll/ᩳۖۖ;I)V

    aput-object v5, v3, v2

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_c
    const/4 p1, 0x1

    .line 2064
    iput-boolean p1, p0, Ll/ۢᩴۖ;->ᩳ:Z

    .line 2065
    iput-object v4, p0, Ll/ۢᩴۖ;->֫:[Ljava/lang/String;

    .line 2066
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 2067
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
