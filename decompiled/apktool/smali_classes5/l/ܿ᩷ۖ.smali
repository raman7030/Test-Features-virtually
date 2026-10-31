.class public final Ll/ܿ᩷ۖ;
.super Ll/ۧ᩷ۖ;
.source "39NU"


# instance fields
.field public final ۜ:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    .line 2674
    invoke-direct {p0, p2}, Ll/ۧ᩷ۖ;-><init>(I)V

    if-eqz p1, :cond_0

    .line 2678
    iput-object p1, p0, Ll/ܿ᩷ۖ;->ۜ:Ljava/io/OutputStream;

    return-void

    .line 2676
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "out"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۢ(I)V
    .locals 2

    .line 3018
    iget v0, p0, Ll/ۧ᩷ۖ;->ܳ:I

    iget v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    .line 3019
    invoke-direct {p0}, Ll/ܿ᩷ۖ;->ᩳ()V

    :cond_0
    return-void
.end method

.method private ᩳ()V
    .locals 4

    .line 3024
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    iget-object v1, p0, Ll/ܿ᩷ۖ;->ۜ:Ljava/io/OutputStream;

    iget-object v2, p0, Ll/ۧ᩷ۖ;->ܿ:[B

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 3025
    iput v3, p0, Ll/ۧ᩷ۖ;->᩻:I

    return-void
.end method


# virtual methods
.method public final ֫(B)V
    .locals 2

    .line 2828
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    iget v1, p0, Ll/ۧ᩷ۖ;->ܳ:I

    if-ne v0, v1, :cond_0

    .line 2829
    invoke-direct {p0}, Ll/ܿ᩷ۖ;->ᩳ()V

    .line 2231
    :cond_0
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    iget-object v1, p0, Ll/ۧ᩷ۖ;->ܿ:[B

    aput-byte p1, v1, v0

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    const/4 v0, 0x4

    .line 2853
    invoke-direct {p0, v0}, Ll/ܿ᩷ۖ;->ۢ(I)V

    .line 2854
    invoke-virtual {p0, p1}, Ll/ۧ᩷ۖ;->ۜ(I)V

    return-void
.end method

.method public final ֫(II)V
    .locals 1

    const/16 v0, 0xe

    .line 2702
    invoke-direct {p0, v0}, Ll/ܿ᩷ۖ;->ۢ(I)V

    const/4 v0, 0x5

    .line 2703
    invoke-virtual {p0, p1, v0}, Ll/ۧ᩷ۖ;->ۜ(II)V

    .line 2704
    invoke-virtual {p0, p2}, Ll/ۧ᩷ۖ;->ۜ(I)V

    return-void
.end method

.method public final ֫(II[B)V
    .locals 0

    .line 2975
    invoke-virtual {p0, p3, p1, p2}, Ll/ܿ᩷ۖ;->֫([BII)V

    return-void
.end method

.method public final ֫(IJ)V
    .locals 1

    const/16 v0, 0x12

    .line 2716
    invoke-direct {p0, v0}, Ll/ܿ᩷ۖ;->ۢ(I)V

    const/4 v0, 0x1

    .line 2717
    invoke-virtual {p0, p1, v0}, Ll/ۧ᩷ۖ;->ۜ(II)V

    .line 2718
    invoke-virtual {p0, p2, p3}, Ll/ۧ᩷ۖ;->ᩳ(J)V

    return-void
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    .line 2730
    invoke-virtual {p0, p1, v0}, Ll/ܿ᩷ۖ;->ܽ(II)V

    .line 2731
    invoke-virtual {p0, p2}, Ll/ܿ᩷ۖ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(ILl/ۛۜۖ;)V
    .locals 1

    const/4 v0, 0x2

    .line 2736
    invoke-virtual {p0, p1, v0}, Ll/ܿ᩷ۖ;->ܽ(II)V

    .line 2737
    invoke-virtual {p0, p2}, Ll/ܿ᩷ۖ;->֫(Ll/ۛۜۖ;)V

    return-void
.end method

.method public final ֫(ILl/ۡ֡ۖ;Ll/ۢۚۖ;)V
    .locals 1

    const/4 v0, 0x2

    .line 2792
    invoke-virtual {p0, p1, v0}, Ll/ܿ᩷ۖ;->ܽ(II)V

    .line 2822
    move-object p1, p2

    check-cast p1, Ll/ۘۜۖ;

    invoke-virtual {p1, p3}, Ll/ۘۜۖ;->getSerializedSize(Ll/ۢۚۖ;)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܿ᩷ۖ;->ܽ(I)V

    .line 2823
    iget-object p1, p0, Ll/ܳ᩷ۖ;->֫:Ll/᩻᩷ۖ;

    invoke-interface {p3, p2, p1}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ll/ۜ۠ۖ;)V

    return-void
.end method

.method public final ֫(IZ)V
    .locals 1

    const/16 v0, 0xb

    .line 2723
    invoke-direct {p0, v0}, Ll/ܿ᩷ۖ;->ۢ(I)V

    const/4 v0, 0x0

    .line 2724
    invoke-virtual {p0, p1, v0}, Ll/ۧ᩷ۖ;->ۜ(II)V

    int-to-byte p1, p2

    .line 2231
    iget p2, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v0, p2, 0x1

    iput v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    iget-object v0, p0, Ll/ۧ᩷ۖ;->ܿ:[B

    aput-byte p1, v0, p2

    return-void
.end method

.method public final ֫(I[B)V
    .locals 1

    .line 2768
    invoke-virtual {p0, p1}, Ll/ܿ᩷ۖ;->ܽ(I)V

    const/4 v0, 0x0

    .line 2769
    invoke-virtual {p0, p2, v0, p1}, Ll/ܿ᩷ۖ;->֫([BII)V

    return-void
.end method

.method public final ֫(J)V
    .locals 1

    const/16 v0, 0x8

    .line 2865
    invoke-direct {p0, v0}, Ll/ܿ᩷ۖ;->ۢ(I)V

    .line 2866
    invoke-virtual {p0, p1, p2}, Ll/ۧ᩷ۖ;->ᩳ(J)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 5

    .line 2874
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    .line 2875
    invoke-static {v0}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v1
    :try_end_0
    .catch Ll/ۗ֨ۖ; {:try_start_0 .. :try_end_0} :catch_2

    add-int v2, v1, v0

    .line 2879
    iget v3, p0, Ll/ۧ᩷ۖ;->ܳ:I

    if-le v2, v3, :cond_0

    .line 2884
    :try_start_1
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 2885
    invoke-static {v2, v0, p1, v1}, Ll/۫֨ۖ;->֫(IILjava/lang/String;[B)I

    move-result v0

    .line 2886
    invoke-virtual {p0, v0}, Ll/ܿ᩷ۖ;->ܽ(I)V

    .line 2975
    invoke-virtual {p0, v1, v2, v0}, Ll/ܿ᩷ۖ;->֫([BII)V

    return-void

    .line 2892
    :cond_0
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    sub-int v0, v3, v0

    if-le v2, v0, :cond_1

    .line 2894
    invoke-direct {p0}, Ll/ܿ᩷ۖ;->ᩳ()V

    .line 2899
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v0

    .line 2900
    iget v2, p0, Ll/ۧ᩷ۖ;->᩻:I
    :try_end_1
    .catch Ll/ۗ֨ۖ; {:try_start_1 .. :try_end_1} :catch_2

    .line 2903
    iget-object v4, p0, Ll/ۧ᩷ۖ;->ܿ:[B

    if-ne v0, v1, :cond_2

    add-int v1, v2, v0

    .line 2904
    :try_start_2
    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    sub-int/2addr v3, v1

    .line 2905
    invoke-static {v1, v3, p1, v4}, Ll/۫֨ۖ;->֫(IILjava/lang/String;[B)I

    move-result v1

    .line 2908
    iput v2, p0, Ll/ۧ᩷ۖ;->᩻:I

    sub-int v3, v1, v2

    sub-int/2addr v3, v0

    .line 2910
    invoke-virtual {p0, v3}, Ll/ۧ᩷ۖ;->᩷(I)V

    .line 2911
    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    goto :goto_0

    .line 2913
    :cond_2
    invoke-static {p1}, Ll/۫֨ۖ;->֫(Ljava/lang/String;)I

    move-result v0

    .line 2914
    invoke-virtual {p0, v0}, Ll/ۧ᩷ۖ;->᩷(I)V

    .line 2915
    iget v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    invoke-static {v1, v0, p1, v4}, Ll/۫֨ۖ;->֫(IILjava/lang/String;[B)I

    move-result v0

    iput v0, p0, Ll/ۧ᩷ۖ;->᩻:I
    :try_end_2
    .catch Ll/ۗ֨ۖ; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    .line 2925
    :try_start_3
    new-instance v1, Ll/ᩳ᩷ۖ;

    invoke-direct {v1, v0}, Ll/ᩳ᩷ۖ;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    throw v1

    :catch_1
    move-exception v0

    .line 2922
    iput v2, p0, Ll/ۧ᩷ۖ;->᩻:I

    .line 2923
    throw v0
    :try_end_3
    .catch Ll/ۗ֨ۖ; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    move-exception v0

    .line 2928
    invoke-virtual {p0, p1, v0}, Ll/ܳ᩷ۖ;->֫(Ljava/lang/String;Ll/ۗ֨ۖ;)V

    return-void
.end method

.method public final ֫(Ll/ۛۜۖ;)V
    .locals 1

    .line 2762
    invoke-virtual {p1}, Ll/ۛۜۖ;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܿ᩷ۖ;->ܽ(I)V

    .line 2763
    invoke-virtual {p1, p0}, Ll/ۛۜۖ;->֫(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ֫(Ll/ۡ֡ۖ;)V
    .locals 1

    .line 2816
    invoke-interface {p1}, Ll/ۡ֡ۖ;->getSerializedSize()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܿ᩷ۖ;->ܽ(I)V

    .line 2817
    invoke-interface {p1, p0}, Ll/ۡ֡ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ֫([BII)V
    .locals 4

    .line 2942
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    iget v1, p0, Ll/ۧ᩷ۖ;->ܳ:I

    sub-int v2, v1, v0

    iget-object v3, p0, Ll/ۧ᩷ۖ;->ܿ:[B

    if-lt v2, p3, :cond_0

    .line 2944
    invoke-static {p1, p2, v3, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2945
    iget p1, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ۧ᩷ۖ;->᩻:I

    return-void

    .line 2951
    :cond_0
    invoke-static {p1, p2, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    .line 2954
    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    .line 2956
    invoke-direct {p0}, Ll/ܿ᩷ۖ;->ᩳ()V

    if-gt p3, v1, :cond_1

    const/4 v0, 0x0

    .line 2963
    invoke-static {p1, p2, v3, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2964
    iput p3, p0, Ll/ۧ᩷ۖ;->᩻:I

    goto :goto_0

    .line 2967
    :cond_1
    iget-object v0, p0, Ll/ܿ᩷ۖ;->ۜ:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :goto_0
    return-void
.end method

.method public final ۧ(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 2838
    invoke-virtual {p0, p1}, Ll/ܿ᩷ۖ;->ܽ(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    .line 2841
    invoke-virtual {p0, v0, v1}, Ll/ܿ᩷ۖ;->ۧ(J)V

    return-void
.end method

.method public final ۧ(II)V
    .locals 1

    const/16 v0, 0x14

    .line 2688
    invoke-direct {p0, v0}, Ll/ܿ᩷ۖ;->ۢ(I)V

    const/4 v0, 0x0

    .line 2689
    invoke-virtual {p0, p1, v0}, Ll/ۧ᩷ۖ;->ۜ(II)V

    if-ltz p2, :cond_0

    .line 2249
    invoke-virtual {p0, p2}, Ll/ۧ᩷ۖ;->᩷(I)V

    return-void

    :cond_0
    int-to-long p1, p2

    .line 2252
    invoke-virtual {p0, p1, p2}, Ll/ۧ᩷ۖ;->ܿ(J)V

    return-void
.end method

.method public final ۧ(IJ)V
    .locals 1

    const/16 v0, 0x14

    .line 2709
    invoke-direct {p0, v0}, Ll/ܿ᩷ۖ;->ۢ(I)V

    const/4 v0, 0x0

    .line 2710
    invoke-virtual {p0, p1, v0}, Ll/ۧ᩷ۖ;->ۜ(II)V

    .line 2711
    invoke-virtual {p0, p2, p3}, Ll/ۧ᩷ۖ;->ܿ(J)V

    return-void
.end method

.method public final ۧ(ILl/ۛۜۖ;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    .line 2808
    invoke-virtual {p0, v0, v1}, Ll/ܿ᩷ۖ;->ܽ(II)V

    const/4 v2, 0x2

    .line 2809
    invoke-virtual {p0, v2, p1}, Ll/ܿ᩷ۖ;->ᩳ(II)V

    .line 2810
    invoke-virtual {p0, v1, p2}, Ll/ܿ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    const/4 p1, 0x4

    .line 2811
    invoke-virtual {p0, v0, p1}, Ll/ܿ᩷ۖ;->ܽ(II)V

    return-void
.end method

.method public final ۧ(ILl/ۡ֡ۖ;)V
    .locals 1

    const/4 v0, 0x2

    .line 2785
    invoke-virtual {p0, p1, v0}, Ll/ܿ᩷ۖ;->ܽ(II)V

    .line 2786
    invoke-virtual {p0, p2}, Ll/ܿ᩷ۖ;->֫(Ll/ۡ֡ۖ;)V

    return-void
.end method

.method public final ۧ(J)V
    .locals 1

    const/16 v0, 0xa

    .line 2859
    invoke-direct {p0, v0}, Ll/ܿ᩷ۖ;->ۢ(I)V

    .line 2860
    invoke-virtual {p0, p1, p2}, Ll/ۧ᩷ۖ;->ܿ(J)V

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 2934
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    if-lez v0, :cond_0

    .line 2936
    invoke-direct {p0}, Ll/ܿ᩷ۖ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    const/4 v0, 0x5

    .line 2847
    invoke-direct {p0, v0}, Ll/ܿ᩷ۖ;->ۢ(I)V

    .line 2848
    invoke-virtual {p0, p1}, Ll/ۧ᩷ۖ;->᩷(I)V

    return-void
.end method

.method public final ܽ(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    .line 2683
    invoke-virtual {p0, p1}, Ll/ܿ᩷ۖ;->ܽ(I)V

    return-void
.end method

.method public final ܽ(ILl/ۡ֡ۖ;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    .line 2799
    invoke-virtual {p0, v0, v1}, Ll/ܿ᩷ۖ;->ܽ(II)V

    const/4 v2, 0x2

    .line 2800
    invoke-virtual {p0, v2, p1}, Ll/ܿ᩷ۖ;->ᩳ(II)V

    .line 2801
    invoke-virtual {p0, v1, p2}, Ll/ܿ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    const/4 p1, 0x4

    .line 2802
    invoke-virtual {p0, v0, p1}, Ll/ܿ᩷ۖ;->ܽ(II)V

    return-void
.end method

.method public final ᩳ(II)V
    .locals 1

    const/16 v0, 0x14

    .line 2695
    invoke-direct {p0, v0}, Ll/ܿ᩷ۖ;->ۢ(I)V

    const/4 v0, 0x0

    .line 2696
    invoke-virtual {p0, p1, v0}, Ll/ۧ᩷ۖ;->ۜ(II)V

    .line 2697
    invoke-virtual {p0, p2}, Ll/ۧ᩷ۖ;->᩷(I)V

    return-void
.end method
