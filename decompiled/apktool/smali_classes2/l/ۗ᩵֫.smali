.class public final synthetic Ll/ۗ᩵֫;
.super Ljava/lang/Object;
.source "T8IW"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/᩸ۜ᩵;
.implements Ll/ۚۚۢ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۗ᩵֫;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/ۗ᩵֫;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;
    .locals 0

    .line 0
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-interface {p4, p1, p0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 4
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ljava/lang/Long;

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ۗ᩵֫;->᩸:I

    .line 4
    check-cast p1, Ll/֨۬֫;

    packed-switch v0, :pswitch_data_0

    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 717
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 0

    .line 0
    check-cast p1, Ll/ۘۤᩳ;

    invoke-static {p1}, Ll/ۘۤᩳ;->ۧ(Ll/ۘۤᩳ;)V

    return-void
.end method
