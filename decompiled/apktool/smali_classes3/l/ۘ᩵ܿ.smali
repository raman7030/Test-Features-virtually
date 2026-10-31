.class public final synthetic Ll/ۘ᩵ܿ;
.super Ljava/lang/Object;
.source "A186"

# interfaces
.implements Ll/ۨܶ֫;
.implements Ll/۠ۚ֫;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    .line 0
    iput v0, p0, Ll/ۘ᩵ܿ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ll/ܺ᩵֫;)V
    .locals 0

    const/4 p1, 0x3

    .line 0
    iput p1, p0, Ll/ۘ᩵ܿ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Z)V
    .locals 0

    const/4 p1, 0x4

    .line 0
    iput p1, p0, Ll/ۘ᩵ܿ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(IIII)I
    .locals 0

    mul-int p0, p0, p1

    add-int/2addr p0, p2

    mul-int p0, p0, p3

    return p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;
    .locals 0

    .line 0
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-interface {p4, p1, p3, p0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    .line 3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 4
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    return-object p0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ۘ᩵ܿ;->᩸:I

    .line 4
    check-cast p1, Ll/֨۬֫;

    packed-switch v0, :pswitch_data_0

    .line 741
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 626
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ll/ۗ۠֫;)Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p1, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object p1, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
