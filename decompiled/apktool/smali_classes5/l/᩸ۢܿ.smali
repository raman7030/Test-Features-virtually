.class public final Ll/᩸ۢܿ;
.super Ljava/lang/Object;
.source "V702"

# interfaces
.implements Ll/ۙۖܿ;


# instance fields
.field public final ֫:Ll/۫ۘܽ;

.field public final ۧ:I

.field public final ܽ:Ll/۫ܺܿ;

.field public final synthetic ᩳ:Ll/ۗۢܿ;


# direct methods
.method public constructor <init>(Ll/ۗۢܿ;Ll/۫ܺܿ;Ll/۫ۘܽ;I)V
    .locals 0

    .line 5375
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۢܿ;->ᩳ:Ll/ۗۢܿ;

    .line 5376
    iput-object p2, p0, Ll/᩸ۢܿ;->ܽ:Ll/۫ܺܿ;

    .line 5377
    iput-object p3, p0, Ll/᩸ۢܿ;->֫:Ll/۫ۘܽ;

    .line 5378
    iput p4, p0, Ll/᩸ۢܿ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 4

    .line 5384
    iget-object v0, p0, Ll/᩸ۢܿ;->ᩳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->᩻(Ll/ۗۢܿ;)Ll/֨ۢܿ;

    move-result-object v1

    .line 5385
    iget v2, p0, Ll/᩸ۢܿ;->ۧ:I

    iput v2, v1, Ll/֨ۢܿ;->ۚ֫:I

    .line 5386
    iget-object v2, p0, Ll/᩸ۢܿ;->֫:Ll/۫ۘܽ;

    invoke-virtual {v2}, Ll/۫ۘܽ;->start()I

    move-result v3

    iput v3, v1, Ll/֨ۢܿ;->ۗ֫:I

    .line 5387
    invoke-virtual {v2}, Ll/۫ۘܽ;->end()I

    move-result v3

    iput v3, v1, Ll/֨ۢܿ;->ۙ֫:I

    const/4 v3, -0x1

    .line 5388
    iput v3, v1, Ll/֨ۢܿ;->۟֫:I

    iput v3, v1, Ll/֨ۢܿ;->᩷֫:I

    .line 5389
    iget-object v3, p0, Ll/᩸ۢܿ;->ܽ:Ll/۫ܺܿ;

    invoke-static {v0, v1, v3, v2}, Ll/ۗۢܿ;->֫(Ll/ۗۢܿ;Ll/֨ۢܿ;Ll/۫ܺܿ;Ll/۫ۘܽ;)V

    .line 5390
    iget v0, v1, Ll/֨ۢܿ;->᩷֫:I

    return v0
.end method
