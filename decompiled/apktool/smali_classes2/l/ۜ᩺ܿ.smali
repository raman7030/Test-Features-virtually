.class public abstract Ll/ۜ᩺ܿ;
.super Ljava/io/OutputStream;
.source "964V"


# instance fields
.field public final ᩶:Ljava/lang/StringBuilder;

.field public final ᩸:Ll/ܿۖ᩷;

.field public ᩹:I


# direct methods
.method public constructor <init>(ILl/ܿۖ᩷;)V
    .locals 2

    .line 308
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 309
    new-instance v0, Ljava/lang/StringBuilder;

    const/high16 v1, 0x80000

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ll/ۜ᩺ܿ;->᩶:Ljava/lang/StringBuilder;

    .line 310
    iput-object p2, p0, Ll/ۜ᩺ܿ;->᩸:Ll/ܿۖ᩷;

    return-void
.end method


# virtual methods
.method public finish()Ljava/lang/String;
    .locals 1

    .line 335
    iget-object v0, p0, Ll/ۜ᩺ܿ;->᩶:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final write(I)V
    .locals 1

    .line 339
    iget-object v0, p0, Ll/ۜ᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    and-int/lit16 p1, p1, 0xff

    .line 316
    invoke-virtual {p0, p1}, Ll/ۜ᩺ܿ;->֫(I)V

    .line 317
    iget p1, p0, Ll/ۜ᩺ܿ;->᩹:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۜ᩺ܿ;->᩹:I

    return-void

    .line 340
    :cond_0
    new-instance p1, Ll/ܽ᩺ܿ;

    .line 501
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 340
    throw p1
.end method

.method public final write([BII)V
    .locals 5

    int-to-long v0, p2

    int-to-long v2, p3

    add-long/2addr v0, v2

    long-to-int p3, v0

    int-to-long v2, p3

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    :goto_0
    if-ge p2, p3, :cond_2

    .line 324
    iget v0, p0, Ll/ۜ᩺ܿ;->᩹:I

    and-int/lit16 v0, v0, 0xfff

    if-nez v0, :cond_1

    .line 339
    iget-object v0, p0, Ll/ۜ᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 340
    :cond_0
    new-instance p1, Ll/ܽ᩺ܿ;

    .line 501
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 340
    throw p1

    .line 327
    :cond_1
    :goto_1
    aget-byte v0, p1, p2

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Ll/ۜ᩺ܿ;->֫(I)V

    .line 328
    iget v0, p0, Ll/ۜ᩺ܿ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۜ᩺ܿ;->᩹:I

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void

    .line 0
    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public abstract ֫(I)V
.end method
