.class public Ll/ۗ᩵ۚ;
.super Ljava/io/Writer;
.source "Z4ZE"


# static fields
.field public static final ۗ:Ljava/lang/String;


# instance fields
.field public final ۙ:Ljava/io/Writer;

.field public ᩶:I

.field public ᩸:Z

.field public final ᩹:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "line.separator"

    .line 37
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۗ᩵ۚ;->ۗ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    const/16 v0, 0x18

    new-array v0, v0, [C

    .line 39
    iput-object v0, p0, Ll/ۗ᩵ۚ;->᩹:[C

    const/4 v0, 0x0

    .line 40
    iput v0, p0, Ll/ۗ᩵ۚ;->᩶:I

    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Ll/ۗ᩵ۚ;->᩸:Z

    .line 44
    iput-object p1, p0, Ll/ۗ᩵ۚ;->ۙ:Ljava/io/Writer;

    return-void
.end method

.method private ֫([CII)V
    .locals 1

    .line 71
    iget-boolean v0, p0, Ll/ۗ᩵ۚ;->᩸:Z

    if-eqz v0, :cond_0

    if-lez p3, :cond_0

    .line 72
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->ᩳ()V

    const/4 v0, 0x0

    .line 73
    iput-boolean v0, p0, Ll/ۗ᩵ۚ;->᩸:Z

    .line 75
    :cond_0
    iget-object v0, p0, Ll/ۗ᩵ۚ;->ۙ:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write([CII)V

    return-void
.end method


# virtual methods
.method public final append(C)Ljava/io/Writer;
    .locals 0

    .line 155
    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(I)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 0

    .line 143
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 0

    .line 149
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public final append(C)Ljava/lang/Appendable;
    .locals 0

    .line 155
    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(I)V

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0

    .line 36
    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    .line 36
    invoke-virtual {p0, p1, p2, p3}, Ll/ۗ᩵ۚ;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;

    return-object p0
.end method

.method public final close()V
    .locals 1

    .line 166
    iget-object v0, p0, Ll/ۗ᩵ۚ;->ۙ:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 161
    iget-object v0, p0, Ll/ۗ᩵ۚ;->ۙ:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 2

    const/16 v0, 0xa

    .line 55
    iget-object v1, p0, Ll/ۗ᩵ۚ;->ۙ:Ljava/io/Writer;

    if-ne p1, v0, :cond_0

    .line 56
    sget-object p1, Ll/ۗ᩵ۚ;->ۗ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, Ll/ۗ᩵ۚ;->᩸:Z

    return-void

    .line 59
    :cond_0
    iget-boolean v0, p0, Ll/ۗ᩵ۚ;->᩸:Z

    if-eqz v0, :cond_1

    .line 60
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->ᩳ()V

    :cond_1
    const/4 v0, 0x0

    .line 62
    iput-boolean v0, p0, Ll/ۗ᩵ۚ;->᩸:Z

    .line 63
    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 116
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 5

    add-int/2addr p3, p2

    move v0, p2

    :goto_0
    if-ge p2, p3, :cond_4

    const/16 p2, 0xa

    .line 128
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->indexOf(II)I

    move-result p2

    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 129
    iget-object v3, p0, Ll/ۗ᩵ۚ;->ۙ:Ljava/io/Writer;

    if-eq p2, v1, :cond_2

    if-lt p2, p3, :cond_0

    goto :goto_1

    :cond_0
    sub-int v1, p2, v0

    .line 83
    iget-boolean v4, p0, Ll/ۗ᩵ۚ;->᩸:Z

    if-eqz v4, :cond_1

    if-lez v1, :cond_1

    .line 84
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->ᩳ()V

    .line 85
    iput-boolean v2, p0, Ll/ۗ᩵ۚ;->᩸:Z

    .line 87
    :cond_1
    invoke-virtual {v3, p1, v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    .line 134
    sget-object v0, Ll/ۗ᩵ۚ;->ۗ:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 135
    iput-boolean v0, p0, Ll/ۗ᩵ۚ;->᩸:Z

    add-int/lit8 v0, p2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    sub-int/2addr p3, v0

    .line 83
    iget-boolean p2, p0, Ll/ۗ᩵ۚ;->᩸:Z

    if-eqz p2, :cond_3

    if-lez p3, :cond_3

    .line 84
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->ᩳ()V

    .line 85
    iput-boolean v2, p0, Ll/ۗ᩵ۚ;->᩸:Z

    .line 87
    :cond_3
    invoke-virtual {v3, p1, v0, p3}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    :cond_4
    return-void
.end method

.method public final write([C)V
    .locals 2

    const/4 v0, 0x0

    .line 92
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۗ᩵ۚ;->write([CII)V

    return-void
.end method

.method public final write([CII)V
    .locals 3

    add-int/2addr p3, p2

    move v0, p2

    :goto_0
    if-ge p2, p3, :cond_1

    .line 100
    aget-char v1, p1, p2

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    sub-int v1, p2, v0

    .line 101
    invoke-direct {p0, p1, v0, v1}, Ll/ۗ᩵ۚ;->֫([CII)V

    .line 103
    iget-object v0, p0, Ll/ۗ᩵ۚ;->ۙ:Ljava/io/Writer;

    sget-object v1, Ll/ۗ᩵ۚ;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 104
    iput-boolean v0, p0, Ll/ۗ᩵ۚ;->᩸:Z

    add-int/lit8 v0, p2, 0x1

    move p2, v0

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    sub-int/2addr p2, v0

    .line 111
    invoke-direct {p0, p1, v0, p2}, Ll/ۗ᩵ۚ;->֫([CII)V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 177
    iget v0, p0, Ll/ۗ᩵ۚ;->᩶:I

    add-int/lit8 v0, v0, -0x4

    iput v0, p0, Ll/ۗ᩵ۚ;->᩶:I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    .line 179
    iput v0, p0, Ll/ۗ᩵ۚ;->᩶:I

    :cond_0
    return-void
.end method

.method public ֫(Ll/֨ۗ֡;)V
    .locals 0

    .line 120
    iget-object p1, p1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 4

    const/16 v0, 0xf

    if-gez p1, :cond_0

    mul-int/lit8 p1, p1, -0x1

    const/16 v1, 0x2d

    .line 226
    invoke-virtual {p0, v1}, Ll/ۗ᩵ۚ;->write(I)V

    .line 230
    :cond_0
    :goto_0
    rem-int/lit8 v1, p1, 0xa

    add-int/lit8 v2, v0, -0x1

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 231
    iget-object v3, p0, Ll/ۗ᩵ۚ;->᩹:[C

    aput-char v1, v3, v0

    .line 233
    div-int/lit8 p1, p1, 0xa

    if-nez p1, :cond_1

    rsub-int/lit8 p1, v0, 0x10

    .line 238
    invoke-direct {p0, v3, v0, p1}, Ll/ۗ᩵ۚ;->֫([CII)V

    return-void

    :cond_1
    move v0, v2

    goto :goto_0
.end method

.method public ۧ(J)V
    .locals 5

    const/16 v0, 0x17

    :cond_0
    const-wide/16 v1, 0xf

    and-long/2addr v1, p1

    long-to-int v2, v1

    const/16 v1, 0xa

    .line 187
    iget-object v3, p0, Ll/ۗ᩵ۚ;->᩹:[C

    if-ge v2, v1, :cond_1

    add-int/lit8 v1, v0, -0x1

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    .line 188
    aput-char v2, v3, v0

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v0, -0x1

    add-int/lit8 v2, v2, 0x57

    int-to-char v2, v2

    .line 190
    aput-char v2, v3, v0

    :goto_0
    move v0, v1

    const/4 v1, 0x4

    ushr-long/2addr p1, v1

    const-wide/16 v1, 0x0

    cmp-long v4, p1, v1

    if-nez v4, :cond_0

    add-int/lit8 v0, v0, 0x1

    rsub-int/lit8 p1, v0, 0x18

    .line 198
    invoke-direct {p0, v3, v0, p1}, Ll/ۗ᩵ۚ;->֫([CII)V

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 170
    iget v0, p0, Ll/ۗ᩵ۚ;->᩶:I

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/ۗ᩵ۚ;->᩶:I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    .line 172
    iput v0, p0, Ll/ۗ᩵ۚ;->᩶:I

    :cond_0
    return-void
.end method

.method public final ܽ(I)V
    .locals 11

    if-gez p1, :cond_2

    int-to-long v0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    const/16 p1, 0x17

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const-wide/16 v4, -0x1

    mul-long v0, v0, v4

    const/16 v4, 0x2d

    .line 206
    invoke-virtual {p0, v4}, Ll/ۗ᩵ۚ;->write(I)V

    :cond_0
    :goto_0
    const-wide/16 v4, 0xa

    .line 210
    rem-long v6, v0, v4

    add-int/lit8 v8, p1, -0x1

    const-wide/16 v9, 0x30

    add-long/2addr v6, v9

    long-to-int v7, v6

    int-to-char v6, v7

    .line 211
    iget-object v7, p0, Ll/ۗ᩵ۚ;->᩹:[C

    aput-char v6, v7, p1

    .line 213
    div-long/2addr v0, v4

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    rsub-int/lit8 v0, p1, 0x18

    .line 218
    invoke-direct {p0, v7, p1, v0}, Ll/ۗ᩵ۚ;->֫([CII)V

    return-void

    :cond_1
    move p1, v8

    goto :goto_0

    .line 247
    :cond_2
    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->ۧ(I)V

    return-void
.end method

.method public ᩳ()V
    .locals 3

    const/4 v0, 0x0

    .line 48
    :goto_0
    iget v1, p0, Ll/ۗ᩵ۚ;->᩶:I

    if-ge v0, v1, :cond_0

    .line 49
    iget-object v1, p0, Ll/ۗ᩵ۚ;->ۙ:Ljava/io/Writer;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
