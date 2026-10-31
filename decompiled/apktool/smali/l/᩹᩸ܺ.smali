.class public final Ll/᩹᩸ܺ;
.super Ll/ۢۙܺ;
.source "E3QI"


# instance fields
.field public final synthetic ᩹:Ll/᩶᩸ܺ;


# direct methods
.method public constructor <init>(Ll/᩶᩸ܺ;Ll/᩻᩶ܺ;)V
    .locals 0

    .line 3798
    iput-object p1, p0, Ll/᩹᩸ܺ;->᩹:Ll/᩶᩸ܺ;

    invoke-direct {p0, p2}, Ll/ۢۙܺ;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 3798
    check-cast p1, Ll/᩻᩶ܺ;

    .line 3801
    invoke-interface {p1}, Ll/᩻᩶ܺ;->᩻()Ll/᩻᩶ܺ;

    move-result-object p1

    .line 3802
    iget-object v0, p0, Ll/᩹᩸ܺ;->᩹:Ll/᩶᩸ܺ;

    iget-object v0, v0, Ll/᩶᩸ܺ;->᩸:Ll/᩸᩸ܺ;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method
