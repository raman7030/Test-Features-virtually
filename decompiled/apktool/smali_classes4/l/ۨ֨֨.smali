.class public final synthetic Ll/ۨ֨֨;
.super Ljava/lang/Object;
.source "K7QZ"

# interfaces
.implements Ljava/util/function/BinaryOperator;


# instance fields
.field public final synthetic ᩸:Ll/ܿ۠֨;


# direct methods
.method public synthetic constructor <init>(Ll/ܿ۠֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ֨֨;->᩸:Ll/ܿ۠֨;

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
    check-cast p1, Ll/֫۠֨;

    .line 4
    check-cast p2, Ll/֫۠֨;

    .line 6
    iget-object v0, p0, Ll/ۨ֨֨;->᩸:Ll/ܿ۠֨;

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    sget-object v0, Ll/֫۠֨;->ۙ:Ll/֫۠֨;

    if-ne p1, v0, :cond_0

    return-object p2

    :cond_0
    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    if-eq p1, p2, :cond_2

    .line 193
    sget-object p1, Ll/֫۠֨;->᩹:Ll/֫۠֨;

    :cond_2
    :goto_0
    return-object p1
.end method
