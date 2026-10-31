.class public final Ll/ܰۧܽ;
.super Ljava/lang/Object;
.source "PANW"


# static fields
.field public static final synthetic ֫:Ll/ܰۧܽ;

.field public static ۧ:Ll/֫ܽܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/ܰۧܽ;

    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/ܰۧܽ;->֫:Ll/ܰۧܽ;

    .line 53
    const-class v0, Ll/۟ۧܽ;

    invoke-static {v0}, Ll/ۜ᩶᩵;->֫(Ljava/lang/Class;)Ll/ۛ᩹᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛ᩹᩵;->ۧ()Ljava/lang/String;

    .line 55
    sget-object v0, Ll/᩺֫ܽ;->֫:Ll/᩺֫ܽ;

    sput-object v0, Ll/ܰۧܽ;->ۧ:Ll/֫ܽܽ;

    return-void
.end method

.method public static ֫(Landroid/content/Context;)Ll/ᩳܽܽ;
    .locals 6

    .line 67
    new-instance v0, Ll/ᩳܽܽ;

    .line 68
    sget-object v1, Ll/ۜܽܽ;->֫:Ll/ۜܽܽ;

    const/4 v2, 0x0

    .line 77
    :try_start_0
    sget-object v3, Ll/ۘۧܽ;->֫:Ll/ۘۧܽ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ll/ۘۧܽ;->֫()Landroidx/window/extensions/layout/WindowLayoutComponent;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    new-instance v4, Ll/ۧۧܽ;

    invoke-direct {v4, v3}, Ll/ۧۧܽ;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    :goto_0
    move-object v4, v2

    :goto_1
    if-nez v4, :cond_6

    .line 181
    invoke-static {}, Ll/ۛۧܽ;->ۧ()Ll/ۛۧܽ;

    move-result-object v3

    if-nez v3, :cond_5

    .line 182
    invoke-static {}, Ll/ۛۧܽ;->ܽ()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 183
    :try_start_1
    invoke-static {}, Ll/ۛۧܽ;->ۧ()Ll/ۛۧܽ;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-nez v4, :cond_4

    .line 200
    :try_start_2
    invoke-static {}, Ll/ܶۧܽ;->֫()Ll/۬֫ܽ;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_2

    .line 79
    :cond_1
    invoke-static {}, Ll/۬֫ܽ;->᩻()Ll/۬֫ܽ;

    move-result-object v5

    .line 232
    invoke-virtual {v4, v5}, Ll/۬֫ܽ;->֫(Ll/۬֫ܽ;)I

    move-result v4

    if-ltz v4, :cond_3

    .line 201
    new-instance v4, Ll/۬ۧܽ;

    invoke-direct {v4, p0}, Ll/۬ۧܽ;-><init>(Landroid/content/Context;)V

    .line 202
    invoke-virtual {v4}, Ll/۬ۧܽ;->ۧ()Z

    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v4

    .line 185
    :catchall_1
    :cond_3
    :goto_2
    :try_start_3
    new-instance p0, Ll/ۛۧܽ;

    invoke-direct {p0, v2}, Ll/ۛۧܽ;-><init>(Ll/۬ۧܽ;)V

    invoke-static {p0}, Ll/ۛۧܽ;->֫(Ll/ۛۧܽ;)V

    .line 187
    :cond_4
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 182
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_3

    :catchall_2
    move-exception p0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p0

    .line 189
    :cond_5
    :goto_3
    invoke-static {}, Ll/ۛۧܽ;->ۧ()Ll/ۛۧܽ;

    move-result-object v4

    invoke-static {v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 67
    :cond_6
    invoke-direct {v0, v1, v4}, Ll/ᩳܽܽ;-><init>(Ll/᩻ܽܽ;Ll/ۨۧܽ;)V

    .line 71
    sget-object p0, Ll/ܰۧܽ;->ۧ:Ll/֫ܽܽ;

    check-cast p0, Ll/᩺֫ܽ;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method
