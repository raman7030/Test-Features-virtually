.class public final Ll/ۨ۠᩵;
.super Ll/ۤ۠᩵;
.source "M9MB"


# static fields
.field public static final ۙ:[Ljava/lang/Object;


# instance fields
.field public ᩶:I

.field public ᩸:[Ljava/lang/Object;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 662
    sput-object v0, Ll/ۨ۠᩵;->ۙ:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 39
    sget-object v0, Ll/ۨ۠᩵;->ۙ:[Ljava/lang/Object;

    iput-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    return-void
.end method

.method private final ֫(ILjava/util/Collection;)V
    .locals 4

    .line 266
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 268
    iget-object v1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v1, v1

    :goto_0
    if-ge p1, v1, :cond_0

    .line 269
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 270
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 272
    :cond_0
    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p1, :cond_1

    .line 273
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 274
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 21
    :cond_1
    iget p1, p0, Ll/ۨ۠᩵;->᩶:I

    .line 277
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, Ll/ۨ۠᩵;->᩶:I

    return-void
.end method

.method private final ۧ(I)V
    .locals 4

    if-ltz p1, :cond_6

    .line 59
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v1, v0

    if-gt p1, v1, :cond_0

    return-void

    .line 60
    :cond_0
    sget-object v1, Ll/ۨ۠᩵;->ۙ:[Ljava/lang/Object;

    if-ne v0, v1, :cond_2

    const/16 v0, 0xa

    if-ge p1, v0, :cond_1

    const/16 p1, 0xa

    .line 61
    :cond_1
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    return-void

    .line 65
    :cond_2
    array-length v1, v0

    shr-int/lit8 v2, v1, 0x1

    add-int/2addr v1, v2

    sub-int v2, v1, p1

    if-gez v2, :cond_3

    move v1, p1

    :cond_3
    const v2, 0x7ffffff7

    sub-int v3, v1, v2

    if-lez v3, :cond_5

    if-le p1, v2, :cond_4

    const v1, 0x7fffffff

    goto :goto_0

    :cond_4
    const v1, 0x7ffffff7

    .line 73
    :cond_5
    :goto_0
    new-array p1, v1, [Ljava/lang/Object;

    .line 74
    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v3, v1, v2, v0, p1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 75
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v1, v0

    iget v2, p0, Ll/ۨ۠᩵;->᩹:I

    sub-int/2addr v1, v2

    invoke-static {v1, v3, v2, v0, p1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 76
    iput v3, p0, Ll/ۨ۠᩵;->᩹:I

    .line 77
    iput-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    return-void

    .line 58
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Deque is too big."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final ۧ(II)V
    .locals 3

    const/4 v0, 0x0

    if-ge p1, p2, :cond_0

    .line 645
    iget-object v1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    invoke-static {v1, v0, p1, p2}, Ll/᩺۠᩵;->֫([Ljava/lang/Object;Ll/ܶۛ᩵;II)V

    return-void

    .line 647
    :cond_0
    iget-object v1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v2, v1

    .line 1555
    invoke-static {v1, p1, v2, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 648
    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p2}, Ll/᩺۠᩵;->֫([Ljava/lang/Object;Ll/ܶۛ᩵;II)V

    return-void
.end method

.method private final ܽ()V
    .locals 1

    .line 653
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method private final ܿ(I)I
    .locals 1

    if-gez p1, :cond_0

    .line 88
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v0, v0

    add-int/2addr p1, v0

    :cond_0
    return p1
.end method

.method private final ᩳ(I)I
    .locals 2

    .line 93
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    const-string v1, "<this>"

    .line 0
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8345
    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private final ᩻(I)I
    .locals 2

    .line 86
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    array-length v0, v0

    sub-int/2addr p1, v0

    :cond_0
    return p1
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 7

    .line 21
    iget v0, p0, Ll/ۨ۠᩵;->᩶:I

    if-ltz p1, :cond_7

    if-gt p1, v0, :cond_7

    if-ne p1, v0, :cond_0

    .line 195
    invoke-virtual {p0, p2}, Ll/ۨ۠᩵;->addLast(Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 198
    invoke-virtual {p0, p2}, Ll/ۨ۠᩵;->addFirst(Ljava/lang/Object;)V

    return-void

    .line 202
    :cond_1
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 21
    iget v0, p0, Ll/ۨ۠᩵;->᩶:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 203
    invoke-direct {p0, v0}, Ll/ۨ۠᩵;->ۧ(I)V

    .line 230
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v0

    .line 21
    iget v2, p0, Ll/ۨ۠᩵;->᩶:I

    add-int/lit8 v3, v2, 0x1

    shr-int/2addr v3, v1

    const/4 v4, 0x0

    if-ge p1, v3, :cond_5

    const-string p1, "<this>"

    if-nez v0, :cond_2

    .line 95
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    .line 0
    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8345
    array-length v0, v0

    :cond_2
    sub-int/2addr v0, v1

    .line 235
    iget v2, p0, Ll/ۨ۠᩵;->᩹:I

    if-nez v2, :cond_3

    .line 95
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    .line 0
    invoke-static {v2, p1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8345
    array-length p1, v2

    sub-int/2addr p1, v1

    goto :goto_0

    :cond_3
    add-int/lit8 p1, v2, -0x1

    .line 237
    :goto_0
    iget v2, p0, Ll/ۨ۠᩵;->᩹:I

    if-lt v0, v2, :cond_4

    .line 238
    iget-object v3, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v4, v3, v2

    aput-object v4, v3, p1

    add-int/lit8 v4, v2, 0x1

    add-int/lit8 v5, v0, 0x1

    .line 239
    invoke-static {v2, v4, v5, v3, v3}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_1

    .line 241
    :cond_4
    iget-object v3, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    add-int/lit8 v5, v2, -0x1

    array-length v6, v3

    invoke-static {v5, v2, v6, v3, v3}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 242
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v3, v2

    sub-int/2addr v3, v1

    aget-object v5, v2, v4

    aput-object v5, v2, v3

    add-int/lit8 v3, v0, 0x1

    .line 243
    invoke-static {v4, v1, v3, v2, v2}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 246
    :goto_1
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aput-object p2, v2, v0

    .line 247
    iput p1, p0, Ll/ۨ۠᩵;->᩹:I

    goto :goto_3

    .line 250
    :cond_5
    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr v2, p1

    invoke-direct {p0, v2}, Ll/ۨ۠᩵;->᩻(I)I

    move-result p1

    if-ge v0, p1, :cond_6

    .line 253
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v3, v0, p1, v2, v2}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_2

    .line 255
    :cond_6
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    invoke-static {v1, v4, p1, v2, v2}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 256
    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v2, p1

    sub-int/2addr v2, v1

    aget-object v2, p1, v2

    aput-object v2, p1, v4

    add-int/lit8 v2, v0, 0x1

    .line 257
    array-length v3, p1

    sub-int/2addr v3, v1

    invoke-static {v2, v0, v3, p1, p1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 260
    :goto_2
    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aput-object p2, p1, v0

    .line 21
    :goto_3
    iget p1, p0, Ll/ۨ۠᩵;->᩶:I

    add-int/2addr p1, v1

    .line 262
    iput p1, p0, Ll/ۨ۠᩵;->᩶:I

    return-void

    .line 124
    :cond_7
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index: "

    const-string v2, ", size: "

    .line 0
    invoke-static {v1, p1, v0, v2}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 124
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 187
    invoke-virtual {p0, p1}, Ll/ۨ۠᩵;->addLast(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 8

    const-string v0, "elements"

    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iget v0, p0, Ll/ۨ۠᩵;->᩶:I

    if-ltz p1, :cond_b

    if-gt p1, v0, :cond_b

    .line 294
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 21
    :cond_0
    iget v0, p0, Ll/ۨ۠᩵;->᩶:I

    if-ne p1, v0, :cond_1

    .line 297
    invoke-virtual {p0, p2}, Ll/ۨ۠᩵;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    .line 300
    :cond_1
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 21
    iget v0, p0, Ll/ۨ۠᩵;->᩶:I

    .line 301
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v2, v0

    invoke-direct {p0, v2}, Ll/ۨ۠᩵;->ۧ(I)V

    .line 303
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    .line 21
    iget v2, p0, Ll/ۨ۠᩵;->᩶:I

    add-int/2addr v2, v0

    .line 303
    invoke-direct {p0, v2}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v0

    .line 304
    iget v2, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr v2, p1

    invoke-direct {p0, v2}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v2

    .line 305
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v3

    .line 21
    iget v4, p0, Ll/ۨ۠᩵;->᩶:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    shr-int/2addr v4, v5

    if-ge p1, v4, :cond_6

    .line 310
    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    sub-int v0, p1, v3

    if-lt v2, p1, :cond_4

    if-ltz v0, :cond_2

    .line 314
    iget-object v1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    invoke-static {v0, p1, v2, v1, v1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_0

    .line 316
    :cond_2
    iget-object v4, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v6, v4

    add-int/2addr v0, v6

    sub-int v6, v2, p1

    .line 318
    array-length v7, v4

    sub-int/2addr v7, v0

    if-lt v7, v6, :cond_3

    .line 321
    invoke-static {v0, p1, v2, v4, v4}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    add-int v6, p1, v7

    .line 323
    invoke-static {v0, p1, v6, v4, v4}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 324
    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    iget v4, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr v4, v7

    invoke-static {v1, v4, v2, p1, p1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_0

    .line 328
    :cond_4
    iget-object v4, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v6, v4

    invoke-static {v0, p1, v6, v4, v4}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    if-lt v3, v2, :cond_5

    .line 330
    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v4, p1

    sub-int/2addr v4, v3

    invoke-static {v4, v1, v2, p1, p1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_0

    .line 332
    :cond_5
    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v4, p1

    sub-int/2addr v4, v3

    invoke-static {v4, v1, v3, p1, p1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 333
    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    invoke-static {v1, v3, v2, p1, p1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 336
    :goto_0
    iput v0, p0, Ll/ۨ۠᩵;->᩹:I

    sub-int/2addr v2, v3

    .line 337
    invoke-direct {p0, v2}, Ll/ۨ۠᩵;->ܿ(I)I

    move-result p1

    invoke-direct {p0, p1, p2}, Ll/ۨ۠᩵;->֫(ILjava/util/Collection;)V

    return v5

    :cond_6
    add-int p1, v2, v3

    if-ge v2, v0, :cond_9

    add-int/2addr v3, v0

    .line 344
    iget-object v4, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v6, v4

    if-gt v3, v6, :cond_7

    .line 345
    invoke-static {p1, v2, v0, v4, v4}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_1

    .line 347
    :cond_7
    array-length v6, v4

    if-lt p1, v6, :cond_8

    .line 348
    array-length v1, v4

    sub-int/2addr p1, v1

    invoke-static {p1, v2, v0, v4, v4}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_1

    .line 350
    :cond_8
    array-length v6, v4

    sub-int/2addr v3, v6

    sub-int v3, v0, v3

    .line 351
    invoke-static {v1, v3, v0, v4, v4}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 352
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    invoke-static {p1, v2, v3, v0, v0}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_1

    .line 356
    :cond_9
    iget-object v4, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    invoke-static {v3, v1, v0, v4, v4}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 357
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v4, v0

    if-lt p1, v4, :cond_a

    .line 358
    array-length v1, v0

    sub-int/2addr p1, v1

    array-length v1, v0

    invoke-static {p1, v2, v1, v0, v0}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_1

    .line 360
    :cond_a
    array-length v4, v0

    sub-int/2addr v4, v3

    array-length v6, v0

    invoke-static {v1, v4, v6, v0, v0}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 361
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v1, v0

    sub-int/2addr v1, v3

    invoke-static {p1, v2, v1, v0, v0}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 364
    :goto_1
    invoke-direct {p0, v2, p2}, Ll/ۨ۠᩵;->֫(ILjava/util/Collection;)V

    return v5

    .line 124
    :cond_b
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index: "

    const-string v2, ", size: "

    .line 0
    invoke-static {v1, p1, v0, v2}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 124
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 2

    const-string v0, "elements"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 284
    :cond_0
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v0

    .line 285
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->ۧ(I)V

    .line 286
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v1

    add-int/2addr v1, v0

    .line 286
    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v0

    invoke-direct {p0, v0, p1}, Ll/ۨ۠᩵;->֫(ILjava/util/Collection;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addFirst(Ljava/lang/Object;)V
    .locals 2

    .line 123
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 21
    iget v0, p0, Ll/ۨ۠᩵;->᩶:I

    add-int/lit8 v0, v0, 0x1

    .line 124
    invoke-direct {p0, v0}, Ll/ۨ۠᩵;->ۧ(I)V

    .line 126
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    if-nez v0, :cond_0

    .line 95
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    const-string v1, "<this>"

    .line 0
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8345
    array-length v0, v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 126
    iput v0, p0, Ll/ۨ۠᩵;->᩹:I

    .line 127
    iget-object v1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aput-object p1, v1, v0

    .line 21
    iget p1, p0, Ll/ۨ۠᩵;->᩶:I

    add-int/lit8 p1, p1, 0x1

    .line 128
    iput p1, p0, Ll/ۨ۠᩵;->᩶:I

    return-void
.end method

.method public final addLast(Ljava/lang/Object;)V
    .locals 3

    .line 135
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 136
    invoke-direct {p0, v0}, Ll/ۨ۠᩵;->ۧ(I)V

    .line 138
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v2

    add-int/2addr v2, v1

    .line 138
    invoke-direct {p0, v2}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v1

    aput-object p1, v0, v1

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 139
    iput p1, p0, Ll/ۨ۠᩵;->᩶:I

    return-void
.end method

.method public final clear()V
    .locals 2

    .line 544
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 545
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 547
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v1

    add-int/2addr v1, v0

    .line 547
    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v0

    .line 548
    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    invoke-direct {p0, v1, v0}, Ll/ۨ۠᩵;->ۧ(II)V

    :cond_0
    const/4 v0, 0x0

    .line 550
    iput v0, p0, Ll/ۨ۠᩵;->᩹:I

    .line 551
    iput v0, p0, Ll/ۨ۠᩵;->᩶:I

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 387
    invoke-virtual {p0, p1}, Ll/ۨ۠᩵;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 4

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v0

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 373
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr v1, p1

    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1

    .line 118
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "index: "

    const-string v3, ", size: "

    .line 0
    invoke-static {v2, p1, v0, v3}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 118
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 4

    .line 390
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v1

    add-int/2addr v1, v0

    .line 390
    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v0

    .line 392
    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    if-ge v1, v0, :cond_1

    :goto_0
    if-ge v1, v0, :cond_5

    .line 394
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-static {p1, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    goto :goto_3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 396
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    if-lt v1, v0, :cond_5

    .line 397
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v2, v2

    :goto_1
    if-ge v1, v2, :cond_3

    .line 398
    iget-object v3, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v3, v3, v1

    invoke-static {p1, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    goto :goto_3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_5

    .line 401
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-static {p1, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length p1, p1

    add-int/2addr v1, p1

    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    :goto_3
    sub-int/2addr v1, p1

    return v1

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    const/4 p1, -0x1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 4

    .line 409
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    .line 21
    iget v1, p0, Ll/ۨ۠᩵;->᩶:I

    add-int/2addr v1, v0

    .line 409
    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v0

    .line 411
    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    const/4 v2, -0x1

    if-ge v1, v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    if-gt v1, v0, :cond_5

    .line 413
    :goto_0
    iget-object v3, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v3, v3, v0

    invoke-static {p1, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    goto :goto_2

    :cond_0
    if-eq v0, v1, :cond_5

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 415
    :cond_1
    invoke-virtual {p0}, Ll/ۨ۠᩵;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    if-lt v1, v0, :cond_5

    :cond_2
    add-int/lit8 v0, v0, -0x1

    if-ge v2, v0, :cond_3

    .line 417
    iget-object v1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-static {p1, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length p1, p1

    add-int/2addr v0, p1

    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    goto :goto_2

    .line 419
    :cond_3
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    const-string v1, "<this>"

    .line 0
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8345
    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    .line 419
    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    if-gt v1, v0, :cond_5

    .line 420
    :goto_1
    iget-object v3, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v3, v3, v0

    invoke-static {p1, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    :goto_2
    sub-int/2addr v0, p1

    return v0

    :cond_4
    if-eq v0, v1, :cond_5

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_5
    return v2
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 429
    invoke-virtual {p0, p1}, Ll/ۨ۠᩵;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 431
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۨ۠᩵;->֫(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 10

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    invoke-virtual {p0}, Ll/ۨ۠᩵;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v0, v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 491
    :cond_0
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    .line 21
    iget v2, p0, Ll/ۨ۠᩵;->᩶:I

    add-int/2addr v2, v0

    .line 491
    invoke-direct {p0, v2}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v0

    .line 492
    iget v2, p0, Ll/ۨ۠᩵;->᩹:I

    const/4 v3, 0x0

    if-ge v2, v0, :cond_3

    move v4, v2

    :goto_0
    if-ge v2, v0, :cond_2

    .line 497
    iget-object v5, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v5, v5, v2

    .line 482
    invoke-interface {p1, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 501
    iget-object v6, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    add-int/lit8 v7, v4, 0x1

    aput-object v5, v6, v4

    move v4, v7

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 506
    :cond_2
    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    invoke-static {p1, v3, v4, v0}, Ll/᩺۠᩵;->֫([Ljava/lang/Object;Ll/ܶۛ᩵;II)V

    goto :goto_6

    .line 509
    :cond_3
    iget-object v4, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v4, v4

    const/4 v5, 0x0

    move v5, v2

    const/4 v6, 0x0

    :goto_2
    if-ge v2, v4, :cond_5

    .line 510
    iget-object v7, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v8, v7, v2

    .line 511
    aput-object v3, v7, v2

    .line 482
    invoke-interface {p1, v8}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 515
    iget-object v7, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    add-int/lit8 v9, v5, 0x1

    aput-object v8, v7, v5

    move v5, v9

    goto :goto_3

    :cond_4
    const/4 v6, 0x1

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 520
    :cond_5
    invoke-direct {p0, v5}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v2

    move v4, v2

    :goto_4
    if-ge v1, v0, :cond_7

    .line 523
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v5, v2, v1

    .line 524
    aput-object v3, v2, v1

    .line 482
    invoke-interface {p1, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 528
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aput-object v5, v2, v4

    .line 529
    invoke-direct {p0, v4}, Ll/ۨ۠᩵;->ᩳ(I)I

    move-result v4

    goto :goto_5

    :cond_6
    const/4 v2, 0x1

    const/4 v6, 0x1

    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    move v1, v6

    :goto_6
    if-eqz v1, :cond_8

    .line 536
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 537
    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    sub-int/2addr v4, p1

    invoke-direct {p0, v4}, Ll/ۨ۠᩵;->ܿ(I)I

    move-result p1

    iput p1, p0, Ll/ۨ۠᩵;->᩶:I

    :cond_8
    :goto_7
    return v1
.end method

.method public final removeFirst()Ljava/lang/Object;
    .locals 4

    .line 147
    invoke-virtual {p0}, Ll/ۨ۠᩵;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 148
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 150
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    aget-object v2, v0, v1

    const/4 v3, 0x0

    .line 151
    aput-object v3, v0, v1

    .line 152
    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->ᩳ(I)I

    move-result v0

    iput v0, p0, Ll/ۨ۠᩵;->᩹:I

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 153
    iput v0, p0, Ll/ۨ۠᩵;->᩶:I

    return-object v2

    .line 147
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "ArrayDeque is empty."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final removeLast()Ljava/lang/Object;
    .locals 4

    .line 168
    invoke-virtual {p0}, Ll/ۨ۠᩵;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 169
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 171
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    invoke-static {p0}, Ll/֫ܶ᩵;->֫(Ljava/util/List;)I

    move-result v1

    add-int/2addr v1, v0

    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v0

    .line 172
    iget-object v1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v2, v1, v0

    const/4 v3, 0x0

    .line 173
    aput-object v3, v1, v0

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 174
    iput v0, p0, Ll/ۨ۠᩵;->᩶:I

    return-object v2

    .line 168
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "ArrayDeque is empty."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final removeRange(II)V
    .locals 7

    .line 21
    iget v0, p0, Ll/ۨ۠᩵;->᩶:I

    .line 577
    invoke-static {p1, p2, v0}, Ll/᩶۠᩵;->֫(III)V

    sub-int v0, p2, p1

    if-nez v0, :cond_0

    return-void

    .line 21
    :cond_0
    iget v1, p0, Ll/ۨ۠᩵;->᩶:I

    if-ne v0, v1, :cond_1

    .line 583
    invoke-virtual {p0}, Ll/ۨ۠᩵;->clear()V

    return-void

    :cond_1
    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 587
    invoke-virtual {p0, p1}, Ll/ۨ۠᩵;->֫(I)Ljava/lang/Object;

    return-void

    .line 592
    :cond_2
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 21
    iget v2, p0, Ll/ۨ۠᩵;->᩶:I

    sub-int/2addr v2, p2

    if-ge p1, v2, :cond_4

    add-int/lit8 v2, p1, -0x1

    .line 613
    iget v3, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr v3, v2

    invoke-direct {p0, v3}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v2

    sub-int/2addr p2, v1

    .line 614
    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr v1, p2

    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result p2

    :goto_0
    if-lez p1, :cond_3

    add-int/lit8 v1, v2, 0x1

    add-int/lit8 v3, p2, 0x1

    .line 618
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 619
    iget-object v4, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    sub-int/2addr p2, v3

    add-int/lit8 v5, p2, 0x1

    sub-int/2addr v2, v3

    add-int/lit8 v6, v2, 0x1

    invoke-static {v5, v6, v1, v4, v4}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 621
    invoke-direct {p0, v2}, Ll/ۨ۠᩵;->ܿ(I)I

    move-result v2

    .line 622
    invoke-direct {p0, p2}, Ll/ۨ۠᩵;->ܿ(I)I

    move-result p2

    sub-int/2addr p1, v3

    goto :goto_0

    .line 598
    :cond_3
    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr p1, v0

    invoke-direct {p0, p1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result p1

    .line 599
    iget p2, p0, Ll/ۨ۠᩵;->᩹:I

    invoke-direct {p0, p2, p1}, Ll/ۨ۠᩵;->ۧ(II)V

    .line 600
    iput p1, p0, Ll/ۨ۠᩵;->᩹:I

    goto :goto_2

    .line 628
    :cond_4
    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr v1, p2

    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v1

    .line 629
    iget v2, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr v2, p1

    invoke-direct {p0, v2}, Ll/ۨ۠᩵;->᩻(I)I

    move-result p1

    .line 21
    iget v2, p0, Ll/ۨ۠᩵;->᩶:I

    :goto_1
    sub-int/2addr v2, p2

    if-lez v2, :cond_5

    .line 633
    iget-object p2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v3, p2

    sub-int/2addr v3, v1

    array-length p2, p2

    sub-int/2addr p2, p1

    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 634
    iget-object v3, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    add-int v4, v1, p2

    invoke-static {p1, v1, v4, v3, v3}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 636
    invoke-direct {p0, v4}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v1

    add-int/2addr p1, p2

    .line 637
    invoke-direct {p0, p1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result p1

    goto :goto_1

    .line 605
    :cond_5
    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    .line 21
    iget p2, p0, Ll/ۨ۠᩵;->᩶:I

    add-int/2addr p2, p1

    .line 605
    invoke-direct {p0, p2}, Ll/ۨ۠᩵;->᩻(I)I

    move-result p1

    sub-int p2, p1, v0

    .line 606
    invoke-direct {p0, p2}, Ll/ۨ۠᩵;->ܿ(I)I

    move-result p2

    invoke-direct {p0, p2, p1}, Ll/ۨ۠᩵;->ۧ(II)V

    .line 21
    :goto_2
    iget p1, p0, Ll/ۨ۠᩵;->᩶:I

    sub-int/2addr p1, v0

    .line 609
    iput p1, p0, Ll/ۨ۠᩵;->᩶:I

    return-void
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 10

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    invoke-virtual {p0}, Ll/ۨ۠᩵;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v0, v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 491
    :cond_0
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    .line 21
    iget v2, p0, Ll/ۨ۠᩵;->᩶:I

    add-int/2addr v2, v0

    .line 491
    invoke-direct {p0, v2}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v0

    .line 492
    iget v2, p0, Ll/ۨ۠᩵;->᩹:I

    const/4 v3, 0x0

    if-ge v2, v0, :cond_3

    move v4, v2

    :goto_0
    if-ge v2, v0, :cond_2

    .line 497
    iget-object v5, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v5, v5, v2

    .line 485
    invoke-interface {p1, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 501
    iget-object v6, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    add-int/lit8 v7, v4, 0x1

    aput-object v5, v6, v4

    move v4, v7

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 506
    :cond_2
    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    invoke-static {p1, v3, v4, v0}, Ll/᩺۠᩵;->֫([Ljava/lang/Object;Ll/ܶۛ᩵;II)V

    goto :goto_6

    .line 509
    :cond_3
    iget-object v4, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v4, v4

    const/4 v5, 0x0

    move v5, v2

    const/4 v6, 0x0

    :goto_2
    if-ge v2, v4, :cond_5

    .line 510
    iget-object v7, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v8, v7, v2

    .line 511
    aput-object v3, v7, v2

    .line 485
    invoke-interface {p1, v8}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 515
    iget-object v7, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    add-int/lit8 v9, v5, 0x1

    aput-object v8, v7, v5

    move v5, v9

    goto :goto_3

    :cond_4
    const/4 v6, 0x1

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 520
    :cond_5
    invoke-direct {p0, v5}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v2

    move v4, v2

    :goto_4
    if-ge v1, v0, :cond_7

    .line 523
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v5, v2, v1

    .line 524
    aput-object v3, v2, v1

    .line 485
    invoke-interface {p1, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 528
    iget-object v2, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aput-object v5, v2, v4

    .line 529
    invoke-direct {p0, v4}, Ll/ۨ۠᩵;->ᩳ(I)I

    move-result v4

    goto :goto_5

    :cond_6
    const/4 v2, 0x1

    const/4 v6, 0x1

    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    move v1, v6

    :goto_6
    if-eqz v1, :cond_8

    .line 536
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 537
    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    sub-int/2addr v4, p1

    invoke-direct {p0, v4}, Ll/ۨ۠᩵;->ܿ(I)I

    move-result p1

    iput p1, p0, Ll/ۨ۠᩵;->᩶:I

    :cond_8
    :goto_7
    return v1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v0

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 380
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Ll/ۨ۠᩵;->᩻(I)I

    move-result p1

    .line 381
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v1, v0, p1

    .line 382
    aput-object p2, v0, p1

    return-object v1

    .line 118
    :cond_0
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index: "

    const-string v2, ", size: "

    .line 0
    invoke-static {v1, p1, v0, v2}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 118
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v0

    .line 573
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ll/ۨ۠᩵;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 6

    const-string v0, "array"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 557
    array-length v0, p1

    .line 21
    iget v1, p0, Ll/ۨ۠᩵;->᩶:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Ljava/lang/Object;

    .line 559
    :goto_0
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    .line 21
    iget v1, p0, Ll/ۨ۠᩵;->᩶:I

    add-int/2addr v1, v0

    .line 559
    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v4

    .line 560
    iget v3, p0, Ll/ۨ۠᩵;->᩹:I

    if-ge v3, v4, :cond_1

    .line 561
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v5, 0x2

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Ll/᩺۠᩵;->֫([Ljava/lang/Object;[Ljava/lang/Object;IIII)V

    goto :goto_1

    .line 562
    :cond_1
    invoke-virtual {p0}, Ll/ۨ۠᩵;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 563
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    iget v1, p0, Ll/ۨ۠᩵;->᩹:I

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v3, v1, v2, v0, p1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 564
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v1, v0

    iget v2, p0, Ll/ۨ۠᩵;->᩹:I

    sub-int/2addr v1, v2

    invoke-static {v1, v3, v4, v0, p1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 21
    :cond_2
    :goto_1
    iget v0, p0, Ll/ۨ۠᩵;->᩶:I

    .line 96
    array-length v1, p1

    if-ge v0, v1, :cond_3

    const/4 v1, 0x0

    .line 98
    aput-object v1, p1, v0

    :cond_3
    return-object p1
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 8

    .line 21
    iget v0, p0, Ll/ۨ۠᩵;->᩶:I

    if-ltz p1, :cond_5

    if-ge p1, v0, :cond_5

    .line 439
    invoke-static {p0}, Ll/֫ܶ᩵;->֫(Ljava/util/List;)I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 440
    invoke-virtual {p0}, Ll/ۨ۠᩵;->removeLast()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    .line 442
    invoke-virtual {p0}, Ll/ۨ۠᩵;->removeFirst()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 445
    :cond_1
    invoke-direct {p0}, Ll/ۨ۠᩵;->ܽ()V

    .line 447
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Ll/ۨ۠᩵;->᩻(I)I

    move-result v0

    .line 448
    iget-object v1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aget-object v2, v1, v0

    .line 21
    iget v3, p0, Ll/ۨ۠᩵;->᩶:I

    const/4 v4, 0x1

    shr-int/2addr v3, v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-ge p1, v3, :cond_3

    .line 452
    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    if-lt v0, p1, :cond_2

    add-int/lit8 v3, p1, 0x1

    .line 453
    invoke-static {v3, p1, v0, v1, v1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_0

    .line 455
    :cond_2
    invoke-static {v4, v6, v0, v1, v1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 456
    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v0, p1

    sub-int/2addr v0, v4

    aget-object v0, p1, v0

    aput-object v0, p1, v6

    .line 457
    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    add-int/lit8 v1, v0, 0x1

    array-length v3, p1

    sub-int/2addr v3, v4

    invoke-static {v1, v0, v3, p1, p1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 460
    :goto_0
    iget-object p1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    iget v0, p0, Ll/ۨ۠᩵;->᩹:I

    aput-object v5, p1, v0

    .line 461
    invoke-direct {p0, v0}, Ll/ۨ۠᩵;->ᩳ(I)I

    move-result p1

    iput p1, p0, Ll/ۨ۠᩵;->᩹:I

    goto :goto_2

    .line 464
    :cond_3
    iget p1, p0, Ll/ۨ۠᩵;->᩹:I

    invoke-static {p0}, Ll/֫ܶ᩵;->֫(Ljava/util/List;)I

    move-result v1

    add-int/2addr v1, p1

    invoke-direct {p0, v1}, Ll/ۨ۠᩵;->᩻(I)I

    move-result p1

    if-gt v0, p1, :cond_4

    .line 467
    iget-object v1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    add-int/lit8 v3, v0, 0x1

    add-int/lit8 v6, p1, 0x1

    invoke-static {v0, v3, v6, v1, v1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_1

    .line 469
    :cond_4
    iget-object v1, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    add-int/lit8 v3, v0, 0x1

    array-length v7, v1

    invoke-static {v0, v3, v7, v1, v1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 470
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    array-length v1, v0

    sub-int/2addr v1, v4

    aget-object v3, v0, v6

    aput-object v3, v0, v1

    add-int/lit8 v1, p1, 0x1

    .line 471
    invoke-static {v6, v4, v1, v0, v0}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 474
    :goto_1
    iget-object v0, p0, Ll/ۨ۠᩵;->᩸:[Ljava/lang/Object;

    aput-object v5, v0, p1

    .line 21
    :goto_2
    iget p1, p0, Ll/ۨ۠᩵;->᩶:I

    sub-int/2addr p1, v4

    .line 476
    iput p1, p0, Ll/ۨ۠᩵;->᩶:I

    return-object v2

    .line 118
    :cond_5
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "index: "

    const-string v3, ", size: "

    .line 0
    invoke-static {v2, p1, v0, v3}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 118
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۧ()I
    .locals 1

    .line 21
    iget v0, p0, Ll/ۨ۠᩵;->᩶:I

    return v0
.end method
