.class public final Ll/᩶۠֫;
.super Ljava/io/InputStream;
.source "K8MX"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ۗ:[B

.field public ۙ:Z

.field public final ᩶:Ll/ۗ۠֫;

.field public ᩸:Z

.field public final ᩹:Ll/᩸۠֫;


# direct methods
.method public constructor <init>(Ll/᩸۠֫;Ll/ۗ۠֫;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Ll/᩶۠֫;->ۙ:Z

    .line 36
    iput-boolean v0, p0, Ll/᩶۠֫;->᩸:Z

    .line 44
    iput-object p1, p0, Ll/᩶۠֫;->᩹:Ll/᩸۠֫;

    .line 45
    iput-object p2, p0, Ll/᩶۠֫;->᩶:Ll/ۗ۠֫;

    const/4 p1, 0x1

    new-array p1, p1, [B

    .line 46
    iput-object p1, p0, Ll/᩶۠֫;->ۗ:[B

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 93
    iget-boolean v0, p0, Ll/᩶۠֫;->᩸:Z

    if-nez v0, :cond_0

    .line 94
    iget-object v0, p0, Ll/᩶۠֫;->᩹:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->close()V

    const/4 v0, 0x1

    .line 95
    iput-boolean v0, p0, Ll/᩶۠֫;->᩸:Z

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 4

    .line 75
    iget-object v0, p0, Ll/᩶۠֫;->ۗ:[B

    array-length v1, v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Ll/᩶۠֫;->read([BII)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    return v3

    .line 70
    :cond_0
    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 75
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/᩶۠֫;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 3

    .line 80
    iget-boolean v0, p0, Ll/᩶۠֫;->᩸:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 100
    iget-boolean v0, p0, Ll/᩶۠֫;->ۙ:Z

    iget-object v2, p0, Ll/᩶۠֫;->᩹:Ll/᩸۠֫;

    if-nez v0, :cond_0

    .line 101
    iget-object v0, p0, Ll/᩶۠֫;->᩶:Ll/ۗ۠֫;

    invoke-interface {v2, v0}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    .line 102
    iput-boolean v1, p0, Ll/᩶۠֫;->ۙ:Z

    .line 82
    :cond_0
    invoke-interface {v2, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    return p2

    :cond_1
    return p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()V
    .locals 2

    .line 100
    iget-boolean v0, p0, Ll/᩶۠֫;->ۙ:Z

    if-nez v0, :cond_0

    .line 101
    iget-object v0, p0, Ll/᩶۠֫;->᩹:Ll/᩸۠֫;

    iget-object v1, p0, Ll/᩶۠֫;->᩶:Ll/ۗ۠֫;

    invoke-interface {v0, v1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    const/4 v0, 0x1

    .line 102
    iput-boolean v0, p0, Ll/᩶۠֫;->ۙ:Z

    :cond_0
    return-void
.end method
