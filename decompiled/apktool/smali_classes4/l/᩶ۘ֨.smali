.class public final Ll/᩶ۘ֨;
.super Ljava/lang/Object;
.source "P7M1"


# static fields
.field public static final ᩸:Ll/ۙ֨۠;


# instance fields
.field public ֡:Ll/᩷ۚ֨;

.field public ֨:Z

.field public final ֫:Ll/۬᩹֨;

.field public ۖ:Z

.field public ۘ:Z

.field public final ۚ:Ll/ۘ᩹ܽ;

.field public final ۜ:Ll/ᩳ۠۠;

.field public ۠:Z

.field public final ۡ:Ll/᩹ܶ۠;

.field public final ۢ:Ll/ۧ᩶۠;

.field public ۧ:Z

.field public ܳ:Ll/֫᩶۠;

.field public ܶ:Z

.field public final ܺ:Ll/ۛܶ۠;

.field public final ܽ:Ll/᩷֡֨;

.field public ܿ:Ll/ᩳ᩶۠;

.field public final ᩳ:Ll/ۤܶ۠;

.field public ᩴ:Ll/᩶ۜ۠;

.field public ᩵:Ll/ۜ֡֨;

.field public ᩷:Ll/ۛ۠۠;

.field public final ᩻:Ll/֫ᩴ֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 78
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/᩶ۘ֨;->᩸:Ll/ۙ֨۠;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 6

    .line 177
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    sget-object v0, Ll/ۜ֡֨;->ܶ:Ll/ۜ֡֨;

    iput-object v0, p0, Ll/᩶ۘ֨;->᩵:Ll/ۜ֡֨;

    const/4 v0, 0x0

    .line 141
    iput-object v0, p0, Ll/᩶ۘ֨;->ܿ:Ll/ᩳ᩶۠;

    .line 162
    new-instance v1, Ll/ۘ᩹ܽ;

    const/16 v2, 0xb

    invoke-direct {v1, v2, p0}, Ll/ۘ᩹ܽ;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, Ll/᩶ۘ֨;->ۚ:Ll/ۘ᩹ܽ;

    const/4 v1, 0x1

    .line 522
    iput-boolean v1, p0, Ll/᩶ۘ֨;->ܶ:Z

    .line 178
    sget-object v1, Ll/᩶ۘ֨;->᩸:Ll/ۙ֨۠;

    invoke-virtual {p1, v1, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 179
    invoke-static {p1}, Ll/᩶ۜ۠;->֫(Ll/ۗ֨۠;)Ll/᩶ۜ۠;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ۘ֨;->ᩴ:Ll/᩶ۜ۠;

    .line 180
    invoke-static {p1}, Ll/ۛܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۛܶ۠;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ۘ֨;->ܺ:Ll/ۛܶ۠;

    .line 181
    invoke-static {p1}, Ll/᩷ۚ֨;->֫(Ll/ۗ֨۠;)Ll/᩷ۚ֨;

    move-result-object v2

    iput-object v2, p0, Ll/᩶ۘ֨;->֡:Ll/᩷ۚ֨;

    .line 182
    const-class v2, Ll/ۧ᩶۠;

    invoke-virtual {p1, v2}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ᩶۠;

    iput-object v2, p0, Ll/᩶ۘ֨;->ۢ:Ll/ۧ᩶۠;

    .line 183
    invoke-static {p1}, Ll/ᩳ۠۠;->֫(Ll/ۗ֨۠;)Ll/ᩳ۠۠;

    move-result-object v3

    iput-object v3, p0, Ll/᩶ۘ֨;->ۜ:Ll/ᩳ۠۠;

    if-eqz v2, :cond_1

    .line 186
    invoke-static {p1}, Ll/ۛ۠۠;->֫(Ll/ۗ֨۠;)Ll/ۛ۠۠;

    move-result-object v2

    iput-object v2, p0, Ll/᩶ۘ֨;->᩷:Ll/ۛ۠۠;

    .line 187
    invoke-static {p1}, Ll/֫ᩴ֨;->֫(Ll/ۗ֨۠;)Ll/֫ᩴ֨;

    move-result-object v2

    iput-object v2, p0, Ll/᩶ۘ֨;->᩻:Ll/֫ᩴ֨;

    .line 189
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v3

    iput-object v3, p0, Ll/᩶ۘ֨;->ۡ:Ll/᩹ܶ۠;

    .line 190
    invoke-static {p1}, Ll/۬᩹֨;->֫(Ll/ۗ֨۠;)Ll/۬᩹֨;

    move-result-object v3

    iput-object v3, p0, Ll/᩶ۘ֨;->֫:Ll/۬᩹֨;

    .line 192
    invoke-static {p1}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v3

    .line 193
    sget-object v4, Ll/֡ۖ۠;->ۙۧ:Ll/֡ۖ۠;

    invoke-virtual {v3, v4}, Ll/ۨܶ۠;->ۧ(Ll/֡ۖ۠;)Z

    move-result v4

    iput-boolean v4, p0, Ll/᩶ۘ֨;->۠:Z

    const-string v4, "dev"

    .line 194
    invoke-virtual {v3, v4}, Ll/ۨܶ۠;->ܽ(Ljava/lang/String;)Z

    move-result v4

    iput-boolean v4, p0, Ll/᩶ۘ֨;->ۧ:Z

    const-string v4, "-Xprefer"

    .line 195
    invoke-virtual {v3, v4}, Ll/ۨܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "source"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    iput-boolean v4, p0, Ll/᩶ۘ֨;->ۘ:Z

    .line 196
    sget-object v4, Ll/֡ۖ۠;->ᩴܽ:Ll/֡ۖ۠;

    invoke-virtual {v3, v4}, Ll/ۨܶ۠;->ۧ(Ll/֡ۖ۠;)Z

    move-result v4

    iput-boolean v4, p0, Ll/᩶ۘ֨;->֨:Z

    const-string v4, "failcomplete"

    .line 199
    invoke-virtual {v3, v4}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 200
    invoke-virtual {v3, v4}, Ll/ۨܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 414
    iget-object v1, v1, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {v1, v3}, Ll/۫ܶ۠;->֫(Ljava/lang/String;)Ll/ۤܶ۠;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 201
    :goto_0
    iput-object v1, p0, Ll/᩶ۘ֨;->ᩳ:Ll/ۤܶ۠;

    .line 218
    invoke-static {p1}, Ll/ۛۢ۠;->֫(Ll/ۗ֨۠;)Ll/ۛۢ۠;

    .line 219
    new-instance p1, Ll/᩷֡֨;

    new-instance v1, Ll/ۖۘ֨;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {p1, v0, v1, v2}, Ll/᩷֡֨;-><init>(Ll/ۛ֡֨;Ljava/util/function/Supplier;Ll/֫ᩴ֨;)V

    iput-object p1, p0, Ll/᩶ۘ֨;->ܽ:Ll/᩷֡֨;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 220
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void

    .line 185
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "FileManager initialization error"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/᩶ۘ֨;
    .locals 1

    .line 170
    sget-object v0, Ll/᩶ۘ֨;->᩸:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۘ֨;

    if-nez v0, :cond_0

    .line 172
    new-instance v0, Ll/᩶ۘ֨;

    invoke-direct {v0, p0}, Ll/᩶ۘ֨;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/ۛ֡֨;)V
    .locals 2

    .line 310
    iget-object v0, p0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-static {v0}, Ll/᩶ۘ֨;->֫(Ll/ۛ֡֨;)V

    .line 311
    :cond_0
    invoke-virtual {p0}, Ll/ۛ֡֨;->᩶()V

    return-void
.end method

.method private ֫(Ll/۠֡֨;)V
    .locals 12

    .line 530
    iget-object v0, p1, Ll/۠֡֨;->ۨ:Ll/ܰ᩵֨;

    iget-object v1, p1, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    if-nez v0, :cond_0

    .line 269
    new-instance v0, Ll/ۤ᩵֨;

    invoke-direct {v0, p1}, Ll/ۤ᩵֨;-><init>(Ll/ۛ֡֨;)V

    .line 531
    iput-object v0, p1, Ll/۠֡֨;->ۨ:Ll/ܰ᩵֨;

    .line 533
    :cond_0
    iget-object v0, p1, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    .line 535
    new-instance v2, Ll/ۖ۠֨;

    const/4 v3, 0x1

    invoke-direct {v2, p1, v3}, Ll/ۖ۠֨;-><init>(Ll/ܰۖ֨;I)V

    invoke-static {v0, v2}, Ll/۫ۙ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)V

    .line 537
    invoke-virtual {v0}, Ll/ۛ֡֨;->᩶()V

    .line 539
    iget-object v2, p0, Ll/᩶ۘ֨;->֡:Ll/᩷ۚ֨;

    iget-object v2, v2, Ll/᩷ۚ֨;->ۚ֫:Ll/֡֡֨;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v2, :cond_2

    .line 540
    iput-boolean v3, p0, Ll/᩶ۘ֨;->ۖ:Z

    .line 541
    iget-boolean v0, p0, Ll/᩶ۘ֨;->֨:Z

    if-eqz v0, :cond_1

    .line 542
    invoke-direct {p0, p1, v4}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Z)V

    .line 543
    iput-boolean v4, p0, Ll/᩶ۘ֨;->ۖ:Z

    .line 693
    sget-object v0, Ll/᩷᩶۠;->ۨ:Ll/᩷᩶۠;

    .line 696
    invoke-virtual {v1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    .line 697
    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    .line 694
    invoke-virtual {p0, v0, p1, v1, v2}, Ll/᩶ۘ֨;->֫(Ll/֫᩶۠;Ll/۠֡֨;Ljava/lang/String;Ljava/util/EnumSet;)Ll/ۚۘ֨;

    move-result-object v1

    .line 693
    invoke-direct {p0, p1, v0, v1}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Ll/֫᩶۠;Ll/ۚۘ֨;)V

    return-void

    :cond_1
    sget-object v0, Ll/᩷᩶۠;->ۨ:Ll/᩷᩶۠;

    .line 696
    invoke-virtual {v1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    .line 697
    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    .line 694
    invoke-virtual {p0, v0, p1, v1, v2}, Ll/᩶ۘ֨;->֫(Ll/֫᩶۠;Ll/۠֡֨;Ljava/lang/String;Ljava/util/EnumSet;)Ll/ۚۘ֨;

    move-result-object v1

    .line 693
    invoke-direct {p0, p1, v0, v1}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Ll/֫᩶۠;Ll/ۚۘ֨;)V

    .line 547
    invoke-direct {p0, p1, v4}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Z)V

    return-void

    .line 549
    :cond_2
    iget-object v2, v0, Ll/֡֡֨;->ۛ:Ll/֫᩶۠;

    sget-object v5, Ll/᩷᩶۠;->ۗ:Ll/᩷᩶۠;

    if-ne v2, v5, :cond_4

    .line 550
    iget-object v0, v0, Ll/֡֡֨;->᩷֫:Ll/֫᩶۠;

    sget-object v1, Ll/᩷᩶۠;->ܰ:Ll/᩷᩶۠;

    if-ne v0, v1, :cond_3

    const/4 v3, 0x1

    :cond_3
    invoke-direct {p0, p1, v3}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Z)V

    return-void

    .line 511
    :cond_4
    sget-object v2, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    sget-object v5, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    invoke-static {v2, v5}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v6

    .line 565
    invoke-static {v6}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v7

    .line 566
    invoke-interface {v7, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 567
    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    .line 569
    invoke-static {v6}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v6

    .line 570
    invoke-interface {v6, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 571
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    .line 573
    invoke-virtual {v1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v1

    .line 575
    iget-object v8, v0, Ll/֡֡֨;->ۛ:Ll/֫᩶۠;

    .line 576
    iget-object v9, v0, Ll/֡֡֨;->᩷֫:Ll/֫᩶۠;

    .line 577
    iget-object v10, v0, Ll/֡֡֨;->ܽ֫:Ll/֫᩶۠;

    .line 578
    iget-object v0, v0, Ll/֡֡֨;->ᩳ֫:Ll/֫᩶۠;

    .line 580
    iget-boolean v11, p0, Ll/᩶ۘ֨;->ۖ:Z

    .line 583
    :try_start_0
    iput-boolean v3, p0, Ll/᩶ۘ֨;->ۖ:Z

    if-nez v5, :cond_5

    if-eqz v0, :cond_5

    .line 586
    invoke-virtual {p0, v0, p1, v1, v7}, Ll/᩶ۘ֨;->֫(Ll/֫᩶۠;Ll/۠֡֨;Ljava/lang/String;Ljava/util/EnumSet;)Ll/ۚۘ֨;

    move-result-object v3

    .line 585
    invoke-direct {p0, p1, v0, v3}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Ll/֫᩶۠;Ll/ۚۘ֨;)V

    :cond_5
    if-eqz v5, :cond_6

    if-nez v2, :cond_7

    :cond_6
    if-eqz v10, :cond_7

    .line 592
    const-class v0, Ll/ܽ᩶۠;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    .line 593
    invoke-interface {v0, v7}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 594
    invoke-interface {v0, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 596
    invoke-virtual {p0, v10, p1, v1, v0}, Ll/᩶ۘ֨;->֫(Ll/֫᩶۠;Ll/۠֡֨;Ljava/lang/String;Ljava/util/EnumSet;)Ll/ۚۘ֨;

    move-result-object v0

    .line 595
    invoke-direct {p0, p1, v10, v0}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Ll/֫᩶۠;Ll/ۚۘ֨;)V

    .line 601
    :cond_7
    iput-boolean v4, p0, Ll/᩶ۘ֨;->ۖ:Z

    if-nez v5, :cond_8

    if-eqz v8, :cond_8

    .line 604
    invoke-virtual {p0, v8, p1, v1, v7}, Ll/᩶ۘ֨;->֫(Ll/֫᩶۠;Ll/۠֡֨;Ljava/lang/String;Ljava/util/EnumSet;)Ll/ۚۘ֨;

    move-result-object v0

    .line 603
    invoke-direct {p0, p1, v8, v0}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Ll/֫᩶۠;Ll/ۚۘ֨;)V

    :cond_8
    if-nez v2, :cond_9

    if-eqz v9, :cond_9

    .line 611
    invoke-virtual {p0, v9, p1, v1, v6}, Ll/᩶ۘ֨;->֫(Ll/֫᩶۠;Ll/۠֡֨;Ljava/lang/String;Ljava/util/EnumSet;)Ll/ۚۘ֨;

    move-result-object v0

    .line 610
    invoke-direct {p0, p1, v9, v0}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Ll/֫᩶۠;Ll/ۚۘ֨;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 617
    :cond_9
    iput-boolean v11, p0, Ll/᩶ۘ֨;->ۖ:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v11, p0, Ll/᩶ۘ֨;->ۖ:Z

    .line 618
    throw p1
.end method

.method private ֫(Ll/۠֡֨;Ll/֫᩶۠;Ll/ۚۘ֨;)V
    .locals 11

    .line 705
    iput-object p2, p0, Ll/᩶ۘ֨;->ܳ:Ll/֫᩶۠;

    .line 706
    invoke-virtual {p3}, Ll/ۚۘ֨;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    move-object p3, p2

    check-cast p3, Ll/֨ۘ֨;

    invoke-virtual {p3}, Ll/֨ۘ֨;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p3}, Ll/֨ۘ֨;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ᩳ᩶۠;

    .line 707
    sget-object v0, Ll/۠ۘ֨;->֫:[I

    invoke-interface {p3}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 714
    :cond_1
    iget-object v0, p0, Ll/᩶ۘ֨;->ܳ:Ll/֫᩶۠;

    iget-object v1, p0, Ll/᩶ۘ֨;->ۢ:Ll/ۧ᩶۠;

    invoke-interface {v1, v0, p3}, Ll/ۧ᩶۠;->֫(Ll/֫᩶۠;Ll/ᩳ᩶۠;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "."

    .line 715
    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 716
    invoke-static {v0}, Ll/ۗ᩸۠;->֫(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "package-info"

    .line 717
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 451
    :cond_2
    iget-wide v5, p1, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v7, 0x800000

    and-long/2addr v5, v7

    const-wide/16 v9, 0x0

    cmp-long v0, v5, v9

    if-nez v0, :cond_3

    move-object v0, p1

    :goto_1
    if-eqz v0, :cond_3

    .line 452
    iget-object v3, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v5, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-ne v3, v5, :cond_3

    .line 453
    iget-wide v5, v0, Ll/ۛ֡֨;->᩶:J

    or-long/2addr v5, v7

    iput-wide v5, v0, Ll/ۛ֡֨;->᩶:J

    .line 452
    iget-object v0, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    goto :goto_1

    .line 454
    :cond_3
    invoke-interface {p3}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object v0

    .line 456
    sget-object v3, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    if-ne v0, v3, :cond_4

    const/high16 v0, 0x2000000

    goto :goto_2

    :cond_4
    const/high16 v0, 0x4000000

    .line 460
    :goto_2
    iget-object v3, p0, Ll/᩶ۘ֨;->ܳ:Ll/֫᩶۠;

    invoke-interface {v1, v3, p3}, Ll/ۧ᩶۠;->֫(Ll/֫᩶۠;Ll/ᩳ᩶۠;)Ljava/lang/String;

    move-result-object v1

    .line 461
    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v2, v4

    .line 462
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 414
    iget-object v2, p0, Ll/᩶ۘ֨;->ܺ:Ll/ۛܶ۠;

    iget-object v3, v2, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {v3, v1}, Ll/۫ܶ۠;->֫(Ljava/lang/String;)Ll/ۤܶ۠;

    move-result-object v1

    .line 463
    iget-object v2, v2, Ll/ۛܶ۠;->ᩳܽ:Ll/ۤܶ۠;

    if-ne v1, v2, :cond_5

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    :goto_3
    if-eqz v4, :cond_6

    .line 465
    iget-object v2, p1, Ll/۠֡֨;->ܰ:Ll/ܳ֡֨;

    goto :goto_4

    .line 466
    :cond_6
    iget-object v2, p1, Ll/۠֡֨;->ۨ:Ll/ܰ᩵֨;

    const/4 v3, 0x0

    .line 120
    check-cast v2, Ll/ۤ᩵֨;

    .line 528
    invoke-virtual {v2, v1, v3}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ܳ᩵֨;

    move-result-object v2

    iget-object v2, v2, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    .line 466
    check-cast v2, Ll/ܳ֡֨;

    :goto_4
    if-nez v2, :cond_9

    .line 468
    iget-object v2, p0, Ll/᩶ۘ֨;->֡:Ll/᩷ۚ֨;

    iget-object v3, p1, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    invoke-virtual {v2, v3, v1, p1}, Ll/᩷ۚ֨;->֫(Ll/֡֡֨;Ll/ۤܶ۠;Ll/᩶֡֨;)Ll/ܳ֡֨;

    move-result-object v2

    .line 469
    iget-object v1, v2, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    if-nez v1, :cond_7

    .line 470
    iput-object p3, v2, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    :cond_7
    if-eqz v4, :cond_8

    .line 472
    iput-object v2, p1, Ll/۠֡֨;->ܰ:Ll/ܳ֡֨;

    goto :goto_5

    .line 474
    :cond_8
    iget-object p3, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    if-ne p3, p1, :cond_a

    .line 475
    iget-object p3, p1, Ll/۠֡֨;->ۨ:Ll/ܰ᩵֨;

    invoke-virtual {p3, v2}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    goto :goto_5

    .line 477
    :cond_9
    iget-boolean v1, p0, Ll/᩶ۘ֨;->ۖ:Z

    if-nez v1, :cond_a

    iget-object v1, v2, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    if-eqz v1, :cond_a

    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    int-to-long v5, v0

    and-long/2addr v5, v3

    cmp-long v7, v5, v9

    if-nez v7, :cond_a

    const-wide/32 v5, 0x6000000

    and-long/2addr v3, v5

    cmp-long v5, v3, v9

    if-eqz v5, :cond_a

    .line 483
    invoke-virtual {p0, p3, v1}, Ll/᩶ۘ֨;->֫(Ll/ᩳ᩶۠;Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    move-result-object p3

    iput-object p3, v2, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    .line 485
    :cond_a
    :goto_5
    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    int-to-long v0, v0

    or-long/2addr v0, v3

    iput-wide v0, v2, Ll/ۛ֡֨;->᩶:J

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method private ֫(Ll/۠֡֨;Z)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 511
    sget-object v2, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    sget-object v3, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    invoke-static {v2, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v4

    .line 627
    invoke-static {v4}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v5

    .line 628
    invoke-interface {v5, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 629
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    .line 631
    invoke-static {v4}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v6

    .line 632
    invoke-interface {v6, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 633
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 635
    iget-object v9, v0, Ll/᩶ۘ֨;->ۢ:Ll/ۧ᩶۠;

    if-eqz p2, :cond_0

    sget-object v10, Ll/᩷᩶۠;->ܰ:Ll/᩷᩶۠;

    invoke-interface {v9, v10}, Ll/ۧ᩶۠;->֫(Ll/֫᩶۠;)Z

    move-result v10

    if-eqz v10, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    .line 637
    :goto_0
    iget-boolean v11, v0, Ll/᩶ۘ֨;->۠:Z

    if-eqz v11, :cond_7

    iget-boolean v11, v0, Ll/᩶ۘ֨;->ܶ:Z

    if-eqz v11, :cond_7

    .line 638
    iput-boolean v8, v0, Ll/᩶ۘ֨;->ܶ:Z

    .line 639
    instance-of v8, v9, Ll/᩻᩶۠;

    if-eqz v8, :cond_7

    check-cast v9, Ll/᩻᩶۠;

    const-string v8, "sourcepath"

    const-string v11, ","

    .line 640
    iget-object v12, v0, Ll/᩶ۘ֨;->ۡ:Ll/᩹ܶ۠;

    if-eqz v10, :cond_2

    if-nez v2, :cond_2

    .line 641
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v13

    .line 642
    sget-object v14, Ll/᩷᩶۠;->ܰ:Ll/᩷᩶۠;

    invoke-interface {v9, v14}, Ll/᩻᩶۠;->ܿ(Ll/֫᩶۠;)Ljava/lang/Iterable;

    move-result-object v14

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/᩷۠ᩴ;

    .line 643
    invoke-virtual {v13, v15}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v13

    goto :goto_1

    :cond_1
    const/4 v14, 0x0

    .line 645
    invoke-virtual {v13}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v13

    .line 339
    invoke-virtual {v13, v11}, Ll/ۖܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    new-array v15, v7, [Ljava/lang/Object;

    aput-object v13, v15, v14

    .line 645
    invoke-virtual {v12, v8, v15}, Ll/᩹ܶ۠;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    :cond_2
    if-nez v2, :cond_4

    .line 647
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v13

    .line 648
    sget-object v15, Ll/᩷᩶۠;->ۗ:Ll/᩷᩶۠;

    invoke-interface {v9, v15}, Ll/᩻᩶۠;->ܿ(Ll/֫᩶۠;)Ljava/lang/Iterable;

    move-result-object v15

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_3

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v14, v16

    check-cast v14, Ll/᩷۠ᩴ;

    .line 649
    invoke-virtual {v13, v14}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v13

    goto :goto_2

    .line 651
    :cond_3
    invoke-virtual {v13}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v13

    .line 339
    invoke-virtual {v13, v11}, Ll/ۖܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    new-array v14, v7, [Ljava/lang/Object;

    const/4 v15, 0x0

    aput-object v13, v14, v15

    .line 651
    invoke-virtual {v12, v8, v14}, Ll/᩹ܶ۠;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    const/4 v15, 0x0

    :goto_3
    const/4 v14, 0x0

    :goto_4
    if-nez v3, :cond_7

    .line 654
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v8

    .line 655
    sget-object v13, Ll/᩷᩶۠;->ۨ:Ll/᩷᩶۠;

    invoke-interface {v9, v13}, Ll/᩻᩶۠;->ܿ(Ll/֫᩶۠;)Ljava/lang/Iterable;

    move-result-object v13

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_5

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/᩷۠ᩴ;

    .line 656
    invoke-virtual {v8, v15}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v8

    goto :goto_5

    .line 658
    :cond_5
    sget-object v13, Ll/᩷᩶۠;->ۗ:Ll/᩷᩶۠;

    invoke-interface {v9, v13}, Ll/᩻᩶۠;->ܿ(Ll/֫᩶۠;)Ljava/lang/Iterable;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩷۠ᩴ;

    .line 659
    invoke-virtual {v8, v13}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v8

    goto :goto_6

    .line 661
    :cond_6
    invoke-virtual {v8}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v8

    .line 339
    invoke-virtual {v8, v11}, Ll/ۖܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-array v7, v7, [Ljava/lang/Object;

    .line 661
    aput-object v8, v7, v14

    const-string v8, "classpath"

    invoke-virtual {v12, v8, v7}, Ll/᩹ܶ۠;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    :cond_7
    iget-object v7, v1, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    invoke-virtual {v7}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v7

    if-nez v2, :cond_8

    if-nez v10, :cond_8

    .line 668
    sget-object v2, Ll/᩷᩶۠;->ۗ:Ll/᩷᩶۠;

    .line 669
    invoke-virtual {v0, v2, v1, v7, v4}, Ll/᩶ۘ֨;->֫(Ll/֫᩶۠;Ll/۠֡֨;Ljava/lang/String;Ljava/util/EnumSet;)Ll/ۚۘ֨;

    move-result-object v3

    .line 668
    invoke-direct {v0, v1, v2, v3}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Ll/֫᩶۠;Ll/ۚۘ֨;)V

    return-void

    :cond_8
    if-nez v3, :cond_9

    .line 675
    sget-object v3, Ll/᩷᩶۠;->ۗ:Ll/᩷᩶۠;

    .line 676
    invoke-virtual {v0, v3, v1, v7, v5}, Ll/᩶ۘ֨;->֫(Ll/֫᩶۠;Ll/۠֡֨;Ljava/lang/String;Ljava/util/EnumSet;)Ll/ۚۘ֨;

    move-result-object v4

    .line 675
    invoke-direct {v0, v1, v3, v4}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Ll/֫᩶۠;Ll/ۚۘ֨;)V

    :cond_9
    if-nez v2, :cond_a

    .line 681
    sget-object v2, Ll/᩷᩶۠;->ܰ:Ll/᩷᩶۠;

    .line 682
    invoke-virtual {v0, v2, v1, v7, v6}, Ll/᩶ۘ֨;->֫(Ll/֫᩶۠;Ll/۠֡֨;Ljava/lang/String;Ljava/util/EnumSet;)Ll/ۚۘ֨;

    move-result-object v3

    .line 681
    invoke-direct {v0, v1, v2, v3}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;Ll/֫᩶۠;Ll/ۚۘ֨;)V

    :cond_a
    return-void
.end method

.method public static ֫(Ll/᩶ۘ֨;Ll/ۛ֡֨;)V
    .locals 4

    .line 278
    iget-object v0, p0, Ll/᩶ۘ֨;->ۜ:Ll/ᩳ۠۠;

    iget-object v1, p0, Ll/᩶ۘ֨;->֫:Ll/۬᩹֨;

    iget-object v2, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v2, v3, :cond_0

    .line 280
    :try_start_0
    check-cast p1, Ll/ܳ֡֨;

    .line 281
    sget-object v2, Ll/۫֨۠;->᩹:Ll/۫֨۠;

    invoke-virtual {v0, p1, v2}, Ll/ᩳ۠۠;->֫(Ll/ܳ֡֨;Ll/۫֨۠;)V

    .line 282
    invoke-virtual {v1}, Ll/۬᩹֨;->ۧ()V

    .line 283
    new-instance v2, Ll/᩻᩵֨;

    .line 1127
    invoke-direct {v2, p1}, Ll/ۤ᩵֨;-><init>(Ll/ۛ֡֨;)V

    .line 283
    iput-object v2, p1, Ll/ܳ֡֨;->֫֫:Ll/ܰ᩵֨;

    .line 284
    iget-object v2, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-static {v2}, Ll/᩶ۘ֨;->֫(Ll/ۛ֡֨;)V

    .line 285
    invoke-direct {p0, p1}, Ll/᩶ۘ֨;->ۧ(Ll/ܳ֡֨;)V

    .line 286
    invoke-virtual {p0, p1}, Ll/᩶ۘ֨;->֫(Ll/ܳ֡֨;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    invoke-virtual {v1}, Ll/۬᩹֨;->ܳ()V

    .line 289
    invoke-virtual {v0}, Ll/ᩳ۠۠;->֫()V

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 288
    invoke-virtual {v1}, Ll/۬᩹֨;->ܳ()V

    .line 289
    invoke-virtual {v0}, Ll/ᩳ۠۠;->֫()V

    .line 290
    throw p0

    .line 291
    :cond_0
    sget-object v0, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-ne v2, v0, :cond_1

    .line 292
    move-object v0, p1

    check-cast v0, Ll/۠֡֨;

    .line 294
    :try_start_1
    invoke-direct {p0, v0}, Ll/᩶ۘ֨;->֫(Ll/۠֡֨;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 296
    new-instance v1, Ll/᩷֡֨;

    new-instance v2, Ll/֡ۘ֨;

    invoke-direct {v2, p0, v0}, Ll/֡ۘ֨;-><init>(Ll/᩶ۘ֨;Ljava/io/IOException;)V

    iget-object p0, p0, Ll/᩶ۘ֨;->᩻:Ll/֫ᩴ֨;

    invoke-direct {v1, p1, v2, p0}, Ll/᩷֡֨;-><init>(Ll/ۛ֡֨;Ljava/util/function/Supplier;Ll/֫ᩴ֨;)V

    .line 301
    invoke-virtual {v1, v0}, Ll/᩷֡֨;->֫(Ljava/io/IOException;)V

    throw v1

    .line 304
    :cond_1
    :goto_0
    iget-object p0, p0, Ll/᩶ۘ֨;->ᩴ:Ll/᩶ۜ۠;

    iget-boolean p0, p0, Ll/᩶ۜ۠;->ۘ:Z

    if-nez p0, :cond_2

    .line 305
    invoke-virtual {v1}, Ll/۬᩹֨;->ܽ()V

    :cond_2
    return-void
.end method

.method private ۧ(Ll/ܳ֡֨;)V
    .locals 5

    .line 321
    iget-object v0, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_2

    .line 323
    iget-object v1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-static {v1}, Ll/۬֨۠;->ܽ(Ll/ۤܶ۠;)Ll/ۤܶ۠;

    move-result-object v1

    invoke-static {v1}, Ll/۬֨۠;->ۧ(Ll/ۤܶ۠;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܶ۠;

    .line 324
    invoke-virtual {v0}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v3

    const/4 v4, 0x0

    .line 120
    invoke-virtual {v3, v2, v4}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;

    move-result-object v3

    if-nez v3, :cond_1

    .line 326
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v3

    iget-object v3, v3, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    invoke-static {v2, v0}, Ll/᩶֡֨;->֫(Ll/ۤܶ۠;Ll/ۛ֡֨;)Ll/ۤܶ۠;

    move-result-object v2

    iget-object v4, p0, Ll/᩶ۘ֨;->֡:Ll/᩷ۚ֨;

    invoke-virtual {v4, v3, v2}, Ll/᩷ۚ֨;->ܽ(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;

    move-result-object v3

    :cond_1
    if-eqz v3, :cond_0

    .line 328
    invoke-virtual {v3}, Ll/ۛ֡֨;->᩶()V

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫᩶۠;Ll/۠֡֨;Ljava/lang/String;Ljava/util/EnumSet;)Ll/ۚۘ֨;
    .locals 3

    .line 732
    const-class v0, Ll/ܽ᩶۠;

    .line 734
    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    const/4 v1, 0x0

    .line 732
    iget-object v2, p0, Ll/᩶ۘ֨;->ۢ:Ll/ۧ᩶۠;

    invoke-interface {v2, p1, p3, v0, v1}, Ll/ۧ᩶۠;->֫(Ll/֫᩶۠;Ljava/lang/String;Ljava/util/Set;Z)Ljava/lang/Iterable;

    move-result-object p1

    .line 736
    new-instance p3, Ll/ۚۘ֨;

    invoke-direct {p3, p0, p1, p2, p4}, Ll/ۚۘ֨;-><init>(Ll/᩶ۘ֨;Ljava/lang/Iterable;Ll/۠֡֨;Ljava/util/Set;)V

    return-object p3
.end method

.method public final ֫()Ll/ۜ֡֨;
    .locals 1

    .line 165
    iget-object v0, p0, Ll/᩶ۘ֨;->ۚ:Ll/ۘ᩹ܽ;

    return-object v0
.end method

.method public final ֫(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;
    .locals 5

    .line 418
    invoke-static {p1}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    const/16 v0, 0x2e

    .line 332
    invoke-virtual {p2, v0}, Ll/ۤܶ۠;->֫(B)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ll/ۤܶ۠;->֫(II)Ll/ۤܶ۠;

    move-result-object v0

    .line 420
    iget-object v2, p0, Ll/᩶ۘ֨;->֡:Ll/᩷ۚ֨;

    invoke-virtual {v2, p1, v0}, Ll/᩷ۚ֨;->ܿ(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/۠֡֨;

    move-result-object v0

    .line 422
    iget-object v3, v0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    new-instance v4, Ll/ۘۘ֨;

    invoke-direct {v4, p1, p2}, Ll/ۘۘ֨;-><init>(Ll/֡֡֨;Ll/ۤܶ۠;)V

    invoke-static {v3, v4}, Ll/۫ۙ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)V

    .line 424
    iget-object p1, v0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    invoke-virtual {v2, p1, p2}, Ll/᩷ۚ֨;->ܽ(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 v1, 0x1

    .line 425
    :cond_0
    iget-object p1, v0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    invoke-virtual {v2, p1, p2}, Ll/᩷ۚ֨;->֫(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;

    move-result-object p1

    .line 427
    iget-object v3, p1, Ll/ܳ֡֨;->֫֫:Ll/ܰ᩵֨;

    if-nez v3, :cond_2

    .line 429
    :try_start_0
    invoke-virtual {p1}, Ll/ܳ֡֨;->᩶()V
    :try_end_0
    .catch Ll/᩷֡֨; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v3

    if-eqz v1, :cond_1

    .line 432
    iget-object v0, v0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    invoke-virtual {v2, v0, p2}, Ll/᩷ۚ֨;->᩻(Ll/֡֡֨;Ll/ۤܶ۠;)V

    .line 433
    iget-object p2, v3, Ll/᩷֡֨;->᩸:Ll/֫ᩴ֨;

    invoke-virtual {p2, p1}, Ll/֫ᩴ֨;->֫(Ll/ܳ֡֨;)V

    .line 435
    :cond_1
    throw v3

    :cond_2
    return-object p1
.end method

.method public final ֫(Ll/ᩳ᩶۠;Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;
    .locals 5

    .line 495
    iget-boolean v0, p0, Ll/᩶ۘ֨;->ۘ:Z

    if-eqz v0, :cond_1

    .line 496
    invoke-interface {p1}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object v0

    sget-object v1, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    if-ne v0, v1, :cond_0

    return-object p1

    :cond_0
    return-object p2

    .line 498
    :cond_1
    invoke-interface {p1}, Ll/۟᩹۠;->ᩳ()J

    move-result-wide v0

    .line 499
    invoke-interface {p2}, Ll/۟᩹۠;->ᩳ()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    return-object p1

    :cond_2
    return-object p2
.end method

.method public final ֫(Ll/ܳ֡֨;)V
    .locals 11

    .line 337
    iget-object v0, p0, Ll/᩶ۘ֨;->ᩴ:Ll/᩶ۜ۠;

    const-string v1, "Source completer required to read "

    const-string v2, "Filling "

    iget-object v3, p1, Ll/ܳ֡֨;->ܰ:Ll/ۤܶ۠;

    iget-object v4, p0, Ll/᩶ۘ֨;->᩻:Ll/֫ᩴ֨;

    iget-object v5, p0, Ll/᩶ۘ֨;->ᩳ:Ll/ۤܶ۠;

    if-eq v5, v3, :cond_6

    .line 342
    iget-object v5, p1, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    const/4 v6, 0x1

    if-eqz v5, :cond_4

    .line 344
    iget-object v4, p0, Ll/᩶ۘ֨;->ܿ:Ll/ᩳ᩶۠;

    .line 345
    iget-object v7, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    .line 348
    :try_start_0
    iget-boolean v8, v0, Ll/᩶ۜ۠;->ۘ:Z

    if-nez v8, :cond_3

    .line 351
    iput-object v5, p0, Ll/᩶ۘ֨;->ܿ:Ll/ᩳ᩶۠;

    .line 352
    iget-boolean v2, p0, Ll/᩶ۘ֨;->۠:Z

    if-eqz v2, :cond_0

    .line 353
    iget-object v2, p0, Ll/᩶ۘ֨;->ۡ:Ll/᩹ܶ۠;

    const-string v8, "loading"

    invoke-interface {v5}, Ll/۟᩹۠;->getName()Ljava/lang/String;

    move-result-object v9

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v9, v6, v10

    invoke-virtual {v2, v8, v6}, Ll/᩹ܶ۠;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    :cond_0
    invoke-interface {v5}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object v2

    sget-object v6, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    if-ne v2, v6, :cond_1

    .line 356
    invoke-virtual {v0, p1}, Ll/᩶ۜ۠;->֫(Ll/ܳ֡֨;)V

    .line 357
    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    iput-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    goto :goto_0

    .line 359
    :cond_1
    iget-object v0, p0, Ll/᩶ۘ֨;->᩵:Ll/ۜ֡֨;

    invoke-interface {v0}, Ll/ۜ֡֨;->ܽ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 360
    iget-object v0, p0, Ll/᩶ۘ֨;->᩵:Ll/ۜ֡֨;

    invoke-interface {v0, p1}, Ll/ۜ֡֨;->֫(Ll/ۛ֡֨;)V
    :try_end_0
    .catch Ll/᩸ۘ֨; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 382
    :goto_0
    iput-object v4, p0, Ll/᩶ۘ֨;->ܿ:Ll/ᩳ᩶۠;

    return-void

    .line 362
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    invoke-interface {v5}, Ll/۟᩹۠;->toUri()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 349
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v5}, Ll/۟᩹۠;->toUri()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " during "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/۫ۙ;->֫(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
    :try_end_1
    .catch Ll/᩸ۘ֨; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v0

    .line 368
    :try_start_2
    iput-object v7, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    .line 369
    iget-object v1, p1, Ll/ܳ֡֨;->֫֫:Ll/ܰ᩵֨;

    new-instance v2, Ll/᩺ܿۢ;

    const/4 v5, 0x2

    invoke-direct {v2, v5}, Ll/᩺ܿۢ;-><init>(I)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    sget-object v5, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    invoke-virtual {v1, v2, v5}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v1

    .line 369
    new-instance v2, Ll/᩵ۘ֨;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v2}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 377
    iput-object v3, p1, Ll/ܳ֡֨;->ܰ:Ll/ۤܶ۠;

    .line 378
    invoke-static {v3}, Ll/۬֨۠;->ܽ(Ll/ۤܶ۠;)Ll/ۤܶ۠;

    move-result-object v1

    iput-object v1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 379
    invoke-virtual {p1}, Ll/ܳ֡֨;->᩺֫()V

    .line 380
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 382
    :goto_1
    iput-object v4, p0, Ll/᩶ۘ֨;->ܿ:Ll/ᩳ᩶۠;

    .line 383
    throw p1

    .line 390
    :cond_4
    new-instance v0, Ll/ۘ۠֨;

    invoke-direct {v0, v6, p0, p1}, Ll/ۘ۠֨;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 399
    iget-boolean v1, p0, Ll/᩶ۘ֨;->ۧ:Z

    if-nez v1, :cond_5

    .line 403
    new-instance v1, Ll/᩷֡֨;

    invoke-direct {v1, p1, v0, v4}, Ll/᩷֡֨;-><init>(Ll/ۛ֡֨;Ljava/util/function/Supplier;Ll/֫ᩴ֨;)V

    goto :goto_2

    .line 406
    :cond_5
    iget-object v1, p0, Ll/᩶ۘ֨;->ܽ:Ll/᩷֡֨;

    iput-object p1, v1, Ll/᩷֡֨;->ۙ:Ll/ۛ֡֨;

    .line 407
    invoke-virtual {v1, v0}, Ll/᩷֡֨;->֫(Ll/ۘ۠֨;)V

    .line 385
    :goto_2
    throw v1

    .line 338
    :cond_6
    new-instance v0, Ll/᩷֡֨;

    new-instance v1, Ll/ᩴۘ֨;

    invoke-direct {v1, p0}, Ll/ᩴۘ֨;-><init>(Ll/᩶ۘ֨;)V

    invoke-direct {v0, p1, v1, v4}, Ll/᩷֡֨;-><init>(Ll/ۛ֡֨;Ljava/util/function/Supplier;Ll/֫ᩴ֨;)V

    throw v0
.end method
