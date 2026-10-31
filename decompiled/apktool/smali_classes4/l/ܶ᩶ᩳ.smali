.class public final Ll/ܶ᩶ᩳ;
.super Ljava/io/InputStream;
.source "R6SP"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:I

.field public final ᩹:Ljava/io/PushbackInputStream;


# direct methods
.method public constructor <init>(Ljava/io/PushbackInputStream;I)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    iput-object p1, p0, Ll/ܶ᩶ᩳ;->᩹:Ljava/io/PushbackInputStream;

    iput p2, p0, Ll/ܶ᩶ᩳ;->᩸:I

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 103
    iget v0, p0, Ll/ܶ᩶ᩳ;->᩸:I

    iget-object v1, p0, Ll/ܶ᩶ᩳ;->᩹:Ljava/io/PushbackInputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final read()I
    .locals 2

    .line 89
    iget v0, p0, Ll/ܶ᩶ᩳ;->᩸:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 90
    :cond_0
    iget-object v0, p0, Ll/ܶ᩶ᩳ;->᩹:Ljava/io/PushbackInputStream;

    invoke-static {v0}, Ll/᩸᩶ᩳ;->֫(Ljava/io/PushbackInputStream;)I

    move-result v0

    .line 91
    iget v1, p0, Ll/ܶ᩶ᩳ;->᩸:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ܶ᩶ᩳ;->᩸:I

    return v0
.end method

.method public final read([BII)I
    .locals 2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 96
    :cond_0
    iget v0, p0, Ll/ܶ᩶ᩳ;->᩸:I

    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    .line 97
    :cond_1
    iget-object v1, p0, Ll/ܶ᩶ᩳ;->᩹:Ljava/io/PushbackInputStream;

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-ltz p1, :cond_3

    if-lez p1, :cond_2

    .line 100
    iget p2, p0, Ll/ܶ᩶ᩳ;->᩸:I

    sub-int/2addr p2, p1

    iput p2, p0, Ll/ܶ᩶ᩳ;->᩸:I

    return p1

    .line 99
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Legacy compression block read made no progress"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 98
    :cond_3
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Truncated legacy compression block"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
