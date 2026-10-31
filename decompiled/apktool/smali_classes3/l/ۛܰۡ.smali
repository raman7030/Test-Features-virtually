.class public final Ll/ۛܰۡ;
.super Ljava/io/InputStream;
.source "K4GS"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩶:Ljava/io/InputStream;

.field public final ᩸:Ljava/util/zip/CRC32;

.field public final ᩹:Ll/ۗ᩺ۡ;


# direct methods
.method public constructor <init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 17
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, Ll/ۛܰۡ;->᩸:Ljava/util/zip/CRC32;

    .line 20
    iput-object p1, p0, Ll/ۛܰۡ;->᩹:Ll/ۗ᩺ۡ;

    .line 21
    iput-object p2, p0, Ll/ۛܰۡ;->᩶:Ljava/io/InputStream;

    return-void
.end method

.method public static ֫(Ll/ۗ᩺ۡ;I)Ljava/io/IOException;
    .locals 4

    .line 62
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ܰ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->֨()I

    move-result v0

    if-nez v0, :cond_0

    .line 65
    new-instance p1, Ll/ۘܰۡ;

    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ll/ۘܰۡ;-><init>(Ljava/lang/String;)V

    return-object p1

    .line 67
    :cond_0
    new-instance v0, Ljava/util/zip/ZipException;

    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ۜ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object p1, v2, v1

    const/4 p1, 0x2

    aput-object p0, v2, p1

    const-string p0, "Bad file CRC value: expected=0x%08x, got=0x%08x (%s)"

    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۛܰۡ;->᩶:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final read()I
    .locals 4

    .line 37
    iget-object v0, p0, Ll/ۛܰۡ;->᩶:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    .line 38
    iget-object v2, p0, Ll/ۛܰۡ;->᩸:Ljava/util/zip/CRC32;

    if-ne v0, v1, :cond_1

    .line 47
    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v2, v1

    .line 48
    iget-object v1, p0, Ll/ۛܰۡ;->᩹:Ll/ۗ᩺ۡ;

    invoke-virtual {v1}, Ll/ۗ᩺ۡ;->ۜ()I

    move-result v3

    if-ne v3, v2, :cond_0

    return v0

    .line 49
    :cond_0
    invoke-static {v1, v2}, Ll/ۛܰۡ;->֫(Ll/ۗ᩺ۡ;I)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 41
    :cond_1
    invoke-virtual {v2, v0}, Ljava/util/zip/CRC32;->update(I)V

    return v0
.end method

.method public final read([BII)I
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ۛܰۡ;->᩶:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p3

    .line 27
    iget-object v0, p0, Ll/ۛܰۡ;->᩸:Ljava/util/zip/CRC32;

    if-lez p3, :cond_0

    .line 28
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    return p3

    :cond_0
    const/4 p1, -0x1

    if-ne p3, p1, :cond_2

    .line 47
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide p1

    long-to-int p2, p1

    .line 48
    iget-object p1, p0, Ll/ۛܰۡ;->᩹:Ll/ۗ᩺ۡ;

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۜ()I

    move-result v0

    if-ne v0, p2, :cond_1

    goto :goto_0

    .line 49
    :cond_1
    invoke-static {p1, p2}, Ll/ۛܰۡ;->֫(Ll/ۗ᩺ۡ;I)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_2
    :goto_0
    return p3
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
