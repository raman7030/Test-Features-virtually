.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Lcom/amazonaws/services/s3/model/Permission;

.field public ۙ:Lcom/amazonaws/services/s3/model/Grantee;

.field public final ᩶:Lcom/amazonaws/services/s3/model/AccessControlList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1041
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 1043
    new-instance v0, Lcom/amazonaws/services/s3/model/AccessControlList;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/AccessControlList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->᩶:Lcom/amazonaws/services/s3/model/AccessControlList;

    const/4 v0, 0x0

    .line 1046
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۙ:Lcom/amazonaws/services/s3/model/Grantee;

    .line 1047
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۗ:Lcom/amazonaws/services/s3/model/Permission;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 3

    const-string v0, "AccessControlPolicy"

    .line 1063
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p2, "Owner"

    .line 1064
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 1065
    new-instance p1, Lcom/amazonaws/services/s3/model/Owner;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/Owner;-><init>()V

    iget-object p2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->᩶:Lcom/amazonaws/services/s3/model/AccessControlList;

    invoke-virtual {p2, p1}, Lcom/amazonaws/services/s3/model/AccessControlList;->֫(Lcom/amazonaws/services/s3/model/Owner;)V

    return-void

    :cond_0
    const-string v1, "AccessControlList"

    const-string v2, "Grant"

    .line 1070
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "Grantee"

    .line 1071
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 1073
    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    .line 333
    sget-object p1, Lcom/amazonaws/util/StringUtils;->֫:Ljava/nio/charset/Charset;

    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_4

    const-string v1, "xsi:type"

    .line 273
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v2

    if-nez v2, :cond_3

    if-nez p2, :cond_1

    goto :goto_2

    .line 337
    :cond_1
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v0

    if-ge p1, v0, :cond_4

    .line 338
    invoke-interface {p2, p1}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    move-result-object v0

    .line 339
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 340
    invoke-interface {p2, p1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    const/4 p1, 0x0

    :goto_3
    const-string p2, "AmazonCustomerByEmail"

    .line 1075
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 1076
    new-instance p1, Lcom/amazonaws/services/s3/model/EmailAddressGrantee;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/EmailAddressGrantee;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۙ:Lcom/amazonaws/services/s3/model/Grantee;

    return-void

    :cond_5
    const-string p2, "CanonicalUser"

    .line 1077
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 1078
    new-instance p1, Lcom/amazonaws/services/s3/model/CanonicalGrantee;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/CanonicalGrantee;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۙ:Lcom/amazonaws/services/s3/model/Grantee;

    return-void

    :cond_6
    const-string p2, "Group"

    .line 1079
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    :cond_7
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 7

    const-string v0, "Owner"

    const-string v1, "AccessControlPolicy"

    .line 1091
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v2, "DisplayName"

    const-string v3, "ID"

    iget-object v4, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->᩶:Lcom/amazonaws/services/s3/model/AccessControlList;

    if-eqz v0, :cond_1

    .line 1092
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1093
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/AccessControlList;->ۧ()Lcom/amazonaws/services/s3/model/Owner;

    move-result-object p1

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->ۧ(Ljava/lang/String;)V

    return-void

    .line 1094
    :cond_0
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 1095
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/AccessControlList;->ۧ()Lcom/amazonaws/services/s3/model/Owner;

    move-result-object p1

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->֫(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "AccessControlList"

    .line 1099
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v5

    const-string v6, "Grant"

    if-eqz v5, :cond_2

    .line 1100
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 1101
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۙ:Lcom/amazonaws/services/s3/model/Grantee;

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۗ:Lcom/amazonaws/services/s3/model/Permission;

    .line 138
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/AccessControlList;->֫()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/amazonaws/services/s3/model/Grant;

    invoke-direct {v2, p1, v0}, Lcom/amazonaws/services/s3/model/Grant;-><init>(Lcom/amazonaws/services/s3/model/Grantee;Lcom/amazonaws/services/s3/model/Permission;)V

    check-cast v1, Ljava/util/LinkedList;

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 1104
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۙ:Lcom/amazonaws/services/s3/model/Grantee;

    .line 1105
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۗ:Lcom/amazonaws/services/s3/model/Permission;

    return-void

    .line 1109
    :cond_2
    filled-new-array {v1, v0, v6}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v0, "Permission"

    .line 1110
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 1111
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/services/s3/model/Permission;->֫(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/Permission;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۗ:Lcom/amazonaws/services/s3/model/Permission;

    return-void

    :cond_3
    const-string v4, "Grantee"

    .line 1115
    filled-new-array {v1, v0, v6, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1116
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1117
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۙ:Lcom/amazonaws/services/s3/model/Grantee;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/amazonaws/services/s3/model/Grantee;->֫(Ljava/lang/String;)V

    return-void

    :cond_4
    const-string v0, "EmailAddress"

    .line 1119
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1120
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۙ:Lcom/amazonaws/services/s3/model/Grantee;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/amazonaws/services/s3/model/Grantee;->֫(Ljava/lang/String;)V

    return-void

    :cond_5
    const-string v0, "URI"

    .line 1122
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1128
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/services/s3/model/GroupGrantee;->ۧ(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/GroupGrantee;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۙ:Lcom/amazonaws/services/s3/model/Grantee;

    return-void

    .line 1130
    :cond_6
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 1131
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$AccessControlListHandler;->ۙ:Lcom/amazonaws/services/s3/model/Grantee;

    check-cast p1, Lcom/amazonaws/services/s3/model/CanonicalGrantee;

    .line 1132
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_7
    return-void
.end method
