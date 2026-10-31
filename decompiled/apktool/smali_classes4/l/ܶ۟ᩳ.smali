.class public final Ll/ܶ۟ᩳ;
.super Ljava/lang/Object;
.source "B6O0"

# interfaces
.implements Ll/᩺۬ۡ;
.implements Landroid/text/Spannable;
.implements Landroid/text/GetChars;


# instance fields
.field public final ۗ:Ll/᩶᩸ᩳ;

.field public ۙ:I

.field public ᩶:I

.field public ᩸:[C

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/۟᩺ᩳ;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v0, v0, [C

    .line 19
    iput-object v0, p0, Ll/ܶ۟ᩳ;->᩸:[C

    const/4 v0, -0x1

    .line 22
    iput v0, p0, Ll/ܶ۟ᩳ;->ۙ:I

    .line 25
    iput-object p1, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    return-void
.end method

.method private ֫(II)V
    .locals 3

    sub-int v0, p2, p1

    .line 35
    iget-object v1, p0, Ll/ܶ۟ᩳ;->᩸:[C

    array-length v1, v1

    if-ge v1, v0, :cond_0

    .line 36
    new-array v0, v0, [C

    iput-object v0, p0, Ll/ܶ۟ᩳ;->᩸:[C

    :cond_0
    const/4 v0, 0x0

    .line 39
    :try_start_0
    iget-object v1, p0, Ll/ܶ۟ᩳ;->᩸:[C

    .line 49
    iget-object v2, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v2, p1, p2, v1, v0}, Ll/᩶᩸ᩳ;->ۧ(II[CI)V

    .line 40
    iput p1, p0, Ll/ܶ۟ᩳ;->᩶:I

    .line 41
    iput p2, p0, Ll/ܶ۟ᩳ;->᩹:I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 43
    iput v0, p0, Ll/ܶ۟ᩳ;->᩹:I

    iput v0, p0, Ll/ܶ۟ᩳ;->᩶:I

    .line 44
    throw p1
.end method


# virtual methods
.method public final charAt(I)C
    .locals 7

    .line 55
    iget v0, p0, Ll/ܶ۟ᩳ;->᩶:I

    if-lt p1, v0, :cond_0

    .line 56
    iget v1, p0, Ll/ܶ۟ᩳ;->᩹:I

    if-ge p1, v1, :cond_0

    .line 57
    iget-object v1, p0, Ll/ܶ۟ᩳ;->᩸:[C

    sub-int/2addr p1, v0

    aget-char p1, v1, p1

    return p1

    .line 60
    :cond_0
    iget v0, p0, Ll/ܶ۟ᩳ;->ۙ:I

    .line 61
    iput p1, p0, Ll/ܶ۟ᩳ;->ۙ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    if-le v0, p1, :cond_1

    add-int/lit16 v0, p1, -0x400

    const/4 v1, 0x0

    .line 65
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, p1

    .line 30
    :goto_0
    iget-object v1, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ltz p1, :cond_3

    if-lt p1, v2, :cond_2

    goto :goto_1

    :cond_2
    int-to-long v3, p1

    const-wide/16 v5, 0x400

    add-long/2addr v3, v5

    int-to-long v1, v2

    .line 74
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    .line 75
    invoke-direct {p0, v0, v2}, Ll/ܶ۟ᩳ;->֫(II)V

    .line 76
    iget-object v1, p0, Ll/ܶ۟ᩳ;->᩸:[C

    sub-int/2addr p1, v0

    aget-char p1, v1, p1

    return p1

    .line 72
    :cond_3
    :goto_1
    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final count(IIC)I
    .locals 6

    .line 157
    iget v0, p0, Ll/ܶ۟ᩳ;->᩶:I

    if-lt p1, v0, :cond_2

    iget v1, p0, Ll/ܶ۟ᩳ;->᩹:I

    if-ge p1, v1, :cond_2

    .line 158
    iget-object v2, p0, Ll/ܶ۟ᩳ;->᩸:[C

    sub-int/2addr p1, v0

    .line 159
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Ll/ܶ۟ᩳ;->᩶:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    :goto_0
    if-ge p1, v0, :cond_1

    .line 160
    aget-char v3, v2, p1

    if-ne v3, p3, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 164
    :cond_1
    iget p1, p0, Ll/ܶ۟ᩳ;->᩹:I

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-ge p1, p2, :cond_5

    int-to-long v2, p1

    const-wide/16 v4, 0x400

    add-long/2addr v2, v4

    int-to-long v4, p2

    .line 167
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-direct {p0, p1, v0}, Ll/ܶ۟ᩳ;->֫(II)V

    .line 169
    iget-object v0, p0, Ll/ܶ۟ᩳ;->᩸:[C

    .line 170
    iget v2, p0, Ll/ܶ۟ᩳ;->᩹:I

    sub-int/2addr v2, p1

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_4

    .line 172
    aget-char v4, v0, v3

    if-ne v4, p3, :cond_3

    add-int/lit8 v1, v1, 0x1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    add-int/2addr p1, v2

    goto :goto_1

    :cond_5
    return v1
.end method

.method public final getChars(II[CI)V
    .locals 2

    .line 196
    iget v0, p0, Ll/ܶ۟ᩳ;->᩶:I

    if-gt v0, p1, :cond_0

    iget v1, p0, Ll/ܶ۟ᩳ;->᩹:I

    if-gt p2, v1, :cond_0

    sub-int/2addr p1, v0

    sub-int/2addr p2, v0

    .line 199
    iget-object v0, p0, Ll/ܶ۟ᩳ;->᩸:[C

    sub-int/2addr p2, p1

    invoke-static {v0, p1, p3, p4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 49
    :cond_0
    iget-object v0, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v0, p1, p2, p3, p4}, Ll/᩶᩸ᩳ;->ۧ(II[CI)V

    return-void
.end method

.method public final getSpanEnd(Ljava/lang/Object;)I
    .locals 1

    .line 223
    iget-object v0, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpanFlags(Ljava/lang/Object;)I
    .locals 1

    .line 228
    iget-object v0, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpanStart(Ljava/lang/Object;)I
    .locals 1

    .line 218
    iget-object v0, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpans(IILjava/lang/Class;)[Ljava/lang/Object;
    .locals 1

    .line 213
    iget-object v0, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final indexOf(CI)I
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 80
    invoke-virtual {p0, p1, p2, v0}, Ll/ܶ۟ᩳ;->indexOf(CII)I

    move-result p1

    return p1
.end method

.method public final indexOf(CII)I
    .locals 5

    const/4 v0, 0x0

    .line 85
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 30
    iget-object v0, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 86
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    const/4 v0, -0x1

    if-lt p2, p3, :cond_0

    return v0

    .line 90
    :cond_0
    iget v1, p0, Ll/ܶ۟ᩳ;->᩶:I

    if-lt p2, v1, :cond_3

    iget v1, p0, Ll/ܶ۟ᩳ;->᩹:I

    if-ge p2, v1, :cond_3

    .line 91
    iget-object v2, p0, Ll/ܶ۟ᩳ;->᩸:[C

    .line 92
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v3, p0, Ll/ܶ۟ᩳ;->᩶:I

    sub-int/2addr v1, v3

    sub-int/2addr p2, v3

    :goto_0
    if-ge p2, v1, :cond_2

    .line 94
    aget-char v3, v2, p2

    if-ne v3, p1, :cond_1

    .line 95
    iget p1, p0, Ll/ܶ۟ᩳ;->᩶:I

    add-int/2addr p1, p2

    return p1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 98
    :cond_2
    iget p2, p0, Ll/ܶ۟ᩳ;->᩹:I

    :cond_3
    :goto_1
    if-ge p2, p3, :cond_6

    int-to-long v1, p2

    const-wide/16 v3, 0x400

    add-long/2addr v1, v3

    int-to-long v3, p3

    .line 101
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    invoke-direct {p0, p2, v2}, Ll/ܶ۟ᩳ;->֫(II)V

    .line 103
    iget-object v1, p0, Ll/ܶ۟ᩳ;->᩸:[C

    .line 104
    iget v2, p0, Ll/ܶ۟ᩳ;->᩹:I

    sub-int/2addr v2, p2

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_5

    .line 106
    aget-char v4, v1, v3

    if-ne v4, p1, :cond_4

    add-int/2addr p2, v3

    return p2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    add-int/2addr p2, v2

    goto :goto_1

    :cond_6
    return v0
.end method

.method public final lastIndexOf(CII)I
    .locals 6

    const/4 v0, 0x0

    .line 121
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/lit8 p3, p3, -0x1

    .line 30
    iget-object v1, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 122
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    const/4 v1, -0x1

    if-ge p3, p2, :cond_0

    return v1

    .line 126
    :cond_0
    iget v2, p0, Ll/ܶ۟ᩳ;->᩶:I

    if-lt p3, v2, :cond_3

    iget v3, p0, Ll/ܶ۟ᩳ;->᩹:I

    if-ge p3, v3, :cond_3

    .line 127
    iget-object v3, p0, Ll/ܶ۟ᩳ;->᩸:[C

    sub-int v2, p2, v2

    .line 128
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 129
    iget v4, p0, Ll/ܶ۟ᩳ;->᩶:I

    sub-int/2addr p3, v4

    :goto_0
    if-lt p3, v2, :cond_2

    .line 130
    aget-char v4, v3, p3

    if-ne v4, p1, :cond_1

    .line 131
    iget p1, p0, Ll/ܶ۟ᩳ;->᩶:I

    goto :goto_2

    :cond_1
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    .line 134
    :cond_2
    iget p3, p0, Ll/ܶ۟ᩳ;->᩶:I

    move-object v2, p0

    goto :goto_3

    :cond_3
    move-object v2, p0

    :goto_1
    if-lt p3, p2, :cond_6

    add-int/lit16 v3, p3, -0x3ff

    .line 137
    invoke-static {v3, p2}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 p3, p3, 0x1

    invoke-direct {v2, v3, p3}, Ll/ܶ۟ᩳ;->֫(II)V

    .line 139
    iget-object v3, v2, Ll/ܶ۟ᩳ;->᩸:[C

    .line 140
    iget v4, v2, Ll/ܶ۟ᩳ;->᩶:I

    sub-int/2addr p3, v4

    sub-int v4, p2, v4

    .line 141
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    :cond_4
    add-int/lit8 p3, p3, -0x1

    if-lt p3, v4, :cond_5

    .line 143
    aget-char v5, v3, p3

    if-ne v5, p1, :cond_4

    .line 144
    iget p1, v2, Ll/ܶ۟ᩳ;->᩶:I

    :goto_2
    add-int/2addr p1, p3

    return p1

    .line 147
    :cond_5
    iget p3, v2, Ll/ܶ۟ᩳ;->᩶:I

    :goto_3
    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    :cond_6
    return v1
.end method

.method public final length()I
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0
.end method

.method public final nextSpanTransition(IILjava/lang/Class;)I
    .locals 1

    .line 233
    iget-object v0, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result p1

    return p1
.end method

.method public final removeSpan(Ljava/lang/Object;)V
    .locals 1

    .line 243
    iget-object v0, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v0, p1}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    return-void
.end method

.method public final reset()V
    .locals 1

    const/4 v0, 0x0

    .line 207
    iput v0, p0, Ll/ܶ۟ᩳ;->᩹:I

    iput v0, p0, Ll/ܶ۟ᩳ;->᩶:I

    const/4 v0, -0x1

    .line 208
    iput v0, p0, Ll/ܶ۟ᩳ;->ۙ:I

    return-void
.end method

.method public final setSpan(Ljava/lang/Object;III)V
    .locals 1

    .line 238
    iget-object v0, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 4

    .line 184
    iget v0, p0, Ll/ܶ۟ᩳ;->᩶:I

    if-gt v0, p1, :cond_0

    iget v1, p0, Ll/ܶ۟ᩳ;->᩹:I

    if-gt p2, v1, :cond_0

    sub-int/2addr p1, v0

    sub-int/2addr p2, v0

    .line 187
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ܶ۟ᩳ;->᩸:[C

    sub-int/2addr p2, p1

    invoke-direct {v0, v1, p1, p2}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    :cond_0
    sub-int v0, p2, p1

    .line 189
    new-array v1, v0, [C

    .line 49
    iget-object v2, p0, Ll/ܶ۟ᩳ;->ۗ:Ll/᩶᩸ᩳ;

    const/4 v3, 0x0

    invoke-interface {v2, p1, p2, v1, v3}, Ll/᩶᩸ᩳ;->ۧ(II[CI)V

    .line 191
    new-instance p1, Ll/᩹᩸ᩳ;

    .line 13
    invoke-direct {p1, v1, v3, v0}, Ll/᩹᩸ᩳ;-><init>([CII)V

    return-object p1
.end method
