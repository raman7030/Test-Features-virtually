.class public final Ll/ۚۙ᩻;
.super Ljava/lang/Object;
.source "R5YB"

# interfaces
.implements Ll/۬ۗܳ;


# instance fields
.field public final synthetic ᩸:Ll/᩸ۙ᩻;


# direct methods
.method public constructor <init>(Ll/᩸ۙ᩻;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۙ᩻;->᩸:Ll/᩸ۙ᩻;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۚۙ᩻;->᩸:Ll/᩸ۙ᩻;

    invoke-virtual {v0}, Ll/᩸ۙ᩻;->֫()V

    return-void
.end method

.method public final ֫(Ll/ۨۧᩳ;Z)V
    .locals 2

    .line 82
    new-instance v0, Ll/ܶۙ᩻;

    iget-object v1, p0, Ll/ۚۙ᩻;->᩸:Ll/᩸ۙ᩻;

    invoke-direct {v0, v1, p1, p2}, Ll/ܶۙ᩻;-><init>(Ll/᩸ۙ᩻;Ll/ۨۧᩳ;Z)V

    .line 288
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)Z
    .locals 2

    .line 72
    iget-object v0, p0, Ll/ۚۙ᩻;->᩸:Ll/᩸ۙ᩻;

    invoke-static {v0}, Ll/᩸ۙ᩻;->ᩳ(Ll/᩸ۙ᩻;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    new-instance v1, Ll/֡ۙ᩻;

    invoke-direct {v1, p0}, Ll/֡ۙ᩻;-><init>(Ll/ۚۙ᩻;)V

    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    const/4 p1, 0x1

    return p1
.end method
