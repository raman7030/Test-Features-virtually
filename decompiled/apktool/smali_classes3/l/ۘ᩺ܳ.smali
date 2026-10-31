.class public final Ll/ۘ᩺ܳ;
.super Ll/۬ۗܿ;
.source "L1Y0"


# instance fields
.field public final synthetic ֫֫:Ljava/lang/String;

.field public final synthetic ۟:Ll/ᩴ᩺ܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ljava/lang/String;Ll/ᩴ᩺ܳ;)V
    .locals 0

    .line 56
    iput-object p2, p0, Ll/ۘ᩺ܳ;->֫֫:Ljava/lang/String;

    iput-object p3, p0, Ll/ۘ᩺ܳ;->۟:Ll/ᩴ᩺ܳ;

    const/4 p2, -0x1

    .line 40
    invoke-direct {p0, p1, p2}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 60
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\"

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    iget-object v1, p0, Ll/ۘ᩺ܳ;->֫֫:Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_1

    const v0, 0x7f1203a1

    .line 66
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 69
    :cond_1
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    .line 70
    iget-object v1, p0, Ll/ۘ᩺ܳ;->۟:Ll/ᩴ᩺ܳ;

    invoke-interface {v1, v0}, Ll/ᩴ᩺ܳ;->֫(Ljava/lang/String;)V

    return-void

    :cond_2
    :goto_0
    const v0, 0x7f1203ae

    .line 62
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void
.end method
