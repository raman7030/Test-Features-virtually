.class public final enum Lbin/mt/plugin/api/ui/PluginButton$Style;
.super Ljava/lang/Enum;
.source "PluginButton.java"


# static fields
.field public static final synthetic $VALUES:[Lbin/mt/plugin/api/ui/PluginButton$Style;

.field public static final enum DEFAULT:Lbin/mt/plugin/api/ui/PluginButton$Style;

.field public static final enum FILLED:Lbin/mt/plugin/api/ui/PluginButton$Style;

.field public static final enum OUTLINED:Lbin/mt/plugin/api/ui/PluginButton$Style;


# direct methods
.method public static synthetic $values()[Lbin/mt/plugin/api/ui/PluginButton$Style;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lbin/mt/plugin/api/ui/PluginButton$Style;

    .line 20
    sget-object v1, Lbin/mt/plugin/api/ui/PluginButton$Style;->DEFAULT:Lbin/mt/plugin/api/ui/PluginButton$Style;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lbin/mt/plugin/api/ui/PluginButton$Style;->FILLED:Lbin/mt/plugin/api/ui/PluginButton$Style;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lbin/mt/plugin/api/ui/PluginButton$Style;->OUTLINED:Lbin/mt/plugin/api/ui/PluginButton$Style;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    .line 24
    new-instance v0, Lbin/mt/plugin/api/ui/PluginButton$Style;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbin/mt/plugin/api/ui/PluginButton$Style;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbin/mt/plugin/api/ui/PluginButton$Style;->DEFAULT:Lbin/mt/plugin/api/ui/PluginButton$Style;

    .line 29
    new-instance v0, Lbin/mt/plugin/api/ui/PluginButton$Style;

    const-string v1, "FILLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbin/mt/plugin/api/ui/PluginButton$Style;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbin/mt/plugin/api/ui/PluginButton$Style;->FILLED:Lbin/mt/plugin/api/ui/PluginButton$Style;

    .line 34
    new-instance v0, Lbin/mt/plugin/api/ui/PluginButton$Style;

    const-string v1, "OUTLINED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbin/mt/plugin/api/ui/PluginButton$Style;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbin/mt/plugin/api/ui/PluginButton$Style;->OUTLINED:Lbin/mt/plugin/api/ui/PluginButton$Style;

    .line 20
    invoke-static {}, Lbin/mt/plugin/api/ui/PluginButton$Style;->$values()[Lbin/mt/plugin/api/ui/PluginButton$Style;

    move-result-object v0

    sput-object v0, Lbin/mt/plugin/api/ui/PluginButton$Style;->$VALUES:[Lbin/mt/plugin/api/ui/PluginButton$Style;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginButton$Style;
    .locals 1

    .line 20
    const-class v0, Lbin/mt/plugin/api/ui/PluginButton$Style;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbin/mt/plugin/api/ui/PluginButton$Style;

    return-object p0
.end method

.method public static values()[Lbin/mt/plugin/api/ui/PluginButton$Style;
    .locals 1

    .line 20
    sget-object v0, Lbin/mt/plugin/api/ui/PluginButton$Style;->$VALUES:[Lbin/mt/plugin/api/ui/PluginButton$Style;

    invoke-virtual {v0}, [Lbin/mt/plugin/api/ui/PluginButton$Style;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbin/mt/plugin/api/ui/PluginButton$Style;

    return-object v0
.end method
