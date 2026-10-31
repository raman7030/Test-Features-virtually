.class public final Ll/᩹ܰۢ;
.super Ljava/lang/Object;
.source "V6PG"


# instance fields
.field public ֫:Z

.field public final ۖ:[I

.field public final ۘ:I

.field public final ۜ:Ll/ᩴ᩷ܿ;

.field public final ۡ:Ll/ᩴ᩷ܿ;

.field public final ۢ:Ljava/util/ArrayList;

.field public final ۧ:Ll/ۖܰۢ;

.field public final ܳ:[I

.field public final ܺ:[I

.field public ܽ:I

.field public final ܿ:Ljava/lang/String;

.field public ᩳ:I

.field public final ᩴ:Ljava/lang/String;

.field public final ᩵:[I

.field public final ᩷:[Ll/ܶܰۢ;

.field public final ᩻:[Ll/ܶܰۢ;


# direct methods
.method public constructor <init>(Ll/ᩴ᩷ܿ;Ljava/util/ArrayList;Ll/ۖܰۢ;ZILl/ᩴ᩷ܿ;)V
    .locals 5

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Ll/᩹ܰۢ;->֫:Z

    .line 34
    iput-object p1, p0, Ll/᩹ܰۢ;->ۡ:Ll/ᩴ᩷ܿ;

    .line 35
    iput-object p2, p0, Ll/᩹ܰۢ;->ۢ:Ljava/util/ArrayList;

    .line 36
    iput-object p3, p0, Ll/᩹ܰۢ;->ۧ:Ll/ۖܰۢ;

    .line 37
    iput p5, p0, Ll/᩹ܰۢ;->ۘ:I

    if-eqz p4, :cond_0

    const-string p3, "\t"

    goto :goto_0

    :cond_0
    const/16 p3, 0x20

    .line 39
    invoke-static {p3, p5}, Ll/ۢܺ֡;->֫(CI)Ljava/lang/String;

    move-result-object p3

    :goto_0
    iput-object p3, p0, Ll/᩹ܰۢ;->ᩴ:Ljava/lang/String;

    const-string p3, "\n"

    const/4 p4, 0x0

    .line 40
    invoke-static {p3, p1, p4}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result p5

    const/16 v1, 0xd

    if-lez p5, :cond_1

    sub-int/2addr p5, v0

    .line 41
    invoke-interface {p1, p5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p5

    if-ne p5, v1, :cond_1

    const-string p3, "\r\n"

    :cond_1
    iput-object p3, p0, Ll/᩹ܰۢ;->ܿ:Ljava/lang/String;

    .line 42
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    new-array p3, p3, [Ll/ܶܰۢ;

    iput-object p3, p0, Ll/᩹ܰۢ;->᩻:[Ll/ܶܰۢ;

    .line 43
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    new-array p3, p3, [Ll/ܶܰۢ;

    iput-object p3, p0, Ll/᩹ܰۢ;->᩷:[Ll/ܶܰۢ;

    .line 44
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    new-array p3, p3, [I

    iput-object p3, p0, Ll/᩹ܰۢ;->ܳ:[I

    .line 45
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    new-array p3, p3, [I

    iput-object p3, p0, Ll/᩹ܰۢ;->ܺ:[I

    .line 46
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p5

    mul-int/lit8 p5, p5, 0x2

    new-array p5, p5, [I

    iput-object p5, p0, Ll/᩹ܰۢ;->᩵:[I

    .line 47
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p5

    mul-int/lit8 p5, p5, 0x2

    new-array p5, p5, [I

    iput-object p5, p0, Ll/᩹ܰۢ;->ۖ:[I

    .line 48
    iput-object p6, p0, Ll/᩹ܰۢ;->ۜ:Ll/ᩴ᩷ܿ;

    .line 55
    new-instance p5, Ljava/util/ArrayDeque;

    invoke-direct {p5}, Ljava/util/ArrayDeque;-><init>()V

    const/4 p6, 0x0

    .line 56
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p6, v2, :cond_7

    .line 57
    iget-object v2, p0, Ll/᩹ܰۢ;->ۧ:Ll/ۖܰۢ;

    invoke-virtual {v2}, Ll/ۖܰۢ;->֫()V

    .line 58
    invoke-virtual {p2, p6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸ܰۢ;

    .line 59
    iget-object v3, p0, Ll/᩹ܰۢ;->᩷:[Ll/ܶܰۢ;

    invoke-virtual {p5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶܰۢ;

    aput-object v4, v3, p6

    .line 60
    invoke-static {v2}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result v3

    const/16 v4, 0xc

    if-eq v3, v4, :cond_2

    if-eq v3, v1, :cond_2

    const/16 v4, 0xe

    if-ne v3, v4, :cond_3

    .line 61
    :cond_2
    new-instance v3, Ll/ܶܰۢ;

    invoke-direct {v3, p6}, Ll/ܶܰۢ;-><init>(I)V

    .line 62
    iget-object v4, p0, Ll/᩹ܰۢ;->᩻:[Ll/ܶܰۢ;

    aput-object v3, v4, p6

    .line 63
    invoke-virtual {p5, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 65
    :cond_3
    invoke-virtual {p5}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {v2}, Ll/᩸ܰۢ;->ܽ(Ll/᩸ܰۢ;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v2}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result v3

    const/16 v4, 0x69

    if-ne v3, v4, :cond_5

    .line 66
    :cond_4
    invoke-virtual {p5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶܰۢ;

    iput-boolean v0, v3, Ll/ܶܰۢ;->ܳ:Z

    .line 68
    :cond_5
    invoke-static {v2}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result v2

    invoke-static {v2}, Ll/᩹ܰۢ;->ۧ(I)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 69
    invoke-virtual {p5}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶܰۢ;

    .line 70
    iput p6, v2, Ll/ܶܰۢ;->ۧ:I

    .line 71
    invoke-virtual {p5}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {p5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶܰۢ;

    iget-boolean v4, v3, Ll/ܶܰۢ;->ܳ:Z

    iget-boolean v2, v2, Ll/ܶܰۢ;->ܳ:Z

    or-int/2addr v2, v4

    iput-boolean v2, v3, Ll/ܶܰۢ;->ܳ:Z

    :cond_6
    add-int/lit8 p6, p6, 0x1

    goto :goto_1

    .line 74
    :cond_7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p5

    .line 75
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p6

    sub-int/2addr p6, v0

    .line 76
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v0

    :goto_2
    if-ltz v2, :cond_c

    .line 77
    :goto_3
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ܰۢ;

    invoke-static {v0}, Ll/᩸ܰۢ;->ᩳ(Ll/᩸ܰۢ;)I

    move-result v0

    if-lt p6, v0, :cond_9

    .line 78
    invoke-interface {p1, p6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v3, 0xa

    if-ne v0, v3, :cond_8

    move p5, p6

    :cond_8
    add-int/lit8 p6, p6, -0x1

    goto :goto_3

    .line 81
    :cond_9
    iget-object v0, p0, Ll/᩹ܰۢ;->ܳ:[I

    aput p5, v0, v2

    .line 83
    aput v2, p3, v2

    add-int/lit8 v0, v2, 0x1

    .line 84
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_b

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸ܰۢ;

    invoke-static {v3}, Ll/᩸ܰۢ;->ۧ(Ll/᩸ܰۢ;)I

    move-result v3

    if-lt p5, v3, :cond_b

    .line 85
    invoke-direct {p0, v0}, Ll/᩹ܰۢ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸ܰۢ;

    invoke-static {v3}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result v3

    invoke-static {v3}, Ll/᩹ܰۢ;->ۧ(I)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 86
    :cond_a
    aget v0, p3, v0

    aput v0, p3, v2

    :cond_b
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    .line 93
    :cond_c
    iget-object p1, p0, Ll/᩹ܰۢ;->᩵:[I

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 p5, 0x0

    .line 96
    :goto_4
    array-length p6, p1

    if-ge p4, p6, :cond_11

    .line 97
    iget-object p6, p0, Ll/᩹ܰۢ;->ۧ:Ll/ۖܰۢ;

    invoke-virtual {p6}, Ll/ۖܰۢ;->֫()V

    .line 98
    iget-object p6, p0, Ll/᩹ܰۢ;->ۢ:Ljava/util/ArrayList;

    div-int/lit8 v0, p4, 0x2

    invoke-virtual {p6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ll/᩸ܰۢ;

    .line 99
    rem-int/lit8 v0, p4, 0x2

    if-nez v0, :cond_d

    invoke-static {p6}, Ll/᩸ܰۢ;->ᩳ(Ll/᩸ܰۢ;)I

    move-result p6

    goto :goto_5

    :cond_d
    invoke-static {p6}, Ll/᩸ܰۢ;->ۧ(Ll/᩸ܰۢ;)I

    move-result p6

    :goto_5
    if-ge p2, p6, :cond_10

    .line 101
    iget-object v0, p0, Ll/᩹ܰۢ;->ۡ:Ll/ᩴ᩷ܿ;

    invoke-static {v0, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v0

    const/16 v2, 0x9

    if-ne v0, v2, :cond_e

    add-int/lit8 p5, p5, 0x1

    :cond_e
    if-eq v0, v1, :cond_f

    add-int/lit8 p3, p3, 0x1

    .line 104
    :cond_f
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v0

    add-int/2addr p2, v0

    goto :goto_5

    .line 106
    :cond_10
    aput p3, p1, p4

    .line 107
    iget-object p6, p0, Ll/᩹ܰۢ;->ۖ:[I

    aput p5, p6, p4

    add-int/lit8 p4, p4, 0x1

    goto :goto_4

    :cond_11
    return-void
.end method

.method private ֫(Ljava/lang/CharSequence;)V
    .locals 7

    .line 198
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget-object v1, p0, Ll/᩹ܰۢ;->ۜ:Ll/ᩴ᩷ܿ;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/high16 v3, 0x100000

    sub-int/2addr v3, v2

    if-gt v0, v3, :cond_7

    .line 201
    invoke-virtual {v1, p1}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 202
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v1, v2, :cond_6

    and-int/lit16 v2, v1, 0x3ff

    if-nez v2, :cond_0

    .line 203
    iget-object v2, p0, Ll/᩹ܰۢ;->ۧ:Ll/ۖܰۢ;

    invoke-virtual {v2}, Ll/ۖܰۢ;->֫()V

    .line 204
    :cond_0
    invoke-static {p1, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    const/16 v3, 0xa

    const/4 v4, 0x1

    if-ne v2, v3, :cond_1

    .line 206
    iput v0, p0, Ll/᩹ܰۢ;->ܽ:I

    .line 207
    iput v0, p0, Ll/᩹ܰۢ;->ᩳ:I

    .line 208
    iput-boolean v4, p0, Ll/᩹ܰۢ;->֫:Z

    goto :goto_1

    :cond_1
    const/16 v3, 0xd

    if-eq v2, v3, :cond_5

    const v3, 0xfeff

    if-eq v2, v3, :cond_5

    .line 210
    iget v3, p0, Ll/᩹ܰۢ;->ܽ:I

    const/16 v5, 0x9

    if-ne v2, v5, :cond_2

    iget v4, p0, Ll/᩹ܰۢ;->ۘ:I

    rem-int v6, v3, v4

    sub-int/2addr v4, v6

    :cond_2
    add-int/2addr v3, v4

    iput v3, p0, Ll/᩹ܰۢ;->ܽ:I

    .line 211
    iget-boolean v4, p0, Ll/᩹ܰۢ;->֫:Z

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    if-eq v2, v4, :cond_3

    if-eq v2, v5, :cond_3

    const/16 v4, 0xc

    if-ne v2, v4, :cond_4

    :cond_3
    iput v3, p0, Ll/᩹ܰۢ;->ᩳ:I

    goto :goto_1

    .line 212
    :cond_4
    iput-boolean v0, p0, Ll/᩹ܰۢ;->֫:Z

    .line 214
    :cond_5
    :goto_1
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_6
    return-void

    .line 199
    :cond_7
    sget-object p1, Ll/֡ܰۢ;->ۙ:Ll/֡ܰۢ;

    const-string v0, "Formatted source length limit exceeded"

    invoke-static {p1, v0}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object p1

    throw p1
.end method

.method private ֫(I)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    .line 155
    iget-object v1, p0, Ll/᩹ܰۢ;->᩷:[Ll/ܶܰۢ;

    aget-object v2, v1, p1

    if-nez v2, :cond_0

    goto/16 :goto_2

    .line 156
    :cond_0
    iget-object v2, p0, Ll/᩹ܰۢ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸ܰۢ;

    add-int/lit8 v4, p1, -0x1

    .line 157
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸ܰۢ;

    .line 158
    invoke-static {v3}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result v4

    const/16 v5, 0x67

    if-eq v4, v5, :cond_6

    invoke-static {v2}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result v4

    if-eq v4, v5, :cond_6

    invoke-static {v3}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result v4

    const/16 v5, 0x69

    if-eq v4, v5, :cond_6

    invoke-static {v2}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result v4

    if-ne v4, v5, :cond_1

    goto :goto_2

    .line 160
    :cond_1
    aget-object v1, v1, p1

    iget v1, v1, Ll/ܶܰۢ;->ܿ:I

    const/4 v4, 0x1

    add-int/2addr v1, v4

    if-eq p1, v1, :cond_5

    invoke-static {v3}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result p1

    invoke-static {p1}, Ll/᩹ܰۢ;->ۧ(I)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-static {v2}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result p1

    const/16 v1, 0x14

    if-eq p1, v1, :cond_5

    invoke-static {v3}, Ll/᩸ܰۢ;->֫(Ll/᩸ܰۢ;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-static {v3}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result p1

    const/16 v1, 0x8

    const/4 v3, 0x5

    const/16 v5, 0x65

    if-eq p1, v5, :cond_3

    if-eq p1, v3, :cond_3

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    return v0

    .line 162
    :cond_3
    :goto_0
    invoke-static {v2}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result p1

    if-eq p1, v5, :cond_5

    if-eq p1, v3, :cond_5

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    return v0

    :cond_5
    :goto_1
    return v4

    :cond_6
    :goto_2
    return v0
.end method

.method private ֫(III)Z
    .locals 8

    .line 180
    iget-object v0, p0, Ll/᩹ܰۢ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ܰۢ;

    invoke-static {v1}, Ll/᩸ܰۢ;->ᩳ(Ll/᩸ܰۢ;)I

    move-result v1

    .line 181
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ܰۢ;

    invoke-static {v0}, Ll/᩸ܰۢ;->ۧ(Ll/᩸ܰۢ;)I

    move-result v0

    .line 182
    iget-object v2, p0, Ll/᩹ܰۢ;->ܳ:[I

    aget v2, v2, p1

    const/16 v3, 0x78

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-lt v2, v0, :cond_0

    mul-int/lit8 p1, p1, 0x2

    iget-object v2, p0, Ll/᩹ܰۢ;->ۖ:[I

    aget v6, v2, p1

    mul-int/lit8 p2, p2, 0x2

    add-int/2addr p2, v5

    aget v2, v2, p2

    if-ne v6, v2, :cond_0

    int-to-long v0, p3

    .line 183
    iget-object p3, p0, Ll/᩹ܰۢ;->᩵:[I

    aget p2, p3, p2

    int-to-long v6, p2

    add-long/2addr v0, v6

    aget p1, p3, p1

    int-to-long p1, p1

    sub-long/2addr v0, p1

    int-to-long p1, v3

    cmp-long p3, v0, p1

    if-gtz p3, :cond_5

    goto :goto_2

    :cond_0
    :goto_0
    if-ge v1, v0, :cond_7

    and-int/lit16 p1, v1, 0x3ff

    if-nez p1, :cond_1

    .line 187
    iget-object p1, p0, Ll/᩹ܰۢ;->ۧ:Ll/ۖܰۢ;

    invoke-virtual {p1}, Ll/ۖܰۢ;->֫()V

    .line 188
    :cond_1
    iget-object p1, p0, Ll/᩹ܰۢ;->ۡ:Ll/ᩴ᩷ܿ;

    invoke-static {p1, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result p1

    const/16 p2, 0xa

    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    const/16 p2, 0x9

    if-ne p1, p2, :cond_3

    .line 190
    iget p2, p0, Ll/᩹ܰۢ;->ۘ:I

    rem-int v2, p3, p2

    sub-int/2addr p2, v2

    goto :goto_1

    :cond_3
    const/16 p2, 0xd

    if-ne p1, p2, :cond_4

    const/4 p2, 0x0

    goto :goto_1

    :cond_4
    const/4 p2, 0x1

    :goto_1
    add-int/2addr p3, p2

    if-le p3, v3, :cond_6

    :cond_5
    return v4

    .line 192
    :cond_6
    invoke-static {p1}, Ljava/lang/Character;->charCount(I)I

    move-result p1

    add-int/2addr v1, p1

    goto :goto_0

    :cond_7
    :goto_2
    return v5
.end method

.method public static ۧ(I)Z
    .locals 1

    const/16 v0, 0xf

    if-eq p0, v0, :cond_1

    const/16 v0, 0x10

    if-eq p0, v0, :cond_1

    const/16 v0, 0x11

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
    .locals 23

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 113
    :goto_0
    iget-object v4, v0, Ll/᩹ܰۢ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget-object v6, v0, Ll/᩹ܰۢ;->ۡ:Ll/ᩴ᩷ܿ;

    if-ge v2, v5, :cond_f

    .line 114
    iget-object v5, v0, Ll/᩹ܰۢ;->ۧ:Ll/ۖܰۢ;

    invoke-virtual {v5}, Ll/ۖܰۢ;->֫()V

    .line 115
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩸ܰۢ;

    .line 116
    iget-object v8, v0, Ll/᩹ܰۢ;->᩷:[Ll/ܶܰۢ;

    aget-object v9, v8, v2

    .line 117
    invoke-static {v7}, Ll/᩸ܰۢ;->ᩳ(Ll/᩸ܰۢ;)I

    move-result v10

    invoke-static {v3, v10, v6}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 118
    invoke-static {v7}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result v10

    invoke-static {v10}, Ll/᩹ܰۢ;->ۧ(I)Z

    move-result v10

    .line 119
    iget-object v11, v0, Ll/᩹ܰۢ;->ܳ:[I

    if-eqz v9, :cond_9

    iget-boolean v12, v9, Ll/ܶܰۢ;->ܳ:Z

    if-nez v12, :cond_9

    .line 120
    iget v12, v9, Ll/ܶܰۢ;->ᩳ:I

    xor-int/lit8 v13, v10, 0x1

    add-int/2addr v12, v13

    const/16 v13, 0xa

    .line 121
    invoke-virtual {v3, v13}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v13

    .line 122
    iget-object v14, v0, Ll/᩹ܰۢ;->ᩴ:Ljava/lang/String;

    if-ltz v13, :cond_0

    .line 124
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v13, v13, 0x1

    invoke-virtual {v3, v1, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12, v14}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move/from16 v18, v10

    move-object v10, v6

    goto/16 :goto_7

    .line 125
    :cond_0
    invoke-static {v7}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result v1

    const/16 v13, 0x67

    if-eq v1, v13, :cond_9

    invoke-direct {v0, v2}, Ll/᩹ܰۢ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_9

    add-int/lit8 v1, v2, -0x1

    .line 126
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ܰۢ;

    if-eqz v10, :cond_1

    .line 127
    iget-boolean v1, v9, Ll/ܶܰۢ;->֫:Z

    goto :goto_1

    .line 128
    :cond_1
    iget-boolean v13, v9, Ll/ܶܰۢ;->ܽ:Z

    if-eqz v13, :cond_3

    iget v13, v9, Ll/ܶܰۢ;->ܿ:I

    add-int/lit8 v13, v13, 0x1

    if-eq v2, v13, :cond_2

    invoke-static {v1}, Ll/᩸ܰۢ;->ܿ(Ll/᩸ܰۢ;)I

    move-result v1

    const/16 v13, 0x14

    if-ne v1, v13, :cond_3

    :cond_2
    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_8

    if-nez v10, :cond_9

    .line 129
    iget v1, v0, Ll/᩹ܰۢ;->ܽ:I

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v13

    add-int/2addr v13, v1

    add-int/lit8 v1, v2, 0x1

    move v15, v2

    move-object/from16 v16, v3

    .line 168
    :goto_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_7

    .line 169
    invoke-virtual {v5}, Ll/ۖܰۢ;->֫()V

    .line 170
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸ܰۢ;

    move-object/from16 v17, v5

    .line 171
    aget v5, v11, v2

    move/from16 v18, v10

    invoke-static {v3}, Ll/᩸ܰۢ;->ۧ(Ll/᩸ܰۢ;)I

    move-result v10

    if-lt v5, v10, :cond_6

    aget-object v5, v8, v1

    aget-object v10, v8, v2

    if-ne v5, v10, :cond_4

    invoke-direct {v0, v1}, Ll/᩹ܰۢ;->֫(I)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_3

    .line 174
    :cond_4
    invoke-static {v3}, Ll/᩸ܰۢ;->ۧ(Ll/᩸ܰۢ;)I

    move-result v3

    move-object v10, v6

    int-to-long v5, v3

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸ܰۢ;

    invoke-static {v3}, Ll/᩸ܰۢ;->ᩳ(Ll/᩸ܰۢ;)I

    move-result v3

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    int-to-long v7, v3

    sub-long/2addr v5, v7

    const/16 v3, 0x78

    int-to-long v7, v3

    const-wide/16 v21, 0x2

    mul-long v7, v7, v21

    cmp-long v3, v5, v7

    if-lez v3, :cond_5

    const/4 v1, 0x0

    goto :goto_5

    :cond_5
    add-int/lit8 v3, v1, 0x1

    move v15, v1

    move v1, v3

    move-object v6, v10

    move-object/from16 v5, v17

    move/from16 v10, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v20

    goto :goto_2

    :cond_6
    :goto_3
    move-object v10, v6

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    goto :goto_4

    :cond_7
    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move/from16 v18, v10

    move-object v10, v6

    .line 176
    :goto_4
    invoke-direct {v0, v2, v15, v13}, Ll/᩹ܰۢ;->֫(III)Z

    move-result v1

    :goto_5
    if-nez v1, :cond_a

    goto :goto_6

    :cond_8
    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move/from16 v18, v10

    move-object v10, v6

    .line 130
    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Ll/᩹ܰۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12, v14}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v1, 0x1

    .line 131
    iput-boolean v1, v9, Ll/ܶܰۢ;->֫:Z

    goto :goto_7

    :cond_9
    move-object/from16 v16, v3

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move/from16 v18, v10

    move-object v10, v6

    :cond_a
    move-object/from16 v3, v16

    .line 135
    :goto_7
    invoke-direct {v0, v3}, Ll/᩹ܰۢ;->֫(Ljava/lang/CharSequence;)V

    .line 136
    iget-object v1, v0, Ll/᩹ܰۢ;->᩻:[Ll/ܶܰۢ;

    aget-object v1, v1, v2

    if-eqz v1, :cond_d

    .line 138
    iget-boolean v3, v1, Ll/ܶܰۢ;->ܳ:Z

    if-eqz v9, :cond_b

    iget-boolean v5, v9, Ll/ܶܰۢ;->ܳ:Z

    if-eqz v5, :cond_b

    const/4 v5, 0x1

    goto :goto_8

    :cond_b
    const/4 v5, 0x0

    :goto_8
    or-int/2addr v3, v5

    iput-boolean v3, v1, Ll/ܶܰۢ;->ܳ:Z

    .line 139
    iget v3, v0, Ll/᩹ܰۢ;->ᩳ:I

    iget v5, v0, Ll/᩹ܰۢ;->ۘ:I

    div-int/2addr v3, v5

    iput v3, v1, Ll/ܶܰۢ;->ᩳ:I

    .line 140
    iget v3, v1, Ll/ܶܰۢ;->ۧ:I

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸ܰۢ;

    invoke-static {v3}, Ll/᩸ܰۢ;->ۧ(Ll/᩸ܰۢ;)I

    move-result v3

    .line 142
    iget-boolean v4, v1, Ll/ܶܰۢ;->ܳ:Z

    if-nez v4, :cond_c

    iget v4, v1, Ll/ܶܰۢ;->ۧ:I

    add-int/lit8 v5, v2, 0x1

    if-le v4, v5, :cond_c

    aget v5, v11, v2

    if-lt v5, v3, :cond_c

    iget-object v3, v0, Ll/᩹ܰۢ;->ܺ:[I

    aget v3, v3, v4

    iget v4, v0, Ll/᩹ܰۢ;->ܽ:I

    .line 143
    invoke-direct {v0, v2, v3, v4}, Ll/᩹ܰۢ;->֫(III)Z

    move-result v3

    if-nez v3, :cond_c

    const/4 v3, 0x1

    goto :goto_9

    :cond_c
    const/4 v3, 0x0

    :goto_9
    iput-boolean v3, v1, Ll/ܶܰۢ;->ܽ:Z

    .line 145
    :cond_d
    new-instance v1, Ll/۬۬ۡ;

    invoke-static/range {v19 .. v19}, Ll/᩸ܰۢ;->ᩳ(Ll/᩸ܰۢ;)I

    move-result v3

    invoke-static/range {v19 .. v19}, Ll/᩸ܰۢ;->ۧ(Ll/᩸ܰۢ;)I

    move-result v4

    invoke-direct {v1, v3, v4, v10}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    invoke-direct {v0, v1}, Ll/᩹ܰۢ;->֫(Ljava/lang/CharSequence;)V

    if-eqz v18, :cond_e

    .line 146
    iget-boolean v1, v9, Ll/ܶܰۢ;->֫:Z

    if-eqz v1, :cond_e

    iget v1, v9, Ll/ܶܰۢ;->ܿ:I

    aget-object v1, v20, v1

    if-eqz v1, :cond_e

    const/4 v3, 0x1

    .line 147
    iput-boolean v3, v1, Ll/ܶܰۢ;->֫:Z

    .line 149
    :cond_e
    invoke-static/range {v19 .. v19}, Ll/᩸ܰۢ;->ۧ(Ll/᩸ܰۢ;)I

    move-result v3

    add-int/lit8 v2, v2, 0x1

    const/4 v1, 0x0

    goto/16 :goto_0

    :cond_f
    move-object v10, v6

    .line 151
    new-instance v1, Ll/۬۬ۡ;

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-direct {v1, v3, v2, v10}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    invoke-direct {v0, v1}, Ll/᩹ܰۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
