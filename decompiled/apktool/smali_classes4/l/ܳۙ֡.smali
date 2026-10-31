.class public final Ll/ܳۙ֡;
.super Ll/ܽۙ֡;
.source "H55A"


# instance fields
.field public final ᩸:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ll/ܽۙ֡;-><init>()V

    .line 57
    iput p1, p0, Ll/ܳۙ֡;->᩸:F

    return-void
.end method

.method public constructor <init>(Ll/ۧۗ֡;B)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ll/ܽۙ֡;-><init>()V

    add-int/lit8 p2, p2, 0x1

    .line 47
    invoke-virtual {p1, p2}, Ll/ۧۗ֡;->ۧ(I)[B

    move-result-object p1

    invoke-static {p1}, Ll/ۗ᩻ۚ;->֫([B)J

    move-result-wide p1

    const/16 v0, 0x20

    shr-long/2addr p1, v0

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    long-to-int p2, p1

    .line 48
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    iput p1, p0, Ll/ܳۙ֡;->᩸:F

    return-void
.end method


# virtual methods
.method public final hashCode()I
    .locals 1

    .line 101
    iget v0, p0, Ll/ܳۙ֡;->᩸:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    return v0
.end method

.method public final ֫(I)I
    .locals 3

    add-int/lit8 p1, p1, 0x1

    .line 79
    iget v0, p0, Ll/ܳۙ֡;->᩸:F

    .line 80
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    .line 79
    invoke-static {v0, v1}, Ll/ۗ᩻ۚ;->ᩳ(J)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public final ֫(Ll/֫ۗ֡;)V
    .locals 3

    .line 64
    iget v0, p0, Ll/ܳۙ֡;->᩸:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    invoke-static {v0, v1}, Ll/ۗ᩻ۚ;->֫(J)[B

    move-result-object v0

    .line 71
    sget-object v1, Ll/ۘۙ֡;->᩺:Ll/ۘۙ֡;

    iget-byte v1, v1, Ll/ۘۙ֡;->᩸:B

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    shl-int/lit8 v2, v2, 0x5

    or-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ۧ(I)V

    const/4 v1, 0x0

    .line 347
    array-length v2, v0

    invoke-virtual {p1, v0, v1, v2}, Ll/֫ۗ֡;->֫([BII)V

    return-void
.end method

.method public final ۖ()Ll/ۘۙ֡;
    .locals 1

    .line 96
    sget-object v0, Ll/ۘۙ֡;->᩺:Ll/ۘۙ֡;

    return-object v0
.end method

.method public final ۧ(Ll/ܽۙ֡;)I
    .locals 1

    .line 87
    check-cast p1, Ll/ܳۙ֡;

    .line 89
    iget v0, p0, Ll/ܳۙ֡;->᩸:F

    iget p1, p1, Ll/ܳۙ֡;->᩸:F

    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method
