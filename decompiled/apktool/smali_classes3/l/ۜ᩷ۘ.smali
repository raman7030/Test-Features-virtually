.class public abstract Ll/ۜ᩷ۘ;
.super Ll/ܽۢۘ;
.source "A7V1"


# instance fields
.field public ۖ:Ll/ۘۜۘ;

.field public ۘ:[B

.field public ۜ:[B

.field public ۡ:[B

.field public ۢ:[B

.field public ܺ:Ll/ܺ᩻ۘ;

.field public ᩴ:Ll/۠ۢۘ;

.field public ᩵:I

.field public ᩷:[B


# virtual methods
.method public final ֫(Ll/۟ۢۘ;[B[B[B[B)V
    .locals 0

    .line 57
    iput-object p2, p0, Ll/ۜ᩷ۘ;->ۡ:[B

    .line 58
    iput-object p3, p0, Ll/ۜ᩷ۘ;->ۢ:[B

    .line 59
    iput-object p4, p0, Ll/ۜ᩷ۘ;->᩷:[B

    .line 60
    iput-object p5, p0, Ll/ۜ᩷ۘ;->ۜ:[B

    .line 63
    :try_start_0
    invoke-virtual {p0}, Ll/ۜ᩷ۘ;->ܳ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p3

    const-class p4, Ll/ۖ᩷ۘ;

    invoke-virtual {p3, p4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p3

    const/4 p4, 0x0

    .line 64
    invoke-virtual {p3, p4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p3

    invoke-virtual {p3, p4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۖ᩷ۘ;

    iput-object p3, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    .line 65
    invoke-interface {p3}, Ll/ۖ᩷ۘ;->init()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 70
    new-instance p3, Ll/ܺ᩻ۘ;

    invoke-direct {p3}, Ll/ܺ᩻ۘ;-><init>()V

    iput-object p3, p0, Ll/ۜ᩷ۘ;->ܺ:Ll/ܺ᩻ۘ;

    .line 71
    new-instance p5, Ll/۠ۢۘ;

    invoke-direct {p5, p3}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    iput-object p5, p0, Ll/ۜ᩷ۘ;->ᩴ:Ll/۠ۢۘ;

    :try_start_1
    const-string p3, "dh"

    .line 74
    invoke-virtual {p1, p3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p3

    const-class p5, Ll/ۘۜۘ;

    invoke-virtual {p3, p5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p3

    .line 75
    invoke-virtual {p3, p4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p3

    invoke-virtual {p3, p4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۘۜۘ;

    iput-object p3, p0, Ll/ۜ᩷ۘ;->ۖ:Ll/ۘۜۘ;

    .line 76
    invoke-interface {p3}, Ll/ۘۜۘ;->init()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 81
    iget-object p3, p0, Ll/ۜ᩷ۘ;->ۖ:Ll/ۘۜۘ;

    invoke-virtual {p0}, Ll/ۜ᩷ۘ;->ܿ()[B

    move-result-object p4

    invoke-interface {p3, p4}, Ll/ۘۜۘ;->ܽ([B)V

    .line 82
    iget-object p3, p0, Ll/ۜ᩷ۘ;->ۖ:Ll/ۘۜۘ;

    invoke-virtual {p0}, Ll/ۜ᩷ۘ;->ᩳ()[B

    move-result-object p4

    invoke-interface {p3, p4}, Ll/ۘۜۘ;->֫([B)V

    .line 88
    iget-object p3, p0, Ll/ۜ᩷ۘ;->ۖ:Ll/ۘۜۘ;

    invoke-interface {p3}, Ll/ۘۜۘ;->֫()[B

    move-result-object p3

    iput-object p3, p0, Ll/ۜ᩷ۘ;->ۘ:[B

    .line 89
    iget-object p3, p0, Ll/ۜ᩷ۘ;->ᩴ:Ll/۠ۢۘ;

    invoke-virtual {p3}, Ll/۠ۢۘ;->֫()V

    .line 90
    iget-object p3, p0, Ll/ۜ᩷ۘ;->ܺ:Ll/ܺ᩻ۘ;

    const/16 p4, 0x1e

    invoke-virtual {p3, p4}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 91
    iget-object p3, p0, Ll/ۜ᩷ۘ;->ܺ:Ll/ܺ᩻ۘ;

    iget-object p4, p0, Ll/ۜ᩷ۘ;->ۘ:[B

    invoke-virtual {p3, p4}, Ll/ܺ᩻ۘ;->ܽ([B)V

    if-nez p2, :cond_0

    return-void

    .line 97
    :cond_0
    iget-object p2, p0, Ll/ۜ᩷ۘ;->ᩴ:Ll/۠ۢۘ;

    invoke-virtual {p1, p2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 3560
    iget-object p1, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x1f

    .line 104
    iput p1, p0, Ll/ۜ᩷ۘ;->᩵:I

    return-void

    :catch_0
    move-exception p1

    .line 78
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    throw p2

    :catch_1
    move-exception p1

    .line 67
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    throw p2
.end method

.method public final ֫(Ll/ܺ᩻ۘ;)Z
    .locals 6

    .line 111
    iget v0, p0, Ll/ۜ᩷ۘ;->᩵:I

    const/4 v1, 0x0

    const/16 v2, 0x1f

    if-eq v0, v2, :cond_0

    return v1

    .line 118
    :cond_0
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 119
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    .line 120
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    if-eq v0, v2, :cond_1

    .line 122
    iget-object p1, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object p1, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1

    .line 128
    :cond_1
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢۘ;->ܽ:[B

    .line 130
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object v0

    .line 131
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 133
    iget-object v2, p0, Ll/ۜ᩷ۘ;->ۖ:Ll/ۘۜۘ;

    invoke-interface {v2, v0}, Ll/ۘۜۘ;->ۧ([B)V

    .line 135
    iget-object v2, p0, Ll/ۜ᩷ۘ;->ۖ:Ll/ۘۜۘ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    iget-object v2, p0, Ll/ۜ᩷ۘ;->ۖ:Ll/ۘۜۘ;

    invoke-interface {v2}, Ll/ۘۜۘ;->ۧ()[B

    move-result-object v2

    invoke-static {v2}, Ll/ܽۢۘ;->֫([B)[B

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ll/ܽۢۘ;->֫([BZ)[B

    move-result-object v2

    iput-object v2, p0, Ll/ܽۢۘ;->ۧ:[B

    .line 151
    iget-object v2, p0, Ll/ۜ᩷ۘ;->ۢ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 152
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 153
    iget-object v2, p0, Ll/ۜ᩷ۘ;->ۡ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 154
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 155
    iget-object v2, p0, Ll/ۜ᩷ۘ;->ۜ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 156
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 157
    iget-object v2, p0, Ll/ۜ᩷ۘ;->᩷:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 158
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 159
    iget-object v2, p0, Ll/ܽۢۘ;->ܽ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v2

    .line 160
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 161
    iget-object v2, p0, Ll/ۜ᩷ۘ;->ۘ:[B

    invoke-static {v2, v1}, Ll/ܽۢۘ;->֫([BZ)[B

    move-result-object v2

    .line 162
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 163
    invoke-static {v0, v1}, Ll/ܽۢۘ;->֫([BZ)[B

    move-result-object v0

    .line 164
    iget-object v2, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v4, v0

    invoke-interface {v2, v4, v0}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 166
    iget-object v0, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    iget-object v2, p0, Ll/ܽۢۘ;->ۧ:[B

    array-length v4, v2

    invoke-interface {v0, v4, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 167
    iget-object v0, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    invoke-interface {v0}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢۘ;->֫:[B

    .line 172
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

    .line 174
    invoke-static {v3, v2, v0}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v0

    add-int/2addr v2, v3

    .line 177
    iget-object v3, p0, Ll/ܽۢۘ;->ܽ:[B

    invoke-virtual {p0, v0, v3, p1, v2}, Ll/ܽۢۘ;->֫(Ljava/lang/String;[B[BI)Z

    move-result p1

    .line 179
    iput v1, p0, Ll/ۜ᩷ۘ;->᩵:I

    return p1
.end method

.method public abstract ܳ()Ljava/lang/String;
.end method

.method public final ܽ()I
    .locals 1

    .line 187
    iget v0, p0, Ll/ۜ᩷ۘ;->᩵:I

    return v0
.end method

.method public abstract ܿ()[B
.end method

.method public abstract ᩳ()[B
.end method
