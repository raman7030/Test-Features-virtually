.class public final Ll/ۗ۠ۧ;
.super Ljava/lang/Object;
.source "B2S5"


# static fields
.field public static final ܳ:Ljava/util/Comparator;


# instance fields
.field public final ֫:[I

.field public final ۧ:[Ll/ۤ۠ۧ;

.field public final ܽ:[I

.field public final ܿ:[F

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 457
    new-instance v0, Ll/᩶۠ۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۗ۠ۧ;->ܳ:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>([II[Ll/ۤ۠ۧ;)V
    .locals 8

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 63
    iput-object v0, p0, Ll/ۗ۠ۧ;->ܿ:[F

    .line 75
    iput-object p3, p0, Ll/ۗ۠ۧ;->ۧ:[Ll/ۤ۠ۧ;

    const p3, 0x8000

    new-array v0, p3, [I

    .line 77
    iput-object v0, p0, Ll/ۗ۠ۧ;->ܽ:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 78
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    .line 79
    aget v3, p1, v2

    .line 468
    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    move-result v4

    const/16 v5, 0x8

    const/4 v6, 0x5

    invoke-static {v4, v5, v6}, Ll/ۗ۠ۧ;->ۧ(III)I

    move-result v4

    .line 469
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v7

    invoke-static {v7, v5, v6}, Ll/ۗ۠ۧ;->ۧ(III)I

    move-result v7

    .line 470
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    invoke-static {v3, v5, v6}, Ll/ۗ۠ۧ;->ۧ(III)I

    move-result v3

    shl-int/lit8 v4, v4, 0xa

    shl-int/lit8 v5, v7, 0x5

    or-int/2addr v4, v5

    or-int/2addr v3, v4

    .line 81
    aput v3, p1, v2

    .line 83
    aget v4, v0, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v2, 0x0

    :goto_1
    if-ge p1, p3, :cond_4

    .line 93
    aget v3, v0, p1

    if-lez v3, :cond_2

    shr-int/lit8 v3, p1, 0xa

    and-int/lit8 v3, v3, 0x1f

    shr-int/lit8 v4, p1, 0x5

    and-int/lit8 v4, v4, 0x1f

    and-int/lit8 v5, p1, 0x1f

    .line 484
    invoke-static {v3, v4, v5}, Ll/ۗ۠ۧ;->֫(III)I

    move-result v3

    .line 435
    iget-object v4, p0, Ll/ۗ۠ۧ;->ܿ:[F

    invoke-static {v3, v4}, Ll/۟ۗ;->֫(I[F)V

    .line 444
    iget-object v3, p0, Ll/ۗ۠ۧ;->ۧ:[Ll/ۤ۠ۧ;

    if-eqz v3, :cond_2

    array-length v5, v3

    if-lez v5, :cond_2

    .line 445
    array-length v5, v3

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_2

    .line 446
    aget-object v7, v3, v6

    invoke-interface {v7, v4}, Ll/ۤ۠ۧ;->֫([F)Z

    move-result v7

    if-nez v7, :cond_1

    .line 95
    aput v1, v0, p1

    goto :goto_3

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 97
    :cond_2
    :goto_3
    aget v3, v0, p1

    if-lez v3, :cond_3

    add-int/lit8 v2, v2, 0x1

    :cond_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 108
    :cond_4
    new-array p1, v2, [I

    iput-object p1, p0, Ll/ۗ۠ۧ;->֫:[I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_4
    if-ge v3, p3, :cond_6

    .line 111
    aget v5, v0, v3

    if-lez v5, :cond_5

    add-int/lit8 v5, v4, 0x1

    .line 112
    aput v3, p1, v4

    move v4, v5

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_6
    if-gt v2, p2, :cond_8

    .line 122
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/ۗ۠ۧ;->ᩳ:Ljava/util/ArrayList;

    :goto_5
    if-ge v1, v2, :cond_7

    .line 123
    aget p2, p1, v1

    .line 124
    iget-object p3, p0, Ll/ۗ۠ۧ;->ᩳ:Ljava/util/ArrayList;

    new-instance v3, Ll/ۛ۠ۧ;

    shr-int/lit8 v4, p2, 0xa

    and-int/lit8 v4, v4, 0x1f

    shr-int/lit8 v5, p2, 0x5

    and-int/lit8 v5, v5, 0x1f

    and-int/lit8 v6, p2, 0x1f

    .line 484
    invoke-static {v4, v5, v6}, Ll/ۗ۠ۧ;->֫(III)I

    move-result v4

    .line 124
    aget p2, v0, p2

    invoke-direct {v3, v4, p2}, Ll/ۛ۠ۧ;-><init>(II)V

    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_7
    return-void

    .line 152
    :cond_8
    new-instance p1, Ljava/util/PriorityQueue;

    sget-object p3, Ll/ۗ۠ۧ;->ܳ:Ljava/util/Comparator;

    invoke-direct {p1, p2, p3}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 155
    new-instance p3, Ll/ۙ۠ۧ;

    iget-object v0, p0, Ll/ۗ۠ۧ;->֫:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p3, p0, v1, v0}, Ll/ۙ۠ۧ;-><init>(Ll/ۗ۠ۧ;II)V

    invoke-virtual {p1, p3}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 176
    :goto_6
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->size()I

    move-result p3

    if-ge p3, p2, :cond_9

    .line 177
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۙ۠ۧ;

    if-eqz p3, :cond_9

    .line 179
    invoke-virtual {p3}, Ll/ۙ۠ۧ;->֫()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 181
    invoke-virtual {p3}, Ll/ۙ۠ۧ;->ܿ()Ll/ۙ۠ۧ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 187
    invoke-virtual {p1, p3}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    goto :goto_6

    .line 199
    :cond_9
    new-instance p2, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/PriorityQueue;->size()I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 200
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۙ۠ۧ;

    .line 201
    invoke-virtual {p3}, Ll/ۙ۠ۧ;->ܽ()Ll/ۛ۠ۧ;

    move-result-object p3

    .line 440
    invoke-virtual {p3}, Ll/ۛ۠ۧ;->֫()[F

    move-result-object v0

    .line 444
    iget-object v1, p0, Ll/ۗ۠ۧ;->ۧ:[Ll/ۤ۠ۧ;

    if-eqz v1, :cond_b

    array-length v2, v1

    if-lez v2, :cond_b

    .line 445
    array-length v2, v1

    const/4 v3, 0x0

    :goto_8
    if-ge v3, v2, :cond_b

    .line 446
    aget-object v4, v1, v3

    invoke-interface {v4, v0}, Ll/ۤ۠ۧ;->֫([F)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    .line 205
    :cond_b
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 133
    :cond_c
    iput-object p2, p0, Ll/ۗ۠ۧ;->ᩳ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(III)I
    .locals 2

    const/4 v0, 0x5

    const/16 v1, 0x8

    .line 478
    invoke-static {p0, v0, v1}, Ll/ۗ۠ۧ;->ۧ(III)I

    move-result p0

    .line 479
    invoke-static {p1, v0, v1}, Ll/ۗ۠ۧ;->ۧ(III)I

    move-result p1

    .line 480
    invoke-static {p2, v0, v1}, Ll/ۗ۠ۧ;->ۧ(III)I

    move-result p2

    .line 478
    invoke-static {p0, p1, p2}, Landroid/graphics/Color;->rgb(III)I

    move-result p0

    return p0
.end method

.method public static ֫(III[I)V
    .locals 2

    const/4 v0, -0x2

    if-eq p0, v0, :cond_1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    goto :goto_2

    :cond_0
    :goto_0
    if-gt p1, p2, :cond_2

    .line 424
    aget p0, p3, p1

    and-int/lit8 v0, p0, 0x1f

    shl-int/lit8 v0, v0, 0xa

    shr-int/lit8 v1, p0, 0x5

    and-int/lit8 v1, v1, 0x1f

    shl-int/lit8 v1, v1, 0x5

    or-int/2addr v0, v1

    shr-int/lit8 p0, p0, 0xa

    and-int/lit8 p0, p0, 0x1f

    or-int/2addr p0, v0

    .line 427
    aput p0, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-gt p1, p2, :cond_2

    .line 415
    aget p0, p3, p1

    shr-int/lit8 v0, p0, 0x5

    and-int/lit8 v0, v0, 0x1f

    shl-int/lit8 v0, v0, 0xa

    shr-int/lit8 v1, p0, 0xa

    and-int/lit8 v1, v1, 0x1f

    shl-int/lit8 v1, v1, 0x5

    or-int/2addr v0, v1

    and-int/lit8 p0, p0, 0x1f

    or-int/2addr p0, v0

    .line 418
    aput p0, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public static ۧ(III)I
    .locals 0

    if-le p2, p1, :cond_0

    sub-int p1, p2, p1

    shl-int/2addr p0, p1

    goto :goto_0

    :cond_0
    sub-int/2addr p1, p2

    shr-int/2addr p0, p1

    :goto_0
    const/4 p1, 0x1

    shl-int p2, p1, p2

    sub-int/2addr p2, p1

    and-int/2addr p0, p2

    return p0
.end method
