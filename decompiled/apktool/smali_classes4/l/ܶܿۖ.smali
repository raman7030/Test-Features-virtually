.class public abstract Ll/ܶܿۖ;
.super Ljava/lang/Object;
.source "A87D"


# static fields
.field public static final ֫:Ll/ܶܿۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    const-string v0, "newInstance"

    .line 54
    const-class v1, Ljava/io/ObjectStreamClass;

    const-class v2, Ljava/lang/Class;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    :try_start_0
    const-string v6, "sun.misc.Unsafe"

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const-string v7, "theUnsafe"

    .line 55
    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    .line 56
    invoke-virtual {v7, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 57
    invoke-virtual {v7, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "allocateInstance"

    new-array v9, v5, [Ljava/lang/Class;

    aput-object v2, v9, v3

    .line 58
    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 59
    new-instance v8, Ll/֡ܿۖ;

    invoke-direct {v8, v7, v6}, Ll/֡ܿۖ;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v6, 0x2

    :try_start_1
    const-string v7, "getConstructorId"

    new-array v8, v5, [Ljava/lang/Class;

    aput-object v2, v8, v3

    .line 78
    invoke-virtual {v1, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 79
    invoke-virtual {v7, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v8, v5, [Ljava/lang/Object;

    .line 80
    const-class v9, Ljava/lang/Object;

    aput-object v9, v8, v3

    invoke-virtual {v7, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    new-array v7, v6, [Ljava/lang/Class;

    aput-object v2, v7, v3

    .line 81
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, v5

    .line 82
    invoke-virtual {v1, v0, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 83
    invoke-virtual {v1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 84
    new-instance v8, Ll/ۚܿۖ;

    invoke-direct {v8, v1, v4}, Ll/ۚܿۖ;-><init>(Ljava/lang/reflect/Method;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 102
    :catch_1
    :try_start_2
    const-class v1, Ljava/io/ObjectInputStream;

    new-array v4, v6, [Ljava/lang/Class;

    aput-object v2, v4, v3

    aput-object v2, v4, v5

    .line 103
    invoke-virtual {v1, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 104
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 105
    new-instance v8, Ll/֨ܿۖ;

    invoke-direct {v8, v0}, Ll/֨ܿۖ;-><init>(Ljava/lang/reflect/Method;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    .line 118
    :catch_2
    new-instance v8, Ll/۠ܿۖ;

    .line 30
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 46
    :goto_0
    sput-object v8, Ll/ܶܿۖ;->֫:Ll/ܶܿۖ;

    return-void
.end method


# virtual methods
.method public abstract ֫(Ljava/lang/Class;)Ljava/lang/Object;
.end method
