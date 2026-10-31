.class public final Ll/ۤ۟ۡ;
.super Ll/ᩴ֫ܺ;
.source "JAVC"


# instance fields
.field public ܿ:Ll/᩵֫ܺ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V
    .locals 7

    .line 34
    iget-object v0, p1, Ll/ۨ۟ۡ;->᩸:Ll/᩻֫ܺ;

    iget-object v1, p0, Ll/ۤ۟ۡ;->ܿ:Ll/᩵֫ܺ;

    iget-object v2, p0, Ll/ᩴ֫ܺ;->ᩳ:Ll/ܺۧܺ;

    if-nez v1, :cond_0

    .line 35
    iget-object v1, v2, Ll/ܺۧܺ;->ۗ:Ljava/lang/Class;

    iget-object v3, v2, Ll/ܺۧܺ;->۫:Ljava/lang/reflect/Type;

    invoke-virtual {v0, v1, v3}, Ll/᩻֫ܺ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ll/᩵֫ܺ;

    move-result-object v1

    iput-object v1, p0, Ll/ۤ۟ۡ;->ܿ:Ll/᩵֫ܺ;

    .line 38
    :cond_0
    iget-object v1, v2, Ll/ܺۧܺ;->۫:Ljava/lang/reflect/Type;

    iget-object v3, v2, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    .line 39
    instance-of v4, p3, Ljava/lang/reflect/ParameterizedType;

    if-eqz v4, :cond_1

    .line 46
    iget-object v5, p0, Ll/ᩴ֫ܺ;->֫:Ljava/lang/Class;

    invoke-static {v5, p3, v1}, Ll/ܺۧܺ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ll/᩻֫ܺ;->֫(Ljava/lang/reflect/Type;)Ll/᩵֫ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ۟ۡ;->ܿ:Ll/᩵֫ܺ;

    .line 50
    :cond_1
    instance-of v0, v1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_2

    if-eqz v4, :cond_2

    .line 52
    move-object v0, v1

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 53
    check-cast p3, Ljava/lang/reflect/ParameterizedType;

    .line 55
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v4

    .line 58
    invoke-interface {p3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v5

    .line 59
    instance-of v6, v5, Ljava/lang/Class;

    if-eqz v6, :cond_2

    .line 60
    check-cast v5, Ljava/lang/Class;

    .line 61
    invoke-virtual {v5}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v5

    .line 62
    invoke-interface {p3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {v4, v5, p3}, Ll/᩵ۧܺ;->֫([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 64
    new-instance v1, Ll/ᩴۧܺ;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-direct {v1, v4, p3, v0}, Ll/ᩴۧܺ;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 68
    :cond_2
    iget-object p3, v2, Ll/ܺۧܺ;->ۤ:Ljava/lang/String;

    if-eqz p3, :cond_3

    .line 70
    iget-object v0, p0, Ll/ۤ۟ۡ;->ܿ:Ll/᩵֫ܺ;

    instance-of v0, v0, Ll/᩶֫ܺ;

    if-eqz v0, :cond_3

    .line 71
    invoke-static {p1, v1, p3}, Ll/᩶֫ܺ;->֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    goto :goto_0

    .line 73
    :cond_3
    iget-object p3, p0, Ll/ۤ۟ۡ;->ܿ:Ll/᩵֫ܺ;

    invoke-interface {p3, p1, v1, v3}, Ll/᩵֫ܺ;->֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    .line 75
    :goto_0
    iget v0, p1, Ll/ۨ۟ۡ;->ۨ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 76
    invoke-virtual {p1}, Ll/ۨ۟ۡ;->ܽ()Ll/ۛ۟ۡ;

    move-result-object p2

    .line 77
    iput-object p0, p2, Ll/ۛ۟ۡ;->ۧ:Ll/ᩴ֫ܺ;

    .line 78
    iget-object p3, p1, Ll/ۨ۟ۡ;->᩹:Ll/ܳ֫ܺ;

    iput-object p3, p2, Ll/ۛ۟ۡ;->ܽ:Ll/ܳ֫ܺ;

    const/4 p2, 0x0

    .line 79
    iput p2, p1, Ll/ۨ۟ۡ;->ۨ:I

    return-void

    :cond_4
    if-nez p2, :cond_5

    .line 82
    invoke-interface {p4, v3, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    if-nez p3, :cond_7

    .line 85
    iget-object p1, v2, Ll/ܺۧܺ;->ۗ:Ljava/lang/Class;

    .line 86
    sget-object p4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq p1, p4, :cond_6

    sget-object p4, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq p1, p4, :cond_6

    sget-object p4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq p1, p4, :cond_6

    sget-object p4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p1, p4, :cond_7

    :cond_6
    return-void

    .line 94
    :cond_7
    invoke-virtual {p0, p2, p3}, Ll/ᩴ֫ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
