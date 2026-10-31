.class public final Ll/ۚ۟ۜ;
.super Ljava/lang/Object;
.source "O73P"


# instance fields
.field public final ֫:[J

.field public final ۧ:[I

.field public final ܽ:[J


# direct methods
.method public constructor <init>([J[J[I)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/ۚ۟ۜ;->ܽ:[J

    .line 17
    iput-object p2, p0, Ll/ۚ۟ۜ;->֫:[J

    .line 18
    iput-object p3, p0, Ll/ۚ۟ۜ;->ۧ:[I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ۚ۟ۜ;->ܽ:[J

    array-length v0, v0

    return v0
.end method

.method public final ֫(J)I
    .locals 8

    .line 40
    iget-object v0, p0, Ll/ۚ۟ۜ;->ܽ:[J

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-gt v2, v1, :cond_1

    add-int v4, v2, v1

    ushr-int/lit8 v4, v4, 0x1

    .line 44
    aget-wide v5, v0, v4

    cmp-long v7, v5, p1

    if-gtz v7, :cond_0

    add-int/lit8 v2, v4, 0x1

    move v3, v4

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v4, -0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method public final ֫(I)J
    .locals 3

    .line 30
    iget-object v0, p0, Ll/ۚ۟ۜ;->֫:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public final ۧ(I)I
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۚ۟ۜ;->ۧ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ۧ()J
    .locals 2

    const/4 v0, 0x0

    .line 26
    iget-object v1, p0, Ll/ۚ۟ۜ;->ܽ:[J

    aget-wide v0, v1, v0

    return-wide v0
.end method
