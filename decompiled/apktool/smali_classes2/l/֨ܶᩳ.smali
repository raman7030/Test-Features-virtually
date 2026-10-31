.class public final synthetic Ll/֨ܶᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ܶܶᩳ;

.field public final synthetic ۧ:Ll/ۡܶᩳ;

.field public final synthetic ܽ:J


# direct methods
.method public synthetic constructor <init>(Ll/ܶܶᩳ;Ll/ۡܶᩳ;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ܶᩳ;->֫:Ll/ܶܶᩳ;

    iput-object p2, p0, Ll/֨ܶᩳ;->ۧ:Ll/ۡܶᩳ;

    iput-wide p3, p0, Ll/֨ܶᩳ;->ܽ:J

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 2419
    iget-object v0, p0, Ll/֨ܶᩳ;->֫:Ll/ܶܶᩳ;

    iget-object v0, v0, Ll/ܶܶᩳ;->ۧ:Ll/᩹ܶᩳ;

    iget-object v1, p0, Ll/֨ܶᩳ;->ۧ:Ll/ۡܶᩳ;

    invoke-virtual {v1}, Ll/ۡܶᩳ;->۫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2420
    invoke-virtual {v1}, Ll/ۡܶᩳ;->֫()Z

    .line 2421
    invoke-virtual {v1}, Ll/ۡܶᩳ;->۫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2422
    iget-wide v1, p0, Ll/֨ܶᩳ;->ܽ:J

    invoke-virtual {v0, v1, v2}, Ll/֫ۘᩳ;->֫(J)V

    const/4 v1, 0x1

    .line 2423
    invoke-virtual {v0, v1}, Ll/֫ۘᩳ;->ۧ(Z)V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
