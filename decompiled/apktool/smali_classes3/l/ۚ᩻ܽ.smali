.class public final synthetic Ll/ۚ᩻ܽ;
.super Ljava/lang/Object;
.source "X4W4"

# interfaces
.implements Ll/ܽܶܺ;
.implements Ll/ۖ᩷ۧ;
.implements Ll/֡ۡ֡;


# direct methods
.method public static ֫(Lorg/bouncycastle/asn1/ASN1Sequence;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result p0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Landroid/view/accessibility/AccessibilityNodeInfo;Ll/ۖ᩹ᩴ;)V
    .locals 0

    .line 0
    invoke-static {p1}, Ll/֡᩹ᩴ;->convert(Ll/ۖ᩹ᩴ;)Ljava/time/Duration;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMinDurationBetweenContentChanges(Ljava/time/Duration;)V

    return-void
.end method

.method public static ֫(I)Z
    .locals 2

    const/4 v0, 0x1

    if-ltz p0, :cond_0

    const/16 v1, 0x8

    if-gt p0, v1, :cond_0

    return v0

    :cond_0
    const/16 v1, 0x10

    if-lt p0, v1, :cond_1

    const/16 v1, 0x12

    if-gt p0, v1, :cond_1

    return v0

    :cond_1
    const/16 v1, 0x1c

    if-lt p0, v1, :cond_2

    const/16 v1, 0x1f

    if-gt p0, v1, :cond_2

    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/io/IOException;

    .line 150
    throw p1
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ll/֨᩷ۧ;

    .line 820
    invoke-interface {p1}, Ll/֨᩷ۧ;->ܽ()Ll/֨᩷ۧ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ֫()Ljava/lang/reflect/Constructor;
    .locals 4

    .line 606
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "androidx.media3.decoder.flac.FlacLibrary"

    .line 608
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "isAvailable"

    const/4 v3, 0x0

    .line 609
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 610
    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 607
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "androidx.media3.decoder.flac.FlacExtractor"

    .line 612
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/֨᩷ۧ;

    .line 613
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 614
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v3
.end method
