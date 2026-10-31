.class public final synthetic Ll/ᩴۘܿ;
.super Ljava/lang/Object;
.source "P1QX"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/۟ۗۚ;


# direct methods
.method public static ֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 0

    .line 0
    invoke-interface {p0, p1, p2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public static ֫(I)Ll/ۤۜܽ;
    .locals 1

    .line 0
    new-instance v0, Ll/ۤۜܽ;

    .line 1
    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->writeInt(I)V

    return-object v0
.end method

.method public static synthetic ֫(Ljava/lang/String;)Ll/ۧ᩺ᩴ;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/String;->codePoints()Ljava/util/stream/IntStream;

    move-result-object p0

    invoke-static {p0}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(IILjava/lang/CharSequence;)V
    .locals 1

    const/16 v0, 0xa

    if-eqz p0, :cond_1

    add-int/lit8 p0, p0, -0x1

    .line 20
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    if-ne p0, v0, :cond_0

    goto :goto_0

    .line 21
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    .line 23
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-eq p1, p0, :cond_3

    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    if-ne p0, v0, :cond_2

    goto :goto_1

    .line 24
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_3
    :goto_1
    return-void
.end method

.method public static ۧ(IILjava/lang/CharSequence;)I
    .locals 2

    :goto_0
    if-ge p0, p1, :cond_1

    add-int/lit8 v0, p1, -0x1

    .line 40
    invoke-interface {p2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    return p1
.end method

.method public static ܽ(IILjava/lang/CharSequence;)I
    .locals 2

    :goto_0
    if-ge p0, p1, :cond_1

    .line 30
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_1

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    return p0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 841
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p1, p2, p3}, Ll/ۨۗۚ;->֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
