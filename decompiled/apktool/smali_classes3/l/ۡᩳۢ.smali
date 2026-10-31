.class public final synthetic Ll/ۡᩳۢ;
.super Ljava/lang/Object;
.source "Q1K7"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ۖۛۡ;
.implements Lcom/google/android/material/textfield/TextInputLayout$LengthCounter;


# direct methods
.method public static bridge synthetic ֫(Landroid/content/res/Configuration;)I
    .locals 0

    .line 0
    iget p0, p0, Landroid/content/res/Configuration;->fontWeightAdjustment:I

    return p0
.end method

.method public static ֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;
    .locals 0

    .line 0
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-interface {p4, p2, p0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 4
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method


# virtual methods
.method public countLength(Landroid/text/Editable;)I
    .locals 0

    .line 0
    invoke-static {p1}, Lcom/google/android/material/textfield/TextInputLayout;->$r8$lambda$o92w5de0KdW2_dMexjlsVyV6EjQ(Landroid/text/Editable;)I

    move-result p1

    return p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 318
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(I)V
    .locals 3

    .line 227
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmaliCache progress "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method
