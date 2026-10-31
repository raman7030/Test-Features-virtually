.class public final Ll/᩷۫ۡ;
.super Ljava/lang/Object;
.source "1AG9"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public final ᩶:Landroid/text/GetChars;

.field public final ᩸:[C

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۟᩸ᩳ;)V
    .locals 1

    .line 475
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    new-array v0, v0, [C

    .line 471
    iput-object v0, p0, Ll/᩷۫ۡ;->᩸:[C

    .line 476
    iput-object p1, p0, Ll/᩷۫ۡ;->᩶:Landroid/text/GetChars;

    .line 477
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->length()I

    move-result p1

    iput p1, p0, Ll/᩷۫ۡ;->᩹:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷۫ۡ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩷۫ۡ;->ۧ(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷۫ۡ;)[C
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷۫ۡ;->᩸:[C

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩷۫ۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩷۫ۡ;->ۙ:I

    return p0
.end method

.method private ۧ(I)V
    .locals 4

    .line 484
    iget v0, p0, Ll/᩷۫ۡ;->ۗ:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Ll/᩷۫ۡ;->ۙ:I

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    if-ltz p1, :cond_1

    .line 485
    iget v0, p0, Ll/᩷۫ۡ;->᩹:I

    if-ge p1, v0, :cond_1

    .line 486
    iget-object v1, p0, Ll/᩷۫ۡ;->᩸:[C

    array-length v2, v1

    sub-int/2addr v0, p1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v0, p1

    const/4 v2, 0x0

    .line 488
    iput v2, p0, Ll/᩷۫ۡ;->ۙ:I

    iput v2, p0, Ll/᩷۫ۡ;->ۗ:I

    .line 489
    iget-object v3, p0, Ll/᩷۫ۡ;->᩶:Landroid/text/GetChars;

    invoke-interface {v3, p1, v0, v1, v2}, Landroid/text/GetChars;->getChars(II[CI)V

    .line 490
    iput p1, p0, Ll/᩷۫ۡ;->ۗ:I

    .line 491
    iput v0, p0, Ll/᩷۫ۡ;->ۙ:I

    return-void

    .line 485
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid character index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ܽ(Ll/᩷۫ۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩷۫ۡ;->ۗ:I

    return p0
.end method


# virtual methods
.method public final charAt(I)C
    .locals 1

    .line 496
    iget v0, p0, Ll/᩷۫ۡ;->ۗ:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Ll/᩷۫ۡ;->ۙ:I

    if-lt p1, v0, :cond_1

    .line 497
    :cond_0
    invoke-direct {p0, p1}, Ll/᩷۫ۡ;->ۧ(I)V

    .line 499
    :cond_1
    iget v0, p0, Ll/᩷۫ۡ;->ۗ:I

    sub-int/2addr p1, v0

    iget-object v0, p0, Ll/᩷۫ۡ;->᩸:[C

    aget-char p1, v0, p1

    return p1
.end method

.method public final length()I
    .locals 1

    .line 481
    iget v0, p0, Ll/᩷۫ۡ;->᩹:I

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 2

    if-ltz p1, :cond_1

    if-lt p2, p1, :cond_1

    .line 504
    iget v0, p0, Ll/᩷۫ۡ;->᩹:I

    if-gt p2, v0, :cond_1

    .line 506
    iget v0, p0, Ll/᩷۫ۡ;->ۗ:I

    if-lt p1, v0, :cond_0

    iget v1, p0, Ll/᩷۫ۡ;->ۙ:I

    if-gt p2, v1, :cond_0

    .line 507
    new-instance v1, Ljava/lang/String;

    sub-int v0, p1, v0

    sub-int/2addr p2, p1

    iget-object p1, p0, Ll/᩷۫ۡ;->᩸:[C

    invoke-direct {v1, p1, v0, p2}, Ljava/lang/String;-><init>([CII)V

    return-object v1

    .line 508
    :cond_0
    iget-object v0, p0, Ll/᩷۫ۡ;->᩶:Landroid/text/GetChars;

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    .line 505
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid character range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
