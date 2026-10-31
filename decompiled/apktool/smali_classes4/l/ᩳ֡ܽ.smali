.class public final Ll/ᩳ֡ܽ;
.super Ljava/lang/Object;
.source "16VB"


# instance fields
.field public final ֫:[Ljava/lang/Object;

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(II[Ljava/lang/Object;)V
    .locals 6

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p3, p0, Ll/ᩳ֡ܽ;->֫:[Ljava/lang/Object;

    .line 14
    iput p1, p0, Ll/ᩳ֡ܽ;->ܽ:I

    .line 15
    iput p2, p0, Ll/ᩳ֡ܽ;->ۧ:I

    .line 17
    array-length p1, p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_1

    aget-object v3, p3, v2

    .line 18
    instance-of v4, v3, [I

    if-eqz v4, :cond_0

    check-cast v3, [I

    array-length v3, v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    int-to-long v2, v0

    int-to-long v4, p2

    mul-long v2, v2, v4

    const/16 p1, 0x40

    if-gt p2, p1, :cond_2

    const-wide/16 p1, 0x400

    cmp-long p3, v2, p1

    if-gtz p3, :cond_2

    const-wide/16 p1, 0x40

    .line 22
    div-long/2addr v2, p1

    const-wide/16 p1, 0x1

    add-long/2addr v2, p1

    long-to-int v1, v2

    :cond_2
    iput v1, p0, Ll/ᩳ֡ܽ;->ᩳ:I

    return-void
.end method

.method public static ֫(Ll/۬ۚܽ;)Ll/ᩳ֡ܽ;
    .locals 9

    if-eqz p0, :cond_d

    .line 27
    iget v0, p0, Ll/۬ۚܽ;->ۧ:I

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/۬ۚܽ;

    if-ne v1, v2, :cond_d

    iget v1, p0, Ll/۬ۚܽ;->᩻:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_d

    iget v1, p0, Ll/۬ۚܽ;->ܿ:I

    if-ltz v1, :cond_d

    iget v2, p0, Ll/۬ۚܽ;->ᩳ:I

    if-lt v2, v1, :cond_d

    iget-object v1, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v1, :cond_d

    if-ltz v0, :cond_d

    iget v1, p0, Ll/۬ۚܽ;->ܳ:I

    if-ltz v1, :cond_d

    if-ne v0, v1, :cond_0

    goto/16 :goto_3

    .line 32
    :cond_0
    iget-object v1, p0, Ll/۬ۚܽ;->ܽ:Ll/ۛۚܽ;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/ۚۚܽ;

    if-eq v1, v2, :cond_1

    goto/16 :goto_3

    .line 33
    :cond_1
    iget-object v1, p0, Ll/۬ۚܽ;->ܽ:Ll/ۛۚܽ;

    check-cast v1, Ll/ۚۚܽ;

    .line 34
    iget-boolean v2, v1, Ll/ۚۚܽ;->ܽ:Z

    iget v3, v1, Ll/ۚۚܽ;->ۧ:I

    if-eqz v2, :cond_d

    if-ne v3, v0, :cond_d

    iget-object v0, v1, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v0, :cond_d

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Ll/ۨ֡ܽ;

    if-eq v0, v2, :cond_2

    goto/16 :goto_3

    .line 38
    :cond_2
    iget-object v0, v1, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    check-cast v0, Ll/ۨ֡ܽ;

    .line 39
    iget-object v2, v0, Ll/ۨ֡ܽ;->ᩳ:Ll/ۛۚܽ;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v4, Ll/᩺֡ܽ;

    if-ne v2, v4, :cond_d

    iget-object v2, v0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    if-eqz v2, :cond_d

    iget v4, v0, Ll/ۨ֡ܽ;->ܿ:I

    const/4 v5, 0x2

    if-lt v4, v5, :cond_d

    array-length v2, v2

    if-le v4, v2, :cond_3

    goto/16 :goto_3

    .line 43
    :cond_3
    iget-object v2, v0, Ll/ۨ֡ܽ;->ᩳ:Ll/ۛۚܽ;

    .line 44
    iget-object v4, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Ll/֨ۚܽ;

    if-eq v4, v5, :cond_4

    goto/16 :goto_3

    .line 45
    :cond_4
    iget-object v4, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    check-cast v4, Ll/֨ۚܽ;

    .line 47
    iget-object v1, v1, Ll/ۚۚܽ;->ᩳ:Ll/֨ۚܽ;

    if-ne v1, v4, :cond_d

    iget-boolean v1, v4, Ll/֨ۚܽ;->ᩳ:Z

    if-eqz v1, :cond_d

    iget v1, v4, Ll/֨ۚܽ;->ۧ:I

    if-nez v1, :cond_d

    iget v1, v4, Ll/֨ۚܽ;->ܽ:I

    if-ne v1, v3, :cond_d

    iget-object v1, v4, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eq v1, p0, :cond_5

    goto :goto_3

    .line 51
    :cond_5
    iget v1, v0, Ll/ۨ֡ܽ;->ܿ:I

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 52
    :goto_0
    iget v4, v0, Ll/ۨ֡ܽ;->ܿ:I

    if-ge v3, v4, :cond_c

    .line 53
    iget-object v4, v0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    aget-object v4, v4, v3

    if-eqz v4, :cond_d

    .line 55
    iget-object v5, v4, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eq v5, v2, :cond_6

    goto :goto_3

    .line 56
    :cond_6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-class v6, Ll/᩶֡ܽ;

    if-ne v5, v6, :cond_8

    .line 57
    check-cast v4, Ll/᩻ۚܽ;

    iget-object v4, v4, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    if-nez v4, :cond_7

    goto :goto_3

    .line 59
    :cond_7
    aput-object v4, v1, v3

    goto :goto_2

    .line 60
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-class v6, Ll/ۢ֨ܽ;

    if-ne v5, v6, :cond_d

    .line 61
    check-cast v4, Ll/ۢ֨ܽ;

    iget-object v4, v4, Ll/ۖ֨ܽ;->ۧ:[I

    if-eqz v4, :cond_d

    .line 62
    array-length v5, v4

    if-nez v5, :cond_9

    goto :goto_3

    .line 63
    :cond_9
    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_b

    aget v7, v4, v6

    if-ltz v7, :cond_d

    const v8, 0xffff

    if-le v7, v8, :cond_a

    goto :goto_3

    :cond_a
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 66
    :cond_b
    invoke-virtual {v4}, [I->clone()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 71
    :cond_c
    new-instance v0, Ll/ᩳ֡ܽ;

    iget v2, p0, Ll/۬ۚܽ;->ܿ:I

    iget p0, p0, Ll/۬ۚܽ;->ᩳ:I

    invoke-direct {v0, v2, p0, v1}, Ll/ᩳ֡ܽ;-><init>(II[Ljava/lang/Object;)V

    return-object v0

    :cond_d
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method
