.class public abstract Ll/ۗܶۢ;
.super Ll/ۘ۠ۢ;
.source "6AJA"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ll/ۘ۠ۢ;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۗܶۢ;Ll/۬۬ܿ;)V
    .locals 1

    .line 32
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ܶ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۜ֫()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/۬۬ܿ;->֫(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ۧ(Ll/ۗܺ᩷;)Ll/֡ۚۢ;
    .locals 3

    .line 26
    new-instance v0, Ll/۬۬ܿ;

    invoke-direct {v0, p1}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;)V

    .line 28
    new-instance v1, Ll/ܶ᩶۠;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/ܶ᩶۠;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    .line 29
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->֫(Ll/ۗܺ᩷;)V

    .line 31
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۚ()Ll/ۚۡ֫;

    move-result-object p1

    invoke-virtual {v0}, Ll/۬۬ܿ;->ۧ()Ll/֡ۚۢ;

    move-result-object v1

    new-instance v2, Ll/ۙܶۢ;

    invoke-direct {v2, p0, v0}, Ll/ۙܶۢ;-><init>(Ll/ۗܶۢ;Ll/۬۬ܿ;)V

    invoke-virtual {p1, v1, v2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 36
    invoke-virtual {v0}, Ll/۬۬ܿ;->ܳ()V

    invoke-virtual {v0}, Ll/۬۬ܿ;->ۧ()Ll/֡ۚۢ;

    move-result-object p1

    return-object p1
.end method
