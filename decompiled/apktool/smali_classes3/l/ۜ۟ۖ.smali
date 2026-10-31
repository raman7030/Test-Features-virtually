.class public final Ll/ۜ۟ۖ;
.super Ll/۟ܰۖ;
.source "17B9"


# instance fields
.field public ᩸:Ll/ܰܰۖ;

.field public ᩹:Ljava/util/concurrent/Future;


# direct methods
.method public constructor <init>(Ll/۟ܰۖ;Ll/ܰܰۖ;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Ll/ۜ۟ۖ;->᩹:Ljava/util/concurrent/Future;

    .line 29
    iput-object p2, p0, Ll/ۜ۟ۖ;->᩸:Ll/ܰܰۖ;

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۜ۟ۖ;->᩹:Ljava/util/concurrent/Future;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 2

    .line 49
    iget-object v0, p0, Ll/ۜ۟ۖ;->᩹:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ll/ۜ۟ۖ;->᩸:Ll/ܰܰۖ;

    invoke-interface {v1, v0}, Ll/ܰܰۖ;->apply(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ۜ۟ۖ;->᩹:Ljava/util/concurrent/Future;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Ll/ۜ۟ۖ;->᩸:Ll/ܰܰۖ;

    invoke-interface {p2, p1}, Ll/ܰܰۖ;->apply(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public final isCancelled()Z
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ۜ۟ۖ;->᩹:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public final isDone()Z
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۜ۟ۖ;->᩹:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    return v0
.end method
