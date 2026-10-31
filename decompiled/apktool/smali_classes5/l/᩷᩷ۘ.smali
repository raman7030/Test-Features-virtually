.class public abstract Ll/᩷᩷ۘ;
.super Ll/ܽۢۘ;
.source "A7UY"


# instance fields
.field public ֡:Ljava/lang/String;

.field public ֨:Ll/֡ۡۘ;

.field public ۖ:Ll/ܺ᩻ۘ;

.field public ۘ:Ljava/lang/String;

.field public ۚ:I

.field public ۜ:[B

.field public ۡ:[B

.field public ۢ:[B

.field public ܺ:[B

.field public ᩴ:I

.field public ᩵:Ll/۠ۢۘ;

.field public ᩷:[B


# virtual methods
.method public final ֫(Ll/۟ۢۘ;[B[B[B[B)V
    .locals 0

    .line 56
    iput-object p2, p0, Ll/᩷᩷ۘ;->ܺ:[B

    .line 57
    iput-object p3, p0, Ll/᩷᩷ۘ;->ۡ:[B

    .line 58
    iput-object p4, p0, Ll/᩷᩷ۘ;->᩷:[B

    .line 59
    iput-object p5, p0, Ll/᩷᩷ۘ;->ۜ:[B

    .line 62
    :try_start_0
    iget-object p3, p0, Ll/᩷᩷ۘ;->֡:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p3

    const-class p4, Ll/ۖ᩷ۘ;

    invoke-virtual {p3, p4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p3

    const/4 p4, 0x0

    .line 63
    invoke-virtual {p3, p4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p3

    invoke-virtual {p3, p4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۖ᩷ۘ;

    iput-object p3, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    .line 64
    invoke-interface {p3}, Ll/ۖ᩷ۘ;->init()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 69
    new-instance p3, Ll/ܺ᩻ۘ;

    invoke-direct {p3}, Ll/ܺ᩻ۘ;-><init>()V

    iput-object p3, p0, Ll/᩷᩷ۘ;->ۖ:Ll/ܺ᩻ۘ;

    .line 70
    new-instance p5, Ll/۠ۢۘ;

    invoke-direct {p5, p3}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    iput-object p5, p0, Ll/᩷᩷ۘ;->᩵:Ll/۠ۢۘ;

    .line 72
    invoke-virtual {p5}, Ll/۠ۢۘ;->֫()V

    .line 73
    iget-object p3, p0, Ll/᩷᩷ۘ;->ۖ:Ll/ܺ᩻ۘ;

    const/16 p5, 0x1e

    invoke-virtual {p3, p5}, Ll/ܺ᩻ۘ;->֫(B)V

    :try_start_1
    const-string p3, "xdh"

    .line 76
    invoke-virtual {p1, p3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p3

    const-class p5, Ll/֡ۡۘ;

    invoke-virtual {p3, p5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p3

    .line 77
    invoke-virtual {p3, p4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p3

    invoke-virtual {p3, p4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֡ۡۘ;

    iput-object p3, p0, Ll/᩷᩷ۘ;->֨:Ll/֡ۡۘ;

    .line 78
    iget-object p4, p0, Ll/᩷᩷ۘ;->ۘ:Ljava/lang/String;

    iget p5, p0, Ll/᩷᩷ۘ;->ᩴ:I

    invoke-interface {p3, p5, p4}, Ll/֡ۡۘ;->֫(ILjava/lang/String;)V

    .line 80
    iget-object p3, p0, Ll/᩷᩷ۘ;->֨:Ll/֡ۡۘ;

    invoke-interface {p3}, Ll/֡ۡۘ;->getQ()[B

    move-result-object p3

    iput-object p3, p0, Ll/᩷᩷ۘ;->ۢ:[B

    .line 81
    iget-object p4, p0, Ll/᩷᩷ۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {p4, p3}, Ll/ܺ᩻ۘ;->ᩳ([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_0

    if-nez p2, :cond_0

    return-void

    .line 90
    :cond_0
    iget-object p2, p0, Ll/᩷᩷ۘ;->᩵:Ll/۠ۢۘ;

    invoke-virtual {p1, p2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 3560
    iget-object p1, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x1f

    .line 97
    iput p1, p0, Ll/᩷᩷ۘ;->ۚ:I

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 83
    :goto_0
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    throw p2

    :catch_2
    move-exception p1

    .line 66
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    throw p2
.end method

.method public final ֫(Ll/ܺ᩻ۘ;)Z
    .locals 6

    .line 103
    iget v0, p0, Ll/᩷᩷ۘ;->ۚ:I

    const/4 v1, 0x0

    const/16 v2, 0x1f

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 110
    :cond_0
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 111
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    .line 112
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    if-eq v0, v2, :cond_1

    .line 114
    iget-object p1, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object p1, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1

    .line 120
    :cond_1
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢۘ;->ܽ:[B

    .line 122
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v0

    .line 130
    iget-object v2, p0, Ll/᩷᩷ۘ;->֨:Ll/֡ۡۘ;

    invoke-interface {v2, v0}, Ll/֡ۡۘ;->ۧ([B)Z

    move-result v2

    if-nez v2, :cond_2

    :goto_0
    return v1

    .line 134
    :cond_2
    iget-object v2, p0, Ll/᩷᩷ۘ;->֨:Ll/֡ۡۘ;

    invoke-interface {v2, v0}, Ll/֡ۡۘ;->֫([B)[B

    move-result-object v2

    invoke-static {v2}, Ll/ܽۢۘ;->֫([B)[B

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ll/ܽۢۘ;->֫([BZ)[B

    move-result-object v2

    iput-object v2, p0, Ll/ܽۢۘ;->ۧ:[B

    .line 136
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 165
    iget-object v2, p0, Ll/᩷᩷ۘ;->ۡ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 166
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 167
    iget-object v2, p0, Ll/᩷᩷ۘ;->ܺ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 168
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 169
    iget-object v2, p0, Ll/᩷᩷ۘ;->ۜ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 170
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 171
    iget-object v2, p0, Ll/᩷᩷ۘ;->᩷:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 172
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 173
    iget-object v2, p0, Ll/ܽۢۘ;->ܽ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 174
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 175
    iget-object v2, p0, Ll/᩷᩷ۘ;->ۢ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 176
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 177
    invoke-static {v0, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v0

    .line 178
    iget-object v2, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v4, v0

    invoke-interface {v2, v4, v0}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 180
    iget-object v0, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    iget-object v2, p0, Ll/ܽۢۘ;->ۧ:[B

    array-length v4, v2

    invoke-interface {v0, v4, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 181
    iget-object v0, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    invoke-interface {v0}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢۘ;->֫:[B

    .line 185
    iget-object v0, p0, Ll/ܽۢۘ;->ܽ:[B

    aget-byte v2, v0, v1

    shl-int/lit8 v2, v2, 0x18

    const/high16 v4, -0x1000000

    and-int/2addr v2, v4

    aget-byte v3, v0, v3

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

    .line 187
    invoke-static {v3, v2, v0}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v0

    add-int/2addr v2, v3

    .line 190
    iget-object v3, p0, Ll/ܽۢۘ;->ܽ:[B

    invoke-virtual {p0, v0, v3, p1, v2}, Ll/ܽۢۘ;->֫(Ljava/lang/String;[B[BI)Z

    move-result p1

    .line 192
    iput v1, p0, Ll/᩷᩷ۘ;->ۚ:I

    return p1
.end method

.method public final ܽ()I
    .locals 1

    .line 200
    iget v0, p0, Ll/᩷᩷ۘ;->ۚ:I

    return v0
.end method
