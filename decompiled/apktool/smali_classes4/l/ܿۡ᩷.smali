.class public final synthetic Ll/ܿۡ᩷;
.super Ljava/lang/Object;
.source "R7YU"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܳۡ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ܳۡ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۡ᩷;->᩸:Ll/ܳۡ᩷;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget-object v0, p0, Ll/ܿۡ᩷;->᩸:Ll/ܳۡ᩷;

    .line 216
    iget-object v0, v0, Ll/ܳۡ᩷;->ܳ:Ll/ۜۡ᩷;

    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 218
    invoke-static {v0}, Ll/ۜۡ᩷;->֫(Ll/ۜۡ᩷;)Ll/᩻ۡ᩷;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ۡ᩷;->ܿ(Ll/᩻ۡ᩷;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const v3, 0x7f120491

    .line 425
    invoke-virtual {v1, v3, v0, v2}, Ll/ۗܺ᩷;->֫(ILjava/lang/String;Z)V

    return-void

    .line 220
    :cond_0
    invoke-static {v0}, Ll/ۜۡ᩷;->֫(Ll/ۜۡ᩷;)Ll/᩻ۡ᩷;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ۡ᩷;->ܿ(Ll/᩻ۡ᩷;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method
