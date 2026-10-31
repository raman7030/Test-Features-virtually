.class public final Ll/֨֫۠;
.super Ljava/lang/Object;
.source "A451"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۙ:Ll/᩹ܽ۠;

.field public ᩶:Ll/ۖܶ۠;

.field public ᩸:Ll/᩶֡֨;

.field public ᩹:Ll/᩶֡֨;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/ۙ֨֨;)V
    .locals 0

    .line 1929
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨֫۠;->ۙ:Ll/᩹ܽ۠;

    .line 1931
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/֨֫۠;->᩶:Ll/ۖܶ۠;

    .line 1932
    invoke-virtual {p0, p2}, Ll/֨֫۠;->֫(Ll/ۙ֨֨;)Ll/᩶֡֨;

    move-result-object p1

    iput-object p1, p0, Ll/֨֫۠;->᩸:Ll/᩶֡֨;

    const/4 p1, 0x0

    .line 1933
    iput-object p1, p0, Ll/֨֫۠;->᩹:Ll/᩶֡֨;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 3

    .line 1936
    iget-object v0, p0, Ll/֨֫۠;->᩸:Ll/᩶֡֨;

    iget-object v1, p0, Ll/֨֫۠;->ۙ:Ll/᩹ܽ۠;

    iget-object v2, v1, Ll/᩹ܽ۠;->ᩳ֫:Ll/᩷ۚ֨;

    iget-object v2, v2, Ll/᩷ۚ֨;->۠֫:Ll/᩶֡֨;

    if-ne v0, v2, :cond_0

    .line 1937
    iget-object v0, v1, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    iget-object v1, p0, Ll/֨֫۠;->᩹:Ll/᩶֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0, v1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֨֫۠;->֫(Ll/ۙ֨֨;)Ll/᩶֡֨;

    move-result-object v0

    iput-object v0, p0, Ll/֨֫۠;->᩸:Ll/᩶֡֨;

    .line 1939
    :cond_0
    iget-object v0, p0, Ll/֨֫۠;->᩸:Ll/᩶֡֨;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1943
    iget-object v0, p0, Ll/֨֫۠;->᩸:Ll/᩶֡֨;

    iput-object v0, p0, Ll/֨֫۠;->᩹:Ll/᩶֡֨;

    .line 1944
    iget-object v1, p0, Ll/֨֫۠;->ۙ:Ll/᩹ܽ۠;

    iget-object v1, v1, Ll/᩹ܽ۠;->ᩳ֫:Ll/᩷ۚ֨;

    iget-object v1, v1, Ll/᩷ۚ֨;->۠֫:Ll/᩶֡֨;

    iput-object v1, p0, Ll/֨֫۠;->᩸:Ll/᩶֡֨;

    if-nez v0, :cond_1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 1945
    :goto_1
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 1946
    iget-object v0, p0, Ll/֨֫۠;->᩹:Ll/᩶֡֨;

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 1950
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ֫(Ll/ۙ֨֨;)Ll/᩶֡֨;
    .locals 3

    .line 1954
    sget-object v0, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    .line 1955
    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    .line 1958
    :cond_0
    iget-object v0, p0, Ll/֨֫۠;->ۙ:Ll/᩹ܽ۠;

    iget-object v0, v0, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Z)Ll/ۙ֨֨;

    move-result-object p1

    .line 1959
    iget-object v0, p0, Ll/֨֫۠;->᩶:Ll/ۖܶ۠;

    iget-object v2, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0, v2}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    .line 1964
    :cond_1
    iget-object v0, p0, Ll/֨֫۠;->᩶:Ll/ۖܶ۠;

    iget-object v1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0, v1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/֨֫۠;->᩶:Ll/ۖܶ۠;

    .line 1965
    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    return-object p1
.end method
