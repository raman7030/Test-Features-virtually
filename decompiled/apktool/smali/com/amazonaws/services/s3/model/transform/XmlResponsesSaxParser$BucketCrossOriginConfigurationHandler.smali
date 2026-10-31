.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Ljava/util/ArrayList;

.field public ۙ:Ljava/util/ArrayList;

.field public ۤ:Ljava/util/ArrayList;

.field public ۫:Lcom/amazonaws/services/s3/model/CORSRule;

.field public final ۬:Lcom/amazonaws/services/s3/model/BucketCrossOriginConfiguration;

.field public ᩶:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2776
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 2778
    new-instance v0, Lcom/amazonaws/services/s3/model/BucketCrossOriginConfiguration;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1}, Lcom/amazonaws/services/s3/model/BucketCrossOriginConfiguration;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/BucketCrossOriginConfiguration;

    const/4 v0, 0x0

    .line 2782
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۙ:Ljava/util/ArrayList;

    .line 2783
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۗ:Ljava/util/ArrayList;

    .line 2784
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۤ:Ljava/util/ArrayList;

    .line 2785
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->᩶:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 2

    const-string p2, "CORSConfiguration"

    .line 2798
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "CORSRule"

    if-eqz v0, :cond_0

    .line 2799
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 2800
    new-instance p1, Lcom/amazonaws/services/s3/model/CORSRule;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/CORSRule;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/CORSRule;

    return-void

    .line 2802
    :cond_0
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "AllowedOrigin"

    .line 2803
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 2804
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۗ:Ljava/util/ArrayList;

    if-nez p1, :cond_4

    .line 2805
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۗ:Ljava/util/ArrayList;

    return-void

    :cond_1
    const-string p2, "AllowedMethod"

    .line 2807
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 2808
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۙ:Ljava/util/ArrayList;

    if-nez p1, :cond_4

    .line 2809
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۙ:Ljava/util/ArrayList;

    return-void

    :cond_2
    const-string p2, "ExposeHeader"

    .line 2811
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 2812
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۤ:Ljava/util/ArrayList;

    if-nez p1, :cond_4

    .line 2813
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۤ:Ljava/util/ArrayList;

    return-void

    :cond_3
    const-string p2, "AllowedHeader"

    .line 2815
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 2816
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->᩶:Ljava/util/LinkedList;

    if-nez p1, :cond_4

    .line 2817
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->᩶:Ljava/util/LinkedList;

    :cond_4
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 3

    const-string v0, "CORSConfiguration"

    .line 2825
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "CORSRule"

    if-eqz v1, :cond_0

    .line 2826
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 2827
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/CORSRule;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2828
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/CORSRule;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2829
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/CORSRule;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2830
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/CORSRule;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 2831
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->᩶:Ljava/util/LinkedList;

    .line 2832
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۙ:Ljava/util/ArrayList;

    .line 2833
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۗ:Ljava/util/ArrayList;

    .line 2834
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۤ:Ljava/util/ArrayList;

    .line 2836
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/BucketCrossOriginConfiguration;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/BucketCrossOriginConfiguration;->֫()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/CORSRule;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2837
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/CORSRule;

    return-void

    .line 2839
    :cond_0
    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "ID"

    .line 2840
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2841
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/CORSRule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    const-string v0, "AllowedOrigin"

    .line 2843
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2844
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    const-string v0, "AllowedMethod"

    .line 2846
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2847
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/services/s3/model/CORSRule$AllowedMethods;->֫(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/CORSRule$AllowedMethods;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    const-string v0, "MaxAgeSeconds"

    .line 2849
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2850
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/CORSRule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_4
    const-string v0, "ExposeHeader"

    .line 2852
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2853
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_5
    const-string v0, "AllowedHeader"

    .line 2855
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 2856
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketCrossOriginConfigurationHandler;->᩶:Ljava/util/LinkedList;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method
