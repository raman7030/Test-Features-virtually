.class public final Ll/ۧ۟ۜ;
.super Ljava/lang/Object;
.source "A78P"


# instance fields
.field public final ֫:Ll/᩷᩷ۧ;

.field public final ۧ:J


# direct methods
.method public constructor <init>(Ll/᩷᩷ۧ;J)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/ۧ۟ۜ;->֫:Ll/᩷᩷ۧ;

    .line 18
    iput-wide p2, p0, Ll/ۧ۟ۜ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 40
    iget-object v0, p0, Ll/ۧ۟ۜ;->֫:Ll/᩷᩷ۧ;

    iget v0, v0, Ll/᩷᩷ۧ;->ܽ:I

    return v0
.end method

.method public final ֫(J)I
    .locals 9

    .line 68
    iget-object v0, p0, Ll/ۧ۟ۜ;->֫:Ll/᩷᩷ۧ;

    iget v1, v0, Ll/᩷᩷ۧ;->ܽ:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v1, v3, :cond_3

    iget-object v4, v0, Ll/᩷᩷ۧ;->ܳ:[J

    aget-wide v5, v4, v2

    cmp-long v4, p1, v5

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    sub-int/2addr v1, v3

    const/4 v4, 0x0

    :goto_0
    if-gt v4, v1, :cond_2

    add-int v5, v4, v1

    ushr-int/2addr v5, v3

    .line 75
    iget-object v6, v0, Ll/᩷᩷ۧ;->ܳ:[J

    aget-wide v7, v6, v5

    cmp-long v6, v7, p1

    if-gtz v6, :cond_1

    add-int/lit8 v4, v5, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v5, -0x1

    goto :goto_0

    .line 82
    :cond_2
    iget p1, v0, Ll/᩷᩷ۧ;->ܽ:I

    sub-int/2addr p1, v3

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_3
    :goto_1
    return v2
.end method

.method public final ֫(I)J
    .locals 3

    .line 47
    iget-object v0, p0, Ll/ۧ۟ۜ;->֫:Ll/᩷᩷ۧ;

    iget-object v0, v0, Ll/᩷᩷ۧ;->ᩳ:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public final ۧ(I)I
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ۧ۟ۜ;->֫:Ll/᩷᩷ۧ;

    iget-object v0, v0, Ll/᩷᩷ۧ;->ܿ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ۧ()J
    .locals 2

    .line 33
    iget-wide v0, p0, Ll/ۧ۟ۜ;->ۧ:J

    return-wide v0
.end method

.method public final ܽ(I)J
    .locals 3

    .line 61
    iget-object v0, p0, Ll/ۧ۟ۜ;->֫:Ll/᩷᩷ۧ;

    iget-object v0, v0, Ll/᩷᩷ۧ;->ܳ:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method
