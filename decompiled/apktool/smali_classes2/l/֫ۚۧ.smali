.class public final Ll/֫ۚۧ;
.super Ljava/lang/Object;
.source "E8QC"


# instance fields
.field public ֫:J

.field public final ۜ:Ll/ۢ֨֫;

.field public ۧ:J

.field public ܳ:J

.field public ܽ:Z

.field public ܿ:Z

.field public ᩳ:Z

.field public final ᩻:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ll/ۢ֨֫;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۢ֨֫;-><init>(J)V

    iput-object v0, p0, Ll/֫ۚۧ;->ۜ:Ll/ۢ֨֫;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    iput-wide v0, p0, Ll/֫ۚۧ;->ۧ:J

    .line 62
    iput-wide v0, p0, Ll/֫ۚۧ;->ܳ:J

    .line 63
    iput-wide v0, p0, Ll/֫ۚۧ;->֫:J

    .line 64
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/֫ۚۧ;->᩻:Ll/ᩳ֨֫;

    return-void
.end method

.method public static ֫(I[B)I
    .locals 2

    .line 216
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static ֫(Ll/ᩳ֨֫;)J
    .locals 17

    move-object/from16 v0, p0

    .line 121
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 122
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v5, 0x9

    if-ge v2, v5, :cond_0

    return-wide v3

    :cond_0
    new-array v2, v5, [B

    const/4 v6, 0x0

    .line 127
    invoke-virtual {v0, v6, v5, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 128
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 224
    aget-byte v0, v2, v6

    and-int/lit16 v1, v0, 0xc4

    const/16 v5, 0x44

    if-eq v1, v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    .line 229
    aget-byte v1, v2, v1

    and-int/lit8 v5, v1, 0x4

    const/4 v6, 0x4

    if-eq v5, v6, :cond_2

    goto :goto_0

    .line 234
    :cond_2
    aget-byte v5, v2, v6

    and-int/lit8 v7, v5, 0x4

    if-eq v7, v6, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x5

    .line 238
    aget-byte v7, v2, v6

    const/4 v8, 0x1

    and-int/2addr v7, v8

    if-eq v7, v8, :cond_4

    goto :goto_0

    :cond_4
    const/16 v7, 0x8

    .line 243
    aget-byte v7, v2, v7

    const/4 v9, 0x3

    and-int/2addr v7, v9

    if-ne v7, v9, :cond_5

    int-to-long v3, v0

    const-wide/16 v10, 0x38

    and-long/2addr v10, v3

    shr-long/2addr v10, v9

    const/16 v0, 0x1e

    shl-long/2addr v10, v0

    const-wide/16 v12, 0x3

    and-long/2addr v3, v12

    const/16 v0, 0x1c

    shl-long/2addr v3, v0

    or-long/2addr v3, v10

    .line 254
    aget-byte v0, v2, v8

    int-to-long v7, v0

    const-wide/16 v10, 0xff

    and-long/2addr v7, v10

    const/16 v0, 0x14

    shl-long/2addr v7, v0

    or-long/2addr v3, v7

    int-to-long v0, v1

    const-wide/16 v7, 0xf8

    and-long v14, v0, v7

    shr-long/2addr v14, v9

    const/16 v16, 0xf

    shl-long v14, v14, v16

    or-long/2addr v3, v14

    and-long/2addr v0, v12

    const/16 v12, 0xd

    shl-long/2addr v0, v12

    or-long/2addr v0, v3

    aget-byte v2, v2, v9

    int-to-long v2, v2

    and-long/2addr v2, v10

    shl-long/2addr v2, v6

    or-long/2addr v0, v2

    int-to-long v2, v5

    and-long/2addr v2, v7

    shr-long/2addr v2, v9

    or-long/2addr v0, v2

    return-wide v0

    :cond_5
    :goto_0
    return-wide v3
.end method

.method private ֫(Ll/۠᩷ۧ;)V
    .locals 3

    .line 136
    sget-object v0, Ll/ۘ֨֫;->ܿ:[B

    iget-object v1, p0, Ll/֫ۚۧ;->᩻:Ll/ᩳ֨֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    array-length v2, v0

    invoke-virtual {v1, v2, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    const/4 v0, 0x1

    .line 137
    iput-boolean v0, p0, Ll/֫ۚۧ;->ܽ:Z

    .line 138
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 12

    .line 91
    iget-boolean v0, p0, Ll/֫ۚۧ;->ܿ:Z

    const/16 v1, 0x1ba

    const-wide/16 v2, 0x4e20

    iget-object v4, p0, Ll/֫ۚۧ;->᩻:Ll/ᩳ֨֫;

    const/4 v5, 0x1

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    if-nez v0, :cond_3

    .line 180
    invoke-interface {p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v9

    .line 181
    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    int-to-long v2, v0

    sub-long/2addr v9, v2

    .line 183
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    cmp-long v11, v2, v9

    if-eqz v11, :cond_0

    .line 184
    iput-wide v9, p2, Ll/᩻ۢۧ;->֫:J

    return v5

    .line 188
    :cond_0
    invoke-virtual {v4, v0}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 189
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 190
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p2

    invoke-interface {p1, v8, v0, p2}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 198
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p1

    .line 199
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܿ()I

    move-result p2

    add-int/lit8 p2, p2, -0x4

    :goto_0
    if-lt p2, p1, :cond_2

    .line 203
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    invoke-static {p2, v0}, Ll/֫ۚۧ;->֫(I[B)I

    move-result v0

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, p2, 0x4

    .line 205
    invoke-virtual {v4, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 206
    invoke-static {v4}, Ll/֫ۚۧ;->֫(Ll/ᩳ֨֫;)J

    move-result-wide v2

    cmp-long v0, v2, v6

    if-eqz v0, :cond_1

    move-wide v6, v2

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    .line 192
    :cond_2
    :goto_1
    iput-wide v6, p0, Ll/֫ۚۧ;->ܳ:J

    .line 193
    iput-boolean v5, p0, Ll/֫ۚۧ;->ܿ:Z

    return v8

    .line 94
    :cond_3
    iget-wide v9, p0, Ll/֫ۚۧ;->ܳ:J

    cmp-long v0, v9, v6

    if-nez v0, :cond_4

    .line 95
    invoke-direct {p0, p1}, Ll/֫ۚۧ;->֫(Ll/۠᩷ۧ;)V

    return v8

    .line 97
    :cond_4
    iget-boolean v0, p0, Ll/֫ۚۧ;->ᩳ:Z

    if-nez v0, :cond_8

    .line 144
    invoke-interface {p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v9

    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    .line 146
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    int-to-long v9, v8

    cmp-long v11, v2, v9

    if-eqz v11, :cond_5

    .line 147
    iput-wide v9, p2, Ll/᩻ۢۧ;->֫:J

    return v5

    .line 151
    :cond_5
    invoke-virtual {v4, v0}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 152
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 153
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p2

    invoke-interface {p1, v8, v0, p2}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 161
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p1

    .line 162
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܿ()I

    move-result p2

    :goto_2
    add-int/lit8 v0, p2, -0x3

    if-ge p1, v0, :cond_7

    .line 166
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    invoke-static {p1, v0}, Ll/֫ۚۧ;->֫(I[B)I

    move-result v0

    if-ne v0, v1, :cond_6

    add-int/lit8 v0, p1, 0x4

    .line 168
    invoke-virtual {v4, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 169
    invoke-static {v4}, Ll/֫ۚۧ;->֫(Ll/ᩳ֨֫;)J

    move-result-wide v2

    cmp-long v0, v2, v6

    if-eqz v0, :cond_6

    move-wide v6, v2

    goto :goto_3

    :cond_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    .line 155
    :cond_7
    :goto_3
    iput-wide v6, p0, Ll/֫ۚۧ;->ۧ:J

    .line 156
    iput-boolean v5, p0, Ll/֫ۚۧ;->ᩳ:Z

    return v8

    .line 100
    :cond_8
    iget-wide v0, p0, Ll/֫ۚۧ;->ۧ:J

    cmp-long p2, v0, v6

    if-nez p2, :cond_9

    .line 101
    invoke-direct {p0, p1}, Ll/֫ۚۧ;->֫(Ll/۠᩷ۧ;)V

    return v8

    .line 104
    :cond_9
    iget-object p2, p0, Ll/֫ۚۧ;->ۜ:Ll/ۢ֨֫;

    invoke-virtual {p2, v0, v1}, Ll/ۢ֨֫;->ۧ(J)J

    move-result-wide v0

    .line 105
    iget-wide v2, p0, Ll/֫ۚۧ;->ܳ:J

    .line 106
    invoke-virtual {p2, v2, v3}, Ll/ۢ֨֫;->ܽ(J)J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 107
    iput-wide v2, p0, Ll/֫ۚۧ;->֫:J

    .line 108
    invoke-direct {p0, p1}, Ll/֫ۚۧ;->֫(Ll/۠᩷ۧ;)V

    return v8
.end method

.method public final ֫()J
    .locals 2

    .line 113
    iget-wide v0, p0, Ll/֫ۚۧ;->֫:J

    return-wide v0
.end method

.method public final ۧ()Ll/ۢ֨֫;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/֫ۚۧ;->ۜ:Ll/ۢ֨֫;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 69
    iget-boolean v0, p0, Ll/֫ۚۧ;->ܽ:Z

    return v0
.end method
