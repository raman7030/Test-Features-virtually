.class public final Ll/ܶ۠ۢ;
.super Ljava/lang/Object;
.source "CAJ3"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Landroid/os/PowerManager$WakeLock;

.field public static final ܳ:Ljava/lang/Iterable;

.field public static final ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final ܿ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final ᩳ:Ljava/util/Set;

.field public static final ᩻:Ll/ۚۡ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 57
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Ll/ܶ۠ۢ;->ܿ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 62
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v1, Ll/ܶ۠ۢ;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 64
    invoke-static {v0, v1}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v0

    sput-object v0, Ll/ܶ۠ۢ;->ܳ:Ljava/lang/Iterable;

    .line 66
    new-instance v1, Ll/ۚۡ֫;

    .line 33
    invoke-direct {v1, v0}, Ll/֡ۡ֫;-><init>(Ljava/lang/Object;)V

    .line 66
    sput-object v1, Ll/ܶ۠ۢ;->᩻:Ll/ۚۡ֫;

    .line 68
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ܶ۠ۢ;->ᩳ:Ljava/util/Set;

    const-string v0, "power"

    .line 204
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 71
    check-cast v0, Landroid/os/PowerManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 73
    sput-object v0, Ll/ܶ۠ۢ;->ۧ:Landroid/os/PowerManager$WakeLock;

    return-void

    .line 75
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v1

    const-string v2, ":Task"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    sput-object v0, Ll/ܶ۠ۢ;->ۧ:Landroid/os/PowerManager$WakeLock;

    return-void
.end method

.method public static bridge synthetic ֫()Landroid/os/PowerManager$WakeLock;
    .locals 1

    .line 0
    sget-object v0, Ll/ܶ۠ۢ;->ۧ:Landroid/os/PowerManager$WakeLock;

    return-object v0
.end method

.method public static ֫(I)Ll/ۘ۠ۢ;
    .locals 3

    if-gtz p0, :cond_0

    goto :goto_0

    .line 105
    :cond_0
    sget-object v0, Ll/ܶ۠ۢ;->ܿ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ۠ۢ;

    .line 106
    invoke-virtual {v1}, Ll/ۘ۠ۢ;->۫()I

    move-result v2

    if-ne v2, p0, :cond_1

    return-object v1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۘ۠ۢ;)V
    .locals 2

    .line 253
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֡֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 256
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ܿ()Ll/ۘ۠ۢ;

    move-result-object p0

    sget-object v1, Ll/ܶ۠ۢ;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(ILjava/lang/Object;)V

    return-void

    .line 254
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Task is not finished."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۜ()Ll/ۘ۠ۢ;
    .locals 3

    .line 115
    sget-object v0, Ll/ܶ۠ۢ;->ܿ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ۠ۢ;

    .line 116
    const-class v2, Ll/᩻ܺ᩷;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ۡ()Z
    .locals 1

    .line 264
    sget-object v0, Ll/ܶ۠ۢ;->ᩳ:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static ۢ()Ll/ۚۡ֫;
    .locals 1

    .line 80
    sget-object v0, Ll/ܶ۠ۢ;->᩻:Ll/ۚۡ֫;

    return-object v0
.end method

.method public static bridge synthetic ۧ()Ljava/util/Set;
    .locals 1

    .line 0
    sget-object v0, Ll/ܶ۠ۢ;->ᩳ:Ljava/util/Set;

    return-object v0
.end method

.method public static ۧ(Ll/ۘ۠ۢ;)V
    .locals 1

    .line 260
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->۫()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    sget-object v0, Ll/ܶ۠ۢ;->ᩳ:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ܳ()V
    .locals 2

    .line 96
    sget-object v0, Ll/ܶ۠ۢ;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 97
    sget-object v0, Ll/ܶ۠ۢ;->᩻:Ll/ۚۡ֫;

    sget-object v1, Ll/ܶ۠ۢ;->ܳ:Ljava/lang/Iterable;

    invoke-virtual {v0, v1}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public static ܺ()V
    .locals 1

    .line 156
    sget-object v0, Ll/ܶ۠ۢ;->ܿ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void
.end method

.method public static bridge synthetic ܽ()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 1

    .line 0
    sget-object v0, Ll/ܶ۠ۢ;->ܿ:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v0
.end method

.method public static ܽ(Ll/ۘ۠ۢ;)Z
    .locals 1

    .line 92
    sget-object v0, Ll/ܶ۠ۢ;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ܿ()Ll/ۚۡ֫;
    .locals 1

    .line 0
    sget-object v0, Ll/ܶ۠ۢ;->᩻:Ll/ۚۡ֫;

    return-object v0
.end method

.method public static bridge synthetic ᩳ()Ljava/lang/Iterable;
    .locals 1

    .line 0
    sget-object v0, Ll/ܶ۠ۢ;->ܳ:Ljava/lang/Iterable;

    return-object v0
.end method

.method public static ᩷()I
    .locals 1

    .line 84
    sget-object v0, Ll/ܶ۠ۢ;->ܿ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    return v0
.end method

.method public static ᩻()I
    .locals 1

    .line 88
    sget-object v0, Ll/ܶ۠ۢ;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    return v0
.end method
