.class public final Ll/ۖ᩷֫;
.super Ljava/lang/Object;
.source "6218"

# interfaces
.implements Ll/ۙۢ֫;
.implements Ll/᩹۫ۧ;
.implements Ll/۬ܺ֫;


# instance fields
.field public final ۗ:Ll/ۗܺ֫;

.field public ۙ:Ll/᩸۫ۧ;

.field public ᩶:Ll/᩷ۡ֫;

.field public ᩸:Ll/ܶܺ֫;

.field public final ᩹:Ll/ۡ᩻֫;


# direct methods
.method public constructor <init>(Ll/ۡ᩻֫;Ll/ۗܺ֫;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Ll/ۖ᩷֫;->᩶:Ll/᩷ۡ֫;

    .line 51
    iput-object v0, p0, Ll/ۖ᩷֫;->ۙ:Ll/᩸۫ۧ;

    .line 54
    iput-object p1, p0, Ll/ۖ᩷֫;->᩹:Ll/ۡ᩻֫;

    .line 55
    iput-object p2, p0, Ll/ۖ᩷֫;->ۗ:Ll/ۗܺ֫;

    return-void
.end method


# virtual methods
.method public final getDefaultViewModelCreationExtras()Ll/۟ܺ֫;
    .locals 5

    .line 142
    iget-object v0, p0, Ll/ۖ᩷֫;->᩹:Ll/ۡ᩻֫;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 143
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    .line 144
    instance-of v2, v1, Landroid/app/Application;

    if-eqz v2, :cond_0

    .line 145
    check-cast v1, Landroid/app/Application;

    goto :goto_1

    .line 148
    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 150
    :goto_1
    new-instance v2, Ll/ܽۖ֫;

    invoke-direct {v2}, Ll/ܽۖ֫;-><init>()V

    if-eqz v1, :cond_2

    .line 152
    sget-object v3, Ll/۠ܺ֫;->ᩳ:Ll/ܰܺ֫;

    .line 61
    invoke-virtual {v2}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-interface {v4, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    :cond_2
    sget-object v1, Ll/᩷ܺ֫;->ۧ:Ll/ܳܺ֫;

    .line 61
    invoke-virtual {v2}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    sget-object v1, Ll/᩷ܺ֫;->ܽ:Ll/᩻ܺ֫;

    .line 61
    invoke-virtual {v2}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    invoke-virtual {v0}, Ll/ۡ᩻֫;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 157
    invoke-virtual {v0}, Ll/ۡ᩻֫;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 61
    invoke-virtual {v2}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v1

    sget-object v3, Ll/᩷ܺ֫;->֫:Ll/ܿܺ֫;

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v2
.end method

.method public final getDefaultViewModelProviderFactory()Ll/ܶܺ֫;
    .locals 3

    .line 110
    iget-object v0, p0, Ll/ۖ᩷֫;->᩹:Ll/ۡ᩻֫;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->getDefaultViewModelProviderFactory()Ll/ܶܺ֫;

    move-result-object v1

    .line 112
    iget-object v2, v0, Ll/ۡ᩻֫;->mDefaultFactory:Ll/ܶܺ֫;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 113
    iput-object v1, p0, Ll/ۖ᩷֫;->᩸:Ll/ܶܺ֫;

    return-object v1

    .line 117
    :cond_0
    iget-object v1, p0, Ll/ۖ᩷֫;->᩸:Ll/ܶܺ֫;

    if-nez v1, :cond_3

    .line 119
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 120
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_2

    .line 121
    instance-of v2, v1, Landroid/app/Application;

    if-eqz v2, :cond_1

    .line 122
    check-cast v1, Landroid/app/Application;

    goto :goto_1

    .line 125
    :cond_1
    check-cast v1, Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 128
    :goto_1
    new-instance v2, Ll/ۖܺ֫;

    .line 131
    invoke-virtual {v0}, Ll/ۡ᩻֫;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {v2, v1, p0, v0}, Ll/ۖܺ֫;-><init>(Landroid/app/Application;Ll/᩹۫ۧ;Landroid/os/Bundle;)V

    iput-object v2, p0, Ll/ۖ᩷֫;->᩸:Ll/ܶܺ֫;

    .line 134
    :cond_3
    iget-object v0, p0, Ll/ۖ᩷֫;->᩸:Ll/ܶܺ֫;

    return-object v0
.end method

.method public final getLifecycle()Ll/۟ۢ֫;
    .locals 1

    .line 87
    invoke-virtual {p0}, Ll/ۖ᩷֫;->֫()V

    .line 88
    iget-object v0, p0, Ll/ۖ᩷֫;->᩶:Ll/᩷ۡ֫;

    return-object v0
.end method

.method public final getSavedStateRegistry()Ll/ܶ۫ۧ;
    .locals 1

    .line 165
    invoke-virtual {p0}, Ll/ۖ᩷֫;->֫()V

    .line 166
    iget-object v0, p0, Ll/ۖ᩷֫;->ۙ:Ll/᩸۫ۧ;

    invoke-virtual {v0}, Ll/᩸۫ۧ;->֫()Ll/ܶ۫ۧ;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModelStore()Ll/ۗܺ֫;
    .locals 1

    .line 61
    invoke-virtual {p0}, Ll/ۖ᩷֫;->֫()V

    .line 62
    iget-object v0, p0, Ll/ۖ᩷֫;->ۗ:Ll/ۗܺ֫;

    return-object v0
.end method

.method public final ֫()V
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ۖ᩷֫;->᩶:Ll/᩷ۡ֫;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Ll/᩷ۡ֫;

    invoke-direct {v0, p0}, Ll/᩷ۡ֫;-><init>(Ll/᩻ۡ֫;)V

    iput-object v0, p0, Ll/ۖ᩷֫;->᩶:Ll/᩷ۡ֫;

    .line 92
    new-instance v0, Ll/᩸۫ۧ;

    invoke-direct {v0, p0}, Ll/᩸۫ۧ;-><init>(Ll/᩹۫ۧ;)V

    .line 71
    iput-object v0, p0, Ll/ۖ᩷֫;->ۙ:Ll/᩸۫ۧ;

    .line 72
    invoke-virtual {v0}, Ll/᩸۫ۧ;->ۧ()V

    .line 73
    invoke-static {p0}, Ll/᩷ܺ֫;->֫(Ll/᩹۫ۧ;)V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/os/Bundle;)V
    .locals 1

    .line 170
    iget-object v0, p0, Ll/ۖ᩷֫;->ۙ:Ll/᩸۫ۧ;

    invoke-virtual {v0, p1}, Ll/᩸۫ۧ;->֫(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ֫(Ll/ܰۢ֫;)V
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۖ᩷֫;->᩶:Ll/᩷ۡ֫;

    invoke-virtual {v0, p1}, Ll/᩷ۡ֫;->֫(Ll/ܰۢ֫;)V

    return-void
.end method

.method public final ֫(Ll/᩺ۢ֫;)V
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ۖ᩷֫;->᩶:Ll/᩷ۡ֫;

    invoke-virtual {v0, p1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public final ۧ(Landroid/os/Bundle;)V
    .locals 1

    .line 174
    iget-object v0, p0, Ll/ۖ᩷֫;->ۙ:Ll/᩸۫ۧ;

    invoke-virtual {v0, p1}, Ll/᩸۫ۧ;->ۧ(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۖ᩷֫;->᩶:Ll/᩷ۡ֫;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
