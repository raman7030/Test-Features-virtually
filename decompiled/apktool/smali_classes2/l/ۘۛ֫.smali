.class public final Ll/ۘۛ֫;
.super Ljava/lang/Object;
.source "E8QB"


# instance fields
.field public ֫:Ll/۫ᩴ֫;

.field public final ۧ:Ljava/lang/Object;

.field public ܽ:Ll/ۖۛ֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۘۛ֫;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/۫ᩴ֫;)Ll/ۖۛ֫;
    .locals 4

    .line 108
    new-instance v0, Ll/ۤ۠֫;

    invoke-direct {v0}, Ll/ۤ۠֫;-><init>()V

    .line 109
    new-instance v1, Ll/ܿۨ֫;

    .line 111
    iget-object v2, p0, Ll/۫ᩴ֫;->ܿ:Landroid/net/Uri;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    iget-boolean v3, p0, Ll/۫ᩴ֫;->֫:Z

    invoke-direct {v1, v2, v3, v0}, Ll/ܿۨ֫;-><init>(Ljava/lang/String;ZLl/ۤ۠֫;)V

    .line 114
    iget-object v0, p0, Ll/۫ᩴ֫;->ᩳ:Ll/ۢ۬ܺ;

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->entrySet()Ll/ۛ۬ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 115
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Ll/ܿۨ֫;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 117
    :cond_1
    new-instance v0, Ll/ܽۛ֫;

    invoke-direct {v0}, Ll/ܽۛ֫;-><init>()V

    iget-object v2, p0, Ll/۫ᩴ֫;->ۜ:Ljava/util/UUID;

    .line 119
    invoke-virtual {v0, v2}, Ll/ܽۛ֫;->֫(Ljava/util/UUID;)V

    iget-boolean v2, p0, Ll/۫ᩴ֫;->ܳ:Z

    .line 121
    invoke-virtual {v0, v2}, Ll/ܽۛ֫;->֫(Z)V

    iget-boolean v2, p0, Ll/۫ᩴ֫;->᩻:Z

    .line 122
    invoke-virtual {v0, v2}, Ll/ܽۛ֫;->ۧ(Z)V

    iget-object v2, p0, Ll/۫ᩴ֫;->ۧ:Ll/ܳ۬ܺ;

    .line 124
    invoke-static {v2}, Ll/۬᩺ܺ;->֫(Ljava/util/Collection;)[I

    move-result-object v2

    .line 123
    invoke-virtual {v0, v2}, Ll/ܽۛ֫;->֫([I)V

    .line 128
    invoke-virtual {v0, v1}, Ll/ܽۛ֫;->֫(Ll/ܿۨ֫;)Ll/ۖۛ֫;

    move-result-object v0

    .line 129
    invoke-virtual {p0}, Ll/۫ᩴ֫;->֫()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ۖۛ֫;->֫([B)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ۧ᩵֫;)Ll/ۙۛ֫;
    .locals 2

    .line 88
    iget-object v0, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    iget-object p1, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    iget-object p1, p1, Ll/ۨᩴ֫;->֫:Ll/۫ᩴ֫;

    if-nez p1, :cond_0

    .line 92
    sget-object p1, Ll/ۙۛ֫;->֫:Ll/ۙۛ֫;

    return-object p1

    .line 95
    :cond_0
    iget-object v0, p0, Ll/ۘۛ֫;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 96
    :try_start_0
    iget-object v1, p0, Ll/ۘۛ֫;->֫:Ll/۫ᩴ֫;

    invoke-virtual {p1, v1}, Ll/۫ᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 97
    iput-object p1, p0, Ll/ۘۛ֫;->֫:Ll/۫ᩴ֫;

    .line 98
    invoke-static {p1}, Ll/ۘۛ֫;->֫(Ll/۫ᩴ֫;)Ll/ۖۛ֫;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۛ֫;->ܽ:Ll/ۖۛ֫;

    .line 100
    :cond_1
    iget-object p1, p0, Ll/ۘۛ֫;->ܽ:Ll/ۖۛ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 101
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
