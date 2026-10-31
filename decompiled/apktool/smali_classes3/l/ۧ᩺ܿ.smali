.class public final Ll/ۧ᩺ܿ;
.super Ljava/io/OutputStream;
.source "964V"


# instance fields
.field public final ᩸:Ll/ܿۖ᩷;

.field public final ᩹:Landroid/util/Base64OutputStream;


# direct methods
.method public constructor <init>(Landroid/util/Base64OutputStream;Ll/ܿۖ᩷;)V
    .locals 0

    .line 438
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 439
    iput-object p1, p0, Ll/ۧ᩺ܿ;->᩹:Landroid/util/Base64OutputStream;

    .line 440
    iput-object p2, p0, Ll/ۧ᩺ܿ;->᩸:Ll/ܿۖ᩷;

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 1

    .line 456
    iget-object v0, p0, Ll/ۧ᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    .line 446
    iget-object v0, p0, Ll/ۧ᩺ܿ;->᩹:Landroid/util/Base64OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void

    .line 457
    :cond_0
    new-instance p1, Ll/ܽ᩺ܿ;

    .line 501
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 457
    throw p1
.end method

.method public final write([BII)V
    .locals 1

    .line 456
    iget-object v0, p0, Ll/ۧ᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    .line 452
    iget-object v0, p0, Ll/ۧ᩺ܿ;->᩹:Landroid/util/Base64OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void

    .line 457
    :cond_0
    new-instance p1, Ll/ܽ᩺ܿ;

    .line 501
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 457
    throw p1
.end method
