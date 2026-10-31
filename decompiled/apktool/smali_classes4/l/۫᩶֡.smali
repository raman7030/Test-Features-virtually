.class public Ll/۫᩶֡;
.super Ll/ܽۙ֡;
.source "M5CF"


# instance fields
.field public final ۙ:[Ll/ܽۙ֡;

.field public final ᩶:[Ll/ۨۙ֡;

.field public final ᩸:Ll/᩺ۙ֡;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;)V
    .locals 4

    .line 56
    invoke-direct {p0}, Ll/ܽۙ֡;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput v0, p0, Ll/۫᩶֡;->᩹:I

    .line 57
    iget-object v1, p1, Ll/ۗ᩶֡;->֡:Ll/֡ۙ֡;

    invoke-virtual {p2}, Ll/ۧۗ֡;->ܳ()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object v1

    check-cast v1, Ll/᩺ۙ֡;

    iput-object v1, p0, Ll/۫᩶֡;->᩸:Ll/᩺ۙ֡;

    .line 58
    invoke-virtual {p2}, Ll/ۧۗ֡;->ܳ()I

    move-result v1

    new-array v2, v1, [Ll/ۨۙ֡;

    iput-object v2, p0, Ll/۫᩶֡;->᩶:[Ll/ۨۙ֡;

    .line 59
    new-array v1, v1, [Ll/ܽۙ֡;

    iput-object v1, p0, Ll/۫᩶֡;->ۙ:[Ll/ܽۙ֡;

    .line 61
    :goto_0
    iget-object v1, p0, Ll/۫᩶֡;->᩶:[Ll/ۨۙ֡;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 62
    iget-object v2, p1, Ll/ۗ᩶֡;->᩵:Ll/֡ۙ֡;

    invoke-virtual {p2}, Ll/ۧۗ֡;->ܳ()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object v2

    check-cast v2, Ll/ۨۙ֡;

    aput-object v2, v1, v0

    .line 63
    iget-object v1, p0, Ll/۫᩶֡;->ۙ:[Ll/ܽۙ֡;

    invoke-static {p1, p2}, Ll/ܽۙ֡;->֫(Ll/ۗ᩶֡;Ll/ۧۗ֡;)Ll/ܽۙ֡;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ll/᩺ۙ֡;[Ll/ۨۙ֡;[Ll/ܽۙ֡;)V
    .locals 1

    .line 76
    invoke-direct {p0}, Ll/ܽۙ֡;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput v0, p0, Ll/۫᩶֡;->᩹:I

    .line 77
    iput-object p1, p0, Ll/۫᩶֡;->᩸:Ll/᩺ۙ֡;

    .line 78
    array-length p1, p2

    array-length v0, p3

    if-ne p1, v0, :cond_0

    .line 81
    iput-object p2, p0, Ll/۫᩶֡;->᩶:[Ll/ۨۙ֡;

    .line 82
    iput-object p3, p0, Ll/۫᩶֡;->ۙ:[Ll/ܽۙ֡;

    return-void

    .line 79
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The names and values parameters must be the same length"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final hashCode()I
    .locals 3

    .line 217
    iget v0, p0, Ll/۫᩶֡;->᩹:I

    if-nez v0, :cond_0

    .line 205
    iget-object v0, p0, Ll/۫᩶֡;->᩸:Ll/᩺ۙ֡;

    invoke-virtual {v0}, Ll/᩺ۙ֡;->hashCode()I

    move-result v0

    iput v0, p0, Ll/۫᩶֡;->᩹:I

    const/4 v0, 0x0

    .line 207
    :goto_0
    iget-object v1, p0, Ll/۫᩶֡;->᩶:[Ll/ۨۙ֡;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 208
    iget v2, p0, Ll/۫᩶֡;->᩹:I

    mul-int/lit8 v2, v2, 0x1f

    aget-object v1, v1, v0

    invoke-virtual {v1}, Ll/ۨۙ֡;->hashCode()I

    move-result v1

    add-int/2addr v1, v2

    iput v1, p0, Ll/۫᩶֡;->᩹:I

    mul-int/lit8 v1, v1, 0x1f

    .line 209
    iget-object v2, p0, Ll/۫᩶֡;->ۙ:[Ll/ܽۙ֡;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, p0, Ll/۫᩶֡;->᩹:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 219
    :cond_0
    iget v0, p0, Ll/۫᩶֡;->᩹:I

    return v0
.end method

.method public ֫(I)I
    .locals 3

    .line 152
    iget-object v0, p0, Ll/۫᩶֡;->᩸:Ll/᩺ۙ֡;

    invoke-virtual {v0}, Ll/ۚۙ֡;->ܿ()I

    move-result v0

    invoke-static {v0}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 153
    iget-object p1, p0, Ll/۫᩶֡;->᩶:[Ll/ۨۙ֡;

    array-length v1, p1

    invoke-static {v1}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result v1

    add-int/2addr v1, v0

    const/4 v0, 0x0

    .line 155
    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_0

    .line 156
    aget-object v2, p1, v0

    invoke-virtual {v2}, Ll/ۚۙ֡;->ܿ()I

    move-result v2

    invoke-static {v2}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result v2

    add-int/2addr v2, v1

    .line 157
    iget-object v1, p0, Ll/۫᩶֡;->ۙ:[Ll/ܽۙ֡;

    aget-object v1, v1, v0

    invoke-virtual {v1, v2}, Ll/ܽۙ֡;->֫(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public ֫(Ll/֫ۗ֡;)V
    .locals 3

    .line 130
    iget-object v0, p0, Ll/۫᩶֡;->᩸:Ll/᩺ۙ֡;

    invoke-virtual {v0}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    .line 131
    invoke-virtual {v0}, Ll/ۚۙ֡;->ܿ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܳ(I)I

    .line 132
    iget-object v0, p0, Ll/۫᩶֡;->᩶:[Ll/ۨۙ֡;

    array-length v1, v0

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 133
    array-length v1, v0

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܳ(I)I

    const/4 v1, 0x0

    .line 135
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_0

    .line 137
    invoke-virtual {p1}, Ll/֫ۗ֡;->ۧ()V

    .line 138
    aget-object v2, v0, v1

    invoke-virtual {v2}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    .line 139
    aget-object v2, v0, v1

    invoke-virtual {v2}, Ll/ۚۙ֡;->ܿ()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܳ(I)I

    .line 141
    invoke-virtual {p1}, Ll/֫ۗ֡;->ۧ()V

    .line 142
    iget-object v2, p0, Ll/۫᩶֡;->ۙ:[Ll/ܽۙ֡;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ll/ܽۙ֡;->֫(Ll/֫ۗ֡;)V

    .line 143
    invoke-virtual {p1}, Ll/֫ۗ֡;->֫()V

    .line 144
    invoke-virtual {p1}, Ll/֫ۗ֡;->֫()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۗ᩶֡;)[Ll/ܽۙ֡;
    .locals 5

    .line 100
    iget-object v0, p0, Ll/۫᩶֡;->ۙ:[Ll/ܽۙ֡;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 103
    :cond_0
    array-length v1, v0

    new-array v2, v1, [Ll/ܽۙ֡;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 105
    aget-object v4, v0, v3

    invoke-static {p1, v4}, Ll/ܽۙ֡;->֫(Ll/ۗ᩶֡;Ll/ܽۙ֡;)Ll/ܽۙ֡;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public final ۖ()Ll/ۘۙ֡;
    .locals 1

    .line 198
    sget-object v0, Ll/ۘۙ֡;->᩶:Ll/ۘۙ֡;

    return-object v0
.end method

.method public final ۧ(Ll/ܽۙ֡;)I
    .locals 5

    .line 167
    check-cast p1, Ll/۫᩶֡;

    .line 169
    iget-object v0, p1, Ll/۫᩶֡;->᩸:Ll/᩺ۙ֡;

    iget-object v1, p1, Ll/۫᩶֡;->᩶:[Ll/ۨۙ֡;

    iget-object v2, p0, Ll/۫᩶֡;->᩸:Ll/᩺ۙ֡;

    invoke-virtual {v2, v0}, Ll/᩺ۙ֡;->֫(Ll/᩺ۙ֡;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 174
    :cond_0
    iget-object v0, p0, Ll/۫᩶֡;->᩶:[Ll/ۨۙ֡;

    array-length v2, v0

    array-length v3, v1

    sub-int/2addr v2, v3

    if-eqz v2, :cond_1

    return v2

    :cond_1
    const/4 v3, 0x0

    .line 179
    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_4

    .line 180
    aget-object v2, v0, v3

    aget-object v4, v1, v3

    invoke-virtual {v2, v4}, Ll/ۨۙ֡;->֫(Ll/ۨۙ֡;)I

    move-result v2

    if-eqz v2, :cond_2

    return v2

    .line 185
    :cond_2
    iget-object v2, p0, Ll/۫᩶֡;->ۙ:[Ll/ܽۙ֡;

    aget-object v2, v2, v3

    iget-object v4, p1, Ll/۫᩶֡;->ۙ:[Ll/ܽۙ֡;

    aget-object v4, v4, v3

    invoke-virtual {v2, v4}, Ll/ܽۙ֡;->֫(Ll/ܽۙ֡;)I

    move-result v2

    if-eqz v2, :cond_3

    return v2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return v2
.end method
