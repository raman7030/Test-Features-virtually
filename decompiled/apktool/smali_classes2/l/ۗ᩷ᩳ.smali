.class public final synthetic Ll/ۗ᩷ᩳ;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ۨ᩷ᩳ;

.field public final synthetic ۧ:I


# direct methods
.method public synthetic constructor <init>(Ll/ۨ᩷ᩳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ᩷ᩳ;->֫:Ll/ۨ᩷ᩳ;

    iput p2, p0, Ll/ۗ᩷ᩳ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 937
    new-instance v0, Ll/ۙܶᩳ;

    iget-object v1, p0, Ll/ۗ᩷ᩳ;->֫:Ll/ۨ᩷ᩳ;

    iget-object v2, v1, Ll/ۨ᩷ᩳ;->ۡ:Ll/֫ۢᩳ;

    invoke-static {v2}, Ll/֫ۢᩳ;->᩻(Ll/֫ۢᩳ;)Ll/ܰۜᩳ;

    move-result-object v2

    iget-object v2, v2, Ll/ܰۜᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-direct {v0, v2}, Ll/ۙܶᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    new-instance v2, Ll/ۤ᩷ᩳ;

    invoke-direct {v2, v1}, Ll/ۤ᩷ᩳ;-><init>(Ll/ۨ᩷ᩳ;)V

    iget v1, p0, Ll/ۗ᩷ᩳ;->ۧ:I

    invoke-static {v0, v1, v2}, Ll/ܿ᩸ᩳ;->֫(Ll/ۙܶᩳ;ILl/ܿۖ᩷;)Ll/ۧ᩸ᩳ;

    move-result-object v0

    return-object v0
.end method
