.class public final synthetic Ll/ܶۧۢ;
.super Ljava/lang/Object;
.source "P67V"

# interfaces
.implements Ljava/util/function/BiFunction;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ܶۧۢ;->᩸:I

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/BiFunction;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 4
    check-cast p2, Ll/᩵ܺۚ;

    .line 417
    iget p1, p0, Ll/ܶۧۢ;->᩸:I

    if-eqz p2, :cond_0

    iget v0, p2, Ll/᩵ܺۚ;->ۧ:I

    if-ne v0, p1, :cond_0

    return-object p2

    .line 420
    :cond_0
    new-instance p2, Ll/᩵ܺۚ;

    invoke-direct {p2}, Ll/᩵ܺۚ;-><init>()V

    .line 421
    iput p1, p2, Ll/᩵ܺۚ;->ۧ:I

    return-object p2
.end method
