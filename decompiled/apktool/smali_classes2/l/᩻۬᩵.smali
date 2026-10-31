.class public final Ll/᩻۬᩵;
.super Ll/֨ۛ᩵;
.source "0AW3"


# static fields
.field public static final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile synthetic _decision:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 0
    const-class v0, Ll/᩻۬᩵;

    const-string v1, "_decision"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩻۬᩵;->᩶:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method


# virtual methods
.method public final ܽ(Ljava/lang/Object;)V
    .locals 0

    .line 254
    invoke-virtual {p0, p1}, Ll/᩻۬᩵;->ᩳ(Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/Object;)V
    .locals 3

    .line 276
    :cond_0
    iget v0, p0, Ll/᩻۬᩵;->_decision:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    .line 260
    invoke-static {v0}, Ll/᩹ܽܽ;->֫(Ll/ۨܶ᩵;)Ll/ۨܶ᩵;

    move-result-object v0

    .line 26
    instance-of v1, p1, Ll/ᩴۗ᩵;

    if-eqz v1, :cond_1

    .line 27
    check-cast p1, Ll/ᩴۗ᩵;

    iget-object p1, p1, Ll/ᩴۗ᩵;->֫:Ljava/lang/Throwable;

    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;

    move-result-object p1

    .line 278
    :cond_1
    invoke-static {p1, v0}, Ll/ܽۛ᩵;->֫(Ljava/lang/Object;Ll/ۨܶ᩵;)V

    return-void

    .line 245
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    .line 246
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 244
    :cond_3
    sget-object v0, Ll/᩻۬᩵;->᩶:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method
