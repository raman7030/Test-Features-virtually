.class public final Ll/۟ܺۧ;
.super Ljava/lang/Object;
.source "T8TF"


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/۟ܺۧ;->ۧ:Ll/ᩳ֨֫;

    return-void
.end method

.method private ۧ(Ll/ܺ᩷ۧ;)J
    .locals 7

    .line 92
    iget-object v0, p0, Ll/۟ܺۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 157
    invoke-virtual {p1, v2, v2, v3, v1}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 93
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    if-nez v1, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    const/16 v4, 0x80

    const/4 v5, 0x0

    :goto_0
    and-int v6, v1, v4

    if-nez v6, :cond_1

    shr-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    not-int v4, v4

    and-int/2addr v1, v4

    .line 104
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    .line 157
    invoke-virtual {p1, v2, v3, v5, v4}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    :goto_1
    if-ge v2, v5, :cond_2

    shl-int/lit8 p1, v1, 0x8

    .line 107
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    add-int/lit8 v2, v2, 0x1

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v1, p1

    goto :goto_1

    .line 109
    :cond_2
    iget p1, p0, Ll/۟ܺۧ;->֫:I

    add-int/2addr v5, v3

    add-int/2addr v5, p1

    iput v5, p0, Ll/۟ܺۧ;->֫:I

    int-to-long v0, v1

    return-wide v0
.end method


# virtual methods
.method public final ֫(Ll/ܺ᩷ۧ;)Z
    .locals 14

    .line 44
    invoke-virtual {p1}, Ll/ܺ᩷ۧ;->getLength()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    const-wide/16 v4, 0x400

    cmp-long v6, v0, v2

    if-eqz v6, :cond_1

    cmp-long v2, v0, v4

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-wide v4, v0

    :cond_1
    :goto_0
    long-to-int v2, v4

    .line 51
    iget-object v3, p0, Ll/۟ܺۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    const/4 v5, 0x0

    const/4 v7, 0x4

    .line 157
    invoke-virtual {p1, v5, v5, v7, v4}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 52
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v8

    .line 53
    iput v7, p0, Ll/۟ܺۧ;->֫:I

    :goto_1
    const-wide/32 v10, 0x1a45dfa3

    const/4 v4, 0x1

    cmp-long v7, v8, v10

    if-eqz v7, :cond_3

    .line 55
    iget v7, p0, Ll/۟ܺۧ;->֫:I

    add-int/2addr v7, v4

    iput v7, p0, Ll/۟ܺۧ;->֫:I

    if-ne v7, v2, :cond_2

    goto :goto_3

    .line 58
    :cond_2
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v7

    .line 157
    invoke-virtual {p1, v5, v5, v4, v7}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    const/16 v4, 0x8

    shl-long v7, v8, v4

    const-wide/16 v9, -0x100

    and-long/2addr v7, v9

    .line 60
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    aget-byte v4, v4, v5

    and-int/lit16 v4, v4, 0xff

    int-to-long v9, v4

    or-long v8, v7, v9

    goto :goto_1

    .line 64
    :cond_3
    invoke-direct {p0, p1}, Ll/۟ܺۧ;->ۧ(Ll/ܺ᩷ۧ;)J

    move-result-wide v2

    .line 65
    iget v7, p0, Ll/۟ܺۧ;->֫:I

    int-to-long v7, v7

    const-wide/high16 v9, -0x8000000000000000L

    cmp-long v11, v2, v9

    if-eqz v11, :cond_8

    if-eqz v6, :cond_4

    add-long v11, v7, v2

    cmp-long v6, v11, v0

    if-ltz v6, :cond_4

    goto :goto_3

    .line 72
    :cond_4
    :goto_2
    iget v0, p0, Ll/۟ܺۧ;->֫:I

    int-to-long v0, v0

    add-long v11, v7, v2

    cmp-long v6, v0, v11

    if-gez v6, :cond_7

    .line 73
    invoke-direct {p0, p1}, Ll/۟ܺۧ;->ۧ(Ll/ܺ᩷ۧ;)J

    move-result-wide v0

    cmp-long v6, v0, v9

    if-nez v6, :cond_5

    goto :goto_3

    .line 77
    :cond_5
    invoke-direct {p0, p1}, Ll/۟ܺۧ;->ۧ(Ll/ܺ᩷ۧ;)J

    move-result-wide v0

    const-wide/16 v11, 0x0

    cmp-long v6, v0, v11

    if-ltz v6, :cond_8

    const-wide/32 v11, 0x7fffffff

    cmp-long v13, v0, v11

    if-lez v13, :cond_6

    goto :goto_3

    :cond_6
    if-eqz v6, :cond_4

    long-to-int v1, v0

    .line 178
    invoke-virtual {p1, v1, v5}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    .line 84
    iget v0, p0, Ll/۟ܺۧ;->֫:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/۟ܺۧ;->֫:I

    goto :goto_2

    :cond_7
    if-nez v6, :cond_8

    return v4

    :cond_8
    :goto_3
    return v5
.end method
