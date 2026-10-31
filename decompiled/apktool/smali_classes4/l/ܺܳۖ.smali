.class public final Ll/ܺܳۖ;
.super Ll/ۘܳۖ;
.source "H88J"


# instance fields
.field public final synthetic ۜ:Ll/۠ᩳۖ;

.field public final synthetic ܳ:Z

.field public final synthetic ܿ:Z

.field public final synthetic ᩳ:Ljava/lang/reflect/Method;

.field public final synthetic ᩷:Ll/۠ᩳۖ;

.field public final synthetic ᩻:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;ZLjava/lang/reflect/Method;Ll/۠ᩳۖ;Ll/۠ᩳۖ;ZZ)V
    .locals 0

    .line 220
    iput-boolean p3, p0, Ll/ܺܳۖ;->ܿ:Z

    iput-object p4, p0, Ll/ܺܳۖ;->ᩳ:Ljava/lang/reflect/Method;

    iput-object p5, p0, Ll/ܺܳۖ;->᩷:Ll/۠ᩳۖ;

    iput-object p6, p0, Ll/ܺܳۖ;->ۜ:Ll/۠ᩳۖ;

    iput-boolean p7, p0, Ll/ܺܳۖ;->ܳ:Z

    iput-boolean p8, p0, Ll/ܺܳۖ;->᩻:Z

    invoke-direct {p0, p1, p2}, Ll/ۘܳۖ;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;I[Ljava/lang/Object;)V
    .locals 2

    .line 257
    iget-object v0, p0, Ll/ܺܳۖ;->ۜ:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 258
    iget-boolean v1, p0, Ll/ܺܳۖ;->ܳ:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 259
    :cond_0
    new-instance p2, Ll/ۧᩳۖ;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "null is not allowed as value for record component \'"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۘܳۖ;->ۧ:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' of primitive type; at path "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 263
    throw p2

    .line 265
    :cond_1
    :goto_0
    aput-object v0, p3, p2

    return-void
.end method

.method public final ֫(Ll/ܿۜۖ;Ljava/lang/Object;)V
    .locals 2

    .line 271
    iget-object v0, p0, Ll/ܺܳۖ;->ۜ:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    .line 272
    iget-boolean v0, p0, Ll/ܺܳۖ;->ܳ:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 273
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/ܺܳۖ;->ܿ:Z

    iget-object v1, p0, Ll/ۘܳۖ;->֫:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2

    .line 274
    invoke-static {p2, v1}, Ll/ۚܳۖ;->֫(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    goto :goto_1

    .line 275
    :cond_2
    iget-boolean v0, p0, Ll/ܺܳۖ;->᩻:Z

    if-nez v0, :cond_3

    .line 282
    :goto_1
    invoke-virtual {v1, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_3
    const/4 p1, 0x0

    .line 279
    invoke-static {v1, p1}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p1

    .line 280
    new-instance p2, Ll/ܰܽۖ;

    const-string v0, "Cannot set value of \'static final\' "

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 280
    throw p2
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 3

    .line 223
    iget-boolean v0, p0, Ll/ܺܳۖ;->ܿ:Z

    iget-object v1, p0, Ll/ۘܳۖ;->֫:Ljava/lang/reflect/Field;

    iget-object v2, p0, Ll/ܺܳۖ;->ᩳ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    if-nez v2, :cond_0

    .line 225
    invoke-static {p2, v1}, Ll/ۚܳۖ;->֫(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    goto :goto_0

    .line 229
    :cond_0
    invoke-static {p2, v2}, Ll/ۚܳۖ;->֫(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    const/4 v0, 0x0

    .line 236
    :try_start_0
    invoke-virtual {v2, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    .line 239
    invoke-static {v2, p2}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p2

    .line 240
    new-instance v0, Ll/ܰܽۖ;

    const-string v1, "Accessor "

    const-string v2, " threw exception"

    .line 0
    invoke-static {v1, p2, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 241
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 52
    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 241
    throw v0

    .line 244
    :cond_2
    invoke-virtual {v1, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    if-ne v0, p2, :cond_3

    return-void

    .line 250
    :cond_3
    iget-object p2, p0, Ll/ۘܳۖ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ll/᩻ۜۖ;->֫(Ljava/lang/String;)V

    .line 251
    iget-object p2, p0, Ll/ܺܳۖ;->᩷:Ll/۠ᩳۖ;

    invoke-virtual {p2, p1, v0}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    return-void
.end method
