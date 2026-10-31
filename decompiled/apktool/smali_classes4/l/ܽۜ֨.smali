.class public final Ll/ܽۜ֨;
.super Ll/ۛ᩻֨;
.source "A1SM"


# instance fields
.field public final ֫֫:[B

.field public ۗ:Z

.field public ۙ:Ljava/io/IOException;

.field public ۛ:I

.field public ۟:Z

.field public ۤ:Ll/ۛ᩻֨;

.field public final ۨ:I

.field public ۫:Ll/ۖ᩷֨;

.field public ۬:Ll/ܰۜ֨;

.field public ܰ:Ll/ܶ᩷֨;

.field public ᩶:Z

.field public final ᩸:Ll/ۘ᩻֨;

.field public final ᩹:[B

.field public ᩺:Z


# direct methods
.method public constructor <init>(Ll/ۛ᩻֨;Ll/ۧۜ֨;Ll/ۘ᩻֨;)V
    .locals 10

    .line 14
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Ll/ܽۜ֨;->᩶:Z

    .line 26
    iput-boolean v0, p0, Ll/ܽۜ֨;->۟:Z

    .line 27
    iput-boolean v0, p0, Ll/ܽۜ֨;->᩺:Z

    const/4 v1, 0x0

    .line 29
    iput v1, p0, Ll/ܽۜ֨;->ۛ:I

    .line 30
    iput-boolean v1, p0, Ll/ܽۜ֨;->ۗ:Z

    const/4 v1, 0x0

    .line 31
    iput-object v1, p0, Ll/ܽۜ֨;->ۙ:Ljava/io/IOException;

    const/4 v1, 0x6

    new-array v1, v1, [B

    .line 33
    iput-object v1, p0, Ll/ܽۜ֨;->᩹:[B

    new-array v0, v0, [B

    .line 35
    iput-object v0, p0, Ll/ܽۜ֨;->֫֫:[B

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    iput-object p3, p0, Ll/ܽۜ֨;->᩸:Ll/ۘ᩻֨;

    .line 57
    iput-object p1, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    .line 58
    new-instance p1, Ll/ܶ᩷֨;

    invoke-direct {p1, p3}, Ll/ܶ᩷֨;-><init>(Ll/ۘ᩻֨;)V

    iput-object p1, p0, Ll/ܽۜ֨;->ܰ:Ll/ܶ᩷֨;

    .line 60
    invoke-virtual {p2}, Ll/ۧۜ֨;->ܽ()I

    move-result v4

    const/high16 p1, 0x10000

    if-le p1, v4, :cond_0

    sub-int/2addr p1, v4

    move v5, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v5, 0x0

    .line 62
    :goto_0
    iget-object v0, p0, Ll/ܽۜ֨;->ܰ:Ll/ܶ᩷֨;

    .line 63
    invoke-virtual {p2}, Ll/ۧۜ֨;->ᩳ()I

    move-result v1

    invoke-virtual {p2}, Ll/ۧۜ֨;->᩷()I

    move-result v2

    .line 64
    invoke-virtual {p2}, Ll/ۧۜ֨;->ܳ()I

    move-result v3

    .line 65
    invoke-virtual {p2}, Ll/ۧۜ֨;->ۜ()I

    move-result v6

    .line 66
    invoke-virtual {p2}, Ll/ۧۜ֨;->ܿ()I

    move-result v7

    invoke-virtual {p2}, Ll/ۧۜ֨;->֫()I

    move-result v8

    move-object v9, p3

    .line 62
    invoke-static/range {v0 .. v9}, Ll/ۖ᩷֨;->֫(Ll/ܶ᩷֨;IIIIIIIILl/ۘ᩻֨;)Ll/ۖ᩷֨;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۜ֨;->۫:Ll/ۖ᩷֨;

    .line 69
    invoke-virtual {p1}, Ll/ۖ᩷֨;->ܽ()Ll/ܰۜ֨;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۜ֨;->۬:Ll/ܰۜ֨;

    .line 77
    invoke-virtual {p2}, Ll/ۧۜ֨;->᩷()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2d

    invoke-virtual {p2}, Ll/ۧۜ֨;->ᩳ()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, Ll/ܽۜ֨;->ۨ:I

    return-void
.end method

.method private ֫()V
    .locals 11

    .line 114
    iget-object v0, p0, Ll/ܽۜ֨;->ܰ:Ll/ܶ᩷֨;

    invoke-virtual {v0}, Ll/ܶ᩷֨;->֫()I

    move-result v0

    .line 115
    iget-object v1, p0, Ll/ܽۜ֨;->۫:Ll/ۖ᩷֨;

    invoke-virtual {v1}, Ll/ۖ᩷֨;->ܳ()I

    move-result v1

    add-int/lit8 v2, v0, 0x2

    const/4 v3, 0x3

    .line 122
    iget-object v4, p0, Ll/ܽۜ֨;->᩹:[B

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x2

    if-ge v2, v1, :cond_4

    .line 140
    iget-boolean v2, p0, Ll/ܽۜ֨;->᩺:Z

    if-eqz v2, :cond_1

    .line 141
    iget-boolean v8, p0, Ll/ܽۜ֨;->᩶:Z

    if-eqz v8, :cond_0

    const/16 v8, 0xe0

    goto :goto_0

    :cond_0
    const/16 v8, 0xc0

    goto :goto_0

    .line 146
    :cond_1
    iget-boolean v8, p0, Ll/ܽۜ֨;->۟:Z

    if-eqz v8, :cond_2

    const/16 v8, 0xa0

    goto :goto_0

    :cond_2
    const/16 v8, 0x80

    :goto_0
    add-int/lit8 v9, v1, -0x1

    ushr-int/lit8 v10, v9, 0x10

    or-int/2addr v8, v10

    int-to-byte v8, v8

    .line 153
    aput-byte v8, v4, v5

    ushr-int/lit8 v8, v9, 0x8

    int-to-byte v8, v8

    .line 154
    aput-byte v8, v4, v6

    int-to-byte v8, v9

    .line 155
    aput-byte v8, v4, v7

    sub-int/2addr v0, v6

    ushr-int/lit8 v6, v0, 0x8

    int-to-byte v6, v6

    .line 156
    aput-byte v6, v4, v3

    const/4 v3, 0x4

    int-to-byte v0, v0

    .line 157
    aput-byte v0, v4, v3

    const/4 v0, 0x5

    if-eqz v2, :cond_3

    .line 160
    iget v2, p0, Ll/ܽۜ֨;->ۨ:I

    int-to-byte v2, v2

    aput-byte v2, v4, v0

    .line 161
    iget-object v0, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    const/4 v2, 0x6

    invoke-virtual {v0, v4, v5, v2}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_1

    .line 163
    :cond_3
    iget-object v2, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    invoke-virtual {v2, v4, v5, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 166
    :goto_1
    iget-object v0, p0, Ll/ܽۜ֨;->ܰ:Ll/ܶ᩷֨;

    iget-object v2, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    invoke-virtual {v0, v2}, Ll/ܶ᩷֨;->֫(Ljava/io/OutputStream;)V

    .line 168
    iput-boolean v5, p0, Ll/ܽۜ֨;->᩺:Z

    .line 169
    iput-boolean v5, p0, Ll/ܽۜ֨;->۟:Z

    .line 170
    iput-boolean v5, p0, Ll/ܽۜ֨;->᩶:Z

    goto :goto_4

    .line 125
    :cond_4
    iget-object v0, p0, Ll/ܽۜ֨;->۫:Ll/ۖ᩷֨;

    invoke-virtual {v0}, Ll/ۖ᩷֨;->֫()V

    .line 126
    iget-object v0, p0, Ll/ܽۜ֨;->۫:Ll/ۖ᩷֨;

    invoke-virtual {v0}, Ll/ۖ᩷֨;->ܳ()I

    move-result v1

    move v0, v1

    :goto_2
    if-lez v0, :cond_6

    const/high16 v2, 0x10000

    .line 175
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 176
    iget-boolean v8, p0, Ll/ܽۜ֨;->᩶:Z

    if-eqz v8, :cond_5

    const/4 v8, 0x1

    goto :goto_3

    :cond_5
    const/4 v8, 0x2

    :goto_3
    int-to-byte v8, v8

    aput-byte v8, v4, v5

    add-int/lit8 v8, v2, -0x1

    ushr-int/lit8 v9, v8, 0x8

    int-to-byte v9, v9

    .line 177
    aput-byte v9, v4, v6

    int-to-byte v8, v8

    .line 178
    aput-byte v8, v4, v7

    .line 179
    iget-object v8, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    invoke-virtual {v8, v4, v5, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 180
    iget-object v8, p0, Ll/ܽۜ֨;->۬:Ll/ܰۜ֨;

    iget-object v9, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    invoke-virtual {v8, v9, v0, v2}, Ll/ܰۜ֨;->֫(Ljava/io/OutputStream;II)V

    sub-int/2addr v0, v2

    .line 182
    iput-boolean v5, p0, Ll/ܽۜ֨;->᩶:Z

    goto :goto_2

    .line 185
    :cond_6
    iput-boolean v6, p0, Ll/ܽۜ֨;->۟:Z

    .line 131
    :goto_4
    iget v0, p0, Ll/ܽۜ֨;->ۛ:I

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ܽۜ֨;->ۛ:I

    .line 132
    iget-object v0, p0, Ll/ܽۜ֨;->۫:Ll/ۖ᩷֨;

    invoke-virtual {v0}, Ll/ۖ᩷֨;->᩻()V

    .line 133
    iget-object v0, p0, Ll/ܽۜ֨;->ܰ:Ll/ܶ᩷֨;

    invoke-virtual {v0}, Ll/ܶ᩷֨;->ܽ()V

    return-void
.end method

.method private ܽ()V
    .locals 3

    .line 191
    iget-object v0, p0, Ll/ܽۜ֨;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_1

    .line 194
    iget-object v0, p0, Ll/ܽۜ֨;->۬:Ll/ܰۜ֨;

    invoke-virtual {v0}, Ll/ܰۜ֨;->ܿ()V

    .line 197
    :goto_0
    :try_start_0
    iget v0, p0, Ll/ܽۜ֨;->ۛ:I

    if-lez v0, :cond_0

    .line 198
    iget-object v0, p0, Ll/ܽۜ֨;->۫:Ll/ۖ᩷֨;

    invoke-virtual {v0}, Ll/ۖ᩷֨;->ۧ()Z

    .line 199
    invoke-direct {p0}, Ll/ܽۜ֨;->֫()V

    goto :goto_0

    .line 202
    :cond_0
    iget-object v0, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    .line 208
    iput-boolean v0, p0, Ll/ܽۜ֨;->ۗ:Z

    .line 210
    iget-object v0, p0, Ll/ܽۜ֨;->۫:Ll/ۖ᩷֨;

    iget-object v1, p0, Ll/ܽۜ֨;->᩸:Ll/ۘ᩻֨;

    invoke-virtual {v0, v1}, Ll/ۖ᩷֨;->֫(Ll/ۘ᩻֨;)V

    const/4 v0, 0x0

    .line 211
    iput-object v0, p0, Ll/ܽۜ֨;->۫:Ll/ۖ᩷֨;

    .line 212
    iput-object v0, p0, Ll/ܽۜ֨;->۬:Ll/ܰۜ֨;

    .line 213
    iget-object v2, p0, Ll/ܽۜ֨;->ܰ:Ll/ܶ᩷֨;

    invoke-virtual {v2, v1}, Ll/ܶ᩷֨;->֫(Ll/ۘ᩻֨;)V

    .line 214
    iput-object v0, p0, Ll/ܽۜ֨;->ܰ:Ll/ܶ᩷֨;

    return-void

    :catch_0
    move-exception v0

    .line 204
    iput-object v0, p0, Ll/ܽۜ֨;->ۙ:Ljava/io/IOException;

    .line 205
    throw v0

    .line 192
    :cond_1
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 256
    iget-object v0, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    if-eqz v0, :cond_2

    .line 257
    iget-boolean v0, p0, Ll/ܽۜ֨;->ۗ:Z

    if-nez v0, :cond_0

    .line 259
    :try_start_0
    invoke-direct {p0}, Ll/ܽۜ֨;->ܽ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    :catch_0
    :cond_0
    :try_start_1
    iget-object v0, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 266
    iget-object v1, p0, Ll/ܽۜ֨;->ۙ:Ljava/io/IOException;

    if-nez v1, :cond_1

    .line 267
    iput-object v0, p0, Ll/ܽۜ֨;->ۙ:Ljava/io/IOException;

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 270
    iput-object v0, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    .line 273
    :cond_2
    iget-object v0, p0, Ll/ܽۜ֨;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_3

    return-void

    .line 274
    :cond_3
    throw v0
.end method

.method public final finish()V
    .locals 1

    .line 242
    iget-boolean v0, p0, Ll/ܽۜ֨;->ۗ:Z

    if-nez v0, :cond_0

    .line 243
    invoke-direct {p0}, Ll/ܽۜ֨;->ܽ()V

    .line 246
    :try_start_0
    iget-object v0, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    invoke-virtual {v0}, Ll/ۛ᩻֨;->finish()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 248
    iput-object v0, p0, Ll/ܽۜ֨;->ۙ:Ljava/io/IOException;

    .line 249
    throw v0

    :cond_0
    return-void
.end method

.method public final flush()V
    .locals 2

    .line 219
    iget-object v0, p0, Ll/ܽۜ֨;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_2

    .line 222
    iget-boolean v0, p0, Ll/ܽۜ֨;->ۗ:Z

    if-nez v0, :cond_1

    .line 226
    :try_start_0
    iget-object v0, p0, Ll/ܽۜ֨;->۬:Ll/ܰۜ֨;

    invoke-virtual {v0}, Ll/ܰۜ֨;->ܳ()V

    .line 228
    :goto_0
    iget v0, p0, Ll/ܽۜ֨;->ۛ:I

    if-lez v0, :cond_0

    .line 229
    iget-object v0, p0, Ll/ܽۜ֨;->۫:Ll/ۖ᩷֨;

    invoke-virtual {v0}, Ll/ۖ᩷֨;->ۧ()Z

    .line 230
    invoke-direct {p0}, Ll/ܽۜ֨;->֫()V

    goto :goto_0

    .line 233
    :cond_0
    iget-object v0, p0, Ll/ܽۜ֨;->ۤ:Ll/ۛ᩻֨;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 235
    iput-object v0, p0, Ll/ܽۜ֨;->ۙ:Ljava/io/IOException;

    .line 236
    throw v0

    .line 223
    :cond_1
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "Stream finished or closed"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 223
    throw v0

    .line 220
    :cond_2
    throw v0
.end method

.method public final write(I)V
    .locals 2

    int-to-byte p1, p1

    .line 82
    iget-object v0, p0, Ll/ܽۜ֨;->֫֫:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 83
    invoke-virtual {p0, v0, v1, p1}, Ll/ܽۜ֨;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 2

    if-ltz p2, :cond_4

    if-ltz p3, :cond_4

    add-int v0, p2, p3

    if-ltz v0, :cond_4

    .line 88
    array-length v1, p1

    if-gt v0, v1, :cond_4

    .line 91
    iget-object v0, p0, Ll/ܽۜ֨;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_3

    .line 94
    iget-boolean v0, p0, Ll/ܽۜ֨;->ۗ:Z

    if-nez v0, :cond_2

    :cond_0
    :goto_0
    if-lez p3, :cond_1

    .line 99
    :try_start_0
    iget-object v0, p0, Ll/ܽۜ֨;->۬:Ll/ܰۜ֨;

    invoke-virtual {v0, p2, p3, p1}, Ll/ܰۜ֨;->֫(II[B)I

    move-result v0

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    .line 102
    iget v1, p0, Ll/ܽۜ֨;->ۛ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ܽۜ֨;->ۛ:I

    .line 104
    iget-object v0, p0, Ll/ܽۜ֨;->۫:Ll/ۖ᩷֨;

    invoke-virtual {v0}, Ll/ۖ᩷֨;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    invoke-direct {p0}, Ll/ܽۜ֨;->֫()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 108
    iput-object p1, p0, Ll/ܽۜ֨;->ۙ:Ljava/io/IOException;

    .line 109
    throw p1

    :cond_1
    return-void

    .line 95
    :cond_2
    new-instance p1, Ll/ۖۜ֨;

    const-string p2, "Stream finished or closed"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 95
    throw p1

    .line 92
    :cond_3
    throw v0

    .line 89
    :cond_4
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
