.class public final Ll/֫᩹ۧ;
.super Ljava/lang/Object;
.source "R52G"


# static fields
.field public static final ܳ:[Ljava/lang/Class;

.field public static final ܿ:Ljava/util/HashMap;


# instance fields
.field public final ֫:[Ljava/lang/Object;

.field public final ۧ:Landroid/content/Context;

.field public ܽ:[Ljava/lang/String;

.field public ᩳ:Ll/ܿ᩹ۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Class;

    .line 40
    const-class v1, Landroid/content/Context;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Landroid/util/AttributeSet;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Ll/֫᩹ۧ;->ܳ:[Ljava/lang/Class;

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/֫᩹ۧ;->ܿ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ll/ܿ᩹ۧ;)V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 48
    iput-object v0, p0, Ll/֫᩹ۧ;->֫:[Ljava/lang/Object;

    .line 53
    iput-object p1, p0, Ll/֫᩹ۧ;->ۧ:Landroid/content/Context;

    .line 58
    iput-object p2, p0, Ll/֫᩹ۧ;->ᩳ:Ll/ܿ᩹ۧ;

    .line 62
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-class p2, Ll/֫᩸ۧ;

    .line 64
    invoke-virtual {p2}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Ll/֡᩹ۧ;

    .line 66
    invoke-virtual {v1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object p1

    .line 78
    iput-object p1, p0, Ll/֫᩹ۧ;->ܽ:[Ljava/lang/String;

    return-void
.end method

.method private ֫(Ljava/lang/String;Landroid/util/AttributeSet;)Ll/֫᩸ۧ;
    .locals 3

    const/16 v0, 0x2e

    .line 278
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_0

    .line 270
    iget-object v0, p0, Ll/֫᩹ۧ;->ܽ:[Ljava/lang/String;

    invoke-direct {p0, p1, v0, p2}, Ll/֫᩹ۧ;->֫(Ljava/lang/String;[Ljava/lang/String;Landroid/util/AttributeSet;)Ll/֫᩸ۧ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 281
    invoke-direct {p0, p1, v0, p2}, Ll/֫᩹ۧ;->֫(Ljava/lang/String;[Ljava/lang/String;Landroid/util/AttributeSet;)Ll/֫᩸ۧ;

    move-result-object p1
    :try_end_0
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 297
    new-instance v1, Landroid/view/InflateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": Error inflating class "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 300
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 301
    throw v1

    :catch_1
    move-exception v0

    .line 290
    new-instance v1, Landroid/view/InflateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": Error inflating class (not found)"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 293
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 294
    throw v1

    :catch_2
    move-exception p1

    .line 287
    throw p1
.end method

.method private ֫(Ljava/lang/String;[Ljava/lang/String;Landroid/util/AttributeSet;)Ll/֫᩸ۧ;
    .locals 11

    .line 209
    sget-object v0, Ll/֫᩹ۧ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Constructor;

    const-string v2, ": Error inflating class "

    const/4 v3, 0x1

    if-nez v1, :cond_5

    .line 215
    :try_start_0
    iget-object v1, p0, Ll/֫᩹ۧ;->ۧ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v4, 0x0

    if-eqz p2, :cond_3

    .line 217
    array-length v5, p2

    if-nez v5, :cond_0

    goto :goto_2

    .line 221
    :cond_0
    array-length v5, p2

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v6

    :goto_0
    if-ge v7, v5, :cond_1

    aget-object v9, p2, v7
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 223
    :try_start_1
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v4, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_0
    move-exception v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v6, :cond_4

    if-nez v8, :cond_2

    .line 231
    :try_start_2
    new-instance p2, Landroid/view/InflateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 232
    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 235
    :cond_2
    throw v8

    .line 218
    :cond_3
    :goto_2
    invoke-static {p1, v4, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v6

    .line 239
    :cond_4
    sget-object p2, Ll/֫᩹ۧ;->ܳ:[Ljava/lang/Class;

    invoke-virtual {v6, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 240
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 241
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    :cond_5
    iget-object p2, p0, Ll/֫᩹ۧ;->֫:[Ljava/lang/Object;

    .line 245
    aput-object p3, p2, v3

    .line 246
    invoke-virtual {v1, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֫᩸ۧ;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object p2

    :catch_1
    move-exception p2

    .line 252
    new-instance v0, Landroid/view/InflateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 253
    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 254
    invoke-virtual {v0, p2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 255
    throw v0

    :catch_2
    move-exception p1

    .line 250
    throw p1
.end method

.method private ֫(Lorg/xmlpull/v1/XmlPullParser;Ll/֫᩸ۧ;Landroid/util/AttributeSet;)V
    .locals 8

    .line 312
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    .line 315
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    .line 316
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    if-le v3, v0, :cond_6

    :cond_1
    const/4 v3, 0x1

    if-eq v1, v3, :cond_6

    const/4 v4, 0x2

    if-eq v1, v4, :cond_2

    goto :goto_0

    .line 322
    :cond_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v4, "intent"

    .line 324
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "Error parsing preference"

    iget-object v6, p0, Ll/֫᩹ۧ;->ۧ:Landroid/content/Context;

    if-eqz v4, :cond_3

    .line 328
    :try_start_0
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, p1, p3}, Landroid/content/Intent;->parseIntent(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)Landroid/content/Intent;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 336
    invoke-virtual {p2, v1}, Ll/֫᩸ۧ;->֫(Landroid/content/Intent;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 330
    new-instance p2, Lorg/xmlpull/v1/XmlPullParserException;

    invoke-direct {p2, v5}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 332
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 333
    throw p2

    :cond_3
    const-string v4, "extra"

    .line 337
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 338
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 339
    invoke-virtual {p2}, Ll/֫᩸ۧ;->ۧ()Landroid/os/Bundle;

    move-result-object v6

    .line 338
    invoke-virtual {v1, v4, p3, v6}, Landroid/content/res/Resources;->parseBundleExtra(Ljava/lang/String;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 359
    :try_start_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v1

    .line 362
    :cond_4
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    if-eq v4, v3, :cond_0

    if-ne v4, v2, :cond_4

    .line 364
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    if-gt v4, v1, :cond_4

    goto :goto_0

    :catch_1
    move-exception p1

    .line 343
    new-instance p2, Lorg/xmlpull/v1/XmlPullParserException;

    invoke-direct {p2, v5}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 345
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 346
    throw p2

    .line 349
    :cond_5
    invoke-direct {p0, v1, p3}, Ll/֫᩹ۧ;->֫(Ljava/lang/String;Landroid/util/AttributeSet;)Ll/֫᩸ۧ;

    move-result-object v1

    .line 350
    move-object v2, p2

    check-cast v2, Ll/ۗ᩸ۧ;

    invoke-virtual {v2, v1}, Ll/ۗ᩸ۧ;->֫(Ll/֫᩸ۧ;)V

    .line 351
    invoke-direct {p0, p1, v1, p3}, Ll/֫᩹ۧ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ll/֫᩸ۧ;Landroid/util/AttributeSet;)V

    goto :goto_0

    :cond_6
    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۜ᩹ۧ;)Ll/ۗ᩸ۧ;
    .locals 1

    .line 96
    iget-object v0, p0, Ll/֫᩹ۧ;->ۧ:Landroid/content/Context;

    .line 110
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    .line 112
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ll/֫᩹ۧ;->֫(Landroid/content/res/XmlResourceParser;Ll/ۗ᩸ۧ;)Ll/ۗ᩸ۧ;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 115
    throw p2
.end method

.method public final ֫(Landroid/content/res/XmlResourceParser;Ll/ۗ᩸ۧ;)Ll/ۗ᩸ۧ;
    .locals 5

    .line 137
    iget-object v0, p0, Ll/֫᩹ۧ;->֫:[Ljava/lang/Object;

    monitor-enter v0

    .line 138
    :try_start_0
    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    .line 139
    iget-object v2, p0, Ll/֫᩹ۧ;->֫:[Ljava/lang/Object;

    iget-object v3, p0, Ll/֫᩹ۧ;->ۧ:Landroid/content/Context;

    const/4 v4, 0x0

    aput-object v3, v2, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    :cond_0
    :try_start_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    :cond_1
    if-ne v2, v3, :cond_3

    .line 155
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2, v1}, Ll/֫᩹ۧ;->֫(Ljava/lang/String;Landroid/util/AttributeSet;)Ll/֫᩸ۧ;

    move-result-object v2

    .line 158
    check-cast v2, Ll/ۗ᩸ۧ;

    if-nez p2, :cond_2

    .line 186
    iget-object p2, p0, Ll/֫᩹ۧ;->ᩳ:Ll/ܿ᩹ۧ;

    invoke-virtual {v2, p2}, Ll/֫᩸ۧ;->֫(Ll/ܿ᩹ۧ;)V

    move-object p2, v2

    .line 161
    :cond_2
    invoke-direct {p0, p1, p2, v1}, Ll/֫᩹ۧ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ll/֫᩸ۧ;Landroid/util/AttributeSet;)V
    :try_end_1
    .catch Landroid/view/InflateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p2

    .line 150
    :cond_3
    :try_start_3
    new-instance p2, Landroid/view/InflateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": No start tag found!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catch Landroid/view/InflateException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_0
    move-exception p2

    .line 170
    :try_start_4
    new-instance v1, Landroid/view/InflateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 173
    invoke-virtual {v1, p2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 174
    throw v1

    :catch_1
    move-exception p1

    .line 166
    new-instance p2, Landroid/view/InflateException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 167
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 168
    throw p2

    :catch_2
    move-exception p1

    .line 164
    throw p1

    :catchall_0
    move-exception p1

    .line 178
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method
