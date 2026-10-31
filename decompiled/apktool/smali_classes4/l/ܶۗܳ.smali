.class public final Ll/ܶۗܳ;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Ll/۬ۗܳ;


# instance fields
.field public final synthetic ᩶:Ll/۬ۗܳ;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۗܳ;->᩶:Ll/۬ۗܳ;

    iput-object p2, p0, Ll/ܶۗܳ;->᩸:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ܶۗܳ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ܶۗܳ;->᩶:Ll/۬ۗܳ;

    invoke-interface {v0}, Ll/۬ۗܳ;->onCanceled()V

    return-void
.end method

.method public final ֫(Ll/ۨۧᩳ;Z)V
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ܶۗܳ;->᩶:Ll/۬ۗܳ;

    invoke-interface {v0, p1, p2}, Ll/۬ۗܳ;->֫(Ll/ۨۧᩳ;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)Z
    .locals 3

    .line 86
    instance-of v0, p1, Ll/᩸ܿᩳ;

    iget-object v1, p0, Ll/ܶۗܳ;->᩶:Ll/۬ۗܳ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܶۗܳ;->᩸:Ll/ۗܺ᩷;

    if-eqz v0, :cond_0

    .line 88
    new-instance p1, Ll/۠ۗܳ;

    iget-object v2, p0, Ll/ܶۗܳ;->᩹:Ljava/lang/String;

    invoke-direct {p1, v1, v0, v2}, Ll/۠ۗܳ;-><init>(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1

    .line 91
    :cond_0
    invoke-interface {v1, p1}, Ll/۬ۗܳ;->֫(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method
