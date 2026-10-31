.class public final Ll/ۗ᩹ᩳ;
.super Ljava/lang/Object;
.source "C8OA"

# interfaces
.implements Ljava/lang/Appendable;
.implements Ljava/lang/CharSequence;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/᩷۠ᩴ;

.field public ۙ:I

.field public final ۛ:I

.field public ۤ:Ll/᩸۬ᩳ;

.field public ۫:[C

.field public ۬:Ljava/lang/StringBuilder;

.field public ᩶:Z

.field public ᩸:Ll/ۜ᩹ᩳ;

.field public final ᩹:Ll/֨۬ᩳ;


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;I)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    if-ltz p3, :cond_0

    .line 28
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۗ᩹ᩳ;->ۗ:Ll/᩷۠ᩴ;

    .line 29
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ۗ᩹ᩳ;->᩹:Ll/֨۬ᩳ;

    .line 30
    iput p3, p0, Ll/ۗ᩹ᩳ;->ۛ:I

    return-void

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative output threshold"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private flush()V
    .locals 3

    .line 145
    iget v0, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    if-nez v0, :cond_0

    return-void

    .line 146
    :cond_0
    iget-object v1, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    iget-object v2, p0, Ll/ۗ᩹ᩳ;->۫:[C

    invoke-virtual {v1, v2, v0}, Ll/ۜ᩹ᩳ;->֫([CI)V

    .line 147
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۜ᩹ᩳ;->ܽ()V

    const/4 v0, 0x0

    .line 148
    iput v0, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    return-void
.end method

.method private ֫()V
    .locals 5

    .line 117
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->ۗ:Ll/᩷۠ᩴ;

    iget-object v1, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    new-array v2, v1, [Ll/᩹۠ᩴ;

    .line 119
    invoke-static {v0, v2}, Ll/ܿ۠ᩴ;->createDirectories(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)Ll/᩷۠ᩴ;

    const-string v2, "format-"

    const-string v3, ".pages"

    new-array v4, v1, [Ll/᩹۠ᩴ;

    .line 120
    invoke-static {v0, v2, v3, v4}, Ll/ܿ۠ᩴ;->createTempFile(Ll/᩷۠ᩴ;Ljava/lang/String;Ljava/lang/String;[Ll/᩹۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7

    .line 123
    :try_start_1
    new-instance v2, Ll/ۙ᩹ᩳ;

    invoke-direct {v2, v0}, Ll/ۙ᩹ᩳ;-><init>(Ll/᩷۠ᩴ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_4

    .line 129
    :try_start_2
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->᩹:Ll/֨۬ᩳ;

    invoke-static {v2, v0}, Ll/᩸۬ᩳ;->֫(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;)Ll/᩸۬ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۗ᩹ᩳ;->ۤ:Ll/᩸۬ᩳ;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    .line 134
    :try_start_3
    new-instance v2, Ll/ۜ᩹ᩳ;

    invoke-direct {v2, v0}, Ll/ۜ᩹ᩳ;-><init>(Ll/᩸۬ᩳ;)V

    iput-object v2, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    const/16 v0, 0x800

    new-array v0, v0, [C

    .line 135
    iput-object v0, p0, Ll/ۗ᩹ᩳ;->۫:[C

    .line 136
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    .line 137
    iput-object v2, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    if-nez v0, :cond_1

    const-string v0, "null"

    .line 64
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Ll/ۗ᩹ᩳ;->append(Ljava/lang/CharSequence;II)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_7

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    .line 131
    :goto_0
    :try_start_4
    invoke-virtual {v2}, Ll/ۙ᩹ᩳ;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_1

    :catch_3
    move-exception v1

    :try_start_5
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 132
    :goto_1
    throw v0

    :catch_4
    move-exception v1

    goto :goto_2

    :catch_5
    move-exception v1

    goto :goto_2

    :catch_6
    move-exception v1

    .line 125
    :goto_2
    invoke-static {v0}, Ll/ܿ۠ᩴ;->deleteIfExists(Ll/᩷۠ᩴ;)Z

    .line 126
    throw v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_7

    :catch_7
    move-exception v0

    .line 140
    new-instance v1, Ljava/io/UncheckedIOException;

    invoke-direct {v1, v0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method


# virtual methods
.method public final bridge synthetic append(C)Ljava/lang/Appendable;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Ll/ۗ᩹ᩳ;->append(C)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "null"

    :cond_0
    const/4 v0, 0x0

    .line 64
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۗ᩹ᩳ;->append(Ljava/lang/CharSequence;II)V

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    .line 14
    invoke-virtual {p0, p1, p2, p3}, Ll/ۗ᩹ᩳ;->append(Ljava/lang/CharSequence;II)V

    return-object p0
.end method

.method public final append(C)V
    .locals 3

    .line 51
    invoke-virtual {p0}, Ll/ۗ᩹ᩳ;->length()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_2

    .line 53
    iget-object v1, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    iget v2, p0, Ll/ۗ᩹ᩳ;->ۛ:I

    if-ge v0, v2, :cond_0

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 55
    :cond_0
    invoke-direct {p0}, Ll/ۗ᩹ᩳ;->֫()V

    .line 56
    iget v0, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    iget-object v1, p0, Ll/ۗ᩹ᩳ;->۫:[C

    array-length v1, v1

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Ll/ۗ᩹ᩳ;->flush()V

    .line 57
    :cond_1
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->۫:[C

    iget v1, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    aput-char p1, v0, v1

    return-void

    .line 52
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Output is too large"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final append(Ljava/lang/CharSequence;II)V
    .locals 5

    if-nez p1, :cond_0

    const-string p1, "null"

    .line 69
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p2, p3, v0}, Ll/ۨ᩹ᩳ;->֫(III)V

    sub-int v0, p3, p2

    const v1, 0x7fffffff

    .line 70
    invoke-virtual {p0}, Ll/ۗ᩹ᩳ;->length()I

    move-result v2

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_7

    .line 71
    iget-object v1, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    if-eqz v1, :cond_1

    iget v2, p0, Ll/ۗ᩹ᩳ;->ۛ:I

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    sub-int/2addr v2, v1

    if-gt v0, v2, :cond_1

    .line 72
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    return-void

    .line 75
    :cond_1
    invoke-direct {p0}, Ll/ۗ᩹ᩳ;->֫()V

    :goto_0
    if-ge p2, p3, :cond_6

    .line 77
    iget v0, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    iget-object v1, p0, Ll/ۗ᩹ᩳ;->۫:[C

    array-length v1, v1

    if-ne v0, v1, :cond_2

    invoke-direct {p0}, Ll/ۗ᩹ᩳ;->flush()V

    :cond_2
    sub-int v0, p3, p2

    .line 78
    iget-object v1, p0, Ll/ۗ᩹ᩳ;->۫:[C

    array-length v1, v1

    iget v2, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 79
    instance-of v1, p1, Ll/۬᩹ᩳ;

    if-eqz v1, :cond_3

    move-object v1, p1

    check-cast v1, Ll/۬᩹ᩳ;

    add-int v2, p2, v0

    iget-object v3, p0, Ll/ۗ᩹ᩳ;->۫:[C

    iget v4, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    invoke-virtual {v1, p2, v2, v3, v4}, Ll/۬᩹ᩳ;->getChars(II[CI)V

    goto :goto_2

    .line 80
    :cond_3
    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_4

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    add-int v2, p2, v0

    iget-object v3, p0, Ll/ۗ᩹ᩳ;->۫:[C

    iget v4, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    invoke-virtual {v1, p2, v2, v3, v4}, Ljava/lang/String;->getChars(II[CI)V

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_5

    .line 81
    iget-object v2, p0, Ll/ۗ᩹ᩳ;->۫:[C

    iget v3, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    add-int/2addr v3, v1

    add-int v4, p2, v1

    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    aput-char v4, v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 82
    :cond_5
    :goto_2
    iget v1, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    add-int/2addr p2, v0

    goto :goto_0

    :cond_6
    return-void

    .line 70
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Output is too large"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final charAt(I)C
    .locals 2

    if-ltz p1, :cond_2

    .line 39
    invoke-virtual {p0}, Ll/ۗ᩹ᩳ;->length()I

    move-result v0

    if-ge p1, v0, :cond_2

    .line 40
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p1

    return p1

    .line 41
    :cond_0
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۜ᩹ᩳ;->ۧ()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 42
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/ۜ᩹ᩳ;->֫(I)C

    move-result p1

    return p1

    :cond_1
    iget-object v1, p0, Ll/ۗ᩹ᩳ;->۫:[C

    sub-int/2addr p1, v0

    aget-char p1, v1, p1

    return p1

    .line 39
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final close()V
    .locals 1

    .line 156
    iget-boolean v0, p0, Ll/ۗ᩹ᩳ;->᩶:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 157
    iput-boolean v0, p0, Ll/ۗ᩹ᩳ;->᩶:Z

    const/4 v0, 0x0

    .line 158
    iput-object v0, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    .line 159
    iput-object v0, p0, Ll/ۗ᩹ᩳ;->۫:[C

    .line 160
    iput-object v0, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    .line 161
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->ۤ:Ll/᩸۬ᩳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->close()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final finish()Ll/۬᩹ᩳ;
    .locals 3

    .line 152
    iget-boolean v0, p0, Ll/ۗ᩹ᩳ;->᩶:Z

    if-nez v0, :cond_2

    .line 103
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    .line 104
    new-instance v0, Ll/ۜ᩹ᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۜ᩹ᩳ;-><init>(Ll/᩸۬ᩳ;)V

    iput-object v0, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    const/16 v0, 0x800

    new-array v0, v0, [C

    .line 105
    iput-object v0, p0, Ll/ۗ᩹ᩳ;->۫:[C

    .line 106
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    .line 107
    iput-object v1, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    if-nez v0, :cond_0

    const-string v0, "null"

    :cond_0
    const/4 v1, 0x0

    .line 64
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Ll/ۗ᩹ᩳ;->append(Ljava/lang/CharSequence;II)V

    .line 110
    :cond_1
    invoke-direct {p0}, Ll/ۗ᩹ᩳ;->flush()V

    .line 111
    new-instance v0, Ll/۬᩹ᩳ;

    iget-object v1, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۜ᩹ᩳ;->֫()Ll/ۨ᩹ᩳ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۬᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;)V

    .line 112
    invoke-virtual {p0}, Ll/ۗ᩹ᩳ;->close()V

    return-object v0

    .line 152
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Text output is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final length()I
    .locals 2

    .line 152
    iget-boolean v0, p0, Ll/ۗ᩹ᩳ;->᩶:Z

    if-nez v0, :cond_1

    .line 35
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۜ᩹ᩳ;->ۧ()I

    move-result v0

    iget v1, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    add-int/2addr v0, v1

    return v0

    .line 152
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Text output is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 47
    new-instance v0, Ll/۬۬ۡ;

    invoke-direct {v0, p1, p2, p0}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 1

    if-ltz p1, :cond_2

    .line 90
    invoke-virtual {p0}, Ll/ۗ᩹ᩳ;->length()I

    move-result v0

    if-gt p1, v0, :cond_2

    .line 91
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->۬:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void

    .line 92
    :cond_0
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۜ᩹ᩳ;->ۧ()I

    move-result v0

    if-lt p1, v0, :cond_1

    iget-object v0, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۜ᩹ᩳ;->ۧ()I

    move-result v0

    sub-int/2addr p1, v0

    iput p1, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    return-void

    .line 94
    :cond_1
    iget-object v0, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/ۜ᩹ᩳ;->ۧ(I)V

    .line 95
    iget-object p1, p0, Ll/ۗ᩹ᩳ;->᩸:Ll/ۜ᩹ᩳ;

    invoke-virtual {p1}, Ll/ۜ᩹ᩳ;->ܽ()V

    const/4 p1, 0x0

    .line 96
    iput p1, p0, Ll/ۗ᩹ᩳ;->ۙ:I

    return-void

    .line 90
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
