.class public final Ll/ܽ᩻ۘ;
.super Ljava/lang/Object;
.source "91MK"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:[I

.field public final ܿ:I

.field public final ᩳ:[I


# direct methods
.method public constructor <init>(II[II[II)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p3, p0, Ll/ܽ᩻ۘ;->ܽ:[I

    .line 38
    iput-object p5, p0, Ll/ܽ᩻ۘ;->ᩳ:[I

    .line 39
    iput p1, p0, Ll/ܽ᩻ۘ;->ܿ:I

    .line 40
    iput p4, p0, Ll/ܽ᩻ۘ;->ܳ:I

    .line 41
    iput p2, p0, Ll/ܽ᩻ۘ;->֫:I

    .line 42
    iput p6, p0, Ll/ܽ᩻ۘ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()[[I
    .locals 13

    .line 57
    new-instance v0, Ll/ۤ᩻ᩴ;

    iget v1, p0, Ll/ܽ᩻ۘ;->֫:I

    iget v2, p0, Ll/ܽ᩻ۘ;->ۧ:I

    add-int v3, v1, v2

    const/4 v4, 0x0

    .line 110
    invoke-direct {v0, v3, v4}, Ll/ۤ᩻ᩴ;-><init>(II)V

    .line 58
    new-array v3, v1, [I

    const/4 v5, 0x0

    :goto_0
    const/4 v6, -0x1

    if-ge v5, v1, :cond_2

    .line 61
    iget v7, p0, Ll/ܽ᩻ۘ;->ܿ:I

    add-int/2addr v7, v5

    .line 62
    iget-object v8, p0, Ll/ܽ᩻ۘ;->ܽ:[I

    aget v9, v8, v7

    invoke-virtual {v0, v9}, Ll/ۤ᩻ᩴ;->get(I)I

    move-result v9

    if-ne v9, v6, :cond_0

    goto :goto_1

    :cond_0
    if-nez v9, :cond_1

    .line 66
    aget v6, v8, v7

    add-int/lit8 v7, v5, 0x1

    invoke-virtual {v0, v6, v7}, Ll/ۤ᩻ᩴ;->֫(II)I

    goto :goto_1

    .line 68
    :cond_1
    aget v7, v8, v7

    invoke-virtual {v0, v7, v6}, Ll/ۤ᩻ᩴ;->֫(II)I

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_2
    if-ge v5, v2, :cond_6

    .line 74
    iget v8, p0, Ll/ܽ᩻ۘ;->ܳ:I

    add-int/2addr v8, v5

    .line 75
    iget-object v9, p0, Ll/ܽ᩻ۘ;->ᩳ:[I

    aget v10, v9, v8

    invoke-virtual {v0, v10}, Ll/ۤ᩻ᩴ;->get(I)I

    move-result v10

    if-eqz v10, :cond_5

    if-ne v10, v6, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v10, v10, -0x1

    .line 78
    aget v11, v3, v10

    if-nez v11, :cond_4

    add-int/lit8 v8, v5, 0x1

    .line 79
    aput v8, v3, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 82
    :cond_4
    aput v4, v3, v10

    .line 83
    aget v8, v9, v8

    invoke-virtual {v0, v8, v6}, Ll/ۤ᩻ᩴ;->֫(II)I

    add-int/lit8 v7, v7, -0x1

    :cond_5
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_6
    if-nez v7, :cond_7

    const/4 v0, 0x0

    return-object v0

    .line 93
    :cond_7
    new-array v0, v7, [I

    .line 94
    new-array v2, v7, [I

    .line 95
    new-array v5, v1, [I

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_4
    if-ge v7, v1, :cond_c

    .line 99
    aget v9, v3, v7

    if-nez v9, :cond_8

    goto :goto_6

    .line 49
    :cond_8
    invoke-static {v0, v4, v8, v9}, Ljava/util/Arrays;->binarySearch([IIII)I

    move-result v9

    neg-int v9, v9

    add-int/lit8 v10, v9, -0x1

    if-eq v10, v8, :cond_9

    .line 102
    aget v11, v3, v7

    aget v12, v0, v10

    if-ge v11, v12, :cond_b

    .line 103
    :cond_9
    aget v11, v3, v7

    aput v11, v0, v10

    .line 104
    aput v7, v2, v10

    if-lez v10, :cond_a

    add-int/lit8 v9, v9, -0x2

    .line 105
    aget v9, v2, v9

    goto :goto_5

    :cond_a
    const/4 v9, -0x1

    :goto_5
    aput v9, v5, v7

    if-ne v10, v8, :cond_b

    add-int/lit8 v8, v8, 0x1

    :cond_b
    :goto_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 112
    :cond_c
    new-array v0, v8, [I

    new-array v1, v8, [I

    const/4 v7, 0x2

    new-array v7, v7, [[I

    aput-object v0, v7, v4

    const/4 v0, 0x1

    aput-object v1, v7, v0

    sub-int/2addr v8, v0

    .line 115
    aget v1, v2, v8

    :goto_7
    if-eq v1, v6, :cond_d

    .line 117
    aget-object v2, v7, v4

    aput v1, v2, v8

    .line 118
    aget-object v2, v7, v0

    aget v9, v3, v1

    sub-int/2addr v9, v0

    aput v9, v2, v8

    add-int/2addr v8, v6

    .line 120
    aget v1, v5, v1

    goto :goto_7

    :cond_d
    return-object v7
.end method
