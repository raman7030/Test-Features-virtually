.class public final Ll/ۡۨۖ;
.super Ljava/lang/Object;
.source "29EQ"

# interfaces
.implements Ll/ۚ֫ۘ;


# static fields
.field public static final ᩷:[B


# instance fields
.field public ֫:I

.field public ۜ:[B

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:[B

.field public ᩻:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 29
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۡۨۖ;->᩷:[B

    return-void

    nop

    :array_0
    .array-data 1
        -0x3t
        0x53t
        0x4dt
        0x42t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [B

    .line 51
    iput-object v1, p0, Ll/ۡۨۖ;->ۜ:[B

    new-array v0, v0, [B

    .line 52
    iput-object v0, p0, Ll/ۡۨۖ;->ᩳ:[B

    return-void
.end method

.method public constructor <init>(JI[B)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 42
    iput-object v0, p0, Ll/ۡۨۖ;->ۜ:[B

    .line 43
    iput-object p4, p0, Ll/ۡۨۖ;->ᩳ:[B

    .line 44
    iput p3, p0, Ll/ۡۨۖ;->ܿ:I

    const/4 p3, 0x0

    .line 45
    iput p3, p0, Ll/ۡۨۖ;->ܳ:I

    const/4 p3, 0x1

    .line 46
    iput p3, p0, Ll/ۡۨۖ;->֫:I

    .line 47
    iput-wide p1, p0, Ll/ۡۨۖ;->᩻:J

    return-void
.end method

.method public static ֫([B)Z
    .locals 1

    .line 132
    sget-object v0, Ll/ۡۨۖ;->᩷:[B

    invoke-static {p0, v0}, Ll/᩻ۨۖ;->֫([B[B)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 84
    iget v0, p0, Ll/ۡۨۖ;->ۧ:I

    return v0
.end method

.method public final ֫(Ll/֡֫ۘ;)V
    .locals 3

    .line 70
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۡ()I

    move-result v0

    iput v0, p0, Ll/ۡۨۖ;->ۧ:I

    .line 72
    sget-object v0, Ll/ۡۨۖ;->᩷:[B

    invoke-static {p1, v0}, Ll/᩻ۨۖ;->֫(Ll/ۤܰۖ;[B)V

    .line 139
    iget-object v0, p0, Ll/ۡۨۖ;->ۜ:[B

    array-length v0, v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    new-array v0, v1, [B

    .line 140
    iput-object v0, p0, Ll/ۡۨۖ;->ۜ:[B

    .line 142
    :cond_0
    iget-object v0, p0, Ll/ۡۨۖ;->ۜ:[B

    .line 293
    array-length v2, v0

    invoke-virtual {p1, v2, v0}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 149
    iget-object v0, p0, Ll/ۡۨۖ;->ᩳ:[B

    array-length v0, v0

    if-eq v0, v1, :cond_1

    new-array v0, v1, [B

    .line 150
    iput-object v0, p0, Ll/ۡۨۖ;->ᩳ:[B

    .line 152
    :cond_1
    iget-object v0, p0, Ll/ۡۨۖ;->ᩳ:[B

    .line 293
    array-length v1, v0

    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 75
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v0

    iput v0, p0, Ll/ۡۨۖ;->ܿ:I

    .line 76
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    iput v0, p0, Ll/ۡۨۖ;->ܳ:I

    .line 77
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    iput v0, p0, Ll/ۡۨۖ;->֫:I

    .line 78
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܳ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۡۨۖ;->᩻:J

    .line 79
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܺ()I

    move-result p1

    iput p1, p0, Ll/ۡۨۖ;->ܽ:I

    return-void
.end method

.method public final ۜ()[B
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۡۨۖ;->ۜ:[B

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 89
    iget v0, p0, Ll/ۡۨۖ;->ܽ:I

    return v0
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 2

    .line 57
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۡ()I

    move-result v0

    iput v0, p0, Ll/ۡۨۖ;->ۧ:I

    .line 58
    sget-object v0, Ll/ۡۨۖ;->᩷:[B

    const/4 v1, 0x4

    .line 318
    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    .line 59
    iget-object v0, p0, Ll/ۡۨۖ;->ۜ:[B

    .line 318
    array-length v1, v0

    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    .line 60
    iget-object v0, p0, Ll/ۡۨۖ;->ᩳ:[B

    .line 318
    array-length v1, v0

    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    .line 61
    iget-object v0, p0, Ll/ۡۨۖ;->ᩳ:[B

    array-length v0, v0

    rsub-int/lit8 v0, v0, 0x10

    invoke-virtual {p1, v0}, Ll/֡֫ۘ;->᩻(I)V

    .line 62
    iget v0, p0, Ll/ۡۨۖ;->ܿ:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 63
    iget v0, p0, Ll/ۡۨۖ;->ܳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 64
    iget v0, p0, Ll/ۡۨۖ;->֫:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 65
    iget-wide v0, p0, Ll/ۡۨۖ;->᩻:J

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->֫(J)V

    return-void
.end method

.method public final ܳ()I
    .locals 1

    .line 113
    iget v0, p0, Ll/ۡۨۖ;->ܳ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 117
    iget v0, p0, Ll/ۡۨۖ;->֫:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 109
    iget v0, p0, Ll/ۡۨۖ;->ܿ:I

    return v0
.end method

.method public final ᩳ()[B
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ۡۨۖ;->ᩳ:[B

    return-object v0
.end method

.method public final ᩻()J
    .locals 2

    .line 121
    iget-wide v0, p0, Ll/ۡۨۖ;->᩻:J

    return-wide v0
.end method
