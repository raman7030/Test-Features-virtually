.class public final Ll/ۖۛ֫;
.super Ljava/lang/Object;
.source "08RN"

# interfaces
.implements Ll/ۙۛ֫;


# instance fields
.field public final ֡:Ljava/util/Set;

.field public final ֨:Ll/ۢۛ֫;

.field public final ۖ:Z

.field public ۘ:Landroid/os/Handler;

.field public ۚ:I

.field public volatile ۜ:Ll/ܿۛ֫;

.field public final ۠:Ll/ܺۛ֫;

.field public ۡ:[B

.field public ۢ:Ll/ۧۛ֫;

.field public final ۧ:Ll/ܿۨ֫;

.field public final ܳ:Ljava/util/HashMap;

.field public final ܶ:J

.field public ܺ:Ll/ۧۛ֫;

.field public ܽ:Ll/۟ۛ֫;

.field public final ܿ:Ljava/util/Set;

.field public final ᩳ:Ll/᩺ۛ֫;

.field public ᩴ:Landroid/os/Looper;

.field public ᩵:Ll/ܰ۬֫;

.field public final ᩶:Ljava/util/UUID;

.field public final ᩷:Z

.field public final ᩸:Ljava/util/ArrayList;

.field public final ᩹:[I

.field public final ᩻:Ll/ۧܳۧ;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Ll/᩵ۢ֡;Ll/ܿۨ֫;Ljava/util/HashMap;Z[IZLl/᩺ܿۧ;J)V
    .locals 2

    .line 343
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    sget-object v0, Ll/᩻ᩴ֫;->ۧ:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Use C.CLEARKEY_UUID instead"

    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 346
    iput-object p1, p0, Ll/ۖۛ֫;->᩶:Ljava/util/UUID;

    .line 347
    iput-object p2, p0, Ll/ۖۛ֫;->ᩳ:Ll/᩺ۛ֫;

    .line 348
    iput-object p3, p0, Ll/ۖۛ֫;->ۧ:Ll/ܿۨ֫;

    .line 349
    iput-object p4, p0, Ll/ۖۛ֫;->ܳ:Ljava/util/HashMap;

    .line 350
    iput-boolean p5, p0, Ll/ۖۛ֫;->᩷:Z

    .line 351
    iput-object p6, p0, Ll/ۖۛ֫;->᩹:[I

    .line 352
    iput-boolean p7, p0, Ll/ۖۛ֫;->ۖ:Z

    .line 353
    iput-object p8, p0, Ll/ۖۛ֫;->᩻:Ll/ۧܳۧ;

    .line 354
    new-instance p1, Ll/ۢۛ֫;

    invoke-direct {p1}, Ll/ۢۛ֫;-><init>()V

    iput-object p1, p0, Ll/ۖۛ֫;->֨:Ll/ۢۛ֫;

    .line 355
    new-instance p1, Ll/ܺۛ֫;

    invoke-direct {p1, p0}, Ll/ܺۛ֫;-><init>(Ll/ۖۛ֫;)V

    iput-object p1, p0, Ll/ۖۛ֫;->۠:Ll/ܺۛ֫;

    .line 357
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۖۛ֫;->᩸:Ljava/util/ArrayList;

    .line 481
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 454
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p1

    .line 358
    iput-object p1, p0, Ll/ۖۛ֫;->֡:Ljava/util/Set;

    .line 481
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 454
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p1

    .line 359
    iput-object p1, p0, Ll/ۖۛ֫;->ܿ:Ljava/util/Set;

    .line 360
    iput-wide p9, p0, Ll/ۖۛ֫;->ܶ:J

    return-void
.end method

.method public static ֫(Ll/᩵ᩴ֫;Ljava/util/UUID;Z)Ljava/util/ArrayList;
    .locals 4

    .line 782
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Ll/᩵ᩴ֫;->᩹:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 783
    :goto_0
    iget v2, p0, Ll/᩵ᩴ֫;->᩹:I

    if-ge v1, v2, :cond_3

    .line 784
    invoke-virtual {p0, v1}, Ll/᩵ᩴ֫;->֫(I)Ll/ᩴᩴ֫;

    move-result-object v2

    .line 786
    invoke-virtual {v2, p1}, Ll/ᩴᩴ֫;->֫(Ljava/util/UUID;)Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    .line 787
    invoke-virtual {v3, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Ll/᩻ᩴ֫;->ۧ:Ljava/util/UUID;

    invoke-virtual {v2, v3}, Ll/ᩴᩴ֫;->֫(Ljava/util/UUID;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 788
    :cond_0
    iget-object v3, v2, Ll/ᩴᩴ֫;->᩸:[B

    if-nez v3, :cond_1

    if-eqz p2, :cond_2

    .line 789
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ۖۛ֫;)Ljava/util/Set;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۛ֫;->ܿ:Ljava/util/Set;

    return-object p0
.end method

.method private ֫(Landroid/os/Looper;Ll/ܶۛ֫;Ll/۠ᩴ֫;Z)Ll/֡ۛ֫;
    .locals 4

    .line 621
    iget-object v0, p0, Ll/ۖۛ֫;->ۜ:Ll/ܿۛ֫;

    if-nez v0, :cond_0

    .line 622
    new-instance v0, Ll/ܿۛ֫;

    invoke-direct {v0, p0, p1}, Ll/ܿۛ֫;-><init>(Ll/ۖۛ֫;Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ۖۛ֫;->ۜ:Ll/ܿۛ֫;

    .line 476
    :cond_0
    iget-object p1, p3, Ll/۠ᩴ֫;->ۘ:Ll/᩵ᩴ֫;

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p1, :cond_7

    .line 478
    iget-object p1, p3, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 479
    invoke-static {p1}, Ll/ۢ᩵֫;->ܿ(Ljava/lang/String;)I

    move-result p1

    .line 549
    iget-object p2, p0, Ll/ۖۛ֫;->ܽ:Ll/۟ۛ֫;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    invoke-interface {p2}, Ll/۟ۛ֫;->ᩳ()I

    move-result p3

    const/4 v2, 0x2

    if-ne p3, v2, :cond_1

    sget-boolean p3, Ll/֫ۨ֫;->ܽ:Z

    if-eqz p3, :cond_1

    goto :goto_3

    .line 554
    :cond_1
    iget-object p3, p0, Ll/ۖۛ֫;->᩹:[I

    .line 1266
    :goto_0
    array-length v2, p3

    const/4 v3, -0x1

    if-ge v0, v2, :cond_3

    .line 1267
    aget v2, p3, v0

    if-ne v2, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, -0x1

    :goto_1
    if-eq v0, v3, :cond_6

    .line 556
    invoke-interface {p2}, Ll/۟ۛ֫;->ᩳ()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_4

    goto :goto_3

    .line 559
    :cond_4
    iget-object p1, p0, Ll/ۖۛ֫;->ܺ:Ll/ۧۛ֫;

    if-nez p1, :cond_5

    .line 562
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    .line 561
    invoke-direct {p0, p1, p2, v1, p4}, Ll/ۖۛ֫;->֫(Ljava/util/List;ZLl/ܶۛ֫;Z)Ll/ۧۛ֫;

    move-result-object p1

    .line 566
    iget-object p2, p0, Ll/ۖۛ֫;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 567
    iput-object p1, p0, Ll/ۖۛ֫;->ܺ:Ll/ۧۛ֫;

    goto :goto_2

    .line 569
    :cond_5
    invoke-virtual {p1, v1}, Ll/ۧۛ֫;->֫(Ll/ܶۛ֫;)V

    .line 571
    :goto_2
    iget-object p1, p0, Ll/ۖۛ֫;->ܺ:Ll/ۧۛ֫;

    return-object p1

    :cond_6
    :goto_3
    return-object v1

    .line 484
    :cond_7
    iget-object p3, p0, Ll/ۖۛ֫;->ۡ:[B

    if-nez p3, :cond_9

    .line 485
    iget-object p3, p0, Ll/ۖۛ֫;->᩶:Ljava/util/UUID;

    invoke-static {p1, p3, v0}, Ll/ۖۛ֫;->֫(Ll/᩵ᩴ֫;Ljava/util/UUID;Z)Ljava/util/ArrayList;

    move-result-object p1

    .line 486
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_a

    .line 487
    new-instance p1, Ll/ܳۛ֫;

    iget-object p3, p0, Ll/ۖۛ֫;->᩶:Ljava/util/UUID;

    .line 263
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Media does not support uuid: "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string p3, "DRM error"

    .line 488
    invoke-static {p3, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p2, :cond_8

    .line 490
    invoke-virtual {p2, p1}, Ll/ܶۛ֫;->֫(Ljava/lang/Exception;)V

    .line 492
    :cond_8
    new-instance p2, Ll/ۤۛ֫;

    new-instance p3, Ll/᩵ۛ֫;

    const/16 p4, 0x1773

    invoke-direct {p3, p4, p1}, Ll/᩵ۛ֫;-><init>(ILjava/lang/Throwable;)V

    invoke-direct {p2, p3}, Ll/ۤۛ֫;-><init>(Ll/᩵ۛ֫;)V

    return-object p2

    :cond_9
    move-object p1, v1

    .line 498
    :cond_a
    iget-boolean p3, p0, Ll/ۖۛ֫;->᩷:Z

    if-nez p3, :cond_b

    .line 499
    iget-object v1, p0, Ll/ۖۛ֫;->ۢ:Ll/ۧۛ֫;

    goto :goto_4

    .line 503
    :cond_b
    iget-object p3, p0, Ll/ۖۛ֫;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_c
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧۛ֫;

    .line 504
    iget-object v3, v2, Ll/ۧۛ֫;->ܶ:Ljava/util/List;

    invoke-static {v3, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    move-object v1, v2

    :cond_d
    :goto_4
    if-nez v1, :cond_f

    .line 514
    invoke-direct {p0, p1, v0, p2, p4}, Ll/ۖۛ֫;->֫(Ljava/util/List;ZLl/ܶۛ֫;Z)Ll/ۧۛ֫;

    move-result-object p1

    .line 519
    iget-boolean p2, p0, Ll/ۖۛ֫;->᩷:Z

    if-nez p2, :cond_e

    .line 520
    iput-object p1, p0, Ll/ۖۛ֫;->ۢ:Ll/ۧۛ֫;

    .line 522
    :cond_e
    iget-object p2, p0, Ll/ۖۛ֫;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p1

    .line 524
    :cond_f
    invoke-virtual {v1, p2}, Ll/ۧۛ֫;->֫(Ll/ܶۛ֫;)V

    return-object v1
.end method

.method public static bridge synthetic ֫(Ll/ۖۛ֫;Landroid/os/Looper;Ll/ܶۛ֫;Ll/۠ᩴ֫;)Ll/֡ۛ֫;
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۖۛ֫;->֫(Landroid/os/Looper;Ll/ܶۛ֫;Ll/۠ᩴ֫;Z)Ll/֡ۛ֫;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ljava/util/List;ZLl/ܶۛ֫;)Ll/ۧۛ֫;
    .locals 16

    move-object/from16 v0, p0

    .line 710
    iget-object v1, v0, Ll/ۖۛ֫;->ܽ:Ll/۟ۛ֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    iget-boolean v1, v0, Ll/ۖۛ֫;->ۖ:Z

    or-int v8, v1, p2

    .line 713
    new-instance v1, Ll/ۧۛ֫;

    iget-object v4, v0, Ll/ۖۛ֫;->ܽ:Ll/۟ۛ֫;

    iget-object v10, v0, Ll/ۖۛ֫;->ۡ:[B

    iget-object v13, v0, Ll/ۖۛ֫;->ᩴ:Landroid/os/Looper;

    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    iget-object v15, v0, Ll/ۖۛ֫;->᩵:Ll/ܰ۬֫;

    .line 155
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    iget-object v3, v0, Ll/ۖۛ֫;->᩶:Ljava/util/UUID;

    iget-object v5, v0, Ll/ۖۛ֫;->֨:Ll/ۢۛ֫;

    iget-object v6, v0, Ll/ۖۛ֫;->۠:Ll/ܺۛ֫;

    iget-object v11, v0, Ll/ۖۛ֫;->ܳ:Ljava/util/HashMap;

    iget-object v12, v0, Ll/ۖۛ֫;->ۧ:Ll/ܿۨ֫;

    iget-object v14, v0, Ll/ۖۛ֫;->᩻:Ll/ۧܳۧ;

    move-object v2, v1

    move-object/from16 v7, p1

    move/from16 v9, p2

    invoke-direct/range {v2 .. v15}, Ll/ۧۛ֫;-><init>(Ljava/util/UUID;Ll/۟ۛ֫;Ll/ۛۤ֫;Ll/ۨۤ֫;Ljava/util/List;ZZ[BLjava/util/HashMap;Ll/ܿۨ֫;Landroid/os/Looper;Ll/ۧܳۧ;Ll/ܰ۬֫;)V

    move-object/from16 v2, p3

    .line 733
    invoke-virtual {v1, v2}, Ll/ۧۛ֫;->֫(Ll/ܶۛ֫;)V

    .line 734
    iget-wide v2, v0, Ll/ۖۛ֫;->ܶ:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    const/4 v2, 0x0

    .line 736
    invoke-virtual {v1, v2}, Ll/ۧۛ֫;->֫(Ll/ܶۛ֫;)V

    :cond_0
    return-object v1
.end method

.method private ֫(Ljava/util/List;ZLl/ܶۛ֫;Z)Ll/ۧۛ֫;
    .locals 9

    .line 632
    invoke-direct {p0, p1, p2, p3}, Ll/ۖۛ֫;->֫(Ljava/util/List;ZLl/ܶۛ֫;)Ll/ۧۛ֫;

    move-result-object v0

    .line 635
    invoke-static {v0}, Ll/ۖۛ֫;->֫(Ll/֡ۛ֫;)Z

    move-result v1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v4, p0, Ll/ۖۛ֫;->ܶ:J

    const/4 v6, 0x0

    iget-object v7, p0, Ll/ۖۛ֫;->ܿ:Ljava/util/Set;

    if-eqz v1, :cond_2

    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 683
    invoke-static {v7}, Ll/ۛ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ۛ۬ܺ;

    move-result-object v1

    .line 684
    invoke-virtual {v1}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֡ۛ֫;

    .line 685
    invoke-interface {v8, v6}, Ll/֡ۛ֫;->ۧ(Ll/ܶۛ֫;)V

    goto :goto_0

    .line 674
    :cond_0
    invoke-virtual {v0, p3}, Ll/ۧۛ֫;->ۧ(Ll/ܶۛ֫;)V

    cmp-long v1, v4, v2

    if-eqz v1, :cond_1

    .line 676
    invoke-virtual {v0, v6}, Ll/ۧۛ֫;->ۧ(Ll/ܶۛ֫;)V

    .line 638
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ll/ۖۛ֫;->֫(Ljava/util/List;ZLl/ܶۛ֫;)Ll/ۧۛ֫;

    move-result-object v0

    .line 644
    :cond_2
    invoke-static {v0}, Ll/ۖۛ֫;->֫(Ll/֡ۛ֫;)Z

    move-result v1

    if-eqz v1, :cond_6

    if-eqz p4, :cond_6

    .line 646
    iget-object p4, p0, Ll/ۖۛ֫;->֡:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 693
    invoke-static {p4}, Ll/ۛ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ۛ۬ܺ;

    move-result-object p4

    .line 694
    invoke-virtual {p4}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object p4

    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۛ֫;

    .line 695
    invoke-virtual {v1}, Ll/᩷ۛ֫;->֫()V

    goto :goto_1

    .line 648
    :cond_3
    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_4

    .line 683
    invoke-static {v7}, Ll/ۛ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ۛ۬ܺ;

    move-result-object p4

    .line 684
    invoke-virtual {p4}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۛ֫;

    .line 685
    invoke-interface {v1, v6}, Ll/֡ۛ֫;->ۧ(Ll/ܶۛ֫;)V

    goto :goto_2

    .line 674
    :cond_4
    invoke-virtual {v0, p3}, Ll/ۧۛ֫;->ۧ(Ll/ܶۛ֫;)V

    cmp-long p4, v4, v2

    if-eqz p4, :cond_5

    .line 676
    invoke-virtual {v0, v6}, Ll/ۧۛ֫;->ۧ(Ll/ܶۛ֫;)V

    .line 654
    :cond_5
    invoke-direct {p0, p1, p2, p3}, Ll/ۖۛ֫;->֫(Ljava/util/List;ZLl/ܶۛ֫;)Ll/ۧۛ֫;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v0
.end method

.method private ֫(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 753
    iget-object p1, p0, Ll/ۖۛ֫;->ᩴ:Landroid/os/Looper;

    if-nez p1, :cond_0

    .line 754
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    const-string v0, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread."

    invoke-static {v0, p1}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 758
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v0, p0, Ll/ۖۛ֫;->ᩴ:Landroid/os/Looper;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 758
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    if-eq p1, v0, :cond_1

    .line 759
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 762
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nExpected thread: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ۖۛ֫;->ᩴ:Landroid/os/Looper;

    .line 764
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 759
    invoke-static {p1, v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public static ֫(Ll/֡ۛ֫;)Z
    .locals 2

    .line 660
    check-cast p0, Ll/ۧۛ֫;

    invoke-virtual {p0}, Ll/ۧۛ֫;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 663
    :cond_0
    invoke-virtual {p0}, Ll/ۧۛ֫;->getError()Ll/᩵ۛ֫;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 664
    instance-of v0, p0, Landroid/media/ResourceBusyException;

    if-nez v0, :cond_2

    .line 665
    invoke-static {p0}, Ll/۬ۛ֫;->ۧ(Ljava/lang/Throwable;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_1
    return v1
.end method

.method public static bridge synthetic ۖ(Ll/ۖۛ֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۖۛ֫;->ܽ()V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۖۛ֫;)Ll/ۢۛ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۛ֫;->֨:Ll/ۢۛ֫;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/ۖۛ֫;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ۖۛ֫;->ۢ:Ll/ۧۛ֫;

    return-void
.end method

.method public static bridge synthetic ۢ(Ll/ۖۛ֫;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۛ֫;->᩸:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۖۛ֫;)Ll/ۧۛ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۛ֫;->ۢ:Ll/ۧۛ֫;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۖۛ֫;)Ljava/util/Set;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۛ֫;->֡:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/ۖۛ֫;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ۖۛ֫;->ܺ:Ll/ۧۛ֫;

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۖۛ֫;)Ll/ۧۛ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۛ֫;->ܺ:Ll/ۧۛ֫;

    return-object p0
.end method

.method private ܽ()V
    .locals 1

    .line 742
    iget-object v0, p0, Ll/ۖۛ֫;->ܽ:Ll/۟ۛ֫;

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۖۛ֫;->ۚ:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۖۛ֫;->᩸:Ljava/util/ArrayList;

    .line 744
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۖۛ֫;->֡:Ljava/util/Set;

    .line 745
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 747
    iget-object v0, p0, Ll/ۖۛ֫;->ܽ:Ll/۟ۛ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    invoke-interface {v0}, Ll/۟ۛ֫;->֫()V

    const/4 v0, 0x0

    .line 748
    iput-object v0, p0, Ll/ۖۛ֫;->ܽ:Ll/۟ۛ֫;

    :cond_0
    return-void
.end method

.method public static bridge synthetic ܿ(Ll/ۖۛ֫;)Landroid/os/Looper;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۛ֫;->ᩴ:Landroid/os/Looper;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۖۛ֫;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۛ֫;->ۘ:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۖۛ֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۖۛ֫;->ܶ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩻(Ll/ۖۛ֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۖۛ֫;->ۚ:I

    return p0
.end method


# virtual methods
.method public final ֫(Ll/۠ᩴ֫;)I
    .locals 6

    const/4 v0, 0x0

    .line 532
    invoke-direct {p0, v0}, Ll/ۖۛ֫;->֫(Z)V

    .line 533
    iget-object v1, p0, Ll/ۖۛ֫;->ܽ:Ll/۟ۛ֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    invoke-interface {v1}, Ll/۟ۛ֫;->ᩳ()I

    move-result v1

    .line 534
    iget-object v2, p1, Ll/۠ᩴ֫;->ۘ:Ll/᩵ᩴ֫;

    if-nez v2, :cond_3

    .line 535
    iget-object p1, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {p1}, Ll/ۢ᩵֫;->ܿ(Ljava/lang/String;)I

    move-result p1

    const/4 v2, 0x0

    .line 1266
    :goto_0
    iget-object v3, p0, Ll/ۖۛ֫;->᩹:[I

    array-length v4, v3

    const/4 v5, -0x1

    if-ge v2, v4, :cond_1

    .line 1267
    aget v3, v3, v2

    if-ne v3, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_1
    if-eq v2, v5, :cond_2

    goto :goto_2

    :cond_2
    return v0

    .line 575
    :cond_3
    iget-object p1, p0, Ll/ۖۛ֫;->ۡ:[B

    if-eqz p1, :cond_4

    goto :goto_2

    .line 579
    :cond_4
    iget-object p1, p0, Ll/ۖۛ֫;->᩶:Ljava/util/UUID;

    const/4 v3, 0x1

    invoke-static {v2, p1, v3}, Ll/ۖۛ֫;->֫(Ll/᩵ᩴ֫;Ljava/util/UUID;Z)Ljava/util/ArrayList;

    move-result-object v4

    .line 580
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 581
    iget v4, v2, Ll/᩵ᩴ֫;->᩹:I

    if-ne v4, v3, :cond_8

    invoke-virtual {v2, v0}, Ll/᩵ᩴ֫;->֫(I)Ll/ᩴᩴ֫;

    move-result-object v0

    sget-object v4, Ll/᩻ᩴ֫;->ۧ:Ljava/util/UUID;

    invoke-virtual {v0, v4}, Ll/ᩴᩴ֫;->֫(Ljava/util/UUID;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 583
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "DrmInitData only contains common PSSH SchemeData. Assuming support for: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 590
    :cond_5
    iget-object p1, v2, Ll/᩵ᩴ֫;->ۙ:Ljava/lang/String;

    if-eqz p1, :cond_9

    const-string v0, "cenc"

    .line 591
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    const-string v0, "cbcs"

    .line 594
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 597
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x19

    if-lt p1, v0, :cond_8

    goto :goto_2

    :cond_7
    const-string v0, "cbc1"

    .line 598
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "cens"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    :cond_8
    return v3

    :cond_9
    :goto_2
    return v1
.end method

.method public final ֫(Ll/ܶۛ֫;Ll/۠ᩴ֫;)Ll/֡ۛ֫;
    .locals 3

    const/4 v0, 0x0

    .line 457
    invoke-direct {p0, v0}, Ll/ۖۛ֫;->֫(Z)V

    .line 458
    iget v1, p0, Ll/ۖۛ֫;->ۚ:I

    const/4 v2, 0x1

    if-lez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 459
    iget-object v0, p0, Ll/ۖۛ֫;->ᩴ:Landroid/os/Looper;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 460
    iget-object v0, p0, Ll/ۖۛ֫;->ᩴ:Landroid/os/Looper;

    invoke-direct {p0, v0, p1, p2, v2}, Ll/ۖۛ֫;->֫(Landroid/os/Looper;Ll/ܶۛ֫;Ll/۠ᩴ֫;Z)Ll/֡ۛ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 5

    const/4 v0, 0x1

    .line 417
    invoke-direct {p0, v0}, Ll/ۖۛ֫;->֫(Z)V

    .line 418
    iget v1, p0, Ll/ۖۛ֫;->ۚ:I

    sub-int/2addr v1, v0

    iput v1, p0, Ll/ۖۛ֫;->ۚ:I

    if-eqz v1, :cond_0

    return-void

    .line 422
    :cond_0
    iget-wide v0, p0, Ll/ۖۛ֫;->ܶ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 425
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۖۛ֫;->᩸:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    .line 426
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 427
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧۛ֫;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ll/ۧۛ֫;->ۧ(Ll/ܶۛ֫;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 692
    :cond_1
    iget-object v0, p0, Ll/ۖۛ֫;->֡:Ljava/util/Set;

    .line 693
    invoke-static {v0}, Ll/ۛ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ۛ۬ܺ;

    move-result-object v0

    .line 694
    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۛ֫;

    .line 695
    invoke-virtual {v1}, Ll/᩷ۛ֫;->֫()V

    goto :goto_1

    .line 432
    :cond_2
    invoke-direct {p0}, Ll/ۖۛ֫;->ܽ()V

    return-void
.end method

.method public final ֫(Landroid/os/Looper;Ll/ܰ۬֫;)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 611
    :try_start_0
    iget-object v1, p0, Ll/ۖۛ֫;->ᩴ:Landroid/os/Looper;

    if-nez v1, :cond_0

    .line 612
    iput-object p1, p0, Ll/ۖۛ֫;->ᩴ:Landroid/os/Looper;

    .line 613
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Ll/ۖۛ֫;->ۘ:Landroid/os/Handler;

    goto :goto_1

    :cond_0
    if-ne v1, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 615
    :goto_0
    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 616
    iget-object p1, p0, Ll/ۖۛ֫;->ۘ:Landroid/os/Handler;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 618
    :goto_1
    monitor-exit v0

    .line 438
    iput-object p2, p0, Ll/ۖۛ֫;->᩵:Ll/ܰ۬֫;

    return-void

    :catchall_0
    move-exception p1

    .line 618
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫([B)V
    .locals 1

    .line 388
    iget-object v0, p0, Ll/ۖۛ֫;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 393
    iput-object p1, p0, Ll/ۖۛ֫;->ۡ:[B

    return-void
.end method

.method public final ۧ(Ll/ܶۛ֫;Ll/۠ᩴ֫;)Ll/᩶ۛ֫;
    .locals 2

    .line 445
    iget v0, p0, Ll/ۖۛ֫;->ۚ:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 446
    iget-object v0, p0, Ll/ۖۛ֫;->ᩴ:Landroid/os/Looper;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 447
    new-instance v0, Ll/᩷ۛ֫;

    invoke-direct {v0, p0, p1}, Ll/᩷ۛ֫;-><init>(Ll/ۖۛ֫;Ll/ܶۛ֫;)V

    .line 961
    iget-object p1, p0, Ll/ۖۛ֫;->ۘ:Landroid/os/Handler;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 961
    new-instance v1, Ll/ۜۛ֫;

    invoke-direct {v1, v0, p2}, Ll/ۜۛ֫;-><init>(Ll/᩷ۛ֫;Ll/۠ᩴ֫;)V

    .line 962
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v0
.end method

.method public final ۧ()V
    .locals 5

    const/4 v0, 0x1

    .line 400
    invoke-direct {p0, v0}, Ll/ۖۛ֫;->֫(Z)V

    .line 401
    iget v0, p0, Ll/ۖۛ֫;->ۚ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۖۛ֫;->ۚ:I

    if-eqz v0, :cond_0

    goto :goto_1

    .line 404
    :cond_0
    iget-object v0, p0, Ll/ۖۛ֫;->ܽ:Ll/۟ۛ֫;

    if-nez v0, :cond_1

    .line 405
    iget-object v0, p0, Ll/ۖۛ֫;->ᩳ:Ll/᩺ۛ֫;

    iget-object v1, p0, Ll/ۖۛ֫;->᩶:Ljava/util/UUID;

    invoke-interface {v0, v1}, Ll/᩺ۛ֫;->֫(Ljava/util/UUID;)Ll/۟ۛ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۛ֫;->ܽ:Ll/۟ۛ֫;

    .line 406
    new-instance v1, Ll/ᩳۛ֫;

    invoke-direct {v1, p0}, Ll/ᩳۛ֫;-><init>(Ll/ۖۛ֫;)V

    invoke-interface {v0, v1}, Ll/۟ۛ֫;->֫(Ll/ۨۛ֫;)V

    return-void

    .line 407
    :cond_1
    iget-wide v0, p0, Ll/ۖۛ֫;->ܶ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_2

    const/4 v0, 0x0

    .line 409
    :goto_0
    iget-object v1, p0, Ll/ۖۛ֫;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 410
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۛ֫;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/ۧۛ֫;->֫(Ll/ܶۛ֫;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
