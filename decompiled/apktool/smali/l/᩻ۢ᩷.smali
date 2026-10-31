.class public Ll/᩻ۢ᩷;
.super Ljava/lang/Object;
.source "U7JF"

# interfaces
.implements Lbin/mt/plugin/api/ui/menu/PluginMenu;


# instance fields
.field public final ֫:Lbin/mt/plugin/api/PluginContext;

.field public final ۧ:Ll/۫ᩴᩴ;

.field public final ܽ:Ll/᩺۬;

.field public ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/PluginContext;Ll/᩺۬;Ll/۫ᩴᩴ;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩻ۢ᩷;->ᩳ:Ljava/util/ArrayList;

    .line 32
    iput-object p1, p0, Ll/᩻ۢ᩷;->֫:Lbin/mt/plugin/api/PluginContext;

    .line 33
    iput-object p2, p0, Ll/᩻ۢ᩷;->ܽ:Ll/᩺۬;

    .line 34
    iput-object p3, p0, Ll/᩻ۢ᩷;->ۧ:Ll/۫ᩴᩴ;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 2

    .line 46
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 51
    invoke-virtual {p0, v0, p1, v1}, Ll/᩻ۢ᩷;->add(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;

    move-result-object p1

    return-object p1
.end method

.method public final add(Ljava/lang/String;Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 1

    const/4 v0, 0x0

    .line 51
    invoke-virtual {p0, p1, p2, v0}, Ll/᩻ۢ᩷;->add(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;

    move-result-object p1

    return-object p1
.end method

.method public final add(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 6

    const-string v0, "title cannot be null"

    .line 56
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 171
    instance-of v0, p2, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x3

    if-lt v2, v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x7b

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    .line 0
    invoke-static {v2, v0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v2

    const/16 v3, 0x7d

    if-ne v2, v3, :cond_0

    .line 172
    iget-object v2, p0, Ll/᩻ۢ᩷;->֫:Lbin/mt/plugin/api/PluginContext;

    invoke-interface {v2, v0}, Lbin/mt/plugin/api/PluginContext;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p2, v0

    .line 58
    :cond_0
    invoke-virtual {p0, p3}, Ll/᩻ۢ᩷;->֫(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, p1}, Ll/᩻ۢ᩷;->֫(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Ll/᩻ۢ᩷;->ܽ:Ll/᩺۬;

    invoke-interface {v3, v0, v2, v1, p2}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Ll/ܰ۬;

    .line 59
    new-instance p2, Ll/ۜۢ᩷;

    iget-object v1, p0, Ll/᩻ۢ᩷;->֫:Lbin/mt/plugin/api/PluginContext;

    const/4 v5, 0x0

    move-object v0, p2

    move-object v2, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Ll/ۜۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;Ljava/lang/String;Ll/ܰ۬;Ll/ۡۢ᩷;)V

    .line 60
    iget-object p1, p0, Ll/᩻ۢ᩷;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p2
.end method

.method public final addSubMenu(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/menu/PluginSubMenu;
    .locals 2

    .line 66
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 71
    invoke-virtual {p0, v0, p1, v1}, Ll/᩻ۢ᩷;->addSubMenu(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/ui/menu/PluginSubMenu;

    move-result-object p1

    return-object p1
.end method

.method public final addSubMenu(Ljava/lang/String;Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/menu/PluginSubMenu;
    .locals 1

    const/4 v0, 0x0

    .line 71
    invoke-virtual {p0, p1, p2, v0}, Ll/᩻ۢ᩷;->addSubMenu(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/ui/menu/PluginSubMenu;

    move-result-object p1

    return-object p1
.end method

.method public final addSubMenu(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/ui/menu/PluginSubMenu;
    .locals 6

    const-string v0, "title cannot be null"

    .line 76
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 171
    instance-of v0, p2, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x3

    if-lt v2, v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x7b

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    .line 0
    invoke-static {v2, v0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v2

    const/16 v3, 0x7d

    if-ne v2, v3, :cond_0

    .line 172
    iget-object v2, p0, Ll/᩻ۢ᩷;->֫:Lbin/mt/plugin/api/PluginContext;

    invoke-interface {v2, v0}, Lbin/mt/plugin/api/PluginContext;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p2, v0

    .line 78
    :cond_0
    invoke-virtual {p0, p3}, Ll/᩻ۢ᩷;->֫(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, p1}, Ll/᩻ۢ᩷;->֫(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Ll/᩻ۢ᩷;->ܽ:Ll/᩺۬;

    invoke-interface {v3, v0, v2, v1, p2}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Ll/᩵᩷;

    .line 79
    new-instance p2, Ll/ۡۢ᩷;

    iget-object v1, p0, Ll/᩻ۢ᩷;->֫:Lbin/mt/plugin/api/PluginContext;

    iget-object v5, p0, Ll/᩻ۢ᩷;->ۧ:Ll/۫ᩴᩴ;

    move-object v0, p2

    move-object v2, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Ll/ۡۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;Ljava/lang/String;Ll/᩵᩷;Ll/۫ᩴᩴ;)V

    .line 80
    iget-object p1, p0, Ll/᩻ۢ᩷;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ll/ۡۢ᩷;->getItem()Ll/ۜۢ᩷;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p2
.end method

.method public final clear()V
    .locals 1

    .line 151
    iget-object v0, p0, Ll/᩻ۢ᩷;->ܽ:Ll/᩺۬;

    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 152
    iget-object v0, p0, Ll/᩻ۢ᩷;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final bridge synthetic findItem(Ljava/lang/String;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Ll/᩻ۢ᩷;->findItem(Ljava/lang/String;)Ll/ۜۢ᩷;

    move-result-object p1

    return-object p1
.end method

.method public final findItem(Ljava/lang/String;)Ll/ۜۢ᩷;
    .locals 3

    .line 86
    iget-object v0, p0, Ll/᩻ۢ᩷;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۢ᩷;

    .line 87
    invoke-virtual {v1}, Ll/ۜۢ᩷;->getItemId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    .line 90
    :cond_1
    invoke-virtual {v1}, Ll/ۜۢ᩷;->hasSubMenu()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 91
    invoke-virtual {v1}, Ll/ۜۢ᩷;->getSubMenu()Ll/ۡۢ᩷;

    move-result-object v1

    .line 92
    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    invoke-virtual {v1, p1}, Ll/᩻ۢ᩷;->findItem(Ljava/lang/String;)Ll/ۜۢ᩷;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getItem(I)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 1

    .line 121
    iget-object v0, p0, Ll/᩻ۢ᩷;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbin/mt/plugin/api/ui/menu/PluginMenuItem;

    return-object p1
.end method

.method public final setGroupCheckable(Ljava/lang/String;ZZ)V
    .locals 1

    .line 131
    iget-object v0, p0, Ll/᩻ۢ᩷;->ܽ:Ll/᩺۬;

    invoke-virtual {p0, p1}, Ll/᩻ۢ᩷;->֫(Ljava/lang/String;)I

    move-result p1

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Menu;->setGroupCheckable(IZZ)V

    return-void
.end method

.method public final setGroupDividerEnabled(Z)V
    .locals 1

    .line 146
    iget-object v0, p0, Ll/᩻ۢ᩷;->ܽ:Ll/᩺۬;

    invoke-interface {v0, p1}, Ll/᩺۬;->setGroupDividerEnabled(Z)V

    return-void
.end method

.method public final setGroupEnabled(Ljava/lang/String;Z)V
    .locals 1

    .line 141
    iget-object v0, p0, Ll/᩻ۢ᩷;->ܽ:Ll/᩺۬;

    invoke-virtual {p0, p1}, Ll/᩻ۢ᩷;->֫(Ljava/lang/String;)I

    move-result p1

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupEnabled(IZ)V

    return-void
.end method

.method public final setGroupVisible(Ljava/lang/String;Z)V
    .locals 1

    .line 136
    iget-object v0, p0, Ll/᩻ۢ᩷;->ܽ:Ll/᩺۬;

    invoke-virtual {p0, p1}, Ll/᩻ۢ᩷;->֫(Ljava/lang/String;)I

    move-result p1

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupVisible(IZ)V

    return-void
.end method

.method public final size()I
    .locals 1

    .line 126
    iget-object v0, p0, Ll/᩻ۢ᩷;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final declared-synchronized ֫(Ljava/lang/String;)I
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    if-nez p1, :cond_0

    .line 39
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    .line 41
    :cond_0
    :try_start_0
    iget-object v1, p0, Ll/᩻ۢ᩷;->ۧ:Ll/۫ᩴᩴ;

    new-instance v2, Ll/ܳۢ᩷;

    invoke-direct {v2, p0}, Ll/ܳۢ᩷;-><init>(Ll/᩻ۢ᩷;)V

    invoke-interface {v1, p1, v2}, Ll/۫ᩴᩴ;->֫(Ljava/lang/String;Ll/ܳۢ᩷;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(I)Ll/ۜۢ᩷;
    .locals 3

    .line 103
    iget-object v0, p0, Ll/᩻ۢ᩷;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۢ᩷;

    .line 104
    iget-object v2, v1, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    if-ne v2, p1, :cond_1

    return-object v1

    .line 107
    :cond_1
    invoke-virtual {v1}, Ll/ۜۢ᩷;->hasSubMenu()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 108
    invoke-virtual {v1}, Ll/ۜۢ᩷;->getSubMenu()Ll/ۡۢ᩷;

    move-result-object v1

    .line 109
    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    invoke-virtual {v1, p1}, Ll/᩻ۢ᩷;->֫(I)Ll/ۜۢ᩷;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
