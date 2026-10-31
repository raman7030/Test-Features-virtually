.class public final Ll/ۡ۠֡;
.super Ljava/lang/Object;
.source "O7S5"


# instance fields
.field public ֫:I

.field public final ۧ:[I

.field public ܳ:I

.field public ܽ:I

.field public final ܿ:[C

.field public final ᩳ:[Z

.field public final ᩻:[I


# direct methods
.method public constructor <init>([II[Z)V
    .locals 1

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x102

    new-array v0, v0, [I

    .line 39
    iput-object v0, p0, Ll/ۡ۠֡;->᩻:[I

    .line 185
    iput-object p1, p0, Ll/ۡ۠֡;->ۧ:[I

    .line 186
    iput p2, p0, Ll/ۡ۠֡;->ܽ:I

    .line 187
    iput-object p3, p0, Ll/ۡ۠֡;->ᩳ:[Z

    add-int/lit8 p2, p2, 0x1

    .line 188
    new-array p1, p2, [C

    iput-object p1, p0, Ll/ۡ۠֡;->ܿ:[C

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 15

    const/16 v0, 0x100

    new-array v1, v0, [B

    .line 58
    new-instance v2, Ll/ۘ۠֡;

    invoke-direct {v2}, Ll/ۘ۠֡;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v0, :cond_1

    .line 62
    iget-object v6, p0, Ll/ۡ۠֡;->ᩳ:[Z

    aget-boolean v6, v6, v4

    if-eqz v6, :cond_0

    add-int/lit8 v6, v5, 0x1

    int-to-byte v5, v5

    .line 63
    aput-byte v5, v1, v4

    move v5, v6

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v5, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    const/4 v10, 0x1

    .line 74
    iget v11, p0, Ll/ۡ۠֡;->ܽ:I

    iget-object v12, p0, Ll/ۡ۠֡;->ܿ:[C

    iget-object v13, p0, Ll/ۡ۠֡;->᩻:[I

    if-ge v4, v11, :cond_6

    .line 77
    iget-object v11, p0, Ll/ۡ۠֡;->ۧ:[I

    aget v11, v11, v4

    and-int/lit16 v11, v11, 0xff

    aget-byte v11, v1, v11

    invoke-virtual {v2, v11}, Ll/ۘ۠֡;->֫(B)I

    move-result v11

    if-nez v11, :cond_2

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_2
    if-lez v6, :cond_5

    add-int/lit8 v6, v6, -0x1

    :goto_2
    and-int/lit8 v14, v6, 0x1

    if-nez v14, :cond_3

    add-int/lit8 v14, v7, 0x1

    .line 87
    aput-char v3, v12, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v14, v7, 0x1

    .line 90
    aput-char v10, v12, v7

    add-int/lit8 v9, v9, 0x1

    :goto_3
    move v7, v14

    if-gt v6, v10, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    add-int/lit8 v6, v6, -0x2

    ushr-int/2addr v6, v10

    goto :goto_2

    :cond_5
    :goto_4
    add-int/lit8 v3, v7, 0x1

    add-int/lit8 v11, v11, 0x1

    int-to-char v14, v11

    .line 102
    aput-char v14, v12, v7

    .line 103
    aget v7, v13, v11

    add-int/2addr v7, v10

    aput v7, v13, v11

    move v7, v3

    :goto_5
    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x0

    goto :goto_1

    :cond_6
    const/4 v1, 0x0

    if-lez v6, :cond_9

    add-int/lit8 v6, v6, -0x1

    :goto_6
    and-int/lit8 v2, v6, 0x1

    if-nez v2, :cond_7

    add-int/lit8 v2, v7, 0x1

    .line 112
    aput-char v1, v12, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_7
    add-int/lit8 v2, v7, 0x1

    .line 115
    aput-char v10, v12, v7

    add-int/lit8 v9, v9, 0x1

    :goto_7
    move v7, v2

    if-gt v6, v10, :cond_8

    goto :goto_8

    :cond_8
    add-int/lit8 v6, v6, -0x2

    ushr-int/2addr v6, v10

    goto :goto_6

    :cond_9
    :goto_8
    int-to-char v2, v0

    .line 126
    aput-char v2, v12, v7

    .line 127
    aget v2, v13, v0

    add-int/2addr v2, v10

    aput v2, v13, v0

    .line 128
    aget v0, v13, v1

    add-int/2addr v0, v8

    aput v0, v13, v1

    .line 129
    aget v0, v13, v10

    add-int/2addr v0, v9

    aput v0, v13, v10

    add-int/2addr v7, v10

    .line 131
    iput v7, p0, Ll/ۡ۠֡;->ܳ:I

    add-int/lit8 v5, v5, 0x2

    .line 132
    iput v5, p0, Ll/ۡ۠֡;->֫:I

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 162
    iget v0, p0, Ll/ۡ۠֡;->֫:I

    return v0
.end method

.method public final ܽ()[C
    .locals 1

    .line 142
    iget-object v0, p0, Ll/ۡ۠֡;->ܿ:[C

    return-object v0
.end method

.method public final ܿ()[I
    .locals 1

    .line 172
    iget-object v0, p0, Ll/ۡ۠֡;->᩻:[I

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 152
    iget v0, p0, Ll/ۡ۠֡;->ܳ:I

    return v0
.end method
