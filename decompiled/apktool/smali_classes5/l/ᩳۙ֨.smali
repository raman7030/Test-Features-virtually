.class public final synthetic Ll/ᩳۙ֨;
.super Ljava/lang/Object;
.source "F416"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic ۗ:Ll/ᩴܶ۠;

.field public final synthetic ۙ:Ll/ᩴܶ۠;

.field public final synthetic ᩶:Ll/ܰ֡۠;

.field public final synthetic ᩸:Ll/ۢۗ֨;

.field public final synthetic ᩹:Ll/᩻ۗ֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۢۗ֨;Ll/᩻ۗ֨;Ll/ܰ֡۠;Ll/ᩴܶ۠;Ll/ᩴܶ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۙ֨;->᩸:Ll/ۢۗ֨;

    iput-object p2, p0, Ll/ᩳۙ֨;->᩹:Ll/᩻ۗ֨;

    iput-object p3, p0, Ll/ᩳۙ֨;->᩶:Ll/ܰ֡۠;

    iput-object p4, p0, Ll/ᩳۙ֨;->ۙ:Ll/ᩴܶ۠;

    iput-object p5, p0, Ll/ᩳۙ֨;->ۗ:Ll/ᩴܶ۠;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 2
    check-cast p1, Ll/ᩴ᩵۠;

    .line 4
    check-cast p2, Ll/֫ۤ֨;

    .line 1624
    iget-object v0, p2, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    check-cast v0, Ll/ۡۗ֨;

    iget-object v1, p0, Ll/ᩳۙ֨;->᩹:Ll/᩻ۗ֨;

    iput-object v1, v0, Ll/ۡۗ֨;->ۚ:Ll/᩻ۗ֨;

    .line 1625
    iget-object v0, p1, Ll/ᩴ᩵۠;->ۛ:Ll/ۖܶ۠;

    iget-object v1, p0, Ll/ᩳۙ֨;->᩸:Ll/ۢۗ֨;

    invoke-virtual {v1, v0, p2}, Ll/ۢۗ֨;->ۧ(Ll/ۖܶ۠;Ll/֫ۤ֨;)V

    .line 1626
    new-instance p2, Ll/۠ۙ֨;

    iget-object v0, p0, Ll/ᩳۙ֨;->᩶:Ll/ܰ֡۠;

    iget-object v2, p0, Ll/ᩳۙ֨;->ۙ:Ll/ᩴܶ۠;

    iget-object v3, p0, Ll/ᩳۙ֨;->ۗ:Ll/ᩴܶ۠;

    invoke-direct {p2, v1, v0, v2, v3}, Ll/۠ۙ֨;-><init>(Ll/ۢۗ֨;Ll/ܰ֡۠;Ll/ᩴܶ۠;Ll/ᩴܶ۠;)V

    iget-object p1, p1, Ll/ᩴ᩵۠;->ۛ:Ll/ۖܶ۠;

    .line 1638
    invoke-virtual {p2, p1}, Ll/ܳ֨۠;->֫(Ll/ۖܶ۠;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
