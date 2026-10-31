.class public final Ll/᩺ۜ֨;
.super Ljava/lang/Object;
.source "G1SX"


# instance fields
.field public final ֫:[B

.field public ۜ:I

.field public final ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩻:I


# direct methods
.method public constructor <init>(ILl/ۘ᩻֨;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 16
    iput v0, p0, Ll/᩺ۜ֨;->ۜ:I

    .line 17
    iput v0, p0, Ll/᩺ۜ֨;->᩻:I

    .line 18
    iput v0, p0, Ll/᩺ۜ֨;->ܽ:I

    .line 19
    iput v0, p0, Ll/᩺ۜ֨;->ᩳ:I

    .line 20
    iput v0, p0, Ll/᩺ۜ֨;->ܳ:I

    .line 21
    iput v0, p0, Ll/᩺ۜ֨;->ܿ:I

    .line 24
    iput p1, p0, Ll/᩺ۜ֨;->ۧ:I

    .line 25
    invoke-virtual {p2, p1}, Ll/ۘ᩻֨;->֫(I)[B

    move-result-object p2

    iput-object p2, p0, Ll/᩺ۜ֨;->֫:[B

    add-int/lit8 p1, p1, -0x1

    .line 34
    aput-byte v0, p2, p1

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 72
    iget v0, p0, Ll/᩺ۜ֨;->᩻:I

    return v0
.end method

.method public final ֫(I)I
    .locals 2

    .line 76
    iget v0, p0, Ll/᩺ۜ֨;->᩻:I

    sub-int v1, v0, p1

    add-int/lit8 v1, v1, -0x1

    if-lt p1, v0, :cond_0

    .line 78
    iget p1, p0, Ll/᩺ۜ֨;->ۧ:I

    add-int/2addr v1, p1

    .line 80
    :cond_0
    iget-object p1, p0, Ll/᩺ۜ֨;->֫:[B

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public final ֫(I[B)I
    .locals 4

    .line 157
    iget v0, p0, Ll/᩺ۜ֨;->᩻:I

    iget v1, p0, Ll/᩺ۜ֨;->ۜ:I

    sub-int v2, v0, v1

    .line 158
    iget v3, p0, Ll/᩺ۜ֨;->ۧ:I

    if-ne v0, v3, :cond_0

    const/4 v0, 0x0

    .line 159
    iput v0, p0, Ll/᩺ۜ֨;->᩻:I

    .line 161
    :cond_0
    iget-object v0, p0, Ll/᩺ۜ֨;->֫:[B

    invoke-static {v0, v1, p2, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 162
    iget p1, p0, Ll/᩺ۜ֨;->᩻:I

    iput p1, p0, Ll/᩺ۜ֨;->ۜ:I

    return v2
.end method

.method public final ֫(B)V
    .locals 3

    .line 84
    iget v0, p0, Ll/᩺ۜ֨;->᩻:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩺ۜ֨;->᩻:I

    iget-object v2, p0, Ll/᩺ۜ֨;->֫:[B

    aput-byte p1, v2, v0

    .line 86
    iget p1, p0, Ll/᩺ۜ֨;->ܽ:I

    if-ge p1, v1, :cond_0

    .line 87
    iput v1, p0, Ll/᩺ۜ֨;->ܽ:I

    :cond_0
    return-void
.end method

.method public final ֫(II)V
    .locals 3

    if-ltz p1, :cond_3

    .line 91
    iget v0, p0, Ll/᩺ۜ֨;->ܽ:I

    if-ge p1, v0, :cond_3

    .line 94
    iget v0, p0, Ll/᩺ۜ֨;->ᩳ:I

    iget v1, p0, Ll/᩺ۜ֨;->᩻:I

    sub-int/2addr v0, v1

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr p2, v0

    .line 95
    iput p2, p0, Ll/᩺ۜ֨;->ܳ:I

    .line 96
    iput p1, p0, Ll/᩺ۜ֨;->ܿ:I

    .line 98
    iget p2, p0, Ll/᩺ۜ֨;->᩻:I

    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, -0x1

    .line 99
    iget-object p1, p0, Ll/᩺ۜ֨;->֫:[B

    if-gez p2, :cond_1

    .line 103
    iget v1, p0, Ll/᩺ۜ֨;->ۧ:I

    add-int/2addr p2, v1

    sub-int/2addr v1, p2

    .line 108
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 111
    iget v2, p0, Ll/᩺ۜ֨;->᩻:I

    invoke-static {p1, p2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 112
    iget p2, p0, Ll/᩺ۜ֨;->᩻:I

    add-int/2addr p2, v1

    iput p2, p0, Ll/᩺ۜ֨;->᩻:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 131
    :cond_1
    iget v1, p0, Ll/᩺ۜ֨;->᩻:I

    sub-int/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 132
    iget v2, p0, Ll/᩺ۜ֨;->᩻:I

    invoke-static {p1, p2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 133
    iget v2, p0, Ll/᩺ۜ֨;->᩻:I

    add-int/2addr v2, v1

    iput v2, p0, Ll/᩺ۜ֨;->᩻:I

    sub-int/2addr v0, v1

    if-gtz v0, :cond_1

    .line 137
    iget p1, p0, Ll/᩺ۜ֨;->ܽ:I

    if-ge p1, v2, :cond_2

    .line 138
    iput v2, p0, Ll/᩺ۜ֨;->ܽ:I

    :cond_2
    :goto_0
    return-void

    .line 92
    :cond_3
    new-instance p1, Ll/᩹᩻֨;

    invoke-direct {p1}, Ll/᩹᩻֨;-><init>()V

    throw p1
.end method

.method public final ֫(ILjava/io/DataInputStream;)V
    .locals 2

    .line 148
    iget v0, p0, Ll/᩺ۜ֨;->ۧ:I

    iget v1, p0, Ll/᩺ۜ֨;->᩻:I

    sub-int/2addr v0, v1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 149
    iget-object v0, p0, Ll/᩺ۜ֨;->֫:[B

    iget v1, p0, Ll/᩺ۜ֨;->᩻:I

    invoke-virtual {p2, v0, v1, p1}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 150
    iget p2, p0, Ll/᩺ۜ֨;->᩻:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/᩺ۜ֨;->᩻:I

    .line 152
    iget p1, p0, Ll/᩺ۜ֨;->ܽ:I

    if-ge p1, p2, :cond_0

    .line 153
    iput p2, p0, Ll/᩺ۜ֨;->ܽ:I

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۘ᩻֨;)V
    .locals 1

    .line 45
    iget-object v0, p0, Ll/᩺ۜ֨;->֫:[B

    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫([B)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 3

    .line 57
    iget v0, p0, Ll/᩺ۜ֨;->᩻:I

    iget v1, p0, Ll/᩺ۜ֨;->ۧ:I

    sub-int v2, v1, v0

    if-gt v2, p1, :cond_0

    .line 58
    iput v1, p0, Ll/᩺ۜ֨;->ᩳ:I

    return-void

    :cond_0
    add-int/2addr v0, p1

    .line 60
    iput v0, p0, Ll/᩺ۜ֨;->ᩳ:I

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 68
    iget v0, p0, Ll/᩺ۜ֨;->ܳ:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 64
    iget v0, p0, Ll/᩺ۜ֨;->᩻:I

    iget v1, p0, Ll/᩺ۜ֨;->ᩳ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()V
    .locals 3

    const/4 v0, 0x0

    .line 49
    iput v0, p0, Ll/᩺ۜ֨;->ۜ:I

    .line 50
    iput v0, p0, Ll/᩺ۜ֨;->᩻:I

    .line 51
    iput v0, p0, Ll/᩺ۜ֨;->ܽ:I

    .line 52
    iput v0, p0, Ll/᩺ۜ֨;->ᩳ:I

    .line 53
    iget v1, p0, Ll/᩺ۜ֨;->ۧ:I

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Ll/᩺ۜ֨;->֫:[B

    aput-byte v0, v2, v1

    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 142
    iget v0, p0, Ll/᩺ۜ֨;->ܳ:I

    if-lez v0, :cond_0

    .line 143
    iget v1, p0, Ll/᩺ۜ֨;->ܿ:I

    invoke-virtual {p0, v1, v0}, Ll/᩺ۜ֨;->֫(II)V

    :cond_0
    return-void
.end method
