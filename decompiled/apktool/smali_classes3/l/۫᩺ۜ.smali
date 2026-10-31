.class public final Ll/۫᩺ۜ;
.super Ljava/io/OutputStream;
.source "S6MO"


# instance fields
.field public final synthetic ۙ:Ljava/io/FileOutputStream;

.field public final synthetic ᩶:Ll/ۤ᩺ۜ;

.field public final synthetic ᩸:Ll/ۨ᩺ۜ;

.field public final synthetic ᩹:Ll/ܿۖ᩷;


# direct methods
.method public constructor <init>(Ll/ۨ᩺ۜ;Ll/ۤ᩺ۜ;Ll/ܿۖ᩷;Ljava/io/FileOutputStream;)V
    .locals 0

    .line 63
    iput-object p1, p0, Ll/۫᩺ۜ;->᩸:Ll/ۨ᩺ۜ;

    iput-object p2, p0, Ll/۫᩺ۜ;->᩶:Ll/ۤ᩺ۜ;

    iput-object p3, p0, Ll/۫᩺ۜ;->᩹:Ll/ܿۖ᩷;

    iput-object p4, p0, Ll/۫᩺ۜ;->ۙ:Ljava/io/FileOutputStream;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 4

    const/4 v0, 0x1

    .line 66
    iget-object v1, p0, Ll/۫᩺ۜ;->᩹:Ll/ܿۖ᩷;

    iget-object v2, p0, Ll/۫᩺ۜ;->᩸:Ll/ۨ᩺ۜ;

    iget-object v3, p0, Ll/۫᩺ۜ;->᩶:Ll/ۤ᩺ۜ;

    invoke-static {v2, v3, v0, v1}, Ll/ۨ᩺ۜ;->֫(Ll/ۨ᩺ۜ;Ll/ۤ᩺ۜ;ILl/ܿۖ᩷;)V

    .line 67
    iget-object v0, p0, Ll/۫᩺ۜ;->ۙ:Ljava/io/FileOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write(I)V

    return-void
.end method

.method public final write([BII)V
    .locals 3

    if-ltz p2, :cond_0

    if-ltz p3, :cond_0

    .line 72
    array-length v0, p1

    sub-int/2addr v0, p3

    if-gt p2, v0, :cond_0

    .line 74
    iget-object v0, p0, Ll/۫᩺ۜ;->᩶:Ll/ۤ᩺ۜ;

    iget-object v1, p0, Ll/۫᩺ۜ;->᩹:Ll/ܿۖ᩷;

    iget-object v2, p0, Ll/۫᩺ۜ;->᩸:Ll/ۨ᩺ۜ;

    invoke-static {v2, v0, p3, v1}, Ll/ۨ᩺ۜ;->֫(Ll/ۨ᩺ۜ;Ll/ۤ᩺ۜ;ILl/ܿۖ᩷;)V

    .line 75
    iget-object v0, p0, Ll/۫᩺ۜ;->ۙ:Ljava/io/FileOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/FileOutputStream;->write([BII)V

    return-void

    .line 73
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
