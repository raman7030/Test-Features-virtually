.class public abstract Ll/۠ۘ֡;
.super Ljava/lang/Object;
.source "YAH1"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۙ:Ll/᩶ۘ֡;

.field public ᩶:Ljava/lang/Object;

.field public ᩸:Ll/᩹ۘ֡;

.field public ᩹:Ll/᩹ۘ֡;


# direct methods
.method public constructor <init>(Ll/᩶ۘ֡;)V
    .locals 1

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۘ֡;->ۙ:Ll/᩶ۘ֡;

    .line 123
    invoke-static {p1}, Ll/᩶ۘ֡;->֫(Ll/᩶ۘ֡;)Ll/֨ۘ֡;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 125
    :try_start_0
    invoke-virtual {p0}, Ll/۠ۘ֡;->֫()Ll/᩹ۘ֡;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۘ֡;->᩹:Ll/᩹ۘ֡;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 126
    :cond_0
    iget-object v0, v0, Ll/᩹ۘ֡;->֫:Ljava/lang/Object;

    :goto_0
    iput-object v0, p0, Ll/۠ۘ֡;->᩶:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    invoke-static {p1}, Ll/᩶ۘ֡;->֫(Ll/᩶ۘ֡;)Ll/֨ۘ֡;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {p1}, Ll/᩶ۘ֡;->֫(Ll/᩶ۘ֡;)Ll/֨ۘ֡;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 129
    throw v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 155
    iget-object v0, p0, Ll/۠ۘ֡;->᩹:Ll/᩹ۘ֡;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 6

    .line 160
    iget-object v0, p0, Ll/۠ۘ֡;->᩹:Ll/᩹ۘ֡;

    if-eqz v0, :cond_4

    .line 163
    iput-object v0, p0, Ll/۠ۘ֡;->᩸:Ll/᩹ۘ֡;

    .line 164
    iget-object v0, p0, Ll/۠ۘ֡;->᩶:Ljava/lang/Object;

    .line 136
    iget-object v1, p0, Ll/۠ۘ֡;->ۙ:Ll/᩶ۘ֡;

    invoke-static {v1}, Ll/᩶ۘ֡;->֫(Ll/᩶ۘ֡;)Ll/֨ۘ֡;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 139
    :try_start_0
    iget-object v2, p0, Ll/۠ۘ֡;->᩹:Ll/᩹ۘ֡;

    .line 207
    :goto_0
    invoke-virtual {p0, v2}, Ll/۠ۘ֡;->֫(Ll/᩹ۘ֡;)Ll/᩹ۘ֡;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    move-object v3, v4

    goto :goto_1

    .line 211
    :cond_0
    iget-object v5, v3, Ll/᩹ۘ֡;->֫:Ljava/lang/Object;

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    if-ne v3, v2, :cond_3

    .line 215
    invoke-virtual {p0}, Ll/۠ۘ֡;->֫()Ll/᩹ۘ֡;

    move-result-object v3

    .line 139
    :goto_1
    iput-object v3, p0, Ll/۠ۘ֡;->᩹:Ll/᩹ۘ֡;

    if-nez v3, :cond_2

    goto :goto_2

    .line 140
    :cond_2
    iget-object v4, v3, Ll/᩹ۘ֡;->֫:Ljava/lang/Object;

    :goto_2
    iput-object v4, p0, Ll/۠ۘ֡;->᩶:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    invoke-static {v1}, Ll/᩶ۘ֡;->֫(Ll/᩶ۘ֡;)Ll/֨ۘ֡;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v0

    :cond_3
    move-object v2, v3

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v1}, Ll/᩶ۘ֡;->֫(Ll/᩶ۘ֡;)Ll/֨ۘ֡;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 143
    throw v0

    .line 161
    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 3

    .line 181
    iget-object v0, p0, Ll/۠ۘ֡;->᩸:Ll/᩹ۘ֡;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 185
    iput-object v1, p0, Ll/۠ۘ֡;->᩸:Ll/᩹ۘ֡;

    .line 186
    iget-object v1, p0, Ll/۠ۘ֡;->ۙ:Ll/᩶ۘ֡;

    invoke-static {v1}, Ll/᩶ۘ֡;->֫(Ll/᩶ۘ֡;)Ll/֨ۘ֡;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 188
    :try_start_0
    iget-object v2, v0, Ll/᩹ۘ֡;->֫:Ljava/lang/Object;

    if-eqz v2, :cond_0

    .line 189
    invoke-static {v1, v0}, Ll/᩶ۘ֡;->֫(Ll/᩶ۘ֡;Ll/᩹ۘ֡;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    :cond_0
    invoke-static {v1}, Ll/᩶ۘ֡;->֫(Ll/᩶ۘ֡;)Ll/֨ۘ֡;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v1}, Ll/᩶ۘ֡;->֫(Ll/᩶ۘ֡;)Ll/֨ۘ֡;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 193
    throw v0

    .line 183
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public abstract ֫()Ll/᩹ۘ֡;
.end method

.method public abstract ֫(Ll/᩹ۘ֡;)Ll/᩹ۘ֡;
.end method
