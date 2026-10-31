.class public Lorg/bouncycastle/jce/provider/BouncyCastleProvider$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PrivilegedAction;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/jce/provider/BouncyCastleProvider;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jce/provider/BouncyCastleProvider;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/provider/BouncyCastleProvider$1;->this$0:Lorg/bouncycastle/jce/provider/BouncyCastleProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/BouncyCastleProvider$1;->this$0:Lorg/bouncycastle/jce/provider/BouncyCastleProvider;

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->access$000(Lorg/bouncycastle/jce/provider/BouncyCastleProvider;)V

    const/4 v0, 0x0

    return-object v0
.end method
