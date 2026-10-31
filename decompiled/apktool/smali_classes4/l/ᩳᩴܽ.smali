.class public final Ll/ᩳᩴܽ;
.super Ljava/lang/Object;
.source "W6QR"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 439
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 440
    iput-object p1, p0, Ll/ᩳᩴܽ;->ۧ:Ljava/lang/String;

    .line 441
    iput p2, p0, Ll/ᩳᩴܽ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 4

    .line 446
    iget v0, p0, Ll/ᩳᩴܽ;->֫:I

    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_0

    return p1

    .line 447
    :cond_0
    iget-object v0, p0, Ll/ᩳᩴܽ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    :cond_1
    :goto_0
    if-ge p1, v1, :cond_4

    .line 449
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x800

    .line 238
    invoke-static {v2, v3}, Ll/᩹۠ܽ;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    const/16 v3, 0x23

    if-ne v2, v3, :cond_4

    :cond_3
    add-int/lit8 p1, p1, 0x1

    if-ge p1, v1, :cond_1

    .line 455
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eqz v2, :cond_1

    .line 456
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    iget v3, p0, Ll/ᩳᩴܽ;->֫:I

    invoke-static {v2, v3}, Ll/᩷ᩴܽ;->֫(II)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_4
    return p1
.end method

.method public final ֫(ILjava/util/BitSet;[I)I
    .locals 5

    .line 466
    iget-object v0, p0, Ll/ᩳᩴܽ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr p1, v2

    if-ne p1, v1, :cond_0

    return p1

    .line 469
    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    .line 470
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    add-int/2addr v4, p1

    const/16 p1, 0x63

    if-ne v3, p1, :cond_2

    .line 472
    invoke-virtual {p0, v4}, Ll/ᩳᩴܽ;->֫(I)I

    move-result p1

    if-ge p1, v1, :cond_1

    .line 474
    aget p3, p3, p1

    invoke-virtual {p2, p3}, Ljava/util/BitSet;->set(I)V

    .line 475
    invoke-virtual {v0, p1}, Ljava/lang/String;->codePointAt(I)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Character;->charCount(I)I

    move-result p2

    add-int/2addr p2, p1

    return p2

    :cond_1
    return p1

    :cond_2
    const/16 p1, 0x75

    if-ne v3, p1, :cond_5

    const/4 p1, 0x0

    :goto_0
    const/4 p2, 0x4

    if-ge p1, p2, :cond_4

    if-ge v4, v1, :cond_4

    .line 479
    invoke-virtual {p0, v4}, Ll/ᩳᩴܽ;->֫(I)I

    move-result p2

    if-ge p2, v1, :cond_3

    add-int/lit8 p2, p2, 0x1

    :cond_3
    move v4, p2

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_4
    return v4

    :cond_5
    const/4 p1, 0x2

    const/16 p2, 0x78

    if-eq v3, p2, :cond_a

    const/16 p3, 0x70

    if-eq v3, p3, :cond_a

    const/16 p3, 0x50

    if-eq v3, p3, :cond_a

    const/16 p3, 0x4e

    if-ne v3, p3, :cond_6

    goto :goto_3

    :cond_6
    const/16 p2, 0x30

    if-ne v3, p2, :cond_9

    .line 497
    invoke-virtual {p0, v4}, Ll/ᩳᩴܽ;->֫(I)I

    move-result p3

    if-ge p3, v1, :cond_7

    .line 498
    invoke-virtual {v0, p3}, Ljava/lang/String;->charAt(I)C

    move-result p3

    const/16 v2, 0x33

    if-gt p3, v2, :cond_7

    const/4 p1, 0x3

    :cond_7
    :goto_1
    add-int/lit8 p3, p1, -0x1

    if-lez p1, :cond_9

    .line 500
    invoke-virtual {p0, v4}, Ll/ᩳᩴܽ;->֫(I)I

    move-result p1

    if-eq p1, v1, :cond_9

    .line 501
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-lt v2, p2, :cond_9

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x37

    if-le v2, v3, :cond_8

    goto :goto_2

    :cond_8
    add-int/lit8 v4, p1, 0x1

    move p1, p3

    goto :goto_1

    :cond_9
    :goto_2
    return v4

    .line 483
    :cond_a
    :goto_3
    invoke-virtual {p0, v4}, Ll/ᩳᩴܽ;->֫(I)I

    move-result p1

    if-ge p1, v1, :cond_e

    .line 484
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p3

    const/16 v4, 0x7b

    if-ne p3, v4, :cond_e

    :cond_b
    add-int/2addr p1, v2

    .line 486
    invoke-virtual {p0, p1}, Ll/ᩳᩴܽ;->֫(I)I

    move-result p1

    if-ge p1, v1, :cond_c

    .line 487
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 p3, 0x7d

    if-ne p2, p3, :cond_b

    :cond_c
    if-ge p1, v1, :cond_d

    add-int/2addr p1, v2

    :cond_d
    return p1

    :cond_e
    if-ne v3, p2, :cond_f

    const/4 v2, 0x2

    :cond_f
    :goto_4
    add-int/lit8 p2, v2, -0x1

    if-lez v2, :cond_11

    if-ge p1, v1, :cond_11

    .line 492
    invoke-virtual {p0, p1}, Ll/ᩳᩴܽ;->֫(I)I

    move-result p1

    if-ge p1, v1, :cond_10

    .line 493
    invoke-virtual {v0, p1}, Ljava/lang/String;->codePointAt(I)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Character;->charCount(I)I

    move-result p3

    add-int/2addr p1, p3

    :cond_10
    move v2, p2

    goto :goto_4

    :cond_11
    return p1
.end method
