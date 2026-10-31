.class public final Ll/ۧۨܳ;
.super Ljava/io/InputStream;
.source "672L"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩶:Ljava/io/BufferedInputStream;

.field public ᩸:Ll/ۢ۠֡;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 21
    instance-of v0, p1, Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_0

    .line 22
    check-cast p1, Ljava/io/BufferedInputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/BufferedInputStream;

    const/high16 v1, 0x10000

    invoke-direct {v0, p1, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Ll/ۧۨܳ;->᩶:Ljava/io/BufferedInputStream;

    .line 23
    new-instance v0, Ll/ۢ۠֡;

    invoke-direct {v0, p1}, Ll/ۢ۠֡;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ll/ۧۨܳ;->᩸:Ll/ۢ۠֡;

    return-void
.end method

.method private ֫()Z
    .locals 7

    .line 59
    iget-object v0, p0, Ll/ۧۨܳ;->᩶:Ljava/io/BufferedInputStream;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/io/BufferedInputStream;->mark(I)V

    new-array v2, v1, [B

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    rsub-int/lit8 v5, v4, 0x4

    .line 63
    invoke-virtual {v0, v2, v4, v5}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v4, v5

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v5, 0x1

    if-nez v4, :cond_2

    .line 70
    iput-boolean v5, p0, Ll/ۧۨܳ;->᩹:Z

    return v3

    :cond_2
    if-ne v4, v1, :cond_3

    .line 73
    aget-byte v1, v2, v3

    const/16 v3, 0x42

    if-ne v1, v3, :cond_3

    aget-byte v1, v2, v5

    const/16 v3, 0x5a

    if-ne v1, v3, :cond_3

    const/4 v1, 0x2

    aget-byte v1, v2, v1

    const/16 v3, 0x68

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    aget-byte v1, v2, v1

    const/16 v2, 0x31

    if-lt v1, v2, :cond_3

    const/16 v2, 0x39

    if-gt v1, v2, :cond_3

    .line 77
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->reset()V

    .line 78
    new-instance v1, Ll/ۢ۠֡;

    invoke-direct {v1, v0}, Ll/ۢ۠֡;-><init>(Ljava/io/InputStream;)V

    iput-object v1, p0, Ll/ۧۨܳ;->᩸:Ll/ۢ۠֡;

    return v5

    .line 75
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid trailing BZIP2 member"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Ll/ۧۨܳ;->᩹:Z

    .line 85
    iget-object v0, p0, Ll/ۧۨܳ;->᩶:Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V

    return-void
.end method

.method public final read()I
    .locals 2

    .line 28
    :cond_0
    iget-boolean v0, p0, Ll/ۧۨܳ;->᩹:Z

    const/4 v1, -0x1

    if-nez v0, :cond_2

    .line 29
    iget-object v0, p0, Ll/ۧۨܳ;->᩸:Ll/ۢ۠֡;

    invoke-virtual {v0}, Ll/ۢ۠֡;->read()I

    move-result v0

    if-eq v0, v1, :cond_1

    return v0

    .line 33
    :cond_1
    invoke-direct {p0}, Ll/ۧۨܳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_2
    return v1
.end method

.method public final read([BII)I
    .locals 2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 45
    :cond_0
    iget-boolean v0, p0, Ll/ۧۨܳ;->᩹:Z

    const/4 v1, -0x1

    if-nez v0, :cond_2

    .line 46
    iget-object v0, p0, Ll/ۧۨܳ;->᩸:Ll/ۢ۠֡;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۢ۠֡;->read([BII)I

    move-result v0

    if-eq v0, v1, :cond_1

    return v0

    .line 50
    :cond_1
    invoke-direct {p0}, Ll/ۧۨܳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_2
    return v1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
