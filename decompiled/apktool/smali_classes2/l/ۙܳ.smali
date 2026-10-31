.class public final Ll/ۙܳ;
.super Ljava/lang/Object;
.source "P4V3"


# static fields
.field public static ֫:Ljava/lang/reflect/Field;

.field public static ۜ:Z

.field public static ۧ:Z

.field public static ܳ:Z

.field public static ܽ:Ljava/lang/reflect/Field;

.field public static ܿ:Ljava/lang/Class;

.field public static ᩳ:Z

.field public static ᩻:Ljava/lang/reflect/Field;


# direct methods
.method public static ֫(Landroid/content/res/Resources;)V
    .locals 6

    .line 46
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const/16 v1, 0x18

    const-string v2, "mDrawableCache"

    .line 49
    const-class v3, Landroid/content/res/Resources;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-lt v0, v1, :cond_6

    .line 113
    sget-boolean v0, Ll/ۙܳ;->ᩳ:Z

    if-nez v0, :cond_1

    :try_start_0
    const-string v0, "mResourcesImpl"

    .line 115
    invoke-virtual {v3, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll/ۙܳ;->ܽ:Ljava/lang/reflect/Field;

    .line 116
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    :catch_0
    sput-boolean v4, Ll/ۙܳ;->ᩳ:Z

    .line 123
    :cond_1
    sget-object v0, Ll/ۙܳ;->ܽ:Ljava/lang/reflect/Field;

    if-nez v0, :cond_2

    goto/16 :goto_4

    .line 130
    :cond_2
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-object p0, v5

    :goto_0
    if-nez p0, :cond_3

    goto/16 :goto_4

    .line 140
    :cond_3
    sget-boolean v0, Ll/ۙܳ;->ۧ:Z

    if-nez v0, :cond_4

    .line 142
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll/ۙܳ;->֫:Ljava/lang/reflect/Field;

    .line 143
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    .line 147
    :catch_2
    sput-boolean v4, Ll/ۙܳ;->ۧ:Z

    .line 151
    :cond_4
    sget-object v0, Ll/ۙܳ;->֫:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_5

    .line 153
    :try_start_3
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_1

    :catch_3
    nop

    :cond_5
    :goto_1
    if-eqz v5, :cond_c

    .line 160
    invoke-static {v5}, Ll/ۙܳ;->֫(Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    const/16 v1, 0x17

    if-lt v0, v1, :cond_a

    .line 84
    sget-boolean v0, Ll/ۙܳ;->ۧ:Z

    if-nez v0, :cond_7

    .line 86
    :try_start_4
    invoke-virtual {v3, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll/ۙܳ;->֫:Ljava/lang/reflect/Field;

    .line 87
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_4

    .line 91
    :catch_4
    sput-boolean v4, Ll/ۙܳ;->ۧ:Z

    .line 95
    :cond_7
    sget-object v0, Ll/ۙܳ;->֫:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_8

    .line 97
    :try_start_5
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_2

    :catch_5
    nop

    :cond_8
    :goto_2
    if-nez v5, :cond_9

    goto :goto_4

    .line 108
    :cond_9
    invoke-static {v5}, Ll/ۙܳ;->֫(Ljava/lang/Object;)V

    goto :goto_4

    .line 60
    :cond_a
    sget-boolean v0, Ll/ۙܳ;->ۧ:Z

    if-nez v0, :cond_b

    .line 62
    :try_start_6
    invoke-virtual {v3, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll/ۙܳ;->֫:Ljava/lang/reflect/Field;

    .line 63
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_6

    .line 67
    :catch_6
    sput-boolean v4, Ll/ۙܳ;->ۧ:Z

    .line 69
    :cond_b
    sget-object v0, Ll/ۙܳ;->֫:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_c

    .line 72
    :try_start_7
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_7

    move-object v5, p0

    goto :goto_3

    :catch_7
    nop

    :goto_3
    if-eqz v5, :cond_c

    .line 77
    invoke-interface {v5}, Ljava/util/Map;->clear()V

    :cond_c
    :goto_4
    return-void
.end method

.method public static ֫(Ljava/lang/Object;)V
    .locals 3

    .line 165
    sget-boolean v0, Ll/ۙܳ;->ܳ:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "android.content.res.ThemedResourceCache"

    .line 167
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Ll/ۙܳ;->ܿ:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    :catch_0
    sput-boolean v1, Ll/ۙܳ;->ܳ:Z

    .line 174
    :cond_0
    sget-object v0, Ll/ۙܳ;->ܿ:Ljava/lang/Class;

    if-nez v0, :cond_1

    goto :goto_1

    .line 179
    :cond_1
    sget-boolean v2, Ll/ۙܳ;->ۜ:Z

    if-nez v2, :cond_2

    :try_start_1
    const-string v2, "mUnthemedEntries"

    .line 182
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll/ۙܳ;->᩻:Ljava/lang/reflect/Field;

    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 187
    :catch_1
    sput-boolean v1, Ll/ۙܳ;->ۜ:Z

    .line 190
    :cond_2
    sget-object v0, Ll/ۙܳ;->᩻:Ljava/lang/reflect/Field;

    if-nez v0, :cond_3

    goto :goto_1

    .line 198
    :cond_3
    :try_start_2
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/LongSparseArray;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    :catch_2
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_4

    .line 204
    invoke-virtual {p0}, Landroid/util/LongSparseArray;->clear()V

    :cond_4
    :goto_1
    return-void
.end method
