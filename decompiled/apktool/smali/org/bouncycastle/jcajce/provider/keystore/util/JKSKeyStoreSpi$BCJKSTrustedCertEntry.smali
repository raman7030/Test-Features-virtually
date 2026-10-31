.class public final Lorg/bouncycastle/jcajce/provider/keystore/util/JKSKeyStoreSpi$BCJKSTrustedCertEntry;
.super Ljava/lang/Object;


# instance fields
.field public final cert:Ljava/security/cert/Certificate;

.field public final date:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/util/Date;Ljava/security/cert/Certificate;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/keystore/util/JKSKeyStoreSpi$BCJKSTrustedCertEntry;->date:Ljava/util/Date;

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/keystore/util/JKSKeyStoreSpi$BCJKSTrustedCertEntry;->cert:Ljava/security/cert/Certificate;

    return-void
.end method
