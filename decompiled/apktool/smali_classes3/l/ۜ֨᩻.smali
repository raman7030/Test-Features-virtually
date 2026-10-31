.class public final Ll/ۜ֨᩻;
.super Ljava/lang/Object;
.source "M9Q4"

# interfaces
.implements Ll/ۡ֨᩻;


# instance fields
.field public final synthetic ֫:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ۧ:Ll/ۡ֨᩻;


# direct methods
.method public constructor <init>(Ll/ۡ֨᩻;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    .line 454
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ֨᩻;->ۧ:Ll/ۡ֨᩻;

    iput-object p2, p0, Ll/ۜ֨᩻;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 457
    iget-object v0, p0, Ll/ۜ֨᩻;->ۧ:Ll/ۡ֨᩻;

    invoke-interface {v0, p1}, Ll/ۡ֨᩻;->֫(I)V

    return-void
.end method

.method public final synthetic ۧ(I)V
    .locals 0

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 462
    iget-object v0, p0, Ll/ۜ֨᩻;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۜ֨᩻;->ۧ:Ll/ۡ֨᩻;

    invoke-interface {v0}, Ll/ۡ֨᩻;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
