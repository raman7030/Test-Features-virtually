.class public final synthetic Ll/ۡᩳᩴ;
.super Ljava/lang/Object;
.source "8ATV"

# interfaces
.implements Ll/ۘᩳᩴ;


# instance fields
.field public final synthetic ᩸:Ljava/util/function/DoubleConsumer;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/DoubleConsumer;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡᩳᩴ;->᩸:Ljava/util/function/DoubleConsumer;

    return-void
.end method


# virtual methods
.method public final synthetic accept(D)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۖᩳᩴ;->֫(Ll/ۘᩳᩴ;D)V

    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖᩳᩴ;->֫(Ll/ۘᩳᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 105
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic andThen(Ljava/util/function/DoubleConsumer;)Ljava/util/function/DoubleConsumer;
    .locals 0

    .line 35
    invoke-static {p0, p1}, Ll/ۖᩳᩴ;->֫(Ll/ۘᩳᩴ;Ljava/util/function/DoubleConsumer;)Ll/ۘᩳᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۘᩳᩴ;)Ll/ܺᩳᩴ;
    .locals 1

    .line 80
    new-instance v0, Ll/ܺᩳᩴ;

    invoke-direct {v0, p0, p1}, Ll/ܺᩳᩴ;-><init>(Ll/ۘᩳᩴ;Ll/ۘᩳᩴ;)V

    return-object v0
.end method

.method public final ֫(F)V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/ۡᩳᩴ;->᩸:Ljava/util/function/DoubleConsumer;

    float-to-double v1, p1

    invoke-interface {v0, v1, v2}, Ljava/util/function/DoubleConsumer;->accept(D)V

    return-void
.end method

.method public final synthetic ֫(Ljava/lang/Float;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖᩳᩴ;->֫(Ll/ۘᩳᩴ;Ljava/lang/Float;)V

    return-void
.end method
