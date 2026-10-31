.class public final Ll/֡᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public ᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public ᩹:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Ll/֡᩸ۘ;->᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 35
    iput-object v0, p0, Ll/֡᩸ۘ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 39
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Ll/֡᩸ۘ;->᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 40
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/֡᩸ۘ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 168
    iget-object v0, p0, Ll/֡᩸ۘ;->᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/io/FileWriter;[C)V
    .locals 10

    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    .line 73
    array-length v0, p2

    if-nez v0, :cond_0

    goto :goto_2

    .line 84
    :cond_0
    array-length v0, p2

    .line 168
    iget-object v1, p0, Ll/֡᩸ۘ;->᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v0

    .line 88
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 92
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x0

    :goto_0
    if-lez v6, :cond_1

    if-le v4, v6, :cond_2

    move v8, v6

    goto :goto_1

    :cond_2
    move v8, v4

    :goto_1
    add-int v9, v7, v8

    .line 101
    invoke-virtual {v5, v7, v9, p2, v3}, Ljava/lang/String;->getChars(II[CI)V

    sub-int/2addr v4, v8

    add-int/2addr v3, v8

    sub-int/2addr v6, v8

    if-nez v4, :cond_3

    .line 113
    :try_start_0
    invoke-virtual {p1, p2, v2, v0}, Ljava/io/Writer;->write([CII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v3, 0x0

    move v4, v0

    :cond_3
    move v7, v9

    goto :goto_0

    :cond_4
    if-lez v3, :cond_5

    .line 129
    :try_start_1
    invoke-virtual {p1, p2, v2, v3}, Ljava/io/Writer;->write([CII)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 137
    :catch_1
    :cond_5
    :try_start_2
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_6
    :goto_2
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 52
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 54
    iget-object v1, p0, Ll/֡᩸ۘ;->᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 56
    iget-object p1, p0, Ll/֡᩸ۘ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 149
    iget-object v0, p0, Ll/֡᩸ۘ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final ܽ()V
    .locals 2

    .line 157
    iget-object v0, p0, Ll/֡᩸ۘ;->᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 159
    iget-object v0, p0, Ll/֡᩸ۘ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method
