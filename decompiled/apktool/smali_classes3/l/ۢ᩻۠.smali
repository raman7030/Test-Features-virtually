.class public final Ll/ۢ᩻۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# instance fields
.field public final synthetic ܿ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 950
    iput-object p1, p0, Ll/ۢ᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 4

    .line 952
    iget-object p1, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v0, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    iget-object v1, p0, Ll/ۢ᩻۠;->ܿ:Ll/᩶ۜ۠;

    if-ne p1, v0, :cond_2

    .line 953
    check-cast p2, Ll/ܳ֡֨;

    const/4 p1, 0x1

    .line 954
    invoke-static {v1, p1}, Ll/᩶ۜ۠;->֫(Ll/᩶ۜ۠;Z)V

    const/4 v0, 0x0

    .line 956
    :try_start_0
    iget-object v2, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    check-cast v2, Ll/᩶ۚ֨;

    .line 957
    iget-object v3, v1, Ll/᩶ۜ۠;->ۢ:Ll/ۛ֡֨;

    if-ne p2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/۫ۙ;->֫(Z)V

    .line 958
    iget-object p1, v1, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v1}, Ll/᩶ۜ۠;->ۧ()C

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩶ۢ۠;->ᩳ(I)Ll/ۤܶ۠;

    move-result-object p1

    .line 203
    invoke-virtual {p1}, Ll/ۤܶ۠;->֫()[B

    move-result-object p2

    invoke-virtual {p1}, Ll/ۤܶ۠;->ᩳ()I

    move-result v3

    invoke-virtual {p1}, Ll/ۤܶ۠;->ۧ()I

    move-result p1

    .line 658
    iput-object p2, v1, Ll/᩶ۜ۠;->ܽ֫:[B

    .line 659
    iput v3, v1, Ll/᩶ۜ۠;->ܿ֫:I

    add-int/2addr v3, p1

    .line 660
    iput v3, v1, Ll/᩶ۜ۠;->ۧ֫:I

    .line 661
    invoke-virtual {v1}, Ll/᩶ۜ۠;->᩷()Ll/ۖܶ۠;

    move-result-object p1

    .line 959
    iput-object p1, v2, Ll/᩶ۚ֨;->֫֫:Ll/ۖܶ۠;

    .line 960
    invoke-virtual {v1}, Ll/᩶ۜ۠;->᩻()Ll/ۙ֨֨;

    move-result-object p1

    iput-object p1, v2, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    .line 961
    new-instance p1, Ll/ᩴܶ۠;

    invoke-direct {p1}, Ll/ᩴܶ۠;-><init>()V

    .line 962
    :goto_1
    iget p2, v1, Ll/᩶ۜ۠;->ܿ֫:I

    iget v3, v1, Ll/᩶ۜ۠;->ۧ֫:I

    if-eq p2, v3, :cond_1

    invoke-virtual {v1}, Ll/᩶ۜ۠;->᩻()Ll/ۙ֨֨;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 963
    :cond_1
    invoke-virtual {p1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, v2, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 965
    invoke-static {v1, v0}, Ll/᩶ۜ۠;->֫(Ll/᩶ۜ۠;Z)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v1, v0}, Ll/᩶ۜ۠;->֫(Ll/᩶ۜ۠;Z)V

    .line 966
    throw p1

    .line 968
    :cond_2
    iget-object p1, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p1}, Ll/ۙ֨֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object p1

    .line 969
    iget-object v0, v1, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v1}, Ll/᩶ۜ۠;->ۧ()C

    move-result v1

    invoke-virtual {v0, v1}, Ll/᩶ۢ۠;->᩻(I)Ll/ۙ֨֨;

    move-result-object v0

    iput-object v0, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 971
    iget-object v1, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_3

    invoke-virtual {v0}, Ll/ۙ֨֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 972
    iget-object p2, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p2}, Ll/ۙ֨֨;->᩹()Ll/ۧ֨֨;

    move-result-object p2

    iput-object p1, p2, Ll/ۧ֨֨;->᩺:Ll/ۖܶ۠;

    :cond_3
    return-void
.end method
