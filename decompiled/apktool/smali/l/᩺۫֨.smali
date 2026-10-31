.class public final Ll/᩺۫֨;
.super Ll/ܳ֨۠;
.source "S424"


# instance fields
.field public final ֫:Ll/֡֡֨;

.field public final synthetic ۧ:Ll/ܰ۫֨;


# direct methods
.method public constructor <init>(Ll/ܰ۫֨;Ll/֡֡֨;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 646
    iput-object p1, p0, Ll/᩺۫֨;->ۧ:Ll/ܰ۫֨;

    .line 647
    iput-object p2, p0, Ll/᩺۫֨;->֫:Ll/֡֡֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ᩵۠;)V
    .locals 4

    .line 652
    iget-object v0, p0, Ll/᩺۫֨;->ۧ:Ll/ܰ۫֨;

    iget-object v1, v0, Ll/ܰ۫֨;->ۧ:Ll/ܶ۬֨;

    iget-object v2, p1, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    if-nez v2, :cond_0

    return-void

    .line 657
    :cond_0
    iget-object v3, v0, Ll/ܰ۫֨;->᩵:Ll/ܽܿ۠;

    invoke-virtual {v3, v2}, Ll/ܽܿ۠;->ۧ(Ll/᩶֡֨;)Ll/֫ۤ֨;

    .line 658
    invoke-virtual {v1, v2}, Ll/ܶ۬֨;->ܿ(Ll/ܳ֡֨;)V

    .line 659
    invoke-virtual {v1, v2}, Ll/ܶ۬֨;->֫(Ll/ܳ֡֨;)V

    .line 660
    iget-object v0, v0, Ll/ܰ۫֨;->ۖ:Ll/᩷ۚ֨;

    iget-object v1, p0, Ll/᩺۫֨;->֫:Ll/֡֡֨;

    iget-object v2, v2, Ll/ܳ֡֨;->᩺:Ll/ۤܶ۠;

    invoke-virtual {v0, v1, v2}, Ll/᩷ۚ֨;->᩻(Ll/֡֡֨;Ll/ۤܶ۠;)V

    .line 661
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۚ᩵۠;)V

    return-void
.end method
