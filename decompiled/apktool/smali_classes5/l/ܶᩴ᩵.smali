.class public final Ll/ܶᩴ᩵;
.super Ll/ᩳᩴ᩵;
.source "LA1K"


# instance fields
.field public final ܿۧ:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;Ljava/lang/String;I)V
    .locals 2

    const/16 v0, 0x32

    const/4 v1, 0x5

    .line 43
    invoke-direct {p0, p1, v0, v1}, Ll/ᩳᩴ᩵;-><init>(Ll/֨ۡ᩵;BB)V

    .line 44
    iput-object p2, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    .line 45
    iput p3, p0, Ll/ܶᩴ᩵;->ܿۧ:I

    const/4 p1, 0x0

    .line 46
    iput p1, p0, Ll/ᩳᩴ᩵;->ۧۧ:I

    const/4 p1, 0x2

    .line 47
    iput p1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    const/16 p1, 0x28

    .line 48
    iput p1, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 120
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trans2QueryPathInformation["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    invoke-super {p0}, Ll/ᩳᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",informationLevel=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x3

    const-string v3, ",filename="

    .line 0
    iget v4, p0, Ll/ܶᩴ᩵;->ܿۧ:I

    invoke-static {v4, v2, v3, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 121
    iget-object v2, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 121
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۜ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ([B)I
    .locals 3

    const/4 v0, 0x4

    .line 82
    iget v1, p0, Ll/ܶᩴ᩵;->ܿۧ:I

    if-eq v1, v0, :cond_2

    const/4 v0, 0x5

    if-eq v1, v0, :cond_1

    const/16 v0, 0x14

    if-ne v1, v0, :cond_0

    const-wide/16 v0, 0x104

    goto :goto_0

    .line 90
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported information level "

    .line 0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 90
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-wide/16 v0, 0x102

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x101

    :goto_0
    const/4 v2, 0x0

    .line 65
    invoke-static {v0, v1, v2, p1}, Ll/֫֡᩵;->֫(JI[B)V

    const/4 v0, 0x2

    .line 67
    aput-byte v2, p1, v0

    const/4 v0, 0x3

    .line 68
    aput-byte v2, p1, v0

    const/4 v0, 0x4

    .line 69
    aput-byte v2, p1, v0

    const/4 v0, 0x5

    .line 70
    aput-byte v2, p1, v0

    .line 71
    iget-object v0, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1, p1}, Ll/ۨۖ᩵;->֫(Ljava/lang/String;I[B)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final ᩷(I[B)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 55
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->ۡ֫()B

    move-result v1

    aput-byte v1, p2, p1

    const/4 p1, 0x0

    .line 56
    aput-byte p1, p2, v0

    const/4 p1, 0x2

    return p1
.end method
