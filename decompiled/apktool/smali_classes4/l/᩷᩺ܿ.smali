.class public abstract Ll/᩷᩺ܿ;
.super Ljava/io/OutputStream;
.source "964V"


# instance fields
.field public final ᩸:Ll/ܿۖ᩷;

.field public final ᩹:[B


# direct methods
.method public constructor <init>(Ll/ܿۖ᩷;)V
    .locals 1

    .line 467
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 465
    iput-object v0, p0, Ll/᩷᩺ܿ;->᩹:[B

    .line 468
    iput-object p1, p0, Ll/᩷᩺ܿ;->᩸:Ll/ܿۖ᩷;

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 2

    int-to-byte p1, p1

    .line 473
    iget-object v0, p0, Ll/᩷᩺ܿ;->᩹:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 474
    invoke-virtual {p0, v0, v1, p1}, Ll/᩷᩺ܿ;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 479
    iget-object v0, p0, Ll/᩷᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    .line 482
    invoke-virtual {p0, p1, p2, p3}, Ll/᩷᩺ܿ;->֫([BII)V

    return-void

    .line 480
    :cond_0
    new-instance p1, Ll/ܽ᩺ܿ;

    .line 501
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 480
    throw p1
.end method

.method public abstract ֫([BII)V
.end method
