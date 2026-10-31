.class public Ll/ܽۜۖ;
.super Ljava/lang/Object;
.source "O2OG"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/Class;

.field public final ܽ:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 97
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    const-class v2, Ll/ܽۜۖ;

    if-eqz v1, :cond_1

    .line 98
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 99
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v1

    if-ne v1, v2, :cond_2

    .line 100
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Ll/ۛᩳۖ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "gson.allowCapturingTypeVariables"

    .line 88
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "true"

    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 103
    invoke-static {v0}, Ll/ܽۜۖ;->ۧ(Ljava/lang/reflect/Type;)V

    .line 74
    :cond_0
    iput-object v0, p0, Ll/ܽۜۖ;->ܽ:Ljava/lang/reflect/Type;

    .line 75
    invoke-static {v0}, Ll/ۛᩳۖ;->ܽ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Ll/ܽۜۖ;->ۧ:Ljava/lang/Class;

    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iput v0, p0, Ll/ܽۜۖ;->֫:I

    return-void

    :cond_1
    if-ne v0, v2, :cond_2

    .line 110
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "type-token-raw"

    const-string v3, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 8
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 118
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must only create direct subclasses of TypeToken"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/reflect/Type;

    invoke-static {p1}, Ll/ۛᩳۖ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۜۖ;->ܽ:Ljava/lang/reflect/Type;

    .line 83
    invoke-static {p1}, Ll/ۛᩳۖ;->ܽ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۜۖ;->ۧ:Ljava/lang/Class;

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iput p1, p0, Ll/ܽۜۖ;->֫:I

    return-void
.end method

.method public static ֫(Ljava/lang/Class;)Ll/ܽۜۖ;
    .locals 1

    .line 361
    new-instance v0, Ll/ܽۜۖ;

    invoke-direct {v0, p0}, Ll/ܽۜۖ;-><init>(Ljava/lang/reflect/Type;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/reflect/Type;)Ll/ܽۜۖ;
    .locals 1

    .line 356
    new-instance v0, Ll/ܽۜۖ;

    invoke-direct {v0, p0}, Ll/ܽۜۖ;-><init>(Ljava/lang/reflect/Type;)V

    return-object v0
.end method

.method public static ۧ(Ljava/lang/reflect/Type;)V
    .locals 5

    .line 122
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-nez v0, :cond_7

    .line 131
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_0

    .line 132
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Ll/ܽۜۖ;->ۧ(Ljava/lang/reflect/Type;)V

    return-void

    .line 133
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 134
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 135
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 137
    invoke-static {v0}, Ll/ܽۜۖ;->ۧ(Ljava/lang/reflect/Type;)V

    .line 140
    :cond_1
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    array-length v0, p0

    :goto_0
    if-ge v1, v0, :cond_4

    aget-object v2, p0, v1

    .line 141
    invoke-static {v2}, Ll/ܽۜۖ;->ۧ(Ljava/lang/reflect/Type;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 143
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_5

    .line 144
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 145
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_3

    aget-object v4, v0, v3

    .line 146
    invoke-static {v4}, Ll/ܽۜۖ;->ۧ(Ljava/lang/reflect/Type;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 148
    :cond_3
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    array-length v0, p0

    :goto_2
    if-ge v1, v0, :cond_4

    aget-object v2, p0, v1

    .line 149
    :try_start_0
    invoke-static {v2}, Ll/ܽۜۖ;->ۧ(Ljava/lang/reflect/Type;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :catchall_0
    move-exception p0

    throw p0

    :cond_4
    return-void

    :cond_5
    if-eqz p0, :cond_6

    return-void

    .line 155
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "TypeToken captured `null` as type argument; probably a compiler / runtime bug"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 123
    :cond_7
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 124
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TypeToken type argument must not contain a type variable; captured type variable "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " declared by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\nSee "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "typetoken-type-variable"

    const-string v2, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 8
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 130
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 346
    instance-of v0, p1, Ll/ܽۜۖ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܽۜۖ;

    iget-object p1, p1, Ll/ܽۜۖ;->ܽ:Ljava/lang/reflect/Type;

    iget-object v0, p0, Ll/ܽۜۖ;->ܽ:Ljava/lang/reflect/Type;

    invoke-static {v0, p1}, Ll/ۛᩳۖ;->֫(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 341
    iget v0, p0, Ll/ܽۜۖ;->֫:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 351
    iget-object v0, p0, Ll/ܽۜۖ;->ܽ:Ljava/lang/reflect/Type;

    invoke-static {v0}, Ll/ۛᩳۖ;->ᩳ(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/Class;
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ܽۜۖ;->ۧ:Ljava/lang/Class;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/reflect/Type;
    .locals 1

    .line 167
    iget-object v0, p0, Ll/ܽۜۖ;->ܽ:Ljava/lang/reflect/Type;

    return-object v0
.end method
