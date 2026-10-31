.class public final Ll/۟ۙܿ;
.super Ljava/lang/Object;
.source "H14L"


# static fields
.field public static final ᩸:Ll/ۨۘᩳ;


# instance fields
.field public ֡:Landroid/graphics/RectF;

.field public ֨:F

.field public ֫:Z

.field public ۖ:F

.field public ۘ:Z

.field public final ۚ:Ll/ܽۗܿ;

.field public ۜ:Z

.field public ۠:F

.field public ۡ:I

.field public final ۢ:Landroid/graphics/Matrix;

.field public ۧ:I

.field public ܳ:I

.field public ܶ:F

.field public ܺ:F

.field public ܽ:I

.field public ܿ:F

.field public final ᩳ:Ljava/util/List;

.field public ᩴ:F

.field public ᩵:F

.field public final ᩷:Ljava/util/ArrayList;

.field public final ᩻:Ljava/util/HashSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 28
    new-instance v0, Ll/ۨۘᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۟ۙܿ;->᩸:Ll/ۨۘᩳ;

    return-void
.end method

.method public constructor <init>(Ll/ܽۗܿ;ILjava/util/ArrayList;)V
    .locals 7

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 48
    iput v0, p0, Ll/۟ۙܿ;->ܽ:I

    .line 237
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Ll/۟ۙܿ;->֡:Landroid/graphics/RectF;

    .line 416
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v1

    iput-boolean v1, p0, Ll/۟ۙܿ;->֫:Z

    const/4 v1, 0x0

    .line 417
    iput v1, p0, Ll/۟ۙܿ;->ۧ:I

    .line 419
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Ll/۟ۙܿ;->ۢ:Landroid/graphics/Matrix;

    .line 51
    iput-object p1, p0, Ll/۟ۙܿ;->ۚ:Ll/ܽۗܿ;

    .line 52
    iput p2, p0, Ll/۟ۙܿ;->ܳ:I

    .line 53
    iput-object p3, p0, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    .line 54
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/۟ۙܿ;->᩻:Ljava/util/HashSet;

    .line 55
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/16 p2, 0xd2

    if-le p1, p2, :cond_0

    .line 56
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    add-int/lit8 p2, p1, -0x64

    add-int/lit8 v2, p1, 0x64

    .line 60
    new-instance v3, Ll/ۨۙܿ;

    const-string v4, "......"

    invoke-direct {v3, v0, v4}, Ll/ۨۙܿ;-><init>(ILjava/lang/String;)V

    invoke-virtual {p3, p2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p1, p1, -0x63

    .line 61
    invoke-virtual {p3, p1, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 64
    :cond_0
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p2, 0x1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, p1, :cond_7

    .line 65
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۨۙܿ;

    .line 17
    iget-object v5, v4, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_6

    .line 67
    iget-object v5, v4, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    const-string v6, ".sparse-switch"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_5

    iget-object v5, v4, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    const-string v6, ".packed-switch"

    .line 68
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_2

    :cond_1
    if-eqz p2, :cond_6

    .line 22
    iget-object v5, v4, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v6, 0x64

    if-le v5, v6, :cond_2

    .line 23
    iget-object v5, v4, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-static {v6, v5}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    .line 35
    :cond_2
    iget-object v5, v4, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    const-string v6, ":"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 36
    iget-object v3, v4, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    const/16 v5, 0x20

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-ne v3, v0, :cond_3

    .line 37
    iget-object v3, v4, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    goto :goto_1

    :cond_3
    iget-object v4, v4, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {v4, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    :cond_4
    :goto_1
    if-eqz v3, :cond_6

    .line 74
    iget-object v4, p0, Ll/۟ۙܿ;->᩻:Ljava/util/HashSet;

    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    :goto_2
    const/4 p2, 0x0

    :cond_6
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 79
    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/۟ۙܿ;->᩷:Ljava/util/ArrayList;

    .line 80
    new-instance p1, Ll/ᩳۖܿ;

    invoke-direct {p1}, Ll/ᩳۖܿ;-><init>()V

    .line 81
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۨۙܿ;

    .line 17
    iget-object v0, p3, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 83
    iget-object p3, p0, Ll/۟ۙܿ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 86
    :cond_8
    new-instance v0, Ll/᩺ۙܿ;

    invoke-direct {v0}, Ll/᩺ۙܿ;-><init>()V

    .line 87
    iget-object v1, p0, Ll/۟ۙܿ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    :try_start_0
    sget-object v1, Ll/ۤۙܿ;->ܿ:Ll/᩺ܺܿ;

    iget-object v2, p3, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    sget-object v4, Ll/۟ۙܿ;->᩸:Ll/ۨۘᩳ;

    .line 90
    invoke-virtual {v1, v2, v4}, Ll/᩺ܺܿ;->֫(Ljava/lang/CharSequence;Ll/ܿۖ᩷;)Ll/ۗۢܿ;

    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ll/ۗۢܿ;->ۖ()Ll/ۢۖܿ;

    move-result-object v1

    .line 92
    invoke-virtual {p1, v1}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 93
    :cond_9
    :goto_5
    invoke-virtual {p1}, Ll/ᩳۖܿ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 94
    invoke-virtual {p1}, Ll/ᩳۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ᩳۖܿ;->ۧ()I

    move-result v2

    invoke-virtual {p1}, Ll/ᩳۖܿ;->֫()I

    move-result v4

    if-eq v2, v4, :cond_9

    .line 522
    iget-object v2, v0, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    new-instance v5, Ll/ܰۙܿ;

    invoke-direct {v5, v4, v1}, Ll/ܰۙܿ;-><init>(ILl/᩸᩷ܿ;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ll/۠ۢܿ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    nop

    .line 98
    sget-object v1, Ll/ۤۙܿ;->ܽ:Ll/ܶۜܿ;

    invoke-virtual {v1}, Ll/ܶۜܿ;->ܳ()Ll/᩸᩷ܿ;

    move-result-object v1

    iget-object p3, p3, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    if-eqz p3, :cond_a

    .line 522
    iget-object v2, v0, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    new-instance v4, Ll/ܰۙܿ;

    invoke-direct {v4, p3, v1}, Ll/ܰۙܿ;-><init>(ILl/᩸᩷ܿ;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    :cond_a
    iget-object p3, v0, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->trimToSize()V

    goto :goto_4

    :cond_b
    return-void
.end method

.method public constructor <init>(Ll/ܽۗܿ;Ll/۬ۜܽ;)V
    .locals 10

    .line 590
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 48
    iput v0, p0, Ll/۟ۙܿ;->ܽ:I

    .line 237
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Ll/۟ۙܿ;->֡:Landroid/graphics/RectF;

    .line 416
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v1

    iput-boolean v1, p0, Ll/۟ۙܿ;->֫:Z

    const/4 v1, 0x0

    .line 417
    iput v1, p0, Ll/۟ۙܿ;->ۧ:I

    .line 419
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Ll/۟ۙܿ;->ۢ:Landroid/graphics/Matrix;

    .line 591
    iput-object p1, p0, Ll/۟ۙܿ;->ۚ:Ll/ܽۗܿ;

    .line 592
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->ܳ:I

    .line 594
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    .line 595
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 597
    iget-object v3, p0, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    new-instance v4, Ll/ۨۙܿ;

    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    invoke-virtual {p2}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Ll/ۨۙܿ;-><init>(ILjava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 600
    :cond_0
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    .line 601
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, p1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v2, p0, Ll/۟ۙܿ;->᩻:Ljava/util/HashSet;

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_1

    .line 603
    iget-object v3, p0, Ll/۟ۙܿ;->᩻:Ljava/util/HashSet;

    invoke-virtual {p2}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 606
    :cond_1
    new-instance p1, Ll/᩶᩷ܿ;

    invoke-direct {p1}, Ll/᩶᩷ܿ;-><init>()V

    .line 607
    invoke-virtual {p1, p2}, Ll/᩶᩷ܿ;->֫(Ll/۬ۜܽ;)V

    .line 609
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    .line 610
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, p0, Ll/۟ۙܿ;->᩷:Ljava/util/ArrayList;

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_4

    .line 612
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    if-ne v4, v0, :cond_2

    .line 614
    iget-object v4, p0, Ll/۟ۙܿ;->᩷:Ljava/util/ArrayList;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 616
    :cond_2
    new-instance v5, Ll/᩺ۙܿ;

    invoke-direct {v5}, Ll/᩺ۙܿ;-><init>()V

    .line 617
    iget-object v6, v5, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->ensureCapacity(I)V

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v4, :cond_3

    .line 619
    new-instance v7, Ll/ܰۙܿ;

    invoke-virtual {p2}, Ll/۬ۜܽ;->readByte()B

    move-result v8

    and-int/lit16 v8, v8, 0xff

    invoke-virtual {p1, v8}, Ll/᩶᩷ܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v8

    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    invoke-direct {v7, v9, v8}, Ll/ܰۙܿ;-><init>(ILl/᩸᩷ܿ;)V

    .line 620
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۜ()F

    move-result v8

    iput v8, v7, Ll/ܰۙܿ;->ܽ:F

    .line 621
    iget-object v8, v5, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 623
    :cond_3
    iget-object v4, p0, Ll/۟ۙܿ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 627
    :cond_4
    invoke-virtual {p2}, Ll/۬ۜܽ;->readByte()B

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    goto :goto_5

    :cond_5
    const/4 p1, 0x0

    :goto_5
    iput-boolean p1, p0, Ll/۟ۙܿ;->ۘ:Z

    .line 628
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->ۡ:I

    .line 629
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۜ()F

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->ᩴ:F

    .line 630
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۜ()F

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->᩵:F

    .line 631
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۜ()F

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->ۖ:F

    .line 632
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۜ()F

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->ܺ:F

    .line 633
    invoke-virtual {p2}, Ll/۬ۜܽ;->readByte()B

    move-result p1

    if-eqz p1, :cond_6

    const/4 v1, 0x1

    :cond_6
    iput-boolean v1, p0, Ll/۟ۙܿ;->ۜ:Z

    .line 634
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۜ()F

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->۠:F

    .line 635
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۜ()F

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->ܶ:F

    .line 636
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۜ()F

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->֨:F

    .line 637
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۜ()F

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->ܿ:F

    .line 638
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->ܽ:I

    return-void
.end method

.method private ֫(ILandroid/graphics/Paint;)F
    .locals 6

    .line 171
    iget-object v0, p0, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۙܿ;

    .line 172
    iget-object v1, p0, Ll/۟ۙܿ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ۙܿ;

    .line 17
    iget-object v1, v0, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    if-nez p1, :cond_0

    goto :goto_1

    .line 178
    :cond_0
    iget-object p1, p1, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۙܿ;

    .line 179
    iget-object v4, v0, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    iget v5, v3, Ll/ܰۙܿ;->ۧ:I

    invoke-virtual {p2, v4, v1, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v1

    .line 180
    iput v1, v3, Ll/ܰۙܿ;->ܽ:F

    add-float/2addr v2, v1

    .line 182
    iget v1, v3, Ll/ܰۙܿ;->ۧ:I

    goto :goto_0

    :cond_1
    :goto_1
    return v2
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 505
    const-class v2, Ll/۟ۙܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 507
    :cond_1
    check-cast p1, Ll/۟ۙܿ;

    .line 509
    iget v2, p0, Ll/۟ۙܿ;->ܳ:I

    iget p1, p1, Ll/۟ۙܿ;->ܳ:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 514
    iget v0, p0, Ll/۟ۙܿ;->ܳ:I

    return v0
.end method

.method public final ֫()F
    .locals 2

    .line 231
    iget-boolean v0, p0, Ll/۟ۙܿ;->ۜ:Z

    if-eqz v0, :cond_0

    .line 234
    iget v0, p0, Ll/۟ۙܿ;->ܿ:F

    return v0

    .line 232
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Need layout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(FFFF)V
    .locals 0

    .line 202
    iput p1, p0, Ll/۟ۙܿ;->۠:F

    .line 203
    iput p2, p0, Ll/۟ۙܿ;->ܶ:F

    .line 204
    iput p3, p0, Ll/۟ۙܿ;->֨:F

    .line 205
    iput p4, p0, Ll/۟ۙܿ;->ܿ:F

    const/4 p1, 0x1

    .line 206
    iput-boolean p1, p0, Ll/۟ۙܿ;->ۜ:Z

    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;Ll/֫ۖܽ;Ll/֫ۖܽ;Landroid/graphics/RectF;F)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p4

    move/from16 v11, p5

    .line 240
    iget v1, v0, Ll/۟ۙܿ;->۠:F

    iget v2, v0, Ll/۟ۙܿ;->ܶ:F

    iget v3, v0, Ll/۟ۙܿ;->֨:F

    add-float/2addr v3, v1

    iget v4, v0, Ll/۟ۙܿ;->ܿ:F

    add-float/2addr v4, v2

    invoke-virtual {v10, v1, v2, v3, v4}, Landroid/graphics/RectF;->intersects(FFFF)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_16

    .line 130
    :cond_0
    iget-object v12, v0, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v7

    .line 246
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Paint;->getFontSpacing()F

    move-result v1

    .line 247
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    neg-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v4, 0x40800000    # 4.0f

    if-eqz v7, :cond_1

    .line 252
    invoke-virtual/range {p0 .. p0}, Ll/۟ۙܿ;->֫()F

    move-result v3

    div-float/2addr v3, v4

    goto :goto_0

    .line 254
    :cond_1
    invoke-virtual/range {p0 .. p0}, Ll/۟ۙܿ;->֫()F

    move-result v4

    iget v5, v0, Ll/۟ۙܿ;->᩵:F

    mul-float v5, v5, v3

    sub-float/2addr v4, v5

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v3

    int-to-float v3, v3

    div-float v3, v4, v3

    :goto_0
    move v13, v3

    div-float/2addr v2, v1

    mul-float v14, v2, v13

    .line 258
    invoke-virtual/range {p0 .. p0}, Ll/۟ۙܿ;->ܳ()F

    move-result v15

    .line 259
    invoke-virtual/range {p0 .. p0}, Ll/۟ۙܿ;->᩻()F

    move-result v16

    mul-float v6, v15, v11

    mul-float v1, v16, v11

    .line 263
    iget v2, v0, Ll/۟ۙܿ;->֨:F

    mul-float v2, v2, v11

    .line 264
    iget v3, v0, Ll/۟ۙܿ;->ܿ:F

    mul-float v3, v3, v11

    const/high16 v4, 0x40800000    # 4.0f

    .line 265
    iget v5, v0, Ll/۟ۙܿ;->ᩴ:F

    const/high16 v17, 0x40000000    # 2.0f

    iget v10, v0, Ll/۟ۙܿ;->᩵:F

    add-float/2addr v5, v10

    div-float/2addr v5, v4

    mul-float v10, v5, v11

    const-string v4, "0"

    .line 267
    invoke-virtual {v9, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v18

    const/4 v4, 0x1

    if-eqz v7, :cond_2

    const/4 v4, 0x0

    const/16 v19, 0x0

    goto :goto_1

    .line 0
    :cond_2
    invoke-static {v4, v12}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    .line 268
    check-cast v4, Ll/ۨۙܿ;

    iget v4, v4, Ll/ۨۙܿ;->ۧ:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    int-to-float v4, v4

    mul-float v4, v4, v18

    move/from16 v19, v4

    :goto_1
    mul-float v4, v19, v11

    add-float v5, v2, v6

    add-float/2addr v3, v1

    .line 271
    iget-object v2, v0, Ll/۟ۙܿ;->֡:Landroid/graphics/RectF;

    invoke-virtual {v2, v6, v1, v5, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 274
    iget-object v3, v0, Ll/۟ۙܿ;->ۚ:Ll/ܽۗܿ;

    iget v1, v3, Ll/ܽۗܿ;->ܳ:I

    move-object/from16 v20, v12

    .line 275
    sget-object v12, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v12}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v21, v3

    .line 276
    iget v3, v0, Ll/۟ۙܿ;->ܳ:I

    move/from16 v22, v5

    const/4 v5, -0x1

    if-ne v1, v3, :cond_3

    .line 277
    sget v1, Ll/ۤۙܿ;->֫:F

    const v1, -0xccccd3

    const/16 v3, -0x51d

    .line 42
    invoke-static {v1, v3}, Ll/᩹֡᩷;->֫(II)I

    move-result v1

    .line 277
    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_3

    :cond_3
    const v1, -0xd4d4d5

    .line 279
    sget v3, Ll/ۤۙܿ;->֫:F

    if-eqz v7, :cond_4

    const v3, -0x50506

    .line 86
    invoke-static {v1, v3}, Ll/᩹֡᩷;->֫(II)I

    move-result v1

    goto :goto_2

    .line 38
    :cond_4
    invoke-static {v1, v5}, Ll/᩹֡᩷;->֫(II)I

    move-result v1

    .line 279
    :goto_2
    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 281
    :goto_3
    invoke-virtual {v8, v2, v10, v10, v9}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    if-nez v7, :cond_5

    .line 285
    iget v1, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v10

    add-float/2addr v1, v10

    iput v1, v2, Landroid/graphics/RectF;->right:F

    const v1, -0xc9c7c6

    const v3, -0xf0f10

    .line 78
    invoke-static {v1, v3}, Ll/᩹֡᩷;->֫(II)I

    move-result v1

    .line 286
    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 287
    invoke-virtual {v8, v2, v10, v10, v9}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 288
    iget v1, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, v10

    iput v1, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v4, v6

    .line 289
    iput v4, v2, Landroid/graphics/RectF;->right:F

    .line 290
    invoke-virtual {v8, v2, v9}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 293
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const v1, -0xaaaaab

    const v3, -0x2f2f30

    .line 82
    invoke-static {v1, v3}, Ll/᩹֡᩷;->֫(II)I

    move-result v1

    .line 294
    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float v1, v1, v11

    .line 295
    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 296
    iget v4, v2, Landroid/graphics/RectF;->right:F

    iget v3, v2, Landroid/graphics/RectF;->top:F

    iget v5, v2, Landroid/graphics/RectF;->bottom:F

    move-object/from16 v1, p1

    move/from16 v23, v15

    move-object v15, v2

    move v2, v4

    move-object/from16 v24, v21

    move/from16 v0, v22

    move-object/from16 v21, v12

    move v12, v6

    move-object/from16 v6, p2

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_4

    :cond_5
    move/from16 v23, v15

    move-object/from16 v24, v21

    move/from16 v0, v22

    move-object v15, v2

    move-object/from16 v21, v12

    move v12, v6

    .line 300
    :goto_4
    iput v12, v15, Landroid/graphics/RectF;->left:F

    .line 301
    iput v0, v15, Landroid/graphics/RectF;->right:F

    .line 302
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const v0, -0xafafb0

    const v1, -0x3f3f40

    .line 34
    invoke-static {v0, v1}, Ll/᩹֡᩷;->֫(II)I

    move-result v0

    .line 303
    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 304
    sget v0, Ll/ۤۙܿ;->֫:F

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float v0, v0, v1

    mul-float v0, v0, v11

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 305
    invoke-virtual {v8, v15, v10, v10, v9}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    if-eqz v7, :cond_6

    mul-float v13, v13, v1

    add-float v13, v13, v16

    add-float v6, v13, v14

    .line 311
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    move-object/from16 v0, v21

    .line 312
    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const v0, -0x777778

    const/high16 v1, -0x1000000

    .line 90
    invoke-static {v0, v1}, Ll/᩹֡᩷;->֫(II)I

    move-result v0

    .line 313
    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 361
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 362
    invoke-virtual {v8, v11, v11}, Landroid/graphics/Canvas;->scale(FF)V

    move-object/from16 v10, p0

    .line 315
    iget v1, v10, Ll/۟ۙܿ;->֨:F

    div-float v1, v1, v17

    add-float v5, v1, v23

    const-string v2, "EXIT"

    const/4 v3, 0x0

    const/4 v4, 0x4

    move-object/from16 v1, p1

    move-object/from16 v7, p2

    .line 375
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    .line 369
    invoke-virtual {v8, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 317
    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    const/4 v1, 0x0

    goto/16 :goto_15

    :cond_6
    move-object/from16 v10, p0

    move-object/from16 v0, v21

    .line 319
    iget v1, v10, Ll/۟ۙܿ;->᩵:F

    add-float v2, v16, v1

    add-float/2addr v1, v14

    add-float v1, v1, v16

    .line 321
    iget v3, v10, Ll/۟ۙܿ;->ᩴ:F

    add-float v15, v23, v3

    add-float v15, v15, v19

    add-float v3, v23, v19

    sub-float v12, v3, v18

    const v3, 0x3e19999a    # 0.15f

    cmpg-float v3, v11, v3

    if-gtz v3, :cond_7

    const/4 v3, 0x1

    const/16 v16, 0x1

    goto :goto_5

    :cond_7
    const/4 v3, 0x0

    const/16 v16, 0x0

    .line 325
    :goto_5
    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 326
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v4, v2

    move-object v6, v8

    const/4 v7, 0x0

    move v2, v1

    const/4 v1, 0x0

    :goto_6
    if-ge v7, v0, :cond_1f

    if-lez v7, :cond_8

    add-float/2addr v2, v13

    add-float/2addr v4, v13

    :cond_8
    move/from16 v17, v2

    move v5, v4

    move-object/from16 v4, p4

    .line 331
    iget v2, v4, Landroid/graphics/RectF;->left:F

    move/from16 v19, v0

    iget v0, v4, Landroid/graphics/RectF;->right:F

    move/from16 v21, v3

    add-float v3, v5, v13

    invoke-virtual {v4, v2, v5, v0, v3}, Landroid/graphics/RectF;->intersects(FFFF)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 333
    iget v0, v4, Landroid/graphics/RectF;->left:F

    cmpg-float v0, v12, v0

    if-ltz v0, :cond_b

    iget v0, v4, Landroid/graphics/RectF;->right:F

    cmpl-float v0, v23, v0

    if-gtz v0, :cond_b

    move-object/from16 v0, v20

    .line 385
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨۙܿ;

    .line 386
    iget v2, v2, Ll/ۨۙܿ;->ۧ:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_9

    goto :goto_9

    .line 389
    :cond_9
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_a

    .line 361
    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 362
    invoke-virtual {v6, v11, v11}, Landroid/graphics/Canvas;->scale(FF)V

    const/4 v1, 0x1

    goto :goto_7

    :cond_a
    move/from16 v3, v21

    .line 391
    :goto_7
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v20

    add-int/lit8 v20, v20, -0x1

    move/from16 v21, v12

    :goto_8
    if-ltz v20, :cond_c

    add-int/lit8 v28, v20, 0x1

    move-object/from16 v25, v6

    move-object/from16 v26, v2

    move/from16 v27, v20

    move/from16 v29, v21

    move/from16 v30, v17

    move-object/from16 v31, p3

    .line 375
    invoke-virtual/range {v25 .. v31}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    sub-float v21, v21, v18

    add-int/lit8 v20, v20, -0x1

    goto :goto_8

    :cond_b
    move-object/from16 v0, v20

    :goto_9
    move/from16 v3, v21

    .line 336
    :cond_c
    iget-object v2, v10, Ll/۟ۙܿ;->᩷:Ljava/util/ArrayList;

    if-eqz v16, :cond_18

    .line 422
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    move/from16 v22, v5

    move-object/from16 v5, v20

    check-cast v5, Ll/ۨۙܿ;

    .line 423
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ۙܿ;

    move/from16 v20, v3

    .line 17
    iget-object v3, v5, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_17

    if-nez v2, :cond_d

    goto/16 :goto_f

    .line 427
    :cond_d
    iget-boolean v3, v10, Ll/۟ۙܿ;->֫:Z

    move/from16 v25, v7

    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v7

    if-eq v3, v7, :cond_e

    .line 428
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v3

    iput-boolean v3, v10, Ll/۟ۙܿ;->֫:Z

    move-object/from16 v7, v24

    .line 429
    iget-wide v8, v7, Ll/ܽۗܿ;->֫:J

    iget v3, v10, Ll/۟ۙܿ;->ۧ:I

    move-object/from16 v24, v0

    move/from16 v21, v1

    int-to-long v0, v3

    sub-long/2addr v8, v0

    iput-wide v8, v7, Ll/ܽۗܿ;->֫:J

    .line 430
    invoke-virtual/range {p0 .. p0}, Ll/۟ۙܿ;->᩷()V

    goto :goto_a

    :cond_e
    move/from16 v21, v1

    move-object/from16 v7, v24

    move-object/from16 v24, v0

    :goto_a
    sub-float v0, v17, v14

    .line 435
    iget-object v1, v2, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v1, 0x0

    move-object/from16 v1, p2

    move/from16 v30, v15

    move/from16 v9, v20

    const/16 v28, 0x0

    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۙܿ;

    .line 436
    iget v3, v2, Ll/ܰۙܿ;->ܽ:F

    move-object/from16 v33, v8

    iget-object v8, v2, Ll/ܰۙܿ;->ᩳ:Ll/᩸᩷ܿ;

    move/from16 v34, v12

    iget v12, v2, Ll/ܰۙܿ;->ۧ:I

    add-float v20, v30, v3

    move/from16 v35, v15

    .line 437
    iget v15, v4, Landroid/graphics/RectF;->left:F

    cmpg-float v15, v20, v15

    if-ltz v15, :cond_15

    iget v15, v4, Landroid/graphics/RectF;->right:F

    cmpl-float v15, v30, v15

    if-gtz v15, :cond_15

    sub-int v15, v12, v28

    const/16 v4, 0xa

    if-ge v4, v15, :cond_13

    const/16 v4, 0x64

    if-ge v15, v4, :cond_13

    .line 440
    iget-object v4, v2, Ll/ܰۙܿ;->֫:Landroid/graphics/Bitmap;

    if-nez v4, :cond_11

    move v15, v9

    .line 443
    iget-wide v9, v7, Ll/ܽۗܿ;->֫:J

    const-wide/32 v26, 0x500000

    cmp-long v4, v9, v26

    if-ltz v4, :cond_10

    .line 444
    invoke-virtual {v8}, Ll/᩸᩷ܿ;->ۖ()I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    if-nez v21, :cond_f

    .line 361
    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    move-result v9

    .line 362
    invoke-virtual {v6, v11, v11}, Landroid/graphics/Canvas;->scale(FF)V

    const/16 v21, 0x1

    goto :goto_c

    :cond_f
    move v9, v15

    .line 446
    :goto_c
    iget-object v3, v5, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    iget v2, v2, Ll/ܰۙܿ;->ۧ:I

    add-float v31, v0, v14

    move-object/from16 v26, v6

    move-object/from16 v27, v3

    move/from16 v29, v2

    move-object/from16 v32, v1

    .line 375
    invoke-virtual/range {v26 .. v32}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    move-object/from16 v6, p1

    move-object/from16 v10, p4

    move-object v4, v5

    move/from16 v36, v12

    move-object v12, v7

    move-object/from16 v7, p0

    move/from16 v37, v25

    move/from16 v25, v13

    move/from16 v13, v37

    goto/16 :goto_e

    :cond_10
    const v4, 0x3dcccccd    # 0.1f

    mul-float v3, v3, v4

    const/high16 v6, 0x3f000000    # 0.5f

    add-float/2addr v3, v6

    float-to-int v3, v3

    const/4 v9, 0x1

    .line 451
    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    mul-float v10, v13, v4

    add-float/2addr v10, v6

    float-to-int v6, v10

    .line 452
    invoke-static {v9, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    .line 451
    invoke-static {v3, v6, v9}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    iput-object v9, v2, Ll/ܰۙܿ;->֫:Landroid/graphics/Bitmap;

    .line 455
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v9}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 456
    invoke-virtual {v3, v4, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 457
    invoke-virtual {v8}, Ll/᩸᩷ܿ;->ۖ()I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 458
    iget-object v4, v5, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    iget v6, v2, Ll/ܰۙܿ;->ۧ:I

    const/4 v8, 0x0

    move-object v1, v3

    move-object v2, v4

    move/from16 v3, v28

    move-object/from16 v10, p4

    move v4, v6

    move-object v6, v5

    move v5, v8

    move-object v8, v6

    move v6, v14

    move/from16 v36, v12

    move-object v12, v7

    move/from16 v37, v25

    move/from16 v25, v13

    move/from16 v13, v37

    move-object/from16 v7, p2

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    .line 459
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    mul-int v2, v2, v1

    mul-int/lit8 v2, v2, 0x2

    move-object/from16 v7, p0

    .line 460
    iget v1, v7, Ll/۟ۙܿ;->ۧ:I

    add-int/2addr v1, v2

    iput v1, v7, Ll/۟ۙܿ;->ۧ:I

    .line 461
    iget-wide v3, v12, Ll/ܽۗܿ;->֫:J

    int-to-long v1, v2

    add-long/2addr v3, v1

    iput-wide v3, v12, Ll/ܽۗܿ;->֫:J

    move-object/from16 v6, p1

    move-object/from16 v1, p2

    move-object v4, v9

    goto :goto_d

    :cond_11
    move-object v8, v5

    move v15, v9

    move/from16 v36, v12

    move-object v12, v7

    move-object v7, v10

    move-object/from16 v10, p4

    move/from16 v37, v25

    move/from16 v25, v13

    move/from16 v13, v37

    .line 463
    :goto_d
    iget-object v2, v7, Ll/۟ۙܿ;->ۢ:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    const/high16 v3, 0x41200000    # 10.0f

    mul-float v3, v3, v11

    .line 465
    invoke-virtual {v2, v3, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    mul-float v3, v30, v11

    mul-float v5, v0, v11

    .line 466
    invoke-virtual {v2, v3, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    move v3, v15

    if-eqz v21, :cond_12

    .line 369
    invoke-virtual {v6, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    const/16 v21, 0x0

    .line 379
    :cond_12
    invoke-virtual {v6, v4, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    move v9, v3

    move-object v4, v8

    goto :goto_e

    :cond_13
    move-object v4, v5

    move v3, v9

    move/from16 v36, v12

    move-object v12, v7

    move-object v7, v10

    move-object/from16 v10, p4

    move/from16 v37, v25

    move/from16 v25, v13

    move/from16 v13, v37

    .line 470
    invoke-virtual {v8}, Ll/᩸᩷ܿ;->ۖ()I

    move-result v5

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setColor(I)V

    if-nez v21, :cond_14

    .line 361
    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 362
    invoke-virtual {v6, v11, v11}, Landroid/graphics/Canvas;->scale(FF)V

    const/16 v21, 0x1

    :cond_14
    move v9, v3

    .line 472
    iget-object v3, v4, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    iget v2, v2, Ll/ܰۙܿ;->ۧ:I

    add-float v31, v0, v14

    move-object/from16 v26, v6

    move-object/from16 v27, v3

    move/from16 v29, v2

    move-object/from16 v32, v1

    .line 375
    invoke-virtual/range {v26 .. v32}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    goto :goto_e

    :cond_15
    move v3, v9

    move/from16 v36, v12

    move-object v12, v7

    move-object v7, v10

    move-object v10, v4

    move-object v4, v5

    move/from16 v37, v25

    move/from16 v25, v13

    move/from16 v13, v37

    move v9, v3

    :goto_e
    move-object v5, v4

    move-object v4, v10

    move/from16 v30, v20

    move-object/from16 v8, v33

    move/from16 v15, v35

    move/from16 v28, v36

    move-object v10, v7

    move-object v7, v12

    move/from16 v12, v34

    move/from16 v37, v25

    move/from16 v25, v13

    move/from16 v13, v37

    goto/16 :goto_b

    :cond_16
    move v3, v9

    move/from16 v34, v12

    move/from16 v35, v15

    move-object v12, v7

    move-object v7, v10

    move-object v10, v4

    move/from16 v37, v25

    move/from16 v25, v13

    move/from16 v13, v37

    move/from16 v1, v21

    move-object/from16 v0, v24

    goto/16 :goto_14

    :cond_17
    :goto_f
    move/from16 v21, v1

    move/from16 v34, v12

    move/from16 v25, v13

    move/from16 v35, v15

    move-object/from16 v12, v24

    move-object/from16 v24, v0

    move v13, v7

    move-object v7, v10

    move-object v10, v4

    move-object/from16 v26, v6

    move-object/from16 v0, v24

    goto/16 :goto_13

    :cond_18
    move/from16 v21, v1

    move/from16 v20, v3

    move/from16 v22, v5

    move/from16 v34, v12

    move/from16 v25, v13

    move/from16 v35, v15

    move-object/from16 v12, v24

    move v13, v7

    move-object v7, v10

    move-object v10, v4

    .line 398
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ll/ۨۙܿ;

    .line 399
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۙܿ;

    .line 17
    iget-object v2, v8, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1d

    if-nez v1, :cond_19

    goto/16 :goto_12

    :cond_19
    if-nez v21, :cond_1a

    .line 361
    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 362
    invoke-virtual {v6, v11, v11}, Landroid/graphics/Canvas;->scale(FF)V

    const/4 v3, 0x1

    move/from16 v20, v2

    const/16 v21, 0x1

    .line 405
    :cond_1a
    iget-object v1, v1, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v1, 0x0

    move/from16 v5, v35

    const/4 v3, 0x0

    :goto_10
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Ll/ܰۙܿ;

    .line 406
    iget v1, v15, Ll/ܰۙܿ;->ܽ:F

    add-float v24, v5, v1

    .line 407
    iget v1, v10, Landroid/graphics/RectF;->left:F

    cmpg-float v1, v24, v1

    if-ltz v1, :cond_1b

    iget v1, v10, Landroid/graphics/RectF;->right:F

    cmpl-float v1, v5, v1

    if-gtz v1, :cond_1b

    .line 408
    iget-object v1, v15, Ll/ܰۙܿ;->ᩳ:Ll/᩸᩷ܿ;

    invoke-virtual {v1}, Ll/᩸᩷ܿ;->ۖ()I

    move-result v1

    move-object/from16 v4, p2

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 409
    iget-object v2, v8, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    iget v1, v15, Ll/ܰۙܿ;->ۧ:I

    move/from16 v26, v1

    move-object v1, v6

    move/from16 v4, v26

    move-object/from16 v26, v6

    move/from16 v6, v17

    move-object/from16 v7, p2

    .line 375
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    goto :goto_11

    :cond_1b
    move-object/from16 v26, v6

    .line 411
    :goto_11
    iget v3, v15, Ll/ܰۙܿ;->ۧ:I

    move-object/from16 v7, p0

    move/from16 v5, v24

    move-object/from16 v6, v26

    goto :goto_10

    :cond_1c
    move-object/from16 v26, v6

    move/from16 v3, v20

    move/from16 v1, v21

    goto :goto_14

    :cond_1d
    :goto_12
    move-object/from16 v26, v6

    :goto_13
    move/from16 v3, v20

    move/from16 v1, v21

    move-object/from16 v6, v26

    goto :goto_14

    :cond_1e
    move-object v10, v4

    move/from16 v22, v5

    move-object/from16 v26, v6

    move/from16 v34, v12

    move/from16 v25, v13

    move/from16 v35, v15

    move-object/from16 v0, v20

    move-object/from16 v12, v24

    move v13, v7

    move/from16 v3, v21

    :goto_14
    add-int/lit8 v7, v13, 0x1

    move-object/from16 v10, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v20, v0

    move-object/from16 v24, v12

    move/from16 v2, v17

    move/from16 v0, v19

    move/from16 v4, v22

    move/from16 v13, v25

    move/from16 v12, v34

    move/from16 v15, v35

    goto/16 :goto_6

    :cond_1f
    move/from16 v21, v3

    move-object/from16 v26, v6

    move/from16 v0, v21

    move-object/from16 v8, v26

    :goto_15
    if-eqz v1, :cond_20

    .line 369
    invoke-virtual {v8, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_20
    :goto_16
    return-void
.end method

.method public final ֫(Landroid/graphics/Paint;)V
    .locals 7

    .line 134
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontSpacing()F

    move-result v0

    .line 130
    iget-object v1, p0, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v3, "0"

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float v1, v1, v0

    .line 137
    iput v1, p0, Ll/۟ۙܿ;->ܺ:F

    const-string v1, "EXIT"

    .line 138
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    const/high16 v2, 0x40400000    # 3.0f

    mul-float v0, v0, v2

    add-float/2addr v0, v1

    iput v0, p0, Ll/۟ۙܿ;->ۖ:F

    .line 139
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    const v0, 0x3f19999a    # 0.6f

    mul-float p1, p1, v0

    iput p1, p0, Ll/۟ۙܿ;->᩵:F

    iput p1, p0, Ll/۟ۙܿ;->ᩴ:F

    .line 140
    iput-boolean v4, p0, Ll/۟ۙܿ;->ۘ:Z

    return-void

    .line 142
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, v0

    iput v2, p0, Ll/۟ۙܿ;->ܺ:F

    .line 144
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    .line 0
    invoke-static {v4, v1}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    .line 145
    check-cast v2, Ll/ۨۙܿ;

    iget v2, v2, Ll/ۨۙܿ;->ۧ:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v4

    int-to-float v2, v2

    mul-float v2, v2, v0

    const v3, 0x3f333333    # 0.7f

    mul-float v3, v3, v0

    .line 146
    iput v3, p0, Ll/۟ۙܿ;->ᩴ:F

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v0, v0, v3

    .line 147
    iput v0, p0, Ll/۟ۙܿ;->᩵:F

    .line 149
    iget-boolean v0, p0, Ll/۟ۙܿ;->ۘ:Z

    if-eqz v0, :cond_1

    .line 150
    iget v0, p0, Ll/۟ۙܿ;->ۡ:I

    invoke-direct {p0, v0, p1}, Ll/۟ۙܿ;->֫(ILandroid/graphics/Paint;)F

    move-result p1

    iput p1, p0, Ll/۟ۙܿ;->ۖ:F

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 153
    iput v0, p0, Ll/۟ۙܿ;->ۡ:I

    .line 154
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v0, v1, :cond_3

    .line 155
    invoke-direct {p0, v0, p1}, Ll/۟ۙܿ;->֫(ILandroid/graphics/Paint;)F

    move-result v5

    cmpl-float v6, v5, v3

    if-lez v6, :cond_2

    .line 158
    iput v0, p0, Ll/۟ۙܿ;->ۡ:I

    move v3, v5

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 161
    :cond_3
    iput v3, p0, Ll/۟ۙܿ;->ۖ:F

    .line 162
    iput-boolean v4, p0, Ll/۟ۙܿ;->ۘ:Z

    .line 165
    :goto_1
    iget p1, p0, Ll/۟ۙܿ;->ܺ:F

    iget v0, p0, Ll/۟ۙܿ;->᩵:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v0, v0, v1

    add-float/2addr v0, p1

    iput v0, p0, Ll/۟ۙܿ;->ܺ:F

    .line 166
    iget p1, p0, Ll/۟ۙܿ;->ۖ:F

    iget v0, p0, Ll/۟ۙܿ;->ᩴ:F

    mul-float v0, v0, v1

    add-float/2addr v0, v2

    add-float/2addr v0, p1

    iput v0, p0, Ll/۟ۙܿ;->ۖ:F

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 5

    .line 540
    iget v0, p0, Ll/۟ۙܿ;->ܳ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 541
    iget-object v0, p0, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 542
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۙܿ;

    .line 543
    iget v2, v1, Ll/ۨۙܿ;->ۧ:I

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 544
    iget-object v1, v1, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_0

    .line 546
    :cond_0
    iget-object v0, p0, Ll/۟ۙܿ;->᩻:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 547
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 548
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_1

    .line 551
    :cond_1
    new-instance v0, Ll/᩶᩷ܿ;

    invoke-direct {v0}, Ll/᩶᩷ܿ;-><init>()V

    .line 552
    iget-object v1, p0, Ll/۟ۙܿ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ۙܿ;

    if-eqz v3, :cond_2

    .line 554
    iget-object v3, v3, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۙܿ;

    .line 555
    iget-object v4, v4, Ll/ܰۙܿ;->ᩳ:Ll/᩸᩷ܿ;

    invoke-virtual {v0, v4}, Ll/᩶᩷ܿ;->ۧ(Ll/᩸᩷ܿ;)V

    goto :goto_2

    .line 559
    :cond_3
    invoke-virtual {v0, p1}, Ll/᩶᩷ܿ;->֫(Ll/ۤۜܽ;)V

    .line 561
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 562
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ۙܿ;

    if-nez v2, :cond_5

    const/4 v2, -0x1

    .line 564
    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    goto :goto_3

    .line 566
    :cond_5
    iget-object v2, v2, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    .line 567
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 568
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۙܿ;

    .line 569
    iget-object v4, v3, Ll/ܰۙܿ;->ᩳ:Ll/᩸᩷ܿ;

    invoke-virtual {v0, v4}, Ll/᩶᩷ܿ;->֫(Ll/᩸᩷ܿ;)I

    move-result v4

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeByte(I)V

    .line 570
    iget v4, v3, Ll/ܰۙܿ;->ۧ:I

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 571
    iget v3, v3, Ll/ܰۙܿ;->ܽ:F

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->֫(F)V

    goto :goto_4

    .line 576
    :cond_6
    iget-boolean v0, p0, Ll/۟ۙܿ;->ۘ:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 577
    iget v0, p0, Ll/۟ۙܿ;->ۡ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 578
    iget v0, p0, Ll/۟ۙܿ;->ᩴ:F

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(F)V

    .line 579
    iget v0, p0, Ll/۟ۙܿ;->᩵:F

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(F)V

    .line 580
    iget v0, p0, Ll/۟ۙܿ;->ۖ:F

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(F)V

    .line 581
    iget v0, p0, Ll/۟ۙܿ;->ܺ:F

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(F)V

    .line 582
    iget-boolean v0, p0, Ll/۟ۙܿ;->ۜ:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 583
    iget v0, p0, Ll/۟ۙܿ;->۠:F

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(F)V

    .line 584
    iget v0, p0, Ll/۟ۙܿ;->ܶ:F

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(F)V

    .line 585
    iget v0, p0, Ll/۟ۙܿ;->֨:F

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(F)V

    .line 586
    iget v0, p0, Ll/۟ۙܿ;->ܿ:F

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(F)V

    .line 587
    iget v0, p0, Ll/۟ۙܿ;->ܽ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method public final ֫(Ll/ۨۙܿ;)V
    .locals 5

    .line 17
    iget-object v0, p1, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 108
    invoke-virtual {p0}, Ll/۟ۙܿ;->ᩳ()I

    move-result v0

    .line 109
    invoke-virtual {p0}, Ll/۟ۙܿ;->ۜ()Ll/ۨۙܿ;

    move-result-object v1

    iget v1, v1, Ll/ۨۙܿ;->ۧ:I

    .line 110
    iget v2, p1, Ll/ۨۙܿ;->ۧ:I

    if-gt v0, v2, :cond_0

    if-gt v2, v1, :cond_0

    return-void

    .line 113
    :cond_0
    iget v0, p0, Ll/۟ۙܿ;->ܽ:I

    iget-object v1, p0, Ll/۟ۙܿ;->᩷:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    .line 114
    new-instance v0, Ll/ۨۙܿ;

    const-string v4, ""

    invoke-direct {v0, v3, v4}, Ll/ۨۙܿ;-><init>(ILjava/lang/String;)V

    const/4 v3, 0x0

    invoke-interface {v2, v3, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    const/4 v0, 0x0

    .line 115
    invoke-virtual {v1, v3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 116
    iput v3, p0, Ll/۟ۙܿ;->ܽ:I

    .line 118
    :cond_1
    new-instance v0, Ll/᩺ۙܿ;

    invoke-direct {v0}, Ll/᩺ۙܿ;-><init>()V

    .line 119
    iget v3, p0, Ll/۟ۙܿ;->ܽ:I

    invoke-interface {v2, v3, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 120
    iget v2, p0, Ll/۟ۙܿ;->ܽ:I

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 121
    sget-object v1, Ll/ۤۙܿ;->ܽ:Ll/ܶۜܿ;

    sget v2, Ll/ۙ᩷ܿ;->ۧ:I

    invoke-virtual {v1, v2}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v1

    iget-object p1, p1, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_2

    .line 522
    iget-object v0, v0, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    new-instance v2, Ll/ܰۙܿ;

    invoke-direct {v2, p1, v1}, Ll/ܰۙܿ;-><init>(ILl/᩸᩷ܿ;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    :cond_2
    iget p1, p0, Ll/۟ۙܿ;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۟ۙܿ;->ܽ:I

    return-void

    .line 106
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ۜ()Ll/ۨۙܿ;
    .locals 2

    .line 499
    iget-object v0, p0, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 499
    check-cast v0, Ll/ۨۙܿ;

    return-object v0
.end method

.method public final ۧ()F
    .locals 2

    .line 195
    iget-boolean v0, p0, Ll/۟ۙܿ;->ۘ:Z

    if-eqz v0, :cond_0

    .line 198
    iget v0, p0, Ll/۟ۙܿ;->ܺ:F

    return v0

    .line 196
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Need measure"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܳ()F
    .locals 2

    .line 210
    iget-boolean v0, p0, Ll/۟ۙܿ;->ۜ:Z

    if-eqz v0, :cond_0

    .line 213
    iget v0, p0, Ll/۟ۙܿ;->۠:F

    return v0

    .line 211
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Need layout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()F
    .locals 2

    .line 188
    iget-boolean v0, p0, Ll/۟ۙܿ;->ۘ:Z

    if-eqz v0, :cond_0

    .line 191
    iget v0, p0, Ll/۟ۙܿ;->ۖ:F

    return v0

    .line 189
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Need measure"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܿ()F
    .locals 2

    .line 224
    iget-boolean v0, p0, Ll/۟ۙܿ;->ۜ:Z

    if-eqz v0, :cond_0

    .line 227
    iget v0, p0, Ll/۟ۙܿ;->֨:F

    return v0

    .line 225
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Need layout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 126
    iget v0, p0, Ll/۟ۙܿ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۙܿ;

    iget v0, v0, Ll/ۨۙܿ;->ۧ:I

    return v0
.end method

.method public final ᩷()V
    .locals 4

    .line 481
    iget-object v0, p0, Ll/۟ۙܿ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۙܿ;

    if-eqz v1, :cond_0

    .line 483
    iget-object v1, v1, Ll/᩺ۙܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۙܿ;

    .line 484
    iget-object v3, v2, Ll/ܰۙܿ;->֫:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_1

    .line 485
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    const/4 v3, 0x0

    .line 486
    iput-object v3, v2, Ll/ܰۙܿ;->֫:Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 491
    iput v0, p0, Ll/۟ۙܿ;->ۧ:I

    return-void
.end method

.method public final ᩻()F
    .locals 2

    .line 217
    iget-boolean v0, p0, Ll/۟ۙܿ;->ۜ:Z

    if-eqz v0, :cond_0

    .line 220
    iget v0, p0, Ll/۟ۙܿ;->ܶ:F

    return v0

    .line 218
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Need layout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
