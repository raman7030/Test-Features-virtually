.class public final synthetic Ll/ᩴܿ᩻;
.super Ljava/lang/Object;
.source "GAHN"

# interfaces
.implements Ll/᩻ۜ᩻;


# instance fields
.field public final synthetic ֫:Ll/᩵ܿ᩻;

.field public final synthetic ۧ:I


# direct methods
.method public synthetic constructor <init>(Ll/᩵ܿ᩻;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴܿ᩻;->֫:Ll/᩵ܿ᩻;

    iput p2, p0, Ll/ᩴܿ᩻;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۜۜ᩻;II)V
    .locals 4

    .line 2
    iget-object v1, p0, Ll/ᩴܿ᩻;->֫:Ll/᩵ܿ᩻;

    .line 4
    iget v0, p0, Ll/ᩴܿ᩻;->ۧ:I

    .line 6
    sget v2, Ll/᩵ܿ᩻;->᩵֫:I

    int-to-long v2, p2

    .line 151
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    int-to-long p2, p2

    invoke-virtual {v1, v2, v3, p2, p3}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    .line 152
    iget-object p2, v1, Ll/᩵ܿ᩻;->ۘ֫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    if-nez p2, :cond_5

    .line 154
    iget-object p2, p1, Ll/ۜۜ᩻;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 155
    iget-object p2, v1, Ll/᩵ܿ᩻;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 157
    :try_start_0
    iget-object p2, v1, Ll/᩵ܿ᩻;->ᩴ֫:Ll/ۗۢ᩻;

    iget-object v0, p1, Ll/ۜۜ᩻;->ۧ:Ljava/lang/String;

    iget-boolean v2, p1, Ll/ۜۜ᩻;->֫:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {p2, v0, v2}, Ll/ۗۢ᩻;->ܽ(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    iget-object p1, v1, Ll/᩵ܿ᩻;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p2

    .line 160
    :try_start_1
    instance-of v0, p2, Ll/ۤܳ᩻;

    if-eqz v0, :cond_2

    .line 161
    iget-object p2, v1, Ll/᩵ܿ᩻;->ۘ֫:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    :cond_0
    invoke-virtual {p2, p3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 162
    :goto_0
    iget-object p2, v1, Ll/᩵ܿ᩻;->ۘ֫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p2

    const-wide/16 v2, 0x3e8

    .line 163
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 169
    iget-object v0, v1, Ll/᩵ܿ᩻;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    goto :goto_3

    .line 165
    :cond_2
    :try_start_2
    iget-object p1, v1, Ll/᩵ܿ᩻;->ۖ֫:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    :cond_3
    invoke-virtual {p1, p3, p2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_3

    .line 169
    :goto_1
    iget-object p1, v1, Ll/᩵ܿ᩻;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    goto :goto_6

    :goto_2
    iget-object p2, v1, Ll/᩵ܿ᩻;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 170
    throw p1

    :cond_5
    :goto_3
    move-object v0, p2

    .line 172
    monitor-enter v0

    .line 173
    :goto_4
    :try_start_3
    iget-object p2, v1, Ll/᩵ܿ᩻;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    if-eqz p2, :cond_6

    const-wide/16 v2, 0x64

    .line 174
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_4

    .line 176
    :cond_6
    iget-object p2, p1, Ll/ۜۜ᩻;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 178
    :try_start_4
    iget-object p2, v1, Ll/᩵ܿ᩻;->ᩴ֫:Ll/ۗۢ᩻;

    iget-object v2, p1, Ll/ۜۜ᩻;->ۧ:Ljava/lang/String;

    iget-boolean p1, p1, Ll/ۜۜ᩻;->֫:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, v2, p1}, Ll/ۗۢ᩻;->ܽ(Ljava/lang/String;Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_5

    :catch_1
    move-exception p1

    .line 180
    :try_start_5
    instance-of p2, p1, Ll/ۤܳ᩻;

    if-eqz p2, :cond_9

    .line 181
    iget-object p2, v1, Ll/᩵ܿ᩻;->ۖ֫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/lang/Exception;

    .line 0
    :cond_7
    invoke-virtual {p2, p3, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_7

    goto :goto_5

    .line 183
    :cond_9
    iget-object p2, v1, Ll/᩵ܿ᩻;->ۖ֫:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    :cond_a
    invoke-virtual {p2, p3, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 186
    :goto_5
    monitor-exit v0

    :goto_6
    return-void

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method
