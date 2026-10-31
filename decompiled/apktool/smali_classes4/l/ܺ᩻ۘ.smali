.class public final Ll/ܺ᩻ۘ;
.super Ljava/lang/Object;
.source "04CR"


# instance fields
.field public ֫:[B

.field public ۧ:I

.field public ܽ:I

.field public final ᩳ:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x5000

    .line 48
    invoke-direct {p0, v0}, Ll/ܺ᩻ۘ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 30
    iput-object v0, p0, Ll/ܺ᩻ۘ;->ᩳ:[B

    .line 36
    new-array p1, p1, [B

    iput-object p1, p0, Ll/ܺ᩻ۘ;->֫:[B

    const/4 p1, 0x0

    .line 37
    iput p1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    .line 38
    iput p1, p0, Ll/ܺ᩻ۘ;->ܽ:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 30
    iput-object v0, p0, Ll/ܺ᩻ۘ;->ᩳ:[B

    .line 42
    iput-object p1, p0, Ll/ܺ᩻ۘ;->֫:[B

    const/4 p1, 0x0

    .line 43
    iput p1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    .line 44
    iput p1, p0, Ll/ܺ᩻ۘ;->ܽ:I

    return-void
.end method

.method public static ֫([[B)Ll/ܺ᩻ۘ;
    .locals 4

    .line 282
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 283
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_0

    .line 284
    aget-object v3, p0, v2

    array-length v3, v3

    add-int/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 286
    :cond_0
    new-instance v2, Ll/ܺ᩻ۘ;

    invoke-direct {v2, v0}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 287
    :goto_1
    array-length v0, p0

    if-ge v1, v0, :cond_1

    .line 288
    aget-object v0, p0, v1

    invoke-virtual {v2, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method


# virtual methods
.method public final ֫()I
    .locals 3

    .line 161
    iget-object v0, p0, Ll/ܺ᩻ۘ;->֫:[B

    iget v1, p0, Ll/ܺ᩻ۘ;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܺ᩻ۘ;->ܽ:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final ֫(B)V
    .locals 3

    .line 52
    iget-object v0, p0, Ll/ܺ᩻ۘ;->֫:[B

    iget v1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܺ᩻ۘ;->ۧ:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public final ֫(I)V
    .locals 3

    .line 251
    iget v0, p0, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr p1, v0

    add-int/lit16 p1, p1, 0x80

    .line 252
    iget-object v1, p0, Ll/ܺ᩻ۘ;->֫:[B

    array-length v2, v1

    if-ge v2, p1, :cond_1

    .line 253
    array-length v2, v1

    mul-int/lit8 v2, v2, 0x2

    if-ge v2, p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v2

    .line 256
    :goto_0
    new-array p1, p1, [B

    const/4 v2, 0x0

    .line 257
    invoke-static {v1, v2, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 258
    iput-object p1, p0, Ll/ܺ᩻ۘ;->֫:[B

    :cond_1
    return-void
.end method

.method public final ֫(II[B)V
    .locals 2

    .line 169
    iget-object v0, p0, Ll/ܺ᩻ۘ;->֫:[B

    iget v1, p0, Ll/ܺ᩻ۘ;->ܽ:I

    invoke-static {v0, v1, p3, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 170
    iget p1, p0, Ll/ܺ᩻ۘ;->ܽ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ܺ᩻ۘ;->ܽ:I

    return-void
.end method

.method public final ֫(J)V
    .locals 10

    const/16 v0, 0x38

    ushr-long v0, p1, v0

    long-to-int v1, v0

    int-to-byte v0, v1

    .line 83
    iget-object v1, p0, Ll/ܺ᩻ۘ;->ᩳ:[B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    const/16 v0, 0x30

    ushr-long v3, p1, v0

    long-to-int v0, v3

    int-to-byte v0, v0

    const/4 v3, 0x1

    .line 84
    aput-byte v0, v1, v3

    const/16 v0, 0x28

    ushr-long v4, p1, v0

    long-to-int v0, v4

    int-to-byte v0, v0

    const/4 v4, 0x2

    .line 85
    aput-byte v0, v1, v4

    const/16 v0, 0x20

    ushr-long v5, p1, v0

    long-to-int v0, v5

    int-to-byte v0, v0

    const/4 v5, 0x3

    .line 86
    aput-byte v0, v1, v5

    .line 87
    iget-object v0, p0, Ll/ܺ᩻ۘ;->֫:[B

    iget v6, p0, Ll/ܺ᩻ۘ;->ۧ:I

    const/4 v7, 0x4

    invoke-static {v1, v2, v0, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v0, 0x18

    ushr-long v8, p1, v0

    long-to-int v0, v8

    int-to-byte v0, v0

    .line 88
    aput-byte v0, v1, v2

    const/16 v0, 0x10

    ushr-long v8, p1, v0

    long-to-int v0, v8

    int-to-byte v0, v0

    .line 89
    aput-byte v0, v1, v3

    const/16 v0, 0x8

    ushr-long v8, p1, v0

    long-to-int v3, v8

    int-to-byte v3, v3

    .line 90
    aput-byte v3, v1, v4

    long-to-int p2, p1

    int-to-byte p1, p2

    .line 91
    aput-byte p1, v1, v5

    .line 92
    iget-object p1, p0, Ll/ܺ᩻ۘ;->֫:[B

    iget p2, p0, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr p2, v7

    invoke-static {v1, v2, p1, p2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 93
    iget p1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    return-void
.end method

.method public final ֫([B)V
    .locals 2

    const/4 v0, 0x0

    .line 165
    array-length v1, p1

    invoke-virtual {p0, v0, v1, p1}, Ll/ܺ᩻ۘ;->֫(II[B)V

    return-void
.end method

.method public final ֫(ILjava/lang/String;)[[B
    .locals 5

    .line 263
    new-array v0, p1, [[B

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_1

    .line 265
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v3

    .line 266
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ᩳ()I

    move-result v4

    if-lt v4, v3, :cond_0

    .line 269
    new-array v4, v3, [B

    aput-object v4, v0, v2

    .line 165
    invoke-virtual {p0, v1, v3, v4}, Ll/ܺ᩻ۘ;->֫(II[B)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 267
    :cond_0
    new-instance p1, Ll/۫᩷ۘ;

    .line 39
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 267
    throw p1

    :cond_1
    return-object v0
.end method

.method public final ۖ()V
    .locals 1

    const/4 v0, 0x0

    .line 128
    iput v0, p0, Ll/ܺ᩻ۘ;->ܽ:I

    return-void
.end method

.method public final ۜ()I
    .locals 2

    .line 155
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    const v1, 0xff00

    and-int/2addr v0, v1

    .line 156
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->֫()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0
.end method

.method public final ۡ()V
    .locals 1

    const/4 v0, 0x0

    .line 225
    iput v0, p0, Ll/ܺ᩻ۘ;->ۧ:I

    .line 226
    iput v0, p0, Ll/ܺ᩻ۘ;->ܽ:I

    return-void
.end method

.method public final ۢ()J
    .locals 7

    .line 146
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8

    shl-long/2addr v0, v2

    const-wide/32 v3, 0xff00

    and-long/2addr v0, v3

    .line 147
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->֫()I

    move-result v5

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    or-long/2addr v0, v5

    .line 148
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->֫()I

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v5, v2

    and-long v2, v5, v3

    .line 149
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->֫()I

    move-result v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    or-long/2addr v2, v4

    const/16 v4, 0x10

    shl-long/2addr v0, v4

    const-wide/32 v4, -0x10000

    and-long/2addr v0, v4

    const-wide/32 v4, 0xffff

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ۧ()B
    .locals 2

    .line 242
    iget-object v0, p0, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v1, 0x5

    aget-byte v0, v0, v1

    return v0
.end method

.method public final ۧ(I)V
    .locals 4

    ushr-int/lit8 v0, p1, 0x18

    int-to-byte v0, v0

    .line 74
    iget-object v1, p0, Ll/ܺ᩻ۘ;->ᩳ:[B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    ushr-int/lit8 v0, p1, 0x10

    int-to-byte v0, v0

    const/4 v3, 0x1

    .line 75
    aput-byte v0, v1, v3

    ushr-int/lit8 v0, p1, 0x8

    int-to-byte v0, v0

    const/4 v3, 0x2

    .line 76
    aput-byte v0, v1, v3

    const/4 v0, 0x3

    int-to-byte p1, p1

    .line 77
    aput-byte p1, v1, v0

    .line 78
    iget-object p1, p0, Ll/ܺ᩻ۘ;->֫:[B

    iget v0, p0, Ll/ܺ᩻ۘ;->ۧ:I

    const/4 v3, 0x4

    invoke-static {v1, v2, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    iget p1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    return-void
.end method

.method public final ۧ(II[B)V
    .locals 2

    .line 60
    iget-object v0, p0, Ll/ܺ᩻ۘ;->֫:[B

    iget v1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-static {p3, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 61
    iget p1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    return-void
.end method

.method public final ۧ([B)V
    .locals 2

    const/4 v0, 0x0

    .line 56
    array-length v1, p1

    invoke-virtual {p0, v0, v1, p1}, Ll/ܺ᩻ۘ;->ۧ(II[B)V

    return-void
.end method

.method public final ܳ()[B
    .locals 5

    .line 192
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    .line 193
    div-int/lit8 v0, v0, 0x8

    .line 194
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 195
    invoke-virtual {p0, v2, v0, v1}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 196
    aget-byte v3, v1, v2

    and-int/lit16 v3, v3, 0x80

    if-eqz v3, :cond_0

    add-int/lit8 v3, v0, 0x1

    .line 197
    new-array v3, v3, [B

    .line 198
    aput-byte v2, v3, v2

    const/4 v4, 0x1

    .line 199
    invoke-static {v1, v2, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v3

    :cond_0
    return-object v1
.end method

.method public final ܺ()V
    .locals 1

    const/4 v0, 0x0

    .line 238
    iput v0, p0, Ll/ܺ᩻ۘ;->ܽ:I

    return-void
.end method

.method public final ܽ()I
    .locals 3

    .line 138
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ۜ()I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    const/high16 v1, -0x10000

    and-int/2addr v0, v1

    .line 139
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ۜ()I

    move-result v1

    const v2, 0xffff

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    return v0
.end method

.method public final ܽ(I)V
    .locals 1

    .line 97
    iget v0, p0, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ܺ᩻ۘ;->ۧ:I

    return-void
.end method

.method public final ܽ(II[B)V
    .locals 0

    .line 69
    invoke-virtual {p0, p2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 70
    invoke-virtual {p0, p1, p2, p3}, Ll/ܺ᩻ۘ;->ۧ(II[B)V

    return-void
.end method

.method public final ܽ([B)V
    .locals 3

    .line 108
    array-length v0, p1

    const/4 v1, 0x0

    .line 109
    aget-byte v2, p1, v1

    and-int/lit16 v2, v2, 0x80

    if-eqz v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 111
    invoke-virtual {p0, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 112
    invoke-virtual {p0, v1}, Ll/ܺ᩻ۘ;->֫(B)V

    goto :goto_0

    .line 114
    :cond_0
    invoke-virtual {p0, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 56
    :goto_0
    array-length v0, p1

    invoke-virtual {p0, v1, v0, p1}, Ll/ܺ᩻ۘ;->ۧ(II[B)V

    return-void
.end method

.method public final ܿ()[B
    .locals 3

    .line 180
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    const/16 v1, 0x2000

    if-ltz v0, :cond_0

    if-le v0, v1, :cond_1

    :cond_0
    const/16 v0, 0x2000

    .line 186
    :cond_1
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 187
    invoke-virtual {p0, v2, v0, v1}, Ll/ܺ᩻ۘ;->֫(II[B)V

    return-object v1
.end method

.method public final ᩳ()I
    .locals 2

    .line 120
    iget v0, p0, Ll/ܺ᩻ۘ;->ۧ:I

    iget v1, p0, Ll/ܺ᩻ۘ;->ܽ:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ᩳ([B)V
    .locals 2

    const/4 v0, 0x0

    .line 65
    array-length v1, p1

    invoke-virtual {p0, v0, v1, p1}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    return-void
.end method

.method public final ᩷()[B
    .locals 3

    .line 206
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    const/high16 v1, 0x40000

    if-ltz v0, :cond_0

    if-le v0, v1, :cond_1

    :cond_0
    const/high16 v0, 0x40000

    .line 212
    :cond_1
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 213
    invoke-virtual {p0, v2, v0, v1}, Ll/ܺ᩻ۘ;->֫(II[B)V

    return-object v1
.end method

.method public final ᩻()I
    .locals 1

    .line 124
    iget v0, p0, Ll/ܺ᩻ۘ;->ܽ:I

    return v0
.end method
