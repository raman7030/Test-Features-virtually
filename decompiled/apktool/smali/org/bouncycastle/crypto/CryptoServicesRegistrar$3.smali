.class public Lorg/bouncycastle/crypto/CryptoServicesRegistrar$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PrivilegedAction;


# instance fields
.field public final synthetic val$permission:Ljava/security/Permission;

.field public final synthetic val$securityManager:Ljava/lang/SecurityManager;


# direct methods
.method public constructor <init>(Ljava/lang/SecurityManager;Ljava/security/Permission;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/CryptoServicesRegistrar$3;->val$securityManager:Ljava/lang/SecurityManager;

    iput-object p2, p0, Lorg/bouncycastle/crypto/CryptoServicesRegistrar$3;->val$permission:Ljava/security/Permission;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/CryptoServicesRegistrar$3;->val$securityManager:Ljava/lang/SecurityManager;

    iget-object v1, p0, Lorg/bouncycastle/crypto/CryptoServicesRegistrar$3;->val$permission:Ljava/security/Permission;

    invoke-virtual {v0, v1}, Ljava/lang/SecurityManager;->checkPermission(Ljava/security/Permission;)V

    const/4 v0, 0x0

    return-object v0
.end method
