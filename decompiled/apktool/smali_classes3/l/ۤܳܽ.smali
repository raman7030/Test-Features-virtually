.class public Ll/ۤܳܽ;
.super Ljava/lang/Object;
.source "P1F8"


# instance fields
.field public final ֫:Ll/ۢ᩻ܽ;

.field public volatile ۧ:Ll/ܿᩳܽ;

.field public final ܽ:Ll/ۖ᩵;

.field public final ܿ:Ljava/lang/ThreadLocal;

.field public final ᩳ:Ll/۠ᩴᩴ;


# direct methods
.method public constructor <init>(Ll/ۢ᩻ܽ;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    iput-object v0, p0, Ll/ۤܳܽ;->ܽ:Ll/ۖ᩵;

    .line 32
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Ll/ۤܳܽ;->ܿ:Ljava/lang/ThreadLocal;

    .line 33
    new-instance v0, Ll/۠ᩴᩴ;

    invoke-direct {v0}, Ll/۠ᩴᩴ;-><init>()V

    iput-object v0, p0, Ll/ۤܳܽ;->ᩳ:Ll/۠ᩴᩴ;

    .line 37
    iput-object p1, p0, Ll/ۤܳܽ;->֫:Ll/ۢ᩻ܽ;

    return-void
.end method

.method public static ֫(Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 101
    invoke-interface {p0}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    if-eq p1, v1, :cond_1

    .line 102
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v2

    if-ne v2, p1, :cond_0

    .line 103
    :cond_1
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡᩻ܽ;

    .line 104
    invoke-interface {v3}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 105
    new-instance v2, Ll/ܶ֡ۚ;

    const/4 v4, 0x1

    invoke-direct {v2, v4, p3}, Ll/ܶ֡ۚ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v3, v2}, Ll/֡᩻ܽ;->֫(Ll/ܶ᩻ܽ;)I

    move-result v2

    if-eq v2, v1, :cond_0

    .line 107
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result p0

    shl-int/lit8 p0, p0, 0x18

    invoke-interface {v3}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result p1

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p0, p1

    or-int/2addr p0, v2

    return p0

    :cond_3
    return v1
.end method


# virtual methods
.method public ֫(ILjava/lang/String;)I
    .locals 6

    const-string v0, ":"

    const/4 v1, 0x2

    .line 70
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 71
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v1, :cond_0

    .line 72
    aget-object p2, v0, v3

    .line 73
    aget-object v0, v0, v4

    move-object v5, v0

    move-object v0, p2

    move-object p2, v5

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x2f

    .line 75
    invoke-virtual {p2, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    goto :goto_1

    .line 78
    :cond_1
    invoke-virtual {p2, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/2addr v1, v4

    .line 79
    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    if-eqz v0, :cond_4

    .line 82
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    .line 85
    :cond_2
    iget-object p1, p0, Ll/ۤܳܽ;->ᩳ:Ll/۠ᩴᩴ;

    invoke-virtual {p1, v2, v0}, Ll/۫ۘᩴ;->֫(ILjava/lang/String;)I

    move-result p1

    if-ne p1, v2, :cond_4

    const-string p1, "android"

    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    :goto_1
    return v2

    .line 93
    :cond_4
    :goto_2
    iget-object v0, p0, Ll/ۤܳܽ;->֫:Ll/ۢ᩻ܽ;

    invoke-static {v0, p1, v3, p2}, Ll/ۤܳܽ;->֫(Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-ne v0, v2, :cond_5

    if-ne p1, v4, :cond_5

    .line 95
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v0

    invoke-static {v0, p1, v3, p2}, Ll/ۤܳܽ;->֫(Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_5
    return v0
.end method

.method public ֫(Ljava/lang/String;)I
    .locals 2

    .line 61
    iget-object v0, p0, Ll/ۤܳܽ;->ᩳ:Ll/۠ᩴᩴ;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, p1}, Ll/۫ۘᩴ;->֫(ILjava/lang/String;)I

    move-result v0

    if-ne v0, v1, :cond_0

    const-string v1, "android"

    .line 62
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final ֫(Ljava/lang/String;Ll/۠ܳܽ;)Ljava/lang/Object;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ۤܳܽ;->ܽ:Ll/ۖ᩵;

    invoke-static {v0, p1, p2}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ljava/util/List;
    .locals 2

    .line 121
    iget-object v0, p0, Ll/ۤܳܽ;->ܿ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    .line 122
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    return-object v1
.end method

.method public final ֫(III)V
    .locals 2

    .line 127
    iget-object v0, p0, Ll/ۤܳܽ;->ܿ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    .line 128
    new-instance v1, Ll/᩻᩻ܽ;

    invoke-direct {v1, p1, p2, p3}, Ll/᩻᩻ܽ;-><init>(III)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۙܿܽ;II)V
    .locals 2

    .line 132
    iget-object v0, p0, Ll/ۤܳܽ;->ܿ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    invoke-virtual {p1}, Ll/ۛᩳܽ;->ᩳ֫()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ll/ۛᩳܽ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ll/ۛᩳܽ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 134
    :cond_1
    :goto_0
    new-instance v1, Ll/᩻᩻ܽ;

    invoke-direct {v1, p1, p2, p3}, Ll/᩻᩻ܽ;-><init>(Ll/ۙܿܽ;II)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۙܿܽ;Ll/֨ۘܽ;)V
    .locals 1

    .line 139
    invoke-virtual {p2}, Ll/ۡۘܽ;->ܿ()I

    move-result v0

    invoke-virtual {p2}, Ll/ۡۘܽ;->ܽ()I

    move-result p2

    invoke-virtual {p0, p1, v0, p2}, Ll/ۤܳܽ;->֫(Ll/ۙܿܽ;II)V

    return-void
.end method

.method public ۧ()Ll/ܿᩳܽ;
    .locals 3

    .line 41
    iget-object v0, p0, Ll/ۤܳܽ;->ۧ:Ll/ܿᩳܽ;

    if-nez v0, :cond_1

    move-object v0, p0

    .line 42
    monitor-enter v0

    .line 43
    :try_start_0
    iget-object v1, p0, Ll/ۤܳܽ;->ۧ:Ll/ܿᩳܽ;

    if-nez v1, :cond_0

    .line 44
    new-instance v1, Ll/ܿᩳܽ;

    iget-object v2, p0, Ll/ۤܳܽ;->֫:Ll/ۢ᩻ܽ;

    invoke-direct {v1, v2}, Ll/ܿᩳܽ;-><init>(Ll/ۢ᩻ܽ;)V

    iput-object v1, p0, Ll/ۤܳܽ;->ۧ:Ll/ܿᩳܽ;

    .line 46
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 48
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۤܳܽ;->ۧ:Ll/ܿᩳܽ;

    return-object v0
.end method

.method public final ۧ(ILjava/lang/String;)V
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۤܳܽ;->ᩳ:Ll/۠ᩴᩴ;

    invoke-virtual {v0, p1, p2}, Ll/۠ᩴᩴ;->֫(ILjava/lang/Object;)I

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ll/ۤܳܽ;->ܿ:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
