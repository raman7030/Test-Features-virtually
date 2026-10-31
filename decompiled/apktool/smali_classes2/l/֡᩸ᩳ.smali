.class public final Ll/֡᩸ᩳ;
.super Ljava/io/Writer;
.source "9B2H"


# instance fields
.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/io/BufferedWriter;


# direct methods
.method public constructor <init>(Ljava/io/BufferedWriter;Ljava/lang/String;)V
    .locals 0

    .line 260
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 261
    iput-object p1, p0, Ll/֡᩸ᩳ;->᩹:Ljava/io/BufferedWriter;

    .line 262
    iput-object p2, p0, Ll/֡᩸ᩳ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 302
    iget-object v0, p0, Ll/֡᩸ᩳ;->᩹:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 297
    iget-object v0, p0, Ll/֡᩸ᩳ;->᩹:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 2

    const/16 v0, 0xa

    .line 288
    iget-object v1, p0, Ll/֡᩸ᩳ;->᩹:Ljava/io/BufferedWriter;

    if-ne p1, v0, :cond_0

    .line 289
    iget-object p1, p0, Ll/֡᩸ᩳ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 291
    :cond_0
    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public final write([CII)V
    .locals 4

    add-int/2addr p3, p2

    move v0, p2

    .line 276
    :goto_0
    iget-object v1, p0, Ll/֡᩸ᩳ;->᩹:Ljava/io/BufferedWriter;

    if-ge p2, p3, :cond_1

    .line 277
    aget-char v2, p1, p2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    sub-int v2, p2, v0

    .line 278
    invoke-virtual {v1, p1, v0, v2}, Ljava/io/Writer;->write([CII)V

    .line 279
    iget-object v0, p0, Ll/֡᩸ᩳ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v0, p2, 0x1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    sub-int/2addr p3, v0

    .line 283
    invoke-virtual {v1, p1, v0, p3}, Ljava/io/Writer;->write([CII)V

    return-void
.end method
