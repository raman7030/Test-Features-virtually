.class public final Ll/۬ۡ֡;
.super Ljava/io/Reader;
.source "B2YE"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x33aef9076e3a9d04L


# instance fields
.field public ۙ:I

.field public ᩶:I

.field public final ᩸:Ljava/lang/CharSequence;

.field public final ᩹:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .line 127
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    .line 137
    :goto_0
    iput-object p1, p0, Ll/۬ۡ֡;->᩸:Ljava/lang/CharSequence;

    const p1, 0x7fffffff

    .line 139
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/۬ۡ֡;->᩹:Ljava/lang/Integer;

    const/4 p1, 0x0

    .line 141
    iput p1, p0, Ll/۬ۡ֡;->᩶:I

    .line 142
    iput p1, p0, Ll/۬ۡ֡;->ۙ:I

    return-void
.end method

.method private ֫()I
    .locals 2

    .line 164
    iget-object v0, p0, Ll/۬ۡ֡;->᩸:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget-object v1, p0, Ll/۬ۡ֡;->᩹:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const v1, 0x7fffffff

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 150
    iput v0, p0, Ll/۬ۡ֡;->᩶:I

    .line 151
    iput v0, p0, Ll/۬ۡ֡;->ۙ:I

    return-void
.end method

.method public final mark(I)V
    .locals 0

    .line 174
    iget p1, p0, Ll/۬ۡ֡;->᩶:I

    iput p1, p0, Ll/۬ۡ֡;->ۙ:I

    return-void
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final read()I
    .locals 2

    .line 195
    iget v0, p0, Ll/۬ۡ֡;->᩶:I

    invoke-direct {p0}, Ll/۬ۡ֡;->֫()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 198
    :cond_0
    iget v0, p0, Ll/۬ۡ֡;->᩶:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/۬ۡ֡;->᩶:I

    iget-object v1, p0, Ll/۬ۡ֡;->᩸:Ljava/lang/CharSequence;

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    return v0
.end method

.method public final read([CII)I
    .locals 5

    .line 212
    iget v0, p0, Ll/۬ۡ֡;->᩶:I

    invoke-direct {p0}, Ll/۬ۡ֡;->֫()I

    move-result v1

    const/4 v2, -0x1

    if-lt v0, v1, :cond_0

    return v2

    :cond_0
    const-string v0, "array"

    .line 215
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    if-ltz p3, :cond_6

    if-ltz p2, :cond_6

    add-int v0, p2, p3

    .line 216
    array-length v1, p1

    if-gt v0, v1, :cond_6

    .line 221
    iget-object v0, p0, Ll/۬ۡ֡;->᩸:Ljava/lang/CharSequence;

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 222
    invoke-direct {p0}, Ll/۬ۡ֡;->֫()I

    move-result v1

    iget v2, p0, Ll/۬ۡ֡;->᩶:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 223
    check-cast v0, Ljava/lang/String;

    iget v1, p0, Ll/۬ۡ֡;->᩶:I

    add-int v2, v1, p3

    invoke-virtual {v0, v1, v2, p1, p2}, Ljava/lang/String;->getChars(II[CI)V

    .line 224
    iget p1, p0, Ll/۬ۡ֡;->᩶:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/۬ۡ֡;->᩶:I

    return p3

    .line 227
    :cond_1
    instance-of v1, v0, Ljava/lang/StringBuilder;

    if-eqz v1, :cond_2

    .line 228
    invoke-direct {p0}, Ll/۬ۡ֡;->֫()I

    move-result v1

    iget v2, p0, Ll/۬ۡ֡;->᩶:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 229
    check-cast v0, Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۬ۡ֡;->᩶:I

    add-int v2, v1, p3

    invoke-virtual {v0, v1, v2, p1, p2}, Ljava/lang/StringBuilder;->getChars(II[CI)V

    .line 230
    iget p1, p0, Ll/۬ۡ֡;->᩶:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/۬ۡ֡;->᩶:I

    return p3

    .line 233
    :cond_2
    instance-of v1, v0, Ljava/lang/StringBuffer;

    if-eqz v1, :cond_3

    .line 234
    invoke-direct {p0}, Ll/۬ۡ֡;->֫()I

    move-result v1

    iget v2, p0, Ll/۬ۡ֡;->᩶:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 235
    check-cast v0, Ljava/lang/StringBuffer;

    iget v1, p0, Ll/۬ۡ֡;->᩶:I

    add-int v2, v1, p3

    invoke-virtual {v0, v1, v2, p1, p2}, Ljava/lang/StringBuffer;->getChars(II[CI)V

    .line 236
    iget p1, p0, Ll/۬ۡ֡;->᩶:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/۬ۡ֡;->᩶:I

    return p3

    :cond_3
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p3, :cond_5

    .line 242
    invoke-virtual {p0}, Ll/۬ۡ֡;->read()I

    move-result v3

    if-ne v3, v2, :cond_4

    goto :goto_1

    :cond_4
    add-int v4, p2, v0

    int-to-char v3, v3

    .line 246
    aput-char v3, p1, v4

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    return v1

    .line 217
    :cond_6
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Array Size="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p1, p1

    const-string v2, ", offset="

    const-string v3, ", length="

    .line 0
    invoke-static {v1, p1, v2, p2, v3}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 217
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ready()Z
    .locals 2

    .line 259
    iget v0, p0, Ll/۬ۡ֡;->᩶:I

    invoke-direct {p0}, Ll/۬ۡ֡;->֫()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final reset()V
    .locals 1

    .line 268
    iget v0, p0, Ll/۬ۡ֡;->ۙ:I

    iput v0, p0, Ll/۬ۡ֡;->᩶:I

    return-void
.end method

.method public final skip(J)J
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 282
    iget v2, p0, Ll/۬ۡ֡;->᩶:I

    invoke-direct {p0}, Ll/۬ۡ֡;->֫()I

    move-result v3

    if-lt v2, v3, :cond_0

    return-wide v0

    .line 285
    :cond_0
    invoke-direct {p0}, Ll/۬ۡ֡;->֫()I

    move-result v0

    int-to-long v0, v0

    iget v2, p0, Ll/۬ۡ֡;->᩶:I

    int-to-long v2, v2

    add-long/2addr v2, p1

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    .line 286
    iget p1, p0, Ll/۬ۡ֡;->᩶:I

    sub-int p1, p2, p1

    .line 287
    iput p2, p0, Ll/۬ۡ֡;->᩶:I

    int-to-long p1, p1

    return-wide p1

    .line 280
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Number of characters to skip is less than zero: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 280
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 297
    iget-object v0, p0, Ll/۬ۡ֡;->᩸:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 308
    invoke-direct {p0}, Ll/۬ۡ֡;->֫()I

    move-result v2

    invoke-interface {v0, v1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
