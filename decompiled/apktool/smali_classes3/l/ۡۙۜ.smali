.class public final synthetic Ll/ۡۙۜ;
.super Ljava/lang/Object;
.source "M74S"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic ۙ:Ll/᩻ۙۜ;

.field public final synthetic ᩶:Ll/ᩴۙۜ;

.field public final synthetic ᩸:Ll/ۚۖۡ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۚۖۡ;Ljava/lang/String;Ll/ᩴۙۜ;Ll/᩻ۙۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۙۜ;->᩸:Ll/ۚۖۡ;

    iput-object p2, p0, Ll/ۡۙۜ;->᩹:Ljava/lang/String;

    iput-object p3, p0, Ll/ۡۙۜ;->᩶:Ll/ᩴۙۜ;

    iput-object p4, p0, Ll/ۡۙۜ;->ۙ:Ll/᩻ۙۜ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/ܳۙۜ;

    .line 4
    check-cast p2, Ljava/lang/Boolean;

    .line 90
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Ll/ۡۙۜ;->᩹:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Ll/ۡۙۜ;->᩸:Ll/ۚۖۡ;

    invoke-virtual {v0, v1}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    .line 92
    invoke-virtual {v0}, Ll/ۚۖۡ;->ܳ()V

    .line 94
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p0, Ll/ۡۙۜ;->᩶:Ll/ᩴۙۜ;

    invoke-virtual {v0, v1, p1, p2}, Ll/ᩴۙۜ;->֫(Ljava/lang/String;Ll/ܳۙۜ;Z)V

    .line 95
    iget-object p1, p0, Ll/ۡۙۜ;->ۙ:Ll/᩻ۙۜ;

    invoke-virtual {p1}, Ll/᩻ۙۜ;->run()V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
