.class public final Ll/ܺۜܽ;
.super Ll/᩷ᩳܽ;
.source "P53T"


# instance fields
.field public final ۗ:I

.field public final ۙ:S

.field public final ۬:[Ll/֡ۜܽ;


# direct methods
.method public constructor <init>(Ll/ۡۜܽ;ILl/ۛۜܽ;)V
    .locals 4

    .line 19
    invoke-direct {p0, p1, p2}, Ll/᩷ᩳܽ;-><init>(Ll/ۜ᩻ܽ;I)V

    .line 20
    invoke-virtual {p3}, Ll/ۛۜܽ;->᩻()I

    move-result p1

    .line 21
    invoke-virtual {p3}, Ll/ۛۜܽ;->ܿ()S

    move-result p2

    iput-short p2, p0, Ll/ܺۜܽ;->ۙ:S

    .line 22
    invoke-virtual {p3}, Ll/ۛۜܽ;->ᩳ()I

    move-result v0

    .line 24
    invoke-virtual {p0}, Ll/ܺۜܽ;->ܰ()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    shr-int/lit8 p2, p2, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    .line 26
    new-instance p3, Ll/֡ۜܽ;

    invoke-direct {p3, p0, p2, v0}, Ll/֡ۜܽ;-><init>(Ll/ܺۜܽ;II)V

    new-array p2, v2, [Ll/֡ۜܽ;

    aput-object p3, p2, v3

    iput-object p2, p0, Ll/ܺۜܽ;->۬:[Ll/֡ۜܽ;

    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {p0}, Ll/ܺۜܽ;->᩻֫()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 30
    invoke-virtual {p3}, Ll/ۛۜܽ;->ᩳ()I

    move-result p1

    iput p1, p0, Ll/᩷ᩳܽ;->᩶:I

    .line 31
    invoke-virtual {p3}, Ll/ۛۜܽ;->ᩳ()I

    move-result p1

    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 32
    new-array p2, p1, [Ll/֡ۜܽ;

    iput-object p2, p0, Ll/ܺۜܽ;->۬:[Ll/֡ۜܽ;

    :goto_0
    if-ge v3, p1, :cond_2

    .line 34
    iget-object p2, p0, Ll/ܺۜܽ;->۬:[Ll/֡ۜܽ;

    new-instance v1, Ll/֡ۜܽ;

    invoke-virtual {p3}, Ll/ۛۜܽ;->ᩳ()I

    move-result v2

    invoke-direct {v1, p0, v3, v2, p3}, Ll/֡ۜܽ;-><init>(Ll/ܺۜܽ;IILl/ۛۜܽ;)V

    aput-object v1, p2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 36
    :cond_1
    new-instance p1, Ll/֡ۜܽ;

    const/4 p2, -0x1

    invoke-direct {p1, p0, v3, p2, p3}, Ll/֡ۜܽ;-><init>(Ll/ܺۜܽ;IILl/ۛۜܽ;)V

    new-array p2, v2, [Ll/֡ۜܽ;

    aput-object p1, p2, v3

    iput-object p2, p0, Ll/ܺۜܽ;->۬:[Ll/֡ۜܽ;

    :cond_2
    move p1, v0

    .line 38
    :goto_1
    iput p1, p0, Ll/ܺۜܽ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final getType()Ll/֡᩻ܽ;
    .locals 1

    .line 171
    invoke-super {p0}, Ll/᩷ᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩵ۜܽ;

    return-object v0
.end method

.method public final getValue()Ll/֨᩻ܽ;
    .locals 2

    .line 111
    iget-object v0, p0, Ll/ܺۜܽ;->۬:[Ll/֡ۜܽ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final getValue(I)Ll/֨᩻ܽ;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ܺۜܽ;->۬:[Ll/֡ۜܽ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 161
    invoke-super {p0}, Ll/᩷ᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۚۜܽ;

    return-object v0
.end method

.method public final ۛ֫()Z
    .locals 1

    .line 141
    iget-short v0, p0, Ll/ܺۜܽ;->ۙ:S

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۟֫()Ljava/lang/String;
    .locals 2

    .line 166
    :try_start_0
    invoke-super {p0}, Ll/᩷ᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ᩴۜܽ;

    .line 127
    invoke-virtual {v0}, Ll/ᩴۜܽ;->ۜ()Ljava/util/List;

    move-result-object v0

    iget v1, p0, Ll/ܺۜܽ;->ۗ:I

    check-cast v0, Ll/ۘۜܽ;

    .line 130
    iget-object v0, v0, Ll/ۘۜܽ;->᩸:Ll/֨ۜܽ;

    invoke-virtual {v0, v1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "error"

    return-object v0
.end method

.method public final ۧ()Ll/ۘ᩻ܽ;
    .locals 1

    .line 166
    invoke-super {p0}, Ll/᩷ᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ᩴۜܽ;

    return-object v0
.end method

.method public final ܰ()Z
    .locals 1

    .line 151
    iget-short v0, p0, Ll/ܺۜܽ;->ۙ:S

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ֫()I
    .locals 1

    .line 121
    iget-object v0, p0, Ll/ܺۜܽ;->۬:[Ll/֡ۜܽ;

    array-length v0, v0

    return v0
.end method

.method public final ܿ()Ll/ۜ᩻ܽ;
    .locals 1

    .line 176
    invoke-super {p0}, Ll/᩷ᩳܽ;->ܿ()Ll/ۜ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۡۜܽ;

    return-object v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 146
    iget-short v0, p0, Ll/ܺۜܽ;->ۙ:S

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻֫()Z
    .locals 2

    .line 136
    iget-short v0, p0, Ll/ܺۜܽ;->ۙ:S

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
