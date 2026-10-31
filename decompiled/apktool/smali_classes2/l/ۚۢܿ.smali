.class public final Ll/ۚۢܿ;
.super Ljava/lang/Object;
.source "V702"


# instance fields
.field public ֫:I

.field public ۜ:I

.field public ۧ:I

.field public final ܳ:Ll/ᩳۖܿ;

.field public final ܽ:[I

.field public ܿ:Z

.field public final ᩳ:Ll/ܶۖܿ;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ܶۖܿ;Ll/ܳۢܿ;)V
    .locals 2

    .line 685
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 679
    iput v0, p0, Ll/ۚۢܿ;->ۧ:I

    .line 686
    iput-object p1, p0, Ll/ۚۢܿ;->ᩳ:Ll/ܶۖܿ;

    .line 687
    iget-object v0, p1, Ll/ܶۖܿ;->ܳ:Ll/ۢۖܿ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    new-instance v1, Ll/ᩳۖܿ;

    invoke-direct {v1}, Ll/ᩳۖܿ;-><init>()V

    invoke-virtual {v1, v0}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 687
    iput-object v1, p0, Ll/ۚۢܿ;->ܳ:Ll/ᩳۖܿ;

    if-eqz p2, :cond_1

    .line 688
    iget-object p1, p1, Ll/ܶۖܿ;->֫:Ll/ᩳۢܿ;

    if-nez p1, :cond_0

    goto :goto_0

    .line 689
    :cond_0
    invoke-virtual {p1}, Ll/ᩳۢܿ;->֫()I

    move-result p1

    new-array p1, p1, [I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Ll/ۚۢܿ;->ܽ:[I

    return-void
.end method
