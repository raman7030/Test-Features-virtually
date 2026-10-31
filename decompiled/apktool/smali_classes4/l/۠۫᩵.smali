.class public final Ll/۠۫᩵;
.super Ll/ۙܶ᩵;
.source "HAZ0"

# interfaces
.implements Ll/۫ۗ᩵;


# instance fields
.field public volatile _preHandler:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    sget-object v0, Ll/۫ۗ᩵;->ۚ:Ll/۬ۗ᩵;

    invoke-direct {p0, v0}, Ll/ۙܶ᩵;-><init>(Ll/ܿ᩸᩵;)V

    .line 16
    iput-object p0, p0, Ll/۠۫᩵;->_preHandler:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Throwable;)V
    .locals 3

    .line 47
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-gt v1, v0, :cond_4

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_4

    .line 20
    iget-object v0, p0, Ll/۠۫᩵;->_preHandler:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    .line 21
    check-cast v0, Ljava/lang/reflect/Method;

    goto :goto_1

    .line 22
    :cond_0
    :try_start_0
    const-class v0, Ljava/lang/Thread;

    const-string v2, "getUncaughtExceptionPreHandler"

    .line 23
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    goto :goto_0

    :catchall_0
    :cond_1
    move-object v0, v1

    .line 29
    :goto_0
    iput-object v0, p0, Ll/۠۫᩵;->_preHandler:Ljava/lang/Object;

    :goto_1
    if-eqz v0, :cond_2

    .line 48
    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    instance-of v2, v0, Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v2, :cond_3

    move-object v1, v0

    check-cast v1, Ljava/lang/Thread$UncaughtExceptionHandler;

    :cond_3
    if-eqz v1, :cond_4

    .line 49
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :cond_4
    return-void
.end method
