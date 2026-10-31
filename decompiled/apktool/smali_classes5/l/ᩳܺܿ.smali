.class public final synthetic Ll/ᩳܺܿ;
.super Ljava/lang/Object;
.source "U4S1"

# interfaces
.implements Ljava/util/function/IntUnaryOperator;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ۢۖܿ;

.field public final synthetic ᩹:Ll/ᩳۖܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۢۖܿ;Ll/ᩳۖܿ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳܺܿ;->᩸:Ll/ۢۖܿ;

    iput-object p2, p0, Ll/ᩳܺܿ;->᩹:Ll/ᩳۖܿ;

    iput p3, p0, Ll/ᩳܺܿ;->᩶:I

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/IntUnaryOperator;)Ljava/util/function/IntUnaryOperator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܺۛᩴ;->$default$andThen(Ljava/util/function/IntUnaryOperator;Ljava/util/function/IntUnaryOperator;)Ljava/util/function/IntUnaryOperator;

    move-result-object p1

    return-object p1
.end method

.method public final applyAsInt(I)I
    .locals 1

    .line 302
    iget-object v0, p0, Ll/ᩳܺܿ;->᩸:Ll/ۢۖܿ;

    invoke-virtual {v0}, Ll/ۢۖܿ;->֫()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Ll/ᩳܺܿ;->᩹:Ll/ᩳۖܿ;

    invoke-virtual {v0, p1}, Ll/ᩳۖܿ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ll/ᩳۖܿ;->֫()I

    move-result p1

    return p1

    .line 0
    :cond_0
    iget p1, p0, Ll/ᩳܺܿ;->᩶:I

    return p1
.end method

.method public synthetic compose(Ljava/util/function/IntUnaryOperator;)Ljava/util/function/IntUnaryOperator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܺۛᩴ;->$default$compose(Ljava/util/function/IntUnaryOperator;Ljava/util/function/IntUnaryOperator;)Ljava/util/function/IntUnaryOperator;

    move-result-object p1

    return-object p1
.end method
