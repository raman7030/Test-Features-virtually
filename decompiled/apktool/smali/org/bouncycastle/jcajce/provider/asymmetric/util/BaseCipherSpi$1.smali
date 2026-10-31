.class public Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$1;
.super Ljava/security/InvalidKeyException;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi;

.field public final synthetic val$e:Ljavax/crypto/BadPaddingException;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi;Ljava/lang/String;Ljavax/crypto/BadPaddingException;)V
    .locals 0

    .line 0
    iput-object p3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$1;->val$e:Ljavax/crypto/BadPaddingException;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$1;->this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi;

    invoke-direct {p0, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized getCause()Ljava/lang/Throwable;
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$1;->val$e:Ljavax/crypto/BadPaddingException;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
