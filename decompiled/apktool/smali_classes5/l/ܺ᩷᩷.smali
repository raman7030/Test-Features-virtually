.class public abstract Ll/ܺ᩷᩷;
.super Ll/ۢ᩷᩷;
.source "B7NW"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginBaseViewGroupBuilder;


# instance fields
.field public final ۘ:Ll/ۡ᩷᩷;

.field public ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 38
    new-instance p1, Ll/ۡ᩷᩷;

    invoke-direct {p1, p0}, Ll/ۡ᩷᩷;-><init>(Ll/ܺ᩷᩷;)V

    iput-object p1, p0, Ll/ܺ᩷᩷;->ۘ:Ll/ۡ᩷᩷;

    .line 43
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    return-void
.end method


# virtual methods
.method public children(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ܺ᩷᩷;->ۘ:Ll/ۡ᩷᩷;

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/util/Consumer;->accept(Ljava/lang/Object;)V

    return-object p0
.end method

.method public childrenStyle(Lbin/mt/plugin/api/ui/PluginUI$Style;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 2

    .line 54
    instance-of v0, p1, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;

    invoke-virtual {v0}, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->getBaseStyle()Lbin/mt/plugin/api/ui/PluginUI$Style;

    move-result-object v1

    if-nez v1, :cond_0

    .line 55
    iget-object v1, p0, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, v1}, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->attachStyle(Lbin/mt/plugin/api/ui/PluginUI$Style;)V

    :cond_0
    const-string v0, "Style cannot be null"

    .line 57
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    return-object p0
.end method

.method public getChildrenStyle()Lbin/mt/plugin/api/ui/PluginUI$Style;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    return-object v0
.end method

.method public bridge synthetic ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/۟ۜ᩷;
    .locals 0

    .line 37
    invoke-virtual {p0, p1, p2, p3}, Ll/ܺ᩷᩷;->֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/ۨۜ᩷;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/ۨۜ᩷;
    .locals 3

    .line 69
    invoke-super {p0, p1, p2, p3}, Ll/ۢ᩷᩷;->֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/۟ۜ᩷;

    move-result-object p2

    check-cast p2, Ll/ۨۜ᩷;

    .line 70
    iget-object v0, p0, Ll/ܺ᩷᩷;->ۘ:Ll/ۡ᩷᩷;

    iget-object v1, v0, Ll/ۡ᩷᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢ᩷᩷;

    .line 71
    invoke-virtual {v2, p1, p2, p3}, Ll/ۢ᩷᩷;->֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/۟ۜ᩷;

    move-result-object v2

    invoke-virtual {p2, v2}, Ll/ۨۜ᩷;->֫(Lbin/mt/plugin/api/ui/PluginView;)V

    goto :goto_0

    .line 73
    :cond_0
    iget-object p1, v0, Ll/ۡ᩷᩷;->ܽ:Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    .line 75
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/String;

    .line 76
    invoke-virtual {p2, p3}, Ll/۟ۜ᩷;->unifyWidth([Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    return-object p2
.end method
