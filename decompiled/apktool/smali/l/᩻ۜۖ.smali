.class public Ll/᩻ۜۖ;
.super Ljava/lang/Object;
.source "ZAYS"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final ֫֫:Ljava/util/regex/Pattern;

.field public static final ۟:[Ljava/lang/String;

.field public static final ܰ:[Ljava/lang/String;


# instance fields
.field public ۗ:Z

.field public ۙ:Ll/᩸ܽۖ;

.field public ۛ:I

.field public ۤ:[I

.field public ۨ:Ll/ܺᩳۖ;

.field public ۫:Z

.field public final ۬:Ljava/io/Writer;

.field public ᩶:Ljava/lang/String;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;

.field public ᩺:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-string v0, "-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?"

    .line 167
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩻ۜۖ;->֫֫:Ljava/util/regex/Pattern;

    const/16 v0, 0x80

    new-array v0, v0, [Ljava/lang/String;

    .line 183
    sput-object v0, Ll/᩻ۜۖ;->۟:[Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x1f

    if-gt v1, v2, :cond_0

    .line 185
    sget-object v2, Ll/᩻ۜۖ;->۟:[Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v0

    const-string v3, "\\u%04x"

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 187
    :cond_0
    sget-object v0, Ll/᩻ۜۖ;->۟:[Ljava/lang/String;

    const/16 v1, 0x22

    const-string v2, "\\\""

    aput-object v2, v0, v1

    const/16 v1, 0x5c

    const-string v2, "\\\\"

    .line 188
    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "\\t"

    .line 189
    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "\\b"

    .line 190
    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "\\n"

    .line 191
    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "\\r"

    .line 192
    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "\\f"

    .line 193
    aput-object v2, v0, v1

    .line 194
    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    sput-object v0, Ll/᩻ۜۖ;->ܰ:[Ljava/lang/String;

    const/16 v1, 0x3c

    const-string v2, "\\u003c"

    .line 195
    aput-object v2, v0, v1

    const/16 v1, 0x3e

    const-string v2, "\\u003e"

    .line 196
    aput-object v2, v0, v1

    const/16 v1, 0x26

    const-string v2, "\\u0026"

    .line 197
    aput-object v2, v0, v1

    const/16 v1, 0x3d

    const-string v2, "\\u003d"

    .line 198
    aput-object v2, v0, v1

    const/16 v1, 0x27

    const-string v2, "\\u0027"

    .line 199
    aput-object v2, v0, v1

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;)V
    .locals 3

    .line 232
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    new-array v0, v0, [I

    .line 205
    iput-object v0, p0, Ll/᩻ۜۖ;->ۤ:[I

    const/4 v1, 0x0

    .line 206
    iput v1, p0, Ll/᩻ۜۖ;->ۛ:I

    .line 474
    array-length v2, v0

    if-nez v2, :cond_0

    .line 475
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۜۖ;->ۤ:[I

    .line 477
    :cond_0
    iget-object v0, p0, Ll/᩻ۜۖ;->ۤ:[I

    iget v1, p0, Ll/᩻ۜۖ;->ۛ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩻ۜۖ;->ۛ:I

    const/4 v2, 0x6

    aput v2, v0, v1

    .line 219
    sget-object v0, Ll/ܺᩳۖ;->᩹:Ll/ܺᩳۖ;

    iput-object v0, p0, Ll/᩻ۜۖ;->ۨ:Ll/ܺᩳۖ;

    const/4 v0, 0x1

    .line 225
    iput-boolean v0, p0, Ll/᩻ۜۖ;->۫:Z

    const-string v0, "out == null"

    .line 233
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    .line 234
    sget-object p1, Ll/᩸ܽۖ;->ᩳ:Ll/᩸ܽۖ;

    invoke-virtual {p0, p1}, Ll/᩻ۜۖ;->֫(Ll/᩸ܽۖ;)V

    return-void
.end method

.method private ֡()I
    .locals 2

    .line 482
    iget v0, p0, Ll/᩻ۜۖ;->ۛ:I

    if-eqz v0, :cond_0

    .line 485
    iget-object v1, p0, Ll/᩻ۜۖ;->ۤ:[I

    add-int/lit8 v0, v0, -0x1

    aget v0, v1, v0

    return v0

    .line 483
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֫(CII)V
    .locals 1

    .line 457
    invoke-direct {p0}, Ll/᩻ۜۖ;->֡()I

    move-result v0

    if-eq v0, p3, :cond_1

    if-ne v0, p2, :cond_0

    goto :goto_0

    .line 459
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Nesting problem."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 461
    :cond_1
    :goto_0
    iget-object p2, p0, Ll/᩻ۜۖ;->᩸:Ljava/lang/String;

    if-nez p2, :cond_3

    .line 465
    iget p2, p0, Ll/᩻ۜۖ;->ۛ:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Ll/᩻ۜۖ;->ۛ:I

    if-ne v0, p3, :cond_2

    .line 467
    invoke-direct {p0}, Ll/᩻ۜۖ;->᩵()V

    .line 469
    :cond_2
    iget-object p2, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(I)V

    return-void

    .line 462
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Dangling name: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Ll/᩻ۜۖ;->᩸:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ܶ()V
    .locals 3

    .line 514
    iget-object v0, p0, Ll/᩻ۜۖ;->᩸:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 792
    invoke-direct {p0}, Ll/᩻ۜۖ;->֡()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 794
    iget-object v0, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    iget-object v1, p0, Ll/᩻ۜۖ;->᩶:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 798
    :goto_0
    invoke-direct {p0}, Ll/᩻ۜۖ;->᩵()V

    .line 490
    iget-object v0, p0, Ll/᩻ۜۖ;->ۤ:[I

    iget v1, p0, Ll/᩻ۜۖ;->ۛ:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x4

    aput v2, v0, v1

    .line 516
    iget-object v0, p0, Ll/᩻ۜۖ;->᩸:Ljava/lang/String;

    invoke-direct {p0, v0}, Ll/᩻ۜۖ;->ᩳ(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 517
    iput-object v0, p0, Ll/᩻ۜۖ;->᩸:Ljava/lang/String;

    return-void

    .line 796
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Nesting problem."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method private ᩳ(Ljava/lang/String;)V
    .locals 8

    .line 745
    iget-boolean v0, p0, Ll/᩻ۜۖ;->ۗ:Z

    if-eqz v0, :cond_0

    sget-object v0, Ll/᩻ۜۖ;->ܰ:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Ll/᩻ۜۖ;->۟:[Ljava/lang/String;

    .line 746
    :goto_0
    iget-object v1, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 748
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v4, v3, :cond_6

    .line 750
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x80

    if-ge v6, v7, :cond_1

    .line 753
    aget-object v6, v0, v6

    if-nez v6, :cond_3

    goto :goto_3

    :cond_1
    const/16 v7, 0x2028

    if-ne v6, v7, :cond_2

    const-string v6, "\\u2028"

    goto :goto_2

    :cond_2
    const/16 v7, 0x2029

    if-ne v6, v7, :cond_5

    const-string v6, "\\u2029"

    :cond_3
    :goto_2
    if-ge v5, v4, :cond_4

    sub-int v7, v4, v5

    .line 765
    invoke-virtual {v1, p1, v5, v7}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    .line 767
    :cond_4
    invoke-virtual {v1, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v5, v4, 0x1

    :cond_5
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    if-ge v5, v3, :cond_7

    sub-int/2addr v3, v5

    .line 771
    invoke-virtual {v1, p1, v5, v3}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    .line 773
    :cond_7
    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method private ᩴ()V
    .locals 4

    .line 808
    invoke-direct {p0}, Ll/᩻ۜۖ;->֡()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    iget-object v3, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    const/4 v3, 0x7

    if-eq v0, v1, :cond_2

    if-ne v0, v3, :cond_1

    .line 810
    iget-object v0, p0, Ll/᩻ۜۖ;->ۨ:Ll/ܺᩳۖ;

    sget-object v1, Ll/ܺᩳۖ;->᩶:Ll/ܺᩳۖ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 811
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JSON must have only one top-level value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 834
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Nesting problem."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 490
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/᩻ۜۖ;->ۤ:[I

    iget v1, p0, Ll/᩻ۜۖ;->ۛ:I

    sub-int/2addr v1, v2

    aput v3, v0, v1

    return-void

    .line 829
    :cond_3
    iget-object v0, p0, Ll/᩻ۜۖ;->᩹:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 490
    iget-object v0, p0, Ll/᩻ۜۖ;->ۤ:[I

    iget v1, p0, Ll/᩻ۜۖ;->ۛ:I

    sub-int/2addr v1, v2

    const/4 v2, 0x5

    aput v2, v0, v1

    return-void

    .line 824
    :cond_4
    iget-object v0, p0, Ll/᩻ۜۖ;->᩶:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 825
    invoke-direct {p0}, Ll/᩻ۜۖ;->᩵()V

    return-void

    .line 490
    :cond_5
    iget-object v0, p0, Ll/᩻ۜۖ;->ۤ:[I

    iget v3, p0, Ll/᩻ۜۖ;->ۛ:I

    sub-int/2addr v3, v2

    aput v1, v0, v3

    .line 820
    invoke-direct {p0}, Ll/᩻ۜۖ;->᩵()V

    return-void
.end method

.method private ᩵()V
    .locals 4

    .line 777
    iget-boolean v0, p0, Ll/᩻ۜۖ;->᩺:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 781
    :cond_0
    iget-object v0, p0, Ll/᩻ۜۖ;->ۙ:Ll/᩸ܽۖ;

    invoke-virtual {v0}, Ll/᩸ܽۖ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 782
    iget v0, p0, Ll/᩻ۜۖ;->ۛ:I

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v0, :cond_1

    .line 783
    iget-object v3, p0, Ll/᩻ۜۖ;->ۙ:Ll/᩸ܽۖ;

    invoke-virtual {v3}, Ll/᩸ܽۖ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 721
    iget-object v0, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 723
    iget v0, p0, Ll/᩻ۜۖ;->ۛ:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    .line 724
    iget-object v2, p0, Ll/᩻ۜۖ;->ۤ:[I

    sub-int/2addr v0, v1

    aget v0, v2, v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 727
    iput v0, p0, Ll/᩻ۜۖ;->ۛ:I

    return-void

    .line 725
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public flush()V
    .locals 2

    .line 708
    iget v0, p0, Ll/᩻ۜۖ;->ۛ:I

    if-eqz v0, :cond_0

    .line 711
    iget-object v0, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    return-void

    .line 709
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ֫()V
    .locals 3

    .line 409
    invoke-direct {p0}, Ll/᩻ۜۖ;->ܶ()V

    .line 448
    invoke-direct {p0}, Ll/᩻ۜۖ;->ᩴ()V

    .line 474
    iget v0, p0, Ll/᩻ۜۖ;->ۛ:I

    iget-object v1, p0, Ll/᩻ۜۖ;->ۤ:[I

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x2

    .line 475
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۜۖ;->ۤ:[I

    .line 477
    :cond_0
    iget-object v0, p0, Ll/᩻ۜۖ;->ۤ:[I

    iget v1, p0, Ll/᩻ۜۖ;->ۛ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩻ۜۖ;->ۛ:I

    const/4 v2, 0x1

    aput v2, v0, v1

    .line 450
    iget-object v0, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public ֫(D)V
    .locals 3

    .line 600
    invoke-direct {p0}, Ll/᩻ۜۖ;->ܶ()V

    .line 601
    iget-object v0, p0, Ll/᩻ۜۖ;->ۨ:Ll/ܺᩳۖ;

    sget-object v1, Ll/ܺᩳۖ;->᩶:Ll/ܺᩳۖ;

    if-eq v0, v1, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 602
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Numeric values must be finite, but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 604
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/᩻ۜۖ;->ᩴ()V

    .line 605
    iget-object v0, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-void
.end method

.method public ֫(Ljava/lang/Boolean;)V
    .locals 1

    if-nez p1, :cond_0

    .line 560
    invoke-virtual {p0}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 562
    :cond_0
    invoke-direct {p0}, Ll/᩻ۜۖ;->ܶ()V

    .line 563
    invoke-direct {p0}, Ll/᩻ۜۖ;->ᩴ()V

    .line 564
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "true"

    goto :goto_0

    :cond_1
    const-string p1, "false"

    :goto_0
    iget-object v0, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public ֫(Ljava/lang/Number;)V
    .locals 4

    if-nez p1, :cond_0

    .line 636
    invoke-virtual {p0}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 639
    :cond_0
    invoke-direct {p0}, Ll/᩻ۜۖ;->ܶ()V

    .line 640
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 641
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 734
    const-class v1, Ljava/lang/Integer;

    if-eq p1, v1, :cond_6

    const-class v1, Ljava/lang/Long;

    if-eq p1, v1, :cond_6

    const-class v1, Ljava/lang/Byte;

    if-eq p1, v1, :cond_6

    const-class v1, Ljava/lang/Short;

    if-eq p1, v1, :cond_6

    const-class v1, Ljava/math/BigDecimal;

    if-eq p1, v1, :cond_6

    const-class v1, Ljava/math/BigInteger;

    if-eq p1, v1, :cond_6

    const-class v1, Ljava/util/concurrent/atomic/AtomicInteger;

    if-eq p1, v1, :cond_6

    const-class v1, Ljava/util/concurrent/atomic/AtomicLong;

    if-ne p1, v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "-Infinity"

    .line 645
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "Infinity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "NaN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 649
    :cond_2
    const-class v1, Ljava/lang/Float;

    if-eq p1, v1, :cond_6

    const-class v1, Ljava/lang/Double;

    if-eq p1, v1, :cond_6

    sget-object v1, Ll/᩻ۜۖ;->֫֫:Ljava/util/regex/Pattern;

    .line 651
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 652
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "String created by "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a valid JSON number: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 646
    :cond_4
    :goto_0
    iget-object p1, p0, Ll/᩻ۜۖ;->ۨ:Ll/ܺᩳۖ;

    sget-object v1, Ll/ܺᩳۖ;->᩶:Ll/ܺᩳۖ;

    if-ne p1, v1, :cond_5

    goto :goto_1

    .line 647
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Numeric values must be finite, but was "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 657
    :cond_6
    :goto_1
    invoke-direct {p0}, Ll/᩻ۜۖ;->ᩴ()V

    .line 658
    iget-object p1, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-void
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 2

    const-string v0, "name == null"

    .line 501
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 502
    iget-object v0, p0, Ll/᩻ۜۖ;->᩸:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 505
    invoke-direct {p0}, Ll/᩻ۜۖ;->֡()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 507
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Please begin an object before writing a name."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 509
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/᩻ۜۖ;->᩸:Ljava/lang/String;

    return-void

    .line 503
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already wrote a name, expecting a value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܺᩳۖ;)V
    .locals 0

    .line 347
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/᩻ۜۖ;->ۨ:Ll/ܺᩳۖ;

    return-void
.end method

.method public final ֫(Ll/᩸ܽۖ;)V
    .locals 1

    .line 268
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/᩻ۜۖ;->ۙ:Ll/᩸ܽۖ;

    const-string v0, ","

    .line 270
    iput-object v0, p0, Ll/᩻ۜۖ;->᩶:Ljava/lang/String;

    .line 271
    invoke-virtual {p1}, Ll/᩸ܽۖ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, ": "

    .line 272
    iput-object p1, p0, Ll/᩻ۜۖ;->᩹:Ljava/lang/String;

    .line 275
    iget-object p1, p0, Ll/᩻ۜۖ;->ۙ:Ll/᩸ܽۖ;

    invoke-virtual {p1}, Ll/᩸ܽۖ;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, ", "

    .line 276
    iput-object p1, p0, Ll/᩻ۜۖ;->᩶:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p1, ":"

    .line 279
    iput-object p1, p0, Ll/᩻ۜۖ;->᩹:Ljava/lang/String;

    .line 282
    :cond_1
    :goto_0
    iget-object p1, p0, Ll/᩻ۜۖ;->ۙ:Ll/᩸ܽۖ;

    .line 283
    invoke-virtual {p1}, Ll/᩸ܽۖ;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/᩻ۜۖ;->ۙ:Ll/᩸ܽۖ;

    invoke-virtual {p1}, Ll/᩸ܽۖ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput-boolean p1, p0, Ll/᩻ۜۖ;->᩺:Z

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 369
    iput-boolean p1, p0, Ll/᩻ۜۖ;->ۗ:Z

    return-void
.end method

.method public final ۖ()Z
    .locals 1

    .line 378
    iget-boolean v0, p0, Ll/᩻ۜۖ;->ۗ:Z

    return v0
.end method

.method public ۘ()Ll/᩻ۜۖ;
    .locals 2

    .line 669
    iget-object v0, p0, Ll/᩻ۜۖ;->᩸:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 670
    iget-boolean v0, p0, Ll/᩻ۜۖ;->۫:Z

    if-eqz v0, :cond_0

    .line 671
    invoke-direct {p0}, Ll/᩻ۜۖ;->ܶ()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 673
    iput-object v0, p0, Ll/᩻ۜۖ;->᩸:Ljava/lang/String;

    return-object p0

    .line 677
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/᩻ۜۖ;->ᩴ()V

    .line 678
    iget-object v0, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public final ۜ()Ll/ܺᩳۖ;
    .locals 1

    .line 357
    iget-object v0, p0, Ll/᩻ۜۖ;->ۨ:Ll/ܺᩳۖ;

    return-object v0
.end method

.method public ۧ(J)V
    .locals 1

    .line 616
    invoke-direct {p0}, Ll/᩻ۜۖ;->ܶ()V

    .line 617
    invoke-direct {p0}, Ll/᩻ۜۖ;->ᩴ()V

    .line 618
    iget-object v0, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public ۧ(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    .line 530
    invoke-virtual {p0}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 532
    :cond_0
    invoke-direct {p0}, Ll/᩻ۜۖ;->ܶ()V

    .line 533
    invoke-direct {p0}, Ll/᩻ۜۖ;->ᩴ()V

    .line 534
    invoke-direct {p0, p1}, Ll/᩻ۜۖ;->ᩳ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 388
    iput-boolean p1, p0, Ll/᩻ۜۖ;->۫:Z

    return-void
.end method

.method public ܳ()V
    .locals 3

    const/4 v0, 0x5

    const/16 v1, 0x7d

    const/4 v2, 0x3

    .line 442
    invoke-direct {p0, v1, v2, v0}, Ll/᩻ۜۖ;->֫(CII)V

    return-void
.end method

.method public ܽ()V
    .locals 3

    .line 431
    invoke-direct {p0}, Ll/᩻ۜۖ;->ܶ()V

    .line 448
    invoke-direct {p0}, Ll/᩻ۜۖ;->ᩴ()V

    .line 474
    iget v0, p0, Ll/᩻ۜۖ;->ۛ:I

    iget-object v1, p0, Ll/᩻ۜۖ;->ۤ:[I

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x2

    .line 475
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۜۖ;->ۤ:[I

    .line 477
    :cond_0
    iget-object v0, p0, Ll/᩻ۜۖ;->ۤ:[I

    iget v1, p0, Ll/᩻ۜۖ;->ۛ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩻ۜۖ;->ۛ:I

    const/4 v2, 0x3

    aput v2, v0, v1

    .line 450
    iget-object v0, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public ܽ(Z)V
    .locals 1

    .line 545
    invoke-direct {p0}, Ll/᩻ۜۖ;->ܶ()V

    .line 546
    invoke-direct {p0}, Ll/᩻ۜۖ;->ᩴ()V

    if-eqz p1, :cond_0

    const-string p1, "true"

    goto :goto_0

    :cond_0
    const-string p1, "false"

    .line 547
    :goto_0
    iget-object v0, p0, Ll/᩻ۜۖ;->۬:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public ᩳ()V
    .locals 3

    const/4 v0, 0x2

    const/16 v1, 0x5d

    const/4 v2, 0x1

    .line 420
    invoke-direct {p0, v1, v2, v0}, Ll/᩻ۜۖ;->֫(CII)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 398
    iget-boolean v0, p0, Ll/᩻ۜۖ;->۫:Z

    return v0
.end method
