.class public final Ll/᩺۬ܳ;
.super Ljava/lang/Object;
.source "M2AR"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final ᩸:Ljava/util/HashMap;

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Ljava/util/HashMap;Z)V
    .locals 0

    .line 423
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 424
    iput-object p1, p0, Ll/᩺۬ܳ;->᩸:Ljava/util/HashMap;

    .line 425
    iput-boolean p2, p0, Ll/᩺۬ܳ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 419
    check-cast p1, Ll/ᩳۜܳ;

    check-cast p2, Ll/ᩳۜܳ;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 432
    :cond_0
    invoke-interface {p1}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v0

    const v1, -0x3b9aca00

    if-eqz v0, :cond_1

    goto :goto_0

    .line 434
    :cond_1
    invoke-interface {p2}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v0

    const v2, 0x3b9aca00

    if-eqz v0, :cond_2

    goto :goto_1

    .line 436
    :cond_2
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۡۧ()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 438
    :cond_3
    invoke-interface {p2}, Ll/ᩳۜܳ;->ۡۧ()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    .line 441
    :cond_4
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 442
    invoke-interface {p2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_6

    :goto_0
    return v1

    .line 445
    :cond_5
    invoke-interface {p2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_6

    :goto_1
    return v2

    .line 449
    :cond_6
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v2

    invoke-interface {p2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v4

    sub-long/2addr v2, v4

    sget v0, Ll/۟۬ܳ;->֫:I

    const-wide/32 v4, 0x3b9aca00

    cmp-long v0, v2, v4

    if-lez v0, :cond_7

    const v1, 0x3b9aca00

    goto :goto_2

    :cond_7
    const-wide/32 v4, -0x3b9aca00

    cmp-long v0, v2, v4

    if-gez v0, :cond_8

    goto :goto_2

    :cond_8
    long-to-int v1, v2

    :goto_2
    if-nez v1, :cond_9

    .line 452
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩺۬ܳ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ۬ܳ;

    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۤ۬ܳ;

    invoke-virtual {p1, p2}, Ll/ۤ۬ܳ;->֫(Ll/ۤ۬ܳ;)I

    move-result v1

    .line 453
    :cond_9
    iget-boolean p1, p0, Ll/᩺۬ܳ;->᩹:Z

    if-eqz p1, :cond_a

    neg-int p1, v1

    return p1

    :cond_a
    return v1
.end method
