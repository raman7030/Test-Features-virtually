.class public final Ll/ܰ᩻᩵;
.super Ljava/lang/Object;
.source "H6Q8"

# interfaces
.implements Ll/۟᩻᩵;


# static fields
.field public static final ֫:Ljava/security/AccessControlContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 654
    new-instance v0, Ljava/lang/RuntimePermission;

    const-string v1, "getClassLoader"

    invoke-direct {v0, v1}, Ljava/lang/RuntimePermission;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/security/Permission;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Ll/ܿۜ᩵;->֫([Ljava/security/Permission;)Ljava/security/AccessControlContext;

    move-result-object v0

    sput-object v0, Ll/ܰ᩻᩵;->֫:Ljava/security/AccessControlContext;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜ᩵;)Ll/ۘۜ᩵;
    .locals 1

    .line 658
    new-instance v0, Ll/᩺᩻᩵;

    invoke-direct {v0, p1}, Ll/᩺᩻᩵;-><init>(Ll/ܿۜ᩵;)V

    sget-object p1, Ll/ܰ᩻᩵;->֫:Ljava/security/AccessControlContext;

    invoke-static {v0, p1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;Ljava/security/AccessControlContext;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘۜ᩵;

    return-object p1
.end method
