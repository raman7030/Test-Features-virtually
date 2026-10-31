.class public final Ll/ܳ᩶ᩳ;
.super Ljava/io/InputStream;
.source "56SO"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/᩻᩶ᩳ;


# direct methods
.method public constructor <init>(Ll/᩻᩶ᩳ;I)V
    .locals 0

    .line 203
    iput-object p1, p0, Ll/ܳ᩶ᩳ;->᩹:Ll/᩻᩶ᩳ;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    iput p2, p0, Ll/ܳ᩶ᩳ;->᩸:I

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 2

    .line 205
    iget v0, p0, Ll/ܳ᩶ᩳ;->᩸:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 206
    :cond_0
    iget-object v0, p0, Ll/ܳ᩶ᩳ;->᩹:Ll/᩻᩶ᩳ;

    invoke-virtual {v0}, Ll/᩻᩶ᩳ;->readByte()I

    move-result v0

    .line 207
    iget v1, p0, Ll/ܳ᩶ᩳ;->᩸:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ܳ᩶ᩳ;->᩸:I

    return v0
.end method

.method public final read([BII)I
    .locals 2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 212
    :cond_0
    iget v0, p0, Ll/ܳ᩶ᩳ;->᩸:I

    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    .line 213
    :cond_1
    iget-object v1, p0, Ll/ܳ᩶ᩳ;->᩹:Ll/᩻᩶ᩳ;

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-static {v1, p1, p2, p3}, Ll/᩻᩶ᩳ;->֫(Ll/᩻᩶ᩳ;[BII)I

    move-result p1

    if-ltz p1, :cond_2

    .line 215
    iget p2, p0, Ll/ܳ᩶ᩳ;->᩸:I

    sub-int/2addr p2, p1

    iput p2, p0, Ll/ܳ᩶ᩳ;->᩸:I

    return p1

    .line 214
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Truncated legacy UTF field"

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
