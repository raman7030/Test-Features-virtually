.class public final synthetic Ll/ۗۧᩳ;
.super Ljava/lang/Object;
.source "81VV"

# interfaces
.implements Ll/ܽܶܺ;
.implements Ll/۠ۚ֫;
.implements Ll/᩸ۜ᩵;
.implements Ll/֫۠ܳ;
.implements Ll/᩺ܳۡ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۗۧᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/ۗۧᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(ZZ)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const v2, 0x7f1209a8

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    new-array p0, v1, [Ljava/lang/Object;

    const-string p1, "V2 + V3"

    aput-object p1, p0, v0

    .line 110
    invoke-static {v2, p0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-array p0, v1, [Ljava/lang/Object;

    const-string p1, "V2"

    aput-object p1, p0, v0

    .line 112
    invoke-static {v2, p0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    if-eqz p1, :cond_2

    new-array p0, v1, [Ljava/lang/Object;

    const-string p1, "V3"

    aput-object p1, p0, v0

    .line 114
    invoke-static {v2, p0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 116
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static synthetic ֫(Ljava/lang/CharSequence;)Ll/ۧ᩺ᩴ;
    .locals 0

    .line 0
    invoke-interface {p0}, Ljava/lang/CharSequence;->chars()Ljava/util/stream/IntStream;

    move-result-object p0

    invoke-static {p0}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/StringBuilder;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-interface {p2, p3, p0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Ll/ۗۧᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ljava/lang/Throwable;

    .line 1091
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1

    .line 0
    :pswitch_0
    check-cast p1, Ll/᩸ᩴ֫;

    .line 1559
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Ll/᩸ᩴ֫;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/᩸ᩴ֫;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ۗۧᩳ;->᩸:I

    .line 4
    check-cast p1, Ll/֨۬֫;

    packed-switch v0, :pswitch_data_0

    .line 277
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 662
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ljava/lang/String;Z)I
    .locals 0

    .line 0
    sget-object p1, Ll/ܰܳۡ;->ۢ֫:Ll/ۡۤۡ;

    const/4 p1, 0x2

    return p1
.end method

.method public ֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 16
    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ۗۧᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "0"

    .line 91
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_0
    const-string v0, "0"

    .line 224
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method
