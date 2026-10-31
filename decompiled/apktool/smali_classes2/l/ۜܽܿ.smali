.class public final Ll/ۜܽܿ;
.super Ljava/lang/Object;
.source "N6R3"


# static fields
.field public static final ᩷:I


# instance fields
.field public final ֫:Ljava/util/function/BooleanSupplier;

.field public final ۜ:I

.field public final ۧ:Ljava/util/concurrent/CountDownLatch;

.field public final ܳ:[Ll/᩷۟ᩳ;

.field public final ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ܿ:Ljava/util/function/Supplier;

.field public final ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ᩻:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 21
    sget v0, Ll/ܿ᩸ۡ;->֫:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x4

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sput v0, Ll/ۜܽܿ;->᩷:I

    return-void
.end method

.method public constructor <init>(Ljava/util/function/Supplier;Ljava/util/List;Ljava/util/function/BooleanSupplier;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۜܽܿ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 32
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ۜܽܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    iput-object p1, p0, Ll/ۜܽܿ;->ܿ:Ljava/util/function/Supplier;

    .line 38
    iput-object p2, p0, Ll/ۜܽܿ;->᩻:Ljava/util/List;

    .line 39
    iput-object p3, p0, Ll/ۜܽܿ;->֫:Ljava/util/function/BooleanSupplier;

    .line 40
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ll/᩷۟ᩳ;

    iput-object p1, p0, Ll/ۜܽܿ;->ܳ:[Ll/᩷۟ᩳ;

    .line 41
    sget p1, Ll/ۜܽܿ;->᩷:I

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/ۜܽܿ;->ۜ:I

    .line 42
    new-instance p2, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p2, p1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p2, p0, Ll/ۜܽܿ;->ۧ:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜܽܿ;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜܽܿ;->ۧ:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method public static ֫(Ljava/util/function/Supplier;Ljava/util/List;Ljava/util/function/BooleanSupplier;)Ll/᩷۟ᩳ;
    .locals 5

    .line 50
    new-instance v0, Ll/ۜܽܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۜܽܿ;-><init>(Ljava/util/function/Supplier;Ljava/util/List;Ljava/util/function/BooleanSupplier;)V

    .line 71
    iget-object p0, v0, Ll/ۜܽܿ;->ۧ:Ljava/util/concurrent/CountDownLatch;

    iget-object p1, v0, Ll/ۜܽܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 72
    :goto_0
    iget v3, v0, Ll/ۜܽܿ;->ۜ:I

    if-ge v2, v3, :cond_0

    new-instance v3, Ll/᩻ܽܿ;

    invoke-direct {v3, v0}, Ll/᩻ܽܿ;-><init>(Ll/ۜܽܿ;)V

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    .line 75
    :try_start_0
    sget-object v3, Ll/֫ۨۡ;->֫:Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, p2}, Ll/֫ۨۡ;->֫(Ljava/util/concurrent/ExecutorService;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v3

    .line 76
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/Future;

    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ܽܿ;

    invoke-virtual {v3}, Ll/᩻ܽܿ;->֫()V

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    .line 86
    :goto_3
    :try_start_1
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz p2, :cond_3

    .line 93
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 95
    :cond_3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p0

    if-nez p0, :cond_6

    iget-object p0, v0, Ll/ۜܽܿ;->֫:Ljava/util/function/BooleanSupplier;

    invoke-interface {p0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_5

    .line 96
    :cond_4
    new-instance p0, Ll/᩷۟ᩳ;

    invoke-direct {p0}, Ll/᩷۟ᩳ;-><init>()V

    .line 97
    iget-object p1, v0, Ll/ۜܽܿ;->ܳ:[Ll/᩷۟ᩳ;

    array-length p2, p1

    :goto_4
    if-ge v1, p2, :cond_7

    aget-object v0, p1, v1

    if-eqz v0, :cond_5

    .line 99
    invoke-virtual {p0, v0}, Ll/᩷۟ᩳ;->֫(Ll/᩷۟ᩳ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 98
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Missing wrap batch result"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_5
    const/4 p0, 0x0

    :cond_7
    return-object p0

    .line 90
    :catch_0
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 p2, 0x1

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    .line 78
    :goto_6
    :try_start_2
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 79
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 80
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    :goto_7
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ܽܿ;

    invoke-virtual {v3}, Ll/᩻ܽܿ;->֫()V

    goto :goto_8

    .line 86
    :cond_8
    :goto_9
    :try_start_3
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_3

    if-eqz v1, :cond_9

    .line 93
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 94
    :cond_9
    throw v0

    .line 90
    :catch_3
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 v1, 0x1

    goto :goto_9
.end method

.method public static ֫(Ll/ۗۧܿ;Ljava/util/ArrayList;Ll/᩶ۧܿ;)Ll/᩷۟ᩳ;
    .locals 5

    .line 59
    new-instance v0, Ll/᩷۟ᩳ;

    invoke-direct {v0}, Ll/᩷۟ᩳ;-><init>()V

    .line 60
    iget-object p0, p0, Ll/ۗۧܿ;->᩸:Ll/ܿܽܿ;

    invoke-virtual {p0}, Ll/ۗۤᩳ;->᩹()Ll/۟᩸ᩳ;

    move-result-object p0

    .line 61
    :try_start_0
    invoke-virtual {p0}, Ll/۟᩸ᩳ;->᩻()Ll/ܰ᩸ᩳ;

    move-result-object v1

    .line 62
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳܽܿ;

    .line 63
    invoke-virtual {p2}, Ll/᩶ۧܿ;->getAsBoolean()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    .line 66
    invoke-virtual {p0}, Ll/۟᩸ᩳ;->close()V

    return-object v3

    .line 64
    :cond_0
    :try_start_1
    invoke-interface {v2, v1}, Ll/ܳܽܿ;->֫(Ll/ܰ᩸ᩳ;)Ll/᩷۟ᩳ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩷۟ᩳ;->֫(Ll/᩷۟ᩳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p0}, Ll/۟᩸ᩳ;->close()V

    .line 67
    invoke-virtual {p2}, Ll/᩶ۧܿ;->getAsBoolean()Z

    move-result p0

    if-eqz p0, :cond_2

    return-object v3

    :cond_2
    return-object v0

    :catchall_0
    move-exception p1

    .line 60
    :try_start_2
    invoke-virtual {p0}, Ll/۟᩸ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public static bridge synthetic ۧ(Ll/ۜܽܿ;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜܽܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۜܽܿ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜܽܿ;->᩻:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۜܽܿ;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜܽܿ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۜܽܿ;)[Ll/᩷۟ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜܽܿ;->ܳ:[Ll/᩷۟ᩳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۜܽܿ;)Ljava/util/function/Supplier;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜܽܿ;->ܿ:Ljava/util/function/Supplier;

    return-object p0
.end method

.method public static ᩻(Ll/ۜܽܿ;)Z
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۜܽܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p0, p0, Ll/ۜܽܿ;->֫:Ljava/util/function/BooleanSupplier;

    invoke-interface {p0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
