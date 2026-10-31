.class public final Ll/᩷۟ᩳ;
.super Ljava/util/AbstractList;
.source "1BJ4"


# instance fields
.field public final ᩸:Ll/ۧ۟ᩳ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 8
    new-instance v0, Ll/ۧ۟ᩳ;

    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 8
    new-instance p1, Ll/ۧ۟ᩳ;

    .line 7
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 8
    new-instance v0, Ll/ۧ۟ᩳ;

    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    .line 12
    invoke-virtual {p0, p1}, Ll/᩷۟ᩳ;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private ֫(IIZ)Z
    .locals 0

    .line 215
    invoke-virtual {p0, p1}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result p1

    if-lt p1, p2, :cond_1

    if-eqz p3, :cond_0

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private ۧ(IIZ)I
    .locals 10

    .line 183
    invoke-direct {p0, p2, p1, p3}, Ll/᩷۟ᩳ;->֫(IIZ)Z

    move-result v0

    const-wide/16 v1, 0x1

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    add-int/lit8 v0, p2, 0x1

    .line 30
    iget-object v4, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v4}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v5

    :goto_0
    invoke-virtual {v4}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v6

    int-to-long v6, v6

    int-to-long v8, p2

    sub-long/2addr v6, v8

    cmp-long v8, v1, v6

    if-gez v8, :cond_4

    long-to-int v6, v1

    add-int/2addr v6, p2

    .line 188
    invoke-direct {p0, v6, p1, p3}, Ll/᩷۟ᩳ;->֫(IIZ)Z

    move-result v7

    if-nez v7, :cond_0

    move v5, v6

    goto :goto_2

    :cond_0
    add-int/lit8 v0, v6, 0x1

    shl-long/2addr v1, v3

    goto :goto_0

    :cond_1
    move v5, p2

    :goto_1
    int-to-long v6, p2

    cmp-long v0, v1, v6

    if-gtz v0, :cond_3

    long-to-int v0, v1

    sub-int v0, p2, v0

    .line 199
    invoke-direct {p0, v0, p1, p3}, Ll/᩷۟ᩳ;->֫(IIZ)Z

    move-result v4

    if-eqz v4, :cond_2

    add-int/2addr v0, v3

    goto :goto_2

    :cond_2
    shl-long/2addr v1, v3

    move v5, v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :cond_4
    :goto_2
    if-ge v0, v5, :cond_6

    add-int p2, v0, v5

    ushr-int/2addr p2, v3

    .line 208
    invoke-direct {p0, p2, p1, p3}, Ll/᩷۟ᩳ;->֫(IIZ)Z

    move-result v1

    if-eqz v1, :cond_5

    add-int/lit8 v0, p2, 0x1

    goto :goto_2

    :cond_5
    move v5, p2

    goto :goto_2

    :cond_6
    return v0
.end method

.method public static bridge synthetic ۧ(Ll/᩷۟ᩳ;)Ll/ۧ۟ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/᩷۟ᩳ;)V
    .locals 1

    .line 7
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    .line 7
    check-cast p2, Ll/ۨܰᩳ;

    invoke-virtual {p0, p1, p2}, Ll/᩷۟ᩳ;->֫(ILl/ۨܰᩳ;)V

    return-void
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    .line 7
    check-cast p1, Ll/ۨܰᩳ;

    invoke-virtual {p0, p1}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 2

    .line 49
    instance-of v0, p2, Ll/᩷۟ᩳ;

    if-eqz v0, :cond_0

    check-cast p2, Ll/᩷۟ᩳ;

    goto :goto_1

    .line 51
    :cond_0
    new-instance v0, Ll/᩷۟ᩳ;

    invoke-direct {v0}, Ll/᩷۟ᩳ;-><init>()V

    .line 52
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨܰᩳ;

    invoke-virtual {v0, v1}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    goto :goto_0

    :cond_1
    move-object p2, v0

    .line 54
    :goto_1
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    iget-object v1, p2, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0, p1, p1, v1}, Ll/ۧ۟ᩳ;->ۧ(IILl/ۧ۟ᩳ;)V

    .line 55
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 56
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 30
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    .line 46
    invoke-virtual {p0, v0, p1}, Ll/᩷۟ᩳ;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    .line 31
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0}, Ll/ۧ۟ᩳ;->֫()V

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final get(I)Ll/ۨܰᩳ;
    .locals 2

    .line 32
    new-instance v0, Ll/ۨܰᩳ;

    invoke-direct {v0}, Ll/ۨܰᩳ;-><init>()V

    iget-object v1, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v1, p1, v0}, Ll/ۧ۟ᩳ;->ۧ(ILl/ۨܰᩳ;)V

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 2

    .line 42
    invoke-virtual {p0, p1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v0

    add-int/lit8 v1, p1, 0x1

    .line 43
    invoke-virtual {p0, p1, v1}, Ll/᩷۟ᩳ;->֫(II)V

    return-object v0
.end method

.method public final removeRange(II)V
    .locals 0

    .line 62
    invoke-virtual {p0, p1, p2}, Ll/᩷۟ᩳ;->֫(II)V

    return-void
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 7
    check-cast p2, Ll/ۨܰᩳ;

    .line 34
    invoke-virtual {p0, p1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v0

    .line 35
    iget-object v1, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v1, p1, p2}, Ll/ۧ۟ᩳ;->ܽ(ILl/ۨܰᩳ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 30
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ֫(I)I
    .locals 4

    .line 30
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_2

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    .line 144
    invoke-virtual {p0, v2}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v3

    if-ge p1, v3, :cond_0

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_0
    if-le p1, v3, :cond_1

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(II)V
    .locals 2

    .line 59
    new-instance v0, Ll/ۧ۟ᩳ;

    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    iget-object v1, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v1, p1, p2, v0}, Ll/ۧ۟ᩳ;->ۧ(IILl/ۧ۟ᩳ;)V

    .line 60
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final ֫(IIII)V
    .locals 1

    .line 72
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۧ۟ᩳ;->֫(IIII)V

    return-void
.end method

.method public final ֫(IILl/᩷۟ᩳ;)V
    .locals 1

    .line 79
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    iget-object p3, p3, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۧ۟ᩳ;->֫(IILl/ۧ۟ᩳ;)V

    .line 80
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final ֫(ILl/ۨܰᩳ;)V
    .locals 1

    .line 39
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0, p1, p2}, Ll/ۧ۟ᩳ;->֫(ILl/ۨܰᩳ;)V

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final ֫(Ll/ۨܰᩳ;)V
    .locals 1

    .line 30
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    .line 40
    invoke-virtual {p0, v0, p1}, Ll/᩷۟ᩳ;->֫(ILl/ۨܰᩳ;)V

    return-void
.end method

.method public final ֫(Ll/᩷۟ᩳ;)V
    .locals 2

    .line 85
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    iget-object v1, p1, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0, v1}, Ll/ۧ۟ᩳ;->֫(Ll/ۧ۟ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 87
    iget v0, p1, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Ljava/util/AbstractList;->modCount:I

    :cond_0
    return-void
.end method

.method public final ۚ(I)I
    .locals 2

    .line 64
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/ۧ۟ᩳ;->ۧ(II)I

    move-result p1

    return p1
.end method

.method public final ۜ(I)Z
    .locals 2

    .line 30
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 106
    invoke-virtual {p0, v0}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v0

    invoke-virtual {p0, p1}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result p1

    if-eq v0, p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۡ(I)I
    .locals 2

    .line 66
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Ll/ۧ۟ᩳ;->ۧ(II)I

    move-result p1

    return p1
.end method

.method public final ۧ(I)I
    .locals 2

    .line 65
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ۧ۟ᩳ;->ۧ(II)I

    move-result p1

    return p1
.end method

.method public final ۧ()Ll/ܰܰᩳ;
    .locals 2

    .line 69
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    new-instance v1, Ll/ܰܰᩳ;

    invoke-direct {v1, v0}, Ll/ܰܰᩳ;-><init>(Ll/ۧ۟ᩳ;)V

    return-object v1
.end method

.method public final ۧ(II)V
    .locals 1

    .line 75
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0, p1, p2}, Ll/ۧ۟ᩳ;->֫(II)V

    return-void
.end method

.method public final ۧ(IILl/᩷۟ᩳ;)V
    .locals 1

    add-int/2addr p2, p1

    .line 241
    iget-object p3, p3, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۧ۟ᩳ;->ۧ(IILl/ۧ۟ᩳ;)V

    .line 242
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final ۧ(ILl/ۨܰᩳ;)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0, p1, p2}, Ll/ۧ۟ᩳ;->ܽ(ILl/ۨܰᩳ;)V

    return-void
.end method

.method public final ܽ()Z
    .locals 4

    .line 30
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 246
    invoke-virtual {p0, v1}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v0

    invoke-virtual {p0, v1}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v3

    if-ne v0, v3, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public final ܿ()I
    .locals 1

    .line 30
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final ܿ(I)I
    .locals 2

    .line 174
    invoke-virtual {p0, p1}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1}, Ll/᩷۟ᩳ;->ۧ(IIZ)I

    move-result p1

    sub-int/2addr p1, v1

    return p1
.end method

.method public final ᩳ(I)I
    .locals 2

    .line 136
    invoke-virtual {p0, p1}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Ll/᩷۟ᩳ;->ۧ(IIZ)I

    move-result p1

    return p1
.end method

.method public final ᩳ(II)I
    .locals 3

    if-ltz p2, :cond_5

    .line 30
    iget-object v0, p0, Ll/᩷۟ᩳ;->᩸:Ll/ۧ۟ᩳ;

    invoke-virtual {v0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v0, -0x1

    .line 161
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 162
    invoke-virtual {p0, p2}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v2

    if-ne v2, p1, :cond_1

    return p2

    :cond_1
    if-ge v2, p1, :cond_3

    const/4 v2, 0x0

    .line 165
    invoke-direct {p0, p1, p2, v2}, Ll/᩷۟ᩳ;->ۧ(IIZ)I

    move-result p2

    if-ge p2, v0, :cond_2

    .line 166
    invoke-virtual {p0, p2}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v0

    if-ne v0, p1, :cond_2

    return p2

    :cond_2
    return v1

    :cond_3
    const/4 v0, 0x1

    .line 168
    invoke-direct {p0, p1, p2, v0}, Ll/᩷۟ᩳ;->ۧ(IIZ)I

    move-result p2

    sub-int/2addr p2, v0

    if-ltz p2, :cond_4

    .line 169
    invoke-virtual {p0, p2}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v0

    if-ne v0, p1, :cond_4

    return p2

    :cond_4
    return v1

    .line 158
    :cond_5
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Negative line index"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ()Ll/ۨܰᩳ;
    .locals 1

    .line 232
    invoke-virtual {p0}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻(I)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, p1, -0x1

    .line 97
    invoke-virtual {p0, v1}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v1

    invoke-virtual {p0, p1}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result p1

    if-eq v1, p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
