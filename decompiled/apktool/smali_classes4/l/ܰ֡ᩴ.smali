.class public final Ll/ܰ֡ᩴ;
.super Ljava/lang/Object;
.source "1CGN"

# interfaces
.implements Ll/ۧۚᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۗ:Ll/۟֡ᩴ;

.field public ۙ:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/۟֡ᩴ;)V
    .locals 1

    .line 857
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ֡ᩴ;->ۗ:Ll/۟֡ᩴ;

    const/4 v0, -0x1

    .line 843
    iput v0, p0, Ll/ܰ֡ᩴ;->ۙ:I

    .line 850
    iput v0, p0, Ll/ܰ֡ᩴ;->᩸:I

    .line 858
    iget p1, p1, Ll/۟֡ᩴ;->᩶:I

    iput p1, p0, Ll/ܰ֡ᩴ;->᩶:I

    const/4 p1, 0x0

    .line 859
    iput p1, p0, Ll/ܰ֡ᩴ;->᩹:I

    return-void
.end method

.method private final ֫()V
    .locals 6

    .line 937
    iget v0, p0, Ll/ܰ֡ᩴ;->᩹:I

    if-ltz v0, :cond_0

    goto :goto_1

    .line 938
    :cond_0
    iget v0, p0, Ll/ܰ֡ᩴ;->ۙ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 939
    iput v0, p0, Ll/ܰ֡ᩴ;->᩹:I

    return-void

    .line 942
    :cond_1
    iget v0, p0, Ll/ܰ֡ᩴ;->᩶:I

    iget-object v2, p0, Ll/ܰ֡ᩴ;->ۗ:Ll/۟֡ᩴ;

    if-ne v0, v1, :cond_2

    .line 943
    iget v0, v2, Ll/۟֡ᩴ;->᩺:I

    iput v0, p0, Ll/ܰ֡ᩴ;->᩹:I

    return-void

    .line 946
    :cond_2
    iget v0, v2, Ll/۟֡ᩴ;->᩶:I

    const/4 v1, 0x1

    .line 947
    iput v1, p0, Ll/ܰ֡ᩴ;->᩹:I

    .line 948
    :goto_0
    iget v3, p0, Ll/ܰ֡ᩴ;->ۙ:I

    if-eq v0, v3, :cond_3

    .line 949
    iget-object v3, v2, Ll/۟֡ᩴ;->۬:[J

    aget-wide v4, v3, v0

    long-to-int v0, v4

    .line 950
    iget v3, p0, Ll/ܰ֡ᩴ;->᩹:I

    add-int/2addr v3, v1

    iput v3, p0, Ll/ܰ֡ᩴ;->᩹:I

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {}, Ll/ۘ᩺ۘ;->֫()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 5

    .line 924
    iget-object v0, p0, Ll/ܰ֡ᩴ;->ۗ:Ll/۟֡ᩴ;

    iget-object v1, v0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 925
    iget-object v0, v0, Ll/۟֡ᩴ;->۬:[J

    .line 926
    :goto_0
    iget v2, p0, Ll/ܰ֡ᩴ;->᩶:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 927
    iput v2, p0, Ll/ܰ֡ᩴ;->᩸:I

    .line 928
    aget-wide v3, v0, v2

    long-to-int v4, v3

    iput v4, p0, Ll/ܰ֡ᩴ;->᩶:I

    .line 929
    iput v2, p0, Ll/ܰ֡ᩴ;->ۙ:I

    .line 930
    iget v3, p0, Ll/ܰ֡ᩴ;->᩹:I

    if-ltz v3, :cond_0

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Ll/ܰ֡ᩴ;->᩹:I

    .line 932
    :cond_0
    aget-object v2, v1, v2

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 893
    iget v0, p0, Ll/ܰ֡ᩴ;->᩶:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 2

    .line 898
    iget v0, p0, Ll/ܰ֡ᩴ;->ۙ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 903
    invoke-virtual {p0}, Ll/ܰ֡ᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 904
    iget v0, p0, Ll/ܰ֡ᩴ;->᩶:I

    iput v0, p0, Ll/ܰ֡ᩴ;->᩸:I

    .line 905
    iget-object v1, p0, Ll/ܰ֡ᩴ;->ۗ:Ll/۟֡ᩴ;

    iget-object v2, v1, Ll/۟֡ᩴ;->۬:[J

    aget-wide v3, v2, v0

    long-to-int v2, v3

    iput v2, p0, Ll/ܰ֡ᩴ;->᩶:I

    .line 906
    iput v0, p0, Ll/ܰ֡ᩴ;->ۙ:I

    .line 907
    iget v2, p0, Ll/ܰ֡ᩴ;->᩹:I

    if-ltz v2, :cond_0

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ܰ֡ᩴ;->᩹:I

    .line 909
    :cond_0
    iget-object v1, v1, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0

    .line 903
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 956
    invoke-direct {p0}, Ll/ܰ֡ᩴ;->֫()V

    .line 957
    iget v0, p0, Ll/ܰ֡ᩴ;->᩹:I

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 5

    .line 914
    invoke-virtual {p0}, Ll/ܰ֡ᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 915
    iget v0, p0, Ll/ܰ֡ᩴ;->ۙ:I

    iput v0, p0, Ll/ܰ֡ᩴ;->᩸:I

    .line 916
    iget-object v1, p0, Ll/ܰ֡ᩴ;->ۗ:Ll/۟֡ᩴ;

    iget-object v2, v1, Ll/۟֡ᩴ;->۬:[J

    aget-wide v3, v2, v0

    const/16 v2, 0x20

    ushr-long v2, v3, v2

    long-to-int v3, v2

    iput v3, p0, Ll/ܰ֡ᩴ;->ۙ:I

    .line 917
    iput v0, p0, Ll/ܰ֡ᩴ;->᩶:I

    .line 918
    iget v2, p0, Ll/ܰ֡ᩴ;->᩹:I

    if-ltz v2, :cond_0

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܰ֡ᩴ;->᩹:I

    .line 919
    :cond_0
    iget-object v1, v1, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0

    .line 914
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 962
    invoke-direct {p0}, Ll/ܰ֡ᩴ;->֫()V

    .line 963
    iget v0, p0, Ll/ܰ֡ᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 13

    .line 968
    invoke-direct {p0}, Ll/ܰ֡ᩴ;->֫()V

    .line 969
    iget v0, p0, Ll/ܰ֡ᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_a

    .line 970
    iget v2, p0, Ll/ܰ֡ᩴ;->ۙ:I

    const/16 v3, 0x20

    iget-object v4, p0, Ll/ܰ֡ᩴ;->ۗ:Ll/۟֡ᩴ;

    if-ne v0, v2, :cond_0

    .line 973
    iget v2, p0, Ll/ܰ֡ᩴ;->᩹:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܰ֡ᩴ;->᩹:I

    .line 974
    iget-object v2, v4, Ll/۟֡ᩴ;->۬:[J

    aget-wide v5, v2, v0

    ushr-long/2addr v5, v3

    long-to-int v2, v5

    iput v2, p0, Ll/ܰ֡ᩴ;->ۙ:I

    goto :goto_0

    .line 975
    :cond_0
    iget-object v2, v4, Ll/۟֡ᩴ;->۬:[J

    aget-wide v5, v2, v0

    long-to-int v2, v5

    iput v2, p0, Ll/ܰ֡ᩴ;->᩶:I

    .line 976
    :goto_0
    iget v2, v4, Ll/۟֡ᩴ;->᩺:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v4, Ll/۟֡ᩴ;->᩺:I

    .line 979
    iget v2, p0, Ll/ܰ֡ᩴ;->ۙ:I

    const-wide v5, 0xffffffffL

    if-ne v2, v1, :cond_1

    iget v7, p0, Ll/ܰ֡ᩴ;->᩶:I

    iput v7, v4, Ll/۟֡ᩴ;->᩶:I

    goto :goto_1

    .line 980
    :cond_1
    iget-object v7, v4, Ll/۟֡ᩴ;->۬:[J

    aget-wide v8, v7, v2

    iget v10, p0, Ll/ܰ֡ᩴ;->᩶:I

    int-to-long v10, v10

    and-long/2addr v10, v5

    xor-long/2addr v10, v8

    and-long/2addr v10, v5

    xor-long/2addr v8, v10

    aput-wide v8, v7, v2

    .line 981
    :goto_1
    iget v7, p0, Ll/ܰ֡ᩴ;->᩶:I

    if-ne v7, v1, :cond_2

    iput v2, v4, Ll/۟֡ᩴ;->ۗ:I

    goto :goto_2

    .line 982
    :cond_2
    iget-object v8, v4, Ll/۟֡ᩴ;->۬:[J

    aget-wide v9, v8, v7

    int-to-long v11, v2

    and-long/2addr v5, v11

    shl-long v2, v5, v3

    xor-long/2addr v2, v9

    const-wide v5, -0x100000000L

    and-long/2addr v2, v5

    xor-long/2addr v2, v9

    aput-wide v2, v8, v7

    .line 984
    :goto_2
    iput v1, p0, Ll/ܰ֡ᩴ;->᩸:I

    .line 985
    iget v1, v4, Ll/۟֡ᩴ;->ۨ:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    .line 986
    iput-boolean v0, v4, Ll/۟֡ᩴ;->᩸:Z

    .line 987
    iget-object v0, v4, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    aput-object v2, v0, v1

    return-void

    .line 990
    :cond_3
    iget-object v1, v4, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    :goto_3
    add-int/lit8 v3, v0, 0x1

    .line 993
    iget v5, v4, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v3, v5

    .line 995
    :goto_4
    aget-object v5, v1, v3

    if-nez v5, :cond_4

    .line 996
    aput-object v2, v1, v0

    return-void

    .line 999
    :cond_4
    iget-object v6, v4, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v6, v5}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v6

    invoke-static {v6}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    iget v7, v4, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v6, v7

    if-gt v0, v3, :cond_5

    if-ge v0, v6, :cond_6

    if-le v6, v3, :cond_9

    goto :goto_5

    :cond_5
    if-lt v0, v6, :cond_9

    if-le v6, v3, :cond_9

    .line 1003
    :cond_6
    :goto_5
    aput-object v5, v1, v0

    .line 1004
    iget v5, p0, Ll/ܰ֡ᩴ;->᩶:I

    if-ne v5, v3, :cond_7

    iput v0, p0, Ll/ܰ֡ᩴ;->᩶:I

    .line 1005
    :cond_7
    iget v5, p0, Ll/ܰ֡ᩴ;->ۙ:I

    if-ne v5, v3, :cond_8

    iput v0, p0, Ll/ܰ֡ᩴ;->ۙ:I

    .line 1006
    :cond_8
    invoke-virtual {v4, v3, v0}, Ll/۟֡ᩴ;->ۧ(II)V

    move v0, v3

    goto :goto_3

    :cond_9
    add-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v7

    goto :goto_4

    .line 969
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {}, Ll/ۘ᩺ۘ;->ܽ()V

    const/4 p1, 0x0

    throw p1
.end method
