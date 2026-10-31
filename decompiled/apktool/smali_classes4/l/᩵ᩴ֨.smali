.class public final Ll/᩵ᩴ֨;
.super Ljava/lang/Object;
.source "8404"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 455
    new-instance v0, Ll/ۧۤᩴ;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ll/ۧۤᩴ;-><init>(I)V

    sput-object v0, Ll/᩵ᩴ֨;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method

.method public static ֫(J)Ljava/util/EnumSet;
    .locals 11

    .line 62
    const-class v0, Ll/ᩴᩴ֨;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    .line 63
    invoke-static {}, Ll/ᩴᩴ֨;->values()[Ll/ᩴᩴ֨;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const-wide/16 v5, 0x0

    if-ge v4, v2, :cond_1

    aget-object v7, v1, v4

    .line 64
    iget-wide v8, v7, Ll/ᩴᩴ֨;->᩹:J

    and-long/2addr v8, p0

    cmp-long v10, v8, v5

    if-eqz v10, :cond_0

    .line 65
    invoke-virtual {v0, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 66
    iget-wide v5, v7, Ll/ᩴᩴ֨;->᩹:J

    not-long v5, v5

    and-long/2addr p0, v5

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    cmp-long v1, p0, v5

    if-nez v1, :cond_2

    const/4 v3, 0x1

    .line 69
    :cond_2
    invoke-static {v3}, Ll/۫ۙ;->֫(Z)V

    return-object v0
.end method

.method public static ۧ(J)Ljava/util/Set;
    .locals 7

    .line 429
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ll/᩵ᩴ֨;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_e

    .line 431
    const-class v0, Ll/֫᩹۠;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    const-wide/16 v2, 0x1

    and-long/2addr v2, p0

    const-wide/16 v4, 0x0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    .line 432
    sget-object v2, Ll/֫᩹۠;->ۛ:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    const-wide/16 v2, 0x4

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_1

    .line 433
    sget-object v2, Ll/֫᩹۠;->ۤ:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    const-wide/16 v2, 0x2

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_2

    .line 434
    sget-object v2, Ll/֫᩹۠;->۫:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    const-wide/16 v2, 0x400

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_3

    .line 435
    sget-object v2, Ll/֫᩹۠;->᩹:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    const-wide/16 v2, 0x8

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_4

    .line 436
    sget-object v2, Ll/֫᩹۠;->᩺:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_5

    .line 437
    sget-object v2, Ll/֫᩹۠;->ۨ:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_5
    const-wide/high16 v2, -0x8000000000000000L

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_6

    .line 439
    sget-object v2, Ll/֫᩹۠;->۬:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_6
    const-wide/16 v2, 0x10

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_7

    .line 440
    sget-object v2, Ll/֫᩹۠;->ۙ:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_7
    const-wide/16 v2, 0x80

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_8

    .line 441
    sget-object v2, Ll/֫᩹۠;->֫֫:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_8
    const-wide/16 v2, 0x40

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_9

    .line 442
    sget-object v2, Ll/֫᩹۠;->ۧ֫:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_9
    const-wide/16 v2, 0x20

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_a

    .line 444
    sget-object v2, Ll/֫᩹۠;->۟:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_a
    const-wide/16 v2, 0x100

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_b

    .line 445
    sget-object v2, Ll/֫᩹۠;->ۗ:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_b
    const-wide/16 v2, 0x800

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_c

    .line 446
    sget-object v2, Ll/֫᩹۠;->ܰ:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_c
    const-wide v2, 0x80000000000L

    and-long/2addr v2, p0

    cmp-long v6, v4, v2

    if-eqz v6, :cond_d

    .line 447
    sget-object v2, Ll/֫᩹۠;->᩶:Ll/֫᩹۠;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 448
    :cond_d
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 449
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v1, p0, v0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    return-object v0
.end method
