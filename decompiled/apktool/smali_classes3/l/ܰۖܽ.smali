.class public final Ll/ܰۖܽ;
.super Ljava/io/Writer;
.source "1AQN"


# instance fields
.field public ᩶:Z

.field public ᩸:C

.field public final ᩹:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 15
    iput-object p1, p0, Ll/ܰۖܽ;->᩹:Ljava/io/OutputStream;

    return-void
.end method

.method private ֫(IILjava/lang/CharSequence;)V
    .locals 9

    .line 113
    iget-boolean v0, p0, Ll/ܰۖܽ;->᩶:Z

    const/4 v1, 0x0

    const/16 v2, 0x80

    const/16 v3, 0x3f

    iget-object v4, p0, Ll/ܰۖܽ;->᩹:Ljava/io/OutputStream;

    if-eqz v0, :cond_2

    if-lez p2, :cond_2

    .line 114
    iput-boolean v1, p0, Ll/ܰۖܽ;->᩶:Z

    .line 116
    iget-char v0, p0, Ll/ܰۖܽ;->᩸:C

    .line 117
    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    .line 118
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 119
    invoke-static {v0, v5}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    if-gez v0, :cond_1

    .line 122
    invoke-virtual {v4, v3}, Ljava/io/OutputStream;->write(I)V

    goto :goto_1

    :cond_1
    shr-int/lit8 v5, v0, 0x12

    or-int/lit16 v5, v5, 0xf0

    .line 124
    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v5, v0, 0xc

    and-int/2addr v5, v3

    or-int/2addr v5, v2

    .line 125
    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v5, v0, 0x6

    and-int/2addr v5, v3

    or-int/2addr v5, v2

    .line 126
    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write(I)V

    and-int/2addr v0, v3

    or-int/2addr v0, v2

    .line 127
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, -0x1

    :cond_2
    :goto_1
    if-ge v1, p2, :cond_9

    add-int v0, p1, v1

    .line 133
    invoke-interface {p3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/4 v6, 0x1

    if-ge v5, v2, :cond_3

    int-to-byte v0, v5

    .line 135
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    goto/16 :goto_3

    :cond_3
    const/16 v7, 0x800

    if-ge v5, v7, :cond_4

    shr-int/lit8 v0, v5, 0x6

    and-int/lit8 v0, v0, 0x1f

    or-int/lit16 v0, v0, 0xc0

    .line 137
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/lit8 v0, v5, 0x3f

    or-int/2addr v0, v2

    .line 138
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    goto :goto_3

    :cond_4
    const v7, 0xd800

    if-lt v5, v7, :cond_8

    const v7, 0xdfff

    if-gt v5, v7, :cond_8

    add-int/lit8 v7, v1, 0x1

    if-ge v7, p2, :cond_5

    add-int/lit8 v0, v0, 0x1

    .line 142
    invoke-interface {p3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 143
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-static {v0}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 144
    invoke-static {v5, v0}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    goto :goto_2

    .line 146
    :cond_5
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 147
    iput-char v5, p0, Ll/ܰۖܽ;->᩸:C

    .line 148
    iput-boolean v6, p0, Ll/ܰۖܽ;->᩶:Z

    return-void

    :cond_6
    const/4 v0, -0x1

    :goto_2
    if-gez v0, :cond_7

    .line 152
    invoke-virtual {v4, v3}, Ljava/io/OutputStream;->write(I)V

    goto :goto_3

    :cond_7
    shr-int/lit8 v1, v0, 0x12

    or-int/lit16 v1, v1, 0xf0

    .line 154
    invoke-virtual {v4, v1}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v1, v0, 0xc

    and-int/2addr v1, v3

    or-int/2addr v1, v2

    .line 155
    invoke-virtual {v4, v1}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v1, v0, 0x6

    and-int/2addr v1, v3

    or-int/2addr v1, v2

    .line 156
    invoke-virtual {v4, v1}, Ljava/io/OutputStream;->write(I)V

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v0, v2

    .line 157
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    move v1, v7

    goto :goto_3

    :cond_8
    shr-int/lit8 v0, v5, 0xc

    and-int/lit8 v0, v0, 0xf

    or-int/lit16 v0, v0, 0xe0

    .line 161
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, v5, 0x6

    and-int/2addr v0, v3

    or-int/2addr v0, v2

    .line 162
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/lit8 v0, v5, 0x3f

    or-int/2addr v0, v2

    .line 163
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    :goto_3
    add-int/2addr v1, v6

    goto/16 :goto_1

    :cond_9
    return-void
.end method


# virtual methods
.method public final append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 2

    const/4 v0, 0x0

    .line 176
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {p0, v0, v1, p1}, Ll/ܰۖܽ;->֫(IILjava/lang/CharSequence;)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 0

    sub-int/2addr p3, p2

    .line 183
    invoke-direct {p0, p2, p3, p1}, Ll/ܰۖܽ;->֫(IILjava/lang/CharSequence;)V

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Ll/ܰۖܽ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    sub-int/2addr p3, p2

    .line 183
    invoke-direct {p0, p2, p3, p1}, Ll/ܰۖܽ;->֫(IILjava/lang/CharSequence;)V

    return-object p0
.end method

.method public final close()V
    .locals 2

    .line 194
    iget-boolean v0, p0, Ll/ܰۖܽ;->᩶:Z

    iget-object v1, p0, Ll/ܰۖܽ;->᩹:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 195
    iput-boolean v0, p0, Ll/ܰۖܽ;->᩶:Z

    const/16 v0, 0x3f

    .line 196
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 198
    :cond_0
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 189
    iget-object v0, p0, Ll/ܰۖܽ;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 5

    .line 20
    iget-boolean v0, p0, Ll/ܰۖܽ;->᩶:Z

    const/16 v1, 0x80

    const/16 v2, 0x3f

    iget-object v3, p0, Ll/ܰۖܽ;->᩹:Ljava/io/OutputStream;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Ll/ܰۖܽ;->᩶:Z

    int-to-char v0, p1

    .line 23
    invoke-static {v0}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 24
    iget-char v4, p0, Ll/ܰۖܽ;->᩸:C

    invoke-static {v4, v0}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    if-gez v0, :cond_1

    .line 27
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write(I)V

    goto :goto_1

    :cond_1
    shr-int/lit8 p1, v0, 0x12

    or-int/lit16 p1, p1, 0xf0

    .line 29
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 p1, v0, 0xc

    and-int/2addr p1, v2

    or-int/2addr p1, v1

    .line 30
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 p1, v0, 0x6

    and-int/2addr p1, v2

    or-int/2addr p1, v1

    .line 31
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    and-int/lit8 p1, v0, 0x3f

    or-int/2addr p1, v1

    .line 32
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    return-void

    :cond_2
    :goto_1
    if-ge p1, v1, :cond_3

    int-to-byte p1, p1

    .line 37
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    return-void

    :cond_3
    const/16 v0, 0x800

    if-ge p1, v0, :cond_4

    shr-int/lit8 v0, p1, 0x6

    and-int/lit8 v0, v0, 0x1f

    or-int/lit16 v0, v0, 0xc0

    .line 39
    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/2addr p1, v2

    or-int/2addr p1, v1

    .line 40
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    return-void

    :cond_4
    const v0, 0xd800

    if-lt p1, v0, :cond_6

    const v0, 0xdfff

    if-gt p1, v0, :cond_6

    int-to-char p1, p1

    .line 42
    invoke-static {p1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 43
    iput-char p1, p0, Ll/ܰۖܽ;->᩸:C

    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Ll/ܰۖܽ;->᩶:Z

    return-void

    .line 46
    :cond_5
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write(I)V

    return-void

    :cond_6
    shr-int/lit8 v0, p1, 0xc

    and-int/lit8 v0, v0, 0xf

    or-int/lit16 v0, v0, 0xe0

    .line 49
    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x6

    and-int/2addr v0, v2

    or-int/2addr v0, v1

    .line 50
    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/2addr p1, v2

    or-int/2addr p1, v1

    .line 51
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 0

    .line 170
    invoke-direct {p0, p2, p3, p1}, Ll/ܰۖܽ;->֫(IILjava/lang/CharSequence;)V

    return-void
.end method

.method public final write([CII)V
    .locals 9

    .line 57
    iget-boolean v0, p0, Ll/ܰۖܽ;->᩶:Z

    const/4 v1, 0x0

    const/16 v2, 0x80

    const/16 v3, 0x3f

    iget-object v4, p0, Ll/ܰۖܽ;->᩹:Ljava/io/OutputStream;

    if-eqz v0, :cond_2

    if-lez p3, :cond_2

    .line 58
    iput-boolean v1, p0, Ll/ܰۖܽ;->᩶:Z

    .line 60
    iget-char v0, p0, Ll/ܰۖܽ;->᩸:C

    .line 61
    aget-char v5, p1, p2

    .line 62
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 63
    invoke-static {v0, v5}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    if-gez v0, :cond_1

    .line 66
    invoke-virtual {v4, v3}, Ljava/io/OutputStream;->write(I)V

    goto :goto_1

    :cond_1
    shr-int/lit8 v5, v0, 0x12

    or-int/lit16 v5, v5, 0xf0

    .line 68
    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v5, v0, 0xc

    and-int/2addr v5, v3

    or-int/2addr v5, v2

    .line 69
    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v5, v0, 0x6

    and-int/2addr v5, v3

    or-int/2addr v5, v2

    .line 70
    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write(I)V

    and-int/2addr v0, v3

    or-int/2addr v0, v2

    .line 71
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p3, p3, -0x1

    :cond_2
    :goto_1
    if-ge v1, p3, :cond_9

    add-int v0, p2, v1

    .line 77
    aget-char v5, p1, v0

    const/4 v6, 0x1

    if-ge v5, v2, :cond_3

    int-to-byte v0, v5

    .line 79
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    goto/16 :goto_3

    :cond_3
    const/16 v7, 0x800

    if-ge v5, v7, :cond_4

    shr-int/lit8 v0, v5, 0x6

    and-int/lit8 v0, v0, 0x1f

    or-int/lit16 v0, v0, 0xc0

    .line 81
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/lit8 v0, v5, 0x3f

    or-int/2addr v0, v2

    .line 82
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    goto :goto_3

    :cond_4
    const v7, 0xd800

    if-lt v5, v7, :cond_8

    const v7, 0xdfff

    if-gt v5, v7, :cond_8

    add-int/lit8 v7, v1, 0x1

    if-ge v7, p3, :cond_5

    add-int/lit8 v0, v0, 0x1

    .line 86
    aget-char v0, p1, v0

    .line 87
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-static {v0}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 88
    invoke-static {v5, v0}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    goto :goto_2

    .line 90
    :cond_5
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 91
    iput-char v5, p0, Ll/ܰۖܽ;->᩸:C

    .line 92
    iput-boolean v6, p0, Ll/ܰۖܽ;->᩶:Z

    return-void

    :cond_6
    const/4 v0, -0x1

    :goto_2
    if-gez v0, :cond_7

    .line 96
    invoke-virtual {v4, v3}, Ljava/io/OutputStream;->write(I)V

    goto :goto_3

    :cond_7
    shr-int/lit8 v1, v0, 0x12

    or-int/lit16 v1, v1, 0xf0

    .line 98
    invoke-virtual {v4, v1}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v1, v0, 0xc

    and-int/2addr v1, v3

    or-int/2addr v1, v2

    .line 99
    invoke-virtual {v4, v1}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v1, v0, 0x6

    and-int/2addr v1, v3

    or-int/2addr v1, v2

    .line 100
    invoke-virtual {v4, v1}, Ljava/io/OutputStream;->write(I)V

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v0, v2

    .line 101
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    move v1, v7

    goto :goto_3

    :cond_8
    shr-int/lit8 v0, v5, 0xc

    and-int/lit8 v0, v0, 0xf

    or-int/lit16 v0, v0, 0xe0

    .line 105
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, v5, 0x6

    and-int/2addr v0, v3

    or-int/2addr v0, v2

    .line 106
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/lit8 v0, v5, 0x3f

    or-int/2addr v0, v2

    .line 107
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write(I)V

    :goto_3
    add-int/2addr v1, v6

    goto/16 :goto_1

    :cond_9
    return-void
.end method
