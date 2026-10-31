.class public final synthetic Ll/᩻ᩳᩴ;
.super Ljava/lang/Object;
.source "4CK5"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ܽܶܺ;


# direct methods
.method public static ֫(IIII)I
    .locals 0

    mul-int p0, p0, p1

    .line 1
    div-int/2addr p0, p2

    add-int/2addr p0, p3

    return p0
.end method

.method public static ֫(Ll/ۜᩳᩴ;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 1

    .line 76
    instance-of v0, p1, Ll/ۜᩳᩴ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۜᩳᩴ;

    invoke-interface {p0, p1}, Ll/ۜᩳᩴ;->֫(Ll/ۜᩳᩴ;)Ll/ܳᩳᩴ;

    move-result-object p0

    return-object p0

    .line 77
    :cond_0
    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lorg/bouncycastle/math/ec/ECFieldElement;Lorg/bouncycastle/math/ec/ECFieldElement;Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;
    .locals 0

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->square()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    .line 1
    invoke-virtual {p0, p1}, Lorg/bouncycastle/math/ec/ECFieldElement;->add(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    .line 2
    invoke-virtual {p0, p2}, Lorg/bouncycastle/math/ec/ECFieldElement;->add(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ll/ܳۘۧ;

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 504
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 1

    .line 12
    invoke-static {}, Ll/ᩳ۬᩻;->֫()Ll/ᩳ۬᩻;

    const/4 v0, 0x1

    .line 217
    invoke-static {p1, v0}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 15
    invoke-static {}, Ll/ܽ۬᩻;->֫()V

    return-void
.end method
