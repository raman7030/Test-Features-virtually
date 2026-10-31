.class public final Ll/ۙܽۖ;
.super Ll/۠ᩳۖ;
.source "688Y"


# instance fields
.field public final synthetic ֫:Ll/۠ᩳۖ;


# direct methods
.method public constructor <init>(Ll/۠ᩳۖ;)V
    .locals 0

    .line 541
    iput-object p1, p0, Ll/ۙܽۖ;->֫:Ll/۠ᩳۖ;

    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 3

    .line 549
    iget-object v0, p0, Ll/ۙܽۖ;->֫:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    .line 550
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    return-object v0
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 2

    .line 541
    check-cast p2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 544
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iget-object v0, p0, Ll/ۙܽۖ;->֫:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1, p2}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    return-void
.end method
