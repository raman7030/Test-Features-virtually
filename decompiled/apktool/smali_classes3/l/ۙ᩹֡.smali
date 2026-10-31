.class public final Ll/ۙ᩹֡;
.super Ll/ܽ᩶֡;
.source "Y5ZS"


# static fields
.field public static final ܿ:Ll/۟᩹֡;


# instance fields
.field public ܽ:B

.field public ᩳ:S


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Ll/᩶᩹֡;

    .line 119
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    sput-object v0, Ll/ۙ᩹֡;->ܿ:Ll/۟᩹֡;

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩶֡;Ll/᩻᩶֡;[BI)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܽ᩶֡;-><init>(Ll/ۗ᩶֡;Ll/᩻᩶֡;[BI)V

    add-int/lit8 p1, p4, 0x1

    .line 71
    aget-byte p1, p3, p1

    and-int/lit16 p1, p1, 0xff

    int-to-short p1, p1

    int-to-byte p1, p1

    iput-byte p1, p0, Ll/ۙ᩹֡;->ܽ:B

    add-int/lit8 p4, p4, 0x4

    .line 72
    invoke-static {p4, p3}, Ll/ۨܺܺ;->ܽ(I[B)I

    move-result p1

    int-to-short p1, p1

    iput-short p1, p0, Ll/ۙ᩹֡;->ᩳ:S

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;SILl/ۚۙ֡;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p4}, Ll/ܽ᩶֡;-><init>(Ll/᩻᩶֡;Ll/ۚۙ֡;)V

    const/16 p1, 0x100

    if-ge p2, p1, :cond_3

    if-ltz p2, :cond_2

    const/high16 p1, 0x10000

    if-ge p3, p1, :cond_1

    if-ltz p3, :cond_0

    int-to-byte p1, p2

    .line 62
    iput-byte p1, p0, Ll/ۙ᩹֡;->ܽ:B

    int-to-short p1, p3

    .line 63
    iput-short p1, p0, Ll/ۙ᩹֡;->ᩳ:S

    return-void

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The beginning register of the range cannot be negative"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The beginning register of the range must be less than 65536"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 52
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "regCount cannot be negative"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 49
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "regCount must be less than 256"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 85
    sget-object v0, Ll/᩻᩸֡;->ۚ֫:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 0

    .line 78
    iget-object p2, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-byte p2, p2, Ll/᩻᩶֡;->ۗ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 79
    iget-byte p2, p0, Ll/ۙ᩹֡;->ܽ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 80
    invoke-virtual {p0}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۚۙ֡;->ܿ()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 81
    iget-short p2, p0, Ll/ۙ᩹֡;->ᩳ:S

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ᩳ(I)V

    return-void
.end method

.method public final ܺ()I
    .locals 2

    .line 93
    iget-short v0, p0, Ll/ۙ᩹֡;->ᩳ:S

    const v1, 0xffff

    and-int/2addr v0, v1

    return v0
.end method

.method public final ᩻()S
    .locals 1

    .line 89
    iget-byte v0, p0, Ll/ۙ᩹֡;->ܽ:B

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    return v0
.end method
