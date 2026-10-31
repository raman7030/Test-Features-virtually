.class public final synthetic Ll/ᩴۖܽ;
.super Ljava/lang/Object;
.source "Y4GW"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ۖ۟֫;
.implements Ll/۟ۗۚ;


# direct methods
.method public static bridge synthetic ֫()Ljava/lang/Class;
    .locals 1

    .line 0
    const-class v0, Ljava/lang/invoke/MethodHandle;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;
    .locals 0

    .line 0
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-interface {p4, p2, p0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 4
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic ֫(Ljava/io/RandomAccessFile;)Ljava/nio/channels/FileChannel;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p0

    invoke-static {p0}, Ll/۫֨ᩴ;->convertMaybeLegacyFileChannelFromLibrary(Ljava/nio/channels/FileChannel;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;I)V
    .locals 1

    .line 0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, p1

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p1, p2, p3}, Ll/ۨۗۚ;->ۧ(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 0

    .line 0
    invoke-static {p1, p2, p3}, Ll/᩹۟֫;->֫(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
