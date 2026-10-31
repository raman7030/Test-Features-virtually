.class public final Ll/ܳ۫ۧ;
.super Ljava/lang/Object;
.source "8539"


# instance fields
.field public ֫:[I

.field public ۧ:Ljava/util/ArrayList;


# virtual methods
.method public final ֫()V
    .locals 2

    .line 2891
    iget-object v0, p0, Ll/ܳ۫ۧ;->֫:[I

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    .line 2892
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    const/4 v0, 0x0

    .line 2894
    iput-object v0, p0, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public final ֫(I)V
    .locals 4

    .line 2879
    iget-object v0, p0, Ll/ܳ۫ۧ;->֫:[I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    const/16 v0, 0xa

    .line 2880
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    new-array p1, p1, [I

    iput-object p1, p0, Ll/ܳ۫ۧ;->֫:[I

    .line 2881
    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([II)V

    return-void

    .line 2882
    :cond_0
    array-length v2, v0

    if-lt p1, v2, :cond_2

    .line 2871
    array-length v2, v0

    :goto_0
    if-gt v2, p1, :cond_1

    mul-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 2884
    :cond_1
    new-array p1, v2, [I

    iput-object p1, p0, Ll/ܳ۫ۧ;->֫:[I

    .line 2885
    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2886
    iget-object p1, p0, Ll/ܳ۫ۧ;->֫:[I

    array-length v0, v0

    array-length v2, p1

    invoke-static {p1, v0, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    :cond_2
    return-void
.end method

.method public final ֫(II)V
    .locals 3

    .line 2928
    iget-object v0, p0, Ll/ܳ۫ۧ;->֫:[I

    if-eqz v0, :cond_3

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int v0, p1, p2

    .line 2931
    invoke-virtual {p0, v0}, Ll/ܳ۫ۧ;->֫(I)V

    .line 2932
    iget-object v1, p0, Ll/ܳ۫ۧ;->֫:[I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2934
    iget-object v1, p0, Ll/ܳ۫ۧ;->֫:[I

    const/4 v2, -0x1

    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 2940
    iget-object v0, p0, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    goto :goto_1

    .line 2943
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_3

    .line 2944
    iget-object v1, p0, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ۫ۧ;

    .line 2945
    iget v2, v1, Ll/ܿ۫ۧ;->ۙ:I

    if-ge v2, p1, :cond_2

    goto :goto_0

    :cond_2
    add-int/2addr v2, p2

    .line 2948
    iput v2, v1, Ll/ܿ۫ۧ;->ۙ:I

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final ۧ(II)V
    .locals 5

    .line 2898
    iget-object v0, p0, Ll/ܳ۫ۧ;->֫:[I

    if-eqz v0, :cond_4

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int v0, p1, p2

    .line 2901
    invoke-virtual {p0, v0}, Ll/ܳ۫ۧ;->֫(I)V

    .line 2902
    iget-object v1, p0, Ll/ܳ۫ۧ;->֫:[I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, v0, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2904
    iget-object v1, p0, Ll/ܳ۫ۧ;->֫:[I

    array-length v2, v1

    sub-int/2addr v2, p2

    array-length v3, v1

    const/4 v4, -0x1

    invoke-static {v1, v2, v3, v4}, Ljava/util/Arrays;->fill([IIII)V

    .line 2910
    iget-object v1, p0, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    if-nez v1, :cond_1

    goto :goto_1

    .line 2914
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_4

    .line 2915
    iget-object v2, p0, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ۫ۧ;

    .line 2916
    iget v3, v2, Ll/ܿ۫ۧ;->ۙ:I

    if-ge v3, p1, :cond_2

    goto :goto_0

    :cond_2
    if-ge v3, v0, :cond_3

    .line 2920
    iget-object v2, p0, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    sub-int/2addr v3, p2

    .line 2922
    iput v3, v2, Ll/ܿ۫ۧ;->ۙ:I

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method
