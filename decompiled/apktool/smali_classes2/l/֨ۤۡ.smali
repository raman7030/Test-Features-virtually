.class public final Ll/֨ۤۡ;
.super Ljava/lang/Object;
.source "97B5"

# interfaces
.implements Landroid/content/SharedPreferences;


# static fields
.field public static final ᩳ:Ljava/lang/Object;


# instance fields
.field public final ֫:Ljava/util/LinkedHashSet;

.field public final ۧ:Ljava/lang/Object;

.field public final ܽ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֨ۤۡ;->ᩳ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    .line 26
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/֨ۤۡ;->֫:Ljava/util/LinkedHashSet;

    return-void
.end method

.method public static bridge synthetic ֫()Ljava/lang/Object;
    .locals 1

    .line 0
    sget-object v0, Ll/֨ۤۡ;->ᩳ:Ljava/lang/Object;

    return-object v0
.end method

.method public static ֫(Ll/֨ۤۡ;ZLjava/util/HashMap;)V
    .locals 4

    .line 179
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 180
    iget-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p1, :cond_0

    .line 181
    :try_start_0
    iget-object p1, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 182
    iget-object p1, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 183
    iget-object p1, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 185
    :cond_0
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 186
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 187
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    .line 188
    sget-object v3, Ll/֨ۤۡ;->ᩳ:Ljava/lang/Object;

    if-ne p2, v3, :cond_2

    .line 189
    iget-object p2, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {p2, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 190
    iget-object p2, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {p2, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 167
    :cond_2
    instance-of v3, p2, Ljava/util/Set;

    if-eqz v3, :cond_3

    check-cast p2, Ljava/util/Set;

    .line 168
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    move-object p2, v3

    .line 196
    :cond_3
    iget-object v3, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v3, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 197
    invoke-static {v3, p2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 198
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 201
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Ll/֨ۤۡ;->֫:Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    .line 204
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    iget-object p2, p0, Ll/֨ۤۡ;->֫:Ljava/util/LinkedHashSet;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 205
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 207
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 208
    invoke-interface {v2, p0, v0}, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;->onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    goto :goto_1

    .line 202
    :cond_7
    :goto_2
    :try_start_1
    monitor-exit v0

    :cond_8
    return-void

    :catchall_0
    move-exception p0

    .line 205
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final contains(Ljava/lang/String;)Z
    .locals 2

    .line 126
    iget-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 127
    :try_start_0
    iget-object v1, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 128
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final edit()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 137
    new-instance v0, Ll/ۚۤۡ;

    invoke-direct {v0, p0}, Ll/ۚۤۡ;-><init>(Ll/֨ۤۡ;)V

    return-object v0
.end method

.method public final getAll()Ljava/util/Map;
    .locals 6

    .line 34
    iget-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 35
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 36
    iget-object v2, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 37
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 167
    instance-of v5, v3, Ljava/util/Set;

    if-eqz v5, :cond_0

    check-cast v3, Ljava/util/Set;

    .line 168
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    move-object v3, v5

    .line 37
    :cond_0
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 39
    :cond_1
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 40
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final getBoolean(Ljava/lang/String;Z)Z
    .locals 2

    .line 114
    iget-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 115
    :try_start_0
    iget-object v1, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 116
    instance-of v1, p1, Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    :cond_0
    monitor-exit v0

    return p2

    :catchall_0
    move-exception p1

    .line 117
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final getFloat(Ljava/lang/String;F)F
    .locals 2

    .line 102
    iget-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 103
    :try_start_0
    iget-object v1, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 104
    instance-of v1, p1, Ljava/lang/Float;

    if-eqz v1, :cond_0

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p2

    :cond_0
    monitor-exit v0

    return p2

    :catchall_0
    move-exception p1

    .line 105
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final getInt(Ljava/lang/String;I)I
    .locals 2

    .line 78
    iget-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 79
    :try_start_0
    iget-object v1, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 80
    instance-of v1, p1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    :cond_0
    monitor-exit v0

    return p2

    :catchall_0
    move-exception p1

    .line 81
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final getLong(Ljava/lang/String;J)J
    .locals 2

    .line 90
    iget-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 91
    :try_start_0
    iget-object v1, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 92
    instance-of v1, p1, Ljava/lang/Long;

    if-eqz v1, :cond_0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    :cond_0
    monitor-exit v0

    return-wide p2

    :catchall_0
    move-exception p1

    .line 93
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 50
    iget-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 51
    :try_start_0
    iget-object v1, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 52
    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_0

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    :cond_0
    monitor-exit v0

    return-object p2

    :catchall_0
    move-exception p1

    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    .locals 2

    .line 63
    iget-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 64
    :try_start_0
    iget-object v1, p0, Ll/֨ۤۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 65
    instance-of v1, p1, Ljava/util/Set;

    if-eqz v1, :cond_0

    check-cast p1, Ljava/util/Set;

    .line 68
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object p2

    .line 66
    :cond_0
    monitor-exit v0

    return-object p2

    :catchall_0
    move-exception p1

    .line 69
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 2

    .line 146
    iget-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 147
    :try_start_0
    iget-object v1, p0, Ll/֨ۤۡ;->֫:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 148
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 2

    .line 157
    iget-object v0, p0, Ll/֨ۤۡ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 158
    :try_start_0
    iget-object v1, p0, Ll/֨ۤۡ;->֫:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 159
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
