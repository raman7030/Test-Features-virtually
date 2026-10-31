.class public final Ll/ۖ᩺ܺ;
.super Ljava/io/FilterOutputStream;
.source "G2LJ"

# interfaces
.implements Ljava/io/DataOutput;


# virtual methods
.method public final close()V
    .locals 1

    .line 169
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 53
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public final writeBoolean(Z)V
    .locals 1

    .line 58
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    check-cast v0, Ljava/io/DataOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    return-void
.end method

.method public final writeByte(I)V
    .locals 1

    .line 63
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    check-cast v0, Ljava/io/DataOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    return-void
.end method

.method public final writeBytes(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 73
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    check-cast v0, Ljava/io/DataOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    return-void
.end method

.method public final writeChar(I)V
    .locals 0

    .line 84
    invoke-virtual {p0, p1}, Ll/ۖ᩺ܺ;->writeShort(I)V

    return-void
.end method

.method public final writeChars(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 95
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 96
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 84
    invoke-virtual {p0, v1}, Ll/ۖ᩺ܺ;->writeShort(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final writeDouble(D)V
    .locals 0

    .line 108
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ll/ۖ᩺ܺ;->writeLong(J)V

    return-void
.end method

.method public final writeFloat(F)V
    .locals 0

    .line 119
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۖ᩺ܺ;->writeInt(I)V

    return-void
.end method

.method public final writeInt(I)V
    .locals 2

    .line 130
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    and-int/lit16 v1, p1, 0xff

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 131
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 132
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    shr-int/lit8 v1, p1, 0x10

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 133
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final writeLong(J)V
    .locals 1

    .line 144
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    check-cast v0, Ljava/io/DataOutputStream;

    invoke-static {p1, p2}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/io/DataOutputStream;->writeLong(J)V

    return-void
.end method

.method public final writeShort(I)V
    .locals 2

    .line 155
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    and-int/lit16 v1, p1, 0xff

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 156
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    shr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final writeUTF(Ljava/lang/String;)V
    .locals 1

    .line 161
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    check-cast v0, Ljava/io/DataOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    return-void
.end method
