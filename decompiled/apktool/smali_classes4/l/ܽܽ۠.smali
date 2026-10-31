.class public enum Ll/ܽܽ۠;
.super Ljava/lang/Enum;
.source "A451"


# static fields
.field public static final enum ۗ:Ll/ܽܽ۠;

.field public static final enum ۙ:Ll/ܽܽ۠;

.field public static final enum ۬:Ll/ܽܽ۠;

.field public static final synthetic ᩶:[Ll/ܽܽ۠;


# instance fields
.field public final ᩸:Z

.field public final ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 4868
    new-instance v0, Ll/ܽܽ۠;

    const-string v1, "BASIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Ll/ܽܽ۠;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Ll/ܽܽ۠;->ۙ:Ll/ܽܽ۠;

    .line 4869
    new-instance v0, Ll/ܽܽ۠;

    const-string v1, "BOX"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3, v2}, Ll/ܽܽ۠;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Ll/ܽܽ۠;->ۗ:Ll/ܽܽ۠;

    .line 4870
    new-instance v0, Ll/ۧܽ۠;

    invoke-direct {v0}, Ll/ۧܽ۠;-><init>()V

    sput-object v0, Ll/ܽܽ۠;->۬:Ll/ܽܽ۠;

    .line 4867
    invoke-static {}, Ll/ܽܽ۠;->ܿ()[Ll/ܽܽ۠;

    move-result-object v0

    sput-object v0, Ll/ܽܽ۠;->᩶:[Ll/ܽܽ۠;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0

    .line 4913
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4914
    iput-boolean p3, p0, Ll/ܽܽ۠;->᩸:Z

    .line 4915
    iput-boolean p4, p0, Ll/ܽܽ۠;->᩹:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IZZI)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܽܽ۠;-><init>(Ljava/lang/String;IZZ)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܽܽ۠;
    .locals 1

    .line 4867
    const-class v0, Ll/ܽܽ۠;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܽܽ۠;

    return-object p0
.end method

.method public static values()[Ll/ܽܽ۠;
    .locals 1

    .line 4867
    sget-object v0, Ll/ܽܽ۠;->᩶:[Ll/ܽܽ۠;

    invoke-virtual {v0}, [Ll/ܽܽ۠;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܽܽ۠;

    return-object v0
.end method

.method public static synthetic ܿ()[Ll/ܽܽ۠;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/ܽܽ۠;

    .line 4867
    sget-object v1, Ll/ܽܽ۠;->ۙ:Ll/ܽܽ۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ܽܽ۠;->ۗ:Ll/ܽܽ۠;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ܽܽ۠;->۬:Ll/ܽܽ۠;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫(Ll/ۛ֡֨;Ll/ۛ֡֨;)Ll/ۛ֡֨;
    .locals 0

    return-object p2
.end method

.method public ֫()Z
    .locals 1

    .line 4919
    iget-boolean v0, p0, Ll/ܽܽ۠;->᩸:Z

    return v0
.end method

.method public ۧ()Z
    .locals 1

    .line 4923
    iget-boolean v0, p0, Ll/ܽܽ۠;->᩹:Z

    return v0
.end method
