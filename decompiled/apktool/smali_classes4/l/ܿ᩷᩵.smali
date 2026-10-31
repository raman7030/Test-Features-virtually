.class public final Ll/ܿ᩷᩵;
.super Ljava/io/ByteArrayOutputStream;
.source "6A0Y"


# instance fields
.field public final ᩸:I

.field public final ᩹:Ll/ܳ᩷᩵;


# direct methods
.method public constructor <init>(ILl/ܳ᩷᩵;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 40
    iput-object p2, p0, Ll/ܿ᩷᩵;->᩹:Ll/ܳ᩷᩵;

    .line 41
    iput p3, p0, Ll/ܿ᩷᩵;->᩸:I

    return-void
.end method


# virtual methods
.method public final writeByte(I)V
    .locals 0

    and-int/lit16 p1, p1, 0xff

    .line 45
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final writeBytes([B)V
    .locals 1

    if-eqz p1, :cond_0

    .line 56
    array-length v0, p1

    invoke-virtual {p0, v0, p1}, Ll/ܿ᩷᩵;->֫(I[B)V

    :cond_0
    return-void
.end method

.method public final writeShort(I)V
    .locals 1

    shr-int/lit8 v0, p1, 0x8

    .line 67
    invoke-virtual {p0, v0}, Ll/ܿ᩷᩵;->writeByte(I)V

    .line 68
    invoke-virtual {p0, p1}, Ll/ܿ᩷᩵;->writeByte(I)V

    return-void
.end method

.method public final ֫(I[B)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 62
    aget-byte v1, p2, v0

    invoke-virtual {p0, v1}, Ll/ܿ᩷᩵;->writeByte(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 6

    :cond_0
    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_1
    const/16 v2, 0x2e

    .line 152
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    if-gez v1, :cond_1

    const/4 v1, -0x1

    goto :goto_2

    :cond_1
    if-eqz v1, :cond_3

    add-int/lit8 v2, v1, -0x1

    .line 156
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5c

    if-eq v2, v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    if-gez v1, :cond_4

    .line 120
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    :cond_4
    if-gtz v1, :cond_5

    .line 123
    invoke-virtual {p0, v0}, Ll/ܿ᩷᩵;->writeByte(I)V

    return-void

    .line 126
    :cond_5
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v2, "\\."

    const-string v3, "."

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 128
    iget-object v2, p0, Ll/ܿ᩷᩵;->᩹:Ll/ܳ᩷᩵;

    iget-object v4, v2, Ll/ܳ᩷᩵;->ۖ:Ljava/util/HashMap;

    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_6

    .line 130
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result p1

    shr-int/lit8 v0, p1, 0x8

    or-int/lit16 v0, v0, 0xc0

    .line 131
    invoke-virtual {p0, v0}, Ll/ܿ᩷᩵;->writeByte(I)V

    and-int/lit16 p1, p1, 0xff

    .line 132
    invoke-virtual {p0, p1}, Ll/ܿ᩷᩵;->writeByte(I)V

    return-void

    .line 135
    :cond_6
    iget-object v2, v2, Ll/ܳ᩷᩵;->ۖ:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v4

    iget v5, p0, Ll/ܿ᩷᩵;->᩸:I

    add-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p0, v2, v0}, Ll/ܿ᩷᩵;->ۧ(ILjava/lang/String;)V

    .line 140
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 141
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 142
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method public final ֫(Ll/᩹᩷᩵;J)V
    .locals 6

    .line 170
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܿ᩷᩵;->֫(Ljava/lang/String;)V

    .line 171
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨۢ᩵;->ۧ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 172
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ܽ()Ll/ۛۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢ᩵;->ۧ()I

    move-result v0

    invoke-virtual {p1}, Ll/ܰۜ᩵;->᩷()Z

    move-result v1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ܿ᩷᩵;->᩹:Ll/ܳ᩷᩵;

    if-eqz v1, :cond_0

    .line 115
    iget-boolean v1, v3, Ll/ᩳ᩷᩵;->ܳ:Z

    if-eqz v1, :cond_0

    const v1, 0x8000

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    .line 172
    invoke-virtual {p0, v0}, Ll/ܿ᩷᩵;->writeShort(I)V

    const-wide/16 v0, 0x0

    cmp-long v4, p2, v0

    if-nez v4, :cond_1

    .line 173
    invoke-virtual {p1}, Ll/᩹᩷᩵;->ۖ()I

    move-result p2

    goto :goto_1

    :cond_1
    const/16 v4, 0x64

    .line 140
    invoke-virtual {p1, v4}, Ll/᩹᩷᩵;->֫(I)J

    move-result-wide v4

    sub-long/2addr v4, p2

    const-wide/16 p2, 0x3e8

    div-long/2addr v4, p2

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    long-to-int p2, p2

    :goto_1
    shr-int/lit8 p3, p2, 0x10

    .line 72
    invoke-virtual {p0, p3}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 73
    invoke-virtual {p0, p2}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 176
    new-instance p2, Ll/ܿ᩷᩵;

    iget p3, p0, Ll/ܿ᩷᩵;->᩸:I

    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    add-int/2addr v0, p3

    add-int/lit8 v0, v0, 0x2

    const/16 p3, 0x200

    invoke-direct {p2, p3, v3, v0}, Ll/ܿ᩷᩵;-><init>(ILl/ܳ᩷᩵;I)V

    .line 177
    invoke-virtual {p1, p2}, Ll/᩹᩷᩵;->֫(Ll/ܿ᩷᩵;)V

    .line 178
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    .line 180
    array-length p2, p1

    invoke-virtual {p0, p2}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 181
    array-length p2, p1

    invoke-virtual {p0, p1, v2, p2}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public final ۧ(ILjava/lang/String;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x7ff

    const/16 v4, 0x7f

    const/4 v5, 0x1

    if-ge v1, p1, :cond_2

    .line 80
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_0

    if-gt v6, v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    if-le v6, v3, :cond_1

    add-int/lit8 v2, v2, 0x3

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x2

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 92
    :cond_2
    invoke-virtual {p0, v2}, Ll/ܿ᩷᩵;->writeByte(I)V

    :goto_2
    if-ge v0, p1, :cond_5

    .line 95
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-lt v1, v5, :cond_3

    if-gt v1, v4, :cond_3

    .line 97
    invoke-virtual {p0, v1}, Ll/ܿ᩷᩵;->writeByte(I)V

    goto :goto_3

    :cond_3
    if-le v1, v3, :cond_4

    shr-int/lit8 v2, v1, 0xc

    and-int/lit8 v2, v2, 0xf

    or-int/lit16 v2, v2, 0xe0

    .line 100
    invoke-virtual {p0, v2}, Ll/ܿ᩷᩵;->writeByte(I)V

    shr-int/lit8 v2, v1, 0x6

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    .line 101
    invoke-virtual {p0, v2}, Ll/ܿ᩷᩵;->writeByte(I)V

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    .line 102
    invoke-virtual {p0, v1}, Ll/ܿ᩷᩵;->writeByte(I)V

    goto :goto_3

    :cond_4
    shr-int/lit8 v2, v1, 0x6

    and-int/lit8 v2, v2, 0x1f

    or-int/lit16 v2, v2, 0xc0

    .line 104
    invoke-virtual {p0, v2}, Ll/ܿ᩷᩵;->writeByte(I)V

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    .line 105
    invoke-virtual {p0, v1}, Ll/ܿ᩷᩵;->writeByte(I)V

    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method
