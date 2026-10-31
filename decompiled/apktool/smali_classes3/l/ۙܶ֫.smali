.class public final Ll/ۙܶ֫;
.super Ljava/lang/Object;
.source "E74T"

# interfaces
.implements Ll/۠۠֫;


# instance fields
.field public final ֫:I

.field public final ۜ:J

.field public ۢ:J

.field public ۧ:Ll/ۢ᩸֫;

.field public ܳ:J

.field public final ܽ:Ll/᩸ܶ֫;

.field public ܿ:J

.field public ᩳ:Ll/ۗ۠֫;

.field public ᩷:Ljava/io/OutputStream;

.field public ᩻:Ljava/io/File;


# direct methods
.method public constructor <init>(Ll/᩸ܶ֫;)V
    .locals 2

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    iput-object p1, p0, Ll/ۙܶ֫;->ܽ:Ll/᩸ܶ֫;

    const-wide/32 v0, 0x500000

    .line 180
    iput-wide v0, p0, Ll/ۙܶ֫;->ۜ:J

    const/16 p1, 0x5000

    .line 181
    iput p1, p0, Ll/ۙܶ֫;->֫:I

    return-void
.end method

.method private ֫()V
    .locals 4

    .line 264
    iget-object v0, p0, Ll/ۙܶ֫;->᩷:Ljava/io/OutputStream;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 270
    :try_start_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 273
    iget-object v0, p0, Ll/ۙܶ֫;->᩷:Ljava/io/OutputStream;

    invoke-static {v0}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    .line 274
    iput-object v1, p0, Ll/ۙܶ֫;->᩷:Ljava/io/OutputStream;

    .line 275
    iget-object v0, p0, Ll/ۙܶ֫;->᩻:Ljava/io/File;

    .line 276
    iput-object v1, p0, Ll/ۙܶ֫;->᩻:Ljava/io/File;

    .line 278
    iget-object v1, p0, Ll/ۙܶ֫;->ܽ:Ll/᩸ܶ֫;

    iget-wide v2, p0, Ll/ۙܶ֫;->ۢ:J

    invoke-interface {v1, v0, v2, v3}, Ll/᩸ܶ֫;->֫(Ljava/io/File;J)V

    return-void

    :catchall_0
    move-exception v0

    .line 273
    iget-object v2, p0, Ll/ۙܶ֫;->᩷:Ljava/io/OutputStream;

    invoke-static {v2}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    .line 274
    iput-object v1, p0, Ll/ۙܶ֫;->᩷:Ljava/io/OutputStream;

    .line 275
    iget-object v2, p0, Ll/ۙܶ֫;->᩻:Ljava/io/File;

    .line 276
    iput-object v1, p0, Ll/ۙܶ֫;->᩻:Ljava/io/File;

    .line 280
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 282
    throw v0
.end method

.method private ۧ(Ll/ۗ۠֫;)V
    .locals 10

    .line 242
    iget-wide v0, p1, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    :goto_0
    move-wide v8, v2

    goto :goto_1

    .line 244
    :cond_0
    iget-wide v2, p0, Ll/ۙܶ֫;->ܿ:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Ll/ۙܶ֫;->ܳ:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    goto :goto_0

    .line 245
    :goto_1
    iget-object v5, p1, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    .line 247
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget-wide v0, p1, Ll/ۗ۠֫;->᩻:J

    iget-wide v2, p0, Ll/ۙܶ֫;->ܿ:J

    add-long v6, v0, v2

    .line 246
    iget-object v4, p0, Ll/ۙܶ֫;->ܽ:Ll/᩸ܶ֫;

    invoke-interface/range {v4 .. v9}, Ll/᩸ܶ֫;->֫(Ljava/lang/String;JJ)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Ll/ۙܶ֫;->᩻:Ljava/io/File;

    .line 248
    new-instance p1, Ljava/io/FileOutputStream;

    iget-object v0, p0, Ll/ۙܶ֫;->᩻:Ljava/io/File;

    invoke-direct {p1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 249
    iget v0, p0, Ll/ۙܶ֫;->֫:I

    if-lez v0, :cond_2

    .line 250
    iget-object v1, p0, Ll/ۙܶ֫;->ۧ:Ll/ۢ᩸֫;

    if-nez v1, :cond_1

    .line 251
    new-instance v1, Ll/ۢ᩸֫;

    .line 37
    invoke-direct {v1, p1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 251
    iput-object v1, p0, Ll/ۙܶ֫;->ۧ:Ll/ۢ᩸֫;

    goto :goto_2

    .line 254
    :cond_1
    invoke-virtual {v1, p1}, Ll/ۢ᩸֫;->֫(Ljava/io/OutputStream;)V

    .line 256
    :goto_2
    iget-object p1, p0, Ll/ۙܶ֫;->ۧ:Ll/ۢ᩸֫;

    iput-object p1, p0, Ll/ۙܶ֫;->᩷:Ljava/io/OutputStream;

    goto :goto_3

    .line 258
    :cond_2
    iput-object p1, p0, Ll/ۙܶ֫;->᩷:Ljava/io/OutputStream;

    :goto_3
    const-wide/16 v0, 0x0

    .line 260
    iput-wide v0, p0, Ll/ۙܶ֫;->ۢ:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 230
    iget-object v0, p0, Ll/ۙܶ֫;->ᩳ:Ll/ۗ۠֫;

    if-nez v0, :cond_0

    return-void

    .line 234
    :cond_0
    :try_start_0
    invoke-direct {p0}, Ll/ۙܶ֫;->֫()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 236
    new-instance v1, Ll/᩹ܶ֫;

    .line 88
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 236
    throw v1
.end method

.method public final write([BII)V
    .locals 8

    .line 205
    iget-object v0, p0, Ll/ۙܶ֫;->ᩳ:Ll/ۗ۠֫;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_2

    .line 212
    :try_start_0
    iget-wide v2, p0, Ll/ۙܶ֫;->ۢ:J

    iget-wide v4, p0, Ll/ۙܶ֫;->ܳ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    .line 213
    invoke-direct {p0}, Ll/ۙܶ֫;->֫()V

    .line 214
    invoke-direct {p0, v0}, Ll/ۙܶ֫;->ۧ(Ll/ۗ۠֫;)V

    :cond_1
    sub-int v2, p3, v1

    int-to-long v2, v2

    .line 216
    iget-wide v4, p0, Ll/ۙܶ֫;->ܳ:J

    iget-wide v6, p0, Ll/ۙܶ֫;->ۢ:J

    sub-long/2addr v4, v6

    .line 217
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    .line 218
    iget-object v2, p0, Ll/ۙܶ֫;->᩷:Ljava/io/OutputStream;

    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    add-int v4, p2, v1

    invoke-virtual {v2, p1, v4, v3}, Ljava/io/OutputStream;->write([BII)V

    add-int/2addr v1, v3

    .line 220
    iget-wide v4, p0, Ll/ۙܶ֫;->ۢ:J

    int-to-long v2, v3

    add-long/2addr v4, v2

    iput-wide v4, p0, Ll/ۙܶ֫;->ۢ:J

    .line 221
    iget-wide v4, p0, Ll/ۙܶ֫;->ܿ:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Ll/ۙܶ֫;->ܿ:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 224
    new-instance p2, Ll/᩹ܶ֫;

    .line 88
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 224
    throw p2

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(Ll/ۗ۠֫;)V
    .locals 6

    .line 186
    iget v0, p1, Ll/ۗ۠֫;->֫:I

    iget-object v1, p1, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    iget-wide v1, p1, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 p1, 0x0

    .line 189
    iput-object p1, p0, Ll/ۙܶ֫;->ᩳ:Ll/ۗ۠֫;

    return-void

    .line 192
    :cond_0
    iput-object p1, p0, Ll/ۙܶ֫;->ᩳ:Ll/ۗ۠֫;

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    .line 194
    iget-wide v0, p0, Ll/ۙܶ֫;->ۜ:J

    goto :goto_0

    :cond_1
    const-wide v0, 0x7fffffffffffffffL

    :goto_0
    iput-wide v0, p0, Ll/ۙܶ֫;->ܳ:J

    const-wide/16 v0, 0x0

    .line 195
    iput-wide v0, p0, Ll/ۙܶ֫;->ܿ:J

    .line 197
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۙܶ֫;->ۧ(Ll/ۗ۠֫;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 199
    new-instance v0, Ll/᩹ܶ֫;

    .line 88
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 199
    throw v0
.end method
