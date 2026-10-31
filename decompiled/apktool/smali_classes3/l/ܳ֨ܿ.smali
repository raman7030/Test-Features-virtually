.class public final Ll/ܳ֨ܿ;
.super Ljava/lang/Object;
.source "LAQJ"


# instance fields
.field public final ֫:Ljava/util/concurrent/atomic/AtomicReference;

.field public ۧ:Z

.field public ܽ:Ll/᩵ۛۡ;

.field public final ܿ:Ll/ܳܰۡ;

.field public final ᩳ:Ljava/util/concurrent/ArrayBlockingQueue;


# direct methods
.method public constructor <init>(Ll/ܳܰۡ;Ll/᩵ۛۡ;)V
    .locals 2

    .line 787
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 781
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/ܳ֨ܿ;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    .line 782
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Ll/ܳ֨ܿ;->ᩳ:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 788
    iput-object p1, p0, Ll/ܳ֨ܿ;->ܿ:Ll/ܳܰۡ;

    .line 789
    iput-object p2, p0, Ll/ܳ֨ܿ;->ܽ:Ll/᩵ۛۡ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 793
    iget-object v0, p0, Ll/ܳ֨ܿ;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 794
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0
.end method
