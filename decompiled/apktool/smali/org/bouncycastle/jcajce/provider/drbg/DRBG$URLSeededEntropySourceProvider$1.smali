.class public Lorg/bouncycastle/jcajce/provider/drbg/DRBG$URLSeededEntropySourceProvider$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PrivilegedAction;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/jcajce/provider/drbg/DRBG$URLSeededEntropySourceProvider;

.field public final synthetic val$url:Ljava/net/URL;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jcajce/provider/drbg/DRBG$URLSeededEntropySourceProvider;Ljava/net/URL;)V
    .locals 0

    .line 0
    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/drbg/DRBG$URLSeededEntropySourceProvider$1;->val$url:Ljava/net/URL;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/drbg/DRBG$URLSeededEntropySourceProvider$1;->this$0:Lorg/bouncycastle/jcajce/provider/drbg/DRBG$URLSeededEntropySourceProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()Ljava/io/InputStream;
    .locals 2

    .line 0
    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/drbg/DRBG$URLSeededEntropySourceProvider$1;->val$url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unable to open random source"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic run()Ljava/lang/Object;
    .locals 1

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/jcajce/provider/drbg/DRBG$URLSeededEntropySourceProvider$1;->run()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
