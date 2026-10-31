.class public final Ll/ۖ᩸֡;
.super Ll/֫᩶֡;
.source "K5L0"

# interfaces
.implements Ll/᩷᩶֡;
.implements Ll/ᩳ᩶֡;


# static fields
.field public static final ᩳ:Ll/۟᩹֡;


# instance fields
.field public ۧ:B

.field public ܽ:B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Ll/ܺ᩸֡;

    .line 84
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    sput-object v0, Ll/ۖ᩸֡;->ᩳ:Ll/۟᩹֡;

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;BB)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    const/16 p1, 0x10

    if-ge p2, p1, :cond_1

    const/4 p1, -0x8

    if-lt p3, p1, :cond_0

    const/16 p1, 0x8

    if-ge p3, p1, :cond_0

    .line 56
    iput-byte p2, p0, Ll/ۖ᩸֡;->ܽ:B

    .line 57
    iput-byte p3, p0, Ll/ۖ᩸֡;->ۧ:B

    return-void

    .line 53
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The literal value must be between -8 and 7 inclusive"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The register number must be less than v16"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ll/᩻᩶֡;[BI)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    add-int/lit8 p3, p3, 0x1

    .line 63
    aget-byte p1, p2, p3

    and-int/lit8 p2, p1, 0xf

    int-to-byte p2, p2

    iput-byte p2, p0, Ll/ۖ᩸֡;->ܽ:B

    shr-int/lit8 p1, p1, 0x4

    int-to-byte p1, p1

    .line 64
    iput-byte p1, p0, Ll/ۖ᩸֡;->ۧ:B

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 77
    iget-byte v0, p0, Ll/ۖ᩸֡;->ܽ:B

    return v0
.end method

.method public final ۜ()J
    .locals 2

    .line 81
    iget-byte v0, p0, Ll/ۖ᩸֡;->ۧ:B

    int-to-long v0, v0

    return-wide v0
.end method

.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 73
    sget-object v0, Ll/᩻᩸֡;->ۤ:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 1

    .line 68
    iget-object p2, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-byte p2, p2, Ll/᩻᩶֡;->ۗ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 69
    iget-byte p2, p0, Ll/ۖ᩸֡;->ۧ:B

    shl-int/lit8 p2, p2, 0x4

    iget-byte v0, p0, Ll/ۖ᩸֡;->ܽ:B

    or-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    return-void
.end method
