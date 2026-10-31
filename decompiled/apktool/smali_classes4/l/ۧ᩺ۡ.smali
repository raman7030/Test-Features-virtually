.class public final synthetic Ll/ۧ᩺ۡ;
.super Ljava/lang/Object;
.source "UAO5"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ljava/util/ArrayList;

.field public final synthetic ᩹:Ll/ܺۢᩴ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ll/ܺۢᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ᩺ۡ;->᩸:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/ۧ᩺ۡ;->᩹:Ll/ܺۢᩴ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ll/ᩳ᩺ۡ;

    .line 43
    iget-object v0, p0, Ll/ۧ᩺ۡ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    invoke-static {p1}, Ll/ᩳ᩺ۡ;->֫(Ll/ᩳ᩺ۡ;)I

    move-result p1

    iget-object v0, p0, Ll/ۧ᩺ۡ;->᩹:Ll/ܺۢᩴ;

    invoke-virtual {v0, p1}, Ll/ܺۢᩴ;->add(I)Z

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
