.class public final synthetic Ll/᩶᩵ᩳ;
.super Ljava/lang/Object;
.source "T6QN"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ܶۜ᩵;


# direct methods
.method public static ֫(FFFF)F
    .locals 0

    sub-float/2addr p0, p1

    mul-float p0, p0, p2

    add-float/2addr p0, p3

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;
    .locals 0

    .line 0
    invoke-interface {p4, p0, p1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 1
    invoke-interface {p4, p2, p3}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 3
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    return-object p0
.end method

.method public static ֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-static {p2, p3, p4, p0}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 590
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ljava/lang/Void;

    return-object p2
.end method
