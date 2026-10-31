.class public final Ll/ܰ۫ۡ;
.super Ljava/lang/Object;
.source "B2S5"


# static fields
.field public static final ᩳ:Ll/ۨ۫ۡ;


# instance fields
.field public final ֫:[I

.field public final ۧ:[I

.field public final ܽ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 415
    new-instance v0, Ll/ۨ۫ۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܰ۫ۡ;->ᩳ:Ll/ۨ۫ۡ;

    return-void
.end method

.method public constructor <init>([I)V
    .locals 11

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x8000

    new-array v1, v0, [I

    .line 63
    iput-object v1, p0, Ll/ܰ۫ۡ;->ۧ:[I

    .line 64
    array-length v2, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_0

    aget v6, p1, v4

    .line 421
    invoke-static {v6}, Landroid/graphics/Color;->red(I)I

    move-result v7

    const/16 v8, 0x8

    const/4 v9, 0x5

    invoke-static {v7, v8, v9}, Ll/ܰ۫ۡ;->ۧ(III)I

    move-result v7

    .line 422
    invoke-static {v6}, Landroid/graphics/Color;->green(I)I

    move-result v10

    invoke-static {v10, v8, v9}, Ll/ܰ۫ۡ;->ۧ(III)I

    move-result v10

    .line 423
    invoke-static {v6}, Landroid/graphics/Color;->blue(I)I

    move-result v6

    invoke-static {v6, v8, v9}, Ll/ܰ۫ۡ;->ۧ(III)I

    move-result v6

    shl-int/lit8 v7, v7, 0xa

    shl-int/lit8 v8, v10, 0x5

    or-int/2addr v7, v8

    or-int/2addr v6, v7

    .line 67
    aget v7, v1, v6

    add-int/2addr v7, v5

    aput v7, v1, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v2, 0x0

    :goto_1
    if-ge p1, v0, :cond_2

    .line 76
    aget v4, v1, p1

    if-lez v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 88
    :cond_2
    new-array p1, v2, [I

    iput-object p1, p0, Ll/ܰ۫ۡ;->֫:[I

    const/4 v4, 0x0

    const/4 v6, 0x0

    :goto_2
    if-ge v4, v0, :cond_4

    .line 91
    aget v7, v1, v4

    if-lez v7, :cond_3

    add-int/lit8 v7, v6, 0x1

    .line 92
    aput v4, p1, v6

    move v6, v7

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    if-gt v2, v5, :cond_6

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰ۫ۡ;->ܽ:Ljava/util/ArrayList;

    :goto_3
    if-ge v3, v2, :cond_5

    .line 103
    aget v0, p1, v3

    .line 104
    iget-object v4, p0, Ll/ܰ۫ۡ;->ܽ:Ljava/util/ArrayList;

    new-instance v5, Ll/ۛ۠ۧ;

    shr-int/lit8 v6, v0, 0xa

    and-int/lit8 v6, v6, 0x1f

    shr-int/lit8 v7, v0, 0x5

    and-int/lit8 v7, v7, 0x1f

    and-int/lit8 v8, v0, 0x1f

    .line 437
    invoke-static {v6, v7, v8}, Ll/ܰ۫ۡ;->֫(III)I

    move-result v6

    .line 104
    aget v0, v1, v0

    invoke-direct {v5, v6, v0}, Ll/ۛ۠ۧ;-><init>(II)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    return-void

    .line 132
    :cond_6
    new-instance p1, Ljava/util/PriorityQueue;

    sget-object v0, Ll/ܰ۫ۡ;->ᩳ:Ll/ۨ۫ۡ;

    invoke-direct {p1, v5, v0}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 135
    new-instance v0, Ll/᩺۫ۡ;

    iget-object v1, p0, Ll/ܰ۫ۡ;->֫:[I

    array-length v1, v1

    sub-int/2addr v1, v5

    invoke-direct {v0, p0, v3, v1}, Ll/᩺۫ۡ;-><init>(Ll/ܰ۫ۡ;II)V

    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 156
    :goto_4
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->size()I

    move-result v0

    if-ge v0, v5, :cond_7

    .line 157
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺۫ۡ;

    if-eqz v0, :cond_7

    .line 159
    invoke-virtual {v0}, Ll/᩺۫ۡ;->֫()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 161
    invoke-virtual {v0}, Ll/᩺۫ۡ;->ܿ()Ll/᩺۫ۡ;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 167
    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    goto :goto_4

    .line 179
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/PriorityQueue;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 180
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺۫ۡ;

    .line 181
    invoke-virtual {v1}, Ll/᩺۫ۡ;->ܽ()Ll/ۛ۠ۧ;

    move-result-object v1

    .line 184
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 113
    :cond_8
    iput-object v0, p0, Ll/ܰ۫ۡ;->ܽ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(III)I
    .locals 2

    const/4 v0, 0x5

    const/16 v1, 0x8

    .line 431
    invoke-static {p0, v0, v1}, Ll/ܰ۫ۡ;->ۧ(III)I

    move-result p0

    .line 432
    invoke-static {p1, v0, v1}, Ll/ܰ۫ۡ;->ۧ(III)I

    move-result p1

    .line 433
    invoke-static {p2, v0, v1}, Ll/ܰ۫ۡ;->ۧ(III)I

    move-result p2

    .line 431
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

    .line 403
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

    .line 406
    aput p0, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-gt p1, p2, :cond_2

    .line 394
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

    .line 397
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
