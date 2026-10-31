.class public Lorg/bouncycastle/math/ec/tools/TraceOptimizer;
.super Ljava/lang/Object;


# static fields
.field public static final ONE:Ljava/math/BigInteger;

.field public static final R:Ljava/security/SecureRandom;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x1

    .line 0
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/math/ec/tools/TraceOptimizer;->ONE:Ljava/math/BigInteger;

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Lorg/bouncycastle/math/ec/tools/TraceOptimizer;->R:Ljava/security/SecureRandom;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static calculateTrace(Lorg/bouncycastle/math/ec/ECFieldElement;)I
    .locals 6

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->getFieldSize()I

    move-result v0

    invoke-static {v0}, Lorg/bouncycastle/util/Integers;->numberOfLeadingZeros(I)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object v4, p0

    :cond_0
    :goto_0
    if-lez v1, :cond_1

    invoke-virtual {v4, v3}, Lorg/bouncycastle/math/ec/ECFieldElement;->squarePow(I)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3, v4}, Lorg/bouncycastle/math/ec/ECFieldElement;->add(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v4

    add-int/lit8 v1, v1, -0x1

    ushr-int v3, v0, v1

    and-int/lit8 v5, v3, 0x1

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECFieldElement;->square()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v4

    invoke-virtual {v4, p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->add(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v4

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECFieldElement;->isZero()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    return p0

    :cond_2
    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECFieldElement;->isOne()Z

    move-result p0

    if-eqz p0, :cond_3

    return v2

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Internal error in trace calculation"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static enumToList(Ljava/util/Enumeration;)Ljava/util/List;
    .locals 2

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static implPrintNonZeroTraceBits(Lorg/bouncycastle/math/ec/ECCurve;)V
    .locals 8

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECCurve;->getFieldSize()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    and-int/lit8 v3, v2, 0x1

    const-string v4, " "

    if-nez v3, :cond_0

    if-eqz v2, :cond_0

    ushr-int/lit8 v3, v2, 0x1

    invoke-static {v3}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v2}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    sget-object v3, Lorg/bouncycastle/math/ec/tools/TraceOptimizer;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v3, v2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0, v3}, Lorg/bouncycastle/math/ec/ECCurve;->fromBigInteger(Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/math/ec/tools/TraceOptimizer;->calculateTrace(Lorg/bouncycastle/math/ec/ECFieldElement;)I

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v2}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2}, Ljava/io/PrintStream;->println()V

    const/4 v2, 0x0

    :goto_2
    const/16 v3, 0x3e8

    if-ge v2, v3, :cond_6

    new-instance v3, Ljava/math/BigInteger;

    sget-object v4, Lorg/bouncycastle/math/ec/tools/TraceOptimizer;->R:Ljava/security/SecureRandom;

    invoke-direct {v3, v0, v4}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    invoke-virtual {p0, v3}, Lorg/bouncycastle/math/ec/ECCurve;->fromBigInteger(Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v4

    invoke-static {v4}, Lorg/bouncycastle/math/ec/tools/TraceOptimizer;->calculateTrace(Lorg/bouncycastle/math/ec/ECFieldElement;)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v5, v7, :cond_4

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v3, v7}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v7

    if-eqz v7, :cond_3

    xor-int/lit8 v6, v6, 0x1

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_4
    if-ne v4, v6, :cond_5

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Optimized-trace sanity check failed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 4

    .line 0
    new-instance p0, Ljava/util/TreeSet;

    invoke-static {}, Lorg/bouncycastle/asn1/x9/ECNamedCurveTable;->getNames()Ljava/util/Enumeration;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/math/ec/tools/TraceOptimizer;->enumToList(Ljava/util/Enumeration;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Lorg/bouncycastle/crypto/ec/CustomNamedCurves;->getNames()Ljava/util/Enumeration;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/math/ec/tools/TraceOptimizer;->enumToList(Ljava/util/Enumeration;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lorg/bouncycastle/crypto/ec/CustomNamedCurves;->getByNameLazy(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {v0}, Lorg/bouncycastle/asn1/x9/ECNamedCurveTable;->getByNameLazy(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/math/ec/ECAlgorithms;->isF2mCurve(Lorg/bouncycastle/math/ec/ECCurve;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-static {v1}, Lorg/bouncycastle/math/ec/tools/TraceOptimizer;->implPrintNonZeroTraceBits(Lorg/bouncycastle/math/ec/ECCurve;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static printNonZeroTraceBits(Lorg/bouncycastle/math/ec/ECCurve;)V
    .locals 1

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/math/ec/ECAlgorithms;->isF2mCurve(Lorg/bouncycastle/math/ec/ECCurve;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/math/ec/tools/TraceOptimizer;->implPrintNonZeroTraceBits(Lorg/bouncycastle/math/ec/ECCurve;)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Trace only defined over characteristic-2 fields"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
