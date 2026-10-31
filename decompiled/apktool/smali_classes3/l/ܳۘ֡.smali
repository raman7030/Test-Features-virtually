.class public final synthetic Ll/ܳۘ֡;
.super Ljava/lang/Object;
.source "SAHW"

# interfaces
.implements Ljava/security/PrivilegedAction;


# instance fields
.field public final synthetic ֫:Ljava/lang/Thread;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۘ֡;->֫:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method public final run()Ljava/lang/Object;
    .locals 2

    .line 61
    const-class v0, Ll/᩻ۘ֡;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    iget-object v1, p0, Ll/ܳۘ֡;->֫:Ljava/lang/Thread;

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    const/4 v0, 0x0

    return-object v0
.end method
