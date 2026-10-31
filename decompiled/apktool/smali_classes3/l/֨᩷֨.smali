.class public final Ll/֨᩷֨;
.super Ll/ۚ᩷֨;
.source "F1TL"


# instance fields
.field public final ܽ:[B

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۘ᩻֨;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ll/ۚ᩷֨;-><init>()V

    const v0, 0xfffb

    .line 22
    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫(I)[B

    move-result-object p1

    iput-object p1, p0, Ll/֨᩷֨;->ܽ:[B

    .line 23
    array-length p1, p1

    iput p1, p0, Ll/֨᩷֨;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 56
    iget v0, p0, Ll/ۚ᩷֨;->ۧ:I

    const/high16 v1, -0x1000000

    and-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 60
    :try_start_0
    iget v1, p0, Ll/ۚ᩷֨;->֫:I

    shl-int/lit8 v1, v1, 0x8

    iget-object v2, p0, Ll/֨᩷֨;->ܽ:[B

    iget v3, p0, Ll/֨᩷֨;->ᩳ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/֨᩷֨;->ᩳ:I

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v1, v2

    iput v1, p0, Ll/ۚ᩷֨;->֫:I

    shl-int/lit8 v0, v0, 0x8

    .line 61
    iput v0, p0, Ll/ۚ᩷֨;->ۧ:I
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 63
    :catch_0
    new-instance v0, Ll/᩹᩻֨;

    invoke-direct {v0}, Ll/᩹᩻֨;-><init>()V

    throw v0

    :cond_0
    return-void
.end method

.method public final ֫(ILjava/io/DataInputStream;)V
    .locals 2

    const/4 v0, 0x5

    if-lt p1, v0, :cond_1

    .line 35
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    if-nez v0, :cond_0

    .line 38
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۚ᩷֨;->֫:I

    const/4 v0, -0x1

    .line 39
    iput v0, p0, Ll/ۚ᩷֨;->ۧ:I

    add-int/lit8 p1, p1, -0x5

    .line 46
    iget-object v0, p0, Ll/֨᩷֨;->ܽ:[B

    array-length v1, v0

    sub-int/2addr v1, p1

    iput v1, p0, Ll/֨᩷֨;->ᩳ:I

    .line 47
    invoke-virtual {p2, v0, v1, p1}, Ljava/io/DataInputStream;->readFully([BII)V

    return-void

    .line 36
    :cond_0
    new-instance p1, Ll/᩹᩻֨;

    invoke-direct {p1}, Ll/᩹᩻֨;-><init>()V

    throw p1

    .line 33
    :cond_1
    new-instance p1, Ll/᩹᩻֨;

    invoke-direct {p1}, Ll/᩹᩻֨;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ۘ᩻֨;)V
    .locals 1

    .line 27
    iget-object v0, p0, Ll/֨᩷֨;->ܽ:[B

    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫([B)V

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 51
    iget v0, p0, Ll/֨᩷֨;->ᩳ:I

    iget-object v1, p0, Ll/֨᩷֨;->ܽ:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۚ᩷֨;->֫:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
