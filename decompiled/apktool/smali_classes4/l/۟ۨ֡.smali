.class public final Ll/۟ۨ֡;
.super Ll/᩺ۤ֡;
.source "398Q"


# instance fields
.field public final synthetic ۙ:Ll/ۖۗ᩻;


# direct methods
.method public constructor <init>([BLl/ۖۗ᩻;)V
    .locals 0

    .line 25
    iput-object p2, p0, Ll/۟ۨ֡;->ۙ:Ll/ۖۗ᩻;

    const/4 p2, 0x0

    .line 44
    invoke-direct {p0, p1, p2}, Ll/᩺ۤ֡;-><init>([BI)V

    return-void
.end method


# virtual methods
.method public final ۜ(I)I
    .locals 5

    add-int/lit8 v0, p1, -0x38

    rsub-int/lit8 v1, p1, 0x5f

    or-int/2addr v0, v1

    ushr-int/lit8 v0, v0, 0x1f

    if-nez v0, :cond_0

    .line 29
    invoke-virtual {p0, p1}, Ll/᩺ۤ֡;->֫(I)B

    move-result v0

    iget-object v1, p0, Ll/۟ۨ֡;->ۙ:Ll/ۖۗ᩻;

    invoke-interface {v1, p1}, Ll/ۖۗ᩻;->֫(I)B

    move-result v2

    xor-int/2addr v0, v2

    add-int/lit8 v2, p1, 0x1

    .line 30
    invoke-virtual {p0, v2}, Ll/᩺ۤ֡;->֫(I)B

    move-result v3

    invoke-interface {v1, v2}, Ll/ۖۗ᩻;->֫(I)B

    move-result v2

    xor-int/2addr v2, v3

    add-int/lit8 v3, p1, 0x2

    .line 31
    invoke-virtual {p0, v3}, Ll/᩺ۤ֡;->֫(I)B

    move-result v4

    invoke-interface {v1, v3}, Ll/ۖۗ᩻;->֫(I)B

    move-result v3

    xor-int/2addr v3, v4

    add-int/lit8 p1, p1, 0x3

    .line 32
    invoke-virtual {p0, p1}, Ll/᩺ۤ֡;->֫(I)B

    move-result v4

    invoke-interface {v1, p1}, Ll/ۖۗ᩻;->֫(I)B

    move-result p1

    xor-int/2addr p1, v4

    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v2, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    and-int/lit16 v1, v3, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p1, v0

    return p1

    .line 35
    :cond_0
    invoke-super {p0, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p1

    return p1
.end method
