.class public final Ll/ᩳۗ֫;
.super Ljava/lang/Object;
.source "H74H"


# instance fields
.field public ֡:Z

.field public final ֫:Ll/۫ܿۧ;

.field public final ۖ:Landroid/util/SparseArray;

.field public ۘ:Ll/ۢۢۧ;

.field public ۚ:I

.field public ۜ:Z

.field public final ۡ:Ll/᩸᩸֫;

.field public final ۢ:Ll/᩻ۢۧ;

.field public ۧ:Ll/᩸۠֫;

.field public final ܳ:Ll/ܽ᩷ᩳ;

.field public final ܺ:Ll/ܽۗ֫;

.field public ܽ:Ll/֨᩷ۧ;

.field public final ܿ:Ll/ܶ۠֫;

.field public ᩳ:Ll/ܺ᩷ۧ;

.field public final ᩴ:Ljava/util/HashSet;

.field public final ᩵:Ljava/util/ArrayList;

.field public ᩷:J

.field public final ᩻:Ll/ۗۙ֫;


# direct methods
.method public constructor <init>(Ll/ܽ᩷ᩳ;Ll/ܶ۠֫;)V
    .locals 1

    .line 186
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 187
    iput-object p1, p0, Ll/ᩳۗ֫;->ܳ:Ll/ܽ᩷ᩳ;

    .line 188
    iput-object p2, p0, Ll/ᩳۗ֫;->ܿ:Ll/ܶ۠֫;

    .line 189
    new-instance p1, Ll/᩻ۢۧ;

    .line 22
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 189
    iput-object p1, p0, Ll/ᩳۗ֫;->ۢ:Ll/᩻ۢۧ;

    .line 190
    new-instance p1, Ll/۫ܿۧ;

    invoke-direct {p1}, Ll/۫ܿۧ;-><init>()V

    iput-object p1, p0, Ll/ᩳۗ֫;->֫:Ll/۫ܿۧ;

    .line 191
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ᩳۗ֫;->᩵:Ljava/util/ArrayList;

    .line 192
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/ᩳۗ֫;->ۖ:Landroid/util/SparseArray;

    .line 193
    new-instance p1, Ll/ܽۗ֫;

    invoke-direct {p1}, Ll/ܽۗ֫;-><init>()V

    iput-object p1, p0, Ll/ᩳۗ֫;->ܺ:Ll/ܽۗ֫;

    .line 194
    new-instance p1, Ll/ۗۙ֫;

    .line 25
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 194
    iput-object p1, p0, Ll/ᩳۗ֫;->᩻:Ll/ۗۙ֫;

    .line 123
    new-instance p1, Ll/᩸᩸֫;

    const/4 p2, 0x0

    .line 132
    invoke-direct {p1, p2, p2}, Ll/᩸᩸֫;-><init>(II)V

    .line 195
    iput-object p1, p0, Ll/ᩳۗ֫;->ۡ:Ll/᩸᩸֫;

    .line 196
    new-instance p1, Ll/᩸᩸֫;

    const/4 v0, 0x2

    .line 132
    invoke-direct {p1, v0, p2}, Ll/᩸᩸֫;-><init>(II)V

    .line 198
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/ᩳۗ֫;->ᩴ:Ljava/util/HashSet;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳۗ֫;)Ll/۫ܿۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۗ֫;->֫:Ll/۫ܿۧ;

    return-object p0
.end method

.method private ֫(J)Ll/ܺ᩷ۧ;
    .locals 7

    .line 891
    iget-object v1, p0, Ll/ᩳۗ֫;->ۧ:Ll/᩸۠֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    invoke-interface {v1}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 893
    invoke-static {v1}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 894
    iget-wide v2, p0, Ll/ᩳۗ֫;->᩷:J

    add-long/2addr v2, p1

    .line 942
    new-instance v4, Ll/ۙ۠֫;

    invoke-direct {v4}, Ll/ۙ۠֫;-><init>()V

    .line 944
    invoke-virtual {v4, v0}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    .line 945
    invoke-virtual {v4, v2, v3}, Ll/ۙ۠֫;->ۧ(J)V

    const/4 v0, 0x6

    .line 946
    invoke-virtual {v4, v0}, Ll/ۙ۠֫;->֫(I)V

    .line 952
    invoke-virtual {v4}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v0

    .line 895
    invoke-interface {v1, v0}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    add-long/2addr v2, p1

    :cond_0
    move-wide v4, v2

    .line 900
    new-instance v6, Ll/ܺ᩷ۧ;

    move-object v0, v6

    move-wide v2, p1

    invoke-direct/range {v0 .. v5}, Ll/ܺ᩷ۧ;-><init>(Ll/ۢᩴ֫;JJ)V

    return-object v6
.end method

.method public static ֫(Ll/ᩳۗ֫;Ll/۟ۙ֫;Ll/۠ᩴ֫;)V
    .locals 4

    .line 905
    iget v0, p0, Ll/ᩳۗ֫;->ۚ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ᩳۗ֫;->ۚ:I

    .line 906
    iget-object p0, p0, Ll/ᩳۗ֫;->᩵:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/۟ۙ֫;->ܿ(I)V

    .line 907
    new-instance v0, Ll/֫ۗ֫;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v2, v3}, Ll/֫ۗ֫;-><init>(Ll/۟ۙ֫;ZLjava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 914
    invoke-static {p2}, Ll/᩹۟֫;->֫(Ll/۠ᩴ֫;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 916
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/۟ۙ֫;->ᩳ(I)V

    .line 917
    new-instance v0, Ll/֫ۗ֫;

    invoke-direct {v0, p1, v1, p2}, Ll/֫ۗ֫;-><init>(Ll/۟ۙ֫;ZLjava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳۗ֫;Ll/ۢۢۧ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ᩳۗ֫;->ۘ:Ll/ۢۢۧ;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ᩳۗ֫;)Ll/ܽۗ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۗ֫;->ܺ:Ll/ܽۗ֫;

    return-object p0
.end method

.method private ܳ()Z
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "sampleMetadataQueue.peekFirst()"
        }
        result = true
    .end annotation

    .line 840
    iget-object v0, p0, Ll/ᩳۗ֫;->ۢ:Ll/᩻ۢۧ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 848
    :cond_0
    :goto_0
    iget-object v3, p0, Ll/ᩳۗ֫;->ܺ:Ll/ܽۗ֫;

    invoke-virtual {v3}, Ll/ܽۗ֫;->֫()Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_2

    .line 851
    invoke-virtual {v3}, Ll/ܽۗ֫;->ۧ()Ll/ۧۗ֫;

    move-result-object v3

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    iget v3, v3, Ll/ۧۗ֫;->ܽ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 850
    iget-object v4, p0, Ll/ᩳۗ֫;->ᩴ:Ljava/util/HashSet;

    invoke-virtual {v4, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v5

    .line 855
    :cond_1
    invoke-direct {p0}, Ll/ᩳۗ֫;->᩻()V

    goto :goto_0

    :cond_2
    if-nez v2, :cond_4

    .line 862
    :try_start_0
    iget-object v3, p0, Ll/ᩳۗ֫;->ܽ:Ll/֨᩷ۧ;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    iget-object v4, p0, Ll/ᩳۗ֫;->ᩳ:Ll/ܺ᩷ۧ;

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 864
    invoke-interface {v3, v4, v0}, Ll/֨᩷ۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_3

    goto :goto_2

    :cond_3
    if-ne v3, v5, :cond_0

    .line 868
    iget-wide v3, v0, Ll/᩻ۢۧ;->֫:J

    invoke-direct {p0, v3, v4}, Ll/ᩳۗ֫;->֫(J)Ll/ܺ᩷ۧ;

    move-result-object v3

    iput-object v3, p0, Ll/ᩳۗ֫;->ᩳ:Ll/ܺ᩷ۧ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v2

    :goto_1
    const-string v3, "Treating exception as the end of input."

    .line 871
    invoke-static {v3, v2}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    const/4 v2, 0x1

    goto :goto_0

    :cond_4
    return v1
.end method

.method public static bridge synthetic ܽ(Ll/ᩳۗ֫;)Landroid/util/SparseArray;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۗ֫;->ۖ:Landroid/util/SparseArray;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ᩳۗ֫;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ᩳۗ֫;->֡:Z

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ᩳۗ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩳۗ֫;->֡:Z

    return p0
.end method

.method private ᩻()V
    .locals 2

    .line 882
    iget-object v0, p0, Ll/ᩳۗ֫;->ܺ:Ll/ܽۗ֫;

    invoke-virtual {v0}, Ll/ܽۗ֫;->ܽ()Ll/ۧۗ֫;

    move-result-object v0

    iget v0, v0, Ll/ۧۗ֫;->ܽ:I

    .line 883
    iget-object v1, p0, Ll/ᩳۗ֫;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۗ֫;

    .line 884
    iget-boolean v1, v0, Ll/֫ۗ֫;->ۧ:Z

    if-nez v1, :cond_0

    .line 1034
    iget-object v0, v0, Ll/֫ۗ֫;->ܽ:Ll/۟ۙ֫;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۘܽۧ;->ܽ(I)V

    .line 1035
    invoke-virtual {v0}, Ll/ۘܽۧ;->ۧ()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/nio/ByteBuffer;)I
    .locals 7

    .line 542
    invoke-direct {p0}, Ll/ᩳۗ֫;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    .line 546
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 547
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 548
    iget-object v1, p0, Ll/ᩳۗ֫;->ۡ:Ll/᩸᩸֫;

    iput-object p1, v1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    .line 772
    iget-object v2, p0, Ll/ᩳۗ֫;->ܺ:Ll/ܽۗ֫;

    .line 773
    invoke-virtual {v2}, Ll/ܽۗ֫;->ۧ()Ll/ۧۗ֫;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    iget v2, v2, Ll/ۧۗ֫;->ܽ:I

    iget-object v3, p0, Ll/ᩳۗ֫;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۗ֫;

    .line 774
    iget-object v2, v2, Ll/֫ۗ֫;->ܽ:Ll/۟ۙ֫;

    .line 777
    iget-object v3, p0, Ll/ᩳۗ֫;->᩻:Ll/ۗۙ֫;

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v1, v4, v0}, Ll/ۘܽۧ;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;IZ)I

    move-result v5

    const/4 v6, -0x5

    if-ne v5, v6, :cond_1

    .line 781
    invoke-virtual {v2, v3, v1, v4, v0}, Ll/ۘܽۧ;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;IZ)I

    move-result v5

    .line 784
    :cond_1
    invoke-virtual {v3}, Ll/ۗۙ֫;->֫()V

    const/4 v2, -0x4

    if-ne v5, v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 786
    :goto_0
    invoke-static {v4}, Ll/᩺֡֫;->ۧ(Z)V

    .line 550
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 551
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v0, 0x0

    .line 552
    iput-object v0, v1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    .line 553
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    return p1
.end method

.method public final ֫(I)Landroid/media/MediaFormat;
    .locals 6

    .line 432
    iget-object v0, p0, Ll/ᩳۗ֫;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۗ֫;

    .line 433
    iget-object v0, p0, Ll/ᩳۗ֫;->᩻:Ll/ۗۙ֫;

    iget-object v1, p0, Ll/ᩳۗ֫;->ۡ:Ll/᩸᩸֫;

    .line 434
    invoke-virtual {p1, v0, v1}, Ll/֫ۗ֫;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;)Landroid/media/MediaFormat;

    move-result-object v0

    .line 435
    iget-object p1, p1, Ll/֫ۗ֫;->ܽ:Ll/۟ۙ֫;

    iget-wide v1, p1, Ll/۟ۙ֫;->ܽ֫:J

    const-string p1, "durationUs"

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    .line 437
    invoke-virtual {v0, p1, v1, v2}, Landroid/media/MediaFormat;->setLong(Ljava/lang/String;J)V

    return-object v0

    .line 438
    :cond_0
    iget-object v1, p0, Ll/ᩳۗ֫;->ۘ:Ll/ۢۢۧ;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    .line 439
    iget-object v1, p0, Ll/ᩳۗ֫;->ۘ:Ll/ۢۢۧ;

    invoke-interface {v1}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Landroid/media/MediaFormat;->setLong(Ljava/lang/String;J)V

    :cond_1
    return-object v0
.end method

.method public final ֫()V
    .locals 1

    .line 522
    invoke-direct {p0}, Ll/ᩳۗ֫;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 526
    :cond_0
    invoke-direct {p0}, Ll/ᩳۗ֫;->᩻()V

    .line 527
    invoke-direct {p0}, Ll/ᩳۗ֫;->ܳ()Z

    return-void
.end method

.method public final ֫(Landroid/net/Uri;)V
    .locals 12

    .line 213
    iget-object v0, p0, Ll/ᩳۗ֫;->ܿ:Ll/ܶ۠֫;

    .line 214
    invoke-interface {v0}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v0

    .line 942
    new-instance v1, Ll/ۙ۠֫;

    invoke-direct {v1}, Ll/ۙ۠֫;-><init>()V

    .line 944
    invoke-virtual {v1, p1}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    const-wide/16 v2, 0x0

    .line 945
    invoke-virtual {v1, v2, v3}, Ll/ۙ۠֫;->ۧ(J)V

    const/4 p1, 0x6

    .line 946
    invoke-virtual {v1, p1}, Ll/ۙ۠֫;->֫(I)V

    .line 952
    invoke-virtual {v1}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object p1

    .line 364
    iget-object v1, p0, Ll/ᩳۗ֫;->ۢ:Ll/᩻ۢۧ;

    iget-boolean v2, p0, Ll/ᩳۗ֫;->ۜ:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Z)V

    .line 365
    iput-boolean v3, p0, Ll/ᩳۗ֫;->ۜ:Z

    .line 366
    iget-wide v4, p1, Ll/ۗ۠֫;->᩻:J

    iput-wide v4, p0, Ll/ᩳۗ֫;->᩷:J

    .line 367
    iput-object v0, p0, Ll/ᩳۗ֫;->ۧ:Ll/᩸۠֫;

    .line 369
    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v10

    .line 370
    new-instance p1, Ll/ܺ᩷ۧ;

    iget-object v7, p0, Ll/ᩳۗ֫;->ۧ:Ll/᩸۠֫;

    const-wide/16 v8, 0x0

    move-object v6, p1

    invoke-direct/range {v6 .. v11}, Ll/ܺ᩷ۧ;-><init>(Ll/ۢᩴ֫;JJ)V

    .line 797
    iget-object v0, p0, Ll/ᩳۗ֫;->ܳ:Ll/ܽ᩷ᩳ;

    invoke-virtual {v0}, Ll/ܽ᩷ᩳ;->ۧ()[Ll/֨᩷ۧ;

    move-result-object v0

    const/4 v2, 0x0

    .line 799
    aget-object v2, v0, v2

    const/4 v4, 0x0

    .line 801
    :try_start_0
    invoke-interface {v2, p1}, Ll/֨᩷ۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result v5
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_0

    .line 809
    invoke-virtual {p1}, Ll/ܺ᩷ۧ;->ۧ()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Ll/ܺ᩷ۧ;->ۧ()V

    .line 810
    throw v0

    .line 809
    :catch_0
    :cond_0
    invoke-virtual {p1}, Ll/ܺ᩷ۧ;->ۧ()V

    move-object v2, v4

    :goto_0
    if-eqz v2, :cond_8

    .line 373
    new-instance v0, Ll/ܰۙ֫;

    invoke-direct {v0, p0}, Ll/ܰۙ֫;-><init>(Ll/ᩳۗ֫;)V

    invoke-interface {v2, v0}, Ll/֨᩷ۧ;->֫(Ll/᩸᩷ۧ;)V

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_7

    const/4 v0, -0x1

    .line 380
    :try_start_1
    invoke-interface {v2, p1, v1}, Ll/֨᩷ۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v4

    goto :goto_2

    :catch_2
    move-exception v4

    :goto_2
    const/4 v5, -0x1

    .line 386
    :goto_3
    iget-boolean v6, p0, Ll/ᩳۗ֫;->֡:Z

    if-eqz v6, :cond_2

    iget v6, p0, Ll/ᩳۗ֫;->ۚ:I

    iget-object v7, p0, Ll/ᩳۗ֫;->ۖ:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-lt v6, v7, :cond_2

    iget-object v6, p0, Ll/ᩳۗ֫;->ۘ:Ll/ۢۢۧ;

    if-nez v6, :cond_1

    goto :goto_4

    :cond_1
    const/4 v6, 0x0

    goto :goto_5

    :cond_2
    :goto_4
    const/4 v6, 0x1

    :goto_5
    if-nez v4, :cond_5

    if-eqz v6, :cond_3

    if-ne v5, v0, :cond_3

    goto :goto_6

    :cond_3
    if-ne v5, v3, :cond_4

    .line 396
    iget-wide v7, v1, Ll/᩻ۢۧ;->֫:J

    invoke-direct {p0, v7, v8}, Ll/ᩳۗ֫;->֫(J)Ll/ܺ᩷ۧ;

    move-result-object p1

    :cond_4
    move v0, v6

    goto :goto_1

    .line 389
    :cond_5
    :goto_6
    invoke-virtual {p0}, Ll/ᩳۗ֫;->ܿ()V

    if-eqz v4, :cond_6

    const-string p1, "Exception encountered while parsing input media."

    goto :goto_7

    :cond_6
    const-string p1, "Reached end of input before preparation completed."

    .line 394
    :goto_7
    invoke-static {p1, v4}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 399
    :cond_7
    iput-object p1, p0, Ll/ᩳۗ֫;->ᩳ:Ll/ܺ᩷ۧ;

    .line 400
    iput-object v2, p0, Ll/ᩳۗ֫;->ܽ:Ll/֨᩷ۧ;

    return-void

    .line 813
    :cond_8
    new-instance p1, Ll/ۨܽۧ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "None of the available extractors ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ", "

    .line 815
    invoke-static {v2}, Ll/ۜܶܺ;->֫(Ljava/lang/String;)Ll/ۜܶܺ;

    move-result-object v2

    .line 818
    invoke-static {v0}, Ll/ܳ۬ܺ;->֫([Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    new-instance v3, Ll/ۚ᩻ܽ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 817
    invoke-static {v0, v3}, Ll/۟۫ܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;)Ljava/util/AbstractList;

    move-result-object v0

    .line 816
    invoke-virtual {v2, v0}, Ll/ۜܶܺ;->֫(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") could read the stream."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ᩳۗ֫;->ۧ:Ll/᩸۠֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    invoke-interface {v1}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ll/ۨܽۧ;-><init>(Ljava/lang/String;Ljava/util/List;)V

    throw p1
.end method

.method public final ۧ()I
    .locals 1

    .line 592
    invoke-direct {p0}, Ll/ᩳۗ֫;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 595
    :cond_0
    iget-object v0, p0, Ll/ᩳۗ֫;->ܺ:Ll/ܽۗ֫;

    invoke-virtual {v0}, Ll/ܽۗ֫;->ۧ()Ll/ۧۗ֫;

    move-result-object v0

    iget v0, v0, Ll/ۧۗ֫;->֫:I

    return v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 454
    iget-object v0, p0, Ll/ᩳۗ֫;->ᩴ:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ()J
    .locals 2

    .line 584
    invoke-direct {p0}, Ll/ᩳۗ֫;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 587
    :cond_0
    iget-object v0, p0, Ll/ᩳۗ֫;->ܺ:Ll/ܽۗ֫;

    invoke-virtual {v0}, Ll/ܽۗ֫;->ۧ()Ll/ۧۗ֫;

    move-result-object v0

    iget-wide v0, v0, Ll/ۧۗ֫;->ۧ:J

    return-wide v0
.end method

.method public final ܿ()V
    .locals 3

    const/4 v0, 0x0

    .line 411
    :goto_0
    iget-object v1, p0, Ll/ᩳۗ֫;->ۖ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 412
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۙ֫;

    invoke-virtual {v1}, Ll/ۘܽۧ;->ۘ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 414
    :cond_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 415
    iget-object v0, p0, Ll/ᩳۗ֫;->ܽ:Ll/֨᩷ۧ;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 416
    invoke-interface {v0}, Ll/֨᩷ۧ;->֫()V

    .line 417
    iput-object v1, p0, Ll/ᩳۗ֫;->ܽ:Ll/֨᩷ۧ;

    .line 419
    :cond_1
    iput-object v1, p0, Ll/ᩳۗ֫;->ᩳ:Ll/ܺ᩷ۧ;

    .line 421
    iget-object v0, p0, Ll/ᩳۗ֫;->ۧ:Ll/᩸۠֫;

    invoke-static {v0}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 422
    iput-object v1, p0, Ll/ᩳۗ֫;->ۧ:Ll/᩸۠֫;

    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 427
    iget-object v0, p0, Ll/ᩳۗ֫;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
