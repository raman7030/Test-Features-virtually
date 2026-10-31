.class public final Ll/۫ۙܳ;
.super Ljava/lang/Object;
.source "Y4UF"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/ᩳۜܳ;

.field public final ܽ:Ljava/util/LinkedList;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ᩳۜܳ;Ljava/lang/String;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/۫ۙܳ;->ܽ:Ljava/util/LinkedList;

    .line 29
    iput-object p1, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    .line 30
    iput-object p2, p0, Ll/۫ۙܳ;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫ۙܳ;)Ljava/util/LinkedList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۙܳ;->ܽ:Ljava/util/LinkedList;

    return-object p0
.end method

.method public static ֫(Ll/۫ۙܳ;Ll/ۢۢۡ;Ll/ۧۜܳ;Ll/ܽ᩷ܳ;ILl/ۨܺ᩷;)V
    .locals 2

    .line 73
    :cond_0
    invoke-virtual {p1}, Ll/ۢۢۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2

    const-wide/16 v0, 0xa

    .line 74
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 75
    invoke-direct {p0}, Ll/۫ۙܳ;->ܿ()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 77
    :cond_1
    sget v0, Ll/ܿ᩺;->֫:I

    .line 4137
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 81
    :cond_2
    iget-object p1, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {p2, p3, p1, p4}, Ll/ۧۜܳ;->֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;

    move-result-object p1

    .line 82
    iget-object p2, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {p2, p1}, Ll/ᩳۜܳ;->֫(Ll/ۨܺ᩷;)V

    if-eq p1, p5, :cond_3

    .line 83
    invoke-direct {p0}, Ll/۫ۙܳ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 109
    new-instance p1, Ll/۬ۙܳ;

    .line 116
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-object p0, p1, Ll/۬ۙܳ;->֫:Ll/۫ۙܳ;

    .line 110
    new-instance p0, Ll/ۗۙܳ;

    invoke-direct {p0, p1}, Ll/ۗۙܳ;-><init>(Ll/۬ۙܳ;)V

    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۫ۙܳ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۫ۙܳ;->ܿ()Z

    move-result p0

    return p0
.end method

.method private ܿ()Z
    .locals 3

    .line 95
    iget-object v0, p0, Ll/۫ۙܳ;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 97
    :cond_0
    iget-object v0, p0, Ll/۫ۙܳ;->ܽ:Ljava/util/LinkedList;

    monitor-enter v0

    .line 98
    :try_start_0
    iget-object v1, p0, Ll/۫ۙܳ;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    .line 99
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 100
    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 101
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p0, :cond_1

    .line 102
    invoke-interface {v1}, Ljava/util/ListIterator;->remove()V

    goto :goto_0

    .line 104
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    iget-object v0, p0, Ll/۫ۙܳ;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    .line 104
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫()Ll/ᩳۜܳ;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    return-object v0
.end method

.method public final ֫(Ll/ۢۧ᩻;)V
    .locals 0

    .line 38
    iput-object p1, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    return-void
.end method

.method public final ֫(Ll/ܽ᩷ܳ;Landroid/widget/ImageView;Ljava/util/concurrent/ExecutorService;Ll/ۢۢۡ;)V
    .locals 9

    .line 60
    invoke-virtual {p2, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 61
    iget-object v0, p0, Ll/۫ۙܳ;->ܽ:Ljava/util/LinkedList;

    monitor-enter v0

    .line 62
    :try_start_0
    iget-object v1, p0, Ll/۫ۙܳ;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 63
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->᩻()Ll/ۧۜܳ;

    move-result-object v5

    .line 65
    iget-object v0, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getIcon()Ll/ۨܺ᩷;

    move-result-object v0

    if-nez v0, :cond_1

    .line 66
    iget-object v0, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {v5, v0}, Ll/ۧۜܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object v0

    .line 244
    iget-object v8, v0, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    .line 67
    invoke-virtual {v8}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    iget-object p2, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {v5, p2}, Ll/ۧۜܳ;->ۧ(Ll/ᩳۜܳ;)I

    move-result v7

    if-nez v7, :cond_0

    .line 70
    iget-object p1, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {p1, v8}, Ll/ᩳۜܳ;->֫(Ll/ۨܺ᩷;)V

    return-void

    .line 72
    :cond_0
    new-instance p2, Ll/ۙۙܳ;

    move-object v2, p2

    move-object v3, p0

    move-object v4, p4

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, Ll/ۙۙܳ;-><init>(Ll/۫ۙܳ;Ll/ۢۢۡ;Ll/ۧۜܳ;Ll/ܽ᩷ܳ;ILl/ۨܺ᩷;)V

    invoke-interface {p3, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 89
    :cond_1
    iget-object p1, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getIcon()Ll/ۨܺ᩷;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :catchall_0
    move-exception p1

    .line 63
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/۫ۙܳ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 2

    .line 54
    iget-object v0, p0, Ll/۫ۙܳ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 46
    iget-object v1, p0, Ll/۫ۙܳ;->ᩳ:Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
