.class public final synthetic Ll/ᩴ۫᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:Ll/ܿۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ܿۛ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ۫᩷;->᩸:Ll/ܿۛ᩷;

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
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ᩴ۫᩷;->᩸:Ll/ܿۛ᩷;

    check-cast p1, Ll/ܳۛ᩷;

    invoke-static {v0, p1}, Ll/ܿۛ᩷;->֫(Ll/ܿۛ᩷;Ll/ܳۛ᩷;)Ljava/lang/Boolean;

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
