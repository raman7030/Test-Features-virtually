.class public final Ll/ۧۜ᩵;
.super Ljava/lang/Object;
.source "H6Q8"

# interfaces
.implements Ll/۟᩻᩵;


# static fields
.field public static final ֫:Ljava/security/AccessControlContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 2589
    new-instance v0, Ljava/lang/RuntimePermission;

    const-string v1, "enableContextClassLoaderOverride"

    invoke-direct {v0, v1}, Ljava/lang/RuntimePermission;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/RuntimePermission;

    const-string v2, "modifyThreadGroup"

    invoke-direct {v1, v2}, Ljava/lang/RuntimePermission;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/RuntimePermission;

    const-string v3, "getClassLoader"

    invoke-direct {v2, v3}, Ljava/lang/RuntimePermission;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/RuntimePermission;

    const-string v4, "setContextClassLoader"

    invoke-direct {v3, v4}, Ljava/lang/RuntimePermission;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/security/Permission;

    sget-object v5, Ll/ܿۜ᩵;->᩻֫:Ljava/lang/RuntimePermission;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x1

    aput-object v0, v4, v5

    const/4 v0, 0x2

    aput-object v1, v4, v0

    const/4 v0, 0x3

    aput-object v2, v4, v0

    const/4 v0, 0x4

    aput-object v3, v4, v0

    invoke-static {v4}, Ll/ܿۜ᩵;->֫([Ljava/security/Permission;)Ljava/security/AccessControlContext;

    move-result-object v0

    sput-object v0, Ll/ۧۜ᩵;->֫:Ljava/security/AccessControlContext;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜ᩵;)Ll/ۘۜ᩵;
    .locals 1

    .line 2597
    new-instance v0, Ll/֫ۜ᩵;

    invoke-direct {v0, p1}, Ll/֫ۜ᩵;-><init>(Ll/ܿۜ᩵;)V

    sget-object p1, Ll/ۧۜ᩵;->֫:Ljava/security/AccessControlContext;

    invoke-static {v0, p1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;Ljava/security/AccessControlContext;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘۜ᩵;

    return-object p1
.end method
