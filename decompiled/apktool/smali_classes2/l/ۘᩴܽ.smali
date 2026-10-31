.class public final Ll/ۘᩴܽ;
.super Ljava/lang/Object;
.source "6AJN"

# interfaces
.implements Ljava/lang/CharSequence;
.implements Ljava/io/Closeable;


# instance fields
.field public final ۗ:Ljava/io/InputStreamReader;

.field public ۙ:I

.field public ᩶:I

.field public final ᩸:[C

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStreamReader;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0xe6666

    new-array v0, v0, [C

    .line 21
    iput-object v0, p0, Ll/ۘᩴܽ;->᩸:[C

    .line 31
    iput-object p1, p0, Ll/ۘᩴܽ;->ۗ:Ljava/io/InputStreamReader;

    const/4 p1, 0x1

    .line 32
    iput-boolean p1, p0, Ll/ۘᩴܽ;->᩹:Z

    .line 33
    invoke-direct {p0}, Ll/ۘᩴܽ;->֫()V

    return-void
.end method

.method private ֫()V
    .locals 5

    .line 87
    iget-boolean v0, p0, Ll/ۘᩴܽ;->᩹:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 90
    :cond_0
    iget v0, p0, Ll/ۘᩴܽ;->᩶:I

    iget v1, p0, Ll/ۘᩴܽ;->ۙ:I

    sub-int/2addr v0, v1

    .line 91
    iget-object v2, p0, Ll/ۘᩴܽ;->᩸:[C

    const/4 v3, 0x0

    if-lez v0, :cond_1

    .line 92
    invoke-static {v2, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 94
    :cond_1
    iput v3, p0, Ll/ۘᩴܽ;->ۙ:I

    .line 95
    iput v0, p0, Ll/ۘᩴܽ;->᩶:I

    .line 97
    :goto_0
    array-length v0, v2

    iget v1, p0, Ll/ۘᩴܽ;->᩶:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_2

    :goto_1
    return-void

    .line 101
    :cond_2
    iget-object v4, p0, Ll/ۘᩴܽ;->ۗ:Ljava/io/InputStreamReader;

    invoke-virtual {v4, v2, v1, v0}, Ljava/io/Reader;->read([CII)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 103
    invoke-virtual {v4}, Ljava/io/Reader;->close()V

    .line 104
    iput-boolean v3, p0, Ll/ۘᩴܽ;->᩹:Z

    return-void

    .line 107
    :cond_3
    iget v1, p0, Ll/ۘᩴܽ;->᩶:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۘᩴܽ;->᩶:I

    goto :goto_0
.end method

.method public static ֫(Ll/۫ۘܽ;ZLl/ܿۖ᩷;Z)V
    .locals 0

    .line 70
    invoke-static {p2, p3}, Ll/ۘᩴܽ;->֫(Ll/ܿۖ᩷;Z)V

    if-eqz p3, :cond_1

    if-nez p1, :cond_1

    .line 73
    invoke-virtual {p0}, Ll/۫ۘܽ;->ۜ()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ll/۫ۘܽ;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 74
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Regex matching did not complete."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ܿۖ᩷;Z)V
    .locals 0

    if-eqz p1, :cond_1

    .line 81
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string p1, "Content search canceled."

    invoke-direct {p0, p1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 1

    if-ltz p1, :cond_0

    .line 142
    invoke-virtual {p0}, Ll/ۘᩴܽ;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 145
    iget v0, p0, Ll/ۘᩴܽ;->ۙ:I

    add-int/2addr p1, v0

    iget-object v0, p0, Ll/ۘᩴܽ;->᩸:[C

    aget-char p1, v0, p1

    return p1

    .line 143
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final close()V
    .locals 1

    .line 165
    iget-boolean v0, p0, Ll/ۘᩴܽ;->᩹:Z

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Ll/ۘᩴܽ;->ۗ:Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    const/4 v0, 0x0

    .line 167
    iput-boolean v0, p0, Ll/ۘᩴܽ;->᩹:Z

    :cond_0
    return-void
.end method

.method public final length()I
    .locals 2

    .line 137
    iget v0, p0, Ll/ۘᩴܽ;->᩶:I

    iget v1, p0, Ll/ۘᩴܽ;->ۙ:I

    sub-int/2addr v0, v1

    const/high16 v1, 0x80000

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 2

    if-ltz p1, :cond_0

    if-lt p2, p1, :cond_0

    .line 151
    invoke-virtual {p0}, Ll/ۘᩴܽ;->length()I

    move-result v0

    if-gt p2, v0, :cond_0

    .line 154
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ۘᩴܽ;->ۙ:I

    add-int/2addr v1, p1

    sub-int/2addr p2, p1

    iget-object p1, p0, Ll/ۘᩴܽ;->᩸:[C

    invoke-direct {v0, p1, v1, p2}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 152
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 160
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ۘᩴܽ;->ۙ:I

    invoke-virtual {p0}, Ll/ۘᩴܽ;->length()I

    move-result v2

    iget-object v3, p0, Ll/ۘᩴܽ;->᩸:[C

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public final ֫(Ll/ۨۘܽ;Ll/ܿۖ᩷;Z)Z
    .locals 5

    .line 46
    invoke-virtual {p1, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p1

    .line 47
    invoke-static {p2, p3}, Ll/ۘᩴܽ;->֫(Ll/ܿۖ᩷;Z)V

    .line 48
    invoke-virtual {p0}, Ll/ۘᩴܽ;->length()I

    move-result v0

    const/high16 v1, 0x80000

    if-ge v0, v1, :cond_0

    .line 49
    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v0

    invoke-static {p1, v0, p2, p3}, Ll/ۘᩴܽ;->֫(Ll/۫ۘܽ;ZLl/ܿۖ᩷;Z)V

    return v0

    :cond_0
    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x1400

    if-ge v2, v3, :cond_2

    .line 52
    invoke-virtual {p1, v2}, Ll/۫ۘܽ;->֫(I)Z

    move-result v3

    invoke-static {p1, v3, p2, p3}, Ll/ۘᩴܽ;->֫(Ll/۫ۘܽ;ZLl/ܿۖ᩷;Z)V

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    invoke-virtual {p1, v3}, Ll/۫ۘܽ;->֫(I)Z

    move-result v2

    invoke-static {p1, v2, p2, p3}, Ll/ۘᩴܽ;->֫(Ll/۫ۘܽ;ZLl/ܿۖ᩷;Z)V

    if-eqz v2, :cond_3

    :goto_2
    const/4 p1, 0x1

    return p1

    .line 117
    :cond_3
    iget v2, p0, Ll/ۘᩴܽ;->᩶:I

    iget v4, p0, Ll/ۘᩴܽ;->ۙ:I

    sub-int/2addr v2, v4

    if-le v2, v1, :cond_4

    add-int/lit8 v4, v4, 0x1

    .line 118
    iput v4, p0, Ll/ۘᩴܽ;->ۙ:I

    goto :goto_1

    .line 121
    :cond_4
    iget-boolean v2, p0, Ll/ۘᩴܽ;->᩹:Z

    if-nez v2, :cond_5

    goto :goto_3

    .line 124
    :cond_5
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    .line 127
    :cond_6
    invoke-direct {p0}, Ll/ۘᩴܽ;->֫()V

    .line 128
    iget v2, p0, Ll/ۘᩴܽ;->᩶:I

    iget v4, p0, Ll/ۘᩴܽ;->ۙ:I

    sub-int/2addr v2, v4

    if-le v2, v1, :cond_7

    add-int/lit8 v4, v4, 0x1

    .line 129
    iput v4, p0, Ll/ۘᩴܽ;->ۙ:I

    goto :goto_1

    .line 61
    :cond_7
    :goto_3
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 62
    invoke-static {p2, p3}, Ll/ۘᩴܽ;->֫(Ll/ܿۖ᩷;Z)V

    return v0

    :cond_8
    const/16 v0, 0x1401

    .line 65
    invoke-virtual {p1, v0}, Ll/۫ۘܽ;->find(I)Z

    move-result v0

    invoke-static {p1, v0, p2, p3}, Ll/ۘᩴܽ;->֫(Ll/۫ۘܽ;ZLl/ܿۖ᩷;Z)V

    return v0
.end method
