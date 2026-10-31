.class public final Ll/ۗۜܽ;
.super Ljava/lang/Object;
.source "91HA"


# instance fields
.field public final ֫:[B

.field public final ۧ:Ll/֡ۛۡ;


# direct methods
.method public constructor <init>([B)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0}, Ll/֡ۛۡ;-><init>()V

    iput-object v0, p0, Ll/ۗۜܽ;->ۧ:Ll/֡ۛۡ;

    .line 17
    iput-object p1, p0, Ll/ۗۜܽ;->֫:[B

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 2

    if-ltz p1, :cond_1

    .line 80
    iget-object v0, p0, Ll/ۗۜܽ;->֫:[B

    array-length v1, v0

    if-ge v1, p1, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    array-length v0, v0

    sub-int/2addr v0, p1

    return v0

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(I[B)V
    .locals 3

    const/4 v0, 0x0

    .line 71
    array-length v1, p2

    iget-object v2, p0, Ll/ۗۜܽ;->֫:[B

    invoke-static {v2, p1, p2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ֫(Ll/ۛۜܽ;)V
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۗۜܽ;->ۧ:Ll/֡ۛۡ;

    invoke-virtual {v0, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫()[B
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ۗۜܽ;->֫:[B

    return-object v0
.end method

.method public final ֫(II)[I
    .locals 3

    .line 49
    new-array v0, p2, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 29
    iget-object v2, p0, Ll/ۗۜܽ;->֫:[B

    invoke-static {p1, v2}, Ll/ܺܰۡ;->֫(I[B)I

    move-result v2

    .line 51
    aput v2, v0, v1

    add-int/lit8 p1, p1, 0x4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ۧ(I)B
    .locals 1

    .line 21
    iget-object v0, p0, Ll/ۗۜܽ;->֫:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final ܳ(I)I
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ۗۜܽ;->֫:[B

    invoke-static {p1, v0}, Ll/ܺܰۡ;->ܽ(I[B)I

    move-result p1

    return p1
.end method

.method public final ܽ(I)I
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ۗۜܽ;->֫:[B

    invoke-static {p1, v0}, Ll/ܺܰۡ;->֫(I[B)I

    move-result p1

    return p1
.end method

.method public final ܿ(I)I
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۗۜܽ;->֫:[B

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public final ᩳ(I)S
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 6
    iget-object v1, p0, Ll/ۗۜܽ;->֫:[B

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte p1, v1, p1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v0

    int-to-short p1, p1

    return p1
.end method

.method public final ᩻(I)Ll/ۛۜܽ;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ۗۜܽ;->ۧ:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۜܽ;

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {v0, p1}, Ll/ۛۜܽ;->ܽ(I)V

    return-object v0

    .line 94
    :cond_0
    new-instance v0, Ll/ۛۜܽ;

    invoke-direct {v0, p0, p1}, Ll/ۛۜܽ;-><init>(Ll/ۗۜܽ;I)V

    return-object v0
.end method
