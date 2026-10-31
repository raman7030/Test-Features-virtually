.class public final synthetic Ll/ܺܶۡ;
.super Ljava/lang/Object;
.source "316P"

# interfaces
.implements Ll/ܽܶܺ;
.implements Ll/۠ۚ֫;
.implements Ll/ۖ᩷ۧ;
.implements Ll/۬᩺ۡ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܺܶۡ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ljava/lang/String;JJ)V
    .locals 0

    const/4 p1, 0x5

    .line 0
    iput p1, p0, Ll/ܺܶۡ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(JLjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Landroid/view/accessibility/AccessibilityNodeInfo;)Ll/ۖ᩹ᩴ;
    .locals 0

    .line 0
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMinDurationBetweenContentChanges()Ljava/time/Duration;

    move-result-object p0

    invoke-static {p0}, Ll/֡᩹ᩴ;->convert(Ljava/time/Duration;)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lorg/bouncycastle/asn1/ASN1Sequence;I)[B
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    .line 1
    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object p0

    .line 3
    invoke-static {p0}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget v0, p0, Ll/ܺܶۡ;->᩸:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, Ll/᩶۬֫;

    check-cast p1, Ll/ܽۚ֫;

    invoke-direct {v0, p1}, Ll/᩶۬֫;-><init>(Ll/ܽۚ֫;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 199
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫()Ljava/lang/reflect/Constructor;
    .locals 2

    .line 592
    const-class v0, Ll/ܿ᩹֫;

    const-class v1, Ll/֨᩷ۧ;

    .line 593
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    .line 594
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method

.method public ֫([B)Z
    .locals 2

    .line 224
    array-length v0, p1

    const/16 v1, 0xe

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/String;

    sget-object v1, Ll/۠ۙ᩵;->֫:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string p1, "resources.arsc"

    .line 169
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
