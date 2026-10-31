.class public Ll/ܰۡ᩵;
.super Ljava/lang/Object;
.source "D9Z7"

# interfaces
.implements Ll/֨ۡ᩵;


# static fields
.field public static final ۖ֫:Ll/֫᩻֨;


# instance fields
.field public ֡:Ll/᩸ۡ᩵;

.field public ֨:Ll/᩸ۡ᩵;

.field public ֫:Ljava/net/InetAddress;

.field public ֫֫:I

.field public ۖ:I

.field public ۗ:I

.field public ۘ:[B

.field public ۙ:I

.field public ۚ:I

.field public ۛ:Z

.field public ۜ:I

.field public ۜ֫:I

.field public ۟:J

.field public ۠:Ljava/lang/String;

.field public ۡ:Z

.field public ۡ֫:I

.field public ۢ:Ljava/lang/String;

.field public ۢ֫:Z

.field public ۤ:Ljava/security/SecureRandom;

.field public ۧ:I

.field public ۧ֫:I

.field public ۨ:Ljava/util/ArrayList;

.field public ۫:Ljava/lang/String;

.field public ۬:I

.field public ܰ:I

.field public ܳ:Ljava/util/HashSet;

.field public ܳ֫:I

.field public ܶ:Ljava/lang/String;

.field public ܺ:I

.field public ܺ֫:[Ljava/net/InetAddress;

.field public ܽ:I

.field public ܽ֫:I

.field public ܿ:Z

.field public ܿ֫:I

.field public ᩳ:J

.field public ᩳ֫:I

.field public ᩴ:I

.field public ᩵:I

.field public ᩶:I

.field public ᩷:Ljava/lang/String;

.field public ᩷֫:I

.field public ᩸:I

.field public ᩹:I

.field public ᩺:Z

.field public ᩻:Z

.field public ᩻֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 50
    const-class v0, Ll/ܰۡ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܰۡ᩵;->ۖ֫:Ll/֫᩻֨;

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "TreeConnectAndX.QueryInformation"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 148
    invoke-direct {p0, v0}, Ll/ܰۡ᩵;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 6

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v0, -0x1

    .line 59
    iput v0, p0, Ll/ܰۡ᩵;->ۖ:I

    const/4 v0, 0x1

    .line 63
    iput-boolean v0, p0, Ll/ܰۡ᩵;->ۢ֫:Z

    .line 67
    iput-boolean v0, p0, Ll/ܰۡ᩵;->ۡ:Z

    const/4 v1, 0x3

    .line 76
    iput v1, p0, Ll/ܰۡ᩵;->ܺ:I

    .line 80
    iput-boolean v0, p0, Ll/ܰۡ᩵;->᩻:Z

    .line 81
    iput-boolean v0, p0, Ll/ܰۡ᩵;->ܿ:Z

    const-string v1, "Cp850"

    .line 82
    iput-object v1, p0, Ll/ܰۡ᩵;->۫:Ljava/lang/String;

    const/4 v2, 0x0

    .line 83
    iput v2, p0, Ll/ܰۡ᩵;->ۜ:I

    .line 84
    iput v2, p0, Ll/ܰۡ᩵;->ܽ:I

    const/16 v3, 0xfa

    .line 85
    iput v3, p0, Ll/ܰۡ᩵;->ܰ:I

    const/16 v3, 0x7530

    .line 87
    iput v3, p0, Ll/ܰۡ᩵;->ܿ֫:I

    const v3, 0x88b8

    .line 88
    iput v3, p0, Ll/ܰۡ᩵;->ۜ֫:I

    .line 89
    iput v3, p0, Ll/ܰۡ᩵;->֫֫:I

    .line 90
    iput v3, p0, Ll/ܰۡ᩵;->᩻֫:I

    const/16 v3, 0xa

    .line 94
    iput v3, p0, Ll/ܰۡ᩵;->ᩴ:I

    const v3, 0xffff

    .line 95
    iput v3, p0, Ll/ܰۡ᩵;->ܳ֫:I

    .line 96
    iput v3, p0, Ll/ܰۡ᩵;->ᩳ֫:I

    const-string v3, "jCIFS"

    .line 99
    iput-object v3, p0, Ll/ܰۡ᩵;->۠:Ljava/lang/String;

    .line 100
    iput v0, p0, Ll/ܰۡ᩵;->ۡ֫:I

    const-wide/16 v3, 0x12c

    .line 102
    iput-wide v3, p0, Ll/ܰۡ᩵;->ᩳ:J

    const v3, 0x8ca0

    .line 110
    iput v3, p0, Ll/ܰۡ᩵;->᩸:I

    const/16 v3, 0x1388

    .line 111
    iput v3, p0, Ll/ܰۡ᩵;->۬:I

    const/16 v3, 0x240

    .line 112
    iput v3, p0, Ll/ܰۡ᩵;->ۗ:I

    .line 113
    iput v3, p0, Ll/ܰۡ᩵;->ۙ:I

    const/4 v3, 0x2

    .line 114
    iput v3, p0, Ll/ܰۡ᩵;->᩹:I

    const/16 v4, 0xbb8

    .line 115
    iput v4, p0, Ll/ܰۡ᩵;->᩶:I

    new-array v2, v2, [Ljava/net/InetAddress;

    .line 120
    iput-object v2, p0, Ll/ܰۡ᩵;->ܺ֫:[Ljava/net/InetAddress;

    const/high16 v2, 0x10000

    .line 123
    iput v2, p0, Ll/ܰۡ᩵;->ۚ:I

    const v2, 0xfdff

    .line 124
    iput v2, p0, Ll/ܰۡ᩵;->᩷֫:I

    const/16 v2, 0x10

    .line 125
    iput v2, p0, Ll/ܰۡ᩵;->ۧ:I

    const v2, 0xff9b

    .line 126
    iput v2, p0, Ll/ܰۡ᩵;->ܽ֫:I

    const/16 v2, 0xc8

    .line 127
    iput v2, p0, Ll/ܰۡ᩵;->ۧ֫:I

    const-wide/16 v4, 0x1388

    .line 128
    iput-wide v4, p0, Ll/ܰۡ᩵;->۟:J

    .line 130
    iput v3, p0, Ll/ܰۡ᩵;->᩵:I

    .line 136
    iput-boolean v0, p0, Ll/ܰۡ᩵;->ۛ:Z

    .line 137
    iput-boolean v0, p0, Ll/ܰۡ᩵;->᩺:Z

    const-string v0, "GUEST"

    .line 139
    iput-object v0, p0, Ll/ܰۡ᩵;->ۢ:Ljava/lang/String;

    const-string v0, ""

    .line 140
    iput-object v0, p0, Ll/ܰۡ᩵;->᩷:Ljava/lang/String;

    if-eqz p1, :cond_9

    .line 751
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 757
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x40f0000000000000L    # 65536.0

    mul-double v0, v0, v2

    double-to-int p1, v0

    iput p1, p0, Ll/ܰۡ᩵;->ۖ:I

    .line 758
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 759
    new-instance p1, Ljava/security/SecureRandom;

    invoke-direct {p1}, Ljava/security/SecureRandom;-><init>()V

    iput-object p1, p0, Ll/ܰۡ᩵;->ۤ:Ljava/security/SecureRandom;

    .line 761
    iget-object v0, p0, Ll/ܰۡ᩵;->ۘ:[B

    if-nez v0, :cond_0

    const/16 v0, 0x20

    new-array v0, v0, [B

    .line 763
    invoke-virtual {p1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 764
    iput-object v0, p0, Ll/ܰۡ᩵;->ۘ:[B

    .line 767
    :cond_0
    iget-object p1, p0, Ll/ܰۡ᩵;->ܶ:Ljava/lang/String;

    if-nez p1, :cond_1

    const-string p1, "os.name"

    .line 768
    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۡ᩵;->ܶ:Ljava/lang/String;

    .line 771
    :cond_1
    iget p1, p0, Ll/ܰۡ᩵;->ۜ:I

    if-nez p1, :cond_2

    const p1, 0xc803

    .line 776
    iput p1, p0, Ll/ܰۡ᩵;->ۜ:I

    .line 779
    :cond_2
    iget p1, p0, Ll/ܰۡ᩵;->ܽ:I

    if-nez p1, :cond_3

    const p1, -0x7fff3fac

    .line 783
    iput p1, p0, Ll/ܰۡ᩵;->ܽ:I

    .line 786
    :cond_3
    iget-object p1, p0, Ll/ܰۡ᩵;->֫:Ljava/net/InetAddress;

    if-nez p1, :cond_4

    :try_start_1
    const-string p1, "255.255.255.255"

    .line 788
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۡ᩵;->֫:Ljava/net/InetAddress;
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 790
    sget-object v0, Ll/ܰۡ᩵;->ۖ֫:Ll/֫᩻֨;

    const-string v1, "Failed to get broadcast address"

    invoke-interface {v0, v1, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 794
    :cond_4
    :goto_0
    iget-object p1, p0, Ll/ܰۡ᩵;->ۨ:Ljava/util/ArrayList;

    if-nez p1, :cond_6

    .line 676
    iget-object p1, p0, Ll/ܰۡ᩵;->ܺ֫:[Ljava/net/InetAddress;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۡ᩵;->ۨ:Ljava/util/ArrayList;

    .line 684
    array-length p1, p1

    if-nez p1, :cond_5

    .line 685
    sget-object p1, Ll/ۗۡ᩵;->ۙ:Ll/ۗۡ᩵;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 686
    iget-object p1, p0, Ll/ܰۡ᩵;->ۨ:Ljava/util/ArrayList;

    sget-object v0, Ll/ۗۡ᩵;->᩶:Ll/ۗۡ᩵;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 687
    iget-object p1, p0, Ll/ܰۡ᩵;->ۨ:Ljava/util/ArrayList;

    sget-object v0, Ll/ۗۡ᩵;->᩹:Ll/ۗۡ᩵;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 689
    :cond_5
    sget-object p1, Ll/ۗۡ᩵;->ۙ:Ll/ۗۡ᩵;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 690
    iget-object p1, p0, Ll/ܰۡ᩵;->ۨ:Ljava/util/ArrayList;

    sget-object v0, Ll/ۗۡ᩵;->᩶:Ll/ۗۡ᩵;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 691
    iget-object p1, p0, Ll/ܰۡ᩵;->ۨ:Ljava/util/ArrayList;

    sget-object v0, Ll/ۗۡ᩵;->ۗ:Ll/ۗۡ᩵;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 692
    iget-object p1, p0, Ll/ܰۡ᩵;->ۨ:Ljava/util/ArrayList;

    sget-object v0, Ll/ۗۡ᩵;->᩹:Ll/ۗۡ᩵;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 798
    :cond_6
    :goto_1
    iget-object p1, p0, Ll/ܰۡ᩵;->֨:Ll/᩸ۡ᩵;

    if-eqz p1, :cond_7

    iget-object p1, p0, Ll/ܰۡ᩵;->֡:Ll/᩸ۡ᩵;

    if-nez p1, :cond_8

    .line 726
    :cond_7
    sget-object p1, Ll/᩸ۡ᩵;->ۙ:Ll/᩸ۡ᩵;

    iput-object p1, p0, Ll/ܰۡ᩵;->֨:Ll/᩸ۡ᩵;

    .line 727
    iput-object p1, p0, Ll/ܰۡ᩵;->֡:Ll/᩸ۡ᩵;

    .line 729
    invoke-virtual {p1, p1}, Ll/᩸ۡ᩵;->֫(Ll/᩸ۡ᩵;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 730
    iget-object p1, p0, Ll/ܰۡ᩵;->֨:Ll/᩸ۡ᩵;

    iput-object p1, p0, Ll/ܰۡ᩵;->֡:Ll/᩸ۡ᩵;

    .line 802
    :cond_8
    iget-object p1, p0, Ll/ܰۡ᩵;->ܳ:Ljava/util/HashSet;

    if-nez p1, :cond_9

    .line 806
    new-instance p1, Ljava/util/HashSet;

    const-string v0, "Smb2SessionSetupRequest"

    const-string v1, "Smb2TreeConnectRequest"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Ll/ܰۡ᩵;->ܳ:Ljava/util/HashSet;

    goto :goto_2

    .line 753
    :catch_1
    new-instance p1, Ll/᩵ۡ᩵;

    const-string v0, "The default OEM encoding Cp850 does not appear to be supported by this JRE."

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 753
    throw p1

    :cond_9
    :goto_2
    return-void
.end method


# virtual methods
.method public final ֡()Ll/᩸ۡ᩵;
    .locals 1

    .line 274
    iget-object v0, p0, Ll/ܰۡ᩵;->֡:Ll/᩸ۡ᩵;

    return-object v0
.end method

.method public final ֨()Ljava/lang/String;
    .locals 1

    .line 244
    iget-object v0, p0, Ll/ܰۡ᩵;->۠:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()J
    .locals 2

    .line 568
    iget-wide v0, p0, Ll/ܰۡ᩵;->۟:J

    return-wide v0
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x1

    .line 659
    iget-object v1, p0, Ll/ܰۡ᩵;->ܳ:Ljava/util/HashSet;

    if-nez v1, :cond_0

    return v0

    .line 662
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v0

    return p1
.end method

.method public final ֫֫()I
    .locals 1

    .line 207
    iget v0, p0, Ll/ܰۡ᩵;->᩻֫:I

    return v0
.end method

.method public final ۖ()[B
    .locals 1

    .line 622
    iget-object v0, p0, Ll/ܰۡ᩵;->ۘ:[B

    return-object v0
.end method

.method public final ۗ()I
    .locals 1

    .line 430
    iget v0, p0, Ll/ܰۡ᩵;->۬:I

    return v0
.end method

.method public final ۘ()I
    .locals 1

    .line 238
    iget v0, p0, Ll/ܰۡ᩵;->ᩴ:I

    return v0
.end method

.method public final ۙ()I
    .locals 1

    .line 466
    iget v0, p0, Ll/ܰۡ᩵;->ۗ:I

    return v0
.end method

.method public final ۚ()Ll/᩸ۡ᩵;
    .locals 1

    .line 268
    iget-object v0, p0, Ll/ܰۡ᩵;->֨:Ll/᩸ۡ᩵;

    return-object v0
.end method

.method public final ۛ()I
    .locals 1

    .line 226
    iget v0, p0, Ll/ܰۡ᩵;->ᩳ֫:I

    return v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 610
    iget-object v0, p0, Ll/ܰۡ᩵;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ۜ֫()Z
    .locals 1

    .line 520
    iget-boolean v0, p0, Ll/ܰۡ᩵;->ۡ:Z

    return v0
.end method

.method public final ۟()I
    .locals 1

    .line 484
    iget v0, p0, Ll/ܰۡ᩵;->ܰ:I

    return v0
.end method

.method public final ۠()Ljava/lang/String;
    .locals 1

    .line 250
    iget-object v0, p0, Ll/ܰۡ᩵;->ܶ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۡ()I
    .locals 1

    .line 556
    iget v0, p0, Ll/ܰۡ᩵;->ۧ֫:I

    return v0
.end method

.method public final ۡ֫()Z
    .locals 1

    .line 304
    iget-boolean v0, p0, Ll/ܰۡ᩵;->ۢ֫:Z

    return v0
.end method

.method public final ۢ()I
    .locals 1

    .line 370
    iget v0, p0, Ll/ܰۡ᩵;->ܺ:I

    return v0
.end method

.method public final ۢ֫()Z
    .locals 1

    .line 598
    iget-boolean v0, p0, Ll/ܰۡ᩵;->᩺:Z

    return v0
.end method

.method public final ۤ()Ljava/security/SecureRandom;
    .locals 1

    .line 165
    iget-object v0, p0, Ll/ܰۡ᩵;->ۤ:Ljava/security/SecureRandom;

    return-object v0
.end method

.method public final ۧ()Ljava/net/InetAddress;
    .locals 1

    .line 400
    iget-object v0, p0, Ll/ܰۡ᩵;->֫:Ljava/net/InetAddress;

    return-object v0
.end method

.method public final ۧ֫()I
    .locals 1

    .line 201
    iget v0, p0, Ll/ܰۡ᩵;->ۜ֫:I

    return v0
.end method

.method public final ۨ()Ljava/util/ArrayList;
    .locals 1

    .line 406
    iget-object v0, p0, Ll/ܰۡ᩵;->ۨ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۫()I
    .locals 1

    .line 502
    iget v0, p0, Ll/ܰۡ᩵;->ۖ:I

    return v0
.end method

.method public final ۬()Ljava/lang/String;
    .locals 1

    .line 490
    iget-object v0, p0, Ll/ܰۡ᩵;->۫:Ljava/lang/String;

    return-object v0
.end method

.method public final ܰ()I
    .locals 1

    .line 213
    iget v0, p0, Ll/ܰۡ᩵;->ܳ֫:I

    return v0
.end method

.method public final ܳ()J
    .locals 2

    .line 328
    iget-wide v0, p0, Ll/ܰۡ᩵;->ᩳ:J

    return-wide v0
.end method

.method public final ܳ֫()Z
    .locals 1

    .line 364
    iget-boolean v0, p0, Ll/ܰۡ᩵;->ܿ:Z

    return v0
.end method

.method public final ܶ()I
    .locals 1

    .line 442
    iget v0, p0, Ll/ܰۡ᩵;->᩸:I

    return v0
.end method

.method public final ܺ()I
    .locals 1

    .line 562
    iget v0, p0, Ll/ܰۡ᩵;->ܽ֫:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 550
    iget v0, p0, Ll/ܰۡ᩵;->ۧ:I

    return v0
.end method

.method public final ܽ֫()I
    .locals 1

    .line 538
    iget v0, p0, Ll/ܰۡ᩵;->᩷֫:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 189
    iget v0, p0, Ll/ܰۡ᩵;->֫֫:I

    return v0
.end method

.method public final ܿ֫()[Ljava/net/InetAddress;
    .locals 1

    .line 412
    iget-object v0, p0, Ll/ܰۡ᩵;->ܺ֫:[Ljava/net/InetAddress;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 262
    iget v0, p0, Ll/ܰۡ᩵;->ܽ:I

    return v0
.end method

.method public final ᩳ֫()I
    .locals 1

    .line 256
    iget v0, p0, Ll/ܰۡ᩵;->ۡ֫:I

    return v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 580
    iget v0, p0, Ll/ܰۡ᩵;->᩵:I

    return v0
.end method

.method public final ᩵()I
    .locals 1

    .line 544
    iget v0, p0, Ll/ܰۡ᩵;->ۚ:I

    return v0
.end method

.method public final ᩶()I
    .locals 1

    .line 460
    iget v0, p0, Ll/ܰۡ᩵;->᩶:I

    return v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 604
    iget-object v0, p0, Ll/ܰۡ᩵;->ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷֫()Z
    .locals 1

    .line 286
    iget-boolean v0, p0, Ll/ܰۡ᩵;->ۛ:Z

    return v0
.end method

.method public final ᩸()I
    .locals 1

    .line 448
    iget v0, p0, Ll/ܰۡ᩵;->ۙ:I

    return v0
.end method

.method public final ᩹()I
    .locals 1

    .line 454
    iget v0, p0, Ll/ܰۡ᩵;->᩹:I

    return v0
.end method

.method public final ᩺()I
    .locals 1

    .line 195
    iget v0, p0, Ll/ܰۡ᩵;->ܿ֫:I

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 478
    iget v0, p0, Ll/ܰۡ᩵;->ۜ:I

    return v0
.end method

.method public final ᩻֫()Z
    .locals 1

    .line 394
    iget-boolean v0, p0, Ll/ܰۡ᩵;->᩻:Z

    return v0
.end method
