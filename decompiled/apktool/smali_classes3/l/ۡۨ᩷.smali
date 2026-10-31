.class public final Ll/ۡۨ᩷;
.super Ljava/lang/Object;
.source "51FV"


# instance fields
.field public final synthetic ֫:Ll/᩵ۨ᩷;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩵ۨ᩷;)V
    .locals 0

    .line 616
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۨ᩷;->֫:Ll/᩵ۨ᩷;

    .line 617
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۡۨ᩷;->ۧ:Ljava/util/ArrayList;

    .line 618
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۡۨ᩷;->ܽ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 621
    iget-object v0, p0, Ll/ۡۨ᩷;->֫:Ll/᩵ۨ᩷;

    invoke-static {v0}, Ll/᩵ۨ᩷;->ۧ(Ll/᩵ۨ᩷;)Ljava/util/Map;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩺᩷;

    .line 622
    iget-object v2, v1, Ll/֡᩺᩷;->ۤ:Ll/ۧ۫᩷;

    if-eqz v2, :cond_0

    .line 623
    iget-object v2, p0, Ll/ۡۨ᩷;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 624
    :cond_0
    iget-object v2, v1, Ll/֡᩺᩷;->᩹:Ll/ۧ۫᩷;

    if-eqz v2, :cond_1

    .line 625
    iget-object v2, p0, Ll/ۡۨ᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 627
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bad xml item: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Ll/֡᩺᩷;->ۗ:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method public final ۧ()[B
    .locals 5

    .line 642
    iget-object v0, p0, Ll/ۡۨ᩷;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 643
    iget-object v1, p0, Ll/ۡۨ᩷;->ܽ:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 644
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v2

    const/16 v3, -0x7f

    .line 645
    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->update(B)V

    .line 646
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡᩺᩷;

    .line 647
    iget-object v3, v3, Ll/֡᩺᩷;->ۗ:Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->update([B)V

    goto :goto_0

    :cond_0
    const/16 v0, -0x7e

    .line 649
    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update(B)V

    .line 650
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩺᩷;

    .line 651
    iget-object v3, v1, Ll/֡᩺᩷;->ۗ:Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->update([B)V

    .line 652
    iget-object v1, v1, Ll/֡᩺᩷;->ۤ:Ll/ۧ۫᩷;

    invoke-virtual {v1}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/security/MessageDigest;->update([B)V

    goto :goto_1

    :cond_1
    const/16 v0, -0x7b

    .line 654
    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update(B)V

    .line 655
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    return-object v0
.end method
