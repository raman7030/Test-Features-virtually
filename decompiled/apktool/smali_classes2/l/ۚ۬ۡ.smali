.class public final Ll/ۚ۬ۡ;
.super Ljava/lang/Object;
.source "79CQ"


# instance fields
.field public ֫:I

.field public ۜ:I

.field public ۧ:Ljava/lang/reflect/Field;

.field public ܳ:I

.field public ܽ:I

.field public ܿ:Ljava/lang/reflect/Method;

.field public final ᩳ:Ljava/lang/Object;

.field public ᩷:Ljava/lang/reflect/Field;

.field public ᩻:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 5

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ۚ۬ۡ;->ᩳ:Ljava/lang/Object;

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "contentInsets"

    .line 56
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    iput-object v1, p0, Ll/ۚ۬ۡ;->ۧ:Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 58
    :catch_0
    iput-object v0, p0, Ll/ۚ۬ۡ;->ۧ:Ljava/lang/reflect/Field;

    :goto_0
    :try_start_1
    const-string v1, "visibleInsets"

    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    iput-object v1, p0, Ll/ۚ۬ۡ;->᩷:Ljava/lang/reflect/Field;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 63
    :catch_1
    iput-object v0, p0, Ll/ۚ۬ۡ;->᩷:Ljava/lang/reflect/Field;

    :goto_1
    :try_start_2
    const-string v1, "touchableRegion"

    .line 66
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    iput-object v1, p0, Ll/ۚ۬ۡ;->᩻:Ljava/lang/reflect/Field;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    .line 68
    :catch_2
    iput-object v0, p0, Ll/ۚ۬ۡ;->᩻:Ljava/lang/reflect/Field;

    :goto_2
    :try_start_3
    const-string v1, "TOUCHABLE_INSETS_FRAME"

    .line 71
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Ll/ۚ۬ۡ;->ܽ:I

    const-string v1, "TOUCHABLE_INSETS_CONTENT"

    .line 72
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Ll/ۚ۬ۡ;->֫:I

    const-string v1, "TOUCHABLE_INSETS_VISIBLE"

    .line 73
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Ll/ۚ۬ۡ;->ۜ:I

    const-string v1, "TOUCHABLE_INSETS_REGION"

    .line 74
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Ll/ۚ۬ۡ;->ܳ:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    const-string v1, "setTouchableInsets"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    .line 79
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 80
    invoke-virtual {p1, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ۚ۬ۡ;->ܿ:Ljava/lang/reflect/Method;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_3

    .line 82
    :catch_4
    iput-object v0, p0, Ll/ۚ۬ۡ;->ܿ:Ljava/lang/reflect/Method;

    :goto_3
    return-void
.end method


# virtual methods
.method public final ֫()Landroid/graphics/Rect;
    .locals 2

    .line 92
    iget-object v0, p0, Ll/ۚ۬ۡ;->ۧ:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_0

    .line 95
    :try_start_0
    iget-object v1, p0, Ll/ۚ۬ۡ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 97
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 93
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ۧ()Landroid/graphics/Region;
    .locals 2

    .line 123
    iget-object v0, p0, Ll/ۚ۬ۡ;->᩻:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_0

    .line 126
    :try_start_0
    iget-object v1, p0, Ll/ۚ۬ۡ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Region;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 128
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 124
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ܽ()Landroid/graphics/Rect;
    .locals 2

    .line 107
    iget-object v0, p0, Ll/ۚ۬ۡ;->᩷:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_0

    .line 110
    :try_start_0
    iget-object v1, p0, Ll/ۚ۬ۡ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 112
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 108
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ᩳ()V
    .locals 5

    .line 140
    iget-object v0, p0, Ll/ۚ۬ۡ;->ܿ:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    iget v1, p0, Ll/ۚ۬ۡ;->ܳ:I

    iget v2, p0, Ll/ۚ۬ۡ;->ܽ:I

    iget v3, p0, Ll/ۚ۬ۡ;->֫:I

    if-ne v2, v3, :cond_1

    iget v2, p0, Ll/ۚ۬ۡ;->ۜ:I

    if-ne v3, v2, :cond_1

    if-ne v2, v1, :cond_1

    goto :goto_0

    .line 161
    :cond_1
    :try_start_0
    iget-object v2, p0, Ll/ۚ۬ۡ;->ᩳ:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method
