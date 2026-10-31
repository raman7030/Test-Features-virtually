.class public final Ll/᩵ۤܳ;
.super Ljava/io/FilterInputStream;
.source "S8BI"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩸:Z

.field public final ᩹:Ll/᩵ۛۡ;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ll/᩵ۛۡ;Z)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 18
    iput-object p2, p0, Ll/᩵ۤܳ;->᩹:Ll/᩵ۛۡ;

    .line 19
    iput-boolean p3, p0, Ll/᩵ۤܳ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 3

    .line 29
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0

    .line 30
    iget-boolean v1, p0, Ll/᩵ۤܳ;->᩸:Z

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 31
    iget-object v1, p0, Ll/᩵ۤܳ;->᩹:Ll/᩵ۛۡ;

    const/4 v2, 0x1

    .line 41
    invoke-virtual {v1, v2}, Ll/᩵ۛۡ;->֫(I)Z

    :cond_0
    return v0
.end method

.method public final read([BII)I
    .locals 0

    .line 47
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    .line 48
    iget-boolean p2, p0, Ll/᩵ۤܳ;->᩸:Z

    if-eqz p2, :cond_0

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    .line 49
    iget-object p2, p0, Ll/᩵ۤܳ;->᩹:Ll/᩵ۛۡ;

    invoke-virtual {p2, p1}, Ll/᩵ۛۡ;->֫(I)Z

    :cond_0
    return p1
.end method

.method public final skip(J)J
    .locals 3

    .line 38
    invoke-super {p0, p1, p2}, Ljava/io/FilterInputStream;->skip(J)J

    move-result-wide p1

    .line 39
    iget-boolean v0, p0, Ll/᩵ۤܳ;->᩸:Z

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    .line 40
    iget-object v0, p0, Ll/᩵ۤܳ;->᩹:Ll/᩵ۛۡ;

    invoke-virtual {v0, p1, p2}, Ll/᩵ۛۡ;->֫(J)V

    :cond_0
    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()Ll/᩵ۛۡ;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/᩵ۤܳ;->᩹:Ll/᩵ۛۡ;

    return-object v0
.end method
