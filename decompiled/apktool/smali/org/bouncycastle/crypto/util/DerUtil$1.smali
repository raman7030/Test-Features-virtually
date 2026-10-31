.class public Lorg/bouncycastle/crypto/util/DerUtil$1;
.super Ljava/lang/IllegalStateException;


# instance fields
.field public final synthetic val$e:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/IOException;)V
    .locals 0

    .line 0
    iput-object p2, p0, Lorg/bouncycastle/crypto/util/DerUtil$1;->val$e:Ljava/io/IOException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/util/DerUtil$1;->val$e:Ljava/io/IOException;

    return-object v0
.end method
