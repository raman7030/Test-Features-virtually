.class public final Ll/۠᩷֡;
.super Ll/᩵᩷֡;
.source "V8EI"


# instance fields
.field public ֫֫:Ljava/util/ArrayList;

.field public ۗ:Ll/֨᩷֡;

.field public final ۙ:I

.field public ۛ:J

.field public final ۟:[B

.field public ۤ:J

.field public ۧ֫:Z

.field public ۨ:Ljava/util/HashMap;

.field public ۫:Z

.field public ۬:I

.field public final ܰ:[B

.field public final ܽ֫:Ll/᩺᩷֡;

.field public ᩶:Z

.field public final ᩺:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;ILjava/lang/String;)V
    .locals 0

    .line 212
    invoke-direct {p0, p1, p3}, Ll/᩵᩷֡;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    const/16 p1, 0x100

    new-array p1, p1, [B

    .line 83
    iput-object p1, p0, Ll/۠᩷֡;->۟:[B

    .line 133
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/۠᩷֡;->ۨ:Ljava/util/HashMap;

    .line 138
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۠᩷֡;->᩺:Ljava/util/ArrayList;

    .line 213
    invoke-static {p3}, Ll/ܰ᩷֡;->֫(Ljava/lang/String;)Ll/᩺᩷֡;

    move-result-object p1

    iput-object p1, p0, Ll/۠᩷֡;->ܽ֫:Ll/᩺᩷֡;

    const/16 p1, 0x200

    new-array p1, p1, [B

    .line 214
    iput-object p1, p0, Ll/۠᩷֡;->ܰ:[B

    .line 215
    iput p2, p0, Ll/۠᩷֡;->ۙ:I

    return-void
.end method

.method private isDirectory()Z
    .locals 1

    .line 567
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/֨᩷֡;->᩸()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private ۖ()V
    .locals 11

    const/4 v0, -0x1

    .line 283
    iput v0, p0, Ll/۠᩷֡;->۬:I

    .line 284
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    .line 286
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->ᩴ()Ljava/util/List;

    move-result-object v0

    .line 289
    new-instance v1, Ll/᩶᩷֡;

    .line 25
    invoke-direct {v1}, Ljava/io/InputStream;-><init>()V

    .line 292
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v2, 0x0

    move-wide v4, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۙ᩷֡;

    .line 293
    invoke-virtual {v6}, Ll/ۙ᩷֡;->ۧ()J

    move-result-wide v7

    sub-long/2addr v7, v4

    cmp-long v9, v7, v2

    if-ltz v9, :cond_2

    if-lez v9, :cond_0

    .line 301
    iget-object v7, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    new-instance v8, Ll/ۧۢ֡;

    invoke-virtual {v6}, Ll/ۙ᩷֡;->ۧ()J

    move-result-wide v9

    sub-long/2addr v9, v4

    invoke-direct {v8, v9, v10, v1}, Ll/ۧۢ֡;-><init>(JLjava/io/InputStream;)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    :cond_0
    invoke-virtual {v6}, Ll/ۙ᩷֡;->֫()J

    move-result-wide v4

    cmp-long v7, v4, v2

    if-lez v7, :cond_1

    .line 306
    iget-object v4, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    new-instance v5, Ll/ۧۢ֡;

    iget-object v7, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v6}, Ll/ۙ᩷֡;->֫()J

    move-result-wide v8

    invoke-direct {v5, v8, v9, v7}, Ll/ۧۢ֡;-><init>(JLjava/io/InputStream;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    :cond_1
    invoke-virtual {v6}, Ll/ۙ᩷֡;->ۧ()J

    move-result-wide v4

    invoke-virtual {v6}, Ll/ۙ᩷֡;->֫()J

    move-result-wide v6

    add-long/2addr v4, v6

    goto :goto_0

    .line 296
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Corrupted struct sparse detected"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 312
    :cond_3
    iget-object v0, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x0

    .line 313
    iput v0, p0, Ll/۠᩷֡;->۬:I

    :cond_4
    return-void
.end method

.method private ۘ()[B
    .locals 6

    .line 542
    invoke-virtual {p0}, Ll/۠᩷֡;->᩻()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 559
    iget-object v3, p0, Ll/۠᩷֡;->ܰ:[B

    array-length v3, v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    .line 42
    aget-byte v5, v0, v4

    if-eqz v5, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    .line 802
    :goto_1
    iput-boolean v3, p0, Ll/۠᩷֡;->᩶:Z

    if-eqz v3, :cond_8

    if-eqz v0, :cond_8

    .line 545
    iput-boolean v2, p0, Ll/۠᩷֡;->۫:Z

    .line 894
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 896
    iget-object v2, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 559
    iget-object v3, p0, Ll/۠᩷֡;->ܰ:[B

    array-length v3, v3

    .line 896
    invoke-virtual {v2, v3}, Ljava/io/InputStream;->mark(I)V

    .line 899
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Ll/۠᩷֡;->᩻()[B

    move-result-object v2

    if-eqz v2, :cond_4

    .line 559
    iget-object v3, p0, Ll/۠᩷֡;->ܰ:[B

    array-length v3, v3

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_4

    .line 42
    aget-byte v5, v2, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x1

    :goto_3
    if-nez v1, :cond_5

    if-eqz v0, :cond_5

    .line 559
    iget-object v0, p0, Ll/۠᩷֡;->ܰ:[B

    array-length v0, v0

    int-to-long v0, v0

    .line 902
    invoke-virtual {p0, v0, v1}, Ll/᩵᩷֡;->ᩳ(J)V

    .line 903
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 348
    :cond_5
    invoke-virtual {p0}, Ll/᩵᩷֡;->֫()J

    move-result-wide v0

    iget v2, p0, Ll/۠᩷֡;->ۙ:I

    int-to-long v2, v2

    rem-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_6

    .line 350
    iget-object v2, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget v3, p0, Ll/۠᩷֡;->ۙ:I

    int-to-long v3, v3

    sub-long/2addr v3, v0

    .line 254
    invoke-static {v3, v4, v2}, Ll/᩹ۢ֡;->֫(JLjava/io/InputStream;)J

    move-result-wide v0

    .line 350
    invoke-virtual {p0, v0, v1}, Ll/᩵᩷֡;->ۧ(J)V

    :cond_6
    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_7

    .line 559
    iget-object v0, p0, Ll/۠᩷֡;->ܰ:[B

    array-length v0, v0

    int-to-long v2, v0

    .line 902
    invoke-virtual {p0, v2, v3}, Ll/᩵᩷֡;->ᩳ(J)V

    .line 903
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 905
    :cond_7
    throw v1

    :cond_8
    return-object v0
.end method

.method private ܿ(II[B)I
    .locals 4

    .line 762
    iget-object v0, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 765
    :cond_0
    iget v0, p0, Ll/۠᩷֡;->۬:I

    iget-object v1, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, -0x1

    if-lt v0, v1, :cond_1

    return v2

    .line 768
    :cond_1
    iget-object v0, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    iget v1, p0, Ll/۠᩷֡;->۬:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    .line 769
    invoke-virtual {v0, p3, p1, p2}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 772
    iget v1, p0, Ll/۠᩷֡;->۬:I

    iget-object v3, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne v1, v3, :cond_2

    goto :goto_0

    :cond_2
    if-ne v0, v2, :cond_3

    .line 777
    iget v0, p0, Ll/۠᩷֡;->۬:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۠᩷֡;->۬:I

    .line 778
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩷֡;->ܿ(II[B)I

    move-result p1

    return p1

    :cond_3
    if-ge v0, p2, :cond_5

    .line 783
    iget v1, p0, Ll/۠᩷֡;->۬:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۠᩷֡;->۬:I

    add-int/2addr p1, v0

    sub-int/2addr p2, v0

    .line 784
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩷֡;->ܿ(II[B)I

    move-result p1

    if-ne p1, v2, :cond_4

    goto :goto_0

    :cond_4
    add-int/2addr v0, p1

    :cond_5
    :goto_0
    return v0

    .line 763
    :cond_6
    :goto_1
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p3, p1, p2}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method private ᩴ()V
    .locals 4

    .line 619
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 620
    iget-object v1, p0, Ll/۠᩷֡;->ۨ:Ljava/util/HashMap;

    iget-wide v2, p0, Ll/۠᩷֡;->ۛ:J

    invoke-static {p0, v0, v1, v2, v3}, Ll/ۛ᩷֡;->֫(Ljava/io/InputStream;Ljava/util/ArrayList;Ljava/util/HashMap;J)Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "GNU.sparse.map"

    .line 623
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 624
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/ۛ᩷֡;->֫(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 422
    :cond_0
    invoke-virtual {p0}, Ll/۠᩷֡;->ܳ()Ll/֨᩷֡;

    .line 627
    iget-object v2, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    if-eqz v2, :cond_2

    .line 251
    invoke-virtual {v2, v1}, Ll/֨᩷֡;->֫(Ljava/util/Map;)V

    .line 252
    iget-object v1, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v1, v0}, Ll/֨᩷֡;->֫(Ljava/util/List;)V

    .line 633
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 634
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 559
    iget-object v1, p0, Ll/۠᩷֡;->ܰ:[B

    array-length v1, v1

    .line 634
    invoke-static {v0, v1}, Ll/ۛ᩷֡;->֫(Ljava/io/InputStream;I)Ljava/util/ArrayList;

    move-result-object v0

    .line 635
    iget-object v1, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v1, v0}, Ll/֨᩷֡;->֫(Ljava/util/List;)V

    .line 640
    :cond_1
    invoke-direct {p0}, Ll/۠᩷֡;->ۖ()V

    return-void

    .line 628
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "premature end of tar archive. Didn\'t find any entry after PAX header."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final available()I
    .locals 5

    .line 265
    invoke-direct {p0}, Ll/۠᩷֡;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 268
    :cond_0
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->᩵()J

    move-result-wide v0

    iget-wide v2, p0, Ll/۠᩷֡;->ۤ:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    const v0, 0x7fffffff

    return v0

    :cond_1
    long-to-int v1, v0

    return v1
.end method

.method public final close()V
    .locals 2

    .line 335
    iget-object v0, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 336
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/InputStream;

    .line 337
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    goto :goto_0

    .line 340
    :cond_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final declared-synchronized mark(I)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 587
    monitor-exit v0

    return-void
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final read([BII)I
    .locals 6

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 563
    :cond_0
    iget-boolean v0, p0, Ll/۠᩷֡;->᩶:Z

    const/4 v1, -0x1

    if-nez v0, :cond_7

    .line 662
    invoke-direct {p0}, Ll/۠᩷֡;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 666
    :cond_1
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    if-eqz v0, :cond_6

    .line 670
    iget-wide v2, p0, Ll/۠᩷֡;->ۤ:J

    invoke-virtual {v0}, Ll/֨᩷֡;->᩵()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-ltz v0, :cond_2

    goto :goto_1

    .line 674
    :cond_2
    invoke-virtual {p0}, Ll/۠᩷֡;->available()I

    move-result v0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 676
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 678
    invoke-direct {p0, p2, p3, p1}, Ll/۠᩷֡;->ܿ(II[B)I

    move-result p1

    goto :goto_0

    .line 680
    :cond_3
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    :goto_0
    if-ne p1, v1, :cond_5

    if-gtz p3, :cond_4

    const/4 p2, 0x1

    .line 802
    iput-boolean p2, p0, Ll/۠᩷֡;->᩶:Z

    return p1

    .line 685
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Truncated TAR archive"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 689
    :cond_5
    invoke-virtual {p0, p1}, Ll/᩵᩷֡;->֫(I)V

    .line 690
    iget-wide p2, p0, Ll/۠᩷֡;->ۤ:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/۠᩷֡;->ۤ:J

    return p1

    .line 667
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No current tar entry"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_1
    return v1
.end method

.method public final declared-synchronized reset()V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 799
    monitor-exit v0

    return-void
.end method

.method public final skip(J)J
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_7

    .line 820
    invoke-direct {p0}, Ll/۠᩷֡;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_3

    .line 824
    :cond_0
    iget-object v2, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v2

    int-to-long v2, v2

    .line 825
    iget-object v4, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v4}, Ll/֨᩷֡;->᩵()J

    move-result-wide v4

    iget-wide v6, p0, Ll/۠᩷֡;->ۤ:J

    sub-long/2addr v4, v6

    .line 826
    invoke-static {p1, p2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    .line 829
    iget-object v4, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v4}, Ll/֨᩷֡;->ۨ()Z

    move-result v4

    if-nez v4, :cond_3

    .line 830
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 254
    invoke-static {p1, p2, v0}, Ll/᩹ۢ֡;->֫(JLjava/io/InputStream;)J

    move-result-wide v0

    .line 365
    iget-object v4, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    instance-of v4, v4, Ljava/io/FileInputStream;

    if-eqz v4, :cond_1

    .line 366
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_1
    cmp-long v2, v0, p1

    if-nez v2, :cond_2

    goto :goto_2

    .line 369
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Truncated TAR archive"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 870
    :cond_3
    iget-object v2, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    cmp-long v2, v0, p1

    if-gez v2, :cond_6

    .line 874
    iget v2, p0, Ll/۠᩷֡;->۬:I

    iget-object v3, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 875
    iget-object v2, p0, Ll/۠᩷֡;->֫֫:Ljava/util/ArrayList;

    iget v3, p0, Ll/۠᩷֡;->۬:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/InputStream;

    sub-long v3, p1, v0

    .line 876
    invoke-virtual {v2, v3, v4}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    cmp-long v2, v0, p1

    if-gez v2, :cond_4

    .line 878
    iget v2, p0, Ll/۠᩷֡;->۬:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/۠᩷֡;->۬:I

    goto :goto_0

    .line 871
    :cond_5
    :goto_1
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    move-wide v0, p1

    .line 838
    :cond_6
    :goto_2
    invoke-virtual {p0, v0, v1}, Ll/᩵᩷֡;->ۧ(J)V

    .line 839
    iget-wide p1, p0, Ll/۠᩷֡;->ۤ:J

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/۠᩷֡;->ۤ:J

    :cond_7
    :goto_3
    return-wide v0
.end method

.method public final ۜ()V
    .locals 1

    const/4 v0, 0x1

    .line 223
    iput-boolean v0, p0, Ll/۠᩷֡;->ۧ֫:Z

    return-void
.end method

.method public final ܳ()Ll/֨᩷֡;
    .locals 12
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 563
    iget-boolean v0, p0, Ll/۠᩷֡;->᩶:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 440
    :cond_0
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    const-wide/16 v2, 0x0

    if-eqz v0, :cond_3

    const-wide v4, 0x7fffffffffffffffL

    .line 254
    invoke-static {v4, v5, p0}, Ll/᩹ۢ֡;->֫(JLjava/io/InputStream;)J

    .line 849
    invoke-direct {p0}, Ll/۠᩷֡;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_3

    iget-wide v4, p0, Ll/۠᩷֡;->ۛ:J

    cmp-long v0, v4, v2

    if-lez v0, :cond_3

    .line 559
    iget-object v0, p0, Ll/۠᩷֡;->ܰ:[B

    array-length v0, v0

    int-to-long v6, v0

    .line 849
    rem-long/2addr v4, v6

    cmp-long v0, v4, v2

    if-eqz v0, :cond_3

    .line 850
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    int-to-long v4, v0

    .line 851
    iget-wide v6, p0, Ll/۠᩷֡;->ۛ:J

    .line 559
    iget-object v0, p0, Ll/۠᩷֡;->ܰ:[B

    array-length v8, v0

    int-to-long v8, v8

    .line 851
    div-long v8, v6, v8

    const-wide/16 v10, 0x1

    add-long/2addr v8, v10

    .line 559
    array-length v0, v0

    int-to-long v10, v0

    mul-long v8, v8, v10

    sub-long/2addr v8, v6

    .line 853
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 254
    invoke-static {v8, v9, v0}, Ll/᩹ۢ֡;->֫(JLjava/io/InputStream;)J

    move-result-wide v6

    .line 365
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    instance-of v0, v0, Ljava/io/FileInputStream;

    if-eqz v0, :cond_1

    .line 366
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    :cond_1
    cmp-long v0, v6, v8

    if-nez v0, :cond_2

    .line 857
    invoke-virtual {p0, v6, v7}, Ll/᩵᩷֡;->ۧ(J)V

    goto :goto_0

    .line 369
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated TAR archive"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 448
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/۠᩷֡;->ۘ()[B

    move-result-object v0

    if-nez v0, :cond_6

    .line 452
    iget-boolean v0, p0, Ll/۠᩷֡;->ۧ֫:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Ll/۠᩷֡;->۫:Z

    if-eqz v0, :cond_4

    goto :goto_1

    .line 453
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Missing TAR end marker"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 455
    :cond_5
    :goto_1
    iput-object v1, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    return-object v1

    .line 460
    :cond_6
    :try_start_0
    new-instance v4, Ll/֨᩷֡;

    iget-object v5, p0, Ll/۠᩷֡;->ۨ:Ljava/util/HashMap;

    iget-object v6, p0, Ll/۠᩷֡;->ܽ֫:Ll/᩺᩷֡;

    invoke-direct {v4, v5, v0, v6}, Ll/֨᩷֡;-><init>(Ljava/util/HashMap;[BLl/᩺᩷֡;)V

    iput-object v4, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 464
    iget-boolean v0, p0, Ll/۠᩷֡;->ۧ֫:Z

    if-eqz v0, :cond_8

    invoke-virtual {v4}, Ll/֨᩷֡;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_2

    .line 465
    :cond_7
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid TAR header checksum ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v2}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 468
    :cond_8
    :goto_2
    iput-wide v2, p0, Ll/۠᩷֡;->ۤ:J

    .line 469
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->֡()J

    move-result-wide v2

    iput-wide v2, p0, Ll/۠᩷֡;->ۛ:J

    .line 471
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->ۙ()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_b

    .line 472
    invoke-virtual {p0}, Ll/۠᩷֡;->ᩳ()[B

    move-result-object v0

    if-nez v0, :cond_a

    .line 476
    iget-boolean v0, p0, Ll/۠᩷֡;->ۧ֫:Z

    if-nez v0, :cond_9

    goto :goto_3

    .line 477
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Missing TAR entry after GNU long link header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 481
    :cond_a
    iget-object v3, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    iget-object v4, p0, Ll/۠᩷֡;->ܽ֫:Ll/᩺᩷֡;

    array-length v5, v0

    invoke-interface {v4, v2, v5, v0}, Ll/᩺᩷֡;->֫(II[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/֨᩷֡;->ۧ(Ljava/lang/String;)V

    .line 484
    :cond_b
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->ۗ()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 485
    invoke-virtual {p0}, Ll/۠᩷֡;->ᩳ()[B

    move-result-object v0

    if-nez v0, :cond_d

    .line 489
    iget-boolean v0, p0, Ll/۠᩷֡;->ۧ֫:Z

    if-nez v0, :cond_c

    :goto_3
    return-object v1

    .line 490
    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Missing TAR entry after GNU long name header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 496
    :cond_d
    iget-object v1, p0, Ll/۠᩷֡;->ܽ֫:Ll/᩺᩷֡;

    array-length v3, v0

    invoke-interface {v1, v2, v3, v0}, Ll/᩺᩷֡;->֫(II[B)Ljava/lang/String;

    move-result-object v0

    .line 497
    iget-object v1, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v1, v0}, Ll/֨᩷֡;->ܽ(Ljava/lang/String;)V

    .line 498
    iget-object v1, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v1}, Ll/֨᩷֡;->᩸()Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 499
    iget-object v2, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/֨᩷֡;->ܽ(Ljava/lang/String;)V

    .line 503
    :cond_e
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->۬()Z

    move-result v0

    const-string v1, "Error detected parsing the pax header"

    if-eqz v0, :cond_10

    .line 697
    iget-object v0, p0, Ll/۠᩷֡;->᩺:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/۠᩷֡;->ۨ:Ljava/util/HashMap;

    iget-wide v3, p0, Ll/۠᩷֡;->ۛ:J

    invoke-static {p0, v0, v2, v3, v4}, Ll/ۛ᩷֡;->֫(Ljava/io/InputStream;Ljava/util/ArrayList;Ljava/util/HashMap;J)Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Ll/۠᩷֡;->ۨ:Ljava/util/HashMap;

    .line 422
    invoke-virtual {p0}, Ll/۠᩷֡;->ܳ()Ll/֨᩷֡;

    .line 700
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    if-eqz v0, :cond_f

    goto :goto_4

    .line 701
    :cond_f
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 508
    :cond_10
    :goto_4
    :try_start_1
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->ۛ()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 509
    invoke-direct {p0}, Ll/۠᩷֡;->ᩴ()V

    goto :goto_5

    .line 510
    :cond_11
    iget-object v0, p0, Ll/۠᩷֡;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    .line 511
    iget-object v0, p0, Ll/۠᩷֡;->ۨ:Ljava/util/HashMap;

    iget-object v2, p0, Ll/۠᩷֡;->᩺:Ljava/util/ArrayList;

    .line 251
    iget-object v3, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v3, v0}, Ll/֨᩷֡;->֫(Ljava/util/Map;)V

    .line 252
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0, v2}, Ll/֨᩷֡;->֫(Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 517
    :cond_12
    :goto_5
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->۫()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 711
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->᩹()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 714
    :cond_13
    invoke-direct {p0}, Ll/۠᩷֡;->ۘ()[B

    move-result-object v0

    if-eqz v0, :cond_14

    .line 718
    new-instance v1, Ll/᩹᩷֡;

    invoke-direct {v1, v0}, Ll/᩹᩷֡;-><init>([B)V

    .line 719
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->ۚ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1}, Ll/᩹᩷֡;->֫()Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 720
    invoke-virtual {v1}, Ll/᩹᩷֡;->ۧ()Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_6

    .line 716
    :cond_14
    new-instance v0, Ljava/io/IOException;

    const-string v1, "premature end of tar archive. Didn\'t find extended_header after header with extended flag."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 725
    :cond_15
    :goto_6
    invoke-direct {p0}, Ll/۠᩷֡;->ۖ()V

    .line 525
    :cond_16
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->֡()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۠᩷֡;->ۛ:J

    .line 527
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    return-object v0

    :catch_0
    move-exception v0

    .line 514
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v0

    .line 462
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Error detected parsing the header"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ܽ()Ll/֨᩷֡;
    .locals 1

    .line 380
    iget-object v0, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 4

    .line 391
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 393
    :goto_0
    iget-object v1, p0, Ll/۠᩷֡;->۟:[B

    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    if-ltz v2, :cond_0

    const/4 v3, 0x0

    .line 394
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 422
    :cond_0
    invoke-virtual {p0}, Ll/۠᩷֡;->ܳ()Ll/֨᩷֡;

    .line 397
    iget-object v1, p0, Ll/۠᩷֡;->ۗ:Ll/֨᩷֡;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 402
    :cond_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 404
    array-length v1, v0

    :goto_1
    if-lez v1, :cond_2

    add-int/lit8 v2, v1, -0x1

    .line 405
    aget-byte v2, v0, v2

    if-nez v2, :cond_2

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 408
    :cond_2
    array-length v2, v0

    if-eq v1, v2, :cond_3

    .line 409
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    :cond_3
    return-object v0
.end method

.method public final ᩻()[B
    .locals 5

    .line 735
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget-object v1, p0, Ll/۠᩷֡;->ܰ:[B

    .line 183
    array-length v2, v1

    if-ltz v2, :cond_3

    .line 200
    array-length v3, v1

    if-gt v2, v3, :cond_3

    if-ltz v2, :cond_3

    .line 203
    invoke-static {v0, v1, v2}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;[BI)I

    move-result v0

    .line 736
    invoke-virtual {p0, v0}, Ll/᩵᩷֡;->֫(I)V

    .line 559
    iget-object v1, p0, Ll/۠᩷֡;->ܰ:[B

    array-length v2, v1

    if-eq v0, v2, :cond_2

    .line 739
    iget-boolean v1, p0, Ll/۠᩷֡;->ۧ֫:Z

    if-eqz v1, :cond_1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Ll/᩵᩷֡;->֫()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_0

    .line 740
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated TAR archive"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :cond_2
    return-object v1

    .line 201
    :cond_3
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method
