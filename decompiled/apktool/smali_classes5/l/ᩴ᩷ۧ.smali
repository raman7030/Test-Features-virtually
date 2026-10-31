.class public final Ll/ᩴ᩷ۧ;
.super Ljava/lang/Object;
.source "B8P4"

# interfaces
.implements Ll/᩶᩷ۧ;


# static fields
.field public static final ۤ:Ll/ۘ᩷ۧ;

.field public static final ۫:Ll/ۘ᩷ۧ;

.field public static final ۬:[I


# instance fields
.field public ۗ:Ll/ܳ۬ܺ;

.field public ۙ:Z

.field public ᩶:Ll/ۤۘۧ;

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x15

    new-array v0, v0, [I

    .line 110
    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ᩷ۧ;->۬:[I

    .line 137
    new-instance v0, Ll/ۘ᩷ۧ;

    new-instance v1, Ll/ۚ᩻ܽ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Ll/ۘ᩷ۧ;-><init>(Ll/ۖ᩷ۧ;)V

    sput-object v0, Ll/ᩴ᩷ۧ;->۫:Ll/ۘ᩷ۧ;

    .line 139
    new-instance v0, Ll/ۘ᩷ۧ;

    new-instance v1, Ll/ܺܶۡ;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ll/ܺܶۡ;-><init>(I)V

    invoke-direct {v0, v1}, Ll/ۘ᩷ۧ;-><init>(Ll/ۖ᩷ۧ;)V

    sput-object v0, Ll/ᩴ᩷ۧ;->ۤ:Ll/ۘ᩷ۧ;

    return-void

    nop

    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
        0x11
        0x12
        0x13
        0x14
        0x15
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    new-instance v0, Ll/ۤۘۧ;

    .line 51
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 164
    iput-object v0, p0, Ll/ᩴ᩷ۧ;->᩶:Ll/ۤۘۧ;

    const/4 v0, 0x1

    .line 165
    iput-boolean v0, p0, Ll/ᩴ᩷ۧ;->ۙ:Z

    return-void
.end method

.method private ֫(Ljava/util/ArrayList;I)V
    .locals 9

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_5

    .line 580
    :pswitch_1
    new-instance p2, Ll/۟ۢۧ;

    invoke-direct {p2}, Ll/۟ۢۧ;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 576
    :pswitch_2
    new-instance p2, Ll/ۡۡۧ;

    invoke-direct {p2}, Ll/ۡۡۧ;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 571
    :pswitch_3
    new-instance p2, Ll/֫ۡۧ;

    invoke-direct {p2}, Ll/֫ۡۧ;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 568
    :pswitch_4
    new-instance p2, Ll/۫ۚۧ;

    invoke-direct {p2}, Ll/۫ۚۧ;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 565
    :pswitch_5
    new-instance p2, Ll/᩶ۘۧ;

    invoke-direct {p2}, Ll/᩶ۘۧ;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 559
    :pswitch_6
    new-instance p2, Ll/۬ۢۧ;

    .line 561
    iget-boolean v1, p0, Ll/ᩴ᩷ۧ;->ۙ:Z

    xor-int/2addr v0, v1

    iget-object v1, p0, Ll/ᩴ᩷ۧ;->᩶:Ll/ۤۘۧ;

    invoke-direct {p2, v0, v1}, Ll/۬ۢۧ;-><init>(ILl/ۤۘۧ;)V

    .line 559
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 553
    :pswitch_7
    sget-object p2, Ll/ᩴ᩷ۧ;->ۤ:Ll/ۘ᩷ۧ;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {p2, v0}, Ll/ۘ᩷ۧ;->֫([Ljava/lang/Object;)Ll/֨᩷ۧ;

    move-result-object p2

    if-eqz p2, :cond_8

    .line 555
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 550
    :pswitch_8
    new-instance p2, Ll/ܺۡۧ;

    iget v0, p0, Ll/ᩴ᩷ۧ;->᩹:I

    invoke-direct {p2, v0}, Ll/ܺۡۧ;-><init>(I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 547
    :pswitch_9
    new-instance p2, Ll/᩹ۚۧ;

    invoke-direct {p2}, Ll/᩹ۚۧ;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 534
    :pswitch_a
    iget-object p2, p0, Ll/ᩴ᩷ۧ;->ۗ:Ll/ܳ۬ܺ;

    if-nez p2, :cond_0

    .line 535
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p2

    iput-object p2, p0, Ll/ᩴ᩷ۧ;->ۗ:Ll/ܳ۬ܺ;

    .line 537
    :cond_0
    new-instance p2, Ll/ܺۚۧ;

    .line 540
    iget-boolean v0, p0, Ll/ᩴ᩷ۧ;->ۙ:Z

    xor-int/lit8 v5, v0, 0x1

    iget-object v6, p0, Ll/ᩴ᩷ۧ;->᩶:Ll/ۤۘۧ;

    new-instance v7, Ll/ۢ֨֫;

    const-wide/16 v0, 0x0

    invoke-direct {v7, v0, v1}, Ll/ۢ֨֫;-><init>(J)V

    new-instance v8, Ll/᩷֡ۧ;

    iget-object v0, p0, Ll/ᩴ᩷ۧ;->ۗ:Ll/ܳ۬ܺ;

    invoke-direct {v8, v2, v0}, Ll/᩷֡ۧ;-><init>(ILjava/util/List;)V

    const/4 v4, 0x1

    move-object v3, p2

    invoke-direct/range {v3 .. v8}, Ll/ܺۚۧ;-><init>(IILl/ۜᩴۧ;Ll/ۢ֨֫;Ll/᩷֡ۧ;)V

    .line 537
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 531
    :pswitch_b
    new-instance p2, Ll/ܽۚۧ;

    invoke-direct {p2}, Ll/ܽۚۧ;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 528
    :pswitch_c
    new-instance p2, Ll/ۘۘۧ;

    .line 37
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 528
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 508
    :pswitch_d
    new-instance p2, Ll/۬ۖۧ;

    iget-object v0, p0, Ll/ᩴ᩷ۧ;->᩶:Ll/ۤۘۧ;

    .line 514
    iget-boolean v1, p0, Ll/ᩴ᩷ۧ;->ۙ:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/16 v1, 0x20

    :goto_0
    const/4 v3, 0x0

    .line 320
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v4

    .line 315
    invoke-direct {p2, v0, v1, v3, v4}, Ll/۬ۖۧ;-><init>(Ll/ۜᩴۧ;ILl/ۢ֨֫;Ljava/util/List;)V

    .line 508
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 517
    new-instance p2, Ll/ܰۖۧ;

    iget-object v0, p0, Ll/ᩴ᩷ۧ;->᩶:Ll/ۤۘۧ;

    .line 523
    iget-boolean v1, p0, Ll/ᩴ᩷ۧ;->ۙ:Z

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x10

    .line 525
    :goto_1
    invoke-direct {p2, v0, v2}, Ll/ܰۖۧ;-><init>(Ll/ۜᩴۧ;I)V

    .line 517
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 497
    :pswitch_e
    new-instance p2, Ll/ܿۖۧ;

    .line 503
    iget-boolean v0, p0, Ll/ᩴ᩷ۧ;->᩸:Z

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    .line 505
    :goto_2
    invoke-direct {p2, v1}, Ll/ܿۖۧ;-><init>(I)V

    .line 497
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 488
    :pswitch_f
    new-instance p2, Ll/ܰܺۧ;

    iget-object v0, p0, Ll/ᩴ᩷ۧ;->᩶:Ll/ۤۘۧ;

    .line 492
    iget-boolean v2, p0, Ll/ᩴ᩷ۧ;->ۙ:Z

    if-eqz v2, :cond_4

    const/4 v1, 0x0

    .line 494
    :cond_4
    invoke-direct {p2, v0, v1}, Ll/ܰܺۧ;-><init>(Ll/ۜᩴۧ;I)V

    .line 488
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 485
    :pswitch_10
    new-instance p2, Ll/ܳۡۧ;

    invoke-direct {p2}, Ll/ܳۡۧ;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 477
    :pswitch_11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p2, v0, v2

    sget-object p2, Ll/ᩴ᩷ۧ;->۫:Ll/ۘ᩷ۧ;

    invoke-virtual {p2, v0}, Ll/ۘ᩷ۧ;->֫([Ljava/lang/Object;)Ll/֨᩷ۧ;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 479
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 481
    :cond_5
    new-instance p2, Ll/ᩳۡۧ;

    invoke-direct {p2}, Ll/ᩳۡۧ;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 466
    :pswitch_12
    new-instance p2, Ll/᩹ۢۧ;

    .line 472
    iget-boolean v0, p0, Ll/ᩴ᩷ۧ;->᩸:Z

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    .line 474
    :goto_3
    invoke-direct {p2, v1}, Ll/᩹ۢۧ;-><init>(I)V

    .line 466
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 455
    :pswitch_13
    new-instance p2, Ll/᩻֡ۧ;

    .line 461
    iget-boolean v0, p0, Ll/ᩴ᩷ۧ;->᩸:Z

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    .line 463
    :goto_4
    invoke-direct {p2, v1}, Ll/᩻֡ۧ;-><init>(I)V

    .line 455
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 452
    :pswitch_14
    new-instance p2, Ll/ܿ֡ۧ;

    invoke-direct {p2}, Ll/ܿ֡ۧ;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 449
    :pswitch_15
    new-instance p2, Ll/ܽ֡ۧ;

    invoke-direct {p2}, Ll/ܽ֡ۧ;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final ֫()Ll/᩶᩷ۧ;
    .locals 1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 398
    monitor-exit v0

    return-object p0
.end method

.method public final ֫(Ll/ۤۘۧ;)Ll/᩶᩷ۧ;
    .locals 1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 388
    :try_start_0
    iput-object p1, p0, Ll/ᩴ᩷ۧ;->᩶:Ll/ۤۘۧ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 389
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Z)Ll/᩶᩷ۧ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 380
    :try_start_0
    iput-boolean p1, p0, Ll/ᩴ᩷ۧ;->ۙ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 381
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Landroid/net/Uri;Ljava/util/Map;)[Ll/֨᩷ۧ;
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 423
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    sget-object v2, Ll/ᩴ᩷ۧ;->۬:[I

    const/16 v3, 0x15

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    const-string v4, "Content-Type"

    .line 190
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    const/4 v4, 0x0

    if-eqz p2, :cond_1

    .line 192
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 193
    :goto_1
    invoke-static {p2}, Ll/᩶ۗ֡;->֫(Ljava/lang/String;)I

    move-result p2

    const/4 v5, -0x1

    if-eq p2, v5, :cond_2

    .line 429
    invoke-direct {p0, v1, p2}, Ll/ᩴ᩷ۧ;->֫(Ljava/util/ArrayList;I)V

    .line 432
    :cond_2
    invoke-static {p1}, Ll/᩶ۗ֡;->֫(Landroid/net/Uri;)I

    move-result p1

    if-eq p1, v5, :cond_3

    if-eq p1, p2, :cond_3

    .line 435
    invoke-direct {p0, v1, p1}, Ll/ᩴ᩷ۧ;->֫(Ljava/util/ArrayList;I)V

    :cond_3
    const/4 v5, 0x0

    :goto_2
    if-ge v5, v3, :cond_5

    .line 438
    aget v6, v2, v5

    if-eq v6, p2, :cond_4

    if-eq v6, p1, :cond_4

    .line 440
    invoke-direct {p0, v1, v6}, Ll/ᩴ᩷ۧ;->֫(Ljava/util/ArrayList;I)V

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    new-array p1, v4, [Ll/֨᩷ۧ;

    .line 443
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/֨᩷ۧ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x1

    .line 207
    :try_start_0
    iput-boolean v1, p0, Ll/ᩴ᩷ۧ;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 208
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x1

    .line 411
    :try_start_0
    iput v1, p0, Ll/ᩴ᩷ۧ;->᩹:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 412
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
