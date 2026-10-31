.class public final Ll/ᩴ᩺ܿ;
.super Ljava/io/OutputStream;
.source "C4R6"


# instance fields
.field public final ᩸:Ljava/io/BufferedOutputStream;

.field public final ᩹:Ljava/io/BufferedOutputStream;


# direct methods
.method public constructor <init>(Ljava/io/BufferedOutputStream;Ljava/io/BufferedOutputStream;)V
    .locals 0

    .line 516
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 517
    iput-object p1, p0, Ll/ᩴ᩺ܿ;->᩸:Ljava/io/BufferedOutputStream;

    .line 518
    iput-object p2, p0, Ll/ᩴ᩺ܿ;->᩹:Ljava/io/BufferedOutputStream;

    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 1

    .line 535
    iget-object v0, p0, Ll/ᩴ᩺ܿ;->᩸:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 536
    iget-object v0, p0, Ll/ᩴ᩺ܿ;->᩹:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 1

    .line 523
    iget-object v0, p0, Ll/ᩴ᩺ܿ;->᩸:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 524
    iget-object v0, p0, Ll/ᩴ᩺ܿ;->᩹:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 529
    iget-object v0, p0, Ll/ᩴ᩺ܿ;->᩸:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 530
    iget-object v0, p0, Ll/ᩴ᩺ܿ;->᩹:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method
