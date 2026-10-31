.class public final Ll/ۧ֫ܺ;
.super Ljava/lang/Object;
.source "OAUY"


# instance fields
.field public final ֫:Ljava/lang/reflect/Constructor;

.field public final ۜ:I

.field public final ۡ:Ljava/lang/String;

.field public final ۢ:Z

.field public final ۧ:[Ljava/lang/String;

.field public final ܳ:[Ll/ܺۧܺ;

.field public final ܺ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/reflect/Constructor;

.field public final ܿ:Ljava/lang/reflect/Method;

.field public final ᩳ:I

.field public final ᩷:[Ll/ܺۧܺ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;[Ll/ܺۧܺ;[Ll/ܺۧܺ;Ll/۫۟ۡ;[Ljava/lang/String;)V
    .locals 3

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Ll/ۧ֫ܺ;->᩻:Z

    .line 49
    iput-object p2, p0, Ll/ۧ֫ܺ;->ܽ:Ljava/lang/reflect/Constructor;

    .line 50
    iput-object p3, p0, Ll/ۧ֫ܺ;->֫:Ljava/lang/reflect/Constructor;

    .line 51
    iput-object p4, p0, Ll/ۧ֫ܺ;->ܿ:Ljava/lang/reflect/Method;

    .line 52
    iput-object p5, p0, Ll/ۧ֫ܺ;->ܳ:[Ll/ܺۧܺ;

    const/4 p3, 0x0

    if-eqz p8, :cond_0

    .line 55
    array-length v1, p8

    array-length v2, p5

    if-ne v1, v2, :cond_0

    .line 57
    iput-object p3, p0, Ll/ۧ֫ܺ;->ۧ:[Ljava/lang/String;

    goto :goto_0

    .line 59
    :cond_0
    iput-object p8, p0, Ll/ۧ֫ܺ;->ۧ:[Ljava/lang/String;

    :goto_0
    if-eqz p7, :cond_3

    .line 64
    invoke-interface {p7}, Ll/۫۟ۡ;->typeName()Ljava/lang/String;

    move-result-object p8

    .line 65
    invoke-virtual {p8}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p8

    :goto_1
    iput-object p8, p0, Ll/ۧ֫ܺ;->ܺ:Ljava/lang/String;

    .line 67
    invoke-interface {p7}, Ll/۫۟ۡ;->typeKey()Ljava/lang/String;

    move-result-object p1

    .line 68
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p8

    if-lez p8, :cond_2

    move-object p3, p1

    :cond_2
    iput-object p3, p0, Ll/ۧ֫ܺ;->ۡ:Ljava/lang/String;

    .line 70
    invoke-interface {p7}, Ll/۫۟ۡ;->parseFeatures()[Ll/ܰ۟ۡ;

    move-result-object p1

    array-length p3, p1

    const/4 p8, 0x0

    const/4 v1, 0x0

    :goto_2
    if-ge p8, p3, :cond_4

    aget-object v2, p1, p8

    .line 71
    iget v2, v2, Ll/ܰ۟ۡ;->᩸:I

    or-int/2addr v1, v2

    add-int/lit8 p8, p8, 0x1

    goto :goto_2

    .line 74
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ֫ܺ;->ܺ:Ljava/lang/String;

    .line 75
    iput-object p3, p0, Ll/ۧ֫ܺ;->ۡ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 77
    :cond_4
    iget-object p1, p0, Ll/ۧ֫ܺ;->ۡ:Ljava/lang/String;

    if-nez p1, :cond_5

    goto :goto_3

    .line 80
    :cond_5
    invoke-static {p1}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/String;)J

    .line 82
    :goto_3
    iput v1, p0, Ll/ۧ֫ܺ;->ۜ:I

    if-eqz p7, :cond_7

    .line 86
    invoke-interface {p7}, Ll/۫۟ۡ;->parseFeatures()[Ll/ܰ۟ۡ;

    move-result-object p1

    array-length p3, p1

    const/4 p7, 0x0

    const/4 p8, 0x0

    :goto_4
    if-ge p7, p3, :cond_8

    aget-object v1, p1, p7

    .line 87
    sget-object v2, Ll/ܰ۟ۡ;->ᩳ֫:Ll/ܰ۟ۡ;

    if-ne v1, v2, :cond_6

    const/4 p8, 0x1

    :cond_6
    add-int/lit8 p7, p7, 0x1

    goto :goto_4

    :cond_7
    const/4 p8, 0x0

    .line 92
    :cond_8
    iput-boolean p8, p0, Ll/ۧ֫ܺ;->ۢ:Z

    .line 95
    invoke-static {p5, p6}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_5

    :cond_9
    move-object p5, p6

    :goto_5
    iput-object p5, p0, Ll/ۧ֫ܺ;->᩷:[Ll/ܺۧܺ;

    if-eqz p2, :cond_a

    .line 98
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    array-length v0, p1

    goto :goto_6

    :cond_a
    if-eqz p4, :cond_b

    .line 100
    invoke-virtual {p4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    array-length v0, p1

    :cond_b
    :goto_6
    iput v0, p0, Ll/ۧ֫ܺ;->ᩳ:I

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;Ll/ܺۧܺ;)V
    .locals 5

    .line 189
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 190
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۧܺ;

    .line 191
    iget-object v3, v2, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    iget-object v4, p1, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 192
    iget-boolean v2, v2, Ll/ܺۧܺ;->ۛ:Z

    if-eqz v2, :cond_0

    iget-boolean v2, p1, Ll/ܺۧܺ;->ۛ:Z

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    return-void

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 201
    :cond_2
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
