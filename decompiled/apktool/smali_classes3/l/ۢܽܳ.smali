.class public final Ll/ۢܽܳ;
.super Ljava/lang/Object;
.source "P70I"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:J

.field public final ۙ:J

.field public final ۤ:Ll/ۡᩳܳ;

.field public final ۫:Ll/ۜܽܳ;

.field public final ۬:Ll/֡ᩳܳ;

.field public final ᩶:J

.field public final ᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᩹:Ll/۫֫ܳ;


# direct methods
.method public constructor <init>(JJJLl/ۡᩳܳ;Ll/۫֫ܳ;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ۢܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    iput-wide p1, p0, Ll/ۢܽܳ;->ۗ:J

    .line 26
    iput-wide p3, p0, Ll/ۢܽܳ;->᩶:J

    .line 27
    iput-wide p5, p0, Ll/ۢܽܳ;->ۙ:J

    .line 28
    iput-object p7, p0, Ll/ۢܽܳ;->ۤ:Ll/ۡᩳܳ;

    .line 29
    iput-object p8, p0, Ll/ۢܽܳ;->᩹:Ll/۫֫ܳ;

    .line 30
    new-instance p1, Ll/ۜܽܳ;

    invoke-static {p7}, Ll/᩵ᩳܳ;->ۢ(Ll/ۡᩳܳ;)[Ll/ᩴܽܳ;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ۜܽܳ;-><init>([Ll/ᩴܽܳ;)V

    iput-object p1, p0, Ll/ۢܽܳ;->۫:Ll/ۜܽܳ;

    .line 31
    new-instance p1, Ll/֡ᩳܳ;

    invoke-direct {p1, p7}, Ll/֡ᩳܳ;-><init>(Ll/ۡᩳܳ;)V

    iput-object p1, p0, Ll/ۢܽܳ;->۬:Ll/֡ᩳܳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 151
    iget-object v2, p0, Ll/ۢܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 154
    :cond_0
    iget-object v0, p0, Ll/ۢܽܳ;->۫:Ll/ۜܽܳ;

    invoke-virtual {v0}, Ll/ۜܽܳ;->֫()V

    return-void
.end method

.method public final length()I
    .locals 2

    .line 158
    iget-object v0, p0, Ll/ۢܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    iget-object v0, p0, Ll/ۢܽܳ;->۬:Ll/֡ᩳܳ;

    invoke-virtual {v0}, Ll/֡ᩳܳ;->֫()I

    move-result v0

    return v0

    .line 159
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "HexRange is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/io/OutputStream;I)V
    .locals 1

    .line 86
    invoke-virtual {p0}, Ll/ۢܽܳ;->ܽ()V

    .line 87
    iget-object v0, p0, Ll/ۢܽܳ;->۬:Ll/֡ᩳܳ;

    invoke-virtual {v0, p1, p2}, Ll/֡ᩳܳ;->֫(Ljava/io/OutputStream;I)V

    .line 88
    invoke-virtual {p0}, Ll/ۢܽܳ;->ܽ()V

    return-void
.end method

.method public final ֫()[Ll/ᩴܽܳ;
    .locals 2

    .line 134
    invoke-virtual {p0}, Ll/ۢܽܳ;->ܽ()V

    .line 135
    iget-object v0, p0, Ll/ۢܽܳ;->ۤ:Ll/ۡᩳܳ;

    invoke-static {v0}, Ll/᩵ᩳܳ;->ۢ(Ll/ۡᩳܳ;)[Ll/ᩴܽܳ;

    move-result-object v0

    .line 137
    :try_start_0
    invoke-virtual {p0}, Ll/ۢܽܳ;->ܽ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v1

    .line 141
    :goto_0
    :try_start_1
    invoke-static {v0}, Ll/ܺܽܳ;->֫([Ll/ᩴܽܳ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_1

    :catch_3
    move-exception v0

    .line 143
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 145
    :goto_1
    throw v1
.end method

.method public final ܽ()V
    .locals 4

    .line 158
    iget-object v0, p0, Ll/ۢܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    .line 93
    iget-object v0, p0, Ll/ۢܽܳ;->۫:Ll/ۜܽܳ;

    invoke-static {v0}, Ll/ۜܽܳ;->֫(Ll/ۜܽܳ;)[Ll/ᩴܽܳ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 94
    invoke-interface {v3}, Ll/ᩴܽܳ;->۫()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 95
    :cond_0
    new-instance v0, Ll/ۚᩳܳ;

    invoke-direct {v0}, Ll/ۚᩳܳ;-><init>()V

    throw v0

    :cond_1
    return-void

    .line 159
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "HexRange is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()Ll/᩷ܽܳ;
    .locals 13

    .line 158
    iget-object v0, p0, Ll/ۢܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const-string v2, "HexRange is closed"

    if-nez v1, :cond_1

    .line 105
    iget-object v1, p0, Ll/ۢܽܳ;->۫:Ll/ۜܽܳ;

    invoke-virtual {v1}, Ll/ۜܽܳ;->ۧ()V

    .line 106
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 110
    new-instance v0, Ll/᩷ܽܳ;

    iget-object v11, p0, Ll/ۢܽܳ;->᩹:Ll/۫֫ܳ;

    iget-object v12, p0, Ll/ۢܽܳ;->۫:Ll/ۜܽܳ;

    iget-wide v4, p0, Ll/ۢܽܳ;->ۗ:J

    iget-wide v6, p0, Ll/ۢܽܳ;->᩶:J

    iget-wide v8, p0, Ll/ۢܽܳ;->ۙ:J

    iget-object v10, p0, Ll/ۢܽܳ;->ۤ:Ll/ۡᩳܳ;

    move-object v3, v0

    invoke-direct/range {v3 .. v12}, Ll/᩷ܽܳ;-><init>(JJJLl/ۡᩳܳ;Ll/۫֫ܳ;Ll/ۜܽܳ;)V

    return-object v0

    .line 107
    :cond_0
    invoke-virtual {v1}, Ll/ۜܽܳ;->֫()V

    .line 108
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 159
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
