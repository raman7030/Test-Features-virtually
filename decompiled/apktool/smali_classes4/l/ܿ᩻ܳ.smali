.class public Ll/ܿ᩻ܳ;
.super Ljava/io/Writer;
.source "U7RM"


# instance fields
.field public final ᩶:Ljava/io/Writer;

.field public final ᩸:[C

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1

    const/16 v0, 0x10

    .line 40
    invoke-direct {p0, p1, v0}, Ll/ܿ᩻ܳ;-><init>(Ljava/io/Writer;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;I)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    const/4 v0, 0x0

    .line 37
    iput v0, p0, Ll/ܿ᩻ܳ;->᩹:I

    .line 44
    iput-object p1, p0, Ll/ܿ᩻ܳ;->᩶:Ljava/io/Writer;

    .line 45
    new-array p1, p2, [C

    iput-object p1, p0, Ll/ܿ᩻ܳ;->᩸:[C

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public flush()V
    .locals 4

    .line 87
    iget-object v0, p0, Ll/ܿ᩻ܳ;->᩶:Ljava/io/Writer;

    iget-object v1, p0, Ll/ܿ᩻ܳ;->᩸:[C

    iget v2, p0, Ll/ܿ᩻ܳ;->᩹:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/Writer;->write([CII)V

    .line 88
    iput v3, p0, Ll/ܿ᩻ܳ;->᩹:I

    return-void
.end method

.method public write(I)V
    .locals 3

    .line 50
    iget v0, p0, Ll/ܿ᩻ܳ;->᩹:I

    iget-object v1, p0, Ll/ܿ᩻ܳ;->᩸:[C

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_0

    .line 51
    invoke-virtual {p0}, Ll/ܿ᩻ܳ;->flush()V

    .line 53
    :cond_0
    iget-object v0, p0, Ll/ܿ᩻ܳ;->᩸:[C

    iget v1, p0, Ll/ܿ᩻ܳ;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܿ᩻ܳ;->᩹:I

    int-to-char p1, p1

    aput-char p1, v0, v1

    return-void
.end method

.method public write(Ljava/lang/String;II)V
    .locals 3

    .line 71
    iget v0, p0, Ll/ܿ᩻ܳ;->᩹:I

    iget-object v1, p0, Ll/ܿ᩻ܳ;->᩸:[C

    array-length v1, v1

    sub-int/2addr v1, p3

    if-le v0, v1, :cond_0

    .line 72
    invoke-virtual {p0}, Ll/ܿ᩻ܳ;->flush()V

    .line 73
    iget-object v0, p0, Ll/ܿ᩻ܳ;->᩸:[C

    array-length v0, v0

    if-le p3, v0, :cond_0

    .line 74
    iget-object v0, p0, Ll/ܿ᩻ܳ;->᩶:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    return-void

    :cond_0
    add-int v0, p2, p3

    .line 78
    iget-object v1, p0, Ll/ܿ᩻ܳ;->᩸:[C

    iget v2, p0, Ll/ܿ᩻ܳ;->᩹:I

    invoke-virtual {p1, p2, v0, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 79
    iget p1, p0, Ll/ܿ᩻ܳ;->᩹:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ܿ᩻ܳ;->᩹:I

    return-void
.end method

.method public write([CII)V
    .locals 2

    .line 58
    iget v0, p0, Ll/ܿ᩻ܳ;->᩹:I

    iget-object v1, p0, Ll/ܿ᩻ܳ;->᩸:[C

    array-length v1, v1

    sub-int/2addr v1, p3

    if-le v0, v1, :cond_0

    .line 59
    invoke-virtual {p0}, Ll/ܿ᩻ܳ;->flush()V

    .line 60
    iget-object v0, p0, Ll/ܿ᩻ܳ;->᩸:[C

    array-length v0, v0

    if-le p3, v0, :cond_0

    .line 61
    iget-object v0, p0, Ll/ܿ᩻ܳ;->᩶:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write([CII)V

    return-void

    .line 65
    :cond_0
    iget-object v0, p0, Ll/ܿ᩻ܳ;->᩸:[C

    iget v1, p0, Ll/ܿ᩻ܳ;->᩹:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 66
    iget p1, p0, Ll/ܿ᩻ܳ;->᩹:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ܿ᩻ܳ;->᩹:I

    return-void
.end method
