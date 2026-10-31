.class public final Ll/ۤۤ᩷;
.super Ll/۟ܶۡ;
.source "31K1"


# instance fields
.field public final synthetic ۜ:Ll/ܶ᩵ܿ;

.field public final synthetic ܳ:Ll/ܿۛ᩷;

.field public final synthetic ᩻:Ll/ܽܰ᩷;


# direct methods
.method public constructor <init>(Ll/ܿۛ᩷;Ll/ܶ᩵ܿ;Ll/ܽܰ᩷;)V
    .locals 0

    .line 970
    iput-object p1, p0, Ll/ۤۤ᩷;->ܳ:Ll/ܿۛ᩷;

    iput-object p2, p0, Ll/ۤۤ᩷;->ۜ:Ll/ܶ᩵ܿ;

    iput-object p3, p0, Ll/ۤۤ᩷;->᩻:Ll/ܽܰ᩷;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 986
    iget-object v0, p0, Ll/ۤۤ᩷;->ܳ:Ll/ܿۛ᩷;

    invoke-virtual {v0}, Ll/֡᩻֫;->ۢ()Ll/ۚۜ֫;

    move-result-object v1

    .line 987
    invoke-virtual {v1}, Ll/ۚۜ֫;->ۗ()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 990
    :cond_0
    invoke-static {v0}, Ll/ܿۛ᩷;->ۚ(Ll/ܿۛ᩷;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Ll/ۤۤ᩷;->᩻:Ll/ܽܰ᩷;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    :goto_0
    return-void

    .line 994
    :cond_1
    new-instance v3, Ll/ۙ᩺᩷;

    invoke-direct {v3}, Ll/ۙ᩺᩷;-><init>()V

    .line 995
    invoke-static {v0}, Ll/ܿۛ᩷;->ۚ(Ll/ܿۛ᩷;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳۛ᩷;

    .line 996
    invoke-virtual {v1}, Ll/ۚۜ֫;->ۧ()Ll/ܽ᩷֫;

    move-result-object v1

    const/4 v5, 0x0

    .line 997
    invoke-virtual {v1, v5, v5}, Ll/ܽ᩷֫;->֫(II)V

    .line 998
    invoke-virtual {v1, v4}, Ll/ܽ᩷֫;->ܽ(Ll/ۡ᩻֫;)Ll/ܽ᩷֫;

    const-string v5, "000000-0000-0000-0000-000000000001"

    .line 999
    invoke-virtual {v1, v3, v5}, Ll/ܽ᩷֫;->֫(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 1000
    invoke-virtual {v1}, Ll/ܽ᩷֫;->ܽ()I

    .line 1002
    invoke-static {v0}, Ll/ܿۛ᩷;->ۖ(Ll/ܿۛ᩷;)Ljava/util/LinkedList;

    move-result-object v1

    const-string v3, "000000-0000-0000-0000-000000000002"

    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 1003
    invoke-static {v0}, Ll/ܿۛ᩷;->ۡ(Ll/ܿۛ᩷;)Ll/ۨۤ᩷;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1004
    invoke-static {v0}, Ll/ܿۛ᩷;->ۡ(Ll/ܿۛ᩷;)Ll/ۨۤ᩷;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    .line 1007
    :cond_2
    invoke-virtual {v0}, Ll/ܿۛ᩷;->ۧ֫()Ll/ۧ۫᩷;

    move-result-object v1

    .line 1008
    invoke-virtual {v4, v1}, Ll/ܳۛ᩷;->ۧ(Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۧ۫᩷;->֫()Z

    .line 1009
    invoke-virtual {v4, v1}, Ll/ܳۛ᩷;->ܽ(Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-static {v2}, Ll/ۛ֫ܿ;->ۧ(Ll/ܶ᩵ܿ;)Ll/ۗ᩻᩵;

    move-result-object v2

    new-instance v3, Ll/۫ۤ᩷;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1010
    invoke-virtual {v2, v3}, Ll/ۗ᩻᩵;->֫(Ll/᩸ۜ᩵;)V

    .line 1011
    invoke-virtual {v4, v1}, Ll/ܳۛ᩷;->֫(Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۧ۫᩷;->֫()Z

    .line 1012
    invoke-static {v0}, Ll/ܿۛ᩷;->ۨ(Ll/ܿۛ᩷;)V

    .line 1014
    invoke-static {v0}, Ll/ܿۛ᩷;->᩺(Ll/ܿۛ᩷;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 1019
    iget-object v0, p0, Ll/ۤۤ᩷;->ܳ:Ll/ܿۛ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 974
    iget-object v0, p0, Ll/ۤۤ᩷;->ܳ:Ll/ܿۛ᩷;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 979
    iget-object v0, p0, Ll/ۤۤ᩷;->ܳ:Ll/ܿۛ᩷;

    invoke-static {v0}, Ll/ܿۛ᩷;->۠(Ll/ܿۛ᩷;)Ll/ۧ۫᩷;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v1

    iget-object v2, p0, Ll/ۤۤ᩷;->ۜ:Ll/ܶ᩵ܿ;

    invoke-static {v2, v1}, Ll/۫ۨ᩷;->ۧ(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)V

    .line 980
    invoke-static {v0}, Ll/ܿۛ᩷;->ۙ(Ll/ܿۛ᩷;)V

    const/4 v1, 0x0

    .line 981
    invoke-static {v0, v1}, Ll/ܿۛ᩷;->ۧ(Ll/ܿۛ᩷;Z)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 1024
    iget-object v0, p0, Ll/ۤۤ᩷;->ܳ:Ll/ܿۛ᩷;

    invoke-static {v0}, Ll/ܿۛ᩷;->ۗ(Ll/ܿۛ᩷;)V

    .line 1025
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
