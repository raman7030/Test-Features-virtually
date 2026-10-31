.class public final Ll/ܶۗۚ;
.super Ll/ܰۗۚ;
.source "W7E3"


# instance fields
.field public final ܳ:Ljava/util/LinkedHashSet;

.field public ܿ:Ll/۠ۗۚ;


# direct methods
.method public constructor <init>(Ll/᩸۬ۚ;)V
    .locals 1

    const-string v0, "jdis"

    .line 57
    invoke-direct {p0, v0, p1}, Ll/ܰۗۚ;-><init>(Ljava/lang/String;Ll/᩸۬ۚ;)V

    .line 43
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Ll/ܶۗۚ;->ܳ:Ljava/util/LinkedHashSet;

    .line 45
    new-instance p1, Ll/۠ۗۚ;

    invoke-direct {p1, p0}, Ll/۠ۗۚ;-><init>(Ll/ܶۗۚ;)V

    iput-object p1, p0, Ll/ܶۗۚ;->ܿ:Ll/۠ۗۚ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܶۗۚ;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 47
    iget-object p0, p0, Ll/ܶۗۚ;->ܳ:Ljava/util/LinkedHashSet;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(ILl/᩻۬ۚ;)I
    .locals 8

    .line 104
    sget-object v0, Ll/᩸ۗۚ;->᩶:Ll/᩸ۗۚ;

    .line 99
    iget-object v1, p0, Ll/ܶۗۚ;->ܳ:Ljava/util/LinkedHashSet;

    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v3, Ll/ܶ᩶֨;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v0}, Ll/ܶ᩶֨;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/ܿ᩺ᩴ;->count()J

    move-result-wide v2

    long-to-int v3, v2

    .line 105
    sget-object v2, Ll/᩸ۗۚ;->ۗ:Ll/᩸ۗۚ;

    .line 99
    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v5, Ll/ܶ᩶֨;

    invoke-direct {v5, v4, v2}, Ll/ܶ᩶֨;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v5}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/ܿ᩺ᩴ;->count()J

    move-result-wide v1

    long-to-int v2, v1

    const/4 v1, 0x0

    if-gtz v2, :cond_1

    if-lez v3, :cond_0

    goto :goto_0

    :cond_0
    return v1

    .line 108
    :cond_1
    :goto_0
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/4 v5, 0x1

    const-string v6, ""

    if-lez v2, :cond_3

    .line 110
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v7, v5, [Ljava/lang/Object;

    aput-object v2, v7, v1

    const-string v2, "%d warning(s)"

    .line 19
    invoke-static {v2, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-lez v3, :cond_2

    const-string v6, ", "

    .line 110
    :cond_2
    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_3
    if-lez v3, :cond_4

    .line 111
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v3, v5, [Ljava/lang/Object;

    aput-object v2, v3, v1

    const-string v2, "%d error(s) "

    .line 19
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_4
    const-string v2, " "

    :goto_1
    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v6, v3, v1

    aput-object v2, v3, v5

    aput-object p2, v3, v4

    .line 75
    sget-object p2, Ll/ۨۗۚ;->ۙ:Ll/ۨۗۚ;

    invoke-virtual {p0}, Ll/ܰۗۚ;->֫()Ljava/lang/String;

    move-result-object v2

    const-string v4, "{0}{1}in the file: {2}"

    invoke-static {v4, v3}, Ll/ܰۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2, v0, v2, v3, v1}, Ll/ۨۗۚ;->֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 76
    iget-object v0, p0, Ll/ܶۗۚ;->ܿ:Ll/۠ۗۚ;

    invoke-virtual {v0, p2}, Ll/۠ۗۚ;->accept(Ljava/lang/Object;)V

    return p1
.end method

.method public final varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 69
    sget-object v0, Ll/ۨۗۚ;->ۗ:Ll/ۨۗۚ;

    sget-object v1, Ll/᩸ۗۚ;->᩶:Ll/᩸ۗۚ;

    invoke-virtual {p0}, Ll/ܰۗۚ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, p2}, Ll/ܰۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, p1, p2}, Ll/ۨۗۚ;->֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 70
    iget-object p2, p0, Ll/ܶۗۚ;->ܿ:Ll/۠ۗۚ;

    invoke-virtual {p2, p1}, Ll/۠ۗۚ;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 4

    .line 88
    sget-object v0, Ll/ۨۗۚ;->ۗ:Ll/ۨۗۚ;

    sget-object v1, Ll/᩸ۗۚ;->᩶:Ll/᩸ۗۚ;

    invoke-virtual {p0}, Ll/ܰۗۚ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, p1, v3}, Ll/ۨۗۚ;->֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 89
    iget-object v0, p0, Ll/ܶۗۚ;->ܿ:Ll/۠ۗۚ;

    invoke-virtual {v0, p1}, Ll/۠ۗۚ;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final varargs ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 94
    invoke-static {p1, p2}, Ll/ܰۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized ܽ()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 118
    :try_start_0
    iget-object v1, p0, Ll/ܶۗۚ;->ܳ:Ljava/util/LinkedHashSet;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 75
    iget-object v2, p0, Ll/ܰۗۚ;->ۧ:Ll/ܶ۬ۚ;

    .line 121
    iget-object v1, p0, Ll/ܶۗۚ;->ܳ:Ljava/util/LinkedHashSet;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 122
    invoke-virtual {v2, v3}, Ll/ܶ۬ۚ;->ܿ(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 124
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 125
    :try_start_1
    invoke-interface {v2}, Ll/֨۬ۚ;->flush()V

    .line 126
    iget-object v2, p0, Ll/ܶۗۚ;->ܳ:Ljava/util/LinkedHashSet;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->clear()V

    .line 127
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v2

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 129
    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final varargs ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 63
    sget-object v0, Ll/ۨۗۚ;->ۗ:Ll/ۨۗۚ;

    sget-object v1, Ll/᩸ۗۚ;->ۗ:Ll/᩸ۗۚ;

    invoke-virtual {p0}, Ll/ܰۗۚ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, p2}, Ll/ܰۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, p1, p2}, Ll/ۨۗۚ;->֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 64
    iget-object p2, p0, Ll/ܶۗۚ;->ܿ:Ll/۠ۗۚ;

    invoke-virtual {p2, p1}, Ll/۠ۗۚ;->accept(Ljava/lang/Object;)V

    return-void
.end method
