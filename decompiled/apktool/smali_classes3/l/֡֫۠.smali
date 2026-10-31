.class public final Ll/֡֫۠;
.super Ll/ܶۧ۠;
.source "A451"


# instance fields
.field public final synthetic ܳ:Ll/ۚ֫۠;

.field public ܿ:Ll/᩸ۧ۠;


# direct methods
.method public constructor <init>(Ll/ۚ֫۠;ZLl/ۜ۫֨;Ll/֨᩸۠;Z)V
    .locals 0

    .line 940
    iput-object p1, p0, Ll/֡֫۠;->ܳ:Ll/ۚ֫۠;

    iget-object p1, p1, Ll/ۚ֫۠;->ܽ:Ll/᩹ܽ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܶۧ۠;-><init>(Ll/᩹ܽ۠;ZLl/ۜ۫֨;Ll/֨᩸۠;)V

    if-eqz p5, :cond_0

    .line 942
    sget-object p1, Ll/᩸ۧ۠;->۫:Ll/᩸ۧ۠;

    goto :goto_0

    :cond_0
    sget-object p1, Ll/᩸ۧ۠;->ۙ:Ll/᩸ۧ۠;

    :goto_0
    iput-object p1, p0, Ll/֡֫۠;->ܿ:Ll/᩸ۧ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V
    .locals 3

    .line 946
    iget-object v0, p0, Ll/ܶۧ۠;->֫:Ll/ۜ۫֨;

    iget-object v0, v0, Ll/ۜ۫֨;->ۧ:Ll/֡ۨ֨;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    iget-object p2, p0, Ll/֡֫۠;->ܳ:Ll/ۚ֫۠;

    iget-object v2, p0, Ll/֡֫۠;->ܿ:Ll/᩸ۧ۠;

    invoke-virtual {p2, p1, v2, v0, v1}, Ll/ۤ֫۠;->֫(Ll/ۗ۠۠;Ll/᩸ۧ۠;Ll/֡ۨ֨;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method
