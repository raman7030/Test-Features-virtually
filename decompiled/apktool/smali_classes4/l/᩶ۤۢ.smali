.class public final Ll/᩶ۤۢ;
.super Ljava/lang/Object;
.source "M6OA"


# instance fields
.field public final ֫:Ll/ۙۛۢ;

.field public final ۖ:Ljava/lang/String;

.field public final ۘ:[I

.field public final ۜ:[Ll/᩸ۤۢ;

.field public final ۡ:Ljava/lang/CharSequence;

.field public final ۢ:[I

.field public ۧ:I

.field public final ܳ:[Ll/᩸ۤۢ;

.field public final ܺ:I

.field public ܽ:I

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:[Z

.field public final ᩷:Ljava/util/ArrayList;

.field public final ᩻:Ll/ᩴ᩷ܿ;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ILl/ۙۛۢ;Ll/ᩴ᩷ܿ;)V
    .locals 4

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ll/᩶ۤۢ;->ۡ:Ljava/lang/CharSequence;

    .line 25
    iput-object p2, p0, Ll/᩶ۤۢ;->᩷:Ljava/util/ArrayList;

    .line 26
    iput-object p3, p0, Ll/᩶ۤۢ;->ۖ:Ljava/lang/String;

    .line 27
    iput-object p4, p0, Ll/᩶ۤۢ;->ܿ:Ljava/lang/String;

    .line 28
    iput p5, p0, Ll/᩶ۤۢ;->ܺ:I

    .line 30
    iput-object p6, p0, Ll/᩶ۤۢ;->֫:Ll/ۙۛۢ;

    .line 31
    iput-object p7, p0, Ll/᩶ۤۢ;->᩻:Ll/ᩴ᩷ܿ;

    .line 32
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ll/᩸ۤۢ;

    iput-object p1, p0, Ll/᩶ۤۢ;->ܳ:[Ll/᩸ۤۢ;

    .line 33
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ll/᩸ۤۢ;

    iput-object p1, p0, Ll/᩶ۤۢ;->ۜ:[Ll/᩸ۤۢ;

    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p3, 0x1

    add-int/2addr p1, p3

    new-array p1, p1, [I

    iput-object p1, p0, Ll/᩶ۤۢ;->ۘ:[I

    .line 35
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Ll/᩶ۤۢ;->ۢ:[I

    .line 36
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Ll/᩶ۤۢ;->ᩳ:[Z

    const/4 p1, 0x0

    .line 51
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-ge p1, p4, :cond_6

    .line 52
    invoke-virtual {p6}, Ll/ۙۛۢ;->֫()V

    .line 53
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/᩹ۤۢ;

    .line 54
    invoke-static {p4}, Ll/᩹ۤۢ;->ᩳ(Ll/᩹ۤۢ;)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result p5

    .line 55
    invoke-static {p4}, Ll/᩹ۤۢ;->ۢ(Ll/᩹ۤۢ;)I

    move-result p7

    const/4 v0, 0x0

    :goto_1
    invoke-static {p4}, Ll/᩹ۤۢ;->ۧ(Ll/᩹ۤۢ;)I

    move-result v1

    if-ge p7, v1, :cond_5

    add-int/lit8 v1, v0, 0x1

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    .line 56
    invoke-virtual {p6}, Ll/ۙۛۢ;->֫()V

    .line 57
    :cond_0
    iget-object v0, p0, Ll/᩶ۤۢ;->ۡ:Ljava/lang/CharSequence;

    invoke-static {v0, p7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v0

    const/16 v2, 0xd

    if-eq v0, v2, :cond_3

    const/16 v2, 0xa

    if-ne v0, v2, :cond_1

    goto :goto_3

    :cond_1
    const v2, 0xfeff

    if-eq v0, v2, :cond_4

    const/16 v2, 0x9

    if-ne v0, v2, :cond_2

    .line 59
    iget v2, p0, Ll/᩶ۤۢ;->ܺ:I

    goto :goto_2

    :cond_2
    const/4 v2, 0x1

    :goto_2
    add-int/2addr p5, v2

    goto :goto_4

    .line 58
    :cond_3
    :goto_3
    iget-object v2, p0, Ll/᩶ۤۢ;->ᩳ:[Z

    aput-boolean p3, v2, p1

    .line 60
    :cond_4
    :goto_4
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v0

    add-int/2addr p7, v0

    move v0, v1

    goto :goto_1

    .line 62
    :cond_5
    iget-object p4, p0, Ll/᩶ۤۢ;->ۘ:[I

    add-int/lit8 p7, p1, 0x1

    aget p1, p4, p1

    add-int/2addr p1, p5

    aput p1, p4, p7

    move p1, p7

    goto :goto_0

    .line 67
    :cond_6
    iget-object p1, p0, Ll/᩶ۤۢ;->᩷:Ljava/util/ArrayList;

    new-instance p4, Ljava/util/ArrayDeque;

    invoke-direct {p4}, Ljava/util/ArrayDeque;-><init>()V

    const/4 p5, 0x0

    .line 68
    :goto_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p7

    if-ge p5, p7, :cond_e

    .line 69
    iget-object p7, p0, Ll/᩶ۤۢ;->֫:Ll/ۙۛۢ;

    invoke-virtual {p7}, Ll/ۙۛۢ;->֫()V

    .line 70
    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Ll/᩹ۤۢ;

    .line 71
    iget-object v0, p0, Ll/᩶ۤۢ;->ۜ:[Ll/᩸ۤۢ;

    invoke-virtual {p4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ۤۢ;

    aput-object v1, v0, p5

    .line 72
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 73
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ۤۢ;

    iget-boolean v1, v0, Ll/᩸ۤۢ;->ᩳ:Z

    .line 137
    iget-object v2, p0, Ll/᩶ۤۢ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v2, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ۤۢ;

    .line 138
    invoke-static {v2}, Ll/᩹ۤۢ;->ܳ(Ll/᩹ۤۢ;)Z

    move-result v3

    if-nez v3, :cond_9

    invoke-static {v2}, Ll/᩹ۤۢ;->ܿ(Ll/᩹ۤۢ;)I

    move-result v2

    if-ltz v2, :cond_7

    goto :goto_6

    .line 73
    :cond_7
    iget-object v2, p0, Ll/᩶ۤۢ;->ᩳ:[Z

    aget-boolean v2, v2, p5

    if-eqz v2, :cond_8

    goto :goto_6

    :cond_8
    const/4 v2, 0x0

    goto :goto_7

    :cond_9
    :goto_6
    const/4 v2, 0x1

    :goto_7
    or-int/2addr v1, v2

    iput-boolean v1, v0, Ll/᩸ۤۢ;->ᩳ:Z

    .line 74
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ۤۢ;

    iget-boolean v1, v0, Ll/᩸ۤۢ;->᩻:Z

    invoke-static {p7}, Ll/᩹ۤۢ;->ۜ(Ll/᩹ۤۢ;)Z

    move-result v2

    or-int/2addr v1, v2

    iput-boolean v1, v0, Ll/᩸ۤۢ;->᩻:Z

    .line 76
    :cond_a
    invoke-static {p7}, Ll/᩹ۤۢ;->ۡ(Ll/᩹ۤۢ;)I

    move-result v0

    const/16 v1, 0x1e

    if-eq v0, v1, :cond_c

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_c

    const/16 v1, 0x2d

    if-ne v0, v1, :cond_b

    goto :goto_8

    .line 81
    :cond_b
    invoke-static {p7}, Ll/᩹ۤۢ;->ۡ(Ll/᩹ۤۢ;)I

    move-result p7

    invoke-static {p7}, Ll/᩶ۤۢ;->ۧ(I)Z

    move-result p7

    if-eqz p7, :cond_d

    .line 82
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Ll/᩸ۤۢ;

    .line 83
    iput p5, p7, Ll/᩸ۤۢ;->֫:I

    .line 84
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    .line 85
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ۤۢ;

    iget-boolean v1, v0, Ll/᩸ۤۢ;->ᩳ:Z

    iget-boolean v2, p7, Ll/᩸ۤۢ;->ᩳ:Z

    or-int/2addr v1, v2

    iput-boolean v1, v0, Ll/᩸ۤۢ;->ᩳ:Z

    .line 86
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ۤۢ;

    iget-boolean v1, v0, Ll/᩸ۤۢ;->᩻:Z

    iget-boolean p7, p7, Ll/᩸ۤۢ;->᩻:Z

    or-int/2addr p7, v1

    iput-boolean p7, v0, Ll/᩸ۤۢ;->᩻:Z

    goto :goto_9

    .line 77
    :cond_c
    :goto_8
    new-instance v0, Ll/᩸ۤۢ;

    invoke-static {p7}, Ll/᩹ۤۢ;->᩻(Ll/᩹ۤۢ;)I

    move-result v1

    invoke-direct {v0, p5, v1}, Ll/᩸ۤۢ;-><init>(II)V

    .line 78
    invoke-static {p7}, Ll/᩹ۤۢ;->ۜ(Ll/᩹ۤۢ;)Z

    move-result p7

    iput-boolean p7, v0, Ll/᩸ۤۢ;->᩻:Z

    .line 79
    iget-object p7, p0, Ll/᩶ۤۢ;->ܳ:[Ll/᩸ۤۢ;

    aput-object v0, p7, p5

    .line 80
    invoke-virtual {p4, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_d
    :goto_9
    add-int/lit8 p5, p5, 0x1

    goto/16 :goto_5

    .line 40
    :cond_e
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, p3

    :goto_a
    if-ltz p1, :cond_11

    .line 41
    invoke-virtual {p6}, Ll/ۙۛۢ;->֫()V

    .line 42
    iget-object p3, p0, Ll/᩶ۤۢ;->ۢ:[I

    aput p1, p3, p1

    add-int/lit8 p3, p1, 0x1

    .line 43
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-ge p3, p4, :cond_10

    iget-object p4, p0, Ll/᩶ۤۢ;->ᩳ:[Z

    aget-boolean p4, p4, p1

    if-nez p4, :cond_10

    .line 137
    iget-object p4, p0, Ll/᩶ۤۢ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/᩹ۤۢ;

    .line 138
    invoke-static {p4}, Ll/᩹ۤۢ;->ܳ(Ll/᩹ۤۢ;)Z

    move-result p5

    if-nez p5, :cond_10

    invoke-static {p4}, Ll/᩹ۤۢ;->ܿ(Ll/᩹ۤۢ;)I

    move-result p4

    if-ltz p4, :cond_f

    goto :goto_b

    .line 43
    :cond_f
    invoke-direct {p0, p3}, Ll/᩶ۤۢ;->֫(I)Z

    move-result p4

    if-nez p4, :cond_10

    .line 44
    iget-object p4, p0, Ll/᩶ۤۢ;->ۢ:[I

    aget p3, p4, p3

    aput p3, p4, p1

    :cond_10
    :goto_b
    add-int/lit8 p1, p1, -0x1

    goto :goto_a

    :cond_11
    return-void
.end method

.method private ֫(Ljava/lang/CharSequence;II)V
    .locals 6

    sub-int v0, p3, p2

    .line 164
    iget-object v1, p0, Ll/᩶ۤۢ;->᩻:Ll/ᩴ᩷ܿ;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/high16 v3, 0x100000

    sub-int/2addr v3, v2

    if-gt v0, v3, :cond_6

    .line 167
    invoke-virtual {v1, p2, p3, p1}, Ll/ᩴ᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge p2, p3, :cond_5

    add-int/lit8 v2, v1, 0x1

    and-int/lit16 v1, v1, 0x3ff

    if-nez v1, :cond_0

    .line 170
    iget-object v1, p0, Ll/᩶ۤۢ;->֫:Ll/ۙۛۢ;

    invoke-virtual {v1}, Ll/ۙۛۢ;->֫()V

    .line 171
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    const/16 v3, 0xa

    if-eq v1, v3, :cond_3

    const/16 v3, 0xd

    if-ne v1, v3, :cond_1

    goto :goto_2

    :cond_1
    const v3, 0xfeff

    if-eq v1, v3, :cond_4

    .line 173
    iget v3, p0, Ll/᩶ۤۢ;->ۧ:I

    const/16 v4, 0x9

    if-ne v1, v4, :cond_2

    iget v4, p0, Ll/᩶ۤۢ;->ܺ:I

    rem-int v5, v3, v4

    sub-int/2addr v4, v5

    goto :goto_1

    :cond_2
    const/4 v4, 0x1

    :goto_1
    add-int/2addr v3, v4

    iput v3, p0, Ll/᩶ۤۢ;->ۧ:I

    goto :goto_3

    .line 172
    :cond_3
    :goto_2
    iput v0, p0, Ll/᩶ۤۢ;->ۧ:I

    iput v0, p0, Ll/᩶ۤۢ;->ܽ:I

    .line 174
    :cond_4
    :goto_3
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr p2, v1

    move v1, v2

    goto :goto_0

    :cond_5
    return-void

    .line 165
    :cond_6
    sget-object p1, Ll/᩵ۤۢ;->᩶:Ll/᩵ۤۢ;

    const-string p2, "Formatted source length limit exceeded"

    invoke-static {p1, p2}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p1

    throw p1
.end method

.method private ֫(I)Z
    .locals 3

    if-nez p1, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Ll/᩶ۤۢ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ۤۢ;

    .line 144
    invoke-static {v0}, Ll/᩹ۤۢ;->ۜ(Ll/᩹ۤۢ;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0}, Ll/᩹ۤۢ;->ܳ(Ll/᩹ۤۢ;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0}, Ll/᩹ۤۢ;->ۡ(Ll/᩹ۤۢ;)I

    move-result v1

    invoke-static {v1}, Ll/᩶ۤۢ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 146
    :cond_1
    invoke-static {v0}, Ll/᩹ۤۢ;->ۡ(Ll/᩹ۤۢ;)I

    move-result v1

    const/16 v2, 0x11

    if-ne v1, v2, :cond_2

    goto :goto_0

    .line 147
    :cond_2
    iget-object v1, p0, Ll/᩶ۤۢ;->ۜ:[Ll/᩸ۤۢ;

    aget-object v1, v1, p1

    .line 148
    invoke-static {v0}, Ll/᩹ۤۢ;->᩷(Ll/᩹ۤۢ;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_3

    if-eqz v1, :cond_4

    iget-boolean v0, v1, Ll/᩸ۤۢ;->᩻:Z

    if-nez v0, :cond_4

    iget v0, v1, Ll/᩸ۤۢ;->ܳ:I

    add-int/2addr v0, v2

    if-ne p1, v0, :cond_4

    :cond_3
    return v2

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ۧ(I)Z
    .locals 1

    const/16 v0, 0x1f

    if-eq p0, v0, :cond_1

    const/16 v0, 0x30

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2e

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 17

    move-object/from16 v0, p0

    .line 93
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 95
    :goto_0
    iget-object v4, v0, Ll/᩶ۤۢ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget-object v6, v0, Ll/᩶ۤۢ;->ۡ:Ljava/lang/CharSequence;

    if-ge v2, v5, :cond_12

    .line 96
    iget-object v5, v0, Ll/᩶ۤۢ;->֫:Ll/ۙۛۢ;

    invoke-virtual {v5}, Ll/ۙۛۢ;->֫()V

    .line 97
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩹ۤۢ;

    .line 98
    iget-object v8, v0, Ll/᩶ۤۢ;->ۜ:[Ll/᩸ۤۢ;

    aget-object v8, v8, v2

    if-nez v8, :cond_0

    const/4 v9, 0x0

    goto :goto_1

    .line 100
    :cond_0
    iget v9, v8, Ll/᩸ۤۢ;->ܿ:I

    .line 101
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1

    const/4 v10, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܶۤۢ;

    invoke-static {v10}, Ll/ܶۤۢ;->ۧ(Ll/ܶۤۢ;)I

    move-result v10

    .line 100
    :goto_2
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 102
    invoke-static {v7}, Ll/᩹ۤۢ;->᩻(Ll/᩹ۤۢ;)I

    move-result v10

    add-int/2addr v10, v9

    .line 103
    invoke-static {v7}, Ll/᩹ۤۢ;->ۜ(Ll/᩹ۤۢ;)Z

    move-result v11

    const/4 v12, 0x1

    if-nez v11, :cond_3

    invoke-static {v7}, Ll/᩹ۤۢ;->֫(Ll/᩹ۤۢ;)Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-static {v7}, Ll/᩹ۤۢ;->ۡ(Ll/᩹ۤۢ;)I

    move-result v11

    invoke-static {v11}, Ll/᩶ۤۢ;->ۧ(I)Z

    move-result v11

    if-nez v11, :cond_3

    if-eqz v8, :cond_2

    invoke-static {v7}, Ll/᩹ۤۢ;->᩻(Ll/᩹ۤۢ;)I

    move-result v11

    iget v13, v8, Ll/᩸ۤۢ;->ܽ:I

    add-int/2addr v13, v12

    if-le v11, v13, :cond_3

    :cond_2
    const/4 v11, 0x1

    goto :goto_3

    :cond_3
    const/4 v11, 0x0

    :goto_3
    if-eqz v8, :cond_5

    .line 105
    iget-boolean v13, v8, Ll/᩸ۤۢ;->ۧ:Z

    if-eqz v13, :cond_5

    iget v13, v8, Ll/᩸ۤۢ;->ܳ:I

    add-int/2addr v13, v12

    if-eq v2, v13, :cond_4

    invoke-static {v7}, Ll/᩹ۤۢ;->ۡ(Ll/᩹ۤۢ;)I

    move-result v13

    invoke-static {v13}, Ll/᩶ۤۢ;->ۧ(I)Z

    move-result v13

    if-nez v13, :cond_4

    invoke-static {v7}, Ll/᩹ۤۢ;->᩻(Ll/᩹ۤۢ;)I

    move-result v13

    iget v14, v8, Ll/᩸ۤۢ;->ܽ:I

    add-int/2addr v14, v12

    if-ne v13, v14, :cond_5

    add-int/lit8 v13, v2, -0x1

    .line 106
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩹ۤۢ;

    invoke-static {v13}, Ll/᩹ۤۢ;->ۡ(Ll/᩹ۤۢ;)I

    move-result v13

    const/16 v14, 0xf

    if-eq v13, v14, :cond_4

    if-ne v13, v12, :cond_5

    :cond_4
    const/4 v12, 0x1

    goto :goto_4

    :cond_5
    const/4 v12, 0x0

    .line 107
    :goto_4
    invoke-static {v7}, Ll/᩹ۤۢ;->ۜ(Ll/᩹ۤۢ;)Z

    move-result v13

    iget-object v14, v0, Ll/᩶ۤۢ;->ۘ:[I

    iget-object v15, v0, Ll/᩶ۤۢ;->ۢ:[I

    if-nez v13, :cond_7

    if-nez v12, :cond_6

    invoke-direct {v0, v2}, Ll/᩶ۤۢ;->֫(I)Z

    move-result v12

    if-eqz v12, :cond_7

    iget v12, v0, Ll/᩶ۤۢ;->ۧ:I

    invoke-static {v7}, Ll/᩹ۤۢ;->ᩳ(Ll/᩹ۤۢ;)Ljava/lang/String;

    move-result-object v13

    .line 108
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    add-int/2addr v13, v12

    aget v12, v15, v2

    add-int/lit8 v12, v12, 0x1

    .line 152
    aget v12, v14, v12

    aget v16, v14, v2

    sub-int v12, v12, v16

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ll/᩹ۤۢ;

    invoke-static/range {v16 .. v16}, Ll/᩹ۤۢ;->ᩳ(Ll/᩹ۤۢ;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v16

    sub-int v12, v12, v16

    add-int/2addr v12, v13

    const/16 v13, 0x64

    if-le v12, v13, :cond_7

    :cond_6
    const/4 v12, 0x1

    goto :goto_5

    :cond_7
    const/4 v12, 0x0

    .line 109
    :goto_5
    invoke-static {v7}, Ll/᩹ۤۢ;->ܿ(Ll/᩹ۤۢ;)I

    move-result v13

    move-object/from16 v16, v1

    iget-object v1, v0, Ll/᩶ۤۢ;->ۖ:Ljava/lang/String;

    if-ltz v13, :cond_9

    .line 110
    invoke-static {v7}, Ll/᩹ۤۢ;->ܿ(Ll/᩹ۤۢ;)I

    move-result v12

    invoke-direct {v0, v6, v3, v12}, Ll/᩶ۤۢ;->֫(Ljava/lang/CharSequence;II)V

    add-int/2addr v10, v11

    const/4 v3, 0x0

    :goto_6
    if-ge v3, v10, :cond_8

    .line 157
    invoke-virtual {v5}, Ll/ۙۛۢ;->֫()V

    .line 158
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v12, 0x0

    invoke-direct {v0, v1, v12, v11}, Ll/᩶ۤۢ;->֫(Ljava/lang/CharSequence;II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    .line 160
    :cond_8
    iput v10, v0, Ll/᩶ۤۢ;->ܽ:I

    goto :goto_9

    .line 112
    :cond_9
    invoke-static {v7}, Ll/᩹ۤۢ;->ܳ(Ll/᩹ۤۢ;)Z

    move-result v3

    if-nez v3, :cond_b

    if-eqz v12, :cond_a

    goto :goto_7

    .line 116
    :cond_a
    invoke-static {v7}, Ll/᩹ۤۢ;->ᩳ(Ll/᩹ۤۢ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7}, Ll/᩹ۤۢ;->ᩳ(Ll/᩹ۤۢ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v5, 0x0

    invoke-direct {v0, v1, v5, v3}, Ll/᩶ۤۢ;->֫(Ljava/lang/CharSequence;II)V

    goto :goto_9

    :cond_b
    :goto_7
    const/4 v3, 0x0

    .line 113
    iget-object v12, v0, Ll/᩶ۤۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    invoke-direct {v0, v12, v3, v13}, Ll/᩶ۤۢ;->֫(Ljava/lang/CharSequence;II)V

    add-int/2addr v10, v11

    const/4 v11, 0x0

    :goto_8
    if-ge v11, v10, :cond_8

    .line 157
    invoke-virtual {v5}, Ll/ۙۛۢ;->֫()V

    .line 158
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v12

    invoke-direct {v0, v1, v3, v12}, Ll/᩶ۤۢ;->֫(Ljava/lang/CharSequence;II)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    .line 118
    :goto_9
    iget-object v1, v0, Ll/᩶ۤۢ;->ܳ:[Ll/᩸ۤۢ;

    aget-object v1, v1, v2

    if-eqz v1, :cond_f

    .line 120
    iget-boolean v3, v1, Ll/᩸ۤۢ;->᩻:Z

    if-eqz v8, :cond_c

    iget-boolean v5, v8, Ll/᩸ۤۢ;->᩻:Z

    if-eqz v5, :cond_c

    const/4 v5, 0x1

    goto :goto_a

    :cond_c
    const/4 v5, 0x0

    :goto_a
    or-int/2addr v3, v5

    iput-boolean v3, v1, Ll/᩸ۤۢ;->᩻:Z

    .line 122
    iget v3, v0, Ll/᩶ۤۢ;->ܽ:I

    invoke-static {v7}, Ll/᩹ۤۢ;->᩻(Ll/᩹ۤۢ;)I

    move-result v5

    sub-int/2addr v3, v5

    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v1, Ll/᩸ۤۢ;->ܿ:I

    .line 123
    iget-boolean v3, v1, Ll/᩸ۤۢ;->᩻:Z

    if-nez v3, :cond_e

    iget v3, v1, Ll/᩸ۤۢ;->֫:I

    add-int/lit8 v5, v2, 0x1

    if-le v3, v5, :cond_e

    iget-boolean v5, v1, Ll/᩸ۤۢ;->ᩳ:Z

    if-nez v5, :cond_d

    iget v5, v0, Ll/᩶ۤۢ;->ۧ:I

    aget v3, v15, v3

    add-int/lit8 v3, v3, 0x1

    .line 152
    aget v3, v14, v3

    aget v8, v14, v2

    sub-int/2addr v3, v8

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ۤۢ;

    invoke-static {v4}, Ll/᩹ۤۢ;->ᩳ(Ll/᩹ۤۢ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v3, v4

    add-int/2addr v3, v5

    const/16 v4, 0x64

    if-le v3, v4, :cond_e

    :cond_d
    const/4 v3, 0x1

    goto :goto_b

    :cond_e
    const/4 v3, 0x0

    .line 124
    :goto_b
    iput-boolean v3, v1, Ll/᩸ۤۢ;->ۧ:Z

    .line 126
    :cond_f
    invoke-static {v7}, Ll/᩹ۤۢ;->ܽ(Ll/᩹ۤۢ;)I

    move-result v1

    if-eqz v1, :cond_10

    .line 127
    new-instance v1, Ll/ܶۤۢ;

    invoke-static {v7}, Ll/᩹ۤۢ;->ܽ(Ll/᩹ۤۢ;)I

    move-result v3

    iget v4, v0, Ll/᩶ۤۢ;->ܽ:I

    invoke-static {v7}, Ll/᩹ۤۢ;->᩻(Ll/᩹ۤۢ;)I

    move-result v5

    sub-int/2addr v4, v5

    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-direct {v1, v3, v4}, Ll/ܶۤۢ;-><init>(II)V

    move-object/from16 v4, v16

    invoke-virtual {v4, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_c

    :cond_10
    move-object/from16 v4, v16

    .line 129
    :goto_c
    invoke-static {v7}, Ll/᩹ۤۢ;->ۢ(Ll/᩹ۤۢ;)I

    move-result v1

    invoke-static {v7}, Ll/᩹ۤۢ;->ۧ(Ll/᩹ۤۢ;)I

    move-result v3

    invoke-direct {v0, v6, v1, v3}, Ll/᩶ۤۢ;->֫(Ljava/lang/CharSequence;II)V

    .line 130
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶۤۢ;

    invoke-static {v1}, Ll/ܶۤۢ;->֫(Ll/ܶۤۢ;)I

    move-result v1

    invoke-static {v7}, Ll/᩹ۤۢ;->ۧ(Ll/᩹ۤۢ;)I

    move-result v3

    if-ne v1, v3, :cond_11

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 131
    :cond_11
    invoke-static {v7}, Ll/᩹ۤۢ;->ۧ(Ll/᩹ۤۢ;)I

    move-result v3

    add-int/lit8 v2, v2, 0x1

    move-object v1, v4

    goto/16 :goto_0

    .line 133
    :cond_12
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {v0, v6, v3, v1}, Ll/᩶ۤۢ;->֫(Ljava/lang/CharSequence;II)V

    return-void
.end method
