.class public final Ll/ܶ᩹᩷;
.super Ljava/lang/Object;
.source "12AL"


# static fields
.field public static ֫:Ll/᩸᩹᩷;


# direct methods
.method public static ֫()Lbin/mt/plus/Main;
    .locals 1

    .line 29
    sget-object v0, Ll/ܶ᩹᩷;->֫:Ll/᩸᩹᩷;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 31
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbin/mt/plus/Main;

    return-object v0
.end method

.method public static ֫(Lbin/mt/plus/Main;)V
    .locals 1

    .line 12
    new-instance v0, Ll/᩸᩹᩷;

    .line 10
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    sput-object v0, Ll/ܶ᩹᩷;->֫:Ll/᩸᩹᩷;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 1

    .line 41
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 43
    invoke-virtual {v0}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 54
    invoke-virtual {v0, p0}, Ll/ۢۘܳ;->֫(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static ۧ()V
    .locals 1

    .line 41
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 43
    invoke-virtual {v0}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {v0}, Ll/ۢۘܳ;->֨()V

    :cond_0
    return-void
.end method

.method public static ۧ(Lbin/mt/plus/Main;)V
    .locals 1

    .line 22
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 p0, 0x0

    .line 23
    sput-object p0, Ll/ܶ᩹᩷;->֫:Ll/᩸᩹᩷;

    :cond_0
    return-void
.end method
