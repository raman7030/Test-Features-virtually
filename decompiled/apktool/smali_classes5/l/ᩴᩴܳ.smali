.class public final synthetic Ll/ᩴᩴܳ;
.super Ljava/lang/Object;
.source "715M"

# interfaces
.implements Ll/᩻᩷ۡ;


# instance fields
.field public final synthetic ֫:Ll/ۢۘܳ;

.field public final synthetic ۧ:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Ll/ۢۘܳ;Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴᩴܳ;->֫:Ll/ۢۘܳ;

    iput-object p2, p0, Ll/ᩴᩴܳ;->ۧ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ֫(F)V
    .locals 3

    .line 138
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "bookmark_swipe_pos_aware"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Ll/ᩴᩴܳ;->ۧ:Lbin/mt/plus/Main;

    invoke-virtual {v0}, Lbin/mt/plus/Main;->۟()Ll/᩵᩷ۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵᩷ۡ;->ܿ()Z

    move-result v0

    iget-object v1, p0, Ll/ᩴᩴܳ;->֫:Ll/ۢۘܳ;

    invoke-virtual {v1, v0, p1}, Ll/ۢۘܳ;->֫(ZF)V

    :cond_0
    return-void
.end method
