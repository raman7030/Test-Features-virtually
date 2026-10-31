.class public final Ll/ۖܺ֫;
.super Ll/᩶ܺ֫;
.source "W1GC"

# interfaces
.implements Ll/ܶܺ֫;


# instance fields
.field public ֫:Landroid/app/Application;

.field public ۧ:Landroid/os/Bundle;

.field public final ܽ:Ll/۠ܺ֫;

.field public ܿ:Ll/ܶ۫ۧ;

.field public ᩳ:Ll/۟ۢ֫;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ll/᩹۫ۧ;Landroid/os/Bundle;)V
    .locals 1

    .line 96
    invoke-direct {p0}, Ll/᩶ܺ֫;-><init>()V

    .line 97
    invoke-interface {p2}, Ll/᩹۫ۧ;->getSavedStateRegistry()Ll/ܶ۫ۧ;

    move-result-object v0

    iput-object v0, p0, Ll/ۖܺ֫;->ܿ:Ll/ܶ۫ۧ;

    .line 98
    invoke-interface {p2}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p2

    iput-object p2, p0, Ll/ۖܺ֫;->ᩳ:Ll/۟ۢ֫;

    .line 99
    iput-object p3, p0, Ll/ۖܺ֫;->ۧ:Landroid/os/Bundle;

    .line 100
    iput-object p1, p0, Ll/ۖܺ֫;->֫:Landroid/app/Application;

    if-eqz p1, :cond_1

    .line 344
    invoke-static {}, Ll/۠ܺ֫;->֫()Ll/۠ܺ֫;

    move-result-object p2

    if-nez p2, :cond_0

    .line 345
    new-instance p2, Ll/۠ܺ֫;

    invoke-direct {p2, p1}, Ll/۠ܺ֫;-><init>(Landroid/app/Application;)V

    invoke-static {p2}, Ll/۠ܺ֫;->֫(Ll/۠ܺ֫;)V

    .line 347
    :cond_0
    invoke-static {}, Ll/۠ܺ֫;->֫()Ll/۠ܺ֫;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 102
    :cond_1
    new-instance p1, Ll/۠ܺ֫;

    invoke-direct {p1}, Ll/۠ܺ֫;-><init>()V

    .line 101
    :goto_0
    iput-object p1, p0, Ll/ۖܺ֫;->ܽ:Ll/۠ܺ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ll/ۚܺ֫;
    .locals 1

    .line 199
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 201
    invoke-virtual {p0, p1, v0}, Ll/ۖܺ֫;->֫(Ljava/lang/Class;Ljava/lang/String;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    .line 200
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/Class;Ljava/lang/String;)Ll/ۚܺ֫;
    .locals 6

    .line 159
    iget-object v0, p0, Ll/ۖܺ֫;->ᩳ:Ll/۟ۢ֫;

    if-eqz v0, :cond_5

    const-class v1, Ll/ᩴۢ֫;

    .line 164
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    .line 165
    iget-object v2, p0, Ll/ۖܺ֫;->֫:Landroid/app/Application;

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 166
    invoke-static {}, Ll/ۘܺ֫;->֫()Ljava/util/List;

    move-result-object v3

    invoke-static {p1, v3}, Ll/ۘܺ֫;->֫(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    goto :goto_0

    .line 168
    :cond_0
    invoke-static {}, Ll/ۘܺ֫;->ۧ()Ljava/util/List;

    move-result-object v3

    invoke-static {p1, v3}, Ll/ۘܺ֫;->֫(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    :goto_0
    if-nez v3, :cond_3

    if-eqz v2, :cond_1

    .line 174
    iget-object p2, p0, Ll/ۖܺ֫;->ܽ:Ll/۠ܺ֫;

    invoke-virtual {p2, p1}, Ll/۠ܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    .line 225
    :cond_1
    invoke-static {}, Ll/᩹ܺ֫;->֫()Ll/᩹ܺ֫;

    move-result-object p2

    if-nez p2, :cond_2

    .line 226
    new-instance p2, Ll/᩹ܺ֫;

    .line 197
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 226
    invoke-static {p2}, Ll/᩹ܺ֫;->֫(Ll/᩹ܺ֫;)V

    .line 228
    :cond_2
    invoke-static {}, Ll/᩹ܺ֫;->֫()Ll/᩹ܺ֫;

    move-result-object p2

    invoke-static {p2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 175
    invoke-virtual {p2, p1}, Ll/᩹ܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    .line 177
    :cond_3
    iget-object v4, p0, Ll/ۖܺ֫;->ܿ:Ll/ܶ۫ۧ;

    invoke-static {v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    iget-object v5, p0, Ll/ۖܺ֫;->ۧ:Landroid/os/Bundle;

    .line 176
    invoke-static {v4, v0, p2, v5}, Ll/۫ۢ֫;->֫(Ll/ܶ۫ۧ;Ll/۟ۢ֫;Ljava/lang/String;Landroid/os/Bundle;)Ll/ᩳܺ֫;

    move-result-object p2

    const/4 v0, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    if-eqz v2, :cond_4

    .line 180
    invoke-virtual {p2}, Ll/ᩳܺ֫;->֫()Ll/ۧܺ֫;

    move-result-object v1

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v2, v5, v4

    aput-object v1, v5, v0

    invoke-static {p1, v3, v5}, Ll/ۘܺ֫;->֫(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ll/ۚܺ֫;

    move-result-object p1

    goto :goto_1

    .line 182
    :cond_4
    invoke-virtual {p2}, Ll/ᩳܺ֫;->֫()Ll/ۧܺ֫;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v1, v0, v4

    invoke-static {p1, v3, v0}, Ll/ۘܺ֫;->֫(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ll/ۚܺ֫;

    move-result-object p1

    .line 184
    :goto_1
    invoke-virtual {p1, p2}, Ll/ۚܺ֫;->֫(Ll/ᩳܺ֫;)V

    return-object p1

    .line 160
    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/Class;Ll/ܽۖ֫;)Ll/ۚܺ֫;
    .locals 5

    .line 112
    sget v0, Ll/᩹ܺ֫;->֫:I

    sget-object v0, Ll/᩸ܺ֫;->֫:Ll/᩸ܺ֫;

    .line 66
    invoke-virtual {p2}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 112
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 117
    sget-object v1, Ll/᩷ܺ֫;->ۧ:Ll/ܳܺ֫;

    .line 66
    invoke-virtual {p2}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 118
    sget-object v1, Ll/᩷ܺ֫;->ܽ:Ll/᩻ܺ֫;

    .line 66
    invoke-virtual {p2}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 119
    sget-object v0, Ll/۠ܺ֫;->ᩳ:Ll/ܰܺ֫;

    sget-object v0, Ll/֨ܺ֫;->֫:Ll/֨ܺ֫;

    .line 66
    invoke-virtual {p2}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 119
    check-cast v0, Landroid/app/Application;

    const-class v1, Ll/ᩴۢ֫;

    .line 120
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 122
    invoke-static {}, Ll/ۘܺ֫;->֫()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v2}, Ll/ۘܺ֫;->֫(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    .line 124
    :cond_0
    invoke-static {}, Ll/ۘܺ֫;->ۧ()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v2}, Ll/ۘܺ֫;->֫(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    .line 128
    iget-object v0, p0, Ll/ۖܺ֫;->ܽ:Ll/۠ܺ֫;

    invoke-virtual {v0, p1, p2}, Ll/۠ܺ֫;->֫(Ljava/lang/Class;Ll/ܽۖ֫;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 131
    invoke-static {p2}, Ll/᩷ܺ֫;->֫(Ll/ܽۖ֫;)Ll/ۧܺ֫;

    move-result-object p2

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v4

    aput-object p2, v1, v3

    invoke-static {p1, v2, v1}, Ll/ۘܺ֫;->֫(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    .line 133
    :cond_2
    invoke-static {p2}, Ll/᩷ܺ֫;->֫(Ll/ܽۖ֫;)Ll/ۧܺ֫;

    move-result-object p2

    new-array v0, v3, [Ljava/lang/Object;

    aput-object p2, v0, v4

    invoke-static {p1, v2, v0}, Ll/ۘܺ֫;->֫(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    .line 137
    :cond_3
    iget-object p2, p0, Ll/ۖܺ֫;->ᩳ:Ll/۟ۢ֫;

    if-eqz p2, :cond_4

    .line 138
    invoke-virtual {p0, p1, v0}, Ll/ۖܺ֫;->֫(Ljava/lang/Class;Ljava/lang/String;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    .line 140
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 113
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۚܺ֫;)V
    .locals 2

    .line 210
    iget-object v0, p0, Ll/ۖܺ֫;->ᩳ:Ll/۟ۢ֫;

    if-eqz v0, :cond_0

    .line 213
    iget-object v1, p0, Ll/ۖܺ֫;->ܿ:Ll/ܶ۫ۧ;

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 211
    invoke-static {p1, v1, v0}, Ll/۫ۢ֫;->֫(Ll/ۚܺ֫;Ll/ܶ۫ۧ;Ll/۟ۢ֫;)V

    :cond_0
    return-void
.end method
