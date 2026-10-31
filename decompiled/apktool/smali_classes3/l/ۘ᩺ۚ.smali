.class public final synthetic Ll/ۘ᩺ۚ;
.super Ljava/lang/Object;
.source "B7FA"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ljava/util/ArrayList;

.field public final synthetic ᩹:Ljava/util/function/Function;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/util/function/Function;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ᩺ۚ;->᩸:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/ۘ᩺ۚ;->᩹:Ljava/util/function/Function;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۘ᩺ۚ;->᩹:Ljava/util/function/Function;

    .line 4
    check-cast p1, Ll/᩹ᩳ֨;

    .line 161
    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۤۚ;

    iget-object v0, p0, Ll/ۘ᩺ۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
