.class public final Ll/᩹ۘ᩵;
.super Ll/ۨۖ᩵;
.source "F9ZZ"


# instance fields
.field public ֡֫:I

.field public ۚ֫:J


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;Ljava/lang/String;IJ)V
    .locals 1

    const/16 v0, 0x9

    .line 43
    invoke-direct {p0, p1, v0, p2}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;BLjava/lang/String;)V

    .line 44
    iput p3, p0, Ll/᩹ۘ᩵;->֡֫:I

    .line 45
    iput-wide p4, p0, Ll/᩹ۘ᩵;->ۚ֫:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 86
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComSetInformation["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-super {p0}, Ll/ۨۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",filename="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fileAttributes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩹ۘ᩵;->֡֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",lastWriteTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/᩹ۘ᩵;->ۚ֫:J

    const-string v4, "]"

    .line 0
    invoke-static {v1, v2, v3, v4}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 87
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ(I[B)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    const/4 v1, 0x4

    .line 66
    aput-byte v1, p2, p1

    .line 67
    iget-object v1, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {p0, v1, v0, p2}, Ll/ۨۖ᩵;->֫(Ljava/lang/String;I[B)I

    move-result p2

    add-int/2addr v0, p2

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ᩻(I[B)I
    .locals 5

    .line 52
    iget v0, p0, Ll/᩹ۘ᩵;->֡֫:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    .line 54
    iget-wide v1, p0, Ll/᩹ۘ᩵;->ۚ֫:J

    const-wide/16 v3, 0x3e8

    .line 95
    div-long/2addr v1, v3

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 p2, p1, 0x10

    sub-int/2addr p2, p1

    return p2
.end method
