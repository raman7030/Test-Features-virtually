.class public final synthetic Ll/۬֫ۢ;
.super Ljava/lang/Object;
.source "KAQ1"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ܽܶܺ;
.implements Ll/ۚۡ֡;


# direct methods
.method public static ֫(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ll/ᩴ֫ۚ;

    const/4 v0, 0x1

    .line 37
    invoke-static {p1, v0}, Ll/ܳۜۚ;->֫(Ll/ۚܽۚ;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 699
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ll/ᩳܺ֡;)Ljava/lang/Object;
    .locals 0

    .line 51
    sget-object p1, Ll/֫ܺ֡;->᩸:Ll/֫ܺ֡;

    return-object p1
.end method
