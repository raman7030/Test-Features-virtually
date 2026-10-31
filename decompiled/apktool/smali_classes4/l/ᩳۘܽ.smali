.class public final Ll/ᩳۘܽ;
.super Ljava/io/Writer;
.source "A9RY"


# instance fields
.field public final ۙ:Ljava/io/Writer;

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    const/4 v0, 0x1

    .line 8
    iput v0, p0, Ll/ᩳۘܽ;->᩹:I

    .line 9
    iput v0, p0, Ll/ᩳۘܽ;->᩸:I

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Ll/ᩳۘܽ;->᩶:I

    .line 13
    iput-object p1, p0, Ll/ᩳۘܽ;->ۙ:Ljava/io/Writer;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ᩳۘܽ;->ۙ:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ᩳۘܽ;->ۙ:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final getPosition()I
    .locals 1

    .line 77
    iget v0, p0, Ll/ᩳۘܽ;->᩶:I

    return v0
.end method

.method public final write(I)V
    .locals 2

    .line 18
    iget-object v0, p0, Ll/ᩳۘܽ;->ۙ:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(I)V

    .line 19
    iget v0, p0, Ll/ᩳۘܽ;->᩶:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ᩳۘܽ;->᩶:I

    const/16 v0, 0xa

    if-ne p1, v0, :cond_0

    .line 21
    iget p1, p0, Ll/ᩳۘܽ;->᩹:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ᩳۘܽ;->᩹:I

    .line 22
    iput v1, p0, Ll/ᩳۘܽ;->᩸:I

    return-void

    .line 24
    :cond_0
    iget p1, p0, Ll/ᩳۘܽ;->᩸:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ᩳۘܽ;->᩸:I

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 4

    .line 30
    iget-object v0, p0, Ll/ᩳۘܽ;->ۙ:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    .line 31
    iget v0, p0, Ll/ᩳۘܽ;->᩶:I

    add-int/2addr v0, p3

    iput v0, p0, Ll/ᩳۘܽ;->᩶:I

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    add-int v1, p2, v0

    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    .line 35
    iget v1, p0, Ll/ᩳۘܽ;->᩹:I

    add-int/2addr v1, v3

    iput v1, p0, Ll/ᩳۘܽ;->᩹:I

    .line 36
    iput v3, p0, Ll/ᩳۘܽ;->᩸:I

    goto :goto_1

    .line 38
    :cond_0
    iget v1, p0, Ll/ᩳۘܽ;->᩸:I

    add-int/2addr v1, v3

    iput v1, p0, Ll/ᩳۘܽ;->᩸:I

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final write([CII)V
    .locals 4

    .line 45
    iget-object v0, p0, Ll/ᩳۘܽ;->ۙ:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write([CII)V

    .line 46
    iget v0, p0, Ll/ᩳۘܽ;->᩶:I

    add-int/2addr v0, p3

    iput v0, p0, Ll/ᩳۘܽ;->᩶:I

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    add-int v1, p2, v0

    .line 48
    aget-char v1, p1, v1

    const/16 v2, 0xa

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    .line 50
    iget v1, p0, Ll/ᩳۘܽ;->᩹:I

    add-int/2addr v1, v3

    iput v1, p0, Ll/ᩳۘܽ;->᩹:I

    .line 51
    iput v3, p0, Ll/ᩳۘܽ;->᩸:I

    goto :goto_1

    .line 53
    :cond_0
    iget v1, p0, Ll/ᩳۘܽ;->᩸:I

    add-int/2addr v1, v3

    iput v1, p0, Ll/ᩳۘܽ;->᩸:I

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫()I
    .locals 1

    .line 73
    iget v0, p0, Ll/ᩳۘܽ;->᩸:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 69
    iget v0, p0, Ll/ᩳۘܽ;->᩹:I

    return v0
.end method
