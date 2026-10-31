.class public final Ll/֫ᩴ᩵;
.super Ll/ᩳᩴ᩵;
.source "D9XS"


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 2

    const/16 v0, 0x25

    const/4 v1, 0x0

    .line 41
    invoke-direct {p0, p1, v0, v1}, Ll/ᩳᩴ᩵;-><init>(Ll/֨ۡ᩵;BB)V

    .line 42
    new-instance p1, Ljava/lang/String;

    const-string v0, "\\PIPE\\LANMAN"

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ll/ᩳᩴ᩵;->ۗ֫:Ljava/lang/String;

    const/16 p1, 0x8

    .line 43
    iput p1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    .line 47
    iput v1, p0, Ll/ᩳᩴ᩵;->ܰ֫:I

    const/16 p1, 0x1388

    .line 48
    iput p1, p0, Ll/ᩳᩴ᩵;->֫ۧ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 108
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NetShareEnum["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ᩳᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 108
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۜ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ([B)I
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "WrLeh\u0000B13BWz\u0000"

    const-string v2, "ASCII"

    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v2, 0x0

    .line 69
    invoke-static {v2, v3, v0, p1}, Ll/֫֡᩵;->֫(JI[B)V

    .line 71
    array-length v2, v1

    const/4 v3, 0x2

    invoke-static {v1, v0, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 72
    array-length v0, v1

    add-int/2addr v3, v0

    const-wide/16 v1, 0x1

    .line 73
    invoke-static {v1, v2, v3, p1}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, v0, 0x4

    .line 75
    iget v2, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    int-to-long v2, v2

    invoke-static {v2, v3, v1, p1}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, v0, 0x6

    :catch_0
    return v0
.end method

.method public final ᩷(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
