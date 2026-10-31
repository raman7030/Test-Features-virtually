.class public final Ll/᩻᩻ᩳ;
.super Ll/᩵ܳᩳ;
.source "SB38"


# instance fields
.field public final synthetic ۟:Ljava/lang/String;

.field public final synthetic ܰ:Ljava/util/function/Consumer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 0

    .line 47
    iput-object p1, p0, Ll/᩻᩻ᩳ;->۟:Ljava/lang/String;

    iput-object p2, p0, Ll/᩻᩻ᩳ;->ܰ:Ljava/util/function/Consumer;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/᩵ܳᩳ;-><init>(Ll/ۗܺ᩷;)V

    return-void
.end method


# virtual methods
.method public final cryptoGetTextPassword()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/᩻᩻ᩳ;->۟:Ljava/lang/String;

    return-object v0
.end method

.method public final ۖ(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 61
    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iget-object v0, p0, Ll/᩻᩻ᩳ;->ܰ:Ljava/util/function/Consumer;

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
