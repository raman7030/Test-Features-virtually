.class public final Ll/᩵ܰܿ;
.super Ljava/lang/Object;
.source "C5GL"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩸:Ll/ᩳܽܳ;

.field public final ᩹:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ll/ᩳܽܳ;)V
    .locals 1

    .line 850
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 848
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/᩵ܰܿ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 851
    iput-object p1, p0, Ll/᩵ܰܿ;->᩸:Ll/ᩳܽܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 856
    iget-object v2, p0, Ll/᩵ܰܿ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 860
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/᩵ܰܿ;->᩸:Ll/ᩳܽܳ;

    invoke-virtual {v0}, Ll/ᩳܽܳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_0
    return-void
.end method
