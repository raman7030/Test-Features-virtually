.class public Ll/ܶ᩻ۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 303
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 1

    .line 306
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ll/ܿۜۖ;->ܶ()Z

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    return-object v0
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 0

    .line 303
    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 311
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩻ۜۖ;->ܽ(Z)V

    return-void
.end method
