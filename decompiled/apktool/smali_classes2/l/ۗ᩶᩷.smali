.class public final Ll/ۗ᩶᩷;
.super Ll/۬ۗܿ;
.source "K6KF"


# instance fields
.field public final synthetic ۟:Ll/۬᩶᩷;


# direct methods
.method public constructor <init>(Ll/۬᩶᩷;Ll/ۗܺ᩷;)V
    .locals 0

    .line 59
    iput-object p1, p0, Ll/ۗ᩶᩷;->۟:Ll/۬᩶᩷;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 2

    .line 62
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-static {v0}, Ll/ۨ֡ܿ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const v0, 0x7f120056

    .line 64
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 67
    :cond_0
    invoke-static {v0}, Ll/ۨ֡ܿ;->ۧ(Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Ll/ۗ᩶᩷;->۟:Ll/۬᩶᩷;

    invoke-static {v0}, Ll/۬᩶᩷;->֫(Ll/۬᩶᩷;)V

    .line 69
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
