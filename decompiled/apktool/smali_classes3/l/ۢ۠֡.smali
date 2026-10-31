.class public Ll/ۢ۠֡;
.super Ljava/io/InputStream;
.source "0AK2"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ۬:Z

.field public ᩶:Ljava/io/InputStream;

.field public ᩸:Ll/֫۠֡;

.field public ᩹:Ll/ᩳ۠֡;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 260
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 69
    iput-boolean v0, p0, Ll/ۢ۠֡;->۬:Z

    .line 83
    iput v0, p0, Ll/ۢ۠֡;->ۗ:I

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Ll/ۢ۠֡;->᩹:Ll/ᩳ۠֡;

    if-eqz p1, :cond_0

    .line 266
    iput-object p1, p0, Ll/ۢ۠֡;->᩶:Ljava/io/InputStream;

    .line 267
    new-instance v0, Ll/֫۠֡;

    invoke-direct {v0, p1}, Ll/֫۠֡;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ll/ۢ۠֡;->᩸:Ll/֫۠֡;

    return-void

    .line 263
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Null input stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫()Z
    .locals 4

    .line 214
    iget-boolean v0, p0, Ll/ۢ۠֡;->۬:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 219
    :cond_0
    iget-object v0, p0, Ll/ۢ۠֡;->᩹:Ll/ᩳ۠֡;

    if-eqz v0, :cond_1

    .line 220
    invoke-virtual {v0}, Ll/ᩳ۠֡;->֫()I

    move-result v0

    .line 221
    iget v1, p0, Ll/ۢ۠֡;->ۗ:I

    shl-int/lit8 v2, v1, 0x1

    ushr-int/lit8 v1, v1, 0x1f

    or-int/2addr v1, v2

    xor-int/2addr v0, v1

    iput v0, p0, Ll/ۢ۠֡;->ۗ:I

    .line 225
    :cond_1
    iget-object v0, p0, Ll/ۢ۠֡;->᩸:Ll/֫۠֡;

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Ll/֫۠֡;->֫(I)I

    move-result v0

    .line 226
    iget-object v2, p0, Ll/ۢ۠֡;->᩸:Ll/֫۠֡;

    invoke-virtual {v2, v1}, Ll/֫۠֡;->֫(I)I

    move-result v1

    const v2, 0x314159

    const/4 v3, 0x1

    if-ne v0, v2, :cond_2

    const v2, 0x265359

    if-ne v1, v2, :cond_2

    .line 231
    :try_start_0
    new-instance v0, Ll/ᩳ۠֡;

    iget-object v1, p0, Ll/ۢ۠֡;->᩸:Ll/֫۠֡;

    iget v2, p0, Ll/ۢ۠֡;->ۙ:I

    invoke-direct {v0, v1, v2}, Ll/ᩳ۠֡;-><init>(Ll/֫۠֡;I)V

    iput-object v0, p0, Ll/ۢ۠֡;->᩹:Ll/ᩳ۠֡;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :catch_0
    move-exception v0

    .line 234
    iput-boolean v3, p0, Ll/ۢ۠֡;->۬:Z

    .line 235
    throw v0

    :cond_2
    const v2, 0x177245

    if-ne v0, v2, :cond_4

    const v0, 0x385090

    if-ne v1, v0, :cond_4

    .line 240
    iput-boolean v3, p0, Ll/ۢ۠֡;->۬:Z

    .line 241
    iget-object v0, p0, Ll/ۢ۠֡;->᩸:Ll/֫۠֡;

    const/16 v1, 0x10

    .line 159
    invoke-virtual {v0, v1}, Ll/֫۠֡;->֫(I)I

    move-result v2

    shl-int/2addr v2, v1

    invoke-virtual {v0, v1}, Ll/֫۠֡;->֫(I)I

    move-result v0

    or-int/2addr v0, v2

    .line 242
    iget v1, p0, Ll/ۢ۠֡;->ۗ:I

    if-ne v0, v1, :cond_3

    :goto_0
    const/4 v0, 0x0

    return v0

    .line 243
    :cond_3
    new-instance v0, Ll/᩻۠֡;

    const-string v1, "BZip2 stream CRC error"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 243
    throw v0

    .line 249
    :cond_4
    iput-boolean v3, p0, Ll/ۢ۠֡;->۬:Z

    .line 250
    new-instance v0, Ll/᩻۠֡;

    const-string v1, "BZip2 stream format error"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 250
    throw v0
.end method

.method private ܽ()V
    .locals 5

    .line 167
    iget-object v0, p0, Ll/ۢ۠֡;->᩸:Ll/֫۠֡;

    if-eqz v0, :cond_2

    .line 172
    iget-boolean v1, p0, Ll/ۢ۠֡;->۬:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/16 v1, 0x10

    const/4 v2, 0x1

    .line 178
    :try_start_0
    invoke-virtual {v0, v1}, Ll/֫۠֡;->֫(I)I

    move-result v0

    .line 179
    iget-object v1, p0, Ll/ۢ۠֡;->᩸:Ll/֫۠֡;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Ll/֫۠֡;->֫(I)I

    move-result v1

    .line 180
    iget-object v4, p0, Ll/ۢ۠֡;->᩸:Ll/֫۠֡;

    invoke-virtual {v4, v3}, Ll/֫۠֡;->֫(I)I

    move-result v3

    add-int/lit8 v3, v3, -0x30

    const/16 v4, 0x425a

    if-ne v0, v4, :cond_1

    const/16 v0, 0x68

    if-ne v1, v0, :cond_1

    if-lt v3, v2, :cond_1

    const/16 v0, 0x9

    if-gt v3, v0, :cond_1

    const v0, 0x186a0

    mul-int v3, v3, v0

    .line 190
    iput v3, p0, Ll/ۢ۠֡;->ۙ:I

    return-void

    .line 187
    :cond_1
    new-instance v0, Ll/᩻۠֡;

    const-string v1, "Invalid BZip2 header"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 187
    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 193
    iput-boolean v2, p0, Ll/ۢ۠֡;->۬:Z

    .line 194
    throw v0

    .line 168
    :cond_2
    new-instance v0, Ll/᩻۠֡;

    const-string v1, "Stream closed"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 168
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 145
    iget-object v0, p0, Ll/ۢ۠֡;->᩸:Ll/֫۠֡;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 146
    iput-boolean v0, p0, Ll/ۢ۠֡;->۬:Z

    const/4 v0, 0x0

    .line 147
    iput-object v0, p0, Ll/ۢ۠֡;->᩹:Ll/ᩳ۠֡;

    .line 148
    iput-object v0, p0, Ll/ۢ۠֡;->᩸:Ll/֫۠֡;

    .line 151
    :try_start_0
    iget-object v1, p0, Ll/ۢ۠֡;->᩶:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    iput-object v0, p0, Ll/ۢ۠֡;->᩶:Ljava/io/InputStream;

    return-void

    :catchall_0
    move-exception v1

    iput-object v0, p0, Ll/ۢ۠֡;->᩶:Ljava/io/InputStream;

    throw v1

    :cond_0
    return-void
.end method

.method public read()I
    .locals 2

    .line 98
    iget-object v0, p0, Ll/ۢ۠֡;->᩹:Ll/ᩳ۠֡;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    .line 99
    invoke-direct {p0}, Ll/ۢ۠֡;->ܽ()V

    const/4 v0, -0x1

    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {v0}, Ll/ᩳ۠֡;->ۧ()I

    move-result v0

    :goto_0
    if-ne v0, v1, :cond_1

    .line 105
    invoke-direct {p0}, Ll/ۢ۠֡;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 106
    iget-object v0, p0, Ll/ۢ۠֡;->᩹:Ll/ᩳ۠֡;

    invoke-virtual {v0}, Ll/ᩳ۠֡;->ۧ()I

    move-result v0

    :cond_1
    return v0
.end method

.method public read([BII)I
    .locals 6

    .line 122
    iget-object v0, p0, Ll/ۢ۠֡;->᩹:Ll/ᩳ۠֡;

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-nez v0, :cond_0

    .line 123
    invoke-direct {p0}, Ll/ۢ۠֡;->ܽ()V

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    move v4, p2

    :goto_0
    if-ge v3, p3, :cond_2

    .line 441
    invoke-virtual {v0}, Ll/ᩳ۠֡;->ۧ()I

    move-result v5

    if-ne v5, v2, :cond_1

    if-nez v3, :cond_2

    :goto_1
    const/4 v3, -0x1

    goto :goto_2

    :cond_1
    int-to-byte v5, v5

    .line 445
    aput-byte v5, p1, v4

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    if-ne v3, v2, :cond_6

    .line 129
    invoke-direct {p0}, Ll/ۢ۠֡;->֫()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 130
    iget-object v0, p0, Ll/ۢ۠֡;->᩹:Ll/ᩳ۠֡;

    :goto_3
    if-ge v1, p3, :cond_5

    .line 441
    invoke-virtual {v0}, Ll/ᩳ۠֡;->ۧ()I

    move-result v3

    if-ne v3, v2, :cond_4

    if-nez v1, :cond_3

    return v2

    :cond_3
    return v1

    :cond_4
    int-to-byte v3, v3

    .line 445
    aput-byte v3, p1, p2

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    .line 130
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1

    :cond_6
    return v3
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
