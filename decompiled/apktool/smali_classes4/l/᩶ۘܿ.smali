.class public final Ll/᩶ۘܿ;
.super Ljava/lang/Object;
.source "U707"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:Ll/᩸ۘܿ;

.field public final ܿ:I

.field public final ᩳ:Z

.field public final ᩻:I


# direct methods
.method public constructor <init>(IIIIIZLl/᩸ۘܿ;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput p1, p0, Ll/᩶ۘܿ;->᩻:I

    .line 34
    iput p2, p0, Ll/᩶ۘܿ;->ܳ:I

    .line 35
    iput p3, p0, Ll/᩶ۘܿ;->ܿ:I

    .line 36
    iput p4, p0, Ll/᩶ۘܿ;->ۧ:I

    .line 37
    iput p5, p0, Ll/᩶ۘܿ;->֫:I

    .line 38
    iput-boolean p6, p0, Ll/᩶ۘܿ;->ᩳ:Z

    .line 39
    iput-object p7, p0, Ll/᩶ۘܿ;->ܽ:Ll/᩸ۘܿ;

    return-void
.end method

.method public constructor <init>(Ll/᩹ۘܿ;Ll/᩸ۘܿ;)V
    .locals 8

    .line 25
    invoke-static {p1}, Ll/᩹ۘܿ;->᩻(Ll/᩹ۘܿ;)I

    move-result v1

    invoke-static {p1}, Ll/᩹ۘܿ;->ܳ(Ll/᩹ۘܿ;)I

    move-result v2

    invoke-static {p1}, Ll/᩹ۘܿ;->ܿ(Ll/᩹ۘܿ;)I

    move-result v3

    invoke-static {p1}, Ll/᩹ۘܿ;->ܽ(Ll/᩹ۘܿ;)I

    move-result v4

    invoke-static {p1}, Ll/᩹ۘܿ;->ۧ(Ll/᩹ۘܿ;)I

    move-result v5

    invoke-static {p1}, Ll/᩹ۘܿ;->ᩳ(Ll/᩹ۘܿ;)Z

    move-result v6

    move-object v0, p0

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Ll/᩶ۘܿ;-><init>(IIIIIZLl/᩸ۘܿ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶ۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩶ۘܿ;->֫:I

    return p0
.end method

.method public static ۧ(Ll/ܶۘܿ;I)I
    .locals 2

    .line 194
    sget-object v0, Ll/֨ۘܿ;->᩶:Ll/֨ۘܿ;

    invoke-virtual {p0, p1, v0}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result v0

    .line 195
    sget-object v1, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    invoke-virtual {p0, p1, v1}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result p0

    if-ltz v0, :cond_0

    if-ne v0, p0, :cond_0

    return v0

    .line 197
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Dependency endpoint cannot be remapped uniquely"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ۧ(Ll/᩶ۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩶ۘܿ;->ۧ:I

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/᩶ۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩶ۘܿ;->ܳ:I

    return p0
.end method

.method private ܽ(Ll/ܶۘܿ;)Ll/᩶ۘܿ;
    .locals 13

    .line 167
    iget v0, p0, Ll/᩶ۘܿ;->ܿ:I

    const/4 v1, -0x1

    iget v2, p0, Ll/᩶ۘܿ;->ܳ:I

    if-eq v2, v1, :cond_1

    .line 168
    invoke-static {p1, v2}, Ll/᩶ۘܿ;->ۧ(Ll/ܶۘܿ;I)I

    move-result v3

    .line 169
    invoke-static {p1, v0}, Ll/᩶ۘܿ;->ۧ(Ll/ܶۘܿ;I)I

    move-result v4

    if-le v4, v3, :cond_0

    move v7, v3

    move v8, v4

    goto :goto_0

    .line 171
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid remapped read range"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v7, -0x1

    const/4 v8, -0x1

    .line 176
    :goto_0
    iget v3, p0, Ll/᩶ۘܿ;->֫:I

    iget v4, p0, Ll/᩶ۘܿ;->ۧ:I

    if-eq v4, v1, :cond_3

    .line 177
    invoke-static {p1, v4}, Ll/᩶ۘܿ;->ۧ(Ll/ܶۘܿ;I)I

    move-result v1

    .line 178
    invoke-static {p1, v3}, Ll/᩶ۘܿ;->ۧ(Ll/ܶۘܿ;I)I

    move-result v5

    if-lt v5, v1, :cond_2

    move v9, v1

    move v10, v5

    goto :goto_1

    .line 180
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid remapped boundary range"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 v5, -0x1

    const/4 v9, -0x1

    const/4 v10, -0x1

    .line 183
    :goto_1
    invoke-virtual {p1}, Ll/ܶۘܿ;->ᩳ()I

    move-result v1

    iget v5, p0, Ll/᩶ۘܿ;->᩻:I

    if-ne v1, v5, :cond_4

    if-ne v7, v2, :cond_4

    if-ne v8, v0, :cond_4

    if-ne v9, v4, :cond_4

    if-ne v10, v3, :cond_4

    return-object p0

    .line 188
    :cond_4
    new-instance v0, Ll/᩶ۘܿ;

    invoke-virtual {p1}, Ll/ܶۘܿ;->ᩳ()I

    move-result v6

    iget-boolean v11, p0, Ll/᩶ۘܿ;->ᩳ:Z

    sget-object v12, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    move-object v5, v0

    invoke-direct/range {v5 .. v12}, Ll/᩶ۘܿ;-><init>(IIIIIZLl/᩸ۘܿ;)V

    return-object v0
.end method

.method public static bridge synthetic ܽ(Ll/᩶ۘܿ;)Ll/᩸ۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ۘܿ;->ܽ:Ll/᩸ۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/᩶ۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩶ۘܿ;->ܿ:I

    return p0
.end method

.method private ᩳ(Ll/ܶۘܿ;)V
    .locals 1

    .line 136
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܿ()I

    move-result p1

    iget v0, p0, Ll/᩶ۘܿ;->᩻:I

    if-ne p1, v0, :cond_1

    .line 139
    iget-object p1, p0, Ll/᩶ۘܿ;->ܽ:Ll/᩸ۘܿ;

    sget-object v0, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    if-ne p1, v0, :cond_0

    return-void

    .line 140
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only complete dependencies can be remapped"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 137
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Dependency and change set lengths differ"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ᩳ(Ll/᩶ۘܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩶ۘܿ;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/᩶ۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩶ۘܿ;->᩻:I

    return p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 59
    iget v0, p0, Ll/᩶ۘܿ;->֫:I

    return v0
.end method

.method public final ֫(Ll/ܶۘܿ;I)Ll/᩶ۘܿ;
    .locals 9

    const-string v0, "changes"

    .line 113
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 114
    invoke-direct {p0, p1}, Ll/᩶ۘܿ;->ᩳ(Ll/ܶۘܿ;)V

    .line 115
    iget v0, p0, Ll/᩶ۘܿ;->᩻:I

    invoke-static {p2, p2, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 116
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_1

    .line 117
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܳ()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 118
    invoke-virtual {p1, v1}, Ll/ܶۘܿ;->ᩳ(I)I

    move-result v2

    if-eq v2, v0, :cond_0

    .line 119
    invoke-virtual {p1, v1}, Ll/ܶۘܿ;->ᩳ(I)I

    move-result v1

    if-lt p2, v1, :cond_0

    goto :goto_0

    .line 120
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Dependency is not in a stable suffix"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 146
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘܿ;->᩷()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    goto :goto_2

    .line 148
    :cond_2
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ۜ()I

    move-result v2

    .line 149
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 150
    invoke-static {p2, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 152
    invoke-virtual {p1, v1}, Ll/ܶۘܿ;->֫(I)I

    move-result v3

    .line 153
    :goto_1
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܳ()I

    move-result v4

    if-ge v3, v4, :cond_5

    invoke-virtual {p1, v3}, Ll/ܶۘܿ;->ܿ(I)I

    move-result v4

    if-gt v4, v2, :cond_5

    .line 154
    invoke-virtual {p1, v3}, Ll/ܶۘܿ;->ܿ(I)I

    move-result v4

    .line 155
    invoke-virtual {p1, v3}, Ll/ܶۘܿ;->ᩳ(I)I

    move-result v5

    .line 156
    invoke-virtual {p0, v4, v5}, Ll/᩶ۘܿ;->֫(II)Z

    move-result v6

    if-nez v6, :cond_4

    sub-int v6, v5, v4

    .line 157
    invoke-virtual {p1, v3}, Ll/ܶۘܿ;->ۧ(I)I

    move-result v7

    invoke-virtual {p1, v3}, Ll/ܶۘܿ;->ܽ(I)I

    move-result v8

    sub-int/2addr v7, v8

    if-eq v6, v7, :cond_3

    if-gt v1, v5, :cond_3

    if-le v4, v2, :cond_4

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 124
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Affected suffix dependency cannot be remapped"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 126
    :cond_5
    :goto_2
    sget-object v1, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    invoke-virtual {p1, p2, v1}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result v1

    .line 127
    invoke-virtual {p1}, Ll/ܶۘܿ;->ᩳ()I

    move-result v2

    int-to-long v2, v2

    int-to-long v4, v0

    sub-long/2addr v2, v4

    if-ltz v1, :cond_6

    int-to-long v0, v1

    int-to-long v4, p2

    sub-long/2addr v0, v4

    cmp-long p2, v0, v2

    if-nez p2, :cond_6

    .line 131
    invoke-direct {p0, p1}, Ll/᩶ۘܿ;->ܽ(Ll/ܶۘܿ;)Ll/᩶ۘܿ;

    move-result-object p1

    return-object p1

    .line 129
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Suffix replay entry does not move with EOF"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(II)Z
    .locals 4

    const/4 v0, 0x1

    .line 204
    iget v1, p0, Ll/᩶ۘܿ;->ܳ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 205
    iget v3, p0, Ll/᩶ۘܿ;->ܿ:I

    if-ne p1, p2, :cond_0

    if-gt v1, p1, :cond_1

    if-gt p1, v3, :cond_1

    return v0

    :cond_0
    if-ge p1, v3, :cond_1

    if-ge v1, p2, :cond_1

    return v0

    .line 213
    :cond_1
    iget v1, p0, Ll/᩶ۘܿ;->ۧ:I

    if-eq v1, v2, :cond_2

    iget v2, p0, Ll/᩶ۘܿ;->֫:I

    if-gt p1, v2, :cond_2

    if-gt v1, p2, :cond_2

    return v0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ܶۘܿ;)Z
    .locals 6

    .line 75
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܿ()I

    move-result v0

    iget v1, p0, Ll/᩶ۘܿ;->᩻:I

    if-ne v0, v1, :cond_6

    .line 79
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܽ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 80
    :cond_0
    iget-object v0, p0, Ll/᩶ۘܿ;->ܽ:Ll/᩸ۘܿ;

    sget-object v2, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    const/4 v3, 0x1

    if-eq v0, v2, :cond_1

    return v3

    .line 81
    :cond_1
    iget-boolean v0, p0, Ll/᩶ۘܿ;->ᩳ:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll/ܶۘܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    return v3

    .line 82
    :cond_2
    invoke-virtual {p0}, Ll/᩶ۘܿ;->᩷()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_3

    return v1

    .line 84
    :cond_3
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ۜ()I

    move-result v2

    .line 86
    invoke-virtual {p1, v0}, Ll/ܶۘܿ;->֫(I)I

    move-result v0

    .line 87
    :goto_0
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܳ()I

    move-result v4

    if-ge v0, v4, :cond_5

    invoke-virtual {p1, v0}, Ll/ܶۘܿ;->ܿ(I)I

    move-result v4

    if-gt v4, v2, :cond_5

    .line 88
    invoke-virtual {p1, v0}, Ll/ܶۘܿ;->ܿ(I)I

    move-result v4

    invoke-virtual {p1, v0}, Ll/ܶۘܿ;->ᩳ(I)I

    move-result v5

    invoke-virtual {p0, v4, v5}, Ll/᩶ۘܿ;->֫(II)Z

    move-result v4

    if-eqz v4, :cond_4

    return v3

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    return v1

    .line 77
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Dependency and change set lengths differ"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۜ()I
    .locals 2

    .line 224
    iget v0, p0, Ll/᩶ۘܿ;->ܿ:I

    iget v1, p0, Ll/᩶ۘܿ;->֫:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 55
    iget v0, p0, Ll/᩶ۘܿ;->ۧ:I

    return v0
.end method

.method public final ۧ(Ll/ܶۘܿ;)Ll/᩶ۘܿ;
    .locals 1

    const-string v0, "changes"

    .line 100
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 101
    invoke-direct {p0, p1}, Ll/᩶ۘܿ;->ᩳ(Ll/ܶۘܿ;)V

    .line 102
    invoke-virtual {p0, p1}, Ll/᩶ۘܿ;->֫(Ll/ܶۘܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    invoke-direct {p0, p1}, Ll/᩶ۘܿ;->ܽ(Ll/ܶۘܿ;)Ll/᩶ۘܿ;

    move-result-object p1

    return-object p1

    .line 103
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Affected dependency cannot be remapped"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ()I
    .locals 1

    .line 47
    iget v0, p0, Ll/᩶ۘܿ;->ܳ:I

    return v0
.end method

.method public final ܽ()Ll/᩸ۘܿ;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/᩶ۘܿ;->ܽ:Ll/᩸ۘܿ;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 51
    iget v0, p0, Ll/᩶ۘܿ;->ܿ:I

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 63
    iget-boolean v0, p0, Ll/᩶ۘܿ;->ᩳ:Z

    return v0
.end method

.method public final ᩷()I
    .locals 3

    .line 218
    iget v0, p0, Ll/᩶ۘܿ;->ۧ:I

    iget v1, p0, Ll/᩶ۘܿ;->ܳ:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    if-ne v0, v2, :cond_1

    return v1

    .line 219
    :cond_1
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 43
    iget v0, p0, Ll/᩶ۘܿ;->᩻:I

    return v0
.end method
