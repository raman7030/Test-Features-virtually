.class public final Ll/ۗ֨ܺ;
.super Ljava/lang/Object;
.source "KB7N"


# instance fields
.field public ֫:Ll/ۘۚܺ;

.field public ۜ:Z

.field public ۡ:Ll/ܽ֨ܺ;

.field public ۢ:Ljava/lang/StringBuilder;

.field public ۧ:I

.field public ܳ:Ljava/lang/StringBuilder;

.field public ܽ:Z

.field public ܿ:Z

.field public ᩳ:Z

.field public ᩷:Z

.field public ᩻:Ll/᩹֨ܺ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 98
    iput-object v0, p0, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    .line 99
    iput-object v0, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    const/4 v1, 0x0

    .line 105
    iput-boolean v1, p0, Ll/ۗ֨ܺ;->ܽ:Z

    .line 109
    iput-boolean v1, p0, Ll/ۗ֨ܺ;->ᩳ:Z

    .line 110
    iput-object v0, p0, Ll/ۗ֨ܺ;->᩻:Ll/᩹֨ܺ;

    .line 111
    iput-object v0, p0, Ll/ۗ֨ܺ;->ܳ:Ljava/lang/StringBuilder;

    .line 114
    iput-boolean v1, p0, Ll/ۗ֨ܺ;->ܿ:Z

    .line 115
    iput-object v0, p0, Ll/ۗ֨ܺ;->ۢ:Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ֫(ILjava/lang/String;)F
    .locals 2

    .line 3558
    new-instance v0, Ll/۟᩵ܺ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 54
    invoke-virtual {v0, v1, p0, v1, p1}, Ll/۟᩵ܺ;->֫(IIILjava/lang/String;)F

    move-result p0

    .line 3560
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    return p0

    .line 3563
    :cond_0
    new-instance p0, Ll/᩵֨ܺ;

    const-string v0, "Invalid float value: "

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3563
    throw p0
.end method

.method public static ֫(F)I
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/high16 v0, 0x437f0000    # 255.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_1

    const/16 p0, 0xff

    return p0

    .line 3819
    :cond_1
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method public static ֫(FFF)I
    .locals 3

    const/high16 v0, 0x43b40000    # 360.0f

    const/4 v1, 0x0

    cmpl-float v2, p0, v1

    rem-float/2addr p0, v0

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    add-float/2addr p0, v0

    :goto_0
    const/high16 v0, 0x42700000    # 60.0f

    div-float/2addr p0, v0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    div-float/2addr p2, v0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v2, p1, v1

    if-gez v2, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    cmpl-float v2, p1, v0

    if-lez v2, :cond_2

    const/high16 p1, 0x3f800000    # 1.0f

    :cond_2
    :goto_1
    cmpg-float v2, p2, v1

    if-gez v2, :cond_3

    goto :goto_2

    :cond_3
    cmpl-float v1, p2, v0

    if-lez v1, :cond_4

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_4
    move v1, p2

    :goto_2
    const/high16 p2, 0x3f000000    # 0.5f

    cmpg-float p2, v1, p2

    if-gtz p2, :cond_5

    add-float/2addr p1, v0

    mul-float p1, p1, v1

    goto :goto_3

    :cond_5
    add-float p2, v1, p1

    mul-float p1, p1, v1

    sub-float p1, p2, p1

    :goto_3
    const/high16 p2, 0x40000000    # 2.0f

    mul-float v1, v1, p2

    sub-float/2addr v1, p1

    add-float v0, p0, p2

    .line 3839
    invoke-static {v1, p1, v0}, Ll/ۗ֨ܺ;->ۧ(FFF)F

    move-result v0

    .line 3840
    invoke-static {v1, p1, p0}, Ll/ۗ֨ܺ;->ۧ(FFF)F

    move-result v2

    sub-float/2addr p0, p2

    .line 3841
    invoke-static {v1, p1, p0}, Ll/ۗ֨ܺ;->ۧ(FFF)F

    move-result p0

    const/high16 p1, 0x43800000    # 256.0f

    mul-float v0, v0, p1

    .line 3842
    invoke-static {v0}, Ll/ۗ֨ܺ;->֫(F)I

    move-result p2

    shl-int/lit8 p2, p2, 0x10

    mul-float v2, v2, p1

    invoke-static {v2}, Ll/ۗ֨ܺ;->֫(F)I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr p2, v0

    mul-float p0, p0, p1

    invoke-static {p0}, Ll/ۗ֨ܺ;->֫(F)I

    move-result p0

    or-int/2addr p0, p2

    return p0
.end method

.method public static bridge synthetic ֫(Ll/᩶֨ܺ;)Ljava/util/HashMap;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۗ֨ܺ;->ܽ(Ll/᩶֨ܺ;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ljava/io/InputStream;)V
    .locals 3

    .line 798
    :try_start_0
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v0

    .line 800
    iget-boolean v1, p0, Ll/ۗ֨ܺ;->ۜ:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 801
    invoke-virtual {v0, v1}, Ljavax/xml/parsers/SAXParserFactory;->setNamespaceAware(Z)V

    :cond_0
    const-string v1, "http://xml.org/sax/features/external-general-entities"

    const/4 v2, 0x0

    .line 804
    invoke-virtual {v0, v1, v2}, Ljavax/xml/parsers/SAXParserFactory;->setFeature(Ljava/lang/String;Z)V

    const-string v1, "http://xml.org/sax/features/external-parameter-entities"

    .line 805
    invoke-virtual {v0, v1, v2}, Ljavax/xml/parsers/SAXParserFactory;->setFeature(Ljava/lang/String;Z)V

    .line 807
    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    move-result-object v0

    .line 808
    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object v0

    .line 810
    new-instance v1, Ll/ܶ֨ܺ;

    invoke-direct {v1, p0}, Ll/ܶ֨ܺ;-><init>(Ll/ۗ֨ܺ;)V

    .line 811
    invoke-interface {v0, v1}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    const-string v2, "http://xml.org/sax/properties/lexical-handler"

    .line 812
    invoke-interface {v0, v2, v1}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 814
    new-instance v1, Lorg/xml/sax/InputSource;

    invoke-direct {v1, p1}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V

    invoke-interface {v0, v1}, Lorg/xml/sax/XMLReader;->parse(Lorg/xml/sax/InputSource;)V
    :try_end_0
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 826
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "Stream error"

    .line 34
    invoke-direct {v0, v1, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 826
    throw v0

    :catch_1
    move-exception p1

    .line 822
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "SVG parse error"

    .line 34
    invoke-direct {v0, v1, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 822
    throw v0

    :catch_2
    move-exception p1

    .line 818
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "XML parser problem"

    .line 34
    invoke-direct {v0, v1, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 818
    throw v0
.end method

.method private ֫(Ljava/lang/String;)V
    .locals 3

    .line 1043
    iget-object v0, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    check-cast v0, Ll/ܺۚܺ;

    .line 1044
    iget-object v1, v0, Ll/ܺۚܺ;->᩷:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 1045
    :cond_0
    iget-object v0, v0, Ll/ܺۚܺ;->᩷:Ljava/util/List;

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚۚܺ;

    .line 1046
    :goto_0
    instance-of v1, v0, Ll/ܰۚܺ;

    if-eqz v1, :cond_1

    .line 1048
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v0, Ll/ܰۚܺ;

    iget-object v2, v0, Ll/ܰۚܺ;->ܽ:Ljava/lang/String;

    .line 0
    invoke-static {v1, v2, p1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1048
    iput-object p1, v0, Ll/ܰۚܺ;->ܽ:Ljava/lang/String;

    return-void

    .line 1051
    :cond_1
    iget-object v0, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    new-instance v1, Ll/ܰۚܺ;

    .line 1916
    invoke-direct {v1}, Ll/ۚۚܺ;-><init>()V

    .line 1917
    iput-object p1, v1, Ll/ܰۚܺ;->ܽ:Ljava/lang/String;

    .line 1051
    invoke-interface {v0, v1}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    return-void
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1058
    iget-boolean v0, p0, Ll/ۗ֨ܺ;->ܽ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1059
    iget v0, p0, Ll/ۗ֨ܺ;->ۧ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۗ֨ܺ;->ۧ:I

    if-nez v0, :cond_0

    .line 1060
    iput-boolean v1, p0, Ll/ۗ֨ܺ;->ܽ:Z

    return-void

    :cond_0
    const-string v0, "http://www.w3.org/2000/svg"

    .line 1065
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_2

    .line 1069
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_2

    goto :goto_0

    :cond_2
    move-object p2, p3

    .line 1070
    :goto_0
    invoke-static {p2}, Ll/᩹֨ܺ;->֫(Ljava/lang/String;)Ll/᩹֨ܺ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto :goto_2

    .line 1086
    :pswitch_1
    iget-object p1, p0, Ll/ۗ֨ܺ;->ۢ:Ljava/lang/StringBuilder;

    if-eqz p1, :cond_5

    .line 1087
    iput-boolean v1, p0, Ll/ۗ֨ܺ;->ܿ:Z

    .line 1088
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 4565
    new-instance p2, Ll/᩺᩵ܺ;

    sget-object p3, Ll/֡᩵ܺ;->ۛ:Ll/֡᩵ܺ;

    sget-object v0, Ll/ۨ᩵ܺ;->᩹:Ll/ۨ᩵ܺ;

    invoke-direct {p2, p3, v0}, Ll/᩺᩵ܺ;-><init>(Ll/֡᩵ܺ;Ll/ۨ᩵ܺ;)V

    .line 4566
    iget-object p3, p0, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    invoke-virtual {p2, p1}, Ll/᩺᩵ܺ;->֫(Ljava/lang/String;)Ll/۫᩵ܺ;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/ܽ֨ܺ;->֫(Ll/۫᩵ܺ;)V

    .line 1089
    iget-object p1, p0, Ll/ۗ֨ܺ;->ۢ:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void

    .line 1074
    :pswitch_2
    iput-boolean v1, p0, Ll/ۗ֨ܺ;->ᩳ:Z

    .line 1075
    iget-object p1, p0, Ll/ۗ֨ܺ;->ܳ:Ljava/lang/StringBuilder;

    if-eqz p1, :cond_5

    .line 1077
    iget-object p1, p0, Ll/ۗ֨ܺ;->᩻:Ll/᩹֨ܺ;

    sget-object p2, Ll/᩹֨ܺ;->֡֫:Ll/᩹֨ܺ;

    if-ne p1, p2, :cond_3

    .line 1078
    iget-object p1, p0, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    .line 1079
    :cond_3
    sget-object p2, Ll/᩹֨ܺ;->ۛ:Ll/᩹֨ܺ;

    if-ne p1, p2, :cond_4

    .line 1080
    iget-object p1, p0, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1081
    :cond_4
    :goto_1
    iget-object p1, p0, Ll/ۗ֨ܺ;->ܳ:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_2

    .line 1113
    :pswitch_3
    iget-object p1, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    check-cast p1, Ll/ۚۚܺ;

    iget-object p1, p1, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    iput-object p1, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    :cond_5
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p4

    .line 901
    iget-boolean v3, v1, Ll/ۗ֨ܺ;->ۜ:Z

    const-string v4, "http://www.w3.org/2000/svg"

    const-string v5, ""

    const/4 v6, 0x1

    if-eqz v3, :cond_3

    iget-boolean v3, v1, Ll/ۗ֨ܺ;->᩷:Z

    if-nez v3, :cond_3

    .line 902
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    move-object/from16 v3, p2

    goto :goto_0

    :cond_0
    move-object/from16 v3, p3

    :goto_0
    const-string v7, "svg"

    .line 903
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 905
    :cond_1
    iput-boolean v6, v1, Ll/ۗ֨ܺ;->᩷:Z

    goto :goto_1

    .line 904
    :cond_2
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Image XML root is not SVG"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 904
    throw v0

    .line 907
    :cond_3
    :goto_1
    iget-boolean v3, v1, Ll/ۗ֨ܺ;->ܽ:Z

    if-eqz v3, :cond_4

    .line 908
    iget v0, v1, Ll/ۗ֨ܺ;->ۧ:I

    add-int/2addr v0, v6

    iput v0, v1, Ll/ۗ֨ܺ;->ۧ:I

    return-void

    .line 911
    :cond_4
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    return-void

    .line 915
    :cond_5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_6

    move-object/from16 v0, p2

    goto :goto_2

    :cond_6
    move-object/from16 v0, p3

    .line 917
    :goto_2
    invoke-static {v0}, Ll/᩹֨ܺ;->֫(Ljava/lang/String;)Ll/᩹֨ܺ;

    move-result-object v0

    .line 918
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const-string v4, "objectBoundingBox"

    const/16 v7, 0x25

    const/16 v8, 0x4d

    const-string v9, "Invalid <use> element. height cannot be negative"

    const-string v11, "Invalid <use> element. width cannot be negative"

    const-string v13, "userSpaceOnUse"

    const-string v14, "http://www.w3.org/1999/xlink"

    const/16 v15, 0x1a

    const/16 v10, 0x19

    const-string v12, "Invalid document. Root element must be <svg>"

    packed-switch v3, :pswitch_data_0

    .line 983
    iput-boolean v6, v1, Ll/ۗ֨ܺ;->ܽ:Z

    .line 984
    iput v6, v1, Ll/ۗ֨ܺ;->ۧ:I

    return-void

    .line 2426
    :pswitch_0
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_7

    .line 2428
    new-instance v0, Ll/ۧ֨ܺ;

    .line 1705
    invoke-direct {v0}, Ll/۠ۚܺ;-><init>()V

    .line 2429
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 2430
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 2431
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2432
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2433
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩸ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2434
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 2435
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 2427
    :cond_7
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2427
    throw v0

    .line 1314
    :pswitch_1
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_f

    .line 1316
    new-instance v0, Ll/֫֨ܺ;

    .line 1762
    invoke-direct {v0}, Ll/᩵֡ܺ;-><init>()V

    .line 1317
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1318
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1319
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1320
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1321
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1322
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 1331
    :goto_3
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_e

    .line 1333
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 1334
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eq v6, v10, :cond_b

    if-eq v6, v15, :cond_9

    packed-switch v6, :pswitch_data_1

    goto :goto_4

    .line 1340
    :pswitch_2
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/֫֨ܺ;->֨:Ll/֨֡ܺ;

    goto :goto_4

    .line 1337
    :pswitch_3
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/֫֨ܺ;->ۚ:Ll/֨֡ܺ;

    goto :goto_4

    .line 1343
    :pswitch_4
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/֫֨ܺ;->֡:Ll/֨֡ܺ;

    .line 1344
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_4

    .line 1345
    :cond_8
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v11}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1345
    throw v0

    .line 1353
    :cond_9
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 1354
    :cond_a
    iput-object v4, v0, Ll/֫֨ܺ;->᩵:Ljava/lang/String;

    goto :goto_4

    .line 1348
    :cond_b
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/֫֨ܺ;->ᩴ:Ll/֨֡ܺ;

    .line 1349
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 1350
    :cond_d
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v9}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1350
    throw v0

    .line 1324
    :cond_e
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 1325
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 1315
    :cond_f
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1315
    throw v0

    .line 1812
    :pswitch_5
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_12

    .line 1814
    instance-of v0, v0, Ll/ۤۚܺ;

    if-eqz v0, :cond_11

    .line 1816
    new-instance v0, Ll/ۗۚܺ;

    .line 1876
    invoke-direct {v0}, Ll/ۤۚܺ;-><init>()V

    .line 1817
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1818
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1819
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1820
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1821
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1822
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۨۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1823
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 1824
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    .line 1825
    iget-object v2, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    instance-of v3, v2, Ll/᩺ۚܺ;

    if-eqz v3, :cond_10

    .line 1826
    check-cast v2, Ll/᩺ۚܺ;

    invoke-virtual {v0, v2}, Ll/ۗۚܺ;->֫(Ll/᩺ۚܺ;)V

    return-void

    .line 1828
    :cond_10
    check-cast v2, Ll/۫ۚܺ;

    invoke-interface {v2}, Ll/۫ۚܺ;->ܽ()Ll/᩺ۚܺ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۗۚܺ;->֫(Ll/᩺ۚܺ;)V

    return-void

    .line 1815
    :cond_11
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1815
    throw v0

    .line 1813
    :cond_12
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1813
    throw v0

    .line 1840
    :pswitch_6
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_19

    .line 1842
    instance-of v0, v0, Ll/ۤۚܺ;

    if-eqz v0, :cond_18

    .line 1844
    new-instance v0, Ll/ۙۚܺ;

    .line 1932
    invoke-direct {v0}, Ll/ۤۚܺ;-><init>()V

    .line 1845
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1846
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1847
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1848
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1849
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 1861
    :goto_5
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_16

    .line 1863
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 1864
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eq v6, v15, :cond_13

    goto :goto_6

    .line 1867
    :cond_13
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    .line 1868
    :cond_14
    iput-object v4, v0, Ll/ۙۚܺ;->ۘ:Ljava/lang/String;

    :cond_15
    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 1851
    :cond_16
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 1852
    iget-object v2, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    instance-of v3, v2, Ll/᩺ۚܺ;

    if-eqz v3, :cond_17

    .line 1853
    check-cast v2, Ll/᩺ۚܺ;

    invoke-virtual {v0, v2}, Ll/ۙۚܺ;->֫(Ll/᩺ۚܺ;)V

    return-void

    .line 1855
    :cond_17
    check-cast v2, Ll/۫ۚܺ;

    invoke-interface {v2}, Ll/۫ۚܺ;->ܽ()Ll/᩺ۚܺ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۙۚܺ;->֫(Ll/᩺ۚܺ;)V

    return-void

    .line 1843
    :cond_18
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1843
    throw v0

    .line 1841
    :cond_19
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1841
    throw v0

    .line 2301
    :pswitch_7
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_20

    .line 2303
    new-instance v0, Ll/ۛۚܺ;

    .line 1947
    invoke-direct {v0}, Ll/ۤۚܺ;-><init>()V

    .line 2304
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 2305
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 2306
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2307
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2308
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 2321
    :goto_7
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_1e

    .line 2323
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 2324
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eq v6, v15, :cond_1b

    const/16 v7, 0x3d

    if-eq v6, v7, :cond_1a

    goto :goto_8

    .line 2331
    :cond_1a
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ۛۚܺ;->ᩴ:Ll/֨֡ܺ;

    goto :goto_8

    .line 2327
    :cond_1b
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1c

    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1d

    .line 2328
    :cond_1c
    iput-object v4, v0, Ll/ۛۚܺ;->ۘ:Ljava/lang/String;

    :cond_1d
    :goto_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    .line 2310
    :cond_1e
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 2311
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    .line 2312
    iget-object v2, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    instance-of v3, v2, Ll/᩺ۚܺ;

    if-eqz v3, :cond_1f

    .line 2313
    check-cast v2, Ll/᩺ۚܺ;

    invoke-virtual {v0, v2}, Ll/ۛۚܺ;->֫(Ll/᩺ۚܺ;)V

    return-void

    .line 2315
    :cond_1f
    check-cast v2, Ll/۫ۚܺ;

    invoke-interface {v2}, Ll/۫ۚܺ;->ܽ()Ll/᩺ۚܺ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۛۚܺ;->֫(Ll/᩺ۚܺ;)V

    return-void

    .line 2302
    :cond_20
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2302
    throw v0

    .line 1763
    :pswitch_8
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_21

    .line 1765
    new-instance v0, Ll/۬ۚܺ;

    .line 1876
    invoke-direct {v0}, Ll/ۤۚܺ;-><init>()V

    .line 1766
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1767
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1768
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1769
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1770
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1771
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1772
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۨۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1773
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 1774
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 1764
    :cond_21
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1764
    throw v0

    .line 1938
    :pswitch_9
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_22

    .line 1940
    new-instance v0, Ll/᩶ۚܺ;

    invoke-direct {v0}, Ll/᩶ۚܺ;-><init>()V

    .line 1941
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1942
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1943
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1944
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1945
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1946
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩸ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1947
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 1948
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 1939
    :cond_22
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1939
    throw v0

    .line 1885
    :pswitch_a
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_23

    .line 1887
    new-instance v0, Ll/᩹ۚܺ;

    .line 1964
    invoke-direct {v0}, Ll/᩵֡ܺ;-><init>()V

    .line 1888
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1889
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1890
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1891
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1892
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1893
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1894
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 1895
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 1886
    :cond_23
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1886
    throw v0

    .line 4531
    :pswitch_b
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_28

    const-string v0, "all"

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 4538
    :goto_9
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v5

    if-ge v4, v5, :cond_26

    .line 4540
    invoke-interface {v2, v4}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 4541
    invoke-interface {v2, v4}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    const/16 v9, 0x26

    if-eq v7, v9, :cond_25

    if-eq v7, v8, :cond_24

    goto :goto_a

    :cond_24
    const-string v3, "text/css"

    .line 4544
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_a

    :cond_25
    move-object v0, v5

    :goto_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_26
    if-eqz v3, :cond_27

    .line 4554
    sget-object v2, Ll/֡᩵ܺ;->ۛ:Ll/֡᩵ܺ;

    invoke-static {v0, v2}, Ll/᩺᩵ܺ;->֫(Ljava/lang/String;Ll/֡᩵ܺ;)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 4555
    iput-boolean v6, v1, Ll/ۗ֨ܺ;->ܿ:Z

    return-void

    .line 4557
    :cond_27
    iput-boolean v6, v1, Ll/ۗ֨ܺ;->ܽ:Z

    .line 4558
    iput v6, v1, Ll/ۗ֨ܺ;->ۧ:I

    return-void

    .line 4532
    :cond_28
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 4532
    throw v0

    .line 2170
    :pswitch_c
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_31

    .line 2172
    instance-of v0, v0, Ll/ۖ֡ܺ;

    if-eqz v0, :cond_30

    .line 2174
    new-instance v0, Ll/ܰ֡ܺ;

    invoke-direct {v0}, Ll/ܰ֡ܺ;-><init>()V

    .line 2175
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 2176
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 2177
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2178
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 2187
    :goto_b
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_2f

    .line 2189
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 2190
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/16 v8, 0x27

    if-eq v5, v8, :cond_29

    goto :goto_e

    .line 2204
    :cond_29
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_2e

    .line 2206
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    .line 0
    invoke-static {v6, v4}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v8

    if-ne v8, v7, :cond_2a

    add-int/lit8 v5, v5, -0x1

    const/4 v8, 0x1

    goto :goto_c

    :cond_2a
    const/4 v8, 0x0

    .line 2215
    :goto_c
    :try_start_0
    invoke-static {v5, v4}, Ll/ۗ֨ܺ;->֫(ILjava/lang/String;)F

    move-result v5

    const/high16 v9, 0x42c80000    # 100.0f

    if-eqz v8, :cond_2b

    div-float/2addr v5, v9

    :cond_2b
    const/4 v8, 0x0

    cmpg-float v10, v5, v8

    if-gez v10, :cond_2c

    const/4 v9, 0x0

    goto :goto_d

    :cond_2c
    cmpl-float v8, v5, v9

    if-lez v8, :cond_2d

    goto :goto_d

    :cond_2d
    move v9, v5

    .line 2218
    :goto_d
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2193
    iput-object v4, v0, Ll/ܰ֡ܺ;->ۜ:Ljava/lang/Float;

    :goto_e
    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :catch_0
    move-exception v0

    .line 2222
    new-instance v2, Ll/᩵֨ܺ;

    const-string v3, "Invalid offset value in <stop>: "

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 34
    invoke-direct {v2, v3, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2222
    throw v2

    .line 2205
    :cond_2e
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid offset value in <stop> (empty string)"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2205
    throw v0

    .line 2180
    :cond_2f
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 2181
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 2173
    :cond_30
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements."

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2173
    throw v0

    .line 2171
    :cond_31
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2171
    throw v0

    .line 2235
    :pswitch_d
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_32

    .line 2237
    new-instance v0, Ll/᩺֡ܺ;

    invoke-direct {v0}, Ll/᩺֡ܺ;-><init>()V

    .line 2238
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 2239
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 2240
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2241
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2242
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 2243
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 2236
    :cond_32
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2236
    throw v0

    .line 1475
    :pswitch_e
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_3b

    .line 1477
    new-instance v0, Ll/ۨ֡ܺ;

    invoke-direct {v0}, Ll/ۨ֡ܺ;-><init>()V

    .line 1478
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1479
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1480
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1481
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1482
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1483
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 1491
    :goto_f
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_3a

    .line 1493
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 1494
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eq v5, v10, :cond_38

    const/16 v6, 0x38

    if-eq v5, v6, :cond_36

    const/16 v6, 0x39

    if-eq v5, v6, :cond_34

    packed-switch v5, :pswitch_data_2

    goto :goto_10

    .line 1500
    :pswitch_f
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ۨ֡ܺ;->۠:Ll/֨֡ܺ;

    goto :goto_10

    .line 1497
    :pswitch_10
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ۨ֡ܺ;->֨:Ll/֨֡ܺ;

    goto :goto_10

    .line 1503
    :pswitch_11
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ۨ֡ܺ;->ۚ:Ll/֨֡ܺ;

    .line 1504
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_33

    goto :goto_10

    .line 1505
    :cond_33
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <rect> element. width cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1505
    throw v0

    .line 1518
    :cond_34
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ۨ֡ܺ;->֡:Ll/֨֡ܺ;

    .line 1519
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_35

    goto :goto_10

    .line 1520
    :cond_35
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <rect> element. ry cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1520
    throw v0

    .line 1513
    :cond_36
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ۨ֡ܺ;->᩵:Ll/֨֡ܺ;

    .line 1514
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_37

    goto :goto_10

    .line 1515
    :cond_37
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <rect> element. rx cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1515
    throw v0

    .line 1508
    :cond_38
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ۨ֡ܺ;->ᩴ:Ll/֨֡ܺ;

    .line 1509
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_39

    :goto_10
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_f

    .line 1510
    :cond_39
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <rect> element. height cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1510
    throw v0

    .line 1485
    :cond_3a
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    return-void

    .line 1476
    :cond_3b
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1476
    throw v0

    .line 2117
    :pswitch_12
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_43

    .line 2119
    new-instance v0, Ll/ܶۚܺ;

    invoke-direct {v0}, Ll/ܶۚܺ;-><init>()V

    .line 2120
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 2121
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 2122
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2123
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2124
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۖ֡ܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 2133
    :goto_11
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_42

    .line 2135
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 2136
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x6

    if-eq v5, v6, :cond_41

    const/4 v6, 0x7

    if-eq v5, v6, :cond_40

    const/16 v6, 0xb

    if-eq v5, v6, :cond_3f

    const/16 v6, 0xc

    if-eq v5, v6, :cond_3e

    const/16 v6, 0x31

    if-eq v5, v6, :cond_3c

    goto :goto_12

    .line 2145
    :cond_3c
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܶۚܺ;->֡:Ll/֨֡ܺ;

    .line 2146
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_3d

    goto :goto_12

    .line 2147
    :cond_3d
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <radialGradient> element. r cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2147
    throw v0

    .line 2153
    :cond_3e
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܶۚܺ;->᩵:Ll/֨֡ܺ;

    goto :goto_12

    .line 2150
    :cond_3f
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܶۚܺ;->ᩴ:Ll/֨֡ܺ;

    goto :goto_12

    .line 2142
    :cond_40
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܶۚܺ;->ۘ:Ll/֨֡ܺ;

    goto :goto_12

    .line 2139
    :cond_41
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܶۚܺ;->ۖ:Ll/֨֡ܺ;

    :goto_12
    add-int/lit8 v3, v3, 0x1

    goto :goto_11

    .line 2126
    :cond_42
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 2127
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 2118
    :cond_43
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2118
    throw v0

    .line 1684
    :pswitch_13
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_44

    .line 1686
    new-instance v0, Ll/ۤ֡ܺ;

    invoke-direct {v0}, Ll/ۤ֡ܺ;-><init>()V

    .line 1687
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1688
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1689
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1690
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1691
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1692
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const-string v3, "polyline"

    .line 1693
    invoke-static {v0, v2, v3}, Ll/ۗ֨ܺ;->֫(Ll/ۤ֡ܺ;Lorg/xml/sax/Attributes;Ljava/lang/String;)V

    .line 1694
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    return-void

    .line 1685
    :cond_44
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1685
    throw v0

    .line 1741
    :pswitch_14
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_45

    .line 1743
    new-instance v0, Ll/ۛ֡ܺ;

    .line 1843
    invoke-direct {v0}, Ll/ۤ֡ܺ;-><init>()V

    .line 1744
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1745
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1746
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1747
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1748
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1749
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const-string v3, "polygon"

    .line 1750
    invoke-static {v0, v2, v3}, Ll/ۗ֨ܺ;->֫(Ll/ۤ֡ܺ;Lorg/xml/sax/Attributes;Ljava/lang/String;)V

    .line 1751
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    return-void

    .line 1742
    :cond_45
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1742
    throw v0

    .line 2348
    :pswitch_15
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_51

    .line 2350
    new-instance v0, Ll/۫֡ܺ;

    invoke-direct {v0}, Ll/۫֡ܺ;-><init>()V

    .line 2351
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 2352
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 2353
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2354
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2355
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2356
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩸ۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 2365
    :goto_13
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v6

    if-ge v3, v6, :cond_50

    .line 2367
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    .line 2368
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v7, v10, :cond_4d

    if-eq v7, v15, :cond_4b

    packed-switch v7, :pswitch_data_3

    packed-switch v7, :pswitch_data_4

    goto/16 :goto_14

    .line 2371
    :pswitch_16
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_46

    .line 2372
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v6, v0, Ll/۫֡ܺ;->۠:Ljava/lang/Boolean;

    goto/16 :goto_14

    .line 2373
    :cond_46
    invoke-virtual {v13, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_47

    .line 2374
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v6, v0, Ll/۫֡ܺ;->۠:Ljava/lang/Boolean;

    goto/16 :goto_14

    .line 2376
    :cond_47
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid value for attribute patternUnits"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2376
    throw v0

    .line 2389
    :pswitch_17
    invoke-static {v6}, Ll/ۗ֨ܺ;->ۡ(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v6

    iput-object v6, v0, Ll/۫֡ܺ;->֨:Landroid/graphics/Matrix;

    goto :goto_14

    .line 2380
    :pswitch_18
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_48

    .line 2381
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v6, v0, Ll/۫֡ܺ;->ۚ:Ljava/lang/Boolean;

    goto :goto_14

    .line 2382
    :cond_48
    invoke-virtual {v13, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_49

    .line 2383
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v6, v0, Ll/۫֡ܺ;->ۚ:Ljava/lang/Boolean;

    goto :goto_14

    .line 2385
    :cond_49
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid value for attribute patternContentUnits"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2385
    throw v0

    .line 2395
    :pswitch_19
    invoke-static {v6}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v6

    iput-object v6, v0, Ll/۫֡ܺ;->᩹:Ll/֨֡ܺ;

    goto :goto_14

    .line 2392
    :pswitch_1a
    invoke-static {v6}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v6

    iput-object v6, v0, Ll/۫֡ܺ;->᩸:Ll/֨֡ܺ;

    goto :goto_14

    .line 2398
    :pswitch_1b
    invoke-static {v6}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v6

    iput-object v6, v0, Ll/۫֡ܺ;->ܶ:Ll/֨֡ܺ;

    .line 2399
    invoke-virtual {v6}, Ll/֨֡ܺ;->֫()Z

    move-result v6

    if-nez v6, :cond_4a

    goto :goto_14

    .line 2400
    :cond_4a
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <pattern> element. width cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2400
    throw v0

    .line 2408
    :cond_4b
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4c

    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4e

    .line 2409
    :cond_4c
    iput-object v6, v0, Ll/۫֡ܺ;->֡:Ljava/lang/String;

    goto :goto_14

    .line 2403
    :cond_4d
    invoke-static {v6}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v6

    iput-object v6, v0, Ll/۫֡ܺ;->᩵:Ll/֨֡ܺ;

    .line 2404
    invoke-virtual {v6}, Ll/֨֡ܺ;->֫()Z

    move-result v6

    if-nez v6, :cond_4f

    :cond_4e
    :goto_14
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_13

    .line 2405
    :cond_4f
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <pattern> element. height cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2405
    throw v0

    .line 2358
    :cond_50
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 2359
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 2349
    :cond_51
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2349
    throw v0

    .line 1431
    :pswitch_1c
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_73

    .line 1433
    new-instance v0, Ll/ۙ֡ܺ;

    invoke-direct {v0}, Ll/ۙ֡ܺ;-><init>()V

    .line 1434
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1435
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1436
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1437
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1438
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1439
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 1447
    :goto_15
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_72

    .line 1449
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 1450
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/16 v6, 0xd

    if-eq v5, v6, :cond_54

    const/16 v6, 0x2b

    if-eq v5, v6, :cond_52

    :goto_16
    const/16 v19, 0x0

    goto/16 :goto_22

    .line 1456
    :cond_52
    invoke-static {v4}, Ll/ۗ֨ܺ;->ᩳ(Ljava/lang/String;)F

    move-result v4

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-ltz v4, :cond_53

    goto :goto_16

    .line 1458
    :cond_53
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <path> element. pathLength cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1458
    throw v0

    .line 4197
    :cond_54
    new-instance v5, Ll/᩶֨ܺ;

    invoke-direct {v5, v4}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 4206
    new-instance v4, Ll/ۗ֡ܺ;

    invoke-direct {v4}, Ll/ۗ֡ܺ;-><init>()V

    .line 4208
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v6

    if-eqz v6, :cond_56

    :cond_55
    :goto_17
    const/16 v19, 0x0

    goto/16 :goto_21

    .line 4211
    :cond_56
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ܽ()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x6d

    if-eq v6, v8, :cond_57

    if-eq v6, v7, :cond_57

    goto :goto_17

    :cond_57
    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 4218
    :goto_18
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ۢ()V

    const/16 v11, 0x6c

    const/high16 v12, 0x40000000    # 2.0f

    sparse-switch v6, :sswitch_data_0

    goto :goto_17

    .line 4318
    :sswitch_0
    invoke-virtual {v4}, Ll/ۗ֡ܺ;->close()V

    move/from16 v7, v17

    move v8, v7

    move/from16 v10, v18

    :goto_19
    const/16 v19, 0x0

    goto/16 :goto_1e

    .line 4341
    :sswitch_1
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v10

    .line 4342
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    move-result v11

    if-eqz v11, :cond_58

    goto :goto_17

    :cond_58
    const/16 v11, 0x76

    if-ne v6, v11, :cond_59

    add-float/2addr v10, v9

    .line 4349
    :cond_59
    invoke-virtual {v4, v7, v10}, Ll/ۗ֡ܺ;->ۧ(FF)V

    goto :goto_19

    :sswitch_2
    mul-float v11, v7, v12

    sub-float/2addr v11, v8

    mul-float v12, v12, v9

    sub-float/2addr v12, v10

    .line 4382
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v8

    .line 4383
    invoke-virtual {v5, v8}, Ll/᩶֨ܺ;->֫(F)F

    move-result v10

    .line 4384
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    move-result v13

    if-eqz v13, :cond_5a

    goto :goto_17

    :cond_5a
    const/16 v13, 0x74

    if-ne v6, v13, :cond_5b

    add-float/2addr v8, v7

    add-float/2addr v10, v9

    .line 4392
    :cond_5b
    invoke-virtual {v4, v11, v12, v8, v10}, Ll/ۗ֡ܺ;->֫(FFFF)V

    move v7, v8

    move v9, v10

    move v8, v11

    move v10, v12

    goto/16 :goto_1b

    :sswitch_3
    mul-float v11, v7, v12

    sub-float v8, v11, v8

    mul-float v12, v12, v9

    sub-float v11, v12, v10

    .line 4294
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v10

    .line 4295
    invoke-virtual {v5, v10}, Ll/᩶֨ܺ;->֫(F)F

    move-result v12

    .line 4296
    invoke-virtual {v5, v12}, Ll/᩶֨ܺ;->֫(F)F

    move-result v13

    .line 4297
    invoke-virtual {v5, v13}, Ll/᩶֨ܺ;->֫(F)F

    move-result v14

    .line 4298
    invoke-static {v14}, Ljava/lang/Float;->isNaN(F)Z

    move-result v15

    if-eqz v15, :cond_5c

    goto/16 :goto_17

    :cond_5c
    const/16 v15, 0x73

    if-ne v6, v15, :cond_5d

    add-float/2addr v13, v7

    add-float/2addr v14, v9

    add-float/2addr v10, v7

    add-float/2addr v12, v9

    :cond_5d
    move v7, v10

    move/from16 v16, v12

    move/from16 v19, v13

    move/from16 v20, v14

    move-object v9, v4

    move v10, v8

    move v12, v7

    move/from16 v13, v16

    move/from16 v14, v19

    move/from16 v15, v20

    .line 4308
    invoke-virtual/range {v9 .. v15}, Ll/ۗ֡ܺ;->֫(FFFFFF)V

    goto/16 :goto_1c

    .line 4356
    :sswitch_4
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v8

    .line 4357
    invoke-virtual {v5, v8}, Ll/᩶֨ܺ;->֫(F)F

    move-result v10

    .line 4358
    invoke-virtual {v5, v10}, Ll/᩶֨ܺ;->֫(F)F

    move-result v11

    .line 4359
    invoke-virtual {v5, v11}, Ll/᩶֨ܺ;->֫(F)F

    move-result v12

    .line 4360
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    move-result v13

    if-eqz v13, :cond_5e

    goto/16 :goto_17

    :cond_5e
    const/16 v13, 0x71

    if-ne v6, v13, :cond_5f

    add-float/2addr v11, v7

    add-float/2addr v12, v9

    add-float/2addr v8, v7

    add-float/2addr v10, v9

    .line 4370
    :cond_5f
    invoke-virtual {v4, v8, v10, v11, v12}, Ll/ۗ֡ܺ;->֫(FFFF)V

    move v7, v11

    move v9, v12

    goto :goto_1b

    .line 4225
    :sswitch_5
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v8

    .line 4226
    invoke-virtual {v5, v8}, Ll/᩶֨ܺ;->֫(F)F

    move-result v10

    .line 4227
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    move-result v12

    if-eqz v12, :cond_60

    goto/16 :goto_17

    :cond_60
    const/16 v12, 0x6d

    if-ne v6, v12, :cond_61

    .line 4232
    invoke-virtual {v4}, Ll/ۗ֡ܺ;->ۧ()Z

    move-result v13

    if-nez v13, :cond_61

    add-float/2addr v8, v7

    add-float/2addr v10, v9

    .line 4236
    :cond_61
    invoke-virtual {v4, v8, v10}, Ll/ۗ֡ܺ;->֫(FF)V

    if-ne v6, v12, :cond_62

    const/16 v6, 0x6c

    goto :goto_1a

    :cond_62
    const/16 v6, 0x4c

    :goto_1a
    move v7, v8

    move/from16 v17, v7

    move v9, v10

    move/from16 v18, v9

    goto :goto_1b

    .line 4246
    :sswitch_6
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v8

    .line 4247
    invoke-virtual {v5, v8}, Ll/᩶֨ܺ;->֫(F)F

    move-result v10

    .line 4248
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    move-result v12

    if-eqz v12, :cond_63

    goto/16 :goto_17

    :cond_63
    if-ne v6, v11, :cond_64

    add-float/2addr v8, v7

    add-float/2addr v10, v9

    :cond_64
    move v7, v8

    .line 4256
    invoke-virtual {v4, v7, v10}, Ll/ۗ֡ܺ;->ۧ(FF)V

    move v8, v7

    goto/16 :goto_19

    .line 4326
    :sswitch_7
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v8

    .line 4327
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v11

    if-eqz v11, :cond_65

    goto/16 :goto_17

    :cond_65
    const/16 v11, 0x68

    if-ne v6, v11, :cond_66

    add-float/2addr v8, v7

    .line 4334
    :cond_66
    invoke-virtual {v4, v8, v9}, Ll/ۗ֡ܺ;->ۧ(FF)V

    move v7, v8

    :goto_1b
    const/16 v19, 0x0

    goto/16 :goto_1f

    .line 4264
    :sswitch_8
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v8

    .line 4265
    invoke-virtual {v5, v8}, Ll/᩶֨ܺ;->֫(F)F

    move-result v10

    .line 4266
    invoke-virtual {v5, v10}, Ll/᩶֨ܺ;->֫(F)F

    move-result v11

    .line 4267
    invoke-virtual {v5, v11}, Ll/᩶֨ܺ;->֫(F)F

    move-result v12

    .line 4268
    invoke-virtual {v5, v12}, Ll/᩶֨ܺ;->֫(F)F

    move-result v13

    .line 4269
    invoke-virtual {v5, v13}, Ll/᩶֨ܺ;->֫(F)F

    move-result v14

    .line 4270
    invoke-static {v14}, Ljava/lang/Float;->isNaN(F)Z

    move-result v15

    if-eqz v15, :cond_67

    goto/16 :goto_17

    :cond_67
    const/16 v15, 0x63

    if-ne v6, v15, :cond_68

    add-float/2addr v13, v7

    add-float/2addr v14, v9

    add-float/2addr v8, v7

    add-float/2addr v10, v9

    add-float/2addr v11, v7

    add-float/2addr v12, v9

    :cond_68
    move v7, v11

    move/from16 v16, v12

    move/from16 v19, v13

    move/from16 v20, v14

    move v11, v10

    move v10, v8

    move-object v9, v4

    move v12, v7

    move/from16 v13, v16

    move/from16 v14, v19

    move/from16 v15, v20

    .line 4282
    invoke-virtual/range {v9 .. v15}, Ll/ۗ֡ܺ;->֫(FFFFFF)V

    :goto_1c
    move v8, v7

    move/from16 v10, v16

    move/from16 v7, v19

    move/from16 v9, v20

    goto :goto_1b

    .line 4402
    :sswitch_9
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v10

    .line 4403
    invoke-virtual {v5, v10}, Ll/᩶֨ܺ;->֫(F)F

    move-result v11

    .line 4404
    invoke-virtual {v5, v11}, Ll/᩶֨ܺ;->֫(F)F

    move-result v12

    .line 4405
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v5, v8}, Ll/᩶֨ܺ;->֫(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v8

    .line 4406
    invoke-virtual {v5, v8}, Ll/᩶֨ܺ;->֫(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v13

    if-nez v13, :cond_69

    const/high16 v14, 0x7fc00000    # Float.NaN

    goto :goto_1d

    .line 2621
    :cond_69
    invoke-virtual {v5}, Ll/᩶֨ܺ;->᩷()Z

    .line 2622
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v14

    .line 4408
    :goto_1d
    invoke-virtual {v5, v14}, Ll/᩶֨ܺ;->֫(F)F

    move-result v15

    .line 4409
    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    move-result v16

    if-nez v16, :cond_55

    const/16 v19, 0x0

    cmpg-float v16, v10, v19

    if-ltz v16, :cond_71

    cmpg-float v16, v11, v19

    if-gez v16, :cond_6a

    goto :goto_21

    :cond_6a
    const/16 v2, 0x61

    if-ne v6, v2, :cond_6b

    add-float/2addr v14, v7

    add-float/2addr v15, v9

    :cond_6b
    move v7, v14

    move v2, v15

    .line 4417
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    move-object v9, v4

    move v13, v8

    move v15, v7

    move/from16 v16, v2

    invoke-virtual/range {v9 .. v16}, Ll/ۗ֡ܺ;->֫(FFFZZFF)V

    move v10, v2

    move v8, v7

    :goto_1e
    move v9, v10

    .line 4426
    :goto_1f
    invoke-virtual {v5}, Ll/᩶֨ܺ;->᩷()Z

    .line 4427
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_6c

    goto :goto_21

    .line 2863
    :cond_6c
    iget v2, v5, Ll/᩶֨ܺ;->ܿ:I

    iget v11, v5, Ll/᩶֨ܺ;->ۧ:I

    if-ne v2, v11, :cond_6d

    goto :goto_20

    .line 2865
    :cond_6d
    iget-object v11, v5, Ll/᩶֨ܺ;->֫:Ljava/lang/String;

    invoke-virtual {v11, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v11, 0x61

    if-lt v2, v11, :cond_6e

    const/16 v11, 0x7a

    if-le v2, v11, :cond_6f

    :cond_6e
    const/16 v11, 0x41

    if-lt v2, v11, :cond_70

    const/16 v11, 0x5a

    if-gt v2, v11, :cond_70

    .line 4433
    :cond_6f
    invoke-virtual {v5}, Ll/᩶֨ܺ;->ܽ()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move v6, v2

    :cond_70
    :goto_20
    move-object/from16 v2, p4

    goto/16 :goto_18

    .line 1453
    :cond_71
    :goto_21
    iput-object v4, v0, Ll/ۙ֡ܺ;->ᩴ:Ll/ۗ֡ܺ;

    :goto_22
    add-int/lit8 v3, v3, 0x1

    const/16 v8, 0x4d

    move-object/from16 v2, p4

    goto/16 :goto_15

    .line 1441
    :cond_72
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    return-void

    .line 1432
    :cond_73
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1432
    throw v0

    .line 2447
    :pswitch_1d
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_7e

    .line 2449
    new-instance v0, Ll/᩸֡ܺ;

    invoke-direct {v0}, Ll/᩸֡ܺ;-><init>()V

    .line 2450
    iget-object v2, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v2, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 2451
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v2, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    move-object/from16 v2, p4

    .line 2452
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2453
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2454
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 2463
    :goto_23
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v5

    if-ge v3, v5, :cond_7d

    .line 2465
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 2466
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eq v6, v10, :cond_7b

    const/16 v8, 0x24

    if-eq v6, v8, :cond_78

    if-eq v6, v7, :cond_75

    packed-switch v6, :pswitch_data_5

    goto :goto_24

    .line 2490
    :pswitch_1e
    invoke-static {v5}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    goto :goto_24

    .line 2487
    :pswitch_1f
    invoke-static {v5}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    goto :goto_24

    .line 2493
    :pswitch_20
    invoke-static {v5}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v5

    iput-object v5, v0, Ll/᩸֡ܺ;->֡:Ll/֨֡ܺ;

    .line 2494
    invoke-virtual {v5}, Ll/֨֡ܺ;->֫()Z

    move-result v5

    if-nez v5, :cond_74

    goto :goto_24

    .line 2495
    :cond_74
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <mask> element. width cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2495
    throw v0

    .line 2469
    :cond_75
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_76

    .line 2470
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v5, v0, Ll/᩸֡ܺ;->᩵:Ljava/lang/Boolean;

    goto :goto_24

    .line 2471
    :cond_76
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_77

    .line 2472
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v5, v0, Ll/᩸֡ܺ;->᩵:Ljava/lang/Boolean;

    goto :goto_24

    .line 2474
    :cond_77
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid value for attribute maskUnits"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2474
    throw v0

    .line 2478
    :cond_78
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_79

    .line 2479
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v5, v0, Ll/᩸֡ܺ;->ᩴ:Ljava/lang/Boolean;

    goto :goto_24

    .line 2480
    :cond_79
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7a

    .line 2481
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v5, v0, Ll/᩸֡ܺ;->ᩴ:Ljava/lang/Boolean;

    goto :goto_24

    .line 2483
    :cond_7a
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid value for attribute maskContentUnits"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2483
    throw v0

    .line 2498
    :cond_7b
    invoke-static {v5}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v5

    iput-object v5, v0, Ll/᩸֡ܺ;->ۘ:Ll/֨֡ܺ;

    .line 2499
    invoke-virtual {v5}, Ll/֨֡ܺ;->֫()Z

    move-result v5

    if-nez v5, :cond_7c

    :goto_24
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_23

    .line 2500
    :cond_7c
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <mask> element. height cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2500
    throw v0

    .line 2456
    :cond_7d
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 2457
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 2448
    :cond_7e
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2448
    throw v0

    .line 1960
    :pswitch_21
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_88

    .line 1962
    new-instance v0, Ll/ܶ֡ܺ;

    invoke-direct {v0}, Ll/ܶ֡ܺ;-><init>()V

    .line 1963
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1964
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1965
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1966
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1967
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1968
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩸ۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 1977
    :goto_25
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_87

    .line 1979
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 1980
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/16 v7, 0x29

    if-eq v5, v7, :cond_85

    const/16 v7, 0x32

    if-eq v5, v7, :cond_84

    const/16 v7, 0x33

    if-eq v5, v7, :cond_83

    packed-switch v5, :pswitch_data_6

    goto :goto_26

    .line 1989
    :pswitch_22
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܶ֡ܺ;->ۚ:Ll/֨֡ܺ;

    .line 1990
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_7f

    goto :goto_26

    .line 1991
    :cond_7f
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <marker> element. markerWidth cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1991
    throw v0

    :pswitch_23
    const-string v5, "strokeWidth"

    .line 1999
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_80

    const/4 v4, 0x0

    .line 2000
    iput-boolean v4, v0, Ll/ܶ֡ܺ;->֡:Z

    goto :goto_26

    .line 2001
    :cond_80
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_81

    .line 2002
    iput-boolean v6, v0, Ll/ܶ֡ܺ;->֡:Z

    goto :goto_26

    .line 2004
    :cond_81
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid value for attribute markerUnits"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2004
    throw v0

    .line 1994
    :pswitch_24
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܶ֡ܺ;->᩵:Ll/֨֡ܺ;

    .line 1995
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_82

    goto :goto_26

    .line 1996
    :cond_82
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <marker> element. markerHeight cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1996
    throw v0

    .line 1986
    :cond_83
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܶ֡ܺ;->ܶ:Ll/֨֡ܺ;

    goto :goto_26

    .line 1983
    :cond_84
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܶ֡ܺ;->۠:Ll/֨֡ܺ;

    :goto_26
    const/high16 v5, 0x7fc00000    # Float.NaN

    goto :goto_27

    :cond_85
    const-string v5, "auto"

    .line 2008
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_86

    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 2009
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iput-object v4, v0, Ll/ܶ֡ܺ;->֨:Ljava/lang/Float;

    goto :goto_27

    :cond_86
    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 2011
    invoke-static {v4}, Ll/ۗ֨ܺ;->ᩳ(Ljava/lang/String;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iput-object v4, v0, Ll/ܶ֡ܺ;->֨:Ljava/lang/Float;

    :goto_27
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_25

    .line 1970
    :cond_87
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 1971
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 1961
    :cond_88
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1961
    throw v0

    .line 2029
    :pswitch_25
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_8a

    .line 2031
    new-instance v0, Ll/֡ۚܺ;

    invoke-direct {v0}, Ll/֡ۚܺ;-><init>()V

    .line 2032
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 2033
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 2034
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2035
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2036
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۖ֡ܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 2085
    :goto_28
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_89

    .line 2087
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 2088
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    packed-switch v5, :pswitch_data_7

    goto :goto_29

    .line 2100
    :pswitch_26
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/֡ۚܺ;->᩵:Ll/֨֡ܺ;

    goto :goto_29

    .line 2097
    :pswitch_27
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/֡ۚܺ;->ۘ:Ll/֨֡ܺ;

    goto :goto_29

    .line 2094
    :pswitch_28
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/֡ۚܺ;->ᩴ:Ll/֨֡ܺ;

    goto :goto_29

    .line 2091
    :pswitch_29
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/֡ۚܺ;->ۖ:Ll/֨֡ܺ;

    :goto_29
    add-int/lit8 v3, v3, 0x1

    goto :goto_28

    .line 2038
    :cond_89
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 2039
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 2030
    :cond_8a
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2030
    throw v0

    .line 1636
    :pswitch_2a
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_8c

    .line 1638
    new-instance v0, Ll/۠֡ܺ;

    .line 1822
    invoke-direct {v0}, Ll/ᩴ֡ܺ;-><init>()V

    .line 1639
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1640
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1641
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1642
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1643
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1644
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 1652
    :goto_2a
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_8b

    .line 1654
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 1655
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    packed-switch v5, :pswitch_data_8

    goto :goto_2b

    .line 1667
    :pswitch_2b
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/۠֡ܺ;->ۚ:Ll/֨֡ܺ;

    goto :goto_2b

    .line 1664
    :pswitch_2c
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/۠֡ܺ;->᩵:Ll/֨֡ܺ;

    goto :goto_2b

    .line 1661
    :pswitch_2d
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/۠֡ܺ;->֡:Ll/֨֡ܺ;

    goto :goto_2b

    .line 1658
    :pswitch_2e
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/۠֡ܺ;->ᩴ:Ll/֨֡ܺ;

    :goto_2b
    add-int/lit8 v3, v3, 0x1

    goto :goto_2a

    .line 1646
    :cond_8b
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    return-void

    .line 1637
    :cond_8c
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1637
    throw v0

    .line 1371
    :pswitch_2f
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_95

    .line 1373
    new-instance v0, Ll/ۚ֡ܺ;

    .line 2083
    invoke-direct {v0}, Ll/۠ۚܺ;-><init>()V

    .line 1374
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1375
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1376
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1377
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1378
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1379
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 1388
    :goto_2c
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_94

    .line 1390
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 1391
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eq v6, v10, :cond_91

    if-eq v6, v15, :cond_8f

    const/16 v7, 0x30

    if-eq v6, v7, :cond_8e

    packed-switch v6, :pswitch_data_9

    goto :goto_2d

    .line 1397
    :pswitch_30
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ۚ֡ܺ;->۠:Ll/֨֡ܺ;

    goto :goto_2d

    .line 1394
    :pswitch_31
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ۚ֡ܺ;->֨:Ll/֨֡ܺ;

    goto :goto_2d

    .line 1400
    :pswitch_32
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ۚ֡ܺ;->ۚ:Ll/֨֡ܺ;

    .line 1401
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_8d

    goto :goto_2d

    .line 1402
    :cond_8d
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v11}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1402
    throw v0

    .line 1414
    :cond_8e
    invoke-static {v0, v4}, Ll/ۗ֨ܺ;->֫(Ll/۠ۚܺ;Ljava/lang/String;)V

    goto :goto_2d

    .line 1410
    :cond_8f
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_90

    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_92

    .line 1411
    :cond_90
    iput-object v4, v0, Ll/ۚ֡ܺ;->᩵:Ljava/lang/String;

    goto :goto_2d

    .line 1405
    :cond_91
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ۚ֡ܺ;->ᩴ:Ll/֨֡ܺ;

    .line 1406
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_93

    :cond_92
    :goto_2d
    add-int/lit8 v3, v3, 0x1

    goto :goto_2c

    .line 1407
    :cond_93
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v9}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1407
    throw v0

    .line 1381
    :cond_94
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 1382
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 1372
    :cond_95
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1372
    throw v0

    .line 1584
    :pswitch_33
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_9d

    .line 1586
    new-instance v0, Ll/ܺ֡ܺ;

    invoke-direct {v0}, Ll/ܺ֡ܺ;-><init>()V

    .line 1587
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1588
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1589
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1590
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1591
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1592
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 1600
    :goto_2e
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_9c

    .line 1602
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 1603
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x6

    if-eq v5, v6, :cond_9b

    const/4 v6, 0x7

    if-eq v5, v6, :cond_9a

    const/16 v6, 0x38

    if-eq v5, v6, :cond_98

    const/16 v6, 0x39

    if-eq v5, v6, :cond_96

    goto :goto_2f

    .line 1617
    :cond_96
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܺ֡ܺ;->ۚ:Ll/֨֡ܺ;

    .line 1618
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_97

    goto :goto_2f

    .line 1619
    :cond_97
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <ellipse> element. ry cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1619
    throw v0

    .line 1612
    :cond_98
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܺ֡ܺ;->֡:Ll/֨֡ܺ;

    .line 1613
    invoke-virtual {v4}, Ll/֨֡ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_99

    goto :goto_2f

    .line 1614
    :cond_99
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid <ellipse> element. rx cannot be negative"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1614
    throw v0

    .line 1609
    :cond_9a
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܺ֡ܺ;->᩵:Ll/֨֡ܺ;

    goto :goto_2f

    .line 1606
    :cond_9b
    invoke-static {v4}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v4

    iput-object v4, v0, Ll/ܺ֡ܺ;->ᩴ:Ll/֨֡ܺ;

    :goto_2f
    add-int/lit8 v3, v3, 0x1

    goto :goto_2e

    .line 1594
    :cond_9c
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    return-void

    .line 1585
    :cond_9d
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1585
    throw v0

    .line 963
    :pswitch_34
    iput-boolean v6, v1, Ll/ۗ֨ܺ;->ᩳ:Z

    .line 964
    iput-object v0, v1, Ll/ۗ֨ܺ;->᩻:Ll/᩹֨ܺ;

    return-void

    .line 1293
    :pswitch_35
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_9e

    .line 1295
    new-instance v0, Ll/ۡ֡ܺ;

    .line 1744
    invoke-direct {v0}, Ll/᩵֡ܺ;-><init>()V

    .line 1296
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1297
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1298
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1299
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1300
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1301
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 1302
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 1294
    :cond_9e
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1294
    throw v0

    .line 2255
    :pswitch_36
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_a3

    .line 2257
    new-instance v0, Ll/ۜ֡ܺ;

    invoke-direct {v0}, Ll/ۜ֡ܺ;-><init>()V

    .line 2258
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 2259
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 2260
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2261
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 2262
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 2263
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v3, 0x0

    .line 2272
    :goto_30
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v5

    if-ge v3, v5, :cond_a2

    .line 2274
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 2275
    invoke-interface {v2, v3}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    const/4 v7, 0x3

    if-eq v6, v7, :cond_9f

    goto :goto_31

    .line 2278
    :cond_9f
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a0

    .line 2279
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v5, v0, Ll/ۜ֡ܺ;->ᩴ:Ljava/lang/Boolean;

    goto :goto_31

    .line 2280
    :cond_a0
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a1

    .line 2281
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v5, v0, Ll/ۜ֡ܺ;->ᩴ:Ljava/lang/Boolean;

    :goto_31
    add-int/lit8 v3, v3, 0x1

    goto :goto_30

    .line 2283
    :cond_a1
    new-instance v0, Ll/᩵֨ܺ;

    const-string v2, "Invalid value for attribute clipPathUnits"

    .line 29
    invoke-direct {v0, v2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2283
    throw v0

    .line 2265
    :cond_a2
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 2266
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 2256
    :cond_a3
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2256
    throw v0

    .line 934
    :pswitch_37
    invoke-direct {v1, v2}, Ll/ۗ֨ܺ;->֫(Lorg/xml/sax/Attributes;)V

    return-void

    .line 1271
    :pswitch_38
    iget-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_a4

    .line 1273
    new-instance v0, Ll/᩵֡ܺ;

    invoke-direct {v0}, Ll/᩵֡ܺ;-><init>()V

    .line 1274
    iget-object v3, v1, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1275
    iget-object v3, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v3, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1276
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1277
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1278
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1279
    invoke-static {v0, v2}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1280
    iget-object v2, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {v2, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 1281
    iput-object v0, v1, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    .line 1272
    :cond_a4
    new-instance v0, Ll/᩵֨ܺ;

    .line 29
    invoke-direct {v0, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1272
    throw v0

    .line 921
    :pswitch_39
    invoke-direct {v1, v2}, Ll/ۗ֨ܺ;->ۧ(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_38
        :pswitch_2f
        :pswitch_2a
        :pswitch_25
        :pswitch_21
        :pswitch_1d
        :pswitch_1c
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_34
        :pswitch_6
        :pswitch_5
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x51
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x51
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2c
        :pswitch_18
        :pswitch_17
        :pswitch_16
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x51
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_9
        0x43 -> :sswitch_8
        0x48 -> :sswitch_7
        0x4c -> :sswitch_6
        0x4d -> :sswitch_5
        0x51 -> :sswitch_4
        0x53 -> :sswitch_3
        0x54 -> :sswitch_2
        0x56 -> :sswitch_1
        0x5a -> :sswitch_0
        0x61 -> :sswitch_9
        0x63 -> :sswitch_8
        0x68 -> :sswitch_7
        0x6c -> :sswitch_6
        0x6d -> :sswitch_5
        0x71 -> :sswitch_4
        0x73 -> :sswitch_3
        0x74 -> :sswitch_2
        0x76 -> :sswitch_1
        0x7a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_5
    .packed-switch 0x51
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x20
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x54
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x54
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x51
        :pswitch_32
        :pswitch_31
        :pswitch_30
    .end packed-switch
.end method

.method public static ֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V
    .locals 3

    const/4 v0, 0x0

    .line 3341
    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 3343
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v1

    sget-object v2, Ll/᩸֨ܺ;->ܰۧ:Ll/᩸֨ܺ;

    if-ne v1, v2, :cond_0

    .line 3345
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۗ֨ܺ;->ۡ(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-interface {p0, v1}, Ll/֡֡ܺ;->֫(Landroid/graphics/Matrix;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ۖ֡ܺ;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    .line 2045
    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_8

    .line 2047
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 2048
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/16 v3, 0x17

    if-eq v2, v3, :cond_6

    const/16 v3, 0x18

    if-eq v2, v3, :cond_3

    const/16 v3, 0x1a

    if-eq v2, v3, :cond_1

    const/16 v3, 0x3c

    if-eq v2, v3, :cond_0

    goto :goto_1

    .line 2065
    :cond_0
    :try_start_0
    invoke-static {v1}, Ll/ۘ֡ܺ;->valueOf(Ljava/lang/String;)Ll/ۘ֡ܺ;

    move-result-object v2

    iput-object v2, p0, Ll/ۖ֡ܺ;->ܺ:Ll/ۘ֡ܺ;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 2069
    :catch_0
    new-instance p0, Ll/᩵֨ܺ;

    const-string p1, "Invalid spreadMethod attribute. \""

    const-string v0, "\" is not a valid value."

    .line 0
    invoke-static {p1, v1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2069
    throw p0

    :cond_1
    const-string v2, ""

    .line 2073
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "http://www.w3.org/1999/xlink"

    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 2074
    :cond_2
    iput-object v1, p0, Ll/ۖ֡ܺ;->ۡ:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const-string v2, "objectBoundingBox"

    .line 2051
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 2052
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, p0, Ll/ۖ֡ܺ;->ۢ:Ljava/lang/Boolean;

    goto :goto_1

    :cond_4
    const-string v2, "userSpaceOnUse"

    .line 2053
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 2054
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p0, Ll/ۖ֡ܺ;->ۢ:Ljava/lang/Boolean;

    goto :goto_1

    .line 2056
    :cond_5
    new-instance p0, Ll/᩵֨ܺ;

    const-string p1, "Invalid value for attribute gradientUnits"

    .line 29
    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2056
    throw p0

    .line 2060
    :cond_6
    invoke-static {v1}, Ll/ۗ֨ܺ;->ۡ(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v1

    iput-object v1, p0, Ll/ۖ֡ܺ;->᩷:Landroid/graphics/Matrix;

    :cond_7
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_8
    return-void
.end method

.method public static ֫(Ll/ۗ֨ܺ;)V
    .locals 1

    .line 894
    new-instance v0, Ll/ܽ֨ܺ;

    invoke-direct {v0}, Ll/ܽ֨ܺ;-><init>()V

    iput-object v0, p0, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    const/4 v0, 0x0

    .line 895
    iput-boolean v0, p0, Ll/ۗ֨ܺ;->᩷:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗ֨ܺ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۗ֨ܺ;->ܺ(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗ֨ܺ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Ll/ۗ֨ܺ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗ֨ܺ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۗ֨ܺ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    return-void
.end method

.method public static ֫(Ll/۠ۚܺ;Ljava/lang/String;)V
    .locals 3

    .line 3620
    new-instance v0, Ll/᩶֨ܺ;

    invoke-direct {v0, p1}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 3621
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۢ()V

    .line 3623
    invoke-virtual {v0}, Ll/᩶֨ܺ;->᩻()Ljava/lang/String;

    move-result-object v1

    const-string v2, "defer"

    .line 3624
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3625
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۢ()V

    .line 3626
    invoke-virtual {v0}, Ll/᩶֨ܺ;->᩻()Ljava/lang/String;

    move-result-object v1

    .line 3629
    :cond_0
    invoke-static {v1}, Ll/֡֨ܺ;->֫(Ljava/lang/String;)Ll/֫֡ܺ;

    move-result-object v1

    .line 3632
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۢ()V

    .line 3634
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v2

    if-nez v2, :cond_3

    .line 3635
    invoke-virtual {v0}, Ll/᩶֨ܺ;->᩻()Ljava/lang/String;

    move-result-object v0

    .line 3636
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "meet"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "slice"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3640
    sget-object p1, Ll/ۧ֡ܺ;->᩶:Ll/ۧ֡ܺ;

    goto :goto_0

    .line 3642
    :cond_1
    new-instance p0, Ll/᩵֨ܺ;

    const-string v0, "Invalid preserveAspectRatio definition: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3642
    throw p0

    .line 3638
    :cond_2
    sget-object p1, Ll/ۧ֡ܺ;->᩹:Ll/ۧ֡ܺ;

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    .line 3645
    :goto_0
    new-instance v0, Ll/ܽ֡ܺ;

    invoke-direct {v0, v1, p1}, Ll/ܽ֡ܺ;-><init>(Ll/֫֡ܺ;Ll/ۧ֡ܺ;)V

    .line 3614
    iput-object v0, p0, Ll/۠ۚܺ;->ۘ:Ll/ܽ֡ܺ;

    return-void
.end method

.method public static ֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1901
    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-ge v1, v2, :cond_7

    .line 1903
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 1904
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/16 v4, 0x49

    if-eq v3, v4, :cond_4

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_6

    .line 1919
    :pswitch_0
    invoke-static {v2}, Ll/ۗ֨ܺ;->ܿ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 1920
    new-instance v3, Ljava/util/HashSet;

    if-eqz v2, :cond_0

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_1

    :cond_0
    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    .line 1921
    :goto_1
    invoke-interface {p0, v3}, Ll/ۡۚܺ;->ܽ(Ljava/util/HashSet;)V

    goto/16 :goto_6

    .line 4495
    :pswitch_1
    new-instance v3, Ll/᩶֨ܺ;

    invoke-direct {v3, v2}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 4496
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 4498
    :goto_2
    invoke-virtual {v3}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 4500
    invoke-virtual {v3}, Ll/᩶֨ܺ;->᩻()Ljava/lang/String;

    move-result-object v4

    .line 4501
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4502
    invoke-virtual {v3}, Ll/᩶֨ܺ;->ۢ()V

    goto :goto_2

    .line 1916
    :cond_1
    invoke-interface {p0, v2}, Ll/ۡۚܺ;->ᩳ(Ljava/util/HashSet;)V

    goto :goto_6

    .line 1910
    :pswitch_2
    invoke-interface {p0, v2}, Ll/ۡۚܺ;->֫(Ljava/lang/String;)V

    goto :goto_6

    .line 4448
    :pswitch_3
    new-instance v3, Ll/᩶֨ܺ;

    invoke-direct {v3, v2}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 4449
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 4451
    :goto_3
    invoke-virtual {v3}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v4

    if-nez v4, :cond_3

    .line 4453
    invoke-virtual {v3}, Ll/᩶֨ܺ;->᩻()Ljava/lang/String;

    move-result-object v4

    const-string v5, "http://www.w3.org/TR/SVG11/feature#"

    .line 4454
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x23

    .line 4455
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_2
    const-string v4, "UNSUPPORTED"

    .line 4460
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4462
    :goto_4
    invoke-virtual {v3}, Ll/᩶֨ܺ;->ۢ()V

    goto :goto_3

    .line 1907
    :cond_3
    invoke-interface {p0, v2}, Ll/ۡۚܺ;->֫(Ljava/util/HashSet;)V

    goto :goto_6

    .line 4472
    :cond_4
    new-instance v3, Ll/᩶֨ܺ;

    invoke-direct {v3, v2}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 4473
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 4475
    :goto_5
    invoke-virtual {v3}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v4

    if-nez v4, :cond_6

    .line 4477
    invoke-virtual {v3}, Ll/᩶֨ܺ;->᩻()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x2d

    .line 4478
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_5

    .line 4480
    invoke-virtual {v4, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 4483
    :cond_5
    new-instance v5, Ljava/util/Locale;

    const-string v6, ""

    invoke-direct {v5, v4, v6, v6}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    .line 4484
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4485
    invoke-virtual {v3}, Ll/᩶֨ܺ;->ۢ()V

    goto :goto_5

    .line 1913
    :cond_6
    invoke-interface {p0, v2}, Ll/ۡۚܺ;->ۧ(Ljava/util/HashSet;)V

    :goto_6
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_7
    return-void

    :pswitch_data_0
    .packed-switch 0x34
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۤ֡ܺ;Lorg/xml/sax/Attributes;Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x0

    .line 1703
    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 1705
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v1

    sget-object v2, Ll/᩸֨ܺ;->ᩳۧ:Ll/᩸֨ܺ;

    if-ne v1, v2, :cond_3

    .line 1707
    new-instance v1, Ll/᩶֨ܺ;

    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 1708
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1709
    invoke-virtual {v1}, Ll/᩶֨ܺ;->ۢ()V

    .line 1711
    :goto_1
    invoke-virtual {v1}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_2

    .line 1712
    invoke-virtual {v1}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v3

    .line 1713
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    const-string v5, "Invalid <"

    if-nez v4, :cond_1

    .line 1715
    invoke-virtual {v1}, Ll/᩶֨ܺ;->᩷()Z

    .line 1716
    invoke-virtual {v1}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v4

    .line 1717
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_0

    .line 1719
    invoke-virtual {v1}, Ll/᩶֨ܺ;->᩷()Z

    .line 1720
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1721
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1718
    :cond_0
    new-instance p0, Ll/᩵֨ܺ;

    const-string p1, "> points attribute. There should be an even number of coordinates."

    .line 0
    invoke-static {v5, p2, p1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1718
    throw p0

    .line 1714
    :cond_1
    new-instance p0, Ll/᩵֨ܺ;

    const-string p1, "> points attribute. Non-coordinate content found in list."

    .line 0
    invoke-static {v5, p2, p1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1714
    throw p0

    .line 1723
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [F

    iput-object v1, p0, Ll/ۤ֡ܺ;->ᩴ:[F

    .line 1725
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    .line 1726
    iget-object v4, p0, Ll/ۤ֡ܺ;->ᩴ:[F

    add-int/lit8 v5, v2, 0x1

    aput v3, v4, v2

    move v2, v5

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_4
    return-void
.end method

.method public static ֫(Ll/ۨۚܺ;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    .line 1780
    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 1782
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 1783
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/16 v3, 0x9

    if-eq v2, v3, :cond_3

    const/16 v3, 0xa

    if-eq v2, v3, :cond_2

    const/16 v3, 0x52

    if-eq v2, v3, :cond_1

    const/16 v3, 0x53

    if-eq v2, v3, :cond_0

    goto :goto_1

    .line 1789
    :cond_0
    invoke-static {v1}, Ll/ۗ֨ܺ;->ۜ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Ll/ۨۚܺ;->֡:Ljava/util/ArrayList;

    goto :goto_1

    .line 1786
    :cond_1
    invoke-static {v1}, Ll/ۗ֨ܺ;->ۜ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Ll/ۨۚܺ;->᩵:Ljava/util/ArrayList;

    goto :goto_1

    .line 1795
    :cond_2
    invoke-static {v1}, Ll/ۗ֨ܺ;->ۜ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Ll/ۨۚܺ;->ᩴ:Ljava/util/ArrayList;

    goto :goto_1

    .line 1792
    :cond_3
    invoke-static {v1}, Ll/ۗ֨ܺ;->ۜ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Ll/ۨۚܺ;->ۘ:Ljava/util/ArrayList;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public static ֫(Ll/᩵ۚܺ;Ljava/lang/String;Z)V
    .locals 4

    .line 2983
    new-instance v0, Ll/᩶֨ܺ;

    const-string v1, "/\\*.*?\\*/"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    :cond_0
    :goto_0
    const/4 p1, 0x0

    const/16 v1, 0x3a

    .line 2737
    invoke-virtual {v0, p1, v1}, Ll/᩶֨ܺ;->֫(ZC)Ljava/lang/String;

    move-result-object p1

    .line 2988
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۢ()V

    .line 2989
    invoke-virtual {v0, v1}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 2991
    :cond_1
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۢ()V

    const/4 v1, 0x1

    const/16 v2, 0x3b

    .line 2747
    invoke-virtual {v0, v1, v2}, Ll/᩶֨ܺ;->֫(ZC)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :goto_1
    return-void

    .line 2995
    :cond_2
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۢ()V

    .line 2996
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v0, v2}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    if-eqz p2, :cond_4

    .line 2998
    invoke-static {p1}, Ll/ۗ֨ܺ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 2999
    :cond_4
    iget-object v2, p0, Ll/᩵ۚܺ;->᩻:Ll/᩷ۚܺ;

    if-nez v2, :cond_5

    .line 3000
    new-instance v2, Ll/᩷ۚܺ;

    invoke-direct {v2}, Ll/᩷ۚܺ;-><init>()V

    iput-object v2, p0, Ll/᩵ۚܺ;->᩻:Ll/᩷ۚܺ;

    .line 3001
    :cond_5
    iget-object v2, p0, Ll/᩵ۚܺ;->᩻:Ll/᩷ۚܺ;

    invoke-static {v2, p1, v1}, Ll/ۗ֨ܺ;->֫(Ll/᩷ۚܺ;Ljava/lang/String;Ljava/lang/String;)V

    .line 3003
    :cond_6
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۢ()V

    goto :goto_0
.end method

.method public static ֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V
    .locals 3

    const/4 v0, 0x0

    .line 2915
    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 2917
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "id"

    .line 2918
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "xml:id"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "xml:space"

    .line 2923
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2924
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v0, "default"

    .line 2925
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2926
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Ll/᩵ۚܺ;->ܳ:Ljava/lang/Boolean;

    return-void

    :cond_1
    const-string v0, "preserve"

    .line 2927
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2928
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Ll/᩵ۚܺ;->ܳ:Ljava/lang/Boolean;

    return-void

    .line 2930
    :cond_2
    new-instance p0, Ll/᩵֨ܺ;

    const-string v0, "Invalid value for \"xml:space\" attribute: "

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2930
    throw p0

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2920
    :cond_4
    :goto_1
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۚܺ;->ܿ:Ljava/lang/String;

    :cond_5
    return-void
.end method

.method public static ֫(Ll/᩷ۚܺ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 3030
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_24

    :cond_0
    const-string v0, "inherit"

    .line 3033
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_24

    .line 3036
    :cond_1
    invoke-static {p1}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const-string v0, "auto"

    const/4 v1, 0x5

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p1, v2, :cond_4c

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4b

    const/4 v2, 0x4

    const-string v4, "evenodd"

    const-string v5, "nonzero"

    if-eq p1, v2, :cond_48

    if-eq p1, v1, :cond_47

    const/16 v1, 0x8

    if-eq p1, v1, :cond_44

    const/16 v1, 0x23

    if-eq p1, v1, :cond_43

    const/16 v1, 0x28

    if-eq p1, v1, :cond_42

    const/16 v1, 0x2a

    const-string v2, "visible"

    const/4 v6, 0x0

    if-eq p1, v1, :cond_3d

    const/16 v1, 0x4e

    const-string v7, "none"

    if-eq p1, v1, :cond_3a

    const/16 v1, 0x3a

    const-string v8, "currentColor"

    if-eq p1, v1, :cond_38

    const/16 v1, 0x3b

    if-eq p1, v1, :cond_37

    const/16 v1, 0x4a

    if-eq p1, v1, :cond_33

    const/16 v1, 0x4b

    if-eq p1, v1, :cond_2d

    const-string v1, "italic"

    const-string v9, "oblique"

    const-string v10, "normal"

    const-string v11, "|"

    const/16 v12, 0x7c

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    const-string v0, "round"

    packed-switch p1, :pswitch_data_2

    packed-switch p1, :pswitch_data_3

    goto/16 :goto_24

    .line 3986
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {p2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x2

    goto :goto_1

    :sswitch_1
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    goto :goto_1

    :sswitch_2
    invoke-virtual {p2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    goto :goto_1

    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_4

    goto :goto_2

    .line 3989
    :pswitch_1
    sget-object v3, Ll/֫ۚܺ;->᩶:Ll/֫ۚܺ;

    goto :goto_2

    .line 3988
    :pswitch_2
    sget-object v3, Ll/֫ۚܺ;->᩹:Ll/֫ۚܺ;

    goto :goto_2

    .line 3990
    :pswitch_3
    sget-object v3, Ll/֫ۚܺ;->ۙ:Ll/֫ۚܺ;

    .line 3155
    :goto_2
    iput-object v3, p0, Ll/᩷ۚܺ;->ܰ:Ll/֫ۚܺ;

    if-eqz v3, :cond_50

    .line 3157
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x10000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3978
    :pswitch_4
    invoke-static {p2}, Ll/۠֨ܺ;->֫(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    .line 3149
    iput-object p1, p0, Ll/᩷ۚܺ;->۟:Ljava/lang/Integer;

    if-eqz p1, :cond_50

    .line 3151
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x8000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3965
    :pswitch_5
    :try_start_0
    invoke-static {p2}, Ll/֨֨ܺ;->֫(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object p1

    if-nez p1, :cond_5

    .line 3967
    invoke-static {p2}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v3
    :try_end_0
    .catch Ll/᩵֨ܺ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_5
    move-object v3, p1

    goto :goto_3

    :catch_0
    nop

    .line 3143
    :goto_3
    iput-object v3, p0, Ll/᩷ۚܺ;->᩺:Ll/֨֡ܺ;

    if-eqz v3, :cond_50

    .line 3145
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x4000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3137
    :pswitch_6
    invoke-static {p2}, Ll/ۗ֨ܺ;->ܿ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۨ:Ljava/util/ArrayList;

    if-eqz p1, :cond_50

    .line 3139
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x2000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3876
    :pswitch_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "|caption|icon|menu|message-box|small-caption|status-bar|"

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_24

    .line 3880
    :cond_6
    new-instance p1, Ll/᩶֨ܺ;

    invoke-direct {p1, p2}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    move-object p2, v3

    move-object v0, p2

    move-object v2, v0

    :goto_4
    const/16 v4, 0x2f

    .line 2737
    invoke-virtual {p1, v6, v4}, Ll/᩶֨ܺ;->֫(ZC)Ljava/lang/String;

    move-result-object v5

    .line 3885
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ۢ()V

    if-nez v5, :cond_7

    goto/16 :goto_24

    :cond_7
    if-eqz p2, :cond_8

    if-eqz v0, :cond_8

    goto :goto_8

    .line 3890
    :cond_8
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_4

    :cond_9
    if-nez p2, :cond_a

    .line 3893
    invoke-static {v5}, Ll/۠֨ܺ;->֫(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_a

    goto :goto_4

    :cond_a
    if-nez v0, :cond_e

    .line 3986
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_5

    :sswitch_3
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_5

    :cond_b
    const/4 v0, 0x2

    goto :goto_6

    :sswitch_4
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_5

    :cond_c
    const/4 v0, 0x1

    goto :goto_6

    :sswitch_5
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_5

    :cond_d
    const/4 v0, 0x0

    goto :goto_6

    :goto_5
    const/4 v0, -0x1

    :goto_6
    packed-switch v0, :pswitch_data_5

    move-object v0, v3

    goto :goto_7

    .line 3989
    :pswitch_8
    sget-object v0, Ll/֫ۚܺ;->᩶:Ll/֫ۚܺ;

    goto :goto_7

    .line 3988
    :pswitch_9
    sget-object v0, Ll/֫ۚܺ;->᩹:Ll/֫ۚܺ;

    goto :goto_7

    .line 3990
    :pswitch_a
    sget-object v0, Ll/֫ۚܺ;->ۙ:Ll/֫ۚܺ;

    :goto_7
    if-eqz v0, :cond_e

    goto :goto_4

    :cond_e
    if-nez v2, :cond_f

    const-string v2, "small-caps"

    .line 3903
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    move-object v2, v5

    goto :goto_4

    .line 3965
    :cond_f
    :goto_8
    :try_start_1
    invoke-static {v5}, Ll/֨֨ܺ;->֫(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v1

    if-nez v1, :cond_10

    .line 3967
    invoke-static {v5}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v1
    :try_end_1
    .catch Ll/᩵֨ܺ; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_9

    :catch_1
    move-object v1, v3

    .line 3915
    :cond_10
    :goto_9
    invoke-virtual {p1, v4}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 3917
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ۢ()V

    .line 3918
    invoke-virtual {p1}, Ll/᩶֨ܺ;->᩻()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_11

    .line 3921
    :try_start_2
    invoke-static {v2}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;
    :try_end_2
    .catch Ll/᩵֨ܺ; {:try_start_2 .. :try_end_2} :catch_5

    .line 3926
    :cond_11
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ۢ()V

    .line 2897
    :cond_12
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_13

    goto :goto_a

    .line 2900
    :cond_13
    iget v2, p1, Ll/᩶֨ܺ;->ܿ:I

    .line 2901
    iget v3, p1, Ll/᩶֨ܺ;->ۧ:I

    iput v3, p1, Ll/᩶֨ܺ;->ܿ:I

    .line 2902
    iget-object p1, p1, Ll/᩶֨ܺ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 3930
    :goto_a
    invoke-static {v3}, Ll/ۗ֨ܺ;->ܿ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۨ:Ljava/util/ArrayList;

    .line 3931
    iput-object v1, p0, Ll/᩷ۚܺ;->᩺:Ll/֨֡ܺ;

    if-nez p2, :cond_14

    const/16 p1, 0x190

    goto :goto_b

    .line 3932
    :cond_14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_b
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->۟:Ljava/lang/Integer;

    if-nez v0, :cond_15

    .line 3933
    sget-object v0, Ll/֫ۚܺ;->᩶:Ll/֫ۚܺ;

    :cond_15
    iput-object v0, p0, Ll/᩷ۚܺ;->ܰ:Ll/֫ۚܺ;

    .line 3934
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x1e000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    goto/16 :goto_24

    .line 3051
    :pswitch_b
    invoke-static {p2}, Ll/ۗ֨ܺ;->᩷(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۤ:Ljava/lang/Float;

    if-eqz p1, :cond_50

    .line 3053
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 4026
    :pswitch_c
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_16

    .line 4027
    sget-object v3, Ll/۟֡ܺ;->᩶:Ll/۟֡ܺ;

    goto :goto_c

    .line 4028
    :cond_16
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_17

    .line 4029
    sget-object v3, Ll/۟֡ܺ;->᩹:Ll/۟֡ܺ;

    .line 3045
    :cond_17
    :goto_c
    iput-object v3, p0, Ll/᩷ۚܺ;->ۛ:Ll/۟֡ܺ;

    if-eqz v3, :cond_50

    .line 3047
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3039
    :pswitch_d
    invoke-static {p2}, Ll/ۗ֨ܺ;->ۢ(Ljava/lang/String;)Ll/֨ۚܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->۫:Ll/֨ۚܺ;

    if-eqz p1, :cond_50

    .line 3041
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3207
    :pswitch_e
    invoke-virtual {p2, v12}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    if-gez p1, :cond_50

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_18

    goto/16 :goto_24

    .line 3209
    :cond_18
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->۬:Ljava/lang/Boolean;

    .line 3210
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x1000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3202
    :pswitch_f
    invoke-static {p2}, Ll/ۗ֨ܺ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۧ֫:Ljava/lang/String;

    .line 3203
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x800000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3197
    :pswitch_10
    invoke-static {p2}, Ll/ۗ֨ܺ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ܽ֫:Ljava/lang/String;

    .line 3198
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x400000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3192
    :pswitch_11
    invoke-static {p2}, Ll/ۗ֨ܺ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ᩳ֫:Ljava/lang/String;

    .line 3193
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x200000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3185
    :pswitch_12
    invoke-static {p2}, Ll/ۗ֨ܺ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ᩳ֫:Ljava/lang/String;

    .line 3186
    iput-object p1, p0, Ll/᩷ۚܺ;->ܽ֫:Ljava/lang/String;

    .line 3187
    iput-object p1, p0, Ll/᩷ۚܺ;->ۧ֫:Ljava/lang/String;

    .line 3188
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0xe00000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 4181
    :pswitch_13
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    sparse-switch p1, :sswitch_data_2

    goto :goto_d

    :sswitch_6
    const-string p1, "optimizeSpeed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    goto :goto_d

    :cond_19
    const/4 p1, 0x2

    goto :goto_e

    :sswitch_7
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    goto :goto_d

    :cond_1a
    const/4 p1, 0x1

    goto :goto_e

    :sswitch_8
    const-string p1, "optimizeQuality"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1b

    goto :goto_d

    :cond_1b
    const/4 p1, 0x0

    goto :goto_e

    :goto_d
    const/4 p1, -0x1

    :goto_e
    packed-switch p1, :pswitch_data_6

    goto :goto_f

    .line 4185
    :pswitch_14
    sget-object v3, Ll/ᩳۚܺ;->ۙ:Ll/ᩳۚܺ;

    goto :goto_f

    .line 4183
    :pswitch_15
    sget-object v3, Ll/ᩳۚܺ;->᩹:Ll/ᩳۚܺ;

    goto :goto_f

    .line 4184
    :pswitch_16
    sget-object v3, Ll/ᩳۚܺ;->᩶:Ll/ᩳۚܺ;

    .line 3308
    :goto_f
    iput-object v3, p0, Ll/᩷ۚܺ;->֫֫:Ll/ᩳۚܺ;

    if-eqz v3, :cond_50

    .line 3310
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide v0, 0x2000000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3070
    :pswitch_17
    :try_start_3
    invoke-static {p2}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->۠֫:Ll/֨֡ܺ;

    .line 3071
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J
    :try_end_3
    .catch Ll/᩵֨ܺ; {:try_start_3 .. :try_end_3} :catch_5

    return-void

    .line 3063
    :pswitch_18
    invoke-static {p2}, Ll/ۗ֨ܺ;->᩷(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->֨֫:Ljava/lang/Float;

    if-eqz p1, :cond_50

    .line 3065
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3091
    :pswitch_19
    :try_start_4
    invoke-static {p2}, Ll/ۗ֨ܺ;->ᩳ(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۚ֫:Ljava/lang/Float;

    .line 3092
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x100

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J
    :try_end_4
    .catch Ll/᩵֨ܺ; {:try_start_4 .. :try_end_4} :catch_5

    return-void

    :pswitch_1a
    const-string p1, "miter"

    .line 4050
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1c

    .line 4051
    sget-object v3, Ll/ܽۚܺ;->᩶:Ll/ܽۚܺ;

    goto :goto_10

    .line 4052
    :cond_1c
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1d

    .line 4053
    sget-object v3, Ll/ܽۚܺ;->ۙ:Ll/ܽۚܺ;

    goto :goto_10

    :cond_1d
    const-string p1, "bevel"

    .line 4054
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1e

    .line 4055
    sget-object v3, Ll/ܽۚܺ;->᩹:Ll/ܽۚܺ;

    .line 3084
    :cond_1e
    :goto_10
    iput-object v3, p0, Ll/᩷ۚܺ;->֡֫:Ll/ܽۚܺ;

    if-eqz v3, :cond_50

    .line 3086
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x80

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    :pswitch_1b
    const-string p1, "butt"

    .line 4037
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1f

    .line 4038
    sget-object v3, Ll/ۧۚܺ;->᩹:Ll/ۧۚܺ;

    goto :goto_11

    .line 4039
    :cond_1f
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_20

    .line 4040
    sget-object v3, Ll/ۧۚܺ;->᩶:Ll/ۧۚܺ;

    goto :goto_11

    :cond_20
    const-string p1, "square"

    .line 4041
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_21

    .line 4042
    sget-object v3, Ll/ۧۚܺ;->ۙ:Ll/ۧۚܺ;

    .line 3078
    :cond_21
    :goto_11
    iput-object v3, p0, Ll/᩷ۚܺ;->᩵֫:Ll/ۧۚܺ;

    if-eqz v3, :cond_50

    .line 3080
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3111
    :pswitch_1c
    :try_start_5
    invoke-static {p2}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ᩴ֫:Ll/֨֡ܺ;

    .line 3112
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x400

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J
    :try_end_5
    .catch Ll/᩵֨ܺ; {:try_start_5 .. :try_end_5} :catch_5

    return-void

    .line 3099
    :pswitch_1d
    invoke-virtual {v7, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const-wide/16 v0, 0x200

    if-eqz p1, :cond_22

    .line 3100
    iput-object v3, p0, Ll/᩷ۚܺ;->ۘ֫:[Ll/֨֡ܺ;

    .line 3101
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 4063
    :cond_22
    new-instance p1, Ll/᩶֨ܺ;

    invoke-direct {p1, p2}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 4064
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ۢ()V

    .line 4066
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ۧ()Z

    move-result p2

    if-eqz p2, :cond_23

    goto :goto_13

    .line 4069
    :cond_23
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ܿ()Ll/֨֡ܺ;

    move-result-object p2

    if-nez p2, :cond_24

    goto :goto_13

    .line 4072
    :cond_24
    invoke-virtual {p2}, Ll/֨֡ܺ;->֫()Z

    move-result v2

    if-eqz v2, :cond_25

    goto :goto_13

    .line 1422
    :cond_25
    iget v2, p2, Ll/֨֡ܺ;->᩹:F

    .line 4077
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 4078
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4079
    :goto_12
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ۧ()Z

    move-result p2

    if-nez p2, :cond_28

    .line 4081
    invoke-virtual {p1}, Ll/᩶֨ܺ;->᩷()Z

    .line 4082
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ܿ()Ll/֨֡ܺ;

    move-result-object p2

    if-nez p2, :cond_26

    goto :goto_13

    .line 4085
    :cond_26
    invoke-virtual {p2}, Ll/֨֡ܺ;->֫()Z

    move-result v5

    if-eqz v5, :cond_27

    goto :goto_13

    .line 4087
    :cond_27
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1422
    iget p2, p2, Ll/֨֡ܺ;->᩹:F

    add-float/2addr v2, p2

    goto :goto_12

    :cond_28
    const/4 p1, 0x0

    cmpl-float p1, v2, p1

    if-nez p1, :cond_29

    goto :goto_13

    .line 4096
    :cond_29
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ll/֨֡ܺ;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, [Ll/֨֡ܺ;

    .line 3104
    :goto_13
    iput-object v3, p0, Ll/᩷ۚܺ;->ۘ֫:[Ll/֨֡ܺ;

    if-eqz v3, :cond_50

    .line 3106
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3057
    :pswitch_1e
    invoke-static {p2}, Ll/ۗ֨ܺ;->ۢ(Ljava/lang/String;)Ll/֨ۚܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۖ֫:Ll/֨ۚܺ;

    if-eqz p1, :cond_50

    .line 3059
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3236
    :pswitch_1f
    invoke-static {p2}, Ll/ۗ֨ܺ;->᩷(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ܺ֫:Ljava/lang/Float;

    .line 3237
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x8000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3221
    :pswitch_20
    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2a

    .line 3222
    invoke-static {}, Ll/ۢ֡ܺ;->֫()Ll/ۢ֡ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۡ֫:Ll/֨ۚܺ;

    goto :goto_14

    .line 3225
    :cond_2a
    :try_start_6
    invoke-static {p2}, Ll/ۗ֨ܺ;->ܽ(Ljava/lang/String;)Ll/᩷֡ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۡ֫:Ll/֨ۚܺ;
    :try_end_6
    .catch Ll/᩵֨ܺ; {:try_start_6 .. :try_end_6} :catch_2

    .line 3232
    :goto_14
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x4000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    :catch_2
    move-exception p0

    .line 3228
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    goto/16 :goto_24

    .line 3214
    :pswitch_21
    invoke-virtual {p2, v12}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    if-gez p1, :cond_50

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "|visible|hidden|collapse|"

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2b

    goto/16 :goto_24

    .line 3216
    :cond_2b
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۗ֫:Ljava/lang/Boolean;

    .line 3217
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x2000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3297
    :pswitch_22
    invoke-static {p2}, Ll/ۗ֨ܺ;->᩷(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۙ֫:Ljava/lang/Float;

    .line 3298
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide v0, 0x400000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3282
    :pswitch_23
    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2c

    .line 3283
    invoke-static {}, Ll/ۢ֡ܺ;->֫()Ll/ۢ֡ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->᩶֫:Ll/֨ۚܺ;

    goto :goto_15

    .line 3286
    :cond_2c
    :try_start_7
    invoke-static {p2}, Ll/ۗ֨ܺ;->ܽ(Ljava/lang/String;)Ll/᩷֡ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->᩶֫:Ll/֨ۚܺ;
    :try_end_7
    .catch Ll/᩵֨ܺ; {:try_start_7 .. :try_end_7} :catch_3

    .line 3293
    :goto_15
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide v0, 0x200000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    :catch_3
    move-exception p0

    .line 3289
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    goto/16 :goto_24

    .line 3999
    :cond_2d
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    sparse-switch p1, :sswitch_data_3

    goto :goto_16

    :sswitch_9
    const-string p1, "overline"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2e

    goto :goto_16

    :cond_2e
    const/4 p1, 0x4

    goto :goto_17

    :sswitch_a
    const-string p1, "blink"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2f

    goto :goto_16

    :cond_2f
    const/4 p1, 0x3

    goto :goto_17

    :sswitch_b
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_30

    goto :goto_16

    :cond_30
    const/4 p1, 0x2

    goto :goto_17

    :sswitch_c
    const-string p1, "underline"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_31

    goto :goto_16

    :cond_31
    const/4 p1, 0x1

    goto :goto_17

    :sswitch_d
    const-string p1, "line-through"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_32

    goto :goto_16

    :cond_32
    const/4 p1, 0x0

    goto :goto_17

    :goto_16
    const/4 p1, -0x1

    :goto_17
    packed-switch p1, :pswitch_data_7

    goto :goto_18

    .line 4003
    :pswitch_24
    sget-object v3, Ll/ܳۚܺ;->ۗ:Ll/ܳۚܺ;

    goto :goto_18

    .line 4005
    :pswitch_25
    sget-object v3, Ll/ܳۚܺ;->᩹:Ll/ܳۚܺ;

    goto :goto_18

    .line 4001
    :pswitch_26
    sget-object v3, Ll/ܳۚܺ;->ۙ:Ll/ܳۚܺ;

    goto :goto_18

    .line 4002
    :pswitch_27
    sget-object v3, Ll/ܳۚܺ;->۬:Ll/ܳۚܺ;

    goto :goto_18

    .line 4004
    :pswitch_28
    sget-object v3, Ll/ܳۚܺ;->᩶:Ll/ܳۚܺ;

    .line 3161
    :goto_18
    iput-object v3, p0, Ll/᩷ۚܺ;->᩸֫:Ll/ܳۚܺ;

    if-eqz v3, :cond_50

    .line 3163
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x20000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 4103
    :cond_33
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    sparse-switch p1, :sswitch_data_4

    goto :goto_19

    :sswitch_e
    const-string p1, "start"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_34

    goto :goto_19

    :cond_34
    const/4 p1, 0x2

    goto :goto_1a

    :sswitch_f
    const-string p1, "end"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_35

    goto :goto_19

    :cond_35
    const/4 p1, 0x1

    goto :goto_1a

    :sswitch_10
    const-string p1, "middle"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_36

    goto :goto_19

    :cond_36
    const/4 p1, 0x0

    goto :goto_1a

    :goto_19
    const/4 p1, -0x1

    :goto_1a
    packed-switch p1, :pswitch_data_8

    goto :goto_1b

    .line 4105
    :pswitch_29
    sget-object v3, Ll/ܿۚܺ;->ۙ:Ll/ܿۚܺ;

    goto :goto_1b

    .line 4107
    :pswitch_2a
    sget-object v3, Ll/ܿۚܺ;->᩹:Ll/ܿۚܺ;

    goto :goto_1b

    .line 4106
    :pswitch_2b
    sget-object v3, Ll/ܿۚܺ;->᩶:Ll/ܿۚܺ;

    .line 3173
    :goto_1b
    iput-object v3, p0, Ll/᩷ۚܺ;->ܶ֫:Ll/ܿۚܺ;

    if-eqz v3, :cond_50

    .line 3175
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x40000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3277
    :cond_37
    invoke-static {p2}, Ll/ۗ֨ܺ;->᩷(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->᩷֫:Ljava/lang/Float;

    .line 3278
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide v0, 0x100000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3262
    :cond_38
    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_39

    .line 3263
    invoke-static {}, Ll/ۢ֡ܺ;->֫()Ll/ۢ֡ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۜ֫:Ll/֨ۚܺ;

    goto :goto_1c

    .line 3266
    :cond_39
    :try_start_8
    invoke-static {p2}, Ll/ۗ֨ܺ;->ܽ(Ljava/lang/String;)Ll/᩷֡ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۜ֫:Ll/֨ۚܺ;
    :try_end_8
    .catch Ll/᩵֨ܺ; {:try_start_8 .. :try_end_8} :catch_4

    .line 3273
    :goto_1c
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide v0, 0x80000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    :catch_4
    move-exception p0

    .line 3269
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    goto/16 :goto_24

    .line 4169
    :cond_3a
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3c

    const-string p1, "non-scaling-stroke"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3b

    goto :goto_1d

    .line 4172
    :cond_3b
    sget-object v3, Ll/ۜۚܺ;->᩹:Ll/ۜۚܺ;

    goto :goto_1d

    .line 4171
    :cond_3c
    sget-object v3, Ll/ۜۚܺ;->᩶:Ll/ۜۚܺ;

    .line 3302
    :goto_1d
    iput-object v3, p0, Ll/᩷ۚܺ;->᩹֫:Ll/ۜۚܺ;

    if-eqz v3, :cond_50

    .line 3304
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide v0, 0x800000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 4116
    :cond_3d
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    sparse-switch p1, :sswitch_data_5

    goto :goto_1e

    :sswitch_11
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3e

    goto :goto_1e

    :cond_3e
    const/4 p1, 0x3

    goto :goto_1f

    :sswitch_12
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3f

    goto :goto_1e

    :cond_3f
    const/4 p1, 0x2

    goto :goto_1f

    :sswitch_13
    const-string p1, "scroll"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_40

    goto :goto_1e

    :cond_40
    const/4 p1, 0x1

    goto :goto_1f

    :sswitch_14
    const-string p1, "hidden"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_41

    goto :goto_1e

    :cond_41
    const/4 p1, 0x0

    goto :goto_1f

    :goto_1e
    const/4 p1, -0x1

    :goto_1f
    packed-switch p1, :pswitch_data_9

    goto :goto_20

    .line 4120
    :pswitch_2c
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_20

    .line 4123
    :pswitch_2d
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3179
    :goto_20
    iput-object v3, p0, Ll/᩷ۚܺ;->᩻֫:Ljava/lang/Boolean;

    if-eqz v3, :cond_50

    .line 3181
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x80000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3119
    :cond_42
    invoke-static {p2}, Ll/ۗ֨ܺ;->᩷(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ܳ֫:Ljava/lang/Float;

    .line 3120
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x800

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3257
    :cond_43
    invoke-static {p2}, Ll/ۗ֨ܺ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ܿ֫:Ljava/lang/String;

    .line 3258
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x40000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    :cond_44
    const-string p1, "ltr"

    .line 4014
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_46

    const-string p1, "rtl"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_45

    goto :goto_21

    .line 4017
    :cond_45
    sget-object v3, Ll/᩻ۚܺ;->᩶:Ll/᩻ۚܺ;

    goto :goto_21

    .line 4016
    :cond_46
    sget-object v3, Ll/᩻ۚܺ;->᩹:Ll/᩻ۚܺ;

    .line 3167
    :goto_21
    iput-object v3, p0, Ll/᩷ۚܺ;->ۗ:Ll/᩻ۚܺ;

    if-eqz v3, :cond_50

    .line 3169
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide v0, 0x1000000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3125
    :cond_47
    :try_start_9
    invoke-static {p2}, Ll/ۗ֨ܺ;->ܽ(Ljava/lang/String;)Ll/᩷֡ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->ۙ:Ll/᩷֡ܺ;

    .line 3126
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/16 v0, 0x1000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J
    :try_end_9
    .catch Ll/᩵֨ܺ; {:try_start_9 .. :try_end_9} :catch_5

    return-void

    .line 4026
    :cond_48
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_49

    .line 4027
    sget-object v3, Ll/۟֡ܺ;->᩶:Ll/۟֡ܺ;

    goto :goto_22

    .line 4028
    :cond_49
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4a

    .line 4029
    sget-object v3, Ll/۟֡ܺ;->᩹:Ll/۟֡ܺ;

    .line 3252
    :cond_4a
    :goto_22
    iput-object v3, p0, Ll/᩷ۚܺ;->᩶:Ll/۟֡ܺ;

    .line 3253
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x20000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 3247
    :cond_4b
    invoke-static {p2}, Ll/ۗ֨ܺ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۚܺ;->᩹:Ljava/lang/String;

    .line 3248
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x10000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void

    .line 4133
    :cond_4c
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4d

    goto :goto_23

    :cond_4d
    const-string p1, "rect("

    .line 4135
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4e

    goto :goto_23

    .line 4138
    :cond_4e
    new-instance p1, Ll/᩶֨ܺ;

    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 4139
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ۢ()V

    .line 4141
    invoke-static {p1}, Ll/ۗ֨ܺ;->ۧ(Ll/᩶֨ܺ;)Ll/֨֡ܺ;

    move-result-object p2

    .line 4142
    invoke-virtual {p1}, Ll/᩶֨ܺ;->᩷()Z

    .line 4143
    invoke-static {p1}, Ll/ۗ֨ܺ;->ۧ(Ll/᩶֨ܺ;)Ll/֨֡ܺ;

    move-result-object v0

    .line 4144
    invoke-virtual {p1}, Ll/᩶֨ܺ;->᩷()Z

    .line 4145
    invoke-static {p1}, Ll/ۗ֨ܺ;->ۧ(Ll/᩶֨ܺ;)Ll/֨֡ܺ;

    move-result-object v1

    .line 4146
    invoke-virtual {p1}, Ll/᩶֨ܺ;->᩷()Z

    .line 4147
    invoke-static {p1}, Ll/ۗ֨ܺ;->ۧ(Ll/᩶֨ܺ;)Ll/֨֡ܺ;

    move-result-object v2

    .line 4149
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ۢ()V

    const/16 v4, 0x29

    .line 4150
    invoke-virtual {p1, v4}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v4

    if-nez v4, :cond_4f

    invoke-virtual {p1}, Ll/᩶֨ܺ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_4f

    goto :goto_23

    .line 4153
    :cond_4f
    new-instance v3, Ll/ܳ֡ܺ;

    .line 1550
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1551
    iput-object p2, v3, Ll/ܳ֡ܺ;->ᩳ:Ll/֨֡ܺ;

    .line 1552
    iput-object v0, v3, Ll/ܳ֡ܺ;->ܽ:Ll/֨֡ܺ;

    .line 1553
    iput-object v1, v3, Ll/ܳ֡ܺ;->֫:Ll/֨֡ܺ;

    .line 1554
    iput-object v2, v3, Ll/ܳ֡ܺ;->ۧ:Ll/֨֡ܺ;

    .line 3241
    :goto_23
    iput-object v3, p0, Ll/᩷ۚܺ;->᩸:Ll/ܳ֡ܺ;

    if-eqz v3, :cond_50

    .line 3243
    iget-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    const-wide/32 v0, 0x100000

    or-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۚܺ;->ۢ֫:J

    :catch_5
    :cond_50
    :goto_24
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1b
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x3e
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x58
        :pswitch_23
        :pswitch_22
        :pswitch_21
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x62ce05cf -> :sswitch_2
        -0x4642c5d0 -> :sswitch_1
        -0x3df94319 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x62ce05cf -> :sswitch_5
        -0x4642c5d0 -> :sswitch_4
        -0x3df94319 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x379c7c9e -> :sswitch_8
        0x2dddaf -> :sswitch_7
        0x159eff6a -> :sswitch_6
    .end sparse-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x45d81614 -> :sswitch_d
        -0x3d363934 -> :sswitch_c
        0x33af38 -> :sswitch_b
        0x597af5c -> :sswitch_a
        0x1f9462c8 -> :sswitch_9
    .end sparse-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
    .end packed-switch

    :sswitch_data_4
    .sparse-switch
        -0x4009266b -> :sswitch_10
        0x188db -> :sswitch_f
        0x68ac462 -> :sswitch_e
    .end sparse-switch

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
    .end packed-switch

    :sswitch_data_5
    .sparse-switch
        -0x48916256 -> :sswitch_14
        -0x361a1933 -> :sswitch_13
        0x2dddaf -> :sswitch_12
        0x1bd1f072 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_2d
        :pswitch_2d
        :pswitch_2c
        :pswitch_2c
    .end packed-switch
.end method

.method public static ֫(Ll/᩸ۚܺ;Lorg/xml/sax/Attributes;)V
    .locals 7

    const/4 v0, 0x0

    .line 3321
    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 3323
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 3324
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/16 v3, 0x30

    if-eq v2, v3, :cond_4

    const/16 v3, 0x50

    if-eq v2, v3, :cond_0

    goto :goto_1

    .line 3587
    :cond_0
    new-instance v2, Ll/᩶֨ܺ;

    invoke-direct {v2, v1}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 3588
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3590
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v1

    .line 3591
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 3592
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v3

    .line 3593
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 3594
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v4

    .line 3595
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 3596
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v2

    .line 3598
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_3

    const/4 v5, 0x0

    cmpg-float v6, v4, v5

    if-ltz v6, :cond_2

    cmpg-float v5, v2, v5

    if-ltz v5, :cond_1

    .line 3605
    new-instance v5, Ll/ܿ֡ܺ;

    invoke-direct {v5, v1, v3, v4, v2}, Ll/ܿ֡ܺ;-><init>(FFFF)V

    .line 3327
    iput-object v5, p0, Ll/᩸ۚܺ;->ᩴ:Ll/ܿ֡ܺ;

    goto :goto_1

    .line 3603
    :cond_1
    new-instance p0, Ll/᩵֨ܺ;

    const-string p1, "Invalid viewBox. height cannot be negative"

    .line 29
    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3603
    throw p0

    .line 3601
    :cond_2
    new-instance p0, Ll/᩵֨ܺ;

    const-string p1, "Invalid viewBox. width cannot be negative"

    .line 29
    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3601
    throw p0

    .line 3599
    :cond_3
    new-instance p0, Ll/᩵֨ܺ;

    const-string p1, "Invalid viewBox definition - should have four numbers"

    .line 29
    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3599
    throw p0

    .line 3330
    :cond_4
    invoke-static {p0, v1}, Ll/ۗ֨ܺ;->֫(Ll/۠ۚܺ;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method private ֫(Lorg/xml/sax/Attributes;)V
    .locals 5

    .line 1537
    iget-object v0, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-eqz v0, :cond_5

    .line 1539
    new-instance v0, Ll/᩻֡ܺ;

    invoke-direct {v0}, Ll/᩻֡ܺ;-><init>()V

    .line 1540
    iget-object v1, p0, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v1, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1541
    iget-object v1, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v1, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1542
    invoke-static {v0, p1}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1543
    invoke-static {v0, p1}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1544
    invoke-static {v0, p1}, Ll/ۗ֨ܺ;->֫(Ll/֡֡ܺ;Lorg/xml/sax/Attributes;)V

    .line 1545
    invoke-static {v0, p1}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v1, 0x0

    .line 1553
    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 1555
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 1556
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v4, 0x6

    if-eq v3, v4, :cond_3

    const/4 v4, 0x7

    if-eq v3, v4, :cond_2

    const/16 v4, 0x31

    if-eq v3, v4, :cond_0

    goto :goto_1

    .line 1565
    :cond_0
    invoke-static {v2}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v2

    iput-object v2, v0, Ll/᩻֡ܺ;->֡:Ll/֨֡ܺ;

    .line 1566
    invoke-virtual {v2}, Ll/֨֡ܺ;->֫()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 1567
    :cond_1
    new-instance p1, Ll/᩵֨ܺ;

    const-string v0, "Invalid <circle> element. r cannot be negative"

    .line 29
    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1567
    throw p1

    .line 1562
    :cond_2
    invoke-static {v2}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v2

    iput-object v2, v0, Ll/᩻֡ܺ;->᩵:Ll/֨֡ܺ;

    goto :goto_1

    .line 1559
    :cond_3
    invoke-static {v2}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v2

    iput-object v2, v0, Ll/᩻֡ܺ;->ᩴ:Ll/֨֡ܺ;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1547
    :cond_4
    iget-object p1, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    invoke-interface {p1, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    return-void

    .line 1538
    :cond_5
    new-instance p1, Ll/᩵֨ܺ;

    const-string v0, "Invalid document. Root element must be <svg>"

    .line 29
    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1538
    throw p1
.end method

.method private ֫([CII)V
    .locals 1

    .line 1016
    iget-boolean v0, p0, Ll/ۗ֨ܺ;->ܽ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1019
    :cond_0
    iget-boolean v0, p0, Ll/ۗ֨ܺ;->ᩳ:Z

    if-eqz v0, :cond_2

    .line 1021
    iget-object v0, p0, Ll/ۗ֨ܺ;->ܳ:Ljava/lang/StringBuilder;

    if-nez v0, :cond_1

    .line 1022
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ll/ۗ֨ܺ;->ܳ:Ljava/lang/StringBuilder;

    .line 1023
    :cond_1
    iget-object v0, p0, Ll/ۗ֨ܺ;->ܳ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    return-void

    .line 1025
    :cond_2
    iget-boolean v0, p0, Ll/ۗ֨ܺ;->ܿ:Z

    if-eqz v0, :cond_4

    .line 1027
    iget-object v0, p0, Ll/ۗ֨ܺ;->ۢ:Ljava/lang/StringBuilder;

    if-nez v0, :cond_3

    .line 1028
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ll/ۗ֨ܺ;->ۢ:Ljava/lang/StringBuilder;

    .line 1029
    :cond_3
    iget-object v0, p0, Ll/ۗ֨ܺ;->ۢ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    return-void

    .line 1031
    :cond_4
    iget-object v0, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    instance-of v0, v0, Ll/ۤۚܺ;

    if-eqz v0, :cond_5

    .line 1033
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-direct {p0, v0}, Ll/ۗ֨ܺ;->֫(Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 3803
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 3805
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 3806
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x41

    if-lt v1, v3, :cond_1

    const/16 v3, 0x5a

    if-gt v1, v3, :cond_1

    add-int/lit8 v1, v1, 0x20

    int-to-char v1, v1

    .line 3809
    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_2

    :goto_1
    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static ۜ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 3522
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_4

    .line 3525
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3527
    new-instance v2, Ll/᩶֨ܺ;

    invoke-direct {v2, p0}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 3528
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3530
    :goto_0
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۧ()Z

    move-result p0

    if-nez p0, :cond_3

    .line 3532
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result p0

    .line 3533
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 3534
    new-instance p0, Ll/᩵֨ܺ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Invalid length list value: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2830
    iget-object v3, v2, Ll/᩶֨ܺ;->֫:Ljava/lang/String;

    iget v4, v2, Ll/᩶֨ܺ;->ܿ:I

    .line 2831
    :goto_1
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v5

    if-nez v5, :cond_0

    iget v5, v2, Ll/᩶֨ܺ;->ܿ:I

    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ll/᩶֨ܺ;->֫(I)Z

    move-result v5

    if-nez v5, :cond_0

    .line 2832
    iget v5, v2, Ll/᩶֨ܺ;->ܿ:I

    add-int/2addr v5, v1

    iput v5, v2, Ll/᩶֨ܺ;->ܿ:I

    goto :goto_1

    .line 2833
    :cond_0
    iget v1, v2, Ll/᩶֨ܺ;->ܿ:I

    invoke-virtual {v3, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 2834
    iput v4, v2, Ll/᩶֨ܺ;->ܿ:I

    .line 3534
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3534
    throw p0

    .line 3535
    :cond_1
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۜ()Ll/۟ۚܺ;

    move-result-object v3

    if-nez v3, :cond_2

    .line 3537
    sget-object v3, Ll/۟ۚܺ;->ۨ:Ll/۟ۚܺ;

    .line 3538
    :cond_2
    new-instance v4, Ll/֨֡ܺ;

    invoke-direct {v4, p0, v3}, Ll/֨֡ܺ;-><init>(FLl/۟ۚܺ;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3539
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    goto :goto_0

    :cond_3
    return-object v0

    .line 3523
    :cond_4
    new-instance p0, Ll/᩵֨ܺ;

    const-string v0, "Invalid length list (empty string)"

    .line 29
    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3523
    throw p0
.end method

.method public static ۡ(Ljava/lang/String;)Landroid/graphics/Matrix;
    .locals 19

    move-object/from16 v0, p0

    .line 3353
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 3355
    new-instance v2, Ll/᩶֨ܺ;

    invoke-direct {v2, v0}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 3356
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3358
    :goto_0
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_18

    .line 2807
    iget-object v3, v2, Ll/᩶֨ܺ;->֫:Ljava/lang/String;

    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    goto :goto_3

    .line 2809
    :cond_0
    iget v4, v2, Ll/᩶֨ܺ;->ܿ:I

    .line 2811
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    :goto_1
    const/16 v8, 0x61

    if-lt v7, v8, :cond_1

    const/16 v8, 0x7a

    if-le v7, v8, :cond_2

    :cond_1
    const/16 v8, 0x41

    if-lt v7, v8, :cond_3

    const/16 v8, 0x5a

    if-gt v7, v8, :cond_3

    .line 2813
    :cond_2
    invoke-virtual {v2}, Ll/᩶֨ܺ;->֫()I

    move-result v7

    goto :goto_1

    .line 2814
    :cond_3
    iget v8, v2, Ll/᩶֨ܺ;->ܿ:I

    .line 2815
    :goto_2
    invoke-static {v7}, Ll/᩶֨ܺ;->֫(I)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 2816
    invoke-virtual {v2}, Ll/᩶֨ܺ;->֫()I

    move-result v7

    goto :goto_2

    :cond_4
    const/16 v9, 0x28

    if-ne v7, v9, :cond_5

    .line 2818
    iget v6, v2, Ll/᩶֨ܺ;->ܿ:I

    add-int/2addr v6, v5

    iput v6, v2, Ll/᩶֨ܺ;->ܿ:I

    .line 2819
    invoke-virtual {v3, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    .line 2821
    :cond_5
    iput v4, v2, Ll/᩶֨ܺ;->ܿ:I

    :goto_3
    if-eqz v6, :cond_17

    .line 3365
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v11, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_4

    :sswitch_0
    const-string v3, "translate"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    const/4 v11, 0x5

    goto :goto_4

    :sswitch_1
    const-string v3, "skewY"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    const/4 v11, 0x4

    goto :goto_4

    :sswitch_2
    const-string v3, "skewX"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    const/4 v11, 0x3

    goto :goto_4

    :sswitch_3
    const-string v3, "scale"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_4

    :cond_9
    const/4 v11, 0x2

    goto :goto_4

    :sswitch_4
    const-string v3, "rotate"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_4

    :cond_a
    const/4 v11, 0x1

    goto :goto_4

    :sswitch_5
    const-string v3, "matrix"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_4

    :cond_b
    const/4 v11, 0x0

    :goto_4
    const/4 v3, 0x0

    const/16 v12, 0x29

    const-string v13, "Invalid transform list: "

    packed-switch v11, :pswitch_data_0

    .line 3464
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "Invalid transform list fn: "

    const-string v2, ")"

    .line 0
    invoke-static {v1, v6, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3464
    throw v0

    .line 3390
    :pswitch_0
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3391
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v4

    .line 2598
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 2599
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v5

    .line 3393
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3395
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_d

    invoke-virtual {v2, v12}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 3398
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 3399
    invoke-virtual {v1, v4, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto/16 :goto_5

    .line 3401
    :cond_c
    invoke-virtual {v1, v4, v5}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto/16 :goto_5

    .line 3396
    :cond_d
    new-instance v1, Ll/᩵֨ܺ;

    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-direct {v1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3396
    throw v1

    .line 3452
    :pswitch_1
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3453
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v4

    .line 3454
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3456
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_e

    invoke-virtual {v2, v12}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v5

    if-eqz v5, :cond_e

    float-to-double v4, v4

    .line 3459
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->tan(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->preSkew(FF)Z

    goto/16 :goto_5

    .line 3457
    :cond_e
    new-instance v1, Ll/᩵֨ܺ;

    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-direct {v1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3457
    throw v1

    .line 3440
    :pswitch_2
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3441
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v4

    .line 3442
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3444
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual {v2, v12}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v5

    if-eqz v5, :cond_f

    float-to-double v4, v4

    .line 3447
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->tan(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v1, v4, v3}, Landroid/graphics/Matrix;->preSkew(FF)Z

    goto/16 :goto_5

    .line 3445
    :cond_f
    new-instance v1, Ll/᩵֨ܺ;

    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-direct {v1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3445
    throw v1

    .line 3405
    :pswitch_3
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3406
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v3

    .line 2598
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 2599
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v4

    .line 3408
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3410
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_11

    invoke-virtual {v2, v12}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v5

    if-eqz v5, :cond_11

    .line 3413
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 3414
    invoke-virtual {v1, v3, v3}, Landroid/graphics/Matrix;->preScale(FF)Z

    goto/16 :goto_5

    .line 3416
    :cond_10
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->preScale(FF)Z

    goto/16 :goto_5

    .line 3411
    :cond_11
    new-instance v1, Ll/᩵֨ܺ;

    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-direct {v1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3411
    throw v1

    .line 3420
    :pswitch_4
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3421
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v3

    .line 2598
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 2599
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v4

    .line 2598
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 2599
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v5

    .line 3424
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3426
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_14

    invoke-virtual {v2, v12}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v6

    if-eqz v6, :cond_14

    .line 3429
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 3430
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->preRotate(F)Z

    goto/16 :goto_5

    .line 3431
    :cond_12
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_13

    .line 3432
    invoke-virtual {v1, v3, v4, v5}, Landroid/graphics/Matrix;->preRotate(FFF)Z

    goto :goto_5

    .line 3434
    :cond_13
    new-instance v1, Ll/᩵֨ܺ;

    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-direct {v1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3434
    throw v1

    .line 3427
    :cond_14
    new-instance v1, Ll/᩵֨ܺ;

    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-direct {v1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3427
    throw v1

    .line 3367
    :pswitch_5
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3368
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v6

    .line 3369
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 3370
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v11

    .line 3371
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 3372
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v14

    .line 3373
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 3374
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v15

    .line 3375
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 3376
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v16

    .line 3377
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    .line 3378
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v17

    .line 3379
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۢ()V

    .line 3381
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->isNaN(F)Z

    move-result v18

    if-nez v18, :cond_16

    invoke-virtual {v2, v12}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v12

    if-eqz v12, :cond_16

    .line 3384
    new-instance v12, Landroid/graphics/Matrix;

    invoke-direct {v12}, Landroid/graphics/Matrix;-><init>()V

    const/16 v13, 0x9

    new-array v13, v13, [F

    aput v6, v13, v10

    aput v14, v13, v5

    aput v16, v13, v9

    aput v11, v13, v8

    aput v15, v13, v7

    aput v17, v13, v4

    const/4 v4, 0x6

    aput v3, v13, v4

    const/4 v4, 0x7

    aput v3, v13, v4

    const/high16 v3, 0x3f800000    # 1.0f

    const/16 v4, 0x8

    aput v3, v13, v4

    .line 3385
    invoke-virtual {v12, v13}, Landroid/graphics/Matrix;->setValues([F)V

    .line 3386
    invoke-virtual {v1, v12}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 3467
    :goto_5
    invoke-virtual {v2}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_15

    goto :goto_6

    .line 3469
    :cond_15
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩷()Z

    goto/16 :goto_0

    .line 3382
    :cond_16
    new-instance v1, Ll/᩵֨ܺ;

    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-direct {v1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3382
    throw v1

    .line 3363
    :cond_17
    new-instance v1, Ll/᩵֨ܺ;

    const-string v2, "Bad transform function encountered in transform list: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-direct {v1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3363
    throw v1

    :cond_18
    :goto_6
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4072683f -> :sswitch_5
        -0x372522a5 -> :sswitch_4
        0x683094a -> :sswitch_3
        0x686bc8e -> :sswitch_2
        0x686bc8f -> :sswitch_1
        0x3ec0f14e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۢ(Ljava/lang/String;)Ll/֨ۚܺ;
    .locals 7

    const-string v0, "url("

    .line 3654
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "currentColor"

    const-string v2, "none"

    sget-object v3, Ll/᩷֡ܺ;->᩶:Ll/᩷֡ܺ;

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    const-string v0, ")"

    .line 3656
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v5, -0x1

    const/4 v6, 0x4

    if-eq v0, v5, :cond_3

    .line 3659
    invoke-virtual {p0, v6, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v0, v0, 0x1

    .line 3662
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 3663
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 3679
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3686
    :try_start_0
    invoke-static {p0}, Ll/ۗ֨ܺ;->ܽ(Ljava/lang/String;)Ll/᩷֡ܺ;

    move-result-object v3
    :try_end_0
    .catch Ll/᩵֨ܺ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v3, v4

    goto :goto_0

    .line 3683
    :cond_0
    invoke-static {}, Ll/ۢ֡ܺ;->֫()Ll/ۢ֡ܺ;

    move-result-object v3

    :cond_1
    :goto_0
    move-object v4, v3

    .line 3665
    :cond_2
    new-instance p0, Ll/᩶֡ܺ;

    invoke-direct {p0, v5, v4}, Ll/᩶֡ܺ;-><init>(Ljava/lang/String;Ll/֨ۚܺ;)V

    return-object p0

    .line 3669
    :cond_3
    invoke-virtual {p0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 3670
    new-instance v0, Ll/᩶֡ܺ;

    invoke-direct {v0, p0, v4}, Ll/᩶֡ܺ;-><init>(Ljava/lang/String;Ll/֨ۚܺ;)V

    return-object v0

    .line 3679
    :cond_4
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 3686
    :try_start_1
    invoke-static {p0}, Ll/ۗ֨ܺ;->ܽ(Ljava/lang/String;)Ll/᩷֡ܺ;

    move-result-object p0
    :try_end_1
    .catch Ll/᩵֨ܺ; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    return-object v4

    .line 3683
    :cond_5
    invoke-static {}, Ll/ۢ֡ܺ;->֫()Ll/ۢ֡ܺ;

    move-result-object p0

    return-object p0

    :cond_6
    return-object v3
.end method

.method public static ۧ(FFF)F
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x40c00000    # 6.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    add-float/2addr p2, v1

    :cond_0
    cmpl-float v0, p2, v1

    if-ltz v0, :cond_1

    sub-float/2addr p2, v1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_2

    .line 3849
    invoke-static {p1, p0, p2, p0}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p0

    return p0

    :cond_2
    const/high16 v0, 0x40400000    # 3.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_3

    return p1

    :cond_3
    const/high16 v0, 0x40800000    # 4.0f

    cmpg-float v1, p2, v0

    if-gez v1, :cond_4

    sub-float/2addr p1, p0

    .line 3851
    invoke-static {v0, p2, p1, p0}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p0

    :cond_4
    return p0
.end method

.method public static ۧ(Ll/᩶֨ܺ;)Ll/֨֡ܺ;
    .locals 1

    const-string v0, "auto"

    .line 4159
    invoke-virtual {p0, v0}, Ll/᩶֨ܺ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4160
    new-instance p0, Ll/֨֡ܺ;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll/֨֡ܺ;-><init>(F)V

    return-object p0

    .line 4162
    :cond_0
    invoke-virtual {p0}, Ll/᩶֨ܺ;->ܿ()Ll/֨֡ܺ;

    move-result-object p0

    return-object p0
.end method

.method private ۧ(Ljava/io/InputStream;)V
    .locals 8

    .line 700
    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    .line 701
    new-instance v1, Ll/ۙ֨ܺ;

    invoke-direct {v1, v0}, Ll/ۙ֨ܺ;-><init>(Lorg/xmlpull/v1/XmlPullParser;)V

    const-string v2, "http://xmlpull.org/v1/doc/features.html#process-docdecl"

    const/4 v3, 0x0

    .line 704
    invoke-interface {v0, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    const-string v2, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v4, 0x1

    .line 705
    invoke-interface {v0, v2, v4}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    const/4 v2, 0x0

    .line 706
    invoke-interface {v0, p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 708
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    :goto_0
    if-eq v2, v4, :cond_b

    if-eqz v2, :cond_9

    const/16 v5, 0x8

    if-eq v2, v5, :cond_8

    const/16 v5, 0xa

    if-eq v2, v5, :cond_7

    const/16 v5, 0x3a

    const/4 v6, 0x2

    if-eq v2, v6, :cond_5

    const/4 v7, 0x3

    if-eq v2, v7, :cond_3

    const/4 v5, 0x4

    if-eq v2, v5, :cond_2

    const/4 v5, 0x5

    if-eq v2, v5, :cond_1

    const/4 v5, 0x6

    if-eq v2, v5, :cond_0

    goto/16 :goto_1

    .line 737
    :cond_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_a

    .line 739
    invoke-direct {p0, v2}, Ll/ۗ֨ܺ;->ܺ(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 733
    :cond_1
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Ll/ۗ֨ܺ;->ܺ(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_2
    new-array v2, v6, [I

    .line 729
    invoke-interface {v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getTextCharacters([I)[C

    move-result-object v5

    .line 730
    aget v6, v2, v3

    aget v2, v2, v4

    invoke-direct {p0, v5, v6, v2}, Ll/ۗ֨ܺ;->֫([CII)V

    goto/16 :goto_1

    .line 722
    :cond_3
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    .line 723
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 724
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 725
    :cond_4
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v5, v6, v2}, Ll/ۗ֨ܺ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 716
    :cond_5
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    .line 717
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 718
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 719
    :cond_6
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v5, v6, v2, v1}, Ll/ۗ֨ܺ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    goto :goto_1

    .line 746
    :cond_7
    iget-object v2, p0, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    .line 747
    invoke-virtual {v2}, Ll/ܽ֨ܺ;->ܿ()Ll/ۢۚܺ;

    move-result-object v2

    if-nez v2, :cond_a

    .line 748
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    const-string v5, "<!ENTITY "

    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v2, :cond_a

    .line 752
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 753
    invoke-direct {p0, p1}, Ll/ۗ֨ܺ;->֫(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_2

    return-void

    .line 765
    :cond_8
    :try_start_2
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 766
    new-instance v2, Ll/᩶֨ܺ;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 767
    invoke-virtual {v2}, Ll/᩶֨ܺ;->᩻()Ljava/lang/String;

    move-result-object v5

    .line 768
    invoke-static {v2}, Ll/ۗ֨ܺ;->ܽ(Ll/᩶֨ܺ;)Ljava/util/HashMap;

    const-string v2, "xml-stylesheet"

    .line 1133
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_1

    .line 894
    :cond_9
    new-instance v2, Ll/ܽ֨ܺ;

    invoke-direct {v2}, Ll/ܽ֨ܺ;-><init>()V

    iput-object v2, p0, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    .line 895
    iput-boolean v3, p0, Ll/ۗ֨ܺ;->᩷:Z

    .line 771
    :cond_a
    :goto_1
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    move-result v2
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_0

    :catch_0
    :cond_b
    return-void

    :catch_1
    move-exception p1

    .line 782
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "Stream error"

    .line 34
    invoke-direct {v0, v1, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 782
    throw v0

    :catch_2
    move-exception p1

    .line 778
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "XML parser problem"

    .line 34
    invoke-direct {v0, v1, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 778
    throw v0
.end method

.method public static ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2943
    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-ge v1, v2, :cond_7

    .line 2945
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 2946
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    .line 2951
    :cond_0
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_3

    const/16 v4, 0x48

    if-eq v3, v4, :cond_2

    .line 2962
    iget-object v2, p0, Ll/᩵ۚܺ;->ܽ:Ll/᩷ۚܺ;

    if-nez v2, :cond_1

    .line 2963
    new-instance v2, Ll/᩷ۚܺ;

    invoke-direct {v2}, Ll/᩷ۚܺ;-><init>()V

    iput-object v2, p0, Ll/᩵ۚܺ;->ܽ:Ll/᩷ۚܺ;

    .line 2964
    :cond_1
    iget-object v2, p0, Ll/᩵ۚܺ;->ܽ:Ll/᩷ۚܺ;

    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ۗ֨ܺ;->֫(Ll/᩷ۚܺ;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 2976
    :cond_2
    invoke-static {p0, v2, v0}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Ljava/lang/String;Z)V

    goto :goto_2

    .line 1302
    :cond_3
    new-instance v3, Ll/ᩴ᩵ܺ;

    invoke-direct {v3, v2}, Ll/ᩴ᩵ܺ;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 1305
    :goto_1
    invoke-virtual {v3}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v4

    if-nez v4, :cond_6

    .line 1307
    invoke-virtual {v3}, Ll/᩶֨ܺ;->᩻()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    if-nez v2, :cond_5

    .line 1311
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1312
    :cond_5
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1313
    invoke-virtual {v3}, Ll/᩶֨ܺ;->ۢ()V

    goto :goto_1

    .line 2958
    :cond_6
    iput-object v2, p0, Ll/᩵ۚܺ;->ᩳ:Ljava/util/ArrayList;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method private ۧ(Lorg/xml/sax/Attributes;)V
    .locals 5

    .line 1213
    new-instance v0, Ll/ۢۚܺ;

    invoke-direct {v0}, Ll/ۢۚܺ;-><init>()V

    .line 1214
    iget-object v1, p0, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    iput-object v1, v0, Ll/ۚۚܺ;->֫:Ll/ܽ֨ܺ;

    .line 1215
    iget-object v1, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    iput-object v1, v0, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    .line 1216
    invoke-static {v0, p1}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1217
    invoke-static {v0, p1}, Ll/ۗ֨ܺ;->ۧ(Ll/᩵ۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1218
    invoke-static {v0, p1}, Ll/ۗ֨ܺ;->֫(Ll/ۡۚܺ;Lorg/xml/sax/Attributes;)V

    .line 1219
    invoke-static {v0, p1}, Ll/ۗ֨ܺ;->֫(Ll/᩸ۚܺ;Lorg/xml/sax/Attributes;)V

    const/4 v1, 0x0

    .line 1232
    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 1234
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 1235
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/16 v4, 0x19

    if-eq v3, v4, :cond_1

    const/16 v4, 0x4f

    if-eq v3, v4, :cond_2

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 1241
    :pswitch_0
    invoke-static {v2}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v2

    iput-object v2, v0, Ll/ۢۚܺ;->֨:Ll/֨֡ܺ;

    goto :goto_1

    .line 1238
    :pswitch_1
    invoke-static {v2}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v2

    iput-object v2, v0, Ll/ۢۚܺ;->ۚ:Ll/֨֡ܺ;

    goto :goto_1

    .line 1244
    :pswitch_2
    invoke-static {v2}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v2

    iput-object v2, v0, Ll/ۢۚܺ;->֡:Ll/֨֡ܺ;

    .line 1245
    invoke-virtual {v2}, Ll/֨֡ܺ;->֫()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 1246
    :cond_0
    new-instance p1, Ll/᩵֨ܺ;

    const-string v0, "Invalid <svg> element. width cannot be negative"

    .line 29
    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1246
    throw p1

    .line 1249
    :cond_1
    invoke-static {v2}, Ll/ۗ֨ܺ;->᩻(Ljava/lang/String;)Ll/֨֡ܺ;

    move-result-object v2

    iput-object v2, v0, Ll/ۢۚܺ;->᩵:Ll/֨֡ܺ;

    .line 1250
    invoke-virtual {v2}, Ll/֨֡ܺ;->֫()Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1251
    :cond_3
    new-instance p1, Ll/᩵֨ܺ;

    const-string v0, "Invalid <svg> element. height cannot be negative"

    .line 29
    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1251
    throw p1

    .line 1221
    :cond_4
    iget-object p1, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    if-nez p1, :cond_5

    .line 1222
    iget-object p1, p0, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    invoke-virtual {p1, v0}, Ll/ܽ֨ܺ;->֫(Ll/ۢۚܺ;)V

    goto :goto_2

    .line 1224
    :cond_5
    invoke-interface {p1, v0}, Ll/ۘۚܺ;->֫(Ll/ۚۚܺ;)V

    .line 1226
    :goto_2
    iput-object v0, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    return-void

    :pswitch_data_0
    .packed-switch 0x51
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 3012
    invoke-static {p0}, Ll/᩸֨ܺ;->֫(Ljava/lang/String;)Ll/᩸֨ܺ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/16 v0, 0xf

    if-eq p0, v0, :cond_0

    const/16 v0, 0x23

    if-eq p0, v0, :cond_0

    const/16 v0, 0x40

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return p0

    :cond_0
    :pswitch_0
    const/4 p0, 0x1

    return p0

    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ܳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "none"

    .line 4510
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "url("

    .line 4512
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    const-string v0, ")"

    .line 4514
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_2

    .line 4515
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 4517
    :cond_2
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ܺ(Ljava/lang/String;)V
    .locals 2

    .line 992
    iget-boolean v0, p0, Ll/ۗ֨ܺ;->ܽ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 995
    :cond_0
    iget-boolean v0, p0, Ll/ۗ֨ܺ;->ᩳ:Z

    if-eqz v0, :cond_2

    .line 997
    iget-object v0, p0, Ll/ۗ֨ܺ;->ܳ:Ljava/lang/StringBuilder;

    if-nez v0, :cond_1

    .line 998
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ll/ۗ֨ܺ;->ܳ:Ljava/lang/StringBuilder;

    .line 999
    :cond_1
    iget-object v0, p0, Ll/ۗ֨ܺ;->ܳ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 1001
    :cond_2
    iget-boolean v0, p0, Ll/ۗ֨ܺ;->ܿ:Z

    if-eqz v0, :cond_4

    .line 1003
    iget-object v0, p0, Ll/ۗ֨ܺ;->ۢ:Ljava/lang/StringBuilder;

    if-nez v0, :cond_3

    .line 1004
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ll/ۗ֨ܺ;->ۢ:Ljava/lang/StringBuilder;

    .line 1005
    :cond_3
    iget-object v0, p0, Ll/ۗ֨ܺ;->ۢ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 1007
    :cond_4
    iget-object v0, p0, Ll/ۗ֨ܺ;->֫:Ll/ۘۚܺ;

    instance-of v0, v0, Ll/ۤۚܺ;

    if-eqz v0, :cond_5

    .line 1009
    invoke-direct {p0, p1}, Ll/ۗ֨ܺ;->֫(Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public static ܽ(Ll/᩶֨ܺ;)Ljava/util/HashMap;
    .locals 5

    .line 1165
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1167
    invoke-virtual {p0}, Ll/᩶֨ܺ;->ۢ()V

    const/4 v1, 0x0

    const/16 v2, 0x3d

    .line 2737
    :goto_0
    invoke-virtual {p0, v1, v2}, Ll/᩶֨ܺ;->֫(ZC)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 1171
    invoke-virtual {p0, v2}, Ll/᩶֨ܺ;->֫(C)Z

    .line 1172
    invoke-virtual {p0}, Ll/᩶֨ܺ;->ܳ()Ljava/lang/String;

    move-result-object v4

    .line 1173
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1175
    invoke-virtual {p0}, Ll/᩶֨ܺ;->ۢ()V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ܽ(Ljava/lang/String;)Ll/᩷֡ܺ;
    .locals 15

    const/4 v0, 0x0

    .line 3699
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x23

    const/4 v2, 0x5

    const/high16 v3, -0x1000000

    const/4 v4, 0x4

    if-ne v0, v1, :cond_b

    .line 3701
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v5, 0x0

    if-lt v1, v0, :cond_0

    goto :goto_3

    :cond_0
    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    :goto_0
    if-ge v8, v0, :cond_4

    .line 127
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x30

    const-wide/16 v11, 0x10

    if-lt v9, v10, :cond_1

    const/16 v10, 0x39

    if-gt v9, v10, :cond_1

    mul-long v6, v6, v11

    add-int/lit8 v9, v9, -0x30

    int-to-long v9, v9

    add-long/2addr v6, v9

    goto :goto_2

    :cond_1
    const-wide/16 v13, 0xa

    const/16 v10, 0x41

    if-lt v9, v10, :cond_2

    const/16 v10, 0x46

    if-gt v9, v10, :cond_2

    mul-long v6, v6, v11

    add-int/lit8 v9, v9, -0x41

    goto :goto_1

    :cond_2
    const/16 v10, 0x61

    if-lt v9, v10, :cond_4

    const/16 v10, 0x66

    if-gt v9, v10, :cond_4

    mul-long v6, v6, v11

    add-int/lit8 v9, v9, -0x61

    :goto_1
    int-to-long v9, v9

    add-long/2addr v6, v9

    add-long/2addr v6, v13

    :goto_2
    const-wide v9, 0xffffffffL

    cmp-long v11, v6, v9

    if-lez v11, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_4
    if-ne v8, v1, :cond_5

    goto :goto_3

    .line 154
    :cond_5
    new-instance v5, Ll/ܰ᩵ܺ;

    invoke-direct {v5, v8, v6, v7}, Ll/ܰ᩵ܺ;-><init>(IJ)V

    :goto_3
    const-string v0, "Bad hex colour value: "

    if-eqz v5, :cond_a

    .line 3705
    invoke-virtual {v5}, Ll/ܰ᩵ܺ;->֫()I

    move-result v1

    if-eq v1, v4, :cond_9

    if-eq v1, v2, :cond_8

    const/4 v2, 0x7

    if-eq v1, v2, :cond_7

    const/16 v2, 0x9

    if-ne v1, v2, :cond_6

    .line 3724
    new-instance p0, Ll/᩷֡ܺ;

    invoke-virtual {v5}, Ll/ܰ᩵ܺ;->ۧ()I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    invoke-virtual {v5}, Ll/ܰ᩵ܺ;->ۧ()I

    move-result v1

    ushr-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-direct {p0, v0}, Ll/᩷֡ܺ;-><init>(I)V

    return-object p0

    .line 3727
    :cond_6
    new-instance v1, Ll/᩵֨ܺ;

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 29
    invoke-direct {v1, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3727
    throw v1

    .line 3722
    :cond_7
    new-instance p0, Ll/᩷֡ܺ;

    invoke-virtual {v5}, Ll/ܰ᩵ܺ;->ۧ()I

    move-result v0

    or-int/2addr v0, v3

    invoke-direct {p0, v0}, Ll/᩷֡ܺ;-><init>(I)V

    return-object p0

    .line 3715
    :cond_8
    invoke-virtual {v5}, Ll/ܰ᩵ܺ;->ۧ()I

    move-result p0

    const v0, 0xf000

    and-int/2addr v0, p0

    and-int/lit16 v1, p0, 0xf00

    and-int/lit16 v2, p0, 0xf0

    and-int/lit8 p0, p0, 0xf

    .line 3720
    new-instance v3, Ll/᩷֡ܺ;

    shl-int/lit8 v5, p0, 0x1c

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v5

    shl-int/lit8 v5, v0, 0x8

    or-int/2addr p0, v5

    shl-int/2addr v0, v4

    or-int/2addr p0, v0

    shl-int/lit8 v0, v1, 0x4

    or-int/2addr p0, v0

    or-int/2addr p0, v1

    or-int/2addr p0, v2

    shr-int/lit8 v0, v2, 0x4

    or-int/2addr p0, v0

    invoke-direct {v3, p0}, Ll/᩷֡ܺ;-><init>(I)V

    return-object v3

    .line 3709
    :cond_9
    invoke-virtual {v5}, Ll/ܰ᩵ܺ;->ۧ()I

    move-result p0

    and-int/lit16 v0, p0, 0xf00

    and-int/lit16 v1, p0, 0xf0

    and-int/lit8 p0, p0, 0xf

    .line 3713
    new-instance v2, Ll/᩷֡ܺ;

    shl-int/lit8 v5, v0, 0xc

    or-int/2addr v3, v5

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v3

    shl-int/lit8 v3, v1, 0x8

    or-int/2addr v0, v3

    shl-int/2addr v1, v4

    or-int/2addr v0, v1

    shl-int/lit8 v1, p0, 0x4

    or-int/2addr v0, v1

    or-int/2addr p0, v0

    invoke-direct {v2, p0}, Ll/᩷֡ܺ;-><init>(I)V

    return-object v2

    .line 3703
    :cond_a
    new-instance v1, Ll/᩵֨ܺ;

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 29
    invoke-direct {v1, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3703
    throw v1

    :cond_b
    const-string v0, "rgba("

    .line 3731
    invoke-static {p0, v0}, Ll/ۗ֨ܺ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x29

    const/high16 v4, 0x43800000    # 256.0f

    const/16 v5, 0x25

    if-nez v0, :cond_16

    const-string v6, "rgb("

    .line 3732
    invoke-static {p0, v6}, Ll/ۗ֨ܺ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_c

    goto/16 :goto_6

    :cond_c
    const-string v0, "hsla("

    .line 3764
    invoke-static {p0, v0}, Ll/ۗ֨ܺ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    const-string v6, "hsl("

    .line 3765
    invoke-static {p0, v6}, Ll/ۗ֨ܺ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_4

    .line 3796
    :cond_d
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 3859
    invoke-static {p0}, Ll/ۚ֨ܺ;->֫(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 3863
    new-instance p0, Ll/᩷֡ܺ;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Ll/᩷֡ܺ;-><init>(I)V

    return-object p0

    .line 3861
    :cond_e
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "Invalid colour keyword: "

    .line 0
    invoke-static {v1, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3861
    throw v0

    .line 3767
    :cond_f
    :goto_4
    new-instance v6, Ll/᩶֨ܺ;

    if-eqz v0, :cond_10

    goto :goto_5

    :cond_10
    const/4 v2, 0x4

    :goto_5
    invoke-direct {v6, p0, v2}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;I)V

    .line 3768
    invoke-virtual {v6}, Ll/᩶֨ܺ;->ۢ()V

    .line 3770
    invoke-virtual {v6}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v2

    .line 3772
    invoke-virtual {v6, v2}, Ll/᩶֨ܺ;->֫(F)F

    move-result v7

    .line 3773
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-nez v8, :cond_11

    .line 3774
    invoke-virtual {v6, v5}, Ll/᩶֨ܺ;->֫(C)Z

    .line 3776
    :cond_11
    invoke-virtual {v6, v7}, Ll/᩶֨ܺ;->֫(F)F

    move-result v8

    .line 3777
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-nez v9, :cond_12

    .line 3778
    invoke-virtual {v6, v5}, Ll/᩶֨ܺ;->֫(C)Z

    :cond_12
    if-eqz v0, :cond_14

    .line 3781
    invoke-virtual {v6, v8}, Ll/᩶֨ܺ;->֫(F)F

    move-result v0

    .line 3782
    invoke-virtual {v6}, Ll/᩶֨ܺ;->ۢ()V

    .line 3783
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_13

    invoke-virtual {v6, v1}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 3785
    new-instance p0, Ll/᩷֡ܺ;

    mul-float v0, v0, v4

    invoke-static {v0}, Ll/ۗ֨ܺ;->֫(F)I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    invoke-static {v2, v7, v8}, Ll/ۗ֨ܺ;->֫(FFF)I

    move-result v1

    or-int/2addr v0, v1

    invoke-direct {p0, v0}, Ll/᩷֡ܺ;-><init>(I)V

    return-object p0

    .line 3784
    :cond_13
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "Bad hsla() colour value: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3784
    throw v0

    .line 3787
    :cond_14
    invoke-virtual {v6}, Ll/᩶֨ܺ;->ۢ()V

    .line 3788
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {v6, v1}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 3790
    new-instance p0, Ll/᩷֡ܺ;

    invoke-static {v2, v7, v8}, Ll/ۗ֨ܺ;->֫(FFF)I

    move-result v0

    or-int/2addr v0, v3

    invoke-direct {p0, v0}, Ll/᩷֡ܺ;-><init>(I)V

    return-object p0

    .line 3789
    :cond_15
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "Bad hsl() colour value: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3789
    throw v0

    .line 3734
    :cond_16
    :goto_6
    new-instance v6, Ll/᩶֨ܺ;

    if-eqz v0, :cond_17

    goto :goto_7

    :cond_17
    const/4 v2, 0x4

    :goto_7
    invoke-direct {v6, p0, v2}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;I)V

    .line 3735
    invoke-virtual {v6}, Ll/᩶֨ܺ;->ۢ()V

    .line 3737
    invoke-virtual {v6}, Ll/᩶֨ܺ;->ᩳ()F

    move-result v2

    .line 3738
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    const/high16 v8, 0x42c80000    # 100.0f

    if-nez v7, :cond_18

    invoke-virtual {v6, v5}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v7

    if-eqz v7, :cond_18

    mul-float v2, v2, v4

    div-float/2addr v2, v8

    .line 3741
    :cond_18
    invoke-virtual {v6, v2}, Ll/᩶֨ܺ;->֫(F)F

    move-result v7

    .line 3742
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-nez v9, :cond_19

    invoke-virtual {v6, v5}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v9

    if-eqz v9, :cond_19

    mul-float v7, v7, v4

    div-float/2addr v7, v8

    .line 3745
    :cond_19
    invoke-virtual {v6, v7}, Ll/᩶֨ܺ;->֫(F)F

    move-result v9

    .line 3746
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v10

    if-nez v10, :cond_1a

    invoke-virtual {v6, v5}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v5

    if-eqz v5, :cond_1a

    mul-float v9, v9, v4

    div-float/2addr v9, v8

    :cond_1a
    if-eqz v0, :cond_1c

    .line 3750
    invoke-virtual {v6, v9}, Ll/᩶֨ܺ;->֫(F)F

    move-result v0

    .line 3751
    invoke-virtual {v6}, Ll/᩶֨ܺ;->ۢ()V

    .line 3752
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_1b

    invoke-virtual {v6, v1}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v1

    if-eqz v1, :cond_1b

    .line 3754
    new-instance p0, Ll/᩷֡ܺ;

    mul-float v0, v0, v4

    invoke-static {v0}, Ll/ۗ֨ܺ;->֫(F)I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    invoke-static {v2}, Ll/ۗ֨ܺ;->֫(F)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-static {v7}, Ll/ۗ֨ܺ;->֫(F)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-static {v9}, Ll/ۗ֨ܺ;->֫(F)I

    move-result v1

    or-int/2addr v0, v1

    invoke-direct {p0, v0}, Ll/᩷֡ܺ;-><init>(I)V

    return-object p0

    .line 3753
    :cond_1b
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "Bad rgba() colour value: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3753
    throw v0

    .line 3756
    :cond_1c
    invoke-virtual {v6}, Ll/᩶֨ܺ;->ۢ()V

    .line 3757
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1d

    invoke-virtual {v6, v1}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 3759
    new-instance p0, Ll/᩷֡ܺ;

    invoke-static {v2}, Ll/ۗ֨ܺ;->֫(F)I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v3

    invoke-static {v7}, Ll/ۗ֨ܺ;->֫(F)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-static {v9}, Ll/ۗ֨ܺ;->֫(F)I

    move-result v1

    or-int/2addr v0, v1

    invoke-direct {p0, v0}, Ll/᩷֡ܺ;-><init>(I)V

    return-object p0

    .line 3758
    :cond_1d
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "Bad rgb() colour value: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3758
    throw v0
.end method

.method public static ܿ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3

    .line 3942
    new-instance v0, Ll/᩶֨ܺ;

    invoke-direct {v0, p0}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x0

    .line 3945
    :cond_0
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ܳ()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const/16 v1, 0x2c

    const/4 v2, 0x1

    .line 2747
    invoke-virtual {v0, v2, v1}, Ll/᩶֨ܺ;->֫(ZC)Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    return-object p0

    :cond_2
    if-nez p0, :cond_3

    .line 3951
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 3952
    :cond_3
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3953
    invoke-virtual {v0}, Ll/᩶֨ܺ;->᩷()Z

    .line 3954
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/String;)F
    .locals 1

    .line 3550
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3553
    invoke-static {v0, p0}, Ll/ۗ֨ܺ;->֫(ILjava/lang/String;)F

    move-result p0

    return p0

    .line 3552
    :cond_0
    new-instance p0, Ll/᩵֨ܺ;

    const-string v0, "Invalid float value (empty string)"

    .line 29
    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3552
    throw p0
.end method

.method public static ᩷(Ljava/lang/String;)Ljava/lang/Float;
    .locals 1

    .line 3574
    :try_start_0
    invoke-static {p0}, Ll/ۗ֨ܺ;->ᩳ(Ljava/lang/String;)F

    move-result p0

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_1

    const/high16 p0, 0x3f800000    # 1.0f

    .line 3575
    :cond_1
    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0
    :try_end_0
    .catch Ll/᩵֨ܺ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ᩻(Ljava/lang/String;)Ll/֨֡ܺ;
    .locals 4

    .line 3487
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    .line 3489
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 3490
    sget-object v1, Ll/۟ۚܺ;->ۨ:Ll/۟ۚܺ;

    add-int/lit8 v2, v0, -0x1

    .line 3491
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x25

    if-ne v2, v3, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 3495
    sget-object v1, Ll/۟ۚܺ;->ۤ:Ll/۟ۚܺ;

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    if-le v0, v3, :cond_1

    .line 3496
    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v2, v0, -0x2

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v0, v0, -0x2

    .line 3498
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 3500
    :try_start_0
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۟ۚܺ;->valueOf(Ljava/lang/String;)Ll/۟ۚܺ;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 3502
    :catch_0
    new-instance v0, Ll/᩵֨ܺ;

    const-string v1, "Invalid length unit specifier: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3502
    throw v0

    .line 3507
    :cond_1
    :goto_0
    :try_start_1
    invoke-static {v0, p0}, Ll/ۗ֨ܺ;->֫(ILjava/lang/String;)F

    move-result v0

    .line 3508
    new-instance v2, Ll/֨֡ܺ;

    invoke-direct {v2, v0, v1}, Ll/֨֡ܺ;-><init>(FLl/۟ۚܺ;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_1
    move-exception v0

    .line 3512
    new-instance v1, Ll/᩵֨ܺ;

    const-string v2, "Invalid length value: "

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 34
    invoke-direct {v1, p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 3512
    throw v1

    .line 3488
    :cond_2
    new-instance p0, Ll/᩵֨ܺ;

    const-string v0, "Invalid length value (empty string)"

    .line 29
    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 3488
    throw p0
.end method


# virtual methods
.method public final ֫(Ljava/io/InputStream;Z)Ll/ܽ֨ܺ;
    .locals 2

    .line 582
    iput-boolean p2, p0, Ll/ۗ֨ܺ;->ۜ:Z

    .line 584
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_0

    .line 586
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p1, v0

    :cond_0
    const/4 v0, 0x3

    .line 590
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    .line 591
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    .line 592
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    const v1, 0x8b1f

    if-ne v0, v1, :cond_1

    .line 595
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v1, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v0

    :catch_0
    :cond_1
    const/16 v0, 0x1000

    .line 607
    :try_start_1
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    .line 612
    invoke-direct {p0, p1}, Ll/ۗ֨ܺ;->ۧ(Ljava/io/InputStream;)V

    if-eqz p2, :cond_3

    .line 613
    iget-boolean p2, p0, Ll/ۗ֨ܺ;->᩷:Z

    if-eqz p2, :cond_2

    goto :goto_0

    .line 614
    :cond_2
    new-instance p2, Ll/᩵֨ܺ;

    const-string v0, "SVG root element is missing"

    .line 29
    invoke-direct {p2, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 614
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 619
    :cond_3
    :goto_0
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 624
    :catch_1
    iget-object p1, p0, Ll/ۗ֨ܺ;->ۡ:Ll/ܽ֨ܺ;

    return-object p1

    :catchall_0
    move-exception p2

    .line 619
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 623
    :catch_2
    throw p2
.end method
