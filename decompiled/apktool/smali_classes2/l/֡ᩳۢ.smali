.class public final Ll/֡ᩳۢ;
.super Ljava/lang/Object;
.source "Q1K7"


# instance fields
.field public final ֫:Ll/֡ۛۡ;

.field public final ۖ:Ll/ۧ۫᩷;

.field public final ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۜ:Ll/ۧ۫᩷;

.field public final ۡ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public volatile ۢ:Z

.field public ۧ:Ll/ᩴᩳۢ;

.field public final ܳ:Ll/ۧ۫᩷;

.field public final ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ܽ:Ll/ۧۤᩴ;

.field public final ܿ:Ll/ۧ۫᩷;

.field public final ᩳ:Ll/۫ۧۢ;

.field public final ᩷:Ll/ۧۤᩴ;

.field public final ᩻:Ll/֫ۤᩴ;


# direct methods
.method public constructor <init>(Ll/۫ۧۢ;)V
    .locals 6

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/֡ᩳۢ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 75
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/֡ᩳۢ;->ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 76
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/֡ᩳۢ;->ۡ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 77
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/֡ᩳۢ;->᩷:Ll/ۧۤᩴ;

    .line 78
    invoke-static {}, Ll/ۧۤᩴ;->newKeySet()Ll/֫ۤᩴ;

    move-result-object v1

    iput-object v1, p0, Ll/֡ᩳۢ;->᩻:Ll/֫ۤᩴ;

    .line 79
    new-instance v2, Ll/ۧۤᩴ;

    invoke-direct {v2}, Ll/ۧۤᩴ;-><init>()V

    iput-object v2, p0, Ll/֡ᩳۢ;->ܽ:Ll/ۧۤᩴ;

    .line 80
    new-instance v2, Ll/֡ۛۡ;

    invoke-direct {v2}, Ll/֡ۛۡ;-><init>()V

    iput-object v2, p0, Ll/֡ᩳۢ;->֫:Ll/֡ۛۡ;

    .line 83
    iput-object p1, p0, Ll/֡ᩳۢ;->ᩳ:Ll/۫ۧۢ;

    .line 84
    new-instance v2, Ll/ۧ۫᩷;

    invoke-virtual {p1}, Ll/ܶ۬᩷;->֫()Ll/ۧ۫᩷;

    move-result-object p1

    const-string v3, "smali"

    invoke-direct {v2, p1, v3}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    iput-object v2, p0, Ll/֡ᩳۢ;->ܿ:Ll/ۧ۫᩷;

    .line 76
    invoke-virtual {v2}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 86
    invoke-virtual {v2}, Ll/ۧ۫᩷;->֫()Z

    .line 148
    :cond_0
    invoke-virtual {v2}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 89
    new-instance p1, Ll/ۧ۫᩷;

    const-string v3, "x"

    invoke-direct {p1, v2, v3}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    iput-object p1, p0, Ll/֡ᩳۢ;->ۖ:Ll/ۧ۫᩷;

    .line 90
    new-instance v3, Ll/ۧ۫᩷;

    const-string v4, "y"

    invoke-direct {v3, v2, v4}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    iput-object v3, p0, Ll/֡ᩳۢ;->ۜ:Ll/ۧ۫᩷;

    .line 91
    new-instance v4, Ll/ۧ۫᩷;

    const-string v5, "f"

    invoke-direct {v4, v2, v5}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    iput-object v4, p0, Ll/֡ᩳۢ;->ܳ:Ll/ۧ۫᩷;

    .line 92
    invoke-virtual {v2}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-static {v2}, Ll/۫ۜᩳ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 93
    invoke-direct {p0}, Ll/֡ᩳۢ;->᩻()V

    goto :goto_0

    .line 96
    :cond_1
    :try_start_0
    new-instance v2, Landroid/util/SparseLongArray;

    invoke-direct {v2}, Landroid/util/SparseLongArray;-><init>()V

    const/4 v4, 0x1

    .line 97
    invoke-direct {p0, p1, v4, v2}, Ll/֡ᩳۢ;->֫(Ll/ۧ۫᩷;ZLandroid/util/SparseLongArray;)V

    const/4 p1, 0x0

    .line 98
    invoke-direct {p0, v3, p1, v2}, Ll/֡ᩳۢ;->֫(Ll/ۧ۫᩷;ZLandroid/util/SparseLongArray;)V

    .line 99
    invoke-direct {p0}, Ll/֡ᩳۢ;->ܳ()V

    .line 100
    invoke-virtual {v0}, Ll/ۧۤᩴ;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Ll/۟۫ᩴ;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 101
    invoke-direct {p0}, Ll/֡ᩳۢ;->᩻()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 104
    :catch_0
    invoke-direct {p0}, Ll/֡ᩳۢ;->᩻()V

    .line 107
    :cond_2
    :goto_0
    new-instance p1, Ll/ᩴᩳۢ;

    invoke-direct {p1, p0}, Ll/ᩴᩳۢ;-><init>(Ll/֡ᩳۢ;)V

    iput-object p1, p0, Ll/֡ᩳۢ;->ۧ:Ll/ᩴᩳۢ;

    return-void
.end method

.method public static ֫(Ll/֡ᩳۢ;I)Ll/ܶ᩵ܿ;
    .locals 0

    .line 452
    iget-object p0, p0, Ll/֡ᩳۢ;->ܿ:Ll/ۧ۫᩷;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/֡ᩳۢ;)Ll/ᩴᩳۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ᩳۢ;->ۧ:Ll/ᩴᩳۢ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/֡ᩳۢ;ILl/᩷ۡ֫;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 12

    .line 213
    iget-object v0, p0, Ll/֡ᩳۢ;->ۧ:Ll/ᩴᩳۢ;

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "SmaliCache prepare"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 214
    iget-object v1, p0, Ll/֡ᩳۢ;->ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 216
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 218
    iget-object v2, p0, Ll/֡ᩳۢ;->ᩳ:Ll/۫ۧۢ;

    invoke-virtual {v2}, Ll/۫ۧۢ;->ܺ()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v10, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۧۢ;

    .line 219
    iget-object v6, v4, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    if-eqz v6, :cond_0

    add-int/lit8 v3, v3, 0x1

    .line 221
    iget-object v6, v4, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    if-nez v6, :cond_0

    iget-object v6, v4, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-direct {p0, v6}, Ll/֡ᩳۢ;->֫(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 222
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 226
    :cond_1
    sget-object v2, Ll/ᩳۧۢ;->᩻:Ljava/util/Comparator;

    invoke-static {v5, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 227
    new-instance v9, Ll/᩵ۛۡ;

    int-to-long v6, v3

    invoke-direct {v9, v6, v7}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance v2, Ll/ۡᩳۢ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v9, v2}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 228
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v3, v2

    invoke-virtual {v9, v3}, Ll/᩵ۛۡ;->֫(I)Z

    .line 229
    new-instance v4, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 231
    new-instance v11, Ll/ܺᩳۢ;

    move-object v2, v11

    move-object v3, p0

    move v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v2 .. v9}, Ll/ܺᩳۢ;-><init>(Ll/֡ᩳۢ;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/ArrayList;ILl/᩷ۡ֫;Ljava/util/concurrent/atomic/AtomicReference;Ll/᩵ۛۡ;)V

    .line 283
    sget p1, Ll/ܿ᩸ۡ;->֫:I

    const/4 p2, 0x4

    const/4 p3, 0x2

    if-lt p1, p2, :cond_2

    const/4 p1, 0x3

    goto :goto_1

    :cond_2
    const/4 p1, 0x2

    :goto_1
    if-gt p3, p1, :cond_3

    add-int/lit8 p2, p3, -0x1

    .line 286
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Ll/ۖᩳۢ;

    invoke-direct {v3, p0, v11, p2}, Ll/ۖᩳۢ;-><init>(Ll/֡ᩳۢ;Ll/ܺᩳۢ;I)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 296
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SmaliCache-"

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 297
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 299
    :cond_3
    invoke-virtual {v11, v10}, Ll/ܺᩳۢ;->accept(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 301
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p0

    if-nez p0, :cond_4

    .line 302
    invoke-virtual {v0}, Ll/ᩴᩳۢ;->ۧ()V

    :cond_4
    return-void

    :catchall_0
    move-exception p0

    .line 301
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_5

    .line 302
    invoke-virtual {v0}, Ll/ᩴᩳۢ;->ۧ()V

    .line 304
    :cond_5
    throw p0
.end method

.method public static ֫(Ll/֡ᩳۢ;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/ArrayList;ILl/᩷ۡ֫;Ljava/util/concurrent/atomic/AtomicReference;Ll/᩵ۛۡ;I)V
    .locals 7

    .line 232
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " start"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 233
    new-instance v0, Ll/۬ۜᩳ;

    invoke-direct {v0}, Ll/۬ۜᩳ;-><init>()V

    .line 235
    :goto_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    .line 236
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v1, v2, :cond_0

    .line 237
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " finish"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_6

    .line 240
    :cond_0
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۧۢ;

    .line 241
    iget-object v2, p0, Ll/֡ᩳۢ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    const-string v3, " canceled"

    if-ne v2, p3, :cond_d

    invoke-virtual {p4}, Ll/᩷ۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    sget-object v4, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v2, v4, :cond_1

    goto/16 :goto_5

    .line 245
    :cond_1
    iget-boolean v2, p0, Ll/֡ᩳۢ;->ۢ:Z

    const-class v4, Ll/᩻ܿۢ;

    if-nez v2, :cond_2

    invoke-virtual {p4}, Ll/᩷ۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    sget-object v5, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    invoke-virtual {v2, v5}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v2

    if-eqz v2, :cond_2

    if-lez p7, :cond_4

    .line 246
    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v4, :cond_4

    .line 247
    :cond_2
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " paused"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 248
    iget-object v2, p0, Ll/֡ᩳۢ;->ۡ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 249
    :goto_1
    iget-boolean v2, p0, Ll/֡ᩳۢ;->ۢ:Z

    if-nez v2, :cond_a

    invoke-virtual {p4}, Ll/᩷ۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    sget-object v5, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    invoke-virtual {v2, v5}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v2

    if-eqz v2, :cond_a

    if-lez p7, :cond_3

    .line 250
    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v4, :cond_3

    goto/16 :goto_3

    .line 257
    :cond_3
    iget-object v2, p0, Ll/֡ᩳۢ;->ۡ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 258
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " resumed"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_4
    if-nez p7, :cond_8

    .line 260
    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v4, :cond_8

    .line 262
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v2

    const-wide/32 v4, 0x40000

    cmp-long v6, v2, v4

    if-gez v6, :cond_5

    const-wide/16 v2, 0xfa

    .line 264
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_2

    :cond_5
    const-wide/32 v4, 0x80000

    cmp-long v6, v2, v4

    if-gez v6, :cond_6

    const-wide/16 v2, 0x64

    .line 266
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_2

    :cond_6
    const-wide/32 v4, 0x100000

    cmp-long v6, v2, v4

    if-gez v6, :cond_7

    const-wide/16 v2, 0x32

    .line 268
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_2

    :cond_7
    const-wide/32 v4, 0x200000

    cmp-long v6, v2, v4

    if-gez v6, :cond_8

    const-wide/16 v2, 0xa

    .line 270
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    .line 273
    :cond_8
    :goto_2
    iget-object v2, v1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-direct {p0, v2}, Ll/֡ᩳۢ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 275
    :try_start_0
    invoke-direct {p0, v1, v0}, Ll/֡ᩳۢ;->֫(Ll/ᩳۧۢ;Ll/۬ۜᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_9
    const/4 v1, 0x1

    .line 41
    invoke-virtual {p6, v1}, Ll/᩵ۛۡ;->֫(I)Z

    goto/16 :goto_0

    .line 251
    :cond_a
    :goto_3
    iget-object v2, p0, Ll/֡ᩳۢ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    if-ne v2, p3, :cond_c

    invoke-virtual {p4}, Ll/᩷ۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    sget-object v5, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v2, v5, :cond_b

    goto :goto_4

    :cond_b
    const-wide/16 v5, 0x1f4

    .line 255
    invoke-static {v5, v6}, Landroid/os/SystemClock;->sleep(J)V

    goto/16 :goto_1

    .line 252
    :cond_c
    :goto_4
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_6

    .line 242
    :cond_d
    :goto_5
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_6
    return-void
.end method

.method public static synthetic ֫(Ll/֡ᩳۢ;Ll/ܺᩳۢ;I)V
    .locals 1

    .line 287
    iget-object v0, p0, Ll/֡ᩳۢ;->ۧ:Ll/ᩴᩳۢ;

    iget-object p0, p0, Ll/֡ᩳۢ;->ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 289
    :try_start_0
    invoke-virtual {p1, p2}, Ll/ܺᩳۢ;->accept(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 291
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p0

    if-nez p0, :cond_0

    .line 292
    invoke-virtual {v0}, Ll/ᩴᩳۢ;->ۧ()V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 291
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p0

    if-nez p0, :cond_1

    .line 292
    invoke-virtual {v0}, Ll/ᩴᩳۢ;->ۧ()V

    .line 294
    :cond_1
    throw p1
.end method

.method private ֫(Ll/ۧ۫᩷;ZLandroid/util/SparseLongArray;)V
    .locals 10

    .line 127
    invoke-virtual {p1}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 128
    new-instance v0, Ljava/io/DataInputStream;

    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-virtual {p1}, Ll/ۧ۫᩷;->ۡ()Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 129
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result p1

    if-lez p1, :cond_4

    if-eqz p2, :cond_0

    .line 157
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 130
    :cond_0
    invoke-static {v0}, Ll/۫ۜᩳ;->֫(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object p1

    .line 131
    :goto_1
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v1

    .line 132
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    .line 133
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    .line 148
    invoke-virtual {p3, v1}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result v4

    if-ltz v4, :cond_1

    .line 151
    invoke-virtual {p3, v4}, Landroid/util/SparseLongArray;->valueAt(I)J

    move-result-wide v4

    goto :goto_2

    .line 452
    :cond_1
    iget-object v4, p0, Ll/֡ᩳۢ;->ܿ:Ll/ۧ۫᩷;

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 154
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 157
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    .line 158
    invoke-virtual {p3, v1, v4, v5}, Landroid/util/SparseLongArray;->put(IJ)V

    :goto_2
    if-ltz v2, :cond_2

    if-lez v3, :cond_2

    int-to-long v6, v2

    int-to-long v8, v3

    add-long/2addr v6, v8

    cmp-long v8, v6, v4

    if-gtz v8, :cond_2

    .line 136
    iget-object v4, p0, Ll/֡ᩳۢ;->᩷:Ll/ۧۤᩴ;

    new-instance v5, Ll/᩵ᩳۢ;

    invoke-direct {v5, v1, v2, v3}, Ll/᩵ᩳۢ;-><init>(III)V

    invoke-virtual {v4, p1, v5}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 161
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid smali cache offset"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 155
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Missing smali cache data file"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    :cond_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 128
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1

    :cond_5
    return-void
.end method

.method private ֫(Ll/ᩳۧۢ;Ljava/io/Writer;)V
    .locals 5

    .line 403
    iget-object v0, p1, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۧ۫᩷;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/֡ᩳۢ;->ᩳ:Ll/۫ۧۢ;

    invoke-virtual {v1, v0}, Ll/۫ۧۢ;->ܿ(Ljava/lang/String;)Ll/۬ۛ֡;

    move-result-object v0

    .line 404
    new-instance v2, Ll/۠ۛ֡;

    iget v3, p1, Ll/ᩳۧۢ;->֫:I

    iget v4, p1, Ll/ᩳۧۢ;->ᩳ:I

    invoke-direct {v2, v0, v3, v4}, Ll/۠ۛ֡;-><init>(Ll/۬ۛ֡;II)V

    .line 405
    invoke-virtual {v1}, Ll/۫ۧۢ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "# "

    .line 406
    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 407
    iget-object v0, p1, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, ".dex\n\n"

    .line 408
    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 410
    :cond_0
    iget-object p1, p1, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ll/۫ۧۢ;->ܽ(Ljava/lang/String;)Ll/᩹ܶ֡;

    move-result-object p1

    invoke-static {p2, v2, p1}, Ll/᩸ܶ֡;->֫(Ljava/io/Writer;Ll/ۡ֫ۚ;Ll/᩹ܶ֡;)V

    return-void
.end method

.method private ֫(Ll/ᩳۧۢ;Ll/۬ۜᩳ;)V
    .locals 4

    .line 311
    invoke-virtual {p2}, Ll/۬ۜᩳ;->ܿ()Ll/ܰۖܽ;

    move-result-object v0

    .line 312
    :try_start_0
    invoke-direct {p0, p1, v0}, Ll/֡ᩳۢ;->֫(Ll/ᩳۧۢ;Ljava/io/Writer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 313
    invoke-virtual {v0}, Ll/ܰۖܽ;->close()V

    .line 321
    iget-object p1, p1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    .line 322
    invoke-direct {p0, p1}, Ll/֡ᩳۢ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 325
    :cond_0
    invoke-virtual {p2}, Ll/۬ۜᩳ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 326
    iget-object p2, p0, Ll/֡ᩳۢ;->ۧ:Ll/ᩴᩳۢ;

    move-object v0, p2

    .line 0
    monitor-enter v0

    .line 552
    :try_start_1
    iget-object v1, p2, Ll/ᩴᩳۢ;->ۜ:Ll/֡ᩳۢ;

    iget-object v1, v1, Ll/֡ᩳۢ;->᩷:Ll/ۧۤᩴ;

    invoke-virtual {v1, p1}, Ll/ۧۤᩴ;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p2, Ll/ᩴᩳۢ;->ۜ:Ll/֡ᩳۢ;

    iget-object v1, v1, Ll/֡ᩳۢ;->᩻:Ll/֫ۤᩴ;

    invoke-virtual {v1, p1}, Ll/֫ۤᩴ;->contains(Ljava/lang/Object;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_1

    goto :goto_0

    .line 556
    :cond_1
    :try_start_2
    iget-object v1, p2, Ll/ᩴᩳۢ;->ᩳ:Ll/ۗۖܽ;

    if-nez v1, :cond_2

    .line 557
    new-instance v1, Ll/ۗۖܽ;

    iget-object v2, p2, Ll/ᩴᩳۢ;->ۜ:Ll/֡ᩳۢ;

    iget-object v2, v2, Ll/֡ᩳۢ;->ܳ:Ll/ۧ۫᩷;

    .line 140
    invoke-virtual {v2}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v2

    .line 558
    invoke-direct {v1, v2}, Ll/ۗۖܽ;-><init>(Ljava/io/OutputStream;)V

    iput-object v1, p2, Ll/ᩴᩳۢ;->ᩳ:Ll/ۗۖܽ;

    .line 560
    :cond_2
    iget-object v1, p2, Ll/ᩴᩳۢ;->ᩳ:Ll/ۗۖܽ;

    .line 185
    invoke-static {p1}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-static {v1, v2}, Ll/۫ۜᩳ;->֫(Ljava/io/OutputStream;I)V

    .line 186
    invoke-static {v1, p1}, Ll/ۛۖܽ;->֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V

    .line 561
    iget-object v1, p2, Ll/ᩴᩳۢ;->ᩳ:Ll/ۗۖܽ;

    invoke-virtual {v1}, Ll/ۗۖܽ;->flush()V

    .line 562
    iget-object v1, p2, Ll/ᩴᩳۢ;->ۜ:Ll/֡ᩳۢ;

    iget-object v1, v1, Ll/֡ᩳۢ;->᩻:Ll/֫ۤᩴ;

    invoke-virtual {v1, p1}, Ll/֫ۤᩴ;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 567
    monitor-exit v0

    return-void

    :catch_0
    move-exception p1

    .line 564
    :try_start_3
    invoke-virtual {p2}, Ll/ᩴᩳۢ;->ۧ()V

    .line 565
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 553
    :cond_3
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    .line 330
    :cond_4
    invoke-virtual {p2}, Ll/۬ۜᩳ;->֫()V

    .line 348
    invoke-direct {p0, p1}, Ll/֡ᩳۢ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_1
    return-void

    .line 352
    :cond_5
    iget-object v0, p0, Ll/֡ᩳۢ;->ۧ:Ll/ᩴᩳۢ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴᩳۢ;->֫(Ljava/lang/String;Ll/۬ۜᩳ;)V

    return-void

    :catchall_1
    move-exception p1

    .line 311
    :try_start_5
    invoke-virtual {v0}, Ll/ܰۖܽ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method private ֫(Ll/ᩳۧۢ;Ll/᩵ᩳۢ;Ll/᩺ۖܽ;)V
    .locals 6

    .line 375
    iget-object p1, p1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    .line 376
    iget p1, p2, Ll/᩵ᩳۢ;->֫:I

    .line 440
    iget-object v0, p0, Ll/֡ᩳۢ;->ܽ:Ll/ۧۤᩴ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/Reference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 442
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_2

    .line 423
    :cond_1
    iget-object v0, p0, Ll/֡ᩳۢ;->ܽ:Ll/ۧۤᩴ;

    monitor-enter v0

    .line 440
    :try_start_0
    iget-object v2, p0, Ll/֡ᩳۢ;->ܽ:Ll/ۧۤᩴ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/Reference;

    if-eqz v2, :cond_2

    .line 442
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    :cond_2
    if-eqz v1, :cond_3

    .line 426
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_1
    move-object v0, v1

    goto :goto_2

    .line 452
    :cond_3
    :try_start_1
    iget-object v1, p0, Ll/֡ᩳۢ;->ܿ:Ll/ۧ۫᩷;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 429
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v1

    .line 430
    iget-object v2, p0, Ll/֡ᩳۢ;->ܽ:Ll/ۧۤᩴ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v3, Ljava/lang/ref/SoftReference;

    invoke-direct {v3, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v3}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 431
    :try_start_2
    monitor-exit v0

    goto :goto_1

    :catch_0
    const/4 p1, 0x0

    new-array p1, p1, [B

    .line 433
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v0, p1

    .line 377
    :goto_2
    iget p1, p2, Ll/᩵ᩳۢ;->ܽ:I

    if-ltz p1, :cond_5

    iget v1, p2, Ll/᩵ᩳۢ;->ۧ:I

    if-lez v1, :cond_5

    int-to-long v2, p1

    int-to-long v4, v1

    add-long/2addr v2, v4

    array-length p1, v0

    int-to-long v4, p1

    cmp-long p1, v2, v4

    if-gtz p1, :cond_5

    .line 382
    iget-object p1, p0, Ll/֡ᩳۢ;->֫:Ll/֡ۛۡ;

    invoke-virtual {p1}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ۜᩳ;

    if-nez p1, :cond_4

    .line 384
    new-instance p1, Ll/۬ۜᩳ;

    invoke-direct {p1}, Ll/۬ۜᩳ;-><init>()V

    .line 387
    :cond_4
    :try_start_3
    iget v1, p2, Ll/᩵ᩳۢ;->ܽ:I

    iget p2, p2, Ll/᩵ᩳۢ;->ۧ:I

    invoke-virtual {p1, v1, p2, v0}, Ll/۬ۜᩳ;->֫(II[B)V

    .line 388
    invoke-virtual {p1}, Ll/۬ۜᩳ;->ܳ()[B

    move-result-object p2

    invoke-virtual {p1}, Ll/۬ۜᩳ;->᩻()I

    move-result v0

    invoke-static {p2, v0, p3}, Ll/ۛۖܽ;->֫([BILl/᩺ۖܽ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 390
    iget-object p2, p0, Ll/֡ᩳۢ;->֫:Ll/֡ۛۡ;

    invoke-virtual {p2, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception p2

    iget-object p3, p0, Ll/֡ᩳۢ;->֫:Ll/֡ۛۡ;

    invoke-virtual {p3, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    .line 391
    throw p2

    .line 379
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Smali cache data range is invalid"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 435
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method private ֫(Ljava/lang/String;)Z
    .locals 1

    .line 189
    iget-object v0, p0, Ll/֡ᩳۢ;->᩷:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֡ᩳۢ;->᩻:Ll/֫ۤᩴ;

    invoke-virtual {v0, p1}, Ll/֫ۤᩴ;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ۧ(Ll/֡ᩳۢ;)Ll/ۧ۫᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ᩳۢ;->ܿ:Ll/ۧ۫᩷;

    return-object p0
.end method

.method public static ۧ(Ll/֡ᩳۢ;I)V
    .locals 0

    .line 448
    iget-object p0, p0, Ll/֡ᩳۢ;->ܽ:Ll/ۧۤᩴ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private ܳ()V
    .locals 3

    .line 114
    iget-object v0, p0, Ll/֡ᩳۢ;->ܳ:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 117
    :cond_0
    new-instance v1, Ljava/io/DataInputStream;

    new-instance v2, Ljava/io/BufferedInputStream;

    .line 118
    invoke-virtual {v0}, Ll/ۧ۫᩷;->ۡ()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 119
    :goto_0
    :try_start_0
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v0

    if-lez v0, :cond_1

    .line 120
    iget-object v0, p0, Ll/֡ᩳۢ;->᩻:Ll/֫ۤᩴ;

    invoke-static {v1}, Ll/۫ۜᩳ;->֫(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/֫ۤᩴ;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 122
    :cond_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception v0

    .line 117
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
.end method

.method public static bridge synthetic ܽ(Ll/֡ᩳۢ;)Ll/ۧ۫᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ᩳۢ;->ۜ:Ll/ۧ۫᩷;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/֡ᩳۢ;)Ll/ۧ۫᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ᩳۢ;->ۖ:Ll/ۧ۫᩷;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/֡ᩳۢ;)Ll/ۧۤᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ᩳۢ;->᩷:Ll/ۧۤᩴ;

    return-object p0
.end method

.method private ᩻()V
    .locals 6

    .line 169
    iget-object v0, p0, Ll/֡ᩳۢ;->᩷:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->clear()V

    .line 170
    iget-object v0, p0, Ll/֡ᩳۢ;->᩻:Ll/֫ۤᩴ;

    invoke-virtual {v0}, Ll/۟۫ᩴ;->clear()V

    .line 171
    iget-object v0, p0, Ll/֡ᩳۢ;->ܽ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->clear()V

    .line 172
    iget-object v0, p0, Ll/֡ᩳۢ;->ܿ:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۧ۫᩷;->ۢ()[Ll/ۧ۫᩷;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 174
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 175
    invoke-virtual {v4}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ll/ۧ۫᩷;->֫()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    .line 176
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unable to delete smali cache file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 180
    :cond_2
    invoke-virtual {v0}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/۫ۜᩳ;->ۧ(Ll/ܶ᩵ܿ;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 577
    iput-boolean v0, p0, Ll/֡ᩳۢ;->ۢ:Z

    return-void
.end method

.method public final ֫(Ll/ܿۛ᩷;)V
    .locals 4

    .line 196
    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    .line 197
    iget-object p1, p1, Ll/ܿۛ᩷;->ᩳۧ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 198
    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v1

    sget-object v2, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v1, v2, :cond_0

    return-void

    .line 202
    :cond_0
    new-instance v1, Ll/ۘᩳۢ;

    invoke-direct {v1, p0}, Ll/ۘᩳۢ;-><init>(Ll/֡ᩳۢ;)V

    invoke-virtual {v0, v1}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 209
    iget-object v1, p0, Ll/֡ᩳۢ;->ۧ:Ll/ᩴᩳۢ;

    invoke-virtual {v1}, Ll/ᩴᩳۢ;->ۧ()V

    const/4 v1, 0x0

    .line 210
    iput-boolean v1, p0, Ll/֡ᩳۢ;->ۢ:Z

    .line 211
    iget-object v1, p0, Ll/֡ᩳۢ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    .line 212
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Ll/ۢᩳۢ;

    check-cast v0, Ll/᩷ۡ֫;

    invoke-direct {v3, p0, v1, v0, p1}, Ll/ۢᩳۢ;-><init>(Ll/֡ᩳۢ;ILl/᩷ۡ֫;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const-string p1, "SmaliCache-1"

    .line 306
    invoke-virtual {v2, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 307
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final ֫(Ll/ᩳۧۢ;Ll/᩺ۖܽ;)V
    .locals 2

    .line 364
    :try_start_0
    iget-object v0, p0, Ll/֡ᩳۢ;->᩷:Ll/ۧۤᩴ;

    iget-object v1, p1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ᩳۢ;

    if-eqz v0, :cond_0

    .line 366
    invoke-direct {p0, p1, v0, p2}, Ll/֡ᩳۢ;->֫(Ll/ᩳۧۢ;Ll/᩵ᩳۢ;Ll/᩺ۖܽ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 396
    :catch_0
    :cond_0
    :try_start_1
    invoke-direct {p0, p1, p2}, Ll/֡ᩳۢ;->֫(Ll/ᩳۧۢ;Ljava/io/Writer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 398
    invoke-virtual {p2}, Ll/᩺ۖܽ;->ܽ()V

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    :goto_0
    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 581
    iget-object v0, p0, Ll/֡ᩳۢ;->ۧ:Ll/ᩴᩳۢ;

    invoke-virtual {v0}, Ll/ᩴᩳۢ;->֫()V

    const/4 v0, 0x0

    .line 582
    iput-boolean v0, p0, Ll/֡ᩳۢ;->ۢ:Z

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 573
    iget-object v0, p0, Ll/֡ᩳۢ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 592
    iget-object v0, p0, Ll/֡ᩳۢ;->ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    const-wide/16 v0, 0x64

    .line 593
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 586
    :goto_0
    iget-object v0, p0, Ll/֡ᩳۢ;->ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Ll/֡ᩳۢ;->ۡ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ge v1, v0, :cond_0

    const-wide/16 v0, 0x64

    .line 587
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_0

    :cond_0
    return-void
.end method
