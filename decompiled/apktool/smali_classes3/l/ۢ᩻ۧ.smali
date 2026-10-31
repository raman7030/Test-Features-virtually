.class public final Ll/ۢ᩻ۧ;
.super Ljava/lang/Object;
.source "Q8Q4"

# interfaces
.implements Ll/ܿۜۧ;


# instance fields
.field public final synthetic ۧ:Ll/֨᩻ۧ;


# direct methods
.method public constructor <init>(Ll/֨᩻ۧ;)V
    .locals 0

    .line 1069
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ᩻ۧ;->ۧ:Ll/֨᩻ۧ;

    return-void
.end method


# virtual methods
.method public final synthetic ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۜ֡֫;)V
    .locals 2

    .line 1087
    iget-object v0, p0, Ll/ۢ᩻ۧ;->ۧ:Ll/֨᩻ۧ;

    invoke-static {v0}, Ll/֨᩻ۧ;->ܿ(Ll/֨᩻ۧ;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻ۧ;

    .line 1088
    invoke-interface {v1, p1}, Ll/ۘ᩻ۧ;->֫(Ll/ۜ֡֫;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܳ()V
    .locals 2

    .line 1080
    iget-object v0, p0, Ll/ۢ᩻ۧ;->ۧ:Ll/֨᩻ۧ;

    invoke-static {v0}, Ll/֨᩻ۧ;->ܿ(Ll/֨᩻ۧ;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻ۧ;

    .line 1081
    invoke-interface {v1}, Ll/ۘ᩻ۧ;->ܳ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 1073
    iget-object v0, p0, Ll/ۢ᩻ۧ;->ۧ:Ll/֨᩻ۧ;

    invoke-static {v0}, Ll/֨᩻ۧ;->ܿ(Ll/֨᩻ۧ;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻ۧ;

    .line 1074
    invoke-interface {v1}, Ll/ۘ᩻ۧ;->ܽ()V

    goto :goto_0

    :cond_0
    return-void
.end method
