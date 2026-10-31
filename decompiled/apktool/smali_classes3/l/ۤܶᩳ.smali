.class public final Ll/ۤܶᩳ;
.super Ljava/io/InputStream;
.source "B6QO"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:[B

.field public ۙ:I

.field public ᩶:Ll/ۚ۬ᩳ;

.field public final ᩸:I

.field public ᩹:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;[BILl/ۚ۬ᩳ;)V
    .locals 0

    .line 175
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 176
    iput-object p1, p0, Ll/ۤܶᩳ;->᩹:Ljava/io/InputStream;

    .line 177
    iput-object p2, p0, Ll/ۤܶᩳ;->ۗ:[B

    .line 178
    iput p3, p0, Ll/ۤܶᩳ;->᩸:I

    .line 179
    iput-object p4, p0, Ll/ۤܶᩳ;->᩶:Ll/ۚ۬ᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    move-object v0, p0

    .line 219
    monitor-enter v0

    .line 220
    :try_start_0
    iget-object v1, p0, Ll/ۤܶᩳ;->᩹:Ljava/io/InputStream;

    const/4 v2, 0x0

    .line 221
    iput-object v2, p0, Ll/ۤܶᩳ;->᩹:Ljava/io/InputStream;

    .line 209
    iput-object v2, p0, Ll/ۤܶᩳ;->ۗ:[B

    .line 210
    iget-object v3, p0, Ll/ۤܶᩳ;->᩶:Ll/ۚ۬ᩳ;

    if-eqz v3, :cond_0

    .line 211
    invoke-virtual {v3}, Ll/ۚ۬ᩳ;->close()V

    .line 212
    iput-object v2, p0, Ll/ۤܶᩳ;->᩶:Ll/ۚ۬ᩳ;

    .line 223
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 224
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 223
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 205
    invoke-virtual {p0, v1, v2, v0}, Ll/ۤܶᩳ;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 4

    .line 184
    array-length v0, p1

    invoke-static {p2, p3, v0}, Ll/ۧ۫ᩴ;->checkFromIndexSize(III)I

    move-object v0, p0

    .line 186
    monitor-enter v0

    .line 187
    :try_start_0
    iget-object v1, p0, Ll/ۤܶᩳ;->᩹:Ljava/io/InputStream;

    if-eqz v1, :cond_4

    if-nez p3, :cond_0

    const/4 p1, 0x0

    .line 188
    monitor-exit v0

    return p1

    .line 189
    :cond_0
    iget v1, p0, Ll/ۤܶᩳ;->ۙ:I

    iget v2, p0, Ll/ۤܶᩳ;->᩸:I

    const/4 v3, 0x0

    if-ge v1, v2, :cond_2

    sub-int/2addr v2, v1

    .line 190
    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 191
    iget-object v1, p0, Ll/ۤܶᩳ;->ۗ:[B

    iget v2, p0, Ll/ۤܶᩳ;->ۙ:I

    invoke-static {v1, v2, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 192
    iget p1, p0, Ll/ۤܶᩳ;->ۙ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ۤܶᩳ;->ۙ:I

    .line 193
    iget p2, p0, Ll/ۤܶᩳ;->᩸:I

    if-ne p1, p2, :cond_1

    .line 209
    iput-object v3, p0, Ll/ۤܶᩳ;->ۗ:[B

    .line 210
    iget-object p1, p0, Ll/ۤܶᩳ;->᩶:Ll/ۚ۬ᩳ;

    if-eqz p1, :cond_1

    .line 211
    invoke-virtual {p1}, Ll/ۚ۬ᩳ;->close()V

    .line 212
    iput-object v3, p0, Ll/ۤܶᩳ;->᩶:Ll/ۚ۬ᩳ;

    .line 194
    :cond_1
    monitor-exit v0

    return p3

    .line 209
    :cond_2
    iput-object v3, p0, Ll/ۤܶᩳ;->ۗ:[B

    .line 210
    iget-object v1, p0, Ll/ۤܶᩳ;->᩶:Ll/ۚ۬ᩳ;

    if-eqz v1, :cond_3

    .line 211
    invoke-virtual {v1}, Ll/ۚ۬ᩳ;->close()V

    .line 212
    iput-object v3, p0, Ll/ۤܶᩳ;->᩶:Ll/ۚ۬ᩳ;

    .line 197
    :cond_3
    iget-object v1, p0, Ll/ۤܶᩳ;->᩹:Ljava/io/InputStream;

    .line 198
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    invoke-virtual {v1, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    return p1

    .line 187
    :cond_4
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Text input is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 198
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
