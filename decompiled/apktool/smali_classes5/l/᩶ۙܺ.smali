.class public final synthetic Ll/᩶ۙܺ;
.super Ljava/lang/Object;
.source "V7NG"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ljava/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Ll/ۗۙܺ;Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩶ۙܺ;->᩸:Ljava/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 378
    check-cast p1, Ll/ܶ۫ᩴ;

    if-eqz p1, :cond_0

    .line 380
    iget-object v0, p0, Ll/᩶ۙܺ;->᩸:Ljava/util/function/Consumer;

    invoke-interface {p1, v0}, Ll/ܶ۫ᩴ;->forEachRemaining(Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
