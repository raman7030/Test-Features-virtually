.class public final Ll/᩷ۚۧ;
.super Ljava/lang/Object;
.source "Q8H5"


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

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Ll/ۢ֨֫;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۢ֨֫;-><init>(J)V

    iput-object v0, p0, Ll/᩷ۚۧ;->ۜ:Ll/ۢ֨֫;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    iput-wide v0, p0, Ll/᩷ۚۧ;->ۧ:J

    .line 59
    iput-wide v0, p0, Ll/᩷ۚۧ;->ܳ:J

    .line 60
    iput-wide v0, p0, Ll/᩷ۚۧ;->֫:J

    .line 61
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/᩷ۚۧ;->᩻:Ll/ᩳ֨֫;

    return-void
.end method

.method private ֫(Ll/۠᩷ۧ;)V
    .locals 3

    .line 123
    sget-object v0, Ll/ۘ֨֫;->ܿ:[B

    iget-object v1, p0, Ll/᩷ۚۧ;->᩻:Ll/ᩳ֨֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    array-length v2, v0

    invoke-virtual {v1, v2, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    const/4 v0, 0x1

    .line 124
    iput-boolean v0, p0, Ll/᩷ۚۧ;->ܽ:Z

    .line 125
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;I)I
    .locals 12

    const/4 v0, 0x0

    if-gtz p3, :cond_0

    .line 85
    invoke-direct {p0, p1}, Ll/᩷ۚۧ;->֫(Ll/۠᩷ۧ;)V

    return v0

    .line 87
    :cond_0
    iget-boolean v1, p0, Ll/᩷ۚۧ;->ܿ:Z

    const/16 v2, 0x47

    const v3, 0x1b8a0

    const/4 v4, 0x1

    iget-object v5, p0, Ll/᩷ۚۧ;->᩻:Ll/ᩳ֨֫;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v1, :cond_7

    .line 166
    invoke-interface {p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v8

    int-to-long v10, v3

    .line 167
    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    long-to-int v1, v10

    int-to-long v10, v1

    sub-long/2addr v8, v10

    .line 169
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v10

    cmp-long v3, v10, v8

    if-eqz v3, :cond_1

    .line 170
    iput-wide v8, p2, Ll/᩻ۢۧ;->֫:J

    return v4

    .line 174
    :cond_1
    invoke-virtual {v5, v1}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 175
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 176
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 184
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p1

    .line 185
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܿ()I

    move-result p2

    add-int/lit16 v1, p2, -0xbc

    :goto_0
    if-lt v1, p1, :cond_6

    .line 192
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    const/4 v8, -0x4

    const/4 v9, 0x0

    :goto_1
    const/4 v10, 0x4

    if-gt v8, v10, :cond_5

    mul-int/lit16 v10, v8, 0xbc

    add-int/2addr v10, v1

    if-lt v10, p1, :cond_3

    if-ge v10, p2, :cond_3

    .line 47
    aget-byte v10, v3, v10

    if-eq v10, v2, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v9, v4

    const/4 v10, 0x5

    if-ne v9, v10, :cond_4

    .line 195
    invoke-static {v5, v1, p3}, Ll/ۨܺܺ;->֫(Ll/ᩳ֨֫;II)J

    move-result-wide v8

    cmp-long v3, v8, v6

    if-eqz v3, :cond_5

    move-wide v6, v8

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v9, 0x0

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 178
    :cond_6
    :goto_3
    iput-wide v6, p0, Ll/᩷ۚۧ;->ܳ:J

    .line 179
    iput-boolean v4, p0, Ll/᩷ۚۧ;->ܿ:Z

    return v0

    .line 90
    :cond_7
    iget-wide v8, p0, Ll/᩷ۚۧ;->ܳ:J

    cmp-long v1, v8, v6

    if-nez v1, :cond_8

    .line 91
    invoke-direct {p0, p1}, Ll/᩷ۚۧ;->֫(Ll/۠᩷ۧ;)V

    return v0

    .line 93
    :cond_8
    iget-boolean v1, p0, Ll/᩷ۚۧ;->ᩳ:Z

    if-nez v1, :cond_d

    int-to-long v8, v3

    .line 131
    invoke-interface {p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    long-to-int v1, v8

    .line 133
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v8

    int-to-long v10, v0

    cmp-long v3, v8, v10

    if-eqz v3, :cond_9

    .line 134
    iput-wide v10, p2, Ll/᩻ۢۧ;->֫:J

    return v4

    .line 138
    :cond_9
    invoke-virtual {v5, v1}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 139
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 140
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 148
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p1

    .line 149
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܿ()I

    move-result p2

    :goto_4
    if-ge p1, p2, :cond_c

    .line 153
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    aget-byte v1, v1, p1

    if-eq v1, v2, :cond_a

    goto :goto_5

    .line 156
    :cond_a
    invoke-static {v5, p1, p3}, Ll/ۨܺܺ;->֫(Ll/ᩳ֨֫;II)J

    move-result-wide v8

    cmp-long v1, v8, v6

    if-eqz v1, :cond_b

    move-wide v6, v8

    goto :goto_6

    :cond_b
    :goto_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    .line 142
    :cond_c
    :goto_6
    iput-wide v6, p0, Ll/᩷ۚۧ;->ۧ:J

    .line 143
    iput-boolean v4, p0, Ll/᩷ۚۧ;->ᩳ:Z

    return v0

    .line 96
    :cond_d
    iget-wide p2, p0, Ll/᩷ۚۧ;->ۧ:J

    cmp-long v1, p2, v6

    if-nez v1, :cond_e

    .line 97
    invoke-direct {p0, p1}, Ll/᩷ۚۧ;->֫(Ll/۠᩷ۧ;)V

    return v0

    .line 100
    :cond_e
    iget-object v1, p0, Ll/᩷ۚۧ;->ۜ:Ll/ۢ֨֫;

    invoke-virtual {v1, p2, p3}, Ll/ۢ֨֫;->ۧ(J)J

    move-result-wide p2

    .line 101
    iget-wide v2, p0, Ll/᩷ۚۧ;->ܳ:J

    .line 102
    invoke-virtual {v1, v2, v3}, Ll/ۢ֨֫;->ܽ(J)J

    move-result-wide v1

    sub-long/2addr v1, p2

    .line 103
    iput-wide v1, p0, Ll/᩷ۚۧ;->֫:J

    .line 104
    invoke-direct {p0, p1}, Ll/᩷ۚۧ;->֫(Ll/۠᩷ۧ;)V

    return v0
.end method

.method public final ֫()J
    .locals 2

    .line 111
    iget-wide v0, p0, Ll/᩷ۚۧ;->֫:J

    return-wide v0
.end method

.method public final ۧ()Ll/ۢ֨֫;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/᩷ۚۧ;->ۜ:Ll/ۢ֨֫;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 66
    iget-boolean v0, p0, Ll/᩷ۚۧ;->ܽ:Z

    return v0
.end method
