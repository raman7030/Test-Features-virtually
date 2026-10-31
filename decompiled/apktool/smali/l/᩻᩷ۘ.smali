.class public abstract Ll/᩻᩷ۘ;
.super Ll/ܽۢۘ;
.source "D7YF"


# instance fields
.field public ֡:I

.field public ֨:[B

.field public ۖ:Ll/ۘۜۘ;

.field public ۘ:[B

.field public ۚ:I

.field public ۜ:[B

.field public ۠:Ll/۠ۢۘ;

.field public ۡ:[B

.field public ۢ:[B

.field public ܶ:I

.field public ܺ:Ll/ܺ᩻ۘ;

.field public ᩴ:[B

.field public ᩵:Ljava/lang/String;

.field public ᩷:[B

.field public ᩸:I


# virtual methods
.method public final ֫(Ll/۟ۢۘ;[B[B[B[B)V
    .locals 2

    const-string v0, "Invalid DHGEX sizes: min="

    .line 63
    iput-object p2, p0, Ll/᩻᩷ۘ;->ۡ:[B

    .line 64
    iput-object p3, p0, Ll/᩻᩷ۘ;->ۢ:[B

    .line 65
    iput-object p4, p0, Ll/᩻᩷ۘ;->᩷:[B

    .line 66
    iput-object p5, p0, Ll/᩻᩷ۘ;->ۜ:[B

    .line 69
    :try_start_0
    iget-object p2, p0, Ll/᩻᩷ۘ;->᩵:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    const-class p3, Ll/ۖ᩷ۘ;

    invoke-virtual {p2, p3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    const/4 p3, 0x0

    .line 70
    invoke-virtual {p2, p3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2

    invoke-virtual {p2, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۖ᩷ۘ;

    iput-object p2, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    .line 71
    invoke-interface {p2}, Ll/ۖ᩷ۘ;->init()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 76
    new-instance p2, Ll/ܺ᩻ۘ;

    invoke-direct {p2}, Ll/ܺ᩻ۘ;-><init>()V

    iput-object p2, p0, Ll/᩻᩷ۘ;->ܺ:Ll/ܺ᩻ۘ;

    .line 77
    new-instance p4, Ll/۠ۢۘ;

    invoke-direct {p4, p2}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    iput-object p4, p0, Ll/᩻᩷ۘ;->۠:Ll/۠ۢۘ;

    :try_start_1
    const-string p2, "dh"

    .line 80
    invoke-virtual {p1, p2}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    const-class p4, Ll/ۘۜۘ;

    invoke-virtual {p2, p4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    const-string p4, "dhgex_min"

    .line 81
    invoke-virtual {p1, p4}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p4

    iput p4, p0, Ll/᩻᩷ۘ;->ۚ:I

    const-string p4, "dhgex_max"

    .line 82
    invoke-virtual {p1, p4}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p4

    iput p4, p0, Ll/᩻᩷ۘ;->֡:I

    const-string p4, "dhgex_preferred"

    .line 83
    invoke-virtual {p1, p4}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p4

    iput p4, p0, Ll/᩻᩷ۘ;->ܶ:I

    .line 84
    iget p5, p0, Ll/᩻᩷ۘ;->ۚ:I

    if-lez p5, :cond_0

    iget v1, p0, Ll/᩻᩷ۘ;->֡:I

    if-lez v1, :cond_0

    if-lez p4, :cond_0

    if-lt p4, p5, :cond_0

    if-gt p4, v1, :cond_0

    .line 88
    invoke-virtual {p2, p3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2

    invoke-virtual {p2, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘۜۘ;

    iput-object p2, p0, Ll/᩻᩷ۘ;->ۖ:Ll/ۘۜۘ;

    .line 89
    invoke-interface {p2}, Ll/ۘۜۘ;->init()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 94
    iget-object p2, p0, Ll/᩻᩷ۘ;->۠:Ll/۠ۢۘ;

    invoke-virtual {p2}, Ll/۠ۢۘ;->֫()V

    .line 95
    iget-object p2, p0, Ll/᩻᩷ۘ;->ܺ:Ll/ܺ᩻ۘ;

    const/16 p3, 0x22

    invoke-virtual {p2, p3}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 96
    iget-object p2, p0, Ll/᩻᩷ۘ;->ܺ:Ll/ܺ᩻ۘ;

    iget p3, p0, Ll/᩻᩷ۘ;->ۚ:I

    invoke-virtual {p2, p3}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 97
    iget-object p2, p0, Ll/᩻᩷ۘ;->ܺ:Ll/ܺ᩻ۘ;

    iget p3, p0, Ll/᩻᩷ۘ;->ܶ:I

    invoke-virtual {p2, p3}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 98
    iget-object p2, p0, Ll/᩻᩷ۘ;->ܺ:Ll/ܺ᩻ۘ;

    iget p3, p0, Ll/᩻᩷ۘ;->֡:I

    invoke-virtual {p2, p3}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 99
    iget-object p2, p0, Ll/᩻᩷ۘ;->۠:Ll/۠ۢۘ;

    invoke-virtual {p1, p2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 3560
    iget-object p1, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x1f

    .line 107
    iput p1, p0, Ll/᩻᩷ۘ;->᩸:I

    return-void

    .line 85
    :cond_0
    :try_start_2
    new-instance p1, Ll/۫᩷ۘ;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p3, p0, Ll/᩻᩷ۘ;->ۚ:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " max="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p0, Ll/᩻᩷ۘ;->֡:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " preferred="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p0, Ll/᩻᩷ۘ;->ܶ:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 39
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 85
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    .line 91
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    throw p2

    :catch_1
    move-exception p1

    .line 73
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    throw p2
.end method

.method public final ֫(Ll/ܺ᩻ۘ;)Z
    .locals 7

    .line 113
    iget v0, p0, Ll/᩻᩷ۘ;->᩸:I

    const/16 v1, 0x21

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/16 v4, 0x1f

    if-eq v0, v4, :cond_2

    if-eq v0, v1, :cond_0

    goto/16 :goto_0

    .line 165
    :cond_0
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 166
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    .line 167
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 169
    iget-object p1, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object p1, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v3

    .line 175
    :cond_1
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢۘ;->ܽ:[B

    .line 177
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object v0

    .line 178
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 180
    iget-object v1, p0, Ll/᩻᩷ۘ;->ۖ:Ll/ۘۜۘ;

    invoke-interface {v1, v0}, Ll/ۘۜۘ;->ۧ([B)V

    .line 182
    iget-object v1, p0, Ll/᩻᩷ۘ;->ۖ:Ll/ۘۜۘ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    iget-object v1, p0, Ll/᩻᩷ۘ;->ۖ:Ll/ۘۜۘ;

    invoke-interface {v1}, Ll/ۘۜۘ;->ۧ()[B

    move-result-object v1

    invoke-static {v1}, Ll/ܽۢۘ;->֫([B)[B

    move-result-object v1

    invoke-static {v1, v2}, Ll/ܽۢۘ;->֫([BZ)[B

    move-result-object v1

    iput-object v1, p0, Ll/ܽۢۘ;->ۧ:[B

    .line 203
    iget-object v1, p0, Ll/᩻᩷ۘ;->ۢ:[B

    invoke-static {v1, v3}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v1

    .line 204
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v1

    invoke-interface {v4, v5, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 205
    iget-object v1, p0, Ll/᩻᩷ۘ;->ۡ:[B

    invoke-static {v1, v3}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v1

    .line 206
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v1

    invoke-interface {v4, v5, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 207
    iget-object v1, p0, Ll/᩻᩷ۘ;->ۜ:[B

    invoke-static {v1, v3}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v1

    .line 208
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v1

    invoke-interface {v4, v5, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 209
    iget-object v1, p0, Ll/᩻᩷ۘ;->᩷:[B

    invoke-static {v1, v3}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v1

    .line 210
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v1

    invoke-interface {v4, v5, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 211
    iget-object v1, p0, Ll/ܽۢۘ;->ܽ:[B

    invoke-static {v1, v3}, Ll/ܽۢۘ;->ۧ([BZ)[B

    move-result-object v1

    .line 212
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v5, v1

    invoke-interface {v4, v5, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 213
    iget v1, p0, Ll/᩻᩷ۘ;->ۚ:I

    invoke-static {v1}, Ll/ܽۢۘ;->֫(I)[B

    move-result-object v1

    .line 214
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    const/4 v5, 0x4

    invoke-interface {v4, v5, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 215
    iget v1, p0, Ll/᩻᩷ۘ;->ܶ:I

    invoke-static {v1}, Ll/ܽۢۘ;->֫(I)[B

    move-result-object v1

    .line 216
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    invoke-interface {v4, v5, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 217
    iget v1, p0, Ll/᩻᩷ۘ;->֡:I

    invoke-static {v1}, Ll/ܽۢۘ;->֫(I)[B

    move-result-object v1

    .line 218
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    invoke-interface {v4, v5, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 219
    iget-object v1, p0, Ll/᩻᩷ۘ;->֨:[B

    invoke-static {v1, v3}, Ll/ܽۢۘ;->֫([BZ)[B

    move-result-object v1

    .line 220
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v6, v1

    invoke-interface {v4, v6, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 221
    iget-object v1, p0, Ll/᩻᩷ۘ;->ᩴ:[B

    invoke-static {v1, v3}, Ll/ܽۢۘ;->֫([BZ)[B

    move-result-object v1

    .line 222
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v6, v1

    invoke-interface {v4, v6, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 223
    iget-object v1, p0, Ll/᩻᩷ۘ;->ۘ:[B

    invoke-static {v1, v3}, Ll/ܽۢۘ;->֫([BZ)[B

    move-result-object v1

    .line 224
    iget-object v4, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v6, v1

    invoke-interface {v4, v6, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 225
    invoke-static {v0, v3}, Ll/ܽۢۘ;->֫([BZ)[B

    move-result-object v0

    .line 226
    iget-object v1, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    array-length v4, v0

    invoke-interface {v1, v4, v0}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 228
    iget-object v0, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    iget-object v1, p0, Ll/ܽۢۘ;->ۧ:[B

    array-length v4, v1

    invoke-interface {v0, v4, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 229
    iget-object v0, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    invoke-interface {v0}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢۘ;->֫:[B

    .line 235
    iget-object v0, p0, Ll/ܽۢۘ;->ܽ:[B

    aget-byte v1, v0, v3

    shl-int/lit8 v1, v1, 0x18

    const/high16 v4, -0x1000000

    and-int/2addr v1, v4

    aget-byte v2, v0, v2

    shl-int/lit8 v2, v2, 0x10

    const/high16 v4, 0xff0000

    and-int/2addr v2, v4

    or-int/2addr v1, v2

    const/4 v2, 0x2

    aget-byte v2, v0, v2

    shl-int/lit8 v2, v2, 0x8

    const v4, 0xff00

    and-int/2addr v2, v4

    or-int/2addr v1, v2

    const/4 v2, 0x3

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v1, v2

    .line 237
    invoke-static {v5, v1, v0}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v0

    add-int/2addr v1, v5

    .line 240
    iget-object v2, p0, Ll/ܽۢۘ;->ܽ:[B

    invoke-virtual {p0, v0, v2, p1, v1}, Ll/ܽۢۘ;->֫(Ljava/lang/String;[B[BI)Z

    move-result p1

    .line 242
    iput v3, p0, Ll/᩻᩷ۘ;->᩸:I

    return p1

    .line 118
    :cond_2
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 119
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    .line 120
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    if-eq v0, v4, :cond_3

    .line 122
    iget-object p1, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object p1, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v3

    .line 128
    :cond_3
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object v0

    iput-object v0, p0, Ll/᩻᩷ۘ;->֨:[B

    .line 129
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/᩻᩷ۘ;->ᩴ:[B

    .line 131
    new-instance p1, Ljava/math/BigInteger;

    iget-object v0, p0, Ll/᩻᩷ۘ;->֨:[B

    invoke-direct {p1, v2, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result p1

    .line 132
    iget v0, p0, Ll/᩻᩷ۘ;->ۚ:I

    if-lt p1, v0, :cond_5

    iget v0, p0, Ll/᩻᩷ۘ;->֡:I

    if-le p1, v0, :cond_4

    goto :goto_0

    .line 136
    :cond_4
    iget-object p1, p0, Ll/᩻᩷ۘ;->ۖ:Ll/ۘۜۘ;

    iget-object v0, p0, Ll/᩻᩷ۘ;->֨:[B

    invoke-interface {p1, v0}, Ll/ۘۜۘ;->ܽ([B)V

    .line 137
    iget-object p1, p0, Ll/᩻᩷ۘ;->ۖ:Ll/ۘۜۘ;

    iget-object v0, p0, Ll/᩻᩷ۘ;->ᩴ:[B

    invoke-interface {p1, v0}, Ll/ۘۜۘ;->֫([B)V

    .line 143
    iget-object p1, p0, Ll/᩻᩷ۘ;->ۖ:Ll/ۘۜۘ;

    invoke-interface {p1}, Ll/ۘۜۘ;->֫()[B

    move-result-object p1

    iput-object p1, p0, Ll/᩻᩷ۘ;->ۘ:[B

    .line 145
    iget-object p1, p0, Ll/᩻᩷ۘ;->۠:Ll/۠ۢۘ;

    invoke-virtual {p1}, Ll/۠ۢۘ;->֫()V

    .line 146
    iget-object p1, p0, Ll/᩻᩷ۘ;->ܺ:Ll/ܺ᩻ۘ;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 147
    iget-object p1, p0, Ll/᩻᩷ۘ;->ܺ:Ll/ܺ᩻ۘ;

    iget-object v0, p0, Ll/᩻᩷ۘ;->ۘ:[B

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->ܽ([B)V

    .line 148
    iget-object p1, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    iget-object v0, p0, Ll/᩻᩷ۘ;->۠:Ll/۠ۢۘ;

    invoke-virtual {p1, v0}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 150
    iget-object p1, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object p1, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    iput v1, p0, Ll/᩻᩷ۘ;->᩸:I

    return v2

    :cond_5
    :goto_0
    return v3
.end method

.method public final ܽ()I
    .locals 1

    .line 250
    iget v0, p0, Ll/᩻᩷ۘ;->᩸:I

    return v0
.end method
