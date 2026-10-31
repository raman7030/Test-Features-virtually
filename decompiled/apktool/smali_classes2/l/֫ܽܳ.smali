.class public final Ll/֫ܽܳ;
.super Ljava/lang/Object;
.source "D70T"


# instance fields
.field public final ֫:Ll/᩺֫ܳ;

.field public ۖ:J

.field public final ۘ:Ll/۫ۧܳ;

.field public ۜ:Z

.field public ۡ:I

.field public final ۢ:I

.field public ۧ:I

.field public final ܳ:Ll/۫ܽܳ;

.field public ܺ:I

.field public final ܽ:Z

.field public ܿ:[I

.field public ᩳ:I

.field public final ᩴ:[B

.field public final synthetic ᩵:Ll/ۧܽܳ;

.field public ᩷:J

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ۧܽܳ;I[B)V
    .locals 2

    .line 4686
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    const/4 v0, -0x1

    .line 4677
    iput v0, p0, Ll/֫ܽܳ;->ۧ:I

    .line 4679
    iput v0, p0, Ll/֫ܽܳ;->ܺ:I

    .line 4687
    iput p2, p0, Ll/֫ܽܳ;->ۢ:I

    .line 4688
    iput-object p3, p0, Ll/֫ܽܳ;->ᩴ:[B

    .line 4689
    array-length v0, p3

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Ll/֫ܽܳ;->ܽ:Z

    .line 4690
    invoke-static {p1}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۧܳ;->֫()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Ll/֫ܽܳ;->ۖ:J

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    .line 49
    array-length v1, p3

    if-eqz v1, :cond_1

    .line 52
    new-instance v1, Ll/۫ܽܳ;

    invoke-direct {v1, p3}, Ll/۫ܽܳ;-><init>([B)V

    .line 4692
    iput-object v1, p0, Ll/֫ܽܳ;->ܳ:Ll/۫ܽܳ;

    const/16 p3, 0x100

    new-array p3, p3, [I

    .line 4693
    iput-object p3, p0, Ll/֫ܽܳ;->ܿ:[I

    .line 4694
    iput-object v0, p0, Ll/֫ܽܳ;->֫:Ll/᩺֫ܳ;

    .line 4695
    iput-object v0, p0, Ll/֫ܽܳ;->ۘ:Ll/۫ۧܳ;

    goto :goto_1

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Pattern replacement must not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4697
    :cond_2
    iput-object v0, p0, Ll/֫ܽܳ;->ܳ:Ll/۫ܽܳ;

    .line 4698
    iput-object v0, p0, Ll/֫ܽܳ;->ܿ:[I

    .line 4699
    new-instance p3, Ll/᩺֫ܳ;

    invoke-static {p1}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v0

    iget-object v0, v0, Ll/۟ۧܳ;->ܽ:Ll/۫֫ܳ;

    invoke-direct {p3, v0}, Ll/᩺֫ܳ;-><init>(Ll/۫֫ܳ;)V

    iput-object p3, p0, Ll/֫ܽܳ;->֫:Ll/᩺֫ܳ;

    .line 4700
    new-instance p3, Ll/۫ۧܳ;

    invoke-direct {p3}, Ll/۫ۧܳ;-><init>()V

    iput-object p3, p0, Ll/֫ܽܳ;->ۘ:Ll/۫ۧܳ;

    .line 4701
    invoke-static {p1}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object p3

    invoke-virtual {p3}, Ll/۟ۧܳ;->֫()I

    move-result p3

    int-to-long v0, p3

    invoke-direct {p0, v0, v1}, Ll/֫ܽܳ;->֫(J)V

    :goto_1
    if-eqz p2, :cond_3

    goto :goto_3

    .line 4704
    :cond_3
    invoke-static {p1}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object p2

    iget-object p2, p2, Ll/۟ۧܳ;->ܽ:Ll/۫֫ܳ;

    sget p3, Ll/ᩳܽܳ;->ܿ֫:I

    if-nez p2, :cond_4

    const-wide/16 p2, 0x0

    goto :goto_2

    .line 38
    :cond_4
    iget-wide p2, p2, Ll/۫֫ܳ;->ܽ:J

    .line 4704
    :goto_2
    invoke-static {p1}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object p1

    .line 4705
    invoke-virtual {p1}, Ll/۟ۧܳ;->֫()I

    move-result p1

    int-to-long v0, p1

    .line 4704
    invoke-direct {p0, p2, p3, v0, v1}, Ll/֫ܽܳ;->֫(JJ)J

    :goto_3
    return-void
.end method

.method private ֫(JJ)J
    .locals 7

    .line 4992
    iget-object v0, p0, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v0}, Ll/ۧܽܳ;->ۘ(Ll/ۧܽܳ;)J

    move-result-wide v1

    iget-object v3, p0, Ll/֫ܽܳ;->ᩴ:[B

    array-length v3, v3

    int-to-long v3, v3

    const-wide/16 v5, 0x58

    .line 4993
    invoke-static {v3, v4, v5, v6}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v3

    .line 4992
    invoke-static {v1, v2, v3, v4}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    .line 4995
    iget-object v3, p0, Ll/֫ܽܳ;->ۘ:Ll/۫ۧܳ;

    invoke-virtual {v3}, Ll/۫ۧܳ;->֫()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    .line 4996
    invoke-static {v0}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v3

    iget-object v3, v3, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    invoke-static {v3}, Ll/᩵ᩳܳ;->ۖ(Ll/ۡᩳܳ;)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    .line 4997
    invoke-static {v0}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v3

    iget-object v3, v3, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    invoke-static {v3}, Ll/᩵ᩳܳ;->ܳ(Ll/ۡᩳܳ;)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    .line 4998
    invoke-static {v0}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v0

    iget-object v0, v0, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    invoke-static {v0}, Ll/᩵ᩳܳ;->᩻(Ll/ۡᩳܳ;)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v0

    .line 4999
    invoke-static {v0, v1, p1, p2}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide p1

    .line 5000
    invoke-static {p3, p4}, Ll/ܰ֫ܳ;->֫(J)J

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method private ֫()V
    .locals 11

    .line 4862
    iget v0, p0, Ll/֫ܽܳ;->ᩳ:I

    if-nez v0, :cond_0

    return-void

    .line 4865
    :cond_0
    iget-object v0, p0, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v0}, Ll/ۧܽܳ;->᩵(Ll/ۧܽܳ;)Ll/ۡᩳܳ;

    move-result-object v1

    iget-object v2, p0, Ll/֫ܽܳ;->ܿ:[I

    iget v3, p0, Ll/֫ܽܳ;->ᩳ:I

    iget v4, p0, Ll/֫ܽܳ;->ۢ:I

    invoke-static {v1, v2, v3, v4}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;[III)J

    move-result-wide v1

    .line 4867
    invoke-static {v0}, Ll/ۧܽܳ;->᩵(Ll/ۧܽܳ;)Ll/ۡᩳܳ;

    move-result-object v3

    invoke-static {v3}, Ll/᩵ᩳܳ;->ܳ(Ll/ۡᩳܳ;)J

    move-result-wide v5

    invoke-static {v0}, Ll/ۧܽܳ;->ۖ(Ll/ۧܽܳ;)J

    move-result-wide v7

    invoke-static {v0}, Ll/ۧܽܳ;->ۘ(Ll/ۧܽܳ;)J

    move-result-wide v9

    .line 4868
    invoke-static {v7, v8, v9, v10}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v7

    .line 4867
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v5

    .line 4869
    invoke-static {v0}, Ll/ۧܽܳ;->᩵(Ll/ۧܽܳ;)Ll/ۡᩳܳ;

    move-result-object v3

    .line 4870
    invoke-static {v3}, Ll/᩵ᩳܳ;->ۖ(Ll/ۡᩳܳ;)J

    move-result-wide v7

    .line 4869
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v5

    .line 4871
    invoke-static {v0}, Ll/ۧܽܳ;->ܿ(Ll/ۧܽܳ;)Ll/۫֫ܳ;

    move-result-object v3

    invoke-static {v3}, Ll/ܰ֫ܳ;->ܳ(Ll/۫֫ܳ;)J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v5

    const-wide/16 v7, 0x3c0

    mul-long v1, v1, v7

    .line 4872
    invoke-static {v0}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v3

    .line 4875
    invoke-virtual {v3}, Ll/۟ۧܳ;->֫()I

    move-result v3

    iget-object v7, p0, Ll/֫ܽܳ;->ܿ:[I

    iget v8, p0, Ll/֫ܽܳ;->ᩳ:I

    invoke-static {v3, v8, v4, v7}, Ll/ᩳܽܳ;->֫(III[I)J

    move-result-wide v7

    invoke-static {v0}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v3

    .line 4878
    invoke-virtual {v3}, Ll/۟ۧܳ;->֫()I

    move-result v3

    iget-object v9, p0, Ll/֫ܽܳ;->ܿ:[I

    iget v10, p0, Ll/֫ܽܳ;->ᩳ:I

    invoke-static {v3, v10, v4, v9}, Ll/ᩳܽܳ;->ۧ(III[I)J

    move-result-wide v9

    .line 4874
    invoke-static {v7, v8, v9, v10}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v7

    .line 4873
    invoke-static {v1, v2, v7, v8}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    .line 4872
    invoke-static {v5, v6, v1, v2}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    .line 4881
    iget-boolean v3, p0, Ll/֫ܽܳ;->᩻:Z

    iget-object v5, p0, Ll/֫ܽܳ;->ܳ:Ll/۫ܽܳ;

    if-nez v3, :cond_1

    .line 4882
    invoke-virtual {v5}, Ll/۫ܽܳ;->ܽ()J

    move-result-wide v6

    invoke-static {v1, v2, v6, v7}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    .line 4884
    :cond_1
    invoke-static {v1, v2}, Ll/ᩳܽܳ;->ۧ(J)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 4887
    invoke-static {v0}, Ll/ۧܽܳ;->᩵(Ll/ۧܽܳ;)Ll/ۡᩳܳ;

    move-result-object v1

    iget-object v2, p0, Ll/֫ܽܳ;->ܿ:[I

    iget v3, p0, Ll/֫ܽܳ;->ᩳ:I

    invoke-static {v1, v2, v3, v4, v5}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;[IIILl/۫ܽܳ;)Ll/ۡᩳܳ;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧܽܳ;->֫(Ll/ۧܽܳ;Ll/ۡᩳܳ;)V

    .line 4889
    iget-boolean v1, p0, Ll/֫ܽܳ;->᩻:Z

    if-nez v1, :cond_2

    .line 4890
    invoke-static {v0}, Ll/ۧܽܳ;->ۖ(Ll/ۧܽܳ;)J

    move-result-wide v1

    invoke-virtual {v5}, Ll/۫ܽܳ;->ܽ()J

    move-result-wide v5

    invoke-static {v1, v2, v5, v6}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Ll/ۧܽܳ;->ᩳ(Ll/ۧܽܳ;J)V

    const/4 v1, 0x1

    .line 4891
    iput-boolean v1, p0, Ll/֫ܽܳ;->᩻:Z

    .line 4893
    :cond_2
    invoke-static {v0}, Ll/ۧܽܳ;->ܿ(Ll/ۧܽܳ;)Ll/۫֫ܳ;

    move-result-object v1

    iget-object v2, p0, Ll/֫ܽܳ;->ܿ:[I

    iget v3, p0, Ll/֫ܽܳ;->ᩳ:I

    invoke-static {v1, v2, v3, v4}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;[III)Ll/۫֫ܳ;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧܽܳ;->֫(Ll/ۧܽܳ;Ll/۫֫ܳ;)V

    .line 4895
    invoke-static {v0}, Ll/ۧܽܳ;->᩶(Ll/ۧܽܳ;)V

    const/4 v0, 0x0

    .line 4896
    iput v0, p0, Ll/֫ܽܳ;->ᩳ:I

    return-void

    .line 4885
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Edit metadata exceeds memory limit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֫(I)V
    .locals 8

    .line 4901
    iget-boolean v0, p0, Ll/֫ܽܳ;->ܽ:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 4902
    invoke-direct {p0, p1, v1}, Ll/֫ܽܳ;->֫(II)V

    return-void

    :cond_0
    int-to-long v2, p1

    .line 4905
    iget v0, p0, Ll/֫ܽܳ;->ۢ:I

    int-to-long v4, v0

    add-long/2addr v2, v4

    if-ltz p1, :cond_4

    .line 4906
    iget v4, p0, Ll/֫ܽܳ;->ܺ:I

    if-lt p1, v4, :cond_4

    iget-object v4, p0, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v4}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v4

    .line 4907
    invoke-virtual {v4}, Ll/۟ۧܳ;->֫()I

    move-result v4

    int-to-long v4, v4

    cmp-long v6, v2, v4

    if-gtz v6, :cond_4

    .line 4911
    iget-wide v4, p0, Ll/֫ܽܳ;->ۖ:J

    iget-object v6, p0, Ll/֫ܽܳ;->ᩴ:[B

    array-length v6, v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    int-to-long v6, v0

    sub-long/2addr v4, v6

    const-wide/32 v6, 0x7fffffff

    cmp-long v0, v4, v6

    if-gtz v0, :cond_3

    ushr-int/lit8 v0, p1, 0x10

    .line 4918
    iget v6, p0, Ll/֫ܽܳ;->ᩳ:I

    if-eqz v6, :cond_1

    iget v6, p0, Ll/֫ܽܳ;->ۧ:I

    if-eq v0, v6, :cond_1

    .line 4919
    invoke-direct {p0}, Ll/֫ܽܳ;->֫()V

    .line 4921
    :cond_1
    iput v0, p0, Ll/֫ܽܳ;->ۧ:I

    .line 4922
    iget v0, p0, Ll/֫ܽܳ;->ᩳ:I

    add-int/2addr v0, v1

    .line 4965
    iget-object v1, p0, Ll/֫ܽܳ;->ܿ:[I

    array-length v6, v1

    if-gt v0, v6, :cond_2

    goto :goto_0

    .line 4968
    :cond_2
    array-length v1, v1

    shl-int/lit8 v1, v1, 0x1

    .line 4969
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/high16 v1, 0x10000

    .line 4968
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 4970
    iget-object v1, p0, Ll/֫ܽܳ;->ܿ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/֫ܽܳ;->ܿ:[I

    .line 4923
    :goto_0
    iget-object v0, p0, Ll/֫ܽܳ;->ܿ:[I

    iget v1, p0, Ll/֫ܽܳ;->ᩳ:I

    add-int/lit8 v6, v1, 0x1

    iput v6, p0, Ll/֫ܽܳ;->ᩳ:I

    aput p1, v0, v1

    .line 4924
    iput-wide v4, p0, Ll/֫ܽܳ;->ۖ:J

    long-to-int p1, v2

    .line 4925
    iput p1, p0, Ll/֫ܽܳ;->ܺ:I

    .line 4926
    iget-wide v0, p0, Ll/֫ܽܳ;->᩷:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/֫ܽܳ;->᩷:J

    return-void

    .line 4914
    :cond_3
    new-instance p1, Ll/۟֫ܳ;

    invoke-direct {p1}, Ll/۟֫ܳ;-><init>()V

    throw p1

    .line 4908
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Invalid batch match offset "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4908
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֫(II)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    if-lez v2, :cond_6

    .line 4934
    iget v3, v0, Ll/֫ܽܳ;->ۢ:I

    int-to-long v4, v3

    int-to-long v6, v2

    mul-long v4, v4, v6

    int-to-long v8, v1

    add-long/2addr v8, v4

    if-ltz v1, :cond_5

    .line 4936
    iget v10, v0, Ll/֫ܽܳ;->ܺ:I

    if-lt v1, v10, :cond_5

    iget-object v10, v0, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v10}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v10

    .line 4937
    invoke-virtual {v10}, Ll/۟ۧܳ;->֫()I

    move-result v10

    int-to-long v10, v10

    cmp-long v12, v8, v10

    if-gtz v12, :cond_5

    .line 4941
    iget-object v10, v0, Ll/֫ܽܳ;->ᩴ:[B

    array-length v10, v10

    int-to-long v10, v10

    mul-long v10, v10, v6

    .line 4942
    iget-wide v12, v0, Ll/֫ܽܳ;->ۖ:J

    add-long/2addr v12, v10

    sub-long/2addr v12, v4

    const-wide/32 v14, 0x7fffffff

    cmp-long v16, v12, v14

    if-gtz v16, :cond_4

    .line 4946
    iget-object v14, v0, Ll/֫ܽܳ;->ۘ:Ll/۫ۧܳ;

    invoke-virtual {v14, v1, v3, v2}, Ll/۫ۧܳ;->֫(III)V

    .line 4947
    invoke-direct {v0, v12, v13}, Ll/֫ܽܳ;->֫(J)V

    .line 4948
    iget-object v2, v0, Ll/֫ܽܳ;->֫:Ll/᩺֫ܳ;

    invoke-virtual {v2}, Ll/᩺֫ܳ;->ܽ()I

    move-result v3

    if-ge v3, v1, :cond_1

    .line 4975
    iget v3, v0, Ll/֫ܽܳ;->ۡ:I

    if-eqz v3, :cond_0

    .line 4976
    invoke-virtual {v2, v3}, Ll/᩺֫ܳ;->֫(I)V

    const/4 v3, 0x0

    .line 4977
    iput v3, v0, Ll/֫ܽܳ;->ۡ:I

    .line 4950
    :cond_0
    invoke-virtual {v2, v1}, Ll/᩺֫ܳ;->ۧ(I)V

    :cond_1
    long-to-int v1, v4

    .line 4952
    invoke-virtual {v2, v1}, Ll/᩺֫ܳ;->ܽ(I)V

    .line 4953
    iget v1, v0, Ll/֫ܽܳ;->ۡ:I

    long-to-int v3, v10

    int-to-long v4, v1

    int-to-long v10, v3

    add-long/2addr v4, v10

    long-to-int v1, v4

    int-to-long v10, v1

    cmp-long v3, v4, v10

    if-nez v3, :cond_3

    iput v1, v0, Ll/֫ܽܳ;->ۡ:I

    .line 4956
    invoke-virtual {v2}, Ll/᩺֫ܳ;->ۧ()J

    move-result-wide v1

    .line 4955
    invoke-direct {v0, v1, v2, v12, v13}, Ll/֫ܽܳ;->֫(JJ)J

    move-result-wide v1

    .line 4983
    invoke-static {v1, v2}, Ll/ᩳܽܳ;->ۧ(J)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4958
    iput-wide v12, v0, Ll/֫ܽܳ;->ۖ:J

    long-to-int v1, v8

    .line 4959
    iput v1, v0, Ll/֫ܽܳ;->ܺ:I

    .line 4960
    iget-wide v1, v0, Ll/֫ܽܳ;->᩷:J

    add-long/2addr v1, v6

    iput-wide v1, v0, Ll/֫ܽܳ;->᩷:J

    return-void

    .line 4984
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Replacement edit metadata exceeds memory limit"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 0
    :cond_3
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    .line 4944
    :cond_4
    new-instance v1, Ll/۟֫ܳ;

    invoke-direct {v1}, Ll/۟֫ܳ;-><init>()V

    throw v1

    .line 4938
    :cond_5
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    const-string v3, "Invalid batch match run "

    .line 0
    invoke-static {v1, v3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4938
    invoke-direct {v2, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 4932
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Empty replacement run"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private ֫(J)V
    .locals 15

    move-object v0, p0

    .line 5005
    iget-object v1, v0, Ll/֫ܽܳ;->֫:Ll/᩺֫ܳ;

    if-nez v1, :cond_0

    return-void

    .line 5008
    :cond_0
    iget-object v2, v0, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۧܽܳ;->ۘ(Ll/ۧܽܳ;)J

    move-result-wide v3

    iget-object v5, v0, Ll/֫ܽܳ;->ᩴ:[B

    array-length v5, v5

    int-to-long v5, v5

    const-wide/16 v7, 0x58

    .line 5009
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v5

    iget-object v7, v0, Ll/֫ܽܳ;->ۘ:Ll/۫ۧܳ;

    .line 5011
    invoke-virtual {v7}, Ll/۫ۧܳ;->֫()J

    move-result-wide v7

    invoke-static {v2}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v9

    iget-object v9, v9, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    .line 5013
    invoke-static {v9}, Ll/᩵ᩳܳ;->ۖ(Ll/ۡᩳܳ;)J

    move-result-wide v9

    invoke-static {v2}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v11

    iget-object v11, v11, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    .line 5015
    invoke-static {v11}, Ll/᩵ᩳܳ;->ܳ(Ll/ۡᩳܳ;)J

    move-result-wide v11

    invoke-static {v2}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v2

    iget-object v2, v2, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    .line 5016
    invoke-static {v2}, Ll/᩵ᩳܳ;->᩻(Ll/ۡᩳܳ;)J

    move-result-wide v13

    .line 5014
    invoke-static {v11, v12, v13, v14}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v11

    .line 5012
    invoke-static {v9, v10, v11, v12}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v9

    .line 5011
    invoke-static {v7, v8, v9, v10}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v7

    .line 5009
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v5

    .line 5008
    invoke-static {v3, v4, v5, v6}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    .line 5019
    invoke-static/range {p1 .. p2}, Ll/ܰ֫ܳ;->֫(J)J

    move-result-wide v4

    .line 5018
    invoke-static {v2, v3, v4, v5}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    const-wide/16 v4, 0x2050

    .line 5020
    invoke-static {v2, v3, v4, v5}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    const-wide/32 v4, 0x4000000

    sub-long/2addr v4, v2

    const-wide/16 v2, 0x0

    .line 5023
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/᩺֫ܳ;->֫(J)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ܽܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/֫ܽܳ;->ۜ:Z

    return-void
.end method


# virtual methods
.method public final ֫(I[I)V
    .locals 10

    const-string v0, "originalOffsets"

    .line 4729
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4730
    array-length v0, p2

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Ll/ۡܽܳ;->ۧ(III)V

    .line 4731
    iget-object v0, p0, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v0}, Ll/ۧܽܳ;->ܺ(Ll/ۧܽܳ;)Ll/ᩳܽܳ;

    move-result-object v0

    monitor-enter v0

    .line 5028
    :try_start_0
    iget-object v2, p0, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۧܽܳ;->᩹(Ll/ۧܽܳ;)V

    .line 5029
    iget-boolean v3, p0, Ll/֫ܽܳ;->ۜ:Z

    if-nez v3, :cond_3

    invoke-static {v2}, Ll/ۧܽܳ;->֫(Ll/ۧܽܳ;)Ll/֫ܽܳ;

    move-result-object v2

    if-ne v2, p0, :cond_3

    .line 4735
    iget-boolean v2, p0, Ll/֫ܽܳ;->ܽ:Z

    if-eqz v2, :cond_0

    :goto_0
    if-ge v1, p1, :cond_2

    .line 4737
    aget v2, p2, v1

    invoke-direct {p0, v2}, Ll/֫ܽܳ;->֫(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v1, p1, :cond_2

    .line 4742
    aget v2, p2, v1

    const/4 v3, 0x1

    :goto_2
    add-int v4, v1, v3

    if-ge v4, p1, :cond_1

    add-int/lit8 v5, v4, -0x1

    .line 4744
    aget v5, p2, v5

    int-to-long v5, v5

    iget v7, p0, Ll/֫ܽܳ;->ۢ:I

    int-to-long v7, v7

    add-long/2addr v5, v7

    aget v7, p2, v4

    int-to-long v7, v7

    cmp-long v9, v5, v7

    if-nez v9, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 4750
    :cond_1
    invoke-direct {p0, v2, v3}, Ll/֫ܽܳ;->֫(II)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v4

    goto :goto_1

    .line 4760
    :cond_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    .line 5030
    :cond_3
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Batch replacement is not active"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    .line 4755
    :goto_3
    :try_start_3
    iget-object p2, p0, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {p2}, Ll/ۧܽܳ;->ۜ(Ll/ۧܽܳ;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 4756
    iget-object p2, p0, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {p2}, Ll/ۧܽܳ;->᩸(Ll/ۧܽܳ;)V

    .line 4758
    :cond_4
    throw p1

    .line 4760
    :goto_4
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ܿۖ᩷;)V
    .locals 17

    move-object/from16 v1, p0

    const/4 v2, 0x0

    if-nez p1, :cond_0

    move-object v3, v2

    goto :goto_0

    .line 4770
    :cond_0
    invoke-static/range {p1 .. p1}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object v3

    .line 4771
    :goto_0
    iget-object v4, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v4}, Ll/ۧܽܳ;->ܺ(Ll/ۧܽܳ;)Ll/ᩳܽܳ;

    move-result-object v4

    move-object/from16 v16, v4

    monitor-enter v16

    .line 5028
    :try_start_0
    iget-object v4, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v4}, Ll/ۧܽܳ;->᩹(Ll/ۧܽܳ;)V

    .line 5029
    iget-boolean v5, v1, Ll/֫ܽܳ;->ۜ:Z

    if-nez v5, :cond_d

    invoke-static {v4}, Ll/ۧܽܳ;->֫(Ll/ۧܽܳ;)Ll/֫ܽܳ;

    move-result-object v4

    if-ne v4, v1, :cond_d

    if-eqz v3, :cond_1

    .line 4775
    iget-object v4, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v4, v3}, Ll/ۧܽܳ;->֫(Ll/ۧܽܳ;Ll/ܿۖ᩷;)V

    .line 4777
    :cond_1
    iget-wide v4, v1, Ll/֫ܽܳ;->᩷:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-eqz v8, :cond_c

    .line 4778
    iget-boolean v4, v1, Ll/֫ܽܳ;->ܽ:Z

    if-eqz v4, :cond_2

    .line 4779
    invoke-direct/range {p0 .. p0}, Ll/֫ܽܳ;->֫()V

    goto/16 :goto_4

    .line 4975
    :cond_2
    iget v4, v1, Ll/֫ܽܳ;->ۡ:I

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    .line 4976
    iget-object v8, v1, Ll/֫ܽܳ;->֫:Ll/᩺֫ܳ;

    invoke-virtual {v8, v4}, Ll/᩺֫ܳ;->֫(I)V

    .line 4977
    iput v5, v1, Ll/֫ܽܳ;->ۡ:I

    .line 4782
    :cond_3
    iget-object v4, v1, Ll/֫ܽܳ;->֫:Ll/᩺֫ܳ;

    iget-object v5, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v5}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v5

    invoke-virtual {v5}, Ll/۟ۧܳ;->֫()I

    move-result v5

    invoke-virtual {v4, v5, v3}, Ll/᩺֫ܳ;->֫(ILl/ܿۖ᩷;)V

    .line 4783
    iget-object v4, v1, Ll/֫ܽܳ;->֫:Ll/᩺֫ܳ;

    .line 4784
    invoke-virtual {v4}, Ll/᩺֫ܳ;->ۧ()J

    move-result-wide v4

    iget-wide v8, v1, Ll/֫ܽܳ;->ۖ:J

    .line 4783
    invoke-direct {v1, v4, v5, v8, v9}, Ll/֫ܽܳ;->֫(JJ)J

    move-result-wide v4

    .line 4983
    invoke-static {v4, v5}, Ll/ᩳܽܳ;->ۧ(J)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 4786
    iget-object v4, v1, Ll/֫ܽܳ;->֫:Ll/᩺֫ܳ;

    invoke-virtual {v4}, Ll/᩺֫ܳ;->֫()Ll/۫֫ܳ;

    move-result-object v4

    .line 4788
    iget-wide v8, v1, Ll/֫ܽܳ;->ۖ:J

    cmp-long v5, v8, v6

    if-eqz v5, :cond_5

    .line 4789
    iget-object v2, v1, Ll/֫ܽܳ;->ۘ:Ll/۫ۧܳ;

    invoke-virtual {v2, v3}, Ll/۫ۧܳ;->֫(Ll/ܿۖ᩷;)Ll/۬ۧܳ;

    move-result-object v11

    .line 4791
    iget-object v2, v1, Ll/֫ܽܳ;->ᩴ:[B

    array-length v2, v2

    int-to-long v5, v2

    .line 4792
    invoke-virtual {v11}, Ll/۬ۧܳ;->֫()J

    move-result-wide v7

    const-wide/16 v9, 0x58

    invoke-static {v7, v8, v9, v10}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v7

    .line 4791
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v5

    .line 4794
    iget-object v2, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۧܽܳ;->ۘ(Ll/ۧܽܳ;)J

    move-result-wide v7

    iget-object v2, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v2

    iget-object v2, v2, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    .line 4797
    invoke-static {v2}, Ll/᩵ᩳܳ;->ۖ(Ll/ۡᩳܳ;)J

    move-result-wide v9

    iget-object v2, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v2

    iget-object v2, v2, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    .line 4800
    invoke-static {v2}, Ll/᩵ᩳܳ;->ܳ(Ll/ۡᩳܳ;)J

    move-result-wide v12

    iget-object v2, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v2

    iget-object v2, v2, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    .line 4802
    invoke-static {v2}, Ll/᩵ᩳܳ;->᩻(Ll/ۡᩳܳ;)J

    move-result-wide v14

    .line 4799
    invoke-static {v12, v13, v14, v15}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v12

    .line 4796
    invoke-static {v9, v10, v12, v13}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v9

    .line 4795
    invoke-static {v7, v8, v9, v10}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v7

    .line 4794
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v5

    .line 4804
    iget-object v2, v1, Ll/֫ܽܳ;->֫:Ll/᩺֫ܳ;

    .line 4805
    invoke-virtual {v2}, Ll/᩺֫ܳ;->ۧ()J

    move-result-wide v7

    const-wide/16 v9, 0x1

    .line 4808
    invoke-static {v9, v10}, Ll/᩵ᩳܳ;->֫(J)J

    move-result-wide v9

    .line 4806
    invoke-static {v5, v6, v9, v10}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v5

    .line 4804
    invoke-static {v7, v8, v5, v6}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v5

    .line 4983
    invoke-static {v5, v6}, Ll/ᩳܽܳ;->ۧ(J)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 4810
    new-instance v2, Ll/ۛۧܳ;

    iget-object v5, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v5}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v5

    iget-object v6, v5, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    iget-object v5, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v5}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;

    move-result-object v5

    .line 4811
    invoke-virtual {v5}, Ll/۟ۧܳ;->֫()I

    move-result v7

    iget-wide v8, v1, Ll/֫ܽܳ;->ۖ:J

    long-to-int v8, v8

    iget v9, v1, Ll/֫ܽܳ;->ۢ:I

    iget-object v10, v1, Ll/֫ܽܳ;->ᩴ:[B

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Ll/ۛۧܳ;-><init>(Ll/ۡᩳܳ;III[BLl/۬ۧܳ;)V

    .line 4813
    iget-object v5, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    const/4 v6, 0x1

    new-array v6, v6, [Ll/ᩴܽܳ;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    invoke-static {v5, v6}, Ll/ۧܽܳ;->ۧ(Ll/ۧܽܳ;[Ll/ᩴܽܳ;)V

    .line 4814
    invoke-static {v2}, Ll/᩵ᩳܳ;->֫(Ll/ᩴܽܳ;)Ll/ۡᩳܳ;

    move-result-object v5

    .line 4815
    iget-object v6, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۛۧܳ;->ܿ(Ll/ۛۧܳ;)J

    move-result-wide v7

    invoke-static {v6, v7, v8}, Ll/ۧܽܳ;->ܿ(Ll/ۧܽܳ;J)V

    .line 4816
    iget-object v6, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-virtual {v2}, Ll/ۛۧܳ;->ܿ()J

    move-result-wide v7

    invoke-static {v6, v7, v8}, Ll/ۧܽܳ;->ۧ(Ll/ۧܽܳ;J)V

    move-object v2, v5

    goto :goto_1

    .line 4984
    :cond_4
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Replacement edit metadata exceeds memory limit"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    :goto_1
    if-nez v2, :cond_6

    const/4 v5, 0x0

    goto :goto_2

    .line 45
    :cond_6
    iget v5, v2, Ll/ۡᩳܳ;->᩻:I

    :goto_2
    int-to-long v5, v5

    .line 4818
    iget-wide v7, v1, Ll/֫ܽܳ;->ۖ:J

    cmp-long v9, v5, v7

    if-nez v9, :cond_a

    if-nez v4, :cond_7

    const/4 v5, 0x0

    goto :goto_3

    .line 29
    :cond_7
    iget v5, v4, Ll/۫֫ܳ;->ܳ:I

    :goto_3
    int-to-long v5, v5

    cmp-long v9, v5, v7

    if-nez v9, :cond_a

    .line 4823
    iget-object v5, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v5, v2}, Ll/ۧܽܳ;->֫(Ll/ۧܽܳ;Ll/ۡᩳܳ;)V

    .line 4824
    iget-object v5, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v5, v4}, Ll/ۧܽܳ;->֫(Ll/ۧܽܳ;Ll/۫֫ܳ;)V

    .line 4826
    invoke-static {v2}, Ll/᩵ᩳܳ;->ܺ(Ll/ۡᩳܳ;)Ll/ۘᩳܳ;

    move-result-object v2

    .line 4827
    iget-object v4, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-virtual {v2}, Ll/ۘᩳܳ;->֫()J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Ll/ۧܽܳ;->֫(Ll/ۧܽܳ;J)V

    .line 4828
    iget-object v4, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-virtual {v2}, Ll/ۘᩳܳ;->ܽ()J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Ll/ۧܽܳ;->ܽ(Ll/ۧܽܳ;J)V

    .line 4829
    iget-object v2, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۧܽܳ;->ᩳ(Ll/ۧܽܳ;)J

    move-result-wide v4

    const-wide/32 v6, 0x800000

    cmp-long v2, v4, v6

    if-gtz v2, :cond_9

    .line 4833
    iget-object v2, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    const-wide/16 v4, 0x0

    invoke-static {v2, v4, v5}, Ll/ۧܽܳ;->ᩳ(Ll/ۧܽܳ;J)V

    .line 4834
    iget-object v2, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۧܽܳ;->᩶(Ll/ۧܽܳ;)V

    :goto_4
    if-eqz v3, :cond_8

    .line 4837
    iget-object v2, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2, v3}, Ll/ۧܽܳ;->֫(Ll/ۧܽܳ;Ll/ܿۖ᩷;)V

    .line 4839
    :cond_8
    iget-object v2, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۧܽܳ;->۠(Ll/ۧܽܳ;)V

    .line 4840
    iget-object v2, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۧܽܳ;->ܶ(Ll/ۧܽܳ;)V

    goto :goto_5

    .line 4830
    :cond_9
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Literal heap storage exceeds memory limit"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 4820
    :cond_a
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Batch replacement length mismatch"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 4984
    :cond_b
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Replacement edit metadata exceeds memory limit"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_c
    :goto_5
    const/4 v2, 0x1

    .line 4842
    iput-boolean v2, v1, Ll/֫ܽܳ;->ۜ:Z

    .line 4843
    iget-object v2, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v2}, Ll/ۧܽܳ;->ۚ(Ll/ۧܽܳ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4850
    :try_start_1
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    .line 5030
    :cond_d
    :try_start_2
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Batch replacement is not active"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_8

    :catch_0
    move-exception v0

    :goto_6
    move-object v2, v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    goto :goto_6

    .line 4845
    :goto_7
    :try_start_3
    iget-object v3, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v3}, Ll/ۧܽܳ;->ۜ(Ll/ۧܽܳ;)Z

    move-result v3

    if-nez v3, :cond_e

    .line 4846
    iget-object v3, v1, Ll/֫ܽܳ;->᩵:Ll/ۧܽܳ;

    invoke-static {v3}, Ll/ۧܽܳ;->᩸(Ll/ۧܽܳ;)V

    .line 4848
    :cond_e
    throw v2

    .line 4850
    :goto_8
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v2
.end method
