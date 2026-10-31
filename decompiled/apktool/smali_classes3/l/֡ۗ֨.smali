.class public final Ll/֡ۗ֨;
.super Ll/᩻֨۠;
.source "17L4"


# instance fields
.field public final synthetic ۧ:Ll/۠ۗ֨;

.field public final synthetic ܽ:Ll/ܳ֡۠;

.field public final synthetic ܿ:Z

.field public final synthetic ᩳ:Ll/ᩴܶ۠;


# direct methods
.method public constructor <init>(Ll/۠ۗ֨;ZLl/ᩴܶ۠;Ll/ܳ֡۠;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput-object p1, p0, Ll/֡ۗ֨;->ۧ:Ll/۠ۗ֨;

    iput-boolean p2, p0, Ll/֡ۗ֨;->ܿ:Z

    iput-object p3, p0, Ll/֡ۗ֨;->ᩳ:Ll/ᩴܶ۠;

    iput-object p4, p0, Ll/֡ۗ֨;->ܽ:Ll/ܳ֡۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ᩵۠;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۤ֡۠;)V
    .locals 4

    .line 126
    iput-object p1, p0, Ll/᩻֨۠;->֫:Ll/ۚۚ۠;

    .line 127
    iget-boolean v0, p0, Ll/֡ۗ֨;->ܿ:Z

    iget-object v1, p0, Ll/֡ۗ֨;->ᩳ:Ll/ᩴܶ۠;

    iget-object v2, p0, Ll/֡ۗ֨;->ۧ:Ll/۠ۗ֨;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p1, Ll/ۤ֡۠;->ۗ:Ll/۫᩵۠;

    if-eqz v0, :cond_1

    .line 129
    iget-object v0, v2, Ll/۠ۗ֨;->ܽ:Ll/ܿ֨۠;

    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܿ֨۠;->ۧ(Ll/ۖܶ۠;)Ll/ۗ᩵۠;

    move-result-object v0

    .line 130
    iput-object v0, p0, Ll/᩻֨۠;->֫:Ll/ۚۚ۠;

    .line 131
    new-instance v2, Ll/ۘۗ֨;

    iget-object v3, p0, Ll/֡ۗ֨;->ܽ:Ll/ܳ֡۠;

    invoke-direct {v2, p0, v3, v0, p1}, Ll/ۘۗ֨;-><init>(Ll/֡ۗ֨;Ll/ܳ֡۠;Ll/ۗ᩵۠;Ll/ۤ֡۠;)V

    invoke-virtual {v1, v2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    return-void

    .line 142
    :cond_0
    iget-object v0, p1, Ll/ۤ֡۠;->ۗ:Ll/۫᩵۠;

    if-nez v0, :cond_1

    .line 143
    iget-object v0, v2, Ll/۠ۗ֨;->ܽ:Ll/ܿ֨۠;

    invoke-virtual {v0}, Ll/ܿ֨۠;->ۧ()Ll/ۗ᩵۠;

    move-result-object v0

    iget-object v2, v2, Ll/۠ۗ֨;->ܿ:Ll/᩷ۚ֨;

    iget-object v2, v2, Ll/᩷ۚ֨;->ۗ:Ll/۫ۚ֨;

    .line 471
    iput-object v2, v0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 143
    iput-object v0, p1, Ll/ۤ֡۠;->ۗ:Ll/۫᩵۠;

    .line 144
    new-instance v0, Ll/ᩴۗ֨;

    invoke-direct {v0, p1}, Ll/ᩴۗ֨;-><init>(Ll/ۤ֡۠;)V

    invoke-virtual {v1, v0}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ܳ֡۠;)V
    .locals 0

    return-void
.end method
