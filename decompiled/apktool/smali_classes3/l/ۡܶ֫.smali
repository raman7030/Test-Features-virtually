.class public final synthetic Ll/ۡܶ֫;
.super Ljava/lang/Object;
.source "Q74D"

# interfaces
.implements Ll/ܶ۠֫;
.implements Ll/۠ۚ֫;
.implements Ll/ܽܺۧ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡܶ֫;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;)V
    .locals 0

    const/4 p1, 0x3

    .line 0
    iput p1, p0, Ll/ۡܶ֫;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;ZI)V
    .locals 0

    const/4 p1, 0x2

    .line 0
    iput p1, p0, Ll/ۡܶ֫;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr p3, p4

    return p3
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-interface {p4, p0, p1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 3
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 3
    invoke-static {p2, p0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ۡܶ֫;->᩸:I

    .line 4
    check-cast p1, Ll/֨۬֫;

    packed-switch v0, :pswitch_data_0

    .line 871
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 551
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public ֫()Ll/᩸۠֫;
    .locals 1

    .line 2
    new-instance v0, Ll/ܺܶ֫;

    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public ֫(IIIII)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
