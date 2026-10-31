.class public final Ll/ܰ᩹ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Ll/֫᩶ܳ;


# instance fields
.field public final synthetic ֫:Ll/ܽ᩶ܳ;


# direct methods
.method public constructor <init>(Ll/ܽ᩶ܳ;)V
    .locals 0

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩹ܳ;->֫:Ll/ܽ᩶ܳ;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const v0, 0x7f120b19

    .line 205
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Lbin/mt/plus/Main;)V
    .locals 1

    .line 215
    invoke-static {}, Ll/᩺᩵ۡ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f120757

    .line 216
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 217
    new-instance v0, Ll/֡֡ۡ;

    invoke-direct {v0, p1}, Ll/֡֡ۡ;-><init>(Ll/ۗܺ᩷;)V

    invoke-virtual {v0}, Ll/֡֡ۡ;->֫()V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 219
    invoke-static {p1, v0}, Ll/ۜ᩸᩷;->֫(Ll/ۗܺ᩷;Z)V

    return-void
.end method

.method public final ۧ()Ll/ۨܺ᩷;
    .locals 1

    .line 210
    iget-object v0, p0, Ll/ܰ᩹ܳ;->֫:Ll/ܽ᩶ܳ;

    invoke-static {v0}, Ll/ܽ᩶ܳ;->ܽ(Ll/ܽ᩶ܳ;)Ll/ۨܺ᩷;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
