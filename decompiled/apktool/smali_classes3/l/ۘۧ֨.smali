.class public final synthetic Ll/ۘۧ֨;
.super Ljava/lang/Object;
.source "K3OA"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# instance fields
.field public final synthetic ᩸:Ll/ۤۧ֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۧ֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۧ֨;->᩸:Ll/ۤۧ֨;

    return-void
.end method


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 1

    .line 2
    check-cast p1, Ll/ۗۧ֨;

    .line 4
    iget-object v0, p0, Ll/ۘۧ֨;->᩸:Ll/ۤۧ֨;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p1, :cond_0

    const/4 p1, 0x4

    return p1

    .line 513
    :cond_0
    iget-object p1, p1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    iget-boolean v0, v0, Ll/ۢܽ֨;->ᩴ֫:Z

    invoke-virtual {p1, v0}, Ll/۫ۧ֨;->֫(Z)I

    move-result p1

    return p1
.end method
