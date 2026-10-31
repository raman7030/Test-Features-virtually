.class public abstract Ll/۠ۤۢ;
.super Ll/᩻ܳ֡;
.source "F6OU"


# instance fields
.field public ֡:I

.field public ۚ:I

.field public ᩵:I


# direct methods
.method public constructor <init>(Ll/᩷ۤۢ;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Ll/᩻ܳ֡;-><init>(Ll/᩺ܿ֡;)V

    const/4 p1, 0x1

    .line 12
    iput p1, p0, Ll/۠ۤۢ;->֡:I

    return-void
.end method

.method private ֫(Ljava/lang/String;)V
    .locals 4

    .line 41
    new-instance v0, Ll/֡ۤۢ;

    sget-object v1, Ll/᩵ۤۢ;->ۙ:Ll/᩵ۤۢ;

    iget v2, p0, Ll/᩻ܳ֡;->ۘ:I

    iget v3, p0, Ll/᩻ܳ֡;->ۖ:I

    invoke-direct {v0, v1, v2, v3, p1}, Ll/֡ۤۢ;-><init>(Ll/᩵ۤۢ;IILjava/lang/String;)V

    throw v0
.end method

.method public static ᩳ(I)I
    .locals 2

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x57

    return p0

    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    add-int/lit8 p0, p0, -0x37

    return p0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method private ᩴ()V
    .locals 2

    .line 38
    invoke-virtual {p0}, Ll/ᩴܳ֡;->ܿ()Ll/ۨܳ֡;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻֡;

    iget-object v1, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    invoke-virtual {v0, v1}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;)V

    return-void
.end method


# virtual methods
.method public final nextToken()Ll/֡ܳ֡;
    .locals 7

    .line 280
    iget-object v0, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    invoke-interface {v0}, Ll/ܳܳ֡;->index()I

    move-result v1

    .line 18
    invoke-super {p0}, Ll/᩻ܳ֡;->nextToken()Ll/֡ܳ֡;

    move-result-object v2

    .line 280
    :goto_0
    invoke-interface {v0}, Ll/ܳܳ֡;->index()I

    move-result v3

    const/4 v4, 0x1

    if-ge v1, v3, :cond_3

    invoke-interface {v0}, Ll/ܳܳ֡;->index()I

    move-result v3

    sub-int v3, v1, v3

    .line 21
    invoke-interface {v0, v3}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v3

    const/16 v5, 0xd

    const/4 v6, 0x0

    if-eq v3, v5, :cond_1

    const/16 v5, 0xa

    if-ne v3, v5, :cond_0

    goto :goto_1

    .line 26
    :cond_0
    iget v3, p0, Ll/۠ۤۢ;->᩵:I

    add-int/2addr v3, v4

    iput v3, p0, Ll/۠ۤۢ;->᩵:I

    iput v6, p0, Ll/۠ۤۢ;->ۚ:I

    goto :goto_3

    .line 23
    :cond_1
    :goto_1
    iget v5, p0, Ll/۠ۤۢ;->ۚ:I

    if-eqz v5, :cond_2

    if-eq v5, v3, :cond_2

    iput v6, p0, Ll/۠ۤۢ;->ۚ:I

    goto :goto_2

    .line 24
    :cond_2
    iget v5, p0, Ll/۠ۤۢ;->֡:I

    add-int/2addr v5, v4

    iput v5, p0, Ll/۠ۤۢ;->֡:I

    iput v3, p0, Ll/۠ۤۢ;->ۚ:I

    .line 25
    :goto_2
    iput v6, p0, Ll/۠ۤۢ;->᩵:I

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 28
    :cond_3
    invoke-virtual {p0}, Ll/ᩴܳ֡;->ܿ()Ll/ۨܳ֡;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻֡;

    iget v3, p0, Ll/۠ۤۢ;->֡:I

    invoke-virtual {v1, v3}, Ll/ۘ᩻֡;->ۧ(I)V

    .line 29
    invoke-virtual {p0}, Ll/ᩴܳ֡;->ܿ()Ll/ۨܳ֡;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻֡;

    iget v3, p0, Ll/۠ۤۢ;->᩵:I

    invoke-virtual {v1, v3}, Ll/ۘ᩻֡;->֫(I)V

    .line 30
    invoke-interface {v2}, Ll/֡ܳ֡;->getType()I

    move-result v1

    invoke-interface {v0, v4}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    const/16 v3, 0x3c

    if-eq v1, v3, :cond_4

    const/16 v3, 0x3d

    if-eq v1, v3, :cond_4

    const/16 v3, 0x3e

    if-eq v1, v3, :cond_4

    const/16 v3, 0x3f

    if-ne v1, v3, :cond_6

    :cond_4
    const/16 v1, 0x2e

    if-eq v0, v1, :cond_7

    const/16 v1, 0x5f

    if-eq v0, v1, :cond_7

    const/16 v1, 0x61

    if-lt v0, v1, :cond_5

    const/16 v1, 0x7a

    if-le v0, v1, :cond_7

    :cond_5
    const/16 v1, 0x41

    if-lt v0, v1, :cond_6

    const/16 v1, 0x5a

    if-le v0, v1, :cond_7

    :cond_6
    return-object v2

    :cond_7
    const-string v0, "Malformed number"

    .line 33
    invoke-direct {p0, v0}, Ll/۠ۤۢ;->֫(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(Z)V
    .locals 7

    .line 280
    iget-object v0, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    invoke-interface {v0}, Ll/ܳܳ֡;->index()I

    move-result v1

    .line 60
    iget v2, p0, Ll/᩻ܳ֡;->ܺ:I

    sub-int/2addr v1, v2

    if-eqz p1, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    sub-int/2addr v1, v2

    :cond_1
    :goto_1
    const/4 v2, 0x1

    .line 61
    invoke-interface {v0, v2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_4

    .line 62
    invoke-interface {v0, v2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v3

    const/16 v4, 0x5d

    if-eq v3, v4, :cond_2

    .line 63
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    goto :goto_1

    .line 66
    :cond_2
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    const/4 v3, 0x0

    .line 68
    :goto_2
    invoke-interface {v0, v2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v5

    const/16 v6, 0x3d

    if-ne v5, v6, :cond_3

    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    if-ne v3, v1, :cond_1

    .line 69
    invoke-interface {v0, v2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    if-ne v2, v4, :cond_1

    .line 70
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    return-void

    :cond_4
    if-eqz p1, :cond_5

    const-string p1, "Unterminated long comment"

    goto :goto_3

    :cond_5
    const-string p1, "Unterminated long string"

    .line 74
    :goto_3
    invoke-direct {p0, p1}, Ll/۠ۤۢ;->֫(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ۘ()V
    .locals 6

    .line 47
    iget-object v0, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    const/16 v3, 0x5b

    if-ne v2, v3, :cond_2

    const/4 v2, 0x1

    :goto_0
    add-int/2addr v2, v1

    .line 48
    invoke-interface {v0, v2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v4

    const/16 v5, 0x3d

    if-ne v4, v5, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    invoke-interface {v0, v2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v4

    if-ne v4, v3, :cond_2

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v2, :cond_1

    .line 50
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p0, v1}, Ll/۠ۤۢ;->֫(Z)V

    return-void

    .line 55
    :cond_2
    :goto_2
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_3

    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    const/16 v3, 0xa

    if-eq v2, v3, :cond_3

    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    const/16 v3, 0xd

    if-eq v2, v3, :cond_3

    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final ܽ(I)V
    .locals 11

    .line 79
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-eq v2, v4, :cond_14

    const/16 v5, 0xd

    if-eq v2, v5, :cond_14

    const/16 v6, 0xa

    if-eq v2, v6, :cond_14

    .line 81
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    if-ne v2, p1, :cond_1

    return-void

    :cond_1
    const/16 v7, 0x5c

    if-eq v2, v7, :cond_2

    goto :goto_0

    .line 84
    :cond_2
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    if-eq v2, v4, :cond_13

    .line 86
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    const/16 v4, 0x7a

    if-ne v2, v4, :cond_4

    .line 88
    :goto_1
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    const/16 v3, 0x20

    if-eq v2, v3, :cond_3

    const/16 v3, 0x9

    if-eq v2, v3, :cond_3

    if-eq v2, v5, :cond_3

    if-eq v2, v6, :cond_3

    const/16 v3, 0xc

    if-eq v2, v3, :cond_3

    const/16 v3, 0xb

    if-ne v2, v3, :cond_0

    :cond_3
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    goto :goto_1

    :cond_4
    if-eq v2, v5, :cond_11

    if-ne v2, v6, :cond_5

    goto/16 :goto_5

    :cond_5
    const/16 v4, 0x78

    const/4 v5, 0x0

    if-ne v2, v4, :cond_7

    :goto_2
    const/4 v2, 0x2

    if-ge v5, v2, :cond_0

    .line 93
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    invoke-static {v2}, Ll/۠ۤۢ;->ᩳ(I)I

    move-result v2

    if-ltz v2, :cond_6

    .line 94
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_6
    const-string p1, "Invalid hexadecimal escape"

    .line 93
    invoke-direct {p0, p1}, Ll/۠ۤۢ;->֫(Ljava/lang/String;)V

    throw v3

    :cond_7
    const/16 v4, 0x75

    if-ne v2, v4, :cond_c

    .line 97
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    const/16 v4, 0x7b

    const-string v6, "Invalid Unicode escape"

    if-ne v2, v4, :cond_b

    .line 98
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    const-wide/16 v7, 0x0

    .line 101
    :goto_3
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    invoke-static {v2}, Ll/۠ۤۢ;->ᩳ(I)I

    move-result v2

    if-ltz v2, :cond_9

    const-wide/16 v9, 0x10

    mul-long v7, v7, v9

    .line 102
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v2

    invoke-static {v2}, Ll/۠ۤۢ;->ᩳ(I)I

    move-result v2

    int-to-long v9, v2

    add-long/2addr v7, v9

    const-wide/32 v9, 0x7fffffff

    cmp-long v2, v7, v9

    if-gtz v2, :cond_8

    .line 104
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_8
    const-string p1, "Unicode escape out of range"

    .line 103
    invoke-direct {p0, p1}, Ll/۠ۤۢ;->֫(Ljava/lang/String;)V

    throw v3

    :cond_9
    if-eqz v5, :cond_a

    .line 107
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    const/16 v1, 0x7d

    if-ne v0, v1, :cond_a

    .line 108
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    goto/16 :goto_0

    .line 107
    :cond_a
    invoke-direct {p0, v6}, Ll/۠ۤۢ;->֫(Ljava/lang/String;)V

    throw v3

    .line 97
    :cond_b
    invoke-direct {p0, v6}, Ll/۠ۤۢ;->֫(Ljava/lang/String;)V

    throw v3

    :cond_c
    const/16 v4, 0x30

    if-lt v2, v4, :cond_f

    const/16 v5, 0x39

    if-gt v2, v5, :cond_f

    add-int/lit8 v2, v2, -0x30

    const/4 v6, 0x1

    :goto_4
    const/4 v7, 0x3

    if-ge v6, v7, :cond_d

    .line 111
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v7

    if-lt v7, v4, :cond_d

    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v7

    if-gt v7, v5, :cond_d

    mul-int/lit8 v2, v2, 0xa

    .line 112
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v7

    add-int/2addr v7, v2

    add-int/lit8 v2, v7, -0x30

    .line 113
    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_d
    const/16 v0, 0xff

    if-gt v2, v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const-string p1, "Decimal escape out of range"

    .line 115
    invoke-direct {p0, p1}, Ll/۠ۤۢ;->֫(Ljava/lang/String;)V

    throw v3

    :cond_f
    const-string v0, "abfnrtv\"\'\\"

    .line 116
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const-string p1, "Invalid string escape"

    .line 117
    invoke-direct {p0, p1}, Ll/۠ۤۢ;->֫(Ljava/lang/String;)V

    throw v3

    .line 90
    :cond_11
    :goto_5
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    if-ne v2, v5, :cond_12

    const/16 v5, 0xa

    :cond_12
    if-ne v0, v5, :cond_0

    invoke-direct {p0}, Ll/۠ۤۢ;->ᩴ()V

    goto/16 :goto_0

    :cond_13
    const-string p1, "Unterminated string escape"

    .line 85
    invoke-direct {p0, p1}, Ll/۠ۤۢ;->֫(Ljava/lang/String;)V

    throw v3

    :cond_14
    const-string p1, "Unterminated string"

    .line 80
    invoke-direct {p0, p1}, Ll/۠ۤۢ;->֫(Ljava/lang/String;)V

    throw v3
.end method
