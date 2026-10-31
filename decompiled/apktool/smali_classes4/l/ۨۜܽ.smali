.class public final Ll/ۨۜܽ;
.super Ljava/lang/Object;
.source "69RK"

# interfaces
.implements Ll/᩶ۜܽ;


# instance fields
.field public ᩸:Ll/֡ܺᩴ;

.field public final ᩹:Ll/᩻ۖܽ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "r"

    .line 17
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    iput-object p1, p0, Ll/ۨۜܽ;->᩹:Ll/᩻ۖܽ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 200
    iget-object v0, p0, Ll/ۨۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->close()V

    return-void
.end method

.method public final readByte()B
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ۨۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->readByte()B

    move-result v0

    return v0
.end method

.method public final readInt()I
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ۨۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->readInt()I

    move-result v0

    return v0
.end method

.method public final seek(J)V
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ۨۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1, p2}, Ll/᩻ۖܽ;->seek(J)V

    return-void
.end method

.method public final skipBytes(I)V
    .locals 1

    if-ltz p1, :cond_1

    .line 35
    iget-object v0, p0, Ll/ۨۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1}, Ll/᩻ۖܽ;->skipBytes(I)I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    .line 36
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ֫()I
    .locals 4

    .line 100
    iget-object v0, p0, Ll/ۨۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v1

    .line 101
    invoke-virtual {v0}, Ll/᩻ۖܽ;->readInt()I

    move-result v3

    .line 102
    invoke-virtual {v0, v1, v2}, Ll/᩻ۖܽ;->seek(J)V

    return v3
.end method

.method public final ۛۧ()I
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۨۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->ۛۧ()I

    move-result v0

    return v0
.end method

.method public final ۜۧ()[B
    .locals 4

    .line 131
    iget-object v0, p0, Ll/ۨۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->readInt()I

    move-result v1

    .line 132
    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 133
    invoke-virtual {v0, v2, v3, v1}, Ll/᩻ۖܽ;->֫([BII)V

    return-object v2
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 5

    .line 157
    iget-object v0, p0, Ll/ۨۜܽ;->᩸:Ll/֡ܺᩴ;

    if-nez v0, :cond_0

    .line 159
    new-instance v0, Ll/֡ܺᩴ;

    invoke-direct {v0}, Ll/֡ܺᩴ;-><init>()V

    iput-object v0, p0, Ll/ۨۜܽ;->᩸:Ll/֡ܺᩴ;

    goto :goto_0

    .line 161
    :cond_0
    invoke-virtual {v0}, Ll/֡ܺᩴ;->֫()V

    .line 164
    :goto_0
    iget-object v1, p0, Ll/ۨۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v1

    if-lez v1, :cond_1

    .line 165
    invoke-virtual {v0, v1}, Ll/֡ܺᩴ;->write(I)V

    goto :goto_0

    .line 167
    :cond_1
    new-instance v1, Ljava/lang/String;

    iget-object v2, v0, Ll/֡ܺᩴ;->᩸:[B

    iget v0, v0, Ll/֡ܺᩴ;->᩹:I

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v1
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 4

    .line 139
    iget-object v0, p0, Ll/ۨۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->readInt()I

    move-result v1

    .line 140
    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 141
    invoke-virtual {v0, v2, v3, v1}, Ll/᩻ۖܽ;->֫([BII)V

    .line 142
    new-instance v0, Ljava/lang/String;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method
