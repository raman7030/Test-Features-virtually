.class public final synthetic Ll/ۧ۬֫;
.super Ljava/lang/Object;
.source "M8QF"

# interfaces
.implements Ll/۠ۚ֫;
.implements Lnet/sf/sevenzipjbinding/ISequentialOutStream;
.implements Ll/֫۠ܳ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧ۬֫;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;)V
    .locals 0

    const/4 p1, 0x2

    .line 0
    iput p1, p0, Ll/ۧ۬֫;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(IIII)I
    .locals 0

    or-int/2addr p0, p1

    or-int/2addr p0, p2

    or-int/lit16 p0, p0, 0x80

    or-int/2addr p0, p3

    return p0
.end method

.method public static ֫(IILjava/lang/String;)I
    .locals 0

    .line 0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    add-int/2addr p2, p0

    mul-int p2, p2, p1

    return p2
.end method

.method public static bridge synthetic ֫(Landroid/view/WindowManager$LayoutParams;I)V
    .locals 0

    .line 0
    iput p1, p0, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    return-void
.end method

.method public static ֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-interface {p0, p3, p4, p1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(IZ)Z
    .locals 1

    and-int/lit8 p0, p0, 0x7

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 889
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 0

    .line 107
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    return p1
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ۧ۬֫;->᩸:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "0"

    .line 74
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_0
    const-string v0, "0"

    .line 200
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
