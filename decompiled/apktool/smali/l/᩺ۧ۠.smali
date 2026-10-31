.class public final Ll/᩺ۧ۠;
.super Ljava/lang/Object;
.source "A451"

# interfaces
.implements Ll/ܰۧ۠;


# instance fields
.field public ֫:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 4783
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4784
    iput p1, p0, Ll/᩺ۧ۠;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ۠۠;Ll/ۗ۠۠;Ll/ܳ۠۠;Ll/۬۠۠;Ll/ܽܶ۠;)Ll/ܽܶ۠;
    .locals 7

    .line 4791
    invoke-virtual {p5}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ll/᩺ۧ۠;->֫:I

    aget-object v0, v0, v1

    check-cast v0, Ll/ܽܶ۠;

    .line 4792
    invoke-virtual {p5}, Ll/ܽܶ۠;->ᩳ()Ll/ۗ۠۠;

    move-result-object p5

    if-nez p5, :cond_0

    move-object v4, p2

    goto :goto_0

    :cond_0
    move-object v4, p5

    :goto_0
    const/4 p2, 0x1

    new-array v6, p2, [Ljava/lang/Object;

    const/4 p2, 0x0

    aput-object v0, v6, p2

    const-string v5, "prob.found.req"

    move-object v1, p1

    move-object v2, p4

    move-object v3, p3

    .line 4796
    invoke-virtual/range {v1 .. v6}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object p1

    return-object p1
.end method
