.class public abstract Ll/ۚۚ۠;
.super Ljava/lang/Object;
.source "H44W"

# interfaces
.implements Ll/۬ܺ֨;
.implements Ljava/lang/Cloneable;
.implements Ll/ۗ۠۠;


# static fields
.field public static final ۙ:Ljava/util/concurrent/ExecutorService;

.field public static final ᩶:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public ᩸:I

.field public ᩹:Ll/ۙ֨֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1786
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Ll/ۚۚ۠;->ۙ:Ljava/util/concurrent/ExecutorService;

    .line 1787
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/ۚۚ۠;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/᩹ۚ۠;)Ljava/lang/Object;
    .locals 2

    .line 1801
    :try_start_0
    sget-object v0, Ll/ۚۚ۠;->ۙ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ۧ᩵۠;

    invoke-direct {v1, p0}, Ll/ۧ᩵۠;-><init>(Ll/᩹ۚ۠;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 1803
    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ֫(Ll/ܶ֨ۡ;)V
    .locals 1

    .line 1794
    :try_start_0
    sget-object v0, Ll/ۚۚ۠;->ۙ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 1796
    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ᩳ֫()Z
    .locals 2

    .line 1790
    sget-object v0, Ll/ۚۚ۠;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    and-int/lit8 v0, v0, 0x3f

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x1f4

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 487
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 489
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 449
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 451
    :try_start_0
    new-instance v1, Ll/᩸ۚ۠;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ll/᩸ۚ۠;-><init>(Ljava/io/Writer;Z)V

    .line 209
    invoke-virtual {v1, p0, v2}, Ll/᩸ۚ۠;->֫(Ll/ۚۚ۠;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 458
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    .line 456
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final ֨()I
    .locals 1

    .line 511
    iget v0, p0, Ll/ۚۚ۠;->᩸:I

    return v0
.end method

.method public final ֫(Ll/֫᩵۠;)I
    .locals 0

    .line 516
    invoke-static {p0, p1}, Ll/۟ۚ۠;->֫(Ll/ۚۚ۠;Ll/֫᩵۠;)I

    move-result p1

    return p1
.end method

.method public abstract ֫(Ll/۫ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ֫(Ll/֡ۚ۠;)V
.end method

.method public final ֫(Ll/ᩴۚ۠;)Z
    .locals 1

    .line 443
    invoke-virtual {p0}, Ll/ۚۚ۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۟()Ll/ۚۚ۠;
    .locals 0

    return-object p0
.end method

.method public final ۨ()I
    .locals 1

    .line 506
    invoke-static {p0}, Ll/۟ۚ۠;->ۢ(Ll/ۚۚ۠;)I

    move-result v0

    return v0
.end method

.method public abstract ܽ֫()Ll/ᩴۚ۠;
.end method
