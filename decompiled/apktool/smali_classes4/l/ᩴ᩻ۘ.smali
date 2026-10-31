.class public final Ll/ᩴ᩻ۘ;
.super Ljava/io/PipedOutputStream;
.source "2BMB"


# instance fields
.field public ᩸:Ll/ۖ᩻ۘ;


# direct methods
.method public constructor <init>(Ljava/io/PipedInputStream;Z)V
    .locals 1

    .line 631
    invoke-direct {p0, p1}, Ljava/io/PipedOutputStream;-><init>(Ljava/io/PipedInputStream;)V

    const/4 v0, 0x0

    .line 628
    iput-object v0, p0, Ll/ᩴ᩻ۘ;->᩸:Ll/ۖ᩻ۘ;

    if-eqz p2, :cond_0

    .line 633
    check-cast p1, Ll/ۖ᩻ۘ;

    iput-object p1, p0, Ll/ᩴ᩻ۘ;->᩸:Ll/ۖ᩻ۘ;

    :cond_0
    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 2

    .line 639
    iget-object v0, p0, Ll/ᩴ᩻ۘ;->᩸:Ll/ۖ᩻ۘ;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 640
    invoke-virtual {v0, v1}, Ll/ۖ᩻ۘ;->֫(I)V

    .line 642
    :cond_0
    invoke-super {p0, p1}, Ljava/io/PipedOutputStream;->write(I)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 647
    iget-object v0, p0, Ll/ᩴ᩻ۘ;->᩸:Ll/ۖ᩻ۘ;

    if-eqz v0, :cond_0

    .line 648
    invoke-virtual {v0, p3}, Ll/ۖ᩻ۘ;->֫(I)V

    .line 650
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ljava/io/PipedOutputStream;->write([BII)V

    return-void
.end method
