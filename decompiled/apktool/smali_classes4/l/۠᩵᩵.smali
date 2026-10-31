.class public final Ll/۠᩵᩵;
.super Ll/۫ᩴ᩵;
.source "6A28"


# instance fields
.field public ᩴ֫:[B

.field public ᩵֫:B


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Smb2OpblockBreakNotification[oplockLevel="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-byte v1, p0, Ll/۠᩵᩵;->᩵֫:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",fileId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۠᩵᩵;->ᩴ֫:[B

    const/4 v2, 0x0

    .line 86
    array-length v3, v1

    invoke-static {v1, v2, v3}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(I[B)I
    .locals 4

    .line 64
    invoke-static {p1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    const/16 v1, 0x18

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, p1, 0x2

    .line 69
    aget-byte v0, p2, v0

    iput-byte v0, p0, Ll/۠᩵᩵;->᩵֫:B

    add-int/lit8 v0, p1, 0x8

    const/16 v1, 0x10

    new-array v2, v1, [B

    .line 73
    iput-object v2, p0, Ll/۠᩵᩵;->ᩴ֫:[B

    const/4 v3, 0x0

    .line 74
    invoke-static {p2, v0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p2, p1, 0x18

    sub-int/2addr p2, p1

    return p2

    .line 66
    :cond_0
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Expected structureSize = 24"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 66
    throw p1
.end method

.method public final ᩳ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
