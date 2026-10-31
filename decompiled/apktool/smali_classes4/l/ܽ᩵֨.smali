.class public final synthetic Ll/ܽ᩵֨;
.super Ljava/lang/Object;
.source "R450"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:Ljava/util/function/Predicate;

.field public final synthetic ᩹:Ll/֨᩵֨;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Predicate;Ll/֨᩵֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩵֨;->᩸:Ljava/util/function/Predicate;

    iput-object p2, p0, Ll/ܽ᩵֨;->᩹:Ll/֨᩵֨;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܽ᩵֨;->᩹:Ll/֨᩵֨;

    .line 4
    check-cast p1, Ll/۟᩵֨;

    .line 1083
    iget-object v1, p0, Ll/ܽ᩵֨;->᩸:Ljava/util/function/Predicate;

    invoke-virtual {p1, v1, v0}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object p1

    .line 1085
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
