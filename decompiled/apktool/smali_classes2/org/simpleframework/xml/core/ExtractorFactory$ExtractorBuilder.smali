.class public Lorg/simpleframework/xml/core/ExtractorFactory$ExtractorBuilder;
.super Ljava/lang/Object;
.source "ExtractorFactory.java"


# instance fields
.field public final label:Ljava/lang/Class;

.field public final type:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    iput-object p1, p0, Lorg/simpleframework/xml/core/ExtractorFactory$ExtractorBuilder;->label:Ljava/lang/Class;

    .line 159
    iput-object p2, p0, Lorg/simpleframework/xml/core/ExtractorFactory$ExtractorBuilder;->type:Ljava/lang/Class;

    return-void
.end method

.method public static synthetic access$000(Lorg/simpleframework/xml/core/ExtractorFactory$ExtractorBuilder;)Ljava/lang/reflect/Constructor;
    .locals 0

    .line 137
    invoke-direct {p0}, Lorg/simpleframework/xml/core/ExtractorFactory$ExtractorBuilder;->getConstructor()Ljava/lang/reflect/Constructor;

    move-result-object p0

    return-object p0
.end method

.method private getConstructor()Ljava/lang/reflect/Constructor;
    .locals 5

    .line 170
    iget-object v0, p0, Lorg/simpleframework/xml/core/ExtractorFactory$ExtractorBuilder;->type:Ljava/lang/Class;

    iget-object v1, p0, Lorg/simpleframework/xml/core/ExtractorFactory$ExtractorBuilder;->label:Ljava/lang/Class;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Lorg/simpleframework/xml/core/Contact;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const-class v1, Lorg/simpleframework/xml/stream/Format;

    const/4 v3, 0x2

    aput-object v1, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method
