.class public final Ll/֨ۡۧ;
.super Ljava/lang/Object;
.source "P8HP"


# static fields
.field public static final ֫:[Ljava/lang/String;

.field public static final ۧ:[Ljava/lang/String;

.field public static final ܽ:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "Camera:MicroVideo"

    const-string v1, "GCamera:MicroVideo"

    const-string v2, "Camera:MotionPhoto"

    const-string v3, "GCamera:MotionPhoto"

    .line 60
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/֨ۡۧ;->ܽ:[Ljava/lang/String;

    const-string v0, "Camera:MicroVideoPresentationTimestampUs"

    const-string v1, "GCamera:MicroVideoPresentationTimestampUs"

    const-string v2, "Camera:MotionPhotoPresentationTimestampUs"

    const-string v3, "GCamera:MotionPhotoPresentationTimestampUs"

    .line 67
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/֨ۡۧ;->ۧ:[Ljava/lang/String;

    const-string v0, "Camera:MicroVideoOffset"

    const-string v1, "GCamera:MicroVideoOffset"

    .line 74
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/֨ۡۧ;->֫:[Ljava/lang/String;

    return-void
.end method

.method public static ֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ll/ܳ۬ܺ;
    .locals 12

    .line 163
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    const-string v1, ":Item"

    .line 164
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ":Directory"

    .line 165
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 167
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 168
    invoke-static {p0, v1}, Ll/ᩴ֨֫;->ܽ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v2, ":Mime"

    .line 169
    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ":Semantic"

    .line 170
    invoke-virtual {p2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ":Length"

    .line 171
    invoke-virtual {p2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, ":Padding"

    .line 172
    invoke-virtual {p2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 173
    invoke-static {p0, v2}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 174
    invoke-static {p0, v3}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 175
    invoke-static {p0, v4}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 176
    invoke-static {p0, v5}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v7, :cond_4

    if-nez v2, :cond_1

    goto :goto_2

    .line 181
    :cond_1
    new-instance v2, Ll/ۘۡۧ;

    const-wide/16 v5, 0x0

    if-eqz v3, :cond_2

    .line 185
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    goto :goto_0

    :cond_2
    move-wide v8, v5

    :goto_0
    if-eqz v4, :cond_3

    .line 186
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    move-wide v10, v3

    goto :goto_1

    :cond_3
    move-wide v10, v5

    :goto_1
    move-object v6, v2

    invoke-direct/range {v6 .. v11}, Ll/ۘۡۧ;-><init>(Ljava/lang/String;JJ)V

    .line 181
    invoke-virtual {v0, v2}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    goto :goto_3

    .line 179
    :cond_4
    :goto_2
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0

    .line 188
    :cond_5
    :goto_3
    invoke-static {p0, p1}, Ll/ᩴ֨֫;->ۧ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 189
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ᩴۡۧ;
    .locals 0

    .line 51
    :try_start_0
    invoke-static {p0}, Ll/֨ۡۧ;->ۧ(Ljava/lang/String;)Ll/ᩴۡۧ;

    move-result-object p0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/ۡ᩵֫; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, "Ignoring unexpected XMP metadata"

    .line 53
    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ᩴۡۧ;
    .locals 19

    .line 83
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    .line 85
    new-instance v1, Ljava/io/StringReader;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 86
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const-string v1, "x:xmpmeta"

    .line 87
    invoke-static {v0, v1}, Ll/ᩴ֨֫;->ܽ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_c

    .line 92
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v6, v4

    .line 94
    :cond_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const-string v8, "rdf:Description"

    .line 95
    invoke-static {v0, v8}, Ll/ᩴ֨֫;->ܽ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/4 v2, 0x0

    const/4 v6, 0x0

    :goto_0
    const/4 v7, 0x4

    if-ge v6, v7, :cond_a

    .line 117
    sget-object v8, Ll/֨ۡۧ;->ܽ:[Ljava/lang/String;

    aget-object v8, v8, v6

    .line 118
    invoke-static {v0, v8}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_6

    .line 120
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    const/4 v8, 0x1

    if-ne v6, v8, :cond_a

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v7, :cond_2

    .line 128
    sget-object v8, Ll/֨ۡۧ;->ۧ:[Ljava/lang/String;

    aget-object v8, v8, v6

    .line 129
    invoke-static {v0, v8}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 131
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v10, v6, v8

    if-nez v10, :cond_3

    goto :goto_2

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    move-wide v6, v4

    :cond_3
    :goto_3
    const/4 v8, 0x2

    if-ge v2, v8, :cond_5

    .line 142
    sget-object v8, Ll/֨ۡۧ;->֫:[Ljava/lang/String;

    aget-object v8, v8, v2

    .line 143
    invoke-static {v0, v8}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_4

    .line 145
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    .line 146
    new-instance v2, Ll/ۘۡۧ;

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-string v14, "image/jpeg"

    move-object v13, v2

    invoke-direct/range {v13 .. v18}, Ll/ۘۡۧ;-><init>(Ljava/lang/String;JJ)V

    new-instance v8, Ll/ۘۡۧ;

    const-string v10, "video/mp4"

    const-wide/16 v13, 0x0

    move-object v9, v8

    invoke-direct/range {v9 .. v14}, Ll/ۘۡۧ;-><init>(Ljava/lang/String;JJ)V

    invoke-static {v2, v8}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v2

    goto :goto_4

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 156
    :cond_5
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v2

    goto :goto_4

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_7
    const-string v8, "Container:Directory"

    .line 103
    invoke-static {v0, v8}, Ll/ᩴ֨֫;->ܽ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_8

    const-string v2, "Container"

    const-string v8, "Item"

    .line 104
    invoke-static {v0, v2, v8}, Ll/֨ۡۧ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ll/ܳ۬ܺ;

    move-result-object v2

    goto :goto_4

    :cond_8
    const-string v8, "GContainer:Directory"

    .line 105
    invoke-static {v0, v8}, Ll/ᩴ֨֫;->ܽ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_9

    const-string v2, "GContainer"

    const-string v8, "GContainerItem"

    .line 106
    invoke-static {v0, v2, v8}, Ll/֨ۡۧ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ll/ܳ۬ܺ;

    move-result-object v2

    .line 108
    :cond_9
    :goto_4
    invoke-static {v0, v1}, Ll/ᩴ֨֫;->ۧ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 109
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_a
    return-object v3

    .line 113
    :cond_b
    new-instance v0, Ll/ᩴۡۧ;

    invoke-direct {v0, v6, v7, v2}, Ll/ᩴۡۧ;-><init>(JLjava/util/List;)V

    return-object v0

    :cond_c
    const-string v0, "Couldn\'t find xmp metadata"

    .line 88
    invoke-static {v0, v3}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0
.end method
