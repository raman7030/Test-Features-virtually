.class public Ll/۠᩻ۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 284
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 1

    .line 288
    :try_start_0
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ll/ܿۜۖ;->᩹()I

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 290
    new-instance v0, Ll/ܳᩳۖ;

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 290
    throw v0
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 2

    .line 284
    check-cast p2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 296
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Ll/᩻ۜۖ;->ۧ(J)V

    return-void
.end method
