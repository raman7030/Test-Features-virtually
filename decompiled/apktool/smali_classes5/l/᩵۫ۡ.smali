.class public final synthetic Ll/᩵۫ۡ;
.super Ljava/lang/Object;
.source "8B94"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/᩻ۗۜ;


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ljava/lang/String;)Ll/ۧ᩺ᩴ;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/String;->chars()Ljava/util/stream/IntStream;

    move-result-object p0

    invoke-static {p0}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۘۨۚ;JLjava/lang/String;[Ljava/lang/Object;)Ll/۫ۗۚ;
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 1
    new-instance p0, Ll/۫ۗۚ;

    .line 2
    invoke-direct {p0}, Ll/۫ۗۚ;-><init>()V

    return-object p0
.end method

.method public static ֫(Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-interface {p2, p0, p3}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 331
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ll/ۗ۠֫;)Ljava/lang/String;
    .locals 1

    .line 876
    iget-object p1, p1, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    if-eqz p1, :cond_0

    return-object p1

    .line 877
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "HLS thumbnail cache key is missing"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
