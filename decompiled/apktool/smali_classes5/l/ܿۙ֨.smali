.class public final synthetic Ll/ܿۙ֨;
.super Ljava/lang/Object;
.source "F416"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic ᩸:Ll/ۢۗ֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۢۗ֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۙ֨;->᩸:Ll/ۢۗ֨;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ll/ᩴ᩵۠;

    .line 4
    check-cast p2, Ll/֫ۤ֨;

    .line 6
    iget-object v0, p0, Ll/ܿۙ֨;->᩸:Ll/ۢۗ֨;

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1600
    iget-object p1, p1, Ll/ᩴ᩵۠;->ۛ:Ll/ۖܶ۠;

    invoke-virtual {v0, p1, p2}, Ll/ۢۗ֨;->ۧ(Ll/ۖܶ۠;Ll/֫ۤ֨;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
