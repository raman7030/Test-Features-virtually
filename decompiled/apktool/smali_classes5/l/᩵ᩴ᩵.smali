.class public final Ll/᩵ᩴ᩵;
.super Ll/ᩳᩴ᩵;
.source "D9UF"


# instance fields
.field public ۜۧ:I

.field public ܳۧ:I

.field public ܿۧ:Ljava/lang/String;

.field public ᩷ۧ:I

.field public ᩻ۧ:J


# direct methods
.method public constructor <init>(IIIILjava/lang/String;Ll/֨ۡ᩵;)V
    .locals 2

    const/16 v0, 0x32

    const/4 v1, 0x2

    .line 47
    invoke-direct {p0, p6, v0, v1}, Ll/ᩳᩴ᩵;-><init>(Ll/֨ۡ᩵;BB)V

    .line 48
    iput p1, p0, Ll/᩵ᩴ᩵;->᩷ۧ:I

    .line 49
    iput p2, p0, Ll/᩵ᩴ᩵;->ۜۧ:I

    .line 50
    iput-object p5, p0, Ll/᩵ᩴ᩵;->ܿۧ:Ljava/lang/String;

    const/16 p1, 0x104

    .line 51
    iput p1, p0, Ll/᩵ᩴ᩵;->ܳۧ:I

    const/16 p1, 0x8

    .line 53
    iput p1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    int-to-long p1, p3

    .line 54
    iput-wide p1, p0, Ll/᩵ᩴ᩵;->᩻ۧ:J

    .line 55
    iput p4, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 123
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trans2FindNext2["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    invoke-super {p0}, Ll/ᩳᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",sid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩵ᩴ᩵;->᩷ۧ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",searchCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۧ֫()Ll/֨ۡ᩵;

    move-result-object v2

    check-cast v2, Ll/ܰۡ᩵;

    invoke-virtual {v2}, Ll/ܰۡ᩵;->ܺ()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",informationLevel=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x3

    const-string v3, ",resumeKey=0x"

    .line 0
    iget v4, p0, Ll/᩵ᩴ᩵;->ܳۧ:I

    invoke-static {v4, v2, v3, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 125
    iget v2, p0, Ll/᩵ᩴ᩵;->ۜۧ:I

    const/4 v3, 0x4

    const-string v4, ",flags=0x"

    .line 0
    invoke-static {v2, v3, v4, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const/4 v2, 0x2

    const-string v3, ",filename="

    const/4 v4, 0x0

    invoke-static {v4, v2, v3, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 126
    iget-object v2, p0, Ll/᩵ᩴ᩵;->ܿۧ:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 126
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۜ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(ILjava/lang/String;)V
    .locals 0

    .line 62
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->reset()V

    .line 63
    iput p1, p0, Ll/᩵ᩴ᩵;->ۜۧ:I

    .line 64
    iput-object p2, p0, Ll/᩵ᩴ᩵;->ܿۧ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 65
    iput p1, p0, Ll/ۨۖ᩵;->᩺:I

    return-void
.end method

.method public final ܽ([B)I
    .locals 5

    .line 81
    iget v0, p0, Ll/᩵ᩴ᩵;->᩷ۧ:I

    int-to-long v0, v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1}, Ll/֫֡᩵;->֫(JI[B)V

    const/4 v0, 0x2

    .line 83
    iget-wide v3, p0, Ll/᩵ᩴ᩵;->᩻ۧ:J

    invoke-static {v3, v4, v0, p1}, Ll/֫֡᩵;->֫(JI[B)V

    .line 85
    iget v0, p0, Ll/᩵ᩴ᩵;->ܳۧ:I

    int-to-long v0, v0

    const/4 v3, 0x4

    invoke-static {v0, v1, v3, p1}, Ll/֫֡᩵;->֫(JI[B)V

    .line 87
    iget v0, p0, Ll/᩵ᩴ᩵;->ۜۧ:I

    int-to-long v0, v0

    const/4 v3, 0x6

    invoke-static {v0, v1, v3, p1}, Ll/֫֡᩵;->ۧ(JI[B)V

    const/16 v0, 0xa

    int-to-long v1, v2

    .line 89
    invoke-static {v1, v2, v0, p1}, Ll/֫֡᩵;->֫(JI[B)V

    .line 91
    iget-object v0, p0, Ll/᩵ᩴ᩵;->ܿۧ:Ljava/lang/String;

    const/16 v1, 0xc

    invoke-virtual {p0, v0, v1, p1}, Ll/ۨۖ᩵;->֫(Ljava/lang/String;I[B)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final ᩷(I[B)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 71
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->ۡ֫()B

    move-result v1

    aput-byte v1, p2, p1

    const/4 p1, 0x0

    .line 72
    aput-byte p1, p2, v0

    const/4 p1, 0x2

    return p1
.end method
