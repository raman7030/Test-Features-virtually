.class public abstract Ll/ۚ᩷֨;
.super Ll/ۜ᩺ۘ;
.source "01SB"


# instance fields
.field public ֫:I

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Ll/ۚ᩷֨;->ۧ:I

    .line 12
    iput v0, p0, Ll/ۚ᩷֨;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 5

    const/4 v0, 0x0

    .line 66
    :cond_0
    invoke-virtual {p0}, Ll/ۚ᩷֨;->֫()V

    .line 68
    iget v1, p0, Ll/ۚ᩷֨;->ۧ:I

    ushr-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۚ᩷֨;->ۧ:I

    .line 69
    iget v2, p0, Ll/ۚ᩷֨;->֫:I

    sub-int v3, v2, v1

    ushr-int/lit8 v3, v3, 0x1f

    add-int/lit8 v4, v3, -0x1

    and-int/2addr v1, v4

    sub-int/2addr v2, v1

    .line 70
    iput v2, p0, Ll/ۚ᩷֨;->֫:I

    shl-int/lit8 v0, v0, 0x1

    rsub-int/lit8 v1, v3, 0x1

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, -0x1

    if-nez p1, :cond_0

    return v0
.end method

.method public final ֫([SI)I
    .locals 4

    .line 17
    invoke-virtual {p0}, Ll/ۚ᩷֨;->֫()V

    .line 19
    aget-short v0, p1, p2

    .line 20
    iget v1, p0, Ll/ۚ᩷֨;->ۧ:I

    ushr-int/lit8 v1, v1, 0xb

    mul-int v1, v1, v0

    .line 23
    iget v2, p0, Ll/ۚ᩷֨;->֫:I

    const/high16 v3, -0x80000000

    xor-int/2addr v2, v3

    xor-int/2addr v3, v1

    .line 0
    invoke-static {v2, v3}, Ljava/lang/Integer;->compare(II)I

    move-result v2

    if-gez v2, :cond_0

    .line 24
    iput v1, p0, Ll/ۚ᩷֨;->ۧ:I

    rsub-int v1, v0, 0x800

    ushr-int/lit8 v1, v1, 0x5

    add-int/2addr v0, v1

    int-to-short v0, v0

    .line 25
    aput-short v0, p1, p2

    const/4 p1, 0x0

    return p1

    .line 29
    :cond_0
    iget v2, p0, Ll/ۚ᩷֨;->ۧ:I

    sub-int/2addr v2, v1

    iput v2, p0, Ll/ۚ᩷֨;->ۧ:I

    .line 30
    iget v2, p0, Ll/ۚ᩷֨;->֫:I

    sub-int/2addr v2, v1

    iput v2, p0, Ll/ۚ᩷֨;->֫:I

    ushr-int/lit8 v1, v0, 0x5

    sub-int/2addr v0, v1

    int-to-short v0, v0

    .line 31
    aput-short v0, p1, p2

    const/4 p1, 0x1

    return p1
.end method

.method public abstract ֫()V
.end method

.method public final ۧ([S)I
    .locals 2

    const/4 v0, 0x1

    :cond_0
    shl-int/lit8 v1, v0, 0x1

    .line 42
    invoke-virtual {p0, p1, v0}, Ll/ۚ᩷֨;->֫([SI)I

    move-result v0

    or-int/2addr v0, v1

    .line 43
    array-length v1, p1

    if-lt v0, v1, :cond_0

    .line 45
    array-length p1, p1

    sub-int/2addr v0, p1

    return v0
.end method
