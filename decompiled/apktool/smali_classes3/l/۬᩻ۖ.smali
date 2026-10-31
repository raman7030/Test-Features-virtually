.class public final Ll/۬᩻ۖ;
.super Ljava/lang/Object;
.source "G883"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ll/᩶᩻ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    :try_start_0
    new-instance v0, Ll/ۗ᩻ۖ;

    invoke-direct {v0}, Ll/ۗ᩻ۖ;-><init>()V
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 39
    :catch_0
    new-instance v0, Ll/ۙ᩻ۖ;

    .line 223
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    :goto_0
    sput-object v0, Ll/۬᩻ۖ;->ۧ:Ll/᩶᩻ۖ;

    return-void
.end method

.method public static ֫(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 2

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "java.lang.reflect.InaccessibleObjectException"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "to module com.google.gson"

    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "reflection-inaccessible-to-module-gson"

    goto :goto_0

    :cond_0
    const-string p0, "reflection-inaccessible"

    .line 54
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\nSee "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, ""

    return-object p0
.end method

.method public static ֫(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;
    .locals 4

    .line 93
    instance-of v0, p0, Ljava/lang/reflect/Field;

    const-string v1, "\'"

    if-eqz v0, :cond_0

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "field \'"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/reflect/Field;

    invoke-static {p0}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 95
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    .line 96
    check-cast p0, Ljava/lang/reflect/Method;

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    invoke-static {p0, v0}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/AccessibleObject;Ljava/lang/StringBuilder;)V

    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 102
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "method \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "#"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 103
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/Constructor;

    if-eqz v0, :cond_2

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "constructor \'"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/reflect/Constructor;

    invoke-static {p0}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 106
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<unknown AccessibleObject> "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    if-eqz p1, :cond_3

    const/4 p1, 0x0

    .line 109
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_3
    return-object p0
.end method

.method public static ֫(Ljava/lang/reflect/Constructor;)Ljava/lang/String;
    .locals 2

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    invoke-static {p0, v0}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/AccessibleObject;Ljava/lang/StringBuilder;)V

    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/reflect/Field;)Ljava/lang/String;
    .locals 2

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    .locals 1

    .line 196
    sget-object v0, Ll/۬᩻ۖ;->ۧ:Ll/᩶᩻ۖ;

    invoke-virtual {v0, p0}, Ll/᩶᩻ۖ;->֫(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;
    .locals 1

    .line 192
    sget-object v0, Ll/۬᩻ۖ;->ۧ:Ll/᩶᩻ۖ;

    invoke-virtual {v0, p0, p1}, Ll/᩶᩻ۖ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/reflect/AccessibleObject;)V
    .locals 4

    const/4 v0, 0x1

    .line 68
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 70
    invoke-static {p0, v1}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p0

    .line 71
    new-instance v1, Ll/ܰܽۖ;

    const-string v2, "Failed making "

    const-string v3, " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."

    .line 0
    invoke-static {v2, p0, v3}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 76
    invoke-static {v0}, Ll/۬᩻ۖ;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 52
    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    throw v1
.end method

.method public static ֫(Ljava/lang/reflect/AccessibleObject;Ljava/lang/StringBuilder;)V
    .locals 2

    const/16 v0, 0x28

    .line 135
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 138
    instance-of v0, p0, Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    .line 139
    check-cast p0, Ljava/lang/reflect/Method;

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    .line 140
    :cond_0
    check-cast p0, Ljava/lang/reflect/Constructor;

    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p0

    :goto_0
    const/4 v0, 0x0

    .line 141
    :goto_1
    array-length v1, p0

    if-ge v0, v1, :cond_2

    if-lez v0, :cond_1

    const-string v1, ", "

    .line 143
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    :cond_1
    aget-object v1, p0, v0

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    const/16 p0, 0x29

    .line 148
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ۧ(Ljava/lang/reflect/Constructor;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    .line 168
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x0

    return-object p0

    :catch_0
    move-exception v0

    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed making constructor \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    invoke-static {p0}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    invoke-static {v0}, Ll/۬᩻ۖ;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/Class;)[Ljava/lang/String;
    .locals 1

    .line 187
    sget-object v0, Ll/۬᩻ۖ;->ۧ:Ll/᩶᩻ۖ;

    invoke-virtual {v0, p0}, Ll/᩶᩻ۖ;->ۧ(Ljava/lang/Class;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/Class;)Z
    .locals 1

    .line 183
    sget-object v0, Ll/۬᩻ۖ;->ۧ:Ll/᩶᩻ۖ;

    invoke-virtual {v0, p0}, Ll/᩶᩻ۖ;->ܽ(Ljava/lang/Class;)Z

    move-result p0

    return p0
.end method
