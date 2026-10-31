.class public final synthetic Ll/ܺ֨ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/ۢۘᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۢۘᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ֨ᩳ;->᩸:Ll/ۢۘᩳ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    .line 35
    check-cast p1, Ljava/lang/Boolean;

    .line 52
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܺ֨ᩳ;->֫(Z)V

    return-void
.end method

.method public final andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 83
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Z)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܺ֨ᩳ;->᩸:Ll/ۢۘᩳ;

    invoke-virtual {v0, p1}, Ll/ۢۘᩳ;->ܳ(Z)V

    return-void
.end method
