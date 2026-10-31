.class public Ll/ᩴۚ᩵;
.super Ljava/lang/Object;
.source "O9TZ"

# interfaces
.implements Ljava/security/Principal;
.implements Ll/ۛ֡᩵;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x38c38953de53f442L

.field public static final ۬:Ll/֫᩻֨;


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Ll/ۘۚ᩵;

.field public ᩶:Ljava/lang/String;

.field public ᩸:[B

.field public ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 62
    const-class v0, Ll/ᩴۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ᩴۚ᩵;->۬:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 75
    sget-object v0, Ll/ۘۚ᩵;->᩶:Ll/ۘۚ᩵;

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 68
    iput-object v1, p0, Ll/ᩴۚ᩵;->᩸:[B

    const-string v1, ""

    .line 80
    iput-object v1, p0, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    .line 81
    iput-object v1, p0, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    .line 82
    iput-object v1, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    .line 83
    iput-object v0, p0, Ll/ᩴۚ᩵;->ۙ:Ll/ۘۚ᩵;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۘۚ᩵;)V
    .locals 2

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Ll/ᩴۚ᩵;->᩸:[B

    if-eqz p2, :cond_1

    const/16 v0, 0x40

    .line 120
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    add-int/lit8 p1, v0, 0x1

    .line 122
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 123
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/16 v0, 0x5c

    .line 125
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_1

    .line 127
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    .line 128
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    :cond_1
    :goto_0
    const-string v0, ""

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, v0

    .line 133
    :goto_1
    iput-object p1, p0, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    move-object p2, v0

    .line 134
    :goto_2
    iput-object p2, p0, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    if-eqz p3, :cond_4

    goto :goto_3

    :cond_4
    move-object p3, v0

    .line 135
    :goto_3
    iput-object p3, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    if-nez p4, :cond_8

    .line 191
    sget-object p1, Ll/ۘۚ᩵;->ۙ:Ll/ۘۚ᩵;

    const-string p3, "guest"

    .line 192
    invoke-virtual {p3, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 193
    sget-object p1, Ll/ۘۚ᩵;->᩹:Ll/ۘۚ᩵;

    goto :goto_4

    .line 286
    :cond_5
    iget-object p2, p0, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    if-eqz p2, :cond_6

    .line 194
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 304
    :cond_6
    iget-object p2, p0, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    .line 194
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 318
    iget-object p2, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    .line 194
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 195
    sget-object p1, Ll/ۘۚ᩵;->᩶:Ll/ۘۚ᩵;

    .line 137
    :cond_7
    :goto_4
    iput-object p1, p0, Ll/ᩴۚ᩵;->ۙ:Ll/ۘۚ᩵;

    return-void

    .line 139
    :cond_8
    iput-object p4, p0, Ll/ᩴۚ᩵;->ۙ:Ll/ۘۚ᩵;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 54
    invoke-virtual {p0}, Ll/ᩴۚ᩵;->clone()Ll/ᩴۚ᩵;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ll/ۛ֡᩵;
    .locals 1

    .line 54
    invoke-virtual {p0}, Ll/ᩴۚ᩵;->clone()Ll/ᩴۚ᩵;

    move-result-object v0

    return-object v0
.end method

.method public clone()Ll/ᩴۚ᩵;
    .locals 2

    .line 267
    new-instance v0, Ll/ᩴۚ᩵;

    invoke-direct {v0}, Ll/ᩴۚ᩵;-><init>()V

    .line 274
    iget-object v1, p0, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    iput-object v1, v0, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    .line 275
    iget-object v1, p0, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    iput-object v1, v0, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    .line 276
    iget-object v1, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    iput-object v1, v0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    .line 277
    iget-object v1, p0, Ll/ᩴۚ᩵;->ۙ:Ll/ۘۚ᩵;

    iput-object v1, v0, Ll/ᩴۚ᩵;->ۙ:Ll/ۘۚ᩵;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 342
    instance-of v0, p1, Ll/ᩴۚ᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 343
    check-cast p1, Ll/ᩴۚ᩵;

    .line 286
    iget-object v0, p1, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 344
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    .line 286
    :goto_0
    iget-object v3, p0, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 345
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    .line 346
    :cond_1
    iget-object v3, p1, Ll/ᩴۚ᩵;->ۙ:Ll/ۘۚ᩵;

    iget-object v4, p0, Ll/ᩴۚ᩵;->ۙ:Ll/ۘۚ᩵;

    if-ne v3, v4, :cond_2

    invoke-static {v0, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 304
    iget-object v0, p1, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    iget-object v2, p0, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    .line 346
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 318
    iget-object v0, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    iget-object p1, p1, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    .line 347
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 328
    iget-object v0, p0, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 329
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\\"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final getPassword()Ljava/lang/String;
    .locals 1

    .line 318
    iget-object v0, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 358
    invoke-virtual {p0}, Ll/ᩴۚ᩵;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 368
    invoke-virtual {p0}, Ll/ᩴۚ᩵;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 304
    iget-object v0, p0, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/ᩴۡ᩵;Ljava/lang/String;[BZ)Ll/ܶۚ᩵;
    .locals 3

    .line 230
    sget-object v0, Ll/ᩴۚ᩵;->۬:Ll/֫᩻֨;

    const-string v1, "Have initial token "

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p3, :cond_2

    .line 235
    :try_start_0
    array-length v2, p3

    if-lez v2, :cond_2

    .line 236
    new-instance v2, Ll/۠֨᩵;

    invoke-direct {v2, p3}, Ll/۠֨᩵;-><init>([B)V

    .line 237
    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 238
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, p3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 240
    :cond_0
    invoke-virtual {v2}, Ll/۠֨᩵;->ᩳ()[Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p3

    if-eqz p3, :cond_2

    .line 241
    new-instance p3, Ljava/util/HashSet;

    invoke-virtual {v2}, Ll/۠֨᩵;->ᩳ()[Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p3, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 242
    sget-object v1, Ll/ܺۚ᩵;->֨:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p3, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    .line 243
    :cond_1
    new-instance p3, Ll/֡֨᩵;

    const-string v1, "Server does not support NTLM authentication"

    .line 44
    invoke-direct {p3, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    .line 243
    throw p3
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p3

    const-string v1, "Ignoring invalid initial token"

    .line 250
    invoke-interface {v0, v1, p3}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 248
    throw p1

    .line 253
    :cond_2
    :goto_0
    new-instance p3, Ll/ۚ֨᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    new-instance v1, Ll/ܺۚ᩵;

    invoke-direct {v1, p1, p0, p4}, Ll/ܺۚ᩵;-><init>(Ll/ᩴۡ᩵;Ll/ᩴۚ᩵;Z)V

    if-eqz p2, :cond_3

    .line 258
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ۢ֫()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "cifs/"

    .line 259
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ܺۚ᩵;->֫(Ljava/lang/String;)V

    .line 253
    :cond_3
    invoke-direct {p3, v0, v1}, Ll/ۚ֨᩵;-><init>(Ll/֨ۡ᩵;Ll/ܺۚ᩵;)V

    return-object p3
.end method

.method public ֫(Ll/ᩴۡ᩵;[B[B)V
    .locals 6

    .line 547
    :try_start_0
    invoke-static {}, Ll/ۙ֨᩵;->֫()Ljava/security/MessageDigest;

    move-result-object v0

    .line 592
    invoke-static {}, Ll/ۙ֨᩵;->֫()Ljava/security/MessageDigest;

    move-result-object v1

    .line 593
    iget-object v2, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    invoke-static {v2}, Ll/ۤ֨᩵;->ۧ(Ljava/lang/String;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/security/MessageDigest;->update([B)V

    .line 594
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 549
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v2

    check-cast v2, Ll/ܰۡ᩵;

    invoke-virtual {v2}, Ll/ܰۡ᩵;->ۢ()I

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0x10

    if-eqz v2, :cond_2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_2

    const/4 v5, 0x2

    if-eq v2, v5, :cond_2

    const/4 v5, 0x3

    if-eq v2, v5, :cond_0

    const/4 v5, 0x4

    if-eq v2, v5, :cond_0

    const/4 v5, 0x5

    if-eq v2, v5, :cond_0

    .line 578
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 579
    invoke-virtual {v0, p3, v3, v4}, Ljava/security/MessageDigest;->digest([BII)I

    return-void

    :cond_0
    move-object v0, p0

    .line 559
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 560
    :try_start_1
    iget-object v2, p0, Ll/ᩴۚ᩵;->᩸:[B

    if-nez v2, :cond_1

    const/16 v2, 0x8

    new-array v2, v2, [B

    .line 561
    iput-object v2, p0, Ll/ᩴۚ᩵;->᩸:[B

    .line 562
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ۤ()Ljava/security/SecureRandom;

    move-result-object p1

    iget-object v2, p0, Ll/ᩴۚ᩵;->᩸:[B

    invoke-virtual {p1, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 564
    :cond_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 566
    :try_start_2
    invoke-static {v1}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object p1

    .line 567
    iget-object v0, p0, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۤ֨᩵;->ۧ(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 568
    iget-object v0, p0, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۤ֨᩵;->ۧ(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 569
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    .line 570
    invoke-static {p1}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object v0

    .line 571
    invoke-virtual {v0, p2}, Ljava/security/MessageDigest;->update([B)V

    .line 572
    iget-object p2, p0, Ll/ᩴۚ᩵;->᩸:[B

    invoke-virtual {v0, p2}, Ljava/security/MessageDigest;->update([B)V

    .line 573
    invoke-static {p1}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object p1

    .line 574
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/security/MessageDigest;->update([B)V

    .line 575
    invoke-virtual {p1, p3, v3, v4}, Ljava/security/MessageDigest;->digest([BII)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p1

    .line 564
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    .line 553
    :cond_2
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 554
    invoke-virtual {v0, p3, v3, v4}, Ljava/security/MessageDigest;->digest([BII)I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 583
    new-instance p2, Ll/ۗۚ᩵;

    const-string p3, ""

    invoke-direct {p2, p3, p1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method public ֫(Ll/ᩴۡ᩵;[B)[B
    .locals 3

    .line 441
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ۢ()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 456
    iget-object v0, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    invoke-static {p1, v0, p2}, Ll/᩵ۚ᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;[B)[B

    move-result-object p1

    return-object p1

    .line 450
    :cond_0
    iget-object v0, p0, Ll/ᩴۚ᩵;->᩸:[B

    if-nez v0, :cond_1

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 451
    iput-object v0, p0, Ll/ᩴۚ᩵;->᩸:[B

    .line 452
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ۤ()Ljava/security/SecureRandom;

    move-result-object p1

    iget-object v0, p0, Ll/ᩴۚ᩵;->᩸:[B

    invoke-virtual {p1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 454
    :cond_1
    iget-object p1, p0, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    iget-object v0, p0, Ll/ᩴۚ᩵;->ۗ:Ljava/lang/String;

    iget-object v1, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    iget-object v2, p0, Ll/ᩴۚ᩵;->᩸:[B

    .line 181
    invoke-static {v1}, Ll/᩵ۚ᩵;->֫(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {p1, v0, v1, p2, v2}, Ll/᩵ۚ᩵;->֫(Ljava/lang/String;Ljava/lang/String;[B[B[B)[B

    move-result-object p1

    return-object p1

    .line 446
    :cond_2
    iget-object p1, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    .line 220
    invoke-static {p1}, Ll/᩵ۚ᩵;->֫(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1, p2}, Ll/᩵ۚ᩵;->֫([B[B)[B

    move-result-object p1

    return-object p1

    .line 444
    :cond_3
    iget-object v0, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    invoke-static {p1, v0, p2}, Ll/᩵ۚ᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;[B)[B

    move-result-object p1

    return-object p1
.end method

.method public final ۗۧ()Z
    .locals 2

    .line 380
    iget-object v0, p0, Ll/ᩴۚ᩵;->ۙ:Ll/ۘۚ᩵;

    sget-object v1, Ll/ۘۚ᩵;->᩹:Ll/ۘۚ᩵;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ll/ᩴۚ᩵;
    .locals 2

    .line 2
    const-class v0, Ll/ۛ֡᩵;

    .line 204
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ۧ(Ll/ᩴۡ᩵;[B)[B
    .locals 1

    .line 470
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ۢ()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    .line 480
    iget-object p1, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    .line 220
    invoke-static {p1}, Ll/᩵ۚ᩵;->֫(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1, p2}, Ll/᩵ۚ᩵;->֫([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [B

    return-object p1

    .line 474
    :cond_1
    iget-object p1, p0, Ll/ᩴۚ᩵;->᩶:Ljava/lang/String;

    .line 220
    invoke-static {p1}, Ll/᩵ۚ᩵;->֫(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1, p2}, Ll/᩵ۚ᩵;->֫([B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public final ܰ֫()Z
    .locals 2

    .line 374
    iget-object v0, p0, Ll/ᩴۚ᩵;->ۙ:Ll/ۘۚ᩵;

    sget-object v1, Ll/ۘۚ᩵;->᩶:Ll/ۘۚ᩵;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩶֫()Ljava/lang/String;
    .locals 1

    .line 286
    iget-object v0, p0, Ll/ᩴۚ᩵;->᩹:Ljava/lang/String;

    return-object v0
.end method
