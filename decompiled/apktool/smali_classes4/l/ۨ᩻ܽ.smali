.class public final Ll/ۨ᩻ܽ;
.super Ll/᩷ᩳܽ;
.source "P53T"


# instance fields
.field public final ۗ:I

.field public final ۙ:S

.field public final ۬:[Ll/ۜۜܽ;


# direct methods
.method public constructor <init>(Ll/ۛ᩻ܽ;ILl/ۛۜܽ;)V
    .locals 4

    .line 19
    invoke-direct {p0, p1, p2}, Ll/᩷ᩳܽ;-><init>(Ll/ۜ᩻ܽ;I)V

    .line 20
    invoke-virtual {p3}, Ll/ۛۜܽ;->᩻()I

    move-result p1

    .line 21
    invoke-virtual {p3}, Ll/ۛۜܽ;->ܿ()S

    move-result p2

    iput-short p2, p0, Ll/ۨ᩻ܽ;->ۙ:S

    .line 22
    invoke-virtual {p3}, Ll/ۛۜܽ;->ᩳ()I

    move-result v0

    .line 24
    invoke-virtual {p0}, Ll/ۨ᩻ܽ;->ܰ()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    shr-int/lit8 p2, p2, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    .line 26
    new-instance p3, Ll/ۜۜܽ;

    invoke-direct {p3, p0, p2, v0}, Ll/ۜۜܽ;-><init>(Ll/ۨ᩻ܽ;II)V

    new-array p2, v2, [Ll/ۜۜܽ;

    aput-object p3, p2, v3

    iput-object p2, p0, Ll/ۨ᩻ܽ;->۬:[Ll/ۜۜܽ;

    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩻ܽ;->᩻֫()Z

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
    new-array p2, p1, [Ll/ۜۜܽ;

    iput-object p2, p0, Ll/ۨ᩻ܽ;->۬:[Ll/ۜۜܽ;

    :goto_0
    if-ge v3, p1, :cond_2

    .line 34
    iget-object p2, p0, Ll/ۨ᩻ܽ;->۬:[Ll/ۜۜܽ;

    new-instance v1, Ll/ۜۜܽ;

    invoke-virtual {p3}, Ll/ۛۜܽ;->ᩳ()I

    move-result v2

    invoke-direct {v1, p0, v3, v2, p3}, Ll/ۜۜܽ;-><init>(Ll/ۨ᩻ܽ;IILl/ۛۜܽ;)V

    aput-object v1, p2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 36
    :cond_1
    new-instance p1, Ll/ۜۜܽ;

    const/4 p2, -0x1

    invoke-direct {p1, p0, v3, p2, p3}, Ll/ۜۜܽ;-><init>(Ll/ۨ᩻ܽ;IILl/ۛۜܽ;)V

    new-array p2, v2, [Ll/ۜۜܽ;

    aput-object p1, p2, v3

    iput-object p2, p0, Ll/ۨ᩻ܽ;->۬:[Ll/ۜۜܽ;

    :cond_2
    move p1, v0

    .line 38
    :goto_1
    iput p1, p0, Ll/ۨ᩻ܽ;->ۗ:I

    return-void
.end method

.method public static ֫(Ll/ۛۜܽ;Ll/ᩳۜܽ;)Z
    .locals 8

    .line 51
    invoke-virtual {p0}, Ll/ۛۜܽ;->֫()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto/16 :goto_4

    .line 54
    :cond_0
    invoke-virtual {p0}, Ll/ۛۜܽ;->᩻()I

    move-result v0

    .line 55
    invoke-virtual {p0}, Ll/ۛۜܽ;->ܿ()S

    move-result v1

    .line 56
    invoke-virtual {p0}, Ll/ۛۜܽ;->ᩳ()I

    move-result v3

    and-int/lit8 v4, v1, 0x8

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    and-int/2addr v1, v5

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-eqz v4, :cond_3

    if-ltz v0, :cond_d

    .line 63
    invoke-virtual {p1}, Ll/ᩳۜܽ;->ۜ()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ll/ܽۜܽ;

    .line 85
    iget-object p0, p0, Ll/ܽۜܽ;->᩸:Ll/ۢۜܽ;

    invoke-virtual {p0}, Ll/ۢۜܽ;->size()I

    move-result p0

    if-ge v0, p0, :cond_d

    goto/16 :goto_3

    :cond_3
    if-ltz v3, :cond_d

    .line 65
    invoke-virtual {p1}, Ll/ᩳۜܽ;->ۜ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ll/ܽۜܽ;

    .line 85
    iget-object v0, v0, Ll/ܽۜܽ;->᩸:Ll/ۢۜܽ;

    invoke-virtual {v0}, Ll/ۢۜܽ;->size()I

    move-result v0

    if-lt v3, v0, :cond_4

    goto :goto_4

    :cond_4
    if-eqz v1, :cond_5

    .line 70
    invoke-virtual {p0}, Ll/ۛۜܽ;->ۜ()V

    .line 71
    invoke-virtual {p0}, Ll/ۛۜܽ;->ᩳ()I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_6

    goto :goto_4

    :cond_5
    const/4 v0, 0x1

    :cond_6
    if-eqz v1, :cond_7

    .line 78
    invoke-virtual {p0}, Ll/ۛۜܽ;->֫()I

    move-result v3

    mul-int/lit8 v4, v0, 0xc

    if-ge v3, v4, :cond_8

    goto :goto_4

    .line 82
    :cond_7
    invoke-virtual {p0}, Ll/ۛۜܽ;->֫()I

    move-result v3

    mul-int/lit8 v4, v0, 0x8

    if-ge v3, v4, :cond_8

    goto :goto_4

    .line 86
    :cond_8
    invoke-virtual {p1}, Ll/ᩳۜܽ;->֫()Ll/᩺᩻ܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩺᩻ܽ;->᩻ۧ()Ll/ۢۜܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۢۜܽ;->size()I

    move-result p1

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v0, :cond_c

    if-eqz v1, :cond_9

    .line 89
    invoke-virtual {p0}, Ll/ۛۜܽ;->ۜ()V

    :cond_9
    const/4 v4, 0x2

    .line 92
    invoke-virtual {p0, v4}, Ll/ۛۜܽ;->ᩳ(I)V

    .line 94
    invoke-virtual {p0}, Ll/ۛۜܽ;->ܽ()B

    .line 95
    invoke-virtual {p0}, Ll/ۛۜܽ;->ܽ()B

    move-result v4

    .line 96
    invoke-virtual {p0}, Ll/ۛۜܽ;->ᩳ()I

    move-result v6

    .line 97
    invoke-static {v4}, Ll/ۚ᩻ܽ;->֫(I)Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_4

    :cond_a
    const/4 v7, 0x3

    if-ne v4, v7, :cond_b

    if-ltz v6, :cond_d

    if-lt v6, p1, :cond_b

    goto :goto_4

    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_c
    :goto_3
    return v5

    :cond_d
    :goto_4
    return v2
.end method


# virtual methods
.method public final getType()Ll/֡᩻ܽ;
    .locals 1

    .line 171
    invoke-super {p0}, Ll/᩷ᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩻ۜܽ;

    return-object v0
.end method

.method public final getValue()Ll/֨᩻ܽ;
    .locals 2

    .line 111
    iget-object v0, p0, Ll/ۨ᩻ܽ;->۬:[Ll/ۜۜܽ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final getValue(I)Ll/֨᩻ܽ;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ۨ᩻ܽ;->۬:[Ll/ۜۜܽ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 161
    invoke-super {p0}, Ll/᩷ᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩺᩻ܽ;

    return-object v0
.end method

.method public final ۛ֫()Z
    .locals 1

    .line 141
    iget-short v0, p0, Ll/ۨ᩻ܽ;->ۙ:S

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

    check-cast v0, Ll/ᩳۜܽ;

    .line 127
    invoke-virtual {v0}, Ll/ᩳۜܽ;->ۜ()Ljava/util/List;

    move-result-object v0

    iget v1, p0, Ll/ۨ᩻ܽ;->ۗ:I

    check-cast v0, Ll/ܽۜܽ;

    .line 80
    iget-object v0, v0, Ll/ܽۜܽ;->᩸:Ll/ۢۜܽ;

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

    check-cast v0, Ll/ᩳۜܽ;

    return-object v0
.end method

.method public final ܰ()Z
    .locals 1

    .line 151
    iget-short v0, p0, Ll/ۨ᩻ܽ;->ۙ:S

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
    iget-object v0, p0, Ll/ۨ᩻ܽ;->۬:[Ll/ۜۜܽ;

    array-length v0, v0

    return v0
.end method

.method public final ܿ()Ll/ۜ᩻ܽ;
    .locals 1

    .line 176
    invoke-super {p0}, Ll/᩷ᩳܽ;->ܿ()Ll/ۜ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۛ᩻ܽ;

    return-object v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 146
    iget-short v0, p0, Ll/ۨ᩻ܽ;->ۙ:S

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
    iget-short v0, p0, Ll/ۨ᩻ܽ;->ۙ:S

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
