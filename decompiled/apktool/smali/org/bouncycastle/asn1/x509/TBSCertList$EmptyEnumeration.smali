.class public Lorg/bouncycastle/asn1/x509/TBSCertList$EmptyEnumeration;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Enumeration;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/asn1/x509/TBSCertList$1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/asn1/x509/TBSCertList$EmptyEnumeration;-><init>()V

    return-void
.end method


# virtual methods
.method public hasMoreElements()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public nextElement()Ljava/lang/Object;
    .locals 2

    .line 0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Empty Enumeration"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
