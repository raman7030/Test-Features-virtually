.class public final Ll/ۢۢ᩻;
.super Ljava/lang/Object;
.source "W79N"


# instance fields
.field public final ֫:Ljava/net/InetAddress;

.field public ۜ:I

.field public final ۧ:Ljava/util/LinkedHashMap;

.field public ܳ:Ll/ᩳۢ᩻;

.field public ܽ:Z

.field public final ܿ:Ljava/util/LinkedHashMap;

.field public ᩳ:Z

.field public final ᩷:Ljava/lang/String;

.field public ᩻:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/net/InetAddress;)V
    .locals 1

    .line 308
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 298
    iput-boolean v0, p0, Ll/ۢۢ᩻;->ᩳ:Z

    .line 302
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۢۢ᩻;->ۧ:Ljava/util/LinkedHashMap;

    .line 303
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۢۢ᩻;->ܿ:Ljava/util/LinkedHashMap;

    .line 309
    iput-object p1, p0, Ll/ۢۢ᩻;->᩷:Ljava/lang/String;

    .line 310
    iput-object p2, p0, Ll/ۢۢ᩻;->֫:Ljava/net/InetAddress;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢۢ᩻;)Ljava/net/InetAddress;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢ᩻;->֫:Ljava/net/InetAddress;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۢۢ᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۢۢ᩻;->ۜ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢۢ᩻;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۢۢ᩻;->᩻:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢۢ᩻;Ll/ᩳۢ᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۢۢ᩻;->ܳ:Ll/ᩳۢ᩻;

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۢۢ᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۢۢ᩻;->ۜ:I

    return p0
.end method

.method public static bridge synthetic ۡ(Ll/ۢۢ᩻;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/ۢۢ᩻;->ᩳ:Z

    return-void
.end method

.method public static bridge synthetic ۢ(Ll/ۢۢ᩻;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۢۢ᩻;->ܽ:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۢۢ᩻;)Ljava/util/LinkedHashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢ᩻;->ۧ:Ljava/util/LinkedHashMap;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۢۢ᩻;)Ll/ܳۢ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢ᩻;->ܳ:Ll/ᩳۢ᩻;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۢۢ᩻;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۢۢ᩻;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ۢۢ᩻;)Ljava/util/LinkedHashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢ᩻;->ܿ:Ljava/util/LinkedHashMap;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۢۢ᩻;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۢۢ᩻;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ۢۢ᩻;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢ᩻;->᩷:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ۢۢ᩻;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢ᩻;->᩻:Ljava/lang/Object;

    return-object p0
.end method
