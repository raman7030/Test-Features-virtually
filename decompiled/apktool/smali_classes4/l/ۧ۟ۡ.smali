.class public final Ll/ۧ۟ۡ;
.super Ljava/util/zip/InflaterInputStream;
.source "H4GQ"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩶:Z

.field public ᩸:Z

.field public final ᩹:Ll/ۗ᩺ۡ;


# direct methods
.method public constructor <init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;Z)V
    .locals 2

    .line 26
    new-instance v0, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    invoke-direct {p0, p2, v0}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V

    .line 27
    iput-object p1, p0, Ll/ۧ۟ۡ;->᩹:Ll/ۗ᩺ۡ;

    .line 28
    iput-boolean p3, p0, Ll/ۧ۟ۡ;->᩶:Z

    return-void
.end method

.method private ֫()V
    .locals 4

    .line 51
    iget-boolean v0, p0, Ll/ۧ۟ۡ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    .line 54
    :cond_0
    iget-object v0, p0, Ljava/util/zip/InflaterInputStream;->inf:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    move-result v0

    const-string v1, ")"

    if-eqz v0, :cond_2

    .line 57
    iget-object v0, p0, Ljava/util/zip/InflaterInputStream;->inf:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ljava/util/zip/InflaterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    .line 60
    iput-boolean v0, p0, Ll/ۧ۟ۡ;->᩸:Z

    return-void

    .line 58
    :cond_1
    new-instance v0, Ljava/util/zip/ZipException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Trailing data after DEFLATE stream ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۧ۟ۡ;->᩹:Ll/ۗ᩺ۡ;

    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_2
    new-instance v0, Ljava/util/zip/ZipException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected end of DEFLATE stream ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۧ۟ۡ;->᩹:Ll/ۗ᩺ۡ;

    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final read([BII)I
    .locals 3

    .line 34
    iget-object v0, p0, Ll/ۧ۟ۡ;->᩹:Ll/ۗ᩺ۡ;

    iget-boolean v1, p0, Ll/ۧ۟ۡ;->᩶:Z

    const/4 v2, -0x1

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ljava/util/zip/InflaterInputStream;->read([BII)I

    move-result p1

    if-ne p1, v2, :cond_0

    if-eqz v1, :cond_0

    .line 36
    invoke-direct {p0}, Ll/ۧ۟ۡ;->֫()V
    :try_end_0
    .catch Ljava/util/zip/ZipException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return p1

    :catch_0
    if-nez v1, :cond_1

    return v2

    .line 43
    :cond_1
    new-instance p1, Ljava/util/zip/ZipException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Unexpected end of DEFLATE stream ("

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ")"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_1
    move-exception p1

    .line 40
    invoke-static {p1, v0}, Ll/ۖܰۡ;->֫(Ljava/io/IOException;Ll/ۗ᩺ۡ;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
