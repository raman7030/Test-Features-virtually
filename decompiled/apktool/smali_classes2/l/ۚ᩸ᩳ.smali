.class public final Ll/ۚ᩸ᩳ;
.super Ljava/io/FilterOutputStream;
.source "9B2H"


# instance fields
.field public ᩸:Ll/֡ܺᩴ;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    .line 229
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 226
    new-instance p1, Ll/֡ܺᩴ;

    const v0, 0x8000

    invoke-direct {p1, v0}, Ll/֡ܺᩴ;-><init>(I)V

    iput-object p1, p0, Ll/ۚ᩸ᩳ;->᩸:Ll/֡ܺᩴ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 251
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final write(I)V
    .locals 3

    .line 234
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 235
    iget-object v0, p0, Ll/ۚ᩸ᩳ;->᩸:Ll/֡ܺᩴ;

    iget v1, v0, Ll/֡ܺᩴ;->᩹:I

    const v2, 0x8000

    if-ge v1, v2, :cond_0

    .line 236
    invoke-virtual {v0, p1}, Ll/֡ܺᩴ;->write(I)V

    :cond_0
    return-void
.end method

.method public final write([BII)V
    .locals 3

    .line 242
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 243
    iget-object v0, p0, Ll/ۚ᩸ᩳ;->᩸:Ll/֡ܺᩴ;

    iget v1, v0, Ll/֡ܺᩴ;->᩹:I

    const v2, 0x8000

    sub-int/2addr v2, v1

    invoke-static {v2, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    if-lez p3, :cond_0

    .line 245
    invoke-virtual {v0, p1, p2, p3}, Ll/֡ܺᩴ;->write([BII)V

    :cond_0
    return-void
.end method
