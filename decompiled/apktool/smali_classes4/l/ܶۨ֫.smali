.class public final Ll/ܶۨ֫;
.super Ljava/lang/Object;
.source "A7N6"


# instance fields
.field public final ֡:Ll/᩷᩺֫;

.field public ֨:Ll/ۢܿۧ;

.field public final ֫:Ll/᩸۠֫;

.field public final ۖ:[Ll/۠ᩴ֫;

.field public final ۘ:Ll/ܿܰ֫;

.field public final ۚ:Ll/۬᩵֫;

.field public ۜ:J

.field public ۡ:Landroid/net/Uri;

.field public final ۢ:Ljava/util/List;

.field public final ۧ:Ll/᩹ۨ֫;

.field public final ܳ:Ll/ᩴۨ֫;

.field public final ܺ:Ll/ܰ۬֫;

.field public ܽ:Ll/ۡ֫ۧ;

.field public ܿ:Z

.field public ᩳ:Z

.field public final ᩴ:[Landroid/net/Uri;

.field public ᩵:[B

.field public final ᩷:Ll/᩸۠֫;

.field public ᩻:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ll/᩹ۨ֫;Ll/ܿܰ֫;[Landroid/net/Uri;[Ll/۠ᩴ֫;Ll/᩸ۨ֫;Ll/֡ܶ֫;Ll/᩷᩺֫;Ljava/util/List;Ll/ܰ۬֫;)V
    .locals 0

    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    iput-object p1, p0, Ll/ܶۨ֫;->ۧ:Ll/᩹ۨ֫;

    .line 197
    iput-object p2, p0, Ll/ܶۨ֫;->ۘ:Ll/ܿܰ֫;

    .line 198
    iput-object p3, p0, Ll/ܶۨ֫;->ᩴ:[Landroid/net/Uri;

    .line 199
    iput-object p4, p0, Ll/ܶۨ֫;->ۖ:[Ll/۠ᩴ֫;

    .line 200
    iput-object p7, p0, Ll/ܶۨ֫;->֡:Ll/᩷᩺֫;

    .line 202
    iput-object p8, p0, Ll/ܶۨ֫;->ۢ:Ljava/util/List;

    .line 203
    iput-object p9, p0, Ll/ܶۨ֫;->ܺ:Ll/ܰ۬֫;

    .line 206
    new-instance p1, Ll/ᩴۨ֫;

    invoke-direct {p1}, Ll/ᩴۨ֫;-><init>()V

    iput-object p1, p0, Ll/ܶۨ֫;->ܳ:Ll/ᩴۨ֫;

    .line 207
    sget-object p1, Ll/ۘ֨֫;->ܿ:[B

    iput-object p1, p0, Ll/ܶۨ֫;->᩵:[B

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 208
    iput-wide p1, p0, Ll/ܶۨ֫;->ۜ:J

    const/4 p1, 0x1

    .line 209
    invoke-interface {p5, p1}, Ll/᩸ۨ֫;->֫(I)Ll/᩸۠֫;

    move-result-object p1

    iput-object p1, p0, Ll/ܶۨ֫;->᩷:Ll/᩸۠֫;

    if-eqz p6, :cond_0

    .line 211
    invoke-interface {p1, p6}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    :cond_0
    const/4 p1, 0x3

    .line 213
    invoke-interface {p5, p1}, Ll/᩸ۨ֫;->֫(I)Ll/᩸۠֫;

    move-result-object p1

    iput-object p1, p0, Ll/ܶۨ֫;->֫:Ll/᩸۠֫;

    .line 214
    new-instance p1, Ll/۬᩵֫;

    const-string p2, ""

    .line 76
    invoke-direct {p1, p2, p4}, Ll/۬᩵֫;-><init>(Ljava/lang/String;[Ll/۠ᩴ֫;)V

    .line 214
    iput-object p1, p0, Ll/ܶۨ֫;->ۚ:Ll/۬᩵֫;

    .line 216
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 p2, 0x0

    .line 217
    :goto_0
    array-length p5, p3

    if-ge p2, p5, :cond_2

    .line 218
    aget-object p5, p4, p2

    iget p5, p5, Ll/۠ᩴ֫;->۟:I

    and-int/lit16 p5, p5, 0x4000

    if-nez p5, :cond_1

    .line 219
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 222
    :cond_2
    new-instance p2, Ll/֨ۨ֫;

    iget-object p3, p0, Ll/ܶۨ֫;->ۚ:Ll/۬᩵֫;

    .line 223
    invoke-static {p1}, Ll/۬᩺ܺ;->֫(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-direct {p2, p3, p1}, Ll/֨ۨ֫;-><init>(Ll/۬᩵֫;[I)V

    iput-object p2, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    return-void
.end method

.method private ֫(Ll/᩶ۨ֫;ZLl/ۙ᩺֫;JJ)Landroid/util/Pair;
    .locals 8

    const-wide/16 v0, 0x1

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eqz p1, :cond_5

    .line 889
    iget-wide v4, p1, Ll/ۧᩳۧ;->ۢ:J

    iget v6, p1, Ll/᩶ۨ֫;->ۛ:I

    if-eqz p2, :cond_0

    goto :goto_2

    .line 930
    :cond_0
    invoke-virtual {p1}, Ll/᩶ۨ֫;->᩷()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 931
    new-instance p1, Landroid/util/Pair;

    if-ne v6, v3, :cond_2

    const-wide/16 p2, -0x1

    cmp-long p4, v4, p2

    if-eqz p4, :cond_1

    add-long/2addr v4, v0

    goto :goto_0

    :cond_1
    move-wide v4, p2

    .line 932
    :cond_2
    :goto_0
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    if-ne v6, v3, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v3, v6, 0x1

    .line 935
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    .line 936
    :cond_4
    new-instance p1, Landroid/util/Pair;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    .line 890
    :cond_5
    :goto_2
    iget-wide v0, p3, Ll/ۙ᩺֫;->ܿ:J

    iget-object p2, p3, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    iget-wide v4, p3, Ll/ۙ᩺֫;->ۡ:J

    iget-object v6, p3, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    add-long/2addr v0, p4

    if-eqz p1, :cond_7

    .line 892
    iget-boolean v7, p0, Ll/ܶۨ֫;->ᩳ:Z

    if-eqz v7, :cond_6

    goto :goto_3

    :cond_6
    iget-wide p6, p1, Ll/۟ܽۧ;->ܿ:J

    .line 893
    :cond_7
    :goto_3
    iget-boolean p3, p3, Ll/ۙ᩺֫;->᩻:Z

    if-nez p3, :cond_8

    cmp-long p3, p6, v0

    if-ltz p3, :cond_8

    .line 895
    new-instance p1, Landroid/util/Pair;

    .line 896
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result p2

    int-to-long p2, p2

    add-long/2addr v4, p2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 897
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_8
    sub-long/2addr p6, p4

    .line 903
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    iget-object p4, p0, Ll/ܶۨ֫;->ۘ:Ll/ܿܰ֫;

    .line 905
    invoke-interface {p4}, Ll/ܿܰ֫;->ܽ()Z

    move-result p4

    const/4 p5, 0x0

    if-eqz p4, :cond_a

    if-nez p1, :cond_9

    goto :goto_4

    :cond_9
    const/4 v2, 0x0

    .line 901
    :cond_a
    :goto_4
    invoke-static {v6, p3, v2}, Ll/ۘ֨֫;->֫(Ljava/util/List;Ljava/lang/Long;Z)I

    move-result p1

    int-to-long p3, p1

    add-long/2addr p3, v4

    if-ltz p1, :cond_e

    .line 910
    invoke-interface {v6, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸᩺֫;

    .line 912
    iget-wide v0, p1, Ll/᩹᩺֫;->ۨ:J

    iget-wide v2, p1, Ll/᩹᩺֫;->ۙ:J

    add-long/2addr v0, v2

    cmp-long v2, p6, v0

    if-gez v2, :cond_b

    .line 913
    iget-object p1, p1, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    goto :goto_5

    :cond_b
    move-object p1, p2

    .line 915
    :goto_5
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p5, v0, :cond_e

    .line 916
    invoke-interface {p1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠᩺֫;

    .line 917
    iget-wide v1, v0, Ll/᩹᩺֫;->ۨ:J

    iget-wide v3, v0, Ll/᩹᩺֫;->ۙ:J

    add-long/2addr v1, v3

    cmp-long v3, p6, v1

    if-gez v3, :cond_d

    .line 918
    iget-boolean p6, v0, Ll/۠᩺֫;->ܰ:Z

    if-eqz p6, :cond_e

    if-ne p1, p2, :cond_c

    const-wide/16 p1, 0x1

    goto :goto_6

    :cond_c
    const-wide/16 p1, 0x0

    :goto_6
    add-long/2addr p3, p1

    goto :goto_7

    :cond_d
    add-int/lit8 p5, p5, 0x1

    goto :goto_5

    :cond_e
    const/4 p5, -0x1

    .line 927
    :goto_7
    new-instance p1, Landroid/util/Pair;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private ֫(Landroid/net/Uri;IZ)Ll/۟ܽۧ;
    .locals 7

    const/4 p3, 0x0

    if-nez p1, :cond_0

    return-object p3

    .line 1001
    :cond_0
    iget-object v0, p0, Ll/ܶۨ֫;->ܳ:Ll/ᩴۨ֫;

    invoke-virtual {v0, p1}, Ll/ᩴۨ֫;->ۧ(Landroid/net/Uri;)[B

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1006
    invoke-virtual {v0, p1, v1}, Ll/ᩴۨ֫;->֫(Landroid/net/Uri;[B)V

    return-object p3

    .line 1010
    :cond_1
    new-instance p3, Ll/ۙ۠֫;

    invoke-direct {p3}, Ll/ۙ۠֫;-><init>()V

    .line 1011
    invoke-virtual {p3, p1}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Ll/ۙ۠֫;->֫(I)V

    invoke-virtual {p3}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v2

    .line 1020
    new-instance p1, Ll/᩵ۨ֫;

    iget-object p3, p0, Ll/ܶۨ֫;->ۖ:[Ll/۠ᩴ֫;

    aget-object v3, p3, p2

    iget-object p2, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    .line 1024
    invoke-interface {p2}, Ll/ۢܿۧ;->᩷()I

    move-result v4

    iget-object p2, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    .line 1025
    invoke-interface {p2}, Ll/ۢܿۧ;->ۧ()Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, Ll/ܶۨ֫;->᩵:[B

    .line 1128
    iget-object v1, p0, Ll/ܶۨ֫;->֫:Ll/᩸۠֫;

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Ll/֫ᩳۧ;-><init>(Ll/᩸۠֫;Ll/ۗ۠֫;Ll/۠ᩴ֫;ILjava/lang/Object;[B)V

    return-object p1
.end method

.method public static ֫(Ll/ۙ᩺֫;JI)Ll/۠ۨ֫;
    .locals 7

    .line 653
    iget-wide v0, p0, Ll/ۙ᩺֫;->ۡ:J

    iget-object v2, p0, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    sub-long v0, p1, v0

    long-to-int v1, v0

    .line 654
    iget-object p0, p0, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-ne v1, v0, :cond_1

    if-eq p3, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 656
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p0

    if-ge p3, p0, :cond_5

    .line 657
    new-instance p0, Ll/۠ۨ֫;

    invoke-interface {v2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹᩺֫;

    invoke-direct {p0, v0, p1, p2, p3}, Ll/۠ۨ֫;-><init>(Ll/᩹᩺֫;JI)V

    return-object p0

    .line 661
    :cond_1
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸᩺֫;

    if-ne p3, v4, :cond_2

    .line 663
    new-instance p0, Ll/۠ۨ֫;

    invoke-direct {p0, v0, p1, p2, v4}, Ll/۠ۨ֫;-><init>(Ll/᩹᩺֫;JI)V

    return-object p0

    .line 666
    :cond_2
    iget-object v5, v0, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge p3, v5, :cond_3

    .line 668
    new-instance p0, Ll/۠ۨ֫;

    iget-object v0, v0, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    .line 669
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹᩺֫;

    invoke-direct {p0, v0, p1, p2, p3}, Ll/۠ۨ֫;-><init>(Ll/᩹᩺֫;JI)V

    return-object p0

    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 670
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p3

    const-wide/16 v5, 0x1

    if-ge v1, p3, :cond_4

    .line 672
    new-instance p3, Ll/۠ۨ֫;

    .line 673
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩹᩺֫;

    add-long/2addr p1, v5

    invoke-direct {p3, p0, p1, p2, v4}, Ll/۠ۨ֫;-><init>(Ll/᩹᩺֫;JI)V

    return-object p3

    .line 676
    :cond_4
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_5

    .line 678
    new-instance p0, Ll/۠ۨ֫;

    .line 679
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩹᩺֫;

    add-long/2addr p1, v5

    invoke-direct {p0, p3, p1, p2, v3}, Ll/۠ۨ֫;-><init>(Ll/᩹᩺֫;JI)V

    return-object p0

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ֫(JLjava/util/List;)I
    .locals 2

    .line 796
    iget-object v0, p0, Ll/ܶۨ֫;->ܽ:Ll/ۡ֫ۧ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ᩴܿۧ;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 799
    :cond_0
    iget-object v0, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢܿۧ;->֫(JLjava/util/List;)I

    move-result p1

    return p1

    .line 797
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/᩶ۨ֫;)I
    .locals 8

    .line 344
    iget v0, p1, Ll/᩶ۨ֫;->ۛ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 348
    :cond_0
    iget-object v1, p0, Ll/ܶۨ֫;->ۚ:Ll/۬᩵֫;

    iget-object v2, p1, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    invoke-virtual {v1, v2}, Ll/۬᩵֫;->֫(Ll/۠ᩴ֫;)I

    move-result v1

    iget-object v2, p0, Ll/ܶۨ֫;->ᩴ:[Landroid/net/Uri;

    aget-object v1, v2, v1

    .line 349
    iget-object v2, p0, Ll/ܶۨ֫;->ۘ:Ll/ܿܰ֫;

    const/4 v3, 0x0

    .line 350
    invoke-interface {v2, v1, v3}, Ll/ܿܰ֫;->֫(Landroid/net/Uri;Z)Ll/ۙ᩺֫;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    .line 351
    iget-wide v4, p1, Ll/ۧᩳۧ;->ۢ:J

    iget-wide v6, v1, Ll/ۙ᩺֫;->ۡ:J

    sub-long/2addr v4, v6

    long-to-int v5, v4

    if-gez v5, :cond_1

    goto :goto_1

    .line 357
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v5, v4, :cond_2

    .line 358
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸᩺֫;

    iget-object v2, v2, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    goto :goto_0

    .line 359
    :cond_2
    iget-object v2, v1, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    .line 360
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-lt v0, v4, :cond_3

    goto :goto_2

    .line 370
    :cond_3
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠᩺֫;

    .line 371
    iget-boolean v2, v0, Ll/۠᩺֫;->۟:Z

    if-eqz v2, :cond_4

    return v3

    .line 375
    :cond_4
    iget-object v1, v1, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    iget-object v0, v0, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ۡ֨֫;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 376
    iget-object p1, p1, Ll/۟ܽۧ;->ۧ:Ll/ۗ۠֫;

    iget-object p1, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_2
    const/4 p1, 0x2

    return p1
.end method

.method public final ֫(JLl/ۢ۬֫;)J
    .locals 15

    move-object v0, p0

    .line 291
    iget-object v1, v0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    invoke-interface {v1}, Ll/ۢܿۧ;->֫()I

    move-result v1

    .line 294
    iget-object v2, v0, Ll/ܶۨ֫;->ᩴ:[Landroid/net/Uri;

    array-length v3, v2

    iget-object v4, v0, Ll/ܶۨ֫;->ۘ:Ll/ܿܰ֫;

    const/4 v5, 0x1

    if-ge v1, v3, :cond_0

    const/4 v3, -0x1

    if-eq v1, v3, :cond_0

    .line 295
    iget-object v1, v0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    .line 296
    invoke-interface {v1}, Ll/ۢܿۧ;->᩻()I

    move-result v1

    aget-object v1, v2, v1

    .line 295
    invoke-interface {v4, v1, v5}, Ll/ܿܰ֫;->֫(Landroid/net/Uri;Z)Ll/ۙ᩺֫;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    .line 300
    iget-object v2, v1, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    .line 317
    :cond_1
    iget-wide v6, v1, Ll/ۙ᩺֫;->۠:J

    .line 318
    invoke-interface {v4}, Ll/ܿܰ֫;->֫()J

    move-result-wide v3

    sub-long/2addr v6, v3

    sub-long v9, p1, v6

    .line 323
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 321
    invoke-static {v2, v3, v5}, Ll/ۘ֨֫;->֫(Ljava/util/List;Ljava/lang/Long;Z)I

    move-result v3

    .line 326
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩸᩺֫;

    iget-wide v11, v4, Ll/᩹᩺֫;->ۨ:J

    .line 328
    iget-boolean v1, v1, Ll/ۤ᩺֫;->ۧ:Z

    if-eqz v1, :cond_2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v5

    if-eq v3, v1, :cond_2

    add-int/2addr v3, v5

    .line 329
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸᩺֫;

    iget-wide v1, v1, Ll/᩹᩺֫;->ۨ:J

    move-wide v13, v1

    goto :goto_1

    :cond_2
    move-wide v13, v11

    :goto_1
    move-object/from16 v8, p3

    .line 331
    invoke-virtual/range {v8 .. v14}, Ll/ۢ۬֫;->֫(JJJ)J

    move-result-wide v1

    add-long/2addr v1, v6

    return-wide v1

    :cond_3
    :goto_2
    return-wide p1
.end method

.method public final ֫()Ll/۬᩵֫;
    .locals 1

    .line 243
    iget-object v0, p0, Ll/ܶۨ֫;->ۚ:Ll/۬᩵֫;

    return-object v0
.end method

.method public final ֫(Ll/۟ܽۧ;)V
    .locals 2

    .line 692
    instance-of v0, p1, Ll/᩵ۨ֫;

    if-eqz v0, :cond_0

    .line 693
    check-cast p1, Ll/᩵ۨ֫;

    .line 694
    invoke-virtual {p1}, Ll/֫ᩳۧ;->ܳ()[B

    move-result-object v0

    iput-object v0, p0, Ll/ܶۨ֫;->᩵:[B

    .line 695
    iget-object v0, p1, Ll/۟ܽۧ;->ۧ:Ll/ۗ۠֫;

    iget-object v0, v0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-virtual {p1}, Ll/᩵ۨ֫;->᩻()[B

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    iget-object v1, p0, Ll/ܶۨ֫;->ܳ:Ll/ᩴۨ֫;

    invoke-virtual {v1, v0, p1}, Ll/ᩴۨ֫;->֫(Landroid/net/Uri;[B)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۢܿۧ;)V
    .locals 2

    .line 1039
    iget-object v0, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ۢܿۧ;->᩻()I

    move-result v0

    .line 1040
    iget-object v1, p0, Ll/ܶۨ֫;->ᩴ:[Landroid/net/Uri;

    aget-object v0, v1, v0

    iget-object v1, p0, Ll/ܶۨ֫;->ۘ:Ll/ܿܰ֫;

    invoke-interface {v1, v0}, Ll/ܿܰ֫;->֫(Landroid/net/Uri;)V

    .line 259
    iput-object p1, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    return-void
.end method

.method public final ֫(Ll/ۨۙ֫;JJLjava/util/List;ZLl/֡ۨ֫;)V
    .locals 31

    move-object/from16 v8, p0

    move-wide/from16 v9, p2

    move-object/from16 v11, p8

    .line 431
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static/range {p6 .. p6}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۨ֫;

    :goto_0
    move-object v15, v0

    if-nez v15, :cond_1

    const/4 v0, -0x1

    const/4 v12, -0x1

    goto :goto_1

    .line 432
    :cond_1
    iget-object v0, v8, Ll/ܶۨ֫;->ۚ:Ll/۬᩵֫;

    iget-object v1, v15, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    invoke-virtual {v0, v1}, Ll/۬᩵֫;->֫(Ll/۠ᩴ֫;)I

    move-result v0

    move v12, v0

    :goto_1
    move-object/from16 v0, p1

    .line 433
    iget-wide v0, v0, Ll/ۨۙ֫;->ۧ:J

    sub-long v2, v9, v0

    .line 978
    iget-wide v4, v8, Ll/ܶۨ֫;->ۜ:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v13, v4, v6

    if-eqz v13, :cond_2

    sub-long/2addr v4, v0

    goto :goto_2

    :cond_2
    move-wide v4, v6

    :goto_2
    if-eqz v15, :cond_3

    .line 436
    iget-boolean v13, v8, Ll/ܶۨ֫;->ᩳ:Z

    if-nez v13, :cond_3

    .line 111
    iget-wide v13, v15, Ll/۟ܽۧ;->ܽ:J

    iget-wide v6, v15, Ll/۟ܽۧ;->ܿ:J

    sub-long/2addr v13, v6

    sub-long/2addr v2, v13

    const-wide/16 v6, 0x0

    .line 444
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    const-wide v25, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v16, v4, v25

    if-eqz v16, :cond_4

    sub-long/2addr v4, v13

    .line 446
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    goto :goto_3

    :cond_3
    move-wide/from16 v25, v6

    :cond_4
    :goto_3
    move-wide/from16 v19, v2

    move-wide/from16 v21, v4

    .line 451
    invoke-virtual {v8, v15, v9, v10}, Ll/ܶۨ֫;->֫(Ll/᩶ۨ֫;J)[Ll/ᩳᩳۧ;

    move-result-object v24

    .line 452
    iget-object v2, v8, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    move-object/from16 v16, v2

    move-wide/from16 v17, v0

    move-object/from16 v23, p6

    invoke-interface/range {v16 .. v24}, Ll/ۢܿۧ;->֫(JJJLjava/util/List;[Ll/ᩳᩳۧ;)V

    .line 454
    iget-object v0, v8, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ۢܿۧ;->᩻()I

    move-result v13

    const/4 v0, 0x1

    if-eq v12, v13, :cond_5

    const/4 v1, 0x1

    const/4 v14, 0x1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    const/4 v14, 0x0

    .line 456
    :goto_4
    iget-object v6, v8, Ll/ܶۨ֫;->ᩴ:[Landroid/net/Uri;

    aget-object v7, v6, v13

    .line 457
    iget-object v4, v8, Ll/ܶۨ֫;->ۘ:Ll/ܿܰ֫;

    invoke-interface {v4, v7}, Ll/ܿܰ֫;->ᩳ(Landroid/net/Uri;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 458
    iput-object v7, v11, Ll/֡ۨ֫;->ܽ:Landroid/net/Uri;

    .line 459
    iput-object v7, v8, Ll/ܶۨ֫;->ۡ:Landroid/net/Uri;

    return-void

    .line 465
    :cond_6
    invoke-interface {v4, v7, v0}, Ll/ܿܰ֫;->֫(Landroid/net/Uri;Z)Ll/ۙ᩺֫;

    move-result-object v5

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v0, v5, Ll/ۙ᩺֫;->۠:J

    .line 468
    iget-boolean v2, v5, Ll/ۤ᩺֫;->ۧ:Z

    iput-boolean v2, v8, Ll/ܶۨ֫;->ᩳ:Z

    .line 986
    iget-boolean v2, v5, Ll/ۙ᩺֫;->᩻:Z

    if-eqz v2, :cond_7

    move-wide/from16 v2, v25

    goto :goto_5

    .line 1432
    :cond_7
    iget-wide v2, v5, Ll/ۙ᩺֫;->ܿ:J

    add-long/2addr v2, v0

    .line 988
    invoke-interface {v4}, Ll/ܿܰ֫;->֫()J

    move-result-wide v16

    sub-long v2, v2, v16

    :goto_5
    iput-wide v2, v8, Ll/ܶۨ֫;->ۜ:J

    .line 473
    invoke-interface {v4}, Ll/ܿܰ֫;->֫()J

    move-result-wide v2

    sub-long v16, v0, v2

    move-object/from16 v0, p0

    move-object v1, v15

    move v2, v14

    move-object v3, v5

    move-object v9, v4

    move-object v10, v5

    move-wide/from16 v4, v16

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-wide/from16 v6, p2

    .line 475
    invoke-direct/range {v0 .. v7}, Ll/ܶۨ֫;->֫(Ll/᩶ۨ֫;ZLl/ۙ᩺֫;JJ)Landroid/util/Pair;

    move-result-object v0

    .line 477
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 478
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v14, :cond_8

    goto :goto_7

    :cond_8
    if-nez v15, :cond_9

    goto :goto_7

    .line 955
    :cond_9
    iget-wide v3, v10, Ll/ۙ᩺֫;->ۡ:J

    cmp-long v5, v1, v3

    if-gez v5, :cond_a

    goto :goto_6

    .line 961
    :cond_a
    invoke-static {v10, v1, v2, v0}, Ll/ܶۨ֫;->֫(Ll/ۙ᩺֫;JI)Ll/۠ۨ֫;

    move-result-object v3

    if-nez v3, :cond_b

    goto :goto_7

    .line 966
    :cond_b
    iget-object v3, v3, Ll/۠ۨ֫;->ᩳ:Ll/᩹᩺֫;

    iget-wide v3, v3, Ll/᩹᩺֫;->ۨ:J

    add-long v3, v3, v16

    cmp-long v5, v3, p4

    if-gez v5, :cond_c

    .line 490
    :goto_6
    aget-object v10, v18, v12

    const/4 v0, 0x1

    .line 492
    invoke-interface {v9, v10, v0}, Ll/ܿܰ֫;->֫(Landroid/net/Uri;Z)Ll/ۙ᩺֫;

    move-result-object v13

    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    iget-wide v0, v13, Ll/ۙ᩺֫;->۠:J

    invoke-interface {v9}, Ll/ܿܰ֫;->֫()J

    move-result-wide v2

    sub-long v16, v0, v2

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object v1, v15

    move-object v3, v13

    move-wide/from16 v4, v16

    move-wide/from16 v6, p2

    .line 498
    invoke-direct/range {v0 .. v7}, Ll/ܶۨ֫;->֫(Ll/᩶ۨ֫;ZLl/ۙ᩺֫;JJ)Landroid/util/Pair;

    move-result-object v0

    .line 504
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 505
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object v14, v10

    move-object v10, v13

    move v13, v12

    goto :goto_8

    :cond_c
    :goto_7
    move-object/from16 v14, v19

    .line 510
    :goto_8
    iget-object v3, v10, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    iget-boolean v4, v10, Ll/ۤ᩺֫;->ۧ:Z

    iget-wide v5, v10, Ll/ۙ᩺֫;->ۡ:J

    iget-object v7, v10, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    move-object/from16 v19, v15

    if-eq v13, v12, :cond_d

    const/4 v15, -0x1

    if-eq v12, v15, :cond_d

    .line 511
    aget-object v12, v18, v12

    .line 512
    invoke-interface {v9, v12}, Ll/ܿܰ֫;->֫(Landroid/net/Uri;)V

    :cond_d
    cmp-long v9, v1, v5

    if-gez v9, :cond_e

    .line 516
    new-instance v0, Ll/ۡ֫ۧ;

    .line 26
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 516
    iput-object v0, v8, Ll/ܶۨ֫;->ܽ:Ll/ۡ֫ۧ;

    return-void

    .line 522
    :cond_e
    invoke-static {v10, v1, v2, v0}, Ll/ܶۨ֫;->֫(Ll/ۙ᩺֫;JI)Ll/۠ۨ֫;

    move-result-object v0

    if-nez v0, :cond_12

    .line 524
    iget-boolean v0, v10, Ll/ۙ᩺֫;->᩻:Z

    if-nez v0, :cond_f

    .line 526
    iput-object v14, v11, Ll/֡ۨ֫;->ܽ:Landroid/net/Uri;

    .line 527
    iput-object v14, v8, Ll/ܶۨ֫;->ۡ:Landroid/net/Uri;

    return-void

    :cond_f
    if-nez p7, :cond_11

    .line 529
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_9

    .line 534
    :cond_10
    new-instance v0, Ll/۠ۨ֫;

    .line 536
    invoke-static {v7}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹᩺֫;

    .line 537
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    move-object/from16 v18, v10

    int-to-long v9, v2

    add-long/2addr v5, v9

    const-wide/16 v9, 0x1

    sub-long/2addr v5, v9

    const/4 v2, -0x1

    invoke-direct {v0, v1, v5, v6, v2}, Ll/۠ۨ֫;-><init>(Ll/᩹᩺֫;JI)V

    goto :goto_a

    :cond_11
    :goto_9
    const/4 v0, 0x1

    .line 530
    iput-boolean v0, v11, Ll/֡ۨ֫;->ۧ:Z

    return-void

    :cond_12
    move-object/from16 v18, v10

    :goto_a
    move-object v9, v0

    .line 542
    iget-object v0, v9, Ll/۠ۨ֫;->ᩳ:Ll/᩹᩺֫;

    const/4 v1, 0x0

    iput-object v1, v8, Ll/ܶۨ֫;->ۡ:Landroid/net/Uri;

    .line 579
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 583
    iget-object v2, v0, Ll/᩹᩺֫;->ۤ:Ll/᩸᩺֫;

    if-eqz v2, :cond_14

    .line 1032
    iget-object v2, v2, Ll/᩹᩺֫;->۬:Ljava/lang/String;

    if-nez v2, :cond_13

    goto :goto_b

    .line 1035
    :cond_13
    invoke-static {v3, v2}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    move-object v10, v2

    goto :goto_c

    :cond_14
    :goto_b
    move-object v10, v1

    :goto_c
    const/4 v2, 0x1

    .line 586
    invoke-direct {v8, v10, v13, v2}, Ll/ܶۨ֫;->֫(Landroid/net/Uri;IZ)Ll/۟ܽۧ;

    move-result-object v2

    iput-object v2, v11, Ll/֡ۨ֫;->֫:Ll/۟ܽۧ;

    if-eqz v2, :cond_15

    goto :goto_f

    .line 1032
    :cond_15
    iget-object v2, v0, Ll/᩹᩺֫;->۬:Ljava/lang/String;

    if-nez v2, :cond_16

    goto :goto_d

    .line 1035
    :cond_16
    invoke-static {v3, v2}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    :goto_d
    move-object v12, v1

    const/4 v1, 0x0

    .line 594
    invoke-direct {v8, v12, v13, v1}, Ll/ܶۨ֫;->֫(Landroid/net/Uri;IZ)Ll/۟ܽۧ;

    move-result-object v2

    iput-object v2, v11, Ll/֡ۨ֫;->֫:Ll/۟ܽۧ;

    if-eqz v2, :cond_17

    goto :goto_f

    .line 643
    :cond_17
    instance-of v2, v0, Ll/۠᩺֫;

    if-eqz v2, :cond_1a

    .line 644
    check-cast v0, Ll/۠᩺֫;

    iget-boolean v0, v0, Ll/۠᩺֫;->ܰ:Z

    if-nez v0, :cond_18

    iget v0, v9, Ll/۠ۨ֫;->ܽ:I

    if-nez v0, :cond_19

    if-eqz v4, :cond_19

    :cond_18
    const/4 v1, 0x1

    :cond_19
    move/from16 v29, v1

    goto :goto_e

    :cond_1a
    move/from16 v29, v4

    :goto_e
    move-object/from16 v0, v19

    move-wide/from16 v1, p2

    move-object v3, v14

    move/from16 v4, v29

    move-object v5, v9

    move-wide/from16 v6, v16

    .line 602
    invoke-static/range {v0 .. v7}, Ll/᩶ۨ֫;->֫(Ll/᩶ۨ֫;JLandroid/net/Uri;ZLl/۠ۨ֫;J)Z

    move-result v28

    if-eqz v28, :cond_1b

    .line 609
    iget-boolean v0, v9, Ll/۠ۨ֫;->֫:Z

    if-eqz v0, :cond_1b

    :goto_f
    return-void

    .line 617
    :cond_1b
    iget-object v0, v8, Ll/ܶۨ֫;->ۖ:[Ll/۠ᩴ֫;

    aget-object v0, v0, v13

    move-object v1, v14

    move-object v14, v0

    iget-object v0, v8, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    .line 627
    invoke-interface {v0}, Ll/ۢܿۧ;->᩷()I

    move-result v21

    iget-object v0, v8, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    .line 628
    invoke-interface {v0}, Ll/ۢܿۧ;->ۧ()Ljava/lang/Object;

    move-result-object v22

    iget-boolean v0, v8, Ll/ܶۨ֫;->ܿ:Z

    move/from16 v23, v0

    .line 633
    iget-object v0, v8, Ll/ܶۨ֫;->ܳ:Ll/ᩴۨ֫;

    invoke-virtual {v0, v12}, Ll/ᩴۨ֫;->֫(Landroid/net/Uri;)[B

    move-result-object v26

    .line 634
    invoke-virtual {v0, v10}, Ll/ᩴۨ֫;->֫(Landroid/net/Uri;)[B

    move-result-object v27

    iget-object v0, v8, Ll/ܶۨ֫;->ܺ:Ll/ܰ۬֫;

    move-object/from16 v30, v0

    .line 618
    iget-object v12, v8, Ll/ܶۨ֫;->ۧ:Ll/᩹ۨ֫;

    iget-object v13, v8, Ll/ܶۨ֫;->᩷:Ll/᩸۠֫;

    iget-object v0, v8, Ll/ܶۨ֫;->ۢ:Ljava/util/List;

    move-object/from16 v20, v0

    iget-object v0, v8, Ll/ܶۨ֫;->֡:Ll/᩷᩺֫;

    move-object/from16 v24, v0

    move-object/from16 v0, v19

    move-wide/from16 v15, v16

    move-object/from16 v17, v18

    move-object/from16 v18, v9

    move-object/from16 v19, v1

    move-object/from16 v25, v0

    invoke-static/range {v12 .. v30}, Ll/᩶ۨ֫;->֫(Ll/᩹ۨ֫;Ll/᩸۠֫;Ll/۠ᩴ֫;JLl/ۙ᩺֫;Ll/۠ۨ֫;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLl/᩷᩺֫;Ll/᩶ۨ֫;[B[BZZLl/ܰ۬֫;)Ll/᩶ۨ֫;

    move-result-object v0

    iput-object v0, v11, Ll/֡ۨ֫;->֫:Ll/۟ܽۧ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 280
    iput-boolean p1, p0, Ll/ܶۨ֫;->ܿ:Z

    return-void
.end method

.method public final ֫(JLl/۟ܽۧ;Ljava/util/List;)Z
    .locals 1

    .line 812
    iget-object v0, p0, Ll/ܶۨ֫;->ܽ:Ll/ۡ֫ۧ;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 815
    :cond_0
    iget-object v0, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    invoke-interface {v0, p1, p2, p3, p4}, Ll/ۢܿۧ;->֫(JLl/۟ܽۧ;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Landroid/net/Uri;)Z
    .locals 1

    .line 866
    iget-object v0, p0, Ll/ܶۨ֫;->ᩴ:[Landroid/net/Uri;

    invoke-static {p1, v0}, Ll/ۘ֨֫;->֫(Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Landroid/net/Uri;J)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 723
    :goto_0
    iget-object v2, p0, Ll/ܶۨ֫;->ᩴ:[Landroid/net/Uri;

    array-length v3, v2

    const/4 v4, -0x1

    if-ge v1, v3, :cond_1

    .line 724
    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    if-ne v1, v4, :cond_2

    goto :goto_2

    .line 732
    :cond_2
    iget-object v2, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    invoke-interface {v2, v1}, Ll/ᩴܿۧ;->indexOf(I)I

    move-result v1

    if-ne v1, v4, :cond_3

    goto :goto_2

    .line 736
    :cond_3
    iput-object p1, p0, Ll/ܶۨ֫;->᩻:Landroid/net/Uri;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p2, v2

    if-eqz v4, :cond_4

    .line 737
    iget-object v2, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    .line 738
    invoke-interface {v2, v1, p2, p3}, Ll/ۢܿۧ;->ۧ(IJ)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/ܶۨ֫;->ۘ:Ll/ܿܰ֫;

    .line 739
    invoke-interface {v1, p1, p2, p3}, Ll/ܿܰ֫;->֫(Landroid/net/Uri;J)Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_4
    return v0
.end method

.method public final ֫(Ll/۟ܽۧ;J)Z
    .locals 2

    .line 709
    iget-object v0, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    iget-object v1, p0, Ll/ܶۨ֫;->ۚ:Ll/۬᩵֫;

    iget-object p1, p1, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    .line 710
    invoke-virtual {v1, p1}, Ll/۬᩵֫;->֫(Ll/۠ᩴ֫;)I

    move-result p1

    invoke-interface {v0, p1}, Ll/ᩴܿۧ;->indexOf(I)I

    move-result p1

    .line 709
    invoke-interface {v0, p1, p2, p3}, Ll/ۢܿۧ;->ۧ(IJ)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/᩶ۨ֫;J)[Ll/ᩳᩳۧ;
    .locals 20

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    const/4 v10, -0x1

    if-nez v9, :cond_0

    const/4 v0, -0x1

    const/4 v11, -0x1

    goto :goto_0

    .line 751
    :cond_0
    iget-object v0, v8, Ll/ܶۨ֫;->ۚ:Ll/۬᩵֫;

    iget-object v1, v9, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    invoke-virtual {v0, v1}, Ll/۬᩵֫;->֫(Ll/۠ᩴ֫;)I

    move-result v0

    move v11, v0

    .line 752
    :goto_0
    iget-object v0, v8, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ᩴܿۧ;->length()I

    move-result v12

    new-array v13, v12, [Ll/ᩳᩳۧ;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v12, :cond_b

    .line 754
    iget-object v1, v8, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    invoke-interface {v1, v14}, Ll/ᩴܿۧ;->ۧ(I)I

    move-result v1

    .line 755
    iget-object v2, v8, Ll/ܶۨ֫;->ᩴ:[Landroid/net/Uri;

    aget-object v2, v2, v1

    .line 756
    iget-object v3, v8, Ll/ܶۨ֫;->ۘ:Ll/ܿܰ֫;

    invoke-interface {v3, v2}, Ll/ܿܰ֫;->ᩳ(Landroid/net/Uri;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 757
    sget-object v0, Ll/ᩳᩳۧ;->֫:Ll/ᩳᩳۧ;

    aput-object v0, v13, v14

    goto/16 :goto_6

    .line 762
    :cond_1
    invoke-interface {v3, v2, v0}, Ll/ܿܰ֫;->֫(Landroid/net/Uri;Z)Ll/ۙ᩺֫;

    move-result-object v15

    .line 155
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    iget-wide v4, v15, Ll/ۙ᩺֫;->۠:J

    .line 766
    invoke-interface {v3}, Ll/ܿܰ֫;->֫()J

    move-result-wide v2

    sub-long v6, v4, v2

    if-eq v1, v11, :cond_2

    const/4 v0, 0x1

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v3, v15

    move-wide v4, v6

    move-wide/from16 v16, v6

    move-wide/from16 v6, p2

    .line 769
    invoke-direct/range {v0 .. v7}, Ll/ܶۨ֫;->֫(Ll/᩶ۨ֫;ZLl/ۙ᩺֫;JJ)Landroid/util/Pair;

    move-result-object v0

    .line 771
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 772
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 773
    new-instance v3, Ll/ۚۨ֫;

    .line 828
    iget-wide v4, v15, Ll/ۙ᩺֫;->ۡ:J

    iget-object v6, v15, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    iget-object v7, v15, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    sub-long/2addr v1, v4

    long-to-int v2, v1

    if-ltz v2, :cond_a

    .line 829
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    if-ge v1, v2, :cond_3

    goto :goto_4

    .line 833
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 834
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_7

    if-eq v0, v10, :cond_6

    .line 837
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩸᩺֫;

    if-nez v0, :cond_4

    .line 840
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 841
    :cond_4
    iget-object v5, v4, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v0, v5, :cond_5

    .line 843
    iget-object v4, v4, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v4, v0, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_5
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 850
    :cond_6
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v7, v2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 849
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v0, 0x0

    .line 853
    :cond_7
    iget-wide v4, v15, Ll/ۙ᩺֫;->ܺ:J

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v4, v18

    if-eqz v2, :cond_9

    if-ne v0, v10, :cond_8

    const/4 v0, 0x0

    .line 856
    :cond_8
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_9

    .line 858
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v6, v0, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 857
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 861
    :cond_9
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_5

    .line 831
    :cond_a
    :goto_4
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    :goto_5
    move-wide/from16 v4, v16

    .line 777
    invoke-direct {v3, v4, v5, v0}, Ll/ۚۨ֫;-><init>(JLjava/util/List;)V

    aput-object v3, v13, v14

    :goto_6
    add-int/lit8 v14, v14, 0x1

    const/4 v0, 0x0

    goto/16 :goto_1

    :cond_b
    return-object v13
.end method

.method public final ۧ(Ll/᩶ۨ֫;)J
    .locals 7

    .line 388
    iget v0, p1, Ll/᩶ۨ֫;->ۛ:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 389
    iget-object v1, p0, Ll/ܶۨ֫;->ۚ:Ll/۬᩵֫;

    iget-object v3, p1, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    invoke-virtual {v1, v3}, Ll/۬᩵֫;->֫(Ll/۠ᩴ֫;)I

    move-result v1

    iget-object v3, p0, Ll/ܶۨ֫;->ᩴ:[Landroid/net/Uri;

    aget-object v1, v3, v1

    .line 390
    iget-object v3, p0, Ll/ܶۨ֫;->ۘ:Ll/ܿܰ֫;

    .line 391
    invoke-interface {v3, v1, v2}, Ll/ܿܰ֫;->֫(Landroid/net/Uri;Z)Ll/ۙ᩺֫;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    .line 392
    iget-wide v3, p1, Ll/ۧᩳۧ;->ۢ:J

    iget-wide v5, v1, Ll/ۙ᩺֫;->ۡ:J

    sub-long/2addr v3, v5

    long-to-int p1, v3

    if-gez p1, :cond_1

    const-wide/16 v0, 0x0

    return-wide v0

    .line 398
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge p1, v3, :cond_2

    .line 399
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸᩺֫;

    iget-object p1, p1, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    goto :goto_1

    .line 400
    :cond_2
    iget-object p1, v1, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    .line 401
    :goto_1
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠᩺֫;

    .line 402
    iget-wide v0, p1, Ll/᩹᩺֫;->ۙ:J

    return-wide v0
.end method

.method public final ۧ()Ll/ۢܿۧ;
    .locals 1

    .line 264
    iget-object v0, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 248
    iget-boolean v0, p0, Ll/ܶۨ֫;->ᩳ:Z

    return v0
.end method

.method public final ܿ()V
    .locals 2

    .line 1039
    iget-object v0, p0, Ll/ܶۨ֫;->֨:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ۢܿۧ;->᩻()I

    move-result v0

    .line 1040
    iget-object v1, p0, Ll/ܶۨ֫;->ᩴ:[Landroid/net/Uri;

    aget-object v0, v1, v0

    iget-object v1, p0, Ll/ܶۨ֫;->ۘ:Ll/ܿܰ֫;

    invoke-interface {v1, v0}, Ll/ܿܰ֫;->֫(Landroid/net/Uri;)V

    const/4 v0, 0x0

    .line 270
    iput-object v0, p0, Ll/ܶۨ֫;->ܽ:Ll/ۡ֫ۧ;

    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 233
    iget-object v0, p0, Ll/ܶۨ֫;->ܽ:Ll/ۡ֫ۧ;

    if-nez v0, :cond_1

    .line 236
    iget-object v0, p0, Ll/ܶۨ֫;->᩻:Landroid/net/Uri;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/ܶۨ֫;->ۡ:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 237
    iget-object v0, p0, Ll/ܶۨ֫;->ۘ:Ll/ܿܰ֫;

    iget-object v1, p0, Ll/ܶۨ֫;->᩻:Landroid/net/Uri;

    invoke-interface {v0, v1}, Ll/ܿܰ֫;->ۧ(Landroid/net/Uri;)V

    :cond_0
    return-void

    .line 234
    :cond_1
    throw v0
.end method
