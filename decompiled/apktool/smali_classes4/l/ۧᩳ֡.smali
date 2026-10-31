.class public final Ll/ۧᩳ֡;
.super Ljava/lang/Object;
.source "G4D4"

# interfaces
.implements Ll/֨ᩳ֡;


# instance fields
.field public final ۙ:Ll/ۛܽ֡;

.field public final ᩶:Ljava/util/zip/Inflater;

.field public ᩸:I

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۛܽ֡;Ljava/util/zip/Inflater;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Ll/ۧᩳ֡;->ۙ:Ll/ۛܽ֡;

    .line 52
    iput-object p2, p0, Ll/ۧᩳ֡;->᩶:Ljava/util/zip/Inflater;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 124
    iget-boolean v0, p0, Ll/ۧᩳ֡;->᩹:Z

    if-eqz v0, :cond_0

    return-void

    .line 125
    :cond_0
    iget-object v0, p0, Ll/ۧᩳ֡;->᩶:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    const/4 v0, 0x1

    .line 126
    iput-boolean v0, p0, Ll/ۧᩳ֡;->᩹:Z

    .line 127
    iget-object v0, p0, Ll/ۧᩳ֡;->ۙ:Ll/ۛܽ֡;

    check-cast v0, Ll/ۘᩳ֡;

    invoke-virtual {v0}, Ll/ۘᩳ֡;->close()V

    return-void
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۧᩳ֡;->ۙ:Ll/ۛܽ֡;

    invoke-interface {v0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/۫ܽ֡;J)J
    .locals 7

    .line 58
    iget-boolean p2, p0, Ll/ۧᩳ֡;->᩹:Z

    if-nez p2, :cond_a

    .line 96
    :goto_0
    iget-object p2, p0, Ll/ۧᩳ֡;->᩶:Ljava/util/zip/Inflater;

    invoke-virtual {p2}, Ljava/util/zip/Inflater;->needsInput()Z

    move-result p3

    iget-object v0, p0, Ll/ۧᩳ֡;->ۙ:Ll/ۛܽ֡;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p3, :cond_0

    goto :goto_2

    .line 113
    :cond_0
    iget p3, p0, Ll/ۧᩳ֡;->᩸:I

    if-nez p3, :cond_1

    goto :goto_1

    .line 114
    :cond_1
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result v3

    sub-int/2addr p3, v3

    .line 115
    iget v3, p0, Ll/ۧᩳ֡;->᩸:I

    sub-int/2addr v3, p3

    iput v3, p0, Ll/ۧᩳ֡;->᩸:I

    int-to-long v3, p3

    .line 116
    move-object p3, v0

    check-cast p3, Ll/ۘᩳ֡;

    invoke-virtual {p3, v3, v4}, Ll/ۘᩳ֡;->skip(J)V

    .line 99
    :goto_1
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result p3

    if-nez p3, :cond_9

    .line 102
    move-object p3, v0

    check-cast p3, Ll/ۘᩳ֡;

    invoke-virtual {p3}, Ll/ۘᩳ֡;->ۢۧ()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    .line 38
    :cond_2
    iget-object p3, p3, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    .line 105
    iget-object p3, p3, Ll/۫ܽ֡;->᩸:Ll/ᩴᩳ֡;

    .line 106
    iget v3, p3, Ll/ᩴᩳ֡;->ۧ:I

    iget v4, p3, Ll/ᩴᩳ֡;->ܿ:I

    sub-int/2addr v3, v4

    iput v3, p0, Ll/ۧᩳ֡;->᩸:I

    .line 107
    iget-object p3, p3, Ll/ᩴᩳ֡;->֫:[B

    invoke-virtual {p2, p3, v4, v3}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 66
    :goto_2
    :try_start_0
    invoke-virtual {p1, v1}, Ll/۫ܽ֡;->֫(I)Ll/ᩴᩳ֡;

    move-result-object p3

    .line 67
    iget v1, p3, Ll/ᩴᩳ֡;->ۧ:I

    rsub-int v1, v1, 0x2000

    int-to-long v3, v1

    const-wide/16 v5, 0x2000

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v1, v3

    .line 68
    iget-object v3, p3, Ll/ᩴᩳ֡;->֫:[B

    iget v4, p3, Ll/ᩴᩳ֡;->ۧ:I

    invoke-virtual {p2, v3, v4, v1}, Ljava/util/zip/Inflater;->inflate([BII)I

    move-result v1

    if-lez v1, :cond_3

    .line 70
    iget p2, p3, Ll/ᩴᩳ֡;->ۧ:I

    add-int/2addr p2, v1

    iput p2, p3, Ll/ᩴᩳ֡;->ۧ:I

    .line 71
    iget-wide p2, p1, Ll/۫ܽ֡;->᩹:J

    int-to-long v0, v1

    add-long/2addr p2, v0

    iput-wide p2, p1, Ll/۫ܽ֡;->᩹:J

    return-wide v0

    .line 74
    :cond_3
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->finished()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {p2}, Ljava/util/zip/Inflater;->needsDictionary()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    if-nez v2, :cond_5

    goto :goto_0

    .line 83
    :cond_5
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "source exhausted prematurely"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 113
    :cond_6
    :goto_3
    iget v1, p0, Ll/ۧᩳ֡;->᩸:I

    if-nez v1, :cond_7

    goto :goto_4

    .line 114
    :cond_7
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result p2

    sub-int/2addr v1, p2

    .line 115
    iget p2, p0, Ll/ۧᩳ֡;->᩸:I

    sub-int/2addr p2, v1

    iput p2, p0, Ll/ۧᩳ֡;->᩸:I

    int-to-long v1, v1

    .line 116
    check-cast v0, Ll/ۘᩳ֡;

    invoke-virtual {v0, v1, v2}, Ll/ۘᩳ֡;->skip(J)V

    .line 76
    :goto_4
    iget p2, p3, Ll/ᩴᩳ֡;->ܿ:I

    iget v0, p3, Ll/ᩴᩳ֡;->ۧ:I

    if-ne p2, v0, :cond_8

    .line 78
    invoke-virtual {p3}, Ll/ᩴᩳ֡;->֫()Ll/ᩴᩳ֡;

    move-result-object p2

    iput-object p2, p1, Ll/۫ܽ֡;->᩸:Ll/ᩴᩳ֡;

    .line 79
    invoke-static {p3}, Ll/᩵ᩳ֡;->֫(Ll/ᩴᩳ֡;)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_8
    const-wide/16 p1, -0x1

    return-wide p1

    :catch_0
    move-exception p1

    .line 85
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 99
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "?"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
