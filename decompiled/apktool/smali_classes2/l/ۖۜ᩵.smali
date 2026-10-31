.class public final Ll/ۖۜ᩵;
.super Ll/ۘۜ᩵;
.source "86PR"


# static fields
.field public static final ۙ:Ljava/lang/ThreadGroup;

.field public static final ᩶:Ljava/security/AccessControlContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 154
    new-instance v0, Ll/ܺۜ᩵;

    .line 155
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ThreadGroup;

    sput-object v0, Ll/ۖۜ᩵;->ۙ:Ljava/lang/ThreadGroup;

    .line 164
    new-instance v0, Ljava/security/AccessControlContext;

    new-instance v1, Ljava/security/ProtectionDomain;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Ljava/security/ProtectionDomain;-><init>(Ljava/security/CodeSource;Ljava/security/PermissionCollection;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/security/ProtectionDomain;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-direct {v0, v2}, Ljava/security/AccessControlContext;-><init>([Ljava/security/ProtectionDomain;)V

    sput-object v0, Ll/ۖۜ᩵;->᩶:Ljava/security/AccessControlContext;

    return-void
.end method

.method public constructor <init>(Ll/ܿۜ᩵;)V
    .locals 3

    .line 170
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    sget-object v1, Ll/ۖۜ᩵;->ۙ:Ljava/lang/ThreadGroup;

    sget-object v2, Ll/ۖۜ᩵;->᩶:Ljava/security/AccessControlContext;

    .line 169
    invoke-direct {p0, p1, v0, v1, v2}, Ll/ۘۜ᩵;-><init>(Ll/ܿۜ᩵;Ljava/lang/ClassLoader;Ljava/lang/ThreadGroup;Ljava/security/AccessControlContext;)V

    return-void
.end method


# virtual methods
.method public final setContextClassLoader(Ljava/lang/ClassLoader;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 185
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 186
    :cond_0
    new-instance p1, Ljava/lang/SecurityException;

    const-string v0, "setContextClassLoader"

    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 0

    .line 177
    invoke-static {p0}, Ll/ۚۜ᩵;->֫(Ljava/lang/Thread;)V

    return-void
.end method
