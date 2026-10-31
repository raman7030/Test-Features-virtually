.class public final Ll/۫ۘܿ;
.super Ljava/lang/Object;
.source "76ZW"


# instance fields
.field public final ֫:Ll/᩸ۘܿ;

.field public final ۜ:[I

.field public final ۧ:[Ll/᩶ۘܿ;

.field public final ܳ:[I

.field public final ܽ:[I

.field public final ܿ:[I

.field public final ᩳ:[I

.field public final ᩷:[I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ۗۘܿ;Ll/᩸ۘܿ;)V
    .locals 13

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-static {p1}, Ll/ۗۘܿ;->ᩳ(Ll/ۗۘܿ;)I

    move-result v0

    iput v0, p0, Ll/۫ۘܿ;->᩻:I

    .line 26
    invoke-static {p1}, Ll/ۗۘܿ;->ۧ(Ll/ۗۘܿ;)[I

    move-result-object v0

    invoke-static {p1}, Ll/ۗۘܿ;->ܽ(Ll/ۗۘܿ;)I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/۫ۘܿ;->ܿ:[I

    .line 27
    invoke-static {p1}, Ll/ۗۘܿ;->֫(Ll/ۗۘܿ;)[Ll/᩶ۘܿ;

    move-result-object v1

    invoke-static {p1}, Ll/ۗۘܿ;->ܽ(Ll/ۗۘܿ;)I

    move-result p1

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/᩶ۘܿ;

    iput-object p1, p0, Ll/۫ۘܿ;->ۧ:[Ll/᩶ۘܿ;

    .line 28
    iput-object p2, p0, Ll/۫ۘܿ;->֫:Ll/᩸ۘܿ;

    .line 29
    array-length p1, v0

    add-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    .line 31
    array-length p2, v0

    const/4 v0, 0x0

    aput v0, p1, p2

    .line 32
    invoke-static {p1}, Ljava/util/Arrays;->sort([I)V

    .line 34
    array-length p2, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, p2, :cond_2

    aget v3, p1, v1

    if-eqz v2, :cond_0

    add-int/lit8 v4, v2, -0x1

    .line 35
    aget v4, p1, v4

    if-eq v4, v3, :cond_1

    :cond_0
    add-int/lit8 v4, v2, 0x1

    .line 36
    aput v3, p1, v2

    move v2, v4

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    iput-object p1, p0, Ll/۫ۘܿ;->ܽ:[I

    .line 44
    iget-object p1, p0, Ll/۫ۘܿ;->ۧ:[Ll/᩶ۘܿ;

    array-length p2, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    const/4 v5, -0x1

    if-ge v1, p2, :cond_6

    aget-object v6, p1, v1

    .line 45
    invoke-virtual {v6}, Ll/᩶ۘܿ;->᩷()I

    move-result v7

    if-eq v7, v5, :cond_3

    add-int/lit8 v2, v2, 0x1

    .line 46
    :cond_3
    invoke-virtual {v6}, Ll/᩶ۘܿ;->ᩳ()Z

    move-result v5

    if-eqz v5, :cond_4

    add-int/lit8 v3, v3, 0x1

    .line 47
    :cond_4
    invoke-virtual {v6}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object v5

    sget-object v6, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    if-eq v5, v6, :cond_5

    add-int/lit8 v4, v4, 0x1

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 49
    :cond_6
    new-array p1, v2, [J

    .line 50
    new-array p2, v3, [I

    iput-object p2, p0, Ll/۫ۘܿ;->ᩳ:[I

    .line 51
    new-array p2, v4, [I

    iput-object p2, p0, Ll/۫ۘܿ;->ۜ:[I

    const/4 p2, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 53
    :goto_2
    iget-object v4, p0, Ll/۫ۘܿ;->ۧ:[Ll/᩶ۘܿ;

    array-length v6, v4

    if-ge p2, v6, :cond_a

    .line 54
    aget-object v4, v4, p2

    .line 55
    invoke-virtual {v4}, Ll/᩶ۘܿ;->᩷()I

    move-result v6

    if-eq v6, v5, :cond_7

    add-int/lit8 v6, v1, 0x1

    .line 81
    iget-object v7, p0, Ll/۫ۘܿ;->ܿ:[I

    aget v7, v7, p2

    iget-object v8, p0, Ll/۫ۘܿ;->ۧ:[Ll/᩶ۘܿ;

    aget-object v8, v8, p2

    invoke-virtual {v8}, Ll/᩶ۘܿ;->᩷()I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    int-to-long v7, v7

    const/16 v9, 0x20

    shl-long/2addr v7, v9

    int-to-long v9, p2

    const-wide v11, 0xffffffffL

    and-long/2addr v9, v11

    or-long/2addr v7, v9

    .line 56
    aput-wide v7, p1, v1

    move v1, v6

    .line 58
    :cond_7
    invoke-virtual {v4}, Ll/᩶ۘܿ;->ᩳ()Z

    move-result v6

    if-eqz v6, :cond_8

    iget-object v6, p0, Ll/۫ۘܿ;->ᩳ:[I

    add-int/lit8 v7, v2, 0x1

    aput p2, v6, v2

    move v2, v7

    .line 59
    :cond_8
    invoke-virtual {v4}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object v4

    sget-object v6, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    if-eq v4, v6, :cond_9

    iget-object v4, p0, Ll/۫ۘܿ;->ۜ:[I

    add-int/lit8 v6, v3, 0x1

    aput p2, v4, v3

    move v3, v6

    :cond_9
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 61
    :cond_a
    invoke-static {p1}, Ljava/util/Arrays;->sort([J)V

    .line 62
    new-array p2, v1, [I

    iput-object p2, p0, Ll/۫ۘܿ;->᩷:[I

    .line 63
    new-array p2, v1, [I

    iput-object p2, p0, Ll/۫ۘܿ;->ܳ:[I

    const/4 p2, 0x0

    :goto_3
    if-ge p2, v1, :cond_b

    .line 64
    iget-object v2, p0, Ll/۫ۘܿ;->᩷:[I

    aget-wide v3, p1, p2

    long-to-int v4, v3

    aput v4, v2, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    .line 65
    :cond_b
    invoke-direct {p0, v0, v1}, Ll/۫ۘܿ;->֫(II)I

    return-void
.end method

.method private ֫(II)I
    .locals 4

    if-ne p1, p2, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    add-int v0, p1, p2

    ushr-int/lit8 v0, v0, 0x1

    .line 72
    iget-object v1, p0, Ll/۫ۘܿ;->᩷:[I

    aget v1, v1, v0

    .line 86
    iget-object v2, p0, Ll/۫ۘܿ;->ܿ:[I

    aget v2, v2, v1

    iget-object v3, p0, Ll/۫ۘܿ;->ۧ:[Ll/᩶ۘܿ;

    aget-object v1, v3, v1

    invoke-virtual {v1}, Ll/᩶ۘܿ;->ۜ()I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 73
    invoke-direct {p0, p1, v0}, Ll/۫ۘܿ;->֫(II)I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 v1, v0, 0x1

    .line 74
    invoke-direct {p0, v1, p2}, Ll/۫ۘܿ;->֫(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 75
    iget-object p2, p0, Ll/۫ۘܿ;->ܳ:[I

    aput p1, p2, v0

    return p1
.end method

.method public static ֫(Ll/۫ۘܿ;I)I
    .locals 1

    .line 86
    iget-object v0, p0, Ll/۫ۘܿ;->ܿ:[I

    aget v0, v0, p1

    iget-object p0, p0, Ll/۫ۘܿ;->ۧ:[Ll/᩶ۘܿ;

    aget-object p0, p0, p1

    invoke-virtual {p0}, Ll/᩶ۘܿ;->ۜ()I

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/۫ۘܿ;)Ll/᩸ۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۘܿ;->֫:Ll/᩸ۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ۜ(Ll/۫ۘܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۘܿ;->᩷:[I

    return-object p0
.end method

.method public static ۧ(Ll/۫ۘܿ;I)I
    .locals 1

    .line 81
    iget-object v0, p0, Ll/۫ۘܿ;->ܿ:[I

    aget v0, v0, p1

    iget-object p0, p0, Ll/۫ۘܿ;->ۧ:[Ll/᩶ۘܿ;

    aget-object p0, p0, p1

    invoke-virtual {p0}, Ll/᩶ۘܿ;->᩷()I

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/۫ۘܿ;)[Ll/᩶ۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۘܿ;->ۧ:[Ll/᩶ۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/۫ۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۫ۘܿ;->᩻:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/۫ۘܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۘܿ;->ᩳ:[I

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/۫ۘܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۘܿ;->ܳ:[I

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/۫ۘܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۘܿ;->ܿ:[I

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/۫ۘܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۘܿ;->ۜ:[I

    return-object p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 94
    iget-object v0, p0, Ll/۫ۘܿ;->ۧ:[Ll/᩶ۘܿ;

    array-length v0, v0

    return v0
.end method

.method public final ֫(I)I
    .locals 2

    .line 122
    iget v0, p0, Ll/۫ۘܿ;->᩻:I

    invoke-static {p1, p1, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 123
    iget-object v0, p0, Ll/۫ۘܿ;->ܽ:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result p1

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    neg-int p1, p1

    add-int/lit8 p1, p1, -0x1

    .line 125
    :goto_0
    array-length v1, v0

    if-ge p1, v1, :cond_1

    aget p1, v0, p1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 90
    iget v0, p0, Ll/۫ۘܿ;->᩻:I

    return v0
.end method

.method public final ۧ(I)Ll/᩶ۘܿ;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/۫ۘܿ;->ۧ:[Ll/᩶ۘܿ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ܽ(I)I
    .locals 1

    .line 112
    iget v0, p0, Ll/۫ۘܿ;->᩻:I

    invoke-static {p1, p1, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 113
    iget-object v0, p0, Ll/۫ۘܿ;->ܽ:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result p1

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    neg-int p1, p1

    add-int/lit8 p1, p1, -0x2

    .line 114
    :goto_0
    aget p1, v0, p1

    return p1
.end method

.method public final ᩳ(I)I
    .locals 1

    .line 98
    iget-object v0, p0, Ll/۫ۘܿ;->ܿ:[I

    aget p1, v0, p1

    return p1
.end method
