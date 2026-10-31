.class public final Ll/۫ۖ᩵;
.super Ljava/lang/Object;
.source "I9WL"

# interfaces
.implements Ll/᩺ܺ᩵;


# instance fields
.field public ۙ:I

.field public ᩶:J

.field public ᩸:J

.field public ᩹:I


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 88
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbInfoAllocation[alloc="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/۫ۖ᩵;->᩸:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",free="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/۫ۖ᩵;->᩶:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",sectPerAlloc="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/۫ۖ᩵;->ۙ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",bytesPerSect="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/۫ۖ᩵;->᩹:I

    const-string v3, "]"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(II[B)I
    .locals 2

    add-int/lit8 p2, p1, 0x4

    .line 70
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    iput p2, p0, Ll/۫ۖ᩵;->ۙ:I

    add-int/lit8 p2, p1, 0x8

    .line 73
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    int-to-long v0, p2

    iput-wide v0, p0, Ll/۫ۖ᩵;->᩸:J

    add-int/lit8 p2, p1, 0xc

    .line 76
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    int-to-long v0, p2

    iput-wide v0, p0, Ll/۫ۖ᩵;->᩶:J

    add-int/lit8 p2, p1, 0x10

    .line 79
    invoke-static {p2, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result p2

    iput p2, p0, Ll/۫ۖ᩵;->᩹:I

    add-int/lit8 p2, p1, 0x14

    sub-int/2addr p2, p1

    return p2
.end method

.method public final ᩳ()J
    .locals 4

    .line 50
    iget-wide v0, p0, Ll/۫ۖ᩵;->᩸:J

    iget v2, p0, Ll/۫ۖ᩵;->ۙ:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    iget v2, p0, Ll/۫ۖ᩵;->᩹:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    return-wide v0
.end method
