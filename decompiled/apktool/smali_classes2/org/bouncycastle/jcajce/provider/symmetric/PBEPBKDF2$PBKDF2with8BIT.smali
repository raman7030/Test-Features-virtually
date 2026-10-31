.class public Lorg/bouncycastle/jcajce/provider/symmetric/PBEPBKDF2$PBKDF2with8BIT;
.super Lorg/bouncycastle/jcajce/provider/symmetric/PBEPBKDF2$BasePBKDF2;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "PBKDF2"

    const/4 v1, 0x1

    .line 0
    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/PBEPBKDF2$BasePBKDF2;-><init>(Ljava/lang/String;I)V

    return-void
.end method
