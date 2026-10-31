.class public final Ll/ۜ۠֡;
.super Ljava/lang/Object;
.source "57RJ"


# instance fields
.field public final ֫:Ll/֫۠֡;

.field public final ۜ:[I

.field public final ۧ:[[I

.field public ܳ:I

.field public final ܽ:[[I

.field public ܿ:I

.field public final ᩳ:[[I

.field public final ᩷:[B

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/֫۠֡;I[[B[B)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    .line 184
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x6

    new-array v5, v4, [I

    .line 46
    iput-object v5, v0, Ll/ۜ۠֡;->ۜ:[I

    const/4 v5, 0x2

    new-array v6, v5, [I

    const/4 v7, 0x1

    const/16 v8, 0x19

    aput v8, v6, v7

    const/4 v9, 0x0

    aput v4, v6, v9

    .line 52
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [[I

    iput-object v6, v0, Ll/ۜ۠֡;->ۧ:[[I

    new-array v6, v5, [I

    const/16 v11, 0x18

    aput v11, v6, v7

    aput v4, v6, v9

    .line 58
    invoke-static {v10, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [[I

    iput-object v6, v0, Ll/ۜ۠֡;->ܽ:[[I

    new-array v5, v5, [I

    const/16 v6, 0x102

    aput v6, v5, v7

    aput v4, v5, v9

    .line 63
    invoke-static {v10, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[I

    iput-object v4, v0, Ll/ۜ۠֡;->ᩳ:[[I

    const/4 v4, -0x1

    .line 73
    iput v4, v0, Ll/ۜ۠֡;->ܳ:I

    .line 78
    iput v4, v0, Ll/ۜ۠֡;->᩻:I

    move-object/from16 v4, p1

    .line 186
    iput-object v4, v0, Ll/ۜ۠֡;->֫:Ll/֫۠֡;

    .line 187
    iput-object v3, v0, Ll/ۜ۠֡;->᩷:[B

    .line 188
    aget-byte v3, v3, v9

    iput v3, v0, Ll/ۜ۠֡;->ܿ:I

    const/4 v3, 0x0

    .line 88
    :goto_0
    array-length v4, v2

    if-ge v3, v4, :cond_7

    .line 90
    iget-object v4, v0, Ll/ۜ۠֡;->ۧ:[[I

    aget-object v4, v4, v3

    .line 91
    iget-object v5, v0, Ll/ۜ۠֡;->ܽ:[[I

    aget-object v5, v5, v3

    .line 92
    iget-object v6, v0, Ll/ۜ۠֡;->ᩳ:[[I

    aget-object v6, v6, v3

    .line 94
    aget-object v9, v2, v3

    const/16 v10, 0x17

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1
    if-ge v11, v1, :cond_0

    .line 100
    aget-byte v13, v9, v11

    invoke-static {v13, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 101
    aget-byte v13, v9, v11

    invoke-static {v13, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 103
    :cond_0
    iget-object v11, v0, Ll/ۜ۠֡;->ۜ:[I

    aput v10, v11, v3

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v1, :cond_1

    .line 107
    aget-byte v13, v9, v11

    add-int/2addr v13, v7

    aget v14, v4, v13

    add-int/2addr v14, v7

    aput v14, v4, v13

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_1
    const/4 v11, 0x1

    :goto_3
    if-ge v11, v8, :cond_2

    .line 110
    aget v13, v4, v11

    add-int/lit8 v14, v11, -0x1

    aget v14, v4, v14

    add-int/2addr v13, v14

    aput v13, v4, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_2
    const/4 v11, 0x0

    move v13, v10

    :goto_4
    if-gt v13, v12, :cond_3

    add-int/lit8 v14, v13, 0x1

    .line 118
    aget v15, v4, v14

    aget v16, v4, v13

    sub-int v15, v15, v16

    add-int/2addr v15, v11

    sub-int v11, v11, v16

    .line 119
    aput v11, v4, v13

    add-int/lit8 v11, v15, -0x1

    .line 120
    aput v11, v5, v13

    shl-int/lit8 v11, v15, 0x1

    move v13, v14

    goto :goto_4

    :cond_3
    const/4 v4, 0x0

    :goto_5
    if-gt v10, v12, :cond_6

    const/4 v5, 0x0

    :goto_6
    if-ge v5, v1, :cond_5

    .line 128
    aget-byte v11, v9, v5

    if-ne v11, v10, :cond_4

    add-int/lit8 v11, v4, 0x1

    .line 129
    aput v5, v6, v4

    move v4, v11

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_7
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 8

    .line 149
    iget v0, p0, Ll/ۜ۠֡;->᩻:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۜ۠֡;->᩻:I

    rem-int/lit8 v0, v0, 0x32

    const-string v2, "Error decoding BZip2 block"

    if-nez v0, :cond_1

    .line 150
    iget v0, p0, Ll/ۜ۠֡;->ܳ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۜ۠֡;->ܳ:I

    .line 151
    iget-object v3, p0, Ll/ۜ۠֡;->᩷:[B

    array-length v4, v3

    if-eq v0, v4, :cond_0

    .line 154
    aget-byte v0, v3, v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Ll/ۜ۠֡;->ܿ:I

    goto :goto_0

    .line 152
    :cond_0
    new-instance v0, Ll/᩻۠֡;

    .line 20
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 152
    throw v0

    .line 157
    :cond_1
    :goto_0
    iget v0, p0, Ll/ۜ۠֡;->ܿ:I

    .line 158
    iget-object v3, p0, Ll/ۜ۠֡;->ܽ:[[I

    aget-object v3, v3, v0

    .line 159
    iget-object v4, p0, Ll/ۜ۠֡;->ۜ:[I

    aget v4, v4, v0

    .line 163
    iget-object v5, p0, Ll/ۜ۠֡;->֫:Ll/֫۠֡;

    invoke-virtual {v5, v4}, Ll/֫۠֡;->֫(I)I

    move-result v6

    :goto_1
    const/16 v7, 0x17

    if-gt v4, v7, :cond_3

    .line 165
    aget v7, v3, v4

    if-gt v6, v7, :cond_2

    .line 167
    iget-object v1, p0, Ll/ۜ۠֡;->ᩳ:[[I

    aget-object v1, v1, v0

    iget-object v2, p0, Ll/ۜ۠֡;->ۧ:[[I

    aget-object v0, v2, v0

    aget v0, v0, v4

    sub-int/2addr v6, v0

    aget v0, v1, v6

    return v0

    :cond_2
    shl-int/lit8 v6, v6, 0x1

    .line 169
    invoke-virtual {v5, v1}, Ll/֫۠֡;->֫(I)I

    move-result v7

    or-int/2addr v6, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 173
    :cond_3
    new-instance v0, Ll/᩻۠֡;

    .line 20
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 173
    throw v0
.end method
