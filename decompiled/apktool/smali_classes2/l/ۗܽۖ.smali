.class public final Ll/ۗܽۖ;
.super Ll/۠ᩳۖ;
.source "688Y"


# instance fields
.field public final synthetic ֫:Ll/۠ᩳۖ;


# direct methods
.method public constructor <init>(Ll/۠ᩳۖ;)V
    .locals 0

    .line 557
    iput-object p1, p0, Ll/ۗܽۖ;->֫:Ll/۠ᩳۖ;

    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 5

    .line 569
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 570
    invoke-virtual {p1}, Ll/ܿۜۖ;->֫()V

    .line 571
    :goto_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 572
    iget-object v1, p0, Ll/ۗܽۖ;->֫:Ll/۠ᩳۖ;

    invoke-virtual {v1, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    .line 573
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 575
    :cond_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܳ()V

    .line 576
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    .line 577
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-direct {v1, p1}, Ljava/util/concurrent/atomic/AtomicLongArray;-><init>(I)V

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_1

    .line 579
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLongArray;->set(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 4

    .line 557
    check-cast p2, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 560
    invoke-virtual {p1}, Ll/᩻ۜۖ;->֫()V

    .line 561
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLongArray;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 562
    invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicLongArray;->get(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-object v3, p0, Ll/ۗܽۖ;->֫:Ll/۠ᩳۖ;

    invoke-virtual {v3, p1, v2}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 564
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ᩳ()V

    return-void
.end method
