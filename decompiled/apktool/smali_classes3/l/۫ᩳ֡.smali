.class public Ll/۫ᩳ֡;
.super Ljava/lang/Object;
.source "H4RX"


# instance fields
.field public ֫:[S

.field public ۜ:[S

.field public ۧ:I

.field public ܳ:[C

.field public ܽ:[S

.field public ܿ:[C

.field public ᩳ:[S

.field public ᩷:[[S

.field public ᩻:Ll/ܰᩴۚ;


# direct methods
.method public static ֫(Ljava/lang/String;)[S
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 188
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 189
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 191
    :cond_0
    new-array v1, v2, [S

    const/4 v2, 0x0

    .line 193
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 194
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v4, v0, 0x1

    .line 195
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/4 v5, 0x1

    :goto_2
    if-gt v5, v3, :cond_1

    add-int/lit8 v6, v2, 0x1

    int-to-short v7, v4

    .line 198
    aput-short v7, v1, v2

    add-int/lit8 v5, v5, 0x1

    move v2, v6

    goto :goto_2

    :cond_1
    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method public static ۧ(Ljava/lang/String;)[C
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 208
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 209
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 211
    :cond_0
    new-array v1, v2, [C

    const/4 v2, 0x0

    .line 213
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 214
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v4, v0, 0x1

    .line 215
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/4 v5, 0x1

    :goto_2
    if-gt v5, v3, :cond_1

    add-int/lit8 v6, v2, 0x1

    .line 218
    aput-char v4, v1, v2

    add-int/lit8 v5, v5, 0x1

    move v2, v6

    goto :goto_2

    :cond_1
    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_2
    return-object v1
.end method


# virtual methods
.method public final ֫(Ll/۬ᩳ֡;)I
    .locals 6

    .line 68
    invoke-virtual {p1}, Ll/۬ᩳ֡;->᩻()I

    move-result v0

    const/4 v1, 0x0

    .line 74
    :goto_0
    :try_start_0
    iget-object v2, p0, Ll/۫ᩳ֡;->ۜ:[S

    aget-short v2, v2, v1

    const/4 v3, 0x0

    if-ltz v2, :cond_1

    .line 80
    invoke-virtual {p0, v2, p1}, Ll/۫ᩳ֡;->ۧ(ILl/ۨᩳ֡;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 89
    invoke-virtual {p1}, Ll/۬ᩳ֡;->ۧ()V

    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {p0, v1, p1}, Ll/۫ᩳ֡;->֫(ILl/ۨᩳ֡;)V

    throw v3

    .line 92
    :cond_1
    iget-object v2, p0, Ll/۫ᩳ֡;->֫:[S

    aget-short v2, v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x1

    if-lt v2, v4, :cond_2

    .line 114
    iput v0, p1, Ll/۬ᩳ֡;->ۧ:I

    return v2

    .line 97
    :cond_2
    :try_start_1
    invoke-virtual {p1, v4}, Ll/۬ᩳ֡;->ۧ(I)I

    move-result v2

    int-to-char v2, v2

    .line 98
    iget-object v4, p0, Ll/۫ᩳ֡;->ܳ:[C

    aget-char v4, v4, v1

    if-lt v2, v4, :cond_5

    iget-object v5, p0, Ll/۫ᩳ֡;->ܿ:[C

    aget-char v5, v5, v1

    if-gt v2, v5, :cond_5

    .line 99
    iget-object v5, p0, Ll/۫ᩳ֡;->᩷:[[S

    aget-object v5, v5, v1

    sub-int/2addr v2, v4

    aget-short v2, v5, v2

    if-gez v2, :cond_4

    .line 105
    iget-object v2, p0, Ll/۫ᩳ֡;->ᩳ:[S

    aget-short v2, v2, v1

    if-ltz v2, :cond_3

    .line 108
    invoke-virtual {p1}, Ll/۬ᩳ֡;->ۧ()V

    goto :goto_1

    .line 116
    :cond_3
    invoke-virtual {p0, v1, p1}, Ll/۫ᩳ֡;->֫(ILl/ۨᩳ֡;)V

    throw v3

    .line 120
    :cond_4
    invoke-virtual {p1}, Ll/۬ᩳ֡;->ۧ()V

    :goto_1
    move v1, v2

    goto :goto_0

    .line 123
    :cond_5
    iget-object v4, p0, Ll/۫ᩳ֡;->ᩳ:[S

    aget-short v4, v4, v1

    if-ltz v4, :cond_6

    .line 126
    invoke-virtual {p1}, Ll/۬ᩳ֡;->ۧ()V

    move v1, v4

    goto :goto_0

    :cond_6
    const v4, 0xffff

    if-ne v2, v4, :cond_7

    .line 129
    iget-object v2, p0, Ll/۫ᩳ֡;->ܽ:[S

    aget-short v2, v2, v1

    if-ltz v2, :cond_7

    .line 131
    iget-object v1, p0, Ll/۫ᩳ֡;->֫:[S

    aget-short v1, v1, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    iput v0, p1, Ll/۬ᩳ֡;->ۧ:I

    return v1

    .line 144
    :cond_7
    :try_start_2
    invoke-virtual {p0, v1, p1}, Ll/۫ᩳ֡;->֫(ILl/ۨᩳ֡;)V

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v1

    .line 114
    iput v0, p1, Ll/۬ᩳ֡;->ۧ:I

    .line 149
    throw v1
.end method

.method public ֫()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(ILl/ۨᩳ֡;)V
    .locals 3

    .line 154
    iget-object v0, p0, Ll/۫ᩳ֡;->᩻:Ll/ܰᩴۚ;

    iget-object v0, v0, Ll/᩹ᩳ֡;->֫:Ll/᩻ܿ֡;

    .line 158
    new-instance v0, Ll/ܽܿ֡;

    invoke-virtual {p0}, Ll/۫ᩳ֡;->֫()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Ll/۫ᩳ֡;->ۧ:I

    invoke-direct {v0, v1, v2, p1, p2}, Ll/ܽܿ֡;-><init>(Ljava/lang/String;IILl/ۨᩳ֡;)V

    .line 164
    throw v0
.end method

.method public ۧ(ILl/ۨᩳ֡;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method
