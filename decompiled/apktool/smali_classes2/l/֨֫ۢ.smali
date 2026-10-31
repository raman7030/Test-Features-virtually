.class public final Ll/֨֫ۢ;
.super Ljava/lang/Object;
.source "Z1GQ"

# interfaces
.implements Ll/ۚ۬᩷;


# instance fields
.field public ֫:Ll/ܿۛ᩷;

.field public final synthetic ۧ:Ll/۠֫ۢ;

.field public ܽ:Z


# direct methods
.method public constructor <init>(Ll/ܿۛ᩷;Ll/۠֫ۢ;Z)V
    .locals 1

    .line 942
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    .line 943
    iput-object p1, p0, Ll/֨֫ۢ;->֫:Ll/ܿۛ᩷;

    .line 944
    iput-boolean p3, p0, Ll/֨֫ۢ;->ܽ:Z

    .line 945
    invoke-static {p2}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object p3

    if-nez p3, :cond_0

    .line 946
    new-instance p3, Ll/ۙܺ֫;

    invoke-direct {p3, p1}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v0, Ll/ۘۛ᩷;

    invoke-virtual {p3, v0}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p3

    check-cast p3, Ll/ۘۛ᩷;

    .line 947
    invoke-virtual {p3}, Ll/ۘۛ᩷;->ܳ()Ll/ۚۡ֫;

    move-result-object p3

    invoke-virtual {p3}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩵ۨ᩷;

    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2, p3}, Ll/۠֫ۢ;->ۧ(Ll/۠֫ۢ;Ll/᩵ۨ᩷;)V

    .line 949
    :cond_0
    invoke-static {p2}, Ll/۠֫ۢ;->ᩴ(Ll/۠֫ۢ;)Ll/۫ۛ᩷;

    move-result-object p3

    if-nez p3, :cond_1

    .line 950
    new-instance p3, Ll/ۙܺ֫;

    invoke-direct {p3, p1}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class p1, Ll/۫ۛ᩷;

    invoke-virtual {p3, p1}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    check-cast p1, Ll/۫ۛ᩷;

    invoke-static {p2, p1}, Ll/۠֫ۢ;->֫(Ll/۠֫ۢ;Ll/۫ۛ᩷;)V

    :cond_1
    return-void
.end method

.method private ֫(Ljava/lang/String;)V
    .locals 2

    .line 1008
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-virtual {v0}, Ll/۠֫ۢ;->۠()Ljava/lang/String;

    move-result-object v1

    .line 1009
    invoke-static {v0}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Ll/᩵ۨ᩷;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "package-info"

    .line 1010
    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "type-info"

    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 1011
    :cond_1
    :goto_0
    iget-object p1, p0, Ll/֨֫ۢ;->֫:Ll/ܿۛ᩷;

    invoke-virtual {p1}, Ll/ܿۛ᩷;->ᩳ֫()Ll/ۘۛ᩷;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۘۛ᩷;->ۖ()V

    return-void
.end method


# virtual methods
.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 956
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-virtual {v0}, Ll/۠֫ۢ;->ܺ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Exception;)Ljava/lang/Exception;
    .locals 3

    .line 1017
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->ۚ(Ll/۠֫ۢ;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1018
    instance-of v1, p1, Ll/֫ۘܽ;

    if-eqz v1, :cond_0

    .line 1019
    new-instance v1, Ll/ۚ᩺᩷;

    invoke-virtual {v0}, Ll/۠֫ۢ;->۠()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Ll/֫ۘܽ;

    invoke-direct {v1, v0, p1}, Ll/ۚ᩺᩷;-><init>(Ljava/lang/String;Ll/֫ۘܽ;)V

    return-object v1

    :cond_0
    return-object p1

    .line 1023
    :cond_1
    iget-object v1, p0, Ll/֨֫ۢ;->֫:Ll/ܿۛ᩷;

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v1, p1, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1024
    instance-of v1, p1, Ll/֫ۘܽ;

    if-eqz v1, :cond_2

    .line 1025
    check-cast p1, Ll/֫ۘܽ;

    invoke-virtual {p1}, Ll/֫ۘܽ;->֫()Ll/ܽۘܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۘܽ;->ᩳ()I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_2

    .line 1027
    invoke-static {v0}, Ll/۠֫ۢ;->᩻(Ll/۠֫ۢ;)Ll/۫ۨᩳ;

    move-result-object v0

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ۘ(I)V

    :cond_2
    return-object v2
.end method

.method public final ֫()V
    .locals 6

    .line 961
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->ۚ(Ll/۠֫ۢ;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 962
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->᩻(Ll/۠֫ۢ;)Ll/۫ۨᩳ;

    move-result-object v0

    .line 963
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Ll/֨֫ۢ;->֫(Ljava/lang/String;)V

    .line 964
    iget-boolean v2, p0, Ll/֨֫ۢ;->ܽ:Z

    if-eqz v2, :cond_0

    .line 966
    iget-object v2, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v2}, Ll/۠֫ۢ;->ۤ(Ll/۠֫ۢ;)Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "changed"

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 967
    iget-object v1, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v1}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ۬᩷;->ᩳ()Ll/ۧ۫᩷;

    move-result-object v2

    invoke-static {v1, v2}, Ll/۠֫ۢ;->᩷(Ll/۠֫ۢ;Ll/ۧ۫᩷;)V

    .line 969
    iget-object v1, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-virtual {v1}, Ll/۠֫ۢ;->ᩳ()Ll/ᩴۛ᩷;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 971
    check-cast v1, Ll/ۡ֫ۢ;

    invoke-virtual {v1}, Ll/ۡ֫ۢ;->ۧ()V

    .line 972
    invoke-virtual {v1}, Ll/ۡ֫ۢ;->֫()V

    .line 976
    :cond_0
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܺܽ()V

    return-void

    .line 978
    :cond_1
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->ᩴ(Ll/۠֫ۢ;)Ll/۫ۛ᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ۛ᩷;->ܿ()V

    .line 979
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ۬᩷;->ᩳ()Ll/ۧ۫᩷;

    move-result-object v2

    invoke-static {v0, v2}, Ll/۠֫ۢ;->ۧ(Ll/۠֫ۢ;Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object v2

    .line 980
    invoke-virtual {v2}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object v0

    invoke-static {v0}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object v3

    const v0, 0x52638362

    .line 981
    invoke-static {v3, v0}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 982
    invoke-virtual {v3}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    .line 983
    invoke-static {v3, v0}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 985
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object v0

    iget-object v5, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-virtual {v5}, Ll/۠֫ۢ;->۠()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ll/᩵ۨ᩷;->ۜ(Ljava/lang/String;)I

    move-result v0

    if-ne v4, v0, :cond_2

    .line 986
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ۬᩷;->ᩳ()Ll/ۧ۫᩷;

    move-result-object v4

    invoke-static {v0, v4}, Ll/۠֫ۢ;->ܽ(Ll/۠֫ۢ;Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ۜۨᩳ;->ۧ(Ll/۬ۜܽ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/֨֫ۢ;->֫(Ljava/lang/String;)V

    goto :goto_0

    .line 988
    :cond_2
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object v0

    iget-object v4, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-virtual {v4}, Ll/۠֫ۢ;->۠()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/᩵ۨ᩷;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/֨֫ۢ;->֫(Ljava/lang/String;)V

    .line 990
    :goto_0
    iget-boolean v0, p0, Ll/֨֫ۢ;->ܽ:Z

    if-eqz v0, :cond_3

    .line 992
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->ۗ(Ll/۠֫ۢ;)Landroid/os/Bundle;

    move-result-object v0

    const-string v4, "changed"

    invoke-virtual {v0, v4, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 993
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ۬᩷;->ᩳ()Ll/ۧ۫᩷;

    move-result-object v1

    invoke-static {v0, v1}, Ll/۠֫ۢ;->ᩳ(Ll/۠֫ۢ;Ll/ۧ۫᩷;)V

    .line 995
    invoke-static {v3}, Ll/ۜۨᩳ;->֫(Ll/۬ۜܽ;)V

    .line 998
    iget-object v0, v3, Ll/۬ۜܽ;->᩸:[B

    iget-object v1, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {v1}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object v1

    iget-object v4, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-virtual {v4}, Ll/۠֫ۢ;->۠()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/᩵ۨ᩷;->ۜ(Ljava/lang/String;)I

    move-result v1

    const/4 v4, 0x4

    invoke-static {v4, v1, v0}, Ll/ܺܰۡ;->֫(II[B)V

    .line 1000
    iget-object v0, p0, Ll/֨֫ۢ;->ۧ:Ll/۠֫ۢ;

    monitor-enter v0

    .line 1001
    :try_start_0
    iget-object v1, v3, Ll/۬ۜܽ;->᩸:[B

    sget v3, Ll/ۘۤۡ;->֫:I

    .line 105
    array-length v3, v1

    invoke-static {v1, v3}, Ll/ۘۤۡ;->֫([BI)[B

    move-result-object v1

    .line 1001
    invoke-virtual {v2, v1}, Ll/ۧ۫᩷;->֫([B)V

    .line 1002
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_3
    return-void
.end method
