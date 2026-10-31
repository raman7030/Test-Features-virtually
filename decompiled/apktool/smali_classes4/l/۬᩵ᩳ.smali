.class public final synthetic Ll/۬᩵ᩳ;
.super Ljava/lang/Object;
.source "T6QN"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/᩸ۜ᩵;
.implements Ll/ᩳ᩷ܳ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۬᩵ᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ljava/lang/Exception;)V
    .locals 0

    const/4 p1, 0x5

    .line 0
    iput p1, p0, Ll/۬᩵ᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;ZI)V
    .locals 0

    const/4 p1, 0x4

    .line 0
    iput p1, p0, Ll/۬᩵ᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ܳ᩸֫;)J
    .locals 3

    const-wide/16 v0, -0x1

    .line 77
    check-cast p0, Ll/ۜ᩸֫;

    const-string v2, "exo_len"

    invoke-virtual {p0, v0, v1, v2}, Ll/ۜ᩸֫;->֫(JLjava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static ֫(ILjava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static ֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/StringBuilder;
    .locals 0

    .line 0
    invoke-interface {p0, p1, p4, p2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 3
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ljava/lang/Long;

    const/4 p1, 0x0

    return-object p1
.end method

.method public synthetic cancel()V
    .locals 0

    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/۬᩵ᩳ;->᩸:I

    .line 4
    check-cast p1, Ll/֨۬֫;

    packed-switch v0, :pswitch_data_0

    .line 862
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 570
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public ۧ(I)Ll/ܽ᩷ܳ;
    .locals 1

    .line 0
    new-instance v0, Ll/ܳ᩹᩻;

    invoke-direct {v0, p1}, Ll/ܳ᩹᩻;-><init>(I)V

    return-object v0
.end method
