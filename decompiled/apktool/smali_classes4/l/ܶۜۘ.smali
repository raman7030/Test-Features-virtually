.class public abstract Ll/ܶۜۘ;
.super Ll/ܽۢۘ;
.source "47V7"


# instance fields
.field public ֡:Ll/ۧۢۘ;

.field public ֨:Ljava/lang/String;

.field public ۖ:Ll/ܺ᩻ۘ;

.field public ۘ:Ll/ۡ᩷ۘ;

.field public ۚ:I

.field public ۜ:[B

.field public ۠:I

.field public ۡ:[B

.field public ۢ:[B

.field public ܶ:Ll/۠ۢۘ;

.field public ܺ:[B

.field public ᩴ:I

.field public ᩵:I

.field public ᩷:[B

.field public ᩸:Ljava/lang/String;

.field public ᩹:I


# virtual methods
.method public final ֫(Ll/۟ۢۘ;[B[B[B[B)V
    .locals 2

    .line 60
    iput-object p2, p0, Ll/ܶۜۘ;->ܺ:[B

    .line 61
    iput-object p3, p0, Ll/ܶۜۘ;->ۡ:[B

    .line 62
    iput-object p4, p0, Ll/ܶۜۘ;->ۢ:[B

    .line 63
    iput-object p5, p0, Ll/ܶۜۘ;->᩷:[B

    .line 66
    :try_start_0
    iget-object p3, p0, Ll/ܶۜۘ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p3

    const-class p4, Ll/ۖ᩷ۘ;

    invoke-virtual {p3, p4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p3

    const/4 p4, 0x0

    .line 67
    invoke-virtual {p3, p4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p3

    invoke-virtual {p3, p4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۖ᩷ۘ;

    iput-object p3, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    .line 68
    invoke-interface {p3}, Ll/ۖ᩷ۘ;->init()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 73
    new-instance p3, Ll/ܺ᩻ۘ;

    invoke-direct {p3}, Ll/ܺ᩻ۘ;-><init>()V

    iput-object p3, p0, Ll/ܶۜۘ;->ۖ:Ll/ܺ᩻ۘ;

    .line 74
    new-instance p5, Ll/۠ۢۘ;

    invoke-direct {p5, p3}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    iput-object p5, p0, Ll/ܶۜۘ;->ܶ:Ll/۠ۢۘ;

    .line 76
    invoke-virtual {p5}, Ll/۠ۢۘ;->֫()V

    .line 78
    iget-object p3, p0, Ll/ܶۜۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget p5, p0, Ll/ܶۜۘ;->۠:I

    add-int/lit8 p5, p5, 0x5

    iget v0, p0, Ll/ܶۜۘ;->ᩴ:I

    add-int/2addr p5, v0

    invoke-virtual {p3, p5}, Ll/ܺ᩻ۘ;->֫(I)V

    .line 79
    iget-object p3, p0, Ll/ܶۜۘ;->ۖ:Ll/ܺ᩻ۘ;

    const/16 p5, 0x1e

    invoke-virtual {p3, p5}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 82
    :try_start_1
    iget-object p3, p0, Ll/ܶۜۘ;->֨:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p3

    const-class p5, Ll/ۧۢۘ;

    invoke-virtual {p3, p5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p3

    .line 83
    invoke-virtual {p3, p4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p3

    invoke-virtual {p3, p4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۧۢۘ;

    iput-object p3, p0, Ll/ܶۜۘ;->֡:Ll/ۧۢۘ;

    .line 84
    invoke-interface {p3}, Ll/ۧۢۘ;->init()V

    const-string p3, "ecdh-sha2-nistp"

    .line 87
    invoke-virtual {p1, p3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p3

    const-class p5, Ll/ۡ᩷ۘ;

    invoke-virtual {p3, p5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p3

    .line 88
    invoke-virtual {p3, p4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p3

    invoke-virtual {p3, p4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۡ᩷ۘ;

    iput-object p3, p0, Ll/ܶۜۘ;->ۘ:Ll/ۡ᩷ۘ;

    .line 89
    iget p4, p0, Ll/ܶۜۘ;->᩵:I

    invoke-interface {p3, p4}, Ll/ۡ᩷ۘ;->֫(I)V

    .line 91
    iget-object p3, p0, Ll/ܶۜۘ;->֡:Ll/ۧۢۘ;

    invoke-interface {p3}, Ll/ۧۢۘ;->getPublicKey()[B

    move-result-object p3

    .line 92
    iget-object p4, p0, Ll/ܶۜۘ;->ۘ:Ll/ۡ᩷ۘ;

    invoke-interface {p4}, Ll/ۡ᩷ۘ;->getQ()[B

    move-result-object p4

    .line 93
    iget p5, p0, Ll/ܶۜۘ;->۠:I

    iget v0, p0, Ll/ܶۜۘ;->ᩴ:I

    add-int/2addr v0, p5

    new-array v0, v0, [B

    iput-object v0, p0, Ll/ܶۜۘ;->ۜ:[B

    const/4 v1, 0x0

    .line 94
    invoke-static {p3, v1, v0, v1, p5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    iget-object p3, p0, Ll/ܶۜۘ;->ۜ:[B

    iget p5, p0, Ll/ܶۜۘ;->۠:I

    iget v0, p0, Ll/ܶۜۘ;->ᩴ:I

    invoke-static {p4, v1, p3, p5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    iget-object p3, p0, Ll/ܶۜۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object p4, p0, Ll/ܶۜۘ;->ۜ:[B

    invoke-virtual {p3, p4}, Ll/ܺ᩻ۘ;->ᩳ([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-nez p2, :cond_0

    return-void

    .line 105
    :cond_0
    iget-object p2, p0, Ll/ܶۜۘ;->ܶ:Ll/۠ۢۘ;

    invoke-virtual {p1, p2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 3560
    iget-object p1, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 107
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x1f

    .line 112
    iput p1, p0, Ll/ܶۜۘ;->᩹:I

    return-void

    :catch_0
    move-exception p1

    .line 98
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    throw p2

    :catch_1
    move-exception p1

    .line 70
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    throw p2
.end method

.method public final ֫(Ll/ܺ᩻ۘ;)Z
    .locals 8

    .line 118
    iget v0, p0, Ll/ܶۜۘ;->᩹:I

    const/4 v1, 0x0

    const/16 v2, 0x1f

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 125
    :cond_0
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 126
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    .line 127
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    if-eq v0, v2, :cond_1

    .line 129
    iget-object p1, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object p1, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1

    .line 135
    :cond_1
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢۘ;->ܽ:[B

    .line 137
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v0

    .line 138
    array-length v2, v0

    iget v3, p0, Ll/ܶۜۘ;->ۚ:I

    iget v4, p0, Ll/ܶۜۘ;->ᩴ:I

    add-int v5, v3, v4

    if-eq v2, v5, :cond_2

    goto :goto_0

    .line 142
    :cond_2
    new-array v2, v3, [B

    .line 143
    new-array v4, v4, [B

    .line 144
    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 145
    iget v3, p0, Ll/ܶۜۘ;->ۚ:I

    iget v5, p0, Ll/ܶۜۘ;->ᩴ:I

    invoke-static {v0, v3, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 147
    invoke-static {v4}, Ll/ۜۢۘ;->ᩳ([B)[[B

    move-result-object v3

    .line 155
    iget-object v4, p0, Ll/ܶۜۘ;->ۘ:Ll/ۡ᩷ۘ;

    aget-object v5, v3, v1

    const/4 v6, 0x1

    aget-object v7, v3, v6

    invoke-interface {v4, v5, v7}, Ll/ۡ᩷ۘ;->ۧ([B[B)Z

    move-result v4

    if-nez v4, :cond_3

    :goto_0
    return v1

    :cond_3
    const/4 v4, 0x0

    .line 161
    :try_start_0
    iget-object v5, p0, Ll/ܶۜۘ;->֡:Ll/ۧۢۘ;

    invoke-interface {v5, v2}, Ll/ۧۢۘ;->֫([B)[B

    move-result-object v4

    .line 162
    iget-object v2, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v4

    invoke-interface {v2, v5, v4}, Ll/ۖ᩷ۘ;->֫(I[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 164
    invoke-static {v4}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 167
    :try_start_1
    iget-object v2, p0, Ll/ܶۜۘ;->ۘ:Ll/ۡ᩷ۘ;

    aget-object v5, v3, v1

    aget-object v3, v3, v6

    invoke-interface {v2, v5, v3}, Ll/ۡ᩷ۘ;->֫([B[B)[B

    move-result-object v4

    .line 168
    iget-object v2, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v3, v4

    invoke-interface {v2, v3, v4}, Ll/ۖ᩷ۘ;->֫(I[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 170
    invoke-static {v4}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 172
    iget-object v2, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    invoke-interface {v2}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v2

    invoke-static {v2, v6}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    iput-object v2, p0, Ll/ܽۢۘ;->ۧ:[B

    .line 174
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 199
    iget-object v2, p0, Ll/ܶۜۘ;->ۡ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 200
    iget-object v3, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v4, v2

    invoke-interface {v3, v4, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 201
    iget-object v2, p0, Ll/ܶۜۘ;->ܺ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 202
    iget-object v3, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v4, v2

    invoke-interface {v3, v4, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 203
    iget-object v2, p0, Ll/ܶۜۘ;->᩷:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 204
    iget-object v3, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v4, v2

    invoke-interface {v3, v4, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 205
    iget-object v2, p0, Ll/ܶۜۘ;->ۢ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 206
    iget-object v3, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v4, v2

    invoke-interface {v3, v4, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 207
    iget-object v2, p0, Ll/ܽۢۘ;->ܽ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 208
    iget-object v3, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v4, v2

    invoke-interface {v3, v4, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 209
    iget-object v2, p0, Ll/ܶۜۘ;->ۜ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 210
    iget-object v3, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v4, v2

    invoke-interface {v3, v4, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 211
    invoke-static {v0, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v0

    .line 212
    iget-object v2, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v3, v0

    invoke-interface {v2, v3, v0}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 214
    iget-object v0, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    iget-object v2, p0, Ll/ܽۢۘ;->ۧ:[B

    array-length v3, v2

    invoke-interface {v0, v3, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 215
    iget-object v0, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    invoke-interface {v0}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢۘ;->֫:[B

    .line 219
    iget-object v0, p0, Ll/ܽۢۘ;->ܽ:[B

    aget-byte v2, v0, v1

    shl-int/lit8 v2, v2, 0x18

    const/high16 v3, -0x1000000

    and-int/2addr v2, v3

    aget-byte v3, v0, v6

    shl-int/lit8 v3, v3, 0x10

    const/high16 v4, 0xff0000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    const/4 v3, 0x2

    aget-byte v3, v0, v3

    shl-int/lit8 v3, v3, 0x8

    const v4, 0xff00

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    const/4 v3, 0x3

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v2, v3

    const/4 v3, 0x4

    .line 221
    invoke-static {v3, v2, v0}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v0

    add-int/2addr v2, v3

    .line 224
    iget-object v3, p0, Ll/ܽۢۘ;->ܽ:[B

    invoke-virtual {p0, v0, v3, p1, v2}, Ll/ܽۢۘ;->֫(Ljava/lang/String;[B[BI)Z

    move-result p1

    .line 226
    iput v1, p0, Ll/ܶۜۘ;->᩹:I

    return p1

    :catchall_0
    move-exception p1

    .line 170
    invoke-static {v4}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 171
    throw p1

    :catchall_1
    move-exception p1

    .line 164
    invoke-static {v4}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 165
    throw p1
.end method

.method public final ܽ()I
    .locals 1

    .line 234
    iget v0, p0, Ll/ܶۜۘ;->᩹:I

    return v0
.end method
