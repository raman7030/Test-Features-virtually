.class public final synthetic Ll/᩻ᩴ۠;
.super Ljava/lang/Object;
.source "640U"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/ۜᩴ۠;


# direct methods
.method public synthetic constructor <init>(Ll/ۜᩴ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ᩴ۠;->᩸:Ll/ۜᩴ۠;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩻ᩴ۠;->᩸:Ll/ۜᩴ۠;

    .line 4
    check-cast p1, Ll/ܿ᩵۠;

    .line 1645
    invoke-virtual {v0, p1}, Ll/ۜᩴ۠;->֫(Ll/ܿ᩵۠;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
