.class public final enum Lbin/mt/plugin/api/ui/PluginProgressBar$Style;
.super Ljava/lang/Enum;
.source "PluginProgressBar.java"


# static fields
.field public static final synthetic $VALUES:[Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

.field public static final enum CIRCULAR:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

.field public static final enum CIRCULAR_LARGE:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

.field public static final enum CIRCULAR_SMALL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

.field public static final enum HORIZONTAL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;


# direct methods
.method public static synthetic $values()[Lbin/mt/plugin/api/ui/PluginProgressBar$Style;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    .line 103
    sget-object v1, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->HORIZONTAL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->CIRCULAR:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->CIRCULAR_SMALL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->CIRCULAR_LARGE:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    .line 110
    new-instance v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    const-string v1, "HORIZONTAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->HORIZONTAL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    .line 118
    new-instance v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    const-string v1, "CIRCULAR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->CIRCULAR:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    .line 126
    new-instance v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    const-string v1, "CIRCULAR_SMALL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->CIRCULAR_SMALL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    .line 134
    new-instance v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    const-string v1, "CIRCULAR_LARGE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->CIRCULAR_LARGE:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    .line 103
    invoke-static {}, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->$values()[Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    move-result-object v0

    sput-object v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->$VALUES:[Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 103
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginProgressBar$Style;
    .locals 1

    .line 103
    const-class v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    return-object p0
.end method

.method public static values()[Lbin/mt/plugin/api/ui/PluginProgressBar$Style;
    .locals 1

    .line 103
    sget-object v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->$VALUES:[Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    invoke-virtual {v0}, [Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    return-object v0
.end method
