.class public final Ll/ۤ᩺֨;
.super Ljava/lang/Object;
.source "8459"


# instance fields
.field public final ֫:Ll/᩶֡֨;

.field public final ۧ:Ll/۫֡֨;

.field public final ܳ:Ljava/util/LinkedHashMap;

.field public ܽ:I

.field public final synthetic ܿ:Ll/᩺᩺֨;

.field public ᩳ:Ll/ۚۚ۠;


# direct methods
.method public constructor <init>(Ll/᩺᩺֨;Ll/ۚۚ۠;Ll/᩶֡֨;)V
    .locals 6

    .line 456
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ᩺֨;->ܿ:Ll/᩺᩺֨;

    const/4 v0, 0x0

    .line 475
    iput-object v0, p0, Ll/ۤ᩺֨;->ᩳ:Ll/ۚۚ۠;

    const/4 v0, 0x1

    .line 478
    iput v0, p0, Ll/ۤ᩺֨;->ܽ:I

    .line 457
    iput-object p3, p0, Ll/ۤ᩺֨;->֫:Ll/᩶֡֨;

    .line 458
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۤ᩺֨;->ܳ:Ljava/util/LinkedHashMap;

    .line 459
    iput-object p2, p0, Ll/ۤ᩺֨;->ᩳ:Ll/ۚۚ۠;

    .line 460
    invoke-static {p1}, Ll/᩺᩺֨;->ܽ(Ll/᩺᩺֨;)Ll/ۛܶ۠;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ll/᩺᩺֨;->ܿ(Ll/᩺᩺֨;)Ll/ۧۡ۠;

    move-result-object v1

    .line 461
    invoke-virtual {v1}, Ll/ۧۡ۠;->ۚ()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "SwitchMap"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ll/᩺᩺֨;->ܿ(Ll/᩺᩺֨;)Ll/ۧۡ۠;

    move-result-object v1

    .line 463
    invoke-virtual {v1}, Ll/ۧۡ۠;->ۚ()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ll/᩺᩺֨;->ܽ(Ll/᩺᩺֨;)Ll/ۛܶ۠;

    move-result-object v1

    iget-object p3, p3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object p3, p3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 464
    invoke-virtual {p3}, Ll/ۛ֡֨;->۫()Ll/ۤܶ۠;

    move-result-object p3

    invoke-static {p3}, Ll/ᩳ᩻۠;->֫(Ll/ۤܶ۠;)[B

    move-result-object p3

    invoke-virtual {v1, p3}, Ll/ۛܶ۠;->֫([B)Ll/ۤܶ۠;

    move-result-object p3

    invoke-virtual {p3}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object p3

    const/16 v1, 0x2f

    const/16 v2, 0x2e

    .line 465
    invoke-virtual {p3, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Ll/᩺᩺֨;->ܿ(Ll/᩺᩺֨;)Ll/ۧۡ۠;

    move-result-object v1

    .line 466
    invoke-virtual {v1}, Ll/ۧۡ۠;->ۚ()C

    move-result v1

    invoke-virtual {p3, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 414
    iget-object p2, p2, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {p2, p3}, Ll/۫ܶ۠;->֫(Ljava/lang/String;)Ll/ۤܶ۠;

    move-result-object v3

    .line 467
    invoke-static {p1}, Ll/᩺᩺֨;->᩻(Ll/᩺᩺֨;)Ll/ܳ֡֨;

    move-result-object p2

    .line 468
    new-instance p3, Ll/۫֡֨;

    new-instance v4, Ll/ۚۚ֨;

    invoke-static {p1}, Ll/᩺᩺֨;->ᩳ(Ll/᩺᩺֨;)Ll/᩷ۚ֨;

    move-result-object v0

    iget-object v0, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-static {p1}, Ll/᩺᩺֨;->ᩳ(Ll/᩺᩺֨;)Ll/᩷ۚ֨;

    move-result-object p1

    iget-object p1, p1, Ll/᩷ۚ֨;->ܽ:Ll/ܳ֡֨;

    invoke-direct {v4, v0, p1}, Ll/ۚۚ֨;-><init>(Ll/ۙ֨֨;Ll/᩶֡֨;)V

    const-wide/16 v1, 0x1018

    move-object v0, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    iput-object p3, p0, Ll/ۤ᩺֨;->ۧ:Ll/۫֡֨;

    .line 1336
    invoke-virtual {p2}, Ll/ܳ֡֨;->᩶()V

    .line 1337
    iget-object p1, p2, Ll/ܳ֡֨;->֫֫:Ll/ܰ᩵֨;

    .line 693
    invoke-virtual {p1, p3}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 20

    move-object/from16 v0, p0

    .line 498
    iget-object v1, v0, Ll/ۤ᩺֨;->ܿ:Ll/᩺᩺֨;

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v2

    iget-object v3, v0, Ll/ۤ᩺֨;->ᩳ:Ll/ۚۚ۠;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    invoke-static {v3}, Ll/۟ۚ۠;->ۢ(Ll/ۚۚ۠;)I

    move-result v4

    .line 111
    iput v4, v2, Ll/ܿ֨۠;->ܽ:I

    .line 499
    iget-object v2, v0, Ll/ۤ᩺֨;->ۧ:Ll/۫֡֨;

    iget-object v4, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    check-cast v4, Ll/ܳ֡֨;

    invoke-virtual {v1, v4}, Ll/᩺᩺֨;->֫(Ll/ܳ֡֨;)Ll/ۚ᩵۠;

    move-result-object v4

    .line 502
    invoke-static {v1}, Ll/᩺᩺֨;->ܽ(Ll/᩺᩺֨;)Ll/ۛܶ۠;

    move-result-object v5

    iget-object v5, v5, Ll/ۛܶ۠;->᩹ܽ:Ll/ۤܶ۠;

    iget-object v6, v0, Ll/ۤ᩺֨;->֫:Ll/᩶֡֨;

    iget-object v7, v6, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 505
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v8

    .line 502
    invoke-static {v1, v3, v5, v7, v8}, Ll/᩺᩺֨;->֫(Ll/᩺᩺֨;Ll/ۚۚ۠;Ll/ۤܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۘ֡֨;

    move-result-object v5

    .line 506
    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v7

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v8

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v9

    .line 507
    invoke-virtual {v9, v5}, Ll/ܿ֨۠;->ۧ(Ll/ۛ֡֨;)Ll/۫᩵۠;

    move-result-object v5

    invoke-virtual {v8, v5}, Ll/ܿ֨۠;->֫(Ll/۫᩵۠;)Ll/ܺ֡۠;

    move-result-object v5

    invoke-static {v1}, Ll/᩺᩺֨;->ᩳ(Ll/᩺᩺֨;)Ll/᩷ۚ֨;

    move-result-object v8

    iget-object v8, v8, Ll/᩷ۚ֨;->᩻֫:Ll/۫֡֨;

    invoke-virtual {v7, v5, v8}, Ll/ܿ֨۠;->֫(Ll/۫᩵۠;Ll/ۛ֡֨;)Ll/ۛ᩵۠;

    move-result-object v5

    .line 509
    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v7

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v8

    invoke-static {v1}, Ll/᩺᩺֨;->ᩳ(Ll/᩺᩺֨;)Ll/᩷ۚ֨;

    move-result-object v9

    iget-object v9, v9, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 510
    invoke-virtual {v8, v9}, Ll/ܿ֨۠;->ܽ(Ll/ۙ֨֨;)Ll/۫᩵۠;

    move-result-object v8

    invoke-static {v5}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v5

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v5, v9}, Ll/ܿ֨۠;->ۧ(Ll/۫᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ᩴ֡۠;

    move-result-object v5

    new-instance v7, Ll/ۚۚ֨;

    invoke-static {v1}, Ll/᩺᩺֨;->ᩳ(Ll/᩺᩺֨;)Ll/᩷ۚ֨;

    move-result-object v8

    iget-object v8, v8, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-static {v1}, Ll/᩺᩺֨;->ᩳ(Ll/᩺᩺֨;)Ll/᩷ۚ֨;

    move-result-object v10

    iget-object v10, v10, Ll/᩷ۚ֨;->ܽ:Ll/ܳ֡֨;

    invoke-direct {v7, v8, v10}, Ll/ۚۚ֨;-><init>(Ll/ۙ֨֨;Ll/᩶֡֨;)V

    .line 471
    iput-object v7, v5, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 514
    new-instance v7, Ll/ᩴܶ۠;

    invoke-direct {v7}, Ll/ᩴܶ۠;-><init>()V

    .line 515
    invoke-static {v1}, Ll/᩺᩺֨;->ܽ(Ll/᩺᩺֨;)Ll/ۛܶ۠;

    move-result-object v8

    iget-object v8, v8, Ll/ۛܶ۠;->ܽܽ:Ll/ۤܶ۠;

    iget-object v6, v6, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 518
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v10

    .line 515
    invoke-static {v1, v3, v8, v6, v10}, Ll/᩺᩺֨;->֫(Ll/᩺᩺֨;Ll/ۚۚ۠;Ll/ۤܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۘ֡֨;

    move-result-object v3

    .line 519
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v6

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v8

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v10

    new-instance v15, Ll/۫֡֨;

    invoke-static {v1}, Ll/᩺᩺֨;->ܽ(Ll/᩺᩺֨;)Ll/ۛܶ۠;

    move-result-object v11

    iget-object v14, v11, Ll/ۛܶ۠;->᩻ۧ:Ll/ۤܶ۠;

    invoke-static {v1}, Ll/᩺᩺֨;->ᩳ(Ll/᩺᩺֨;)Ll/᩷ۚ֨;

    move-result-object v11

    iget-object v12, v11, Ll/᩷ۚ֨;->֨֫:Ll/ۙ֨֨;

    invoke-static {v1}, Ll/᩺᩺֨;->ᩳ(Ll/᩺᩺֨;)Ll/᩷ۚ֨;

    move-result-object v11

    iget-object v13, v11, Ll/᩷ۚ֨;->۠֫:Ll/᩶֡֨;

    const-wide v16, 0x200000000L

    move-object v11, v15

    move-object/from16 v18, v12

    move-object/from16 v19, v13

    move-wide/from16 v12, v16

    move-object v9, v15

    move-object/from16 v15, v18

    move-object/from16 v16, v19

    invoke-direct/range {v11 .. v16}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    const/4 v11, 0x0

    .line 520
    invoke-virtual {v10, v9, v11}, Ll/ܿ֨۠;->֫(Ll/۫֡֨;Ll/۫᩵۠;)Ll/ۢۚ۠;

    move-result-object v9

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v10

    .line 524
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v11

    const-wide/16 v12, 0x0

    invoke-virtual {v10, v12, v13, v11}, Ll/ܿ֨۠;->֫(JLl/ۖܶ۠;)Ll/ۖ᩵۠;

    move-result-object v10

    .line 520
    invoke-virtual {v8, v9, v10}, Ll/ܿ֨۠;->֫(Ll/ۢۚ۠;Ll/ۖ᩵۠;)Ll/֡᩵۠;

    move-result-object v8

    invoke-virtual {v6, v8}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v6

    .line 525
    iget-object v8, v0, Ll/ۤ᩺֨;->ܳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    .line 526
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۫֡֨;

    .line 527
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    .line 528
    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v11

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v12

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v13

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v14

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v15

    .line 530
    invoke-virtual {v15, v10}, Ll/ܿ֨۠;->ۧ(Ll/ۛ֡֨;)Ll/۫᩵۠;

    move-result-object v10

    invoke-virtual {v14, v10, v3}, Ll/ܿ֨۠;->֫(Ll/۫᩵۠;Ll/ۛ֡֨;)Ll/ۛ᩵۠;

    move-result-object v10

    invoke-virtual {v13, v10}, Ll/ܿ֨۠;->֫(Ll/۫᩵۠;)Ll/ܺ֡۠;

    move-result-object v10

    .line 529
    invoke-virtual {v12, v2, v10}, Ll/ܿ֨۠;->֫(Ll/۫֡֨;Ll/ܺ֡۠;)Ll/ܳ᩵۠;

    move-result-object v10

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v12

    .line 532
    invoke-virtual {v12, v9}, Ll/ܿ֨۠;->֫(Ljava/lang/Object;)Ll/᩻֡۠;

    move-result-object v9

    .line 529
    invoke-virtual {v11, v10, v9}, Ll/ܿ֨۠;->֫(Ll/۫᩵۠;Ll/۫᩵۠;)Ll/᩷᩵۠;

    move-result-object v9

    invoke-static {v1}, Ll/᩺᩺֨;->ᩳ(Ll/᩺᩺֨;)Ll/᩷ۚ֨;

    move-result-object v10

    iget-object v10, v10, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 471
    iput-object v10, v9, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 534
    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v10

    invoke-virtual {v10, v9}, Ll/ܿ֨۠;->ۧ(Ll/۫᩵۠;)Ll/ۤ᩵۠;

    move-result-object v9

    .line 535
    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v10

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v11

    invoke-static {v9}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v9

    const-wide/16 v12, 0x0

    invoke-virtual {v11, v12, v13, v9}, Ll/ܿ֨۠;->֫(JLl/ۖܶ۠;)Ll/ۖ᩵۠;

    move-result-object v9

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v11

    const/4 v12, 0x0

    invoke-virtual {v10, v11, v9, v6, v12}, Ll/ܿ֨۠;->֫(Ll/ۖܶ۠;Ll/ۖ᩵۠;Ll/ۖܶ۠;Ll/ۖ᩵۠;)Ll/ۧۚ۠;

    move-result-object v9

    .line 536
    invoke-virtual {v7, v9}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 539
    :cond_0
    iget-object v3, v4, Ll/ۚ᩵۠;->ۗ:Ll/ۖܶ۠;

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v6

    const-wide/16 v8, 0x8

    .line 540
    invoke-virtual {v7}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v7

    invoke-virtual {v6, v8, v9, v7}, Ll/ܿ֨۠;->֫(JLl/ۖܶ۠;)Ll/ۖ᩵۠;

    move-result-object v6

    invoke-virtual {v3, v6}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v3

    invoke-static {v1}, Ll/᩺᩺֨;->ۧ(Ll/᩺᩺֨;)Ll/ܿ֨۠;

    move-result-object v1

    .line 541
    invoke-virtual {v1, v2, v5}, Ll/ܿ֨۠;->֫(Ll/۫֡֨;Ll/۫᩵۠;)Ll/ۢۚ۠;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v1

    iput-object v1, v4, Ll/ۚ᩵۠;->ۗ:Ll/ۖܶ۠;

    return-void
.end method
