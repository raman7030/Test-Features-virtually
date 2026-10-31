.class public Ll/᩷ۛ᩵;
.super Ljava/lang/Object;
.source "TAXM"


# static fields
.field public static final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ᩹:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _next:Ljava/lang/Object;

.field public volatile synthetic _prev:Ljava/lang/Object;

.field public volatile synthetic _removedRef:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "_next"

    .line 0
    const-class v1, Ll/᩷ۛ᩵;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩷ۛ᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_prev"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩷ۛ᩵;->᩹:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_removedRef"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩷ۛ᩵;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p0, p0, Ll/᩷ۛ᩵;->_next:Ljava/lang/Object;

    .line 67
    iput-object p0, p0, Ll/᩷ۛ᩵;->_prev:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Ll/᩷ۛ᩵;->_removedRef:Ljava/lang/Object;

    return-void
.end method

.method private final ֫(Ll/᩷ۛ᩵;)V
    .locals 3

    .line 682
    :goto_0
    iget-object v0, p1, Ll/᩷ۛ᩵;->_prev:Ljava/lang/Object;

    check-cast v0, Ll/᩷ۛ᩵;

    .line 547
    invoke-virtual {p0}, Ll/᩷ۛ᩵;->᩻()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_0

    goto :goto_1

    .line 548
    :cond_0
    sget-object v1, Ll/᩷ۛ᩵;->᩹:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_1
    invoke-virtual {v1, p1, v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 551
    invoke-virtual {p0}, Ll/᩷ۛ᩵;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p1}, Ll/᩷ۛ᩵;->ۘ()Ll/᩷ۛ᩵;

    :cond_2
    :goto_1
    return-void

    .line 0
    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v0, :cond_1

    goto :goto_0
.end method

.method private final ۘ()Ll/᩷ۛ᩵;
    .locals 8

    .line 573
    :goto_0
    iget-object v0, p0, Ll/᩷ۛ᩵;->_prev:Ljava/lang/Object;

    check-cast v0, Ll/᩷ۛ᩵;

    const/4 v1, 0x0

    move-object v2, v0

    :goto_1
    move-object v3, v1

    .line 577
    :goto_2
    iget-object v4, v2, Ll/᩷ۛ᩵;->_next:Ljava/lang/Object;

    if-ne v4, p0, :cond_3

    if-ne v0, v2, :cond_0

    goto :goto_3

    .line 583
    :cond_0
    sget-object v5, Ll/᩷ۛ᩵;->᩹:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_1
    invoke-virtual {v5, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v0, :cond_1

    goto :goto_0

    .line 590
    :cond_3
    invoke-virtual {p0}, Ll/᩷ۛ᩵;->ܺ()Z

    move-result v5

    if-eqz v5, :cond_4

    return-object v1

    :cond_4
    if-nez v4, :cond_5

    :goto_3
    return-object v2

    .line 592
    :cond_5
    instance-of v5, v4, Ll/᩵ۛ᩵;

    if-eqz v5, :cond_6

    .line 595
    check-cast v4, Ll/᩵ۛ᩵;

    invoke-virtual {v4, v2}, Ll/᩵ۛ᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 598
    :cond_6
    instance-of v5, v4, Ll/֡ۛ᩵;

    if-eqz v5, :cond_a

    if-eqz v3, :cond_9

    .line 601
    sget-object v5, Ll/᩷ۛ᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    check-cast v4, Ll/֡ۛ᩵;

    iget-object v4, v4, Ll/֡ۛ᩵;->֫:Ll/᩷ۛ᩵;

    .line 0
    :cond_7
    invoke-virtual {v5, v3, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object v2, v3

    goto :goto_1

    :cond_8
    invoke-virtual {v5, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v2, :cond_7

    goto :goto_0

    .line 607
    :cond_9
    iget-object v2, v2, Ll/᩷ۛ᩵;->_prev:Ljava/lang/Object;

    check-cast v2, Ll/᩷ۛ᩵;

    goto :goto_2

    .line 612
    :cond_a
    move-object v3, v4

    check-cast v3, Ll/᩷ۛ᩵;

    move-object v7, v3

    move-object v3, v2

    move-object v2, v7

    goto :goto_2
.end method

.method public static final synthetic ۧ(Ll/᩷ۛ᩵;Ll/ܿۛ᩵;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Ll/᩷ۛ᩵;->֫(Ll/᩷ۛ᩵;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 623
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ll/ۜۛ᩵;

    .line 25
    invoke-direct {v1, p0}, Ll/ܿ᩶᩵;-><init>(Ll/᩷ۛ᩵;)V

    .line 623
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/ۧ۬᩵;->֫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩷ۛ᩵;Ll/ܿۛ᩵;Ll/᩻ۛ᩵;)I
    .locals 1

    .line 226
    sget-object v0, Ll/᩷ۛ᩵;->᩹:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 227
    sget-object v0, Ll/᩷ۛ᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 228
    iput-object p2, p3, Ll/᩻ۛ᩵;->ܽ:Ll/ܿۛ᩵;

    .line 0
    :cond_0
    invoke-virtual {v0, p0, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 231
    invoke-virtual {p3, p0}, Ll/ܰۤ᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x2

    return p1

    .line 0
    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/᩻۫᩵;)V
    .locals 2

    .line 124
    sget-object v0, Ll/᩷ۛ᩵;->᩹:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    sget-object v0, Ll/᩷ۛ᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    :goto_0
    invoke-virtual {p0}, Ll/᩷ۛ᩵;->᩻()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p0, :cond_0

    return-void

    .line 0
    :cond_0
    invoke-virtual {v0, p0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 131
    invoke-direct {p1, p0}, Ll/᩷ۛ᩵;->֫(Ll/᩷ۛ᩵;)V

    return-void

    .line 0
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p0, :cond_0

    goto :goto_0
.end method

.method public final ֫(Ll/᩷ۛ᩵;Ll/ܿۛ᩵;)Z
    .locals 2

    .line 215
    sget-object v0, Ll/᩷ۛ᩵;->᩹:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 216
    sget-object v0, Ll/᩷ۛ᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 0
    :cond_0
    invoke-virtual {v0, p0, p2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 219
    invoke-direct {p1, p2}, Ll/᩷ۛ᩵;->֫(Ll/᩷ۛ᩵;)V

    const/4 p1, 0x1

    return p1

    .line 0
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۖ()Ll/᩷ۛ᩵;
    .locals 5

    .line 251
    :goto_0
    invoke-virtual {p0}, Ll/᩷ۛ᩵;->᩻()Ljava/lang/Object;

    move-result-object v0

    .line 252
    instance-of v1, v0, Ll/֡ۛ᩵;

    if-eqz v1, :cond_0

    check-cast v0, Ll/֡ۛ᩵;

    iget-object v0, v0, Ll/֡ۛ᩵;->֫:Ll/᩷ۛ᩵;

    return-object v0

    :cond_0
    if-ne v0, p0, :cond_1

    .line 253
    check-cast v0, Ll/᩷ۛ᩵;

    return-object v0

    .line 254
    :cond_1
    move-object v1, v0

    check-cast v1, Ll/᩷ۛ᩵;

    .line 71
    iget-object v2, v1, Ll/᩷ۛ᩵;->_removedRef:Ljava/lang/Object;

    check-cast v2, Ll/֡ۛ᩵;

    if-nez v2, :cond_2

    new-instance v2, Ll/֡ۛ᩵;

    invoke-direct {v2, v1}, Ll/֡ۛ᩵;-><init>(Ll/᩷ۛ᩵;)V

    sget-object v3, Ll/᩷ۛ᩵;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 255
    :cond_2
    sget-object v3, Ll/᩷ۛ᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_3
    invoke-virtual {v3, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 257
    invoke-direct {v1}, Ll/᩷ۛ᩵;->ۘ()Ll/᩷ۛ᩵;

    const/4 v0, 0x0

    return-object v0

    .line 0
    :cond_4
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v0, :cond_3

    goto :goto_0
.end method

.method public final ۜ()Ll/᩷ۛ᩵;
    .locals 2

    .line 106
    invoke-virtual {p0}, Ll/᩷ۛ᩵;->᩻()Ljava/lang/Object;

    move-result-object v0

    .line 631
    instance-of v1, v0, Ll/֡ۛ᩵;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ll/֡ۛ᩵;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, v1, Ll/֡ۛ᩵;->֫:Ll/᩷ۛ᩵;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    return-object v1

    :cond_2
    :goto_1
    check-cast v0, Ll/᩷ۛ᩵;

    return-object v0
.end method

.method public final ۡ()V
    .locals 3

    move-object v0, p0

    .line 276
    :goto_0
    invoke-virtual {v0}, Ll/᩷ۛ᩵;->᩻()Ljava/lang/Object;

    move-result-object v1

    .line 277
    instance-of v2, v1, Ll/֡ۛ᩵;

    if-eqz v2, :cond_0

    .line 278
    check-cast v1, Ll/֡ۛ᩵;

    iget-object v0, v1, Ll/֡ۛ᩵;->֫:Ll/᩷ۛ᩵;

    goto :goto_0

    .line 281
    :cond_0
    invoke-direct {v0}, Ll/᩷ۛ᩵;->ۘ()Ll/᩷ۛ᩵;

    return-void
.end method

.method public final ۢ()V
    .locals 1

    .line 266
    invoke-virtual {p0}, Ll/᩷ۛ᩵;->᩻()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۛ᩵;

    iget-object v0, v0, Ll/֡ۛ᩵;->֫:Ll/᩷ۛ᩵;

    invoke-virtual {v0}, Ll/᩷ۛ᩵;->ۡ()V

    return-void
.end method

.method public ܺ()Z
    .locals 1

    .line 95
    invoke-virtual {p0}, Ll/᩷ۛ᩵;->᩻()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ll/֡ۛ᩵;

    return v0
.end method

.method public final ᩷()Ll/᩷ۛ᩵;
    .locals 2

    .line 114
    invoke-direct {p0}, Ll/᩷ۛ᩵;->ۘ()Ll/᩷ۛ᩵;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩷ۛ᩵;->_prev:Ljava/lang/Object;

    check-cast v0, Ll/᩷ۛ᩵;

    .line 117
    :goto_0
    invoke-virtual {v0}, Ll/᩷ۛ᩵;->ܺ()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 118
    :cond_0
    iget-object v0, v0, Ll/᩷ۛ᩵;->_prev:Ljava/lang/Object;

    check-cast v0, Ll/᩷ۛ᩵;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ᩻()Ljava/lang/Object;
    .locals 2

    .line 674
    :goto_0
    iget-object v0, p0, Ll/᩷ۛ᩵;->_next:Ljava/lang/Object;

    .line 100
    instance-of v1, v0, Ll/᩵ۛ᩵;

    if-nez v1, :cond_0

    return-object v0

    .line 101
    :cond_0
    check-cast v0, Ll/᩵ۛ᩵;

    invoke-virtual {v0, p0}, Ll/᩵ۛ᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method
