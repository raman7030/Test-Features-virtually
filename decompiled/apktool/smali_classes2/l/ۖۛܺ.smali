.class public final Ll/ۖۛܺ;
.super Ljava/lang/Object;
.source "C3Y1"


# instance fields
.field public final ֫:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 1

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 205
    iput-object p1, p0, Ll/ۖۛܺ;->֫:Ljava/lang/reflect/Field;

    const/4 v0, 0x1

    .line 206
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡۬ܺ;I)V
    .locals 1

    .line 219
    :try_start_0
    iget-object v0, p0, Ll/ۖۛܺ;->֫:Ljava/lang/reflect/Field;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 221
    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method

.method public final ֫(Ll/֡۬ܺ;Ljava/io/Serializable;)V
    .locals 1

    .line 211
    :try_start_0
    iget-object v0, p0, Ll/ۖۛܺ;->֫:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 213
    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method
