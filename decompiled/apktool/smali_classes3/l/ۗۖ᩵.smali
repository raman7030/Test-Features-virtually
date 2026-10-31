.class public final Ll/ۗۖ᩵;
.super Ljava/lang/Object;
.source "19TU"

# interfaces
.implements Ll/֡ۖ᩵;


# instance fields
.field public ۗ:I

.field public ۙ:J

.field public ᩶:Z

.field public ᩸:J

.field public ᩹:Z


# virtual methods
.method public final getAttributes()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getSize()J
    .locals 2

    .line 69
    iget-wide v0, p0, Ll/ۗۖ᩵;->ۙ:J

    return-wide v0
.end method

.method public final size()I
    .locals 1

    const/16 v0, 0x16

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 126
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbQueryInfoStandard[allocationSize="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/ۗۖ᩵;->᩸:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",endOfFile="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/ۗۖ᩵;->ۙ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",numberOfLinks="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۗۖ᩵;->ۗ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",deletePending="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ll/ۗۖ᩵;->᩹:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ",directory="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ll/ۗۖ᩵;->᩶:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(II[B)I
    .locals 2

    .line 81
    invoke-static {p1, p3}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۗۖ᩵;->᩸:J

    add-int/lit8 p2, p1, 0x8

    .line 83
    invoke-static {p2, p3}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۗۖ᩵;->ۙ:J

    add-int/lit8 p2, p1, 0x10

    .line 85
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    iput p2, p0, Ll/ۗۖ᩵;->ۗ:I

    add-int/lit8 p2, p1, 0x14

    add-int/lit8 v0, p1, 0x15

    .line 87
    aget-byte p2, p3, p2

    and-int/lit16 p2, p2, 0xff

    const/4 v1, 0x0

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Ll/ۗۖ᩵;->᩹:Z

    add-int/lit8 p2, p1, 0x16

    .line 88
    aget-byte p3, p3, v0

    and-int/lit16 p3, p3, 0xff

    if-lez p3, :cond_1

    const/4 v1, 0x1

    :cond_1
    iput-boolean v1, p0, Ll/ۗۖ᩵;->᩶:Z

    sub-int/2addr p2, p1

    return p2
.end method

.method public final ֫(I[B)I
    .locals 3

    .line 112
    iget-wide v0, p0, Ll/ۗۖ᩵;->᩸:J

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    add-int/lit8 v0, p1, 0x8

    .line 114
    iget-wide v1, p0, Ll/ۗۖ᩵;->ۙ:J

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    add-int/lit8 v0, p1, 0x10

    .line 116
    iget v1, p0, Ll/ۗۖ᩵;->ۗ:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x14

    add-int/lit8 v1, p1, 0x15

    .line 118
    iget-boolean v2, p0, Ll/ۗۖ᩵;->᩹:Z

    int-to-byte v2, v2

    aput-byte v2, p2, v0

    add-int/lit8 v0, p1, 0x16

    .line 119
    iget-boolean v2, p0, Ll/ۗۖ᩵;->᩶:Z

    int-to-byte v2, v2

    aput-byte v2, p2, v1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ۛ()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ۧ()B
    .locals 1

    const/4 v0, 0x5

    return v0
.end method
