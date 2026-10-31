.class public final synthetic Ll/᩵۬ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/۟ۤᩳ;

.field public final synthetic ᩶:Ll/ܽ۬ۜ;

.field public final synthetic ᩸:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ᩹:Ll/ܺ۠ۜ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;Ll/ܺ۠ۜ;Ll/ܽ۬ۜ;Ll/۟ۤᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵۬ۜ;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p2, p0, Ll/᩵۬ۜ;->᩹:Ll/ܺ۠ۜ;

    iput-object p3, p0, Ll/᩵۬ۜ;->᩶:Ll/ܽ۬ۜ;

    iput-object p4, p0, Ll/᩵۬ۜ;->ۙ:Ll/۟ۤᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 2
    sget v0, Ll/ۤۤۜ;->᩻ܿ:I

    .line 1911
    iget-object v0, p0, Ll/᩵۬ۜ;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1914
    :cond_0
    iget-object v0, p0, Ll/᩵۬ۜ;->᩹:Ll/ܺ۠ۜ;

    if-eqz v0, :cond_1

    .line 1915
    invoke-virtual {v0}, Ll/ܺ۠ۜ;->close()V

    .line 1917
    :cond_1
    iget-object v0, p0, Ll/᩵۬ۜ;->᩶:Ll/ܽ۬ۜ;

    if-eqz v0, :cond_2

    .line 1918
    invoke-virtual {v0}, Ll/ܽ۬ۜ;->ۧ()V

    .line 1920
    :cond_2
    iget-object v0, p0, Ll/᩵۬ۜ;->ۙ:Ll/۟ۤᩳ;

    invoke-virtual {v0}, Ll/۟ۤᩳ;->run()V

    return-void
.end method
