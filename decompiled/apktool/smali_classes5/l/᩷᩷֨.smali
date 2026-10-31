.class public final Ll/᩷᩷֨;
.super Ll/ܿ᩷֨;
.source "M1T7"


# instance fields
.field public final ֡:Ll/ܳ᩷֨;

.field public final ۖ:Ll/ۜ᩷֨;

.field public final ۘ:Ll/᩺ۜ֨;

.field public final ᩴ:Ll/ܳ᩷֨;

.field public final ᩵:Ll/ۚ᩷֨;


# direct methods
.method public constructor <init>(Ll/᩺ۜ֨;Ll/ۚ᩷֨;III)V
    .locals 0

    .line 20
    invoke-direct {p0, p5}, Ll/ܿ᩷֨;-><init>(I)V

    .line 16
    new-instance p5, Ll/ܳ᩷֨;

    invoke-direct {p5, p0}, Ll/ܳ᩷֨;-><init>(Ll/᩷᩷֨;)V

    iput-object p5, p0, Ll/᩷᩷֨;->ᩴ:Ll/ܳ᩷֨;

    .line 17
    new-instance p5, Ll/ܳ᩷֨;

    invoke-direct {p5, p0}, Ll/ܳ᩷֨;-><init>(Ll/᩷᩷֨;)V

    iput-object p5, p0, Ll/᩷᩷֨;->֡:Ll/ܳ᩷֨;

    .line 21
    iput-object p1, p0, Ll/᩷᩷֨;->ۘ:Ll/᩺ۜ֨;

    .line 22
    iput-object p2, p0, Ll/᩷᩷֨;->᩵:Ll/ۚ᩷֨;

    .line 23
    new-instance p1, Ll/ۜ᩷֨;

    invoke-direct {p1, p0, p3, p4}, Ll/ۜ᩷֨;-><init>(Ll/᩷᩷֨;II)V

    iput-object p1, p0, Ll/᩷᩷֨;->ۖ:Ll/ۜ᩷֨;

    .line 24
    invoke-virtual {p0}, Ll/᩷᩷֨;->֫()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩷᩷֨;)Ll/᩺ۜ֨;
    .locals 0

    .line 12
    iget-object p0, p0, Ll/᩷᩷֨;->ۘ:Ll/᩺ۜ֨;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/᩷᩷֨;)Ll/ۚ᩷֨;
    .locals 0

    .line 12
    iget-object p0, p0, Ll/᩷᩷֨;->᩵:Ll/ۚ᩷֨;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 29
    invoke-super {p0}, Ll/ܿ᩷֨;->֫()V

    .line 30
    iget-object v0, p0, Ll/᩷᩷֨;->ۖ:Ll/ۜ᩷֨;

    invoke-virtual {v0}, Ll/ۜ᩷֨;->ۧ()V

    .line 31
    iget-object v0, p0, Ll/᩷᩷֨;->ᩴ:Ll/ܳ᩷֨;

    invoke-virtual {v0}, Ll/ۧ᩷֨;->֫()V

    .line 32
    iget-object v0, p0, Ll/᩷᩷֨;->֡:Ll/ܳ᩷֨;

    invoke-virtual {v0}, Ll/ۧ᩷֨;->֫()V

    return-void
.end method

.method public final ۧ()V
    .locals 13

    .line 46
    iget-object v0, p0, Ll/᩷᩷֨;->ۘ:Ll/᩺ۜ֨;

    invoke-virtual {v0}, Ll/᩺ۜ֨;->ᩳ()V

    .line 48
    :goto_0
    invoke-virtual {v0}, Ll/᩺ۜ֨;->ܽ()Z

    move-result v1

    iget-object v2, p0, Ll/᩷᩷֨;->᩵:Ll/ۚ᩷֨;

    if-eqz v1, :cond_b

    .line 49
    invoke-virtual {v0}, Ll/᩺ۜ֨;->֫()I

    move-result v1

    iget v3, p0, Ll/ܿ᩷֨;->ۢ:I

    and-int/2addr v1, v3

    .line 51
    iget-object v3, p0, Ll/ܿ᩷֨;->ᩳ:[[S

    iget-object v4, p0, Ll/ܿ᩷֨;->ܺ:Ll/֡᩷֨;

    invoke-virtual {v4}, Ll/֡᩷֨;->֫()I

    move-result v5

    aget-object v3, v3, v5

    invoke-virtual {v2, v3, v1}, Ll/ۚ᩷֨;->֫([SI)I

    move-result v3

    if-nez v3, :cond_0

    .line 52
    iget-object v1, p0, Ll/᩷᩷֨;->ۖ:Ll/ۜ᩷֨;

    invoke-virtual {v1}, Ll/ۜ᩷֨;->֫()V

    goto :goto_0

    .line 54
    :cond_0
    iget-object v3, p0, Ll/ܿ᩷֨;->ܿ:[S

    invoke-virtual {v4}, Ll/֡᩷֨;->֫()I

    move-result v5

    invoke-virtual {v2, v3, v5}, Ll/ۚ᩷֨;->֫([SI)I

    move-result v3

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x3

    const/4 v8, 0x0

    iget-object v9, p0, Ll/ܿ᩷֨;->ۡ:[I

    if-nez v3, :cond_6

    .line 69
    invoke-virtual {v4}, Ll/֡᩷֨;->ܳ()V

    .line 71
    aget v3, v9, v6

    aput v3, v9, v7

    .line 72
    aget v3, v9, v5

    aput v3, v9, v6

    .line 73
    aget v3, v9, v8

    aput v3, v9, v5

    .line 75
    iget-object v3, p0, Ll/᩷᩷֨;->ᩴ:Ll/ܳ᩷֨;

    invoke-virtual {v3, v1}, Ll/ܳ᩷֨;->֫(I)I

    move-result v3

    const/4 v1, 0x6

    if-ge v3, v1, :cond_1

    add-int/lit8 v7, v3, -0x2

    .line 76
    :cond_1
    iget-object v1, p0, Ll/ܿ᩷֨;->ۧ:[[S

    aget-object v1, v1, v7

    invoke-virtual {v2, v1}, Ll/ۚ᩷֨;->ۧ([S)I

    move-result v1

    const/4 v4, 0x4

    if-ge v1, v4, :cond_2

    .line 79
    aput v1, v9, v8

    goto/16 :goto_6

    :cond_2
    shr-int/lit8 v7, v1, 0x1

    add-int/lit8 v10, v7, -0x1

    and-int/lit8 v11, v1, 0x1

    or-int/2addr v6, v11

    shl-int/2addr v6, v10

    .line 82
    aput v6, v9, v8

    const/16 v10, 0xe

    if-ge v1, v10, :cond_4

    add-int/lit8 v1, v1, -0x4

    .line 85
    iget-object v4, p0, Ll/ܿ᩷֨;->ܽ:[[S

    aget-object v1, v4, v1

    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v10, 0x0

    .line 54
    :goto_1
    invoke-virtual {v2, v1, v4}, Ll/ۚ᩷֨;->֫([SI)I

    move-result v11

    shl-int/2addr v4, v5

    or-int/2addr v4, v11

    add-int/lit8 v12, v10, 0x1

    shl-int v10, v11, v10

    or-int/2addr v7, v10

    .line 57
    array-length v10, v1

    if-lt v4, v10, :cond_3

    or-int v1, v6, v7

    .line 85
    aput v1, v9, v8

    goto/16 :goto_6

    :cond_3
    move v10, v12

    goto :goto_1

    :cond_4
    add-int/lit8 v7, v7, -0x5

    .line 88
    invoke-virtual {v2, v7}, Ll/ۚ᩷֨;->֫(I)I

    move-result v1

    shl-int/2addr v1, v4

    or-int v10, v6, v1

    aput v10, v9, v8

    const/4 v1, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 54
    :goto_2
    iget-object v7, p0, Ll/ܿ᩷֨;->֫:[S

    invoke-virtual {v2, v7, v1}, Ll/ۚ᩷֨;->֫([SI)I

    move-result v11

    shl-int/2addr v1, v5

    or-int/2addr v1, v11

    add-int/lit8 v12, v6, 0x1

    shl-int v6, v11, v6

    or-int/2addr v4, v6

    .line 57
    array-length v6, v7

    if-lt v1, v6, :cond_5

    or-int v1, v10, v4

    .line 90
    aput v1, v9, v8

    goto :goto_6

    :cond_5
    move v6, v12

    goto :goto_2

    .line 98
    :cond_6
    iget-object v3, p0, Ll/ܿ᩷֨;->ܳ:[S

    invoke-virtual {v4}, Ll/֡᩷֨;->֫()I

    move-result v10

    invoke-virtual {v2, v3, v10}, Ll/ۚ᩷֨;->֫([SI)I

    move-result v3

    if-nez v3, :cond_7

    .line 99
    iget-object v3, p0, Ll/ܿ᩷֨;->᩻:[[S

    invoke-virtual {v4}, Ll/֡᩷֨;->֫()I

    move-result v6

    aget-object v3, v3, v6

    invoke-virtual {v2, v3, v1}, Ll/ۚ᩷֨;->֫([SI)I

    move-result v2

    if-nez v2, :cond_a

    .line 100
    invoke-virtual {v4}, Ll/֡᩷֨;->᩻()V

    goto :goto_5

    .line 106
    :cond_7
    iget-object v3, p0, Ll/ܿ᩷֨;->ۜ:[S

    invoke-virtual {v4}, Ll/֡᩷֨;->֫()I

    move-result v10

    invoke-virtual {v2, v3, v10}, Ll/ۚ᩷֨;->֫([SI)I

    move-result v3

    if-nez v3, :cond_8

    .line 107
    aget v2, v9, v5

    goto :goto_4

    .line 109
    :cond_8
    iget-object v3, p0, Ll/ܿ᩷֨;->᩷:[S

    invoke-virtual {v4}, Ll/֡᩷֨;->֫()I

    move-result v10

    invoke-virtual {v2, v3, v10}, Ll/ۚ᩷֨;->֫([SI)I

    move-result v2

    if-nez v2, :cond_9

    .line 110
    aget v2, v9, v6

    goto :goto_3

    .line 112
    :cond_9
    aget v2, v9, v7

    .line 113
    aget v3, v9, v6

    aput v3, v9, v7

    .line 116
    :goto_3
    aget v3, v9, v5

    aput v3, v9, v6

    .line 119
    :goto_4
    aget v3, v9, v8

    aput v3, v9, v5

    .line 120
    aput v2, v9, v8

    .line 123
    :cond_a
    invoke-virtual {v4}, Ll/֡᩷֨;->ܿ()V

    .line 125
    iget-object v2, p0, Ll/᩷᩷֨;->֡:Ll/ܳ᩷֨;

    invoke-virtual {v2, v1}, Ll/ܳ᩷֨;->֫(I)I

    move-result v5

    :goto_5
    move v3, v5

    .line 61
    :goto_6
    aget v1, v9, v8

    invoke-virtual {v0, v1, v3}, Ll/᩺ۜ֨;->֫(II)V

    goto/16 :goto_0

    .line 65
    :cond_b
    invoke-virtual {v2}, Ll/ۚ᩷֨;->֫()V

    return-void
.end method

.method public final ܽ()Z
    .locals 3

    .line 42
    iget-object v0, p0, Ll/ܿ᩷֨;->ۡ:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method
