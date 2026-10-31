.class public final Ll/ܳ۬֫;
.super Ljava/lang/Object;
.source "K7UL"


# instance fields
.field public final ֫:I

.field public ۧ:I

.field public ܳ:Z

.field public final ܽ:Ll/֫۬֫;

.field public final ܿ:Ll/֫۬֫;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/֫۬֫;Ll/֫۬֫;I)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    .line 61
    iput p3, p0, Ll/ܳ۬֫;->֫:I

    .line 62
    iput-object p2, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    const/4 p1, 0x0

    .line 63
    iput p1, p0, Ll/ܳ۬֫;->ۧ:I

    .line 64
    iput-boolean p1, p0, Ll/ܳ۬֫;->ᩳ:Z

    .line 65
    iput-boolean p1, p0, Ll/ܳ۬֫;->ܳ:Z

    return-void
.end method

.method private ֫(Ll/֫۬֫;Ll/ܿۗ֫;Ll/֨ܿۧ;Ll/ܰ᩹֫;)I
    .locals 12

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 736
    iget-object v4, v2, Ll/ܿۗ֫;->ܺ:[Ll/ᩴܽۧ;

    const/4 v5, 0x1

    if-eqz v1, :cond_b

    .line 841
    invoke-interface {p1}, Ll/֫۬֫;->getState()I

    move-result v6

    if-eqz v6, :cond_b

    .line 737
    iget-object v6, v0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    if-ne v1, v6, :cond_1

    .line 87
    iget v7, v0, Ll/ܳ۬֫;->ۧ:I

    const/4 v8, 0x2

    if-eq v7, v8, :cond_0

    const/4 v8, 0x4

    if-ne v7, v8, :cond_1

    :cond_0
    return v5

    .line 738
    :cond_1
    iget-object v7, v0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    const/4 v9, 0x3

    if-ne v1, v7, :cond_2

    .line 92
    iget v7, v0, Ll/ܳ۬֫;->ۧ:I

    if-ne v7, v9, :cond_2

    return v5

    .line 743
    :cond_2
    invoke-interface {p1}, Ll/֫۬֫;->ܳ()Ll/ᩴܽۧ;

    move-result-object v7

    iget v8, v0, Ll/ܳ۬֫;->֫:I

    aget-object v10, v4, v8

    const/4 v11, 0x0

    if-eq v7, v10, :cond_3

    const/4 v7, 0x1

    goto :goto_0

    :cond_3
    const/4 v7, 0x0

    .line 744
    :goto_0
    invoke-virtual {p3, v8}, Ll/֨ܿۧ;->֫(I)Z

    move-result v10

    if-eqz v10, :cond_4

    if-nez v7, :cond_4

    goto :goto_3

    .line 749
    :cond_4
    invoke-interface {p1}, Ll/֫۬֫;->ܺ()Z

    move-result v7

    if-nez v7, :cond_7

    .line 751
    iget-object v3, v3, Ll/֨ܿۧ;->ᩳ:[Ll/ۢܿۧ;

    aget-object v3, v3, v8

    if-eqz v3, :cond_5

    .line 776
    invoke-interface {v3}, Ll/ᩴܿۧ;->length()I

    move-result v5

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    .line 777
    :goto_1
    new-array v6, v5, [Ll/۠ᩴ֫;

    :goto_2
    if-ge v11, v5, :cond_6

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    invoke-interface {v3, v11}, Ll/ᩴܿۧ;->֫(I)Ll/۠ᩴ֫;

    move-result-object v7

    aput-object v7, v6, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 752
    :cond_6
    aget-object v3, v4, v8

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    invoke-virtual {p2}, Ll/ܿۗ֫;->ᩳ()J

    move-result-wide v4

    .line 756
    invoke-virtual {p2}, Ll/ܿۗ֫;->ܽ()J

    move-result-wide v7

    iget-object v2, v2, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-object v10, v2, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    move-object v1, p1

    move-object v2, v6

    move-wide v6, v7

    move-object v8, v10

    .line 752
    invoke-interface/range {v1 .. v8}, Ll/֫۬֫;->֫([Ll/۠ᩴ֫;Ll/ᩴܽۧ;JJLl/ܺۧۧ;)V

    return v9

    .line 761
    :cond_7
    invoke-interface {p1}, Ll/֫۬֫;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_a

    move-object/from16 v2, p4

    .line 763
    invoke-direct {p0, p1, v2}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;Ll/ܰ᩹֫;)V

    if-eqz v10, :cond_8

    .line 764
    invoke-virtual {p0}, Ll/ܳ۬֫;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_b

    :cond_8
    if-ne v1, v6, :cond_9

    const/4 v11, 0x1

    .line 765
    :cond_9
    invoke-direct {p0, v11}, Ll/ܳ۬֫;->֫(Z)V

    return v5

    :cond_a
    return v11

    :cond_b
    :goto_3
    return v5
.end method

.method public static ֫(Ll/֫۬֫;J)V
    .locals 1

    .line 213
    invoke-interface {p0}, Ll/֫۬֫;->᩷()V

    .line 214
    instance-of v0, p0, Ll/ܺᩳۧ;

    if-eqz v0, :cond_0

    .line 215
    check-cast p0, Ll/ܺᩳۧ;

    invoke-virtual {p0, p1, p2}, Ll/ܺᩳۧ;->ܽ(J)V

    :cond_0
    return-void
.end method

.method private ֫(Ll/֫۬֫;Ll/ܰ᩹֫;)V
    .locals 1

    .line 667
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    if-eq v0, p1, :cond_1

    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 668
    invoke-static {p1}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    .line 671
    :cond_2
    invoke-virtual {p2, p1}, Ll/ܰ᩹֫;->֫(Ll/֫۬֫;)V

    .line 455
    invoke-interface {p1}, Ll/֫۬֫;->getState()I

    move-result p2

    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    .line 456
    invoke-interface {p1}, Ll/֫۬֫;->stop()V

    .line 673
    :cond_3
    invoke-interface {p1}, Ll/֫۬֫;->ᩳ()V

    return-void
.end method

.method private ֫(Z)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 704
    iget-boolean p1, p0, Ll/ܳ۬֫;->ᩳ:Z

    if-eqz p1, :cond_1

    .line 705
    iget-object p1, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-interface {p1}, Ll/֫۬֫;->reset()V

    .line 706
    iput-boolean v0, p0, Ll/ܳ۬֫;->ᩳ:Z

    return-void

    .line 708
    :cond_0
    iget-boolean p1, p0, Ll/ܳ۬֫;->ܳ:Z

    if-eqz p1, :cond_1

    .line 155
    iget-object p1, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    invoke-interface {p1}, Ll/֫۬֫;->reset()V

    .line 710
    iput-boolean v0, p0, Ll/ܳ۬֫;->ܳ:Z

    :cond_1
    return-void
.end method

.method public static ֫(Ll/֫۬֫;)Z
    .locals 0

    .line 841
    invoke-interface {p0}, Ll/֫۬֫;->getState()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ֫(Ll/ܿۗ֫;Ll/֫۬֫;)Z
    .locals 7

    const/4 v0, 0x1

    if-nez p2, :cond_0

    goto :goto_0

    .line 347
    :cond_0
    iget-object v1, p1, Ll/ܿۗ֫;->ܺ:[Ll/ᩴܽۧ;

    iget v2, p0, Ll/ܳ۬֫;->֫:I

    aget-object v1, v1, v2

    .line 348
    invoke-interface {p2}, Ll/֫۬֫;->ܳ()Ll/ᩴܽۧ;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 349
    invoke-interface {p2}, Ll/֫۬֫;->ܳ()Ll/ᩴܽۧ;

    move-result-object v3

    if-ne v3, v1, :cond_2

    if-eqz v1, :cond_4

    .line 351
    invoke-interface {p2}, Ll/֫۬֫;->᩻()Z

    move-result v1

    if-nez v1, :cond_4

    .line 365
    invoke-virtual {p1}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v1

    .line 371
    iget-object v3, p1, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-boolean v3, v3, Ll/ܳۗ֫;->ܿ:Z

    if-eqz v3, :cond_2

    if-eqz v1, :cond_2

    iget-boolean v3, v1, Ll/ܿۗ֫;->᩷:Z

    if-eqz v3, :cond_2

    instance-of v3, p2, Ll/ܺᩳۧ;

    if-nez v3, :cond_1

    instance-of v3, p2, Ll/ۛ۟֫;

    if-nez v3, :cond_1

    .line 376
    invoke-interface {p2}, Ll/֫۬֫;->֡()J

    move-result-wide v3

    invoke-virtual {v1}, Ll/ܿۗ֫;->ᩳ()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-ltz v1, :cond_2

    goto :goto_0

    :cond_1
    return v0

    .line 354
    :cond_2
    invoke-virtual {p1}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 357
    iget-object p1, p1, Ll/ܿۗ֫;->ܺ:[Ll/ᩴܽۧ;

    aget-object p1, p1, v2

    .line 358
    invoke-interface {p2}, Ll/֫۬֫;->ܳ()Ll/ᩴܽۧ;

    move-result-object p2

    if-ne p1, p2, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_0
    return v0
.end method

.method private ۜ(Ll/ܿۗ֫;)Ll/֫۬֫;
    .locals 4

    if-eqz p1, :cond_2

    .line 857
    iget-object p1, p1, Ll/ܿۗ֫;->ܺ:[Ll/ᩴܽۧ;

    iget v0, p0, Ll/ܳ۬֫;->֫:I

    aget-object v1, p1, v0

    if-nez v1, :cond_0

    goto :goto_0

    .line 860
    :cond_0
    iget-object v1, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-interface {v1}, Ll/֫۬֫;->ܳ()Ll/ᩴܽۧ;

    move-result-object v2

    aget-object v3, p1, v0

    if-ne v2, v3, :cond_1

    return-object v1

    .line 862
    :cond_1
    iget-object v1, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v1, :cond_2

    .line 863
    invoke-interface {v1}, Ll/֫۬֫;->ܳ()Ll/ᩴܽۧ;

    move-result-object v2

    aget-object p1, p1, v0

    if-ne v2, p1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final ֫(Ll/ܿۗ֫;Ll/֨ܿۧ;Ll/ܰ᩹֫;)I
    .locals 2

    .line 719
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    .line 720
    invoke-direct {p0, v0, p1, p2, p3}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;Ll/ܿۗ֫;Ll/֨ܿۧ;Ll/ܰ᩹֫;)I

    move-result v0

    .line 722
    iget-object v1, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    .line 723
    invoke-direct {p0, v1, p1, p2, p3}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;Ll/ܿۗ֫;Ll/֨ܿۧ;Ll/ܰ᩹֫;)I

    move-result p1

    const/4 p2, 0x1

    if-ne v0, p2, :cond_0

    return p1

    :cond_0
    return v0
.end method

.method public final ֫(JJ)J
    .locals 4

    .line 236
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 237
    invoke-interface {v0, p1, p2, p3, p4}, Ll/֫۬֫;->ۧ(JJ)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 240
    :goto_0
    iget-object v2, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v2, :cond_1

    .line 841
    invoke-interface {v2}, Ll/֫۬֫;->getState()I

    move-result v3

    if-eqz v3, :cond_1

    .line 244
    invoke-interface {v2, p1, p2, p3, p4}, Ll/֫۬֫;->ۧ(JJ)J

    move-result-wide p1

    .line 242
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    return-wide p1

    :cond_1
    return-wide v0
.end method

.method public final ֫()V
    .locals 2

    .line 256
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 257
    invoke-interface {v0}, Ll/֫۬֫;->ۜ()V

    return-void

    .line 258
    :cond_0
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 259
    invoke-interface {v0}, Ll/֫۬֫;->ۜ()V

    :cond_1
    return-void
.end method

.method public final ֫(F)V
    .locals 3

    .line 108
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-interface {v0}, Ll/֫۬֫;->ۖ()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 824
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v0, v2, v1}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    .line 825
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_1

    .line 826
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(FF)V
    .locals 1

    .line 270
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-interface {v0, p1, p2}, Ll/֫۬֫;->֫(FF)V

    .line 271
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_0

    .line 272
    invoke-interface {v0, p1, p2}, Ll/֫۬֫;->֫(FF)V

    :cond_0
    return-void
.end method

.method public final ֫(J)V
    .locals 3

    .line 200
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    .line 203
    invoke-static {v0, p1, p2}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;J)V

    .line 205
    :cond_0
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_1

    .line 841
    invoke-interface {v0}, Ll/֫۬֫;->getState()I

    move-result v1

    if-eqz v1, :cond_1

    .line 206
    iget v1, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    .line 208
    invoke-static {v0, p1, p2}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;J)V

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 4

    .line 108
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-interface {v0}, Ll/֫۬֫;->ۖ()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    return-void

    .line 798
    :cond_0
    iget v1, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v2, 0x4

    const/4 v3, 0x1

    if-eq v1, v2, :cond_2

    if-ne v1, v3, :cond_1

    goto :goto_0

    .line 802
    :cond_1
    invoke-interface {v0, v3, p1}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    return-void

    .line 155
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    invoke-interface {v0, v3, p1}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ll/ܿۗ֫;)V
    .locals 1

    .line 538
    invoke-direct {p0, p2}, Ll/ܳ۬֫;->ۜ(Ll/ܿۗ֫;)Ll/֫۬֫;

    move-result-object p2

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xb

    .line 539
    invoke-interface {p2, v0, p1}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/֨ܿۧ;Ll/֨ܿۧ;J)V
    .locals 7

    .line 166
    iget v0, p0, Ll/ܳ۬֫;->֫:I

    invoke-virtual {p1, v0}, Ll/֨ܿۧ;->֫(I)Z

    move-result v1

    .line 167
    invoke-virtual {p2, v0}, Ll/֨ܿۧ;->֫(I)Z

    move-result v2

    .line 168
    iget-object v3, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    iget-object v4, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v4, :cond_0

    iget v5, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v6, 0x3

    if-eq v5, v6, :cond_0

    if-nez v5, :cond_1

    .line 172
    invoke-static {v3}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v5

    if-eqz v5, :cond_1

    :cond_0
    move-object v4, v3

    :cond_1
    if-eqz v1, :cond_4

    .line 174
    invoke-interface {v4}, Ll/֫۬֫;->ܺ()Z

    move-result v1

    if-nez v1, :cond_4

    .line 108
    invoke-interface {v3}, Ll/֫۬֫;->ۖ()I

    move-result v1

    const/4 v3, -0x2

    if-ne v1, v3, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 176
    :goto_0
    iget-object p1, p1, Ll/֨ܿۧ;->ܽ:[Ll/ܿ۬֫;

    aget-object p1, p1, v0

    .line 177
    iget-object p2, p2, Ll/֨ܿۧ;->ܽ:[Ll/ܿ۬֫;

    aget-object p2, p2, v0

    if-eqz v2, :cond_3

    .line 179
    invoke-static {p2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    if-nez v1, :cond_3

    .line 181
    invoke-virtual {p0}, Ll/ܳ۬֫;->ܳ()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 188
    :cond_3
    invoke-static {v4, p3, p4}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;J)V

    :cond_4
    return-void
.end method

.method public final ֫(Ll/ۙ᩵֫;)V
    .locals 1

    .line 282
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-interface {v0, p1}, Ll/֫۬֫;->֫(Ll/ۙ᩵֫;)V

    .line 283
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_0

    .line 284
    invoke-interface {v0, p1}, Ll/֫۬֫;->֫(Ll/ۙ᩵֫;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܰ᩹֫;)V
    .locals 5

    .line 567
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-direct {p0, v0, p1}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;Ll/ܰ᩹֫;)V

    const/4 v1, 0x0

    .line 568
    iget-object v2, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v2, :cond_1

    .line 841
    invoke-interface {v2}, Ll/֫۬֫;->getState()I

    move-result v3

    if-eqz v3, :cond_0

    .line 570
    iget v3, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v4, 0x3

    if-eq v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 572
    :goto_0
    invoke-direct {p0, v2, p1}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;Ll/ܰ᩹֫;)V

    .line 573
    invoke-direct {p0, v1}, Ll/ܳ۬֫;->֫(Z)V

    if-eqz v3, :cond_1

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x11

    .line 599
    invoke-interface {v2, p1, v0}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    .line 578
    :cond_1
    iput v1, p0, Ll/ܳ۬֫;->ۧ:I

    return-void
.end method

.method public final ֫(Ll/ܿۗ֫;J)V
    .locals 0

    .line 684
    invoke-direct {p0, p1}, Ll/ܳ۬֫;->ۜ(Ll/ܿۗ֫;)Ll/֫۬֫;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 686
    invoke-interface {p1, p2, p3}, Ll/֫۬֫;->֫(J)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܿ۬֫;Ll/ۢܿۧ;Ll/ᩴܽۧ;JZZJJLl/ܺۧۧ;Ll/ܰ᩹֫;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p13

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 776
    invoke-interface/range {p2 .. p2}, Ll/ᩴܿۧ;->length()I

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 777
    :goto_0
    new-array v7, v4, [Ll/۠ᩴ֫;

    :goto_1
    if-ge v3, v4, :cond_1

    .line 155
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    invoke-interface {v1, v3}, Ll/ᩴܿۧ;->֫(I)Ll/۠ᩴ֫;

    move-result-object v5

    aput-object v5, v7, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 493
    :cond_1
    iget v1, v0, Ll/ܳ۬֫;->ۧ:I

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    const/4 v4, 0x2

    if-eq v1, v4, :cond_3

    const/4 v4, 0x4

    if-ne v1, v4, :cond_2

    goto :goto_2

    .line 511
    :cond_2
    iput-boolean v3, v0, Ll/ܳ۬֫;->ܳ:Z

    .line 155
    iget-object v1, v0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v5, v1

    move-object/from16 v6, p1

    move-object/from16 v8, p3

    move/from16 v9, p6

    move/from16 v10, p7

    move-wide/from16 v11, p8

    move-wide/from16 v13, p10

    move-object/from16 v15, p12

    .line 513
    invoke-interface/range {v5 .. v15}, Ll/֫۬֫;->֫(Ll/ܿ۬֫;[Ll/۠ᩴ֫;Ll/ᩴܽۧ;ZZJJLl/ܺۧۧ;)V

    .line 523
    invoke-virtual {v2, v1}, Ll/ܰ᩹֫;->ۧ(Ll/֫۬֫;)V

    return-void

    .line 498
    :cond_3
    :goto_2
    iput-boolean v3, v0, Ll/ܳ۬֫;->ᩳ:Z

    .line 499
    iget-object v5, v0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    move-object/from16 v6, p1

    move-object/from16 v8, p3

    move/from16 v9, p6

    move/from16 v10, p7

    move-wide/from16 v11, p8

    move-wide/from16 v13, p10

    move-object/from16 v15, p12

    invoke-interface/range {v5 .. v15}, Ll/֫۬֫;->֫(Ll/ܿ۬֫;[Ll/۠ᩴ֫;Ll/ᩴܽۧ;ZZJJLl/ܺۧۧ;)V

    .line 509
    iget-object v1, v0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-virtual {v2, v1}, Ll/ܰ᩹֫;->ۧ(Ll/֫۬֫;)V

    return-void
.end method

.method public final ֫(Ll/ᩴܽۧ;Ll/ܰ᩹֫;JZ)V
    .locals 2

    .line 644
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 645
    invoke-interface {v0}, Ll/֫۬֫;->ܳ()Ll/ᩴܽۧ;

    move-result-object v1

    if-eq p1, v1, :cond_0

    .line 647
    invoke-direct {p0, v0, p2}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;Ll/ܰ᩹֫;)V

    goto :goto_0

    :cond_0
    if-eqz p5, :cond_1

    .line 650
    invoke-interface {v0, p3, p4}, Ll/֫۬֫;->֫(J)V

    .line 631
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_3

    .line 644
    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 645
    invoke-interface {v0}, Ll/֫۬֫;->ܳ()Ll/ᩴܽۧ;

    move-result-object v1

    if-eq p1, v1, :cond_2

    .line 647
    invoke-direct {p0, v0, p2}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;Ll/ܰ᩹֫;)V

    return-void

    :cond_2
    if-eqz p5, :cond_3

    .line 650
    invoke-interface {v0, p3, p4}, Ll/֫۬֫;->֫(J)V

    :cond_3
    return-void
.end method

.method public final ֫(Ll/᩷۬֫;)V
    .locals 2

    .line 554
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    const/16 v1, 0x12

    invoke-interface {v0, v1, p1}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    .line 555
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_0

    .line 556
    invoke-interface {v0, v1, p1}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩹᩻ۧ;)V
    .locals 3

    .line 108
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-interface {v0}, Ll/֫۬֫;->ۖ()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x7

    .line 811
    invoke-interface {v0, v1, p1}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    .line 813
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_1

    .line 814
    invoke-interface {v0, v1, p1}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ܿۗ֫;)Z
    .locals 1

    .line 411
    invoke-direct {p0, p1}, Ll/ܳ۬֫;->ۜ(Ll/ܿۗ֫;)Ll/֫۬֫;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 413
    invoke-interface {p1}, Ll/֫۬֫;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    .line 414
    invoke-interface {p1}, Ll/֫۬֫;->ܿ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 415
    invoke-interface {p1}, Ll/֫۬֫;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ۖ()V
    .locals 3

    .line 446
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    .line 455
    invoke-interface {v0}, Ll/֫۬֫;->getState()I

    move-result v1

    if-ne v1, v2, :cond_0

    .line 456
    invoke-interface {v0}, Ll/֫۬֫;->stop()V

    .line 449
    :cond_0
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_1

    .line 841
    invoke-interface {v0}, Ll/֫۬֫;->getState()I

    move-result v1

    if-eqz v1, :cond_1

    .line 455
    invoke-interface {v0}, Ll/֫۬֫;->getState()I

    move-result v1

    if-ne v1, v2, :cond_1

    .line 456
    invoke-interface {v0}, Ll/֫۬֫;->stop()V

    :cond_1
    return-void
.end method

.method public final ۜ()V
    .locals 6

    .line 583
    iget v0, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-eq v0, v1, :cond_2

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 593
    iput v2, p0, Ll/ܳ۬֫;->ۧ:I

    :cond_1
    return-void

    :cond_2
    :goto_0
    if-ne v0, v3, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    .line 598
    :goto_1
    iget-object v1, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    const/16 v4, 0x11

    iget-object v5, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_4

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    invoke-interface {v5, v4, v1}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    goto :goto_2

    .line 155
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    invoke-interface {v1, v4, v5}, Ll/ۛۗ֫;->֫(ILjava/lang/Object;)V

    .line 589
    :goto_2
    iget v0, p0, Ll/ܳ۬֫;->ۧ:I

    if-ne v0, v3, :cond_5

    goto :goto_3

    :cond_5
    const/4 v2, 0x1

    .line 591
    :goto_3
    iput v2, p0, Ll/ܳ۬֫;->ۧ:I

    return-void
.end method

.method public final ۡ()V
    .locals 4

    .line 434
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-interface {v0}, Ll/֫۬֫;->getState()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget v1, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v3, 0x4

    if-eq v1, v3, :cond_0

    .line 436
    invoke-interface {v0}, Ll/֫۬֫;->start()V

    return-void

    .line 437
    :cond_0
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_1

    .line 438
    invoke-interface {v0}, Ll/֫۬֫;->getState()I

    move-result v1

    if-ne v1, v2, :cond_1

    iget v1, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    .line 440
    invoke-interface {v0}, Ll/֫۬֫;->start()V

    :cond_1
    return-void
.end method

.method public final ۢ()V
    .locals 1

    .line 694
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 695
    invoke-direct {p0, v0}, Ll/ܳ۬֫;->֫(Z)V

    .line 697
    :cond_0
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_2

    .line 841
    invoke-interface {v0}, Ll/֫۬֫;->getState()I

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 698
    invoke-direct {p0, v0}, Ll/ܳ۬֫;->֫(Z)V

    :cond_2
    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 97
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v0

    .line 98
    iget-object v1, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v1, :cond_0

    invoke-static {v1}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final ۧ(Ll/ܿۗ֫;)J
    .locals 2

    .line 123
    invoke-direct {p0, p1}, Ll/ܳ۬֫;->ۜ(Ll/ܿۗ֫;)Ll/֫۬֫;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ll/֫۬֫;->֡()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(JJ)V
    .locals 2

    .line 390
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 391
    invoke-interface {v0, p1, p2, p3, p4}, Ll/֫۬֫;->֫(JJ)V

    .line 393
    :cond_0
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 394
    invoke-interface {v0, p1, p2, p3, p4}, Ll/֫۬֫;->֫(JJ)V

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/ܰ᩹֫;)V
    .locals 4

    .line 606
    invoke-virtual {p0}, Ll/ܳ۬֫;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 609
    :cond_0
    iget v0, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v1, 0x1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-ne v0, v2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    if-eqz v3, :cond_4

    .line 615
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    goto :goto_3

    .line 155
    :cond_4
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    :goto_3
    invoke-direct {p0, v0, p1}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;Ll/ܰ᩹֫;)V

    .line 616
    invoke-direct {p0, v3}, Ll/ܳ۬֫;->֫(Z)V

    .line 620
    iput v1, p0, Ll/ܳ۬֫;->ۧ:I

    return-void
.end method

.method public final ۧ(Ll/ܿۗ֫;J)V
    .locals 0

    .line 147
    invoke-direct {p0, p1}, Ll/ܳ۬֫;->ۜ(Ll/ܿۗ֫;)Ll/֫۬֫;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    invoke-static {p1, p2, p3}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;J)V

    return-void
.end method

.method public final ܳ()Z
    .locals 2

    .line 87
    iget v0, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܳ(Ll/ܿۗ֫;)Z
    .locals 0

    .line 312
    invoke-direct {p0, p1}, Ll/ܳ۬֫;->ۜ(Ll/ܿۗ֫;)Ll/֫۬֫;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܺ()V
    .locals 1

    .line 73
    invoke-virtual {p0}, Ll/ܳ۬֫;->ܳ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 75
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    .line 77
    :cond_0
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_1

    .line 841
    invoke-interface {v0}, Ll/֫۬֫;->getState()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    .line 79
    :goto_0
    iput v0, p0, Ll/ܳ۬֫;->ۧ:I

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-interface {v0}, Ll/֫۬֫;->ۖ()I

    move-result v0

    return v0
.end method

.method public final ܽ(Ll/ܿۗ֫;)Z
    .locals 1

    .line 338
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-direct {p0, p1, v0}, Ll/ܳ۬֫;->֫(Ll/ܿۗ֫;Ll/֫۬֫;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    .line 339
    invoke-direct {p0, p1, v0}, Ll/ܳ۬֫;->֫(Ll/ܿۗ֫;Ll/֫۬֫;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ()Z
    .locals 3

    .line 296
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 297
    invoke-interface {v0}, Ll/֫۬֫;->ۧ()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 299
    :goto_0
    iget-object v1, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v1, :cond_1

    .line 841
    invoke-interface {v1}, Ll/֫۬֫;->getState()I

    move-result v2

    if-eqz v2, :cond_1

    .line 300
    invoke-interface {v1}, Ll/֫۬֫;->ۧ()Z

    move-result v1

    and-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public final ܿ(Ll/ܿۗ֫;)Z
    .locals 5

    .line 87
    iget v0, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 323
    :cond_0
    invoke-direct {p0, p1}, Ll/ܳ۬֫;->ۜ(Ll/ܿۗ֫;)Ll/֫۬֫;

    move-result-object v0

    iget-object v1, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 92
    :goto_0
    iget v1, p0, Ll/ܳ۬֫;->ۧ:I

    const/4 v4, 0x3

    if-ne v1, v4, :cond_2

    .line 326
    invoke-direct {p0, p1}, Ll/ܳ۬֫;->ۜ(Ll/ܿۗ֫;)Ll/֫۬֫;

    move-result-object p1

    iget-object v1, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-ne p1, v1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-nez v0, :cond_4

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    return v2

    :cond_4
    :goto_2
    return v3
.end method

.method public final ᩳ()Z
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ(Ll/ܿۗ֫;)Z
    .locals 0

    .line 132
    invoke-direct {p0, p1}, Ll/ܳ۬֫;->ۜ(Ll/ܿۗ֫;)Ll/֫۬֫;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    invoke-interface {p1}, Ll/֫۬֫;->᩻()Z

    move-result p1

    return p1
.end method

.method public final ᩷()V
    .locals 2

    .line 786
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-interface {v0}, Ll/֫۬֫;->֫()V

    const/4 v0, 0x0

    .line 787
    iput-boolean v0, p0, Ll/ܳ۬֫;->ᩳ:Z

    .line 788
    iget-object v1, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    if-eqz v1, :cond_0

    .line 789
    invoke-interface {v1}, Ll/֫۬֫;->֫()V

    .line 790
    iput-boolean v0, p0, Ll/ܳ۬֫;->ܳ:Z

    :cond_0
    return-void
.end method

.method public final ᩻(Ll/ܿۗ֫;)V
    .locals 0

    .line 425
    invoke-direct {p0, p1}, Ll/ܳ۬֫;->ۜ(Ll/ܿۗ֫;)Ll/֫۬֫;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    invoke-interface {p1}, Ll/֫۬֫;->ۡ()V

    return-void
.end method

.method public final ᩻()Z
    .locals 2

    .line 831
    iget v0, p0, Ll/ܳ۬֫;->ۧ:I

    if-eqz v0, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 155
    :cond_0
    iget-object v0, p0, Ll/ܳ۬֫;->ܿ:Ll/֫۬֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    invoke-interface {v0}, Ll/֫۬֫;->getState()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0

    .line 836
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ܳ۬֫;->ܽ:Ll/֫۬֫;

    invoke-static {v0}, Ll/ܳ۬֫;->֫(Ll/֫۬֫;)Z

    move-result v0

    return v0
.end method
