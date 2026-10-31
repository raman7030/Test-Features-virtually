.class public final synthetic Ll/ܽ᩷ᩳ;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Ll/۟᩺֫;
.implements Ll/᩸ۜ᩵;
.implements Ll/᩶᩷ۧ;


# direct methods
.method public static bridge synthetic ֫(Landroid/system/StructTimespec;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Landroid/system/StructTimespec;->tv_nsec:J

    return-wide v0
.end method

.method public static bridge synthetic ֫(Ljava/lang/Object;)Landroid/media/AudioDeviceInfo;
    .locals 0

    .line 0
    check-cast p0, Landroid/media/AudioDeviceInfo;

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    .line 1
    invoke-static {p0}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-virtual {p2, p3, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ()Ljava/util/List;
    .locals 1

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    .line 1
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    sget v0, Ll/֫ۢᩳ;->ۗۧ:I

    .line 1249
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(Ll/᩸ۨ֫;Ll/ۧܳۧ;Ll/ܰ᩺֫;)Ll/ܿܰ֫;
    .locals 1

    .line 0
    new-instance v0, Ll/ᩴ᩺֫;

    invoke-direct {v0, p1, p2, p3}, Ll/ᩴ᩺֫;-><init>(Ll/᩸ۨ֫;Ll/ۧܳۧ;Ll/ܰ᩺֫;)V

    return-object v0
.end method

.method public ֫()Ll/᩶᩷ۧ;
    .locals 0

    return-object p0
.end method

.method public ֫(Ll/ۤۘۧ;)Ll/᩶᩷ۧ;
    .locals 0

    return-object p0
.end method

.method public ֫(Z)Ll/᩶᩷ۧ;
    .locals 0

    return-object p0
.end method

.method public ֫(Landroid/net/Uri;Ljava/util/Map;)[Ll/֨᩷ۧ;
    .locals 0

    .line 102
    invoke-virtual {p0}, Ll/ܽ᩷ᩳ;->ۧ()[Ll/֨᩷ۧ;

    move-result-object p1

    return-object p1
.end method

.method public ۧ()[Ll/֨᩷ۧ;
    .locals 7

    .line 417
    new-instance v6, Ll/ܺۚۧ;

    new-instance v4, Ll/ۢ֨֫;

    const-wide v0, 0x7fffffffffffffffL

    invoke-direct {v4, v0, v1}, Ll/ۢ֨֫;-><init>(J)V

    new-instance v5, Ll/᩷֡ۧ;

    const/16 v0, 0x18

    invoke-direct {v5, v0}, Ll/᩷֡ۧ;-><init>(I)V

    const/4 v1, 0x2

    const/4 v2, 0x1

    sget-object v3, Ll/ۜᩴۧ;->֫:Ll/ۜᩴۧ;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ܺۚۧ;-><init>(IILl/ۜᩴۧ;Ll/ۢ֨֫;Ll/᩷֡ۧ;)V

    const/4 v0, 0x1

    new-array v0, v0, [Ll/֨᩷ۧ;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    return-object v0
.end method
