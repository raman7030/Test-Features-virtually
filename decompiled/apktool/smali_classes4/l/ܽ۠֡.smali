.class public final Ll/ܽ۠֡;
.super Ljava/lang/Object;
.source "S7S9"


# instance fields
.field public final ֫:Ll/ۧ۠֡;

.field public ۜ:I

.field public final ۧ:[B

.field public final ܳ:[I

.field public ܽ:I

.field public final ܿ:[Z

.field public final ᩳ:I

.field public ᩷:I

.field public final ᩻:Ll/ۖ۠֡;


# direct methods
.method public constructor <init>(Ll/ۧ۠֡;I)V
    .locals 2

    .line 299
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ll/ۖ۠֡;

    invoke-direct {v0}, Ll/ۖ۠֡;-><init>()V

    iput-object v0, p0, Ll/ܽ۠֡;->᩻:Ll/ۖ۠֡;

    const/4 v0, 0x0

    .line 61
    iput v0, p0, Ll/ܽ۠֡;->ܽ:I

    const/16 v1, 0x100

    new-array v1, v1, [Z

    .line 72
    iput-object v1, p0, Ll/ܽ۠֡;->ܿ:[Z

    const/4 v1, -0x1

    .line 82
    iput v1, p0, Ll/ܽ۠֡;->ۜ:I

    .line 87
    iput v0, p0, Ll/ܽ۠֡;->᩷:I

    .line 301
    iput-object p1, p0, Ll/ܽ۠֡;->֫:Ll/ۧ۠֡;

    add-int/lit8 p1, p2, 0x1

    .line 304
    new-array v0, p1, [B

    iput-object v0, p0, Ll/ܽ۠֡;->ۧ:[B

    .line 305
    new-array p1, p1, [I

    iput-object p1, p0, Ll/ܽ۠֡;->ܳ:[I

    add-int/lit8 p2, p2, -0x6

    .line 306
    iput p2, p0, Ll/ܽ۠֡;->ᩳ:I

    return-void
.end method

.method private ֫(II)V
    .locals 5

    .line 131
    iget v0, p0, Ll/ܽ۠֡;->ܽ:I

    .line 134
    iget-object v1, p0, Ll/ܽ۠֡;->ܿ:[Z

    const/4 v2, 0x1

    aput-boolean v2, v1, p1

    .line 135
    iget-object v3, p0, Ll/ܽ۠֡;->᩻:Ll/ۖ۠֡;

    invoke-virtual {v3, p1, p2}, Ll/ۖ۠֡;->֫(II)V

    int-to-byte p1, p1

    .line 138
    iget-object v3, p0, Ll/ܽ۠֡;->ۧ:[B

    if-eq p2, v2, :cond_2

    const/4 v4, 0x2

    if-eq p2, v4, :cond_1

    const/4 v4, 0x3

    if-eq p2, v4, :cond_0

    add-int/lit8 p2, p2, -0x4

    .line 159
    aput-boolean v2, v1, p2

    .line 160
    aput-byte p1, v3, v0

    add-int/lit8 v1, v0, 0x1

    .line 161
    aput-byte p1, v3, v1

    add-int/lit8 v1, v0, 0x2

    .line 162
    aput-byte p1, v3, v1

    add-int/lit8 v1, v0, 0x3

    .line 163
    aput-byte p1, v3, v1

    add-int/lit8 p1, v0, 0x4

    int-to-byte p2, p2

    .line 164
    aput-byte p2, v3, p1

    add-int/lit8 v0, v0, 0x5

    .line 165
    iput v0, p0, Ll/ܽ۠֡;->ܽ:I

    return-void

    .line 151
    :cond_0
    aput-byte p1, v3, v0

    add-int/lit8 p2, v0, 0x1

    .line 152
    aput-byte p1, v3, p2

    add-int/lit8 p2, v0, 0x2

    .line 153
    aput-byte p1, v3, p2

    add-int/2addr v0, v4

    .line 154
    iput v0, p0, Ll/ܽ۠֡;->ܽ:I

    return-void

    .line 145
    :cond_1
    aput-byte p1, v3, v0

    add-int/lit8 p2, v0, 0x1

    .line 146
    aput-byte p1, v3, p2

    add-int/2addr v0, v4

    .line 147
    iput v0, p0, Ll/ܽ۠֡;->ܽ:I

    return-void

    .line 140
    :cond_2
    aput-byte p1, v3, v0

    add-int/2addr v0, v2

    .line 141
    iput v0, p0, Ll/ܽ۠֡;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 11

    .line 239
    iget v0, p0, Ll/ܽ۠֡;->᩷:I

    if-lez v0, :cond_0

    .line 240
    iget v1, p0, Ll/ܽ۠֡;->ۜ:I

    and-int/lit16 v1, v1, 0xff

    invoke-direct {p0, v1, v0}, Ll/ܽ۠֡;->֫(II)V

    .line 244
    :cond_0
    iget v0, p0, Ll/ܽ۠֡;->ܽ:I

    iget-object v1, p0, Ll/ܽ۠֡;->ۧ:[B

    const/4 v2, 0x0

    aget-byte v3, v1, v2

    aput-byte v3, v1, v0

    .line 247
    new-instance v3, Ll/ܳ۠֡;

    iget-object v4, p0, Ll/ܽ۠֡;->ܳ:[I

    invoke-direct {v3, v1, v0, v4}, Ll/ܳ۠֡;-><init>([BI[I)V

    .line 248
    invoke-virtual {v3}, Ll/ܳ۠֡;->֫()I

    move-result v0

    const v1, 0x314159

    .line 251
    iget-object v3, p0, Ll/ܽ۠֡;->֫:Ll/ۧ۠֡;

    const/16 v5, 0x18

    invoke-virtual {v3, v5, v1}, Ll/ۧ۠֡;->֫(II)V

    const v1, 0x265359

    .line 252
    invoke-virtual {v3, v5, v1}, Ll/ۧ۠֡;->֫(II)V

    .line 253
    iget-object v1, p0, Ll/ܽ۠֡;->᩻:Ll/ۖ۠֡;

    invoke-virtual {v1}, Ll/ۖ۠֡;->֫()I

    move-result v1

    ushr-int/lit8 v6, v1, 0x10

    const v7, 0xffff

    and-int/2addr v6, v7

    const/16 v8, 0x10

    .line 120
    invoke-virtual {v3, v8, v6}, Ll/ۧ۠֡;->֫(II)V

    and-int/2addr v1, v7

    .line 121
    invoke-virtual {v3, v8, v1}, Ll/ۧ۠֡;->֫(II)V

    .line 254
    invoke-virtual {v3, v2}, Ll/ۧ۠֡;->֫(Z)V

    .line 255
    invoke-virtual {v3, v5, v0}, Ll/ۧ۠֡;->֫(II)V

    new-array v0, v8, [Z

    const/4 v1, 0x0

    .line 101
    :goto_0
    iget-object v2, p0, Ll/ܽ۠֡;->ܿ:[Z

    const/4 v5, 0x1

    if-ge v1, v8, :cond_3

    shl-int/lit8 v6, v1, 0x4

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v8, :cond_2

    .line 103
    aget-boolean v9, v2, v6

    if-eqz v9, :cond_1

    .line 104
    aput-boolean v5, v0, v1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_2
    if-ge v1, v8, :cond_4

    .line 110
    aget-boolean v6, v0, v1

    invoke-virtual {v3, v6}, Ll/ۧ۠֡;->֫(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_3
    if-ge v1, v8, :cond_6

    .line 114
    aget-boolean v6, v0, v1

    if-eqz v6, :cond_5

    mul-int/lit8 v6, v1, 0x10

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v8, :cond_5

    .line 116
    aget-boolean v9, v2, v6

    invoke-virtual {v3, v9}, Ll/ۧ۠֡;->֫(Z)V

    add-int/lit8 v7, v7, 0x1

    add-int/2addr v6, v5

    goto :goto_4

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 261
    :cond_6
    new-instance v0, Ll/ۡ۠֡;

    iget v1, p0, Ll/ܽ۠֡;->ܽ:I

    invoke-direct {v0, v4, v1, v2}, Ll/ۡ۠֡;-><init>([II[Z)V

    .line 262
    invoke-virtual {v0}, Ll/ۡ۠֡;->֫()V

    .line 265
    new-instance v1, Ll/᩷۠֡;

    invoke-virtual {v0}, Ll/ۡ۠֡;->ܽ()[C

    move-result-object v7

    invoke-virtual {v0}, Ll/ۡ۠֡;->ᩳ()I

    move-result v8

    invoke-virtual {v0}, Ll/ۡ۠֡;->ۧ()I

    move-result v9

    invoke-virtual {v0}, Ll/ۡ۠֡;->ܿ()[I

    move-result-object v10

    iget-object v6, p0, Ll/ܽ۠֡;->֫:Ll/ۧ۠֡;

    move-object v5, v1

    invoke-direct/range {v5 .. v10}, Ll/᩷۠֡;-><init>(Ll/ۧ۠֡;[CII[I)V

    .line 266
    invoke-virtual {v1}, Ll/᩷۠֡;->֫()V

    return-void
.end method

.method public final ֫(I)Z
    .locals 5

    .line 179
    iget v0, p0, Ll/ܽ۠֡;->ܽ:I

    iget v1, p0, Ll/ܽ۠֡;->ᩳ:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return v2

    .line 183
    :cond_0
    iget v0, p0, Ll/ܽ۠֡;->ۜ:I

    .line 184
    iget v1, p0, Ll/ܽ۠֡;->᩷:I

    const/4 v3, 0x1

    if-nez v1, :cond_1

    .line 187
    iput p1, p0, Ll/ܽ۠֡;->ۜ:I

    .line 188
    iput v3, p0, Ll/ܽ۠֡;->᩷:I

    goto :goto_0

    :cond_1
    const/16 v4, 0xff

    if-eq v0, p1, :cond_2

    and-int/2addr v0, v4

    .line 191
    invoke-direct {p0, v0, v1}, Ll/ܽ۠֡;->֫(II)V

    .line 192
    iput p1, p0, Ll/ܽ۠֡;->ۜ:I

    .line 193
    iput v3, p0, Ll/ܽ۠֡;->᩷:I

    goto :goto_0

    :cond_2
    const/16 p1, 0xfe

    if-ne v1, p1, :cond_3

    and-int/lit16 p1, v0, 0xff

    .line 196
    invoke-direct {p0, p1, v4}, Ll/ܽ۠֡;->֫(II)V

    .line 197
    iput v2, p0, Ll/ܽ۠֡;->᩷:I

    goto :goto_0

    :cond_3
    add-int/2addr v1, v3

    .line 199
    iput v1, p0, Ll/ܽ۠֡;->᩷:I

    :goto_0
    return v3
.end method

.method public final ۧ()I
    .locals 1

    .line 289
    iget-object v0, p0, Ll/ܽ۠֡;->᩻:Ll/ۖ۠֡;

    invoke-virtual {v0}, Ll/ۖ۠֡;->֫()I

    move-result v0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 278
    iget v0, p0, Ll/ܽ۠֡;->ܽ:I

    if-nez v0, :cond_0

    iget v0, p0, Ll/ܽ۠֡;->᩷:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
