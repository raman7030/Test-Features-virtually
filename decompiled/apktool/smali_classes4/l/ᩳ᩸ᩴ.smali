.class public abstract Ll/ᩳ᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final a:Ll/۟֨ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 97
    new-instance v0, Ll/ۧ᩸ᩴ;

    .line 98
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬᩸ᩴ;

    const-string v1, "file:///"

    .line 105
    invoke-static {v1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۬᩸ᩴ;->getFileSystem(Ljava/net/URI;)Ll/۟֨ᩴ;

    move-result-object v0

    .line 92
    sput-object v0, Ll/ᩳ᩸ᩴ;->a:Ll/۟֨ᩴ;

    return-void
.end method
