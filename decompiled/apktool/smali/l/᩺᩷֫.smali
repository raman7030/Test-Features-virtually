.class public final Ll/᩺᩷֫;
.super Ljava/lang/Object;
.source "1AMS"


# static fields
.field public static ֫:Ll/ۨ᩷֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 43
    sget-object v0, Ll/ۨ᩷֫;->֫:Ll/ۨ᩷֫;

    sput-object v0, Ll/᩺᩷֫;->֫:Ll/ۨ᩷֫;

    return-void
.end method

.method public static ֫(Ll/ۡ᩻֫;)Ll/ۨ᩷֫;
    .locals 2

    :goto_0
    if-eqz p0, :cond_1

    .line 47
    invoke-virtual {p0}, Ll/ۡ᩻֫;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v0

    const-string v1, "declaringFragment.parentFragmentManager"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragment()Ll/ۡ᩻֫;

    move-result-object p0

    goto :goto_0

    .line 55
    :cond_1
    sget-object p0, Ll/᩺᩷֫;->֫:Ll/ۨ᩷֫;

    return-object p0
.end method

.method public static ֫(Ll/ۜۢ֫;)V
    .locals 1

    const/4 v0, 0x3

    .line 225
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    invoke-virtual {p0}, Ll/ۜۢ֫;->֫()Ll/ۡ᩻֫;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public static final ֫(Ll/ۡ᩻֫;Landroid/view/ViewGroup;)V
    .locals 3

    .line 83
    new-instance v0, Ll/ܰ᩷֫;

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to use <fragment> tag to add fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-direct {v0, p0, p1}, Ll/ۜۢ֫;-><init>(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 84
    invoke-static {v0}, Ll/᩺᩷֫;->֫(Ll/ۜۢ֫;)V

    .line 85
    invoke-static {p0}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;)Ll/ۨ᩷֫;

    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll/ۛ᩷֫;->ۛ:Ll/ۛ᩷֫;

    return-void
.end method

.method public static final ֫(Ll/ۡ᩻֫;Ljava/lang/String;)V
    .locals 3

    const-string v0, "fragment"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousFragmentId"

    .line 10
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    new-instance v0, Ll/ۤ᩷֫;

    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to reuse fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with previous ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {v0, p0, p1}, Ll/ۜۢ֫;-><init>(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 65
    invoke-static {v0}, Ll/᩺᩷֫;->֫(Ll/ۜۢ֫;)V

    .line 66
    invoke-static {p0}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;)Ll/ۨ᩷֫;

    move-result-object p0

    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll/ۛ᩷֫;->ۛ:Ll/ۛ᩷֫;

    return-void
.end method

.method public static final ֫(Ll/ۡ᩻֫;Ll/ۡ᩻֫;I)V
    .locals 3

    .line 151
    new-instance v0, Ll/ܿۢ֫;

    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to set target fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " with request code "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " for fragment "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {v0, p0, p1}, Ll/ۜۢ֫;-><init>(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 154
    invoke-static {v0}, Ll/᩺᩷֫;->֫(Ll/ۜۢ֫;)V

    .line 155
    invoke-static {p0}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;)Ll/ۨ᩷֫;

    move-result-object p0

    .line 156
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll/ۛ᩷֫;->ۛ:Ll/ۛ᩷֫;

    return-void
.end method

.method public static final ֫(Ll/ۡ᩻֫;Z)V
    .locals 3

    .line 131
    new-instance v0, Ll/ܳۢ֫;

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to set user visible hint to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " for fragment "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-direct {v0, p0, p1}, Ll/ۜۢ֫;-><init>(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 132
    invoke-static {v0}, Ll/᩺᩷֫;->֫(Ll/ۜۢ֫;)V

    .line 133
    invoke-static {p0}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;)Ll/ۨ᩷֫;

    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll/ۛ᩷֫;->ۛ:Ll/ۛ᩷֫;

    return-void
.end method

.method public static final ۧ(Ll/ۡ᩻֫;)V
    .locals 3

    .line 115
    new-instance v0, Ll/۟᩷֫;

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to get retain instance for fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ۜۢ֫;-><init>(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 116
    invoke-static {v0}, Ll/᩺᩷֫;->֫(Ll/ۜۢ֫;)V

    .line 117
    invoke-static {p0}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;)Ll/ۨ᩷֫;

    move-result-object p0

    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll/ۛ᩷֫;->ۛ:Ll/ۛ᩷֫;

    return-void
.end method

.method public static final ۧ(Ll/ۡ᩻֫;Landroid/view/ViewGroup;)V
    .locals 3

    const-string v0, "fragment"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    new-instance v0, Ll/᩷ۢ֫;

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to add fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " which is not a FragmentContainerView"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-direct {v0, p0, p1}, Ll/ۜۢ֫;-><init>(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 205
    invoke-static {v0}, Ll/᩺᩷֫;->֫(Ll/ۜۢ֫;)V

    .line 206
    invoke-static {p0}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;)Ll/ۨ᩷֫;

    move-result-object p0

    .line 207
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll/ۛ᩷֫;->ۛ:Ll/ۛ᩷֫;

    return-void
.end method

.method public static final ܽ(Ll/ۡ᩻֫;)V
    .locals 3

    .line 185
    new-instance v0, Ll/֫ۢ֫;

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to get target request code from fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ۜۢ֫;-><init>(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 186
    invoke-static {v0}, Ll/᩺᩷֫;->֫(Ll/ۜۢ֫;)V

    .line 187
    invoke-static {p0}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;)Ll/ۨ᩷֫;

    move-result-object p0

    .line 188
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll/ۛ᩷֫;->ۛ:Ll/ۛ᩷֫;

    return-void
.end method

.method public static final ܿ(Ll/ۡ᩻֫;)V
    .locals 3

    .line 99
    new-instance v0, Ll/ᩳۢ֫;

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to set retain instance for fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ۜۢ֫;-><init>(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 100
    invoke-static {v0}, Ll/᩺᩷֫;->֫(Ll/ۜۢ֫;)V

    .line 101
    invoke-static {p0}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;)Ll/ۨ᩷֫;

    move-result-object p0

    .line 102
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll/ۛ᩷֫;->ۛ:Ll/ۛ᩷֫;

    return-void
.end method

.method public static final ᩳ(Ll/ۡ᩻֫;)V
    .locals 3

    .line 169
    new-instance v0, Ll/ۧۢ֫;

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to get target fragment from fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ۜۢ֫;-><init>(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 170
    invoke-static {v0}, Ll/᩺᩷֫;->֫(Ll/ۜۢ֫;)V

    .line 171
    invoke-static {p0}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;)Ll/ۨ᩷֫;

    move-result-object p0

    .line 172
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll/ۛ᩷֫;->ۛ:Ll/ۛ᩷֫;

    return-void
.end method
