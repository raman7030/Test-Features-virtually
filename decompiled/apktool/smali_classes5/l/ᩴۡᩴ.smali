.class public final Ll/ᩴۡᩴ;
.super Ljava/lang/Object;
.source "0C94"

# interfaces
.implements Ll/ܶۡᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۗ:Ll/᩵ۡᩴ;

.field public ۙ:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/᩵ۡᩴ;)V
    .locals 1

    .line 906
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۡᩴ;->ۗ:Ll/᩵ۡᩴ;

    const/4 v0, -0x1

    .line 892
    iput v0, p0, Ll/ᩴۡᩴ;->ۙ:I

    .line 899
    iput v0, p0, Ll/ᩴۡᩴ;->᩸:I

    .line 907
    iget p1, p1, Ll/᩵ۡᩴ;->᩶:I

    iput p1, p0, Ll/ᩴۡᩴ;->᩶:I

    const/4 p1, 0x0

    .line 908
    iput p1, p0, Ll/ᩴۡᩴ;->᩹:I

    return-void
.end method

.method private final ֫()V
    .locals 6

    .line 986
    iget v0, p0, Ll/ᩴۡᩴ;->᩹:I

    if-ltz v0, :cond_0

    goto :goto_1

    .line 987
    :cond_0
    iget v0, p0, Ll/ᩴۡᩴ;->ۙ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 988
    iput v0, p0, Ll/ᩴۡᩴ;->᩹:I

    return-void

    .line 991
    :cond_1
    iget v0, p0, Ll/ᩴۡᩴ;->᩶:I

    iget-object v2, p0, Ll/ᩴۡᩴ;->ۗ:Ll/᩵ۡᩴ;

    if-ne v0, v1, :cond_2

    .line 992
    iget v0, v2, Ll/᩵ۡᩴ;->᩺:I

    iput v0, p0, Ll/ᩴۡᩴ;->᩹:I

    return-void

    .line 995
    :cond_2
    iget v0, v2, Ll/᩵ۡᩴ;->᩶:I

    const/4 v1, 0x1

    .line 996
    iput v1, p0, Ll/ᩴۡᩴ;->᩹:I

    .line 997
    :goto_0
    iget v3, p0, Ll/ᩴۡᩴ;->ۙ:I

    if-eq v0, v3, :cond_3

    .line 998
    iget-object v3, v2, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v4, v3, v0

    long-to-int v0, v4

    .line 999
    iget v3, p0, Ll/ᩴۡᩴ;->᩹:I

    add-int/2addr v3, v1

    iput v3, p0, Ll/ᩴۡᩴ;->᩹:I

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final synthetic add(I)V
    .locals 0

    .line 0
    invoke-static {}, Ll/۠ۡᩴ;->֫()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 887
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/ᩴۡᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 5

    .line 973
    iget-object v0, p0, Ll/ᩴۡᩴ;->ۗ:Ll/᩵ۡᩴ;

    iget-object v1, v0, Ll/᩵ۡᩴ;->ۙ:[I

    .line 974
    iget-object v0, v0, Ll/᩵ۡᩴ;->۬:[J

    .line 975
    :goto_0
    iget v2, p0, Ll/ᩴۡᩴ;->᩶:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 976
    iput v2, p0, Ll/ᩴۡᩴ;->᩸:I

    .line 977
    aget-wide v3, v0, v2

    long-to-int v4, v3

    iput v4, p0, Ll/ᩴۡᩴ;->᩶:I

    .line 978
    iput v2, p0, Ll/ᩴۡᩴ;->ۙ:I

    .line 979
    iget v3, p0, Ll/ᩴۡᩴ;->᩹:I

    if-ltz v3, :cond_0

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Ll/ᩴۡᩴ;->᩹:I

    .line 981
    :cond_0
    aget v2, v1, v2

    invoke-interface {p1, v2}, Ljava/util/function/IntConsumer;->accept(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 942
    iget v0, p0, Ll/ᩴۡᩴ;->᩶:I

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

    .line 947
    iget v0, p0, Ll/ᩴۡᩴ;->ۙ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Integer;
    .locals 1

    .line 103
    invoke-static {p0}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Ll/ᩴۡᩴ;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 1005
    invoke-direct {p0}, Ll/ᩴۡᩴ;->֫()V

    .line 1006
    iget v0, p0, Ll/ᩴۡᩴ;->᩹:I

    return v0
.end method

.method public final nextInt()I
    .locals 5

    .line 952
    invoke-virtual {p0}, Ll/ᩴۡᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 953
    iget v0, p0, Ll/ᩴۡᩴ;->᩶:I

    iput v0, p0, Ll/ᩴۡᩴ;->᩸:I

    .line 954
    iget-object v1, p0, Ll/ᩴۡᩴ;->ۗ:Ll/᩵ۡᩴ;

    iget-object v2, v1, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v3, v2, v0

    long-to-int v2, v3

    iput v2, p0, Ll/ᩴۡᩴ;->᩶:I

    .line 955
    iput v0, p0, Ll/ᩴۡᩴ;->ۙ:I

    .line 956
    iget v2, p0, Ll/ᩴۡᩴ;->᩹:I

    if-ltz v2, :cond_0

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ᩴۡᩴ;->᩹:I

    .line 958
    :cond_0
    iget-object v1, v1, Ll/᩵ۡᩴ;->ۙ:[I

    aget v0, v1, v0

    return v0

    .line 952
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/ᩴۡᩴ;->ۖ֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 1011
    invoke-direct {p0}, Ll/ᩴۡᩴ;->֫()V

    .line 1012
    iget v0, p0, Ll/ᩴۡᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 13

    .line 1017
    invoke-direct {p0}, Ll/ᩴۡᩴ;->֫()V

    .line 1018
    iget v0, p0, Ll/ᩴۡᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_a

    .line 1019
    iget v2, p0, Ll/ᩴۡᩴ;->ۙ:I

    const/16 v3, 0x20

    iget-object v4, p0, Ll/ᩴۡᩴ;->ۗ:Ll/᩵ۡᩴ;

    if-ne v0, v2, :cond_0

    .line 1022
    iget v2, p0, Ll/ᩴۡᩴ;->᩹:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ᩴۡᩴ;->᩹:I

    .line 1023
    iget-object v2, v4, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v5, v2, v0

    ushr-long/2addr v5, v3

    long-to-int v2, v5

    iput v2, p0, Ll/ᩴۡᩴ;->ۙ:I

    goto :goto_0

    .line 1024
    :cond_0
    iget-object v2, v4, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v5, v2, v0

    long-to-int v2, v5

    iput v2, p0, Ll/ᩴۡᩴ;->᩶:I

    .line 1025
    :goto_0
    iget v2, v4, Ll/᩵ۡᩴ;->᩺:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v4, Ll/᩵ۡᩴ;->᩺:I

    .line 1028
    iget v2, p0, Ll/ᩴۡᩴ;->ۙ:I

    const-wide v5, 0xffffffffL

    if-ne v2, v1, :cond_1

    iget v7, p0, Ll/ᩴۡᩴ;->᩶:I

    iput v7, v4, Ll/᩵ۡᩴ;->᩶:I

    goto :goto_1

    .line 1029
    :cond_1
    iget-object v7, v4, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v8, v7, v2

    iget v10, p0, Ll/ᩴۡᩴ;->᩶:I

    int-to-long v10, v10

    and-long/2addr v10, v5

    xor-long/2addr v10, v8

    and-long/2addr v10, v5

    xor-long/2addr v8, v10

    aput-wide v8, v7, v2

    .line 1030
    :goto_1
    iget v7, p0, Ll/ᩴۡᩴ;->᩶:I

    if-ne v7, v1, :cond_2

    iput v2, v4, Ll/᩵ۡᩴ;->ۗ:I

    goto :goto_2

    .line 1031
    :cond_2
    iget-object v8, v4, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v9, v8, v7

    int-to-long v11, v2

    and-long/2addr v5, v11

    shl-long v2, v5, v3

    xor-long/2addr v2, v9

    const-wide v5, -0x100000000L

    and-long/2addr v2, v5

    xor-long/2addr v2, v9

    aput-wide v2, v8, v7

    .line 1033
    :goto_2
    iput v1, p0, Ll/ᩴۡᩴ;->᩸:I

    .line 1034
    iget v1, v4, Ll/᩵ۡᩴ;->ۨ:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    .line 1035
    iput-boolean v2, v4, Ll/᩵ۡᩴ;->᩸:Z

    .line 1036
    iget-object v0, v4, Ll/᩵ۡᩴ;->ۙ:[I

    aput v2, v0, v1

    return-void

    .line 1039
    :cond_3
    iget-object v1, v4, Ll/᩵ۡᩴ;->ۙ:[I

    :goto_3
    add-int/lit8 v3, v0, 0x1

    .line 1042
    iget v5, v4, Ll/᩵ۡᩴ;->۫:I

    and-int/2addr v3, v5

    .line 1044
    :goto_4
    aget v5, v1, v3

    if-nez v5, :cond_4

    .line 1045
    aput v2, v1, v0

    return-void

    .line 1048
    :cond_4
    invoke-static {v5}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    iget v7, v4, Ll/᩵ۡᩴ;->۫:I

    and-int/2addr v6, v7

    if-gt v0, v3, :cond_5

    if-ge v0, v6, :cond_6

    if-le v6, v3, :cond_9

    goto :goto_5

    :cond_5
    if-lt v0, v6, :cond_9

    if-le v6, v3, :cond_9

    .line 1052
    :cond_6
    :goto_5
    aput v5, v1, v0

    .line 1053
    iget v5, p0, Ll/ᩴۡᩴ;->᩶:I

    if-ne v5, v3, :cond_7

    iput v0, p0, Ll/ᩴۡᩴ;->᩶:I

    .line 1054
    :cond_7
    iget v5, p0, Ll/ᩴۡᩴ;->ۙ:I

    if-ne v5, v3, :cond_8

    iput v0, p0, Ll/ᩴۡᩴ;->ۙ:I

    .line 1055
    :cond_8
    invoke-virtual {v4, v3, v0}, Ll/᩵ۡᩴ;->ۧ(II)V

    move v0, v3

    goto :goto_3

    :cond_9
    add-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v7

    goto :goto_4

    .line 1018
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic ֫(I)V
    .locals 0

    .line 0
    invoke-static {}, Ll/۠ۡᩴ;->ۧ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic ֫(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method

.method public final ۖ֫()I
    .locals 5

    .line 963
    invoke-virtual {p0}, Ll/ᩴۡᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 964
    iget v0, p0, Ll/ᩴۡᩴ;->ۙ:I

    iput v0, p0, Ll/ᩴۡᩴ;->᩸:I

    .line 965
    iget-object v1, p0, Ll/ᩴۡᩴ;->ۗ:Ll/᩵ۡᩴ;

    iget-object v2, v1, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v3, v2, v0

    const/16 v2, 0x20

    ushr-long v2, v3, v2

    long-to-int v3, v2

    iput v3, p0, Ll/ᩴۡᩴ;->ۙ:I

    .line 966
    iput v0, p0, Ll/ᩴۡᩴ;->᩶:I

    .line 967
    iget v2, p0, Ll/ᩴۡᩴ;->᩹:I

    if-ltz v2, :cond_0

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ᩴۡᩴ;->᩹:I

    .line 968
    :cond_0
    iget-object v1, v1, Ll/᩵ۡᩴ;->ۙ:[I

    aget v0, v1, v0

    return v0

    .line 963
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final synthetic ۧ(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method
