.class public final Ll/᩵ۢ֫;
.super Ljava/lang/Object;
.source "D5S8"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 4

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 175
    iput-object p1, p0, Ll/᩵ۢ֫;->ۧ:Ljava/util/HashMap;

    .line 176
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩵ۢ֫;->֫:Ljava/util/HashMap;

    .line 177
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 178
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۢ֫;

    .line 179
    iget-object v2, p0, Ll/᩵ۢ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_0

    .line 181
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 182
    iget-object v3, p0, Ll/᩵ۢ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    :cond_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۢ֫;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(Ljava/util/List;Ll/᩻ۡ֫;Ll/᩺ۢ֫;Ljava/lang/Object;)V
    .locals 6

    if-eqz p0, :cond_3

    .line 198
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_3

    .line 199
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ۢ֫;

    .line 220
    iget-object v3, v2, Ll/֡ۢ֫;->ۧ:Ljava/lang/reflect/Method;

    :try_start_0
    iget v2, v2, Ll/֡ۢ֫;->֫:I

    if-eqz v2, :cond_2

    const/4 v4, 0x0

    if-eq v2, v1, :cond_1

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    goto :goto_1

    :cond_0
    new-array v2, v5, [Ljava/lang/Object;

    aput-object p1, v2, v4

    aput-object p2, v2, v1

    .line 228
    invoke-virtual {v3, p3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-array v2, v1, [Ljava/lang/Object;

    aput-object p1, v2, v4

    .line 225
    invoke-virtual {v3, p3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 222
    invoke-virtual {v3, p3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :catch_0
    move-exception p0

    .line 234
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 232
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Failed to call observer method"

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;Ljava/lang/Object;)V
    .locals 2

    .line 190
    iget-object v0, p0, Ll/᩵ۢ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1, p1, p2, p3}, Ll/᩵ۢ֫;->֫(Ljava/util/List;Ll/᩻ۡ֫;Ll/᩺ۢ֫;Ljava/lang/Object;)V

    .line 191
    sget-object v1, Ll/᩺ۢ֫;->᩶:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0, p1, p2, p3}, Ll/᩵ۢ֫;->֫(Ljava/util/List;Ll/᩻ۡ֫;Ll/᩺ۢ֫;Ljava/lang/Object;)V

    return-void
.end method
