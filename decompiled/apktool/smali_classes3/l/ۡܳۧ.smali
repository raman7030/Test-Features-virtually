.class public final Ll/ۡܳۧ;
.super Ljava/lang/Object;
.source "763M"


# static fields
.field public static final ܳ:Ll/ܿܳۧ;

.field public static final ܿ:Ll/ܿܳۧ;

.field public static final ᩳ:Ll/ܿܳۧ;


# instance fields
.field public ֫:Ll/ܳܳۧ;

.field public final ۧ:Ll/۠ܳۧ;

.field public ܽ:Ljava/io/IOException;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 261
    new-instance v0, Ll/ܿܳۧ;

    const/4 v1, 0x0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 262
    invoke-direct {v0, v1, v2, v3}, Ll/ܿܳۧ;-><init>(IJ)V

    .line 187
    sput-object v0, Ll/ۡܳۧ;->ܳ:Ll/ܿܳۧ;

    .line 194
    new-instance v0, Ll/ܿܳۧ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v2, v3}, Ll/ܿܳۧ;-><init>(IJ)V

    sput-object v0, Ll/ۡܳۧ;->ᩳ:Ll/ܿܳۧ;

    .line 201
    new-instance v0, Ll/ܿܳۧ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v2, v3}, Ll/ܿܳۧ;-><init>(IJ)V

    sput-object v0, Ll/ۡܳۧ;->ܿ:Ll/ܿܳۧ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "ExoPlayer:Loader:"

    .line 236
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 238
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 915
    new-instance v0, Ll/ܺ֨֫;

    invoke-direct {v0, p1}, Ll/ܺ֨֫;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    .line 238
    new-instance v0, Ll/ܽܳۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 237
    invoke-static {p1, v0}, Ll/ۚܳۧ;->֫(Ljava/util/concurrent/ExecutorService;Ll/ܽܳۧ;)Ll/۠ܳۧ;

    move-result-object p1

    .line 236
    invoke-direct {p0, p1}, Ll/ۡܳۧ;-><init>(Ll/۠ܳۧ;)V

    return-void
.end method

.method public constructor <init>(Ll/۠ܳۧ;)V
    .locals 0

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 250
    iput-object p1, p0, Ll/ۡܳۧ;->ۧ:Ll/۠ܳۧ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡܳۧ;)Ll/ܳܳۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܳۧ;->֫:Ll/ܳܳۧ;

    return-object p0
.end method

.method public static ֫(JZ)Ll/ܿܳۧ;
    .locals 1

    .line 261
    new-instance v0, Ll/ܿܳۧ;

    .line 262
    invoke-direct {v0, p2, p0, p1}, Ll/ܿܳۧ;-><init>(IJ)V

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ۡܳۧ;Ljava/io/IOException;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܳۧ;->ܽ:Ljava/io/IOException;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡܳۧ;Ll/ܳܳۧ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܳۧ;->֫:Ll/ܳܳۧ;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۡܳۧ;)Ll/۠ܳۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܳۧ;->ۧ:Ll/۠ܳۧ;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 313
    iget-object v0, p0, Ll/ۡܳۧ;->֫:Ll/ܳܳۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܳܳۧ;->֫(Z)V

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 346
    iget-object v0, p0, Ll/ۡܳۧ;->ܽ:Ljava/io/IOException;

    if-nez v0, :cond_2

    .line 348
    iget-object v0, p0, Ll/ۡܳۧ;->֫:Ll/ܳܳۧ;

    if-eqz v0, :cond_1

    const/high16 v1, -0x80000000

    if-ne p1, v1, :cond_0

    .line 350
    iget p1, v0, Ll/ܳܳۧ;->ۙ:I

    .line 349
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳܳۧ;->֫(I)V

    :cond_1
    return-void

    .line 347
    :cond_2
    throw v0
.end method

.method public final ֫(Ll/ۜܳۧ;)V
    .locals 2

    .line 328
    iget-object v0, p0, Ll/ۡܳۧ;->֫:Ll/ܳܳۧ;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 329
    invoke-virtual {v0, v1}, Ll/ܳܳۧ;->֫(Z)V

    .line 331
    :cond_0
    iget-object v0, p0, Ll/ۡܳۧ;->ۧ:Ll/۠ܳۧ;

    if-eqz p1, :cond_1

    .line 332
    new-instance v1, Ll/᩷ܳۧ;

    invoke-direct {v1, p1}, Ll/᩷ܳۧ;-><init>(Ll/ۜܳۧ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 334
    :cond_1
    invoke-interface {v0}, Ll/۠ܳۧ;->֫()V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;Ll/ᩳܳۧ;I)V
    .locals 9

    .line 295
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 296
    iput-object v0, p0, Ll/ۡܳۧ;->ܽ:Ljava/io/IOException;

    .line 297
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    .line 298
    new-instance v8, Ll/ܳܳۧ;

    move-object v0, v8

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v7}, Ll/ܳܳۧ;-><init>(Ll/ۡܳۧ;Landroid/os/Looper;Ll/᩻ܳۧ;Ll/ᩳܳۧ;IJ)V

    const-wide/16 p1, 0x0

    invoke-virtual {v8, p1, p2}, Ll/ܳܳۧ;->֫(J)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 276
    iput-object v0, p0, Ll/ۡܳۧ;->ܽ:Ljava/io/IOException;

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ۡܳۧ;->ܽ:Ljava/io/IOException;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 304
    iget-object v0, p0, Ll/ۡܳۧ;->֫:Ll/ܳܳۧ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
