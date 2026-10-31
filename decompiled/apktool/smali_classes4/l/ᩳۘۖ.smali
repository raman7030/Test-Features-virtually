.class public Ll/ᩳۘۖ;
.super Ljava/lang/Object;
.source "R9OM"


# static fields
.field public static final ۧ:Ll/ᩳۘۖ;

.field public static volatile ܽ:Ll/ᩳۘۖ;


# instance fields
.field public final ֫:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 172
    new-instance v0, Ll/ᩳۘۖ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ᩳۘۖ;-><init>(I)V

    sput-object v0, Ll/ᩳۘۖ;->ۧ:Ll/ᩳۘۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ᩳۘۖ;->֫:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 186
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Ll/ᩳۘۖ;->֫:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ll/ᩳۘۖ;)V
    .locals 1

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 175
    sget-object v0, Ll/ᩳۘۖ;->ۧ:Ll/ᩳۘۖ;

    if-ne p1, v0, :cond_0

    .line 176
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Ll/ᩳۘۖ;->֫:Ljava/util/Map;

    return-void

    .line 178
    :cond_0
    iget-object p1, p1, Ll/ᩳۘۖ;->֫:Ljava/util/Map;

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۘۖ;->֫:Ljava/util/Map;

    return-void
.end method

.method public static ֫()Ll/ᩳۘۖ;
    .locals 4

    .line 106
    sget-object v1, Ll/ᩳۘۖ;->ܽ:Ll/ᩳۘۖ;

    if-nez v1, :cond_3

    .line 108
    const-class v0, Ll/ᩳۘۖ;

    monitor-enter v0

    .line 109
    :try_start_0
    sget-object v1, Ll/ᩳۘۖ;->ܽ:Ll/ᩳۘۖ;

    if-nez v1, :cond_2

    const-string v1, "getEmptyRegistry"

    .line 56
    sget-object v2, Ll/ۧۘۖ;->֫:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    .line 62
    :cond_0
    :try_start_1
    invoke-virtual {v2, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۘۖ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v3, v1

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v3, :cond_1

    move-object v1, v3

    goto :goto_1

    .line 47
    :cond_1
    :try_start_2
    sget-object v1, Ll/ᩳۘۖ;->ۧ:Ll/ᩳۘۖ;

    .line 111
    :goto_1
    sput-object v1, Ll/ᩳۘۖ;->ܽ:Ll/ᩳۘۖ;

    .line 113
    :cond_2
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :cond_3
    return-object v1
.end method


# virtual methods
.method public final ֫(ILl/ۡ֡ۖ;)Ll/֨ᩴۖ;
    .locals 1

    .line 132
    new-instance v0, Ll/ܽۘۖ;

    invoke-direct {v0, p1, p2}, Ll/ܽۘۖ;-><init>(ILl/ۡ֡ۖ;)V

    .line 133
    iget-object p1, p0, Ll/ᩳۘۖ;->֫:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ᩴۖ;

    return-object p1
.end method
