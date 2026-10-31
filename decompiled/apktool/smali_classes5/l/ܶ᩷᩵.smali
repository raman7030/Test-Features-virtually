.class public final Ll/ܶ᩷᩵;
.super Ll/᩹᩷᩵;
.source "C9Z9"


# static fields
.field public static ۚ:Ll/֫᩻֨;


# instance fields
.field public final ֡:I

.field public final ۘ:I

.field public final ᩴ:I

.field public final ᩵:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 692
    const-class v0, Ll/ܶ᩷᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܶ᩷᩵;->ۚ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۛۢ᩵;ZIIIILjava/lang/String;)V
    .locals 6

    .line 699
    sget-object v2, Ll/ۨۢ᩵;->ܳۧ:Ll/ۨۢ᩵;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Ll/᩹᩷᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZI)V

    .line 700
    iput p5, p0, Ll/ܶ᩷᩵;->ᩴ:I

    .line 701
    iput p6, p0, Ll/ܶ᩷᩵;->֡:I

    .line 702
    iput p7, p0, Ll/ܶ᩷᩵;->ۘ:I

    .line 703
    iput-object p8, p0, Ll/ܶ᩷᩵;->᩵:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֡()I
    .locals 1

    .line 744
    iget v0, p0, Ll/ܶ᩷᩵;->ᩴ:I

    return v0
.end method

.method public final ֨()I
    .locals 1

    .line 751
    iget v0, p0, Ll/ܶ᩷᩵;->֡:I

    return v0
.end method

.method public final ֫(Ll/ۡۢ᩵;)Ll/ܶۢ᩵;
    .locals 4

    const/4 v0, 0x0

    .line 872
    invoke-virtual {p0, v0}, Ll/ܶ᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object v0

    .line 873
    invoke-virtual {v0, p1}, Ll/᩶ۢ᩵;->֫(Ll/ۡۢ᩵;)V

    .line 884
    new-instance v1, Ll/ܶۢ᩵;

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->֨()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p1, v2, v3, v0}, Ll/ܶۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V

    return-object v1
.end method

.method public final ֫(Z)Ll/᩶ۢ᩵;
    .locals 8

    .line 863
    new-instance v7, Ll/᩶ۢ᩵;

    .line 168
    iget-object v0, p0, Ll/ܰۜ᩵;->ᩳ:Ljava/util/HashMap;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 863
    iget v4, p0, Ll/ܶ᩷᩵;->ᩴ:I

    const/4 v6, 0x0

    iget v2, p0, Ll/ܶ᩷᩵;->ۘ:I

    iget v3, p0, Ll/ܶ᩷᩵;->֡:I

    move-object v0, v7

    move v5, p1

    invoke-direct/range {v0 .. v6}, Ll/᩶ۢ᩵;-><init>(Ljava/util/Map;IIIZ[B)V

    return-object v7
.end method

.method public final ֫(Ljava/io/DataOutputStream;)V
    .locals 2

    .line 725
    invoke-super {p0, p1}, Ll/ܰۜ᩵;->֫(Ljava/io/DataOutputStream;)V

    .line 726
    iget v0, p0, Ll/ܶ᩷᩵;->ᩴ:I

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 727
    iget v0, p0, Ll/ܶ᩷᩵;->֡:I

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 728
    iget v0, p0, Ll/ܶ᩷᩵;->ۘ:I

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 730
    :try_start_0
    iget-object v0, p0, Ll/ܶ᩷᩵;->᩵:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 894
    invoke-super {p0, p1}, Ll/᩹᩷᩵;->֫(Ljava/lang/StringBuilder;)V

    const-string v0, " server: \'"

    .line 895
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ܶ᩷᩵;->᩵:Ljava/lang/String;

    .line 896
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3a

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ܶ᩷᩵;->ۘ:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    .line 897
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ll/ܿ᩷᩵;)V
    .locals 2

    .line 708
    iget v0, p0, Ll/ܶ᩷᩵;->ᩴ:I

    invoke-virtual {p1, v0}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 709
    iget v0, p0, Ll/ܶ᩷᩵;->֡:I

    invoke-virtual {p1, v0}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 710
    iget v0, p0, Ll/ܶ᩷᩵;->ۘ:I

    invoke-virtual {p1, v0}, Ll/ܿ᩷᩵;->writeShort(I)V

    .line 711
    sget-boolean v0, Ll/ۧ᩷᩵;->ܺ:Z

    iget-object v1, p0, Ll/ܶ᩷᩵;->᩵:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 712
    invoke-virtual {p1, v1}, Ll/ܿ᩷᩵;->֫(Ljava/lang/String;)V

    return-void

    .line 715
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0, v1}, Ll/ܿ᩷᩵;->ۧ(ILjava/lang/String;)V

    const/4 v0, 0x0

    .line 719
    invoke-virtual {p1, v0}, Ll/ܿ᩷᩵;->writeByte(I)V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    .line 737
    iget-object v0, p0, Ll/ܶ᩷᩵;->᩵:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ll/ۡۢ᩵;)Z
    .locals 14

    .line 777
    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Ll/ۧۤᩴ;

    invoke-virtual {v0, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۢ᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 778
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۨ()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۛ()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_0
    iget v2, p0, Ll/ܶ᩷᩵;->ۘ:I

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۡ()I

    move-result v3

    if-ne v2, v3, :cond_1

    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v2

    .line 134
    iget-object v2, v2, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 778
    iget-object v3, p0, Ll/ܶ᩷᩵;->᩵:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    :cond_1
    const-string v2, "handleQuery() Conflicting probe detected from: {}"

    .line 779
    invoke-virtual {p0}, Ll/᩹᩷᩵;->ܺ()Ljava/net/InetAddress;

    move-result-object v3

    sget-object v4, Ll/ܶ᩷᩵;->ۚ:Ll/֫᩻֨;

    invoke-interface {v4, v3, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 780
    new-instance v2, Ll/ܶ᩷᩵;

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    sget v9, Ll/۬ۢ᩵;->ۧ:I

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ܺ()I

    move-result v10

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->۠()I

    move-result v11

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۡ()I

    move-result v12

    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v3

    .line 134
    iget-object v13, v3, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    const/4 v8, 0x1

    move-object v5, v2

    .line 780
    invoke-direct/range {v5 .. v13}, Ll/ܶ᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZIIIILjava/lang/String;)V

    .line 784
    :try_start_0
    invoke-virtual {p1}, Ll/ۡۢ᩵;->᩹()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {p0}, Ll/᩹᩷᩵;->ܺ()Ljava/net/InetAddress;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}"

    .line 785
    invoke-virtual {p0}, Ll/ܰۜ᩵;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ll/ܰۜ᩵;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v3, v5, v6}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v5, "IOException"

    .line 788
    invoke-interface {v4, v5, v3}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 791
    :cond_2
    :goto_0
    invoke-virtual {p0, v2}, Ll/ܰۜ᩵;->֫(Ll/᩹᩷᩵;)I

    move-result v2

    if-nez v2, :cond_3

    const-string p1, "handleQuery() Ignoring a identical service query"

    .line 798
    invoke-interface {v4, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    return v1

    .line 803
    :cond_3
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ܰ()Z

    move-result v3

    if-eqz v3, :cond_4

    if-lez v2, :cond_4

    .line 805
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 806
    invoke-static {}, Ll/᩵ۢ᩵;->֫()Ll/֨ۢ᩵;

    move-result-object v2

    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v3

    .line 138
    iget-object v3, v3, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    .line 806
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Ll/֡ۢ᩵;->᩶:Ll/֡ۢ᩵;

    check-cast v2, Ll/ۚۢ᩵;

    invoke-virtual {v2, v3, v5}, Ll/ۚۢ᩵;->֫(Ljava/lang/String;Ll/֡ۢ᩵;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩶ۢ᩵;->֫(Ljava/lang/String;)V

    .line 807
    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v2

    check-cast v2, Ll/ۧۤᩴ;

    invoke-virtual {v2, v1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 808
    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object p1

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    check-cast p1, Ll/ۧۤᩴ;

    invoke-virtual {p1, v1, v0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "handleQuery() Lost tie break: new unique name chosen:{}"

    .line 809
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 812
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->֫֫()V

    const/4 p1, 0x1

    return p1

    :cond_4
    return v1
.end method

.method public final ܽ(Ll/ۡۢ᩵;)Z
    .locals 6

    .line 827
    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Ll/ۧۤᩴ;

    invoke-virtual {v0, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۢ᩵;

    if-eqz v0, :cond_2

    .line 828
    iget v1, p0, Ll/ܶ᩷᩵;->ۘ:I

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۡ()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v1

    .line 134
    iget-object v1, v1, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 828
    iget-object v2, p0, Ll/ܶ᩷᩵;->᩵:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    const-string v1, "handleResponse() Denial detected"

    .line 829
    sget-object v2, Ll/ܶ᩷᩵;->ۚ:Ll/֫᩻֨;

    invoke-interface {v2, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 831
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ܰ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 832
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 833
    invoke-static {}, Ll/᩵ۢ᩵;->֫()Ll/֨ۢ᩵;

    move-result-object v3

    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v4

    .line 138
    iget-object v4, v4, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    .line 833
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/֡ۢ᩵;->᩶:Ll/֡ۢ᩵;

    check-cast v3, Ll/ۚۢ᩵;

    invoke-virtual {v3, v4, v5}, Ll/ۚۢ᩵;->֫(Ljava/lang/String;Ll/֡ۢ᩵;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/᩶ۢ᩵;->֫(Ljava/lang/String;)V

    .line 834
    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v3

    check-cast v3, Ll/ۧۤᩴ;

    invoke-virtual {v3, v1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 835
    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object p1

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    check-cast p1, Ll/ۧۤᩴ;

    invoke-virtual {p1, v1, v0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "handleResponse() New unique name chose:{}"

    .line 836
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 839
    :cond_1
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->֫֫()V

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/᩹᩷᩵;)Z
    .locals 3

    .line 763
    instance-of v0, p1, Ll/ܶ᩷᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 766
    :cond_0
    check-cast p1, Ll/ܶ᩷᩵;

    .line 767
    iget v0, p0, Ll/ܶ᩷᩵;->ᩴ:I

    iget v2, p1, Ll/ܶ᩷᩵;->ᩴ:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Ll/ܶ᩷᩵;->֡:I

    iget v2, p1, Ll/ܶ᩷᩵;->֡:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Ll/ܶ᩷᩵;->ۘ:I

    iget v2, p1, Ll/ܶ᩷᩵;->ۘ:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Ll/ܶ᩷᩵;->᩵:Ljava/lang/String;

    iget-object p1, p1, Ll/ܶ᩷᩵;->᩵:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final ᩴ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩵()I
    .locals 1

    .line 758
    iget v0, p0, Ll/ܶ᩷᩵;->ۘ:I

    return v0
.end method
