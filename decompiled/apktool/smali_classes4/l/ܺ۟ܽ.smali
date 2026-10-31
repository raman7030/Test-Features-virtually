.class public final synthetic Ll/ܺ۟ܽ;
.super Ljava/lang/Object;
.source "Q62Z"

# interfaces
.implements Ljava/util/function/IntUnaryOperator;


# instance fields
.field public final synthetic ᩸:Ll/۫۟ܽ;


# direct methods
.method public synthetic constructor <init>(Ll/۫۟ܽ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ۟ܽ;->᩸:Ll/۫۟ܽ;

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

    .line 0
    iget-object v0, p0, Ll/ܺ۟ܽ;->᩸:Ll/۫۟ܽ;

    invoke-static {v0, p1}, Ll/۫۟ܽ;->ۧ(Ll/۫۟ܽ;I)I

    move-result p1

    return p1
.end method

.method public synthetic compose(Ljava/util/function/IntUnaryOperator;)Ljava/util/function/IntUnaryOperator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܺۛᩴ;->$default$compose(Ljava/util/function/IntUnaryOperator;Ljava/util/function/IntUnaryOperator;)Ljava/util/function/IntUnaryOperator;

    move-result-object p1

    return-object p1
.end method
