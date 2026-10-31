.class public final Ll/ܿ᩸ܽ;
.super Ljava/lang/Object;
.source "G1PO"


# instance fields
.field public ֫:Ljava/lang/ref/SoftReference;

.field public volatile ۧ:I

.field public final ܽ:Ll/ۧ᩺֡;

.field public final ܿ:Ll/ܰܶܽ;

.field public final ᩳ:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ۧ᩺֡;Ll/ܶ᩵ܿ;IIJI)V
    .locals 7

    .line 724
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 725
    iput-object p1, p0, Ll/ܿ᩸ܽ;->ܽ:Ll/ۧ᩺֡;

    .line 726
    iput-object p2, p0, Ll/ܿ᩸ܽ;->ᩳ:Ll/ܶ᩵ܿ;

    .line 727
    new-instance p2, Ll/ܰܶܽ;

    new-instance v6, Ll/ᩳ᩸ܽ;

    invoke-direct {v6, p0}, Ll/ᩳ᩸ܽ;-><init>(Ll/ܿ᩸ܽ;)V

    move-object v0, p2

    move v1, p3

    move v2, p4

    move-wide v3, p5

    move v5, p7

    invoke-direct/range {v0 .. v6}, Ll/ܰܶܽ;-><init>(IIJILl/ᩳ᩸ܽ;)V

    iput-object p2, p0, Ll/ܿ᩸ܽ;->ܿ:Ll/ܰܶܽ;

    .line 738
    invoke-virtual {p1, p0}, Ll/۬ۛ֡;->֫(Ljava/lang/Object;)V

    .line 739
    invoke-virtual {p1}, Ll/۬ۛ֡;->ܿ()Ll/᩺ۤ֡;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩺ۤ֡;->֫()[B

    move-result-object p2

    .line 740
    invoke-virtual {p1}, Ll/۬ۛ֡;->ܿ()Ll/᩺ۤ֡;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Ll/᩺ۤ֡;->ۧ([B)V

    .line 741
    new-instance p1, Ljava/lang/ref/SoftReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ܿ᩸ܽ;->֫:Ljava/lang/ref/SoftReference;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()V
    .locals 4

    const-string v1, "Failed to load dex buffer: "

    move-object v0, p0

    .line 3
    monitor-enter v0

    .line 745
    :try_start_0
    iget v2, p0, Ll/ܿ᩸ܽ;->ۧ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ܿ᩸ܽ;->ۧ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 748
    :try_start_1
    iget-object v2, p0, Ll/ܿ᩸ܽ;->ܽ:Ll/ۧ᩺֡;

    invoke-virtual {v2}, Ll/۬ۛ֡;->ܿ()Ll/᩺ۤ֡;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩺ۤ֡;->֫()[B

    move-result-object v2

    if-nez v2, :cond_2

    .line 749
    iget-object v2, p0, Ll/ܿ᩸ܽ;->֫:Ljava/lang/ref/SoftReference;

    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    if-nez v2, :cond_0

    .line 751
    iget-object v2, p0, Ll/ܿ᩸ܽ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v2

    :cond_0
    if-eqz v2, :cond_1

    .line 756
    iget-object v1, p0, Ll/ܿ᩸ܽ;->ܽ:Ll/ۧ᩺֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ܿ()Ll/᩺ۤ֡;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/᩺ۤ֡;->ۧ([B)V

    goto :goto_0

    .line 754
    :cond_1
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܿ᩸ܽ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 765
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 762
    :try_start_2
    iget v2, p0, Ll/ܿ᩸ܽ;->ۧ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܿ᩸ܽ;->ۧ:I

    .line 764
    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final declared-synchronized ۧ()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 768
    :try_start_0
    iget v1, p0, Ll/ܿ᩸ܽ;->ۧ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ܿ᩸ܽ;->ۧ:I

    if-nez v1, :cond_0

    .line 769
    iget-object v1, p0, Ll/ܿ᩸ܽ;->ܽ:Ll/ۧ᩺֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ܿ()Ll/᩺ۤ֡;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺ۤ֡;->֫()[B

    move-result-object v1

    if-eqz v1, :cond_0

    .line 771
    iget-object v2, p0, Ll/ܿ᩸ܽ;->ܽ:Ll/ۧ᩺֡;

    invoke-virtual {v2}, Ll/۬ۛ֡;->ܿ()Ll/᩺ۤ֡;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ll/᩺ۤ֡;->ۧ([B)V

    .line 772
    iget-object v2, p0, Ll/ܿ᩸ܽ;->֫:Ljava/lang/ref/SoftReference;

    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 773
    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Ll/ܿ᩸ܽ;->֫:Ljava/lang/ref/SoftReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 777
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
