.class public final Ll/֫֡ܽ;
.super Ljava/lang/Object;
.source "66PI"


# instance fields
.field public final ֫:I

.field public final ۜ:Ljava/util/Map;

.field public final ۡ:Ll/ۛۚܽ;

.field public final ۢ:Ll/۠ۜܳ;

.field public final ۧ:I

.field public final ܳ:Ljava/util/BitSet;

.field public final ܺ:Ll/۟ۘܽ;

.field public final ܽ:Z

.field public final ܿ:I

.field public final ᩳ:I

.field public volatile ᩷:Ll/ۢ۠ܽ;

.field public final ᩻:Ll/ۛۚܽ;


# direct methods
.method public constructor <init>(Ll/ۛۚܽ;Ll/ۛۚܽ;IIIILl/۟ۘܽ;ZLjava/util/BitSet;Ljava/util/Map;Ll/۠ۜܳ;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Ll/֫֡ܽ;->ۡ:Ll/ۛۚܽ;

    .line 26
    iput-object p2, p0, Ll/֫֡ܽ;->᩻:Ll/ۛۚܽ;

    .line 27
    iput p3, p0, Ll/֫֡ܽ;->ۧ:I

    .line 28
    iput p4, p0, Ll/֫֡ܽ;->֫:I

    .line 29
    iput p5, p0, Ll/֫֡ܽ;->ᩳ:I

    .line 30
    iput p6, p0, Ll/֫֡ܽ;->ܿ:I

    .line 31
    iput-object p7, p0, Ll/֫֡ܽ;->ܺ:Ll/۟ۘܽ;

    .line 32
    iput-boolean p8, p0, Ll/֫֡ܽ;->ܽ:Z

    if-nez p9, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p9}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/BitSet;

    :goto_0
    iput-object p1, p0, Ll/֫֡ܽ;->ܳ:Ljava/util/BitSet;

    .line 0
    new-instance p1, Ljava/util/HashMap;

    invoke-interface {p10}, Ljava/util/Map;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface {p10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    invoke-static {p4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, p4, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 35
    iput-object p1, p0, Ll/֫֡ܽ;->ۜ:Ljava/util/Map;

    .line 36
    iput-object p11, p0, Ll/֫֡ܽ;->ۢ:Ll/۠ۜܳ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۢ۠ܽ;
    .locals 2

    .line 41
    iget-object v1, p0, Ll/֫֡ܽ;->᩷:Ll/ۢ۠ܽ;

    if-nez v1, :cond_1

    move-object v0, p0

    .line 43
    monitor-enter v0

    .line 44
    :try_start_0
    iget-object v1, p0, Ll/֫֡ܽ;->᩷:Ll/ۢ۠ܽ;

    if-nez v1, :cond_0

    .line 45
    iget-object v1, p0, Ll/֫֡ܽ;->ۢ:Ll/۠ۜܳ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Ll/ۖᩴܽ;->֫(Ll/֫֡ܽ;)Ll/ۢ۠ܽ;

    move-result-object v1

    iput-object v1, p0, Ll/֫֡ܽ;->᩷:Ll/ۢ۠ܽ;

    .line 46
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    return-object v1
.end method

.method public final ֫(I)Z
    .locals 1

    .line 52
    iget-object v0, p0, Ll/֫֡ܽ;->ܳ:Ljava/util/BitSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
