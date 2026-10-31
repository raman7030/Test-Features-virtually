.class public final synthetic Ll/᩸᩺ۘ;
.super Ljava/lang/Object;
.source "QATC"

# interfaces
.implements Ll/᩶᩺ۘ;


# instance fields
.field public final synthetic ᩸:Ll/᩶᩺ۘ;

.field public final synthetic ᩹:Ll/᩶᩺ۘ;


# direct methods
.method public synthetic constructor <init>(Ll/᩶᩺ۘ;Ll/᩶᩺ۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩺ۘ;->᩸:Ll/᩶᩺ۘ;

    iput-object p2, p0, Ll/᩸᩺ۘ;->᩹:Ll/᩶᩺ۘ;

    return-void
.end method


# virtual methods
.method public final synthetic accept(I)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹᩺ۘ;->֫(Ll/᩶᩺ۘ;I)V

    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹᩺ۘ;->֫(Ll/᩶᩺ۘ;Ljava/lang/Object;)V

    return-void
.end method

.method public final andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 105
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 35
    invoke-static {p0, p1}, Ll/᩹᩺ۘ;->֫(Ll/᩶᩺ۘ;Ljava/util/function/IntConsumer;)Ll/᩶᩺ۘ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶᩺ۘ;)Ll/᩸᩺ۘ;
    .locals 1

    .line 80
    new-instance v0, Ll/᩸᩺ۘ;

    invoke-direct {v0, p0, p1}, Ll/᩸᩺ۘ;-><init>(Ll/᩶᩺ۘ;Ll/᩶᩺ۘ;)V

    return-object v0
.end method

.method public final ֫(B)V
    .locals 1

    .line 81
    iget-object v0, p0, Ll/᩸᩺ۘ;->᩸:Ll/᩶᩺ۘ;

    invoke-interface {v0, p1}, Ll/᩶᩺ۘ;->֫(B)V

    .line 82
    iget-object v0, p0, Ll/᩸᩺ۘ;->᩹:Ll/᩶᩺ۘ;

    invoke-interface {v0, p1}, Ll/᩶᩺ۘ;->֫(B)V

    return-void
.end method

.method public final synthetic ֫(Ljava/lang/Byte;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹᩺ۘ;->֫(Ll/᩶᩺ۘ;Ljava/lang/Byte;)V

    return-void
.end method
