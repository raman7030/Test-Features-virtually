.class public final synthetic Ll/۫᩷ᩳ;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/᩸ۜ᩵;
.implements Ll/֫۠ܳ;
.implements Ll/ۨܶ֫;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۫᩷ᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ll/ۧۧۧ;Ll/ۜۧۧ;)V
    .locals 0

    const/4 p1, 0x2

    .line 0
    iput p1, p0, Ll/۫᩷ᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ljava/lang/CharSequence;)Ll/ۧ᩺ᩴ;
    .locals 0

    .line 0
    invoke-interface {p0}, Ljava/lang/CharSequence;->codePoints()Ljava/util/stream/IntStream;

    move-result-object p0

    invoke-static {p0}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)V
    .locals 0

    .line 0
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 3
    invoke-interface {p4, p2, p0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 1084
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 429
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ll/ۗ۠֫;)Ljava/lang/String;
    .locals 1

    .line 83
    iget-object p1, p1, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    if-eqz p1, :cond_0

    return-object p1

    .line 84
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Media cache key is missing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/۫᩷ᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "0"

    .line 88
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_0
    const-string v0, "0"

    .line 203
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
