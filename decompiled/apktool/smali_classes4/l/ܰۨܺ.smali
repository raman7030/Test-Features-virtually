.class public final Ll/ܰۨܺ;
.super Ll/֫᩺ܺ;
.source "L3BC"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x3d

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    .line 1000
    new-instance v1, Ll/ۨۨܺ;

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    invoke-direct {v1, p1, p2}, Ll/ۨۨܺ;-><init>(Ljava/lang/String;[C)V

    invoke-direct {p0, v1, v0}, Ll/ܰۨܺ;-><init>(Ll/ۨۨܺ;Ljava/lang/Character;)V

    return-void
.end method

.method public constructor <init>(Ll/ۨۨܺ;Ljava/lang/Character;)V
    .locals 0

    .line 1004
    invoke-direct {p0, p1, p2}, Ll/֫᩺ܺ;-><init>(Ll/ۨۨܺ;Ljava/lang/Character;)V

    .line 1005
    invoke-static {p1}, Ll/ۨۨܺ;->֫(Ll/ۨۨܺ;)[C

    move-result-object p1

    array-length p1, p1

    const/16 p2, 0x40

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/ۘܶܺ;->֫(Z)V

    return-void
.end method


# virtual methods
.method public final ֫([BLjava/lang/CharSequence;)I
    .locals 8

    .line 1028
    invoke-virtual {p0, p2}, Ll/֫᩺ܺ;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    .line 1029
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget-object v1, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    invoke-virtual {v1, v0}, Ll/ۨۨܺ;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 1033
    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    add-int/lit8 v3, v0, 0x1

    .line 1034
    invoke-interface {p2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-virtual {v1, v4}, Ll/ۨۨܺ;->֫(C)I

    move-result v4

    shl-int/lit8 v4, v4, 0x12

    add-int/lit8 v5, v0, 0x2

    .line 1035
    invoke-interface {p2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-virtual {v1, v3}, Ll/ۨۨܺ;->֫(C)I

    move-result v3

    shl-int/lit8 v3, v3, 0xc

    or-int/2addr v3, v4

    add-int/lit8 v4, v2, 0x1

    ushr-int/lit8 v6, v3, 0x10

    int-to-byte v6, v6

    .line 1036
    aput-byte v6, p1, v2

    .line 1037
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v5, v6, :cond_1

    add-int/lit8 v6, v0, 0x3

    .line 1038
    invoke-interface {p2, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-virtual {v1, v5}, Ll/ۨۨܺ;->֫(C)I

    move-result v5

    shl-int/lit8 v5, v5, 0x6

    or-int/2addr v3, v5

    add-int/lit8 v5, v2, 0x2

    ushr-int/lit8 v7, v3, 0x8

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    .line 1039
    aput-byte v7, p1, v4

    .line 1040
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v6, v4, :cond_0

    add-int/lit8 v0, v0, 0x4

    .line 1041
    invoke-interface {p2, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-virtual {v1, v4}, Ll/ۨۨܺ;->֫(C)I

    move-result v4

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    .line 1042
    aput-byte v3, p1, v5

    goto :goto_0

    :cond_0
    move v2, v5

    move v0, v6

    goto :goto_0

    :cond_1
    move v2, v4

    move v0, v5

    goto :goto_0

    :cond_2
    return v2

    .line 1030
    :cond_3
    new-instance p1, Ll/۟ۨܺ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid input length "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 141
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1030
    throw p1
.end method

.method public final ֫(Ll/ۨۨܺ;Ljava/lang/Character;)Ll/ۧ᩺ܺ;
    .locals 1

    .line 1051
    new-instance v0, Ll/ܰۨܺ;

    invoke-direct {v0, p1, p2}, Ll/ܰۨܺ;-><init>(Ll/ۨۨܺ;Ljava/lang/Character;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/StringBuilder;[BI)V
    .locals 5

    .line 1011
    array-length v0, p2

    const/4 v1, 0x0

    invoke-static {v1, p3, v0}, Ll/ۘܶܺ;->֫(III)V

    move v0, p3

    :goto_0
    const/4 v2, 0x3

    if-lt v0, v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    .line 1014
    aget-byte v3, p2, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    add-int/lit8 v4, v1, 0x2

    aget-byte v2, p2, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x3

    aget-byte v3, p2, v4

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v2, v3

    ushr-int/lit8 v3, v2, 0x12

    .line 1015
    iget-object v4, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    invoke-virtual {v4, v3}, Ll/ۨۨܺ;->֫(I)C

    move-result v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    ushr-int/lit8 v3, v2, 0xc

    and-int/lit8 v3, v3, 0x3f

    .line 1016
    invoke-virtual {v4, v3}, Ll/ۨۨܺ;->֫(I)C

    move-result v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    ushr-int/lit8 v3, v2, 0x6

    and-int/lit8 v3, v3, 0x3f

    .line 1017
    invoke-virtual {v4, v3}, Ll/ۨۨܺ;->֫(I)C

    move-result v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    and-int/lit8 v2, v2, 0x3f

    .line 1018
    invoke-virtual {v4, v2}, Ll/ۨۨܺ;->֫(I)C

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    add-int/lit8 v0, v0, -0x3

    goto :goto_0

    :cond_0
    if-ge v1, p3, :cond_1

    sub-int/2addr p3, v1

    .line 1021
    invoke-virtual {p0, p1, p2, v1, p3}, Ll/֫᩺ܺ;->֫(Ljava/lang/StringBuilder;[BII)V

    :cond_1
    return-void
.end method
