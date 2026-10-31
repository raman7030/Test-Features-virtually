.class public final Ll/᩻ۤۧ;
.super Ljava/lang/Object;
.source "DB1F"


# static fields
.field public static final ܿ:Ljava/lang/Object;

.field public static volatile ᩳ:Ll/᩻ۤۧ;


# instance fields
.field public final ֫:Landroid/content/Context;

.field public final ۧ:Ljava/util/HashSet;

.field public final ܽ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 57
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩻ۤۧ;->ܿ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ۤۧ;->֫:Landroid/content/Context;

    .line 75
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/᩻ۤۧ;->ۧ:Ljava/util/HashSet;

    .line 76
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/᩻ۤۧ;->ܽ:Ljava/util/HashMap;

    return-void
.end method

.method private ֫(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    .locals 5

    .line 149
    iget-object v0, p0, Ll/᩻ۤۧ;->ܽ:Ljava/util/HashMap;

    const-string v1, "Cannot initialize "

    invoke-static {}, Ll/ۤۤۧ;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 153
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    .line 49
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 155
    :cond_0
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 162
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 163
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    .line 165
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 166
    check-cast v1, Ll/᩷ۤۧ;

    .line 168
    invoke-interface {v1}, Ll/᩷ۤۧ;->֫()Ljava/util/List;

    move-result-object v2

    .line 170
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 171
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    .line 172
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 173
    invoke-direct {p0, v3, p2}, Ll/᩻ۤۧ;->֫(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    goto :goto_0

    .line 180
    :cond_2
    iget-object v2, p0, Ll/᩻ۤۧ;->֫:Landroid/content/Context;

    invoke-interface {v1, v2}, Ll/᩷ۤۧ;->֫(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v1

    .line 184
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 185
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 187
    :try_start_2
    new-instance p2, Ll/ۢۤۧ;

    .line 35
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 187
    throw p2

    .line 190
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 60
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object v1

    .line 157
    :cond_4
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 156
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Cycle detected."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 159
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 60
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 195
    throw p1
.end method

.method public static ֫(Landroid/content/Context;)Ll/᩻ۤۧ;
    .locals 2

    .line 86
    sget-object v0, Ll/᩻ۤۧ;->ᩳ:Ll/᩻ۤۧ;

    if-nez v0, :cond_1

    .line 87
    sget-object v0, Ll/᩻ۤۧ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 88
    :try_start_0
    sget-object v1, Ll/᩻ۤۧ;->ᩳ:Ll/᩻ۤۧ;

    if-nez v1, :cond_0

    .line 89
    new-instance v1, Ll/᩻ۤۧ;

    invoke-direct {v1, p0}, Ll/᩻ۤۧ;-><init>(Landroid/content/Context;)V

    sput-object v1, Ll/᩻ۤۧ;->ᩳ:Ll/᩻ۤۧ;

    .line 91
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 93
    :cond_1
    :goto_0
    sget-object p0, Ll/᩻ۤۧ;->ᩳ:Ll/᩻ۤۧ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 3

    .line 2
    const-class v1, Ll/ܶۡ֫;

    .line 135
    sget-object v0, Ll/᩻ۤۧ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 136
    :try_start_0
    iget-object v2, p0, Ll/᩻ۤۧ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 138
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-direct {p0, v1, v2}, Ll/᩻ۤۧ;->֫(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    move-result-object v2

    .line 140
    :cond_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Landroid/os/Bundle;)V
    .locals 6

    .line 216
    iget-object v0, p0, Ll/᩻ۤۧ;->֫:Landroid/content/Context;

    const v1, 0x7f12004c

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_2

    .line 219
    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 220
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    .line 221
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v4, p0, Ll/᩻ۤۧ;->ۧ:Ljava/util/HashSet;

    if-eqz v3, :cond_1

    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v5, 0x0

    .line 222
    invoke-virtual {p1, v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 223
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 224
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 225
    const-class v5, Ll/᩷ۤۧ;

    invoke-virtual {v5, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 228
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 237
    :cond_1
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 238
    invoke-direct {p0, v0, v1}, Ll/᩻ۤۧ;->֫(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 242
    new-instance v0, Ll/ۢۤۧ;

    .line 35
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 242
    throw v0

    :cond_2
    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 2
    const-class v0, Ll/ܶۡ֫;

    .line 128
    iget-object v1, p0, Ll/᩻ۤۧ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
