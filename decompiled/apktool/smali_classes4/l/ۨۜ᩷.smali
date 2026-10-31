.class public Ll/ۨۜ᩷;
.super Ll/۟ۜ᩷;
.source "J7R9"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginViewGroup;


# instance fields
.field public final ܳ:Ljava/util/ArrayList;

.field public ᩻:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Ll/۟ۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V

    .line 15
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۨۜ᩷;->ܳ:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic ֫(Ll/ۨۜ᩷;Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۨۜ᩷;->ܽ(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object p0

    return-object p0
.end method

.method private ܽ(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;
    .locals 4

    .line 40
    invoke-virtual {p0}, Ll/۟ۜ᩷;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 43
    :cond_0
    iget-object v0, p0, Ll/ۨۜ᩷;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 44
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/plugin/api/ui/PluginView;

    invoke-interface {v3, p1}, Lbin/mt/plugin/api/ui/PluginView;->findViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v3

    if-eqz v3, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final getChildAt(I)Lbin/mt/plugin/api/ui/PluginView;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۨۜ᩷;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbin/mt/plugin/api/ui/PluginView;

    return-object p1
.end method

.method public final getChildCount()I
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۨۜ᩷;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;
    .locals 3

    .line 30
    iget-object v0, p0, Ll/ۨۜ᩷;->᩻:Ll/ۧۤᩴ;

    if-eqz v0, :cond_0

    .line 33
    new-instance v1, Ll/ۛۜ᩷;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/ۛۜ᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, p1, v1}, Ll/ᩳۤᩴ;->computeIfAbsent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbin/mt/plugin/api/ui/PluginView;

    return-object p1

    .line 36
    :cond_0
    invoke-direct {p0, p1}, Ll/ۨۜ᩷;->ܽ(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Lbin/mt/plugin/api/ui/PluginView;)V
    .locals 2

    .line 23
    move-object v0, p1

    check-cast v0, Ll/۟ۜ᩷;

    .line 24
    iget-object v1, p0, Ll/ۨۜ᩷;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, v0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 53
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ۨۜ᩷;->᩻:Ll/ۧۤᩴ;

    return-void
.end method
