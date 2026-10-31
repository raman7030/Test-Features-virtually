.class public final Ll/᩺֫ܳ;
.super Ljava/lang/Object;
.source "A70P"


# instance fields
.field public ֫:Ll/۫֫ܳ;

.field public ۧ:I

.field public ܳ:I

.field public final ܽ:Ljava/util/ArrayDeque;

.field public final ܿ:I

.field public final ᩳ:Ll/ۛ֫ܳ;


# direct methods
.method public constructor <init>(Ll/۫֫ܳ;)V
    .locals 2

    .line 788
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 781
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/᩺֫ܳ;->ܽ:Ljava/util/ArrayDeque;

    .line 786
    new-instance v1, Ll/ۛ֫ܳ;

    invoke-direct {v1}, Ll/ۛ֫ܳ;-><init>()V

    iput-object v1, p0, Ll/᩺֫ܳ;->ᩳ:Ll/ۛ֫ܳ;

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 29
    :cond_0
    iget v1, p1, Ll/۫֫ܳ;->ܳ:I

    .line 789
    :goto_0
    iput v1, p0, Ll/᩺֫ܳ;->ܿ:I

    if-eqz p1, :cond_1

    .line 791
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 792
    invoke-direct {p0}, Ll/᩺֫ܳ;->ᩳ()Ll/۫֫ܳ;

    move-result-object p1

    iput-object p1, p0, Ll/᩺֫ܳ;->֫:Ll/۫֫ܳ;

    :cond_1
    return-void
.end method

.method private ֫(IZLl/ܿۖ᩷;)V
    .locals 6

    .line 847
    iget v0, p0, Ll/᩺֫ܳ;->ܳ:I

    if-lt p1, v0, :cond_7

    iget v0, p0, Ll/᩺֫ܳ;->ܿ:I

    if-gt p1, v0, :cond_7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 851
    :goto_0
    iget v2, p0, Ll/᩺֫ܳ;->ܳ:I

    if-ge v2, p1, :cond_6

    add-int/lit8 v2, v1, 0x1

    and-int/lit16 v1, v1, 0xff

    if-nez v1, :cond_1

    if-eqz p3, :cond_1

    .line 853
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 854
    :cond_0
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1

    .line 856
    :cond_1
    :goto_1
    iget-object v1, p0, Ll/᩺֫ܳ;->֫:Ll/۫֫ܳ;

    if-eqz v1, :cond_5

    .line 859
    iget v3, p0, Ll/᩺֫ܳ;->ܳ:I

    sub-int v3, p1, v3

    iget v1, v1, Ll/۫֫ܳ;->ܳ:I

    iget v4, p0, Ll/᩺֫ܳ;->ۧ:I

    sub-int/2addr v1, v4

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-eqz p2, :cond_3

    .line 862
    iget-object v3, p0, Ll/᩺֫ܳ;->֫:Ll/۫֫ܳ;

    invoke-virtual {v3}, Ll/۫֫ܳ;->֫()Z

    move-result v3

    iget-object v4, p0, Ll/᩺֫ܳ;->ᩳ:Ll/ۛ֫ܳ;

    if-eqz v3, :cond_2

    .line 863
    iget-object v3, p0, Ll/᩺֫ܳ;->֫:Ll/۫֫ܳ;

    iget-object v3, v3, Ll/۫֫ܳ;->ۧ:[J

    iget v5, p0, Ll/᩺֫ܳ;->ۧ:I

    invoke-virtual {v4, v5, v1, v3}, Ll/ۛ֫ܳ;->֫(II[J)V

    goto :goto_2

    .line 865
    :cond_2
    iget-object v3, p0, Ll/᩺֫ܳ;->֫:Ll/۫֫ܳ;

    iget-boolean v3, v3, Ll/۫֫ܳ;->᩷:Z

    invoke-virtual {v4, v1, v3}, Ll/ۛ֫ܳ;->֫(IZ)V

    .line 868
    :cond_3
    :goto_2
    iget v3, p0, Ll/᩺֫ܳ;->ܳ:I

    add-int/2addr v3, v1

    iput v3, p0, Ll/᩺֫ܳ;->ܳ:I

    .line 869
    iget v3, p0, Ll/᩺֫ܳ;->ۧ:I

    add-int/2addr v3, v1

    iput v3, p0, Ll/᩺֫ܳ;->ۧ:I

    .line 870
    iget-object v1, p0, Ll/᩺֫ܳ;->֫:Ll/۫֫ܳ;

    iget v1, v1, Ll/۫֫ܳ;->ܳ:I

    if-ne v3, v1, :cond_4

    .line 871
    invoke-direct {p0}, Ll/᩺֫ܳ;->ᩳ()Ll/۫֫ܳ;

    move-result-object v1

    iput-object v1, p0, Ll/᩺֫ܳ;->֫:Ll/۫֫ܳ;

    .line 872
    iput v0, p0, Ll/᩺֫ܳ;->ۧ:I

    :cond_4
    move v1, v2

    goto :goto_0

    .line 857
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Dirty stream ended early"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    return-void

    .line 848
    :cond_7
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string p3, "Invalid dirty stream target "

    .line 0
    invoke-static {p1, p3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 848
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private ᩳ()Ll/۫֫ܳ;
    .locals 3

    .line 878
    :goto_0
    iget-object v0, p0, Ll/᩺֫ܳ;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 879
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫֫ܳ;

    .line 880
    invoke-virtual {v1}, Ll/۫֫ܳ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 883
    :cond_0
    iget-object v2, v1, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 884
    iget-object v1, v1, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final ֫()Ll/۫֫ܳ;
    .locals 1

    .line 832
    iget-object v0, p0, Ll/᩺֫ܳ;->ᩳ:Ll/ۛ֫ܳ;

    invoke-virtual {v0}, Ll/ۛ֫ܳ;->֫()Ll/۫֫ܳ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 2

    .line 828
    iget-object v0, p0, Ll/᩺֫ܳ;->ᩳ:Ll/ۛ֫ܳ;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ۛ֫ܳ;->֫(IZ)V

    return-void
.end method

.method public final ֫(ILl/ܿۖ᩷;)V
    .locals 1

    const/4 v0, 0x1

    .line 811
    invoke-direct {p0, p1, v0, p2}, Ll/᩺֫ܳ;->֫(IZLl/ܿۖ᩷;)V

    return-void
.end method

.method public final ֫(J)V
    .locals 1

    .line 842
    iget-object v0, p0, Ll/᩺֫ܳ;->ᩳ:Ll/ۛ֫ܳ;

    invoke-virtual {v0, p1, p2}, Ll/ۛ֫ܳ;->֫(J)V

    return-void
.end method

.method public final ۧ()J
    .locals 2

    .line 837
    iget-object v0, p0, Ll/᩺֫ܳ;->ᩳ:Ll/ۛ֫ܳ;

    invoke-virtual {v0}, Ll/ۛ֫ܳ;->ۧ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 803
    :try_start_0
    invoke-direct {p0, p1, v0, v1}, Ll/᩺֫ܳ;->֫(IZLl/ܿۖ᩷;)V
    :try_end_0
    .catch Ll/᩻ܽܳ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 805
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final ܽ()I
    .locals 1

    .line 797
    iget v0, p0, Ll/᩺֫ܳ;->ܳ:I

    return v0
.end method

.method public final ܽ(I)V
    .locals 6

    if-ltz p1, :cond_0

    .line 816
    iget v0, p0, Ll/᩺֫ܳ;->ܳ:I

    int-to-long v1, v0

    int-to-long v3, p1

    add-long/2addr v1, v3

    iget v3, p0, Ll/᩺֫ܳ;->ܿ:I

    int-to-long v3, v3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    add-int/2addr v0, p1

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 820
    :try_start_0
    invoke-direct {p0, v0, p1, v1}, Ll/᩺֫ܳ;->֫(IZLl/ܿۖ᩷;)V
    :try_end_0
    .catch Ll/᩻ܽܳ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 822
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 817
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid dirty stream skip length"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
