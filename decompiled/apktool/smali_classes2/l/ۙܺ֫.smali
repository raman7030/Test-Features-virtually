.class public final Ll/ۙܺ֫;
.super Ljava/lang/Object;
.source "V627"


# instance fields
.field public final ֫:Ll/۟ܺ֫;

.field public final ۧ:Ll/ܶܺ֫;

.field public final ܽ:Ll/ۗܺ֫;


# direct methods
.method public constructor <init>(Ll/ۗܺ֫;Ll/ܶܺ֫;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    sget-object v0, Ll/᩺ܺ֫;->ۧ:Ll/᩺ܺ֫;

    .line 51
    invoke-direct {p0, p1, p2, v0}, Ll/ۙܺ֫;-><init>(Ll/ۗܺ֫;Ll/ܶܺ֫;Ll/۟ܺ֫;)V

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ֫;Ll/ܶܺ֫;Ll/۟ܺ֫;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Ll/ۙܺ֫;->ܽ:Ll/ۗܺ֫;

    .line 53
    iput-object p2, p0, Ll/ۙܺ֫;->ۧ:Ll/ܶܺ֫;

    .line 54
    iput-object p3, p0, Ll/ۙܺ֫;->֫:Ll/۟ܺ֫;

    return-void
.end method

.method public constructor <init>(Ll/۬ܺ֫;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    invoke-interface {p1}, Ll/۬ܺ֫;->getViewModelStore()Ll/ۗܺ֫;

    move-result-object v0

    sget-object v1, Ll/۠ܺ֫;->ᩳ:Ll/ܰܺ֫;

    .line 329
    instance-of v1, p1, Ll/ۙۢ֫;

    if-eqz v1, :cond_0

    .line 330
    move-object v2, p1

    check-cast v2, Ll/ۙۢ֫;

    invoke-interface {v2}, Ll/ۙۢ֫;->getDefaultViewModelProviderFactory()Ll/ܶܺ֫;

    move-result-object v2

    goto :goto_0

    .line 225
    :cond_0
    invoke-static {}, Ll/᩹ܺ֫;->֫()Ll/᩹ܺ֫;

    move-result-object v2

    if-nez v2, :cond_1

    .line 226
    new-instance v2, Ll/᩹ܺ֫;

    .line 197
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 226
    invoke-static {v2}, Ll/᩹ܺ֫;->֫(Ll/᩹ܺ֫;)V

    .line 228
    :cond_1
    invoke-static {}, Ll/᩹ܺ֫;->֫()Ll/᩹ܺ֫;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    :goto_0
    if-eqz v1, :cond_2

    .line 363
    check-cast p1, Ll/ۙۢ֫;

    invoke-interface {p1}, Ll/ۙۢ֫;->getDefaultViewModelCreationExtras()Ll/۟ܺ֫;

    move-result-object p1

    goto :goto_1

    .line 364
    :cond_2
    sget-object p1, Ll/᩺ܺ֫;->ۧ:Ll/᩺ܺ֫;

    .line 118
    :goto_1
    invoke-direct {p0, v0, v2, p1}, Ll/ۙܺ֫;-><init>(Ll/ۗܺ֫;Ll/ܶܺ֫;Ll/۟ܺ֫;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ll/ۚܺ֫;
    .locals 2

    .line 151
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 153
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;Ljava/lang/String;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    .line 152
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/Class;Ljava/lang/String;)Ll/ۚܺ֫;
    .locals 5

    const-string v0, "key"

    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Ll/ۙܺ֫;->ܽ:Ll/ۗܺ֫;

    invoke-virtual {v0, p2}, Ll/ۗܺ֫;->֫(Ljava/lang/String;)Ll/ۚܺ֫;

    move-result-object v1

    .line 173
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Ll/ۙܺ֫;->ۧ:Ll/ܶܺ֫;

    if-eqz v2, :cond_2

    .line 174
    instance-of p1, v3, Ll/᩶ܺ֫;

    if-eqz p1, :cond_0

    check-cast v3, Ll/᩶ܺ֫;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v3, v1}, Ll/᩶ܺ֫;->֫(Ll/ۚܺ֫;)V

    :cond_1
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 175
    invoke-static {v1, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    .line 182
    :cond_2
    new-instance v1, Ll/ܽۖ֫;

    iget-object v2, p0, Ll/ۙܺ֫;->֫:Ll/۟ܺ֫;

    invoke-direct {v1, v2}, Ll/ܽۖ֫;-><init>(Ll/۟ܺ֫;)V

    .line 183
    sget v2, Ll/᩹ܺ֫;->֫:I

    sget-object v2, Ll/᩸ܺ֫;->֫:Ll/᩸ܺ֫;

    .line 61
    invoke-virtual {v1}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-interface {v4, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    :try_start_0
    invoke-interface {v3, p1, v1}, Ll/ܶܺ֫;->֫(Ljava/lang/Class;Ll/ܽۖ֫;)Ll/ۚܺ֫;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 189
    :catch_0
    invoke-interface {v3, p1}, Ll/ܶܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    .line 190
    :goto_1
    invoke-virtual {v0, p2, p1}, Ll/ۗܺ֫;->֫(Ljava/lang/String;Ll/ۚܺ֫;)V

    return-object p1
.end method
