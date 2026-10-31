.class public final Ll/ۗۛܳ;
.super Ll/ۘۘܳ;
.source "NB79"


# instance fields
.field public final ܿ:Ll/ۧۤᩴ;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ۖۛܳ;)V
    .locals 3

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    .line 42
    invoke-virtual {p1}, Ll/ۖۛܳ;->᩶ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/۠ۛܳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/ܶۛܳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/᩸ۛܳ;

    invoke-direct {v2, p0}, Ll/᩸ۛܳ;-><init>(Ll/ۗۛܳ;)V

    .line 51
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 52
    invoke-virtual {v0}, Ll/ۧۤᩴ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 55
    :cond_0
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/᩹ۛܳ;

    invoke-direct {v1, p0, p1}, Ll/᩹ۛܳ;-><init>(Ll/ۗۛܳ;Ll/ۖۛܳ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/᩶ۖܳ;Ll/᩶ۖܳ;)Ll/ۨܺ᩷;
    .locals 1

    .line 201
    invoke-static {p0}, Ll/ۘۘܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    iget-object p0, p2, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p0

    .line 204
    :cond_0
    invoke-static {p0}, Ll/۬۫ۡ;->֫(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-static {p0}, Ll/ۨܺ᩷;->֫(Landroid/graphics/Bitmap;)Ll/ۨܺ᩷;

    move-result-object p0

    if-nez p0, :cond_1

    .line 206
    iget-object p0, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    :cond_1
    return-object p0
.end method

.method public static synthetic ֫(Ll/ۗۛܳ;Ll/ۖۛܳ;)V
    .locals 7

    .line 56
    iget-object v0, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/۫ܳᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۧ᩺ᩴ;->toArray()[I

    move-result-object v1

    .line 57
    array-length v2, v1

    const/4 v3, 0x0

    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget v0, v1, v4

    .line 58
    iget-object v5, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙۛܳ;

    if-eqz v5, :cond_0

    .line 59
    invoke-static {v5}, Ll/ۙۛܳ;->֫(Ll/ۙۛܳ;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ۘۘܳ;->֫(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 60
    iget-object v6, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v5

    .line 61
    monitor-enter v0

    .line 62
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V

    .line 63
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 66
    :cond_1
    iget-object v0, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 69
    :cond_2
    iget-object v0, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/۫ܳᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۧ᩺ᩴ;->toArray()[I

    move-result-object v0

    const/4 v1, 0x0

    .line 72
    :try_start_1
    invoke-virtual {p1}, Ll/ۖۛܳ;->᩸()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v1

    .line 74
    new-instance p1, Ll/᩶ۛܳ;

    invoke-direct {p1, p0, v1}, Ll/᩶ۛܳ;-><init>(Ll/ۗۛܳ;Lnet/sf/sevenzipjbinding/IInArchive;)V

    invoke-interface {v1, v0, v3, p1}, Lnet/sf/sevenzipjbinding/IInArchive;->extract([IZLnet/sf/sevenzipjbinding/IArchiveExtractCallback;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    .line 148
    iget-object p0, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    invoke-virtual {p0}, Ll/ۧۤᩴ;->clear()V

    .line 149
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 150
    throw p1

    .line 148
    :catch_0
    :goto_2
    iget-object p0, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    invoke-virtual {p0}, Ll/ۧۤᩴ;->clear()V

    .line 149
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۗۛܳ;Ll/ۙۛܳ;)V
    .locals 1

    .line 51
    iget-object p0, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    invoke-static {p1}, Ll/ۙۛܳ;->ܽ(Ll/ۙۛܳ;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗۛܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۗۛܳ;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۗۛܳ;)Ll/ۧۤᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    return-object p0
.end method

.method public static synthetic ܳ(Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-static {p0}, Ll/ۘۘܳ;->ᩳ(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳۜܳ;I)Ljava/lang/String;
    .locals 0

    .line 37
    check-cast p1, Ll/ۤۤܳ;

    invoke-virtual {p1}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object p1

    invoke-static {p1}, Ll/۫ۤܳ;->֫(Ll/ۘܳᩳ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;
    .locals 5

    .line 165
    move-object p1, p2

    check-cast p1, Ll/ۤۤܳ;

    .line 166
    invoke-virtual {p1}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object p1

    .line 167
    invoke-virtual {p1}, Ll/ۘܳᩳ;->ܽ()I

    move-result v1

    .line 168
    iget-object v0, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll/ۙۛܳ;

    if-eqz v2, :cond_1

    :cond_0
    move-object v0, v2

    .line 171
    monitor-enter v0

    const-wide/16 v3, 0x3e8

    .line 173
    :try_start_0
    invoke-virtual {v2, v3, v4}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 177
    :catch_0
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    iget-object v0, p0, Ll/ۗۛܳ;->ܿ:Ll/ۧۤᩴ;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ۧۤᩴ;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 177
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 181
    :cond_1
    :goto_2
    invoke-static {p1}, Ll/۫ۤܳ;->֫(Ll/ۘܳᩳ;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    if-eq p3, v0, :cond_5

    const/4 v0, 0x2

    if-eq p3, v0, :cond_4

    const/4 v0, 0x3

    if-ne p3, v0, :cond_3

    .line 190
    sget-object p3, Ll/᩶ۖܳ;->ۛ֫:Ll/᩶ۖܳ;

    invoke-static {p1, p3, p3}, Ll/ۗۛܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;Ll/᩶ۖܳ;)Ll/ۨܺ᩷;

    move-result-object p1

    .line 191
    iget-object p3, p3, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    if-eq p1, p3, :cond_2

    const p3, 0x7f0a02a4

    .line 192
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p3, v0}, Ll/ᩳۜܳ;->ۧ(ILjava/lang/Object;)V

    :cond_2
    return-object p1

    .line 197
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 187
    :cond_4
    sget-object p2, Ll/᩶ۖܳ;->ۗ:Ll/᩶ۖܳ;

    sget-object p3, Ll/᩶ۖܳ;->۬:Ll/᩶ۖܳ;

    invoke-static {p1, p2, p3}, Ll/ۗۛܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;Ll/᩶ۖܳ;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1

    .line 184
    :cond_5
    sget-object p2, Ll/᩶ۖܳ;->ۗ:Ll/᩶ۖܳ;

    sget-object p3, Ll/᩶ۖܳ;->۬:Ll/᩶ۖܳ;

    invoke-static {p1, p2, p3}, Ll/ۗۛܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;Ll/᩶ۖܳ;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ᩳۜܳ;)I
    .locals 1

    .line 156
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 158
    :cond_0
    check-cast p1, Ll/ۤۤܳ;

    .line 159
    invoke-virtual {p1}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object p1

    invoke-static {p1}, Ll/۫ۤܳ;->ۧ(Ll/ۘܳᩳ;)I

    move-result p1

    return p1
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 212
    iput-boolean v0, p0, Ll/ۗۛܳ;->ᩳ:Z

    return-void
.end method
