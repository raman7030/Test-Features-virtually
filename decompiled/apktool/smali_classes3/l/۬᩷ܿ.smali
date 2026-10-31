.class public final Ll/۬᩷ܿ;
.super Ljava/lang/Object;
.source "M6ZT"


# instance fields
.field public final ֫:[J

.field public final ۧ:[J

.field public final ܽ:[J

.field public final ᩳ:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Ll/۬᩷ܿ;->ᩳ:I

    .line 17
    new-array v0, p1, [J

    iput-object v0, p0, Ll/۬᩷ܿ;->֫:[J

    mul-int/lit16 v0, p1, 0x80

    .line 18
    new-array v0, v0, [J

    iput-object v0, p0, Ll/۬᩷ܿ;->ۧ:[J

    .line 19
    new-array p1, p1, [J

    iput-object p1, p0, Ll/۬᩷ܿ;->ܽ:[J

    return-void
.end method

.method public static ֫([Ll/۟ۘܽ;)Ll/۬᩷ܿ;
    .locals 13

    .line 25
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_5

    aget-object v3, p0, v2

    .line 26
    invoke-virtual {v3}, Ll/۟ۘܽ;->ܿ()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v3}, Ll/۟ۘܽ;->ᩳ()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v3}, Ll/۟ۘܽ;->֫()Z

    move-result v3

    if-nez v3, :cond_4

    .line 34
    new-instance v0, Ll/۬᩷ܿ;

    array-length v2, p0

    add-int/lit8 v2, v2, 0x3f

    ushr-int/lit8 v2, v2, 0x6

    invoke-direct {v0, v2}, Ll/۬᩷ܿ;-><init>(I)V

    .line 36
    :goto_1
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 37
    aget-object v2, p0, v1

    ushr-int/lit8 v3, v1, 0x6

    and-int/lit8 v4, v1, 0x3f

    const-wide/16 v5, 0x1

    shl-long v11, v5, v4

    .line 63
    invoke-virtual {v2}, Ll/۟ۘܽ;->ܿ()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2}, Ll/۟ۘܽ;->ᩳ()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2}, Ll/۟ۘܽ;->֫()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_2

    .line 67
    :cond_0
    invoke-virtual {v2}, Ll/۟ۘܽ;->ܽ()J

    move-result-wide v7

    const/4 v5, 0x0

    move-object v4, v0

    move v6, v3

    move-wide v9, v11

    invoke-direct/range {v4 .. v10}, Ll/۬᩷ܿ;->֫(IIJJ)V

    .line 68
    invoke-virtual {v2}, Ll/۟ۘܽ;->ۧ()J

    move-result-wide v7

    const/16 v5, 0x40

    invoke-direct/range {v4 .. v10}, Ll/۬᩷ܿ;->֫(IIJJ)V

    .line 69
    invoke-virtual {v2}, Ll/۟ۘܽ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 70
    iget-object v2, v0, Ll/۬᩷ܿ;->ܽ:[J

    aget-wide v4, v2, v3

    or-long/2addr v4, v11

    aput-wide v4, v2, v3

    goto :goto_3

    .line 64
    :cond_1
    :goto_2
    iget-object v2, v0, Ll/۬᩷ܿ;->֫:[J

    aget-wide v4, v2, v3

    or-long/2addr v4, v11

    aput-wide v4, v2, v3

    :cond_2
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-object v0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method private ֫(IIJJ)V
    .locals 4

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-eqz v2, :cond_0

    .line 77
    invoke-static {p3, p4}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v0

    add-int/2addr v0, p1

    const-wide/16 v1, 0x1

    sub-long v1, p3, v1

    and-long/2addr p3, v1

    .line 79
    iget v1, p0, Ll/۬᩷ܿ;->ᩳ:I

    mul-int v0, v0, v1

    add-int/2addr v0, p2

    iget-object v1, p0, Ll/۬᩷ܿ;->ۧ:[J

    aget-wide v2, v1, v0

    or-long/2addr v2, p5

    aput-wide v2, v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 43
    iget v0, p0, Ll/۬᩷ܿ;->ᩳ:I

    return v0
.end method

.method public final ֫(II)J
    .locals 5

    .line 48
    iget-object v0, p0, Ll/۬᩷ܿ;->֫:[J

    aget-wide v1, v0, p1

    if-ltz p2, :cond_1

    const/16 v0, 0x80

    if-ge p2, v0, :cond_0

    .line 51
    iget v0, p0, Ll/۬᩷ܿ;->ᩳ:I

    mul-int p2, p2, v0

    add-int/2addr p2, p1

    iget-object p1, p0, Ll/۬᩷ܿ;->ۧ:[J

    aget-wide v3, p1, p2

    or-long p1, v1, v3

    return-wide p1

    .line 53
    :cond_0
    iget-object p2, p0, Ll/۬᩷ܿ;->ܽ:[J

    aget-wide p1, p2, p1

    or-long/2addr p1, v1

    return-wide p1

    :cond_1
    return-wide v1
.end method
