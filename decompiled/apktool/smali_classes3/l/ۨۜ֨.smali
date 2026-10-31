.class public final Ll/ۨۜ֨;
.super Ljava/lang/Object;
.source "S1S1"


# static fields
.field public static final ᩷:[I


# instance fields
.field public final ֫:[I

.field public ۜ:I

.field public ۧ:I

.field public final ܳ:I

.field public final ܽ:[I

.field public final ܿ:I

.field public ᩳ:I

.field public final ᩻:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x100

    new-array v1, v0, [I

    .line 14
    sput-object v1, Ll/ۨۜ֨;->᩷:[I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    const/4 v2, 0x0

    move v3, v1

    :goto_1
    const/16 v4, 0x8

    if-ge v2, v4, :cond_1

    and-int/lit8 v4, v3, 0x1

    ushr-int/lit8 v3, v3, 0x1

    if-eqz v4, :cond_0

    const v4, -0x12477ce0

    xor-int/2addr v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 27
    :cond_1
    sget-object v2, Ll/ۨۜ֨;->᩷:[I

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public constructor <init>(ILl/ۘ᩻֨;)V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 25
    iput v0, p0, Ll/ۨۜ֨;->ۧ:I

    .line 26
    iput v0, p0, Ll/ۨۜ֨;->ᩳ:I

    .line 27
    iput v0, p0, Ll/ۨۜ֨;->ۜ:I

    const/16 v0, 0x400

    const/4 v1, 0x1

    .line 50
    invoke-virtual {p2, v0, v1}, Ll/ۘ᩻֨;->֫(IZ)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۨۜ֨;->֫:[I

    const/high16 v0, 0x10000

    .line 51
    invoke-virtual {p2, v0, v1}, Ll/ۘ᩻֨;->֫(IZ)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۨۜ֨;->ܽ:[I

    sub-int/2addr p1, v1

    ushr-int/lit8 v0, p1, 0x1

    or-int/2addr p1, v0

    ushr-int/lit8 v0, p1, 0x2

    or-int/2addr p1, v0

    ushr-int/lit8 v0, p1, 0x4

    or-int/2addr p1, v0

    ushr-int/lit8 v0, p1, 0x8

    or-int/2addr p1, v0

    ushr-int/2addr p1, v1

    const v0, 0xffff

    or-int/2addr p1, v0

    const/high16 v0, 0x1000000

    if-le p1, v0, :cond_0

    ushr-int/lit8 p1, p1, 0x1

    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 53
    iput v0, p0, Ll/ۨۜ֨;->ܳ:I

    .line 54
    invoke-virtual {p2, v0, v1}, Ll/ۘ᩻֨;->֫(IZ)[I

    move-result-object p2

    iput-object p2, p0, Ll/ۨۜ֨;->᩻:[I

    .line 55
    iput p1, p0, Ll/ۨۜ֨;->ܿ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 76
    iget-object v0, p0, Ll/ۨۜ֨;->֫:[I

    iget v1, p0, Ll/ۨۜ֨;->ۧ:I

    aget v0, v0, v1

    return v0
.end method

.method public final ֫(I)V
    .locals 2

    .line 94
    iget-object v0, p0, Ll/ۨۜ֨;->֫:[I

    const/16 v1, 0x400

    invoke-static {v1, p1, v0}, Ll/ܰۜ֨;->֫(II[I)V

    .line 95
    iget-object v0, p0, Ll/ۨۜ֨;->ܽ:[I

    const/high16 v1, 0x10000

    invoke-static {v1, p1, v0}, Ll/ܰۜ֨;->֫(II[I)V

    .line 96
    iget-object v0, p0, Ll/ۨۜ֨;->᩻:[I

    iget v1, p0, Ll/ۨۜ֨;->ܳ:I

    invoke-static {v1, p1, v0}, Ll/ܰۜ֨;->֫(II[I)V

    return-void
.end method

.method public final ֫(I[B)V
    .locals 3

    .line 65
    aget-byte v0, p2, p1

    and-int/lit16 v0, v0, 0xff

    sget-object v1, Ll/ۨۜ֨;->᩷:[I

    aget v0, v1, v0

    add-int/lit8 v2, p1, 0x1

    aget-byte v2, p2, v2

    and-int/lit16 v2, v2, 0xff

    xor-int/2addr v0, v2

    and-int/lit16 v2, v0, 0x3ff

    .line 66
    iput v2, p0, Ll/ۨۜ֨;->ۧ:I

    add-int/lit8 v2, p1, 0x2

    .line 68
    aget-byte v2, p2, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    xor-int/2addr v0, v2

    const v2, 0xffff

    and-int/2addr v2, v0

    .line 69
    iput v2, p0, Ll/ۨۜ֨;->ᩳ:I

    add-int/lit8 p1, p1, 0x3

    .line 71
    aget-byte p1, p2, p1

    and-int/lit16 p1, p1, 0xff

    aget p1, v1, p1

    shl-int/lit8 p1, p1, 0x5

    xor-int/2addr p1, v0

    .line 72
    iget p2, p0, Ll/ۨۜ֨;->ܿ:I

    and-int/2addr p1, p2

    iput p1, p0, Ll/ۨۜ֨;->ۜ:I

    return-void
.end method

.method public final ֫(Ll/ۘ᩻֨;)V
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ۨۜ֨;->᩻:[I

    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫([I)V

    .line 60
    iget-object v0, p0, Ll/ۨۜ֨;->ܽ:[I

    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫([I)V

    .line 61
    iget-object v0, p0, Ll/ۨۜ֨;->֫:[I

    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫([I)V

    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 80
    iget-object v0, p0, Ll/ۨۜ֨;->ܽ:[I

    iget v1, p0, Ll/ۨۜ֨;->ᩳ:I

    aget v0, v0, v1

    return v0
.end method

.method public final ۧ(I)V
    .locals 2

    .line 88
    iget-object v0, p0, Ll/ۨۜ֨;->֫:[I

    iget v1, p0, Ll/ۨۜ֨;->ۧ:I

    aput p1, v0, v1

    .line 89
    iget-object v0, p0, Ll/ۨۜ֨;->ܽ:[I

    iget v1, p0, Ll/ۨۜ֨;->ᩳ:I

    aput p1, v0, v1

    .line 90
    iget-object v0, p0, Ll/ۨۜ֨;->᩻:[I

    iget v1, p0, Ll/ۨۜ֨;->ۜ:I

    aput p1, v0, v1

    return-void
.end method

.method public final ܽ()I
    .locals 2

    .line 84
    iget-object v0, p0, Ll/ۨۜ֨;->᩻:[I

    iget v1, p0, Ll/ۨۜ֨;->ۜ:I

    aget v0, v0, v1

    return v0
.end method
