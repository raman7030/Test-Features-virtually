.class public final Ll/ۨ᩹ۚ;
.super Ljava/lang/Object;
.source "197J"


# static fields
.field public static final ֫:J

.field public static final ۧ:J

.field public static final ܳ:Lsun/misc/Unsafe;

.field public static final ܽ:J

.field public static final ܿ:J

.field public static final ᩳ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    .line 45
    const-class v0, Ll/ۤ᩹ۚ;

    .line 63
    :try_start_0
    const-class v1, Lsun/misc/Unsafe;

    const-string v2, "getUnsafe"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsun/misc/Unsafe;

    sput-object v1, Ll/ۨ᩹ۚ;->ܳ:Lsun/misc/Unsafe;

    .line 65
    new-instance v2, Ll/᩹᩹ۚ;

    const-string v4, "java.boot.class.path"

    const-string v5, ""

    .line 15
    invoke-static {v4, v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, ":"

    const/4 v6, 0x2

    .line 17
    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aget-object v4, v4, v5

    .line 21
    invoke-direct {v2, v4, v3}, Ldalvik/system/PathClassLoader;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 66
    invoke-static {}, Ll/ۡܽܳ;->֫()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/᩹᩹ۚ;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 67
    invoke-static {}, Ll/ᩴۖܽ;->֫()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ll/᩹᩹ۚ;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 68
    const-class v6, Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ll/᩹᩹ۚ;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v6, "artMethod"

    .line 69
    invoke-virtual {v4, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    invoke-virtual {v1, v6}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v6

    sput-wide v6, Ll/ۨ᩹ۚ;->ᩳ:J

    const-string v6, "declaringClass"

    .line 70
    invoke-virtual {v4, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v1, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    const-string v4, "artFieldOrMethod"

    .line 71
    invoke-virtual {v5, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v1, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v4

    sput-wide v4, Ll/ۨ᩹ۚ;->ܽ:J
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v4, "fields"

    .line 75
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v1, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v4
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 78
    :catch_0
    :try_start_2
    sget-object v1, Ll/ۨ᩹ۚ;->ܳ:Lsun/misc/Unsafe;

    const-string v4, "iFields"

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v1, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v4

    const-string v6, "sFields"

    .line 79
    invoke-virtual {v2, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    invoke-virtual {v1, v6}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 83
    :goto_0
    sget-object v1, Ll/ۨ᩹ۚ;->ܳ:Lsun/misc/Unsafe;

    const-string v6, "methods"

    invoke-virtual {v2, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v6

    sput-wide v6, Ll/ۨ᩹ۚ;->ܿ:J

    const-string v2, "a"

    .line 84
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const-string v8, "b"

    .line 85
    invoke-virtual {v0, v8, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v8, 0x1

    .line 86
    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 87
    invoke-virtual {v3, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 88
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflect(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    move-result-object v2

    .line 89
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v9

    invoke-virtual {v9, v3}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflect(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    move-result-object v3

    .line 90
    sget-wide v9, Ll/ۨ᩹ۚ;->ܽ:J

    invoke-virtual {v1, v2, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    .line 91
    invoke-virtual {v1, v3, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v2

    .line 92
    invoke-virtual {v1, v0, v6, v7}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    sub-long/2addr v2, v11

    .line 93
    sput-wide v2, Ll/ۨ᩹ۚ;->ۧ:J

    sub-long/2addr v11, v6

    sub-long/2addr v11, v2

    .line 98
    sput-wide v11, Ll/ۨ᩹ۚ;->֫:J

    const-string v2, "i"

    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const-string v3, "j"

    .line 100
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 101
    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 102
    invoke-virtual {v3, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 103
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectGetter(Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;

    move-result-object v2

    .line 104
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectGetter(Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;

    move-result-object v3

    .line 105
    invoke-virtual {v1, v2, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 106
    invoke-virtual {v1, v3, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 107
    invoke-virtual {v1, v0, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J
    :try_end_2
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception v0

    .line 116
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static varargs ֫(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    if-eqz p1, :cond_1

    .line 163
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 164
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "this object is not an instance of the given class"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Class;

    .line 166
    const-class v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Ll/۬᩹ۚ;

    const-string v3, "invoke"

    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 167
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 168
    sget-object v0, Ll/ۨ᩹ۚ;->ܳ:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ۨ᩹ۚ;->ܿ:J

    invoke-virtual {v0, p0, v2, v3}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    const-string p0, "Cannot find matching method"

    cmp-long v6, v2, v4

    if-eqz v6, :cond_f

    .line 170
    invoke-virtual {v0, v2, v3}, Lsun/misc/Unsafe;->getInt(J)I

    move-result v0

    const/4 v4, 0x0

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v0, :cond_e

    int-to-long v4, v10

    .line 173
    sget-wide v6, Ll/ۨ᩹ۚ;->ۧ:J

    mul-long v4, v4, v6

    add-long/2addr v4, v2

    sget-wide v6, Ll/ۨ᩹ۚ;->֫:J

    add-long v8, v6, v4

    .line 174
    sget-object v4, Ll/ۨ᩹ۚ;->ܳ:Lsun/misc/Unsafe;

    sget-wide v6, Ll/ۨ᩹ۚ;->ᩳ:J

    move-object v5, v1

    invoke-virtual/range {v4 .. v9}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 177
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    .line 178
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    .line 179
    sget-object v5, Ll/ۛ᩹ۚ;->֫:Ljava/util/HashSet;

    .line 28
    array-length v5, v4

    array-length v6, p3

    if-eq v5, v6, :cond_2

    goto/16 :goto_3

    :cond_2
    const/4 v5, 0x0

    .line 29
    :goto_2
    array-length v6, v4

    if-ge v5, v6, :cond_c

    .line 30
    aget-object v6, v4, v5

    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    move-result v6

    if-eqz v6, :cond_a

    .line 31
    aget-object v6, v4, v5

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v6, v7, :cond_3

    aget-object v7, p3, v5

    instance-of v7, v7, Ljava/lang/Integer;

    if-nez v7, :cond_3

    goto/16 :goto_3

    .line 32
    :cond_3
    sget-object v7, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v6, v7, :cond_4

    aget-object v7, p3, v5

    instance-of v7, v7, Ljava/lang/Byte;

    if-nez v7, :cond_4

    goto :goto_3

    .line 33
    :cond_4
    sget-object v7, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v6, v7, :cond_5

    aget-object v7, p3, v5

    instance-of v7, v7, Ljava/lang/Character;

    if-nez v7, :cond_5

    goto :goto_3

    .line 34
    :cond_5
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v6, v7, :cond_6

    aget-object v7, p3, v5

    instance-of v7, v7, Ljava/lang/Boolean;

    if-nez v7, :cond_6

    goto :goto_3

    .line 35
    :cond_6
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v6, v7, :cond_7

    aget-object v7, p3, v5

    instance-of v7, v7, Ljava/lang/Double;

    if-nez v7, :cond_7

    goto :goto_3

    .line 36
    :cond_7
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v6, v7, :cond_8

    aget-object v7, p3, v5

    instance-of v7, v7, Ljava/lang/Float;

    if-nez v7, :cond_8

    goto :goto_3

    .line 37
    :cond_8
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v6, v7, :cond_9

    aget-object v7, p3, v5

    instance-of v7, v7, Ljava/lang/Long;

    if-nez v7, :cond_9

    goto :goto_3

    .line 38
    :cond_9
    sget-object v7, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v6, v7, :cond_b

    aget-object v6, p3, v5

    instance-of v6, v6, Ljava/lang/Short;

    if-nez v6, :cond_b

    goto :goto_3

    .line 39
    :cond_a
    aget-object v6, p3, v5

    if-eqz v6, :cond_b

    aget-object v7, v4, v5

    invoke-virtual {v7, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    goto :goto_3

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 180
    :cond_c
    invoke-virtual {v1, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_d
    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    .line 183
    :cond_e
    new-instance p1, Ljava/lang/NoSuchMethodException;

    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 169
    :cond_f
    new-instance p1, Ljava/lang/NoSuchMethodException;

    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static varargs ֫([Ljava/lang/String;)V
    .locals 1

    .line 369
    sget-object v0, Ll/ۛ᩹ۚ;->֫:Ljava/util/HashSet;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 370
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    .line 371
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 372
    invoke-static {p0}, Ll/ۨ᩹ۚ;->ۧ([Ljava/lang/String;)Z

    return-void
.end method

.method public static varargs ۧ([Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x0

    .line 351
    :try_start_0
    const-class v1, Ldalvik/system/VMRuntime;

    const-string v2, "getRuntime"

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Ll/ۨ᩹ۚ;->֫(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 352
    const-class v2, Ldalvik/system/VMRuntime;

    const-string v3, "setHiddenApiExemptions"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    aput-object p0, v5, v0

    invoke-static {v2, v1, v3, v5}, Ll/ۨ᩹ۚ;->֫(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return v4

    :catch_0
    return v0
.end method
