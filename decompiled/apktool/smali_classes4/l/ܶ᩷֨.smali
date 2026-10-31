.class public final Ll/ܶ᩷֨;
.super Ll/ۜ᩺ۘ;
.source "01RF"


# static fields
.field public static final ۜ:[I

.field public static final synthetic ᩻:I


# instance fields
.field public final ֫:[B

.field public ۧ:I

.field public ܳ:I

.field public ܽ:B

.field public ܿ:J

.field public ᩳ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x80

    new-array v0, v0, [I

    .line 14
    sput-object v0, Ll/ܶ᩷֨;->ۜ:[I

    const/16 v0, 0x8

    :goto_0
    const/16 v1, 0x800

    if-ge v0, v1, :cond_2

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v0

    :goto_1
    const/4 v4, 0x4

    if-ge v1, v4, :cond_1

    mul-int v3, v3, v3

    shl-int/lit8 v2, v2, 0x1

    :goto_2
    const/high16 v4, -0x10000

    and-int/2addr v4, v3

    if-eqz v4, :cond_0

    ushr-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 43
    :cond_1
    sget-object v1, Ll/ܶ᩷֨;->ۜ:[I

    shr-int/lit8 v3, v0, 0x4

    rsub-int v2, v2, 0xa1

    aput v2, v1, v3

    add-int/lit8 v0, v0, 0x10

    goto :goto_0

    :cond_2
    return-void
.end method

.method public constructor <init>(Ll/ۘ᩻֨;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x10000

    .line 17
    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫(I)[B

    move-result-object p1

    iput-object p1, p0, Ll/ܶ᩷֨;->֫:[B

    .line 18
    invoke-virtual {p0}, Ll/ܶ᩷֨;->ܽ()V

    return-void
.end method

.method public static ۧ([SI)I
    .locals 4

    .line 141
    array-length v0, p0

    or-int/2addr p1, v0

    const/4 v0, 0x0

    :cond_0
    and-int/lit8 v1, p1, 0x1

    const/4 v2, 0x1

    ushr-int/2addr p1, v2

    .line 146
    aget-short v3, p0, p1

    invoke-static {v3, v1}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v1

    add-int/2addr v0, v1

    if-ne p1, v2, :cond_0

    return v0
.end method

.method public static ܽ(II)I
    .locals 0

    neg-int p1, p1

    and-int/lit16 p1, p1, 0x7ff

    xor-int/2addr p0, p1

    ushr-int/lit8 p0, p0, 0x4

    .line 119
    sget-object p1, Ll/ܶ᩷֨;->ۜ:[I

    aget p0, p1, p0

    return p0
.end method

.method private ᩳ()V
    .locals 8

    .line 77
    iget-wide v0, p0, Ll/ܶ᩷֨;->ܿ:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    long-to-int v3, v2

    const-wide/16 v4, 0x1

    if-nez v3, :cond_0

    const-wide v6, 0xff000000L

    cmp-long v2, v0, v6

    if-gez v2, :cond_1

    .line 80
    :cond_0
    iget-byte v0, p0, Ll/ܶ᩷֨;->ܽ:B

    :goto_0
    add-int/2addr v0, v3

    .line 53
    iget v1, p0, Ll/ܶ᩷֨;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܶ᩷֨;->ۧ:I

    int-to-byte v0, v0

    iget-object v2, p0, Ll/ܶ᩷֨;->֫:[B

    aput-byte v0, v2, v1

    .line 85
    iget-wide v0, p0, Ll/ܶ᩷֨;->ᩳ:J

    sub-long/2addr v0, v4

    iput-wide v0, p0, Ll/ܶ᩷֨;->ᩳ:J

    const-wide/16 v6, 0x0

    cmp-long v2, v0, v6

    if-nez v2, :cond_2

    .line 87
    iget-wide v0, p0, Ll/ܶ᩷֨;->ܿ:J

    const/16 v2, 0x18

    ushr-long/2addr v0, v2

    long-to-int v1, v0

    int-to-byte v0, v1

    iput-byte v0, p0, Ll/ܶ᩷֨;->ܽ:B

    .line 90
    :cond_1
    iget-wide v0, p0, Ll/ܶ᩷֨;->ᩳ:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Ll/ܶ᩷֨;->ᩳ:J

    .line 91
    iget-wide v0, p0, Ll/ܶ᩷֨;->ܿ:J

    const-wide/32 v2, 0xffffff

    and-long/2addr v0, v2

    const/16 v2, 0x8

    shl-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܶ᩷֨;->ܿ:J

    return-void

    :cond_2
    const/16 v0, 0xff

    goto :goto_0
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    .line 65
    :try_start_0
    invoke-direct {p0}, Ll/ܶ᩷֨;->ᩳ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 41
    :catch_0
    new-instance v0, Ljava/lang/Error;

    invoke-direct {v0}, Ljava/lang/Error;-><init>()V

    throw v0

    .line 44
    :cond_0
    iget v0, p0, Ll/ܶ᩷֨;->ۧ:I

    return v0
.end method

.method public final ֫(Ljava/io/OutputStream;)V
    .locals 3

    const/4 v0, 0x0

    .line 48
    iget v1, p0, Ll/ܶ᩷֨;->ۧ:I

    iget-object v2, p0, Ll/ܶ᩷֨;->֫:[B

    invoke-virtual {p1, v2, v0, v1}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public final ֫(Ll/ۘ᩻֨;)V
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ܶ᩷֨;->֫:[B

    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫([B)V

    return-void
.end method

.method public final ֫([SI)V
    .locals 4

    .line 125
    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x1

    :cond_0
    ushr-int/2addr v0, v1

    and-int v3, p2, v0

    .line 130
    invoke-virtual {p0, p1, v2, v3}, Ll/ܶ᩷֨;->֫([SII)V

    shl-int/2addr v2, v1

    if-eqz v3, :cond_1

    or-int/lit8 v2, v2, 0x1

    :cond_1
    if-ne v0, v1, :cond_0

    return-void
.end method

.method public final ֫([SII)V
    .locals 9

    .line 96
    aget-short v0, p1, p2

    .line 97
    iget v1, p0, Ll/ܶ᩷֨;->ܳ:I

    ushr-int/lit8 v2, v1, 0xb

    mul-int v2, v2, v0

    if-nez p3, :cond_0

    .line 101
    iput v2, p0, Ll/ܶ᩷֨;->ܳ:I

    rsub-int p3, v0, 0x800

    ushr-int/lit8 p3, p3, 0x5

    add-int/2addr v0, p3

    int-to-short p3, v0

    .line 102
    aput-short p3, p1, p2

    goto :goto_0

    .line 105
    :cond_0
    iget-wide v3, p0, Ll/ܶ᩷֨;->ܿ:J

    int-to-long v5, v2

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    add-long/2addr v3, v5

    iput-wide v3, p0, Ll/ܶ᩷֨;->ܿ:J

    sub-int/2addr v1, v2

    .line 106
    iput v1, p0, Ll/ܶ᩷֨;->ܳ:I

    ushr-int/lit8 p3, v0, 0x5

    sub-int/2addr v0, p3

    int-to-short p3, v0

    .line 107
    aput-short p3, p1, p2

    .line 110
    :goto_0
    iget p1, p0, Ll/ܶ᩷֨;->ܳ:I

    const/high16 p2, -0x1000000

    and-int/2addr p2, p1

    if-nez p2, :cond_1

    shl-int/lit8 p1, p1, 0x8

    .line 111
    iput p1, p0, Ll/ܶ᩷֨;->ܳ:I

    .line 112
    invoke-direct {p0}, Ll/ܶ᩷֨;->ᩳ()V

    :cond_1
    return-void
.end method

.method public final ۧ()I
    .locals 3

    .line 32
    iget v0, p0, Ll/ܶ᩷֨;->ۧ:I

    iget-wide v1, p0, Ll/ܶ᩷֨;->ᩳ:J

    long-to-int v2, v1

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public final ۧ(II)V
    .locals 5

    .line 182
    :cond_0
    iget v0, p0, Ll/ܶ᩷֨;->ܳ:I

    ushr-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܶ᩷֨;->ܳ:I

    .line 183
    iget-wide v1, p0, Ll/ܶ᩷֨;->ܿ:J

    add-int/lit8 p2, p2, -0x1

    ushr-int v3, p1, p2

    and-int/lit8 v3, v3, 0x1

    rsub-int/lit8 v3, v3, 0x0

    and-int/2addr v3, v0

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ܶ᩷֨;->ܿ:J

    const/high16 v1, -0x1000000

    and-int/2addr v1, v0

    if-nez v1, :cond_1

    shl-int/lit8 v0, v0, 0x8

    .line 186
    iput v0, p0, Ll/ܶ᩷֨;->ܳ:I

    .line 187
    invoke-direct {p0}, Ll/ܶ᩷֨;->ᩳ()V

    :cond_1
    if-nez p2, :cond_0

    return-void
.end method

.method public final ܽ()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 50
    iput-wide v0, p0, Ll/ܶ᩷֨;->ܿ:J

    const/4 v0, -0x1

    .line 51
    iput v0, p0, Ll/ܶ᩷֨;->ܳ:I

    const/4 v0, 0x0

    .line 52
    iput-byte v0, p0, Ll/ܶ᩷֨;->ܽ:B

    const-wide/16 v0, 0x1

    .line 53
    iput-wide v0, p0, Ll/ܶ᩷֨;->ᩳ:J

    const/4 v0, 0x0

    .line 27
    iput v0, p0, Ll/ܶ᩷֨;->ۧ:I

    return-void
.end method
