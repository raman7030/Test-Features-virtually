.class public final Ll/ۙ᩵᩵;
.super Ll/۬ᩴ᩵;
.source "FA04"

# interfaces
.implements Ll/ۜۖ᩵;


# instance fields
.field public ۖ֫:[Ll/᩸᩵᩵;

.field public ۘ֫:I

.field public ۡ֫:[B

.field public ۢ֫:I

.field public ܺ֫:[I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;I)V
    .locals 5

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, v0}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    const/16 v1, 0x10

    new-array v1, v1, [B

    .line 41
    iput-object v1, p0, Ll/ۙ᩵᩵;->ۡ֫:[B

    .line 53
    iput p2, p0, Ll/ۙ᩵᩵;->ۘ֫:I

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    iget p2, p0, Ll/ۙ᩵᩵;->ۢ֫:I

    const/4 v1, 0x1

    or-int/2addr p2, v1

    iput p2, p0, Ll/ۙ᩵᩵;->ۢ֫:I

    .line 63
    sget-object p2, Ll/᩸ۡ᩵;->ۗ:Ll/᩸ۡ᩵;

    .line 64
    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ۚ()Ll/᩸ۡ᩵;

    move-result-object v2

    invoke-static {p2, v2}, Ll/᩸ۡ᩵;->֫(Ll/᩸ۡ᩵;Ll/᩸ۡ᩵;)Ll/᩸ۡ᩵;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܰۡ᩵;->֡()Ll/᩸ۡ᩵;

    move-result-object v2

    invoke-static {p2, v2}, Ll/᩸ۡ᩵;->ܽ(Ll/᩸ۡ᩵;Ll/᩸ۡ᩵;)Ljava/util/Set;

    move-result-object p2

    .line 66
    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v2

    new-array v2, v2, [I

    iput-object v2, p0, Ll/ۙ᩵᩵;->ܺ֫:[I

    .line 68
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸ۡ᩵;

    .line 69
    iget-object v4, p0, Ll/ۙ᩵᩵;->ܺ֫:[I

    invoke-virtual {v3}, Ll/᩸ۡ᩵;->֫()I

    move-result v3

    aput v3, v4, v2

    add-int/2addr v2, v1

    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {p1}, Ll/ܰۡ᩵;->֡()Ll/᩸ۡ᩵;

    move-result-object p2

    sget-object v2, Ll/᩸ۡ᩵;->۬:Ll/᩸ۡ᩵;

    invoke-virtual {p2, v2}, Ll/᩸ۡ᩵;->֫(Ll/᩸ۡ᩵;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 74
    invoke-virtual {p1}, Ll/ܰۡ᩵;->ۖ()[B

    move-result-object p2

    iget-object v2, p0, Ll/ۙ᩵᩵;->ۡ֫:[B

    array-length v3, v2

    invoke-static {p2, v0, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    :cond_1
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    .line 78
    invoke-virtual {p1}, Ll/ܰۡ᩵;->֡()Ll/᩸ۡ᩵;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll/ܰۡ᩵;->֡()Ll/᩸ۡ᩵;

    move-result-object v0

    sget-object v2, Ll/᩸ۡ᩵;->ۛ:Ll/᩸ۡ᩵;

    invoke-virtual {v0, v2}, Ll/᩸ۡ᩵;->֫(Ll/᩸ۡ᩵;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    new-array v0, v0, [B

    .line 80
    invoke-virtual {p1}, Ll/ܰۡ᩵;->ۤ()Ljava/security/SecureRandom;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 81
    new-instance p1, Ll/᩶᩵᩵;

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ll/᩶᩵᩵;-><init>([B[I)V

    invoke-virtual {p2, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 93
    :cond_2
    invoke-virtual {p2}, Ljava/util/LinkedList;->size()I

    move-result p1

    new-array p1, p1, [Ll/᩸᩵᩵;

    invoke-virtual {p2, p1}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/᩸᩵᩵;

    iput-object p1, p0, Ll/ۙ᩵᩵;->ۖ֫:[Ll/᩸᩵᩵;

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 5

    .line 170
    iget-object v0, p0, Ll/ۙ᩵᩵;->ܺ֫:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    .line 509
    rem-int/lit8 v1, v0, 0x8

    add-int/lit8 v2, v1, -0x4

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    if-gez v2, :cond_1

    add-int/lit8 v2, v1, 0x4

    :cond_1
    add-int/lit8 v0, v0, 0x8

    sub-int/2addr v0, v2

    :goto_0
    add-int/lit8 v0, v0, 0x64

    .line 171
    iget-object v1, p0, Ll/ۙ᩵᩵;->ۖ֫:[Ll/᩸᩵᩵;

    if-eqz v1, :cond_2

    .line 172
    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 173
    invoke-interface {v4}, Ll/᩹ۡ᩵;->size()I

    move-result v4

    invoke-static {v4}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x8

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 176
    :cond_2
    invoke-static {v0}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v0

    return v0
.end method

.method public final ֡֫()[Ll/᩸᩵᩵;
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۙ᩵᩵;->ۖ֫:[Ll/᩸᩵᩵;

    return-object v0
.end method

.method public final ۘ֫()I
    .locals 1

    .line 115
    iget v0, p0, Ll/ۙ᩵᩵;->ۢ֫:I

    return v0
.end method

.method public final ۚ֫()I
    .locals 1

    .line 101
    iget v0, p0, Ll/ۙ᩵᩵;->ۘ֫:I

    return v0
.end method

.method public final ۠()Z
    .locals 1

    .line 101
    iget v0, p0, Ll/ۙ᩵᩵;->ۘ֫:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
    .locals 1

    .line 159
    new-instance v0, Ll/ۗ᩵᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۗ᩵᩵;-><init>(Ll/֨ۡ᩵;)V

    return-object v0
.end method

.method public final ᩳ(I[B)I
    .locals 11

    const-wide/16 v0, 0x24

    .line 188
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 189
    iget-object v0, p0, Ll/ۙ᩵᩵;->ܺ֫:[I

    array-length v1, v0

    int-to-long v1, v1

    add-int/lit8 v3, p1, 0x2

    invoke-static {v1, v2, v3, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, p1, 0x4

    .line 192
    iget v2, p0, Ll/ۙ᩵᩵;->ۘ֫:I

    int-to-long v2, v2

    invoke-static {v2, v3, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, p1, 0x6

    const-wide/16 v2, 0x0

    .line 193
    invoke-static {v2, v3, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, p1, 0x8

    .line 196
    iget v4, p0, Ll/ۙ᩵᩵;->ۢ֫:I

    int-to-long v4, v4

    invoke-static {v4, v5, v1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v1, p1, 0xc

    const/16 v4, 0x10

    .line 199
    iget-object v5, p0, Ll/ۙ᩵᩵;->ۡ֫:[B

    const/4 v6, 0x0

    invoke-static {v5, v6, p2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v1, p1, 0x1c

    .line 204
    iget-object v4, p0, Ll/ۙ᩵᩵;->ۖ֫:[Ll/᩸᩵᩵;

    if-eqz v4, :cond_1

    array-length v5, v4

    if-nez v5, :cond_0

    goto :goto_0

    .line 208
    :cond_0
    array-length v5, v4

    int-to-long v7, v5

    add-int/lit8 v5, p1, 0x20

    invoke-static {v7, v8, v5, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v5, p1, 0x22

    .line 209
    invoke-static {v2, v3, v5, p2}, Ll/֫֡᩵;->֫(JI[B)V

    goto :goto_1

    .line 205
    :cond_1
    :goto_0
    invoke-static {v2, v3, v1, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    const/4 v1, 0x0

    :goto_1
    add-int/lit8 v5, p1, 0x24

    .line 213
    array-length v7, v0

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_2

    aget v9, v0, v8

    int-to-long v9, v9

    .line 214
    invoke-static {v9, v10, v5, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v5, v5, 0x2

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 218
    :cond_2
    invoke-virtual {p0, v5}, Ll/ۗᩴ᩵;->᩻(I)I

    move-result v0

    add-int/2addr v5, v0

    if-eqz v4, :cond_3

    .line 220
    array-length v0, v4

    if-eqz v0, :cond_3

    .line 221
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v0

    sub-int v0, v5, v0

    int-to-long v7, v0

    invoke-static {v7, v8, v1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 222
    array-length v0, v4

    :goto_3
    if-ge v6, v0, :cond_3

    aget-object v1, v4, v6

    .line 223
    invoke-interface {v1}, Ll/᩸᩵᩵;->֫()I

    move-result v7

    int-to-long v7, v7

    invoke-static {v7, v8, v5, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v7, v5, 0x2

    add-int/lit8 v8, v5, 0x4

    .line 226
    invoke-static {v2, v3, v8, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v5, v5, 0x8

    .line 228
    invoke-interface {v1, v5, p2}, Ll/᩹ۡ᩵;->֫(I[B)I

    move-result v1

    invoke-static {v1}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v1

    int-to-long v8, v1

    .line 229
    invoke-static {v8, v9, v7, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/2addr v5, v1

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_3
    sub-int/2addr v5, p1

    return v5
.end method

.method public final ᩴ֫()[B
    .locals 1

    .line 131
    iget-object v0, p0, Ll/ۙ᩵᩵;->ۡ֫:[B

    return-object v0
.end method

.method public final ᩵֫()[I
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ۙ᩵᩵;->ܺ֫:[I

    return-object v0
.end method
