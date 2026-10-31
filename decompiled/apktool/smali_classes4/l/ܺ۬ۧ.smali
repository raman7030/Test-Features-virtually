.class public final Ll/ܺ۬ۧ;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public ֫:I

.field public ۧ:Ljava/util/Set;

.field public ܽ:Landroid/util/SparseArray;


# direct methods
.method private ֫(I)Ll/ۡ۬ۧ;
    .locals 2

    .line 6431
    iget-object v0, p0, Ll/ܺ۬ۧ;->ܽ:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ۬ۧ;

    if-nez v1, :cond_0

    .line 6433
    new-instance v1, Ll/ۡ۬ۧ;

    invoke-direct {v1}, Ll/ۡ۬ۧ;-><init>()V

    .line 6434
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final ֫(IJ)V
    .locals 6

    .line 6348
    invoke-direct {p0, p1}, Ll/ܺ۬ۧ;->֫(I)Ll/ۡ۬ۧ;

    move-result-object p1

    .line 6349
    iget-wide v0, p1, Ll/ۡ۬ۧ;->֫:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x4

    .line 6338
    div-long/2addr v0, v2

    const-wide/16 v4, 0x3

    mul-long v0, v0, v4

    div-long/2addr p2, v2

    add-long/2addr p2, v0

    .line 6349
    :goto_0
    iput-wide p2, p1, Ll/ۡ۬ۧ;->֫:J

    return-void
.end method

.method public final ֫(Ll/ۗ۬ۧ;)V
    .locals 3

    .line 6321
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getItemViewType()I

    move-result v0

    .line 6322
    invoke-direct {p0, v0}, Ll/ܺ۬ۧ;->֫(I)Ll/ۡ۬ۧ;

    move-result-object v1

    iget-object v1, v1, Ll/ۡ۬ۧ;->ᩳ:Ljava/util/ArrayList;

    .line 6323
    iget-object v2, p0, Ll/ܺ۬ۧ;->ܽ:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡ۬ۧ;

    iget v0, v0, Ll/ۡ۬ۧ;->ܽ:I

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gt v0, v2, :cond_0

    .line 6324
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-static {p1}, Ll/ۤ֫֫;->֫(Landroid/view/View;)V

    return-void

    .line 6327
    :cond_0
    sget-boolean v0, Ll/۬۬ۧ;->sDebugAssertionsEnabled:Z

    if-eqz v0, :cond_2

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 6328
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "this scrap item already exists"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6330
    :cond_2
    :goto_0
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->resetInternal()V

    .line 6331
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(JIJ)Z
    .locals 4

    .line 6359
    invoke-direct {p0, p3}, Ll/ܺ۬ۧ;->֫(I)Ll/ۡ۬ۧ;

    move-result-object p3

    iget-wide v0, p3, Ll/ۡ۬ۧ;->֫:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-eqz p3, :cond_1

    add-long/2addr p1, v0

    cmp-long p3, p1, p4

    if-gez p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(IJ)V
    .locals 6

    .line 6342
    invoke-direct {p0, p1}, Ll/ܺ۬ۧ;->֫(I)Ll/ۡ۬ۧ;

    move-result-object p1

    .line 6343
    iget-wide v0, p1, Ll/ۡ۬ۧ;->ۧ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x4

    .line 6338
    div-long/2addr v0, v2

    const-wide/16 v4, 0x3

    mul-long v0, v0, v4

    div-long/2addr p2, v2

    add-long/2addr p2, v0

    .line 6343
    :goto_0
    iput-wide p2, p1, Ll/ۡ۬ۧ;->ۧ:J

    return-void
.end method

.method public final ۧ(JIJ)Z
    .locals 4

    .line 6354
    invoke-direct {p0, p3}, Ll/ܺ۬ۧ;->֫(I)Ll/ۡ۬ۧ;

    move-result-object p3

    iget-wide v0, p3, Ll/ۡ۬ۧ;->ۧ:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-eqz p3, :cond_1

    add-long/2addr p1, v0

    cmp-long p3, p1, p4

    if-gez p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
