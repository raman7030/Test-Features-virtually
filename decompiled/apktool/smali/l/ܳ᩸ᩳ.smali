.class public final Ll/ܳ᩸ᩳ;
.super Ljava/lang/Object;
.source "G6RC"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:I

.field public final ۙ:Ll/۟᩸ᩳ;

.field public final ۤ:Ljava/lang/CharSequence;

.field public final ۫:Ll/᩺ܶᩳ;

.field public final ۬:Ljava/util/List;

.field public final ᩶:Ljava/lang/String;

.field public ᩸:Z

.field public ᩹:Ll/᩺ۘᩳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x72

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Ll/۟᩸ᩳ;Ljava/lang/String;Ll/᩺ܶᩳ;ILjava/util/List;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/ܳ᩸ᩳ;->ۤ:Ljava/lang/CharSequence;

    .line 28
    iput-object p2, p0, Ll/ܳ᩸ᩳ;->ۙ:Ll/۟᩸ᩳ;

    .line 29
    iput-object p3, p0, Ll/ܳ᩸ᩳ;->᩶:Ljava/lang/String;

    .line 30
    iput-object p4, p0, Ll/ܳ᩸ᩳ;->۫:Ll/᩺ܶᩳ;

    .line 31
    iput p5, p0, Ll/ܳ᩸ᩳ;->ۗ:I

    .line 32
    iput-object p6, p0, Ll/ܳ᩸ᩳ;->۬:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/String;Ll/᩺ܶᩳ;ILjava/util/ArrayList;)Ll/ܳ᩸ᩳ;
    .locals 7

    .line 59
    invoke-virtual {p2}, Ll/᩺ܶᩳ;->֫()Ll/᩺ܶᩳ;

    move-result-object v4

    const/4 p2, 0x0

    if-nez p4, :cond_0

    move-object v6, p2

    goto :goto_1

    .line 0
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p4}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p4

    move-object v6, p4

    :goto_1
    if-eqz v6, :cond_3

    if-ltz p3, :cond_2

    .line 61
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result p4

    if-ge p3, p4, :cond_2

    goto :goto_2

    .line 62
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid saving page index"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 66
    :cond_3
    :goto_2
    :try_start_0
    instance-of p4, p0, Ll/᩶᩸ᩳ;

    if-eqz p4, :cond_4

    move-object p4, p0

    check-cast p4, Ll/᩶᩸ᩳ;

    invoke-interface {p4}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object p2

    .line 68
    :cond_4
    new-instance p4, Ll/ܳ᩸ᩳ;

    if-nez p2, :cond_5

    move-object v1, p0

    goto :goto_3

    :cond_5
    move-object v1, p2

    :goto_3
    move-object v0, p4

    move-object v2, p2

    move-object v3, p1

    move v5, p3

    invoke-direct/range {v0 .. v6}, Ll/ܳ᩸ᩳ;-><init>(Ljava/lang/CharSequence;Ll/۟᩸ᩳ;Ljava/lang/String;Ll/᩺ܶᩳ;ILjava/util/List;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p4

    :catch_0
    move-exception p0

    goto :goto_4

    :catch_1
    move-exception p0

    :goto_4
    if-eqz p2, :cond_6

    .line 71
    invoke-virtual {p2}, Ll/۟᩸ᩳ;->close()V

    .line 72
    :cond_6
    throw p0
.end method

.method public static ֫(Ll/۟᩺ᩳ;Ljava/lang/String;Ll/᩺ܶᩳ;)Ll/ܳ᩸ᩳ;
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 37
    invoke-static {p0, p1, p2, v0, v1}, Ll/ܳ᩸ᩳ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;Ll/᩺ܶᩳ;ILjava/util/ArrayList;)Ll/ܳ᩸ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۨ᩵ᩳ;Ljava/lang/String;Ll/᩺ܶᩳ;)Ll/ܳ᩸ᩳ;
    .locals 3

    .line 42
    iget-object v0, p0, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 37
    invoke-static {v0, p1, p2, v1, v2}, Ll/ܳ᩸ᩳ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;Ll/᩺ܶᩳ;ILjava/util/ArrayList;)Ll/ܳ᩸ᩳ;

    move-result-object p1

    .line 43
    iget-object p2, p0, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ll/ܰۘᩳ;->ܽ()I

    move-result p2

    const/4 v0, 0x1

    if-le p2, v0, :cond_0

    .line 44
    :try_start_0
    iget-object p2, p0, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    iget v0, p0, Ll/ۨ᩵ᩳ;->᩷:I

    iget-object v1, p1, Ll/ܳ᩸ᩳ;->ۤ:Ljava/lang/CharSequence;

    iget-object p0, p0, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    iget-object p0, p0, Ll/᩻ᩴᩳ;->ۖ:Ll/ۜ֡ᩳ;

    invoke-virtual {p2, v0, v1, p0}, Ll/ܰۘᩳ;->֫(ILjava/lang/CharSequence;Ll/ۜ֡ᩳ;)Ll/᩺ۘᩳ;

    move-result-object p0

    iput-object p0, p1, Ll/ܳ᩸ᩳ;->᩹:Ll/᩺ۘᩳ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 45
    :goto_0
    invoke-virtual {p1}, Ll/ܳ᩸ᩳ;->close()V

    throw p0

    :cond_0
    return-object p1
.end method

.method private ܽ()V
    .locals 2

    .line 114
    iget-boolean v0, p0, Ll/ܳ᩸ᩳ;->᩸:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Saving request is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 119
    iget-boolean v0, p0, Ll/ܳ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 120
    iput-boolean v0, p0, Ll/ܳ᩸ᩳ;->᩸:Z

    .line 121
    :try_start_0
    iget-object v0, p0, Ll/ܳ᩸ᩳ;->ۙ:Ll/۟᩸ᩳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    :cond_1
    iget-object v0, p0, Ll/ܳ᩸ᩳ;->᩹:Ll/᩺ۘᩳ;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/᩺ۘᩳ;->close()V

    :cond_2
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ll/ܳ᩸ᩳ;->᩹:Ll/᩺ۘᩳ;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll/᩺ۘᩳ;->close()V

    :cond_3
    throw v0
.end method

.method public final ֫(I)Ll/ܰܿܳ;
    .locals 5

    .line 96
    invoke-direct {p0}, Ll/ܳ᩸ᩳ;->ܽ()V

    .line 97
    new-instance v0, Ll/ܰܿܳ;

    invoke-direct {v0}, Ll/ܰܿܳ;-><init>()V

    .line 98
    iget-object v1, p0, Ll/ܳ᩸ᩳ;->᩹:Ll/᩺ۘᩳ;

    iget-object v2, p0, Ll/ܳ᩸ᩳ;->ۤ:Ljava/lang/CharSequence;

    if-nez v1, :cond_0

    .line 99
    invoke-virtual {v0, p1, v2}, Ll/ܰܿܳ;->֫(ILjava/lang/CharSequence;)V

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 101
    :goto_0
    iget-object v3, p0, Ll/ܳ᩸ᩳ;->᩹:Ll/᩺ۘᩳ;

    .line 198
    iget-object v3, v3, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-virtual {v3}, Ll/ܰۘᩳ;->ܽ()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 102
    iget-object v3, p0, Ll/ܳ᩸ᩳ;->᩹:Ll/᩺ۘᩳ;

    invoke-virtual {v3}, Ll/᩺ۘᩳ;->֫()I

    move-result v3

    if-ne v1, v3, :cond_1

    invoke-virtual {v0, p1, v2}, Ll/ܰܿܳ;->֫(ILjava/lang/CharSequence;)V

    goto :goto_1

    .line 103
    :cond_1
    iget-object v3, p0, Ll/ܳ᩸ᩳ;->᩹:Ll/᩺ۘᩳ;

    invoke-virtual {v3, v1}, Ll/᩺ۘᩳ;->֫(I)Ll/۟᩸ᩳ;

    move-result-object v3

    const/4 v4, -0x1

    :try_start_0
    invoke-virtual {v0, v4, v3}, Ll/ܰܿܳ;->֫(ILjava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    :cond_2
    return-object v0
.end method

.method public final ֫()V
    .locals 1

    .line 52
    invoke-direct {p0}, Ll/ܳ᩸ᩳ;->ܽ()V

    .line 53
    iget-object v0, p0, Ll/ܳ᩸ᩳ;->᩹:Ll/᩺ۘᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩺ۘᩳ;->ܽ()V

    :cond_0
    return-void
.end method

.method public native ֫(Ll/ۗܶᩳ;)V
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 3

    .line 89
    invoke-direct {p0}, Ll/ܳ᩸ᩳ;->ܽ()V

    .line 90
    iget-object v0, p0, Ll/ܳ᩸ᩳ;->᩹:Ll/᩺ۘᩳ;

    iget-object v1, p0, Ll/ܳ᩸ᩳ;->۫:Ll/᩺ܶᩳ;

    iget-object v2, p0, Ll/ܳ᩸ᩳ;->᩶:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܳ᩸ᩳ;->ۤ:Ljava/lang/CharSequence;

    iget v1, v1, Ll/᩺ܶᩳ;->ܽ:I

    invoke-static {p1, v0, v2, v1}, Ll/֨᩸ᩳ;->ۧ(Ll/ܶ᩵ܿ;Ljava/lang/CharSequence;Ljava/lang/String;I)V

    return-void

    .line 91
    :cond_0
    iget v1, v1, Ll/᩺ܶᩳ;->ܽ:I

    invoke-static {p1, v2, v1, v0}, Ll/֨᩸ᩳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;ILl/᩺ۘᩳ;)V

    return-void
.end method

.method public final ֫(Ll/᩺ܶᩳ;)Z
    .locals 9

    .line 98
    iget-object v0, p0, Ll/ܳ᩸ᩳ;->۫:Ll/᩺ܶᩳ;

    iget-object v1, v0, Ll/᩺ܶᩳ;->ᩳ:Ljava/util/Map;

    const/4 v2, 0x0

    if-eqz p1, :cond_8

    iget-object v3, p1, Ll/᩺ܶᩳ;->ᩳ:Ljava/util/Map;

    iget v4, v0, Ll/᩺ܶᩳ;->᩻:I

    iget v5, p1, Ll/᩺ܶᩳ;->᩻:I

    if-ne v4, v5, :cond_8

    iget v4, v0, Ll/᩺ܶᩳ;->ܽ:I

    iget v5, p1, Ll/᩺ܶᩳ;->ܽ:I

    if-ne v4, v5, :cond_8

    iget-boolean v4, v0, Ll/᩺ܶᩳ;->ܿ:Z

    iget-boolean v5, p1, Ll/᩺ܶᩳ;->ܿ:Z

    if-ne v4, v5, :cond_8

    iget v4, v0, Ll/᩺ܶᩳ;->ܳ:I

    iget v5, p1, Ll/᩺ܶᩳ;->ܳ:I

    if-ne v4, v5, :cond_8

    iget-object v4, v0, Ll/᩺ܶᩳ;->ۧ:Ll/۫ܽܽ;

    iget-object v5, p1, Ll/᩺ܶᩳ;->ۧ:Ll/۫ܽܽ;

    if-ne v4, v5, :cond_8

    iget-object v0, v0, Ll/᩺ܶᩳ;->֫:Ll/ܶ᩵ܿ;

    iget-object p1, p1, Ll/᩺ܶᩳ;->֫:Ll/ܶ᩵ܿ;

    .line 100
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    if-eqz v1, :cond_6

    if-nez v3, :cond_1

    goto/16 :goto_1

    .line 102
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    .line 103
    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 104
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽᩳܽ;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽᩳܽ;

    .line 105
    iget v4, v1, Ll/ܽᩳܽ;->ᩳ:I

    iget-object v5, v1, Ll/ܽᩳܽ;->ܿ:[Ll/ܳᩳܽ;

    iget v6, v0, Ll/ܽᩳܽ;->ᩳ:I

    iget-object v7, v0, Ll/ܽᩳܽ;->ܿ:[Ll/ܳᩳܽ;

    if-ne v4, v6, :cond_8

    iget v4, v1, Ll/ܽᩳܽ;->֫:I

    iget v6, v0, Ll/ܽᩳܽ;->֫:I

    if-ne v4, v6, :cond_8

    iget-object v1, v1, Ll/ܽᩳܽ;->ۧ:Ljava/lang/String;

    iget-object v0, v0, Ll/ܽᩳܽ;->ۧ:Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    array-length v0, v5

    array-length v1, v7

    if-eq v0, v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    .line 107
    :goto_0
    array-length v1, v5

    if-ge v0, v1, :cond_3

    .line 108
    aget-object v1, v5, v0

    aget-object v4, v7, v0

    .line 109
    iget v6, v1, Ll/ܳᩳܽ;->ۧ:I

    iget v8, v4, Ll/ܳᩳܽ;->ۧ:I

    if-ne v6, v8, :cond_8

    iget v6, v1, Ll/ܳᩳܽ;->ܽ:I

    iget v8, v4, Ll/ܳᩳܽ;->ܽ:I

    if-ne v6, v8, :cond_8

    iget-object v1, v1, Ll/ܳᩳܽ;->֫:Ljava/lang/String;

    iget-object v4, v4, Ll/ܳᩳܽ;->֫:Ljava/lang/String;

    invoke-static {v1, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    if-ne v1, v3, :cond_8

    :cond_7
    const/4 p1, 0x1

    return p1

    :cond_8
    :goto_2
    return v2
.end method
