.class public final Ll/ۙ۟ܿ;
.super Ljava/io/InputStream;
.source "X4M8"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public final ۤ:Ljava/lang/CharSequence;

.field public ۫:Z

.field public ۬:I

.field public final ᩶:I

.field public final ᩸:Ll/ܿۖ᩷;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ll/ܿۖ᩷;)V
    .locals 0

    .line 532
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 533
    iput-object p1, p0, Ll/ۙ۟ܿ;->ۤ:Ljava/lang/CharSequence;

    .line 534
    iput-object p2, p0, Ll/ۙ۟ܿ;->᩸:Ll/ܿۖ᩷;

    .line 535
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Ll/ۙ۟ܿ;->᩶:I

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 3

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 541
    invoke-virtual {p0, v1, v2, v0}, Ll/ۙ۟ܿ;->read([BII)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 542
    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 6

    if-ltz p2, :cond_c

    if-ltz p3, :cond_c

    .line 547
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_c

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_a

    .line 555
    iget v1, p0, Ll/ۙ۟ܿ;->ۙ:I

    const/16 v2, 0x3d

    const/4 v3, 0x1

    if-lez v1, :cond_1

    add-int/lit8 v4, v0, 0x1

    add-int/2addr v0, p2

    .line 556
    aput-byte v2, p1, v0

    add-int/lit8 v1, v1, -0x1

    .line 557
    iput v1, p0, Ll/ۙ۟ܿ;->ۙ:I

    .line 558
    iget v0, p0, Ll/ۙ۟ܿ;->۬:I

    add-int/2addr v0, v3

    and-int/lit8 v0, v0, 0x3

    iput v0, p0, Ll/ۙ۟ܿ;->۬:I

    :goto_1
    move v0, v4

    goto :goto_0

    .line 561
    :cond_1
    iget v1, p0, Ll/ۙ۟ܿ;->ۗ:I

    iget v4, p0, Ll/ۙ۟ܿ;->᩶:I

    if-ge v1, v4, :cond_8

    .line 562
    iget-object v4, p0, Ll/ۙ۟ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v1, v4}, Ll/ۛ۟ܿ;->֫(ILl/ܿۖ᩷;)V

    .line 563
    iget v1, p0, Ll/ۙ۟ܿ;->ۗ:I

    add-int/lit8 v4, v1, 0x1

    iput v4, p0, Ll/ۙ۟ܿ;->ۗ:I

    iget-object v4, p0, Ll/ۙ۟ܿ;->ۤ:Ljava/lang/CharSequence;

    invoke-interface {v4, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v4, 0x41

    if-lt v1, v4, :cond_2

    const/16 v4, 0x5a

    if-le v1, v4, :cond_6

    :cond_2
    const/16 v4, 0x61

    if-lt v1, v4, :cond_3

    const/16 v4, 0x7a

    if-le v1, v4, :cond_6

    :cond_3
    const/16 v4, 0x30

    if-lt v1, v4, :cond_4

    const/16 v4, 0x39

    if-le v1, v4, :cond_6

    :cond_4
    const/16 v4, 0x2b

    if-eq v1, v4, :cond_6

    const/16 v4, 0x2f

    if-ne v1, v4, :cond_5

    goto :goto_2

    :cond_5
    if-eq v1, v2, :cond_6

    goto :goto_0

    :cond_6
    :goto_2
    add-int/lit8 v4, v0, 0x1

    add-int/2addr v0, p2

    int-to-byte v5, v1

    .line 567
    aput-byte v5, p1, v0

    .line 568
    iget v0, p0, Ll/ۙ۟ܿ;->۬:I

    add-int/2addr v0, v3

    and-int/lit8 v0, v0, 0x3

    iput v0, p0, Ll/ۙ۟ܿ;->۬:I

    .line 569
    iget-boolean v0, p0, Ll/ۙ۟ܿ;->۫:Z

    if-ne v1, v2, :cond_7

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    :goto_3
    or-int/2addr v0, v3

    iput-boolean v0, p0, Ll/ۙ۟ܿ;->۫:Z

    goto :goto_1

    .line 572
    :cond_8
    iget-boolean v1, p0, Ll/ۙ۟ܿ;->᩹:Z

    if-nez v1, :cond_a

    .line 573
    iput-boolean v3, p0, Ll/ۙ۟ܿ;->᩹:Z

    .line 574
    iget-boolean v1, p0, Ll/ۙ۟ܿ;->۫:Z

    if-nez v1, :cond_a

    iget v1, p0, Ll/ۙ۟ܿ;->۬:I

    if-eqz v1, :cond_a

    if-eq v1, v3, :cond_9

    rsub-int/lit8 v1, v1, 0x4

    .line 578
    iput v1, p0, Ll/ۙ۟ܿ;->ۙ:I

    goto/16 :goto_0

    .line 576
    :cond_9
    new-instance p1, Landroid/util/Base64DataException;

    const-string p2, "Invalid Base64 input length"

    invoke-direct {p1, p2}, Landroid/util/Base64DataException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    if-nez v0, :cond_b

    const/4 p1, -0x1

    return p1

    :cond_b
    return v0

    .line 548
    :cond_c
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
