.class public abstract Ll/ۖ᩸᩵;
.super Ljava/lang/Object;
.source "CANR"

# interfaces
.implements Ll/ۨܶ᩵;
.implements Ll/᩵᩸᩵;
.implements Ljava/io/Serializable;


# instance fields
.field public final ᩸:Ll/ۨܶ᩵;


# direct methods
.method public constructor <init>(Ll/ۨܶ᩵;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/ۖ᩸᩵;->᩸:Ll/ۨܶ᩵;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Continuation at "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۖ᩸᩵;->ܿ()Ljava/lang/StackTraceElement;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ljava/lang/Object;Ll/ۨܶ᩵;)Ll/ۨܶ᩵;
    .locals 0

    const-string p1, "completion"

    .line 5
    invoke-static {p2, p1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "create(Any?;Continuation) has not been overridden"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 3

    move-object v0, p0

    .line 30
    :goto_0
    check-cast v0, Ll/ۖ᩸᩵;

    .line 31
    iget-object v1, v0, Ll/ۖ᩸᩵;->᩸:Ll/ۨܶ᩵;

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 34
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ۖ᩸᩵;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 57
    sget-object v2, Ll/ۜ᩸᩵;->᩶:Ll/ۜ᩸᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v2, :cond_0

    return-void

    :catchall_0
    move-exception p1

    .line 38
    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;

    move-result-object p1

    .line 40
    :cond_0
    invoke-virtual {v0}, Ll/ۖ᩸᩵;->᩻()V

    .line 41
    instance-of v0, v1, Ll/ۖ᩸᩵;

    if-eqz v0, :cond_1

    move-object v0, v1

    goto :goto_0

    .line 47
    :cond_1
    invoke-interface {v1, p1}, Ll/ۨܶ᩵;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public abstract ۧ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public ۧ()Ll/᩵᩸᩵;
    .locals 2

    .line 74
    iget-object v0, p0, Ll/ۖ᩸᩵;->᩸:Ll/ۨܶ᩵;

    instance-of v1, v0, Ll/᩵᩸᩵;

    if-eqz v1, :cond_0

    check-cast v0, Ll/᩵᩸᩵;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ܿ()Ljava/lang/StackTraceElement;
    .locals 6

    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/֡᩸᩵;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ll/֡᩸᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 48
    :cond_0
    invoke-interface {v0}, Ll/֡᩸᩵;->v()I

    move-result v2

    const/4 v3, 0x1

    if-ge v2, v3, :cond_1

    :goto_0
    return-object v1

    :cond_1
    const/4 v2, -0x1

    .line 99
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v5, "label"

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 100
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 101
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/Integer;

    if-eqz v5, :cond_2

    move-object v1, v4

    check-cast v1, Ljava/lang/Integer;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    sub-int/2addr v1, v3

    goto :goto_2

    :catch_0
    const/4 v1, -0x1

    :goto_2
    if-gez v1, :cond_4

    goto :goto_3

    .line 50
    :cond_4
    invoke-interface {v0}, Ll/֡᩸᩵;->l()[I

    move-result-object v2

    aget v2, v2, v1

    .line 51
    :goto_3
    invoke-static {p0}, Ll/֨᩸᩵;->֫(Ll/ۖ᩸᩵;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    .line 52
    invoke-interface {v0}, Ll/֡᩸᩵;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ll/֡᩸᩵;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 53
    :goto_4
    new-instance v3, Ljava/lang/StackTraceElement;

    invoke-interface {v0}, Ll/֡᩸᩵;->m()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0}, Ll/֡᩸᩵;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v4, v0, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v3
.end method

.method public final ᩳ()Ll/ۨܶ᩵;
    .locals 1

    .line 19
    iget-object v0, p0, Ll/ۖ᩸᩵;->᩸:Ll/ۨܶ᩵;

    return-object v0
.end method

.method public ᩻()V
    .locals 0

    return-void
.end method
