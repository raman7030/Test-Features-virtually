.class public Lorg/bouncycastle/jcajce/provider/keystore/bc/BcKeyStoreSpi$BCKeyStoreException;
.super Ljava/security/KeyStoreException;


# instance fields
.field public final cause:Ljava/lang/Exception;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/keystore/bc/BcKeyStoreSpi$BCKeyStoreException;->cause:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/bc/BcKeyStoreSpi$BCKeyStoreException;->cause:Ljava/lang/Exception;

    return-object v0
.end method
