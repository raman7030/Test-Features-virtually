.class public abstract Ll/ۗۤᩳ;
.super Ljava/lang/Object;
.source "UAZD"


# instance fields
.field public final ֡:Ljava/util/ArrayList;

.field public final ֨:Landroid/graphics/Rect;

.field public ֫:I

.field public final ֫֫:[I

.field public final ۖ:Ll/ܳ᩸ۡ;

.field public ۗ:Ll/᩷۟ᩳ;

.field public final ۘ:Ll/ܳ᩸ۡ;

.field public ۙ:I

.field public final ۚ:Landroid/graphics/Rect;

.field public ۛ:Z

.field public final ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۜ֫:Landroid/graphics/RectF;

.field public final ۟:Ljava/lang/Runnable;

.field public ۠:Ljava/lang/String;

.field public ۡ:Z

.field public volatile ۡ֫:I

.field public final ۢ:Ll/᩶ۤᩳ;

.field public final ۢ֫:Landroid/graphics/RectF;

.field public final ۤ:I

.field public ۧ:Ll/۟᩺ᩳ;

.field public final ۧ֫:[I

.field public ۨ:I

.field public ۫:Ll/۟᩺ᩳ;

.field public volatile ۬:Z

.field public final ܰ:Ljava/lang/Object;

.field public volatile ܳ:Ll/ᩴۨᩳ;

.field public volatile ܳ֫:Z

.field public ܶ:Ll/᩷۟ᩳ;

.field public ܺ:Ll/۫ۨᩳ;

.field public volatile ܽ:Ll/۟᩸ᩳ;

.field public ܽ֫:Z

.field public final ܿ:Ll/֫ܰᩳ;

.field public ܿ֫:Z

.field public volatile ᩳ:Z

.field public ᩳ֫:Z

.field public ᩴ:Z

.field public ᩵:Z

.field public ᩶:I

.field public final ᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᩷֫:Landroid/graphics/RectF;

.field public ᩸:Ll/᩸ܰᩳ;

.field public ᩹:Ll/ᩴܰᩳ;

.field public ᩺:Ll/۟᩸ᩳ;

.field public ᩻:I

.field public ᩻֫:Ll/᩺֫ܿ;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;Ll/۬ۜܽ;)V
    .locals 7

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    .line 45
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    iput v0, p0, Ll/ۗۤᩳ;->ۤ:I

    .line 49
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->ܰ:Ljava/lang/Object;

    .line 95
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 96
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 97
    new-instance v0, Ll/ۜ۫᩻;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ۜ۫᩻;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/ۗۤᩳ;->۟:Ljava/lang/Runnable;

    .line 101
    new-instance v0, Ll/᩶ۤᩳ;

    invoke-direct {v0, p0}, Ll/᩶ۤᩳ;-><init>(Ll/ۗۤᩳ;)V

    iput-object v0, p0, Ll/ۗۤᩳ;->ۢ:Ll/᩶ۤᩳ;

    .line 105
    new-instance v0, Ll/᩷۟ᩳ;

    invoke-direct {v0}, Ll/᩷۟ᩳ;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 106
    new-instance v0, Ll/᩸ܰᩳ;

    invoke-direct {v0}, Ll/᩸ܰᩳ;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    .line 111
    new-instance v0, Ll/᩷۟ᩳ;

    invoke-direct {v0}, Ll/᩷۟ᩳ;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    const/4 v0, -0x1

    .line 129
    iput v0, p0, Ll/ۗۤᩳ;->ۨ:I

    .line 359
    iput-boolean v1, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    .line 616
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/ۗۤᩳ;->ۜ֫:Landroid/graphics/RectF;

    .line 617
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/ۗۤᩳ;->᩷֫:Landroid/graphics/RectF;

    .line 618
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/ۗۤᩳ;->ۢ֫:Landroid/graphics/RectF;

    .line 619
    new-instance v2, Ll/ܳ᩸ۡ;

    invoke-direct {v2, v0}, Ll/ܳ᩸ۡ;-><init>(I)V

    iput-object v2, p0, Ll/ۗۤᩳ;->ۘ:Ll/ܳ᩸ۡ;

    .line 620
    new-instance v0, Ll/ܳ᩸ۡ;

    invoke-direct {v0, v1}, Ll/ܳ᩸ۡ;-><init>(I)V

    iput-object v0, p0, Ll/ۗۤᩳ;->ۖ:Ll/ܳ᩸ۡ;

    .line 737
    new-instance v0, Ll/ᩴܰᩳ;

    invoke-direct {v0}, Ll/ᩴܰᩳ;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->᩹:Ll/ᩴܰᩳ;

    .line 796
    new-instance v0, Ll/֫ܰᩳ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 796
    iput-object v0, p0, Ll/ۗۤᩳ;->ܿ:Ll/֫ܰᩳ;

    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 797
    iput-object v0, p0, Ll/ۗۤᩳ;->֫֫:[I

    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 798
    iput-object v0, p0, Ll/ۗۤᩳ;->ۧ֫:[I

    .line 1804
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->ۚ:Landroid/graphics/Rect;

    .line 1805
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->֨:Landroid/graphics/Rect;

    .line 1806
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۗۤᩳ;->֡:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 2104
    iput-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    .line 2105
    iput-boolean v0, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    .line 144
    iput-object p1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    .line 145
    iput-object p3, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    .line 146
    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩻ܽ()Ll/ᩴۨᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗۤᩳ;->ܳ:Ll/ᩴۨᩳ;

    .line 147
    invoke-virtual {p4}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    iput p1, p0, Ll/ۗۤᩳ;->ۙ:I

    .line 148
    invoke-virtual {p4}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    .line 149
    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v1, -0xedc86dd

    .line 150
    invoke-virtual {p4, v1}, Ll/۬ۜܽ;->֫(I)Z

    move-result v1

    .line 151
    new-instance v2, Ll/ۨܰᩳ;

    invoke-direct {v2}, Ll/ۨܰᩳ;-><init>()V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_1

    .line 153
    invoke-virtual {p4}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    invoke-virtual {p4}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    invoke-virtual {p4}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    invoke-virtual {v2, v4, v5, v6}, Ll/ۨܰᩳ;->֫(III)V

    .line 154
    iget-object v4, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v4, v2}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    if-nez v1, :cond_0

    const/4 v4, 0x4

    .line 89
    invoke-virtual {p4, v4}, Ll/۬ۜܽ;->skipBytes(I)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const p1, 0x723a4824

    .line 159
    invoke-virtual {p4, p1}, Ll/۬ۜܽ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 160
    invoke-virtual {p4}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    :goto_1
    if-ge v0, p1, :cond_2

    .line 162
    invoke-virtual {p4}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p2

    .line 163
    invoke-virtual {p4}, Ll/۬ۜܽ;->readByte()B

    move-result p3

    and-int/lit16 p3, p3, 0xff

    .line 164
    iget-object v1, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    shl-int/lit8 p3, p3, 0x10

    or-int/2addr p2, p3

    invoke-virtual {v1, p2}, Ll/᩸ܰᩳ;->add(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 166
    :cond_2
    iget-object p1, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {p1}, Ll/᩸ܰᩳ;->ܽ()V

    return-void

    .line 168
    :cond_3
    iget-object p1, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    iget-object p4, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p3}, Ll/ۢ۫ۡ;->ۡ()I

    move-result p3

    invoke-virtual {p1, p0, p2, p4, p3}, Ll/᩸ܰᩳ;->֫(Ll/ۗۤᩳ;Ll/᩶᩸ᩳ;Ll/᩷۟ᩳ;I)V

    return-void
.end method

.method public constructor <init>(Ll/۫ۨᩳ;Ll/᩺֫ܿ;)V
    .locals 3

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    .line 45
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    iput v0, p0, Ll/ۗۤᩳ;->ۤ:I

    .line 49
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->ܰ:Ljava/lang/Object;

    .line 95
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 96
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 97
    new-instance v0, Ll/ۜ۫᩻;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ۜ۫᩻;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/ۗۤᩳ;->۟:Ljava/lang/Runnable;

    .line 101
    new-instance v0, Ll/᩶ۤᩳ;

    invoke-direct {v0, p0}, Ll/᩶ۤᩳ;-><init>(Ll/ۗۤᩳ;)V

    iput-object v0, p0, Ll/ۗۤᩳ;->ۢ:Ll/᩶ۤᩳ;

    .line 105
    new-instance v0, Ll/᩷۟ᩳ;

    invoke-direct {v0}, Ll/᩷۟ᩳ;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 106
    new-instance v0, Ll/᩸ܰᩳ;

    invoke-direct {v0}, Ll/᩸ܰᩳ;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    .line 111
    new-instance v0, Ll/᩷۟ᩳ;

    invoke-direct {v0}, Ll/᩷۟ᩳ;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    const/4 v0, -0x1

    .line 129
    iput v0, p0, Ll/ۗۤᩳ;->ۨ:I

    .line 359
    iput-boolean v1, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    .line 616
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/ۗۤᩳ;->ۜ֫:Landroid/graphics/RectF;

    .line 617
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/ۗۤᩳ;->᩷֫:Landroid/graphics/RectF;

    .line 618
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/ۗۤᩳ;->ۢ֫:Landroid/graphics/RectF;

    .line 619
    new-instance v2, Ll/ܳ᩸ۡ;

    invoke-direct {v2, v0}, Ll/ܳ᩸ۡ;-><init>(I)V

    iput-object v2, p0, Ll/ۗۤᩳ;->ۘ:Ll/ܳ᩸ۡ;

    .line 620
    new-instance v0, Ll/ܳ᩸ۡ;

    invoke-direct {v0, v1}, Ll/ܳ᩸ۡ;-><init>(I)V

    iput-object v0, p0, Ll/ۗۤᩳ;->ۖ:Ll/ܳ᩸ۡ;

    .line 737
    new-instance v0, Ll/ᩴܰᩳ;

    invoke-direct {v0}, Ll/ᩴܰᩳ;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->᩹:Ll/ᩴܰᩳ;

    .line 796
    new-instance v0, Ll/֫ܰᩳ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 796
    iput-object v0, p0, Ll/ۗۤᩳ;->ܿ:Ll/֫ܰᩳ;

    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 797
    iput-object v0, p0, Ll/ۗۤᩳ;->֫֫:[I

    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 798
    iput-object v0, p0, Ll/ۗۤᩳ;->ۧ֫:[I

    .line 1804
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->ۚ:Landroid/graphics/Rect;

    .line 1805
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۗۤᩳ;->֨:Landroid/graphics/Rect;

    .line 1806
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۗۤᩳ;->֡:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 2104
    iput-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    .line 2105
    iput-boolean v0, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    .line 138
    iput-object p1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    .line 139
    iput-object p2, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    .line 140
    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩻ܽ()Ll/ᩴۨᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗۤᩳ;->ܳ:Ll/ᩴۨᩳ;

    return-void
.end method

.method private ֫(DZ)I
    .locals 2

    .line 399
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v0}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v0

    float-to-double v0, v0

    div-double/2addr p1, v0

    double-to-int p1, p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-eqz p3, :cond_1

    .line 403
    iget-object p2, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    invoke-virtual {p2}, Ll/᩷۟ᩳ;->size()I

    move-result p2

    if-lt p1, p2, :cond_2

    .line 404
    iget-object p1, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    invoke-virtual {p1}, Ll/᩷۟ᩳ;->ܿ()I

    move-result p1

    return p1

    .line 407
    :cond_1
    iget-object p2, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p2}, Ll/᩷۟ᩳ;->size()I

    move-result p2

    if-lt p1, p2, :cond_2

    .line 408
    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p1}, Ll/᩷۟ᩳ;->ܿ()I

    move-result p1

    :cond_2
    return p1
.end method

.method public static ֫(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;I)Ll/ۗۤᩳ;
    .locals 2

    if-nez p3, :cond_0

    .line 123
    new-instance p3, Ll/ۖܰᩳ;

    invoke-direct {p3, p0, p1, p2}, Ll/ۖܰᩳ;-><init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;)V

    return-object p3

    .line 125
    :cond_0
    new-instance v0, Ll/ܿܽܿ;

    const/4 v1, 0x1

    if-ne p3, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, p0, p1, p2, v1}, Ll/ܿܽܿ;-><init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;Z)V

    return-object v0
.end method

.method private ֫(IILjava/lang/CharSequence;)Ll/ۜ۫ۡ;
    .locals 6

    .line 437
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-boolean v1, v0, Ll/᩺֫ܿ;->ܰۧ:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    iget-object v2, v1, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    invoke-virtual {v2}, Ll/ۜܺܿ;->ۢ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 438
    iget-object v1, v1, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    invoke-virtual {v1, p3, p1, p2, v0}, Ll/ۜܺܿ;->֫(Ljava/lang/CharSequence;IILl/ۢ۫ۡ;)Ll/ۜ۫ۡ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 766
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    move-object v1, p3

    move v2, p1

    move v3, p2

    invoke-virtual/range {v0 .. v5}, Ll/ۢ۫ۡ;->֫(Ljava/lang/CharSequence;IIFLl/ᩳܺܿ;)Ll/ۜ۫ۡ;

    move-result-object p1

    return-object p1
.end method

.method private ֫(Landroid/graphics/Canvas;IIIIF)V
    .locals 8

    .line 1974
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-boolean v1, v0, Ll/᩺֫ܿ;->۫ۧ:Z

    if-nez v1, :cond_0

    goto/16 :goto_3

    .line 1975
    :cond_0
    iget-boolean v1, v0, Ll/᩺֫ܿ;->᩷ۧ:Z

    .line 1976
    iget-boolean v2, v0, Ll/᩺֫ܿ;->۬֫:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    if-eqz v1, :cond_1

    move p6, p2

    goto :goto_0

    :cond_1
    iget p6, p0, Ll/ۗۤᩳ;->ۙ:I

    sub-int p6, p4, p6

    :goto_0
    int-to-float p6, p6

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p6, 0x0

    goto :goto_1

    .line 1977
    :cond_3
    iget v1, p0, Ll/ۗۤᩳ;->ۙ:I

    int-to-float v1, v1

    sub-float/2addr p6, v1

    :goto_1
    int-to-float p4, p4

    cmpg-float v1, p4, p6

    if-ltz v1, :cond_6

    int-to-float p2, p2

    .line 1978
    iget v1, p0, Ll/ۗۤᩳ;->ۙ:I

    int-to-float v1, v1

    add-float/2addr v1, p6

    cmpl-float v1, p2, v1

    if-lez v1, :cond_4

    goto :goto_3

    .line 1979
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 1981
    :try_start_0
    invoke-virtual {p1, p6, v3}, Landroid/graphics/Canvas;->translate(FF)V

    sub-float/2addr p2, p6

    .line 1982
    invoke-static {v3, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    int-to-float p3, p3

    iget v2, p0, Ll/ۗۤᩳ;->ۙ:I

    int-to-float v2, v2

    sub-float/2addr p4, p6

    invoke-static {v2, p4}, Ljava/lang/Math;->min(FF)F

    move-result p4

    int-to-float p5, p5

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 1983
    iget-object p2, v0, Ll/᩺֫ܿ;->ܳۧ:Ll/֫ۖܽ;

    .line 1984
    iget p4, v0, Ll/᩺֫ܿ;->ۧۧ:I

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1985
    iget p4, p0, Ll/ۗۤᩳ;->ۙ:I

    int-to-float v5, p4

    const/4 v3, 0x0

    move-object v2, p1

    move v4, p3

    move v6, p5

    move-object v7, p2

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 1994
    iget p4, v0, Ll/᩺֫ܿ;->ᩳۧ:I

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1995
    iget-boolean p4, v0, Ll/᩺֫ܿ;->᩷ۧ:Z

    if-eqz p4, :cond_5

    iget p4, p0, Ll/ۗۤᩳ;->ۙ:I

    add-int/lit8 p4, p4, -0x1

    int-to-float p4, p4

    move v5, p4

    goto :goto_2

    :cond_5
    const/high16 p4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    :goto_2
    move-object v2, p1

    move v3, v5

    move v4, p3

    move v6, p5

    move-object v7, p2

    .line 1996
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1988
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1989
    throw p2

    :cond_6
    :goto_3
    return-void
.end method

.method private ֫(Landroid/graphics/Canvas;IIIIIIFZLl/᩺֫ܿ;Ll/֫ۖܽ;)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v11, p4

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    .line 2002
    iget-boolean v14, v12, Ll/᩺֫ܿ;->᩷ۧ:Z

    .line 2003
    iget v15, v0, Ll/ۗۤᩳ;->ۙ:I

    .line 2004
    iget-object v3, v0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v3}, Ll/۫ۨᩳ;->ܳ֫()I

    move-result v3

    const/16 v4, 0xff

    if-ge v3, v4, :cond_0

    const/4 v3, 0x1

    const/16 v16, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/16 v16, 0x0

    :goto_0
    if-nez v16, :cond_1

    .line 2006
    iget v3, v12, Ll/᩺֫ܿ;->ۧۧ:I

    invoke-virtual {v13, v3}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v5, v1

    int-to-float v6, v15

    int-to-float v7, v2

    const/4 v4, 0x0

    move-object/from16 v3, p1

    move-object/from16 v8, p11

    .line 2007
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 2009
    :cond_1
    iget v10, v12, Ll/᩺֫ܿ;->ۜۧ:F

    .line 2010
    iget-object v3, v12, Ll/᩺֫ܿ;->ۢ֫:Ll/ᩴۤᩳ;

    if-eqz v3, :cond_2

    .line 2012
    iget-object v4, v0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    move/from16 v5, p4

    move/from16 v6, p5

    move v7, v15

    move-object/from16 v8, p1

    move-object/from16 v9, p11

    move/from16 v17, v10

    move-object/from16 v10, p10

    invoke-interface/range {v3 .. v10}, Ll/ᩴۤᩳ;->֫(Ll/᩷۟ᩳ;IIILandroid/graphics/Canvas;Landroid/graphics/Paint;Ll/᩺֫ܿ;)V

    goto :goto_1

    :cond_2
    move/from16 v17, v10

    :goto_1
    if-nez v16, :cond_4

    .line 1994
    iget-object v3, v0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget v4, v3, Ll/᩺֫ܿ;->ᩳۧ:I

    invoke-virtual {v13, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1995
    iget-boolean v3, v3, Ll/᩺֫ܿ;->᩷ۧ:Z

    if-eqz v3, :cond_3

    iget v3, v0, Ll/ۗۤᩳ;->ۙ:I

    add-int/lit8 v3, v3, -0x1

    int-to-float v3, v3

    move v4, v3

    goto :goto_2

    :cond_3
    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f800000    # 1.0f

    :goto_2
    int-to-float v3, v1

    int-to-float v5, v2

    move-object/from16 v1, p1

    move v2, v4

    move-object/from16 v6, p11

    .line 1996
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_4
    if-eqz v14, :cond_5

    int-to-float v1, v15

    sub-float v10, v1, v17

    goto :goto_3

    :cond_5
    move/from16 v10, v17

    .line 2018
    :goto_3
    invoke-virtual {v0, v11}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v1

    iget v2, v12, Ll/᩺֫ܿ;->᩻ۧ:F

    add-float/2addr v1, v2

    .line 2019
    iget v2, v12, Ll/᩺֫ܿ;->ܽۧ:I

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setColor(I)V

    if-lez v11, :cond_6

    .line 2022
    iget-object v2, v0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    add-int/lit8 v3, v11, -0x1

    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    .line 2025
    :goto_4
    iget-object v3, v0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v3}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v8

    move/from16 v6, p5

    move v9, v1

    move v7, v2

    :goto_5
    if-gt v11, v6, :cond_e

    .line 2027
    invoke-virtual {v8, v11}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v1

    .line 2028
    iget v5, v1, Ll/ۨܰᩳ;->᩹:I

    move/from16 v4, p7

    if-gt v5, v4, :cond_8

    move/from16 v3, p6

    if-gt v3, v5, :cond_8

    .line 2030
    iget v1, v12, Ll/᩺֫ܿ;->ܿۧ:I

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2031
    iget v1, v12, Ll/᩺֫ܿ;->᩻ۧ:F

    sub-float v16, v9, v1

    add-float v18, v16, p8

    if-eqz v14, :cond_7

    add-int/lit8 v1, v15, -0x3

    int-to-float v2, v1

    int-to-float v1, v15

    move/from16 v19, v1

    move-object/from16 v1, p1

    move/from16 v3, v16

    move/from16 v4, v19

    move/from16 v19, v5

    move/from16 v5, v18

    move-object/from16 v6, p11

    .line 2035
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_6

    :cond_7
    move/from16 v19, v5

    const/4 v2, 0x0

    const/high16 v4, 0x40400000    # 3.0f

    move-object/from16 v1, p1

    move/from16 v3, v16

    move/from16 v5, v18

    move-object/from16 v6, p11

    .line 2037
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 2039
    :goto_6
    iget v1, v12, Ll/᩺֫ܿ;->ܽۧ:I

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_7

    :cond_8
    move/from16 v19, v5

    :goto_7
    add-int/lit8 v6, v19, 0x1

    if-eq v7, v6, :cond_d

    const/4 v1, 0x1

    if-eqz p9, :cond_9

    if-ne v6, v1, :cond_d

    .line 2043
    :cond_9
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v16

    if-eqz v14, :cond_b

    .line 2046
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v1

    move/from16 v18, v2

    move/from16 v19, v10

    :goto_8
    if-ltz v18, :cond_a

    add-int/lit8 v4, v18, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    move/from16 v3, v18

    move/from16 v5, v19

    move/from16 v20, v6

    move v6, v9

    move-object/from16 v7, p11

    .line 2047
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    sub-float v19, v19, v17

    add-int/lit8 v18, v18, -0x1

    move/from16 v6, v20

    goto :goto_8

    :cond_a
    move/from16 v20, v6

    goto :goto_a

    :cond_b
    move/from16 v20, v6

    .line 2051
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v1, 0x0

    move/from16 v18, v10

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v7, :cond_c

    add-int/lit8 v19, v3, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    move/from16 v4, v19

    move/from16 v5, v18

    move v6, v9

    move/from16 v21, v7

    move-object/from16 v7, p11

    .line 2052
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    add-float v18, v18, v17

    move/from16 v3, v19

    move/from16 v7, v21

    goto :goto_9

    :cond_c
    :goto_a
    move/from16 v7, v20

    :cond_d
    add-int/lit8 v11, v11, 0x1

    .line 2058
    invoke-virtual {v0, v11}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v1

    iget v2, v12, Ll/᩺֫ܿ;->᩻ۧ:F

    add-float v9, v1, v2

    move/from16 v6, p5

    goto/16 :goto_5

    :cond_e
    return-void
.end method

.method private ֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 7

    .line 1809
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_6

    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩻ۧ()Ll/᩺ۛᩳ;

    move-result-object v1

    if-nez v1, :cond_6

    .line 1810
    iget-object v1, p0, Ll/ۗۤᩳ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1811
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    const/4 v3, 0x0

    .line 1812
    iget-object v4, p0, Ll/ۗۤᩳ;->ۚ:Landroid/graphics/Rect;

    const/16 v5, 0xc8

    if-eqz p1, :cond_1

    .line 1813
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {v4, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 1814
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result p1

    neg-int p1, p1

    iget p2, p0, Ll/ۗۤᩳ;->᩻:I

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result p3

    sub-int/2addr p2, p3

    invoke-virtual {v4, p1, p2}, Landroid/graphics/Rect;->offset(II)V

    .line 1815
    iget p1, v4, Landroid/graphics/Rect;->right:I

    if-ge p1, v5, :cond_0

    .line 1816
    iput v3, v4, Landroid/graphics/Rect;->left:I

    .line 1817
    iput v5, v4, Landroid/graphics/Rect;->right:I

    .line 1818
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 1819
    :cond_0
    iget p1, v4, Landroid/graphics/Rect;->left:I

    add-int/lit16 p2, v2, -0xc8

    if-le p1, p2, :cond_5

    .line 1820
    iput p2, v4, Landroid/graphics/Rect;->left:I

    .line 1821
    iput v2, v4, Landroid/graphics/Rect;->right:I

    .line 1822
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_3

    .line 1826
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {v4, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 1827
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result p1

    neg-int p1, p1

    iget p2, p0, Ll/ۗۤᩳ;->᩻:I

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v6

    sub-int/2addr p2, v6

    invoke-virtual {v4, p1, p2}, Landroid/graphics/Rect;->offset(II)V

    .line 1828
    iget p1, v4, Landroid/graphics/Rect;->right:I

    if-ge p1, v5, :cond_2

    .line 1829
    iput v3, v4, Landroid/graphics/Rect;->left:I

    .line 1830
    iput v5, v4, Landroid/graphics/Rect;->right:I

    .line 1831
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1832
    :cond_2
    iget p1, v4, Landroid/graphics/Rect;->left:I

    add-int/lit16 p2, v2, -0xc8

    if-le p1, p2, :cond_3

    .line 1833
    iput p2, v4, Landroid/graphics/Rect;->left:I

    .line 1834
    iput v2, v4, Landroid/graphics/Rect;->right:I

    .line 1835
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    if-eqz p3, :cond_5

    .line 1839
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object p1

    iget-object p2, p0, Ll/ۗۤᩳ;->֨:Landroid/graphics/Rect;

    invoke-virtual {p2, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 1840
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result p1

    neg-int p1, p1

    iget p3, p0, Ll/ۗۤᩳ;->᩻:I

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v4

    sub-int/2addr p3, v4

    invoke-virtual {p2, p1, p3}, Landroid/graphics/Rect;->offset(II)V

    .line 1841
    iget p1, p2, Landroid/graphics/Rect;->right:I

    if-ge p1, v5, :cond_4

    .line 1842
    iput v3, p2, Landroid/graphics/Rect;->left:I

    .line 1843
    iput v5, p2, Landroid/graphics/Rect;->right:I

    .line 1844
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1845
    :cond_4
    iget p1, p2, Landroid/graphics/Rect;->left:I

    add-int/lit16 p3, v2, -0xc8

    if-le p1, p3, :cond_5

    .line 1846
    iput p3, p2, Landroid/graphics/Rect;->left:I

    .line 1847
    iput v2, p2, Landroid/graphics/Rect;->right:I

    .line 1848
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1852
    :cond_5
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemGestureExclusionRects(Ljava/util/List;)V

    :cond_6
    return-void
.end method

.method public static synthetic ֫(Ll/ۗۤᩳ;)V
    .locals 2

    .line 98
    iget-object v0, p0, Ll/ۗۤᩳ;->᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 99
    invoke-direct {p0}, Ll/ۗۤᩳ;->ۨ()V

    return-void
.end method

.method private ֫(Ll/ۜܺܿ;II)V
    .locals 3

    .line 1953
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0, p2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v0

    .line 1954
    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1, p3}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v1

    .line 1956
    iget-object v2, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    iget v0, v0, Ll/ۨܰᩳ;->᩶:I

    invoke-virtual {v1}, Ll/ۨܰᩳ;->֫()I

    move-result v1

    invoke-virtual {p1, v2, v0, v1}, Ll/ۜܺܿ;->ᩳ(Ll/᩶᩸ᩳ;II)V

    .line 66
    iget v0, p0, Ll/ۗۤᩳ;->᩶:I

    const v1, 0xf4240

    if-le v0, v1, :cond_0

    .line 1959
    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->֨()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1961
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0, p2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v0

    .line 1962
    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1, p3}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v1

    .line 1963
    iget v0, v0, Ll/ۨܰᩳ;->᩶:I

    invoke-virtual {v1}, Ll/ۨܰᩳ;->֫()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ll/ۜܺܿ;->ܳ(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1964
    invoke-direct {p0, p2, p3}, Ll/ۗۤᩳ;->ܳ(II)J

    move-result-wide p2

    .line 1965
    iget-object v0, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    const/16 v1, 0x20

    ushr-long v1, p2, v1

    long-to-int v2, v1

    long-to-int p3, p2

    invoke-virtual {p1, v0, v2, p3}, Ll/ۜܺܿ;->ܽ(Ll/᩶᩸ᩳ;II)V

    :cond_0
    return-void
.end method

.method private ֫(Ll/᩺ۛᩳ;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p4, :cond_2

    if-eqz p1, :cond_1

    .line 1864
    iget p2, p5, Landroid/graphics/RectF;->left:F

    iget-object p4, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p4}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr p2, v1

    float-to-int p2, p2

    invoke-virtual {p4}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    add-int/2addr v1, p2

    .line 1865
    iget p2, p5, Landroid/graphics/RectF;->top:F

    iget v2, p0, Ll/ۗۤᩳ;->᩻:I

    invoke-virtual {p4}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    add-float/2addr p2, v2

    float-to-int p2, p2

    invoke-virtual {p4}, Landroid/view/View;->getPaddingTop()I

    move-result p4

    add-int/2addr p4, p2

    .line 1866
    invoke-virtual {p5}, Landroid/graphics/RectF;->setEmpty()V

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 1868
    invoke-virtual {p1, p6, v1, p4, p2}, Ll/᩺ۛᩳ;->֫(IIIZ)V

    return-void

    .line 1870
    :cond_0
    invoke-virtual {p1, p6, v0, v0, v0}, Ll/᩺ۛᩳ;->֫(IIIZ)V

    return-void

    .line 1873
    :cond_1
    invoke-virtual {p4, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 1876
    :cond_2
    invoke-virtual {p5}, Landroid/graphics/RectF;->setEmpty()V

    if-eqz p1, :cond_3

    .line 1878
    invoke-virtual {p1, p6, v0, v0, v0}, Ll/᩺ۛᩳ;->֫(IIIZ)V

    :cond_3
    return-void
.end method

.method private ۛ()Ll/۟᩸ᩳ;
    .locals 4

    .line 206
    iget-object v0, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    .line 207
    iget-object v1, p0, Ll/ۗۤᩳ;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    .line 208
    iget-object v2, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll/ۗۤᩳ;->ۧ:Ll/۟᩺ᩳ;

    if-ne v2, v0, :cond_0

    iget v2, p0, Ll/ۗۤᩳ;->֫:I

    if-ne v2, v1, :cond_0

    iget-object v2, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    .line 209
    invoke-interface {v0, v2}, Ll/᩶᩸ᩳ;->֫(Ll/۟᩸ᩳ;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 198
    :cond_0
    iget-object v2, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    const/4 v3, 0x0

    .line 199
    iput-object v3, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    .line 200
    iput-object v3, p0, Ll/ۗۤᩳ;->ۧ:Ll/۟᩺ᩳ;

    if-eqz v2, :cond_1

    .line 201
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V

    .line 211
    :cond_1
    iput-object v0, p0, Ll/ۗۤᩳ;->ۧ:Ll/۟᩺ᩳ;

    .line 212
    iput v1, p0, Ll/ۗۤᩳ;->֫:I

    .line 213
    invoke-interface {v0}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    .line 215
    iget-object v0, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/۟᩸ᩳ;->۬:Z

    .line 217
    :cond_2
    iget-object v0, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    return-object v0
.end method

.method private ۧ(Landroid/graphics/Canvas;IIIIIILl/᩹ۤᩳ;Ll/ۜܺܿ;Ll/ۜ֫ܿ;Ll/᩻۫ᩳ;)V
    .locals 102

    move-object/from16 v13, p0

    move-object/from16 v15, p1

    move/from16 v0, p2

    move/from16 v1, p3

    move/from16 v14, p5

    move/from16 v12, p6

    move-object/from16 v11, p8

    move-object/from16 v10, p9

    add-int v9, v0, p4

    .line 858
    iget v2, v13, Ll/ۗۤᩳ;->᩻:I

    sub-int v8, v1, v2

    add-int v7, v8, v14

    .line 861
    iget-object v6, v13, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    if-nez v1, :cond_0

    .line 862
    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int v2, v8, v2

    move v5, v2

    goto :goto_0

    :cond_0
    move v5, v8

    .line 864
    :goto_0
    invoke-virtual {v6}, Ll/۫ۨᩳ;->۠֫()I

    move-result v2

    sub-int v4, v8, v2

    .line 869
    iget-object v3, v13, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-object v2, v3, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    iget v12, v3, Ll/᩺֫ܿ;->᩸֫:I

    move/from16 v16, v12

    iget v12, v3, Ll/᩺֫ܿ;->᩶֫:I

    move/from16 v17, v12

    iget v12, v3, Ll/᩺֫ܿ;->ۗ֫:I

    move/from16 v18, v12

    iget v12, v3, Ll/ۢ۫ۡ;->ܳ:F

    move/from16 v19, v12

    iget v12, v3, Ll/᩺֫ܿ;->᩻֫:I

    move/from16 v20, v12

    iget v12, v3, Ll/᩺֫ܿ;->ۙ֫:I

    move/from16 v21, v12

    .line 870
    iget-object v12, v3, Ll/᩺֫ܿ;->ܳۧ:Ll/֫ۖܽ;

    .line 871
    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v27

    .line 872
    invoke-virtual {v3}, Ll/ۢ۫ۡ;->᩻()F

    move-result v28

    move-object/from16 v22, v12

    .line 873
    invoke-virtual {v3}, Ll/᩺֫ܿ;->۠()I

    move-result v12

    move/from16 v23, v12

    .line 874
    iget v12, v3, Ll/᩺֫ܿ;->ۡ֫:I

    move/from16 v24, v12

    .line 875
    iget v12, v13, Ll/ۗۤᩳ;->ۙ:I

    .line 876
    iget-boolean v11, v3, Ll/᩺֫ܿ;->ۧ֫:Z

    move/from16 v25, v11

    .line 877
    iget-boolean v11, v3, Ll/᩺֫ܿ;->۬ۧ:Z

    move/from16 v26, v8

    .line 878
    iget-boolean v8, v3, Ll/᩺֫ܿ;->۫֫:Z

    .line 879
    iget-object v10, v3, Ll/᩺֫ܿ;->ۜܽ:Ll/᩹᩺ۧ;

    move-object/from16 v29, v10

    .line 880
    iget-object v10, v3, Ll/᩺֫ܿ;->᩻ܽ:Ll/᩹᩺ۧ;

    move-object/from16 v30, v2

    .line 881
    iget-object v2, v13, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v2}, Ll/᩸ܰᩳ;->ۧ()Ll/֨ܰᩳ;

    move-result-object v2

    move-object/from16 v31, v10

    .line 883
    invoke-virtual {v6}, Ll/۫ۨᩳ;->᩻ۧ()Ll/᩺ۛᩳ;

    move-result-object v10

    .line 884
    invoke-virtual {v6}, Ll/۫ۨᩳ;->ۘ֫()Ll/֫ܰᩳ;

    move-result-object v32

    move-object/from16 v33, v10

    .line 888
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->۠()Z

    move-result v10

    if-eqz v10, :cond_1

    move-object/from16 v34, v2

    .line 889
    iget-object v2, v13, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    goto :goto_1

    :cond_1
    move-object/from16 v34, v2

    iget-object v2, v13, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    :goto_1
    if-eqz v8, :cond_2

    mul-int v35, p4, v12

    move/from16 v36, v4

    move/from16 v4, v35

    goto :goto_2

    :cond_2
    const/16 v35, 0x0

    move/from16 v36, v4

    const/4 v4, 0x0

    :goto_2
    int-to-float v4, v4

    .line 892
    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ᩳ()F

    move-result v35

    move/from16 v37, v5

    sub-float v5, v35, v28

    .line 893
    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ܿ()F

    move-result v35

    add-float v35, v35, v28

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ᩳ()F

    move-result v38

    sub-float v35, v35, v38

    move/from16 v38, v12

    sub-float v12, v35, v27

    .line 892
    invoke-static {v5, v12}, Ljava/lang/Math;->max(FF)F

    move-result v5

    add-float/2addr v5, v4

    const/4 v4, 0x0

    cmpl-float v4, v27, v4

    if-lez v4, :cond_3

    div-float v5, v5, v27

    float-to-double v4, v5

    .line 894
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    const/4 v5, 0x0

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    move/from16 v35, v11

    int-to-double v11, v1

    .line 895
    invoke-direct {v13, v11, v12, v10}, Ll/ۗۤᩳ;->֫(DZ)I

    move-result v1

    sub-int/2addr v1, v4

    const/4 v5, 0x0

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 896
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v1

    move/from16 v39, v7

    move/from16 v40, v8

    int-to-double v7, v14

    add-double/2addr v7, v11

    invoke-direct {v13, v7, v8, v10}, Ll/ۗۤᩳ;->֫(DZ)I

    move-result v7

    add-int/2addr v7, v4

    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 897
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->֫()Z

    move-result v41

    xor-int/lit8 v42, v41, 0x1

    .line 898
    invoke-virtual {v13, v5}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v43

    .line 901
    iget-object v1, v13, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v7

    .line 902
    iget-object v1, v13, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v4

    .line 903
    invoke-static {v7, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 904
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 906
    invoke-virtual {v6}, Landroid/view/View;->isFocused()Z

    move-result v44

    if-eqz v44, :cond_4

    move-object/from16 v44, v2

    iget v2, v3, Ll/᩺֫ܿ;->ۙۧ:I

    goto :goto_4

    :cond_4
    move-object/from16 v44, v2

    iget v2, v3, Ll/᩺֫ܿ;->᩵ۧ:I

    :goto_4
    move-wide/from16 v45, v11

    .line 908
    iget v12, v3, Ll/᩺֫ܿ;->۠ۧ:I

    .line 909
    iget v11, v3, Ll/᩺֫ܿ;->֨ۧ:I

    move/from16 p3, v12

    .line 911
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result v12

    .line 912
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ۢ()F

    move-result v47

    move/from16 v48, v4

    .line 915
    iget-boolean v4, v3, Ll/᩺֫ܿ;->ܰۧ:Z

    const/16 v49, 0x1

    if-eqz v4, :cond_5

    invoke-virtual/range {p9 .. p9}, Ll/ۜܺܿ;->ۢ()Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v4, 0x1

    const/16 v50, 0x1

    goto :goto_5

    :cond_5
    const/4 v4, 0x0

    const/16 v50, 0x0

    .line 916
    :goto_5
    invoke-virtual/range {p10 .. p10}, Ll/ۜ֫ܿ;->ۧ()Z

    move-result v51

    const/16 v52, 0x0

    if-nez v10, :cond_8

    if-nez v50, :cond_6

    goto :goto_7

    .line 924
    :cond_6
    invoke-virtual/range {p11 .. p11}, Ll/᩻۫ᩳ;->ܿ()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 926
    iget-object v4, v13, Ll/ۗۤᩳ;->ۧ֫:[I

    const/16 v54, 0x0

    aput v2, v4, v54

    .line 927
    aput v1, v4, v49

    const/16 v49, 0x2

    .line 928
    aput v14, v4, v49

    .line 929
    invoke-virtual/range {p11 .. p11}, Ll/᩻۫ᩳ;->ܽ()I

    move-result v49

    const/16 v53, 0x3

    aput v49, v4, v53

    add-int/lit8 v49, v49, 0x1

    const/16 v53, 0x4

    .line 930
    aput v49, v4, v53

    .line 931
    invoke-virtual/range {p11 .. p11}, Ll/᩻۫ᩳ;->ᩳ()I

    move-result v49

    const/16 v53, 0x5

    aput v49, v4, v53

    const/16 v53, 0x6

    add-int/lit8 v49, v49, 0x1

    .line 932
    aput v49, v4, v53

    goto :goto_6

    .line 935
    :cond_7
    iget-object v4, v13, Ll/ۗۤᩳ;->֫֫:[I

    const/16 v54, 0x0

    aput v2, v4, v54

    .line 936
    aput v1, v4, v49

    const/16 v49, 0x2

    .line 937
    aput v14, v4, v49

    :goto_6
    move-object/from16 v49, v4

    goto :goto_8

    :cond_8
    :goto_7
    move-object/from16 v49, v52

    .line 941
    :goto_8
    iget-object v4, v13, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-static {v4}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result v4

    move/from16 v53, v1

    .line 942
    iget-object v1, v13, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-static {v1}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanEnd(Landroid/text/Spannable;)I

    move-result v1

    move/from16 v54, v14

    if-ge v1, v4, :cond_9

    move/from16 v101, v4

    move v4, v1

    move/from16 v1, v101

    .line 949
    :cond_9
    iget-object v14, v13, Ll/ۗۤᩳ;->ܿ:Ll/֫ܰᩳ;

    if-ltz v4, :cond_a

    if-ge v4, v1, :cond_a

    move/from16 v55, v2

    const/4 v2, 0x1

    .line 951
    iput-boolean v2, v14, Ll/֫ܰᩳ;->֫:Z

    .line 952
    iput v4, v14, Ll/֫ܰᩳ;->ܽ:I

    .line 953
    iput v1, v14, Ll/֫ܰᩳ;->ۧ:I

    goto :goto_9

    :cond_a
    move/from16 v55, v2

    const/4 v1, 0x0

    .line 955
    iput-boolean v1, v14, Ll/֫ܰᩳ;->֫:Z

    .line 959
    :goto_9
    iget v1, v3, Ll/᩺֫ܿ;->ܽ֫:I

    invoke-virtual {v15, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 960
    invoke-virtual {v6}, Ll/۫ۨᩳ;->ܳ֫()I

    move-result v4

    .line 961
    invoke-virtual {v6}, Ll/۫ۨᩳ;->ۚۧ()Z

    move-result v56

    const/16 v1, 0xff

    if-nez v56, :cond_c

    if-ge v4, v1, :cond_b

    goto :goto_a

    :cond_b
    move-object/from16 v57, v3

    move/from16 v60, v5

    move-object/from16 v61, v6

    move/from16 v63, v7

    move/from16 v62, v8

    move/from16 v59, v36

    move/from16 v8, v39

    move/from16 v58, v55

    move/from16 v55, v11

    move/from16 v36, v12

    move/from16 v12, v48

    move-object/from16 v101, v30

    move-object/from16 v30, v14

    move/from16 v14, v37

    move/from16 v37, v53

    move-object/from16 v53, v101

    goto/16 :goto_b

    .line 964
    :cond_c
    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 966
    :try_start_0
    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    int-to-float v1, v1

    move/from16 v57, v2

    :try_start_1
    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v15, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move/from16 v2, v53

    move-object/from16 v1, p0

    move-object/from16 v53, v30

    move/from16 v58, v55

    move/from16 v55, v11

    move-object/from16 v30, v14

    move/from16 v11, v57

    move v14, v2

    move-object/from16 v2, p1

    move-object/from16 v57, v3

    move/from16 v3, p2

    move/from16 v59, v36

    move/from16 v36, v12

    move/from16 v12, v48

    move/from16 v48, v4

    move/from16 v4, v59

    move/from16 v60, v5

    move/from16 v101, v37

    move/from16 v37, v14

    move/from16 v14, v101

    move v5, v9

    move-object/from16 v61, v6

    move/from16 v6, v39

    move/from16 v63, v7

    move/from16 v62, v8

    move/from16 v8, v39

    move/from16 v7, v47

    .line 967
    :try_start_2
    invoke-direct/range {v1 .. v7}, Ll/ۗۤᩳ;->֫(Landroid/graphics/Canvas;IIIIF)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 969
    invoke-virtual {v15, v11}, Landroid/graphics/Canvas;->restoreToCount(I)V

    if-eqz v56, :cond_d

    move-object v10, v13

    goto/16 :goto_79

    .line 973
    :cond_d
    invoke-virtual/range {v61 .. v61}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v2, v1

    .line 974
    invoke-virtual/range {v61 .. v61}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v1

    iget v3, v13, Ll/ۗۤᩳ;->᩻:I

    sub-int/2addr v1, v3

    int-to-float v3, v1

    .line 976
    invoke-virtual/range {v61 .. v61}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    add-float v4, v1, v2

    .line 977
    invoke-virtual/range {v61 .. v61}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    add-float v5, v1, v3

    move-object/from16 v1, p1

    move/from16 v6, v48

    .line 976
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->saveLayerAlpha(FFFFI)I

    :goto_b
    if-eqz v10, :cond_e

    move-object/from16 v1, v52

    goto :goto_c

    .line 980
    :cond_e
    invoke-direct/range {p0 .. p0}, Ll/ۗۤᩳ;->ۛ()Ll/۟᩸ᩳ;

    move-result-object v1

    :goto_c
    if-eqz v40, :cond_f

    .line 982
    iget-object v2, v13, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    :goto_d
    move-object v11, v2

    goto :goto_e

    :cond_f
    if-nez v1, :cond_10

    const-string v2, ""

    goto :goto_d

    :cond_10
    move-object v11, v1

    .line 983
    :goto_e
    iget-object v7, v13, Ll/ۗۤᩳ;->᩹:Ll/ᩴܰᩳ;

    if-eqz v35, :cond_1a

    if-eqz v1, :cond_1a

    move-object/from16 v6, v61

    .line 984
    iget v2, v6, Ll/۫ۨᩳ;->ۢ֫:I

    .line 742
    iget v3, v7, Ll/ᩴܰᩳ;->֫:I

    if-ne v2, v3, :cond_11

    iget v3, v7, Ll/ᩴܰᩳ;->ᩳ:I

    if-ne v12, v3, :cond_11

    move/from16 v40, v10

    goto/16 :goto_15

    .line 745
    :cond_11
    iput v2, v7, Ll/ᩴܰᩳ;->֫:I

    .line 746
    iput v12, v7, Ll/ᩴܰᩳ;->ᩳ:I

    .line 747
    iget-object v2, v13, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 521
    iget-boolean v3, v13, Ll/ۗۤᩳ;->ܿ֫:Z

    invoke-virtual {v13, v12, v3}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result v3

    .line 127
    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v2

    .line 748
    iget v3, v2, Ll/ۨܰᩳ;->᩹:I

    .line 749
    iget-object v4, v13, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    new-instance v5, Ll/֨ܰᩳ;

    invoke-direct {v5, v4}, Ll/֨ܰᩳ;-><init>(Ll/᩸ܰᩳ;)V

    .line 751
    invoke-virtual {v5, v3}, Ll/֨ܰᩳ;->ܽ(I)Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-virtual {v5}, Ll/֨ܰᩳ;->ۧ()I

    move-result v4

    if-nez v4, :cond_12

    goto/16 :goto_14

    .line 756
    :cond_12
    invoke-virtual/range {v57 .. v57}, Ll/ۢ۫ۡ;->ۡ()I

    move-result v4

    .line 758
    iget v2, v2, Ll/ۨܰᩳ;->᩶:I

    const/16 v39, 0x0

    move/from16 v39, v3

    const/4 v3, 0x0

    :goto_f
    move/from16 v40, v10

    if-ge v2, v12, :cond_15

    .line 759
    invoke-virtual {v1, v2}, Ll/۟᩸ᩳ;->charAt(I)C

    move-result v10

    move-object/from16 v48, v1

    const/16 v1, 0xa

    if-eq v10, v1, :cond_15

    const/16 v1, 0xd

    if-ne v10, v1, :cond_13

    goto :goto_11

    :cond_13
    const/16 v1, 0x9

    if-ne v10, v1, :cond_14

    .line 763
    rem-int v1, v3, v4

    sub-int v1, v4, v1

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_10

    :cond_14
    add-int/lit8 v3, v3, 0x1

    :goto_10
    add-int/lit8 v2, v2, 0x1

    move/from16 v10, v40

    move-object/from16 v1, v48

    goto :goto_f

    .line 771
    :cond_15
    :goto_11
    invoke-virtual {v5, v3}, Ll/֨ܰᩳ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_18

    move/from16 v1, v39

    :goto_12
    if-lez v1, :cond_16

    add-int/lit8 v2, v1, -0x1

    .line 774
    invoke-virtual {v5, v2}, Ll/֨ܰᩳ;->ܽ(I)Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-virtual {v5, v3}, Ll/֨ܰᩳ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_16

    add-int/lit8 v1, v1, -0x1

    goto :goto_12

    :cond_16
    :goto_13
    add-int/lit8 v2, v39, 0x1

    .line 782
    invoke-virtual {v5, v2}, Ll/֨ܰᩳ;->ܽ(I)Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-virtual {v5, v3}, Ll/֨ܰᩳ;->֫(I)Z

    move-result v4

    if-eqz v4, :cond_17

    move/from16 v39, v2

    goto :goto_13

    .line 788
    :cond_17
    iput v3, v7, Ll/ᩴܰᩳ;->ܿ:I

    .line 789
    iput v1, v7, Ll/ᩴܰᩳ;->ۧ:I

    .line 790
    iput v2, v7, Ll/ᩴܰᩳ;->ܽ:I

    goto :goto_15

    :cond_18
    const/4 v1, -0x1

    .line 792
    iput v1, v7, Ll/ᩴܰᩳ;->ܿ:I

    goto :goto_15

    :cond_19
    :goto_14
    move/from16 v40, v10

    const/4 v1, -0x1

    .line 752
    iput v1, v7, Ll/ᩴܰᩳ;->ܿ:I

    goto :goto_15

    :cond_1a
    move/from16 v40, v10

    move-object/from16 v6, v61

    .line 986
    :goto_15
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v12

    .line 987
    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v15, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    move-object/from16 v10, v57

    .line 998
    iget-boolean v1, v10, Ll/᩺֫ܿ;->۫ۧ:Z

    if-eqz v1, :cond_22

    .line 1002
    invoke-virtual/range {p11 .. p11}, Ll/᩻۫ᩳ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 1003
    invoke-virtual/range {p11 .. p11}, Ll/᩻۫ᩳ;->֫()I

    move-result v1

    .line 1004
    invoke-virtual/range {p11 .. p11}, Ll/᩻۫ᩳ;->ۧ()I

    move-result v2

    if-ne v1, v2, :cond_1b

    goto :goto_16

    :cond_1b
    move/from16 v39, v1

    move/from16 v48, v2

    goto :goto_17

    :cond_1c
    :goto_16
    const/4 v1, -0x1

    const/4 v2, -0x1

    const/16 v39, -0x1

    const/16 v48, -0x1

    .line 1012
    :goto_17
    iget-boolean v1, v10, Ll/᩺֫ܿ;->۬֫:Z

    .line 1013
    iget-boolean v2, v10, Ll/᩺֫ܿ;->᩷ۧ:Z

    if-eqz v1, :cond_1e

    .line 1016
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    if-eqz v2, :cond_1d

    int-to-float v1, v0

    const/4 v2, 0x0

    .line 1018
    invoke-virtual {v15, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_18

    :cond_1d
    const/4 v1, 0x0

    sub-int v2, v9, v38

    int-to-float v2, v2

    .line 1020
    invoke-virtual {v15, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    :goto_18
    move/from16 v3, v59

    .line 1022
    invoke-static {v14, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    move/from16 v5, v38

    invoke-virtual {v15, v2, v1, v5, v8}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v4, v8

    move/from16 v5, v60

    move-object/from16 v64, v6

    move/from16 v6, v62

    move-object/from16 v65, v7

    move/from16 v7, v39

    move v13, v8

    move/from16 v66, v26

    move/from16 v8, v48

    move/from16 v67, v9

    move/from16 v9, v27

    move-object/from16 v57, v10

    move-object/from16 v68, v29

    move-object/from16 v69, v31

    move/from16 v10, v40

    move-object/from16 v71, v11

    move/from16 v29, v25

    move/from16 v25, v35

    move/from16 v70, v55

    move-object/from16 v11, v57

    move/from16 v76, p3

    move/from16 v78, v12

    move/from16 v31, v16

    move/from16 v74, v17

    move/from16 v35, v18

    move/from16 v16, v19

    move/from16 v75, v21

    move/from16 v72, v23

    move/from16 v73, v24

    move/from16 v77, v36

    move/from16 v17, v13

    move/from16 v36, v20

    move/from16 v13, v38

    move-object/from16 v38, v22

    move-object/from16 v12, v38

    .line 1023
    invoke-direct/range {v1 .. v12}, Ll/ۗۤᩳ;->֫(Landroid/graphics/Canvas;IIIIIIFZLl/᩺֫ܿ;Ll/֫ۖܽ;)V

    .line 1026
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    move/from16 v0, v17

    goto/16 :goto_19

    :cond_1e
    move/from16 v76, p3

    move-object/from16 v64, v6

    move-object/from16 v65, v7

    move/from16 v67, v9

    move-object/from16 v57, v10

    move-object/from16 v71, v11

    move/from16 v78, v12

    move/from16 v74, v17

    move/from16 v75, v21

    move/from16 v72, v23

    move/from16 v73, v24

    move/from16 v66, v26

    move-object/from16 v68, v29

    move-object/from16 v69, v31

    move/from16 v77, v36

    move/from16 v13, v38

    move/from16 v70, v55

    move/from16 v3, v59

    move/from16 v17, v8

    move/from16 v31, v16

    move/from16 v16, v19

    move/from16 v36, v20

    move-object/from16 v38, v22

    move/from16 v29, v25

    move/from16 v25, v35

    move/from16 v35, v18

    if-eqz v2, :cond_20

    if-gt v0, v13, :cond_1f

    .line 1030
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 1031
    invoke-static {v14, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    move/from16 v12, v17

    invoke-virtual {v15, v0, v1, v13, v12}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v4, v12

    move/from16 v5, v60

    move/from16 v6, v62

    move/from16 v7, v39

    move/from16 v8, v48

    move/from16 v9, v27

    move/from16 v10, v40

    move-object/from16 v11, v57

    move v0, v12

    move-object/from16 v12, v38

    .line 1032
    invoke-direct/range {v1 .. v12}, Ll/ۗۤᩳ;->֫(Landroid/graphics/Canvas;IIIIIIFZLl/᩺֫ܿ;Ll/֫ۖܽ;)V

    .line 1035
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    :goto_19
    move/from16 v12, p2

    move v8, v0

    move/from16 v0, v67

    goto/16 :goto_1b

    :cond_1f
    move/from16 v39, v17

    move/from16 v0, v67

    goto :goto_1a

    :cond_20
    move/from16 v0, v17

    int-to-float v1, v13

    sub-float v1, v47, v1

    move/from16 v12, v67

    int-to-float v2, v12

    cmpl-float v4, v2, v1

    if-ltz v4, :cond_21

    .line 1041
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    const/4 v4, 0x0

    .line 1042
    invoke-virtual {v15, v1, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1043
    invoke-static {v14, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v2, v1

    int-to-float v1, v0

    const/4 v5, 0x0

    invoke-virtual {v15, v5, v4, v2, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v4, v0

    move/from16 v5, v60

    move/from16 v6, v62

    move/from16 v7, v39

    move/from16 v8, v48

    move/from16 v9, v27

    move/from16 v10, v40

    move-object/from16 v11, v57

    move/from16 v39, v0

    move v0, v12

    move-object/from16 v12, v38

    .line 1044
    invoke-direct/range {v1 .. v12}, Ll/ۗۤᩳ;->֫(Landroid/graphics/Canvas;IIIIIIFZLl/᩺֫ܿ;Ll/֫ۖܽ;)V

    .line 1047
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    :goto_1a
    move/from16 v12, p2

    move/from16 v8, v39

    goto :goto_1b

    :cond_21
    move/from16 v39, v0

    move v0, v12

    goto :goto_1a

    :cond_22
    move/from16 v76, p3

    move-object/from16 v64, v6

    move-object/from16 v65, v7

    move v0, v9

    move-object/from16 v57, v10

    move-object/from16 v71, v11

    move/from16 v78, v12

    move/from16 v74, v17

    move/from16 v75, v21

    move/from16 v72, v23

    move/from16 v73, v24

    move/from16 v66, v26

    move-object/from16 v68, v29

    move-object/from16 v69, v31

    move/from16 v77, v36

    move/from16 v13, v38

    move/from16 v70, v55

    move/from16 v31, v16

    move/from16 v16, v19

    move/from16 v36, v20

    move-object/from16 v38, v22

    move/from16 v29, v25

    move/from16 v25, v35

    move/from16 v35, v18

    move/from16 v12, p2

    :goto_1b
    int-to-float v11, v12

    int-to-float v10, v0

    move-object/from16 v9, v57

    .line 1059
    iget-boolean v1, v9, Ll/᩺֫ܿ;->۫ۧ:Z

    if-eqz v1, :cond_26

    .line 1060
    iget-boolean v1, v9, Ll/᩺֫ܿ;->۬֫:Z

    if-eqz v1, :cond_24

    .line 1062
    iget-boolean v1, v9, Ll/᩺֫ܿ;->᩷ۧ:Z

    if-eqz v1, :cond_23

    add-int v1, v12, v13

    goto :goto_1c

    :cond_23
    sub-int v1, v0, v13

    int-to-float v1, v1

    goto :goto_1d

    .line 1069
    :cond_24
    iget-boolean v1, v9, Ll/᩺֫ܿ;->᩷ۧ:Z

    if-eqz v1, :cond_25

    .line 1070
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_1c
    int-to-float v1, v1

    goto :goto_1e

    :cond_25
    int-to-float v1, v13

    sub-float v1, v47, v1

    .line 1072
    invoke-static {v10, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    :goto_1d
    move v2, v1

    move v1, v11

    goto :goto_1f

    :cond_26
    move v1, v11

    :goto_1e
    move v2, v10

    :goto_1f
    move/from16 v3, v77

    int-to-float v7, v3

    const/4 v3, 0x0

    .line 1077
    invoke-virtual {v15, v7, v3}, Landroid/graphics/Canvas;->translate(FF)V

    sub-float v6, v1, v7

    sub-float v5, v2, v7

    int-to-float v14, v14

    int-to-float v4, v8

    .line 1081
    invoke-virtual {v15, v6, v14, v5, v4}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 1084
    invoke-virtual {v9}, Ll/ۢ۫ۡ;->ܽ()F

    move-result v1

    sub-float v1, v6, v1

    float-to-int v3, v1

    .line 1085
    invoke-virtual {v9}, Ll/ۢ۫ۡ;->ܽ()F

    move-result v1

    add-float/2addr v1, v5

    float-to-int v2, v1

    move/from16 v17, v2

    move/from16 v1, v37

    move/from16 v2, v54

    if-eq v1, v2, :cond_27

    const/16 v18, 0x1

    const/16 v37, 0x1

    goto :goto_20

    :cond_27
    const/16 v18, 0x0

    const/16 v37, 0x0

    :goto_20
    if-nez v37, :cond_28

    move/from16 v18, v3

    move/from16 v39, v8

    move-object/from16 v8, p0

    .line 1091
    invoke-virtual {v8, v1}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v3

    move/from16 v48, v13

    move-object/from16 v13, v44

    invoke-virtual {v13, v3}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v3

    move/from16 v19, v1

    goto :goto_21

    :cond_28
    move/from16 v18, v3

    move/from16 v39, v8

    move/from16 v48, v13

    move-object/from16 v13, v44

    move-object/from16 v8, p0

    .line 1094
    invoke-virtual {v8, v1}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v3

    invoke-virtual {v13, v3}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v3

    move/from16 v19, v1

    .line 1095
    invoke-virtual {v8, v2}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v1

    invoke-virtual {v13, v1}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v1

    if-ne v3, v1, :cond_29

    goto :goto_21

    :cond_29
    const/4 v3, -0x1

    .line 1107
    :goto_21
    iget-object v1, v8, Ll/ۗۤᩳ;->ۢ:Ll/᩶ۤᩳ;

    move-object/from16 v12, v71

    iput-object v12, v1, Ll/᩶ۤᩳ;->ܳ:Ljava/lang/CharSequence;

    move/from16 v54, v2

    if-eqz v50, :cond_2a

    move-object/from16 v2, p9

    goto :goto_22

    :cond_2a
    move-object/from16 v2, v52

    .line 1108
    :goto_22
    iput-object v2, v1, Ll/᩶ۤᩳ;->֫:Ll/ۜܺܿ;

    move/from16 v2, v40

    .line 1109
    iput-boolean v2, v1, Ll/᩶ۤᩳ;->ۧ:Z

    move/from16 v67, v0

    move-object/from16 v71, v12

    move/from16 v20, v14

    move/from16 v14, v60

    move/from16 v12, v62

    move-object/from16 v0, p9

    if-eqz v50, :cond_2b

    .line 1113
    invoke-direct {v8, v0, v14, v12}, Ll/ۗۤᩳ;->֫(Ll/ۜܺܿ;II)V

    :cond_2b
    if-nez v2, :cond_2d

    if-lez p4, :cond_2d

    move/from16 v79, v54

    move-object/from16 v21, v1

    if-lez p5, :cond_2c

    .line 1119
    invoke-virtual {v13, v14}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v1

    invoke-virtual {v13, v12}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v22

    move/from16 v40, v2

    invoke-virtual/range {v22 .. v22}, Ll/ۨܰᩳ;->֫()I

    move-result v2

    move-object/from16 v0, v64

    .line 1118
    invoke-virtual {v0, v8, v1, v2}, Ll/۫ۨᩳ;->֫(Ll/ۗۤᩳ;II)V

    goto :goto_24

    :cond_2c
    move/from16 v40, v2

    goto :goto_23

    :cond_2d
    move-object/from16 v21, v1

    move/from16 v40, v2

    move/from16 v79, v54

    :goto_23
    move-object/from16 v0, v64

    .line 1123
    :goto_24
    iget-object v2, v9, Ll/᩺֫ܿ;->ۢ֫:Ll/ᩴۤᩳ;

    if-eqz v2, :cond_2e

    .line 1125
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->֨()Z

    move-result v22

    move-object/from16 v61, v0

    move/from16 v0, v19

    move-object/from16 p3, v21

    move-object v1, v2

    move-object/from16 v54, v2

    move/from16 v44, v17

    move-object v2, v13

    move v0, v3

    move/from16 v55, v18

    move v3, v14

    move/from16 v17, v0

    move v0, v4

    move v4, v12

    move/from16 v56, v5

    move v5, v6

    move/from16 v57, v6

    move/from16 v6, v56

    move/from16 v59, v7

    move/from16 v7, v22

    move-object v15, v8

    move-object/from16 v8, p1

    move-object/from16 v60, v9

    move-object/from16 v9, v38

    move/from16 v62, v10

    move-object/from16 v10, p3

    move/from16 v64, v11

    move-object/from16 v11, v60

    invoke-interface/range {v1 .. v11}, Ll/ᩴۤᩳ;->֫(Ll/᩷۟ᩳ;IIFFZLandroid/graphics/Canvas;Ll/֫ۖܽ;Ll/ۧۧܿ;Ll/᩺֫ܿ;)V

    goto :goto_25

    :cond_2e
    move-object/from16 v61, v0

    move-object/from16 v54, v2

    move v0, v4

    move/from16 v56, v5

    move/from16 v57, v6

    move/from16 v59, v7

    move-object v15, v8

    move-object/from16 v60, v9

    move/from16 v62, v10

    move/from16 v64, v11

    move/from16 v44, v17

    move/from16 v55, v18

    move-object/from16 p3, v21

    move/from16 v17, v3

    :goto_25
    move-object/from16 v11, v60

    .line 1128
    iget-object v10, v11, Ll/᩺֫ܿ;->ۡۧ:Ll/ܺۢᩴ;

    .line 1129
    invoke-virtual {v10}, Ll/ܺۢᩴ;->size()I

    move-result v9

    if-lez v14, :cond_2f

    add-int/lit8 v5, v14, -0x1

    .line 1141
    invoke-virtual {v13, v5}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v1

    .line 1142
    invoke-virtual {v13, v5}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result v2

    invoke-virtual {v13, v2}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v2

    .line 1143
    invoke-virtual {v13, v5}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result v3

    invoke-virtual {v13, v3}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v3

    goto :goto_26

    :cond_2f
    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 1151
    :goto_26
    invoke-virtual {v13}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v8

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v6, v14

    move/from16 v5, v43

    move-object/from16 p4, v52

    move-object/from16 v4, p4

    move-object/from16 v22, v4

    const/4 v7, -0x1

    const/16 v18, 0x0

    const/16 v21, 0x0

    :goto_27
    const v43, 0x493e0

    move/from16 v60, v14

    .line 1153
    iget-object v14, v15, Ll/ۗۤᩳ;->ۢ֫:Landroid/graphics/RectF;

    move-object/from16 v23, v14

    iget-object v14, v15, Ll/ۗۤᩳ;->᩷֫:Landroid/graphics/RectF;

    const/high16 v77, 0x3fc00000    # 1.5f

    if-gt v6, v12, :cond_6d

    .line 1154
    invoke-virtual {v8, v6}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v15

    move/from16 p5, v2

    .line 1161
    iget v2, v15, Ll/ۨܰᩳ;->᩹:I

    if-ne v1, v2, :cond_31

    .line 1163
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->֨()Z

    move-result v2

    if-nez v2, :cond_30

    const/4 v2, 0x0

    goto :goto_28

    :cond_30
    move/from16 v2, v72

    :goto_28
    move/from16 v80, v12

    move v12, v3

    move v3, v1

    move/from16 v1, p5

    goto :goto_29

    .line 1168
    :cond_31
    invoke-virtual {v13, v6}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result v1

    invoke-virtual {v13, v1}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v1

    .line 1169
    invoke-virtual {v13, v6}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result v3

    invoke-virtual {v13, v3}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v3

    const/16 v24, 0x0

    move/from16 v80, v12

    move v12, v3

    move v3, v2

    const/4 v2, 0x0

    :goto_29
    move-object/from16 v24, v13

    int-to-float v13, v2

    move/from16 v26, v2

    const/4 v2, 0x0

    move-object/from16 v82, v8

    move-object/from16 v81, v14

    move-object/from16 v14, p0

    move-object/from16 v8, p1

    .line 1173
    invoke-virtual {v8, v13, v2}, Landroid/graphics/Canvas;->translate(FF)V

    sub-float v83, v57, v13

    sub-float v84, v56, v13

    .line 1179
    invoke-virtual {v15}, Ll/ۨܰᩳ;->ܽ()Z

    move-result v2

    .line 1180
    iget v8, v15, Ll/ۨܰᩳ;->᩶:I

    if-eqz v2, :cond_32

    add-int v43, v8, v43

    move/from16 p5, v13

    move/from16 v2, v43

    goto :goto_2a

    .line 1181
    :cond_32
    iget v2, v15, Ll/ۨܰᩳ;->᩸:I

    move/from16 p5, v13

    :goto_2a
    float-to-int v13, v5

    move-object/from16 v85, v10

    int-to-float v10, v13

    move/from16 v43, v13

    add-int/lit8 v13, v6, 0x1

    move/from16 v86, v2

    .line 1183
    invoke-virtual {v14, v13}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v2

    float-to-int v2, v2

    int-to-float v2, v2

    cmpg-float v87, v10, v0

    if-gez v87, :cond_33

    move/from16 v87, v0

    move/from16 v0, v66

    move/from16 v66, v3

    int-to-float v3, v0

    cmpg-float v3, v3, v2

    if-gez v3, :cond_34

    const/4 v3, 0x1

    move/from16 v3, v76

    move/from16 v76, v0

    move/from16 v0, v70

    const/16 v70, 0x1

    goto :goto_2b

    :cond_33
    move/from16 v87, v0

    move/from16 v0, v66

    move/from16 v66, v3

    :cond_34
    const/4 v3, 0x0

    move/from16 v3, v76

    move/from16 v76, v0

    move/from16 v0, v70

    const/16 v70, 0x0

    :goto_2b
    if-eq v3, v0, :cond_37

    if-ltz v3, :cond_37

    if-ltz v0, :cond_37

    if-gt v1, v3, :cond_35

    if-lt v3, v12, :cond_36

    :cond_35
    if-gt v3, v1, :cond_37

    if-ge v1, v0, :cond_37

    :cond_36
    move-object/from16 v88, v4

    move/from16 v91, v5

    move/from16 v92, v6

    move/from16 v89, v13

    move/from16 v90, v26

    move-object/from16 v13, v38

    move/from16 v14, v86

    move/from16 v26, v2

    move/from16 v86, v9

    move-object/from16 v38, v15

    move v15, v1

    move v9, v3

    :goto_2c
    move/from16 v101, v66

    move-object/from16 v66, v11

    move/from16 v11, v101

    goto/16 :goto_2d

    :cond_37
    move/from16 v88, v1

    .line 1195
    iget v1, v15, Ll/ۨܰᩳ;->᩹:I

    move/from16 v89, v13

    move/from16 v13, v17

    if-ne v13, v1, :cond_39

    iget-boolean v1, v11, Ll/᩺֫ܿ;->ܶۧ:Z

    if-eqz v1, :cond_38

    iget-boolean v1, v11, Ll/᩺֫ܿ;->᩺֫:Z

    if-eqz v1, :cond_39

    .line 1197
    :cond_38
    iget v1, v11, Ll/᩺֫ܿ;->ܳ֫:I

    move/from16 v17, v13

    move-object/from16 v13, v38

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v38, v15

    move/from16 v15, v88

    move-object/from16 v1, p1

    move/from16 v90, v26

    move/from16 v14, v86

    move/from16 v26, v2

    move/from16 v2, v83

    move/from16 v86, v9

    move v9, v3

    move/from16 v101, v66

    move-object/from16 v66, v11

    move/from16 v11, v101

    move v3, v10

    move-object/from16 v88, v4

    move/from16 v4, v84

    move/from16 v91, v5

    move/from16 v5, v26

    move/from16 v92, v6

    move-object v6, v13

    .line 1198
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object/from16 v93, v71

    goto/16 :goto_31

    :cond_39
    move/from16 v91, v5

    move/from16 v92, v6

    move/from16 v17, v13

    move/from16 v90, v26

    move-object/from16 v13, v38

    move/from16 v14, v86

    move/from16 v26, v2

    move/from16 v86, v9

    move-object/from16 v38, v15

    move/from16 v15, v88

    move v9, v3

    move-object/from16 v88, v4

    goto :goto_2c

    :goto_2d
    if-nez v40, :cond_3b

    if-eqz v50, :cond_3b

    move-object/from16 v6, p9

    move-object/from16 v5, v71

    if-eq v11, v7, :cond_3a

    .line 1205
    invoke-virtual {v6, v15, v12, v5}, Ll/ۜܺܿ;->֫(IILjava/lang/CharSequence;)Ll/᩸᩷ܿ;

    move-result-object v22

    move v7, v11

    :cond_3a
    move-object/from16 v71, v22

    goto :goto_2e

    :cond_3b
    move-object/from16 v6, p9

    move-object/from16 v5, v71

    move-object/from16 v71, v22

    move-object/from16 v22, v52

    :goto_2e
    if-eqz v22, :cond_41

    .line 1214
    invoke-virtual/range {v22 .. v22}, Ll/᩸᩷ܿ;->ۖ()I

    move-result v1

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move/from16 v2, v83

    move v3, v10

    move/from16 v4, v84

    move-object/from16 v93, v5

    move/from16 v5, v26

    move-object v6, v13

    .line 1215
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-eq v9, v0, :cond_42

    if-ltz v9, :cond_42

    if-ltz v0, :cond_42

    if-gt v8, v9, :cond_3c

    if-ge v14, v9, :cond_3e

    :cond_3c
    if-gt v8, v0, :cond_3d

    if-ge v14, v0, :cond_3e

    :cond_3d
    if-le v8, v9, :cond_42

    if-ge v14, v0, :cond_42

    :cond_3e
    const/4 v1, 0x0

    if-ge v8, v9, :cond_3f

    move-object/from16 v6, p3

    .line 1221
    invoke-virtual {v6, v8, v1, v9}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v2

    goto :goto_2f

    :cond_3f
    move-object/from16 v6, p3

    move/from16 v2, v83

    :goto_2f
    if-ge v14, v0, :cond_40

    move-object/from16 v5, v66

    move/from16 v4, v84

    goto :goto_30

    .line 1222
    :cond_40
    invoke-virtual {v6, v8, v1, v0}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v1

    move v4, v1

    move-object/from16 v5, v66

    .line 1223
    :goto_30
    iget v1, v5, Ll/᩺֫ܿ;->ܽ֫:I

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move v3, v10

    move-object/from16 v66, v5

    move/from16 v5, v26

    move-object/from16 p3, v6

    move-object v6, v13

    .line 1224
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_32

    :cond_41
    move-object/from16 v93, v5

    :cond_42
    move-object/from16 v22, v71

    :goto_31
    move-object/from16 v71, v22

    :goto_32
    move/from16 v22, v7

    if-lez v86, :cond_46

    const/4 v1, 0x0

    move/from16 v6, v86

    const/4 v7, 0x0

    :goto_33
    if-ge v7, v6, :cond_45

    move-object/from16 v5, v85

    .line 1234
    invoke-virtual {v5, v7}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v1

    move/from16 v4, v43

    if-ge v1, v4, :cond_43

    move/from16 v85, v4

    move-object/from16 v43, v5

    move/from16 v86, v6

    goto :goto_34

    :cond_43
    if-le v1, v4, :cond_44

    move-object/from16 v43, v5

    move/from16 v86, v6

    goto :goto_35

    :cond_44
    add-int/lit8 v1, v7, 0x1

    .line 1242
    invoke-virtual {v5, v1}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float v2, v1, p5

    add-int/lit8 v1, v7, 0x2

    .line 1243
    invoke-virtual {v5, v1}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float v43, v1, p5

    add-int/lit8 v1, v7, 0x3

    .line 1244
    invoke-virtual {v5, v1}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v1

    .line 1245
    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move v3, v10

    move/from16 v85, v4

    move/from16 v4, v43

    move-object/from16 v43, v5

    move/from16 v5, v26

    move/from16 v86, v6

    move-object v6, v13

    .line 1246
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_34
    add-int/lit8 v7, v7, 0x4

    move/from16 v6, v86

    move/from16 v101, v85

    move-object/from16 v85, v43

    move/from16 v43, v101

    goto :goto_33

    :cond_45
    move/from16 v86, v6

    :cond_46
    move-object/from16 v43, v85

    :goto_35
    if-eqz v51, :cond_47

    move-object/from16 v1, p10

    move-object/from16 v2, p1

    move v3, v8

    move v4, v14

    move v5, v10

    move/from16 v6, v26

    move-object v7, v13

    move-object/from16 v94, v82

    move/from16 v82, v8

    move-object/from16 v8, v66

    move/from16 v85, v11

    move v11, v9

    move-object/from16 v9, p3

    .line 1251
    invoke-virtual/range {v1 .. v9}, Ll/ۜ֫ܿ;->֫(Landroid/graphics/Canvas;IIFFLl/֫ۖܽ;Ll/᩺֫ܿ;Ll/ۧۧܿ;)V

    goto :goto_36

    :cond_47
    move/from16 v85, v11

    move-object/from16 v94, v82

    move/from16 v82, v8

    move v11, v9

    .line 1254
    :goto_36
    invoke-virtual/range {p11 .. p11}, Ll/᩻۫ᩳ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_48

    move-object/from16 v1, p11

    move-object/from16 v2, p1

    move/from16 v3, v82

    move v4, v14

    move v5, v10

    move/from16 v6, v26

    move-object v7, v13

    move-object/from16 v8, v66

    move-object/from16 v9, p3

    .line 1255
    invoke-virtual/range {v1 .. v9}, Ll/᩻۫ᩳ;->֫(Landroid/graphics/Canvas;IIFFLl/֫ۖܽ;Ll/᩺֫ܿ;Ll/ۧۧܿ;)V

    :cond_48
    if-eqz v37, :cond_60

    move/from16 v9, v19

    move/from16 v7, v82

    if-gt v7, v9, :cond_4a

    if-ge v14, v9, :cond_49

    goto :goto_37

    :cond_49
    move/from16 v8, v79

    goto :goto_38

    :cond_4a
    :goto_37
    move/from16 v8, v79

    if-gt v7, v8, :cond_4b

    if-ge v14, v8, :cond_4c

    :cond_4b
    if-le v7, v9, :cond_5f

    if-ge v14, v8, :cond_5f

    .line 1266
    :cond_4c
    :goto_38
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1267
    invoke-static {v14, v8}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    move-object/from16 v6, p3

    .line 1268
    invoke-virtual {v6, v7, v3, v1}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v19

    .line 1269
    invoke-virtual {v6, v7, v3, v2}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v1

    if-ge v14, v8, :cond_4e

    if-nez v41, :cond_4d

    if-ne v14, v12, :cond_4e

    :cond_4d
    move-object/from16 v5, v66

    .line 1272
    iget v2, v5, Ll/᩺֫ܿ;->ᩳ֫:F

    add-float/2addr v1, v2

    goto :goto_39

    :cond_4e
    move-object/from16 v5, v66

    :goto_39
    move/from16 v4, v58

    move/from16 v58, v1

    .line 1274
    invoke-virtual {v13, v4}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move/from16 v2, v19

    move v3, v10

    move/from16 v66, v4

    move/from16 v4, v58

    move/from16 v79, v14

    move-object v14, v5

    move/from16 v5, v26

    move/from16 v82, v10

    move-object v10, v6

    move-object v6, v13

    .line 1275
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/high16 v1, 0x3f400000    # 0.75f

    if-lt v9, v7, :cond_57

    const/high16 v2, 0x3e800000    # 0.25f

    if-eqz v41, :cond_4f

    move-object/from16 v6, p0

    move/from16 v5, v79

    goto :goto_3a

    :cond_4f
    move-object/from16 v6, p0

    move/from16 v5, v79

    .line 1283
    iget-boolean v3, v6, Ll/ۗۤᩳ;->ܿ֫:Z

    if-eqz v3, :cond_50

    if-ne v9, v5, :cond_52

    if-lt v9, v12, :cond_51

    goto :goto_3a

    :cond_50
    if-ne v9, v7, :cond_52

    if-gt v9, v15, :cond_51

    goto :goto_3a

    :cond_51
    const/4 v3, 0x0

    goto :goto_3b

    :cond_52
    :goto_3a
    const/4 v3, 0x1

    :goto_3b
    if-eqz v3, :cond_54

    if-eqz v70, :cond_53

    cmpg-float v4, v83, v19

    if-gtz v4, :cond_53

    cmpg-float v4, v19, v84

    if-gtz v4, :cond_53

    const/16 v18, 0x1

    goto :goto_3c

    :cond_53
    const/4 v3, 0x0

    :cond_54
    :goto_3c
    if-eqz v3, :cond_55

    move-object/from16 v4, p8

    .line 1299
    iget-boolean v3, v4, Ll/᩹ۤᩳ;->ܳ:Z

    if-eqz v3, :cond_56

    .line 1300
    iget-object v3, v14, Ll/᩺֫ܿ;->ᩳܽ:Landroid/graphics/drawable/Drawable;

    move/from16 v79, v9

    .line 1301
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v9

    int-to-float v9, v9

    mul-float v88, v9, v1

    sub-float v88, v19, v88

    mul-float v95, v16, v77

    sub-float v88, v88, v95

    add-float v88, v88, p5

    add-float v1, v88, v59

    mul-float v9, v9, v2

    add-float v9, v9, v19

    sub-float v9, v9, v95

    add-float v9, v9, p5

    add-float v9, v9, v59

    move/from16 v19, v2

    .line 1306
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    int-to-float v2, v2

    move-object/from16 v95, v13

    move/from16 v13, v26

    add-float/2addr v2, v13

    move-object/from16 v26, v10

    move-object/from16 v10, v81

    .line 1307
    invoke-virtual {v10, v1, v13, v9, v2}, Landroid/graphics/RectF;->set(FFFF)V

    float-to-int v1, v1

    float-to-int v10, v13

    move/from16 v96, v13

    move-object/from16 v81, v14

    float-to-double v13, v9

    .line 1308
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v13

    double-to-int v9, v13

    float-to-double v13, v2

    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v13

    double-to-int v2, v13

    invoke-virtual {v3, v1, v10, v9, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    move-object/from16 v88, v3

    :goto_3d
    move/from16 v2, v19

    goto :goto_3e

    :cond_55
    move-object/from16 v4, p8

    :cond_56
    move/from16 v19, v2

    move/from16 v79, v9

    move-object/from16 v95, v13

    move-object/from16 v81, v14

    move/from16 v96, v26

    move-object/from16 v26, v10

    goto :goto_3d

    :cond_57
    move-object/from16 v6, p0

    move-object/from16 v4, p8

    move-object/from16 v95, v13

    move-object/from16 v81, v14

    move/from16 v96, v26

    move/from16 v5, v79

    move/from16 v79, v9

    move-object/from16 v26, v10

    const/high16 v2, 0x3e800000    # 0.25f

    :goto_3e
    if-gt v8, v5, :cond_5e

    if-eqz v41, :cond_58

    goto :goto_3f

    .line 1317
    :cond_58
    iget-boolean v1, v6, Ll/ۗۤᩳ;->ܿ֫:Z

    if-eqz v1, :cond_59

    if-ne v8, v5, :cond_5b

    if-lt v8, v12, :cond_5a

    goto :goto_3f

    :cond_59
    if-ne v8, v7, :cond_5b

    if-gt v8, v15, :cond_5a

    goto :goto_3f

    :cond_5a
    const/4 v1, 0x0

    goto :goto_40

    :cond_5b
    :goto_3f
    const/4 v1, 0x1

    :goto_40
    if-eqz v1, :cond_5d

    if-eqz v70, :cond_5c

    cmpg-float v3, v83, v58

    if-gtz v3, :cond_5c

    cmpg-float v3, v58, v84

    if-gtz v3, :cond_5c

    const/4 v3, 0x1

    const/16 v21, 0x1

    goto :goto_41

    :cond_5c
    const/4 v1, 0x0

    :cond_5d
    :goto_41
    if-eqz v1, :cond_5e

    .line 1333
    iget-boolean v1, v4, Ll/᩹ۤᩳ;->ܳ:Z

    if-eqz v1, :cond_5e

    move-object/from16 v13, v81

    .line 1334
    iget-object v1, v13, Ll/᩺֫ܿ;->ܿܽ:Landroid/graphics/drawable/Drawable;

    .line 1335
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    mul-float v2, v2, v3

    sub-float v2, v58, v2

    mul-float v9, v16, v77

    add-float/2addr v2, v9

    add-float v2, v2, p5

    add-float v2, v2, v59

    const/high16 v10, 0x3f400000    # 0.75f

    mul-float v3, v3, v10

    add-float v3, v3, v58

    add-float/2addr v3, v9

    add-float v3, v3, p5

    add-float v3, v3, v59

    .line 1340
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v9

    int-to-float v9, v9

    add-float v9, v9, v96

    move-object/from16 v14, v23

    move/from16 v10, v96

    .line 1341
    invoke-virtual {v14, v2, v10, v3, v9}, Landroid/graphics/RectF;->set(FFFF)V

    float-to-int v2, v2

    float-to-int v14, v10

    float-to-double v3, v3

    .line 1342
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    move/from16 v19, v8

    float-to-double v8, v9

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v4, v8

    invoke-virtual {v1, v2, v14, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    move-object v14, v1

    goto :goto_43

    :cond_5e
    move/from16 v19, v8

    move-object/from16 v13, v81

    move/from16 v10, v96

    goto :goto_42

    :cond_5f
    move-object/from16 v6, p0

    move/from16 v19, v8

    move/from16 v79, v9

    move/from16 v82, v10

    move-object/from16 v95, v13

    move v5, v14

    move/from16 v10, v26

    move-object/from16 v13, v66

    move-object/from16 v26, p3

    move/from16 v66, v58

    goto :goto_42

    :cond_60
    move-object/from16 v6, p0

    move-object/from16 v95, v13

    move v5, v14

    move-object/from16 v13, v66

    move/from16 v7, v82

    move/from16 v82, v10

    move/from16 v10, v26

    move/from16 v66, v58

    move-object/from16 v26, p3

    move/from16 v101, v79

    move/from16 v79, v19

    move/from16 v19, v101

    :goto_42
    move-object/from16 v14, p4

    :goto_43
    if-eq v11, v0, :cond_66

    if-ltz v11, :cond_66

    if-ltz v0, :cond_66

    if-gt v7, v11, :cond_61

    if-ge v5, v11, :cond_63

    :cond_61
    if-gt v7, v0, :cond_62

    if-ge v5, v0, :cond_63

    :cond_62
    if-le v7, v11, :cond_66

    if-ge v5, v0, :cond_66

    :cond_63
    const/4 v1, 0x0

    if-ge v7, v11, :cond_64

    move-object/from16 v9, v26

    .line 1353
    invoke-virtual {v9, v7, v1, v11}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v2

    goto :goto_44

    :cond_64
    move-object/from16 v9, v26

    move/from16 v2, v83

    :goto_44
    if-ge v5, v0, :cond_65

    move/from16 v4, v84

    goto :goto_45

    .line 1354
    :cond_65
    invoke-virtual {v9, v7, v1, v0}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v1

    move v4, v1

    .line 1355
    :goto_45
    iget v1, v13, Ll/᩺֫ܿ;->ۚۧ:I

    move-object/from16 v8, v95

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move/from16 v3, v82

    move/from16 v70, v0

    move-object/from16 v0, p8

    move-object/from16 p3, v9

    move v9, v5

    move v5, v10

    move/from16 v23, v12

    move-object v12, v6

    move-object v6, v8

    .line 1356
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_46

    :cond_66
    move/from16 v70, v0

    move v9, v5

    move/from16 v23, v12

    move-object/from16 p3, v26

    move-object/from16 v8, v95

    move-object/from16 v0, p8

    move-object v12, v6

    :goto_46
    if-eqz v25, :cond_6b

    move-object/from16 v6, v65

    .line 1364
    iget v1, v6, Ll/ᩴܰᩳ;->ۧ:I

    move-object/from16 v2, v38

    iget v2, v2, Ll/ۨܰᩳ;->᩹:I

    if-gt v1, v2, :cond_67

    iget v1, v6, Ll/ᩴܰᩳ;->ܽ:I

    if-ge v2, v1, :cond_67

    .line 1365
    iget v1, v6, Ll/ᩴܰᩳ;->ܿ:I

    move v5, v1

    goto :goto_47

    :cond_67
    const/4 v1, -0x1

    const/4 v5, -0x1

    :goto_47
    move-object/from16 v4, v34

    .line 1367
    invoke-virtual {v4, v2}, Ll/֨ܰᩳ;->ܽ(I)Z

    move-result v1

    if-eqz v1, :cond_6a

    .line 1368
    invoke-virtual {v4}, Ll/֨ܰᩳ;->ۧ()I

    move-result v3

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_48
    if-ge v2, v3, :cond_6a

    .line 1369
    invoke-virtual {v4, v2}, Ll/֨ܰᩳ;->ۧ(I)I

    move-result v1

    if-ne v5, v1, :cond_68

    const/16 v26, 0x1

    goto :goto_49

    :cond_68
    const/16 v26, 0x0

    :goto_49
    int-to-float v1, v1

    .line 1371
    invoke-virtual {v13}, Ll/ۢ۫ۡ;->ۢ()F

    move-result v34

    mul-float v1, v1, v34

    float-to-int v1, v1

    move-object/from16 p4, v14

    move/from16 v14, v90

    sub-int/2addr v1, v14

    move/from16 v34, v11

    add-int/lit8 v11, v1, -0x1

    move/from16 v38, v2

    .line 1373
    iget v2, v13, Ll/᩺֫ܿ;->ܽ֫:I

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v2, v1

    move-object/from16 v1, p1

    move/from16 v58, v2

    move/from16 v65, v3

    move/from16 v3, v82

    move-object/from16 v81, v4

    move/from16 v4, v58

    move/from16 v58, v5

    move v5, v10

    move-object/from16 v83, v6

    move-object v6, v8

    .line 1374
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    if-eqz v26, :cond_69

    .line 1376
    iget v1, v13, Ll/᩺֫ܿ;->֫ۧ:I

    goto :goto_4a

    :cond_69
    iget v1, v13, Ll/᩺֫ܿ;->۟֫:I

    :goto_4a
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v4, v11

    move-object/from16 v1, p1

    move v2, v4

    move/from16 v3, v82

    move v5, v10

    move-object v6, v8

    .line 1377
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v2, v38, 0x1

    move/from16 v90, v14

    move/from16 v11, v34

    move/from16 v5, v58

    move/from16 v3, v65

    move-object/from16 v4, v81

    move-object/from16 v6, v83

    move-object/from16 v14, p4

    goto :goto_48

    :cond_6a
    move-object/from16 v81, v4

    move-object/from16 v83, v6

    move/from16 v34, v11

    move-object/from16 p4, v14

    move/from16 v14, v90

    goto :goto_4b

    :cond_6b
    move-object/from16 p4, v14

    move-object/from16 v81, v34

    move-object/from16 v83, v65

    move/from16 v14, v90

    move/from16 v34, v11

    :goto_4b
    if-nez v40, :cond_6c

    if-eqz v50, :cond_6c

    if-ge v7, v9, :cond_6c

    sub-int v11, v44, v14

    move-object/from16 v1, p9

    move-object/from16 v2, p1

    move-object/from16 v3, v93

    move v4, v7

    move v5, v9

    move/from16 v6, v91

    move v7, v10

    move-object v10, v8

    move/from16 v9, v19

    move v8, v11

    move-object/from16 v19, p3

    move v0, v9

    move/from16 v11, v79

    move-object/from16 v9, v53

    move-object/from16 v38, v10

    move-object/from16 v97, v19

    move-object/from16 v19, v43

    move-object v10, v13

    move/from16 v26, v15

    move/from16 v43, v85

    move v15, v11

    move-object/from16 v11, v49

    .line 1382
    invoke-virtual/range {v1 .. v11}, Ll/ۜܺܿ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFILl/֫ۖܽ;Ll/᩺֫ܿ;[I)V

    goto :goto_4c

    :cond_6c
    move-object/from16 v97, p3

    move-object/from16 v38, v8

    move/from16 v26, v15

    move/from16 v0, v19

    move-object/from16 v19, v43

    move/from16 v15, v79

    move/from16 v43, v85

    :goto_4c
    move/from16 v6, v89

    .line 1386
    invoke-virtual {v12, v6}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v5

    neg-int v1, v14

    int-to-float v1, v1

    const/4 v2, 0x0

    move-object/from16 v4, p1

    .line 1388
    invoke-virtual {v4, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    add-int/lit8 v6, v92, 0x1

    move/from16 v79, v0

    move-object v11, v13

    move-object/from16 v10, v19

    move/from16 v7, v22

    move/from16 v3, v23

    move-object/from16 v13, v24

    move/from16 v2, v26

    move/from16 v1, v43

    move/from16 v14, v60

    move/from16 v58, v66

    move-object/from16 v22, v71

    move/from16 v66, v76

    move-object/from16 v65, v83

    move/from16 v9, v86

    move/from16 v0, v87

    move-object/from16 v4, v88

    move-object/from16 v71, v93

    move-object/from16 v8, v94

    move-object/from16 p3, v97

    move/from16 v19, v15

    move/from16 v76, v34

    move-object/from16 v34, v81

    move-object v15, v12

    move/from16 v12, v80

    goto/16 :goto_27

    :cond_6d
    move-object/from16 v97, p3

    move/from16 v87, v0

    move/from16 p5, v2

    move-object/from16 v88, v4

    move-object/from16 v94, v8

    move/from16 v86, v9

    move/from16 v80, v12

    move-object/from16 v24, v13

    move-object v12, v15

    move/from16 v15, v19

    move/from16 v76, v66

    move-object/from16 v93, v71

    move/from16 v0, v79

    move-object/from16 v4, p1

    move-object/from16 v19, v10

    move-object v13, v11

    move-object v10, v14

    move-object/from16 v14, v23

    if-lez v86, :cond_6e

    .line 1392
    invoke-virtual/range {v19 .. v19}, Ll/ܺۢᩴ;->clear()V

    .line 1401
    :cond_6e
    iget-boolean v1, v13, Ll/᩺֫ܿ;->ܿ֫:Z

    if-eqz v1, :cond_70

    .line 1404
    iget-boolean v1, v13, Ll/᩺֫ܿ;->᩷ۧ:Z

    if-eqz v1, :cond_6f

    move/from16 v1, v73

    int-to-float v2, v1

    add-float v6, v57, v2

    move/from16 v11, v75

    add-int/2addr v1, v11

    goto :goto_4d

    :cond_6f
    move/from16 v1, v73

    move/from16 v11, v75

    add-int v2, v11, v1

    int-to-float v2, v2

    add-float v6, v57, v2

    :goto_4d
    int-to-float v1, v1

    sub-float v5, v56, v1

    move/from16 v1, v20

    move/from16 v9, v87

    .line 1411
    invoke-virtual {v4, v6, v1, v5, v9}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    goto :goto_4e

    :cond_70
    move/from16 v11, v75

    move/from16 v9, v87

    :goto_4e
    move/from16 v1, v60

    .line 1414
    invoke-virtual {v12, v1}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v2

    add-float v5, v2, v28

    if-lez v1, :cond_71

    add-int/lit8 v3, v1, -0x1

    move-object/from16 v6, v24

    .line 1418
    invoke-virtual {v6, v3}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v7

    .line 1419
    invoke-virtual {v6, v3}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result v8

    invoke-virtual {v6, v8}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v8

    .line 1420
    invoke-virtual {v6, v3}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result v3

    invoke-virtual {v6, v3}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v3

    goto :goto_4f

    :cond_71
    move-object/from16 v6, v24

    const/4 v7, -0x1

    move/from16 v8, p5

    :goto_4f
    move/from16 v34, v5

    move v5, v8

    move/from16 v75, v11

    move/from16 v49, v21

    move-object/from16 p3, v52

    move v8, v1

    move-object v1, v12

    move/from16 v12, v18

    .line 1425
    :goto_50
    iget-object v11, v1, Ll/ۗۤᩳ;->ۜ֫:Landroid/graphics/RectF;

    const/high16 v51, 0x40400000    # 3.0f

    const v52, 0xffffff

    move/from16 v58, v12

    move/from16 v12, v80

    if-gt v8, v12, :cond_96

    move/from16 p5, v3

    move/from16 v80, v12

    move-object/from16 v12, v94

    .line 1426
    invoke-virtual {v12, v8}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v3

    move/from16 p10, v5

    .line 1429
    invoke-virtual {v6}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v5

    if-ge v8, v5, :cond_72

    add-int/lit8 v5, v8, 0x1

    invoke-virtual {v6, v5}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v5

    move-object/from16 v81, v10

    iget v10, v3, Ll/ۨܰᩳ;->᩹:I

    if-ne v5, v10, :cond_73

    const/4 v5, 0x1

    const/16 v60, 0x1

    goto :goto_51

    :cond_72
    move-object/from16 v81, v10

    :cond_73
    const/4 v5, 0x0

    const/16 v60, 0x0

    .line 1433
    :goto_51
    iget v5, v3, Ll/ۨܰᩳ;->᩹:I

    if-ne v7, v5, :cond_75

    .line 1434
    invoke-virtual {v1}, Ll/ۗۤᩳ;->֨()Z

    move-result v5

    if-nez v5, :cond_74

    const/4 v5, 0x0

    goto :goto_52

    :cond_74
    move/from16 v5, v72

    :goto_52
    move/from16 v10, p5

    move/from16 v65, v7

    move-object/from16 v94, v12

    move v7, v5

    move/from16 v5, p10

    goto :goto_53

    .line 1438
    :cond_75
    invoke-virtual {v6, v8}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result v7

    invoke-virtual {v6, v7}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v7

    .line 1439
    invoke-virtual {v6, v8}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result v10

    invoke-virtual {v6, v10}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v10

    const/16 v16, 0x0

    move/from16 v65, v5

    move v5, v7

    move-object/from16 v94, v12

    const/4 v7, 0x0

    :goto_53
    int-to-float v12, v7

    move-object/from16 v24, v6

    const/4 v6, 0x0

    .line 1442
    invoke-virtual {v4, v12, v6}, Landroid/graphics/Canvas;->translate(FF)V

    sub-float v66, v57, v12

    sub-float v70, v56, v12

    .line 1447
    invoke-virtual {v3}, Ll/ۨܰᩳ;->ܽ()Z

    move-result v71

    .line 1448
    iget v6, v3, Ll/ۨܰᩳ;->᩶:I

    if-eqz v71, :cond_76

    add-int v3, v6, v43

    goto :goto_54

    .line 1449
    :cond_76
    iget v3, v3, Ll/ۨܰᩳ;->᩸:I

    :goto_54
    float-to-int v2, v2

    int-to-float v2, v2

    move-object/from16 v73, v11

    add-int/lit8 v11, v8, 0x1

    move/from16 v79, v8

    .line 1451
    invoke-virtual {v1, v11}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v8

    float-to-int v8, v8

    int-to-float v8, v8

    cmpg-float v16, v2, v9

    move/from16 v87, v9

    move/from16 p5, v11

    move/from16 v11, v76

    if-gez v16, :cond_77

    int-to-float v9, v11

    cmpg-float v9, v9, v8

    if-gez v9, :cond_77

    const/4 v9, 0x1

    const/16 v76, 0x1

    goto :goto_55

    :cond_77
    const/4 v9, 0x0

    const/16 v76, 0x0

    :goto_55
    if-eq v6, v3, :cond_82

    if-nez v29, :cond_7c

    .line 1457
    iget-boolean v9, v13, Ll/᩺֫ܿ;->ܶۧ:Z

    if-eqz v9, :cond_78

    iget-boolean v9, v13, Ll/᩺֫ܿ;->᩺֫:Z

    if-eqz v9, :cond_7c

    :cond_78
    if-gt v5, v15, :cond_79

    if-le v15, v10, :cond_7c

    :cond_79
    if-gt v5, v0, :cond_7a

    if-le v0, v10, :cond_7c

    :cond_7a
    if-ge v15, v5, :cond_7b

    if-ge v10, v0, :cond_7b

    goto :goto_56

    :cond_7b
    const/4 v9, 0x0

    const/16 v82, 0x0

    goto :goto_57

    :cond_7c
    :goto_56
    const/4 v9, 0x1

    const/16 v82, 0x1

    :goto_57
    const/high16 v83, 0x40000000    # 2.0f

    if-eqz v82, :cond_7d

    if-lez v7, :cond_7d

    move/from16 v9, v72

    move/from16 v72, v0

    int-to-float v0, v9

    sub-float v16, v27, v0

    div-float v16, v16, v83

    move/from16 v84, v5

    add-float v5, v16, v2

    add-float/2addr v0, v5

    move/from16 v85, v2

    neg-int v2, v9

    int-to-float v2, v2

    float-to-int v2, v2

    float-to-int v5, v5

    move/from16 v86, v8

    const/4 v8, 0x0

    move/from16 v89, v9

    float-to-double v8, v8

    .line 1471
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v8, v8

    move/from16 v90, v10

    float-to-double v9, v0

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-int v0, v9

    move-object/from16 v10, v68

    invoke-virtual {v10, v2, v5, v8, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1472
    invoke-virtual {v10, v4}, Ll/᩹᩺ۧ;->draw(Landroid/graphics/Canvas;)V

    goto :goto_58

    :cond_7d
    move/from16 v85, v2

    move/from16 v84, v5

    move/from16 v86, v8

    move/from16 v90, v10

    move-object/from16 v10, v68

    move/from16 v89, v72

    move/from16 v72, v0

    :goto_58
    sub-int v21, v55, v7

    sub-int v0, v44, v7

    if-eqz v40, :cond_7e

    .line 1481
    iget v2, v13, Ll/᩺֫ܿ;->ܰ֫:I

    move-object/from16 v9, v53

    invoke-virtual {v9, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 1482
    iget-object v1, v1, Ll/ۗۤᩳ;->۠:Ljava/lang/String;

    const/16 v26, 0x0

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    move-object/from16 v8, p0

    move-object v2, v14

    move v5, v15

    move-object/from16 v53, v30

    move-object/from16 v15, v81

    move-object/from16 v30, v24

    move-object v14, v13

    move/from16 v68, v11

    move-object v11, v15

    move-object/from16 v15, p1

    move-object/from16 v16, v1

    move/from16 v17, v6

    move/from16 v18, v3

    move/from16 v20, v34

    move/from16 v22, v0

    move-object/from16 v24, v9

    .line 1111
    invoke-virtual/range {v14 .. v26}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFIIFLandroid/graphics/Paint;IZ)F

    move-object v8, v2

    move/from16 p10, v6

    move/from16 v99, v7

    move/from16 v91, v12

    move/from16 v98, v84

    move/from16 v81, v85

    move/from16 v12, v89

    move/from16 v84, v5

    move-object/from16 v89, v10

    move-object/from16 v85, v11

    move-object v11, v4

    move-object v10, v9

    move v9, v3

    goto/16 :goto_59

    :cond_7e
    move-object/from16 v8, p0

    move/from16 v68, v11

    move-object v2, v14

    move v5, v15

    move-object/from16 v9, v53

    move-object/from16 v11, v81

    move-object/from16 v53, v30

    move-object/from16 v30, v24

    if-eqz v50, :cond_7f

    move-object/from16 v1, p9

    move-object v15, v2

    move/from16 v81, v85

    move-object/from16 v2, p1

    move v14, v3

    move-object/from16 v3, v93

    move-object/from16 v85, v11

    move-object v11, v4

    move v4, v6

    move/from16 v91, v12

    move/from16 v98, v84

    move v12, v5

    move v5, v14

    move/from16 p10, v6

    move/from16 v6, v34

    move/from16 v99, v7

    move/from16 v7, v21

    move v8, v0

    move-object/from16 p11, v9

    move/from16 v84, v12

    move/from16 v12, v89

    move-object/from16 v89, v10

    move-object v10, v13

    .line 1485
    invoke-virtual/range {v1 .. v10}, Ll/ۜܺܿ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIILl/֫ۖܽ;Ll/᩺֫ܿ;)V

    move-object/from16 v10, p11

    move v9, v14

    move-object v8, v15

    goto :goto_59

    :cond_7f
    move-object v15, v2

    move v14, v3

    move/from16 p10, v6

    move/from16 v99, v7

    move-object/from16 p11, v9

    move/from16 v91, v12

    move/from16 v98, v84

    move/from16 v81, v85

    move/from16 v12, v89

    move/from16 v84, v5

    move-object/from16 v89, v10

    move-object/from16 v85, v11

    move-object v11, v4

    .line 1488
    invoke-virtual {v13}, Ll/ۢ۫ۡ;->ܺ()I

    move-result v1

    move-object/from16 v10, p11

    invoke-virtual {v10, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/16 v26, 0x0

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    move v9, v14

    move-object v14, v13

    move-object v8, v15

    move-object/from16 v15, p1

    move-object/from16 v16, v93

    move/from16 v17, p10

    move/from16 v18, v9

    move/from16 v20, v34

    move/from16 v22, v0

    move-object/from16 v24, v10

    .line 1111
    invoke-virtual/range {v14 .. v26}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFIIFLandroid/graphics/Paint;IZ)F

    :goto_59
    if-eqz v71, :cond_80

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, v79

    move/from16 v4, v34

    move v5, v0

    move-object v6, v10

    .line 1493
    invoke-virtual/range {v1 .. v6}, Ll/ۗۤᩳ;->֫(Landroid/graphics/Canvas;IFILl/֫ۖܽ;)V

    :cond_80
    if-eqz v82, :cond_81

    .line 1498
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_81

    if-eqz v60, :cond_81

    int-to-float v0, v12

    sub-float v1, v27, v0

    div-float v1, v1, v83

    add-float v1, v1, v81

    add-float v2, v1, v0

    const/4 v3, 0x0

    move/from16 v15, p10

    move-object/from16 v14, v97

    .line 1501
    invoke-virtual {v14, v15, v3, v9}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v3

    add-float v3, v3, v51

    add-float/2addr v0, v3

    float-to-int v3, v3

    float-to-int v1, v1

    float-to-double v4, v0

    .line 1503
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v0, v4

    float-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v2, v4

    move-object/from16 v7, v69

    invoke-virtual {v7, v3, v1, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1504
    invoke-virtual {v7, v11}, Ll/᩹᩺ۧ;->draw(Landroid/graphics/Canvas;)V

    goto :goto_5a

    :cond_81
    move/from16 v15, p10

    move-object/from16 v7, v69

    move-object/from16 v14, v97

    :goto_5a
    move-object/from16 v0, p0

    goto :goto_5b

    :cond_82
    move v9, v3

    move/from16 v98, v5

    move/from16 v99, v7

    move/from16 v86, v8

    move/from16 v90, v10

    move/from16 v91, v12

    move-object v8, v14

    move/from16 v84, v15

    move-object/from16 v10, v53

    move-object/from16 v89, v68

    move-object/from16 v7, v69

    move/from16 v12, v72

    move-object/from16 v85, v81

    move-object/from16 v14, v97

    move/from16 v72, v0

    move/from16 v81, v2

    move v15, v6

    move/from16 v68, v11

    move-object/from16 v53, v30

    move-object v11, v4

    move-object/from16 v30, v24

    move-object v0, v1

    :goto_5b
    move-object/from16 v1, v32

    move-object/from16 v2, p1

    move v3, v15

    move v4, v9

    move/from16 v5, v90

    move/from16 v6, v81

    move-object/from16 v16, v7

    move/from16 v7, v42

    move/from16 v23, v12

    move-object v12, v8

    move-object/from16 v8, v38

    move/from16 p10, v9

    move-object v9, v14

    move-object/from16 v17, v12

    move-object v12, v10

    move-object v10, v13

    .line 1510
    invoke-virtual/range {v1 .. v10}, Ll/֫ܰᩳ;->֫(Landroid/graphics/Canvas;IIIFZLl/֫ۖܽ;Ll/ۧۧܿ;Ll/᩺֫ܿ;)V

    move-object/from16 v1, v53

    move/from16 v4, p10

    .line 1512
    invoke-virtual/range {v1 .. v10}, Ll/֫ܰᩳ;->֫(Landroid/graphics/Canvas;IIIFZLl/֫ۖܽ;Ll/ۧۧܿ;Ll/᩺֫ܿ;)V

    if-eqz v76, :cond_95

    .line 1516
    iget-boolean v1, v13, Ll/᩺֫ܿ;->ܶۧ:Z

    if-eqz v1, :cond_83

    iget-boolean v1, v13, Ll/᩺֫ܿ;->ۗۧ:Z

    if-eqz v1, :cond_95

    :cond_83
    if-nez v37, :cond_95

    move/from16 v7, v84

    if-gt v15, v7, :cond_94

    move/from16 v3, p10

    if-lt v3, v7, :cond_94

    if-eqz v41, :cond_85

    :cond_84
    move/from16 v10, v90

    goto :goto_5c

    .line 1521
    :cond_85
    iget-boolean v1, v0, Ll/ۗۤᩳ;->ܿ֫:Z

    if-eqz v1, :cond_88

    if-ne v7, v3, :cond_84

    move/from16 v10, v90

    if-lt v7, v10, :cond_86

    goto :goto_5c

    :cond_86
    move/from16 v8, v98

    goto :goto_5d

    :cond_87
    :goto_5c
    move/from16 v8, v98

    goto :goto_5e

    :cond_88
    move/from16 v10, v90

    if-ne v7, v15, :cond_87

    move/from16 v8, v98

    if-gt v7, v8, :cond_89

    goto :goto_5e

    :cond_89
    :goto_5d
    move-object/from16 v15, p8

    move/from16 v19, v7

    move/from16 v21, v63

    move/from16 v18, v72

    goto/16 :goto_65

    :goto_5e
    const/4 v1, 0x0

    .line 1527
    invoke-virtual {v14, v15, v1, v7}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v9

    add-int/lit8 v1, v9, 0x3

    int-to-float v1, v1

    cmpg-float v1, v66, v1

    if-gtz v1, :cond_8a

    int-to-float v2, v9

    cmpg-float v2, v2, v70

    if-gtz v2, :cond_8a

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object/from16 v15, p8

    move/from16 v18, v72

    const/16 v49, 0x1

    const/16 v58, 0x1

    goto :goto_5f

    :cond_8a
    move-object/from16 v15, p8

    move/from16 v18, v72

    .line 1533
    :goto_5f
    iget-boolean v2, v15, Ll/᩹ۤᩳ;->ܿ:Z

    if-nez v2, :cond_8b

    iget-boolean v3, v15, Ll/᩹ۤᩳ;->ܳ:Z

    if-eqz v3, :cond_93

    :cond_8b
    if-gtz v1, :cond_93

    int-to-float v6, v9

    cmpg-float v19, v6, v70

    if-gtz v19, :cond_93

    if-eqz v2, :cond_91

    if-eqz v50, :cond_8c

    .line 1542
    invoke-virtual {v13}, Ll/ۢ۫ۡ;->ܺ()I

    move-result v1

    move-object/from16 v5, p9

    move/from16 v4, v63

    invoke-virtual {v5, v4, v1}, Ll/ۜܺܿ;->֫(II)J

    move-result-wide v1

    goto :goto_60

    :cond_8c
    move-object/from16 v5, p9

    move/from16 v4, v63

    .line 1544
    invoke-virtual {v13}, Ll/ۢ۫ۡ;->ܺ()I

    move-result v1

    int-to-long v1, v1

    const-wide v20, 0xffffffffL

    and-long v1, v1, v20

    :goto_60
    move-wide v2, v1

    .line 1546
    iget-boolean v1, v15, Ll/᩹ۤᩳ;->᩻:Z

    const-wide v20, -0x100000000L

    and-long v20, v2, v20

    const-wide/16 v24, 0x0

    const/high16 v22, 0x60000000

    cmp-long v26, v20, v24

    if-nez v26, :cond_8e

    if-eqz v1, :cond_8d

    long-to-int v1, v2

    and-int v1, v1, v52

    or-int v1, v1, v22

    goto :goto_61

    :cond_8d
    long-to-int v1, v2

    .line 1550
    :goto_61
    invoke-virtual {v12, v1}, Landroid/graphics/Paint;->setColor(I)V

    add-int v1, v9, v36

    int-to-float v3, v1

    move-object/from16 v1, p1

    move v2, v6

    move/from16 v20, v3

    move/from16 v3, v81

    move/from16 v21, v4

    move/from16 v4, v20

    move/from16 v5, v86

    move/from16 v20, v6

    move-object v6, v12

    .line 1551
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_63

    :cond_8e
    move/from16 v21, v4

    move/from16 v20, v6

    long-to-int v4, v2

    if-eqz v1, :cond_8f

    and-int v4, v4, v52

    or-int v4, v4, v22

    .line 1554
    :cond_8f
    invoke-virtual {v12, v4}, Landroid/graphics/Paint;->setColor(I)V

    add-int v4, v9, v36

    int-to-float v6, v4

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-wide/from16 v25, v2

    move/from16 v2, v20

    move/from16 v3, v81

    move v4, v6

    move/from16 v5, v86

    move/from16 v34, v6

    move-object v6, v12

    .line 1555
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/16 v1, 0x20

    ushr-long v1, v25, v1

    if-eqz v24, :cond_90

    long-to-int v2, v1

    and-int v1, v2, v52

    or-int v1, v1, v22

    goto :goto_62

    :cond_90
    long-to-int v1, v1

    .line 1556
    :goto_62
    invoke-virtual {v12, v1}, Landroid/graphics/Paint;->setColor(I)V

    add-float v2, v20, v77

    move-object/from16 v1, p1

    move/from16 v3, v81

    move/from16 v4, v34

    move/from16 v5, v86

    move-object v6, v12

    .line 1557
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_63

    :cond_91
    move/from16 v20, v6

    move/from16 v21, v63

    :goto_63
    cmpg-float v1, v66, v20

    if-gtz v1, :cond_92

    if-gtz v19, :cond_92

    .line 1561
    iget-boolean v1, v15, Ll/᩹ۤᩳ;->ܳ:Z

    if-eqz v1, :cond_92

    .line 1562
    iget-object v1, v13, Ll/᩺֫ܿ;->֫ܽ:Landroid/graphics/drawable/Drawable;

    .line 1563
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int v3, v9, v2

    int-to-float v3, v3

    add-float v3, v3, v77

    add-float v3, v3, v91

    add-float v3, v3, v59

    add-int/2addr v9, v2

    int-to-float v2, v9

    add-float v2, v2, v77

    add-float v2, v2, v91

    add-float v2, v2, v59

    .line 1568
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    move/from16 v5, v86

    add-float/2addr v4, v5

    move-object/from16 v6, v73

    .line 1569
    invoke-virtual {v6, v3, v5, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    float-to-int v3, v3

    float-to-int v5, v5

    move/from16 v19, v7

    float-to-double v6, v2

    .line 1570
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-int v2, v6

    float-to-double v6, v4

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-int v4, v6

    invoke-virtual {v1, v3, v5, v2, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_66

    :cond_92
    move/from16 v19, v7

    goto :goto_65

    :cond_93
    move/from16 v19, v7

    move/from16 v21, v63

    goto :goto_65

    :cond_94
    move-object/from16 v15, p8

    move/from16 v19, v7

    move/from16 v21, v63

    move/from16 v18, v72

    goto :goto_64

    :cond_95
    move-object/from16 v15, p8

    move/from16 v21, v63

    move/from16 v18, v72

    move/from16 v19, v84

    :goto_64
    move/from16 v10, v90

    move/from16 v8, v98

    :goto_65
    move-object/from16 v1, p3

    :goto_66
    move/from16 v2, p5

    .line 1577
    invoke-virtual {v0, v2}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v2

    add-float v34, v2, v28

    move/from16 v5, v99

    neg-int v3, v5

    int-to-float v3, v3

    const/4 v4, 0x0

    .line 1580
    invoke-virtual {v11, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    add-int/lit8 v3, v79, 0x1

    move-object/from16 p3, v1

    move v5, v8

    move-object v4, v11

    move-object/from16 v97, v14

    move-object/from16 v69, v16

    move-object/from16 v14, v17

    move/from16 v15, v19

    move/from16 v63, v21

    move/from16 v72, v23

    move-object/from16 v6, v30

    move-object/from16 v30, v53

    move/from16 v7, v65

    move/from16 v76, v68

    move/from16 v9, v87

    move-object/from16 v68, v89

    move-object v1, v0

    move v8, v3

    move v3, v10

    move-object/from16 v53, v12

    move/from16 v0, v18

    move/from16 v12, v58

    move-object/from16 v10, v85

    goto/16 :goto_50

    :cond_96
    move-object/from16 v15, p8

    move-object/from16 v30, v6

    move-object/from16 v85, v10

    move-object v6, v11

    move-object/from16 v17, v14

    move/from16 v68, v76

    move/from16 v0, v78

    move-object v11, v4

    .line 1583
    invoke-virtual {v11, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1584
    invoke-virtual/range {v61 .. v61}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual/range {v61 .. v61}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v11, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    move/from16 v2, v58

    .line 1595
    iput-boolean v2, v1, Ll/ۗۤᩳ;->ᩳ֫:Z

    move/from16 v2, v49

    .line 1596
    iput-boolean v2, v1, Ll/ۗۤᩳ;->ܽ֫:Z

    .line 1597
    invoke-virtual/range {v61 .. v61}, Ll/۫ۨᩳ;->֨ۧ()Z

    move-result v8

    const/4 v7, 0x0

    const/4 v9, 0x2

    move-object/from16 v2, v33

    move-object/from16 v3, p1

    move v4, v8

    move-object/from16 v5, p3

    .line 1599
    invoke-direct/range {v1 .. v7}, Ll/ۗۤᩳ;->֫(Ll/᩺ۛᩳ;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V

    .line 1602
    invoke-virtual/range {v61 .. v61}, Ll/۫ۨᩳ;->۫ۧ()Z

    move-result v1

    if-eqz v1, :cond_98

    move-object/from16 v10, v17

    move-object/from16 v6, v85

    invoke-static {v6, v10}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result v1

    move-object/from16 v12, v33

    if-eqz v1, :cond_99

    if-nez v12, :cond_99

    .line 1603
    invoke-virtual/range {v61 .. v61}, Ll/۫ۨᩳ;->ۤۧ()Z

    move-result v1

    if-eqz v1, :cond_97

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object v2, v12

    move-object/from16 v3, p1

    move v4, v8

    move-object/from16 v5, v88

    .line 1605
    invoke-direct/range {v1 .. v7}, Ll/ۗۤᩳ;->֫(Ll/᩺ۛᩳ;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V

    const/4 v1, 0x0

    if-eqz v12, :cond_9a

    .line 1607
    invoke-virtual {v12, v9, v1, v1, v1}, Ll/᩺ۛᩳ;->֫(IIIZ)V

    goto :goto_67

    :cond_97
    const/4 v9, 0x0

    const/4 v7, 0x2

    move-object/from16 v1, p0

    move-object v2, v12

    move-object/from16 v3, p1

    move v4, v8

    move-object/from16 v5, p4

    move-object v6, v10

    .line 1611
    invoke-direct/range {v1 .. v7}, Ll/ۗۤᩳ;->֫(Ll/᩺ۛᩳ;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V

    const/4 v1, 0x1

    if-eqz v12, :cond_9a

    .line 1613
    invoke-virtual {v12, v1, v9, v9, v9}, Ll/᩺ۛᩳ;->֫(IIIZ)V

    goto :goto_67

    :cond_98
    move-object/from16 v10, v17

    move-object/from16 v12, v33

    move-object/from16 v6, v85

    :cond_99
    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object v2, v12

    move-object/from16 v3, p1

    move v4, v8

    move-object/from16 v5, v88

    .line 1618
    invoke-direct/range {v1 .. v7}, Ll/ۗۤᩳ;->֫(Ll/᩺ۛᩳ;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V

    const/4 v7, 0x2

    move-object/from16 v5, p4

    move-object v6, v10

    .line 1619
    invoke-direct/range {v1 .. v7}, Ll/ۗۤᩳ;->֫(Ll/᩺ۛᩳ;Landroid/graphics/Canvas;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V

    :cond_9a
    :goto_67
    move-object/from16 v10, p0

    move-object/from16 v1, p3

    move-object/from16 v3, p4

    move-object/from16 v2, v88

    .line 1622
    invoke-direct {v10, v1, v2, v3}, Ll/ۗۤᩳ;->֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1631
    invoke-virtual/range {v61 .. v61}, Ll/۫ۨᩳ;->ۖ֫()I

    move-result v1

    add-int v2, p7, v1

    add-int v12, v39, v1

    .line 1637
    iget-boolean v14, v15, Ll/᩹ۤᩳ;->ۧ:Z

    .line 1638
    iget v9, v15, Ll/᩹ۤᩳ;->ᩳ:F

    .line 1640
    iget v8, v10, Ll/ۗۤᩳ;->ۤ:I

    const/4 v1, 0x0

    cmpl-float v1, v9, v1

    if-lez v1, :cond_a5

    .line 1641
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ܿ()D

    move-result-wide v16

    int-to-double v6, v2

    sub-double v1, v16, v6

    const-wide/16 v3, 0x0

    cmpl-double v5, v1, v3

    if-lez v5, :cond_a5

    sub-double v3, v1, v45

    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    cmpg-double v5, v3, v18

    if-gez v5, :cond_9b

    goto :goto_68

    :cond_9b
    div-double v18, v45, v1

    .line 1646
    :goto_68
    iget-boolean v5, v13, Ll/᩺֫ܿ;->᩷ۧ:Z

    .line 1649
    iget-boolean v1, v13, Ll/᩺֫ܿ;->۠֫:Z

    if-eqz v1, :cond_a0

    div-double v1, v16, v6

    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    cmpl-double v20, v1, v3

    if-lez v20, :cond_a0

    and-int v1, v35, v52

    ushr-int/lit8 v2, v35, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-float v2, v2

    mul-float v2, v2, v9

    float-to-int v2, v2

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr v1, v2

    move-object/from16 v7, v38

    .line 1658
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v6, v75

    int-to-float v1, v6

    mul-float v16, v1, v9

    move/from16 v4, v74

    int-to-float v3, v4

    if-eqz v5, :cond_9c

    sub-float v2, v62, v16

    move/from16 v17, v3

    move/from16 v1, v68

    int-to-float v3, v1

    move/from16 v20, v5

    int-to-float v5, v12

    const/16 v21, 0xff

    move v15, v1

    move-object/from16 v1, p1

    move/from16 v100, v4

    move/from16 v4, v62

    move/from16 v78, v0

    move v0, v6

    move-object v6, v7

    .line 1663
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_69

    :cond_9c
    move/from16 v78, v0

    move/from16 v17, v3

    move/from16 v100, v4

    move/from16 v20, v5

    move v0, v6

    move/from16 v15, v68

    const/16 v21, 0xff

    int-to-float v3, v15

    add-float v4, v64, v16

    int-to-float v5, v12

    move-object/from16 v1, p1

    move/from16 v2, v64

    move-object v6, v7

    .line 1665
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_69
    if-eqz v54, :cond_9d

    int-to-float v4, v15

    int-to-float v6, v12

    move-object/from16 v1, v54

    move-object/from16 v2, v30

    move/from16 v3, v64

    move/from16 v5, v62

    move-object/from16 v38, v7

    move-object/from16 v7, p1

    move v11, v8

    move-object/from16 v8, v38

    move/from16 v22, v9

    move-object v9, v13

    .line 1670
    invoke-interface/range {v1 .. v9}, Ll/ᩴۤᩳ;->֫(Ll/᩷۟ᩳ;FFFFLandroid/graphics/Canvas;Ll/֫ۖܽ;Ll/᩺֫ܿ;)V

    const/4 v1, 0x1

    const/4 v7, 0x1

    goto :goto_6a

    :cond_9d
    move-object/from16 v38, v7

    move v11, v8

    move/from16 v22, v9

    const/4 v1, 0x0

    const/4 v7, 0x0

    :goto_6a
    if-eqz v14, :cond_9e

    .line 1675
    iget v1, v13, Ll/᩺֫ܿ;->᩹֫:I

    goto :goto_6b

    :cond_9e
    move/from16 v1, v31

    :goto_6b
    and-int v2, v1, v52

    ushr-int/lit8 v1, v1, 0x18

    and-int v1, v1, v21

    int-to-float v1, v1

    mul-float v1, v1, v22

    float-to-int v1, v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    move-object/from16 v14, v38

    .line 1679
    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setColor(I)V

    sub-int v1, v12, v15

    int-to-float v1, v1

    sub-float v1, v1, v17

    float-to-double v1, v1

    mul-double v1, v1, v18

    double-to-int v1, v1

    add-int/2addr v1, v15

    if-eqz v20, :cond_9f

    sub-int v9, v67, v0

    int-to-float v3, v9

    int-to-float v8, v1

    add-float v9, v8, v17

    .line 1685
    iget-object v1, v10, Ll/ۗۤᩳ;->ۘ:Ll/ܳ᩸ۡ;

    const/4 v2, 0x3

    move v4, v8

    move/from16 v5, v62

    move v6, v9

    invoke-virtual/range {v1 .. v6}, Ll/ܳ᩸ۡ;->֫(IFFFF)V

    sub-float v2, v62, v16

    move-object/from16 v1, p1

    move v3, v8

    move/from16 v4, v62

    move v5, v9

    move-object v6, v14

    .line 1686
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_6c

    :cond_9f
    int-to-float v8, v1

    add-int v1, p2, v0

    int-to-float v5, v1

    add-float v9, v8, v17

    .line 1689
    iget-object v1, v10, Ll/ۗۤᩳ;->ۘ:Ll/ܳ᩸ۡ;

    const/4 v2, 0x2

    move/from16 v3, v64

    move v4, v8

    move v6, v9

    invoke-virtual/range {v1 .. v6}, Ll/ܳ᩸ۡ;->֫(IFFFF)V

    add-float v4, v64, v16

    move-object/from16 v1, p1

    move/from16 v2, v64

    move v3, v8

    move v5, v9

    move-object v6, v14

    .line 1690
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_6c
    const/4 v1, 0x1

    move/from16 v75, v0

    goto/16 :goto_6f

    :cond_a0
    move/from16 v78, v0

    move/from16 v20, v5

    move v11, v8

    move/from16 v22, v9

    move-object/from16 v14, v38

    move/from16 v15, v68

    move/from16 v100, v74

    move/from16 v0, v75

    const/16 v9, 0xff

    .line 1693
    iget-boolean v1, v13, Ll/᩺֫ܿ;->ܶ֫:Z

    if-eqz v1, :cond_a4

    if-eqz v54, :cond_a1

    int-to-float v4, v15

    int-to-float v8, v12

    move-object/from16 v1, v54

    move-object/from16 v2, v30

    move/from16 v3, v64

    move/from16 v5, v62

    move-wide/from16 v23, v6

    move v6, v8

    move-object/from16 v7, p1

    move-object v8, v14

    move/from16 v75, v0

    const/16 v0, 0xff

    move-object v9, v13

    .line 1696
    invoke-interface/range {v1 .. v9}, Ll/ᩴۤᩳ;->֫(Ll/᩷۟ᩳ;FFFFLandroid/graphics/Canvas;Ll/֫ۖܽ;Ll/᩺֫ܿ;)V

    const/4 v1, 0x1

    const/4 v7, 0x1

    goto :goto_6d

    :cond_a1
    move/from16 v75, v0

    move-wide/from16 v23, v6

    const/16 v0, 0xff

    const/4 v1, 0x0

    const/4 v7, 0x0

    .line 1700
    :goto_6d
    iget v1, v13, Ll/᩺֫ܿ;->᩹ۧ:I

    and-int v2, v1, v52

    ushr-int/lit8 v1, v1, 0x18

    and-int/2addr v1, v0

    int-to-float v1, v1

    mul-float v1, v1, v22

    float-to-int v1, v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    .line 1703
    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setColor(I)V

    mul-double v1, v23, v23

    div-double v1, v1, v16

    double-to-float v1, v1

    int-to-float v2, v11

    cmpg-float v3, v1, v2

    if-gez v3, :cond_a2

    move v1, v2

    :cond_a2
    sub-int v2, v12, v15

    int-to-float v2, v2

    sub-float/2addr v2, v1

    float-to-double v2, v2

    mul-double v2, v2, v18

    double-to-int v2, v2

    add-int/2addr v2, v15

    if-eqz v20, :cond_a3

    .line 1711
    iget v3, v13, Ll/᩺֫ܿ;->᩶ۧ:F

    sub-float v3, v62, v3

    int-to-float v4, v2

    add-float v5, v4, v1

    move-object/from16 v1, p1

    move v2, v3

    move v3, v4

    move/from16 v4, v62

    move-object v6, v14

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_6e

    :cond_a3
    int-to-float v3, v2

    .line 1713
    iget v2, v13, Ll/᩺֫ܿ;->᩶ۧ:F

    add-float v4, v64, v2

    add-float v5, v3, v1

    move-object/from16 v1, p1

    move/from16 v2, v64

    move-object v6, v14

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_6e
    const/4 v1, 0x0

    const/16 v21, 0xff

    :goto_6f
    const/4 v0, 0x1

    move v9, v1

    goto :goto_71

    :cond_a4
    move/from16 v75, v0

    const/16 v0, 0xff

    goto :goto_70

    :cond_a5
    move/from16 v78, v0

    move v11, v8

    move-object/from16 v14, v38

    move/from16 v15, v68

    move/from16 v100, v74

    :goto_70
    const/16 v9, 0xff

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v0, 0x0

    move/from16 v21, v9

    const/4 v9, 0x0

    :goto_71
    if-eqz v54, :cond_a6

    if-nez v7, :cond_a6

    int-to-float v4, v15

    int-to-float v6, v12

    move-object/from16 v1, v54

    move-object/from16 v2, v30

    move/from16 v3, v64

    move/from16 v5, v62

    move-object/from16 v7, p1

    move-object v8, v14

    move v15, v9

    move-object v9, v13

    .line 1721
    invoke-interface/range {v1 .. v9}, Ll/ᩴۤᩳ;->֫(Ll/᩷۟ᩳ;FFFFLandroid/graphics/Canvas;Ll/֫ۖܽ;Ll/᩺֫ܿ;)V

    goto :goto_72

    :cond_a6
    move v15, v9

    .line 1724
    :goto_72
    iput-boolean v15, v10, Ll/ۗۤᩳ;->᩵:Z

    move-object/from16 v1, p1

    move v3, v11

    move/from16 v2, v78

    .line 1732
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    move-object/from16 v2, p8

    .line 1734
    iget-boolean v4, v2, Ll/᩹ۤᩳ;->֫:Z

    .line 1735
    iget v2, v2, Ll/᩹ۤᩳ;->ܽ:F

    const/4 v5, 0x0

    cmpl-float v6, v2, v5

    if-lez v6, :cond_ad

    move/from16 v6, p6

    int-to-float v7, v6

    sub-float v8, v47, v7

    cmpl-float v5, v8, v5

    if-lez v5, :cond_ad

    .line 1742
    iget-boolean v5, v13, Ll/᩺֫ܿ;->۫ۧ:Z

    if-eqz v5, :cond_a8

    iget-boolean v5, v13, Ll/᩺֫ܿ;->۬֫:Z

    if-eqz v5, :cond_a8

    .line 1743
    iget-boolean v5, v13, Ll/᩺֫ܿ;->᩷ۧ:Z

    if-eqz v5, :cond_a7

    add-int v5, p2, v48

    goto :goto_73

    :cond_a7
    sub-int v9, v67, v48

    move/from16 v5, p2

    goto :goto_74

    :cond_a8
    move/from16 v5, p2

    :goto_73
    move/from16 v9, v67

    :goto_74
    sub-float v11, v8, v64

    const/high16 v15, 0x3f800000    # 1.0f

    cmpg-float v11, v11, v15

    if-gez v11, :cond_a9

    goto :goto_75

    :cond_a9
    div-float v15, v64, v8

    .line 1753
    :goto_75
    iget-boolean v8, v13, Ll/᩺֫ܿ;->֡֫:Z

    if-eqz v8, :cond_ab

    div-float v7, v47, v7

    cmpl-float v7, v7, v51

    if-lez v7, :cond_ab

    and-int v0, v35, v52

    ushr-int/lit8 v3, v35, 0x18

    and-int v3, v3, v21

    int-to-float v3, v3

    mul-float v3, v3, v2

    float-to-int v3, v3

    shl-int/lit8 v3, v3, 0x18

    or-int/2addr v0, v3

    .line 1762
    invoke-virtual {v14, v0}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v0, v100

    int-to-float v0, v0

    move/from16 v3, v75

    int-to-float v6, v3

    mul-float v6, v6, v2

    int-to-float v7, v5

    int-to-float v8, v12

    sub-float v6, v8, v6

    int-to-float v11, v9

    move-object/from16 p2, p1

    move/from16 p3, v7

    move/from16 p4, v6

    move/from16 p5, v11

    move/from16 p6, v8

    move-object/from16 p7, v14

    .line 1765
    invoke-virtual/range {p2 .. p7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-eqz v4, :cond_aa

    .line 1768
    iget v4, v13, Ll/᩺֫ܿ;->᩹֫:I

    goto :goto_76

    :cond_aa
    move/from16 v4, v31

    :goto_76
    and-int v7, v4, v52

    ushr-int/lit8 v4, v4, 0x18

    and-int v4, v4, v21

    int-to-float v4, v4

    mul-float v4, v4, v2

    float-to-int v2, v4

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr v2, v7

    .line 1772
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setColor(I)V

    sub-int/2addr v9, v5

    int-to-float v2, v9

    sub-float/2addr v2, v0

    mul-float v2, v2, v15

    float-to-int v2, v2

    add-int/2addr v5, v2

    int-to-float v2, v5

    sub-int/2addr v12, v3

    int-to-float v3, v12

    add-float/2addr v0, v2

    .line 1776
    iget-object v4, v10, Ll/ۗۤᩳ;->ۖ:Ll/ܳ᩸ۡ;

    invoke-virtual {v4, v2, v3, v0, v8}, Ll/ܳ᩸ۡ;->֫(FFFF)V

    move/from16 p2, v2

    move/from16 p3, v6

    move/from16 p4, v0

    move/from16 p5, v8

    move-object/from16 p6, v14

    .line 1777
    invoke-virtual/range {p1 .. p6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/4 v0, 0x1

    goto :goto_77

    .line 1779
    :cond_ab
    iget-boolean v4, v13, Ll/᩺֫ܿ;->ۚ֫:Z

    if-eqz v4, :cond_ad

    .line 1781
    iget v0, v13, Ll/᩺֫ܿ;->᩹ۧ:I

    and-int v4, v0, v52

    ushr-int/lit8 v0, v0, 0x18

    and-int v0, v0, v21

    int-to-float v0, v0

    mul-float v0, v0, v2

    float-to-int v0, v0

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v4

    .line 1784
    invoke-virtual {v14, v0}, Landroid/graphics/Paint;->setColor(I)V

    mul-int v0, v6, v6

    int-to-float v0, v0

    div-float v0, v0, v47

    int-to-float v2, v3

    cmpg-float v3, v0, v2

    if-gez v3, :cond_ac

    move v0, v2

    :cond_ac
    sub-int/2addr v9, v5

    int-to-float v2, v9

    sub-float/2addr v2, v0

    mul-float v2, v2, v15

    float-to-int v2, v2

    add-int/2addr v5, v2

    int-to-float v2, v5

    int-to-float v3, v12

    .line 1791
    iget v4, v13, Ll/᩺֫ܿ;->᩶ۧ:F

    sub-float v4, v3, v4

    add-float/2addr v0, v2

    move/from16 p2, v2

    move/from16 p3, v4

    move/from16 p4, v0

    move/from16 p5, v3

    move-object/from16 p6, v14

    invoke-virtual/range {p1 .. p6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/4 v0, 0x0

    :goto_77
    const/4 v1, 0x1

    goto :goto_78

    :cond_ad
    const/4 v1, 0x0

    move v1, v0

    const/4 v0, 0x0

    .line 1796
    :goto_78
    iput-boolean v0, v10, Ll/ۗۤᩳ;->ᩴ:Z

    if-eqz v1, :cond_ae

    .line 1800
    invoke-virtual/range {v61 .. v61}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_ae
    :goto_79
    return-void

    :catchall_0
    move-exception v0

    move v2, v11

    :goto_7a
    move-object v10, v13

    move-object v1, v15

    goto :goto_7b

    :catchall_1
    move-exception v0

    move-object v10, v13

    move-object v1, v15

    move/from16 v2, v57

    goto :goto_7b

    :catchall_2
    move-exception v0

    goto :goto_7a

    .line 969
    :goto_7b
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 970
    throw v0
.end method

.method private ۨ()V
    .locals 2

    .line 193
    iget-boolean v0, p0, Ll/ۗۤᩳ;->ۡ:Z

    if-nez v0, :cond_1

    iget v0, p0, Ll/ۗۤᩳ;->֫:I

    iget-object v1, p0, Ll/ۗۤᩳ;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۗۤᩳ;->ۧ:Ll/۟᩺ᩳ;

    iget-object v1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    if-eq v0, v1, :cond_1

    .line 198
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    const/4 v1, 0x0

    .line 199
    iput-object v1, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    .line 200
    iput-object v1, p0, Ll/ۗۤᩳ;->ۧ:Ll/۟᩺ᩳ;

    if-eqz v0, :cond_1

    .line 201
    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    :cond_1
    return-void
.end method

.method private ܳ(II)J
    .locals 4

    .line 1943
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0, p1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v0

    .line 1944
    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1, p2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v1

    .line 1945
    iget v0, v0, Ll/ۨܰᩳ;->᩶:I

    add-int/lit16 v0, v0, -0x2710

    const/4 v2, 0x0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1946
    iget-object v3, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    add-int/lit16 p1, p1, -0xc8

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v3, p1}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result p1

    .line 66
    iget v2, p0, Ll/ۗۤᩳ;->᩶:I

    .line 1947
    invoke-virtual {v1}, Ll/ۨܰᩳ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Ll/ۨܰᩳ;->֫()I

    move-result v1

    goto :goto_0

    :cond_0
    iget v1, v1, Ll/ۨܰᩳ;->᩸:I

    add-int/lit16 v1, v1, 0x2710

    :goto_0
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1948
    iget-object v2, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v3

    add-int/lit16 p2, p2, 0xc8

    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-virtual {v2, p2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۨܰᩳ;->֫()I

    move-result p2

    .line 1949
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-long v2, p1

    const/16 p1, 0x20

    shl-long/2addr v2, p1

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-long p1, p1

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    or-long/2addr p1, v2

    return-wide p1
.end method


# virtual methods
.method public final ֡()Z
    .locals 2

    .line 67
    iget-object v0, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۗۤᩳ;->ۡ֫:I

    iget-object v1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ֨()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(D)I
    .locals 2

    .line 387
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v0}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v0

    float-to-double v0, v0

    div-double/2addr p1, v0

    double-to-int p1, p1

    const/4 p2, 0x1

    if-gez p1, :cond_0

    .line 389
    iput-boolean p2, p0, Ll/ۗۤᩳ;->ۛ:Z

    const/4 p1, 0x0

    return p1

    .line 391
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 392
    iput-boolean p2, p0, Ll/ۗۤᩳ;->ۛ:Z

    .line 393
    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p1}, Ll/᩷۟ᩳ;->ܿ()I

    move-result p1

    :cond_1
    return p1
.end method

.method public final ֫(FF)I
    .locals 2

    const/4 v0, 0x0

    .line 376
    iput-boolean v0, p0, Ll/ۗۤᩳ;->ۛ:Z

    float-to-double v0, p2

    .line 377
    invoke-virtual {p0, v0, v1}, Ll/ۗۤᩳ;->֫(D)I

    move-result p2

    .line 379
    invoke-virtual {p0, p2}, Ll/ۗۤᩳ;->ᩳ(I)I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-virtual {p0, v0, p2, p1}, Ll/ۗۤᩳ;->֫(Ljava/lang/CharSequence;IF)I

    move-result p1

    return p1

    .line 380
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-interface {v0}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v0

    .line 381
    :try_start_0
    invoke-virtual {p0, v0, p2, p1}, Ll/ۗۤᩳ;->֫(Ljava/lang/CharSequence;IF)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 382
    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    return p1

    :catchall_0
    move-exception p1

    .line 380
    :try_start_1
    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ֫(I)I
    .locals 4

    .line 346
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v0

    iget v0, v0, Ll/ۨܰᩳ;->᩹:I

    int-to-long v0, v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    int-to-long v2, p1

    add-long/2addr v0, v2

    .line 351
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    int-to-float p1, p1

    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget v1, v0, Ll/᩺֫ܿ;->ۢۧ:F

    add-float/2addr p1, v1

    iget v0, v0, Ll/᩺֫ܿ;->ۜۧ:F

    mul-float p1, p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public ֫(II)I
    .locals 4

    .line 1911
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    long-to-float v0, v0

    iget-object v1, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v1}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v1

    mul-float v1, v1, v0

    float-to-int v0, v1

    sub-int/2addr v0, p2

    add-int/lit8 v0, v0, -0x1

    const/4 p2, 0x0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1912
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public final ֫(IZ)I
    .locals 8

    const/4 v0, 0x0

    if-gtz p1, :cond_0

    return v0

    .line 527
    :cond_0
    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v1

    iget v1, v1, Ll/ۨܰᩳ;->᩸:I

    if-lt p1, v1, :cond_1

    .line 528
    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p1}, Ll/᩷۟ᩳ;->ܿ()I

    move-result p1

    return p1

    .line 530
    :cond_1
    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 532
    invoke-virtual {v1}, Ll/᩷۟ᩳ;->size()I

    move-result v2

    .line 534
    invoke-virtual {v1}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v3

    :goto_0
    add-int v4, v0, v2

    ushr-int/lit8 v4, v4, 0x1

    .line 537
    invoke-virtual {v3, v4}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v5

    .line 538
    iget v6, v5, Ll/ۨܰᩳ;->᩶:I

    if-ge p1, v6, :cond_2

    move v2, v4

    goto :goto_0

    .line 541
    :cond_2
    iget v7, v5, Ll/ۨܰᩳ;->᩸:I

    if-lt p1, v7, :cond_5

    if-eq v0, v4, :cond_3

    move v0, v4

    goto :goto_0

    :cond_3
    if-ne p1, v7, :cond_4

    goto :goto_1

    .line 547
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_5
    :goto_1
    if-ne p1, v6, :cond_7

    .line 220
    invoke-virtual {v1, v4}, Ll/᩷۟ᩳ;->᩻(I)Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz p2, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 v4, v4, -0x1

    return v4

    .line 552
    :cond_7
    iget v0, v5, Ll/ۨܰᩳ;->᩸:I

    if-ne p1, v0, :cond_8

    .line 224
    invoke-virtual {v1, v4}, Ll/᩷۟ᩳ;->ۜ(I)Z

    move-result p1

    if-nez p1, :cond_8

    if-eqz p2, :cond_8

    add-int/lit8 v4, v4, 0x1

    :cond_8
    :goto_2
    return v4
.end method

.method public final ֫(Ljava/lang/CharSequence;IF)I
    .locals 4

    .line 418
    invoke-virtual {p0, p2}, Ll/ۗۤᩳ;->ᩳ(I)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p3, v0

    .line 419
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0, p2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v0

    .line 420
    iget v1, v0, Ll/ۨܰᩳ;->᩶:I

    .line 421
    invoke-virtual {v0}, Ll/ۨܰᩳ;->֫()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    cmpg-float v2, p3, v2

    if-gtz v2, :cond_0

    .line 424
    iput-boolean v3, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    return v1

    .line 428
    :cond_0
    invoke-direct {p0, v1, v0, p1}, Ll/ۗۤᩳ;->֫(IILjava/lang/CharSequence;)Ll/ۜ۫ۡ;

    move-result-object p1

    .line 429
    invoke-virtual {p1, p3}, Ll/ۜ۫ۡ;->֫(F)I

    move-result v2

    if-ne v2, v0, :cond_2

    .line 430
    invoke-virtual {p1}, Ll/ۜ۫ۡ;->֫()F

    move-result p1

    cmpl-float p1, p3, p1

    if-lez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/ۗۤᩳ;->ۛ:Z

    :cond_2
    if-eq v2, v1, :cond_4

    .line 432
    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p1, p2}, Ll/᩷۟ᩳ;->ۜ(I)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :cond_4
    :goto_1
    iput-boolean v3, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    return v2
.end method

.method public abstract ֫(Ll/ۙۤᩳ;)I
.end method

.method public final ֫(Ll/۟᩸ᩳ;II)Ll/᩺᩸ᩳ;
    .locals 1

    .line 577
    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->֫ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    move p2, p3

    :cond_0
    invoke-virtual {p1, p2, p3}, Ll/۟᩸ᩳ;->֫(II)Ll/᩺᩸ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public abstract ֫(F)V
.end method

.method public abstract ֫(III)V
.end method

.method public ֫(Landroid/graphics/Canvas;IFILl/֫ۖܽ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;IIII)V
    .locals 8

    .line 714
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget v0, v0, Ll/᩺֫ܿ;->ܽ֫:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    int-to-float v7, p4

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    .line 717
    invoke-direct/range {v1 .. v7}, Ll/ۗۤᩳ;->֫(Landroid/graphics/Canvas;IIIIF)V

    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;IIIIIILl/᩹ۤᩳ;Ll/ۜܺܿ;Ll/ۜ֫ܿ;Ll/᩻۫ᩳ;)V
    .locals 4

    .line 829
    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    iget-object v1, p0, Ll/ۗۤᩳ;->ۢ:Ll/᩶ۤᩳ;

    instance-of v2, p0, Ll/ۖܰᩳ;

    if-eqz v2, :cond_0

    move-object v2, p0

    check-cast v2, Ll/ۖܰᩳ;

    invoke-virtual {v2, p3, p5}, Ll/ۖܰᩳ;->ܳ(II)V

    :cond_0
    const/4 v2, 0x1

    .line 831
    iput-boolean v2, p0, Ll/ۗۤᩳ;->ۡ:Z

    .line 832
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 834
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v0

    sub-int/2addr v3, v0

    iput v3, p0, Ll/ۗۤᩳ;->᩻:I

    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 836
    :try_start_0
    invoke-direct/range {p0 .. p11}, Ll/ۗۤᩳ;->ۧ(Landroid/graphics/Canvas;IIIIIILl/᩹ۤᩳ;Ll/ۜܺܿ;Ll/ۜ֫ܿ;Ll/᩻۫ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 840
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 841
    iput-object v3, v1, Ll/᩶ۤᩳ;->ܳ:Ljava/lang/CharSequence;

    .line 842
    iput-object v3, v1, Ll/᩶ۤᩳ;->֫:Ll/ۜܺܿ;

    .line 843
    iput-object v3, v1, Ll/᩶ۤᩳ;->ܿ:Ll/ۜ۫ۡ;

    .line 844
    iput-boolean v0, p0, Ll/ۗۤᩳ;->ۡ:Z

    .line 846
    invoke-direct {p0}, Ll/ۗۤᩳ;->ۨ()V

    return-void

    :catchall_0
    move-exception p2

    .line 840
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 841
    iput-object v3, v1, Ll/᩶ۤᩳ;->ܳ:Ljava/lang/CharSequence;

    .line 842
    iput-object v3, v1, Ll/᩶ۤᩳ;->֫:Ll/ۜܺܿ;

    .line 843
    iput-object v3, v1, Ll/᩶ۤᩳ;->ܿ:Ll/ۜ۫ۡ;

    .line 844
    iput-boolean v0, p0, Ll/ۗۤᩳ;->ۡ:Z

    .line 198
    iget-object p1, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    .line 199
    iput-object v3, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    .line 200
    iput-object v3, p0, Ll/ۗۤᩳ;->ۧ:Ll/۟᩺ᩳ;

    if-eqz p1, :cond_1

    .line 201
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V

    .line 847
    :cond_1
    throw p2
.end method

.method public ֫(Landroid/graphics/RectF;I)V
    .locals 9

    if-gez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 66
    :cond_0
    iget v0, p0, Ll/ۗۤᩳ;->᩶:I

    if-le p2, v0, :cond_1

    move p2, v0

    .line 521
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    invoke-virtual {p0, p2, v0}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result v0

    .line 488
    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1, v0}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v1

    .line 490
    invoke-virtual {p0, v0}, Ll/ۗۤᩳ;->ᩳ(I)I

    move-result v2

    .line 492
    invoke-virtual {v1}, Ll/ۨܰᩳ;->֫()I

    move-result v3

    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 493
    iget v3, v1, Ll/ۨܰᩳ;->᩶:I

    iget v4, v1, Ll/ۨܰᩳ;->᩸:I

    iget-object v5, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    if-ne v3, v4, :cond_2

    .line 495
    iget p2, v5, Ll/᩺֫ܿ;->ᩳ֫:F

    const/4 v1, 0x0

    goto :goto_2

    .line 497
    :cond_2
    iget-object v3, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-interface {v3}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v3

    .line 498
    :try_start_0
    iget v4, v1, Ll/ۨܰᩳ;->᩶:I

    invoke-virtual {v1}, Ll/ۨܰᩳ;->֫()I

    move-result v6

    invoke-direct {p0, v4, v6, v3}, Ll/ۗۤᩳ;->֫(IILjava/lang/CharSequence;)Ll/ۜ۫ۡ;

    move-result-object v4

    const/high16 v6, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 858
    invoke-virtual {v4, v6, p2}, Ll/ۜ۫ۡ;->֫(FI)F

    move-result v7

    .line 500
    invoke-virtual {v1}, Ll/ۨܰᩳ;->֫()I

    move-result v8

    if-gt v8, p2, :cond_3

    .line 501
    iget p2, v5, Ll/᩺֫ܿ;->ᩳ֫:F

    add-float/2addr p2, v7

    goto :goto_1

    .line 503
    :cond_3
    invoke-virtual {v1}, Ll/ۨܰᩳ;->֫()I

    move-result v1

    invoke-static {p2, v1, v3}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result p2

    .line 858
    invoke-virtual {v4, v6, p2}, Ll/ۜ۫ۡ;->֫(FI)F

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 505
    :goto_1
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V

    move v1, v7

    :goto_2
    int-to-float v2, v2

    add-float/2addr v1, v2

    .line 507
    iput v1, p1, Landroid/graphics/RectF;->left:F

    add-float/2addr p2, v2

    .line 508
    iput p2, p1, Landroid/graphics/RectF;->right:F

    .line 480
    invoke-virtual {v5}, Ll/ۢ۫ۡ;->ۜ()F

    move-result p2

    int-to-float v0, v0

    mul-float v0, v0, p2

    .line 481
    iput v0, p1, Landroid/graphics/RectF;->top:F

    add-float/2addr v0, p2

    .line 482
    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    return-void

    :catchall_0
    move-exception p1

    .line 497
    :try_start_1
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 7

    .line 232
    iput-object p1, p0, Ll/ۗۤᩳ;->۠:Ljava/lang/String;

    if-eqz p1, :cond_4

    .line 233
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 237
    :cond_0
    new-instance v0, Ll/᩷۟ᩳ;

    invoke-direct {v0}, Ll/᩷۟ᩳ;-><init>()V

    .line 242
    new-instance v1, Ll/ۨܰᩳ;

    invoke-direct {v1}, Ll/ۨܰᩳ;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-eqz v2, :cond_3

    .line 581
    iget-object v5, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v5}, Ll/۫ۨᩳ;->֫ܽ()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_1

    const/4 v5, -0x1

    goto :goto_1

    :cond_1
    const/16 v5, 0xa

    .line 584
    invoke-virtual {p1, v5, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    :goto_1
    if-ne v5, v6, :cond_2

    .line 247
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v2, 0x0

    .line 249
    :cond_2
    invoke-virtual {v1, v3, v5, v4}, Ll/ۨܰᩳ;->֫(III)V

    .line 250
    invoke-virtual {v0, v1}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    add-int/lit8 v3, v5, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 254
    :cond_3
    iput-object v0, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    return-void

    .line 234
    :cond_4
    :goto_2
    iget-object p1, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    invoke-virtual {p1}, Ll/᩷۟ᩳ;->clear()V

    return-void
.end method

.method public final ֫(Ll/۟᩺ᩳ;)V
    .locals 2

    .line 174
    iget-object v0, p0, Ll/ۗۤᩳ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 175
    :try_start_0
    iget-object v1, p0, Ll/ۗۤᩳ;->᩺:Ll/۟᩸ᩳ;

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    if-eq v1, p1, :cond_1

    :cond_0
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;Ll/۟᩸ᩳ;)V

    .line 176
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܺ()V

    return-void

    :catchall_0
    move-exception p1

    .line 176
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/۟᩺ᩳ;Ll/۟᩸ᩳ;)V
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ۗۤᩳ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 81
    :try_start_0
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    .line 82
    iput-object p1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    .line 83
    iput-object p2, p0, Ll/ۗۤᩳ;->᩺:Ll/۟᩸ᩳ;

    .line 84
    invoke-virtual {p2}, Ll/۟᩸ᩳ;->ܳ()I

    move-result p1

    iput p1, p0, Ll/ۗۤᩳ;->ۡ֫:I

    .line 85
    invoke-virtual {p2}, Ll/۟᩸ᩳ;->length()I

    move-result p1

    iput p1, p0, Ll/ۗۤᩳ;->᩶:I

    .line 86
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܺ()V

    return-void

    :catchall_0
    move-exception p1

    .line 86
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public ֫(Ll/ۤۜܽ;)V
    .locals 6

    .line 2072
    invoke-virtual {p0}, Ll/ۗۤᩳ;->᩷()B

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 2073
    iget v0, p0, Ll/ۗۤᩳ;->ۙ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 2075
    iget-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۗۤᩳ;->᩷()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2078
    new-instance v0, Ll/᩷۟ᩳ;

    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-direct {v0, v1}, Ll/᩷۟ᩳ;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    .line 2080
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 2082
    :goto_0
    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const v1, -0xedc86dd

    .line 2083
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 2084
    invoke-virtual {v0}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 2085
    :goto_1
    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 2086
    invoke-virtual {v1, v3}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v4

    .line 2087
    iget v5, v4, Ll/ۨܰᩳ;->᩶:I

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 2088
    iget v5, v4, Ll/ۨܰᩳ;->᩸:I

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 2089
    iget v4, v4, Ll/ۨܰᩳ;->᩹:I

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const v0, 0x723a4824

    .line 2091
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 2092
    iget-object v0, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v0}, Ll/᩸ܰᩳ;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 2093
    iget-object v0, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    new-instance v1, Ll/֨ܰᩳ;

    invoke-direct {v1, v0}, Ll/֨ܰᩳ;-><init>(Ll/᩸ܰᩳ;)V

    .line 2094
    :goto_2
    iget-object v0, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v0}, Ll/᩸ܰᩳ;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 2095
    invoke-virtual {v1, v2}, Ll/֨ܰᩳ;->ܽ(I)Z

    .line 2096
    invoke-virtual {v1}, Ll/֨ܰᩳ;->ܽ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 2097
    invoke-virtual {v1}, Ll/֨ܰᩳ;->֫()C

    move-result v0

    const/16 v3, 0xff

    if-le v0, v3, :cond_2

    const/16 v0, 0xff

    .line 2100
    :cond_2
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public abstract ֫()Z
.end method

.method public final ֫(Landroid/graphics/RectF;)Z
    .locals 9

    .line 447
    iget-object v0, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v0

    .line 448
    iget-object v1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    if-le v0, v1, :cond_1

    move v8, v1

    move v1, v0

    move v0, v8

    .line 521
    :cond_1
    iget-boolean v2, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    invoke-virtual {p0, v0, v2}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result v2

    .line 457
    iget-object v3, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v3, v2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v3

    .line 458
    iget v4, v3, Ll/ۨܰᩳ;->᩶:I

    if-ge v4, v1, :cond_2

    iget v4, v3, Ll/ۨܰᩳ;->᩸:I

    if-gt v1, v4, :cond_2

    .line 459
    invoke-virtual {p0, v2}, Ll/ۗۤᩳ;->ᩳ(I)I

    move-result v4

    .line 460
    iget-object v5, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-interface {v5}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v5

    .line 461
    :try_start_0
    iget v6, v3, Ll/ۨܰᩳ;->᩶:I

    invoke-virtual {v3}, Ll/ۨܰᩳ;->֫()I

    move-result v7

    invoke-direct {p0, v6, v7, v5}, Ll/ۗۤᩳ;->֫(IILjava/lang/CharSequence;)Ll/ۜ۫ۡ;

    move-result-object v6

    .line 462
    invoke-virtual {v3}, Ll/ۨܰᩳ;->֫()I

    move-result v7

    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 858
    invoke-virtual {v6, v7, v0}, Ll/ۜ۫ۡ;->֫(FI)F

    move-result v0

    .line 463
    invoke-virtual {v3}, Ll/ۨܰᩳ;->֫()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 858
    invoke-virtual {v6, v7, v1}, Ll/ۜ۫ۡ;->֫(FI)F

    move-result v1

    int-to-float v3, v4

    add-float/2addr v0, v3

    .line 464
    iput v0, p1, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v3

    .line 465
    iput v1, p1, Landroid/graphics/RectF;->right:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 466
    invoke-virtual {v5}, Ll/۟᩸ᩳ;->close()V

    .line 480
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v0}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v0

    int-to-float v1, v2

    mul-float v1, v1, v0

    .line 481
    iput v1, p1, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, v0

    .line 482
    iput v1, p1, Landroid/graphics/RectF;->bottom:F

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    .line 460
    :try_start_1
    invoke-virtual {v5}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public ۖ()Z
    .locals 1

    .line 2111
    iget-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    return v0
.end method

.method public final ۗ()V
    .locals 1

    const/4 v0, 0x1

    .line 362
    iput-boolean v0, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    return-void
.end method

.method public final ۘ()Z
    .locals 1

    .line 592
    iget-boolean v0, p0, Ll/ۗۤᩳ;->ܽ֫:Z

    return v0
.end method

.method public final ۙ()V
    .locals 2

    .line 71
    iget-object v0, p0, Ll/ۗۤᩳ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 72
    :try_start_0
    iget-object v1, p0, Ll/ۗۤᩳ;->᩺:Ll/۟᩸ᩳ;

    if-eqz v1, :cond_0

    .line 73
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V

    const/4 v1, 0x0

    .line 74
    iput-object v1, p0, Ll/ۗۤᩳ;->᩺:Ll/۟᩸ᩳ;

    .line 76
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ۚ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۜ()I
    .locals 3

    .line 323
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-boolean v1, v0, Ll/᩺֫ܿ;->᩷ۧ:Z

    iget v2, v0, Ll/᩺֫ܿ;->ۙ֫:I

    if-eqz v1, :cond_1

    .line 324
    iget-boolean v1, v0, Ll/᩺֫ܿ;->᩵֫:Z

    if-eqz v1, :cond_0

    .line 325
    iget v0, v0, Ll/᩺֫ܿ;->ۡ֫:I

    add-int/2addr v2, v0

    return v2

    .line 327
    :cond_0
    iget v0, v0, Ll/᩺֫ܿ;->ۡ֫:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    .line 330
    :cond_1
    iget-boolean v1, v0, Ll/᩺֫ܿ;->۫ۧ:Z

    if-eqz v1, :cond_2

    iget v1, p0, Ll/ۗۤᩳ;->ۙ:I

    iget v0, v0, Ll/᩺֫ܿ;->ۡ֫:I

    add-int/2addr v1, v0

    return v1

    :cond_2
    iget v0, v0, Ll/᩺֫ܿ;->ܺ֫:I

    return v0
.end method

.method public final ۠()Z
    .locals 1

    .line 66
    iget v0, p0, Ll/ۗۤᩳ;->᩶:I

    if-nez v0, :cond_0

    .line 2209
    iget-object v0, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()Z
    .locals 2

    .line 62
    iget-object v0, p0, Ll/ۗۤᩳ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/ۗۤᩳ;->᩺:Ll/۟᩸ᩳ;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public abstract ۢ()F
.end method

.method public abstract ۤ()I
.end method

.method public final ۧ(F)F
    .locals 2

    .line 608
    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr p1, v1

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v0

    iget v1, p0, Ll/ۗۤᩳ;->᩻:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    add-float/2addr p1, v0

    return p1
.end method

.method public ۧ(II)J
    .locals 2

    .line 1936
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p0}, Ll/۫ۨᩳ;->ۧ(Ll/ۗۤᩳ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    int-to-double v0, p1

    .line 1937
    invoke-virtual {p0, v0, v1}, Ll/ۗۤᩳ;->֫(D)I

    move-result v0

    add-int/2addr p1, p2

    int-to-double p1, p1

    .line 1938
    invoke-virtual {p0, p1, p2}, Ll/ۗۤᩳ;->֫(D)I

    move-result p1

    .line 1937
    invoke-direct {p0, v0, p1}, Ll/ۗۤᩳ;->ܳ(II)J

    move-result-wide p1

    return-wide p1

    :cond_1
    :goto_0
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public abstract ۧ()V
.end method

.method public final ۧ(Landroid/graphics/RectF;I)V
    .locals 1

    if-gez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 66
    :cond_0
    iget v0, p0, Ll/ۗۤᩳ;->᩶:I

    if-le p2, v0, :cond_1

    move p2, v0

    .line 521
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    invoke-virtual {p0, p2, v0}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result p2

    .line 480
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v0}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v0

    int-to-float p2, p2

    mul-float p2, p2, v0

    .line 481
    iput p2, p1, Landroid/graphics/RectF;->top:F

    add-float/2addr p2, v0

    .line 482
    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    return-void
.end method

.method public abstract ۧ(Ll/۟᩺ᩳ;)V
.end method

.method public ۧ(I)Z
    .locals 1

    .line 1923
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v0

    iget v0, v0, Ll/ۨܰᩳ;->᩸:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract ۧ(Ll/ۙۤᩳ;)Z
.end method

.method public final ۫()I
    .locals 1

    .line 65
    iget v0, p0, Ll/ۗۤᩳ;->ۡ֫:I

    return v0
.end method

.method public final ۬()I
    .locals 1

    .line 66
    iget v0, p0, Ll/ۗۤᩳ;->᩶:I

    return v0
.end method

.method public ܳ()I
    .locals 3

    .line 304
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-boolean v1, v0, Ll/᩺֫ܿ;->᩷ۧ:Z

    iget v2, v0, Ll/᩺֫ܿ;->ۙ֫:I

    if-eqz v1, :cond_1

    .line 305
    iget-boolean v1, v0, Ll/᩺֫ܿ;->۫ۧ:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ۗۤᩳ;->ۙ:I

    iget v0, v0, Ll/᩺֫ܿ;->ۡ֫:I

    add-int/2addr v1, v0

    return v1

    :cond_0
    iget v0, v0, Ll/᩺֫ܿ;->ܺ֫:I

    return v0

    .line 307
    :cond_1
    iget-boolean v1, v0, Ll/᩺֫ܿ;->᩵֫:Z

    if-eqz v1, :cond_2

    .line 308
    iget v0, v0, Ll/᩺֫ܿ;->ۡ֫:I

    add-int/2addr v2, v0

    return v2

    .line 310
    :cond_2
    iget v0, v0, Ll/᩺֫ܿ;->ۡ֫:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public ܳ(I)V
    .locals 0

    return-void
.end method

.method public ܶ()V
    .locals 4

    .line 2139
    invoke-virtual {p0}, Ll/ۗۤᩳ;->֡()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2140
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    iget-object v1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    iget-object v2, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget-object v3, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۡ()I

    move-result v3

    invoke-virtual {v0, p0, v1, v2, v3}, Ll/᩸ܰᩳ;->֫(Ll/ۗۤᩳ;Ll/᩶᩸ᩳ;Ll/᩷۟ᩳ;I)V

    return-void
.end method

.method public final ܺ()V
    .locals 3

    .line 182
    instance-of v0, p0, Ll/ۖܰᩳ;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ll/ۖܰᩳ;

    invoke-virtual {v0}, Ll/ۖܰᩳ;->ۨ()V

    .line 183
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 184
    iget-object v0, p0, Ll/ۗۤᩳ;->ܽ:Ll/۟᩸ᩳ;

    if-nez v0, :cond_1

    goto :goto_0

    .line 185
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 186
    invoke-direct {p0}, Ll/ۗۤᩳ;->ۨ()V

    return-void

    .line 187
    :cond_2
    iget-object v0, p0, Ll/ۗۤᩳ;->᩷:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 188
    iget-object v0, p0, Ll/ۗۤᩳ;->۟:Ljava/lang/Runnable;

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final ܽ(I)F
    .locals 4

    int-to-double v0, p1

    .line 613
    iget-object p1, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {p1}, Ll/ۢ۫ۡ;->ۜ()F

    move-result p1

    float-to-double v2, p1

    mul-double v0, v0, v2

    iget p1, p0, Ll/ۗۤᩳ;->᩻:I

    int-to-double v2, p1

    sub-double/2addr v0, v2

    double-to-float p1, v0

    return p1
.end method

.method public ܽ(II)J
    .locals 4

    .line 1928
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p0}, Ll/۫ۨᩳ;->ۧ(Ll/ۗۤᩳ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1929
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    int-to-double v1, p1

    invoke-virtual {p0, v1, v2}, Ll/ۗۤᩳ;->֫(D)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v0

    .line 1930
    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    add-int/2addr p1, p2

    int-to-double p1, p1

    invoke-virtual {p0, p1, p2}, Ll/ۗۤᩳ;->֫(D)I

    move-result p1

    invoke-virtual {v1, p1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object p1

    .line 1931
    iget p2, v0, Ll/ۨܰᩳ;->᩶:I

    int-to-long v0, p2

    const/16 p2, 0x20

    shl-long/2addr v0, p2

    invoke-virtual {p1}, Ll/ۨܰᩳ;->֫()I

    move-result p1

    int-to-long p1, p1

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    or-long/2addr p1, v0

    return-wide p1

    :cond_1
    :goto_0
    const-wide/16 p1, -0x1

    return-wide p1
.end method

.method public final ܽ()V
    .locals 2

    .line 115
    instance-of v0, p0, Ll/ܿܽܿ;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ll/ܿܽܿ;

    .line 116
    invoke-virtual {v0}, Ll/ܿܽܿ;->ܰ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 118
    :goto_0
    iget-object v1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v1, v0}, Ll/۫ۨᩳ;->᩻(I)Ll/ᩴۨᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۗۤᩳ;->ܳ:Ll/ᩴۨᩳ;

    return-void
.end method

.method public final ܿ()D
    .locals 7

    .line 269
    invoke-virtual {p0}, Ll/ۗۤᩳ;->۠()Z

    move-result v0

    .line 752
    iget-object v1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    iget-object v2, v1, Ll/۫ۨᩳ;->ۧ֫:Ll/᩸ܽܿ;

    .line 271
    iget-object v3, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v3

    float-to-double v3, v3

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    :goto_0
    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v0

    int-to-double v5, v0

    mul-double v3, v3, v5

    .line 272
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܳۧ()I

    move-result v0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/᩸ܽܿ;->֫()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v0, v0

    add-double/2addr v3, v0

    return-wide v3
.end method

.method public final ܿ(I)I
    .locals 1

    .line 521
    iget-boolean v0, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    invoke-virtual {p0, p1, v0}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result p1

    return p1
.end method

.method public ܿ(II)Z
    .locals 11

    .line 66
    iget v0, p0, Ll/ۗۤᩳ;->᩶:I

    const/4 v1, 0x0

    .line 2150
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 2151
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v0, 0x1

    if-ge p1, p2, :cond_3

    .line 2152
    iget-object v2, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v2}, Ll/᩸ܰᩳ;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_3

    .line 2155
    :cond_0
    invoke-virtual {p0, p1, v0}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result p1

    sub-int/2addr p2, v0

    .line 2156
    invoke-virtual {p0, p2, v1}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result p2

    .line 2157
    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1, p1}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v1

    .line 2158
    iget-object v2, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, p2}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result p2

    add-int/2addr p2, v0

    .line 2159
    iget-object v2, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, p1}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result p1

    .line 2160
    iget-object v2, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v2}, Ll/ۢ۫ۡ;->ۡ()I

    move-result v2

    .line 2162
    iget-object v3, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-interface {v3}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v9

    move v10, v1

    :goto_0
    if-ge v10, p2, :cond_2

    .line 2164
    :try_start_0
    iget-object v3, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v3, v10, p1}, Ll/᩷۟ᩳ;->ᩳ(II)I

    move-result p1

    const/4 v3, -0x1

    if-eq p1, v3, :cond_2

    .line 2165
    iget-object v3, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v3}, Ll/᩸ܰᩳ;->size()I

    move-result v3

    if-lt v10, v3, :cond_1

    goto :goto_2

    .line 2168
    :cond_1
    iget-object v3, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    iget-object v4, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v4, p1}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v7

    move v4, v10

    move-object v5, p0

    move-object v6, v9

    move v8, v2

    invoke-virtual/range {v3 .. v8}, Ll/᩸ܰᩳ;->֫(ILl/ۗۤᩳ;Ll/۟᩸ᩳ;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 2162
    :try_start_1
    invoke-virtual {v9}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    .line 2170
    :cond_2
    :goto_2
    invoke-virtual {v9}, Ll/۟᩸ᩳ;->close()V

    .line 2171
    iget-object p1, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {p1, v1, p2}, Ll/᩸ܰᩳ;->ᩳ(II)V

    .line 2173
    iget-object p1, p0, Ll/ۗۤᩳ;->᩹:Ll/ᩴܰᩳ;

    const/high16 p2, -0x80000000

    iput p2, p1, Ll/ᩴܰᩳ;->ᩳ:I

    :cond_3
    :goto_3
    return v0
.end method

.method public final ᩳ(I)I
    .locals 2

    .line 316
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result v0

    .line 317
    invoke-virtual {p0}, Ll/ۗۤᩳ;->֨()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 220
    invoke-virtual {v1, p1}, Ll/᩷۟ᩳ;->᩻(I)Z

    move-result p1

    if-nez p1, :cond_0

    .line 318
    iget-object p1, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {p1}, Ll/᩺֫ܿ;->۠()I

    move-result p1

    add-int/2addr p1, v0

    return p1

    :cond_0
    return v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 224
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v0

    iget v0, v0, Ll/ۨܰᩳ;->᩸:I

    .line 66
    iget v1, p0, Ll/ۗۤᩳ;->᩶:I

    if-ne v0, v1, :cond_0

    return-void

    .line 227
    :cond_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "Lines check fail. Try fix."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-virtual {p0, v0}, Ll/ۗۤᩳ;->ۧ(Ll/۟᩺ᩳ;)V

    return-void
.end method

.method public final ᩳ(II)Z
    .locals 2

    const/4 v0, 0x0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 66
    :cond_0
    iget v1, p0, Ll/ۗۤᩳ;->᩶:I

    if-le p1, v1, :cond_1

    move p1, v1

    :cond_1
    :goto_0
    if-gez p2, :cond_2

    const/4 p2, 0x0

    goto :goto_1

    :cond_2
    iget v1, p0, Ll/ۗۤᩳ;->᩶:I

    if-le p2, v1, :cond_3

    move p2, v1

    .line 521
    :cond_3
    :goto_1
    iget-boolean v1, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    invoke-virtual {p0, p1, v1}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result p1

    iget-boolean v1, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    invoke-virtual {p0, p2, v1}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result p2

    if-ne p1, p2, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    return v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 588
    iget-boolean v0, p0, Ll/ۗۤᩳ;->ᩳ֫:Z

    return v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 366
    iget-boolean v0, p0, Ll/ۗۤᩳ;->ܿ֫:Z

    return v0
.end method

.method public abstract ᩶()Ljava/lang/Throwable;
.end method

.method public abstract ᩷()B
.end method

.method public abstract ᩸()V
.end method

.method public final ᩹()Ll/۟᩸ᩳ;
    .locals 2

    .line 56
    iget-object v0, p0, Ll/ۗۤᩳ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 57
    :try_start_0
    iget-object v1, p0, Ll/ۗۤᩳ;->᩺:Ll/۟᩸ᩳ;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-interface {v1}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->֫()Ll/۟᩸ᩳ;

    move-result-object v1

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ᩻()Ll/ۙۤᩳ;
    .locals 7

    .line 1898
    iget v0, p0, Ll/ۗۤᩳ;->ۨ:I

    if-ltz v0, :cond_3

    invoke-virtual {p0, v0}, Ll/ۗۤᩳ;->ۧ(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1899
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result v1

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩻֫()I

    move-result v0

    if-lez v1, :cond_3

    if-gtz v0, :cond_1

    goto :goto_0

    .line 1901
    :cond_1
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 1902
    iget v3, p0, Ll/ۗۤᩳ;->ۨ:I

    invoke-virtual {p0, v2, v3}, Ll/ۗۤᩳ;->֫(Landroid/graphics/RectF;I)V

    .line 1903
    iget v3, v2, Landroid/graphics/RectF;->top:F

    float-to-int v3, v3

    div-int/lit8 v4, v0, 0x2

    sub-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 264
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܿ()D

    move-result-wide v5

    double-to-float v5, v5

    float-to-int v5, v5

    sub-int/2addr v5, v0

    .line 1904
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1905
    invoke-virtual {p0}, Ll/ۗۤᩳ;->֫()Z

    move-result v5

    if-eqz v5, :cond_2

    iget v2, v2, Landroid/graphics/RectF;->right:F

    float-to-int v2, v2

    div-int/lit8 v5, v1, 0x2

    sub-int/2addr v2, v5

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1906
    :cond_2
    new-instance v2, Ll/ۙۤᩳ;

    invoke-direct {v2, v4, v3, v1, v0}, Ll/ۙۤᩳ;-><init>(IIII)V

    return-object v2

    :cond_3
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
