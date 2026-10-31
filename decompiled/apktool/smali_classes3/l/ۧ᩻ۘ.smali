.class public final Ll/ۧ᩻ۘ;
.super Ljava/lang/Object;
.source "01MV"


# instance fields
.field public final ֫:[I

.field public final ۧ:[[I

.field public final ܽ:[I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [[I

    .line 27
    iput-object v0, p0, Ll/ۧ᩻ۘ;->ۧ:[[I

    const/4 v0, -0x1

    .line 28
    filled-new-array {v0, v0}, [I

    move-result-object v1

    iput-object v1, p0, Ll/ۧ᩻ۘ;->ܽ:[I

    .line 29
    filled-new-array {v0, v0}, [I

    move-result-object v0

    iput-object v0, p0, Ll/ۧ᩻ۘ;->֫:[I

    return-void
.end method

.method public static ֫([IILjava/util/BitSet;I)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 131
    array-length v1, p0

    if-ge v0, v1, :cond_0

    .line 132
    aget p1, p0, p1

    add-int/lit8 p1, p1, 0x1

    aget p0, p0, v0

    invoke-virtual {p2, p1, p0}, Ljava/util/BitSet;->set(II)V

    return v0

    .line 134
    :cond_0
    aget p0, p0, p1

    add-int/lit8 p0, p0, 0x1

    invoke-virtual {p2, p0, p3}, Ljava/util/BitSet;->set(II)V

    return v0
.end method

.method private ֫(I[I[I)[I
    .locals 5

    .line 37
    iget-object v0, p0, Ll/ۧ᩻ۘ;->ܽ:[I

    array-length v1, p3

    aput v1, v0, p1

    .line 54
    array-length v0, p2

    new-array v0, v0, [I

    .line 55
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 56
    invoke-static {v0}, Ljava/util/Arrays;->sort([I)V

    .line 39
    new-instance p2, Ll/ܺۢᩴ;

    array-length v1, p3

    invoke-direct {p2, v1}, Ll/ܺۢᩴ;-><init>(I)V

    .line 40
    new-instance v1, Ll/ܺۢᩴ;

    array-length v3, p3

    invoke-direct {v1, v3}, Ll/ܺۢᩴ;-><init>(I)V

    .line 41
    :goto_0
    array-length v3, p3

    if-ge v2, v3, :cond_1

    .line 42
    aget v3, p3, v2

    .line 43
    invoke-static {v0, v3}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v4

    if-ltz v4, :cond_0

    .line 44
    invoke-virtual {p2, v3}, Ll/ܺۢᩴ;->add(I)Z

    .line 45
    invoke-virtual {v1, v2}, Ll/ܺۢᩴ;->add(I)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 48
    :cond_1
    iget-object p3, p0, Ll/ۧ᩻ۘ;->ۧ:[[I

    invoke-virtual {v1}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object v0

    aput-object v0, p3, p1

    .line 49
    iget-object p3, p0, Ll/ۧ᩻ۘ;->֫:[I

    invoke-virtual {p2}, Ll/ܺۢᩴ;->size()I

    move-result v0

    aput v0, p3, p1

    .line 50
    invoke-virtual {p2}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ֫([Ljava/util/BitSet;Ll/ۨܳۘ;)V
    .locals 11

    .line 64
    iget-object v0, p0, Ll/ۧ᩻ۘ;->֫:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    iget-object v3, p0, Ll/ۧ᩻ۘ;->ܽ:[I

    aget v4, v3, v1

    const/4 v5, 0x1

    if-ne v2, v4, :cond_0

    aget v2, v0, v5

    aget v4, v3, v5

    if-ne v2, v4, :cond_0

    .line 65
    aget-object v0, p1, v1

    .line 66
    aget-object p1, p1, v5

    goto :goto_3

    .line 68
    :cond_0
    new-instance v2, Ljava/util/BitSet;

    aget v4, v3, v1

    invoke-direct {v2, v4}, Ljava/util/BitSet;-><init>(I)V

    .line 69
    new-instance v4, Ljava/util/BitSet;

    aget v6, v3, v5

    invoke-direct {v4, v6}, Ljava/util/BitSet;-><init>(I)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 72
    :cond_1
    :goto_0
    aget v8, v0, v1

    iget-object v9, p0, Ll/ۧ᩻ۘ;->ۧ:[[I

    if-lt v6, v8, :cond_e

    aget v10, v0, v5

    if-ge v7, v10, :cond_2

    goto/16 :goto_9

    :cond_2
    if-nez v8, :cond_3

    .line 90
    aget p1, v3, v1

    invoke-virtual {v2, v1, p1}, Ljava/util/BitSet;->set(II)V

    goto :goto_1

    .line 92
    :cond_3
    aget-object p1, v9, v1

    aget p1, p1, v1

    invoke-virtual {v2, v1, p1}, Ljava/util/BitSet;->set(II)V

    .line 94
    :goto_1
    aget p1, v0, v5

    if-nez p1, :cond_4

    .line 95
    aget p1, v3, v5

    invoke-virtual {v4, v1, p1}, Ljava/util/BitSet;->set(II)V

    goto :goto_2

    .line 97
    :cond_4
    aget-object p1, v9, v5

    aget p1, p1, v1

    invoke-virtual {v4, v1, p1}, Ljava/util/BitSet;->set(II)V

    :goto_2
    move-object v0, v2

    move-object p1, v4

    :goto_3
    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 103
    :cond_5
    :goto_4
    aget v6, v3, v1

    if-ge v2, v6, :cond_b

    aget v7, v3, v5

    if-ge v4, v7, :cond_b

    move v6, v2

    .line 105
    :goto_5
    aget v7, v3, v1

    if-ge v6, v7, :cond_6

    aget v7, v3, v5

    if-ge v4, v7, :cond_6

    invoke-virtual {v0, v6}, Ljava/util/BitSet;->get(I)Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {p1, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v7

    if-nez v7, :cond_6

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_6
    if-le v6, v2, :cond_7

    sub-int v2, v6, v2

    .line 109
    invoke-virtual {p2, v2}, Ll/ۨܳۘ;->֫(I)V

    :cond_7
    const/4 v2, 0x0

    move v2, v6

    const/4 v6, 0x0

    .line 112
    :goto_6
    aget v7, v3, v1

    if-ge v2, v7, :cond_8

    invoke-virtual {v0, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v7

    if-eqz v7, :cond_8

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_8
    const/4 v7, 0x0

    .line 116
    :goto_7
    aget v8, v3, v5

    if-ge v4, v8, :cond_9

    invoke-virtual {p1, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-eqz v8, :cond_9

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_9
    if-nez v6, :cond_a

    if-eqz v7, :cond_5

    .line 120
    :cond_a
    invoke-virtual {p2, v6, v7}, Ll/ۨܳۘ;->֫(II)V

    goto :goto_4

    :cond_b
    if-ne v2, v6, :cond_d

    .line 122
    aget p1, v3, v5

    if-eq v4, p1, :cond_c

    goto :goto_8

    :cond_c
    return-void

    :cond_d
    :goto_8
    sub-int/2addr v6, v2

    .line 123
    aget p1, v3, v5

    sub-int/2addr p1, v4

    invoke-virtual {p2, v6, p1}, Ll/ۨܳۘ;->֫(II)V

    return-void

    :cond_e
    :goto_9
    if-ge v6, v8, :cond_f

    .line 73
    aget v8, v0, v5

    if-ge v7, v8, :cond_f

    aget-object v8, p1, v1

    invoke-virtual {v8, v6}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-nez v8, :cond_f

    aget-object v8, p1, v5

    invoke-virtual {v8, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-nez v8, :cond_f

    .line 74
    aget-object v8, v9, v1

    aget v10, v3, v1

    invoke-static {v8, v6, v2, v10}, Ll/ۧ᩻ۘ;->֫([IILjava/util/BitSet;I)I

    move-result v6

    .line 75
    aget-object v8, v9, v5

    aget v9, v3, v5

    invoke-static {v8, v7, v4, v9}, Ll/ۧ᩻ۘ;->֫([IILjava/util/BitSet;I)I

    move-result v7

    goto/16 :goto_0

    .line 78
    :cond_f
    aget-object v8, p1, v1

    invoke-virtual {v8, v6}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-eqz v8, :cond_10

    .line 79
    aget-object v8, v9, v1

    .line 127
    aget v8, v8, v6

    .line 79
    invoke-virtual {v2, v8}, Ljava/util/BitSet;->set(I)V

    .line 80
    aget-object v8, v9, v1

    aget v9, v3, v1

    invoke-static {v8, v6, v2, v9}, Ll/ۧ᩻ۘ;->֫([IILjava/util/BitSet;I)I

    move-result v6

    goto/16 :goto_0

    .line 83
    :cond_10
    aget-object v8, p1, v5

    invoke-virtual {v8, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 84
    aget-object v8, v9, v5

    .line 127
    aget v8, v8, v7

    .line 84
    invoke-virtual {v4, v8}, Ljava/util/BitSet;->set(I)V

    .line 85
    aget-object v8, v9, v5

    aget v9, v3, v5

    invoke-static {v8, v7, v4, v9}, Ll/ۧ᩻ۘ;->֫([IILjava/util/BitSet;I)I

    move-result v7

    goto/16 :goto_0
.end method

.method public final ֫([I[I)[[I
    .locals 3

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, v0, p2, p1}, Ll/ۧ᩻ۘ;->֫(I[I[I)[I

    move-result-object p1

    const/4 v1, 0x1

    .line 33
    invoke-direct {p0, v1, p1, p2}, Ll/ۧ᩻ۘ;->֫(I[I[I)[I

    move-result-object p2

    const/4 v2, 0x2

    new-array v2, v2, [[I

    aput-object p1, v2, v0

    aput-object p2, v2, v1

    return-object v2
.end method
